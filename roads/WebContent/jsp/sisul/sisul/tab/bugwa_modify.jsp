<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
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

<script type="text/javascript">
//<![CDATA[

	function	ModifyPrc()
	{
		var form = document.form;

		var	obj	= document.getElementById("ADD_YN");
		
		if(obj.checked	== true)	//	산 체크
			document.getElementById("ADD_YN").value='1';
		else
			document.getElementById("ADD_YN").value='0';

		form.action = "/jumyong/saewe/bugwa_modify_prc.do";
		form.submit();
	}

	function	Cancel()
	{
		var form = document.form;

		form.action = "/jumyong/saewe/bugwa_view.do";
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
		if(addyn	== '1')	//	산 체크
			document.getElementById("ADD_YN").checked	= true;
		else
			document.getElementById("ADD_YN").checked	= false;
	}

//]]>
</script>

<body onload="javaScript:Tax_Year('${tax_year}'); javaScript:Tax_Month('${tax_month}'); Init_ADD_YNCheck('${board.ADD_YN}');">
<table width="780" border="0" cellpadding="0" cellspacing="0">
<form name="form" method="post">
<input type="hidden" name="ADMIN_NO" value="${ADMIN_NO}">

	  <tr>
		<td align="left" class="contborder_blue">
		<table width="100%" border="0" cellspacing="0" cellpadding="0">
			<tr>
			  <td><table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">

				<tr>
					<td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">과세번호</td>
					<td width="181" bgcolor="eaeaea" class="table_bl_left"><input name="TAX_NO" type="text" class="input_form1" style="width:120px" value="${board.TAX_NO}"></td>
					<td width="100" align="center" bgcolor="e5eff8" class="sub_table_b">과세구분</td>
					<td bgcolor="eaeaea" class="table_bl_left">
						<select name="TAX_SET" id="TAX_SET" class="input_form1" style="width:125px">
							${use_section}
						</select>
					</td>
				</tr>
				
				<tr>
					<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">과세년월</td>
					<td bgcolor="eaeaea" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
					  <tr>
						<td>
							<select name="tax_year" id="tax_year" class="input_form1" style="width:70px">
							</select>
						년</td>
						
						<td>
							<select name="tax_month" id="tax_month" class="input_form1" style="width:50px">
							</select>
						월</td>
						
				   	  </tr>
					</table></td>
					<td width="100" align="center" bgcolor="e5eff8" class="sub_table_b">세목코드</td>
					<td bgcolor="eaeaea" class="table_bl_left">			
						<select name="TAX_CD" id="TAX_CD" class="input_form1" style="width:270px">
							${taxcode}
						</select>
					</td>
				</tr>
				
				<tr>
					<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">시군구코드</td>
					<td bgcolor="eaeaea" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
					  <tr>
						<td><input name="SIGU_CD" type="text" class="input_form1" style="width:120px" value="${board.SIGU_CD}"></td>
						<td><input name="" type="text" class="input_form1" style="width:120px" value=""></td>
				   	  </tr>
					</table></td>
					<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">부서코드</td>
					<td bgcolor="eaeaea" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
					  <tr>
						<td><input name="DEPT_CD" type="text" class="input_form1" style="width:120px" value="${board.DEPT_CD}"></td>
						<td><input name="" type="text" class="input_form1" style="width:120px" value=""></td>
				   	  </tr>
					</table></td>
				</tr>
				  
				<tr>
					<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">납세자구분</td>
					<td colspan="3" bgcolor="eaeaea" class="table_bl_left">
						<select name="TAXPAYER_SET" id="TAXPAYER_SET" class="input_form1" style="width:240px">
							${taxpayer_group}
						</select>
					</td>					
				</tr>
				
				<tr>
					<td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">거주상태</td>
					<td width="181" bgcolor="eaeaea" class="table_bl_left">
						<select name="LIVE" id="LIVE" class="input_form1" style="width:125px">
							${taxpayer_residence}
						</select>
					</td>
					<td width="100" align="center" bgcolor="e5eff8" class="sub_table_b">물건구분</td>
					<td width="181" bgcolor="eaeaea" class="table_bl_left">
						<select name="OBJ_SET" id="OBJ_SET" class="input_form1" style="width:125px">
							${object_type}
						</select>
					</td>
				</tr>
				
				<tr>
					<td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">본세(점용료)</td>
					<td width="181" bgcolor="eaeaea" class="table_bl_left"><input name="BONSE" type="text" class="input_form1" style="width:120px" value="${board.BONSE}"> 원</td>
					<td width="100" align="center" bgcolor="e5eff8" class="sub_table_b">수납부서</td>
					<td bgcolor="eaeaea" class="table_bl_left"><input name="" type="text" class="input_form1" style="width:120px" value=""></td>
				</tr>
				
				<tr>
					<td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">부가가치세</td>
					<td width="181" bgcolor="eaeaea" class="table_bl_left"><input name="VAT" type="text" class="input_form1" style="width:120px" value="${board.VAT}"> 원</td>
					<td width="100" align="center" bgcolor="e5eff8" class="sub_table_b">과세일자</td>
					<td bgcolor="eaeaea" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
					  <tr>
						<td><input name="TAX_DATE" type="text" class="input_form1" style="width:120px" value="${board.TAX_DATE}"></td>
						<td><a><img src="/img/calendar_icon.gif" width="19" height="16" border="0" onclick="popUpCalendar(this, document.getElementById('TAX_DATE'), 'yyyymmdd')"></a></td>
					  </tr>
					</table></td>
				</tr>
				
				<tr>
					<td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">납기내금액</td>
					<td width="181" bgcolor="eaeaea" class="table_bl_left"><input name="INTAX" type="text" class="input_form1" style="width:120px" value="${board.INTAX}"> 원</td>
					<td width="100" align="center" bgcolor="e5eff8" class="sub_table_b">납기내일자</td>
					<td bgcolor="eaeaea" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
					  <tr>
						<td><input name="INDATE" type="text" class="input_form1" style="width:120px" value="${board.INDATE}"></td>
						<td><a><img src="/img/calendar_icon.gif" width="19" height="16" border="0" onclick="popUpCalendar(this, document.getElementById('INDATE'), 'yyyymmdd')"></a></td>
					  </tr>
					</table></td>
				</tr>
				
				<tr>
					<td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">납기후금액</td>
					<td width="181" bgcolor="eaeaea" class="table_bl_left"><input name="OVERTAX" type="text" class="input_form1" style="width:120px" value="${board.OVERTAX}"> 원</td>
					<td width="100" align="center" bgcolor="e5eff8" class="sub_table_b">납기후일자</td>
					<td bgcolor="eaeaea" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
					  <tr>
						<td><input name="OVERDATE" type="text" class="input_form1" style="width:120px" value="${board.OVERDATE}"></td>
						<td><a><img src="/img/calendar_icon.gif" width="19" height="16" border="0" onclick="popUpCalendar(this, document.getElementById('OVERDATE'), 'yyyymmdd')"></a></td>
					  </tr>
					</table></td>
				</tr>
				
				<tr>
					<td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">가산율구분</td>
					<td width="181" bgcolor="eaeaea" class="table_bl_left"><input name="ADD_SET" type="text" class="input_form1" style="width:120px" value="${board.ADD_SET}"></td>
					<td width="100" align="center" bgcolor="e5eff8" class="sub_table_b">가산금면제여부</td>
					<td bgcolor="eaeaea" class="table_bl_left">
						<input name="ADD_YN" type="checkbox">가산금면제
					</td>
				</tr>
				
				<tr>
					<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">비고</td>
					<td colspan="3" bgcolor="eaeaea" class="table_bl_left"><input name="NOTES" type="text" class="input_form1" style="width:600px" value="${board.NOTES}"></td>
				</tr>
				
				<tr>
					<td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">적용 상한율</td>
					<td width="181" bgcolor="eaeaea" class="table_bl_left"><input name="LIMIT_SUM" type="text" class="input_form1" style="width:120px" value="${board.LIMIT_SUM}"></td>
					<td width="100" align="center" bgcolor="e5eff8" class="sub_table_b">상한횟수</td>
					<td bgcolor="eaeaea" class="table_bl_left"><input name="LIMIT_CNT" type="text" class="input_form1" style="width:120px" value="${board.LIMIT_CNT}"></td>
				</tr>
				
				<tr>
					<td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">특별이율</td>
					<td width="181" bgcolor="eaeaea" class="table_bl_left"><input name="RATE" type="text" class="input_form1" style="width:120px" value="${board.RATE}"></td>
					<td width="100" align="center" bgcolor="e5eff8" class="sub_table_b">특별이율 사유</td>
					<td bgcolor="eaeaea" class="table_bl_left"><input name="RATE_CAUSE" type="text" class="input_form1" style="width:120px" value="${board.RATE_CAUSE}"></td>
				</tr>
				
			  </table></td>
			</tr>

			<tr>
			  <td height="40" align="right">
			  <table width="0" border="0" cellspacing="0" cellpadding="0" align="right">
				<a href="javascript:Cancel()"><img src="/img/can_icon.gif" alt="취소" width="56" height="18" border="0"></a>
				<a href="javascript:ModifyPrc()"><img src="/img/save_icon2.gif" alt="저장" width="56" height="18" border="0"></a>
			  </table>
			  </td>
			</tr>
			
		</table></td>
	  </tr>

</table>

</body>
</html>

<div id='popCal' style='POSITION:absolute;visibility:hidden;border:2px ridge;width:10'>
       <iframe name="popFrame" src="/js/calendar.html" frameborder="0" scrolling="no" width=183 height=188></iframe>
</div>
