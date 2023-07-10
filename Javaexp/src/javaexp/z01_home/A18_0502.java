package javaexp.z01_home;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class A18_0502 {

   public static void main(String[] args) {
      
//       1. 사용자 정의 예외 4지 선다 문제를 틀리면 사용자 예외 객체 생성, 맞으면 정답으로 처리.
      
      Scanner sc2 = new Scanner(System.in);
      
      while(true ) {
    	  try {
    	    	 System.out.print("정답을 입력하세요 ");
    	         int answer = sc2.nextInt();
    	         
    	         if(answer!=3) {
    	            throw new fourPro();
    	         }
    	         System.out.println("정답입니다. 답은 3번");
    	         break; // 정답 맞추었을 때 반복 수행 종료
    	         
    	      }catch(fourPro e) {
    	         System.out.println(e.getMessage());
    	      }
      }
      
      
      
      
//       2. Math.random()과 Random 클래스의 차이점을 기능 메서드 위주로 기술하세요.
      /*
       Math.random()은 Math 클래스에 있는 random이라는 메서드를 활용하는 것이며 객체 생성없이 이용하는
       		static 메서드를 지원한다.
       
       하지만 Random()클래스는 자바에 내장된 Random클래스를 이용하여 객체를 만들고 그 하위에 있는 여러 가지 
       메서드를 이용하는 것이다. 
       */
      
      
//       3. Random를 활용하여 10번 홀짝 게임 결과를 출력하세요.
      Random r1 = new Random();
      
      
//      for(int cnt=1;cnt<=10;cnt++) {
//         int ranNum = r1.nextInt(101);
//         System.out.print(cnt+"번째 게임: ");
//         if(ranNum%2==0) {
//            System.out.println("짝");
//         }else {
//            System.out.println("홀");
//         }
//      }
      
      Scanner sc3 = new Scanner(System.in);
      Random rd2 = new Random();
      for(int cnt=1;cnt<=10;cnt++) {
    	  boolean isOdd = rd2.nextBoolean();
    	  System.out.println(cnt+"번째 홀/짝 게임 컴퓨터가 홀/짝일까요? 입력: ");
    	  String inGame = sc3.nextLine();
    	  if((isOdd && inGame.equals("홀")) ||
    		 (isOdd && inGame.equals("짝"))	  ) {
    		  System.out.println(inGame+" 맞추었습니다 You win");
    	  }else {
    		  System.out.println("못 맞추었습니다!");
    	  }
      }
      
      
//       4. Random를 활용하여 컴퓨터와 가위/바위/보 게임 3회를 실시하여 @승 @무 @패 출력하세요.
      System.out.println("# 컴퓨터와 함께 하는 가위, 바위, 보 #");
      Scanner sc = new Scanner(System.in);
      Random rd1 = new Random();
      
//						  0		1	2	      
      String[] games = {"가위","바위","보"};
//      		games[0], games[1], games[2]
//      		0,1,2를 랜덤으로 가져오고 games배열에 index로 
//      		넣으면 랜덤 가위/바위/보를 가져올 수 있다.
//						뒤에 있는 사람 승  (comIdx+1)%3==myIdx    
//      				  0 == 1 (바위)	
//      				  1 == 2 (보)	
//      				  2 == 0 (가위)
//      				앞에 있는 사람 승  (comIdx+2)%3==myIdx
//						  0 == 2 (가위)      
//						  1 == 0 (바위)      
//						  2 == 0 (보)
      
//      int win, eq, def; win=eq=def=0; // 선언과 초기화
//      
//      for(int i=1;i<=3;i++) {
//    	  int comIdx = rd1.nextInt(3); // 0,1,2
//    	  System.out.print(i+"번째 게임 가위는 1번, 바위는 2번, 보는 3번 입력: ");
//    	  int myIdx = sc.nextInt(3)-1; // 0,1,2
//    	  System.out.println("컴이 낸 가위/바위/보: "+games[comIdx]);
//    	  System.out.println("컴이 낸 가위/바위/보: "+games[myIdx]);
//    	  if(comIdx==myIdx) {
//    		  System.out.println("무승부"); eq++;
//    	  }else if(((comIdx+1)%3) == myIdx) {
//    	  // 컴에서 나온 랜덤 index 값에서 +1한 값이 내가 선택한 index
//    		  // 내가 승 ex) games[0]은 가위, games[1]은 바위이면
//    		  // index 기준으로 0과 1를 비교해서 0+1이 1과 같을 때는 내가 승리하는 바위
//    		  System.out.println("나의 승"); win++;
//    	  }else {
//    		  System.out.println("컴퓨터 승"); def++;
//    	  }
//      }
//      System.out.println("승: "+win+"패: "+def+"무: "+eq);
      
      
//      int win = 0;
//      int lose = 0;
//      int draw = 0;
//      
//      for(int cnt=1;cnt<=3;cnt++) {
//         System.out.print("1.가위 2.바위 3.보 중에서 하나를 선택하여 숫자를 입력해주세요 ");
//         int myInput = sc.nextInt();
//         int computer = r1.nextInt(3)+1;
//         if(myInput==computer) {
//            draw++;
//            if(myInput==1) {
//               System.out.println("둘 다 가위로 비겼습니다.");
//            }else if(myInput==2) {
//               System.out.println("둘 다 바위로 비겼습니다");
//            }else if(myInput==3) {
//               System.out.println("둘 다 보로 비겼습니다.");
//            }
//            
//         }   
//         if(computer==1) {
//            if(myInput==2) {
//               win++;
//               System.out.println("컴퓨터에게 승리하였습니다.");
//            }else if(myInput==3) {
//               lose++;
//               System.out.println("컴퓨터에게 패배하였습니다.");
//            }
//            
//         }   
//         if(computer==2) {
//            if(myInput==1) {
//               lose++;
//               System.out.println("컴퓨터에게 패배하였습니다.");
//            }else if(myInput==3) {
//               win++;
//               System.out.println("컴퓨터에게 승리하였습니다.");
//            }
//            
//         }   
//         if(computer==3) {
//            if(myInput==1) {
//               win++;
//               System.out.println("컴퓨터에게 승리하였습니다.");
//            }else if(myInput==2) {
//               lose++;
//               System.out.println("컴퓨터에게 패배하였습니다.");
//            }
//            
//         }
//      }
//      System.out.println(win+"승 "+lose+"패 "+draw+"무");
//      
      
//       5. 컬렉션 상위 3개 인터페이스의 특징을 기술하세요.
//       
//      1단계 1~10까지 숫자 카드를 만들어 List<String>에 담아서, 임의의 숫자를 1개를 출력하세요
      
      List<String> nlist = new ArrayList<String>();
      nlist.add("1");
      nlist.add("2");
      nlist.add("3");
      nlist.add("4");
      nlist.add("5");
      nlist.add("6");
      nlist.add("7");
      nlist.add("8");
      nlist.add("9");
      nlist.add("10");
      
      
      for(int idx=1;idx<=10;idx++) {
         int ran = r1.nextInt(10);
         System.out.println("임의의 수: "+nlist.get(ran));
         break;
      }
      
      
//      2단계 A~10,J,Q,K번호 문자로 만들어 List<String>를 임의의 카드를 7장을 출력하세요
      
      List<String> slist = new ArrayList<String>();
      slist.add("A");
      slist.add("2");
      slist.add("3");
      slist.add("4");
      slist.add("5");
      slist.add("6");
      slist.add("7");
      slist.add("8");
      slist.add("9");
      slist.add("10");
      slist.add("J");
      slist.add("Q");
      slist.add("K");
      
      for(int num=1;num<=7;num++) {
         int ranCnt = r1.nextInt(13);
         System.out.println(num+"번째 임의의 문자: "+slist.get(ranCnt));
      }
      
      
      
      
      
//      3단계 카드클래스(두가지 속성 - 모양♣,♥,♠,◆,번호 A~10,J,Q,K)를 선언하고, 52개의 카드를 만들어(for문 활용) List에 담아서 출력하세요
      
      
      List<String> strList = new ArrayList<String>();
      
      String[] shape = {"♣","♥","♠","◆"};
      String[] str = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
      
      for(int nCnt=0;nCnt<shape.length;nCnt++) {
         for(int nCnt2=0;nCnt2<str.length;nCnt2++) {
            strList.add("["+shape[nCnt]+str[nCnt2]+"]");
         }
      }
      System.out.println(strList);
      
//      4단계 카드클래스(모양,번호)를 선언하고, 52개의 카드를 만들어(for문 활용) List에 담아서, 
//      임의의 카드를 7장을 출력하세요 4명의 참가자에게 돌리세요
      
      
      
      for(int sCnt=1;sCnt<=7;sCnt++) {
         int ranStr3 = r1.nextInt(52);
         System.out.print(sCnt+"번째 카드: ");
         System.out.println(strList.get(ranStr3));
      }
      
      
   }

}

class fourPro extends Exception {
   public fourPro() {
      super("오답입니다.");
   }
   
   public String getMessage() {
      return super.getMessage()+" 정답을 다시 입력해주세요.";
   }
}