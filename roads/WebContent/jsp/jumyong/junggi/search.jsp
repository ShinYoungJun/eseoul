<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ include file="/jsp/common/include.jsp" %>
<%@ include file="/jsp/common/loginCheck.jsp" %>
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
<script language="javascript" src="/js/PopupCalendar.js"></script> 
<script>
		
	function checkKeySearch()
	{
		if(event.keyCode == 13) goSearch();
	}
	
	// 조회
	function goSearch()
	{

		var year = document.getElementById("YEAR").value;
		var type = document.getElementById("TYPE").value;
		var tax_set = document.getElementById("TAX_SET").value;
		var tax_yn = document.getElementById("TAX_YN").value;		
		var mul_fromdate = document.getElementById("mul_fromdate").value;
		var mul_todate = document.getElementById("mul_todate").value;
		var bj_cd = document.getElementById("BJ_CD").value;
		var hj_cd = document.getElementById("HJ_CD").value;
		var jumyongName = document.getElementById("jumyongName").value;
		var cal_status = document.getElementById("cal_status").value;
		var section = document.getElementById("SECTION").value;
		// 공시지가 산출년도 or 최신년도 구분. 2012-11-28. by ksic
		var gongsijiga = document.getElementById("GONGSIJIGA").value;
		// 정기분 관리 주민번호/법인번호 조회 추가. 180612 by ksic
		var juminNB = document.getElementById("juminNB").value;
		var corpNB = document.getElementById("corpNB").value;

		if( year == ''){
			alert("산출년도를 입력하세요. ");
			document.getElementById("YEAR").focus();
			return;
		}
		if( mul_fromdate == ''){
			alert("사용부과기간을 입력하세요. ");
			document.getElementById("mul_fromdate").focus();
			return;
		}
		if( mul_todate == ''){
			alert("사용부과기간을 입력하세요. ");
			document.getElementById("mul_todate").focus();
			return;
		}
		if( section == ''){
			alert("점용구분을 선택하세요. ");
			document.getElementById("SECTION").focus();
			return;
		}
		
		var iFrm = document.getElementById("IFRM_PurposeCode");
		var purpose = iFrm.contentWindow.document.getElementById("PURPOSE_CD").value;
		var purpose1 = iFrm.contentWindow.document.getElementById("PURPOSE1");

		if(purpose1[purpose1.selectedIndex].text == "::선택::")
			purpose="";

		if(type.length==0)		//점용종류가 선택이 안되면 점용목적은 선택되지 않도록 purpose값을 지정 
			purpose="";

		/*
		location.href="/jumyong/junggi/search.do?year="+year+"&type="+type+"&tax_set="+tax_set+"&tax_yn="+tax_yn+"&mul_fromdate="+mul_fromdate+"&mul_todate="+mul_todate+
			"&purpose_cd="+purpose+"&bj_cd="+bj_cd+"&hj_cd="+hj_cd+"&jumyongName="+jumyongName+"&cal_status="+cal_status+"&SECTION="+section+"&search=1";
		*/
		/*
		// 공시지가 산출년도 or 최신년도 구분. 2012-11-28. by ksic
		location.href="/jumyong/junggi/search.do?year="+year+"&type="+type+"&tax_set="+tax_set+"&tax_yn="+tax_yn+"&mul_fromdate="+mul_fromdate+"&mul_todate="+mul_todate+
		"&purpose_cd="+purpose+"&bj_cd="+bj_cd+"&hj_cd="+hj_cd+"&jumyongName="+jumyongName+"&cal_status="+cal_status+"&SECTION="+section+"&search=1&GONGSIJIGA="+gongsijiga;
		*/
		// 정기분 관리 주민번호/법인번호 조회 추가. 180612 by ksic
		location.href="/jumyong/junggi/search.do?year="+year+"&type="+type+"&tax_set="+tax_set+"&tax_yn="+tax_yn+"&mul_fromdate="+mul_fromdate+"&mul_todate="+mul_todate+
		"&purpose_cd="+purpose+"&bj_cd="+bj_cd+"&hj_cd="+hj_cd+"&jumyongName="+jumyongName+"&cal_status="+cal_status+"&SECTION="+section+"&search=1&GONGSIJIGA="+gongsijiga+
		"&juminNB="+juminNB+"&corpNB="+corpNB;
	}
	
	function InitPage()
	{
		//var junggi = "정기분 일괄 산출 시 공유재산물품관리법 조정계수 적용은\n";
		//junggi += "2월 25일 수요일에 완료 에정입니다.\n";
		//junggi += "2월 26일 목요일에 정기분 일괄산출 작업을 진행해주시기 바랍니다";
		//alert(junggi);
		//setYear();
		var now = new Date();
		var day=now.getDay();
		day = 1 - day;				
		Date.prototype.addDate = add_date; // Date 객체에 메서드 정의
		
		var fromDate = new Date(); // 현재 날짜 객체 생성
		
		fromDate.addDate(day); // 
		
		var toDate =   document.getElementById("toDateValue").value ;
		var fromDate =   document.getElementById("fromDateValue").value ;
		var jumyongName =   document.getElementById("jumyongNameValue").value ;
		var numberValue =   document.getElementById("numberValueValue").value ;
		var search_flag =   document.getElementById("search_flag").value ;
		//정기분 관리 주민번호/법인번호 조회 추가. 180612 by ksic
		var ssn =   document.getElementById("ssnValue").value ;

		if(toDate != "" && toDate !="99999999" )
			document.getElementById("searchToDate").value = addDash(toDate);

		if(fromDate != "" && fromDate != "0")		
			document.getElementById("searchFromDate").value = addDash(fromDate);

		if(jumyongName != "")				
			document.getElementById("jumyongName").value = jumyongName;
		
		// 정기분 관리 주민번호/법인번호 조회 추가. 180612 by ksic
		if(juminNB != "")				
			document.getElementById("juminNB").value = juminNumber;
		
		if(corpNB != "")				
			document.getElementById("corpNB").value = corpNumber;
		
		//document.getElementById("IFRM_PurposeCode").src="/jsp/common/purposeCode/purposeCode2.jsp?SectionCode="+"${TYPE}"+"&PURPOSE_CD=${PURPOSE_CD}"+"&search_flag="+search_flag;
		
		if(document.jumyongForm.PURPOSE_CD.value.length<1){
			document.getElementById("IFRM_PurposeCode").src="/jsp/common/purposeCode/purposeCode2.jsp?SectionCode="+document.getElementById("TYPE").value+"&PURPOSE_CD=000"+"&search_flag=1";
		}else{
			document.getElementById("IFRM_PurposeCode").src="/jsp/common/purposeCode/purposeCode2.jsp?SectionCode="+document.getElementById("TYPE").value+"&PURPOSE_CD="+document.jumyongForm.PURPOSE_CD.value;	
		}

		var obj = document.jumyongForm.message.value;		
		if(obj != "")	
			alert(obj);
			return;
			
	}
	
	
	function getDateType1(date1)
	{
		var year= date1.getFullYear();
	    var mon = (date1.getMonth()+1)>9 ? ''+(date1.getMonth()+1) : '0'+(date1.getMonth()+1);
	    var day = date1.getDate()>9 ? ''+date1.getDate() : '0'+date1.getDate();
		
		return (year+"-"+mon+"-"+day);
	}
	
	
	
	function add_date(i) // 매서드가 될 함수 구현
	{
	   var currentDate; // 계산된 날
	   currentDate = this.getDate() + i*1; // 현재 날짜에 더해(빼)줄 날짜를 계산
	   this.setDate(currentDate); // 계산된 날짜로 다시 세팅
	}
	
	function removeDash(num)
	{	
		return num.split('-').join("");
	}
	
	function addDash(num)
	{
		return (num.substr(0,4)+"-"+num.substr(4,2)+"-"+num.substr(6,2));
	}
	
	function setYear()
	{
		now = new Date();
		//Y = now.getYear();	//더이상지원안함
		Y = now.getFullYear();
		
		var strYear = document.getElementById("yearVal").value;

		for(var i = 0 ; i < 10 ; i++){
			  newItem = new Option(i);
			  document.getElementById("YEAR").options[i]  = newItem;
			  document.getElementById("YEAR").options[i].text = Y-i;
			  document.getElementById("YEAR").options[i].value = Y-i;
			  if(strYear == Y-i) document.getElementById("YEAR").options[i].selected = true;
		} 	
	}
	
	
	function addOption(startNum,endNum,idVal,selectedVal)
	{
		for(var i = startNum ; i < endNum ; i++){
			  newItem = new Option(i);
			  document.getElementById(idVal).options[i]  = newItem;
			  document.getElementById(idVal).options[i].text = Y-i;
			  document.getElementById(idVal).options[i].value = Y-i;
			  if(i == 0) document.getElementById("YEAR").options[i].selected = true;
		} 	
	
	}
	/*
	 *	통합검색 key down function (엔터키가 입력되면 검색함수 호출)
	 */
	function checkKeySearch(){
		if(event.keyCode == "13")
			goSearch();
	}
	
	// 점용 종류 선택시 점용 목적 코드 나오게 함.
	function	Select_UseType(sel)
	{
		document.getElementById("IFRM_PurposeCode").src="/jsp/common/purposeCode/purposeCode2.jsp?SectionCode="+sel.value+"&PURPOSE_CD=&search_flag=1";
	}
	
	
	function goView(adminVal,year,purpose_cd)
	{
		var type = document.getElementById("TYPE").value;
		var tax_set = document.getElementById("TAX_SET").value;
		var tax_yn = document.getElementById("TAX_YN").value;		
		var mul_fromdate = document.getElementById("mul_fromdate").value;
		var mul_todate = document.getElementById("mul_todate").value;
		var iFrm = document.getElementById("IFRM_PurposeCode");
		var purpose_search = iFrm.contentWindow.document.getElementById("PURPOSE_CD").value;
		var bj_cd = document.getElementById("BJ_CD").value;
		var hj_cd = document.getElementById("HJ_CD").value;
		var jumyongName = document.getElementById("jumyongName").value;
		var cal_status = document.getElementById("cal_status").value;
		var section = document.getElementById("SECTION").value;
		// 정기분 관리 주민번호/법인번호 조회 추가. 180612 by ksic
		var juminNB = document.getElementById("juminNB").value;
		var corpNB = document.getElementById("corpNB").value;
		
		// 정기분 관리 주민번호/법인번호 조회 추가. 180612 by ksic
		location.href="/jumyong/junggi/view.do?ADMIN_NO="+adminVal+"&year="+year+"&purpose_cd="+purpose_cd+"&type="+type+"&tax_set="+tax_set+"&tax_yn="+tax_yn+"&mul_fromdate="+mul_fromdate+"&mul_todate="+mul_todate+
					"&bj_cd="+bj_cd+"&hj_cd="+hj_cd+"&jumyongName="+jumyongName+"&juminNB="+juminNB+"&corpNB="+corpNB+"&cal_status="+cal_status+"&SECTION="+section+"&search=1&purpose_search="+purpose_search;

	}
	
	// 부과년도 검색 셋팅
	function change_value(val)
	{
		if(val.value.length == 4)
		{	
			
			document.jumyongForm.mul_fromdate.value = val.value + "-01-01";
			document.jumyongForm.mul_todate.value = val.value + "-12-31";
						
		}	
	}
	
	
	function	Page(page)
	{
		if(page	==	"")
			return;
		
		var form = document.jumyongForm;
		
		var year = document.getElementById("YEAR").value;
		var type = document.getElementById("TYPE").value;
		var tax_set = document.getElementById("TAX_SET").value;
		var tax_yn = document.getElementById("TAX_YN").value;		
		var mul_fromdate = document.getElementById("mul_fromdate").value;
		var mul_todate = document.getElementById("mul_todate").value;
		var iFrm = document.getElementById("IFRM_PurposeCode");
		var purpose = iFrm.contentWindow.document.getElementById("PURPOSE_CD").value;
		var bj_cd = document.getElementById("BJ_CD").value;
		var hj_cd = document.getElementById("HJ_CD").value;
		var jumyongName = document.getElementById("jumyongName").value;	
		var cal_status = document.getElementById("cal_status").value;
		var section = document.getElementById("SECTION").value;
		var search = document.getElementById("search").value;
		// 정기분 관리 주민번호/법인번호 조회 추가. 180612 by ksic
		var juminNB = document.getElementById("juminNB").value;
		var corpNB = document.getElementById("corpNB").value;
		
		//********** BEGIN_현진_20120326
		if(purpose == '000'){
			purpose = "";
		}
		//********** END_현진_20120326
		form.currentPage.value	= page;
		
		// 정기분 관리 주민번호/법인번호 조회 추가. 180612 by ksic
		location.href="search.do?currentPage="+page+"&year="+year+"&type="+type+"&tax_set="+tax_set+"&tax_yn="+tax_yn+"&mul_fromdate="+mul_fromdate+"&mul_todate="+mul_todate+
						"&purpose_cd="+purpose+"&bj_cd="+bj_cd+"&hj_cd="+hj_cd+"&jumyongName="+jumyongName+"&juminNB="+juminNB+"&corpNB="+corpNB+"&cal_status="+cal_status+"&SECTION="+section+"&search="+search;
	}
	

	// 엑셀변환
	function	excel_Search()
	{
		var form = document.jumyongForm;

		
		var year = document.getElementById("YEAR").value;
		var type = document.getElementById("TYPE").value;
		var tax_set = document.getElementById("TAX_SET").value;
		var tax_yn = document.getElementById("TAX_YN").value;		
		var mul_fromdate = document.getElementById("mul_fromdate").value;
		var mul_todate = document.getElementById("mul_todate").value;
		var bj_cd = document.getElementById("BJ_CD").value;
		var hj_cd = document.getElementById("HJ_CD").value;
		var jumyongName = document.getElementById("jumyongName").value;
		var cal_status = document.getElementById("cal_status").value;
		var section = document.getElementById("SECTION").value;
		// 정기분 관리 주민번호/법인번호 조회 추가. 180612 by ksic
		var juminNB = document.getElementById("juminNB").value;
		var corpNB = document.getElementById("corpNB").value;

		if( year == ''){
			alert("산출년도를 입력하세요. ");
			document.getElementById("YEAR").focus();
			return;
		}
		if( mul_fromdate == ''){
			alert("사용부과기간을 입력하세요. ");
			document.getElementById("mul_fromdate").focus();
			return;
		}
		if( mul_todate == ''){
			alert("사용부과기간을 입력하세요. ");
			document.getElementById("mul_todate").focus();
			return;
		}
		if( section == ''){
			alert("점용구분을 선택하세요. ");
			document.getElementById("SECTION").focus();
			return;
		}
		
		var iFrm = document.getElementById("IFRM_PurposeCode");
		var purpose = iFrm.contentWindow.document.getElementById("PURPOSE_CD").value;
		var purpose1 = iFrm.contentWindow.document.getElementById("PURPOSE1");

		if(purpose1[purpose1.selectedIndex].text == "::선택::")
			purpose="";

		if(type.length==0)		//점용종류가 선택이 안되면 점용목적은 선택되지 않도록 purpose값을 지정 
			purpose="";
		
		// 정기분 관리 주민번호/법인번호 조회 추가. 180612 by ksic
		location.href= "/jumyong/junggi/excel_search.do?currentPage=1&year="+year+"&type="+type+"&tax_set="+tax_set+"&tax_yn="+tax_yn+"&mul_fromdate="+mul_fromdate+"&mul_todate="+mul_todate+
		"&purpose_cd="+purpose+"&bj_cd="+bj_cd+"&hj_cd="+hj_cd+"&jumyongName="+jumyongName+"&juminNB="+juminNB+"&corpNB="+corpNB+"&cal_status="+cal_status+"&SECTION="+section+"&search=1";
	}

	// 일괄 부과하기
	function SaeweSuipBugwa_Ilgwal()
	{
		var form = document.jumyongForm;
		var year = document.getElementById("YEAR").value;
		var type = document.getElementById("TYPE").value;
		var section = document.getElementById("SECTION").value;

		if( section == '' ){
			alert("점용구분을 선택하세요. ");
			document.getElementById("SECTION").focus();
			return;
		}
		
		if(form.TOTALCNT.value <= 0){
			alert("일괄처리할 데이터가 없습니다. ");
			return;
		}
		

		
		if(document.getElementById("bugwaFlag").value == '1'){
			if(!confirm("일괄부과 하시기 전에 정확하게 산출 및 입력되었는지 확인하셔야 합니다. \n\n 해당 건들에 대하여 일괄부과 하시겠습니까?"))
				return;
			
			document.getElementById("bugwaFlag").value = '0';
			form.action = "/jumyong/saewe/saeweSuipBugwa_ilgwal_junggi.do?year="+year;
			form.submit();
		}else{
			alert("일괄부과 처리가 끝날때 까지 기다리세요");
			return;
		}
	}
	
	// 일괄 산출
	function goAllCal(){

		var f = document.jumyongForm;
		var year = document.getElementById("YEAR").value;
		var section = document.getElementById("SECTION").value;

		if( section == '' ){
			alert("점용구분을 선택하세요. ");
			document.getElementById("SECTION").focus();
			return;
		}
		
		if(f.TOTALCNT.value <= 0){
			alert("처리할 데이터가 없습니다. ");
			return;
		}
		
		if(!confirm("일괄산출은 세외수입에 부과된 건들에 대해서만 산출이 됩니다. \n 일괄산출 하시겠습니까?"))
			return;

		document.getElementById("TAX_YN").value = "1";
		
		f.action = "/jumyong/junggi/junggiAllCal.do?year="+year;
		f.submit();
	}
	
