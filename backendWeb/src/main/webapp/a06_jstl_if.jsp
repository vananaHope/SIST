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
    		
    		$("h2").text("jquery 로딩 성공")
    	});
    </script>      
    
    
</head>
<body>
    <div class="container mt-3">
    	<h2>사원정보 등록</h2>
    	<form action="" method="post">
         	<div class="mb-3 mt-3">
            <label for="price">물건가격:</label>
            <input type="number" class="form-control" 
      	     id="price" placeholder="물건가격 입력" name="price">
         	</div>
         	<div class="mb-3 mt-3">
            <label for="count">갯수:</label>
            <input type="number" class="form-control" 
      	     id="count" placeholder="갯수 입력" name="count">
         	</div>
         	<button type="submit" class="btn btn-primary">등록</button>
     	</form>
		<table class="table table-striped table-hover">
			<thead class="table-success">
		      	<tr  class="text-center">
				    <th>할인여부</th>
				    <th>물건 총 가격</th>				    
		      	</tr>
		    </thead>
		    <c:set var="tot" value="${param.price*param.count}"/>
		    <c:set var="saleMsg" value="할인 대상자가 아닙니다."/>
		    <c:if test="${tot >=100000}">
		    	<c:set var="saleMsg" value="할인 대상자입니다."/> 
		    </c:if>
		    <c:if test="${not empty param.price and 
		    	not empty param.cnt}">
		    <tbody>
			   	<tr  class="text-center">
			        <td>${saleMsg}</td>
			        <td>${tot}</td>
			   	</tr>
		 	</tbody>
		 	</c:if>
		</table>      	
    </div>
</body>
</html>