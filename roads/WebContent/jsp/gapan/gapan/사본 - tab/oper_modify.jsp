<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
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
		parent.TabUp_Img("oper");
	}
	
//]]>
</script>

<body onload="Init();">
<form name="form" method="post">
<input type="hidden" name="ADMIN_NO" value="${ADMIN_NO}">

<table width="780" border="0" cellpadding="0" cellspacing="0">
	<tr>
		<td align="left" class="contborder_purple">
		<table width="100%" border="0" cellspacing="0" cellpadding="0">
		  <tr>
			<td><table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
								
				<tr>
				  <td width="15%" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">���ǰ��</td>
				  <td  width="35%" bgcolor="eaeaea" class="table_bl_left">
				  	<select name="select2" class="input_form1" style="width:60px"></select>  
				  	<input name="SAN_CK" type="checkbox" value="${board.SAN_CK}">�ַ��Ǹ� 
					<input name="SAN_CK" type="checkbox" value="${board.SAN_CK}">LPG��� 
				  </td>
				  <td width="15%" align="center" bgcolor="e5eff8" class="sub_table_b">�㰡����</td>
				  <td bgcolor="eaeaea" class="table_bl_left">
				  	<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
						<td><input name="toDate" type="text"
							class="input_form1" style="width:80px" value="${toDate}"></td>
						<td><a href="#"><img src="/img/calendar_icon.gif"
							width="19" height="16" border="0" onclick="popUpCalendar(this, toDate, 'yyyymmdd');"></a></td>
				  	</table>
				  </td>
				</tr>
				<tr>
				  <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">��ǰ�з�</td>
				  <td bgcolor="eaeaea" class="table_bl_left">
					<select name="select2" class="input_form1" style="width:60px"></select> /  
	                <select name="select2" class="input_form1" style="width:60px"></select>  
				  </td>
				  <td align="center" bgcolor="e5eff8" class="sub_table_b">�ϸ����</td>
				  <td bgcolor="eaeaea" class="table_bl_left">
					<input name="TAX_SET" type="text" class="input_form1" style="width:120px" value="${taxation_section}" >
				  </td>
				</tr>
				
				<tr style="display:block" id="UseType1">
				  <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">�����ο�</td>
				  <td bgcolor="eaeaea" class="table_bl_left">
					<select name="select2" class="input_form1" style="width:60px"></select>   
				  </td>
				  <td align="center" bgcolor="e5eff8" class="sub_table_b">���Դ�ü</td>
				  <td bgcolor="eaeaea" class="table_bl_left">
					<select name="select2" class="input_form1" style="width:60px"></select>
					<input name="TAX_SET" type="text" class="input_form1" style="width:120px" value="${taxation_section}" >
				  </td>
				</tr>
			
				<tr style="display:block" id="UseType1">
				  <td align="center" bgcolor="e5eff8" class="sub_table_b">��ð� </td>
				  <td bgcolor="eaeaea" class="table_bl_left">
					<select name="select2" class="input_form1" style="width:50px"></select>
					<select name="select2" class="input_form1" style="width:50px"></select>  ~
					<select name="select2" class="input_form1" style="width:50px"></select> 
					<select name="select2" class="input_form1" style="width:50px"></select>    
				  </td>
				  <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">��Ÿ����</td>
				  <td bgcolor="eaeaea" class="table_bl_left">	
					<input name="textfield222272322" type="text" class="input_form1" style="width:200px" value="${board.SAN_CK}" >  
				</tr>
							              
		</table></td>
	</tr>
	
    <tr>              
      <td height="40" align="right">
     		<img src="/img/can_icon.gif" alt="���" border="0" onclick="javascript:history.back();" style="cursor:pointer" >					                
       <img src="/img/save_icon2.gif" alt="����" width="56" height="18" border="0"
        onClick="javascript:submitClick();"  style="cursor:pointer">
      </td>
    </tr>

</table>
</body>
</html>