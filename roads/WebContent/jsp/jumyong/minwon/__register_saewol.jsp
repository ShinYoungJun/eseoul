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

	// getElementsByClassName
	function getElementsByClassName(clsName,parentNode) {
		var arr = new Array();
		var elems;
		
		if (parentNode == null) {
			elems = document.getElementsByTagName("*");
		} else {
			elems = parentNode.getElementsByTagName("*");
		}
		for ( var cls, i = 0; ( elem = elems[i] ); i++ ) {
			if ( elem.className == clsName ) {
				arr[arr.length] = elem;
			}
		}
		return arr;
	}
	function tabDisplay(tab,content,num,type) {
		for (var i=0; i<content.length; i++) {
			var tab_off = tab[i].childNodes[0].getAttribute('src').replace(/_on|_off|_chk/i,'_off');
			var tab_on = tab[num].getElementsByTagName('img')[0].getAttribute('src').replace(/_on|_off|_chk/i,'_off');
			var tab_chk = tab[num].getElementsByTagName('img')[0].getAttribute('src').replace(/_on|_off|_chk/i,'_on');
			tab[i].getElementsByTagName('img')[0].setAttribute('src',tab_off);
			tab[num].getElementsByTagName('img')[0].setAttribute('src',tab_chk);
			content[i].style.display = 'none';
			content[num].style.display = 'block';
		}
	}
	function tabAct(tab,content,num,type) {
		tab[num].onclick = function() {
			tabDisplay(tab,content,num);
			return false;
		}
		if (type == true) {
			var tabimg = tab[num].getElementsByTagName('img')[0];
			var tab_off = tabimg.getAttribute('src').replace(/_on|_off|_chk/i,'_on');
			var tab_on = tabimg.getAttribute('src').replace(/_on|_off|_chk/i,'_off');
			tab[num].onmouseover = function() {
				if (tabimg.getAttribute('src').indexOf('_on') == -1) {
					tabimg.setAttribute('src',tab_on);
				}
			}
			tab[num].onmouseout = function() {
				if (tabimg.getAttribute('src').indexOf('_on') != -1) {
					tabimg.setAttribute('src',tab_off);
				}
			}
		}
	}
	window.onload = tabMenu;
	function tabMenu() {
		var tabs = document.getElementById('tabmenu');
		var tab = tabs.getElementsByTagName('a'); // 탭 요소
		var contents = document.getElementById('tabcontents');
		var content = getElementsByClassName('tabcontent',contents); // 컨텐츠 요소 class
		var type = true; // 롤오버의 true / false
		for (var i=0; i<tab.length; i++) {
			tabDisplay(tab,content,0,true);
			tabAct(tab,content,i,type);
		}
	}

	function	RegisterPrc()
	{
		var form = document.form;

		form.action = "registerprc_saewol.do";
		form.submit();
	}

	function	RegisterPrcAll()
	{
		var	result	= DataCheck();

		if(result	==	false)
			return;
		
		var form = document.form;

	//	var	obj	= document.getElementById("SAN_CK");
	//	if(obj.checked	== true)	//	산 체크
	//		document.getElementById("SAN_CK").value='1';
	//	else
	//		document.getElementById("SAN_CK").value='0';

		form.PURPOSE_CD.value	= IFRM_PurposeCode.document.getElementById("PURPOSE_CD").value;

		form.action = "registerprc_saewol.do";
		form.submit();
	}

	function	Search()
	{
		var form = document.form;

		form.action = "search.do";
		form.submit();
	}
	

	function	Select_UseSection(sel)
	{
		if(sel.value == '1')
			document.getElementById("UseSection").style.display = "block";
		else
			document.getElementById("UseSection").style.display = "none";
	}

	function	Jumin_toaddr_Check()
	{
		var form 	= document.form;
		var	chk		= form.checkbox.checked;

		if(chk	== true)
		{
			form.TOPOST_NM.value	= form.NAME.value;
			form.TOPOST.value		= form.POST.value;
			form.TOADDR1.value		= form.ADDR1.value;
			form.TOADDR2.value		= form.ADDR2.value;
			form.TOEMAIL.value		= form.EMAIL.value;

			form.TOTEL.value	= form.TEL.value;
			form.TOHP.value		= form.HP.value;
		}

	//	form.checkbox.checked	= false;
	}
	
		function	Select_UseType(sel)
	{
//		var idx = sel.selectedIndex;
			
		document.getElementById("UseType1").style.display = "none";
		document.getElementById("UseType2").style.display = "none";
		
		if(sel.value == '2' || sel.value == '3')	
		{
			document.getElementById("USERTYPENAME").value		= "하천/구거명";
			document.getElementById("UseType2").style.display 	= "block";	//	하천, 구거
		}
		else if(sel.value == '1')
		{	
			document.getElementById("USERTYPENAME").value		= "주차면수";
			document.getElementById("UseType1").style.display 	= "block";	//	도로
		}
		else
			document.getElementById("USERTYPENAME").value		= "";
		
	//	else if(sel.value == '4')						//	노점
	//		document.getElementById("UseType1").style.display = "block";

		document.getElementById("IFRM_PurposeCode").src="/jsp/common/purposeCode/purposeCode.jsp?SectionCode=" + sel.value + "&essential=1";
	}	

	function	Select_UseSection(sel)
	{
		if(sel.value == '1')
			document.getElementById("UseSection").style.display = "block";	//	정기
		else
			document.getElementById("UseSection").style.display = "none";
	}

	function 	openZipcodePopup(post, addr)
	{
		var	post1	= post;
		var	addr1	= addr;

		var url 	= "/zipcode.do?openerPost=" + post1 + "&openerAddr=" + addr1;
		var winName = "우편번호입력";
		var width 	= 420;
		var height 	= 305;
		var scroll 	= "yes";
		var resize 	= "no";

		var	option	= "scrollbars=" + scroll + ", ";
		option	+= "resize=" + resize + ", ";
		option	+= "width=" + width + ", ";
		option	+= "height=" + height;

		window.open(url, winName, option);
	}

	function	DataCheck()
	{
		var form 	= document.form;
		var	str		= "";
		
		//	점용인 정보
		if(form.NAME.value.length	< 1)
			str	+= "점용인/법인명을 입력하세요\n";	
		else if(form.jumin_ssn1.value.length	< 6	||	form.jumin_ssn2.value.length	< 7)
			str	+= "주민/법인번호를  입력하세요\n";	
		else if(form.POST.value.length	< 1)
			str	+= "우편번호를 입력하세요\n";
		else if(form.ADDR2.value.length	< 1)
			str	+= "주소를 입력하세요\n";	

		//	점용지 정보
		else if(form.TYPE.value.length	< 1)
			str	+= "점용 종류를 입력하세요\n";
		else if(form.SECTION.value.length	< 1)
			str	+= "점용 구분을 입력하세요\n";
		else if(form.OWNER_SET.value.length	< 1)
			str	+= "소유자 구분을 입력하세요\n";
		else if(form.TAX_SET.value.length	< 1)
			str	+= "세입 구분을 입력하세요\n";
		else if(form.BJ_CD.value.length	< 1)
			str	+= "점용지 법정동을 입력하세요.\n";
		else if(form.HJ_CD.value.length	< 1)
			str	+= "점용지 행정동을 입력하세요\n";
		else if(form.SAN_CK.value.length	< 1)
			str	+= "점용지 번지선택을 입력하세요\n";
		else if(form.BONBUN.value.length	< 1)
			str	+= "점용지 본번을 입력하세요\n";
		else if(form.MUL_POST.value.length	< 1)
			str	+= "우편번호를 입력하세요\n";
		else if(IFRM_PurposeCode.PURPOSE_CD.value < 110)
			str	+= "점용목적을 입력하세요\n";
		else if(form.MUL_FROMDATE.value.length	< 1	||	form.MUL_TODATE.value.length	< 1)
			str	+= "점용기간을 입력하세요\n";
		else if(form.SECTION.value	== 1)
		{
			if(form.PARTLY_PERIOD.value.length	< 1	||	form.TOTAL_PERIOD.value.length	< 1)
				str	+= "점용기간 일시점용을 입력하세요\n";
		}

		if(str	== "")
		{
			return	true;
		}
		
		alert(str);

		return	false;		
	}

	function	Init()
	{
	//	IFRM_PurposeCode.PURPOSE_CD.className	= "essential";
	}
	
