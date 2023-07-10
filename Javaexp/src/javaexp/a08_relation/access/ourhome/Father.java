package javaexp.a08_relation.access.ourhome;

public class Father {
	private String secret = "나만의 비밀";
	String name = "홍길동";
	protected String moneyLoc = "뒷산 하수도";
	public int age = 45;
	
	
	void callFatherInfo1() {
		Father f = new Father();
		System.out.println("private: "+f.secret);
		System.out.println("default: "+f.name);
		System.out.println("protected: "+f.moneyLoc);
		System.out.println("public: "+f.age);
	}
	void callFatherInfo2() {
		System.out.println("private: "+secret);
		System.out.println("default: "+name);
		System.out.println("protected: "+moneyLoc);
		System.out.println("public: "+age);
	}
	
	
	void callPlan() {
		Mine m1 = new Mine();
		System.out.println("우리가족여행계획: "+m1.ourPlan);
	}
	
	void callSec() {
		Mine m2 = new Mine();
//		System.out.println("비밀: "+m2.secret);
	}
}
