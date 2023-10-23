package string;

class Solution {
	public String solution(String new_id) { // 들어오는 값, 인자
		String answer = "";


//		1단계 new_id의 모든 대문자를 대응되는 소문자로 치환합니다.
		new_id = new_id.toLowerCase();
		
//		2단계 new_id에서 알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.)를 제외한 모든 문자를 제거합니다.
		
		String filter = "qwertyuiopasdfghjklzxcvbnm1234567890-_.";
		String s2="";
		for(int i=0; i<new_id.length();i++) {
			char ch = new_id.charAt(i);
			String s = ch +"";
			if(filter.contains(s)) {
				s2+=s;
			}
		}
		//System.out.println("s2:"+s2);
				
//		3단계 new_id에서 마침표(.)가 2번 이상 연속된 부분을 하나의 마침표(.)로 치환합니다.
		
		String s3 = s2;
		while(s3.contains("..")) {
			s3 = s3.replace("..", ".");
		}
		//System.out.println(s3);
		
//		4단계 new_id에서 마침표(.)가 처음이나 끝에 위치한다면 제거합니다.
		
		if(s3.startsWith(".")) {
			s3 = s3.substring(1);
		}
		if(s3.endsWith(".")) {
			s3 = s3.substring(0, s3.length()-1);
		}
	
//		5단계 new_id가 빈 문자열이라면, new_id에 "a"를 대입합니다.
		
		//if(s3.equals("")) { // 리터럴과 변수의 비교는 리터럴을 앞에 세우는 것이 좋다 // 문자열은 ==로 안됨
		if("".equals(answer)) { 
		s3 = "a"; //.연산자 앞에 null값이 오면 안되기 때문
		}
		
//		6단계 new_id의 길이가 16자 이상이면, new_id의 첫 15개의 문자를 제외한 나머지 문자들을 모두 제거합니다.
//		     만약 제거 후 마침표(.)가 new_id의 끝에 위치한다면 끝에 위치한 마침표(.) 문자를 제거합니다.
		
		if(s3.length() >= 16) {
			s3 = s3.substring(0,15);
		}
		if(s3.endsWith(".")) {
			s3 = s3.substring(0, s3.length() - 1);
			//System.out.println(s3.substring(0,15));
		}
//		7단계 new_id의 길이가 2자 이하라면, new_id의 마지막 문자를 new_id의 길이가 3이 될 때까지 반복해서 끝에 붙입니다.			
		if(s3.length() <= 2) {
			while(s3.length() !=3) {
				s3 += s3.charAt(s3.length()-1);
							
			}
		}
//System.out.println(s3); 
//		System.out.println(answer);
		answer = s3;
		return answer; // 함수가 종료되면서 마지막에 내놓는 값(돌려주는 값, 반환값)	
	}
}

public class Quiz02 {
	public static void main(String[] args) { // 메인 함수의 내용은 변경하지 않습니다
		String[] inputs = { 
				"...!@BaT#*..y.abcdefghijklm",
				"z-+.^.",
				"=.=", 
				"123_.def", 
				"abcdefghijklmn.p" 
				};// 제시되는 입력값
		String[] outputs = { 
				"bat.y.abcdefghi",
				"z--", 
				"aaa", 
				"123_.def",
				"abcdefghijklmn"
				}; // 제시된 기댓값들
		Solution solution = new Solution();
		
		for (int i = 0; i < inputs.length; i++) {
			String new_id = inputs[i];
			String output = outputs[i];
			String answer = solution.solution(new_id);
			System.out.printf("%d %s\n", i + 1, answer.equals(output));
		}
		System.out.println("테스트끝");
	}

}
