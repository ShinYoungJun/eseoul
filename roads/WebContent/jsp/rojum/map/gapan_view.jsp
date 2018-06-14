<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

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

<script language='JavaScript' src='/js/Check_inputbox.js'></script>
<script language="javascript" src="/js/Ajax_request.js"></script>


<script type="text/javascript">
//<![CDATA[

	function	Page(page)
	{
		if(page	==	"")
			return;
		
		var form = document.form;
	
		form.action = "minwon_view.do?currentPage=" + page;
		form.submit();
	}

</script>

<body >
<table width="780" border="0" cellpadding="0" cellspacing="0">
<form name="form" method="post">
<input type="hidden" name="ADMIN_NO" value=${ADMIN_NO}>
<input type="hidden" name="SEQ" value="${SEQ}">

	  <tr>
		<td align="left" class="contborder_blue">
		<table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
				<tr>
				  <td height="28" bgcolor="e5eff8" class="sub_table_b" colspan="4" style="padding-left:7px">점용 상세정보 (관리번호 : ${GAPAN_NO})</td>
				</tr>
				<tr>
				  <td width="120" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">운영자명</td>
				  <td width="37%" bgcolor="eaeaea" class="table_bl_left">${board.OWNER_NAME}</td>
				  <td width="100" align="center" bgcolor="e5eff8" class="sub_table_b">전화번호</td>
				  <td width="36%" bgcolor="eaeaea" class="table_bl_left">${board.OWNER_TEL}, ${board.OWNER_HP}</td>
				</tr>
				<tr>
				  <td height="28" align="center" bgcolor="e5eff8" class="sub_table_b">운영자 실거주지</td>
				  <td width="37%" bgcolor="eaeaea" class="table_bl_left">${board.OWNER_TOADDR1} ${board.OWNER_TOADDR2} ${board.OWNER_TOJIBUN}</td><!--
				  <td align="center" bgcolor="e5eff8" class="sub_table_b">샐황정보</td>
				  <td width="36%" bgcolor="eaeaea" class="table_bl_left">${board.LC_SEL_NAME}</td>
				-->
				  <td align="center" bgcolor="e5eff8" class="sub_table_b">주변정보</td>
				  <td width="36%" bgcolor="eaeaea" class="table_bl_left">${board.WITH_INFO}</td>
				
				</tr>
				<tr>
				  <td height="28" align="center" bgcolor="e5eff8" class="sub_table_b">인접지 주소</td>
				  <td width="37%" bgcolor="eaeaea" class="table_bl_left">${board.SI_NM} ${board.GU_NM} ${board.BJ_NM} ${board.WITH_ADDR}</td><!--
				  <td align="center" bgcolor="e5eff8" class="sub_table_b">동업관계</td>
				  <td width="36%" bgcolor="eaeaea" class="table_bl_left">${board.PT_SEL_NAME}</td>				 
				-->
				  <td align="center" bgcolor="e5eff8" class="sub_table_b">수거일자</td>
				  <td width="36%" bgcolor="eaeaea" class="table_bl_left">${board.PICKUP_DATE}</td>
				</tr>
				<tr>
				  <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">점용면적</td>
				  <td bgcolor="eaeaea" class="table_bl_left">${board.PLACE}</td>
				  <td align="center" bgcolor="e5eff8" class="sub_table_b">시설규격</td>
				  <td width="36%" bgcolor="eaeaea" class="table_bl_left">${board.FACIL}</td>
	  			</tr>
				<tr>
				  <td height="28" align="center" bgcolor="e5eff8" class="sub_table_b">특화거리<br/></br>조성여부</td>
				  <c:choose>
					<c:when test="${board.CAR_TON == '1'}">
						<td width="37%" bgcolor="eaeaea" class="table_bl_left">조성</td>
					</c:when>
					<c:otherwise>
						<td width="37%" bgcolor="eaeaea" class="table_bl_left">미조성</td>					
					</c:otherwise>
				  </c:choose>
				  
				  <td align="center" bgcolor="e5eff8" class="sub_table_b">관리여부</td>
				  <c:choose>
					<c:when test="${board.MAINTN_OB == '1'}">
						<td width="36%" bgcolor="eaeaea" class="table_bl_left">관리대상</td>
					</c:when>
					<c:otherwise>
						<td width="36%" bgcolor="eaeaea" class="table_bl_left">정비대상</td>					
					</c:otherwise>
				  </c:choose>
				</tr>
				<tr>
				  <td height="28" align="center" bgcolor="e5eff8" class="sub_table_b">주류판매여부</td>
				  <c:choose>
					<c:when test="${board.LIQUOR_SL == '1'}">
						<td width="37%" bgcolor="eaeaea" class="table_bl_left">판매</td>
					</c:when>
					<c:otherwise>
						<td width="37%" bgcolor="eaeaea" class="table_bl_left">미판매</td>					
					</c:otherwise>
				  </c:choose>
				  <td align="center" bgcolor="e5eff8" class="sub_table_b">LPG사용여부</td>
				  <c:choose>
					<c:when test="${board.LPGAS_US == '1'}">
						<td width="37%" bgcolor="eaeaea" class="table_bl_left">사용</td>
					</c:when>
					<c:otherwise>
						<td width="37%" bgcolor="eaeaea" class="table_bl_left">미사용</td>					
					</c:otherwise>
				  </c:choose>
				</tr>

</table>

</body>
</html>