package Quiz01;

import java.util.Scanner;

public class Quiz03 {
	public static void main(String[] args) {
		// 서로 다른 세 정수를 입력 받은 다음 가장 큰 수를 하나 출력하세요

		int n1;
		int n2;
		int n3;
		Scanner sc = new Scanner(System.in);

		System.out.println("서로 다른 세 정수를 입력하세요");
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		n3 = sc.nextInt();
		
		// 이렇게 풀이하면 n이 커질수록 비교해야 할 것이 많아짐
		// if(true)  max = n1;
		// if(max<n2) max = n2;
		// if(max<n3) max = n3;

		if (n1 > n2 && n1 > n3) {
			System.out.println("가장 큰 수: " + n1);
		} else if (n2 > n1 && n2 > n3) {
			System.out.println("가장 큰 수: " + n2);
		} else if (n3 > n1 && n3 > n2) {
			System.out.println("가장 큰 수 :" + n3);
		}
		sc.close();
	}
}
