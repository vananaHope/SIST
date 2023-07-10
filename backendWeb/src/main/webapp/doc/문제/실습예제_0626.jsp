<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="backWeb.z01_vo.Person"
    %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
    <title>Insert title here</title>
</head>
<body>
<%--
# 조별 토론 및 실습과제
[1단계:개념확인] 1. 조별로 el 태그를 활용한 session scope범위와 실제 코드에 대하여 알고 있는지 확인
            ajax를 처리하기 위해 필요한 기본 형식과 기본 데이터와 json데이터 가져오는 처리형식을 아는지 확인
            
            1) session scope 범위 
            	브라우저 단위이며 모든 브라우저를 끄지 않는 이상 계속 데이터가 남아 있다.
            	session.setAttribute("age",25);
            	${age}
            
            2) ajax
            	var xhr = new XMLHttpRequest()
            	xhr.open("get/post","이동할 jsp","동기/비동기 여부 boolean")
            	xhr.send()
            	var data = xhr.responseText
            	==> 가져온 문자열을 json 객체로 변환
            	var obj = JSON.parse(data)
            	json 데이터 ==> {"속성":"값"}
            	
[1단계:코드] 2. el 태그를 이용하여 4가지 session scope의 범위를 기본 변수로 설정하여 호출해보자.

[1단계:코드] 3. el을 이용하여 클래스 Person을 객체로 session scope로 설정하고 호출해 보자.
[1단계:코드] 4. el을 이용하여 form으로 물품명과 가격과 갯수을 입력해서 해당 내용을 출력처리하자.
[1단계:코드] 5. ajax처리 순서를 기술하고, 서버에 선언된 데이터(하나데이터,배열데이터, json 데이터)를 동기적으로 가져오는 처리를 하여 화면에 할당하세요.

	1)순서
		XMLHttpRequest 객체 생성 ==> 옵션 설정 ==> 서버에 요청값 전송 ==> 서버에서 전송한 데이터 받음 ==> 화면에 출력
		
 --%>
 	<script>
 		function call1() {
 			var xhr = new XMLHttpRequest()
 			xhr.open("get","실습예제_0626_Exp (1).jsp",false)
 			xhr.send()
 			var data = xhr.responseText
 			var obj1 = document.querySelector("#first")
 			obj1.innerText = data
 		}
 		
 		function call2() {
 			var xhr = new XMLHttpRequest()
 			xhr.open("get","실습예제_0626_Exp (2).jsp",false)
 			xhr.send()
 			var data = xhr.responseText.split(",")
 			var obj2 = document.querySelectorAll("#second")
 			data.forEach(function(prd,idx){
 				obj2[idx].innerText = prd
 			})
 		}
 		
 		function call3(){
 			var xhr = new XMLHttpRequest()
 			xhr.open("get","실습예제_0626_Exp (3).jsp",false)
 			xhr.send()
 			var data = xhr.responseText
 			var jsonObj = JSON.parse(data)
 			var obj3 = document.querySelectorAll("#third")
 			
 			obj3[0].innerText = jsonObj.name
 			obj3[1].innerText = jsonObj.age
 			obj3[2].innerText = jsonObj.loc

 		}
 	</script>
	<%
	pageContext.setAttribute("name1","김길동");
	request.setAttribute("name2","홍길동");
	session.setAttribute("name3","마길동");
	application.setAttribute("name4","마길동");
	
	session.setAttribute("p1",new Person("마길동",29,"인천"));
	%> 
	
    <div class="container mt-3">
    	<h2 onclick="location.href='a02_el_session.jsp'">문제2번)범위 확인하기</h2> 	
 		<h2>문제 3번</h2>
 		<h3>${p1.name}</h3>
 		<h3>${p1.age}</h3>
 		<h3>${p1.loc}</h3>
 		<br>		
 		<h2>문제 4번</h2>
    	<form action="" method="post">
         	<div class="mb-3 mt-3">
            <label for="pname">물품명:</label>
            <input type="text" class="form-control" 
      	     id="pname" placeholder="물품명 입력" name="pname">
         	</div>
         	<div class="mb-3 mt-3">
            <label for="price">가격:</label>
            <input type="number" class="form-control" 
      	     id="price" placeholder="가격 입력" name="price">
         	</div>
         	<div class="mb-3 mt-3">
            <label for="count">갯수:</label>
            <input type="number" class="form-control" 
      	     id="count" placeholder="갯수 입력" name="count">
         	</div>
         	<button type="submit" class="btn btn-primary">등록</button>
     	</form>
		<table class="table table-striped table-hover">
			<thead class="table-success">
		      	<tr  class="text-center">
				    <th>물품명</th>
				    <th>가격</th>
				    <th>갯수</th>
		      	</tr>
		    </thead>
		    <tbody>
			   	<tr  class="text-center">
			        <td>${param.pname}</td>
			        <td>${param.price}</td>
			        <td>${param.count}</td>
			   	</tr>
		 	</tbody>
		</table>
		<h2>문제 5번</h2>
		<button type="button" onclick="call1()" class="btn btn-success">==하나의 데이터 가져오기==</button>
		<h3 id="first"></h3> 	
		<button type="button" onclick="call2()" class="btn btn-success">==배열 데이터 가져오기==</button>
		<h3 id="second"></h3>
		<h3 id="second"></h3>
		<h3 id="second"></h3>
		<button type="button" onclick="call3()" class="btn btn-success">==json데이터 가져오기==</button>
		<h3 id="third"></h3>
		<h3 id="third"></h3>
		<h3 id="third"></h3>
    </div>
</body>
</html>