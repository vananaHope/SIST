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
</head>
<body>
<%--
실습과제
[1단계:개념] 1. session scope의 4가지 범위를 조원들과 함께 이해가 되었는지 확인하세요.
1) page

하나의 jsp를 처리할 때 사용되는 영역
객체 pageContext

2) request

하나의 http 요청을 처리할 때 사용하는 영역

3) session

하나의 웹 브라우저와 관련된 영역
서버와 브라우저간에 연결 상태가 있을 때까지 지속되는 범위를 말한다.
브라우저가 켜져있는 한 데이터가 계속 남아있는 것을 말한다.

session ==> key, value 값으로 저장이 되며 
단일 변수 뿐 아니라 객체, 배열 형식으로 저장이 된다.
저장할 때 object 형태로 저장되기 때문에
가져올 때는 type casting을 해서 가져와야 한다.

session.setAttribute
session.getAttribute

4) application

서버가 살아있는 한 데이터를 지속적으로 저장하는 것을 말한다.

[1단계:코드] 2. member테이블을 기준으로 id가 있는지 여부를 확인하는 DB 처리를 해보세요
         회원아이디:[   ][등록여부확인] ==> dao (boolean getMember(String id)) ==> 등록여부에 따라 alert() 출력
         
         
[1단계:코드] 3. session 범위로 num01을 할당하고, a01_sess.jsp <==> a02_sess.jsp 이동 시마다 증가하게 하세요.

 --%>

</body>
</html>