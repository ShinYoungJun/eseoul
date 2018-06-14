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
 	response.setHeader("Content-Disposition", "filename=거리가게실태조사.xls"); 
 	response.setHeader("Content-Description", "JSP Generated Data"); 
%>

<%-- 20121024 by ksic 실 거주지 주소 추가 시작 --%>
<!-- <table width="10000px" cellpadding="0" cellspacing="0" border="1" class="sub_table" bordercolor="#c9dfed" style="border-collapse: collapse;"> -->
<table width="10400px" cellpadding="0" cellspacing="0" border="1" class="sub_table" bordercolor="#c9dfed" style="border-collapse: collapse;">
<%-- 20121024 by ksic 실 거주지 주소 추가 끝 --%>
<tr >
	<td height="26px" width="400px" align="center" bgcolor="e5eff8" class="sub_table_b">관리번호</td>
	<td width="400px" align="center" bgcolor="e5eff8" class="sub_table_b">운영인</td>
	<td width="400px" align="center" bgcolor="e5eff8" class="sub_table_b">인접지 주소</td>
	<td width="400px" align="center" bgcolor="e5eff8" class="sub_table_b">도로명 주소</td>	
	<%-- 20121024 by ksic 실 거주지 주소 추가 시작 --%>
	<td width="400px" align="center" bgcolor="e5eff8" class="sub_table_b">기본 주소</td>
	<%-- 20121024 by ksic 실 거주지 주소 추가 끝 --%>
	<!--  //********** BEGIN_현진_20120313 -->
	<td width="400px" align="center" bgcolor="e5eff8" class="sub_table_b">구간</td>
	<!--   //********** END_현진_20120313 -->
	<td width="400px" align="center" bgcolor="e5eff8" class="sub_table_b">시설 종류</td>
	<td width="400px" align="center" bgcolor="e5eff8" class="sub_table_b">면적(㎡)</td>														
	<td width="400px" align="center" bgcolor="e5eff8" class="sub_table_b">정비/관리</td>
	<td width="400px" align="center" bgcolor="e5eff8" class="sub_table_b">거리조성</td>
	<td width="400px" align="center" bgcolor="e5eff8" class="sub_table_b">특화거리 조성일자</td>
	<td width="400px" align="center" bgcolor="e5eff8" class="sub_table_b">설치일자</td>
	<td width="400px" align="center" bgcolor="e5eff8" class="sub_table_b">등록일자</td>
	<td width="400px" align="center" bgcolor="e5eff8" class="sub_table_b">주민번호</td>
	<td width="400px" align="center" bgcolor="e5eff8" class="sub_table_b">전화번호</td>
	<td width="400px" align="center" bgcolor="e5eff8" class="sub_table_b">취급품목</td>
	<td width="400px" align="center" bgcolor="e5eff8" class="sub_table_b">가입단체</td>
</tr>
<c:forEach items="${blist}" var="board" varStatus="idx">
<tr onMouseOver="this.style.backgroundColor='#f6f7f8'" onMouseOut="this.style.backgroundColor=''" style="cursor: pointer">
    <td height="26px" width="400px" align="center" >${board.GAPAN_NO}</td>
	<td width="400px" align="center" >${board.OWNER_NAME}</td>
	<td width="400px" align="center" >${board.WITH_ADDR}</td>
	<!--  //********** BEGIN_KANG_20120424 -->
	<!-- <td width="400px" align="center" >${board.SI}&nbsp;${board.GUN}&nbsp;${board.DORO_NM}&nbsp;${board.BD_BON}&nbsp;${board.BD_BU}&nbsp;${board.BD_NM}&nbsp;${board.BD_DET_NM}</td> -->
	<td width="400px" align="center" ><c:if test="${board.DORO_NM != null && board.DORO_NM != ''}">${board.SI} ${board.GUN} ${board.DORO_NM} ${board.BD_BON}<c:if test="${board.BD_BU != '0' && board.BD_BU != null}">-${board.BD_BU}</c:if> ${board.BD_NM} ${board.BD_DET_NM}</c:if></td>
	<!--   //********** END_KANG_20120424 -->	
	<%-- 20121024 by ksic 실 거주지 주소 추가 시작 --%>
	<td width="400px" align="center" >${board.ADDR_JIBUN}</td>
	<%-- 20121024 by ksic 실 거주지 주소 추가 끝 --%>
	<!--  //********** BEGIN_현진_20120313 -->
	<td width="400px" align="center" >
	<!--  //********** BEGIN_현진_20120315 -->
	<c:if test="${board.GUGAN_CD!=0 && board.GUGAN_CD!=null}">
	제 ${board.GUGAN_CD}구간
	</c:if>
	<!--   //********** END_현진_20120315 -->
	</td>
	<!--   //********** END_현진_20120313 -->																			
	<td width="400px" align="center" >${board.FT_TYP_NM}&nbsp;/&nbsp;${board.FT_SEL_NM}</td>
	<td width="400px" align="center" >${board.PLACE_A}</td>
	<td width="400px" align="center" >
	<c:choose>
	<c:when test="${board.MAINTN_OB == '1'}">관리대상</c:when>
	<c:otherwise>정비대상</c:otherwise>
	</c:choose>
	</td>
	<td width="400px" align="center">
		<c:choose>
		<c:when test="${board.SPECIAL_ST == '1'}">일반거리</c:when>
		<c:otherwise>특화거리</c:otherwise>
		</c:choose>
	</td>
	<td width="400px" align="center" >${rnic:addDash(board.SPECIAL_DATE)}</td>
	<td width="400px" align="center" >${rnic:addDash(board.FOUND_DATE)}</td>
	<td width="400px" align="center" >${rnic:addDash(board.REG_DATE)}</td>
	<td width="400px" align="center" >${board.OWNER_SSN}</td>
	<td width="400px" align="center" >${board.OWNER_HP}</td>
	<td width="400px" align="center" >${board.SG_TYP}</td>
	<td width="400px" align="center" >${board.UN_TYP}</td> 
</tr>
</c:forEach>
</table>
</body>
</html>

