<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
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
}
-->

</style>
<link href="/css/roads.css" rel="stylesheet" type="text/css">
</head>

<script language="javascript" src="/js/PopupCalendar.js"></script> 
<script language='JavaScript' src='/js/Check_inputbox.js'></script>
<script language="javascript" src="/js/Ajax_request.js"></script>

<script type="text/javascript">
//<![CDATA[

	function	ModifyPrc()
	{
		var	result	= DataCheck();
		if(result	==	false)return;
		if(!TaxDateCheck()) return;
		
		var form = document.form;
		var intax = removeComma(form.INTAX.value);
		var sise  = removeComma(form.SISE.value);
		var guse  = removeComma(form.GUSE.value);
		
		if(	intax != sise + guse)
		{
			alert("시세+구세 합계가 총부과금액과 일치하지 않습니다.");
			return;
		}	

		var	obj	= document.getElementById("ADD_YN");
		
		if(obj.checked	== true)	//	가산금 면제여부
			document.getElementById("ADD_YN").value='1';
		else
			document.getElementById("ADD_YN").value='0';

		form.action = "/rojum/saewe/bugwa_modify_prc.do";
		form.submit();
	}

	function removeComma(numValue)
	{
		return Number(numValue.split(',').join(""));
	}
	
	function	Cancel()
	{
		var form = document.form;

		form.action = "/rojum/saewe/bugwa_view.do";
		form.submit();
	}

	function	Tax_Year(selected)
	{
		var now		= new Date();
		var nowyear	= now.getFullYear();
		var year	= nowyear - 1;
		
		var opt = document.getElementById('tax_year');
        var root;
        var selectBoxLabel;
        var selectBoxValue;
        var tags	= "";
        var	text	= "";
        
        for(var i = 0; i < 2; i++)
        {
        	selectBoxValue = year + i;
        	selectBoxLabel = year + i;

            tags 	= document.createElement("option");
       		text	= document.createTextNode(selectBoxLabel);
            tags.setAttribute("label", selectBoxLabel);

            if(selected	== null)
            	selected	= nowyear;
                
            if(selectBoxValue == selected) tags.setAttribute("selected", "true");

            tags.value = selectBoxValue;
            tags.appendChild(text);
            opt.appendChild(tags);
        }
	}

	function	Tax_Month(selected)
	{		
		var now		= new Date();
		var month	= now.getMonth() + 1;
		
		var opt = document.getElementById('tax_month');
        var root;
        var selectBoxLabel;
        var selectBoxValue;
        var tags	= "";
        var	text	= "";
        
        for(var i = 1; i <= 12; i++)
        {
        	selectBoxValue = i;
        	selectBoxLabel = i;

            tags 	= document.createElement("option");
       		text	= document.createTextNode(selectBoxLabel);
            tags.setAttribute("label", selectBoxLabel);

            if(selected	== null)
            	selected	= month;
        	           
            if(i == selected) tags.setAttribute("selected", "true");

            tags.value = selectBoxValue;
            tags.appendChild(text);
            opt.appendChild(tags);
        }
	}

	function	Init_ADD_YNCheck(addyn)
	{
		if(addyn	== '1')	//	가산금 면제여부
			document.getElementById("ADD_YN").checked	= true;
		else
			document.getElementById("ADD_YN").checked	= false;
	}

	function	MultiData_Check()
	{
		var form = document.form;

		form.bugwa_bonse.value		= form.BONSE.value;
		form.bugwa_vat.value		= form.VAT.value;
		form.bugwa_intax.value		= form.INTAX.value;
		form.bugwa_overtax.value	= form.OVERTAX.value;
	}

	function	DataCheck()
	{
		var form 	= document.form;
		var	str		= "";
		
		if(form.TAX_GUBUN.value.length	< 1)
			str	+= "과세구분을 입력하세요\n";
		else if(form.TAX_CD.value.length	< 1)
			str	+= "세목코드를 입력하세요\n";
		else if(form.TAXPAYER_SET.value.length	< 1)
			str	+= "납세자 구분을 입력하세요\n";
		else if(form.LIVE.value.length	< 1)
			str	+= "거주상태를 입력하세요\n";
		else if(form.OBJ_SET.value.length	< 1)
			str	+= "물건구분을 입력하세요.\n";
		else if(form.TAX_DATE.value.length	< 1)
			str	+= "과세일자를 입력하세요\n";
		else if(form.INDATE.value.length	< 1)
			str	+= "납기내일자를 입력하세요\n";
		else if(form.OVERTAX.value.length	< 1)
			str	+= "납기후금액을 입력하세요\n";
		else if(form.OVERDATE.value < 110)
			str	+= "납기후일자를 입력하세요\n";

		if(str	== "")
		{
			return	true;
		}
		
		alert(str);

		return	false;		
	}

	function	TaxDateCheck()
	{
		var form 	= document.form;

		if(form.TAX_DATE.value.length	< 1)
			return;

		var	tax_year	= new Number(form.tax_year.value);
		var	tax_month	= new Number(form.tax_month.value);

		var	tax		= form.TAX_DATE.value;
		var	year	= new Number(tax.substr(0, 4));
		var	month	= new Number(tax.substr(5, 2));

	//	alert(tax_year.valueOf() + ", " + tax_month.valueOf() + ", " + year.valueOf() + ", " + month.valueOf());

		if(tax_year.valueOf() != year.valueOf())
		{   
			alert("과세년월과 과세일자의 년월이 다르게 부과할수 없습니다.");
			return false;
		}
		else if(tax_month.valueOf() != month.valueOf())
		{
			alert("과세년월과 과세일자의 년월이 다르게 부과할수 없습니다.");
			return false;
		}
		if(document.getElementById("TAX_DATE").value>document.getElementById("INDATE").value){
			alert("납기내일자는 과세일자보다 늦게 설정 할 수없습니다.");
			return ;
		}
		
		if(document.getElementById("INDATE").value>document.getElementById("OVERDATE").value){
			alert("납기후일자는 납기내일자보다 늦게 설정 할 수 없습니다.");
			return;
		}
		return true;
	}

	function	AfterDate(obj)
	{
		var	thisDate	= obj.value;
		var	thisMon		= new Date();//thisDate.substr(0, 4), thisDate.substr(5, 2), thisDate.substr(8, 2));

		var	year	= new Number(thisDate.substr(0, 4));
		var	month	= new Number(thisDate.substr(5, 2)) + 1;
		var	date	= new Number(thisDate.substr(8, 2)) - 1;

	//	alert(date);
		thisMon.setYear(year);
		thisMon.setMonth(month);
		thisMon.setDate(date);

		alert(thisMon.toLocaleString());
	//	alert(thisMon.getYear() + ", " + thisMon.getMonth() + ", " + thisMon.getDate());
	//	alert(date + 1);
		
		year	= "" + thisMon.getFullYear();
		month	= "" + thisMon.getMonth();
		date	= "" + thisMon.getDate();
		
		if(month.length == 1)	month 	= "0" + month;
		if(date.length == 1)	date	= "0" + date;

		document.getElementById("OVERDATE").value	= year + "-"+ month +"-"+ date;
	}
	
	function 	Init()
	{
		parent.TabDown_Img("bugwa");
		
		parent.Bugwa_Off();
	}
	
	//숫자만 입력
	function onlyNumberInput()
	{	
		var code = window.event.keyCode;
	
	 	if ((code > 34 && code < 41) || (code > 47 && code < 58) || (code > 95 && code < 106) || code == 8 || code == 9 || code == 13 || code == 46 || code == 190)
	 	{
		  	window.event.returnValue = true;
			return;
	 	}else {	 
	 		window.event.returnValue = false;
	 		return;
 	 	}
	}	

	function	SemokInfo()
	{
		var	TAX_CD	= document.getElementById("TAX_CD").value;
		var	SIGU_CD	= document.getElementById("SIGU_CD").value;
		var	DEPT_CD	= document.getElementById("DEPT_CD").value;
		
		var	params	= "TAX_CD=" + TAX_CD + "&SIGU_CD=" + SIGU_CD + "&DEPT_CD=" + DEPT_CD;
	
		sendRequest("/rojum/saewe/semokinfo.do", params, "GET", Result_SemokInfo);
	}
	
	function	Result_SemokInfo(obj)
	{
		if(obj == "")
		{		
			alert("세목코드 실패!!");
			return;
		}
		
        var xmldoc 	= new ActiveXObject("Microsoft.XMLDOM");
        var form 	= document.form;
		
        xmldoc.async	= false;
		xmldoc.loadXML(obj);
		
		form.ADD_SET.value		= 	xmldoc.getElementsByTagName("gasanRateGubun").item(0).text;
		form.ADD_SET_NM.value	= 	xmldoc.getElementsByTagName("gasanRateGubunNm").item(0).text;
		form.SUBUSEO_CD.value	=	xmldoc.getElementsByTagName("suBuseoCd").item(0).text;
		form.gasanRate.value	=	xmldoc.getElementsByTagName("gasanRate").item(0).text;
		form.OCR_BUSEO_CD.value	=	xmldoc.getElementsByTagName("ocrBuseoCd").item(0).text;
		form.OCR_SIGU_CD.value	=	xmldoc.getElementsByTagName("ocrSiguCd").item(0).text;

		if(form.ADD_SET.value == '7'){
    		form.ADD_YN.value = 1;
		}else{
			form.ADD_YN.value = 0;
		}

		
		//납기후금액(10원단위절삭) = 본세 * 가산율 + 본세
		var overtax = String((parseInt(form.BONSE_COMMA_CUT.value)/100) * parseInt(form.gasanRate.value) + parseInt(form.BONSE_COMMA_CUT.value));
		var overtax_value = 0;
		
		if(overtax != '0'){
			overtax_value = parseInt(overtax.substr(0, overtax.length - 1)) * 10;
		}
		
		form.OVERTAX.value = overtax_value;
		form.bugwa_overtax.value = overtax_value;
		
		comma_paste(form.OVERTAX);
		comma_paste(form.bugwa_overtax);
		
		var	TAX_CD	= document.getElementById("TAX_CD").value;
		
		//변상금이면 부가 가치세는 0원...
		if(TAX_CD == '50228210' || TAX_CD == '10228202' || TAX_CD == '10228204' || TAX_CD == '10228205' || TAX_CD == '50228203'  || TAX_CD == '50228204' || TAX_CD == '50228206'){
			form.VAT.value = "0";
			form.bugwa_vat.value = "0";
		}
		else	//변상금이 아니면 부가 가치세 할당...
		{
			var bonse = "${BONSE}";
			var imsi_vat = String(parseInt(bonse)/100 * 10);
			imsi_vat = parseInt(imsi_vat.substr(0, imsi_vat.length - 1)) * 10;
			form.VAT.value = imsi_vat;
			form.bugwa_vat.value = imsi_vat;
			comma_paste(form.VAT);
			comma_paste(form.bugwa_vat);
		}
	}
	
	function add_yn_check()
	{
		var form  = document.form;
		var check_value = form.ADD_YN.checked;

		if(check_value == true){
			form.ADD_YN.value = "1";
		}
		else
		{
			form.ADD_YN.value = "0";
		}
	}
