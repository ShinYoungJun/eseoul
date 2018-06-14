<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR" %>
<%@ include file="/jsp/common/include.jsp"%>
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
	background-image: url(/img/left_back.gif);
}
-->
</style>
<link href="/css/roads.css" rel="stylesheet" type="text/css">
</head>

<script language="javascript" src="/js/common.js"></script> 
<script language="javascript" src="/js/admin.js"></script>
<!--  //********** BEGIN_현진_20120319 -->
<script language="javascript" src="/js/selectItem.js"></script>
<!--   //********** END_현진_20120319 -->
<script type="text/javascript">
//<![CDATA[
	function InitPage(){		
		if('${MSG}'.length > 0){
            alert('${MSG}');
        }		
		//********** BEGIN_현진_20120320
		if('${SIGU_CD}' == '000'){
			if('${SECTION}' == "0"){
	    		document.getElementById("addBtn").style.display = "none";
	    		document.getElementById("addBtn2").style.display = "none";
	    	}else{
	    		document.getElementById("addBtn").style.display = "block";
	    		document.getElementById("addBtn2").style.display = "block";
	    	}
		}
		//********** END_현진_20120320
    }
	function  search(){
		
		var w = document.searchForm;

		var iFrm = document.getElementById("IFRM_PurposeCode");
		document.getElementById("CODE").value = iFrm.contentWindow.document.getElementById("PURPOSE_CD").value;
		document.getElementById("CLASS_CD").value = iFrm.contentWindow.document.getElementById("PURPOSE1").value;
		document.getElementById("SORT_CD").value = iFrm.contentWindow.document.getElementById("PURPOSE2").value;
		document.getElementById("KIND_CD").value = iFrm.contentWindow.document.getElementById("PURPOSE3").value;
		
		w.action = "/admin/commCode/purposeCode.do";
		
		w.submit();
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
    	
	function Select_Using_mode(obj){		

    	var selectUsingMode = getSelectedValue(obj);	    	
        var	param	= "USING_MODE="+selectUsingMode;
       //********** BEGIN_현진_20120319      
       document.getElementById("IFRM_PurposeCode").src="/jsp/common/purposeCode/purposeCode2.jsp?SectionCode=0&PURPOSE_CD=000";
       //********** END_현진_20120319
              	        
        sendRequest("/admin/commCode/getSectionCode.do", param, "GET", ResultChangeSectionCDList);    	
    	
    }

    function	ResultChangeSectionCDList(obj)
    {
    	select_innerHTML(document.getElementById("SECTION_CD"),obj);
    }

	function changeSection(obj){
    	var SectionCode = getSelectedValue(obj);	    	
    	//********** BEGIN_현진_20120320
    	if('${SIGU_CD}' == '000'){
    		if(SectionCode == "0"){
        		document.getElementById("addBtn").style.display = "none";
        		document.getElementById("addBtn2").style.display = "none";
        	}else{
        		document.getElementById("addBtn").style.display = "block";
        		document.getElementById("addBtn2").style.display = "block";
        	}
		}
    	
    	//********** END_현진_20120320
		document.getElementById("IFRM_PurposeCode").src="/jsp/common/purposeCode/purposeCode2.jsp?SectionCode="+SectionCode+"&PURPOSE_CD=000";
	}

	function  fn_detailInfo(obj)
	{			
		var temp = obj.split("/");
	    	    
	    var yoyul = temp[0];
	    var check_yn = temp[1];
	    var gigan = temp[2];
	    var danwii = temp[3];
	    var momey = temp[4];
	    var code = temp[5];	    
	    var title = "title" + code;

	 	if(gigan =="null"){gigan = ""};
	 	if(danwii =="null"){danwii = ""};
	 	if(check_yn == "null"){check_yn = "1"};
		 	
		document.getElementById("detail").style.display = "block";	
		document.getElementById("detailModify").style.display = "none";
				
		document.getElementById("detailTitle").innerHTML = document.getElementById(title).value;
		document.getElementById("detailYoyol").innerHTML = yoyul;
		var check = "";
		if(check_yn == "1"){
			check = "단가";
		}else if(check_yn == "2"){
			check = "요율";
		}
		document.getElementById("detailCheckYn").innerHTML = check;
		document.getElementById("detailGigan").innerHTML = gigan;
		document.getElementById("detailDanwii").innerHTML = danwii;
		document.getElementById("detailMomey").innerHTML = momey;

		var ditailSection = "ditailSection"+code;
		var ditailCode = "ditailCode"+code;
		document.getElementById("detailTitleModyfy").innerHTML = document.getElementById(title).value;
		document.getElementById("detailYoyolModyfy").value = yoyul;		
		document.getElementById("detailCheckYnModyfy").value = check_yn;
		document.getElementById("detailGiganModyfy").value = gigan;
		document.getElementById("detailDanwiiModyfy").value = danwii;
		document.getElementById("detailMomeyModyfy").value = momey;
		document.getElementById("ditailSectionModyfy").value = document.getElementById(ditailSection).value;
		document.getElementById("ditailCodeModyfy").value = document.getElementById(ditailCode).value;
	
	}
	
	function detailInfo(SECTION, CLASS_CD,SORT_CD, KIND_CD,CODE){
		var param = "SECTION="+SECTION+"&CLASS_CD="+CLASS_CD+"&SORT_CD="+SORT_CD+"&KIND_CD="+KIND_CD+"&CODE="+CODE;

        sendRequest("/admin/commCode/purposeCodeDetailSelect.do", param, "post", fn_detailInfo);    	
	}
	
	//********** END_현진_20120319

	
	function detailModify(){
		document.getElementById("detail").style.display = "none";	
		document.getElementById("detailModify").style.display = "block";
	}

	function detailModyfyGo(){
		var w = detailModifyForm;
		
		var SECTION = document.getElementById("ditailSectionModyfy").value;
		var CODE = document.getElementById("ditailCodeModyfy").value;
		var YOYUL = document.getElementById("detailYoyolModyfy").value;
		var CHECK_YN = document.getElementById("detailCheckYnModyfy").value;
		var GIGAN = document.getElementById("detailGiganModyfy").value;
		var DANWII = document.getElementById("detailDanwiiModyfy").value;
		var MOMEY = document.getElementById("detailMomeyModyfy").value;

		if(YOYUL >= 10){
			alert("입력하신 요율 숫자가  큽니다.");
			document.getElementById("detailYoyolModyfy").focus();
			return
		}
		
		var param = "SECTION="+SECTION+"&CODE="+CODE+"&YOYUL="+YOYUL+"&CHECK_YN="+CHECK_YN+"&GIGAN="+GIGAN+"&DANWII="+DANWII+"&MOMEY="+MOMEY;

        sendRequest("/admin/commCode/purposeCodeDetailModify.do", param, "post", detailModyfyList);    	
	}

	function	detailModyfyList(obj)
    {	    
	    var temp = obj.split("/");   
	    
	    alert(temp[0]);
		document.getElementById("detail").style.display = "block";	
		document.getElementById("detailModify").style.display = "none";
		document.getElementById("detailYoyol").innerHTML=temp[1];
		var check = "";
		if(temp[2] == "1"){
			check = "단가";
		}else if(temp[2] == "2"){
			check = "요율";
		}
		document.getElementById("detailCheckYn").innerHTML=check;
		document.getElementById("detailGigan").innerHTML=temp[3];
		document.getElementById("detailDanwii").innerHTML=temp[4];
		document.getElementById("detailMomey").innerHTML=temp[5];
    }

	//********** BEGIN_현진_20120319
	function registerPop(mod){
		var mode = mod;
		var title ="";
		var param ="";
		
		if(mod == "add"){
			title="점용목적추가";
			var iFrm = document.getElementById("IFRM_PurposeCode");
			param += "&SECTION=" + document.getElementById("SECTION_CD").value;
			param += "&CODE=" + iFrm.contentWindow.document.getElementById("PURPOSE_CD").value;
			param += "&CLASS_CD=" + iFrm.contentWindow.document.getElementById("PURPOSE1").value;
			param += "&SORT_CD=" + iFrm.contentWindow.document.getElementById("PURPOSE2").value;
			param += "&KIND_CD=" + iFrm.contentWindow.document.getElementById("PURPOSE3").value;
			
		}else if(mod == "add2"){
			title="점용목적추가";
			param += "&SECTION=" + document.getElementById("SECTION_CD").value;
		}else{
			var cnt = cntCheck();
			if(!(confirm("해당데이터를 수정하시면 기존 데이터에 영향을 줄 수 있습니다.그래도 수정하시겠습니까?"))){
				return;
			}
			if(cnt <=0){
				alert("처리 대상이 없습니다.");
				return;
			}else if(cnt > 1){
				alert("수정은 1건씩만 가능합니다.");
				return;
				
			}
			param += "&modySECTION=" + document.getElementById("modySECTION").value;
			param += "&modyCODE=" + document.getElementById("modyCODE").value;
			title="점용목적수정";
		}
		
		var url = "/admin/commCode/purposeRegisterView.do?mode=" + mode + param;
  		popUp(url, title, 800, 200);	
	}

	function deletePop(){
		var w = document.sectionForm;
		var cnt = cntCheck();
		if(!(confirm("해당데이터를 삭제하시면 기존 데이터에 영향을 줄 수 있습니다.그래도 삭제하시겠습니까?"))){
			return;
		}
		if(cnt <= 0){
			alert("처리 대상이 없습니다.");
			return;
		}else{			
			if (confirm(cnt + "건을 삭제하시겠습니까?")){
				w.action = "/admin/commCode/purposeDelete.do";
				w.submit();
			}else{
				return;
			}
		}
		
	}

	function cntCheck(){
		var w = document.sectionForm;
		var select_item = document.getElementsByName("SELECT_ITEM");
		var item_check = document.getElementsByName("ITEM_CHECK");
		var section_arr = document.getElementsByName("SECTION_ARR");
		var code_arr = document.getElementsByName("CODE_ARR");

		var modySECTION =  document.getElementById("modySECTION");
		var modyCODE =  document.getElementById("modyCODE");

		var cnt = 0;		

		for(var i = 0 ; i < select_item.length ; i++){
			if(select_item[i].checked == true){
				item_check[i].value = select_item[i].checked;
				modySECTION.value=section_arr[i].value;
				modyCODE.value=code_arr[i].value;
				cnt++;
			}
		}
		return cnt;
	}
	//********** END_현진_20120319
//]]>
</script>

<body onload="javascript:InitPage();">
<table width="800" border="0" cellpadding="0" cellspacing="0">
	<tr>
		<td height="43"><img src="/img/admin_cont3_title.gif"
			width="800" height="43"></td>
	</tr>
	<tr>
		<td align="center">
		<table width="780" border="0" cellspacing="0" cellpadding="0">
			<tr>
				<td height="1" bgcolor="eaeaea"></td>
			</tr>
			<tr>
				<td height="14"></td>
			</tr>
		</table>

		<table width="780" border="0" cellspacing="0" cellpadding="0">
			<tr>
				<td align="left" height="22" background="/img/tab_line_blue.gif">
				<table border="0" cellspacing="0" cellpadding="0">
					<tr>
						<td width="111"><a href="/admin/commCode/areaCode.do"><img
							src="/img/sub_admin_title4_off.gif" alt="지역코드" width="110"
							height="22" border="0"></a></td>
						<td  width="111"><a href="/admin/commCode/orgCode.do"><img
							src="/img/sub_admin_title5_off.gif" alt="부서코드" width="110"
							height="22" border="0"></a></td>
						<td width="111"><a href="#"><img
							src="/img/sub_admin_title6_on.gif" alt="점용목적코드" width="110"
							height="22" border="0"></a></td>
						<td width="111"><a href="/admin/commCode/taxCode.do"><img
							src="/img/sub_admin_title7_off.gif" alt="과세구분코드" width="110"
							height="22" border="0"></a></td>
						<td width="111"><a href="/admin/commCode/seal.do"><img
							src="/img/sub_admin_seal_off.gif" alt="직인등록" width="110"							         
							height="22" border="0"></a></td>
						<td width="111"><a href="/admin/commCode/jojungCode.do"><img
							src="/img/sub_admin_title9_off.gif" alt="조정계수" width="110"
							height="22" border="0"></a></td>
						<td width="111"><a href="/admin/commCode/gradeCode.do"><img
							src="/img/sub_admin_title12_off.gif" alt="등급코드" width="110"
							height="22" border="0"></a></td>
						<td width="111"><a href="/admin/commCode/officeCode.do"><img
							src="/img/sub_admin_title13_off.gif" alt="업체코드" width="110"
							height="22" border="0"></a></td>							
					</tr>
				</table>
				</td>
			</tr>
			<tr>
				<td align="center" class="contborder_blue">
				<table width="100%" border="0" cellspacing="0" cellpadding="0">
					<tr>
						<td height="20px"></td>
					</tr>
					<!-- 조회 -->
					<form id="searchForm" name="searchForm">
					<input type="hidden" id="CLASS_CD" name="CLASS_CD"/>
					<input type="hidden" id="SORT_CD" name="SORT_CD"/>
					<input type="hidden" id="KIND_CD" name="KIND_CD"/>
					<input type="hidden" id="CODE" name="CODE"/>
														
					<tr>
						<td align="center">
							<table width="100%" border="1" bordercolor="#c9dfed"
								style="border-collapse:collapse;" cellpadding="0" cellspacing="0"
								class="sub_table">
								<tr>
									<td width="100px" height="28px" align="center" bgcolor="e5eff8" class="sub_table_b">점용종류</td>
									<td bgcolor="eaeaea" class="table_bl_left" >
										<table border="0" align="left">
											<tr>
												<td>
													<select id="USING_MODE" name="USING_MODE" class="input_form1" style="width:150px"  OnChange="Select_Using_mode(this);">
														${USING_MODE_LIST}
													</select>
													<select id="SECTION_CD" name="SECTION_CD" class="input_form1" style="width:130px" OnChange="changeSection(this);">
														${SECTION_CD_LIST }
													</select>
												</td>
											</tr>											
										</table>
									</td>																		
								</tr>
							</table>
						</td>						
					</tr>
					<tr><td height="15px"></td></tr>
					<tr>
						<td align="center">
							<table width="100%" border="1" bordercolor="#c9dfed"
								style="border-collapse:collapse;" cellpadding="0" cellspacing="0"
								class="sub_table">
								<tr>
									<td width="100px" height="28px" align="center" bgcolor="e5eff8" class="sub_table_b">점용목적</td>
									<td bgcolor="eaeaea" class="table_bl_left" >
										<table border="0" align="left" width="100%">
											<tr>
												<td>
													<iframe id="IFRM_PurposeCode" align="absmiddle" scrolling="no" frameborder="0" framespacing="0" width="100%" height="25" src="/jsp/common/purposeCode/purposeCode2.jsp?SectionCode=${SECTION}&PURPOSE_CD=${CODE}"></iframe>
												</td>									
											</tr>											
										</table>
									</td>
								</tr>
							</table>
						</td>						
					</tr>
					<tr>
						<td height="30px" align="right">
							<table border="0" cellpadding="0" cellspacing="0">
								<tr>
									<td>
										<div><a href="#"><img src="/img/inquiry_icon2.gif" alt="조회" border="0" onClick="javascript:search();"></a></div>
									</td>
									<td>
										<div id="addBtn" style="display:none"><img src="/img/add_icon.gif" alt="추가" width="56" height="18" border="0" style="cursor: pointer;" onclick="javascript:registerPop('add');"/></div>		
									</td>
								</tr>
							</table>
							
						</td>
					</tr>
					</form>				
					<!--조회 끝-->
					<tr>
						<td height="30px"></td>
					</tr>			
					<tr>
						<td height="1" bgcolor="#EAEAEA"></td>
					</tr>
					<tr>
						<td align="left">							
						<div id="detail" style="display:none">	
							<table width="100%" cellpadding="0" cellspacing="0">
								<tr>
									<td height="20px"></td>
								</tr>
								<tr>
									<td>
									<table width="100%" border="1" bordercolor="#c9dfed"
										style="border-collapse:collapse;" cellpadding="0" cellspacing="0"
										class="sub_table">
										<tr>
											<td width="150px" height="26px" align="center" bgcolor="#F3F8FC" class="sub_table_b">점용물 </td>
											<td height="28" colspan="3" bgcolor="eaeaea" class="table_bl_left">
												<span id="detailTitle"></span> 
											</td>
										</tr>
										<tr>
											<td width="150px" height="26px" align="center" bgcolor="#F3F8FC" class="sub_table_b">요율</td>
											<td width="270px" bgcolor="f2f2f2" class="table_bl_left"><span id="detailYoyol"></span> </td>
											<td width="150px" align="center" bgcolor="#F3F8FC" class="sub_table_b">계산 구분</td>
											<td bgcolor="f2f2f2" class="table_bl_left"><span id="detailCheckYn"></span> </td>
										</tr>								
										<tr>
											<td height="26px" align="center" bgcolor="#F3F8FC"
												class="sub_table_b">기간단위</td>
											<td bgcolor="f2f2f2" class="table_bl_left"><span id="detailGigan"></span> </td>
											<td align="center" bgcolor="#F3F8FC" class="sub_table_b">점용단위</td>
											<td bgcolor="f2f2f2" class="table_bl_left"><span id="detailDanwii"></span> </td>
										</tr>
										<tr>
											<td height="26px" align="center" bgcolor="#F3F8FC"
												class="sub_table_b">점용료</td>
											<td colspan="3" bgcolor="f2f2f2" class="table_bl_left"><span id="detailMomey"></span> </td>
										</tr>
									</table>
									</td>
								</tr>
								<!--  //********** BEGIN_현진_20120319 -->
								<c:if test="${SIGU_CD == '000'}">
								<tr>
									<td align="right" height="30px"><img src="/img/mod_icon.gif" alt="수정" width="56" height="18" border="0" style="cursor: pointer;" onclick="javascript:detailModify()"></td>
								</tr>
								</c:if>
								<!--   //********** END_현진_20120319 -->
							</table>
						</div>
						</td>
					</tr>
					<!--  //********** BEGIN_현진_20120319 -->
					<tr>
						<td align="left">
						<form id="detailModifyForm" name="detailModifyForm">					
						<div id="detailModify" style="display:none">	
							<table width="100%" cellpadding="0" cellspacing="0">
								<tr>
									<td height="20px"></td>
								</tr>
								<tr>
									<td>
									<table width="100%" border="1" bordercolor="#c9dfed"
										style="border-collapse:collapse;" cellpadding="0" cellspacing="0"
										class="sub_table">
										
										<tr>
											<td width="150px" height="26px" align="center" bgcolor="#F3F8FC" class="sub_table_b">점용물 </td>
											<td height="28" colspan="3" bgcolor="eaeaea" class="table_bl_left">
												<span id="detailTitleModyfy"></span> 
											</td>
										</tr>
										<tr>
											<td width="150px" height="26px" align="center" bgcolor="#F3F8FC" class="sub_table_b">요율</td>
											<td width="270px" bgcolor="f2f2f2" class="table_bl_left"><input type="text" id="detailYoyolModyfy" class="input_form1" maxlength="5"/></td>
											<td width="150px" align="center" bgcolor="#F3F8FC" class="sub_table_b">계산 구분</td>
											<td bgcolor="f2f2f2" class="table_bl_left">
												<select id="detailCheckYnModyfy" class="input_form1">
													<option value="1">단가</option>
													<option value="2">요율</option>
												</select>	
											</td>
										</tr>								
										<tr>
											<td height="26px" align="center" bgcolor="#F3F8FC"
												class="sub_table_b">기간단위</td>
											<td bgcolor="f2f2f2" class="table_bl_left"><input type="text" id="detailGiganModyfy" class="input_form1" maxlength="5"/></td>
											<td align="center" bgcolor="#F3F8FC" class="sub_table_b">점용단위</td>
											<td bgcolor="f2f2f2" class="table_bl_left"><input type="text" id="detailDanwiiModyfy" class="input_form1" maxlength="5"/></td>
										</tr>
										<tr>
											<td height="26px" align="center" bgcolor="#F3F8FC"
												class="sub_table_b">점용료</td>
											<td colspan="3" bgcolor="f2f2f2" class="table_bl_left"><input type="text" id="detailMomeyModyfy" class="input_form1" maxlength="38" onchange="isNum(this,'점용료')"/>
											<input type="hidden" id="ditailSectionModyfy" name="ditailSectionModyfy" />
											<input type="hidden" id="ditailCodeModyfy" name="ditailCodeModyfy" />
											</td>
										</tr>
									</table>
									</td>
								</tr>
								<c:if test="${SIGU_CD == '000'}">
								<tr>
									<td align="right" height="30px"><a href="#"><img src="/img/register_icon2.gif" alt="등록" border="0" onClick="javascript:detailModyfyGo();"></a></td>
								</tr>
								</c:if>
							</table>
						</div>
						</form>
						</td>
					</tr>
					<!--   //********** END_현진_20120319 -->
					<tr>
						<td height="20px"></td>
					</tr>
					<tr>
					     <td height="34" class="sub_stan" align="left">전체건수 : <span class="sub_stan_blue">${totalCount}</span> 건 </td>
					</tr>
					<tr>
						<td align="left">
							<form id="sectionForm" name="sectionForm">					
							<input type="hidden" id="modyCODE" name="modyCODE" value=""/>
							<input type="hidden" id="modySECTION" name="modySECTION" value=""/>		
							<table width="100%" border="1" bordercolor="#c9dfed"
								style="border-collapse:collapse;" cellpadding="0" cellspacing="0"
								class="sub_table">
								<tr>		
									<!--  //********** BEGIN_현진_20120319 -->
									<td width="35px" height="26px" align="center" bgcolor="e5eff8" class="sub_table_b">
										<input type="checkbox" id="SELECT_ALL" name="SELECT_ALL" onclick="javascript:selectAll(this);">
									</td>
									<!--   //********** END_현진_20120319 -->	
									<td width="80px" height="26px" align="center" bgcolor="e5eff8" class="sub_table_b">점용구분</td>
									<td width="80px" align="center" bgcolor="e5eff8" class="sub_table_b">분류코드</td>
									<td align="center" bgcolor="e5eff8" class="sub_table_b" colspan="3">점용물 종류</td>								
								</tr>
								<c:forEach items="${purposeCodeList}" var="list" varStatus="idx">									 
									 <tr onMouseOver="this.style.backgroundColor='#f6f7f8'" onMouseOut="this.style.backgroundColor=''" onClick="javascript:detailInfo('${list.SECTION}','${list.CLASS_CD}','${list.SORT_CD}','${list.KIND_CD}','${list.CODE}');">
									 	<input type="hidden" name="title${list.CODE}" id="title${list.CODE}" value="[ ${list.SECTION_NAME} - ${list.CODE} ] ${list.CLASS_NM} - ${list.SORT_NM} <c:if test="${list.KIND_NM != null}">- ${list.KIND_NM}</c:if>"/>
									 	<!--  //********** BEGIN_현진_20120319 -->
									 	<input type="hidden" id="ditailSection${list.CODE}" name="ditailSection${list.CODE}" value="${list.SECTION}"/>
									 	<input type="hidden" id="ditailCode${list.CODE}" name="ditailCode${list.CODE}" value="${list.CODE}"/>
										<!--   //********** END_현진_20120319 -->			
										<!--  //********** BEGIN_현진_20120319 -->	
																					
										<td width="35px" height="26px" align="center" bgcolor="e5eff8" class="sub_table_b">
									 		<input type="checkbox" id="SELECT_ITEM" name="SELECT_ITEM"/>
									 		<input type="hidden" id="ITEM_CHECK" name="ITEM_CHECK" value=""/>
									 		<input type="hidden" id="SECTION_ARR" name="SECTION_ARR" value="${list.SECTION}"/>
									 		<input type="hidden" id="CODE_ARR" name="CODE_ARR" value="${list.CODE}"/>								 		
									 	</td>
									 	<!--   //********** END_현진_20120319 -->
										<td height="26px" align="center">${list.SECTION_NAME}</td>
										<td align="center">${list.CODE}</td>
										<td width="200px" align="center">${list.CLASS_NM}</td>
										<td width="250px" align="center">${list.SORT_NM}</td>
										<td align="center"><c:if test="${list.KIND_NM == null}">-</c:if>${list.KIND_NM}</td>
																													
									</tr>
								</c:forEach>
							</table>
							</form>
						</td>
					</tr>
					<tr>
					<td height="40" align="center">
						<table width="100%" border="0" cellspacing="0" cellpadding="0">
							<tr>
								<td align="center">
								<table border="0" cellpadding="0" cellspacing="0">
									<tr>
										<!-- 페이징시작 -->${strPageDivideForm}<!-- 페이징끝 -->	
									</tr>
								</table>
								</td>
							</tr>
						</table>
						</td>
					</tr>	
					
					<tr>
						<td height="10px"></td>
					</tr>					
					<!--  //********** BEGIN_현진_20120319 -->
					<c:if test="${SIGU_CD == '000'}">
					<tr>
						<td>
							<table width="150px" border="0" cellspacing="0" cellpadding="0" align="center">
								<tr>							
									<td width="60px" valign="middle" >
										<div id="addBtn2" style="display:none"><img src="/img/add_icon.gif" alt="추가" width="56" height="18" border="0" style="cursor: pointer;" onclick="javascript:registerPop('add2');"/></div>		
									</td>			
									<td><img src="/img/mod_icon.gif" alt="수정" width="56" height="18" border="0" style="cursor: pointer;" onclick="javascript:registerPop('modify');"/></td>
									<td><img src="/img/del_icon3.gif" alt="삭제" width="56" height="18" border="0" style="cursor: pointer;" onclick="javascript:deletePop();"/></td>
								</tr>
							</table>
						</td>
					</tr>
					</c:if>
					<!--   //********** END_현진_20120319 -->
				</table>
				
				</td>
			</tr>
		</table>
		</td>
	</tr>
</table>

</body>
</html>

