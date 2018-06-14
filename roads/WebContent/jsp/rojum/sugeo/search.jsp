<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ include file="/jsp/common/loginCheck.jsp"%>
<%@ include file="/jsp/common/include.jsp"%>
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

#tr_fixed_header {
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
<script language="javascript" src="/js/Check_inputbox.js"></script>
<script language="javascript" src="/js/selectItem.js"></script>


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

	function	View(mul_no)
	{
		var form = document.form;
	
		form.action = "view.do?mul_no=" + mul_no;
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

	function	Init()
	{	
		var obj = document.form.message.value;
		
		if(obj != "")	
			alert(obj);
	}

	function checkKeySearch()
	{
		if(event.keyCode == 13) Search();
	}
		
	function Ilgwal_Sunap()
	{
		var f = document.form;

		var select_item = document.getElementsByName("SELECT_ITEM");
		var item_check = document.getElementsByName("ITEM_CHECK");
		var status_code = document.getElementsByName("REM_STATUS_CODE");

		var count = 0;

		for(var i = 0 ; i < select_item.length ; i++){
			if(select_item[i].checked == true && (status_code[i].value == "7" || status_code[i].value == "5")){
				item_check[i].value = true;
				count++;
			}else{
				item_check[i].value = false;
			}
		}
		if(count <= 0){
			alert("부과상태인 데이터가 선택되어있지 않습니다.");
			return;
		}


        if(!confirm(count+"건에 대해서 수납 처리하시겠습니까?"))
            return;

        Message_Display('MSG',1,document.body.clientWidth/2+document.getElementById('MSGValue').width/2,document.body.clientHeight/2-document.getElementById('MSGValue').height/2);

		form.action = "/rojum/sugeo/sugeo_ilgwal_Sunap.do";
		form.submit();
	}
		
	function	Register()
	{
		
		var form = document.form;
		form.action = "/rojum/sugeo/register.do";
		form.submit();
	}
	
//]]>
</script>

<body onload="Init();">
<form name="form" method="post">
	<span id="MSG" style="position: absolute; visibility: hidden;">
		<img src="/img/wait.gif" id="MSGValue"> 
	</span> 
	<input type="hidden" name="currentPage" value="${currentPage}"> 
	<input type="hidden" name="TOTALCNT" value="${totalcnt }">
	<input type="hidden" name="excel" value="">
	<input type="hidden" name="message" value="${message}">

<table width="800" border="0" cellpadding="0" cellspacing="0">
	<tr>
		<td height="43"><img src="/img/sugeo_title.gif" width="800"
			height="43"></td>
	</tr>
	<tr>
		<td align="center">
		<table width="780" border="0" cellspacing="0" cellpadding="0">

			<tr>
				<td height="1" bgcolor="eaeaea"></td>
			</tr>
			<tr>
				<td height="14"></td>
			</tr>

			<tr>
				<td align="left">
				<table width="780" border="0" cellspacing="0" cellpadding="0">
					<tr>
						<td height="22" background="/img/tab_line_blue.gif">
						<table border="0" cellspacing="0" cellpadding="0">
							<tr>
								<td><img src="/img/sugeo_on.gif" width="110" height="22"></td>
							</tr>
						</table>
						</td>
					</tr>

					<tr>
						<td class="contborder_blue">
						<table width="100%" border="0" cellspacing="0" cellpadding="0">
							<tr>
								<td>
								<table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse: collapse;" cellpadding="0"	cellspacing="0" class="sub_table">

									<tr>
										<td height="26" align="center" bgcolor="e5eff8"	class="sub_table_b">수거일자</td>
										<td bgcolor="eaeaea" class="table_bl_left">
										<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
											<tr>
												<td>
													<input name="rem_date_from" type="text"	class="input_form1" style="width: 70px" value="${rem_date_from }">
													<a>
													<img src="/img/calendar_icon.gif" width="19" height="16" border="0" align="absmiddle" onclick="popUpCalendar(this, document.getElementById('rem_date_from'), 'yyyymmdd')" style="CURSOR: Hand;">
													</a>
													 ~
													<input name="rem_date_to" type="text" class="input_form1" style="width: 70px" value="${rem_date_to }">
													<a>
													<img src="/img/calendar_icon.gif" width="19" height="16" border="0" align="absmiddle" onclick="popUpCalendar(this, document.getElementById('rem_date_to'), 'yyyymmdd')" style="CURSOR: Hand;">
													</a>
												</td>
											</tr>
										</table>
										</td>
										<td width="100" align="center" bgcolor="e5eff8"	class="sub_table_b">수거물품</td>
										<td bgcolor="eaeaea" class="table_bl_left">
											<select	name="rem_mulcd_search" class="input_form1"	style="width: 100px">
											${re_typ }
										</select>
										<input type="text" class="input_form1" style="width: 100px" name="rem_mulnm_search" value="${rem_mulnm_search }">
										</td>
									</tr>

									<tr>
										<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">수거위치</td>
										<td bgcolor="eaeaea" class="table_bl_left">
										<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
											<tr>
												<td>${gu_nm } &nbsp;</td>
												<td>
													<select name="rem_bjcd_search" class="input_form1" style="width: 100px">
														${bjdong_code }
													</select>
												</td>
												<td>&nbsp;
												</td>
											</tr>
										</table>
										</td>
										<td width="100" align="center" bgcolor="e5eff8"	class="sub_table_b">주변정보</td>
										<td bgcolor="eaeaea" class="table_bl_left">
											<input type="text" class="input_form1" style="width: 100px" name="rem_addr_search" value="${rem_addr_search }">
										</td>
									</tr>

									<tr>
										<td td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">소유자명</td>
										<td bgcolor="eaeaea" class="table_bl_left" colspan="3">
											<input type="text" class="input_form1" style="width: 100px" name="rem_nm_search" value="${rem_nm_search }">
										</td>

									</tr>

								</table>
								</td>
							</tr>
							<tr>
								<td height="32" align="right"><a href="javascript:Search()">
									<img src="/img/inquiry_icon2.gif" alt="조회" width="56" height="18" border="0"></a>
								</td>
							</tr>

							<tr>
								<td height="1" bgcolor="#EAEAEA"></td>
							</tr>
							<tr>
								<td height="34" class="sub_stan">전체건수 : <span class="sub_stan_blue">${totalcnt}</span>건</td>
							</tr>
							<tr>
								<td>
								<div style="height: 350px; width: 780px; padding: 10px; overflow: auto; scrollbar-face-color: #EEF8FB; scrollbar-3dlight-color: #BBBDB6; scrollbar-highlight-color: #EEF8FB; scrollbar-shadow-color: #BBBDB6; scrollbar-darkshadow-color: #EEF8FB; scrollbar-track-color: #EEF8FB; scrollbar-arrow-color: #BBBDB6;">
								<table width="1200px" border="1" bordercolor="#c9dfed" style="border-collapse: collapse;" cellpadding="0" cellspacing="0" class="sub_table">
									<tr>
										<td height="35" align="center" bgcolor="e5eff8"	class="sub_table_b" width="35">
											<INPUT TYPE="checkbox" ID="SELECT_ALL" onclick="javascript:selectAll(this);">
										</td>
										<td width="40" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">번호</td>
										<td width="100" align="center" bgcolor="e5eff8" class="sub_table_b">관리번호</td>
										<td width="50" align="center" bgcolor="e5eff8" class="sub_table_b">결 과</td>
										<td width="160" align="center" bgcolor="e5eff8"	class="sub_table_b">처리상태</td>
										<td width="70" align="center" bgcolor="e5eff8" class="sub_table_b">소유자명</td>
										<td width="100" align="center" bgcolor="e5eff8"	class="sub_table_b">과태료</td>
										<td width="140" align="center" bgcolor="e5eff8"	class="sub_table_b">수거일자</td>
										<td width="160" align="center" bgcolor="e5eff8"	class="sub_table_b">수거물품</td>
										<td width="" align="center" bgcolor="e5eff8" class="sub_table_b">수거위치</td>
										<td width="" align="center" bgcolor="e5eff8" class="sub_table_b">주변정보</td>


									</tr>

									<c:choose>
										<c:when test='${blist != null && !empty blist}'>
											<c:forEach items="${blist}" var="board" varStatus="idx">
												<tr onMouseOver="this.style.backgroundColor='#f6f7f8'" onMouseOut="this.style.backgroundColor=''" style="cursor: pointer">
													<td align="center">
														<INPUT TYPE="checkbox" NAME="SELECT_ITEM">
														<INPUT TYPE="hidden" NAME="MUL_NO" value="${board.MUL_NO}">
														<INPUT TYPE="hidden" NAME="ITEM_CHECK" value="">
														<INPUT TYPE="hidden" NAME="REM_STATUS_CODE" value="${board.REM_STATUS_CODE}">
													</td>
													<td height="26" align="center"	onclick="View('${board.MUL_NO}')">${board.RN}</td>
													<td align="center" onclick="View('${board.MUL_NO}')">${board.MUL_NO}</td>
													<td align="center" onclick="View('${board.MUL_NO}')">
													<c:choose>
														<c:when
															test="${board.REM_STATUS_CODE == '6' || board.REM_STATUS_CODE == '8' || board.REM_STATUS_CODE == '12' || board.REM_STATUS_CODE == '13' }">
															<font color="blue"> 완료 </font>

														</c:when>
														<c:otherwise>
															<font color="red"> 진행중 </font>
														</c:otherwise>
													</c:choose>
													</td>
													<td align="center" onclick="View('${board.MUL_NO}')">${board.REM_STATUS_NM}</td>
													<td align="center" onclick="View('${board.MUL_NO}')">${board.REM_OWNER_NM}</td>
													<td align="center" onclick="View('${board.MUL_NO}')">${rnic:insertComma2(board.TAX)}</td>
													<td align="center" onclick="View('${board.MUL_NO}')">${board.REM_DATE}</td>
													<td align="center" onclick="View('${board.MUL_NO}')">${board.REM_MULNM}</td>
													<td align="center" onclick="View('${board.MUL_NO}')">${board.REM_ADDR}</td>
													<td align="center" onclick="View('${board.MUL_NO}')">${board.REM_ADDR_INFO}</td>
												</tr>
											</c:forEach>
										</c:when>
										<c:otherwise>
											<tr>
												<td align="center" class="sub_table" colspan="8" height="85">
												내용이 없습니다</td>
											</tr>
										</c:otherwise>
									</c:choose>
								</table>
								</div>
								</td>
							</tr>

							<tr>
								<td height="30" align="center">
								<table border="0" cellspacing="0" cellpadding="0">
									<tr>
									<td>
										${pageing }
									</td>
										
									</tr>
								</table>
								</td>
							</tr>

						</table>
						</td>
					</tr>
					<tr>
						<td height="40" align="right">
						<img src="../../../img/newregi_icon.gif" alt="신규등록" border="0" onclick="javascript:Register();" style="cursor: hand">						
						<img src="/img/ilgwal_sunap_icon.gif" alt="일괄수납처리" border="0" onclick="javascript:Ilgwal_Sunap();" style="cursor: hand">

						<img src="../../../img/excel_icon.gif" alt="EXCEL 변환" border="0" onclick="javascript:excel_Search();" style="cursor: hand">
						</td>
					</tr>
				</table>
				</td>
			</tr>

			<tr>
				<td></td>
			</tr>
		</table>
		</td>

	</tr>
</table>
</form>
</body>
<script language="javascript">
<!--
	//select의 option을 선택된 값으로 지정
	function setSelectedOption(obj, val){
		for(i = 0 ; i < obj.options.length ; i++){
			if(obj.options[i].value == val){
				obj.options[i].selected = true;
				return;
			}
		}
	}
	setSelectedOption(document.form.rem_mulcd_search, '${param.rem_mulcd_search}');
	setSelectedOption(document.form.rem_bjcd_search, '${param.rem_bjcd_search}');
//-->
</script>
</html>