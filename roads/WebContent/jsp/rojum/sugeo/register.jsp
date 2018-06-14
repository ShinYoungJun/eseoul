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


	// 수거정보, 물품  전체저장
	function	RegisterPrc()
	{
		var form = document.form;
		
		var	result	= tab1.RegisterPrc_tab1();		
		//var	result	= tab1.DataCheck();
		
		// 필수 항목이 비어 있으면 ..
		if(result	==	false ){
			return;
		}		
		
		form.CHG_ORG.value = tab1.document.form.CHG_ORG.value;
		form.CHG_NM.value = tab1.document.form.CHG_NM.value;
		form.REM_DATE.value = tab1.document.form.REM_DATE.value;

		form.REM_DATE_HH.value = tab1.document.form.REM_DATE_HH.value;
		form.REM_DATE_MM.value =tab1.document.form.REM_DATE_MM.value;
		
		form.REM_BJCD.value = tab1.document.form.REM_BJCD.value;
		form.REM_HJCD.value = tab1.document.form.REM_HJCD.value;
		form.REM_SPCCD.value = tab1.document.form.REM_SPCCD.value;
		form.REM_BONBUN.value = tab1.document.form.REM_BONBUN.value;
		form.REM_BUBUN.value = tab1.document.form.REM_BUBUN.value;
		form.REM_MULCD.value = tab1.document.form.REM_MULCD.value;
		form.REM_MULNM.value = tab1.document.form.REM_MULNM.value;
		form.REM_AREA.value = tab1.document.form.REM_AREA.value;
		form.REM_SVFROM.value = tab1.document.form.REM_SVFROM.value;
		form.REM_SVTO.value = tab1.document.form.REM_SVTO.value;
		form.REM_SVPLACE.value = tab1.document.form.REM_SVPLACE.value;
		form.REM_ADDR_INFO.value = tab1.document.form.REM_ADDR_INFO.value;
		form.REM_BAD_YN.value = tab1.document.form.REM_BAD_YN.value;
		form.REM_BAD_BIGO.value = tab1.document.form.REM_BAD_BIGO.value;
		form.REM_BIGO.value = tab1.document.form.REM_BIGO.value;
		form.REM_OWNER_NM.value = tab1.document.form.REM_OWNER_NM.value;
		form.REM_OWNER_SSN.value = tab1.document.form.REM_OWNER_SSN1.value+tab1.document.form.REM_OWNER_SSN2.value;
		form.REM_OWNER_ZIP.value = tab1.document.form.REM_OWNER_ZIP.value;
		form.REM_OWNER_ADDR1.value = tab1.document.form.REM_OWNER_ADDR1.value;
		form.REM_OWNER_ADDR2.value = tab1.document.form.REM_OWNER_ADDR2.value;
		form.REM_OWNER_TEL.value = tab1.document.form.REM_OWNER_TEL.value;
		form.REM_OWNER_HP.value = tab1.document.form.REM_OWNER_HP.value;

		form.TAX_SET.value = tab1.document.form.TAX_SET.value;

		
	
		
		
		if( confirm("저장  하시겠습니까? ") ){
			//top.frames[1].location="/jsp/menu/left/gapan.jsp?MENU_PARAM=sugeo";	//왼쪽 메뉴 링크
			//top.frames[2].location="sugeo_registerprc.do";		//오른쪽 페이지 링크
			//form.action = "/gapan/sugeo/search.do";					// 수거및처리 페이지로 이동해야함 
			form.action = "/rojum/sugeo/sugeo_registerprc.do";
			form.submit();
		}
		
	}
	
	
	function RegisterPrc_bugwa()
	{
		var result = tab1.RegisterPrc_bugwa();
	
		//	필수 항목이 비어 있으면 ..
		if(result == false)
			return;

		var form = document.form;

		top.frames[1].location="/jsp/menu/left/rojum.jsp?MENU_PARAM=sugeo";	//왼쪽 메뉴 링크
		//top.frames[2].location="/jumyong/search.do";		//오른쪽 페이지 링크
		form.action = "/jsp/rojum/sugeo/search.jsp";					// 수거및처리 페이지로 이동
		form.submit();
	
	
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
<!-- 리스트 검색파라미터 start -->
<input type="hidden" name="rem_date_from" value="${param.rem_date_from }">
<input type="hidden" name="rem_date_to" value="${param.rem_date_to }">
<input type="hidden" name="rem_mulcd_search" value="${param.rem_mulcd_search }">
<input type="hidden" name="rem_mulnm_search" value="${param.rem_mulnm_search }">
<input type="hidden" name="rem_bjcd_search" value="${param.rem_bjcd_search }">
<input type="hidden" name="rem_addr_search" value="${param.rem_addr_search }">
<input type="hidden" name="rem_nm_search" value="${param.rem_nm_search }">
<!-- 리스트 검색파라미터 end -->


<!-- iframe 값 submit 하기위한 hidden값 -->

<!-- 담당자 정보 -->
<input type="hidden" name="CHG_ORG">
<input type="hidden" name="CHG_NM">
<!-- 시설물 정보 -->
<input type="hidden" name="REM_DATE">
<input type="hidden" name="REM_DATE_HH">
<input type="hidden" name="REM_DATE_MM">
<input type="hidden" name="REM_GUCD">
<input type="hidden" name="REM_BJCD">
<input type="hidden" name="REM_HJCD">
<input type="hidden" name="REM_SPCCD">
<input type="hidden" name="REM_BONBUN">
<input type="hidden" name="REM_BUBUN">
<input type="hidden" name="REM_MULCD">
<input type="hidden" name="REM_MULNM">
<input type="hidden" name="REM_AREA">
<input type="hidden" name="REM_SVFROM">
<input type="hidden" name="REM_SVTO">
<input type="hidden" name="REM_SVPLACE">
<input type="hidden" name="REM_ADDR_INFO">
<input type="hidden" name="REM_BAD_YN">
<input type="hidden" name="REM_BAD_BIGO">
<input type="hidden" name="REM_BIGO">
<input type="hidden" name="TAX_SET">

<!-- 소유자 정보 -->
<input type="hidden" name="REM_OWNER_NM">
<input type="hidden" name="REM_OWNER_SSN">
<input type="hidden" name="REM_OWNER_ZIP">
<input type="hidden" name="REM_OWNER_ADDR1">
<input type="hidden" name="REM_OWNER_ADDR2">
<input type="hidden" name="REM_OWNER_TEL">
<input type="hidden" name="REM_OWNER_HP">






</form>

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
					<td align="left">
			          	<tr>
			  				<td>
			  				<iframe width="100%" height="100%" name="tab1" frameborder="0" onload="iFrameResize(this)" scrolling="no" src="/rojum/sugeo/sugeo_register.do"></iframe>
			  				</td>
			          	</tr>
					</td>
				</tr>
				<tr>
					<td height="40" align="right">
						<img src="/img/save_icon.gif" alt="전체저장" border="0" onClick="javascript:RegisterPrc();" style="CURSOR:hand">
						<img src="/img/list_icon.gif" alt="리스트" border="0" onClick="Search()" style="CURSOR:hand">
					</td>
				</tr>
			      
				<tr>
					<td height="30"></td>
				</tr>
			 
				<tr>
			        <td align="left">
				        <tr>
			  				<td>
			  				<!-- 처음 등록시 부과정보는 입력 못함 -->
			  				<!--  
			  				<iframe width="100%" height="100%" name="tab2" frameborder="0" onload="iFrameResize(this)" scrolling="no" src="/gapan/sugeo/sugeo_bugwa_register.do"></iframe>
			  				 -->
			  				</td>
			          	</tr>
					</td>
				</tr>
			
				<!-- tr>
					<td height="40" align="right">
						<img src="/img/list_icon.gif" alt="리스트" border="0" onClick="Search()" style="CURSOR:hand">
					</td>
				</tr -->
				
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
</script>
</html>