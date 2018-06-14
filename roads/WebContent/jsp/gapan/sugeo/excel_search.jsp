<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ include file="/jsp/common/loginCheck.jsp" %>
<%@ include file="/jsp/common/include.jsp"%>

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
 	response.setHeader("Content-Disposition", "filename=수거정보.xls"); 
 	response.setHeader("Content-Description", "JSP Generated Data"); 
%>

<table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
	<tr>
	    <td height="28" align="center" bgcolor="e5eff8" class="sub_table_b">번호</td>
	    <td align="center" bgcolor="e5eff8" class="sub_table_b">수거일자</td>
	    <td align="center" bgcolor="e5eff8" class="sub_table_b">수거위치</td>
	    <td align="center" bgcolor="e5eff8" class="sub_table_b">주변정보</td>
	    <td align="center" bgcolor="e5eff8" class="sub_table_b">소유자명</td>
	    <td align="center" bgcolor="e5eff8" class="sub_table_b">수거물품</td>
	    <!-- td align="center" bgcolor="e5eff8" class="sub_table_b">처리상태</td-->
	</tr>
                                     
<c:choose>
<c:when test='${blist != null && !empty blist}'>
	<c:forEach items="${blist}" var="board" varStatus="idx">
	<tr>
		<td height="26" align="center">${board.RN}</td>
		<td align="center">${board.rem_date}</td>
		<td align="center">${board.rem_bjcd}</td>
		<td align="center">${board.rem_addr}</td>
		<td align="center">${board.rem_nm}</td>
		<td align="center">${board.rem_mulnm}</td>
		<!-- td align="center"></td-->
		</tr>
		</c:forEach>
	</c:when>
	<c:otherwise>
		<tr>
			<td align="center" class="sub_table" colspan="7" height="85"> 내용이 없습니다</td>
		</tr>
	</c:otherwise>
	</c:choose>
 
</table>


</body>
</html>
