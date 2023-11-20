package schedule;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Ex04 {
	public static void main(String[] args) throws Exception {
		
		String sql = "select sysdate from dual";
		String url = "jdbc:oracle:thin:@192.168.1.100:1521:xe";
		Class.forName("oracle.jdbc.driver.OracleDriver");
			
		Connection conn = DriverManager.getConnection(url, "c##itbank","it");
		PreparedStatement pstmt = conn.prepareStatement(sql);
		ResultSet rs = pstmt.executeQuery();

		String sysdate1 = null;
		Date sysdate2=null;
		
		while(rs.next()) {
			sysdate1 = rs.getString("sysdate");
			sysdate2 = rs.getDate ("sysdate"); // 데이터베이스에는 시간 정보가 있지만, 데이트타입으로 바꾸면서 시간이 출력이 안된다.
		}
		System.out.println("sysdate1 :"+ sysdate1);
		System.out.println("sysdate2 :"+ sysdate2);
		rs.close();
		pstmt.close();
		conn.close();
	}

}
