package Quiz01;

import java.util.Scanner;

public class Quiz04 {

	public static void main(String[] args) {
		// 지하철 1구간당 평균 소요 시간이 4분이라고 가정한다
		// 이동한 구간수를 입력받아서 이동하는데 걸리는 시간을 출력하세요
		// 단, 이동한 시간이 60분 이하면 분으로만 출력하고
		// 이동한 시간이 60분을 초과하면 시간과 분으로 나누어서 출력하세요

		int perStation = 4; 
		int distance; 
		int hour, minute;
		Scanner sc = new Scanner(System.in);

		
		System.out.println("이동하는 구간 수 : ");
		distance = sc.nextInt();
		minute = distance * perStation;

		
		if (minute <= 60) {
			System.out.println(minute + "분입니다");
		} else if (minute > 60) {
			hour = minute / 60;
			minute %= 60;
			System.out.println(hour + "시간" + minute + "분입니다");
		}

	}

}
