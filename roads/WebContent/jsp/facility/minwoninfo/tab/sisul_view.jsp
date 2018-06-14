<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ include file="/jsp/common/loginCheck.jsp" %>

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

	function	Modify()
	{
		var form = document.form;

		form.action = "/facility/minwoninfo/sisul_modify.do";
		form.submit();
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
		parent.Tab_Img("jumji");

		IFRM_PurposeCode.PURPOSE_CD.className="view";
	}

//]]>
</script>

<body onload="Init(); Init_UseType('${board.TYPE}'); Init_UseSection('${board.SECTION}');">
<table width="780" border="0" cellpadding="0" cellspacing="0">
<form name="form" method="post">
<input type="hidden" name="ADMIN_NO" value="${ADMIN_NO}">

	<tr>
		<td align="left" class="contborder_purple">
		<table width="100%" border="0" cellspacing="0" cellpadding="0">
		  <tr>
			<td><table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
				<tr>
				  <td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">점용종류</td>
				  <td width="37%" bgcolor="eaeaea" class="table_bl_left">${use_type}</td>
				  <td width="100" align="center" bgcolor="e5eff8" class="sub_table_b">점용구분</td>
				  <td width="36%" bgcolor="eaeaea" class="table_bl_left">${occupancy_type}</td>
				</tr>
				<tr>
				  <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">소유자</td>
				  <td bgcolor="eaeaea" class="table_bl_left">${use_owner_Group}</td>
				  <td align="center" bgcolor="e5eff8" class="sub_table_b">세입구분</td>
				  <td bgcolor="eaeaea" class="table_bl_left">${taxation_section}</td>
				</tr>
				<tr>
				  <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">점용지 지번<br>(공시지가<br> &nbsp;적용지번)  </td>
				  <td colspan="3" bgcolor="eaeaea" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
					<tr>
					  <td>${board.SIGUNGU}&nbsp;</td>
					  <td>${bjdong_code}&nbsp;</td>
					  <td>(${hjdong_code})&nbsp;&nbsp;</td>
					  <td>${mul_spc_cd}&nbsp;</td>
					  <td>${board.BONBUN}${board.BUBUN}&nbsp;&nbsp;${board.TONG}${board.BAN} </td>
					  </tr>
				  </table></td>
				</tr>
				<tr>
				  <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">우편번호</td>
				  <td bgcolor="eaeaea" class="table_bl_left">${board.MUL_POST}</td>
				  <td align="center" bgcolor="e5eff8" class="sub_table_b">건물(명) 정보 </td>
				  <td bgcolor="eaeaea" class="table_bl_left">${board.BD_NM}</td>
				</tr>
				
				<tr style="display:block" id="UseType1">
				  <td align="center" bgcolor="e5eff8" class="sub_table_b">도로 주소 </td>
				  <td bgcolor="eaeaea" class="table_bl_left">${board.ROAD_ADD}</td>
				  <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">주차면수</td>
				  <td bgcolor="eaeaea" class="table_bl_left">${board.PARKING_NUM} 면</td>
				</tr>
				
				<tr style="display:block" id="UseType2">
				  <td align="center" bgcolor="e5eff8" class="sub_table_b">도로명 주소 </td>
				  <td bgcolor="eaeaea" class="table_bl_left">${board.ROAD_ADD}</td>
				  <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">하전/구거명</td>
				  <td bgcolor="eaeaea" class="table_bl_left">${board.RIVER_NM}</td>
				</tr>
			
				<tr>
				  <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">점용목적</td>
				  <td colspan="3" bgcolor="F6F6F6" class=""><table width="100%" border="0" cellpadding="0" cellspacing="0" class="">
					<iframe id="IFRM_PurposeCode" align="absmiddle" scrolling="no" frameborder="0" framespacing="0" width="100%" height="22" src="/jsp/common/purposeCode/purposeCode_view.jsp?SectionCode=${board.TYPE}&PURPOSE_CD=${board.PURPOSE_CD}"></iframe>
				  </table></td>
			    </tr>
			    
				<tr>
				  <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">점용기간</td>
				  <td colspan="3" bgcolor="eaeaea" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
					<tr>
					<td>
					  ${board.MUL_FROMDATE} ~ ${board.MUL_TODATE}</tr>
					</td>
					
	                <tr style="display:none" id="UseSection">
					  <td>일시점용&nbsp;${board.PARTLY_PERIOD}&nbsp;&nbsp;총 ${board.TOTAL_PERIOD}&nbsp;일</td>
					</tr>
				  </table></td>
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
				  <td colspan="3" bgcolor="eaeaea" class="table_bl_left">${board.WITH_POST}</td>
			    </tr>
				<tr>
				  <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">주소</td>
				  <td colspan="3" bgcolor="eaeaea" class="table_bl_left">${board.WITH_ADDR1}&nbsp;${board.WITH_ADDR2}</td>
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
				  <td colspan="3" bgcolor="eaeaea" class="table_bl_left">${board.WORK_FROMDATE}</td>
			    </tr>
			    
				<tr>
				  <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">공사내용</td>
				  <td colspan="3" bgcolor="eaeaea" class="table_bl_left">${board.EXE_INFO}</td>
			    </tr>
				
			</table></td>
		  </tr>
		  <tr>
			<td height="40" align="right">
			<table width="0" border="0" cellspacing="0" cellpadding="0" align="right">
				<td height="40" align="right"><a href="javascript:Modify()"><img src="/img/mod_icon.gif" alt="수정" width="56" height="18" border="0"></a>
			</table>
			</td>
		  </tr>
		</table></td>
	</tr>

</table>
</body>
</html>