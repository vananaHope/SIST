<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
    <title>Insert title here</title>
</head>
<body>
<%--
1. 액션태그의 종류와 차이점, 제2정규화, 계층적 sql에 대한 이해와 의문사항을 조원들과 확인하세요.
	1) include : 다른 jsp의 실행 결과를 현재 위치에 삽입
	2) forward : 다른 jsp 페이지로 현재 페이지의 실행 결과를 전송
	# 차이점 
		- include는 다른 jsp 페이지 결과를 현재 페이지로 불러오는 것이고
		  forward는 현재 jsp 페이지의 결과를 다른 jsp 페이지로 넘겨서 실행시키는 것이다.	
	
	3) useBean    

	4) 제2정규화 : 테이블의 메인 주제와 상관없는 컬럼을 다른 테이블로 빼서 만드는 것을 제2정규화라고 한다.
			
	5) 계층적 sql : 하나의 테이블에서 계층적으로 컬럼을 구성하는 것을 말한다.
		ex) 게시글 답글 달기 / emp 테이블의 empno, mgr 관계 / 공과대학 - 정보미디어학부 / 메카트로닉스학부 
															- 컴퓨터공학과 / 멀티미디어학과 / 전자공학과 / 기계공학과

2. include로 all.jsp 하위에 top.jsp, main.jsp, bottom.jsp를 만들어서 포함 시켜 출력하되
   request.getParameter(), request.setAttribute()데이터 설정으로 main.jsp에서 로그인 id pass를 만들어서
   all.jsp를 호출하게 할때, himan//7777이면  top.jsp에서는 id를 보내어 @@ 로그인 중 그외는 login하세요 라고
   표시되게 처리
3. forward 액션을 이용하여, 로딩된 구구단의 임의의 문제가 맞으면 정답페이지로 이동 그렇지 않으면 다시 문제풀이 페이지로 처리되게 하세요.
 --%>
<%

String id = request.getParameter("id");
String pass = request.getParameter("pass");
String sndMsg = "로그인하세요";
if(id != null) {
	if(id.equals("himan")&&pass.equals("7777")) {
		sndMsg = id + "님 로그인 중";
	}else {
%>
	<script>alert("로그인 실패")</script>
<% 		
	}
}
%> 
 	<jsp:include page="top1.jsp">
 		<jsp:param name = "msg" value = "<%=sndMsg%>"/>
 	</jsp:include>	 
 	<jsp:include page="main1.jsp"/> 
 	<jsp:include page="bottom1.jsp"/> 
    
</body>
</html>