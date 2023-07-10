package javaexp.a10_exception;

public class A02_BasicException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			System.out.println("라인1");
			System.out.println("라인2");
			System.out.println("라인3");
			System.out.println("라인4");
			System.out.println(1/0);
			System.out.println("라인5");
			System.out.println("라인6");
			
		}catch (Exception e) {
			System.out.println("# 예외 처리 #");
			System.out.println("라인7");
			System.out.println("에러내용: "+e.getMessage());
			System.out.println("라인8");
			System.out.println("라인9");
		}
		
		
		try {
			for(int i=1; i<=100; i++) {
				System.out.println(i+"번");
				if(i==50) { // 조건이 50일 때 바로 예외 던짐
					System.out.println(1/0);
				}
				
			}
			
			
		}catch (Exception e) {
			System.out.println("에러가 발생했습니다.");
			System.out.println("에러 내용: "+e.getMessage());
			
		}
		
		
		
	}

}
