<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ include file="/jsp/common/include.jsp"%>
<%@ include file="/jsp/common/loginCheck.jsp" %>

<html xmlns:x="urn:schemas-microsoft-com:office:excel">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=euc-kr" />
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
       <td height="28" align="center" bgcolor="e5eff8" class="sub_table_b">��ȣ</td>
       <td align="center" bgcolor="e5eff8" class="sub_table_b">������ȣ</td>
       <td align="center" bgcolor="e5eff8" class="sub_table_b">�⵵</td>
       <td align="center" bgcolor="e5eff8" class="sub_table_b">������ȣ</td>
       <td align="center" bgcolor="e5eff8" class="sub_table_b">��������</td>
       <td align="center" bgcolor="e5eff8" class="sub_table_b">������</td>
       <td align="center" bgcolor="e5eff8" class="sub_table_b">���Ա���</td>
       <td align="center" bgcolor="e5eff8" class="sub_table_b">���뱸��</td>
       <td align="center" bgcolor="e5eff8" class="sub_table_b">�����ڵ�</td>
       <td align="center" bgcolor="e5eff8" class="sub_table_b">������</td>
	   <td align="center" bgcolor="e5eff8" class="sub_table_b">������ ������</td>
	   <td align="center" bgcolor="e5eff8" class="sub_table_b">������ ������</td>
	   <td align="center" bgcolor="e5eff8" class="sub_table_b">������ ����</td>	
	   <td align="center" bgcolor="e5eff8" class="sub_table_b">�������</td>
       <td align="center" bgcolor="e5eff8" class="sub_table_b">����<br/>��/��</td>
       <td align="center" bgcolor="e5eff8" class="sub_table_b">����(�����)</td>
       <td align="center" bgcolor="e5eff8" class="sub_table_b">�ΰ���ġ��</td>
       <td align="center" bgcolor="e5eff8" class="sub_table_b">�ΰ�����</td>
       <%--  //********** BEGIN_����_20120321 --%>
       <td align="center" bgcolor="e5eff8" class="sub_table_b">�ΰ���</td>
       <td align="center" bgcolor="e5eff8" class="sub_table_b">��ǥ�ڸ�</td>
       <td align="center" bgcolor="e5eff8" class="sub_table_b">����� �ּ�</td>
		<%--   //********** END_����_20120321 --%>
		<%--  //********** BEGIN_KANG_20120417 --%>
		<td align="center" bgcolor="e5eff8" class="sub_table_b">��ȣ��</td>
		<%--  //********** BEGIN_KANG_20120710 --%>
		<td aling="center" bgcolor="e5eff8" class="sub_table_b">�ֹ�/���ι�ȣ</td>
		<td align="center" bgcolor="e5eff8" class="sub_table_b">����ڵ�Ϲ�ȣ</td>
       <td align="center" bgcolor="e5eff8" class="sub_table_b">����</td>
       <td align="center" bgcolor="e5eff8" class="sub_table_b">����</td>
		<%--   //********** END_KANG_20120710 --%>
       <td align="center" bgcolor="e5eff8" class="sub_table_b">E-MAIL</td>
		<%--   //********** END_KANG_20120417 --%>
       <td align="center" bgcolor="e5eff8" class="sub_table_b">��������</td>
       <td align="center" bgcolor="e5eff8" class="sub_table_b">��������</td>
       <td align="center" bgcolor="e5eff8" class="sub_table_b">����Ⱓ</td> 
       <td align="center" bgcolor="e5eff8" class="sub_table_b">�ۼ�����</td>
       <td align="center" bgcolor="e5eff8" class="sub_table_b">�ΰ�����</td>
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
	        	<%--  //********** BEGIN_����_20120321 --%>
	        	<td align="center">${board.TAX_DATE_DD}</td>
	        	<td align="center">${board.EXPONENT}</td>
	        	<td align="center">${board.BUSINESSADDR}</td>
				<%--   //********** END_����_20120321 --%>
				<%--  //********** BEGIN_KANG_20120417 --%>
				<td align="center">${board.COMPANY_NAME}</td>
				<%-- ********** BEGIN_KANG_20120710 --%>
				<%-- 2013.04.01 yjmoon �ֹ�/���� ��ȣ �ʵ� �߰�. --%>
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
				<td align="center" class="sub_table" colspan="13" height="85">�˻��� ������ �����ϴ�</td>
			</tr>
		</c:otherwise>
	 </c:choose>

</table>
</body>
</html>

