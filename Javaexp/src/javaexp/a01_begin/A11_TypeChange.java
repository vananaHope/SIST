package javaexp.a01_begin;

public class A11_TypeChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 # 형변환
		 1. 데이터 타입을 다른 타입으로 변환하는 것을 말한다.
		 	1) 기본 데이터 타입까지
		 		작 <==> 큰, 실수 <==> 정수
		 	2) 객체형끼리 변경
		 		- 문자열 데이터와 숫자 변경
		 			"301" vs 301
		 			"301"+"101" vs 301 + 101
		 			"301101"       402
		 			ps) 실무형태
		 			모든 데이터는 기본적으로 문자열형태로만 전송하고 전달받을 수 있다.
		 			내장된 객체에서 지원하는 기능메서드를 통해서 변환이 가능하다.
		 		  문자열 ==> 숫자
		 			Integer.parseInt()
		 			Double.parseDouble()
		 		  숫자 ==> 문자
		 		    System.out.println("2+3="+2+3)
		 		    2+3=23
		 		    int num01 = 20;
		 		    int num02 = 30;
		 		    String str = ""+num01+num02
		 		    2030
		 		    최대한 간단한 방법 문자열 ""을 선언하고 숫자를 붙이면 문자열로 변환이 된다.
		 		    ""+20 ==> "20"
		 		    
		 			Integer.tostring()
		 			Double.tostring()
		 			
		 		 문자열을 정수형으로 변환 
		 			내장된 Integer객체의 parseInt()를 메서드를 통해 정수형 문자열을 숫자형으로 변환해줌
		 			Integer.parseInt("")
		 			ex) "30", "이십오"
		 				int num01 = Integer.parseInt("30");
		 					
		 		문자열을 실수형 변환
		 			내장된 Double객체의 parseDouble()을 메서드를 통해	실수형 문자열을 실수형으로 변환해줌
		 			double num02 = Double.parseDouble("3.14");
		 					
		 		- 상속관계에서 형변환(객체이후 진행)
		 2. 종류
		 	1) 자동형(묵시적) 형변환 : 작은 유형이 큰 유형으로 할당할 때 (promotion)
		 	2) 강제형(명시적) 형변환 : 큰 유형을 작은 유형으로 할당할 때, 명시적으로 형변환 표현 (casting)
		 	
		 	
		 	
		 */
		byte num01 = 30;
		int num02 = 230;
		// 주의 : 데이터를 오른쪽에서 =(대입연산자)에 의해서 왼쪽으로 할당된다.
		// 순수 데이터로 할당 할 수 있는 것이 아니라 그것을 포함하는 용기(데이터 유형)기준으로 할당한다.
		
//		num02 = num01; // 작은 용기에 있는 데이터를 큰 용기에 있는 데이터로 할당, 자동형(묵시적) 형변환이 일어남
//		num01 = num02; 
		num01 = (byte)num02; 
		// bit단위로 casting 되기에 연산결과가 예측이 힘들다.
		// 01010100 8bit
		// 0101 4bit
		// 0100이 잘려지는 효과가 있다.
		
		// 큰 용기에 있는 데이터를 작은 용기에 있는 데이터로 할당, 
		// 1. 데이터 할당 불가 ( 자동형변환이 불가)
		// 2. 큰 용기에 있는 데이터를 작은 용기에 할당하려면 Casting 작업이 필요하다.
		//    (byte) 해당 틀을 지정하여 처리
		// 주의) 해당 범위 안에 있으면 정상적으로 할당하지만, 해당 범위를 초과하는데 casting하게 되면
		//      정수의 경우에는 bit단위로 잘려지기에 원치 않는 결과를 확인할 수 있다.
		// 주의2) 캐스팅은 반드시 큰 데이터가 작은 데이터로 할당하는 경우만 있는 것이 아니라 작은 데이터가
		// 		 큰 데이터로 강제 변환해서 연산을 해야하는 경우에도 사용된다.
		//		10/3 ==> 3,  10/(double)3 ==> 3.3333
		
		System.out.println(num01);
		
		/*
		 3. 정수 vs 실수 변환
		 	1) 정수 ==> 실수
		  		20 <==> 20.0
		  	2) 실수 ==> 정수(casting)
		  		3.14 ==> 3
		  		
		  		
		  		
		 */
		
		int num03 = 20;
		double num04 = num03;
		System.out.println(num04);
		
		double num05 = 3.14;
		int num06 = (int)num05; // 실수가 정수로 casting
		System.out.println(num06);
		
		/*
		 #주의 ( 자바에만 있음 )
		 1. 자바는 정수/정수형은 정수형으로 처리됨.
		 	소숫점이하를 보여주지 않는다.
		    ==> 소숫점이하를 보기 위해서는 나눗셈의 데이터 중 적어도 하나는 실수형으로 형변환하여 처리해야 함
		    	(강제형변환 - casting)
		 		cf) casting은 무조건 큰 데이터를 작은 데이터에 할당하는 것이 아니라, 데이터 유형의 크기/종류에 상관없이
		 			강제 형변환시 사용한다.
		 
		 */
		
		int num07 = 10;
		int num08 = 3;
		System.out.println(num07/num08);
		System.out.println(num07/(double)num08);
		System.out.println((double)num07/num08);
		
		// ex) 25와 7을 정수로 선언하여, 소숫점 이하가 나오지 않는 경우와 소숫점이하가 나오는 경우를 출력
		
		int num09 = 25;
		int num10 = 7;
		
		System.out.println(num09/num10); // 정수 Only
		System.out.println(num09/(double)num10); // 실수
		System.out.println((double)num09/num10); // 실수
		System.out.println((double)num09/(double)num10); // 실수
		
		int num20 = 25;
		System.out.println(""+num02+30);
		Integer intRam = num20; 
		System.out.println(intRam.toString()+30);
		
		
	}

}
