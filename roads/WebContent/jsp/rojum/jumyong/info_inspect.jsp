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
	background-image: url(/img/left_back.gif);
}
-->
</style>
<link href="/css/roads.css" rel="stylesheet" type="text/css">
<script language="javascript" src="/js/common.js"></script>
<script language="javascript" src="/js/PopupCalendar.js"></script>
<script>

	function submitClick()
	{
		var form = document.inspectForm;
		
		if (getByteLength(form.INSPECT_OPINION) > 100) {
          alert("���������ǰ��� �ѱ� 100��(���� 200��) �̻� �Է��� �� �����ϴ�.");
          return false;
    	}
    	
    	if (getByteLength(form.MANAGER_OPINION) > 100) {
          alert("���������ǰ��� �ѱ� 100��(���� 200��) �̻� �Է��� �� �����ϴ�.");
          return false;
    	}
    	
    	if (getByteLength(form.APPROVAL_CONDITION) > 100) {
          alert("���������ǰ��� �ѱ� 100��(���� 200��) �̻� �Է��� �� �����ϴ�.");
          return false;
    	}


		
		//���� ���� üũ 
		
		if(getChecked('RESULT',0) || getChecked('RESULT',1) || getChecked('RESULT',2))
		{

			var inspectForm = document.inspectForm;
			inspectForm.submit();
		}else
		{
			alert("���˰���� �Է��� �ֽʽÿ�.");
		}
		
		//var radioObj = document.getElementById("RESULT");

	}
	
	function getChecked(nameVal,numVal)
	{
		return document.getElementsByName(nameVal)[numVal].checked
	}
	
	function subTabClick(hiddenSubTabName,visibleSubTabName)
	{	
		document.getElementById(hiddenSubTabName).style.display = 'none';	
		document.getElementById(visibleSubTabName).style.display = 'block';	
	}
	
	
	function InitPage()
	{	
		if(document.getElementById("mode").value == "add"  )
		{
			document.getElementById("edit").style.display = "block";
			document.getElementById("view").style.display = "none";
		}else if(document.getElementById("mode").value == "edit" || document.getElementById("mode").value == "add"  )
		{
			document.getElementById("edit").style.display = "block";
			document.getElementById("view").style.display = "none";
		}else
		{
			document.getElementById("edit").style.display = "none";
			document.getElementById("view").style.display = "block";
		}
	}
	// ����� üũ
	function checkForm(){
		var form1 = document.form1;
		//alert(form1.year.value);

		form1.submit();
		//	Ư������ �Է½� �� ���� ����� �ٹٲ��� �־�� ������ ����. ������ �𸣰ڽ�
		//		w.content.value = w.content.value+' '+'\n';	
		
	}
	
	function onlyNumberInput()
	{
		
		
	 var code = window.event.keyCode;
	
	 if ((code > 34 && code < 41) || (code > 47 && code < 58) || (code > 95 && code < 106) || code == 8 || code == 9 || code == 13 || code == 46 || code == 190 || code == 110|| code == 189|| code == 109)
	 {
	  	window.event.returnValue = true;
		return;
	 }else 
	 {	 
	 	window.event.returnValue = false;
	 	return;
 	 }
	}
	

	
	function goDel(seq)
	{
		var admin_no = "${no}";
	
		if(confirm("���� �����Ͻðڽ��ϱ�?"))
			location.href("/gapan/jumyong/inspectDel.do?admin_no="+admin_no+"&seq="+seq);
	}
	

	//confirm �� Ȯ��,���-> ��,�ƴϿ�.
	function window.confirm(str) {
	
	 execScript('n = msgbox("'+str+'","4132")',"vbscript");
	 return(n == 6);
	 
	}
	
</script>

</head>

<body onload="InitPage();">


<form name="inspectForm" id="inspectForm" method="post" action = "/gapan/jumyong/inspectEdit.do" >

<input name="no" value="${no}" type="hidden" >
<input name="mode"  id = "mode" value="${mode}" type="hidden" >
<input name="seq"  id = "seq" value="${seq}" type="hidden" >

