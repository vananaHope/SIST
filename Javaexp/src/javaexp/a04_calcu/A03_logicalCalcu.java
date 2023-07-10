package javaexp.a04_calcu;

public class A03_logicalCalcu {

	public static void main(String[] args) {
		/*  
		  논리연산자
		  	 - 비교연산식이 2개이상, 또는 not(!) 연산자를 이용할 때 논리연산자를 이용해서 처리한다.
		  	 && : (and) 논리합 두가지 비교연산자가 모두 true일 떄, true 그 외에는 false
		  	 	  ex) 나이에 따라 청소년 요금제 적용 여부
		  	 	  	  boolean isAdolPay = age>=14 && age<18
		  	 	  	
		  	 	  	
		  	 || : (or) 논리곱 두가지 비교연산자 중 하나이상 true이면 true, 둘다 false일 때 false
			 	  ex) 놀이공원 나이에 따라 무료입장 적용 여부
			 	  	  boolean isFree = age<5 || age>=65
			 	  	  
			 ! : 비교연산식이나 논리연산식의 결과가 true이면 false로, false이면 true로 처리	  	  
			 	 boolean isPass = point >= 60; 합격하는 경우
			 	 boolean isNotPass = !isPass; 불합격하는 경우	
			 	 boolean isPay = !isFree; 유료인 경우
		*/
		
		int age = 25;
		boolean isAdol = age>=14 && age<18;
		// && (and) 두개의 비교 연산자가 모두다 true일 때 처리
		System.out.println("청소년 여부: "+isAdol);
		
		String inputId = "himan";
		String inputPass = "7777";
		
		boolean isMemberValid = inputId.equals("himan") && inputPass.equals("7777");
		System.out.println("로그인 성공 여부: "+isMemberValid);
		
		age = 4;
		boolean isFree = age<5 || age>=65;
		System.out.println("무료여부: "+isFree);
		
		
		// ex) 국어, 영어 점수를 할당해서 모두 다 80점 이상이면 상금 50000 여부
		//      둘 중에 하나만 90점 이상이면 상금 30000 여부를 처리한다고 할 때
		// 		변수를 선언하고 상금 여부를 출력
		
		
		int kor = 70;
		boolean is80over = kor>=80;
		System.out.println("국어 점수가 80이상여부: "+is80over);
		int eng = 90;
		boolean isGift50000 = kor>=80 && eng>=80;
		System.out.println("상금 50000 여부: "+isGift50000);
		boolean isGift30000 = kor>=90 || eng>=90;
		System.out.println("상금 30000 여부: "+isGift30000);
		
//		System.out.println("국어 점수: "+kor);
//		System.out.println("영어 점수: "+eng);
//		
//		boolean isFive = kor>=80 && eng>=80;
//		System.out.println("상금 5만원 지급 여부: "+isFive);
//		
//		boolean isThree = kor>=90 || eng>=90;
//		
//		System.out.println("상금 3만원 지급 여부: "+isThree);
		
		int point = 70;
		boolean isPass = point>=60;
		boolean isNotPass = !isPass;
		System.out.println("합격 여부: "+isPass);
		System.out.println("불합격 여부: "+isNotPass);
		
		int age1 = 17;
		boolean isAdol1 = age1>=14 && age1<18;
//		boolean isNotAdol1 = !isAdol1;
		boolean isNotAdol1 = !isAdol1;
		boolean isNotAdol2 = !(age1>=14 && age1<18);
		boolean isNotAdol3 = age1<14 || age1>=18;
		System.out.println("청소년인지 여부: "+isAdol1);
		System.out.println("청소년인지 아닌지 여부: "+isNotAdol1);
		System.out.println("청소년인지 아닌지 여부: "+isNotAdol2);
		System.out.println("청소년인지 아닌지 여부: "+isNotAdol3);
		
		// ex) 5미만이거나 65이상이면 무료요금제이다.
		//     무료요금제가 아닌 경우(유료 요금)를 위 !(not)활용하거나 논리연산식을 사용하여 출력하세요.
		
		int age2 = 4;
		boolean isFree1 = age2<5 || age2>=65;
		boolean isNotFree = !isFree1;
		boolean isNotFree2 = !(age2<5 || age2>=65);
		boolean isNotFree3 = age2>=5 && age2<65;
		
		System.out.println("무료 요금제 여부: "+isFree);
		System.out.println("유료 요금제 여부: "+isNotFree);
		System.out.println("유료 요금제 여부: "+isNotFree2);
		System.out.println("유료 요금제 여부: "+isNotFree3);
		
		
		
	}

}
