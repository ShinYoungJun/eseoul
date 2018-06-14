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
}
-->
</style>
<link href="/css/roads.css" rel="stylesheet" type="text/css">
</head>
<script language="javascript" src="/js/PopupCalendar.js"></script>
<script language='JavaScript' src='/js/Check_inputbox.js'></script>
<!--  //********** BEGIN_현진_20120215 -->
<script language="javascript" src="/js/zipcode.js"></script>
<!--   //********** END_현진_20120215 -->   

<script type="text/javascript">
//<![CDATA[

	function	Modify()
	{
		var	result	= DataCheck();

		if(result	==	false)
			return;
		
		var form = document.form;
		
		form.action = "/jumyong/jumyonginfo/minwon_modify_prc.do";
		form.submit();
	}

	function	Cancel()
	{
		var form = document.form;

		form.action = "/jumyong/jumyonginfo/minwon_view.do";
		form.submit();
	}

	function	DataCheck()
	{
		var form 	= document.form;
		var	str		= "";
		
/*		//	민원등록
		if(form.GUBUN.value.length	< 1)
			str	+= "민원구분을 입력하세요\n";
		if(form.REQ_DATE.value.length	< 1)
			str	+= "접수일자를 입력하세요\n";
		if(form.PREDATE.value.length	< 1)
			str	+= "처리 예정일자를 입력하세요\n";
//		if(form.REQ_DEP.value.length	< 1)
//			str	+= "접수부서를 입력하세요.\n";
		if(form.MANAGE_DEP.value.length	< 1)
			str	+= "담당부서를 입력하세요\n";
		if(form.REQ_NM.value.length	< 1)
			str	+= "접수자명을 입력하세요\n";
		if(form.MANAGER.value.length	< 1)
			str	+= "담당자명을 입력하세요\n";
		if(form.NOTES.value.length	< 1)
			str	+= "민원요지를 입력하세요\n";
		if(form.AGENT_NM.value.length	< 1)
			str	+= "신청인을 입력하세요\n";
		if(form.AGENT_TEL.value.length	< 1)
			str	+= "전화번호를 입력하세요\n";
*/
		if(str	== "")
		{
			return	true;
		}
		
		alert(str);

		return	false;		
	}

//]]>
</script>

<body>
<table width="780" border="0" cellpadding="0" cellspacing="0">
<form id="form" name="form" method="post">
<input type="hidden" id="ADMIN_NO" name="ADMIN_NO" value="${ADMIN_NO}">
<input type="hidden" id="SEQ" name="SEQ" value="${SEQ}">
	
	
	<tr>
		<td align="left" class="contborder_blue">
		<table width="100%" border="0" cellspacing="0" cellpadding="0">
<%-- 
        <tr>
          <td height="34" class="sub_stan">전체건수 : <span class="sub_stan_blue">${totalcnt}</span> 건 </td>
        </tr>
		<tr>
			<td><table width="100%" border="0" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
			<tr>
		        <td height="28" align="center" bgcolor="e5eff8" class="sub_table_b">번호</td>
		        <td align="center" bgcolor="e5eff8" class="sub_table_b">접수번호</td>
		        <td align="center" bgcolor="e5eff8" class="sub_table_b">접수자</td>
		        <td align="center" bgcolor="e5eff8" class="sub_table_b">민원구분</td>
		        <td align="center" bgcolor="e5eff8" class="sub_table_b">민원인</td>
		        <!-- <td align="center" bgcolor="e5eff8" class="sub_table_b">민원명</td>-->
		        <td align="center" bgcolor="e5eff8" class="sub_table_b">접수일자</td>
<!--  		        <td align="center" bgcolor="e5eff8" class="sub_table_b">확인</td>-->
		        <td align="center" bgcolor="e5eff8" class="sub_table_b">처리일자</td>
