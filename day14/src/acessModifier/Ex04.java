package acessModifier;

import java.util.Scanner;

public class Ex04 {
	// human 타입의 객체를 저장할 수 있는 배열을 준비
	// while과 switch~case를 이용ㅎ여 메뉴를 선택하는 형식
	// 메뉴 선택에 따라 입력과 출력을 수행하는 프로그램
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Human[] arr = new Human[5];
		//Human객체를 담을 수 있는 빈칸이 연속으로 5칸 준비되어 있다
		int menu;
		String name;
		int age;
		boolean hasNull = false;//빈칸이 하나라도 있으면 true로 바꿀거다

		while (true) {
			System.out.println("1.입력");
			System.out.println("2.출력");
			System.out.println("0.종료");
			System.out.println("선택>>>");
			menu = Integer.parseInt(sc.nextLine());
			switch (menu) {
			case 1: // 빈칸을 찾아서 빈칸에 데이터를 입력하고 반복탈출
					// 만약 모든 칸이 채워져서 빈칸이 없으면 메시지 출력
				//0) 빈칸이 하나라도 있는지 없는지 체크해야 한다
				hasNull =false;
				
				//1) 여러칸 중에 빈칸인 곳을 하나 찾아서
				for (int i = 0; i < arr.length; i++) {
					if (arr[i] == null) {
						hasNull = true;
						// 2) 객체를 구성할 값을 사용자로부터 입력받고
						System.out.println("나이를 입력하세요");
						age = Integer.parseInt(sc.nextLine());
						System.out.println("이름을 입력하세요");
						name = sc.nextLine();
						//3) 빈칸에 객체를 생성한 다음 값을 넣어준다(setter)
						arr[i] = new Human();
						arr[i].setAge(age);
						arr[i].setName(name);
						break;
					}
				}
				if(hasNull==false) {
					System.out.println("===빈칸이 없습니다===");
				} break;
			case 2: // 빈칸을 제외한 모든 데이터를 화면에 출력
					// 모든 칸이 비워져있으면 아무것도 출력하지 않는다
				for (int i = 0; i < arr.length; i++) {
					if (arr[i] != null) {
						System.out.println(arr[i].getAge() + arr[i].getName());
						
					}
				}break;
			case 0:
				sc.close();
				return;
			default:
				System.out.println("잘못 선택하셨습니다");
			}
			System.out.println();

		} // end of while
	}// end of main
}// end of class
