package javaexp.a05_process;

import java.util.Scanner;

public class A05_Switch {

	public static void main(String[] args) {
		
		/*
		 # 비교조건이 아닌 특정데이터 기준으로 조건처리하는 switch문
		 1. 어떤 경우에 구문을 처리하는 형식이 switch구문이다.
		 2. switch라는 구문자체로 볼 수 있듯이 어떤 room에서 swich 버튼을
		 	1번, 2번, 3번에 따라 점등하는 위치가 달라지듯이 해당 특정 데이터를 기준으로
		 	처리되는 구문이다.
		 3. 기본형식
		 	switch(변수){
		 		case 경우1:
		 			처리할 내용
		 			break;
		 		case 경우2:
		 			처리할 내용
		 			break; 주의) break가 없는 경우는 switch문을 벗어나지 않고
		 						바로 밑에 case내용을 수행 처리해준다.
		 		case 경우3:
		 			처리할 내용
		 			break;
		 		default:
		 			위에 나열된 경우1,2,3이 아닐 때
		 			처리할 내용
		 	}
		 
		 
		 
		 */
		int switchBtn = (int)(Math.random()*5);
		// 0,1,2,3,4 번호
		System.out.println("클릭한 버튼 번호: "+switchBtn);
		switch(switchBtn) {
			case 1:
				System.out.println("A쪽 구역에 불이 켜짐");
				break;
			case 2:
				System.out.println("B쪽 구역에 불이 켜짐");
				// break;가 없으면 break 만날 때까지 아래로 수행한다.
			case 3:
				System.out.println("C쪽 구역에 불이 켜짐");
				break;
			default:
				// case에서 나열된 데이터가 아닐 때..
				System.out.println("해당 버튼은 사용하지 않습니다.");

		}
		
		// ex) Scanner를 통해서 번호를 입력 받아서 
		// 3은 정답처리
		// 1,2,4은 오답처리
		// 그 외 번호 1~4까지만 가능합니다.
		
		Scanner sc = new Scanner(System.in);
//		System.out.print("번호를 입력하세요 ");
//		int point = sc.nextInt();
//		
//		switch(point) {
//			case 1:
//			case 2:
//			case 4:
//				System.out.println("오답입니다.");
//				break;
//			case 3:
//				System.out.println("정답입니다.");
//				break;
//			default:
//				System.out.println("번호 1~4까지만 입력 가능합니다.");
//				break;
//		}
		
		//ex) 월을 입력받아 해당 월의 마지막 일자를 출력하세요
		//    31: 1,3,5,7,8,10,12
		//    30: 4,6,9,11
		//    28: 2
		//    월은 1~12까지 입력해야 합니다.
		
		System.out.print("월을 입력하세요 ");
		int month = sc.nextInt();
		
		switch(month) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				System.out.println(month+"월의 마지막 일자는 31일입니다.");
				break;
			case 4:	
			case 6:	
			case 9:	
			case 11:
				System.out.println(month+"월의 마지막 일자는 30일입니다.");
				break;
			case 2:
				System.out.println(month+"월의 마지막 일자는 28일입니다.");
				break;
			default:
				System.out.println("월은 1~12사이 값을 입력해야 합니다.");
				break;
		}
		
		
	}

}
