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
<script language='JavaScript' src='/js/Check_inputbox.js'></script>
<script language="javascript" src="/js/Ajax_request.js"></script>
<!--  //********** BEGIN_����_20120212 -->
<script language="javascript" src="/js/zipcode.js"></script>
<!--   //********** END_����_20120212 -->   


<!--  script language='JavaScript' src='/jsp/gapan/gapan/tab/info_register.js'></script-->

<script type="text/javascript">
//<![CDATA[
	function 	Init()
	{
		parent.Tab_Img("unyong");
	}

	function	ModifyPrc()
	{
		var	result	= DataCheck();
		
		if(result	==	false)
			return;
		
		var form = document.form;

		form.action = "/gapan/jumyonginfo/unyong_modify_prc.do";
		form.submit();
	}

	function	Cancel(GAPAN_NO)
	{
		var form = document.form;

		form.action = "/gapan/jumyonginfo/unyong_view.do?GAPAN_NO="+GAPAN_NO;
		form.submit();
	}
	
	function	DataCheck()
	{
		var form 	= document.form;
		var	str		= "";

		if(form.OWNER_NAME.value.length	< 1)
		{
			str	+= "��ڸ��� �Է��ϼ���\n";
			alert(str);
			form.OWNER_NAME.focus();
		}
		else if(form.OWNER_SSN1.value.length	< 1)
		{
			str	+= "��� �ֹε�Ϲ�ȣ�� �Է��ϼ���\n";
			alert(str);
			form.OWNER_SSN1.focus();
		}
		else if(form.OWNER_SSN2.value.length	< 1)
		{
			str	+= "��� �ֹε�Ϲ�ȣ�� �Է��ϼ���\n";
			alert(str);
			form.OWNER_SSN2.focus();
		}
		else if(form.OWNER_TOPOST.value.length	< 1 || form.OWNER_TOADDR1.value.length < 1)
		{
			str	+= "���������� �����ȣ�� �����ϼ���\n";
			alert(str);
			//********** BEGIN_����_20120213
			//openZipcodePopup('form.OWNER_TOPOST', 'form.OWNER_TOADDR1');
			//********** END_����_20120213
			javascript:openZipcodePopup_new('form.OWNER_TOPOST', 'form.OWNER_TOADDR1', 'form.TOADDR1_NEW', 'form.TOSI', 'form.TOGUN', 'form.TODORO_NM', 'form.TOBD_NM','form.TDONG', 'form.OWNER_TOBONBUN', 'form.OWNER_TOBUBUN');			
			
		}
		else if(form.OWNER_TOBONBUN.value.length	< 1)
		{
			str	+= "���������� ���ּҸ� �Է��ϼ���\n";
			alert(str);
			form.OWNER_TOBONBUN.focus();
		}

		if(str	== "")
		{
			return	true;
		}
		
		return	false;
	}
	
	function	Jumin_toaddr_Check()
	{
		var form 	= document.form;
		var	chk1		= form.ADDR_CHECK1.checked;

		if(chk1	== true)
		{
			form.OWNER_TOPOST.value		= form.OWNER_POST.value;
			form.OWNER_TOADDR1.value	= form.OWNER_ADDR1.value;
			form.OWNER_TOADDR2.value	= form.OWNER_ADDR2.value;
			 
			
			form.TOADDR1_NEW.value	= form.ADDR1_NEW.value;
			form.TOSI.value	= form.SI.value;
			form.TDONG.value	= form.DONG.value; 
			//********** BEGIN_����_20120402
			form.TOGUN.value	= form.GUN.value;
			form.T_RI.value	= form.RI.value;
			//********** END_����_20120402
			form.TODORO_NM.value	= form.DORO_NM.value;
			form.TOBD_NM.value	= form.BD_NM.value;
			form.TOBD_DET_NM.value	= form.BD_DET_NM.value;
			
			form.TOBD_BON.value	= form.BD_BON.value;
			form.TOBD_BU.value	= form.BD_BU.value;
			
			
			
			if(form.OWNER_SAN.checked == true){
				form.OWNER_SAN.value = "1";
				form.OWNER_TOSAN.checked = true;
				form.OWNER_TOSAN.value = "1";
			}else{
				form.OWNER_SAN.value = "0";
				form.OWNER_TOSAN.checked = false;
				form.OWNER_TOSAN.value = "0";
			}
			form.OWNER_TOBONBUN.value	= form.OWNER_BONBUN.value;
			form.OWNER_TOBUBUN.value	= form.OWNER_BUBUN.value;
			
			form.ADDR_CHECK1.value = "1";
		}
		else
		{
			form.ADDR_CHECK1.value = "0";
			
			if(form.OWNER_TOSAN.checked == true){
				form.OWNER_TOSAN.value = "1";
			}else{
				form.OWNER_TOSAN.value = "0";
			}
		}
	}
	
	/**********************************************************************************************************************************/
      //********** BEGIN_����_20120212
      /*
	function 	openZipcodePopup(post, addr)
	{
		var	post1	= post;
		var	addr1	= addr;

		var url 	= "/zipcode.do?openerPost=" + post1 + "&openerAddr=" + addr1;
		var winName = "�����ȣ�Է�";
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
	
	function openZipcodePopup_new(post, addr, addr_new, si, gu, doro, bd)
	{ 
		var	post1	= post;
		var	addr1	= addr;
		var	addr1_new	= addr_new;
		var	addr1_si	= si;
		var	addr1_gu	= gu;
		var	addr1_doro	= doro;
		var	addr1_bd	= bd;
		
		 
		
		//var url 	= "/zipcode.do?openerPost=" + post1 + "&openerAddr=" + addr1+ "&openerAddrNew=" + addr1_new+ "&openerSi=" + addr1_si+ "&openerGu=" + addr1_gu+ "&openerDoro=" + addr1_doro+"&openerBd=" + addr1_bd;
		var url 	= "/zipCode_New.do?openerPost=" + post1 + "&openerAddr=" + addr1+ "&openerAddrNew=" + addr1_new+ "&openerSi=" + addr1_si+ "&openerGun=" + addr1_gu+ "&openerDoro=" + addr1_doro+"&openerBd=" + addr1_bd;
		
		//alert('url ='+url);
		
		var winName = "�����ȣ�Է�";
		//var width 	= 420;
		var width 	= 840;
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
    //********** END_����_20120212
	 function ChangeImg(thisObj, preViewer) {
		
		if(!/(\.gif|\.jpg|\.jpeg|\.png)$/i.test(thisObj.value)) {
			alert("�̹��� ������ ������ �����Ͻʽÿ�");
			return;
		}

		preViewer = (typeof(preViewer) == "object") ? preViewer : document.getElementById(preViewer);
		var ua = window.navigator.userAgent;

		if (ua.indexOf("MSIE") > -1) {
			var img_path = "";
			if (thisObj.value.indexOf("\\fakepath\\") < 0) {                 
				img_path = thisObj.value;
			} else {
				thisObj.select();
				var selectionRange = document.selection.createRange();
				img_path = selectionRange.text.toString();
				thisObj.blur();
			}
				preViewer.style.filter = "progid:DXImageTransform.Microsoft.AlphaImageLoader(src='fi" + "le://" + img_path + "', sizingMethod='scale')";
		} else {
			preViewer.innerHTML = "";
			var W = preViewer.offsetWidth;
			var H = preViewer.offsetHeight;
			var tmpImage = document.createElement("img");
			preViewer.appendChild(tmpImage);
	
			tmpImage.onerror = function () {
				return preViewer.innerHTML = "";
			};
	
			tmpImage.onload = function () {
	
				if (this.width > W) {
					this.height = this.height / (this.width / W);
					this.width = W;
				}
				if (this.height > H) {
					this.width = this.width / (this.height / H);
					this.height = H;
				}
			};
	        if (ua.indexOf("Firefox/3") > -1) {
				var picData = thisObj.files.item(0).getAsDataURL();
				tmpImage.src = picData;
			} else {
				tmpImage.src = "file://" + thisObj.value;
			}
		}
     }

	//Ŭ���� �ź��� Ȯ�� üũ �� ����
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
	
//]]>
</script>

<body onload="Init()">

<form id="form" name="form" method="post" enctype="multipart/form-data">
	<input type="hidden" id="GAPAN_NO" name="GAPAN_NO" value="${GAPAN_NO}">
	<input type="hidden" id="GU_CODE" name="GU_CODE" value="${GU_CODE}">
	<input type="hidden" id="OWNER_IMG_NAME" name="OWNER_IMG_NAME" value="${board.OWNER_IMG_NAME }">

	<table width="780" border="0" cellpadding="0" cellspacing="0">
		<tr>
			<td align="left" class="contborder_purple">
			
			<table width="100%" border="0" cellspacing="0" cellpadding="0">
				<tr>
				  <td>
				  
					<table width="100%" border="0" cellspacing="0" cellpadding="0">
	                <tr>
	                  	<td>
	                  	<table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
					  	<tr>
							<td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">��ڸ�</td>
							<td width="37%" bgcolor="eaeaea" class="table_bl_left">
								<input id="OWNER_NAME" name="OWNER_NAME" type="text" class="essential" style="width:150px" value="${board.OWNER_NAME}" maxlength="35">
								<c:if test="${board.OWNER_IDCHK == '1'}"> 
									<input id="OWNER_IDCHK" name="OWNER_IDCHK" type="checkbox" value="1" checked onclick="javascript:click_idchk(this);">�ź��� Ȯ��
								</c:if>
								<c:if test="${board.OWNER_IDCHK == '0'}"> 
									<input id="OWNER_IDCHK" name="OWNER_IDCHK" type="checkbox" value="0" onclick="javascript:click_idchk(this);">�ź��� Ȯ��
								</c:if>
							</td>
							<td width="100" align="center" bgcolor="e5eff8" class="sub_table_b" rowspan="3">
								<table>
									<tr><td>��� ����</td></tr>
									<tr>
										<td>
											<br><br>
											<span onclick="javascript:document.getElementById('file1').click();" style="overflow:hidden; background-repeat:no-repeat; cursor: pointer;">
											</span>
										</td>
									</tr>
								</table>
							</td>
							<td bgcolor="eaeaea" class="table_bl_left" rowspan="3" align="center">
								<table>
									<tr>
										<td><input type='file' id="OWNER_IMG" name='OWNER_IMG' 	style="width:10;" onchange="ChangeImg(this, 'tblview');" ></td>
									</tr>
									<tr>
										<td width=100 height=130 id="tblview" style="background-image:url('${board.OWNER_IMG_NAME}'); background-repeat:no-repeat; background-attachment:scroll; background-position:50% 50%;"></td>
									</tr>
								</table>
							</td>
						</tr>
						<tr>
							<td width="100" align="center" bgcolor="e5eff8" class="sub_table_b">�ֹε�Ϲ�ȣ</td>
							<td bgcolor="eaeaea" class="table_bl_left">
								<input name="OWNER_SSN1" type="text" class="essential" style="width:40px; ime-mode:disabled" value="${board.OWNER_SSN1}" onKeyPress="nr_num_int(this);" onKeyUp="count_check(this, OWNER_SSN2, 6);" maxlength="6">
							  - <input name="OWNER_SSN2" type="text" class="essential" style="width:45px; ime-mode:disabled" value="${board.OWNER_SSN2}" onKeyPress="nr_num_int(this);" onKeyUp="nr_num_int(this);" maxlength="7">
							</td>
					  	</tr>
					  	<tr>
							<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">����(����)</td>
							<td bgcolor="eaeaea" class="table_bl_left">
								<c:if test="${board.OWNER_GENDER == '1'}"><input name="OWNER_GENDER" type="radio" value="1" checked>��<input name="OWNER_GENDER" type="radio" value="2">��</c:if>
								<c:if test="${board.OWNER_GENDER == '2'}"><input name="OWNER_GENDER" type="radio" value="1">��<input name="OWNER_GENDER" type="radio" value="2" checked>��</c:if>
								&nbsp;( <input name="OWNER_AGE" class="input_form1" type="text" style="width:20px" maxlength="3" value="${board.OWNER_AGE}" onKeyPress="nr_num_int(this);" onKeyUp="nr_num_int(this);"> ��)
							</td>
					  	</tr>
					  	<tr>
							<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">��ȭ��ȣ</td>
							<td bgcolor="eaeaea" class="table_bl_left">
								<input name="OWNER_TEL1" value="${board.OWNER_TEL1}" type="text" class="input_form1" style="width:25px" style="ime-mode:disabled" onKeyPress="nr_num_int(this);" onKeyUp="count_check(this, OWNER_TEL2, 3);" maxlength="3"> - 
								<input name="OWNER_TEL2" value="${board.OWNER_TEL2}" type="text" class="input_form1" style="width:30px" style="ime-mode:disabled" onKeyPress="nr_num_int(this);" onKeyUp="count_check(this, OWNER_TEL3, 4);" maxlength="4"> - 
								<input name="OWNER_TEL3" value="${board.OWNER_TEL3}" type="text" class="input_form1" style="width:30px" style="ime-mode:disabled" onKeyPress="nr_num_int(this);" onKeyUp="count_check(this, OWNER_HP1, 4);" maxlength="4">
							</td>
							<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">�޴���ȭ</td>
							<td bgcolor="eaeaea" class="table_bl_left">
								<input name="OWNER_HP1" value="${board.OWNER_HP1}" type="text" class="input_form1" style="width:25px" style="ime-mode:disabled" onKeyPress="nr_num_int(this);" onKeyUp="count_check(this, OWNER_HP2, 3);" maxlength="3"> - 
								<input name="OWNER_HP2" value="${board.OWNER_HP2}" type="text" class="input_form1" style="width:30px" style="ime-mode:disabled" onKeyPress="nr_num_int(this);" onKeyUp="count_check(this, OWNER_HP3, 4);" maxlength="4"> - 
								<input name="OWNER_HP3" value="${board.OWNER_HP3}" type="text" class="input_form1" style="width:30px" style="ime-mode:disabled" onKeyPress="nr_num_int(this);" onKeyUp="nr_num_int(this);" maxlength="4">
							</td>
					  	</tr>
					  	<tr>
							<td height="34" colspan="2" align="left" bgcolor="#FFFFFF" class="">
								<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
									<tr>
									  <td width="50%">
									  	<span class="sub_stan_blue">* �ֹε���� �ּ�</span>
									  </td>
									</tr>
								</table>
							</td>
							<td height="34" colspan="2" align="left" bgcolor="#FFFFFF" class="">
								<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
									<tr>
									  <td width="50%">
									  	<span class="sub_stan_blue">* ���������� : </span>
									  	<c:if test="${board.ADDR_CHECK1 == '1'}">
									  		<input name="ADDR_CHECK1" type="checkbox" onclick="javascript:Jumin_toaddr_Check()"  value="1" checked>
									  	</c:if>
									  	<c:if test="${board.ADDR_CHECK1 != '1'}">
									  		<input name="ADDR_CHECK1" type="checkbox" onclick="javascript:Jumin_toaddr_Check()" value="0">
									  	</c:if>
									  	�ֹε���� �ּ� ������ ���� 
									  </td>
									</tr>
								</table>
							</td>
					  	</tr>
					  	<!--  //********** BEGIN_����_20120212 -->
                        <!-- 
					  	<tr>
							<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">�����ȣ</td>
							<td bgcolor="eaeaea" class="table_bl_left">
								<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
									<tr>
									  <td><input name="OWNER_POST" type="text" style="width:50px" onFocus="Jumin_toaddr_Check();" onKeyPress="Jumin_toaddr_Check();" onKeyUp="Jumin_toaddr_Check();" value="${board.OWNER_POST}" readonly class="input_form1"></td>
									  <td><a href="javascript:openZipcodePopup_new('form.OWNER_POST', 'form.OWNER_ADDR1', 'form.ADDR1_NEW', 'form.SI', 'form.GUN', 'form.DORO_NM', 'form.BD_NM');"><img src="/img/search_icon.gif" alt="�˻�" width="56" height="18" border="0"></a></td>
									</tr>
								</table>
							</td>
							<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">�����ȣ</td>
							<td bgcolor="eaeaea" class="table_bl_left">
								<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
									<tr>
  									  <td><input name="OWNER_TOPOST" type="text" style="width:50px" onFocus="Jumin_toaddr_Check();" onKeyPress="Jumin_toaddr_Check();" onKeyUp="Jumin_toaddr_Check();" value="${board.OWNER_TOPOST}" readonly  class="essential"></td>
									  <td><a href="javascript:openZipcodePopup_new('form.OWNER_TOPOST', 'form.OWNER_TOADDR1', 'form.TOADDR1_NEW', 'form.TOSI', 'form.TOGUN', 'form.TODORO_NM', 'form.TOBD_NM');"><img src="/img/search_icon.gif" alt="�˻�" width="56" height="18" border="0"></a></td>
									</tr>
								</table>
							</td>
					  	</tr>
						-->
						<tr>
							<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">�����ȣ</td>
							<td bgcolor="eaeaea" class="table_bl_left">
								<table width="100%" border="0" cellpadding="0" cellspacing="0" class="sub_stan">
									<tr>
									  	<td width="50px"><input name="OWNER_POST" id="OWNER_POST" type="text" style="width:50px" onFocus="Jumin_toaddr_Check();" onKeyPress="Jumin_toaddr_Check();" onKeyUp="Jumin_toaddr_Check();" value="${board.OWNER_POST}" readonly class="input_form1"></td>
									  	<td width="50px"><a href="javascript:openZipcodePopup_new('form.OWNER_POST', 'form.OWNER_ADDR1', 'form.ADDR1_NEW', 'form.SI', 'form.GUN', 'form.DORO_NM', 'form.BD_NM','form.DONG','form.OWNER_BONBUN', 'form.OWNER_BUBUN' );"><img src="/img/search_icon.gif" alt="�˻�" width="56" height="18" border="0"></a></td>										
										<!--  sungh83 20131105 -->
										<td height ="13">%���θ��ּҰǹ�����,�ι����Է½�Ȯ��Ŭ��</td>
							     		<!--  sungh83 20131105 --> 
										<td align="right"><a href="javascript:addrConfirm('OWNER_POST','SI','GUN','DONG','DORO_NM','OWNER_BONBUN','OWNER_BUBUN','BD_BON','BD_BU','BD_NM','BD_DET_NM','OWNER_ADDR1','OWNER_ADDR2','ADDR1_NEW','form')"><img src="/img/ok_icon.gif" alt="Ȯ��" width="56" height="18" border="0"></a></td>																  
									</tr>
								</table>
							</td>
							<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">�����ȣ</td>
							<td bgcolor="eaeaea" class="table_bl_left">
								<table width="100%" border="0" cellpadding="0" cellspacing="0" class="sub_stan">
									<tr>
  									  	<td width="50px"><input name="OWNER_TOPOST" id="OWNER_TOPOST" type="text" style="width:50px" onFocus="Jumin_toaddr_Check();" onKeyPress="Jumin_toaddr_Check();" onKeyUp="Jumin_toaddr_Check();" value="${board.OWNER_TOPOST}" readonly  class="essential"></td>
										<td width="50px"><a href="javascript:openZipcodePopup_new('form.OWNER_TOPOST', 'form.OWNER_TOADDR1', 'form.TOADDR1_NEW', 'form.TOSI', 'form.TOGUN', 'form.TODORO_NM', 'form.TOBD_NM','form.TDONG', 'form.OWNER_TOBONBUN', 'form.OWNER_TOBUBUN');"><img src="/img/search_icon.gif" alt="�˻�" width="56" height="18" border="0"></a></td>
										<!--  sungh83 20131105 -->
										<td height ="13">%���θ��ּҰǹ�����,�ι����Է½�Ȯ��Ŭ��</td>
							      		<!--  sungh83 20131105 --> 
										<td align="right"><a href="javascript:addrConfirm('OWNER_TOPOST','TOSI','TOGUN','TDONG','TODORO_NM','OWNER_TOBONBUN','OWNER_TOBUBUN','TOBD_BON','TOBD_BU','TOBD_NM','TOBD_DET_NM','OWNER_TOADDR1','OWNER_TOADDR2','TOADDR1_NEW','form')"><img src="/img/ok_icon.gif" alt="Ȯ��" width="56" height="18" border="0"></a></td>																		   
									</tr>
								</table>
							</td>
					  	</tr>
						<!--   //********** END_����_20120212 -->					  	
					  	<tr>
					  	 <!-- �ֹε���� �⺻ �ּ� -->
							<td align="center" bgcolor="e5eff8" class="sub_table_b">�⺻ �ּ�${board.OWNER_SAN}</td>
							<td bgcolor="eaeaea" class="table_bl_left">
								<input id="OWNER_ADDR1" name="OWNER_ADDR1" type="text" class="input_form1" style="width:250px" onFocus="Jumin_toaddr_Check();" onKeyPress="Jumin_toaddr_Check();" onKeyUp="Jumin_toaddr_Check();" value="${board.OWNER_ADDR1}" readonly>
								��
								<c:if test="${board.OWNER_SAN == '1'}">
									<input type="checkbox"  class="input_form1" name="OWNER_SAN" onclick="Jumin_toaddr_Check();"  onFocus="Jumin_toaddr_Check();" onKeyPress="Jumin_toaddr_Check();" onKeyUp="Jumin_toaddr_Check();" value="${board.OWNER_SAN}" checked="checked">
								</c:if>
								<c:if test="${board.OWNER_SAN != '1'}">
									<input type="checkbox"  class="input_form1" name="OWNER_SAN" onclick="Jumin_toaddr_Check();"  onFocus="Jumin_toaddr_Check();" onKeyPress="Jumin_toaddr_Check();" onKeyUp="Jumin_toaddr_Check();" value="${board.OWNER_SAN}">
								</c:if>
								<input id="OWNER_BONBUN" name="OWNER_BONBUN" value="${board.OWNER_BONBUN}" type="text" class="input_form1" style="width:27px" style="ime-mode:disabled" onKeyUp="Jumin_toaddr_Check(); nr_num_int(this); count_check(this, OWNER_BONBUN, 4);" onKeyPress="Jumin_toaddr_Check(); nr_num_int(this); count_check(this, OWNER_BONBUN, 4);" maxlength="4">
								- <input id="OWNER_BUBUN" name="OWNER_BUBUN" value="${board.OWNER_BUBUN}" type="text" class="input_form1" style="width:27px" style="ime-mode:disabled" onKeyUp="Jumin_toaddr_Check(); nr_num_int(this); count_check(this, OWNER_BUBUN, 4);" onKeyPress="Jumin_toaddr_Check(); nr_num_int(this); count_check(this, OWNER_BUBUN, 4);" maxlength="4">
								<input id="OWNER_ADDR2" name="OWNER_ADDR2" type="text" class="input_form1" style="width:130px" value="${board.OWNER_ADDR2}" onKeyUp="Jumin_toaddr_Check();" maxlength="50">
							</td>
							<!-- ���������� �⺻ �ּ� -->
							<td align="center" bgcolor="e5eff8" class="sub_table_b">�⺻ �ּ�</td>
							<td bgcolor="eaeaea" class="table_bl_left">
								<input id="OWNER_TOADDR1" name="OWNER_TOADDR1" type="text" class="essential" style="width:250px" onFocus="Jumin_toaddr_Check();" onKeyPress="Jumin_toaddr_Check();" onKeyUp="Jumin_toaddr_Check();" value="${board.OWNER_TOADDR1}" readonly>
								��
								<c:if test="${board.OWNER_TOSAN == '1'}">
									<input type="checkbox"  class="input_form1" name="OWNER_TOSAN" onclick="Jumin_toaddr_Check();"  onFocus="Jumin_toaddr_Check();" onKeyPress="Jumin_toaddr_Check();" onKeyUp="Jumin_toaddr_Check();" value="${board.OWNER_TOSAN}" checked="checked">
								</c:if>
								<c:if test="${board.OWNER_TOSAN != '1'}">
									<input type="checkbox"  class="input_form1" name="OWNER_TOSAN" onclick="Jumin_toaddr_Check();"  onFocus="Jumin_toaddr_Check();" onKeyPress="Jumin_toaddr_Check();" onKeyUp="Jumin_toaddr_Check();" value="${board.OWNER_TOSAN}">
								</c:if>
								<input id="OWNER_TOBONBUN" name="OWNER_TOBONBUN" value="${board.OWNER_TOBONBUN}" type="text" class="essential" style="width:27px" style="ime-mode:disabled" onKeyUp="Jumin_toaddr_Check(); nr_num_int(this); count_check(this, OWNER_TOBONBUN, 4);" onKeyPress="Jumin_toaddr_Check(); nr_num_int(this); count_check(this, OWNER_TOBONBUN, 4);" maxlength="4">
								- <input id="OWNER_TOBUBUN" name="OWNER_TOBUBUN" value="${board.OWNER_TOBUBUN}" type="text" class="input_form1" style="width:27px" style="ime-mode:disabled" onKeyUp="Jumin_toaddr_Check(); nr_num_int(this); count_check(this, OWNER_TOBUBUN, 4);" onKeyPress="Jumin_toaddr_Check(); nr_num_int(this); count_check(this, OWNER_TOBUBUN, 4);" maxlength="4">
								<input id="OWNER_TOADDR2" name="OWNER_TOADDR2" type="text" class="input_form1" style="width:130px" value="${board.OWNER_TOADDR2}" onFocus="Jumin_toaddr_Check();" onKeyPress="Jumin_toaddr_Check();" onKeyUp="Jumin_toaddr_Check();" maxlength="50">
							</td>
					  	</tr>
					  	<tr>
					  	<!-- �ֹε���� ���θ� ���ּ� -->
							<td height="45px" align="center" bgcolor="e5eff8" class="sub_table_b">���θ� �ּ�</td>
							<td bgcolor="eaeaea" class="table_bl_left">
								<!--  //********** BEGIN_KANG_20120424 -->														
								<!--  //********** BEGIN_����_20120309 -->
								<!-- <input id="ADDR1_NEW" name="ADDR1_NEW" type="text" value="${board.SI} ${board.GUN} ${board.DORO_NM}" class="essential" style="width:250px" onClick="Jumin_toaddr_Check();" onChange="Jumin_toaddr_Check();" onFocus="Jumin_toaddr_Check();" onKeyUp="Jumin_toaddr_Check();"  readonly> -->
								<input id="ADDR1_NEW" name="ADDR1_NEW" type="text" <c:if test="${board.DORO_NM != null && board.DORO_NM != ''}">value="${board.SI} ${board.GUN} ${board.DORO_NM}"</c:if> class="essential" style="width:250px" onClick="Jumin_toaddr_Check();" onChange="Jumin_toaddr_Check();" onFocus="Jumin_toaddr_Check();" onKeyUp="Jumin_toaddr_Check();"  readonly>
								<!--   //********** END_����_20120309 -->															
								<!--   //********** END_KANG_20120424 -->
		 						<!--  //********** BEGIN_����_20120212 -->
								<input type="hidden" id="SI" name="SI" value="${board.SI}">
								<input type="hidden" id="GUN" name="GUN" value="${board.GUN}">
								<input type="hidden" id="DORO_NM" name="DORO_NM" value="${board.DORO_NM}">
								<input type="hidden" id="DONG" name="DONG" value="${board.DONG}">
								<!--   //********** END_����_20120212 -->
								<!--  //********** BEGIN_����_20120330 -->
								<input type="hidden" id="RI" name="RI" value="${board.RI}">
								<!--   //********** END_����_20120330 -->
								<!--  //********** BEGIN_KANG_20120424 -->
								<!-- 
								<input id="BD_BON" name="BD_BON" type="text" VALUE="${board.BD_BON}" class="essential" style="width:25px" onClick="Jumin_toaddr_Check();" onChange="Jumin_toaddr_Check();" onFocus="Jumin_toaddr_Check();" onKeyUp="Jumin_toaddr_Check();" >
								-
								<input id="BD_BU" name="BD_BU" type="text" VALUE="${board.BD_BU}" class="input_form1" style="width:25px" onClick="Jumin_toaddr_Check();" onChange="Jumin_toaddr_Check();" onFocus="Jumin_toaddr_Check();" onKeyUp="Jumin_toaddr_Check();"  >
								<input id="BD_NM" name="BD_NM" type="text" VALUE="${board.BD_NM}" class="input_form1" style="width:135px" onClick="Jumin_toaddr_Check();" onChange="Jumin_toaddr_Check();" onFocus="Jumin_toaddr_Check();" onKeyUp="Jumin_toaddr_Check();"  maxlength="50">
								<input id="BD_DET_NM" name="BD_DET_NM" type="text" VALUE="${board.BD_DET_NM}" class="input_form1" style="width:135px" onClick="Jumin_toaddr_Check();" onChange="Jumin_toaddr_Check();" onFocus="Jumin_toaddr_Check();" onKeyUp="Jumin_toaddr_Check();"  maxlength="50">
								 -->
								<c:if test="${board.DORO_NM != null && board.DORO_NM != ''}"> 
								<input id="BD_BON" name="BD_BON" type="text" VALUE="${board.BD_BON}" class="essential" style="width:25px" onClick="Jumin_toaddr_Check();" onChange="Jumin_toaddr_Check();" onFocus="Jumin_toaddr_Check();" onKeyUp="Jumin_toaddr_Check();" >
								-
								<input id="BD_BU" name="BD_BU" type="text" VALUE="${board.BD_BU}" class="input_form1" style="width:25px" onClick="Jumin_toaddr_Check();" onChange="Jumin_toaddr_Check();" onFocus="Jumin_toaddr_Check();" onKeyUp="Jumin_toaddr_Check();"  >
								<input id="BD_NM" name="BD_NM" type="text" VALUE="${board.BD_NM}" class="input_form1" style="width:135px" onClick="Jumin_toaddr_Check();" onChange="Jumin_toaddr_Check();" onFocus="Jumin_toaddr_Check();" onKeyUp="Jumin_toaddr_Check();"  maxlength="50">
								<input id="BD_DET_NM" name="BD_DET_NM" type="text" VALUE="${board.BD_DET_NM}" class="input_form1" style="width:135px" onClick="Jumin_toaddr_Check();" onChange="Jumin_toaddr_Check();" onFocus="Jumin_toaddr_Check();" onKeyUp="Jumin_toaddr_Check();"  maxlength="50">
								</c:if>
								<c:if test="${board.DORO_NM == null || board.DORO_NM == ''}"> 
								<input id="BD_BON" name="BD_BON" type="text" VALUE="" class="essential" style="width:25px" onClick="Jumin_toaddr_Check();" onChange="Jumin_toaddr_Check();" onFocus="Jumin_toaddr_Check();" onKeyUp="Jumin_toaddr_Check();" >
								-
								<input id="BD_BU" name="BD_BU" type="text" VALUE="" class="input_form1" style="width:25px" onClick="Jumin_toaddr_Check();" onChange="Jumin_toaddr_Check();" onFocus="Jumin_toaddr_Check();" onKeyUp="Jumin_toaddr_Check();"  >
								<input id="BD_NM" name="BD_NM" type="text" VALUE="" class="input_form1" style="width:135px" onClick="Jumin_toaddr_Check();" onChange="Jumin_toaddr_Check();" onFocus="Jumin_toaddr_Check();" onKeyUp="Jumin_toaddr_Check();"  maxlength="50">
								<input id="BD_DET_NM" name="BD_DET_NM" type="text" VALUE="" class="input_form1" style="width:135px" onClick="Jumin_toaddr_Check();" onChange="Jumin_toaddr_Check();" onFocus="Jumin_toaddr_Check();" onKeyUp="Jumin_toaddr_Check();"  maxlength="50">
								</c:if>
								<!--   //********** END_KANG_20120424 -->								
	 							
								
							</td>
							<!-- ���������� ���θ� ���ּ� -->
							<td align="center" bgcolor="e5eff8" class="sub_table_b">���θ� �ּ�</td>
							<td bgcolor="eaeaea" class="table_bl_left">
								<!--  //********** BEGIN_����_20120309 -->
								<!--  //********** BEGIN_KANG_20120424 -->
								<!-- <input id="TOADDR1_NEW" name="TOADDR1_NEW" type="text" value="${board.TOSI} ${board.TOGUN} ${board.TODORO_NM}" class="essential" style="width:250px" onClick="Jumin_toaddr_Check();" onChange="Jumin_toaddr_Check();" onFocus="Jumin_toaddr_Check();" onKeyUp="Jumin_toaddr_Check();"  readonly> -->
								<input id="TOADDR1_NEW" name="TOADDR1_NEW" type="text" <c:if test="${board.TODORO_NM != null && board.TODORO_NM != ''}">value="${board.TOSI} ${board.TOGUN} ${board.TODORO_NM}"</c:if> class="essential" style="width:250px" onClick="Jumin_toaddr_Check();" onChange="Jumin_toaddr_Check();" onFocus="Jumin_toaddr_Check();" onKeyUp="Jumin_toaddr_Check();"  readonly>
								<!--   //********** END_KANG_20120424 -->								
								
								<!--   //********** END_����_20120309 -->								
		 						<!--  //********** BEGIN_����_20120212 -->	 							
								<input type="hidden" id="TOSI" name="TOSI" value="${board.TOSI}"/>
								<input type="hidden" id="TOGUN" name="TOGUN" value="${board.TOGUN}"/>
								<input type="hidden" id="TODORO_NM" name="TODORO_NM" value="${board.TODORO_NM}"/>
								<input type="hidden" id="TDONG" name="TDONG" value="${board.TDONG}"/>
								<!--   //********** END_����_20120212 -->	
	 							<!--  //********** BEGIN_����_20120330 -->
								<input type="hidden" id="T_RI" name="T_RI" value="${TRI}" />
								<!--   //********** END_����_20120330 -->
								<!--  //********** BEGIN_KANG_20120424 -->
								<!-- 
								<input id="TOBD_BON" name="TOBD_BON" type="text" value="${board.TOBD_BON}" class="essential" style="width:25px" onClick="Jumin_toaddr_Check();" onChange="Jumin_toaddr_Check();" onFocus="Jumin_toaddr_Check();" onKeyUp="Jumin_toaddr_Check();" >
								-
								<input id="TOBD_BU" name="TOBD_BU" type="text" value="${board.TOBD_BU}" class="input_form1" style="width:25px" onClick="Jumin_toaddr_Check();" onChange="Jumin_toaddr_Check();" onFocus="Jumin_toaddr_Check();" onKeyUp="Jumin_toaddr_Check();"  >
								<input id="TOBD_NM" name="TOBD_NM" type="text" value="${board.TOBD_NM}" class="input_form1" style="width:135px" onClick="Jumin_toaddr_Check();" onChange="Jumin_toaddr_Check();" onFocus="Jumin_toaddr_Check();" onKeyUp="Jumin_toaddr_Check();"  maxlength="50">
								<input id="TOBD_DET_NM" name="TOBD_DET_NM" type="text" value="${board.TOBD_DET_NM}" class="input_form1" style="width:135px" onClick="Jumin_toaddr_Check();" onChange="Jumin_toaddr_Check();" onFocus="Jumin_toaddr_Check();" onKeyUp="Jumin_toaddr_Check();"  maxlength="50">
								 -->
								<c:if test="${board.TODORO_NM != null && board.TODORO_NM != ''}">
								<input id="TOBD_BON" name="TOBD_BON" type="text" value="${board.TOBD_BON}" class="essential" style="width:25px" onClick="Jumin_toaddr_Check();" onChange="Jumin_toaddr_Check();" onFocus="Jumin_toaddr_Check();" onKeyUp="Jumin_toaddr_Check();" >
								-
								<input id="TOBD_BU" name="TOBD_BU" type="text" value="${board.TOBD_BU}" class="input_form1" style="width:25px" onClick="Jumin_toaddr_Check();" onChange="Jumin_toaddr_Check();" onFocus="Jumin_toaddr_Check();" onKeyUp="Jumin_toaddr_Check();"  >
								<input id="TOBD_NM" name="TOBD_NM" type="text" value="${board.TOBD_NM}" class="input_form1" style="width:135px" onClick="Jumin_toaddr_Check();" onChange="Jumin_toaddr_Check();" onFocus="Jumin_toaddr_Check();" onKeyUp="Jumin_toaddr_Check();"  maxlength="50">
								<input id="TOBD_DET_NM" name="TOBD_DET_NM" type="text" value="${board.TOBD_DET_NM}" class="input_form1" style="width:135px" onClick="Jumin_toaddr_Check();" onChange="Jumin_toaddr_Check();" onFocus="Jumin_toaddr_Check();" onKeyUp="Jumin_toaddr_Check();"  maxlength="50">
								</c:if>
								<c:if test="${board.TODORO_NM == null || board.TODORO_NM == ''}">
								<input id="TOBD_BON" name="TOBD_BON" type="text" value="" class="essential" style="width:25px" onClick="Jumin_toaddr_Check();" onChange="Jumin_toaddr_Check();" onFocus="Jumin_toaddr_Check();" onKeyUp="Jumin_toaddr_Check();" >
								-
								<input id="TOBD_BU" name="TOBD_BU" type="text" value="" class="input_form1" style="width:25px" onClick="Jumin_toaddr_Check();" onChange="Jumin_toaddr_Check();" onFocus="Jumin_toaddr_Check();" onKeyUp="Jumin_toaddr_Check();"  >
								<input id="TOBD_NM" name="TOBD_NM" type="text" value="" class="input_form1" style="width:135px" onClick="Jumin_toaddr_Check();" onChange="Jumin_toaddr_Check();" onFocus="Jumin_toaddr_Check();" onKeyUp="Jumin_toaddr_Check();"  maxlength="50">
								<input id="TOBD_DET_NM" name="TOBD_DET_NM" type="text" value="" class="input_form1" style="width:135px" onClick="Jumin_toaddr_Check();" onChange="Jumin_toaddr_Check();" onFocus="Jumin_toaddr_Check();" onKeyUp="Jumin_toaddr_Check();"  maxlength="50">
								</c:if>
								<!--   //********** END_KANG_20120424 -->								
	 							
							</td>
					  	</tr>
					  	<tr>
						  	<td height="34" colspan="4" align="left" bgcolor="#FFFFFF" class="">
								<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
									<tr>
									  <td width="50%">
									  	<span class="sub_stan_blue">* ��Ȱ����</span>
									  </td>
									</tr>
								</table>
							</td>
						</tr>
						<tr>
							<td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b" nowrap="nowrap">��Ȱ����</td>
							<td width="37%" bgcolor="eaeaea" class="table_bl_left" nowrap="nowrap">
								<select name="LC_SEL" style="width:70px" class="input_form1">
									${lc_sel}
								</select>
								<input name="LC_TXT" type="text" class="input_form1" style="width:180px" value="${board.LC_TXT}" maxlength="25">
							</td>
							<td width="100" align="center" bgcolor="e5eff8" class="sub_table_b" nowrap="nowrap">�ְ�����</td>
							<td width="36%" bgcolor="eaeaea" class="table_bl_left">
								<select name="RT_SEL" style="width:70px" class="input_form1">
									${rt_sel}
								</select>
								<input name="RT_TXT" type="text" class="input_form1" style="width:180px" value="${board.RT_TXT}" maxlength="25">
							</td>
						</tr>
						<tr>
							<td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b" nowrap="nowrap">����/�ε���</td>
							<td bgcolor="eaeaea" class="table_bl_left" nowrap="nowrap" colspan="3">
								<input name="ESTATE_MOVE" type="text" class="input_form1" style="width:90px" value="${board.ESTATE_MOVE}" maxlength="15" onKeyDown="nr_num_int(this);" onKeyUp="nr_num_int(this);  comma_paste(this);" onKeyPress="nr_num_int(this);"> �� / 
								<input name="ESTATE_REAL" type="text" class="input_form1" style="width:90px" value="${board.ESTATE_REAL}" maxlength="15" onKeyDown="nr_num_int(this);" onKeyUp="nr_num_int(this);  comma_paste(this);" onKeyPress="nr_num_int(this);"> ��
							</td>
							
						</tr>
						
						<tr>
							<td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b" nowrap="nowrap">���</td>
							<td colspan="3" bgcolor="eaeaea" class="table_bl_left">
						        <textarea name="NOTE" id="NOTE" class="input_form1" style="width:98%" onkeyup="displayBytes(500, 'NOTE');">${board.NOTE }</textarea>
		     				</td>
						</tr>
						
	                  	</table>
	                  	</td>
				  	</tr>
				</table>
				</td>
				</tr>
				
				<tr>
					<td height="40" align="right">
				  		<a href="javascript:Cancel('${GAPAN_NO}')"><img src="/img/can_icon.gif" alt="���" width="56" height="18" border="0"></a>
				  		<a href="javascript:ModifyPrc()"><img src="/img/save_icon2.gif" alt="����" width="56" height="18" border="0"></a>
				  	</td>
				</tr>
			</table>
			</td>
		</tr>
	</table>

</form>
</body>
</html>
