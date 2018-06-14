<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ include file="/jsp/common/loginCheck.jsp" %>
<%@ include file="/jsp/common/include.jsp" %>
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
<script language="javascript" src="/js/Ajax_request.js"></script>

<script>

	function goSearch()
	{
		var section = document.getElementById("View_Disuse").value;
		var bj_cd = document.getElementById("BJ_CD").value;
		var bonbun = document.getElementById("BONBUN").value;
		var bubun = document.getElementById("BUBUN").value;
		var jumyongName = document.getElementById("jumyongName").value;
		var numberValue = document.getElementById("numberValue").value;
		var fromDate = document.getElementById("fromDate").value;
		var toDate = document.getElementById("toDate").value;
		var maintn_ob = document.getElementById("MAINTN_OB").value;
		var gu_cd = getValueSelectTag("GU_CD");
		var mg_typ = getValueSelectTag("MG_TYP");
		var ft_typ = document.getElementById("FT_TYP").value;

		location.href="/rojum/jumyong/search.do?gu_cd="+gu_cd+"&bj_cd="+bj_cd+"&bonbun="+bonbun+"&bubun="+bubun
		+"&jumyongName="+jumyongName+"&numberValue="+numberValue
		+"&fromDate="+fromDate+"&toDate="+toDate+"&maintn_ob="+maintn_ob
		+"&section="+section+"&mg_typ="+mg_typ+"&ft_typ="+ft_typ;
	}

	function excel_Search()
	{
		var section = document.getElementById("View_Disuse").value;
		var bj_cd = document.getElementById("BJ_CD").value;
		var bonbun = document.getElementById("BONBUN").value;
		var bubun = document.getElementById("BUBUN").value;
		var jumyongName = document.getElementById("jumyongName").value;
		var numberValue = document.getElementById("numberValue").value;
		var fromDate = document.getElementById("fromDate").value;
		var toDate = document.getElementById("toDate").value;
		var maintn_ob = document.getElementById("MAINTN_OB").value;
		var gu_cd = getValueSelectTag("GU_CD");
		var mg_typ = getValueSelectTag("MG_TYP");
		var ft_typ = document.getElementById("FT_TYP").value;

		location.href="/rojum/jumyong/excel_search.do?gu_cd="+gu_cd+"&bj_cd="+bj_cd+"&bonbun="+bonbun+"&bubun="+bubun
		+"&jumyongName="+jumyongName+"&numberValue="+numberValue
		+"&fromDate="+fromDate+"&toDate="+toDate+"&maintn_ob="
		+maintn_ob+"&section="+section+"&mg_typ="+mg_typ+"&ft_typ="+ft_typ;
	}
	
	function InitPage()
	{		
		setYear();
		if('${message}'.length > 0){
			alert('${message}');
		}
		changeSelectTag('View_Disuse','${section}');
	}
	
	function checkKeySearch(){
		if(event.keyCode == "13")
			goSearch();
	}

    function setYear()
    {
        now = new Date();
        Y = now.getFullYear();

        var strYear = "${YearVal}";

        for(var i = 0 ; i < 10 ; i++){
            newItem = new Option(i);
            document.getElementById("YEAR").options[i]  = newItem;
            document.getElementById("YEAR").options[i].text = Y+2-i;
            document.getElementById("YEAR").options[i].value = Y+2-i;
            if(strYear == Y-i) document.getElementById("YEAR").options[i].selected = true;
        }

        document.getElementById("YEAR").options.value = strYear;
    }


    function rojum_Individual(){
        var f = document.jumyongForm;
        var select_item = document.getElementsByName("SELECT_ITEM");
        var item_check = document.getElementsByName("ITEM_CHECK");
        var gapan_no = document.getElementsByName("GAPAN_NO");
        var max_year = document.getElementsByName("MAX_YEAR");

        var count = 0;
        var hitFlag;

        for(var i = 0 ; i < select_item.length ; i++){
            if(select_item[i].checked == true){
                item_check[i].value = select_item[i].checked;
                count++;
                hitFlag = i;
            }
        }
        if(count <= 0){
            alert("점용료 대상을 선택하세요.");
            return;
        }else if(count==1){
			var param = "/rojum/jumyong/view.do?GAPAN_NO="+gapan_no[hitFlag].value+"&cal_mode=cal1";
            location.href=param;
            
        }else{
            MessageDisplay('Dlg_BatchCal1','Dlg_BatchCal1Main',1);
        }
		
    }

    function rojum_Register(){
    	location.href="/rojum/jumyong/register.do";
	}

    function click_History(idx){
    	var f = document.jumyongForm;
		var gapan_no = document.getElementsByName("GAPAN_NO");
		var param = "/rojum/jumyong/history_info.do?GAPAN_NO="+gapan_no[idx].value;

		location.href=param;
    }

    function rojum_Cal2(){
    	var f = document.jumyongForm;
		var select_item = document.getElementsByName("SELECT_ITEM");
		var item_check = document.getElementsByName("ITEM_CHECK");
		var gapan_no = document.getElementsByName("GAPAN_NO");
		var count = 0;
		var hitFlag;

		for(var i = 0 ; i < select_item.length ; i++){
			item_check[i].value = select_item[i].checked;
			if(select_item[i].checked == true){
				count++;
				hitFlag = i;
			}
		}
		if(count <= 0){
			alert("처리할 데이터가 없습니다. ");
			return;
		}else if(count == 1){
			var section = document.getElementById("View_Disuse").value;
			var bj_cd = document.getElementById("BJ_CD").value;
			var bonbun = document.getElementById("BONBUN").value;
			var bubun = document.getElementById("BUBUN").value;
			var jumyongName = document.getElementById("jumyongName").value;
			var numberValue = document.getElementById("numberValue").value;
			var fromDate = document.getElementById("fromDate").value;
			var toDate = document.getElementById("toDate").value;
			var maintn_ob = document.getElementById("MAINTN_OB").value;
			var gu_cd = getValueSelectTag("GU_CD");
			var mg_typ = getValueSelectTag("MG_TYP");

			var param = "/rojum/jumyong/view.do?GAPAN_NO="+gapan_no[hitFlag].value+"&cal_mode=cal2"
			+"&gu_cd="+gu_cd+"&bj_cd="+bj_cd+"&bonbun="+bonbun+"&bubun="+bubun+"&jumyongName="+jumyongName+"&numberValue="+numberValue
			+"&fromDate="+fromDate+"&toDate="+toDate+"&maintn_ob="+maintn_ob+"&section="+section+"&mg_typ="+mg_typ;

			location.href=param;

		}else{
			alert("변상금산출은 일괄산출이 안됩니다. 한건만 선택하세요.");
		}
    }
        
    function rojum_Cal3(){
    	var f = document.jumyongForm;
		var select_item = document.getElementsByName("SELECT_ITEM");
		var item_check = document.getElementsByName("ITEM_CHECK");
		var gapan_no = document.getElementsByName("GAPAN_NO");
		var count = 0;
		var hitFlag;

		for(var i = 0 ; i < select_item.length ; i++){
			item_check[i].value = select_item[i].checked;
			if(select_item[i].checked == true){
				count++;
				hitFlag = i;
			}
		}
		if(count <= 0){
			alert("처리할 데이터가 없습니다. ");
			return;
		}else if(count == 1){
			var section = document.getElementById("View_Disuse").value;
			var bj_cd = document.getElementById("BJ_CD").value;
			var bonbun = document.getElementById("BONBUN").value;
			var bubun = document.getElementById("BUBUN").value;
			var jumyongName = document.getElementById("jumyongName").value;
			var numberValue = document.getElementById("numberValue").value;
			var fromDate = document.getElementById("fromDate").value;
			var toDate = document.getElementById("toDate").value;
			var maintn_ob = document.getElementById("MAINTN_OB").value;
			var gu_cd = getValueSelectTag("GU_CD");
			var mg_typ = getValueSelectTag("MG_TYP");


			var param = "/rojum/jumyong/view.do?GAPAN_NO="+gapan_no[hitFlag].value+"&cal_mode=cal3"
			+"&gu_cd="+gu_cd+"&bj_cd="+bj_cd+"&bonbun="+bonbun+"&bubun="+bubun+"&jumyongName="+jumyongName+"&numberValue="+numberValue
			+"&fromDate="+fromDate+"&toDate="+toDate+"&maintn_ob="+maintn_ob+"&section="+section+"&mg_typ="+mg_typ;

			location.href=param;

		}else{
			alert("과태료 산출은 일괄산출이 안됩니다. 한건만 선택하세요.");
		}
        
    }    


    function rojum_Return(){

    	var f = document.jumyongForm;
		var select_item = document.getElementsByName("SELECT_ITEM");
		var item_check = document.getElementsByName("ITEM_CHECK");
		var gapan_no = document.getElementsByName("GAPAN_NO");
		var tax_at = document.getElementsByName("TAX_AT");
		var count = 0;
		var hitFlag;

		for(var i = 0 ; i < select_item.length ; i++){
			if(select_item[i].checked == true && tax_at[i].value != '1'){
				item_check[i].value = select_item[i].checked;
				count++;
				hitFlag = i;
			}
		}

		if(count <= 0){
			alert("반환대상을 선택하세요. ");
			return;
		}else{
			f.ReturnMsg.value = '폐기 / 매각, 점용료 대상을 제외한\n'+count+'건에 대해 반환일자를 선택하세요.';
            MessageDisplay('Dlg_Return','Dlg_ReturnMain',1);
		
		}
    }

	function owner_list(owner_name,mode,target_name,target_ssn)
    {
	    if(owner_name == ''){
		    alert('검색해야할 운영자명을 입력하세요');
		    return;
	    }
	    var winH = 340;
        var winW = 480;
        var top = parseInt(screen.height-winH)/2;
		var left = parseInt(screen.width-winW)/2;
        var status ="toolbar=no, location=no, directories=no, status=no, menubar=no, resizable=no, scrollbars=no, width="+winW+", height="+winH+", left="+left+", top="+top;
        window.open('/rojum/jumyong/owner_list.do?OWNER_NAME='+owner_name+'&mode='+mode+'&target_name='+target_name+'&target_ssn='+target_ssn, 'win', status);
    }

    function rojum_Destroy(){

    	var f = document.jumyongForm;
		var select_item = document.getElementsByName("SELECT_ITEM");
		var item_check = document.getElementsByName("ITEM_CHECK");
		var gapan_no = document.getElementsByName("GAPAN_NO");
		var tax_at = document.getElementsByName("TAX_AT");
		var count = 0;

		for(var i = 0 ; i < select_item.length ; i++){
			if(select_item[i].checked == true && tax_at[i].value != '1'){
				item_check[i].value = select_item[i].checked;
				count++;
				hitFlag = i;
			}
		}
		
		if(count <= 0){
			alert("폐기/매각 대상을 선택하세요. ");
			return;
		}else if(count == 1){
			var section = document.getElementById("View_Disuse").value;
			var bj_cd = document.getElementById("BJ_CD").value;
			var bonbun = document.getElementById("BONBUN").value;
			var bubun = document.getElementById("BUBUN").value;
			var jumyongName = document.getElementById("jumyongName").value;
			var numberValue = document.getElementById("numberValue").value;
			var fromDate = document.getElementById("fromDate").value;
			var toDate = document.getElementById("toDate").value;
			var maintn_ob = document.getElementById("MAINTN_OB").value;
			var gu_cd = getValueSelectTag("GU_CD");
			var mg_typ = getValueSelectTag("MG_TYP");

			var param = "/rojum/jumyong/view.do?GAPAN_NO="+gapan_no[hitFlag].value+"&cal_mode=cal4"
			+"&gu_cd="+gu_cd+"&bj_cd="+bj_cd+"&bonbun="+bonbun+"&bubun="+bubun+"&jumyongName="+jumyongName+"&numberValue="+numberValue
			+"&fromDate="+fromDate+"&toDate="+toDate+"&maintn_ob="+maintn_ob+"&section="+section+"&mg_typ="+mg_typ;

			location.href=param;

		}else{
        	resetDestroy();
			MessageDisplay('BatchDestroy','BatchDestroyMain',1);
		}
    }

    function checkDestroySt(obj){

        if(obj == '0'){
        	resetDestroy();
        	document.getElementsByName("DESTROY_ST")[0].checked = true;
        	document.getElementById("DestroyProgress").style.display = 'block'; 
        	document.getElementById("DestroyComplete").style.display = 'none';
        }else if(obj == '1'){
        	resetDestroy();
        	document.getElementsByName("DESTROY_ST")[1].checked = true;
        	document.getElementById("DestroyProgress").style.display = 'none'; 
        	document.getElementById("DestroyComplete").style.display = 'block';
        }else if(obj == '-1'){
        	document.getElementById("DestroyProgress").style.display = 'none'; 
        	document.getElementById("DestroyComplete").style.display = 'none';
        }
    }

    function DestroyPrc(){
        var f = document.jumyongForm;
		var select_item = document.getElementsByName("SELECT_ITEM");
		var item_check = document.getElementsByName("ITEM_CHECK");
		var gapan_no = document.getElementsByName("GAPAN_NO");
		var tax_at = document.getElementsByName("TAX_AT");
		var sale_status = document.getElementsByName("SALE_STATUS_ARR");
		var count = 0;
		var _destroy_st = f.DESTROY_ST;

		var desType = "";
		
		// 진행중
        if( _destroy_st[0].checked){
    		for(var i = 0 ; i < select_item.length ; i++){
    			if(select_item[i].checked == true && tax_at[i].value != '1' && sale_status[i].value == ''){
    				item_check[i].value = select_item[i].checked;
    				count++;
    			}
    		}

    		
    		if(!confirm("폐기/매각 진행이 가능한 "+count+ "건에 대해서 일괄처리 하시겠습니까?")){
                return;
            }

    		desType = "Progress";
		
        }
     	// 완료중
        else{
    		for(var i = 0 ; i < select_item.length ; i++){
    			if(select_item[i].checked == true && tax_at[i].value != '1' && (sale_status[i].value == '1' || sale_status[i].value == '2')){
    				item_check[i].value = select_item[i].checked;
    				count++;
    			}
    		}

    		if(!confirm("폐기/매각 완료가 가능한 "+count+ "건에 대해서 일괄처리 하시겠습니까?")){
                return;
            }

    		desType = "Complete";

        }

        MessageDisplay('BatchDestroy','BatchDestroyMain',0);
        if(desType == "Progress"){
        	document.jumyongForm.action = '/rojum/jumyong/batch_destroy_prc.do?desType=Progress';
        	document.jumyongForm.submit();
        }else if(desType == "Complete"){
        	document.jumyongForm.action = '/rojum/jumyong/batch_destroy_prc.do?desType=Complete';
        	document.jumyongForm.submit();
        }
    }

    function resetDestroy(){
    	checkDestroySt(-1);

    	document.getElementsByName("DESTROY_ST")[0].checked = false;
    	document.getElementsByName("DESTROY_ST")[1].checked = false;

    	document.getElementById("SALE_DATE").value = "";
    	document.getElementById("SALE_NO").value = "";
    	document.getElementById("SALE_BIGO").value = "";
    	document.getElementById("HND_OFFICE").value = "";
    	document.getElementById("HND_DESDATE").value = "";
    	document.getElementById("HND_OPEDATE").value = "";
    	document.getElementById("HND_BIGO").value = "";

    }
    
    
    function changeGuCd(obj){
    	var guCd = getSelectedValue(obj);
        var	param	= "guCd="+guCd;
        sendRequest("/get_bjdong_code.do", param, "GET", ResultChangeGuCd);
    	
    	
    }

    function	ResultChangeGuCd(obj)
    {
    	select_innerHTML(document.getElementById("BJ_CD"),obj);
    }


    ////////////////////////////////AJAX////////////////////////////////////////////
    function getXMLHTTPRequest()
    {
        var xRequest = null;
        xRequest = new ActiveXObject("Microsoft.XMLHTTP");

        return xRequest;
    }

    var req;
    var	call;

    function sendRequest(url, params, HttpMethod, callback)
    {
        req = getXMLHTTPRequest();

        call	= callback;
        if(req){
            req.onreadystatechange = onReadyStateChange;
            req.open(HttpMethod, url, true);
            req.setRequestHeader("Content-Type","application/x-www-form-urlencoded;charset=utf-8");
            req.send(params);
        }
    }

    function onReadyStateChange()
    {
        var ready = req.readyState;
        var data = null;
        if(ready == 4){
            if(this.call	!= null)
            {
                this.call(req.responseText);
            }
        }
    }
    
