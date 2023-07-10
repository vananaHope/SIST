package javaexp.a09_inherit;

public class A09_Final {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 1. 필드에서 final
		 	
		 	객체단위 final : 하나의 클래스에서 생성되는 여러개 객체에 
		 		객체별로 변경하지 않는 상수...
		 		class Person {
		 			static final String KIND = "황인";
		 			final String name;
		 			Person(String name) {
		 				this.name = name;
		 			}
		 		}
		 		Person.KIND : 객체 생성 없이도 사용할 수 있고,
		 			객체 공유 즉, class 상수
		 		Person.KIND="백인" : final이기에 변경할 수 없다
		 		
		 		
		 		// 객체별로 초기화는 가능하나 
		 		Person p01 = new Person("홍길동");
		 		Person p02 = new Person("김길동");
		 		p01.name = "오길동"; // 한 번 할당된 데이터는 변경하지 못함
		 		p02.name = "마길동";
		 		
		 	객체공유클래스 final
		 		
		 2. class명 앞에 final : 더 이상 하위에 상속을 할 수 없는 클래스 선언
		 	
		 3. 메서드명 앞에 final : 더 이상 하위에서 재정의가 불가능한 메서드 선언
		 */
		
		
	}

}

final class Riger{}
//class NewSpec extends Riger{}

class Book {
	
	void showPrice() {
		System.out.println("책 가격 보여주기!!!");
	}
	
	final void showAll() {
		System.out.println("책 정보 보여주기!!!");
	}
}

class SubBook extends Book {
	
}