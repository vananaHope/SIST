package javaexp.a09_inherit.vo;

public class Mother {
	
	private int height = 168;
	
	void cooking() {
		System.out.println("요리를 잘하다.");
	}
	String charac = "현명하다";
	
	void checkHeight(int height) {
		this.height += height;
		System.out.println("키가 "+(height>0?"더 크다":"같거나 작다"));
	}
	
	int getHeight() {
		return height;
	}
}
