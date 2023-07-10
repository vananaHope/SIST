package javaexp.a09_inherit.vo;

public class Son extends Father{
	String workkind = "개발자";
	void playBaseBall() {
		System.out.println("야구를 잘하다.");
	}
	
	void callSuper() {
		System.out.println(shape);
//		System.out.println(age); 접근 제어자가 private
		addAge(24); // 접근 가능 상위에 age를 간접적으로 할당처리
		System.out.println("간접적으로 호출: "+getAge());
	}
	
}
