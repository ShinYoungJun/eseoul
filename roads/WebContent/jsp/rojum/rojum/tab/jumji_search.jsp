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

		form.action = "jumji_search.do";
		form.submit();
	}
	
	function	Search()
	{
		var form = document.form;

		var	date	= DataCheck();
		
		if(date	== true)
			return;
	
		form.currentPage.value	= 1;
		form.action = "jumji_search.do";
		
		var BONBUN = form.BONBUN.value;
		var BUBUN = form.BUBUN.value;
		var addNum = "";
		
		if(BONBUN.length < 4){
			var bonbun_Count =  4 - BONBUN.length;
			
			for(var i=0; i < bonbun_Count; i++){
				addNum = addNum + "0";
			}
		}
		
		if("0000" == (addNum+BONBUN)){
			form.BONBUN.value = "";
		}
//		form.BONBUN.value = addNum+BONBUN;
		
		if(BUBUN.length < 4){
			
			var bubun_Count = 4 - BUBUN.length;
			addNum = "";
			
			for(var i=0; i < bubun_Count; i++){
				addNum = addNum + "0";
			}
		}
		
		if("0000" == (addNum+BUBUN)){
			form.BUBUN.value = "";
		}
//		form.BUBUN.value = addNum+BUBUN;

		form.submit();
	}
	
	function	DataCheck()
	{
		var form 	= document.form;

		var str = '';
		if(form.NAME.value.length < 1 && form.SSN1.value.length < 1 && form.SSN2.value.length < 1)
		{
			str	+= "점용인 또는 주민(법인)번호 항목중 하나는 반드시 넣어야 합니다.\n";
			alert(str);
			form.NAME.focus();
			return true;
		}
		
		return false;
	}
	
	function	View(gapanno)
	{
		parent.GoJumyongSearch(gapanno);
	}
	/*
	function	Init(FIRST)
	{
		if(FIRST == "1")
		{
			Search();
		}
	}
	*/
	function push_enter_search(){
		if (event.keyCode == 13) 
		{
			Search()
		}
	}
	
	//	관리자 번호 앞에 9자리 삭제
	function	nr_Adminno_Cut2(adminno)
	{
		if(adminno.length != 13)
			return	adminno
		
		adminno	= adminno.substr(3, 11);
		
		return	adminno;
	}
	
//]]>
</script>

<!-- body onload="Init('${FIRST}')" -->
<body>
<table width="800" border="0" cellpadding="0" cellspacing="0" onkeydown="javascript:push_enter_search();">
<form name="form" method="post">
<input type="hidden" name="currentPage" value="${currentPage}">
<input type="hidden" name="FIRST" value="${FIRST}">

      <tr>
        <td align="left"><table width="780" border="0" cellspacing="0" cellpadding="0">
			
			<tr>
            <td class="contborder_blue"><table width="100%" border="0" cellspacing="0" cellpadding="0">
                <tr>
                <td><table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
					
				  	<tr>
						<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">관리번호</td>
						<td bgcolor="eaeaea" class="table_bl_left"><input name="GAPAN_NO" type="text" class="input_form1" style="width:120px" value="${GAPAN_NO}"></td>
						<td width="100" align="center" bgcolor="e5eff8" class="sub_table_b">운영자</td>
						<td bgcolor="eaeaea" class="table_bl_left"><input name="NAME" type="text" class="input_form1" style="width:120px" value="${NAME}" maxlength="20"></td>
						<td width="100" align="center" bgcolor="e5eff8" class="sub_table_b">주민(법인)번호</td>
						<td bgcolor="eaeaea" class="table_bl_left">
							<input name="SSN1" type="text" class="input_form1" style="width:40px; ime-mode:disabled" value="${SSN1}" onKeyPress="nr_num_int(this);" onKeyUp="count_check(this, SSN2, 6);" maxlength="6">
							 - <input name="SSN2" type="text" class="input_form1" style="width:45px; ime-mode:disabled" value="${SSN2}" onKeyPress="nr_num_int(this);" maxlength="7"></td>
				  	</tr>
					
					<tr>
					  	<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">점용지 지번 </td>
					  	<td colspan="5" bgcolor="eaeaea" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
						<tr>
						  <td>${GU_NM}&nbsp;&nbsp;</td>
	                         <td width="72"><select name="BJ_CD" class="input_form1" style="width:100px">
	                           ${bjdong_code}
	                         </select></td>
	                         <!-- 
	                         <td>&nbsp;<select name="HJ_CD" class="input_form1" style="width:100px">
	                           ${hjdong_code}
	                         </select></td>
	                         -->
	                         <td>&nbsp;/&nbsp;<select name="SPC_CD" class="input_form1" style="width:75px">
	                           ${mul_spc_cd}
	                         </select></td>
						  <td>&nbsp;<input name="BONBUN" value="${BONBUN}" type="text" class="input_form1" style="width:40px" style="ime-mode:disabled" onKeyDown="nr_num_int(this);" onKeyUp="nr_num_int(this);" onKeyPress="nr_num_int(this);" maxlength="4">
							- <input name="BUBUN" value="${BUBUN}" type="text" class="input_form1" style="width:40px" style="ime-mode:disabled" onKeyDown="nr_num_int(this);" onKeyUp="nr_num_int(this);" onKeyPress="nr_num_int(this);" maxlength="4">
							번지</td>
						  </tr>
					  	</table></td>
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
                        <td align="center" bgcolor="e5eff8" class="sub_table_b">점용인</td>
                        <td align="center" bgcolor="e5eff8" class="sub_table_b">점용종류</td>
                        <td align="center" bgcolor="e5eff8" class="sub_table_b">점용목적</td>
                        <td align="center" bgcolor="e5eff8" class="sub_table_b">점용지주소</td>
                        <td align="center" bgcolor="e5eff8" class="sub_table_b">변경</td>
					</tr>
					
					<c:choose>
						<c:when test="${blist!= null && !empty blist}">
		                      <c:forEach items="${blist}" var="board" varStatus="idx">
			                     <tr onMouseOver="this.style.backgroundColor='#f6f7f8'" onMouseOut="this.style.backgroundColor=''">
			                     	<td height="26" align="center">${board.RN}</td>
		        					<td align="center">${board.GAPAN_NO}</td>
		        					<td align="center">${board.OWNER_NAME}</td>
		        					<td align="center">도로</td>
		        					<td align="center">${board.PURPOSE_CD}</td>
		        					<td align="center">
		        						${board.SIDO_NM} ${board.SIGUNGU} ${board.BJ_CD} ${board.SPC_CD} ${board.BONBUN} ${board.BUBUN}
		        					</td>
		        					<td align="center"><img src="/img/mod_icon3.gif" alt="변경" border="0" onclick="javaScript:View('${board.GAPAN_NO}');" style="CURSOR:Hand;"></td>
			                     </tr>
							 </c:forEach>
						</c:when>
						<c:otherwise>
							<tr>
								<td align="center" class="sub_table" colspan="7" height="26">검색된 내용이 없습니다</td>
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