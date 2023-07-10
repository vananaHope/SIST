package javaexp.a01_begin;

public class A12_StringTypeChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 예) 파일에 저장된 숫자, 네트워크를 통해 전달되는 숫자
		 ==> 문자열형
		 3000^2000^4000 ==> "3000" ==> 3000
		 
		 문자열을 정수형으로 변환 
			내장된 Integer객체의 parseInt()를 메서드를 통해 정수형 문자열을 숫자형으로 변환해줌
		 	Integer.parseInt("")
		 	ex) "30", "이십오"
		 		int num01 = Integer.parseInt("30");
		 					
		 문자열을 실수형 변환
		 	내장된 Double객체의 parseDouble()을 메서드를 통해	실수형 문자열을 실수형으로 변환해줌
		 	double num02 = Double.parseDouble("3.14");
		 	ex) "25"(O), "이십오점사"(X), "3.14"(O)
		 
		 */
		int num01 = Integer.parseInt("25");
		System.out.println(num01+25);
		String num02str = "30.15"; // 반드시 정수형 문자열이어야 한다.
//		int num02 = Integer.parseInt(num02str); // 실행 에러(컴파일까지만 되고 실행시 에러 발생)
//		System.out.println(num02+20);
		double num02 = Double.parseDouble(num02str);
		System.out.println(num02+30.5);
		// 실수형변환에서 정수형문자열로 변환이 된다.
		System.out.println(Double.parseDouble("30")+0.7);
		// ex) 문자열 "70"과 "20"을 정수형으로 형변환하여 합산된 결과를 출력
		// ex) 문자열 "30.7"과 "40.2"를 실수형으로 형변환하여 합산된 결과를 출력
		
		String str1 = "70";
		String str2 = "20";
	
		int num03 = Integer.parseInt(str1);
		int num04 = Integer.parseInt(str2);
		
		System.out.print(str1+" + "+str2+" = ");
		System.out.println(num03+num04);
		
		
		String str3 = "30.7";
		String str4 = "40.2";
		
		double num05 = Double.parseDouble(str3);
		double num06 = Double.parseDouble(str4);
		
		System.out.print(str3+" + "+str4+" = ");
		System.out.println(num05+num06);
		
		
		
		
		
		
		
	}

}
