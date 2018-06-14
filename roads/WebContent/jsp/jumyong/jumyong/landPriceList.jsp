<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ include file="/jsp/common/include.jsp"%>
<%@ include file="/jsp/common/loginCheck.jsp"%>
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
<link href="/css/pop.css" rel="stylesheet" type="text/css">
<script language='JavaScript' src='/js/Check_inputbox.js'></script>
<script language="javascript" src="/js/Ajax_request.js"></script>
<script language="javascript" src="/js/calculation.js"></script>
<script language="javascript" src="/js/common.js"></script> 
<script>
function sumPrice(){
/*
	var priceList = document.getElementsByName("JIGA");
	
	var totalPrice = 0;
	
	for(var i = 0; i < priceList.length ; i++){
		totalPrice += Number(priceList[i].value);
	}
	document.getElementById("giga").value = Math.floor(fixFloatCal(totalPrice/priceList.length));
*/
	var priceList = document.getElementsByName("JIGA");
	
	var totalPrice = 0;

	var count = 0;
	
	for(var i = 0; i < priceList.length ; i++){
		totalPrice += Number(priceList[i].value);
		if (Number(priceList[i].value) == -1) {
			count += 1;
		}
	}
	document.getElementById("giga").value = Math.floor(fixFloatCal(totalPrice/priceList.length));

	// 2013.03.07 by ksic
	// ���������� �������� ���������� 5�� �� ������ ��ȸ �� ������ ���� ���������� �����ϵ��� �Ǿ� �־
	// 5�� �� �������� ��û �� ������� ���������� '-1'�� �����ϰ�
	// �� ���������� '-1' ���� �����ϸ� �Ʒ��� �޽����� ����.
	if (count > 0)
		alert("["+${year}+"]�⵵�� ���������� ���� �������� �⵵�� 5�� �� �����Ϳ��� �� �ý��ۿ��� �������� �ʽ��ϴ�." +
				"\n�ѱ��������� �ý��ۿ��� �˻��Ͽ� ���������� ����� �Է��Ͻʽÿ�." +
				"\nURL -> http://klis.seoul.go.kr" +
				"�ε��� �������� > ������������");
}



function close2()
{
	var giga = document.getElementById("giga").value;
	
	var idx = document.getElementById("idx").value;
	
	if(idx != ""){
		opener.document.getElementsByName("PRICE")[idx].value = giga;
	}else{
		opener.document.getElementById("PRICE").value=giga;	
	}

	self.close();
}
</script>
</head>

<body onload="sumPrice();">
<input id="idx" name="idx" value="${idx}" type="hidden">
	<table width="100%" height="100%" border="0" cellpadding="0" cellspacing="0">
		<tr>
			<td width="12px" height="12px"><img src="/img/box_top_left.gif" width="12" height="12"></td>
			<td height="12px" background="/img/box_top_mid.gif"></td>
			<td width="12px" height="12px"><img src="/img/box_top_right.gif" width="12" height="12"></td>
		</tr>
		<tr>
			<td width="12px" background="/img/box_left.gif"></td>
			<td align="center" valign="top">
				<table width="100%" border="0" cellspacing="0" cellpadding="0">
					<tr>
						<td>
							<table width="100%" border="0" cellpadding="0" cellspacing="0" class="admin_w">
								<tr>
									<td width="40px" height="40px"><img src="/img/admin_pop_left2.gif" width="40px" height="40px"></td>
									<td background="/img/admin_pop_cen.gif" class="admin_w_b" style="padding-top: 3">��������</td>
									<td width="33px"><img src="/img/close.gif" alt="�ݱ�" width="33px" height="40px" border="0" onClick="self.close();" style="cursor: pointer;" /></td>
								</tr>
								<tr>
									<td height="5" colspan="3"></td>
								</tr>
							</table>
						</td>
					</tr>
					<tr>
						<td>
							<table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
								<tr>
									<td align="left">
										<table width="280px" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
											<tr>
			                        			<td width="160px" height="26px" align="center" bgcolor="e5eff8" class="sub_table_b">��&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;��</td>
			                        			<td width="120px" align="center" bgcolor="e5eff8" class="sub_table_b" >��������</td>
			                      			</tr>
										</table>
									</td>
								</tr>
								<tr>
									<td align="left">
										<DIV style="width:297px;height:100px;overflow-y:scroll;overflow-x:none;scrollbar-face-color:#EEF8FB;scrollbar-3dlight-color:#BBBDB6; scrollbar-highlight-color:#EEF8FB;scrollbar-shadow-color:#BBBDB6; scrollbar-darkshadow-color:#EEF8FB;scrollbar-track-color:#EEF8FB;scrollbar-arrow-color:#BBBDB6;">
										<table width="280px" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
			                      			<c:forEach items="${priceList}" var="board" varStatus="idx">	                      
				                      		<tr>
				                        		<td width="160px" height="26px" align="center">${board.ADDR}</td>                                                                                    
				                        		<td width="120px" align="center">
				                        		<input name="JIGA" value="${board.JIGA}" type="text" class="input_form1" style="width:100px" onKeyDown="nr_num_int(this);sumPrice();" onKeyUp="nr_num_int(this);sumPrice();" onKeyPress="nr_num_int(this);sumPrice();">
				                        		</td>            
				                      		</tr>
									 		</c:forEach>
										</table>
										</DIV>
									</td>
								</tr>
							</table>
						</td>
					</tr>
					<tr>
					<td height="10px"></td>
					</tr>
					<tr>
						<td>
							<table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
	          					<tr>
	          						<td height="28px" align="center" bgcolor="e5eff8" class="sub_table_b">�⵵</td>
				            		<td height="28px" bgcolor="#F6F6F6" class="table_bl_left"><span class="sub_stan_blue">${year}</span>��</td>
				            		<td align="center" bgcolor="e5eff8" class="sub_table_b">��հ�������</td>
				            		<td bgcolor="#F6F6F6" class="table_bl_left">
				            			<span class="sub_stan_blue">
				            			<input name="giga" id="giga" type="text" value = "" style="width:70px;ime-mode:disabled;"  class="input_form1" >
				            			</span> ��&nbsp;&nbsp;
				            			<span class="sub_stan_blue" style="cursor:pointer" onclick="javascript:close2();">����</span> 
				            		</td>
	          					</tr>
          					</table>
						</td>
					</tr>
				</table>
			</td>
			<td width="12px" background="/img/box_right.gif"></td>
		</tr>
		<t>
			<td width="12px" height="12px"><img src="/img/box_bottom_left.gif" width="12" height="12" style="vertical-align: top;"></td>
			<td background="/img/box_bottom_mid.gif"></td>
			<td width="12px" height="12px"><img src="/img/box_bottom_right.gif" width="12" height="12" style="vertical-align: top;">
			</td>
		</tr>
	</table>
</body>
</html>