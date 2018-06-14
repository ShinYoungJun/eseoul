<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
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
           
    //��ȸ       
	function reSearch()
	{	
		var w = document.listForm;
		
		w.deptCode.value = result.listForm.deptCode.value; 
		w.action = "/admin/user/user.do";		
		w.submit();			
	}
	
	//��������� ��� �˾�����
	function userEditPop()
	{
	    var winPosLeft = 'left='+(screen.width - 520) / 2; // ��â x ��ǥ 
  		var winPosTop = 'top='+(screen.height - 500 - 100) / 2; // ��â y ��ǥ 
  		var param = "resizable=no, status=no, scrollbars=no, toolbar=no, menubar=no, "+winPosLeft+","+ winPosTop+", width=520, height=600";

		window.open("/admin/user/userReg.do?input_type=pass&guCheck=1","������1",param );	
	}
	
	//��������� ���� �˾�����
	function userDetailPop(obj)
	{	
		var param = "/admin/user/userDetail.do?userId="+obj+"&input_type=pass&adId="+"<%=userId%>";
	    var winPosLeft = 'left='+(screen.width - 520) / 2; // ��â x ��ǥ 
  		var winPosTop = 'top='+(screen.height - 500 - 100) / 2; // ��â y ��ǥ 
  		var param1 = "resizable=no, status=no, scrollbars=no, toolbar=no, menubar=no, "+winPosLeft+","+ winPosTop+", width=520, height=600";
		
		window.open( param, "������2", param1);	
	}
	
	//��޺� �޴�����ڱ��� �˾�����
	function userAuthorityPop(obj)
	{	
		var w = document.listForm;	
		var rowCount = document.getElementById("listSize").value;				
		var check_count = 0;
		
		for(i=1; i<= rowCount; i++)	{	
			if(document.getElementById("checkbox"+i).checked) { 	
			 	check_count++;
			 }
		}
		if(check_count==0){
			alert("����ڸ� üũ�� ����� �ּ���.");
			return;
		}
		if(check_count>1){
			alert("������ üũ�� �ϳ��� �����մϴ�.");
			return;
		}
		for(i=1; i<= rowCount; i++)
		{	
			if(document.getElementById("checkbox"+i).checked)
			 { 	
			  	document.getElementById("deleteSeq").value = document.getElementById("seq"+i).value;	
			  	document.getElementById("user_grade").value = document.getElementById("grade"+i).value;	
				
			}			
		}
		
		
		
		//var param = "/jsp/admin/user/userAuthorityPop.jsp";
		var param = "/admin/user/userAuthority.do?user_id="+document.getElementById("deleteSeq").value+"&userGrade="+document.getElementById("user_grade").value;
		window.open( param, "������3", "resizable=no, status=no, scrollbars=no, toolbar=no, menubar=no, width=280, height=400");	
	}	
	
	//�����
	function deleteRow()
	{	
		var w = document.listForm;	
		var rowCount = document.getElementById("listSize").value;
		
		if(!confirm("�����Ͻðڽ��ϱ�?"))
			return;
		 
		for(i=1; i<= rowCount; i++)
		{	
			if(document.getElementById("checkbox"+i).checked)
			 { 	
			  	document.getElementById("deleteSeq").value = document.getElementById("seq"+i).value;	
				w.action = "/admin/user/userDel.do";	
				w.submit();
			}			
		}
	}
	
	//����
	function fn_confirm()
	{	
		var w = document.listForm;	
		var rowCount = document.getElementById("listSize").value;
		
		if(!confirm("�����Ͻðڽ��ϱ�?"))
			return;
			
		w.modeType.value = "confirm";	 
		for(i=1; i<= rowCount; i++)
		{	
			if(document.getElementById("checkbox"+i).checked)
			 { 	
			  	document.getElementById("deleteSeq").value = document.getElementById("seq"+i).value;	
				w.action = "/admin/user/confirm.do";	
				w.submit();
			}			
		}
	}
	
	//���ڵ� ��ȸ
	function guCodeList()
	{	
		var w = document.listForm;
		w.action = "/admin/user/guCode.do";		
	}	
	
	//���ڵ� ����� �μ��ڵ�list ��ȸ
	function fn_guChange()
	{
		var sigucd = document.listForm.siguCode.value;			
		result.getDeptCode(sigucd,"list");  
	}
	
	//��ü����
	function fn_allSelect()	
	{
		var w = document.listForm;	
		var rowCount = document.getElementById("listSize").value;
		
		if (w.allCheck.checked)
		{
			for(i=1; i<= rowCount; i++)
			{	
				document.getElementById("checkbox"+i).checked = true;	
			}	
		}
		else		 
		{
			for(i=1; i<= rowCount; i++)
			{	
				document.getElementById("checkbox"+i).checked = false;					
			}
		}
	}
	
	function test()
	{
		var w = document.listForm;	
		alert("w.test.value="+w.test.value); 
	}
	
	function init()
	{	
		if(document.getElementById("siguCode").value == "")	
			document.getElementById("siguCode").disabled = false;		
		if(document.getElementById("org_cd").value == "0000000"){
			document.getElementById("siguCode").disabled = false;	
		}
		fn_guChange();	
	}
	
