package javaexp.a05_process;

import java.util.Scanner;

public class A14_0404 {

   public static void main(String[] args) {
      //1. for문의 기본 구성요소를 기본 예제를 통하여 특징을 기술하세요.
      // for(초기값;반복조건;증/감연산자) {
      //      반복해서 처리할 내용
      // }
      for(int cnt=1;cnt<=10;cnt++) {
         System.out.println(cnt);
      }
      
      //2. for(기본) 기본 형식을 활용해서 아래 데이터를 출력하세요
        // 1) 200~300 10단위 출력, 2) 1000~950 3단위 감소, 3) 100~0까지 2로 나눈값
      
      //1)
      for(int cnt=200;cnt<=300;cnt+=10) {
         System.out.println(cnt);
      }
      //2)
      for(int cnt=1000;cnt>=950;cnt-=3) {
         System.out.println(cnt);
      }
      //3)
      for(int cnt=100;cnt>=0;cnt--) {
         System.out.println(cnt/2);
      }
      
      //3. for문의 지역변수와 전연변수의 개념을 예제를 통해서 설명하세요
      int tot = 0; // 전역변수
      for(int cnt=1;cnt<=10;cnt++) {
         tot += cnt; 
         // int sum += cnt; 지역변수
      }
      System.out.println("총 계: "+tot);
      
      //4.  for문의 전역변수를 활용한 출력형태를 예제를 통해 설명하세요              
      
//      Scanner sc = new Scanner(System.in);
//      int totPay = 0;
//      for(int cnt=1;cnt<=3;cnt++) {
//         System.out.print(cnt+"번째 구매 물품의 가격: ");
//         int inputPrice = sc.nextInt();
//         totPay += inputPrice;
//      }
//      System.out.println("총 비용: "+totPay);
      
      //5. 입력할 과일의 3개의  과일명과 과일가격을 입력받아, 아래 형식으로 출력하되 총비용을 출력 하세요
      // 시간부족으로 풀지 못했습니다.
        // no 과일명  가격
        // 1 사과    3000            
        // 2 바나나   4000           
        // 3 딸기    12000
        //  총계    19000
      
//      Scanner sc2 = new Scanner(System.in);
//      System.out.println("no\t과일명\t가격");
//      
//      int totPrice = 0;
//      String inputFruit = "";
//      for(int cnt=1;cnt<=3;cnt++) {
//         System.out.print(cnt+"번째 과일명을 입력하세요 ");
//         String inputFruit = sc2.nextLine();
//         for(int cnt2=1;cnt2<=3;cnt++) {
//            System.out.print(cnt+"번째 과일의 가격을 입력하세요 ");
//            int inputPrice = Integer.parseInt(sc2.nextLine());
//            totPrice += inputPrice;
//         }
//         System.out.print(cnt+"\t"+inputFruit+"\t"+inputPrice);
//         
//      }
//      System.out.println("총 계: "+totPrice);
      
      //6. for(지역/전역) - 곰돌이가 하루 빵을 2개씩 증가해서 먹어(첫째날 2개, 둘째날 4개, 셋째날 6개 ...) 총 10일 동안 먹은 빵의 갯수를 누적하여 아래와 같이 출력하세요
        // 시간부족으로 풀지 못했습니다.
      // # 출력 형식
        // 날짜  갯수 누적
        // 1일차 2개  2개
        // 2일차 4개  6개
        // 3일차 6개 12개
      
      System.out.println("날짜\t갯수\t누적");
      int brTot = 0;
      
      for(int cnt=1;cnt<=10;cnt++) {
    	  brTot += cnt*2;
         System.out.println(cnt+"일차\t"+cnt*2+"개\t"+brTot+"개\n");
      	   
      }
      
      //7. for을 이용하여 100까지 4의 배수만 # 표시 및 합산,
      // 그 외는 숫자 표시, 하단에 4의 배수 합산표시
      int tot_04 = 0;
      
      for(int cnt=1;cnt<=100;cnt++) {
         if(cnt%4==0) {
            System.out.println("#");
            tot_04 += cnt;
         } else {
            System.out.println(cnt);
         }
         
      }
      System.out.println("합산: "+tot_04);
      
      //8.  for을 이용하여 3,6,9게임을 출력하세요(20까지)- 마지막에 3이 포함될 때 처리
      
      for(int game=1;game<=20;game++) {
         if(game%3==0) {
            System.out.println("짝");
         }else {
            System.out.println(game);
         }
      }
      
      //9. 2중 for문을 기본형식을 예제를 통하여 설명하세요.
      for(int cnt=2;cnt<=9;cnt++) {
         System.out.println(cnt+"단");
         for(int cnt2=1;cnt2<=9;cnt2++) {
            System.out.println(cnt+" × "+cnt2+" = "+(cnt2*cnt));
         }
      }
      
      //10. 아래 내용을 2중 for문을 활용하여
        // 1) 2X2(행X열)로 ♥를 표시 2) 3X2(행X열)로 ★표시 3) 입력한 행/열로 입력한 기호표시
      
      // 1)
      for(int cnt=1;cnt<=2;cnt++) {
         for(int cnt2=1;cnt2<=2;cnt2++) {
            System.out.print("♥");
         }
         System.out.println();
      }
      
      // 2) 
      for(int cnt=1;cnt<=3;cnt++) {
         for(int cnt2=1;cnt2<=2;cnt2++) {
            System.out.print("★");
         }
         System.out.println();
      }
      
      // 3)
      Scanner rowCol = new Scanner(System.in);
      System.out.print("행을 입력해주세요 ");
      int inputRow = Integer.parseInt(rowCol.nextLine());
      System.out.print("열을 입력해주세요 ");
      int inputCol = Integer.parseInt(rowCol.nextLine());
      System.out.print("기호를 입력해주세요 ");
      String input01 = rowCol.nextLine();
      
      for(int cnt=1;cnt<=inputRow;cnt++) {
         for(int cnt2=1;cnt2<=inputCol;cnt2++) {
            System.out.print(input01);
         }
         System.out.println();
      }
      
      // 11. while문의 기본 형식을 예제를 통해 설명하세요
      // while(반복할 조건) {
       //   반복할 조건이 true일 때 처리할 내용
       //}
      
      int num01 = 1;
      while(num01<=15) {
         if(num01==15) {
            System.out.println("##");
            break;
         }else {
            System.out.println(num01+++"번째 반복문입니다.");
         }
         
      }
      
      //12. while문을 이용하여 100~90까지 출력하고, 합산결과를 출력하세요.
      int num02 = 100;
      int tot01 = 0;
      while(num02>=90) {
         System.out.println(num02);
         tot01 += num02;
         num02--;
      }
      System.out.println("합산 결과: "+tot01);
      
      //13. while문을 이용해서 학생의 점수를 등록하고 총점과 평균을 출력하되, 등록을 종료시 -1를 입력해서 처리하세요
      Scanner score = new Scanner(System.in);
      
      int tot_score = 0;
      int head = 0;
      while(true) {
         System.out.print("점수를 입력해주세요");
         int inputScore = score.nextInt();
         if(inputScore==-1) {
            System.out.println("등록 종료");
            break;
         }else {
            tot_score += inputScore;
            ++head;
         }
         
         
      }
      
      System.out.println("총점: "+tot_score);
      System.out.println("평균: "+tot_score/head);
      
      

      
      //14. 반복문에서 break와 continue의 차이점을 기본 예제를 통하여 기술하세요
      //시간부족으로 풀지 못했습니다.
   }

}