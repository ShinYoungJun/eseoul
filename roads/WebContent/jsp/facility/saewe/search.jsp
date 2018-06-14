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
</head>

<script language="javascript" src="/js/PopupCalendar.js"></script>
<script language="javascript" src="/js/Check_inputbox.js"></script>

<script type="text/javascript">
//<![CDATA[
	
	function	Page(page)
	{
		if(page	==	"")
			return;
		
		var form = document.form;
		
		form.action = "search.do?currentPage=" + page;
		form.submit();
	}

	function	View(guCode,corpCd,seq,admin_no,tax_set)
	{
		var form = document.form;
		
		form.action = "view.do?GU_CODE="+guCode+"&CORP_CD="+corpCd+"&SEQ="+seq+"&ADMIN_NO="+admin_no+"&TAX_SET="+tax_set;
		form.submit();
	}

	function	Search()
	{	
		var form = document.form;

		form.currentPage.value	= 1;
		form.action = "search.do";
		form.submit();
	}

	function	excel_Search()
	{
		var form = document.form;
		
		form.currentPage.value	= 1;
		form.action = "excel_search.do";
		form.submit();
	}
	
	function	Select_UseType(sel)
	{
		document.getElementById("IFRM_PurposeCode").src="/jsp/common/purposeCode/purposeCode.jsp?SectionCode=" + sel.value;
	}

	//엔터키가 입력되면 검색함수 호출
	function checkKeySearch()
	{	
		if(event.keyCode == '13')
			Search();
	}

	function SaeweSuipBugwa_Ilgwal()
	{
		var form = document.form;
		
		if(form.TOTALCNT.value <= 0)
		{
			alert("일괄처리할 데이터가 없습니다");
			return;
		}
		
		if(!confirm("일괄처리 하시겠습니까?"))
			return;
		
		form.action = "/facility/saewe/saeweSuipBugwa_ilgwal.do";
		form.submit();
	}
		
	function	Init()
	{	
		var obj = document.form.message.value;
		
		if(obj != "")	
			alert(obj);
	}

//]]>
</script>

<body onload="Init();">
<form name="form" method="post" action="search.jsp">
<input type="hidden" name="currentPage" value="${currentPage}">
<input type="hidden" name="TOTALCNT" value="${totalcnt}">
<input type="hidden" name="message" value="${message}">
<input type="hidden" name="excel" value="">
 
<table width="800" border="0" cellpadding="0" cellspacing="0">
  <tr>
    <td height="43"><img src="/img/sub3_cont3_title.gif" width="800" height="43"></td>
  </tr>
  <tr>
    <td align="center"><table width="780" border="0" cellspacing="0" cellpadding="0">
<!--      <tr>
        <td height="40" align="right">
		<table border="0" cellspacing="0" cellpadding="0">
          <tr>
            <td height="8" colspan="2"></td>
            </tr>
          <tr>
            <td><a href="#"><img src="/img/report_icon.gif" alt="기안문 상신" width="92" height="18" border="0"></a></td>
            <td><a href="#"><img src="/img/help_icon.gif" alt="도움말" width="65" height="18" border="0"></a></td>
            </tr>
        </table>
			</td>
      </tr>
-->
      <tr>
        <td height="1" bgcolor="eaeaea"></td>
      </tr>
      <tr>
        <td height="14"></td>
      </tr>
      
      <tr>
        <td align="left"><table width="780" border="0" cellspacing="0" cellpadding="0">
          <tr>
            <td height="22" background="/img/tab_line_blue.gif"><table border="0" cellspacing="0" cellpadding="0">
                <tr>
                  <td><img src="/img/sub_petition_title10.gif" width="110" height="22"></td>
                </tr>
            </table></td>
          </tr>
          
          <tr>
            <td class="contborder_blue"><table width="100%" border="0" cellspacing="0" cellpadding="0">
                <tr>
                  <td><table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
                  
				    <tr>
					  <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">갱신기간</td>
					  <td colspan="3" bgcolor="eaeaea" class="table_bl_left">
					<!--  //********** BEGIN_KANG_20120420 -->
					<!-- 
					<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
						<input name="GIGAN1" type="text" class="input_form1" style="width:70px" value="${GIGAN1}"><a><img src="/img/calendar_icon.gif" width="19" height="16" border="0" align="absmiddle" onclick="popUpCalendar(this, GIGAN1, 'yyyymmdd')" style="CURSOR: Hand;"></a>
						~ <input name="GIGAN2" type="text" class="input_form1" style="width:70px" value="${GIGAN2}"><a><img src="/img/calendar_icon.gif" width="19" height="16" border="0" align="absmiddle" onclick="popUpCalendar(this, GIGAN2, 'yyyymmdd')" style="CURSOR: Hand;"></a>
						
					  </table>
					-->
					<table width="210px" border="0" cellpadding="0" cellspacing="0" class="sub_stan">
						<tr>
							<td width="70px"><input id="GIGAN1" name="GIGAN1" type="text" class="input_form1" style="width:70px" value="${GIGAN1}"><a></td>
							<td width="20px"><img src="/img/calendar_icon.gif" width="19px" height="16" border="0" onclick="popUpCalendar(this, GIGAN1, 'yyyymmdd')" style="CURSOR: Hand;"></a></td>
							<td width="30px" align="center">~</td>
							<td width="70px"><input id="GIGAN2" name="GIGAN2" type="text" class="input_form1" style="width:70px" value="${GIGAN2}"><a></td>
							<td width="20px"><img src="/img/calendar_icon.gif" width="19px" height="16" border="0" onclick="popUpCalendar(this, GIGAN2, 'yyyymmdd')" style="CURSOR: Hand;"></a></td>
						</tr>
					  </table>
					<!--   //********** END_KANG_20120420 -->					  
					 </td>
				    </tr>
					<tr>
					  <td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">점용종류</td>
					  <td width="37%" bgcolor="eaeaea" class="table_bl_left"><select name="TYPE" class="input_form1" style="width:70px" OnChange="javascript:Select_UseType(this);">
						${use_type}
				      </select></td>

