package control;

public class Ex04 {
	public static void main(String[] args) {
		
		// 1) 최소값 찾아내기
		int n1 = 20, n2 = 10, n3 = 3;
		
		int min = n1;
		if(min > n2) 	min = n2;
		if(min > n3) 	min = n3;
		
		System.out.println("최소값 : " + min);
		System.out.println();
		
		// 2) 절대값 구하기
		int num = -5, abso;
		
		if(num < 0)		abso = -num;
		else			abso = num;
		
		System.out.printf("%d의 절대값은 %d\n\n", num, abso);
	}
}
