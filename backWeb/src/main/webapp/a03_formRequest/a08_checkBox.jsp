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
# type의 checkbox는 checked된 것만 전송을 한다.

 --%>
<%
String[] foods = {"짜장면","짬뽕","탕수육","한정식","일식"};
String[] regions = {"서울","경기","인천","강원도","충청도","경상도","전라도","제주도"};
%>
<%-- <h2>좋아하는 음식 check</h2>
<form action="a09_checkRev.jsp">
	<%for(String food:foods) {%>
	<input type="checkbox" 
		name="food" value="<%=food%>"/><%=food%><br>
	<%}%>
	<input type="submit">
</form> --%>

<h2>살았던 지역 check</h2>
<form action="a09_checkRev.jsp"> 
	<% for(String region:regions) {%>
		<input type="checkbox" 
			name="region" value="<%=region%>"><%=region%><br>
	<%}%>
	사는 지역 선택
<select name="region" multiple>
	<%for(String region:regions) {%>
		<option><%=region+"[sel]"%></option>
	<%}%>
</select>
<input type="submit">
</form>
</body>
</html>