package javaexp.z01_home;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Writer;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class A20_0503 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// ctrl + shift + f : 코드 자동 정렬
		
		// 1. set객체의 특징을 예제를 통하여 기술하세요
		/*
		 * 1. 객체를 중복 저장 불가 2. 저장 순서가 유지되지 않는다
		 */

		Set<String> smartphone = new HashSet<String>();
		smartphone.add("갤럭시");
		smartphone.add("갤럭시");
		smartphone.add("아이폰");
		smartphone.add("아이폰");
		smartphone.add("샤오미");
		smartphone.add("모토로라");
		smartphone.add("모토로라");
		smartphone.add("모토로라");

		System.out.println("# 스마트폰 종류 #");

		for (String s : smartphone) {
			System.out.println(s);
		}

		// 2. 사과, 바나나, 딸기, 오렌지, 수박을 랜덤으로 10회 Set 주머니에 넣었을 때, 들어간 과일의 종류를 출력하세요.
		Random r1 = new Random();
		Set<String> fruits = new HashSet<String>();
		String[] fruitName = { "사과", "바나나", "딸기", "오렌지", "수박" };

		for (int cnt = 1; cnt <= 10; cnt++) {
			int ran = r1.nextInt(5);
			fruits.add(fruitName[ran]);
		}

		System.out.println("# 들어간 과일의 종류 #");
		for (String f : fruits) {
			System.out.println(f);
		}
		// 3. map객체의 특징을 기본 예제를 통하여 설명하세요

		/*
		 * 1. 키와 값으로 구성된 객체를 저장하는 구조이다. 2. 키는 중복이 불가능하지만 값은 중복이 가능하다. 3. put(key,
		 * value)를 통해 키와 값을 추가한다. 4. keySet()을 통해 모든 키를 Set 객체에 담아서 리턴한다.
		 */

		Map<Integer, String> mapMem = new HashMap<Integer, String>();

		mapMem.put(1, "홍길동");
		mapMem.put(1, "김길동");
		mapMem.put(2, "오길동");
		mapMem.put(3, "오길동");
		mapMem.put(4, "신길동");

		System.out.println("Key\t이름");
		for (int k : mapMem.keySet()) {
			System.out.print(k + "\t");
			System.out.print(mapMem.get(k) + "\n");
		}

		// 4. map으로 회원의 정보를 저장할려고 한다. 저장하고 저장된 정보를 호출할 때, 동일한 id로 회원 정보를
		// 입력하고 변경되는 회원 정보를 처리해보세요.

		Map<String, Member> memMap = new HashMap<String, Member>();
		memMap.put("himan", new Member("홍길동", "서울", 17));
		memMap.put("himan", new Member("김길동", "경기도", 19));
		memMap.put("luck777", new Member("오길동", "충청도", 39));
		memMap.put("hiwoman", new Member("신길동", "전라도", 27));

		System.out.println("아이디\t회원명\t지역\t나이");
		for (String memid : memMap.keySet()) {
			Member m1 = memMap.get(memid);
			System.out.print(memid + "\t");
			System.out.print(m1.getName() + "\t");
			System.out.print(m1.getRegion() + "\t");
			System.out.print(m1.getAge() + "\n");
		}

		// 5. 입력처리하는 기본 객체와 출력 처리하는 기본 객체를 기본예제를 통해 설명하세요.

		System.out.print("객체 지향 프로그램의 대표적 언어를 선택하세요. 1. 자바 2. 파이썬 3. C ");
		InputStream is01 = System.in;

		try {
			OutputStream os01 = System.out;
			int data = is01.read();
			System.out.print("입력한 내용: ");
			os01.write(data);
			os01.flush();
			char answer = '1';
			char inputAnswer = (char) data;
			System.out.println();
			System.out.println("정답: " + answer + "번");
			System.out.println("정답 여부: " + (answer == inputAnswer));

		} catch (IOException e) {
			e.printStackTrace();
		}

		// 6. c:\a01_javaexp\z01_fileExp\ 하위에 a1~a9폴드가 생성되고,
		// 각 폴드에 show01.txt~show09.txt 파일을 생성해보세요.
		String path = "C:\\a01_javaexp\\workspace\\Javaexp\\src\\javaexp\\z01_fileExp\\";

		for (int cnt = 1; cnt <= 9; cnt++) {
			File f = new File(path + "a" + cnt);
			f.mkdir();
			for (int cnt2 = 1; cnt2 <= 9; cnt2++) {
				File f1 = new File(path + "a" + cnt + "\\show0" + cnt2 + ".txt");
				try {
					f1.createNewFile();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

		// 7. c:\a01_javaexp\z01_fileExp\a1\show01.txt에 입력받은 물건명/가격/갯수 정보를 저장하세요.

		String path2 = "C:\\a01_javaexp\\workspace\\Javaexp\\src\\javaexp\\z01_fileExp\\a1\\";

		Scanner sc2 = new Scanner(System.in);

		System.out.print("물건명을 입력하세요 ");
		String pname = sc2.next();
		System.out.print("가격을 입력하세요 ");
		int price = sc2.nextInt();
		System.out.print("갯수를 입력하세요 ");
		int count = sc2.nextInt();

		Writer w = null;

		try {
			w = new FileWriter(path2 + "show01.txt");

			w.write("물건명: ");
			w.append(pname + "\n");
			w.append("가격: ");
			w.append(price + "\n");
			w.append("갯수: ");
			w.append(count + "\n");
			w.flush();

			System.out.println("입력완료");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				w.close(); // 자원 해제
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}

class Member {
	private String name;
	private String region;
	private int age;

	public Member(String name, String region, int age) {
		this.name = name;
		this.region = region;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
