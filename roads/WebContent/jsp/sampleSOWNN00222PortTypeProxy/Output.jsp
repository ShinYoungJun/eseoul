<%@page contentType="text/html;charset=EUC-KR"%>
<% request.setCharacterEncoding("EUC-KR"); %>

<%
String res = request.getParameter("Result");
%>
<HTML>
<HEAD>
<TITLE>SOWNN00222-OutPut</TITLE>
</HEAD>
<BODY>
<H1>SOWNN00222-OutPut</H1>
<%=res%>
</BODY>
</HTML>