</script>



</head>

<body onload="javascript:InitPage();">

<form id="jumyongForm" name="jumyongForm">

<input type="hidden" id="search" name="search" value="${search }">
<input id="toDateValue" name="toDateValue" value="${toDate}" type="hidden">
<input id="fromDateValue" name="fromDateValue" value="${fromDate}" type="hidden">
<input id="jumyongNameValue" name="jumyongNameValue" value="${jumyongName}" type="hidden">

<input id="juminNumberValue" name="juminNumberValue" value="${juminNumber}" type="hidden">
<input id="corpNumberValue" name="corpNumberValue" value="${corpNumber}" type="hidden">

<input id="numberValueValue" name="numberValueValue" value="${numberValue}" type="hidden">
<input id="yearVal" name="yearVal" value="${year}" type="hidden">
<input id="currentPage" name="currentPage" type="hidden" value="${currentPage}">
<input id="PURPOSE_CD" name="PURPOSE_CD" type="hidden" value="${PURPOSE_CD}">
<input id="search_flag" name="search_flag" type="hidden" value="${search_flag}">
<input id="TOTALCNT" name="TOTALCNT" type="hidden" value="${totalcnt}">
<input id="gubun" name="gubun" type="hidden" value="junggi">
<input id="message" name="message" type="hidden" value="${message}">
<input id="bugwaFlag" name="bugwaFlag" type="hidden" value="1">

