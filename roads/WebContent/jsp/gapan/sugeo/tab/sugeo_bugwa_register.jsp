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
	background-image: url/img/left_back.gif);
}
-->

</style>
<link href="/css/roads.css" rel="stylesheet" type="text/css">
</head>

<script language="javascript" src="/js/PopupCalendar.js"></script>
<script language='JavaScript' src='/js/Check_inputbox.js'></script>
<script language='JavaScript' src='/jsp/gapan/sugeo/tab/sugeo_bugwa_register.js'></script>

<script type="text/javascript">
//<![CDATA[
			
	// üũ �� ����
	function click_idchk(obj)
	{
		if(obj.checked == true)
		{
			obj.value = "1";
		}
		else
		{
			obj.value = "0";
		}
	}
	
	
	//���� ��ư �� üũ ��ư�� �׵θ� ���ִ� �Լ�
	function RemoveOutline()
	{
		for(i=0;i<document.getElementsByTagName("input").length;i++)
		{
			objinput = document.getElementsByTagName("input");
			if(objinput[i].type == "radio" || objinput[i].type == "checkbox")
			{
				objinput[i].style.border = 0;
			}
		}
	}
	
	//�Ⱓ ����ϱ� 
	function showDate(id){
		alert(id);
		var f = document.form;
		if( id == '1' ){
			var rem_svfrom = document.getElementById("rem_svfrom"); //������
			var rem_svto = document.getElementById("rem_svto"); 	//������
			var rem_sv_date = document.getElementById("rem_sv_date");
			
			rem_sv_date.innerHTML = "";
			
			if( rem_svfrom != '' && rem_svto != '' ){
				v1=f.rem_svfrom.value.split("-");
				v2=f.rem_svto.value.split("-");
				
				a1=new Date(v1[0],v1[1]-1,v1[2]).getTime();
				a2=new Date(v2[0],v2[1]-1,v2[2]).getTime();
				b=(a2-a1)/(1000*60*60*24);
				//f.t2.value=b;
				rem_sv_date.innerHTML = "("+b+"��)";
			}
		
		}
		else if( id == '2'){
		
			var rem_badfrom = document.getElementById("rem_badfrom"); //������
			var rem_badto = document.getElementById("rem_badto"); 		//������
			var rem_bad_date = document.getElementById("rem_bad_date");
			
			rem_sv_date.innerHTML = "";
			
			if( rem_badfrom != '' && rem_badto != '' ){
				v1=f.rem_badfrom.value.split("-");
				v2=f.rem_badto.value.split("-");
				
				a1=new Date(v1[0],v1[1]-1,v1[2]).getTime();
				a2=new Date(v2[0],v2[1]-1,v2[2]).getTime();
				b=(a2-a1)/(1000*60*60*24);
				//f.t2.value=b;
				rem_bad_date.innerHTML = "("+b+"��)";
			}
		
		}
	}
	
	
	// ���·� ��� (���� ���� �ϴ� ����.. 2009.7.29 )
	function goCal(){
		var f = document.form;
		
		alert(f.bugwa_yn.value);
		if( f.bugwa_yn.value == '1' ){
			alert("���·� �̺ΰ��� üũ�Ͽ����ϴ�. Ȯ���ϼ���. ");
			f.bugwa_yn.focus();
			return;
		}
		if( f.bugwa_area.value == '' ){
			alert("���������� �Է��ϼ��� ");
			f.bugwa_area.focus();
			return;
		}
		if( f.bugwa_danga.value == '' ){
			alert("���رݾ��� �Է��ϼ��� ");
			f.bugwa_danga.focus();
			return;
		}
		if( f.bugwa_tax.value == '' ){
			alert("�⺻ ���·Ḧ �Է��ϼ��� ");
			f.bugwa_tax.focus();
			return;
		}
		if( f.bugwa_red_rate.value == '' ){
			alert("�������� �Է��ϼ��� ");
			f.bugwa_red_rate.focus();
			return;
		}
		var bugwa_area = f.bugwa_area.value;
		var bugwa_danga = f.bugwa_danga.value;
		var bugwa_tax = f.bugwa_tax.value;
		var bugwa_red_rate = f.bugwa_red_rate.value;
		
		var bugwa_red_tax = Number(bugwa_danga) * Number(bugwa_area) * (Number(bugwa_red_rate)*0.01);
		//alert(bugwa_red_tax);
		
	}
	window.onload = tabMenu;
	function tabMenu() {
		var tabs = document.getElementById('tabmenu');
		var tab = tabs.getElementsByTagName('a'); // �� ���
		var contents = document.getElementById('tabcontents');
		var content = getElementsByClassName('tabcontent',contents); // ������ ��� class
		var type = true; // �ѿ����� true / false
		for (var i=0; i<tab.length; i++) {
			tabDisplay(tab,content,0,true);
			tabAct(tab,content,i,type);
		}
		var showTab = '${showTab}';
		if( showTab != '' ){
			tabDisplay(tab,content,1);
		}
	}
	
