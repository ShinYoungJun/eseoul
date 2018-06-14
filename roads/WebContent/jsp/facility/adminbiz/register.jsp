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
<script language='JavaScript' src='/js/Check_inputbox.js'></script>
<!--  //********** BEGIN_hoban_20120303 -->
<script language="javascript" src="/js/zipcode.js"></script>
<!--  //********** END_hoban_20120303 -->   
<!--  //********** BEGIN_KANG_20120409 -->
<script language="javascript" src="/js/common.js"></script> 
<!--   //********** END_KANG_20120409 -->

</head>

<script type="text/javascript">
//<![CDATA[
	
	function	Register()
	{
		var form = document.form;
		var NAME = document.getElementById("NAME").value;
		var jumin_ssn1 =  document.getElementById("jumin_ssn1").value;
		var jumin_ssn2 = document.getElementById("jumin_ssn2").value;
		var BON_POST = document.getElementById("BON_POST").value;
		var ADDR1 = document.getElementById("ADDR1").value;
				
		var jumin_tel1 = document.getElementById("jumin_tel1").value;
		var jumin_tel2 = document.getElementById("jumin_tel2").value;
		var jumin_tel3 = document.getElementById("jumin_tel3").value;
		var jumin_fax1 = document.getElementById("jumin_fax1").value;
		var jumin_fax2 = document.getElementById("jumin_fax2").value;
		var jumin_fax3 = document.getElementById("jumin_fax3").value;
		var jumin_hp1 =  document.getElementById("jumin_hp1").value;
		var jumin_hp2 =  document.getElementById("jumin_hp2").value;
		var jumin_hp3 =  document.getElementById("jumin_hp3").value;
						
		var jumin_bizssn1 =  document.getElementById("jumin_bizssn1").value;
		var jumin_bizssn2 =  document.getElementById("jumin_bizssn2").value;
		var jumin_bizssn3 =  document.getElementById("jumin_bizssn3").value;
		
		if(NAME  == ''){
			alert('점용인(법인명)을 입력해주세요');
			return;
		}else if(jumin_ssn1 == '' || jumin_ssn2 == ''){
			alert('주민(법인)번호를 정확히 입력해주세요');
			return;
			
		}else if(BON_POST == ''){
			alert('점용인 주소를 선택해주세요');
			return;
		}else if(ADDR1 == ''){
			alert('점용인 주소를 선택해주세요');
			return;
		}
		
		if(jumin_ssn1.length != 6 || jumin_ssn2.length != 7 ){
			alert("주민(법인)번호를 정확히 입력해주세요!");
			return;
		}
		
		if(jumin_bizssn1.length != 3 || jumin_bizssn2.length != 2 || jumin_bizssn3.length != 5 ){
			alert("사업자등록번호를 정확히 입력해주세요!");
			return;
		}
		
		if(jumin_tel1 != '' && jumin_tel2 !='' && jumin_tel3 != ''){
			
		}else if(jumin_tel1 == '' && jumin_tel2 =='' && jumin_tel3 == ''){
			
		}else{
			alert('전화번호를 모두 입력해주세요');
			return;
		}
		
		if(jumin_fax1 != '' && jumin_fax2 !='' && jumin_fax3 != ''){
			
		}else if(jumin_fax1 == '' && jumin_fax2 =='' && jumin_fax3 == ''){
			
		}else{
			alert('팩스번호를 모두 입력해주세요');
			return;
		}
		
		if(jumin_hp1 != '' && jumin_hp2 !='' && jumin_hp3 != ''){
			
		}else if(jumin_hp1 == '' && jumin_hp2 =='' && jumin_hp3 == ''){
			
		}else{
			alert('핸드폰번호를 모두 입력해주세요');
			return;
		}
		
		form.action = "/facility/adminbiz/registerprc.do";

		form.submit();
	}

	function	goList()
	{
		var form = document.form;
		var currentPage = form.currentPage.value;

		form.action = "/facility/adminbiz/search.do?currentPage="+currentPage;
		form.submit();
	}
	
	function 	openZipcodePopup(post, addr)
	{
		var	post1	= post;
		var	addr1	= addr;

		var url 	= "/zipcode.do?openerPost=" + post1 + "&openerAddr=" + addr1;
		var winName = "우편번호입력";
		var width 	= 420;
		var height 	= 305;
		var scroll 	= "yes";
		var resize 	= "no";

		var	option	= "scrollbars=" + scroll + ", ";
		option	+= "resize=" + resize + ", ";
		option	+= "width=" + width + ", ";
		option	+= "height=" + height;

		window.open(url, winName, option);
	}

	function	Jumin_toaddr_Check()
	{
		var form 	= document.form;
		var	chk1	= form.ADDR_CHECK.checked;

		if(chk1	== true)
		{
			form.TO_POST.value	= form.BON_POST.value;
			form.TOADDR1.value	= form.ADDR1.value;
			form.TOADDR2.value	= form.ADDR2.value;
			
			if(form.SPC_CD.checked == true){
				form.SPC_CD.value = "1";
				form.TO_SPC_CD.checked = true;
				form.TO_SPC_CD.value = "1";
			}else{
				form.SPC_CD.value = "0";
				form.TO_SPC_CD.checked = false;
				form.TO_SPC_CD.value = "0";
			}
			form.TO_LNBR1.value	= form.LNBR1.value;
			form.TO_LNBR2.value	= form.LNBR2.value;
			 
			form.TOADDR1_NEW.value	= form.ADDR1_NEW.value;
			//form.TOADDR2.value	= form.ADDR2.value;
			
			form.TOSI.value	= form.SI.value;
			form.TOGUN.value		= form.GUN.value;
			form.TODONG.value		= form.DONG.value;
			form.TO_DORO_NM.value	= form.ROAD_ADDR.value;
			form.TO_BD_NM.value		= form.BD_NM.value;
			form.TO_BD_DET_NM.value	= form.BD_DET_NM.value;
			
			form.TO_BD_BON.value	= form.ROAD_BON.value;
			form.TO_BD_BU.value		= form.ROAD_BU.value;
			
			form.ADDR_CHECK.value = "1";
		}
		else
		{
			form.ADDR_CHECK.value = "0";
			
			if(form.TO_SPC_CD.checked == true){
				form.TO_SPC_CD.value = "1";
			}else{
				form.TO_SPC_CD.value = "0";
			}
		}
	}
	
	function	Jumin_toaddr_Check2()
	{
		var form 		=	document.form;
		var	chk			=	form.ADDR_CHECK.checked;
		var addr_check 	=	document.getElementById("ADDR_CHECK");
		
		if(chk	== true)
		{
			form.TO_POST.value		=	form.BON_POST.value;
			form.TOADDR1.value		=	form.ADDR1.value;
			form.TOADDR2.value		=	form.ADDR2.value;
		
			
			form.ADDR_CHECK.value	=	"1";
		}
	}
	
	function openWrite(){
		
		var group = document.getElementById('selectCompany').value;
		
		var array = group.split('/');
		
		var office_cd = array[0];
		var Name = array[1];
		
		if(office_cd == '99'){
			document.getElementById("NAME").readOnly = false;
			selectOfficeDiv("NAME").value = "";
			
		}else{
			document.getElementById("NAME").readOnly = true;
			document.getElementById("NAME").value = Name;
		}
		//********** BEGIN_KANG_20120409
		selectOffice(office_cd);
		//********** END_KANG_20120409	
	}
	//********** BEGIN_KANG_20120409	
	function officeSelect(){
		var group = document.getElementById('selectOffice').value;
		
		var array = group.split('/');
		
		var office_cd = array[0];
		var Name = array[1];
		
		document.getElementById("OFFICE").value = Name;
		
	}
	
	function selectOffice(obj){        	
        var	param	= "office="+obj;
        sendRequest("/facility/adminbiz/office.do", param, "GET", ResultChangeOfficeList);    	
    }

    function	ResultChangeOfficeList(obj)    {
        if(obj != null){        	
        	document.getElementById("selectOfficeDiv").style.display = "block";
        }
    	select_innerHTML(document.getElementById("selectOffice"),obj);
    }

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
	//********** END_KANG_20120409		

