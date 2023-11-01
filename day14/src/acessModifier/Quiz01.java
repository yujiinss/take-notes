package acessModifier;

import java.util.Scanner;

public class Quiz01 {
	// Human 클래스를 이용하여 비어 있는 상태의 객체를 하나 생성하세요
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	Human ob =new Human(); // 새로운 객체를 생성하고, ob가 그 객체를 가리키도록 한다
	
	// 본인의  이름과 나이를 키보드로 입력하여 그 값을 ob에 저장하고
	//한줄 출력을 하세요
	System.out.println("이름을 입력하세요 :");
	ob.setName(sc.next());
	
	System.out.println("나이를 입력하세요 :");
	ob.setAge(sc.nextInt());
	
	System.out.println(ob.getName() + ob.getAge());
	sc.close();
	
	}
}
