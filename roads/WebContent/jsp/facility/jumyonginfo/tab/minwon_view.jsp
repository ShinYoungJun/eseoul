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
<script language="javascript" src="/js/Ajax_request.js"></script>


<script type="text/javascript">
//<![CDATA[
	function	Page(page)
	{
		if(page	==	"")
			return;
		
		var form = document.form;

		form.action = "minwon_view.do?currentPage=" + page;
		form.submit();
	}

	function	Result_InfoView(obj)
	{
		//document.write(obj);
        var xmldoc 	= new ActiveXObject("Microsoft.XMLDOM");
        var form 	= document.form;
		
        xmldoc.async	= false;
		xmldoc.loadXML(obj);
		
		

		form.ADMIN_NO.value		=	xmldoc.getElementsByTagName("ADMIN_NO").item(0).text;
		form.SEQ.value			=	xmldoc.getElementsByTagName("SEQ").item(0).text;
		
		form.REQ_NO_MIN.value		=	xmldoc.getElementsByTagName("REQ_NO_MIN").item(0).text;
		form.GUBUN_MIN.value		=	xmldoc.getElementsByTagName("GUBUN_MIN").item(0).text;
		form.REQ_DATE_MIN.value		=	xmldoc.getElementsByTagName("REQ_DATE_MIN").item(0).text;
		form.PREDATE_MIN.value		=	xmldoc.getElementsByTagName("PREDATE_MIN").item(0).text;
		form.REQ_DEP_MIN.value		=	xmldoc.getElementsByTagName("REQ_DEP_MIN").item(0).text;
		form.MANAGE_DEP_MIN.value	=	xmldoc.getElementsByTagName("MANAGE_DEP_MIN").item(0).text;
		form.REQ_NM_MIN.value		=	xmldoc.getElementsByTagName("REQ_NM_MIN").item(0).text;
		form.MANAGER_MIN.value		=	xmldoc.getElementsByTagName("MANAGER_MIN").item(0).text;
		form.NOTES_MIN.value		=	xmldoc.getElementsByTagName("NOTES_MIN").item(0).text;
		form.AGENT_NM_MIN.value		=	xmldoc.getElementsByTagName("AGENT_NM_MIN").item(0).text;
		form.AGENT_TEL_MIN.value	=	xmldoc.getElementsByTagName("AGENT_TEL_MIN").item(0).text;
		form.NAME_MIN.value			=	xmldoc.getElementsByTagName("NAME_MIN").item(0).text;
		form.SSN_MIN.value			=	xmldoc.getElementsByTagName("SSN_MIN").item(0).text;
		form.POST_MIN.value			=	xmldoc.getElementsByTagName("POST_MIN").item(0).text;
		form.ADDR1_MIN.value		=	xmldoc.getElementsByTagName("ADDR1_MIN").item(0).text;
		form.ADDR2_MIN.value		=	xmldoc.getElementsByTagName("ADDR2_MIN").item(0).text;
		form.TEL_MIN.value			=	xmldoc.getElementsByTagName("TEL_MIN").item(0).text;
		form.HP_MIN.value			=	xmldoc.getElementsByTagName("HP_MIN").item(0).text;
	}

	function	View(adminno, seq)
	{	
		params	= "ADMIN_NO=" + adminno + "&SEQ=" + seq;
		
		sendRequest("/facility/jumyonginfo/minwon_view_search.do", params, "GET", Result_InfoView);


	}

	
	function	Modify()
	{
		var form = document.form;
		
		//if(form.REQ_DATE_MIN.value	== "")
		//{
		//	alert("수정할 데이터를 선택하세요.");
		//	return;
		//}

		form.action = "/facility/jumyonginfo/minwon_modify.do";
		form.submit();
	}
	
	function 	Init()
	{
		var ADMIN_NO = document.getElementById("ADMIN_NO").value;
		var SEQ = document.getElementById("SEQ").value;
		
		if(SEQ !="") View(ADMIN_NO, SEQ);
//		View("200911680101-2-0019","6");
		parent.Tab_Img("minwon");
	}
//]]>
</script>

