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
//		document.getElementById("NAME_MIN").value		= tab1.document.getElementById("NAME_MIN").value;
//		document.getElementById("SSN1").value	= tab1.document.getElementById("min_ssn1").value;
//		document.getElementById("SSN2").value	= tab1.document.getElementById("min_ssn2").value;
		
//		var	NAME	= document.getElementById("NAME_MIN").value;
//		var	SSN1	= document.getElementById("SSN1").value;
//		var	SSN2	= document.getElementById("SSN2").value;

//		var tabs	= document.getElementById("tab2");
//		tabs.src	= "/gapan/gapan/jumji_search.do?NAME=" + NAME + "&SSN1=" + SSN1 + "&SSN2=" + SSN2;
	}
	
	function	GoJumyongSearch(adminno)
	{
		var form = document.form;
		
		form.action = "/gapan/gapan/view.do?ADMIN_NO=" + adminno;
		form.submit();
	}

	//점용인 정보의 검색 조건인 점용인, 주민(법인)번호에 선택한 민원 정보의 민원인명, 민원인 주민번호를 넣는다.
	function getSearchData( NAME_MIN, min_ssn1, min_ssn2)
	{
		tab2.document.location.href = "/gapan/gapan/jumji_search.do?NAME=" + NAME_MIN + "&SSN1=" + min_ssn1 + "&SSN2=" + min_ssn2;
	}
//]]>
</script>

<body onload="Init();">

<form name="form" method="post">
<input type="hidden" name="ADMIN_NO" value="${ADMIN_NO}">
<input type="hidden" name="NAME_MIN" value="">
<input type="hidden" name="jumin_ssn1" value="">
<input type="hidden" name="jumin_ssn2" value="">
<!-- 
<input type="hidden" name="ADMIN_NO" value="${ADMIN_NO}">
<input type="hidden" name="NAME_MIN" value="${NAME_MIN}">
<input type="hidden" name="SSN1" value="${SSN1}">
<input type="hidden" name="SSN2" value="${SSN2}">
 -->
		<table width="800" border="0" cellpadding="0" cellspacing="0">
			<tr>
		    	<td height="43"><img src="/img/sub6_cont1_title.gif" width="800" height="43"></td>
		  	</tr>
		  	
			<tr>
				<td height="1" bgcolor="eaeaea"></td>
			</tr>
			<tr>
		        <td height="14"></td>
			</tr>
			<tr>
				<td align="left">
					<table width="780" border="0" cellspacing="0" cellpadding="0">
			          	<tr>
			  				<td>
			  					<iframe width="100%" height="100%" id="tab1" name="tab1" frameborder="0" onload="iFrameResize(this)" scrolling="no" src="/gapan/gapan/saewol_register.do?ADMIN_NO=${ADMIN_NO}"></iframe>
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
		                  	<td width="111"><img name="jumin_img" src="/img/sub_petition_title2_on.gif" alt="관련점용지" width="110" height="22" border="0"></td>
		                </tr>
		            </table>
		            </td>
				</tr>
				<td>
				  	<iframe width="100%" height="100%" name="tab2" frameborder="0" scrolling="no" src="/gapan/gapan/jumji_search.do?NAME=${NAME_MIN}&SSN1=${minwon_ssn1}&SSN2=${minwon_ssn2}"></iframe>
				</td>
				<tr>
					<td height="40" align="right">
						<img src="/img/list_icon.gif" alt="리스트" border="0" onClick="javascript:Search();" style="CURSOR:hand">
					</td>
				</tr>
				</table>
				</td>
			</tr>
		
			
			
			<tr>
				<td height="30"></td>
			</tr>
			
		</table>
	</td>
	</tr>
	
</table>

</body>
</html>