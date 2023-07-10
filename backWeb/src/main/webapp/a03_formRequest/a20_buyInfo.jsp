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
	<%
     	String pnameS = request.getParameter("pname");
     	if(pnameS==null) pnameS = "";
     	
     	String priceS = request.getParameter("price");
     	int price = 0;
     	if(priceS!=null && !priceS.equals(""))
     		price = Integer.parseInt(priceS);
     	
     	String countS = request.getParameter("count");
     	int count = 0;
     	if(countS!=null && !countS.equals(""))
     		count = Integer.parseInt(countS);
     	
     	int tot = price * count;
     	%>
    <div class="container mt-3">
    	<h2>구매물품</h2>
    	<form action="" method="post">
         	<div class="mb-3 mt-3">
            <label for="pname">물건명:</label>
            <input type="text" class="form-control" 
      	     id="pname" placeholder="물건명 입력" value="<%=pnameS%>" name="pname">
         	</div>
         	<div class="mb-3 mt-3">
            <label for="price">가격:</label>
            <input type="number" class="form-control" 
      	     id="price" placeholder="가격 입력" value="<%=price%>" name="price">
         	</div>
         	<div class="mb-3 mt-3">
            <label for="count">갯수:</label>
            <input type="number" class="form-control" 
      	     id="count" placeholder="갯수 입력" value="<%=count%>" name="count">
         	</div>
         	<button type="submit" class="btn btn-primary">구매</button>
     	</form>
     
		<table class="table table-striped table-hover">
			<thead class="table-success">
		      	<tr  class="text-center">
				    <th>물건명</th>
				    <th>가격</th>
				    <th>갯수</th>
				    <th>총액</th>
		      	</tr>
		    </thead>
		    <tbody>
			   	<tr class="text-center">
			        <td><%=pnameS%></td>
			        <td><%=price%></td>
			        <td><%=count%></td>
			        <td><%=tot%></td>
			   	</tr>
		 	</tbody>
		</table>      	
    </div>
</body>
</html>