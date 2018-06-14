<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ include file="/jsp/common/loginCheck.jsp"%>
<%@ include file="/jsp/common/include.jsp"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=euc-kr" />
<title>::::: 서울시 도로점용관리시스템 :::::</title>
<link href="/css/Mroads.css" rel="stylesheet" type="text/css">
</head>
<body>
<c:choose>
<c:when test="${gapanNo == ''}">
<br>
<br>
<font style='font-family: 돋움;font-size: 12px;color: gray;'>&nbsp;&nbsp;&nbsp;상세정보를 확인할 보도상을 클릭하세요.</font>
</c:when>
<c:otherwise>
<table width="100%" border="0" cellspacing="0" cellpadding="0">
	<tr>
		<td>
		<table width="235px" border="1" bordercolor="#c9dfed" style="border-collapse: collapse;" cellpadding="0" cellspacing="0" class="sub_table">
			<tr>
				<td width="70"  height="26" align="center" bgcolor="e5eff8" class="sub_table_b">관리번호</td>
				<td bgcolor="eaeaea" class="table_bl_left">${gapanNo}</td>
			</tr>
			<tr>
				<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">운영자명</td>
				<td bgcolor="eaeaea" class="table_bl_left">${board.OWNER_NAME}</td>
			</tr>
			<tr>
				<td height="26"  align="center" bgcolor="e5eff8" class="sub_table_b">전화번호</td>
				<td bgcolor="eaeaea" class="table_bl_left">${board.OWNER_TEL}
				</td>
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
				<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">점용지지번</td>
				<td bgcolor="eaeaea" class="table_bl_left">
					${board.ADDR}
				</td>
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
</c:otherwise>
</c:choose>
</body>
</html>