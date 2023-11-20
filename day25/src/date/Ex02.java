package date;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Ex02 {
public static void main(String[] args) throws ParseException {
	
	
	// java.sql.Date의 toString()은 yyyy-MM-dd 형식으로 출력하게 되어 있다
	// java.sql.Date의 생성자는 반드시 long값을 전달해야만 한다(기본 생성자 없음)
	java.sql.Date d1 = new java.sql.Date(0); // sql데이터는 무조건 0을 넣어줘야함
	System.out.println("d1 :"+ d1); // 1970년 1월 1일 기준 시가 출력된다
	
	// java.sql.Date는 java.util.Date의 서브클래스이다
	// 1) 오늘의 날짜를 가져올때는 util데이트를 사용 후 sql 데이터를 가져오는 방식으로 출력할 수 있다
	java.util.Date d2 = new java.util.Date();
	System.out.println("d2 : "+d2);
	
	java.sql.Date d3 = new java.sql.Date(d2.getTime());
	System.out.println("d3 :"+d3);
	
	// 2) java.text.SimpleDateFormat 을 이용하여 문자열 <-> 날짜 형식으로 활용할 수 도 있다
	// y : year, 연도
	// M : Month 월
	// d : date, 일
	// h : hours, 시   H : 24시간제
	// m : minutes, 분
	// s : seconds, 초
	// a : am/pm, 오전/오후
	
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");  // 출력해야 하는 문자열을 만들어주고
	java.util.Date d4 = sdf.parse("1993-05-16"); 				// 문자열을 util.Date로 변환
	System.out.println("d4 : "+d4);
	java.sql.Date d5 = new java.sql.Date(d4.getTime()); 		// d4에서 시간 얻어와 d5에 넣기 
	System.out.println("d5 :"+d5);
	
	SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy년 MM월 dd일 a hh시 mm분 ss초");
	String s1 = sdf2.format(d5);
	System.out.println("s1 :"+ s1);
	
	String s2 = sdf2.format(new java.util.Date());
	System.out.println("s2 :"+s2);
	
	SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); // H로 하면 24시간제로 출력
	String s3 = sdf2.format(d5); // 
	d4.setTime(d4.getTime()+(1000*60*60*14));
	String s4 = sdf3.format(d4);
	System.out.println(s3);
	System.out.println(s4);
	
}

}