<div id="view" style="width:100%;">
<table width="780" border="0" cellspacing="0" cellpadding="0">   
	<tr>
		<td background="/img/tab_line_blue.gif">
			<img id="conf_img" name="conf_img" src="/img/sub_petition_title5_on.gif" alt="��������" width="110" height="22" border="0"  >
		</td>
	</tr>        
	<tr>
		<td align="center" class="contborder_purple">
			<table width="100%" border="0" cellspacing="0" cellpadding="0">
				<tr>
					<td>
						<table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
							<tr>
								<td height="28" align="center" bgcolor="e5eff8" class="sub_table_b">��ȣ</td>
								<td align="center" bgcolor="e5eff8" class="sub_table_b">���˰��</td>
								<td align="center" bgcolor="e5eff8" class="sub_table_b">��������</td>
								<td align="center" bgcolor="e5eff8" class="sub_table_b">������</td>
								<td align="center" bgcolor="e5eff8" class="sub_table_b">�������� �ǰ�</td>
								<td align="center" bgcolor="e5eff8" class="sub_table_b">����� �ǰ�</td>
								<td align="center" bgcolor="e5eff8" class="sub_table_b">�㰡���� </td>
								<td align="center" bgcolor="e5eff8" class="sub_table_b">��������</td>                    
							</tr>
							<c:forEach items="${iList}" var="board" varStatus="idx">
							<tr onMouseOver="this.style.backgroundColor='#f6f7f8'" onMouseOut="this.style.backgroundColor=''" >                     
								<td height="26" align="center">${idx.count}</td>
								<td align="center">${board.NAME}</td>
								<td align="center">${rnic:addDash(board.INSPECT_DATE)}</td>
								<td align="center">${board.INSPECTOR}</td>
								<td align="center" onclick="javascript:location.href('/jumyong/inspectEdit.do?no=${no}&seq=${board.SEQ}&currentPage=${currentPage}&countPerPage=${countPerPage}');" style="cursor:pointer" >
									${board.INSPECT_OPINION}</td>
								<td align="center">${board.MANAGER_OPINION}</td>
								<td align="center">${board.APPROVAL_CONDITION}</td>
								<td align="center"  onclick="javascript:goDel('${board.SEQ}')";" style="cursor:pointer" >
									����
								</td>                        
							</tr>
							</c:forEach>
						</table>
					</td>
				</tr>
				<tr>
					<td height="40" align="center"></td>
				</tr>
				<tr>
					<td>
						<table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
							<tr>
								<td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">���˰��</td>
								<td bgcolor="eaeaea" class="table_bl_left" colspan="3" align="left">
									<input type="radio" name="RESULT_VIEW" id="RESULT_VIEW" disabled="true" value="1" <c:if test="${inspect.RESULT == '1' }"> checked </c:if>  > �㰡
									<input type="radio" name="RESULT_VIEW" id="RESULT_VIEW" disabled="true" value="2" <c:if test="${inspect.RESULT == '2' }"> checked </c:if>  > ����
									<input type="radio" name="RESULT_VIEW" id="RESULT_VIEW" disabled="true" value="3" <c:if test="${inspect.RESULT == '3' }"> checked </c:if>  > ����
								</td>                    
							</tr>
							<tr>
								<td width="15%" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">������</td>
								<td width="35%" bgcolor="eaeaea" class="table_bl_left" align="left">${inspect.INSPECTOR}</td>
								<td width="15%" align="center" bgcolor="e5eff8" class="sub_table_b">��������</td>
								<td width="35%" bgcolor="eaeaea" class="table_bl_left" align="left">${inspect.INSPECT_DATE}</td>
							</tr>
							<tr>
								<td width="100" height="60" align="center" bgcolor="e5eff8" class="sub_table_b">�������� �ǰ�</td>
								<td bgcolor="eaeaea" class="table_bl_left" colspan="3" align="left">${inspect.INSPECT_OPINION}</td>                    
							</tr>  
							<tr>
								<td width="100" height="60" align="center" bgcolor="e5eff8" class="sub_table_b">����� �ǰ�</td>
								<td bgcolor="eaeaea" class="table_bl_left" colspan="3" align="left">${inspect.MANAGER_OPINION}</td>                     
							</tr> 
							<tr>
								<td width="100" height="60" align="center" bgcolor="e5eff8" class="sub_table_b">�㰡����</td>
								<td bgcolor="eaeaea" class="table_bl_left" colspan="3" align="left">${inspect.APPROVAL_CONDITION}</td>
							</tr>                                
						</table>
					</td>
				</tr>
				<tr>              
					<td height="40" align="right">
					<c:if test="${SECTION != '4'}">
						<table border="0" width="100%">
							<tr>
								<td>
								<c:if test="${listSize == '0'}">
									<a href="/gapan/jumyong/inspectEdit.do?no=${no}&mode=add&currentPage=${currentPage}&countPerPage=${countPerPage}">
										<img src="/img/add_icon.gif" alt="�߰�" border="0">
									</a>
								</c:if>
								</td>
								<c:if test="${listSize != '0'}"> 
								<td width="50">								
									<a href="/gapan/jumyong/inspectEdit.do?no=${no}&mode=edit&seq=${seq}&currentPage=${currentPage}&countPerPage=${countPerPage}">
										<img src="/img/mod_icon.gif" alt="����" border="0">
									</a>	 		                
								</td>
								</c:if>
							</tr>
						</table>
					</c:if>
					</td>
				</tr>
			</table>
		</td>
	</tr>
