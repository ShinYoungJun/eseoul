<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ include file="/jsp/common/environment_setting.jsp" %> 
<%@ include file="/jsp/common/loginCheck.jsp" %>
<%@ include file="/jsp/common/include.jsp" %>

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
            #tr_fixed_header
            {
                position: relative;
                top: expression(this.offsetParent.scrollTop);
                z-index: 20;
            }

            -->
        </style>
        <link href="/css/roads.css" rel="stylesheet" type="text/css">
        
        <script language="javascript" src="/js/common.js"></script>
        <script language="javascript" src="/js/calculation.js"></script>
        <script language="javascript" src="/js/PopupCalendar.js"></script>
        <script language="javascript" src="/js/Ajax_request.js"></script>
		<script language="javascript" src="/js/selectItem.js"></script>
		<script language="javascript" src="/js/Check_inputbox.js"></script>
		<script language="javascript" src="/jsp/RexServer/rexscript/rexpert.js"></script>
		<script language="javascript" src="/jsp/RexServer/rexscript/rexpert_properties.js"></script>

<script type="text/javascript">
//<![CDATA[
	
	function	Page(page)
	{
		if(page	==	"")
			return;
		
		var form = document.form;

		form.action = "search.do?currentPage=" + page;
		form.submit();
	}

	//********** BEGIN_현진_20120222
	/*
	function	View(adminno,seq)
	{
		var form = document.form;
		//********** BEGIN_현진_20120218
		//form.action = "view.do?ADMIN_NO=" + adminno+"&SEQ="+seq;
		form.action = "/rojum/saewe/view.do?ADMIN_NO=" + adminno+"&SEQ="+seq;
		//********** END_현진_20120218		
		
		form.submit();
	}
	*/
	function	View(adminno,seq, calmode, taxgubun)
	{
		var form = document.form;
		var btnYN = "N";
		if(calmode=='3'&&taxgubun=='3'){
			btnYN = "Y";
		}
//		alert(btnYN);
		form.action = "/rojum/saewe/view.do?ADMIN_NO=" + adminno+"&SEQ="+seq+"&BTNYN="+btnYN;			
		
		form.submit();
	}
	//********** END_현진_20120222	


	function	Search()
	{
		var form = document.form;

		form.currentPage.value	= 1;
		form.action = "search.do";
		form.submit();
	}
	
	function	excel_Search()
	{
		var form = document.form;

		form.currentPage.value	= 1;
		form.action = "excel_search.do";
		form.submit();
	}

	function	Select_UseType(sel)
	{

		document.getElementById("IFRM_PurposeCode").src="/jsp/common/purposeCode/purposeCode.jsp?SectionCode=" + sel.value;
	}

	function	Init()
	{	
		setYear();
		
		var obj = document.form.message.value;
		
		if(obj != "")	
			alert(obj);

		var cal_mode = '${CAL_MODE}';
		
		var tax_gubun = getValueSelectTag('TAX_GUBUN');
		
		if(cal_mode == '3' && tax_gubun == '3'){
			document.form.CAL_MODE.options[3].selected = true;
			//document.getElementById('TAX_GUBUN').disabled = true;
		}else if(cal_mode == '3' && tax_gubun != '3'){
			document.form.CAL_MODE.options[4].selected = true;
		}else if(cal_mode != ''){
			changeSelectTag('CAL_MODE',cal_mode);
		}

		
	}

	function checkKeySearch()
	{
		if(event.keyCode == 13) Search();
	}

	
	function SaeweSuipBugwa_Ilgwal()
	{

		var f = document.form;
		var select_item = document.getElementsByName("SELECT_ITEM");
		var item_check = document.getElementsByName("ITEM_CHECK");
		var gapan_no_arr = document.getElementsByName("GAPAN_NO_ARR");
		var tax_yn_arr = document.getElementsByName("TAX_YN_ARR");
		var sunap_yn_arr = document.getElementsByName("SUNAP_YN_ARR");
		var count = 0;

		for(var i = 0 ; i < select_item.length ; i++){
			if(select_item[i].checked == true && tax_yn_arr[i].value == '미부과' && sunap_yn_arr[i].value == '미수납'){
				item_check[i].value = select_item[i].checked;
				count++;
			}
		}
		
		if(count <= 0){
			alert("처리 대상이 없습니다.");
			return;
		}else{
			if(!confirm('부과대상이 아닌것을 제외한\n'+count+'건에 대해서 부과하시겠습니까?.'))
				return;
			
			document.getElementById("Bugwa_Ilgwal").onclick = function(){
        		alert("잠시만 기다리세요.");
         	};
			
			form.action = "/rojum/saewe/saeweSuipBugwa_ilgwal.do";
			form.submit();
		
		}
	}

	 function setYear()
    {
        now = new Date();
        Y = now.getFullYear();

        var strYear = "${YEAR}";

        for(var i = 0 ; i < 10 ; i++){
            newItem = new Option(i);
            document.getElementById("YEAR").options[i]  = newItem;
            document.getElementById("YEAR").options[i].text = Y+1-i;
            document.getElementById("YEAR").options[i].value = Y+1-i;
            if(strYear == Y-i) document.getElementById("YEAR").options[i].selected = true;
        }

        document.getElementById("YEAR").options.value = strYear;
    }

	function SaeweSunap(){

		var f = document.form;
		var select_item = document.getElementsByName("SELECT_ITEM");
		var item_check = document.getElementsByName("ITEM_CHECK");
		var gapan_no_arr = document.getElementsByName("GAPAN_NO_ARR");
		var tax_yn_arr = document.getElementsByName("TAX_YN_ARR");
		var sunap_yn_arr = document.getElementsByName("SUNAP_YN_ARR");
		var count = 0;

		for(var i = 0 ; i < select_item.length ; i++){
			if(select_item[i].checked == true && tax_yn_arr[i].value == '부과' && sunap_yn_arr[i].value == '미수납'){
				item_check[i].value = select_item[i].checked;
				count++;
			}
		}
		
		if(count <= 0){
			alert("처리 대상이 없습니다.");
			return;
		}else{
			f.ReturnMsg.value = '수납대상이 아닌 것을 제외한\n'+count+'건에 대해 수납일자를 선택하세요.';
            MessageDisplay('Dlg_Sunap','Dlg_SunapMain',1);
		
		}
	}
	
	
	
	function SearchPenaltyIlgwal(){
	
		var f = document.form;
		form.action = "/rojum/saewe/search_penalty_ilgwal.do";
		form.submit();
	}
	
	
	function changeCalmode(obj){
		for(var i = 0 ; i < obj.options.length ; i++){
			if(obj.options[i].selected){
				if(i == 3){
					changeSelectTag('TAX_GUBUN','3');
					//document.getElementById('TAX_GUBUN').disabled = true;
				}else{
					changeSelectTag('TAX_GUBUN','');
					//document.getElementById('TAX_GUBUN').disabled = false;
				}
			}
		}
	}
	
	
	function changeTaxGubun(){
		
		var cal_mode = document.getElementById('CAL_MODE').options;
		
		for(var i = 0 ; i < cal_mode.length ; i++){
			if(cal_mode[i].selected){
				if(i == 3){
					changeSelectTag('TAX_GUBUN',3);
				}
			}
		}
	}
	
	function ReplyPop(){
		
		var f = document.form;
		var select_item = document.getElementsByName("SELECT_ITEM");
		var item_check = document.getElementsByName("ITEM_CHECK");
		var gapan_no_arr = document.getElementsByName("GAPAN_NO_ARR");
		var cal_mode_arr = document.getElementsByName("CAL_MODE_ARR");
		var tax_gubun_arr = document.getElementsByName("TAX_GUBUN_ARR");
		var tax_yn_arr = document.getElementsByName("TAX_YN_ARR");
		var reply_gubun_arr = document.getElementsByName("REPLY_GUBUN_ARR");
		var reply_etc_arr = document.getElementsByName("REPLY_ETC_ARR");
		var reply_date_arr = document.getElementsByName("REPLY_DATE_ARR");
		var reply_manager_arr = document.getElementsByName("REPLY_MANAGER_ARR");
		
		
		var count = 0;
		var hitCount = 0;
		var target;

		for(var i = 0 ; i < select_item.length ; i++){
			if(select_item[i].checked == true){
			if(cal_mode_arr[i].value == '3' && tax_gubun_arr[i].value == '3' && tax_yn_arr[i].value == '부과'){
				item_check[i].value = select_item[i].checked;
				hitCount++;
				target = i;
			}
			count++;
			}
		}
		
		if(count == 0){
			alert("처리 대상이 없습니다.");
			return;
		}else if(count != 1 || hitCount != 1){
			alert("한건의 부과된 사전통지대상만이 의견제출하실수 있습니다.");
		}else{
			
			changeSelectTag('REPLY_GUBUN',reply_gubun_arr[target].value);
			document.getElementById('REPLY_ETC').innerHTML = reply_etc_arr[target].value; 
			document.getElementById('REPLY_DATE').value = reply_date_arr[target].value; 
			document.getElementById('REPLY_MANAGER').value = reply_manager_arr[target].value; 
			
            MessageDisplay('Dlg_Reply','Dlg_ReplyMain',1);
		}		
	}
	
	//********** BEGIN_현진_20120227
	function bugwa_cancel(){		
		var f = document.form;
		var select_item = document.getElementsByName("SELECT_ITEM");
		var item_check = document.getElementsByName("ITEM_CHECK");
		var gapan_no_arr = document.getElementsByName("GAPAN_NO_ARR");
		var cal_mode_arr = document.getElementsByName("CAL_MODE_ARR");
		var tax_gubun_arr = document.getElementsByName("TAX_GUBUN_ARR");
		var tax_yn_arr = document.getElementsByName("TAX_YN_ARR");
		var reply_gubun_arr = document.getElementsByName("REPLY_GUBUN_ARR");
		var reply_etc_arr = document.getElementsByName("REPLY_ETC_ARR");
		var reply_date_arr = document.getElementsByName("REPLY_DATE_ARR");
		var reply_manager_arr = document.getElementsByName("REPLY_MANAGER_ARR");
		
		
		var count = 0;
		var hitCount = 0;
		var target;

		for(var i = 0 ; i < select_item.length ; i++){
			if(select_item[i].checked == true){
				if(tax_yn_arr[i].value == '부과'){
					item_check[i].value = select_item[i].checked;
					hitCount++;
					target = i;
				}
			count++;
			}
		}
		
		if(count == 0){
			alert("처리 대상이 없습니다.");
			return;
		}else if(count <= 0 || hitCount <= 0){
			alert("부과 철회는 부과된 대상에 대해서만  가능합니다.");
			return;
		}else{
			//if (confirm("부과 철회 하시겠습니까?")){
			if (confirm("부과대상에 대해서만 철회됩니다."+hitCount + "부과 철회 하시겠습니까?")){
				//********** BEGIN_현진_20120322
				//form.action = "/rojum/saewe/bugwa_cancel.do";
				form.action = "/rojum/saewe/bugwa_cancel.do?mode=bugwa";
				//********** END_현진_20120322
				form.submit();
			}else{
				return;
			}
		}		
	}
	//********** END_현진_20120227
		
	//********** BEGIN_현진_20120322
		function deleteData(){		
		var f = document.form;
		var select_item = document.getElementsByName("SELECT_ITEM");
		var item_check = document.getElementsByName("ITEM_CHECK");
		var tax_yn_arr = document.getElementsByName("TAX_YN_ARR");
		
		var count = 0;
		var hitCount = 0;
		var target;

		for(var i = 0 ; i < select_item.length ; i++){
			if(select_item[i].checked == true){
				if(tax_yn_arr[i].value == '미부과'){
					item_check[i].value = select_item[i].checked;
					hitCount++;
					target = i;
				}
			count++;
			}
		}
		
		if(count == 0){
			alert("처리 대상이 없습니다.");
			return;
		}else if(count <= 0 || hitCount <= 0){
			alert("삭제는 미부과 대상에 대해서만  가능합니다.");
			return;
		}else{
			if (confirm("미부과대상에 대해서만 삭제됩니다."+hitCount + "건 삭제 하시겠습니까?")){
				form.action = "/rojum/saewe/bugwa_cancel.do?mode=mibugwa";
				form.submit();
			}else{
				return;
			}
		}		
	}
	//********** END_현진_20120322
	
	function PreNotice(){
		
		var f = document.form;
		var select_item = document.getElementsByName("SELECT_ITEM");
		var item_check = document.getElementsByName("ITEM_CHECK");
		var gapan_no_arr = document.getElementsByName("GAPAN_NO_ARR");
		var seq_arr = document.getElementsByName("SEQ_ARR");
		var tax_yn_arr = document.getElementsByName("TAX_YN_ARR");
		var cal_mode_arr = document.getElementsByName("CAL_MODE_ARR");
		var tax_gubun_arr = document.getElementsByName("TAX_GUBUN_ARR");
		
		var count = 0;
		var hitCount = 0;
		var target;

		for(var i = 0 ; i < select_item.length ; i++){
			if(select_item[i].checked == true){
			if(cal_mode_arr[i].value == '3' && tax_gubun_arr[i].value == '3' && tax_yn_arr[i].value == '부과'){
				item_check[i].value = select_item[i].checked;
				hitCount++;
				target = i;
			}
			count++;
			}
		}
		if(count == 0){
			alert("처리 대상이 없습니다.");
			return;
		}else if(count != 1 || hitCount != 1){
			alert("한건의 부과된 사전통지대상만이 출력하실수 있습니다.");
		}else{
			
			var oRptMainParam;
			oRptMainParam = rex_GetgoDictionay(); 

			// 옵션 - viewer	
			oRptMainParam.put("rex_open_window", "center=yes,scrollbars=no,status=no,toolbar=no,resizable=0,location=no,menu=no,width=800,height=600");
			
			// 필수 - 레포트명
			oRptMainParam.put("rex_rptname", "rojum_pre_notice");

			// 필수 - 데이터 타입 설정
			oRptMainParam.put("rex_datatype", "XML");  // XML, CSV

			// 옵션 - 다른 DB를 연결시
			oRptMainParam.put("rex_userservice", "oracle_jndi");

			// 옵션 - 파라메터 설정
			var form 	= document.form;
			
			oRptMainParam.put("GAPAN_NO" ,gapan_no_arr[target].value);
			oRptMainParam.put("SEQ" ,seq_arr[target].value);
			oRptMainParam.put("USER_ID" ,form.USER_ID.value);
			oRptMainParam.put("IMG_PATH" ,'<%=WebServerURL%>'+'/img/stamp/'+gapan_no_arr[target].value.substring(0,3)+'.png');
			
		
			// preview 팝업 열기
			rex_gfRexRptOpen("popup", oRptMainParam);
		}
	}
	    
		
