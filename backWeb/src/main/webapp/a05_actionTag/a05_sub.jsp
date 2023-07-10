<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"
	rel="stylesheet">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
<title>Insert title here</title>
</head>
<body>
	<%
	// ctrl shift f : 소스 정리
	String name = request.getParameter("name");
	String kor = request.getParameter("kor");
	String eng = request.getParameter("eng");
	String math = request.getParameter("math");
	%>
	<div class="container mt-3">
		<h2>학생정보</h2>
		<table class="table table-striped table-hover">
			<thead class="table-success">
				<tr class="text-center">
					<th>이름</th>
					<th>국어</th>
					<th>영어</th>
					<th>수학</th>
				</tr>
			</thead>
			<tbody>
				<tr class="text-center">
					<td><%=name%></td>
					<td><%=kor%></td>
					<td><%=eng%></td>
					<td><%=math%></td>
				</tr>
			</tbody>
		</table>
	</div>
</body>
</html>