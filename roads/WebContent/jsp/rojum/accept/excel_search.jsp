<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ include file="/jsp/common/loginCheck.jsp" %>
<%@ include file="/jsp/common/include.jsp"%>

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
 	response.setHeader("Content-Disposition", "filename=�Ÿ����԰���.xls"); 
 	response.setHeader("Content-Description", "JSP Generated Data"); 
%>

<table width="800" border="0" cellpadding="0" cellspacing="0">
     <tr>
		<td height="35px" width="120px" align="center" bgcolor="e5eff8" class="sub_table_b">������ȣ</td>
        <td width="100px" align="center" bgcolor="e5eff8" class="sub_table_b">���</td>
        <td width="140px" align="center" bgcolor="e5eff8" class="sub_table_b">������</td>
        <td width="80px" align="center" bgcolor="e5eff8" class="sub_table_b">����(��)</td>
        <td width="100px" align="center" bgcolor="e5eff8" class="sub_table_b">����/����</td>														
        <td width="120px" align="center" bgcolor="e5eff8" class="sub_table_b">�����</td>
        <td width="100px" align="center" bgcolor="e5eff8" class="sub_table_b">������</td>
        <td width="80px" align="center" bgcolor="e5eff8" class="sub_table_b">������</td>
     </tr>
                          
     <c:forEach items="${blist}" var="board" varStatus="idx">
		<tr height="26px" onMouseOver="this.style.backgroundColor='#f6f7f8'" onMouseOut="this.style.backgroundColor=''" style="cursor: pointer" onclick="rojum_History('${idx.count}');">
			<td width="100px" align="center">${board.GAPAN_NO}</td>
			<td width="100px" align="center">${board.OWNER_NAME}</td>
			<td width="140px" align="center">${board.ADDR}</td>
			<td width="80px" align="center">${board.PLACE_A}</td>
			<td width="100px" align="center">
				<c:choose>
				<c:when test="${board.MAINTN_OB == '1'}">
					�������
				</c:when>
				<c:otherwise>
					������
				</c:otherwise>
				</c:choose>
			</td>
			<td width="120px" align="center">
				<c:choose>
				<c:when test="${board.TAXTATION_AT == '1'}">
					�ΰ�
				</c:when>
				<c:otherwise>
					�̺ΰ�
				</c:otherwise>
				</c:choose>
			</td>
			<td width="100px" align="center">${rnic:addDash(board.PICKUP_DATE)}</td>
			<td width="80px" align="center">${board.PASS_DAY}</td>
		</tr>
	</c:forEach>

</table>
</body>
</html>

