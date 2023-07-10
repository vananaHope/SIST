package javaexp.a05_process;

import java.util.Scanner;

public class A11_while {

	public static void main(String[] args) {
		
		/*
		 # while문 : 조건에 따라 반복을 계속할 지 결정하는 경우에 활용됨
		 1. 기본형식
		 	while(반복할 조건) {
		 		반복할 조건이 true일 때 처리할 내용
		 	}
		 	무한 반복안에서 break
		 	while(true) {
		 		처리할 내용
		 		if(반복문을 벗어날 조건) {
		 			break;
		 		}
		 	}
		 	
		 2. 처리 예시
		 	1) 메뉴를 입력받아서, Q를 누를 때까지 처리
		 	2) 구매한 과일의 가격을 입력받아서 -1을 입력할 때까지 처리
		 	
		 
		 */
		int cnt =1;
		while(cnt<=10) {
			System.out.println((cnt++)+"번째 반복");
		}
		
		
//		Scanner sc = new Scanner(System.in);
//		
//		String flist = "";
//		while(true) {
//			System.out.print("구매할 과일명을 입력(종료시 Q): ");
//			String fruit = sc.nextLine();
//			System.out.println("입력한 내용: "+fruit);
//			if(fruit.equals("Q")) {
//				break;
//			}else {
//				flist += fruit + " ";
//			}
//		}
//		System.out.println("구매한 과일리스트: "+flist);
//		System.out.println("종료!!");
		
		// ex1) 10~20까지 while문을 통해서 출력하세요
		// ex2) 구매할 물건의 가격을 입력받고, 종료시 -1
		// 		총 비용: @@
		
		
		// ex1
		int point = 10;
		
		while(point<=20) {
			System.out.println(point+"번쨰 while문");
			point++;
		}
		
		
		// ex2
		Scanner sc = new Scanner(System.in);
		
		int tot = 0;
		int cnt3 = 0;
		while(true) {
			System.out.print("물건의 가격을 입력해주세요 ");
			int inputPrice = Integer.parseInt(sc.nextLine());
			if(inputPrice==-1) {
				System.out.println("구매완료!");
				break;
			}else {
				tot += inputPrice;
				cnt3++;
			}
		}
		System.out.println("구매한 물건의 갯수: "+cnt3);
		System.out.println("총 비용: "+tot);
		
		
	}

}
