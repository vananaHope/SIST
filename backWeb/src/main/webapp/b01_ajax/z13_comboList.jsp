<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="com.google.gson.Gson"
    import="backWeb.z01_vo.Code"
    import="backWeb.a01_dao.A04_PreparedDao"
    import="java.util.*"
    %>

<%
String title = request.getParameter("title");
if(title==null) title="";
String refnoS = request.getParameter("refno");
int refno = 0;
if(refnoS!=null && refnoS.equals("")) refno = Integer.parseInt(refnoS);

A04_PreparedDao dao = new A04_PreparedDao();
List<Code> clist = dao.getCodeList(title,refno);
Gson g = new Gson();
%>
<%=g.toJson(clist)%>