<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ include file="/jsp/common/include.jsp"%>
<%@ include file="/jsp/common/loginCheck.jsp"%>

<html xmlns:x="urn:schemas-microsoft-com:office:excel">
    <head>
        <title>::::: 서울시 도로점용관리시스템 :::::</title>
    </head>

    <body>

        <%
                response.setContentType("application/vnd.ms-excel; charset=euc-kr");
                response.setHeader("Content-Disposition", "filename=정기분관리.xls"); 
                response.setHeader("Content-Description", "JSP Generated Data"); 
        %>

        <table width="1000" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
            <tr>
                <td width="70px" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">관리번호</td>
                <td width="150px" align="center" bgcolor="e5eff8" class="sub_table_b">점용인<br/>/법인명</td>
                <td align="center" bgcolor="e5eff8" class="sub_table_b">과세<br/>구분</td>
                <td align="center" bgcolor="e5eff8" class="sub_table_b">점용<br/>구분</td>
                <td align="center" bgcolor="e5eff8" class="sub_table_b">점용<br/>종류</td>
                <td align="center" bgcolor="e5eff8" class="sub_table_b">세입<br/>구분</td>
                <td align="center" bgcolor="e5eff8" class="sub_table_b">점용지<br/>소유</td>
                <td align="center" bgcolor="e5eff8" class="sub_table_b">점용지<br/>주소</td>
                <td align="center" bgcolor="e5eff8" class="sub_table_b">도로(하천/구거)<br/>주소</td>
                <td align="center" bgcolor="e5eff8" class="sub_table_b">점용목적</td>
                <td align="center" bgcolor="e5eff8" class="sub_table_b">전년도<br/>점용면적</td>
                <td align="center" bgcolor="e5eff8" class="sub_table_b">전년도<br/>요율(단가)</td>
                <td align="center" bgcolor="e5eff8" class="sub_table_b">전년도<br/>공시지가</td>
                <td align="center" bgcolor="e5eff8" class="sub_table_b">전년도<br/>조정점용료</td>
                <td align="center" bgcolor="e5eff8" class="sub_table_b">현년도<br/>점용면적</td>
                <td align="center" bgcolor="e5eff8" class="sub_table_b">현년도<br/>요율(단가)</td>
                <td align="center" bgcolor="e5eff8" class="sub_table_b">현년도<br/>공시지가</td>
                <td align="center" bgcolor="e5eff8" class="sub_table_b">현년도<br/>점용료</td>
                <td align="center" bgcolor="e5eff8" class="sub_table_b">조정점용료</td>
                <td align="center" bgcolor="e5eff8" class="sub_table_b">최종점용료</td>
				<td align="center" bgcolor="e5eff8" class="sub_table_b">부가가치세</td>
                <td align="center" bgcolor="e5eff8" class="sub_table_b">납기후금액</td>
                <td align="center" bgcolor="e5eff8" class="sub_table_b">조정<br/>계수</td>
                <td align="center" bgcolor="e5eff8" class="sub_table_b">기본 산출식</td>
                <td align="center" bgcolor="e5eff8" class="sub_table_b">조정 산출식</td>
                <td align="center" bgcolor="e5eff8" class="sub_table_b">최종 산출식</td>
                <td align="center" bgcolor="e5eff8" class="sub_table_b">지분율</td>
                <td align="center" bgcolor="e5eff8" class="sub_table_b">지분율 사유</td>
                <td align="center" bgcolor="e5eff8" class="sub_table_b">감면율</td>
                <td align="center" bgcolor="e5eff8" class="sub_table_b">감면율 사유</td>
            </tr>

            <c:forEach items="${blist}" var="board" varStatus="idx">
                <tr>
                    <td align="center">${board.ADMIN_NO}</td>
                    <td align="center">${board.NAME}</td>
                    <td align="center">${board.SECTION_NAME}</td>
                    <td align="center">
                <c:choose>
                    <c:when test="${board.SECTION == '1'}">
	                	계속
                    </c:when>
                    <c:otherwise>
	                  	무단
                    </c:otherwise>
                </c:choose>
                </td>
                <td align="center">${board.TYPE_NAME}</td>
                <td align="center">${board.TAX_SET}</td>
                <td align="center">${board.OWNER_SET_NM}</td>
                <td align="center">${board.ADDR}</td>
                <td align="center">${board.ROAD_ADDR}</td>
                <td align="center">${board.PURPOSE_CLASSNM}</td>
                <td align="center">${board.OLD_AREA_SIZE}</td>
                <td align="center">${board.OLD_RATE}</td>
                <td align="center">${board.OLD_PRICE}</td>
                <td align="center">${board.SUM_LASTYEAR}</td>
                <td align="center">${board.AREA_AFTER}</td>
                <td align="center">${board.RATE}</td>
                <td align="center">${board.PRICE}</td>
                <td align="center">${board.SUM_YEAR}</td>
                <td align="center">${board.SUM_ADJUST}</td>
                <td align="center">${board.REDUCTION_SUM}</td>
                <td align="center">${board.VAT}</td>
                <td align="center">${board.OVERTAX}</td>
                <td align="center">${board.ADJUSTMENT}</td>
                <td align="center">${board.FORM}</td>
                <td align="center">${board.FORM_ADJUST}</td>
                <td align="center">${board.REDUCTION_FORM}</td>
                <td align="center">${board.PERCENT_RATE}</td>
                <td align="center">${board.PERCENT_REASON}</td>
                <td align="center">${board.REDUCTION_RATE}</td>
                <td align="center">${board.REDUCTION_REASON}</td>
                </tr>
            </c:forEach>


        </table>
</html>
