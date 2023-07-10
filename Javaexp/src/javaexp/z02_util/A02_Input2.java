package javaexp.z02_util;

public class A02_Input2 {

	public static void main(String[] args) {
		
		// 일단, 한 번은 실행해야됨
		System.out.println("입력연습");
		
		String pname = args[0];
		//args[1] : "3000" ==> 3000 ==> price
		int price = Integer.parseInt(args[1]);
		int cnt = Integer.parseInt(args[2]);
		int tot = price*cnt;
		System.out.println("# 구매 정보 #");
		System.out.println("물건명: "+pname);
		System.out.println("가격: "+price);
		System.out.println("갯수: "+cnt);
		System.out.println("총계: "+tot);
		
		// A03_Input.java
		//  구매한 물건들의 가격을 3개 입력해서 
		//  3000 2000 1000
		//  총 비용을 출력하세요
		
		
		
	}

}
