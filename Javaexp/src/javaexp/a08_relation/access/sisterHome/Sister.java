package javaexp.a08_relation.access.sisterHome;

import javaexp.a08_relation.access.ourhome.Father;

public class Sister extends Father{
	void callFatherInfo1() {
		Father f = new Father();
//		System.out.println("private: "+f.secret);
//		System.out.println("default: "+f.name);
		
//		protected라도 상속해서 처리하는 방식이 아닌 객체 생성 후 처리는 접근이 불가능하다.
//		System.out.println("protected: "+f.moneyLoc);
		System.out.println("public: "+f.age);
	}
	void callFatherInfo2() {
//		상속이라는 패키지가 다르면 private, default로 접근하지 못한다.
//		System.out.println("private: "+secret);
//		System.out.println("default: "+name);
		System.out.println("protected: "+moneyLoc);
		System.out.println("public: "+age);
	}
}
