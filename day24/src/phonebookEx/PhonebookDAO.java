package phonebookEx;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

//  DAO에서는 쿼리문 실행
public class PhonebookDAO {

	// Connection PreparedStatement Resultset 필드 멤버
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;

	// 문자열 형태의 url, user, password를 필드멤버로 준비한다
	private String url = "jdbc:oracle:thin:@192.168.1.100:1521:xe";
	private String user = "c##itbank";
	private String password = "it";

	private Connection getConnection() throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn = DriverManager.getConnection(url, user, password);
		return conn;
	}

	// 전체 목록 불러오기
	public List<PhonebookDTO> selectList() throws Exception {

		ArrayList<PhonebookDTO> list = new ArrayList<>(); // 반환값 준비
		String sql = "select * from phonebook order by favorite desc, name"; // 실행할 쿼리문 준비

		conn = getConnection();
		pstmt = conn.prepareStatement(sql);// 쿼리문을 탑재하여 실행 준비
		rs = pstmt.executeQuery(); // 실행해서 rs에 결과를 저장

		while (rs.next()) { // 실행한 쿼리문 한 줄씩 처리하기 위해 (반복문)
			PhonebookDTO dto = new PhonebookDTO();
			dto.setAge(rs.getInt("age"));
			dto.setFavorite(rs.getString("favorite"));
			dto.setName(rs.getString("name"));
			dto.setPnum(rs.getString("pnum"));
			dto.setIdx(rs.getInt("idx"));
			list.add(dto); // dto의 값을 list에 대입
		}

		rs.close();
		pstmt.close();
		conn.close();
		return list;
	}

	// 2) 추가하기
	public int insert(PhonebookDTO ob) throws SQLException {
		int row = 0;
		String sql = "insert into phonebook values (?, ?, ?, ?)";
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, ob.getName());
		pstmt.setString(2, ob.getPnum());
		pstmt.setInt(3, ob.getAge());
		pstmt.setString(4, ob.getFavorite());
		row = pstmt.executeUpdate();

		rs.close(); // 통로 개설의 역순으로 닫아준다
		pstmt.close();
		conn.close();
		return row;
	}

	//3) 번호 수정하기
	public int updatePnum(PhonebookDTO ob) throws Exception {
		conn = getConnection();
		String sql = "update phonebook set pnum = ? where idx = ?";
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, ob.getPnum());
		pstmt.setInt(2, ob.getIdx());
		int row = pstmt.executeUpdate();

		rs.close(); // 통로 개설의 역순으로 닫아준다
		pstmt.close();
		conn.close();

		return row;
	}
	// 4) 즐겨찾기 
	public int updateFavorite(int idx) throws Exception {
		conn = getConnection();
		String sql = "update phonebook set favorite = decode(favorite, 'Y', 'N', 'N', 'Y') "
				+ "		where idx = ?";
		pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, idx);
		int row = pstmt.executeUpdate();
		rs.close(); // 통로 개설의 역순으로 닫아준다
		pstmt.close();
		conn.close();
		return row;
	}

	// 5) 삭제하기
	public int delete(int idx) throws Exception {

		int row = 0;
		conn = getConnection();
		String sql = "delete from phonebook where idx = ?";
		pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, idx);
		row = pstmt.executeUpdate();
		rs.close(); // 통로 개설의 역순으로 닫아준다
		pstmt.close();
		conn.close();

		return row;
	}

}
