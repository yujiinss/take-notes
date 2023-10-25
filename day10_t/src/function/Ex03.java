package function;

public class Ex03 {
	// 두 정수 중에서 가장 큰 수 반환하기
	static int getMaxNum(int n1, int n2) {
		return n1 > n2 ? n1 : n2;
	}
	
	// 세 정수 중에서 가장 큰 수 반환하기
	static int getMaxNum(int n1, int n2, int n3) {
		int result = 0;

		if(result < n1)			result = n1;		
		if(result < n2) 		result = n2;
		if(result < n3) 		result = n3;
		
		return result;
	}
	
	// n개의 정수중에서 가장 큰 값을 반환하기
	static int getMaxNum(int... arr) {	// 같은 자료형의 여러 매개변수 개수가 일정하지 않을때
										// 가변인자 : 인자의 개수가 일정하지 않다
		int result = 0;
//		for(int i = 0; i < arr.length; i++) {	// 매개변수들을 순서대로 조회하면서
//			int num = arr[i];					// 각 숫자를 num이라고 할 때
//			if(result < num) 					// 기존 최대값보다 더 큰 값이 있으면		
//				result = num;					// 그 값을 최대값에 담는다
//		}
		for(int num : arr) {
			if(result < num) 
				result = num;
		}
		return result;
	}
	
	public static void main(String[] args) {
		int num1 = getMaxNum(10, 20);
		int num2 = getMaxNum(100, 200, 300);
		int num3 = getMaxNum(1, 2, 3, 4, 5, 60, 700, -8, 99);
		
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		System.out.println("num3 : " + num3);
	}
}
