<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="backWeb.z01_vo.Job"
    import="backWeb.a01_dao.A04_PreparedDao"
    import="java.util.*"
    %>
<%
A04_PreparedDao dao = new A04_PreparedDao();
String titleS = request.getParameter("title");
if(titleS==null) titleS="";
String min1S = request.getParameter("min_sal1");
if(min1S==null) min1S="0";
String min2S = request.getParameter("min_sal2");
if(min2S==null) min2S="999999";
Map<String,String> map = new HashMap<String,String>();
map.put("title",titleS);
map.put("min_sal1",min1S);
map.put("min_sal2",min2S);
for(Job j : dao.getJob(map)) {
%>
<tr  class="text-center">
	<td><%=j.getJob_id() %></td>
	<td><%=j.getJob_title() %></td>
	<td><%=j.getMin_salary() %></td>
	<td><%=j.getMax_salary() %></td>
</tr>
<%}%>     	
