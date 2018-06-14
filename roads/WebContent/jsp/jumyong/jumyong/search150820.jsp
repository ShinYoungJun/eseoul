<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ include file="/jsp/common/loginCheck.jsp" %>
<%@ include file="/jsp/common/include.jsp" %>


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
<script language="javascript" src="/js/PopupCalendar.js"></script>
<script language="javascript" src="/js/common.js"></script>
<script>
	function goSearch()
	{
		var toDate = document.getElementById("searchToDate").value;
		var fromDate = document.getElementById("searchFromDate").value;
		var type = document.getElementById("TYPE").value;
		var section = document.getElementById("SECTION").value;
		var tax_set = document.getElementById("TAX_SET").value;
		var gu_cd = document.getElementById("GU_CD").value;
		var bj_cd = document.getElementById("BJ_CD").value;
		var hj_cd = document.getElementById("HJ_CD").value;
		var bonbun = document.getElementById("BONBUN").value;
		var bubun = document.getElementById("BUBUN").value;
		var jumyongName = document.getElementById("jumyongName").value;
		var check_yn = document.getElementById("check_yn").value;

		var numberValue = document.getElementById("numberValue").value;				
		
		toDate = removeDash(toDate);
		fromDate = removeDash(fromDate);

		var iFrm = document.getElementById("IFRM_PurposeCode");
		var purpose = iFrm.contentWindow.document.getElementById("PURPOSE_CD").value;
		var purpose1 = iFrm.contentWindow.document.getElementById("PURPOSE1");
			
		if(purpose1[purpose1.selectedIndex].text == "::선택::")
			purpose="";
		
		if(type.length==0)		//점용종류가 선택이 안되면 점용목적은 선택되지 않도록 purpose값을 지정 
			purpose="";
		
		location.href="/jumyong/jumyong/search.do?tDate="+toDate+"&fDate="+fromDate+"&type="+type+"&section="+section
		+"&tax_set="+tax_set+"&purpose="+purpose+"&bj_cd="+bj_cd+"&hj_cd="+hj_cd+"&bonbun="+bonbun+"&bubun="+bubun+"&jumyongName="
		+jumyongName+"&check_yn="+check_yn+"&gu_cd="+gu_cd+"&numberValue="+numberValue+"&search=1";
	}

	function	excel_Search()
	{
		
		var toDate = document.getElementById("searchToDate").value;
		var fromDate = document.getElementById("searchFromDate").value;
		var type = document.getElementById("TYPE").value;
		var section = document.getElementById("SECTION").value;


		var tax_set = document.getElementById("TAX_SET").value;
		var bj_cd = document.getElementById("BJ_CD").value;
		var hj_cd = document.getElementById("HJ_CD").value;

		var bonbun = document.getElementById("BONBUN").value;
		var bubun = document.getElementById("BUBUN").value;
		var jumyongName = document.getElementById("jumyongName").value;

		var check_yn = document.getElementById("check_yn").value;

		var gu_cd = document.getElementById("GU_CD").value;

		var numberValue = document.getElementById("numberValue").value;				
		
		toDate = removeDash(toDate);
		fromDate = removeDash(fromDate);

		var iFrm = document.getElementById("IFRM_PurposeCode");
		var purpose = iFrm.contentWindow.document.getElementById("PURPOSE_CD").value;
		var purpose1 = iFrm.contentWindow.document.getElementById("PURPOSE1");
			
		if(purpose1[purpose1.selectedIndex].text == "::선택::")
			purpose="";

		if(type.length==0)		//점용종류가 선택이 안되면 점용목적은 선택되지 않도록 purpose값을 지정 
			purpose="";
		
		location.href="/jumyong/jumyong/excel_search.do?tDate="+toDate+"&fDate="+fromDate+"&type="+type+"&section="+section
		+"&tax_set="+tax_set+"&purpose="+purpose+"&bj_cd="+bj_cd+"&hj_cd="+hj_cd+"&bonbun="+bonbun+"&bubun="+bubun+"&jumyongName="
		+jumyongName+"&check_yn="+check_yn+"&gu_cd="+gu_cd+"&numberValue="+numberValue+"&search=1";
	}	

	function goView(adminVal,sectionVal, useTypeVal)
	{
		var toDate = document.getElementById("searchToDate").value;
		var fromDate = document.getElementById("searchFromDate").value;
		var type = document.getElementById("TYPE").value;
		var section = document.getElementById("SECTION").value;
		
		var tax_set = document.getElementById("TAX_SET").value;
		var bj_cd = document.getElementById("BJ_CD").value;
		var hj_cd = document.getElementById("HJ_CD").value;

		var bonbun = document.getElementById("BONBUN").value;
		var bubun = document.getElementById("BUBUN").value;
		var jumyongName = document.getElementById("jumyongName").value;
		var check_yn = document.getElementById("check_yn").value;
		var numberValue = document.getElementById("numberValue").value;
		var currentPage = document.getElementById("currentPage").value;
		
		toDate = removeDash(toDate);
		fromDate = removeDash(fromDate);
		
		var iFrm = document.getElementById("IFRM_PurposeCode");
		var purpose = iFrm.contentWindow.document.getElementById("PURPOSE_CD").value;
				
		location.href="/jumyong/jumyong/view.do?ADMIN_NO="+adminVal+"&section="+sectionVal+"&tDate="+toDate+"&fDate="+fromDate+"&type="+type
		+"&tax_set="+tax_set+"&purpose="+purpose+"&bj_cd="+bj_cd+"&hj_cd="+hj_cd+"&bonbun="+bonbun+"&bubun="+bubun+"&jumyongName="+jumyongName+"&check_yn="+check_yn+"&numberValue="+numberValue+"&currentPage="+currentPage+"&useType="+useTypeVal;
	}

	

	
	function InitPage()
	{

		document.getElementById("resultDiv").style.width = 780;
		document.getElementById("resultSaewe").width = 1800;

		
		var now = new Date();
		var day=now.getDay();
		day = 1 - day;				
		Date.prototype.addDate = add_date; // Date 객체에 메서드 정의
		
		var fromDate = new Date(); // 현재 날짜 객체 생성
		
		fromDate.addDate(day); // 

		document.getElementById("searchToDate").value = getDateType1(now);
		document.getElementById("searchFromDate").value = getDateType1(fromDate);
		
		var toDate =   document.getElementById("toDateValue").value ;
		var fromDate =   document.getElementById("fromDateValue").value ;
		var search_flag =   document.getElementById("search_flag").value ;

		if(toDate != "" && toDate !="99999999" )
			document.getElementById("searchToDate").value = addDash(toDate);
 
		if(fromDate != "" && fromDate != "0")
			document.getElementById("searchFromDate").value = addDash(fromDate);
			
		if(document.getElementById("PURPOSE_CD").value.length<1){
			document.getElementById("IFRM_PurposeCode").src="/jsp/common/purposeCode/purposeCode2.jsp?SectionCode="+document.getElementById("TYPE").value+"&PURPOSE_CD=000"+"&search_flag="+search_flag;
		}
		
		if('${menu_param}' == 'jumyong'){
			top.frames[1].location="/jsp/menu/left/jumyong.jsp?menu_param=jumyong";	//왼쪽 메뉴 링크
		}
	}
	
	function getDateType1(date1)
	{
		var year= date1.getFullYear();
	    var mon = (date1.getMonth()+1)>9 ? ''+(date1.getMonth()+1) : '0'+(date1.getMonth()+1);
	    var day = date1.getDate()>9 ? ''+date1.getDate() : '0'+date1.getDate();
		
		return (year+"-"+mon+"-"+day);
	}
	
	function add_date(i) // 매서드가 될 함수 구현
	{
	   var currentDate; // 계산된 날
	   currentDate = this.getDate() + i*1; // 현재 날짜에 더해(빼)줄 날짜를 계산
	   this.setDate(currentDate); // 계산된 날짜로 다시 세팅
	}
	
	function removeDash(num)
	{	
		return num.split('-').join("");
	}
	
	function addDash(num)
	{
		return (num.substr(0,4)+"-"+num.substr(4,2)+"-"+num.substr(6,2));
	}
	
	// 점용 종류 선택시 점용 목적 코드 나오게 함.
	function	Select_UseType(sel)
	{
//		document.getElementById("UseType1").style.display = "none";
//		document.getElementById("UseType2").style.display = "none";
		
//		if(sel.value == '2' || sel.value == '3')	
//			document.getElementById("UseType2").style.display = "block";	//	하천, 구거
//		else						
//			document.getElementById("UseType1").style.display = "block";	//	도로		
		document.getElementById("IFRM_PurposeCode").src="/jsp/common/purposeCode/purposeCode2.jsp?SectionCode="+sel.value+"&PURPOSE_CD=&search_flag=1";
	}
	
	
	function checkKeySearch(){
		if(event.keyCode == "13")
			goSearch();
	}	
	
			
