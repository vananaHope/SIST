package javaexp.z01_home;

public class A09_0413 {

   public static void main(String[] args) {
      
      //1. 링크시 상대위치 지정과 절대위치 지정 차이점을 기술
      /*
       상대위치 지정의 경우 
       현재 폴더에 특정 파일이 있을 때 이동하여 화면을 확인할 수 있고
       ../ : 상위경로
       ./ : 하위경로
       이용해서 상위 하위에 있는 특정 파일들을 화면에 불러올 수 있다.
       하지만 절대위치 지정의 경우
       특정 파일이 있는 물리적인 경로를 모두 입력하여 파일을 화면에 불러온다. 
       */
      
      //2. 링크시 현재 파일을 기준으로 상위폴드와 하위폴드 이동 처리를 예제를 통해서 설명하세요.
      /*
       상위 폴더 이동 처리
       <a href="../index2.html">상위 폴더 이동</a>
       하위 폴더 이동 처리
       <a href="./a04_sub/sub4.html">하위 폴더 이동</a>
       */
      
      //3. iframe의 속성을 예제를 통해서 설명하세요.
      /*
       iframe은 인라인 프레임의 약자로 html 특정 화면 영역을 지정해서 표현하는 경우에 사용되며 
       지원하지 않는 브라우저도 있고 요즘에는 잘 사용되고 있지 않다.
       
       1) 기본 형식
        <iframe src="" width="" height=""></iframe>
        (1) src : 포함되는 페이지의 속성값을 지정
        (2) srcdoc : html 태그를 직접 입력하여 화면에 출력할 때 사용
              srcdoc="<html><body><h2>안녕하세요</h2></body></html>"
        (3) name : 각 프레임에 대한 이름을 설정하고 javascript나 name="" target="프레임명"
              형식으로 출력할 때 사용된다.
              
        <iframe src="a10_frame1.html" width="300" height="300"></iframe>
        <iframe src="a10_frame2.html" width="300" height="300"></iframe>
        <iframe width="100%" height="300pt" 
        srcdoc="<html><body><h2>안녕하세요</h2></body></html>"></iframe>
              
        2) a href와 iframe
           a href="이동할페이지" target="프레임명"으로 처리하면 링크 클릭시 해당 페이지가 프레임 안에 표시된다.
           
           <h2>음식 메뉴 소개</h2>
           <a href="a08_01_subject.html" target="mainFrame">불고기</a>
           <a href="a08_01_subject.html" target="mainFrame">잡채</a>
           <a href="a08_01_subject.html" target="mainFrame">된장찌개</a>
           <iframe width="400pt" height="400pt" name="mainFrame"></iframe>
           
       */
      // 4. 좋아하는 맛집 홈페이지를 맛집의 종류에 따라 링크되게 처리해보세요.

      /*
      <h2>좋아하는 맛집 리스트</h2>
       <a href="https://map.naver.com/v5/search/%EB%B4%89%EB%90%9C%EC%9E%A5/place/36668874?placePath=%3Fentry=pll%26from=nx%26fromNxList=true&c=15,0,0,0,dh">봉된장</a>
       <a href="https://www.bonif.co.kr/">본죽</a>
       <a href="http://www.kyochon.com/main/">교촌치킨</a>
        
       */
      
      //5. target 속성값의 종류를 기술하세요
      
      /*
       child : 상위에서 바로 밑에 있는 하위 윈도우를 가르킬 때 쓰는 속성
       parent : 하위에서 바로 위에 있는 상위 윈도우를 가르킬 때 쓰는 속성
       top : 가장 상위에 있는 윈도우를 가르킬 때 쓰는 속성
       _blank : 새로운 브라우저 탭을 생성해서 로딩
       _self : 현재 있는 페이지를 대체해서 새로운 화면을 띄워줌
       _top : 계층 구조상 최상위에 있는 페이지를 변경 처리할 때 사용 
       프레임명/윈도우명 : 해당 페이지나 윈도우를 변경 처리할 떄 쓰는 속성
        
       */
      
      //6.  input select textarea의 차이점을 기술하세요.
      
      /*
       input은 type="속성값" 에 어떤 속성을 넣느냐에 따라 모양과 기능을 수행한다.
       text, password, button, file, submit 등 다양한 속성을 가지고 있다.
       
       select는 단일 또는 다중 선택을 서버에 전송하는 역할을 하며
       기본 형식은
       <select name="deptIT">
            <option value="1000">기획</option>
            <option value="1001">앱 개발</option>
            <option value="1002">웹 개발</option>
            <option value="1003">서버 개발</option>
      </select> 
      name에 있는 key와 option value에 있는 숫자가 합쳐져 key=value 형태로 서버에 전송된다.
      size와 multiple을 통해 다중 선택을 처리할 수도 있다.
      
      textarea는 다중행의 문자열 입력시 사용된다.
       */
      
      //7. 기본 input 객체를 활용하여 아래와 같이 출력(form과 name 속성포함)하세요.
       /*
      사람등록
      이름   [   ]
      나이   [   ]
      사는곳   [   ]
      [등록]
       */
      
      /*
      <form>
           <h2>사람등록</h2>
           이름:<input type="text" name="myname"><br>
           나이:<input type="text" name="age"><br>
           사는 곳:<input type="text" name="region"><br>
           <input type="submit" value="등록">
           
       </form> 
       form안에 submit type 버튼을 통해서 서버에 전송된다.
       */
      //8.  type으로 check와 radio의 차이점을 예제를 기술하세요
      
      /*
       1) radio - 여러 개중 하나만 선택
       <h2>내가 좋아하는 음식</h2>
          <input type="radio" name="food" value="불고기">불고기
          <input type="radio" name="food" value="잡채">잡채
          <input type="radio" name="food" value="한우">한우
          
        2) check - 중복 선택 가능
        <h2>내가 싫어하는 음식</h2>
            <input type="checkbox" name="hate" value="피망">피망
            <input type="checkbox" name="hate" value="파프리카">파프리카
            <input type="checkbox" name="hate" value="당근">당근
       */
      // 9. 출근시간대(6:00,7:00,8:00,9:00와 퇴근시간대(17:00,18:00,19:00,20:00)를 
      // 단일 선택할 수 있게 처리하세요
      
      /*
       <h2>출근시간대</h2>
       <input type="radio" name="morning" value="6">6:00
       <input type="radio" name="morning" value="7">7:00
       <input type="radio" name="morning" value="8">8:00
       <input type="radio" name="morning" value="9">9:00
       
       <h2>퇴근시간대</h2>
       <input type="radio" name="night" value="17">17:00
       <input type="radio" name="night" value="18">18:00
       <input type="radio" name="night" value="19">19:00
       <input type="radio" name="night" value="20">20:00
         
       */
      // 10.  form하위에 form요소객체가 서버에 데이터를 전송하는 규칙을 기술하세요.
      /*
       form의 요소 객체들은 select나 submit을 통해서 데이터를 전송할 수 있다.
       name에 있는 속성값(key)와 입력한 데이터(value)을 조합하여 key=value&key=value형식으로 데이터를 서버에 전송한다.
        
        
       */
      
      // 11. select form태그에서 option에서 value의 설정이유에 대하여 기술하세요.
      /*
       option에서 value를 설정하는 이유는 select name에 있는 값과 option value를 조합하여 
       서버에 전송하기 위한 것이 첫 번째 이유이고 두 번째는 화면에 보이는 label과 실제 전송되는 데이터를 
       다르게 설정하는 경우가 있기 때문이다.
        
       */
      
      //12. 주로 사용하는 지역과 우편번호를 검색해서 select로 지역을 선택했을 때, 
      //   서버에 우편번호가 전송되게 처리하세요
      /*
       <form>
       <h2>강서구 지역번호</h2>
       <select name="regionNum">
           <option value="07696">화곡동, 강서구새마을운동</option>
           <option value="07682">내발산동, 대한노인회강서구지회</option>
           <option value="07668">등촌동, 강서구의회회관</option>
       </select><br>
       <input type="submit">
       </form> 
      */
      
   }

}