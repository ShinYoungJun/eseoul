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
	background-image: url/img/left_back.gif);
}
-->
</style>
<link href="/css/roads.css" rel="stylesheet" type="text/css">
</head>

<script language="javascript" src="/js/PopupCalendar.js"></script>
<script language='JavaScript' src='/js/Check_inputbox.js'></script>
<script language="javascript" src="/js/Ajax_request.js"></script>
<script language="javascript" src="/jsp/facility/minwon/tab/info_register.js"></script>
<script language="javascript" src="/jsp/facility/minwon/tab/info_sisul_register.js"></script>


<script type="text/javascript">
//<![CDATA[

	var dept = [];

//	function	Init()
//	{		
//		parent.iFrameResizeTab("tab1");	
//		IFRM_PurposeCode.PURPOSE_CD.className	= "essential";
//	}
	
	function	Sisul_Click()
	{	
		if(document.getElementById("XMLDATA").value	== "")
		{
			Sisul_Init();
			Sisul_Init_UseType();
		}
	}
	
	//	심도
	function	Init_Depth()
	{
		<c:forEach items="${blist}" var="dept" varStatus="idx">
			dept[${idx.index}] = { depth: ${dept.DEPTH}, rate: ${dept.RATE}};
		</c:forEach>
	}

	function	Select_Depth()
	{
		var	num	= document.getElementById("DEPTH_CK").value;
		
		for(var i=0; i < dept.length ; i++)
		{
			if(num >= dept[i].depth)
			{
				document.getElementById("DEPTH_NUM").value	= dept[i].rate;
				return;
			}
		}
		
		if(num == "")
			document.getElementById("DEPTH_NUM").value	= "";
		else
			document.getElementById("DEPTH_NUM").value	= "0";
	}
	
	function selectTabMenu(){
	
		var tabs = document.getElementById('tabmenu');
		var tab = tabs.getElementsByTagName('a'); // 탭 요소	
		var contents = document.getElementById('tabcontents');
		var content = getElementsByClassName('tabcontent',contents); // 컨텐츠 요소 class
		var type = true; // 롤오버의 true / false		
		tabDisplay(tab,content,1,true);
		tabAct(tab,content,1,type);		
	}
	
	
	/*

	ajax 함수

	*/	
		function setSisul_addr1(){

	//	alert('실행'+document.getElementById('bj_cd').value );
		
			var param = "&bj_cd="+document.getElementById('bj_cd').value; 

			sendRequest("/facility/minwon/get_ajax_refdongname.do", param, "GET", ResultSisulAddr1);
		}

		function	ResultSisulAddr1(obj)
		{
			
			  var xmldoc = new ActiveXObject("Microsoft.XMLDOM");

			  xmldoc.async	= false;
			  
			  xmldoc.loadXML(obj);
			  
			  
			  
			  if(xmldoc.getElementsByTagName("SISUL_ADDR1").length >0 && xmldoc.getElementsByTagName("SISUL_ADDR1").item(0).firstChild != null)  document.getElementById("SISUL_ADDR1").value 	  = xmldoc.getElementsByTagName("SISUL_ADDR1").item(0).firstChild.nodeValue;			 		    
			  else document.getElementById("SISUL_ADDR1").value = "";  

		}
		
		/*

		시설 추가 함수

		*/	
		
		function	New_Sisul_Register()
		{
			

			
			var form = document.form;
			var	value;
			var	result	= Sisul_DataCheck();

			if(result	==	false)
				return;
			form.PURPOSE_CD.value	= IFRM_PurposeCode.document.getElementById("PURPOSE_CD").value;	
			value	= IFRM_PurposeCode.document.getElementById("PURPOSE1");
			form.PURPOSE1_NM.value	= value[value.selectedIndex].text;
			value	= IFRM_PurposeCode.document.getElementById("PURPOSE2");
			form.PURPOSE2_NM.value	= value[value.selectedIndex].text;
			value	= IFRM_PurposeCode.document.getElementById("PURPOSE3");
			form.PURPOSE3_NM.value	= value[value.selectedIndex].text;

			insertNode();	//	노드에 추가
			//Clear();
			makeList();
			
			var addr_fix = document.getElementById("addr_fix");
			var SISUL_POST = form.SISUL_POST.value;
			var SISUL_ADDR1 = form.SISUL_ADDR1.value;
			var SISUL_ADDR2 = form.SISUL_ADDR2.value;
			var BONBUN = form.BONBUN.value;
			var BUBUN = form.BUBUN.value;
		
			
			var innerHtml =	"<table border='0' cellpadding='0' cellspacing='0' class='sub_stan'>"; 
			innerHtml += "<tr>";
			innerHtml += "	<td><input name='SISUL_POST' id='SISUL_POST' type='text' class='essential' style='width:50px' onFocus='' value='"+SISUL_POST+"' readonly></td>";
			innerHtml += "	<td><a href='javascript:openZipcodePopup('form.SISUL_POST', '');'><img src='/img/search_icon.gif' alt='검색' width='56' height='18' border='0'></a></td>";
			innerHtml += "	<td bgcolor='eaeaea' class='table_bl_left'>";
				
			innerHtml += 	 	"${SIGUNGU}"+"&nbsp;";
	        
	        innerHtml += "    	<select id='BJ_CD' name='BJ_CD' class='essential' style='width:80px' >";
	        innerHtml +="	 ${bjdong_code}";
	        innerHtml += "      	</select>";
	        
	        innerHtml += "    &nbsp;";
	        innerHtml += "    	<select id='HJ_CD' name='HJ_CD' class='essential' style='width:80px' >";
	        innerHtml +="${hjdong_code}";
	        innerHtml += "    	</select>";
	        
		    innerHtml += "        &nbsp;/&nbsp;";
		    innerHtml += "        	<select id='SPC_CD' name='SPC_CD' class='essential' style='width:75px' >";
	        innerHtml +="${ mul_spc_cd}";
	        innerHtml += "    	</select>";
	        innerHtml += "    	&nbsp;";
	        innerHtml += "    	<input type='text' id='BONBUN'  name='BONBUN' class='essential' style='width:30px' maxlength='4' value='"+BONBUN+"'>";	        
	        innerHtml += "- <input type='text' id='BUBUN' name='BUBUN' class='essential' style='width:30px' maxlength='4'value='"+BUBUN+"'> &nbsp;번지";
	        
			innerHtml += "	</td> "; 
			innerHtml += "</tr>";
			innerHtml += "<tr>	";				
														
			innerHtml += "	<td colspan='3'><input name='SISUL_ADDR2' id='SISUL_ADDR2' type='text' class='essential' style='width:300px' onclick='javascript:setSisul_addr1();' value='"+SISUL_ADDR2+"'>";
			innerHtml += "	<input name='SISUL_ADDR1' id='SISUL_ADDR1' type='hidden' class='essential' style='width:200px' value='"+SISUL_ADDR1+"'>";
			innerHtml += "	</td>";
			innerHtml += "</tr>";
			innerHtml += "</table>";
		
			var hj_cd =  document.getElementById('HJ_CD').value;
			var bj_cd =  document.getElementById('BJ_CD').value;
			var spc_cd =  document.getElementById('SPC_CD').value;			
			
			addr_fix.innerHTML = innerHtml;
			
			document.getElementById('HJ_CD').value = hj_cd;
			 document.getElementById('BJ_CD').value = bj_cd;
			 document.getElementById('SPC_CD').value = spc_cd;
			
			parent.iFrameResizeTab("tab1");	//	화면 RESIZE
		}
	//Init();
	Init_Depth();

