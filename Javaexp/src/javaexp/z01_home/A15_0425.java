package javaexp.z01_home;

public class A15_0425 {

   public static void main(String[] args) {
      // 1. 예외 처리의 기본형식 코드는 수행시키고, 해당 코드가 의미하는 바를 구체적으로 기술하세요.
      try { // try문 안에 에러가 발생할만 한 코드를 집어넣는다.
           // 에러가 발생하면 발생한 구문이후에 있는 것들은 실행되지 않고 바로 catch문으로 넘어간다.
         System.out.println("# 산술 예외 발생 #");
         System.out.println(1/0);
      }catch(ArithmeticException e) {
         // 넘어온 에러를 예외 처리할 코드를 넣는다.
         System.out.println("산술 예외 처리"+e.getMessage()); 
         // e.기능메서드() : 예외에 대한 정보를 처리할 수 있는 정보를 수행
      }
      
      // 2. args로 입력 받게 하고, 물건명 가격 갯수를 입력 받게 하고 입력이 없을 시  "물건정보를 입력하세요!" 라고 예외 처리로 처리되게 하세요.
      try {
         System.out.println("물건명: "+args[0]);
         System.out.println("가격: "+args[1]);
      }catch(ArrayIndexOutOfBoundsException e) {
         System.out.println("물건 정보를 입력하세요!");
      }
      // 3. 실행예외와 컴파일예외의 차이점을 예제로 설명하세요.
      /*
       실행 예외는 컴파일이 되나 이후에 실행할 때 에러가 발생하는 것을 말한다.
       따라서 에러가 발생할 것 같은 코드를 try블럭 안에 넣고 에러가 발생했을 때 예외 처리할 코드를 
       catch블럭 안에 넣어서 테스트를 진행해야 한다. 또한 해당 에러 내용에 대한 예외 내용을 확인할 수 있다.
       
       컴파일 예외는 처음 컴파일 과정부터 진행되지 않는 것을 말한다.
       왼쪽에 빨간색으로 예외 처리 내용이 표시되며 표시된 내용을 try catch문에 넣어 예외 처리를 진행해야 한다.  
       */
      
      // 3. 예외처리의 계층 구조에 따른 선언 순서를 기술하세요.
      /*
       Exception
       
       RuntimeException   ClassNotFoundException   InterruptionException
       
       NullPointerException    NumberFormatException
        
       
       예외를 처리할 때는 계층 구조에 따라 처리해야 하며 가장 작고 세밀한 예외부터 크기에 따라 순서대로 처리해야 한다.
       NullPointerException ==> ClassNotFoundException ==> Exception
       
       또한, 예외 처리에 상관없이 무조건 처리되는 코드를 작성할 때는 finally{}를 이용한다.
       */
      
      // 4. args[0], String name=null;name.toString(); 해당 내용을 구체적 예외는 처리하고, 그외는 Exception처리하는다중예외를 처리하세요.
      String name = null;
      try {
         System.out.println(name.toString());
         System.out.println(args[0]);
      }catch(NullPointerException e){
         System.out.println("데이터 입력 예외 "+e.getMessage());
      }catch(ArrayIndexOutOfBoundsException e) {
         System.out.println("배열 초과 예외: "+e.getMessage());
      }catch(Exception e) {
         System.out.println("기타 예외: "+e.getMessage());
      }
      
      
      
      // 5. 동적처리하는 가상클래스의 내용을 예제와 함께 기술하세요.
   /*
      <style>
          h2:hover{background-color: yellow;} //h2태그에 커서를 가져다 놓았을 때 작동하는 가상 클래스
          h3:active{color: darkred;} //h3태그를 직접 클릭했을 때 동작하는 가상 클래스
          input[type=text]:focus{background-color:aquamarine; color: blueviolet;} input에 한해서 폼 요소에 마우스 클릭으로 포커스를 놓았을 때 동작
          p:first-letter{font-size: 20pt;} p 태그 첫 글자에 적용되는 가상 클래스
          div:first-line{color: blue;} div 태그 첫 라인에 적용되는 가상 클래스
          h1:nth-child(even){color: orange;} h1태그가 붙은 것들 중에서 짝수에 해당하는 것들만 배경 색상을 바꾼다.
          h1:nth-child(odd){color: cadetblue;} h1태그가 붙은 것들 중에서 홀수에 해당하는 것들만 배경 색상을 바꾼다.  
       </style>
       </head>
      <body>
          <h2>안녕하세요</h2>
          <h3>반갑습니다.</h2>
          <h1>딸기</h1>  
          <h1>바나나</h1>  
          <h1>사과</h1>  
          <h1>키위</h1>  
          <h1>망고</h1>  
          <h1>오렌지</h1>  
          <h1>깔라만시</h1>  
          <h1>한라봉</h1>  
          <form>
              <table>
                  <tr><td>이름:<input type="text"></td></tr>
                  <tr><td>나이:<input type="text"></td></tr>
                  <tr><td>사는 곳:<input type="text"></td></tr>
              </table>
          </form>
          <p>
              홍길동입니다.<br>
              라면을 좋아합니다
          </p>
          <div>
              남자입니다.<br>
              영화를 좋아합니다<br>
              축구를 좋아합니다
          </div>
      </body>
       */
      
      // 6. 공통 속성값인 색상 선언 규칙 3가지를 기술하세요
      /*
       1. 색상 이름 표현
        Red, Green, Blue 등 직접 색상명을 입력하여 색상을 선언한다.
       
       2. 16진수로 표현
        #DC143C ==> 2개 단위로 색상 비율 조합을 한다.
        Red - 6A (0~255)
        Green - 2B (0~255)
        Blue - 5E (0~255)
        
       3. 10진수로 표현
       red,green,blue 세 가지 색상을 조합하여 색을 표현한다.
       rgb(153,255,153) - 0~255사이의 값을 입력한다.
       JS에서는 이 형식으로 색상을 표현한다. 
        
       */
      
      // 6. 공통 속성값인 단위(크기,넓이,폭)을 기본예제와 함께 설명하세요
      /*
       1. 절대적 크기
          1) px: 픽셀수   
            2) cm: 센티미터     
            3) mm: 미리미터     
            4) in 인치  1in = 2.54cm = 96px;    
            5) pt: 포인터   1pt = 1in의 1/72의 크기     
            6) pc: 피카소   1pc = 20pt;     
            7) deg: 각도 시계방향 20도 회전      
        
       2. 상대적 크기
           em: 배수    현재 기본 폰트의 n배의 크기
            %: 퍼센트    현재 폰트의 n% 크기
       
       <!DOCTYPE html>
         <html lang="en">
         <head>
             <meta charset="UTF-8">
             <meta http-equiv="X-UA-Compatible" content="IE=edge">
             <meta name="viewport" content="width=device-width, initial-scale=1.0">
             <title>Document</title>
         </head>
         <body>
             <table align="center" width="50%" height="250pt" border="1"> // 테이블 높이는 상대적 크기 적용이 되지 않음
                 <col width="30%"><col width="30%"><col width="30%"> // 상대적 크기
                 <tr><td style="font-size: 2em;">1</td><td style="font-size: 2pc;">2</td><td>3</td></tr> // em은 상대적 크기, pc는 절대적 크기
                 <tr><td style="font-size: 200%;">4</td><td>5</td><td>6</td></tr> // 상대적 크기
             </table>
         </body>
      </html>
       */
   }

}