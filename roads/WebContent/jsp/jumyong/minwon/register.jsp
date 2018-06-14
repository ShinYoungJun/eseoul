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
		var the_height = iFrm.contentWindow.document.body.scrollHeight;

		iFrm.style.height = the_height + "px";
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
		top.frames[1].location="/jsp/menu/left/jumyong.jsp?menu_param=jumyong";	//왼쪽 메뉴 링크
		form.action = "/jumyong/jumyong/search.do";					//점용조회및관리 페이지로 이동
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
		document.getElementById("NAME_MIN").value		= tab1.document.getElementById("NAME_MIN").value;
		document.getElementById("SSN1").value	= tab1.document.getElementById("min_ssn1").value;
		document.getElementById("SSN2").value	= tab1.document.getElementById("min_ssn2").value;
		
		var	NAME	= document.getElementById("NAME_MIN").value;
		var	SSN1	= document.getElementById("SSN1").value;
		var	SSN2	= document.getElementById("SSN2").value;

		var tabs	= document.getElementById("tab2");
		tabs.src	= "/jumyong/minwon/jumji_search.do?NAME=" + NAME + "&SSN1=" + SSN1 + "&SSN2=" + SSN2;
	}
	
	function	GoJumyongSearch(adminno)
	{
		var form = document.form;
		
		top.frames[1].location="/jsp/menu/left/jumyong.jsp?menu_param=jumyong";	//왼쪽 메뉴 링크
		form.action = "/jumyong/jumyong/view.do?ADMIN_NO=" + adminno;
		form.submit();
	}

//]]>
</script>

<body onload="Init();">
<form name="form" method="post">
	<input type="hidden" id="NAME_MIN" name="NAME_MIN" value="${NAME_MIN}">
	<input type="hidden" id="SSN1" name="SSN1" value="${SSN1}">
	<input type="hidden" id="SSN2" name="SSN2" value="${SSN2}">

<table width="800" border="0" cellpadding="0" cellspacing="0">
	<tr>
    	<td height="43"><img src="/img/sub1_cont1_title.gif" width="800" height="43"></td>
  	</tr>
  	<tr>
		<td align="center">
    	<table width="780" border="0" cellspacing="0" cellpadding="0">
			<tr>
				<td height="1" bgcolor="eaeaea"></td>
			</tr>
		 
			<tr>
		        <td height="15"></td>
			</tr>    
		      
			<tr>
				<td align="left">
		          	<tr>
		  				<TD>
		  				<iframe width="100%" height="100%" id="tab1" name="tab1" frameborder="0" onload="iFrameResize(this)" scrolling="no" src="/jumyong/minwon/info_register.do"></iframe>
		  				</TD>
		          	</tr>
				</td>
			</tr>
			
			<tr>
				<td height="40" align="right">
					<img src="/img/save_icon.gif" alt="전체저장" border="0" onClick="javascript:RegisterPrc();" style="CURSOR:hand">
				</td>
			</tr>
		      
			<tr>
				<td height="30"></td>
			</tr>
		 
			<tr>
		        <td align="left">
		        	<table width="780" border="0" cellspacing="0" cellpadding="0">
				        <tr>
				            <td height="22" background="/img/tab_line_purple.gif">
					            <table border="0" cellspacing="0" cellpadding="0">
					                <tr>
					                  	<td width="111"><img id="jumin_img" name="jumin_img" src="/img/sub_petition_title2_on.gif" alt="관련점용지" width="110" height="22" border="0"></td>
					                </tr>
					            </table>
				            </td>
						</tr>
						<tr>
							<td>
							  	<iframe width="100%" height="100%" id="tab2" name="tab2" frameborder="0" onload="iFrameResize(this)" scrolling="no" src="/jumyong/minwon/jumji_search.do?NAME="+${NAME_MIN} + "&SSN1=" + ${min_ssn1} + "&SSN2=" + ${min_ssn2}></iframe>
							</td>
						</tr>
					</table>
				</td>
			</tr>

			<tr>
				<td height="40" align="right">
					<img src="/img/list_icon.gif" alt="리스트" border="0" onClick="javascript:Search();" style="CURSOR:hand">
				</td>
			</tr>
			
			</table>
		</td>
	</tr>
</table>

</body>
</html>