</script>
</head>
<body onload="javascript:InitPage();">

<form id="jumyongForm" name="jumyongForm" method="post">
<input id="toDateValue" name="toDateValue" value="${toDate}" type="hidden">
<input id="fromDateValue" name="fromDateValue" value="${fromDate}" type="hidden">
<input id="TAX_SET" name="TAX_SET" type="hidden" value="${tax_set}">

<div id="BatchDestroy" style="position:absolute;display: none;">
	<table id="BatchDestroyMain" width="510px" height="210px" border="3" bordercolor="#c9afed" style="border-collapse:collapse;background-color:white;" cellpadding="0" cellspacing="0" class="sub_table">
		<tr>
			<td>
				<table width="100%" height="100%" border="0" bordercolor="#c9dfed" style="border-collapse:collapse;background-color:white;" cellpadding="0" cellspacing="0" class="sub_table">
					<tr height="26px">
						<td align="center">
							<font color="red">폐기/매각 일괄처리</font>
						</td>
					</tr>
					<tr height="26px">
						<td  align="center">
							<input name="DESTROY_ST" type="radio" value="0" onclick="checkDestroySt('0')">폐기매각 진행
							&nbsp;&nbsp;
							<input name="DESTROY_ST" type="radio" value="1" onclick="checkDestroySt('1')">폐기매각 완료
						</td>
					</tr>
					<tr height="108px">
						<td align="center">
							<table id="DestroyProgress"  width="100%" height="100%" border="0" bordercolor="#c9dfed" style="border-collapse:collapse;display:none;" cellpadding="0" cellspacing="0" class="sub_table">
								
								<tr  height="30px" >
									<td colspan="4" align="left" bgcolor="#FFFFFF" class="">
									<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
										<tr>
											<td>
												<span class="sub_stan_blue">&nbsp; * 처리정보 </span>
											</td>
										</tr>
									</table>
									</td>
								</tr>
								<tr height="26px">
									<td align="center" bgcolor="e5eff8" class="sub_table_b">처리방향</td>
									<td bgcolor="eaeaea" class="table_bl_left" align="left" colspan="3">
						                  	<select id="SALE_STATUS" name="SALE_STATUS" class="input_form1">
						                   	<option value="1">폐기</option>
						                   	<option value="2">매각</option>
						                   </select>
									</td>
									
								</tr>
								
								<tr height="26px">
									
									<td width="100px" align="center" bgcolor="e5eff8" class="sub_table_b">공고일자</td>
									<td width="150px" bgcolor="eaeaea" class="table_bl_left" align="left">
									<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
										<tr>
											<td>
												<input id="SALE_DATE" name="SALE_DATE" type="text" value="${rnic:addDash(product.SALE_DATE)}"class="input_form1" style="width:80px;ime-mode:disabled;" onKeyDown="onlyNumberInput();"   onKeyDown="onlyNumberInput();" maxlength=8>
												
											</td>
											<td>
												<img src="/img/calendar_icon.gif" onclick="popUpCalendar(this, document.getElementById('SALE_DATE'), 'yyyymmdd');" style="cursor:pointer;vertical-align:middle;" >
											</td>
										</tr>
									</table>
									</td>
									
									<td width="100px" align="center" bgcolor="e5eff8"	class="sub_table_b">공고번호</td>
									<td width="150px" bgcolor="eaeaea" class="table_bl_left" align="left">
										<input id="SALE_NO" name="SALE_NO" type="text" value="${product.SALE_NO}" style="width:100px;ime-mode:disabled;" class="input_form1" onKeyDown="onlyNumberInput();" maxlength="20">
									</td>
									
								</tr>
									
								
								<tr height="26px">
									<td align="center" bgcolor="e5eff8" class="sub_table_b">처리사유</td>
									<td bgcolor="eaeaea" class="table_bl_left" align="left" colspan="3">
										<input id="SALE_BIGO" name="SALE_BIGO" type="text" value="${product.SALE_BIGO}" style="width:355px;" class="input_form1" maxlength="100">
									</td>
									
								</tr>
							</table>
							
			
							<table id="DestroyComplete" width="100%" height="100%" border="0" bordercolor="#c9dfed" style="border-collapse:collapse;display:none" cellpadding="0" cellspacing="0" class="sub_table">
								<tr height="30px" >
									<td align="left" class="sub_table_b" colspan="4">
									<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
										<tr>
											<td><span class="sub_stan_blue">&nbsp; * 처리결과 </span></td>
										</tr>
									</table>
									</td>
								</tr>
								<tr height="26px">
									<td width="100px" align="center" bgcolor="e5eff8" class="sub_table_b">처리업체명</td>
									<td bgcolor="eaeaea" class="table_bl_left" align="left" colspan="3">
										<input id="HND_OFFICE" name="HND_OFFICE" type="text" value="${product.HND_OFFICE}" style="width:140px;" class="input_form1" maxlength="100">
									</td>
									
								</tr>
								<tr height="26px">
									<td width="100px" align="center" bgcolor="e5eff8" class="sub_table_b">결정일자</td>
									<td width="150px" bgcolor="eaeaea" class="table_bl_left" align="left">
									<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
										<tr>
											<td>
												<input name="HND_DESDATE" id="HND_DESDATE" type="text" value="${rnic:addDash(product.HND_DESDATE)}"class="input_form1" style="width:80px;ime-mode:disabled;" onKeyDown="onlyNumberInput();"   onKeyDown="onlyNumberInput();" maxlength=8>
											</td>
											<td>
												<img src="/img/calendar_icon.gif" onclick="popUpCalendar(this, document.getElementById('HND_DESDATE'), 'yyyymmdd');" style="cursor:pointer;vertical-align:middle;" >
											</td>
										</tr>
									</table>
									</td>
									<td width="100px" align="center" bgcolor="e5eff8" class="sub_table_b">시행일자</td>
									<td width="150px" bgcolor="eaeaea" class="table_bl_left" align="left">
										<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
											<tr>
												<td>
													<input id="HND_OPEDATE" name="HND_OPEDATE" type="text" value="${rnic:addDash(product.HND_OPEDATE)}"class="input_form1" style="width:80px;ime-mode:disabled;" onKeyDown="onlyNumberInput();"   onKeyDown="onlyNumberInput();" maxlength=8>
												</td>
												<td>
													<img src="/img/calendar_icon.gif" onclick="popUpCalendar(this, document.getElementById('HND_OPEDATE'), 'yyyymmdd');" style="cursor:pointer;vertical-align:middle;" >
												</td>
											</tr>
										</table>
									</td>
								</tr>
								<tr height="26px">
									<td align="center" bgcolor="e5eff8" class="sub_table_b" nowrap="nowrap">특이사항</td>
									<td colspan="3" bgcolor="eaeaea" class="table_bl_left" nowrap="nowrap" align="left">
										<input id="HND_BIGO" name="HND_BIGO" type="text" value="${product.HND_BIGO}" style="width:355px;" class="input_form1" maxlength="100">
									</td>
								</tr>
							</table>
						</td>
					</tr>
						
						
						
					<tr height="26px">
						<td align="right">
							<img src="/img/register_icon2.gif" alt="등록" width="56" height="18" border="0" onClick="DestroyPrc();" style="cursor: pointer"> 
							<img src="/img/can_icon.gif" alt="취소" border="0" onclick="MessageDisplay('BatchDestroy','BatchDestroyMain',0);" style="cursor: pointer">
							&nbsp;&nbsp;
						</td>
					</tr>
				</table>
			</td>
		</tr>
	</table>
