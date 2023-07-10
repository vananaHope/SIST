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
int ranNum1 = (int)(Math.random()*9+1);
int ranNum2 = (int)(Math.random()*9+1);

String answerS = request.getParameter("answer");
int answer = 0;
if (answerS != null) {
   answer = Integer.parseInt(answerS);
}
%>

<div class="container mt-3">
    <h2>multiplication tables</h2>
    <form action="" method="post">
        <div class="mb-3 mt-3">
            <label for="gugu"><%=ranNum1%></label>
            <label for="gugu">×</label>
            <label for="gugu"><%=ranNum2%></label>
            <input type="number" class="form-control" id="answer" placeholder="Enter answer" name="answer">
        </div>
        <button type="submit" class="btn btn-primary">Check Answer</button>
    </form>

    <% 
    if (answer != 0) {
        int result = ranNum1 * ranNum2;
        if (result == answer) {
            request.getRequestDispatcher("answer.jsp").forward(request, response);
        } else {
            request.getRequestDispatcher("NoAnswer.jsp").forward(request, response);
        }
    }
    %>
</div>

    		

</body>
</html>