<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
	<title>::::: ??? ????????? :::::</title>
	<meta http-equiv="Content-Type" content="text/html; charset=euc-kr">
</head>


<!-- 

<frameset rows="72%,28%" frameborder="NO" border="0" framespacing="0" >
	<frame src="/jsp/jumyong/jumyong/info_top.jsp" name="top" scrolling="NO" noresize id="top" >	
	<frame src="/jumyong/productList.do" scrolling="YES" noresize id="bottom">
</frameset>
<noframes><body></body></noframes>

 -->
	<body>
	
<%String no = request.getParameter("no");%>	
<%String section = request.getParameter("section");%>	
	
	
	<table width="100%" height="1000" scrolling="yes" border="0">
		<tr>
			<td height="600" >
		        <iframe name='iframe1' frameborder="NO" border="0" framespacing="0" 
		        src="/jsp/jumyong/jumyong/info_topView.jsp?ADMIN_NO=<%=no%>" width="100%" height="100%" scrolling="NO"></iframe>
		    </td>
	    <tr>
			<td height="100%"  >												
	       		<iframe name='iframe2' frameborder="NO" border="1" framespacing="0" 
	       		src="/jumyong/productInsert.do?no=<%=no%>&section=<%=section%>" width="100%" height="100%" scrolling="yes"></iframe>
	        </td>
	    </tr>
    </table>
    </body>
</html>

