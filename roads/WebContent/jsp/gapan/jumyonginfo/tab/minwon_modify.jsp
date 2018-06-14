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

	function	Modify()
	{
		var	result	= DataCheck();

		if(result	==	false)
			return;
		
		var form = document.form;

		form.action = "/gapan/jumyonginfo/minwon_modify_prc.do";
		form.submit();
	}

	function	Cancel()
	{
		var form = document.form;

		form.action = "/gapan/jumyonginfo/minwon_view.do";
		form.submit();
	}

	function	DataCheck()
	{
		var form 	= document.form;
		var	str		= "";
		
		//	민원등록
		if(form.SSN1.value.length	< 6)
		{
			str	+= "운영자 주민등록번호를 입력하세요\n";
			alert(str);
			form.SSN1.focus();
		}
		else if(form.SSN2.value.length	< 7)
		{
			str	+= "운영자 주민등록번호를 입력하세요\n";
			alert(str);
			form.SSN2.focus();
		}

		if(str	== "")
		{
			return	true;
		}
		
		alert(str);

		return	false;		
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
//]]>
</script>

<body>
<table width="780" border="0" cellpadding="0" cellspacing="0">
<form name="form" method="post">
<input type="hidden" name="ADMIN_NO" value="${ADMIN_NO}">
<input type="hidden" name="SEQ" value="${SEQ}">

	  <tr>
		<td align="left" class="contborder_blue">
		<table width="100%" border="0" cellspacing="0" cellpadding="0">
			<tr>
			  <td><table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">

			  	<tr>
					<td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">접수번호</td>
					<td width="37%" bgcolor="eaeaea" class="table_bl_left"><input name="REQ_NO" type="text" class="input_form1" style="width:120px" value="${REQ_NO}" readonly></td>
					<td width="100" align="center" bgcolor="e5eff8" class="sub_table_b">민원구분</td>
					<td bgcolor="eaeaea" class="table_bl_left"><input name="GUBUN" type="text" class="input_form1" style="width:120px" value="${GUBUN}"></td>
			  	</tr>
				
			  	<tr>
					<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">접수일자</td>
					<td bgcolor="eaeaea" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
				  	<tr>
						<td><input name="REQ_DATE" type="text" class="input_form1" style="width:120px" value="${REQ_DATE}" readonly></td>
					 	<td><a><img src="/img/calendar_icon.gif" width="19" height="16" border="0" onclick="popUpCalendar(this, document.getElementById('REQ_DATE'), 'yyyymmdd')" style="CURSOR: Hand;"></a></td>
				  	</tr>
					</table></td>
					<td align="center" bgcolor="e5eff8" class="sub_table_b">처리예정일자</td>
					<td bgcolor="eaeaea" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
				  	<tr>
						<td><input name="PREDATE" type="text" class="input_form1" style="width:120px" value="${PREDATE}" readonly></td>
						<td><a><img src="/img/calendar_icon.gif" width="19" height="16" border="0" onclick="popUpCalendar(this, document.getElementById('PREDATE'), 'yyyymmdd')" style="CURSOR: Hand;"></a></td>
				  	</tr>
					</table></td>
			  	</tr>
			  
			  	<tr>
					<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">접수부서</td>
					<td bgcolor="eaeaea" class="table_bl_left"><input name="REQ_DEP" type="text" class="input_form1" style="width:120px" value="${REQ_DEP}"></td>
					<td align="center" bgcolor="e5eff8" class="sub_table_b">담당부서</td>
					<td bgcolor="eaeaea" class="table_bl_left"><input name="MANAGE_DEP" type="text" class="input_form1" style="width:120px" value="${MANAGE_DEP}"></td>
			  	</tr>
			  
				<tr>
					<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">접수자명</td>
					<td bgcolor="eaeaea" class="table_bl_left"><input name="REQ_NM" type="text" class="input_form1" style="width:120px" value="${REQ_NM}"></td>
					<td align="center" bgcolor="e5eff8" class="sub_table_b">담당자명</td>
					<td bgcolor="eaeaea" class="table_bl_left"><input name="MANAGER" type="text" class="input_form1" style="width:120px" value="${MANAGER}"></td>
				</tr>
				  
				<tr>
					<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">민원요지</td>
					<td colspan="3" bgcolor="eaeaea" class="table_bl_left"><table width="100%" border="0" cellpadding="0" cellspacing="0" class="sub_stan">
						<input name="NOTES" type="text" class="input_form1" style="width:98%" value="${NOTES}">
					</table></td>
				</tr>
				
				<tr>
					<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">대리인</td>
					<td bgcolor="eaeaea" class="table_bl_left"><input name="AGENT_NM" type="text" class="input_form1" style="width:120px" value="${AGENT_NM}"></td>
					<td align="center" bgcolor="e5eff8" class="sub_table_b">대리인 연락처</td>
					<td bgcolor="eaeaea" class="table_bl_left">
						<input name="AGENT_TEL1" value="${AGENT_TEL1}" type="text" class="input_form1" style="width:25px" style="ime-mode:disabled" onKeyPress="nr_num_int(this);" onKeyUp="nr_num_int(this); count_check(this, AGENT_TEL2, 3);" maxlength="3"> - 
						<input name="AGENT_TEL2" value="${AGENT_TEL2}" type="text" class="input_form1" style="width:30px" style="ime-mode:disabled" onKeyPress="nr_num_int(this);" onKeyUp="nr_num_int(this); count_check(this, AGENT_TEL3, 4);" maxlength="4"> - 
						<input name="AGENT_TEL3" value="${AGENT_TEL3}" type="text" class="input_form1" style="width:30px" style="ime-mode:disabled" onKeyPress="nr_num_int(this);" onKeyUp="nr_num_int(this);" maxlength="4">
					</td>
				</tr>
			  
				<tr>
					<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">민원인명</td>
					<td bgcolor="eaeaea" class="table_bl_left"><input name="NAME" type="text" class="input_form1" style="width:120px" value="${NAME}"></td>
					<td align="center" bgcolor="e5eff8" class="sub_table_b">민원인 주민번호</td>
					<td bgcolor="eaeaea" class="table_bl_left">
						<input name="SSN1" type="text" class="essential" style="width:40px; ime-mode:disabled" value="${SSN1}" onKeyPress="nr_num_int(this);" onKeyUp="count_check(this, min_ssn2, 6);" maxlength="6">
						 - <input name="SSN2" type="text" class="essential" style="width:45px; ime-mode:disabled" value="${SSN2}" onKeyPress="nr_num_int(this);" maxlength="7"></td>
				</tr>
			  
			 	<tr>
					<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">민원인 우편번호</td>
					<td bgcolor="eaeaea" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
						<tr>
						  	<td><input name="POST" type="text" class="input_form1" style="width:50px" value="${POST}" readonly></td>
						   	<td><img src="/img/search_icon.gif" alt="검색" width="56" height="18" border="0" onclick="javascript:openZipcodePopup('form.POST', 'form.ADDR1');" style="CURSOR:Hand"></td>
						</tr>
					</table></td>
					<td align="center" bgcolor="e5eff8" class="sub_table_b">민원인 주소</td>
					<td bgcolor="eaeaea" class="table_bl_left">
						<input name="ADDR1" type="text" class="input_form1" style="width:250px" value="${ADDR1}" readonly>
						<input name="ADDR2" type="text" class="input_form1" style="width:250px" value="${ADDR2}"></td>
			  	</tr>
			  	
			  	<tr>
					<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">민원인 전화</td>
					<td bgcolor="eaeaea" class="table_bl_left">
						<input name="TEL1" type="text" class="input_form1" style="width:25px" style="ime-mode:disabled" onKeyPress="nr_num_int(this);" onKeyUp="nr_num_int(this); count_check(this, TEL2, 3);" maxlength="3" value="${TEL1}"> - 
						<input name="TEL2" type="text" class="input_form1" style="width:30px" style="ime-mode:disabled" onKeyPress="nr_num_int(this);" onKeyUp="nr_num_int(this); count_check(this, TEL3, 4);" maxlength="4" value="${TEL2}"> - 
						<input name="TEL3" type="text" class="input_form1" style="width:30px" style="ime-mode:disabled" onKeyPress="nr_num_int(this);" onKeyUp="nr_num_int(this); count_check(this, HP1, 4);" maxlength="4" value="${TEL3}">
					</td>
					<td align="center" bgcolor="e5eff8" class="sub_table_b">민원인 휴대폰</td>
					<td bgcolor="eaeaea" class="table_bl_left">
						<input name="HP1" type="text" class="input_form1" style="width:25px" style="ime-mode:disabled" onKeyPress="nr_num_int(this);" onKeyUp="count_check(this, HP2, 3);" maxlength="3" value="${HP1}"> - 
						<input name="HP2" type="text" class="input_form1" style="width:30px" style="ime-mode:disabled" onKeyPress="nr_num_int(this);" onKeyUp="count_check(this, HP3, 4);" maxlength="4" value="${HP2}"> - 
						<input name="HP3" type="text" class="input_form1" style="width:30px" style="ime-mode:disabled" onKeyPress="nr_num_int(this);" onKeyUp="nr_num_int(this);" maxlength="4" value="${HP3}">
					</td>
			  	</tr>
			  </table></td>
			</tr>

			<tr>
				<td height="40">
				<table width="0" border="0" cellspacing="0" cellpadding="0" align="right">
			  		<a href="javascript:Cancel()"><img src="/img/can_icon.gif" alt="취소" width="56" height="18" border="0"></a>	
			  		<a href="javascript:Modify()"><img src="/img/save_icon2.gif" alt="저장" width="56" height="18" border="0"></a>
				</table>
				</td>
			</tr>
			
		</table></td>
	  </tr>

</table>

</body>
</html>