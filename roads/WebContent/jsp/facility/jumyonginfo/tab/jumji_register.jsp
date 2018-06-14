<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ include file="/jsp/common/loginCheck.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

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
<!-- 
<script language="javascript" src="/jsp/facility/minwon/tab/info_register.js"></script>
 -->
<script language="javascript" src="/jsp/facility/minwon/tab/info_sisul_register.js"></script>
<script language="javascript" src="/js/zipcode.js"></script>

<script type="text/javascript">
//<![CDATA[

	var dept = [];
	
	function	Sisul_Click()
	{
		if(document.getElementById("XMLDATA").value	== "")
		{
			Sisul_Init();
			//Sisul_Init_UseType();
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
	
	// 음의 실수도 입력받을수 있도록
	function minus_nr_num_float(this_s){
		
		var CORP_CD = document.form.CORP_CD.value;
		var GU_CODE = document.form.GU_CODE.value;
		var PURPOSE_CD = IFRM_PurposeCode.PURPOSE_CD.value;
		
		nr_num(this_s,'-float');
		
		if(this_s.value < 0)
		{
			if(CORP_CD == "")
			{
				alert("점용인(법인명)을 선택 해주세요");
				tabDisplay(tab,content,1);
				openZipcodePopup('form.BON_POST', 'form.BON_ADDR1');
			}
			else if(PURPOSE_CD == "")
			{
				alert("점용목적을 선택 해주세요");
			}
			else
			{
				minusFacilityPopup(CORP_CD, GU_CODE, PURPOSE_CD);
			}
		}
	}

	function	Register()
	{
		var str = "";

	    if(document.form.XMLDATA.value.length < 10)
		{
			str	+= "시설물 정보는 1개이상 등록해야 합니다.\n";
			alert(str);
			document.form.OWNER_SET.focus();
			return false;
		}
		
		document.form.action = "jumji_register_prc.do";
		document.form.submit();
	}	
	
	function	Cancel()
	{
		document.form.action = "/facility/jumyonginfo/jumji_view.do";
		document.form.submit();
		
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
			innerHtml += "	<td><input name='SISUL_POST' type='text' class='essential' style='width:50px' onFocus='' value='"+SISUL_POST+"' ></td>";
			innerHtml += "	<td><a href='javascript:openZipcodePopup_new('form.SISUL_POST','','','','','','','','','');'><img src='/img/search_icon.gif' alt='검색' width='56' height='18' border='0'></a></td>";
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
														
			innerHtml += "	<td colspan='3'><input name='SISUL_ADDR2' type='text' class='essential' style='width:300px' onclick='javascript:setSisul_addr1();' value='"+SISUL_ADDR2+"'>";
			innerHtml += "	<input name='SISUL_ADDR1' type='hidden' class='essential' style='width:200px' value='"+SISUL_ADDR1+"'>";
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
			
			parent.iFrameResizeTab("tabUp");	//	화면 RESIZE
			
		}
		
		
	
		function registerPrc()
		{
			
			var form = document.form;

			
			//alert(document.getElementById("XMLDATA").value);
			
			form.action = "/facility/jumyonginfo/jumji_register_prc.do";
			form.submit();
			
		}
	
	Init_Depth();
//]]>
</script>

<!-- body onload="Init(); Init_UseType('${board.TYPE}'); Init_UseSection('${board.SECTION}');" -->
<body>
<form name="form" method="post">
	<input type="hidden" name="ADMIN_NO" value="${ADMIN_NO}">
	<input type="hidden" name="currentPage" value="${currentPage}">
	<input type="hidden" name="MIN_CHECK" value="${MIN_CHECK}">
	<input type="hidden" name="CORP_CD" value="${CORP_CD}">
	<input type="hidden" name="GU_CODE" value="${GU_CODE}">
	<input type="hidden" name="REQUEST_NO" value="${REQUEST_NO}">
	<input type="hidden" name="object_no">
	<input type="hidden" name="choose_no" value="${choose_no}">
	<input type="hidden" name="XMLDATA" id="XMLDATA">
	
	<input type="hidden" name="UserType">
	<input type="hidden" name="UserSection">
	<input type="hidden" name="PURPOSE_CD" value="${PURPOSE_CD}">
	<input type="hidden" name="MIN_PROCESS" value="${MIN_PROCESS}">
	<input type="hidden" name="GIGAN1" value="${GIGAN1}">
	<input type="hidden" name="GIGAN2" value="${GIGAN2}">
	<input type="hidden" name="MIN_NAME" value="${MIN_NAME}">
	<input type="hidden" name="MIN_REQNO" value="${MIN_REQNO}">
	<input type="hidden" name="PURPOSE1_NM">
	<input type="hidden" name="PURPOSE2_NM">
	<input type="hidden" name="PURPOSE3_NM">
	<input type="hidden" name="TAX_SET_NM">
	<input type="hidden" name="PURPOSESEBU_NM">
	<input type="hidden" name="LISTSEQ" value="">
	
	<input type="hidden" name="YEAR" value="${YEAR}">

<table width="100%" border="0" cellpadding="0" cellspacing="0">
	<tr>
		<td align="left" class="contborder_blue">
		
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
					<td>
					<table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
							<tr>
								<td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">점용종류</td>
								<td width="37%" bgcolor="eaeaea" class="table_bl_left">
									<input type="hidden" name="TYPE" value="1">도로
								</td>
								<td width="100" align="center" bgcolor="e5eff8" class="sub_table_b">점용구분</td>
								<td width="36%" bgcolor="eaeaea" class="table_bl_left">
									<input type="hidden" name="SECTION" value="1">계속
									<%-- 
									<select name="SECTION" class="essential" style="width:70px" OnChange="Select_UseSection(this);" nowrap="nowrap">
										${occupancy_type}
									</select>
									--%>
								</td>
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
									<input name="STANDARD" type="text" class="input_form1" style="width:140px" maxlength="12">
								</td>
							</tr> 
							
							<tr>
								<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">수량(연장)</td>
								<td bgcolor="eaeaea" class="table_bl_left">
									<input name="QUANTITY" type="text" class="essential" style="width:140px" maxlength="11" onKeyUp="nr_num_float(this);" > 개(또는 m)
								</td>
								<td align="center" bgcolor="e5eff8" class="sub_table_b">심도(감액적용)</td>
								<td bgcolor="eaeaea" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
								<tr>
									<td>
										<input name="DEPTH_CK" type="text" class="input_form1" style="width:50px" onKeyUp="Select_Depth(); nr_num_int(this);" onKeyPress="nr_num_int(this);" maxlength="3">&nbspm &nbsp&nbsp;
										<input name="DEPTH_NUM" type="text" class="input_form1" style="width:50px" > %
									</td>
								</tr>
								</table></td>
							</tr>
							
							<tr>
								<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">점용기간</td>
								<td colspan="3" bgcolor="eaeaea" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
								<tr>
									<td>
										<input name="MUL_FROMDATE" type="text" class="essential" style="width:70px" ><a><img src="/img/calendar_icon.gif" width="19" height="16" border="0" align="absmiddle" onclick="popUpCalendar(this, MUL_FROMDATE, 'yyyymmdd')" style="CURSOR: Hand;"></a>
										~ <input name="MUL_TODATE" type="text" class="essential" style="width:70px" ><a><img src="/img/calendar_icon.gif" width="19" height="16" border="0" align="absmiddle" onclick="popUpCalendar(this, MUL_TODATE, 'yyyymmdd')" style="CURSOR: Hand;"></a>
									</tr>
								</td>
								
								<tr style="display:none" id="UseSection">
									<td>일시점용<input name="PARTLY_PERIOD" type="text" class="essential" style="width:300px">
									&nbsp;&nbsp;총<input name="TOTAL_PERIOD" type="text" class="essential" style="width:30px" style="ime-mode:disabled" onKeyDown="nr_num_int(this);" onKeyUp="nr_num_int(this);" onKeyPress="nr_num_int(this);">일</td>
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
												<td><input name="SISUL_POST" type="text" class="essential" style="width:50px" onFocus="" ></td>
												<td><a href="javascript:openZipcodePopup_new('form.SISUL_POST','','','','','','','','','');"><img src="/img/search_icon.gif" alt="검색" width="56" height="18" border="0"></a></td>
												<td bgcolor="eaeaea" class="table_bl_left">
												
												 	${sigungu_nm}&nbsp;
			                    	
					                            	<select id="BJ_CD" name="BJ_CD" class="essential" style="width:80px" >
					                                	${bjdong_code}
					                              	</select>
				                                
				                                &nbsp;
				                                	<select id="HJ_CD" name="HJ_CD" class="essential" style="width:80px" >
				                                   		${hjdong_code}
				                                	</select>
				                                
				                 	            &nbsp;/&nbsp;
				                 	            	<select id="SPC_CD" name="SPC_CD" class="essential" style="width:75px"  onChange ="javascript:setSisul_addr1();">
				                                   		${mul_spc_cd}
				                                	</select>
				                                	&nbsp;
				                                	<input type='text' id="BONBUN"  name="BONBUN" class="essential" style="width:30px" maxlength="4"> - <input type='text' id="BUBUN" name="BUBUN" class="essential" style="width:30px" maxlength="4"> &nbsp;번지 
												</td>  
											</tr>
											<tr>					
																									
												<td colspan='3'><input name="SISUL_ADDR1" id="SISUL_ADDR1" class="essential" style="width:200px" disabled>
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
									<td><input name="WORK_FROMDATE" type="text" class="input_form1" style="width:65px" ></td>
									<td><a><img src="/img/calendar_icon.gif" width="19" height="16" border="0" onclick="popUpCalendar(this, WORK_FROMDATE, 'yyyymmdd')" style="CURSOR: Hand;"></a></td>
									<td width="16" align="center">~</td>
									<td><input name="WORK_TODATE" type="text" class="input_form1" style="width:65px" ></td>
									<td><a><img src="/img/calendar_icon.gif" width="19" height="16" border="0" onclick="popUpCalendar(this, WORK_TODATE, 'yyyymmdd')" style="CURSOR: Hand;"></a></td>
								</tr>
								</table></td>
								
								<td align="center" bgcolor="e5eff8" class="sub_table_b">준공년월일</td>
								<td bgcolor="eaeaea" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
								<tr>
									<td><input name="COMPLETION_DATE" type="text" class="input_form1" style="width:65px" ></td>
									<td><a><img src="/img/calendar_icon.gif" width="19" height="16" border="0" onclick="popUpCalendar(this, COMPLETION_DATE, 'yyyymmdd')" style="CURSOR: Hand;"></a></td>
								</tr>
								</table></td>
							</tr>
							
							<tr>
								<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">공사내용</td>
								<td colspan="3" bgcolor="eaeaea" class="table_bl_left"><table width="100%" border="0" cellpadding="0" cellspacing="0" class="sub_stan">
									<input name="EXE_INFO" type="text" class="input_form1" style="width:98%">
								</table></td>
							</tr>
							
						</table>
						</td>
					</tr>
					
					<tr>
						<td height="40" align="right">
						<table width="0" border="0" cellspacing="0" cellpadding="0" align="right">
							<tr>
								<td>
									<img src="/img/add_icon2.gif" alt="추가" border="0" onClick="javascript:New_Sisul_Register();" style="CURSOR:hand">
								</td>
							</tr>
						</table>
						</td>
					</tr>
					<tr>
						<td height="40">
						<table width="0" border="0" cellspacing="0" cellpadding="0" align="right">
					  		<a href="javascript:Cancel()"><img src="/img/can_icon.gif" alt="취소" width="56" height="18" border="0"></a>	
					  		<a href="javascript:registerPrc();"><img src="/img/save_icon2.gif" alt="저장" width="56" height="18" border="0"></a>
						</table>
						</td>
					</tr>
				</table>
				</td>
			</tr>
		</form>
	</table>
</body>
</html>

<script language="javascript">
	Sisul_Click();
</script>