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

<script language="javascript" src="/js/PopupCalendar.js"></script>

<script type="text/javascript">
//<![CDATA[
           
	function	Page(page)
	{
		if(page	==	"")
			return;
		
		var form = document.form;

		form.action = "gigan_view.do?currentPage=" + page;
		form.submit();
	}

	function	View(adminno, seq)
	{

	}

	function	Save()
	{
		var form 	= document.form;
		var	str		= "";
		
		//	�ο����
		if(form.EXT_REGDATE.value.length	< 1)
			str	+= "������ڸ� �Է��ϼ���\n";
		else if(form.EXT_FROMDATE.value.length	< 1)
			str	+= "����Ⱓ�� �Է��ϼ���\n";
		else if(form.EXT_TODATE.value.length	< 1)
			str	+= "����Ⱓ�� �Է��ϼ���\n";
	//	else if(form.EXT_NOTES.value.length	< 1)
	//		str	+= "��� �Է��ϼ���\n";
		else if(form.EXT_MANAGER.value.length	< 1)
			str	+= "����ڸ� �Է��ϼ���\n";
		
		if(str	!= "")
		{
			alert(str);
			return	true;
		}
	
		form.action = "gigan_register.do";
		form.submit();
	}

	function 	Init()
	{
		parent.TabDown_Img("gigan");
		
		var	adminno	= document.getElementById("ADMIN_NO").value;
		var	seq		= document.getElementById("SEQ").value;
		
	//	alert(adminno + " , " + seq);
		
	//	if(seq != "")
	//		View(adminno, seq);
	}

	function submitPrint()
	{
		var form 	= document.forms[0];
		var	str		= "";
		
		//	�ο����
		if(form.YEAR.value.length	< 1)
			str	+= "�뺸����� �Է��ϼ���\n";
		else if(form.MONTH.value.length	< 1)
			str	+= "�뺸����� �Է��ϼ���\n";
		else if(form.FROMDATE.value.length	< 1)
			str	+= "�Ⱓ���� �������� �Է��ϼ���\n";
		else if(form.TODATE.value.length	< 1)
			str	+= "�Ⱓ���� �������� �Է��ϼ���\n";		
		else if(form.MANAGER.value.length	< 1)
			str	+= "����ڸ� �Է��ϼ���\n";
		else if(form.TEL.value.length	< 1)
			str	+= "����ó�� �Է��ϼ���\n";
		else if(form.ENDDATE.value.length	< 1)
			str	+= "�������ڸ� �Է��ϼ���\n";
		else if(form.DEPT.value.length	< 1)
			str	+= "��û��Ҹ� �Է��ϼ���\n";
	//	else if(form.NOTES.value.length	< 1)
	//		str	+= "��� �Է��ϼ���\n";
				
		if(str	!= "")
		{
			alert(str);
			return	true;
		}
		
		var target 	= window.open;
		form.target = target;
		form.action = 'annae_print.do';
		form.submit();
	}
	
//]]>
</script>

