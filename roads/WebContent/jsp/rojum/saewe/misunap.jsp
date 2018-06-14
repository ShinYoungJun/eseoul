<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ include file="/jsp/common/environment_setting.jsp" %> 
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
            #tr_fixed_header
            {
                position: relative;
                top: expression(this.offsetParent.scrollTop);
                z-index: 20;
            }

            -->
        </style>
        <link href="/css/roads.css" rel="stylesheet" type="text/css">
        
        <script language="javascript" src="/js/common.js"></script>
        <script language="javascript" src="/js/calculation.js"></script>
        <script language="javascript" src="/js/PopupCalendar.js"></script>
        <script language="javascript" src="/js/Ajax_request.js"></script>
		<script language="javascript" src="/js/selectItem.js"></script>
		<script language="javascript" src="/js/Check_inputbox.js"></script>
		<script language="javascript" src="/jsp/RexServer/rexscript/rexpert.js"></script>
		<script language="javascript" src="/jsp/RexServer/rexscript/rexpert_properties.js"></script>

<script type="text/javascript">
//<![CDATA[

	function	Init()
	{	
		
		var cal_mode = '${CAL_MODE}';
		
		var tax_gubun = document.getElementById('TAX_GUBUN').value;

		if(cal_mode == '3' && tax_gubun == '3'){
			document.form.CAL_MODE.options[1].selected = true;			
		}else if(cal_mode == '3' && tax_gubun == '2'){
			document.form.CAL_MODE.options[2].selected = true;
		}else{
			document.form.CAL_MODE.options[0].selected = true;
		}
		
	}

	function checkKeySearch()
	{
		if(event.keyCode == 13) Search();
	}
	
	
	function changeCalmode(obj){
	
		for(var i = 0 ; i < obj.options.length ; i++){
			if(obj.options[i].selected){
				if(i == 1){
					document.getElementById('TAX_GUBUN').value = "3";				
				}else if(i == 2){
					document.getElementById('TAX_GUBUN').value = "2";
				}else{
					document.getElementById('TAX_GUBUN').value = "";
				}
			}
		}
	}	

	
    function scroll_Left() {
    	document.all.topLine2.scrollLeft = document.all.mainDisplay2.scrollLeft;
    }
      
	function	Search()
	{
		var form = document.form;

		form.currentPage.value	= 1;
		form.action = "/rojum/saewe/misunap.do";
		form.submit();
	}		
	
	function	View(adminno,seq, calmode, taxgubun)
	{
		var form = document.form;		
		
		form.action = "/rojum/saewe/view.do?ADMIN_NO=" + adminno+"&SEQ="+seq+"&misunap=Y&tax="+taxgubun;			
		
		form.submit();
	}	
//]]>
</script>
</head>

<body onload="Init();">
<form id="form" name="form" method="post">
<input type="hidden" id="currentPage" name="currentPage" value="${currentPage}">
<input type="hidden" id="TOTALCNT" name="TOTALCNT" value="${totalcnt}">
<input type="hidden" id="excel" name="excel" value="">
<input type="hidden" id="message" name="message" value="${message}">
<input type="hidden" id="USER_ID" name="USER_ID" value="${USER_ID}">
<input type="hidden" id="TAX_GUBUN" name="TAX_GUBUN" value="${TAX_GUBUN}">


