package book;

//1) 단일데이터의 배열
//2) 데이터를 제어하기 위한 함수들

public class Handler {

	// 객체 데이터를 저장하기 위한 배열
	private Book[] arr = new Book[10];

	public void Bookname(String name) {
		int row = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = new Book();
			arr[i].setName(name);
			row = 1;
			break;
		}
		
		public void BookNum(int num) {
			
		}

	}
	
	
	
	
	
	
}
