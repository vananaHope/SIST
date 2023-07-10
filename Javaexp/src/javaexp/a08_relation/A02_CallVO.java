package javaexp.a08_relation;

import javaexp.a08_relation.vo.Music;
import javaexp.a08_relation.vo.Person;


public class A02_CallVO {
	// javaexp.a08_relation.vo 안에 Music VO클래스 선언
	// ex) Music 제목, 가수, 발매연도
	// main()호출
	public static void main(String[] args) {
		
		Person p01 = new Person("홍길동",25,"부산");
		System.out.println(p01.getName());
		System.out.println(p01.getAge());
		System.out.println(p01.getLoc());
		
		Music m01 = new Music("Painkiller","Ruel",2020);
		System.out.println("제목: "+m01.getMname());
		System.out.println("가수: "+m01.getSinger());
		System.out.println("발매연도: "+m01.getYear());

	}

}
