package javaexp.a08_relation;

import javaexp.a08_relation.vo.Car;
import javaexp.a08_relation.vo.CarRacer;
import javaexp.a08_relation.vo.Computer;
import javaexp.a08_relation.vo.Cpu;
import javaexp.a08_relation.vo.HPUser;
import javaexp.a08_relation.vo.HandPhone;
import javaexp.a08_relation.vo.Ram;

public class A03_ObjVsObj {

	public static void main(String[] args) {
		
		HandPhone hp = new HandPhone("삼성폰", 1200000);
		
		HPUser hs = new HPUser("홍길동");
		String name = "홍길동";
		hs.setName(name);
		hs.setName("마길동");
		
		hs.buyPhone(hp);
		hs.buyPhone(new HandPhone("아이폰",1500000));
			
		hs.callByPhone();
	
		CarRacer cr = new CarRacer("홍길동");
		cr.buyCar(new Car("코나",4500));
		
		cr.drivingCar();
		
		/*
		 ex1) 1:1 관계
		 package javaexp.a08_relation.vo 추가하세요
		 
		  cpu(제조사,사양, showInf() 제조사와 사양을 출력) 클래스를 선언
		  Computer(종류-(조립/완성품), Cpu, addCpu(...), 
		  showCom 컴퓨터의 cpu가 없다/ cpu의 정보는 ... )
		  
		  1. javaexp.a08_relation.vo에 
		   Cpu 클래스 선언 및 필드/생성자/메서드 추가
		   		주의 메서드 : showInf()에서 제조사 사양 출력
		   2. Computer 클래스 선언, Cpu 클래스를 포함한 필드 선언 생성자 기능 메서드 선언
		  		주의 메서드 : addCpu() cpu 객체 할당
		  					showCom() 통해서 cpu객체가 할당되어 있을 때와 그렇지 않을 때를 구분하여 처리
		  
		 */
		
		Cpu c1 = new Cpu("인텔","i7");
		c1.showInf();
		
		Computer com1 = new Computer("조립품");
		com1.addCpu(c1);
		com1.showCom();
		
		Ram r1 = new Ram("삼성",32);
		r1.showRam();
		
		com1.addRam(r1);
		com1.showCom();
		
	}

}
