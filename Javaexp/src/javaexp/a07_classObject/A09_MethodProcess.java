package javaexp.a07_classObject;

public class A09_MethodProcess {

	public static void main(String[] args) {
		
		/*
		 # 메서드기능(입력+프로세스처리)
		 1. 프로세스 처리
		 	1) 전역변수 저장 처리
		 	2) 원하는 데이터를 위한 알고리즘 처리
		    	- 조건/반복문 처리
		    3) 화면 출력
		  
		  
		 */
		
		Calculator2 c1 = new Calculator2();
		// 생성자로 데이터를 처리할 때와 메서드를 통해서 데이터 처리할 때를 구분하여야 한다.
		c1.showInf();
		c1.setData(1000, 2000);
		c1.showInf();
		c1.setData(2000, 3000); // 전역변수가 바뀜
		c1.showInf();
		
		c1.addData(1000, 2000); // 전역변수 누적됨
		c1.showInf();	

		c1.getGreater(100,200);
		
		c1.getLessNum(150, 100);
		
		c1.showTot(1, 20);
		c1.showTot(20, 70);
		
		c1.getGugu(3, 7);
		
		c1.callBuyMaxCnt(3000, 5);
	}

}

class Calculator2 {
	int num01;
	int num02;
	// 출력하는 메서드..
	public void showInf() {
		System.out.println("데이터1: "+num01);
		System.out.println("데이터2: "+num02);
	}
	// 전역변수에 저장 : 메서드 호출시마다 변수가 변경
	public void setData(int num01, int num02) {
		this.num01 = num01;
		this.num02 = num02;
	}
	// ex) 클래스가 ShoppingSite 
	//     login(String id, String pass)
	//		buyProd(String pname, int cnt)
	// 전역변수에 누적 저장: 메서드 호출시마다 변수가 누적 추가
	public void addData(int num01, int num02) {
		this.num01 += num01;
		this.num02 += num02;
	}
	// 두 수를 받아서 더 큰 수를 출력.. if
	public void getGreater(int num01, int num02) {
		System.out.println("첫 번째 수: "+num01);
		System.out.println("두 번째 수: "+num02);
		
		if(num01>num02) {
			System.out.println("더 큰 숫자: "+num01);
		}else if(num02>num01) {
			System.out.println("더 큰 숫자: "+num02);
		}else {
			System.out.println("두 수가 동일합니다.");
		}
	}
	// ex) 더 작은 수를 표시하는 기능 메서드 처리 getLessNum()
	public void getLessNum(int num01, int num02) {
		System.out.println("첫 번쨰 수: "+num01);
		System.out.println("두 번쨰 수: "+num02);
		
		if(num01<num02) {
			System.out.println("더 작은 수: "+num01);
		}else if(num01>num02) {
			System.out.println("더 작은 수: "+num02);
		}else {
			System.out.println("두 수가 동일합니다.");
		}
	}
	
	// 시작수와 마지막수를 입력받아 numbering하고 , 총계
	public void showTot(int start, int end) {
		int tot = 0;
		for(int cnt=start;cnt<=end;cnt++) {
			System.out.print(cnt);
			tot += cnt;
			if(cnt==end) {
				System.out.println(" = "+tot);
			}else {
				System.out.print(" + ");
			}
		}
	}
	// ex) 매개변수를 받아서 두개의 값을 입력 받아 해당 2개의 단수를 구구단 단수의 결과를 출력하세요
	// getGugu(3,7) 3단과 7단 출력...
	public void getGugu(int num01, int num02) {
		System.out.println("# "+num01+"단 출력 #");
		for(int cnt=1;cnt<=9;cnt++) {
			System.out.print(num01+"×"+cnt);
			System.out.println(" = "+num01*cnt);
		}
		System.out.println("# "+num02+"단 출력 #");
		for(int cnt=1;cnt<=9;cnt++) {
			System.out.print(num02+"×"+cnt);
			System.out.println(" = "+num02*cnt);
		}
	}
	// ex) 판매물건의 단가, 확인 구매 갯수 최대치
	// 		3000		4
	//		1개 구매시 3000
	//		2개 구매시 6000
	//		3개 구매시 9000
	//		4개 구매시 12000
	// 		callBuyMaxCnt(물건의 단가, 구매최대값)
	
	void callBuyMaxCnt(int price, int maxCnt) {
		System.out.println("판매물건의 단가: "+price);
		System.out.println("구매 갯수 최대치: "+maxCnt);
		for(int cnt=1;cnt<=maxCnt;cnt++) {
			System.out.println(cnt+"개 구매시 "+price*cnt);
		}
		
		
	}
	
	
	// ex) 클래스 BankingSystem
	//		searchAccount(String accId)
	//		addAccount(int pcnt) 가입시 마다 계좌수가 누적
	//		addTotMoney(int money) 누적된 내용이 처리
	//
	

}
