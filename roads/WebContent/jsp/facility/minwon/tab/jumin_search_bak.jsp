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
	background-image: url/img/left_back.gif);
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

		form.currentPage.value	= page;

		form.action = "jumin_search.do";
		form.submit();
	}
	
	function	Search()
	{
		var form = document.form;

		form.currentPage.value	= 1;

		form.action = "jumin_search.do";
		form.submit();
	}
	
	function Appeal_Modify(corp_cd, gu_code)
	{
		var form = document.form;
		
		parent.form.action = "/facility/minwon/register.do?corp_cd="+corp_cd+"&gu_code="+gu_code;
		parent.form.submit();
	}
	
//]]>
</script>

<body>
<table width="800" border="0" cellpadding="0" cellspacing="0">
<form name="form" method="post">
<input type="hidden" name="currentPage" value="${currentPage}">

      <tr>
        <td align="left"><table width="780" border="0" cellspacing="0" cellpadding="0">
  
          <tr>
            <td class="contborder_blue"><table width="100%" border="0" cellspacing="0" cellpadding="0">
                <tr>
                <td><table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
					
				  	<tr>
						<td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">점용인</td>
						<td width="37%" bgcolor="eaeaea" class="table_bl_left"><input name="NAME" type="text" class="input_form1" style="width:120px" value="${NAME}"></td>
						<td width="100" align="center" bgcolor="e5eff8" class="sub_table_b">법인번호</td>
						<td bgcolor="eaeaea" class="table_bl_left">
							<input name="SSN1" type="text" class="input_form1" style="width:40px; ime-mode:disabled" value="${SSN1}" onKeyPress="nr_num_int(this);" onKeyUp="count_check(this, SSN2, 6);" maxlength="6">
							 - <input name="SSN2" type="text" class="input_form1" style="width:45px; ime-mode:disabled" value="${SSN2}" onKeyPress="nr_num_int(this);" maxlength="7"></td>
				  	</tr>
					
				</table></td>
				</tr>
				
                <tr>
                  	<td height="32" align="right"><img src="/img/inquiry_icon2.gif" alt="조회" width="56" height="18" border="0" onclick="javascript:Search();" style="CURSOR: Hand;"></td>
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
                        <td align="center" bgcolor="e5eff8" class="sub_table_b">관리번호</td>
                        <td align="center" bgcolor="e5eff8" class="sub_table_b">점용인명</td>
                        <td align="center" bgcolor="e5eff8" class="sub_table_b">점용인주소</td>
                        <td align="center" bgcolor="e5eff8" class="sub_table_b">등록</td>
					</tr>
					
					<c:choose>
						<c:when test="${blist!= null && !empty blist}">
		                      <c:forEach items="${blist}" var="board" varStatus="idx">
			                     <tr onMouseOver="this.style.backgroundColor='#f6f7f8'" onMouseOut="this.style.backgroundColor=''">
			                     	<td height="26" align="center">${board.RN}</td>
		        					<td align="center">
		        						<!-- script>var adminno = nr_Adminno_Cut(${board.CORP_CD}+${board.GU_CODE}); document.write(adminno);</script -->
		        						${board.CORP_CD}${board.GU_CODE}
		        					</td>
		        					<td align="center">${board.NAME}</td>
		        					<td align="center">(${board.BON_POST}) ${board.BON_ADDR1} ${board.BON_ADDR2}</td>
		        					<%-- <td align="center"><img src="/img/mod_icon3.gif" alt="등록" border="0" onclick="javaScript:Search('${board.ADMIN_NO}');" style="CURSOR:Hand;"></td> --%>
		        					<td align="center">
		        						<img src="/img/mod_icon2.gif" alt="수정" border="0" onclick="javaScript:Appeal_Modify('${board.CORP_CD}','${board.GU_CODE}');" style="CURSOR:Hand;">
		        					</td>
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

		</table></td>
	</tr>

</form>
</table>

</body>
</html>
<script>
	parent.iFrameResize(parent.document.getElementById("tab2"));
</script>