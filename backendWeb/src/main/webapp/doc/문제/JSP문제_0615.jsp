<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%--
[1단계:코드] 3. 주문번호   고객명   주문일자           상품명
      1   홍길동   2022-01-01   노트북
      2   이영희   2022-02-15   마우스
      3   김철수   2022-01-01   키보드, 마우스   
      4   박지성   2022-03-10   스마트폰
      5   이영희   2022-03-10   노트북, 핸드폰
      6   홍길동   2022-03-10   키보드
      이 내용을 제1정규화를 처리한 테이블 구조를 만드세요.
      
      <상품정보>
      상품번호 	상품명
      1			노트북
      2			마우스
      3			키보드
      4			스마트폰
      5			핸드폰
      
      <고객정보>
      고객번호		고객명
      1			홍길동
      2			이영희
      3			김철수
      4			박지성
      
      <주문정보>
      주문번호 	고객명		주문일자		상품명
      1			1		2022-01-01		1
      2			2		2022-02-15		2
      3			3		2022-01-01		3
      3			3		2022-01-01		2
      4			4		2022-03-10		4
      5			2		2022-03-10		1
      5			2		2022-03-10		5
      6			1		2022-03-10		3
      
[1단계:코드] 4. 깁밥의 가격과 갯수를 3종류를 요청값으로 받아서 해당 내용의 계산 결과를 테이블에 총비용과 함께 출력하세요.
 --%>
 
 <%--장바구니에서 최종 결재한 내용을 check후, 결재 내역을 출력해서 화면에 표시할 때 --%>
 
 <h2>김밥 테이블</h2>
 <table border width="30%">
 <tr><th>가격</th><th>갯수</th><th>총 비용</th></tr>
 <%
 String[] kimbapP = request.getParameterValues("price");
 String[] countS = request.getParameterValues("count");
 
 int price = 0;
 int count = 0;
 int tot = 0;
 
 if(kimbapP!=null) {
	for(int i=0;i<kimbapP.length;i++) {
		price = Integer.parseInt(kimbapP[i]);
		count = Integer.parseInt(countS[i]);
		tot = price*count;
		out.print("<tr>");
		out.print("<th>"+price+"</th>"+"<th>"+count+"</th>"+"<th>"+tot+"</th>");
		out.print("</tr>");
	}	 
 }
 %>
 </table>
</body>
</html>