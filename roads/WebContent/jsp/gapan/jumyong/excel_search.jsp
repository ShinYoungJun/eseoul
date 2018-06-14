<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ include file="/jsp/common/loginCheck.jsp" %>
<%@ include file="/jsp/common/include.jsp"%>


<html xmlns:x="urn:schemas-microsoft-com:office:excel">
<head>
<!--  //********** BEGIN_KANG_20120423 -->
<meta http-equiv="Content-Type" content="text/html; charset=euc-kr" />
<!--   //********** END_KANG_20120423 -->
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
 	response.setHeader("Content-Disposition", "filename=보도상영업시설물관리.xls"); 
 	response.setHeader("Content-Description", "JSP Generated Data");
%>
<table width="780" border="0" cellpadding="0" cellspacing="0">
	<tr>
		<td width="80px" align="center" bgcolor="e5eff8" class="sub_table_b" width="50">번호</td>
		<td width="100px" align="center" bgcolor="e5eff8" class="sub_table_b">관리번호</td>
		<!--  //********** BEGIN_KANG_20120423 -->
		<td width="130px" align="center" bgcolor="e5eff8" class="sub_table_b">시설물 번호</td>
		<!--   //********** END_KANG_20120423 -->	
		<td width="60px" align="center" bgcolor="e5eff8" class="sub_table_b">세입구분</td>
		<td width="100px" align="center" bgcolor="e5eff8" class="sub_table_b">운영인</td>
		<td width="150px" align="center" bgcolor="e5eff8" class="sub_table_b">점용지</td>
		<!-- 
		<td width="150px" align="center" bgcolor="e5eff8" class="sub_table_b">점용지새주소</td>
		 -->
		<!--  //********** BEGIN_KANG_20120423 -->
		<td width="100px" align="center" bgcolor="e5eff8" class="sub_table_b">전화번호</td>
		<td width="100px" align="center" bgcolor="e5eff8" class="sub_table_b">휴대전화</td>
		<!--   //********** END_KANG_20120423 -->	
		<td width="80px" align="center" bgcolor="e5eff8" class="sub_table_b">시설물명</td>
		<td width="60px" align="center" bgcolor="e5eff8" class="sub_table_b">벌점</td>
		
		<td width="100px" align="center" bgcolor="e5eff8" class="sub_table_b">위반내역</td>
		<td width="100px" align="center" bgcolor="e5eff8" class="sub_table_b">처리내역</td>
		
		<td width="150px" align="center" bgcolor="e5eff8" class="sub_table_b">점용기간</td>
		<td width="70px" align="center" bgcolor="e5eff8" class="sub_table_b">면적(㎡)</td>                       
		<td width="100px" align="center" bgcolor="e5eff8" class="sub_table_b">갱신일자</td>                                                 
	</tr>
            
	<c:forEach items="${blist1}" var="board" varStatus="idx">	                      
	<tr>
		<td width="80px" align="center"> ${board.NO}</td>
        <td width="100px" align="center" >${board.GAPAN_NO}</td>
		<!--  //********** BEGIN_KANG_20120423 -->
		<td width="130px" align="center" ><c:if test="${board.FACILITY_NO != null && board.FACILITY_NO != ''}">${board.FT_TYP} - ${board.FACILITY_NO}</c:if></td>
		<!--   //********** END_KANG_20120423 -->	        
        <td width="60px" align="center">${board.TAX_SET_NAME}</td>                        
        <td width="100px" align="center">${board.NAME}</td>
        <td width="150px" align="center">${board.ADDR}</td>
        <!-- 
        <td width="150px" align="center">${board.SI}&nbsp;${board.GUN}&nbsp;${board.DORO_NM}&nbsp;${board.BD_BON}&nbsp;${board.BD_BU}&nbsp;${board.BD_NM}&nbsp;${board.BD_DET_NM}</td>
         -->
		<!--  //********** BEGIN_KANG_20120423 -->
		<td width="100px" align="center"><c:if test="${board.OWNER_TEL != '--' }">${board.OWNER_TEL}</c:if></td>       
		<td width="100px" align="center">${board.OWNER_HP}</td>                                                        
		<!--   //********** END_KANG_20120423 -->	  
        <td width="80px" align="center">${board.FT_TYP}</td>    
        <td width="60px" align="center">
      		<c:choose>
      		<c:when test="${board.VIO_ACCPOINTS >= 100}">
      		<font color="red">${board.VIO_ACCPOINTS}</font>
      		</c:when>
      		<c:otherwise>
      		${board.VIO_ACCPOINTS}
      		</c:otherwise>
      		</c:choose>
      		</td>
      		<td width="100px" align="center">${board.VIO_CD_NAME}</td>
      		<td width="100px" align="center">${board.VIO_ACTCD_NAME}</td>
        <td width="150px" align="center">${rnic:addDash(board.MUL_FROMDATE)} ~ ${rnic:addDash(board.MUL_TODATE)}</td>
      		<td width="70px" align="center">${board.PLACE_A}</td>                                                                 	                        
        <td width="100px" align="center">${rnic:addDash(board.UP_DATE)}</td>                                   
	</tr>
	</c:forEach>
</table>
</body>
</html>