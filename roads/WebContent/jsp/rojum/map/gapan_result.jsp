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
<font style='font-family: ����;font-size: 12px;color: gray;'>�˻����Դϴ�.</font>		
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
					class="sub_table_b">������ȣ</td>
				<td bgcolor="eaeaea" class="table_bl_left">${GAPAN_NO}</td>
			</tr>
			<tr>
				<td height="26" align="center" bgcolor="e5eff8"
					class="sub_table_b">��ڸ�</td>
				<td bgcolor="eaeaea" class="table_bl_left">${board.OWNER_NAME}</td>
			</tr>
			<tr>
				<td height="26"  align="center" bgcolor="e5eff8" class="sub_table_b">��ȭ��ȣ</td>
				<td bgcolor="eaeaea" class="table_bl_left">${board.OWNER_TEL}
				</td>
			</tr>
			<tr>
				<td height="26"  align="center" bgcolor="e5eff8" class="sub_table_b">�ڵ�����ȣ</td>
				<td bgcolor="eaeaea" class="table_bl_left">
				${board.OWNER_HP}</td>
			</tr>
			<tr>
				<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">����ּ�</td>
				<td bgcolor="eaeaea" class="table_bl_left">${board.OWNER_TOADDR1}
				${board.OWNER_TOADDR2} ${board.OWNER_TOJIBUN}</td>
			</tr>
			<tr>
				<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">�ֺ�����</td>
				<td bgcolor="eaeaea" class="table_bl_left">${board.WITH_INFO}</td>

			</tr>
			<tr>
				<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">�������ּ�</td>
				<td bgcolor="eaeaea" class="table_bl_left">
				${board.SI_NM} ${board.GU_NM} ${board.BJ_NM} ${board.WITH_ADDR}</td>
			</tr>
			<tr>

				<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">��������</td>
				<td bgcolor="eaeaea" class="table_bl_left">${board.PICKUP_DATE}</td>
			</tr>
			<tr>
				<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">�������</td>
				<td bgcolor="eaeaea" class="table_bl_left">${board.PLACE}</td>
			</tr>
			<tr>
				<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">�ü��԰�</td>
				<td bgcolor="eaeaea" class="table_bl_left">${board.FACIL}</td>
			</tr>
			<tr>
				<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">Ưȭ�Ÿ�</td>
				<c:choose>
					<c:when test="${board.CAR_TON == '1'}">
						<td bgcolor="eaeaea" class="table_bl_left">����</td>
					</c:when>
					<c:otherwise>
						<td bgcolor="eaeaea" class="table_bl_left">������</td>
					</c:otherwise>
				</c:choose>
			</tr>
			<tr>
				<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">��������</td>
				<c:choose>
					<c:when test="${board.MAINTN_OB == '1'}">
						<td bgcolor="eaeaea" class="table_bl_left">�������</td>
					</c:when>
					<c:otherwise>
						<td bgcolor="eaeaea" class="table_bl_left">������</td>
					</c:otherwise>
				</c:choose>
			</tr>
			<tr>
				<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">�ַ��Ǹ�</td>
				<c:choose>
					<c:when test="${board.LIQUOR_SL == '1'}">
						<td bgcolor="eaeaea" class="table_bl_left">�Ǹ�</td>
					</c:when>
					<c:otherwise>
						<td bgcolor="eaeaea" class="table_bl_left">���Ǹ�</td>
					</c:otherwise>
				</c:choose>
			</tr>
			<tr>
				
				<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">LPG���</td>
				<c:choose>
					<c:when test="${board.LPGAS_US == '1'}">
						<td bgcolor="eaeaea" class="table_bl_left">���</td>
					</c:when>
					<c:otherwise>
						<td bgcolor="eaeaea" class="table_bl_left">�̻��</td>
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