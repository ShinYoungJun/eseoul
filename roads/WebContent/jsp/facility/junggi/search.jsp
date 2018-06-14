<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ include file="/jsp/common/loginCheck.jsp" %>
<%@ include file="/jsp/common/include.jsp" %>


<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=euc-kr" />
<title>::::: 서울시 도로점용관리시스템 :::::</title>
<style type="text/plain">
<!--
body {
	margin: 0px;
	background-image: url(/img/left_back.gif);
}
-->
</style>
<link href="/css/roads.css" rel="stylesheet" type="text/css">
<script><!--
	
	function initPage()
	{
		setYear();
	}

	function setYear()
	{
		now = new Date();
		Y = now.getYear();
		
		var strYear = "${year}";
		
		 newItem = new Option(0);
		 document.getElementById("year").options[0]  = newItem;
		 document.getElementById("year").options[0].text = "::전체::";
		 document.getElementById("year").options[0].value = "0";

		
		var j = 0;
		var k = 0;
		
		for(var i = 1 ; i<=11 ; i++){

			   newItem = new Option(i);

			   document.getElementById("year").options[i]  = newItem;
					if(i<=5){
						if(i==1){
							k=5;
						}
						else if(i==2){
							k=4;
						}
						else if(i==3){
							k=3;
						}
						else if(i==4){
							k=2;
						}
						else if(i==5){
							k=1;
						}else{
							k=0;
						}
							  
						  document.getElementById("year").options[i].text = Y+k;
						  document.getElementById("year").options[i].value = Y+k;
						  if(strYear == Y+k)document.getElementById("year").options[i].selected = true;								

								}
					else{
						  
						  document.getElementById("year").options[i].text = Y-i+5+1;
						  document.getElementById("year").options[i].value = Y-i+5+1;				  
						  if(strYear == Y-i+5+1)document.getElementById("year").options[i].selected = true; 
						
				  }				  
					 
				
			} 
	}
	
	function goSearch()
	{
		//var year = document.getElementById("year").value;
		//var req_nm = document.getElementById("req_nm").value;
		//location.href="/facility/junggi/search.do?year="+year+"&req_nm="+req_nm;
		var form = document.form;
		form.submit();
	}
	
	function goView(gu_cd, corp_cd, year, admin_no,tax_set)
	{
		location.href="/facility/junggi/view.do?gu_code="+gu_cd+"&corp_cd="+corp_cd+"&year="+year+"&admin_no="+admin_no+"&tax_set="+tax_set;
	}

--></script>
</head>
<body onload="initPage();">
<table width="800" border="0" cellpadding="0" cellspacing="0">
  <tr>
    <td height="43"><img src="/img/facility_junggi_top.gif" width="800" height="43"></td>
  </tr>
  <tr>
    <td align="center"><table width="780" border="0" cellspacing="0" cellpadding="0">      
      <tr>
        <td height="1" bgcolor="eaeaea"></td>
      </tr>
      <tr>
        <td height="14"></td>
      </tr>
      <tr>
        <td><table width="780" border="0" cellspacing="0" cellpadding="0">
          <tr>
            <td height="22" background="/img/tab_line_blue.gif"><table border="0" cellspacing="0" cellpadding="0">
                <tr>
                  <td><img src="/img/sub_facility_title1.gif" alt ="시설물조회"width="110" height="22"></td>
                </tr>
            </table></td>
          </tr>
		<tr>
            <td align="center" class="contborder_purple"><table width="100%" border="0" cellspacing="0" cellpadding="0">
              <tr>
                <td>
                <form action="/facility/junggi/search.do" name="form" method="post">
                <table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
                    <tr>
                      <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">신청년도</td>
                      <td bgcolor="eaeaea" class="table_bl_left">
					  <select name="year" id="year" class="input_form1" style="width:100px">
                       <option></option>
                      </select></td>
                      <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">점용인/법인명</td>
                      <td bgcolor="eaeaea" class="table_bl_left">
					  <table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
                        <tr>
                          <td><input name="req_nm" id="req_nm" type="text" class="input_form1" style="width:130px" value="${req_nm}"></td>
                        </tr>
                      </table></td>
                    </tr>
                </table>
                </form>
                </td>
              </tr>
                <tr>
                  <td height="40" align="right">
                  <img src="/img/inquiry_icon2.gif" alt="조회" width="56" height="18" border="0" style="cursor:pointer" onclick="javascript:goSearch();"></td>
                </tr>
                <tr>
                  <td height="1" bgcolor="#EAEAEA"></td>
                </tr>
                <tr>
                  <td height="34" class="sub_stan">전체건수 : <span class="sub_stan_blue">${searchlistCount}</span>건 </td>
                </tr>
                <tr>
                  <td><table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">                	  
					  <tr>
					  	<td align="center" bgcolor="e5eff8" class="sub_table_b" height="26">년도</td>
					  	<td align="center" bgcolor="e5eff8" class="sub_table_b">점용인명</td>
					  	<td align="center" bgcolor="e5eff8" class="sub_table_b">지점명</td>
					  	<td align="center" bgcolor="e5eff8" class="sub_table_b">과세구분</td>
					  	<td align="center" bgcolor="e5eff8" class="sub_table_b">점용료(원)</td>
					  	<td align="center" bgcolor="e5eff8" class="sub_table_b">총연장(m)</td>
					  	<td align="center" bgcolor="e5eff8" class="sub_table_b">개소</td>
					  	<!-- <td align="center" bgcolor="e5eff8" class="sub_table_b">신설분 연장<br>(개소)</td>             -->            
					  	<td align="center" bgcolor="e5eff8" class="sub_table_b">산출여부</td>                        
					  </tr>
                      <c:forEach items="${searchList}" var="board" varStatus="idx">	                          
                      <tr onMouseOver="this.style.backgroundColor='#f6f7f8'" onMouseOut="this.style.backgroundColor=''" style="cursor:pointer"
                      onclick="javascript:goView('${board.GU_CODE}','${board.CORP_CD}','${board.YEAR}', '${board.ADMIN_NO}','${board.TAX_SET }');">                      
                        <td align="center" height="26">${board.YEAR}</td>
                        <td align="center">${board.OFFICE_NM}</td>
                        <td align="center">${board.JIJUM_NM}</td>
                        <td align="center">${board.USE_SECTION}</td>
                        <td align="center">${board.JUM_SUM}원</td>
                        <td align="center">${board.COUNT_M}</td>
                        <td align="center">${board.GAE_COUNT}</td>
                        <%-- <td align="center">${board.SIN_M_GAE}</td> --%>
                        <td align="center"><font color="red">${board.CAL_YN}</font></td>
                      </tr>
                      </c:forEach>
                  </table></td>
                </tr>
                <tr>
					<td height="40" align="center">
					<table border="0" cellpadding="0" cellspacing="0"><tr>
                        ${strPageDivideForm}
                        </tr>
                        
                      </table></td>
              </tr>
            </table></td>
          </tr>          
          
          
          
        </table></td>
      </tr>
      <tr>
        <td height="30"></td>
      </tr>


</table></td></tr></table>
</body>
</html>
