package javaexp.a09_inherit;

public class A08_PolyExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Duck d1 = new NormalDuck();
		d1.flying();
		
		Duck d2 = new Mallard();
		d2.flying();

	}

}

class Duck {
	private String kind;
	public Duck(String kind) {
		this.kind = kind;
	}
	public void flying() {
		System.out.print(kind);
	}
}

class NormalDuck extends Duck {
	public NormalDuck() {
		super("집오리");
	}
	
	public void flying() {
		super.flying();
		System.out.println("는 날지 못한다.");
	}
}

class Mallard extends Duck {
	public Mallard() {
		super("청둥오리");
	}
	public void flying() {
		super.flying();
		System.out.println("는 날아다닌다.");
	}
}