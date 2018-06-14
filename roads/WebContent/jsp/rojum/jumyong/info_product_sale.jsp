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

    	if('${product.SALE_STATUS}' == '1'){
    		setSelectedOption(document.getElementById("SALE_STATUS_1"),1);
        	setSelectedOption(document.getElementById("SALE_STATUS_2"),0);
    	}else if('${product.SALE_STATUS}' == '2'){
    		setSelectedOption(document.getElementById("SALE_STATUS_1"),2);
        	setSelectedOption(document.getElementById("SALE_STATUS_2"),0);
		}else if('${product.SALE_STATUS}' == '3'){
    		setSelectedOption(document.getElementById("SALE_STATUS_1"),1);
        	setSelectedOption(document.getElementById("SALE_STATUS_2"),2);
		}else if('${product.SALE_STATUS}' == '4'){
    		setSelectedOption(document.getElementById("SALE_STATUS_1"),2);
        	setSelectedOption(document.getElementById("SALE_STATUS_2"),2);
		}
    	
		var obj = document.form.message.value;
		
		if(obj != "")	
			alert(obj);
			return;
	}
			
	// 수정화면 이동
	function	goModify()
	{
		location.href("/rojum/jumyong/rojumSale.do?GAPAN_NO=${GAPAN_NO}&seq=${seq}&mode=edit");
	}

	function goSubmit(){

		var status = document.getElementById("SALE_STATUS");
		var status_1 = document.getElementById("SALE_STATUS_1").value;
		var status_2 = document.getElementById("SALE_STATUS_2").value;

		status.value = parseInt(status_1)+parseInt(status_2);

		var hnd_desdate = document.getElementById("HND_DESDATE");
		var hnd_opedate = document.getElementById("HND_OPEDATE");
		var sale_date = document.getElementById("SALE_DATE");

		hnd_desdate.value = removeDash(hnd_desdate.value);
		hnd_opedate.value = removeDash(hnd_opedate.value);
		sale_date.value = removeDash(sale_date.value);


		var form = document.form;

		if(document.getElementById("mode").value == 'edit'){
			form.action = "/rojum/jumyong/rojumSale.do?GAPAN_NO=${GAPAN_NO}&seq=${seq}&mode=edit";
		}else{
			form.action = "/rojum/jumyong/rojumSale.do?GAPAN_NO=${GAPAN_NO}&seq=${seq}";
		}

		form.submit();


	}

	

	function goDelete(){
		 if(!confirm("삭제하시겠습니까?"))
             return;
         
        location.href("/rojum/jumyong/rojumSale.do?GAPAN_NO=${GAPAN_NO}&seq=${seq}&mode=del");
	}


	
	
//]]>
</script>


<body onload="InitPage()">

<form id="form" name="form" method="post">
<input type="hidden" id="GAPAN_NO" name="GAPAN_NO" value="${GAPAN_NO}">
<input type="hidden" id="message" name="message" value="${message}">
<input type="hidden" id="mode" name="mode" value="${mode}">
<input type="hidden" id="SALE_STATUS" name="SALE_STATUS" value="${product.SALE_STATUS}">

