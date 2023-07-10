package javaexp.z01_home;

public class A10_0417 {

   public static void main(String[] args) {
      
      /*
       1:1관계 개념을 옆에 있는 조원과 함께 이해 했는지 확인하고 의견을 나누고 정리해보세요.
            1) 1:1관계 객체를 선언하고 만드는 상황을 어떤 상황인지?
               	클래스에서 다른 클래스를 맴버 변수로 선언하여 사용하고 싶을때 
            2) 1:1관계 객체 처리할 수 있는지?
               	1:1 관계 객체를 선언하고 만드는 상황은 다양하며, 
            	객체 지향 프로그래밍에서 자주 사용한다
            	다른 객체를 참조할수 있도록 하는 것이 1대1 객체이다
            3) 다른 객체 추가 메서드 this.객체 = 객체를 이해하고 있는지?
               	지역변수로 들어온 객체의 값을 this. 객체의 전역변수로 값으로 할당해서
              	사용한다
            4) if(참조==null) 코드는 언제 왜 사용하는지?
               해당 객체가 메모리에 할당되어 있는지를 확인해서
               nullpointerexception 방지목적도 있다.
                
            5) 위 내용을 이해 기반으로 커플매칭 사이트에서 Woman/Man 처리해보세요.
               
            
 
       */ 
      
      // 1:1 관계 객체 구현 순서를 예제를 통해 처리하세요
      
      // 시간 부족으로 풀지 못헀습니다.
      
      // 2. 객체형 배열의 처리 과정을 기본 예제와 함께 설명하세요.
      
      /*
       
       성별    이름       나이      
       남      홍길동   30
       여      김순자   33
       남      김길동   25
       
       */
      
      Exp_0417[] exp01 = new Exp_0417[3];
      
      exp01[0] = new Exp_0417("남","홍길동",30);
      exp01[1] = new Exp_0417("여","김순자",33);
      exp01[2] = new Exp_0417("남","김길동",25);
      
      System.out.println("성별\t이름\t나이");
      for(Exp_0417 exp:exp01) {
         System.out.print(exp.getGender()+"\t");
         System.out.print(exp.getName()+"\t");
         System.out.print(exp.getAge1()+"\n");
      }
      
      //3. 아래의 2차원 데이터를 객체형 배열로 선언하고 출력하세요.
       //  1) 구매물건리스트(물건명,가격,구매갯수)
       //  2) 회원정보리스트(회원아이디, 패스워드, 회원명, 포인트, 권한)
      
      //1)
      ProList[] pro1 = new ProList[3];
      
      pro1[0] = new ProList("딸기",5000,3);
      pro1[1] = new ProList("복숭아",3000,1);
      pro1[2] = new ProList("바나나",4000,4);
      
      System.out.println("물건명\t가격\t구매갯수");
      
      for(ProList pro:pro1) {
         System.out.print(pro.getProdName()+"\t");
         System.out.print(pro.getProdPrice()+"\t");
         System.out.print(pro.getCnt()+"\n");
      }
      
      //2)
      
      MemList[] mem01 = new MemList[3];
      
      mem01[0] = new MemList("himan","7777","홍길동",10000,"Platinum");
      mem01[1] = new MemList("hiwoman","7878","김영희",5000,"Gold");
      mem01[2] = new MemList("Lucky77","luck","철수",1000000,"VIP");
      
      System.out.println("회원아이디\t패스워드\t회원명\t포인트\t권한");
      
      for(MemList mem:mem01) {
         System.out.print(mem.getMemId()+"\t");
         System.out.print(mem.getPasswd()+"\t");
         System.out.print(mem.getMemName()+"\t");
         System.out.print(mem.getMemPoint()+"\t");
         System.out.print(mem.getMemGrade()+"\n");
      }
      
      //select 콤보박스의 속성을 각 속성값에 따른 기능적 차이와 함께 기술하세요.
      
      /*
       select의 기본 형식
          select 속성=속성값
       
       select 속성
          name : 선택된 값을 기준으로 name은 key값 , 선택된 값의 value가 합쳐져서
          key=value 형태로 서버에 전송된다.
          
          size : 한 번에 볼 수 있는 option 선택 항목의 갯수를 나타낸다.
          
          multiple : size와 달리 한 번에 여러개를 선택할 수 있고 배열 형태로 서버에 전송한다.
          
          selected : 맨처음 옵션에 선택되어진 항목을 출력한다.
       
       */
      
      
      //input의 속성에 따른 속성값을 차이를 기술하세요.
      
      /*
       
       name : 요청시 서버의 key 값으로 전송된다.
       
       type : text|password|radio|file 등 화면에서 입력 모양에 따라 여러 가지 속성 지정이 가능하다.
       
       size : 화면에 보이는 입력 크기를 설정하고 입력으로 처리되는 넓이를 지정한다.
       
       maxlength : size와는 다르게 실제 입력하는 크기를 나타내며 size가 입력하는 보이는 내용이라면 
          maxlength는 실제 입력할 수 있는 데이터 크기를 지정한다.
          
       placeholder : 해당 항목에 대한 설명을 표시할 때 사용하며 입력하려고 클릭하면 사라진다.
       
       value : 서버에 전송될 때 핵심 요소이며 입력한 데이터를 지정할 때 사용한다.
        
        
       */
      
      
      //아래 사이트의 회원가입화면을 form요소객체를 table 안에서 적절히 활용하여 처리하세요.(css적용 제외)
       //  https://www.storyum.kr/story/main/contents.do?menuNo=500018&siteId=5
       //  에 (기본정보입력 항목)에 맞게 처리하세요
      
      /*
       

    <h2>기본 정보</h2>
    <form>
        <table>
            <tr><th>이름</th>
            <td><input type="text" name="pname" size="10" maxlength="7"></td></tr>
            
            <tr><th>아이디</th>
            <td><input type="text" name="id" size="16" minlength="6" maxlength="16" placeholder="6~16자까지 영문자(소문자),숫자 사용 가능">
            <input type="submit" value="아이디중복확인"></td></tr>    
            
            <tr><th>비밀번호</th>
            <td><input type="text" name="password" size="16" minlength="6" maxlength="16" placeholder="6~16자까지 영문자(소문자),숫자 사용 가능"></td></tr>
                
            <tr><th>비밀번호 확인</th>
            <td><input type="text" name="password check" size="16" minlength="6" maxlength="16"></td></tr>  
            
            <tr><th>이메일</th>
            <td><input type="email" name="email" size="10" maxlength="20">@<input type="email" name="email" size="10" maxlength="20">
            <select name="email address" size="1">
                <option value="1000">naver.com</option>
                <option value="1001">daum.net</option>
                <option value="1002">gmail.com</option>
            </select></td></tr>

            <tr><th>연락처</th>
            <td><select name="phone number1" size="1">
                <option value="010">010</option>
                <option value="011">011</option>
                <option value="019">019</option>
            </select>-<input type="text" name="phone number2" size="4" maxlength="4">-<input type="text" name="phone number3" size="4" maxlength="4"></td></tr>

            <tr><th>우편번호</th>
            <td><input type="text" name="zip code"> <input type="submit" value="우편번호 검색"></td></tr>

            <tr><th>주소</th>
            <td><input type="text" size="60" maxlength="60" name="address"></td></tr>

            <tr><th>정보수신 여부</th>
            <td>서비스 및 이벤트 소식을<input type="checkbox" name="email ads">Email로 수신하겠습니다.<input type="checkbox" name="sms ads">SMS로 수신하겠습니다.</td></tr>
        </table>
    </form>

       
       */

   }

}