<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"
	rel="stylesheet">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
<title>Insert title here</title>
</head>
<%--
  code(키, 값, 상위키,정렬순위)
    1000  과일  0
    1001  사과   1000 1
    1002  바나나  1000 2
    1003  딸기   1000 3
    1004  오렌지  1000 4
    select *
    from code
    where 상위키 = 1000;
    order 정렬순위
    
1. select(Combo box) 모듈 ajax로 list 및 등록 처리 만들기

2. 처리 순서
	1) DB 테이블 SQL 구성
	2) Dao 생성
	3) 초기 list 화면 구성 : ajax 처리(backend )
	4) 등록 click시 등록 화면 구성
	5) 클릭 시 상세화면 구성
		- 수정/삭제 처리
	6) Combo Box 활용

# 진행 순서
0. 파일
	front(a13_ComBoAjx.jsp)
	
1. backend(z13_comboList.jsp)
	요청값 : title
	import 처리(Dao,Gson,Code)
	Gson으로 json 데이터 로딩

2. frontend(a13_ComboBoxAjx.jsp)		
 	1) 화면 구성
 		제목 [	] [검색]
 	2) 이벤트 처리
 	3) 이벤트 핸들러 처리
 		- 검색 DOM
 		- ajax 처리
 		- 화면 리스트 처리
 	
# 코드 등록 처리 ajax
		
1. back단(servlet 이용)
	1) Dao(등록 처리-메서드 추가)
		sql (insert문)
			INSERT INTO code VALUES (code_seq.nextval, '과일','val',0,1);
			INSERT INTO code VALUES (code_seq.nextval, ?,?,?,?);
		dao insert메서드 추가
	2) 요청값 받기
	3) 등록 결과 리턴 문자열

2. front단 
	1) 등록 버튼 : 클릭 
	2) 등록 pop창 로딩(bootstrap 모달창)
		등록 항목 text
		제목:[	]
		값: [	]
		상위번호: [	]
		정렬순서: [	]
		[등록]
	3) 이벤트 핸들러 
		ajax로 등록 controller 호출 처리 	
		
# 등록 후, 처리 프로세스 
1. 등록완료
	- 등록 성공
	- 화면에 있는 데이터를 재조회 처리
	- 입력 데이터 초기화
	- 계속 여부 확인
		- 계속시 등록 처리할 수 있게 하고
		- 취소시 창이 닫게 처리 		
		
# 상세화면 로딩 및 수정/삭제
1. 화면처리
	1) 모달창(수정/삭제) 추가
	2) row 단위로 클릭
	3) 화면 로딩(모달창)
		주의 기존 등록 process와 구분할 수 있도록
		- input hidden으로 process 처리
			단일 데이터가져오기/등록/수정/삭제 ==> 같은 servlet에서 처리
		- 단일 데이터 ajax로 가져오기
	4) 수정 클릭시, 수정할 요청값을 query string 만들기
	5) 수정 프로세스 ajax 처리 	
	6) 수정 후 처리 내용
		- 수정 성공 / 계속 수정하시겠습니까?
	7) 단일데이터 ajax로 가져와서 로딩 처리

2. backend 처리
	1) sql 작성
		- 단일 데이터 조회 
			select * from code where no = ?
		- 수정 처리
			update code
				set title = ?,
					val = ?, 
					refno = ?,
					ordno = ?
				where no = ?
		- 삭제 처리
			delete from code
				where no = ?
	
	2) dao 메서드 추가			
		public Code getCode(int no);
		public void insCode(Code upt);
		public void deleteCode(int no);
		
	3) Servlet(MVC 패턴의 Controller 연습) 
		String proc = request.getParameter("proc")
			단일 데이터 로딩, 등록, 수정, 삭제
			
			Dao 생성
			조건에 따라서 메서드 처리
			결과값 처리 Gson 활용
		
		
	3)  												
 --%>
<script>
	function combo13() {
		if (eventCode == 13) {
			combo()
		}
	}

	function combo() {
		var titleVal = document.querySelector("#title").value
		var refnoVal = document.querySelector("#refno").value

		var qrStr = "title=" + titleVal+"&refno="+refnoVal
		var xhr = new XMLHttpRequest()
		xhr.open("post", "z13_comboList.jsp", true)
		xhr.setRequestHeader("Content-Type",
				"application/x-www-form-urlencoded")
		xhr.send(qrStr)
		xhr.onreadystatechange = function() {
			if (xhr.status == 200 && xhr.readyState == 4) {
				var fList = JSON.parse(xhr.responseText)
				var fObj = document.querySelector("#fruitShow")
				var show = ""
				fList.forEach(function(fruit) {
					show += "<tr ondblclick='detail("+fruit.no+")' class='text-center "+(fruit.refno==0?'table-info':'')+"'>"
					show += "<th>" + fruit.no + "</th>"
					show += "<th>" + fruit.title + "</th>"
					show += "<th>" + (fruit.val==undefined?'':fruit.val) + "</th>"
					show += "<th>" + fruit.refno + "</th>"
					show += "<th>" + fruit.ordno + "</th>"
					show += "</tr>"
				})
				fObj.innerHTML = show
			}

		}

	}
	function detail(no){
		document.querySelector("#detailModal").click()
		document.querySelector(".modal-title").innerText
		="코드상세화면[코드번호:"+no+"]"
		// ajax로 상세 데이터를 가져와서 화면에 데이터 넣기
	}
	function insModal(){
		document.querySelector(".modal-title").innerText
		="코드등록"
	}
