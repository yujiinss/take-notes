package oop;

class Circle{
	double radius;
	double area;
	double pi=3.14; //필드에 초기값을 지정해두면, 생성자로 덮어쓰지 않는 한
					// 모든 객체가 동일한 값으로 지니게 된다
	
	// 반지름 radius를 전달받아 저장하고,
	// 원의 넓이를 구하는 코드를 혹은 실수형태로 전달받을 수 있도록 처리하세요
	// 원의 반지름과 넓이를 각각 출력하는 함수 show()를 정의하세요
	// 생성자 2 함수 1
	
	Circle(int radius){
		this.radius = radius;
		area =this.radius*this.radius*pi;//지역변수 매개변수부터 참조 시도
										// this가 붙거나 같은 이름이 없으면 멤버필드를 참조
		
	}
	
	//생성자를 오버로딩하여 정수, 혹은 실수 형태로 전달받을 수 있도로 처리하세요
	Circle(double radius){
		this.radius = radius;
		area =radius*radius*pi;
		
	}
	
	void show() {
		System.out.println("원의 반지름 :"+ radius);
		System.out.printf("원의 넓이 : %.2f\n", area);
	}
}

public class Quix01 {

	public static void main(String[] args) {
		Circle bo1 = new Circle(2);
		Circle bo2 = new Circle(3.2);
		bo1.show();
		bo2.show();
		
	}
}
