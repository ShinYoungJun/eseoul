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

	
	/*function	RegisterPrc()
	{
		var	result	= tab1.RegisterPrc();

		//	필수 항목이 비어 있으면 ..
		if(result == false)
			return;

		var form = document.form;

		top.frames[1].location="/jsp/menu/left/gapan.jsp?MENU_PARAM=sugeo";	//왼쪽 메뉴 링크
		//top.frames[2].location="/jumyong/search.do";		//오른쪽 페이지 링크
		form.action = "/jsp/gapan/sugeo/search.jsp";					// 수거및처리 페이지로 이동
		form.submit();
	}
	
	function RegisterPrc_bugwa()
	{
		var result = tab1.RegisterPrc_bugwa();
	
		//	필수 항목이 비어 있으면 ..
		if(result == false)
			return;

		var form = document.form;

		top.frames[1].location="/jsp/menu/left/gapan.jsp?MENU_PARAM=sugeo";	//왼쪽 메뉴 링크
		//top.frames[2].location="/jumyong/search.do";		//오른쪽 페이지 링크
		form.action = "/jsp/gapan/sugeo/search.jsp";					// 수거및처리 페이지로 이동
		form.submit();
	
	
	}*/
	
	function	Search()
	{	
		var form = document.form;

		form.action = "search.do";
		form.submit();
	}
	
	function 	Init()
	{
		/*document.getElementById("NAME_MIN").value		= tab1.document.getElementById("NAME_MIN").value;
		document.getElementById("SSN1").value	= tab1.document.getElementById("min_ssn1").value;
		document.getElementById("SSN2").value	= tab1.document.getElementById("min_ssn2").value;
		
		var	NAME	= document.getElementById("NAME_MIN").value;
		var	SSN1	= document.getElementById("SSN1").value;
		var	SSN2	= document.getElementById("SSN2").value;
		
		var tabs	= document.getElementById("tab2");
		tabs.src	= "/jumyong/minwon/jumji_search.do?NAME=" + NAME + "&SSN1=" + SSN1 + "&SSN2=" + SSN2;
		*/
	}
	

//]]>
</script>

<body onload="Init();">
	
<form name="form" method="post">
<input type="hidden" name="mul_no" value="${mul_no }">
<!-- 리스트 검색파라미터 start -->
<input type="hidden" name="rem_date_from" value="${param.rem_date_from }">
<input type="hidden" name="rem_date_to" value="${param.rem_date_to }">
<input type="hidden" name="rem_mulcd" value="${param.rem_mulcd }">
<input type="hidden" name="rem_mulnm" value="${param.rem_mulnm }">
<input type="hidden" name="rem_bjcd" value="${param.rem_bjcd }">
<input type="hidden" name="rem_hjcd" value="${param.rem_hjcd }">
<input type="hidden" name="rem_addr" value="${param.rem_addr }">
<input type="hidden" name="rem_nm" value="${param.rem_nm }">
<input type="hidden" name="goods_status" value="${param.goods_status }">
<input type="hidden" name="message" value="${message }">
<!-- 리스트 검색파라미터 end -->

<table width="800" border="0" cellpadding="0" cellspacing="0">
	<tr>
    	<td height="43"><img src="/img/sugeo_title.gif" width="800" height="43"></td>
  	</tr>
  	<tr>
		<td align="center">
	    	<table width="780" border="0" cellspacing="0" cellpadding="0">
				<tr>
		        	<td height="40" align="right">
					<!--상단 기안문상신,도움말 메뉴-->
						<!-- table border="0" cellspacing="0" cellpadding="0">
				          	<tr>
				            <td height="8" colspan="2"></td>
				          	</tr>
				          	<tr>
				            <td><a href="#"><img src="/img/report_icon.gif" alt="기안문 상신11" width="92" height="18" border="0"></a></td>
				            <td><a href="#"><img src="/img/help_icon.gif" alt="도움말" width="65" height="18" border="0"></a></td>
				          	</tr>
				        </table-->
					<!--상단 기안문상신,도움말 메뉴-->		
					</td>
				</tr>
		       
				
				<tr>
					<td align="right" class="sub_table_b">관리번호 : ${mul_no}</td>
				</tr>
				
				<tr>
					<td align="left">
			          	<tr>
			  				<td>
			  				<iframe width="100%" height="100%" name="tab1" frameborder="0" onload="iFrameResize(this)" scrolling="no" src="/gapan/sugeo/sugeo_view.do?mul_no=${mul_no }"></iframe>
			  				</td>
			          	</tr>
					</td>
				</tr>
				<!-- tr>
					<td height="40" align="right">
						<img src="/img/mod_icon5.gif" alt="수정" border="0" onClick="javascript:RegisterPrc();" style="CURSOR:hand">
					</td>
				</tr-->
			      
				<tr>
					<td height="30"></td>
				</tr>
			 
				<tr>
			        <td align="left">
				        <tr>
			  				<td>
			  				<iframe width="100%" height="100%" name="tab2" frameborder="0" onload="iFrameResize(this)" scrolling="no" src="/gapan/sugeo/sugeo_bugwa_view.do?mul_no=${mul_no }"></iframe>
			  				</td>
			          	</tr>
					</td>
				</tr>
			
				<tr>
					<td height="40" align="right">
						<img src="/img/list_icon.gif" alt="리스트" border="0" onClick="Search()" style="CURSOR:hand">
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
	
	function InitPage()
	{
		var obj = document.form.message.value;
		
		if(obj != "")	
			alert(obj);
			return;
	}
</script>
</html>