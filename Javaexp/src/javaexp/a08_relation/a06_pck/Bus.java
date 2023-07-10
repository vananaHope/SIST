package javaexp.a08_relation.a06_pck;

public class Bus {
	//접근 제어자 private 외부에서 **직접** 접근이 안된다. 
	private String driver;
	// 같은 패키지에 있기에 호출 가능...
	Car c1;
	public int no;
	String target;
	
	public Bus() {
		
	}
	
	public Bus(String target, int no, String driver) {
		this.target = target;
		this.no = no;
		this.driver = driver;
		// 접근이 되는 생성자를 통해서 직접적인 호출이 되지 않는 변수에 데이터를 할당.
	}
	
	public void callInfo() {
		System.out.println("버스 번호: "+no);
		System.out.println("목적지: "+target);
		System.out.println("버스기사: "+driver);
		// 접근이 되는 기능 메서드를 통해서 직접적인 호출이 안되는 변수에 데이터를 할당.
	}
	
	Bus(int no) {
		this.no = no;
	}
	public Bus(String target, int no) {
		this.target = target;
		this.no = no;
	}
}
