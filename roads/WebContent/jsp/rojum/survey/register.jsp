<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ include file="/jsp/common/loginCheck.jsp"%>
<%@ include file="/jsp/common/include.jsp"%>
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
-->
</style>
<link href="/css/roads.css" rel="stylesheet" type="text/css">
</head>

<script language="javascript" src="/js/Check_inputbox.js"></script>


<script type="text/javascript">
//<![CDATA[

	function iFrameResize(obj)
	{
		var iFrm = obj;
		var the_height = iFrm.contentWindow.document.body.scrollHeight;

		iFrm.style.height = the_height;
	}

	function iFrameResizeTab(obj)
	{
		var iFrm = document.getElementById(obj);
		var the_height = iFrm.contentWindow.document.body.scrollHeight;

		iFrm.style.height = the_height;
	}

	function	RegisterPrc()
	{
		var	result	= tab1.RegisterPrc();

	}
	
	function	Search()
	{
		var form = document.form;

		form.action = "search.do";
		form.submit();
	}

	//]]>
</script>

<body>

	<form name="form" method="post">
		<input type="hidden" id="NAME_MIN" name="NAME_MIN" value="${NAME_MIN}">
		<input type="hidden" id="SSN1"  name="SSN1" value="${SSN1}">
		<input type="hidden" id="SSN2" name="SSN2" value="${SSN2}">
	
	<table width="780px" border="0" cellpadding="0" cellspacing="0">
		<tr>
			<td height="43px"><img src="/img/sub7_cont0_title.gif" width="780px" height="43"></td>
		</tr>
		<tr>
			<td align="center">
			<table width="780px" border="0" cellspacing="0" cellpadding="0">
				<tr>
					<td height="1" bgcolor="eaeaea"></td>
				</tr>
				<tr>
					<td height="14"></td>
				</tr>
				<tr>
					<table width="780px" border="0" cellspacing="0" cellpadding="0">
						<td align="left">
							<tr>
								<td>
								<iframe width="100%" height="100%" id="tab1" name="tab1" frameborder="0" onload="iFrameResize(this)" scrolling="no" src="/rojum/survey/info_register.do">
								</iframe>
								</td>
							</tr>
						</td>
					</table>
				</tr>
				<tr>
					
				</tr>
				<tr>
					<td height="40" align="right">
						<img src="/img/save_icon.gif" alt="전체저장" border="0" onClick="javascript:RegisterPrc();" style="CURSOR: hand">
						<img src="/img/list_icon.gif" alt="리스트" border="0" onClick="javascript:Search();" style="CURSOR:hand">
					</td>
				</tr>
				
				</table>
			</td>
		</tr>
	</table>
	</form>
</body>

</html>