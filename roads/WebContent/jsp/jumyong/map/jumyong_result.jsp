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
<c:when test="${adminNo == ''}">
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
				<td width="70px"  height="22px" align="center" bgcolor="e5eff8" class="sub_table_b">������ȣ</td>
				<td bgcolor="eaeaea" class="table_bl_left" colspan="3">${board.ADMIN_NO}</td>
			</tr>
			<tr>
				<td height="22px" align="center" bgcolor="e5eff8" class="sub_table_b">�����θ�</td>
				<td bgcolor="eaeaea" class="table_bl_left"  colspan="3">${board.NAME}</td>
			</tr>
			<tr>
				<td height="22px"  align="center" bgcolor="e5eff8" class="sub_table_b">��ȭ��ȣ</td>
				<td bgcolor="eaeaea" class="table_bl_left"  colspan="3">${board.TEL}
				</td>
			</tr>
			<tr>
				<td height="22px" align="center" bgcolor="e5eff8" class="sub_table_b">����ּ�</td>
				<td bgcolor="eaeaea" class="table_bl_left"  colspan="3">${board.APPEAL_ADDR}</td>
			</tr>
			<tr>
				<td width="70px" height="22px" align="center" bgcolor="e5eff8" class="sub_table_b">��������</td>
				<td width="48px" bgcolor="eaeaea" class="table_bl_left">${board.TYPE_NAME}</td>
				<td width="70px" height="22px" align="center" bgcolor="e5eff8" class="sub_table_b">���뱸��</td>
				<td width="47px" bgcolor="eaeaea" class="table_bl_left">${board.SECTION_NAME}</td>
			</tr>
			<tr>
				<td height="22px" align="center" bgcolor="e5eff8" class="sub_table_b">���Ա���</td>
				<td bgcolor="eaeaea" class="table_bl_left"  colspan="3">${board.TAX_SET_NAME}</td>
			</tr>
			<tr>
				<td height="22px" align="center" bgcolor="e5eff8" class="sub_table_b">����������</td>
				<td bgcolor="eaeaea" class="table_bl_left"  colspan="3">${board.PLACE_ADDR}</td>
			</tr>
			<tr>
				<td height="22px" align="center" bgcolor="e5eff8" class="sub_table_b">��������</td>
				<td bgcolor="eaeaea" class="table_bl_left"  colspan="3">${board.ROAD_ADDR}</td>
			</tr>
			<tr>
				<td height="22px" align="center" bgcolor="e5eff8" class="sub_table_b">����Ⱓ</td>
				<td bgcolor="eaeaea" class="table_bl_left"  colspan="3">${board.PERIOD_DATE}</td>
			</tr>
			<tr>
				<td height="22px" align="center" bgcolor="e5eff8" class="sub_table_b">�������</td>
				<td bgcolor="eaeaea" class="table_bl_left"  colspan="3">${board.CLASS_NM}</td>
			</tr>
			<tr>
				<td height="22px" align="center" bgcolor="e5eff8" class="sub_table_b">�������</td>
				<td bgcolor="eaeaea" class="table_bl_left"  colspan="3">${board.AREA_SIZE} ��/��</td>
			</tr>
		</table>
		</td>
	</tr>
</table>
</c:otherwise>
</c:choose>
</body>
</html>