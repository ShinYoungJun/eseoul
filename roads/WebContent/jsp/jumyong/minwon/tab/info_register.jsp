<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
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

<script language="JavaScript" src="/js/PopupCalendar.js"></script>
<script language="JavaScript" src="/js/Check_inputbox.js"></script>
<script language="JavaScript" src="/js/Ajax_request.js"></script>
<script language="JavaScript" src="/js/common.js"></script>
<!--  //********** BEGIN_현진_20120215 -->
<script language="javascript" src="/js/zipcode.js"></script>
<!--   //********** END_현진_20120215 -->   

<script type="text/javascript"><!--

//2014.3.10 우편번호체크
function isPostNum(obj)
{
	if(!isNum(obj, "우편번호")) return;	//숫자여부체크
	if(form.MUL_POST.value.length < 6 && form.MUL_POST.value.length > 0){
		alert("우편번호는 6자리 입니다!");
	}
	return;
	
}

function	Jumin_toaddr_Check()
{
	var form 		=	document.form;
	var	chk			=	form.ADDR_CHECK.checked;
	
	if(chk	== true)
	{
		form.TONM.value			= form.NAME.value;
		form.TOPOST.value		= form.POST.value;
		
		form.TOADDR1.value		= form.ADDR1.value;
		form.TOSAN.checked		= form.SAN.checked;
		form.TOBON.value		= form.BON.value;
		form.TOBU.value			= form.BU.value;
		form.TOADDR2.value		= form.ADDR2.value;
		form.TOMAIL.value		= form.EMAIL.value;
 
		form.TOADDR1_NEW.value	= form.ADDR1_NEW.value; 
		//********** BEGIN_현진_20120215
		//form.TOBON_NEW.value	= form.BON_NEW.value;
		//form.TOBU_NEW.value		= form.BU_NEW.value;
		//form.TOADDR2_NEW.value	= form.ADDR2_NEW.value;
		
		form.TO_BD_BON.value	= form.BD_BON.value;
		form.TO_BD_BU.value		= form.BD_BU.value;
		form.TO_BD_DET_NM.value	= form.BD_DET_NM.value;
		form.TO_BD_NM.value		= form.BD_NM_NEW.value;
		form.TOSI.value			= form.SI.value;
		form.TOGUN.value		= form.GUN.value;
		form.TO_DORO_NM.value	= form.DORO_NM.value;
		form.TODONG.value		= form.DONG.value;

		form.TOADDR1_NEW.value       =      form.ADDR1_NEW.value;
		form.TO_BD_BON.value         =      form.BD_BON.value;
		form.TO_BD_BU.value          =      form.BD_BU.value;
		form.TO_BD_NM.value          =      form.BD_NM_NEW.value;
		form.TO_BD_DET_NM.value      =      form.BD_DET_NM.value;

		//********** END_현진_20120215		 
		
		form.jumin_totel1.value	= form.jumin_tel1.value;
		form.jumin_totel2.value	= form.jumin_tel2.value;
		form.jumin_totel3.value	= form.jumin_tel3.value;

		form.jumin_tohp1.value	= form.jumin_hp1.value;
		form.jumin_tohp2.value	= form.jumin_hp2.value;
		form.jumin_tohp3.value	= form.jumin_hp3.value;	
		
		form.ADDR_CHECK.value="1";		
	}
}


function changeWithGuCd(obj){
	var guCd = getSelectedValue(obj);
	var param = "guCd="+guCd;
    sendRequest("/get_bjdong_code.do", param, "GET", ResultChangeWithGuCd);
}

function	ResultChangeWithGuCd(obj)
{
	select_innerHTML(document.getElementById("WITH_BJ_CD"),obj);
}

/////////////////////////////////////////////////////////

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

		parent.iFrameResizeTab("tab1");	//	화면 RESIZE
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
	
	var	result	= DataCheck();

	if(result	==	false)
		return false;


	var form = document.form;		

	form.PURPOSE_CD.value	= IFRM_PurposeCode.document.getElementById("PURPOSE_CD").value;

	form.action = "info_registerprc.do";
	
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
	var form 	= document.form;
	
	if(sel.value == '2')
	{
		var MUL_DIV = document.getElementById("MUL_DIV");
	  	
	  	var innerHtml = "";
			innerHtml += "<table id='MUL_TABLE' border='0' cellpadding='0' cellspacing='0' class='sub_stan'>";
			innerHtml += "	<tr id='MulDateSection'>";
			innerHtml += "		<td id='UseSection' style='display:block'>";
			innerHtml += "			<input id='PARTLY_PERIOD' maxlength='100' name='PARTLY_PERIOD' type='text' class='essential' style='width:300px'"; 
			innerHtml += "			value='일시 점용기간을 입력해 주세요. 예)09.06.06 ~ 09.09.09' onclick='checkPARTLY_PERIOD()'>";
			innerHtml += "			&nbsp;&nbsp;총<input name='TOTAL_PERIOD' maxlength='5' type='text' class='essential' style='width:30px' value='' style='ime-mode:disabled' onKeyDown='nr_num_int(this);' onKeyUp='nr_num_int(this);' onKeyPress='nr_num_int(this);'>일";
			innerHtml += "		</td>";
			innerHtml += "	<td bgcolor='eaeaea' class='table_bl_left'>&nbsp;&nbsp;&nbsp;(만료일: ";
			innerHtml += "<input id='DUE_DATE' name='DUE_DATE' type='text' readonly class='input_form1' style='width: 70px;'>";
			innerHtml += "<a><img onclick=\"popUpCalendar(this, document.getElementById('DUE_DATE'), 'yyyymmdd')\" src='/img/calendar_icon.gif' width='16' height='16' border='0' align='absmiddle' style='vertical-align:middle;CURSOR: pointer;'></a>";
			innerHtml += ")</td>";
			innerHtml += "	</tr>";
			innerHtml += "</table>";

			MUL_DIV.innerHTML = innerHtml;	
	}
	else if(sel.value == '3')
	{
		var MUL_DIV = document.getElementById("MUL_DIV");
		
		var innerHtml = "";
			innerHtml += "<table id='MUL_TABLE' border='0' cellpadding='0' cellspacing='0' class='sub_stan'>";
			innerHtml += "	<tr id='MulDateSection'>";
			innerHtml += "		<td id='UseSection' style='display:block'>";
	  		innerHtml += "			<input name='MUL_FROMDATE' id='MUL_FROMDATE' type='text' class='essential' style='width:70px' value='' readonly><a><img id='MUL_FROMDATE_IMG' src='/img/calendar_icon.gif' width='19' height='16' border='0' align='absmiddle' onclick=\"popUpCalendar(this, document.getElementById('MUL_FROMDATE'), 'yyyymmdd', 0)\" style='CURSOR: Pointer;vertical-align: middle;'></a>";
		  	innerHtml += "			~ <input name='MUL_TODATE' id='MUL_TODATE' type='text' class='essential' style='width:70px' value='' readonly><a><img id='MUL_TODATE_IMG' src='/img/calendar_icon.gif' width='19' height='16' border='0' align='absmiddle' onclick=\"popUpCalendar(this, document.getElementById('MUL_TODATE'), 'yyyymmdd', 0)\" style='CURSOR: Pointer;vertical-align: middle;'></a>";
  			innerHtml += "		</td>";
	  		innerHtml += "	</tr>";
	  		innerHtml += "</table>";
	  		
	  	MUL_DIV.innerHTML = innerHtml;
	  	
	}
	else
	{
		var MUL_DIV = document.getElementById("MUL_DIV");
		
		var innerHtml = "";
			innerHtml += "<table id='MUL_TABLE' border='0' cellpadding='0' cellspacing='0' class='sub_stan'>";
			innerHtml += "	<tr id='MulDateSection'>";
			innerHtml += "		<td id='UseSection' style='display:block'>";
	  		innerHtml += "			<input name='MUL_FROMDATE' id='MUL_FROMDATE' type='text' class='essential' style='width:70px' value='' readonly><a><img id='MUL_FROMDATE_IMG' src='/img/calendar_icon.gif' width='19' height='16' border='0' align='absmiddle' onclick=\"popUpCalendar(this, document.getElementById('MUL_FROMDATE'), 'yyyymmdd')\" style='CURSOR: Pointer;vertical-align: middle;'></a>";
		  	innerHtml += "			~ <input name='MUL_TODATE' id='MUL_TODATE' type='text' class='essential' style='width:70px' value='' readonly><a><img id='MUL_TODATE_IMG' src='/img/calendar_icon.gif' width='19' height='16' border='0' align='absmiddle' onclick=\"popUpCalendar(this, document.getElementById('MUL_TODATE'), 'yyyymmdd')\" style='CURSOR: Pointer;vertical-align: middle;'></a>";
  			innerHtml += "		</td>";
  			innerHtml += "	</tr>";
  			innerHtml += "</table>";
  		
  		MUL_DIV.innerHTML = innerHtml;
  		
	}
	
	parent.iFrameResizeTab("tab1");	//	화면 RESIZE
}

// 2016.02.12 kny
function checkPARTLY_PERIOD(){
	if(form.PARTLY_PERIOD.value.length	< 1 || form.PARTLY_PERIOD.value == "일시 점용기간을 입력해 주세요. 예)09.06.06 ~ 09.09.09")
	{
		form.PARTLY_PERIOD.value = "";
	}
}