<!-- 		        <td align="center" bgcolor="e5eff8" class="sub_table_b">처리</td> -->
		        <td align="center" bgcolor="e5eff8" class="sub_table_b">담당자</td>
			</tr>
      
			<c:choose>
				<c:when test="${blist!= null && !empty blist}">
                      <c:forEach items="${blist}" var="board" varStatus="idx">
	                     <tr onClick="javascript:View('${board.ADMIN_NO}','${board.SEQ}')" onMouseOver="this.style.backgroundColor='#f6f7f8'" onMouseOut="this.style.backgroundColor=''" style="CURSOR: Hand;" >
	                     	<td height="26" align="center">${board.RN}</td>
        					<td align="center">${board.REQ_NO}</td>
        					<td align="center">${board.REQ_NM}</td>
        					<td align="center">${board.GUBUN}</td>
        					<!-- <td align="center">${board.NAME}</t-->
        					<td align="center">${board.NOTES}</td>
        					<td align="center">${board.REQ_DATE}</td>
        					<td align="center">${board.PREDATE}</td>
        					<td align="center">${board.MANAGER}</td>
	                     </tr>
					 </c:forEach>
				</c:when>
				<c:otherwise>
					<tr>
						<td align="center" class="sub_table" colspan="11" height="26">검색된 내용이 없습니다</td>
					</tr>
				</c:otherwise>
			 </c:choose>
			  
			</table></td>
		</tr>
		<tr>
		  <td height="30" align="center"><table border="0" cellspacing="0" cellpadding="0">
			<tr>
				${pageing}
			</tr>
		  </table></td>
		</tr>
