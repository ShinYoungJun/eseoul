<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ include file="/jsp/common/include.jsp"%>
<%@ include file="/jsp/common/loginCheck.jsp" %>

<html xmlns:x="urn:schemas-microsoft-com:office:excel">
<head>
<title>::::: ����� ������������ý��� :::::</title>
<!--[if gte mso 9]><xml>
<x:ExcelWorkbook><x:ExcelWorksheets><x:ExcelWorksheet>
<x:Name>Sheet1</x:Name>
<x:WorksheetOptions><x:Panes><x:Pane>
</x:Pane></x:Panes></x:WorksheetOptions>
</x:ExcelWorksheet></x:ExcelWorksheets></x:ExcelWorkbook>
</xml><![endif]-->
</head>

<body>

<%
	response.setContentType("application/vnd.ms-excel; charset=euc-kr");
 	response.setHeader("Content-Disposition", "filename=�μ��ڵ�.xls"); 
 	response.setHeader("Content-Description", "JSP Generated Data"); 
%>

<table width="800" border="0" cellpadding="0" cellspacing="0">
	<tr onMouseOver="this.style.backgroundColor='#f6f7f8'"
		onMouseOut="this.style.backgroundColor=''">
		<td width="15%" height="28" align="center" bgcolor="e5eff8"
			class="sub_table_b">����ڵ�</td>
		<td width="15%" height="28" align="center" bgcolor="e5eff8"
			class="sub_table_b">�����</td>
		<td width="15%" height="28" align="center" bgcolor="e5eff8"
			class="sub_table_b">�μ��ڵ�</td>
		<td width="15%" height="28" align="center" bgcolor="e5eff8"
			class="sub_table_b">�μ���</td>				
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
</body>
</html>

