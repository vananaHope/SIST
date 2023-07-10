package javaexp.a08_relation.access.story2.sonhome;

import javaexp.a08_relation.access.story2.woodhome.WoodCutter;

public class Son1 extends WoodCutter{
	public void callWoodInfo() {
		WoodCutter wc = new WoodCutter();
//		System.out.println("private: "+wc.privsec);
//		System.out.println("default(x): "+wc.ourHomeSec);
		
//		# 주의!!!!!!
//		상속은 해당 속성을 내가 가지고 있는 것과 같이 사용할 때를 말한다.
//		외부에 있는 객체를 생성해서 특정 속성을 호출하기 때문에 상속의 범위에서 벗어난다.
//		아버지를 아버지라고 부르지 않고 남처럼 부르는 것과 같다.
//		System.out.println("protected: "+wc.inheritSec);
		System.out.println("public: "+wc.announce);
	}
	
	// 상속 클래스
	public void callWoodInfo2() {
		// private 개인
//		System.out.println("private: "+privsec);
		// x default 같은 패키지
//		System.out.println("default(x): "+ourHomeSec);
		// protected는 상속의 범위 안에서 외부 패키지라도 접근이 가능하다.
		System.out.println("protected: "+inheritSec);
		System.out.println("public: "+announce);
	}
}
