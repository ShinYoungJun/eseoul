<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ include file="/jsp/common/loginCheck.jsp"%>
<%@ include file="/jsp/common/include.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=euc-kr" />

<title>::::: ����� ������������ý��� :::::</title>
<style type="text/css">
<!--
body {
	margin: 0px;
	background-image: url/ img/ left_back.gif );
}
-->
</style>
<link href="/css/roads.css" rel="stylesheet" type="text/css">
</head>

<script language="javascript" src="/js/PopupCalendar.js"></script>
<script language='JavaScript' src='/js/Check_inputbox.js'></script>
<script language='JavaScript' src='/jsp/rojum/sugeo/tab/sugeo_register.js'></script>

<script type="text/javascript">
//<![CDATA[
    //select�� option�� ���õ� ������ ����
	function setSelectedOption(obj, val){
		for(i = 0 ; i < obj.options.length ; i++){
			if(obj.options[i].value == val){
				obj.options[i].selected = true;
				return;
			}
		}
	}

    
	function InitPage()
	{
		var obj = document.form.message.value;
		
		if(obj != "")	
			alert(obj);
			return;
	}
	
			
	// ����ȭ�� �̵�
	function goModify(mul_no)
	{
		var form = document.form;
		form.action = "sugeo_modify_view.do?mul_no="+mul_no;
		form.submit();
	}
//]]>
</script>

<body onload="InitPage();">
<form name="form" method="post">
	<input type="hidden" name="mul_no" value="${mul_no}">
	<input type="hidden" name="currentPage" value="${currentPage}">
	<input type="hidden" name="message" value="${message }">

