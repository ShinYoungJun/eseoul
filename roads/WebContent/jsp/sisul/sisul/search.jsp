<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
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

	function	View(adminno)
	{
		var form = document.form;

		form.action = "view.do?ADMIN_NO=" + adminno;
		form.submit();
	}

	function	Register()
	{
		var form = document.form;

		form.action = "register.do";
		form.submit();
	}
	
//]]>
</script>

<body onload="Init_PurposeCode();">
<form name="form" method="post" action="search.jsp">
<input type="hidden" name="currentPage" value="${currentPage}">


<table width="800" border="0" cellpadding="0" cellspacing="0">
  <tr>
    <td height="43"><img src="/img/sub3_cont1_title.gif" width="800" height="43"></td>
  </tr>
  <tr>
    <td align="center"><table width="780" border="0" cellspacing="0" cellpadding="0">
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
					  <td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">부과년도</td>
					  <td bgcolor="eaeaea" class="table_bl_left"><select name="TYPE" class="input_form1" style="width:130px" OnChange="">
						${use_type}
				      </select></td>
					  <td width="100" align="center" bgcolor="e5eff8" class="sub_table_b">세입구분</td>
					  <td bgcolor="eaeaea" class="table_bl_left"><select name="SECTION" class="input_form1" style="width:130px" OnChange="">
						${use_section}
					  </select></td>
					</tr>
                      
					<tr>
					  <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">검토여부</td>
					  <td bgcolor="eaeaea" class="table_bl_left"><select name="OWNER_SET" class="input_form1" style="width:130px">
						${use_owner_Group}
					  </select></td>
					  <td align="center" bgcolor="e5eff8" class="sub_table_b">부과여부</td>
					  <td bgcolor="eaeaea" class="table_bl_left"><select name="TAX_SET" class="input_form1" style="width:130px">
						${taxation_section}
					  </select></td>
					</tr>
					
					<tr>
						<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">관리번호</td>
						<td bgcolor="eaeaea" class="table_bl_left"><input name="TEL" type="text" class="input_form1" style="width:120px" value="${board.TEL}" readonly></td>
						<td align="center" bgcolor="e5eff8" class="sub_table_b">점용인/법인명</td>
						<td bgcolor="eaeaea" class="table_bl_left"><input name="HP" type="text" class="input_form1" style="width:120px" value="${board.HP}" readonly></td>
					</tr>
                    
					<tr>
					  <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">점용목적</td>
					  <td colspan="3" bgcolor="eaeaea" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
						<tr>
							<jsp:include page="/jsp/common/purposeCode/purposeCode.jsp" flush="true"/>
						</tr>
					  </table></td>
				    </tr>
                    
				    <tr>
					  <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">조회기간</td>
					  <td colspan="3" bgcolor="eaeaea" class="table_bl_left">
					  <table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
						<select name="TYPE" class="input_form1" style="width:130px" OnChange="">
							${use_type}
						</select>
						
						<input name="FROMDATE" type="text" class="input_form1" style="width:70px" value="${board.FROMDATE}"><a><img src="/img/calendar_icon.gif" width="19" height="16" border="0" align="absmiddle" onclick="popUpCalendar(this, document.getElementById('FROMDATE'), 'yyyymmdd')" style="CURSOR: Hand;"></a>
						~ <input name="TODATE" type="text" class="input_form1" style="width:70px" value="${board.TODATE}"><a><img src="/img/calendar_icon.gif" width="19" height="16" border="0" align="absmiddle" onclick="popUpCalendar(this, document.getElementById('TODATE'), 'yyyymmdd')" style="CURSOR: Hand;"></a>
						
					  </table></td>
				    </tr>
					
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
                        <td height="28" align="center" bgcolor="e5eff8" class="sub_table_b">선택</td>
                        <td align="center" bgcolor="e5eff8" class="sub_table_b">관리번호</td>
                        <td align="center" bgcolor="e5eff8" class="sub_table_b">부과년도</td>
                        <td align="center" bgcolor="e5eff8" class="sub_table_b">세입구분</td>
                        <td align="center" bgcolor="e5eff8" class="sub_table_b">점용인(회사)</td>
                        <td align="center" bgcolor="e5eff8" class="sub_table_b">물건수</td>
                        <td align="center" bgcolor="e5eff8" class="sub_table_b">작년도점용료</td>
                        <td align="center" bgcolor="e5eff8" class="sub_table_b">현년도점용료</td>
                        <td align="center" bgcolor="e5eff8" class="sub_table_b">조정점용료</td>
                        <td align="center" bgcolor="e5eff8" class="sub_table_b">부과여부</td>
                      </tr>
                      
                      <c:forEach items="${blist}" var="board" varStatus="idx">
                      	 <a href="javascript:View('${board.ADMIN_NO}')">
	                     <tr onMouseOver="this.style.backgroundColor='#f6f7f8'" onMouseOut="this.style.backgroundColor=''" style="CURSOR: Hand;" >
	                     	<td height="26" align="center"><a href="javascript:View('${board.ADMIN_NO}')" class="inqu">${((currentPage * 10) + idx.count) - 10}</a></td>
        					<td align="center"><a href="javascript:View('${board.ADMIN_NO}')" class="inqu">${board.ADMIN_NO}</a></td>
        					<td align="center"><a href="javascript:View('${board.ADMIN_NO}')" class="inqu">${board.TYPE}</a></td>
        					<td align="center"><a href="javascript:View('${board.ADMIN_NO}')" class="inqu">${board.SECTION}</a></td>
        					<td align="center"><a href="javascript:View('${board.ADMIN_NO}')" class="inqu">${board.ADMIN_NO}</a></td>
        					<td align="center"><a href="javascript:View('${board.ADMIN_NO}')" class="inqu">${board.BONBUN}</a></td>
        					<td align="center"><a href="javascript:View('${board.ADMIN_NO}')" class="inqu">${board.MUL_FROMDATE}</a></td>
        					<td align="center"><a href="javascript:View('${board.ADMIN_NO}')" class="inqu">${board.GIGAN}</a></td>
        					<td align="center"><a href="javascript:View('${board.ADMIN_NO}')" class="inqu">${board.ADMIN_NO}</a></td>
	                     </tr>
	                     </a>
					 </c:forEach>
					 
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
          	  	<a href="javascript:Register()"><img src="/img/newregi_icon.gif" alt="신규등록" width="74" height="22" border="0"></a>
           		<a href="#"><img src="../../../img/excel_icon.gif" alt="EXCEL 변환" border="0"></a>
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