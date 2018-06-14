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
		//alert(id);
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
		
		//alert(f.bugwa_yn.value);
		if( f.bugwa_yn.value == '1' ){
			alert("���·� �̺ΰ��� üũ�Ͽ����ϴ�. Ȯ���ϼ���. ");
			f.bugwa_yn.focus();
			return;
		}
		if( f.bugwa_area.value == '' ){
			alert("��������� �Է��ϼ��� ");
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
		//check();
	}
	
	// üũ�ڽ� üũ
	function check(){
		var f = document.form;
		var bugwa_yn = f.bugwa_yn;		
		if( bugwa_yn.value == '1' ){
			f.bugwa_yn.checked = 'true';
		}
	}
	
	
	// ���̵�
	function tabMove(sale){	
		var mul_no = document.form.mul_no.value;		
		location.href = "/gapan/sugeo/sugeo_bugwa_view.do?showTab="+sale+"&mul_no="+mul_no;
	}
	
	// ����ȭ�� �̵�
	function	goModify(mul_no, showTab)
	{
		var form = document.form;
		//form.action = "sugeo_bugwa_modify.do?showTab=showTab&goods_seq="+goods_seq+"&mul_no="+mul_no;
		form.action = "sugeo_bugwa_register_view.do?mul_no="+mul_no+"&showTab="+showTab;
		form.submit();
	}
	
//]]>
</script>


<body>

