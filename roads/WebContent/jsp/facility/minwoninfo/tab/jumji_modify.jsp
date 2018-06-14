<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ include file="/jsp/common/loginCheck.jsp" %>

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

<script type="text/javascript">
//<![CDATA[

	function	ModifyPrc()
	{
		var	result	= DataCheck();

		if(result	==	false)
			return;
		
		var form = document.form;
		
		form.PURPOSE_CD.value	= IFRM_PurposeCode.document.getElementById("PURPOSE_CD").value;

		form.action = "/facility/minwoninfo/jumji_modify_prc.do";
		form.submit();
	}

	function	Cancel()
	{
		var form = document.form;

		form.action = "/facility/minwoninfo/jumji_view.do";
		form.submit();
	}

	function	Init_UseType(sel)
	{
		document.getElementById("UseType1").style.display = "none";
		document.getElementById("UseType2").style.display = "none";

		if(sel == '2' || sel == '3')	
		{
			document.getElementById("USERTYPENAME").value		= "하천/구거명";
			document.getElementById("UseType2").style.display 	= "block";	//	하천, 구거
		}
		else
		{	
			document.getElementById("USERTYPENAME").value		= "주차면수";					
			document.getElementById("UseType1").style.display 	= "block";	//	도로
		}
	}

	function	Init_UseSection(sel)
	{
		if(sel == '2')
			document.getElementById("UseSection").style.display = "block";	//	정기
		else
			document.getElementById("UseSection").style.display = "none";
	}

	function	Select_UseType(sel)
	{
		document.getElementById("UseType1").style.display = "none";
		document.getElementById("UseType2").style.display = "none";
		
		if(sel.value == '2' || sel.value == '3')	
		{
			document.getElementById("USERTYPENAME").value		= "하천/구거명";
			document.getElementById("UseType2").style.display 	= "block";	//	하천, 구거
		}
		else
		{	
			document.getElementById("USERTYPENAME").value		= "주차면수";					
			document.getElementById("UseType1").style.display 	= "block";	//	도로
		}

		document.getElementById("IFRM_PurposeCode").src="/jsp/common/purposeCode/purposeCode.jsp?SectionCode=" + sel.value + "&essential=1";
	}

	function	Select_UseSection(sel)
	{
		if(sel.value == '2')
			document.getElementById("UseSection").style.display = "block";	//	정기
		else
			document.getElementById("UseSection").style.display = "none";

		parent.iFrameResizeTab("tab");
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

	function 	Init()
	{
		parent.Tab_Img("jumji");

	//	IFRM_PurposeCode.PURPOSE_CD.className	= "essential";
	}

	function	DataCheck()
	{
		var form 	= document.form;
		var	str		= "";
		
		//	점용지 정보
		if(form.TYPE.value.length	< 1)
			str	+= "점용 종류를 입력하세요\n";
		else if(form.SECTION.value.length	< 1)
			str	+= "점용 구분을 입력하세요\n";
		else if(form.OWNER_SET.value.length	< 1)
			str	+= "소유자 구분을 입력하세요\n";
		else if(form.TAX_SET.value.length	< 1)
			str	+= "세입 구분을 입력하세요\n";
		else if(form.BJ_CD.value.length	< 1)
			str	+= "점용지 법정동을 입력하세요.\n";
		else if(form.HJ_CD.value.length	< 1)
			str	+= "점용지 행정동을 입력하세요\n";
		else if(form.SAN_CK.value.length	< 1)
			str	+= "점용지 번지선택을 입력하세요\n";
		else if(form.BONBUN.value.length	< 1)
			str	+= "점용지 본번을 입력하세요\n";
		else if(form.MUL_POST.value.length	< 1)
			str	+= "우편번호를 입력하세요\n";
		else if(IFRM_PurposeCode.PURPOSE_CD.value < 110)
			str	+= "점용목적을 입력하세요\n";
		else if(form.MUL_FROMDATE.value.length	< 1	||	form.MUL_TODATE.value.length	< 1)
			str	+= "점용기간을 입력하세요\n";
		else if(form.SECTION.value	== 2)
		{
			if(form.PARTLY_PERIOD.value.length	< 1	||	form.TOTAL_PERIOD.value.length	< 1)
				str	+= "점용기간 일시점용을 입력하세요\n";
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

<body onload="Init(); Init_UseType('${board.TYPE}'); Init_UseSection('${board.SECTION}');">
<table width="780" border="0" cellpadding="0" cellspacing="0">
<form name="form" method="post">
<input type="hidden" name="ADMIN_NO" value="${ADMIN_NO}">
<input type="hidden" name="PURPOSE_CD" value="${board.PURPOSE_CD}">

	<tr>
		<td align="left" class="contborder_purple">
		<table width="100%" border="0" cellspacing="0" cellpadding="0">
		  <tr>
			<td><table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
				<tr>
				  <td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">점용종류</td>
				  <td width="37%" bgcolor="eaeaea" class="table_bl_left"><select name="TYPE" class="essential" style="width:70px" OnChange="Select_UseType(this);">
					${use_type}
			      </select></td>
				  <td width="100" align="center" bgcolor="e5eff8" class="sub_table_b">점용구분</td>
				  <td width="36%" bgcolor="eaeaea" class="table_bl_left"><select name="SECTION" class="essential" style="width:70px" OnChange="Select_UseSection(this);">
					${occupancy_type}
				  </select></td>
				</tr>
				<tr>
				  <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">소유자</td>
				  <td bgcolor="eaeaea" class="table_bl_left"><select name="OWNER_SET" class="essential" style="width:70px">
					${use_owner_Group}
				  </select></td>
				  <td align="center" bgcolor="e5eff8" class="sub_table_b">세입구분</td>
				  <td bgcolor="eaeaea" class="table_bl_left"><select name="TAX_SET" class="essential" style="width:70px">
					${taxation_section}
				  </select></td>
				</tr>
				
				<tr>
				  <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">점용지 지번<br>(공시지가<br> &nbsp;적용지번)  </td>
				  <td colspan="3" bgcolor="eaeaea" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
					<tr>
					  <td>${board.SIGUNGU}&nbsp;&nbsp;</td>
                         <td width="72"><select name="BJ_CD" class="essential" style="width:80px">
                           ${bjdong_code}
                         </select></td>  
                         <td>&nbsp;<select name="HJ_CD" class="essential" style="width:95px">
                           ${hjdong_code}
                         </select></td>
                         <td>&nbsp;/&nbsp;<select name="SAN_CK" class="essential" style="width:75px">
                           ${mul_spc_cd}
                         </select></td>
					  <td>&nbsp;<input name="BONBUN" value="${board.BONBUN}" type="text" class="essential" style="width:40px" style="ime-mode:disabled" onKeyDown="nr_num_int(this);" onKeyUp="nr_num_int(this);" onKeyPress="nr_num_int(this);" maxlength="4">
						- <input name="BUBUN" value="${board.BUBUN}" type="text" class="input_form1" style="width:40px" style="ime-mode:disabled" onKeyDown="nr_num_int(this);" onKeyUp="nr_num_int(this);" onKeyPress="nr_num_int(this);" maxlength="4">
						번지 <input name="TONG" value="${board.TONG}" type="text" class="input_form1" style="width:30px" style="ime-mode:disabled" onKeyDown="nr_num_int(this);" onKeyUp="nr_num_int(this);" onKeyPress="nr_num_int(this);" maxlength="2">
						통 <input name="BAN" value="${board.BAN}" type="text" class="input_form1" style="width:30px" style="ime-mode:disabled" onKeyDown="nr_num_int(this);" onKeyUp="nr_num_int(this);" onKeyPress="nr_num_int(this);" maxlength="2"> 
						반 </td>
					  </tr>
				  </table></td>
				</tr>
				
				<tr>
				  <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">우편번호</td>
				  <td bgcolor="eaeaea" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
					<tr>
					  <td><input name="MUL_POST" type="text" class="essential" style="width:50px" value="${board.MUL_POST}" readonly></td>
					  <td><a href="javascript:openZipcodePopup('form.MUL_POST', '');"><img src="/img/search_icon.gif" alt="검색" width="56" height="18" border="0"></a></td>
					</tr>
				  </table></td>
				  <td align="center" bgcolor="e5eff8" class="sub_table_b">건물(명) 정보 </td>
				  <td bgcolor="eaeaea" class="table_bl_left"><input name="BD_NM" type="text" class="input_form1" style="width:120px" value="${board.BD_NM}">
					<input name="BD_DONG" type="text" class="input_form1" style="width:30px" value="${board.BD_DONG}" style="ime-mode:disabled" onKeyDown="nr_num_int(this);" onKeyUp="nr_num_int(this);" onKeyPress="nr_num_int(this);">
					동 <input name="BD_HO" type="text" class="input_form1" style="width:30px" value="${board.BD_HO}" style="ime-mode:disabled" onKeyDown="nr_num_int(this);" onKeyUp="nr_num_int(this);" onKeyPress="nr_num_int(this);">
					호 </td>
				</tr>
				
                <tr>
                  <td align="center" bgcolor="e5eff8" class="sub_table_b">도로 주소</td>
                  <td bgcolor="eaeaea" class="table_bl_left"><input name="ROAD_ADD" type="text" class="input_form1" style="width:140px" value="${board.ROAD_ADD}" maxlength="12"></td>
       			  
				  <td width="100" height="26" align="center" bgcolor="e5eff8" class="">
				  	<input name="USERTYPENAME" type="text" style="width:95px" class="viewcol" value="주차면수">
				  </td>
				  	                      			  
       			  <td colspan="0" bgcolor="F6F6F6" class="table_bl_left">
	       			  <span id="UseType1" style="display:none">
		                  <table width="100%" border="0">
		                  	<input name="PARKING_NUM" type="text" class="input_form1" style="width:40px" value="${board.PARKING_NUM}" style="ime-mode:disabled" onKeyDown="nr_num_int(this);" onKeyUp="nr_num_int(this);" onKeyPress="nr_num_int(this);"> 면
		                  </table>
	                  </span> 
	       			  <span id="UseType2" style="display:none">
		                  <table width="100%" border="0" cellpadding="0" cellspacing="0" class="sub_stan"> 
		                  	<input name="RIVER_NM" type="text" class="input_form1" style="width:100px" value="${board.RIVER_NM}">
		                  </table>
	                  </span>   
                  </td>
                </tr>
                
				<tr>
				  <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">점용목적</td>
				  <td colspan="3" bgcolor="eaeaea" ><table width="100%" border="0" cellpadding="0" cellspacing="0">
					<iframe id="IFRM_PurposeCode" scrolling="no" frameborder="0" framespacing="0" width="100%" height="25" src="/jsp/common/purposeCode/purposeCode.jsp?SectionCode=${board.TYPE}&PURPOSE_CD=${board.PURPOSE_CD}&essential=1"></iframe>
				  </table></td>
			    </tr>			    
			    
				<tr>
				  <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">점용기간</td>
				  <td colspan="3" bgcolor="eaeaea" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
					<tr>
					<td>
					  <input name="MUL_FROMDATE" type="text" class="essential" style="width:70px" value="${board.MUL_FROMDATE}" readonly><a><img src="/img/calendar_icon.gif" width="19" height="16" border="0" align="absmiddle" onclick="popUpCalendar(this, MUL_FROMDATE, 'yyyymmdd')" style="CURSOR: Hand;"></a>
					   ~ <input name="MUL_TODATE" type="text" class="essential" style="width:70px" value="${board.MUL_TODATE}" readonly><a><img src="/img/calendar_icon.gif" width="19" height="16" border="0" align="absmiddle" onclick="popUpCalendar(this, MUL_TODATE, 'yyyymmdd')" style="CURSOR: Hand;"></a></tr>
					</td>
					
	                <tr style="display:none" id="UseSection">
					  <td>일시점용<input name="PARTLY_PERIOD" type="text" class="essential" style="width:300px" value="${board.PARTLY_PERIOD}">
					  &nbsp;&nbsp;총<input name="TOTAL_PERIOD" type="text" class="essential" style="width:30px" value="${board.TOTAL_PERIOD}" style="ime-mode:disabled" onKeyDown="nr_num_int(this);" onKeyUp="nr_num_int(this);" onKeyPress="nr_num_int(this);">일</td>
					</tr>
				  </table></td>
				</tr>
		
			    <tr>
				  <td height="34" colspan="4" align="left" bgcolor="#FFFFFF" class=""><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
					<tr>
					  <td><span class="sub_stan_blue">* 인접지 정보</span></td>
					</tr>
				  </table></td>
			    </tr>
			    
			    <tr>
				  <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">우편번호</td>
				  <td colspan="3" bgcolor="eaeaea" class="table_bl_left">
				  <table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
					  <tr>
						<td><input name="WITH_POST" value="${board.WITH_POST}" type="text" class="input_form1" style="width:50px" readonly></td>
						<td><a href="javascript:openZipcodePopup('form.WITH_POST', 'form.WITH_ADDR1');"><img src="/img/search_icon.gif" alt="검색" width="56" height="18" border="0"></a></td>
					  </tr>
				  </table></td>
			    </tr>
			    
				<tr>
				  <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">주소</td>
				  <td colspan="3" bgcolor="eaeaea" class="table_bl_left"><table width="100%" border="0" cellpadding="0" cellspacing="0" class="sub_stan">
					 <input name="WITH_ADDR1" type="text" class="input_form1" style="width:200px" value="${board.WITH_ADDR1}" readonly>
					 <input name="WITH_ADDR2" type="text" class="input_form1" style="width:350px" value="${board.WITH_ADDR2}">
				  </table></td>
				</tr>
				
			    <tr>
				  <td height="34" colspan="4" align="left" bgcolor="#FFFFFF" class=""><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
					<tr>
					  <td><span class="sub_stan_blue">* 공사(굴착) 정보</span></td>
					</tr>
				  </table></td>
			    </tr>
			    
			    <tr>
				  <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">공사기간 </td>
				  <td colspan="3" bgcolor="eaeaea" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
					<tr>
					  <td><input name="WORK_FROMDATE" value="${board.WORK_FROMDATE}" type="text" class="input_form1" style="width:65px" readonly></td>
					  <td><a><img src="/img/calendar_icon.gif" width="19" height="16" border="0" onclick="popUpCalendar(this, WORK_FROMDATE, 'yyyymmdd')" style="CURSOR: Hand;"></a></td>
					  <td width="16" align="center">~</td>
					  <td><input name="WORK_TODATE" value="${board.WORK_TODATE}" type="text" class="input_form1" style="width:65px" readonly></td>
					  <td><a><img src="/img/calendar_icon.gif" width="19" height="16" border="0" onclick="popUpCalendar(this, WORK_TODATE, 'yyyymmdd')" style="CURSOR: Hand;"></a></td>
					</tr>
				  </table></td>
			    </tr>
			    
				<tr>
				  <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">공사내용</td>
					<td colspan="3" bgcolor="eaeaea" class="table_bl_left"><table width="100%" border="0" cellpadding="0" cellspacing="0" class="sub_stan">
						<input name="EXE_INFO" type="text" class="input_form1" style="width:98%" value="${board.EXE_INFO}">
					</table></td>
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
