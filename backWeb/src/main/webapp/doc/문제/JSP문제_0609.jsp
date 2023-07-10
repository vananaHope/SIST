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
확인예제
1. web server와 web application server의 차이점을 기술하세요.
web server는 html,css와 같은 정적인 컨텐츠를 제공하는 서버이고
web application server는 db나 로직과 같이 동적인 컨텐츠를 제공하는 서버입니다.
2. was안에서 jsp 프로그램의 처리 과정으로 client단부터 sever단까지 구분하여 설명하세요.
1) jsp ==> servlet jsp로 만들어진다.

3. servlet과 jsp의 차이점을 기술하세요.
기능의 차이는 없고 역할의 차이만 있다.
servlet은 java 안에 html 코드가 들어가고 jsp는 html 안에 자바 코드가 들어간다.
4. servlet에서 한글과 html 코드로 처리할 때, 사용되는 코드를 기술하세요.
	response.setCharacterEncoding = "utf-8"
	response.setContentType = "text/html; charset=utf-8"
5. servlet에서 반복문으로 7가지 무지개 색 h2를 만드세요
6. servlet에서 4X4테이블로 클릭시 @@번호 안녕하세요가 alert으로 로딩되게 하세요.
7. jsp의 script 3가지를 코드와 함께 기술하세요.
 1) 선언부
 <%! %>
 2) 스크립트릿
 <% %> ==> java의 main()에서 처리되는 부분으로 비유 가능하다.
 3) 표현부
 <%=변수/메서드%> 
 html과 혼합해서 주로 사용한다.
8. jsp에서 선언(declaration)을 통해서 가격과 갯수를 선언하고, 메서드를 통해 가격과 갯수를 받아서 합산을 처리하는 메서드를
   선언하고, 하단에서 호출하는 화면을 만드세요.
9. jsp의 sciptlet과 expression을 이용해서 랜덤 구구단을 테이블로 9X1로 출력해보세요
 --%>
 
 <%-- 8번 문제 --%>
 <%!
 int price = 3000;
 int count = 5;
 
 String getTotal() {
	 return "총계: "+price*count;
 }
 %>
 
 <h3>가격:<%=price %></h3>
 <h3>개수:<%=count %></h3>
 <h3>총계:<%=getTotal() %></h3>
 
 <%-- 9번 문제 --%>
 <%!
 %>
 <table>
 	<%for(int i=1; i<=9; i++) {
 		 int num1 = (int)(Math.random()*10+1);
 		 int num2 = (int)(Math.random()*10+1);
 	%>
 		<tr><td><%=num1%>×<%=num2%>=<%=num1*num2%></td></tr>	
 	<%}%>
 </table>
 
</body>
</html>