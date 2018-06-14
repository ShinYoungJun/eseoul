<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
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

		top.frames[1].location="/jsp/menu/left/facility.jsp?menu_param=jumyong";	//왼쪽 메뉴 링크
		form.action = "/facility/jumyong/search.do";							//점용허가 및 부과
		form.submit();
*/	
	}

	function	Search()
	{
		var form = document.form;

		form.action = "search.do";
		form.submit();
	}

	function Init()
	{
	//	var tab		= document.getElementById("CURRENT_TAB");
	//	tab.value	= "jumin";
	}
	
//]]>
</script>

<body onload="Init();">
<form name="form" id="form" method="post">

<table width="800" border="0" cellpadding="0" cellspacing="0">
	<tr>
    	<td height="43"><img src="/img/sub3_cont1_title.gif" width="800" height="43"></td>
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
		  					<iframe width="100%" height="100%"  id="tab1"  name="tab1" frameborder="0" onload="iFrameResize(this)" scrolling="no" src="/facility/minwon/info_register.do?corp_cd=${corp_cd}&gu_code=${gu_code}"></iframe>
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
					                  	<td width="111"><img name="jumin_img" id="jumin_img" src="/img/sub_petition_title2_on.gif" alt="관련점용지" width="110" height="22" border="0"></td>
					                </tr>
					            </table>
				            </td>
						</tr>
						<tr>
							<td>
							  	<iframe width="100%" height="100%"  id="tab2"  name="tab2" frameborder="0" onload="iFrameResize(this)" scrolling="no" src="/facility/minwon/jumin_search.do"></iframe>
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