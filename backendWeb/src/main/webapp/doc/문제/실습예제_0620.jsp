<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
    <title>Insert title here</title>
<%--
실습과제
[1단계:개념] 1. java와 js의 연동 처리할 때, 흐름 순서에 따른 코드 처리 순서를 기본예제와 함께 설명하세요

[1단계:코드] 2. java로 임의의 구구단을 만들어 html의 form에 출력하고, [ @@] x [@@   ]  정답입력[  ][정답확인]
              정답입력이 맞을시, 정답 그렇지 않을시 오답이 처리되게 하세요. java+js 연동

[1단계:코드] 3. salgrade 테이블을 확인하여, 해당 항목에 맞는 속성으로 form 화면을 구성하고, 입력 후, 확인시, 요청값 처리후,
      Salgrade 객체에 등록이 되어 출력되게 처리하세요.
 --%>    
</head>
<body>
<%--
(1) 프론트단에서 요청값을 보내면 서버단에서 JSP 요청값에 따라 데이터를 처리(JAVA 처리)
==> JAVA+HTML 통해서 새 HTML(HTML+CSS+JS) 생성 ==> 프론트단에 넘겨줌 ==> 프론트단(브라우저)에서 랜더링 처리 

 --%>
<%-- <%
String name = "홍길동";
int age = 25;
String loc = "서울";
%>
<script>
var name = "<%=name%>"
var age = "<%=age%>"
var loc = "<%=loc%>"

alert("이름:"+name)
if(age>=18){
	alert('성년')
}else {
	alert('미성년')
}

</script> --%>
<%
int num01 = (int)(Math.random()*9+1);
int num02 = (int)(Math.random()*9+1);
int tot = num01*num02;
%>
<form>
	<span><%=num01 %></span>
	<span>×</span>
	<span><%=num02 %></span>
	<span>=</span>
	정답입력:<input type="text" id="answer">
	<button type="button" onclick="call()">정답 확인</button>
</form>
<script>
var num01 = "<%=num01%>"
var num02 = "<%=num02%>"
var tot = "<%=tot%>"
var obj = document.querySelector("#answer");

function call() {
	if(tot==obj.value){
		alert("정답입니다.")
	}else {
		alert("오답입니다.")
	}	
}

/*
# front vs back 연결 코드 
1. jsp로 html이 만들어진 결과로
2. 화면단에서 처리된다는 내용 기억하기
 */

</script>
</body>
</html>