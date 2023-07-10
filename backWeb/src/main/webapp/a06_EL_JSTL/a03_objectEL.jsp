<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="backWeb.z01_vo.Person"
    import="backWeb.z01_vo.Member"
    import="backWeb.z01_vo.JobHistory"
    %>
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
	<%
	session.setAttribute("p01",new Person("홍길동",25,"서울"));
	session.setAttribute("mem",new Member("himan","7777","홍길동","관리자",3000));
	
	session.setAttribute("jh01",new JobHistory(221,"2023-09-08","2025-12-24","IT_PROG",60));
	%>
    <div class="container mt-3">
    	<h2>el 활용</h2>
    	<h2>이름:${p01.name}</h2>
    	<%-- p01.getXXX() 
    		주의 getXXX로 호출되는 property이다
    	--%>
    	<h2>나이:${p01.age}</h2>
    	<h2>사는곳:${p01.loc}</h2>
    	<h2>회원정보</h2>
		<table class="table table-striped table-hover">
			<thead class="table-success">
		      	<tr  class="text-center">
				    <th>아이디</th>
				    <th>패스워드</th>
				    <th>이름</th>
				    <th>권한</th>
				    <th>포인트</th>
		      	</tr>
		    </thead>
		    <tbody>
			   	<tr  class="text-center">
			        <td>${mem.id}</td>
			        <td>${mem.pass}</td>
			        <td>${mem.name}</td>
			        <td>${mem.auth}</td>
			        <td>${mem.point}</td>
			   	</tr>
		 	</tbody>
		</table>
		<a href='a03_session.jsp'>세션 확인하러 가기</a>      	
		<table class="table table-striped table-hover">
			<thead class="table-success">
		      	<tr  class="text-center">
				    <th>직원ID</th>
				    <th>채용일</th>
				    <th>퇴사일</th>
				    <th>직책ID</th>
				    <th>부서ID</th>
		      	</tr>
		    </thead>
		    <tbody>
			   	<tr  class="text-center">
			        <td>${jh01.employee_id}</td>
			        <td>${jh01.start_dateS}</td>
			        <td>${jh01.end_dateS}</td>
			        <td>${jh01.job_id}</td>
			        <td>${jh01.department_id}</td>
			   	</tr>
		 	</tbody>
		</table>      	
    </div>
</body>
</html>