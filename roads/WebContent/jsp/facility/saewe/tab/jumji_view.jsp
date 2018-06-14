<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ include file="/jsp/common/loginCheck.jsp" %>
<%@ include file="/jsp/common/include.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=euc-kr" />

<title>::::: ����� ������������ý��� :::::</title>
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

	function	Init_UseType(sel)
	{
		document.getElementById("UseType1").style.display = "none";
		document.getElementById("UseType2").style.display = "none";
		
		if(sel == '2' || sel == '3')
			document.getElementById("UseType2").style.display = "block";	//	��õ, ����
		else						
			document.getElementById("UseType1").style.display = "block";	//	����	
	}

	function	Init_UseSection(sel)
	{
		if(sel == '1')
			document.getElementById("UseSection").style.display = "block";	//	����
		else
			document.getElementById("UseSection").style.display = "none";
	}

	function 	Init()
	{
		parent.TabUp_Img("jumji");

		//IFRM_PurposeCode.PURPOSE_CD.className="view";
	}
	
	function choose_place(admin_no, object_no)
	{
		var gu_code= document.getElementById("gu_code").value;
		var corp_cd = document.getElementById("corp_cd").value;
		var request_no= document.getElementById("REQUEST_NO").value;
		var currentPage= document.getElementById("currentPage").value;
		var tax_set= document.getElementById("tax_set").value;

//		alert(	"gu_code = " + gu_code + "\n" + 
//				"corp_cd = " + corp_cd + "\n" + 
//				"REQUEST_NO = " + request_no + "\n" + 
//				"currentPage = " + currentPage + "\n");
		
 		location.href="/facility/saewe/jumji_view.do?GU_CODE="+gu_code+"&CORP_CD="+corp_cd+"&REQUEST_NO="+request_no+"&currentPage="+currentPage+"&object_no="+object_no+"&ADMIN_NO="+admin_no+"&TAX_SET="+tax_set;
	}

    
	function	Page(page)
	{
		if(page	==	"")
			return;
		
		var form = document.form;

		form.action = "jumji_view.do?currentPage=" + page;
		form.submit();
	}
	
//]]>
</script>

