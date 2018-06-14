<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
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

<script language="javascript" src="/js/PopupCalendar.js"></script>

<script type="text/javascript">
//<![CDATA[

	function	Save()
	{
	//	if(page	==	"")
	//		return;
		
		var form = document.form;
		var	str		= "";
		
		//	민원등록
		if(form.EXT_REGDATE.value.length	< 1)
			str	+= "등록일자를 입력하세요\n";
		else if(form.EXT_FROMDATE.value.length	< 1)
			str	+= "점용기간을 입력하세요\n";
		else if(form.EXT_TODATE.value.length	< 1)
			str	+= "점용기간을 입력하세요\n";
	//	else if(form.EXT_NOTES.value.length	< 1)
	//		str	+= "비고를 입력하세요\n";		
		else if(form.MANAGER.value.length	< 1)
			str	+= "담당자를 입력하세요\n";
		
		if(str	!= "")
		{
			alert(str);
			return	true;
		}

		form.action = "giganilgwal_ext.do";
		form.submit();
	}

	function 	Init()
	{
		parent.TabDown_Img("giganilgwal");

	//	var	adminno	= document.getElementById("ADMIN_NO").value;
	//	var	seq		= document.getElementById("SEQ").value;

	//	alert(adminno + " , " + seq);
	
	//	if(seq != "")
	//		View(adminno, seq);
	}
	
//]]>
</script>

<body onload="Init();">
<table width="780" border="0" cellpadding="0" cellspacing="0">
<form name="form" method="post">
<!-- <input type="hidden" name="MANAGER" value="${MANAGER}"> -->
<input type="hidden" name="GIGAN1" value="${GIGAN1}">
<input type="hidden" name="GIGAN2" value="${GIGAN2}">
<input type="hidden" name="PURPOSE_CD" value="${PURPOSE_CD}">
<input type="hidden" name="BONBUN" value="${BONBUN}">
<input type="hidden" name="BUBUN" value="${BUBUN}">
<input type="hidden" name="NAME" value="${NAME}">
<input type="hidden" name="ADMIN_NO" value="${ADMIN_NO}">
<input type="hidden" name="TYPE" value="${TYPE}">
<input type="hidden" name="OWNER_SET" value="${OWNER_SET}">
<input type="hidden" name="TAX_SET" value="${TAX_SET}">
<input type="hidden" name="BJ_CD" value="${BJ_CD}">
<input type="hidden" name="HJ_CD" value="${HJ_CD}">

		
	  <tr>
		<td align="left" class="contborder_blue">
		<table width="100%" border="0" cellspacing="0" cellpadding="0">

		<tr>
		  <td><table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
			  
			  <tr>
				<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">담당자</td>
				<td bgcolor="eaeaea" class="table_bl_left"><input name="MANAGER" type="text" class="input_form1" style="width:120px"  value="${MANAGER}"></td>
				<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">등록일자</td>
				<td colspan="3" bgcolor="eaeaea" class="table_bl_left">
					<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
					  <tr>
						<td><input name="EXT_REGDATE" type="text" class="input_form1" style="width:70px" value="${EXT_REGDATE}" readonly></td>
						<td><a><img src="/img/calendar_icon.gif" width="19" height="16" border="0" onclick="popUpCalendar(this, document.getElementById('EXT_REGDATE'), 'yyyymmdd')" style="CURSOR: Hand;"></a></td>					  
					  </tr>
					</table>
				</td>
			  </tr>
			  
			  <tr>
				<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">기간연장 시작</td>
				<td bgcolor="eaeaea" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
				  <tr>
					<td><input name="EXT_FROMDATE" type="text" class="input_form1" style="width:70px" value="" readonly></td>
					<td><a><img src="/img/calendar_icon.gif" width="19" height="16" border="0" onclick="popUpCalendar(this, document.getElementById('EXT_FROMDATE'), 'yyyymmdd')" style="CURSOR: Hand;"></a></td>				  
				  </tr>
				</table></td>
				<td width="100" align="center" bgcolor="e5eff8" class="sub_table_b">기간연장 종료</td>
				<td bgcolor="eaeaea" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
				  <tr>
					<td><input name="EXT_TODATE" type="text" class="input_form1" style="width:70px" value="" readonly></td>
					<td><a><img src="/img/calendar_icon.gif" width="19" height="16" border="0" onclick="popUpCalendar(this, document.getElementById('EXT_TODATE'), 'yyyymmdd')" style="CURSOR: Hand;"></a></td>				  
				  </tr>
				</table></td>
			  </tr>
			  
			  <tr>
				<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">비고</td>
				<td colspan="3" bgcolor="eaeaea" class="table_bl_left">
				<input name=EXT_NOTES type="text" class="input_form1" style="width:600px" value="">
				</td>
			  </tr>

		  </table></td>
		</tr>
		
		<tr>
			<td height="40">
			<table width="0" border="0" cellspacing="0" cellpadding="0" align="right">	
		  		<a><img onclick="javascript:Save()" src="/img/levy_icon4.gif" alt="일괄 처리" border="0"></a>
			</table>
			</td>
		</tr>
		
	</table></td>
  </tr>

</table>

</body>
</html>