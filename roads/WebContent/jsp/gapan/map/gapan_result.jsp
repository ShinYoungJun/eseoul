<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ include file="/jsp/common/loginCheck.jsp"%>
<%@ include file="/jsp/common/include.jsp"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=euc-kr" />
<title>::::: ����� ������������ý��� :::::</title>
<link href="/css/Mroads.css" rel="stylesheet" type="text/css">
</head>
<body>
<c:choose>
<c:when test="${gapanNo == ''}">
<br>
<br>
<font style='font-family: ����;font-size: 12px;color: gray;'>&nbsp;&nbsp;&nbsp;�������� Ȯ���� �������� Ŭ���ϼ���.</font>
</c:when>
<c:otherwise>
<table width="100%" border="0" cellspacing="0" cellpadding="0">
	<tr>
		<td>
		<table width="235px" border="1" bordercolor="#c9dfed" style="border-collapse: collapse;" cellpadding="0" cellspacing="0" class="sub_table">
			<tr>
				<td width="70"  height="26" align="center" bgcolor="e5eff8" class="sub_table_b">������ȣ</td>
				<td bgcolor="eaeaea" class="table_bl_left">${gapanNo}</td>
			</tr>
			<tr>
				<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">��ڸ�</td>
				<td bgcolor="eaeaea" class="table_bl_left">${board.OWNER_NAME}</td>
			</tr>
			<tr>
				<td height="26"  align="center" bgcolor="e5eff8" class="sub_table_b">��ȭ��ȣ</td>
				<td bgcolor="eaeaea" class="table_bl_left">${board.OWNER_TEL}
				</td>
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
				<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">����������</td>
				<td bgcolor="eaeaea" class="table_bl_left">
					${board.ADDR}
				</td>
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
</c:otherwise>
</c:choose>
</body>
</html>