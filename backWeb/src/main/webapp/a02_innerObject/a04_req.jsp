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
String pname = request.getParameter("pname");
String priceS = request.getParameter("price");
String countS = request.getParameter("count");

int price = 0;
int count = 0;
if(priceS!=null){
	price = Integer.parseInt(priceS);
}
if(countS!=null){
	count = Integer.parseInt(countS);
}
int tot = price * count;
%>

<h2>구매물품: <%=pname%></h2>
<h2>구매가격: <%=price%></h2>
<h2>구매갯수: <%=count%></h2>
<h2>총액: <%=tot%></h2>
</body>
</html>