<table width="800" border="0" cellpadding="0" cellspacing="0">
  <tr>
    <td height="43"><img src="/img/jumyong_junggi_title.gif" width="800" height="43"></td>
  </tr>
  <tr>
    <td ><table width="780" border="0" cellspacing="0" cellpadding="0">
      <tr>
        <td height="1" bgcolor="eaeaea"></td>
      </tr>
      <tr>
        <td height="14"></td>
      </tr>     
      <tr>
        <td><table width="780" border="0" cellspacing="0" cellpadding="0">
          <tr>
            <td align="left" height="22" background="/img/tab_line_blue.gif">
            <table border="0" cellspacing="0" cellpadding="0">
                <tr >
                  <td ><img src="/img/sub_periodi_title1.gif" width="110" height="22"></td>
                </tr>
            </table></td>
          </tr>
		<tr>
            <td  class="contborder_purple"><table width="100%" border="0" cellspacing="0" cellpadding="0">
              <tr>
                <td><table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
                	<%--
                    <tr>
                      <td height="26px" align="center" bgcolor="e5eff8" class="sub_table_b" >산출년도</td>
                      <td bgcolor="eaeaea" class="table_bl_left" colspan="3">
	                      <input type="text" id="YEAR" name="YEAR" class="essential" style="width:50px" maxlength="4" value="${year}" onKeyUp="change_value(this)"> 년
					  </td>
					 </tr>
					 --%>
                    <tr>
                      <td height="26px" align="center" bgcolor="e5eff8" class="sub_table_b" >산출년도</td>
                      <td bgcolor="eaeaea" class="table_bl_left">
	                      <input type="text" id="YEAR" name="YEAR" class="essential" style="width:50px" maxlength="4" value="${year}" onKeyUp="change_value(this)"> 년
					  </td>
                      <td height="26px" align="center" bgcolor="e5eff8" class="sub_table_b">공시지가</td>                      
					  <td bgcolor="eaeaea" class="table_bl_left">
						<select id="GONGSIJIGA" name="GONGSIJIGA" class="input_form1" style="width:130px" >
							<option value="1">::기본::</option>
							<option value="2">최신</option>							
					    </select>
					  </td>
					 </tr>
					 <tr>
					  <td height="26px" align="center" bgcolor="e5eff8" class="sub_table_b">점용구분</td>                      
					  <td bgcolor="eaeaea" class="table_bl_left">
						<select id="SECTION" name="SECTION" class="essential" style="width:130px" >
							<option value="">::전체::</option>
							<option value="1">계속</option>
							<option value="3">무단</option>							
					    </select>
					  </td>
                      <td height="26px" align="center" bgcolor="e5eff8" class="sub_table_b">지목</td>                      
					  <td bgcolor="eaeaea" class="table_bl_left">
						<select id="TYPE" name="TYPE" class="input_form1" style="width:130px" OnChange="Select_UseType(this);">
							${use_type}
					    </select>
					  </td>
                    </tr>
					
                    <tr>
                      <td height="26px" align="center" bgcolor="e5eff8" class="sub_table_b">세입구분</td>
					  <td bgcolor="eaeaea" class="table_bl_left">
						<select id="TAX_SET" name="TAX_SET" class="input_form1" style="width:130px">
					  		${taxation_section}
					  	</select>
					  </td>
					  <td height="26px" align="center" bgcolor="e5eff8" class="sub_table_b">부과여부 </td>
					  <td bgcolor="eaeaea" class="table_bl_left">
						<select id="TAX_YN" name="TAX_YN" class="input_form1" style="width:130px">
                        	${taxation_yn}
                     	</select>
               	      </td>
                    </tr>
                    
                     <tr>
                      <td height="26px" align="center" bgcolor="e5eff8" class="sub_table_b">산출기간</td>
					  <td bgcolor="eaeaea" class="table_bl_left" colspan="3">
					  	<input id="mul_fromdate" name="mul_fromdate" type="text" class="input_form1" style="width:70px" value="${mul_fromdate }">
					  	<img src="/img/calendar_icon.gif" width="19" height="16" border="0" align="absmiddle" onclick="popUpCalendar(this, document.getElementById('mul_fromdate'), 'yyyymmdd')" style="CURSOR: pointer ;">
					  	&nbsp;~&nbsp;<input id="mul_todate" name="mul_todate" type="text" class="input_form1" style="width:70px" value="${mul_todate }">
					  	<img src="/img/calendar_icon.gif" width="19" height="16" border="0" align="absmiddle" onclick="popUpCalendar(this, document.getElementById('mul_todate'), 'yyyymmdd')" style="CURSOR: pointer;">
					  </td>
                    </tr>
                    <input type="hidden" id="cal_status" name="cal_status" value="">

				<tr>
					<td height="26px" align="center" bgcolor="e5eff8" class="sub_table_b">점용목적</td>
					<td colspan="3" bgcolor="eaeaea" class="table_bl_left">
						<table width="100%" border="0" cellpadding="0" cellspacing="0" class="sub_stan">
							<tr><td>
								<iframe id="IFRM_PurposeCode" align="absmiddle" scrolling="no" frameborder="0" framespacing="0" width="100%" height="25"></iframe>
							</td></tr>
					  	</table>
					</td>
                </tr>
                <tr>
					<td height="26px" align="center" bgcolor="e5eff8" class="sub_table_b">법정동/행정동</td>
					<td bgcolor="eaeaea" class="table_bl_left">
						<select id="BJ_CD" name="BJ_CD" class="input_form1" style="width:130px">${bjdong_code}</select>
						<select id="HJ_CD" name="HJ_CD" class="essential" style="width:130px">${hjdong_code}</select>
					</td>
					<td height="26px" align="center" bgcolor="e5eff8" class="sub_table_b">점용인/법인명</td>
                    <td bgcolor="eaeaea" class="table_bl_left">
						<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
                        	<tr>
                          		<td><input id="jumyongName" name="jumyongName" type="text" class="input_form1" style="width:130px" onKeyDown="javascript:checkKeySearch();" value="${jumyongName }"></td>
                        	</tr>
                      	</table>
                   	</td>
                </tr>
                
