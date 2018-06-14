<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
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
	background-image: url(/img/left_back.gif);
}
-->
</style>
<link href="/css/roads.css" rel="stylesheet" type="text/css">


<script language="javascript" src="/js/common.js"></script>
<script language="javascript" src="/js/PopupCalendar.js"></script>
<script language="javascript" src="/js/calculation.js"></script>
<script language="javascript" src="/js/selectItem.js"></script>
<script>

	// ����� üũ
	function checkForm(){
		var form1 = document.form1;
		alert(form1.year.value);

		form1.submit();
		//	Ư������ �Է½� �� ���� ����� �ٹٲ��� �־�� ������ ����. ������ �𸣰ڽ�
		//		w.content.value = w.content.value+' '+'\n';	
		
	}

	// �߰��� �̵�
	function goAdd(GAPAN_NO){
	
		var GP_TYP = document.getElementById("GP_TYP").value;
		
		document.form.action = "/gapan/jumyong/violation_register.do?GAPAN_NO="+GAPAN_NO+"&GP_TYP="+GP_TYP+"&mode=add";
		document.form.submit();
	}

	// �������̵�
	function	Page(page)
	{
		if(page	==	"")
			return;
		
		var GAPAN_NO = document.getElementById("GAPAN_NO").value;
		var GP_TYP = document.getElementById("GP_TYP").value;
		
		location.href="/gapan/jumyong/violation_view.do?currentPage="+page+"&GAPAN_NO="+GAPAN_NO+"&GP_TYP="+GP_TYP;
	}

	// �󼼺���
	function goView(seq){
		
		var page = document.form.currentPage.value;
		var GAPAN_NO = document.getElementById("GAPAN_NO").value;
		var GP_TYP = document.getElementById("GP_TYP").value;
		
		location.href="/gapan/jumyong/violation_view.do?currentPage="+page+"&SEQ="+seq+"&GAPAN_NO="+GAPAN_NO+"&GP_TYP="+GP_TYP;
	}

	// �����ϱ�
	function goDel(seq){
		if(!confirm("������ġ������ �����Ͻðڽ��ϱ�?"))
            return;

		var page = document.form.currentPage.value;
		var GAPAN_NO = document.getElementById("GAPAN_NO").value;
		var GP_TYP = document.getElementById("GP_TYP").value;
		
		location.href="/gapan/jumyong/violation_view.do?currentPage="+page+"&SEQ="+seq+"&GAPAN_NO="+GAPAN_NO+"&GP_TYP="+GP_TYP+"&mode=del";
	}
	
	// �����ϱ�
	function goModify(seq){
		document.form.action = "/gapan/jumyong/violation_register.do?SEQ="+seq+"&mode=edit";
		document.form.submit();
	}

	
	function InitPage()
	{	
		var obj = document.form.message.value;
		
		if(obj != "")	
			alert(obj);

		
		var _vioSel = document.getElementsByName('VIO_SEL');
		var _vioActSel = document.getElementsByName('VIO_ActSEL');
		
		var _vioSelArray = ['${violation.VIO_SEL1}',
		                    '${violation.VIO_SEL2}',
		                    '${violation.VIO_SEL3}',
		                    '${violation.VIO_SEL4}',
		                    '${violation.VIO_SEL5}',
		                    '${violation.VIO_SEL6}',
		                    '${violation.VIO_SEL7}'];
		
		var _vioActSelArray = ['${violation.VIO_ACTSEL1}',
		                    '${violation.VIO_ACTSEL2}',
		                    '${violation.VIO_ACTSEL3}',
		                    '${violation.VIO_ACTSEL4}',
		                    '${violation.VIO_ACTSEL5}'];
		
		
		
		
		for(var i = 0;i < _vioSel.length ;i++){
			
			if(_vioSelArray[i] == '1')
				_vioSel[i].checked = true;
		}
		
		for(var i = 0;i < _vioActSel.length ;i++){
			if(_vioActSelArray[i] == '1')
			_vioActSel[i].checked = true;
		}
			
		return;
	}


	function resize_popup(obj)
	{
		if(obj == '1'){
           Message_Display('IMG1_FULL','IMG1_FULLValue',1);
		}else if(obj == '2'){
           Message_Display('IMG2_FULL','IMG2_FULLValue',1);
		}else if(obj == '3'){
           Message_Display('ACTIMG1_FULL','ACTIMG1_FULLValue',1);
		}else if(obj == '4'){
           Message_Display('ACTIMG2_FULL','ACTIMG2_FULLValue',1);
		}
		
	}
	
</script>

</head>

<body onload="InitPage();">

