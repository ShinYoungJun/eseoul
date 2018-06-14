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
 	response.setHeader("Content-Disposition", "filename=정기분관리.xls"); 
 	response.setHeader("Content-Description", "JSP Generated Data"); 
%>

<table width="1000" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
	<tr>
		<td height="28" align="center" bgcolor="e5eff8" class="sub_table_b">관리번호</td>
        <td align="center" bgcolor="e5eff8" class="sub_table_b">과세번호</td>
        <td align="center" bgcolor="e5eff8" class="sub_table_b">점용인</td>
        <td align="center" bgcolor="e5eff8" class="sub_table_b">점용지</td>
        <td align="center" bgcolor="e5eff8" class="sub_table_b">점용면적</td>
        <td align="center" bgcolor="e5eff8" class="sub_table_b">점용목적</td>
        <td align="center" bgcolor="e5eff8" class="sub_table_b">조정점용료</td>
        <td align="center" bgcolor="e5eff8" class="sub_table_b">전년도 시작일</td>
        <td align="center" bgcolor="e5eff8" class="sub_table_b">전년도 끝일</td>
        <td align="center" bgcolor="e5eff8" class="sub_table_b">현년도 시작일</td>
        <td align="center" bgcolor="e5eff8" class="sub_table_b">현년도 끝일</td>
        <td align="center" bgcolor="e5eff8" class="sub_table_b">요율</td>
        <td align="center" bgcolor="e5eff8" class="sub_table_b">공시지가</td>
        <td align="center" bgcolor="e5eff8" class="sub_table_b">산출여부</td>                                                                       
	</tr>
                 
	<c:choose>
	<c:when test='${blist != null && !empty blist}'>  
 	<c:forEach items="${blist}" var="board" varStatus="idx">
  	<tr onMouseOver="this.style.backgroundColor='#f6f7f8'" onMouseOut="this.style.backgroundColor=''" style="cursor:pointer"
  	onclick="javascript:goView('${board.GAPAN_NO}','${board.YEAR}');">

		<td height="26" align="center">${board.GAPAN_NO}</td>
		<td align="center">${board.TAX_NO}</td>
		<td align="center">${board.NAME}</td>
		<td align="center">${board.BJ_NM} ${board.BONBUN }</td>
		<td align="center">${board.AREA_AFTER }</td>
		<td align="center">
		<!-- iframe id="IFRM_PurposeCode" align="absmiddle" scrolling="no" frameborder="0" framespacing="0" width="100%" height="22" src="/jsp/common/purposeCode/purposeCode_view.jsp?SectionCode=${board.TYPE}&PURPOSE_CD=${board.PURPOSE_CD}"></iframe-->
			${board.PURPOSE_CLASSNM }
		</td>
		<td align="center">${board.SUM_ADJUST}</td>
		<td align="center">${board.LAST_FROMDATE}</td>
		<td align="center">${board.LAST_TODATE}</td>
		<td align="center">${board.FROMDATE}</td>
		<td align="center">${board.TODATE}</td>
		<td align="center">${board.RATE}</td>
		<td align="center">${board.PRICE}</td>
		<td align="center">
		<c:if test="${board.SUM_ADJUST == null }">
			미산출
		</c:if>
		<c:if test="${board.SUM_ADJUST != null }">
			산출
		</c:if>
	
		</td>                                                                          
	</tr>
 	</c:forEach>
 	</c:when>
	<c:otherwise>
	<tr>
		<td align="center" class="sub_table" colspan="14" height="85"> 내용이 없습니다</td>
	</tr>
</c:otherwise>
</c:choose>
 
             </table>
</body>
</html>

