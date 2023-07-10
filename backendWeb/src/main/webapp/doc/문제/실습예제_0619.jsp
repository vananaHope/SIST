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
<%--
실습과제
[1단계:개념] 1. 요청값과 다중데이터 처리, form 형식 처리, form의 여러가지 형식에 따른 처리를 
조원들과 함께 먼저 정리후 아래 문제를 풀어 보세요.
(1) 배열 선언(checkbox는 check한 것만 배열) ==> key1=val1&key1=val2&key1=val3 
	==> String[] xxx = getParameterValues("key1");
(2) 
<form>
	<input type="text" name="key">
	<input type="submit">	
</form>

<%
String XXX = request.getParameter("key")
if(XXX!=null) XXX="";
 %>

<h2><%=XXX%></h2>

(3)
<form>
	날짜:<input type="date" name="date01">
	숫자:<input type="number" name="">
	색상:<input type="color" name="">
</form>
String hiredateS = request.getParameter("hiredate")
if(hiredateS!=null) hiredateS = "";\

날짜 ==> to_date(date01,'YYYY-MM-DD')

[1단계:코드] 2. form형식으로 다중 처리하는 예제를 아래 3가지 형식으로 선언하고 다음 페이지에 출력하세요
   1) 구매할 물건명 입력(type=text)
   2) 결재할 물건의 가격(type=checkbox) : 선택된 것만
   3) select로 구매할 물건의 가격 : ctrl로 선택된 것만
[1단계:코드] 3. bootstrap형식으로 회원등록 화면 form 만들고, 등록시, 요청값 받아 VO객체로 생성 및 출력한 내용을 처리하세요.

 --%>
 <%
 String[] prices = {"3000","5000","6000","8000","9000","100000"};
 
 %>
<%--   <div class="container mt-3">
    <h2>form 연습</h2>
    <form action="실습예제_0619_Exp.jsp">
         <div class="mb-3 mt-3">
            <label for="empno">물건명:</label>
            <input type="text" class="form-control" 
              id="pname" placeholder="물건명 입력" name="pname">
         </div>
         <div class="mb-3 mt-3">
            <label for="empno">물건가격:</label><br>
            <%for(String price:prices) {%>
            <input type="checkbox"
              id="price" name="price" value="<%=price%>"><%=price%><br>
            <%}%>  
         </div>
         <div class="mb-3 mt-3">
            <label for="empno">물건가격(select):</label>
            <select id="price" name="price" multiple>
				<%for(String price:prices) {%>
					<option><%=price%></option>
				<%}%>
			</select>              
         </div>
         
         
         <button type="submit" class="btn btn-primary">등록</button>
     </form>
  </div> --%>
<div class="container mt-3">
  <h2 style="text-align:center;">회원정보등록</h2>
  <form action="실습예제_0619_Exp.jsp">
    <div class="mb-3 mt-3">
      <label for="id">아이디</label>
      <input type="text" class="form-control" id="id" placeholder="아이디 입력" name="id">
    </div>
    <div class="mb-3 mt-3">
      <label for="pwd">비밀번호</label>
      <input type="text" class="form-control" id="pwd" placeholder="비밀번호 입력" name="pwd">
    </div>
    <div class="mb-3 mt-3">
      <label for="name">이름</label>
      <input type="text" class="form-control" id="name" placeholder="이름 입력" name="name">
    </div>
    <button type="submit" class="btn btn-primary">Submit</button>
  </form>
</div>  
</body>
</html>