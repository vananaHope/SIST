package javaexp.z01_home;

public class A13_0420 {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      // 1. 다형성을 대한 내용에 대하여 정리해보자.
//         1) 다형성을 위해 오버라이딩을 사용하는 이유를 아는가?
      /*
       상위 클래스에서 상속받은 메서드를 하위 클래스에서 재정의하여 다양한 기능으로 활용하기 위해서 오버라이딩을 사용합니다.
       */
//         2) 다형성을 처리하기 위한 클래스 구조를 이해하고 만들 수 있는가?
      /*
       조원들과 함께 3번 문제를 풀면서 다형성 처리를 위한 클래스 구조의 이해도를 높이고 숙지했습니다.
       
       1. 상위 클래스 	class Part
       		공통 필드 	String name(부품명)
       		오버라이딩 메서드	 void showInfo()
       		
       2. 상속받는 하위 클래스(계속 추가)
       		상위 생성자를 호출하는 생성자 super("CPU")
       		오버라이딩 메서드	 void showInfo()
       						super.showInfo()
       		
       3. 위 내용을 다형성 처리를 하는 클래스
       		class 포함할 클래스 { 	class Computer
       			고유 필드			String company
       			상위 클래스 참조명	Part part
       			하위 클래스를 추가할 메서드		void addPart(Part part)
       				void addXXXX(상위 클래스 참조명){}
       			void showInf() 전체정보를 표현할 메서드
       									void showAll()
       										if(part!=null)
       			
       		}
       
       
       */
//         3) 상위클래스를 다각형으로 하고, 하위 클래스를 삼각형, 사각형, 오각형으로 선언하여, 필드 kind, 기능메서드 drawing()을 처리하여 출력되게 하세요
//         삼각형 ==> 삼각형 모양으로 (세모난 새집을 그리다.), 사각형 ==> 사각형 모양으로 (네모난 빌딩을 그리다)...
      
      /*
       class Polygon{
         private String kind;
      
         public Polygon(String kind) {
            this.kind = kind;
         }
         public void drawing() {
            System.out.println(kind+" 모양으로");
         }
      }
      class Triangle extends Polygon{
         public Triangle() {
               super("삼각형");
            }
            public void drawing() {
               super.drawing();
               System.out.println("세모난 새집을 그리다.");
         }
      }
      
      
      
      class Square extends Polygon{
            public Square() {
                  super("사각형");
               }
               public void drawing() {
                  super.drawing();
                  System.out.println("네모난 빌딩을 그리다.");
            }
         
         
      }
      
      class Pentagon extends Polygon {
            public Pentagon() {
               super("오각형");
            }
            public void drawing() {
               super.drawing();
               System.out.println("오각인 옥타곤을 그리다");
         }
      }
       */
      
      // 2. 선택자 중에서 계층적 선택자의 종류와 특징을 기본예제와 함께 기술하세요
      /*
       1. 자식 선택자
          부모 자식 관계는 > 를 통해 표시한다.
          적용은 해당 부모를 가직 자식 요소 객체에 적용된다.
          부모 > 자식 {속성:속성값;}
       
       2. 자손 선택자
          계층 레벨 바로 밑을 포함해서 여러 계층이 있더라도 바로 적용되는 것을 말한다.
          상위 하위 {속성:속성값;}
          
           <!DOCTYPE html>
         <html lang="en">
         <head>
             <meta charset="UTF-8">
             <meta http-equiv="X-UA-Compatible" content="IE=edge">
             <meta name="viewport" content="width=device-width, initial-scale=1.0">
             <title>Document</title>
             <style>
                 div > h2 {background-color: yellow;}
                 .cls01 .cls02 {color: blue;}
             </style>
         </head>
         <body>
             <div class="cls01">
                 <p>
                     <h2 class="cls02">홍길동입니다.</h2>
                 </p>
             </div>
         </body>
         </html>
        
        
       */
      
      
      // 3. 속성 선택자 종류를 기본예제와 함께 기술하세요
      /*
       1. 선택자[속성=속성값]
       2. [속성]
       3. [속성=속성값]
       
       <!DOCTYPE html>
      <html lang="en">
      <head>
          <meta charset="UTF-8">
          <meta http-equiv="X-UA-Compatible" content="IE=edge">
          <meta name="viewport" content="width=device-width, initial-scale=1.0">
          <title>Document</title>
          <style>
              h2[align=center]{color: brown;}
              [type]{background-color: yellow;}
              [name="banana"]{color: blue;}
          </style>
      </head>
      <body>
          <h2 align="center">좋아하는 과일</h2>
          <table width="25%" border="1">
              <tr><td>딸기</td></tr>
              <tr><td name="banana">바나나</td></tr>
              <tr><td>키위</td></tr>
              <tr><td colspan="2"><input type="submit" value="제출"></td></tr>
          </table>
      </body>
      </html>
       
       */
      
