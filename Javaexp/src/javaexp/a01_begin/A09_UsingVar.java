package javaexp.a01_begin;

public class A09_UsingVar {
	int num02; // 클래스명 바로 밑에 있는 변수를 전역변수라고 한다.
	public static void main(String[] args) {
		/*
		 # 변수명 사용
		 1. 변수는 초기화하여야 읽기와 쓰기가 가능하다.
		  	- 단, 클래스 안에서는 자동 초기화된다.
		 	ps) 초기화란 변수에 데이터를 처음 할당하는 것 / 숫자형 데이터는 일반적으로 초기값으로 0을 할당
		 		그 외 boolean 형은 false가 기본값, 이 외에는 객체형이고, 객체형의 초기값은 null로 설정
		 
		 
		 */
		int num01;
//		int sum = num01 + 25; num01에 데이터가 할당되지 않아서 에러 발생
		String name = null;
		// int ==> char ==> char[] ==> String
		Person p01 = null;
		Person p02 = new Person();
		System.out.println(p01);
		System.out.println(p02);
		
		
		
	}

}

class Person {
	
}