package javaexp.a13_io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class A08_Reader {

	public static void main(String[] args) {
		
		String path = "C:\\a01_javaexp\\workspace\\Javaexp\\src\\javaexp\\a13_io\\";
		
		Reader r1 = null;

		try {
			r1 = new FileReader(path+"z04_data.txt");
			
			while(true) {
				int lyrics = r1.read();
				if(lyrics==-1) {
					break;
				}
				System.out.print((char)lyrics);
			}
			r1.close();
			System.out.println("\n읽기 종료!");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("해당 파일을 찾을 수 없습니다!");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("IO 예외");
		} catch (Exception e) {
			System.out.println("기타예외"+e.getMessage());
		} finally {
			if(r1!=null) {
				// reader 객체가 메모리에 있을 때 최종으로 자원해제
				try {
					r1.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			System.out.println("# 최종 자원 해제 #");
		}
	}

}
