package javaexp.a05_process;

public class A13_break_continue {

	public static void main(String[] args) {
		
		/*
		 # 반복문에서 break와 continue
		 1. 반복문은 조건문과 함께 해당 반복문의 중단을 처리한다.
		 2. 반복 수행을 중단 처리할 때, 2가지 형식이 있는데
		 	1) 반복 자체를 완전히 중단 시켜주는 break문
		 	2) 해당 반복step의 나머지 라인을 중단하고
		 		다음 step으로 진행하는 것으로 나눌 수 있다.
		 
		 2단     3      4     5     6...    9
		 2*1=2
		 2*2=4
		 2*3=6
		 */
		 
		for(int cnt=1;cnt<=9;cnt++) {
			if(cnt==8) {
				//*8일 떄는 반복문 중단 처리
				break;
			}
			if(cnt==5) {
				// *5일 때, 수행하지 않고 다음 *6으로 진행한다.
				// *5일 때는 이후 내용이 수행되지 않는다.
				continue;
			}
			//열단위가 먼저 수행되고나서 행단위가 처리됨
			// for 밖의 것이 먼저 된 후 for 안 쪽에 있는 것이 처리됨
			for(int grade=2;grade<=9;grade++) {
				System.out.print(grade);
				System.out.print(" × ");
				System.out.print(cnt);
				System.out.print(" = ");
				System.out.print(grade*cnt+"\t");
			}
			System.out.println();
		}
		
		// ex) 카운트 업으로 1~10까지 출력하되 3의 배수는 continue처리하세요
		for(int cnt=1;cnt<=10;cnt++) {
			if(cnt%3==0) {
				continue;
			}
			System.out.println(cnt);
		}

	}
	
}
