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
# scriptlet
1. jsp에서 가장 많이 활용되는 java코드 및 로직이 처리되는 부분이다.
2. 여러가지 화면 구성과 함께 많이 활용된다. 
	(메서드 블럭 안에서 처리되는 부분으로 java로 비유하면 main()에서 처리되는
	실제 화면을 구현하는 부분이다.)
	
	1) 변수도 선언
	2) 변수 할당 및 활용
	3) 여러가지 화면과 함께 로직 처리

 --%>
 <%
 String name = "홍길동";
 String[] arry = {"사과","바나나","딸기"};
 %>
 <% 
 for(String fruit : arry) {
 %>
 <%-- 출력 영역 --%>	
 	<h2>과일:<%=fruit %></h2>
 <%}%>
 <%--
 # scriptlet 연습(단계별)
 
 1. 반복문
 	1) 증감 연산자에 의한 화면 구성 처리
 	2) 지역 변수 / 전역 변수 활용 
 2. 조건문
 3. 반복문과 조건문 혼합
 4. 배열 데이터 처리
 5. 객체 사용
 6. 객체형배열 처리
 7. dao와 연동된 화면 처리
  --%>
  
  <h2>카운트 업</h2>
  <%-- ex) 1~10까지 h3로 카운트 업--%>
  <%for(int cnt=1; cnt<=10; cnt++) { %>
  	<h3><%=cnt%></h3>
  <%}%>
  
  <%-- ex) 테이블의 1x10로 카운트 다운 --%>
  
  	<table width="50%" border>
  		<tr>
  		<%for(int count=10; count>=1; count--) {%>
  			<td><%=count%></td>
  		<%}%>
  		</tr>
  	</table> 
  	<%--
  	# jsp의 조건문 처리
  	1. java단의 코드에서 화면을 분리시키거나 로직을 분리시킬 때	 활용된다.
  	2. 여러가지 유형
  		1) 화면 분리
  			권한에 따른 메뉴 항목이 다르게 처리할 때
  		
  		2) 로직에 의한 처리
  			point에 의해서 고객등급을 다르게 변수로 설정할 때
  	
  	<% %>
  		
  	 --%>
  	
  	<%
  	// java 코드
  	String auth = "admin";
  	if(auth.equals("admin")) {
  	%>
  		<span>관리자메뉴</span>
  		<span>회원메뉴</span>
  		<span>배송관련처리메뉴</span>
  	<%
  	}else {
  	%>
  		<span>물품종류1</span>
  		<span>물품종류2</span>
  		<span>장바구니메뉴</span>
  	<%}%>
  	<%
  	// 반복문 안에서 여러가지 로직에 의해 처리될 수 있다.
  	int point = (int)(Math.random()*1000+1);
  	String grade = "";
  	if(point>=800) {
  		grade="VVIP";
  	}else if(point>=500) {
  		grade="VIP";
  	}else {
  		grade="일반관계"; 	}
  	%>
  	<h2>
  	포인트:<%=point %>, 고객등급:<%=grade %>
	</h2>
	
	<%-- ex1) 임의의 수를 1~10까지 발생해서 짝수일 때와 홀수 일 때를 나누어,
	오늘은 운이 좋은 날입니다./ 오늘은 운이 좋지 않은 날입니다. 활동을 삼가세요를 출력하세요 --%>
	
	
	<%
	int ranNum = (int)(Math.random()*10+1);
	String luck = "";
	
	if(ranNum%2==0) {
		luck = "오늘은 운이 좋은 날입니다.";
	}else {
		luck = "오늘은 운이 안 좋습니다. 활동을 삼가세요";
	}
	
	%>
	<h2>
	<%=luck%>
	</h2>
	
	<%--ex2) 나이는 1~90 임의로 나오게 하여
	13이하 : 어린이 사이트
	~ 18 : 청소년 사이트
	~ 65 : 일반 사이트
	65 초과 : 노인을 위한 사이트
	처리하세요 --%>
	
	<%
	int age = (int)(Math.random()*90+1);
	if(age<=13) {
	%>
		<span>어린이 사이트</span>
	<%} else if(age<18) {%>
		<span>청소년 사이트</span>
	<%} else if(age<65) {%>
		<span>일반 사이트</span>
	<%} else { %>
		<span>노인 전용 사이트</span>
	<%} %>
		<div>나이: <%=age%></div>
</body>
</html>