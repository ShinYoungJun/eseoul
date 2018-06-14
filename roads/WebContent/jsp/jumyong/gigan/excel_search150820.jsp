<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
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

<script language="javascript">
	function addDash(num)
	{
		return (num.substr(0,4)+"-"+num.substr(4,2)+"-"+num.substr(6,2));
	}
</script>
</head>

<body>

<%
	response.setContentType("application/vnd.ms-excel; charset=euc-kr");
 	response.setHeader("Content-Disposition", "filename=기간조회관리.xls"); 
 	response.setHeader("Content-Description", "JSP Generated Data"); 
%>

<table width="800" border="0" cellpadding="0" cellspacing="0">
    <tr>
      <td width="30" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">번호</td>
      <td width="70" align="center" bgcolor="e5eff8" class="sub_table_b">관리번호</td>
      <td width="60" align="center" bgcolor="e5eff8" class="sub_table_b">점용종류</td>
      <td width="60" align="center" bgcolor="e5eff8" class="sub_table_b">점용구분</td>
      <td align="center" bgcolor="e5eff8" class="sub_table_b">점용인</td>
      <td align="center" bgcolor="e5eff8" class="sub_table_b">연락처</td>
      <td align="center" bgcolor="e5eff8" class="sub_table_b">HP</td>
      <td align="center" bgcolor="e5eff8" class="sub_table_b">우편번호</td>
      <td align="center" bgcolor="e5eff8" class="sub_table_b">점용인 주소</td>
      <td align="center" bgcolor="e5eff8" class="sub_table_b">점용인 새 주소</td>
      <td align="center" bgcolor="e5eff8" class="sub_table_b">우편물 송달지 우편번호</td>
      <td align="center" bgcolor="e5eff8" class="sub_table_b">우편물 송달지 주소</td>
      <td align="center" bgcolor="e5eff8" class="sub_table_b">우편물 송달지 도로명주소</td>
      <td align="center" bgcolor="e5eff8" class="sub_table_b">우편물 수령인 </td>
      <td align="center" bgcolor="e5eff8" class="sub_table_b">수령인 연락처</td>
      <td align="center" bgcolor="e5eff8" class="sub_table_b">면적(㎡)</td>
      <td align="center" bgcolor="e5eff8" class="sub_table_b">주민번호</td>
      <td align="center" bgcolor="e5eff8" class="sub_table_b">점용지</td>
      <td align="center" bgcolor="e5eff8" class="sub_table_b">도로주소</td>
      <td align="center" bgcolor="e5eff8" class="sub_table_b">건물(명) 정보</td>
      <td align="center" bgcolor="e5eff8" class="sub_table_b">점용지 도로명주소</td>
      <td align="center" bgcolor="e5eff8" class="sub_table_b">점용목적</td>
      <td width="150" align="center" bgcolor="e5eff8" class="sub_table_b">점용기간</td>
      <td align="center" bgcolor="e5eff8" class="sub_table_b">지분율</td>
      <td align="center" bgcolor="e5eff8" class="sub_table_b">지분율 사유</td>
      <td align="center" bgcolor="e5eff8" class="sub_table_b">감면율</td>
      <td align="center" bgcolor="e5eff8" class="sub_table_b">감면율 사유</td>           
    </tr>
  	
 	<c:forEach items="${blist}" var="board" varStatus="idx">
    	<tr>
	    <td height="26" align="center">${board.RN}</td>
			<td align="center">${board.ADMIN_NO}</td>
			<td align="center">${board.TYPE}</td>
			<td align="center">${board.SECTION_NAME}</td>
			<td align="center">${board.NAME}</td>
			<td align="center">${board.TEL}</td>
			<td align="center">${board.HP}</td>
			<td align="center">${board.POST}</td>
      <td align="center">${board.APPEAL_ADDR}</td>
      <td align="center">${board.SI} ${board.GUN} ${board.DORO_NM} ${board.BD_BON} ${board.BD_BU} ${board.BD_NM} ${board.BD_DET_NM}</td>
      <td align="center">${board.TOPOST}</td>
      <td align="center">${board.SONGDALGI}</td>
			<td align="center">${board.TONM}</td>
			<td align="center">${board.TOTEL}</td>
			<td align="center">${board.TOHP}</td>
      <td align="center">${board.AREA_SIZE}</td>
      <td align="center">${board.SSN}</td>
			<td align="center">${board.JUMYONGJI}</td>
			<td align="center">${board.ROAD_ADDR}</td>
			<td align="center">${board.BD_NM}</td>
			<td align="center">${board.JUMYONGJI_DORO_ADDR}</td>
			<td align="center">${board.PURPOSE_CLASS} ${board.PURPOSE_SORT} ${board.PURPOSE_KIND}</td>
			<td align="center">${board.GIGAN}</td>
			<td align="center">${board.PERCENT_RATE}</td>
			<td align="center">${board.PERCENT_REASON}</td>
			<td align="center">${board.REDUCTION_RATE}</td>
			<td align="center">${board.REDUCTION_REASON}</td>
		</tr>
	</c:forEach>
	
</table>
</body>
</html>

