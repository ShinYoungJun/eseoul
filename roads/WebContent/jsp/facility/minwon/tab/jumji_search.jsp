<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ include file="/jsp/common/loginCheck.jsp" %>
<%@ include file="/jsp/common/include.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=euc-kr" />

<title>::::: ����� ������������ý��� :::::</title>
<style type="text/css">

<!--
body {
	margin: 0px;
	background-image: url/img/left_back.gif);
}
-->

</style>
<link href="/css/roads.css" rel="stylesheet" type="text/css">
</head>

<script language="javascript" src="/js/PopupCalendar.js"></script>
<script language='JavaScript' src='/js/Check_inputbox.js'></script>

<script type="text/javascript">
//<![CDATA[

	function	Page(page)
	{
		if(page	==	"")
			return;
		
		var form = document.form;

		form.currentPage.value	= page;

		form.action = "jumji_search.do";
		form.submit();
	}
	
	function	Search()
	{
		var form = document.form;

	//	var	date	= DateCheck();
	//	if(date	== true)
	//		return;
	
		form.currentPage.value	= 1;

		form.action = "jumji_search.do";
		form.submit();
	}
	
	function	Init()
	{
	//	IFRM_PurposeCode.PURPOSE_CD.className	= "essential";
	}
	
//]]>
</script>

<body>
<table width="800" border="0" cellpadding="0" cellspacing="0">
<form name="form" id="form" method="post">
<input type="hidden" name="currentPage" id="currentPage" value="${currentPage}">

      <tr>
        <td align="left"><table width="780" border="0" cellspacing="0" cellpadding="0">
  
          <tr>
            <td class="contborder_blue"><table width="100%" border="0" cellspacing="0" cellpadding="0">
                <tr>
                  <td><table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
				  
				  	<tr>
						<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">������ȣ</td>
						<td bgcolor="eaeaea" class="table_bl_left"><input name="ADMIN_NO" id="ADMIN_NO" type="text" class="input_form1" style="width:120px" value="${ADMIN_NO}"></td>
						<td width="100" align="center" bgcolor="e5eff8" class="sub_table_b">������</td>
						<td bgcolor="eaeaea" class="table_bl_left"><input name="NAME" id="NAME" type="text" class="input_form1" style="width:120px" value="${NAME}"></td>
						<td width="100" align="center" bgcolor="e5eff8" class="sub_table_b">�ֹι�ȣ</td>
						<td bgcolor="eaeaea" class="table_bl_left">
							<input name="SSN1" id="SSN1" type="text" class="input_form1" style="width:40px; ime-mode:disabled" value="${SSN1}" onKeyPress="nr_num_int(this);" onKeyUp="count_check(this, SSN2, 6);" maxlength="6">
							 - <input name="SSN2" id="SSN2" type="text" class="input_form1" style="width:45px; ime-mode:disabled" value="${SSN2}" onKeyPress="nr_num_int(this);" maxlength="7"></td>
				  	</tr>

					<tr>
					  	<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">������ ���� </td>
					  	<td colspan="5" bgcolor="eaeaea" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
						<tr>
						  <td>${SIGUNGU}&nbsp;&nbsp;</td>
	                         <td width="72"><select name="BJ_CD" id="BJ_CD" class="input_form1" style="width:100px">
	                           ${bjdong_code}
	                         </select></td>
	                         <td>&nbsp;<select name="HJ_CD" id="HJ_CD" class="input_form1" style="width:100px">
	                           ${hjdong_code}
	                         </select></td>
	                         <td>&nbsp;/&nbsp;<select name="SAN_CK" id="SAN_CK" class="input_form1" style="width:75px">
	                           ${mul_spc_cd}
	                         </select></td>
						  <td>&nbsp;<input name="BONBUN" id="BONBUN" value="${BONBUN}" type="text" class="input_form1" style="width:40px" style="ime-mode:disabled" onKeyDown="nr_num_int(this);" onKeyUp="nr_num_int(this);" onKeyPress="nr_num_int(this);" maxlength="4">
							- <input name="BUBUN" id="BUBUN" value="${BUBUN}" type="text" class="input_form1" style="width:40px" style="ime-mode:disabled" onKeyDown="nr_num_int(this);" onKeyUp="nr_num_int(this);" onKeyPress="nr_num_int(this);" maxlength="4">
							����</td>
						  </tr>
					  	</table></td>
					</tr>

				</table></td>
				</tr>
				
                <tr>
                  	<td height="32" align="right"><img src="/img/inquiry_icon2.gif" alt="��ȸ" width="56" height="18" border="0" onclick="javascript:Search();" style="CURSOR: Hand;"></td>
                </tr>
                
                <tr>
                  	<td height="1" bgcolor="#EAEAEA"></td>
                </tr>
                <tr>
            		<td height="34" class="sub_stan">��ü�Ǽ� : <span class="sub_stan_blue">${totalcnt}</span> �� </td>
                </tr>
                <tr>
         			<td><table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
            		<tr>
                        <td height="28" align="center" bgcolor="e5eff8" class="sub_table_b">��ȣ</td>
                        <td align="center" bgcolor="e5eff8" class="sub_table_b">��ü��ȣ</td>
                        <td align="center" bgcolor="e5eff8" class="sub_table_b">������</td>
                        <td align="center" bgcolor="e5eff8" class="sub_table_b">��������</td>
                        <td align="center" bgcolor="e5eff8" class="sub_table_b">�������</td>
                        <td align="center" bgcolor="e5eff8" class="sub_table_b">�������ּ�</td>
                        <td align="center" bgcolor="e5eff8" class="sub_table_b">���</td>
					</tr>

					<c:choose>
						<c:when test="${blist!= null && !empty blist}">
		                      <c:forEach items="${blist}" var="board" varStatus="idx">
			                     <tr onMouseOver="this.style.backgroundColor='#f6f7f8'" onMouseOut="this.style.backgroundColor=''">
			                     	<td height="26" align="center">${board.RN}</td>
		        					<td align="center"><script>var adminno = nr_Adminno_Cut("${board.ADMIN_NO}"); document.write(adminno);</script></td>
		        					<td align="center">${board.NAME}</td>
		        					<td align="center">${board.TYPE}</td>
		        					<td align="center">${board.PURPOSE_CD}</td>
		        					<td align="center">${board.BJ_CD}(${board.HJ_CD}) ${board.BONBUN}${board.BUBUN} ${board.TONG}${board.BAN}</td>
		        					<td align="center"><img src="/img/mod_icon3.gif" alt="��ȸ" border="0" onclick="javaScript:Search();" style="CURSOR:Hand;"></td>
			                     </tr>
							 </c:forEach>
						</c:when>
						<c:otherwise>
							<tr>
								<td align="center" class="sub_table" colspan="7" height="85">�˻��� ������ �����ϴ�</td>
							</tr>
						</c:otherwise>
					 </c:choose>
					 
					 </table>
					 </td>
                </tr>

                <tr>
                  <td height="30" align="center"><table border="0" cellspacing="0" cellpadding="0">
                      <tr>
						${pageing}
                      </tr>
                  </table></td>
                </tr>
                
				</table></td>
			</tr>

		</table></td>
	</tr>

</form>
</table>

</body>
</html>