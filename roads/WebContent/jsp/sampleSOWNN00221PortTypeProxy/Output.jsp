
<%@page contentType="text/html;charset=euc-kr"%>
<%request.setCharacterEncoding("euc-kr");%>

<%
String res = request.getParameter("Result");
%>
<HTML>
<HEAD>
<TITLE>SOWNN00221-OutPut</TITLE>
</HEAD>
<BODY>
<H1>SOWNN00221-OutPut</H1>
<%=res%>
</BODY>
</HTML>
