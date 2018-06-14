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

			parent.iFrameResizeTab("tab1");	//	화면 RESIZE
		}
		return true;
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
	
	function	Jumin_toaddr_Check()
	{
		var form 		=	document.form;
	   var 	chk			=	form.ADDR_CHECK.checked;

		if(chk	== true)
		{
			form.TO_POST.value		= 	form.BON_POST.value;
			form.TO_ADDR1.value		= 	form.BON_ADDR1.value;
			form.TO_ADDR2.value		= 	form.BON_ADDR2.value;
			form.ADDR_CHECK.value	=	"1";
		}
		else
		{
			form.TO_POST.value		=	"";
			form.TO_ADDR1.value		=	"";
			form.TO_ADDR2.value		=	"";
			form.ADDR_CHECK.value	=	"0";
		}
	}
	
	function	Jumin_toaddr_Check2()
	{
		var form 		=	document.form;
		var	chk			=	form.ADDR_CHECK.checked;
		var addr_check 	=	document.getElementById("ADDR_CHECK");
		
		if(chk	== true)
		{
			form.TO_POST.value		=	form.BON_POST.value;
			form.TO_ADDR1.value		=	form.BON_ADDR1.value;
			form.TO_ADDR2.value		=	form.BON_ADDR2.value;
			form.ADDR_CHECK.value	=	"1";
		}
	}
	
	function	Select_UseType(sel)
	{
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
		if(sel.value == '2')
			document.getElementById("UseSection").style.display = "block";	//	정기
		else
			document.getElementById("UseSection").style.display = "none";

		parent.iFrameResizeTab("tab1");	//	화면 RESIZE
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

	//삽입시작 2009.06.04 전승원
	function 	openCorpcodePopup(corpNm, office, corpCd)	//corpNm : 법인명, office : 지점명, corpCd : 코드값
	{
		var	office1	= corpNm;
		var	jijum1	= office;
		var	code1	= corpCd;
		
		var url 	= "/corpcode.do?openerCorpNm=" + office1 + "&openerOffice=" + jijum1 + "&openerCorpCd=" + code1;
		var winName = "점용업체입력";
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
	
	//삽입시작 2009.07.06 전승원
	function 	minusFacilityPopup(corp_cd, gu_code, purpose_cd)	//corp_cd : 법인명, gu_code : 지점명, purpose_cd : 코드값
	{
		var	corp_cd	= corp_cd;
		var	gu_code	= gu_code;
		var	purpose_cd	= purpose_cd;
		
		var url 	= "/corpcode.do?corp_cd=" + corp_cd + "&gu_code=" + gu_code + "&purpose_cd=" + purpose_cd;
		var winName = "점용업체입력";
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
	
	
	//삽입종료 2009.06.04 전승원
	
	function	DataCheck()
	{
		var form 	= document.form;
		var	str		= "";
		var tabs = document.getElementById('tabmenu');
		var tab = tabs.getElementsByTagName('a'); // 탭 요소
		var contents = document.getElementById('tabcontents');
		var content = getElementsByClassName('tabcontent',contents); // 컨텐츠 요소 class
		//********** BEGIN_KANG_20120409
		/*
		if(form.NAME.value.length	< 1)	//	점용인 정보
		{
			str	+= "점용인(법인명)을 입력하세요\n";
			alert(str);
			tabDisplay(tab,content,1);
			
			openCorpcodePopup('form.NAME','form.OFFICE','form.CORP_CD');

		}
		else if(form.jumin_ssn1.value.length	< 6)
		{
			str	+= "주민(법인)번호가 입력되지 않았거나\n자리수가 틀립니다.";	
			alert(str);
			tabDisplay(tab,content,1);
			form.jumin_ssn1.focus();
		}
		else if(form.jumin_ssn2.value.length	< 7)
		{
			str	+= "주민(법인)번호가 입력되지 않았거나\n자리수가 틀립니다.";	
			alert(str);
			tabDisplay(tab,content,1);
			form.jumin_ssn2.focus();
		}
		else if(form.BON_POST.value.length	< 1){
			str	+= "점용인 우편번호를 입력하세요\n";
			alert(str);
			tabDisplay(tab,content,1);
			//form.BON_POST.focus();
			openZipcodePopup('form.BON_POST', 'form.BON_ADDR1');
		}
		*/
		if(form.NAME.value.length	< 1)	//	점용인 정보
		{
			str	+= "점용인(법인명)을 입력하세요\n 하단에 기존점용정보에서 선택을 누르면 입력됩니다.";
			alert(str);
			tabDisplay(tab,content,1);
		}
		//********** END_KANG_20120409
//		else if(form.BON_ADDR2.value.length	< 1){
//			str	+= "점용인 상세 주소를 입력하세요\n";
//			alert(str);
//			tabDisplay(tab,content,1);
//			form.BON_ADDR2.focus();
//		}
		else if(form.XMLDATA.value.length < 10)
		{
			str	+= "시설물 정보는 1개이상 등록해야 합니다.\n";
			alert(str);
			tabDisplay(tab,content,2);
			Sisul_Click();
			form.OWNER_SET.focus();
		}
		
		if(str	== "")
		{
			return	true;
		}
		
		return	false;
	}
	
	