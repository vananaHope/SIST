package javaexp.a08_relation.access.ourhome;

public class Mine extends Father{
	void callFatherInfo1() {
		Father f = new Father();
//		System.out.println("private: "+f.secret);
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
	
	
	// private로 Mne의 개인 비밀을 할당하고, 
	// 같은 패키지/다른 패키지 접근 여부를 확인
	
	private String secret = "선녀옷";
	
	void callSec() {
		Mine m2 = new Mine();
		System.out.println("비밀: "+m2.secret);
	}
	
	String ourPlan = "뉴욕";
	void callPlan() {
		Mine m1 = new Mine();
		System.out.println("우리가족여행계획: "+m1.ourPlan);
	}
}
