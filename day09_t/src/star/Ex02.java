package star;

public class Ex02 {
	public static void main(String[] args) {
		// 횟수를 제어할 변수를 미리 만들어두고 내가 직접 횟수를 변경/제어하기
		
		int size = 5;
		int st = size;
		int sp = 0;
		
		for(int i = 0; i < size; i++) {
			for(int j = 0; j < sp; j++) {			// 공백
				System.out.print("  ");
			}
			for(int j = 0; j < st; j++) {			// 별
				System.out.print("* ");
			}
//			for(int j = 0; j < sp; j++) {			// 공백
//				System.out.print("  ");
//			}
			System.out.println();			// 한줄이 끝나면 줄바꾸기
			
			st -= 1;
			sp += 1;
			
//			if(i < size / 2) {	// 전체 줄 중에서 가운데 도달하지 못했다면(윗부분)
//				sp -= 1;
//				st += 2;
//			}
//			else {	// 가운데 줄이거나 아랫쪽이면
//				sp += 1;
//				st -= 2;
//			}
		}
	}
}