<form name="form" method="post">
<input type="hidden" name="mul_no" value="${mul_no }">
<input type="hidden" name="owner_ssn" value="">
<input type="hidden" name="owner_tel" value="">
<input type="hidden" name="owner_hp" value="">
<input type="hidden" name="message" value="${message }">

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
						<td width="111"><a><img src="/img/sale_off.gif" alt="���/�Ű�" width="110" height="22" border="0" onclick="Init();" style="CURSOR: Hand;"></a></td>
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
								<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">�����ڸ�</td>
								<td width="37%" bgcolor="eaeaea" class="table_bl_left">
									${sugeo.owner_nm }
								</td>
								<td width="100" align="center" bgcolor="e5eff8" class="sub_table_b">�ֹε�Ϲ�ȣ</td>
								<td bgcolor="eaeaea" class="table_bl_left">
									${sugeo.owner_ssn1 } - 
									${sugeo.owner_ssn2 }
								</td>
						  	</tr>
						  	<tr>
								<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">������ȣ</td>
								<td bgcolor="eaeaea" class="table_bl_left">
									${sugeo.owner_zip }
								</td>
								<td align="center" bgcolor="e5eff8" class="sub_table_b">�ּ�</td>
								<td bgcolor="eaeaea" class="table_bl_left">
									${sugeo.owner_zip_addr1 }
									${sugeo.owner_zip_addr2 }
								</td>
						  	</tr>
						  	
						  	<tr>
								<td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">��ȭ��ȣ</td>
								<td width="37%" bgcolor="eaeaea" class="table_bl_left">
									${sugeo.owner_tel1 }
									${sugeo.owner_tel2 }
									${sugeo.owner_tel3 }
								</td>
								<td align="center" bgcolor="e5eff8" class="sub_table_b">�޴���ȭ</td>
								<td bgcolor="eaeaea" class="table_bl_left">
									${sugeo.owner_hp1 }
									${sugeo.owner_hp2 }
									${sugeo.owner_hp3 }
								</td>
						  	</tr>
				  			<tr>
								<td height="30" colspan="4" align="left" bgcolor="#FFFFFF" class="">
							  		<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
										<tr>
									  		<td><span class="sub_stan_blue">&nbsp; * ���·� �ΰ� : </span>
									  			${sugeo.bugwa_yn_name }
									  		</td>
										</tr>
								  	</table>
								</td>						
						  	</tr>
						  	<tr>
								<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">�������</td>
								<td bgcolor="eaeaea" class="table_bl_left">
									${sugeo.bugwa_area }
								</td>
								<td align="center" bgcolor="e5eff8" class="sub_table_b">���رݾ� </td>
								<td bgcolor="eaeaea" class="table_bl_left">
									${sugeo.bugwa_danga }
								</td>
						  	</tr>
							<tr>
								<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">�⺻ ���·�</td>
								<td bgcolor="eaeaea" class="table_bl_left">
									${sugeo.bugwa_tax }
								</td>
								<td align="center" bgcolor="e5eff8" class="sub_table_b">������</td>
								<td bgcolor="eaeaea" class="table_bl_left">
									${sugeo.bugwa_red_rate }
									<!--  input type="checkbox" name="bugwa" value="0" onclick="javascript:click_idchk(this);"> �̹ݿ�-->
								</td>
							</tr>
							<tr>
								<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">���� ���·�</td>
								<td bgcolor="eaeaea" class="table_bl_left">
									${sugeo.bugwa_red_tax }
								</td>
								<td align="center" bgcolor="e5eff8" class="sub_table_b">���� �����</td>
								<td bgcolor="eaeaea" class="table_bl_left">
									${sugeo.bugwa_form }
								</td>
							</tr>
							<tr>
								<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">Ư�̻��� </td>
								<td colspan="3" bgcolor="eaeaea" class="table_bl_left">
									${sugeo.bugwa_bigo }
								</td>
							</tr>
						   							  	
		                  	</table></td>
		                </tr>
		                <tr>
		                	<c:choose>
			                	<c:when test="${fine_cnt == '0'  }">
			                		<td height="40" align="right"><a href="javascript:goModify('${mul_no }','');"><img src="/img/add_icon.gif" alt="�߰� " width="56" height="18" border="0"></a>
			                	</c:when>
			                	<c:otherwise>
									<td height="40" align="right"><a href="javascript:goModify('${mul_no }','');"><img src="/img/mod_icon.gif" alt="���� " width="56" height="18" border="0"></a>
								</c:otherwise>
							</c:choose>
							<!-- td height="40" align="right"><a href="javascript:goModify('${mul_no }','');"><img src="/img/mod_icon.gif" alt="���� " width="56" height="18" border="0"></a-->
						</td>
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
									${sugeo.sale_type_name }
								</td>
								<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">��������</td>
								<td bgcolor="eaeaea" class="table_bl_left">
									<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
									  	<tr>
											<td>${sugeo.sale_date }</td>
											<td></td>
									  	</tr>
									</table>
								</td>
						  	</tr>
						  	<tr>
								<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">ó������</td>
								<td bgcolor="eaeaea" class="table_bl_left">
									${sugeo.sale_bigo}
								</td>
								<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">������ȣ</td>
								<td bgcolor="eaeaea" class="table_bl_left">
									${sugeo.sale_no }
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
									${sugeo.hnd_type_name }
								</td>
								<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">��������</td>
								<td bgcolor="eaeaea" class="table_bl_left">
									<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
									  	<tr>
											<td>${sugeo.hnd_desdate }</td>
											<td></td>
									  	</tr>
									</table>
								</td>
						  	</tr>
						  	<tr>
								<td align="center" bgcolor="e5eff8" class="sub_table_b">ó����ü��</td>
								<td bgcolor="eaeaea" class="table_bl_left">
									${sugeo.hnd_office }
								</td>
								<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">��������</td>
								<td bgcolor="eaeaea" class="table_bl_left">
									<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
									  	<tr>
											<td>${sugeo.hnd_opedate }</td>
											<td></td>
									  	</tr>
									</table>
								</td>
						  	</tr>	
							<tr>
								<td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b" nowrap="nowrap">Ư�̻���</td>
								<td width="37%" colspan="3" bgcolor="eaeaea" class="table_bl_left" nowrap="nowrap">
									${sugeo.hnd_bigo }
								</td>
							</tr>
						
	                  	</table>
	                  	</td>
				  	</tr>
				  	<tr>
				  		<c:choose>
			                <c:when test="${sale_cnt == '0'  }">
							<td height="40" align="right"><a href="javascript:goModify('${mul_no }','showTab');"><img src="/img/add_icon.gif" alt="�߰� " width="56" height="18" border="0"></a></td>
							</c:when>
							<c:otherwise>
							<td height="40" align="right"><a href="javascript:goModify('${mul_no }','showTab');"><img src="/img/mod_icon.gif" alt="���� " width="56" height="18" border="0"></a></td>
							</c:otherwise>
						</c:choose>						
					</tr>
					<tr><td height="40"></td></tr>
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
	
	//select�� option�� ���õ� ������ ����
	function setSelectedOption(obj, val){
		for(i = 0 ; i < obj.options.length ; i++){
			if(obj.options[i].value == val){
				obj.options[i].selected = true;
				return;
			}
		}
	}
	//setSelectedOption(document.form.sale_type, '${sugeo.sale_type}');
	//setSelectedOption(document.form.hnd_type, '${sugeo.hnd_type}');
	
	function InitPage()
	{
		var obj = document.form.message.value;
		
		if(obj != "")	
			alert(obj);
			return;
	}
</script>