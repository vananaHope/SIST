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
    		
    		$("input").keyup(function(){
    			$.ajax({
    				url:"${path}/price.do",
    				data:"price="+$("#price").val()+"&saleRate="+$("#saleRate").val(),
    				type:"post",
    				dataType:"text",
    				success:function(data){
    					alert('최종 가격은 '+data+'원입니다.')
    				},
    				error:function(err){
    					console.log(err)
    				}
    			})
    		})
    		
    		$("select").change(function(){
    			$.ajax({
    				url:"${path}/grade.do",
    				data:"grade="+$("#grade").val(),
    				type:"post",
    				dataType:"json",
    				success:function(grd){
    					var add = "<td>"+grd.grade+"</td>"
    					add += "<td>"+grd.losal+"</td>"
    					add += "<td>"+grd.hisal+"</td>"
    					$("#salInfo").html(add)
    				},
    				error:function(err){
    					console.log(err)
    				}
    			})
    		})
    		
    		$("#empno").keyup(function(){
    			if(event.keyCode==13){
    				$.ajax({
        				url:"${path}/emp.do",
        				data:"empno="+$("#empno").val(),
        				type:"post",
        				dataType:"json",
        				success:function(emp){
        					if(emp == null) {
        						alert("해당 사원 없음")
        					} else if(emp!=null) {
        						var add = "<td>"+emp.empno+"</td>"
            					add += "<td>"+emp.ename+"</td>"
            					add += "<td>"+emp.job+"</td>"
            					add += "<td>"+emp.sal+"</td>"
            					$("#empInfo").html(add)
        					}			
        				},
        				error:function(err){
        					console.log(err)
        				}
        			})
    			}	
    		})
    	});
    </script>      
<%--
1. jquery ajax의 속성
	$.ajax({
		url: 보낼 서버 주소
		data: 요청 query string
		type: get/post
		dataType: 서버로부터 받는 데이터의 타입
		success: 성공했을 때 실행할 함수 설정
		error: 실패했을 때 실행할 함수 설정
	
	})

 --%>    
    
</head>
<body>
    <div class="container mt-3">
    	<h2>2번문제 최종 가격 정보</h2>
	  	<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
	  		<div class="container-fluid">  	
	            <input type="number" class="form-control me-2" 
	      	     id="price" placeholder="가격 입력"  name="price" aria-label="Search">
	            <input type="number" class="form-control me-2" 
	      	     id="saleRate" placeholder="할인율 입력"  name="saleRate" aria-label="Search">
	 	    </div>
	 	</nav>    	
    </div>
    <div class="container mt-3">
    	<h2>3번문제 급여등급</h2>
	  	<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
	  		<div class="container-fluid">
				<select name="grade" id="grade" style="width:150px">
					<option value="1">1</option>
					<option value="2">2</option>
					<option value="3">3</option>
					<option value="4">4</option>
				</select>
	 	    </div>
	 	</nav>
	 	<table class="table table-striped table-hover">
			<thead class="table-success">
		      	<tr  class="text-center">
				    <th>급여등급</th>
				    <th>최소급여</th>
				    <th>최대급여</th>
		      	</tr>
		    </thead>
		    <tbody>
			   	<tr id="salInfo" class="text-center">
			       
			   	</tr>
		 	</tbody>
		</table>      	    	
    </div>
    <div class="container mt-3">
    	<h2>4번문제 사원정보</h2>
	  	<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
	  		<div class="container-fluid">
				<input type="number" class="form-control me-2" 
	      	     id="empno" placeholder="사원번호 입력"  name="empno" aria-label="Search">
	 	    </div>
	 	</nav>
	 	<table class="table table-striped table-hover">
			<thead class="table-success">
		      	<tr  class="text-center">
				    <th>사원번호</th>
				    <th>사원명</th>
				    <th>직책</th>
				    <th>급여</th>
		      	</tr>
		    </thead>
		    <tbody>
			   	<tr id="empInfo" class="text-center">
			       
			   	</tr>
		 	</tbody>
		</table>      	    	
    </div>
</body>
</html>