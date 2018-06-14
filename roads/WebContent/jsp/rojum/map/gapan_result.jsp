<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=euc-kr" />
<title>::::: :::::</title>

<link href="/css/Mroads.css" rel="stylesheet" type="text/css">

</head>
<body>
<div id="search" name="search" style="display:none">
<img src='/img/mapImg/sing.gif'>
<font style='font-family: 돋움;font-size: 12px;color: gray;'>검색중입니다.</font>		
</div>
<div id="searchTable" name="searchTable" style="display:block">
<table width="100%" border="0" cellspacing="0" cellpadding="0">
	<tr>
		<td colspan="2" height="5" align="center" class="sub_table"><br>
		<b></b></td>
	</tr>
	<tr>
		<td>

		<table width="230" border="1" bordercolor="#c9dfed"
			style="border-collapse: collapse;" cellpadding="0" cellspacing="0"
			class="sub_table">
			<tr>
				<td width="70"  height="26" align="center" bgcolor="e5eff8"
					class="sub_table_b">관리번호</td>
				<td bgcolor="eaeaea" class="table_bl_left">${GAPAN_NO}</td>
			</tr>
			<tr>
				<td height="26" align="center" bgcolor="e5eff8"
					class="sub_table_b">운영자명</td>
				<td bgcolor="eaeaea" class="table_bl_left">${board.OWNER_NAME}</td>
			</tr>
			<tr>
				<td height="26"  align="center" bgcolor="e5eff8" class="sub_table_b">전화번호</td>
				<td bgcolor="eaeaea" class="table_bl_left">${board.OWNER_TEL}
				</td>
			</tr>
			<tr>
				<td height="26"  align="center" bgcolor="e5eff8" class="sub_table_b">핸드폰번호</td>
				<td bgcolor="eaeaea" class="table_bl_left">
				${board.OWNER_HP}</td>
			</tr>
			<tr>
				<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">운영자주소</td>
				<td bgcolor="eaeaea" class="table_bl_left">${board.OWNER_TOADDR1}
				${board.OWNER_TOADDR2} ${board.OWNER_TOJIBUN}</td>
			</tr>
			<tr>
				<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">주변정보</td>
				<td bgcolor="eaeaea" class="table_bl_left">${board.WITH_INFO}</td>

			</tr>
			<tr>
				<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">인접지주소</td>
				<td bgcolor="eaeaea" class="table_bl_left">
				${board.SI_NM} ${board.GU_NM} ${board.BJ_NM} ${board.WITH_ADDR}</td>
			</tr>
			<tr>

				<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">수거일자</td>
				<td bgcolor="eaeaea" class="table_bl_left">${board.PICKUP_DATE}</td>
			</tr>
			<tr>
				<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">점용면적</td>
				<td bgcolor="eaeaea" class="table_bl_left">${board.PLACE}</td>
			</tr>
			<tr>
				<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">시설규격</td>
				<td bgcolor="eaeaea" class="table_bl_left">${board.FACIL}</td>
			</tr>
			<tr>
				<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">특화거리</td>
				<c:choose>
					<c:when test="${board.CAR_TON == '1'}">
						<td bgcolor="eaeaea" class="table_bl_left">조성</td>
					</c:when>
					<c:otherwise>
						<td bgcolor="eaeaea" class="table_bl_left">미조성</td>
					</c:otherwise>
				</c:choose>
			</tr>
			<tr>
				<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">관리여부</td>
				<c:choose>
					<c:when test="${board.MAINTN_OB == '1'}">
						<td bgcolor="eaeaea" class="table_bl_left">관리대상</td>
					</c:when>
					<c:otherwise>
						<td bgcolor="eaeaea" class="table_bl_left">정비대상</td>
					</c:otherwise>
				</c:choose>
			</tr>
			<tr>
				<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">주류판매</td>
				<c:choose>
					<c:when test="${board.LIQUOR_SL == '1'}">
						<td bgcolor="eaeaea" class="table_bl_left">판매</td>
					</c:when>
					<c:otherwise>
						<td bgcolor="eaeaea" class="table_bl_left">미판매</td>
					</c:otherwise>
				</c:choose>
			</tr>
			<tr>
				
				<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">LPG사용</td>
				<c:choose>
					<c:when test="${board.LPGAS_US == '1'}">
						<td bgcolor="eaeaea" class="table_bl_left">사용</td>
					</c:when>
					<c:otherwise>
						<td bgcolor="eaeaea" class="table_bl_left">미사용</td>
					</c:otherwise>
				</c:choose>
			</tr>

		</table>

		</td>
	</tr>

</table>
</div>

</body>
</html>