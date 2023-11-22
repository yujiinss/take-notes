package schedule;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	static SimpleDateFormat inputFormatter = new SimpleDateFormat("yyyy-MM-dd");
	static SimpleDateFormat outputFormatter = new SimpleDateFormat("yyyy년 MM월 dd일");
	
	// 사용자한테 입력값을 받는다
	public static void addSchedule(Scanner sc) throws Exception {
		
		ScheduleDTO dto = new ScheduleDTO();// 객체를 만듦
		System.out.println("일정명을 입력하세요");
		dto.setTitle(sc.nextLine());
		
		System.out.println("일정 날짜를 입력하세요");
		String s1 = sc.nextLine();
		
		Date d1 = inputFormatter.parse(s1);
		
		java.sql.Date d2 = new java.sql.Date(d1.getTime());
		
		dto.setStart_date(d2);
		
		// 문자열 -> (sdf) -> util.Date -> sql.Date
		
		
		
	}
	




public static void main(String[] args)  {
	Handler handler = new Handler();
	Scanner sc = new Scanner(System.in);
	
	Date date = null; //java.util.Date는 java.sql.Date의 슈퍼클래스이다
	
	int menu =-1;
	
	
	while(menu !=0) {
		
		System.out.println("===DB기준 현재 시간===");
		System.out.println("11");	
		System.out.println("==================");
		System.out.println("123. db 버전 정보 출력");
		System.out.println("1. 전체 출력");
		System.out.println("2. 월별 검색");
		System.out.println("3. 일정 등록");
		System.out.println("4. 일정 삭제");
		System.out.println("0. 종료");
		System.out.println("1. 선택>>>");
		menu = Integer.parseInt(sc.nextLine());
		List<ScheduleDTO> list= null;
		
		Date row;
		String rw;
			
		//Handler함수 호출
		switch(menu) {
		case 11: 
			row = handler.getSysdate();
			System.out.println(row);
			break;
		
		case 123:
			//오라클 데이터베이스 버전 정보를 문자열로 출력하기
			// select bannar from v$version
			rw = handler.dbVersion(); // 버전을 문자열로 불러와서 출력
			System.out.println("출력합니다");
			System.out.println(rw);
			break;
			
			// 1) 전체 출력
		case 1:
			list = handler.selectAll();
			for(ScheduleDTO ob : list) {
				System.out.printf("%s : %s~%s\n",
						ob.getTitle(),ob.getStart_date(),ob.getStart_date());	
			}	
			break;
			
			
			//2) 월별 검색
		case 2:
			break;
			
			
			//3) 일정 등록
		case 3:
			ob = addSchedule(sc); // 추가할 것을 담을 ob 생성
			row = handler.insertPhonebook(ob); //Handler의 함수를 불러와 row에 대입하고
			System.out.println(row != 0 ? "추가 성공" : "추가 실패");
			break;
			
			
			//4) 일정 삭제
		case 4:
			break;
			
			
			// 5)종료
		case 0:
			break;
		}
	}
}


}
