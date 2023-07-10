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
	<div class="container mt-3">
		<form action="" method="post">
			<div class="mb-3 mt-3">
				<label for="name">이름:</label> <input type="text"
					class="form-control" id="name" placeholder="이름 입력" name="name">
			</div>
			<div class="mb-3 mt-3">
				<label for="kor">국어:</label> <input type="text" class="form-control"
					id="kor" placeholder="국어 입력" name="kor">
			</div>
			<div class="mb-3 mt-3">
				<label for="eng">영어:</label> <input type="text" class="form-control"
					id="eng" placeholder="영어 입력" name="eng">
			</div>
			<div class="mb-3 mt-3">
				<label for="math">수학:</label> <input type="text"
					class="form-control" id="math" placeholder="수학 입력" name="math">
			</div>
			<button type="submit" class="btn btn-primary">등록</button>
		</form>
	</div>
	<%
	// ctrl shift f : 소스 정리
	String name = request.getParameter("name");
	if (name == null)
		name = "";
	String kor = request.getParameter("kor");
	if (kor == null)
		kor = "";
	String eng = request.getParameter("eng");
	if (eng == null)
		eng = "";
	String math = request.getParameter("math");
	if (math == null)
		math = "";
	%>
	<jsp:include page="a05_sub.jsp">
		<jsp:param name="name" value="<%=name%>" />
		<jsp:param name="kor" value="<%=kor%>" />
		<jsp:param name="eng" value="<%=eng%>" />
		<jsp:param name="math" value="<%=math%>" />
	</jsp:include>
</body>
</html>