</div>

<div id="Dlg_BatchCal1" style="position:absolute;display: none;">
	<table id="Dlg_BatchCal1Main" width="300px" height="150px" border="3" bordercolor="#c9afed" style="border-collapse:collapse;background-color:white;" cellpadding="0" cellspacing="0" class="sub_table">
	<tr>
		<td align="center">
			<table width="290px" height="140px" border="0" style="border-collapse:collapse;background-color:white;" cellpadding="0" cellspacing="0" class="sub_table">
				<tr>
				<td height="5px">
				</td>
				</tr>
				<tr>
					<td align="center">
						<font color="red">일괄 점용료계산을 위해 산출년도를 선택하세요.</font>
					</td>
				</tr>
				<tr>
					<td align="center">
						산출년도
						<select id="YEAR" name="YEAR" class="input_form1" style="width:60px">
						</select>
					</td>
				</tr>
				<tr>
					<td align="center" >
						<img src="/img/cal_icon.gif" alt="산출" width="56" height="18" border="0" onClick="document.jumyongForm.action = '/rojum/jumyong/batch_cal1.do';document.jumyongForm.submit();"  style="cursor:pointer">
						<img src="/img/can_icon.gif" alt="취소" border="0" onclick="MessageDisplay('Dlg_BatchCal1','Dlg_BatchCal1Main',0);" style="cursor:pointer" >
					</td>
				</tr>
			</table>
		</td>
	</tr>
	
	
	</table>
