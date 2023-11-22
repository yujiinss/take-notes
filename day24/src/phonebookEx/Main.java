package phonebookEx;

import java.util.List;
import java.util.Scanner;

public class Main {
	 //사용자한테 입력 값을 받는다
	static PhonebookDTO getDTOFromUserInput(Scanner sc) {
		PhonebookDTO dto = new PhonebookDTO();
		
		System.out.print("이름 입력 : ");
		dto.setName(sc.nextLine());	// dto.name = sc.nextLine();
		
		System.out.print("전화번호 입력 : ");
		dto.setPnum(sc.nextLine());
		
		System.out.print("나이 입력 : ");
		dto.setAge(Integer.parseInt(sc.nextLine())); // 형식 같게 해줘야해서
		
		System.out.print("즐겨찾기 (Y/N) : ");
		dto.setFavorite(sc.nextLine());
		
		System.out.println("아이디를 입력 : ");
		dto.setIdx(sc.nextInt());
		
		return dto;
	}
	
	 // Handler함수를 호출한다
	public static void main(String[] args) throws Exception {
		
		Handler handler = new Handler(); // Handler함수를 불어오면 담을 객체를 생성
		Scanner sc = new Scanner(System.in);
		List<PhonebookDTO> list = null; // 값을 받아와서 담는 list
		PhonebookDTO ob = null;
		int menu = -1, row; 
		String name, pnum;
		int idx = 0;
	
		while(menu != 0) {
			System.out.println("메뉴 출력");
			System.out.println("1. 전체 목록");
			System.out.println("2. 추가");
			System.out.println("3. 전화번호 수정");
			System.out.println("4. 즐겨찾기 수정");
			System.out.println("5. 삭제");
			System.out.println("0. 종료");
			System.out.print("입력 >>> ");
			menu = Integer.parseInt(sc.nextLine());
			
			// Handelr 함수 호출
			switch(menu) {
			
			// 전체 목록
				case 1:
					list = handler.selectList();		// 리스트를 받아와서
					list.forEach(System.out::println);	// 출력한다
					break;
					
			// 추가하기
				case 2:
					ob = getDTOFromUserInput(sc); // 추가할 것을 담을 ob 생성
					row = handler.insertPhonebook(ob); //Handler의 함수를 불러와 row에 대입하고
					System.out.println(row != 0 ? "추가 성공" : "추가 실패");
					break;
					
				case 3: // 번호 수정
					
					System.out.println("수정할 idx를 입력하세요");
					idx =  Integer.parseInt(sc.nextLine());
					System.out.println("전화번호를 수정합니다");
					System.out.print("변경할 전화번호 입력 : ");
					pnum = sc.nextLine();
					
					row = handler.updatePnum(idx, pnum);
					System.out.println(row != 0 ? "수정 성공" : "수정 실패");
					break;
					
				case 4: // 즐겨찾기
					
					System.out.println("즐겨찾기 등록 및 해제");
					System.out.print("즐겨찾기 상태를 변경할 사람의 idx 입력 : ");
					idx =  Integer.parseInt(sc.nextLine());
					row = handler.updateFavorite(idx);
					System.out.println(row != 0 ? "수정 성공" : "수정 실패");
					break;
					
				case 5: // 삭제하기
					System.out.print("삭제할 사람의 번호 입력 : "); 
					idx = Integer.parseInt(sc.nextLine());
					row = handler.delete(idx);
					System.out.println(row != 0 ? "삭제 성공" : "삭제 실패");
					break;
					
				case 0:
					break;
			}
			System.out.println();
		} // end of while
		
		sc.close();
		System.out.println("프로그램을 종료합니다");
	}
}
