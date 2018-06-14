<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
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
}
-->

</style>
<link href="/css/roads.css" rel="stylesheet" type="text/css">
</head>

<script language="javascript" src="/jsp/RexServer/rexscript/rexpert.js"></script>
<script language="javascript" src="/jsp/RexServer/rexscript/rexpert_properties.js"></script>
<script language="javascript" src="/js/PopupCalendar.js"></script>
<script language="javascript" src="/js/Check_inputbox.js"></script>

<script type="text/javascript">
//<![CDATA[
          
	function 	Init()
	{
		parent.TabDown_Img("annae");

		var	adminno	= document.getElementById("ADMIN_NO").value;
		var	seq		= document.getElementById("SEQ").value;

	//	alert(adminno + " , " + seq);
	
	//	if(seq != "")
	//		View(adminno, seq);
	}

	function submitPrint()
	{
		var form 	= document.forms[0];
		var	str		= "";
			
		//	�ο����
		if(form.YEAR.value.length < 1 )
		{
			str	+= "�뺸����� �Է��ϼ���\n";
			form.YEAR.focus();
		}
		else if(form.MONTH.value.length	< 1 || Number(form.MONTH.value) > 12 || Number(form.MONTH.value) < 1)
		{
			str	+= "�뺸����� �Է��ϼ���\n";
			form.MONTH.focus();
		}
		else if(form.FROMDATE.value.length	< 1)
		{
			str	+= "�Ⱓ���� �������� �Է��ϼ���\n";
		}
		else if(form.TODATE.value.length	< 1)
		{
			str	+= "�Ⱓ���� �������� �Է��ϼ���\n";	
			form.TODATE.focus();	
		}
		else if(form.MANAGER.value.length	< 1)
		{
			str	+= "����ڸ� �Է��ϼ���\n";
			form.MANAGER.focus();
		}
		else if(form.TEL.value.length	< 1)
		{
			str	+= "����ó�� �Է��ϼ���\n";
			form.TEL.focus();
		}
		else if(form.ENDDATE.value.length	< 1)
		{
			str	+= "�������ڸ� �Է��ϼ���\n";
			form.ENDDATE.focus();
		}
		else if(form.DEPT.value.length	< 1)
		{
			str	+= "��û��Ҹ� �Է��ϼ���\n";
			form.DEPT.focus();
		}
				
		if(str	!= "")
		{
			alert(str);
			return	false;
		}
		return true;
	}

	function fnPreView()
	{
		if(!submitPrint()) return;
		
		var oRptMainParam;
		oRptMainParam = rex_GetgoDictionay(); 

		// �ʼ� - ����Ʈ��
		oRptMainParam.put("rex_rptname", "annae_all");

		// �ʼ� - ������ Ÿ�� ����
		oRptMainParam.put("rex_datatype", "XML");  // XML, CSV

		// �ɼ� - �ٸ� DB�� �����
		oRptMainParam.put("rex_userservice", "oracle_jndi");

		// �ɼ� - �Ķ���� ����
		var form 	= document.forms[0];
		
		var type 		= form.TYPE.value;
		var ownerSet 	= form.OWNER_SET.value;
		var taxSet 		= form.TAX_SET.value;
		var purposeCd 	= form.PURPOSE_CD.value;
		var bjCd		= form.BJ_CD.value;
		var hjCd		= form.HJ_CD.value;
		var bonbun		= form.BONBUN.value;
		var bubun		= form.BUBUN.value;
		var name		= form.NAME.value;
		var adminNo		= form.ADMIN_NO.value;
		
		if(type == "")
    		type='%';
    	if(ownerSet == "")
    		ownerSet='%';
    	if(taxSet == "")
    		taxSet='%';
    	if(purposeCd == "000"	||	purposeCd == "")
    		purposeCd	= '%';
    	if(bjCd == "")
    		bjCd='%';
    	if(hjCd == "")
    		hjCd='%';
    	
    	if(bonbun == ""	||	bonbun == "%")
    		bonbun	= '%';
    	else
    		bonbun = '%' + bonbun + '%';
    	
    	if(bubun == ""	||	bubun == "%")
    		bubun	= '%';
    	else
    		bubun = '%' + bubun + '%';
    	
    	if(name == ""	||	name == "%")
    		name	= '%';
    	else
    		name = '%' + name + '%';
    	
    	if(adminNo == ""	||	adminNo == "%")
    		adminNo	= '%';
    	else
    		adminNo = '%' + adminNo + '%';
		
		oRptMainParam.put("TYPE" ,type);
		oRptMainParam.put("OWNER_SET" ,ownerSet);
		oRptMainParam.put("TAX_SET" ,taxSet);
		oRptMainParam.put("PURPOSE_CD" ,purposeCd);	
		oRptMainParam.put("BJ_CD" ,bjCd);
		oRptMainParam.put("HJ_CD" ,hjCd);
		oRptMainParam.put("BONBUN" ,bonbun);
		oRptMainParam.put("BUBUN" ,bubun);
		oRptMainParam.put("NAME" ,name);
		oRptMainParam.put("ADMIN_NO" ,adminNo);
		oRptMainParam.put("GIGAN1" ,form.GIGAN1.value);
		oRptMainParam.put("GIGAN2" ,form.GIGAN2.value);

		oRptMainParam.put("YEAR" ,form.YEAR.value);				//�ΰ� ��
		oRptMainParam.put("MONTH" ,form.MONTH.value);			//�ΰ� ��
		oRptMainParam.put("FROMDATE" ,form.FROMDATE.value);		//�Ⱓ���� ����
		oRptMainParam.put("TODATE" ,form.TODATE.value);			//�Ⱓ���� ����
		oRptMainParam.put("MANAGER" ,form.MANAGER.value);
		oRptMainParam.put("TEL" ,form.TEL.value);
		oRptMainParam.put("ENDDATE" ,form.ENDDATE.value);		//��������
		oRptMainParam.put("DEPT" ,form.DEPT.value);				//��û���
		oRptMainParam.put("NOTES" ,form.NOTES.value);			//���
		oRptMainParam.put("GU_NM" ,form.guNm.value);
		oRptMainParam.put("SIGUNGU" ,form.guCd.value);
		/*
		alert("type=" + type);
		alert("ownerSet=" + ownerSet);
		alert("taxSet=" + taxSet);
		alert("purposeCd=" + purposeCd);
		alert("bjCd=" + bjCd);
		alert("hjCd=" + hjCd);
		alert("bonbun=" + bonbun);
		alert("bubun=" + bubun);
		alert("name=" + name);
		alert("adminNo=" + adminNo);
		alert("GIGAN1=" + form.GIGAN1.value);
		alert("GIGAN2=" + form.GIGAN2.value);
		alert("YEAR=" + form.YEAR.value);				//�ΰ� ��
		alert("MONTH=" + form.MONTH.value);			//�ΰ� ��
		alert("FROMDATE=" + form.FROMDATE.value);		//�Ⱓ���� ����
		alert("TODATE=" + form.TODATE.value);			//�Ⱓ���� ����
		alert("MANAGER=" + form.MANAGER.value);
		alert("TEL=" + form.TEL.value);
		alert("ENDDATE=" + form.ENDDATE.value);		//��������
		alert("DEPT=" + form.DEPT.value);				//��û���
		alert("NOTES=" + form.NOTES.value);			//���
		alert("GU_NM=" + form.guNm.value);
		alert("SIGUNGU=" + form.guCd.value);
		*/
		// preview �˾� ����
		rex_gfRexRptOpen("popup", oRptMainParam);
			
		return oRptMainParam;			
	}
	
	function year_keyup()
	{	
		var form = document.form;
		
		if(form.YEAR.value.length == 4)
			form.MONTH.focus();
	}
		
