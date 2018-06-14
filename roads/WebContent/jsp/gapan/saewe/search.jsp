<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
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
	background-image: url(/img/left_back.gif);
}
-->
</style>
<link href="/css/roads.css" rel="stylesheet" type="text/css">
</head>

<script language="javascript" src="/js/PopupCalendar.js"></script>
<script language="javascript" src="/js/Check_inputbox.js"></script>
<script language="javascript" src="/js/common.js"></script>
<script language="javascript" src="/js/PopupCalendar.js"></script>
<script language="javascript" src="/js/calculation.js"></script>
<script language="javascript" src="/js/selectItem.js"></script>

<script type="text/javascript">
//<![CDATA[
	
	function	View(gapanNo,seq)
	{
		var form = document.form;

		form.action = "/gapan/saewe/view.do?GAPAN_NO="+gapanNo+"&SEQ="+seq;
		form.submit();
	}

	function	Search()
	{
		var form = document.form;

		form.currentPage.value	= 1;
		form.action = "/gapan/saewe/search.do";
		form.submit();
	}
	
	function	excel_Search()
	{
		var form = document.form;

		form.currentPage.value	= 1;
		form.action = "/gapan/saewe/excel_search.do";
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

		setSelectedOption(document.form.CAL_MODE, '${CAL_MODE}');
		setYear();


		
	}

	//select의 option을 선택된 값으로 지정
	function setSelectedOption(obj, val){
		for(i = 0 ; i < obj.options.length ; i++){
			if(obj.options[i].value == val){
				obj.options[i].selected = true;
				return;
			}
		}
	}

	function checkKeySearch()
	{
		if(event.keyCode == 13) Search();
	}
		
	function SaeweSuipBugwa_Ilgwal()
	{
		 document.getElementById("Bugwa_Ilgwal").onclick = function(){
            	 alert("잠시만 기다리세요.");
       
		         };
		var f = document.form;
		var select_item = document.getElementsByName("SELECT_ITEM");
		var item_check = document.getElementsByName("ITEM_CHECK");
		var gapan_no_arr = document.getElementsByName("GAPAN_NO_ARR");
		var tax_yn_arr = document.getElementsByName("TAX_YN_ARR");
		var count = 0;

		for(var i = 0 ; i < select_item.length ; i++){
			if(select_item[i].checked == true && tax_yn_arr[i].value == '미부과'){
				item_check[i].value = select_item[i].checked;
				count++;
			}
		}
		
		if(count <= 0){
			alert("처리 대상이 없습니다.");
			return;
		}else{
			if(!confirm('부과대상이 아닌것을 제외한\n'+count+'건에 대해서 부과하시겠습니까?.'))
				return;
			
			form.action = "/gapan/saewe/saeweSuipBugwa_ilgwal.do";
			form.submit();
		
		}

	}

	//********** BEGIN_현진_20120228
	function bugwa_cancel(){		
		var f = document.form;
		var select_item = document.getElementsByName("SELECT_ITEM");
		var item_check = document.getElementsByName("ITEM_CHECK");
		var gapan_no_arr = document.getElementsByName("GAPAN_NO_ARR");
		var tax_yn_arr = document.getElementsByName("TAX_YN_ARR");
					
		var count = 0;
		var hitCount = 0;
		var target;

		for(var i = 0 ; i < select_item.length ; i++){
			if(select_item[i].checked == true){
				if(tax_yn_arr[i].value == '부과'){
					item_check[i].value = select_item[i].checked;
					hitCount++;
					target = i;
				}
			count++;
			}
		}
		
		if(count == 0){
			alert("처리 대상이 없습니다.");
			return;
		}else if(count <= 0 || hitCount <= 0){
			alert("부과 철회는 부과된 대상에 대해서만  가능합니다.");
			return;
		}else{
			if (confirm("부과 철회 하시겠습니까?")){
				form.action = "/gapan/saewe/bugwa_cancel.do";
				form.submit();
			}else{
				return;
			}
		}		
	}
	//********** END_현진_20120228
		
		
    function setYear()
    {
        now = new Date();
        Y = now.getFullYear();

        var strYear = "${YEAR}";    
        function setYear()
        {
            now = new Date();
            Y = now.getFullYear();

            var strYear = "${YEAR}";

            for(var i = 0 ; i < 10 ; i++){
                newItem = new Option(i);
                document.getElementById("YEAR").options[i]  = newItem;
                document.getElementById("YEAR").options[i].text = Y+1-i;
                document.getElementById("YEAR").options[i].value = Y+1-i;
                if(strYear == Y-i) document.getElementById("YEAR").options[i].selected = true;
            }

            document.getElementById("YEAR").options.value = strYear;
        }

        for(var i = 0 ; i < 10 ; i++){
            newItem = new Option(i);
            document.getElementById("YEAR").options[i]  = newItem;
            document.getElementById("YEAR").options[i].text = Y+1-i;
            document.getElementById("YEAR").options[i].value = Y+1-i;
            if(strYear == Y-i) document.getElementById("YEAR").options[i].selected = true;
        }

        document.getElementById("YEAR").options.value = strYear;
    }
