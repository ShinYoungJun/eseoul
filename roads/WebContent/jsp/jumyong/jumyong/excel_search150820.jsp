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
 	response.setHeader("Content-Disposition", "filename=점용조회관리.xls"); 
 	response.setHeader("Content-Description", "JSP Generated Data"); 
%>

<table width="800" border="0" cellpadding="0" cellspacing="0">
     <tr>
       <td height="35" align="center" bgcolor="e5eff8" class="sub_table_b" width="50">번호</td>
       <td align="center" bgcolor="e5eff8" class="sub_table_b">관리번호</td>
       <td align="center" bgcolor="e5eff8" class="sub_table_b">점용종류</td>
       <td align="center" bgcolor="e5eff8" class="sub_table_b">점용구분</td>
       <td align="center" bgcolor="e5eff8" class="sub_table_b">주민번호(법인번호)</td>
       <td align="center" bgcolor="e5eff8" class="sub_table_b">점용인 우편번호</td>
       <td align="center" bgcolor="e5eff8" class="sub_table_b">점용인 주소</td>
       <td align="center" bgcolor="e5eff8" class="sub_table_b">점용인 도로명 주소</td>
       <td align="center" bgcolor="e5eff8" class="sub_table_b">우편물 송달지 도로명 주소</td>
       <td align="center" bgcolor="e5eff8" class="sub_table_b">세입구분</td>
       <td align="center" bgcolor="e5eff8" class="sub_table_b">점용지소유</td>
       <td align="center" bgcolor="e5eff8" class="sub_table_b">사업자등록번호</td>
       <td align="center" bgcolor="e5eff8" class="sub_table_b">업태</td>
       <td align="center" bgcolor="e5eff8" class="sub_table_b">업종</td>
       <!--  //********** BEGIN_KANG_20120710 -->
       <td align="center" bgcolor="e5eff8" class="sub_table_b">대표자명</td>
       <td align="center" bgcolor="e5eff8" class="sub_table_b">상호명</td>
       <td align="center" bgcolor="e5eff8" class="sub_table_b">사업장 주소</td>
		<!--   //********** END_KANG_20120710 -->
       <td align="center" bgcolor="e5eff8" class="sub_table_b">점용인/법인명</td>
       <td align="center" bgcolor="e5eff8" class="sub_table_b">점용인 전화번호</td>
       <td align="center" bgcolor="e5eff8" class="sub_table_b">점용인 핸드폰</td>
       <td align="center" bgcolor="e5eff8" class="sub_table_b">점용인 이메일</td>       
       <td align="center" bgcolor="e5eff8" class="sub_table_b">비고(점용인)</td>
       <td align="center" bgcolor="e5eff8" class="sub_table_b">점용지</td>
       <td align="center" bgcolor="e5eff8" class="sub_table_b">점용지 도로명 주소</td>
       <td align="center" bgcolor="e5eff8" class="sub_table_b">점용기간</td>
       <td align="center" bgcolor="e5eff8" class="sub_table_b">기존 허가번호</td>
       <td align="center" bgcolor="e5eff8" class="sub_table_b">도로주소</td>
       <td align="center" bgcolor="e5eff8" class="sub_table_b">건물(명) 정보</td>
       <td align="center" bgcolor="e5eff8" class="sub_table_b">면적(㎡)</td>   
	   <td align="center" bgcolor="e5eff8" class="sub_table_b">점용목적코드</td> 
	   <td align="center" bgcolor="e5eff8" class="sub_table_b">지분율</td>
       <td align="center" bgcolor="e5eff8" class="sub_table_b">지분율 사유</td>
	   <td align="center" bgcolor="e5eff8" class="sub_table_b">감면율</td>
       <td align="center" bgcolor="e5eff8" class="sub_table_b">감면율 사유</td>
       <td align="center" bgcolor="e5eff8" class="sub_table_b">비고(점용지)</td>    
       <td align="center" bgcolor="e5eff8" class="sub_table_b">갱신일자</td>                                                
       <td align="center" bgcolor="e5eff8" class="sub_table_b">검토여부</td>
     </tr>

     <c:forEach items="${blist1}" var="board" varStatus="idx">	      
       	<tr>
			<td height="26" align="center"> ${board.NO} </td>
            <td align="center"> ${board.ADMIN_NO2}</td>
            <td align="center"> ${board.TYPE_NAME}</td>            
            <td align="center"> ${board.SECTION_NAME}</td>
            <td align="center"> ${board.SSN}</td>
            <td align="center"> ${board.POST}</td>
            <td align="center"> ${board.ADDR}</td>
            <td align="center"> ${board.ADDR_NEW}</td>
            <td align="center"> ${board.SONGDALGI} </td>
            <td align="center"> ${board.TAX_SET_NAME}</td>
            <td align="center"> ${board.OWNER_SET}</td>
            <td align="center"> ${board.BIZSSN}</td>
            <td align="center"> ${board.BIZ_STATUS}</td>
            <td align="center"> ${board.BIZ_TYPES}</td>
            <!--  //********** BEGIN_KANG_20120710 -->
            <td align="center"> ${board.EXPONENT}</td>
            <td align="center"> ${board.BUSINESSADDR}</td>
            <td align="center"> ${board.COMPANY_NAME}</td>
			<!--   //********** END_KANG_20120710 -->
            <td align="center"> ${board.NAME}</td>
            <td align="center"> ${board.TEL}</td>
            <td align="center"> ${board.HP}</td>
            <td align="center"> ${board.EMAIL}</td>
            <td align="center"> ${board.APPEAL_REFERENCE}</td>
            <td align="center"> ${board.BJ_NM} ${board.BONBUN}<c:if test="${board.BUBUN != null}">-</c:if>${board.BUBUN}</td>
            <td align="center"> ${board.JUMYONGJI_DORO_ADDR} </td>
            <td align="center"> ${board.GIGAN} </td>
            <td align="center"> ${board.BEFORE_PERMISSION}</td>
            <td align="center"> ${board.ROAD_ADDR}</td>
            <td align="center"> ${board.BD_NM}</td>
            <td align="center"> ${board.AREA_SIZE}</td>
            <td align="center"> ${board.PURPOSE_CLASSNM}</td>
			<td align="center"> ${board.PERCENT_RATE}</td>
			<td align="center"> ${board.PERCENT_REASON}</td>
            <td align="center"> ${board.REDUCTION_RATE}</td>
			<td align="center"> ${board.REDUCTION_REASON}</td>
			<td align="center"> ${board.PLACE_REFERENCE}</td>  
            <td align="center"> ${rnic:addDash(board.UP_DATE)}</td>                                                                                    
            <td align="center"> ${board.CHECK_NAME}</td>            
       	</tr>
	</c:forEach>

</table>
</body>
</html>

