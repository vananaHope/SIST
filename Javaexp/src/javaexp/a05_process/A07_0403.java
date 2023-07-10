package javaexp.a05_process;

import java.util.Scanner;

public class A07_0403 {

	public static void main(String[] args) {
		// 1.
		// 점수가 90점이상이면 사은품을 받을 수 있음
		int point = (int)(Math.random()*101);
		String pointGift = point>=90?"선물 수령":"선물 미수령"; 
		System.out.println("선물 수령 여부: "+pointGift);
		
		//2.
		System.out.print("3 + 4 = ? 정답을 입력하세요 ");
		Scanner sc = new Scanner(System.in);
		int result = sc.nextInt();
		String answer = result==7?"정답":"오답";
		System.out.println(answer+"입니다.");
		
		//3.
		// 0~9 정수 범위
		// Math.random()*경우의 수+시작의 수
		int point2 = (int)(Math.random()*10);
		System.out.println(point2);
		
		// 1~10 정수 범위
		int point3 = (int)(Math.random()*10+1);
		System.out.println(point3);
		
		// 4.두 친구가 주사위 2개를 던져서 값을 확인려고 한다. 각각 홍길동/김길동일 때, 
		// 각각 나온 주사위 합을 출력하세요
		
		int dice01 = (int)(Math.random()*6+1);
		int dice02 = (int)(Math.random()*6+1);
		
		System.out.println("홍길동의 값: "+dice01);
		System.out.println("김길동의 값: "+dice02);
		System.out.println("두 주사위의 합: "+(dice01+dice02));
		
		//5. if 조건 구문의 기본형식 3개를 예제를 만들어 기술하세요
		
		// 1) 중괄호를 이용하는 경우
		int point4 = 90; 
		if(point4>=90) {
		 	System.out.println("합격");
		 }else {
			 System.out.println("불합격");
		 }
		// 2) 바로 옆에 조건을 쓰는 경우 / 아래에 쓰는 경우
		 int cnt = 0;
		 System.out.println("사과의 갯수: "+(++cnt));
		 System.out.println("사과의 갯수: "+(++cnt));
		 System.out.println("사과의 갯수: "+(++cnt));
		 if(cnt == 3) System.out.println("그만 드세요!");
		 System.out.println("사과의 갯수: "+(++cnt));
		 System.out.println("사과의 갯수: "+(++cnt));
		 if(cnt == 5) 
			 System.out.println("너무 많이 먹었습니다. 그만 먹으세요");
		 
		 //6. 넌센스 퀴즈를 검색해서 문제로 만들어 문제가 맞을 때, 정답 그외는 오답이 되게 처리하세요
		 
		 Scanner sc2 = new Scanner(System.in);
		 String nonSense = "백과사전";
		 System.out.print("백가지 과일이 죽기 직전을 다른 말로? ");
		 String answer_non = sc2.nextLine();
		 
		 if(nonSense.equals(answer_non)) {
			 System.out.println("정답입니다.");
		 }else {
			 System.out.println("오답입니다.");
		 }
		 
		 //7. Math.random/Scanner활용하여 컴퓨터가 임의로 구슬을 1~10개 랜덤으로 쥐게하되,
         // 0) 해당 갯수를 맞추는지 여부에 따라 success/failure 처리하게 하세요
         // 1) 1입력시 홀, 0입력시 짝으로 하여 success/failure 처리하게 하세요
         // 2) 홀/짝을 입력하여, success/failure 처리하세요
		 
		 int balls = (int)(Math.random()*10+1);
		 Scanner sc3 = new Scanner(System.in);
		 System.out.print("제가 가진 구슬의 갯수를 맞춰주세요 ");
		 int hasBalls = Integer.parseInt(sc3.nextLine());
		 System.out.println("가진 구슬의 수: "+balls);
		 
		 if(balls==hasBalls) {
			 System.out.println("success");
		 }else {
			 System.out.println("failure");
		 }
		
		 System.out.print("홀일때는 1, 짝일때는 0을 입력하세요 ");
		 int ballsNum = Integer.parseInt(sc3.nextLine());
		 System.out.println("입력한 구분자: "+ballsNum);
		 System.out.println("구슬 수: "+balls);
		 int corIdx = balls%2;
		 System.out.println("홀/짝?: "+(corIdx==1?"홀":"짝"));
		 if(ballsNum==corIdx) {
			 System.out.println("success");
		 }else {
			 System.out.println("failure");
		 }
		 
//		 Scanner sc4 = new Scanner(System.in);
		 System.out.print("홀/짝을 입력해주세요 ");
		 String ballsNum2 = sc3.nextLine();
		 System.out.println("구슬 수: "+balls);
		 String corStr = balls%2==1?"홀":"짝";
		 if(ballsNum2.equals(corStr)) {
			 System.out.println("success");
		 }else {
			 System.out.println("failure");
		 }
		 
//		 if(ballsNum2.equals("홀")) {
//			 if(balls%2==1) {
//				 System.out.println("success");
//			 }else {
//				 System.out.println("failure");
//			 }
//		 }else if(ballsNum2.equals("짝")) {
//			 if(balls%2==0) {
//				 System.out.println("success");
//				
//			 }else {
//				 System.out.println("failure");
//			 }
//		 }
		 
		 //8. if else if 구문의 기본예제를 만들어 해당 구문의 기본형식을 설명하세요.
		 int num01 = (int)(Math.random()*101);
		 System.out.println("점수: "+num01);
		 if(num01>=90) {
			 System.out.println("참 잘했어요");
		 } else if(num01>=80) {
			 System.out.println("잘했어요");
		 } else if(num01>=70) {
			 System.out.println("보통이예요");
		 } else {
			 System.out.println("더 노력하세요");
		 }
		 
		 //9. 주사위가 임의로 나오게 하여, 컴퓨터가 낸 임의 주사위 수와 내가 낸 임의 주사위 수를
         // 비교하여, 승/무/패를 출력하세요
		
		 Scanner sc5 = new Scanner(System.in);
		 int dice03 = (int)(Math.random()*6+1);
		 System.out.print("주사위 숫자를 입력하세요: ");
		 int inputDice = Integer.parseInt(sc5.nextLine());
		 System.out.println("컴퓨터가 낸 주사위 숫자: "+dice03);
		 System.out.println("내가 낸 주사위 숫자: "+inputDice);
		 
		 if(dice03==inputDice) {
			 System.out.println("무");
		 }else if(dice03<inputDice) {
			 System.out.println("승");
		 }else if(dice03>inputDice) {
			 System.out.println("패");
		 }
		 
		 
		 //10. switch case문의 기본형식과 기능내용을 기본 예제를 만들어 설명하세요.
		 Scanner sc6 = new Scanner(System.in);
		 System.out.print("번호를 입력하세요: ");
		 int inputNum = Integer.parseInt(sc6.nextLine());
		 switch(inputNum) {
		 	case 2:
		 	case 4:
		 	case 6:
		 	case 8:
		 		System.out.println("짝");
		 		break;
		 	case 1:	
		 	case 3:	
		 	case 5:	
		 	case 7:	
		 	case 9:
		 		System.out.println("홀");
		 		break;
		 	default:
		 		System.out.println("숫자는 1~10까지만 입력할 수 있습니다.");
		 }
		 
		 //11. 가고자하는 위치 2개와 집에 가는 노선버스를 검색하여, 
		 // switch case처리하여 해당 최종 위치를 처리하고, 그외는 정보가 없습니다 라고 표시하세요.

		 
		 System.out.println("경로 확인 버스 번호를 입력하세요: ");
		 Scanner locate = new Scanner(System.in);
		 int busNo = locate.nextInt(); 
		 switch(busNo) {
		 	case 7790:
		 	case 3000:
		 		System.out.println("집으로 가는 버스");
		 		break;
		 	case 1000:	
		 	case 1002:
		 		System.out.println("인천으로 가는 버스");
		 		break;
		 	case 2000:
		 		System.out.println("평택으로 가는 버스");
		 		break;
		 	default:
		 		System.out.println("해당 버스번호는 정보가 없습니다.");
		 }
		 
		 
		 
//		 Scanner locate = new Scanner(System.in);
//		 System.out.print("가고자하는 위치를 입력하세요: ");
//		 String locationResult = locate.nextLine();
//		 
//		 switch(locationResult) {
//		 	case "발산역":
//		 		System.out.println("501번 버스를 타면 됩니다.");
//		 		break;
//		 	case "우장산역":
//		 		System.out.println("605번 버스를 타면 됩니다.");
//		 		break;
//		 	default:
//		 		System.out.println("정보가 없습니다.");
//		 		
//		 }
		 
		 
	}

}
