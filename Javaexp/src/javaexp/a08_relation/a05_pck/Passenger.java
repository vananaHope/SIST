package javaexp.a08_relation.a05_pck;

import javaexp.a08_relation.a06_pck.Bus;

public class Passenger {
	
//	Car c1; 선언시 public이기에 안됨
	Bus b1;
	
	
	void call() {
		b1 = new Bus();
//		b1 = new Bus(7780);  public이 아니라서 에러
		b1 = new Bus("부산",7780); 
		System.out.println(b1.no);
//		System.out.println(b1.target); public이 아니라서 에러
	}
}
