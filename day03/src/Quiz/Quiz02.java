package Quiz;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
// 친구와 고기집에 갔다
		// 이 식당에서는 첫 주문에 최소 3인분을 주문해야하고
		// 이후에는 1인분씩 추가가 가능하다
		// 돼지고기 삼겹살 1인분이 8500원이고
		// 소주 1병 4500원, 맥주 1병에 5000을 고정으로 주문했다
		// 추가 주문한 삼겹살 양을 입력받아서
		// 총 결제해야 할 금액을 계산하고
		// 더치페이로 1인당 얼마를 내야 하는지 계산하여 출력하는 프로그램을 작성하세요(2명)
		
		int meat = 8500;
		int soju = 4500;
		int bear = 5000;
		int plus;
		Scanner sc = new Scanner(System.in);
		sc.close();
		
		System.out.println("추가 주문한 삼겹살의 양은?");
		plus = sc.nextInt();
		
		System.out.printf("1인당 내야 하는 금액은? %d 원입니다 ", ((meat*(3+plus))+(soju+bear))/2);
		
	}

}
