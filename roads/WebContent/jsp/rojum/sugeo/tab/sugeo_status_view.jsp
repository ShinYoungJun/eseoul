<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ include file="/jsp/common/loginCheck.jsp"%>
<%@ include file="/jsp/common/include.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=euc-kr" />

<title>::::: ����� ������������ý��� :::::</title>
<style type="text/css">
<!--
body {
	margin: 0px;
	background-image: url/ img/ left_back.gif );
}
-->
</style>
<link href="/css/roads.css" rel="stylesheet" type="text/css">
</head>

<script language="javascript" src="/js/PopupCalendar.js"></script>
<script language='JavaScript' src='/js/Check_inputbox.js'></script>

<script type="text/javascript">
//<![CDATA[
           
    function goFine(){
		parent.document.getElementById("sugeo_bottom").src = "/rojum/sugeo/sugeo_fine_view.do?mul_no=${mul_no}";
    }



    function goSale(){
    	parent.document.getElementById("sugeo_bottom").src = "/rojum/sugeo/sugeo_sale_view.do?mul_no=${mul_no}";

    }

	
//]]>
</script>


<body>

<form name="form" method="post">
	<input type="hidden" name="mul_no" value="${mul_no}">
	<input type="hidden" name="status_code" value="${status_code}">
	
	

<table width="800" border="0" cellpadding="0" cellspacing="0">
	<tr>
		<td align="left">
		<table width="780" border="0" cellspacing="0" cellpadding="0">
			<tr>
				<td height="22" background="/img/tab_line_purple.gif"></td>
			</tr>

			<tr>
				<td align="left" class="contborder_purple">
					<table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse: collapse;" cellpadding="0" cellspacing="0" class="sub_table">
			
					<c:choose>
					<c:when test="${status_code == '0'}">
						<tr>
							<td width="100" height="26" align="center" bgcolor="e5eff8"	class="sub_table_b">�������</td>
							<td bgcolor="eaeaea" class="table_bl_left">
								�̵�� �����Դϴ�. ���������� �����Ͽ� ���������� �߰��ϼ���.
							</td>

						</tr>
						            
					</c:when>
					<c:when test="${status_code == '1'}">
						<tr>
							<td width="100" height="26" align="center" bgcolor="e5eff8"	class="sub_table_b">�������</td>
							<td bgcolor="eaeaea" class="table_bl_left" style="border:0">
								�������Դϴ�. �����Ⱓ ���� �ϼ� : ${d_day}��
							
							</td>
							<td bgcolor="eaeaea" class="table_bl_left" style="border:0;padding-top:3px" align="right">
								<img src="/img/fine_icon.gif" alt="���·�" border="0" onclick="javascript:goFine();" style="cursor:pointer" >
								<img src="/img/sale_icon.gif" alt="���/�Ű�" border="0" onclick="javascript:goSale();" style="cursor:pointer" >
							</td>
						</tr>
						
					</c:when>
					<c:when test="${status_code == '2'}">
						<tr>
							<td width="100" height="26" align="center" bgcolor="e5eff8"	class="sub_table_b">�������</td>
							<td bgcolor="eaeaea" class="table_bl_left" style="border:0">
								�����Ⱓ�� ����Ǿ����ϴ�. �����Ⱓ ���� �ϼ� : ${d_day}�� 
							</td>
							<td bgcolor="eaeaea" class="table_bl_left" style="border:0;padding-top:3px" align="right">
								<img src="/img/fine_icon.gif" alt="���·�" border="0" onclick="javascript:goFine();" style="cursor:pointer" >
								<img src="/img/sale_icon.gif" alt="���/�Ű�" border="0" onclick="javascript:goSale();" style="cursor:pointer" >
							</td>
						</tr>
	            
					</c:when>
					<c:when test="${status_code == '3'}">
						<tr>
							<td width="100" height="26" align="center" bgcolor="e5eff8"	class="sub_table_b">�������</td>
							<td bgcolor="eaeaea" class="table_bl_left" style="border:0">
								���·� �ݾ� ������ �Ϸ�Ǿ����� �̺ΰ� �����Դϴ�. 
							</td>

						</tr>
	            
					</c:when>
					<c:when test="${status_code == '4'}">
						<tr>
							<td width="100" height="26" align="center" bgcolor="e5eff8"	class="sub_table_b">�������</td>
							<td bgcolor="eaeaea" class="table_bl_left" style="border:0">
								�ΰ����� �Է��� �Ϸ�Ǿ����� �̺ΰ� �����Դϴ�. 
							</td>

						</tr>
	            
					</c:when>
					<c:when test="${status_code == '5'}">
						<tr>
							<td width="100" height="26" align="center" bgcolor="e5eff8"	class="sub_table_b">�������</td>
							<td bgcolor="eaeaea" class="table_bl_left" style="border:0">
								���·�(��������) �ΰ� ��  �̼��������Դϴ�.
							</td>

						</tr>
	            
					</c:when>
					<c:when test="${status_code == '6'}">
						<tr>
							<td width="100" height="26" align="center" bgcolor="e5eff8"	class="sub_table_b">�������</td>
							<td bgcolor="eaeaea" class="table_bl_left" style="border:0">
								���·�(��������) ���� �Ϸ�Ǿ����ϴ�.
							</td>
						</tr>
					</c:when>
					<c:when test="${status_code == '7'}">
						<tr>
							<td width="100" height="26" align="center" bgcolor="e5eff8"	class="sub_table_b">�������</td>
							<td bgcolor="eaeaea" class="table_bl_left" style="border:0">
								���·� �ΰ� ��  �̼��������Դϴ�. 
							</td>
						</tr>
					</c:when>
					<c:when test="${status_code == '8'}">
						<tr>
							<td width="100" height="26" align="center" bgcolor="e5eff8"	class="sub_table_b">�������</td>
							<td bgcolor="eaeaea" class="table_bl_left" style="border:0">
								���·� �ΰ� ��  ���� �Ϸ�Ǿ����ϴ�.
							</td>
						</tr>
					</c:when>
					<c:when test="${status_code == '9'}">

					</c:when>
					<c:when test="${status_code == '10'}">
						<tr>
							<td width="100" height="26" align="center" bgcolor="e5eff8"	class="sub_table_b">�������</td>
							<td bgcolor="eaeaea" class="table_bl_left" style="border:0">
								��� �������Դϴ�.
							</td>
						</tr>
					</c:when>
					<c:when test="${status_code == '11'}">
						<tr>
							<td width="100" height="26" align="center" bgcolor="e5eff8"	class="sub_table_b">�������</td>
							<td bgcolor="eaeaea" class="table_bl_left" style="border:0">
								�Ű� �������Դϴ�. 
							</td>
						</tr>
					</c:when>
					<c:when test="${status_code == '12'}">
						<tr>
							<td width="100" height="26" align="center" bgcolor="e5eff8"	class="sub_table_b">�������</td>
							<td bgcolor="eaeaea" class="table_bl_left" style="border:0">
								��� �Ϸ�Ǿ����ϴ�.
							</td>
						</tr>
					</c:when>
					
					<c:when test="${status_code == '13'}">
						<tr>
							<td width="100" height="26" align="center" bgcolor="e5eff8"	class="sub_table_b">�������</td>
							<td bgcolor="eaeaea" class="table_bl_left" style="border:0">
								�Ű� �Ϸ�Ǿ����ϴ�.
							</td>
						</tr>
					</c:when>
					
					<c:otherwise>
					</c:otherwise>
					</c:choose>
					</table>
				</td>

			</tr>
		</table>
		</td>
	</tr>
</table>
</form>

</body>
</html>
