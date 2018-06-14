<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ include file="/jsp/common/loginCheck.jsp" %>
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

<script type="text/javascript">
//<![CDATA[

	function	ModifyPrc()
	{
		var	result	= DataCheck();

		if(result	==	false)
			return;
		
		var form = document.form;

		form.action = "/facility/minwoninfo/jumin_modify_prc.do";
		form.submit();
	}

	function	Cancel()
	{
		var form = document.form;

		form.action = "/facility/minwoninfo/jumin_view.do";
		form.submit();
	}

	function	Jumin_toaddr_Check()
	{
		var form = document.form;
		var	chk	= form.checkbox.checked;

		if(chk	== true)
		{
			form.TOPOST_NM.value		= form.NAME.value;
			form.TOPOST.value			= form.POST.value;
			form.TOADDR1.value			= form.ADDR1.value;
			form.TOADDR2.value			= form.ADDR2.value;
			form.TOEMAIL.value			= form.EMAIL.value;
			form.TOTEL.value			= form.TEL.value;
			form.TOHP.value				= form.HP.value;
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
		if(form.NAME.value.length	< 1)
			str	+= "점용인/법인명을 입력하세요\n";	
		else if(form.jumin_ssn1.value.length	< 6	||	form.jumin_ssn2.value.length	< 7)
			str	+= "주민/법인번호를  입력하세요\n";	
		else if(form.POST.value.length	< 1)
			str	+= "우편번호를 입력하세요\n";
		else if(form.ADDR2.value.length	< 1)
			str	+= "주소를 입력하세요\n";	

	//	if(str	== "")
		{
			return	true;
		}
		
		alert(str);

		return	false;		
	}
	
//]]>
</script>

<body onkeyup="Init(); Jumin_toaddr_Check()">
<table width="780" border="0" cellpadding="0" cellspacing="0">
<form name="form" method="post">
<input type="hidden" name="ADMIN_NO" value="${board.ADMIN_NO}">

	<tr>
		<td align="left" class="contborder_purple">
		<table width="100%" border="0" cellspacing="0" cellpadding="0">
			<tr>
			  	<td><table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
				 
					<tr>
						<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">법인명(단체명)</td>
						<td width="37%" bgcolor="eaeaea" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
							<tr>
							  <td><input name="POST" type="text" class="essential" style="width:120px" onFocus="Jumin_toaddr_Check();" value="${board.POST}" readonly></td>
							  <td><a href="javascript:openZipcodePopup('form.POST', 'form.ADDR1');"><img src="/img/search_icon.gif" alt="검색" width="56" height="18" border="0"></a></td>
							</tr>
						</table></td>
						<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">등록번호</td>
						<td bgcolor="eaeaea" class="table_bl_left"><input name="jumin_bizssn1" type="text" class="input_form1" value="${jumin_bizssn1}" style="width:20px; ime-mode:disabled" onKeyPress="nr_num_int(this);" onKeyUp="count_check(this, jumin_bizssn2, 3);" maxlength="3">
						  - <input name="jumin_bizssn2" type="text" class="input_form1" value="${jumin_bizssn2}" style="width:15px; ime-mode:disabled" onKeyPress="nr_num_int(this);" onKeyUp="count_check(this, jumin_bizssn3, 2);" maxlength="2">
						  - <input name="jumin_bizssn3" type="text" class="input_form1" value="${jumin_bizssn3}" style="width:35px; ime-mode:disabled" onKeyPress="nr_num_int(this);" maxlength="5">
				  	</tr>
				  
				  	<tr>
						<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">대표자명</td>
						<td bgcolor="eaeaea" class="table_bl_left"><input name="POST" type="text" class="essential" style="width:120px" onFocus="Jumin_toaddr_Check();" value="${board.POST}"></td>				
						<td  height="26" align="center" bgcolor="e5eff8" class="sub_table_b">법인번호</td>
						<td bgcolor="eaeaea" class="table_bl_left"><input name="jumin_ssn1" type="text" class="essential" style="width:40px; ime-mode:disabled" value="${jumin_ssn1}" onKeyPress="nr_num_int(this);" onKeyUp="count_check(this, jumin_ssn2, 6);" maxlength="6">
						  - <input name="jumin_ssn2" type="text" class="essential" style="width:45px; ime-mode:disabled" value="${jumin_ssn2}" onKeyPress="nr_num_int(this);" maxlength="7"></td>
				  	</tr>
					
					<tr>
						<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">본점 주소</td>
						<td colspan="3" bgcolor="eaeaea" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
							<tr>
								<td><input name="POST" type="text" class="essential" style="width:50px" onFocus="Jumin_toaddr_Check();" value="${board.POST}" readonly></td>
								<td><a href="javascript:openZipcodePopup('form.POST', 'form.ADDR1');"><img src="/img/search_icon.gif" alt="검색" width="56" height="18" border="0"></a></td>
								<td bgcolor="eaeaea" class="table_bl_left"><input name="ADDR1" type="text" class="essential" style="width:250px" onFocus="Jumin_toaddr_Check();" value="${board.ADDR1}" readonly>
								<input name="ADDR2" type="text" class="essential" style="width:250px" value="${board.ADDR2}"></td>  
							</tr>
						</table></td>
					</tr>
					
					<tr>
						<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">지점명 주소</td>
						<td colspan="3" bgcolor="eaeaea" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
							<tr>
								<td><input name="POST" type="text" class="essential" style="width:50px" onFocus="Jumin_toaddr_Check();" value="${board.POST}" readonly></td>
								<td><a href="javascript:openZipcodePopup('form.POST', 'form.ADDR1');"><img src="/img/search_icon.gif" alt="검색" width="56" height="18" border="0"></a></td>
								<td bgcolor="eaeaea" class="table_bl_left"><input name="ADDR1" type="text" class="essential" style="width:250px" onFocus="Jumin_toaddr_Check();" value="${board.ADDR1}" readonly>
								<input name="ADDR2" type="text" class="essential" style="width:250px" value="${board.ADDR2}"></td>  
							</tr>
						</table></td>
					</tr>
					
				  	<tr>
						<td align="center" bgcolor="e5eff8" class="sub_table_b">업태</td>
						<td bgcolor="eaeaea" class="table_bl_left"><input name="BIZ_STATUS" type="text" class="input_form1" style="width:120px" value="${board.BIZ_STATUS}"></td>
						<td align="center" bgcolor="e5eff8" class="sub_table_b">종목</td>
						<td bgcolor="eaeaea" class="table_bl_left"><input name="BIZ_STATUS" type="text" class="input_form1" style="width:120px" value="${board.BIZ_STATUS}"></td>				
				  	</tr>				
					
				  	<tr>
						<td height="34" colspan="4" align="left" bgcolor="#FFFFFF" class=""><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
							<tr>
							 	<td><span class="sub_stan_blue">* 우편물 송달지</span> : </td>
							  	<td width="16"><input name="checkbox" type="checkbox" value="false" onclick="javascript:Jumin_toaddr_Check()"></td>
							  	<td>사업장 소재지와 동일</td>
							</tr>
						</table></td>
				  	</tr>
					
					<tr>
						<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">송달지 주소</td>
						<td colspan="3" bgcolor="eaeaea" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
							<tr>
								<td><input name="POST" type="text" class="essential" style="width:50px" onFocus="Jumin_toaddr_Check();" value="${board.POST}" readonly></td>
								<td><a href="javascript:openZipcodePopup('form.POST', 'form.ADDR1');"><img src="/img/search_icon.gif" alt="검색" width="56" height="18" border="0"></a></td>
								<td bgcolor="eaeaea" class="table_bl_left"><input name="ADDR1" type="text" class="essential" style="width:250px" onFocus="Jumin_toaddr_Check();" value="${board.ADDR1}" readonly>
								<input name="ADDR2" type="text" class="essential" style="width:250px" value="${board.ADDR2}"></td>  
							</tr>
						</table></td>
					</tr>
					
					<tr>
						<td height="34" colspan="4" align="left" bgcolor="#FFFFFF" class=""><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
							<tr>
							  	<td><span class="sub_stan_blue">* 담당자 정보</span></td>
							</tr>
						</table></td>
					</tr>
					
					<tr>
						<td align="center" bgcolor="e5eff8" class="sub_table_b">지점명/담당자명</td>
						<td bgcolor="eaeaea" class="table_bl_left"><input name="BIZ_STATUS" type="text" class="input_form1" style="width:100px" value="${board.BIZ_STATUS}">
							/ <input name="BIZ_TYPES" type="text" class="input_form1" style="width:130px" value="${board.BIZ_TYPES}"></td>
						<td align="center" bgcolor="e5eff8" class="sub_table_b">휴대전화</td>
						<td bgcolor="eaeaea" class="table_bl_left">
							<input name="min_agent_tel1" type="text" class="input_form1" style="width:25px" style="ime-mode:disabled" onKeyPress="nr_num_int(this);" onKeyUp="count_check(this, min_agent_tel2, 3);" maxlength="3"> - 
							<input name="min_agent_tel2" type="text" class="input_form1" style="width:30px" style="ime-mode:disabled" onKeyPress="nr_num_int(this);" onKeyUp="count_check(this, min_agent_tel3, 4);" maxlength="4"> - 
							<input name="min_agent_tel3" type="text" class="input_form1" style="width:30px" style="ime-mode:disabled" onKeyPress="nr_num_int(this);" onKeyUp="count_check(this, min_agent_tel3, 4);" maxlength="4">
							&nbsp;&nbsp;(&nbsp;내선&nbsp;<input name="min_agent_tel3" type="text" class="input_form1" style="width:30px" style="ime-mode:disabled" onKeyPress="nr_num_int(this);" onKeyUp="count_check(this, min_agent_tel3, 4);" maxlength="4">&nbsp;)
						</td>
					</tr>
					
					<tr>
						<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">FAX</td>
						<td bgcolor="eaeaea" class="table_bl_left">
							<input name="min_agent_tel1" type="text" class="input_form1" style="width:25px" style="ime-mode:disabled" onKeyPress="nr_num_int(this);" onKeyUp="count_check(this, min_agent_tel2, 3);" maxlength="3"> - 
							<input name="min_agent_tel2" type="text" class="input_form1" style="width:30px" style="ime-mode:disabled" onKeyPress="nr_num_int(this);" onKeyUp="count_check(this, min_agent_tel3, 4);" maxlength="4"> - 
							<input name="min_agent_tel3" type="text" class="input_form1" style="width:30px" style="ime-mode:disabled" onKeyPress="nr_num_int(this);" onKeyUp="count_check(this, min_agent_tel3, 4);" maxlength="4">
						</td>
						<td align="center" bgcolor="e5eff8" class="sub_table_b">휴대전화</td>
						<td bgcolor="eaeaea" class="table_bl_left">
							<input name="min_agent_tel1" type="text" class="input_form1" style="width:25px" style="ime-mode:disabled" onKeyPress="nr_num_int(this);" onKeyUp="count_check(this, min_agent_tel2, 3);" maxlength="3"> - 
							<input name="min_agent_tel2" type="text" class="input_form1" style="width:30px" style="ime-mode:disabled" onKeyPress="nr_num_int(this);" onKeyUp="count_check(this, min_agent_tel3, 4);" maxlength="4"> - 
							<input name="min_agent_tel3" type="text" class="input_form1" style="width:30px" style="ime-mode:disabled" onKeyPress="nr_num_int(this);" onKeyUp="count_check(this, min_agent_tel3, 4);" maxlength="4">
						</td>
					</tr>
					
			  </table></td>
			</tr>
			
			<tr>
			  	<td height="40" align="right">
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