<form id="form" name="form" method="post">
	<input type="hidden" id="GAPAN_NO" name="GAPAN_NO" value="${GAPAN_NO}">
	<input type="hidden" id="GP_TYP" name="GP_TYP" value="001">
	<input type="hidden" id="message" name="message" value="${message}">
	<input type="hidden" id="mode" name="mode" value="${mode}">
	<input type="hidden" id="currentPage" name="currentPage" value="${currentPage }">
	
<div id="IMG1_FULL" style="position: absolute; visibility: hidden;">
	<table border="2" bordercolor="#c9dfed" style="background-color:white;">
		<tr>
			<td height="20px" align="center" bgcolor="e5eff8" class="sub_table_b">�̹����� Ŭ���ϸ� ����</td>
		</tr>
		<tr>
			<td align="center" >
				<img src="${filePath}${violation.VIO_IMG1_NAME}" id="IMG1_FULLValue"  name="IMG1_FULLValue" onclick="Message_Display('IMG1_FULL','IMG1_FULLValue',0);" style="max-height:360px;max-width:480px;cursor:pointer;">
			</td>
		</tr>
	</table>

</div>

<div id="IMG2_FULL" style="position:absolute;visibility:hidden;">
	<table border="2" bordercolor="#c9dfed" style="background-color:white;">
		<tr>
			<td height="20px" align="center" bgcolor="e5eff8" class="sub_table_b">�̹����� Ŭ���ϸ� ����</td>
		</tr>
		<tr>
			<td align="center" >
				<img src="${filePath}${violation.VIO_IMG2_NAME}" id="IMG2_FULLValue"  name="IMG2_FULLValue" onclick="Message_Display('IMG2_FULL','IMG2_FULLValue',0);" style="max-height:360px;max-width:480px;cursor:pointer;">
			</td>
		</tr>
	</table>
</div>

<div id="ACTIMG1_FULL" style="position: absolute; visibility: hidden;">
	<table border="2" bordercolor="#c9dfed" style="background-color:white;">
		<tr>
			<td height="20px" align="center" bgcolor="e5eff8" class="sub_table_b">�̹����� Ŭ���ϸ� ����</td>
		</tr>
		<tr>
			<td align="center" >
				<img src="${filePath}${violation.VIO_ACTIMG1_NAME}" id="ACTIMG1_FULLValue"  name="ACTIMG1_FULLValue" onclick="Message_Display('ACTIMG1_FULL','ACTIMG1_FULLValue',0);" style="max-height:360px;max-width:480px;cursor:pointer;">
			</td>
		</tr>
	</table>

</div>

<div id="ACTIMG2_FULL" style="position:absolute;visibility:hidden;">
	<table border="2" bordercolor="#c9dfed" style="background-color:white;">
		<tr>
			<td height="20px" align="center" bgcolor="e5eff8" class="sub_table_b">�̹����� Ŭ���ϸ� ����</td>
		</tr>
		<tr>
			<td align="center" >
				<img src="${filePath}${violation.VIO_ACTIMG2_NAME}" id="ACTIMG2_FULLValue"  name="ACTIMG2_FULLValue" onclick="Message_Display('ACTIMG2_FULL','ACTIMG2_FULLValue',0);" style="max-height:360px;max-width:480px;cursor:pointer;">
			</td>
		</tr>
	</table>
</div>


