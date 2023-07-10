package javaexp.a08_relation.a01_pck;

import javaexp.a08_relation.a02_pck.Product;

public class Person {
	
	// 외부 패키지에 있는 public class인 경우 호출
	Product p01;
	// 외부 패키지에 public이 아닌 클래스 호출을 할 수 없다.
	// Man m01;
	void call() {
		//static이고 public이라서 객체 생성 없이 바로 사용가능
		System.out.println(Product.pCode);
		// static이지만 no가 public이 아니라서 접근이 불가능
//		System.out.println(Product.no); 에러 발생
		p01 = new Product(); // Product.java의 Product 클래스의 
//		default 생성자가 public이기 때문에 생성이 가능하다.
		
//		p01 = new Product("사과"); 접근 제어자가 public 아니라서 접근 불가
		
		p01 = new Product(2500); // 접근 제어자가 public 이라서 접근 가능
		p01 = new Product("사과",3000);
		System.out.println(p01.name); // name 접근 가능( public)
//		System.out.println(p01.age); // age 접근 불가
	}
}

// ex) a08_relation 패키지 하위에 
//      a03_pck, 	a04_pck 만들고
// 		Computer	public인 Mouse, X KeyBoard
//		Computer에서 필드로 해당 객체를 선언하세요.