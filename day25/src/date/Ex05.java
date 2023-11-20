package date;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import oracle.jdbc.driver.OracleDriver;

class EmployeesDTO {

	String first_name;
	Date hire_date;

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public Date getHire_date() {
		return hire_date;
	}

	public void setHire_date(Date hire_date) {
		this.hire_date = hire_date;
	}

}

public class Ex05 {
	public static void main(String[] args) throws Exception {

		// DTO에 저장할 수 있는 리스트 미리 생성
		ArrayList<EmployeesDTO> list = new ArrayList<>();

		// 1) 접속할 주소, 계정, 비밀번호 설정
		String url = "jdbc:oracle:thin:@192.168.1.100:1521:xe";
		String user = "hr";
		String password = "hr";

		// 2) 드라이버 불러오기
		Class.forName("oracle.jdbc.driver.OracleDriver"); 

		// 3) sql 준비
		String sql = "select first_name, hire_date from employees;"; 

		// 4) 연결(conn)

		Connection conn = DriverManager.getConnection(url,user,password);

		// 5) 상태 ( 실행준비, pstmt)

		PreparedStatement pstmt = conn.prepareStatement(sql);

		// 6) 결과 (pstmt.executeQuery())

		ResultSet rs = pstmt.executeQuery();

		// 7) while(rs.next())
		// 8) 불러온 값을 자바 객체에 저장(dto 혹은 hashmap)
		while (rs.next()) {
			EmployeesDTO dto = new EmployeesDTO();
			dto.setFirst_name(rs.getString("first_name"));
			dto.setHire_date(rs.getDate("hire_date"));

			// 9) 리스트에 하나씩 추가
			list.add(dto);
		}
		// 10) 반복문이 끝나면 리스트의 내용을 출력하기
		list.forEach(ob -> System.out.printf("%s : %s\n", ob.getFirst_name(), ob.getHire_date()));
		rs.close();
		pstmt.close();
		conn.close();
	}
}
