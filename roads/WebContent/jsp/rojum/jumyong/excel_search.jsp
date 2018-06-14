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
 	response.setHeader("Content-Disposition", "filename=수거등록및산출.xls"); 
 	response.setHeader("Content-Description", "JSP Generated Data"); 
%>
<table width="780" border="0" cellpadding="0" cellspacing="0">
	<tr>
		<td width="100px" align="center" bgcolor="e5eff8" class="sub_table_b">관리번호</td>
		<td width="80px" align="center" bgcolor="e5eff8" class="sub_table_b">등록구분</td>
		<td width="80px" align="center" bgcolor="e5eff8" class="sub_table_b">시설종류</td>
		<td width="80px" align="center" bgcolor="e5eff8" class="sub_table_b">수거일</td>
		<td width="60px" align="center" bgcolor="e5eff8" class="sub_table_b">보관일</td>
		<td width="100px" align="center" bgcolor="e5eff8" class="sub_table_b">운영인</td>
		<td width="150px" align="center" bgcolor="e5eff8" class="sub_table_b">점용지</td>
		<td align="center" bgcolor="e5eff8" class="sub_table_b">상&nbsp;&nbsp;&nbsp;&nbsp;태</td>
		<td width="70px" align="center" bgcolor="e5eff8" class="sub_table_b">면적(㎡)</td>
		<td width="60px" align="center" bgcolor="e5eff8" class="sub_table_b">점용료</td>
		<td width="80px" align="center" bgcolor="e5eff8" class="sub_table_b">정비/관리</td>
		<td width="100px" align="center" bgcolor="e5eff8" class="sub_table_b">갱신일자</td>
	</tr>
            
	<c:forEach items="${blist1}" var="board" varStatus="idx">	                      
	<tr>
		<td height="26px" width="100px" align="center">${board.ADMIN_NO}</td>
		<td width="80px" align="center">
			<c:choose>
			<c:when test="${board.PICKUP_YN == '1'}">
				수거
			</c:when>
			<c:otherwise>
				실태조사
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
					부과
				</c:when>
				<c:otherwise>
					미부과
				</c:otherwise>
			</c:choose>
		</td>
		<td width="80px" align="center">
			<c:choose>
				<c:when test="${board.MAINTN_OB == '1'}">
				관리대상
				</c:when>
				<c:otherwise>
				정비대상
				</c:otherwise>
			</c:choose>
		</td>
		<td width="100px" align="center">${rnic:addDash(board.UP_DATE)}</td>             
	</tr>
	</c:forEach>
</table>
</body>
</html>