package javaexp.a06_memory;

public class A03_ArrayUsing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 # 배열의 활용
		 1. 배열은 선언과 동시에 원하는 데이터를 아래와 같이 할당할 수 있다.
		  
		 
		 */
		 int arry[]; 
		 arry = new int[] {1000,2000,3000};
		 System.out.println("배열의 크기: "+arry.length);
		 
		 String[] arry2 = {"사과","바나나","딸기"};
		 // new String[]을 생략할 수 있다.
		 // String arry2[] = {} 도 가능
		 
		 /*
		  2. index가 같은 배열의 경우 연관관계로 반복문을 통해 출력할 수 있다.
		  */
		 System.out.println("No\t과일이름\t과일가격\t과일갯수");
		 int[] bCnts = {3,5,2};
		 for(int idx=0;idx<arry.length;idx++) {
			 System.out.print(idx+1+")\t");
			 System.out.print(arry2[idx]+"\t");
			 System.out.print(arry[idx]+"\t");
			 System.out.print(bCnts[idx]+"\n");
		 }
		 
		 // ex2) 한국시리즈 팀순위 검색하여 구단과 승률을 배열로 선언할당하고,
		 // 반복문을 통하여 리스트 처리하세요.
		 
		 System.out.println("순위\t구단\t\t승률");
		 String[] bName = {"KIA 타이거즈","키움 히어로즈","SSG 랜더스"};
		 double[] bWinrate = {0.694,0.608,0.560};
		 
		 for(int idx=0;idx<bName.length;idx++) {
			 System.out.print(idx+1+"순위\t");
			 System.out.print(bName[idx]+"\t");
			 System.out.print(bWinrate[idx]+"\n");
		 }
		 
	}

}
