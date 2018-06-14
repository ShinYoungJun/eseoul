<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ include file="/jsp/common/loginCheck.jsp" %>
<%@ include file="/jsp/common/include.jsp"%>


<html xmlns:x="urn:schemas-microsoft-com:office:excel">
<head>
<!--  //********** BEGIN_KANG_20120423 -->
<meta http-equiv="Content-Type" content="text/html; charset=euc-kr" />
<!--   //********** END_KANG_20120423 -->
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
 	response.setHeader("Content-Disposition", "filename=�����󿵾��ü�������.xls"); 
 	response.setHeader("Content-Description", "JSP Generated Data");
%>
<table width="780" border="0" cellpadding="0" cellspacing="0">
	<tr>
		<td width="80px" align="center" bgcolor="e5eff8" class="sub_table_b" width="50">��ȣ</td>
		<td width="100px" align="center" bgcolor="e5eff8" class="sub_table_b">������ȣ</td>
		<!--  //********** BEGIN_KANG_20120423 -->
		<td width="130px" align="center" bgcolor="e5eff8" class="sub_table_b">�ü��� ��ȣ</td>
		<!--   //********** END_KANG_20120423 -->	
		<td width="60px" align="center" bgcolor="e5eff8" class="sub_table_b">���Ա���</td>
		<td width="100px" align="center" bgcolor="e5eff8" class="sub_table_b">���</td>
		<td width="150px" align="center" bgcolor="e5eff8" class="sub_table_b">������</td>
		<!-- 
		<td width="150px" align="center" bgcolor="e5eff8" class="sub_table_b">���������ּ�</td>
		 -->
		<!--  //********** BEGIN_KANG_20120423 -->
		<td width="100px" align="center" bgcolor="e5eff8" class="sub_table_b">��ȭ��ȣ</td>
		<td width="100px" align="center" bgcolor="e5eff8" class="sub_table_b">�޴���ȭ</td>
		<!--   //********** END_KANG_20120423 -->	
		<td width="80px" align="center" bgcolor="e5eff8" class="sub_table_b">�ü�����</td>
		<td width="60px" align="center" bgcolor="e5eff8" class="sub_table_b">����</td>
		
		<td width="100px" align="center" bgcolor="e5eff8" class="sub_table_b">���ݳ���</td>
		<td width="100px" align="center" bgcolor="e5eff8" class="sub_table_b">ó������</td>
		
		<td width="150px" align="center" bgcolor="e5eff8" class="sub_table_b">����Ⱓ</td>
		<td width="70px" align="center" bgcolor="e5eff8" class="sub_table_b">����(��)</td>                       
		<td width="100px" align="center" bgcolor="e5eff8" class="sub_table_b">��������</td>                                                 
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