//]]>
</script>
</head>

<body onload="Init();">
<form id="form" name="form" method="post">
<input type="hidden" id="currentPage" name="currentPage" value="${currentPage}">
<input type="hidden" id="TOTALCNT" name="TOTALCNT" value="${totalcnt}">
<input type="hidden" id="excel" name="excel" value="">
<input type="hidden" id="message" name="message" value="${message}">
<input type="hidden" id="USER_ID" name="USER_ID" value="${USER_ID}">

<div id="Dlg_Reply" style="position:absolute;display:none;">
	<table id="Dlg_ReplyMain" width="200px" height="243px" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;background-color:#c9dfed;filter:Alpha(Opacity=90)" cellpadding="0" cellspacing="0" class="sub_table">
	<tr>
		<td align="center">
			<table width="190px" height="233px" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;background-color:white;" cellpadding="0" cellspacing="0" class="sub_table">
				<tr>
				<td height="25px" colspan="2">
					<font color="red">의견제출 관리</font>
				</td>
				</tr>
				<tr>
					<td width="120px" height="26px" align="center" bgcolor="e5eff8" class="sub_table_b">진행상태</td>
					<td bgcolor="eaeaea" class="table_bl_left">
					  <select id="REPLY_GUBUN" name="REPLY_GUBUN" class="input_form1" style="width:60px">
					  	<option value="1">신청</option>
					  	<option value="2">취소</option>
					  	<option value="3">승인</option>
					 	<option value="4">기각</option>
					  </select>
					</td>
				</tr>
				<tr>
					<td height="26px" align="center" bgcolor="e5eff8" class="sub_table_b">최종변경일자</td>
					<td bgcolor="eaeaea" class="table_bl_left">
						<input id ="REPLY_DATE" name="REPLY_DATE" type="text" class="input_form1" style="width:60px;border:0px" readonly>
					</td>
				</tr>
				<tr>
					<td height="26px" align="center" bgcolor="e5eff8" class="sub_table_b">의견제출자</td>
					<td bgcolor="eaeaea" class="table_bl_left">
						<input id ="REPLY_MANAGER" name="REPLY_MANAGER" value="" type="text" class="input_form1" style="width:60px" maxlength="5">
					</td>
				</tr>
				<tr>
					<td height="26px" align="center" bgcolor="e5eff8" class="sub_table_b" colspan="2">의견요지</td>
				</tr>
				<tr>
					<td colspan="2" height="78px">
						<textarea id ="REPLY_ETC" name="REPLY_ETC" class="input_form1" cols="30" rows="5">
						</textarea>
					</td>
				</tr>
				<tr>
					<td align="center" height="26px" colspan="2">
						<img src="/img/submit.gif" alt="제출" width="56" height="18" border="0" onClick="document.form.action = '/rojum/saewe/submit_reply.do';document.form.submit();"  style="cursor:pointer">
						<img src="/img/can_icon.gif" alt="취소" border="0" onclick="MessageDisplay('Dlg_Reply','Dlg_ReplyMain',0);" style="cursor:pointer" >
					</td>
				</tr>
			</table>
		</td>
	</tr>
	</table>
