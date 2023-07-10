package javaexp.a07_classObject;


// 상단 메뉴에 refactor ==> rename
// class명을 바꾸면 물리적 파일명도 변경 ProductV0.java
// 이 클래스를 호출하는 모든 파일 변경처리해준다.
public class ProductV0 {
	String name;
	int cnt;
	int price;
	
	// new ProductV0()를 매개변수가 있는 생성자가 있더라도 
	// 호출이 필요할 시에.. Source ==> Generate Constructor from Superclass
	public ProductV0() {
		super(); // 상속시 상위객체를 지칭
		
	}
	// ProductV0 p01 = new ProductV0("사과");
	// p01.name에 데이터가 할당되어 사용할 수 있다.
	public ProductV0(String name) {
		// String name : 지역(매개변수)
		// this.name : 객체전역변수/상수(필드)
		this.name = name;
	}

	public ProductV0(int cnt, int price) {
		this.cnt = cnt;
		this.price = price;
	}

	public ProductV0(String name, int cnt, int price) {
		this.name = name;
		this.cnt = cnt;
		this.price = price;
	}
}
