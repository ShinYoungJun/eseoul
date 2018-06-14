<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ include file="/jsp/common/include.jsp"%>
<%@ include file="/jsp/common/loginCheck.jsp" %>

<html xmlns:x="urn:schemas-microsoft-com:office:excel">
<head>
<title>::::: 서울시 도로점용관리시스템 :::::</title>
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
 	response.setHeader("Content-Disposition", "filename=점용목적코드.xls"); 
 	response.setHeader("Content-Description", "JSP Generated Data"); 
%>

<table width="800" border="0" cellpadding="0" cellspacing="0">
	<tr>             
		<td width="20%" height="28" align="center" bgcolor="e5eff8"
			class="sub_table_b">코드ID</td>
		<td align="center" bgcolor="e5eff8" class="sub_table_b">코드명</td>
	</tr>
	<c:forEach items="${purposeCodeList}" var="purposeCode" varStatus="idx">
		 <tr onMouseOver="this.style.backgroundColor='#f6f7f8'" onMouseOut="this.style.backgroundColor=''">
				
			<td height="50" align="center"><a href="#" class="inqu" onClick="javascript:fn_detailInfo()">${purposeCode.CODE}</a></td>
			<td align="center"><a href="#" class="inqu" onClick="javascript:fn_detailInfo(${idx.count})">${purposeCode.CLASS_NM}<br>${purposeCode.SORT_NM} <br> ${purposeCode.KIND_NM}</a></td>								
		</tr>
	</c:forEach>
</table>
</body>
</html>

