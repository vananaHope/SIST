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
	var titleVal = document.querySelector("#title").value;
	var min1Val = document.querySelector("#min_sal1").value;
	var min2Val = document.querySelector("#min_sal2").value;
	
	var page = "z10_jobDBAll.jsp?title="+titleVal+"&min_sal1="+min1Val+"&min_sal2="+min2Val
	
	document.querySelector("#jobList").innerHTML = getSync(page)
}
</script>    
</head>
<body>
    <div class="container mt-3">
        <h2>사원정보 등록</h2>
    	<form action="" method="post">
         	<div class="mb-3 mt-3">
            <label for="title">직책명:</label>
            <input type="text" class="form-control" 
      	     id="title" placeholder="직책명 입력" name="title">
         	</div>
         	<div class="mb-3 mt-3">
            <label for="min1">최소급여1:</label>
            <input type="text" class="form-control" 
      	     id="min_sal1" placeholder="최소급여 입력" name="min_sal1">
         	</div>
            <label for="min2">최소급여2:</label>
            <input type="text" class="form-control" 
      	     id="min_sal2" placeholder="최소급여 입력" name="min_sal2">
         	</div>
         	<button type="button" onclick="callAjax()" class="btn btn-success">전체 데이터 가져오기</button>
     	</form>
		<table class="table table-striped table-hover">
			<thead class="table-success">
		      	<tr class="text-center">
				    <th>직책ID</th>
				    <th>직책명</th>
				    <th>최소급여</th>
				    <th>최대급여</th>
		      	</tr>
		    </thead>
		    <tbody id="jobList">
		 	</tbody>
		</table>      	
    </div>
</body>
</html>