</div>

<div id="Dlg_Return" style="position:absolute;display: none;">
	<table id="Dlg_ReturnMain" width="300px" height="150px" border="3" bordercolor="#c9afed" style="border-collapse:collapse;background-color:white;" cellpadding="0" cellspacing="0" class="sub_table">
	<tr>
		<td align="center">
			<table width="290px" height="140px" border="0" style="border-collapse:collapse;background-color:white;" cellpadding="0" cellspacing="0" class="sub_table">
				<tr>
				<td height="5px">
				</td>
				</tr>
				<tr>
					<td align="center">
						<textarea rows="2" cols="1" id ="ReturnMsg" name="ReturnMsg" class="input_form1" style="width:280px;overflow:hidden;text-align:center;border:0px;color:red;" readonly></textarea>
					</td>
				</tr>
				<tr>
					<td align="center">
						반환일자
						<input id ="ReturnDate" name="ReturnDate" value="${thisDate}" type="text" class="input_form1" style="width:80px" readonly>
				    	<img src="/img/calendar_icon.gif" style="cursor:pointer;vertical-align:middle;" onclick="popUpCalendar(this, document.getElementById('ReturnDate'),'yyyymmdd');">
					</td>
				</tr>
				<tr>
					<td align="center" >
						<img src="/img/return_icon.gif" alt="반환" width="56" height="18" border="0" onClick="document.jumyongForm.action = '/rojum/jumyong/returnProduct.do';document.jumyongForm.submit();"  style="cursor:pointer">
						<img src="/img/can_icon.gif" alt="취소" border="0" onclick="MessageDisplay('Dlg_Return','Dlg_ReturnMain',0);" style="cursor:pointer" >
					</td>
				</tr>
			</table>
		</td>
	</tr>
	</table>
