<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ include file="/jsp/common/loginCheck.jsp"%>
<%@ include file="/jsp/common/include.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=euc-kr" />
<title>::::: 서울시 도로점용관리시스템 :::::</title>
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

function Summit(){
	var f = document.jumyongForm;
	var select_item = document.getElementsByName("SELECT_ITEM");
	var item_check = document.getElementsByName("ITEM_CHECK");
	var count = 0;
	var hitFlag;


	//대상변수들
	var owner_name = document.getElementsByName("OWNER_NAME");
	var owner_ssn = document.getElementsByName("OWNER_SSN");
	var owner_gender = document.getElementsByName("OWNER_GENDER");
	var owner_age = document.getElementsByName("OWNER_AGE");
	var owner_post = document.getElementsByName("OWNER_POST");
	var owner_addr1 = document.getElementsByName("OWNER_ADDR1");
	var owner_san = document.getElementsByName("OWNER_SAN");
	var owner_jibun = document.getElementsByName("OWNER_JIBUN");
	var owner_addr2 = document.getElementsByName("OWNER_ADDR2");
	var owner_same = document.getElementsByName("OWNER_SAME");
	var owner_topost = document.getElementsByName("OWNER_TOPOST");
	var owner_toaddr1 = document.getElementsByName("OWNER_TOADDR1");
	var owner_tosan = document.getElementsByName("OWNER_TOSAN");
	var owner_tojibun = document.getElementsByName("OWNER_TOJIBUN");
	var owner_toaddr2 = document.getElementsByName("OWNER_TOADDR2");
	var owner_tel = document.getElementsByName("OWNER_TEL");
	var owner_hp = document.getElementsByName("OWNER_HP");
	var addr_check1 = document.getElementsByName("ADDR_CHECK1");
	var addr_check2 = document.getElementsByName("ADDR_CHECK2");
	var lt_sel = document.getElementsByName("LT_SEL");

	for(var i = 0 ; i < select_item.length ; i++){
		if(select_item[i].checked == true){
			count++;
			hitFlag = i;
		}
	}
	if(count <= 0){
		alert("운영자를 선택하세요.");
		return;
	}else{


		if('${mode}' == 'short'){
			opener.document.getElementById("${target_name}").value = owner_name[hitFlag].value;
			opener.document.getElementById("${target_ssn}").value = addSSNDash(owner_ssn[hitFlag].value);
			self.close();

		}else{
			opener.document.getElementById("OWNER_NAME").value = owner_name[hitFlag].value;

			opener.document.getElementById("OWNER_SSN1").value = cutText(addSSNDash(owner_ssn[hitFlag].value),'-',0);
			opener.document.getElementById("OWNER_SSN2").value = cutText(addSSNDash(owner_ssn[hitFlag].value),'-',1);
			
			if(owner_gender[hitFlag].value == '1'){
				opener.document.getElementsByName("OWNER_GENDER")[0].checked = true;
			}else{
				opener.document.getElementsByName("OWNER_GENDER")[1].checked = true;
			}
			opener.document.getElementById("OWNER_AGE").value = owner_age[hitFlag].value;
			opener.document.getElementById("OWNER_POST").value = owner_post[hitFlag].value;
			opener.document.getElementById("OWNER_ADDR1").value = owner_addr1[hitFlag].value;
			opener.document.getElementById("OWNER_SAN").value = owner_san[hitFlag].value;

			opener.document.getElementById("OWNER_BONBUN").value = cutText(owner_jibun[hitFlag].value,'-',0);
			opener.document.getElementById("OWNER_BUBUN").value = cutText(owner_jibun[hitFlag].value,'-',1);
			
			opener.document.getElementById("OWNER_ADDR2").value = owner_addr2[hitFlag].value;
			opener.document.getElementById("OWNER_TOPOST").value = owner_topost[hitFlag].value;
			opener.document.getElementById("OWNER_TOADDR1").value = owner_toaddr1[hitFlag].value;
			opener.document.getElementById("OWNER_TOSAN").value = owner_tosan[hitFlag].value;
			
			opener.document.getElementById("OWNER_TOBONBUN").value = cutText(owner_tojibun[hitFlag].value,'-',0);
			opener.document.getElementById("OWNER_TOBUBUN").value = cutText(owner_tojibun[hitFlag].value,'-',1);

			opener.document.getElementById("OWNER_TOADDR2").value = owner_toaddr2[hitFlag].value;

			opener.document.getElementById("OWNER_TEL1").value = cutText(owner_tel[hitFlag].value,'-',0);
			opener.document.getElementById("OWNER_TEL2").value = cutText(owner_tel[hitFlag].value,'-',1);
			opener.document.getElementById("OWNER_TEL3").value = cutText(owner_tel[hitFlag].value,'-',2);

			opener.document.getElementById("OWNER_HP1").value = cutText(owner_hp[hitFlag].value,'-',0);
			opener.document.getElementById("OWNER_HP2").value = cutText(owner_hp[hitFlag].value,'-',1);
			opener.document.getElementById("OWNER_HP3").value = cutText(owner_hp[hitFlag].value,'-',2);

			if(addr_check1[hitFlag].value == '1'){
				opener.document.getElementById("ADDR_CHECK1").checked = true;
			}else{
				opener.document.getElementById("ADDR_CHECK1").checked = false;
			}
			
			
			var lt_sel_list = opener.document.getElementById('LT_SEL').options;

			for(var i = 0 ; i < lt_sel_list.length ; i++){
				if(lt_sel_list[i].value == lt_sel[hitFlag].value){
					lt_sel_list[i].selected = true;
				} 
			}
			 
			self.close();

		}

		
	}
}

