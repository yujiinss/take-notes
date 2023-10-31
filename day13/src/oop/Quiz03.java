package oop;

import java.util.Scanner;

class TV {
	// TV 속성을 필드로 작성하세요(전원, 채널, 볼륨 그외 필드 자유롭게) // 1.채널 다운 7채널 업 3 볼륨 다운 9볼륨 업 5 파워 6 뮤트

	boolean power;
	int channel;
	int volume;

	// TV 기능을 메서드로 정의하세요
	// 전원 ON/OFF, 채널 올림내림 볼륨 올림내림, TV상태 출력, 음소거
	// 채널은 일정 범위에서 CYCLE형식으로 순환되어야 합니다
	// 볼륨은 일정 범위안에서 최소 최대치를 넘길 수 있습니다
	// 음소거는 한 번 누르면 볼륨이 0이 되었다가 다시 누르면 원래 볼륨으로 복구되어야 합니다
	// 대부분의 기능은 전원이 켜져 있는 상태에서만 작동해야 합니다
	// 생성자에서 객체 생성 시 초기값을 지정하세요
	// 매개변수로 받지 않아도 초기값을 지정할 수 있습니다
	// 예를 들면 채널의 초기값ㅇ이 0인것은 이상합니다. 다른 값이 초기값이 되도록 하세요

	void turn() {
		power = !power;
		System.out.println();
	}
	TV() {
		this.channel = 1;
		this.volume = volume;
	}
	int channelUp() {
	LOOP: while (true) {
			channel += 1;
			if (channel == 10) {
				break LOOP;
			}
		}
	}
	int channelDown() {
		LOOP: while(true) {
			channel -=1;
			if(channel==1) {
				break LOOP;
			}
		}
	}
	
	int volumeUp() {
		for(int i=0; i<10; i++) {
			volume +=1;
		}if(volume==10) {
			volume =11;
			System.out.println("볼륨 최대치 입니다 낮추세요");
		}
	}
	
	int volumeDown() {
		for(int i=10; i>=0; i--) {
			volume -=1;
		}if(volume==0) {
			System.out.println("음소거입니다");
		}
	}
	int
	
	
	
	
	
}
	public class Quiz03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		TV tv = new TV();
		int menu;
		
		
		
		
		
		LOOP :while(true) {
			System.out.println("");
			System.out.println("");
			System.out.println("선택 >>>");
			menu = sc.nextInt();
			switch(menu) {
			//입력한 메뉴에 따라서 tv객체의 메서드를 호출하는 형태로 진행
			case 1: tv.channelDown();
			case 3: tv.volumeDown();
			case 5: tv.power();
			case 6: tv.mute();
			case 7: tv.channelUp();
			case 9: tv.volumeUp();
			case 0:
				break LOOP;
			}
		}sc.close();
		System.out.println("프로그램 종료");
	}

}
