package string;

public class Quiz03 {

	public static void main(String[] args) {
		
		/*
		
		 16자리의 카드번호를 문자열로 입력받아서
		 카드번호의 오른쪽끝에서 부터 세서
		 홀수번째는 그대로 두고
		 짝수번째는 2를 곱한다
		 만약 2를 곱한 숫자가 두자리수이면
		 각 자리수를 더해서 한 자리 수로 만든다
		 이렇게 만들어진 16개의 한 자리 숫자를 모두 더하여
		 그 합이 10으로 나누어 떨어지면 유효한 카드번호
		 그렇지 않으면 유효하지 않은 카드번호이다
		 (Luhn 알고리즘)
		 
		 카드번호를 입력받아서 유효성을 검증하는 코드를 작성하세요
		 
		 (String , char, int, /, %, +) 사용
		 */	
		
		
		String input ="1162-3434-1010-2111"; // 유효
		
		// 홀 수는 그대로 짝수는 2배
		// 1162-3434-1010-2123// 십의 자리가 넘어가는 것은 두 자리수 더하여 한 자리수로 출력
		
		String input2 ="1162-3434-1010-2113"; // 유효하지 않음
		
		// 모든 수의 합을 구하여 10으로 나누어떨어지는지 확인
		
	
	}
}