</div>

<div id="Dlg_Sunap" style="position:absolute;display:none;">
	<table id="Dlg_SunapMain" width="300px" height="150px" border="0" bordercolor="#c9dfed" style="border-collapse:collapse;background-color:#ffffff;" cellpadding="0" cellspacing="0" class="sub_table">
	<tr>
		<td align="center">
			<table width="290px" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
				<tr>
				<td height="5px">
				</td>
				</tr>
				<tr>
					<td align="center">
						<textarea rows="2" cols="1" id ="ReturnMsg" name="ReturnMsg"  class="input_form1" style="width:280px;overflow:hidden;text-align:center;border:0px;color:red;" readonly></textarea>
					</td>
				</tr>
				<tr>
					<td align="center">
						수납일자
						<input id ="SunapDate" name="SunapDate" value="${thisDate}" type="text" class="input_form1" style="width:80px" readonly>
					    <img src="/img/calendar_icon.gif" style="cursor:pointer" onclick="popUpCalendar(this, document.getElementById('SunapDate'), 'yyyymmdd');">
					</td>
				</tr>
				<tr>
					<td align="center" >
						<img src="/img/sunap_icon2.gif" alt="수납" width="56" height="18" border="0" onClick="document.form.action = '/rojum/saewe/saeweSunap.do';document.form.submit();"  style="cursor:pointer">
						<img src="/img/can_icon.gif" alt="취소" border="0" onclick="MessageDisplay('Dlg_Sunap','Dlg_SunapMain',0);" style="cursor:pointer" >
					</td>
				</tr>
			</table>
		</td>
	</tr>
	</table>
