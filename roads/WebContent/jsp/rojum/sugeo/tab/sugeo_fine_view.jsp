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
	background-image: url/ img/ left_back.gif );
}
-->
</style>
<link href="/css/roads.css" rel="stylesheet" type="text/css">
</head>
<script language="javascript" src="/js/calculation.js"></script>
<script language="javascript" src="/js/PopupCalendar.js"></script>
<script language='JavaScript' src='/js/Check_inputbox.js'></script>


<script type="text/javascript">
//<![CDATA[
	//select의 option을 선택된 값으로 지정
	
	var savable = 0;
	
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
			
	// 수정화면 이동
	function	goModify()
	{
		var form = document.form;
		form.action = "/rojum/sugeo/sugeo_fine_view.do?mul_no=${mul_no}&mode=modify";

		form.submit();
	}

	function goSubmit(){

		if(savable != 1){
			alert("계산버튼을 먼저 눌러주세요.");
			return;
		}

		var danga = document.getElementById("BUGWA_DANGA");
		var tax = document.getElementById("BUGWA_TAX");

		danga.value = removeComma(danga.value);
		tax.value = removeComma(tax.value);

		var form = document.form;

		if(document.getElementById("mode").value == 'modify'){
			form.action = "/rojum/sugeo/sugeo_fine_modify_prc.do?mul_no=${mul_no}";
		}else{
			form.action = "/rojum/sugeo/sugeo_fine_prc.do?mul_no=${mul_no}";
		}
		form.submit();
	}


	function goCalculation(){
		var danga = document.getElementById("BUGWA_DANGA").value;
		var area = document.getElementById("BUGWA_AREA").value;


		var tax = document.getElementById("BUGWA_TAX");
		var form = document.getElementById("BUGWA_FORM");

		

		form.value = area + "㎡ X " + danga + "원";

		tax.value = insertComma2(Math.floor(fixFloatCal(parseFloat(area)*parseFloat(removeComma(danga)))));

		savable = 1;
	}

	function goCancel(){
		parent.document.location.href = "/rojum/sugeo/view.do?mul_no=${mul_no}";
	}

	function goDelete(){
        if(!confirm("삭제하시겠습니까?"))
            return;
        
		var form = document.form;
		form.action = "/rojum/sugeo/sugeo_fine_del_prc.do?mul_no=${mul_no}";
		form.submit();
	}

	function goBugwa(){

		if('${sugeo.FINE_STATUS}' == null || '${sugeo.FINE_STATUS}' == ''){
			alert("산출정보를 먼저 입력하세요.");
			return;
		}
		document.location.href = "/rojum/sugeo/sugeo_bugwa_view.do?mul_no=${mul_no}";
		

		


	}


	
	
//]]>
</script>


<body onload="InitPage()">

<form name="form" method="post">
<input type="hidden" name="mul_no" value="${mul_no}">
<input type="hidden" name="message" value="${message}">
<input type="hidden" name="mode" value="${mode}">

<table width="800" border="0" cellpadding="0" cellspacing="0">
	<tr>
		<td align="left">
		<table width="780" border="0" cellspacing="0" cellpadding="0">
			<tr>
				<td height="22" background="/img/tab_line_purple.gif">
				<table border="0" cellspacing="0" cellpadding="0">
					<tr>
						<td>
							<ul id="tabmenu">
								<td width="111"><a><img src="/img/cal_on.gif" alt="과태료정보" width="110" height="22" border="0" style="CURSOR: Hand;"></a></td>
								<td width="111"><a><img src="/img/bugwa_off.gif" alt="부과정보" width="110" height="22" border="0" onclick="goBugwa();" style="CURSOR: Hand;"></a></td>
							</ul>
						</td>
					</tr>
				</table>
				</td>
			</tr>

			<tr>
				<td align="left" class="contborder_purple">
					

					<c:choose>
					<c:when test="${mode == 'view'}">
