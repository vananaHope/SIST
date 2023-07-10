package javaexp.z01_home;

public class Teacher {
	private int weight = 68;
 	
 	void teaching() {
 		System.out.println("가르치는 것을 잘한다.");
 	}
 	
 	void checkWeight(int weight) {
 		weight+=weight;
 		System.out.println("몸무게가 "+(weight>0?"더 늘었다":"같거나 줄었다"));
 	}
 	
 	int getWeight() {
 		return weight;
 	}
}
