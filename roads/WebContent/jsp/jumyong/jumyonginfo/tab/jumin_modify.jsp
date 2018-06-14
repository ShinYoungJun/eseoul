<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
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

<script language='JavaScript' src='/js/Check_inputbox.js'></script>
<!--  //********** BEGIN_현진_20120215 -->
<script language="javascript" src="/js/zipcode.js"></script>
<!--   //********** END_현진_20120215 -->   
	
<script type="text/javascript">
//<![CDATA[

	function	ModifyPrc()
	{
		var	result	= DataCheck();
//		alert('ModifyPrc');
		if(result	==	false)
			return;
		
		var form = document.form;

//		alert('toaddr2'+document.getElementById("TOADDR2").value);
//		alert('TO_ADDR2'+document.getElementById("TO_ADDR2").value);
//		
//		alert('addr2'+document.getElementById("ADDR2").value);
		
		document.getElementById("POST").value = pipe_cut(document.getElementById("POST"));
		document.getElementById("TOPOST").value = pipe_cut(document.getElementById("TOPOST"));

		form.action = "/jumyong/jumyonginfo/jumin_modify_prc.do"; 
		form.submit();
	}

	function	Cancel()
	{
		var form = document.form;

		form.action = "/jumyong/jumyonginfo/jumin_view.do";
		form.submit();
	}

	function	Jumin_toaddr_Check()
	{
		var form = document.form;
		var	chk	= form.ADDR_CHECK.checked;

		if(chk	== true)
		{
			form.TONM.value				= form.NAME.value;
			form.TOPOST.value			= form.POST.value;
			
			form.TOADDR1.value			= form.ADDR1.value;
			form.TOSAN.checked			= form.SAN.checked;
			form.TOBON.value			= form.BON.value;
			form.TOBU.value				= form.BU.value;
			form.TOADDR2.value			= form.ADDR2.value;
			form.TOMAIL.value			= form.EMAIL.value;


			//********** BEGIN_현진_20120229
			form.TOSI.value        		= form.SI.value;
			form.TOGUN.value       		= form.GUN.value;
			form.TO_DORO_NM.value  		= form.DORO_NM.value;
			form.TODONG.value      		= form.DONG.value;
			form.TOADDR1_NEW.value   	= form.ADDR1_NEW.value;
			form.TO_BD_BON.value     	= form.BD_BON.value;
			form.TO_BD_BU.value      	= form.BD_BU.value;
			form.TO_BD_NM.value      	= form.BD_NM.value;
			form.TO_BD_DET_NM.value  	= form.BD_DET_NM.value;
			//********** END_현진_20120229
					
			form.TOTEL1.value			= form.TEL1.value;
			form.TOHP1.value			= form.HP1.value;


			form.TOTEL2.value			= form.TEL2.value;
			form.TOHP2.value			= form.HP2.value;


			form.TOTEL3.value			= form.TEL3.value;
			form.TOHP3.value			= form.HP3.value;


			
			form.ADDR_CHECK.value = '1';
		}
	}
    //********** BEGIN_현진_20120215
    /*
	function 	openZipcodePopupNew(post, addr, addr_new)
	{
		var	post1	= post;
		var	addr1	= addr;
		var	addr2	= addr_new;

		var url 	= "/zipcode.do?openerPost=" + post1 + "&openerAddr=" + addr1+ "&openerAddrNew=" + addr2;
		var winName = "우편번호입력";
		//var width 	= 420;
		var width 	= 840;
		var height 	= 305;
		var scroll 	= "yes";
		var resize 	= "no";

		var	option	= "scrollbars=" + scroll + ", ";
		option	+= "resize=" + resize + ", ";
		option	+= "width=" + width + ", ";
		option	+= "height=" + height;

		window.open(url, winName, option);
	}
	
	
	
	function openZipcodePopup_new(post, addr, addr_new, si, gu, doro, bd)
	{ 
		var	post1	= post;
		var	addr1	= addr;
		var	addr1_new	= addr_new;
		var	addr1_si	= si;
		var	addr1_gu	= gu;
		var	addr1_doro	= doro;
		var	addr1_bd	= bd;
		
		 
		
		//var url 	= "/zipcode.do?openerPost=" + post1 + "&openerAddr=" + addr1+ "&openerAddrNew=" + addr1_new+ "&openerSi=" + addr1_si+ "&openerGu=" + addr1_gu+ "&openerDoro=" + addr1_doro+"&openerBd=" + addr1_bd;
		var url 	= "/zipCode_New.do?openerPost=" + post1 + "&openerAddr=" + addr1+ "&openerAddrNew=" + addr1_new+ "&openerSi=" + addr1_si+ "&openerGun=" + addr1_gu+ "&openerDoro=" + addr1_doro+"&openerBd=" + addr1_bd;
		
		//alert('url ='+url);
		
		var winName = "우편번호입력";
		//var width 	= 420;
		var width 	= 840;
		var height 	= 305;
		var scroll 	= "yes";
		var resize 	= "no";

		var	option	= "scrollbars=" + scroll + ", ";
		option	+= "resize=" + resize + ", ";
		option	+= "width=" + width + ", ";
		option	+= "height=" + height;

		window.open(url, winName, option);
		 
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
    */
    //********** END_현진_20120215
     
	//********** BEGIN_KANG_20120525
	function addrDelete()
	{
    	form.POST.value			= "";
    	form.ADDR1.value		= "";
    	form.SAN.value			= "";
    	form.BON.value			= "";
    	form.BU.value			= "";
    	form.ADDR2.value		= "";
    	form.ADDR1_NEW.value	= "";
    	form.SI.value			= "";
    	form.GUN.value			= "";
    	form.DORO_NM.value		= "";
    	form.DONG.value			= "";
    	form.BD_BON.value		= "";
    	form.BD_BU.value		= "";
    	form.BD_NM.value		= "";
    	form.BD_DET_NM.value	= "";
    	form.BD_BON.value		= "";
    	form.BD_BU.value		= "";
    	form.BD_NM.value		= "";
    	form.BD_DET_NM.value	= "";
    	    	
    	openZipcodePopup_new('form.POST', 'form.ADDR1', 'form.ADDR1_NEW', 'form.SI', 'form.GUN', 'form.DORO_NM', 'form.BD_NM','form.DONG','form.BON', 'form.BU' );
	}

	function addrDeleteTo()
	{
		form.TOPOST.value			= "";
		form.TOADDR1.value			= "";
		form.TOSI.value				= "";
		form.TOGUN.value			= "";
		form.TO_DORO_NM.value		= "";
		form.TODONG.value			= "";
		form.TOSAN.value			= "";
		form.TOBON.value			= "";
		form.TOBU.value				= "";
		form.TOADDR2.value			= "";
		form.TOADDR1_NEW.value		= "";
		form.TO_BD_BON.value		= "";
		form.TO_BD_BU.value			= "";
		form.TO_BD_NM.value			= "";
		form.TO_BD_DET_NM.value		= "";
		form.TO_BD_BON.value		= "";
		form.TO_BD_BU.value			= "";
		form.TO_BD_NM.value			= "";
		form.TO_BD_DET_NM.value		= "";

    	    	
		openZipcodePopup_new('form.TOPOST', 'form.TOADDR1', 'form.TOADDR1_NEW', 'form.TOSI', 'form.TOGUN', 'form.TO_DORO_NM', 'form.TO_BD_NM','form.TODONG','form.TOBON', 'form.TOBU');
	}
	//********** END_KANG_20120525
     
	function 	Init()
	{
		parent.Tab_Img("jumin");
	}

	function	DataCheck()
	{
		var form 	= document.form;
		var	str		= "";

		//	점용인 정보
		if(form.NAME.value.length	< 1)
			str	+= "점용인/법인명을 입력하세요\n";	
		else if(form.jumin_ssn1.value.length	< 6	||	form.jumin_ssn2.value.length	< 7)
			str	+= "주민/법인번호를  입력하세요\n";
		else if(form.POST.value.length	< 1)
			str	+= "우편번호를 입력하세요\n";
		else if(form.BON.value.length	< 1)
			str	+= "본번을 입력하세요\n";
		else if(form.TOPOST.value.length	< 1)
			str	+= "우편번호를 입력하세요\n";
		else if(form.TOBON.value.length	< 1)
			str	+= "본번을 입력하세요\n";

		if(form.jumin_bizssn1.value.length > 0 || form.jumin_bizssn2.value.length > 0 || form.jumin_bizssn3.value.length > 0)
		{
			if(form.jumin_bizssn1.value.length	< 3	||	form.jumin_bizssn2.value.length < 2	||	form.jumin_bizssn3.value.length < 5)
				str	+= "사업자등록번호를 정확히 입력하세요\n";
		}
		
		if(str	== "")
		{
			return	true;
		}
		
		alert(str);
		
		return	false;
	}
	
