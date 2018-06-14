<%@page contentType="text/html; charset=euc-kr" %>
<%@page import="java.util.*,  java.lang.*"%>
<%
	Runtime rt = Runtime.getRuntime();
	Process proc = rt.exec("\"C:\\Program Files\\Internet Explorer\\iexplore.exe\" http://localhost:8080/RexServer/samples/export/test.jsp");
	proc.waitFor();
%>