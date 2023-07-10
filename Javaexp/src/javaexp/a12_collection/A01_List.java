package javaexp.a12_collection;

import java.util.ArrayList;
import java.util.List;

public class A01_List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 # List 컬렉션
		 1. 특징
		 	1) 인덱스로 관리
		 	2) 중복해서 객체 저장 가능
		 2. 구현 실제 클래스
		 	ArrayList
		 	Vector
		 	LinkedList
		 3. 공통 메서드
		 	1) *boolean add(추가할 객체) : 제일 마지막에 추가
		 	2) void add(int index, 추가객체) : 특정한 위치에 추가
		 	3) set(int index, 변경할 객체)
		 	4) boolean contains(요소객체) : 요소객체 있는 지 여부
		 	5) *get(int index) : 특정 위치에 있는 요소객체 가져오기
		 	6) *boolean isEmpty() : 컬렉션이 비어 있는 지 확인
		 	7) *int size() : 크기
		 	8) void clear() : 포함된 모든 객체 삭제
		 	9) remove(int index) : 해당 위치의 객체 삭제
		 	10) boolean remove(Object o) : 주어진 객체 삭제
		 */
		
		// 인터페이스 List = ArrayList 처리...
		List<String> flist = new ArrayList<String>();
		flist.add("사과");
		flist.add("수박");
		flist.add("참외");
		flist.add(0,"오렌지"); // 특정 위치
		flist.set(1,"키위"); // 특정 위치 변경
		System.out.println("있는 지 여부: "+flist.contains("키위"));
		if(!flist.isEmpty()) {
			System.out.println("크키가: "+flist.size());
		}else {
			System.out.println("없음.");
		}
		flist.remove(1);
		System.out.println("현재 데이터 내용");
		for(int idx=0;idx<flist.size();idx++) {
			System.out.println(idx+1+")"+flist.get(idx));
		}
		
		flist.clear();
		System.out.println("비어 있는지? "+flist.isEmpty());
		
		// ex) List<String>형태로 회원 3명의 아이디를 추가하고
		// 		1) 특정 회원을 1번째 위치에 추가
		// 		2) 2번쨰 특정 회원을 변경 처리 
		// 		3) "himan"이 있는 지 확인
		//		4) 마지막 회원을 삭제 처리
		//		5) 전체 회원 리스트 출력...
		
		
		List<String> mlist = new ArrayList<String>();
		mlist.add("himan");
		mlist.add("hiwoman");
		mlist.add("luck777");
		
		System.out.println("변경 전 전체 회원 목록");
		for(int idx=0;idx<mlist.size();idx++) {
			System.out.println(idx+1+")"+mlist.get(idx));
		}
		
		
		mlist.add(0,"himan111");
		mlist.set(1, "hiwoman222");
		if(mlist.contains("himan")) {
			System.out.println("himan 있음");
		}else {
			System.out.println("himan 없음");
		}
		mlist.remove(mlist.size()-1); // 마지막 회원 삭제
		
		System.out.println("변경 후 전체 회원 목록");
		for(int idx=0;idx<mlist.size();idx++) {
			System.out.println(idx+1+")"+mlist.get(idx));
		}
		
		ArrayList<Person> plist = new ArrayList<Person>();
		plist.add(new Person("홍길동",25,"서울"));
		plist.add(new Person("김길동",27,"부산"));
		plist.add(new Person("신길동",31,"대구"));
		plist.add(new Person("오길동",20,"광주"));
		plist.add(new Person("마길동",35,"제주"));
		
		Person p01 = plist.get(1);
		System.out.println("두번째 객체의 이름: "+p01.getName());
		System.out.println("다섯번째 객체의 이름: "+plist.get(4).getName());
		// ex) list for each, for(int idx)
		
		System.out.println("이름\t나이\t지역");
		for(Person p:plist) {
			System.out.print(p.getName()+"\t");
			System.out.print(p.getAge()+"\t");
			System.out.print(p.getLoc()+"\n");
		}
		
		for(int idx=0;idx<plist.size();idx++) {
			Person p = plist.get(idx);
			System.out.print(p.getName()+"\t");
			System.out.print(p.getAge()+"\t");
			System.out.print(p.getLoc()+"\n");
		}
		
		
		// ex) Student 반, 번호, 이름, 점수 속성으로해서 VO ArrayList 할당
		//		3개 할당 후, 마지막 객체의 이름 호출, 첫 번째 객체의 점수 호출.
		
		ArrayList<Student> slist = new ArrayList<Student>();
		slist.add(new Student(1,5,"홍철수",90));
		slist.add(new Student(1,10,"김영희",70));
		slist.add(new Student(2,1,"김희태",65));
		
		System.out.println("마지막 객체의 이름: "+slist.get(2).getsName());
		System.out.println("첫 번쨰 객체의 점수: "+slist.get(0).getGrade());
		System.out.println("반\t번호\t이름\t점수");
		for(Student st:slist) {
			System.out.print(st.getNum()+"\t");
			System.out.print(st.getsNum()+"\t");
			System.out.print(st.getsName()+"\t");
			System.out.print(st.getGrade()+"\n");
		}
	}

}

class Student {
	private int num;
	private int sNum;
	private String sName;
	private int grade;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	public Student(int num, int sNum, String sName, int grade) {
		this.num = num;
		this.sNum = sNum;
		this.sName = sName;
		this.grade = grade;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public int getsNum() {
		return sNum;
	}
	public void setsNum(int sNum) {
		this.sNum = sNum;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	
	
}



class Person {
	private String name;
	private int age;
	private String loc;
	public Person() {
		// TODO Auto-generated constructor stub
	}
	public Person(String name, int age, String loc) {
		this.name = name;
		this.age = age;
		this.loc = loc;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	
}