</script>



</head>

<body onload="javascript:InitPage();">

<form id="form" name="form">

<input type="hidden" id="currentPage" name="currentPage" value="${currentPage}">
<input type="hidden" id="PURPOSE_CD" name="PURPOSE_CD" value="${purpose_cd}">
<input id="toDateValue" name="toDateValue"  value="${toDate}" type="hidden">
<input id="fromDateValue" name="fromDateValue" value="${fromDate}" type="hidden">
<input id="search" name="search" type="hidden" value="${search}">
<input id="search_flag" name="search_flag" type="hidden" value="${search_flag}">

<table width="800" border="0" cellpadding="0" cellspacing="0">
  <tr>
    <td height="43"><img src="/img/sub1_cont2_title.gif" width="800" height="43"></td>
  </tr>
  <tr>
    <td ><table width="780" border="0" cellspacing="0" cellpadding="0">
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
                <td>
                <table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
                    <tr>
                      <td height="32" align="center" bgcolor="e5eff8" class="sub_table_b" >갱신 기간</td>
                      <td bgcolor="eaeaea" class="table_bl_left" >
	                      <input id = "searchFromDate" name="searchFromDate" type="text" class="input_form1" style="width:80px" readonly>
	                      <img src="/img/calendar_icon.gif" style="vertical-align:middle;cursor:pointer" onclick="popUpCalendar(this, document.getElementById('searchFromDate'), 'yyyymmdd');">
						  &nbsp;&nbsp;~&nbsp;&nbsp;
						  <input id = "searchToDate" name="searchToDate" type="text" class="input_form1" style="width:80px" readonly>
	                      <img src="/img/calendar_icon.gif" style="vertical-align:middle;cursor:pointer" onclick="popUpCalendar(this, document.getElementById('searchToDate'), 'yyyymmdd');">
	                  </td>
						<td width="13%" align="center" bgcolor="e5eff8" class="sub_table_b">점용구분</td>
						<td width="37%" bgcolor="eaeaea" class="table_bl_left">
					  		<select id="SECTION" name="SECTION" class="input_form1" style="width:130px" >
								${use_section}
							</select>
						</td>
                    </tr>
                    <tr>
                      <td width="13%" height="32" align="center" bgcolor="e5eff8" class="sub_table_b">점용종류</td>                      
					  <td width="37%" bgcolor="eaeaea" class="table_bl_left">
						<select id="TYPE" name="TYPE" class="input_form1" style="width:130px" OnChange="Select_UseType(this);">
							${use_type}
					    </select>
					   </td>
                      <td height="32" align="center" bgcolor="e5eff8" class="sub_table_b" >검토여부</td>
                      <td bgcolor="eaeaea" class="table_bl_left" width="30%">
						  <select id="check_yn" name="check_yn" class="input_form1" style="width:130px">
								${check_yn}
	                      </select>
					  </td>
                    </tr>
					
                    <tr>
                      <td height="32" align="center" bgcolor="e5eff8" class="sub_table_b">세입구분</td>
					  <td bgcolor="eaeaea" class="table_bl_left" colspan="3">
					  	<select id="TAX_SET" name="TAX_SET" class="input_form1" style="width:130px">
							${taxation_section}
					  	</select>
					  </td>
                    </tr>
                    <tr>
					  	<td height="32" align="center" bgcolor="e5eff8" class="sub_table_b">시군구</td>
					  	<td bgcolor="eaeaea" class="table_bl_left">
                          <select id="GU_CD" name="GU_CD" class="input_form1" style="width:130px">
                          ${gu_code}
                          </select>
					  	</td>
					  	<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">건물/도로 번지 </td>
	                      <td bgcolor="eaeaea" class="table_bl_left">
		                          <input id="BONBUN" name="BONBUN" type="text" class="input_form1" style="width:40px" value="${bonbun}">
								- <input id="BUBUN" name="BUBUN" type="text" class="input_form1" style="width:40px" value="${bubun}">
	                      </td>
					</tr> 
                    <tr>
					  	<td height="32" align="center" bgcolor="e5eff8" class="sub_table_b">법정동</td>
					  	<td bgcolor="eaeaea" class="table_bl_left">
					  		<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
							<tr>
	                          <td>
	                          <select id="BJ_CD" name="BJ_CD" class="input_form1" style="width:130px">${bjdong_code}
	                          </select>
	                          </td>
						  	</tr>
					  		</table>
					  	</td>
					  	<td height="32" align="center" bgcolor="e5eff8" class="sub_table_b">행정동</td>
					  	<td bgcolor="eaeaea" class="table_bl_left">
					  		<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
							<tr>
	                          <td>
	                          <select id="HJ_CD" name="HJ_CD" class="input_form1" style="width:130px">${hjdong_code}
	                          </select>
	                          </td>
						  	</tr>
					  		</table>
					  	</td>
					</tr> 
                    <tr>
					  <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b" >관리번호</td>
                      <td bgcolor="eaeaea" class="table_bl_left" width="35%">
					  <input id="numberValue" name="numberValue" type="text" class="input_form1" style="width:130px"  onKeyDown="javascript:checkKeySearch();" value="${numberValue}">
					  </td>
					   <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">점용인/법인명</td>
                      <td bgcolor="eaeaea" class="table_bl_left">
					  <table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
                        <tr>
                          <td><input id="jumyongName" name="jumyongName" type="text" class="input_form1" style="width:130px" onKeyDown="javascript:checkKeySearch();" value="${jumyongName}"></td>
                        </tr>
                      </table></td>
                    </tr>
                    <tr>
					  <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">점용목적</td>
					  <td colspan="3" bgcolor="eaeaea" class="table_bl_left">
					  	<table width="100%" border="0" cellpadding="0" cellspacing="0" class="sub_stan">
							<iframe id="IFRM_PurposeCode" align="absmiddle" scrolling="no" frameborder="0" framespacing="0" width="100%" height="25" src="/jsp/common/purposeCode/purposeCode2.jsp?SectionCode=${type}&PURPOSE_CD=${purpose_cd}"></iframe>
					  	</table>
					  </td> 
                    </tr>
                </table>
                
                
                </td>
              </tr>
 
                <tr>
                  <td height="40" align="right"><img src="/img/inquiry_icon2.gif" alt="조회" width="56" height="18" border="0" onclick="javascript:goSearch();" style="cursor:pointer" >
                  </td>
                </tr>
                <tr>
                  <td height="1" bgcolor="#EAEAEA"></td>
                </tr>
                <tr>
                  <td height="34" class="sub_stan">전체건수 : <span class="sub_stan_blue">${listCount}</span>건 </td>
                </tr>
                <tr>
                  <td>
					<div id="resultDiv"  style="width:780px; padding:10px; overflow-x:scroll; scrollbar-face-color:#EEF8FB; scrollbar-3dlight-color:#BBBDB6; scrollbar-highlight-color:#EEF8FB; scrollbar-shadow-color:#BBBDB6; scrollbar-darkshadow-color:#EEF8FB; scrollbar-track-color:#EEF8FB; scrollbar-arrow-color:#BBBDB6"> 
						<table id="resultSaewe" width="1800px" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
                      <tr>
                        <td width="28" height="35" align="center" bgcolor="e5eff8" class="sub_table_b" width="50">번호</td>
                        <td width="70" align="center" bgcolor="e5eff8" class="sub_table_b">관리번호</td>
                        <td width="40" align="center" bgcolor="e5eff8" class="sub_table_b">점용<br/>종류</td>
                        <td width="40" align="center" bgcolor="e5eff8" class="sub_table_b">점용<br/>구분</td>
                        <td width="40" align="center" bgcolor="e5eff8" class="sub_table_b">세입<br/>구분</td>
                        <td align="center" bgcolor="e5eff8" class="sub_table_b">점용인</td>
												<td align="center" bgcolor="e5eff8" class="sub_table_b">점용인<br/>우편번호</td>
                        <td align="center" bgcolor="e5eff8" class="sub_table_b">점용인 주소</td>
                        <td align="center" bgcolor="e5eff8" class="sub_table_b">점용인 도로명 주소</td>
                        <td align="center" bgcolor="e5eff8" class="sub_table_b">우편물 송달지 도로명 주소</td>
                        <td align="center" bgcolor="e5eff8" class="sub_table_b">점용지</td>   
                        <td align="center" bgcolor="e5eff8" class="sub_table_b">점용지<br/>도로명 주소</td>
                        <td align="center" bgcolor="e5eff8" class="sub_table_b">도로<br/>주소</td>     
                        <td align="center" bgcolor="e5eff8" class="sub_table_b">면적<br/>(㎡)</td> 
                        <td align="center" bgcolor="e5eff8" class="sub_table_b">점용목적</td>
                        <td align="center" bgcolor="e5eff8" class="sub_table_b">감면/지분율</td>
                        <td align="center" bgcolor="e5eff8" class="sub_table_b">감면/지분 사유</td>                       
                        <td width="62" align="center" bgcolor="e5eff8" class="sub_table_b">갱신일자</td>                                                
                        <td width="52" align="center" bgcolor="e5eff8" class="sub_table_b">검토여부</td>
                      </tr>
                                  
                      <c:forEach items="${blist1}" var="board" varStatus="idx">	                      
	                      <tr onMouseOver="this.style.backgroundColor='#f6f7f8'" onMouseOut="this.style.backgroundColor=''" style="cursor:pointer" onclick="javascript:goView('${board.ADMIN_NO}','${board.SECTION}', '${board.TYPE_NAME}');">
							<td height="26" align="center"> ${board.NO} </td>
	                        <td align="center" >
	                        	${board.ADMIN_NO2}
							</td>
	                        <td align="center">${board.TYPE_NAME}</td>
	                        <td align="center">${board.SECTION_NAME}</td>
	                        <td align="center">${board.TAX_SET_NAME}</td>                        
	                        <td align="center">${board.NAME}</td>
	                        <td align="center">${board.POST}</td>
                        	<td align="center">${board.ADDR}</td>
                        	<td align="center">${board.SONGDALGI}</td>
							<!--  //********** BEGIN_KANG_20120424 -->
							<!-- 
							<td align="center">${board.SI}&nbsp;${board.GUN}&nbsp;${board.DORO_NM}&nbsp;${board.BD_NM}&nbsp;${board.BD_BON}&nbsp;${board.BD_BU}</td>
							-->
							<td align="center"><c:if test ="${board.DORO_NM != null && board.DORO_NM != ''}"> ${board.SI} ${board.GUN} ${board.DORO_NM} ${board.BD_BON}<c:if test="${board.BD_BU != null && board.BD_BU != '0'}">-${board.BD_BU}</c:if> ${board.BD_NM}</c:if></td>
							<!--   //********** END_KANG_20120424 -->                        	 
                  <td align="center">${board.BJ_NM} ${board.BONBUN}<c:if test="${board.BUBUN != null}">-</c:if>${board.BUBUN}</td>
                  <td align="center">${board.JUMYONGJI_DORO_ADDR}</td>
                  <td align="center">${board.ROAD_ADDR}</td>
                  <td align="center">${board.AREA_SIZE}</td>
	         				<td align="center">${board.PURPOSE_CLASSNM}</td>
	         				<td align="center">${board.REDUCTION_RATE}</td>
							<td align="center" width="200">${board.REDUCTION_REASON}</td>                                                                                   	                        
	                        <td align="center">${rnic:addDash(board.UP_DATE)}</td>                                                                                    
	                        <td align="center"><font color="red">${board.CHECK_NAME}</font></td>            
	                      </tr>
						 </c:forEach>
                    </table>
                    </div>
				  </td>
                </tr>
                
                <tr>
	                <td height="40" align="center">
		                <table width="100%" border="0" cellspacing="0" cellpadding="0">
		                    <tr>
		                      <td align="center">
		                      	<table border="0" cellpadding="0" cellspacing="0">
			                        <tr>
			                        	${strPageDivideForm}
			                        </tr>
		                      	</table>
		                      </td>
		                    </tr>
		                  </table>
	                  </td>
	              </tr>
	              
	              <tr>              
	                <td height="40" align="right">
		                <table border="0" width="100%">
		                	<tr>
			                	<td >
				                	<!-- img src="/img/excel_icon.gif" alt="EXCEL 변환" border="0" -->
				                	<img src="../../../img/excel_icon.gif" alt="EXCEL 변환" border="0" onclick="javascript:excel_Search();" style="cursor:hand">
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
</html>











