package acessModifier;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {

		Human[] arr = new Human[5];
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < arr.length; i++) {
			// arr[i]는 처음에 빈칸(null)이기 때문에 객체 먼저 만들어야 한다
			if (i % 2 == 0) {

				arr[i] = new Human();

				// 이름과 나이를 변수에 입력받고, 입력받은 값을 setter를 활용하여 객체에 넣는다
				System.out.println("이름 입력: ");
				String name = sc.next();
				System.out.println("나이 입력: ");
				int age = sc.nextInt();
				arr[i].setAge(age); // setter
				arr[i].setName(name);// setter
			}
		}
		System.out.println("===입력 완료===");
		System.out.println("===출력 시작===");

		// 배열의 내용을 출력하기
		for (int i = 0; i < arr.length; i++) { // getter getter
			if (arr[i] != null) { // i번째 칸이 빈칸이 아니면
									// arr에는 human타입의 데이터만 들어갈 수 있으므로
									// 빈칸이 아니면, human 타입의 객체가 있다는 이야기다
				System.out.printf("%s : %d살\n", arr[i].getName(), arr[i].getAge());
			}
		}
		System.out.println("===출력 완료===");
		sc.close();
	}

}
