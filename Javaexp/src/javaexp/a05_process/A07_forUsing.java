package javaexp.a05_process;

import java.util.Scanner;

public class A07_forUsing {

	public static void main(String[] args) {
		
		/*
		 # for의 활용
		 1. 여러가지 출력형식 처리
		 2. for문과 전역변수 사용
		 3. for문에서 조건문 사용
		 4. for문 안에서 for문 (이중 for문) 사용
		 
		 
		 */
		
		for(int cnt=1;cnt<=10;cnt++) {
			// 줄바꿈 처리 System.out.println();
			// 특수문자/일반문자 활용 처리 \t, \n
			System.out.println(cnt+"\t");
		}
		// 1 + 2 + 3 + 4....
//		for(int cnt=1;cnt<=10;cnt++) {
//			System.out.print(cnt+" + ");
//		}
		// ex) 다음 형태로 출력해보세요
		// 1. 카운트 다운 시작 10,9,8.... 0. 완료
		// 2. 100에서부터 120까지 합산 처리
		//	  100 + 101 ... 120 +
		//	  합산처리 완료
		// 3. 학생 번호와 점수(임의의 점수-0~100)
		// 	  번호  점수
		//     1    78
		//     2    98
		//     3    88
		// 4. 임의의 구구단 출력 
		//    단수: @@ 단(2~9) (임의값) for문 1~9반복
		//	  @@ x 1 = @@
		//	  @@ x 2 = @@
		//	  @@ x 3 = @@
		//	  @@ x 4 = @@
		
		// 1.
		for(int cnt=10;cnt>=0;cnt--) {
			System.out.println(cnt+",");
		
		}
		System.out.println("완료");
		
		//2.
		int start = 100; // 변수의 범위에 따라서 for문 처리
		int end = 120;
		System.out.println(start+"에서부터"+end+"까지 합산");
		for(int cnt=start;cnt<=end;cnt++) {
			System.out.print(cnt+" + ");
		}
		System.out.println("\n합산처리 완료");
		
		//3.
		System.out.println("번호\t점수");
		
		for(int cnt=1;cnt<=100;cnt++) {
			int point = (int)(Math.random()*101);
			System.out.println(cnt+"\t"+point);
		}
		
		//4.
		int grade = (int)(Math.random()*9+1);
		System.out.println("단수: "+grade+"단");
		for(int cnt=1;cnt<=9;cnt++) {
			System.out.println(grade+" × "+cnt+" = "+(grade*cnt));
		}
		
		// 과일의 단가를 입력하고 해당 과일의 1~10까지 구매 총계를 아래 형식으로 출력하세요
		// 단가 : @@@
		// 1개 : @@원
		// 갯수  총계
		// 1개  @@원
		// 2개  @@원
		// 3개  @@원
		// 4개  @@원
		// ..
		// 10개 @@원
		
		Scanner fruit = new Scanner(System.in);
		System.out.print("단가를 입력해주세요 ");
		int fruitPrice = fruit.nextInt();
		System.out.println("단가: "+fruitPrice);
		
		System.out.println("갯수\t총계");
		for(int cnt=1;cnt<=10;cnt++) {
			System.out.println(cnt+"개\t"+(fruitPrice*cnt)+"원");
			// System.out.print(cnt+"\t");
			// System.out.print(cnt*fruitPrice+"\n");
		}
		
		
		
	}

}
