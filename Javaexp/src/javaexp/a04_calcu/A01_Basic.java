package javaexp.a04_calcu;

public class A01_Basic {

	public static void main(String[] args) {
		
		/*
		 # 연산자란?
		 1. 데이터를 처리하여 결과를 산출하는 것을 말한다.
		 2. 연산자(operations)
		  	1) 연산에 사용되는 표시나 기호
		  		+,-,*,/,%,=,!=,....
		 3. 피연산자(operand)
		 	연산 대상이 되는 데이터
		 4. 연산식(expressions) = 연산자 + 피연산자
		    연산자와 피연산자를 이용하여 연산의 과정을 기술한 것
		    ex) 25 + 2, num01 + num02		
		    30 * 2 = 5
		    30, 2 : 피연산자
		  	*, = : 연산자
		  	피연산자 + 연산자 : 연산식
		
		  # 연산자의 종류
		  1. 산술연산자 : 사칙연산자 + 나머지 연산자	
		  	 +, -, *, /, % 
		 */ 
			int num01 = 25;
			int num02 = 7;
			// ㅁ + 한자 , ㄷ + 한자
			System.out.println(num01+" + "+num02+" = "+(num01+num02));
			System.out.println(num01+" - "+num02+" = "+(num01-num02));
			System.out.println(num01+" × "+num02+" = "+(num01*num02));
			System.out.println(num01+" ÷ "+num02+" = "+(num01/num02));
			System.out.println(num01+" % "+num02+" = "+(num01%num02));
			// ex1) 곰돌이 3마리가 빵을 25개를 먹었다. 공평하게 나눈 갯수와 나머지 빵의 갯수를 출력하되 
			//      변수를 효과적으로 사용하고 연산자를 처리하여 출력하세요
			// ex2) 사과 단가가 2000원 하는 것을 5개 구매하였다. 총 비용을 출력하세요
			// ex3) 현재 지갑 속에 20000원이 있는데 교통비로 2000원 2번 식대로 7000원을 지출하였다.
			//      잔액을 출력하세요 ( 변수 활용 )
			
			// ex1
			
			var breadCnt = 25;
			var bearCnt = 3;
			var breadNum = breadCnt/bearCnt;
			var breadRest = breadCnt%bearCnt;
			
			System.out.println(breadNum);
			System.out.println(breadRest);
			
			// ex2
			var apple_price = 2000;
			var appleNum = 5;
			var total = appleNum*apple_price;
			
			System.out.println(total);
			
			// ex3
			int wallet = 20000;
			int transPay = 2000;
			int transCnt = 2;
			int eatPay = 7000;
			int totSpend = (transPay*transCnt) + eatPay;
//			int Rest = wallet - (transPay*transCnt) - eatPay;
			wallet -= totSpend;
			
			System.out.println(wallet);
			

		  /*
		  2. 부호 연산자 : +, -
		  	 ex) int num01 = 25;
		  		 int num02 = -num01; // -25
		  		 int num03 = -num02; // 25
		  */
		  int num03 = 25;
		  int num04 = -num03;
		  System.out.println("부호연산자 - 추가시: "+num04);	
		  int num05 = -num04;	
		  System.out.println("한 번더 부호연산자 - 추가: "+num05);
		  // ex) 총금액과 지출금액을 지정/선언하고 위에 부호연산자를 이용해서 남은 잔액을 출력하세요
		  var totalPrice = 10000;
		  var paySpend1 = 5000;
		  var paySpend2 = -paySpend1;
		  var totRest = totalPrice + paySpend2;
		  System.out.println(totRest);
		 
		  /*	
		  3. 대입 연산자 : =
		  	 왼쪽 데이터에서 오른쪽 변수에 할당할 때 사용
		  	 int num04 = 50;
		  */
		  int cnt1,cnt2,cnt3,cnt4,cnt5;
		  cnt1=cnt2=cnt3=cnt4=cnt5=1;
		  System.out.println(cnt1);
		  System.out.println(cnt2);
		  System.out.println(cnt3);
		  System.out.println(cnt4);
		  System.out.println(cnt5);
		  
		  /*
		  4. 증감 연산자 : ++, --
		  	 1씩 증가하고 감소하는 연산
		  	 int cnt = 0;
		  	 cnt++; 1씩 증가
		  	 cnt++; 
		  	 
		  	 System.out.println(cnt); 2
		  	 cnt--;cnt--;cnt--; 1씩 감소
		  */
		  System.out.println("증감연산자 처리");
		  System.out.println(cnt1++); // 출력하고 더하기
		  System.out.println(cnt1++); // 출력하고 더해서 마지막에 cnt 3
		  System.out.println(++cnt1); // 더하고 출력
		  System.out.println(++cnt1); // 더하고 출력
		  System.out.println(cnt1--); // 출력하기 빼기
		  System.out.println(--cnt1); // 빼고 출력
		  
		  /*
		  5. 증감대입연산자 +=, -=, (*=,/=,%= 등)	
		  	 특정한 수만큼 증가하고 감소하는 연산자 처리
		  	 int cnt = 0;
			 cnt = cnt + 2;
			 cnt = cnt + 2; // 4
			 cnt += 2; // 6
			 cnt += 5; // 11
			 cnt = cnt - 3; // 8
			 cnt -= 3; // 5
		  */
		  System.out.println("# 증감 대입연사자 #");
		  cnt2 = cnt2 + 2; System.out.println(cnt2);
		  cnt2 += 2; System.out.println(cnt2);
		  cnt2 += 5; System.out.println(cnt2);
		  cnt2 += 5; System.out.println(cnt2);
		  
		  
		  /*
		  6. 비교 연산자 : 비교식을 이용해서 true/false 값을 리턴하는 연산자 	 
			 ==(동일할 때), !=(동일하지 않을 때)
			 >(초과), <(미만), >=(이상), <=(이하)
			 int point =30;
			 boolean isPass1 = point == 60;  false
			 boolean isPass2 = point != 60;  true
			 boolean isPass3 = point >= 60; 
			 	point가 60이상일 때, true, 현재는 결과가 false
			 ps) 자바에서만 사용하는 문자열 비교
			 String str1 = new String("himan");	
			 String str2 = new String("himan");	
			 String str3 = "higirl";
			 String str4 = "higirl";
			 System.out.println(str1==str2); // false, .equals("") 쓰면 true
			 System.out.println(str3==str4); // true
			 # 결론 
			 	자바에서는 문자열을 비교할 때는 .equals()를 이용해서 비교해야 한다.
		 */
		  int point = 50;
		  System.out.println("합격 여부(60점 이상): "+(point>=60));
		  boolean isPass = point>=60;
		  System.out.println("합격 여부(변수할당): "+isPass);
		 
		  int chNum = 2;
		  boolean isCorrect = chNum == 2; // 정답이 2
		  System.out.println("정답여부: "+isCorrect);
		  
		  String idInput = "홍길동";
		  // 문자열 데이터의 입력 여부에 따른 boolean 처리
		  System.out.println("입력 여부: "+(idInput!=null));
		  
		  
		  /*
 	  	
		  8. 삼항연산자	 	  	
			  조건(비교연산자, 논리연산자)? A : B	  	
			  조건식이 True일 때는 A로 처리하고, 조건식이 False일 때는 B로 처리하는 경우를 말한다.	  	
			  한 라인에서 조건에 따라 결과를 처리하기에 효과적이다.
			  데이터 처리를 할 수 있다.
			  System.out.println(age>=18?"성인":"미성년자");
			  	  	
			  	  	
		*/
		

	}

}
