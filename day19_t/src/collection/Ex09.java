package collection;

public class Ex09 {
	public static void main(String[] args) throws Exception {
		// 프로세스, 런타임
		
		// Runtime클래스의 객체는 생성자를 통해서 만들 수 없도록 막혀있다
		// 생성자의 접근제한자가 private이다
		// static 메서드 getRuntime()을 이용해서 하나의 런타임만 참조할 수 있도록 되어있다
		// 특정 클래스의 객체가 오직 하나만 생성되고, 하나의 객체만 참조할 수 있는 패턴을 싱글톤 패턴이라고 한다
		Runtime rt = Runtime.getRuntime();
		
		// 런타임 객체를 이용하여 exec() 함수를 호출하면서 문자열로 명령어를 전달하면 실행된다
		Process pro = rt.exec("notepad");
		
		// 컴퓨터에서 실행중인 프로그램 -> 프로세스(Process)
		Thread.sleep(3000);	// CPU에게 3초간 기다리라고 명령하기
		
		pro.destroy();	// 아까 실행했던 프로세스에게 종료 명령을 전달한다
		
		// 명령어로 프로그램을 실행할때, 실행파일 이름 다음에 띄어쓰기로 파일을 지정하면
		// 해당 파일을 열기위해서 프로그램을 실행한다
		
		Process pro2 = rt.exec("notepad C:\\windows\\system32\\drivers\\etc\\hosts");
		Thread.sleep(5000);
		pro2.destroy();
		
//		String command = "shutdown /s /t 600";	// 600초 후에 컴퓨터를 종료(shutdown)하기
		String command = "shutdown /a";			// 예약된 종료 명령을 중단(abort)하기
		rt.exec(command);
		
		
		
	}
}