<%-- 정기분 관리 주민번호/법인번호 조회 추가. 180612 by ksic--%>
                <tr>					
					<td height="26px" align="center" bgcolor="e5eff8" class="sub_table_b">주민번호</td>
                    <td bgcolor="eaeaea" class="table_bl_left">
						<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
                        	<tr>
                          		<td><input id="juminNB" name="juminNB" type="text" class="input_form1" style="width:130px" onKeyDown="javascript:checkKeySearch();" value="${juminNB }"></td>
                        	</tr>
                      	</table>
                   	</td>
					
					<td height="26px" align="center" bgcolor="e5eff8" class="sub_table_b">법인번호</td>
                    <td bgcolor="eaeaea" class="table_bl_left">
						<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
                        	<tr>
                          		<td><input id="corpNB" name="corpNB" type="text" class="input_form1" style="width:130px" onKeyDown="javascript:checkKeySearch();" value="${corpNB }"></td>
                        	</tr>
                      	</table>
                   	</td>
                </tr>
                
                </table></td>
              </tr>
 
                <tr>
                  <td height="32" align="right"><img src="/img/inquiry_icon2.gif" alt="조회" width="56" height="18" border="0" onclick="javascript:goSearch();" style="cursor:pointer" >
                  </td>
                </tr>
                <tr>
                  <td height="1" bgcolor="#EAEAEA"></td>
                </tr>
                <tr>
                  <td height="34" class="sub_stan">전체건수 : <span class="sub_stan_blue">${listCount}</span>건 
                  	<div style="float: right;"><a href="/bbs/bbs_jumyong.jsp">정기분매뉴얼 다운받으러 가기</a></div>
                  </td>
                </tr>
                <tr>
                  <td>
				<div style=" width:780px;padding:10px;overflow-x:auto; scrollbar-face-color:#EEF8FB;  scrollbar-3dlight-color:#BBBDB6;scrollbar-highlight-color:#EEF8FB;scrollbar-shadow-color:#BBBDB6; scrollbar-darkshadow-color:#EEF8FB;  scrollbar-track-color:#EEF8FB; scrollbar-arrow-color:#BBBDB6;"> 
				<table width="2500px" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
			    	<tr>
                        <td height="28" align="center" bgcolor="e5eff8" class="sub_table_b">관리번호</td>
                        <td align="center" bgcolor="e5eff8" class="sub_table_b">과세<br/>번호</td>
                        <td align="center" bgcolor="e5eff8" class="sub_table_b">부과<br/>여부</td>
                        <td align="center" bgcolor="e5eff8" class="sub_table_b">산출<br/>여부</td>
                        <td align="center" bgcolor="e5eff8" class="sub_table_b">점용인/법인명</td>
