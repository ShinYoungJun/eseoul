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
 	response.setHeader("Content-Disposition", "filename=�ΰ�����.xls"); 
 	response.setHeader("Content-Description", "JSP Generated Data"); 
%>

<table width="800" border="0" cellpadding="0" cellspacing="0">
     <tr>
		<td width="100px" align="center" bgcolor="e5eff8" class="sub_table_b">������ȣ</td>
        <td width="40px" align="center" bgcolor="e5eff8" class="sub_table_b">�⵵</td>
        <td width="60px" align="center" bgcolor="e5eff8" class="sub_table_b">������ȣ</td>
        <td width="60px" align="center" bgcolor="e5eff8" class="sub_table_b">�ΰ�����</td>
        <td width="60px" align="center" bgcolor="e5eff8" class="sub_table_b">��������</td>
        <td width="100px" align="center" bgcolor="e5eff8" class="sub_table_b">������</td>
        <td width="100px" align="center" bgcolor="e5eff8" class="sub_table_b">������</td>
        <td width="60px" align="center" bgcolor="e5eff8" class="sub_table_b">��������</td>
        <td width="110px" align="center" bgcolor="e5eff8" class="sub_table_b">�������</td>
        <td width="180px" align="center" bgcolor="e5eff8" class="sub_table_b">�����ڵ�</td>
        <td width="100px" align="center" bgcolor="e5eff8" class="sub_table_b">�ǰ��������</td>
        <td width="150px"  align="center" bgcolor="e5eff8" class="sub_table_b">���</td>
        <td width="200px"  align="center" bgcolor="e5eff8" class="sub_table_b">�ּ�</td>
        <td width="100px"  align="center" bgcolor="e5eff8" class="sub_table_b">����</td>
        <td width="120px"  align="center" bgcolor="e5eff8" class="sub_table_b">�ΰ��ݾ�</td> 
     </tr>
                          
     <c:forEach items="${blist}" var="board" varStatus="idx">
       	<tr>
         <td width="100px" align="center">${board.GAPAN_NO}</td>
			<td width="40px" align="center">${board.YEAR}</td>
			<td width="60px" align="center">${board.TAX_NO}</td>
			<td width="60px" class="sub_table_r" align="center">${board.TAX_YN}</td>
			<td width="60px" class="sub_table_r" align="center">${board.SUNAP_YN}</td>
			<td width="100px" align="center">${board.TAX_DATE}</td>
			<td width="100px" align="center">${board.SUNAP_DATE}</td>
			<td width="60px" align="center">${board.TAX_GUBUN_NM}</td>
			<td width="110px" align="center">
				<c:choose>
					<c:when test="${board.CAL_MODE == '1'}">
					�����
					</c:when>
					<c:when test="${board.CAL_MODE == '2'}">
					�����
					</c:when>
					<c:when test="${board.CAL_MODE == '3' && board.TAX_GUBUN == '2'}">
					���·�
					</c:when>	        							
					<c:when test="${board.CAL_MODE == '3' && board.TAX_GUBUN == '3'}">
					���·�(��������)
					</c:when>
				</c:choose>
			</td>
			<td width="180px" align="center">${board.TAX_CD_NM}</td>
			<td width="100px" align="center">${board.REPLY_GUBUN_NM}</td>
			<td width="150px" align="center">${board.NAME}</td>
			<td width="200px" align="center">${board.ADDR}</td>
			<td width="100px" align="center">${board.AREA_SIZE}</td>
			<td width="120px" align="center">${rnic:insertComma2(board.SUM)}</td>
       	</tr>
	</c:forEach>

</table>
</body>
</html>

