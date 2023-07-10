<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%!
String pname = "바나나";
int price = 3000;

String getProduct() {
	return pname+"("+price+")";
}
%>

<h3>변수 호출:<%=pname%></h3>
<h3>변수 호출:<%=price%></h3>
<h3>메서드 호출:<%=getProduct()%></h3>
</body>
</html>