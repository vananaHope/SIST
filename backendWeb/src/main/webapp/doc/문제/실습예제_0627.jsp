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
    function callAjax1(){
    	var obj1 = document.querySelector("#show")
    	obj1.innerText = getSync("z11_data.jsp")
    	
    }
    function callAjax2(){
    	var pname = document.querySelector("#pname").value
    	var price = document.querySelector("#price").value
    	var showObj = document.querySelector("#show1")
    	
    	var page = "z12_data.jsp?pname="+pname+"&price="+price
    	var aObj = JSON.parse(getSync(page))
    	
    	showObj.innerText = aObj.prd
    			
    	
    }
    
    </script>
</head>
<body>
<%--
# 실습과제
[1단계:개념] 1. ajax처리 순서를 기술하세요(h01_show.jsp vs z11_data.jsp 두 페이지간 기준)
h01_show.jsp ==> z11_data에 요청값 전송 ==> z11_data에서 요청값 받음 ==> z11_data에서 화면 처리 / DB와 연동하여 화면 처리
==> 처리된 화면 h01_show에 전송 ==> 화면 출력

[1단계:코드] 2. ajax로 [화면호출]로 서버에 있는 <h3>반가워요</h3> 처리
[1단계:코드] 2. ajax로 물건명[  ]가격[   ][전송 및 화면호출]로 서버에 있는 <h3>@@는 @@@원입니다.</h3> 
[1단계:코드] 2. ajax로 [데이터화면호출]로 서버에 table형식의 화면 호출(DAO - public List<Manager> getManager())
[1단계:코드] 3. ajax로 id[  ]pass[  ] [로그인]  table형식으로 회원이 없던지 table로 출력

 --%>
    <div class="container mt-3">
    	<h2>문제2번</h2>
    	<h3 id="show"></h3>
    	<button type="button" onclick="callAjax1()" class="btn btn-success">화면 호출</button>
    	<h2>문제3번</h2>
    	<form action="" method="post">
         	<div class="mb-3 mt-3">
            <label for="pname">물건명:</label>
            <input type="text" class="form-control" 
      	     id="pname" placeholder="물건명 입력" name="pname">
         	</div>
         	<div class="mb-3 mt-3">
            <label for="price">가격:</label>
            <input type="number" class="form-control" 
      	     id="price" placeholder="가격 입력" name="price">
         	</div>
         	<button type="button" onclick="callAjax2()" class="btn btn-primary">전송 및 화면호출</button>
     	</form>
     	<h3 id="show1"></h3>
     	<button type="button" onclick="callAjax3()" class="btn btn-primary">데이터화면호출</button>
		<table class="table table-striped table-hover">
			<thead class="table-success">
		      	<tr  class="text-center">
				    <th>사원번호</th>
				    <th>사원명</th>
				    <th>부서명</th>
		      	</tr>
		    </thead>
		    <tbody id="show2">
		 	</tbody>
		</table>      	
    </div>
</body>
</html>