<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%-- <%
String[] productsS = request.getParameterValues("products");
String[] pricesS = request.getParameterValues("prices");

int tot = 0;
if(pricesS!=null) {
	out.print("<table>");
	out.print("<tr><th>no</th><th>물건명</th><th>가격</th></tr>");
	for(int i=0;i<pricesS.length;i++){
		int price = Integer.parseInt(pricesS[i]);
		out.print("<tr>")
		out.print("<th>"+i+1+"</th>"+"<th>"+productsS[i]+"</th>"+"<th>"+price+"</th>");
		out.print("</tr>")
		tot += price;
	}
	out.print("</table>");
}

%> --%>

<h2>구매내역</h2>
<table>
	<tr><th>no</th><th>물건명</th><th>가격</th></tr>
	<%
	String[] names = request.getParameterValues("name");
	String[] prices = request.getParameterValues("price");
	int tot = 0;
	if(names!=null)
		for(int idx=0;idx<names.length;idx++){
			out.print("<tr>");
			out.print("<th>"+(idx+1)+"</th>");	
			out.print("<th>"+names[idx]+"</th>");	
			out.print("<th>"+prices[idx]+"</th>");
			out.print("</tr>");
			tot += Integer.parseInt(prices[idx]);
		}
	%>
	<tr><th colspan='2'>총비용</th><th><%=tot %></th></tr>
</table>

</body>
</html>