//]]>
</script>

<body onkeyup="Init();">
<table width="780" border="0" cellpadding="0" cellspacing="0">
<form id="form" name="form" method="post">
<input type="hidden" id="ADMIN_NO" name="ADMIN_NO" value="${board.ADMIN_NO}">

	<tr>
		<td align="left" class="contborder_purple">
		<table width="100%" border="0" cellspacing="0" cellpadding="0">
			<tr>
			  <td><table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
				  <tr>
					<td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">점용인/법인명</td>
					<td width="37%" bgcolor="eaeaea" class="table_bl_left">
						<input id="NAME" name="NAME" type="text" class="essential" style="width:250px" value="${board.NAME}" onKeyUp="Jumin_toaddr_Check();" onchange="Jumin_toaddr_Check();">
					</td>
					<td width="100" align="center" bgcolor="e5eff8" class="sub_table_b">주민/법인번호</td>
					<td bgcolor="eaeaea" class="table_bl_left"><input id="jumin_ssn1" name="jumin_ssn1" type="text" class="essential" style="width:40px; ime-mode:disabled" value="${jumin_ssn1}" onKeyPress="nr_num_int(this);" onKeyUp="count_check(this, jumin_ssn2, 6);" maxlength="6">
					  - <input id="jumin_ssn2"  name="jumin_ssn2" type="text" class="essential" style="width:87px; ime-mode:disabled" value="${jumin_ssn2}" onKeyPress="nr_num_int(this);" maxlength="7"></td>
				  </tr>
				  <tr>
					<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">사업자등록번호</td>
					<td bgcolor="eaeaea" class="table_bl_left"><input id="jumin_bizssn1" name="jumin_bizssn1" type="text" class="input_form1" value="${jumin_bizssn1}" style="width:20px; ime-mode:disabled" onKeyPress="nr_num_int(this);" onKeyUp="count_check(this, jumin_bizssn2, 3);" maxlength="3">
					  - <input id="jumin_bizssn2" name="jumin_bizssn2" type="text" class="input_form1" value="${jumin_bizssn2}" style="width:15px; ime-mode:disabled" onKeyPress="nr_num_int(this);" onKeyUp="count_check(this, jumin_bizssn3, 2);" maxlength="2">
					  - <input id="jumin_bizssn3" name="jumin_bizssn3" type="text" class="input_form1" value="${jumin_bizssn3}" style="width:35px; ime-mode:disabled" onKeyPress="nr_num_int(this);" maxlength="5">
					 </td>
					<td align="center" bgcolor="e5eff8" class="sub_table_b">업태/업종</td>
					<td bgcolor="eaeaea" class="table_bl_left"><input id="BIZ_STATUS" name="BIZ_STATUS" type="text" class="input_form1" style="width:60px" value="${board.BIZ_STATUS}">
					  / <input id="BIZ_TYPES" name="BIZ_TYPES" type="text" class="input_form1" style="width:160px" value="${board.BIZ_TYPES}"></td>
				  </tr>
				  <!--  //********** BEGIN_현진_20120321 -->
				  	<!--  //********** BEGIN_KANG_20120417 -->
				  	<!-- 
				  	<tr>
						<td height="26px" align="center" bgcolor="e5eff8" class="sub_table_b">대표자명</td>
						<td bgcolor="eaeaea" class="table_bl_left">
							<input id="EXPONENT" name="EXPONENT" type="text" class="input_form1" style="width:100px" maxlength="10" value="${board.EXPONENT }"/>
						</td>
						<td align="center" bgcolor="e5eff8" class="sub_table_b">사업장주소</td>
						<td bgcolor="eaeaea" class="table_bl_left">
							<input id="BUSINESSADDR" name="BUSINESSADDR" type="text" class="input_form1" style="width:220px" maxlength="100" value="${board.BUSINESSADDR  }"/>													  
						</td>
				  	</tr>
				  	 -->
				  	 <tr>
						<td height="26px" align="center" bgcolor="e5eff8" class="sub_table_b">대표자명</td>
						<td bgcolor="eaeaea" class="table_bl_left">
							<input id="EXPONENT" name="EXPONENT" type="text" class="input_form1" style="width:100px" maxlength="10" value="${board.EXPONENT }"/>
						</td>
						<td align="center" bgcolor="e5eff8" class="sub_table_b">상호명</td>
						<td bgcolor="eaeaea" class="table_bl_left">
							<input id="COMPANY_NAME" name="COMPANY_NAME" type="text" class="input_form1" style="width:220px" maxlength="100" value="${board.COMPANY_NAME }"/>													  
						</td>
				  	</tr>
				  	<tr>
						<td height="26px" align="center" bgcolor="e5eff8" class="sub_table_b">사업장 주소</td>
						<td bgcolor="eaeaea" class="table_bl_left" colspan="3">
							<input id="BUSINESSADDR" name="BUSINESSADDR" type="text" class="input_form1" style="width:300px" maxlength="100" value="${board.BUSINESSADDR  }"/>													  
						</td>
				  	</tr>
					<!--   //********** END_KANG_20120417 -->
				  	
					<!--   //********** END_현진_20120321 -->
				  <!--  //********** BEGIN_현진_20120215 -->
                 <!-- 
				  <tr>
					<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">우편번호</td>
					<td colspan="3" bgcolor="eaeaea" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
						<tr>
						  <td><input id="POST"  name="POST" type="text" class="input_form1" style="width:50px" onclick="Jumin_toaddr_Check();" onchange="Jumin_toaddr_Check();" onFocus="Jumin_toaddr_Check();" onkeyup="Jumin_toaddr_Check();" value="${board.POST}" readonly></td>
						  <td><a href="javascript:openZipcodePopup_new('form.POST', 'form.ADDR1', 'form.ADDR1_NEW', 'form.SI', 'form.GUN', 'form.DORO_NM', 'form.BD_NM');"><img src="/img/search_icon.gif" alt="검색" width="56" height="18" border="0"></a></td>
						</tr>
					</table></td>	
				  </tr>
				  -->
				  <tr>
					<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">우편번호</td>
					<td colspan="3" bgcolor="eaeaea" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
						<tr>
						  	<td width="50px"><input id="POST"  name="POST" type="text" class="input_form1" style="width:50px" onclick="Jumin_toaddr_Check();" onchange="Jumin_toaddr_Check();" onFocus="Jumin_toaddr_Check();" onkeyup="Jumin_toaddr_Check();" value="${board.POST}" readonly></td>
						  	<!--  //********** BEGIN_KANG_20120525 -->
						  	<!-- <td width="50px"><a href="javascript:openZipcodePopup_new('form.POST', 'form.ADDR1', 'form.ADDR1_NEW', 'form.SI', 'form.GUN', 'form.DORO_NM', 'form.BD_NM','form.DONG','form.BON', 'form.BU' );"><img src="/img/search_icon.gif" alt="검색" width="56" height="18" border="0"></a></td> -->
						  	<td width="50px"><a href="javascript:addrDelete();"><img src="/img/search_icon.gif" alt="검색" width="56" height="18" border="0"></a></td>
						  	<!--   //********** END_KANG_20120525 -->					  	
								<td align="right"><a href="javascript:addrConfirm('POST','SI','GUN','DONG','DORO_NM','BON','BU','BD_BON','BD_BU','BD_NM','BD_DET_NM','ADDR1','ADDR2','ADDR1_NEW','form')"><img src="/img/ok_icon.gif" alt="확인" width="56" height="18" border="0"></a></td>
								<!--  sungh83 20131106 -->
								<td><span class="sub_table_b">%도로명주소의 건물본번,부번을 입력하시려면 확인버튼을 클릭하시오</span></td>
								<!--  sungh83 20131106 -->				
						</tr>
					</table></td>	
				  </tr>
					<!--   //********** END_현진_20120215 -->
				  <tr>
					<td align="center" bgcolor="e5eff8" class="sub_table_b">주소</td>
					<td bgcolor="eaeaea" class="table_bl_left">
					<!--  //********** BEGIN_현진_20120309 -->
						<input id="ADDR1" name="ADDR1" type="text" class="essential" style="width:250px" onClick="Jumin_toaddr_Check();" onChange="Jumin_toaddr_Check();" onFocus="Jumin_toaddr_Check();" onKeyUp="Jumin_toaddr_Check();" value="${board.ADDR1}" readonly>
					<!--   //********** END_현진_20120309 -->
						산<input id="SAN" name="SAN" type="checkbox" style="vertical-align: middle;" onClick="Jumin_toaddr_Check();" onChange="Jumin_toaddr_Check();" onFocus="Jumin_toaddr_Check();" onKeyUp="Jumin_toaddr_Check();" <c:if test="${board.SAN == '1'}">checked</c:if>>
						<input id="BON" name="BON" type="text" class="essential" style="width:25px" onClick="Jumin_toaddr_Check();" onChange="Jumin_toaddr_Check();" onFocus="Jumin_toaddr_Check();" onKeyUp="Jumin_toaddr_Check();" value="${board.BON}">
						-
						<input id="BU" name="BU" type="text" class="input_form1" style="width:25px" onClick="Jumin_toaddr_Check();" onChange="Jumin_toaddr_Check();" onFocus="Jumin_toaddr_Check();" onKeyUp="Jumin_toaddr_Check();" value="${board.BU}" >
						<!--  //********** BEGIN_현진_20120216 -->
						<input id="ADDR2" name="ADDR2" type="text" class="input_form1" style="width:135px" onClick="Jumin_toaddr_Check();" onChange="Jumin_toaddr_Check();" onFocus="Jumin_toaddr_Check();" onKeyUp="Jumin_toaddr_Check();" value="${board.ADDR2}"  maxlength="50">
						<!--   //********** END_현진_20120216 -->
					</td>	
					<td align="center" bgcolor="e5eff8" class="sub_table_b">도로명 주소</td>
					<td bgcolor="eaeaea" class="table_bl_left">
					<!--  //********** BEGIN_현진_20120309 -->
						<!--  //********** BEGIN_KANG_20120424 -->
						<!-- <input id="ADDR1_NEW" name="ADDR1_NEW" type="text" value="${board.SI} ${board.GUN} ${board.DORO_NM}" class="essential" style="width:230px" onClick="Jumin_toaddr_Check();" onChange="Jumin_toaddr_Check();" onFocus="Jumin_toaddr_Check();" onKeyUp="Jumin_toaddr_Check();"  readonly> -->
						<input id="ADDR1_NEW" name="ADDR1_NEW" type="text" <c:if test="${board.DORO_NM != null && board.DORO_NM !=''}">value="${board.SI} ${board.GUN} ${board.DORO_NM}"</c:if> class="essential" style="width:230px" onClick="Jumin_toaddr_Check();" onChange="Jumin_toaddr_Check();" onFocus="Jumin_toaddr_Check();" onKeyUp="Jumin_toaddr_Check();"  readonly>
						<!--   //********** END_KANG_20120424 -->					
						
					<!--   //********** END_현진_20120309 -->
	 					<input id="SI" name="SI" type="hidden" value="${board.SI}">
	 					<input id="GUN" type="hidden" name="GUN" value="${board.GUN}">
	 					<input id="DORO_NM" type="hidden" name="DORO_NM" value="${board.DORO_NM}">
	 					<br>
	 					<!--  //********** BEGIN_현진_20120215 -->
	 					<input id="DONG" name="DONG" type="hidden" value="${board.DONG}"/>
	 					<!-- 
	 					산<input id="SAN" name="SAN" type="checkbox" style="vertical-align: middle;" onClick="Jumin_toaddr_Check();" onChange="Jumin_toaddr_Check();" onFocus="Jumin_toaddr_Check();" onKeyUp="Jumin_toaddr_Check();" <c:if test="${board.SAN == '1'}">checked</c:if>>
						 -->
						<!--   //********** END_현진_20120215 -->					
						<!--  //********** BEGIN_KANG_20120424 -->
						<!-- 
						<input id="BD_BON" name="BD_BON" type="text" VALUE="${board.BD_BON}" class="essential" style="width:25px" onClick="Jumin_toaddr_Check();" onChange="Jumin_toaddr_Check();" onFocus="Jumin_toaddr_Check();" onKeyUp="Jumin_toaddr_Check();" >
						-
						<input id="BD_BU" name="BD_BU" type="text" VALUE="${board.BD_BU}" class="input_form1" style="width:25px" onClick="Jumin_toaddr_Check();" onChange="Jumin_toaddr_Check();" onFocus="Jumin_toaddr_Check();" onKeyUp="Jumin_toaddr_Check();"  >
						<input id="BD_NM" name="BD_NM" type="text" VALUE="${board.BD_NM}" class="input_form1" style="width:135px" onClick="Jumin_toaddr_Check();" onChange="Jumin_toaddr_Check();" onFocus="Jumin_toaddr_Check();" onKeyUp="Jumin_toaddr_Check();"  maxlength="50">
						<input id="BD_DET_NM" name="BD_DET_NM" type="text" VALUE="${board.BD_DET_NM}" class="input_form1" style="width:214px" onClick="Jumin_toaddr_Check();" onChange="Jumin_toaddr_Check();" onFocus="Jumin_toaddr_Check();" onKeyUp="Jumin_toaddr_Check();"  maxlength="50">
						 -->
						<c:if test="${board.DORO_NM != null && board.DORO_NM !=''}"> 
						<input id="BD_BON" name="BD_BON" type="text" VALUE="${board.BD_BON}" class="essential" style="width:25px" onClick="Jumin_toaddr_Check();" onChange="Jumin_toaddr_Check();" onFocus="Jumin_toaddr_Check();" onKeyUp="Jumin_toaddr_Check();" >
						-
						<input id="BD_BU" name="BD_BU" type="text" VALUE="${board.BD_BU}" class="input_form1" style="width:25px" onClick="Jumin_toaddr_Check();" onChange="Jumin_toaddr_Check();" onFocus="Jumin_toaddr_Check();" onKeyUp="Jumin_toaddr_Check();"  >
						<input id="BD_NM" name="BD_NM" type="text" VALUE="${board.BD_NM}" class="input_form1" style="width:135px" onClick="Jumin_toaddr_Check();" onChange="Jumin_toaddr_Check();" onFocus="Jumin_toaddr_Check();" onKeyUp="Jumin_toaddr_Check();"  maxlength="50">
						<input id="BD_DET_NM" name="BD_DET_NM" type="text" VALUE="${board.BD_DET_NM}" class="input_form1" style="width:214px" onClick="Jumin_toaddr_Check();" onChange="Jumin_toaddr_Check();" onFocus="Jumin_toaddr_Check();" onKeyUp="Jumin_toaddr_Check();"  maxlength="50">
						</c:if>
						<c:if test="${board.DORO_NM == null || board.DORO_NM ==''}">
						<input id="BD_BON" name="BD_BON" type="text" VALUE="" class="essential" style="width:25px" onClick="Jumin_toaddr_Check();" onChange="Jumin_toaddr_Check();" onFocus="Jumin_toaddr_Check();" onKeyUp="Jumin_toaddr_Check();" >
						-
						<input id="BD_BU" name="BD_BU" type="text" VALUE="" class="input_form1" style="width:25px" onClick="Jumin_toaddr_Check();" onChange="Jumin_toaddr_Check();" onFocus="Jumin_toaddr_Check();" onKeyUp="Jumin_toaddr_Check();"  >
						<input id="BD_NM" name="BD_NM" type="text" VALUE="" class="input_form1" style="width:135px" onClick="Jumin_toaddr_Check();" onChange="Jumin_toaddr_Check();" onFocus="Jumin_toaddr_Check();" onKeyUp="Jumin_toaddr_Check();"  maxlength="50">
						<input id="BD_DET_NM" name="BD_DET_NM" type="text" VALUE="" class="input_form1" style="width:214px" onClick="Jumin_toaddr_Check();" onChange="Jumin_toaddr_Check();" onFocus="Jumin_toaddr_Check();" onKeyUp="Jumin_toaddr_Check();"  maxlength="50">
						</c:if>
						<!--   //********** END_KANG_20120424 -->						
	 					
					</td>
				  </tr>
				  <tr>
					<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">e-mail</td>
					<td bgcolor="eaeaea" class="table_bl_left">
						<input id="EMAIL" name="EMAIL" type="text" class="input_form1" style="width:250px" onChange="Jumin_toaddr_Check();" onFocus="Jumin_toaddr_Check();"  onKeyUp="Jumin_toaddr_Check();" maxlength="50" value="${board.EMAIL}" style="ime-mode:disabled">
					</td>
					<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">기존 허가번호</td>
					<td bgcolor="eaeaea" class="table_bl_left">
					<!--  //********** BEGIN_KANG_20120405 -->
					<!-- 
						<input id="B_PERMISSION" name="B_PERMISSION" type="text" class="input_form1" style="width:250px" value="${board.BEFORE_PERMISSION}" style="ime-mode:disabled" onchange="Jumin_toaddr_Check();" onFocus="Jumin_toaddr_Check();"  onkeyup="Jumin_toaddr_Check();" maxlength="20">
					</td>
					-->
					<input id="b_PERMISSION" name="b_PERMISSION" type="text" class="input_form1" style="width:250px" value="${board.BEFORE_PERMISSION}" style="ime-mode:disabled" onchange="Jumin_toaddr_Check();" onFocus="Jumin_toaddr_Check();"  onkeyup="Jumin_toaddr_Check();" maxlength="20">
					<!--   //********** END_KANG_20120405 -->
				  </tr>
				  <tr>
					<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">전화번호</td>
					<td bgcolor="eaeaea" class="table_bl_left">
					
						<input id="TEL1" name="TEL1" value="${board.TEL1}" type="text" class="input_form1" style="width:25px" style="ime-mode:disabled" onKeyPress="nr_num_int(this),Jumin_toaddr_Check()" onKeyUp="count_check(this, TEL2, 3),Jumin_toaddr_Check()" maxlength="3"> - 
						<input id="TEL2" name="TEL2" value="${board.TEL2}" type="text" class="input_form1" style="width:30px" style="ime-mode:disabled" onKeyPress="nr_num_int(this),Jumin_toaddr_Check()" onKeyUp="count_check(this, TEL3, 4),Jumin_toaddr_Check()" maxlength="4"> - 
						<input id="TEL3" name="TEL3" value="${board.TEL3}" type="text" class="input_form1" style="width:30px" style="ime-mode:disabled" onKeyPress="nr_num_int(this),Jumin_toaddr_Check()" onKeyUp="count_check(this, HP1, 4),Jumin_toaddr_Check()" maxlength="4">
							
					
					
					
					</td>
					<td align="center" bgcolor="e5eff8" class="sub_table_b">휴대전화</td>
					<td bgcolor="eaeaea" class="table_bl_left">
					
					   <input id="HP1" name="HP1" value="${board.HP1}" type="text" class="input_form1" style="width:25px" style="ime-mode:disabled" onKeyPress="nr_num_int(this),Jumin_toaddr_Check()" onKeyUp="count_check(this, HP2, 3),Jumin_toaddr_Check()" maxlength="3"> - 
					   <input id="HP2" name="HP2" value="${board.HP2}" type="text" class="input_form1" style="width:30px" style="ime-mode:disabled" onKeyPress="nr_num_int(this),Jumin_toaddr_Check()" onKeyUp="count_check(this, HP3, 4),Jumin_toaddr_Check()" maxlength="4"> - 
					   <input id="HP3" name="HP3" value="${board.HP3}" type="text" class="input_form1" style="width:30px" style="ime-mode:disabled" onKeyPress="nr_num_int(this),Jumin_toaddr_Check()" onKeyUp="nr_num_int(this),Jumin_toaddr_Check()" maxlength="4">
					
					</td>
				  </tr>
				  <tr>
			      	<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">비고</td>
			        <td colspan="3" bgcolor="eaeaea" class="table_bl_left">
			       		<table width="100%" border="0" cellpadding="0" cellspacing="0" class="sub_stan">
			        		<textarea id="REFERENCE" name="REFERENCE" onkeyup="displayBytes(500, 'REFERENCE');" type="text" class="input_form1" style="width:98%">${board.REFERENCE}</textarea>
			       		</table>
			      	</td>
			      </tr> 
				  <tr>
					<td height="34" colspan="4" align="left" bgcolor="#FFFFFF" class=""><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
						<tr>
						  <td><span class="sub_stan_blue">* 우편물 송달지</span> : </td>
						  <td width="16">
						  	<c:if test="${board.ADDR_CHECK == '1' }">
						  		<input id="ADDR_CHECK" name="ADDR_CHECK" type="checkbox" checked="checked" onclick="Jumin_toaddr_Check();" onchange="Jumin_toaddr_Check();" onFocus="Jumin_toaddr_Check();" value="1">
						  	</c:if>
						  	<c:if test="${board.ADDR_CHECK != '1' }">
						  		<input id="ADDR_CHECK" name="ADDR_CHECK" type="checkbox" onclick="Jumin_toaddr_Check();" onchange="Jumin_toaddr_Check();" onFocus="Jumin_toaddr_Check();" value="0">
						  	</c:if>
						  </td>
						  <td width="110">점용인 정보와 동일 </td>
						</tr>
					</table></td>
				  </tr>
				  <tr>
					<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">우편물 수령인 </td>
					<td colspan="3" bgcolor="eaeaea" class="table_bl_left">
						<input id="TONM" name="TONM" type="text" class="essential" style="width:250px" value="${board.TONM}" onKeyUp="Jumin_toaddr_Check();" onClick="Jumin_toaddr_Check();">
					</td>
				  </tr>
				  <!--  //********** BEGIN_현진_20120215 -->
                  <!-- 
				  <tr>
					<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">우편번호</td>
					<td bgcolor="eaeaea" colspan="3" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
						<tr>
						  <td><input id="TOPOST"  name="TOPOST" type="text" class="essential" style="width:50px" value="${board.TOPOST}" onclick="Jumin_toaddr_Check();" onchange="Jumin_toaddr_Check();" onFocus="Jumin_toaddr_Check();" readonly></td>
						  <td><a href="javascript:openZipcodePopup_new('form.TOPOST', 'form.TOADDR1', 'form.TOADDR1_NEW', 'form.TOSI', 'form.TOGUN', 'form.TO_DORO_NM', 'form.TO_BD_NM');"><img src="/img/search_icon.gif" alt="검색" width="56" height="18" border="0"></a></td>
						</tr>
					</table></td> 
				  </tr>
				  -->
				<tr>
					<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">우편번호</td>
					<td bgcolor="eaeaea" colspan="3" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
						<tr>
						  	<td width="50px"><input id="TOPOST"  name="TOPOST" type="text" class="essential" style="width:50px" value="${board.TOPOST}" onclick="Jumin_toaddr_Check();" onchange="Jumin_toaddr_Check();" onFocus="Jumin_toaddr_Check();" readonly></td>
						  	<!--  //********** BEGIN_KANG_20120525 -->
						  	<!-- <td width="50px"><a href="javascript:openZipcodePopup_new('form.TOPOST', 'form.TOADDR1', 'form.TOADDR1_NEW', 'form.TOSI', 'form.TOGUN', 'form.TO_DORO_NM', 'form.TO_BD_NM','form.TODONG','form.TOBON', 'form.TOBU');"><img src="/img/search_icon.gif" alt="검색" width="56" height="18" border="0"></a></td> -->
						  	<td width="50px"><a href="javascript:addrDeleteTo()"><img src="/img/search_icon.gif" alt="검색" width="56" height="18" border="0"></a></td>
								<!--   //********** END_KANG_20120525 -->
								<td align="right"><a href="javascript:addrConfirm('TOPOST','TOSI','TOGUN','DONG','TO_DORO_NM','TOBON','TOBU','TO_BD_BON','TO_BD_BU','TO_BD_NM','TO_BD_DET_NM','TOADDR1','TOADDR2','TOADDR1_NEW','form')"><img src="/img/ok_icon.gif" alt="확인" width="56" height="18" border="0"></a></td>
								<!--  sungh83 20131106 -->
								<td><span class="sub_table_b">%도로명주소의 건물본번,부번을 입력하시려면 확인버튼을 클릭하시오</span></td>
								<!--  sungh83 20131106 -->
						</tr>
					</table></td> 
				  </tr>				
				  <!--   //********** END_현진_20120215 -->
				  <tr>
					<td align="center" bgcolor="e5eff8" class="sub_table_b">송달지 주소</td>
					<td bgcolor="eaeaea" class="table_bl_left">
						<input id="TOADDR1" name="TOADDR1" type="text" class="essential" style="width:250px" onClick="Jumin_toaddr_Check();" onChange="Jumin_toaddr_Check();" onFocus="Jumin_toaddr_Check();" onKeyUp="Jumin_toaddr_Check();" value="${board.TOADDR1}" readonly>
	 					<input id="TOSI" name="TOSI" type="hidden" value="${board.TOSI}">
	 					<input id="TOGUN" type="hidden" name="TOGUN" value="${board.TOGUN}">
	 					<input id="TO_DORO_NM" type="hidden" name="TO_DORO_NM" value="${board.TO_DORO_NM}">
	 					<!--  //********** BEGIN_현진_20120215 -->
						<input id="TODONG" name="TODONG" type="hidden" value="${board.TODONG}"/>
						<!--   //********** END_현진_20120215 -->
	 					<br>
						산<input id="TOSAN" name="TOSAN" type="checkbox" style="vertical-align: middle;" onClick="Jumin_toaddr_Check();" onChange="Jumin_toaddr_Check();" onFocus="Jumin_toaddr_Check();" onKeyUp="Jumin_toaddr_Check();" <c:if test="${board.TOSAN == '1'}">checked</c:if>>
						<input id="TOBON" name="TOBON" type="text" class="essential" style="width:25px" onClick="Jumin_toaddr_Check();" onChange="Jumin_toaddr_Check();" onFocus="Jumin_toaddr_Check();" onKeyUp="Jumin_toaddr_Check();" value="${board.TOBON}">
						-
						<input id="TOBU" name="TOBU" type="text" class="input_form1" style="width:25px" onClick="Jumin_toaddr_Check();" onChange="Jumin_toaddr_Check();" onFocus="Jumin_toaddr_Check();" onKeyUp="Jumin_toaddr_Check();" value="${board.TOBU}" >
						<!--  //********** BEGIN_현진_20120216 -->
						<input id="TOADDR2" name="TOADDR2" type="text" class="input_form1" style="width:135px" onClick="Jumin_toaddr_Check();" onChange="Jumin_toaddr_Check();" onFocus="Jumin_toaddr_Check();" onKeyUp="Jumin_toaddr_Check();" value="${board.TOADDR2}"  maxlength="50">
						<!--   //********** END_현진_20120216 -->

					</td>
					<td align="center" bgcolor="e5eff8" class="sub_table_b">송달지 <br/>도로명 주소</td>
					<td bgcolor="eaeaea" class="table_bl_left">
						<!--  //********** BEGIN_현진_20120309 -->
						<!--  //********** BEGIN_KANG_20120424 -->
						<!-- <input id="TOADDR1_NEW" name="TOADDR1_NEW" type="text" value="${board.TOSI} ${board.TOGUN} ${board.TO_DORO_NM}" class="essential" style="width:250px" onClick="Jumin_toaddr_Check();" onChange="Jumin_toaddr_Check();" onFocus="Jumin_toaddr_Check();" onKeyUp="Jumin_toaddr_Check();"  readonly> -->
						<input id="TOADDR1_NEW" name="TOADDR1_NEW" type="text" <c:if test="${board.TO_DORO_NM != null && board.TO_DORO_NM != ''}">value="${board.TOSI} ${board.TOGUN} ${board.TO_DORO_NM}"</c:if> class="essential" style="width:250px" onClick="Jumin_toaddr_Check();" onChange="Jumin_toaddr_Check();" onFocus="Jumin_toaddr_Check();" onKeyUp="Jumin_toaddr_Check();"  readonly>
						<!--   //********** END_KANG_20120424 -->						
						<!--   //********** END_현진_20120309 -->
						<!--  //********** BEGIN_현진_20120215 -->
						<!--
							산<input id="TOSAN" name="TOSAN" type="checkbox" style="vertical-align: middle;" onClick="Jumin_toaddr_Check();" onChange="Jumin_toaddr_Check();" onFocus="Jumin_toaddr_Check();" onKeyUp="Jumin_toaddr_Check();" <c:if test="${board.TOSAN == '1'}">checked</c:if>>
						  -->
						<!--   //********** END_현진_20120215 -->
						<!--  //********** BEGIN_KANG_20120424 -->
						<!-- 
						<input id="TO_BD_BON" name="TO_BD_BON" type="text" VALUE="${board.TO_BD_BON}" class="essential" style="width:25px" onClick="Jumin_toaddr_Check();" onChange="Jumin_toaddr_Check();" onFocus="Jumin_toaddr_Check();" onKeyUp="Jumin_toaddr_Check();" >
						-
						<input id="TO_BD_BU" name="TO_BD_BU" type="text" VALUE="${board.TO_BD_BU}" class="input_form1" style="width:25px" onClick="Jumin_toaddr_Check();" onChange="Jumin_toaddr_Check();" onFocus="Jumin_toaddr_Check();" onKeyUp="Jumin_toaddr_Check();"  >
						<input id="TO_BD_NM" name="TO_BD_NM" type="text" VALUE="${board.TO_BD_NM}" class="input_form1" style="width:135px" onClick="Jumin_toaddr_Check();" onChange="Jumin_toaddr_Check();" onFocus="Jumin_toaddr_Check();" onKeyUp="Jumin_toaddr_Check();"  maxlength="50">
						<input id="TO_BD_DET_NM" name="TO_BD_DET_NM" type="text" VALUE="${board.TO_BD_DET_NM}" class="input_form1" style="width:214px" onClick="Jumin_toaddr_Check();" onChange="Jumin_toaddr_Check();" onFocus="Jumin_toaddr_Check();" onKeyUp="Jumin_toaddr_Check();"  maxlength="50">
						 -->
						<c:if test="${board.TO_DORO_NM != null && board.TO_DORO_NM != ''}">
						<input id="TO_BD_BON" name="TO_BD_BON" type="text" VALUE="${board.TO_BD_BON}" class="essential" style="width:25px" onClick="Jumin_toaddr_Check();" onChange="Jumin_toaddr_Check();" onFocus="Jumin_toaddr_Check();" onKeyUp="Jumin_toaddr_Check();" >
						-
						<input id="TO_BD_BU" name="TO_BD_BU" type="text" VALUE="${board.TO_BD_BU}" class="input_form1" style="width:25px" onClick="Jumin_toaddr_Check();" onChange="Jumin_toaddr_Check();" onFocus="Jumin_toaddr_Check();" onKeyUp="Jumin_toaddr_Check();"  >
						<input id="TO_BD_NM" name="TO_BD_NM" type="text" VALUE="${board.TO_BD_NM}" class="input_form1" style="width:135px" onClick="Jumin_toaddr_Check();" onChange="Jumin_toaddr_Check();" onFocus="Jumin_toaddr_Check();" onKeyUp="Jumin_toaddr_Check();"  maxlength="50">
						<input id="TO_BD_DET_NM" name="TO_BD_DET_NM" type="text" VALUE="${board.TO_BD_DET_NM}" class="input_form1" style="width:214px" onClick="Jumin_toaddr_Check();" onChange="Jumin_toaddr_Check();" onFocus="Jumin_toaddr_Check();" onKeyUp="Jumin_toaddr_Check();"  maxlength="50">
						</c:if>
						<c:if test="${board.TO_DORO_NM == null || board.TO_DORO_NM == ''}">
						<input id="TO_BD_BON" name="TO_BD_BON" type="text" VALUE="" class="essential" style="width:25px" onClick="Jumin_toaddr_Check();" onChange="Jumin_toaddr_Check();" onFocus="Jumin_toaddr_Check();" onKeyUp="Jumin_toaddr_Check();" >
						-
						<input id="TO_BD_BU" name="TO_BD_BU" type="text" VALUE="" class="input_form1" style="width:25px" onClick="Jumin_toaddr_Check();" onChange="Jumin_toaddr_Check();" onFocus="Jumin_toaddr_Check();" onKeyUp="Jumin_toaddr_Check();"  >
						<input id="TO_BD_NM" name="TO_BD_NM" type="text" VALUE="" class="input_form1" style="width:135px" onClick="Jumin_toaddr_Check();" onChange="Jumin_toaddr_Check();" onFocus="Jumin_toaddr_Check();" onKeyUp="Jumin_toaddr_Check();"  maxlength="50">
						<input id="TO_BD_DET_NM" name="TO_BD_DET_NM" type="text" VALUE="" class="input_form1" style="width:214px" onClick="Jumin_toaddr_Check();" onChange="Jumin_toaddr_Check();" onFocus="Jumin_toaddr_Check();" onKeyUp="Jumin_toaddr_Check();"  maxlength="50">
						</c:if>
						<!--   //********** END_KANG_20120424 -->
						
					</td>
				  </tr>
				  <tr>
					<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">e-mail</td>
					<td bgcolor="eaeaea" class="table_bl_left" colspan="3">
						<input id="TOMAIL" name="TOMAIL" type="text" class="input_form1" style="width:250px" onchange="Jumin_toaddr_Check();" onFocus="Jumin_toaddr_Check();"  onkeyup="Jumin_toaddr_Check();" maxlength="50" value="${board.TOMAIL}" style="ime-mode:disabled">
					</td>
				  </tr>
				  <tr>
					<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">전화번호</td>
					<td bgcolor="eaeaea" class="table_bl_left">
					
						<input id="TOTEL1" name="TOTEL1" value="${board.TOTEL1}" type="text" class="input_form1" style="width:25px" style="ime-mode:disabled" onKeyPress="nr_num_int(this),Jumin_toaddr_Check()" onKeyUp="count_check(this, TOTEL2, 3),Jumin_toaddr_Check()" maxlength="3"> - 
						<input id="TOTEL2" name="TOTEL2" value="${board.TOTEL2}" type="text" class="input_form1" style="width:30px" style="ime-mode:disabled" onKeyPress="nr_num_int(this),Jumin_toaddr_Check()" onKeyUp="count_check(this, TOTEL3, 4),Jumin_toaddr_Check()" maxlength="4"> - 
						<input id="TOTEL3" name="TOTEL3" value="${board.TOTEL3}" type="text" class="input_form1" style="width:30px" style="ime-mode:disabled" onKeyPress="nr_num_int(this),Jumin_toaddr_Check()" onKeyUp="count_check(this, TOHP1, 4),Jumin_toaddr_Check()" maxlength="4">
				
				
				
				
					</td>
					<td align="center" bgcolor="e5eff8" class="sub_table_b">휴대전화</td>
					<td bgcolor="eaeaea" class="table_bl_left">
					
						<input id="TOHP1" name="TOHP1" value="${board.TOHP1}" type="text" class="input_form1" style="width:25px" style="ime-mode:disabled" onKeyPress="nr_num_int(this),Jumin_toaddr_Check()" onKeyUp="count_check(this, TOHP2, 3),Jumin_toaddr_Check()" maxlength="3"> - 
						<input id="TOHP2" name="TOHP2" value="${board.TOHP2}" type="text" class="input_form1" style="width:30px" style="ime-mode:disabled" onKeyPress="nr_num_int(this),Jumin_toaddr_Check()" onKeyUp="count_check(this, TOHP3, 4),Jumin_toaddr_Check()" maxlength="4"> - 
						<input id="TOHP3" name="TOHP3" value="${board.TOHP3}" type="text" class="input_form1" style="width:30px" style="ime-mode:disabled" onKeyPress="nr_num_int(this),Jumin_toaddr_Check()" onKeyUp="nr_num_int(this),Jumin_toaddr_Check()" maxlength="4">
					
						
					
					
					</td>
				  </tr>
			  </table></td>
			</tr>
			
			<tr>
			  	<td height="40" align="right">
			  		<img src="/img/can_icon.gif" alt="취소" width="56" height="18" border="0" onclick="javascript:Cancel()" style="cursor: pointer;">
			  		<img src="/img/save_icon2.gif" alt="저장" width="56" height="18" border="0" onclick="javascript:ModifyPrc()" style="cursor: pointer;">
				</td>
			</tr>
		</table></td>
	</tr>

</table>
</body>
</html>