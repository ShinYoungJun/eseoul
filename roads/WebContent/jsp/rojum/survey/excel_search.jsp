<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ include file="/jsp/common/loginCheck.jsp" %>
<%@ include file="/jsp/common/include.jsp"%>

<html xmlns:x="urn:schemas-microsoft-com:office:excel">
<head>
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
 	response.setHeader("Content-Disposition", "filename=�Ÿ����Խ�������.xls"); 
 	response.setHeader("Content-Description", "JSP Generated Data"); 
%>

<%-- 20121024 by ksic �� ������ �ּ� �߰� ���� --%>
<!-- <table width="10000px" cellpadding="0" cellspacing="0" border="1" class="sub_table" bordercolor="#c9dfed" style="border-collapse: collapse;"> -->
<table width="10400px" cellpadding="0" cellspacing="0" border="1" class="sub_table" bordercolor="#c9dfed" style="border-collapse: collapse;">
<%-- 20121024 by ksic �� ������ �ּ� �߰� �� --%>
<tr >
	<td height="26px" width="400px" align="center" bgcolor="e5eff8" class="sub_table_b">������ȣ</td>
	<td width="400px" align="center" bgcolor="e5eff8" class="sub_table_b">���</td>
	<td width="400px" align="center" bgcolor="e5eff8" class="sub_table_b">������ �ּ�</td>
	<td width="400px" align="center" bgcolor="e5eff8" class="sub_table_b">���θ� �ּ�</td>	
	<%-- 20121024 by ksic �� ������ �ּ� �߰� ���� --%>
	<td width="400px" align="center" bgcolor="e5eff8" class="sub_table_b">�⺻ �ּ�</td>
	<%-- 20121024 by ksic �� ������ �ּ� �߰� �� --%>
	<!--  //********** BEGIN_����_20120313 -->
	<td width="400px" align="center" bgcolor="e5eff8" class="sub_table_b">����</td>
	<!--   //********** END_����_20120313 -->
	<td width="400px" align="center" bgcolor="e5eff8" class="sub_table_b">�ü� ����</td>
	<td width="400px" align="center" bgcolor="e5eff8" class="sub_table_b">����(��)</td>														
	<td width="400px" align="center" bgcolor="e5eff8" class="sub_table_b">����/����</td>
	<td width="400px" align="center" bgcolor="e5eff8" class="sub_table_b">�Ÿ�����</td>
	<td width="400px" align="center" bgcolor="e5eff8" class="sub_table_b">Ưȭ�Ÿ� ��������</td>
	<td width="400px" align="center" bgcolor="e5eff8" class="sub_table_b">��ġ����</td>
	<td width="400px" align="center" bgcolor="e5eff8" class="sub_table_b">�������</td>
	<td width="400px" align="center" bgcolor="e5eff8" class="sub_table_b">�ֹι�ȣ</td>
	<td width="400px" align="center" bgcolor="e5eff8" class="sub_table_b">��ȭ��ȣ</td>
	<td width="400px" align="center" bgcolor="e5eff8" class="sub_table_b">���ǰ��</td>
	<td width="400px" align="center" bgcolor="e5eff8" class="sub_table_b">���Դ�ü</td>
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
	<%-- 20121024 by ksic �� ������ �ּ� �߰� ���� --%>
	<td width="400px" align="center" >${board.ADDR_JIBUN}</td>
	<%-- 20121024 by ksic �� ������ �ּ� �߰� �� --%>
	<!--  //********** BEGIN_����_20120313 -->
	<td width="400px" align="center" >
	<!--  //********** BEGIN_����_20120315 -->
	<c:if test="${board.GUGAN_CD!=0 && board.GUGAN_CD!=null}">
	�� ${board.GUGAN_CD}����
	</c:if>
	<!--   //********** END_����_20120315 -->
	</td>
	<!--   //********** END_����_20120313 -->																			
	<td width="400px" align="center" >${board.FT_TYP_NM}&nbsp;/&nbsp;${board.FT_SEL_NM}</td>
	<td width="400px" align="center" >${board.PLACE_A}</td>
	<td width="400px" align="center" >
	<c:choose>
	<c:when test="${board.MAINTN_OB == '1'}">�������</c:when>
	<c:otherwise>������</c:otherwise>
	</c:choose>
	</td>
	<td width="400px" align="center">
		<c:choose>
		<c:when test="${board.SPECIAL_ST == '1'}">�ϹݰŸ�</c:when>
		<c:otherwise>Ưȭ�Ÿ�</c:otherwise>
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

