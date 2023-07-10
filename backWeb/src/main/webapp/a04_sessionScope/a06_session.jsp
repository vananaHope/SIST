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
		    <tbody>
			   	<tr class="text-center">
			        <td><%=pageContext.getAttribute("fruit01") %></td>
			    </tr>
			    <tr class="text-center">    
			        <td onclick="location.href='a07_request.jsp'"><%=request.getAttribute("fruit02")%></td>
			    </tr>
			    <tr class="text-center">    
			        <td onclick="location.href='a06_session.jsp'"><%=session.getAttribute("fruit03") %></td>
			    </tr>
			    <tr class="text-center">    
			        <td><%=application.getAttribute("fruit04") %></td>
			   	</tr>
		 	</tbody>
		</table>      	
    </div>
</body>
</html>