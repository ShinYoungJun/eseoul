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
<script language='JavaScript' src='/js/Check_inputbox.js'></script>

<script type="text/javascript">
//<![CDATA[

	function	Page(page)
	{
		if(page	==	"")
			return;
		
		var form = document.form;
		var	LISTVIEW	= document.getElementById("LISTVIEW");
		LISTVIEW.value	= "1";

		form.currentPage.value	= page;

		form.action = "search.do";
		form.submit();
	}
	
	function	Search()
	{
		var form 	= document.form;
		var	LISTVIEW	= document.getElementById("LISTVIEW");
		LISTVIEW.value	= "1";
		
		var	date	= DateCheck();
		if(date	== true)
			return;
		
		form.currentPage.value	= 1;

		form.action = "search.do";
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

	function	DateCheck()
	{
		var form = document.form;

		if(form.GIGAN2.value	== "")
			return	false;

		if(form.GIGAN1.value	> form.GIGAN2.value)
		{
			alert("접수기간을 다시 입력하여 주십시요.");
			return	true;
		}

		return	false;
	}

	function	Init()
	{
		var form 	= document.form;
		var	LISTVIEW	= document.getElementById("LISTVIEW");

		if(form.LISTVIEW.value == "0")
		{
			LISTVIEW.value	= "1";
	
			form.action = "search.do";
			form.submit();
		}
	}

	function onCheck(){
		var form 	= document.form;
		
		if(form.MIN_REQNO.value.length == '18'){
			form.MIN_NAME.focus();
		}
	}
	
//]]>
</script>

<body onload="Init()">
<form name="form" method="post" action="search.jsp">
<input type="hidden" name="currentPage" value="${currentPage}">
<input type="hidden" name="LISTVIEW" value="${LISTVIEW}">

<table width="800" border="0" cellpadding="0" cellspacing="0">
  <tr>
    <td height="43"><img src="/img/sub7_cont1_title.gif" width="800" height="43"></td>
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
        <td align="left"><table width="780" border="0" cellspacing="0" cellpadding="0">
          <tr>
            <td height="22" background="/img/tab_line_blue.gif"><table border="0" cellspacing="0" cellpadding="0">
                <tr>
                  <td><img src="/img/sub_petition_title1.gif" width="110" height="22"></td>
                </tr>
            </table></td>
          </tr>
          
          <tr>
            <td class="contborder_blue"><table width="100%" border="0" cellspacing="0" cellpadding="0">
                <tr>
                  <td><table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
                  
                      <tr>
                        <td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">접수기간</td>
                        <td bgcolor="eaeaea" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
                            <tr>
                              <td><input name="GIGAN1" type="text" class="input_form1" style="width:80px" value="${GIGAN1}" readonly></td>
                              <td><a><img src="/img/calendar_icon.gif" width="19" height="16" border="0" onclick="popUpCalendar(this, GIGAN1, 'yyyymmdd');" style="CURSOR: Hand;"></a></td>
                              <td width="16" align="center">~</td>
                              <td><input name="GIGAN2" type="text" class="input_form1" style="width:80px" value="${GIGAN2}" readonly></td>
                              <td><a><img src="/img/calendar_icon.gif" width="19" height="16" border="0" onclick="popUpCalendar(this, GIGAN2, 'yyyymmdd');" style="CURSOR: Hand;"></a></td>
                            </tr>
                        </table>
                        </td>
                        <td align="center" bgcolor="e5eff8" class="sub_table_b">민원인명</td>
                        <td bgcolor="eaeaea" class="table_bl_left">
                        	<input name="MIN_NAME" type="text" class="input_form1" style="width:200px" value="${MIN_NAME}" onkeypress="if(event.keyCode == 13) Search();">
                        </td>
<!--  
                        <td width="100" align="center" bgcolor="e5eff8" class="sub_table_b">접수/처리확인</td>
                        <td bgcolor="eaeaea" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
	                    <tr>
	                        <td><select name="MIN_CHECK" class="related" style="width:90px">${check_yn}</select></td>
	                        <td bgcolor="eaeaea" class="table_bl_left"><select name="MIN_PROCESS" class="related" style="width:80px">${process_flag}</select></td>
	                    </tr>
                        </table></td>
-->
                      </tr>
<!--  
                      <tr>
                        <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">접수번호</td>
                        <td bgcolor="eaeaea" class="table_bl_left">
                        	<input name="MIN_REQNO" type="text" class="input_form1" style="width:120px" value="${MIN_REQNO}" style="ime-mode:disabled" onkeypress="javascript:onCheck();" maxlength="18">
                        </td>
                        <td align="center" bgcolor="e5eff8" class="sub_table_b">민원인명</td>
                        <td bgcolor="eaeaea" class="table_bl_left">
                        	<input name="MIN_NAME" type="text" class="input_form1" style="width:200px" value="${MIN_NAME}" onkeypress="if(event.keyCode == 13) Search();">
                        </td>
                      </tr>
-->                      
                  </table></td>
                </tr>
                <tr>
                  <td height="32" align="right"><a href="javascript:Search();"><img src="/img/inquiry_icon2.gif" alt="조회" width="56" height="18" border="0"></a></td>
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
                        <td align="center" bgcolor="e5eff8" class="sub_table_b">접수번호</td>
                        <!--<td align="center" bgcolor="e5eff8" class="sub_table_b">접수자</td>  -->
                        <td align="center" bgcolor="e5eff8" class="sub_table_b">담당자</td>
                        <td align="center" bgcolor="e5eff8" class="sub_table_b">민원구분</td>
                        <td align="center" bgcolor="e5eff8" class="sub_table_b">민원인</td>
                        <td align="center" bgcolor="e5eff8" class="sub_table_b">민원요지</td>
                        <td align="center" bgcolor="e5eff8" class="sub_table_b">접수일자</td>
                        <td align="center" bgcolor="e5eff8" class="sub_table_b">확인</td>
                        <td align="center" bgcolor="e5eff8" class="sub_table_b">처리일자</td>
                        <td align="center" bgcolor="e5eff8" class="sub_table_b">처리</td>
                      </tr>

					<c:choose>
						<c:when test='${blist != null && !empty blist}'>
		                      <c:forEach items="${blist}" var="board" varStatus="idx">
			                     <tr onClick="javascript:View('${board.ADMIN_NO}')" onMouseOver="this.style.backgroundColor='#f6f7f8'" onMouseOut="this.style.backgroundColor=''" style="CURSOR: Hand;" >
			                     	<td height="26" align="center">${board.RN}</td>
		        					<td align="center">${board.REQ_NO}</td>
		        					<!--<td align="center">${board.REQ_NM}</td>-->
		        					<td align="center">${board.MANAGER}</td>
		        					<td align="center">${board.GUBUN}</td>
		        					<td align="center">${board.NAME}</td>
		        					<td align="center">${board.NOTES}</td>
		        					<td align="center">${board.REQ_DATE}</td>
		        					<td align="center">${board.REQ_CK}</td>
		        					<td align="center">${board.TODATE}</td>
		        					<td align="center">${board.YN}</td>
			                     </tr>
							 </c:forEach>
						</c:when>
						<c:when test='${LISTVIEW == "0"}'>
							<tr>
								<td align="center" class="sub_table" colspan="11" height="85">조회버튼을 클릭하면<P/>새올데이터를 출력합니다</td>
							</tr>
						</c:when>
						<c:otherwise>
							<tr>
								<td align="center" class="sub_table" colspan="11" height="85">검색된 내용이 없습니다</td>
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
          	  	<a href="javascript:Register()"><img src="/img/newregi_icon.gif" alt="신규등록" width="74" height="22" border="0"></a>
           		<!-- 
           		<a href="#"><img src="../../../img/excel_icon.gif" alt="EXCEL 변환" border="0"></a>
           		-->
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