function	Select_UseType(sel)
{
	document.getElementById("doroname").colSpan= 1;
	document.getElementById("jucha").style.display = "none";
	document.getElementById("jucha_value").style.display = "none";
	document.getElementById("UseType1").style.display = "none";
	document.getElementById("UseType2").style.display = "none";
	document.getElementById("UseType3").style.display 	= "none";
	
	if(sel.value == '2')
	{
		document.getElementById("jucha").style.display = "block";
		document.getElementById("jucha_value").style.display = "inline-block";
		document.getElementById("USERTYPENAME").value		= "하천명/등급";
		document.getElementById("UseType2").style.display 	= "inline-block";	// 하천명
		document.getElementById("UseType3").style.display 	= "inline-block"; // 하천등급
		
	}
	else if(sel.value == '3')
	{
		document.getElementById("jucha").style.display = "block";
		document.getElementById("jucha_value").style.display = "inline-block";
		document.getElementById("USERTYPENAME").value		= "하천명";
		document.getElementById("UseType2").style.display 	= "inline-block";	// 하천명
	}
	else if(sel.value == '1')
	{
		document.getElementById("jucha").style.display = "block";
		document.getElementById("jucha_value").style.display = "inline-block";
		document.getElementById("USERTYPENAME").value		= "주차면수";
		document.getElementById("UseType1").style.display 	= "inline-block";	//	도로
		
	}
	else{
		document.getElementById("doroname").colSpan= 3;
		document.getElementById("USERTYPENAME").value		= "";
	}

	document.getElementById("IFRM_PurposeCode").src="/jsp/common/purposeCode/purposeCode.jsp?SectionCode=" + sel.value + "&essential=1";
}	
//********** BEGIN_현진_20120215
/*
function openZipcodePopup_new(post, addr, addr_new, si, gu, doro, bd)
{ 
	 
	var	post1	= post;
	var	addr1	= addr;
	var	addr1_new	= addr_new;
	var	addr1_si	= si;
	var	addr1_gu	= gu;
	var	addr1_doro	= doro;
	var	addr1_bd	= bd;
	
	 
	
	//var url 	= "/zipcode.do?openerPost=" + post1 + "&openerAddr=" + addr1+ "&openerAddrNew=" + addr1_new+ "&openerSi=" + addr1_si+ "&openerGu=" + addr1_gu+ "&openerDoro=" + addr1_doro+"&openerBd=" + addr1_bd;
	var url 	= "/zipCode_New.do?openerPost=" + post1 + "&openerAddr=" + addr1+ "&openerAddrNew=" + addr1_new+ "&openerSi=" + addr1_si+ "&openerGun=" + addr1_gu+ "&openerDoro=" + addr1_doro+"&openerBd=" + addr1_bd;
	
	//alert('url ='+url);
	
	var winName = "우편번호입력";
	//var width 	= 420;
	var width 	= 840;
	var height 	= 305;
	var scroll 	= "yes";
	var resize 	= "no";

	var	option	= "scrollbars=" + scroll + ", ";
	option	+= "resize=" + resize + ", ";
	option	+= "width=" + width + ", ";
	option	+= "height=" + height;

	window.open(url, winName, option);
	 
}

function 	openZipcodePopup(post, addr)
{ 
	
	var	post1	= post;
	var	addr1	= addr; 

	var url 	= "/zipcode.do?openerPost=" + post1 + "&openerAddr=" + addr1;
	
	var winName = "우편번호입력";
	var width 	= 420;
	//var width 	= 840;
	var height 	= 305;
	var scroll 	= "yes";
	var resize 	= "no";

	var	option	= "scrollbars=" + scroll + ", ";
	option	+= "resize=" + resize + ", ";
	option	+= "width=" + width + ", ";
	option	+= "height=" + height;

	window.open(url, winName, option); 
}
*/
//********** END_현진_20120215
 
function 	openDoromatchPopup(post, addr)
{
	var	post1	= post;
	var	addr1	= addr;

	var url 	= "/doromatch.do?openerPost=" + post1 + "&openerAddr=" + addr1;
	var winName = "도로명입력";
	var width 	= 1000;
	var height 	= 600;
	var scroll 	= "yes";
	var resize 	= "yes";

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
	var tabs = document.getElementById('tabmenu');
	var tab = tabs.getElementsByTagName('a'); // 탭 요소
	var contents = document.getElementById('tabcontents');
	var content = getElementsByClassName('tabcontent',contents); // 컨텐츠 요소 class
	
	//	점용인 정보
	if(form.NAME.value.length	< 1){
		str	+= "점용인/법인명을 입력하세요\n";
		alert(str);
		//parent.iFrameResizeTab("tab1");
		tabDisplay(tab,content,1);
		form.NAME.focus();
	}
	else if(form.jumin_ssn1.value.length < 6)
	{
		str	+= "주민(법인)번호가 입력되지 않았거나\n자리수가 틀립니다.";
		alert(str);
		tabDisplay(tab,content,1);
		form.jumin_ssn1.focus();
	}
	else if(form.jumin_ssn2.value.length < 7)
	{
		str	+= "주민(법인)번호가 입력되지 않았거나\n자리수가 틀립니다.";
		alert(str);
		tabDisplay(tab,content,1);
		form.jumin_ssn2.focus();
	}
	else if(form.POST.value.length	< 1)
	{
		str	+= "우편번호를 입력하세요\n";
		alert(str);
		tabDisplay(tab,content,1);
//		hoban		
//		openZipcodePopup('form.POST', 'form.ADDR1');
		openZipcodePopup_new('form.POST', 'form.ADDR1', 'form.ADDR1_NEW', 'form.SI', 'form.GUN', 'form.DORO_NM', 'form.BD_NM','','','');
	}
	else if(form.TOBON.value.length	< 1)
	{
		str	+= "본번을 입력하세요\n";
		alert(str);
		tabDisplay(tab,content,1);
		form.BON.focus();
	}
	else if(form.TOPOST.value.length	< 1)
	{
		str	+= "우편번호를 입력하세요\n";
		alert(str);
		tabDisplay(tab,content,1);
//		hoban
//		openZipcodePopup('form.TOPOST', 'form.TOADDR1');
		openZipcodePopup_new('form.TOPOST', 'form.TOADDR1', 'form.TOADDR1_NEW', 'form.TOSI', 'form.TOGUN', 'form.TO_DORO_NM', 'form.TO_BD_NM','','','');
	}
	else if(form.TOBON.value.length	< 1)
	{
		str	+= "본번을 입력하세요\n";
		alert(str);
		tabDisplay(tab,content,1);
		form.TOBON.focus();
	}
	else if(form.TYPE.value.length	< 1)	//	점용지 정보
	{
		str	+= "점용 종류를 입력하세요\n";
		alert(str);
		tabDisplay(tab,content,2);
		form.TYPE.focus();
	}
	else if(form.SECTION.value.length	< 1)
	{
		str	+= "점용 구분을 입력하세요\n";
		alert(str);
		tabDisplay(tab,content,2);
		form.SECTION.focus();
	}
	else if(form.OWNER_SET.value.length	< 1)
	{
		str	+= "소유자 구분을 입력하세요\n";
		alert(str);
		tabDisplay(tab,content,2);
		form.OWNER_SET.focus();
	}
	else if(form.TAX_SET.value.length	< 1)
	{
		str	+= "세입 구분을 입력하세요\n";
		alert(str);
		tabDisplay(tab,content,2);
		form.TAX_SET.focus();
	}
	else if(form.MUL_POST.value.length	< 1)
	{
		str	+= "우편번호를 입력하세요\n";
		alert(str);
		tabDisplay(tab,content,2);
		// hoban : 여긴 안고쳐도 괜찮으려나
		//********** BEGIN_현진_20120216
		//openZipcodePopup('form.MUL_POST', '');
		openZipcodePopup_new('form.MUL_POST','','','','','','','','','');
		//********** END_현진_20120216
		
	}
	else if(form.BJ_CD.value.length	< 1)
	{
		str	+= "법정동을 입력하세요.\n";
		alert(str);
		tabDisplay(tab,content,2);
		form.BJ_CD.focus();
	}
	else if(form.HJ_CD.value.length	< 1)
	{
		str	+= "행정동을 입력하세요\n";
		alert(str);
		tabDisplay(tab,content,2);
		form.HJ_CD.focus();
	}
	else if(form.SPC_CD.value.length	< 1)
	{
		str	+= "번지선택을 입력하세요\n";
		alert(str);
		tabDisplay(tab,content,2);
		form.SPC_CD.focus();
	}
	else if(form.BONBUN.value.length	< 1)
	{
		str	+= "본번을 입력하세요\n";
		alert(str);
		tabDisplay(tab,content,2);
		form.BONBUN.focus();
	}
	else if(form.ROAD_BON.value.length	< 1)
	{
		str	+= "도로(하천) 주소를 입력하세요\n";
		alert(str);
		tabDisplay(tab,content,2);
		form.ROAD_BON.focus();
	}
	else if(document.getElementsByName("WITH_ADDR_PNU").length	< 1)
	{
		str	+= "한개 이상에 공시지가 주소를 입력하세요\n";
		alert(str);
		tabDisplay(tab,content,2);
		//form.WITH_ADDR_LIST.focus();
		form.WITH_GU_CD.focus();
	}
	else if(form.MUL_POST.value.length	< 1)
	{
		str	+= "우편번호를 입력하세요\n";
		alert(str);
		tabDisplay(tab,content,2);
		form.MUL_POST.focus();
	}

	else if(IFRM_PurposeCode.PURPOSE_CD.value < 011)
	{
		str	+= "점용목적을 입력하세요\n";
		alert(str);
		tabDisplay(tab,content,2);
		IFRM_PurposeCode.PURPOSE_CD.focus();
	}
	else if (IFRM_PurposeCode.isSelectOK()==false)
	{
		str += "점용목적을 정확히 선택하세요"
		alert(str);
		tabDisplay(tab,content,2);
	}
	else if(form.AREA_SIZE.value.length	< 1)
	{
		str	+= "점용면적을 입력하세요\n";
		alert(str);
		tabDisplay(tab,content,2);
		form.AREA_SIZE.focus();
	}
	else if(form.SECTION.value	== '1' || form.SECTION.value	== '3'){
		if(form.MUL_FROMDATE.value.length	< 1)
		{
			str	+= "점용기간을 입력하세요\n";
			alert(str);
			tabDisplay(tab,content,2);
			form.MUL_FROMDATE.focus();
		}
		else if(form.MUL_TODATE.value.length	< 1)
		{
			str	+= "점용기간을 입력하세요\n";
			alert(str);
			tabDisplay(tab,content,2);
			form.MUL_TODATE.focus();
		}
	}else if(form.SECTION.value	== '2')
	{
		if(form.PARTLY_PERIOD.value.length	< 1 || form.PARTLY_PERIOD.value == "일시 점용기간을 입력해 주세요. 예)09.06.06 ~ 09.09.09")
		{
			str	+= "일시점용기간을 입력하세요\n";
			alert(str);
			tabDisplay(tab,content,2);
			form.PARTLY_PERIOD.focus();
		}
		else if(form.TOTAL_PERIOD.value.length	< 1)
		{
			str	+= "일시점용기간 총일수를 입력하세요\n";
			alert(str);
			tabDisplay(tab,content,2);
			form.TOTAL_PERIOD.focus();
		}
	}


	if(str	== "")
	{
		return	true;
	}
	
	return	false;
}

function	Init()
{
	parent.iFrameResizeTab("tab1");
}



// 평균 인접지 공시지가
function 	addWithAddrList()
{
	
	var form 	= document.form;
	var tabs = document.getElementById('tabmenu');
	var tab = tabs.getElementsByTagName('a'); // 탭 요소
	var contents = document.getElementById('tabcontents');
	var content = getElementsByClassName('tabcontent',contents); // 컨텐츠
	var	str		= "";
	
	if(getSelectedValue(form.WITH_GU_CD).length	< 1)
	{
		str	+= "구를 선택하세요.\n";
		alert(str);
		tabDisplay(tab,content,2);
		form.WITH_GU_CD.focus();
	}
	else if(getSelectedValue(form.WITH_BJ_CD).length	< 1)
	{
		str	+= "법정동을 선택하세요.\n";
		alert(str);
		tabDisplay(tab,content,2);
		form.WITH_BJ_CD.focus();
	}
	else if(getSelectedValue(form.WITH_SPC_CD).length	< 1)
	{
		str	+= "번지를 선택하세요\n";
		alert(str);
		tabDisplay(tab,content,2);
		form.WITH_SPC_CD.focus();
	}
	else if(form.WITH_BONBUN.value.length	< 1)
	{
		str	+= "본번을 선택하세요\n";
		alert(str);
		tabDisplay(tab,content,2);
		form.WITH_BONBUN.focus();
	}
	else{
		
		var pnu = '11'+getSelectedValue(form.WITH_GU_CD)+getSelectedValue(form.WITH_BJ_CD)
		+getSelectedValue(form.WITH_SPC_CD)+addZero(form.WITH_BONBUN.value,4)+addZero(form.WITH_BUBUN.value,4);
		
		var text = getSelectedText(form.WITH_GU_CD)+' '+getSelectedText(form.WITH_BJ_CD)+' ';
		if(form.WITH_SPC_CD.value == '2')text += '산 ';
		text += form.WITH_BONBUN.value;
		if(form.WITH_BUBUN.value.length > 0){
			text += '-'+form.WITH_BUBUN.value;
		}
		
		addWithAddr(pnu,text);
	}	
}

