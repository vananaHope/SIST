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
<script>
function call(){
	var xhr = new XMLHttpRequest();
	xhr.open("get","z05_json2.jsp",false)
	xhr.send() 
	var obj = JSON.parse(xhr.responseText)
	var obj[] = JSON.parse(xhr.responseText)
	var tds = document.querySelectorAll("tbody td")
	tds[0].innerText = obj.id
	tds[1].innerText = obj.pass
	tds[2].innerText = obj.name
	tds[3].innerText = obj.address
	tds[4].innerText = obj.contact
	
}

</script>
    <div class="container mt-3">
    	<h2>사원정보 등록</h2>
         	<button type="button" onclick="call()" class="btn btn-primary">등록</button>
     	</form>
		<table class="table table-striped table-hover">
			<thead class="table-success">
		      	<tr  class="text-center">
				    <th>아이디</th>
				    <th>비밀번호</th>
				    <th>이름</th>
				    <th>주소</th>
				    <th>연락처</th>
		      	</tr>
		    </thead>
		    <tbody>
			   	<tr  class="text-center">
			        <td></td>
			        <td></td>
			        <td></td>
			        <td></td>
			        <td></td>
			   	</tr>
		 	</tbody>
		</table>      	
    </div>
</body>
</html>