<table width="780" border="0" cellspacing="0" cellpadding="0">
    <tr>
        <td class="contborder_purple">
            <table width="100%" border="0" cellspacing="0" cellpadding="0">
					<c:choose>
						<c:when test="${mode == 'view'}">
							<tr>
								<td>
								<table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0" class="sub_table">
									<tr>
										<td height="30" colspan="2" align="left" bgcolor="#FFFFFF" class="">
										<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
											<tr>
												<td>
													<span class="sub_stan_blue">&nbsp; * 처리정보 </span>
												</td>
											</tr>
										</table>
										</td>
										<td height="30" colspan="2" align="left" bgcolor="#FFFFFF" class="">
										<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
											<tr>
												<td><span class="sub_stan_blue">&nbsp; * 공고정보 </span></td>
											</tr>
										</table>
										</td>
									</tr>
									<tr>
										<td width="100" align="center" bgcolor="e5eff8" class="sub_table_b">처리방향</td>
										<td width="37%" bgcolor="eaeaea" class="table_bl_left">
											<c:choose>
												<c:when test="${product.SALE_STATUS == '1' || product.SALE_STATUS == '3'}">
													폐기
												</c:when>
												<c:otherwise>
													매각
												</c:otherwise>
											</c:choose>
										</td>
										<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">공고일자</td>
										<td bgcolor="eaeaea" class="table_bl_left">
										<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
											<tr>
												<td>
													${rnic:addDash(product.SALE_DATE)}
												</td>
												<td></td>
											</tr>
										</table>
										</td>
									</tr>
									<tr>
										<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">처리사유</td>
										<td bgcolor="eaeaea" class="table_bl_left">
											${product.SALE_BIGO}
										</td>
										<td height="26" align="center" bgcolor="e5eff8"	class="sub_table_b">공고번호</td>
										<td bgcolor="eaeaea" class="table_bl_left">
											${product.SALE_NO}
										</td>
									</tr>
									<tr>
										<td height="30" align="left" class="sub_table_b" colspan="4">
										<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
											<tr>
												<td><span class="sub_stan_blue">&nbsp; * 처리결과 </span></td>
											</tr>
										</table>
										</td>
									</tr>
									<tr>
										<td align="center" bgcolor="e5eff8" class="sub_table_b">처리결과</td>
										<td bgcolor="eaeaea" class="table_bl_left">
											<c:choose>
												<c:when test="${product.SALE_STATUS == '1' || product.SALE_STATUS == '2'}">
													진행
												</c:when>
												<c:otherwise>
													완료
												</c:otherwise>
											</c:choose>
										</td>
										<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">결정일자</td>
										<td bgcolor="eaeaea" class="table_bl_left">
										<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
											<tr>
												<td>${rnic:addDash(product.HND_DESDATE)}</td>
												<td></td>
											</tr>
										</table>
										</td>
									</tr>
									<tr>
										<td align="center" bgcolor="e5eff8" class="sub_table_b">처리업체명</td>
										<td bgcolor="eaeaea" class="table_bl_left">
										${product.HND_OFFICE}
										</td>
										<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">시행일자</td>
										<td bgcolor="eaeaea" class="table_bl_left">
										<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
											<tr>
												<td>${rnic:addDash(product.HND_OPEDATE)}</td>
												<td></td>
											</tr>
										</table>
										</td>
									</tr>
									<tr>
										<td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b" nowrap="nowrap">특이사항</td>
										<td width="37%" colspan="3" bgcolor="eaeaea" class="table_bl_left" nowrap="nowrap">
											${product.HND_BIGO}
										</td>
									</tr>

								</table>
								</td>
							</tr>
							<tr height="10px">
							</tr>
							<tr>
								<td align="right">
									<img src="/img/mod_icon.gif" alt="수정" border="0" onclick="javascript:goModify();" style="cursor: pointer">
									<img src="/img/del_icon3.gif" alt="삭제" border="0" onclick="javascript:goDelete();" style="cursor: pointer">
								</td>
							</tr>
						</c:when>

						<c:otherwise>
							<tr>
								<td>
								<table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse: collapse;" cellpadding="0" cellspacing="0" class="sub_table">
									<tr>
										<td height="30" colspan="2" align="left" bgcolor="#FFFFFF" class="">
										<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
											<tr>
												<td>
													<span class="sub_stan_blue">&nbsp; * 처리정보 </span>
												</td>
											</tr>
										</table>
										</td>
										<td height="30" colspan="2" align="left" bgcolor="#FFFFFF" class="">
										<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
											<tr>
												<td><span class="sub_stan_blue">&nbsp; * 공고정보 </span></td>
											</tr>
										</table>
										</td>
									</tr>
									<tr>
										<td width="100" align="center" bgcolor="e5eff8" class="sub_table_b">처리방향</td>
										<td width="37%" bgcolor="eaeaea" class="table_bl_left">
					                    	<select id="SALE_STATUS_1" class="input_form1">
						                    	<option value="1">폐기</option>
						                    	<option value="2">매각</option>
						                    </select>
										</td>
										<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">공고일자</td>
										<td bgcolor="eaeaea" class="table_bl_left">
										<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
											<tr>
												<td>
													<input id="SALE_DATE" name="SALE_DATE" type="text" value="${rnic:addDash(product.SALE_DATE)}"class="input_form1" style="width:80px;ime-mode:disabled;" onKeyDown="onlyNumberInput();"   onKeyDown="onlyNumberInput();" maxlength=8>
													
												</td>
												<td>
													<img src="/img/calendar_icon.gif" onclick="popUpCalendar(this, document.getElementById('SALE_DATE'), 'yyyymmdd');" style="cursor:pointer;padding-top:5px" >
												</td>
											</tr>
										</table>
										</td>
									</tr>
									<tr>
										<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">처리사유</td>
										<td bgcolor="eaeaea" class="table_bl_left">
											<input id="SALE_BIGO" name="SALE_BIGO" type="text" value="${product.SALE_BIGO}" style="width:250px;" class="input_form1" maxlength="100">
										</td>
										<td height="26" align="center" bgcolor="e5eff8"	class="sub_table_b">공고번호</td>
										<td bgcolor="eaeaea" class="table_bl_left">
											<input id="SALE_NO" name="SALE_NO" type="text" value="${product.SALE_NO}" style="width:100px;ime-mode:disabled;" class="input_form1" onKeyDown="onlyNumberInput();" maxlength="20">
										</td>
									</tr>
									<tr>
										<td height="30" align="left" class="sub_table_b" colspan="4">
										<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
											<tr>
												<td><span class="sub_stan_blue">&nbsp; * 처리결과 </span></td>
											</tr>
										</table>
										</td>
									</tr>
									<tr>
										<td align="center" bgcolor="e5eff8" class="sub_table_b">처리결과</td>
										<td bgcolor="eaeaea" class="table_bl_left">
					                    	<select id="SALE_STATUS_2" class="input_form1">
						                    	<option value="0">진행</option>
						                    	<option value="2">완료</option>
						                    </select>
										</td>
										<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">결정일자</td>
										<td bgcolor="eaeaea" class="table_bl_left">
										<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
											<tr>
												<td>
													<input id="HND_DESDATE" name="HND_DESDATE" type="text" value="${rnic:addDash(product.HND_DESDATE)}"class="input_form1" style="width:80px;ime-mode:disabled;" onKeyDown="onlyNumberInput();"   onKeyDown="onlyNumberInput();" maxlength=8>
												</td>
												<td>
													<img src="/img/calendar_icon.gif" onclick="popUpCalendar(this, document.getElementById('HND_DESDATE'), 'yyyymmdd');" style="cursor:pointer;padding-top:5px" >
												</td>
											</tr>
										</table>
										</td>
									</tr>
									<tr>
										<td align="center" bgcolor="e5eff8" class="sub_table_b">처리업체명</td>
										<td bgcolor="eaeaea" class="table_bl_left">
											<input id="HND_OFFICE" name="HND_OFFICE" type="text" value="${product.HND_OFFICE}" style="width:250px;" class="input_form1" maxlength="100">
										</td>
										<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">시행일자</td>
										<td bgcolor="eaeaea" class="table_bl_left">
										<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
											<tr>
												<td>
													<input id="HND_OPEDATE" name="HND_OPEDATE"  type="text" value="${rnic:addDash(product.HND_OPEDATE)}"class="input_form1" style="width:80px;ime-mode:disabled;" onKeyDown="onlyNumberInput();"   onKeyDown="onlyNumberInput();" maxlength=8>
												</td>
												<td>
													<img src="/img/calendar_icon.gif" onclick="popUpCalendar(this, document.getElementById('HND_OPEDATE'), 'yyyymmdd');" style="cursor:pointer;padding-top:5px" >
												</td>
											</tr>
										</table>
										</td>
									</tr>
									<tr>
										<td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b" nowrap="nowrap">특이사항</td>
										<td width="37%" colspan="3" bgcolor="eaeaea" class="table_bl_left" nowrap="nowrap">
											<input id="HND_BIGO" name="HND_BIGO" type="text" value="${product.HND_BIGO}" style="width:250px;" class="input_form1" maxlength="100">
										</td>
									</tr>

								</table>
								</td>
							</tr>
							<tr height="10px">
							</tr>
							<tr>
								<td align="right">
									<img src="/img/save_icon2.gif" alt="저장" border="0" onclick="javascript:goSubmit();" style="cursor: pointer">
									<img src="/img/can_icon.gif" alt="취소" border="0" onclick="javascript:goCancel();" style="cursor: pointer">
								</td>
							</tr>


						</c:otherwise>



					</c:choose>

				</table>


				</td>
			</tr>
		</table>
</form>
</body>
</html>
