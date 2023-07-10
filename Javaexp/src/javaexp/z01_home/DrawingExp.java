package javaexp.z01_home;

public class DrawingExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class Polygon {
	String kind;
	
	public Polygon(String kind) {
		this.kind = kind;
	}
	
	public void drawing() {
		System.out.println(kind+" 모양으로");
	}
}

class Triangle extends Polygon {
	
	public Triangle() {
		super("삼각형");
	}
	
	public void drawing() {
		super.drawing();
		System.out.println("세모난 새 집을 그리다.");
	}
}
class Square extends Polygon {
	
	public Square() {
		super("삼각형");
	}
	
	public void drawing() {
		super.drawing();
		System.out.println("세모난 새 집을 그리다.");
	}
}