//]]>
</script>

<body onload="Init(); javaScript:Tax_Year('${tax_year}'); javaScript:Tax_Month('${tax_month}'); Init_ADD_YNCheck('${board.ADD_YN}');">
<form id="form" name="form" method="post">
<input type="hidden" id="ADMIN_NO" name="ADMIN_NO" value="${ADMIN_NO}">
<input type="hidden" id="SEQ" name="SEQ" value="${SEQ}">
<input type="hidden" id="gasanRateGubun" name="gasanRateGubun">
<input type="hidden" id="gasanRateGubunNm" name="gasanRateGubunNm">
<input type="hidden" id="vatYn" name="vatYn">
<input type="hidden" id="suBuseoCd" name="suBuseoCd">
<input type="hidden" id="gasanRate" name="gasanRate">
<input type="hidden" id="BONSE_COMMA_CUT" name="BONSE_COMMA_CUT" value="${BONSE}">

<table width="780" border="0" cellpadding="0" cellspacing="0">
	  <tr>
		<td align="left" class="contborder_blue">
		<table width="100%" border="0" cellspacing="0" cellpadding="0">
			<tr>
			  <td><table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">

				<tr>
					<td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">과세번호</td>
					<td width="37%" bgcolor="eaeaea" class="table_bl_left"><input id="TAX_NO" name="TAX_NO" type="text" class="readonly" style="width:120px" value="${board.TAX_NO}" readonly></td>
					<td width="100" align="center" bgcolor="e5eff8" class="sub_table_b">과세구분</td>
					<td width="36%" bgcolor="eaeaea" class="table_bl_left">
						<select id="TAX_GUBUN" name="TAX_GUBUN" class="essential" style="width:70px">
							${taxation_part}
						</select>
					</td>
				</tr>
				
				<tr>
					<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">과세년월</td>
					<td bgcolor="eaeaea" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
					  <tr>
						<td>
							<select id="tax_year" name="tax_year" class="essential" style="width:55px">
							</select>
						년&nbsp;&nbsp;</td>
						
						<td>
							<select id="tax_month" name="tax_month" class="essential" style="width:40px">
							</select>
						월</td>
				   	  </tr>
					</table></td>
					<td width="100" align="center" bgcolor="e5eff8" class="sub_table_b">세목코드</td>
					<td bgcolor="eaeaea" class="table_bl_left">			
						<select id="TAX_CD" name="TAX_CD" class="essential" style="width:185px" OnChange="SemokInfo();">
							${taxcode}
						</select>
					</td>
				</tr>
				
				<tr>
					<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">OCR시구코드</td>
					<td bgcolor="eaeaea" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
					  <tr>
						<td><input id="OCR_SIGU_CD" name="OCR_SIGU_CD" type="text" class="readonly" style="width:45px" value="${board.OCR_SIGU_CD}"></td>
				   	  </tr>
					</table></td>
					<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">OCR부서코드</td>
					<td bgcolor="eaeaea" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
					  <tr>
						<td><input id="OCR_BUSEO_CD" name="OCR_BUSEO_CD" type="text" class="readonly" style="width:45px" value="${board.OCR_BUSEO_CD}"></td>
				   	  </tr>
					</table></td>
				</tr>	
				
				<tr>
					<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">기관코드</td>
					<td bgcolor="eaeaea" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
					  <tr>
						<td><input id="SIGU_CD" name="SIGU_CD" type="text" class="readonly" style="width:45px" value="${board.SIGU_CD}" readonly></td>
						<td>&nbsp;<input type="text" class="readonly" style="width:120px" value="${board.GU_NM}" readonly></td>
				   	  </tr>
					</table></td>
					<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">부서코드</td>
					<td bgcolor="eaeaea" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
					  <tr>
						<td><input id="DEPT_CD" name="DEPT_CD" type="text" class="readonly" style="width:45px" value="${board.DEPT_CD}" readonly></td>
						<td>&nbsp;<input type="text" class="readonly" style="width:120px" value="${board.DEPT_NM}" readonly></td>
				   	  </tr>
					</table></td>
				</tr>
				  
				<tr>
					<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">납세자구분</td>
					<td colspan="3" bgcolor="eaeaea" class="table_bl_left">
						<select id="TAXPAYER_SET" name="TAXPAYER_SET" class="essential" style="width:245px">
							${taxpayer_group}
						</select>					
					</td>
				</tr>
				
				<tr>
					<td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">거주상태</td>
					<td width="181" bgcolor="eaeaea" class="table_bl_left">
						<select id="LIVE" name="LIVE" class="essential" style="width:115px">
							${taxpayer_residence}
						</select>
					</td>
					<td width="100" align="center" bgcolor="e5eff8" class="sub_table_b">물건구분</td>
					<td width="181" bgcolor="eaeaea" class="table_bl_left">
						<select id="OBJ_SET" name="OBJ_SET" class="essential" style="width:70px">
							${object_type}
						</select>
					</td>
				</tr>
				
				<tr>
					<td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">본세(점용료)</td>
					<td width="181" bgcolor="eaeaea" class="table_bl_left"><input id="BONSE" name="BONSE" type="text" class="readonly" style="width:120px" value="${board.BONSE}" readonly></td>
					<td width="100" align="center" bgcolor="e5eff8" class="sub_table_b">수납부서</td>
					<td bgcolor="eaeaea" class="table_bl_left"><input id="SUBUSEO_CD" name="SUBUSEO_CD" type="text" class="input_form1" style="width:120px" value="${board.SUBUSEO_CD}"></td>
				</tr>
				
				<tr>
					<td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">부가가치세</td>
					<td width="181" bgcolor="eaeaea" class="table_bl_left"><input id="VAT" name="VAT" type="text" class="readonly" style="width:120px" value="${board.VAT}" readonly></td>
					<td width="100" align="center" bgcolor="e5eff8" class="sub_table_b">과세일자</td>
					<td bgcolor="eaeaea" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
					  <tr>
						<td><input id="TAX_DATE" name="TAX_DATE" type="text" class="essential" style="width:65px" value="${board.TAX_DATE}" readonly></td>
						<td><a><img src="/img/calendar_icon.gif" width="19" height="16" border="0" onclick="popUpCalendar(this, document.getElementById('TAX_DATE'), 'yyyymmdd')" style="CURSOR: Hand;"></a></td>
					  </tr>
					</table></td>
				</tr>
				
				<tr>
					<td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">납기내금액</td>
					<td width="181" bgcolor="eaeaea" class="table_bl_left"><input id="INTAX" name="INTAX" type="text" class="readonly" style="width:120px" value="${board.INTAX}" readonly></td>
					<td width="100" align="center" bgcolor="e5eff8" class="sub_table_b">납기내일자</td>
					<td bgcolor="eaeaea" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
					  <tr>
						<td><input id="INDATE" name="INDATE" type="text" class="essential" style="width:65px" value="${board.INDATE}" onFocus="" readonly></td>
						<td><a><img src="/img/calendar_icon.gif" width="19" height="16" border="0" onclick="popUpCalendar(this, document.getElementById('INDATE'), 'yyyymmdd');" style="CURSOR: Hand;"></a></td>
					  </tr>
					</table></td>
				</tr>
				
				<tr>
					<td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">납기후금액</td>
					<td width="181" bgcolor="eaeaea" class="table_bl_left"><input id="OVERTAX" name="OVERTAX" type="text" class="essential" style="width:120px" value="${board.OVERTAX}" style="ime-mode:disabled" onKeyDown="nr_num_int(this); MultiData_Check();" onKeyUp="nr_num_int(this); comma_paste(this); MultiData_Check();" onKeyPress="nr_num_int(this);"></td>
					<td width="100" align="center" bgcolor="e5eff8" class="sub_table_b">납기후일자</td>
					<td bgcolor="eaeaea" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
					  <tr>
						<td><input id="OVERDATE" name="OVERDATE" type="text" class="essential" style="width:65px" value="${board.OVERDATE}" readonly></td>
						<td><a><img src="/img/calendar_icon.gif" width="19" height="16" border="0" onclick="popUpCalendar(this, document.getElementById('OVERDATE'), 'yyyymmdd')" style="CURSOR: Hand;"></a></td>
					  </tr>
					</table></td>
				</tr>
				
				<tr>
					<td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">가산율구분</td>
					<td width="181" bgcolor="eaeaea" class="table_bl_left">
						<input id="ADD_SET" name="ADD_SET" type="hidden" value="${board.ADD_SET}">
						<input id="ADD_SET_NM" name="ADD_SET_NM" type="text" class="readonly" style="width:160px" value="${ADD_SET_NM}" readonly>
					</td>
					<td width="100" align="center" bgcolor="e5eff8" class="sub_table_b">가산금면제여부</td>
					<td bgcolor="eaeaea" class="table_bl_left">
						<c:if test="${board.ADD_YN == '1'}">
							<input id="ADD_YN" name="ADD_YN" value="1" type="checkbox" onclick="javascript:add_yn_check();" checked="checked">가산금면제
						</c:if>
						<c:if test="${board.ADD_YN != '1'}">
							<input id="ADD_YN" name="ADD_YN" value="0" type="checkbox" onclick="javascript:add_yn_check();">가산금면제
						</c:if>
					</td>
				</tr>
				
				<tr>
					<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">비고</td>
					<td colspan="3" bgcolor="eaeaea" class="table_bl_left"><input id="NOTES" name="NOTES" type="text" class="input_form1" style="width:98%" value="${board.NOTES}"></td>
				</tr>
				
				<tr>
					<td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">적용 상한율</td>
					<td width="181" bgcolor="eaeaea" class="table_bl_left"><input id="LIMIT_SUM" name="LIMIT_SUM" type="text" class="input_form1" style="width:120px" value="${board.LIMIT_SUM}" onKeyDown="onlyNumberInput();" maxlength="3"></td>
					<td width="100" align="center" bgcolor="e5eff8" class="sub_table_b">상한횟수</td>
					<td bgcolor="eaeaea" class="table_bl_left"><input id="LIMIT_CNT" name="LIMIT_CNT" type="text" class="input_form1" style="width:120px" value="${board.LIMIT_CNT}" onKeyDown="onlyNumberInput();" maxlength="3"></td>
				</tr>
				
				<tr>
					<td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">특별이율</td>
					<td width="181" bgcolor="eaeaea" class="table_bl_left"><input id="RATE" name="RATE" type="text" class="input_form1" style="width:120px" value="${board.RATE}" onKeyDown="onlyNumberInput();" maxlength="8"></td>
					<td width="100" align="center" bgcolor="e5eff8" class="sub_table_b">특별이율 사유</td>
					<td bgcolor="eaeaea" class="table_bl_left"><input id="RATE_CAUSE" name="RATE_CAUSE" type="text" class="input_form1" style="width:120px" value="${board.RATE_CAUSE}" maxlength="50"></td>
				</tr>
				
 		    </table></td>
			</tr>
			
		      <tr>
		        <td height="14"></td>
		      </tr>
				
		<tr>
			<td><table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
		    <tr>

		        <td width="17%" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">본세</td>
		        <td width="17%" align="center" bgcolor="e5eff8" class="sub_table_b">부가가치세</td>
		        <td width="17%" align="center" bgcolor="e5eff8" class="sub_table_b">납기내금액</td>
		        <td width="17%" align="center" bgcolor="e5eff8" class="sub_table_b">납기후금액</td>
		    </tr>
		     
			<tr>
				<td height="26" align="center"><input id="bugwa_bonse" name="bugwa_bonse" type="text" value="${board.BONSE}" style="width:92%; text-align:right;" class="readonly" readonly></td>
				<input id="SISE" name="SISE" type="hidden" value="${board.SISE}" class="input_form1" style="width:90%; text-align:right;" style="ime-mode:disabled" onKeyDown="nr_num_int(this);" onKeyUp="nr_num_int(this);  comma_paste(this);" onKeyPress="nr_num_int(this);" maxlength=13>
				<input id="GUSE" name="GUSE" type="hidden" value="${board.GUSE}" class="input_form1" style="width:90%; text-align:right;" style="ime-mode:disabled" onKeyDown="nr_num_int(this);" onKeyUp="nr_num_int(this);  comma_paste(this);" onKeyPress="nr_num_int(this);" maxlength=13>
				<td align="center"><input id="bugwa_vat" name="bugwa_vat" type="text" value="${board.VAT}" class="readonly" style="width:92%; text-align:right;" readonly></td>
				<td align="center"><input id="bugwa_intax" name="bugwa_intax" type="text" value="${board.INTAX}" class="readonly" style="width:92%; text-align:right;" readonly></td>
				<td align="center"><input id="bugwa_overtax" name="bugwa_overtax" type="text" value="${board.OVERTAX}" class="readonly" style="width:92%; text-align:right;" readonly></td>
             </tr>
			</table></td>
		</tr>

			<tr>
			  <td height="40" align="right">
				<a href="javascript:Cancel()"><img src="/img/can_icon.gif" alt="취소" width="56" height="18" border="0"></a>
				<a href="javascript:ModifyPrc()"><img src="/img/save_icon2.gif" alt="저장" width="56" height="18" border="0"></a>
			  </td>
			</tr>
			
		</table></td>
	  </tr>

</table>

</body>
</html>