</div>


<table width="780px" border="0" cellpadding="0" cellspacing="0">
	<tr>
		<td height="43">
			<img src="/img/sub7_cont1_title.gif" width="800" height="43">
		</td>
	</tr>
	<tr>
		<td>
		<table width="780px" border="0" cellspacing="0" cellpadding="0">

			<tr>
				<td>
				<table width="780px" border="0" cellspacing="0" cellpadding="0">
					<tr>
						<td align="left" height="22" background="/img/tab_line_blue.gif">
						</td>
					</tr>
					<tr>
						<td class="contborder_purple">
							<table width="100%" border="0" cellspacing="0" cellpadding="0">
								<tr>
									<td>
									<table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse: collapse;" cellpadding="0" cellspacing="0" class="sub_table">
										<tr>
											<td height="26px" align="center" bgcolor="e5eff8" class="sub_table_b" >갱신기간</td>
					                      	<td bgcolor="eaeaea" class="table_bl_left" colspan="3">
											  <table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
						                        <tr>
						                          <td>
						                          <input id="fromDate" name="fromDate" value="${fromDate}" type="text" class="input_form1" style="width:80px" readonly></td>
						                          <td>
						                          <img src="/img/calendar_icon.gif" style="cursor:pointer" onclick="popUpCalendar(this, document.getElementById('fromDate'), 'yyyymmdd');">
												  </td>
						                          <td width="16" align="center">&nbsp;&nbsp;~&nbsp;&nbsp;</td>
						                          <td>
						                            <input id ="toDate" name="toDate" value="${toDate}" type="text" class="input_form1" style="width:80px" readonly></td>
						                          <td>&nbsp;<img src="/img/calendar_icon.gif" style="cursor:pointer" onclick="popUpCalendar(this, document.getElementById('toDate'), 'yyyymmdd');">
						                          </td>
												</tr>
						                      </table>
						                  	</td>
										</tr>
										<tr>
											<td height="26px" width="100px" align="center" bgcolor="e5eff8" class="sub_table_b">등록구분</td>
											<td width="35%" bgcolor="eaeaea" class="table_bl_left" >
												<select id="MG_TYP" name="MG_TYP" class="input_form1" style="width:100px">
													${mg_typ}
												</select>
											</td>
											<td height="26px" width="100px" align="center" bgcolor="e5eff8" class="sub_table_b">정비/관리</td>
											<td bgcolor="eaeaea" class="table_bl_left" >
												<select id="MAINTN_OB" name="MAINTN_OB" class="input_form1" style="width:100px">
													${maintn_ob}
												</select>
											</td>
										</tr>
										<tr>
											<td height="26px" align="center" bgcolor="e5eff8"	class="sub_table_b">시군구</td>
											<td bgcolor="eaeaea" class="table_bl_left">
											<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
												<tr>
													<td>
														<select id="GU_CD" name="GU_CD" class="input_form1" style="width: 130px" onchange="changeGuCd(this);">
															${gu_code}
														</select>
													</td>
												</tr>
											</table>
											</td>
											<td align="center" bgcolor="e5eff8"	class="sub_table_b">법정동</td>
											<td bgcolor="eaeaea" class="table_bl_left">
											<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
												<tr>
													<td>
														<select id="BJ_CD" name="BJ_CD" class="input_form1" style="width: 130px">
															${bjdong_code}
														</select>
													</td>
												</tr>
											</table>
											</td>
	
										</tr>
	
										<tr>
											<td height="26px" align="center" bgcolor="e5eff8" class="sub_table_b">번 지</td>
											<td bgcolor="eaeaea" class="table_bl_left">
											<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
												<tr>
													<td>
														<input id="BONBUN" name="BONBUN" type="text" class="input_form1" value="${bonbun}" style="width: 40px">
														- <input id="BUBUN" name="BUBUN" type="text" class="input_form1" value="${bubun}" style="width: 40px">
													</td>
												</tr>
											</table>
											</td>
											<td align="center" bgcolor="e5eff8" class="sub_table_b">운영인</td>
											<td bgcolor="eaeaea" class="table_bl_left">
												<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
													<tr>
														<td>
															<input id="jumyongName" name="jumyongName" type="text" class="input_form1" style="width: 130px" onKeyDown="javascript:checkKeySearch();" value="${jumyongName}">
														</td>
													</tr>
												</table>
											</td>
										</tr>
										
										<tr>
											<td height="26px" align="center" bgcolor="e5eff8" class="sub_table_b">관리번호</td>
											<td bgcolor="eaeaea" class="table_bl_left">
												<input id="numberValue" name="numberValue" type="text" class="input_form1" style="width: 130px" onKeyDown="javascript:checkKeySearch();" value="${numberValue}">
											</td>
											<td align="center" bgcolor="e5eff8" class="sub_table_b">폐쇄목록</td>
											<td bgcolor="eaeaea" class="table_bl_left">
												<select id="View_Disuse" name="View_Disuse" class="input_form1" style="width:100px">
													<option value="1">감춤</option>
													<option value="4">보기</option>
												</select>
											</td>
					                    </tr>			
					                    
					                    <tr>
											<td align="center" bgcolor="e5eff8" class="sub_table_b">시설종류</td>
											<td bgcolor="eaeaea" class="table_bl_left" colspan="3">
												<select id="FT_TYP" name="FT_TYP" class="input_form1" style="width:100px">
													<option value="">전체</option>
													<option value="021">거리가게</option>
													<option value="022">적치물</option>
												</select>
											</td>
					                    </tr>		       
									</table>
								</td>
							</tr>

							<tr>
								<td height="40px" align="right">
								<img src="/img/inquiry_icon2.gif" alt="조회" width="56" height="18" border="0" onclick="javascript:goSearch();" style="cursor: pointer"></td>
							</tr>
							<tr>
								<td height="2px" bgcolor="#EAEAEA"></td>
							</tr>
							
							<tr>
								<td>
									<table width="100%">
										<tr>
                                            <td height="34" class="sub_stan" align="left">전체건수&nbsp;:&nbsp;<span class="sub_stan_blue">${listCount}</span>건&nbsp;/&nbsp;운영자 미확인&nbsp;:&nbsp;<span class="sub_stan_blue">${unconfirmListCount}</span>건
                                            </td>
											<td align="right">
												<img src="/img/excel_icon.gif" alt="EXCEL 변환" border="0" onclick="javascript:excel_Search();" style="cursor:pointer;">
											</td>
										</tr>
									</table>
								</td>
							</tr>
							<tr>
								<td>
								<table width="780px" cellpadding="0" cellspacing="0" border="0" class="sub_table" bordercolor="#c9dfed" style="border-collapse:collapse;">
								  <TR>
								    <TD width="26px"  valign="top">
								      <TABLE cellpadding="0" cellspacing="0" border="1" class="sub_table" bordercolor="#c9dfed" style="border-collapse:collapse;">
								        <TR>
								              <td height="26px" width="26px" align="center" bgcolor="e5eff8" class="sub_table_b">
												<INPUT TYPE="checkbox" ID="SELECT_ALL" onclick="javascript:selectAll(this);">
											  </td>
								        </TR>
								      </TABLE>
								    </TD>
								    <TD width="754px" valign="top">
								      <DIV id="topLine2" style="width:754px;overflow:hidden;">
								        <TABLE width="1120px" cellpadding="0" cellspacing="0" border="1" class="sub_table" bordercolor="#c9dfed" style="border-collapse:collapse;">
								          <tr>
						  					<td height="26px" width="100px" align="center" bgcolor="e5eff8" class="sub_table_b">관리번호</td>
						  					<td width="100px" align="center" bgcolor="e5eff8" class="sub_table_b">등록구분</td>
						  					<td width="120px" align="center" bgcolor="e5eff8" class="sub_table_b">시설종류</td>
						  					<td width="100px" align="center" bgcolor="e5eff8" class="sub_table_b">수거일</td>
						  					<td width="100px" align="center" bgcolor="e5eff8" class="sub_table_b">보관일</td>
						  					<td width="80px" align="center" bgcolor="e5eff8" class="sub_table_b">운영인</td>						  					
						  					<td width="140px" align="center" bgcolor="e5eff8" class="sub_table_b">인접지 주소</td>
						  					<!--  //********** BEGIN_KANG_20120423 -->
											<!-- 
											<td width="150px" align="center" bgcolor="e5eff8" class="sub_table_b">인접지 새주소</td>
											-->
											<!--   //********** END_KANG_20120423 -->
						  					<td width="100px" align="center" bgcolor="e5eff8" class="sub_table_b">상&nbsp;&nbsp;&nbsp;&nbsp;태</td>
						  					<td width="80px" align="center" bgcolor="e5eff8" class="sub_table_b">면적(㎡)</td>
						  					<td width="100px" align="center" bgcolor="e5eff8" class="sub_table_b">정비/관리</td>
						  					<td width="100px" align="center" bgcolor="e5eff8" class="sub_table_b">갱신일자</td>
								          </tr>
								        </TABLE>
								      </DIV>
								    </TD>
								  </TR>
								  <TR>
								    <TD width="26px" valign="top">
								        <TABLE cellpadding="0" cellspacing="0" border="1" class="sub_table" bordercolor="#c9dfed" style="border-collapse:collapse;">
						          			<c:forEach items="${blist1}" var="board" varStatus="idx">
						  					<tr onMouseOver="this.style.backgroundColor='#f6f7f8'" onMouseOut="this.style.backgroundColor=''"	style="cursor: pointer">
						  						<td height="26px" width="26px" align="center" bgcolor="e5eff8" class="sub_table_b">
													<!-- 개별 및 일괄 선택에 필요한 값 -->
						  							<INPUT TYPE="checkbox" NAME="SELECT_ITEM">
						  							<INPUT TYPE="hidden" NAME="GAPAN_NO" value="${board.ADMIN_NO}"> 
						  							<INPUT TYPE="hidden" NAME="ITEM_CHECK" value="">
						  							<INPUT TYPE="hidden" NAME="TAX_AT" value="${board.TAXTATION_AT}">
						  							<INPUT TYPE="hidden" NAME="SECTION" value="${board.SECTION}">
						  							<INPUT TYPE="hidden" NAME="OWNER_SSN" value="${board.OWNER_SSN}">
						  							<INPUT TYPE="hidden" NAME="NAME" value="${board.NAME}">
						  							<INPUT TYPE="hidden" NAME="SALE_STATUS_ARR" value="${board.SALE_STATUS}">
						  						</td>
						  					</tr>
											</c:forEach>
								        </TABLE>
								    </TD>
								    <TD width="754px" valign="top">
								      <DIV id="mainDisplay2" style="width:754px;overflow-y:hidden;overflow-x:scroll;scrollbar-face-color:#EEF8FB;scrollbar-3dlight-color:#BBBDB6; scrollbar-highlight-color:#EEF8FB;scrollbar-shadow-color:#BBBDB6; scrollbar-darkshadow-color:#EEF8FB;scrollbar-track-color:#EEF8FB;scrollbar-arrow-color:#BBBDB6;" onScroll="scrollColumn()">
								        <TABLE width="1120px" cellpadding="0" cellspacing="0" border="1" class="sub_table" bordercolor="#c9dfed" style="border-collapse:collapse;">
								          <c:forEach items="${blist1}" var="board" varStatus="idx">
												<tr onMouseOver="this.style.backgroundColor='#f6f7f8'" onMouseOut="this.style.backgroundColor=''"	style="cursor: pointer" onclick="click_History('${idx.count-1}');">
													<td height="26px" width="100px" align="center">${board.ADMIN_NO}</td>
													<td width="100px" align="center">
														${board.MANAGE_TYP}
													</td>
													<td width="120px" align="center">
														${board.FT_TYP_NM}&nbsp;/&nbsp;${board.FT_SEL_NM}
													</td>
													<td width="100px" align="center">
														${rnic:addDash(board.PICKUP_DATE)}
													</td>
													<!--  //********** BEGIN_KANG_20120423 -->
													<td width="100px" align="center">
														<c:if test="${board.PASS_DAY != '-'}">
														<fmt:formatNumber pattern="#,#00" value="${board.PASS_DAY}"/>
														</c:if>
														<c:if test="${board.PASS_DAY == '-'}">
														-
														</c:if>
													</td>
													<!--   //********** END_KANG_20120423 -->
													<td width="80px" align="center">${board.NAME}</td>
													<td width="140px" align="center">${board.ADDR}</td>
													<!--  //********** BEGIN_KANG_20120423 -->
													<!-- 
													<td width="150px" align="center">${board.SI} &nbsp;${board.GUN}&nbsp; ${board.DORO_NM}&nbsp; ${board.BD_BON}&nbsp; ${board.BD_BU}&nbsp; ${board.BD_NM}&nbsp; ${board.BD_DET_NM}</td>
													-->
													<!--   //********** END_KANG_20120423 -->
													<td width="100px" align="center"><font color="red">${board.TOTAL_STATUS}</font></td>
													<td width="80px" align="center">${board.PLACE_A}</td>
													<td width="100px" align="center">
														<c:choose>
															<c:when test="${board.MAINTN_OB == '1'}">
															관리대상
															</c:when>
															<c:otherwise>
															정비대상
															</c:otherwise>
														</c:choose>
													</td>
													<td width="100px" align="center">${rnic:addDash(board.UP_DATE)}</td>
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
							  <td height="40" align="center">
							   <table width="100%" border="0" cellspacing="0" cellpadding="0">
							       <tr>
							         <td align="center">
							         	<table border="0" cellpadding="0" cellspacing="0">
							            <tr>
							            	${strPageDivideForm}
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
				</td>
			</tr>
			<tr>
				<td height="10px"></td>
			</tr>
			<tr>
				<td>
					<table width="100%">
                    <tr>
                     <td width="30%" align="left">
                     	<img src="/img/rojum_register.gif" alt="신규등록" border="0" onclick="javascript:rojum_Register();" style="cursor:pointer;">
                     </td>
                     <td align="right">
                     	<img src="/img/rojum_cal1.gif" alt="점용료산출" border="0" onclick="javascript:rojum_Individual();" style="cursor:pointer;">
	                    <img src="/img/rojum_cal2.gif" alt="변상금산출" border="0" onclick="javascript:rojum_Cal2();" style="cursor:pointer;">
						<img src="/img/rojum_cal3.gif" alt="과태료산출" border="0" onclick="javascript:rojum_Cal3();" style="cursor:pointer;">
						<img src="/img/rojum_destroy.gif" alt="폐기 /매각" border="0" onclick="javascript:rojum_Destroy();" style="cursor:pointer;">
						<img src="/img/rojum_return_icon.gif" alt="수거물 반환" border="0" onclick="javascript:rojum_Return();" style="cursor:pointer;">
                     </td>
                    </tr>
                   </table>
				</td>
			</tr>
			<tr>
				<td height="10px"></td>
			</tr>
			<tr>
				<td align="right">
				
				</td>
			</tr>
		</table>
		
		</td>
	</tr>
</table>
</form>
</body>

 <script type="text/javascript">
 var ft_type = "${FT_TYP}";
 //alert(parseInt(ft_type));
 if(ft_type == null)
		document.getElementById("FT_TYP").value = "";
	else 
		 document.getElementById("FT_TYP").value = ft_type;
 </script>

</html>