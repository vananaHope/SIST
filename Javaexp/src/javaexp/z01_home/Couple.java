package javaexp.z01_home;

public class Couple {

	public static void main(String[] args) {
		
		Woman w1 = new Woman("김순자",18,"여성");
		w1.showWoman();
		
		Man m1 = new Man("홍길동",23,"남성");
		m1.showMan();
		
		m1.addWoman(w1);
		
		m1.showCouple();

	}

}
