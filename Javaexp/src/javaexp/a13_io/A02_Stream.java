package javaexp.a13_io;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class A02_Stream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print("정답 번호를 입력하세요 ");
		InputStream is02 = System.in;
		
		
		try {
			int data = is02.read();
			// is.read(byte[] bytes) : 여러 개의 문자를 입력 받음.
			// bytes : 입력된 문자의 배열을 코드값으로 배열에 저장
			// new String(bytes) : 여러 개의 문자열 데이터를 확인
			OutputStream os1 = System.out;
			System.out.print("입력된 정답 번호: ");
			os1.write(data); // write를 통해서 char 한 자를 출력
			// os1.write(byte[])  문자열을 출력
			os1.flush();
			char corChar = '3';
			char inputChar = (char)data;
			System.out.println("정답: "+corChar+"번");
			System.out.println("정답 여부: "+(corChar==inputChar));
			
			
		}catch(IOException e) {
			
		}
	}

}
