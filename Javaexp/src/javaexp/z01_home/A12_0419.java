package javaexp.z01_home;

public class A12_0419 {

   public static void main(String[] args) {
   // 1. 접근제어자에 이해와 구현
   //      1) 접근제어자의 4가지 이해하고 설명할 수 있는가?
      /*
       private: 같은 클래스 내에서만 사용가능
         X(default): 같은 패키지 내에서만 사용가능
         protected: 같은 패키지 내+외부 패키지의 상속관계에 있는 클래스에서 사용가능
         public: 외부패키지에서도 사용가능

       */
   //      2) 접근제어자에 맞게 구현할 수 있는가?
      /*
       접근제어자에 대한 이해도를 높이기 위해 4번 문제에서 조원들과 함께 이야기를 나누면서
         상황에 맞는 접근 제어자 사용법을 숙지하도록 했습니다
       */
   //      3) default와 protected의 상속관계 객체내에서 호출시 어떤 문제가 있고, 원인은 무엇인가?
      /* default와 protected에서 상위 접근 제어자가 default이고 하위가 protected라면 
       하위의 접근제어가 범위가 더 커서 문제가 발생하지 않지만 반대의 경우에는 에러가 발생한다. 
       
       # 상위 관계 외부 패키지에서 클래스에서
       		protected 접근 제어자가 설정된 필드에 대하여
       		객체 생성형식으로 호출하면 접근을 할 수 없고
       		반드시 상속관계에서 호출하는 형식으로 처리하여야 접근이 가능
       		
       		class Son01 extends WoodCutter {
       			void callWoodCutter() {
       				WoodCutter w = new WoodCutter();
       				System.out.println(w.inheritMoney);
       				// protected이지만 객체생성 참조변수.필드이기에 접근 불가
       				System.out.println(inheritMoney);
       				// 상속관계 바로 필드 호출 가능
       			}
       		}
       		
       		
       		
       */
   //      4) 아래 구조에 의해 접근제어자에 따른 호출 내용을 처리해 보자.
   //         패키지1 : 참외, 사과, 멜론(참외상속), 바나나, 딸기
   //         패키지2 : 당근, 양파
   //         패키지3 : 수박(참외상속)
   //         패키지1의 참외에 접근제어자 4가지와 호출하는 메서드를 정의하고 각 클래스에서 호출해보세요.
   
      /*
          package javaexp.z01_homework.package1;

         public class KoreanMelon {
            private String str01 = "나만 먹고 싶은 과일";
            String str02 = "같은 팀원끼리 먹고 싶은 과일";
            protected String str03 ="계절과일";
            public String str04 = "하우스과일";
            
            public void callFruitInfo(){
               KoreanMelon km = new KoreanMelon();
               System.out.println("private:"+km.str01);
               System.out.println("X(default):"+km.str02);
               System.out.println("protected:"+km.str03);
               System.out.println("public:"+km.str04);
            }
            public void callFruitInfo2(){
               System.out.println("private:"+str01);
               System.out.println("X(default):"+str02);
               System.out.println("protected:"+str03);
               System.out.println("public:"+str04);
            }
         }
         
         --------------------------------------------------
         
         package javaexp.z01_homework.package1;
         
         public class Apple {
            public void callFruitInfo(){
               KoreanMelon km = new KoreanMelon();
         //      System.out.println("private:"+km.str01);
               System.out.println("X(default):"+km.str02);
               System.out.println("protected:"+km.str03);
               System.out.println("public:"+km.str04);
            }
         //   public void callFruitInfo2(){   상속관계가 아니기 때문에 에러발생
         //      System.out.println("private:"+str01);
         //      System.out.println("X(default):"+str02);
         //      System.out.println("protected:"+str03);
         //      System.out.println("public:"+str04);
         //   }
         }
         
         ----------------------------------------------------
         
         package javaexp.z01_homework.package1;
         
         public class Banana {
            public void callFruitInfo(){
               KoreanMelon km = new KoreanMelon();
         //      System.out.println("private:"+km.str01); 
               System.out.println("X(default):"+km.str02);
               System.out.println("protected:"+km.str03);
               System.out.println("public:"+km.str04);
            }
         //   public void callFruitInfo2(){ 
         //      System.out.println("private:"+str01);
         //      System.out.println("X(default):"+str02);
         //      System.out.println("protected:"+str03);
         //      System.out.println("public:"+str04);
         //   }
         }
         
         ----------------------------------------------------
         
         package javaexp.z01_homework.package1;
         
         public class Melon extends KoreanMelon{
            public void callFruitInfo(){
               KoreanMelon km = new KoreanMelon();
         //      System.out.println("private:"+km.str01); 
               System.out.println("X(default):"+km.str02);
               System.out.println("protected:"+km.str03);
               System.out.println("public:"+km.str04);
            }
            public void callFruitInfo2(){
         //      System.out.println("private:"+str01);
               System.out.println("X(default):"+str02);
               System.out.println("protected:"+str03);
               System.out.println("public:"+str04);
            }
         }
         
         -----------------------------------------------------
         
         package javaexp.z01_homework.package1;
         
         public class Strawberry {
            public void callFruitInfo(){
               KoreanMelon km = new KoreanMelon();
         //      System.out.println("private:"+km.str01); 
               System.out.println("X(default):"+km.str02); 
               System.out.println("protected:"+km.str03);
               System.out.println("public:"+km.str04);
            }
         //   public void callFruitInfo2(){
         //      System.out.println("private:"+str01);
         //      System.out.println("X(default):"+str02);
         //      System.out.println("protected:"+str03);
         //      System.out.println("public:"+str04);
         //   }
         }
         
         -------------------------------------------------------
         
         package javaexp.z01_homework.package2;
         
         import javaexp.z01_homework.package1.KoreanMelon;
         
         public class Carrot {
            public void callFruitInfo(){
               KoreanMelon km = new KoreanMelon();
         //      System.out.println("private:"+km.str01); 
         //      System.out.println("X(default):"+km.str02); 
         //      System.out.println("protected:"+km.str03); 
               System.out.println("public:"+km.str04);
            }
         //   public void callFruitInfo2(){
         //      System.out.println("private:"+str01);
         //      System.out.println("X(default):"+str02);
         //      System.out.println("protected:"+str03);
         //      System.out.println("public:"+str04);
         //   }
         }
         
         ------------------------------------------------------
         
         package javaexp.z01_homework.package2;
         
         import javaexp.z01_homework.package1.KoreanMelon;
         
         public class Onion {
            public void callFruitInfo(){
               KoreanMelon km = new KoreanMelon();
         //      System.out.println("private:"+km.str01); 
         //      System.out.println("X(default):"+km.str02); 
         //      System.out.println("protected:"+km.str03); 
               System.out.println("public:"+km.str04);
            }
         //   public void callFruitInfo2(){
         //      System.out.println("private:"+str01);
         //      System.out.println("X(default):"+str02);
         //      System.out.println("protected:"+str03);
         //      System.out.println("public:"+str04);
         //   }
         }
         
         ---------------------------------------------------------
         
         package javaexp.z01_homework.package3;
         
         import javaexp.z01_homework.package1.KoreanMelon;
         
         public class Watermelon extends KoreanMelon{
            public void callFruitInfo(){
               KoreanMelon km = new KoreanMelon();
         //      System.out.println("private:"+km.str01); 
         //      System.out.println("X(default):"+km.str02); 
         //      System.out.println("protected:"+km.str03); 
               System.out.println("public:"+km.str04);
            }
            public void callFruitInfo2(){
         //      System.out.println("private:"+str01);
         //      System.out.println("X(default):"+str02);
               System.out.println("protected:"+str03); 
               System.out.println("public:"+str04);
            }
         }
         
         -------------------------------------------------------
       */
      
      
   // 2. this.필드, this()의 사용에 있어서 차이점을 예제로 기술하세요.
      /*
       this.필드는 클래스에 있는 전역변수를 나타내며 메서드의 매개변수로 받은 지역변수를 전역변수로 할당 할 때 사용한다.
       this()는 클래스 내에 있는 여러 개의 생성자 중 매개변수가 들어 있지 않은 생성자를 호출할 때 사용한다.
       
       class Product {
          String name;
       
          public Product(String name) {
             this.name = name;
          }
       
       }
       
       class Student {
          String sName;
          int sGrade;
          String school;
          
          public Student() {
             System.out.println(this);
          }
          
          public Student(String sName) {
             this();
             this.sName = sName;
          }
          
          
       }
       
       */
      
   // 3. Team(팀명,승,무,패,승률)을 생성자의 매개변수(0~5)로 오버 로딩 선언하여 this()로 호출 처리하게 하세요
      
      Team t1 = new Team("맨체스터 유나이티드",15,5,3,70);
      
   // 4. this, super의 차이를 상속관계에서 필드, 생성자, 메서드의 관점에서 예제를 통해 기술하세요.
      
      Father f1 = new Father("홍철수",45);
      f1.getInfo();
      
      
   // 5. 메서드 오버라이딩(overriding)을 메서드 오버로딩(overloading)과의 차이점을 기술해보세요.
      
      /*
       오버라이딩은 부모 클래스에서 상속받은 메서드를 동일한 이름으로 자식 클래스에서 재정의하여 사용하는 것을 말한다.
       하지만 주의할 점은 하위 클래스의 접근 제어자가 상위 클래스의 접근 제어자보다 범위가 넓거나 같아야 에러가 발생하지 않는다.
       private < default(x) < protected < public
       
       오버로딩은 오버라이딩과 다르게 메서드를 만들 때 적용되는 규칙으로 같은 이름에 메서드라도 매개변수/데이터유형에 따라
       다르게 메서드를 정의할 수 있는 것을 말한다.
       */
      
      
   // 6. 선택자중 태그, 아이디, 클래스, 중첩적용의 예를 만들고 설명하세요.
      /*
       <!DOCTYPE html>
       <html lang="en">
       <head>
          <meta charset="UTF-8">
          <title>Document</title>
          <style>
              .cls01 {text-align: center;}
              .cls02 {color:aquamarine;}
              .cls03 {background-color:darkred;}
              #id01 {font-size: 30px;}

          </style>
      </head>
      <body>
          <h2 class="cls01">아스날</h2>
          <h2 class="cls01">맨시티</h2>
          <h2 id="id01">맨체스터 유나이티드</h2>
          <h2 class="cls01 cls02">뉴캐슬</h2>
          <h2 class="cls02">토트넘</h2>
          <h2 class="cls01 cls02 cls03">아스톤빌라</h2>
          <h1 class="cls03">브라이튼</h2>
      </body>
      </html>
       
       */
         
      
      
   }

}

