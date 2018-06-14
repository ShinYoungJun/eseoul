<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
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

</script>

<body >
<form name="form" method="post">
<input type="hidden" name="ADMIN_NO" value=${ADMIN_NO}>
<input type="hidden" name="SEQ" value="${SEQ}">
<table width="780" border="0" cellpadding="0" cellspacing="0">


	  <tr>
		<td align="left" class="contborder_blue">
			<table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
				<tr>
				  <td height="28" bgcolor="e5eff8" class="sub_table_b" colspan="4" style="padding-left:7px">점용 상세정보 (관리번호 : ${ADMIN_NO})</td>
				</tr>
				<tr>
				  <td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">점용인/법인명</td>
				  <td width="37%" bgcolor="eaeaea" class="table_bl_left">${board.NAME}</td>
				  <td width="100" align="center" bgcolor="e5eff8" class="sub_table_b">전화번호</td>
				  <td width="36%" bgcolor="eaeaea" class="table_bl_left">${board.TEL}</td>
				</tr>
				<tr>
				  <td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">점용인 주소</td>
				  <td width="37%" bgcolor="eaeaea" class="table_bl_left" colspan="3">${board.ADDR1} ${board.ADDR2}</td>
				</tr>
				<tr>
				  <td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">점용지 주소</td>
				  <td width="37%" bgcolor="eaeaea" class="table_bl_left" colspan="3">
				  	<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
					<tr>
					  <td>${board.SI_NM}&nbsp;</td>
					  <td>${board.GU_NM}&nbsp;</td>
					  <td>${board.BJ_NM}&nbsp;</td>
					  <td>(${board.HJ_NM})&nbsp;&nbsp;</td>
					  <td>${mul_spc_cd}&nbsp;</td>
					  <td>${board.BONBUN}<c:if test="${board.BUBUN != null || !empty(board.BUBUN)}">-</c:if>${board.BUBUN}&nbsp;&nbsp;${board.TONG}${board.BAN} </td>
					  </tr>
				  </table></td>
				</tr>
				<tr>
				  <td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">지목종류</td>
				  <td width="37%" bgcolor="eaeaea" class="table_bl_left">${board.TYPE_NAME}</td>
				  <td width="100" align="center" bgcolor="e5eff8" class="sub_table_b">점용구분</td>
				  <td width="36%" bgcolor="eaeaea" class="table_bl_left">${board.SECTION_NAME}</td>
				</tr>
				<tr>
				  <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">소유도굴</td>
				  <td bgcolor="eaeaea" class="table_bl_left">${use_owner_Group}</td>
				  <td align="center" bgcolor="e5eff8" class="sub_table_b">세입구분</td>
				  <td bgcolor="eaeaea" class="table_bl_left">${board.TAX_SET_NAME}</td>
				</tr>
				<tr>
				  <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">점용기간</td>
				  <td bgcolor="eaeaea" class="table_bl_left">
				  	<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
					        <tr>
								<td>
									<fmt:parseDate value="${board.MUL_FROMDATE}" var="dateFmt" pattern="yyyymmdd"/>					
									<fmt:formatDate value="${dateFmt}" pattern="yyyy-mm-dd"/>
									 ~ 
									<fmt:parseDate value="${board.MUL_TODATE}" var="dateFmt" pattern="yyyymmdd"/>					
									<fmt:formatDate value="${dateFmt}" pattern="yyyy-mm-dd"/>
								</td>
							</tr>
				  </table></td>
				  <td align="center" bgcolor="e5eff8" class="sub_table_b">점용면적</td>
				  <td bgcolor="eaeaea" class="table_bl_left">${board.AREA_SIZE} ㎡ </td>
	  			</tr>
				<tr>
				  <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">점용목적</td>
				  <td colspan="3" bgcolor="F6F6F6" class="">
				  	<table width="100%" border="0" cellpadding="0" cellspacing="0" class="">
						<iframe id="IFRM_PurposeCode" align="absmiddle" scrolling="no" frameborder="0" framespacing="0" width="100%" height="22" src="/jsp/common/purposeCode/purposeCode_view.jsp?SectionCode=${board.TYPE}&PURPOSE_CD=${board.PURPOSE_CD}"></iframe>
				  	</table>
				  	</td>
			    </tr>
			</table>
		</td>
	</tr>
</table>

</form>


</body>
</html>