      // 4. 회원등록화면을 table안에 만들고, 전체선택자와 속성선택자의 단계(선택자[속성=속성값],[속성=속성값],[속성])에 따라 css가 다르게 선언된 것을 적용되게 하세요
      
      /*
       <!DOCTYPE html>
      <html lang="en">
      <head>
          <meta charset="UTF-8">
          <meta http-equiv="X-UA-Compatible" content="IE=edge">
          <meta name="viewport" content="width=device-width, initial-scale=1.0">
          <title>Document</title>
          <style>
              form *{font-size: 20px;}
              [type=text]{color: blue;}
              [value]{background-color: yellow;}
          </style>
      </head>
      <body>
          <h2 align="center">로그인 화면</h2>
          <form>
              <table border="1" align="center">
                  <tr><th>아이디</th>
                  <td><input type="text" name="id" size="5"></td></tr>
                  <tr><th>비밀번호</th>
                  <td><input type="password" name="password" size="5"></td></tr>
                  <tr><td colspan="2" align="center"><input type="submit" value="회원 등록"></td></tr>
              </table>
          </form>
      </body>
      </html>
       */
      
      // 5. 가상클래스의 종류를 간단한 예제와 함께 기술하세요.
      /*
       <!DOCTYPE html>
      <html lang="en">
      <head>
          <meta charset="UTF-8">
          <meta http-equiv="X-UA-Compatible" content="IE=edge">
          <meta name="viewport" content="width=device-width, initial-scale=1.0">
          <title>Document</title>
          <style>
             h2:hover{background-color: yellow;}
             h3:active{color: darkred;} 
             input:focus{background-color:aquamarine;}
             p:first-letter{font-size: 30px;}
             div:first-line{color: blue;}
             h1:nth-child(3n+4){color: orange;} 
          </style>
      </head>
      <body>
          
          <h1>환영합니다.</h1>    
          <h1>환영합니다.</h1>    
          <h1>환영합니다.</h1>    
          <h1>환영합니다.</h1>    
          <h1>환영합니다.</h1>    
          <h1>환영합니다.</h1>    
          <h1>환영합니다.</h1>    
          <h1>환영합니다.</h1>    
          <h1>환영합니다.</h1>    
          <h1>환영합니다.</h1>    
          <h1>환영합니다.</h1>    
          <h1>환영합니다.</h1>    
          <h1>환영합니다.</h1>  
          <h2>안녕하세요</h2>
          <h3>반갑습니다.</h2>  
          <form>
              <table>
                  <tr><td><input type="text"></td></tr>
                  <tr><td></td></tr>
                  <tr><td></td></tr>
              </table>
          </form>
          <p>
              홍길동입니다.<br>
              라면을 좋아합니다
          </p>
          <div>
              남자입니다.<br>
              축구를 좋아합니다.
          </div>
      </body>
      </html>
       */
      
      // 6. 다형성을 위한 상위 클래스를 멤버(필드,생성자,재정의메서드) 예제와 함께 설명하세요.
      
      /*
       class Sports {
         private String kind; // 필드
         public Sports(String kind) { // 생성자
            this.kind = kind;
         }
         
         public void playing() { // 메서드
            System.out.println(kind);
         }
         
      }
       */
      
      // 7. 다형성을 위한 하위 클래스의 구성을 예제와 함께 설명하세요
      /*
        class Soccer extends Sports {
         public Soccer() {
            super("축구"); // 상위 클래스의 String 매개변수를 받는 Sports 생성자를 호출
         }
         public void playing() {
            super.playing(); // 상위 클래스에게서 상속받은 playing 메서드를 호출
            System.out.println("를 합니다.");
         }
      }
       */
      
      
   }

}

class Sports {
   private String kind; // 필드
   public Sports(String kind) { // 생성자
      this.kind = kind;
   }
   
   public void playing() { // 메서드
      System.out.println(kind);
   }
   
}

class Soccer extends Sports {
   public Soccer() {
      super("축구"); // 상위 클래스의 String 매개변수를 받는 Sports 생성자를 호출
   }
   public void playing() {
      super.playing(); // 상위 클래스에게서 상속받은 playing 메서드를 호출
      System.out.println("를 합니다.");
   }
}