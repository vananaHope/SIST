package javaexp.a13_io;

import java.io.File;
import java.io.IOException;

public class A04_File {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// C:\a01_javaexp\workspace\Javaexp\src\javaexp\a13_io\a01_folder\a01_sample.txt
		// 만든 하위 폴더 a01_folder경로에
		// a01.txt ~ a03.txt 파일 3개를 생성하세요.
		String path = "C:\\a01_javaexp\\workspace\\Javaexp\\src\\javaexp\\a13_io\\a01_folder\\";
		File f1 = new File(path+"a01.txt");
		File f2 = new File(path+"a02.txt");
		File f3 = new File(path+"a03.txt");

		try {
			f1.createNewFile();
			f2.createNewFile();
			f3.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

}