//]]>
</script>


<body>
<table width="800" border="0" cellpadding="0" cellspacing="0">
<form name="form" id="form" method="post">
<input type="hidden" name="UserType" id="UserType">
<input type="hidden" name="UserSection" id="UserSection">
<input type="hidden" name="PURPOSE_CD" id="PURPOSE_CD" value="${PURPOSE_CD}">
<input type="hidden" name="MIN_CHECK" id="MIN_CHECK" value="${MIN_CHECK}">
<input type="hidden" name="MIN_PROCESS" id="MIN_PROCESS" value="${MIN_PROCESS}">
<input type="hidden" name="GIGAN1" id="GIGAN1" value="${GIGAN1}">
<input type="hidden" name="GIGAN2" id="GIGAN2" value="${GIGAN2}">
<input type="hidden" name="MIN_NAME" id="MIN_NAME" value="${MIN_NAME}">
<input type="hidden" name="MIN_REQNO" id="MIN_REQNO" value="${MIN_REQNO}">
<input type="hidden" name="ADMIN_NO" id="ADMIN_NO" value="${ADMIN_NO}">
<input type="hidden" name="CORP_CD" id="CORP_CD"  value="${CORP_CD}">
<input type="hidden" name="GU_CODE" id="GU_CODE"  value="${GU_CODE}">
<input type="hidden" name="PURPOSE1_NM" id="PURPOSE1_NM">
<input type="hidden" name="PURPOSE2_NM" id="PURPOSE2_NM">
<input type="hidden" name="PURPOSE3_NM" id="PURPOSE3_NM">
<input type="hidden" name="TAX_SET_NM" id="TAX_SET_NM">
<input type="hidden" name="PURPOSESEBU_NM" id="PURPOSESEBU_NM">
<input type="hidden" name="XMLDATA" id="XMLDATA">
<input type="hidden" name="LISTSEQ" id="LISTSEQ" value="">

