<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ include file="/jsp/common/loginCheck.jsp" %>

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
<script language='JavaScript' src='/js/Check_inputbox.js'></script>
<!--  //********** BEGIN_����_20120215 -->
<script language="javascript" src="/js/zipcode.js"></script>
<!--   //********** END_����_20120215 -->   

<script type="text/javascript">
//<![CDATA[
 //********** BEGIN_����_20120215
 /*
 	function 	openZipcodePopup(post, addr)
	{
		var	post1	= post;
		var	addr1	= addr;

		var url 	= "/zipcode.do?openerPost=" + post1 + "&openerAddr=" + addr1;
		var winName = "������ȣ�Է�";
		var width 	= 420;
		var height 	= 305;
		var scroll 	= "yes";
		var resize 	= "no";

		var	option	= "scrollbars=" + scroll + ", ";
		option	+= "resize=" + resize + ", ";
		option	+= "width=" + width + ", ";
		option	+= "height=" + height;

		window.open(url, winName, option);
	}
*/
//********** END_����_20120215
           

	function	Register()
	{
		var	result	= DataCheck();

		if(result	==	false)
			return;
		
		var form = document.form;
		if (getByteLength(form.REFERENCE) > 500) {
          alert("���ǳ����� �ѱ� 500�� �̻� �Է��� �� �����ϴ�.\n���� ���ڼ�:"+getByteLength(form.REFERENCE));
          return false;
    	}
		form.action = "/jumyong/jumyonginfo/minwon_register_prc.do";
		form.submit();
	}

	function	Cancel()
	{
		var form = document.form;

		form.action = "/jumyong/jumyonginfo/minwon_view.do";
		form.submit();
	}

	function	DataCheck()
	{
		var form 	= document.form;
		var	str		= "";
		
		//	�ο����
		if(form.GUBUN.value.length	< 1)
			str	+= "�ο������� �Է��ϼ���\n";
		if(form.REQ_DATE.value.length	< 1)
			str	+= "�������ڸ� �Է��ϼ���\n";
		if(form.PREDATE.value.length	< 1)
			str	+= "ó�� �������ڸ� �Է��ϼ���\n";	
//		if(form.REQ_DEP.value.length	< 1)
//			str	+= "�����μ��� �Է��ϼ���.\n";	
		if(form.MANAGE_DEP.value.length	< 1)
			str	+= "���μ��� �Է��ϼ���\n";	
		if(form.REQ_NM.value.length	< 1)
			str	+= "�����ڸ��� �Է��ϼ���\n";	
		if(form.MANAGER.value.length	< 1)
			str	+= "����ڸ��� �Է��ϼ���\n";	
		if(form.NOTES.value.length	< 1)
			str	+= "�ο������� �Է��ϼ���\n";	

	//	if(str	== "")
		{
			return	true;
		}
		
		alert(str);

		return	false;		
	}

//]]>
</script>

