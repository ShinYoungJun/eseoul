<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ include file="/jsp/common/include.jsp"%>
<%@ include file="/jsp/common/loginCheck.jsp"%>

<html xmlns:x="urn:schemas-microsoft-com:office:excel">
    <head>
        <title>::::: ����� ������������ý��� :::::</title>
    </head>

    <body>

        <%
                response.setContentType("application/vnd.ms-excel; charset=euc-kr");
                response.setHeader("Content-Disposition", "filename=����а���.xls"); 
                response.setHeader("Content-Description", "JSP Generated Data"); 
        %>

        <table width="1000" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
            <tr>
                <td width="70px" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">������ȣ</td>
                <td width="150px" align="center" bgcolor="e5eff8" class="sub_table_b">������<br/>/���θ�</td>
                <td align="center" bgcolor="e5eff8" class="sub_table_b">����<br/>����</td>
                <td align="center" bgcolor="e5eff8" class="sub_table_b">����<br/>����</td>
                <td align="center" bgcolor="e5eff8" class="sub_table_b">����<br/>����</td>
                <td align="center" bgcolor="e5eff8" class="sub_table_b">����<br/>����</td>
                <td align="center" bgcolor="e5eff8" class="sub_table_b">������<br/>����</td>
                <td align="center" bgcolor="e5eff8" class="sub_table_b">������<br/>�ּ�</td>
                <td align="center" bgcolor="e5eff8" class="sub_table_b">����(��õ/����)<br/>�ּ�</td>
                <td align="center" bgcolor="e5eff8" class="sub_table_b">�������</td>
                <td align="center" bgcolor="e5eff8" class="sub_table_b">���⵵<br/>�������</td>
                <td align="center" bgcolor="e5eff8" class="sub_table_b">���⵵<br/>����(�ܰ�)</td>
                <td align="center" bgcolor="e5eff8" class="sub_table_b">���⵵<br/>��������</td>
                <td align="center" bgcolor="e5eff8" class="sub_table_b">���⵵<br/>���������</td>
                <td align="center" bgcolor="e5eff8" class="sub_table_b">���⵵<br/>�������</td>
                <td align="center" bgcolor="e5eff8" class="sub_table_b">���⵵<br/>����(�ܰ�)</td>
                <td align="center" bgcolor="e5eff8" class="sub_table_b">���⵵<br/>��������</td>
                <td align="center" bgcolor="e5eff8" class="sub_table_b">���⵵<br/>�����</td>
                <td align="center" bgcolor="e5eff8" class="sub_table_b">���������</td>
                <td align="center" bgcolor="e5eff8" class="sub_table_b">���������</td>
				<td align="center" bgcolor="e5eff8" class="sub_table_b">�ΰ���ġ��</td>
                <td align="center" bgcolor="e5eff8" class="sub_table_b">�����ıݾ�</td>
                <td align="center" bgcolor="e5eff8" class="sub_table_b">����<br/>���</td>
                <td align="center" bgcolor="e5eff8" class="sub_table_b">�⺻ �����</td>
                <td align="center" bgcolor="e5eff8" class="sub_table_b">���� �����</td>
                <td align="center" bgcolor="e5eff8" class="sub_table_b">���� �����</td>
                <td align="center" bgcolor="e5eff8" class="sub_table_b">������</td>
                <td align="center" bgcolor="e5eff8" class="sub_table_b">������ ����</td>
                <td align="center" bgcolor="e5eff8" class="sub_table_b">������</td>
                <td align="center" bgcolor="e5eff8" class="sub_table_b">������ ����</td>
            </tr>

            <c:forEach items="${blist}" var="board" varStatus="idx">
                <tr>
                    <td align="center">${board.ADMIN_NO}</td>
                    <td align="center">${board.NAME}</td>
                    <td align="center">${board.SECTION_NAME}</td>
                    <td align="center">
                <c:choose>
                    <c:when test="${board.SECTION == '1'}">
	                	���
                    </c:when>
                    <c:otherwise>
	                  	����
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
