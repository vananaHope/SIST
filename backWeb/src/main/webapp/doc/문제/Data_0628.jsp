<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="backWeb.z01_vo.Dept"
    import="backWeb.a01_dao.A04_PreparedDao"
    import="java.util.*"
    import="com.google.gson.Gson"
    %>

<%
String dname = request.getParameter("dname");
if(dname==null) dname = "";

String loc = request.getParameter("loc");
if(loc==null) loc="";

A04_PreparedDao dao = new A04_PreparedDao();
List<Dept> dlist = dao.getDeptList(dname,loc);
Gson g = new Gson();
%>
<%=g.toJson(dlist)%>