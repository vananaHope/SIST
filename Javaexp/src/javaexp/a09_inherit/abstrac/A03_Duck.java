package javaexp.a09_inherit.abstrac;

public class A03_Duck {

	public static void main(String[] args) {
		
		
		Duck d1 = new NormalDuck();
		d1.fly();
		d1.swimming();
		
		Duck d2 = new Mallard();
		d2.fly();
		d2.swimming();
		
		Duck d3 = new RubberDuck();
		d3.swimming();
		d3.fly();
//		d3.usingForKids(); 추가된 내용은 다형성에 의해서 처리되지 않는다.
		RubberDuck d4 = (RubberDuck)d3; // 타입 캐스팅
		d4.usingForKids();
		RubberDuck d5 = new RubberDuck(); // 초기 생성할 때, 해당 객체로 생성
		d5.usingForKids();
		
		
		/*
		 하위에 RubberDuck
		 	추상 클래스 상속받아서 처리하되 
		 	swimming()을 재정의해서 목욕탕에서 놀다.
		 	추가 메서드 usingForKids() 아이들을 위해 만들어졌다.
		 */
	}

}
/*
 ex) 아래와 같이 추상클래스 Duck을 선언하여 main()에서 호출하세요
 	Duck (추상)
 		kind 종류(필드)
 		매개변수 1개 생성자
 		swimming() 수영을 하다(공통)
 		getKind() 공통
 		fly() 추상메서드
 	NormalDuck(실제클래스)	일반오리 : fly() 날지 못한다.
 	Mallard(실제클래스) 청둥오리 : fly() 훨훨 날다.	
 		
 */





abstract class Duck {
	private String kind;

	public Duck(String kind) {
		this.kind = kind;
	}
	
	// 공통 메서드
	public void swimming() {
		System.out.println(kind+" 수영을 하다");
	}
	
	// 추상 메서드
	public abstract void fly();

	public String getKind() {
		return kind;
	}
	

	
}

class RubberDuck extends Duck {

	public RubberDuck() {
		super("러버덕");
		// TODO Auto-generated constructor stub
	}

	@Override
	public void fly() {
		System.out.println(getKind()+"은 날지 못한다.");
		
	}
	
	public void swimming() {
		System.out.print("우리집 목욕탕에서 ");
		super.swimming();
	}
	
	public void usingForKids() {
		System.out.println(getKind()+"은 아이들을 위해 만들어졌다.");
	}
}

class NormalDuck extends Duck {
	/*
	 # 상속을 하면
	 1. 상위 생성자를 호출해야 한다.
	  	  super(매개변수) : 상위 클래스에서 선언된 생성자 호출.
	 2. 추상 클래스일 때는 추상 메서드를 반드시 재정의해야 한다. 	  
	 */
	
	
	
	public NormalDuck() {
		super("일반 오리");
		
	}

	@Override
	public void fly() {
		System.out.println(getKind()+"는 훨훨 난다.");
	}
	

	
	
}

class Mallard extends Duck {

	public Mallard() {
		super("청둥 오리");
		
	}

	@Override
	public void fly() {
		System.out.println(getKind()+"는 날지 못한다.");
		
	}
	
	
	
}

