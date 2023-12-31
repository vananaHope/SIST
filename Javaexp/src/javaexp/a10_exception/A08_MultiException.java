package javaexp.a10_exception;

public class A08_MultiException {

	public static void main(String[] args) {
		
		try {
			System.out.println("# 프로그램 시작 #");
			System.out.println(Integer.parseInt("이십오"));
			System.out.println(1/0);
			System.out.println(args[0]);
			
		}catch(NumberFormatException e) { //하위
			// 최상위가 아닐 때, 특정한 예외에 대한 처리를 구체화 필요할 때...
			System.out.println("예외처리 1: "+e.getMessage());
		}catch(ArithmeticException e) { //하위
			// 최상위가 아닐 때, 특정한 예외에 대한 처리를 구체화 필요할 때...
			System.out.println("예외처리 2: "+e.getMessage());
		}catch(Exception e) { //그외 모든
			// 기타 모든 내용을 한꺼번에 처리
			System.out.println("예외처리3: "+e.getMessage());
		}finally {
			System.out.println("예외 상관없이 처리할 구문");
		}
		System.out.println("프로그램 종료");

	}

}
