package javaexp.a09_inherit;

public class A07_Poly_Zerg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 라바가 첫번째 유닛인 드론으로 변형된다.
		Larba l1 = new Dron();
		l1.attack(); // 재정의한 내용이 다양하게 처리(다형성)...
		
		Larba l2 = new Zerggling();
		l2.attack();
		// ex) Hydralisk 히드라 attack 공격력 15, 원거리 공격합니다.
		
		Larba l3 = new Hydralisk();
		l3.attack();
		
		/*
		 ex) Duck 상위
		 		종류
		 		flying() 재정의
		 		
		 	NormalDuck
		 		집오리
		 		flying() 날지 못한다.
		 		
		 	Mallard
		 		청둥오리
		 		flying() 날아다닌다.
		 		
		 	상/하위 구조로 상속하고 다형성을 처리하여 메서드로 호출
		 		
		 */
	}

}

/*
 # StartCraft
 외계
 	인간(Terran)
 	프로토스(Protoss)
 	저그(Zerg) - 파충류(변태과정 거쳐서 성충)하고 비슷
 		Larba(애벌레)
 	Dron  Zerggling  Hydralisk	

 	이 다형성을 처리해주고 포함하는 클래스 정의
 	
 	class ZergUser	
 		String tcolor;
 		Larba larba;
 		ZergUser(String tcolor) {
 			this.tcolor = tcolor+" 저그 사용자";
 		}
 		
 		void makeUnit(Larba larba) {
 			this.larba = larba;
 			System.out.println(larba.getUnit()+" 유닛을 생성하다");
 		}
 		
 		void attack() {
 			System.out.println(larba+" 공격합니다");
 			if(larba!=null) {
 				System.out.println("아직 유닛이 만들어지지 않았습니다.");
 			}else {
 				// 다형성에 의해서 할당된 객체의 재정의한 메서드로 처리가 된다.
 				larba.attack();
 			}
 		}
 */





class Larba{
	private String unit;

	public Larba(String unit) {
		this.unit = unit;
	}
	
	public void attack() {
		System.out.println(unit+" 공격할려고 한다.");
	}

	public String getUnit() {
		return unit;
	}
	
	
}

class Dron extends Larba {
	
	public Dron() {
		super("드론");
		// TODO Auto-generated constructor stub
	}

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		super.attack();
		System.out.println("공격력 5이고 자원 채집만 합니다.");
	}
	
}

class Zerggling extends Larba {

	public Zerggling() {
		super("저글링");
	}

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		super.attack();
		System.out.println("근거리 공격, 공격력 5이고 빠르게 이동한다.");
	}
	
}

class Hydralisk extends Larba {
	public Hydralisk() {
		super("히드라");
	}
	
	public void attack() {
		super.attack();
		System.out.println("공격력 15이고 원거리 공격을 합니다.");
	}
}