function delWithAddr(obj){
	var list = document.getElementsByName("DEL_ID");
	var delId;
	for(var i = 0 ; i < list.length ; i++){
		if(list[i] == obj){
			delId = i;
			
		}
	}
	
	var tbody = document.getElementById("WITH_ADDR_LIST");
	tbody.deleteRow(delId);
}

function addWithAddr(pnu,text){
	
	var tbody = document.getElementById("WITH_ADDR_LIST");
	  
	var tr,td,Elem;
	
	tr = document.createElement('tr');
	td = document.createElement('td');
	td.setAttribute("height", "18px");
	td.setAttribute("width", "90%");
	
	//Elem = document.createElement("<input name='WITH_ADDR_PNU' type='hidden'>");
	var Elem1 = document.createElement("div");
	var innerElem1 = "<input name='WITH_ADDR_PNU' type='hidden' value='"+pnu+"'>";
	Elem1.innerHTML = innerElem1; 
	//Elem.value = pnu;
	td.appendChild(Elem1);
	
	//Elem = document.createElement("<input name='WITH_ADDR_TEXT' type='text' readonly>");
	var Elem2 = document.createElement("div");
	var innerElem2 = "<input name='WITH_ADDR_TEXT' type='text' readonly class='input_form1' style='border: 0; width: 100%;' value='"+text+"'>";
	Elem2.innerHTML=innerElem2;
	//	Elem.className = 'input_form1';
//	Elem.style.border = '0px';
//	Elem.style.width = '100%';
//	Elem.value = text;
	td.appendChild(Elem2);
	
	tr.appendChild(td);
	td = document.createElement('td');
	td.setAttribute("width", "10%");
	
	Elem = document.createElement('img');
	Elem.src = '/img/mapImg/close.gif';
	Elem.name = 'DEL_ID';
	Elem.alt = '삭제';
	Elem.style.width = '22px';
	Elem.style.height = '17px';
	Elem.style.border = '0px';
	Elem.style.CURSOR = 'pointer';
	Elem.style.verticalAlign = 'middle';
	Elem.onclick = function(){
		delWithAddr(this);
	};
	td.appendChild(Elem);
	tr.appendChild(td);
	tbody.appendChild(tr);
	
}



	function goViewJibunMap(gubun){
		var form 	= document.form;
		var	str		= "";
		
		if(gubun == 'with'){
			if(getSelectedValue(form.BJ_CD).length	< 1){
				str	+= "점용지 법정동을 입력하세요.\n";
				alert(str);
				form.BJ_CD.focus();
			}
			else if(getSelectedValue(form.SPC_CD).length	< 1){
				str	+= "점용지 번지선택을 입력하세요\n";
				alert(str);
				form.SPC_CD.focus();
			}
			else if(form.BONBUN.value.length	< 1){
				str	+= "점용지 본번을 입력하세요\n";
				alert(str);
				form.BONBUN.focus();
			}
		}else if(gubun == 'road'){
			if(getSelectedValue(form.BJ_CD).length	< 1){
				str	+= "점용지 법정동을 입력하세요.\n";
				alert(str);
				form.BJ_CD.focus();
			}
			else if(getSelectedValue(form.SPC_CD).length	< 1){
				str	+= "점용지 번지선택을 입력하세요\n";
				alert(str);
				form.SPC_CD.focus();
			}
			else if(form.ROAD_BON.value.length	< 1){
				str	+= "도로주소 본번을 입력하세요\n";
				alert(str);
				form.ROAD_BON.focus();
			}
		}else if(gubun == 'price'){
			if(getSelectedValue(form.WITH_GU_CD).length	< 1)
			{
				str	+= "구를 선택하세요.\n";
				alert(str);
				tabDisplay(tab,content,2);
				form.WITH_GU_CD.focus();
			}
			else if(getSelectedValue(form.WITH_BJ_CD).length	< 1)
			{
				str	+= "법정동을 선택하세요.\n";
				alert(str);
				tabDisplay(tab,content,2);
				form.WITH_BJ_CD.focus();
			}
			else if(getSelectedValue(form.WITH_SPC_CD).length	< 1)
			{
				str	+= "번지를 선택하세요\n";
				alert(str);
				tabDisplay(tab,content,2);
				form.WITH_SPC_CD.focus();
			}
			else if(form.WITH_BONBUN.value.length	< 1)
			{
				str	+= "본번을 선택하세요\n";
				alert(str);
				tabDisplay(tab,content,2);
				form.WITH_BONBUN.focus();
			}
		}
		
		if(str	== "")
		{
			var bjCd = getSelectedValue(form.BJ_CD);
			var spcCd = getSelectedValue(form.SPC_CD);
			var sigungu = form.SIGUNGU.value;
			
			if(gubun == 'with'){
				var bonbunCd = form.BONBUN.value;
				var bubunCd = form.BUBUN.value;
			}else if(gubun == 'road'){
				var bonbunCd = form.ROAD_BON.value;
				var bubunCd = form.ROAD_BU.value;
			}else if(gubun == 'price'){
				sigungu = getSelectedValue(form.WITH_GU_CD);
				bjCd = getSelectedValue(form.WITH_BJ_CD);
				spcCd = getSelectedValue(form.WITH_SPC_CD);
				var bonbunCd = form.WITH_BONBUN.value;
				var bubunCd = form.WITH_BUBUN.value;
			}
			
			var pnu = '11'+sigungu+bjCd+spcCd+addZero(bonbunCd,4)+addZero(bubunCd,4);
			
			
			var url = '/jumyong/map/mini_map.do?PNU='+pnu+'&TYPE=view';
			cw=screen.availWidth; // 화면 너비
			ch=screen.availHeight; // 화면 높이
			
			sw=800;// 띄울 창의 너비
			sh=600;// 띄울 창의 높이
			
			ml=(cw-sw)/2;// 가운데 띄우기위한 창의 x위치
			mt=(ch-sh)/2;// 가운데 띄우기위한 창의 y위치

			var param = 'width='+sw+',height='+sh+',top='+mt+',left='+ml+',resizable=no, status=no, scrollbars=no, toolbar=no, menubar=no';
			window.open(url, "minimap", param);
			
			
		}else{
			return;
			
		}
	}
//-->
</script>
<body>

<form id="form" name="form" method="post">
<input type="hidden" id="UserType" name="UserType">
<input type="hidden" id="UserSection" name="UserSection">
<input type="hidden" id="PURPOSE_CD" name="PURPOSE_CD" value="${PURPOSE_CD}">
<input type="hidden" id="MIN_CHECK" name="MIN_CHECK" value="${MIN_CHECK}">
<input type="hidden" id="MIN_PROCESS" name="MIN_PROCESS" value="${MIN_PROCESS}">
<input type="hidden" id="GIGAN1" name="GIGAN1" value="${GIGAN1}">
<input type="hidden" id="GIGAN2" name="GIGAN2" value="${GIGAN2}">
<input type="hidden" id="MIN_NAME" name="MIN_NAME" value="${MIN_NAME}">
<input type="hidden" id="MIN_REQNO" name="MIN_REQNO" value="${MIN_REQNO}">
<input type="hidden" id="NOWTAB" name="NOWTAB" value="0">
<input type="hidden" id="WITH_XML" name="WITH_XML" value="${WITH_XML}">
<input type="hidden" id="SIGUNGU" name="SIGUNGU" value="${SIGUNGU}">