--%>
			<tr>
				<td><table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
			  	<tr>
					<td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">접수번호</td>
					<td width="37%" bgcolor="eaeaea" class="table_bl_left"><input id="REQ_NO" name="REQ_NO" type="text" class="input_form1" style="width:120px" value="${board.REQ_NO}" readonly></td>
					<td width="100" align="center" bgcolor="e5eff8" class="sub_table_b">민원구분</td>
					<td bgcolor="eaeaea" class="table_bl_left"><input id="GUBUN" name="GUBUN" type="text" class="input_form1" style="width:120px" value="${board.GUBUN}"></td>
			  	</tr>
				
			  	<tr>
					<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">접수일자</td>
					<td bgcolor="eaeaea" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
				  	<tr>
						<td><input id="REQ_DATE" name="REQ_DATE" type="text" class="input_form1" style="width:120px" value="${REQ_DATE}" readonly></td>
					 	<td><a><img src="/img/calendar_icon.gif" width="19" height="16" border="0" onclick="popUpCalendar(this, document.getElementById('REQ_DATE'), 'yyyymmdd')" style="CURSOR: Hand;"></a></td>
				  	</tr>
					</table></td>
					<td align="center" bgcolor="e5eff8" class="sub_table_b">처리예정일자</td>
					<td bgcolor="eaeaea" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
				  	<tr>
						<td><input id="PREDATE" name="PREDATE" type="text" class="input_form1" style="width:120px" value="${PREDATE}" readonly></td>
						<td><a><img src="/img/calendar_icon.gif" width="19" height="16" border="0" onclick="popUpCalendar(this, document.getElementById('PREDATE'), 'yyyymmdd')" style="CURSOR: Hand;"></a></td>
				  	</tr>
					</table></td>
			  	</tr>
			  
			  	<tr>
					<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">접수부서</td>
					<td bgcolor="eaeaea" class="table_bl_left"><input id="REQ_DEP" name="REQ_DEP" type="text" class="input_form1" style="width:120px" value="${board.REQ_DEP}" readonly></td>
					<td align="center" bgcolor="e5eff8" class="sub_table_b">담당부서</td>
					<td bgcolor="eaeaea" class="table_bl_left"><input id="MANAGE_DEP" name="MANAGE_DEP" type="text" class="input_form1" style="width:120px" value="${board.MANAGE_DEP}"></td>
			  	</tr>
			  
				<tr>
					<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">접수자명</td>
					<td bgcolor="eaeaea" class="table_bl_left"><input id="REQ_NM" name="REQ_NM" type="text" class="input_form1" style="width:120px" value="${board.REQ_NM}"></td>
					<td align="center" bgcolor="e5eff8" class="sub_table_b">담당자명</td>
					<td bgcolor="eaeaea" class="table_bl_left"><input id="MANAGER" name="MANAGER" type="text" class="input_form1" style="width:120px" value="${board.MANAGER}"></td>
				</tr>
				  
				<tr>
					<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">민원요지</td>
					<td colspan="3" bgcolor="eaeaea" class="table_bl_left"><table width="100%" border="0" cellpadding="0" cellspacing="0" class="sub_stan">
						<input id="NOTES" name="NOTES" type="text" class="input_form1" style="width:98%" value="${board.NOTES}">
					</table></td>
				</tr>
				
				<tr>
					<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">대리인</td>
					<td bgcolor="eaeaea" class="table_bl_left"><input id="AGENT_NM" name="AGENT_NM" type="text" class="input_form1" style="width:120px" value="${board.AGENT_NM}"></td>
					<td align="center" bgcolor="e5eff8" class="sub_table_b">대리인 연락처</td>
					<td bgcolor="eaeaea" class="table_bl_left">
						<input id="AGENT_TEL1" name="AGENT_TEL1" value="${AGENT_TEL1}" type="text" class="input_form1" style="width:25px" style="ime-mode:disabled" onKeyPress="nr_num_int(this);" onKeyUp="nr_num_int(this); count_check(this, AGENT_TEL2, 3);" maxlength="3"> - 
						<input id="AGENT_TEL2" name="AGENT_TEL2" value="${AGENT_TEL2}" type="text" class="input_form1" style="width:30px" style="ime-mode:disabled" onKeyPress="nr_num_int(this);" onKeyUp="nr_num_int(this); count_check(this, AGENT_TEL3, 4);" maxlength="4"> - 
						<input id="AGENT_TEL3" name="AGENT_TEL3" value="${AGENT_TEL3}" type="text" class="input_form1" style="width:30px" style="ime-mode:disabled" onKeyPress="nr_num_int(this);" onKeyUp="nr_num_int(this);" maxlength="4">
					</td>
				</tr>
			  
				<tr>
					<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">민원인명</td>
					<td bgcolor="eaeaea" class="table_bl_left"><input id="NAME" name="NAME" type="text" class="input_form1" style="width:120px" value="${board.NAME}"></td>
					<td align="center" bgcolor="e5eff8" class="sub_table_b">민원인 주민번호</td>
					<td bgcolor="eaeaea" class="table_bl_left">
						<input id="SSN1"  name="SSN1" type="text" class="input_form1" style="width:40px; ime-mode:disabled" value="${SSN1}" onKeyPress="nr_num_int(this);" onKeyUp="count_check(this, min_ssn2, 6);" maxlength="6">
						 - <input id="SSN2" name="SSN2" type="text" class="input_form1" style="width:87px; ime-mode:disabled" value="${SSN2}" onKeyPress="nr_num_int(this);" maxlength="7">
					</td>
				</tr>
			  	<!--  //********** BEGIN_현진_20120215 -->
				<!-- 
			 	<tr>
					<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">민원인 우편번호</td>
					<td bgcolor="eaeaea" class="table_bl_left">
						<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
							<tr>
							  	<td><input id="POST" name="POST" type="text" class="input_form1" style="width:50px" value="${POST}" readonly></td>
							   	<td><img src="/img/search_icon.gif" alt="검색" width="56" height="18" border="0" onclick="javascript:openZipcodePopup('form.POST', 'form.ADDR1');" style="CURSOR:Hand"></td>
							</tr>
						</table>
					</td>
					
					<td align="center" bgcolor="e5eff8" class="sub_table_b">민원인 주소</td>
					<td bgcolor="eaeaea" class="table_bl_left">
						<input id="ADDR1"  name="ADDR1" type="text" class="input_form1" style="width:250px" value="${board.ADDR1}" readonly>
						<input id="ADDR2" name="ADDR2" type="text" class="input_form1" style="width:250px" value="${board.ADDR2}">
					</td>
			  	</tr>
			  	-->
			  	<tr>
					<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">우편번호</td>
					<td colspan="3" bgcolor="eaeaea" class="table_bl_left">
						<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
							<tr>
							  	<td width="50px"><input id="POST" name="POST" type="text" class="input_form1" style="width:50px" value="${POST}" readonly></td>
								<td width="50px"><a href="javascript:openZipcodePopup_new('form.POST', 'form.ADDR1', 'form.DORO_ADDR1', '', '', '', '','','', '' );"><img src="/img/search_icon.gif" alt="검색" width="56" height="18" border="0"></a></td>
							</tr>
						</table>
					</td>
				</tr>					
				<tr>
					<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">기본 주소</td>
					<td bgcolor="eaeaea" class="table_bl_left">
						<input id="ADDR1"  name="ADDR1" type="text" class="input_form1" style="width:250px" value="${board.ADDR1}" readonly>
						<input id="ADDR2" name="ADDR2" type="text" class="input_form1" style="width:250px" value="${board.ADDR2}">
					</td>
					<td align="center" bgcolor="e5eff8" class="sub_table_b">도로명 주소</td>
					<td bgcolor="eaeaea" class="table_bl_left">
						<input id="DORO_ADDR1" name="DORO_ADDR1" type="text" class="input_form1" style="width:250px" value="${board.DORO_ADDR1}" readonly>
						<input id="DORO_ADDR2" name="DORO_ADDR2" type="text" class="input_form1" style="width:250px" value="${board.DORO_ADDR2}">
					</td>
				</tr>							
			  	<!--   //********** END_현진_20120215 -->
			  	<tr>
					<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">민원인 전화</td>
					<td bgcolor="eaeaea" class="table_bl_left">
						<input id="TEL1" name="TEL1" type="text" class="input_form1" style="width:25px" style="ime-mode:disabled" onKeyPress="nr_num_int(this);" onKeyUp="nr_num_int(this); count_check(this, TEL2, 3);" maxlength="3" value="${TEL1}"> - 
						<input id="TEL2" name="TEL2" type="text" class="input_form1" style="width:30px" style="ime-mode:disabled" onKeyPress="nr_num_int(this);" onKeyUp="nr_num_int(this); count_check(this, TEL3, 4);" maxlength="4" value="${TEL2}"> - 
						<input id="TEL3" name="TEL3" type="text" class="input_form1" style="width:30px" style="ime-mode:disabled" onKeyPress="nr_num_int(this);" onKeyUp="nr_num_int(this); count_check(this, HP1, 4);" maxlength="4" value="${TEL3}">
					</td>
					<td align="center" bgcolor="e5eff8" class="sub_table_b">민원인 휴대폰</td>
					<td bgcolor="eaeaea" class="table_bl_left">
						<input id="HP1" name="HP1" type="text" class="input_form1" style="width:25px" style="ime-mode:disabled" onKeyPress="nr_num_int(this);" onKeyUp="nr_num_int(this); count_check(this, HP2, 3);" maxlength="3" value="${HP1}"> - 
						<input id="HP2" name="HP2" type="text" class="input_form1" style="width:30px" style="ime-mode:disabled" onKeyPress="nr_num_int(this);" onKeyUp="nr_num_int(this); count_check(this, HP3, 4);" maxlength="4" value="${HP2}"> - 
						<input id="HP3" name="HP3" type="text" class="input_form1" style="width:30px" style="ime-mode:disabled" onKeyPress="nr_num_int(this);" onKeyUp="nr_num_int(this);" maxlength="4" value="${HP3}">
					</td>
			  	</tr>
			  	<tr>
       				<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">비고</td>
     					<td colspan="3" bgcolor="eaeaea" class="table_bl_left">
				       <table width="100%" border="0" cellpadding="0" cellspacing="0" class="sub_stan">
				        <textarea id="REFERENCE" name="REFERENCE" type="text" class="input_form1" style="width:98%" onkeyup="displayBytes(500, 'REFERENCE');">${REFERENCE}</textarea>
				       </table>
     					</td>
       			</tr> 
				  
			  </table></td>
			</tr>

			<tr>
				<td height="40" align="right">
			  		<a href="javascript:Cancel();"><img src="/img/can_icon.gif" alt="취소" width="56" height="18" border="0"></a>	
			  		<a href="javascript:Modify();"><img src="/img/save_icon2.gif" alt="저장" width="56" height="18" border="0"></a>
				</td>
			</tr>
			
		</table></td>
	  </tr>

</table>

</body>
</html>