package javaexp.a09_inherit;

public class A01_Basic {

	public static void main(String[] args) {
		
		/*
		 # 객체에 있어서 super와 this의 사용
		 1. this 클래스 안에 객체를 지칭할 때, 이 객체가 가지고 있는 구성요소를 호출할 때
		 	주로 사용된다.
		 	1) this.필드 : 지역변수와 구분하여 class의 전체 전역변수에 사용되는 
		 		변수를 호출해서 할당/사용할 때 사용된다.
		 		ex) public void setName(String name) {
		 			this.name = name;
		 			int age = 25; // 지역변수(지역변수는 내부에서 사용할 때, 
		 							 반드시 초기화 하여야 한다.)
		 		}
		 		매개변수는 일반적으로 지역변수이다.
		 		또한, 해당 메서드 안에서 데이터 유형으로 선언하여 
		 		처리되는 변수 또한 지역변수이다.
		 		이 지역변수가 전역변수와 동일하게 선언되었을 때
		 		그 구분을 위해 사용하는 것이 this. 이다.
		 		
		 	2) this(), this(25), this("홍길동",25) :
		 	 	생성자가 overloading으로 여러 개 선언되어 있을 때, 다른 생성자를
		 	 	호출해서 데이터를 할당할 때 사용된다.
		 	 	- 호출시, 반드시 생성자 선언 첫 라인에서 호출하여야 한다.
		 	ex) Product 클래스 선언하고, 기본 생성자~매개변수3개 생성자를 선언하고 필드값 물건명, 가격, 갯수를 호출하게 하세요
		 		
		 	Product() {
		 		System.out.println("매개변수없음");
		 	}
		 	Product(String name) {
		 		this(); // 상위에 선언한 매개변수 없는 생성자 호출
		 		System.out.println("매개변수 1개");
		 		this(); (X) 반드시 첫 라인에 호출...
		 	}
		 	
		 2. 상속 관계에 있어서 this, super의 활용
		 	1) 필드, 생성자, 메서드에서 모두 활용됨
		 	2) 현재 클래스와 상위 클래스에 정의된 구성요소를 구분하여 호출할 때 사용된다.
		 		this 현재 클래스가 가지고 있는 멤버를 지칭
		 		super 상속하는 상위 클래스가 가지고 있는 멤버를 지칭
		 		ex) 
		 		class Father {
		 			String name ="홍판서"
		 		}
		 		class Son extends Father {
		 			int name = 25; // 재정의 아님..( 동일한 필드는 타입과 변수명이 같을 때 )
		 			String name = "홍길동" // 필드도 재정의하고 있다.
		 			
		 			void call() {
		 			super.name : 상위에 있는 필드 지정
		 			this.name : 현재 객체(하위)에 있는 필드 지정
		 			super와 this는 필드/메서드/생성자에 모두 적용된다.
		 		}
		 			
		  	3) 상위 선언된 메서드와 동일한 이름/매개변수가 동일하게 메서드를 선언하고 사용이 가능하고 이것을 overriding.
		  	 	메서드 overriding일 때, 
		  	 	상위 클래스의 메서드 : super.메서드()  
		  	 	하위클래스의 메서드 : this.메서드() 일반적으로 지역변수와 구분해서 호출할 필요가 없을 때에는 
		  	 	this를 생략해도 무방하다.
		  	 	
		  	4) 상속 관계 하위에 생성자는 반드시 상위에 있는 생성자 중 하나를 호출하여야 한다.(주의!!!!)
		  	
		  		- 일반적으로는 default 생성자를 호출
		  		- 상위에 default를 사용하지 않을 때, 반드시 추가 선언 필요
		  		ex)
		  		class Mother{
		  			Mother(String name) { // default 생성자 사라짐.
		  				
		  			}
		  		}
		  		class Daughter extends Mother {
		  			public Daughter() { super(); } 
		  			// default 생성자가 보이지 않지만 컴파일시 자동으로 생성된다.
		  			// 위에 생성자를 반드시 호출하여야 한다.
		  			public Daughter(String name) {
		  				super("홍리나"); // 명시적으로 상위에 있는 생성자 호출
		  			}
		  			
		  		}
		  			
		  		
		  		
		  	# 주의!!!!!
		  	1. import할 때, 동일한 이름의 클래스이지만 다른 패키지의 경우
		  		해당 기능이 동일하더라도 1:1 관계나 상속 관계에서 에러가 발생하는 경우가 많다.
		  	ex) 보통 동일한 이름의 클래스이고 패키지명이 달라서 import을 잘못하면 기능이 처리되지 않는 경우가 많다.
		  	상속 관계, 외부 클래스의 기능 메서드의 사용 관계 등에서 주로 발생한다.
		  	완전히 구조가 같더라도 해당 객체의 지정된 패키지와 동일한 클래스가 아니면 
		  	다른 객체를 호출하거나 처리할 때, 에러가 나서 처리가 되지 않는다.
		  	compile 에러/run time 에러 발생... 	
		  		
		 */
		
		Person p1 = new Person("홍길동",25,"서울");
		
		Product p01 = new Product("바나나",5000,2);

	}

}
// this()로 정의된 생성자 호출 
class Person{
	String name;
	int age;
	String loc;
	public Person() {
		// TODO Auto-generated constructor stub
		System.out.println("객체 생성: "+this);
	}
	public Person(String name) {
		this(); // 생성자를 호출하면서 매개변수가 없는 생성자도 호출
		this.name = name;
		System.out.println("매개변수 1개");
	}
	public Person(String name, int age) {
		this(name);
		this.age = age;
		System.out.println("매개변수 2개");
	}
	
	public Person(String name, int age, String loc) {
		this(name, age);
		this.loc = loc;
		System.out.println("매개변수 3개");
	}

	
}

class Product {
	String pname;
	int price;
	int cnt;
	public Product() {
		System.out.println("객체 Product 생성 "+this);
	}
	public Product(String pname) {
		this();
		this.pname = pname;
		System.out.println("객체 name 할당: "+pname);
	}
	public Product(String pname, int price) {
		this(pname);
		this.price = price;
		System.out.println("객체 price 할당: "+price);
	}
	public Product(String pname, int price, int cnt) {
		this(pname, price);
		this.cnt = cnt;
		System.out.println("객체 cnt 할당: "+cnt);
	}
	
	
	
}
