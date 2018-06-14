<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ include file="/jsp/common/loginCheck.jsp" %>
<%@ include file="/jsp/common/include.jsp" %>


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
	function goSearch()
	{
		var year = document.getElementById("YEAR").value;
		var type = document.getElementById("TYPE").value;
		var tax_set = document.getElementById("TAX_SET").value;
		var tax_yn = document.getElementById("TAX_YN").value;		
		var mul_fromdate = document.getElementById("mul_fromdate").value;
		var mul_todate = document.getElementById("mul_todate").value;
		//var iFrm = document.getElementById("IFRM_PurposeCode");
		//var purpose = iFrm.contentWindow.document.getElementById("PURPOSE_CD").value;
		var purpose = document.getElementById("PURPOSE_CD").value;
		var bj_cd = document.getElementById("BJ_CD").value;
		var jumyongName = document.getElementById("jumyongName").value;
		var cal_status = document.getElementById("cal_status").value;


		if( year == ''){
			alert("�ΰ��⵵�� �Է��ϼ���. ");
			document.getElementById("YEAR").focus();
			return;
		}
		if( mul_fromdate == ''){
			alert("���ΰ��Ⱓ�� �Է��ϼ���. ");
			return;
		}
		if( mul_todate == ''){
			alert("���ΰ��Ⱓ�� �Է��ϼ���. ");
			return;
		}

		location.href="/gapan/junggi/search.do?year="+year+"&type="+type+"&tax_set="+tax_set+"&tax_yn="+tax_yn+"&mul_fromdate="+mul_fromdate
						+"&mul_todate="+mul_todate+"&purpose="+purpose+"&bj_cd="+bj_cd+"&jumyongName="+jumyongName+"&cal_status="+cal_status;

	}
	
	function InitPage()
	{
	
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
		


		if(toDate != "" && toDate !="99999999" )
			document.getElementById("searchToDate").value = addDash(toDate);

		if(fromDate != "" && fromDate != "0")		
			document.getElementById("searchFromDate").value = addDash(fromDate);
			
			
		

		if(jumyongName != "")				
			document.getElementById("jumyongName").value = jumyongName;
			
		if(numberValue != "")						
			document.getElementById("numberValue").value = numberValue;

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
//		document.getElementById("UseType1").style.display = "none";
//		document.getElementById("UseType2").style.display = "none";
		
//		if(sel.value == '2' || sel.value == '3')	
//			document.getElementById("UseType2").style.display = "block";	//	��õ, ����
//		else						
//			document.getElementById("UseType1").style.display = "block";	//	����		

		document.getElementById("IFRM_PurposeCode").src="/jsp/common/purposeCode/purposeCode.jsp?SectionCode="+sel.value;
	}
	
	
	function goView(gapan_no,year)
	{
		location.href="/gapan/junggi/view.do?gapan_no="+gapan_no+"&year="+year;
		//location.href = "/gapan/junggi/junggi_view.do?gapan_no="+gapan_no+"&year="+year;
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
		//var iFrm = document.getElementById("IFRM_PurposeCode");
		//var purpose = iFrm.contentWindow.document.getElementById("PURPOSE_CD").value;
		var purpose = document.getElementById("PURPOSE_CD").value;
		var bj_cd = document.getElementById("BJ_CD").value;
		var jumyongName = document.getElementById("jumyongName").value;
		var cal_status = document.getElementById("cal_status").value;
		
		//form.currentPage.value	= page;
		//form.action = "search.do";
		//form.submit();
		location.href="search.do?currentPage="+page+"&year="+year+"&type="+type+"&tax_set="+tax_set+"&tax_yn="+tax_yn+"&mul_fromdate="+mul_fromdate
												+"&mul_todate="+mul_todate+"&purpose="+purpose+"&bj_cd="+bj_cd+"&jumyongName="+jumyongName+"&cal_status="+cal_status;
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
		//var iFrm = document.getElementById("IFRM_PurposeCode");
		//var purpose = iFrm.contentWindow.document.getElementById("PURPOSE_CD").value;
		var purpose = document.getElementById("PURPOSE_CD").value;
		var bj_cd = document.getElementById("BJ_CD").value;
		var jumyongName = document.getElementById("jumyongName").value;
		var cal_status = document.getElementById("cal_status").value;
		
		//form.currentPage.value	= 1;
		//form.action = "excel_search.do";
		//form.submit();
		location.href= "excel_search.do?currentPage=1&year="+year+"&type="+type+"&tax_set="+tax_set+"&tax_yn="+tax_yn+"&mul_fromdate="+mul_fromdate
												+"&mul_todate="+mul_todate+"&purpose="+purpose+"&bj_cd="+bj_cd+"&jumyongName="+jumyongName+"&cal_status="+cal_status;
	}
	
	function NowPriceApply(){
		var winW = 500;
		var winH = 430;
		var status ="toolbar=no, location=no, directories=no, status=no, menubar=no, resizable=no, scrollbars=no, width="+winW+", height="+winH+", left=0, top=0"
		
		var year = document.getElementById("YEAR").value;
		var type = document.getElementById("TYPE").value;
		var tax_set = document.getElementById("TAX_SET").value;
		var tax_yn = document.getElementById("TAX_YN").value;		
		var mul_fromdate = document.getElementById("mul_fromdate").value;
		var mul_todate = document.getElementById("mul_todate").value;
		var purpose = document.getElementById("PURPOSE_CD").value;
		var bj_cd = document.getElementById("BJ_CD").value;
		var jumyongName = document.getElementById("jumyongName").value;
		var cal_status = document.getElementById("cal_status").value;

		var param = "year="+year+"&type="+type+"&tax_set="+tax_set+"&tax_yn="+tax_yn+"&mul_fromdate="+mul_fromdate
				  + "&mul_todate="+mul_todate+"&purpose="+purpose+"&bj_cd="+bj_cd+"&jumyongName="+jumyongName+"&cal_status="+cal_status;
		//alert(param);
		window.open('/jsp/gapan/junggi/wait.jsp?'+param, 'win', status);
	}

	// �ϰ� ����
	function goAllCal(){

		var f = document.jumyongForm;
		var year = document.getElementById("YEAR").value;

		if( '${BJ_CD}' == '' ){
			alert("������ ��ȸ�� ���� �Ͻʽÿ�. ");
			document.getElementById("BJ_CD").focus();
			return;
		}
		
		if(f.TOTALCNT.value <= 0){
			alert("ó���� �����Ͱ� �����ϴ�. ");
			return;
		}
		
		//if(!confirm("�ϰ������� ���ܼ��Կ� �ΰ��� �ǵ鿡 ���ؼ��� ������ �˴ϴ�. \n �ϰ����� �Ͻðڽ��ϱ�?"))
		//	return;

		//document.getElementById("TAX_YN").value = "1";
		f.action = "/gapan/junggi/junggiAllCal.do?year="+year;
		f.submit();
	}
	