<!-- !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!산출식 저장화면 !!!!!!!!!!!!!!!!!!!!!!!!!!!!-->
						<table width="100%" border="0" bordercolor="#c9dfed" style="border-collapse: collapse;" cellpadding="0" cellspacing="0" class="sub_table">
						<tr>
							<td>
								<table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse: collapse;" cellpadding="0" cellspacing="0" class="sub_table">
									<tr>
										<td height="30" colspan="4" align="left" bgcolor="#FFFFFF" class="">
											<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
												<tr>
													<td><span class="sub_stan_blue">&nbsp; * 산출정보</span></td>
												</tr>
											</table>
										</td>
									</tr>
								
								
									<tr>
										<td height="26" width="100px" align="center" bgcolor="e5eff8" class="sub_table_b">점용면적</td>
										<td width="250px" bgcolor="eaeaea" class="table_bl_left">
											${sugeo.BUGWA_AREA}
										</td>
										<td width="100px" align="center" bgcolor="e5eff8" class="sub_table_b">기준 금액</td>
										<td width="250px" bgcolor="eaeaea" class="table_bl_left">
											${rnic:insertComma2(sugeo.BUGWA_DANGA)}
										</td>
									</tr>
									<tr>
										<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">과태료 산출식</td>
										<td bgcolor="eaeaea" class="table_bl_left">
											${sugeo.BUGWA_FORM}
										</td>
										<td align="center" bgcolor="e5eff8" class="sub_table_b">과태료</td>
										<td bgcolor="eaeaea" class="table_bl_left">
											${rnic:insertComma2(sugeo.BUGWA_TAX)}
										</td>
										
									</tr>
									<tr>
										<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">특이사항</td>
										<td colspan="3" bgcolor="eaeaea" class="table_bl_left">
											${sugeo.BUGWA_BIGO}
										</td>
									</tr>
								</table>
							</td>
						</tr>
						<tr height="10px">
						</tr>
						<tr>
							<td align="right">
								<img src="/img/mod_icon.gif" alt="수정" border="0" onclick="javascript:goModify();" style="cursor:pointer" >
								<img src="/img/del_icon3.gif" alt="삭제" border="0" onclick="javascript:goDelete();" style="cursor: pointer">
							</td>
						
						</tr>
					</table>
					
					</c:when>
					
					<c:otherwise>
<!-- !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!산출식 입력화면 !!!!!!!!!!!!!!!!!!!!!!!!!!!!-->
					<table width="100%" border="0" bordercolor="#c9dfed" style="border-collapse: collapse;" cellpadding="0" cellspacing="0" class="sub_table">
						<tr>
							<td>
								<table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse: collapse;" cellpadding="0" cellspacing="0" class="sub_table">
									<tr>
										<td height="30" colspan="4" align="left" bgcolor="#FFFFFF" class="">
											<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
												<tr>
													<td><span class="sub_stan_blue">&nbsp; * 산출정보</span></td>
												</tr>
											</table>
										</td>
									</tr>
									<tr>
										<td height="26" width="100px" align="center" bgcolor="e5eff8" class="sub_table_b">점용면적</td>
										<td width="250px" bgcolor="eaeaea" class="table_bl_left">
											<input name="BUGWA_AREA" id="BUGWA_AREA" type="text" value="${sugeo.BUGWA_AREA}" style="width:50px;ime-mode:disabled;" class="input_form1" onKeyDown="onlyNumberInput();" style="text-align:right" maxlength="13">㎡
										</td>
										<td width="100px" align="center" bgcolor="e5eff8" class="sub_table_b">기준 금액</td>
										<td width="250px" bgcolor="eaeaea" class="table_bl_left">
											<input name="BUGWA_DANGA" id="BUGWA_DANGA" type="text" value="${rnic:insertComma2(sugeo.BUGWA_DANGA)}" style="width:150px;ime-mode:disabled;" class="input_form1"  onKeyDown="onlyNumberInput();" onkeyup="javascript:fn_addComma(this)" style="text-align:right" maxlength="13">원
										</td>
									</tr>
									<tr>
										<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">과태료 산출식</td>
										<td bgcolor="eaeaea" class="table_bl_left">
											<input name="BUGWA_FORM" id="BUGWA_FORM" type="text" value="${sugeo.BUGWA_FORM}" style="width:200px;" class="input_form1" maxlength="100">
										</td>
										<td align="center" bgcolor="e5eff8" class="sub_table_b">과태료</td>
										<td bgcolor="eaeaea" class="table_bl_left">
											<input name="BUGWA_TAX" id="BUGWA_TAX" type="text" value="${rnic:insertComma2(sugeo.BUGWA_TAX)}" style="width:150px;ime-mode:disabled;" class="input_form1"  onKeyDown="onlyNumberInput();" onkeyup="javascript:fn_addComma(this)" style="text-align:right" maxlength="13">원
										</td>
										
									</tr>
									<tr>
										<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">특이사항</td>
										<td colspan="3" bgcolor="eaeaea" class="table_bl_left">
											<input name="BUGWA_BIGO" id="BUGWA_BIGO" type="text" value="${sugeo.BUGWA_BIGO}" style="width:500px;" class="input_form1"  maxlength="100">
										</td>
									</tr>
								</table>
							</td>
						</tr>
						<tr height="10px">
						</tr>
						<tr>
							<td align="right">
								<img src="/img/accou_icon.gif" alt="계산" border="0" onclick="javascript:goCalculation();" style="cursor:pointer" >
								<img src="/img/save_icon2.gif" alt="저장" border="0" onclick="javascript:goSubmit();" style="cursor:pointer" >
								<img src="/img/can_icon.gif" alt="취소" border="0" onclick="javascript:goCancel();" style="cursor:pointer" >
						
							</td>
						
						</tr>
					</table>
					
					
					</c:otherwise>
					</c:choose>
					
					
					




				</td>
			</tr>
		</table>
		</td>
	</tr>

</table>
</form>
</body>
</html>