<%-- 정기분 관리 주민번호/법인번호 조회 추가. 180612 by ksic--%>                        
                        <td align="center" bgcolor="e5eff8" class="sub_table_b">주민번호/<br/>법인번호</td>
                        
                        <td align="center" bgcolor="e5eff8" class="sub_table_b">점용인<br/>우편번호</td>
                        <td align="center" bgcolor="e5eff8" class="sub_table_b">점용인 주소</td>
                        <td align="center" bgcolor="e5eff8" class="sub_table_b">점용인 새 주소</td>
                        <td align="center" bgcolor="e5eff8" class="sub_table_b">과세<br/>구분</td>
                        <td align="center" bgcolor="e5eff8" class="sub_table_b">점용<br/>구분</td>
                        <td align="center" bgcolor="e5eff8" class="sub_table_b">점용<br/>종류</td>
                        <td align="center" bgcolor="e5eff8" class="sub_table_b">세입<br/>구분</td>
                        <td align="center" bgcolor="e5eff8" class="sub_table_b">점용지<br/>소유</td>
                        <td align="center" bgcolor="e5eff8" class="sub_table_b">점용지</td>
                        <!-- sungh83 20131115 -->
                        <td align="center" bgcolor="e5eff8" class="sub_table_b">도로주소</td>
                        <!-- sungh83 20131115 -->
                        <td align="center" bgcolor="e5eff8" class="sub_table_b">점용<br/>면적</td>
                        <td align="center" bgcolor="e5eff8" class="sub_table_b">점용목적</td>
                        <td align="center" bgcolor="e5eff8" class="sub_table_b">조정산출식</td>
                        <td align="center" bgcolor="e5eff8" class="sub_table_b">조정<br/>점용료</td>
                        <td align="center" bgcolor="e5eff8" class="sub_table_b">부가가치세</td>
                        <td align="center" bgcolor="e5eff8" class="sub_table_b">감면/지분율</td>
                        <td align="center" bgcolor="e5eff8" class="sub_table_b">감면/지분 사유</td>
                        <td align="center" bgcolor="e5eff8" class="sub_table_b">세목코드</td>
                        <td align="center" bgcolor="e5eff8" class="sub_table_b">산출<br/>시작일</td>
                        <td align="center" bgcolor="e5eff8" class="sub_table_b">산출<br/>끝일</td>
                        <td align="center" bgcolor="e5eff8" class="sub_table_b">요율<br/>(단가)</td>
                        <td align="center" bgcolor="e5eff8" class="sub_table_b">공시지가</td>
					</tr>
                    
                    <c:choose>
					<c:when test='${blist != null && !empty blist}'>  
                   	<c:forEach items="${blist}" var="board" varStatus="idx">
                    <tr onMouseOver="this.style.backgroundColor='#f6f7f8'" onMouseOut="this.style.backgroundColor=''" style="cursor:pointer"
                    onclick="javascript:goView('${board.ADMIN_NO}','${board.YEAR}','${board.PURPOSE_CD }');">

                        <td width="80px" height="26" align="center">${board.ADMIN_NO2}</td>
                        <td width="50px" align="center">${board.TAX_NO}</td>
                        <td align="center"><font color="red">${board.TAX_YN}</font></td>
                        <td align="center"><font color="red">${board.SUM_ADJUST}</font></td>
                        <td width="100px" align="center">${board.NAME}</td>
