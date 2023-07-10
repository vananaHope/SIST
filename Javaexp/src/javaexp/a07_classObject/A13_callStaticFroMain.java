package javaexp.a07_classObject;

public class A13_callStaticFroMain {
	int num01;
	static int num02;
	void call() {
		System.out.println("일반 메서드!!");
	}
	static void call2() {
		System.out.println("Static 메서드!!");
	}
	public static void main(String[] args) {
		call2(); // static 메서드는 현재 클래스 안에 있기에 객체 생성없이 바로 호출 가능
		
		A13_callStaticFroMain m = new A13_callStaticFroMain();
		m.num01 = 25; // 일반변수
		m.call();
		// main()을 포함하는 클래스이기에 바로 할당이 가능하다.
		num02 = 30;
		A13_callStaticFroMain.num02 = 40;
		
		
		
	}

}
