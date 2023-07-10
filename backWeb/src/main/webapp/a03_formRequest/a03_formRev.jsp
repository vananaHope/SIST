<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%--
# url ==> form

 --%>

<h1>결과 출력</h1>
	<h2>물건명:<%=request.getParameter("pname")%></h2>
	<h2>가격:<%=request.getParameter("price")%></h2>
</body>
</html>