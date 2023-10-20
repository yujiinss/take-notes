package loop;

public class Ex03 {
	public static void main(String[] args) {
		int num = 0;
		
		while(num < 5) {			// 조건이 참인 동안 종속문장을 실행한다
			System.out.println(num);
			num++;
		}
		System.out.println();
		
		num = 0;
		while(true) {				// 조건은 항상 참이다. 무조건 반복문을 수행한다
			System.out.println(num);
			num++;
			if(num >= 5) {			// if의 조건이 참이면 break한다. 반복문을 중단하는 조건이다
				break;
			}
		}
		System.out.println();
		
		num = 0;
		while(true) {
			System.out.println(num);
			num++;
			if(num < 0) {	// 0에서 시작해서 1씩 증가하는 변수의 값이
				break;		// 0보다 작을 수 없기 때문에 절대 실행되지 않는 if문
			}				// 사실상 break가 없다
		}
		
		
		
		
	}
}
