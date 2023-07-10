<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="backWeb.a01_dao.A04_PreparedDao"
    import="backWeb.z01_vo.Jobs"
    import="java.util.*"
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script>
	function call(obj){
		alert("선택한 직책 코드:"+obj.value)
	}
</script>
</head>
<body>
<%
A04_PreparedDao dao = new A04_PreparedDao();
List<Jobs> jlist = dao.getJobs();
%>
<%--
[1단계:실습] 1. 직책정보를 jsp에서 Combo 박스로 출력하세요(- jobs 테이블 참고, DAO,JSP처리)
	0. 화면 구현
		select는 처리 형태 확인 value/화면출력 동일 여부
	1. sql 작성
	2. VO작성/String
	3. Dao 작성 / 메서드 추가
	4. jsp import(DAO/VO)
	5. for-each문을 통해서 출력 처리 확인
[1단계:실습] 2. 웹화면에서 main.jsp을 두고, 상단페이지(top.jsp), 하단페이지(bottom.jsp)
             를 include지시자로 두어 처리하되, java, js, css 코드를 top.jsp에 선언하여
             main.jsp, bottom.jsp에서 호출하는 것을 처리해보세요.
[1단계:실습] 3. 쿼리스트링으로 회원정보(아이디,패스워드,이름,권한,포인트)를 전송하고 이것을 출력하세요
[1단계:실습] 4. 쿼리스트링으로 선수의정보(이름, 타석,안타)를 통해서 타석과 안타를 형변환하여 이름,타율을 출력하세요 --%>

직책정보: <select name="jobs" onchange="call(this)">
			<option value='0'>선택하세요!</option>
			<%for(Jobs j : jlist) {
				out.print("<option>"+j.getJob_title()+"</option>");
			}
			%>
	   </select>
	   
<%
String id = request.getParameter("id");
String pass = request.getParameter("pass");
String name = request.getParameter("name");
String auth = request.getParameter("auth");
String point = request.getParameter("point");


%>
<h1>회원 정보</h1>

<h2>아이디: <%=id%></h2>
<h2>패스워드: <%=pass%></h2>
<h2>이름: <%=name%></h2>
<h2>권한: <%=auth%></h2>
<h2>포인트: <%=point%></h2>
	   
<h1>야구 선수 정보</h1>	   
<%
String bName = request.getParameter("bname");
String pHitS = request.getParameter("pHit");
String hitS = request.getParameter("hit");

double pHit = 0;
double hit = 0;

if(pHitS!=null) pHit = Integer.parseInt(pHitS);
if(hitS!=null) hit = Integer.parseInt(hitS);

double hitP = hit / pHit;
%>	   

<h2>이름: <%=bName%></h2>	   
<h2>타율: <%=hitP%></h2>	   
</body>
</html>