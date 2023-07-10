package javaexp.z01_home;

import java.util.ArrayList;

public class A14_0424 {

	public static void main(String[] args) {
		// 1. 추상클래스와 일반 재정의 클래스의 차이점을 예제를 통해 기술하세요
	    /*
	     # 차이점
	     1. 상위 객체생성의 독립성
	     	  일반 클래스는 가능하지만, 추상클래스는 불가능하다
	     2. 메서드 재정의 강제성
	     	  일반 클래스의 메서드는 재정의가 선택적이지만 
	     	  추상 클래스의 추상메서드는 반드시 재정의해야 한다.
	     */  
		
		
	      
	      MyFa mf01 = new MyFa(); // 필요없는 메서드를 굳이 정의해주어야 한다.
	      mf01.callFa01();
	      
//	      Favorite f00 = new Favorite(); 추상클래스는 단독으로 객체 생성 불가능
	      Favorite f01 = new Bulgogi(); // 필요없는 메서드를 따로 정의할 필요 없다.
	      Favorite f02 = new Kcow();
	      Favorite f03 = new Spag();
	      
	      f01.callFa();
	      f02.callFa();
	      f03.callFa();
	      
	      // 2. Food를 추상클래스로 선언하고, name(음식종류), eat()공통메서드 @@을 먹다, taste()추상메서드로 다양한 맛을 출력
//	      좋아하는음식 3가지를 실제클래스를 선언하여 출력하세요.
	      Food f1 = new Budae();
	      f1.eat();
	      f1.taste();
	      
	      Food f2 = new Candy();
	      f2.eat();
	      f2.taste();
	      
	      Food f3 = new Kimchi();
	      f3.eat();
	      f3.taste();
	      
	      // 3. 위 내용을 DailyFoodSchedule로 1:다 관계로 먹는 사람과 일일 식사메뉴 3개를 Food타입 리스트로 처리할 수 있게 기능메서드 선언하여 출력하세요.
	      
	      DailyFoodSchedule ds01 = new DailyFoodSchedule("홍길동");
	      ds01.addFood(new Budae());
	      ds01.addFood(new Candy());
	      ds01.addFood(new Kimchi());
	      ds01.showInfo();
	      ds01.showMenu();
	      
	      // 4. 인터페이스의 구성요소의 특징을 예제와 함께 선언하세요
	      /*
	       인터페이스의 형식
	          접근제어자 interface 인터페이스명{} ( 추상 클래스의 연장선 )
	       
	       인터페이스 구성요소
	          필드 : public static final이 생략 (인터페이스.필드 - 독립적 사용)
	          재정의 추상 메서드 : public abstract 생략 (하위 객체를 통해서만 사용)
	          default 실제 메서드 : 공통기능메서드(하위객체를 통해서만 사용가능)
	          static 실제 메서드 : 공통기능메서드(인터페이스.메서드()-독립적 사용)      
	       */
	      
	      Sport s01 = new Play();
	      s01.soccer();
	      
	      // 5. FishingWay goFishing() 인터페이스를 선언하여, 상속받은 실제클래스를 2개를 선언하고, 실제클래스 Fisher에 이름과 인터페이스 FishingWay를 선언하고
	      //      addFishingSkill() 할당하게 하면  해당 어부가 낙시하는 goFishing()메서드를 호출하여 처리하세요.
	      /*
	       인터페이스 처리 2단계
	       FishingWay(goFishing())
	       
	       SeaFishing 바다 낚시 기술을 배웠다
	       RiverFishing	민물 낚시 기술을 배웠다
	       
	       Fisher
	       		FishingWay way;
	       		
	       		void addFishingSkill(Fishing way)
	       			this.way = way; // 하위 실제 객체에 따라 처리될 내용 할당
	       			
	       		void goFishing()
	       		if(way!=null)
	       			way.goFishing()
	       		else
	       			낚시 기술이 없네요
	       			
	       */
	      
	      
	      Fisher fish = new Fisher("김철수");
	      fish.goFishing();
	      fish.addFishingSkill(new Fishing01());
	      fish.goFishing();
	      fish.addFishingSkill(new Fishing02());
	      fish.goFishing();
	   }

	}

	interface Sport {
	   String NAME = "웅수";
	   void soccer();
	}

	class Play implements Sport {
	   
	   public void soccer() {
	      System.out.println(NAME+"는 축구를 열심히 한다.");
	   }
	}



	interface FishingWay {
	   void goFishing();
	}

	class Fishing01 implements FishingWay {
	   public void goFishing() {
	      System.out.println("민물낚시를 배웠습니다.");
	   }
	}
	class Fishing02 implements FishingWay {
	   public void goFishing() {
	      System.out.println("바다낚시를 배웠습니다.");
	   }
	}


	class Fisher {
	   String name;
	   FishingWay fw;
	   
	   public Fisher(String name) {
	      this.name = name;
	   }
	   
	   public void addFishingSkill(FishingWay fw) {
	      this.fw = fw;  
	   }
	   
	   
	   public void goFishing() {
	      System.out.print(name+"는 ");
	      if(fw==null) {
	         System.out.println("낚시 준비가 안되었습니다.");
	      }else {
	         fw.goFishing();
	      }
	      
	   }
	   
	}


	class DailyFoodSchedule {
	   private String ePerson;
	   private ArrayList<Food> food;
	   
	   public DailyFoodSchedule(String ePerson) {
	      this.ePerson = ePerson;
	      food = new ArrayList<Food>();
	   }
	   
	   public void addFood(Food f) {
	      food.add(f);
	   }
	   public void showInfo() {
	      System.out.println("음식을 먹는 사람: "+ePerson);
	      for(Food f1:food) {
	         System.out.println("먹을 음식: "+f1.getName());
	      }
	   }
	   public void showMenu() {
		   System.out.println("# "+ePerson+"의 오늘의 식사 메뉴들 #");
		   if(food.size()>0) {
			   for(Food f:food) {
				   f.eat();
			   }
		   }else {
			   System.out.println("식사 메뉴가 선택되지 않았습니다.");
		   }
	   }

	}


	abstract class Food {
	   private String name;

	   public Food(String name) {
	      this.name = name;
	   }
	   
	   public String getName() {
	      return name;
	   }

	   public void eat() {
	      System.out.println(name+"을(를) 먹다.");
	   }
	   
	   public abstract void taste();
	   
	}

	class Budae extends Food {

	   public Budae() {
	      super("부대찌개");
	      // TODO Auto-generated constructor stub
	   }

	   @Override
	   public void taste() {
		   // getName()으로 공통메서드를 통해 필드를 호출
	      System.out.println(getName()+"는 짠 맛이 난다.");
	      
	   }
	   
	}
	class Candy extends Food {
	   
	   public Candy() {
	      super("사탕");
	      // TODO Auto-generated constructor stub
	   }
	   
	   @Override
	   public void taste() {
	      System.out.println(getName()+"는 단 맛이 난다.");
	      
	   }
	   
	}
	class Kimchi extends Food {
	   
	   public Kimchi() {
	      super("김치찌개");
	      // TODO Auto-generated constructor stub
	   }
	   
	   @Override
	   public void taste() {
	      System.out.println(getName()+"은 짠 맛이 난다.");
	      
	   }
	   
	}

	class Favorite01 {
	   private String kind1;
	   private String kind2;
	   private String kind3;
	   public Favorite01(String kind1, String kind2, String kind3) {
	      this.kind1 = kind1;
	      this.kind2 = kind2;
	      this.kind3 = kind3;
	   }
	   public String getKind1() {
	      return kind1;
	   }
	   public String getKind2() {
	      return kind2;
	   }
	   public String getKind3() {
	      return kind3;
	   }
	   public void callFa01() {
	      System.out.print("좋아하는 음식은 ");
	   }
	}

	class MyFa extends Favorite01 {

	   public MyFa() {
	      super("불고기","한우","스파게티");
	      // TODO Auto-generated constructor stub
	   }
	   public void callFa01() {
	      super.callFa01();
	      System.out.println(getKind1()+", "+getKind2()+", "+getKind3()+"입니다.");
	   }
	   
	}




	abstract class Favorite {
	   private String kind;

	   public Favorite(String kind) {
	      this.kind = kind;
	   }
	   
	   public String getKind() {
	      return kind;
	   }

	   public abstract void callFa();
	   
	}

	class Bulgogi extends Favorite {

	   public Bulgogi() {
	      super("불고기");
	      // TODO Auto-generated constructor stub
	   }

	   @Override
	   public void callFa() {
	      System.out.println("좋아하는 음식은 "+getKind());
	      
	   }
	   
	}
	class Kcow extends Favorite {
	   
	   public Kcow() {
	      super("한우");
	      // TODO Auto-generated constructor stub
	   }
	   
	   @Override
	   public void callFa() {
	      System.out.println("좋아하는 음식은 "+getKind());
	      
	   }
	   
	}
	class Spag extends Favorite {
	   
	   public Spag() {
	      super("스파게티");
	      // TODO Auto-generated constructor stub
	   }
	   
	   @Override
	   public void callFa() {
	      System.out.println("좋아하는 음식은 "+getKind());
	      
	   }
	   
	}

