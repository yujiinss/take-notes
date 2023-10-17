package Quiz01;

import java.util.Scanner;

public class Quiz02 {
	public static void main(String[] args) {
		// 중첩된 if 사용하여 문제를 풀어주세요

		// 2의 배수 혹은 3의 배수 혹은 6의 배수를 각각 구분하여 출력하세요
		// 정수를 하나 출력받고, 위 3개 중 해당되는 하나만 출력하면됩니다
		// 6의 배수를 입력받으면 2와 3의 배수에 모두 해당되지만 6의 배수만 출력해야 합니다
		
		// 서로 다른 조건을 체크할 경우, 먼저 체크해야 할 조건이 있다

		int num;
		Scanner sc = new Scanner(System.in);

		System.out.println("정수를 하나 입력하시오");
		num = sc.nextInt();
		
		if (num % 6 == 0) {
				System.out.println("6의 배수" + num);
		}else if (num % 2 == 0 ) {
			System.out.println("2의 배수" + num);
		} else if (num % 3 == 0 ) {
			System.out.println("3의 배수" + num);
		}
		}
		
	
	}