</script>



</head>

<body onload="javascript:InitPage();">

<form name="jumyongForm">


<input name="toDateValue" id = "toDateValue" value="${toDate}" type="hidden">
<input name="fromDateValue" id = "fromDateValue" value="${fromDate}" type="hidden">
<input name="jumyongNameValue" id = "jumyongNameValue" value="${jumyongName}" type="hidden">
<input name="numberValueValue" id = "numberValueValue" value="${numberValue}" type="hidden">
<input name="yearVal" id = "yearVal" value="${year}" type="hidden">
<input type="hidden" name="TOTALCNT" value="${totalcnt}">
<input type="hidden" name="message"	value="${message }">


<table width="800" border="0" cellpadding="0" cellspacing="0">
  <tr>
    <td height="43"><img src="/img/sub7_cont4_title.gif" width="800" height="43"></td>
  </tr>
  <tr>
    <td ><table width="780" border="0" cellspacing="0" cellpadding="0">
      <!-- tr>
        <td height="40" align="right">
	
		<table border="0" cellspacing="0" cellpadding="0">
          <tr>
            <td height="8" colspan="2"></td>
            </tr>
          <tr>
            <td><a href="#"><img src="/img/report_icon.gif" alt="��ȹ� ���" width="92" height="18" border="0"></a></td>
            <td><a href="#"><img src="/img/help_icon.gif" alt="����" width="65" height="18" border="0"></a></td>
            </tr>
        </table>
			</td>
      </tr-->
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
                  <td ><img src="/img/sub_petition_title15.gif" width="110" height="22"></td>
                </tr>
            </table></td>
          </tr>
		<tr>
            <td  class="contborder_purple"><table width="100%" border="0" cellspacing="0" cellpadding="0">
              <tr>
                <td><table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
                    <tr>
                      <td height="30" align="center" bgcolor="e5eff8" class="sub_table_b" >�ΰ��⵵</td>
                      <td bgcolor="eaeaea" class="table_bl_left" >
	                      <!-- select name="YEAR" id="YEAR" class="input_form1" style="width:130px"></select-->
	                      <input type="text" name="YEAR" id="YEAR" class="input_form1" style="width:50px" maxlength="4" value="${year}" onKeyUp="change_value(this)"> ��
					  </td>
                      <td height="30" align="center" bgcolor="e5eff8" class="sub_table_b">����</td>                      
					  <td bgcolor="eaeaea" class="table_bl_left">
						<select name="TYPE" id="TYPE" class="input_form1" style="width:130px">
							${GP_TYP}
					    </select>
					  </td>
                    </tr>
					
                    <tr>
                      <td height="30" align="center" bgcolor="e5eff8" class="sub_table_b">���Ա���</td>
					  <td bgcolor="eaeaea" class="table_bl_left">
					  	<select name="TAX_SET" id="TAX_SET" class="input_form1" style="width:130px">
							${taxation_section}
					  	</select>
					  </td>
					  <td height="30" align="center" bgcolor="e5eff8" class="sub_table_b">�ΰ����� </td>
					  <td bgcolor="eaeaea" class="table_bl_left">			
                          <select name="TAX_YN" id="TAX_YN" class="input_form1" style="width:130px">${taxation_yn}
               	      </td>
					  <!-- td height="30" align="center" bgcolor="e5eff8" class="sub_table_b">������ </td>
					  <td bgcolor="eaeaea" class="table_bl_left">			
                          <select name="BJ_CD" id="BJ_CD" class="input_form1" style="width:130px">${bjdong_code}
               	      </td-->					  
                    </tr>
                    
                     <tr>
                      <td height="30" align="center" bgcolor="e5eff8" class="sub_table_b">���ΰ�</td>
					  <td bgcolor="eaeaea" class="table_bl_left">
					  	
					  	<input name="mul_fromdate" id="mul_fromdate" type="text" class="input_form1" style="width:70px" value="${mul_fromdate }"><a>
					  	<img src="/img/calendar_icon.gif" width="19" height="16" border="0" align="absmiddle" onclick="popUpCalendar(this, document.getElementById('mul_fromdate'), 'yyyymmdd')" style="CURSOR: Hand;"></a>
					  	<input name="mul_todate" id="mul_todate" type="text" class="input_form1" style="width:70px" value="${mul_todate }"><a>
					  	<img src="/img/calendar_icon.gif" width="19" height="16" border="0" align="absmiddle" onclick="popUpCalendar(this, document.getElementById('mul_todate'), 'yyyymmdd')" style="CURSOR: Hand;"></a>
					  	
					  </td>
					  <td height="30" align="center" bgcolor="e5eff8" class="sub_table_b">���⿩��</td>                      
					  <td bgcolor="eaeaea" class="table_bl_left">
						<select name="cal_status" id="cal_status" class="input_form1" style="width:130px">
							${cal_status }
					    </select>
					  </td>
                    </tr>
					<tr>
					<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">�������</td>
					  <td colspan="3" bgcolor="eaeaea" class="table_bl_left"><table width="100%" border="0" cellpadding="0" cellspacing="0" class="sub_stan">
						<!-- iframe id="IFRM_PurposeCode" align="absmiddle" scrolling="no" frameborder="0" framespacing="0" width="100%" height="25" src="/jsp/common/purposeCode/purposeCode.jsp?SectionCode=${TYPE}&PURPOSE_CD=${PURPOSE_CD}"></iframe-->
						<select name="PURPOSE_CD" ID="PURPOSE_CD" class="input_form1" style="width:200px" >
							<option value="">::����::</option>
							<option value="710">�����ǸŴ�,���μ�����</option>
							<option value="720">�Ÿ�����,��Ȱ������ ���չ�����</option>
							<option value="730">�ڵ��Ǹű�,��ǰ������</option>
						</select>
					  </table></td>
                    </tr>
                    <tr>
					<td height="30" align="center" bgcolor="e5eff8" class="sub_table_b">������</td>
					<td bgcolor="eaeaea" class="table_bl_left">
						<select name="BJ_CD" id="BJ_CD" class="input_form1" style="width:130px">${bjdong_code}
					</td>
					<td height="30" align="center" bgcolor="e5eff8" class="sub_table_b">������</td>
                    <td bgcolor="eaeaea" class="table_bl_left">
						<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
                        	<tr>
                          		<td><input name="jumyongName" id="jumyongName" value="${jumyongName}"  type="text" class="input_form1" style="width:130px" onKeyDown="javascript:checkKeySearch();"></td>
                        	</tr>
                      	</table>
                   	</td>
                </tr>
                    
                    

                </table></td>
              </tr>
 
                <tr>
                  <td height="40" align="right"><img src="/img/inquiry_icon2.gif" alt="��ȸ" width="56" height="18" border="0" onclick="javascript:goSearch();" style="cursor:pointer" >
                  </td>
                </tr>
                <tr>
                  <td height="1" bgcolor="#EAEAEA"></td>
                </tr>
                <tr>
                  <td height="34" class="sub_stan">��ü�Ǽ� : <span class="sub_stan_blue">${listCount}</span>�� </td>
                </tr>
                <tr>
                  <td>
				<div style=" width:780;  padding:10px;overflow-x:auto; scrollbar-face-color:#EEF8FB;  scrollbar-3dlight-color:#BBBDB6; 
					scrollbar-highlight-color:#EEF8FB;scrollbar-shadow-color:#BBBDB6; scrollbar-darkshadow-color:#EEF8FB;  scrollbar-track-color:#EEF8FB; scrollbar-arrow-color:#BBBDB6; "--> 
				<table width="1000" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
			      	<tr>
                    	<td height="28" align="center" bgcolor="e5eff8" class="sub_table_b">������ȣ</td>
                        <td align="center" bgcolor="e5eff8" class="sub_table_b">������ȣ</td>
                        <td align="center" bgcolor="e5eff8" class="sub_table_b">������</td>
                        <td align="center" bgcolor="e5eff8" class="sub_table_b">������</td>
                        <td align="center" bgcolor="e5eff8" class="sub_table_b">�������</td>
                        <td align="center" bgcolor="e5eff8" class="sub_table_b">�������</td>
                        <td align="center" bgcolor="e5eff8" class="sub_table_b">���������</td>
                        <!-- td align="center" bgcolor="e5eff8" class="sub_table_b">���⵵ ������</td>
                        <td align="center" bgcolor="e5eff8" class="sub_table_b">���⵵ ����</td-->
                        <td align="center" bgcolor="e5eff8" class="sub_table_b">���⵵ ������</td>
                        <td align="center" bgcolor="e5eff8" class="sub_table_b">���⵵ ����</td>
                        <td align="center" bgcolor="e5eff8" class="sub_table_b">����</td>
                        <td align="center" bgcolor="e5eff8" class="sub_table_b">��������</td>
                        <td align="center" bgcolor="e5eff8" class="sub_table_b">���⿩��</td>                                                                       
					</tr>
                      
                    <c:choose>
					<c:when test='${blist != null && !empty blist}'>  
                   	<c:forEach items="${blist}" var="board" varStatus="idx">
                    <tr onMouseOver="this.style.backgroundColor='#f6f7f8'" onMouseOut="this.style.backgroundColor=''" style="cursor:pointer"
                    onclick="javascript:goView('${board.GAPAN_NO}','${board.YEAR}');">

                        <td height="26" align="center">${board.GAPAN_NO}</td>
                        <td align="center">${board.TAX_NO}</td>
                        <td align="center">${board.OWNER_NAME}</td>
                        <td align="center">${board.SIDO} ${board.SIGUNGU} ${board.BJ_NM} ${board.BONBUN }</td>
						<td align="center">${board.AREA_AFTER_FLOAT }</td>
						<td align="center">
							<!-- iframe id="IFRM_PurposeCode" align="absmiddle" scrolling="no" frameborder="0" framespacing="0" width="100%" height="22" src="/jsp/common/purposeCode/purposeCode_view.jsp?SectionCode=${board.TYPE}&PURPOSE_CD=${board.PURPOSE_CD}"></iframe-->
							${board.SORT_NM }
						</td>
						<td align="center">${board.SUM_ADJUST}</td>
						<!-- td align="center">${board.LAST_FROMDATE}</td>
						<td align="center">${board.LAST_TODATE}</td-->
						<td align="center">${board.FROMDATE}</td>
						<td align="center">${board.TODATE}</td>
						<td align="center">${board.RATE}</td>
						<td align="center">${board.PRICE}</td>
						<td align="center">
							<c:if test="${board.SUM_ADJUST == null }">
								<font color="red">�̻���</font>
							</c:if>
							<c:if test="${board.SUM_ADJUST != null }">
								<font color="red">����</font>
							</c:if>
						
						</td>                                                                          
                      </tr>
					 </c:forEach>
					 </c:when>
					<c:otherwise>
						<tr>
							<td align="center" class="sub_table" colspan="14" height="85"> ������ �����ϴ�</td>
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
	                    <tr>


	                    </tr>
	                  </table></td>
	              </tr>
	              
	              <tr>              
		          	<td height="40" align="right">
			        	<table border="0" width="100%">
			            	<tr>
			                	<td  align="right">
			                		<a href="javascript:NowPriceApply();"><img src="/img/gonsi_search.gif" alt="�������� �ϰ� ����" border="0"></a>
			                		
			                		<c:if test="${BJ_CD != ''}">
			                		<img onclick="javascript:goAllCal()" src="/img/ilgal_sanchul_icon.gif" alt="�ϰ� ����" border="0" style="cursor:hand;">
			                		</c:if>
				                	
				                	<img src="/img/excel_icon.gif" alt="EXCEL ��ȯ" border="0" onclick="javascript:excel_Search();" style="cursor:hand">
						            <!-- 
						            <c:if test="${showBatch == 'true'}"> 								                	
							        <a href="/jumyong/junggi/junggi_product.do?ADMIN_NO=${no}&year=${year}&currentPage=${currentPage}&countPerPage=${countPerPage}&mode=add";">
							        <img src="/img/levy_icon3.gif" alt="�ϰ��ΰ�ó��" border="0" >
							        </a>
							        </c:if> -->
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
	setSelectedOption(document.jumyongForm.PURPOSE_CD, '${PURPOSE_CD}');
</script>
</html>

