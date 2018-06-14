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

<script type="text/javascript">
//<![CDATA[

	function goModify()
	{
		location.href = "/jsp/gapan/gapan/tab/operator_modify.jsp";
	}
	
	function	Init_SANCheck(san)
	{
		if(san	== '1')	//	산 체크
			document.getElementById("SAN_CK").checked	= true;
		else
			document.getElementById("SAN_CK").checked	= false;
	}
		

	function	Init_UseType(sel)
	{
		document.getElementById("UseType1").style.display = "none";
		document.getElementById("UseType2").style.display = "none";
		
		if(sel == '2' || sel == '3')
			document.getElementById("UseType2").style.display = "block";	//	하천, 구거
		else						
			document.getElementById("UseType1").style.display = "block";	//	도로	
	}

	function	Init_UseSection(sel)
	{
		if(sel == '1')
			document.getElementById("UseSection").style.display = "block";	//	정기
		else
			document.getElementById("UseSection").style.display = "none";
	}	

	function 	Init()
	{
		parent.TabUp_Img("operator");
	}
	
//]]>
</script>

<body onload="Init();">
<form name="form" method="post">
<input type="hidden" name="GAPAN_NO" value="${GAPAN_NO}">
<table width="780" border="0" cellpadding="0" cellspacing="0">
	<tr>
		<td align="left" class="contborder_purple">
		<table width="100%" border="0" cellspacing="0" cellpadding="0">
		  <tr>
			<td><table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
				<tr>
				  <td width="15%" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">운영자명</td>
				  <td width="35%" bgcolor="eaeaea" class="table_bl_left">${info.OWNER_NAME}
				  </td>
				  <td  width="15%" align="center" bgcolor="e5eff8" class="sub_table_b">운영자사진</td>
				  <td width="35%" bgcolor="eaeaea" class="table_bl_left">${info.OWNER_IMG}
				  </td>
				</tr>
				<tr>
				  <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">주민등록번호</td>
				  <td bgcolor="eaeaea" class="table_bl_left">${info.OWNER_SSN}</td>
				  <td align="center" bgcolor="e5eff8" class="sub_table_b">성별/나이</td>
				  <td bgcolor="eaeaea" class="table_bl_left">${info.OWNER_GENDER} / ${info.OWNER_AGE}
				  </td>
				</tr>
				
				<tr style="display:block" id="UseType1">
				  <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">전화번호</td>
				  <td bgcolor="eaeaea" class="table_bl_left">${info.OWNER_TEL}
				  </td>
				  <td align="center" bgcolor="e5eff8" class="sub_table_b">휴대전화</td>
				  <td bgcolor="eaeaea" class="table_bl_left">${info.OWNER_HP}
				  </td>
				</tr>
				
			    <tr>
				  <td height="26" colspan="4" align="left" bgcolor="#FFFFFF" class="table_bl_left">
				  <table width="100%"border="0" cellpadding="0" cellspacing="0" class="sub_stan">
					<tr>
					  <td width="50%"><span class="sub_stan_blue">* 주민등록지</span></td>  
					  <td><span class="sub_stan_blue">* 실제거주지:</span> <input name="SAN_CK" type="checkbox" value="${board.SAN_CK}" > 주민등록지와 동일</td> 
					</tr>
				  </table></td>
			    </tr>

				<tr style="display:block" id="UseType1">
				  <td align="center" bgcolor="e5eff8" class="sub_table_b">우편번호 </td>
				  <td bgcolor="eaeaea" class="table_bl_left">${info.OWNER_POST}
				  </td>
				  <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">우편번호</td>
				  <td bgcolor="eaeaea" class="table_bl_left">${info.OWNER_TOPOST} 
				  </td>
				</tr>
				
				<tr style="display:block" id="UseType1">
				  <td align="center" bgcolor="e5eff8" class="sub_table_b">기본주소 </td>
				  <td bgcolor="eaeaea" class="table_bl_left">${info.OWNER_ADDR1}</td>
				  <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">기본주소</td>
				  <td bgcolor="eaeaea" class="table_bl_left">${info.OWNER_TOADDR1}</td>
				</tr>
				
				<tr style="display:block" id="UseType1">
				  <td align="center" bgcolor="e5eff8" class="sub_table_b">상세주소</td>
				  <td bgcolor="eaeaea" class="table_bl_left">${info.OWNER_ADDR2}</td>
				  <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">상세주소</td>
				  <td bgcolor="eaeaea" class="table_bl_left">${info.OWNER_TOADDR2}</td>
				</tr>
				
			    <tr>
				  <td height="26" colspan="4" align="left" bgcolor="#FFFFFF" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
					<tr>
					  <td><span class="sub_stan_blue">* 추가정보</span></td>  
					</tr>
				  </table></td>
			    </tr>
			    
				<tr style="display:block" id="UseType1">
				  <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">주거정보</td>
				  <td bgcolor="eaeaea" class="table_bl_left">${info.RT_SEL}
				  </td>
				  <td align="center" bgcolor="e5eff8" class="sub_table_b">생활정보</td>
				  <td bgcolor="eaeaea" class="table_bl_left">${info.LC_SEL}
				  </td>
				</tr>
		
			    <tr>
				  <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">동산/부동산</td>
				  <td colspan="4" bgcolor="eaeaea" class="table_bl_left">${info.ESTATE_MOVE} / ${info.ESTATE_REAL}
				  </td>
			    </tr>
			    				
			</table></td>
		  </tr>

			<tr>
				<td height="40" align="right"><a href="javascript:goModify();"><img
					src="/img/mod_icon.gif" alt="수정" width="56" height="18"
					border="0"></a></td>
			</tr>
          
		</table></td>
	</tr>

</table>
</body>
</html>