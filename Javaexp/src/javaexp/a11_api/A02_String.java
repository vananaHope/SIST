package javaexp.a11_api;

public class A02_String {

	public static void main(String[] args) {
		
		/*
		 # String
		 1. 문자열형 객체형 데이터
		  	char ==> char[] ==> String
		  	한 자      문자배열		문자열 객체
		 2. 문자열의 비교
		  	1) 주소값 비교 원칙 (자바)
		  		stack  /   heap
		  		()		(		)
		  		
		  		모든 객체들은 heap영역에 실제 객체를 두고, 
		  		그 heap영역의 위치(주소값/참조변수)를 stack에 할당하여 사용한다.
		  		
		  		String name1 = "홍길동";
		  		String name2 = "홍길동";
		  		String name3 = new String("홍길동");
		  		String name4 = new String("홍길동");
		  		
		  		== : stack영역의 데이터를 비교하여 boolean값을 가져오는 것이다.
		  		new 무조건 객체가 다른 위치(heap)에 생성이 된다.
		  		
		  		처음에는 "홍길동"을 만들고 특정한 heap영역 위치에 할당
		  		그다음 만든 "홍길동"은 처음에 만들었던 "홍길동" 주소값을 그대로 사용해서 변수에 할당한다. 
		  		
		  		주의) 자바는 대부분 선언을 해서 문자열을 사용하는 것이 아니라 입력을 받던지, 파일에 있는 데이터를 
		  		로딩 하던지, 네트워크상으로 데이터를 가져오든지, DB Server에서 데이터를 가져오면 명시적으로 new String()이
		  		있지 않지만 내부적으로 처리되기에 주소값이 다르다고 봐야 한다.
		  		
		  		결론) 자바는 문자열 데이터를 비교할 때 == 쓰면 안된다.
		  		equals() 이용하여 사용하여야 한다.
		  		
		  		name3 == name4 ? false
		  		name1 == name2 ? true
		  		name1 == name4 ? false
		  		name1.equals(name4); ? true 
		  		
		 3. String의 기능 메서드
		 	1) 생성자
		 		new String()
		 		new String(byte[]) ***
		 			최종프로젝트에 활용
		 				비밀번호 잊었을 때, 임시 비밀번호 생성
		 				회사에서 최초 사번과 임시 비밀번호 발급
		 		new String(char[])
		 		new String("문자열")
		  		
		 */
		char[] arr = {'H','E','L','L','O'};
		String str = new String(arr);
		System.out.println("문자열 데이터 생성: "+str);
		byte[] arr1 = new byte[8];
		
		for(int cnt=0;cnt<=255;cnt++) {
			System.out.println(cnt+"\t"+(char)cnt);
		}
		
		// 숫자 48~57, 대문자 범위 65~90, 소문자의 범위 97~122 
		// 65~90 ==> (int)(Math.random()*26+65)
		for(int idx=0;idx<
				arr1.length;idx++) {
			byte num = (byte)(Math.random()*26+65);
			System.out.print(idx+1+"번째 임의의 수: "+num);
			System.out.println("\t"+(char)num);
			arr1[idx] = num;
		}
		String str2 = new String(arr1);
		System.out.println("알파벳 임의 문자: "+str2);
		
		// char[] 8들어 갈 수 있는 배열 
		char[] arr2 = new char[8];
		for(int idx=0;idx<arr2.length;idx++) {
			// 65~90
			arr2[idx] = (char)(Math.random()*26+65);
			
		}
		String str3 = new String(arr2);
		System.out.println("알파벳 임의 문자: "+str3);
		
		// 알파벳 대문자 A~Z 임의로 8자리 생성.. : 대문자의 범위 65~90
		// 알파벳 소/대문자  대문자의 범위 65~90   소문자의 범위 97~122 
		char[] arr3 = new char[8];
		for(int idx=0;idx<arr3.length;idx++) {
			int ranNum = (int)(Math.random()*52+65);
			// ranNum 65 ~ 116
			if(ranNum>90) ranNum+=6;
			arr3[idx] = (char)ranNum;
		}
		String str4 = new String(arr3);
		System.out.println("알파벳 대소문자 임의: "+str4);
		// 알파벳 소/대문자/숫자 
		// 숫자 48~57 대문자 65~90 소문자 97~122
	}	

}