//]]>
</script>

<body>
<table width="800" border="0" cellpadding="0" cellspacing="0">
<form name="form" method="post">
<input type="hidden" name="UserType">
<input type="hidden" name="UserSection">
<input type="hidden" name="PURPOSE_CD" value="${PURPOSE_CD}">

<input type="hidden" name="MIN_CHECK" value="${MIN_CHECK}">
<input type="hidden" name="MIN_PROCESS" value="${MIN_PROCESS}">
<input type="hidden" name="GIGAN1" value="${GIGAN1}">
<input type="hidden" name="GIGAN2" value="${GIGAN2}">
<input type="hidden" name="MIN_NAME" value="${MIN_NAME}">
<input type="hidden" name="MIN_REQNO" value="${MIN_REQNO}">

  <tr>
    <td height="43"><img src="/img/sub1_cont1_title.gif" width="800" height="43"></td>
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
                  <td><img src="/img/sub_petition_title2.gif" width="110" height="22"></td>
                </tr>
            </table></td>
          </tr>
          <tr>
            <td class="contborder_blue"><table width="100%" border="0" cellspacing="0" cellpadding="0">
                <tr>
                  <td><table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
				  
				  <tr>
					<td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">접수번호</td>
					<td width="37%" bgcolor="eaeaea" class="table_bl_left"><input name="REQ_NO" type="text" class="readonly" style="width:120px" value="${REQ_NO}" readonly></td>
					<td width="100" align="center" bgcolor="e5eff8" class="sub_table_b">민원구분</td>
					<td bgcolor="eaeaea" class="table_bl_left"><input name="GUBUN" type="text" class="input_form1" style="width:120px" value="${GUBUN}"></td>
				  </tr>
				  
				  <tr>
					<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">접수일자</td>
					<td bgcolor="eaeaea" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
					  <tr>
						<td><input name="REQ_DATE" type="text" class="input_form1" style="width:65px" value="${REQ_DATE}" readonly></td>
						<td><a><img src="/img/calendar_icon.gif" width="19" height="16" border="0" onclick="popUpCalendar(this, REQ_DATE, 'yyyymmdd')" style="CURSOR: Hand;"></a></td>
						</tr>
					</table></td>
					<td align="center" bgcolor="e5eff8" class="sub_table_b">처리예정일자</td>
					<td bgcolor="eaeaea" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
					  <tr>
						<td><input name="PREDATE" type="text" class="input_form1" style="width:65px" value="${PREDATE}" readonly></td>
						<td><a><img src="/img/calendar_icon.gif" width="19" height="16" border="0" onclick="popUpCalendar(this, PREDATE, 'yyyymmdd')" style="CURSOR: Hand;"></a></td>
					  </tr>
					</table></td>
				  </tr>
				  <tr>
					<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">접수부서</td>
					<td bgcolor="eaeaea" class="table_bl_left"><input name="REQ_DEP" type="text" class="input_form1" style="width:120px"  value="${REQ_DEP}" readonly></td>
					<td align="center" bgcolor="e5eff8" class="sub_table_b">담당부서</td>
					<td bgcolor="eaeaea" class="table_bl_left"><input name="MANAGE_DEP" type="text" class="input_form1" style="width:120px" value="${MANAGE_DEP}"></td>
				  </tr>
				  <tr>
					<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">접수자명</td>
					<td bgcolor="eaeaea" class="table_bl_left"><input name="REQ_NM" type="text" class="input_form1" style="width:120px" value="${REQ_NM}"></td>
					<td align="center" bgcolor="e5eff8" class="sub_table_b">담당자명</td>
					<td bgcolor="eaeaea" class="table_bl_left"><input name="MANAGER" type="text" class="input_form1" style="width:120px" value="${MANAGER}"></td>
				  </tr>
				  <tr>
					<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">민원요지</td>
					<td colspan="3" bgcolor="eaeaea" class="table_bl_left"><input name="NOTES" type="text" class="input_form1" style="width:98%" value="${NOTES}"></td>
				  </tr>
				  <tr>
					<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">신청인</td>
					<td bgcolor="eaeaea" class="table_bl_left"><input name="AGENT_NM" type="text" class="input_form1" style="width:250px" value="${AGENT_NM}"></td>
					<td align="center" bgcolor="e5eff8" class="sub_table_b">신청인 연락처</td>
					<td bgcolor="eaeaea" class="table_bl_left"><input name="AGENT_TEL" type="text" class="input_form1" style="width:120px" value="${AGENT_TEL}" style="ime-mode:disabled" onKeyDown="nr_tel_num(this);" onKeyUp="nr_tel_num(this);" onKeyPress="nr_tel_num(this);"></td>
				  </tr>
				  
                  </table></td>
                </tr>
   
            </table></td>
          </tr>
          
        </table></td>
      </tr>
      
      <tr>
        <td height="30"></td>
      </tr>
 
      <tr>
        <td align="left"><table width="780" border="0" cellspacing="0" cellpadding="0">
          <tr>
            <td height="22" background="/img/tab_line_purple.gif"><table border="0" cellspacing="0" cellpadding="0">
                <tr>
                <ul id="tabmenu">
                  <td width="111"><a href="tab1"><img src="/img/sub_petition_title2_on.gif" alt="점용인 정보" width="110" height="22" border="0"></a></td>
                  <td><a href="tab2"><img src="/img/sub_petition_title3_off.gif" alt="점용지 정보" width="110" height="22" border="0" onclick=""></a></td>
				</ul>
                </tr>
            </table></td>
		</tr>
          
		<tr>
            <td align="left" class="contborder_purple">

		<div id="tabcontents">
			<div class="tabcontent">
				<table width="100%" border="0" cellspacing="0" cellpadding="0">
                <tr>
                  <td><table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
				  <tr>
					<td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">점용인/법인명</td>
					<td width="37%" bgcolor="eaeaea" class="table_bl_left"><input name="NAME" type="text" class="essential" style="width:250px" value="${NAME}"></td>
					<td width="100" align="center" bgcolor="e5eff8" class="sub_table_b">주민/법인번호</td>
					<td bgcolor="eaeaea" class="table_bl_left"><input name="jumin_ssn1" type="text" class="essential" style="width:40px; ime-mode:disabled" value="${jumin_ssn1}" onKeyPress="nr_num_int(this);" onKeyUp="count_check(this, jumin_ssn2, 6);" maxlength="6">
					  - <input name="jumin_ssn2" type="text" class="essential" style="width:45px; ime-mode:disabled" value="${jumin_ssn2}" onKeyPress="nr_num_int(this);" maxlength="7"></td>
				  </tr>
				  <tr>
					<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">사업자등록번호</td>
					<td bgcolor="eaeaea" class="table_bl_left"><input name="jumin_bizssn1" type="text" class="input_form1" value="${jumin_bizssn1}" style="width:20px; ime-mode:disabled" onKeyPress="nr_num_int(this);" onKeyUp="count_check(this, jumin_bizssn2, 3);" maxlength="3">
					  - <input name="jumin_bizssn2" type="text" class="input_form1" value="${jumin_bizssn2}" style="width:15px; ime-mode:disabled" onKeyPress="nr_num_int(this);" onKeyUp="count_check(this, jumin_bizssn3, 2);" maxlength="2">
					  - <input name="jumin_bizssn3" type="text" class="input_form1" value="${jumin_bizssn3}" style="width:35px; ime-mode:disabled" onKeyPress="nr_num_int(this);" maxlength="5">
					<td align="center" bgcolor="e5eff8" class="sub_table_b">업태/업종</td>
					<td bgcolor="eaeaea" class="table_bl_left"><input name="BIZ_STATUS" type="text" class="input_form1" style="width:60px" value="${BIZ_STATUS}">
					  / <input name="BIZ_TYPES" type="text" class="input_form1" style="width:160px" value="${BIZ_TYPES}"></td>
				  </tr>
				  <tr>
					<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">우편번호</td>
					<td bgcolor="eaeaea" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
						<tr>
						  <td><input name="POST" type="text" class="essential" style="width:50px" onFocus="Jumin_toaddr_Check();" value="${POST}" readonly></td>
						  <td><a href="javascript:openZipcodePopup('form.POST', 'form.ADDR1');"><img src="/img/search_icon.gif" alt="검색" width="56" height="18" border="0"></a></td>
						</tr>
					</table></td>
					<td align="center" bgcolor="e5eff8" class="sub_table_b">주소</td>
					<td bgcolor="eaeaea" class="table_bl_left"><input name="ADDR1" type="text" class="essential" style="width:250px" onFocus="Jumin_toaddr_Check();" value="${ADDR1}" readonly>
						<input name="ADDR2" type="text" class="essential" style="width:250px" onKeyUp="Jumin_toaddr_Check();" value="${ADDR2}"></td>
				  </tr>
				  <tr>
					<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">e-mail</td>
					<td bgcolor="eaeaea" class="table_bl_left"><input name="EMAIL" type="text" class="input_form1" style="width:250px" value="${EMAIL}" style="ime-mode:disabled" onKeyUp="Jumin_toaddr_Check();"></td>
					<td align="center" bgcolor="e5eff8" class="sub_table_b">도로명 주소 </td>
					<td bgcolor="eaeaea" class="table_bl_left"><input name="textfield2222723" type="text" class="input_form1" style="width:100px">
						<input name="textfield22227222" type="text" class="input_form1" style="width:40px" style="ime-mode:disabled" onKeyDown="nr_num_int(this);" onKeyUp="nr_num_int(this);" onKeyPress="nr_num_int(this);">
					  - <input name="textfield222272222" type="text" class="input_form1" style="width:40px" style="ime-mode:disabled" onKeyDown="nr_num_int(this);" onKeyUp="nr_num_int(this);" onKeyPress="nr_num_int(this);"></td>
				  </tr>
				  <tr>
					<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">전화번호</td>
					<td bgcolor="eaeaea" class="table_bl_left"><input name="TEL" type="text" class="input_form1" style="width:120px" value="${TEL}" style="ime-mode:disabled" onKeyUp="nr_tel_num(this); Jumin_toaddr_Check();"></td>
					<td align="center" bgcolor="e5eff8" class="sub_table_b">휴대전화</td>
					<td bgcolor="eaeaea" class="table_bl_left"><input name="HP" type="text" class="input_form1" style="width:120px" value="${HP}" style="ime-mode:disabled" onKeyUp="nr_tel_num(this); Jumin_toaddr_Check();"></td>
				  </tr>
				  <tr>
					<td height="34" colspan="4" align="left" bgcolor="#FFFFFF" class=""><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
						<tr>
						  <td><span class="sub_stan_blue">* 우편물 송달지</span> : </td>
						  <td width="16"><input name="checkbox" type="checkbox" value="false" onclick="javascript:Jumin_toaddr_Check()"></td>
						  <td width="110">점용인 정보와 동일 </td>
						</tr>
					</table></td>
				  </tr>
				  <tr>
					<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">우편물 수령인 </td>
					<td colspan="3" bgcolor="eaeaea" class="table_bl_left"><input name="TOPOST_NM" type="text" class="input_form1" style="width:250px" value="${TOPOST_NM}"></td>
				  </tr>
				  <tr>
					<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">우편번호</td>
					<td bgcolor="eaeaea" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
						<tr>
						  <td><input name="TOPOST" type="text" class="input_form1" style="width:50px" value="${TOPOST}" readonly></td>
						  <td><a href="javascript:openZipcodePopup('form.TOPOST', 'form.TOADDR1');"><img src="/img/search_icon.gif" alt="검색" width="56" height="18" border="0"></a></td>
						</tr>
					</table></td>
					<td align="center" bgcolor="e5eff8" class="sub_table_b">송달지 주소</td>
					<td bgcolor="eaeaea" class="table_bl_left"><input name="TOADDR1" type="text" class="input_form1" style="width:250px" value="${TOADDR1}" readonly>
						<input name="TOADDR2" type="text" class="input_form1" style="width:250px" value="${TOADDR2}"></td>
				  </tr>
				  <tr>
					<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">e-mail</td>
					<td bgcolor="eaeaea" class="table_bl_left"><input name="TOEMAIL" type="text" class="input_form1" style="width:250px" value="${TOEMAIL}" style="ime-mode:disabled"></td>
					<td align="center" bgcolor="e5eff8" class="sub_table_b">도로명 주소 </td>
					<td bgcolor="eaeaea" class="table_bl_left"><input name="textfield22227232" type="text" class="input_form1" style="width:100px" value="">
						<input name="textfield222272224" type="text" class="input_form1" style="width:40px" value="" style="ime-mode:disabled" onKeyDown="nr_num_int(this);" onKeyUp="nr_num_int(this);" onKeyPress="nr_num_int(this);">
					   - <input name="textfield2222722223" type="text" class="input_form1" style="width:40px" value="" style="ime-mode:disabled" onKeyDown="nr_num_int(this);" onKeyUp="nr_num_int(this);" onKeyPress="nr_num_int(this);"></td>
				  </tr>
				  <tr>
					<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">전화번호</td>
					<td bgcolor="eaeaea" class="table_bl_left"><input name="TOTEL" type="text" class="input_form1" style="width:120px" value="${TOTEL}" style="ime-mode:disabled" onKeyDown="nr_tel_num(this);" onKeyUp="nr_tel_num(this);" onKeyPress="nr_tel_num(this);">
						</td>
					<td align="center" bgcolor="e5eff8" class="sub_table_b">휴대전화</td>
					<td bgcolor="eaeaea" class="table_bl_left"><input name="TOHP" type="text" class="input_form1" style="width:120px" value="${TOHP}" style="ime-mode:disabled" onKeyDown="nr_tel_num(this);" onKeyUp="nr_tel_num(this);" onKeyPress="nr_tel_num(this);">
						</td>
				  </tr>
                  </table></td>
                </tr>
