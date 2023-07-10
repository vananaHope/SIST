package javaexp.a12_collection;

import java.util.HashMap;
import java.util.Map;

public class A03_Map {

	public static void main(String[] args) {
		
		/*
		 # Map 컬렉션의 특징 및 주요 메서드
		 1. 특징
		 	- 키와 값으로 구성된 Map.Entry객체를 저장하는 구조
		 	- 키와 값은 모두 객체
		 	- 키는 중복될 수 없지만, 값은 중복 저장 가능
		 	// ex) 학번의 이름, 주민번호와 이름
		 2. 구현 클래스
		 	HashMap, HashTable, LinkedHashMap
		 	Properties, TreeMap
		 3. 주요 메서드
		 	put(key, value) : 주어진 키와 값을 추가, 저장이 되는 값을 리턴
		 	containsKey(Object key) : 주어진 키가 있는 지 여부
		 	containsValue(Object val) : 주어진 값이 있는 지 여부
		 	set<Map.Entry<K,V>> entrySet()
		 		키와 값의 쌍으로 구성된 모든 Map.Entry객체를 set에 담아서 리턴
		 	V get(Object key) : 컬렉션에 있는 데이터를 가져온다.
		 	keySet() : 모든 키를 Set 객체에 담아서 리턴
		 	size() : 저장된 크기
		 	clear() : 전체 삭제
		 	remove(Object key) : 키로 해당 구성 데이터 삭제	
		 
		 
		 * */

		// 문자열 key, 문자열 value으로 설정 map 선언과 할당
		Map<String, String> map01 = new HashMap<String, String>();
		
		map01.put("1000", "홍길동");
		map01.put("1000", "김길동"); // 키를 중복
		map01.put("1001", "오길동");
		map01.put("1002", "오길동"); // 값을 중복
		
		// map01.keySet() 키를 Set객체로 가져오는 메서드
		for(String key:map01.keySet()) {
			System.out.print(key+"\t");
			// .get(key) : 해당 key에 대한 값을 가져온다.
			System.out.print(map01.get(key)+"\n");
		}
		// 키는 중복되지 않으나, 값은 중복되어 가져온다.
		// 키의 중복은 최종 입력된 것 기준으로 처리된다.
		// 물건명과 가격을 key/value 형식으로 설정해서 Map에 할당하되
		// 물건명이 중복된 것과 가격이 중복된 것을 입력하고 
		// 그 결과값을 확인하세요
		
		// 문자의 key와 정수의 value를 할당할 수 있는 map
		Map<String, Integer> prod01 = new HashMap<String, Integer>();
		// Integer i = 3000; autoBoxing
		// int num = i;		 autoUnBoxing
		prod01.put("바나나", 5000);
		prod01.put("바나나", 3000);
		prod01.put("키위", 2000);
		prod01.put("딸기", 2000);
		
		for(String prod : prod01.keySet()) {
			System.out.print(prod+"\t");
			System.out.print(prod01.get(prod)+"\n");
		}
		/*
		// 키, 값 형식으로 처리되기에 사용자 정의 클래스를 통한 객체도
		// 키/객체 형식으로 할당할 수 있다.
		// 1. 처리 순서
				1) 사용자 정의 클래스 정의
				2) key/객체 형식으로 추가 처리
				3) 반복문을 통한 객체의 속성값 호출...
		   2. 예제
		   		학생 번호를 key로 하여 학생 클래스를 정의하고, 해당 학생 객체를 key에 할당하여 처리하자
		
		 */
		Map<Integer, StudentMap> stdMap = new HashMap<Integer, StudentMap>();
		
		stdMap.put(1000, new StudentMap("홍길동",70,90,90));
		stdMap.put(1000, new StudentMap("오길동",80,80,90));
		stdMap.put(2000, new StudentMap("김길동",80,95,92));
		stdMap.put(3000, new StudentMap("마길동",76,95,92));
		stdMap.put(4000, new StudentMap("신길동",80,95,82));
		System.out.println("# 학생 정보 #");
		for(int stno : stdMap.keySet()) {
			StudentMap st = stdMap.get(stno);
			System.out.println("학번: "+stno);
			System.out.print(st.getName()+"\t");
			System.out.print(st.getKor()+"\t");
			System.out.print(st.getEng()+"\t");
			System.out.print(st.getMath()+"\n");
		}
		
		// ex) 물건의 serialno를 key로 하여, Product클래스를 만들어 Map으로 할당하고 출력처리하세요
		//		물건명, 가격, 갯수
	
		Map<Integer, Product> prodMap = new HashMap<Integer, Product>();
		
		prodMap.put(1000, new Product("딸기",3000,2));
		prodMap.put(2000, new Product("바나나",4000,1));
		prodMap.put(3000, new Product("복숭아",5000,3));
		
		System.out.println("시리얼넘버\t물건명\t가격\t갯수");
		for(int serialno : prodMap.keySet()) {
			Product pr = prodMap.get(serialno);
			System.out.print(serialno+"\t");
			System.out.print(pr.getProdName()+"\t");
			System.out.print(pr.getPrice()+"\t");
			System.out.print(pr.getCnt()+"\n");
		}
	
	}

}
class Product {
	private String prodName;
	private int price;
	private int cnt;
	
	public Product(String prodName, int price, int cnt) {
		this.prodName = prodName;
		this.price = price;
		this.cnt = cnt;
	}
	
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getCnt() {
		return cnt;
	}
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	
}




class StudentMap {
	private String name;
	private int kor;
	private int eng;
	private int math;
	public StudentMap(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
}