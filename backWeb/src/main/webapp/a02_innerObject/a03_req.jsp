<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	String name = request.getParameter("name");
	String korS = request.getParameter("kor");
	int kor = 0;
	if(korS!=null){
		kor = Integer.parseInt(korS);
	}
	%>
	
	<h2>이름:<%=name %></h2>
	<h2>국어(+10):<%=kor+10 %></h2>
</body>
</html>