<body onload="Init()">
<table width="780" border="0" cellpadding="0" cellspacing="0">
<form name="form" method="post">
<input type="hidden" name="ADMIN_NO" id="ADMIN_NO" value="${ADMIN_NO}">
<input type="hidden" name="SEQ" id="SEQ" value="${SEQ}">

	  <tr>
		<td align="left" class="contborder_blue">
		<table width="100%" border="0" cellspacing="0" cellpadding="0">

			<tr>
				<td><table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
			  	<tr>
					<td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">접수번호</td>
					<td width="37%" bgcolor="eaeaea" class="table_bl_left"><input name="REQ_NO_MIN" id="REQ_NO_MIN"type="text" class="view" style="width:120px" readonly value="${REQ_NO}"></td>
					<td width="100" align="center" bgcolor="e5eff8" class="sub_table_b">민원구분</td>
					<td bgcolor="eaeaea" class="table_bl_left"><input name="GUBUN_MIN" id="GUBUN_MIN" type="text" class="view" style="width:120px" readonly value="${GUBUN}"></td>
			  	</tr>
			  	<tr>
					<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">접수일자</td>
					<td bgcolor="eaeaea" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
				  	<tr>
						<td><input name="REQ_DATE_MIN" id="REQ_DATE_MIN" type="text" class="view" style="width:120px" readonly value="${REQ_DATE}"></td>
				  	</tr>
					</table></td>
					<td align="center" bgcolor="e5eff8" class="sub_table_b">처리예정일자</td>
					<td bgcolor="eaeaea" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
				  	<tr>
						<td><input name="PREDATE_MIN" id="PREDATE_MIN" type="text" class="view" style="width:120px" readonly value="${PRE_DATE}"></td>
				  	</tr>
					</table></td>
			  	</tr>
			  
			  	<tr>
					<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">접수부서</td>
					<td bgcolor="eaeaea" class="table_bl_left"><input name="REQ_DEP_MIN" id="REQ_DEP_MIN" type="text" class="view" style="width:120px" readonly value="${REQ_DEP}"></td>
					<td align="center" bgcolor="e5eff8" class="sub_table_b">담당부서</td>
					<td bgcolor="eaeaea" class="table_bl_left"><input name="MANAGE_DEP_MIN" id="MANAGE_DEP_MIN" type="text" class="view" style="width:120px" readonly value="${MANAGE_DEP}"></td>
			  	</tr>
			  
				<tr>
					<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">접수자명</td>
					<td bgcolor="eaeaea" class="table_bl_left"><input name="REQ_NM_MIN" id="REQ_NM_MIN" type="text" class="view" style="width:120px" readonly value="${REQ_NM}"></td>
					<td align="center" bgcolor="e5eff8" class="sub_table_b">담당자명</td>
					<td bgcolor="eaeaea" class="table_bl_left"><input name="MANAGER_MIN" id="MANAGER_MIN" type="text" class="view" style="width:120px" readonly value="${MANAGER}"></td>
				</tr>
				<tr>
					<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">민원요지</td>
					<td colspan="3" bgcolor="eaeaea" class="table_bl_left"><table width="100%" border="0" cellpadding="0" cellspacing="0" class="sub_stan">
						<input name="NOTES_MIN" id="NOTES_MIN" type="text" class="view" style="width:98%" readonly value="${NOTES}">
					</table></td>
				</tr>
				
				<tr>
					<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">대리인</td>
					<td bgcolor="eaeaea" class="table_bl_left"><input name="AGENT_NM_MIN" id="AGENT_NM_MIN" type="text" class="view" style="width:120px" readonly value="${AGENT_NM}"></td>
					<td align="center" bgcolor="e5eff8" class="sub_table_b">대리인 연락처</td>
					<td bgcolor="eaeaea" class="table_bl_left"><input name="AGENT_TEL_MIN" id="AGENT_TEL_MIN" type="text" class="view" style="width:120px" readonly value="${AGENT_TEL}"></td>
				</tr>

				<tr>
					<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">민원인명</td>
					<td bgcolor="eaeaea" class="table_bl_left"><input name="NAME_MIN" id="NAME_MIN" type="text" class="view" style="width:120px" readonly value="${NAME}"></td>
					<td align="center" bgcolor="e5eff8" class="sub_table_b">민원인 주민번호</td>
					<td bgcolor="eaeaea" class="table_bl_left"><input name="SSN_MIN" id="SSN_MIN" type="text" class="view" style="width:120px" readonly value="${SSN}"></td>
				</tr>
			  
			 	<tr>
					<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">민원인 우편번호</td>
					<td bgcolor="eaeaea" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
						<tr>
						  	<td><input name="POST_MIN" id="POST_MIN" type="text" class="view" style="width:50px" readonly value="${POST}"></td>
						</tr>
					</table></td>
					<td align="center" bgcolor="e5eff8" class="sub_table_b">민원인 주소</td>
					<td bgcolor="eaeaea" class="table_bl_left">
						<input name="ADDR1_MIN" id="ADDR1_MIN" type="text" class="view" style="width:250px" readonly value="${ADDR1}">
						<input name="ADDR2_MIN" id="ADDR2_MIN" type="text" class="view" style="width:250px" readonly value="${ADDR2}">
					</td>
			  	</tr>
			  	<tr>
					<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">민원인 전화</td>
					<td bgcolor="eaeaea" class="table_bl_left"><input name="TEL_MIN" id="TEL_MIN" type="text" class="view" style="width:120px" readonly value="${TEL}"></td>
					<td align="center" bgcolor="e5eff8" class="sub_table_b">민원인 휴대폰</td>
					<td bgcolor="eaeaea" class="table_bl_left"><input name="HP_MIN" id="HP_MIN" type="text" class="view" style="width:120px" readonly value="${HP}"></td>
			  	</tr>
				  
			  </table></td>
			</tr>

			<tr>
			  <td height="40" align="right">
				<a href="javascript:Modify()"><img src="/img/mod_icon.gif" alt="수정" border="0"></a>
			  </td>
			</tr>
			
		</table></td>
	  </tr>

</table>

</body>
</html>