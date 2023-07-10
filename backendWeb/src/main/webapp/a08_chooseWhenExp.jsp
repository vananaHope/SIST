<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>    
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
    <title>Insert title here</title>
   
    <script src = "https://code.jquery.com/jquery-3.7.0.js" type="text/javascript"></script>
    
    <script type="text/javascript">
    	// window.onload와 동일한 메서드
    	$(document).ready( function(){
    		
    		$("h2").text("숫자 맞추기 게임")
    	});
    </script>      
    
    
</head>
<%
int ranNum = (int)(Math.random()*100);

request.setAttribute("random",ranNum);
%>
<c:set var="ranNum" value="${random}" scope="request"/>
<body>
    <div class="container mt-3">
    	<h2></h2>
    	<form action="" method="post">
         	<div class="mb-3 mt-3">
            <label for="num">숫자:</label>
            <input type="number" class="form-control" 
      	     id="num" placeholder="숫자 입력" name="num">
         	</div>
         	<button type="submit" class="btn btn-primary">정답 확인</button>
     	</form>
		<table class="table table-striped table-hover">
			<thead class="table-success">
		      	<tr  class="text-center">
				    <th>임의의 숫자</th>
				    <th>입력한 숫자</th>
				    <th>확인 여부</th>
		      	</tr>
		    </thead>
		    <c:if test="${not empty param.num}">
		    <tbody>
			   	<tr  class="text-center">
			        <td>${ranNum}</td>
			        <td>${param.num}</td>
			        <td>
			        	<c:choose>
			        		<c:when test= "${empty param.num}">==값을 입력하세요==</c:when>
			        		<c:when test="${param.num > ranNum}">보다 크다</c:when>
			        		<c:when test="${param.num < ranNum}">보다 작다</c:when>
			        		<c:when test="${param.num == ranNum}">정답</c:when>
			        	</c:choose>
			        
			        </td>
			   	</tr>
		 	</tbody>
		 	</c:if>
		</table>      	
    </div>
</body>
</html>