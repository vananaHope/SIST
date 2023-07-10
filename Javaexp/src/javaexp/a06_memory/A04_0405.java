package javaexp.a06_memory;

import java.util.Scanner;

public class A04_0405 {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      
      //1. 자바의 주요 메모리 2개의 유형에 따른 활용 내용을 기술하세요.
      /*
       자바의 주요 메모리 유형은 stack과 heap이 있다.
       작은 물건과 큰 물건이 있으면 작은 물건은 바로 할당하고 큰 물건은
       영역을 따로 설정하여 저장하는 것이 효율적이다
       따라서 작은 물건은 stack이라는 영역에 저장하고 큰 물건은 heap영역에 저장한다.
       또한, stack영역에는 큰 물건의 위치를 바로 찾을 수 있도록 큰 물건이 위치한 주소값을 저장한다.
       
       도서관과 서점을 비유하면 훨씬 이해하기 편하다.
       단말기(컴퓨터)를 통해 물건의 위치를 찾고 그 위치 값을 출력해주는 것으로 
       stack과 heap영역을 사용하는 것으로 비유하면 이해하기 쉽다.
       */
      
      //2. 배열의 구성요소를 예제를 통해서 기술하세요
      /*
       배열의 구성요소에는 배열의 데이터 유형 / index / 배열.length가 있다.
       
       1) 배열 데이터 유형
          기본 데이터 유형, 문자열, 사용자가 정의한 클래스를 활용한 객체
       
       2) 배열의 index
          각 데이터가 저장된 저장 위치가 "index"
          index는 0부터 시작하며 
          배열명[0]을 통해 호출을 할 수 있고
          배열명[1] = "hello world" 를 통해 데이터를 할당할 수도 있다.
          
       3) 배열의 크기
          배열명.length를 통해 배열의 크기를 가져올 수 있다.
       */
      
      //3. 배열의 선언, 할당, 사용 형식을 여러가지 데이터 유형에 따라 구분하여 출력하세요
      
      
      // 1) 배열의 선언
      // 데이터유형[] 배열명;
      // 데이터유형 배열명[];
      // ex) int[] arry01;
      //     String arry02[];
      // 2) 배열의 할당
      // 배열명 = null;
         String[] arry01;
         arry01 = null;
      // 배열명 = new 데이터유형[배열의 크기];
         String[] arry02;
         arry02 = new String[3];
       // heap영역에 할당은 되었지만 default 값으로 저장되어있다.
       // 숫자는 0 , boolean은 false, 객체유형은 null이다.
         int[] arry03; 
         arry03 = new int[3];
         arry03[0] = 1;
         arry03[1] = 2;
         arry03[2] = 3;
         
         System.out.println(arry03[0]);
         
         String[] arry04 = {"사과","바나나","키위"};
         
      //4. 배열의 전체 데이터를 처리할 때 for문을 사용한다. 
      //    배열의 속성에 따라서 어떻게 활용되는지 예제를 통해 기술하세요.
      
       System.out.println("랭킹\t팀이름");
      String[] arry05 = {"맨체스터 유나이티드","첼시","토트넘"};
      for(int idx=0;idx<arry05.length;idx++) {
         System.out.print(idx+1+"순위\t");
         System.out.print(arry05[idx]+"\n");
      }
      
      // # index가 같은 배열의 경우 연관관계를 통해 출력할 수 있다.
      System.out.println("랭킹\t팀이름\t승점");
      String[] arry06 = {"흥국생명","현대건설","한국도로공사"};
      int[] arry07 = {80,70,60};
      
      for(int idx=0;idx<arry06.length;idx++) {
         System.out.print(idx+1+"순위\t");
         System.out.print(arry06[idx]+"\t");
         System.out.print(arry07[idx]+"\n");
      }
      
      //5. 배열로 점수를 3개를 초기화하여, 
      // 반복문과 Scanner를 통해서 데이터를 입력되게 하고, 총계과 평균을 출력하세요
      Scanner sc = new Scanner(System.in);
      int[] point = new int[3];
      int totPoint = 0;
      
