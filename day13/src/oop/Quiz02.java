package oop;

/*
  편의점에서 성인/미성년자 여부에 따라 상품을 판매하려고 합니다
  손님 클래스 이름과 나이로 구성되어 있습니다
 */
class Customer {
	// 1)문자열 형태의 이름과 정수 형태의 나이를 저장할 수 있는 필드를 작성하세요
	String name;
	int age;

	// 2) 손님 객체는 반드시 이름과 나이를 지정
	// 생성자를 활용하여 매개변수로 이름과 나이를 저장
	Customer(String name, int age) { // 생성자
		this.name = name;
		this.age = age;
	}

	// 3) 손님의 간략한 정보를 확인하기 위한 void show() 함수를 작성하세요
	// printf를 이용하여 이름과 나이를 한 줄에 출력합니다
	void show() {
		System.out.printf("이름 %s ,나이 %d ", name, age);
		System.out.println();
	}

	// 4) 손님이 성인인지 아닌지 판별하기 위한 isAdult()를 작성합니다
	boolean isAdult() {
		boolean answer; // 지역변수
		answer = age >= 20; // age는 지역변수로 존재하지 않아서 멤버필드로 참조한다
		return answer; // 함수 영역 내에서 가까운 요소를 참조한다
	}

	// 7) 생성자를 추가로 작성하여(오버로딩), 이름만으로 객체를 생성할 수 있도록 한다
	// 이때 , 값을 초기화하지 않은 age의 값은 0이다
	Customer(String name) {
		this.name = name;
	}
}

public class Quiz02 {
	public static void main(String[] args) {

		// 5) 성인 2명, 미성년자 1명 총 3개의 손님 객체를 생성하세요
		Customer ob1 = new Customer("신유진", 26);
		Customer ob2 = new Customer("빵빵이", 18);
		Customer ob3 = new Customer("옥지얌", 25);
		Customer ob4 = new Customer("둘리");

		// 6) 손님 객체 3명을 배열로 묶은 다음
		// 반복문에 따라 손님의 성인 여부에 따라 판매 가능 / 불가능을 출력합니다
		Customer[] arr = { ob1, ob2, ob3, ob4 };
		for (int i = 0; i < arr.length; i++) {
			Customer member = arr[i];
			member.show();
			if (member.isAdult()) {
				System.out.println("상품 판매 가능");
			} else {
				System.out.println("상품 판매 불가능");
			}
			System.out.println();
		}
	}
}
