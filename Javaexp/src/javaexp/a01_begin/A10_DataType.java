package javaexp.a01_begin;

public class A10_DataType {

	public static void main(String[] args) {
		/*
		 # 자바의 데이터 유형
		 1. 기본 데이터 유형(primitive data type)
		  	1) stack 영역에서 바로 할당하여 사용하는 데이터 유형
		  	2) 숫자형
		  		정수
		  			byte(8bit) --> -128 ~ 127
		  				- 영문 문자를 나타낼 word 단위
		  			char(2byte) --> 0~65535
		  			short(2byte)
		  			int(4byte-32)** --> -21억 ~ 21억 	
		  			long(8byte-64)
		  		실수
		  			float(4byte)
		  			double(8byte)**
		  		
		  		강조) 정수의 default 데이터 유형은 int
		  			 실수의 default 데이터 유형은 double
		  			 2532 ==> 정수 int 유형
		  			     byte num01 = 25;
		  			     byte num02 = 25;
		  			     byte num03 = num01 + num02; (X)
		  			 	 연산자가 들어가는 순간 int유형 이상으로 할당되어야 함
		  			 	 
		    3) 문자형 - 형태는 숫자형 cf) 주의 문자형은 기본 데이터 유형, 문자열(문자배열)형은 객체유형이다.
		    						  char 2byte 0~65535	
		  	4) 논리형 boolean 1byte 
		  		true, false
		 2. 객체형 데이터(object type)
		  	1) stack영역, heap영역을 상요하여 사용하는 객체형 데이터 유형
		 */
		
//		int num01 = 99999999999999; (x)
		long num02 = 9999999999999L;
		// int 유형 범위를 넘어선 경우 L/l를 붙여서 long에 할당해야 함.
		// 실수유형의 경우에는 기본 유형이 double이기에 float형으로 선언하여 할당해야하는 경우는
		// 마지막에 f/F를 붙인다.
		float num03 = 95.75F;
//		byte num04 = 342; byte 정수범위 초과
		byte num05 = 127;
		// char는 각 코드값을 가지고 있다.
		System.out.println("48번 문자");
		System.out.println((char)48);
		System.out.println("문자 '0'의 코드번호");
		System.out.println((int)'0');
		System.out.println("문자 'A'의 코드번호");
		System.out.println((int)'A');
		
		/*
		 48 ==> '0'
		 49 ==> '1'
		 */
		for(int num01 = 0; num01<=300; num01++) {
			System.out.print(num01+":");
			// 번호가 (char)에 의해 코드값으로 변환되었을 때 나타나는 코드
			// char 문자는 숫자로 저장되어 있다가 char에 의해 코드를 나타낸다.
			System.out.println((char)num01);
		}
		// 실무적으로 숫자/알파벳 대소문자 랜덤 8자 발송할 때 활용됨
		
		boolean isPass01 = true;
		boolean isPass02 = false;
		boolean isPass03 = 25>=5;
		System.out.println(isPass01);
		System.out.println(isPass02);
		System.out.println(isPass03);
		// 자바에서는 char유형과 String 구분한다.
		char code01 = 'A'; // ''한 문자만 입력
		char[] code02 = {'H','e','l','l','o'};
		// 자바에선 {}을 통해 배열을 나타낸다.
		String str01 = "Hello World"; // "" 한 문자를 포함하여 입력
		
//		ex) byte유형으로 25를 할당하고, int 유형으로 3000을 할당.
//			long 유형으로 30억을 할당, float 유형으로 3.14를 할당하고 출력
		
		byte a = 25;
		int b = 3000;
		long c = 3000000000L;
		float d = 3.14F;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
		
		
		
		
		
	}

}
