package schedule;

import java.lang.module.ModuleDescriptor.Version;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ScheduleDAO extends ScheduleDTO {

	private String url = "jdbc:oracle:thin:@192.168.1.100:1521:xe";
	private String user = "c##itbank";
	private String password = "it";

	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;

	private Connection getConnection() {
		Connection conn = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, user, password);
		} catch (Exception e) {
			System.out.println("연결 문제 발생 :" + e);
		}
		return conn;
	}

	private void close() {
		try {
			if (rs != null)
				rs.close();
			if (pstmt != null)
				pstmt.close();
			if (conn != null)
				conn.close();
		} catch (Exception e) {
		}

	}

	public List<ScheduleDTO> selectAll() {
		ArrayList<ScheduleDTO> list = new ArrayList<>();
		String sql = "select * from schedule order by start_date asc";
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);

			rs = pstmt.executeQuery(); // 실행해서 rs에 결과를 저장

			while (rs.next()) {
				ScheduleDTO dto = new ScheduleDTO();
				dto.setTitle(rs.getString("title"));
				dto.setStart_date(rs.getDate("start_date"));
				dto.setEnd_date(rs.getDate("end_date"));
				list.add(dto);
			}
		} catch (SQLException e) {
			e.printStackTrace();

		}finally {close();}
		return list;

	}

	public String dbVersion() {
		String rw = null; // 첫 줄에 반환형의 변수를 만들어두고(초기화 필요함)
		
		//DB에 접속해서 실행할 쿼리문
		String sql = "select banner from v$version ";
		
		try {
			conn = getConnection(); // 연결
			pstmt = conn.prepareStatement(sql); //pstmt에 sql적재
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				rw = rs.getString("banner");
			}
	
		}catch (SQLException e) {
			e.printStackTrace();

		}finally {close();}
		return rw ;

	}

	public Date getSysdate() {
		Date row = null;
		
		//sql문 쓰기
		String sql ="select sysdate from dual";
		try {
			conn = getConnection(); // 연결
			pstmt = conn.prepareStatement(sql); //pstmt에 sql적재
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				row = rs.getDate("sysdate");
			}
			
		}catch (SQLException e) {
			e.printStackTrace();
		}finally {close();}
		
		return row;
	}

}
