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

<script language="javascript" src="/js/PopupCalendar.js"></script>
<script language='JavaScript' src='/js/Check_inputbox.js'></script>
<script type="text/javascript">
//<![CDATA[

	function 	InitPage()
	{
		parent.TabUp_Img("jumin");
		
		if(document.getElementById("mode").value == "edit" )
		{
			document.getElementById("view").style.display = "none";
			document.getElementById("edit").style.display= "block";			
		}else
		{
			document.getElementById("edit").style.display = "none";
			document.getElementById("view").style.display = "block";
		}
	}
	
	function goModify()
	{
		var admin_no = document.getElementById("ADMIN_NO").value;
		location.href = "/jumyong/jumyong/jumin.do?ADMIN_NO="+admin_no
		+"&mode=edit";
	}
	
	
	function submitClick()
	{
		var minwonForm = document.form;
		minwonForm.submit();
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
	
	function	Jumin_toaddr_Check()
	{
		var form 	= document.form;
		var	chk		= form.checkbox.checked;

		if(chk	== true)
		{
			form.TOPOST_NM.value	= form.NAME.value;
			form.TOPOST.value		= form.POST.value;
			form.TOADDR1.value		= form.ADDR1.value;
			form.TOADDR2.value		= form.ADDR2.value;
			form.TOEMAIL.value		= form.EMAIL.value;

			form.TOTEL.value	= form.TEL.value;
			
			form.TOHP.value	= form.HP.value;
		}

	//	form.checkbox.checked	= false;
	}
	
//]]>
</script>

<body onload="InitPage();">
<form name="form" id="form" method="post" action = "/jumyong/jumyong/jumin.do" >
<spring:bind path="appeal.ADMIN_NO">
	<input type="hidden" name="ADMIN_NO" value="${ADMIN_NO}">
</spring:bind>

<input name="mode"  id = "mode" value="${mode}" type="hidden" >
<div id="view" >
<table width="780" border="0" cellpadding="0" cellspacing="0">
	<tr>
		<td align="left" class="contborder_purple">
		<table width="100%" border="0" cellspacing="0" cellpadding="0">
			<tr>
			  <td><table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
				  <tr>
					<td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">점용인/법인명</td>
					<td width="37%" bgcolor="eaeaea" class="table_bl_left">${appeal.NAME}</td>
					<td width="100" align="center" bgcolor="e5eff8" class="sub_table_b">주민/법인번호</td>
					<td bgcolor="eaeaea" class="table_bl_left">${appeal.SSN}</td>
				  </tr>
				  <tr>
					<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">사업자등록번호</td>
					<td bgcolor="eaeaea" class="table_bl_left">${appeal.BIZSSN}</td>
					<td align="center" bgcolor="e5eff8" class="sub_table_b">업태/업종</td>
					<td bgcolor="eaeaea" class="table_bl_left">${appeal.BIZ_STATUS} ${appeal.BIZ_TYPES}</td>
				  </tr>
				  <tr>
					<td height="30" align="center" bgcolor="e5eff8" class="sub_table_b">우편번호</td>
					<td bgcolor="eaeaea" class="table_bl_left">${appeal.POST}</td>
					<td align="center" bgcolor="e5eff8" class="sub_table_b">주소</td>
					<td bgcolor="eaeaea" class="table_bl_left">
					<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
						<tr><td>${appeal.ADDR1}</td></tr>
						<tr><td>${appeal.ADDR2}<td></tr>
					</table>
					</td>
				  </tr>
				  <tr>
					<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">e-mail</td>
					<td bgcolor="eaeaea" class="table_bl_left">${appeal.EMAIL}</td>
					<td align="center" bgcolor="e5eff8" class="sub_table_b">도로명 주소 </td>
					<td bgcolor="eaeaea" class="table_bl_left"></td>
				  </tr>
				  <tr>
					<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">전화번호</td>
					<td bgcolor="eaeaea" class="table_bl_left">${appeal.TEL}</td>
					<td align="center" bgcolor="e5eff8" class="sub_table_b">휴대전화</td>
					<td bgcolor="eaeaea" class="table_bl_left">${appeal.HP}</td>
				  </tr>
				  <tr>
					<td height="34" colspan="4" align="left" bgcolor="#FFFFFF" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
						<tr>
						  <td><span class="sub_stan_blue">* 우편물 송달지</span></td>
						</tr>
					</table></td>
				  </tr>
				  <tr>
					<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">우편물 수령인 </td>
					<td colspan="3" bgcolor="eaeaea" class="table_bl_left">${appeal.TOPOST_NM}</td>
				  </tr>
				  <tr>
					<td height="30" align="center" bgcolor="e5eff8" class="sub_table_b">우편번호</td>
					<td bgcolor="eaeaea" class="table_bl_left">${appeal.TOPOST}</td>
					<td align="center" bgcolor="e5eff8" class="sub_table_b">송달지 주소</td>
					<td bgcolor="eaeaea" class="table_bl_left">
					<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
						<tr><td>${appeal.TOADDR1}</td></tr>
						<tr><td>${appeal.TOADDR2}<td></tr>
					</table>
					</td>
				  </tr>
				  <tr>
					<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">e-mail</td>
					<td bgcolor="eaeaea" class="table_bl_left">${appeal.TOEMAIL}</td>
					<td align="center" bgcolor="e5eff8" class="sub_table_b">도로명 주소 </td>
					<td bgcolor="eaeaea" class="table_bl_left"></td>
				  </tr>
				  <tr>
					<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">전화번호</td>
					<td bgcolor="eaeaea" class="table_bl_left">${appeal.TOTEL}</td>
					<td align="center" bgcolor="e5eff8" class="sub_table_b">휴대전화</td>
					<td bgcolor="eaeaea" class="table_bl_left">${appeal.TOHP}</td>
				  </tr>
			  </table></td>
			</tr>
			
			<tr>
				<td height="40" align="right">
				<table width="0" border="0" cellspacing="0" cellpadding="0" align="right">
			  		<td height="40" align="right">
					<img src="/img/mod_icon.gif" alt="수정" border="0" onclick="javascript:goModify()" style="cursor:pointer" >
			  	</table>
			  	</td>
			</tr>
					
		</table></td>
	</tr>

</table>
</div>
<div id="edit" style="width:100%;display:none;">
<table width="780" border="0" cellpadding="0" cellspacing="0">
	  <tr>
		<td align="left" class="contborder_blue">
		<table width="100%" border="0" cellspacing="0" cellpadding="0">
			<tr>
			  <td>
				<table width="100%" border="0" cellspacing="0" cellpadding="0">
                <tr>
                  <td><table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
				  <tr>
					<td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">점용인/법인명</td>
					<td width="37%" bgcolor="eaeaea" class="table_bl_left">
					<spring:bind path="appeal.NAME">
						<input name="NAME" type="text" class="essential" style="width:200px" onKeyUp="Jumin_toaddr_Check();" value="${appeal.NAME}">
					</spring:bind>
					</td>
					<td width="100" align="center" bgcolor="e5eff8" class="sub_table_b">주민/법인번호</td>
					<td width="36%" bgcolor="eaeaea" class="table_bl_left">
					<spring:bind path="appeal.SSN">					
						<input name="SSN" type="text" class="essential" style="width:120px" style="ime-mode:disabled" onKeyPress="nr_num_int(this);" maxlength="14" value="${appeal.SSN}">
					</spring:bind>
					</td>
				  </tr>
				  <tr>
					<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">사업자등록번호</td>
					<td bgcolor="eaeaea" class="table_bl_left">
					
					<spring:bind path="appeal.BIZSSN">					
						<input name="BIZSSN" type="text" class="input_form1" style="width:120px" style="ime-mode:disabled" onKeyPress="nr_num_int(this);"  maxlength="12" value="${appeal.BIZSSN}">
					</spring:bind>  

					  
					  
					  </td>
					<td align="center" bgcolor="e5eff8" class="sub_table_b">업태/업종</td>
					<td bgcolor="eaeaea" class="table_bl_left">
					<spring:bind path="appeal.BIZ_STATUS">					
						<input name="BIZ_STATUS" type="text" class="input_form1" style="width:60px" value="${appeal.BIZ_STATUS}">
					</spring:bind>						
						  
						  / 
					<spring:bind path="appeal.BIZ_TYPES">						  
						<input name="BIZ_TYPES" type="text" class="input_form1" style="width:160px" value="${appeal.BIZ_TYPES}">
					</spring:bind>						
					</td>
				  </tr>
				  <tr>
					<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">우편번호</td>
					<td bgcolor="eaeaea" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
						<tr>
						  <td>
							<spring:bind path="appeal.POST">
								<input name="POST" type="text" class="essential" style="width:50px" onFocus="Jumin_toaddr_Check();" readonly value="${appeal.POST}">
							</spring:bind>
						  
						  </td>
						  <td><a href="javascript:openZipcodePopup('form.POST', 'form.ADDR1');"><img src="/img/search_icon.gif" alt="검색" width="56" height="18" border="0"></a></td>
						</tr>
					</table></td>
					<td align="center" bgcolor="e5eff8" class="sub_table_b">주소</td>
					<td bgcolor="eaeaea" class="table_bl_left">
					<spring:bind path="appeal.ADDR1">
						<input name="ADDR1" type="text" class="essential" style="width:250px" onFocus="Jumin_toaddr_Check();" readonly value="${appeal.ADDR1}">
					</spring:bind>
					<spring:bind path="appeal.ADDR2">
						<input name="ADDR2" type="text" class="essential" style="width:250px" onKeyUp="Jumin_toaddr_Check();" value="${appeal.ADDR2}">
					</spring:bind>
					</td>
				  </tr>
				  <tr>
					<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">e-mail</td>
					<td bgcolor="eaeaea" class="table_bl_left">
					<spring:bind path="appeal.EMAIL">					
						<input name="EMAIL" type="text" class="input_form1" style="width:250px" style="ime-mode:disabled" onKeyUp="Jumin_toaddr_Check();" value="${appeal.EMAIL}">
					</spring:bind>
					</td>
					<td align="center" bgcolor="e5eff8" class="sub_table_b">도로명 주소 </td>
					<td bgcolor="eaeaea" class="table_bl_left"><input name="textfield2222723" type="text" class="input_form1" style="width:100px" onKeyUp="Jumin_toaddr_Check();">
						<input name="textfield22227222" type="text" class="input_form1" style="width:40px" style="ime-mode:disabled" onKeyDown="nr_num_int(this);" onKeyUp="nr_num_int(this); Jumin_toaddr_Check();" onKeyPress="nr_num_int(this);">
					  - <input name="textfield222272222" type="text" class="input_form1" style="width:40px" style="ime-mode:disabled" onKeyDown="nr_num_int(this);" onKeyUp="nr_num_int(this); Jumin_toaddr_Check();" onKeyPress="nr_num_int(this);"></td>
				  </tr>
				  <tr>
					<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">전화번호</td>
					<td bgcolor="eaeaea" class="table_bl_left">
					<spring:bind path="appeal.TEL">
						<input name="TEL" type="text" class="input_form1" style="width:120px" style="ime-mode:disabled" onKeyPress="nr_num_int(this);" onKeyUp="Jumin_toaddr_Check();" maxlength="13" value="${appeal.TEL}">
					</spring:bind>
					</td>
					<td align="center" bgcolor="e5eff8" class="sub_table_b">휴대전화</td>
					<td bgcolor="eaeaea" class="table_bl_left">
					<spring:bind path="appeal.HP">
						<input name="HP" type="text" class="input_form1" style="width:120px" style="ime-mode:disabled" onKeyPress="nr_num_int(this);"  maxlength="13" value="${appeal.HP}">
					</spring:bind>
					</td>				  
				  </tr>
				  <tr>
					<td height="34" colspan="4" align="left" bgcolor="#FFFFFF" class=""><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
						<tr>
						  <td><span class="sub_stan_blue">* 우편물 송달지</span> : </td>
						  <td width="16"><input name="checkbox" type="checkbox" value="false" onclick="javascript:Jumin_toaddr_Check()"></td>
						  <td width="110">점용인 정보와 동일 </td>
						</tr>
					</table></td>
				  </tr>
				  <tr>
					<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">우편물 수령인 </td>
					<td colspan="3" bgcolor="eaeaea" class="table_bl_left">
					<spring:bind path="appeal.TOPOST_NM">
						<input name="TOPOST_NM" type="text" class="input_form1" style="width:120px" value="${appeal.TOPOST_NM}">
					</spring:bind>						
					</td>
				  </tr>
				  <tr>
					<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">우편번호</td>
					<td bgcolor="eaeaea" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
						<tr>
						  <td>
						<spring:bind path="appeal.TOPOST">
						  	<input name="TOPOST" type="text" class="input_form1" style="width:50px" readonly value="${appeal.TOPOST}">
						</spring:bind>
						  </td>
						  <td><a href="javascript:openZipcodePopup('form.TOPOST', 'form.TOADDR1');"><img src="/img/search_icon.gif" alt="검색" width="56" height="18" border="0"></a></td>
						</tr>
					</table></td>
					<td align="center" bgcolor="e5eff8" class="sub_table_b">송달지 주소</td>
					<td bgcolor="eaeaea" class="table_bl_left">
					<spring:bind path="appeal.TOADDR1">
						<input name="TOADDR1" type="text" class="input_form1" style="width:250px" readonly value="${appeal.TOADDR1}">
					</spring:bind>
					<spring:bind path="appeal.TOADDR2">					
						<input name="TOADDR2" type="text" class="input_form1" style="width:250px" value="${appeal.TOADDR2}">
					</spring:bind>
					</td>
				  </tr>
				  <tr>
					<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">e-mail</td>
					<td bgcolor="eaeaea" class="table_bl_left">
						<input name="TOEMAIL" type="text" class="input_form1" style="width:250px" style="ime-mode:disabled" value="${appeal.TOEMAIL}">
					</td>
					<td align="center" bgcolor="e5eff8" class="sub_table_b">도로명 주소 </td>
					<td bgcolor="eaeaea" class="table_bl_left"><input name="textfield22227232" type="text" class="input_form1" style="width:100px" value="">
						<input name="textfield222272224" type="text" class="input_form1" style="width:40px" value="" style="ime-mode:disabled" onKeyDown="nr_num_int(this);" onKeyUp="nr_num_int(this);" onKeyPress="nr_num_int(this);">
					   - <input name="textfield2222722223" type="text" class="input_form1" style="width:40px" value="" style="ime-mode:disabled" onKeyDown="nr_num_int(this);" onKeyUp="nr_num_int(this);" onKeyPress="nr_num_int(this);"></td>
				  </tr>
				  <tr>
					<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">전화번호</td>
					<td bgcolor="eaeaea" class="table_bl_left">
					<spring:bind path="appeal.TOTEL">
						<input name="TOTEL" type="text" class="input_form1" style="width:120px" style="ime-mode:disabled" onKeyPress="nr_num_int(this);" maxlength="13" value="${appeal.TOTEL}">
					</spring:bind>
					</td>
					<td align="center" bgcolor="e5eff8" class="sub_table_b">휴대전화</td>
					<td bgcolor="eaeaea" class="table_bl_left">
					<spring:bind path="appeal.TOHP">
						<input name="TOHP" type="text" class="input_form1" style="width:120px" style="ime-mode:disabled" onKeyPress="nr_num_int(this);" maxlength="13" value="${appeal.TOHP}">
					</spring:bind>						
					</td>
				  </tr>
                  </table></td>
                </tr>
			
			<tr>
				<td height="30" align="right">
				<table width="0" border="0" cellspacing="0" cellpadding="0" align="right">
			  		<td height="30" align="right">
			  		
					<img src="/img/can_icon.gif" alt="취소" border="0" onclick="javascript:history.back();" style="cursor:pointer" >
					<img src="/img/save_icon2.gif" alt="저장" width="56" height="18" border="0"
						                onClick="javascript:submitClick();"  style="cursor:pointer">

			  	</table>
			  	</td>
			</tr>
					
		</table></td>
	</tr>

</table>
</td>
</tr>
</table>
</div>
</form>



</body>
</html>