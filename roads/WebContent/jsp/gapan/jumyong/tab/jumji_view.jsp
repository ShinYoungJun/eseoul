<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
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
}
-->

</style>
<link href="/css/roads.css" rel="stylesheet" type="text/css">
</head>

<script language="javascript" src="/js/PopupCalendar.js"></script>
<script type="text/javascript">
//<![CDATA[

	function	Init_SANCheck(san)
	{
		if(san	== '1')	//	산 체크
			document.getElementById("SAN_CK").checked	= true;
		else
			document.getElementById("SAN_CK").checked	= false;
	}

	function	Init_UseType(sel)
	{
		document.getElementById("UseType1").style.display = "none";
		document.getElementById("UseType2").style.display = "none";
		
		if(sel == '2' || sel == '3')
			document.getElementById("UseType2").style.display = "block";	//	하천, 구거
		else
			document.getElementById("UseType1").style.display = "block";	//	도로
	}

	function	Init_UseSection(sel)
	{
		if(sel == '1')
		{
			document.getElementById("UseSection").style.display = "block";	//	정기
			document.getElementById("UseSection1").style.display = "block";	//	정기
		}
		else
		{
			document.getElementById("UseSection").style.display = "none";
			document.getElementById("UseSection1").style.display = "none";
		}
	}	

	function 	InitPage()
	{
		parent.TabUp_Img("jumji");		
		 Init_UseType('${place.TYPE}');
		 Init_UseSection('${place.SECTION}');
		 Init_SANCheck('${place.SAN_CK}');
		 
		 
		if(document.getElementById("mode").value == "edit" )
		{
			document.getElementById("view").style.display = "none";
			document.getElementById("edit").style.display= "block";			
		}else
		{
			document.getElementById("edit").style.display = "none";
			document.getElementById("view").style.display = "block";
		}
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
	
	
	
	function goModify()
	{
		var admin_no = document.getElementById("ADMIN_NO").value;
		location.href = "/jumyong/jumyong/jumji.do?ADMIN_NO="+admin_no
		+"&mode=edit";
	}
	
	function submitClick()
	{
		var jumjiForm = document.form;
		
		var iFrm = document.getElementById("IFRM_PurposeCode");
		var purpose = iFrm.contentWindow.document.getElementById("PURPOSE_CD").value;
		
		document.getElementById("PURPOSE_CD").value = purpose;
		
		jumjiForm.submit();
	}
	
	
//]]>
</script>

<body onload="InitPage();">

<form name="form" method="post">

<input name="ADMIN_NO" value="${ADMIN_NO}" type="text" >
<input name="mode"  id = "mode" value="${mode}" type="text" >
<spring:bind path="place.PURPOSE_CD">
<input name="PURPOSE_CD"  id = "PURPOSE_CD" type="hidden" >
</spring:bind>

<div id="view" >
<table width="780" border="0" cellpadding="0" cellspacing="0">
	<tr>
		<td align="left" class="contborder_purple">
		<table width="100%" border="0" cellspacing="0" cellpadding="0">
		  <tr>
			<td><table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
				<tr>
				  <td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">점용종류</td>
				  <td width="37%" bgcolor="eaeaea" class="table_bl_left">${use_type}</td>
				  <td width="100" align="center" bgcolor="e5eff8" class="sub_table_b">점용구분</td>
				  <td bgcolor="eaeaea" class="table_bl_left">${occupancy_type}</td>
				</tr>
				<tr>
				  <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">소유자</td>
				  <td bgcolor="eaeaea" class="table_bl_left">${use_owner_Group}</td>
				  <td align="center" bgcolor="e5eff8" class="sub_table_b">세입구분</td>
				  <td bgcolor="eaeaea" class="table_bl_left">${taxation_section}</td>
				</tr>
				<tr>
				  <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">점용지 지번<br>(공시지가<br> &nbsp;적용지번)  </td>
				  <td colspan="3" bgcolor="eaeaea" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
					<tr>
					  <td>${SIGUNGU}&nbsp;&nbsp;</td>
					  <td width="72"><input name="BJ_CD_VIEW" type="text" class="view" style="width:64px" value="${bjdong_code}" readonly></td>
					  <td><input name="HJ_CD_VIEW" type="text" class="view" style="width:84px" value="${hjdong_code}" readonly></td>
					  <td width="20" align="right">산</td>
					  <td width="30"><input name="SAN_CK_VIEW" type="checkbox" value="${place.SAN_CK}" disabled></td>
					  <td>${place.BONBUN} - ${place.BUBUN}번지 ${place.TONG}통 ${place.BAN}반 </td>
					  </tr>
				  </table></td>
				  </tr>
				<tr>
				  <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">우편번호</td>
				  <td bgcolor="eaeaea" class="table_bl_left">${place.MUL_POST}</td>
				  <td align="center" bgcolor="e5eff8" class="sub_table_b">건물(명) 정보 </td>
				  <td bgcolor="eaeaea" class="table_bl_left"><input name="BD_NM_VIEW" type="text" class="view" style="width:120px" value="${place.BD_NM}" readonly>
					${place.BD_DONG}동${place.BD_HO}	호 </td>
				</tr>
				
				<tr style="display:block" id="UseType1">
				  <td align="center" bgcolor="e5eff8" class="sub_table_b">도로 주소 </td>
				  <td bgcolor="eaeaea" class="table_bl_left"><input name="textfield222272322" type="text" class="view" style="width:100px" value="${place.SAN_CK}" readonly>
					<input name="textfield2222722242" type="text" class="view" style="width:40px" value="${place.SAN_CK}" readonly>
					- <input name="textfield22227222232" type="text" class="view" style="width:40px" value="${place.SAN_CK}" readonly></td>
				  <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">주차면수</td>
				  <td bgcolor="eaeaea" class="table_bl_left">${place.PARKING_NUM}</td>
				</tr>
				
				<tr style="display:block" id="UseType2">
				  <td align="center" bgcolor="e5eff8" class="sub_table_b">도로명 주소 </td>
				  <td bgcolor="eaeaea" class="table_bl_left"><input name="textfield222272322" type="text" class="view" style="width:100px" value="${place.TYPE}" readonly>
					<input name="textfield2222722242" type="text" class="view" style="width:40px" value="${place.TYPE}" readonly>
					- <input name="textfield22227222232" type="text" class="view" style="width:40px" value="${place.TYPE}" readonly></td>
				  <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">하전/구거명</td>
				  <td bgcolor="eaeaea" class="table_bl_left">${place.RIVER_NM}</td>
				</tr>
			
				<tr>
				  <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">점용목적</td>
				  <td colspan="3" bgcolor="eaeaea" class="table_bl_left"><table width="100%" border="0" cellpadding="0" cellspacing="0" class="sub_stan">
					<iframe id="IFRM_PurposeCode" align="absmiddle" scrolling="no" frameborder="0" framespacing="0" width="100%" height="22" src="/jsp/common/purposeCode/purposeCode_view.jsp?SectionCode=${place.TYPE}&PURPOSE_CD=${place.PURPOSE_CD}"></iframe>
				  </table></td>
			    </tr>
			    
				<tr>
				  <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">점용기간</td>
				  <td colspan="3" bgcolor="eaeaea" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
					<tr>
					<td>
					  ${place.MUL_FROMDATE} ~ ${place.MUL_TODATE}
					</td>
					</tr>
					
	                <tr style="display:none" id="UseSection">
					  <td>일시점용${place.PARTLY_PERIOD}
					  &nbsp;&nbsp;총${place.TOTAL_PERIOD}일</td>
					</tr>
				  </table></td>
				</tr>

			    <tr>
				  <td height="34" colspan="4" align="left" bgcolor="#FFFFFF" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
					<tr>
					  <td><span class="sub_stan_blue">* 인접지 정보</span></td>
					</tr>
				  </table></td>
			    </tr>
			    <tr>
				  <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">우편번호</td>
				  <td colspan="3" bgcolor="eaeaea" class="table_bl_left">${place.WITH_POST}</td>
			    </tr>
				<tr>
				  <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">주소</td>
				  <td colspan="3" bgcolor="eaeaea" class="table_bl_left">${place.WITH_ADDR1} - ${place.WITH_ADDR2}</td>
				</tr>
				
			    <tr>
				  <td height="34" colspan="4" align="left" bgcolor="#FFFFFF" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
					<tr>
					  <td><span class="sub_stan_blue">* 공사(굴착) 정보</span></td>
					</tr>
				  </table></td>
			    </tr>
			    
			    <tr>
				  <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">공사기간 </td>
				  <td colspan="3" bgcolor="eaeaea" class="table_bl_left">${place.WORK_FROMDATE} ~ ${place.WORK_TODATE}</td>
			    </tr>
			    
				<tr>
				  <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">공사내용</td>
				  <td colspan="3" bgcolor="eaeaea" class="table_bl_left">${place.EXE_INFO}</td>
			    </tr>
				
			</table></td>
		  </tr>
		  
		  <tr>
			<td height="40" align="right">
			<table width="0" border="0" cellspacing="0" cellpadding="0" align="right">
			<tr>
				<td height="40" align="right">
				
				<img src="/img/mod_icon.gif" alt="수정" border="0" onclick="javascript:goModify()" style="cursor:pointer" >		
				
				</td>
				</tr>
				
				
			</table>
			</td>
		  </tr>

		</table></td>
	</tr>
</table>
</div>
<div id="edit" style="width:100%;display:none;">
<table width="780" border="0" cellpadding="0" cellspacing="0">
	<tr>
		<td align="left" class="contborder_purple">
            <table width="100%" border="0" cellspacing="0" cellpadding="0">
              <tr>
                <td><table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0" class="sub_table">

				<tr>
				  <td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">점용 종류</td>
				  <td width="37%" bgcolor="eaeaea" class="table_bl_left">
				  <spring:bind path="place.TYPE">
					  <select name="TYPE" class="essential" style="width:70px" OnChange="Select_UseType(this);">
						${use_type}
				      </select>
			      </spring:bind>
			      </td>
				  <td width="100" align="center" bgcolor="e5eff8" class="sub_table_b">점용 구분</td>
				  <td width="36%" bgcolor="eaeaea" class="table_bl_left">
  				<spring:bind path="place.SECTION">
					  <select name="SECTION" class="essential" style="width:70px" OnChange="Select_UseSection(this);">
						${occupancy_type}
					  </select>
				</spring:bind>
				</td>
				</tr>
				<tr>
				  <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">소유자 구분</td>				  
				  <td bgcolor="eaeaea" class="table_bl_left">
				  <spring:bind path="place.OWNER_SET">
					  <select name="OWNER_SET" class="essential" style="width:70px">
						${use_owner_Group}
					  </select>
				  </spring:bind>
				  </td>
				  <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">세입 구분</td>
				  <td bgcolor="eaeaea" class="table_bl_left">				  
				  <spring:bind path="place.TAX_SET">
					  <select name="TAX_SET" class="essential" style="width:70px">
						${taxation_section}
					  </select>
				</spring:bind>
				</td>
				</tr>
				
				<tr>
				  <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">점용지 지번 </td>
				  <td colspan="3" bgcolor="eaeaea" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
					<tr>
					  <td>${SIGUNGU}&nbsp;&nbsp;</td>
                         <td width="72">
                         <spring:bind path="place.BJ_CD">
                         <select name="BJ_CD" class="essential" style="width:100px">
                           ${bjdong_code}
                         </select>
                         </spring:bind>
                         </td>  
                         <td>&nbsp;
                         <spring:bind path="place.HJ_CD">
                         <select name="HJ_CD" class="essential" style="width:100px">
                           ${hjdong_code}
                         </select>
                         </spring:bind>
                         </td>
                         <td>&nbsp;/&nbsp;
                         <spring:bind path="place.SAN_CK">
                         <select name="SAN_CK" class="essential" style="width:75px">
                           ${mul_spc_cd}
                         </select>
                         </spring:bind>
                         </td>
					  <td>&nbsp;
					  <spring:bind path="place.BONBUN">
						  <input name="BONBUN" value="${place.BONBUN}" type="text" class="essential" style="width:40px" style="ime-mode:disabled" onKeyDown="nr_num_int(this);" onKeyUp="nr_num_int(this);" onKeyPress="nr_num_int(this);" maxlength="4">
					  </spring:bind>		- 
					  <spring:bind path="place.BUBUN">
						<input name="BUBUN" value="${place.BUBUN}" type="text" class="input_form1" style="width:40px" style="ime-mode:disabled" onKeyDown="nr_num_int(this);" onKeyUp="nr_num_int(this);" onKeyPress="nr_num_int(this);" maxlength="4">
					  </spring:bind>
						번지 
					  <spring:bind path="place.TONG">
						<input name="TONG" value="${place.TONG}" type="text" class="input_form1" style="width:30px" style="ime-mode:disabled" onKeyDown="nr_num_int(this);" onKeyUp="nr_num_int(this);" onKeyPress="nr_num_int(this);" maxlength="2">
					  </spring:bind>
						통 
					  <spring:bind path="place.BAN">
						<input name="BAN" value="${place.BAN}" type="text" class="input_form1" style="width:30px" style="ime-mode:disabled" onKeyDown="nr_num_int(this);" onKeyUp="nr_num_int(this);" onKeyPress="nr_num_int(this);" maxlength="2"> 
					  </spring:bind>
						반 </td>
					  </tr>
				  </table></td>
				</tr>
				
				<tr>
				  <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">우편번호</td>
				  <td bgcolor="eaeaea" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
					<tr>
					  <td>
					  <spring:bind path="place.MUL_POST">
						  <input name="MUL_POST" type="text" class="essential" style="width:50px" readonly value="${place.MUL_POST}">
					  </spring:bind>
					  </td>
					  <td><a href="javascript:openZipcodePopup('form.MUL_POST', '');"><img src="/img/search_icon.gif" alt="검색" width="56" height="18" border="0"></a></td>
					</tr>
				  </table></td>
				  <td align="center" bgcolor="e5eff8" class="sub_table_b">건물(명) 정보 </td>
				  <td bgcolor="eaeaea" class="table_bl_left">
				  <spring:bind path="place.BD_NM">
					  <input name="BD_NM" type="text" class="input_form1" value="${place.BD_NM}" style="width:120px">
				  </spring:bind>
				  <spring:bind path="place.BD_DONG">
					<input name="BD_DONG" type="text" class="input_form1" style="width:30px" value="${place.BD_DONG}" style="ime-mode:disabled" onKeyDown="nr_num_int(this);" onKeyUp="nr_num_int(this);" onKeyPress="nr_num_int(this);">
				  </spring:bind>
					동 
				  <spring:bind path="place.BD_HO">
					<input name="BD_HO" type="text" class="input_form1" style="width:30px" value="${place.BD_HO}" style="ime-mode:disabled" onKeyDown="nr_num_int(this);" onKeyUp="nr_num_int(this);" onKeyPress="nr_num_int(this);">
				  </spring:bind>
					호 </td>
				</tr>				
				
				
                <tr>
                  <td align="center" bgcolor="e5eff8" class="sub_table_b">도로명 주소</td>
                  <td bgcolor="eaeaea" class="table_bl_left">
                  

                  <input name="ROAD_ADD" type="text" class="input_form1" style="width:140px" value="${place.ROAD_ADD}" maxlength="12">

                  </td>
       			  
				  <td width="100" height="26" align="center" bgcolor="e5eff8" class="">

				  	<input name="USERTYPENAME" type="text" style="width:95px" class="viewcol" value="">

				  </td>                   			  
       			  <td colspan="0" bgcolor="F6F6F6" class="table_bl_left">
	       			  <span id="UseType1" style="display:none">
		                  <table width="100%" border="0">
			                <spring:bind path="place.PARKING_NUM">		                  
		    	              	<input name="PARKING_NUM" type="text" class="input_form1" style="width:40px" value="${place.PARKING_NUM}" style="ime-mode:disabled" onKeyDown="nr_num_int(this);" onKeyUp="nr_num_int(this);" onKeyPress="nr_num_int(this);">
		    	            </spring:bind>면
		                  </table>
	                  </span> 
	       			  <span id="UseType2" style="display:none">
		                  <table width="100%" border="0" cellpadding="0" cellspacing="0" class="sub_stan"> 
                          <spring:bind path="place.RIVER_NM">		                 
		                  	<input name="RIVER_NM" type="text" class="input_form1" style="width:100px" value="${place.RIVER_NM}">
		                  </spring:bind>
		                  </table>
	                  </span>   
                  </td>
                </tr>
                
                
                
                
                
                
			    
				<tr>
				  <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">점용목적</td>
				  <td colspan="3" bgcolor="F6F6F6" class=""><table width="100%" border="0" cellpadding="0" cellspacing="0" class="">
					<iframe id="IFRM_PurposeCode" align="absmiddle" scrolling="no" frameborder="0" framespacing="0" width="100%" height="25" src="/jsp/common/purposeCode/purposeCode.jsp?essential=1&SectionCode=${place.TYPE}&PURPOSE_CD=${place.PURPOSE_CD}"></iframe>

				  </table></td>
			    </tr>
					    
				<tr>
				  <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">점용기간</td>
				  <td colspan="3" bgcolor="eaeaea" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
					<tr>
					<td>
					<spring:bind path="place.MUL_FROMDATE">
					  <input name="MUL_FROMDATE" value = "${place.MUL_FROMDATE}" type="text" class="essential" style="width:65px" readonly>
				    </spring:bind>
					  <a><img src="/img/calendar_icon.gif" width="19" height="16" border="0" align="absmiddle" onclick="popUpCalendar(this, document.getElementById('MUL_FROMDATE'), 'yyyymmdd')" style="CURSOR: Hand;"></a>
					   ~ 
					<spring:bind path="place.MUL_TODATE">
					   <input name="MUL_TODATE" value = "${place.MUL_TODATE}" type="text" class="essential" style="width:65px" readonly>
					</spring:bind>
					   <a><img src="/img/calendar_icon.gif" width="19" height="16" border="0" align="absmiddle" onclick="popUpCalendar(this, document.getElementById('MUL_TODATE'), 'yyyymmdd')" style="CURSOR: Hand;"></a>
					</td>
					</tr>
	                <tr style="display:none" id="UseSection1">
	                
	                
	                
					  <td>일시점용
					  <spring:bind path="place.PARTLY_PERIOD">
						  <input name="PARTLY_PERIOD" type="text" class="essential" style="width:300px" value="${place.PARTLY_PERIOD}">
					  </spring:bind>
					  &nbsp;&nbsp;총
					  <spring:bind path="place.TOTAL_PERIOD">
						  <input name="TOTAL_PERIOD" type="text" class="essential" style="width:30px" value="${place.TOTAL_PERIOD}" style="ime-mode:disabled" onKeyDown="nr_num_int(this);" onKeyUp="nr_num_int(this);" onKeyPress="nr_num_int(this);">
					  </spring:bind>	  
						  일</td>
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
						<td>
						<spring:bind path="place.WITH_POST">
							<input name="WITH_POST" type="text" class="input_form1" style="width:50px" value="${place.WITH_POST}" readonly >
						</spring:bind>
						</td>
						<td><a href="javascript:openZipcodePopup('form.WITH_POST', 'form.WITH_ADDR1');"><img src="/img/search_icon.gif" alt="검색" width="56" height="18" border="0"></a></td>
					  </tr>
				  </table></td>
			    </tr>
				<tr>
				  <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">주소</td>
				  <td colspan="3" bgcolor="eaeaea" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
				  <spring:bind path="place.WITH_ADDR1">
					 <input name="WITH_ADDR1" type="text" class="input_form1" style="width:150px" value = "${place.WITH_ADDR1}" readonly>
				  </spring:bind>
				  <spring:bind path="place.WITH_ADDR2">
					 <input name="WITH_ADDR2" type="text" class="input_form1" style="width:350px"value = "${place.WITH_ADDR2}" >
				  </spring:bind>
					 
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
					  <td>
					  <spring:bind path="place.WORK_FROMDATE">
					  	<input name="WORK_FROMDATE" type="text" class="input_form1" style="width:65px" value="${place.WORK_FROMDATE}" readonly >
					  </spring:bind>
					  	</td>
					  <td><a><img src="/img/calendar_icon.gif" width="19" height="16" border="0" onclick="popUpCalendar(this, document.getElementById('WORK_FROMDATE'), 'yyyymmdd')" style="CURSOR: Hand;"></a></td>
					  <td width="16" align="center">~</td>
					  <td>
					  <spring:bind path="place.WORK_TODATE">
						  <input name="WORK_TODATE" type="text" class="input_form1" style="width:65px" value = "${place.WORK_TODATE}" readonly>
					  </spring:bind>
     				  </td>
					  <td><a><img src="/img/calendar_icon.gif" width="19" height="16" border="0" onclick="popUpCalendar(this, document.getElementById('WORK_TODATE'), 'yyyymmdd')" style="CURSOR: Hand;"></a></td>
					</tr>
				  </table></td>
			    </tr>
			    
				<tr>
				  <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">공사내용</td>
					<td colspan="3" bgcolor="eaeaea" class="table_bl_left"><table width="100%" border="0" cellpadding="0" cellspacing="0" class="sub_stan">
					<spring:bind path="place.EXE_INFO">
						<input name="EXE_INFO" type="text" class="input_form1" style="width:98%" value="${place.EXE_INFO}">
					</spring:bind>
					</table></td>
			    </tr>
                    
                </table></td>
              </tr>
              
			<tr>
			  <td height="40" align="right">
			  <table width="0" border="0" cellspacing="0" cellpadding="0" align="right">
				<img src="/img/can_icon.gif" alt="취소" border="0" onclick="javascript:history.back();" style="cursor:pointer" >
				<img src="/img/save_icon2.gif" alt="저장" width="56" height="18" border="0"
						                onClick="javascript:submitClick();"  style="cursor:pointer">
			  </table>
			  </td>
			</tr>
              
              
              
<!--
              <tr>
                <td height="32" align="right"><a href="#"><img src="../../../img/save_icon2.gif" alt="저장" width="56" height="18" border="0"></a></td>
              </tr>
-->
            </table>
</td>
	</tr>
</table>



</div>
</form>
</body>
</html>