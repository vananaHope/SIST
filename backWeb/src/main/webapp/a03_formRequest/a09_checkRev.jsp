<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- <h2>좋아하는 음식(선택완료)</h2> -->
<%
/* String[] foods = request.getParameterValues("food");
for(int idx=0; idx<foods.length; idx++) {
	if(foods!=null && !foods[idx].equals("")){
		out.print("<h3>"+(idx+1)+")"+foods[idx]+"</h3>");
	}
} */
// ex) 살았던 지역 check 
//서울 경기 인천 강원도 충청도 경상도 전라도 제주도
%>

<h2>살았던 지역(선택완료)</h2>
<%
String[] regions = request.getParameterValues("region");
for(String region : regions) {
	if(region!=null && !region.equals("")) {
		out.print("<h3>"+region+"</h3>");
	}
}
%>
</body>
</html>