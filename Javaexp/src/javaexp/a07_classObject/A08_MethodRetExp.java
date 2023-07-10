package javaexp.a07_classObject;

public class A08_MethodRetExp {

	public static void main(String[] args) {
		
		Product11 p01 = new Product11();
		// 생성자는 호출시마다 다른 heap영역을 만들기 때문에 
		// 참조값이 달라져서 하나의 객체에 하나의 생성자만 사용할 수 있지만
		// 메서드는 참조명.메서드명(데이터...)로 같은 heap영역 위치에서 동일한 메서드를 2~3번 이상 
		// 호출하더라도 메모리 변경이 없다.
		
		int tot01 = p01.totPay("사과", 2000, 5);
		System.out.println("총비용: "+tot01);
		System.out.println("총비용2: "+p01.totPay("오렌지", 2500, 3));
		int tot03 = p01.totPay("수박", 12000, 3);
		System.out.println("총비용3: "+tot03);
		
		System.out.println("# 할인율 적용 처리 #");
		int tot04 = p01.salePrice(3000, 0.15);
		
		System.out.println("최종 금액: "+tot04);
		int tot05 = p01.salePrice(12000, 0.24);
		System.out.println("최종 금액: "+tot05);
		int tot06 = p01.salePrice(50000, 0.08);
		System.out.println("최종 금액: "+tot06);
		
		Student01 s01 = new Student01();
		System.out.println("# 평균 출력 #");
		System.out.println("평균값: "+s01.avg("홍길동", 85, 75, 100));
		
	}

}

//물건 객체를 생성해서 구매할 물건과 가격 갯수를 입력 받아, 총 비용을 리턴하는 처리를 해보자.
class Product11 {
	int totPay(String pname, int price, int cnt) {
		System.out.println("입력한 물건명: "+pname);
		System.out.println("가격: "+price);
		System.out.println("갯수: "+cnt);
		
		int tot = price*cnt;
		return tot;
	}
	// ex) 물건가격, 할인율을 입력받아서 할인율이 적용된 금액을
	// 정수형(int) 리턴하여 main()에서 호출하세요
	// 100% ==> 1.0, 50% ==> 0.5
	// 3000원 10% ==> 3000*0.1(할인된 금액)  3000 - 3000*0.1
	// 메서드 출력 내용 : 물건 가격: @@@, 할인율: @@@
	// 메서드 리턴 내용 : 할인율이 적용된 금액...
	
	int salePrice(int salePrice, double salePer) {
		
		System.out.println("물건가격: "+salePrice);
		int disRatio = (int)(salePer*100);
		System.out.println("할인율: "+disRatio+"%");
		
		int totSale = salePrice - (int)(salePrice*salePer);
		return totSale;
	}
	
	
}

// ex) Student01 records()메서드에 이름,국어,영어,수학 입력 받고 해당 내용 출력, 평균(double)을 리턴 처리하세요
// Student01 st = new Student01();
// System.out.println("평균: "+st.avg("홍길동",80,70,90));
// double avg01 = st.avg("김길동",90,75,80);
// System.out.println("평균2: "+avg01);
class Student01 {
	double avg(String name, int kor, int eng, int math) {
		System.out.println("이름: "+name);
		System.out.println("국어: "+kor);
		System.out.println("영어: "+eng);
		System.out.println("수학: "+math);
		int tot = kor+eng+math;
		System.out.println("총점: "+tot);
		
		double avg01 = tot/3.0;
		
		return avg01;
		
	}
	
}


