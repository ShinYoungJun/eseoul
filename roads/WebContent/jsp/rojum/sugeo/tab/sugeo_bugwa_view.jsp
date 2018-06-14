<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ include file="/jsp/common/loginCheck.jsp"%>
<%@ include file="/jsp/common/include.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=euc-kr" />

<title>::::: ����� ������������ý��� :::::</title>
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

<script language="javascript" src="/js/PopupCalendar.js"></script>
<script language='JavaScript' src='/js/Check_inputbox.js'></script>
<script language="javascript" src="/js/common.js"></script>
<script language="javascript" src="/js/calculation.js"></script>
<script language="javascript" src="/js/Ajax_request.js"></script>
<script language='JavaScript' src='/jsp/rojum/sugeo/tab/sugeo_bugwa_register.js'></script>

<script type="text/javascript">
//<![CDATA[
			
	function Init(){

		var obj = document.form.message.value;
		if(obj != "")	
			alert(obj);
		
		SemokInfo();
		
		return;
	}

	function goFine(){
		document.location.href = "/rojum/sugeo/sugeo_fine_view.do?mul_no=${mul_no}";

	}

	function changeRate(){
		var before_rate = document.getElementById("BEFORE_RATE");
		if(parseFloat(before_rate.value) == NaN || parseFloat(before_rate.value) > 100){
			alert("�������� 100%�� �ʰ��Ҽ� �����ϴ�.");
		}
		var before_reason = document.getElementById("BEFORE_REASON");
		var before_form = document.getElementById("BEFORE_FORM");
		var before_tax = document.getElementById("BEFORE_TAX");

		var bugwa_tax = document.getElementById("BUGWA_TAX");
		var bugwa_form = document.getElementById("BUGWA_FORM");


		before_reason.value = "���������� ����" + before_rate.value+"% ����";
		before_tax.value = Math.floor(removeComma(bugwa_tax.value)*fixFloatCal((100 - parseFloat(before_rate.value))/100)/100)*100;
		before_tax.value = insertComma2(before_tax.value);
		before_form.value = bugwa_form.value + " X (100-"+before_rate.value+")/100";
	}


	function RegisterPrc_bugwa(){



        var f = document.form;

     
                

        if( f.TAX_CD.value == ''){
            alert("�����ڵ带 �����ϼ���.");
            f.TAX_CD.focus();
            return;
        }
		if( f.OBJ_SET.value == ''){
            alert("���Ǳ����� �����ϼ���.");
            f.OBJ_SET.focus();
            return;
        }
		if( f.TAXPAYER_SET.value == ''){
            alert("�����ڱ����� �����ϼ���.");
            f.TAXPAYER_SET.focus();
            return;
        }
		if( f.LIVE.value == ''){
            alert("���ֻ��¸� �����ϼ���.");
            f.LIVE.focus();
            return;
        }

		f.BEFORE_TAX.value = removeComma(f.BEFORE_TAX.value);
		f.BUGWA_TAX.value = removeComma(f.BUGWA_TAX.value);

		f.BEFORE_TAX_DATE.value = removeDash(f.BEFORE_TAX_DATE.value);
		f.BEFORE_INDATE.value = removeDash(f.BEFORE_INDATE.value);
		f.TAX_DATE.value = removeDash(f.TAX_DATE.value);
		f.INDATE.value = removeDash(f.INDATE.value);
		f.OVERDATE.value = removeDash(f.OVERDATE.value);
        		
		var f = document.form;
        f.action = "/rojum/sugeo/sugeo_bugwa_register.do";
        f.submit();
	}

	  function	SemokInfo()
  	{
  		var	TAX_CD	= document.getElementById("TAX_CD").value;
  		var	SIGU_CD	= document.getElementById("SIGU_CD").value;
  		var	DEPT_CD	= document.getElementById("DEPT_CD").value;


  		if(TAX_CD != ''){
  	  		
  			Message_Display('MSG',1,document.body.clientWidth/2+document.getElementById('MSGValue').width/2,document.body.clientHeight/2-document.getElementById('MSGValue').height/2);
  			
      		var	params	= "TAX_CD=" + TAX_CD + "&SIGU_CD=" + SIGU_CD + "&DEPT_CD=" + DEPT_CD;
      		sendRequest("/rojum/saewe/semokinfo.do", params, "GET", Result_SemokInfo);
  		}
  	}
  	
  	function	Result_SemokInfo(obj)
  	{
  		var xmldoc 	= new ActiveXObject("Microsoft.XMLDOM");
          var form 	= document.form;
           
  		if(obj == "")
  		{		
  			Message_Display('MSG',0,700,300);
  			alert("�����ڵ� ����!!");
  			


			//�׽�Ʈ��
      		form.ADD_SET.value="1"; 	
      		form.ADD_SET_NM.value="����"; 	
      		form.ADD_YN.value="0";	
      		form.SUBUSEO_CD.value="3010078";	
      		form.gasanRate.value="0";	
      		form.OCR_BUSEO_CD.value="024";	
      		form.OCR_SIGU_CD.value="140";

          		
  			return;
  		}
  		
         

        xmldoc.async	= false;
  		xmldoc.loadXML(obj);

  		form.ADD_SET.value		= 	xmldoc.getElementsByTagName("gasanRateGubun").item(0).text;
  		form.ADD_SET_NM.value	= 	xmldoc.getElementsByTagName("gasanRateGubunNm").item(0).text;
  		//form.ADD_YN.value		=	xmldoc.getElementsByTagName("vatYn").item(0).text;
  		form.SUBUSEO_CD.value	=	xmldoc.getElementsByTagName("suBuseoCd").item(0).text;
  		form.gasanRate.value	=	xmldoc.getElementsByTagName("gasanRate").item(0).text;
  		form.OCR_BUSEO_CD.value	=	xmldoc.getElementsByTagName("ocrBuseoCd").item(0).text;
  		form.OCR_SIGU_CD.value	=	xmldoc.getElementsByTagName("ocrSiguCd").item(0).text;

  		if(form.gasanRate.value == '0.0'){
    		form.ADD_YN.value = 1;
		}else{
			form.ADD_YN.value = 0;
		}
  		
  		Message_Display('MSG',0,700,300);
  	}


  	function goModify(){
		document.location.href = "/rojum/sugeo/sugeo_bugwa_view.do?mul_no=${mul_no}&mode=modify";
  	}

  	/*	
  		0 : ����Ϸ� �̺ΰ�
		1 : �ΰ������Է¿Ϸ� �̺ΰ�
		2 : ���·�(��������) �ΰ�
		3 : ���·�(��������) ����
		4 : ���·� �ΰ�
		5 : ���·� ����
		
		*/
  	function BugwaSend(){
  		if("${sugeo.FINE_STATUS}" == "1" || "${sugeo.FINE_STATUS}" == "2"){
  	        if(!confirm("���·Ḧ �ΰ� �Ͻðڽ��ϱ�?"))
  	            return;
  	  		document.location.href = "/rojum/sugeo/sugeo_bugwa_send.do?mul_no=${mul_no}";
  		}else if("${sugeo.FINE_STATUS}" == "3" || "${sugeo.FINE_STATUS}" == "5"){
  	  		alert("�̹� ����ó���Ǿ����ϴ�.");
  		}else if("${sugeo.FINE_STATUS}" == "4"){
  	  		alert("�̹� �ΰ��Ͽ����ϴ�.");
  		}
  	}
  	function BugwaSunap(){
  		if("${sugeo.FINE_STATUS}" == "4"){
  			document.location.href = "/rojum/sugeo/sugeo_bugwa_sunap.do?mul_no=${mul_no}";
  		}else if("${sugeo.FINE_STATUS}" == "3" || "${sugeo.FINE_STATUS}" == "5"){
  	  		alert("�̹� ����ó���Ǿ����ϴ�.");
  		}else if("${sugeo.FINE_STATUS}" == "2"){
  	  		alert("�������� ���·� �ΰ� �����Դϴ�..");
  		}else if("${sugeo.FINE_STATUS}" == "1"){
  	  		alert("�ΰ����°� �ƴմϴ�.");
  		}
  	}
  	function BeforeBugwaSend(){
  		if("${sugeo.FINE_STATUS}" == "1"){
  	        if(!confirm("�������� ���·Ḧ �ΰ� �Ͻðڽ��ϱ�?"))
  	            return;
  			document.location.href = "/rojum/sugeo/sugeo_before_bugwa_send.do?mul_no=${mul_no}";
  		}else if("${sugeo.FINE_STATUS}" == "2" || "${sugeo.FINE_STATUS}" == "4"){
  	  		alert("�̹� �ΰ��Ͽ����ϴ�.");
  		}else if("${sugeo.FINE_STATUS}" == "3" || "${sugeo.FINE_STATUS}" == "5"){
  	  		alert("�̹� ����ó���Ǿ����ϴ�.");
  		}
  	  	
  	}
  	function BeforeBugwaSunap(){
  		if("${sugeo.FINE_STATUS}" == "2"){
  			document.location.href = "/rojum/sugeo/sugeo_before_bugwa_sunap.do?mul_no=${mul_no}";
  		}else if("${sugeo.FINE_STATUS}" == "4"){
  	  		alert("���·Ḧ �ΰ��Ͽ����ϴ�.");
  		}else if("${sugeo.FINE_STATUS}" == "3" || "${sugeo.FINE_STATUS}" == "5"){
  	  		alert("�̹� ����ó���Ǿ����ϴ�.");
  		}else if("${sugeo.FINE_STATUS}" == "1"){
  	  		alert("�ΰ����°� �ƴմϴ�.");
  		}
  		
  		
  	  	
  	}
	
