<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ include file="/jsp/common/include.jsp" %>
<%@ include file="/jsp/common/loginCheck.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">


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

<script language="javascript" src="/jsp/RexServer/rexscript/rexpert.js"></script>
<script language="javascript" src="/jsp/RexServer/rexscript/rexpert_properties.js"></script>
<script language="javascript" src="/js/PopupCalendar.js"></script>
<script language="javascript" src="/js/Check_inputbox.js"></script>

<script type="text/javascript">
//<![CDATA[
           
	function	Page(page)
	{
		if(page	==	"")
			return;
		
		var form = document.form;

		form.action = "gigan_view.do?currentPage=" + page;
		form.submit();
	}

	function	View(adminno, seq)
	{

	}

	function	Save()
	{
		var form 	= document.form;
		var	str		= "";
		
		var OldFromDate = document.getElementById("OldFromDate").value;
		var OldToDate = document.getElementById("OldToDate").value;
		var FromDate = form.EXT_FROMDATE.value;
		var ToDate = form.EXT_TODATE.value

		if(FromDate.length<1){
			alert("시작 연장 기간을 넣어주세요.");
			return;
		}
		if(ToDate.length<1){
			alert("종료 연장 기간을 넣어주세요.");
			return;
		}
		if(FromDate>ToDate){
			alert("시작 연장 기간이 종료 연장 기간보다 더 뒤에 선택되었습니다.\n다시 선택 해주세요");
			return;
		}
		if(FromDate<OldToDate){
			alert("연장 점용 시작날짜보다 이전 점용기간 마지막 날짜가 더 뒤에 선택되었습니다.\n다시 연장 점용 시작날짜를 선택 해주세요.\n기존 날짜:"+OldFromDate+"~"+OldToDate);
			return;
		}
		if(form.EXT_MANAGER.value.length	< 1){
			alert("담당자를 입력하세요.");
			return;
		}
		if(form.EXT_REGDATE.value.length	< 1){
			alert("등록일자를 입력하세요.");
			return;
		}		
	
		form.action = "gigan_register.do";
		form.submit();
	}

	function 	Init()
	{
		parent.TabDown_Img("gigan");
		
		var	adminno	= document.getElementById("ADMIN_NO").value;
		var	seq		= document.getElementById("SEQ").value;
		
	//	alert(adminno + " , " + seq);
		
	//	if(seq != "")
	//		View(adminno, seq);
	}

	function submitPrint()
	{
		var form 	= document.forms[0];
		var	str		= "";
			
		//	민원등록
		if(form.YEAR.value.length < 1 )
		{
			str	+= "통보년월을 입력하세요\n";
			form.YEAR.focus();
		}
		else if(form.MONTH.value.length	< 1 || Number(form.MONTH.value) > 12 || Number(form.MONTH.value) < 1)
		{
			str	+= "통보년월을 입력하세요\n";
			form.MONTH.focus();
		}
		else if(form.FROMDATE.value.length	< 1)
		{
			str	+= "신청 시작일을 입력하세요\n";
		}
		else if(form.TODATE.value.length	< 1)
		{
			str	+= "신청 종료일을 입력하세요\n";	
			form.TODATE.focus();	
		}
		else if(form.MANAGER.value.length	< 1)
		{
			str	+= "담당자를 입력하세요\n";
			form.MANAGER.focus();
		}
		else if(form.TEL.value.length	< 1)
		{
			str	+= "연락처를 입력하세요\n";
			form.TEL.focus();
		}
		else if(form.ENDDATE.value.length	< 1)
		{
			str	+= "만료일자를 입력하세요\n";
			form.ENDDATE.focus();
		}
		else if(form.DEPT.value.length	< 1)
		{
			str	+= "신청장소를 입력하세요\n";
			form.DEPT.focus();
		}
						
		if(str	!= "")
		{
			alert(str);
			return	false;
		}
		return true;
	}
	
	function fnPreView()
	{
		if(!submitPrint()) return;
		
		var oRptMainParam;
		oRptMainParam = rex_GetgoDictionay(); 

		// 필수 - 레포트명
		oRptMainParam.put("rex_rptname", "annae");

		// 필수 - 데이터 타입 설정
		oRptMainParam.put("rex_datatype", "XML");  // XML, CSV

		// 옵션 - 다른 DB를 연결시
		oRptMainParam.put("rex_userservice", "oracle_jndi");

		// 옵션 - 파라메터 설정
		var form 	= document.forms[0];

		oRptMainParam.put("ADMIN_NO" ,form.ADMIN_NO.value);
		oRptMainParam.put("YEAR" ,form.YEAR.value);
		oRptMainParam.put("MONTH" ,form.MONTH.value);
		oRptMainParam.put("FROMDATE" ,form.FROMDATE.value);	
		oRptMainParam.put("TODATE" ,form.TODATE.value);
		oRptMainParam.put("MANAGER" ,form.MANAGER.value);
		oRptMainParam.put("TEL" ,form.TEL.value);
		oRptMainParam.put("ENDDATE" ,form.ENDDATE.value);
		oRptMainParam.put("DEPT" ,form.DEPT.value);
		oRptMainParam.put("NOTES" ,form.NOTES.value);
		oRptMainParam.put("GU_NM" ,form.guNm.value);

		// preview 팝업 열기
		rex_gfRexRptOpen("popup", oRptMainParam);
			
		return oRptMainParam;			
	}
	
	function year_keyup()
	{	
		var form = document.form;
		
		if(form.YEAR.value.length == 4)
			form.MONTH.focus();
	}
