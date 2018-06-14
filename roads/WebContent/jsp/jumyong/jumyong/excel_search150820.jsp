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
 	response.setHeader("Content-Disposition", "filename=������ȸ����.xls"); 
 	response.setHeader("Content-Description", "JSP Generated Data"); 
%>

<table width="800" border="0" cellpadding="0" cellspacing="0">
     <tr>
       <td height="35" align="center" bgcolor="e5eff8" class="sub_table_b" width="50">��ȣ</td>
       <td align="center" bgcolor="e5eff8" class="sub_table_b">������ȣ</td>
       <td align="center" bgcolor="e5eff8" class="sub_table_b">��������</td>
       <td align="center" bgcolor="e5eff8" class="sub_table_b">���뱸��</td>
       <td align="center" bgcolor="e5eff8" class="sub_table_b">�ֹι�ȣ(���ι�ȣ)</td>
       <td align="center" bgcolor="e5eff8" class="sub_table_b">������ �����ȣ</td>
       <td align="center" bgcolor="e5eff8" class="sub_table_b">������ �ּ�</td>
       <td align="center" bgcolor="e5eff8" class="sub_table_b">������ ���θ� �ּ�</td>
       <td align="center" bgcolor="e5eff8" class="sub_table_b">���� �۴��� ���θ� �ּ�</td>
       <td align="center" bgcolor="e5eff8" class="sub_table_b">���Ա���</td>
       <td align="center" bgcolor="e5eff8" class="sub_table_b">����������</td>
       <td align="center" bgcolor="e5eff8" class="sub_table_b">����ڵ�Ϲ�ȣ</td>
       <td align="center" bgcolor="e5eff8" class="sub_table_b">����</td>
       <td align="center" bgcolor="e5eff8" class="sub_table_b">����</td>
       <!--  //********** BEGIN_KANG_20120710 -->
       <td align="center" bgcolor="e5eff8" class="sub_table_b">��ǥ�ڸ�</td>
       <td align="center" bgcolor="e5eff8" class="sub_table_b">��ȣ��</td>
       <td align="center" bgcolor="e5eff8" class="sub_table_b">����� �ּ�</td>
		<!--   //********** END_KANG_20120710 -->
       <td align="center" bgcolor="e5eff8" class="sub_table_b">������/���θ�</td>
       <td align="center" bgcolor="e5eff8" class="sub_table_b">������ ��ȭ��ȣ</td>
       <td align="center" bgcolor="e5eff8" class="sub_table_b">������ �ڵ���</td>
       <td align="center" bgcolor="e5eff8" class="sub_table_b">������ �̸���</td>       
       <td align="center" bgcolor="e5eff8" class="sub_table_b">���(������)</td>
       <td align="center" bgcolor="e5eff8" class="sub_table_b">������</td>
       <td align="center" bgcolor="e5eff8" class="sub_table_b">������ ���θ� �ּ�</td>
       <td align="center" bgcolor="e5eff8" class="sub_table_b">����Ⱓ</td>
       <td align="center" bgcolor="e5eff8" class="sub_table_b">���� �㰡��ȣ</td>
       <td align="center" bgcolor="e5eff8" class="sub_table_b">�����ּ�</td>
       <td align="center" bgcolor="e5eff8" class="sub_table_b">�ǹ�(��) ����</td>
       <td align="center" bgcolor="e5eff8" class="sub_table_b">����(��)</td>   
	   <td align="center" bgcolor="e5eff8" class="sub_table_b">��������ڵ�</td> 
	   <td align="center" bgcolor="e5eff8" class="sub_table_b">������</td>
       <td align="center" bgcolor="e5eff8" class="sub_table_b">������ ����</td>
	   <td align="center" bgcolor="e5eff8" class="sub_table_b">������</td>
       <td align="center" bgcolor="e5eff8" class="sub_table_b">������ ����</td>
       <td align="center" bgcolor="e5eff8" class="sub_table_b">���(������)</td>    
       <td align="center" bgcolor="e5eff8" class="sub_table_b">��������</td>                                                
       <td align="center" bgcolor="e5eff8" class="sub_table_b">���俩��</td>
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

