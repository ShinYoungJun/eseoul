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

<script type="text/javascript">
//<![CDATA[

	function goModify()
	{
		location.href = "/jsp/gapan/gapan/tab/bloom_modify.jsp";
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
		parent.TabUp_Img("bloom");
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
				  <td width="15%" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">인접지주소</td>
				  <td  width="35%" bgcolor="eaeaea" class="table_bl_left">
				  ${info.WITH_ADDR} 	
				  </td>
				  <td width="15%" align="center" bgcolor="e5eff8" class="sub_table_b">시설물사진</td>
				  <td width="35%" bgcolor="eaeaea" class="table_bl_left">${info.SHOP_IMG}</td>
				
				</tr>
				<tr>
				  <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">주변정보</td>
				  <td bgcolor="eaeaea" class="table_bl_left">${info.WITH_INFO}</td>
				  <td align="center" bgcolor="e5eff8" class="sub_table_b">보관장소</td>
				  <td bgcolor="eaeaea" class="table_bl_left">
			 	   ${info.DP_TXT}
				  </td>
				</tr>
				
				<tr style="display:block" id="UseType1">
				  <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">지역정보</td>
				  <td bgcolor="eaeaea" class="table_bl_left">${info.AR_SEL}
				  </td>
				  <td align="center" bgcolor="e5eff8" class="sub_table_b">시설물명/형태</td>
				  <td bgcolor="eaeaea" class="table_bl_left">${info.FT_TYP} / ${info.FT_SEL}
				  </td>
				</tr>
			
				<tr style="display:block" id="UseType1">
				  <td align="center" bgcolor="e5eff8" class="sub_table_b">인접시설 </td>
				  <td bgcolor="eaeaea" class="table_bl_left">${info.UC_SEL}
				  </td>
				  <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">시설규격</td>
				  <td bgcolor="eaeaea" class="table_bl_left">${info.FACIL_L} m * ${info.FACIL_W} m * ${info.FACIL_H}
				  </td>
				</tr>
				
				<tr style="display:block" id="UseType1">
				  <td align="center" bgcolor="e5eff8" class="sub_table_b">설치일자 </td>
				  <td bgcolor="eaeaea" class="table_bl_left">${info.FOUND_DATE}
				  </td>
				  <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">점용면적</td>
				  <td bgcolor="eaeaea" class="table_bl_left">${info.PLACE_L} m * ${info.PLACE_H} m = ${info.PLACE_A} ㎡
				  </td>			  
				</tr>
				
			    <tr>
				  <td height="26" colspan="4" align="left" bgcolor="#FFFFFF" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
					<tr>
					  <td width="5%"></td>	
					  <td>특화거리 조성 <input name="SAN_CK" type="checkbox" value="${info.SPECIAL_ST}" disabled></td> 
					  <td width="5%"></td>	
					  <td>점용료 부과  <input name="SAN_CK" type="checkbox" value="${info.TAXTATION_AT}" disabled></td>   
					</tr>
				  </table></td>
			    </tr>
			              
		</table></td>
	</tr>
	
	<tr>
		<td height="40" align="right"><a href="javascript:goModify();"><img
			src="/img/mod_icon.gif" alt="수정" width="56" height="18"
			border="0"></a></td>
	</tr>

</table>
</body>
</html>