<table width="780" border="0" cellspacing="0" cellpadding="0">
	<tr>
		<td class="contborder_purple">
		<table width="100%" border="0" cellspacing="0" cellpadding="0">
			<tr height="36">
				<td>
				<table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse: collapse;" cellpadding="0" cellspacing="0" class="sub_table">
					<tr>
						<td height="26" width="13%" align="center" bgcolor="e5eff8" class="sub_table_b">����Ⱓ</td>
						<td width="32%" bgcolor="eaeaea" class="table_bl_left">
							${rnic:addDash(MUL_FROMDATE)} ~ ${rnic:addDash(MUL_TODATE)}
						</td>
						<td height="26" width="13%" align="center" bgcolor="e5eff8" class="sub_table_b">��������</td>
						<td width="32%" bgcolor="eaeaea" class="table_bl_left">
							${VIO_ACCPOINTS}��
						</td>
					</tr>
				</table>
				</td>
			</tr>
			<tr>
				<td>
				<table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse: collapse;" cellpadding="0" cellspacing="0" class="sub_table">
					<tr>
						<td width="60" height="25" align="center" bgcolor="e5eff8" class="sub_table_b">��ȣ</td>
						<td width="100" align="center" bgcolor="e5eff8" class="sub_table_b">����</td>
						<td width="100" align="center" bgcolor="e5eff8" class="sub_table_b">���˱��</td>
						<td width="100" align="center" bgcolor="e5eff8" class="sub_table_b">��������</td>
						<td align="center" bgcolor="e5eff8" class="sub_table_b">���ݳ���</td>
						<td width="100" align="center" bgcolor="e5eff8" class="sub_table_b">��ġ����</td>
						<td align="center" bgcolor="e5eff8" class="sub_table_b">��ġ����</td>
					</tr>

					<c:choose>
						<c:when test='${list != null && !empty list}'>
							<c:forEach items="${list}" var="vio" varStatus="idx">
								<tr onMouseOver="this.style.backgroundColor='#f6f7f8'" onMouseOut="this.style.backgroundColor=''" onclick="goView('${vio.SEQ}')" style="cursor: pointer">
									<td height="26" align="center">${vio.VIO_DEG}</td>
									<td align="center">${vio.VIO_POINTS}</td>
									<td align="center">${vio.VIO_DEPT}</td>
									<td align="center">${vio.VIO_DATE}</td>
									<td align="center">${vio.VIO_NAME}</td>
									<td align="center">${vio.VIO_ACTDATE}</td>
									<td align="center">${vio.VIO_ACTNAME}</td>
								</tr>
							</c:forEach>
						</c:when>
						<c:otherwise>
							<tr>
								<td align="center" class="sub_table" colspan="7" height="85">������ �����ϴ�</td>
							</tr>
						</c:otherwise>
					</c:choose>

				</table>
				</td>
			</tr>
			<tr>
				<td height="40" align="center">
				<table width="100%" border="0" cellspacing="0" cellpadding="0">
					<tr>
						<td align="center">
						<table border="0" cellpadding="0" cellspacing="0">
							<tr>
								<td>${strPageDivideForm}</td>
							</tr>

						</table>
						</td>
					</tr>
				</table>
				</td>
			</tr>
			<tr>
				<td height="20"></td>
			</tr>

			<c:if test="${ violation != null }">
				<tr>
					<td>
					<table width="100%" border="0" cellpadding="0" cellspacing="0" class="sub_table">
						<tr>
							<td width="10%" height="26" align="left" class="sub_table_b">* ���� �� ��ġ���� ���� ����</td>
						</tr>
					</table>
					</td>
				</tr>
				<tr>
					<td>
					<table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse: collapse;" cellpadding="0" cellspacing="0" class="sub_table">
						<tr>
							<td height="26px" align="left" class="sub_table_b" colspan="4">
							* ���ݻ���
							</td>
						</tr>
						<tr>
							<td width="10%" height="32px" align="center" bgcolor="e5eff8" class="sub_table_b">���˱��</td>
							<td width="35%" bgcolor="eaeaea" class="table_bl_left">${violation.VIO_DEPT}</td>
							<td width="55%" bgcolor="eaeaea" class="table_bl_left" colspan="2" rowspan="3">
							<table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse: collapse;" cellpadding="0" cellspacing="0" class="sub_table">
								<tr>
									<td height="26px" align="center" bgcolor="e5eff8" class="sub_table_b" width="50%" nowrap>���ݻ���1</td>
									<td align="center" bgcolor="e5eff8" class="sub_table_b" width="50%" nowrap>���ݻ���2</td>
								</tr>
								<tr>
									<td height="102px" style="background-position: 50% 50%;">
										<c:if test="${violation.VIO_IMG1_NAME != null }">
											<img src="${filePath }${violation.VIO_IMG1_NAME}" id="img1"  name="img1" onclick="resize_popup('1');" style="cursor:pointer;width:80px;height:102px">
										</c:if>
									</td>
									<td style="background-position: 50% 50%;">
										<c:if test="${violation.VIO_IMG2_NAME != null }">
											<img src="${filePath }${violation.VIO_IMG2_NAME}" id="img1"  name="img1" onclick="resize_popup('2');" style="cursor:pointer;width:80px;height:102px">
										</c:if>
									</td>
								</tr>
							</table>
							</td>
						</tr>
						<tr>
							<td height="32px" align="center" bgcolor="e5eff8" class="sub_table_b">��������</td>
							<td bgcolor="eaeaea" class="table_bl_left">
								${violation.VIO_DATE}
							</td>
						</tr>
						<tr>
							<td height="110px" align="center" bgcolor="e5eff8" class="sub_table_b">���ݳ���</td>
							<td bgcolor="eaeaea" class="table_bl_left">
								<table>
									<tr>
										<td>
											<input type="checkbox" name="VIO_SEL" disabled="disabled">����/����</input>
										</td>                                     
										<td>                                      
											<input type="checkbox" name="VIO_SEL" disabled="disabled">�븮�</input>							
										</td>                                     
										<td>                                      
											<input type="checkbox" name="VIO_SEL" disabled="disabled">�ҹ�����</input>							
										</td>                                     
									</tr>                                         
									<tr>                                          
										<td>                                      
											<input type="checkbox" name="VIO_SEL" disabled="disabled">��������</input>							
										</td>                                     
										<td>                                      
											<input type="checkbox" name="VIO_SEL" disabled="disabled">�ҹ���ġ��</input>
										</td>                                     
										<td>                                      
											<input type="checkbox" name="VIO_SEL" disabled="disabled">�ü����Ѽ�</input>							
										</td>
									</tr>
									<tr>
										<td colspan="3">
											<input type="checkbox" name="VIO_SEL" disabled="disabled">		
												��Ÿ 
												<input type="text" id="VIO_CONTENT" name="VIO_CONTENT" class="input_form1" style="width:190px;background-color:#F6F6F6;" maxlength="100" value='${violation.VIO_CONTENT}' disabled="disabled">
												</input>
											</input>
										</td>
									</tr>
								</table>

							</td>
						</tr>
						<tr>
							<td height="26px" align="left" class="sub_table_b" colspan="4">
								* ��ġ����
							</td>
						</tr>
						<tr>
							<td height="32px" align="center" bgcolor="e5eff8" class="sub_table_b">��ġ����</td>
							<td bgcolor="eaeaea" class="table_bl_left" colspan="1">
								${violation.VIO_ACTDATE}
							</td>
							<td bgcolor="eaeaea" class="table_bl_left" colspan="2" rowspan="3">
								<table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse: collapse;" cellpadding="0" cellspacing="0" class="sub_table">
									<tr>
										<td height="26px" align="center" bgcolor="e5eff8" class="sub_table_b" width="50%" nowrap>��ġ����1</td>
										<td align="center" bgcolor="e5eff8" class="sub_table_b" width="50%" nowrap>��ġ����2</td>
									</tr>
									<tr>
										<td height="102px" style="background-position: 50% 50%;">
											<c:if test="${violation.VIO_ACTIMG1_NAME != null }">
												<img src="${filePath }${violation.VIO_ACTIMG1_NAME }" id="actimg1"  name="actimg1" onclick="resize_popup('3');" style="cursor:pointer;width:80px;height:102px">
											</c:if>
										</td>
										<td style="background-position: 50% 50%;">
											<c:if test="${violation.VIO_ACTIMG2_NAME != null }">
												<img src="${filePath }${violation.VIO_ACTIMG2_NAME }" id="actimg1"  name="actimg1" onclick="resize_popup('4');" style="cursor:pointer;width:80px;height:102px">
											</c:if>
										</td>
									</tr>
								</table>
							</td>
						</tr>
						<tr>
							<td height="110px" align="center" bgcolor="e5eff8" class="sub_table_b">��ġ����</td>
							<td bgcolor="eaeaea" class="table_bl_left">
							<table>
								<tr>
									<td>
										<input type="checkbox" name="VIO_ACTSEL" disabled="disabled">�㰡���</input>
									</td>
									<td>
										<input type="checkbox" name="VIO_ACTSEL" disabled="disabled">�������</input>							
									</td>
									<td>
										<input type="checkbox" name="VIO_ACTSEL" disabled="disabled">���·�ΰ�</input>
									</td>
								</tr>
								<tr>
									<td colspan="3">
										<input type="checkbox" name="VIO_ACTSEL" disabled="disabled">
											�����ΰ�
											<input type="text" id="VIO_POINTS" name="VIO_POINTS" class="input_form1" style="width:30px;text-align:right;background-color:#F6F6F6;" maxlength="20" value="${violation.VIO_POINTS}" onKeyDown="onlyNumberInput();" disabled="disabled">��
											</input>
										</input>
																
									</td>
								</tr>
								<tr>
									<td colspan="3">
										<input type="checkbox" name="VIO_ACTSEL" disabled="disabled">
											��Ÿ
											<input type="text" id="VIO_ACTCONTENT" name="VIO_ACTCONTENT" class="input_form1" style="width:190px;background-color:#F6F6F6;" maxlength="100" value='${violation.VIO_ACTCONTENT}' disabled="disabled">
											</input>
										</input>
									</td>
								</tr>
							</table>
							</td>
						</tr>
					</table>
					</td>
				</tr>
			</c:if>


			<tr>
				<td height="40" align="right"><img src="/img/add_icon.gif" alt="�߰�" width="56" height="18" border="0" onClick="javascript:goAdd('${GAPAN_NO}');" style="cursor: pointer">
				<c:if test="${ violation != null }">
					<img src="/img/mod_icon.gif" alt="����" width="56" height="18" border="0" onClick="javascript:goModify('${violation.SEQ}');" style="cursor: pointer">
					<img src="/img/del_icon3.gif" alt="����" width="56" height="18" border="0" onClick="javascript:goDel('${violation.SEQ}');" style="cursor: pointer">
				</c:if>
				</td>
			</tr>

		</table>
		</td>
	</tr>
</table>

</form>
</body>
</html>
