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
 	response.setHeader("Content-Disposition", "filename=�Ÿ����Թο���Ȳ.xls"); 
 	response.setHeader("Content-Description", "JSP Generated Data"); 
%>

<table width="800" border="0" cellpadding="0" cellspacing="0">
     <tr height="26px">
       <td width="90px" align="center" bgcolor="e5eff8" class="sub_table_b">�������</td>
       <td width="100px" align="center" bgcolor="e5eff8" class="sub_table_b">��</td>
       <td width="80px" align="center" bgcolor="e5eff8" class="sub_table_b">���ͳ�</td>
       <td width="80px" align="center" bgcolor="e5eff8" class="sub_table_b">120���ǹ�</td>
       <td width="80px" align="center" bgcolor="e5eff8" class="sub_table_b">������</td>
       <td width="80px" align="center" bgcolor="e5eff8" class="sub_table_b">��ȭ</td>
       <td width="80px" align="center" bgcolor="e5eff8" class="sub_table_b">�湮</td>
       <td width="80px" align="center" bgcolor="e5eff8" class="sub_table_b">����������</td>
       <td width="80px" align="center" bgcolor="e5eff8" class="sub_table_b">��Ÿ</td>
   </tr>
	<c:forEach items="${blist}" var="board" varStatus="idx">
   <tr height="26px" onMouseOver="this.style.backgroundColor='#f6f7f8'" onMouseOut="this.style.backgroundColor=''" style="cursor: pointer">
       <td width="90px" align="center">${rnic:addDash(board.REGIST_DATE)}</td>
       <td width="100px" align="center">${board.COL_SUM}</td>
       <td width="80px" align="center">${board.COL1}</td>
       <td width="80px" align="center">${board.COL2}</td>
       <td width="80px" align="center">${board.COL3}</td>
       <td width="80px" align="center">${board.COL4}</td>
       <td width="80px" align="center">${board.COL5}</td>
       <td width="80px" align="center">${board.COL6}</td>
       <td width="80px" align="center">${board.COL7}</td>
   </tr>
   </c:forEach>

</table>
</body>
</html>

