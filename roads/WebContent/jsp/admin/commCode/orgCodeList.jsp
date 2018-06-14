<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
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

<script language="javascript" src="/js/PopupCalendar.js"></script>
<script language="javascript" src="/js/common.js"></script>
<script type="text/javascript">
//<![CDATA[
	           
	function  reSearch()
	{
		var w = document.listForm;
	
		w.excel.value = "";
		w.action = "/admin/commCode/orgCode.do";		
		w.submit();	
	}
	
	function  excel_reSearch()
	{
		var w = document.listForm;
	
		w.excel.value = "Y";
		w.action = "/admin/commCode/orgCode.do";		
		w.submit();	
	}
	
	/*
	 *	통합검색 key down function (엔터키가 입력되면 검색함수 호출)
	 */
	function checkKeySearch(){
		if(event.keyCode == KEY_ENTER)
			reSearch();
	}
	
//]]>
</script>

<body>
<form name="listForm">
<input type="hidden" name="excel" value="">
<table width="800" border="0" cellpadding="0" cellspacing="0">
	<tr>
		<td height="43"><img src="/img/admin_cont3_title.gif" width="800"
			height="43"></td>
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
				<</td>
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
						<td width="111"><a
							href="/admin/commCode/areaCode.do"><img
							src="/img/sub_admin_title4_off.gif" alt="지역코드" width="110"
							height="22" border="0"></a></td>
						<td width="111"><a
							href="#"><img
							src="/img/sub_admin_title5_on.gif" alt="부서코드" width="110"
							height="22" border="0"></a></td>
						<td width="111"><a
							href="/admin/commCode/purposeCode.do"><img
							src="/img/sub_admin_title6_off.gif" alt="점용목적코드" width="110"
							height="22" border="0"></a></td>
						<td width="111"><a href="/admin/commCode/taxCode.do"><img
							src="/img/sub_admin_title7_off.gif" alt="과세구분코드" width="110"
							height="22" border="0"></a></td>
						<td width="111"><a href="/jsp/admin/commCode/zipCodeList.jsp"><img
							src="/img/sub_admin_title8_off.gif" alt="우편번호코드" width="110"
							height="22" border="0"></a></td>
						<td width="111"><a
							href="/admin/commCode/jojungCode.do"><img
							src="/img/sub_admin_title9_off.gif" alt="조정계수" width="110"
							height="22" border="0"></a></td>
						<td width="111"><a href="/admin/commCode/gradeCode.do"><img
							src="/img/sub_admin_title12_off.gif" alt="등급코드" width="110"
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
						<td>
						<table width="100%" border="1" bordercolor="#c9dfed"
							style="border-collapse:collapse;" cellpadding="0" cellspacing="0"
							class="sub_table">
							<tr>
								<td height="35" colspan="7" bgcolor="f2f2f2"
									class="table_bl_left">
								<table border="0" cellpadding="0" cellspacing="0"
									class="sub_stan">
									<tr>
										<td width="120" align="center" class="sub_table_b">기관명</td>
										<td><input name="guNm" type="text" class="input_form1"
											style="width:200px" value="${guNm}" onKeyDown="javascript:checkKeySearch();" ></td>
										<td><a href="#"><img src="/img/inquiry_icon2.gif"
											alt="조회" width="56" height="18" border="0"
											onClick="javascript:reSearch('N');"></a></td>
										<td width="10">&nbsp;</td>
									</tr>
								</table>
								</td>
							</tr>
							<tr onMouseOver="this.style.backgroundColor='#f6f7f8'"
								onMouseOut="this.style.backgroundColor=''">
								<td width="15%" height="28" align="center" bgcolor="e5eff8"
									class="sub_table_b">기관코드</td>
								<td width="15%" height="28" align="center" bgcolor="e5eff8"
									class="sub_table_b">기관명</td>
								<td width="15%" height="28" align="center" bgcolor="e5eff8"
									class="sub_table_b">부서코드</td>
								<td width="15%" height="28" align="center" bgcolor="e5eff8"
									class="sub_table_b">부서명</td>				
							</tr>
							<c:forEach items="${orgCodelist}" var="orgCode"
								varStatus="idx">
								<tr onMouseOver="this.style.backgroundColor='#f6f7f8'"
									onMouseOut="this.style.backgroundColor=''">
									<td height="26" align="center">${orgCode.ORG_CD}</td>
									<td align="center">${orgCode.ORG_NM}</td>
									<td align="center">${orgCode.DEPT_CD}</td>
									<td align="center">${orgCode.DEPT_NM}</td>
								</tr>
							</c:forEach>
						</table>
						</td>
					</tr>
				</table>
				</td>
			</tr>
			<tr>
				<td height="40" align="right"><!-- <a href="#"><img
					src="/img/result_icon.gif" alt="결과 출력" width="74" height="22"
					border="0"></a>  -->	 
					<img src="/img/excel_icon.gif"
					alt="EXCEL 변환" width="94" height="22" border="0" onclick="javascript:excel_reSearch();" style="cursor:hand"></td>
			</tr>
		</table>
		</td>
	</tr>
</table>
</form>
</body>
</html>