//]]>
</script>


<body>

<form name="form" method="post">
<input type="hidden" name="mul_no" value="${mul_no }">
<input type="hidden" name="owner_ssn" value="">
<input type="hidden" name="owner_tel" value="">
<input type="hidden" name="owner_hp" value="">

<table width="800" border="0" cellpadding="0" cellspacing="0">
<tr>
<td align="left">
	<table width="780" border="0" cellspacing="0" cellpadding="0">
		<tr>
       		<td height="22" background="/img/tab_line_purple.gif">
       			<table border="0" cellspacing="0" cellpadding="0">
					<tr>
						<ul id="tabmenu">
						<td width="111"><a><img src="/img/bugwa_on.gif" alt="���·�����" width="110" height="22" border="0" onclick="Init();" style="CURSOR: Hand;"></a></td>
						<td width="111"><a><img src="/img/sale_off.gif" alt="���/�Ű�" width="110" height="22" border="0" onclick="Init(); " style="CURSOR: Hand;"></a></td>
						</ul>
   			        </tr>
				</table>
			</td>
		</tr>
		
		<tr>
           	<td align="left" class="contborder_purple">
	
	
		<div id="tabcontents">
		
			<div class="tabcontent" id="tab1">
				<table width="100%" border="0" cellspacing="0" cellpadding="0">
                <tr>
					<td>
						<table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
						  	<tr>
								<td height="30" colspan="4" align="left" bgcolor="#FFFFFF" class="">
							  		<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
										<tr>
									  		<td><span class="sub_stan_blue">&nbsp; * ������ ����</span></td>
										</tr>
								  	</table>
								</td>
						  	</tr>
				  			<tr>
								<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">�����ڸ�</td>
								<td bgcolor="eaeaea" class="table_bl_left">
									<input name="owner_nm" type="text" class="essential" style="width:120px">
								</td>
								<td align="center" bgcolor="e5eff8" class="sub_table_b">�ֹε�Ϲ�ȣ</td>
								<td bgcolor="eaeaea" class="table_bl_left">
									<input name="owner_ssn1" type="text" class="essential" style="width:60px" maxlength="6" onKeyPress="nr_num_int(this);" onKeyUp="nr_num_int(this);count_check(this, owner_ssn2, 6);"> -
									<input name="owner_ssn2" type="text" class="essential" style="width:60px" maxlength="7" onKeyDown="nr_num_int(this);" onKeyUp="nr_num_int(this);" onKeyPress="nr_num_int(this);">
								</td>
						  	</tr>
						  	<tr>
								<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">�����ȣ</td>
								<td bgcolor="eaeaea" class="table_bl_left">
									<input name="owner_zip" type="text" class="essential" style="width:50px" value="" readonly>
									<img src="/img/search_icon.gif" alt="�˻�" width="56" height="18" border="0" onclick="javascript:openZipcodePopup('form.owner_zip', 'form.owner_zip_addr1');" style="CURSOR:Hand">
								</td>
								<td align="center" bgcolor="e5eff8" class="sub_table_b">�ּ�</td>
								<td bgcolor="eaeaea" class="table_bl_left">
									<input name="owner_zip_addr1" type="text" class="essential" style="width:120px" value="" readonly>
									<input name="owner_zip_addr2" type="text" class="essential" style="width:150px" value="">
								</td>
						  	</tr>
						  	
						  	<tr>
								<td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">��ȭ��ȣ</td>
								<td width="37%" bgcolor="eaeaea" class="table_bl_left">
									<input name="owner_tel1" type="text" class="essential" style="width:40px" value="" onKeyPress="nr_num_int(this);" onKeyUp="count_check(this, owner_tel2, 3);" maxlength="3">-
									<input name="owner_tel2" type="text" class="essential" style="width:40px" value="" onKeyPress="nr_num_int(this);" onKeyUp="count_check(this, owner_tel3, 4);" maxlength="4">-
									<input name="owner_tel3" type="text" class="essential" style="width:40px" value="" onKeyPress="nr_num_int(this);" maxlength="4">
								</td>
								<td align="center" bgcolor="e5eff8" class="sub_table_b">�޴���ȭ</td>
								<td bgcolor="eaeaea" class="table_bl_left">
									<input name="owner_hp1" type="text" class="essential" style="width:40px" value="" onKeyPress="nr_num_int(this);" onKeyUp="count_check(this, owner_hp2, 3);" maxlength="3">-
									<input name="owner_hp2" type="text" class="essential" style="width:40px" value="" onKeyPress="nr_num_int(this);" onKeyUp="count_check(this, owner_hp3, 4);" maxlength="4">-
									<input name="owner_hp3" type="text" class="essential" style="width:40px" value="" onKeyPress="nr_num_int(this);"  maxlength="4">
								</td>
						  	</tr>
				  			<tr>
								<td height="30" colspan="4" align="left" bgcolor="#FFFFFF" class="">
							  		<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
										<tr>
									  		<td><span class="sub_stan_blue">&nbsp; * ���·� �ΰ� : </span>
									  			<input type="checkbox" name="bugwa_yn" value="0" onclick="javascript:click_idchk(this);"> ���·� �̺ΰ�
									  		</td>
										</tr>
								  	</table>
								</td>						
						  	</tr>
						  	<tr>
								<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">�������</td>
								<td bgcolor="eaeaea" class="table_bl_left">
									<input name="bugwa_area" type="text" class="input_form1" style="width:120px" value="" onKeyDown="nr_num_float(this);" onKeyUp="nr_num_float(this);" onKeyPress="nr_num_float(this);" maxlength="3"> ��
								</td>
								<td align="center" bgcolor="e5eff8" class="sub_table_b">���رݾ� </td>
								<td bgcolor="eaeaea" class="table_bl_left">
									<input name="bugwa_danga" type="text" class="input_form1" style="width:120px" value="" maxlength="5" onKeyDown="nr_num_int(this);" onKeyUp="nr_num_int(this); comma_paste(this);" onKeyPress="nr_num_int(this);"> ��/��
								</td>
						  	</tr>
							<tr>
								<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">�⺻ ���·�</td>
								<td bgcolor="eaeaea" class="table_bl_left">
									<input name="bugwa_tax" type="text" class="input_form1" style="width:120px" value="" onKeyPress="nr_num_int(this);" maxlength="10" onKeyDown="nr_num_int(this);" onKeyUp="nr_num_int(this); comma_paste(this);" onKeyPress="nr_num_int(this);"> ��
								</td>
								<td align="center" bgcolor="e5eff8" class="sub_table_b">������</td>
								<td bgcolor="eaeaea" class="table_bl_left">
									<input name="bugwa_red_rate" type="text" class="input_form1" style="width:120px" value="" onKeyDown="nr_num_int(this);" onKeyUp="nr_num_int(this);" onKeyPress="nr_num_int(this);"> % 
									<input type="checkbox" name="bugwa" value="0" onclick="javascript:click_idchk(this);"> �̹ݿ�
								</td>
							</tr>
							<tr>
								<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">���� ���·�</td>
								<td bgcolor="eaeaea" class="table_bl_left">
									<input name="bugwa_red_tax" type="text" class="input_form1" style="width:120px" value="" onKeyDown="nr_num_int(this);" onKeyUp="nr_num_int(this); comma_paste(this);" onKeyPress="nr_num_int(this);"> ��
								</td>
								<td align="center" bgcolor="e5eff8" class="sub_table_b">���� �����</td>
								<td bgcolor="eaeaea" class="table_bl_left">
									<input name="bugwa_form" type="text" class="input_form1" style="width:120px" value="">
								</td>
							</tr>
							<tr>
								<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">Ư�̻���</td>
								<td colspan="3" bgcolor="eaeaea" class="table_bl_left">
									<input name="bugwa_bigo" type="text" class="input_form1" style="width:500px" maxlength="100">
								</td>
							</tr>
						   							  	
		                  	</table></td>
		                </tr>
		                <tr>
							<td height="40" align="right">
								<!--img src="/img/accou_icon.gif" alt="���" border="0" onClick="javascript:goCal();" style="CURSOR:hand"-->
								<img src="/img/save_icon2.gif" alt="����" border="0" onClick="javascript:RegisterPrc_bugwa();" style="CURSOR:hand">
							</td>
						</tr>
					</table>
			</div>
			
			<div class="tabcontent" style="display:none" id="tab2">
				<table width="100%" border="0" cellspacing="0" cellpadding="0">
	                <tr>
	                  	<td>
	                  	<table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
						  	<tr>
								<td height="30" colspan="2" align="left" bgcolor="#FFFFFF" class="">
							  		<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
										<tr>
									  		<td><span class="sub_stan_blue">&nbsp; * ó������ </span>
									  		</td>
										</tr>
								  	</table>
								</td>
								<td height="30" colspan="2" align="left" bgcolor="#FFFFFF" class="">
							  		<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
										<tr>
									  		<td><span class="sub_stan_blue">&nbsp; * �������� </span>
									  		</td>
										</tr>
								  	</table>
								</td>
							</tr>
							<tr>
								<td width="100" align="center" bgcolor="e5eff8" class="sub_table_b">ó������</td>
								<td width="37%" bgcolor="eaeaea" class="table_bl_left">
									<select name="sale_type" class="input_form1" style="width:100px">
										${sa_typ }
									</select>
								</td>
								<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">��������</td>
								<td bgcolor="eaeaea" class="table_bl_left">
									<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
									  	<tr>
											<td><input name="sale_date" type="text" class="input_form1" style="width:120px" value="${today }" readonly></td>
											<td><a><img src="/img/calendar_icon.gif" width="19" height="16" border="0" onclick="popUpCalendar(this, document.getElementById('sale_date'), 'yyyymmdd')" style="CURSOR: Hand;"></a></td>
									  	</tr>
									</table>
								</td>
						  	</tr>
						  	<tr>
								<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">ó������</td>
								<td bgcolor="eaeaea" class="table_bl_left">
									<input name="sale_bigo" type="text" class="input_form1" style="width:95%" value="" maxlength="50">
								</td>
								<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">�����ȣ</td>
								<td bgcolor="eaeaea" class="table_bl_left">
									<input name="sale_no" type="text" class="input_form1" style="width:120px" maxlength="20">
								</td>
						  	</tr>
						  	<tr>
								<td height="30" align="left" class="sub_table_b" colspan="4">
									<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
										<tr>
									  		<td><span class="sub_stan_blue">&nbsp; * ó����� </span>
									  		</td>
										</tr>
								  	</table>
								</td>
							</tr>
							<tr>
								<td align="center" bgcolor="e5eff8" class="sub_table_b">ó�����</td>
								<td bgcolor="eaeaea" class="table_bl_left">
									<select name="hnd_type" class="input_form1" style="width:100px">
										${sa_typ }
									</select>
								</td>
								<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">��������</td>
								<td bgcolor="eaeaea" class="table_bl_left">
									<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
									  	<tr>
											<td><input name="hnd_desdate" type="text" class="input_form1" style="width:120px" value="${today }" readonly></td>
											<td><a><img src="/img/calendar_icon.gif" width="19" height="16" border="0" onclick="popUpCalendar(this, document.getElementById('hnd_desdate'), 'yyyymmdd')" style="CURSOR: Hand;"></a></td>
									  	</tr>
									</table>
								</td>
						  	</tr>
						  	<tr>
								<td align="center" bgcolor="e5eff8" class="sub_table_b">ó����ü��</td>
								<td bgcolor="eaeaea" class="table_bl_left">
									<input name="hnd_office" type="text" class="input_form1" style="width:120px" maxlength="50">
								</td>
								<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">��������</td>
								<td bgcolor="eaeaea" class="table_bl_left">
									<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
									  	<tr>
											<td><input name="hnd_opedate" type="text" class="input_form1" style="width:120px" value="${today }" readonly></td>
											<td><a><img src="/img/calendar_icon.gif" width="19" height="16" border="0" onclick="popUpCalendar(this, document.getElementById('hnd_opedate'), 'yyyymmdd')" style="CURSOR: Hand;"></a></td>
									  	</tr>
									</table>
								</td>
						  	</tr>	
							<tr>
								<td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b" nowrap="nowrap">Ư�̻���</td>
								<td width="37%" colspan="3" bgcolor="eaeaea" class="table_bl_left" nowrap="nowrap">
									<input name="hnd_bigo" type="text" class="input_form1" style="width:95%" value="" maxlength="50">
								</td>
							</tr>
						
	                  	</table>
	                  	</td>
				  	</tr>
				  	<tr>
						<td height="40" align="right">
							<img src="/img/save_icon2.gif" alt="����" border="0" onClick="javascript:RegisterPrc_sale();" style="CURSOR:hand">
						</td>
					</tr>
				</table>
			</div>
			
		</div>
		</td>
		</tr>
	</table></td>
	</tr>
</form>
</table>
</body>
</html>

<script language="javascript">
	//HTML�Ǵ� JSP �������� ������ �κп� ������ ���� ��������.
	RemoveOutline();
</script>
