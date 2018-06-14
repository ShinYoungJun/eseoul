<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
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
	background-image: url/img/left_back.gif);
}
-->

</style>
<link href="/css/roads.css" rel="stylesheet" type="text/css">
</head>

<script language="javascript" src="/js/PopupCalendar.js"></script>
<script language='JavaScript' src='/js/Check_inputbox.js'></script>
<script language='JavaScript' src='/jsp/jumyong/minwon/tab/info_register.js'></script>

<script type="text/javascript">
//<![CDATA[
	
//]]>
</script>


<body>
<table width="800" border="0" cellpadding="0" cellspacing="0">
<form name="form" method="post">
<input type="hidden" name="UserType">
<input type="hidden" name="UserSection">
<input type="hidden" name="PURPOSE_CD" value="${PURPOSE_CD}">
<input type="hidden" name="MIN_CHECK" value="${MIN_CHECK}">
<input type="hidden" name="MIN_PROCESS" value="${MIN_PROCESS}">
<input type="hidden" name="GIGAN1" value="${GIGAN1}">
<input type="hidden" name="GIGAN2" value="${GIGAN2}">
<input type="hidden" name="MIN_NAME" value="${MIN_NAME}">
<input type="hidden" name="MIN_REQNO" value="${MIN_REQNO}">
<input type="hidden" name="NOWTAB" value="0">

