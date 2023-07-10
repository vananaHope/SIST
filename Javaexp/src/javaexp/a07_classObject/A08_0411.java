package javaexp.a07_classObject;

public class A08_0411 {

	public static void main(String[] args) {
		// 1. ul과 ol의 차이점을 기본예제를 통해서 기술하세요
		/*
		 ul(Unordered List) : 순서가 없는 리스트
		 
		 <ul>
		 	<li>이름</li>
		 	<li>나이</li>
		 	<li>지역</li>
		</ul>
		
		ol(Ordered List) : 순서가 있는 리스트
		
		<ol>
			<li>이름</li>
		 	<li>나이</li>
		 	<li>지역</li>
		</ol>
		 
		 */
		
		//2. 중첩태그 코드란 무엇인지 형식과 예제를 기술하세요.
		/*
		 1) 형식
		 상위태그 하위태그
		 2) 계층적으로 입력해서 두 가지 기능을 모두 처리하도록 한다.
		 
		 <h2>음식점 메뉴 리스트</h2>
		 <ol>
		 	<li><a href="">라면</a></li>
		 	<li><a href="">제육볶음</a></li>
		 	<li><a href="">떡볶이</a></li>
		 	<li><a href="">된장찌개</a></li>
		 </ol>
		 
		 	
		*/
		
		//3. ul과 ol의 속성을 기술하고, 속성값이 적용된 예제를 만들어 보세요.
		/*
		 1) ol 속성
		 	- type : 1, A, a, I, i로 li의 리스트 앞에 정렬 문자를 포함해서 나열한다.
					설정하지 않으면 default로 숫자 1,2,3 형식으로 처리된다
			- start : 위에 설정된 type의 시작순서의 문자를 지정한다.
			   		  type="1" start="2"
			   		  타입은 아리비아 문자표현 시작번호는 2부터 처리가 된다.	
		 2) ul 속성
		 	- disc : default값으로 원(내용포함)
		 	- square : 사각형 모양
		 	- circle : 원(외곽선)
		 	
		 	<h2>좋아하는 과일 순위</h2>
		 	<ol type="I" start="1">
		 		<li>복숭아</li>
		 		<li>딸기</li>
		 		<li>바나나</li>
			</ol>		
			
			<h2>좋아하는 음식 리스트</h2>
			<ul type="square">
				<li>불고기</li>
				<li>짜장면</li>
				<li>초밥</li>
			</ul>			
		 */
		//4.  ul/ol을 중첩적으로 사용하여, 학년 반별 학생명단을 리스트하세요
		/*
		 <h2>학년 반별 학생명단</h2>
		 <ul>
		 	<li>1학년 1반</li>
		 		<ol>
		 			<li>철수</li>
		 			<li>수지</li>
		 			<li>동현</li>
		 			<li>길동</li>
		 		</ol>
		 	<li>1학년 2반</li>
		 		<ol>
		 			<li>동구</li>
		 			<li>동균</li>
		 			<li>진구</li>
		 			<li>영희</li>
		 		</ol>	
		 </ul>		
		 */
		
		//5. table의 계층별 구성요소의 의미를 기본 예제를 통해서 기술하세요..
		/*
		 <table>
		 	<thead>
		 		<tr><td>순위</td><td>과일 이름</td>
		 	</thead>
		 	<tbody>
		 		<tr>
		 			<td>1</td><td>딸기</td>
		 		</tr>
		 		<tr>
		 			<td>2</td><td>키위</td>
		 		</tr>
		 		<tr>
		 			<td>3</td><td>복숭아</td>
		 		</tr>
		 	</tbody>
		 	<tfoot>
		 		<tr>
		 			<td>총 갯수</td><td>3개</td>
		 		</tr>
		 	</tfoot>
		 </table>		
		 */
		
		//6. table의 전체 계층 구조로 회원 현황을 만드세요
	    //   순차번호, 아이디 회원명 권한 포인트
		
		/*
		 <table>
		 	<thead>
		 		<tr><td>순차번호</td><td>아이디</td><td>회원명</td><td>권한</td><td>포인트</td></tr>
		 	</thead>
		 	<tbody>
		 		<tr><td>1</td><td>himan</td><td>철수</td><td>VIP</td><td>10000</td></tr>
		 		<tr><td>2</td><td>hiWoman</td><td>영희</td><td>Bronze</td><td>1000</td></tr>
		 		<tr><td>3</td><td>hihi123</td><td>고수</td><td>Silver</td><td>5000</td></tr>
		 	</tbody>
		 	<tfoot>
		 		<tr><td>포인트 합산</td><td>16000</td>
		 	</tfoot>
		 </table>
		 
		 */
		//7. 매서드의 구성요소와 해당 구성요소의 특징을 기본 예제를 만들어서 설명하세요
		/*
		 - 구성요소
		  리턴 유형 : 메서드로 처리해서 결과값을 리턴하는데 메서드 가장 마지막에 리턴값의 유형을 정해주는 것
		  
		  메서드명(매개변수) : 매개변수는 외부에서 받은 데이터를 지역변수로 받은 후 사용한다.
		  				 메서드명과 매개변수의 선언 기준은 외부에서 호출할 때 식별 할 수 있느냐 여부에 따른다.
		  				 즉 메서드 오버로딩 규칙이 적용된다.
		  
		  프로세스 처리 : 매개변수 값을 받아서 전역변수에 할당해서 사용하거나 특정 조건처리/ 반복처리와 같은 로직을 
		  			  처리하는 데 사용된다.
		  			  
		  최종 리턴값 : 처음에 선언한 리턴유형에 맞는 최종 리턴값을 해당 메서드를 통해서
		 			처리할 수 있다.		  
		 
		 */
		
		Member mem01 = new Member("홍길동","서울");
		System.out.println(mem01.getName());
		System.out.println(mem01.getRegion());
		
		// 8.메서드의 리턴유형을 정수,실수,문자열,boolean을 선언하여 실제 데이터를 리턴하고, 메인메서드에서 호출하세요
			
		MExp m01 = new MExp(12,3.14,"철수",true);
		System.out.println(m01.numInt);
		System.out.println(m01.numDouble);
		System.out.println(m01.strExp);
		System.out.println(m01.booExp);
		
		//9. Product88이라는 클래스를 선언하고, 생성자를 통해 물건명, 가격, 갯수를 초기화하게 했다.
	    //  이 때, 메서드1 물건명 리턴, 메서드2 가격리턴, 메서드3는 가격과갯수를 연산한 총계를 리턴하게
	    //  선언하고 해당 메서드를 호출하여 리턴값을 확인하세요
		
		Product88 prod1 = new Product88("바나나",5000,2);
		System.out.println("물건명: "+prod1.getPname());
		System.out.println("가격: "+prod1.getPrice());
		System.out.println("총계: "+prod1.getTot());
		
		//10. BBPlayer라는 클래스를 선언하고, 생성자를 통해 필드값 이름, 팀명, 타석, 안타를 초기화하게 하고,
	    //  메서드1에서는 이름과 팀명을 리턴, 메서드2에서는 타율(안타/타석)을 리턴하여 호출되게 하여
	    //  메인메서드를 통해서 출력하세요
		
		BBPlayer bb01 = new BBPlayer("황성빈","롯데 자이언츠",14,6);
		String NameTeam = bb01.getNT();
		System.out.println("이름과 팀명: "+NameTeam);
		System.out.println("타율: "+bb01.getHitRate());
		
		
	}

}