<tr>
	<td align="left"><table width="780" border="0" cellspacing="0" cellpadding="0">
   		<tr>
         	<td height="22" background="/img/tab_line_purple.gif"><table border="0" cellspacing="0" cellpadding="0">
			<tr>
				<ul id="tabmenu">
					<td width="111"><a><img src="/img/sub_petition_title9_on.gif" alt="민원정보" width="110" height="22" border="0" onclick="" style="CURSOR: Hand;"></a></td>
					<td width="111"><a><img src="/img/sub_petition_title2_off_b.gif" alt="점용인 정보" width="110" height="22" border="0" onclick="" style="CURSOR: Hand;"></a></td>
					<td width="111"><a><img src="/img/sub_facility_title3_off.gif" alt="시설물 정보" width="110" height="22" border="0" onclick="Sisul_Click();" style="CURSOR: Hand;"></a></td>
				</ul>
			</tr>
			</table>
			</td>
		</tr>
	
		<tr>
            <td align="left" class="contborder_purple">
	
		<div id="tabcontents">
		
			<div class="tabcontent">
				<table width="100%" border="0" cellspacing="0" cellpadding="0">
				
                <tr>
					<td><table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
				  	<tr>
						<td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">접수번호</td>
						<td width="37%" bgcolor="eaeaea" class="table_bl_left">
							<input name="REQ_NO_MIN" id="REQ_NO_MIN" type="text" class="input_form1" style="width:120px" onKeyPress="nr_num_int(this);" onKeyUp="nr_num_int(this);" maxlength="18">
						</td>
						<td width="100" align="center" bgcolor="e5eff8" class="sub_table_b">민원구분</td>
						<td bgcolor="eaeaea" class="table_bl_left"><input name="GUBUN_MIN" id="GUBUN_MIN" type="text" class="input_form1" style="width:120px"></td>
				  	</tr>
					
				  	<tr>
						<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">접수일자</td>
						<td bgcolor="eaeaea" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
					  	<tr>
							<td><input name="REQ_DATE_MIN" id="REQ_DATE_MIN" type="text" class="input_form1" style="width:120px" value="${REQ_DATE_MIN}" readonly></td>
							<td><a><img src="/img/calendar_icon.gif" width="19" height="16" border="0" onclick="popUpCalendar(this, REQ_DATE_MIN, 'yyyymmdd')" style="CURSOR: Hand;"></a></td>
					  	</tr>
						</table></td>
						<td align="center" bgcolor="e5eff8" class="sub_table_b">처리예정일자</td>
						<td bgcolor="eaeaea" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
					  	<tr>
							<td><input name="PREDATE_MIN" id="PREDATE_MIN" type="text" class="input_form1" style="width:120px" value="${PREDATE_MIN}" readonly></td>
							<td><a><img src="/img/calendar_icon.gif" width="19" height="16" border="0" onclick="popUpCalendar(this, PREDATE_MIN, 'yyyymmdd')" style="CURSOR: Hand;"></a></td>
					  	</tr>
						</table></td>
				  	</tr>
				  
				  	<tr>
						<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">접수부서</td>
						<td bgcolor="eaeaea" class="table_bl_left"><input name="REQ_DEP_MIN" id="REQ_DEP_MIN" type="text" class="input_form1" style="width:120px" value="${REQ_DEP_MIN}"></td>
						<td align="center" bgcolor="e5eff8" class="sub_table_b">담당부서</td>
						<td bgcolor="eaeaea" class="table_bl_left"><input name="MANAGE_DEP_MIN" id="MANAGE_DEP_MIN" type="text" class="input_form1" style="width:120px" value="${MANAGE_DEP_MIN}"></td>
				  	</tr>
					
					<tr>
						<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">접수자명</td>
						<td bgcolor="eaeaea" class="table_bl_left"><input name="REQ_NM_MIN" id="REQ_NM_MIN" type="text" class="input_form1" style="width:120px"></td>
						<td align="center" bgcolor="e5eff8" class="sub_table_b">담당자명</td>
						<td bgcolor="eaeaea" class="table_bl_left"><input name="MANAGER_MIN" id="MANAGER_MIN" type="text" class="input_form1" style="width:120px" value="${MANAGER_MIN}"></td>
					</tr>
					  
					<tr>
						<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">민원요지</td>
						<td colspan="3" bgcolor="eaeaea" class="table_bl_left"><table width="100%" border="0" cellpadding="0" cellspacing="0" class="sub_stan">
							<input name="NOTES_MIN" id="NOTES_MIN" type="text" class="input_form1" style="width:98%">
						</table></td>
					</tr>
					
					<tr>
						<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">대리인</td>
						<td bgcolor="eaeaea" class="table_bl_left"><input name="AGENT_NM_MIN" id="AGENT_NM_MIN" type="text" class="input_form1" style="width:120px"></td>
						<td align="center" bgcolor="e5eff8" class="sub_table_b">대리인 연락처</td>
						<td bgcolor="eaeaea" class="table_bl_left">
							<input name="min_agent_tel1" id="min_agent_tel1" type="text" class="input_form1" style="width:25px" style="ime-mode:disabled" onKeyPress="nr_num_int(this);" onKeyUp="nr_num_int(this); count_check(this, min_agent_tel2, 3);" maxlength="3"> - 
							<input name="min_agent_tel2" id="min_agent_tel2" type="text" class="input_form1" style="width:30px" style="ime-mode:disabled" onKeyPress="nr_num_int(this);" onKeyUp="nr_num_int(this); count_check(this, min_agent_tel3, 4);" maxlength="4"> - 
							<input name="min_agent_tel3" id="min_agent_tel3" type="text" class="input_form1" style="width:30px" style="ime-mode:disabled" onKeyPress="nr_num_int(this);" onKeyUp="nr_num_int(this); count_check(this, min_agent_tel3, 4);" maxlength="4">
						</td>
					</tr>
					<tr>
						<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">민원인명</td>
						<td bgcolor="eaeaea" class="table_bl_left"><input name="NAME_MIN" id="NAME_MIN" type="text" class="input_form1" style="width:120px"></td>
						<td align="center" bgcolor="e5eff8" class="sub_table_b">민원인 주민번호</td>
						<td bgcolor="eaeaea" class="table_bl_left">
							<input name="min_ssn1" id="min_ssn1" type="text" class="input_form1" style="width:40px; ime-mode:disabled" value="${min_ssn1}" onKeyPress="nr_num_int(this);" onKeyUp="nr_num_int(this); count_check(this, min_ssn2, 6);" maxlength="6">
							 - <input name="min_ssn2" id="min_ssn2" type="text" class="input_form1" style="width:45px; ime-mode:disabled" value="${min_ssn2}" onKeyPress="nr_num_int(this);" onKeyUp="nr_num_int(this);" maxlength="7"></td>
					</tr>
				  
				 	<tr>
						<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">민원인 우편번호</td>
						<td bgcolor="eaeaea" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
							<tr>
							  	<td><input name="POST_MIN" id="POST_MIN" type="text" class="input_form1" style="width:50px" value="${POST_MIN}" readonly></td>
							  	<td><img src="/img/search_icon.gif" alt="검색" width="56" height="18" border="0" onclick="javascript:openZipcodePopup('form.POST_MIN', 'form.ADDR1_MIN');" style="CURSOR:Hand"></td>
							</tr>
						</table></td>
						<td align="center" bgcolor="e5eff8" class="sub_table_b">민원인 주소</td>
						<td bgcolor="eaeaea" class="table_bl_left"><input name="ADDR1_MIN" id="ADDR1_MIN" type="text" class="input_form1" style="width:250px" value="${ADDR1_MIN}" readonly>
							<input name="ADDR2_MIN" id="ADDR2_MIN" type="text" class="input_form1" style="width:250px" value="${ADDR2_MIN}"></td>
				  	</tr>
				  
				  	<tr>
						<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">민원인 전화</td>
						<td bgcolor="eaeaea" class="table_bl_left">
							<input name="min_tel1" id="min_tel1" type="text" class="input_form1" style="width:25px" style="ime-mode:disabled" onKeyPress="nr_num_int(this);" onKeyUp="count_check(this, min_tel2, 3);" maxlength="3"> - 
							<input name="min_tel2" id="min_tel2" type="text" class="input_form1" style="width:30px" style="ime-mode:disabled" onKeyPress="nr_num_int(this);" onKeyUp="count_check(this, min_tel3, 4);" maxlength="4"> - 
							<input name="min_tel3" id="min_tel3" type="text" class="input_form1" style="width:30px" style="ime-mode:disabled" onKeyPress="nr_num_int(this);" onKeyUp="count_check(this, min_tel3, 4);" maxlength="4">
						</td>
						<td align="center" bgcolor="e5eff8" class="sub_table_b">민원인 휴대폰</td>
						<td bgcolor="eaeaea" class="table_bl_left">
							<input name="min_hp1" id="min_hp1" type="text" class="input_form1" style="width:25px" style="ime-mode:disabled" onKeyPress="nr_num_int(this);" onKeyUp="count_check(this, min_hp2, 3);" maxlength="3"> - 
							<input name="min_hp2" id="min_hp2" type="text" class="input_form1" style="width:30px" style="ime-mode:disabled" onKeyPress="nr_num_int(this);" onKeyUp="count_check(this, min_hp3, 4);" maxlength="4"> - 
							<input name="min_hp3" id="min_hp3" type="text" class="input_form1" style="width:30px" style="ime-mode:disabled" onKeyPress="nr_num_int(this);" onKeyUp="count_check(this, min_hp3, 4);" maxlength="4">
						</td>
				  	</tr>
				  
                  	</table></td>
                </tr>
				</table>
			</div>
		
			<div class="tabcontent" style="display:none">
				<table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
					<tr>
						<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">점용인(법인명)</td>
						<td width="37%" bgcolor="eaeaea" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
							<tr>
							  <!-- 
							  <td><input name="CORP_NM" type="text" class="essential" style="width:120px" readonly></td>
							  -->
							  <td width='130' align='left'><input name="NAME" id="NAME"  type="text" class="essential" style="width:120px" value=""  readonly></td>						
							</tr>
						</table></td>
						<td  height="26" align="center" bgcolor="e5eff8" class="sub_table_b">주민(법인)번호</td>
						<td bgcolor="eaeaea" class="table_bl_left"><input name="jumin_ssn1"  id="jumin_ssn1"  type="text" class="essential" style="width:40px; ime-mode:disabled" value=""  maxlength="6" readonly>
						  - <input name="jumin_ssn2"  id="jumin_ssn2"  type="text" class="essential" style="width:45px; ime-mode:disabled"  maxlength="7" value="" readonly>
						 </td>
				  	</tr>
				  	<tr>
						<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">대표자명</td>
						<!-- 
						<td bgcolor="eaeaea" class="table_bl_left"><input name="NAME" type="text" class="input_form1" style="width:120px" onFocus=""></td>				
						-->
						<td bgcolor="eaeaea" class="table_bl_left"><input name="TOPOST_NM"  id="TOPOST_NM"  type="text" class="input_form1" style="width:120px"  readonly></td>
						<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">사업자 등록번호</td>
						<td width="36%" bgcolor="eaeaea" class="table_bl_left">
							<input name="jumin_bizssn1"  id="jumin_bizssn1"  type="text" class="input_form1" value="" style="width:30px; ime-mode:disabled"  maxlength="3" readonly>
						  - <input name="jumin_bizssn2"  id="jumin_bizssn2" type="text" class="input_form1" value="" style="width:15px; ime-mode:disabled" maxlength="2" readonly>
						  - <input name="jumin_bizssn3"  id="jumin_bizssn3"  type="text" class="input_form1" value="" style="width:35px; ime-mode:disabled" maxlength="5" readonly>
						</td>
				  	</tr>
					<tr>
						<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">점용인 주소</td>
						<td bgcolor="eaeaea" class="table_bl_left">
							<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
								<tr>
								  <td><input name="BON_POST" id="BON_POST" type="text" class="essential" style="width:50px"  value="" readonly></td>
								  <td>&nbsp;&nbsp;&nbsp;</td>
								</tr>
							</table>
						</td>
						<td align="center" bgcolor="e5eff8" class="sub_table_b">주소</td>
						<td bgcolor="eaeaea" class="table_bl_left">
							<input name="BON_ADDR1"  id="BON_ADDR1"  type="text" class="essential" style="width:250px"  value="" readonly>
							<input name="BON_ADDR2"  id="BON_ADDR2"  type="text" class="essential" style="width:250px"  value="" readonly>
							<input name="JIBUN_MAIN" id="JIBUN_MAIN"  type="text" class="essential" style="width:50px;" maxlength="4"  readonly>&nbsp; - &nbsp; <input name="JIBUN_SUB" id="JIBUN_SUB" type="text" class="essential" style="width:50px" maxlength="4"  readonly> &nbsp;번지
							
						</td>
				  	</tr>

				  	<tr>
						<td align="center" bgcolor="e5eff8" class="sub_table_b">업태</td>
						<td bgcolor="eaeaea" class="table_bl_left"><input name="BIZ_STATUS"  id="BIZ_STATUS"  type="text" class="input_form1" style="width:120px" value="" readonly></td>
						<td align="center" bgcolor="e5eff8" class="sub_table_b">종목</td>
						<td bgcolor="eaeaea" class="table_bl_left"><input name="BIZ_TYPES"  id="BIZ_TYPES"  type="text" class="input_form1" style="width:120px" value="" readonly></td>				
				  	</tr>				
				  	<tr>
						<td height="34" colspan="4" align="left" bgcolor="#FFFFFF" class=""><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
							<tr>
							 	<td><span class="sub_stan_blue">* 우편물 송달지</span>  </td>
							  	<td width="16"></td>
							  	<td></td>
							</tr>
						</table></td>
				  	</tr>
					<tr>
						<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">송달지 주소</td>
						<td colspan="3" bgcolor="eaeaea" class="table_bl_left">
							<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
								<tr>
									<td><input name="TO_POST"  id="TO_POST" type="text" class="input_form1" style="width:50px"  readonly value=""></td>
									<td>&nbsp;&nbsp;&nbsp;</td>
									<td bgcolor="eaeaea" class="table_bl_left">
										<input name="TO_ADDR1"  id="TO_ADDR1"  type="text" class="input_form1" style="width:250px"  readonly value="">
										<input name="TO_ADDR2" id="TO_ADDR2"  type="text" class="input_form1" style="width:250px"  value="" readonly>
										<input name="TO_JIBUN_MAIN" id="TO_JIBUN_MAIN"  type="text" class="input_form1"  style="width:50px"   maxlength="4"   readonly>&nbsp; - &nbsp; <input name="TO_JIBUN_SUB" id="TO_JIBUN_SUB" type="text"  class="input_form1"  style="width:50px"  maxlength="4"  readonly>&nbsp;번지
									</td>  
								</tr>
							</table>
						</td>
					</tr>
					<tr>
						<td height="34" colspan="4" align="left" bgcolor="#FFFFFF" class=""><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
							<tr>
							  	<td><span class="sub_stan_blue">* 담당자 정보</span></td>
							</tr>
						</table></td>
					</tr>
					
					<tr>
						<td align="center" bgcolor="e5eff8" class="sub_table_b">지점명/담당자명</td>
						<td bgcolor="eaeaea" class="table_bl_left" height="25">
							<input name="OFFICE"  id="OFFICE"  type="text" class="input_form1" style="width:100px" value="" readonly>
							/ <input name="MANAGER"  id="MANAGER"  type="text" class="input_form1" style="width:130px" value="" readonly>
						</td>
						<td align="center" bgcolor="e5eff8" class="sub_table_b">전화번호</td>
						<td bgcolor="eaeaea" class="table_bl_left">
							<input name="jumin_tel1"  id="jumin_tel1"  type="text" class="input_form1" style="width:25px" style="ime-mode:disabled"  maxlength="3" value="" readonly> - 
							<input name="jumin_tel2"  id="jumin_tel2" type="text" class="input_form1" style="width:30px" style="ime-mode:disabled"  maxlength="4" value="" readonly> - 
							<input name="jumin_tel3"  id="jumin_tel3"  type="text" class="input_form1" style="width:30px" style="ime-mode:disabled"  maxlength="4" value="" readonly>
							&nbsp;&nbsp;(&nbsp;내선&nbsp;<input name="TEL_EXT"  id="TEL_EXT"  type="text" class="input_form1" style="width:30px" style="ime-mode:disabled"  maxlength="4" value="" readonly>&nbsp;)
						</td>
					</tr>
					
					<tr>
						<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">FAX</td>
						<td bgcolor="eaeaea" class="table_bl_left">
							<input name="jumin_fax1"  id="jumin_fax1"  type="text" class="input_form1" style="width:25px" style="ime-mode:disabled" maxlength="3" readonly> - 
							<input name="jumin_fax2"  id="jumin_fax2"  type="text" class="input_form1" style="width:30px" style="ime-mode:disabled"  maxlength="4" readonly> - 
							<input name="jumin_fax3"  id="jumin_fax3"  type="text" class="input_form1" style="width:30px" style="ime-mode:disabled"  maxlength="4" readonly>
						</td>
						<td align="center" bgcolor="e5eff8" class="sub_table_b">휴대전화</td>
						<td bgcolor="eaeaea" class="table_bl_left">
							<input name="jumin_hp1"  id="jumin_hp1"  type="text" class="input_form1" style="width:25px" style="ime-mode:disabled" maxlength="3" readonly> - 
							<input name="jumin_hp2"  id="jumin_hp2"  type="text" class="input_form1" style="width:30px" style="ime-mode:disabled" maxlength="4" readonly> - 
							<input name="jumin_hp3" id="jumin_hp3"  type="text" class="input_form1" style="width:30px" style="ime-mode:disabled"  maxlength="4" readonly>
						</td>
					</tr>
				  
                  	</table>
			</div>
			
			<div class="tabcontent" style="display:none">
				<table width="100%" border="0" cellspacing="0" cellpadding="0">
					<tr>
						<td width="100%" colspan="7">
							<div id="blist"></div>
						</td>
					</tr>
					<tr>
						<td height="30" align="center"></td>
					</tr>
					
					  <tr>
						<td><table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
							<tr>
								<td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">점용종류</td>
								<td width="37%" bgcolor="eaeaea" class="table_bl_left">
									<input type="hidden" name="TYPE" id="TYPE" value="1">도로
								</td>
								<td width="100" align="center" bgcolor="e5eff8" class="sub_table_b">점용구분</td>
								<td width="36%" bgcolor="eaeaea" class="table_bl_left">
									<input type="hidden" name="SECTION" id="SECTION" value="1">계속
									<%-- 
									<select name="SECTION" id="SECTION" class="essential" style="width:70px" OnChange="Select_UseSection(this);" nowrap="nowrap">
										${occupancy_type}
									</select>
									--%>
								</td>
							</tr>
							
							<tr>
								<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">소유자</td>
								<td bgcolor="eaeaea" class="table_bl_left"><select name="OWNER_SET" id="OWNER_SET" class="essential" style="width:70px">
								${use_owner_Group}
								</select></td>
								<td align="center" bgcolor="e5eff8" class="sub_table_b">세입구분</td>
								<td bgcolor="eaeaea" class="table_bl_left"><select name="TAX_SET" id="TAX_SET" class="essential" style="width:70px">
								${taxation_section}
								</select></td>
							</tr>
							
							<tr>
								<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">점용목적</td>
								<td colspan="3" bgcolor="eaeaea" ><table width="100%" border="0" cellpadding="0" cellspacing="0">
									<iframe id="IFRM_PurposeCode" scrolling="no" frameborder="0" framespacing="0" width="100%" height="25" src="/jsp/common/purposeCode/purposeCode.jsp?SectionCode=4&PURPOSE_CD=000&essential=1"></iframe>
								</table></td>
							</tr>
							
							<tr>
								<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">상세시설물</td>
								<td bgcolor="eaeaea" class="table_bl_left">
									<select name="PURPOSESEBU_CD" id="PURPOSESEBU_CD" class="input_form1" style="width:120px"></select>
								</td>             
								<td align="center" bgcolor="e5eff8" class="sub_table_b">규격</td>
								<td bgcolor="eaeaea" class="table_bl_left">
									<input name="STANDARD" id="STANDARD" type="text" class="input_form1" style="width:140px" maxlength="12">
								</td>
							</tr> 
							
							<tr>
								<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">수량(연장)</td>
								<td bgcolor="eaeaea" class="table_bl_left">
									<input name="QUANTITY" id="QUANTITY" type="text" class="essential" style="width:140px" maxlength="11" onKeyUp="nr_num_float(this);" > 개(또는 m)
								</td>
								<td align="center" bgcolor="e5eff8" class="sub_table_b">심도(감액적용)</td>
								<td bgcolor="eaeaea" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
								<tr>
									<td>
										<input name="DEPTH_CK" id="DEPTH_CK" type="text" class="input_form1" style="width:50px" onKeyUp="Select_Depth(); nr_num_int(this);" onKeyPress="nr_num_int(this);" maxlength="3">&nbspm &nbsp&nbsp;
										<input name="DEPTH_NUM" id="DEPTH_NUM" type="text" class="input_form1" style="width:50px" readonly> %
									</td>
								</tr>
								</table></td>
							</tr>
							
							<tr>
								<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">점용기간</td>
								<td colspan="3" bgcolor="eaeaea" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
								<tr>
									<td>
										<input name="MUL_FROMDATE" id="MUL_FROMDATE" type="text" class="essential" style="width:70px" readonly><a><img src="/img/calendar_icon.gif" width="19" height="16" border="0" align="absmiddle" onclick="popUpCalendar(this, MUL_FROMDATE, 'yyyymmdd')" style="CURSOR: Hand;"></a>
										~ <input name="MUL_TODATE" id="MUL_TODATE" type="text" class="essential" style="width:70px" readonly><a><img src="/img/calendar_icon.gif" width="19" height="16" border="0" align="absmiddle" onclick="popUpCalendar(this, MUL_TODATE, 'yyyymmdd')" style="CURSOR: Hand;"></a>
									</tr>
								</td>
								
								<tr style="display:none" id="UseSection">
									<td>일시점용<input name="PARTLY_PERIOD" id="PARTLY_PERIOD" type="text" class="essential" style="width:300px">
									&nbsp;&nbsp;총<input name="TOTAL_PERIOD" id="TOTAL_PERIOD" type="text" class="essential" style="width:30px" style="ime-mode:disabled" onKeyDown="nr_num_int(this);" onKeyUp="nr_num_int(this);" onKeyPress="nr_num_int(this);">일</td>
								</tr>
								</table>
								</td>
							</tr>
							
							<tr>
								<td height="34" colspan="4" align="left" bgcolor="#FFFFFF" class=""><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
								<tr>
									<td><span class="sub_stan_blue">* 시설물 주소</span></td>
								</tr>
								</table></td>
							</tr>
							
							<tr>
								<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">대표 주소</td>
								<td colspan="3" bgcolor="eaeaea" class="table_bl_left">
									<div id="addr_fix">
										<table border="0" cellpadding="0" cellspacing="0" class="sub_stan"> 
											<tr>
												<td><input name="SISUL_POST" id="SISUL_POST" type="text" class="essential" style="width:50px" onFocus="" readonly></td>
												<td><a href="javascript:openZipcodePopup('form.SISUL_POST', '');"><img src="/img/search_icon.gif" alt="검색" width="56" height="18" border="0"></a></td>
												<td bgcolor="eaeaea" class="table_bl_left">
												
												 	${SIGUNGU}&nbsp;
			                    	
					                            	<select id="BJ_CD" name="BJ_CD" id="BJ_CD" class="essential" style="width:80px" >
					                                	${bjdong_code}
					                              	</select>
				                                
				                                &nbsp;
				                                	<select id="HJ_CD" name="HJ_CD" id="HJ_CD" class="essential" style="width:80px" >
				                                   		${hjdong_code}
				                                	</select>
				                                
				                 	            &nbsp;/&nbsp;
				                 	            	<select id="SPC_CD" name="SPC_CD" id="SPC_CD" class="essential" style="width:75px"  onChange ="javascript:setSisul_addr1();">
				                                   		${mul_spc_cd}
				                                	</select>
				                                	&nbsp;
				                                	<input type='text' id="BONBUN"  name="BONBUN" class="essential" style="width:30px" maxlength="4"> - <input type='text' id="BUBUN" name="BUBUN" class="essential" style="width:30px" maxlength="4"> &nbsp;번지 
												</td>  
											</tr>
											<tr>					
																									
												<td colspan='3'><input name="SISUL_ADDR1" id="SISUL_ADDR1" type="text" class="essential" style="width:200px" disabled>
												<input name="SISUL_ADDR2" id="SISUL_ADDR2" type="text" class="essential" style="width:300px" 	>												
												</td>
											</tr>
										</table>
									</div>
								</td>
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
								<td bgcolor="eaeaea" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
								<tr>
									<td><input name="WORK_FROMDATE" id="WORK_FROMDATE" type="text" class="input_form1" style="width:65px" readonly></td>
									<td><a><img src="/img/calendar_icon.gif" width="19" height="16" border="0" onclick="popUpCalendar(this, WORK_FROMDATE, 'yyyymmdd')" style="CURSOR: Hand;"></a></td>
									<td width="16" align="center">~</td>
									<td><input name="WORK_TODATE" id="WORK_TODATE" type="text" class="input_form1" style="width:65px" readonly></td>
									<td><a><img src="/img/calendar_icon.gif" width="19" height="16" border="0" onclick="popUpCalendar(this, WORK_TODATE, 'yyyymmdd')" style="CURSOR: Hand;"></a></td>
								</tr>
								</table></td>
								
								<td align="center" bgcolor="e5eff8" class="sub_table_b">준공년월일</td>
								<td bgcolor="eaeaea" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
								<tr>
									<td><input name="COMPLETION_DATE" id="COMPLETION_DATE" type="text" class="input_form1" style="width:65px" readonly></td>
									<td><a><img src="/img/calendar_icon.gif" width="19" height="16" border="0" onclick="popUpCalendar(this, COMPLETION_DATE, 'yyyymmdd')" style="CURSOR: Hand;"></a></td>
								</tr>
								</table></td>
							</tr>
							
							<tr>
								<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">공사내용</td>
								<td colspan="3" bgcolor="eaeaea" class="table_bl_left"><table width="100%" border="0" cellpadding="0" cellspacing="0" class="sub_stan">
									<input name="EXE_INFO" id="EXE_INFO" type="text" class="input_form1" style="width:98%">
								</table></td>
							</tr>
							
						</table></td>
					</tr>
					
					<tr>
						<td height="40" align="right">
						<table width="0" border="0" cellspacing="0" cellpadding="0" align="right">
							<tr>
								<td>
									<img src="/img/add_icon2.gif" alt="추가" border="0" onClick='javascript:New_Sisul_Register()' style="CURSOR:hand">
								</td>
							</tr>
						</table>
						</td>
					</tr>
					
				</table>
			</div>
		</div>
		</td>
		</tr>
 	
 	
	</table></td>
	</tr>
</form>
</table>
</body>
</html>
<script language="javascript">
	//상세시설물 선택
	function purposesebu_select(){
		var frm=document.form.PURPOSESEBU_CD;
		frm.options[0].selected = true;
	}
</script>