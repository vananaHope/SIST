package javaexp.a08_relation.access.ourhome;

public class Brother {
	void callPlan() {
		Mine m1 = new Mine();
		System.out.println("우리가족여행계획: "+m1.ourPlan);
	}
	
	void callSec() {
		Mine m2 = new Mine();
//		System.out.println("비밀: "+m2.secret);
	}
}
