package Quiz;

import java.util.Scanner;

public class Quiz1 {

	public static void main(String[] args) {
		// 이름과 나이를 입력받고
		// 나이를 이용하여 성인 여부를 문자열로 준비한 다음
		// 이름, 나이, 성인여부를 한 문장에 출력하는 코드를 작성하세요
		// 단. 성인은 20세 이상입니다
		// 1) 변수 선언 및 초기화
		// 문제에서 사용해야 할 값(결과를 결정하는데 요인이 되는 값 = 변수)
		// 요인이 되는 값이 어떤 것이 있는지 파악하고, 자료형에 맞춰서 변수를 선언

		// 2) 입력
		// 입력 받아야 하는 값을 순서대로 입력 받는다
		// 자료형에 따라 실행(호출)하는 함수가 서로 다르다(함수의 종류를 알아둬야 한다)

		// 3) 연산

		// 4)출력
		// 모든 값이 준비되어 있다면 서식을 준비하고 값을 출력한다

		// 5) 마무리

		// ctrl +shift +F : 코드 서식 맞추기

		int age;
		String name;
		Scanner sc = new Scanner(System.in);

		System.out.println("나이를 입력하세요");
		age = sc.nextInt();

		System.out.println("이름을 입력하세요");
		name = sc.next();

		if (age > 19) {
			System.out.printf("이름 %s 나이 %d 성인입니다 ", name, age);
		}
		
		System.out.println();
		sc.close();
	}

}
