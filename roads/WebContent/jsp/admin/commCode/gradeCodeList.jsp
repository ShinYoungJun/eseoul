<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR" %>
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
-->
</style>
<link href="/css/roads.css" rel="stylesheet" type="text/css">
</head>

<script language="javascript" src="/js/common.js"></script> 
<script type="text/javascript">
//<![CDATA[
	           
	function  reSearch()
	{
		var w = document.listForm;
		
		w.action = "/admin/commCode/gradeCode.do";	
		w.submit();	
	}
	
	function  fn_detailInfo(cd,nm)
	{
		document.getElementById("code").value = cd;	
		document.getElementById("codeName").value = nm;	
	}
	
	function  fn_modifyInfo()
	{	
		var w = document.listForm;
		
		document.getElementById("modeType").value = "edit";	
		w.action = "/admin/commCode/modifyGradeCode.do";	
		w.submit();	
	}
	
	function  fn_deleteInfo()
	{	
		if(!confirm("삭제하시겠습니까?"))
			return;
		
		var w = document.listForm;
		w.action = "/admin/commCode/deleteGradeCode.do";
		w.submit();	
	}
	
	//숫자만 입력
	function onlyNumberInput()
	{	
		var code = window.event.keyCode;
	
	 	if ((code > 34 && code < 41) || (code > 47 && code < 58) || (code > 95 && code < 106) || code == 8 || code == 9 || code == 13 || code == 46)
	 	{
		  	window.event.returnValue = true;
			return;
	 	}else {	 
	 		window.event.returnValue = false;
	 		return;
 	 	}
	}

	/*
	 *	통합검색 key down function (엔터키가 입력되면 검색함수 호출)
	 */
	function checkKeySearch()
	{
		if(event.keyCode == KEY_ENTER)
			reSearch();
	}
		
//]]>
</script>

<body>
<form name="listForm" method="post">
<input name="modeType" id="modeType" type="hidden" >
<table width="800" border="0" cellpadding="0" cellspacing="0">
	<tr>
		<td height="43"><img src="/img/admin_cont3_title.gif"
			width="800" height="43"></td>
	</tr>
	<tr>
		<td align="center">
		<table width="780" border="0" cellspacing="0" cellpadding="0">
<!--			<tr>
				<td height="40" align="right">
				<table border="0" cellspacing="0" cellpadding="0">
					<tr>
						<td height="8"></td>
					</tr>
					<tr>
						<td><a href="#"><img src="/img/help_icon.gif" alt="도움말"
							width="65" height="18" border="0"></a></td>
					</tr>
				</table>
				</td>
			</tr>
