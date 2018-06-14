<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ include file="/jsp/common/loginCheck.jsp" %>
<%@ include file="/jsp/common/include.jsp" %>
<!--  //********** BEGIN_KANG_20120409 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt_rt"%>
<!--   //********** END_KANG_20120409 -->
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

	function	View(adminno,seq,section)
	{
		var form = document.form;

		if(form.bugwa_id.value == "")
		{
			alert('사용자 정보에서 인사대체키 사용자 ID 정보가 없습니다. \n 변경  후 사용바랍니다.');
			window.open("/admin/user/getInsarangKey.do", "gongji", "width=770,height=700,left=20,top=20,scrollbars=yes");
		}
		else
		{
			form.action = "view.do?ADMIN_NO=" + adminno+"&SEQ="+seq+"&SECTION="+section;
			form.submit();
		}
	}

	function	Search()
	{
		var form = document.form;
		var purpose1 = IFRM_PurposeCode.document.getElementById("PURPOSE1");
		
		form.currentPage.value	= 1;
		form.PURPOSE_CD.value	= IFRM_PurposeCode.document.getElementById("PURPOSE_CD").value;
		
		if(form.TYPE.selectedIndex == 0){
			form.PURPOSE_CD.value = "";
		}else{
			if(purpose1[purpose1.selectedIndex].text == "::선택::")
				form.PURPOSE_CD.value = "";
		}

		//페이징성능업
		form.TOTALCNT.value = '0';
		
		form.action = "search.do";
		form.submit();
	}
	
	function	excel_Search()
	{
		var form = document.form;
		var purpose1 = IFRM_PurposeCode.document.getElementById("PURPOSE1");
		
		form.currentPage.value	= 1;
		form.PURPOSE_CD.value	= IFRM_PurposeCode.document.getElementById("PURPOSE_CD").value;
		
		if(form.TYPE.selectedIndex == 0){
			form.PURPOSE_CD.value = "";
		}else{
			if(purpose1[purpose1.selectedIndex].text == "::선택::")
				form.PURPOSE_CD.value = "";
		}

		//페이징성능업
		form.TOTALCNT.value = '0';
		
		form.action = "excel_search.do";
		form.submit();
	}

	function	Select_UseType(sel)
	{
		document.getElementById("IFRM_PurposeCode").src="/jsp/common/purposeCode/purposeCode2.jsp?SectionCode="+sel.value+"&PURPOSE_CD=&search_flag=1";
	}

	function	Init()
	{	

		setYear();
		document.getElementById("resultDiv").style.width = 780;
		document.getElementById("resultSaewe").width = 1600;
		
		var obj = document.form.message.value;
		
		if(obj != "")	
			alert(obj);
		
		if(document.form.PURPOSE_CD.value.length<1){
			document.getElementById("IFRM_PurposeCode").src="/jsp/common/purposeCode/purposeCode2.jsp?SectionCode="+document.getElementById("TYPE").value+"&PURPOSE_CD=000"+"&search_flag=1";
		}else{
			document.getElementById("IFRM_PurposeCode").src="/jsp/common/purposeCode/purposeCode2.jsp?SectionCode="+document.getElementById("TYPE").value+"&PURPOSE_CD="+document.form.PURPOSE_CD.value;	
		}
	}

	function checkKeySearch()
	{
		if(event.keyCode == 13) Search();
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
		
		form.action = "/jumyong/saewe/saeweSuipBugwa_ilgwal.do";
		form.submit();
	}
	
	//	관리자 번호 앞에 9자리 삭제
	function	nr_Adminno_Cut2(adminno)
	{
		if(adminno.length != 20)
			return	adminno
	
		adminno	= adminno.substr(9, 11);
		
		return	adminno;
	}

    function setYear()
    {
        now = new Date();
        Y = now.getFullYear();

        var strYear = "${YearVal}";

        for(var i = 0 ; i < 10 ; i++){
            newItem = new Option(i);
            document.getElementById("YEAR").options[i]  = newItem;
            document.getElementById("YEAR").options[i].text = Y+1-i;
            document.getElementById("YEAR").options[i].value = Y+1-i;
            if(strYear == Y-i) document.getElementById("YEAR").options[i].selected = true;
        }

        document.getElementById("YEAR").options.value = strYear;
    }


	// 부과년도 검색 셋팅
	function change_year()
	{
		document.getElementById("GIGAN1").value = document.getElementById("YEAR").options.value + "-01-01";
		document.getElementById("GIGAN2").value = document.getElementById("YEAR").options.value + "-12-31";
	}

	

    
