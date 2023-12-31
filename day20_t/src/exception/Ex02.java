package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {	
		// java.lang.Exception : 모든 예외 클래스의 최상위 클래스
		
		Scanner sc = new Scanner(System.in);
		int num = 0;	// try ~ catch 에서 값을 모두 지정해도 초기화되지 않은것으로 간주함
		
		try {	// 예외 발생 가능성이 있는 코드를 작성하는 구간
			System.out.print("정수 입력 : ");
			num = sc.nextInt();
			
		} catch(InputMismatchException e) {	// 지정한 타입의 예외가 발생하면 이어서 실행되는 구간
			System.out.println("정수를 입력해야 합니다");
//			System.out.println(e.toString()); 	// 예외 형태만 확인하고 싶을 때
//			System.out.println(e.getMessage());
//			e.printStackTrace(); 	// 전체 예외 호출 스택을 확인하고 싶을때 (기본형식)
			
		} finally {	// 예외 발생 여부에 상관없이 항상 실행되는 구간 (프로그램 마무리 코드가 주로 작성된다)
			System.out.println("num : " + num);
			sc.close();
			System.out.println("프로그램 종료");
		}
		
	}
}
