<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>    
<fmt:requestEncoding value="utf-8"/>
<c:set var="path" 
	value="${pageContext.request.contextPath}"/>
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
    		$("#pBtn").click(function(){
    			// $("#frm").serialize() :
    			// form 하위에 name/value 기준으로 자동으로 query string을 생성해준다.
    			var priceVal = $("#price").val()
    			$.ajax({
    				url:"${path}/prodCalcu.do",
    				data:$("#frm").serialize(),
    				type:"post",
    				dataType:"text",
    				success:function(data){
    					alert(data)
    				},
    				error:function(err){
    					console.log(err)
    				}
    			})
    		})
    	});
    </script>      
</head>
<body>
    <div class="container mt-3">
    	<h2>서버를 호출</h2>
	  	<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
	  		<div class="container-fluid">    	
	    	<form id="frm" method="post"  class="d-flex align-items-center" >
	            <input type="text" class="form-control me-2" 
	      	     id="price" placeholder="가격 입력" name="price"  aria-label="Search">  	     
	            <input type="text" class="form-control me-2" 
	      	     id="cnt" placeholder="갯수 입력" name="cnt"  aria-label="Search">  	      	     
	         	<button type="button" id="pBtn" class="btn btn-primary" style="width:200px;">조회</button>
	     	</form>
	 	    </div>
	 	</nav>  	
    </div>
</body>
</html>