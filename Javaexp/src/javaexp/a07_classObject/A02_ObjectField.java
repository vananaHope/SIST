package javaexp.a07_classObject;

public class A02_ObjectField {

	public static void main(String[] args) {
		
		/*
		 # 클래스(객체)의 구성요소
		 1. 필드 : 객체의 데이터가 저장되는 곳
		 		ex) 사람의 두뇌의 저장 내용 처리
		 2. 생성자 : 기본적인 필드값을 초기화할 때 객체가 
		 		   생성되면서 데이터를 입력받아서 처리한다.
		 			주로 객체를 사용할 때, 생성될 때, 초기화할 데이터
		 			ex) new Baby("겸둥이1",0,....)
		 			ex) new Car("그랜저", 3500)
		 3. 메소드 : 데이터입력, 리턴하는 데이터를 처리하는 함수
		 	  참조변수와 함께 데이터 변경처리를 할 때, 주로 사용된다.
		 	  c1.speedUp(10); // 속도를 10단위 올린다.
		 	  c1.takePerson(2); // 승객 2명이 탑승하다.
		 	  int speed = c1.getCurSpeed(); 
		 	  // 현재 속도를 확인하는 메서드(return값이 있음)
		 	  int dist = c1.calDist(150,2); // 시속150km, 시간입력
		 	  // 시속150km를 입력받고, 시간을 입력받았을 때, 
		 	  // 갈 수 있는 거리를 연산해 return 처리(입력값, 로직처리-연산, 리턴값)
		 	  String canGo = c1.checkFuel(150);
		 	  // 가야할 거리를 입력, 필드에 저장되어 있는 연료와 함께 
		 	  // 시간당 연료 소모량을 계산하여 갈 수 있는지 여부를 계산하여 문자열로 리턴
		 	  
		 */
		Bus b1 = new Bus();
		// 참조변수.필드 = 데이터
		b1.nums = "8001";
		b1.target = "서울~인천";
		Bus b2 = new Bus();
		b2.nums = "9001";
		b2.target = "대구~대전";
		Bus b3 = new Bus();
		b3.nums = "7001";
		b3.target = "서울~수원";
		System.out.println(b1.nums);
		System.out.println(b2.nums);
		System.out.println(b3.nums);
		
		// ex) Cat : 종류, 이름
		//     c1,c2,c3 
		
		Cat c1 = new Cat();
		c1.names = "철수";
		c1.cats = "샴 고양이";
		Cat c2 = new Cat();
		c2.names = "영수";
		c2.cats = "페르시안";
		Cat c3 = new Cat();
		c3.names = "땅콩";
		c3.cats = "러시안 블루";
		
		System.out.println(c1.names+": "+c1.cats);
		System.out.println(c2.names+": "+c2.cats);
		System.out.println(c3.names+": "+c3.cats);
	
	}

}
class Bus {
	String nums;
	String target;
}
class Cat {
	String names;
	String cats;
	int age;
	boolean gender;
	String[] foods;
	Bus b1;
}




