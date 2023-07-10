<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="backWeb.z01_vo.Member"
    %>
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
    String pname = request.getParameter("pname");
    if(pname==null) pname="";
    
    String[] priceS = request.getParameterValues("price");
    int price = 0;
    
    String id = request.getParameter("id");
    if(id==null) id="";
    
    String pwd = request.getParameter("pwd");
    if(pwd==null) pwd="";
    
    String name = request.getParameter("name");
    if(name==null) name="";	
    
    Member m = new Member(id,pwd,name);
    %>
    <div class="container mt-3">
   		<h2>물건Exp</h2>
    	<div class="input-group mb-3">
        	<span class="input-group-text">물건명</span>
        	<input type="text" class="form-control" 
        	value="<%=pname%>">
    	</div>
    </div>
    <div class="container mt-3">
   		<h2>물건Exp</h2>
    	<div class="input-group mb-3">
        	<span class="input-group-text">물건가격</span>
        	<%for(String prices : priceS) {
            	if(prices!=null&&!prices.equals("")) {
            		price = Integer.parseInt(prices);	
            	}    	
             %>
        	<input type="text" class="form-control" 
        	value="<%=price%>">
        	<%}%>
    	</div>
    </div>
    <div class="container mt-3">
   		<h2>회원정보 표시</h2>
    	<div class="input-group mb-3">
        	<span class="input-group-text">아이디</span>
        	<input type="text" class="form-control" 
        	value="<%=m.getId()%>">
    	</div>
    	<div class="input-group mb-3">
        	<span class="input-group-text">비밀번호</span>
        	<input type="text" class="form-control" 
        	value="<%=m.getPass()%>">
    	</div>
    	<div class="input-group mb-3">
        	<span class="input-group-text">이름</span>
        	<input type="text" class="form-control" 
        	value="<%=m.getName()%>">
    	</div>
    </div>

</body>
</html>