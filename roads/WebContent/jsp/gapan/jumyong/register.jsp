<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ include file="/jsp/common/loginCheck.jsp" %>    
<%@ include file="/jsp/common/include.jsp" %>
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
		//alert(iFrm.contentWindow.document.body.scrollHeight);
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
/*
		//싱크를 맞추기 위해 임시 방편으로....
		for(var i=0; i < 1000000; i++){
			if(result == true)
				break;
		}

		//	필수 항목이 비어 있으면 ..
		if(result == false)
			return;

		var form = document.form;

		top.frames[1].location="/jsp/menu/left/gapan.jsp?menu_param=jumyong";	//왼쪽 메뉴 링크
		form.action = "/gapan/jumyong/search.do";			//점용허가 및 부과
		form.submit();
*/
	}
	
	function	Search()
	{
		var form = document.form;

		form.action = "search.do";
		form.submit();
	}
	
	function 	Init()
	{
		//alert("${test1}");
		//alert("${test2}");
		/*
		document.getElementById("NAME_MIN").value		= tab1.document.getElementById("NAME_MIN").value;
		document.getElementById("SSN1").value	= tab1.document.getElementById("min_ssn1").value;
		document.getElementById("SSN2").value	= tab1.document.getElementById("min_ssn2").value;

		var	NAME	= document.getElementById("NAME_MIN").value;
		var	SSN1	= document.getElementById("SSN1").value;
		var	SSN2	= document.getElementById("SSN2").value;

		var tabs	= document.getElementById("tab2");
		tabs.src	= "/gapan/gapan/jumji_search.do?NAME=" + NAME + "&SSN1=" + SSN1 + "&SSN2=" + SSN2;
		*/
	}
	
	function	GoJumyongSearch(gapanno)
	{
		var form = document.form;
		
		top.frames[1].location="/jsp/menu/left/gapan.jsp?menu_param=jumyong";	//왼쪽 메뉴 링크
		form.action = "/gapan/jumyong/view.do?GAPAN_NO=" + gapanno;
		form.submit();
	}

//]]>
</script>

<body onload="Init();">

<form name="form" method="post">
	<input type="hidden" id="NAME_MIN" name="NAME_MIN" value="${NAME_MIN}">
	<input type="hidden" id="NAME_MIN" name="SSN1" value="${SSN1}">
	<input type="hidden" id="NAME_MIN" name="SSN2" value="${SSN2}">

<table width="800" border="0" cellpadding="0" cellspacing="0">
	<tr>
    	<td height="43"><img src="/img/sub6_cont1_title.gif" width="800" height="43"></td>
  	</tr>
  	<tr>
		<td align="center">
	    <table width="780" border="0" cellspacing="0" cellpadding="0">
			<tr>
				<td height="1" bgcolor="eaeaea"></td>
			</tr>
			<tr>
		        <td height="14"></td>
			</tr>
			<tr>
				<td align="left">
		          	<tr>
		  				<TD>
			  				<iframe width="100%" height="100%" id="tab1" name="tab1" frameborder="0" onload="iFrameResize(this)" scrolling="no" src="/gapan/jumyong/tab/info_register.do"></iframe>
		  				</TD>
		          	</tr>
				</td>
			</tr>
			<tr>
				<td height="40" align="right">
					<img src="/img/save_icon.gif" alt="전체저장" border="0" onClick="javascript:RegisterPrc();" style="CURSOR:hand">
				</td>
			</tr>		
		</table>
		</td>
	</tr>
</table>

</body>
</html>