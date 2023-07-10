<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%--
1. query string  vs	 request.getParameter("")
	1)페이지명?key=value
	2)String val = request.getParameter("key")
	
	1) 1개 매개변수
	2) 2개 매개변수
	3) 숫자형 매개변수 넘기기
	4) 배열형 매개변수 
	5) 객체형 매개변수
	
2. query string은 클라이언트에서 서버로 데이터를 전송해주기 위한 목적
		
 --%>
</head>
<body>
	<%--
	a01_step01.jsp?food=짜장면
	 --%>
	<h2>초기 요청 페이지</h2>
	<%=request.getParameter("food") %>
	
	<%
	String food = request.getParameter("food");
	String fruit = request.getParameter("fruit");
	%>
	<h3>받은 음식:<%=food%></h3>
	<%--a01_step01.jsp?fruit=수박--%>
	<h3>받은 과일:<%=fruit%></h3>
	
	<%--a01_step01.jsp?food=짜장면&fruit=수박 --%>
	
	<%-- 
	물건의 가격과 갯수를 받아서 출력되게하세요
	--%>
	
	<%
	// 안 넘어오면 0, 넘어오면 형변환 처리..(숫자형 안정성)
	String priceS = request.getParameter("price");
	int price = 0;
	if(priceS!=null) // null 프로세스 처리 안됨 
		price = Integer.parseInt(priceS);
	String countS = request.getParameter("count");	
	int count = 0;
	if(countS!=null) 
		count = Integer.parseInt(countS);
	
	int tot = price*count;
	%>
	가격:<%=price%>
	갯수:<%=count%>
	총계:<%=tot%>
</body>
</html>