//]]>
</script>

<body onload="Init();">
<form id="form" name="form" method="post" action="search.jsp">
<input type="hidden" id="currentPage" name="currentPage" value="${currentPage}">
<input type="hidden" id="PURPOSE_CD" name="PURPOSE_CD" value="${PURPOSE_CD}">
<input type="hidden" id="TOTALCNT" name="TOTALCNT" value="${totalcnt}">
<input type="hidden" id="excel" name="excel" value="">
<input type="hidden" id="message" name="message" value="${message}">
<input id="search" name="search" type="hidden" value="${search}">
<input id="bugwa_id" name="bugwa_id" type="hidden" value="${bugwa_id}">


<table width="780" border="0" cellpadding="0" cellspacing="0">
	<tr>
		<td height="43"><img src="/img/sub1_cont3_title.gif" width="800" height="43"></td>
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
											<td><img src="/img/sub_petition_title10.gif" width="110" height="22"></td>
										</tr>
									</table>
								</td>
							</tr>
							<tr>
								<td class="contborder_purple">
									<table width="100%" border="0" cellspacing="0" cellpadding="0">
										<tr>
											<td>
												<table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
													<tr>
                                                        <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b" >산출년도</td>
                                                        <td bgcolor="eaeaea" class="table_bl_left" colspan="3">
                                                            <select  id="YEAR" name="YEAR" class="input_form1" style="width:130px">
                                                            </select>

                                                        </td>

                                                    </tr>
													<tr>
														<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">갱신기간</td>
														<td  bgcolor="eaeaea" class="table_bl_left">
															<input id="GIGAN1" name="GIGAN1" type="text" class="input_form1" style="width:70px" value="${GIGAN1}">
															<img src="/img/calendar_icon.gif" width="19" height="16" border="0" align="absmiddle" onclick="popUpCalendar(this, document.getElementById('GIGAN1'), 'yyyymmdd')" style="vertical-align:middle;CURSOR:pointer;">
															&nbsp;~&nbsp;
															<input id="GIGAN2" name="GIGAN2" type="text" class="input_form1" style="width:70px" value="${GIGAN2}">
															<img src="/img/calendar_icon.gif" width="19" height="16" border="0" align="absmiddle" onclick="popUpCalendar(this, document.getElementById('GIGAN2'), 'yyyymmdd')" style="vertical-align:middle;CURSOR:pointer;">
														</td>
														<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">작성여부</td>
														<td bgcolor="eaeaea" class="table_bl_left" colspan="3">
															<select id="CAL_YN" name="CAL_YN" class="input_form1" style="width:100px">
																${cal_yn}
															</select>
														</td>		
													</tr>
													<tr>
														<td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">점용종류</td>
														<td width="37%" bgcolor="eaeaea" class="table_bl_left">
														  <select id="TYPE" name="TYPE" class="input_form1" style="width:100px" OnChange="Select_UseType(this);">
															${use_type}
														  </select>
														</td>
														<td width="100" align="center" bgcolor="e5eff8" class="sub_table_b">점용구분</td>
														<td bgcolor="eaeaea" class="table_bl_left">
															<select id="SECTION" name="SECTION" class="input_form1" style="width:100px" OnChange="">
															${occupancy_type}
															</select>
														</td>
													</tr>
													<tr>
														<td td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">세입구분</td>
														<td bgcolor="eaeaea" class="table_bl_left">
															<select id="TAX_SET"  name="TAX_SET" class="input_form1" style="width:100px">
																${taxation_section}
															</select>
														</td>					  
														<td align="center" bgcolor="e5eff8" class="sub_table_b">부과여부</td>
														<td bgcolor="eaeaea" class="table_bl_left">
															<select id="TAX_YN" name="TAX_YN" class="input_form1" style="width:100px">
																${taxation_yn}
															</select>
														</td>					  
													</tr>										
													<tr>
														<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">점용목적</td>
														<td colspan="3" bgcolor="eaeaea" class="">
															<table width="100%" border="0" cellpadding="0" cellspacing="0" class="">
																<iframe id="IFRM_PurposeCode" align="absmiddle" scrolling="no" frameborder="0" framespacing="0" width="100%" height="26"></iframe>
															</table>
														</td>
													</tr>
													<tr>
													  	<td height="32" align="center" bgcolor="e5eff8" class="sub_table_b">시군구</td>
													  	<td bgcolor="eaeaea" class="table_bl_left">
								                          <select id="GU_CD" name="GU_CD" class="input_form1" style="width:130px">
								                          ${gu_code}
								                          </select>
													  	</td>
														<td align="center" bgcolor="e5eff8" class="sub_table_b">법정동</td>
														<td bgcolor="eaeaea" class="table_bl_left">
															<select id="BJ_CD" name="BJ_CD" class="input_form1" style="width:100px">
																${bjdong_code}
															</select>
														</td>
													</tr>
													<tr>
														<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">점용지번지</td>
														<td bgcolor="eaeaea" class="table_bl_left">
															<input id="BONBUN" name="BONBUN" type="text" class="input_form1" style="width:40px" value="${BONBUN}"> -
															<input id="BUBUN" name="BUBUN" type="text" class="input_form1" style="width:40px" value="${BUBUN}">
														</td>
														<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">점용인/법인명</td>
														<td bgcolor="eaeaea" class="table_bl_left">
															<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
																<tr>
																	<td>
																		<input id="NAME" name="NAME" type="text" class="input_form1" style="width:100px" onKeyDown="javascript:checkKeySearch();" value="${NAME}">
																	</td>
																</tr>
															</table>
														</td>
													</tr>
													<tr>
														<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">관리번호</td>
														<td bgcolor="eaeaea" class="table_bl_left" colspan="3">
															<input id="ADMINNO" name="ADMINNO" type="text" class="input_form1" style="width:120px" onKeyDown="javascript:checkKeySearch();" value="${ADMINNO}">
														</td>
													</tr>
												</table>
											</td>
										</tr>
										<tr>
											<td height="32" align="right">
												<a href="javascript:Search()"><img src="/img/inquiry_icon2.gif" alt="조회" width="56" height="18" border="0"></a>
											</td>
										</tr>
										<tr>
											<td height="1" bgcolor="#EAEAEA"></td>
										</tr>
										<tr>
											<td height="34" class="sub_stan">전체건수 : <span class="sub_stan_blue">${totalcnt}</span> 건 </td>
										</tr>
										<tr>
											<td>
											<div id="resultDiv" style="padding:10px;overflow-x:scroll; scrollbar-face-color:#EEF8FB;scrollbar-3dlight-color:#BBBDB6; scrollbar-highlight-color:#EEF8FB;scrollbar-shadow-color:#BBBDB6; scrollbar-darkshadow-color:#EEF8FB;scrollbar-track-color:#EEF8FB;scrollbar-arrow-color:#BBBDB6; "> 
												<table id="resultSaewe" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
													<tr>
														<td height="28" align="center" bgcolor="e5eff8" class="sub_table_b">번호</td>
														<td align="center" bgcolor="e5eff8" class="sub_table_b">관리번호</td>
														<td align="center" bgcolor="e5eff8" class="sub_table_b">년도</td>
														<td align="center" bgcolor="e5eff8" class="sub_table_b">과세<br/>번호</td>
														<td align="center" bgcolor="e5eff8" class="sub_table_b">점용<br/>종류</td>
														<td align="center" bgcolor="e5eff8" class="sub_table_b">점용<br/>구분</td>
                        		<td align="center" bgcolor="e5eff8" class="sub_table_b">점용지<br/>소유</td>
														<td align="center" bgcolor="e5eff8" class="sub_table_b">세목코드</td>
														<td align="center" bgcolor="e5eff8" class="sub_table_b">점용목적</td>		
														<td align="center" bgcolor="e5eff8" class="sub_table_b">점용인</td>
														<td align="center" bgcolor="e5eff8" class="sub_table_b">면적<br/>㎡/개</td>
														<td align="center" bgcolor="e5eff8" class="sub_table_b">본세(점용료)</td>
														<td align="center" bgcolor="e5eff8" class="sub_table_b">부가가치세</td>
														<td align="center" bgcolor="e5eff8" class="sub_table_b">부과일자</td>
														<td align="center" bgcolor="e5eff8" class="sub_table_b">수납일자</td>
														<td align="center" bgcolor="e5eff8" class="sub_table_b">갱신일자</td>
														<td align="center" bgcolor="e5eff8" class="sub_table_b">산출기간</td> 
														<td align="center" bgcolor="e5eff8" class="sub_table_b">작성<br/>여부</td>
														<td align="center" bgcolor="e5eff8" class="sub_table_b">부과<br/>여부</td>
													</tr>

													<c:choose>
													<c:when test="${blist!= null && !empty blist}">
													<c:forEach items="${blist}" var="board" varStatus="idx">
													<tr onClick="javascript:View('${board.ADMIN_NO}', '${board.SEQ}','${board.SECTION }')" onMouseOver="this.style.backgroundColor='#f6f7f8'" onMouseOut="this.style.backgroundColor=''" style="CURSOR: Hand;" >
														<td height="26" align="center">${board.RN}</td>
														<td align="center"><script>var adminno = nr_Adminno_Cut2('${board.ADMIN_NO}'); document.write(adminno);</script></td>
														<%-- [20130509] yjmoon bean api 변경 SUM_YEAR -> YEAR--%>
														<td width="30" align="center">${board.YEAR}</td>
														<td align="center">${board.TAX_NO}</td>
														<td width="30" align="center">${board.TYPE}</td>
														<td width="30" align="center">${board.SECTION_NAME}</td>														
	                        	<td align="center">${board.OWNER_SET_NM}</td>   
														<td align="center">${board.TAXCODE_NM}</td>
														<td align="center">${board.PURPOSE_NM}</td>	
														<td align="center">${board.NAME}</td>
														<td align="center">${board.AREA}</td>
														<!--  //********** BEGIN_KANG_20120409 -->																												
														<td align="center"><c:if test="${board.BONSE != '-'}"><fmt:formatNumber pattern="#,#00" value="${board.BONSE}"/></c:if><c:if test="${board.BONSE == '-'}">-</c:if></td>														
														<td align="center"><c:if test="${board.VAT != '-'}"><fmt:formatNumber pattern="#,#00" value="${board.VAT}"/></c:if><c:if test="${board.VAT == '-'}">-</c:if></td>
														<!--   //********** END_KANG_20120409 -->
														<td align="center">${board.TAX_DATE}</td>
														<td align="center">${board.SUNAP_DATE}</td>
														<td align="center">${board.BASE_UPDATED}</td>
														<td align="center">${board.JUMGIGAN}</td>
														<td class="sub_table_r" align="center">${board.CAL_YN}</td>
														<td class="sub_table_r" align="center">${board.TAX_YN}</td>
													</tr>
													</c:forEach>
													</c:when>
													<c:otherwise>
													<tr>
														<td align="center" class="sub_table" colspan="17" height="85">검색된 내용이 없습니다</td>
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
													${pageing}
													</tr>
												</table>
											</td>
										</tr>
									</table>
								</td>
							</tr>
							<tr>
								<td height="40" align="right">
<!--
<img src="../../../img/levy_icon3.gif" alt="일괄 부과처리" border="0" onclick="javascript:SaeweSuipBugwa_Ilgwal();" style="cursor:hand">
-->
									<img src="../../../img/excel_icon.gif" alt="EXCEL 변환" border="0" onclick="javascript:excel_Search();" style="cursor:hand">
								</td>
							</tr>
						</table>
					</td>
				</tr>
			</table>
		</td>
	</tr>
</table>
</form>
</body>
</html>