<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="com.google.gson.Gson"
    import="backWeb.a01_dao.A05_MemberDao"
    import="backWeb.z01_vo.Member"
    %>

<%
// ?id=himan
String id = request.getParameter("id");
if(id==null) id="";

A05_MemberDao dao = new A05_MemberDao();
Member m = dao.checkMem(id);
Gson g = new Gson();
if(m!=null){	
%>
	<%=g.toJson(m) %>
<%
}else{%>
	{"id":""}
<%}%>