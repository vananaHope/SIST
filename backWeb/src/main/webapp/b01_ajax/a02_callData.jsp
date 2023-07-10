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
function goAjax(){
	var xhr = new XMLHttpRequest()
	xhr.open("get","z02_data.jsp",false);
	xhr.send()
	
	var data = xhr.responseText
	var arry = data.split(",")
	var tds = document.querySelectorAll("tbody td")
	arry.forEach(function(prod,idx){
		/* console.log(prod+":"+idx) */
		tds[idx].innerText = prod
	})
	
/* 	tds[0].innerText = arry[0]
	tds[1].innerText = arry[1]
	tds[2].innerText = arry[2] */
}
// ex) a03_callId.jsp
//		id: [	] [등록여부확인]
//		z03_data.jsp
//		himan,goodMan,higirl
//		데이터와 동일여부를 확인해서 없으면 등록가능
//		있으면 등록된 아이디있습니다 처리
</script>
    <div class="container mt-3">
    	<h2 onclick="goAjax()">물건 정보 불러오기</h2>
		<table class="table table-striped table-hover">
			<thead class="table-success">
		      	<tr  class="text-center">
				    <th>물건명</th>
				    <th>가격</th>
				    <th>갯수</th>
		      	</tr>
		    </thead>
		    <tbody>
			   	<tr  class="text-center">
			        <td></td>
			        <td></td>
			        <td></td>
			   	</tr>
		 	</tbody>
		</table>      	
    </div>
</body>
</html>