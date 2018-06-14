<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR" %>
<%@ include file="/jsp/common/include.jsp"%>
<%@ include file="/jsp/common/loginCheck.jsp" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=euc-kr" />
<title>::::: ����� ������������ý��� :::::</title>
<style type="text/css">
<!--
body {
	margin: 0px;
	background-image: url(/img/left_back.gif);
}
-->
</style>
<link href="/css/roads.css" rel="stylesheet" type="text/css">
</head>

<script language="javascript" src="/js/common.js"></script> 
<script type="text/javascript">
//<![CDATA[
	           
	function  reSearch()
	{
		var w = document.listForm;
		
		w.action = "/admin/commCode/officeCode.do";	
		w.submit();	
	}
	
	function  fn_detailInfo(cd,nm)
	{
		document.getElementById("code").value = cd;	
		document.getElementById("codeName").value = nm;	
	}
	
	function  fn_modifyInfo()
	{	
		var w = document.listForm;
		
		document.getElementById("modeType").value = "edit";	
		w.action = "/admin/commCode/modifyGradeCode.do";	
		w.submit();	
	}
	
	function  fn_deleteInfo()
	{	
		if(!confirm("�����Ͻðڽ��ϱ�?"))
			return;
		
		var w = document.listForm;
		w.action = "/admin/commCode/deleteGradeCode.do";
		w.submit();	
	}
	
	//���ڸ� �Է�
	function onlyNumberInput()
	{	
		var code = window.event.keyCode;
	
	 	if ((code > 34 && code < 41) || (code > 47 && code < 58) || (code > 95 && code < 106) || code == 8 || code == 9 || code == 13 || code == 46)
	 	{
		  	window.event.returnValue = true;
			return;
	 	}else {	 
	 		window.event.returnValue = false;
	 		return;
 	 	}
	}

	/*
	 *	���հ˻� key down function (����Ű�� �ԷµǸ� �˻��Լ� ȣ��)
	 */
	function checkKeySearch()
	{
		if(event.keyCode == KEY_ENTER)
			reSearch();
	}

	function officeDetailPop(office_nm,jijum_nm,office_cd,jijum_cd)
	{	
        var param1 = "/admin/commCode/insertOfficeCode.do?mode=modify&office_nm="+office_nm+"&jijum_nm="+jijum_nm+"&office_cd="+office_cd+"&jijum_cd="+jijum_cd;
		var wWidth = 320;
		var wHeight = 260;
	    var winPosLeft = 'left='+(screen.width - wWidth) / 2;
  		var winPosTop = 'top='+(screen.height - wHeight) / 2;
  		var param2 = "resizable=no, status=no, scrollbars=no, toolbar=no, menubar=no, "+winPosLeft+","+ winPosTop+", width="+wWidth+", height="+wHeight;
		window.open(param1,'��ü����',param2);	

        
	}

	//��ü ��� �˾�����
	function InsertOfficePop()
	{
		var param1 = "/admin/commCode/insertOfficeCode.do?mode=reg";
		var wWidth = 320;
		var wHeight = 260;
	    var winPosLeft = 'left='+(screen.width - wWidth) / 2;
  		var winPosTop = 'top='+(screen.height - wHeight) / 2;
  		var param2 = "resizable=no, status=no, scrollbars=no, toolbar=no, menubar=no, "+winPosLeft+","+ winPosTop+", width="+wWidth+", height="+wHeight;
		window.open(param1,'��ü�Է�',param2);	
	}
		
//]]>
</script>

