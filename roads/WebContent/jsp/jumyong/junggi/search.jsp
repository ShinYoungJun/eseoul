<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ include file="/jsp/common/include.jsp" %>
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
<script language="javascript" src="/js/PopupCalendar.js"></script> 
<script>
		
	function checkKeySearch()
	{
		if(event.keyCode == 13) goSearch();
	}
	
	// ��ȸ
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
		// �������� ����⵵ or �ֽų⵵ ����. 2012-11-28. by ksic
		var gongsijiga = document.getElementById("GONGSIJIGA").value;
		// ����� ���� �ֹι�ȣ/���ι�ȣ ��ȸ �߰�. 180612 by ksic
		var juminNB = document.getElementById("juminNB").value;
		var corpNB = document.getElementById("corpNB").value;

		if( year == ''){
			alert("����⵵�� �Է��ϼ���. ");
			document.getElementById("YEAR").focus();
			return;
		}
		if( mul_fromdate == ''){
			alert("���ΰ��Ⱓ�� �Է��ϼ���. ");
			document.getElementById("mul_fromdate").focus();
			return;
		}
		if( mul_todate == ''){
			alert("���ΰ��Ⱓ�� �Է��ϼ���. ");
			document.getElementById("mul_todate").focus();
			return;
		}
		if( section == ''){
			alert("���뱸���� �����ϼ���. ");
			document.getElementById("SECTION").focus();
			return;
		}
		
		var iFrm = document.getElementById("IFRM_PurposeCode");
		var purpose = iFrm.contentWindow.document.getElementById("PURPOSE_CD").value;
		var purpose1 = iFrm.contentWindow.document.getElementById("PURPOSE1");

		if(purpose1[purpose1.selectedIndex].text == "::����::")
			purpose="";

		if(type.length==0)		//���������� ������ �ȵǸ� ��������� ���õ��� �ʵ��� purpose���� ���� 
			purpose="";

		/*
		location.href="/jumyong/junggi/search.do?year="+year+"&type="+type+"&tax_set="+tax_set+"&tax_yn="+tax_yn+"&mul_fromdate="+mul_fromdate+"&mul_todate="+mul_todate+
			"&purpose_cd="+purpose+"&bj_cd="+bj_cd+"&hj_cd="+hj_cd+"&jumyongName="+jumyongName+"&cal_status="+cal_status+"&SECTION="+section+"&search=1";
		*/
		/*
		// �������� ����⵵ or �ֽų⵵ ����. 2012-11-28. by ksic
		location.href="/jumyong/junggi/search.do?year="+year+"&type="+type+"&tax_set="+tax_set+"&tax_yn="+tax_yn+"&mul_fromdate="+mul_fromdate+"&mul_todate="+mul_todate+
		"&purpose_cd="+purpose+"&bj_cd="+bj_cd+"&hj_cd="+hj_cd+"&jumyongName="+jumyongName+"&cal_status="+cal_status+"&SECTION="+section+"&search=1&GONGSIJIGA="+gongsijiga;
		*/
		// ����� ���� �ֹι�ȣ/���ι�ȣ ��ȸ �߰�. 180612 by ksic
		location.href="/jumyong/junggi/search.do?year="+year+"&type="+type+"&tax_set="+tax_set+"&tax_yn="+tax_yn+"&mul_fromdate="+mul_fromdate+"&mul_todate="+mul_todate+
		"&purpose_cd="+purpose+"&bj_cd="+bj_cd+"&hj_cd="+hj_cd+"&jumyongName="+jumyongName+"&cal_status="+cal_status+"&SECTION="+section+"&search=1&GONGSIJIGA="+gongsijiga+
		"&juminNB="+juminNB+"&corpNB="+corpNB;
	}
	
	function InitPage()
	{
		//var junggi = "����� �ϰ� ���� �� ������깰ǰ������ ������� ������\n";
		//junggi += "2�� 25�� �����Ͽ� �Ϸ� �����Դϴ�.\n";
		//junggi += "2�� 26�� ����Ͽ� ����� �ϰ����� �۾��� �������ֽñ� �ٶ��ϴ�";
		//alert(junggi);
		//setYear();
		var now = new Date();
		var day=now.getDay();
		day = 1 - day;				
		Date.prototype.addDate = add_date; // Date ��ü�� �޼��� ����
		
		var fromDate = new Date(); // ���� ��¥ ��ü ����
		
		fromDate.addDate(day); // 
		
		var toDate =   document.getElementById("toDateValue").value ;
		var fromDate =   document.getElementById("fromDateValue").value ;
		var jumyongName =   document.getElementById("jumyongNameValue").value ;
		var numberValue =   document.getElementById("numberValueValue").value ;
		var search_flag =   document.getElementById("search_flag").value ;
		//����� ���� �ֹι�ȣ/���ι�ȣ ��ȸ �߰�. 180612 by ksic
		var ssn =   document.getElementById("ssnValue").value ;

		if(toDate != "" && toDate !="99999999" )
			document.getElementById("searchToDate").value = addDash(toDate);

		if(fromDate != "" && fromDate != "0")		
			document.getElementById("searchFromDate").value = addDash(fromDate);

		if(jumyongName != "")				
			document.getElementById("jumyongName").value = jumyongName;
		
		// ����� ���� �ֹι�ȣ/���ι�ȣ ��ȸ �߰�. 180612 by ksic
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
	
	
	
	function add_date(i) // �ż��尡 �� �Լ� ����
	{
	   var currentDate; // ���� ��
	   currentDate = this.getDate() + i*1; // ���� ��¥�� ����(��)�� ��¥�� ���
	   this.setDate(currentDate); // ���� ��¥�� �ٽ� ����
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
		//Y = now.getYear();	//���̻���������
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
	 *	���հ˻� key down function (����Ű�� �ԷµǸ� �˻��Լ� ȣ��)
	 */
	function checkKeySearch(){
		if(event.keyCode == "13")
			goSearch();
	}
	
	// ���� ���� ���ý� ���� ���� �ڵ� ������ ��.
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
		// ����� ���� �ֹι�ȣ/���ι�ȣ ��ȸ �߰�. 180612 by ksic
		var juminNB = document.getElementById("juminNB").value;
		var corpNB = document.getElementById("corpNB").value;
		
		// ����� ���� �ֹι�ȣ/���ι�ȣ ��ȸ �߰�. 180612 by ksic
		location.href="/jumyong/junggi/view.do?ADMIN_NO="+adminVal+"&year="+year+"&purpose_cd="+purpose_cd+"&type="+type+"&tax_set="+tax_set+"&tax_yn="+tax_yn+"&mul_fromdate="+mul_fromdate+"&mul_todate="+mul_todate+
					"&bj_cd="+bj_cd+"&hj_cd="+hj_cd+"&jumyongName="+jumyongName+"&juminNB="+juminNB+"&corpNB="+corpNB+"&cal_status="+cal_status+"&SECTION="+section+"&search=1&purpose_search="+purpose_search;

	}
	
	// �ΰ��⵵ �˻� ����
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
		// ����� ���� �ֹι�ȣ/���ι�ȣ ��ȸ �߰�. 180612 by ksic
		var juminNB = document.getElementById("juminNB").value;
		var corpNB = document.getElementById("corpNB").value;
		
		//********** BEGIN_����_20120326
		if(purpose == '000'){
			purpose = "";
		}
		//********** END_����_20120326
		form.currentPage.value	= page;
		
		// ����� ���� �ֹι�ȣ/���ι�ȣ ��ȸ �߰�. 180612 by ksic
		location.href="search.do?currentPage="+page+"&year="+year+"&type="+type+"&tax_set="+tax_set+"&tax_yn="+tax_yn+"&mul_fromdate="+mul_fromdate+"&mul_todate="+mul_todate+
						"&purpose_cd="+purpose+"&bj_cd="+bj_cd+"&hj_cd="+hj_cd+"&jumyongName="+jumyongName+"&juminNB="+juminNB+"&corpNB="+corpNB+"&cal_status="+cal_status+"&SECTION="+section+"&search="+search;
	}
	

	// ������ȯ
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
		// ����� ���� �ֹι�ȣ/���ι�ȣ ��ȸ �߰�. 180612 by ksic
		var juminNB = document.getElementById("juminNB").value;
		var corpNB = document.getElementById("corpNB").value;

		if( year == ''){
			alert("����⵵�� �Է��ϼ���. ");
			document.getElementById("YEAR").focus();
			return;
		}
		if( mul_fromdate == ''){
			alert("���ΰ��Ⱓ�� �Է��ϼ���. ");
			document.getElementById("mul_fromdate").focus();
			return;
		}
		if( mul_todate == ''){
			alert("���ΰ��Ⱓ�� �Է��ϼ���. ");
			document.getElementById("mul_todate").focus();
			return;
		}
		if( section == ''){
			alert("���뱸���� �����ϼ���. ");
			document.getElementById("SECTION").focus();
			return;
		}
		
		var iFrm = document.getElementById("IFRM_PurposeCode");
		var purpose = iFrm.contentWindow.document.getElementById("PURPOSE_CD").value;
		var purpose1 = iFrm.contentWindow.document.getElementById("PURPOSE1");

		if(purpose1[purpose1.selectedIndex].text == "::����::")
			purpose="";

		if(type.length==0)		//���������� ������ �ȵǸ� ��������� ���õ��� �ʵ��� purpose���� ���� 
			purpose="";
		
		// ����� ���� �ֹι�ȣ/���ι�ȣ ��ȸ �߰�. 180612 by ksic
		location.href= "/jumyong/junggi/excel_search.do?currentPage=1&year="+year+"&type="+type+"&tax_set="+tax_set+"&tax_yn="+tax_yn+"&mul_fromdate="+mul_fromdate+"&mul_todate="+mul_todate+
		"&purpose_cd="+purpose+"&bj_cd="+bj_cd+"&hj_cd="+hj_cd+"&jumyongName="+jumyongName+"&juminNB="+juminNB+"&corpNB="+corpNB+"&cal_status="+cal_status+"&SECTION="+section+"&search=1";
	}

	// �ϰ� �ΰ��ϱ�
	function SaeweSuipBugwa_Ilgwal()
	{
		var form = document.jumyongForm;
		var year = document.getElementById("YEAR").value;
		var type = document.getElementById("TYPE").value;
		var section = document.getElementById("SECTION").value;

		if( section == '' ){
			alert("���뱸���� �����ϼ���. ");
			document.getElementById("SECTION").focus();
			return;
		}
		
		if(form.TOTALCNT.value <= 0){
			alert("�ϰ�ó���� �����Ͱ� �����ϴ�. ");
			return;
		}
		

		
		if(document.getElementById("bugwaFlag").value == '1'){
			if(!confirm("�ϰ��ΰ� �Ͻñ� ���� ��Ȯ�ϰ� ���� �� �ԷµǾ����� Ȯ���ϼž� �մϴ�. \n\n �ش� �ǵ鿡 ���Ͽ� �ϰ��ΰ� �Ͻðڽ��ϱ�?"))
				return;
			
			document.getElementById("bugwaFlag").value = '0';
			form.action = "/jumyong/saewe/saeweSuipBugwa_ilgwal_junggi.do?year="+year;
			form.submit();
		}else{
			alert("�ϰ��ΰ� ó���� ������ ���� ��ٸ�����");
			return;
		}
	}
	
	// �ϰ� ����
	function goAllCal(){

		var f = document.jumyongForm;
		var year = document.getElementById("YEAR").value;
		var section = document.getElementById("SECTION").value;

		if( section == '' ){
			alert("���뱸���� �����ϼ���. ");
			document.getElementById("SECTION").focus();
			return;
		}
		
		if(f.TOTALCNT.value <= 0){
			alert("ó���� �����Ͱ� �����ϴ�. ");
			return;
		}
		
		if(!confirm("�ϰ������� ���ܼ��Կ� �ΰ��� �ǵ鿡 ���ؼ��� ������ �˴ϴ�. \n �ϰ����� �Ͻðڽ��ϱ�?"))
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
                      <td height="26px" align="center" bgcolor="e5eff8" class="sub_table_b" >����⵵</td>
                      <td bgcolor="eaeaea" class="table_bl_left" colspan="3">
	                      <input type="text" id="YEAR" name="YEAR" class="essential" style="width:50px" maxlength="4" value="${year}" onKeyUp="change_value(this)"> ��
					  </td>
					 </tr>
					 --%>
                    <tr>
                      <td height="26px" align="center" bgcolor="e5eff8" class="sub_table_b" >����⵵</td>
                      <td bgcolor="eaeaea" class="table_bl_left">
	                      <input type="text" id="YEAR" name="YEAR" class="essential" style="width:50px" maxlength="4" value="${year}" onKeyUp="change_value(this)"> ��
					  </td>
                      <td height="26px" align="center" bgcolor="e5eff8" class="sub_table_b">��������</td>                      
					  <td bgcolor="eaeaea" class="table_bl_left">
						<select id="GONGSIJIGA" name="GONGSIJIGA" class="input_form1" style="width:130px" >
							<option value="1">::�⺻::</option>
							<option value="2">�ֽ�</option>							
					    </select>
					  </td>
					 </tr>
					 <tr>
					  <td height="26px" align="center" bgcolor="e5eff8" class="sub_table_b">���뱸��</td>                      
					  <td bgcolor="eaeaea" class="table_bl_left">
						<select id="SECTION" name="SECTION" class="essential" style="width:130px" >
							<option value="">::��ü::</option>
							<option value="1">���</option>
							<option value="3">����</option>							
					    </select>
					  </td>
                      <td height="26px" align="center" bgcolor="e5eff8" class="sub_table_b">����</td>                      
					  <td bgcolor="eaeaea" class="table_bl_left">
						<select id="TYPE" name="TYPE" class="input_form1" style="width:130px" OnChange="Select_UseType(this);">
							${use_type}
					    </select>
					  </td>
                    </tr>
					
                    <tr>
                      <td height="26px" align="center" bgcolor="e5eff8" class="sub_table_b">���Ա���</td>
					  <td bgcolor="eaeaea" class="table_bl_left">
						<select id="TAX_SET" name="TAX_SET" class="input_form1" style="width:130px">
					  		${taxation_section}
					  	</select>
					  </td>
					  <td height="26px" align="center" bgcolor="e5eff8" class="sub_table_b">�ΰ����� </td>
					  <td bgcolor="eaeaea" class="table_bl_left">
						<select id="TAX_YN" name="TAX_YN" class="input_form1" style="width:130px">
                        	${taxation_yn}
                     	</select>
               	      </td>
                    </tr>
                    
                     <tr>
                      <td height="26px" align="center" bgcolor="e5eff8" class="sub_table_b">����Ⱓ</td>
					  <td bgcolor="eaeaea" class="table_bl_left" colspan="3">
					  	<input id="mul_fromdate" name="mul_fromdate" type="text" class="input_form1" style="width:70px" value="${mul_fromdate }">
					  	<img src="/img/calendar_icon.gif" width="19" height="16" border="0" align="absmiddle" onclick="popUpCalendar(this, document.getElementById('mul_fromdate'), 'yyyymmdd')" style="CURSOR: pointer ;">
					  	&nbsp;~&nbsp;<input id="mul_todate" name="mul_todate" type="text" class="input_form1" style="width:70px" value="${mul_todate }">
					  	<img src="/img/calendar_icon.gif" width="19" height="16" border="0" align="absmiddle" onclick="popUpCalendar(this, document.getElementById('mul_todate'), 'yyyymmdd')" style="CURSOR: pointer;">
					  </td>
                    </tr>
                    <input type="hidden" id="cal_status" name="cal_status" value="">

				<tr>
					<td height="26px" align="center" bgcolor="e5eff8" class="sub_table_b">�������</td>
					<td colspan="3" bgcolor="eaeaea" class="table_bl_left">
						<table width="100%" border="0" cellpadding="0" cellspacing="0" class="sub_stan">
							<tr><td>
								<iframe id="IFRM_PurposeCode" align="absmiddle" scrolling="no" frameborder="0" framespacing="0" width="100%" height="25"></iframe>
							</td></tr>
					  	</table>
					</td>
                </tr>
                <tr>
					<td height="26px" align="center" bgcolor="e5eff8" class="sub_table_b">������/������</td>
					<td bgcolor="eaeaea" class="table_bl_left">
						<select id="BJ_CD" name="BJ_CD" class="input_form1" style="width:130px">${bjdong_code}</select>
						<select id="HJ_CD" name="HJ_CD" class="essential" style="width:130px">${hjdong_code}</select>
					</td>
					<td height="26px" align="center" bgcolor="e5eff8" class="sub_table_b">������/���θ�</td>
                    <td bgcolor="eaeaea" class="table_bl_left">
						<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
                        	<tr>
                          		<td><input id="jumyongName" name="jumyongName" type="text" class="input_form1" style="width:130px" onKeyDown="javascript:checkKeySearch();" value="${jumyongName }"></td>
                        	</tr>
                      	</table>
                   	</td>
                </tr>
                
<%-- ����� ���� �ֹι�ȣ/���ι�ȣ ��ȸ �߰�. 180612 by ksic--%>
                <tr>					
					<td height="26px" align="center" bgcolor="e5eff8" class="sub_table_b">�ֹι�ȣ</td>
                    <td bgcolor="eaeaea" class="table_bl_left">
						<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
                        	<tr>
                          		<td><input id="juminNB" name="juminNB" type="text" class="input_form1" style="width:130px" onKeyDown="javascript:checkKeySearch();" value="${juminNB }"></td>
                        	</tr>
                      	</table>
                   	</td>
					
					<td height="26px" align="center" bgcolor="e5eff8" class="sub_table_b">���ι�ȣ</td>
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
                  <td height="32" align="right"><img src="/img/inquiry_icon2.gif" alt="��ȸ" width="56" height="18" border="0" onclick="javascript:goSearch();" style="cursor:pointer" >
                  </td>
                </tr>
                <tr>
                  <td height="1" bgcolor="#EAEAEA"></td>
                </tr>
                <tr>
                  <td height="34" class="sub_stan">��ü�Ǽ� : <span class="sub_stan_blue">${listCount}</span>�� 
                  	<div style="float: right;"><a href="/bbs/bbs_jumyong.jsp">����иŴ��� �ٿ������ ����</a></div>
                  </td>
                </tr>
                <tr>
                  <td>
				<div style=" width:780px;padding:10px;overflow-x:auto; scrollbar-face-color:#EEF8FB;  scrollbar-3dlight-color:#BBBDB6;scrollbar-highlight-color:#EEF8FB;scrollbar-shadow-color:#BBBDB6; scrollbar-darkshadow-color:#EEF8FB;  scrollbar-track-color:#EEF8FB; scrollbar-arrow-color:#BBBDB6;"> 
				<table width="2500px" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
			    	<tr>
                        <td height="28" align="center" bgcolor="e5eff8" class="sub_table_b">������ȣ</td>
                        <td align="center" bgcolor="e5eff8" class="sub_table_b">����<br/>��ȣ</td>
                        <td align="center" bgcolor="e5eff8" class="sub_table_b">�ΰ�<br/>����</td>
                        <td align="center" bgcolor="e5eff8" class="sub_table_b">����<br/>����</td>
                        <td align="center" bgcolor="e5eff8" class="sub_table_b">������/���θ�</td>
<%-- ����� ���� �ֹι�ȣ/���ι�ȣ ��ȸ �߰�. 180612 by ksic--%>                        
                        <td align="center" bgcolor="e5eff8" class="sub_table_b">�ֹι�ȣ/<br/>���ι�ȣ</td>
                        
                        <td align="center" bgcolor="e5eff8" class="sub_table_b">������<br/>�����ȣ</td>
                        <td align="center" bgcolor="e5eff8" class="sub_table_b">������ �ּ�</td>
                        <td align="center" bgcolor="e5eff8" class="sub_table_b">������ �� �ּ�</td>
                        <td align="center" bgcolor="e5eff8" class="sub_table_b">����<br/>����</td>
                        <td align="center" bgcolor="e5eff8" class="sub_table_b">����<br/>����</td>
                        <td align="center" bgcolor="e5eff8" class="sub_table_b">����<br/>����</td>
                        <td align="center" bgcolor="e5eff8" class="sub_table_b">����<br/>����</td>
                        <td align="center" bgcolor="e5eff8" class="sub_table_b">������<br/>����</td>
                        <td align="center" bgcolor="e5eff8" class="sub_table_b">������</td>
                        <!-- sungh83 20131115 -->
                        <td align="center" bgcolor="e5eff8" class="sub_table_b">�����ּ�</td>
                        <!-- sungh83 20131115 -->
                        <td align="center" bgcolor="e5eff8" class="sub_table_b">����<br/>����</td>
                        <td align="center" bgcolor="e5eff8" class="sub_table_b">�������</td>
                        <td align="center" bgcolor="e5eff8" class="sub_table_b">���������</td>
                        <td align="center" bgcolor="e5eff8" class="sub_table_b">����<br/>�����</td>
                        <td align="center" bgcolor="e5eff8" class="sub_table_b">�ΰ���ġ��</td>
                        <td align="center" bgcolor="e5eff8" class="sub_table_b">����/������</td>
                        <td align="center" bgcolor="e5eff8" class="sub_table_b">����/���� ����</td>
                        <td align="center" bgcolor="e5eff8" class="sub_table_b">�����ڵ�</td>
                        <td align="center" bgcolor="e5eff8" class="sub_table_b">����<br/>������</td>
                        <td align="center" bgcolor="e5eff8" class="sub_table_b">����<br/>����</td>
                        <td align="center" bgcolor="e5eff8" class="sub_table_b">����<br/>(�ܰ�)</td>
                        <td align="center" bgcolor="e5eff8" class="sub_table_b">��������</td>
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
<%-- ����� ���� �ֹι�ȣ/���ι�ȣ ��ȸ �߰�. 180612 by ksic--%>                        
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
						<td align="center" class="sub_table" colspan="20" height="85"> ������ �����ϴ�</td>
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
			                		<img onclick="javascript:goAllCal()" src="/img/ilgal_sanchul_icon.gif" alt="�ϰ� ����" border="0" style="cursor:hand;">
			                		
				                	<img src="/img/excel_icon.gif" alt="EXCEL ��ȯ" border="0" onclick="javascript:excel_Search();" style="cursor:hand">
							        <c:if test="${tax_yn == '0'}"> 
							        <img src="/img/levy_icon3.gif" alt="�ϰ� �ΰ�ó��" border="0" onclick="javascript:SaeweSuipBugwa_Ilgwal();" style="cursor:hand">
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

	//select�� option�� ���õ� ������ ����
	function setSelectedOption(obj, val){
		for(i = 0 ; i < obj.options.length ; i++){
			if(obj.options[i].value == val){
				obj.options[i].selected = true;
				return;
			}
		}
	}
	setSelectedOption(document.jumyongForm.SECTION, '${SECTION}');
	// �������� ����⵵ or �ֽų⵵ ����. 2012-11-28. by ksic gongsijiga
	setSelectedOption(document.jumyongForm.GONGSIJIGA, '${GONGSIJIGA}');
</script>
</html>

