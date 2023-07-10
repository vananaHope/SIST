package javaexp.a13_io;

import java.io.File;

public class A05_DirFile {

	public static void main(String[] args) {
		
		// 공통 경로
		String path1 = "C:\\a01_javaexp\\workspace\\Javaexp\\src\\javaexp\\a13_io\\a01_folder\\";
		
		for(int cnt=1; cnt<=9; cnt++) {
			// 추가 경로 설정
			File f = new File(path1+"a0"+cnt);
			f.mkdir();
		}
		

		

	}

}