<body>
<table width="780" border="0" cellpadding="0" cellspacing="0">
<form name="form" method="post">
<input type="hidden" name="ADMIN_NO" value="${ADMIN_NO}">

	  <tr>
		<td align="left" class="contborder_blue">
		<table width="100%" border="0" cellspacing="0" cellpadding="0">
			<tr>
			  <td><table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">

				  	<tr>
						<td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">������ȣ</td>
						<td width="37%" bgcolor="eaeaea" class="table_bl_left"><input name="REQ_NO" type="text" class="input_form1" style="width:120px" readonly></td>
						<td width="100" align="center" bgcolor="e5eff8" class="sub_table_b">�ο�����</td>
						<td bgcolor="eaeaea" class="table_bl_left"><input name="GUBUN" type="text" class="input_form1" style="width:120px"></td>
				  	</tr>
				  
				  	<tr>
						<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">��������</td>
						<td bgcolor="eaeaea" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
					  	<tr>
							<td><input name="REQ_DATE" type="text" class="input_form1" style="width:120px" value="${REQ_DATE}" readonly></td>
							<td><a><img src="/img/calendar_icon.gif" width="19" height="16" border="0" onclick="popUpCalendar(this, document.getElementById('REQ_DATE'), 'yyyymmdd')" style="CURSOR: Hand;"></a></td>
					  	</tr>
						</table></td>
						<td align="center" bgcolor="e5eff8" class="sub_table_b">ó����������</td>
						<td bgcolor="eaeaea" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
					  	<tr>
							<td><input name="PREDATE" type="text" class="input_form1" style="width:120px" readonly></td>
							<td><a><img src="/img/calendar_icon.gif" width="19" height="16" border="0" onclick="popUpCalendar(this, document.getElementById('PREDATE'), 'yyyymmdd')" style="CURSOR: Hand;"></a></td>
					  	</tr>
						</table></td>
				  	</tr>
				  
				  	<tr>
						<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">�����μ�</td>
						<td bgcolor="eaeaea" class="table_bl_left"><input name="REQ_DEP" type="text" class="input_form1" style="width:120px" value="${MANAGE_DEP}" readonly></td>
						<td align="center" bgcolor="e5eff8" class="sub_table_b">���μ�</td>
						<td bgcolor="eaeaea" class="table_bl_left"><input name="MANAGE_DEP" type="text" class="input_form1" style="width:120px" value="${MANAGE_DEP}"></td>
				  	</tr>
				  
					<tr>
						<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">�����ڸ�</td>
						<td bgcolor="eaeaea" class="table_bl_left"><input name="REQ_NM" type="text" class="input_form1" style="width:120px"></td>
						<td align="center" bgcolor="e5eff8" class="sub_table_b">����ڸ�</td>
						<td bgcolor="eaeaea" class="table_bl_left"><input name="MANAGER" type="text" class="input_form1" style="width:120px" value="${MANAGER}"></td>
					</tr>
					  
					<tr>
						<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">�ο�����</td>
						<td colspan="3" bgcolor="eaeaea" class="table_bl_left"><table width="100%" border="0" cellpadding="0" cellspacing="0" class="sub_stan">
							<input name="NOTES" type="text" class="input_form1" style="width:98%">
						</table></td>
					</tr>
					
					<tr>
						<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">�븮��</td>
						<td bgcolor="eaeaea" class="table_bl_left"><input name="AGENT_NM" type="text" class="input_form1" style="width:120px"></td>
						<td align="center" bgcolor="e5eff8" class="sub_table_b">�븮�� ����ó</td>
						<td bgcolor="eaeaea" class="table_bl_left">
							<input name="min_agent_tel1" type="text" class="input_form1" style="width:25px" style="ime-mode:disabled" onKeyPress="nr_num_int(this);" onKeyUp="count_check(this, min_agent_tel2, 3);" maxlength="3"> - 
							<input name="min_agent_tel2" type="text" class="input_form1" style="width:30px" style="ime-mode:disabled" onKeyPress="nr_num_int(this);" onKeyUp="count_check(this, min_agent_tel3, 4);" maxlength="4"> - 
							<input name="min_agent_tel3" type="text" class="input_form1" style="width:30px" style="ime-mode:disabled" onKeyPress="nr_num_int(this);" onKeyUp="count_check(this, min_agent_tel3, 4);" maxlength="4">
						</td>
					</tr>
				  
					<tr>
						<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">�ο��θ�</td>
						<td bgcolor="eaeaea" class="table_bl_left"><input name="NAME" type="text" class="input_form1" style="width:120px"></td>
						<td align="center" bgcolor="e5eff8" class="sub_table_b">�ο��� �ֹι�ȣ</td>
						<td bgcolor="eaeaea" class="table_bl_left">
							<input name="min_ssn1" type="text" class="input_form1" style="width:40px; ime-mode:disabled" value="${min_ssn1}" onKeyPress="nr_num_int(this);" onKeyUp="count_check(this, min_ssn2, 6);" maxlength="6">
							 - <input name="min_ssn2" type="text" class="input_form1" style="width:45px; ime-mode:disabled" value="${min_ssn2}" onKeyPress="nr_num_int(this);" maxlength="7"></td>
					</tr>
				  
				 	<tr>
						<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">�ο��� ������ȣ</td>
						<td bgcolor="eaeaea" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
							<tr>
							  	<td><input name="POST" type="text" class="input_form1" style="width:50px" value="${POST}" readonly></td>
							  	<!--  //********** BEGIN_����_20120215 -->
							  	<!-- 
							  	<td><img src="/img/search_icon.gif" alt="�˻�" width="56" height="18" border="0" onclick="javascript:openZipcodePopup('form.POST', 'form.ADDR1');" style="CURSOR:Hand"></td>
							  	 -->
							  	 <td><img src="/img/search_icon.gif" alt="�˻�" width="56" height="18" border="0" onclick="javascript:openZipcodePopup_new('form.POST', 'form.ADDR1');" style="CURSOR:Hand"></td>
								<!--   //********** END_����_20120215 -->
							</tr>
						</table></td>
						<td align="center" bgcolor="e5eff8" class="sub_table_b">�ο��� �ּ�</td>
						<td bgcolor="eaeaea" class="table_bl_left"><input name="ADDR1" type="text" class="input_form1" style="width:250px" value="${ADDR1}" readonly>
							<input name="ADDR2" type="text" class="input_form1" style="width:250px" value="${ADDR2}"></td>
				  	</tr>
				  
				  	<tr>
						<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">�ο��� ��ȭ</td>
						<td bgcolor="eaeaea" class="table_bl_left">
							<input name="min_tel1" type="text" class="input_form1" style="width:25px" style="ime-mode:disabled" onKeyPress="nr_num_int(this);" onKeyUp="count_check(this, min_tel2, 3);" maxlength="3"> - 
							<input name="min_tel2" type="text" class="input_form1" style="width:30px" style="ime-mode:disabled" onKeyPress="nr_num_int(this);" onKeyUp="count_check(this, min_tel3, 4);" maxlength="4"> - 
							<input name="min_tel3" type="text" class="input_form1" style="width:30px" style="ime-mode:disabled" onKeyPress="nr_num_int(this);" onKeyUp="count_check(this, min_tel3, 4);" maxlength="4">
						</td>
						<td align="center" bgcolor="e5eff8" class="sub_table_b">�ο��� �޴���</td>
						<td bgcolor="eaeaea" class="table_bl_left">
							<input name="min_hp1" type="text" class="input_form1" style="width:25px" style="ime-mode:disabled" onKeyPress="nr_num_int(this);" onKeyUp="count_check(this, min_hp2, 3);" maxlength="3"> - 
							<input name="min_hp2" type="text" class="input_form1" style="width:30px" style="ime-mode:disabled" onKeyPress="nr_num_int(this);" onKeyUp="count_check(this, min_hp3, 4);" maxlength="4"> - 
							<input name="min_hp3" type="text" class="input_form1" style="width:30px" style="ime-mode:disabled" onKeyPress="nr_num_int(this);" onKeyUp="count_check(this, min_hp3, 4);" maxlength="4">
						</td>
				  	</tr>
				  	<tr>
        				<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">���</td>
      					<td colspan="3" bgcolor="eaeaea" class="table_bl_left">
					       <table width="100%" border="0" cellpadding="0" cellspacing="0" class="sub_stan">
					        <textarea name="REFERENCE" id="REFERENCE" onkeyup="displayBytes(500, 'REFERENCE');" type="text" class="input_form1" style="width:98%">${REFERENCE}</textarea>
					       </table>
      					</td>
        			</tr> 
				  
			  </table></td>
			</tr>
			<!--  //********** BEGIN_����_20120215 -->
			<!--  
			<tr>
				<td height="40">
				<table width="0" border="0" cellspacing="0" cellpadding="0" align="right">
			  		<a href="javascript:Cancel()"><img src="/img/can_icon.gif" alt="���" width="56" height="18" border="0"></a>	
			  		<a href="javascript:Register()"><img src="/img/save_icon2.gif" alt="����" width="56" height="18" border="0"></a>
				</table>
				</td>
			</tr>
			-->
			<tr>
				<td height="40">
				<table width="0" border="0" cellspacing="0" cellpadding="0" align="right">
					<tr>
						<td>
							<a href="javascript:Cancel()"><img src="/img/can_icon.gif" alt="���" width="56" height="18" border="0"></a>	
					  		<a href="javascript:Register()"><img src="/img/save_icon2.gif" alt="����" width="56" height="18" border="0"></a>	
						</td>
					</tr>			  		
				</table>
				</td>
			</tr>
			<!--   //********** END_����_20120215 -->
			
			
		</table></td>
	  </tr>

</table>

</body>
</html>