package javaexp.a07_classObject;

public class A07_0410 {

	public static void main(String[] args) {
		// 1. 클래스와 객체의 차이점을 예제를 통하여 기술하세요
		EverLand seoul = new EverLand();
		EverLand busan = new EverLand();
		EverLand gangwon = new EverLand();
		
		System.out.println(seoul);
		System.out.println(busan);
		System.out.println(gangwon);
		
		/*
		클래스는 설계도이고 객체는 설계도를 바탕으로 만드는 구체적인 물체나 사물이다.
		하나의 클래스를 만들면 여러 개의 인스턴스를 만들 수 있다.
		ex) 에버랜드를 서울,부산,강원도 등 다양한 곳에 설계도를 바탕으로 만들 수 있음
		
		
		*/
		
		// 2. 필드의 특성을 예제를 통해 기술하세요
		
		/*
		필드는 클래스(객체)의 전역변수(상수)이며 클래스의 모든 구성 요소에 영향을 미친다.
		지역변수와 이름이 같을 경우 클래스 내에서 this.필드명을 통해 구분한다.
		객체 생성시는 참조명.전역변수로 사용
		*/
		
		Person3 p01 = new Person3("홍길동",27);
		System.out.println("이름: "+p01.name);
		System.out.println("나이: "+p01.age);
		
		// 3. 생성자와 일반 메서드의 기능적 차이점을 기술하세요
		/*
		 생성자는 클래스를 생성할 때 클래스명과 똑같은 함수를 만드는 것을 말한다.
		 또한, 함수의 일부 기능을 사용할 수 있으며 주로 저장 기능을 이용한다.
		 객체의 초기화를 위해서 사용된다.
		 클래스를 만들 때 생성자를 만들지 않으면 자동으로 클래스명과 동일하고 매개변수가 없는 함수를
		 만들어 실행시 사용할 수 있도록 한다.
		 
		 일반 메서드는 저장,로직,리턴에 해당하는 함수의 모든 기능을 사용할 수 있다.
		 
		 */
		
		//4. Computer 클래스에서 속성으로 제조사, cpu종류, ram 메모리용랑, ssd용량을 속성을 지정하여,
//	      기본생성자, 매개변수가 3개인 생성자(오버로딩규칙에 의해 2개 선언)를 선언하고, 
//	      객체를 생성하고 확인하세요.
			
		Computer01 com01 = new Computer01("AMD",32,500);
		System.out.println("제조사: "+com01.company);
		System.out.println("ram 메모리 용량: "+com01.ramMem);
		System.out.println("ssd 용량: "+com01.ssdMem);
		
		Computer01 com02 = new Computer01(64,500,"Intel");
		System.out.println("제조사: "+com02.company);
		System.out.println("ram 메모리 용량: "+com02.ramMem);
		System.out.println("ssd 용량: "+com02.ssdMem);
		
		//5. html의 meta 정보의 의미를 기술하세요
		
		/*
		
		메타 데이터는 데이터를 설명하는 데이터를 의미한다.
		
		ex)
		사진을 찍었을 때 사진에 담겨있는 장소나 시간 
		오디오 데이터에 있는 재생 시간, 채널 수
		이미지 데이터에 들어 있는 이미지 폭, 넓이, 컬러 해상도 등
		
		html에서 메타 정보를 담기위한 태그로는 link, base, meta, style, script 등이 있다.
		메타 태그들은 head 태그 안에 넣어서 작성해야 하며 script 태그 같은 경우에는 body태그 안에
		작성할 수 있다.
		
		*/
		
		// 6. base 태그를 처리하는 방법을 예제를 통해서 기술하세요 
		/*
		 <!DOCTYPE html>
    		<head>
		        <base href="http://localhost:8080/frontWeb/a03/">
		        <meta charset="UTF-8">
		        <title>Document</title>
    		</head>
    		<body>
        		<a href="a01_show.html">base 이동합니다.</a>
    		</body>
		</html>
		 */
		
		// 7.  img 태그가 가지고 있는 속성을 기술하세요
		/*
		 img 태그의 src에 이미지 주소를 지정한다.
		 <img src="이미지 주소">
		 alt="이미지 없을 때 나오는 문자열"
		 width="이미지 넓이"
		 height="이미지 폭"
		 
		 src를 통해 지정할 수 있는 이미지 종류는 bmp, gif, png, jpg가 있다.
		 */
		
		// 8. webapp 하위에 a00_img안에 img03.jpg를 복사해와서 현재 폴드에서 
//	      img 태그로 호출해서 수행 하는 것과,  a00_img하위  img05.jpg
//	      파일을 해당 경로 그대로 두고, img 태그로 호출해서 수행하는 것의 차이점을 기술하세요.
		
		/*
		 1. <img src="img03.jpg"> : 이 내용을 포함한 html 파일의 같은 폴더에 있는 img가 있는 경우
		 2. <img src="/frontWeb/a00_img/img05.jpg">
		 3. 외부 서버에 특정한 이미지가 있는 경우..
		 	<img src="https://www.google.com/url?sa=i&url=https%3A%2F%2Fnews.samsungdisplay.com%2F15580&psig=AOvVaw0AKA4ZEAknB2JiD5rsOyWA&ust=1681262230113000&source=images&cd=vfe&ved=0CBEQjRxqFwoTCMjh5ILUoP4CFQAAAAAdAAAAABAE">
		 
		 첫 번째 경우는 현재 폴더에 사진 파일이 있어야지 작동하며 일일이 필요한 이미지들을 현재 폴더로 복사해와야하는
		 번거로움이 있다.
		 하지만 두 번째 경우는 이미지들을 한 곳에 모아놓고 필요한 이미지가 있을 때마다 현재 폴더에 복사하는 것 없이
		 경로를 입력하는 것만으로 불러와서 쓸 수 있다. 또한, src/webapp의 경로를 생략하고 /frontWeb만으로
		 처리할 수 있어서 간편하다.
		 */
		
	}

}

class EverLand {
	
}

class Person3 {
	String name;
	int age;
	
	Person3(String name, int age) {
		this.name = name;
		this.age = age;
	}
}

class Computer01 {
	String company;
	String cpu;
	int ramMem;
	int ssdMem;
	Computer01() {
		
	}
	Computer01(String company,int ramMem, int ssdMem) {
		this.company = company;
		this.ramMem = ramMem;
		this.ssdMem = ssdMem;
	}
	
	Computer01(int ramMem, int ssdMem, String company) {
		this.company = company;
		this.ramMem = ramMem;
		this.ssdMem = ssdMem;
	}
}