<table width="800" border="0" cellpadding="0" cellspacing="0">
<tr>
	<td align="left"><table width="780" border="0" cellspacing="0" cellpadding="0">
   		<tr>
         	<td height="22" background="/img/tab_line_purple.gif">
         		<table border="0" cellspacing="0" cellpadding="0">
	               <tr>
	               	<ul id="tabmenu">
						<td width="111"><a><img src="/img/sub_petition_title9_on.gif" alt="민원정보" width="110" height="22" border="0" onclick="Init();" style="CURSOR: Hand;"></a></td>
						<td width="111"><a><img src="/img/sub_petition_title2_off_b.gif" alt="점용인 정보" width="110" height="22" border="0" onclick="Init();" style="CURSOR: Hand;"></a></td>
						<td width="111"><a><img src="/img/sub_petition_title3_off.gif" alt="점용지 정보" width="110" height="22" border="0" onclick="Init();" style="CURSOR: Hand;"></a></td>
					</ul>
	               </tr>
				</table>
			</td>
		</tr>
		
		<tr>
            <td align="left" class="contborder_purple">
	
		<div id="tabcontents">
		
			<div class="tabcontent">
				<table width="100%" border="0" cellspacing="0" cellpadding="0">
				
                <tr>
					<td><table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
				  	<tr>
						<td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">접수번호</td>
						<td width="37%" bgcolor="eaeaea" class="table_bl_left"><input id="REQ_NO_MIN" name="REQ_NO_MIN" type="text" class="input_form1" style="width:120px" value="${REQ_NO_MIN}"  maxlength="20" readonly></td>
						<td width="100" align="center" bgcolor="e5eff8" class="sub_table_b">민원구분</td>
						<td bgcolor="eaeaea" class="table_bl_left"><input id="GUBUN_MIN" name="GUBUN_MIN" type="text" class="input_form1" style="width:120px" value="${GUBUN_MIN}" maxlength="25"></td>
				  	</tr>
				  	<tr>
						<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">접수일자</td>
						<td bgcolor="eaeaea" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
					  	<tr>
							<td><input id="REQ_DATE_MIN" name="REQ_DATE_MIN" type="text" class="input_form1" style="width:120px" value="${REQ_DATE_MIN}" readonly></td>
							<td><a><img src="/img/calendar_icon.gif" width="19" height="16" border="0" onclick="popUpCalendar(this, document.getElementById('REQ_DATE_MIN'), 'yyyymmdd')" style="CURSOR: Hand;"></a></td>
					  	</tr>
						</table></td>
						<td align="center" bgcolor="e5eff8" class="sub_table_b">처리예정일자</td>
						<td bgcolor="eaeaea" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
					  	<tr>
							<td><input id="PREDATE_MIN" name="PREDATE_MIN" type="text" class="input_form1" style="width:120px" value="${PREDATE_MIN}" readonly></td>
							<td><a><img src="/img/calendar_icon.gif" width="19" height="16" border="0" onclick="popUpCalendar(this, document.getElementById('PREDATE_MIN'), 'yyyymmdd')" style="CURSOR: Hand;"></a></td>
					  	</tr>
						</table></td>
				  	</tr>
				  	<tr>
						<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">접수부서</td>
						<td bgcolor="eaeaea" class="table_bl_left"><input id="REQ_DEP_MIN" name="REQ_DEP_MIN" type="text" class="input_form1" style="width:120px" value="${REQ_DEP_MIN}" maxlength="10"></td>
						<td align="center" bgcolor="e5eff8" class="sub_table_b">담당부서</td>
						<td bgcolor="eaeaea" class="table_bl_left"><input id="MANAGE_DEP_MIN" name="MANAGE_DEP_MIN" type="text" class="input_form1" style="width:120px" value="${MANAGE_DEP_MIN}" maxlength="10"></td>
				  	</tr>
					<tr>
						<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">접수자명</td>
						<td bgcolor="eaeaea" class="table_bl_left"><input id="REQ_NM_MIN" name="REQ_NM_MIN" type="text" class="input_form1" style="width:120px" value="${REQ_NM_MIN}" maxlength="10"></td>
						<td align="center" bgcolor="e5eff8" class="sub_table_b">담당자명</td>
						<td bgcolor="eaeaea" class="table_bl_left"><input id="MANAGER_MIN" name="MANAGER_MIN" type="text" class="input_form1" style="width:120px" value="${MANAGER_MIN}" maxlength="10"></td>
					</tr>
					<tr>
						<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">민원요지</td>
						<td colspan="3" bgcolor="eaeaea" class="table_bl_left"><table width="100%" border="0" cellpadding="0" cellspacing="0" class="sub_stan">
							<input id="NOTES_MIN" name="NOTES_MIN" type="text" class="input_form1" style="width:98%" value="${NOTES_MIN}" maxlength="100">
						</table></td>
					</tr>
					<tr>
						<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">대리인</td>
						<td bgcolor="eaeaea" class="table_bl_left">
							<input id="AGENT_NM_MIN" name="AGENT_NM_MIN" type="text" class="input_form1" style="width:120px" value="${AGENT_NM_MIN}"  maxlength="10">
						</td>
						<!--  //********** BEGIN_현진_20120216 -->
						<td align="center" bgcolor="e5eff8" class="sub_table_b">대리인 연락처</td>
						<td bgcolor="eaeaea" class="table_bl_left">
							<input id="AGENT_TEL_MIN" name="AGENT_TEL_MIN" type="text" class="input_form1" style="width:100px" value="${min_agent_tel}" onKeyPress="nr_num_int(this);" onKeyUp="nr_num_int(this);" maxlength="11">
						</td>
						<!--   //********** END_현진_20120216 -->
					</tr>
					<tr>
						<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">민원인명</td>
						<td bgcolor="eaeaea" class="table_bl_left"><input id="NAME_MIN" name="NAME_MIN" type="text" class="input_form1" style="width:120px" value="${NAME_MIN}" maxlength="10"></td>
						<td align="center" bgcolor="e5eff8" class="sub_table_b">민원인 주민번호</td>
						<td bgcolor="eaeaea" class="table_bl_left">
							<input id="min_ssn1" name="min_ssn1" type="text" class="input_form1" style="width:40px; ime-mode:disabled" value="${min_ssn1}" onKeyPress="nr_num_int(this);" onKeyUp="count_check(this, min_ssn2, 6);" maxlength="6">
							 - <input id="min_ssn2" name="min_ssn2" type="text" class="input_form1" style="width:90px; ime-mode:disabled" value="${min_ssn2}" onKeyPress="nr_num_int(this);" maxlength="7"></td>
					</tr>
				 	<tr>
						<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b"> 우편번호</td>
						<td bgcolor="eaeaea" class="table_bl_left" colspan="3">
						<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
							<tr>
							  	<td><input id="POST_MIN" name="POST_MIN" type="text" class="input_form1" style="width:50px" value="${POST_MIN}" readonly></td>
							  	<td><img src="/img/search_icon.gif" alt="검색" width="56" height="18" border="0" onclick="javascript:openZipcodePopup_new('form.POST_MIN', 'form.ADDR1_MIN', 'form.DORO_ADDR1_MIN' , 'form.SI' , 'form.GUN' , 'form.DORO_NM' , 'form.BD_NM','','','');" style="CURSOR:Hand"></td>
							</tr>
							
						</table>
						</td>						
						
				  	</tr>
				  	<tr>
						<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">민원인<br/>기본 주소</td>
						<td bgcolor="eaeaea" class="table_bl_left">						
						<!--  //********** BEGIN_현진_20120215 -->
						<!-- 
						<input id="SI" name="SI" type="hidden" value="">
							<input id="GUN" name="GUN" type="hidden" value="">
							<input id="DORO_NM" name="DORO_NM" type="hidden" value="">
							<input id="BD_NM" name="BD_NM" type="hidden" value="">
						 -->
						<!--   //********** END_현진_20120215 -->
							
							
							<input id="ADDR1_MIN" name="ADDR1_MIN" type="text" class="input_form1" style="width:250px" value="${ADDR1_MIN}" readonly>
							<input id="ADDR2_MIN" name="ADDR2_MIN" type="text" class="input_form1" style="width:250px" value="${ADDR2_MIN}" maxlength="50">
						</td>
						<td align="center" bgcolor="e5eff8" class="sub_table_b">민원인<br/>도로명 주소 </td>
						<td bgcolor="eaeaea" class="table_bl_left">
						<!--  //********** BEGIN_현진_20120215 -->
						<input id="DORO_ADDR1_MIN" name="DORO_ADDR1_MIN" type="text" class="input_form1" style="width:250px" readonly>	
						<input id="DORO_ADDR2_MIN" name="DORO_ADDR2_MIN" type="text" class="input_form1" style="width:250px" maxlength="50">	
						<!--   //********** END_현진_20120215 -->
							
						</td>
				  	</tr>
				  	<tr>
						<!--  //********** BEGIN_현진_20120215 -->
						 <!-- 
						<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">민원인 전화</td>
						<td bgcolor="eaeaea" class="table_bl_left">
							<input id="min_tel" name="min_tel" type="text" class="input_form1" style="width:100px" onKeyPress="nr_num_int(this);" onKeyUp="nr_num_int(this);" style="ime-mode:disabled" value="${min_tel}" maxlength="11">  
						</td>
						<td align="center" bgcolor="e5eff8" class="sub_table_b">민원인 휴대폰</td>
						<td bgcolor="eaeaea" class="table_bl_left">
							<input id="min_hp" name="min_hp" type="text" class="input_form1" style="width:100px" onKeyPress="nr_num_int(this);" onKeyUp="nr_num_int(this);" style="ime-mode:disabled" value="${min_hp}" maxlength="11">
						</td>
						-->
						<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">민원인 전화</td>
						<td bgcolor="eaeaea" class="table_bl_left">
							<input id="TEL_MIN" name="TEL_MIN" type="text" class="input_form1" style="width:100px" onKeyPress="nr_num_int(this);" onKeyUp="nr_num_int(this);" style="ime-mode:disabled" value="${TEL_MIN}" maxlength="11">  
						</td>
						<td align="center" bgcolor="e5eff8" class="sub_table_b">민원인 휴대폰</td>
						 <td bgcolor="eaeaea" class="table_bl_left">
							<input id="HP_MIN" name="HP_MIN" type="text" class="input_form1" style="width:100px" onKeyPress="nr_num_int(this);" onKeyUp="nr_num_int(this);" style="ime-mode:disabled" value="${HP_MIN}" maxlength="11">
						</td>
						
						<!--   //********** END_현진_20120215 -->
						
				  	</tr>
				  	<tr>
					  	<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">비고</td>
						<td colspan="3" bgcolor="eaeaea" class="table_bl_left">
							<table width="100%" border="0" cellpadding="0" cellspacing="0" class="sub_stan">
								<textarea id="MINWON_REFERENCE" name="MINWON_REFERENCE" type="text" class="input_form1" style="width:98%" value="${MINWON_REFERENCE}" maxlength="500"></textarea>
							</table>
						</td>
					</tr>
                  	</table>
                  	</td>
                </tr>

				</table>
			</div>
		
			<div class="tabcontent" style="display:none">
				<table width="100%" border="0" cellspacing="0" cellpadding="0">
				
                <tr>
                  	<td>
                  	<table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
				  	<tr>
						<td width="14%" height="26px" align="center" bgcolor="e5eff8" class="sub_table_b">점용인/법인명</td>
						<td width="36%" bgcolor="eaeaea" class="table_bl_left">
							<input id="NAME" name="NAME" type="text" class="essential" style="width:250px" onKeyUp="Jumin_toaddr_Check();" onclick="Jumin_toaddr_Check();" onchange="Jumin_toaddr_Check();" onFocus="Jumin_toaddr_Check();" value="${NAME}"  maxlength="20">
						</td>
						<td width="14%" align="center" bgcolor="e5eff8" class="sub_table_b">주민/법인번호</td>
						<td width="36%" bgcolor="eaeaea" class="table_bl_left">
							<input id="jumin_ssn1" name="jumin_ssn1" type="text" class="essential" style="width:40px; ime-mode:disabled" value="${jumin_ssn1}" onKeyPress="nr_num_int(this);" onKeyUp="count_check(this, jumin_ssn2, 6);" maxlength="6">
						  - <input id="jumin_ssn2" name="jumin_ssn2" type="text" class="essential" style="width:90px; ime-mode:disabled" value="${jumin_ssn2}" onKeyPress="nr_num_int(this);" maxlength="7"></td>
					</tr>
				  	<tr>
						<td height="26px" align="center" bgcolor="e5eff8" class="sub_table_b">사업자등록번호</td>
						<td bgcolor="eaeaea" class="table_bl_left">
							<input id="jumin_bizssn1" name="jumin_bizssn1" type="text" class="input_form1" value="${jumin_bizssn1}" style="width:20px; ime-mode:disabled" onKeyPress="nr_num_int(this);" onKeyUp="count_check(this, jumin_bizssn2, 3);" maxlength="3">
						  - <input id="jumin_bizssn2" name="jumin_bizssn2" type="text" class="input_form1" value="${jumin_bizssn2}" style="width:15px; ime-mode:disabled" onKeyPress="nr_num_int(this);" onKeyUp="count_check(this, jumin_bizssn3, 2);" maxlength="2">
						  - <input id="jumin_bizssn3" name="jumin_bizssn3" type="text" class="input_form1" value="${jumin_bizssn3}" style="width:35px; ime-mode:disabled" onKeyPress="nr_num_int(this);" maxlength="5"></td>
						<td align="center" bgcolor="e5eff8" class="sub_table_b">업태/업종</td>
						<td bgcolor="eaeaea" class="table_bl_left">
							<input id="BIZ_STATUS" name="BIZ_STATUS" type="text" class="input_form1" style="width:60px" value="${BIZ_STATUS}" maxlength="50">
						  / <input id="BIZ_TYPES" name="BIZ_TYPES" type="text" class="input_form1" style="width:160px" value="${BIZ_TYPES}" maxlength="50">
						</td>
				  	</tr>
				  	<!--  //********** BEGIN_현진_20120321 -->				  	
				  	<!--  //********** BEGIN_KANG_20120417 -->
				  	<!-- 
				  	<tr>
						<td height="26px" align="center" bgcolor="e5eff8" class="sub_table_b">대표자명</td>
						<td bgcolor="eaeaea" class="table_bl_left">
							<input id="EXPONENT" name="EXPONENT" type="text" class="input_form1" style="width:100px" maxlength="10"/></td>
						<td align="center" bgcolor="e5eff8" class="sub_table_b">사업장주소</td>
						<td bgcolor="eaeaea" class="table_bl_left">
							<input id="BUSINESSADDR" name="BUSINESSADDR" type="text" class="input_form1" style="width:220px" maxlength="100"/>													  
						</td>
				  	</tr>
				  	 -->
				  	 <tr>
						<td height="26px" align="center" bgcolor="e5eff8" class="sub_table_b">대표자명</td>
						<td bgcolor="eaeaea" class="table_bl_left">
							<input id="EXPONENT" name="EXPONENT" type="text" class="input_form1" style="width:100px" maxlength="10"/></td>
						<td align="center" bgcolor="e5eff8" class="sub_table_b">상호명</td>
						<td bgcolor="eaeaea" class="table_bl_left">
							<input id="COMPANY_NAME" name="COMPANY_NAME" type="text" class="input_form1" style="width:220px" maxlength="40"/>													  
						</td>
				  	</tr>
				  	<tr>
						<td height="26px" align="center" bgcolor="e5eff8" class="sub_table_b">사업장 주소</td>
						<td bgcolor="eaeaea" class="table_bl_left" colspan="3">
							<input id="BUSINESSADDR" name="BUSINESSADDR" type="text" class="input_form1" style="width:300px" maxlength="100"/>													  
						</td>
				  	</tr>
					<!--   //********** END_KANG_20120417 -->
									  	
					<!--   //********** END_현진_20120321 -->
				  	<!--  //********** BEGIN_현진_20120215 -->
                  	<!-- 
				  	<tr>
						<td height="26px" align="center" bgcolor="e5eff8" class="sub_table_b">우편번호</td>
						<td bgcolor="eaeaea" class="table_bl_left" colspan="3">
							<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
								<tr>
								  <td><input id="POST" name="POST" type="text" class="input_form1" style="width:50px" onClick="Jumin_toaddr_Check();" onChange="Jumin_toaddr_Check();" onFocus="Jumin_toaddr_Check();" onKeyUp="Jumin_toaddr_Check();" value="${POST}" readonly></td>
								  <td><a href="javascript:openZipcodePopup_new('form.POST', 'form.ADDR1', 'form.ADDR1_NEW', 'form.SI', 'form.GUN', 'form.DORO_NM', 'form.BD_NM');"><img src="/img/search_icon.gif" alt="읍면동검색" width="56" height="18" border="0"></a></td>								  
								</tr>
							</table>
						</td>
					</tr>
					-->
					<tr>
						<td height="26px" align="center" bgcolor="e5eff8" class="sub_table_b">우편번호</td>
						<td bgcolor="eaeaea" class="table_bl_left" colspan="3">
							<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
								<tr>
								  	<td width="50px"><input id="POST" name="POST" type="text" class="input_form1" style="width:50px" onClick="Jumin_toaddr_Check();" onChange="Jumin_toaddr_Check();" onFocus="Jumin_toaddr_Check();" onKeyUp="Jumin_toaddr_Check();" value="${POST}" readonly></td>
								  	<td width="50px"><a href="javascript:openZipcodePopup_new('form.POST', 'form.ADDR1', 'form.ADDR1_NEW', 'form.SI', 'form.GUN', 'form.DORO_NM', 'form.BD_NM','form.DONG','form.BON', 'form.BU');"><img src="/img/search_icon.gif" alt="읍면동검색" width="56" height="18" border="0"></a></td>								  
									<td align="right"><a href="javascript:addrConfirm('POST','SI','GUN','DONG','DORO_NM','BON','BU','BD_BON','BD_BU','BD_NM_NEW','BD_DET_NM','ADDR1','ADDR2','ADDR1_NEW','form')"><img src="/img/ok_icon.gif" alt="확인" width="56" height="18" border="0"></a></td>
									<!--  sungh83 20131105 -->
									<td><span class="sub_table_b">%도로명주소의 건물본번,부번을 입력하시려면 확인버튼을 클릭하시오</span></td>
							      	<!--  sungh83 20131105 --> 
								</tr>
							</table>
						</td>
					</tr>
					<!--   //********** END_현진_20120215 -->
					<tr>
					<!-- 기본 주소  -->
						<td align="center" bgcolor="e5eff8" class="sub_table_b">기본 주소</td>
						<td bgcolor="eaeaea" class="table_bl_left">
							<input id="ADDR1" name="ADDR1" type="text" class="essential" style="width:250px" onClick="Jumin_toaddr_Check();" onChange="Jumin_toaddr_Check();" onFocus="Jumin_toaddr_Check();" onKeyUp="Jumin_toaddr_Check();" value="${ADDR1}" readonly>
							산<input id="SAN" name="SAN" type="checkbox" style="vertical-align: middle;" onClick="Jumin_toaddr_Check();" onChange="Jumin_toaddr_Check();" onFocus="Jumin_toaddr_Check();" onKeyUp="Jumin_toaddr_Check();">
							<input id="BON" name="BON" type="text" class="essential" style="width:25px" onClick="Jumin_toaddr_Check();" onChange="Jumin_toaddr_Check();" onFocus="Jumin_toaddr_Check();" onKeyUp="Jumin_toaddr_Check();" value="${APPEAL_BON}">
							-
							<input id="BU" name="BU" type="text" class="input_form1" style="width:25px" onClick="Jumin_toaddr_Check();" onChange="Jumin_toaddr_Check();" onFocus="Jumin_toaddr_Check();" onKeyUp="Jumin_toaddr_Check();" value="${APPEAL_BU}" >
							<input id="ADDR2" name="ADDR2" type="text" class="input_form1" style="width:135px" onClick="Jumin_toaddr_Check();" onChange="Jumin_toaddr_Check();" onFocus="Jumin_toaddr_Check();" onKeyUp="Jumin_toaddr_Check();" value="${ADDR2}"  maxlength="50">
						</td>
					<!-- 도로명주소 -->
						<td align="center" bgcolor="e5eff8" class="sub_table_b">도로명주소</td>
						<td bgcolor="eaeaea" class="table_bl_left">
						<!--  //********** BEGIN_현진_20120215 -->
							<input id="SI" name="SI" type="hidden" value="">
							<input id="GUN" name="GUN" type="hidden" value="">
							<input id="DORO_NM" name="DORO_NM" type="hidden" value="">
							<input type="hidden" id="DONG" name="DONG">
						<!--   //********** END_현진_20120215 -->
							
 							<!--  //********** BEGIN_현진_20120215 -->
							<!-- <input id="ADDR1_NEW" name="ADDR1_NEW" type="text" class="essential" style="width:250px" onClick="Jumin_toaddr_Check();" onChange="Jumin_toaddr_Check();" onFocus="Jumin_toaddr_Check();" onKeyUp="Jumin_toaddr_Check();" value="${DR_ADDR1}" readonly>
							<input id="ADDR2_NEW" name="ADDR2_NEW" type="text" class="input_form1" style="width:135px" onClick="Jumin_toaddr_Check();" onChange="Jumin_toaddr_Check();" onFocus="Jumin_toaddr_Check();" onKeyUp="Jumin_toaddr_Check();" value="${DR_ADDR2}"  maxlength="50"> 
							
							<input id="BON_NEW" name="BON_NEW" type="text" class="essential" style="width:25px" onClick="Jumin_toaddr_Check();" onChange="Jumin_toaddr_Check();" onFocus="Jumin_toaddr_Check();" onKeyUp="Jumin_toaddr_Check();" value="${DR_APPEAL_BON}">
							-
							<input id="BU_NEW" name="BU_NEW" type="text" class="input_form1" style="width:25px" onClick="Jumin_toaddr_Check();" onChange="Jumin_toaddr_Check();" onFocus="Jumin_toaddr_Check();" onKeyUp="Jumin_toaddr_Check();" value="${DR_APPEAL_BU}" >
							-->
							<input id="ADDR1_NEW" name="ADDR1_NEW" type="text" class="essential" style="width:250px" onClick="Jumin_toaddr_Check();" onChange="Jumin_toaddr_Check();" onFocus="Jumin_toaddr_Check();" onKeyUp="Jumin_toaddr_Check();" readonly>
							<input id="BD_BON" name="BD_BON" type="text" class="essential" style="width:25px" onClick="Jumin_toaddr_Check();" onChange="Jumin_toaddr_Check();" onFocus="Jumin_toaddr_Check();" onKeyUp="Jumin_toaddr_Check();"/>
							-
							<input id="BD_BU" name="BD_BU" type="text" class="input_form1" style="width:25px" onClick="Jumin_toaddr_Check();" onChange="Jumin_toaddr_Check();" onFocus="Jumin_toaddr_Check();" onKeyUp="Jumin_toaddr_Check();"/>
			
							<input id="BD_NM_NEW" name="BD_NM_NEW" type="text" class="input_form1" style="width:135px" onClick="Jumin_toaddr_Check();" onChange="Jumin_toaddr_Check();" onFocus="Jumin_toaddr_Check();" onKeyUp="Jumin_toaddr_Check();"  maxlength="50">
							<input id="BD_DET_NM" name="BD_DET_NM" type="text" class="input_form1" style="width:214px" onClick="Jumin_toaddr_Check();" onChange="Jumin_toaddr_Check();" onFocus="Jumin_toaddr_Check();" onKeyUp="Jumin_toaddr_Check();"  maxlength="50">
							
							<!--   //********** END_현진_20120215 -->
							
						</td>
				  	</tr>
				  	<tr>
						<td height="26px" align="center" bgcolor="e5eff8" class="sub_table_b">e-mail</td>
						<td bgcolor="eaeaea" class="table_bl_left">
							<input id="EMAIL" name="EMAIL" type="text" class="input_form1" style="width:250px" value="${EMAIL}" style="ime-mode:disabled" onKeyUp="Jumin_toaddr_Check();" onclick="Jumin_toaddr_Check();" onchange="Jumin_toaddr_Check();" onFocus="Jumin_toaddr_Check();"  maxlength="50">
						</td>
						<td align="center" bgcolor="e5eff8" class="sub_table_b">기존 허가번호</td>
						<td bgcolor="eaeaea" class="table_bl_left">
							<input id="B_PERMISSION" name="B_PERMISSION" type="text" class="input_form1" style="width:250px" value="${B_PERMISSION}" style="ime-mode:disabled" onchange="Jumin_toaddr_Check();" onFocus="Jumin_toaddr_Check();"  onkeyup="Jumin_toaddr_Check();" maxlength="20">
						</td>
				  	</tr>
				  	<tr>
						<td height="26px" align="center" bgcolor="e5eff8" class="sub_table_b">전화번호</td>
						<td bgcolor="eaeaea" class="table_bl_left">
							<input id="jumin_tel1" name="jumin_tel1" type="text" class="input_form1" style="width:25px" style="ime-mode:disabled" onKeyPress="nr_num_int(this);" onKeyUp="nr_num_int(this); count_check(this, jumin_tel2, 3); Jumin_toaddr_Check();" onclick="Jumin_toaddr_Check();" onchange="Jumin_toaddr_Check();" onFocus="Jumin_toaddr_Check();" maxlength="3"> - 
							<input id="jumin_tel2" name="jumin_tel2" type="text" class="input_form1" style="width:30px" style="ime-mode:disabled" onKeyPress="nr_num_int(this);" onKeyUp="nr_num_int(this); count_check(this, jumin_tel3, 4); Jumin_toaddr_Check();" onclick="Jumin_toaddr_Check();" onchange="Jumin_toaddr_Check();" onFocus="Jumin_toaddr_Check();" maxlength="4"> - 
							<input id="jumin_tel3" name="jumin_tel3" type="text" class="input_form1" style="width:30px" style="ime-mode:disabled" onKeyPress="nr_num_int(this);" onKeyUp="nr_num_int(this); count_check(this, jumin_tel3, 4); Jumin_toaddr_Check();" onclick="Jumin_toaddr_Check();" onchange="Jumin_toaddr_Check();" onFocus="Jumin_toaddr_Check();" maxlength="4">
						</td>
						<td align="center" bgcolor="e5eff8" class="sub_table_b">휴대전화</td>
						<td bgcolor="eaeaea" class="table_bl_left">
							<input id="jumin_hp1" name="jumin_hp1" type="text" class="input_form1" style="width:25px" style="ime-mode:disabled" onKeyPress="nr_num_int(this);" onKeyUp="nr_num_int(this); count_check(this, jumin_hp2, 3); Jumin_toaddr_Check();" onclick="Jumin_toaddr_Check();" onchange="Jumin_toaddr_Check();" onFocus="Jumin_toaddr_Check();" maxlength="3"> - 
							<input id="jumin_hp2" name="jumin_hp2" type="text" class="input_form1" style="width:30px" style="ime-mode:disabled" onKeyPress="nr_num_int(this);" onKeyUp="nr_num_int(this); count_check(this, jumin_hp3, 4); Jumin_toaddr_Check();" onclick="Jumin_toaddr_Check();" onchange="Jumin_toaddr_Check();" onFocus="Jumin_toaddr_Check();" maxlength="4"> - 
							<input id="jumin_hp3" name="jumin_hp3" type="text" class="input_form1" style="width:30px" style="ime-mode:disabled" onKeyPress="nr_num_int(this);" onKeyUp="nr_num_int(this); count_check(this, jumin_hp3, 4); Jumin_toaddr_Check();" onclick="Jumin_toaddr_Check();" onchange="Jumin_toaddr_Check();" onFocus="Jumin_toaddr_Check();" maxlength="4">
						</td>
				  	</tr>
				  	<tr>
						<td height="34px" colspan="4" align="left" bgcolor="#FFFFFF" class="">
							<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
								<tr>
								  <td><span class="sub_stan_blue">* 우편물 송달지</span> : </td>
								  <td width="16px">
								  	<input id="ADDR_CHECK" name="ADDR_CHECK" type="checkbox" value="1" onclick="Jumin_toaddr_Check();" onchange="Jumin_toaddr_Check();" onFocus="Jumin_toaddr_Check();" checked="checked"></td>
								  <td width="110px">점용인 정보와 동일 </td>
								</tr>
							</table>
						</td>
				  	</tr>
				  	<tr>
						<td height="26px" align="center" bgcolor="e5eff8" class="sub_table_b">우편물 수령인 </td>
						<td colspan="3" bgcolor="eaeaea" class="table_bl_left">
							<input id="TONM" name="TONM" type="text" class="essential" style="width:250px" onclick="Jumin_toaddr_Check();" onchange="Jumin_toaddr_Check();" onFocus="Jumin_toaddr_Check();" value="${TONM}">
						</td>
				  	</tr>
				  	
				  	<!--  //********** BEGIN_현진_20120215 -->
					<!-- 
					<tr>
						<td height="26px" align="center" bgcolor="e5eff8" class="sub_table_b">우편번호</td>
						<td colspan="3" bgcolor="eaeaea" class="table_bl_left">
							<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
								<tr>
								  <td><input id="TOPOST" name="TOPOST" type="text" class="essential" style="width:50px" onClick="Jumin_toaddr_Check();" onChange="Jumin_toaddr_Check();" onFocus="Jumin_toaddr_Check();" onKeyUp="Jumin_toaddr_Check();" value="${TOPOST}" readonly></td>
								  <td><a href="javascript:openZipcodePopup_new('form.TOPOST', 'form.TOADDR1', 'form.TOADDR1_NEW', 'form.TOSI', 'form.TOGUN', 'form.TO_DORO_NM', 'form.TO_BD_NM');"><img src="/img/search_icon.gif" alt="검색" width="56" height="18" border="0"></a></td>
									<input id="TOSI" name="TOBU" type="hidden" >
									<input id="TOGUN" name="TOBU" type="hidden" >
									<input id="TO_DORO_NM" name="TOBU" type="hidden" >
									<input id="TO_BD_NM" name="TOBU" type="hidden" >
									<input id="TO_BD_DET_NM" name="TOBU" type="hidden" >
									<input id="TO_BD_BON" name="TOBU" type="hidden" >
									<input id="TO_BD_BU" name="TOBU" type="hidden" >
								</tr>
							</table>
						</td>						
				  	</tr>
					 -->					
				  	<tr>
						<td height="26px" align="center" bgcolor="e5eff8" class="sub_table_b">우편번호</td>
						<td colspan="3" bgcolor="eaeaea" class="table_bl_left">
							<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
								<tr>
								  	<td width="50px"><input id="TOPOST" name="TOPOST" type="text" class="essential" style="width:50px" onClick="Jumin_toaddr_Check();" onChange="Jumin_toaddr_Check();" onFocus="Jumin_toaddr_Check();" onKeyUp="Jumin_toaddr_Check();" value="${TOPOST}" readonly></td>
								  	<td width="50px"><a href="javascript:openZipcodePopup_new('form.TOPOST', 'form.TOADDR1', 'form.TOADDR1_NEW', 'form.TOSI', 'form.TOGUN', 'form.TO_DORO_NM', 'form.TO_BD_NM','form.TODONG','form.TOBON', 'form.TOBU' );"><img src="/img/search_icon.gif" alt="검색" width="56" height="18" border="0"></a></td>
									<td align="right"><a href="javascript:addrConfirm('TOPOST','TOSI','TOGUN','TODONG','TO_DORO_NM','TOBON','TOBU','TO_BD_BON','TO_BD_BU','TO_BD_NM','TO_BD_DET_NM','TOADDR1','TOADDR2','TOADDR1_NEW','form')"><img src="/img/ok_icon.gif" alt="확인" width="56" height="18" border="0"></a></td>								  
									<!--  sungh83 20131105 -->
									<td><span class="sub_table_b">%도로명주소의 건물본번,부번을 입력하시려면 확인버튼을 클릭하시오</span></td>
							      	<!--  sungh83 20131105 --> 
								</tr>
							</table>
						</td>						
				  	</tr>
				  	<!--   //********** END_현진_20120215 -->
				  	<!-- 송달지 주소 -->
				  	<tr>
						<td align="center" bgcolor="e5eff8" class="sub_table_b">송달지 주소</td>
						<td bgcolor="eaeaea" class="table_bl_left">
							<input id="TOADDR1" name="TOADDR1" type="text" class="essential" style="width:250px" value="${TOADDR1}" onClick="Jumin_toaddr_Check();" onChange="Jumin_toaddr_Check();" onFocus="Jumin_toaddr_Check();" onKeyUp="Jumin_toaddr_Check();" readonly>
							산<input id="TOSAN" name="TOSAN" type="checkbox" style="vertical-align: middle;" onClick="Jumin_toaddr_Check();" onChange="Jumin_toaddr_Check();" onFocus="Jumin_toaddr_Check();" onKeyUp="Jumin_toaddr_Check();">
							<input id="TOBON" name="TOBON" type="text" class="essential" style="width:25px" onClick="Jumin_toaddr_Check();" onChange="Jumin_toaddr_Check();" onFocus="Jumin_toaddr_Check();" onKeyUp="Jumin_toaddr_Check();" value="${APPEAL_TOBON}">
							-
							<input id="TOBU" name="TOBU" type="text" class="input_form1" style="width:25px" onClick="Jumin_toaddr_Check();" onChange="Jumin_toaddr_Check();" onFocus="Jumin_toaddr_Check();" onKeyUp="Jumin_toaddr_Check();" value="${APPEAL_TOBU}" >
							<input id="TOADDR2" name="TOADDR2" type="text" class="input_form1" style="width:135px" onClick="Jumin_toaddr_Check();" onChange="Jumin_toaddr_Check();" onFocus="Jumin_toaddr_Check();" onKeyUp="Jumin_toaddr_Check();" value="${TOADDR2}"  maxlength="50">
						</td>
					<!-- 송달지 도로명주소 -->
						<td align="center" bgcolor="e5eff8" class="sub_table_b">송달지 도로명주소</td>
						<td bgcolor="eaeaea" class="table_bl_left">
							<!--  //********** BEGIN_현진_20120215 -->
							<!-- 
								<input id="TOADDR1_NEW" name="TOADDR1_NEW" type="text" class="essential" style="width:250px" value="${TOADDR1}" onClick="Jumin_toaddr_Check();" onChange="Jumin_toaddr_Check();" onFocus="Jumin_toaddr_Check();" onKeyUp="Jumin_toaddr_Check();" readonly>
							<input id="TOBON_NEW" name="TOBON_NEW" type="text" class="essential" style="width:25px" onClick="Jumin_toaddr_Check();" onChange="Jumin_toaddr_Check();" onFocus="Jumin_toaddr_Check();" onKeyUp="Jumin_toaddr_Check();" value="${APPEAL_TOBON}">
							-
							<input id="TOBU_NEW" name="TOBU_NEW" type="text" class="input_form1" style="width:25px" onClick="Jumin_toaddr_Check();" onChange="Jumin_toaddr_Check();" onFocus="Jumin_toaddr_Check();" onKeyUp="Jumin_toaddr_Check();" value="${APPEAL_TOBU}" >
							<input id="TOADDR2_NEW" name="TOADDR2_NEW" type="text" class="input_form1" style="width:135px" onClick="Jumin_toaddr_Check();" onChange="Jumin_toaddr_Check();" onFocus="Jumin_toaddr_Check();" onKeyUp="Jumin_toaddr_Check();" value="${TOADDR2}"  maxlength="50">
							 -->
							<input id="TOSI" name="TOSI" type="hidden" >
							<input id="TOGUN" name="TOGUN" type="hidden" >
							<input id="TO_DORO_NM" name="TO_DORO_NM" type="hidden" >
							<input type="hidden" id="TODONG" name="TODONG">
							<!--   //********** END_현진_20120215 -->
							<input id="TOADDR1_NEW" name="TOADDR1_NEW" type="text" class="essential" style="width:250px" value="${TOADDR1}" onClick="Jumin_toaddr_Check();" onChange="Jumin_toaddr_Check();" onFocus="Jumin_toaddr_Check();" onKeyUp="Jumin_toaddr_Check();" readonly>
							<input id="TO_BD_BON" name="TO_BD_BON" type="text" class="essential" style="width:25px" onClick="Jumin_toaddr_Check();" onChange="Jumin_toaddr_Check();" onFocus="Jumin_toaddr_Check();" onKeyUp="Jumin_toaddr_Check();">
							-
							<input id="TO_BD_BU" name="TO_BD_BU" type="text" class="input_form1" style="width:25px" onClick="Jumin_toaddr_Check();" onChange="Jumin_toaddr_Check();" onFocus="Jumin_toaddr_Check();" onKeyUp="Jumin_toaddr_Check();">							
							<input id="TO_BD_NM" name="TO_BD_NM" type="text" class="input_form1" style="width:135px" onClick="Jumin_toaddr_Check();" onChange="Jumin_toaddr_Check();" onFocus="Jumin_toaddr_Check();" onKeyUp="Jumin_toaddr_Check();"  maxlength="50">
							<input id="TO_BD_DET_NM" name="TO_BD_DET_NM" type="text" class="input_form1" style="width:214px" onClick="Jumin_toaddr_Check();" onChange="Jumin_toaddr_Check();" onFocus="Jumin_toaddr_Check();" onKeyUp="Jumin_toaddr_Check();"  maxlength="50">
						</td>
						
				  	</tr>
				  	<tr>
						<td height="26px" align="center" bgcolor="e5eff8" class="sub_table_b">e-mail</td>
						<td bgcolor="eaeaea" class="table_bl_left" colspan="3">
							<input id="TOMAIL" name="TOMAIL" type="text" class="input_form1" style="width:250px" value="${TOEMAIL}"  onKeyUp="Jumin_toaddr_Check();" onclick="Jumin_toaddr_Check();" onchange="Jumin_toaddr_Check();" onFocus="Jumin_toaddr_Check();" style="ime-mode:disabled"  maxlength="50">
						</td>
				  	</tr>
				  	<tr>
						<td height="26px" align="center" bgcolor="e5eff8" class="sub_table_b">전화번호</td>
						<td bgcolor="eaeaea" class="table_bl_left">
							<input id="jumin_totel1" name="jumin_totel1" type="text" class="input_form1" style="width:25px" style="ime-mode:disabled" onKeyPress="nr_num_int(this);" onKeyUp="count_check(this, jumin_totel2, 3);" maxlength="3" onclick="Jumin_toaddr_Check();" onchange="Jumin_toaddr_Check();" onFocus="Jumin_toaddr_Check();"> - 
							<input id="jumin_totel2" name="jumin_totel2" type="text" class="input_form1" style="width:30px" style="ime-mode:disabled" onKeyPress="nr_num_int(this);" onKeyUp="count_check(this, jumin_totel3, 4);" maxlength="4" onclick="Jumin_toaddr_Check();" onchange="Jumin_toaddr_Check();" onFocus="Jumin_toaddr_Check();"> - 
							<input id="jumin_totel3" name="jumin_totel3" type="text" class="input_form1" style="width:30px" style="ime-mode:disabled" onKeyPress="nr_num_int(this);" onKeyUp="count_check(this, jumin_totel3, 4);" maxlength="4" onclick="Jumin_toaddr_Check();" onchange="Jumin_toaddr_Check();" onFocus="Jumin_toaddr_Check();">
						</td>
						<td align="center" bgcolor="e5eff8" class="sub_table_b">휴대전화</td>
						<td bgcolor="eaeaea" class="table_bl_left">
							<input id="jumin_tohp1" name="jumin_tohp1" type="text" class="input_form1" style="width:25px" style="ime-mode:disabled" onKeyPress="nr_num_int(this);" onKeyUp="count_check(this, jumin_tohp2, 3);" maxlength="3" onclick="Jumin_toaddr_Check();" onchange="Jumin_toaddr_Check();" onFocus="Jumin_toaddr_Check();"> - 
							<input id="jumin_tohp2" name="jumin_tohp2" type="text" class="input_form1" style="width:30px" style="ime-mode:disabled" onKeyPress="nr_num_int(this);" onKeyUp="count_check(this, jumin_tohp3, 4);" maxlength="4" onclick="Jumin_toaddr_Check();" onchange="Jumin_toaddr_Check();" onFocus="Jumin_toaddr_Check();"> - 
							<input id="jumin_tohp3" name="jumin_tohp3" type="text" class="input_form1" style="width:30px" style="ime-mode:disabled" onKeyPress="nr_num_int(this);" onKeyUp="count_check(this, jumin_tohp3, 4);" maxlength="4" onclick="Jumin_toaddr_Check();" onchange="Jumin_toaddr_Check();" onFocus="Jumin_toaddr_Check();">
						</td>
				  	</tr>
				  
				    <tr>
					  	<td height="26px" align="center" bgcolor="e5eff8" class="sub_table_b">비고</td>
						<td colspan="3" bgcolor="eaeaea" class="table_bl_left">
							<table width="100%" border="0" cellpadding="0" cellspacing="0" class="sub_stan">
								<textarea id="APPEAL_REFERENCE" name="APPEAL_REFERENCE" type="text" class="input_form1" style="width:98%" value="${APPEAL_REFERENCE}" maxlength="500"></textarea>
							</table>
						</td>
				    </tr>
                  	</table>
                  	</td>
				  	</tr>

				</table>
			</div>
			
			<div class="tabcontent" style="display:none">
				<table width="100%" border="0" cellspacing="0" cellpadding="0">
				<tr>
	                <td><table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0" class="sub_table">

					<tr>
						<td width="14%" height="26px" align="center" bgcolor="e5eff8" class="sub_table_b" nowrap="nowrap">점용종류</td>
						<td width="36%" bgcolor="eaeaea" class="table_bl_left" nowrap="nowrap">
							<select id="TYPE" name="TYPE" class="essential" style="width:70px" OnChange="Select_UseType(this);">
								${use_type}
							</select>
						</td>
						<td width="14%" align="center" bgcolor="e5eff8" class="sub_table_b" nowrap="nowrap">점용구분</td>
						<td width="36%" bgcolor="eaeaea" class="table_bl_left" nowrap="nowrap">
							<select id="SECTION" name="SECTION" class="essential" style="width:70px" OnChange="Select_UseSection(this);">
								${occupancy_type}
							</select>
						</td>
					</tr>
					
					<tr>
					  	<td height="26px" align="center" bgcolor="e5eff8" class="sub_table_b">소유자</td>
					  	<td bgcolor="eaeaea" class="table_bl_left"><select id="OWNER_SET" name="OWNER_SET" class="essential" style="width:70px">
							${use_owner_Group}
					  	</select></td>
					  	<td align="center" bgcolor="e5eff8" class="sub_table_b">세입구분</td>
					  	<td bgcolor="eaeaea" class="table_bl_left"><select id="TAX_SET" name="TAX_SET" class="essential" style="width:70px">
							${taxation_section}
					  	</select>
					  	</td>
					</tr>
					
					<tr>
					  	<td height="26px" align="center" bgcolor="e5eff8" class="sub_table_b">우편번호</td>
					  	<td bgcolor="eaeaea" class="table_bl_left">
						  	<input id="MUL_POST" name="MUL_POST" type="text" class="essential" style="width:50px" value="${MUL_POST}" maxlength="6" onblur="javascript:isPostNum(this);">
