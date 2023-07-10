package javaexp.a08_relation.a03_pck;

import javaexp.a08_relation.a04_pck.Mouse;

public class Computer {
	Mouse m01; // ctrl + shift + o
//	KeyBoard k01; 외부패키지라 접근이 불가능
	void call() {
		m01 = new Mouse();
//		m01 = new Mouse("로지텍"); // 접근 불가능
	}
}

// ex) Mouse에 생성자를 2개(생성자 오버로딩 규칙) public/x
//		선언하고 call()에서 객체 생성 여부를 확인
