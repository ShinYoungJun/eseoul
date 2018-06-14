<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ include file="/jsp/common/loginCheck.jsp" %>
<%@ include file="/jsp/common/include.jsp" %>


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
-->

</style>
<link href="/css/roads.css" rel="stylesheet" type="text/css">
</head>

<script type="text/javascript">
//<![CDATA[
	function Init(){
		parent.top.frames[1].location="/jsp/menu/left/facility.jsp?menu_param=jumyong";	//왼쪽 메뉴 링크
		parent.form.action = "/facility/jumyong/search.do?menu_param=jumyong";					//점용조회및관리 페이지로 이동
		parent.form.submit();
	}
//]]>
</script>

<body onload="Init();">
</body>
</html>