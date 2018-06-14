<%@page contentType="text/html;charset=EUC-KR"%>
<% request.setCharacterEncoding("EUC-KR"); %>

<%
String res = request.getParameter("Result");

String resCode = request.getParameter("resCode");
%>
<HTML>
<HEAD>
<TITLE>SOWNN00214-OutPut</TITLE>
</HEAD>
<BODY>
<H1>SOWNN00214-OutPut</H1>

<%=resCode%>
============
<%=res%>
</BODY>
</HTML>