</script>
<body>
	<div class="container mt-3">
		<h2>Combo List</h2>
		<div class="mb-3 mt-3">
			<label for="title">제목:</label> <input type="text"
				onkeyup="combo13()" class="form-control" id="title"
				placeholder="제목 입력" name="title">
			<label for="">상위코드:</label> <input type="text"
				value="0" onkeyup="combo13()" class="form-control" id="refno"
				placeholder="상위코드 입력" name="refno">
		</div>
		<div id="detailModal" data-bs-toggle="modal"
			data-bs-target="#myModal"></div>
		<button id="insertModal" onclick="insModal()" 
			type="button" class="btn btn-success" data-bs-toggle="modal"
			data-bs-target="#myModal">코드 등록</button>
		

		<button type="button" onclick="combo()" class="btn btn-primary">조회</button>
		<table class="table table-striped table-hover">
			<thead class="table-success">
				<tr class="text-center">
					<th>번호</th>
					<th>제목</th>
					<th>값</th>
					<th>상위번호</th>
					<th>정렬순서</th>
				</tr>
			</thead>
			<tbody id="fruitShow">
			</tbody>
		</table>
	</div>
	<div class="modal" id="myModal">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<h4 class="modal-title">코드 등록</h4>
					<button type="button" id="modalClsBtn" class="btn-close" data-bs-dismiss="modal"></button>
				</div>
				<form id="regFrm">
				<div class="modal-body">
					<div class="mb-3 mt-3">
						<label for="title">제목:</label> <input type="text"
							class="form-control" id="title"
							placeholder="타이틀 입력" name="title">
					</div>
					<div class="mb-3 mt-3">
						<label for="val">값:</label> <input type="text"
							class="form-control" id="val"
							placeholder="값 입력" name="val">
					</div>
					<div class="mb-3 mt-3">
						<label for="refno">상위번호:</label> <input type="text"
							class="form-control" id="refno"
							placeholder="상위번호 입력" name="refno">
					</div>
					<div class="mb-3 mt-3">
						<label for="ordno">정렬순서:</label> <input type="number"
							class="form-control" id="ordno"
							placeholder="정렬순서 입력" name="ordno">
					</div>
				</div>
				</form>	
				<div class="modal-footer">
					<button onclick="ajaxSave()" type="button" class="btn btn-success">
						등록</button>
					<button onclick="ajaxUpdate()" type="button" class="btn btn-primary">
						수정</button>
					<button onclick="ajaxDelete()" type="button" class="btn btn-warning">
						삭제</button>
					<button type="button" class="btn btn-danger"
						data-bs-dismiss="modal">취소</button>
				</div>
				
			</div>
		</div>
	</div>
	<script>
		function ajaxSave(){
			// 입력 val
			var title = document.querySelector(".modal-body #title").value
			var val = document.querySelector(".modal-body #val").value
			var refno = document.querySelector(".modal-body #refno").value
			var ordno = document.querySelector(".modal-body #ordno").value
			var qStr = "title="+title+"&refno="+refno
						+"&ordno="+ordno
						+"&val="+val
			// ajax 처리
			var xhr = new XMLHttpRequest();
			xhr.open("post","/backWeb/codeIns.do",true)
			xhr.setRequestHeader("Content-Type",
					"application/x-www-form-urlencoded")
			xhr.send(qStr)
			xhr.onreadystatechange=function(){
				if(xhr.readyState==4&&xhr.status==200){
					var result = xhr.responseText
					if(result=="Y"){
						alert("등록 성공")
						combo()
						document.querySelector("#regFrm").reset()
						if(!confirm("계속 등록하시겠습니까?")){
							// 창닫기 처리
							document.querySelector("#modalClsBtn").click()
						}
					}else {
						alert("등록 실패")
					}
				}
			}
			
			
			
		}
		// 초기에 수행 처리.. (화면에 검색된 상태에서 처리)
		combo();
		/*
		1. 등록완료
			- 등록 성공
			- 화면에 있는 데이터를 재조회 처리
			- 입력 데이터 초기화
			- 계속 여부 확인
				- 계속시 등록 처리할 수 있게 하고
				- 취소시 창이 닫게 처리   
		
		2. 리스트데이터 처리
			화면구현
				- 제목: [		]
				- 상위코드: [		]
			js로 요청값 처리	
			계층형 sql로 계층별로 리스트되게 처리
			sql 처리
			dao 변경
			--------------------
			요청값 상위코드 전달 (Servlet에서)
			
		
		
		*/
		
	</script>
</body>
</html>