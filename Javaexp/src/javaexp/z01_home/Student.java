package javaexp.z01_home;

public class Student extends Teacher {
	
	String goodPt = "성격이 좋다.";
	
 	void callWeight() {
 		checkWeight(+5);
 		System.out.println("몸무게는 "+getWeight());
 	}
}
