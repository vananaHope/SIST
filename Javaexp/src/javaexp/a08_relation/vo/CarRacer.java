package javaexp.a08_relation.vo;

public class CarRacer {
	// 필드: 이름, Car
	// 메서드 : buyCar()
	// 		drivingCar()
	//			Car객체가 있으면 @@가 차를 운행합니다.
	//			없으면 차가 없습니다.
	

	private String name;
	// 포함될 클래스를 선언...
	private Car car;
	
	public CarRacer(String name) {
		this.name = name;
	}
	
	public void buyCar(Car car) {
		this.car = car;
		System.out.println(name+"가(이) "+car.getKind()+"차를 구매한다.");
	}
	
	public void drivingCar() {
		System.out.println(name+"가(이) 차를 운행하려고 합니다.");
		if(car==null) {
			System.out.println("차를 가지고 있지 않습니다");
		}else {
			car.driving();
		}
	}
	
	
}
