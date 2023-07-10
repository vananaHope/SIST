package javaexp.a09_inherit.vo;

public class Daughter extends Mother {
	
	String goodPt = "주위 사람을 밝게 한다.";
	
	void playSoccer() {
		System.out.println("축구를 잘하다.");
	}
	
	void playGuitar() {
		System.out.println("기타를 치다.");
	}
	
	void callTalent() {
		System.out.println("# 딸의 재능 #");
		System.out.println("# 상위로 받은 특징 #");
		System.out.println(charac); // 상속이기에 바로 사용 가능
		cooking();
		System.out.println("# 현 객체의 추가 필드 #");
		System.out.println(goodPt);
	}
	
	void callHeight() {
//		System.out.println("키는: "+height); 직접 접근 불가능
		checkHeight(-5);
		System.out.println("키는 "+getHeight()); // 간접적으로 접근하는 형태
	
	}
}