</div>

<table width="800px" border="0" cellpadding="0" cellspacing="0">
  <tr>
    <td height="43">
    	<img src="/img/sub7_cont2_title.gif" width="800" height="43">
	</td>
  </tr>
  <tr>
    <td align="center">
    <table width="780" border="0" cellspacing="0" cellpadding="0">
      <tr>
        <td align="left"><table width="780" border="0" cellspacing="0" cellpadding="0">
          <tr>
            <td height="22" background="/img/tab_line_blue.gif">
            </td>
          </tr>
          
          <tr>
            <td class="contborder_blue"><table width="100%" border="0" cellspacing="0" cellpadding="0">
                <tr>
                  <td><table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
                  
				    <tr>
					  <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">산출년도</td>
					  <td bgcolor="eaeaea" class="table_bl_left" colspan="1">
	                      <select id="YEAR" name="YEAR" class="input_form1" style="width:130px">
	                      </select>
					  </td>
					  <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">산출목적</td>
					  <td bgcolor="eaeaea" class="table_bl_left" colspan="1">
						  <select id="CAL_MODE" name="CAL_MODE" class="input_form1" style="width:100px" onchange="changeCalmode(this);">
						  	<option value="%">::전체::</option>
						  	<option value="1">점용료</option>
						  	<option value="2">변상료</option>
						  	<option value="3">과태료(사전통지)</option>
						 	<option value="3">과태료</option>
						  </select>
					  </td>
					  
					</tr>
                    
					<tr>
					  <td height="26px"  align="center" bgcolor="e5eff8" class="sub_table_b">부과여부</td>
                      <td bgcolor="eaeaea" class="table_bl_left">
                      <table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
	                      <tr>
							<select id="TAX_YN" name="TAX_YN" class="input_form1" style="width:100px">
								${taxation_yn}
							</select>
	                      </tr>
                      </table>
                      </td>
					
					  <td align="center" bgcolor="e5eff8" class="sub_table_b">수납여부</td>
					  <td bgcolor="eaeaea" class="table_bl_left">
					  <select id="SUNAP_YN" name="SUNAP_YN" class="input_form1" style="width:100px">
					  		${sunap_part}

					  </select>
					  </td>
										  
					</tr>
					<tr>
					
					  <td align="center" bgcolor="e5eff8" class="sub_table_b">세입구분</td>
					  <td bgcolor="eaeaea" class="table_bl_left">
					  <select id="TAX_SET" name="TAX_SET" class="input_form1" style="width:100px">
							${taxation_section}
					  </select>
					  </td>
						
					  <td height="26px"  align="center" bgcolor="e5eff8" class="sub_table_b">과세구분</td>
                      <td bgcolor="eaeaea" class="table_bl_left">
                      <table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
	                      <tr>
							<select id="TAX_GUBUN" name="TAX_GUBUN" class="input_form1" style="width:100px;" onchange="changeTaxGubun();">
								${taxation_part}
							</select>
	                      </tr>
                      </table>
                      </td>
					</tr>
					
			        <tr>
	                  <td align="center" bgcolor="e5eff8" class="sub_table_b">법정동/행정동</td>
	                  <td bgcolor="eaeaea" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
	                  	<tr><td><select id="BJ_CD" name="BJ_CD" class="input_form1" style="width:100px">
	                            ${bjdong_code}
	                        </select></td>
	              		<td>&nbsp;<select id="HJ_CD" name="HJ_CD" class="input_form1" style="width:100px">
	                            ${hjdong_code}
	                        </select></td>   
	                    </tr>
						</table></td>
	                  <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">점용지번지</td>
	                  <td bgcolor="eaeaea" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
	                    <tr>
	                      <td><input id="BONBUN" name="BONBUN" type="text" class="input_form1" style="width:40px" value="${BONBUN}"> -
							  <input id="BUBUN" name="BUBUN" type="text" class="input_form1" style="width:40px" value="${BUBUN}">
						  </td>
	                    </tr>
	                  </table></td>
	                </tr>
				 
	                <tr>
					  <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">관리번호</td>
					  <td bgcolor="eaeaea" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
							<input id="GAPAN_NO" name="GAPAN_NO" type="text" class="input_form1" style="width:120px" onKeyDown="javascript:checkKeySearch();" value="${GAPAN_NO}">
					  </table></td>
    				  <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">소유자/법인명</td>
	                  <td bgcolor="eaeaea" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
	                    <tr>
	                      <td><input id="OWNER_NAME" name="OWNER_NAME" type="text" class="input_form1" style="width:100px" onKeyDown="javascript:checkKeySearch();" value="${OWNER_NAME}"></td>
	                    </tr>
	                  </table></td>
	                </tr>	                
                  </table></td>
                </tr>
                <tr>
                  <td height="32" align="right"><a href="javascript:Search()"><img src="/img/inquiry_icon2.gif" alt="조회" width="56" height="18" border="0"></a></td>
                </tr>

                <tr>
                  <td height="1" bgcolor="#EAEAEA"></td>
                </tr>
                <tr>
                  <td height="34" class="sub_stan">전체건수 : <span class="sub_stan_blue">${totalcnt}</span>건 </td>
                </tr>
                <tr>
                  <td>
                  	<table width="780px" cellpadding="0" cellspacing="0" border="0" class="sub_table" bordercolor="#c9dfed" style="border-collapse:collapse;">
								  <TR>
								    <TD width="26px"  valign="top">
								      <TABLE cellpadding="0" cellspacing="0" border="1" class="sub_table" bordercolor="#c9dfed" style="border-collapse:collapse;">
								        <TR>
								              <td width="26px" height="26px" align="center" bgcolor="e5eff8" class="sub_table_b">
												<INPUT TYPE="checkbox" id="SELECT_ALL" onclick="javascript:selectAll(this);">
											  </td>
								        </TR>
								      </TABLE>
								    </TD>
								    <TD width="754px" valign="top">
								      <DIV id="topLine2" style="width:737px;overflow:hidden;">
								      <!--  //********** BEGIN_현진_20120207 width="1440px" 을 width="1640px" -->
								      <TABLE width="1940px" cellpadding="0" cellspacing="0" border="1" class="sub_table" bordercolor="#c9dfed" style="border-collapse:collapse;">
									  <!--   //********** END_현진_20120207 -->
								          <TR>
        						  			<td width="100px" height="26px" align="center" bgcolor="e5eff8" class="sub_table_b">관리번호</td>
				                            <td width="40px" align="center" bgcolor="e5eff8" class="sub_table_b">년도</td>
				                            <td width="60px" align="center" bgcolor="e5eff8" class="sub_table_b">과세번호</td>
				                            <td width="60px" align="center" bgcolor="e5eff8" class="sub_table_b">부과여부</td>
				                            <td width="60px" align="center" bgcolor="e5eff8" class="sub_table_b">수납여부</td>
				                            <td width="100px" align="center" bgcolor="e5eff8" class="sub_table_b">과세일</td>
				                            <td width="100px" align="center" bgcolor="e5eff8" class="sub_table_b">수납일</td>
				                            <td width="60px" align="center" bgcolor="e5eff8" class="sub_table_b">과세구분</td>
				                            <td width="110px" align="center" bgcolor="e5eff8" class="sub_table_b">산출목적</td>
				                            <td width="180px" align="center" bgcolor="e5eff8" class="sub_table_b">세목코드</td>
				                            <td width="100px" align="center" bgcolor="e5eff8" class="sub_table_b">의견제출상태</td>
				                            <td width="150px"  align="center" bgcolor="e5eff8" class="sub_table_b">운영자</td>
				                            <td width="200px"  align="center" bgcolor="e5eff8" class="sub_table_b">주소</td>
				                            <td width="400px"  align="center" bgcolor="e5eff8" class="sub_table_b">새주소</td>
				                            <td width="100px"  align="center" bgcolor="e5eff8" class="sub_table_b">면적</td>
				                            <td width="120px"  align="center" bgcolor="e5eff8" class="sub_table_b">부과금액</td> 
								          </TR>
								        </TABLE>
								      </DIV>
								    </TD>
								  </TR>
								  <TR>
								    <TD width="26px" valign="top">
								      <DIV id="leftDisplay2" style="width:26px;height:257px;overflow:hidden;">
								        <TABLE cellpadding="0" cellspacing="0" border="1" class="sub_table" bordercolor="#c9dfed" style="border-collapse:collapse;">
						          			<c:forEach items="${blist}" var="board" varStatus="idx">
						  					<tr onMouseOver="this.style.backgroundColor='#f6f7f8'" onMouseOut="this.style.backgroundColor=''"	style="cursor: pointer">
						  						<td width="26px" height="26px" align="center" bgcolor="e5eff8" class="sub_table_b">
						  							<INPUT TYPE="checkbox" NAME="SELECT_ITEM">
						  							<INPUT TYPE="hidden" NAME="GAPAN_NO_ARR" value="${board.GAPAN_NO}">
						  							<INPUT TYPE="hidden" NAME="TAX_YN_ARR" value="${board.TAX_YN}">
						  							<INPUT TYPE="hidden" NAME="SUNAP_YN_ARR" value="${board.SUNAP_YN}">
						  							<INPUT TYPE="hidden" NAME="SEQ_ARR" value="${board.SEQ}">
						  							<INPUT TYPE="hidden" NAME="CAL_MODE_ARR" value="${board.CAL_MODE}">
						  							<INPUT TYPE="hidden" NAME="TAX_GUBUN_ARR" value="${board.TAX_GUBUN}">
						  							<INPUT TYPE="hidden" NAME="REPLY_GUBUN_ARR" value="${board.REPLY_GUBUN}">
						  							<INPUT TYPE="hidden" NAME="REPLY_ETC_ARR" value="${board.REPLY_ETC}">
						  							<INPUT TYPE="hidden" NAME="REPLY_DATE_ARR" value="${board.REPLY_DATE}">
						  							<INPUT TYPE="hidden" NAME="REPLY_MANAGER_ARR" value="${board.REPLY_MANAGER}">
						  							<INPUT TYPE="hidden" NAME="ITEM_CHECK" value="">
						  						</td>
						  					</tr>
											</c:forEach>
								        </TABLE>
								      </DIV>
								    </TD>
								    <TD width="1940px" valign="top">
								      <DIV id="mainDisplay2" style="width:754px;height:274px;overflow:scroll;scrollbar-face-color:#EEF8FB;scrollbar-3dlight-color:#BBBDB6; scrollbar-highlight-color:#EEF8FB;scrollbar-shadow-color:#BBBDB6; scrollbar-darkshadow-color:#EEF8FB;scrollbar-track-color:#EEF8FB;scrollbar-arrow-color:#BBBDB6;" onscroll="scrollAll()">
								      <!--  //********** BEGIN_현진_20120207 width="1440px" 을 width="1640px" -->
								        <TABLE width="1940px" cellpadding="0" cellspacing="0" border="1" class="sub_table" bordercolor="#c9dfed" style="border-collapse:collapse;">
									  <!--   //********** END_현진_20120207 -->								      
								          <c:forEach items="${blist}" var="board" varStatus="idx">
								          	<!--  //********** BEGIN_현진_20120222 -->
								          	<tr onClick="javascript:View('${board.GAPAN_NO}', '${board.SEQ}','${board.CAL_MODE}','${board.TAX_GUBUN}')" onMouseOver="this.style.backgroundColor='#f6f7f8'" onMouseOut="this.style.backgroundColor=''" style="CURSOR: Hand;" >
											<!--   //********** END_현진_20120222 -->
			      	        					<td width="100px" height="26px" align="center">${board.GAPAN_NO}</td>
			      	        					<td width="40px" align="center">${board.YEAR}</td>
			      	        					<td width="60px" align="center">${board.TAX_NO}</td>
			      	        					<td width="60px" class="sub_table_r" align="center">${board.TAX_YN}</td>
			      	        					<td width="60px" class="sub_table_r" align="center">${board.SUNAP_YN}</td>
			      	        					<td width="100px" align="center">${board.TAX_DATE}</td>
			      	        					<!--  //********** BEGIN_KANG_20120705 -->
												<!-- 
												<td width="100px" align="center">${board.SUNAP_DATE}</td>
												-->
												<c:if test ="${board.SUNAP_DATE == '0000-00-00'}"><td width="100px" align="center" class="sub_table_r" >(과태료재부과 )<c:if test ="${board.SUNAP_DATE != '0000-00-00'}">${board.SUNAP_DATE }</c:if></td></c:if>
												<c:if test ="${board.SUNAP_DATE != '0000-00-00'}"><td width="100px" align="center">${board.SUNAP_DATE }</td></c:if>
												<!--   //********** END_KANG_20120705 -->
			      	        					<td width="60px" align="center">${board.TAX_GUBUN_NM}</td>
			      	        					<td width="110px" align="center">
			      	        						<c:choose>
			      	        							<c:when test="${board.CAL_MODE == '1'}">
			      	        							점용료
			      	        							</c:when>
			      	        							<c:when test="${board.CAL_MODE == '2'}">
			      	        							변상금
			      	        							</c:when>
			      	        							<c:when test="${board.CAL_MODE == '3' && board.TAX_GUBUN == '2'}">
			      	        							과태료
			      	        							</c:when>	        							
			      	        							<c:when test="${board.CAL_MODE == '3' && board.TAX_GUBUN == '3'}">
			      	        							과태료(사전통지)
			      	        							</c:when>
			      	        						</c:choose>
			      	        					</td>
			      	        					<td width="180px" align="center">${board.TAX_CD_NM}</td>
			      	        					<td width="100px" align="center">${board.REPLY_GUBUN_NM}</td>
			      	        					<td width="150px" align="center">${board.NAME}</td>
			      	        					<td width="200px" align="center">${board.ADDR}</td>
			      	        					<td width="400px" align="center">${board.SI}&nbsp;${board.GUN}&nbsp;${board.BD_BON}&nbsp;${board.BD_BU}&nbsp;${board.DORO_NM}&nbsp;${board.BD_NM}&nbsp;${board.BD_DET_NM}</td>
			      	        					<td width="100px" align="center">${board.AREA_SIZE}</td>
			      	        					<td width="120px" align="center">${rnic:insertComma2(board.SUM)}</td>	
				                     		</tr>
											</c:forEach>	

								        </TABLE>
								      </DIV>
								    </TD>
								  </TR>
								</table>
					 
					 </td>
                </tr>
            </table>
            </td>
          </tr>
          <tr>
             <td height="40" align="right">
				<!--  //********** BEGIN_현진_20120222 -->
				<!-- 
				<img src="/img/rojum_prenotice_icon.gif" alt="사전통지서" border="0" onclick="javascript:PreNotice();" style="cursor:pointer;">
				-->
				<!--  //********** BEGIN_현진_20120227 -->
				<img src="/img/bugwa_cancel_icon.gif" alt="부과철회" border="0" onclick="javascript:bugwa_cancel();" style="cursor:pointer;">
				<!--   //********** END_현진_20120227 -->
				<!--  //********** BEGIN_현진_20120322 -->
				<img src="/img/del_icon5.gif" alt="삭제" border="0" onclick="javascript:deleteData();" style="cursor:pointer;">
				<!--   //********** END_현진_20120322 -->
				<!--   //********** END_현진_20120222 -->             	
             	<img src="/img/submit_reply.gif" alt="의견제출" border="0" onclick="javascript:ReplyPop();" style="cursor:pointer;">
 	            <!--  //********** BEGIN_현진_20120222 -->
				<!-- 
				<img src="/img/rojum_saewe_penalty.gif" alt="미수납과태료조회" border="0" onclick="javascript:SearchPenaltyIlgwal();" style="cursor:pointer;">
				-->
				<!--   //********** END_현진_20120222 --> 	            
             	<img src="/img/rojum_sunap_icon.gif" alt="수납처리" border="0" onclick="javascript:SaeweSunap()" style="cursor:pointer;">
             	<img src="/img/levy_icon3.gif" id="Bugwa_Ilgwal" name="Bugwa_Ilgwal" alt="일괄부과 처리" border="0" onclick="javascript:SaeweSuipBugwa_Ilgwal();" style="cursor:pointer;">
           		<img src="/img/excel_icon.gif" alt="EXCEL 변환" border="0" onclick="javascript:excel_Search();" style="cursor:pointer;">
            </td>
          </tr>
        </table></td>
      </tr>

  	<tr><td>
  	</td>
  	</tr>
</table></td>
</tr>
</table>
</form>         


</body>
</html>