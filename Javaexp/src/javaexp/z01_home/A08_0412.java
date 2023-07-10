package javaexp.z01_home;

public class A08_0412 {

   public static void main(String[] args) {
      
      //1. 메서드의 여러가지 처리형태(입력,로직,리턴,복합형태)를 기술하고 간단한 예제로 구현하세요
       
      // 시간 부족으로 풀지 못했습니다
      
      //2. 생성자로 데이터를 사용할 때와 메서드를 데이터를 사용할 때, 어떤 차이점이 있는지 예제로 기술하세요.
      /*
       생성자는 주로 해당 객체를 생성해서 초기값을 설정할 필요가 있을 때 주로 사용된다. 
        ex) Person : 사람이름, 초기할당할 정보
        			age(0) - 숫자형 데이터는 기본적으로 0이기에 설정 불필요
        	Car : 자동차의 종류, 기본 배기량... 최고 속도...
        	
        메서드는 주로 해당 객체 생성 후, 변경되는 데이터를 처리할 때 사용된다.
        	getAge() : 나이를 먹다.
        	chLoc("서울") : 사는 곳이 변경되다...
        	speedUp(30)  속도가 증가되다.
        	drivingPerson("친구1") : 사람을 태우다...
       */
	   
	   
      /*
       생성자를 객체를 생성할 때 주로 사용되며 초기값을 설정해야 에러가 나지 않는다.
       메서드는 주로 기능적인 처리를 담당하며 외부에서 데이터를 입력받거나 해당 데이터를 통해 리턴할 때 사용된다.
       
       class Product77 {
          String name;
          String pName(String name) {
             this.name = name;
           }
           
           String getName() {
              return name;
           }
       }
       
       
       */
      
      //3. 메서드(입력+로직) 선언 예제( class RetExp100 하위에 선언하여 호출하세요)
       //  1) 3개에 입력값 중에 가장 큰수 출력
       //  2) 1개의 입력값으로 70이상과 미만으로 합격/불합격 출력
       //  3) 배열로 파는 물건들을 3개의 문자열 배열로 선언하고, 입력으로 물건명으로 파는 물건 여부를 출력 표시.
      
      //1)
      RetExp100 r1 = new RetExp100();
      r1.getL(50, 53, 44);
      
      //2)
      
      r1.passExp(17);
      
      //3)
      
      r1.sellProd("깔라만시");
      
      
      //4. 메서드(입력+로직+리턴) 선언  예제( class RetExp100 하위에 선언하여 호출하세요)
       //  1) 놀이공원 클래스에서 나이를 입력해서 무료/유료 구분해서 리턴 메서드(5세미만 65이상 무료)
       //  2) 놀이공원 클래스에서 나이에 따라 입장료 10%, 15%, 20% 처리(나이구간 임의 적용)
       //  3) 배열로 등록된 회원 선언하고, 입력된 회원명에 따라 등록여부를 리턴하여 처리하세요.
      
      //1) 
      System.out.println(r1.isFree(100));
      
      //2)
      System.out.println(r1.salePrice(17));
      System.out.println(r1.salePrice(65));
      System.out.println(r1.salePrice(5));
      
      //3)
      
      System.out.println("등록된 회원인가요? "+r1.regMember("철수"));
      
      //5. 클래스(필드,생성자,메서드) 선언  예제( class RetExp100 하위에 선언하여 호출하세요)
       //  1) 버스클래스로 필드(버스번호,탑승자수) 버스번호 생성자 선언, 탑승자인원수 누적메서드 리턴 현재 총탑승자수
        //       탑승메서드(매개변수 탑승자인원, 리턴 현재 총탑승자수) 
        //     버스번호 @@번 @@명이 탑승했습니다.
      
      Bus b1 = new Bus(700);
      
      b1.getOn2(5);
      b1.getOn2(5);
      int tot01 = b1.getOn2(5);
      System.out.println("현재 총탑승자 수: "+tot01);
      b1.getOn2(10);
      System.out.println("현재 총탑승자 수: "+b1.getOn2(10));
      
      Bus b2 = new Bus(8001);
      System.out.println("현재 총탑승자 수: "+b2.getOn2(10));
      System.out.println("현재 총탑승자 수: "+b2.getOn2(10));
      System.out.println("현재 총탑승자 수: "+b2.getOn2(10));
      
      //6. 클래스내 일반변수, static 변수, final 상수, static final 상수의 차이점을 기본 예제로 설명하세요
      
      // 시간 부족으로 풀지 못했습니다
      
      //7. 상대적경로 이동과 절대적 경로 이동예제를 하나씩 만들어 이동처리하세요
      
      // 시간 부족으로 풀지 못했습니다
      
   }

}

