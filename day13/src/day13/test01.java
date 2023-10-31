package day13;

import java.util.Arrays;
import java.util.Random;

public class test01 {

// - 선택정렬 함수를 만들어야 한다
// - 중복없는 랜덤 정수 6개로 구성된 배열을 반환하는 함수를 만들어야 합니다
// - (1~45 사이의 랜덤정수)
// - 한 줄당 6개, 총 5줄의 정수를 출력하는 프로그램을 작성하세요
// - 리스트 및 컬렉션 사용 금지
// while문을 이용해서 숫자를 뽑아야 함 -> 안 나온 숫자가 나올때 까지 
// 오름차순

	static void minus(int[] arr) {
		Random ran = new Random();
		for (int i = 0; i < arr.length; i++) {
			arr[i] = ran.nextInt(45) + 1;
			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					i--;
					break;
				}
			}
		}
	}
	static void selectionSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) { // 오름차순
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
	}
	static void show(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (i == arr.length - 1) {
				System.out.printf("%2d", arr[i]);
			} else {
				System.out.printf("%2d, ", arr[i]);
			}
		}
		System.out.println();
	}

	public static void main(String[] args) {

		System.out.println("응시자 : 신유진\n");
		int[] arr = new int[6];
		for (int i = 0; i < 5; i++) {
			minus(arr);
			selectionSort(arr);
			show(arr);
		}
	}
}