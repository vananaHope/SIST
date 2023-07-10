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
ex) 국어 영어 수학 점수를 받아서 총점과 평균 처리
?kor=90&eng=80&math=65
 --%>
 <%
 String korS = request.getParameter("kor");
 int kor = 0;
 if(korS!=null) kor= Integer.parseInt(korS);
 String engS = request.getParameter("eng");
 int eng = 0;
 if(engS!=null) eng = Integer.parseInt(engS);
 String mathS = request.getParameter("math");
 int math = 0;
 if(mathS!=null) math = Integer.parseInt(mathS);
 
 int tot = kor + eng + math;
 int avg = tot / 3;
 
 %>
 
<h2>숫자형 데이터 요청값 처리</h2>
<table border width="30%">
	<tr><th>국어</th><td><%=kor%></td></tr>
	<tr><th>영어</th><td><%=eng%></td></tr>
	<tr><th>수학</th><td><%=math%></td></tr>
	<tr><th>총점</th><td><%=tot%></td></tr>
	<tr><th>평균</th><td><%=avg%></td></tr>
</table>

</body>
</html>