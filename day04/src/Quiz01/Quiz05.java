package Quiz01;

import java.util.Random;
import java.util.Scanner;

public class Quiz05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int location;
		Random ran = new Random();
		int eleA, eleB, eleC;
	

		eleA = ran.nextInt(15) + 1;
		eleB = ran.nextInt(15) + 1;
		eleC = ran.nextInt(15) + 1;

		System.out.printf("%d, %d, %d\n", eleA, eleB, eleC);

		// 현재 자신의 위치를 1~5 사이로 입력한 다음
		// 가장 가까운 엘리베이터가 몇번째인지 출력하는 코드를 작성하세요
		// (가장 가깝다 = 거리값이 최소이다=차이는 절대값이 최소값이다)

		System.out.println("자신이 위치한 층은? :");
		location = sc.nextInt();
		
		int A = location - eleA;
		int B = location - eleB;
		int C = location - eleC;
	

		if (A < 0) {
			A = -A; //A *= -1;
		} else {
			A = A;
		}
		if (B < 0) {
			B = -B;
		} else {
			B = B; 
		}
		if (C < 0) {
			C = -C;
		} else {
			C = C;
		}

		if(A<B && A<C) {
			System.out.println("가장 가까운 엘리베이터는 A이다");
		}
		else if(B<A && B<C) {
			System.out.println("가장 가까운 엘리베이터는 B이다");
		}
		else if(C<A && C<B) {
			System.out.println("가장 가까운 엘리베이터는 C이다");
		}
	}

}
