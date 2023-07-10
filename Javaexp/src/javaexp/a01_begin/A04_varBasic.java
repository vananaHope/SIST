package javaexp.a01_begin;

public class A04_varBasic {

	public static void main(String[] args) {
		// 숫자형 데이터 선언과 할당
		// 형식: "유형 이름 = 데이터;"
		int num01 = 25;
		var num02 = 30;
		// int str01 = "안녕";
		// 데이터 타입에 맞는 않는 데이터라서 에러가 발생
		var str1 = "안녕";
		// var은 데이터에 따라서 유형이 정해지기에 에러 발생 X
		System.out.println(num01);
		System.out.println(num02);
		System.out.println(num01+num02);
		
		int point01 = 70;
		// + : 숫자형태를 합산해주지만, 문자열과 함께 사용하면 연결해주는 역할
		System.out.println("점수: "+point01);
		
		// ex) 국어, 영어, 수학 점수를 영문명으로 변수를 선언하여 항목별로 출력하고,
		// 총계도 출력하세요
		
		var Korean = 90;
		var English = 100;
		var Math = 80;
		var total = Korean + English + Math;
		
		System.out.println("국어: "+Korean);
		System.out.println("영어: "+English);
		System.out.println("수학: "+Math);
		System.out.println("총계: "+total);
		
		// ex) 사과 가격, 바나나 가격, 딸기 가격을 영문변수로 선언하고
		// 가격데이터를 할당한 후, 항목별로 출력하고, 총 비용을 출력하세요

		var apple = 3000;
		var banana = 2000;
		var straw = 5000;
		
		System.out.println("사과 가격: "+apple);
		System.out.println("바나나 가격: "+banana);
		System.out.println("딸기 가격: "+straw);
		System.out.print("총 비용: ");
		System.out.println(apple+banana+straw);
		System.out.println("총 비용: "+(apple+banana+straw));
		// () 소괄호는 최우선 순위 연산자 
		// 계산이 된 결과를 가지고 앞에 문자열의 영향을 받아 처리된다.
		
		// System.out.println("총 비용: "+apple+banana+straw);
		// 주의) 앞에 문자열이 선언되어 있으면 뒤에 +숫자는 자동 형변환이 일어나서 숫자가 문자형이 된다.
		
		
		
		
	}

}
