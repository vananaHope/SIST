package javaexp.z01_home;

public class A17_0427 {

   public static void main(String[] args) {
      // 1. 배경이미지관련 속성을 예제와 함께 기술하세요.
      /*
       <!DOCTYPE html>
      <html lang="en">
      <head>
          <meta charset="UTF-8">
          <meta http-equiv="X-UA-Compatible" content="IE=edge">
          <meta name="viewport" content="width=device-width, initial-scale=1.0">
          <title>Document</title>
          <style>
              .cls01{
                  width: 50%; height: 300px; div 폭과 높이 설정
                  background-color: cadetblue; 배경 색상 설정
                  background-image: url(../a06_cssMiddle/media/person01.jpeg); 배경 이미지 불러오는 상대 주소
                  background-position: top right;      배경 이미지 위치 지정
                  background-repeat: no-repeat;   
                  선택자 범위가 배경 이미지보다 큰 경우 배경 이미지 이후 남은 부분에 배경 이미지를 반복할지 여부 설정
                  background-size: 150px 150px;
                  배경 이미지 넓이와 높이를 설정함 
              }
          </style>
      </head>
      <body>
          <div class="cls01"></div>
      </body>
      </html>
       */
      // 2. display의 속성 3개 특징을 예제와 함께 기술하세요
      /*
       <!DOCTYPE html>
      <html lang="en">
      <head>
          <meta charset="UTF-8">
          <meta http-equiv="X-UA-Compatible" content="IE=edge">
          <meta name="viewport" content="width=device-width, initial-scale=1.0">
          <title>Document</title>
          <style>
              h2, span{border: 1px solid orange;}
              
          </style>
      </head>
      <body>
          <div>
              <h2>안녕하세요1(block)</h2> 
              <h2 style="display: inline; width: 100px; height: 100px;">안녕하세요2(block)</h2>
              <h2>안녕하세요3(block)</h2>
              <span>반갑습니다1(inline)</span>
              <span style="display: block; width: 100px; height: 100px;">반갑습니다2(inline)</span>
              <span>반갑습니다3(inline)</span>
              <br>
              <strong style="display: inline-block; width: 150px; height: 150px;">홍길동입니다.</strong>
              <strong>신길동입니다.</strong>
              <strong>마길동입니다.</strong>
          </div>
          
      </body>
      </html>
       
       block은 항상 새로운 라인에서 시작을 하며 옆에 다른 요소 배치가 불가능하다 또한, 넓이와 높이를 조절할 수 있다.
       inline은 항상 바로 옆에서 시작을 하며 옆에 다른 요소를 배치할 수 있다. 하지만 높이와 넓이를 조절할 수 없다.
       inline-block은 바로 옆에서 시작을 하고 옆에 다른 요소를 배치할 수 있다. 또한 높이와 넓이를 조절할 수 있다. 
          ( inline 속성 + block 크기 조절 기능 )
       
       */
      // 3. 배경이미지관련 속성을 예제와 함께 기술하세요. 1번과 동일
      // 4. css 글자 그림자 처리 옵션을 지정하여, 화면에 이름, 나이, 사는 곳을 출력하세요.
      /*
       <!DOCTYPE html>
      <html lang="en">
      <head>
          <meta charset="UTF-8">
          <meta http-equiv="X-UA-Compatible" content="IE=edge">
          <meta name="viewport" content="width=device-width, initial-scale=1.0">
          <title>Document</title>
          <style>
              #name{
                  text-shadow: 2px 2px 3px blue;
              }
              #age{
                  text-shadow: 5px 3px 2px orange;
              }
              #region{
                  text-shadow: 1px 1px 2px cadetblue;
              }
      
          </style>
      </head>
      <body>
          이름:<span id="name">홍길동</span>
          나이:<span id="age">25</span>
          사는 곳:<span id="region">서울</span>
      </body>
      </html>
       */
      // 5. position 옵션을 예제를 통해 기술하세요.
      /*
       <!DOCTYPE html>
      <html lang="en">
      <head>
          <meta charset="UTF-8">
          <meta http-equiv="X-UA-Compatible" content="IE=edge">
          <meta name="viewport" content="width=device-width, initial-scale=1.0">
          <title>Document</title>
          <style>
              
          </style>
      </head>
      <body>
          <h1>절대 위치 설정</h1>
          <div>
             절대 위치는 top,left (왼쪽 상단 꼭지점) / right,bottom (오른쪽 하단 꼭지점) 기준으로 움직인다.
             따라서 자신의 위치는 별로 중요하지 않고 절대 위치 기준으로만 움직인다. 
             그래서 서로 겹치는 경우도 있다. 
              <p style="position: absolute; top: 10px; left: 10px;">좋아하는 음식은</p>
              <span style="position: absolute; bottom: 100px; right: 100px;">한우입니다.</span>
              <span>삽겹살도 좋아합니다.</span>
          </div>
          <div style="border:1px solid blue">
              <h1>상대 위치 설정</h1> 
              div 크기 내에서 자신이 위치한 곳을 기준으로 px단위에 따라 위치를 옮긴다.
              <p style="position: relative; top: 10px; left: 10px;">좋아하는 꽃은</p>
              <p style="position: relative; left: 20px; bottom: 50px;">장미입니다.</p>
          </div>
          
      
      </body>
      </html>
       */
      // 6. Object의 메서드의 기능을 기술하세요.
      /*
       Object는 최상위 클래스로써 모든 클래스가 상속받고 있기 때문에 기본적으로 object의 메서드들을
       재정의하여 모두 사용할 수 있다.
       object의 기능메서드로는 hashcode/equals/clone/toString/finalize 등이 있으며
       hashcode의 경우 10진수로 고유 코드값을 가져온다.
       toString은 참조변수로 호출할 때만 사용되며 패키지명.클래스명@16진수주소값으로 나온다.
       finalize는 deprecated 메서드로써 곧 폐기될 예정인 메서드이다. 
       */
      // 7. 물건명, 가격, 갯수를 필드로 하는 Product클래스를 생성하고 사용하되, 재정의하여 객체 생성 후, 
      // 참조 변수를 호출했을 때, 물건명/가격/갯수/총계를 출력할려면 처리해야 할 내용은?
      Product pd = new Product("바나나",5000,3);
      System.out.println(pd.toString());
      
      // 8. String의 비교연산자의 비교와 equals()처리 형식의 차이점에 대하여 기술하세요
      /*
       String name1 = "김철수";
       String name2 = "김철수";
       String name3 = new String("김철수");
       String name4 = new String("김철수");
       
       name1 == name2 는 같은 메모리에 주소값을 가지고 있기 때문에 true이다.
       name1 == name3 의 경우 name3은 새로운 메모리 영역에 값이 할당되어 name1,2,4와는 다른 주소값을 갖게 되고
       따라서 비교연산자를 통해 비교를 하면 false가 나온다.
       name3 == name4 의 경우에도 각각 새 객체를 생성하여 서로 다른 메모리에 값이 저장되기 때문에 메모리 주소값이 다르다
       따라서 == 를 통해 비교할 시 false가 나온다.
       결론적으로 ==는 메모리 주소값을 비교하기 때문에 문자열 데이터를 비교하기 위해서는 equals를 사용해야 한다.
       */
      // 9. String 생성자의 주요 매개변수를 통한 처리 내용을 기술하세요
      // 시간 부족으로 풀지 못했습니다.
      
      // 10. 임시비밀번호를 알파벳 대소문자 숫자를 조합해서 10자를 만드는 프로그램을 만드세요
      // 숫자 48~57 대문자 65~90 소문자 97~122
      char[] arr1 = new char[10];
      for(int idx=0;idx<arr1.length;idx++) {
         int random = (int)(Math.random()*62+48);
         if(random>57) random+=7;
         if(random>90) random+=6;
         
         arr1[idx] = (char)random;
         
       }
      String str1 = new String(arr1);
      System.out.println("임시 비밀번호: "+str1);
      
      // 11. charAt()를 활용하여, 우리나라에서 가장 많은 성 1~10, 가장 많이 사용하는 이름 중간자, 
      // 가장 많이 사용하는 마지막자를 조합하여 임의의 이름 3개를 출력하세요
      
      String name = "김이박최정강조윤장임";
      String middle = "현승동준학석민웅철영";
      String finalN = "우규혜수희준현주호균";
      
      // first.charAt(0~9)
      // first.charAt(랜덤 범위로 0~9) : 특정한 문자 하나가 랜덤으로 나온다.
      
      for(int i=1;i<=3;i++) {
         System.out.print(i+"번째 이름: ");
         int num1 = (int)(Math.random()*name.length());
         int num2 = (int)(Math.random()*middle.length());
         int num3 = (int)(Math.random()*finalN.length());
         
         char firstN = name.charAt(num1);
         char middleN = middle.charAt(num2);
         char finN = finalN.charAt(num3);
         
         if(firstN == finN || middleN == finN) {
            System.out.print("(중복이 발생) ");
            int num4 = (int)(Math.random()*10);
            finN = finalN.charAt(num4);
         }
         
         System.out.print(firstN);
         System.out.print(middleN);
         System.out.println(finN);
         
         
         
      }
      
   }

}

class Product {
   private String prodName;
   private int price;
   private int cnt;
   public Product(String prodName, int price, int cnt) {
      this.prodName = prodName;
      this.price = price;
      this.cnt = cnt;
      
   }
   
   public String toString() {
      int tot = price*cnt;
      return prodName+" / "+price+" / "+cnt+" / "+tot;
   }

   
}