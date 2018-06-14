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

	function	View(adminno)
	{
		var form = document.form;

		form.action = "view.do?ADMIN_NO=" + adminno;
		form.submit();
	}

	function	Search()
	{
		var form = document.form;

		form.currentPage.value	= 1;

		form.PURPOSE_CD.value	= IFRM_PurposeCode.document.getElementById("PURPOSE_CD").value;

	//	alert(form.PURPOSE_CD.value);

		form.action = "search.do";
		form.submit();
	}

	function	View_Ilwal(adminno)
	{
		var form = document.form;
		
		if(form.TOTALCNT.value <= 0)
		{
			alert("일괄처리할 데이터가 없습니다");
			return;
		}
		
		form.action = "view_ilgwal.do";
		form.submit();
	}

	function	Select_UseType(sel)
	{
	//	alert(${currentPage});
		
		document.getElementById("IFRM_PurposeCode").src="/jsp/common/purposeCode/purposeCode.jsp?SectionCode=" + sel.value;
	}

	function	Init()
	{
		//	점용목적
	//	var	sel	= document.getElementById("TYPE");
	//	document.getElementById("IFRM_PurposeCode").src="/jsp/common/purposeCode/purposeCode.jsp?SectionCode=" + sel.value;
	//	IFRM_PurposeCode.document.getElementById("PURPOSE_CD").value	= form.PURPOSE_CD.value;
		
	//	IFRM_PurposeCode.Init_PurposeCode();	
	//	alert(IFRM_PurposeCode.document.getElementById("PURPOSE_CD").value);
	}
	
//]]>
</script>

<body onload="Init()">
<form name="form" method="post" action="search.jsp">
<input type="hidden" name="currentPage" value="${currentPage}">
<input type="hidden" name="TOTALCNT" value="${totalcnt}">
<input type="hidden" name="PURPOSE_CD" value="${PURPOSE_CD}">

<table width="800" border="0" cellpadding="0" cellspacing="0">
  <tr>
    <td height="43"><img src="/img/sub2_cont2_title.gif" width="800" height="43"></td>
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
                  <td><img src="/img/sub_periodi_title3.gif" width="110" height="22"></td>
                </tr>
            </table></td>
          </tr>
          
          <tr>
            <td class="contborder_blue"><table width="100%" border="0" cellspacing="0" cellpadding="0">
                <tr>
                  <td><table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
          
					<tr>
					  <td width="100" align="center" bgcolor="e5eff8" class="sub_table_b">점용종류</td>
					  <td bgcolor="eaeaea" class="table_bl_left"><select name="TYPE" class="input_form1" style="width:130px" OnChange="Select_UseType(this);">
						${use_type}
					  </select></td>
					  
					  <td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">점용만료일자</td>
					  <td colspan="3" bgcolor="eaeaea" class="table_bl_left">
					  <table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
						<input name="GIGAN1" type="text" class="input_form1" style="width:70px" value="${GIGAN1}"><a><img src="/img/calendar_icon.gif" width="19" height="16" border="0" align="absmiddle" onclick="popUpCalendar(this, document.getElementById('GIGAN1'), 'yyyymmdd')" style="CURSOR: Hand;"></a>
						~ <input name="GIGAN2" type="text" class="input_form1" style="width:70px" value="${GIGAN2}"><a><img src="/img/calendar_icon.gif" width="19" height="16" border="0" align="absmiddle" onclick="popUpCalendar(this, document.getElementById('GIGAN2'), 'yyyymmdd')" style="CURSOR: Hand;"></a>
					  </table></td>
					</tr>
					
					<tr>
					  <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">점용목적</td>
					  <td colspan="3" bgcolor="" class=""><table width="100%" border="0" cellpadding="0" cellspacing="0" class="">
						<iframe id="IFRM_PurposeCode" scrolling="no" frameborder="0" framespacing="0" width="100%" height="26" src="/jsp/common/purposeCode/purposeCode.jsp?SectionCode=${TYPE}&PURPOSE_CD=${PURPOSE_CD}"></iframe>
					  </table></td>
				    </tr>
                    
					<tr>
					  <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">관리번호</td>
	                  <td bgcolor="eaeaea" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
	                    <tr>
	                      <td><input name="ADMINNO" type="text" class="input_form1" style="width:100px" value="${ADMINNO}"></td>
	                    </tr>
	                  </table></td>  
					  
	                  <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">점용인/법인명</td>
	                  <td bgcolor="eaeaea" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
	                    <tr>
	                      <td><input name="NAME" type="text" class="input_form1" style="width:100px" value="${NAME}"></td>
	                    </tr>
	                  </table></td>
					</tr>
					
			        <tr>
	                  <td align="center" bgcolor="e5eff8" class="sub_table_b">법정/행정동</td>
	                  <td bgcolor="eaeaea" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
	                  	<tr><td><select name="BJ_CD" class="input_form1" style="width:100px">
	                            ${bjdong_code}
	                        </select></td>
	              		 	<td>&nbsp;<select name="HJ_CD" class="input_form1" style="width:100px">
	                            ${hjdong_code}
	                        </select></td>
	                    </tr>
						</table></td>
	                  <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">번지</td>
	                  <td bgcolor="eaeaea" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
	                    <tr>
	                      <td><input name="BONBUN" type="text" class="input_form1" style="width:40px" value="${BONBUN}"> 번지 -
							  <input name="BUBUN" type="text" class="input_form1" style="width:40px" value="${BUBUN}"> 호
						  </td>
	                    </tr>
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
                        <td width="30" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">번호</td>
                        <td width="70" align="center" bgcolor="e5eff8" class="sub_table_b">관리번호</td>
                        <td width="60" align="center" bgcolor="e5eff8" class="sub_table_b">점용종류</td>
                        <td align="center" bgcolor="e5eff8" class="sub_table_b">점용인</td>
                        <td align="center" bgcolor="e5eff8" class="sub_table_b">점용지</td>
                        <td align="center" bgcolor="e5eff8" class="sub_table_b">점용목적</td>
                        <td width="150" align="center" bgcolor="e5eff8" class="sub_table_b">점용기간</td>         
                      </tr>
                      
					<c:choose>
						<c:when test="${blist!= null && !empty blist}">
	                      <c:forEach items="${blist}" var="board" varStatus="idx">
		                     <tr onClick="javascript:View('${board.ADMIN_NO}')" onMouseOver="this.style.backgroundColor='#f6f7f8'" onMouseOut="this.style.backgroundColor=''" style="CURSOR: Hand;" >
		                     	<td height="26" align="center">${board.RN}</td>
	        					<td align="center"><script>var adminno = nr_Adminno_Cut("${board.ADMIN_NO}"); document.write(adminno);</script></td>
	        					<td align="center">${board.TYPE}</td>
	        					<td align="center">${board.NAME}</td>
	        					<td align="center">${board.JUMYONGJI}</td>
	        					<td align="center">[${board.PURPOSE_CD}] ${board.PURPOSE_SORT} ${board.PURPOSE_KIND}</td>
	        					<td align="center">${board.GIGAN}</td>
		                     </tr>
						</c:forEach>
						</c:when>
						<c:otherwise>
							<tr>
								<td align="center" class="sub_table" colspan="7" height="85">검색된 내용이 없습니다</td>
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
            	<a href="javascript:View_Ilwal()"><img src="../../../img/levy_icon4.gif" alt="일괄 처리" border="0"></a>
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