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
<script>
function getSync(page){
	var xhr = new XMLHttpRequest();
	xhr.open("get",page,false);
	xhr.send();
	return xhr.responseText;
}

function callAjax(){
	var playerVal = document.querySelector("#player").value
	var seatVal = document.querySelector("#seat").value
	var hitVal = document.querySelector("#hit").value
	
	var page = "z08_reqJson.jsp?player="+playerVal+
			"&seat="+seatVal+"&hit="+hitVal
	
	var baseObj = JSON.parse(getSync(page))
	var tdArr = document.querySelectorAll("#baseBody td")
	tdArr[0].innerText = baseObj.player
	tdArr[1].innerText = baseObj.seat
	tdArr[2].innerText = baseObj.hit
	tdArr[3].innerText = baseObj.hitRate
}

// ex) 선수명 : [		] 타석: [		] 안타: [		] [타율확인]
//	z08_reqJson.jsp {"player":@@@,"seat":@@@,"hit":@@@,"hitRate":@@@}
//	테이블로 정보를 출력		선수명 타석 안타 타율
</script>    
</head>
<body>
    <div class="container mt-3">
    	<h2>야구선수 정보</h2>
    	<form action="" method="post">
         	<div class="mb-3 mt-3">
            <label for="player">선수명:</label>
            <input type="text" class="form-control" 
      	     id="player" placeholder="선수명 입력" name="player">
         	</div>
         	<div class="mb-3 mt-3">
            <label for="seat">타석:</label>
            <input type="number" class="form-control" 
      	     id="seat" placeholder="타석 입력" name="seat">
         	</div>
         	<div class="mb-3 mt-3">
            <label for="hit">안타:</label>
            <input type="number" class="form-control" 
      	     id="hit" placeholder="안타 입력" name="hit">
         	</div>
         	<%-- type="submit" 동기방식으로 화면전환으로 전송해버림 --%>
         	<button type="button" onclick="callAjax()" class="btn btn-primary">타율 확인</button>
     	</form>
		<table class="table table-striped table-hover">
			<thead class="table-success">
		      	<tr  class="text-center">
				    <th>선수명</th>
				    <th>타석</th>
				    <th>안타</th>
				    <th>타율</th>
		      	</tr>
		    </thead>
		    <tbody id="baseBody">
			   	<tr class="text-center">
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