<!--
                <tr>
                  <td height="40" align="right"><a href="#"><img src="../../../img/mod_icon.gif" alt="수정" width="56" height="18" border="0"></a></td>
                </tr>
-->
            </table>
			</div>
			
			<div class="tabcontent" style="display:none">

            <table width="100%" border="0" cellspacing="0" cellpadding="0">
              <tr>
                <td><table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0" class="sub_table">

				<tr>
				  <td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">점용종류</td>
				  <td width="37%" bgcolor="eaeaea" class="table_bl_left"><select name="TYPE" class="essential" style="width:70px" OnChange="Select_UseType(this);">
					${use_type}
			      </select></td>
				  <td width="100" align="center" bgcolor="e5eff8" class="sub_table_b">점용구분</td>
				  <td width="36%" bgcolor="eaeaea" class="table_bl_left"><select name="SECTION" class="essential" style="width:70px" OnChange="Select_UseSection(this);">
					${occupancy_type}
				  </select></td>
				</tr>
				<tr>
				  <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">소유자</td>
				  <td bgcolor="eaeaea" class="table_bl_left"><select name="OWNER_SET" class="essential" style="width:70px">
					${use_owner_Group}
				  </select></td>
				  <td align="center" bgcolor="e5eff8" class="sub_table_b">세입구분</td>
				  <td bgcolor="eaeaea" class="table_bl_left"><select name="TAX_SET" class="essential" style="width:70px">
					${taxation_section}
				  </select></td>
				</tr>
				
				<tr>
				  <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">점용지 지번 </td>
				  <td colspan="3" bgcolor="eaeaea" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
					<tr>
					  <td>${SIGUNGU}&nbsp;&nbsp;</td>
                         <td width="72"><select name="BJ_CD" class="essential" style="width:100px">
                           ${bjdong_code}
                         </select></td>  
                         <td>&nbsp;<select name="HJ_CD" class="essential" style="width:100px">
                           ${hjdong_code}
                         </select></td>
                         <td>&nbsp;/&nbsp;<select name="SAN_CK" class="essential" style="width:75px">
                           ${mul_spc_cd}
                         </select></td>
					  <td>&nbsp;<input name="BONBUN" value="${BONBUN}" type="text" class="essential" style="width:40px" style="ime-mode:disabled" onKeyDown="nr_num_int(this);" onKeyUp="nr_num_int(this);" onKeyPress="nr_num_int(this);" maxlength="4">
						- <input name="BUBUN" value="${BUBUN}" type="text" class="input_form1" style="width:40px" style="ime-mode:disabled" onKeyDown="nr_num_int(this);" onKeyUp="nr_num_int(this);" onKeyPress="nr_num_int(this);" maxlength="4">
						번지 <input name="TONG" value="${TONG}" type="text" class="input_form1" style="width:30px" style="ime-mode:disabled" onKeyDown="nr_num_int(this);" onKeyUp="nr_num_int(this);" onKeyPress="nr_num_int(this);" maxlength="2">
						통 <input name="BAN" value="${BAN}" type="text" class="input_form1" style="width:30px" style="ime-mode:disabled" onKeyDown="nr_num_int(this);" onKeyUp="nr_num_int(this);" onKeyPress="nr_num_int(this);" maxlength="2"> 
						반 </td>
					  </tr>
				  </table></td>
				</tr>
				
				<tr>
				  <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">우편번호</td>
				  <td bgcolor="eaeaea" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
					<tr>
					  <td><input name="MUL_POST" type="text" class="essential" style="width:50px" value="${MUL_POST}" readonly></td>
					  <td><a href="javascript:openZipcodePopup('form.MUL_POST', '');"><img src="/img/search_icon.gif" alt="검색" width="56" height="18" border="0"></a></td>
					</tr>
				  </table></td>
				  <td align="center" bgcolor="e5eff8" class="sub_table_b">건물(명) 정보 </td>
				  <td bgcolor="eaeaea" class="table_bl_left"><input name="BD_NM" type="text" class="input_form1" style="width:120px" value="${BD_NM}">
					<input name="BD_DONG" type="text" class="input_form1" style="width:30px" value="${BD_DONG}" style="ime-mode:disabled" onKeyDown="nr_num_int(this);" onKeyUp="nr_num_int(this);" onKeyPress="nr_num_int(this);">
					동 <input name="BD_HO" type="text" class="input_form1" style="width:30px" value="${BD_HO}" style="ime-mode:disabled" onKeyDown="nr_num_int(this);" onKeyUp="nr_num_int(this);" onKeyPress="nr_num_int(this);">
					호 </td>
				</tr>
				
                <tr>
                  <td align="center" bgcolor="e5eff8" class="sub_table_b">도로명 주소</td>
                  <td bgcolor="eaeaea" class="table_bl_left"><input name="ROAD_ADD" type="text" class="input_form1" style="width:140px" value="${ROAD_ADD}" maxlength="12"></td>
       			  
				  <td width="100" height="26" align="center" bgcolor="e5eff8" class="">
				  	<input name="USERTYPENAME" type="text" style="width:95px" class="viewcol" value="주차면수">
				  </td>
				  	                      			  
       			  <td colspan="0" bgcolor="F6F6F6" class="table_bl_left">
	       			  <span id="UseType1" style="display:none">
		                  <table width="100%" border="0">
		                  	<input name="PARKING_NUM" type="text" class="input_form1" style="width:40px" value="${PARKING_NUM}" style="ime-mode:disabled" onKeyDown="nr_num_int(this);" onKeyUp="nr_num_int(this);" onKeyPress="nr_num_int(this);"> 면
		                  </table>
	                  </span> 
	       			  <span id="UseType2" style="display:none">
		                  <table width="100%" border="0" cellpadding="0" cellspacing="0" class="sub_stan"> 
		                  	<input name="RIVER_NM" type="text" class="input_form1" style="width:100px" value="${RIVER_NM}">
		                  </table>
	                  </span>   
                  </td>
                </tr>
                
				<tr>
				  <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">점용목적</td>
				  <td colspan="3" bgcolor="eaeaea" ><table width="100%" border="0" cellpadding="0" cellspacing="0">
					<iframe id="IFRM_PurposeCode" scrolling="no" frameborder="0" framespacing="0" width="100%" height="26" src="/jsp/common/purposeCode/purposeCode.jsp?SectionCode=${TYPE}&PURPOSE_CD=${PURPOSE_CD}&essential=1"></iframe>
				  </table></td>
			    </tr>			    
			    
				<tr>
				  <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">점용기간</td>
				  <td colspan="3" bgcolor="eaeaea" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
					<tr>
					<td>
					  <input name="MUL_FROMDATE" type="text" class="essential" style="width:70px" value="${MUL_FROMDATE}" readonly><a><img src="/img/calendar_icon.gif" width="19" height="16" border="0" align="absmiddle" onclick="popUpCalendar(this, MUL_FROMDATE, 'yyyymmdd')" style="CURSOR: Hand;"></a>
					   ~ <input name="MUL_TODATE" type="text" class="essential" style="width:70px" value="${MUL_TODATE}" readonly><a><img src="/img/calendar_icon.gif" width="19" height="16" border="0" align="absmiddle" onclick="popUpCalendar(this, MUL_TODATE, 'yyyymmdd')" style="CURSOR: Hand;"></a></tr>
					</td>
					
	                <tr style="display:none" id="UseSection">
					  <td>일시점용<input name="PARTLY_PERIOD" type="text" class="essential" style="width:300px" value="${PARTLY_PERIOD}">
					  &nbsp;&nbsp;총<input name="TOTAL_PERIOD" type="text" class="essential" style="width:30px" value="${TOTAL_PERIOD}" style="ime-mode:disabled" onKeyDown="nr_num_int(this);" onKeyUp="nr_num_int(this);" onKeyPress="nr_num_int(this);">일</td>
					</tr>
				  </table></td>
				</tr>
		
			    <tr>
				  <td height="34" colspan="4" align="left" bgcolor="#FFFFFF" class=""><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
					<tr>
					  <td><span class="sub_stan_blue">* 인접지 정보</span></td>
					</tr>
				  </table></td>
			    </tr>
			    
			    <tr>
				  <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">우편번호</td>
				  <td colspan="3" bgcolor="eaeaea" class="table_bl_left">
				  <table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
					  <tr>
						<td><input name="WITH_POST" value="${WITH_POST}" type="text" class="input_form1" style="width:50px" readonly></td>
						<td><a href="javascript:openZipcodePopup('form.WITH_POST', 'form.WITH_ADDR1');"><img src="/img/search_icon.gif" alt="검색" width="56" height="18" border="0"></a></td>
					  </tr>
				  </table></td>
			    </tr>
			    
				<tr>
				  <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">주소</td>
				  <td colspan="3" bgcolor="eaeaea" class="table_bl_left"><table width="100%" border="0" cellpadding="0" cellspacing="0" class="sub_stan">
					 <input name="WITH_ADDR1" type="text" class="input_form1" style="width:200px" value="${WITH_ADDR1}" readonly>
					 <input name="WITH_ADDR2" type="text" class="input_form1" style="width:350px" value="${WITH_ADDR2}">
				  </table></td>
				</tr>
				
			    <tr>
				  <td height="34" colspan="4" align="left" bgcolor="#FFFFFF" class=""><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
					<tr>
					  <td><span class="sub_stan_blue">* 공사(굴착) 정보</span></td>
					</tr>
				  </table></td>
			    </tr>
			    
			    <tr>
				  <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">공사기간 </td>
				  <td colspan="3" bgcolor="eaeaea" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
					<tr>
					  <td><input name="WORK_FROMDATE" value="${WORK_FROMDATE}" type="text" class="input_form1" style="width:65px" readonly></td>
					  <td><a><img src="/img/calendar_icon.gif" width="19" height="16" border="0" onclick="popUpCalendar(this, WORK_FROMDATE, 'yyyymmdd')" style="CURSOR: Hand;"></a></td>
					  <td width="16" align="center">~</td>
					  <td><input name="WORK_TODATE" value="${WORK_TODATE}" type="text" class="input_form1" style="width:65px" readonly></td>
					  <td><a><img src="/img/calendar_icon.gif" width="19" height="16" border="0" onclick="popUpCalendar(this, WORK_TODATE, 'yyyymmdd')" style="CURSOR: Hand;"></a></td>
					</tr>
				  </table></td>
			    </tr>
			    
				<tr>
				  <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">공사내용</td>
					<td colspan="3" bgcolor="eaeaea" class="table_bl_left"><table width="100%" border="0" cellpadding="0" cellspacing="0" class="sub_stan">
						<input name="EXE_INFO" type="text" class="input_form1" style="width:98%" value="${EXE_INFO}">
					</table></td>
			    </tr>
                    
                </table></td>
              </tr>
<!--
              <tr>
                <td height="32" align="right"><a href="#"><img src="../../../img/save_icon2.gif" alt="저장" width="56" height="18" border="0"></a></td>
              </tr>
-->
            </table>
			</div>
		</div>
		
		</td>
		</tr>
 		
		<tr>
			<td height="40" align="right"><a href="javascript:RegisterPrcAll()"><img src="/img/save_icon.gif" alt="전체 저장" width="74" height="22" border="0"></a>
			<a href="javascript:Search();"><img src="/img/list_icon.gif" alt="리스트" width="66" height="22" border="0"></a></td>
		</tr>
	</table></td>
	</tr>

</table></td>
</body>
</html>