<%-- 정기분 관리 주민번호/법인번호 조회 추가. 180612 by ksic--%>                        
                        <td width="80px" height="26" align="center">${board.SSN}</td>
                        
                        <td align="center">${board.POST}</td>
                        <td align="center">${board.ADDR}</td>
                        <td align="center">${board.SI} ${board.GUN} ${board.DORO_NM} ${board.BD_BON} ${board.BD_BU} ${board.BD_NM} ${board.BD_DET_NM}</td>
                        <td align="center">${board.SECTION_NAME}</td>
                        <td align="center">${board.SECTION}</td>
                        <td align="center">${board.TYPE}</td>
                        <td align="center">${board.TAX_SET}</td>
                        <td align="center">${board.OWNER_SET_NM}</td>
                        <td align="center">${board.BJ_NM} ${board.BONBUN }</td>
												<!-- sungh83 20131115-->
                        <td align="center">${board.ROAD_ADDR}</td>
                        <!-- sungh83 20131115 -->
						<td align="center">${board.AREA}</td>
						<td align="center" width="350">${board.PURPOSE_CLASSNM}</td>
						<td align="center" width="350">${board.REDUCTION_FORM}</td>
						<td align="center">${board.REDUCTION_SUM}</td>
						<td align="center">${board.VAT}</td>
						<td align="center">${board.REDUCTION_RATE}</td>
						<td align="center" width="200">${board.REDUCTION_REASON}</td>
						<td align="center">${board.TAXNAME}</td>
						<td align="center">${board.FROMDATE}</td>
						<td align="center">${board.TODATE}</td>
						<td align="center">${board.RATE}</td>
						<td align="center">${board.PRICE}</td>
					</tr>
					</c:forEach>
					</c:when>
					<c:otherwise>
					<tr>
						<td align="center" class="sub_table" colspan="20" height="85"> 내용이 없습니다</td>
					</tr>
					</c:otherwise>
					</c:choose>
					 
				</table>
				</br>
				</div></td>
                </tr>
                
                <tr>
	                <td height="40" align="center"><table width="100%" border="0" cellspacing="0" cellpadding="0">
	                    <tr>
	                    	<td align="center"><table border="0" cellpadding="0" cellspacing="0">
	                        	<tr>
	                       			${pageing}
	                        	</tr>
	                      	</table></td>
	                    </tr>
	                  </table></td>
	              </tr>
	              
	              <tr>              
		          	<td height="40" align="right">
			        	<table border="0" width="100%">
			            	<tr>
			                	<td  align="right">
			                		<img onclick="javascript:goAllCal()" src="/img/ilgal_sanchul_icon.gif" alt="일괄 산출" border="0" style="cursor:hand;">
			                		
				                	<img src="/img/excel_icon.gif" alt="EXCEL 변환" border="0" onclick="javascript:excel_Search();" style="cursor:hand">
							        <c:if test="${tax_yn == '0'}"> 
							        <img src="/img/levy_icon3.gif" alt="일괄 부과처리" border="0" onclick="javascript:SaeweSuipBugwa_Ilgwal();" style="cursor:hand">
							        </c:if>
					            </td>
				             </tr>
				                
				                
				     	</table>
					</td>
	              </tr>
               
            </table></td>
          </tr>
          
        </table></td>
      </tr>
      <tr>
        <td height="30"></td>
      </tr>
</table>
</td></tr></table>
</form>
</body>
<script language="javascript">

	//select의 option을 선택된 값으로 지정
	function setSelectedOption(obj, val){
		for(i = 0 ; i < obj.options.length ; i++){
			if(obj.options[i].value == val){
				obj.options[i].selected = true;
				return;
			}
		}
	}
	setSelectedOption(document.jumyongForm.SECTION, '${SECTION}');
	// 공시지가 산출년도 or 최신년도 구분. 2012-11-28. by ksic gongsijiga
	setSelectedOption(document.jumyongForm.GONGSIJIGA, '${GONGSIJIGA}');
</script>
</html>

