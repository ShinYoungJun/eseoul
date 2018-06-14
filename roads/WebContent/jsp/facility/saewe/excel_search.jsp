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
 	response.setHeader("Content-Disposition", "filename=세외수입관리.xls"); 
 	response.setHeader("Content-Description", "JSP Generated Data"); 
%>

<table width="800" border="0" cellpadding="0" cellspacing="0">
  	<tr>
      <td height="28" align="center" bgcolor="e5eff8" class="sub_table_b">번호</td>
      <td align="center" bgcolor="e5eff8" class="sub_table_b">점용인/법인명</td>
      <td align="center" bgcolor="e5eff8" class="sub_table_b">갱신일자</td>
      <td align="center" bgcolor="e5eff8" class="sub_table_b">과세구분</td>
      <td align="center" bgcolor="e5eff8" class="sub_table_b">년도</td>
      <td align="center" bgcolor="e5eff8" class="sub_table_b">세입구분</td>
      <td align="center" bgcolor="e5eff8" class="sub_table_b">작성여부</td>
      <td align="center" bgcolor="e5eff8" class="sub_table_b">부과여부</td>
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

