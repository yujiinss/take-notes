package book;

// 단일 데이터를 필드와 getter/setter로 구성
// 책의 이름 , 책 번호

public class Book {
	
	
	private String name;
	private int num;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}

}
