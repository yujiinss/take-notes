package exam01a;

import java.util.Random;

public class QuizA {
	
	// 메인함수. 프로그램 실행하면 가장 먼저 시작되는 함수
	public static void main(String[] args) {
		
		System.out.println("응시자 : 홍길동\n");
		
		int[] arr = null;
		for(int i = 0; i < 5; i++) {
			arr = make();
			selectionSort(arr);
			show(arr);
		}
	}
	
	// arr 안에 num이 포함되면 true를 반환하는 함수
	static boolean contains(int[] arr, int num) {
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == num) {
				return true;
			}
		}
		return false;
	}
	
	// Random을 이용하여 중복없는 6개의 정수로 구성된 배열을 반환하는 함수
	// 위에서 만든 contains 함수를 내부에서 사용한다
	static int[] make() {
		int[] arr = new int[6];
		Random ran = new Random();
		for(int i = 0; i < arr.length; i++) {
			int num = ran.nextInt(45) + 1;
			while(contains(arr, num)) {
				num = ran.nextInt(45) + 1;
			}
			arr[i] = num;
		}
		return arr;
	}
	
	// 출력함수, 정수의 자릿수가 달라도 간격을 맞추기 위해서 사용한다
	static void show(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.printf("%2d", arr[i]);
			System.out.print(i == arr.length - 1 ? "\n" : ", ");
		}
	}
	
	// 선택정렬 함수
	static void selectionSort(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[i] > arr[j]) {
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
	}
	
	
}
