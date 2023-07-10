package javaexp.a09_inherit;

public class A13_MultiInherit {

	public static void main(String[] args) {
		
		/*
		 # 인터페이스의 다중 상속 지원
		 1. 상위로 여러 개의 인터ㅔ이스를 상속받아서 
		 2. 하위 실제 클래스는 선언할 수 있다.
		 3. 기본 형식
		 	interface 인터페이스1
		 		추상메서드1
		 	interface 인터페이스2
		  		추상메서드2
		  	
		  	인터페이스만 여러 개를 상속 받아 사용할 수 있다.	
		  	class 다중상속한실제객체 implements 인터페이스1, 인터페이스2 {
		  		추상메서드1 재정의
		  		추상메서드2 재정의
		  	} 	
		  	ex) Wing인터페이스, Swimming인터페이스
		  		class MultiSkillManRobot implements Wing, Swimming
		  		
		  		
		  		
		 */
		
		MultiSkill01 ms01 = new MultiSkill01();
		MultiSkill02 ms02 = new MultiSkill02();
		ms01.allSkill();
		ms02.allSkill();
		//ex) StudyWay study(), PlayerWay play()
		//		인터페이스를 선언하고 
		//		두개를 implements한 실제 객체
		//		Student01, Student02를 선언하여 위 인터페이스를 
		//		재정의한 내용을 출력하는 메서드를 호출하세요...
		
		Student01 st01 = new Student01();
		Student02 st02 = new Student02();
		
		st01.all();
		st02.all();
	}

}

interface StudyWay {
	void study();
	String NAME = "홍길동";
	String SUBJECT = "영어";
}

interface PlayerWay {
	String SNAME = "김길동";
	String KIND = "스포츠";
	void play();
}

class Student01 implements StudyWay, PlayerWay {
		
	public void study() {
		System.out.println(NAME+"은 "+SUBJECT+" 공부를 하다.");
	}
	
	public void play() {
		System.out.println(SNAME+"은 "+KIND+" 게임을 하며 놀다.");
	}
	
	public void all() {
		study();
		play();
	}
	
}
class Student02 implements StudyWay, PlayerWay {
	
	
	public void study() {
		System.out.println(NAME+"은 "+SUBJECT+" 공부를 하다.");
	}
	
	public void play() {
		System.out.println(SNAME+"은 "+KIND+" 게임을 하며 놀다.");
	}
	
	public void all() {
		study();
		play();
	}
	
}




class MultiSkill01 implements SwimmingWay, Wing {

	@Override
	public void fly() {
		System.out.println("우리 동네를 날다.");
		
	}

	@Override
	public void swimming() {
		System.out.println("호숫가를 수영하다.");
		
	}
	
	public void allSkill() {
		fly();
		swimming();
		
	}
}
class MultiSkill02 implements SwimmingWay, Wing {
	
	@Override
	public void fly() {
		System.out.println("우리 나라 전국을 날다.");
		
	}
	
	@Override
	public void swimming() {
		System.out.println("바닷가를 수영하다.");
		
	}
	
	public void allSkill() {
		fly();
		swimming();
		
	}
}