<body onload="Init();">
<form name="form" method="post">
<table width="780" border="0" cellpadding="0" cellspacing="0">
<input type="hidden" name="ADMIN_NO" value="${ADMIN_NO}">
<input type="hidden" name="SEQ" value="${SEQ}">
<input type="hidden" name="currentPage" value="${currentPage}">

	  <tr>
		<td align="left" class="contborder_blue">
		<table width="100%" border="0" cellspacing="0" cellpadding="0">

		<tr>
		
		  <tr>
			<td height="34" colspan="4" align="left" bgcolor="#FFFFFF" class=""><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
				<tr>
				  <td><span class="sub_stan_blue">* �Ⱓ���� �뺸</span></td>
				</tr>
			</table></td>
		  </tr>

		  <tr>
		  <td><table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">

			  <tr>
				<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">�뺸 ���</td>
				<td colspan="3" bgcolor="eaeaea" class="table_bl_left">
				<input name="YEAR" type="text" class="input_form1" style="width:70px" value=""> ��
				<input name="MONTH" type="text" class="input_form1" style="width:70px" value=""> ��
				</td>
			  </tr>
		  	  
			  <tr>
				<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">�Ⱓ���� ����</td>
				<td width="37%" bgcolor="eaeaea" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
				  <tr>
					<td><input name="FROMDATE" type="text" class="input_form1" style="width:70px" value="" readonly></td>
					<td><a><img src="/img/calendar_icon.gif" width="19" height="16" border="0" onclick="popUpCalendar(this, FROMDATE, 'yyyymmdd')" style="CURSOR: Hand;"></a></td>				  
				  </tr>
				</table></td>
				<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">�Ⱓ���� ����</td>
				<td width="" bgcolor="eaeaea" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
				  <tr>
					<td><input name="TODATE" type="text" class="input_form1" style="width:70px" value="" readonly></td>
					<td><a><img src="/img/calendar_icon.gif" width="19" height="16" border="0" onclick="popUpCalendar(this, TODATE, 'yyyymmdd')" style="CURSOR: Hand;"></a></td>				  
				  </tr>
				</table></td>
			  </tr>
			  			  
			  <tr>
				<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">�����</td>
				<td bgcolor="eaeaea" class="table_bl_left"><input name="MANAGER" type="text" class="input_form1" style="width:120px"  value="${MANAGER}"></td>
				<td align="center" bgcolor="e5eff8" class="sub_table_b">����ó</td>
				<td bgcolor="eaeaea" class="table_bl_left"><input name="TEL" type="text" class="input_form1" style="width:120px" value="${TEL}"></td>
			  </tr>
			  
			  <tr>
				<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">���� ����</td>
					<td bgcolor="eaeaea" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
					  <tr>
						<td><input name="ENDDATE" type="text" class="input_form1" style="width:70px" value="" readonly></td>
						<td><a><img src="/img/calendar_icon.gif" width="19" height="16" border="0" onclick="popUpCalendar(this, ENDDATE, 'yyyymmdd')" style="CURSOR: Hand;"></a></td>
					<!-- <td>&nbsp~ <input name="PREDATE" type="text" class="input_form1" style="width:70px" value="" readonly></td>
						<td><a><img src="/img/calendar_icon.gif" width="19" height="16" border="0" onclick="popUpCalendar(this, PREDATE, 'yyyymmdd')" style="CURSOR: Hand;"></a></td>
						 -->						  
					  </tr>
					</table></td>
				  
				<td align="center" bgcolor="e5eff8" class="sub_table_b">��û ���</td>
				<td bgcolor="eaeaea" class="table_bl_left"><input name="DEPT" type="text" class="input_form1" style="width:250px" value="${GU_NM} ${DEPT_NM}"></td>
			  </tr>
			  
			  <tr>
				<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">���</td>
				<td colspan="3" bgcolor="eaeaea" class="table_bl_left">
				<table width="100%" border="0" cellpadding="0" cellspacing="0">
			  	<tr>
					<td>
						<input name="NOTES" type="text" class="input_form1" style="width:98%" value="">
					</td>
				</tr>
				</table>
				</td>
			  </tr>

		  </table></td>
		</tr>
		
		<tr>
			<td height="40">
			<table width="0" border="0" cellspacing="0" cellpadding="0" align="right">	
		  		<a><img src="/img/print_icon.gif" onclick="submitPrint();" alt="�ȳ��� ���" border="0"></a>
			</table>
			</td>
		</tr>
	
		<tr></tr><tr></tr>
		
        <tr>
          <td height="1" bgcolor="#EAEAEA"></td>
        </tr> 
	
	    <tr>
	    	<td height="30" colspan="0" align="left" bgcolor="#FFFFFF" class=""><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
		    	<tr>
			       <td><span class="sub_stan_blue">* ����Ⱓ ����</span></td>
			    </tr>
	    	</table></td>
	    </tr>
	    
		  <td><table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
 
			  <tr>
				<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">�����</td>
				<td width="37%" bgcolor="eaeaea" class="table_bl_left">
				<input name="EXT_MANAGER" type="text" class="input_form1" style="width:120px"  value="${MANAGER}"></td>
				<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">�������</td>
				<td bgcolor="eaeaea" class="table_bl_left">
					<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
					  <tr>
						<td><input name="EXT_REGDATE" type="text" class="input_form1" style="width:70px" value="${EXT_REGDATE}" readonly></td>
						<td><a><img src="/img/calendar_icon.gif" width="19" height="16" border="0" onclick="popUpCalendar(this, EXT_REGDATE, 'yyyymmdd')" style="CURSOR: Hand;"></a></td>					  
					  </tr>
					</table>
				</td>
			  </tr>
			
			  <tr>
				<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">�Ⱓ���� ����</td>
				<td bgcolor="eaeaea" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
				  <tr>
					<td><input name="EXT_FROMDATE" type="text" class="input_form1" style="width:70px" value="" readonly></td>
					<td><a><img src="/img/calendar_icon.gif" width="19" height="16" border="0" onclick="popUpCalendar(this, EXT_FROMDATE, 'yyyymmdd')" style="CURSOR: Hand;"></a></td>				  
				  </tr>
				</table></td>
				<td width="100" align="center" bgcolor="e5eff8" class="sub_table_b">�Ⱓ���� ����</td>
				<td bgcolor="eaeaea" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
				  <tr>
					<td><input name="EXT_TODATE" type="text" class="input_form1" style="width:70px" value="" readonly></td>
					<td><a><img src="/img/calendar_icon.gif" width="19" height="16" border="0" onclick="popUpCalendar(this, EXT_TODATE, 'yyyymmdd')" style="CURSOR: Hand;"></a></td>				  
				  </tr>
				</table></td>
			  </tr>
			  
			  <tr>
				<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">���</td>
				<td colspan="3" bgcolor="eaeaea" class="table_bl_left">
				<table width="100%" border="0" cellpadding="0" cellspacing="0">
			  	<tr>
					<td>
						<input name="EXT_NOTES" type="text" class="input_form1" style="width:98%" value="">
					</td>
				</tr>
				</table>
				</td>
			  </tr>
			  
		  </table></td>

		<tr>
			<td height="40">
			<table width="0" border="0" cellspacing="0" cellpadding="0" align="right">	
		  		<a><img src="/img/mod_icon.gif" border="0" onclick="javascript:Save();" style="CURSOR: Hand;"></a>
			</table>
			</td>
		</tr>		
		
	</table></td>
  </tr>


</table>
</form>
</body>
</html>