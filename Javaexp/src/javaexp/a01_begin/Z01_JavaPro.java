package javaexp.a01_begin;

public class Z01_JavaPro {

	public static void main(String[] args) {
		
		 // 1. Z01_JavaPro.java 실행과정
        /*
         (1) Z01_JavaPro.java 소스코드 작성
         (2) javac Z01_JavaPro.java
         (3) Z01_JavaPro.class 생성
         (4) java Z01_JavaPro main()메서드가 있으면 실행된다 
         */
        
        // 2
        
        String name = "노현우";
        int age = 26;
        int height = 170;
        String music = "Heat waves";
        int music_year = 2020;
        String pay1 = "육개장";
        String pay2 = "아이스 아메리카노";
        int pay1_price = 10000;
        int pay2_price = 1600;
        
        System.out.println("이름: "+name);
        System.out.println("나이: "+age);
        System.out.println("키: "+height);
        System.out.println("좋아하는 음악명: "+music);
        System.out.println("발매연도: "+music_year);
        System.out.println("지출목록과 비용: "+pay1+" "+pay1_price+" "+pay2+" "+pay2_price);
        System.out.println("총 비용: "+(pay1_price+pay2_price));
        
        //3
        
        System.out.print("제 이름은 ");
        System.out.println("노현우입니다.");
        System.out.println("반갑습니다\t안녕하세요");
        System.out.println("제 이름은 \"노현우\"입니다");
        System.out.println("제 이름은 '노현우'입니다");
        System.out.println("1.국어\n2.화학\n3.수학");
        
        //4
        
        int gameyear = 2020; //(X)
        //int 1gameyear = 2020; (X)
        //int for = 2020; (X)
        int game_year = 2020; //(O)
        int game$year = 2020; //(O)
        int gameYear = 2020; // (O)
        
        //5
        
        //기본 데이터 유형 (숫자형-정수)
        
        byte num01 = 20;
        char num02 = 65;
        short num03 = 40;
        int num04 = 50;
        long num05 = 98000000L;
        
        //숫자형 - 실수
        
        float num06 = 3.14F;
        double num07 = 3.14;
        
        System.out.println(num01);
        System.out.println(num02);
        System.out.println(num03);
        System.out.println(num04);
        System.out.println(num05);
        System.out.println(num06);
        System.out.println(num07);
        
        
        //문자형
        
        char str0 = 'A';
        System.out.println(str0);
        
        //논리형
        
        boolean boo1 = false;
        System.out.println(boo1);
        
        // 6
        
        // 기본 데이터 타입 형변환
        
        byte num08 = 127;
        long num09 = 25900000L;
        
        // num08 = num09; (X) 데이터 유형 기준이기 때문에 long 타입은 byte 타입보다 더 큰 범위를 커버하므로
        // 그대로 대입하였을 때 오류가 발생한다. 따라서 Casting 작업이 필요하다.
        num08 = (byte)num09; // 하지만 이렇게 했을 때 long 타입의 숫자가 byte 타입보다 크므로 2진수로 변환했을 때 
                        // 잘려서 출력되서 원하는 숫자가 출력되지 않는다.
        System.out.println(num08);
        
        // 정수 ==> 실수
        int num10 = 45;
        double num11 = (double)num10;
        
        System.out.println(num11);
        
        
        // 실수 ==> 정수
        double num12 = 34.333;
        int num13 = (int)num12;
        
        System.out.println(num13);
        
        // 나눗셈
        
        int num14 = 40;
        int num15 = 9;
        
        System.out.println(num14/num15);
        System.out.println(num14/(double)num15);
        System.out.println((double)num14/num15);
        System.out.println((double)num14/(double)num15);
        
        
        // 객체형 형변환
        // (1) 정수형문자열을 정수로 변환
        String str1 = "34";
        int num16 = Integer.parseInt(str1);
        System.out.println(num16+100);
        
        // (2) 실수형문자열을 실수로 변환
        String str2 = "34.144";
        double num17 = Double.parseDouble(str2);
        System.out.println(num17+200);
        
        
        // 7
        
        int num18 = 2100000000;
        int num19 = 1500000000;
        
        long total = (long)num18 + (long)num19;
        
        System.out.println(total);
        
        // 8
        
        char code1 = 'C';
        char[] code2 = {'J','A','V','A'};
        System.out.println(code1);
        System.out.println(code2);
        
        // 9
        
        // 알파벳 코드값 범위
        
        System.out.println((int) 'A');
        System.out.println((int) 'B');
        System.out.println((int) 'C');
        System.out.println((int) 'D');
        System.out.println((int) 'E');
        System.out.println((int) 'F');
        System.out.println((int) 'G');
        System.out.println((int) 'H');
        System.out.println((int) 'I');
        System.out.println((int) 'J');
        System.out.println((int) 'K');
        System.out.println((int) 'L');
        System.out.println((int) 'M');
        System.out.println((int) 'N');
        System.out.println((int) 'O');
        System.out.println((int) 'P');
        System.out.println((int) 'Q');
        System.out.println((int) 'R');
        System.out.println((int) 'S');
        System.out.println((int) 'T');
        System.out.println((int) 'U');
        System.out.println((int) 'V');
        System.out.println((int) 'W');
        System.out.println((int) 'X');
        System.out.println((int) 'Y');
        System.out.println((int) 'Z');
        
        // 문자 0~9 코드값 범위
        System.out.println((int)'0');
        System.out.println((int)'1');
        System.out.println((int)'2');
        System.out.println((int)'3');
        System.out.println((int)'4');
        System.out.println((int)'5');
        System.out.println((int)'6');
        System.out.println((int)'7');
        System.out.println((int)'8');
        System.out.println((int)'9');
		 
		
	}

}