<table width="800px" border="0" cellpadding="0" cellspacing="0">
  <tr>
    <td height="43">
    	<img src="/img/sub7_cont2-2_title.gif" width="800" height="43">
	</td>
  </tr>
  <tr>
    <td align="center">
    <table width="780" border="0" cellspacing="0" cellpadding="0">
      <tr>
        <td align="left"><table width="780" border="0" cellspacing="0" cellpadding="0">
          <tr>
            <td height="22" background="/img/tab_line_blue.gif">
            </td>
          </tr>
          
          <tr>
            <td class="contborder_blue"><table width="100%" border="0" cellspacing="0" cellpadding="0">
                <tr>
                  <td>
                  	<table width="350px" width="left" border="0">
                  	
                  		<tr>
                  			<td>
		                  		<table width="300px" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
							    <tr>						
								  <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">산출목적</td>
								  <td bgcolor="eaeaea" class="table_bl_left" colspan="1">
									  <select id="CAL_MODE" name="CAL_MODE" class="input_form1" style="width:100px" onchange="changeCalmode(this);">
									  	<option value="%">::전체::</option>
									  	<option value="3">과태료(사전통지)</option>
									 	<option value="3">과태료</option>
									  </select>
								  </td>						  
								</tr>                                 
			                  	</table>	
                  			</td>                  			
                  			<td height="32" align="left">
                  			<a href="javascript:Search()"><img src="/img/inquiry_icon2.gif" alt="조회" width="56" height="18" border="0"></a>			
                  			</td>
                  		</tr>
                  	</table>
	                  
                  </td>
                </tr>                

                <tr>
                  <td height="1" bgcolor="#EAEAEA"></td>
                </tr>
                <tr>
                  <td height="34" class="sub_stan">전체건수 : <span class="sub_stan_blue">${totalcnt}</span>건 </td>
                </tr>
                <tr>
                  <td>
                  	<table width="780px" cellpadding="0" cellspacing="0" border="0" class="sub_table" bordercolor="#c9dfed" style="border-collapse:collapse;">
						  <TR>
						    <TD width="754px" valign="top">
						      <DIV id="topLine2" style="width:737px;overflow:hidden;">
						      <TABLE width="1890px" cellpadding="0" cellspacing="0" border="1" class="sub_table" bordercolor="#c9dfed" style="border-collapse:collapse;">
						          <TR>
      						  		<td width="100px" height="26px" align="center" bgcolor="e5eff8" class="sub_table_b">관리번호</td>
		                            <td width="40px" align="center" bgcolor="e5eff8" class="sub_table_b">년도</td>
		                            <td width="60px" align="center" bgcolor="e5eff8" class="sub_table_b">과세번호</td>
		                            <td width="60px" align="center" bgcolor="e5eff8" class="sub_table_b">부과여부</td>
		                            <td width="60px" align="center" bgcolor="e5eff8" class="sub_table_b">수납여부</td>
		                             <td width="100px" align="center" bgcolor="e5eff8" class="sub_table_b">과세일</td>
		                            <td width="100px" align="center" bgcolor="e5eff8" class="sub_table_b">수납일</td>
		                            <td width="60px" align="center" bgcolor="e5eff8" class="sub_table_b">과세구분</td>
		                            <td width="110px" align="center" bgcolor="e5eff8" class="sub_table_b">산출목적</td>
		                            <td width="180px" align="center" bgcolor="e5eff8" class="sub_table_b">세목코드</td>
		                            <td width="100px" align="center" bgcolor="e5eff8" class="sub_table_b">의견제출상태</td>
		                            <td width="150px"  align="center" bgcolor="e5eff8" class="sub_table_b">운영자</td>
		                            <td width="200px"  align="center" bgcolor="e5eff8" class="sub_table_b">주소</td>
		                            <td width="350px"  align="center" bgcolor="e5eff8" class="sub_table_b">새주소</td>
		                            <td width="100px"  align="center" bgcolor="e5eff8" class="sub_table_b">면적</td>
		                            <td width="120px"  align="center" bgcolor="e5eff8" class="sub_table_b">부과금액</td> 
						          </TR>
						        </TABLE>
						      </DIV>
						    </TD>
						  </TR>
						  <TR>
						    <TD width="754px" valign="top">
						      <DIV id="mainDisplay2" style="width:754px;height:274px;overflow:scroll;scrollbar-face-color:#EEF8FB;scrollbar-3dlight-color:#BBBDB6; scrollbar-highlight-color:#EEF8FB;scrollbar-shadow-color:#BBBDB6; scrollbar-darkshadow-color:#EEF8FB;scrollbar-track-color:#EEF8FB;scrollbar-arrow-color:#BBBDB6;" onscroll="scroll_Left()">
						        <TABLE width="1890px" cellpadding="0" cellspacing="0" border="1" class="sub_table" bordercolor="#c9dfed" style="border-collapse:collapse;">
						          <c:forEach items="${blist}" var="board" varStatus="idx">
						          	<c:if test = "${board.SUNAP_DATE != '0000-00-00'}">
						          	<tr onClick="javascript:View('${board.GAPAN_NO}', '${board.SEQ}','${board.CAL_MODE}','${board.TAX_GUBUN}')" onMouseOver="this.style.backgroundColor='#f6f7f8'" onMouseOut="this.style.backgroundColor=''" style="CURSOR: Hand;" >
	      	        					<td width="100px" height="26px" align="center">${board.GAPAN_NO}</td>
	      	        					<td width="40px" align="center">${board.YEAR}</td>
	      	        					<td width="60px" align="center">${board.TAX_NO}</td>
	      	        					<td width="60px" class="sub_table_r" align="center">${board.TAX_YN}</td>
	      	        					<td width="60px" class="sub_table_r" align="center">${board.SUNAP_YN}</td>
	      	        					<td width="100px" align="center">${board.TAX_DATE}</td>
	      	        					<td width="100px" align="center">${board.SUNAP_DATE}</td>
	      	        					<td width="60px" align="center">${board.TAX_GUBUN_NM}</td>
	      	        					<td width="110px" align="center">
	      	        						<c:choose>
	      	        							<c:when test="${board.CAL_MODE == '1'}">
	      	        							점용료
	      	        							</c:when>
	      	        							<c:when test="${board.CAL_MODE == '2'}">
	      	        							변상금
	      	        							</c:when>
	      	        							<c:when test="${board.CAL_MODE == '3' && board.TAX_GUBUN == '2'}">
	      	        							과태료
	      	        							</c:when>	        							
	      	        							<c:when test="${board.CAL_MODE == '3' && board.TAX_GUBUN == '3'}">
	      	        							과태료(사전통지)
	      	        							</c:when>
	      	        						</c:choose>
	      	        					</td>
	      	        					<td width="180px" align="center">${board.TAX_CD_NM}</td>
	      	        					<td width="100px" align="center">${board.REPLY_GUBUN_NM}</td>
	      	        					<td width="150px" align="center">${board.NAME}</td>
	      	        					<td width="200px" align="center">${board.ADDR}</td>
	      	        					<td width="350px" align="center">${board.SI}&nbsp;${board.GUN}&nbsp;${board.BD_BON}&nbsp;${board.BD_BU}&nbsp;${board.DORO_NM}&nbsp;${board.BD_NM}&nbsp;${board.BD_DET_NM}</td>
	      	        					<td width="100px" align="center">${board.AREA_SIZE}</td>
	      	        					<td width="120px" align="center">${rnic:insertComma2(board.SUM)}</td>	
		                     		</tr>
		                     		</c:if>
									</c:forEach>	
						        </TABLE>
						      </DIV>
						    </TD>
						  </TR>
						</table>
					 </td>
                </tr>
            </table>
            </td>
          </tr>
        </table></td>
      </tr>
  	<tr><td>
  	</td>
  	</tr>
</table></td>
</tr>
</table>
</form>         


</body>
</html>