<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ include file="/jsp/common/loginCheck.jsp" %>
<%@ include file="/jsp/common/include.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=euc-kr" />

<title>::::: 서울시 도로점용관리시스템 :::::</title>
<style type="text/css">

<!--
body {
	margin: 0px;
}
-->

</style>
<link href="/css/roads.css" rel="stylesheet" type="text/css">
</head>

<script language='JavaScript' src='/js/Check_inputbox.js'></script>
<!-- script language="javascript" src="/jsp/facility/minwon/tab/info_register.js"></script-->
<script type="text/javascript">
//<![CDATA[
	function	ModifyPrc()
	{
		var	result	= DataCheck();

		if(result	==	false)
			return;
		
		var form = document.form;

		form.action = "/facility/junggiinfo/jumin_modify_prc.do";
					   
		form.submit();
	}

	function	Jumin_toaddr_Check()
	{
		var form = document.form;
		var	chk	= document.form.ADDR_CHECK.checked;
		var addr_check = document.getElementById("ADDR_CHECK");
		
		if(chk	== true)
		{
			form.TOPOST.value			= form.POST.value;
			form.TOADDR1.value			= form.ADDR1.value;
			form.TOADDR2.value			= form.ADDR2.value;
			addr_check.value = "1";
		}
		else
		{
			form.TOPOST.value			= "";
			form.TOADDR1.value			= "";
			form.TOADDR2.value			= "";
			addr_check.value = "0";
		}
	}
	
	function	Jumin_toaddr_Check2()
	{
		var form = document.form;
		var	chk	= form.ADDR_CHECK.checked;
		var addr_check = document.getElementById("ADDR_CHECK");
		
		if(chk	== true)
		{
			form.TOPOST.value			= form.POST.value;
			form.TOADDR1.value			= form.ADDR1.value;
			form.TOADDR2.value			= form.ADDR2.value;
			addr_check.value = "1";
		}
	}

	function 	openZipcodePopup(post, addr)
	{
		var	post1	= post;
		var	addr1	= addr;

		var url 	= "/zipcode.do?openerPost=" + post1 + "&openerAddr=" + addr1;
		var winName = "우편번호입력";
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

	function 	Init()
	{
		parent.Tab_Img("jumin");
	}

	function	DataCheck()
	{
		var form 	= document.form;
		var	str		= "";

		//	점용인 정보
		if(form.NAME.value.length	< 1){
			str	+= "점용인/법인명을 입력하세요\n";	
			form.NAME.focus();
		}
		else if(form.SSN1.value.length	< 6)
		{
			str	+= "주민/법인번호를  입력하세요\n";	
			form.SSN1.focus();
		} else if(form.SSN2.value.length	< 7)
		{
			str	+= "주민/법인번호를  입력하세요\n";	
			form.SSN2.focus();
		}
		else if(form.POST.value.length	< 1)
		{
			str	+= "우편번호를 입력하세요\n";
			form.POST.focus();
		}
		else if(form.ADDR2.value.length	< 1){
			str	+= "주소를 입력하세요\n";
			form.ADDR2.focus();
		}
		else if(form.TOPOST.value.length	< 1)
		{
			str	+= "우편번호를 입력하세요\n";
			form.TOPOST.focus();
		}
		else if(form.TOADDR2.value.length	< 1){
			str	+= "주소를 입력하세요\n";
			form.TOADDR2.focus();
		}

		if(str	== "")
		{
			return	true;
		}
		
		alert(str);

		return	false;		
	}
	
	function	Cancel()
	{
		history.back(1);
	}
//]]>
</script>

<body onkeyup="Init();">
<table width="780" border="0" cellpadding="0" cellspacing="0">
<form name="form" id="form" method="post">
<input type="hidden" name="ADMIN_NO" id="ADMIN_NO" value="${board.ADMIN_NO}">
<input type="hidden" name="CORP_CD" id="CORP_CD"  value="${CORP_CD}">
<input type="hidden" name="GU_CODE" id="GU_CODE"  value="${GU_CODE}">
	<tr>
		<td align="left" class="contborder_purple">
		<table width="100%" border="0" cellspacing="0" cellpadding="0">
			<tr>
			  <td><table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
				  <tr>
					<td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">점용인/법인명</td>
					<td width="37%" bgcolor="eaeaea" class="table_bl_left">
						<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
							<tr>
							  <td><input name="NAME" id="NAME" type="text" class="essential" style="width:120px" value="${board.NAME}" readonly></td>
							</tr>
						</table>
					</td>
					<td width="100" align="center" bgcolor="e5eff8" class="sub_table_b">주민/법인번호</td>
					<td bgcolor="eaeaea" class="table_bl_left">
						<input name="SSN1" id="SSN1" type="text" class="essential" style="width:40px; ime-mode:disabled" value="${SSN1}" onKeyPress="nr_num_int(this);" onKeyUp="count_check(this, SSN2, 6);" maxlength="6">
					  - <input name="SSN2" id="SSN2" type="text" class="essential" style="width:45px; ime-mode:disabled" value="${SSN2}" onKeyPress="nr_num_int(this);" maxlength="7"></td>
				  </tr>
				  <tr>
					<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">대표자명</td>
					<td bgcolor="eaeaea" class="table_bl_left"><input name="TOPOST_NM" id="TOPOST_NM" type="text" class="input_form1" style="width:120px" value="${board.TOPOST_NM}"></td>
					<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">사업자등록번호</td>
					<td bgcolor="eaeaea" class="table_bl_left">
						<input name="BIZSSN1" id="BIZSSN1" type="text" class="input_form1" value="${BIZSSN1}" style="width:20px; ime-mode:disabled" onKeyPress="nr_num_int(this);" onKeyUp="count_check(this, BIZSSN2, 3);" maxlength="3">
					  - <input name="BIZSSN2" id="BIZSSN2" type="text" class="input_form1" value="${BIZSSN2}" style="width:15px; ime-mode:disabled" onKeyPress="nr_num_int(this);" onKeyUp="count_check(this, BIZSSN3, 2);" maxlength="2">
					  - <input name="BIZSSN3" id="BIZSSN3" type="text" class="input_form1" value="${BIZSSN3}" style="width:35px; ime-mode:disabled" onKeyPress="nr_num_int(this);" maxlength="5">
			  	  </tr>
				  <tr>
					<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">점용인 주소</td>
					<td bgcolor="eaeaea" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
						<tr>
						  <td><input name="POST" id="POST" type="text" class="essential" style="width:50px" onchange="Jumin_toaddr_Check2();" onclick="Jumin_toaddr_Check2();" onFocus="Jumin_toaddr_Check2();" value="${board.POST}" readonly></td>
						  <td><a href="javascript:openZipcodePopup('form.POST', 'form.ADDR1');"><img src="/img/search_icon.gif" alt="검색" width="56" height="18" border="0"></a></td>
						</tr>
					</table></td>
					<td align="center" bgcolor="e5eff8" class="sub_table_b">주소</td>
					<td bgcolor="eaeaea" class="table_bl_left">
						<input name="ADDR1" id="ADDR1" type="text" class="essential" style="width:250px" onchange="Jumin_toaddr_Check2();" onclick="Jumin_toaddr_Check2();" onFocus="Jumin_toaddr_Check2();" value="${board.ADDR1}" readonly>
						<input name="ADDR2" id="ADDR2" type="text" class="essential" style="width:250px" onchange="Jumin_toaddr_Check2();" onclick="Jumin_toaddr_Check2();" onFocus="Jumin_toaddr_Check2();" value="${board.ADDR2}"></td>
				  </tr>
				  <tr>
					<td align="center" bgcolor="e5eff8" class="sub_table_b">업태</td>
					<td bgcolor="eaeaea" class="table_bl_left">
						<input name="BIZ_STATUS" id="BIZ_STATUS" type="text" class="input_form1" style="width:60px" value="${board.BIZ_STATUS}">
					</td>
				  	<td align="center" bgcolor="e5eff8" class="sub_table_b">종목</td>
					<td bgcolor="eaeaea" class="table_bl_left">
						<input name="BIZ_TYPES" id="BIZ_TYPES" type="text" class="input_form1" style="width:160px" value="${board.BIZ_TYPES}">
					</td>
				  </tr>
				  <tr>
					<td height="34" colspan="4" align="left" bgcolor="#FFFFFF" class=""><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
						<tr>
						  <td><span class="sub_stan_blue">* 우편물 송달지</span> : </td>
						  <td width="16">
					  		<c:if test="${board.ADDR_CHECK == '1' }">
						  		<input id="ADDR_CHECK" name="ADDR_CHECK" type="checkbox" value="1" checked="checked" onchange="javascript:Jumin_toaddr_Check();" onclick="javascript:Jumin_toaddr_Check();">
						  	</c:if>
						  	<c:if test="${board.ADDR_CHECK != '1' }">
						  		<input id="ADDR_CHECK" name="ADDR_CHECK"  value="0" type="checkbox" onchange="javascript:Jumin_toaddr_Check();" onclick="javascript:Jumin_toaddr_Check();">
						  	</c:if>
						  </td>
						  <td width="110">점용인 정보와 동일 </td>
						</tr>
					</table></td>
				  </tr>
				  <tr>
					<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">송달지 주소</td>
					<td bgcolor="eaeaea" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
						<tr>
						  <td><input name="TOPOST" id="TOPOST" type="text" class="essential" style="width:50px" value="${board.TOPOST}"  onselect="Jumin_toaddr_Check2();" onfocus="Jumin_toaddr_Check2();" onkeyup="Jumin_toaddr_Check2();" readonly></td>
						  <td><a href="javascript:openZipcodePopup('form.TOPOST', 'form.TOADDR1');"><img src="/img/search_icon.gif" alt="검색" width="56" height="18" border="0"></a></td>
						</tr>
					</table></td>
					<td align="center" bgcolor="e5eff8" class="sub_table_b">주소</td>
					<td bgcolor="eaeaea" class="table_bl_left">
						<input name="TOADDR1" id="TOADDR1" type="text" class="essential" style="width:250px" value="${board.TOADDR1}" onfocus="Jumin_toaddr_Check2();" onclick="Jumin_toaddr_Check2();" onkeyup="Jumin_toaddr_Check2();" readonly>
						<input name="TOADDR2" id="TOADDR2" type="text" class="essential" style="width:250px" value="${board.TOADDR2}" onfocus="Jumin_toaddr_Check2();" onclick="Jumin_toaddr_Check2();" onkeyup="Jumin_toaddr_Check2();"></td>
				  </tr>
				
				  <tr height="25">
					<td height="34" colspan="4" align="left" bgcolor="#FFFFFF" class="">
						<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
							<tr>
							  <td><span class="sub_stan_blue">* 담당자 정보</span></td>
							</tr>
						</table>
					</td>
				  </tr>				  
				  
				  <tr>
						<td align="center" bgcolor="e5eff8" class="sub_table_b">지점명/담당자명</td>
						<td bgcolor="eaeaea" class="table_bl_left" height="25">
							<input name="OFFICE" id="OFFICE" type="text" class="input_form1" style="width:100px" value="${board.OFFICE}" readonly="readonly">
							/ <input name="MANAGER" id="MANAGER" type="text" class="input_form1" style="width:130px" value="${board.MANAGER}">
						</td>
						<td align="center" bgcolor="e5eff8" class="sub_table_b">전화번호</td>
						<td bgcolor="eaeaea" class="table_bl_left">
							<input name="TOTEL1" id="TOTEL1" type="text" class="input_form1" style="width:25px" style="ime-mode:disabled" onKeyPress="nr_num_int(this);" onKeyUp="count_check(this, TOTEL2, 3);" maxlength="3" value="${TOTEL1}"> - 
							<input name="TOTEL2" id="TOTEL2" type="text" class="input_form1" style="width:30px" style="ime-mode:disabled" onKeyPress="nr_num_int(this);" onKeyUp="count_check(this, TOTEL3, 4);" maxlength="4" value="${TOTEL2}"> - 
							<input name="TOTEL3" id="TOTEL3" type="text" class="input_form1" style="width:30px" style="ime-mode:disabled" onKeyPress="nr_num_int(this);" onKeyUp="count_check(this, TOTEL_EXT 4);" maxlength="4" value="${TOTEL3}">
							&nbsp;&nbsp;(&nbsp;내선&nbsp;<input name="TOTEL_EXT" id="TOTEL_EXT" type="text" class="input_form1" style="width:30px" style="ime-mode:disabled" maxlength="4" value="${board.TOTEL_EXT}">&nbsp;)
						</td>
					</tr>
					
					<tr>
						<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">FAX</td>
						<td bgcolor="eaeaea" class="table_bl_left">
							<input name="TOFAX1" id="TOFAX1" type="text" class="input_form1" style="width:25px" style="ime-mode:disabled" onKeyPress="nr_num_int(this);" onKeyUp="count_check(this, TOFAX2, 3);" maxlength="3" value="${TOFAX1}"> - 
							<input name="TOFAX2" id="TOFAX2" type="text" class="input_form1" style="width:30px" style="ime-mode:disabled" onKeyPress="nr_num_int(this);" onKeyUp="count_check(this, TOFAX3, 4);" maxlength="4" value="${TOFAX2}"> - 
							<input name="TOFAX3" id="TOFAX3" type="text" class="input_form1" style="width:30px" style="ime-mode:disabled" onKeyPress="nr_num_int(this);" onKeyUp="count_check(this, TOHP1, 4);" maxlength="4" value="${TOFAX3}">
						</td>
						<td align="center" bgcolor="e5eff8" class="sub_table_b">휴대전화</td>
						<td bgcolor="eaeaea" class="table_bl_left">
							<input name="HP1" id="HP1" type="text" class="input_form1" style="width:25px" style="ime-mode:disabled" onKeyPress="nr_num_int(this);" onKeyUp="count_check(this, HP2, 3);" maxlength="3"  value="${HP1}"> - 
							<input name="HP2" id="HP2" type="text" class="input_form1" style="width:30px" style="ime-mode:disabled" onKeyPress="nr_num_int(this);" onKeyUp="count_check(this, HP3, 4);" maxlength="4"  value="${HP2}"> - 
							<input name="HP3" id="HP3" type="text" class="input_form1" style="width:30px" style="ime-mode:disabled" onKeyPress="nr_num_int(this);" maxlength="4"  value="${HP3}">
						</td>
					</tr>
				</table>
			<tr>
			  	<td height="40" align="right" colspan="4">
				<table width="0" border="0" cellspacing="0" cellpadding="0" align="right">
			  		<a href="javascript:Cancel()"><img src="/img/can_icon.gif" alt="취소" width="56" height="18" border="0"></a>
			  		<a href="javascript:ModifyPrc()"><img src="/img/save_icon2.gif" alt="저장" width="56" height="18" border="0"></a>
				</table>
				</td>
			</tr>
		</table></td>
	</tr>

</table>
</body>
</html>