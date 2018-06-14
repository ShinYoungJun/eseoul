<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ include file="/jsp/common/loginCheck.jsp" %>
<%@ include file="/jsp/common/include.jsp" %>

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

		form.action = "/jumyong/jumyonginfo/jumin_modify.do";
		form.submit();
	}

	function 	Init()
	{
		parent.Tab_Img("jumin");
	}

//]]>
</script>

<body onload="Init()">
<table width="780" border="0" cellpadding="0" cellspacing="0">
<form id="form" name="form" method="post">
<input type="hidden" id="ADMIN_NO" name="ADMIN_NO" value="${ADMIN_NO}">
<input type="hidden" id="SECTION" name="SECTION" value="${SECTION}">

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
				  <!--  //********** BEGIN_현진_20120321 -->
				 	<!--  //********** BEGIN_KANG_20120417 -->
				 	<!-- 
				 	<tr>
						<td height="26px" align="center" bgcolor="e5eff8" class="sub_table_b">대표자명</td>
						<td bgcolor="eaeaea" class="table_bl_left">
							${board.EXPONENT }
						</td>
						<td align="center" bgcolor="e5eff8" class="sub_table_b">사업장주소</td>
						<td bgcolor="eaeaea" class="table_bl_left">
							${board.BUSINESSADDR  }													  
						</td>
				  	</tr>
				 	 -->
				 	 <tr>
						<td height="26px" align="center" bgcolor="e5eff8" class="sub_table_b">대표자명</td>
						<td bgcolor="eaeaea" class="table_bl_left">
							${board.EXPONENT }
						</td>
						<td align="center" bgcolor="e5eff8" class="sub_table_b">상호명</td>
						<td bgcolor="eaeaea" class="table_bl_left">
							${board.COMPANY_NAME   }													  
						</td>
				  	</tr>
				  	<tr>
						<td height="26px" align="center" bgcolor="e5eff8" class="sub_table_b">사업장 주소</td>
						<td bgcolor="eaeaea" class="table_bl_left" colspan="3">
							${board.BUSINESSADDR }													  
						</td>
				  	</tr>
					<!--   //********** END_KANG_20120417 --> 
				  	
					<!--   //********** END_현진_20120321 -->
				  <tr>
					<td height="30" align="center" bgcolor="e5eff8" class="sub_table_b">우편번호</td>
					<td colspan="3" bgcolor="eaeaea" class="table_bl_left">${board.POST}  
					</td>
				  </tr>
				  <tr>
					<td align="center" bgcolor="e5eff8" class="sub_table_b">주소</td>
					<td bgcolor="eaeaea" class="table_bl_left">
					<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
						<!--  //********** BEGIN_현진_20120326 -->
						<!-- 
						<tr><td>${board.SI}&nbsp;${board.GUN}&nbsp;${board.DONG}</td></tr>
						-->
						<tr><td>${board.ADDR1}</td></tr>
						<!--   //********** END_현진_20120326 -->						
						<!--  //********** BEGIN_현진_20120216 -->
						<tr><td><c:if test="${board.SAN == '1'}">산&nbsp;</c:if>${board.BON}<c:if test="${board.BU != null}">-${board.BU} </c:if>&nbsp;${board.ADDR2}&nbsp;${board.SANGSE}<td></tr>
						<!--   //********** END_현진_20120216 -->
						
					</table>
					</td>
					<td align="center" bgcolor="e5eff8" class="sub_table_b">도로명 주소</td>
					<td bgcolor="eaeaea" class="table_bl_left">
					<!--  //********** BEGIN_KANG_20120424 -->
					<c:if test="${board.DORO_NM != null && board.DORO_NM != ''}">
					<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
					<!-- 20131107 sungh83 -->
						<!--  
						<tr><td>${board.SI} ${board.GUN} ${board.DORO_NM}</td></tr>						
						<tr><td>${board.BD_BON}<c:if test="${board.BD_BU != '0' && board.BD_BU != null}">-${board.BD_BU}</c:if> ${board.BD_NM} ${board.BD_DET_NM}<td></tr>
						-->
						<tr><td>${board.SI} ${board.GUN} ${board.DORO_NM} ${board.BD_BON}<c:if test="${board.BD_BU != '0' && board.BD_BU != null}">-${board.BD_BU}</c:if></td></tr>	
						<tr><td>${board.BD_NM} ${board.BD_DET_NM}</td></tr>
					<!-- 20131107 sungh83 -->
						<!--   //********** END_현진_20120326 -->
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
					<td height="40" align="center" bgcolor="e5eff8" class="sub_table_b">송달지 주소</td>
					<td bgcolor="eaeaea" class="table_bl_left">
					<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
						<!--  //********** BEGIN_현진_20120327 -->
						<!-- 
						<tr><td>${board.TOSI} ${board.TOGUN} ${board.TODONG}</td></tr>
						-->
						<tr><td>${board.TOADDR1}</td></tr>
						<!--   //********** END_현진_20120327 -->
						<!--  //********** BEGIN_현진_20120216 -->
						<tr><td><c:if test="${board.TOSAN == '1'}">산&nbsp;</c:if>${board.TOBON}<c:if test="${board.TOBU != null}">-${board.TOBU} </c:if>&nbsp;${board.TOADDR2}&nbsp;${board.TOSANGSE}<td></tr>
						<!--   //********** END_현진_20120216 -->
						
					</table>
					</td>
					<td align="center" bgcolor="e5eff8" class="sub_table_b">송달지<br/>도로명 주소</td>
					<td bgcolor="eaeaea" class="table_bl_left">
					<!--  //********** BEGIN_KANG_20120424 -->
					<c:if test="${board.TO_DORO_NM != null && board.TO_DORO_NM != ''}">
					<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
					<!-- sungh83 20131107 -->
						<!--  
						<tr><td>${board.TOSI} ${board.TOGUN} ${board.TO_DORO_NM}</td></tr>
						<tr><td>${board.TO_BD_BON}<c:if test="${board.TO_BD_BU != '0' && board.TO_BD_BU != null}">-${board.TO_BD_BU}</c:if> ${board.TO_BD_NM} ${board.TO_BD_DET_NM}<td></tr>
						-->
						<tr><td>${board.TOSI} ${board.TOGUN} ${board.TO_DORO_NM} ${board.TO_BD_BON}<c:if test="${board.TO_BD_BU != '0' && board.TO_BD_BU != null}">-${board.TO_BD_BU}</c:if></td></tr>
						<tr><td>${board.TO_BD_NM} ${board.TO_BD_DET_NM}</td></tr>
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
			
			<tr>
				<td height="40" align="right">
					<c:if test="${SECTION != 4}">
						<img src="/img/mod_icon.gif" alt="수정" width="56" height="18" border="0" style="cursor: pointer;" onclick="javascript:Modify()">
				  	</c:if>
			  	</td>
			</tr>
		</table></td>
	</tr>

</table>
</body>
</html>
