package Quiz01;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		// 두 정수를 입력받아 더 큰 수를 화면에 출력하세요

		int num1;
		int num2;
		Scanner sc = new Scanner(System.in);

		num1 = sc.nextInt();
		num2 = sc.nextInt();

		if (num1 > num2) {
			System.out.println(num1);
		} else if (num1 == num2) {
			System.out.println("같은 수입니다");
		} else {
			System.out.println(num2);
		}
		sc.close();
	}
}