<tr>
	<td align="left">
		<table width="780" border="0" cellspacing="0" cellpadding="0">
   		<tr>
         		<td height="22" background="/img/tab_line_purple.gif"><table border="0" cellspacing="0" cellpadding="0">
				<tr>
				<ul id="tabmenu">
					<td width="111"><a><img src="/img/sub_petition_title9_on.gif" alt="민원정보" width="110" height="22" border="0" onclick="Init();" style="CURSOR: Hand;"></a></td>
					<td width="111"><a><img src="/img/sub_petition_title2_off.gif" alt="점용인 정보" width="110" height="22" border="0" onclick="Init(); " style="CURSOR: Hand;"></a></td>
					<td width="111"><a><img src="/img/sub_petition_title3_off.gif" alt="점용지 정보" width="110" height="22" border="0" onclick="Init();" style="CURSOR: Hand;"></a></td>
				</ul>
               </tr>
			</table></td>
		</tr>
		
		<tr>
            <td align="left" class="contborder_purple">
	
		<div id="tabcontents">
		
			<div class="tabcontent" id="tab1">
				<table width="100%" border="0" cellspacing="0" cellpadding="0">
				
                <tr>
					<td><table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
				  	<tr>
						<td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">접수번호</td>
						<td width="37%" bgcolor="eaeaea" class="table_bl_left">
							<input name="REQ_NO_MIN" type="text" class="input_form1" style="width:120px" maxlength="20" readonly>
						</td>
						<td width="100" align="center" bgcolor="e5eff8" class="sub_table_b">민원구분</td>
						<td bgcolor="eaeaea" class="table_bl_left">
							<input name="GUBUN_MIN" type="text" class="input_form1" style="width:120px" maxlength="50">
						</td>
				  	</tr>
				  	<tr>
						<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">접수일자</td>
						<td bgcolor="eaeaea" class="table_bl_left">
							<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
							  	<tr>
									<td><input name="REQ_DATE_MIN" type="text" class="input_form1" style="width:120px" value="${REQ_DATE_MIN}" readonly></td>
									<td><a><img src="/img/calendar_icon.gif" width="19" height="16" border="0" onclick="popUpCalendar(this, REQ_DATE_MIN, 'yyyymmdd')" style="CURSOR: Hand;"></a></td>
							  	</tr>
							</table>
						</td>
						<td align="center" bgcolor="e5eff8" class="sub_table_b">처리예정일자</td>
						<td bgcolor="eaeaea" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
					  	<tr>
							<td><input name="PREDATE_MIN" type="text" class="input_form1" style="width:120px" readonly></td>
							<td><a><img src="/img/calendar_icon.gif" width="19" height="16" border="0" onclick="popUpCalendar(this, PREDATE_MIN, 'yyyymmdd')" style="CURSOR: Hand;"></a></td>
					  	</tr>
						</table></td>
				  	</tr>
				  
				  	<tr>
						<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">접수부서</td>
						<td bgcolor="eaeaea" class="table_bl_left">
							<input name="REQ_DEP_MIN" type="text" class="input_form1" style="width:120px" value="${REQ_DEP_MIN}" maxlength="10">
						</td>
						<td align="center" bgcolor="e5eff8" class="sub_table_b">담당부서</td>
						<td bgcolor="eaeaea" class="table_bl_left">
							<input name="MANAGE_DEP_MIN" type="text" class="input_form1" style="width:120px" value="${MANAGE_DEP_MIN}" maxlength="10">
						</td>
				  	</tr>
				  
					<tr>
						<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">접수자명</td>
						<td bgcolor="eaeaea" class="table_bl_left">
							<input name="REQ_NM_MIN" type="text" class="input_form1" style="width:120px" maxlength="10">
						</td>
						<td align="center" bgcolor="e5eff8" class="sub_table_b">담당자명</td>
						<td bgcolor="eaeaea" class="table_bl_left">
							<input name="MANAGER_MIN" type="text" class="input_form1" style="width:120px" value="${MANAGER_MIN}" maxlength="10">
						</td>
					</tr>
					
					<tr>
						<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">민원요지</td>
						<td colspan="3" bgcolor="eaeaea" class="table_bl_left"><table width="100%" border="0" cellpadding="0" cellspacing="0" class="sub_stan">
							<input name="NOTES_MIN" type="text" class="input_form1" style="width:98%" maxlength="100">
						</table></td>
					</tr>
					
					<tr>
						<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">대리인</td>
						<td bgcolor="eaeaea" class="table_bl_left"><input name="AGENT_NM_MIN" type="text" class="input_form1" style="width:120px"></td>
						<td align="center" bgcolor="e5eff8" class="sub_table_b">대리인 연락처</td>
						<td bgcolor="eaeaea" class="table_bl_left">
							<input name="min_agent_tel1" type="text" class="input_form1" style="width:25px" style="ime-mode:disabled" onKeyPress="nr_num_int(this);" onKeyUp="count_check(this, min_agent_tel2, 3);" maxlength="3"> - 
							<input name="min_agent_tel2" type="text" class="input_form1" style="width:30px" style="ime-mode:disabled" onKeyPress="nr_num_int(this);" onKeyUp="count_check(this, min_agent_tel3, 4);" maxlength="4"> - 
							<input name="min_agent_tel3" type="text" class="input_form1" style="width:30px" style="ime-mode:disabled" onKeyPress="nr_num_int(this);" onKeyUp="count_check(this, min_agent_tel3, 4);" maxlength="4">
						</td>
					</tr>
				  
					<tr>
						<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">민원인명</td>
						<td bgcolor="eaeaea" class="table_bl_left"><input name="NAME_MIN" type="text" class="input_form1" style="width:120px" value="${NAME_MIN}"></td>
						<td align="center" bgcolor="e5eff8" class="sub_table_b">민원인 주민번호</td>
						<td bgcolor="eaeaea" class="table_bl_left">
							<input name="min_ssn1" type="text" class="input_form1" style="width:40px; ime-mode:disabled" value="${min_ssn1}" onKeyPress="nr_num_int(this);" onKeyUp="nr_num_int(this); count_check(this, min_ssn2, 6);" maxlength="6">
							 - <input name="min_ssn2" type="text" class="input_form1" style="width:45px; ime-mode:disabled" value="${min_ssn2}" onKeyPress="nr_num_int(this);" onKeyUp="nr_num_int(this);" maxlength="7"></td>
					</tr>
				  
				 	<tr>
						<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">민원인 우편번호</td>
						<td bgcolor="eaeaea" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
							<tr>
							  	<td><input name="POST_MIN" type="text" class="input_form1" style="width:50px" value="${POST_MIN}" readonly></td>
							  	<td><img src="/img/search_icon.gif" alt="검색" width="56" height="18" border="0" onclick="javascript:openZipcodePopup('form.POST_MIN', 'form.ADDR1_MIN');" style="CURSOR:Hand"></td>
							</tr>
						</table></td>
						<td align="center" bgcolor="e5eff8" class="sub_table_b">민원인 주소</td>
						<td bgcolor="eaeaea" class="table_bl_left">
							<input name="ADDR1_MIN" type="text" class="input_form1" style="width:250px" value="${ADDR1_MIN}" readonly>
							<input name="ADDR2_MIN" type="text" class="input_form1" style="width:250px" value="${ADDR2_MIN}" maxlength="50"></td>
				  	</tr>
				  
				  	<tr>
						<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">민원인 전화</td>
						<td bgcolor="eaeaea" class="table_bl_left">
							<input name="min_tel1" type="text" class="input_form1" style="width:25px" style="ime-mode:disabled" onKeyPress="nr_num_int(this);" onKeyUp="count_check(this, min_tel2, 3);" maxlength="3"> - 
							<input name="min_tel2" type="text" class="input_form1" style="width:30px" style="ime-mode:disabled" onKeyPress="nr_num_int(this);" onKeyUp="count_check(this, min_tel3, 4);" maxlength="4"> - 
							<input name="min_tel3" type="text" class="input_form1" style="width:30px" style="ime-mode:disabled" onKeyPress="nr_num_int(this);" onKeyUp="count_check(this, min_tel3, 4);" maxlength="4">
						</td>
						<td align="center" bgcolor="e5eff8" class="sub_table_b">민원인 휴대폰</td>
						<td bgcolor="eaeaea" class="table_bl_left">
							<input name="min_hp1" type="text" class="input_form1" style="width:25px" style="ime-mode:disabled" onKeyPress="nr_num_int(this);" onKeyUp="count_check(this, min_hp2, 3);" maxlength="3"> - 
							<input name="min_hp2" type="text" class="input_form1" style="width:30px" style="ime-mode:disabled" onKeyPress="nr_num_int(this);" onKeyUp="count_check(this, min_hp3, 4);" maxlength="4"> - 
							<input name="min_hp3" type="text" class="input_form1" style="width:30px" style="ime-mode:disabled" onKeyPress="nr_num_int(this);" onKeyUp="count_check(this, min_hp3, 4);" maxlength="4">
						</td>
				  	</tr>
				  
                  	</table></td>
                </tr>

				</table>
			</div>
		
			<div class="tabcontent" style="display:none" id="tab2">
				<table width="100%" border="0" cellspacing="0" cellpadding="0">
				
                <tr>
                  	<td>
                  	<table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
				  	<tr>
						<td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">점용인/법인명</td>
						<td width="37%" bgcolor="eaeaea" class="table_bl_left">
							<input name="NAME" type="text" class="essential" style="width:250px" value="${NAME}" maxlength="20">
						</td>
						<td width="100" align="center" bgcolor="e5eff8" class="sub_table_b">주민/법인번호</td>
						<td bgcolor="eaeaea" class="table_bl_left">
							<input name="jumin_ssn1" type="text" class="essential" style="width:40px; ime-mode:disabled" value="${jumin_ssn1}" onKeyPress="nr_num_int(this);" onKeyUp="nr_num_int(this); count_check(this, jumin_ssn2, 6);" maxlength="6">
						  - <input name="jumin_ssn2" type="text" class="essential" style="width:45px; ime-mode:disabled" value="${jumin_ssn2}" onKeyPress="nr_num_int(this);" onKeyUp="nr_num_int(this);" maxlength="7">
						</td>
					</tr>
				  	<tr>
						<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">사업자등록번호</td>
						<td bgcolor="eaeaea" class="table_bl_left">
							<input name="jumin_bizssn1" type="text" class="input_form1" value="${jumin_bizssn1}" style="width:20px; ime-mode:disabled" onKeyPress="nr_num_int(this);" onKeyUp="count_check(this, jumin_bizssn2, 3);" maxlength="3">
						  - <input name="jumin_bizssn2" type="text" class="input_form1" value="${jumin_bizssn2}" style="width:15px; ime-mode:disabled" onKeyPress="nr_num_int(this);" onKeyUp="count_check(this, jumin_bizssn3, 2);" maxlength="2">
						  - <input name="jumin_bizssn3" type="text" class="input_form1" value="${jumin_bizssn3}" style="width:35px; ime-mode:disabled" onKeyPress="nr_num_int(this);" onKeyUp="nr_num_int(this);" maxlength="5"></td>
						<td align="center" bgcolor="e5eff8" class="sub_table_b">업태/업종</td>
						<td bgcolor="eaeaea" class="table_bl_left">
							<input name="BIZ_STATUS" type="text" class="input_form1" style="width:60px" value="${BIZ_STATUS}" maxlength="50">
						  / <input name="BIZ_TYPES" type="text" class="input_form1" style="width:160px" value="${BIZ_TYPES}" maxlength="50">
						</td>
				  	</tr>
				  	<tr>
						<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">우편번호</td>
						<td bgcolor="eaeaea" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
							<tr>
							  <td><input name="POST" type="text" class="essential" style="width:50px" onclick="Jumin_toaddr_Check2();" onchange="Jumin_toaddr_Check2();" onFocus="Jumin_toaddr_Check2();" onkeyup="Jumin_toaddr_Check2();" value="${POST}" readonly></td>
							  <td><a href="javascript:openZipcodePopup('form.POST', 'form.ADDR1');"><img src="/img/search_icon.gif" alt="검색" width="56" height="18" border="0"></a></td>
							</tr>
						</table></td>
						<td align="center" bgcolor="e5eff8" class="sub_table_b">주소</td>
						<td bgcolor="eaeaea" class="table_bl_left">
							<input name="ADDR1" type="text" class="essential" style="width:250px" onclick="Jumin_toaddr_Check2();" onchange="Jumin_toaddr_Check2();" onFocus="Jumin_toaddr_Check2();" onkeyup="Jumin_toaddr_Check2();" value="${ADDR1}" readonly>
							<input name="ADDR2" type="text" class="essential" style="width:250px" onclick="Jumin_toaddr_Check2();" onchange="Jumin_toaddr_Check2();" onFocus="Jumin_toaddr_Check2();" onkeyup="Jumin_toaddr_Check2();" value="${ADDR2}">
						</td>
				  	</tr>
				  	<tr>
						<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">e-mail</td>
						<td bgcolor="eaeaea" class="table_bl_left" colspan="3">
							<input name="EMAIL" type="text" class="input_form1" style="width:250px" value="${EMAIL}" style="ime-mode:disabled" onclick="Jumin_toaddr_Check2();" onchange="Jumin_toaddr_Check2();" onFocus="Jumin_toaddr_Check2();"  onkeyup="Jumin_toaddr_Check2();" maxlength="50">
						</td>
				  	</tr>
				  	<tr>
						<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">전화번호</td>
						<td bgcolor="eaeaea" class="table_bl_left">
							<input name="jumin_tel1" type="text" class="input_form1" style="width:25px" style="ime-mode:disabled"  onKeyPress="nr_num_int(this);" onKeyUp="nr_num_int(this); count_check(this, jumin_tel2, 3); Jumin_toaddr_Check2();" maxlength="3" onclick="Jumin_toaddr_Check2();" onchange="Jumin_toaddr_Check2();" onFocus="Jumin_toaddr_Check2();"> - 
							<input name="jumin_tel2" type="text" class="input_form1" style="width:30px" style="ime-mode:disabled" onKeyPress="nr_num_int(this);" onKeyUp="nr_num_int(this); count_check(this, jumin_tel3, 4); Jumin_toaddr_Check2();" maxlength="4" onclick="Jumin_toaddr_Check2();" onchange="Jumin_toaddr_Check2();" onFocus="Jumin_toaddr_Check2();"> - 
							<input name="jumin_tel3" type="text" class="input_form1" style="width:30px" style="ime-mode:disabled" onKeyPress="nr_num_int(this);" onKeyUp="nr_num_int(this); count_check(this, jumin_tel3, 4); Jumin_toaddr_Check2();" maxlength="4" onclick="Jumin_toaddr_Check2();" onchange="Jumin_toaddr_Check2();" onFocus="Jumin_toaddr_Check2();">
						</td>
						<td align="center" bgcolor="e5eff8" class="sub_table_b">휴대전화</td>
						<td bgcolor="eaeaea" class="table_bl_left">
							<input name="jumin_hp1" type="text" class="input_form1" style="width:25px" style="ime-mode:disabled" onKeyPress="nr_num_int(this);" onKeyUp="nr_num_int(this); count_check(this, jumin_hp2, 3); Jumin_toaddr_Check2();" maxlength="3" onclick="Jumin_toaddr_Check2();" onchange="Jumin_toaddr_Check2();" onFocus="Jumin_toaddr_Check2();"> - 
							<input name="jumin_hp2" type="text" class="input_form1" style="width:30px" style="ime-mode:disabled" onKeyPress="nr_num_int(this);" onKeyUp="nr_num_int(this); count_check(this, jumin_hp3, 4); Jumin_toaddr_Check2();" maxlength="4" onclick="Jumin_toaddr_Check2();" onchange="Jumin_toaddr_Check2();" onFocus="Jumin_toaddr_Check2();"> - 
							<input name="jumin_hp3" type="text" class="input_form1" style="width:30px" style="ime-mode:disabled" onKeyPress="nr_num_int(this);" onKeyUp="nr_num_int(this); count_check(this, jumin_hp3, 4); Jumin_toaddr_Check2();" maxlength="4" onclick="Jumin_toaddr_Check2();" onchange="Jumin_toaddr_Check2();" onFocus="Jumin_toaddr_Check2();">
						</td>
				  	</tr>
				  	<tr>
						<td height="34" colspan="4" align="left" bgcolor="#FFFFFF" class=""><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
							<tr>
							  <td><span class="sub_stan_blue">* 우편물 송달지</span> : </td>
							  <td width="16">
							  	<input name="ADDR_CHECK" type="checkbox" value="1" onclick="Jumin_toaddr_Check();" onchange="Jumin_toaddr_Check();" onFocus="Jumin_toaddr_Check();" checked>
							  </td>
							  <td width="110">점용인 정보와 동일 </td>
							</tr>
						</table></td>
				  	</tr>
				  	<tr>
						<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">우편물 수령인 </td>
						<td colspan="3" bgcolor="eaeaea" class="table_bl_left">
							<input name="TOPOST_NM" type="text" class="input_form1" style="width:250px" value="${TOPOST_NM}" maxlength="7">
						</td>
				  	</tr>
				  	<tr>
						<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">우편번호</td>
						<td bgcolor="eaeaea" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
							<tr>
							  <td>
							  	<input name="TOPOST" type="text" class="input_form1" style="width:50px" value="${TOPOST}" onclick="Jumin_toaddr_Check2();" onchange="Jumin_toaddr_Check2();" onFocus="Jumin_toaddr_Check2();" readonly >
							  </td>
							  <td><a href="javascript:openZipcodePopup('form.TOPOST', 'form.TOADDR1');"><img src="/img/search_icon.gif" alt="검색" width="56" height="18" border="0"></a></td>
							</tr>
						</table></td>
						<td align="center" bgcolor="e5eff8" class="sub_table_b">송달지 주소</td>
						<td bgcolor="eaeaea" class="table_bl_left">
							<input name="TOADDR1" type="text" class="input_form1" style="width:250px" onclick="Jumin_toaddr_Check2();" onchange="Jumin_toaddr_Check2();" onFocus="Jumin_toaddr_Check2();" onkeyup="Jumin_toaddr_Check2();" value="${TOADDR1}" readonly>
							<input name="TOADDR2" type="text" class="input_form1" style="width:250px" onclick="Jumin_toaddr_Check2();" onchange="Jumin_toaddr_Check2();" onFocus="Jumin_toaddr_Check2();" onkeyup="Jumin_toaddr_Check2();" value="${TOADDR2}" maxlength="50"></td>
				  	</tr>
				  	<tr>
						<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">e-mail</td>
						<td bgcolor="eaeaea" class="table_bl_left" colspan="3">
							<input name="TOEMAIL" type="text" class="input_form1" style="width:250px" onclick="Jumin_toaddr_Check2();" onchange="Jumin_toaddr_Check2();" onFocus="Jumin_toaddr_Check2();" onkeyup="Jumin_toaddr_Check2();" value="${TOEMAIL}" style="ime-mode:disabled" maxlength="50">
						</td>
				  	</tr>
				  	<tr>
						<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">전화번호</td>
						<td bgcolor="eaeaea" class="table_bl_left">
							<input name="jumin_totel1" type="text" class="input_form1" style="width:25px" style="ime-mode:disabled" onclick="Jumin_toaddr_Check2();" onchange="Jumin_toaddr_Check2();" onFocus="Jumin_toaddr_Check2();" onKeyPress="nr_num_int(this);" onKeyUp="count_check(this, jumin_totel2, 3); Jumin_toaddr_Check2();" maxlength="3"> - 
							<input name="jumin_totel2" type="text" class="input_form1" style="width:30px" style="ime-mode:disabled" onclick="Jumin_toaddr_Check2();" onchange="Jumin_toaddr_Check2();" onFocus="Jumin_toaddr_Check2();" onKeyPress="nr_num_int(this);" onKeyUp="count_check(this, jumin_totel3, 4); Jumin_toaddr_Check2();" maxlength="4"> - 
							<input name="jumin_totel3" type="text" class="input_form1" style="width:30px" style="ime-mode:disabled" onclick="Jumin_toaddr_Check2();" onchange="Jumin_toaddr_Check2();" onFocus="Jumin_toaddr_Check2();" onKeyPress="nr_num_int(this);" onKeyUp="count_check(this, jumin_totel3, 4); Jumin_toaddr_Check2();" maxlength="4">
						</td>
						<td align="center" bgcolor="e5eff8" class="sub_table_b">휴대전화</td>
						<td bgcolor="eaeaea" class="table_bl_left">
							<input name="jumin_tohp1" type="text" class="input_form1" style="width:25px" style="ime-mode:disabled" onclick="Jumin_toaddr_Check2();" onchange="Jumin_toaddr_Check2();" onFocus="Jumin_toaddr_Check2();" onKeyPress="nr_num_int(this);" onKeyUp="count_check(this, jumin_tohp2, 3); Jumin_toaddr_Check2();" maxlength="3"> - 
							<input name="jumin_tohp2" type="text" class="input_form1" style="width:30px" style="ime-mode:disabled" onclick="Jumin_toaddr_Check2();" onchange="Jumin_toaddr_Check2();" onFocus="Jumin_toaddr_Check2();" onKeyPress="nr_num_int(this);" onKeyUp="count_check(this, jumin_tohp3, 4); Jumin_toaddr_Check2();" maxlength="4"> - 
							<input name="jumin_tohp3" type="text" class="input_form1" style="width:30px" style="ime-mode:disabled" onclick="Jumin_toaddr_Check2();" onchange="Jumin_toaddr_Check2();" onFocus="Jumin_toaddr_Check2();" onKeyPress="nr_num_int(this);" onKeyUp="count_check(this, jumin_tohp3, 4); Jumin_toaddr_Check2();" maxlength="4">
						</td>
				  	</tr>
                  	</table></td>
				  	</tr>
				</table>
			</div>
			<div class="tabcontent" style="display:none" id="tab3">
				<table width="100%" border="0" cellspacing="0" cellpadding="0">
				<tr>
	                <td>
	                <table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0" class="sub_table">
					<tr>
						<td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b" nowrap="nowrap">점용종류</td>
						<td width="37%" bgcolor="eaeaea" class="table_bl_left" nowrap="nowrap">
							<select name="TYPE" class="essential" style="width:70px" OnChange="Select_UseType(this);">
							${use_type}
						</select></td>
						<td width="100" align="center" bgcolor="e5eff8" class="sub_table_b" nowrap="nowrap">점용구분</td>
						<td width="36%" bgcolor="eaeaea" class="table_bl_left" nowrap="nowrap">
							<select name="SECTION" class="essential" style="width:70px" OnChange="Select_UseSection(this);">
								${occupancy_type}
							</select>
						</td>
					</tr>
					<tr>
					  	<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">소유자</td>
					  	<td bgcolor="eaeaea" class="table_bl_left">
					  		<select name="OWNER_SET" class="essential" style="width:70px">
								${use_owner_Group}
					  		</select>
					  	</td>
					  	<td align="center" bgcolor="e5eff8" class="sub_table_b">세입구분</td>
					  	<td bgcolor="eaeaea" class="table_bl_left">
					  		<select name="TAX_SET" class="essential" style="width:70px">
								${taxation_section}
					 	 	</select>
					 	 </td>
					</tr>
					<tr>
					  	<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">우편번호</td>
					  	<td bgcolor="eaeaea" class="table_bl_left">
						  	<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
								<tr>
								  	<td>
								  		<input name="MUL_POST" type="text" class="essential" style="width:50px" value="${MUL_POST}" readonly>
								  	</td>
								  	<td><a href="javascript:openZipcodePopup('form.MUL_POST', '');"><img src="/img/search_icon.gif" alt="검색" width="56" height="18" border="0"></a></td>
								</tr>
						  	</table>
					  	</td>
					  	<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">건물(명) 정보 </td>
					  	<td bgcolor="eaeaea" class="table_bl_left">
					  		<input name="BD_NM" type="text" class="input_form1" style="width:120px" value="${BD_NM}" maxlength="50">
							<input name="BD_DONG" type="text" class="input_form1" style="width:30px" value="${BD_DONG}" style="ime-mode:disabled" onKeyDown="nr_num_int(this);" onKeyUp="nr_num_int(this);" onKeyPress="nr_num_int(this);" maxlength="4"> 동 
							<input name="BD_HO" type="text" class="input_form1" style="width:30px" value="${BD_HO}" style="ime-mode:disabled" onKeyDown="nr_num_int(this);" onKeyUp="nr_num_int(this);" onKeyPress="nr_num_int(this);" maxlength="4"> 호 
						</td>
					</tr>
					<tr>
					  	<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">점용지 지번 </td>
					  	<td colspan="3" bgcolor="eaeaea" class="table_bl_left">
						  	<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
								<tr>
								  	<td>${SIGUNGU}&nbsp;&nbsp;</td>
			                    	<td width="72"><select name="BJ_CD" class="essential" style="width:100px">
			                        	${bjdong_code}
			                      	</select></td>
			                    	<td>&nbsp;<select name="HJ_CD" class="essential" style="width:100px">
			                           	${hjdong_code}
			                     	</select></td>
			                 		<td>&nbsp;/&nbsp;<select name="SPC_CD" class="essential" style="width:75px">
			                           	${mul_spc_cd}
			                    	</select></td>
								  	<td>
								  	&nbsp;<input name="BONBUN" value="${BONBUN}" type="text" class="essential" style="width:40px" style="ime-mode:disabled" onKeyDown="nr_num_int(this);" onKeyUp="nr_num_int(this);" onKeyPress="nr_num_int(this);" maxlength="4">
										- <input name="BUBUN" value="${BUBUN}" type="text" class="input_form1" style="width:40px" style="ime-mode:disabled" onKeyDown="nr_num_int(this);" onKeyUp="nr_num_int(this);" onKeyPress="nr_num_int(this);" maxlength="4">
										번지 <input name="TONG" value="${TONG}" type="text" class="input_form1" style="width:30px" style="ime-mode:disabled" onKeyDown="nr_num_int(this);" onKeyUp="nr_num_int(this);" onKeyPress="nr_num_int(this);" maxlength="2">
										통 <input name="BAN" value="${BAN}" type="text" class="input_form1" style="width:30px" style="ime-mode:disabled" onKeyDown="nr_num_int(this);" onKeyUp="nr_num_int(this);" onKeyPress="nr_num_int(this);" maxlength="2"> 
										반 
									</td>
								</tr>
							</table>
						</td>
					</tr>
	                <tr>
						<td align="center" bgcolor="e5eff8" class="sub_table_b">도로명 주소 </td>
						<td bgcolor="eaeaea" class="table_bl_left" id="doroname" colspan="3">
							<input name="ROAD_ADDR" type="text" class="input_form1" style="width:100px" value="${ROAD_ADDR}" maxlength="12">
							<input name="ROAD_BON" type="text" class="input_form1" style="width:40px" style="ime-mode:disabled" onKeyDown="nr_num_int(this);" onKeyUp="nr_num_int(this);" onKeyPress="nr_num_int(this);" maxlength="4">
						  - <input name="ROAD_BU" type="text" class="input_form1" style="width:40px" style="ime-mode:disabled" onKeyDown="nr_num_int(this);" onKeyUp="nr_num_int(this);" onKeyPress="nr_num_int(this);" maxlength="2">
						 </td>
					  	<td width="100" height="26" align="center" bgcolor="e5eff8" class="" id="jucha" style="display:none">
					  		<input id="USERTYPENAME" name="USERTYPENAME" type="text" style="width:95px" class="viewcol" value="주차면수" maxlength="10">
					  	</td>
	       			  	<td colspan="0" bgcolor="F6F6F6" class="table_bl_left" id="jucha_value" style="display:none">
		       			  	<span id="UseType1" style="display:none">
			                  	<table width="100%" border="0">
			                  		<input name="PARKING_NUM" type="text" class="input_form1" style="width:40px" value="${PARKING_NUM}" style="ime-mode:disabled" onKeyDown="nr_num_int(this);" onKeyUp="nr_num_int(this);" onKeyPress="nr_num_int(this);" maxlength="4"> 면
			                  	</table>
		                  	</span>
		       			  	<span id="UseType2" style="display:none">
			                  	<table width="100%" border="0" cellpadding="0" cellspacing="0" class="sub_stan"> 
			                  		<input name="RIVER_NM" type="text" class="input_form1" style="width:100px" value="${RIVER_NM}" maxlength="6">
			                  	</table>
		                  	</span>
	                  	</td>
	                </tr>
					<tr>
					  	<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">점용목적</td>
					  	<td colspan="3" bgcolor="eaeaea" ><table width="100%" border="0" cellpadding="0" cellspacing="0">
							<iframe id="IFRM_PurposeCode" scrolling="no" frameborder="0" framespacing="0" width="100%" height="26" src="/jsp/common/purposeCode/purposeCode.jsp?SectionCode=${TYPE}&PURPOSE_CD=${PURPOSE_CD}&essential=1"></iframe>
					  	</table></td>
				    </tr>
					<tr>
					  	<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">점용기간</td>
					  	<td id="MUL" colspan="3" bgcolor="eaeaea" class="table_bl_left">
					  		<div id="MUL_DIV">
					  			<table id="MUL_TABLE" border="0" cellpadding="0" cellspacing="0" class="sub_stan">
									<tr id="MulDateSection">
										<td id="UseSection" style="display:block">
										  	<input name="MUL_FROMDATE" type="text" class="essential" style="width:70px" value="${MUL_FROMDATE}" readonly><a><img onclick="popUpCalendar(this, MUL_FROMDATE, 'yyyymmdd')" src="/img/calendar_icon.gif" width="19" height="16" border="0" align="absmiddle" style="CURSOR: Hand;"></a>
										  	 ~ <input name="MUL_TODATE" type="text" class="essential" style="width:70px" value="${MUL_TODATE}"  readonly><a><img onclick="popUpCalendar(this, MUL_TODATE, 'yyyymmdd')" src="/img/calendar_icon.gif" width="19" height="16" border="0" align="absmiddle" style="CURSOR: Hand;"></a>
										</td>
		  						    </tr>
								</table>
							</div>
						</td>
					</tr>
				    <tr>
					  	<td height="34" colspan="4" align="left" bgcolor="#FFFFFF" class=""><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
							<tr>
						  		<td><span class="sub_stan_blue">* 인접지 정보</span></td>
							</tr>
					  	</table></td>
				    </tr>
				    <tr>
					  	<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">우편번호</td>
					  	<td colspan="3" bgcolor="eaeaea" class="table_bl_left">
					  	<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
						  	<tr>
								<td><input name="WITH_POST" value="${WITH_POST}" type="text" class="input_form1" style="width:50px" readonly></td>
								<td><a href="javascript:openZipcodePopup('form.WITH_POST', 'form.WITH_ADDR1');"><img src="/img/search_icon.gif" alt="검색" width="56" height="18" border="0"></a></td>
						  	</tr>
					  	</table></td>
				    </tr>
					<tr>
					  	<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">주소</td>
					  	<td colspan="3" bgcolor="eaeaea" class="table_bl_left"><table width="100%" border="0" cellpadding="0" cellspacing="0" class="sub_stan">
						 	<input name="WITH_ADDR1" type="text" class="input_form1" style="width:200px" value="${WITH_ADDR1}" readonly>
						 	<input name="WITH_ADDR2" type="text" class="input_form1" style="width:350px" value="${WITH_ADDR2}" maxlength="50">
					  	</table></td>
					</tr>
				    <tr>
					  	<td height="34" colspan="4" align="left" bgcolor="#FFFFFF" class=""><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
							<tr>
						 		<td><span class="sub_stan_blue">* 공사(굴착) 정보</span></td>
							</tr>
					  	</table></td>
				    </tr>
				    <tr>
					  	<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">공사기간 </td>
					  	<td colspan="3" bgcolor="eaeaea" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
							<tr>
						  	<td><input name="WORK_FROMDATE" value="${WORK_FROMDATE}" type="text" class="input_form1" style="width:65px" readonly></td>
						  	<td><a><img src="/img/calendar_icon.gif" width="19" height="16" border="0" onclick="popUpCalendar(this, WORK_FROMDATE, 'yyyymmdd')" style="CURSOR: Hand;"></a></td>
						  	<td width="16" align="center">~</td>
						  	<td><input name="WORK_TODATE" value="${WORK_TODATE}" type="text" class="input_form1" style="width:65px" readonly></td>
						  	<td><a><img src="/img/calendar_icon.gif" width="19" height="16" border="0" onclick="popUpCalendar(this, WORK_TODATE, 'yyyymmdd')" style="CURSOR: Hand;"></a></td>
							</tr>
					  	</table></td>
				    </tr>
					<tr>
					  	<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">공사내용</td>
							<td colspan="3" bgcolor="eaeaea" class="table_bl_left"><table width="100%" border="0" cellpadding="0" cellspacing="0" class="sub_stan">
								<input name="EXE_INFO" type="text" class="input_form1" style="width:98%" value="${EXE_INFO}" maxlength="100">
						</table></td>
				    </tr>
                </table></td>
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