//]]>
</script>

<body onload="Init();">
<form name="form" method="post">
<input type="hidden" name="ADMIN_NO" value="${ADMIN_NO}">
<input type="hidden" name="SEQ" value="${SEQ}">

<input type="hidden" name="GIGAN1" value="${GIGAN1}">
<input type="hidden" name="GIGAN2" value="${GIGAN2}">
<input type="hidden" name="PURPOSE_CD" value="${PURPOSE_CD}">
<input type="hidden" name="BONBUN" value="${BONBUN}">
<input type="hidden" name="BUBUN" value="${BUBUN}">
<input type="hidden" name="NAME" value="${NAME}">
<input type="hidden" name="ADMINNO" value="${ADMINNO}">
<input type="hidden" name="TYPE" value="${TYPE}">
<input type="hidden" name="OWNER_SET" value="${OWNER_SET}">
<input type="hidden" name="TAX_SET" value="${TAX_SET}">
<input type="hidden" name="BJ_CD" value="${BJ_CD}">
<input type="hidden" name="HJ_CD" value="${HJ_CD}">
<input type="hidden" name="guNm" value="${GU_NM}">
<input type="hidden" name="guCd" value="${guCd}">


<input type="hidden" name="currentPage" value="${currentPage}">
<table width="780" border="0" cellpadding="0" cellspacing="0">
	  <tr>
		<td align="left" class="contborder_blue">
		<table width="100%" border="0" cellspacing="0" cellpadding="0">

		<tr>
		  <td><table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">

			  <tr>
				<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">�ΰ� ���</td>
				<td colspan="3" bgcolor="eaeaea" class="table_bl_left">
				<input name="YEAR" type="text" class="input_form1" style="width:70px" value="" maxlength="4" onKeyDown="nr_num_int(this);" onKeyUp="year_keyup();nr_num_int(this);" onKeyPress="nr_num_int(this);"> ��
				<input name="MONTH" type="text" class="input_form1" style="width:70px" value="" maxlength="2" onKeyDown="nr_num_int(this);" onKeyUp="nr_num_int(this);" onKeyPress="nr_num_int(this);"> ��
				</td>
			  </tr>
			  
			  <tr>
				<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">�Ⱓ���� ����</td>
				<td bgcolor="eaeaea" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
				  <tr>
					<td><input name="FROMDATE" type="text" class="input_form1" style="width:70px" value="" readonly></td>
					<td><a><img src="/img/calendar_icon.gif" width="19" height="16" border="0" onclick="popUpCalendar(this, document.getElementById('FROMDATE'), 'yyyymmdd')" style="CURSOR: Hand;"></a></td>				  
				  </tr>
				</table></td>
				<td width="100" align="center" bgcolor="e5eff8" class="sub_table_b">�Ⱓ���� ����</td>
				<td bgcolor="eaeaea" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
				  <tr>
					<td><input name="TODATE" type="text" class="input_form1" style="width:70px" value="" readonly></td>
					<td><a><img src="/img/calendar_icon.gif" width="19" height="16" border="0" onclick="popUpCalendar(this, document.getElementById('TODATE'), 'yyyymmdd')" style="CURSOR: Hand;"></a></td>				  
				  </tr>
				</table></td>
			  </tr>
			  			  
			  <tr>
				<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">�����</td>
				<td bgcolor="eaeaea" class="table_bl_left"><input name="MANAGER" type="text" class="input_form1" style="width:120px"  value="${MANAGER}" maxlength="10"></td>
				<td align="center" bgcolor="e5eff8" class="sub_table_b">����ó</td>
				<td bgcolor="eaeaea" class="table_bl_left"><input name="TEL" type="text" class="input_form1" style="width:120px" value="${TEL}" maxlength="14"></td>
			  </tr>
			  
			  <tr>
				<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">���� ����</td>
					<td bgcolor="eaeaea" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
					  <tr>
						<td><input name="ENDDATE" type="text" class="input_form1" style="width:70px" value="" readonly></td>
						<td><a><img src="/img/calendar_icon.gif" width="19" height="16" border="0" onclick="popUpCalendar(this, document.getElementById('ENDDATE'), 'yyyymmdd')" style="CURSOR: Hand;"></a></td>
					<!-- <td>&nbsp~ <input name="PREDATE" type="text" class="input_form1" style="width:70px" value="" readonly></td>
						<td><a><img src="/img/calendar_icon.gif" width="19" height="16" border="0" onclick="popUpCalendar(this, document.getElementById('PREDATE'), 'yyyymmdd')" style="CURSOR: Hand;"></a></td>
						 -->						  
					  </tr>
					</table></td>
				  
				<td align="center" bgcolor="e5eff8" class="sub_table_b">��û ���</td>
				<td bgcolor="eaeaea" class="table_bl_left"><input name="DEPT" type="text" class="input_form1" style="width:120px" value="${GU_NM} ${DEPT_NM}"></td>
			  </tr>
			  
			  <tr>
				<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">���</td>
				<td colspan="3" bgcolor="eaeaea" class="table_bl_left">
				<input name="NOTES" type="text" class="input_form1" style="width:600px" value="" maxlength="50">
				</td>
			  </tr>

		  </table></td>
		</tr>
		
		<tr>
			<td height="40">
			<table width="0" border="0" cellspacing="0" cellpadding="0" align="right">	
		  		<img src="/img/print_icon4.gif" onclick="fnPreView();" alt="�ϰ� �ȳ��� ���" border="0" style="cursor:hand;">
			</table>
			</td>
		</tr>
		
	</table></td>
  </tr>

</table>
</form>
</body>
</html>