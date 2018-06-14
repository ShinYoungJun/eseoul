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
}
-->

</style>
<link href="/css/roads.css" rel="stylesheet" type="text/css">
</head>

<script language="javascript" src="/js/Ajax_request.js"></script>

<script type="text/javascript">
//<![CDATA[
           
	function 	Init()
	{
		parent.TabUp_Img("sanchul");

		var	adminno	= document.getElementById("GAPAN_NO").value;
		var	seq		= document.getElementById("SEQ").value;

		parent.BugwaView('${SEQ}');

	}
		
//]]>
</script>

<body onload="Init();">

<form id="form" name="form" method="post">
<input type="hidden" id="GAPAN_NO" name="GAPAN_NO" value="${GAPAN_NO}">
<input type="hidden" id="SEQ" name="SEQ" value="${SEQ}">
<input type="hidden" id="currentPage" name="currentPage" value="${currentPage}">
<table width="780" border="0" cellpadding="0" cellspacing="0">

	  <tr>
		<td align="left" class="contborder_blue">
		<table width="100%" border="0" cellspacing="0" cellpadding="0">
		<tr></tr><tr></tr>
		
		<tr>
		  <td><table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">

			  <tr>
				<td width="13%" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">기준년도</td>
				<td width="37%" bgcolor="eaeaea" class="table_bl_left">
					<input id="YEAR" type="text" class="view" style="width:100px" value="${board.YEAR}년" readonly>
				</td>
				<td width="14%" align="center" bgcolor="e5eff8" class="sub_table_b">공시지가 /<br/>시설물 가액</td>
				<td width="36%" bgcolor="eaeaea" class="table_bl_left">
					<input id="PRICE" type="text" class="view" style="width:100px" value="${rnic:insertComma2(board.PRICE)}" readonly>
				</td>
			  </tr>
			  
			  <tr>
				<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">점용면적</td>
				<td bgcolor="eaeaea" class="table_bl_left">
					<input id="AREA_AFTER" type="text" class="view" style="width:100px"  value="${board.AREA_AFTER}" readonly>
				</td>
				<td align="center" bgcolor="e5eff8" class="sub_table_b">요율/단가</td>
				<td bgcolor="eaeaea" class="table_bl_left">
					<input id="RATE" type="text" class="view" style="width:100px" value="${board.RATE}" readonly>
				</td>
			  </tr>
				  
			  <tr>
				<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">산출 기간</td>
				<td bgcolor="eaeaea" class="table_bl_left">
					<input id="SANCHUL_DATE" type="text" class="view" style="width:160px" value="${rnic:addDash(board.FROMDATE)} ~ ${rnic:addDash(board.TODATE)}" readonly>
				</td>
				<td align="center" bgcolor="e5eff8" class="sub_table_b">부과금액</td>
				<td bgcolor="eaeaea" class="table_bl_left">
					<input id="SUM_ADJUST" type="text" class="view" style="width:100px" value="${rnic:insertComma2(board.SUM_ADJUST)}" readonly>
				</td>
			  </tr>
			  
			  <tr>
				<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">산출식</td>
				<td colspan="3" bgcolor="eaeaea" class="table_bl_left" align="left">
					<input id="FORM_ADJUST" type="text" class="view" style="width:600px" value="${board.FORM_ADJUST}" readonly>
				</td>
			  </tr>
			  
		  </table></td>
		</tr>
		
	</table></td>
  </tr>

</table>
</form>

</body>
</html>