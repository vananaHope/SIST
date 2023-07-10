<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@ include file="top.jsp" %>

<!--메인 페이지 내용 작성 -->

<script>
	var h2Ob = document.querySelector("h2")
	h2Ob.innerText += ", 가격:"+price;
</script>
<%@ include file="bottom.jsp" %>
</body>
</html>