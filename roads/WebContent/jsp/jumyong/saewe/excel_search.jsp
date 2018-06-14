<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ include file="/jsp/common/include.jsp"%>
<%@ include file="/jsp/common/loginCheck.jsp" %>

<html xmlns:x="urn:schemas-microsoft-com:office:excel">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=euc-kr" />
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
       <td align="center" bgcolor="e5eff8" class="sub_table_b">관리번호</td>
       <td align="center" bgcolor="e5eff8" class="sub_table_b">년도</td>
       <td align="center" bgcolor="e5eff8" class="sub_table_b">과세번호</td>
       <td align="center" bgcolor="e5eff8" class="sub_table_b">점용종류</td>
       <td align="center" bgcolor="e5eff8" class="sub_table_b">소유자</td>
       <td align="center" bgcolor="e5eff8" class="sub_table_b">세입구분</td>
       <td align="center" bgcolor="e5eff8" class="sub_table_b">점용구분</td>
       <td align="center" bgcolor="e5eff8" class="sub_table_b">세목코드</td>
       <td align="center" bgcolor="e5eff8" class="sub_table_b">점용인</td>
	   <td align="center" bgcolor="e5eff8" class="sub_table_b">점용지 법정동</td>
	   <td align="center" bgcolor="e5eff8" class="sub_table_b">점용지 행정동</td>
	   <td align="center" bgcolor="e5eff8" class="sub_table_b">점용지 지번</td>	
	   <td align="center" bgcolor="e5eff8" class="sub_table_b">점용목적</td>
       <td align="center" bgcolor="e5eff8" class="sub_table_b">면적<br/>㎡/개</td>
       <td align="center" bgcolor="e5eff8" class="sub_table_b">본세(점용료)</td>
       <td align="center" bgcolor="e5eff8" class="sub_table_b">부가가치세</td>
       <td align="center" bgcolor="e5eff8" class="sub_table_b">부과일자</td>
       <%--  //********** BEGIN_현진_20120321 --%>
       <td align="center" bgcolor="e5eff8" class="sub_table_b">부과일</td>
       <td align="center" bgcolor="e5eff8" class="sub_table_b">대표자명</td>
       <td align="center" bgcolor="e5eff8" class="sub_table_b">사업장 주소</td>
		<%--   //********** END_현진_20120321 --%>
		<%--  //********** BEGIN_KANG_20120417 --%>
		<td align="center" bgcolor="e5eff8" class="sub_table_b">상호명</td>
		<%--  //********** BEGIN_KANG_20120710 --%>
		<td aling="center" bgcolor="e5eff8" class="sub_table_b">주민/법인번호</td>
		<td align="center" bgcolor="e5eff8" class="sub_table_b">사업자등록번호</td>
       <td align="center" bgcolor="e5eff8" class="sub_table_b">업태</td>
       <td align="center" bgcolor="e5eff8" class="sub_table_b">업종</td>
		<%--   //********** END_KANG_20120710 --%>
       <td align="center" bgcolor="e5eff8" class="sub_table_b">E-MAIL</td>
		<%--   //********** END_KANG_20120417 --%>
       <td align="center" bgcolor="e5eff8" class="sub_table_b">수납일자</td>
       <td align="center" bgcolor="e5eff8" class="sub_table_b">갱신일자</td>
       <td align="center" bgcolor="e5eff8" class="sub_table_b">산출기간</td> 
       <td align="center" bgcolor="e5eff8" class="sub_table_b">작성여부</td>
       <td align="center" bgcolor="e5eff8" class="sub_table_b">부과여부</td>
     </tr>
                          
	<c:choose>
		<c:when test="${blist!= null && !empty blist}">
          	<c:forEach items="${blist}" var="board" varStatus="idx">
              <tr onClick="javascript:View('${board.ADMIN_NO}', '${board.SEQ}')" onMouseOver="this.style.backgroundColor='#f6f7f8'" onMouseOut="this.style.backgroundColor=''" style="CURSOR: Hand;" >
		        <td height="26" align="center">${board.RN}</td>
	        	<td align="center">${board.ADMIN_NO}</td>
	        	<td align="center">${board.SUM_YEAR}</td>
	        	<td align="center">${board.TAX_NO}</td>
	        	<td align="center">${board.TYPE}</td>
	        	<td align="center">${board.OWNER_SET_NM}</td>
	        	<td align="center">${board.TAX_SET_NM}</td>
	        	<td align="center">${board.SECTION_NAME}</td>
	        	<td align="center">${board.TAXCODE_NM}</td>
	        	<td align="center">${board.NAME}</td>
	        	<td align="center">${board.BJ_NM}</td>
	        	<td align="center">${board.HJ_NM}</td>
	        	<td align="center">&nbsp;${board.JIBUN}</td>
						<td align="center">${board.PURPOSE_NM}</td>	
	        	<td align="center">${board.AREA}</td>
	        	<td align="center">${board.BONSE}</td>
	        	<td align="center">${board.VAT}</td>
	        	<td align="center">${board.TAX_DATE}</td>
	        	<%--  //********** BEGIN_현진_20120321 --%>
	        	<td align="center">${board.TAX_DATE_DD}</td>
	        	<td align="center">${board.EXPONENT}</td>
	        	<td align="center">${board.BUSINESSADDR}</td>
				<%--   //********** END_현진_20120321 --%>
				<%--  //********** BEGIN_KANG_20120417 --%>
				<td align="center">${board.COMPANY_NAME}</td>
				<%-- ********** BEGIN_KANG_20120710 --%>
				<%-- 2013.04.01 yjmoon 주민/법인 번호 필드 추가. --%>
				<td align="center">${board.SSN}</td>
				<td align="center">${board.BIZSSN}</td>
	        	<td align="center">${board.BIZ_STATUS}</td>
	        	<td align="center">${board.BIZ_TYPES}</td>
				<%--   //********** END_KANG_20120710 --%>				
	        	<td align="center">${board.EMAIL}</td>
				<%--   //********** END_KANG_20120417 --%>
		        <td align="center">${board.SUNAP_DATE}</td>
	        	<td align="center">${board.BASE_UPDATED}</td>
	        	<td align="center">${board.JUMGIGAN}</td>
	        	<td class="sub_table_r" align="center">${board.CAL_YN}</td>
	        	<td class="sub_table_r" align="center">${board.TAX_YN}</td>
		      </tr>
		 	</c:forEach>
		</c:when>
		<c:otherwise>
			<tr>
				<td align="center" class="sub_table" colspan="13" height="85">검색된 내용이 없습니다</td>
			</tr>
		</c:otherwise>
	 </c:choose>

</table>
</body>
</html>

