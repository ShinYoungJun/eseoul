<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ include file="/jsp/common/loginCheck.jsp" %>
<%@ include file="/jsp/common/include.jsp" %>


<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=euc-kr" />

<title>::::: ����� ������������ý��� :::::</title>
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
		alert("����Ǿ����ϴ�.");
		parent.top.frames[1].location="/jsp/menu/left/rojum.jsp?menu_param=survey";	//���� �޴� ��ũ
		parent.form.action = "/rojum/survey/search.do";					//������ȸ�װ��� �������� �̵�
		parent.form.submit();
	}
//]]>
</script>

<body onload="Init();">
</body>
</html>