package javaexp.a06_memory;

public class A05_MultiArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 # 다차원 배열
		 1. 배열이 2차원 이상인 경우를 말한다.
		 	- 변수는 초기에 한 개의 데이터를 할당
		 	- 1차원 배열에서는 두 개 이상의 데이터를 
		 	  하나의 단위 안에 연속적으로 할당
		 	- 2차원 배열에서는 위 1차원 배열이 여러 개를 처리하는 것을 말한다.
		 2. 자바는 1차원 배열을 이용하여 2차원 이상의 배열을 처리한다.
		 	1) 선언
		 		- 1차원 배열
		 			데이터유형[] 배열명;
		 		- 2차원 배열
		 			데이터유형[][] 배열명;
		 		- 다차원 배열
		 			데이터유형[][]...[] 배열명;
		 	2) 데이터 할당
		 		- 1차원
		 			배열명 = new 데이터유형[데이터크기];
		 			배열명[index번호]
		 		- 2차원
		 			배열명 = new 데이터유형[상위 차원 크기][하위 차원 크기];
		 			배열명[index번호][index번호]
		 			ex) 
		 			multi2 = new int[2][2];
		 			상위 차원은 2개, 그에 종속된 하위차원도 2개.
		 			ex) 기차 5개의 호차 - 1차원 배열
		 				각 호차마다 좌석 - 2차원 배열..
		 			int[][] arry = {{1000,2000},{3000,4000}};
		 			데이터 사용
		 				배열명[상위차원배열idx][하위차원배열idx] : 호출 
		 			 	arry[0][0] ==> 1000
		 				arry[1][0] ==> 3000
		 				
		 */
		 // 숫자로 기차에 좌석이 예약되어 사용되면 1,
		 // 사용되고 있지 않으면 0으로 처리해보자
		
		int[][] trains = new int[8][60];
//		int[][] trains1 = new int[8][];
		// trains2 = {{1,0},{0,0,1},{0,0,1,1}};
		
		
		// {{60개 데이터},{},.....{}}
		// trains[0] : 각 1차원의 구역 안에 60개 정수.. 
		// trains.length : 8
		// trains[0].length : 60
		System.out.println(trains.length);
		System.out.println(trains[0].length);
		trains[0][0] = 1;
		trains[0][4] = 1;
		trains[7][59] = 1;
		
		// 호차를 반복
		for(int idx=0;idx<trains.length;idx++) {
			// 각 호차별로 좌석을 반복 : train[idx].length
			for(int jdx=0;jdx<trains[idx].length;jdx++) {
				System.out.print(idx+1+"호차,");
				System.out.print(jdx+1+"번 좌석 ");
				// 배열명[호차index][좌석index]
				System.out.println(trains[idx][jdx]);
			}
		}
		
		// ex) 학생 3명의 국어,영어,수학 점수를 
		// 	   2차원 배열에 넣고자한다.
		// 초기는 모두 다 0점하고 1번째 학생의 국어점수 90
		// 2번째 학생의 영어점수 80, 3번째 학생의 수학점수 80을 할당
		// 2중 for문을 통해서 학생의 점수를 출력하세요
		
		
//		int[][] point = new int[3][5]; // 학생 3명에 과목 5개
//		int[][] point = new int[3][]; // 학생 3명에 과목을 동적(변경)
//		int[][][] point = new int[3][5][3]; 
		// 3개 반에 각 반마다 학생 5명의 과목 3개 - 3차원
		
//		int[][][][] point = new int[3][3][5][3];
		// 3개 학년에 3개반에 각 반마다 학생 5명의 과목 3개 = 4차원
		
		int[][] point = new int[3][3];
		String[] name = {"국어","영어","수학"};
		
		point[0][0] = 90;
		point[1][1] = 80;
		point[2][2] = 80;
		
		for(int idx=0;idx<point.length;idx++) {
			for(int idx2=0;idx2<point[idx].length;idx2++) {
				System.out.print(idx+1+"번째 학생의 ");
				System.out.print(name[idx2]+"점수 ");
				System.out.println(point[idx][idx2]+"점");
				
			}
		}
		
		
		
	}
	

}
