<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ include file="/jsp/common/loginCheck.jsp" %>
<%@ include file="/jsp/common/include.jsp" %>
<html>
<head>
<title>::::: 도로점용관리시스템 :::::</title>
<meta http-equiv="Content-Type" content="text/html; charset=euc-kr">
</head>
<frameset rows="62,*,30" frameborder="NO" border="0" framespacing="0">
  <frame src="/jsp/rojum/map/menu.jsp" name="menu" scrolling="no" noresize id="menu" >
  <frame src="/jsp/rojum/map/map.jsp" name="map" scrolling="no" noresize id="map">
  <frame src="/jsp/rojum/map/bottom.jsp" name="bottom" scrolling="no" noresize id="bottom">
</frameset>
<noframes><body>
</body></noframes>
</html>