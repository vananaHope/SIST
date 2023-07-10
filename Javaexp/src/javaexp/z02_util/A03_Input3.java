package javaexp.z02_util;

public class A03_Input3 {

	public static void main(String[] args) {
		
		int price1 = Integer.parseInt(args[0]);
		int price2 = Integer.parseInt(args[1]);
		int price3 = Integer.parseInt(args[2]);
		
		int total = price1 + price2 + price3;
		
		System.out.println("# 구매한 물건의 가격 #");
		System.out.println("구매한 물건의 갯수: "+args.length);
		System.out.println("첫 번째 가격: "+price1);
		System.out.println("두 번째 가격: "+price2);
		System.out.println("세 번째 가격: "+price3);
		System.out.println("총 비용: "+total);
		
		
		
		
	}

}
