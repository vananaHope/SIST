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
<%--
# 실습과제
[1단계:개념] 1. ajax처리시 
서버단 처리와 프런트 처리의 내용을 순차별 기술하고, 
핵심 코드를 정리하세요

1. 프론트, 백엔드 파일 생성

2. 백엔드
import ==> Dao, Vo, Gson
List<VO> a = dao.메서드명
Gson g = new Gson();
<%=g.toJson(a)%>

3. 프론트 엔드
function frt(){
	var xhr = new XMLHttpRequest();
	var qStr = "name값="+value값
	xhr.open("post",전송할 페이지명,true)
	xhr.setRequestHeader("Content-Type","application/x-www-form-urlencoded")
	xhr.send(qStr)
	xhr.onreadystatechange=function(){
		if(xhr.readyState==4 && xhr.status == 400) {
			var list = xhr.responseText
		}
	}
}

[1단계:코드] 2. 부서정보를 ajax로 (부서명,부서위치)
키워드 검색하여 리스트 처리하세요.

 --%>
 <script>
 function deptSch(){
	 var dnameVal = document.querySelector("#dname").value
	 var locVal = document.querySelector("#loc").value 
	 var qStr = "dname="+dnameVal+"&loc="+locVal
	 
	 var xhr = new XMLHttpRequest();
	 xhr.open("post","Data_0628.jsp",true)
	 xhr.setRequestHeader("Content-Type","application/x-www-form-urlencoded")
	 xhr.send(qStr)
	 var show = ""
	 xhr.onreadystatechange=function(){
		 if(xhr.readyState==4 && xhr.status==200) {
			 var deptList = JSON.parse(xhr.responseText)
			 var deptObj = document.querySelector("#deptShow")
			 deptList.forEach(function(d){
				 show += "<tr>"
				 show += "<td>"+d.deptno+"</td>"
				 show += "<td>"+d.dname+"</td>"
				 show += "<td>"+d.loc+"</td>"
				 show += "</tr>"
			 })
			 deptObj.innerHTMP = show
		 }
		 
	 }
	 
 }
 
 
</script>
<body>
    <div class="container mt-3">
    	<h2>부서정보</h2>
    	<form action="" method="post">
         	<div class="mb-3 mt-3">
            <label for="dname">부서명:</label>
            <input type="text" class="form-control" 
      	     id="dname" placeholder="부서명 입력" name="dname">
         	</div>
         	<div class="mb-3 mt-3">
            <label for="loc">부서위치:</label>
            <input type="text" class="form-control" 
      	     id="loc" placeholder="사원명 입력" name="loc">
         	</div>
         	<button type="button" onclick="deptSch()" class="btn btn-primary">조회</button>
     	</form>
		<table class="table table-striped table-hover">
			<thead class="table-success">
		      	<tr  class="text-center">
				    <th>부서번호</th>
				    <th>부서명</th>
				    <th>부서위치</th>
		      	</tr>
		    </thead>
		    <tbody id="deptShow">
		 	</tbody>
		</table>      	
    </div>
</body>
</html>