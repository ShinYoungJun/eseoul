<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ include file="/jsp/common/loginCheck.jsp" %>
<%@ include file="/jsp/common/include.jsp"%>

<html xmlns:x="urn:schemas-microsoft-com:office:excel">
<head>
<title>::::: ����� ������������ý��� :::::</title>


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
 	response.setHeader("Content-Disposition", "filename=�ο����� ��ȸ����.xls"); 
 	response.setHeader("Content-Description", "JSP Generated Data"); 
%>


<table width="800" border="0" cellpadding="0" cellspacing="0">

	<tr>
	                        <td height="35" align="center" bgcolor="e5eff8" class="sub_table_b" nowrap="nowrap">������ȣ</td>
	                        <td align="center" bgcolor="e5eff8" class="sub_table_b" nowrap="nowrap">�����ڸ�</td>
	                       	<td align="center" bgcolor="e5eff8" class="sub_table_b" nowrap="nowrap">�㰡����</td>
	                        <td align="center" bgcolor="e5eff8" class="sub_table_b" nowrap="nowrap">���뱸��</td>
	                        <td align="center" bgcolor="e5eff8" class="sub_table_b" nowrap="nowrap">�������</td>
	                        <td align="center" bgcolor="e5eff8" class="sub_table_b" nowrap="nowrap">����</td>
	                        <td align="center" bgcolor="e5eff8" class="sub_table_b" nowrap="nowrap">����<br/>��</td>
	                        <td align="center" bgcolor="e5eff8" class="sub_table_b" nowrap="nowrap">����Ⱓ</td>
	                        <td align="center" bgcolor="e5eff8" class="sub_table_b" nowrap="nowrap">������</td>
	                        <td align="center" bgcolor="e5eff8" class="sub_table_b" nowrap="nowrap">�ǹ� ����</td>
	                        <td align="center" bgcolor="e5eff8" class="sub_table_b" nowrap="nowrap">���� ����</td>
	</tr>
	<c:choose>
		<c:when test='${blist != null && !empty blist}'>
			<c:forEach items="${blist}" var="board" varStatus="idx">
				<tr onMouseOver="this.style.backgroundColor='#f6f7f8'" onMouseOut="this.style.backgroundColor=''" style="cursor:pointer" onClick="javascript:View('${board.SERIAL_NBR}','${board.GU_CODE}');">
					<td height="26" align="center">${board.SERIAL_NBR}</td>
                    <td align="center">${board.JUMNM}</td>
            		<td align="center">${board.HEOGA_NM}</td>
				    <td align="center">${board.JIMOK_NM}</td>
				    <td align="center">${board.JUMMOK_NM}</td>     
				    <td align="center">${board.JUMYO}</td>
				    <td align="center">${board.JUMDAN}</td>
				    <td align="center">${board.HH_DATE}</td>      
                    <td align="center">${board.HJNM}</td>        
                    <td align="center">${board.JIBUN}</td>
                    <td align="center">
                    	${board.BUN}<c:if test="${board.JI != null}">-</c:if>${board.JI}
                    </td>
                  </tr>
			 </c:forEach>
		</c:when>
		<c:otherwise>
			<tr>
				<td align="center" class="sub_table" colspan="11" height="85">�˻��� ������ �����ϴ�</td>
			</tr>
		</c:otherwise>
	</c:choose>

</table>

</body>
</html>