function cutText(txt,sp,count){

	var arrayTxt = txt.split(sp);

	if(arrayTxt.length == 1 && count == 0){
		return arrayTxt[count];
	}else if(arrayTxt.length == 1 && count != 0){
		return '';

	}
	return arrayTxt[count];
}

function checkItem(obj){
	var selectItems = document.getElementsByName("SELECT_ITEM");
	
	for(var i = 0 ; i < selectItems.length ; i++){
		if(selectItems[i] == obj){
			if(selectItems[i].checked){
				checkNum = i;	
			}else{
				checkNum = null;
			}
		}else{
			selectItems[i].checked = false;
		}
	}
	
}

</script>
<link href="/css/pop.css" rel="stylesheet" type="text/css">

</head>

<body onload="">

<form id="ownerListForm" name="ownerListForm" method="post">
	<table width="100%" height="100%" border="0" cellpadding="0" cellspacing="0">
		<tr>
			<td height="12">
				<img src="/img/box_top_left.gif" width="12" height="12"></td>
			<td background="/img/box_top_mid.gif"></td>
			<td><img src="/img/box_top_right.gif" width="12" height="12"></td>
		</tr>
		<tr>
			<td width="12" background="/img/box_left.gif"></td>
			<td align="center" valign="top">
			<table width="100%" border="0" cellspacing="0" cellpadding="0">
				<tr>
				<td align="center">
					<span class="sub_stan_blue" style="font-size:12px">운영자 조회 리스트</span>
				</td>
				</tr>
				
				<tr>
					<td height="10px">
					</td>
				</tr>
				<tr>
					<td>
						<table width="420px" cellpadding="0" cellspacing="0" border="0" class="sub_table" bordercolor="#c9dfed" style="border-collapse:collapse;">
						  <tr>
						    <td valign="top">
						      <TABLE cellpadding="0" cellspacing="0" border="1" class="sub_table" bordercolor="#c9dfed" style="border-collapse:collapse;">
						        <tr>
					              <td width="26px" height="26px" align="center" bgcolor="e5eff8" class="sub_table_b">
								  </td>
						        </tr>
						      </TABLE>
						    </td>
						    <td width="383px" valign="top">
						      <div id="topLine2" style="width:383px;overflow:hidden;">
						        <TABLE width="500px" cellpadding="0" cellspacing="0" border="1" class="sub_table" bordercolor="#c9dfed" style="border-collapse:collapse;">
						          <tr >
				  					<td width="100px" height="26px" align="center" bgcolor="e5eff8" class="sub_table_b">운영자</td>
				  					<td width="120px" align="center" bgcolor="e5eff8" class="sub_table_b">운영자 주민번호</td>
				  					<td width="200px" align="center" bgcolor="e5eff8" class="sub_table_b">운영자 주소</td>
						          </tr>
						        </TABLE>
						      </div>
						    </td>
						  </tr>
						  <TR>
						    <TD width="26px" valign="top">
						      <DIV id="leftDisplay2" style="width:26px;height:207px;overflow:hidden;">
						        <TABLE cellpadding="0" cellspacing="0" border="1" class="sub_table" bordercolor="#c9dfed" style="border-collapse:collapse;">
				          			<c:forEach items="${OwnerList}" var="OwnerList" varStatus="idx">
				  					<tr onMouseOver="this.style.backgroundColor='#f6f7f8'" onMouseOut="this.style.backgroundColor=''"	style="cursor: pointer">
				  						<td width="26px" height="26px" align="center" bgcolor="e5eff8" class="sub_table_b">
				  							<INPUT TYPE="checkbox" NAME="SELECT_ITEM" onclick="checkItem(this);">
				  							<INPUT TYPE="hidden" NAME="ITEM_CHECK" value="">
				  							<INPUT TYPE="hidden" NAME="OWNER_NAME" value="${OwnerList.OWNER_NAME}">
				  							<INPUT TYPE="hidden" NAME="OWNER_SSN" value="${OwnerList.OWNER_SSN}">
				  							<INPUT TYPE="hidden" NAME="OWNER_GENDER" value="${OwnerList.OWNER_GENDER}">
											<INPUT TYPE="hidden" NAME="OWNER_AGE" value="${OwnerList.OWNER_AGE}">
											<INPUT TYPE="hidden" NAME="OWNER_POST" value="${OwnerList.OWNER_POST}">
				  							<INPUT TYPE="hidden" NAME="OWNER_ADDR1" value="${OwnerList.OWNER_ADDR1}">
				  							<INPUT TYPE="hidden" NAME="OWNER_SAN" value="${OwnerList.OWNER_SAN}">
											<INPUT TYPE="hidden" NAME="OWNER_JIBUN" value="${OwnerList.OWNER_JIBUN}">
				  							<INPUT TYPE="hidden" NAME="OWNER_ADDR2" value="${OwnerList.OWNER_ADDR2}">
				  							<INPUT TYPE="hidden" NAME="OWNER_SAME" value="${OwnerList.OWNER_SAME}">
				  							<INPUT TYPE="hidden" NAME="OWNER_TOPOST" value="${OwnerList.OWNER_TOPOST}">
											<INPUT TYPE="hidden" NAME="OWNER_TOADDR1" value="${OwnerList.OWNER_TOADDR1}">
											<INPUT TYPE="hidden" NAME="OWNER_TOSAN" value="${OwnerList.OWNER_TOSAN}">
				  							<INPUT TYPE="hidden" NAME="OWNER_TOJIBUN" value="${OwnerList.OWNER_TOJIBUN}">
				  							<INPUT TYPE="hidden" NAME="OWNER_TOADDR2" value="${OwnerList.OWNER_TOADDR2}">
											<INPUT TYPE="hidden" NAME="OWNER_TEL" value="${OwnerList.OWNER_TEL}">
				  							<INPUT TYPE="hidden" NAME="OWNER_HP" value="${OwnerList.OWNER_HP}">
				  							<INPUT TYPE="hidden" NAME="ADDR_CHECK1" value="${OwnerList.ADDR_CHECK1}">
											<INPUT TYPE="hidden" NAME="ADDR_CHECK2" value="${OwnerList.ADDR_CHECK2}">
											<INPUT TYPE="hidden" NAME="LT_SEL" value="${OwnerList.LT_SEL}">
				  						</td>
				  					</tr>
									</c:forEach>
						        </TABLE>
						      </DIV>
						    </TD>
						    <TD width="400px" valign="top">
						      <DIV id="mainDisplay2" style="width:400px;height:224px;overflow:scroll;scrollbar-face-color:#EEF8FB;scrollbar-3dlight-color:#BBBDB6; scrollbar-highlight-color:#EEF8FB;scrollbar-shadow-color:#BBBDB6; scrollbar-darkshadow-color:#EEF8FB;scrollbar-track-color:#EEF8FB;scrollbar-arrow-color:#BBBDB6;" onscroll ="scrollAll()">
						        <TABLE width="500px" cellpadding="0" cellspacing="0" border="1" class="sub_table" bordercolor="#c9dfed" style="border-collapse:collapse;">
						          <c:forEach items="${OwnerList}" var="OwnerList" varStatus="idx">
										<tr onMouseOver="this.style.backgroundColor='#f6f7f8'" onMouseOut="this.style.backgroundColor=''"	style="cursor: pointer" onclick="selectRowOne('${idx.count}');">
											<td width="100px" height="26px" align="center">${OwnerList.OWNER_NAME}</td>
											<td width="120px" align="center"><script>document.write(addSSNDash('${OwnerList.OWNER_SSN}'));</script></td>
											<td width="200px" align="center">
											${OwnerList.OWNER_TOADDR1}&nbsp;
											<c:if test="${OwnerList.OWNER_TOSAN == '1'}">
												산
											</c:if>
											${OwnerList.OWNER_TOJIBUN} ${OwnerList.OWNER_TOADDR2}
											</td>
										</tr>
									</c:forEach>	
						        </TABLE>
						      </DIV>
						    </TD>
						  </TR>
						</table>
					</td>
				</tr>
				<tr>
				<td height="5px">
				</td>
				
				</tr>
				<tr>
					<td>
						<img src="/img/select_icon2.gif" alt="선택" width="56" height="18" border="0" onClick="javascript:Summit();"  style="cursor:pointer">
						<img src="/img/can_icon.gif" alt="취소" border="0" onclick="self.close();" style="cursor:pointer" >
					</td>
				
				
				</tr>
			</table>
			</td>
			<td width="12" background="/img/box_right.gif"></td>
		</tr>
		<tr>
			<td height="12"><img src="/img/box_bottom_left.gif" width="12"
				height="12"></td>
			<td background="/img/box_bottom_mid.gif"></td>
			<td><img src="/img/box_bottom_right.gif" width="12" height="12"></td>
		</tr>
	</table>
</form>
</body>
</html>

