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
 	response.setHeader("Content-Disposition", "filename=���ܼ��԰���.xls"); 
 	response.setHeader("Content-Description", "JSP Generated Data"); 
%>

<table width="800" border="0" cellpadding="0" cellspacing="0">
  	<tr>
      <td height="28" align="center" bgcolor="e5eff8" class="sub_table_b">��ȣ</td>
      <td align="center" bgcolor="e5eff8" class="sub_table_b">������/���θ�</td>
      <td align="center" bgcolor="e5eff8" class="sub_table_b">��������</td>
      <td align="center" bgcolor="e5eff8" class="sub_table_b">��������</td>
      <td align="center" bgcolor="e5eff8" class="sub_table_b">�⵵</td>
      <td align="center" bgcolor="e5eff8" class="sub_table_b">���Ա���</td>
      <td align="center" bgcolor="e5eff8" class="sub_table_b">�ۼ�����</td>
      <td align="center" bgcolor="e5eff8" class="sub_table_b">�ΰ�����</td>
    </tr>
                      
    <c:forEach items="${blist}" var="board" varStatus="idx">
    <tr onClick="javascript:View('${board.GU_CODE}','${board.CORP_CD}','${board.REQUEST_NO}','${board.SEQ}')" onMouseOver="this.style.backgroundColor='#f6f7f8'" onMouseOut="this.style.backgroundColor=''" style="CURSOR: Hand;" >
	 	<td height="26" align="center">${board.RN}</td>
		<td align="center">${board.NAME}</td>
		<td align="center">${board.REQ_DATE}</td>
		<td align="center">${board.USE_SECTION}</td>
		<td align="center">${board.YEAR}</td>
		<td align="center">${board.TAX_SET}</td>
		<td align="center">${board.CAL_YN}</td>
		<td align="center">${board.TAX_YN}</td>
   	</tr>
 	</c:forEach>

</table>
</body>
</html>

