<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ include file="/jsp/common/include.jsp"%>
<%@ include file="/jsp/common/loginCheck.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=euc-kr" />
<title>::::: 서울시 도로점용관리시스템 :::::</title>
<style type="text/css">
<!--
body {
	margin: 0px;
	background-image: url(/img/left_back.gif);
}
html {overflow-x : hidden;}
-->
</style>
<link href="/css/roads.css" rel="stylesheet" type="text/css">

<script>
function keyCheck(e) {
	if (e.keyCode == 123) {
		alert("소스보기(F12)키는 사용하실 수 없습니다.");
		return false;
	}
}
function returnFalse(e){
	return false;
}
function clipboardClear(){
	window.clipboardData.clearData();
}
function insertKeyCheck(frameNum) {
	frames[frameNum].document.body.attachEvent("onkeydown", keyCheck);
	frames[frameNum].document.body.attachEvent("oncontextmenu", returnFalse);
	frames[frameNum].document.body.attachEvent("ondragstart", returnFalse);
	frames[frameNum].document.body.attachEvent("ondragend", returnFalse); 
	frames[frameNum].document.body.attachEvent("onselectstart", returnFalse);
	frames[frameNum].document.body.attachEvent("onkeyup", clipboardClear);
}
</script>
	
</head>
<frameset rows="115,*" frameborder="NO" border="0" framespacing="0">
	<frame src="/admin/user/userInfo.do" name="menu" scrolling="NO" noresize id="menu" onload="javascript:insertKeyCheck(0);">
	<frameset cols="200,*" frameborder="NO" border="0" framespacing="0">
		<frame src="#" name="left" scrolling="NO" noresize id="left" onload="javascript:insertKeyCheck(1);">
		<frame src="#" name="cont" scrolling="auto" noresize id="map" onload="javascript:insertKeyCheck(2);">
	</frameset>
</frameset>
<noframes>
<body>
</body>
</noframes>
</html>