<!-- 점용지 도로명주소 추가 (파라메터 수정) #mr-->							  	
						  	<!-- <img src="/img/search_icon.gif" alt="검색" width="56" height="18" border="0" onclick="javascript:openZipcodePopup_new('form.MUL_POST','','','','','','','','','');" style="cursor: pointer; vertical-align: middle;">-->
						  	<img src="/img/search_icon.gif" alt="검색" width="56" height="18" border="0" onclick="javascript:openZipcodePopup_new('form.MUL_POST', '', 'form.JYADDR_NEW', '', '', '', '','','', '');" style="cursor: pointer; vertical-align: middle;">
					  	</td>
					  	<td align="center" bgcolor="e5eff8" class="sub_table_b">건물(명) 정보 </td>
					  	<td bgcolor="eaeaea" class="table_bl_left">
					  		<input id="BD_NM" name="BD_NM" type="text" class="input_form1" style="width:120px" value="${BD_NM}"  maxlength="25">
							<input id="BD_DONG" name="BD_DONG" type="text" class="input_form1" style="width:30px" value="${BD_DONG}" style="ime-mode:disabled" onKeyDown="nr_num_int(this);" onKeyUp="nr_num_int(this);" onKeyPress="nr_num_int(this);"  maxlength="4">동 
							<input id="BD_HO" name="BD_HO" type="text" class="input_form1" style="width:30px" value="${BD_HO}" style="ime-mode:disabled" onKeyDown="nr_num_int(this);" onKeyUp="nr_num_int(this);" onKeyPress="nr_num_int(this);"  maxlength="4">호 
						</td>
					</tr>
