package javaexp.z01_home;

public class A16_0426 {
   
   static void callNum() throws ArithmeticException {
      System.out.println("산수 예외");
      System.out.println(1/0);
   }
   
   public static void main(String[] args) throws ArrayIndexOutOfBoundsException {
      // 1. 예외처리에 대한 이론과 실습(조원들과 아래 내용에 대한 이야기를 수업 내용을 보면서 나누세요)
//         1) 예외 처리를 왜 하는지 알고 있나요?
         /* 에러가 발생하는 경우가 즉시 프로그램이 멈추기 때문에 이를 방지하기 위해
          예외처리를 하여 에러를 제어하기 위해 예외 처리를 합니다.*/
//         2) 예외 처리를 하는 기본 단계별 구조를 설명할 수 있고, 코드할 수 있는지?
      /* 3,4번 문제를 풀면서 구조와 코드를 이해하고 숙달했습니다. 하지만 아직 부족한 것 같고 
          좀 더 연습을 해야 할 것 같습니다.*/
//         3) args값이 입력하지 않을 때, 처리되는 메서드를 선언하고, 예외를 위임하세요.
      
         try {
            String fruitName = args[0];
            int fruitPrice = Integer.parseInt(args[1]);
            
         }catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("# 예외 발생 #");
            System.out.println("과일명과 가격을 입력해주세요");
         }
//         4) 아이디 입력시 8자미만 이거나 16자이상시 사용자 정의 예외를 발생하게 처리하세요
         String id = "himan";
            System.out.println("프로그램 시작");
            try {
               if(id.length()<8||id.length()>=16) {
                  throw new Exception04("ID길이가 8자 미만이거나 16자 이상입니다.");
               }
            }catch(Exception04 e) {
               System.out.println("# 예외 발생 #");
               System.out.println(e.getMessage());
            }
            System.out.println("프로그램 종료");
         

      
   // 2. css 문자열 관련 속성을 예제와 함께 기술하세요
   /*
       <!DOCTYPE html>
      <html lang="en">
      <head>
          <meta charset="UTF-8">
          <meta http-equiv="X-UA-Compatible" content="IE=edge">
          <meta name="viewport" content="width=device-width, initial-scale=1.0">
          <title>Document</title>
          <style>
      
          </style>
      </head>
      <body>
          <h2>css 문자열 속성</h2>
          <p style="font-family: 궁서체;">폰트 종류</p>
          <p style="font-weight: 100px;">폰트 굵기</p>
          <p style="font-size: 20pt">폰트 크기</p>
          <p style="font-style: italic;">폰트 모양</p>
          <p style="font: italic bold 100px Arial">폰트 종합 속성</p>
      </body>
      </html>
    */      
   // 3. css box 모델의 단계별 속성을 설명하세요
   /*
    1. 가장 내부에 있는 것을 컨텐츠라고 하며 주로 문자나 이미지 등이 들어간다.
    2. 패딩(padding)은 컨텐츠와 border 사이의 간격을 나타낸다.
    3. border는 padding의 외곽선을 의미하며 직선,점선 혹은 이미지로 테두리를 그리는 선을 말한다.
    4. margin는 박스의 가장 바깥에 있는 영역으로 border와 외부 요소 사이의 간격을 나타낸다.
    */         
   // 4. css border의 위치관련 속성, 굵기, 종류관련 개별적 속성과 전체 설정 처리를 기술하세요
   /*
       border 위치 속성
          border-top / border-bottom / border-left / border-right가 있다. 
       
       border의 위치에 따른 굵기는 border-위치-width: 숫자px를 입력해서 굵기를 지정한다. 
            
        border의 유형에 따른 옵션은 dotted, solid, double, dashed 등 있으며 형식은
            border-style : dotted, solid, double, dashed 방식으로 지정한다.
            
         border: 20px double red; 와 같이 border에 여러 속성을 넣어 한 번에 처리할 수 있다.    
     
    */         
   // 5. css box 모델의 모서리 둥글기 속성을 이용하여, 버튼1, 버튼2를 span으로 만들어 보세요.
   /*
    <!DOCTYPE html>
   <html lang="en">
   <head>
       <meta charset="UTF-8">
       <meta http-equiv="X-UA-Compatible" content="IE=edge">
       <meta name="viewport" content="width=device-width, initial-scale=1.0">
       <title>Document</title>
       <style>
           input[type=text] {
               border-radius: 30px 30px;
           }
       </style>
   </head>
   <body>
       <span><input type="button" name="button1" value="버튼1"></span>
       <span><input type="button" name="button2" value="버튼2"></span>
   </body>
   </html>
    
    */         
   // 6. 예외 위임을 코드를 기본 예제와 함께 설명하세요.
   try {
      callNum();
   }catch(ArithmeticException e) {
      System.out.println("# 예외 처리 #");
      System.out.println("예외 내용: "+e.getMessage());
   }
     
             
   // 7. 1~10까지 출력할 때, 짝수인 경우에 사용자 정의 예외가 처리되게 하세요.
      /*
       # 예외 처리 반복문
       1. 반복문 안에서 처리
       		for()
       			try{
       				if()
       			}catch() {}
       		해당 조건이 나왔을 때, 예외 catch블럭이 수행되고, 다시 다음 반복 step을 수행 처리한다.	
       
       2. 반복문 포함 밖에 처리
       		try{
       			for()
       		}
       	  해당 조건이 나오면 반복문 수행도 중지되고 예외 처리가 된다.
       */
   
   
   	  System.out.println("# 예외 처리 시작 #");
   	for(int cnt=1;cnt<=10;cnt++) {
   	  try {
            
            if(cnt%2==0) {
               throw new NumEven();
            }
            System.out.println(cnt+"번");
         }
   	  	// 반복문 처리할 때 처리할 구문...
      catch(NumEven e) {
         System.out.println(e.getMessage());
      }
   }
      System.out.println("# 예외 처리 종료 #");
   }

}
class Exception04 extends Exception{
   Exception04(String err){
      super("사용자정의에러: "+err);
   }
}

class NumEven extends Exception {
   NumEven() {
      super("사용자 정의 예외: ");
   }

   @Override
   public String getMessage() {
      String err = super.getMessage();
      return err+"예외 처리[짝수]";
   }
   
}