</table>
</div>



<div id="edit" style="width:100%;display:none;">
<table width="780" border="0" cellspacing="0" cellpadding="0">  
	<tr>
		<td background="/img/tab_line_blue.gif">
			<img id="conf_img" name="conf_img" src="/img/sub_petition_title5_on.gif" alt="��������" width="110" height="22" border="0"  >
		</td>
	</tr>         
	<tr>
		<td align="center" class="contborder_purple">
			<table width="100%" border="0" cellspacing="0" cellpadding="0">
				<tr>
					<td>
						<table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
							<tr>
								<td height="28" align="center" bgcolor="e5eff8" class="sub_table_b">��ȣ</td>
								<td align="center" bgcolor="e5eff8" class="sub_table_b">���˰��</td>
								<td align="center" bgcolor="e5eff8" class="sub_table_b">��������</td>
								<td align="center" bgcolor="e5eff8" class="sub_table_b">������</td>
								<td align="center" bgcolor="e5eff8" class="sub_table_b">�������� �ǰ�</td>
								<td align="center" bgcolor="e5eff8" class="sub_table_b">����� �ǰ�</td>
								<td align="center" bgcolor="e5eff8" class="sub_table_b">�㰡���� </td>
								<td align="center" bgcolor="e5eff8" class="sub_table_b">��������</td>                    
							</tr>
							<c:forEach items="${iList}" var="board" varStatus="idx">
							<tr onMouseOver="this.style.backgroundColor='#f6f7f8'" onMouseOut="this.style.backgroundColor=''" >                     
								<td height="26" align="center">${idx.count}</td>
								<td align="center">${board.NAME}</td>
								<td align="center">${rnic:addDash(board.INSPECT_DATE)}</td>
								<td align="center">${board.INSPECTOR}</td>
								<td align="center"
								onclick="javascript:location.href('/jumyong/inspectEdit.do?no=${no}&seq=${board.SEQ}&currentPage=${currentPage}&countPerPage=${countPerPage}');" style="cursor:pointer" >
									${board.INSPECT_OPINION}
								</td>
								<td align="center">${board.MANAGER_OPINION}</td>
								<td align="center">${board.APPROVAL_CONDITION}</td>
								<td align="center"  onclick="javascript:goDel('${board.SEQ}')";" style="cursor:pointer" >����</td>                        
							</tr>
							</c:forEach>
						</table>
					</td>
				</tr>
				<tr>
					<td height="40" align="center">
					</td>                    
				</tr>
				<tr>
					<td>
						<table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
							<tr>
								<td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">���˰��</td>
								<td bgcolor="eaeaea" class="table_bl_left" colspan="3" align="left">
									<spring:bind path="inspect.RESULT">
									<input type="radio" name="RESULT" id="RESULT" value="1"	<c:if test="${inspect.RESULT == '1' }"> checked </c:if>  > �㰡
									<input type="radio" name="RESULT" id="RESULT" value="2" <c:if test="${inspect.RESULT == '2' }"> checked </c:if>  > ����
									<input type="radio" name="RESULT" id="RESULT" value="3" <c:if test="${inspect.RESULT == '3' }"> checked </c:if>  > ����
									</spring:bind>
								</td>                    
							</tr>                             
							<tr>
								<td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">������</td>
								<td bgcolor="eaeaea" class="table_bl_left" align="left">
								<spring:bind path="inspect.INSPECTOR">                    
									<input name="INSPECTOR" type="text" class="input_form1" style="width:120px" value="${inspect.INSPECTOR}">
								</spring:bind>
								</td>
								<td width="100" align="center" bgcolor="e5eff8" class="sub_table_b">��������</td>
								<td bgcolor="eaeaea" class="table_bl_left">
									<table border="0" cellpadding="0" cellspacing="0" class="sub_stan" align="left">
										<tr>
											<td>
												<spring:bind path="inspect.INSPECT_DATE">                    
												<input name="INSPECT_DATE" type="text" class="input_form1" style="width:120px" value="${inspect.INSPECT_DATE}"  style="ime-mode:disabled;" onKeyDown="onlyNumberInput();" maxlength=10 readonly>
												</spring:bind>
											</td>
											<td>
												<img src="/img/calendar_icon.gif" width="19" height="16" border="0" onclick="popUpCalendar(this, document.getElementById('INSPECT_DATE'), 'yyyymmdd');" style="cursor:pointer" >
											</td>
										</tr>
									</table>
								</td>
							</tr>
							<tr>
								<td width="100" height="60" align="center" bgcolor="e5eff8" class="sub_table_b">�������� �ǰ�</td>
								<td bgcolor="eaeaea" class="table_bl_left" colspan="3"  align="left">
									<spring:bind path="inspect.INSPECT_OPINION">
									<textarea name="INSPECT_OPINION" id="INSPECT_OPINION"  class="input_form1" style="width:600px"  cols="70" rows="3"  wrap="VIRTUAL" style="ime-mode:active;" >${inspect.INSPECT_OPINION}</textarea>
									</spring:bind>
								</td>                    
							</tr>  
							<tr>
								<td width="100" height="60" align="center" bgcolor="e5eff8" class="sub_table_b">����� �ǰ�</td>
								<td bgcolor="eaeaea" class="table_bl_left" colspan="3"  align="left">
									<spring:bind path="inspect.MANAGER_OPINION">
									<textarea name="MANAGER_OPINION" id="MANAGER_OPINION" class="input_form1" style="width:600px"  cols="70" rows="3" wrap="VIRTUAL" style="ime-mode:active;" >${inspect.MANAGER_OPINION}</textarea>
									</spring:bind>
								</td>
							</tr> 
							<tr>
								<td width="100" height="60" align="center" bgcolor="e5eff8" class="sub_table_b">�㰡����</td>
								<td bgcolor="eaeaea" class="table_bl_left" colspan="3"  align="left">
									<spring:bind path="inspect.APPROVAL_CONDITION">                    
									<textarea name="APPROVAL_CONDITION" id="APPROVAL_CONDITION" class="input_form1" style="width:600px"  cols="70" rows="3" wrap="VIRTUAL" style="ime-mode:active;" >${inspect.APPROVAL_CONDITION}</textarea>
									</spring:bind>
								</td>                     
							</tr>                                
						</table>
					</td>
				</tr>
				<tr>
					<td height="40" align="right">
					<c:if test="${SECTION != '4'}">
						<img src="/img/can_icon.gif" alt="���" border="0" onclick="javascript:history.back();" style="cursor:pointer" >                
						<img src="/img/save_icon2.gif" alt="����" width="56" height="18" border="0" onClick="javascript:submitClick();"  style="cursor:pointer">
					</c:if>
					</td>
				</tr>
			</table>
		</td>
	</tr>
</table>
</div>

</form>

</body>
</html>