//]]>
</script>


<body onload="Init();">

<form name="form" method="post">

<span id="MSG" style="position:absolute;visibility:hidden;">
	<img src="/img/wait.gif" id="MSGValue">
</span>
        	 
<input type="hidden" name="mul_no" value="${mul_no}">
<input type="hidden" name="message" value="${message}">

<input type="hidden" name="ADD_SET" value="${ADD_SET}">
<input type="hidden" name="gasanRate" value="${gasanRate}">
<input type="hidden" name="ADD_SET_NM" value="${ADD_SET_NM}">
<input type="hidden" name="ADD_YN" value="${ADD_YN}">
<input type="hidden" name="OCR_SIGU_CD" value="${OCR_SIGU_CD}">
<input type="hidden" name="OCR_BUSEO_CD" value="${OCR_BUSEO_CD}">
<input type="hidden" name="SUBUSEO_CD" value="${SUBUSEO_CD}">

<input type="hidden" name="SIGU_CD" value="${SIGU_CD}">
<input type="hidden" name="DEPT_CD" value="${DEPT_CD}">

<table width="800" border="0" cellpadding="0" cellspacing="0">
	<tr>
		<td align="left">
		<table width="780" border="0" cellspacing="0" cellpadding="0">
			<tr>
				<td height="22" background="/img/tab_line_purple.gif">
				<table border="0" cellspacing="0" cellpadding="0">
					<tr>
						<ul id="tabmenu">
							<td width="111"><a><img src="/img/cal_off.gif" alt="���·�����" width="110" height="22" border="0" onclick="goFine();" style="CURSOR: Hand;"></a></td>
							<td width="111"><a><img src="/img/bugwa_on.gif" alt="�ΰ�����" width="110" height="22" border="0" style="CURSOR: Hand;"></a></td>
						</ul>
					</tr>
				</table>
				</td>
			</tr>

			<tr>
				<td align="left" class="contborder_purple">
				
				
				<c:choose>
				<c:when test="${mode == 'view'}">
				<table width="100%" border="0" cellspacing="0" cellpadding="0">
					<tr>
						<td>
						<table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse: collapse;" cellpadding="0"	cellspacing="0" class="sub_table">
							<tr>
								<td height="30" colspan="6" align="left" bgcolor="#FFFFFF" class="">
								<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
									<tr>
										<td><span class="sub_stan_blue">&nbsp; * �⺻ �ΰ� ����</span></td>
									</tr>
								</table>
								</td>
							</tr>
							<tr>
								<td width="100px" height="26px" align="center" bgcolor="e5eff8" class="sub_table_b">�����ڵ�</td>
								<td width="400px" bgcolor="eaeaea" class="table_bl_left" colspan="3">
								${TAX_CD}
                                </td>
								<td width="100px" align="center" bgcolor="e5eff8" class="sub_table_b">���Ǳ���</td>
								<td width="150px" bgcolor="eaeaea" class="table_bl_left">
								${OBJ_SET}
	                            </td>
							</tr>
							<tr>
								<td width="100px" height="26px" align="center" bgcolor="e5eff8" class="sub_table_b">�����ڱ���</td>
								<td width="400px"  bgcolor="eaeaea" class="table_bl_left" colspan="3">
									${TAXPAYER_SET}
                                </td>
								<td width="100px" align="center" bgcolor="e5eff8" class="sub_table_b">���ֻ���</td>
								<td width="150px"  bgcolor="eaeaea" class="table_bl_left">
									${LIVE}
								</td>
							</tr>
							<tr>
								<td height="30" colspan="6" align="left" bgcolor="#FFFFFF" class="">
								<table width="100%" border="0" cellpadding="0" cellspacing="0" class="sub_stan">
									<tr>
										<td>
											<span class="sub_stan_blue">&nbsp; * �������� ���·� ����</span>
										</td>
										<td align="right">
											<img src="/img/bugwa_icon2.gif" alt="���������ΰ�" border="0" onClick="javascript:BeforeBugwaSend();" style="CURSOR: hand">
											<img src="/img/sunap_icon2.gif" alt="������������" border="0" onclick="javascript:BeforeBugwaSunap();" style="cursor:pointer" >
										</td>
									</tr>
								</table>
								</td>
							</tr>
							<tr>
								<td width="100px" height="26px" align="center" bgcolor="e5eff8" class="sub_table_b">������ȣ</td>
								<td width="650px" bgcolor="eaeaea" class="table_bl_left" colspan="5">
									${sugeo.BEFORE_TAX_NO}
								</td>
							</tr>
							<tr>
								<td width="100px" align="center" bgcolor="e5eff8" class="sub_table_b">�������</td>
								<td width="400px"  bgcolor="eaeaea" class="table_bl_left" colspan="3">
									${sugeo.BEFORE_REASON}
								</td>
								<td width="100px" height="26px" align="center" bgcolor="e5eff8" class="sub_table_b">������</td>
								<td width="150px"  bgcolor="eaeaea" class="table_bl_left" >
									${sugeo.BEFORE_RATE}%
								</td>
							</tr>
							
							<tr>
								<td width="100px" height="26px" align="center" bgcolor="e5eff8" class="sub_table_b">�����</td>
								<td width="400px" bgcolor="eaeaea" class="table_bl_left" colspan="3">
									${sugeo.BEFORE_FORM}
								</td>
								<td width="100px" align="center" bgcolor="e5eff8" class="sub_table_b">�����<br/>���·�</td>
								<td width="150px" bgcolor="eaeaea" class="table_bl_left">
									${rnic:insertComma2(sugeo.BEFORE_TAX)}
								</td>
							</tr>
							<tr>
								<td width="100px" height="26px" align="center" bgcolor="e5eff8" class="sub_table_b">��������</td>
								<td width="150px" bgcolor="eaeaea" class="table_bl_left">
									${rnic:addDash(sugeo.BEFORE_TAX_DATE)}
								</td>
								<td width="100px" align="center" bgcolor="e5eff8" class="sub_table_b">���⳻ ����</td>
								<td width="400px" bgcolor="eaeaea" class="table_bl_left" colspan="3">
									${rnic:addDash(sugeo.BEFORE_INDATE)}
								</td>
							</tr>
							
							<tr>
								<td height="30" colspan="6" align="left" bgcolor="#FFFFFF" class="">
								<table width="100%" border="0" cellpadding="0" cellspacing="0" class="sub_stan">
									<tr>
										<td>
											<span class="sub_stan_blue">&nbsp; * ���·� ����</span>
										</td>
										<td align="right">
											<img src="/img/bugwa_icon2.gif" alt="���·�ΰ�" border="0" onClick="javascript:BugwaSend();" style="CURSOR: hand">
											<img src="/img/sunap_icon2.gif" alt="���·����" border="0" onclick="javascript:BugwaSunap();" style="cursor:pointer" >
										</td>
									</tr>
								</table>
								</td>
							</tr>
							<tr>
								<td width="100px" height="26px" align="center" bgcolor="e5eff8" class="sub_table_b">������ȣ</td>
								<td width="650px"  bgcolor="eaeaea" class="table_bl_left" colspan="5">
									${sugeo.TAX_NO}
								</td>
							</tr>
							<tr>
								<td width="100px" height="26px" align="center" bgcolor="e5eff8" class="sub_table_b">�����</td>
								<td width="300px" bgcolor="eaeaea" class="table_bl_left" colspan="3">
									${sugeo.BUGWA_FORM}
								</td>
								<td width="100px" align="center" bgcolor="e5eff8" class="sub_table_b">���·�</td>
								<td width="150px" bgcolor="eaeaea" class="table_bl_left">
									${rnic:insertComma2(sugeo.BUGWA_TAX)}
								</td>
							</tr>
							
							<tr>
								<td width="100px" height="26px" align="center" bgcolor="e5eff8" class="sub_table_b">��������</td>
								<td width="150px" bgcolor="eaeaea" class="table_bl_left">
									${rnic:addDash(sugeo.TAX_DATE)}
								</td>
								<td width="100px" align="center" bgcolor="e5eff8" class="sub_table_b">���⳻ ����</td>
								<td width="150px" bgcolor="eaeaea" class="table_bl_left">
									${rnic:addDash(sugeo.INDATE)}
								</td>
								<td width="100px" align="center" bgcolor="e5eff8" class="sub_table_b">������ ����</td>
								<td width="150px" bgcolor="eaeaea" class="table_bl_left">
									${rnic:addDash(sugeo.OVERDATE)}
								</td>
							</tr>
						</table>
						</td>
					</tr>
					<tr>
						<td height="40" align="right"><!--img src="/img/accou_icon.gif" alt="���" border="0" onClick="javascript:goCal();" style="CURSOR:hand"-->
						<img src="/img/mod_icon.gif" alt="����" border="0" onclick="javascript:goModify();" style="cursor:pointer" >
						</td>
					</tr>
				</table>
				
				
				
				</c:when>
				
				<c:otherwise>
				<table id="DDDD" width="100%" border="0" cellspacing="0" cellpadding="0">
					<tr>
						<td>
						<table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse: collapse;" cellpadding="0"	cellspacing="0" class="sub_table">
							<tr>
								<td height="30" colspan="6" align="left" bgcolor="#FFFFFF" class="">
								<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
									<tr>
										<td><span class="sub_stan_blue">&nbsp; * �⺻ �ΰ� ����</span></td>
									</tr>
								</table>
								</td>
							</tr>
							<tr>
								<td width="100px" height="26px" align="center" bgcolor="e5eff8" class="sub_table_b">�����ڵ�</td>
								<td width="400px" bgcolor="eaeaea" class="table_bl_left" colspan="3">
                                <select name="TAX_CD" id="TAX_CD" class="essential" style="width:220px"  OnChange="SemokInfo();">
                                	${taxcode}
                                </select>
								</td>
								<td width="100px" align="center" bgcolor="e5eff8" class="sub_table_b">���Ǳ���</td>
								<td width="150px" bgcolor="eaeaea" class="table_bl_left">
	                            <select name="OBJ_SET" id="OBJ_SET" class="essential" style="width:70px">
	                            	${object_type}
                            	</select>
								</td>
							</tr>
							<tr>
								<td width="100px" height="26px" align="center" bgcolor="e5eff8" class="sub_table_b">�����ڱ���</td>
								<td width="400px"  bgcolor="eaeaea" class="table_bl_left" colspan="3">
                                <select name="TAXPAYER_SET" id="TAXPAYER_SET" class="essential" style="width:220px">
                                	${taxpayer_group}
                                </select>
								</td>
								<td width="100px" align="center" bgcolor="e5eff8" class="sub_table_b">���ֻ���</td>
								<td width="150px"  bgcolor="eaeaea" class="table_bl_left">
                                <select name="LIVE" id="LIVE" class="essential" style="width:100px">
                                	${taxpayer_residence}
                                </select>
								</td>
							</tr>
							<tr>
								<td height="30" colspan="6" align="left" bgcolor="#FFFFFF" class="">
								<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
									<tr>
										<td><span class="sub_stan_blue">&nbsp; * �������� ���·� ����</span></td>
									</tr>
								</table>
								</td>
							</tr>
							
							<tr>
								<td width="100px" align="center" bgcolor="e5eff8" class="sub_table_b">�������</td>
								<td width="400px"  bgcolor="eaeaea" class="table_bl_left" colspan="3">
									<input name="BEFORE_REASON" type="text" class="input_form1" style="width:390px" value="${sugeo.BEFORE_REASON}" maxlength="100" onKeyPress="nr_num_int(this);" onKeyUp="nr_num_int(this);">
								</td>
								<td width="100px" height="26px" align="center" bgcolor="e5eff8" class="sub_table_b">������</td>
								<td width="150px"  bgcolor="eaeaea" class="table_bl_left" >
									<input name="BEFORE_RATE" type="text" class="input_form1" style="width:60px;text-align:right;" value="${sugeo.BEFORE_RATE}" maxlength="6" onKeyPress="nr_num_float(this);" onKeyUp="nr_num_float(this);changeRate();">%
								</td>
							</tr>
							
							<tr>
								<td width="100px" height="26px" align="center" bgcolor="e5eff8" class="sub_table_b">�����</td>
								<td width="400px" bgcolor="eaeaea" class="table_bl_left" colspan="3">
									<input name="BEFORE_FORM" type="text" class="essential" style="width:390px" value="${sugeo.BEFORE_FORM}" readonly="readonly">
								</td>
								<td width="100px" align="center" bgcolor="e5eff8" class="sub_table_b">����� ���·�</td>
								<td width="150px" bgcolor="eaeaea" class="table_bl_left">
									<input name="BEFORE_TAX" type="text" class="essential" style="width:140px;text-align:right;" value="${rnic:insertComma2(sugeo.BEFORE_TAX)}" readonly="readonly">
								</td>
							</tr>
							
							<tr>
								<td width="100px" height="26px" align="center" bgcolor="e5eff8" class="sub_table_b">��������</td>
								<td width="150px" bgcolor="eaeaea" class="table_bl_left">
									<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
										<tr>
											<td>
	                                        	<input name="BEFORE_TAX_DATE" id="BEFORE_TAX_DATE" type="text" class="essential" style="width:80px" value="${sugeo.BEFORE_TAX_DATE}" readonly="readonly">
											</td>
	                                     <td>
	                                         <img src="/img/calendar_icon.gif" width="19" height="16" border="0" onclick="popUpCalendar(this, document.getElementById('BEFORE_TAX_DATE'), 'yyyymmdd')" style="CURSOR:Hand;padding-top:5px;">
	                                     </td>
										</tr>
									</table>
								</td>
								<td width="100px" align="center" bgcolor="e5eff8" class="sub_table_b">���⳻ ����</td>
								<td width="400px" bgcolor="eaeaea" class="table_bl_left" colspan="3">
									<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
										<tr>
											<td>
	                                        	<input name="BEFORE_INDATE" id="BEFORE_INDATE" type="text" class="essential" style="width:80px" value="${sugeo.BEFORE_INDATE}" readonly="readonly">
											</td>
	                                     <td>
	                                         <img src="/img/calendar_icon.gif" width="19" height="16" border="0" onclick="popUpCalendar(this, document.getElementById('BEFORE_INDATE'), 'yyyymmdd')" style="CURSOR:Hand;padding-top:5px;">
	                                     </td>
										</tr>
									</table>
								</td>
							</tr>
							
							<tr>
								<td height="30" colspan="6" align="left" bgcolor="#FFFFFF" class="">
								<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
									<tr>
										<td><span class="sub_stan_blue">&nbsp; * ���·� ����</span></td>
									</tr>
								</table>
								</td>
							</tr>
							
							<tr>
								<td width="100px" height="26px" align="center" bgcolor="e5eff8" class="sub_table_b">�����</td>
								<td width="300px" bgcolor="eaeaea" class="table_bl_left" colspan="3">
									<input name="BUGWA_FORM" type="text" class="essential" style="width:390px" value="${sugeo.BUGWA_FORM}" readonly="readonly">
								</td>
								<td width="100px" align="center" bgcolor="e5eff8" class="sub_table_b">���·�</td>
								<td width="150px" bgcolor="eaeaea" class="table_bl_left">
									<input name="BUGWA_TAX" type="text" class="essential" style="width:140px;text-align:right;" value="${rnic:insertComma2(sugeo.BUGWA_TAX)}" readonly="readonly">
								</td>
							</tr>
							
							<tr>
								<td width="100px" height="26px" align="center" bgcolor="e5eff8" class="sub_table_b">��������</td>
								<td width="150px" bgcolor="eaeaea" class="table_bl_left">
									<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
										<tr>
											<td>
	                                        	<input name="TAX_DATE" id="TAX_DATE" type="text" class="essential" style="width:80px" value="${sugeo.TAX_DATE}" readonly="readonly">
											</td>
	                                     <td>
	                                         <img src="/img/calendar_icon.gif" width="19" height="16" border="0" onclick="popUpCalendar(this, document.getElementById('TAX_DATE'), 'yyyymmdd')" style="CURSOR:Hand;padding-top:5px;">
	                                     </td>
										</tr>
									</table>
								</td>
								<td width="100px" align="center" bgcolor="e5eff8" class="sub_table_b">���⳻ ����</td>
								<td width="150px" bgcolor="eaeaea" class="table_bl_left">
									<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
										<tr>
											<td>
	                                        	<input name="INDATE" id="INDATE" type="text" class="essential" style="width:80px" value="${sugeo.INDATE}" readonly="readonly">
											</td>
	                                     <td>
	                                         <img src="/img/calendar_icon.gif" width="19" height="16" border="0" onclick="popUpCalendar(this, document.getElementById('INDATE'), 'yyyymmdd')" style="CURSOR:Hand;padding-top:5px;">
	                                     </td>
										</tr>
									</table>
								</td>
								
								<td width="100px" align="center" bgcolor="e5eff8" class="sub_table_b">������ ����</td>
								<td width="150px" bgcolor="eaeaea" class="table_bl_left">
									<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
										<tr>
											<td>
	                                        	<input name="OVERDATE" id="OVERDATE" type="text" class="essential" style="width:80px" value="${sugeo.OVERDATE}" readonly="readonly">
											</td>
	                                     <td>
	                                         <img src="/img/calendar_icon.gif" width="19" height="16" border="0" onclick="popUpCalendar(this, document.getElementById('OVERDATE'), 'yyyymmdd')" style="CURSOR:Hand;padding-top:5px;">
	                                     </td>
										</tr>
									</table>

								</td>
							</tr>
						</table>
						</td>
					</tr>
					<tr>
						<td height="40" align="right">
						<img src="/img/save_icon2.gif" alt="����" border="0" onClick="javascript:RegisterPrc_bugwa();" style="CURSOR: hand">
						<img src="/img/can_icon.gif" alt="���" border="0" onclick="javascript:history.back();" style="cursor:pointer" >
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