class Team {
   String name;
   int wins;
   int lose;
   int draw;
   int winrate;
   public Team() {
      // TODO Auto-generated constructor stub
   }
   public Team(String name, int wins, int lose, int draw, int winrate) {
      this(name, wins, lose, draw);
      this.winrate = winrate;
      System.out.println("팀명: "+name);
      System.out.println("승: "+wins);
      System.out.println("패: "+lose);
      System.out.println("무: "+draw);
      System.out.println("승률: "+winrate+"%");
   }
   public Team(String name, int wins, int lose, int draw) {
      this(name, wins, lose);
      this.draw = draw;
   }
   public Team(String name, int wins, int lose) {
      this(name, wins);
      this.lose = lose;
   }
   public Team(String name, int wins) {
      this(name);
      this.wins = wins;
   }
   public Team(String name) {
      this.name = name;
   }
}

class GrandFa {
   String name;
   int age;
   
   public GrandFa(String name, int age) {
      this.name = name;
      this.age = age;
   }
   
   void getInfo() {
      System.out.println("# 상위 클래스 #");
      
   }
   
   
}

class Father extends GrandFa {
   int fAge;
   String fName;
   public Father(String fName, int fAge) {
      super("홍길동",75);
      this.fAge = fAge;
      this.fName = fName;
   }
   
   void getInfo() {
      System.out.println("# 하위 클래스 #");
      System.out.println("아버지 이름: "+this.fName);
      System.out.println("아버지 나이: "+this.fAge);
      System.out.println("할아버지 이름: "+super.name);
      System.out.println("할아버지 나이: "+super.age);
   }
}
