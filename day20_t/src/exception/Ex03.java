package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

// Exception 클래스의 서브클래스를 직접 작성하여 내가 규정하는 타입의 예외를 만들고 사용하기

class MyException extends Exception {	

	private static final long serialVersionUID = 1L;
	
	@Override
	public String toString() {
		return "범위를 벗어났습니다";
	}
}

public class Ex03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		while(true) {
			try {
				System.out.print("정수 입력 : ");
				num = sc.nextInt();
				if(0 <= num && num <= 100) {
					break;
				}
				MyException e = new MyException();
				throw e;				// 내가 만든 예외 객체를 던진다 (catch블록이 받을 수 있도록)
			} catch(MyException e) {	// catch에서는 try내부에서 던진(throw) 예외를 받아서 처리한다
				System.out.println(e);
				e.printStackTrace();
			} catch(InputMismatchException e) {
				System.out.println("정수를 입력해야 합니다");
				sc.nextLine();
			}
		}
		sc.close();
		System.out.println("입력받은 정수 : " + num);
		System.out.println("프로그램 종료");
	}
}
