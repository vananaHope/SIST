package javaexp.a09_inherit.list;

import java.util.ArrayList;

public class A01_PolyList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 # 다형성 구조의 ArrayList 할당 처리
		 1. 1:다관계의 구조의 다형성을 ArrayList로 상위로 하여 
		 2. 여러가지 추가되는 다형성 객체들을 할당하고,
		 3. 재정의된 메서드를 호출하여 처리하는 형식을 말한다.
		 4. 기본 형식 및 순서
		 	1) 상위 클래스 선언
		 	2) 추가하는 하위 클래스 선언
		 	3) 호출하는 곳에서 
		 		ArrayList<상위클래스> plist = new ArrayList<상위클래스>();
		 		plist.add(new 하위클래스());
		 		plist.add(new 하위클래스());
		 	4) 반복문을 통해 재정의된 메서드로 각각의 기능을 처리하는 내용을
		 		확인할 수 있다.
		 		for(하위클래스 참조 : plist) {
		 			하위객체의 재정의 메서드 호출...
		 		}
		 		
		 */
		ArrayList<Duck> dlist = new ArrayList<Duck>();
		dlist.add(new NormalDuck());
		dlist.add(new RubberDuck());
		dlist.add(new Mallard());
		
		for(Duck d:dlist) {
			d.swimming();
		}
		
		ArrayList<Part> plist = new ArrayList<Part>();
		plist.add(new Cpu("i7"));
		plist.add(new Ssd("500G"));
		plist.add(new Ram("32G"));
		
		for(Part p:plist) {
			p.showInfo();
		}
		
	}
	// ex) Part 클래스 하위에 Cpu, Ram, Ssd 만들고,
	// 위 ArrayList<Part>에 담아서 재정의된 메서드로 호출하세요.
}

class Part {
	

	private String kind;
	private String spec;
	
	public Part(String kind, String spec) {
		this.kind = kind;
		this.spec = spec;
	}
	
	public void showInfo() {
		System.out.println("부품명: "+kind);
		System.out.println("사양: "+spec);
	}
	
	public String getKind() {
		return kind;
	}
	
}

class Cpu extends Part {
	
	public Cpu(String spec) {
		super("CPU",spec);
	}
	
	public void showInfo() {
		super.showInfo();
		
	}
}

class Ram extends Part {
	
	public Ram(String spec) {
		super("Ram",spec);
	}
	
	public void showInfo() {
		super.showInfo();
		
	}
}

class Ssd extends Part {

	public Ssd(String spec) {
		super("SSD",spec);
	}
	
	public void showInfo() {
		super.showInfo();
		
	}
}


class Duck{
	private String kind;

	public Duck(String kind) {
		this.kind = kind;
	}
	
	public void swimming() {
		System.out.println(kind+" 수영을 한다!");
	}
	
}

class NormalDuck extends Duck {

	public NormalDuck() {
		super("집오리");
		// TODO Auto-generated constructor stub
		
	}

	@Override
	public void swimming() {
		// TODO Auto-generated method stub
		super.swimming();
		System.out.println("집앞 호수에서 즐겁게 수영을 하고 있다.");
	}
	
}

class RubberDuck extends Duck {
	
	public RubberDuck() {
		super("고무오리");
		// TODO Auto-generated constructor stub
		
	}
	
	@Override
	public void swimming() {
		// TODO Auto-generated method stub
		super.swimming();
		System.out.println("집에 있는 목욕탕에서 아이들과 함께 수영을 하고 있다.");
	}
	
}

class Mallard extends Duck {
	public Mallard() {
		super("청둥오리");
	}
	
	public void swimming() {
		super.swimming();
		System.out.println("강가에서 무리들과 즐겁게 수영을 합니다.");
	}
}