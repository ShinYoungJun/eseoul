<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ include file="/jsp/common/loginCheck.jsp" %>
<%@ include file="/jsp/common/include.jsp"%>

<html xmlns:x="urn:schemas-microsoft-com:office:excel">
<head>
<!--  //********** BEGIN_KANG_20120404 -->
<meta http-equiv="Content-Type" content="text/html; charset=euc-kr" />
<!--   //********** END_KANG_20120404 -->
<title>::::: ����� ������������ý��� :::::</title>
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
 	response.setHeader("Content-Disposition", "filename=���ܼ��԰���.xls"); 
 	response.setHeader("Content-Description", "JSP Generated Data"); 
%>

<table width="800" border="0" cellpadding="0" cellspacing="0">
     <tr>
		<td width="60px" align="center" bgcolor="e5eff8" class="sub_table_b" width="50">��ȣ</td>
        <td width="100px" align="center" bgcolor="e5eff8" class="sub_table_b">������ȣ</td>
        <td width="60px" align="center" bgcolor="e5eff8" class="sub_table_b">����⵵</td>
        <td width="60px" align="center" bgcolor="e5eff8" class="sub_table_b">������ȣ</td>
        <td width="80px" align="center" bgcolor="e5eff8" class="sub_table_b">���</td>
        <td width="150px" align="center" bgcolor="e5eff8" class="sub_table_b">�������ּ�</td>
        <!-- 
        <td width="150px" align="center" bgcolor="e5eff8" class="sub_table_b">���������ּ�</td>
         -->
        <td width="60px" align="center" bgcolor="e5eff8" class="sub_table_b">���Ա���</td>
        <td width="80px" align="center" bgcolor="e5eff8" class="sub_table_b">�ü�����</td>
        <td width="60px" align="center" bgcolor="e5eff8" class="sub_table_b">�ΰ�����</td>
        <td width="70px" align="center" bgcolor="e5eff8" class="sub_table_b">����(��)</td>
        <td width="100px" align="center" bgcolor="e5eff8" class="sub_table_b">�۳⵵<br/>�ΰ��ݾ�</td>
        <td width="100px" align="center" bgcolor="e5eff8" class="sub_table_b">���⵵<br/>�ΰ��ݾ�</td>
        <td width="100px" align="center" bgcolor="e5eff8" class="sub_table_b">��������</td>                                                
        <td width="150px" align="center" bgcolor="e5eff8" class="sub_table_b">��������</td>                                                
        <td width="60px" align="center" bgcolor="e5eff8" class="sub_table_b">�ΰ�����</td>
        <%--  //********** BEGIN_KANG_20120404 --%>
        <td width="60px" align="center" bgcolor="e5eff8" class="sub_table_b">��������</td>
				<td width="100px" align="center" bgcolor="e5eff8" class="sub_table_b">������</td>
				<%--   //********** END_KANG_20120404 --%>
				<%-- [20130418] �߰� ��û �ʵ�  --%>
				<td width="60px" align="center" bgcolor="e5eff8" class="sub_table_b">�ü�������</td>
				<td width="60px" align="center" bgcolor="e5eff8" class="sub_table_b">��������</td>
				<td width="60px" align="center" bgcolor="e5eff8" class="sub_table_b">������ ����</td>
				<td width="60px" align="center" bgcolor="e5eff8" class="sub_table_b">������ ����</td>
				<td width="60px" align="center" bgcolor="e5eff8" class="sub_table_b">����</td>
				<td width="60px" align="center" bgcolor="e5eff8" class="sub_table_b">������</td>
				<td width="60px" align="center" bgcolor="e5eff8" class="sub_table_b">�������</td>
				<td width="60px" align="center" bgcolor="e5eff8" class="sub_table_b">�������</td>
				<td width="60px" align="center" bgcolor="e5eff8" class="sub_table_b">�Ϲ� �����</td>
				<td width="60px" align="center" bgcolor="e5eff8" class="sub_table_b">���� �����</td>
				<%-- END  --%>
     </tr>
                          
     <c:forEach items="${blist}" var="board" varStatus="idx">
       	<tr>
			<td width="60px" height="26" align="center">${board.RN}</td>
			<td width="100px" align="center">${board.GAPAN_NO}</script></td>
			<td width="60px" align="center">${board.SUM_YEAR}</td>
			<td width="60px" align="center">${board.TAX_NO}</td>
			<td width="80px" align="center">${board.NAME}</td>
			<td width="150px" align="center">${board.ADDR}</td>
			<!-- 
			<td width="150px" align="center">${board.SI}&nbsp;${board.GUN}&nbsp;${board.DORO_NM}&nbsp;${board.BD_BON}&nbsp;${board.BD_BU}&nbsp;${board.BD_NM}&nbsp;${board.BD_DET_NM}</td>
			 -->
			<td width="60px" align="center" >${board.TAX_SET}</td>
			<td width="80px" align="center">${board.FT_TYP}</td>
			<td width="60px" align="center">${board.CAL_NAME}</td>
			<td width="70px" align="center">${board.AREA_SIZE}</td>
			<td width="100px" align="center">${rnic:insertComma2(board.SUM_LASTYEAR)}</td>
			<td width="100px" align="center">${rnic:insertComma2(board.SUM)}</td>
			<td width="100px" align="center">${board.REQ_DATE}</td>
			<td width="150px" align="center">${board.SANCHULGIGAN}</td>
			<td width="60px" class="sub_table_r" align="center">${board.TAX_YN}</td>  
			<!--  //********** BEGIN_KANG_20120404 -->
			<td width="60px" class="sub_table_r" align="center">${board.SUNAP_YN}</td>
			<td width="100px" align="center">${board.SUNAP_DATE}</td>
			<!--   //********** END_KANG_20120404 -->
			<%-- [20130418] �߰� ��û �ʵ�  --%>
			<td width="60px" class="sub_table_r" align="center">${board.SF_VALUE}</td>
			<td width="60px" class="sub_table_r" align="center">${board.PRICE}</td>
			<td width="60px" class="sub_table_r" align="center">${board.AREA_BEFORE}</td>
			<td width="60px" class="sub_table_r" align="center">${board.AREA_AFTER}</td>
			<td width="60px" class="sub_table_r" align="center">${board.RATE}</td>
			<td width="60px" class="sub_table_r" align="center">${board.REDUCTION_RATE}</td>
			<td width="60px" class="sub_table_r" align="center">${board.REDUCTION_REASON}</td>
			<td width="60px" class="sub_table_r" align="center">${board.ADJUSTMENT}</td>
			<td width="60px" class="sub_table_r" align="center">${board.FORM}</td>
			<td width="60px" class="sub_table_r" align="center">${board.FORM_ADJUST}</td>
			<%-- END  --%>	
    </tr>
	</c:forEach>

</table>
</body>
</html>

