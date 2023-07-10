package javaexp.a11_api;

import java.util.Scanner;

public class A04_IndexOf {

	public static void main(String[] args) {
		
		/*
		 # 특정 문자열을 찾을 때, 활용되는 indexOf
		 1. 기본 형식
		 	문자열.indexOf("찾을 문자열")
		 	해당 문자열 안에서 찾을 문자열의 시작 위치를 index로 리턴해준다.
		 	해당 문자열을 포함하지 않으면 -1을 리턴한다.
		 	ex) 키워드 검색시 주로 활용된다. 포함된 문자열의 시작 위치를 리턴
		 	
		 */
		String msg = "점심 맛있게 드세요!";
		int idxLoc1 = msg.indexOf("아침");
		int idxLoc2 = msg.indexOf("맛있게");
		
		System.out.println("데이터가 없을 때: "+idxLoc1);
		System.out.println("데이터가 있을 때: "+idxLoc2);
		System.out.println("맛있게 문자열 검색 결과");
		
		if(idxLoc2!=-1) {
			System.out.println("검색이 되었습니다.");
		}else {
			System.out.println("해당 데이터는 없네요");
		}
		// ex) menu로 사과, 바나나, 딸기로 할당하고
		//	구매물건의 입력:
		//	scanner로 입력 받아서 판매 여부를 출력하세요
		
//		Scanner sc = new Scanner(System.in);
//		
//		String menu = "사과, 바나나, 딸기";
//		System.out.print("구매 물건을 입력해주세요! ");
//		String buyProd = sc.nextLine();
//		
//		
//		if(menu.indexOf(buyProd)!=-1) {
//			// 해당 문자열이 없을 때는 -1
//			System.out.println("판매하는 물건입니다.");
//		}else {
//			// 해당 문자열이 있을 때는 시작위치를 index로 리턴
//			System.out.println("판매하지 않는 물건입니다.");
//		}
		
		/*
		 # 문자열을 찾아서 변경할 때 사용되는 replace
		 1. 기본 형식
		 	문자열.replace("찾을 문자열","변경할 문자열")
		  
		  
		 */
		
		String target = "자바는 객체지향 프로그램입니다!";
		String newStr = target.replace("자바", "JAVA");
		
		System.out.println("수정 후 결과: "+newStr);
		
		/*
		 # 코드성 문자열을 추출하여 원하는 데이터를 처리하는 substring
		 1. 기본 형식
		 	문자열.substring(추출할 시작 위치 0~, 추출할 마지막 위치1~)
		 
		 */
		 // 		   01 23456789
		String data = "홍길동 70 80 90";
//						123	456789
		String name = data.substring(0,3);
		String kor = data.substring(4,6);
		String eng = data.substring(7,9);
		String math = data.substring(10,12);
		
		System.out.println("이름: "+name);
		System.out.println("국어: "+kor);
		System.out.println("영어: "+eng);
		System.out.println("수학: "+math);
		// ex) 주민번호를 임의로 입력해서, substring으로 추출해서
		//	@@@년 @@월 @@일생이라고 표시하세요
//							012345
		String civilCode = "891212-1901725";
//							123456
		String year = civilCode.substring(0, 2);
		String month = civilCode.substring(2, 4);
		String day = civilCode.substring(4, 6);
		
		
		System.out.print(year+"년 ");
		System.out.print(month+"월 ");
		System.out.print(day+"일 ");
		
		/*
		 # 특정한 구분자를 통해서 데이터를 구분하여 추출하는 형식 split
		 1. 기본 형식
		  	String[] data = 문자열.split("구분자")
		  	특정한 구분자를 기준으로 해서 문자열 데이터를 만드는 메서드이다.
		  	 
		 */
		
		String[] fruits = "사과&바나나&딸기".split("&");
		System.out.println("# 과일 종류 #");
		for(String fruit:fruits) {
			System.out.println(fruit);
		}
		
		//ex1) 서울-대전-대구-광주-제주  라는 문자열 데이터를 구분자로 
		//		배열로 만들어서 출력하세요..
		
		String[] region = "서울-대전-대구-광주-제주".split("-");
		for(String str:region) {
			System.out.println(str);
		}
		
		//ex2) 홍길동&70&80-김길동&90&85-신길동&95&75
		// 		홍길동	70		80
		// 		김길동	90		85
		// 		신길동	95		75
		
		
		String[] mem = "홍길동&70&80-김길동&90&85-신길동&95&75".split("-");
		
		
		for(String str1:mem) {
//			System.out.println(str1);
			String[] mem1 = str1.split("&");
			for(String div:mem1) {
				System.out.print(div+"\t");
			}
			System.out.println();
		}
		
		
		
	}

}
