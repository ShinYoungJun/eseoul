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
 	response.setHeader("Content-Disposition", "filename=거리가게민원현황.xls"); 
 	response.setHeader("Content-Description", "JSP Generated Data"); 
%>

<table width="800" border="0" cellpadding="0" cellspacing="0">
     <tr height="26px">
       <td width="90px" align="center" bgcolor="e5eff8" class="sub_table_b">등록일자</td>
       <td width="100px" align="center" bgcolor="e5eff8" class="sub_table_b">계</td>
       <td width="80px" align="center" bgcolor="e5eff8" class="sub_table_b">인터넷</td>
       <td width="80px" align="center" bgcolor="e5eff8" class="sub_table_b">120살피미</td>
       <td width="80px" align="center" bgcolor="e5eff8" class="sub_table_b">해피콜</td>
       <td width="80px" align="center" bgcolor="e5eff8" class="sub_table_b">전화</td>
       <td width="80px" align="center" bgcolor="e5eff8" class="sub_table_b">방문</td>
       <td width="80px" align="center" bgcolor="e5eff8" class="sub_table_b">진정ㆍ건의</td>
       <td width="80px" align="center" bgcolor="e5eff8" class="sub_table_b">기타</td>
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