-->			<tr>
				<td height="1" bgcolor="eaeaea"></td>
			</tr>
			<tr>
				<td height="14"></td>
			</tr>
		</table>

		<table width="780" border="0" cellspacing="0" cellpadding="0">
			<tr>
				<td align="left" height="22" background="/img/tab_line_blue.gif">
				<table border="0" cellspacing="0" cellpadding="0">
					<tr>
						<td width="111"><a href="/admin/commCode/areaCode.do"><img
							src="/img/sub_admin_title4_off.gif" alt="지역코드" width="110"
							height="22" border="0"></a></td>
						<td  width="111"><a href="/admin/commCode/orgCode.do"><img
							src="/img/sub_admin_title5_off.gif" alt="부서코드" width="110"
							height="22" border="0"></a></td>
						<td width="111"><a href="/admin/commCode/purposeCode.do"><img
							src="/img/sub_admin_title6_off.gif" alt="점용목적코드" width="110"
							height="22" border="0"></a></td>
						<td width="111"><a href="/admin/commCode/taxCode.do"><img
							src="/img/sub_admin_title7_off.gif" alt="과세구분코드" width="110"
							height="22" border="0"></a></td>
						<!--  //********** BEGIN_현진_20120315 -->
						<!-- 
						<td width="111"><a href="/jsp/admin/commCode/zipCodeList.jsp"><img
							src="/img/sub_admin_title8_off.gif" alt="우편번호코드" width="110"
							height="22" border="0"></a></td>
						-->
						<td width="111"><a href="/admin/commCode/seal.do"><img
							src="/img/sub_admin_seal_off.gif" alt="직인등록" width="110"							         
							height="22" border="0"></a></td>
						<!--   //********** END_현진_20120315 -->
						<td width="111"><a href="/admin/commCode/jojungCode.do"><img
							src="/img/sub_admin_title9_off.gif" alt="조정계수" width="110"
							height="22" border="0"></a></td>
						<td width="111"><a href="#"><img
							src="/img/sub_admin_title12_on.gif" alt="등급코드" width="110"
							height="22" border="0"></a></td>
						<td width="111"><a href="/admin/commCode/officeCode.do"><img
							src="/img/sub_admin_title13_off.gif" alt="업체코드" width="110"
							height="22" border="0"></a></td>							
					</tr>
				</table>
				</td>
			</tr>
			<tr>
				<td align="left" class="contborder_blue">
				<table width="100%" border="0" cellspacing="0" cellpadding="0">

					<tr>
						<td width="48%" valign="top">
						<table width="100%" border="1" bordercolor="#c9dfed"
							style="border-collapse:collapse;" cellpadding="0" cellspacing="0"
							class="sub_table">
							<tr>
								<td height="35" colspan="2" bgcolor="#FFFFFF"
									class="table_bl_left">
								<table border="0" cellpadding="0" cellspacing="0"
									class="sub_stan">
									<tr>
										<td width="70" align="center" class="sub_table_b">등급명</td>
										<td><input name="gradeName" type="text"  
											class="input_form1" style="width:120px;" value="${gradeName}" onKeyDown="javascript:checkKeySearch();" ></td>
										<td><a href="#"><img src="/img/inquiry_icon2.gif"
											alt="조회" width="56" height="18" border="0" onClick="javascript:reSearch();"></a></td>
									</tr>      
								</table>
								</td>
							</tr>
							<tr>             
								<td width="20%" height="28" align="center" bgcolor="e5eff8"
									class="sub_table_b">코드ID</td>
								<td align="center" bgcolor="e5eff8" class="sub_table_b">코드명</td>
							</tr>
							<input name="listSize" id="listSize" value="${listSize}" type="hidden">
							<c:forEach items="${gradeCodelist}" var="gradeCode" varStatus="idx">
								 <tr onMouseOver="this.style.backgroundColor='#f6f7f8'" onMouseOut="this.style.backgroundColor=''">
										
									<td height="26" align="center"><a href="#" class="inqu" onClick="javascript:fn_detailInfo('${gradeCode.GRADE_CODE}','${gradeCode.GRADE_NAME}')">${gradeCode.GRADE_CODE}</a></td>
									<td align="center"><a href="#" class="inqu" onClick="javascript:fn_detailInfo('${gradeCode.GRADE_CODE}','${gradeCode.GRADE_NAME}')">${gradeCode.GRADE_NAME}</a></td>								
								</tr>
							</c:forEach>

						</table>

						</td>
						<td width="4%"></td>
						<td width="48%" valign="top">
						
						<table width="100%" border="1" bordercolor="#c9dfed"
							style="border-collapse:collapse;" cellpadding="0" cellspacing="0"
							class="sub_table">
							<tr>
								<td width="20%" height="28" align="center" bgcolor="e5eff8"
									class="sub_table_b">코드</td>
								<td height="28" colspan="3" bgcolor="eaeaea"
									class="table_bl_left">
								<table border="0" cellpadding="0" cellspacing="0"
									class="sub_stan">
									<tr>
										<td width="40"><input name="code"
											type="text" class="input_form1" style="width:30px;IME-MODE:disabled"
											value="" onKeyDown="onlyNumberInput();"></td>
										<td><input name="codeName" type="text"
											class="input_form1" style="width:230px" value=""></td>
									</tr>
								</table>
								</td>
							</tr>
							<table align=right>
							<tr><td height=5></td></tr>
							<tr>
								<td><img src="/img/save_icon2.gif"
									alt="저장" width="56" height="18" border="0" onClick="javascript:fn_modifyInfo();" style="cursor:pointer"></td>
								
								<td><img src="/img/del_icon.gif"
									alt="삭제" width="34" height="18" border="0" onClick="javascript:fn_deleteInfo();" style="cursor:pointer";></td>	
							</tr>
							</table>							
						</table>
						</td>
					</tr>

				</table>
				</td>
			</tr>

		</table>
		</td>
	</tr>
</table>

</form>
</body>
</html>

