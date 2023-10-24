package star;

//	----------------------------------------
//				별	공백	별
//	#       # 	1	3	1
//	# #   # #	2	1	2
//	# # # # #	3	-1	3	(if)
//	# #   # #	2	1	2
//	#       #	1	3	1
//	
//	+= 1	-= 2	+= 1
//	-= 1	+= 2	-= 1

public class Ex03 {
	public static void main(String[] args) {
		int size = 9;
		int st = 1;
		int sp = size - st * 2;
		
		for(int i = 0; i < size; i++) {
			for(int j = 0; j < st; j++) {	// 0, 1, 2
				System.out.print("* ");
			}
			for(int j = 0; j < sp; j++) {
				System.out.print("  ");
			}
			for(int j = 0; j < st; j++) {	// 0, 2, 4(실행되지 않음. st는 3이므로)
				System.out.print("* ");
				if(i == size / 2 && j == 0) {		// 가운데 줄이고, j반복의 첫번째에서만
					j++;							// j를 한번 더 증가 (j를 2씩 증가)
				}
			}
			System.out.println();
			
			if(i < size / 2) {
				st += 1;
				sp -= 2;
			}
			else {
				st -= 1;
				sp += 2;
			}
		}
	}
}