      for(int cnt=1;cnt<=3;cnt++) {
         System.out.print(cnt+"번째 점수를 입력해주세요 ");
         int inputPoint = sc.nextInt();
         System.out.println("입력한 점수: "+inputPoint);
         totPoint += inputPoint;
         for(int idx=0;idx<point.length;idx++) {
            point[idx] = inputPoint;
               
         }
         
      }   
      System.out.println("총계: "+totPoint);
      System.out.println("평균: "+totPoint/point.length);
      
      //6. 배열 3개에 각각 학생명, 국어, 영어를 할당하여, 반복문을 통해서 출력하세요. 
      String[] names = {"홍길동","김길동","신길동"};
      int[] kor = {70,90,80}; 
      int[] eng = {95,80,85};
      
      for(int idx=0;idx<kor.length;idx++) {
         System.out.print(names[idx]+"\t");
         System.out.print(kor[idx]+"\t");
         System.out.print(eng[idx]+"\n");
      }
      
      //7. 배열로 가위,바위,보라고 선언한 후, 
      // 두 친구가 index 0~2 사이에 임의로 호출하여, 임의의 가위/바위/보를 출력하게 하세요
      
      String[] rGame = {"가위","바위","보"};
      
      int f1 = (int)(Math.random()*3); 
      int f2 = (int)(Math.random()*3); 
      
      System.out.println("첫 번째 친구: "+rGame[f1]);
      System.out.println("두 번째 친구: "+rGame[f2]);
      
      
      
      //8. 웹서버와 웹클라이언트는 어떤 프로그램으로 실행되는지? 
      // network환경과 함께 기술해보세요
      
      /*
       웹 서버는 apache tomcat과 같은 Web Application Server와
       Live Server와 같은 Web server가 있다.
       
       web server는 단순히 html 코드에 따라 화면을 출력해주는 역할을 하며
       web application server는 자바와 같은 애플리케이션을 활용해 db서버와 연결하여 
       클라이언트의 요청에 따라 다른 화면을 보여주거나 db서버의 데이터를 가져와 로그인 기능을 구현하는 등의
       다양한 곳에 활용된다.
       
       서버와 클라이언트 개념으로 웹서버가 데몬으로 구축되어 실행되고 
       클라이언트는 ip/port/경로의 자원명으로 접근하여 html코드를 랜더링한다.
       
       웹 클라이언트는 크롬과 같은 웹 브라우저 프로그램으로 실행되며 서버로부터 전송받은 html 코드를
       해석하여 클라이언트의 화면에 띄워주는 역할을 한다.
       */
      
      //9. 오늘 eclipse와 vscode를 통해서 설정한 
      // 웹환경과 초기 화면 로딩을 위해 필요한 설정 부분을 기술해보세요
      /*
       웹 프로그래밍 환경설정 문서 참고      
       */
      
      //10. html을 구성하고 있는 기본 계층구조의 태그들의 내용을 기술하세요. 
      /*
       # 기본구조
          상위태그
             중간태그
                하위태그
                
                /하위태그
             /중간태그
          /상위태그
          
       <!Doctype html> 을 통해 html dtd 파일을 불러온다.
       <html> : 최상위 태그
       <head> : 차상위 태그로서 <body>가 가지고 있는 메타정보를 포함한다.
                화면을 화려하게 구성하거나 기능을 넣기위한 css나 js 정보 등이 들어가며
                body에 들어갈 화면 출력 방식(encoding)이 들어간다.
       <body> : 실제 화면을 구성하는 처리를 한다.           
           
       */
      
      //11. html에서 사용하는 3가지 언어의 예제를 통해서 기술하세요
      /*
       1) html : 웹 페이지의 기본 구조와 뼈대를 구성하는 역할을 한다.
       ex) <html></html> <head></head> <body></body> 
           <h1>안녕하세요</h1>
       2) css : 웹 페이지를 화려하게 꾸미는 역할을 한다.
       ex) style = "color:blue"
       		<style> h2{background-color:blue;} </style> 
       3) js : 웹 페이지의 동적인 처리와 front단 범위 안에서 응용 프로그램을 처리
       ex) <h1 onclick="chColor(this)">안녕하세요</h1>   
        	<script>
        		function chColor(obj) {
        			obj.style.color = "blue";
        		}
        	</script>
       */

   }

}