//]]>
</script>

<body onload="Init();">
<form id="form" name="form" method="post">
<input type="hidden" id="ADMIN_NO" name="ADMIN_NO" value="${ADMIN_NO}">
<input type="hidden" id="SEQ" name="SEQ" value="${SEQ}">
<input type="hidden" id="guNm" name="guNm" value="${guNm}">
<input type="hidden" id="currentPage" name="currentPage" value="${currentPage}">
<input type="hidden" id="OldFromDate" name="OldFromDate" value="${FromDate}">
<input type="hidden" id="OldToDate" name="OldToDate" value="${ToDate}">

<table width="780" border="0" cellpadding="0" cellspacing="0">


	  <tr>
		<td align="left" class="contborder_blue">
		<table width="100%" border="0" cellspacing="0" cellpadding="0">

		<tr>
		
		  <tr>
			<td height="34" colspan="4" align="left" bgcolor="#FFFFFF" class=""><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
				<tr>
				  <td><span class="sub_stan_blue">* 기간만료 통보</span></td>
				</tr>
			</table></td>
		  </tr>

		  <tr>
		  <td><table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">

			  <tr>
				<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">부과 년월</td>
				<td colspan="3" bgcolor="eaeaea" class="table_bl_left">
				<input id="YEAR" name="YEAR" type="text" class="input_form1" style="width:70px" value="" maxlength="4" onKeyDown="nr_num_int(this);" onKeyUp="year_keyup();nr_num_int(this);" onKeyPress="nr_num_int(this);"> 년
				<input id="MONTH" name="MONTH" type="text" class="input_form1" style="width:70px" value="" maxlength="2" onKeyDown="nr_num_int(this);" onKeyUp="nr_num_int(this);" onKeyPress="nr_num_int(this);"> 월
				</td>
			  </tr>
		  	  
			  <tr>
				<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">신청 시작일</td>
				<td width="37%" bgcolor="eaeaea" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
				  <tr>
					<td><input id="FROMDATE" name="FROMDATE" type="text" class="input_form1" style="width:70px" value="" readonly></td>
					<td><a><img src="/img/calendar_icon.gif" width="19" height="16" border="0" onclick="popUpCalendar(this, document.getElementById('FROMDATE'), 'yyyymmdd')" style="CURSOR: Hand;"></a></td>				  
				  </tr>
				</table></td>
				<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">신청 종료일</td>
				<td width="" bgcolor="eaeaea" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
				  <tr>
					<td><input id="TODATE" name="TODATE" type="text" class="input_form1" style="width:70px" value="" readonly></td>
					<td><a><img src="/img/calendar_icon.gif" width="19" height="16" border="0" onclick="popUpCalendar(this, document.getElementById('TODATE'), 'yyyymmdd')" style="CURSOR: Hand;"></a></td>				  
				  </tr>
				</table></td>
			  </tr>
			  			  
			  <tr>
				<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">담당자</td>
				<td bgcolor="eaeaea" class="table_bl_left"><input id="MANAGER" name="MANAGER" type="text" class="input_form1" style="width:120px"  value="${MANAGER}"  maxlength="10"></td>
				<td align="center" bgcolor="e5eff8" class="sub_table_b">연락처</td>
				<td bgcolor="eaeaea" class="table_bl_left"><input id="TEL" name="TEL" type="text" class="input_form1" style="width:200px" value="${TEL}" maxlength="30"></td>
			  </tr>
			  
			  <tr>
				<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">만료 일자</td>
					<td bgcolor="eaeaea" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
					  <tr>
						<td>
							<input id="ENDDATE" name="ENDDATE" type="text" class="input_form1" style="width:70px" value="" readonly>
						</td>
						<td>
							<a><img src="/img/calendar_icon.gif" width="19" height="16" border="0" onclick="popUpCalendar(this, document.getElementById('ENDDATE'), 'yyyymmdd')" style="CURSOR: Hand;"></a>
						</td>	  
					  </tr>
					</table></td>
				<td align="center" bgcolor="e5eff8" class="sub_table_b">신청 장소</td>
				<td bgcolor="eaeaea" class="table_bl_left">
					<input id="DEPT" name="DEPT" type="text" class="input_form1" style="width:250px" value="${GU_NM} ${DEPT_NM}" maxlength="30">
				</td>
			  </tr>
			  
			  <tr>
				<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">비고</td>
				<td colspan="3" bgcolor="eaeaea" class="table_bl_left">
				<table width="100%" border="0" cellpadding="0" cellspacing="0">
			  	<tr>
					<td>
						<input id="NOTES" name="NOTES" type="text" class="input_form1" style="width:98%" value="" maxlength="100">
					</td>
				</tr>
				</table>
				</td>
			  </tr>

		  </table></td>
		</tr>
		
		<tr>
			<td height="40" align="right">
		  		<img src="/img/print_icon.gif" onclick="fnPreView();" alt="안내문 출력" border="0" style="CURSOR: Hand;">
			</td>
		</tr>
	
		<tr></tr><tr></tr>
		
        <tr>
          <td height="1" bgcolor="#EAEAEA"></td>
        </tr> 
	
	    <tr>
	    	<td height="30" colspan="0" align="left" bgcolor="#FFFFFF" class=""><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
		    	<tr>
			       <td><span class="sub_stan_blue">* 점용기간 연장</span></td>
			    </tr>
	    	</table></td>
	    </tr>
	    
		  <td><table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
 
			  <tr>
				<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">담당자</td>
				<td width="37%" bgcolor="eaeaea" class="table_bl_left">
				<input id="EXT_MANAGER" name="EXT_MANAGER" type="text" class="input_form1" style="width:120px"  value="${MANAGER}" maxlength="10"></td>
				<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">등록일자</td>
				<td bgcolor="eaeaea" class="table_bl_left">
					<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
					  <tr>
						<td><input id="EXT_REGDATE" name="EXT_REGDATE" type="text" class="input_form1" style="width:70px" value="${EXT_REGDATE}" readonly></td>
						<td><a><img src="/img/calendar_icon.gif" width="19" height="16" border="0" onclick="popUpCalendar(this, EXT_REGDATE, 'yyyymmdd')" style="CURSOR: Hand;"></a></td>					  
					  </tr>
					</table>
				</td>
			  </tr>
			
			  <tr>
				<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">기간연장 시작</td>
				<td bgcolor="eaeaea" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
				  <tr>
					<td><input id="EXT_FROMDATE" name="EXT_FROMDATE" type="text" class="input_form1" style="width:70px" value="${AFTER_FROMDATE}" readonly></td>
					<td><a><img src="/img/calendar_icon.gif" width="19" height="16" border="0" onclick="popUpCalendar(this, document.getElementById('EXT_FROMDATE'), 'yyyymmdd')" style="CURSOR: Hand;"></a></td>				  
				  </tr>
				</table></td>
				<td width="100" align="center" bgcolor="e5eff8" class="sub_table_b">기간연장 종료</td>
				<td bgcolor="eaeaea" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
				  <tr>
					<td><input id="EXT_TODATE" name="EXT_TODATE" type="text" class="input_form1" style="width:70px" value="${AFTER_TODATE}" readonly></td>
					<td><a><img src="/img/calendar_icon.gif" width="19" height="16" border="0" onclick="popUpCalendar(this, document.getElementById('EXT_TODATE'), 'yyyymmdd')" style="CURSOR: Hand;"></a></td>				  
				  </tr>
				</table></td>
			  </tr>
			  
			  <tr>
				<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">비고</td>
				<td colspan="3" bgcolor="eaeaea" class="table_bl_left">
				<table width="100%" border="0" cellpadding="0" cellspacing="0">
			  	<tr>
					<td>
						<input id="EXT_NOTES" name="EXT_NOTES" type="text" class="input_form1" style="width:98%" value="${NOTES}" maxlength="50">
					</td>
				</tr>
				</table>
				</td>
			  </tr>
			  
		  </table></td>

		<tr>
			<td height="40" align="right">
		  		<a><img src="/img/mod_icon.gif" border="0" onclick="javascript:Save();" style="CURSOR: Hand;"></a>
			</td>
		</tr>		
		
	</table></td>
  </tr>


</table>
</form>
</body>
</html>