<!-- 
					<tr>
					  <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">점용목적</td>
					  <td colspan="7" bgcolor="" class="">
					  <table width="100%" border="0" cellpadding="0" cellspacing="0" class="">
						<iframe id="IFRM_PurposeCode" align="absmiddle" scrolling="no" frameborder="0" framespacing="0" width="100%" height="25"></iframe>
					  </table>
					  </td>
				    </tr>
 -->

					  <!-- <td width="100" align="center" bgcolor="e5eff8" class="sub_table_b">과세구분</td>
					  <td bgcolor="eaeaea" class="table_bl_left"><select name="SECTION" class="input_form1" style="width:70px" OnChange="">
						${occupancy_type}
					  </select></td> -->
					  <td align="center" bgcolor="e5eff8" class="sub_table_b">부과여부</td>
					  <td bgcolor="eaeaea" class="table_bl_left"><select name="TAX_YN" class="input_form1" style="width:70px">
						${taxation_yn}
					  </select></td>
					</tr>
                    
					<tr>
					  <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">세입구분</td>
					  <td bgcolor="eaeaea" class="table_bl_left"><select name="TAX_SET" class="input_form1" style="width:70px">
						${taxation_section}
					  </select></td>					  
					   <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">점용인/법인명</td>
					  <td colspan="3" bgcolor="eaeaea" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
						<input name="NAME" type="text" class="input_form1" style="width:120px" value="${NAME}" onKeyDown="javascript:checkKeySearch();">
					  </table></td>
					</tr>

				<!-- 	<tr>
					  <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">점용인/법인명</td>
					  <td colspan="3" bgcolor="eaeaea" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
						<input name="NAME" type="text" class="input_form1" style="width:120px" value="${NAME}" onKeyDown="javascript:checkKeySearch();">
					  </table></td>
					</tr> -->
					
                  </table></td>
                </tr>
                <tr>
                  <td height="32" align="right"><a href="javascript:Search()"><img src="/img/inquiry_icon2.gif" alt="조회" width="56" height="18" border="0"></a></td>
                </tr>

                <tr>
                  <td height="1" bgcolor="#EAEAEA"></td>
                </tr>
                <tr>
                  <td height="34" class="sub_stan">전체건수 : <span class="sub_stan_blue">${totalcnt}</span> 건 </td>
                </tr>
                <tr>
                  <td><table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
                      <tr>
                        <td height="28" align="center" bgcolor="e5eff8" class="sub_table_b">번호</td>
                        <td align="center" bgcolor="e5eff8" class="sub_table_b">점용인/법인명</td>
                        <td align="center" bgcolor="e5eff8" class="sub_table_b">지점명</td>
                        <td align="center" bgcolor="e5eff8" class="sub_table_b">갱신일자</td>                        
                        <td align="center" bgcolor="e5eff8" class="sub_table_b">년도</td>
                        <td align="center" bgcolor="e5eff8" class="sub_table_b">세입구분</td>
                        <td align="center" bgcolor="e5eff8" class="sub_table_b">부과 점용료</td>
                        <td align="center" bgcolor="e5eff8" class="sub_table_b">작성여부</td>
                        <td align="center" bgcolor="e5eff8" class="sub_table_b">부과여부</td>
                      </tr>
                                           
					<c:choose>
						<c:when test="${blist!= null && !empty blist}">
	                      	<c:forEach items="${blist}" var="board" varStatus="idx">
		                     <tr onClick="javascript:View('${board.GU_CODE}','${board.CORP_CD}', '${board.SEQ}','${board.ADMIN_NO }','${board.TAX_SET }')" onMouseOver="this.style.backgroundColor='#f6f7f8'" onMouseOut="this.style.backgroundColor=''" style="CURSOR: Hand;" >
		                     	<td height="26" align="center">${board.RN}</td>
	        					<td align="center">${board.NAME}</td>
	        					<td align="center">${board.OFFICE}</td>
	        					<td align="center">${board.REQ_DATE}</td>	        					
	        					<td align="center">${board.YEAR}</td>
	        					<td align="center">${board.TAX_SET_NM}</td>
	        					<td align="center">${board.SUM}</td>
	        					<td align="center"><font color="red">${board.CAL_YN}</font></td>
	        					<td align="center"><font color="red">${board.TAX_YN}</font></td>
		                     </tr>
						 	</c:forEach>
						</c:when>
						<c:otherwise>
							<tr>
								<td align="center" class="sub_table" colspan="10" height="85">검색된 내용이 없습니다</td>
							</tr>
						</c:otherwise>
					 </c:choose>
					 
					 </table>
					 </td>
                </tr>
				
                <tr>
                  <td height="30" align="center"><table border="0" cellspacing="0" cellpadding="0">
                      <tr>
						${pageing}
                      </tr>
                  </table></td>
                </tr>

            </table></td>
          </tr>
          <tr>
             <td height="40" align="right">
            	
            	<!--   <a href="javascript:SaeweSuipBugwa_Ilgwal()"><img src="../../../img/levy_icon3.gif" alt="일괄부과 처리" border="0"></a> -->
           		<img src="../../../img/excel_icon.gif" alt="EXCEL 변환" border="0" onclick="javascript:excel_Search();" style="cursor:hand">
           </td>
          </tr>
        </table></td>
      </tr>

  	<tr><td>
  	</td>
  	</tr>
</table></td>         


</body>
</html>