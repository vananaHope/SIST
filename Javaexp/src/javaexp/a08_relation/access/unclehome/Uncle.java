package javaexp.a08_relation.access.unclehome;

import javaexp.a08_relation.access.ourhome.Father;
import javaexp.a08_relation.access.ourhome.Mine;

public class Uncle {
	
	void callFatherInfo1() {
		Father f = new Father();
//		System.out.println("private: "+f.secret);
//		System.out.println("default: "+f.name);
//		System.out.println("protected: "+f.moneyLoc);
		System.out.println("public: "+f.age);
	}
//	void callFatherInfo2() {
//		System.out.println("private: "+secret);
//		System.out.println("default: "+name);
//		System.out.println("protected: "+moneyLoc);
//		System.out.println("public: "+age);
//	}
	
	
	void callPlan() {
		Mine m1 = new Mine();
//		외부 패키지에서는 접근이 불가
//		System.out.println("우리가족여행계획: "+m1.ourPlan);
	}
}
