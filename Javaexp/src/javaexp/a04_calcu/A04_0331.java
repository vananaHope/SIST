package javaexp.a04_calcu;

import java.util.Scanner;

public class A04_0331 {

   public static void main(String[] args) {
      /*
       1.연산자, 피연산자, 연산식을 예제로 만들어, 해당 내용을 구분하여 설명하세요
        
       25 + 30 = 55;
       
       연산자 : 연산에 사용되는 표시와 기호 ( +, = )
       피연산자 : 연산 대상이 되는 데이터 ( 25, 30 )
       연산식 : 피연산자 + 연산자 ( 25 + 30 )
       
       */
      
      
       // 2. 산술연산자의 종류와 그 특징을 예제를 통하여 설명하세요
       // 산술 연산자 : +,-,*,/,%
       int num01 = 20;
       int num02 = 5;
       
       System.out.println(num01+" + "+num02+" = "+(num01+num02));
       System.out.println(num01+" - "+num02+" = "+(num01-num02));
       System.out.println(num01+" × "+num02+" = "+(num01*num02));
       System.out.println(num01+" ÷ "+num02+" = "+(num01/num02));
       System.out.println(num01+" % "+num02+" = "+(num01%num02));
       
       // 3. 500cc의 오렌지쥬스를 3잔에 나누어 할당할려고 한다. 소숫점 이하가 처리된 경우와
         //    소숫점 이하가 처리되지 않는 경우를 나누어 코딩하세요
       
       int orangeJuice = 500;
       int orangeNum = 3;
       
       System.out.println(orangeJuice/orangeNum);
       System.out.println(orangeJuice/(double)orangeNum);
       
       // 4. 증감연산식의 앞에 ++, 뒤에 ++의 차이점을 예제를 통하여 기술하세요.

       int cnt = 2;
       System.out.println(cnt++); // 2가 출력되지만 마지막은 3
       System.out.println(cnt++); // 3이 출력되지만 마지막은 4
       System.out.println(++cnt); // 4에 1를 더한 후 출력
       System.out.println(++cnt); // 5에 1을 더한 후 출력
       
       // 5.증감대입연산자의 종류를 기술하고 예제를 통하여 설명하세요. 

       // 증감대입연산자 
       // +=, -=, *=, /=, %= 등
       
       int num03 = 5;
       num03 += 9; System.out.println(num03);
       num03 -= 2; System.out.println(num03);
       num03 *= 2; System.out.println(num03);
       num03 /= 2; System.out.println(num03);
       num03 %= 2; System.out.println(num03);
       
       // 6.구매하는 김밥의 갯수를 선언하고, 1씩 증가하여 김밥의 단가(2500) 아래와 같이 출력
       
       int kimbap_price = 2500;
       int kimbap_num = 1;
       
       System.out.println("김밥 1개 구매 가격: "+(kimbap_price*kimbap_num));
       System.out.println("김밥 2개 구매 가격: "+(kimbap_price*++kimbap_num));
       System.out.println("김밥 3개 구매 가격: "+(kimbap_price*++kimbap_num));
       
       // 7. 문자열의 비교연산자 사용에서 ==, equals()의 차이점을 기술하세요.

       String str1 = new String("김밥");
       String str2 = new String("김밥");
       
       System.out.println(str1.equals(str2)); 
       // true, 메모리 주소값이 서로 다른 데이터를 비교할 때는 .equals를 사용한다.
                                     
       System.out.println(str1==str2); // false
       // 메모리 주소값이 서로 다르므로 false
       
       String str3 = "계란말이";
       String str4 = "계란말이";
       
       System.out.println(str3==str4);
       // 메모리 주소값이 서로 같으므로 true
       System.out.println(str3.equals(str4));
       // 역시 true
       
       
       // 8.main()의 args[]의 처리 내용방법 자바 코드를 통한 처리와 함께 기술하세요. 
       
       // main()의 매개변수로 String[] args = {"노현우","26"};
       //배열명[index번호 - 0부터 시작]
       //   args[0] : "노현우"
       //   args[1] : "26"
       //   args.length : 배열의 크기 - 2
       
       // java A04_0331 : 실행 명령어
       // 실행시, 입력값을 전달 처리
       // java A04_0331 노현우 26
      
       
       // 9. args로 물건명1 가격1 갯수1 물건명2 가격2 갯수2로 입력받아 계산서(전체 총계포함)를 출력하세요
       
       String prod1 = args[0];
       int prod1_price = Integer.parseInt(args[1]);
       int prod1_num = Integer.parseInt(args[2]);
       
       String prod2 = args[3];
       int prod2_price = Integer.parseInt(args[4]);
       int prod2_num = Integer.parseInt(args[5]);
       
       int total = prod1_price*prod1_num + prod2_price*prod2_num;
       
       System.out.println("물건명1: "+prod1);
       System.out.println("가격1: "+prod1_price);
       System.out.println("갯수1: "+prod1_num);
       System.out.println("물건명2: "+prod2);
       System.out.println("가격2: "+prod2_price);
       System.out.println("갯수2: "+prod2_num);
       System.out.println("전체 총계: "+total);
       
       // 10. Scanner의 처리방법을 간단한 예제와 함께 기술하세요
       
       // 자바 기본 내장 입/출력 개체
       // System.out : 출력 처리(콘솔)
       // System.in : 입력(콘솔)
       
       // Scanner sc = new Scanner(System.in); ==> 콘솔에 입력한 값을 받을 수 있다.
       // 또한, 필수적으로 ctrl+shift+o를 통해 import java.util.scanner를 입력해야 쓸 수 있다.
       
       Scanner sc = new Scanner(System.in);
       System.out.print("좋아하는 가수를 입력해주세요 ");
       String singer = sc.nextLine();
       System.out.println("입력된 가수의 이름: "+singer);
       
       // 11. Scanner객체를 활용하여 타율계산방법을 확인(검색)하고, 선수명, 타석수, 안타수를 입력 받아 해당 타자의 타율을 출력하세요
       
       System.out.print("타자의 이름을 입력해주세요 ");
       String hitter = sc.nextLine();
       System.out.print("타석수를 입력해주세요 ");
       int hitterNum = Integer.parseInt(sc.nextLine());
       System.out.print("안타수를 입력해주세요 ");
       int singleHit = Integer.parseInt(sc.nextLine());
       
       System.out.println(hitter+"의 타율은 "+(hitterNum/(double)singleHit)+"입니다.");
       
       // 12. 비교연산자의 종류를 예시와 함께 기술하세요.
       // 비교 연산자
       // ==,!=,<,>,<=,>=
       
       int point = 40;
       boolean isCorrect = point == 60;
       boolean isCorrect1 = point != 60;
       boolean isCorrect2 = point <= 60;
       boolean isCorrect3 = point >= 60;
       boolean isCorrect4 = point > 60;
       boolean isCorrect5 = point < 60;
       
       System.out.println(isCorrect);
       System.out.println(isCorrect1);
       System.out.println(isCorrect2);
       System.out.println(isCorrect3);
       System.out.println(isCorrect4);
       System.out.println(isCorrect5);
       
       // 13. Scanner를 활용하여 나이를 입력 받아 성인(18이상)여부를 출력하세요 

       System.out.print("나이를 입력하세요 ");
       int age1 = Integer.parseInt(sc.nextLine());
       boolean isAdult = age1>=18;
       System.out.println("성인 여부: "+isAdult);
       
       // 14. 논리연산자의 종류를 예제와 함께 기술하세요
       
       // 논리연산자 종류
       // && : (and) 논리합 두가지 비교연산자가 모두 true일 떄, true 그 외에는 false
       
       int science = 90;
       int society = 100;
       int kor = 85;
       int eng = 90;
       
       
       boolean isPass = science>=90 && society>=90 && kor>=90 && eng>=90;
       
       System.out.println("심화반에 들어 갈 수 있는 지 여부: "+isPass);
       
       // || : (or) 논리곱 두가지 비교연산자 중 하나이상 true이면 true, 둘다 false일 때 false
       
       int age_park = 65;
       boolean isFree = age_park<5 || age_park>=65;
       System.out.println("공원 무료 입장 가능 여부: "+isFree);
       
       // ! : 비교연산식이나 논리연산식의 결과가 true이면 false로, false이면 true로 처리
       
       int price01 = 18000;
       boolean price30000 = price01>30000;
       boolean priceNot30000 = !price30000;
       System.out.println("상품 가격이 3만원보다 비싼 지 여부: "+price30000);
       System.out.println("상품 가격이 3만원보다 싼 지 여부: "+priceNot30000);
       
   }

}