<body>
<form name="listForm" method="post">
<input name="modeType" id="modeType" type="hidden" >
<table width="800" border="0" cellpadding="0" cellspacing="0">
	<tr>
		<td height="43"><img src="/img/admin_cont3_title.gif"
			width="800" height="43"></td>
	</tr>
	<tr>
		<td align="center">
		<table width="780" border="0" cellspacing="0" cellpadding="0">
		<tr>
			<td height="1" bgcolor="eaeaea"></td>
		</tr>
		<tr>
			<td height="14"></td>
		</tr>
		</table>

		<table width="780" border="0" cellspacing="0" cellpadding="0">
			<tr>
				<td align="left" height="22" background="/img/tab_line_blue.gif">
				<table border="0" cellspacing="0" cellpadding="0">
					<tr>
						<td width="111"><a href="/admin/commCode/areaCode.do"><img
							src="/img/sub_admin_title4_off.gif" alt="�����ڵ�" width="110"
							height="22" border="0"></a></td>
						<td  width="111"><a href="/admin/commCode/orgCode.do"><img
							src="/img/sub_admin_title5_off.gif" alt="�μ��ڵ�" width="110"
							height="22" border="0"></a></td>
						<td width="111"><a href="/admin/commCode/purposeCode.do"><img
							src="/img/sub_admin_title6_off.gif" alt="��������ڵ�" width="110"
							height="22" border="0"></a></td>
						<td width="111"><a href="/admin/commCode/taxCode.do"><img
							src="/img/sub_admin_title7_off.gif" alt="���������ڵ�" width="110"
							height="22" border="0"></a></td>
						<!--  //********** BEGIN_����_20120315 -->
						<!-- 
						<td width="111"><a href="/jsp/admin/commCode/zipCodeList.jsp"><img
							src="/img/sub_admin_title8_off.gif" alt="�����ȣ�ڵ�" width="110"
							height="22" border="0"></a></td>
						-->
						<td width="111"><a href="/admin/commCode/seal.do"><img
							src="/img/sub_admin_seal_off.gif" alt="���ε��" width="110"							         
							height="22" border="0"></a></td>
						<!--   //********** END_����_20120315 -->
						<td width="111"><a href="/admin/commCode/jojungCode.do"><img
							src="/img/sub_admin_title9_off.gif" alt="�������" width="110"
							height="22" border="0"></a></td>
						<td width="111"><a href="/admin/commCode/gradeCode.do"><img
							src="/img/sub_admin_title12_off.gif" alt="����ڵ�" width="110"
							height="22" border="0"></a></td>
						<td width="111"><a href="#"><img
							src="/img/sub_admin_title13_on.gif" alt="��ü�ڵ�" width="110"
							height="22" border="0"></a></td>							
					</tr>
				</table>
				</td>
			</tr>
			<tr>
				<td align="left" class="contborder_blue">
										<table width="100%" border="0" cellspacing="0" cellpadding="0">
							<tr>
								<td>
								
								<table width="100%" border="1" bordercolor="#c9dfed"
									style="border-collapse:collapse;" cellpadding="0"
									cellspacing="0" class="sub_table">
									<tr>
										<td height="26" align="center" bgcolor="e5eff8"
											class="sub_table_b">��ü��</td>
										<td bgcolor="eaeaea" class="table_bl_left">
											<input name="searchOfficeName" type="text" class="input_form1" style="width:730px" value="${searchOfficeName}" onkeyup="javascript: if(event.keyCode == 13){reSearch();}">
										</td>
										<td align="left" class="table_bl_left"><img
									src="/img/search_icon.gif" alt="�˻�" width="56" height="16"
									border="0" onClick="javascript:reSearch();" style="cursor:pointer"></td>
									</tr>
								</table>

								</td>
							</tr>
							<tr>
								
							</tr>

						</table>
								<table width="100%" border="0" cellspacing="0" cellpadding="0">
							<tr>
								<td height="40">
								<table border="0" cellspacing="0" cellpadding="0"
									class="sub_stan">
									<tr>
										<td><img src="/img/add_icon.gif"
											alt="�ű�" width="56" height="18" border="0" onClick="javascript:InsertOfficePop();" style="cursor:pointer">
										</td>										   
									    <td width="100%" height="34" class="sub_stan" align="right">��ü�Ǽ� : <span class="sub_stan_blue">${totalCount}</span> �� 
									    </td>
									</tr>
								</table>
								</td>
							</tr>
							<tr>
								<td>
								<table width="100%" border="1" bordercolor="#c9dfed"
									style="border-collapse:collapse;" cellpadding="0"
									cellspacing="0" class="sub_table">
									<tr>
										<td height="28" align="center" bgcolor="e5eff8"	class="sub_table_b">��ȣ</td>
										<td align="center" bgcolor="e5eff8" class="sub_table_b">��ü��</td>
										<td align="center" bgcolor="e5eff8" class="sub_table_b">��ü�ڵ�</td>
										<td align="center" bgcolor="e5eff8" class="sub_table_b">������</td>
										<td align="center" bgcolor="e5eff8" class="sub_table_b">�����ڵ�</td>
										<td align="center" bgcolor="e5eff8" class="sub_table_b">���ڵ�</td>
									</tr>

									<c:forEach items="${blist}" var="board" varStatus="idx">
										<tr onMouseOver="this.style.backgroundColor='#f6f7f8'"
											onMouseOut="this.style.backgroundColor=''">

											<td align="center" onClick="officeDetailPop('${board.OFFICE_NM}','${board.JIJUM_NM}','${board.OFFICE_CD}','${board.JIJUM_CD}');" style="cursor:pointer" height="26">
												<input name="seq${idx.count}" id="seq${idx.count}" value="${board.OFFICE_CD}${board.JIJUM_CD}${board.GU_CD}" type="hidden">
												${board.BOARD_NUM}
											</td>
											<td align="center" onClick="officeDetailPop('${board.OFFICE_NM}','${board.JIJUM_NM}','${board.OFFICE_CD}','${board.JIJUM_CD}');" style="cursor:pointer">
												${board.OFFICE_NM}
											</td>										
											<td align="center" onClick="officeDetailPop('${board.OFFICE_NM}','${board.JIJUM_NM}','${board.OFFICE_CD}','${board.JIJUM_CD}');" style="cursor:pointer">
												${board.OFFICE_CD}
											</td>
											<td align="center" onClick="officeDetailPop('${board.OFFICE_NM}','${board.JIJUM_NM}','${board.OFFICE_CD}','${board.JIJUM_CD}');" style="cursor:pointer">
												${board.JIJUM_NM}
											</td>
											<td align="center" onClick="officeDetailPop('${board.OFFICE_NM}','${board.JIJUM_NM}','${board.OFFICE_CD}','${board.JIJUM_CD}');" style="cursor:pointer">
												${board.JIJUM_CD}
											</td>
											<td align="center" onClick="officeDetailPop('${board.OFFICE_NM}','${board.JIJUM_NM}','${board.OFFICE_CD}','${board.JIJUM_CD}');" style="cursor:pointer">
												${board.GU_CD}
											</td>
										</tr>
									</c:forEach>

								</table>
								</td>
							</tr>
							<tr>
								<td height="40" align="center">
								<table border="0" cellspacing="0" cellpadding="0">
									<tr>
										<!-- ����¡���� -->${strPageDivideForm}<!-- ����¡�� -->	
									</tr>
								</table>
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

