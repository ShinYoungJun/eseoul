<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ include file="/jsp/common/loginCheck.jsp" %>
<%@ include file="/jsp/common/include.jsp" %>      
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">


<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=euc-kr" />

<title>::::: ����� ������������ý��� :::::</title>
<style type="text/css">

<!--
body {
	margin: 0px;
}
-->

</style>
<link href="/css/roads.css" rel="stylesheet" type="text/css">
</head>

<script type="text/javascript">
//<![CDATA[

	function goModify()
	{
		location.href = "/jsp/gapan/gapan/tab/operator_modify.jsp";
	}
	
	function	Init_SANCheck(san)
	{
		if(san	== '1')	//	�� üũ
			document.getElementById("SAN_CK").checked	= true;
		else
			document.getElementById("SAN_CK").checked	= false;
	}
		

	function	Init_UseType(sel)
	{
		document.getElementById("UseType1").style.display = "none";
		document.getElementById("UseType2").style.display = "none";
		
		if(sel == '2' || sel == '3')
			document.getElementById("UseType2").style.display = "block";	//	��õ, ����
		else						
			document.getElementById("UseType1").style.display = "block";	//	����	
	}

	function	Init_UseSection(sel)
	{
		if(sel == '1')
			document.getElementById("UseSection").style.display = "block";	//	����
		else
			document.getElementById("UseSection").style.display = "none";
	}	

	function 	Init()
	{
		parent.TabUp_Img("operator");
	}
	
//]]>
</script>

<body onload="Init();">
<form name="form" method="post">
<input type="hidden" name="GAPAN_NO" value="${GAPAN_NO}">
<table width="780" border="0" cellpadding="0" cellspacing="0">
	<tr>
		<td align="left" class="contborder_purple">
		<table width="100%" border="0" cellspacing="0" cellpadding="0">
		  <tr>
			<td><table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
				<tr>
				  <td width="15%" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">��ڸ�</td>
				  <td width="35%" bgcolor="eaeaea" class="table_bl_left">${info.OWNER_NAME}
				  </td>
				  <td  width="15%" align="center" bgcolor="e5eff8" class="sub_table_b">��ڻ���</td>
				  <td width="35%" bgcolor="eaeaea" class="table_bl_left">${info.OWNER_IMG}
				  </td>
				</tr>
				<tr>
				  <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">�ֹε�Ϲ�ȣ</td>
				  <td bgcolor="eaeaea" class="table_bl_left">${info.OWNER_SSN}</td>
				  <td align="center" bgcolor="e5eff8" class="sub_table_b">����/����</td>
				  <td bgcolor="eaeaea" class="table_bl_left">${info.OWNER_GENDER} / ${info.OWNER_AGE}
				  </td>
				</tr>
				
				<tr style="display:block" id="UseType1">
				  <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">��ȭ��ȣ</td>
				  <td bgcolor="eaeaea" class="table_bl_left">${info.OWNER_TEL}
				  </td>
				  <td align="center" bgcolor="e5eff8" class="sub_table_b">�޴���ȭ</td>
				  <td bgcolor="eaeaea" class="table_bl_left">${info.OWNER_HP}
				  </td>
				</tr>
				
			    <tr>
				  <td height="26" colspan="4" align="left" bgcolor="#FFFFFF" class="table_bl_left">
				  <table width="100%"border="0" cellpadding="0" cellspacing="0" class="sub_stan">
					<tr>
					  <td width="50%"><span class="sub_stan_blue">* �ֹε����</span></td>  
					  <td><span class="sub_stan_blue">* ����������:</span> <input name="SAN_CK" type="checkbox" value="${board.SAN_CK}" > �ֹε������ ����</td> 
					</tr>
				  </table></td>
			    </tr>

				<tr style="display:block" id="UseType1">
				  <td align="center" bgcolor="e5eff8" class="sub_table_b">�����ȣ </td>
				  <td bgcolor="eaeaea" class="table_bl_left">${info.OWNER_POST}
				  </td>
				  <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">�����ȣ</td>
				  <td bgcolor="eaeaea" class="table_bl_left">${info.OWNER_TOPOST} 
				  </td>
				</tr>
				
				<tr style="display:block" id="UseType1">
				  <td align="center" bgcolor="e5eff8" class="sub_table_b">�⺻�ּ� </td>
				  <td bgcolor="eaeaea" class="table_bl_left">${info.OWNER_ADDR1}</td>
				  <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">�⺻�ּ�</td>
				  <td bgcolor="eaeaea" class="table_bl_left">${info.OWNER_TOADDR1}</td>
				</tr>
				
				<tr style="display:block" id="UseType1">
				  <td align="center" bgcolor="e5eff8" class="sub_table_b">���ּ�</td>
				  <td bgcolor="eaeaea" class="table_bl_left">${info.OWNER_ADDR2}</td>
				  <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">���ּ�</td>
				  <td bgcolor="eaeaea" class="table_bl_left">${info.OWNER_TOADDR2}</td>
				</tr>
				
			    <tr>
				  <td height="26" colspan="4" align="left" bgcolor="#FFFFFF" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
					<tr>
					  <td><span class="sub_stan_blue">* �߰�����</span></td>  
					</tr>
				  </table></td>
			    </tr>
			    
				<tr style="display:block" id="UseType1">
				  <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">�ְ�����</td>
				  <td bgcolor="eaeaea" class="table_bl_left">${info.RT_SEL}
				  </td>
				  <td align="center" bgcolor="e5eff8" class="sub_table_b">��Ȱ����</td>
				  <td bgcolor="eaeaea" class="table_bl_left">${info.LC_SEL}
				  </td>
				</tr>
		
			    <tr>
				  <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">����/�ε���</td>
				  <td colspan="4" bgcolor="eaeaea" class="table_bl_left">${info.ESTATE_MOVE} / ${info.ESTATE_REAL}
				  </td>
			    </tr>
			    				
			</table></td>
		  </tr>

			<tr>
				<td height="40" align="right"><a href="javascript:goModify();"><img
					src="/img/mod_icon.gif" alt="����" width="56" height="18"
					border="0"></a></td>
			</tr>
          
		</table></td>
	</tr>

</table>
</body>
</html>