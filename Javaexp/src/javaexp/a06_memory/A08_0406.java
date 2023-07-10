package javaexp.a06_memory;

public class A08_0406 {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      
      //1. http://localhost:8080/frontWeb/a01_start/a01_show.html를 브라우저를 통해 실행했다고 한다.
        // 위 url의 각 구성요소의 의미를 기술하세요
      
      /*
       1) localhost는 서버/클라이언트가 같이 있는 현재 pc
       2) 8080: port 중 하나이며 port는 여러 개의 서비스의 데이터를 따로따로 받기 위한 입구이다.
          ex) 아파트 동 호수 => ip: 아파트 동  port: 아파트 호수
       3) frontWeb/a01_start/a01_show.html : pc내에 있는 파일 접근하는 물리적 경로
       */
      
      //2. 문자를 강조하는 태그들의 각 기능을 간단한 예제를 통해 기술하세요.
      /*
      b : 진하게      
        strong : 강조
        em : 강조
        i : 이탤릭체(기울임)
        small : 한단계 작은 문자 처리
        del : 사선 처리
        ins : 추가
        sup : 위첨자
        sub : 아래 첨자
        mark : 하일라이팅
        
        <b>중요한 내용</b>
        <strong>입니다.</strong>
        <em>잘 들으세요</em>
        <b><i>중복도 가능합니다.</i></b>
        <del>사선이 그어진다.</del>
        <ins>추가 태그</ins>
      */
      
      //3. 특수문자를 처리하는 코드를 예제를 통해 기술해 보세요
      // html은 기본적으로 띄어쓰기나 <,>를 특수한 코드를 통해 화면에 나타낼 수 있다.
      /*
       기본형식은 &코드영문명;
       &lt; = less than (<)
       &gt; = greater than (>)
       &quot; &#34; = ""
       &divide; = ÷
       
        50 &divide; 5 = 10
        &lt; 중요합니다 &gt; 
        
       */
      
      //4. html에서 줄바꾸기와 공백에 대한 처리방식을 2가지가 있다. 일단, 기본 코드로 처리되는 내용을 예제와 함께 설명하고, 
      //   두번째 방식에 대한 내용을 예제와 함께 기술하세요  
      
      /*
       1) 기본코드
       <br> : 줄바꾸기
       <h1>Painkiller</h1><br>
       <h2>가수: Ruel</h2><br>
       
       &nbsp : 공백
       안녕 &nbsp;&nbsp;&nbsp; 하세요
       
       2) 두 번째 방식 
       
       줄바꾸기
       
       p,div,ul,h1 같은 블록 태그를 사용하는 것
       
       <div>
       You keep me close<br>
         You keep me close<br>
         I got front row seats for the parkside livin'
         Feel like the one but I'm one in a billion 
       </div>
       
       <div>
       Teenage cynical, and I don't really know
       </div>
       
       공백
       
       pre 태그 사용하기
       
       <pre>
          태그를 사용하면 
                그대로
                출력이 된다.
       </pre>
       */
      
      //5. html에서 h1~h6, 속성 align, hr, br, p태그를 활용하여, 
      // 위키백과사전에서 검색된 자바, ajax, jsp, 스프링의 내용을 각 과목의 타이틀과 함께 웹화면에 출력되게 하세요
      
      /*
      <!DOCTYPE html>
      <html lang="en">
          <head>
              <meta charset="UTF-8">
              <title>프로그램 개요</title>
          </head>
          <body>
              <p>
                  <h1 align="center" title="Java 개요">Java</h1>
                  <h2 align="center">
                      썬 마이크로시스템즈에서 1995년에 개발한 객체 지향 프로그래밍 언어. 창시자는 제임스 고슬링이다.<br> 
                      2010년에 오라클이 썬 마이크로시스템즈를 인수하면서 Java의 저작권을 소유하였다.<br> 
                      현재는 OpenJDK는 GPL2이나 오라클이 배포하는 Oracle JDK는 상업라이선스로 2019년 1월부터 유료화정책을 강화하고 있다.<br> 
                      Java EE는 이클립스 재단의 소유이다. Java 언어는 J2SE 1.4부터는 Java Community Process (JCP)에서 개발을 주도하고 있다.<br>

                  </h2>
              </p>
              <hr>
              <p>
                  <h1 style="color:red" align="center" title="Ajax 개요">Ajax</h1>
                  <h3 align="center">
                      개념적으로 1999년 3월에 이미 정립되어 있었지만, 용어 자체는 2005년 2월 18일 Jesse James Garrett에 의해 처음 사용되었다.<br> 
                      이름에 XML이라고 명시되어있긴 하지만 JSON이나 일반 텍스트 파일과 같은 다른 데이터 오브젝트들도 사용 가능해서 <br>
                      요즘엔 XML을 잘 안 쓰고 십중팔구 JSON을 다룬다. 용어와 실제 기술간의 차이가 커져서 요즘에는 약어가 아닌 고유명사 취급하고 있다.<br> 
                  </h3>
              </p>
              <hr>
              <p>
                  <h1 align="center" style="color:aquamarine" title="jsp 개요">jsp</h1>
                  <h3 align="center">
                      Java[1]를 이용한 서버 사이드 템플릿 엔진이다. jsp 는 자바를 웹서버에서 쉽게 쓰기 위한 기술이며 언어가 아니다.<br> 
                      Java Server Pages의 약자이며, 오라클에서 자바상표권 문제로 오픈소스인 jsp는 자카르타 서버페이지로 이름을 바꾸었다.<br> 
                      Java의 점유율을 대폭 상승시킨 1등공신이다. 같은 부류에 속하는 것으로 ASP가 있다.<br> 
                  </h3>
              </p>
              <hr>
              <p>
                  <h1 style="color:orange" align="center" title="스프링 개요">SpringFramework</h1>
                  <h4 align="center">
                      Java/Kotlin 기반의 웹 프레임워크.
                      로드 존슨(Rod Johnson)이 2002년에 출판한 저서 Expert One-on-One J2EE Design and Development에서 선보인 소스 코드를 시작으로
                      점점 발전하게 되었다. <br>
                      2003년 6월에 최초로 공개되었다. 
                      2020년 12월 기준 최신 버전은 5.3.2. <br>
                      스프링 프레임워크 프로젝트를 간편하게 설정할 수 있도록 도와주는 서브 프로젝트 스프링 부트가 있으며, <br>
                      현재는 스프링 부트 위주로 기능이 추가되고 있다.
                  </h4>
              </p>
          </body>
      </html>
      */
      
