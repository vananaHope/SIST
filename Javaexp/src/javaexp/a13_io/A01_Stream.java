package javaexp.a13_io;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class A01_Stream {

	public static void main(String[] args) {
		
		/*
		 # 데이터를 전송처리하는 Stream
		 1. 자바에서는 Stream이라는 API객체를 통해서, 데이터를
		 입력하거나 출력하는 등의 처리를 하고 있다.
		 	- 파일의 데이터를 입/출력 또는 파일 자체를 전송 처리
		 	- 문자를 입력받아서 출력하는 처리
		 	- 입력된 문자를 네트워크를 통해 전송하여 전달하는 처리
		 2. 기본 객체
		 	1) 입력 처리 : InputStream
		 		==> java에서 지원하는 기본 입력 처리 객체
		 		System.in : InputStream 객체를 리턴하는 객체
		 		
		 	2) 출력 처리 : OutputStream
		 		==> java에서 지원하는 기본 출력 처리 객체
		 		System.out : OutputStream 객체를 리턴하는 객체
		 	# java에서 main()프로그램을 통해서 기본적으로
		 	  console 창에서 데이터를 키보드를 통해 입력하여 입력된 데이터를
		 	  System.in이라는 InputStream을 통해서 관리할 수 있다.
		      또한, 데이터를 console창에서 출력하는 System.out 객체를 통해서
		 	  문자열 형식으로 println()메서드를 통해서 출력할 수 있다.
		 
		 3. InputStream을 통해 입력 데이터를 OutputStream으로 출력 처리하기
		 	1) InputStream is1 = System.in;
		 	2) 기본 입력 Stream객체는 다음과 같이 데이터를 처리한다.
		 		int data = is1.read(); 문자(char)를 byte형으로 입력받는다.
		 		byte[] bytes = new byte[10];
		 		is1.read(bytes);
		 		문자(영문)으로 10자를 입력해서 해당 입력 데이터가 bytes라는 배열에 코드값으로 입력된다.
		 		
		 		for(bytes b : bytes) {
		 			(char)b; // 입력된 문자 하나씩 가져와서 처리가능
		 		}
		 		==> Scanner는 이러한 Stream객체를 포함하여 데이터를 문자열까지 입력받아서
		 			효율적으로 사용할 수 있게 객체로 만듬
		 	3) char 형변환 처리
		 		char ch01 = (char)data;
		 	4) OutputStream os1 = System.out;
		 		os1.write(data); // 코드값을 char문자로 변환해서 출력
		 		
		 		os1.println("입력한 문자 출력:"+ch01);
		 	5) 필수 예외 처리하기 is1.read()에서 io가 발생하기에
		 		 컴파일 예외 처리를 하여야 한다.
		 		 
		 		 
		 * */
		System.out.println("# 기본 입력 문자 처리 #");
		System.out.print("문자 1자를 입력하세요: ");
		InputStream is01 = System.in;
		try {
			int data = is01.read();
			OutputStream os01 = System.out;
			System.out.print("입력 내용1:");
			os01.write(data); // write(byte) : 코드값을 출력
			os01.flush(); // 임시 메모리 해제
			
			char c01 = (char)data;
			System.out.print("\n입력 내용2: "+c01);
			os01.close(); // 자원 해제
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // 필수 예외 처리 구문...
		
		

	}

}
