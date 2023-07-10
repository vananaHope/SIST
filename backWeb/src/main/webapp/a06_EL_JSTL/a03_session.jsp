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
    <div class="container mt-3">
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