class BBPlayer {
	String bbName;
	String bbTeam;
	int bbNum;
	int bbHit;
	public BBPlayer(String bbName, String bbTeam, int bbNum, int bbHit) {
		this.bbName = bbName;
		this.bbTeam = bbTeam;
		this.bbNum = bbNum;
		this.bbHit = bbHit;
	}
	
	String getNT() {
		return bbName+" / "+bbTeam;
	}
	
	double getHitRate() {
		return bbHit/(double)bbNum;
	}
}



class Product88 {
	String prodName;
	int price;
	int cnt;
	public Product88(String prodName, int price, int cnt) {
		this.prodName = prodName;
		this.price = price;
		this.cnt = cnt;
	}
	
	String getPname() {
		return prodName;
	}
	int getPrice() {
		return price;
	}
	int getTot() {
		return price*cnt;
	}
}



class MExp {
	int numInt;
	double numDouble;
	String strExp;
	boolean booExp;
	public MExp(int numInt, double numDouble, String strExp, boolean booExp) {
		this.numInt = numInt;
		this.numDouble = numDouble;
		this.strExp = strExp;
		this.booExp = booExp;
	}
	
	int getInt() {
		return numInt;
	}
	double getDouble() {
		return numDouble;
	}
	String getStr() {
		return strExp;
	}
	boolean getBoo() {
		return booExp;
	}
}

class Member {
	String name;
	String region;
	public Member(String name, String region) {
		this.name = name;
		this.region = region;
	}
	
	String getName() {
		return name;
	}
	String getRegion() {
		return region;
	}
}

