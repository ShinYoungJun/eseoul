<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ include file="/jsp/common/loginCheck.jsp" %>
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
<!--<script language="javascript" src="/jsp/facility/minwon/tab/info_register.js"></script>-->
<script language="javascript" src="/jsp/facility/minwon/tab/info_sisul_register.js"></script>
<script language="javascript" src="/js/zipcode.js"></script>

<script type="text/javascript">
//<![CDATA[
	var dept = [];
	
	function 	Init()
	{
		parent.Tab_Img("jumji");

		IFRM_PurposeCode.PURPOSE_CD.className="view";
	}
	
	function	Sisul_Click()
	{	
		if(document.getElementById("XMLDATA").value	== "")
		{
			Sisul_Init();
			Sisul_Init_UseType();
		}
	}
	
	function	Modify()
	{
		var form = document.form;
		var purpose_cd = IFRM_PurposeCode.PURPOSE_CD.value;
		form.PURPOSE_CD.value = purpose_cd;
		form.action = "jumji_modify_prc.do";
		form.submit();
	}

	function setSisul_addr1(){

		//	alert('실행'+document.getElementById('bj_cd').value );
			
				var param = "&bj_cd="+document.getElementById('BJ_CD').value; 

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
			document.getElementById("UseSection").style.display = "block";	//	정기
		else
			document.getElementById("UseSection").style.display = "none";
	}

	function choose_place(admin_no, object_no)
	{
		var gu_code= document.getElementById("gu_code").value;
		var corp_cd = document.getElementById("corp_cd").value;
		//var request_no= document.getElementById("request_no").value;
		var currentPage= document.getElementById("currentPage").value;

		location.href="/facility/jumyonginfo/jumji_modify.do?GU_CODE="+gu_code+"&CORP_CD="+corp_cd
		+"&currentPage="+currentPage+"&object_no="+object_no+"&ADMIN_NO="+admin_no;
	}

	function	Cancel()
	{
		document.form.action = "/facility/jumyonginfo/jumji_view.do";
		document.form.submit();
	}
	
	//	심도
	function	Init_Depth()
	{
		<c:forEach items="${clist}" var="dept" varStatus="idx">
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
	
	Init_Depth();
//]]>
</script>

<!-- body onload="Init(); Init_UseType('${board.TYPE}'); Init_UseSection('${board.SECTION}');" -->
<body>
<table width="780" border="0" cellpadding="0" cellspacing="0">
<form name="form" method="post">
<input type="hidden" name="ADMIN_NO" value="${ADMIN_NO}">
<input type="hidden" name="currentPage" value="${currentPage}">
<input type="hidden" name="CORP_CD" value="${CORP_CD}">
<input type="hidden" name="GU_CODE" value="${GU_CODE}">
<input type="hidden" name="object_no" value="${object_no}">
<input type="hidden" name="choose_no" value="${choose_no}">
<input type="hidden" name="PURPOSE_CD" value="${purpose_cd}">

	<tr>
		<td align="left" class="contborder_blue">
		
		<table width="100%" border="0" cellspacing="0" cellpadding="0">
	        <tr>
				<td height="34" class="sub_stan">전체건수 : <span class="sub_stan_blue">${totalcnt}</span> 건 </td>
	        </tr>
			<tr>
				<td>
					<table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
						<tr>
					        <td height="28" align="center" bgcolor="e5eff8" class="sub_table_b" width="5%" nowrap="nowrap">번호</td>
					        <td align="center" bgcolor="e5eff8" class="sub_table_b" width="40%" nowrap="nowrap">점용목적(코드)</td>
					        <td align="center" bgcolor="e5eff8" class="sub_table_b" width="5%" nowrap="nowrap">수량</td>
			    	        <td align="center" bgcolor="e5eff8" class="sub_table_b" width="30%" nowrap="nowrap">점용기간</td>
					        <td align="center" bgcolor="e5eff8" class="sub_table_b" width="20%" nowrap="nowrap">세입구분</td>
						</tr>

						<c:choose>
							<c:when test="${blist!= null && !empty blist}">
			                      <c:forEach items="${blist}" var="board" varStatus="idx">
				                      <tr onClick="javascript:choose_place('${board.ADMIN_NO}','${board.OBJECT_NO}');" onMouseOver=this.style.backgroundColor='#f6f7f8' onMouseOut=this.style.backgroundColor='' style='CURSOR: Hand;'>
										<td height='26' align='center'>${board.RN}</td>
										<td align='center'>${board.PURPOSE_NM}</td>
										<td align='center'>${board.QUANTITY}</td>
										<td align='center'>${board.MUL_FROMDATE} ~ ${board.MUL_TODATE}</td>
										<td align='center'>${board.TAX_SET_NM}</td>
									  </tr>
								 </c:forEach>
							</c:when>
							<c:otherwise>
								<tr>
									<td align="center" class="sub_table" colspan="11" height="26">검색된 내용이 없습니다</td>
								</tr>
							</c:otherwise>
						 </c:choose>
					</table>
				</td>
			</tr>
			<tr>
			  <td height="30" align="center">
				  <table border="0" cellspacing="0" cellpadding="0">
					<tr>
						${pageing}
					</tr>
				  </table>
			  </td>
			</tr>
			<tr>
				<td>
				<table width="100%" border="0" cellspacing="0" cellpadding="0">
				  <tr>
					<td><table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
						<tr>
						  <td width="100" height="25" align="center" bgcolor="e5eff8" class="sub_table_b">점용종류</td>
						  <td width="37%" bgcolor="eaeaea" class="table_bl_left">도로</td>
						  <td width="100" align="center" bgcolor="e5eff8" class="sub_table_b">점용구분</td>
						  <td width="36%" bgcolor="eaeaea" class="table_bl_left">
							<input type="hidden" name="SECTION" value="1">계속
  						  </td>
						</tr>
						<tr>
						  <td height="25" align="center" bgcolor="e5eff8" class="sub_table_b">소유자</td>
						  <td bgcolor="eaeaea" class="table_bl_left">
						  	<select name="OWNER_SET" class="essential" style="width:70px">
								${use_owner_Group}
							</select>
						  </td>
						  <td align="center" bgcolor="e5eff8" class="sub_table_b">세입구분</td>
						  <td bgcolor="eaeaea" class="table_bl_left">
						  	<select name="TAX_SET" class="essential" style="width:70px">
								${taxation_section}
							</select>
						  </td>
						</tr>
						<tr>
							<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">점용목적</td>
							<td colspan="3" bgcolor="eaeaea" ><table width="100%" border="0" cellpadding="0" cellspacing="0">
								<iframe id="IFRM_PurposeCode" scrolling="no" frameborder="0" framespacing="0" width="100%" height="25" src="/jsp/common/purposeCode/purposeCode.jsp?SectionCode=4&PURPOSE_CD=${purpose_cd}&essential=1"></iframe>
							</table></td>
						</tr>
						<tr>
							<td height="25" align="center" bgcolor="e5eff8" class="sub_table_b">상세시설물</td>
							<td bgcolor="eaeaea" class="table_bl_left">
								<select name="PURPOSESEBU_CD" id="PURPOSESEBU_CD" class="input_form1" style="width:120px"></select>
							</td>    
							<td align="center" bgcolor="e5eff8" class="sub_table_b">규격</td>
							<td bgcolor="eaeaea" class="table_bl_left"><input name="STANDARD" type="text" class="input_form1" style="width:140px" maxlength="12" value="${standard}"></td>
						</tr>
						<tr>
							<td height="25" align="center" bgcolor="e5eff8" class="sub_table_b">수량(연장)</td>
							<td bgcolor="eaeaea" class="table_bl_left">
								<input name="QUANTITY" type="text" class="essential" style="width:140px" maxlength="12" onKeyUp="nr_num_float(this);" value="${quantity}"> 개(또는 m)
							</td>
							<td align="center" bgcolor="e5eff8" class="sub_table_b">심도(감액적용)</td>
							<td bgcolor="eaeaea" class="table_bl_left">
								<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
									<tr>
										<td>
											<input name="DEPTH_CK" type="text" class="input_form1" style="width:50px" onKeyUp="Select_Depth(); nr_num_int(this);" onKeyPress="nr_num_int(this);" maxlength="3"  value="${depth_ck}">&nbspm &nbsp&nbsp;
											<input name="DEPTH_NUM" type="text" class="input_form1" style="width:50px" readonly  value="${depth_num}"> %
										</td>
									</tr>
								</table>
							</td>
						</tr>
						<tr>
						  <td height="25" align="center" bgcolor="e5eff8" class="sub_table_b">점용기간</td>
						  <td colspan="3" bgcolor="eaeaea" class="table_bl_left">
						  	<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
								<tr>
									<td>
										<input name="MUL_FROMDATE" type="text" class="essential" style="width:70px" value="${mul_fromdate}" readonly><a><img src="/img/calendar_icon.gif" width="19" height="16" border="0" align="absmiddle" onclick="popUpCalendar(this, MUL_FROMDATE, 'yyyymmdd')" style="CURSOR: Hand;"></a>
										~ <input name="MUL_TODATE" type="text" class="essential" style="width:70px"  value="${mul_todate}" readonly><a><img src="/img/calendar_icon.gif" width="19" height="16" border="0" align="absmiddle" onclick="popUpCalendar(this, MUL_TODATE, 'yyyymmdd')" style="CURSOR: Hand;"></a>
									</td>
								</tr>
								<tr style="display:none" id="UseSection">
									<td>일시점용<input name="PARTLY_PERIOD" type="text" class="essential" style="width:300px"  value="${partly_period}">
									&nbsp;&nbsp;총<input name="TOTAL_PERIOD" type="text" class="essential" style="width:30px" style="ime-mode:disabled" onKeyDown="nr_num_int(this);" onKeyUp="nr_num_int(this);" onKeyPress="nr_num_int(this);"  value="${total_period}">일</td>
								</tr>
							</table>
						  </td>
						</tr>
					    <tr>
						  <td height="34" colspan="4" align="left" bgcolor="#FFFFFF" class=""><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
							<tr>
							  <td><span class="sub_stan_blue"><img src="/img/facility_view3.gif" alt="시설물 주소"></span></td>
							</tr>
						  </table></td>
					    </tr>
					    <tr>
							<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">주소</td>
							<td colspan="3" bgcolor="eaeaea" class="table_bl_left">
								<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
									<tr>
										<td><input name="SISUL_POST" type="text" class="essential" style="width:50px" onFocus="Jumin_toaddr_Check();" readonly  value="${sisul_post}"></td>
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
				                                	<input type='text' id="BONBUN"  name="BONBUN" class="essential" style="width:30px" maxlength="4" value="${BONBUN }"> - <input type='text' id="BUBUN" name="BUBUN" class="essential" style="width:30px" maxlength="4" value="${BUBUN }"> &nbsp;번지 
												</td>  
											</tr>
											<tr>				
											<td colspan='3'>
											<input name="SISUL_ADDR1" class="essential" style="width:200px" onFocus="Jumin_toaddr_Check();" readonly  value="${sisul_addr1}">
											<input name="SISUL_ADDR2" type="text" class="essential" style="width:300px"  value="${sisul_addr2}">
										</td>  
									</tr>
								</table>
							</td>
						</tr>
					    <tr>
						  <td height="34" colspan="4" align="left" bgcolor="#FFFFFF" class=""><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
							<tr>
							  <td><span class="sub_stan_blue"><img src="/img/facility_view4.gif" alt="공사(굴착) 정보"></span></td>
							</tr>
						  </table></td>
					    </tr>
					    <tr>
						  <td height="25" align="center" bgcolor="e5eff8" class="sub_table_b">공사기간 </td>
						  <td bgcolor="eaeaea" class="table_bl_left">
						  	<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
								<tr>
									<td><input name="WORK_FROMDATE" type="text" class="input_form1" style="width:65px" readonly value="${work_fromdate}"></td>
									<td><a><img src="/img/calendar_icon.gif" width="19" height="16" border="0" onclick="popUpCalendar(this, WORK_FROMDATE, 'yyyymmdd')" style="CURSOR: Hand;"></a></td>
									<td width="16" align="center">~</td>
									<td><input name="WORK_TODATE" type="text" class="input_form1" style="width:65px" readonly value="${work_todate}"></td>
									<td><a><img src="/img/calendar_icon.gif" width="19" height="16" border="0" onclick="popUpCalendar(this, WORK_TODATE, 'yyyymmdd')" style="CURSOR: Hand;"></a></td>
								</tr>
							</table>
						   </td>
						   <td align="center" bgcolor="e5eff8" class="sub_table_b">준공년월일 </td>
						  <td bgcolor="eaeaea" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
								<tr>
									<td><input name="COMPLETION_DATE" type="text" class="input_form1" style="width:65px" readonly  value="${completion_date}"></td>
									<td><a><img src="/img/calendar_icon.gif" width="19" height="16" border="0" onclick="popUpCalendar(this, COMPLETION_DATE, 'yyyymmdd')" style="CURSOR: Hand;"></a></td>
								</tr>
								</table></td>
					    </tr>
						<tr>
						  <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">공사내용</td>
						  <td colspan="3" bgcolor="eaeaea" class="table_bl_left"><table width="100%" border="0" cellpadding="0" cellspacing="0" class="sub_stan">
							<input name="EXE_INFO" type="text" class="input_form1" style="width:98%"  value="${exe_info}">
						    </table>
						   </td>
					    </tr>
					</table></td>
				  </tr>
					<tr>
						<td height="40">
						<table width="0" border="0" cellspacing="0" cellpadding="0" align="right">
					  		<a href="javascript:Cancel()"><img src="/img/can_icon.gif" alt="취소" width="56" height="18" border="0"></a>	
					  		<a href="javascript:parent.ModifyPrc()"><img src="/img/save_icon2.gif" alt="저장" width="56" height="18" border="0"></a>
						</table>
						</td>
					</tr>
				</table></td>
			</tr>

</table>
</body>
</html>
<script language="javascript">
	//상세시설물 선택
	function purposesebu_select(){
		if(${purposesebu_cd} > 0){
			var frm=document.form.PURPOSESEBU_CD;
			frm.options[${purposesebu_cd}].selected = true;
		}
	}
</script>