<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

<%
	String 		userId	= (String)session.getAttribute("sessionUserId");
	
	if(userId == null)
	{ 
%>
		<script language="javascript">
			alert('세션이 종료 되었습니다.');

			opener.parent.location.href="/admin/user/login.do"
			window.self.close();
			
		</script>
<%
	}
%>
<html>
<head>
<title>::::: 도로점용관리시스템 :::::</title>
<meta http-equiv="Content-Type" content="text/html; charset=euc-kr">
</head>
<frameset rows="62,*,30" frameborder="NO" border="0" framespacing="0">
  <frame src="/jsp/map/menu.jsp" name="menu" scrolling="no" noresize id="menu" >

  <frame src="/jsp/map/map.jsp" name="map" scrolling="no" noresize id="map">

  <frame src="/jsp/map/bottom.jsp" name="bottom" scrolling="no" noresize id="bottom">
</frameset>
<noframes><body>
</body></noframes>
</html>