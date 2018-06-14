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
 	response.setHeader("Content-Disposition", "filename=거리가게관리.xls"); 
 	response.setHeader("Content-Description", "JSP Generated Data"); 
%>

<table width="800" border="0" cellpadding="0" cellspacing="0">
     <tr>
		<td height="35px" width="120px" align="center" bgcolor="e5eff8" class="sub_table_b">관리번호</td>
        <td width="100px" align="center" bgcolor="e5eff8" class="sub_table_b">운영인</td>
        <td width="140px" align="center" bgcolor="e5eff8" class="sub_table_b">점용지</td>
        <td width="80px" align="center" bgcolor="e5eff8" class="sub_table_b">면적(㎡)</td>
        <td width="100px" align="center" bgcolor="e5eff8" class="sub_table_b">정비/관리</td>														
        <td width="120px" align="center" bgcolor="e5eff8" class="sub_table_b">점용료</td>
        <td width="100px" align="center" bgcolor="e5eff8" class="sub_table_b">수거일</td>
        <td width="80px" align="center" bgcolor="e5eff8" class="sub_table_b">보관일</td>
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
					관리대상
				</c:when>
				<c:otherwise>
					정비대상
				</c:otherwise>
				</c:choose>
			</td>
			<td width="120px" align="center">
				<c:choose>
				<c:when test="${board.TAXTATION_AT == '1'}">
					부과
				</c:when>
				<c:otherwise>
					미부과
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

