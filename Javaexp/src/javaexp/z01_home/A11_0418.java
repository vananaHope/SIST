package javaexp.z01_home;

public class A11_0418 {

   public static void main(String[] args) {
      // 1. 오늘 진행한 css 속성을 다른 예제와 함께 기술해보세요.
      /*
      <!DOCTYPE html>
      <html lang="en">
      <head>
          <meta charset="UTF-8">
          <style>
              span {font-size: 30px; background-color: aquamarine; color: crimson;
              text-align: center; margin-left: 30px;}


          </style>
      </head>
      <body>
          <span>안녕하세요 반갑습니다.</span>
      </body>
      </html>
      
      font-size : 폰트 크기를 결정하는 속성
      background-color : 배경색상을 결정하는 속성
      color : 글자의 색상을 결정하는 속성
      text-align : 텍스트 정렬을 나타내는 속성
      margin-left, margin-right : 왼쪽 혹은 오른쪽으로 입력한 크기만큼 margin을 부여하는 속성
       */
      
      
      
      // 2. css 선언 선택자와 함께 선언한 형식을 구성요소별 내용을 예제와 함께 기술하세요
      
      /*
      <!DOCTYPE html>
      <html lang="en">
         <head>
             <meta charset="UTF-8">
             <style>
                 span(선택자) {font-size(속성): 30px(속성값); background-color: aquamarine; color: crimson; text-align: center; margin-left: 30px;}
                 p {font-size: 30px; background-color: beige; color: aquamarine; text-align: center; }

             </style>
         </head>
         <body>
             <span>안녕하세요 반갑습니다.</span>
             <p>
                 저는 불고기를 좋아하고 소고기도 좋아합니다.<br>
                 또한, 축구를 좋아합니다.
             </p>
         </body>
         </html> 
         
         span, p는 선택자이고 font-size, color 등은 속성을 나타내며 이에 대한 값으로 넣은 30px, aquamarine 등이 속성값을 의미한다.
         또한 선택자, 속성, 속성값은 대소문자를 구분하지 않는다.
       */
      
      // 3. css 선언 형식(기본,외부,inline)을 예제를 만들고 설명하세요.
      
      /*
       1) 기본
       <!DOCTYPE html>
       <html lang="en">
       <head>
          <meta charset="UTF-8">
          <style>
              span {font-size: 30px; background-color: aquamarine; color: crimson; text-align: center; margin-left: 30px;}
              p {font-size: 30px; background-color: beige; color: aquamarine; text-align: center; }

          </style>
      </head>
      <body>
          <span>손흥민</span>
          <p>
              토트넘의 공격수로 뛰고 있으며 작년에 득점왕을 차지했다.<br>
              또한, 양발을 자유자재로 쓸 수 있다.
          </p>
      </body>
      </html>
      
      2) inline 태그
       <!DOCTYPE html>
       <html lang="en">
       <head>
          <meta charset="UTF-8">
      </head>
      <body>
          <span style="font-size: 30px; color:grey; text-align:center;">손흥민</span>
          <p style="background-color:darkred; text-align:center;">
              토트넘의 공격수로 뛰고 있으며 작년에 득점왕을 차지했다.<br>
              또한, 양발을 자유자재로 쓸 수 있다.
          </p>
      </body>
      </html>
      
      3) 외부
       <!DOCTYPE html>
       <html lang="en">
       <head>
          <meta charset="UTF-8">
          <link type="text/css" rel="stylesheet" href="css0418.css">
          <style>
          <!-- @import url("css0418.css") import 방식과 link 방식 모두 css를 불러올 수 있다.
          link는 head부분에서 선언하고 import는 style내에서 선언한다.--!>
 
          </style>
      </head>
      <body>
          <span>손흥민</span>
          <p>
              토트넘의 공격수로 뛰고 있으며 작년에 득점왕을 차지했다.<br>
              또한, 양발을 자유자재로 쓸 수 있다.
          </p>
      </body>
      </html>
       */
      
      // 3. 선택자의 종류를 간단한 예제와 함께 기술하세요.
         
      /*
       1. 태그
       2. .클래스명
       3. #아이디명
       
       <!DOCTYPE html>
       <html lang="en">
       <head>
          <meta charset="UTF-8">
          <style>
              .singer {
                  color:aquamarine; 
                  text-align: center;
                  background-color: grey;
              }

              #first {
                  color: blueviolet;
              }
              #second {
                  color:brown;
              }
              #third {
                  color: aliceblue;
              }
          </style>
      </head>
      <body>
          <h1 class="singer">좋아하는 가수 및 노래</h1>
          <h2 class="singer">Ruel</h2>
         
          <p id="first">호주의 싱어송라이터. 만 19세임에도 불구하고 어른스러운 음색과 압도적인 피지컬의 소유자이다.</p>
          <p id="second">2019년도에 <RUEL - READY TOUR IN SEOUL>이라는 제목의 내한 공연을 왔고, 이는 그의 곡 중 하나인</p>
          <p id="third"><not thinkin' bout you>의 뮤직비디오의 배경이 되었던 한국 거리들의 모습을 통해 확인할 수 있다.</p>
          
      </body>
      </html>
       */
      
      
      // 4. webapp하위에 a00_com폴드에 z03_style.css로 h1,h2의 배경색상,글자색을 지정하여, 
      //    현재폴드에서 적용되게 절대 경로로 처리하여 출력하세요.
      /*
      <!DOCTYPE html>
      <html lang="en">
      <head>

          <link type="text/css" rel="stylesheet" href="/frontWeb/a00_com/z03_style.css">
          <meta charset="UTF-8">
      </head>
      <body>
          <h1>안녕하세요 반갑습니다.</h1>
          <h2>홍길동입니다.</h2> 
      </body>
      </html>
      */
      
      // 5. 1:다 관계의 필드기준 예제(필드만 선언, 메서드 처리x)를 만들어 보자
      
      /*
       class DepStore {
          private String dname;
          private Product[] pArray;
          
          public DepStore(String dname) {
             this.dname = dname;
          }
          
       }
       
       class Product {
          private String name;
          private int price;
          private int cnt;
          
          public Product(String name, int price, int cnt) {
             this.name = name;
             this.price = price;
             this.cnt = cnt;
          }
       }
       
       
       */
      
      
      
      // 6. 상속의 기본형식을 알고 접근제어자의 한계와 함께 예제를 만들어 보자.
      
      /*
       class Student extends Teacher {
          
          Teacher t1 = new Teacher();
          t1.teaching;
          
          void callWeight() {
             checkWeight(+5);
             System.out.println("몸무게는 "+getWeight());
          }
          
          
       }
       
       class Teacher {
          private int weight = 68;
          
          void teaching() {
             System.out.println("가르치는 것을 잘한다.")
          }
          
          void checkWeight(int weight) {
             weight+=weight;
             System.out.println("몸무게가 "+(weight>0?"더 늘었다":"같거나 줄었다"));
          }
          
          int getWeight() {
             return weight;
          }
       }
       
       public class exp {

         public static void main(String[] args) {
               // TODO Auto-generated method stub
               Student s1 = new Student();
      
               s1.teaching();
      
               s1.callWeight();
      
      
         }

        }
       
       */
      
      
   }

}