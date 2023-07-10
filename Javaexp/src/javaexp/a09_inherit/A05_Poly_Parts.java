package javaexp.a09_inherit;

public class A05_Poly_Parts {

	public static void main(String[] args) {
		
		Computer com1 = new Computer("삼성");
		com1.showPartsInfo();
		com1.addPart(new Cpu("i7 3.4GHz"));
		com1.showPartsInfo();
		com1.addPart(new Ram("16G"));
		com1.showPartsInfo();
		//addPart(String name)
		// Part part1 = new Cpu("i7 3.4GHz")
		// Part part2 = new Ram("16G")
		//addPart(Part part)
		
		// ex) Ssd를 상속해서 추가하고 main()에서 호출하세요
		
		
		com1.addPart(new Ssd("250G SATA"));
		com1.showPartsInfo();
	}

}

class Part{
	private String kind;
	private String spec;

	
	public Part(String kind, String spec) {
		this.kind = kind;
		this.spec = spec;
	}


	public void showInfo() {
		System.out.println("# 부품정보 #");
		System.out.println("부품명: "+kind);
		System.out.println("사양: "+spec);
	}
}

class Ssd extends Part {
	public Ssd(String spec) {
		super("SSD",spec);
	}
	public void showInfo() {
		super.showInfo();
		System.out.println("SSD는 HDD보다 빠른 저장장치이며 SATA와 M2방식이 있다.");
	}
}

class Cpu extends Part{
	public Cpu(String spec) {
		super("CPU", spec);
	}

	@Override
	public void showInfo() {
		// TODO Auto-generated method stub
		super.showInfo();
		// 추가되는 기능을 처리하여 각 부품별로 동일한 메서드이지만 
		// 다양한 기능적 처리를 할 수 있게 하였다.
		System.out.println("CPU는 컴퓨터의 핵심 부품으로 중앙처리를 한다.");
	}
}
class Ram extends Part{
	public Ram(String spec) {
		super("RAM", spec);
	}
	
	@Override
	public void showInfo() {
		// TODO Auto-generated method stub
		super.showInfo();
		System.out.println("RAM 메모리는 컴퓨터의 휘발성 임시 메모리를 처리한다.");
	}
}
//1단계
//1:1관계 구조 컴퓨터 안에 다양한 하나의 부품을 장착가능하게 처리
class Computer{
	private String company;
	private Part part;
	public Computer(String company) {
		this.company = company;
	}
	
	public void addPart(Part part) {
		this.part = part;
		System.out.println("부품이 장착되었습니다.");
	}
	
	public void showPartsInfo() {
		System.out.println(company+" 컴퓨터!!");
		if(part!=null) {
			part.showInfo();
		}else {
			System.out.println("부품이 장착되지 않았습니다.");
		}
	}
}