//]]>
</script>

<body onload="init();">
<form name="listForm" method="post">
<input name="listSize" id="listSize" value="${listSize}" type="hidden">
<input name="deleteSeq" id="deleteSeq" type="hidden">
<input name="modeType" type="hidden" value="del">
<input name="deptCode" id="deptCode" value="${deptCode}" type="hidden">
<input name="org_cd" id="org_cd" value="${org_cd}" type="hidden">
<input name="user_grade" id="user_grade" type="hidden">

<table width="800" border="0" cellpadding="0" cellspacing="0">
	<tr>
		<td height="43"><img src="/img/admin_cont1_title.gif" width="800"
			height="43"></td>
	</tr>
	<tr>
		<td align="center">
		<table width="780" border="0" cellspacing="0" cellpadding="0">
	<!-- 		<tr>
				<td height="40" align="right">
				<table border="0" cellspacing="0" cellpadding="0">
					<tr>
						<td height="8"></td>
					</tr>
					<tr>
						<td><a href="#"><img src="/img/help_icon.gif" alt="����"
							width="65" height="18" border="0"></a></td>
					</tr>
				</table>
				</td>
			</tr>
	 -->		
			<tr>
				<td height="1" bgcolor="eaeaea"></td>
			</tr>
			<tr>
				<td height="14"></td>
			</tr>
			<tr>
				<td>
				<table width="780" border="0" cellspacing="0" cellpadding="0">
					<tr>
						<td align="left" height="22" background="/img/tab_line_blue.gif">
						<table border="0" cellspacing="0" cellpadding="0">
							<tr>
								<td><img src="/img/sub_admin_title1.gif" width="110"
									height="22"></td>
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
										<td width="15%" height="28" align="center" bgcolor="e5eff8"
											class="sub_table_b">����� ���</td>
										<td bgcolor="eaeaea" class="table_bl_left"><select
											name="userGrade" class="input_form1"
											style="width:140px"> ${userGrade}
										</select></td>
										<td width="15%" align="center" bgcolor="e5eff8"
											class="sub_table_b">����� �Ҽ�</td>
										<td width="10%" bgcolor="eaeaea" class="table_bl_left"><select
											name="siguCode" id="siguCode" class="input_form1"
											style="width:100px" onchange="fn_guChange();" disabled>
											<option value="">�������</option>
											
											<c:forEach items="${guCdList}" var="list">
												<option value="${list.GU_CD}">${list.GU_NM}</option>
											</c:forEach>		
											</select> 
										<td bgcolor="eaeaea" class="table_bl_left">	
											<iframe height="20" width="100" name="result" src="/admin/user/deptCode.do" frameborder="0" scrolling="no" marginwidth="0" marginheight="0">
											</iframe>
											</td>
										
									</tr>

									<tr>
										<td height="26" align="center" bgcolor="e5eff8"
											class="sub_table_b">�� ��</td>
										<td bgcolor="eaeaea" class="table_bl_left"><input
											name="userName" type="text" class="input_form1"
											style="width:120px" value="${userName}"></td>
										<td align="center" bgcolor="e5eff8" class="sub_table_b">��������</td>
										<td bgcolor="eaeaea" class="table_bl_left" colspan="2"><select
											name="certYN" class="input_form1" style="width:100px">
											<option value="N">������</option>
											<option value="Y">����</option>											
										</select></td>
									</tr>
								</table>

								</td>
							</tr>
							<tr>
								<td height="40" align="right"><img
									src="/img/search_icon.gif" alt="��ȸ" width="56" height="18"
									border="0" onClick="javascript:reSearch();" style="cursor:pointer"></td>
							</tr>

						</table>
						</td>
					</tr>

				</table>
				</td>
			</tr>
			<tr>
				<td height="30"></td>
			</tr>
			<tr>
				<td>
				<table width="780" border="0" cellspacing="0" cellpadding="0">
					<tr>
						<td align="left" height="22" background="/img/tab_line_blue.gif">
						<table border="0" cellspacing="0" cellpadding="0">
							<tr>
								<td><img src="/img/sub_admin_title2.gif" width="110"
									height="22"></td>
							</tr>
						</table>
						</td>
					</tr>
					<tr>
						<td align="left" class="contborder_blue">
						<table width="100%" border="0" cellspacing="0" cellpadding="0">
							<tr>
								<td height="40">
								<table border="0" cellspacing="0" cellpadding="0"
									class="sub_stan">
									<tr>
										<td><img src="/img/new_icon.gif"
											alt="�ű�" width="56" height="18" border="0" onClick="javascript:userEditPop();" style="cursor:pointer"></td>
										
										<td><img src="/img/del_icon.gif"
											alt="����" width="34" height="18" border="0" onClick="javascript:deleteRow();" style="cursor:pointer";></td>	
									    <td><img src="/img/confirm.gif"
											alt="����" width="34" height="18" border="0" onClick="javascript:fn_confirm();" style="cursor:pointer";></td>	
									    <td><img src="/img/authority.gif"
											alt="����" width="34" height="18" border="0" onClick="javascript:userAuthorityPop();" style="cursor:pointer";></td>
									    
									    <td width="100%" height="34" class="sub_stan" align="right">��ü�Ǽ� : <span class="sub_stan_blue">${totalCount}</span> �� </td>
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
										<td align="center" bgcolor="e5eff8" class="sub_table_b">
											<input name="allCheck" id="allCheck" type="checkbox" value="checkbox" onclick="fn_allSelect();" >
										</td>
										<td height="28" align="center" bgcolor="e5eff8"
											class="sub_table_b">��ȣ</td>
										<td align="center" bgcolor="e5eff8" class="sub_table_b">����ڵ��</td>
										<td align="center" bgcolor="e5eff8" class="sub_table_b">�Ҽӱ��</td>
										<td align="center" bgcolor="e5eff8" class="sub_table_b">�ҼӺμ�</td>
										<td align="center" bgcolor="e5eff8" class="sub_table_b">�̸�</td>
										<td align="center" bgcolor="e5eff8" class="sub_table_b">���̵�</td>
										<td align="center" bgcolor="e5eff8" class="sub_table_b">ID��û��</td>
										<td align="center" bgcolor="e5eff8" class="sub_table_b">ID������</td>
										<td align="center" bgcolor="e5eff8" class="sub_table_b">����������</td>
									</tr>

									<c:forEach items="${blist}" var="board" varStatus="idx">
										<tr onMouseOver="this.style.backgroundColor='#f6f7f8'"
											onMouseOut="this.style.backgroundColor=''">
											<td align="center" height="26">	
												<input name="checkbox${idx.count}" id="checkbox${idx.count}" type="checkbox" value="checkbox" >
												<input name="seq${idx.count}" id="seq${idx.count}" value="${board.USER_ID}" type="hidden">
												<input name="grade${idx.count}" id="grade${idx.count}" value="${board.SECTION}" type="hidden">
											</td>
											<td align="center" onClick="userDetailPop('${board.USER_ID}');" style="cursor:pointer">${idx.count}</td>
											<td align="center" onClick="userDetailPop('${board.USER_ID}');" style="cursor:pointer">${board.SECTION_NAME}</td>										
											<td align="center" onClick="userDetailPop('${board.USER_ID}');" style="cursor:pointer">${board.GU_NM}</td>
											<td align="center" onClick="userDetailPop('${board.USER_ID}');" style="cursor:pointer">${board.DEPT_NM}</td>
											<td align="center" onClick="userDetailPop('${board.USER_ID}');" style="cursor:pointer">${board.NAME}</td>
											<td align="center" onClick="userDetailPop('${board.USER_ID}');" style="cursor:pointer">${board.USER_ID}</td>
											<td align="center" onClick="userDetailPop('${board.USER_ID}');" style="cursor:pointer">${board.REQUEST_DATE}</td>
											<td align="center" onClick="userDetailPop('${board.USER_ID}');" style="cursor:pointer">${board.APPROVAL_DATE}</td>
											<td align="center" onClick="userDetailPop('${board.USER_ID}');" style="cursor:pointer">${board.LAST_CONN_DATE}</td>
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
			<tr>
				<td height="40" align="right"><a href="#"><img
					src="/img/result_icon.gif" alt="��� ���" width="74" height="22"
					border="0"></a><a href="#"><img src="/img/excel_icon.gif"
					alt="EXCEL ��ȯ" width="94" height="22" border="0"></a></td>
			</tr>

		</table>
		</td>
	</tr>
	<tr>
		<td height="30"></td>
	</tr>
</table>
<script language="javascript">
<!--
	setSelectedOption(document.listForm.userGrade, "${userGrade}");
	setSelectedOption(document.listForm.siguCode, "${siguCode}");
	setSelectedOption(document.listForm.certYN, "${certYN}");
//-->
</script> 
</form>
</body>
</html>

