package javaexp.y01_review;

public class A02_Constructor {

	public static void main(String[] args) {
		
		Person p01 = new Person("홍길동",25);
//		Person p02 = new Person();

	}

}
class Person{
	String name;
	int age;
	// 보이지 않지만 생성자가 없을 때, 컴파일시 default
	// 생성자가 자동으로 생성되어 실행시 호출하여 사용한다.
//	Person() {}
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
}