<!-- body onload="Init(); Init_UseType('${board.TYPE}'); Init_UseSection('${board.SECTION}');" -->
<body onload="Init();">
<table width="780" border="0" cellpadding="0" cellspacing="0">
<form name="form" id="form" method="post">
<input type="hidden" name="ADMIN_NO" id="ADMIN_NO" value="${ADMIN_NO}">
<input type="hidden" name="currentPage" id="currentPage" value="${currentPage}">
<input type="hidden" name="CORP_CD" id="CORP_CD" value="${CORP_CD}">
<input type="hidden" name="GU_CODE" id="GU_CODE" value="${GU_CODE}">
<input type="hidden" name="REQUEST_NO" id="REQUEST_NO" value="${REQUEST_NO}">
<input type="hidden" name="object_no" id="object_no" value="${object_no}">
<input type="hidden" name="choose_no" id="choose_no" value="${choose_no}">
<input type="hidden" name="tax_set" id="tax_set" value="${tax_set}">

	<tr>
		<td align="left" class="contborder_blue">
		
		<table width="100%" border="0" cellspacing="0" cellpadding="0">

	        <tr>
				<td height="34" class="sub_stan">��ü�Ǽ� : <span class="sub_stan_blue">${totalcnt}</span> �� </td>
	        </tr>
			<tr>
				<td>
					<table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
						<tr>
					        <td height="28" align="center" bgcolor="e5eff8" class="sub_table_b" width="5%" nowrap="nowrap">��ȣ</td>
					        <td align="center" bgcolor="e5eff8" class="sub_table_b" width="40%" nowrap="nowrap">�������(�ڵ�)</td>
					        <td align="center" bgcolor="e5eff8" class="sub_table_b" width="5%" nowrap="nowrap">����</td>
			    	        <td align="center" bgcolor="e5eff8" class="sub_table_b" width="30%" nowrap="nowrap">����Ⱓ</td>
					        <td align="center" bgcolor="e5eff8" class="sub_table_b" width="20%" nowrap="nowrap">���Ա���</td>
						</tr>
			      
						<c:choose>
							<c:when test="${blist!= null && !empty blist}">
			                      <c:forEach items="${blist}" var="board" varStatus="idx">
				                      <tr onClick="javascript:choose_place('${board.ADMIN_NO}','${board.OBJECT_NO}');" onMouseOver=this.style.backgroundColor='#f6f7f8' onMouseOut=this.style.backgroundColor='' style='CURSOR: Hand;'>
										<td height='26' align='center'>${board.RN}</td>
										<td align='center'>${board.PURPOSE_NM}</td>
										<td align='center'>${board.QUANTITY}</td>
										<td align='center'>${board.MUL_FROMDATE} ~ ${board.MUL_TODATE}</td>
										<td align='center'>${board.TAX_SET_NM}</td>
									  </tr>
								 </c:forEach>
							</c:when>
							<c:otherwise>
								<tr>
									<td align="center" class="sub_table" colspan="11" height="26">�˻��� ������ �����ϴ�</td>
								</tr>
							</c:otherwise>
						 </c:choose>
					</table>
					
				</td>
			</tr>
			<tr>
			  <td height="30" align="center">
				  <table border="0" cellspacing="0" cellpadding="0">
					<tr>
						${pageing}
					</tr>
				  </table>
			  </td>
			</tr>			
			
			<tr>
				<td>
				<table width="100%" border="0" cellspacing="0" cellpadding="0">
				  <tr>
					<td><table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
						<tr>
						  <td width="100" height="25" align="center" bgcolor="e5eff8" class="sub_table_b" nowrap="nowrap">��������</td>
						  <td width="37%" bgcolor="eaeaea" class="table_bl_left" nowrap="nowrap">${use_type}</td>
						  <td width="100" align="center" bgcolor="e5eff8" class="sub_table_b" nowrap="nowrap">���뱸��</td>
						  <td width="36%" bgcolor="eaeaea" class="table_bl_left" nowrap="nowrap">${section_nm}</td>
						</tr>
						<tr>
						  <td height="25" align="center" bgcolor="e5eff8" class="sub_table_b">������</td>
						  <td bgcolor="eaeaea" class="table_bl_left">${owner_nm}</td>
						  <td align="center" bgcolor="e5eff8" class="sub_table_b">���Ա���</td>
						  <td bgcolor="eaeaea" class="table_bl_left">${tax_set_nm}</td>
						</tr>
						<tr>
						  <td height="25" align="center" bgcolor="e5eff8" class="sub_table_b">�������</td>
						  <td bgcolor="eaeaea" class="table_bl_left" colspan="3"> ${purpose_nm}</td>
						</tr>
						<tr>
							<td height="25" align="center" bgcolor="e5eff8" class="sub_table_b">�󼼽ü���</td>
							<td bgcolor="eaeaea" class="table_bl_left">${purposesebu_nm}</td>             
							<td align="center" bgcolor="e5eff8" class="sub_table_b">�԰�</td>
							<td bgcolor="eaeaea" class="table_bl_left">${standard}</td>
						</tr>
						<tr>
							<td height="25" align="center" bgcolor="e5eff8" class="sub_table_b">����(����)</td>
							<td bgcolor="eaeaea" class="table_bl_left">${quantity}</td>
							<td align="center" bgcolor="e5eff8" class="sub_table_b">�ɵ�(��������)</td>
							<td bgcolor="eaeaea" class="table_bl_left">${depth_ck}</td>
						</tr>
						<tr>
						  <td height="25" align="center" bgcolor="e5eff8" class="sub_table_b">����Ⱓ</td>
						  <td colspan="3" bgcolor="eaeaea" class="table_bl_left">
						  	${mul_fromdate} ~ ${mul_todate}
						  </td>
						</tr>
					    <tr>
						  <td height="34" colspan="4" align="left" bgcolor="#FFFFFF" class=""><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
							<tr>
							  <td><span class="sub_stan_blue">* �ü��� �ּ�</span></td>
							</tr>
						  </table></td>
					    </tr>
					    <tr>
						  <td height="25" align="center" bgcolor="e5eff8" class="sub_table_b">�ּ�</td>
						  <td colspan="3" bgcolor="eaeaea" class="table_bl_left">(��) ${sisul_post}&nbsp;&nbsp;${sisul_addr1}&nbsp;${sisul_addr2}</td>
					    </tr>
					    <tr>
						  <td height="34" colspan="4" align="left" bgcolor="#FFFFFF" class=""><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
							<tr>
							  <td><span class="sub_stan_blue">* ����(����) ����</span></td>
							</tr>
						  </table></td>
					    </tr>
					    <tr>
							<td height="25" align="center" bgcolor="e5eff8" class="sub_table_b">����Ⱓ </td>
							<td bgcolor="eaeaea" class="table_bl_left">
						  		${work_fromdate} 
						  		<c:choose>
									<c:when test="${work_fromdate != null && work_fromdate != ''}">
						  			~ 
						  			</c:when>
						  		</c:choose>
						  		${work_fromdate}
						  	</td>
						   	<td align="center" bgcolor="e5eff8" class="sub_table_b">�ذ������ </td>
						  	<td bgcolor="eaeaea" class="table_bl_left">${completion_date}</td>
					    </tr>
						<tr>
						  <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">���系��</td>
						  <td colspan="3" bgcolor="eaeaea" class="table_bl_left">${exe_info}</td>
					    </tr>
					</table>
					</td>
				  </tr>
	</table>
</body>
</html>