//]]>
</script>

<body>

<form name="form" id="form" method="post">
	
	<input type="hidden" name="CORP_CD" id="CORP_CD" value="${CORP_CD}">
	<input type="hidden" name="GU_CODE" id="GU_CODE" value="${GU_CODE}">
	<input type="hidden" name="currentPage"  id="currentPage" value="${currentPage}">

<table width="800" border="0" cellpadding="0" cellspacing="0">
  <tr>
    <td height="43"><img src="/img/sub3_cont1_title.gif" width="800" height="43"></td>
  </tr>
  <tr>
    <td align="center">
    <table width="780" border="0" cellpadding="0" cellspacing="0">
		<tr>
			<td align="left" >
			<table width="780" border="0" cellspacing="0" cellpadding="0">
			      <tr>
			        <td height="1" bgcolor="#ffffff"></td>
			      </tr>
			      <tr>
			        <td height="14"></td>
			      </tr>
			      
			      <tr>
			        <td align="left"><table width="780" border="0" cellspacing="0" cellpadding="0">
			          <tr>
			            <td height="22" background="/img/tab_line_blue.gif"><table border="0" cellspacing="0" cellpadding="0">
			                <tr>
			                  <td><img src="/img/sub_petition_title1.gif" width="110" height="22"></td>
			                </tr>
			            </table></td>
			          </tr>
			          
			          <tr>
			            <td class="contborder_blue">
			
			<table width="100%" border="0" cellspacing="0" cellpadding="0">
				
                <tr>
                  	<td>
                  	<table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
					<tr>
						<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">점용인(법인명)</td>
						<td width="37%" bgcolor="eaeaea" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
							<tr>
							  <!-- 
							  <td><input name="CORP_NM" type="text" class="essential" style="width:120px" readonly></td>
							  -->
							  <td width='130' align='left'><input name="NAME" id="NAME"  type="text" class="essential" style="width:120px" value=""  ></td>
							  <td>
							  	<select id='selectCompany' name='selectCompany' class='input_form1' onChange ='openWrite();' >
							  		<option value='99' >새로입력</option>
							  		<c:forEach items="${companyList}" var="company" varStatus="idx">							  		
							  			<option value="${company.OFFICE_CD}/${company.NAME}" >${company.NAME} </option>
							  		</c:forEach>							  		
							  	</select>
							  </td>
							</tr>
						</table></td>
						<td  height="26" align="center" bgcolor="e5eff8" class="sub_table_b">주민(법인)번호</td>
						<td bgcolor="eaeaea" class="table_bl_left"><input name="jumin_ssn1" id="jumin_ssn1" type="text" class="essential" style="width:40px; ime-mode:disabled" value="" onKeyPress="nr_num_int(this);" onKeyUp="count_check(this, jumin_ssn2, 6);" maxlength="6">
						  - <input name="jumin_ssn2" id="jumin_ssn2" type="text" class="essential" style="width:45px; ime-mode:disabled" onKeyPress="nr_num_int(this);" onKeyUp="nr_num_int(this);" maxlength="7" value="">
						 </td>
				  	</tr>
					<!--  //********** BEGIN_KANG_20120405 -->
					<tr>
						<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">지점명</td>
						<td width="37%" bgcolor="eaeaea" class="table_bl_left" colspan="3">
							<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
								<tr>
									<td width="130" align="left">
										<input name="OFFICE" id="OFFICE" type="text" class="input_form1" style="width:100px" value="">
									</td>
									<td>
										<div id="selectOfficeDiv" style="display:none">
										<select id="selectOffice" name="selectOffice" class="input_form1" style="width:100px" onChange ="officeSelect();" >									  									  		
									  	</select>
									  	</div>
									</td>
								</tr>
							</table>
						</td>						
				  	</tr>
					<!--   //********** END_KANG_20120405 -->
				  	<tr>
						<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">대표자명</td>
						<!-- 
						<td bgcolor="eaeaea" class="table_bl_left"><input name="NAME" type="text" class="input_form1" style="width:120px" onFocus="Jumin_toaddr_Check();"></td>				
						-->
						<td bgcolor="eaeaea" class="table_bl_left"><input name="TOPOST_NM" type="text" class="input_form1" style="width:120px" onFocus="Jumin_toaddr_Check();"></td>
						<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">사업자 등록번호</td>
						<td width="36%" bgcolor="eaeaea" class="table_bl_left">
							<input name="jumin_bizssn1" id="jumin_bizssn1" type="text" class="input_form1" value="" style="width:30px; ime-mode:disabled" onKeyPress="nr_num_int(this);" onKeyUp="count_check(this, jumin_bizssn2, 3);" maxlength="3">
						  - <input name="jumin_bizssn2" id="jumin_bizssn2" type="text" class="input_form1" value="" style="width:15px; ime-mode:disabled" onKeyPress="nr_num_int(this);" onKeyUp="count_check(this, jumin_bizssn3, 2);" maxlength="2">
						  - <input name="jumin_bizssn3" id="jumin_bizssn3" type="text" class="input_form1" value="" style="width:35px; ime-mode:disabled" onKeyPress="nr_num_int(this);" onKeyUp="nr_num_int(this);" maxlength="5">
						</td>
				  	</tr>
				  	<!-- //********** BEGIN_hoban_20120303 -->
					  	<tr>
							<td height="26px" align="center" bgcolor="e5eff8" class="sub_table_b">우편번호</td>
							<td bgcolor="eaeaea" class="table_bl_left" colspan="3">
							 <table width="100%" border="0" cellpadding="0" cellspacing="0" class="sub_stan">                                            
								<tr>
									<td width="50px"><input id="BON_POST" name="BON_POST" type="text" style="width:50px" onFocus="Jumin_toaddr_Check();" onKeyPress="Jumin_toaddr_Check();" onKeyUp="Jumin_toaddr_Check();" value="" onchange="Jumin_toaddr_Check();"  readonly class="input_form1"></td>
									<td width="50px"><a href="javascript:openZipcodePopup_new('form.BON_POST', 'form.ADDR1', 'form.ADDR1_NEW', 'form.SI', 'form.GUN', 'form.ROAD_ADDR', 'form.BD_NM','form.DONG','form.LNBR1', 'form.LNBR2' );"><img src="/img/search_icon.gif" alt="검색" width="56" height="18" border="0"></a></td>
									<td><a href="javascript:addrConfirm('BON_POST','SI','GUN','DONG','ROAD_ADDR','LNBR1','LNBR2','ROAD_BON','ROAD_BU','BD_NM','BD_DET_NM','ADDR1','ADDR2','ADDR1_NEW','form')"><img src="/img/ok_icon.gif" alt="확인" width="56" height="18" border="0"></a></td>
								</tr>
							</table>							 
							</td>
					  	</tr>					  
					  	<tr>
					  		<!-- 주민등록지 기본 주소 -->
							<td height="45px" align="center" bgcolor="e5eff8" class="sub_table_b">기본 주소</td>
							<td bgcolor="eaeaea" class="table_bl_left">
								<input id="ADDR1" name="ADDR1" type="text" class="input_form1" style="width:245px" onFocus="Jumin_toaddr_Check();" onKeyPress="Jumin_toaddr_Check();" onKeyUp="Jumin_toaddr_Check();" value="" readonly>
								<br>&nbsp;산&nbsp;<input type="checkbox" id="SPC_CD" name="SPC_CD" style="vertical-align: middle;" onclick="Jumin_toaddr_Check();"  onFocus="Jumin_toaddr_Check();" onKeyPress="Jumin_toaddr_Check();" onKeyUp="Jumin_toaddr_Check();" value="">&nbsp;<input id="LNBR1" name="LNBR1" value="" type="text" class="input_form1" style="width:27px" style="ime-mode:disabled" onKeyUp="Jumin_toaddr_Check(); nr_num_int(this); count_check(this, LNBR1, 4);" onKeyPress="Jumin_toaddr_Check(); nr_num_int(this); count_check(this, LNBR1, 4);" maxlength="4">&nbsp;-&nbsp;<input id="LNBR2" name="LNBR2" value="" type="text" class="input_form1" style="width:27px" style="ime-mode:disabled" onKeyUp="Jumin_toaddr_Check(); nr_num_int(this); count_check(this, LNBR2, 4);" onKeyPress="Jumin_toaddr_Check(); nr_num_int(this); count_check(this, LNBR2, 4);" maxlength="4">&nbsp;<input id="ADDR2" name="ADDR2" type="text" class="input_form1" style="width:118px" value="" onKeyUp="Jumin_toaddr_Check();" maxlength="50">
							</td>

						  	<!-- 주민등록지 도로명 주소 -->
							<td height="45px" align="center" bgcolor="e5eff8" class="sub_table_b">도로명 주소</td>
							<td bgcolor="eaeaea" class="table_bl_left">
								<input id="ADDR1_NEW" name="ADDR1_NEW" type="text" value="" class="essential" style="width:250px" onClick="Jumin_toaddr_Check();" onChange="Jumin_toaddr_Check();" onFocus="Jumin_toaddr_Check();" onKeyUp="Jumin_toaddr_Check();"  readonly>
	 							<input type="hidden" id="SI" name="SI" value="">
	 							<input type="hidden" id="GUN" name="GUN" value="">
	 							<input type="hidden" id="DONG" name="DONG" value="">
	 							<input type="hidden" id="ROAD_ADDR" name="ROAD_ADDR" value="">
	 							<input id="ROAD_BON" name="ROAD_BON" type="text" VALUE="" class="essential" style="width:25px" onClick="Jumin_toaddr_Check();" onChange="Jumin_toaddr_Check();" onFocus="Jumin_toaddr_Check();" onKeyUp="Jumin_toaddr_Check();" >
								-
								<input id="ROAD_BU" name="ROAD_BU" type="text" VALUE="" class="input_form1" style="width:25px" onClick="Jumin_toaddr_Check();" onChange="Jumin_toaddr_Check();" onFocus="Jumin_toaddr_Check();" onKeyUp="Jumin_toaddr_Check();"  >
								<input id="BD_NM" name="BD_NM" type="text" VALUE="" class="input_form1" style="width:135px" onClick="Jumin_toaddr_Check();" onChange="Jumin_toaddr_Check();" onFocus="Jumin_toaddr_Check();" onKeyUp="Jumin_toaddr_Check();"  maxlength="50">
								<input id="BD_DET_NM" name="BD_DET_NM" type="text" VALUE="" class="input_form1" style="width:135px" onClick="Jumin_toaddr_Check();" onChange="Jumin_toaddr_Check();" onFocus="Jumin_toaddr_Check();" onKeyUp="Jumin_toaddr_Check();"  maxlength="50">
							</td>
					  	</tr>					  	
				  	<!-- //********** END_hoban_20120303 -->
				  	<tr>
						<td align="center" bgcolor="e5eff8" class="sub_table_b">업태</td>
						<td bgcolor="eaeaea" class="table_bl_left"><input name="BIZ_STATUS" type="text" class="input_form1" style="width:120px" value=""></td>
						<td align="center" bgcolor="e5eff8" class="sub_table_b">종목</td>
						<td bgcolor="eaeaea" class="table_bl_left"><input name="BIZ_TYPES" type="text" class="input_form1" style="width:120px" value=""></td>				
				  	</tr>				
				  	<tr>
						<td height="34" colspan="4" align="left" bgcolor="#FFFFFF" class=""><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
							<tr>
							 	<td><span class="sub_stan_blue">* 우편물 송달지</span> : </td>
							  	<td width="16"><input name="ADDR_CHECK" type="checkbox" value="1" onclick="javascript:Jumin_toaddr_Check()" ></td>
							  	<td>점용인 주소와 동일</td>
							</tr>
						</table></td>
				  	</tr>
				  	<!-- //********** BEGIN_hoban_20120303 -->
					<tr>
							<td height="26px" align="center" bgcolor="e5eff8" class="sub_table_b">우편번호</td>
							<td bgcolor="eaeaea" class="table_bl_left"  colspan="3">
							<table  width="100%" border="0" cellpadding="0" cellspacing="0" class="sub_stan">
								<tr>
									<td width="50px"><input id="TO_POST" name="TO_POST" type="text" style="width:50px" onFocus="Jumin_toaddr_Check();" onKeyPress="Jumin_toaddr_Check();" onKeyUp="Jumin_toaddr_Check();" value=""  onchange="Jumin_toaddr_Check();"  readonly class="input_form1"></td>                                                    
									<td width="50px"><a href="javascript:openZipcodePopup_new('form.TO_POST', 'form.TOADDR1', 'form.TOADDR1_NEW', 'form.TOSI', 'form.TOGUN', 'form.TO_DORO_NM', 'form.TO_BD_NM','form.TODONG', 'form.TO_LNBR1', 'form.TO_LNBR2');"><img src="/img/search_icon.gif" alt="검색" width="56" height="18" border="0"></a></td>
									<td><a href="javascript:addrConfirm('TO_POST','TOSI','TOGUN','TODONG','TO_DORO_NM','TO_LNBR1','TO_LNBR2','TO_BD_BON','TO_BD_BU','TO_BD_NM','TO_BD_DET_NM','TOADDR1','TOADDR2','TOADDR1_NEW','form')"><img src="/img/ok_icon.gif" alt="확인" width="56" height="18" border="0"></a></td>									
								</tr>
							</table>
							</td>
						</tr>
					  	<tr>
							<!-- 실 거주지 기본 주소 -->
							<td align="center" bgcolor="e5eff8" class="sub_table_b">기본 주소</td>
							<td bgcolor="eaeaea" class="table_bl_left">
								<input id="TOADDR1" name="TOADDR1" type="text" class="essential" style="width:245px" onFocus="Jumin_toaddr_Check();" onKeyPress="Jumin_toaddr_Check();" onKeyUp="Jumin_toaddr_Check();" value="" readonly>
								<br>&nbsp;산&nbsp;<input type="checkbox" id="TO_SPC_CD" name="TO_SPC_CD" style="vertical-align: middle;" onclick="Jumin_toaddr_Check();"  onFocus="Jumin_toaddr_Check();" onKeyPress="Jumin_toaddr_Check();" onKeyUp="Jumin_toaddr_Check();" value="">&nbsp;<input id="TO_LNBR1" name="TO_LNBR1" value="" type="text" class="essential" style="width:27px" style="ime-mode:disabled" onKeyUp="Jumin_toaddr_Check(); nr_num_int(this); count_check(this, TO_LNBR1, 4);" onKeyPress="Jumin_toaddr_Check(); nr_num_int(this); count_check(this, TO_LNBR1, 4);" maxlength="4">&nbsp;-&nbsp;<input id="TO_LNBR2" name="TO_LNBR2" value="" type="text" class="input_form1" style="width:27px" style="ime-mode:disabled" onKeyUp="Jumin_toaddr_Check(); nr_num_int(this); count_check(this, TO_LNBR2, 4);" onKeyPress="Jumin_toaddr_Check(); nr_num_int(this); count_check(this, TO_LNBR2, 4);" maxlength="4">&nbsp;<input id="TOADDR2" name="TOADDR2" type="text" class="input_form1" style="width:118px" value="" onFocus="Jumin_toaddr_Check();" onKeyPress="Jumin_toaddr_Check();" onKeyUp="Jumin_toaddr_Check();" maxlength="50">&nbsp;
							</td>
							<!-- 실거주지 도로명 주소 -->
							<td align="center" bgcolor="e5eff8" class="sub_table_b">도로명 주소</td>
							<td bgcolor="eaeaea" class="table_bl_left">
								<input id="TOADDR1_NEW" name="TOADDR1_NEW" type="text" value="" class="essential" style="width:250px" onClick="Jumin_toaddr_Check();" onChange="Jumin_toaddr_Check();" onFocus="Jumin_toaddr_Check();" onKeyUp="Jumin_toaddr_Check();"  readonly>
	 							
	 							<input type="hidden" id="TOSI" name="TOSI" value="">
	 							<input type="hidden" id="TOGUN" name="TOGUN" value="">
	 							<input type="hidden" id="TODONG" name="TODONG" value="">
	 							<input type="hidden" id="TO_DORO_NM" name="TO_DORO_NM" value=""> 
	 							<input id="TO_BD_BON" name="TO_BD_BON" type="text" value="" class="essential" style="width:25px" onClick="Jumin_toaddr_Check();" onChange="Jumin_toaddr_Check();" onFocus="Jumin_toaddr_Check();" onKeyUp="Jumin_toaddr_Check();" >
								-
								<input id="TO_BD_BU" name="TO_BD_BU" type="text" value="" class="input_form1" style="width:25px" onClick="Jumin_toaddr_Check();" onChange="Jumin_toaddr_Check();" onFocus="Jumin_toaddr_Check();" onKeyUp="Jumin_toaddr_Check();"  >
								<input id="TO_BD_NM" name="TO_BD_NM" type="text" value="" class="input_form1" style="width:135px" onClick="Jumin_toaddr_Check();" onChange="Jumin_toaddr_Check();" onFocus="Jumin_toaddr_Check();" onKeyUp="Jumin_toaddr_Check();"  maxlength="50">
								<input id="TO_BD_DET_NM" name="TO_BD_DET_NM" type="text" value="" class="input_form1" style="width:135px" onClick="Jumin_toaddr_Check();" onChange="Jumin_toaddr_Check();" onFocus="Jumin_toaddr_Check();" onKeyUp="Jumin_toaddr_Check();"  maxlength="50">
							</td>
					  	</tr>
				  	<!-- //********** END_hoban_20120303 -->
				  	<tr>
						<td height="34" colspan="4" align="left" bgcolor="#FFFFFF" class=""><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
							<tr>
							  	<td><span class="sub_stan_blue">* 담당자 정보</span></td>
							</tr>
						</table></td>
					</tr>
					<tr>
					<!--  //********** BEGIN_KANG_20120405 -->
					<!-- 
						<td align="center" bgcolor="e5eff8" class="sub_table_b">지점명/담당자명</td>
						<td bgcolor="eaeaea" class="table_bl_left" height="25">
							<input name="OFFICE" type="text" class="input_form1" style="width:100px" value="">
							/ <input name="MANAGER" type="text" class="input_form1" style="width:130px" value="">
						</td>
					-->
						<td align="center" bgcolor="e5eff8" class="sub_table_b">담당자명</td>
						<td bgcolor="eaeaea" class="table_bl_left" height="25">							
							<input name="MANAGER" type="text" class="input_form1" style="width:130px" value="">
						</td>
					<!--   //********** END_KANG_20120405 -->
					
						<td align="center" bgcolor="e5eff8" class="sub_table_b">전화번호</td>
						<td bgcolor="eaeaea" class="table_bl_left">
							<input name="jumin_tel1" id="jumin_tel1" type="text" class="input_form1" style="width:25px" style="ime-mode:disabled" onKeyPress="nr_num_int(this);" onKeyUp="count_check(this, jumin_tel2, 3);" maxlength="3" value=""> - 
							<input name="jumin_tel2" id="jumin_tel2" type="text" class="input_form1" style="width:30px" style="ime-mode:disabled" onKeyPress="nr_num_int(this);" onKeyUp="count_check(this, jumin_tel3, 4);" maxlength="4" value=""> - 
							<input name="jumin_tel3" id="jumin_tel3" type="text" class="input_form1" style="width:30px" style="ime-mode:disabled" onKeyPress="nr_num_int(this);" onKeyUp="count_check(this, TEL_EXT, 4);" maxlength="4" value="">
							&nbsp;&nbsp;(&nbsp;내선&nbsp;<input name="TEL_EXT" type="text" class="input_form1" style="width:30px" style="ime-mode:disabled" onKeyPress="nr_num_int(this);" onKeyUp="nr_num_int(this);" maxlength="4" value="">&nbsp;)
						</td>
					</tr>
					<tr>
						<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">FAX</td>
						<td bgcolor="eaeaea" class="table_bl_left">
							<input name="jumin_fax1" id="jumin_fax1" type="text" class="input_form1" style="width:25px" style="ime-mode:disabled" onKeyPress="nr_num_int(this);" onKeyUp="count_check(this, jumin_fax2, 3);" maxlength="3"> - 
							<input name="jumin_fax2" id="jumin_fax2" type="text" class="input_form1" style="width:30px" style="ime-mode:disabled" onKeyPress="nr_num_int(this);" onKeyUp="count_check(this, jumin_fax3, 4);" maxlength="4"> - 
							<input name="jumin_fax3" id="jumin_fax3" type="text" class="input_form1" style="width:30px" style="ime-mode:disabled" onKeyPress="nr_num_int(this);" onKeyUp="count_check(this, jumin_fax3, 4);" maxlength="4">
						</td>
						<td align="center" bgcolor="e5eff8" class="sub_table_b">휴대전화</td>
						<td bgcolor="eaeaea" class="table_bl_left">
							<input name="jumin_hp1" id="jumin_hp1" type="text" class="input_form1" style="width:25px" style="ime-mode:disabled" onKeyPress="nr_num_int(this);" onKeyUp="count_check(this, jumin_hp2, 3);" maxlength="3"> - 
							<input name="jumin_hp2" id="jumin_hp2" type="text" class="input_form1" style="width:30px" style="ime-mode:disabled" onKeyPress="nr_num_int(this);" onKeyUp="count_check(this, jumin_hp3, 4);" maxlength="4"> - 
							<input name="jumin_hp3" id="jumin_hp3" type="text" class="input_form1" style="width:30px" style="ime-mode:disabled" onKeyPress="nr_num_int(this);" onKeyUp="nr_num_int(this);" maxlength="4">
						</td>
					</tr>
				  
                  	</table></td>
				  	</tr>
				  	<tr>
				  	<td colspan='4' height ="30" align="right" ><img src='/img/save_icon2.gif' alt="리스트" border="0" onClick="Register();" style="cursor:hand;"></td>
				  	</tr>
				</table>
			</td>
		</tr>
	</table>
    
    </td>         
</tr>
<tr>
	<td height='50' align='right'><img src="/img/list_icon.gif" alt="리스트"  border="0" onClick='goList();' style='cursor:hand;'></td>
</tr>
</table>
</form>
</body>
</html>