class Bus {
   int busNum;
   int busPerson;
   static int busTot;
   
   Bus(int busNum) {
      this.busNum = busNum;
      
   }
   
   int getOn2(int passCnt) {
	   System.out.println(busNum+"이번 정거장에서 탑승자수: "+passCnt);
	   busPerson += passCnt;
	   return busPerson;
   }
   
//   int getBus(int busPerson) {
//      this.busPerson += busPerson;
//      busTot += busPerson;
//      System.out.println(busNum+"번 버스의 "+busPerson+"명이 탑승했습니다.");
//      return busTot;
//   }

}

class RetExp100 {

   String regMember(String member) {
      String[] memArry = {"철수","영희","수지","지섭"};
      String result = "가입되어 있지 않습니다.";
      for(String name:memArry) {
    	  if(name.equals(member)) {
    		  result = "가입되어 있습니다.";
    	  }
      }
      return result;
   }      
//      for(int idx=0;idx<memArry.length;idx++) {
//         if(member.equals(memArry[idx])) {
//            result = "등록된 회원입니다.";
//            break;
//         }else {
//            result = "등록되지 않은 회원입니다.";
//            break;
//         }
//      }
//      return result;
//   }
   
   
   
   void sellProd(String product) {
      String[] prdArry = {"딸기","복숭아","망고"};
      String result = "해당 물건이 없습니다.";
      System.out.print("물건이 있나요? ");
      for(String prod:prdArry) {
    	  if(prod.equals(product)) {
    		  result = "물건이 있습니다.";
    	  }
      }
      System.out.println(result);
   }  
//      for(int idx=0;idx<prdArry.length;idx++) {
//         if(product.equals(prdArry[idx])) {
//            System.out.println("파는 물건입니다.");
//            break;
//         }else {
//            System.out.println("팔지 않는 물건입니다.");
//            break;
//         }
//      }
   
   
   
   public void getL(int num01, int num02, int num03) {
	   int maxNum = 0;
	   if(num01>maxNum) {
		   maxNum = num01;
	   }
	   if(num02>maxNum) {
		   maxNum = num02;
	   }
	   if(num03>maxNum) {
		   maxNum = num03;
	   }
	   System.out.println("가장 큰 수는: "+maxNum);
	   /*
	    num01이 가장 큰 경우
	     	num02<num01, num03<num01
	     	num01 = num02  num02>num03
	     	num01==num02==num03
	     	
	    */
	   
	   
//      if(num01>num02 && num01>num03 && num02>num03) {
//         System.out.println("가장 큰 수는: "+num01);
//      }else if(num01>num02 && num01>num03 && num03>num02) {
//         System.out.println("가장 큰 수는: "+num01);
//      }else if(num02>num01 && num02>num03 && num01>num03) {
//         System.out.println("가장 큰 수는: "+num02);
//      }else if(num02>num01 && num02>num03 && num03>num01) {
//         System.out.println("가장 큰 수는: "+num02);
//      }else if(num03>num01 && num03>num02 && num01>num02) {
//         System.out.println("가장 큰 수는: "+num03);
//      }else {
//         System.out.println("가장 큰 수는: "+num03);
//      }
   }
   
   public void passExp(int num01) {
      if(num01>=70) {
         System.out.println("합격");
      }else {
         System.out.println("불합격");
      }
   }
   
   String isFree(int age) {
      String result = "유료";
      if(age<5 || age>=65) {
         result = "무료";
      }else {
         result = "유료";
      }
      return result;
   }
   
   int salePrice(int age) {
      int totPrice = 0;
      int price = 10000;
      if(age>0 && age<=10) {
         totPrice += price - (int)(price*0.15);
      }else if(age>10 && age<=19) {
         totPrice += price - (int)(price*0.1);
      }else if(age>19 && age<=65) {
         totPrice += price - (int)(price*0.25);
      }
      return totPrice;
   }
   
   
}