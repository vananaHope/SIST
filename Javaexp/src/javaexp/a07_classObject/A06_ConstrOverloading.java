package javaexp.a07_classObject;

public class A06_ConstrOverloading {

	public static void main(String[] args) {
		
		//1. 클래스에서 선언된 생성자 중에 하나를 선택해서 
		//	 객체 생성가능하다.
		Person2 p01 = new Person2();
		System.out.println(p01.name+" : "+p01.age); // 이름, 나이 
		Person2 p02 = new Person2("홍길동");
		System.out.println(p02.name+" : "+p02.age); // 이름, 나이
		Person2 p03 = new Person2("김길동",25);
		System.out.println(p03.name+" : "+p03.age); // 이름, 나이
		
		Product2 p1 = new Product2("바나나");
		System.out.println(p1.pname);
		System.out.println(p1.price);
		Product2 p2 = new Product2("딸기",10000);
		System.out.println(p2.pname);
		System.out.println(p2.price);
		Product2 p3 = new Product2(20000,"키위");
		System.out.println(p3.pname);
		System.out.println(p3.price);

	}

}

/*
 
 # 생성자 오버로딩
 1. 생성자는 기본적으로 default 생성자로부터 여러 생성자를 클래스내에서 오버로딩 규칙에 의해
 	여러개를 선언할 수 있다.
 
 
 
 */
class Person2 {
	String name;
	int age;
	
	Person2() {
		System.out.println("매개변수가 없는 생성자");
	}
	// 오버로딩 규칙1: 매개변수 갯수가 다르다.
	Person2(String name) {
		this.name = name;
		System.out.println("이름을 초기화 하는 생성자");
	}
	// 오버로딩 규칙2: 매개변수의 데이터 유형이 다르다
	Person2(int age) {
		this.age = age;
		System.out.println("나이 초기화 생성자: "+age);
	}
	// 오버로딩 규칙3: 매개변수의 타입에 따른 순서가 다르다.
	Person2(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println("매개변수 타입 순서 변경1");
		System.out.println("이름: "+name);
		System.out.println("나이: "+age);
	}
	Person2(int age, String name) {
		this.name= name;
		this.age = age;
		System.out.println("매개변수 타입 순서 변경2");
		System.out.println("이름: "+name);
		System.out.println("나이: "+age);
	}
}

// 클래스에 물건명과 가격 속성을 필드로 선언하고
//	생성자1: 물건명할당, 생성자2: 물건명, 가격  생성자3: 가격, 물건명으로 오버로딩 규칙에 의해 선언하고 호출하여
//	할당된 속성값을 출력하세요
class Product2 {
	String pname;
	int price;
	Product2(String pname) {
		this.pname = pname;

	}
	Product2(String pname, int price) {
		//this(name); 현재 선언된 생성자 중에 매개변수가 문자열로 선언된 것을 호출..
		this.pname = pname;
		this.price = price;
		System.out.println("물건명과 가격 할당1");
	}
	Product2(int price, String pname) {
		this.pname = pname;
		this.price = price;
		System.out.println("물건명과 가격 할당2");
	}
		
}


