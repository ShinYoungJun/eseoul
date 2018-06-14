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
	background-image: url(/img/left_back.gif);
}
-->
</style>
<link href="/css/roads.css" rel="stylesheet" type="text/css">
<script language="javascript" src="/js/PopupCalendar.js"></script> 
<script>
	function goSearch()
	{
//		var pType = document.getElementById("period_type").value;
		var toDate = document.getElementById("searchToDate").value;
		var fromDate = document.getElementById("searchFromDate").value;
		var type = document.getElementById("TYPE").value;
		var section = document.getElementById("SECTION").value;
//		var ownergroup = document.getElementById("OWNER_GROUP").value;		
		var purpose = document.getElementById("PURPOSE_CD").value;		
		var tax_set = document.getElementById("TAX_SET").value;
		var bj_cd = document.getElementById("BJ_CD").value;
		var hj_cd = document.getElementById("HJ_CD").value;
//		var san_ck = document.getElementById("SAN_CK").checked;
		var bonbun = document.getElementById("BONBUN").value;
		var bubun = document.getElementById("BUBUN").value;
		var jumyongName = document.getElementById("jumyongName").value;
//		var tong = document.getElementById("TONG").value;
//		var ban = document.getElementById("BAN").value;
		var check_type = document.getElementById("check_type").value;
//		var number_type = document.getElementById("number_type").value;
		var numberValue = document.getElementById("numberValue").value;				
		
		
		
		toDate = removeDash(toDate);
		fromDate = removeDash(fromDate);

//		if(san_ck) san_ck = "1";
//		else san_ck = "0";
		
		

		location.href="/gapan/jumyong/search.do?tDate="+toDate+"&fDate="+fromDate+"&type="+type+"&section="+section
		+"&tax_set="+tax_set+"&purpose="+purpose+"&bj_cd="+bj_cd+"&hj_cd="+hj_cd
		+"&bonbun="+bonbun+"&bubun="+bubun+"&jumyongName="+jumyongName+"&check_type="+check_type+"&numberValue="+numberValue;
	}
	
	function InitPage()
	{
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
			
</script>



</head>

<body onload="javascript:InitPage();Init_PurposeCode();">

<form id="jumyongForm">


<input name="toDateValue" id = "toDateValue" value="${toDate}" type="hidden">
<input name="fromDateValue" id = "fromDateValue" value="${fromDate}" type="hidden">
<input name="jumyongNameValue" id = "jumyongNameValue" value="${jumyongName}" type="hidden">
<input name="numberValueValue" id = "numberValueValue" value="${numberValue}" type="hidden">
<table width="800" border="0" cellpadding="0" cellspacing="0">
  <tr>
    <td height="43"><img src="/img/sub1_cont2_title.gif" width="800" height="43"></td>
  </tr>
  <tr>
    <td ><table width="780" border="0" cellspacing="0" cellpadding="0">
      <tr>
        <td height="40" align="right">
	<!--상단 기안문상신,도움말 메뉴-->
		<table border="0" cellspacing="0" cellpadding="0">
          <tr>
            <td height="8" colspan="2"></td>
            </tr>
          <tr>
            <td><a href="#"><img src="/img/report_icon.gif" alt="기안문 상신" width="92" height="18" border="0"></a></td>
            <td><a href="#"><img src="/img/help_icon.gif" alt="도움말" width="65" height="18" border="0"></a></td>
            </tr>
        </table>
	<!--상단 기안문상신,도움말 메뉴-->		</td>
      </tr>
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
                      <td height="32" align="center" bgcolor="e5eff8" class="sub_table_b" width="15%">등록 기간</td>
                      <td colspan="3" bgcolor="eaeaea" class="table_bl_left" width="40%">
					  <table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
                        <tr>
                          <td>&nbsp;<input name="searchFromDate" id = "searchFromDate" type="text" class="input_form1" style="width:100px" disabled="true"></td>
                          <td>&nbsp;<img src="/img/calendar_icon.gif" style="cursor:pointer" 
                            onclick="popUpCalendar(this, document.getElementById('searchFromDate'), 'yyyymmdd');">
						  </td>
                          <td width="16" align="center">&nbsp;&nbsp;~&nbsp;&nbsp;</td>
                          <td>
                          	<input name="searchToDate" id="searchToDate" type="text" class="input_form1" style="width:100px" disabled="true"></td>
                          <td>&nbsp;<img src="/img/calendar_icon.gif" style="cursor:pointer" onclick="popUpCalendar(this, document.getElementById('searchToDate'), 'yyyymmdd');">
                          </td>
                          <td width="20"></td>
						</tr>
                      </table></td>
                      
                      
                    </tr>
                  
					
                    <tr>
                      <td width="100" height="32" align="center" bgcolor="e5eff8" class="sub_table_b">점용종류</td>
					  <td bgcolor="eaeaea" class="table_bl_left">
						<select name="TYPE" class="input_form1" style="width:130px" >
							${use_type}
					    </select></td>
                      <td width="100" align="center" bgcolor="e5eff8" class="sub_table_b">점용구분</td>
					  <td bgcolor="eaeaea" class="table_bl_left">
					  	<select name="SECTION" ID="SECTION" class="input_form1" style="width:130px" >
							${use_section}
						</select></td>
                    </tr>
					
                    <tr>
                      <td align="center" bgcolor="e5eff8" class="sub_table_b">세입구분</td>
					  <td bgcolor="eaeaea" class="table_bl_left"><select name="TAX_SET" class="input_form1" style="width:130px">
						${taxation_section}
					  </select></td>
					  
					  
					   <td height="32" align="center" bgcolor="e5eff8" class="sub_table_b" width="15%" >검토여부</td>
                      <td bgcolor="eaeaea" class="table_bl_left" width="30%">
					  <select name="check_type" id="check_type" class="input_form1" style="width:130px">
							${check_type}
                      </select>
					  </td>
					  
                    </tr>
					
					
					
                    <tr>
				  <td height="32" align="center" bgcolor="e5eff8" class="sub_table_b">법정/행정동 </td>
				  <td bgcolor="eaeaea" class="table_bl_left">
				  <table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
					<tr >
					  
                          <td width="14%">법정동</td>
                          <td width="36%" >
                          <select name="BJ_CD" class="input_form1" style="width:70px">${bjdong_code}
                          </select>
                          </td>
                          <td width="14%" >행정동</td>
                          <td width="36%" ><select name="HJ_CD" class="input_form1" style="width:90px">${hjdong_code}
                          </select></td>


						
					  </tr>
				  </table></td>
				  <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">번 지 </td>
                      <td bgcolor="eaeaea" class="table_bl_left">
					  <table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
                        <tr>
                          <td>
                          
                          <input name="BONBUN" type="text" class="input_form1" style="width:40px" >번지
						- <input name="BUBUN" type="text" class="input_form1" style="width:40px" >호
                          
                          
                          </td>
                        </tr>
                      </table></td>
				</tr> 					
                    <tr>                      
					  <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b" width="15%">관리/접수번호</td>
                      <td bgcolor="eaeaea" class="table_bl_left" width="35%">
					  <input name="numberValue" type="text" class="input_form1" style="width:130px">
					  </td>
					  
					   <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">점용인/법인명</td>
                      <td bgcolor="eaeaea" class="table_bl_left">
					  <table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
                        <tr>
                          <td><input name="jumyongName" id="jumyongName" type="text" class="input_form1" style="width:130px"></td>
                        </tr>
                      </table></td>
					  
					  
                    </tr>
                    
				<tr>
				  <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">점용목적</td>
				  <td colspan="3" bgcolor="eaeaea" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
					<tr>
						<jsp:include page="/jsp/common/purposeCode/purposeCode.jsp" flush="true"/>
					</tr>
				  </table></td>
			    </tr>
                    
                    
                    

                </table></td>
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
                  <td><table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
                      <tr>
                        <td height="28" align="center" bgcolor="e5eff8" class="sub_table_b">번호</td>
                        <td align="center" bgcolor="e5eff8" class="sub_table_b">관리번호</td>
                        <td align="center" bgcolor="e5eff8" class="sub_table_b">점용종류</td>
                        <td align="center" bgcolor="e5eff8" class="sub_table_b">점용구분</td>
                        <td align="center" bgcolor="e5eff8" class="sub_table_b">세입구분</td>
                        <td align="center" bgcolor="e5eff8" class="sub_table_b">점용인</td>
                        <td align="center" bgcolor="e5eff8" class="sub_table_b">점용지</td>
                        <td align="center" bgcolor="e5eff8" class="sub_table_b">점용기간</td>
                        <td align="center" bgcolor="e5eff8" class="sub_table_b">점용목적코드</td>
                        <td align="center" bgcolor="e5eff8" class="sub_table_b">등록일자</td>
                        <td align="center" bgcolor="e5eff8" class="sub_table_b">갱신일자</td>                        
                        <td align="center" bgcolor="e5eff8" class="sub_table_b">검토여부</td>
                      </tr>
                      
                      <c:forEach items="${blist1}" var="board" varStatus="idx">	                      
                      <tr onMouseOver="this.style.backgroundColor='#f6f7f8'" onMouseOut="this.style.backgroundColor=''">
                     
						<td height="26" align="center"> ${idx.count} </td>
                        <td align="center"><a href="/jsp/gapan/jumyong/info.jsp?no=${board.ADMIN_NO}&section=${board.SECTION}">${board.ADMIN_NO2}</a></td>
                        <td align="center">${board.TYPE_NAME}</td>
                        <td align="center">${board.SECTION_NAME}</td>
                        <td align="center">${board.TAX_SET_NAME}</td>                        
                        <td align="center">${board.NAME}</td>
                        <td align="center">${board.BJ_NM}</td>

                        <td align="center">${board.MUL_FROMDATE} ~ ${board.MUL_TODATE}</td>
                        <td align="center">${board.PURPOSE_CD}</td>                                    
                        <td align="center">${board.REGDATE}</td>                                    
                        <td align="center">${board.UP_DATE}</td>                                                                                    
                        <td align="center">${board.CHECK_NAME}</td>            
                                                  
                      </tr>
					 </c:forEach>
					 
                  </table></td>
                </tr>
                
                <tr>
	                <td height="40" align="center"><table width="100%" border="0" cellspacing="0" cellpadding="0">
	                    <tr>
	                      <td align="center"><table border="0" cellpadding="0" cellspacing="0">
	                        <tr>
	                        ${strPageDivideForm}
	                        </tr>
	                        
	                      </table></td>

	                    </tr>
	                    <tr>


	                    </tr>
	                  </table></td>
	              </tr>
                
            </table></td>
          </tr>
          <tr>
            <td height="40" align="right"><a href="#"><img src="/img/excel_icon.gif" alt="EXCEL 변환" border="0"></a></td>
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

