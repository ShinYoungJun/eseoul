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

<script type="text/javascript">
//<![CDATA[

	function	Modify(object_no)
	{
		var form = document.form;

		form.action = "/facility/junggiinfo/jumin_modify.do?object_no="+object_no;
		form.submit();
	}

	function 	Init()
	{
		parent.Tab_Img("jumin");
	}
	
	function	View(adminno, seq)
	{
		params	= "ADMIN_NO=" + adminno + "&SEQ=" + seq;
		
		sendRequest("/facility/minwoninfo/minwon_view_search.do", params, "GET", Result_InfoView);

		
	//	document.getElementById("SEQ").value	= seq;

	//	parent.BugwaView(seq);
	}

//]]>
</script>

<body onload="Init()">

<form name="form" id="form" method="post">
	<input type="hidden" name="ADMIN_NO" id="ADMIN_NO" value="${ADMIN_NO}">
	<input type="hidden" name="CORP_CD" id="CORP_CD" value="${CORP_CD}">
	<input type="hidden" name="GU_CODE" id="GU_CODE" value="${GU_CODE}">

	<table width="780" border="0" cellpadding="0" cellspacing="0">
		<tr>
			<td align="left" class="contborder_purple">
			
			<table width="100%" border="0" cellspacing="0" cellpadding="0">
				<tr>
				  <td>
				  
				  <table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
					  <tr height="25">
						<td width="100" height="25" align="center" bgcolor="e5eff8" class="sub_table_b" nowrap="nowrap">점용인(법인명)</td>
						<td width="37%" bgcolor="eaeaea" class="table_bl_left" nowrap="nowrap">${board.NAME}</td>
						<td width="100" align="center" bgcolor="e5eff8" class="sub_table_b" nowrap="nowrap">주민(법인)번호</td>
						<td bgcolor="eaeaea" class="table_bl_left" nowrap="nowrap">${board.SSN}</td>
					  </tr>
	
					  <tr height="25">
						<td height="25" align="center" bgcolor="e5eff8" class="sub_table_b">대표자명</td>
						<td bgcolor="eaeaea" class="table_bl_left">${board.TOPOST_NM}</td>
						<td height="25" align="center" bgcolor="e5eff8" class="sub_table_b">사업자 등록번호</td>
						<td bgcolor="eaeaea" class="table_bl_left">${board.BIZSSN}</td>
					  </tr>
	
					  <tr height="25">
						<td align="center" bgcolor="e5eff8" class="sub_table_b" height="25">점용인 주소</td>
						<td bgcolor="eaeaea" class="table_bl_left" colspan="3">
							${board.POST} ${board.ADDR1} ${board.ADDR2}
						</td>
					  </tr>
					  
					  <tr height="25">
					  	<td align="center" bgcolor="e5eff8" class="sub_table_b" height="25">업태</td>
						<td bgcolor="eaeaea" class="table_bl_left">${board.BIZ_STATUS}</td>
					  	<td align="center" bgcolor="e5eff8" class="sub_table_b" height="25">종목</td>
						<td bgcolor="eaeaea" class="table_bl_left">${board.BIZ_TYPES}</td>
					  </tr>
	
	
					  <tr height="25">
						<td height="34" colspan="4" align="left" bgcolor="#FFFFFF" class="">
							<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
								<tr>
								  <td><span class="sub_stan_blue">* 우편물 송달지</span></td>
								</tr>
							</table>
						</td>
					  </tr>
					  
					  <tr height="25">
					  	<td align="center" bgcolor="e5eff8" class="sub_table_b">송달지 주소</td>
							<td bgcolor="eaeaea" class="table_bl_left" colspan="3" height="25">
								${board.TOPOST}	${board.TOADDR1}	${board.TOADDR2}
							</td>
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
					  <tr height="25">
						<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">지점명/담당자명</td>
						<td bgcolor="eaeaea" class="table_bl_left">${board.OFFICE}   ${board.MANAGER}</td>
						<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">전화번호</td>
						<td bgcolor="eaeaea" class="table_bl_left">${board.TOTEL}  ${board.TOTEL_EXT}</td>
					  </tr>
					  <tr height="25">
						<td align="center" bgcolor="e5eff8" class="sub_table_b">팩스 </td>
						<td bgcolor="eaeaea" class="table_bl_left">${board.TOFAX}</td>
						<td align="center" bgcolor="e5eff8" class="sub_table_b">휴대전화</td>
						<td bgcolor="eaeaea" class="table_bl_left">${board.HP}</td>
					  </tr>
				  </table></td>
				</tr>
				
				<tr>
					<td height="40" align="right">
					<table width="0" border="0" cellspacing="0" cellpadding="0" align="right">
				  		<td height="40" align="right"><a href="javascript:Modify('${object_no}')"><img src="/img/mod_icon.gif" alt="수정" width="56" height="18" border="0"></a>
				  	</table>
				  	</td>
				</tr>
			</table></td>
		</tr>
	</table>

</form>
</body>
</html>