<!-- 점용지 도로명주소 추가 #mr-->
					<tr>
						<td height="26px" align="center" bgcolor="e5eff8" class="sub_table_b">점용지도로명주소</td>
						<td colspan="3" bgcolor="eaeaea" class="table_bl_left">
							<input id="JYADDR_NEW" name="JYADDR_NEW" type="text" class="essential" style="width:250px" onclick="javascript:openZipcodePopup_new('form.MUL_POST', '', 'form.JYADDR_NEW', '', '', '', '','','', '');" maxlength="120">
							<input id="JYADDR_BON" name="JYADDR_BON" type="text" class="essential" style="width:25px"/>
							-<input id="JYADDR_BU" name="JYADDR_BU" type="text" class="essential" style="width:25px"/>
							<br><font color="blue">* 팝업창에서 도로명 주소로 검색 후 해당 도로명 주소를 선택</font>
						</td>
					</tr>					
<!-- #mr -->						
					<tr>
					  	<td height="26px" align="center" bgcolor="e5eff8" class="sub_table_b">점용지지번</td>
					  	<td colspan="3" bgcolor="eaeaea" class="table_bl_left">
						${GU_NM}&nbsp;
					  	<select id="BJ_CD" name="BJ_CD" class="essential" style="width:80px">
				        	${bjdong_code}
				        </select>
				        <select id="HJ_CD" name="HJ_CD" class="essential" style="width:80px">
			            	${hjdong_code}
			            </select>
			            <select id="SPC_CD" name="SPC_CD" class="essential" style="width:75px">
			            	${mul_spc_cd}
			            </select>
			            <input id="BONBUN" name="BONBUN" value="${BONBUN}" type="text" class="essential" style="width:40px" style="ime-mode:disabled" onKeyDown="nr_num_int(this);" onKeyUp="nr_num_int(this);" onKeyPress="nr_num_int(this);" maxlength="4">
						- <input id="BUBUN" name="BUBUN" value="${BUBUN}" type="text" class="input_form1" style="width:40px" style="ime-mode:disabled" onKeyDown="nr_num_int(this);" onKeyUp="nr_num_int(this);" onKeyPress="nr_num_int(this);" maxlength="4">
						번지 <input id="TONG" name="TONG" value="${TONG}" type="text" class="input_form1" style="width:30px" style="ime-mode:disabled" onKeyDown="nr_num_int(this);" onKeyUp="nr_num_int(this);" onKeyPress="nr_num_int(this);" maxlength="2">
						통 <input id="BAN" name="BAN" value="${BAN}" type="text" class="input_form1" style="width:30px" style="ime-mode:disabled" onKeyDown="nr_num_int(this);" onKeyUp="nr_num_int(this);" onKeyPress="nr_num_int(this);" maxlength="2"> 
						반
						<img src="/img/loca_icon.gif" alt="위치확인" id="LocReg" width="64" height="18" border="0" onClick="javascript:goViewJibunMap('with');" style="vertical-align: middle;CURSOR:pointer;">
						</td>
					</tr>
	                <tr> 
	                  	<td height="26px" align="center" bgcolor="e5eff8" class="sub_table_b">도로(하천)지번<br/></td>
	                  	<td bgcolor="eaeaea" class="table_bl_left" id="doroname" colspan="3">
							<input id="ROAD_ADDR" name="ROAD_ADDR" type="text" class="input_form1" style="width:60px" value="${ROAD_ADDR}" maxlength="12">
							<input id="ROAD_BON" name="ROAD_BON" type="text" class="essential" style="width:40px" style="ime-mode:disabled" onKeyDown="nr_num_int(this);" onKeyUp="nr_num_int(this);" onKeyPress="nr_num_int(this);" maxlength="4">
						  - <input id="ROAD_BU" name="ROAD_BU" type="text" class="input_form1" style="width:40px" style="ime-mode:disabled" onKeyDown="nr_num_int(this);" onKeyUp="nr_num_int(this);" onKeyPress="nr_num_int(this);" maxlength="4">
						  <img src="/img/loca_icon.gif" alt="위치확인" id="LocReg" width="64" height="18" border="0" onClick="javascript:goViewJibunMap('road');" style="vertical-align: middle;CURSOR:pointer;">
						 </td>
	       			  	<td width="100px" height="26" align="center" bgcolor="e5eff8" class="" id="jucha" style="display:none">
					  		<input id="USERTYPENAME" name="USERTYPENAME" type="text" style="width:95px" class="viewcol" value="주차면수">
					  	</td>
					  	<td colspan="0" bgcolor="F6F6F6" class="table_bl_left" id="jucha_value" style="display:none">
		       			  	<span id="UseType1" style="display:none">
			                	<input id="PARKING_NUM" name="PARKING_NUM" type="text" class="input_form1" style="width:40px" value="${PARKING_NUM}" style="ime-mode:disabled" onKeyDown="nr_num_int(this);" onKeyUp="nr_num_int(this);" onKeyPress="nr_num_int(this);"  maxlength="4"> 면
		                  	</span>
		       			  	<span id="UseType2" style="display:none">
			                  	<input id="RIVER_NM" name="RIVER_NM" type="text" class="essential" style="width:100px" value="${RIVER_NM}" maxlength="6">
		                  	</span>
		                  	<span id="UseType3" style="display:none;">
								<input id="RIVER_RANK" name="RIVER_RANK" type="text" class="essential" style="width:100px" value="${RIVER_RANK}" maxlength="3">
							</span>
	                  	</td>
	                </tr>
	                <tr>
					  <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b" colspan="1">공시지가<br>적용지번</td>
					  <td bgcolor="eaeaea" class="table_bl_left">
						  <select id="WITH_GU_CD" name="WITH_GU_CD" class="input_form1" style="width:80px" onchange="changeWithGuCd(this);">
					      	${sigungu_code}
					      </select>
						  <select id="WITH_BJ_CD" name="WITH_BJ_CD" class="input_form1" style="width:80px">
					      	${bjdong_code}
					      </select>
				          <select id="WITH_SPC_CD" name="WITH_SPC_CD" class="input_form1" style="width:75px">
				          	${mul_spc_cd}
				          </select>
				          <p style="font-size: 8px"></p>
				          <input id="WITH_BONBUN" name="WITH_BONBUN" value="" type="text" class="input_form1" style="width:30px" style="ime-mode:disabled" onKeyDown="nr_num_int(this);" onKeyUp="nr_num_int(this);" onKeyPress="nr_num_int(this);" maxlength="4">
						  - <input id="WITH_BUBUN" name="WITH_BUBUN" value="" type="text" class="input_form1" style="width:30px" style="ime-mode:disabled" onKeyDown="nr_num_int(this);" onKeyUp="nr_num_int(this);" onKeyPress="nr_num_int(this);" maxlength="4">
						  번지
						  <img src="/img/add_icon.gif" alt="추가" width="56" height="18" border="0" onclick="javascript:addWithAddrList();" style="CURSOR: Hand;vertical-align: middle;">
						  <img src="/img/loca_icon.gif" alt="위치확인" id="LocReg" width="64" height="18" border="0" onClick="javascript:goViewJibunMap('price');" style="vertical-align: middle;CURSOR:pointer;">
					  </td>						  
					  <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b" colspan="1">공시지가<br>적용지번<br>목록</td>
					  <td bgcolor="eaeaea" class="table_bl_left">
						  <div style="height: 60px;overflow-y:scroll;overflow-x:none;">
						  <table width="90%">
						  <tbody id="WITH_ADDR_LIST" >
						  </tbody>
						  </table>
						  </div>
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
						<td id="MUL" bgcolor="eaeaea" class="table_bl_left" colspan="3">
					  		<div id="MUL_DIV">
					  			<table id="MUL_TABLE" border="0" cellpadding="0" cellspacing="0" class="sub_stan">
									<tr id="MulDateSection">
										<td id="UseSection" style="display:block">
										  	<input id="MUL_FROMDATE" name="MUL_FROMDATE" type="text" class="essential" style="width:70px" value="${MUL_FROMDATE}" readonly><img onclick="popUpCalendar(this, document.getElementById('MUL_FROMDATE'), 'yyyymmdd')" src="/img/calendar_icon.gif" width="19" height="16" border="0" align="absmiddle" style="vertical-align:middle;CURSOR: pointer ;">
										  	 ~ <input id="MUL_TODATE" name="MUL_TODATE" type="text" class="essential" style="width:70px" value="${MUL_TODATE}"  readonly><img onclick="popUpCalendar(this, document.getElementById('MUL_TODATE'), 'yyyymmdd')" src="/img/calendar_icon.gif" width="19" height="16" border="0" align="absmiddle" style="vertical-align:middle;CURSOR: pointer;">
										</td>
		  						    </tr>
								</table>
							</div>
						</td>
						
					</tr>
					<tr>
						<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">점용면적</td>
					  	<td height="26" bgcolor="eaeaea" class="table_bl_left" colspan="3">
							<input id="AREA_SIZE" name="AREA_SIZE" type="text" class="essential" style="width:50px" value="${AREA_SIZE}" style="ime-mode:disabled" onKeyDown="nr_num_float(this);" onKeyUp="nr_num_float(this);" onKeyPress="nr_num_float(this);" maxlength="17"> m / ㎡ / 개
						</td>
					</tr>
					<tr>
						<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">지분율</td>
					  	<td bgcolor="eaeaea" class="table_bl_left">
							<input id="PERCENT_RATE" name="PERCENT_RATE" type="text" class="input_form1" style="width:50px;text-align:right" value="${PERCENT_RATE}" onKeyDown="nr_num_float(this);" onKeyUp="nr_num_float(this);" onKeyPress="nr_num_float(this);" maxlength="6">%
						</td>
					  	<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">지분율 사유</td>
					  	<td bgcolor="eaeaea" class="table_bl_left">
					  		<input id="PERCENT_REASON" name="PERCENT_REASON" type="text" class="input_form1" style="width:250px" value="${PERCENT_REASON}" maxlength="200">
						</td>
					</tr>
					<tr>
						<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">감면율</td>
					  	<td bgcolor="eaeaea" class="table_bl_left">
							<input id="REDUCTION_RATE" name="REDUCTION_RATE" type="text" class="input_form1" style="width:50px;text-align:right" value="${REDUCTION_RATE}" onKeyDown="nr_num_float(this);" onKeyUp="nr_num_float(this);" onKeyPress="nr_num_float(this);" maxlength="6">%
						</td>
					  	<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">감면율 사유</td>
					  	<td bgcolor="eaeaea" class="table_bl_left">
					  		<input id="REDUCTION_REASON" name="REDUCTION_REASON" type="text" class="input_form1" style="width:250px" value="${REDUCTION_REASON}" maxlength="200">
						</td>
					</tr>
					<tr>
					  	<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">비고</td>
						<td colspan="3" bgcolor="eaeaea" class="table_bl_left">
							<table width="100%" border="0" cellpadding="0" cellspacing="0" class="sub_stan">
								<textarea id="PLACE_REFERENCE" name="PLACE_REFERENCE" type="text" class="input_form1" style="width:98%" value="${PLACE_REFERENCE}" maxlength="500"></textarea>
							</table>
						</td>
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
						  	<td><input id="WORK_FROMDATE" name="WORK_FROMDATE" value="${WORK_FROMDATE}" type="text" class="input_form1" style="width:65px" readonly></td>
						  	<td><a><img src="/img/calendar_icon.gif" width="19" height="16" border="0" onclick="popUpCalendar(this, document.getElementById('WORK_FROMDATE'), 'yyyymmdd')" style="CURSOR: Hand;"></a></td>
						  	<td width="16" align="center">~</td>
						  	<td><input id="WORK_TODATE" name="WORK_TODATE" value="${WORK_TODATE}" type="text" class="input_form1" style="width:65px" readonly></td>
						  	<td><a><img src="/img/calendar_icon.gif" width="19" height="16" border="0" onclick="popUpCalendar(this, document.getElementById('WORK_TODATE'), 'yyyymmdd')" style="CURSOR: Hand;"></a></td>
							</tr>
					  	</table></td>
				    </tr>
				    
					<tr>
					  	<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">공사내용</td>
							<td colspan="3" bgcolor="eaeaea" class="table_bl_left"><table width="100%" border="0" cellpadding="0" cellspacing="0" class="sub_stan">
								<input id="EXE_INFO" name="EXE_INFO" type="text" class="input_form1" style="width:98%" value="${EXE_INFO}"  maxlength="100">
						</table></td>
				    </tr>
                </table></td>
				</tr>

				</table>
			</div>
			
		</div>
		
		</td>
		</tr>
 	
	</table></td>
	</tr>

</table>
</form>

</body>
</html>