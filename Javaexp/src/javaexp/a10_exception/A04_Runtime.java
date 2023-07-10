package javaexp.a10_exception;

public class A04_Runtime {

	public static void main(String[] args) {
		System.out.println("로그인 프로그램");
		try {
			String id = args[0];
			String pwd = args[1];
			System.out.println("회원 아이디: "+id);
			System.out.println("패스워드: "+pwd);
			
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("# 예외 발생 #");
			System.out.println("아이디와 패스워드를 입력하세요.");
		}
		System.out.println("프로그램 종료");
	}

}
