<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<table border width="30%">
	<%for(int i=1; i<=16; i++) {
		if(i%4==1) out.print("<tr>");
		if(i!=10 && i%10%3==0) {
			out.print("<td onclick=\"call(this)\">짝</td>");
		}else {
			out.print("<td onclick=\"call(this)\">"+i+"</td>");	
		}		
		if(i%4==0) out.print("</tr>");
	}
	%>
</table>
<script>
	function call(ob){
		alert(ob.innerText);
	}
</script>
</body>
</html>