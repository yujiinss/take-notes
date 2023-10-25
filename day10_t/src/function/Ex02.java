package function;

public class Ex02 {
	
	static int add(int n1, int n2) {
		return n1 + n2;
	}
	
	static int getMinNumber(int n1, int n2, int n3) {
		int min = 999999999;	// 최소값을 담기 위한 변수
		if(n1 < min) {			// 매개변수를 순서대로 하나씩 확인하면서
			min = n1;			// 최소값보다 더 작은 값이 있으면 최소값에 담는다
		}
		if(n2 < min) {
			min = n2;
		}
		if(n3 < min) {
			min = n3;
		}
		return min;		// 마지막에 결정된 최소값을 반환
	}
	
	static String upperCase(String str) {
		String answer = "";
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if(i == 0 && 'a' <= ch && ch <= 'z') {
				ch -= 32;	// 첫글자가 소문자이면 대문자로 바꿔라
			}
			answer += ch;	// i번째 글자(ch)를 answer에 순서대로 더한다
		}
		return answer;
	}
	
	static String substring(String word, int from, int to) {
		String answer = "";
		for(int i = from; i < to; i++) {	// 7, 12 (7, 8, 9, 10, 11)
			answer += word.charAt(i);
		}
		return answer;
	}
	
	public static void main(String[] args) {
		// 1) 두 정수의 덧셈을 반환하는 함수 add를 작성하세요
		int q1 = add(10, 20);
		System.out.println("q1 : " + q1);
		
		// 2) 세 정수를 전달받아서 가장 작은 수를 반환하는 함수 getMinNumber를 작성하세요
		int q2 = getMinNumber(150, 23, 90);
		System.out.println("q2 : " + q2);
		
		// 3) 문자열 하나를 전달받아서, 첫글자를 대문자로 변환하는 함수 upperCase를 작성하세요
		String q3 = upperCase("hello");
		System.out.println("q3 : " + q3); 	// Hello
		
		String t3 = upperCase("3 years later");
		System.out.println("t3 : " + t3); 	// 3 years later
		
		// 4) 문자열 하나와 정수 두개를 전달받아서
		// 문자열의 from번째 글자부터 to글자 이전까지의 글자를 잘라낸
		// 새로운 문자열을 반환하는 함수 substring을 작성하세요
		String q4 = substring("Hello, world !!", 0, 5);
		System.out.println("q4 : " + q4); 	// Hello
		
		String t4 = substring("Hello, world !!", 7, 12);
		System.out.println("t4 : " + t4); 	// world
	}
}

















