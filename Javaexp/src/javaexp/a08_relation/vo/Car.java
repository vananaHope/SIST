package javaexp.a08_relation.vo;

public class Car {
	// 자동차 종류, 배기량
	// driving() @@ 자동차가 운행을 합니다.
	
	private String kind;
	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public int getCc() {
		return cc;
	}

	public void setCc(int cc) {
		this.cc = cc;
	}

	private int cc;
	
	public Car(String kind, int cc) {
		this.kind = kind;
		this.cc = cc;
	}
	
	public void driving() {
		System.out.println(kind+" 자동차가 운행합니다.");
	}
	
}
