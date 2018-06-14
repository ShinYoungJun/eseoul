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
		w.action = "/admin/commCode/areaCode.do";		
		w.submit();	
	}

	function initPage(){
	
		if(document.getElementById("fromDate").value == "")
			document.getElementById("fromDate").value = strToday();
			
		if(document.getElementById("toDate").value == "")
			document.getElementById("toDate").value = strToday();
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
						<td width="111"><a href="#"><img
							src="/img/sub_admin_title4_on.gif" alt="지역코드" width="110"
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
				<td align="center" class="contborder_blue">
				<table width="100%" border="0" cellspacing="0" cellpadding="0">
					<tr>
						<td align="left">
						<table width="100%" border="1" bordercolor="#c9dfed"
							style="border-collapse:collapse;" cellpadding="0" cellspacing="0"
							class="sub_table">
							<tr>
								<td width="15%" height="28" align="center" bgcolor="e5eff8"
									class="sub_table_b">시군구명</td>
								<td bgcolor="eaeaea" class="table_bl_left"><input
									name="guName" type="text" class="input_form1"
									style="width:160px" value="${guName}" onKeyDown="javascript:checkKeySearch();"></td>
								<td width="15%" align="center" bgcolor="e5eff8"
									class="sub_table_b">읍면동명</td>
								<td bgcolor="eaeaea" class="table_bl_left"><input
									name="hdName" type="text" class="input_form1"
									style="width:160px" value="${hdName}" onKeyDown="javascript:checkKeySearch();"></td>
							</tr>
						</table>
						</td>
					</tr>
					<tr>
						<td height="40" align="right"><a href="#"><img
							src="/img/inquiry_icon2.gif" alt="조회" width="56" height="18"
							border="0" onClick="javascript:reSearch();"></a></td>
					</tr> 
					<tr>
						<td height="1" bgcolor="#EAEAEA"></td>
					</tr>
					<tr>
					     <td height="34" class="sub_stan" align="left">전체건수 : <span class="sub_stan_blue">${totalCount}</span> 건 </td>
					</tr>
					<tr>
						<td align="left">
						<table width="100%" border="1" bordercolor="#c9dfed"
							style="border-collapse:collapse;" cellpadding="0" cellspacing="0"
							class="sub_table">
							<tr>
								<td height="28" align="center" bgcolor="e5eff8"
									class="sub_table_b">시도코드</td>
								<td align="center" bgcolor="e5eff8" class="sub_table_b">시도명</td>
								<td align="center" bgcolor="e5eff8" class="sub_table_b">시군구코드</td>
								<td align="center" bgcolor="e5eff8" class="sub_table_b">시군구명</td>
								<td align="center" bgcolor="e5eff8" class="sub_table_b">읍면동코드</td>
								<td align="center" bgcolor="e5eff8" class="sub_table_b">읍면동명</td>
								<td align="center" bgcolor="e5eff8" class="sub_table_b">생성일자</td>
								<td align="center" bgcolor="e5eff8" class="sub_table_b">말소일자</td>
							</tr>
							<c:forEach items="${areaCodelist}" var="areaCode" varStatus="idx">
								 <tr onMouseOver="this.style.backgroundColor='#f6f7f8'" onMouseOut="this.style.backgroundColor=''">
							
									<td height="26" align="center">${areaCode.SI_CD}</td>
									<td align="center">${areaCode.SI_NM}</td>
									<td align="center">${areaCode.GU_CD}</td>
									<td align="center">${areaCode.GU_NM}</td>
									<td align="center">${areaCode.HJ_CD}</td>
									<td align="center">${areaCode.HJ_NM}</td>
									<td align="center">-</td>
									<td align="center">-</td>										
									</tr>
							</c:forEach>
						</table>
						</td>
					</tr>
					<tr>
						<td height="40" align="center">
						<table width="100%" border="0" cellspacing="0" cellpadding="0">
							<tr>
								<td align="center">
								<table border="0" cellpadding="0" cellspacing="0">
									<tr>
										<!-- 페이징시작 -->${strPageDivideForm}<!-- 페이징끝 -->	
									</tr>
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
		</td>
	</tr>
</table>
</form>
</body>
</html>

