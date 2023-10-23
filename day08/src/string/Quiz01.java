package string;

public class Quiz01 {
	public static void main(String[] args) {
		// 주어진 문자열에서 알파벳만 가져와서 새로 구성된 문자열 s2를 출력하세요
		String str = "a1B2c3D4e5";
		String s2 = ""; // 정수 덧셈에 대한 항등원이 0이면
						// 문자열 덧셈에 대한 항등원은 ""이다(아무것도 더하지 않았을때 값)

		for (int i = 0; i < str.length(); i++) { // 전체 글자중에서
			char ch = str.charAt(i); // 각 글자를 ch라고 할때
			if (('a' <= ch && ch <= 'z' || 'A' <= ch && ch <= 'Z')) { // ch가 알파벳이면
				s2 += ch;
				System.out.print(ch);
			}
		}
		System.out.println("s2 :" + s2);
	}
}
