package javaexp.a11_api;

public class A07_Math {

	public static void main(String[] args) {
		
		/*
		 # Math 클래스
		 1. 주로 데이터의 기능적인 처리를 할 때, 활용된다.
		  	올림, 내림, 반올림, 임의의 수 그외 수학적인 데이터
		  	처리를 위해 지원되는 static 클래스이다.
		  	객체 생성없이 사용되는 클래스이다.
		  	
		 2.  	
		  	
		 */
		
		System.out.println("Math.random(): "+Math.random());
		System.out.println("Math.abs(-5): "+Math.abs(-5));
		System.out.println("Math.abs(5): "+Math.abs(5));
		System.out.println("올림(실수) Math.ceil(5.2): "+Math.ceil(5.2));
		System.out.println("내림(실수) Math.floor(5.9): "+Math.floor(5.9));
		System.out.println("Math.max(3,2): "+Math.max(3,2));
		System.out.println("Math.min(4,7): "+Math.min(4,7));
		System.out.println("반올림(정수) Math.round(4.5): "+Math.round(4.5));
		System.out.println("반올림(정수) Math.round(4.49): "+Math.round(4.49));
		
		//ex) 1~10까지 두 개의 수를 임의로 발생시켜, 큰 수와 작은 수를 출력하세요.
		double num1 = Math.random()*10+1;
		double num2 = Math.random()*10+1;
		
		double max = Math.max(num1, num2);
		double min = Math.min(num1, num2);
		
		System.out.println("최대값 반올림: "+Math.round(max));
		System.out.println("최소값 반올림: "+Math.round(min));
		
	}

}