//]]>
</script>

<body onload="Init();">
<form id="form" name="form" method="post" action="search.jsp">
	<input type="hidden" id="currentPage" name="currentPage" value="${currentPage}"> 
	<input type="hidden" id="TOTALCNT" name="TOTALCNT" value="${totalcnt}"> 
	<input type="hidden" id="excel" name="excel" value=""> 
	<input type="hidden" name="message" name="message" value="${message}">

	<table width="800" border="0" cellpadding="0" cellspacing="0">
		<tr>
			<td height="43"><img src="/img/sub9_cont3_title.gif" width="800" height="43"></td>
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
							<td class="contborder_blue">
							<table width="100%" border="0" cellspacing="0" cellpadding="0">
								<tr>
									<td>
									<table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse: collapse;" cellpadding="0" cellspacing="0" class="sub_table">
										<tr>
											<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">산출년도</td>
											<td bgcolor="eaeaea" class="table_bl_left">
												<select name="YEAR" id="YEAR" class="input_form1" style="width:130px">
                                                 </select>
											</td>
											<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">갱신기간</td>
											<td colspan="3" bgcolor="eaeaea" class="table_bl_left">
											<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
												<tr>
													<td>
														<input id="GIGAN1" name="GIGAN1" type="text" class="input_form1" style="width: 70px" value="${GIGAN1}">
														<img src="/img/calendar_icon.gif" width="19" height="16" border="0" align="middle" onclick="popUpCalendar(this, document.getElementById('GIGAN1'), 'yyyymmdd')" style="vertical-align: middle;cursor: pointer;">
														&nbsp;~&nbsp;
														<input id="GIGAN2" name="GIGAN2" type="text" class="input_form1" style="width: 70px" value="${GIGAN2}">
														<img src="/img/calendar_icon.gif" width="19" height="16" border="0" align="middle" onclick="popUpCalendar(this, document.getElementById('GIGAN2'), 'yyyymmdd')" style="vertical-align: middle;cursor: pointer;">
													</td>
												</tr>
											</table>
											</td>
										</tr>
	
										<tr>
											<td td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">세입구분</td>
											<td bgcolor="eaeaea" class="table_bl_left">
												<select id="TAX_SET" name="TAX_SET" class="input_form1" style="width: 100px">
												${taxation_section}
												</select>
											</td>
											<td align="center" bgcolor="e5eff8" class="sub_table_b">부과여부</td>
											<td bgcolor="eaeaea" class="table_bl_left">
											<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
												<tr>
													<td>
														<select id="TAX_YN" name="TAX_YN" class="input_form1" style="width: 100px">
															${taxation_yn}
														</select>
													</td>
												</tr>
											</table>
											</td>
										</tr>
	
										<tr>
											<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">시설물명</td>
											<td bgcolor="eaeaea" class="table_bl_left" colspan="1">
												<select id="FT_TYP" name="FT_TYP" style="width: 200px" class="input_form1">
													<option value="">::선택::</option>
													<option value="011">가로판매대</option>
													<option value="012">구두수선대</option>
												</select>
											</td>
											<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">산출목적</td>
											<td bgcolor="eaeaea" class="table_bl_left" colspan="1">
												<select id="CAL_MODE" name="CAL_MODE" style="width: 200px" class="input_form1">
													<option value="">::선택::</option>
													<option value="1">점용료</option>
													<option value="4">대부료</option>
												</select>
											</td>
											
										</tr>
	
										<tr>
											<td height="26px" align="center" bgcolor="e5eff8" class="sub_table_b">시군구</td>
											<td bgcolor="eaeaea" class="table_bl_left">
												<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
													<tr>
														<td>
															<select id="GU_CD" name="GU_CD" class="input_form1" style="width:130px">${gu_code}
															</select>
														</td>
													</tr>
												</table>
											</td>
											<td align="center" bgcolor="e5eff8" class="sub_table_b">법정동</td>
											<td bgcolor="eaeaea" class="table_bl_left">
											<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
												<tr>
													<td>
														<select id="BJ_CD" name="BJ_CD" class="input_form1" style="width: 100px">
															${bjdong_code}
														</select>
													</td>
													<td>&nbsp;
														<select id="HJ_CD" name="HJ_CD" class="input_form1" style="width: 100px">
															${hjdong_code}
														</select>
													</td>
												</tr>
											</table>
											</td>

										</tr>
	
										<tr>
											<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">점용지번지</td>
											<td bgcolor="eaeaea" class="table_bl_left">
											<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
												<tr>
													<td>
														<input id="BONBUN" name="BONBUN" type="text" class="input_form1" style="width: 40px" value="${BONBUN}">
														- <input id="BUBUN" name="BUBUN" type="text" class="input_form1" style="width: 40px" value="${BUBUN}">
													</td>
												</tr>
											</table>
											</td>
											
											<td align="center" bgcolor="e5eff8" class="sub_table_b">점용인/법인명</td>
											<td bgcolor="eaeaea" class="table_bl_left">
											<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
												<tr>
													<td>
														<input id="NAME" name="NAME" type="text" class="input_form1" style="width: 100px" onKeyDown="javascript:checkKeySearch();" value="${NAME}">
													</td>
												</tr>
											</table>
											</td>
										</tr>
										<!--  //********** BEGIN_KANG_20120404 -->
										<!-- 
										<tr>
											<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">관리번호</td>
											<td bgcolor="eaeaea" class="table_bl_left" colspan="3">
												<input id="ADMINNO"  name="ADMINNO" type="text" class="input_form1" style="width: 120px" onKeyDown="javascript:checkKeySearch();" value="${ADMINNO}">
											</td>
										</tr>
										-->
										<tr>
											<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">관리번호</td>
											<td bgcolor="eaeaea" class="table_bl_left">
												<input id="ADMINNO"  name="ADMINNO" type="text" class="input_form1" style="width: 120px" onKeyDown="javascript:checkKeySearch();" value="${ADMINNO}">
											</td>
											<td align="center" bgcolor="e5eff8" class="sub_table_b">수납여부</td>											
											<td bgcolor="eaeaea" class="table_bl_left">
											<select id="SUNAP_YN" name="SUNAP_YN" class="input_form1" style="width:100px">
						  						${sunap_part}
					  						</select>
											</td>
										</tr>
										
										<!--   //********** END_KANG_20120404 -->
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
									<td height="34" class="sub_stan">전체건수 : <span
										class="sub_stan_blue">${totalcnt}</span> 건</td>
								</tr>
								<tr>
									<td>
									<table width="780px" cellpadding="0" cellspacing="0" border="0" class="sub_table" bordercolor="#c9dfed" style="border-collapse:collapse;">
									  <TR>
									    <TD width="26px"  valign="top">
									      <TABLE cellpadding="0" cellspacing="0" border="1" class="sub_table" bordercolor="#c9dfed" style="border-collapse:collapse;">
									        <TR height="26">
									              <td width="35px" height="26px" align="center" bgcolor="e5eff8" class="sub_table_b">
													<INPUT TYPE="checkbox" ID="SELECT_ALL" onclick="javascript:selectAll(this);">
												  </td>
									        </TR>
									      </TABLE>
									    </TD>
									    <TD width="754px" valign="top">
									      <DIV id="topLine2" style="width:737px;overflow:hidden;">
									        <TABLE width="1440px" cellpadding="0" cellspacing="0" border="1" class="sub_table" bordercolor="#c9dfed" style="border-collapse:collapse;">
									          <TR height="26px">
												<td width="60px" align="center" bgcolor="e5eff8" class="sub_table_b" width="50">번호</td>
									            <td width="100px" align="center" bgcolor="e5eff8" class="sub_table_b">관리번호</td>
									            <td width="60px" align="center" bgcolor="e5eff8" class="sub_table_b">산출년도</td>
									            <td width="60px" align="center" bgcolor="e5eff8" class="sub_table_b">과세번호</td>
									            <td width="80px" align="center" bgcolor="e5eff8" class="sub_table_b">운영인</td>
									            <td width="150px" align="center" bgcolor="e5eff8" class="sub_table_b">점용지주소</td>
									            <!-- 
									            <td width="150px" align="center" bgcolor="e5eff8" class="sub_table_b">점용지새주소</td>
									             -->
									            <td width="60px" align="center" bgcolor="e5eff8" class="sub_table_b">세입구분</td>
									            <td width="80px" align="center" bgcolor="e5eff8" class="sub_table_b">시설물명</td>
									            <td width="60px" align="center" bgcolor="e5eff8" class="sub_table_b">부과목적</td>
									            <td width="70px" align="center" bgcolor="e5eff8" class="sub_table_b">면적(㎡)</td>
									            <td width="100px" align="center" bgcolor="e5eff8" class="sub_table_b">작년도<br/>부과금액</td>
									            <td width="100px" align="center" bgcolor="e5eff8" class="sub_table_b">현년도<br/>부과금액</td>
									            <td width="100px" align="center" bgcolor="e5eff8" class="sub_table_b">갱신일자</td>                                                
									            <td width="150px" align="center" bgcolor="e5eff8" class="sub_table_b">산출일자</td>                                                
									            <td width="60px" align="center" bgcolor="e5eff8" class="sub_table_b">부과여부</td>
									            <!--  //********** BEGIN_KANG_20120404 -->
									            <td width="60px" align="center" bgcolor="e5eff8" class="sub_table_b">수납여부</td>
												<td width="100px" align="center" bgcolor="e5eff8" class="sub_table_b">수납일</td>
												<!--   //********** END_KANG_20120404 -->
									          </TR>
									        </TABLE>
									      </DIV>
									    </TD>
									  </TR>
									  <TR>
									    <TD width="26px" valign="top">
									      <DIV id="leftDisplay2" style="width:26px;height:257px;overflow:hidden;">
									        <TABLE cellpadding="0" cellspacing="0" border="1" class="sub_table" bordercolor="#c9dfed" style="border-collapse:collapse;">
									  			<c:forEach items="${blist}" var="board" varStatus="idx">
													<tr height="26px" onMouseOver="this.style.backgroundColor='#f6f7f8'" onMouseOut="this.style.backgroundColor=''"	style="cursor: pointer">
														<td width="35px" height="26px" align="center" bgcolor="e5eff8" class="sub_table_b">
															<INPUT TYPE="checkbox" NAME="SELECT_ITEM">
															<INPUT TYPE="hidden" NAME="GAPAN_NO_ARR" value="${board.GAPAN_NO}"> 
															<INPUT TYPE="hidden" NAME="ITEM_CHECK" value="">
								  							<INPUT TYPE="hidden" NAME="SEQ_ARR" value="${board.SEQ}">
								  							<INPUT TYPE="hidden" NAME="TAX_YN_ARR" value="${board.TAX_YN}">
														</td>
													</tr>
												</c:forEach>
									        </TABLE>
									      </DIV>
									    </TD>
									    <TD width="754px" valign="top">
									      <DIV id="mainDisplay2" style="width:754px;height:274px;overflow:scroll;scrollbar-face-color:#EEF8FB;scrollbar-3dlight-color:#BBBDB6; scrollbar-highlight-color:#EEF8FB;scrollbar-shadow-color:#BBBDB6; scrollbar-darkshadow-color:#EEF8FB;scrollbar-track-color:#EEF8FB;scrollbar-arrow-color:#BBBDB6;" onscroll="scrollAll()">
									        <TABLE width="1440px" cellpadding="0" cellspacing="0" border="1" class="sub_table" bordercolor="#c9dfed" style="border-collapse:collapse;">
									          <c:forEach items="${blist}" var="board" varStatus="idx">
													<tr onClick="javascript:View('${board.GAPAN_NO}','${board.SEQ}')" onMouseOver="this.style.backgroundColor='#f6f7f8'" onMouseOut="this.style.backgroundColor=''" style="CURSOR: Hand;">
														<td width="60px" height="26" align="center">${board.RN}</td>
														<td width="100px" align="center">${board.GAPAN_NO}</td>
														<td width="60px" align="center">${board.SUM_YEAR}</td>
														<td width="60px" align="center">${board.TAX_NO}</td>
														<td width="80px" align="center">${board.NAME}</td>
														<td width="150px" align="center">${board.ADDR}</td>
														<!-- 
														<td width="150px" align="center">${board.SI}&nbsp;${board.GUN}&nbsp;${board.DORO_NM}&nbsp;${board.BD_BON}&nbsp;${board.BD_BU}&nbsp;${board.BD_NM}&nbsp;${board.BD_DET_NM}</td>
														 -->
														<td width="60px" align="center" >${board.TAX_SET}</td>
														<td width="80px" align="center">${board.FT_TYP}</td>
														<td width="60px" align="center">${board.CAL_NAME}</td>
														<td width="70px" align="center">${board.AREA_SIZE}</td>
														<td width="100px" align="center">${rnic:insertComma2(board.SUM_LASTYEAR)}</td>
														<td width="100px" align="center">${rnic:insertComma2(board.SUM)}</td>
														<td width="100px" align="center">${board.REQ_DATE}</td>
														<td width="150px" align="center">${board.SANCHULGIGAN}</td>
														<td width="60px" class="sub_table_r" align="center">${board.TAX_YN}</td> 
														<!--  //********** BEGIN_KANG_20120404 -->
														<td width="60px" class="sub_table_r" align="center">${board.SUNAP_YN}</td>
														<td width="100px" align="center">${board.SUNAP_DATE}</td>
														<!--   //********** END_KANG_20120404 -->                                                                               
													</tr>
												</c:forEach>	
									        </TABLE>
									      </DIV>
									    </TD>
									  </TR>
									</table>
									</td>
								</tr>
							</table>
							</td>
						</tr>
						<tr>
							<td height="40" align="right">
								<!--  //********** BEGIN_현진_20120228 -->
								<img src="/img/bugwa_cancel_icon.gif" alt="부과철회" border="0" onclick="javascript:bugwa_cancel();" style="cursor:pointer;">
								<!--   //********** END_현진_20120228 -->
								<img src="../../../img/levy_icon3.gif" id="Bugwa_Ilgwal" name="Bugwa_Ilgwal" alt="일괄부과 처리" border="0" onclick="javascript:SaeweSuipBugwa_Ilgwal()" style="cursor:pointer;">
								<img src="../../../img/excel_icon.gif" alt="EXCEL 변환" border="0" onclick="javascript:excel_Search();" style="cursor:pointer;">
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
</html>