<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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

	function 	Init()
	{
		parent.TabUp_Img("jumin");
	}
	
//]]>
</script>

<body onload="Init();">
<form name="form" method="post">
<input type="hidden" name="ADMIN_NO" value="${ADMIN_NO}">

<table width="780" border="0" cellpadding="0" cellspacing="0">
	<tr>
		<td align="left" class="contborder_purple">
		<table width="100%" border="0" cellspacing="0" cellpadding="0">
			<tr>
			  <td><table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
				  <tr>
					<td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">점용인/법인명</td>
					<td width="37%" bgcolor="eaeaea" class="table_bl_left">${board.NAME}</td>
					<td width="100" align="center" bgcolor="e5eff8" class="sub_table_b">주민/법인번호</td>
					<td bgcolor="eaeaea" class="table_bl_left" id="ssn">
						<script type="text/javascript">
							var ssn = "${board.SSN}";
							var ssnAsterisk = ssn.substring(7).replace(/./g, '*');
							document.getElementById("ssn").innerHTML = ssn.substring(0, 7) + ssnAsterisk;
						</script>
					</td>
				  </tr>
				  <tr>
					<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">사업자등록번호</td>
					<td bgcolor="eaeaea" class="table_bl_left">${board.BIZSSN}</td>
					<td align="center" bgcolor="e5eff8" class="sub_table_b">업태/업종</td>
					<td bgcolor="eaeaea" class="table_bl_left">${board.BIZ_STATUS} ${board.BIZ_TYPES}</td>
				  </tr>
				  <!--  //********** BEGIN_KANG_20120417 -->
				  <!-- 
				  <tr>
					<td height="30" align="center" bgcolor="e5eff8" class="sub_table_b">우편번호</td>
					<td bgcolor="eaeaea" colspan="2" class="table_bl_left">${board.POST}</td> 
				  </tr>
				   -->
				  <tr>
					<td height="30" align="center" bgcolor="e5eff8" class="sub_table_b">우편번호</td>
					<td bgcolor="eaeaea" colspan="3" class="table_bl_left">${board.POST}</td> 
				  </tr>
				  <!--   //********** END_KANG_20120417 -->
				  <tr>
					<td align="center" bgcolor="e5eff8" class="sub_table_b">주소</td>
					<td bgcolor="eaeaea" class="table_bl_left">
					<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
						<tr><td height="18px">${board.ADDR1}</td></tr>
						<tr><td height="18px"><c:if test="${board.SAN == '1'}">산&nbsp;</c:if>${board.BON}<c:if test="${board.BU != null}">-${board.BU}</c:if>&nbsp;${board.ADDR2}<td></tr>
					</table>
					</td>
					<td align="center" bgcolor="e5eff8" class="sub_table_b">도로명 주소</td>
					<td bgcolor="eaeaea" class="table_bl_left">
					<!--  //********** BEGIN_KANG_20120424 -->
					<!-- 
					<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
						<tr><td>${board.SI} ${board.GUN} ${board.DORO_NM}</td></tr>
						<tr><td>${board.BD_BON}-${board.BD_BU} ${board.ADDR2}</td></tr>
					</table>
					 -->
					<c:if test="${board.DORO_NM != null && board.DORO_NM != ''}">
					<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
					<!-- sungh83 20131107 -->
					<!-- 
						<tr><td>${board.SI} ${board.GUN} ${board.DORO_NM}</td></tr>
						<tr><td>${board.BD_BON}<c:if test="${board.BD_BU != '0' && board.BD_BU != null}">-${board.BD_BU}</c:if> ${board.BD_NM} ${board.BD_DET_NM}</td></tr>   
					-->
						<tr><td>${board.SI} ${board.GUN} ${board.DORO_NM} ${board.BD_BON}<c:if test="${board.BD_BU != '0' && board.BD_BU != null}">-${board.BD_BU}</c:if></td></tr>
						<tr><td>${board.BD_NM} ${board.BD_DET_NM}</td></tr>
					<!-- sungh83 20131107 -->
					</table>
					</c:if>
					<!--   //********** END_KANG_20120424 -->					
					</td>
				  </tr>
				  <tr>
					<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">e-mail</td>
					<td bgcolor="eaeaea" class="table_bl_left">${board.EMAIL}</td>
					<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">기존 허가번호</td>
					<td bgcolor="eaeaea" class="table_bl_left">${board.BEFORE_PERMISSION}</td>
				  </tr>
				  <tr>
					<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">전화번호</td>
					<td bgcolor="eaeaea" class="table_bl_left">${board.TEL}</td>
					<td align="center" bgcolor="e5eff8" class="sub_table_b">휴대전화</td>
					<td bgcolor="eaeaea" class="table_bl_left">${board.HP}</td>
				  </tr>
			      <tr height="40px">
        		  	<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">비고</td>
      				<td colspan="3" bgcolor="eaeaea" class="table_bl_left">
      					<textarea type="text" class="view" style="width:99%;overflow-y: scroll ;" readonly>${board.REFERENCE}</textarea>
      				</td>
        		  </tr> 
				  <tr>
					<td height="34" colspan="4" align="left" bgcolor="#FFFFFF" class=""><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
						<tr>
						  <td><span class="sub_stan_blue">* 우편물 송달지</span></td>
						</tr>
					</table></td>
				  </tr>
				  <tr>
					<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">우편물 수령인 </td>
					<td colspan="3" bgcolor="eaeaea" class="table_bl_left">${board.TONM}</td>
				  </tr>
				  <tr>
					<td height="30" align="center" bgcolor="e5eff8" class="sub_table_b">우편번호</td>
					<td colspan="3" bgcolor="eaeaea" class="table_bl_left">${board.TOPOST}</td>
				  </tr>
				  <tr>	
					<td align="center" bgcolor="e5eff8" class="sub_table_b">송달지 주소</td>
					<td bgcolor="eaeaea" class="table_bl_left">
					<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
						<tr><td height="18px">${board.TOADDR1}</td></tr>
						<tr><td height="18px"><c:if test="${board.TOSAN == '1'}">산&nbsp;</c:if>${board.TOBON}<c:if test="${board.TOBU != null}">-${board.TOBU}</c:if>&nbsp;${board.TOADDR2}<td></tr>
					</table>
					</td>
					<td align="center" bgcolor="e5eff8" class="sub_table_b">송달지  <br/>도로명 주소</td>
					<td bgcolor="eaeaea" class="table_bl_left">
					<!--  //********** BEGIN_KANG_20120424 -->
					<!-- 
					<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
						<tr><td>${board.TOSI}&nbsp;${board.TOGUN}&nbsp;${board.TODORO_NM}</td></tr>
						<tr><td>${board.TOBD_BON}&nbsp;${board.TOBD_BU}&nbsp;${board.TOBD_NM}&nbsp;${board.TOBD_DET_NM}<td></tr>
					</table>
					 -->
					 <c:if test="${board.TODORO_NM != null && board.TODORO_NM != ''}">
					 <table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
						<!-- sungh83 20131107 -->
						<!--  
						<tr><td>${board.TOSI} ${board.TOGUN} ${board.TODORO_NM}</td></tr>
						<tr><td>${board.TOBD_BON}<c:if test="${board.TOBD_BU != '0' && board.TOBD_BU != null}">-${board.TOBD_BU}</c:if> ${board.TOBD_NM} ${board.TOBD_DET_NM}<td></tr>
						-->
						<tr><td>${board.TOSI} ${board.TOGUN} ${board.TODORO_NM} ${board.TOBD_BON}<c:if test="${board.TOBD_BU != '0' && board.TOBD_BU != null}">-${board.TOBD_BU}</c:if></td></tr>
						<tr><td>${board.TOBD_NM} ${board.TOBD_DET_NM}</td></tr>
					<!-- sungh83 20131107 -->	
					</table>
					</c:if>
					<!--   //********** END_KANG_20120424 -->					
					</td>
				  </tr>
				  <tr>
					<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">e-mail</td>
					<td bgcolor="eaeaea" class="table_bl_left" colspan="3">${board.TOMAIL}</td>
				  </tr>
				  <tr>
					<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">전화번호</td>
					<td bgcolor="eaeaea" class="table_bl_left">${board.TOTEL}</td>
					<td align="center" bgcolor="e5eff8" class="sub_table_b">휴대전화</td>
					<td bgcolor="eaeaea" class="table_bl_left">${board.TOHP}</td>
				  </tr>
			  </table></td>
			</tr>
		</table>
		</td>
	</tr>

</table>
</body>
</html>