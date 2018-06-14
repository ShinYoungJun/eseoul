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
 	response.setHeader("Content-Disposition", "filename=���ŵ�Ϲ׻���.xls"); 
 	response.setHeader("Content-Description", "JSP Generated Data"); 
%>
<table width="780" border="0" cellpadding="0" cellspacing="0">
	<tr>
		<td width="100px" align="center" bgcolor="e5eff8" class="sub_table_b">������ȣ</td>
		<td width="80px" align="center" bgcolor="e5eff8" class="sub_table_b">��ϱ���</td>
		<td width="80px" align="center" bgcolor="e5eff8" class="sub_table_b">�ü�����</td>
		<td width="80px" align="center" bgcolor="e5eff8" class="sub_table_b">������</td>
		<td width="60px" align="center" bgcolor="e5eff8" class="sub_table_b">������</td>
		<td width="100px" align="center" bgcolor="e5eff8" class="sub_table_b">���</td>
		<td width="150px" align="center" bgcolor="e5eff8" class="sub_table_b">������</td>
		<td align="center" bgcolor="e5eff8" class="sub_table_b">��&nbsp;&nbsp;&nbsp;&nbsp;��</td>
		<td width="70px" align="center" bgcolor="e5eff8" class="sub_table_b">����(��)</td>
		<td width="60px" align="center" bgcolor="e5eff8" class="sub_table_b">�����</td>
		<td width="80px" align="center" bgcolor="e5eff8" class="sub_table_b">����/����</td>
		<td width="100px" align="center" bgcolor="e5eff8" class="sub_table_b">��������</td>
	</tr>
            
	<c:forEach items="${blist1}" var="board" varStatus="idx">	                      
	<tr>
		<td height="26px" width="100px" align="center">${board.ADMIN_NO}</td>
		<td width="80px" align="center">
			<c:choose>
			<c:when test="${board.PICKUP_YN == '1'}">
				����
			</c:when>
			<c:otherwise>
				��������
			</c:otherwise>
			</c:choose>
		</td>
		<td width="80px" align="center">
			${board.FT_TYP_NM}&nbsp;/&nbsp;${board.FT_SEL_NM}
		</td>
		<td width="80px" align="center">
			${rnic:addDash(board.PICKUP_DATE)}
		</td>
		<td width="60px" align="center">
			${board.PASS_DAY}
		</td>
		<td width="100px" align="center">${board.NAME}</td>
		<td width="150px" align="center">${board.ADDR}</td>
		<td align="center"><font color="red">${board.TOTAL_STATUS}</font></td>
		<td width="70px" align="center">${board.PLACE_A}</td>
		<td width="60px" align="center">
			<c:choose>
				<c:when test="${board.TAXTATION_AT == '1'}">
					�ΰ�
				</c:when>
				<c:otherwise>
					�̺ΰ�
				</c:otherwise>
			</c:choose>
		</td>
		<td width="80px" align="center">
			<c:choose>
				<c:when test="${board.MAINTN_OB == '1'}">
				�������
				</c:when>
				<c:otherwise>
				������
				</c:otherwise>
			</c:choose>
		</td>
		<td width="100px" align="center">${rnic:addDash(board.UP_DATE)}</td>             
	</tr>
	</c:forEach>
</table>
</body>
</html>