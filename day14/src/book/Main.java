package book;

import java.util.Scanner;

//사용자와 상호작용(입출력)
//입력값에 따라서 handler함수 호출

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Book[] arr = new Book[10];
		Handler handler = new Handler();
		String name;
		int num;
		int menu;
		int row;

		while (true) {
			System.out.println("1. 책 이름");
			System.out.println("2. 책 번호");
			System.out.println("선택 >>>>");
			menu = sc.nextInt();

			switch (menu) {

			case 1:
				System.out.println("책 이름을 입력하세요");
				name = sc.nextLine();
				row = handler.Bookname(name);

			case 2:
				System.out.println("책 번호를 입력하세요");
				num = sc.nextInt();
				
				

			}

		}
	}

}
