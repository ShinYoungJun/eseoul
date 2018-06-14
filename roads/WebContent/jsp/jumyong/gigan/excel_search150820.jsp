<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
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
 	response.setHeader("Content-Disposition", "filename=�Ⱓ��ȸ����.xls"); 
 	response.setHeader("Content-Description", "JSP Generated Data"); 
%>

<table width="800" border="0" cellpadding="0" cellspacing="0">
    <tr>
      <td width="30" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">��ȣ</td>
      <td width="70" align="center" bgcolor="e5eff8" class="sub_table_b">������ȣ</td>
      <td width="60" align="center" bgcolor="e5eff8" class="sub_table_b">��������</td>
      <td width="60" align="center" bgcolor="e5eff8" class="sub_table_b">���뱸��</td>
      <td align="center" bgcolor="e5eff8" class="sub_table_b">������</td>
      <td align="center" bgcolor="e5eff8" class="sub_table_b">����ó</td>
      <td align="center" bgcolor="e5eff8" class="sub_table_b">HP</td>
      <td align="center" bgcolor="e5eff8" class="sub_table_b">�����ȣ</td>
      <td align="center" bgcolor="e5eff8" class="sub_table_b">������ �ּ�</td>
      <td align="center" bgcolor="e5eff8" class="sub_table_b">������ �� �ּ�</td>
      <td align="center" bgcolor="e5eff8" class="sub_table_b">���� �۴��� �����ȣ</td>
      <td align="center" bgcolor="e5eff8" class="sub_table_b">���� �۴��� �ּ�</td>
      <td align="center" bgcolor="e5eff8" class="sub_table_b">���� �۴��� ���θ��ּ�</td>
      <td align="center" bgcolor="e5eff8" class="sub_table_b">���� ������ </td>
      <td align="center" bgcolor="e5eff8" class="sub_table_b">������ ����ó</td>
      <td align="center" bgcolor="e5eff8" class="sub_table_b">����(��)</td>
      <td align="center" bgcolor="e5eff8" class="sub_table_b">�ֹι�ȣ</td>
      <td align="center" bgcolor="e5eff8" class="sub_table_b">������</td>
      <td align="center" bgcolor="e5eff8" class="sub_table_b">�����ּ�</td>
      <td align="center" bgcolor="e5eff8" class="sub_table_b">�ǹ�(��) ����</td>
      <td align="center" bgcolor="e5eff8" class="sub_table_b">������ ���θ��ּ�</td>
      <td align="center" bgcolor="e5eff8" class="sub_table_b">�������</td>
      <td width="150" align="center" bgcolor="e5eff8" class="sub_table_b">����Ⱓ</td>
      <td align="center" bgcolor="e5eff8" class="sub_table_b">������</td>
      <td align="center" bgcolor="e5eff8" class="sub_table_b">������ ����</td>
      <td align="center" bgcolor="e5eff8" class="sub_table_b">������</td>
      <td align="center" bgcolor="e5eff8" class="sub_table_b">������ ����</td>           
    </tr>
  	
 	<c:forEach items="${blist}" var="board" varStatus="idx">
    	<tr>
	    <td height="26" align="center">${board.RN}</td>
			<td align="center">${board.ADMIN_NO}</td>
			<td align="center">${board.TYPE}</td>
			<td align="center">${board.SECTION_NAME}</td>
			<td align="center">${board.NAME}</td>
			<td align="center">${board.TEL}</td>
			<td align="center">${board.HP}</td>
			<td align="center">${board.POST}</td>
      <td align="center">${board.APPEAL_ADDR}</td>
      <td align="center">${board.SI} ${board.GUN} ${board.DORO_NM} ${board.BD_BON} ${board.BD_BU} ${board.BD_NM} ${board.BD_DET_NM}</td>
      <td align="center">${board.TOPOST}</td>
      <td align="center">${board.SONGDALGI}</td>
			<td align="center">${board.TONM}</td>
			<td align="center">${board.TOTEL}</td>
			<td align="center">${board.TOHP}</td>
      <td align="center">${board.AREA_SIZE}</td>
      <td align="center">${board.SSN}</td>
			<td align="center">${board.JUMYONGJI}</td>
			<td align="center">${board.ROAD_ADDR}</td>
			<td align="center">${board.BD_NM}</td>
			<td align="center">${board.JUMYONGJI_DORO_ADDR}</td>
			<td align="center">${board.PURPOSE_CLASS} ${board.PURPOSE_SORT} ${board.PURPOSE_KIND}</td>
			<td align="center">${board.GIGAN}</td>
			<td align="center">${board.PERCENT_RATE}</td>
			<td align="center">${board.PERCENT_REASON}</td>
			<td align="center">${board.REDUCTION_RATE}</td>
			<td align="center">${board.REDUCTION_REASON}</td>
		</tr>
	</c:forEach>
	
</table>
</body>
</html>