      //6.  html에서 블럭태그와 인라인 태그의 차이점을 유형을 나열하고, 예제를 통해서 특징을 기술하세요
      /*
       블럭 태그는 항상 새 라인에서 시작을 하며 줄바꿈을 기본적으로 포함하고 있다.
       또한, 양 옆의 콘텐츠를 배치하지 않고 한 라인을 모두 독점한다.
       p,div,ul,h1
       
       인라인 태그는 블럭 속에 삽입되어 블럭의 일부로 동작하며 줄바꿈을 기본적으로 포함하지 않는다.
       span, strong, img, a
       
       <div>
       사랑은 은하수 다방 문 앞에서 만나
       <span>홍차와</span>냉커피를 마시며,
       <span>매일 똑같은 노래</span>를 듣다가 온다네
       </div>
       */
      
      //7. 2차원배열의 선언과 할당에 대하여 기본 코드로 설명하세요
      // 1) 선언
      int exBus[][] = new int[3][10];
      
      // 2) 할당
      exBus[0][0] = 1;
      exBus[0][1] = 1;
      
      // 8. 2차원으로 회원아이디, 회원명, 회원등급을 설정하여 회원2명을 할당하여 처리할려고 한다.
        // 초기화하고, 데이터를 입력 후, 반복문을 통해서 출력하세요 
      
      
      String[][] members = new String[2][3];
      members[0][0] = "himan";
      members[0][1] = "홍길동";
      members[0][2] = "플래티넘";
      members[1][0] = "helloWorld";
      members[1][1] = "김길동";
      members[1][2] = "VIP";
      
      String[] names = {"아이디","회원명","회원등급"};
      
      for(int idx=0;idx<members.length;idx++) {
         for(int mdx=0;mdx<members[idx].length;mdx++) {
            System.out.print(idx+1+"번째 회원의 ");
            System.out.print(names[mdx]+"\t");
            System.out.println(members[idx][mdx]);
            
         }
      }
      
      // 9.반에 학생이 30명, 5개반에 임의의 점수(0~100)을 할당하고 점수를 아래와 같이 출력하세요
        // 1반 1번 @@ 점...
      
      int point[][] = new int[5][30];
      
      for(int idx=0;idx<point.length;idx++) {
         for(int pdx=0;pdx<point[idx].length;pdx++) {
//          int point2 = (int)(Math.random()*101);
            point[idx][pdx] = (int)(Math.random()*101);
        	System.out.print(idx+1+"반 ");
            System.out.print(pdx+1+"번 ");
            System.out.println(point[idx][pdx]+"점");
         }
      }
      
      
      // 10. 객체의 데이터 처리 선언, 초기화, 객체 생성,  
      // 호출의 각 단계별로 메모리할당 과정과 의미를 문자열과 숫자형 배열의 예로 설명하세요

      // 선언
      int[] arry;
      // 초기화1
      arry = null;
      // 초기화2(초기값 0으로 할당)
      arry = new int[3];
      // 초기화3(초기화 데이터 할당)
      arry = new int[] {1000,2000,3000};
      // 선언, 데이터 할당 초기화
      int[] arry1 = {2000,3000,4000};
      // 사용(호출/할당)
      System.out.println(arry[0]);
      arry[0] = 5000;
      
      
      // 선언
      String str01;
      // 초기화1
      str01 = null;
      // 초기화2(할당)
      str01 = "hello";
      String str02 = new String("hello");
      // 사용(호출/재할당)
      System.out.println(str01);
      str01 = "Good Day!";
      // 문자열의 경우 문자열 자체에 대한 비교시 equlas()사용
       System.out.println(str01.equals(str02));
      
      
      
   }

}
