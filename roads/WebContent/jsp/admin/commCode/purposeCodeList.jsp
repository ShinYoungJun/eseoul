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
		w.excel.value = "";
		w.action = "/admin/commCode/purposeCode.do";	
		w.submit();	
	}
	
	function  excel_reSearch()
	{
		var w = document.listForm;
	
		w.excel.value = "Y";
		w.action = "/admin/commCode/purposeCode.do";		
		w.submit();	
	}
	
	function  fn_detailInfo(obj)
	{
		var w = document.listForm;
		document.getElementById("index").value = obj-1;	
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
	function checkKeySearch(){
		if(event.keyCode == KEY_ENTER)
			reSearch();
	}	
	
//]]>
</script>

<body>
<form name="listForm">
<input type="hidden" name="excel" value="">
<input name="index" id="index" type="hidden" >
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
						<td width="111"><a href="#"><img
							src="/img/sub_admin_title6_on.gif" alt="점용목적코드" width="110"
							height="22" border="0"></a></td>
						<td width="111"><a href="/admin/commCode/taxCode.do"><img
							src="/img/sub_admin_title7_off.gif" alt="과세구분코드" width="110"
							height="22" border="0"></a></td>
						<td width="111"><a href="/jsp/admin/commCode/zipCodeList.jsp"><img
							src="/img/sub_admin_title8_off.gif" alt="우편번호코드" width="110"
							height="22" border="0"></a></td>
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
										<td width="72"><select name="section" class="related"
											style="width:70px">
											${section}
										</select></td>
										<td><input name="codeName" type="text"  
											class="input_form1" style="width:70px;IME-MODE:disabled" value="${codeName}" onKeyDown="javascript:checkKeySearch();onlyNumberInput();" ></td>
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
							<c:forEach items="${purposeCodeList}" var="purposeCode" varStatus="idx">
								 <tr onMouseOver="this.style.backgroundColor='#f6f7f8'" onMouseOut="this.style.backgroundColor=''">
										
									<td height="50" align="center"><a href="#" class="inqu" onClick="javascript:fn_detailInfo()">${purposeCode.CODE}</a></td>
									<td align="center"><a href="#" class="inqu" onClick="javascript:fn_detailInfo(${idx.count})">${purposeCode.CLASS_NM}<br>${purposeCode.SORT_NM} <br> ${purposeCode.KIND_NM}</a></td>								
								</tr>
							</c:forEach>

						</table>

						</td>
						<td width="4%"></td>
						<td width="48%" valign="top">
						
						<form name="regForm">
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
											value="${purposeIndex.CODE}" onKeyDown="onlyNumberInput();"></td>
										<td><input name="codeName" type="text"
											class="input_form1" style="width:240px" value="${purposeIndex.SORT_NM}"></td>
									</tr>
								</table>
								</td>
							</tr>
							<tr>
								<td height="32" colspan="4" bgcolor="#FFFFFF"
									class="table_bl_left"><a href="#"><img
									src="/img/admin_tab1_on.gif" alt="코드일반정보" width="97"
									height="20" border="0"></a></td>
							</tr>
							<tr>
								<td height="26" align="center" bgcolor="#F3F8FC"
									class="sub_table_b">요율</td>
								<td colspan="3" bgcolor="f2f2f2" class="table_bl_left"><input
									name="yoyul" id="yoyul" type="text" class="input_form1"
									style="width:120px" value="${purposeIndex.YOYUL}"></td>
							</tr>
							<tr>
								<td height="26" align="center" bgcolor="#F3F8FC"
									class="sub_table_b">기간</td>
								<td colspan="3" bgcolor="f2f2f2" class="table_bl_left"><input
									name="textfield2222323223223" type="text" class="input_form1"
									style="width:120px" value="${purposeIndex.GIGAN}"></td>
							</tr>
							<tr>
								<td height="26" align="center" bgcolor="#F3F8FC"
									class="sub_table_b">단위</td>
								<td bgcolor="f2f2f2" class="table_bl_left"><input
									name="textfield2222323223224" type="text" class="input_form1"
									style="width:50px" value="${purposeIndex.DANWII}"></td>
								<td width="20%" align="center" bgcolor="#F3F8FC">점용료</td>
								<td bgcolor="f2f2f2" class="table_bl_left"><input
									name="textfield2222323223225" type="text" class="input_form1"
									style="width:80px" value="${purposeIndex.MOMEY}"></td>
							</tr>
							<tr>
								<td height="26" align="center" bgcolor="#F3F8FC"
									class="sub_table_b">상한가</td>
								<td colspan="3" bgcolor="f2f2f2" class="table_bl_left"><input
									name="textfield22223232232222" type="text" class="input_form1"
									style="width:120px" ></td>
							</tr>
							<tr>
								<td height="70" align="center" bgcolor="#F3F8FC"
									class="sub_table_b">감액율</td>
								<td colspan="3" bgcolor="f2f2f2" class="table_bl_left"><textarea
									name="textfield2222323223228" rows="4" class="input_form1"
									style="width:280px" ></textarea></td>
							</tr>
						</table>
						</form>
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
<script language="javascript">
<!--
	setSelectedOption(document.listForm.section, "${section}");
//-->
</script>
</form>
</body>
</html>