<table width="800" border="0" cellpadding="0" cellspacing="0">
	<tr>
		<td align="left">
		<table width="780" border="0" cellspacing="0" cellpadding="0">
			<tr>
				<td height="22" background="/img/tab_line_purple.gif">
				<table border="0" cellspacing="0" cellpadding="0">
					<tr>
						<td width="111">
							<a>
								<img src="/img/sugeo_on.gif" alt="��������" width="110" height="22" border="0" onclick="Init();" style="CURSOR: Hand;">
							</a>
						</td>
					</tr>
				</table>
				</td>
			</tr>

			<tr>
				<td align="left" class="contborder_purple">
					<table width="100%" border="0" cellspacing="0" cellpadding="0">
					<tr>
						<td>
						<table width="100%" border="1" bordercolor="#c9dfed"
							style="border-collapse: collapse;" cellpadding="0"
							cellspacing="0" class="sub_table">

							<tr>
								<td height="30" colspan="4" align="left" bgcolor="#FFFFFF" class="">
								<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
									<tr>
										<td><span class="sub_stan_blue">&nbsp; * �������</span></td>
									</tr>
								</table>
								</td>
							</tr>

							<tr>
								<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">�Ҽ�</td>
								<td width="250" bgcolor="eaeaea" class="table_bl_left">
								${sugeo.CHG_ORG}</td>
								<td width="100" height="26" align="center" bgcolor="e5eff8"	class="sub_table_b">����/����</td>
								<td width="250" bgcolor="eaeaea" class="table_bl_left">
								${sugeo.CHG_NM}</td>
							</tr>

							<tr>
								<td height="30" colspan="4" align="left" bgcolor="#FFFFFF" class="">
								<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
									<tr>
										<td><span class="sub_stan_blue">&nbsp; * ��������</span></td>
									</tr>
								</table>
								</td>
							</tr>
							<tr>
								<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">���Ա���</td>
								<td bgcolor="eaeaea" class="table_bl_left" colspan="3">
								<c:choose>
									<c:when test="${sugeo.TAX_SET == '10'}">
									�ü�
									</c:when>
									<c:when test="${sugeo.TAX_SET == '50'}">
									����
									</c:when>
								</c:choose>
								</td>
							</tr>
							<tr>
								<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">�����Ͻ�</td>
								<td bgcolor="eaeaea" class="table_bl_left">
								<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
									<tr>
										<td>${sugeo.REM_DATE}</td>
										<td></td>
										<td>&nbsp;&nbsp;&nbsp;${sugeo.REM_DATE_HH}��</td>
										<td>&nbsp;&nbsp;${sugeo.REM_DATE_MM}��</td>
									</tr>
								</table>
								</td>
								<td align="center" bgcolor="e5eff8" class="sub_table_b">���Ź�ǰ</td>
								<td bgcolor="eaeaea" class="table_bl_left">
									${sugeo.REM_MULCD_NM}&nbsp; ${sugeo.REM_MULNM}</td>
							</tr>
							<tr>
								<td height="26" align="center" bgcolor="e5eff8"
									class="sub_table_b">������ġ</td>
								<td bgcolor="eaeaea" class="table_bl_left" colspan="3">
								${sugeo.REM_ADDR}
								(${sugeo.HJ_NM})</td>
							</tr>
							<tr>
								<td  height="26"  align="center" bgcolor="e5eff8" class="sub_table_b">�ֺ�����</td>
								<td bgcolor="eaeaea" class="table_bl_left">
								${sugeo.REM_ADDR_INFO}</td>
								<td align="center" bgcolor="e5eff8" class="sub_table_b">�������</td>
								<td bgcolor="eaeaea" class="table_bl_left">
								${sugeo.REM_AREA} ��</td>
							</tr>
							<tr>
								<td height="26" align="center" bgcolor="e5eff8"
									class="sub_table_b">�����Ⱓ</td>
								<td bgcolor="eaeaea" class="table_bl_left">
								<table border="0" cellpadding="0" cellspacing="0"
									class="sub_stan">
									<tr>
										<td>${sugeo.REM_SVFROM}</td>
										<td>&nbsp;~&nbsp;</td>
										<td>${sugeo.REM_SVTO}</td>
										<td></td>
										<td><span id="rem_sv_date"></span></td>
									</tr>
								</table>
								</td>
								<td align="center" bgcolor="e5eff8" class="sub_table_b">�������</td>
								<td bgcolor="eaeaea" class="table_bl_left">
								${sugeo.REM_SVPLACE}</td>
							</tr>
							<tr>
								<td height="26" align="center" bgcolor="e5eff8"
									class="sub_table_b">������ ��������</td>
								<td bgcolor="eaeaea" class="table_bl_left">
									<c:choose>
										<c:when test="${sugeo.REM_BAD_YN == '0'}">
					                    	�̴��
					                    </c:when>
										<c:otherwise>
											���
										</c:otherwise>
									</c:choose>
								</td>

								<td align="center" bgcolor="e5eff8" class="sub_table_b">������ ����</td>
								<td bgcolor="eaeaea" class="table_bl_left">
								${sugeo.REM_BAD_BIGO}</td>
							</tr>


							<tr>
								<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">Ư�̻���</td>
								<td colspan="3" bgcolor="eaeaea" class="table_bl_left">
									${sugeo.REM_BIGO}
								</td>
							</tr>
							<tr>
								<td height="30" colspan="4" align="left" bgcolor="#FFFFFF" class="">
								<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
									<tr>
										<td><span class="sub_stan_blue">&nbsp; * ����������</span></td>
									</tr>
								</table>
								</td>
							</tr>

							<tr>
								<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">�����ڸ�</td>
								<td bgcolor="eaeaea" class="table_bl_left">
									${sugeo.REM_OWNER_NM}
								</td>
								<td align="center" bgcolor="e5eff8" class="sub_table_b">�ֹι�ȣ</td>
								<td bgcolor="eaeaea" class="table_bl_left">
									${sugeo.REM_OWNER_SSN}
								</td>
							</tr>

							<tr>
								<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">�����ȣ</td>
								<td bgcolor="eaeaea" class="table_bl_left">
									${sugeo.REM_OWNER_ZIP}
								</td>
								<td align="center" bgcolor="e5eff8" class="sub_table_b">�ּ�</td>
								<td bgcolor="eaeaea" class="table_bl_left">
									${sugeo.REM_OWNER_ADDR1}
									&nbsp;
									${sugeo.REM_OWNER_ADDR2}
								</td>
							</tr>

							<tr>
								<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">��ȭ��ȣ</td>
								<td bgcolor="eaeaea" class="table_bl_left">
									${sugeo.REM_OWNER_TEL}
								</td>
								<td align="center" bgcolor="e5eff8" class="sub_table_b">�ڵ�����ȣ</td>
								<td bgcolor="eaeaea" class="table_bl_left">
									${sugeo.REM_OWNER_HP}
								</td>
							</tr>
						</table>
						</td>
					</tr>
					<tr>
						<td height="40" align="right">
							<img src="/img/mod_icon.gif" alt="���� " border="0" onclick="javascript:goModify('${sugeo.MUL_NO}');" style="cursor:pointer" >
						</td>
					</tr>
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
