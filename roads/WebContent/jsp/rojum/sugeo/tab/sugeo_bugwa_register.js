

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

//		document.getElementById('NOWTAB').value	= num;
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
	
	// 과태료 저장
	function	RegisterPrc_bugwa()
	{
	
		var form = document.form;
		if( form.mul_no.value == '' ){
			alert("수거정보를 먼저 입력해주세요. ");
			return;
		}
		
		var	result	= DataCheck1();
		if(result	==	false)
			return false;	
		
		form.action = "sugeo_bugwa_registerprc.do";
		form.submit();
	}
	
	// 폐기/매각 저장
	function	RegisterPrc_sale()
	{
	
		var form = document.form;		
		if( form.mul_no.value == '' ){
			alert("수거정보를 먼저 입력해주세요. ");
			return;
		}
		
		var	result	= DataCheck2();
		if(result	==	false)
			return false;		
		
		top.frames[1].location="/jsp/menu/left/gapan.jsp?MENU_PARAM=sugeo";	//왼쪽 메뉴 링크
		top.frames[2].location="/gapan/sugeo/search.do";		//오른쪽 페이지 링크
		form.action = "sugeo_sale_registerprc.do";
		form.submit();
	}
	
	// 과태료 수정
	function goModify_fine(mul_no){
		
		var	result1	= DataCheck1();

		if(result1	==	false)
			return;
		
		var form = document.form;
		
		form.action = "sugeo_fine_modify.do?mul_no="+mul_no;
		form.submit();
	
	
	}
	
	// 폐기/매각  수정
	function goModify_sale(mul_no){
		
		var	result2	= DataCheck2();

		if(result2	==	false)
			return;
		
		var form = document.form;
		
		form.action = "sugeo_sale_modify.do?mul_no="+mul_no;
		form.submit();
	
	
	}

	function	Search()
	{
		var form = document.form;

		form.action = "search.do";
		form.submit();
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

	function	DataCheck1()
	{
		var form 	= document.form;
		var	str		= "";
		
		var tabs = document.getElementById('tabmenu');
		var tab = tabs.getElementsByTagName('a'); // 탭 요소
		var contents = document.getElementById('tabcontents');
		var content = getElementsByClassName('tabcontent',contents); // 컨텐츠 요소 class

		// 과태료부과 tab1
		if(form.owner_nm.value.length < 1)
		{
			str	+= "소유자명을 입력하세요. ";
			alert(str);
			tabDisplay(tab,content,0);
			form.owner_nm.focus();
		}
		else if(form.owner_ssn1.value.length < 1 || form.owner_ssn1.value.length < 6)
		{
			str	+= "주민등록번호를 입력하세요.";
			alert(str);
			tabDisplay(tab,content,0);
			form.owner_ssn1.focus();
		}
		else if(form.owner_ssn2.value.length < 1 || form.owner_ssn2.value.length < 7)
		{
			str	+= "주민등록번호를 입력하세요.";
			alert(str);
			tabDisplay(tab,content,0);
			form.owner_ssn2.focus();
		}
		else if(form.owner_zip.value.length	< 1)
		{
			str	+= "우편번호를 입력하세요. ";
			alert(str);
			tabDisplay(tab,content,0);
			form.owner_zip.focus();
		}
		else if(form.owner_zip_addr1.value.length	< 1)
		{
			str	+= "주소를 입력하세요. ";
			alert(str);
			tabDisplay(tab,content,0);
			form.owner_zip_addr1.focus();
		}
		else if(form.owner_zip_addr2.value.length	< 1)
		{
			str	+= "주소를 입력하세요. ";
			alert(str);
			tabDisplay(tab,content,0);
			form.owner_zip_addr2.focus();
		}
		else if(form.owner_tel1.value.length	< 1)
		{
			str	+= "전화번호를 입력하세요. ";
			alert(str);
			tabDisplay(tab,content,0);
			form.owner_tel1.focus();
		}
		else if(form.owner_tel2.value.length	< 1)
		{
			str	+= "전화번호를 입력하세요. ";
			alert(str);
			tabDisplay(tab,content,0);
			form.owner_tel2.focus();
		}
		else if(form.owner_tel3.value.length	< 1)
		{
			str	+= "전화번호를 입력하세요. ";
			alert(str);
			tabDisplay(tab,content,0);
			form.owner_tel3.focus();
		}
		else if(form.owner_hp1.value.length	< 1)
		{
			str	+= "휴대전화번호를 입력하세요. ";
			alert(str);
			tabDisplay(tab,content,0);
			form.owner_hp1.focus();
		}
		else if(form.owner_hp2.value.length	< 1)
		{
			str	+= "휴대전화번호를 입력하세요. ";
			alert(str);
			tabDisplay(tab,content,0);
			form.owner_hp2.focus();
		}
		else if(form.owner_hp3.value.length	< 1)
		{
			str	+= "휴대전화번호를 입력하세요. ";
			alert(str);
			tabDisplay(tab,content,0);
			form.owner_hp3.focus();
		}
		/*else if(form.bugwa_area.value.length	< 1)
		{
			str	+= "점유면적을 입력하세요. ";
			alert(str);
			tabDisplay(tab,content,0);
			form.bugwa_area.focus();
		}
		else if(form.bugwa_danga.value.length	< 1)
		{
			str	+= "기준금액을 입력하세요. ";
			alert(str);
			tabDisplay(tab,content,0);
			form.bugwa_danga.focus();
		}
		else if(form.bugwa_tax.value.length	< 1)
		{
			str	+= "기본과태료를 입력하세요. ";
			alert(str);
			tabDisplay(tab,content,0);
			form.bugwa_tax.focus();
		}
		else if(form.bugwa_red_rate.value.length	< 1)
		{
			str	+= "감면율을 입력하세요. ";
			alert(str);
			tabDisplay(tab,content,0);
			form.bugwa_red_rate.focus();
		}
		else if(form.bugwa_red_tax.value.length	< 1)
		{
			str	+= "감면과태료를 입력하세요. ";
			alert(str);
			tabDisplay(tab,content,0);
			form.bugwa_red_tax.focus();
		}		
		else if(form.bugwa_form.value.length	< 1)
		{
			str	+= "최종산출식을 입력하세요. ";
			alert(str);
			tabDisplay(tab,content,0);
			form.bugwa_form.focus();
		}
		if( form.bugwa_yn.value == '1' ){
			if(form.bugwa_bigo.value.length	< 1)
			{
				str	+= "미부과 사유를 입력하세요. ";
				alert(str);
				tabDisplay(tab,content,0);
				form.bugwa_bigo.focus();
			}
		}*/
		form.owner_ssn.value = form.owner_ssn1.value+form.owner_ssn2.value;
		form.owner_tel.value = form.owner_tel1.value+"-"+form.owner_tel2.value+"-"+form.owner_tel3.value;
		form.owner_hp.value = form.owner_hp1.value+"-"+form.owner_hp2.value+"-"+form.owner_hp3.value;
	
		if(str	== "")
		{
			return	true;
		}

		return	false;
	}
	
	
	function	DataCheck2()
	{
		var form 	= document.form;
		var	str		= "";
		
		var tabs = document.getElementById('tabmenu');
		var tab = tabs.getElementsByTagName('a'); // 탭 요소
		var contents = document.getElementById('tabcontents');
		var content = getElementsByClassName('tabcontent',contents); // 컨텐츠 요소 class
		
		// 폐기/매각 tab2
		if(form.sale_type.value.length	< 1)
		{
			str	+= "처리방향을 선택하세요. ";
			alert(str);
			tabDisplay(tab,content,1);
			form.sale_type.focus();
		}
		else if(form.sale_bigo.value.length	< 1)
		{
			str	+= "처리사유를 입력하세요. ";
			alert(str);
			tabDisplay(tab,content,1);
			form.sale_bigo.focus();
		}
		else if(form.sale_date.value.length	< 1)
		{
			str	+= "공고일자를 입력하세요. ";
			alert(str);
			tabDisplay(tab,content,1);
			form.sale_date.focus();
		}
		else if(form.sale_no.value.length	< 1)
		{
			str	+= "공고번호를 입력하세요. ";
			alert(str);
			tabDisplay(tab,content,1);
			form.sale_no.focus();
		}
		else if(form.hnd_type.value.length	< 1)
		{
			str	+= "처리결과를 선택하세요. ";
			alert(str);
			tabDisplay(tab,content,1);
			form.hnd_type.focus();
		}
		/*else if(form.hnd_desdate.value.length	< 1)
		{
			str	+= "결정일자를 입력하세요. ";
			alert(str);
			tabDisplay(tab,content,1);
			form.hnd_desdate.focus();
		}
		else if(form.hnd_office.value.length	< 1)
		{
			str	+= "처리업체명을 입력하세요. ";
			alert(str);
			tabDisplay(tab,content,1);
			form.hnd_office.focus();
		}
		else if(form.hnd_opedate.value.length	< 1)
		{
			str	+= "시행일자를 입력하세요. ";
			alert(str);
			tabDisplay(tab,content,1);
			form.hnd_opedate.focus();
		}
		else if(form.hnd_bigo.value.length	< 1)
		{
			str	+= "특이사항을 입력하세요. ";
			alert(str);
			tabDisplay(tab,content,1);
			form.hnd_bigo.focus();
		}*/
		
		if(str	== "")
		{
			return	true;
		}
		
//		alert(str);

		return	false;
	}
	

	function	Init()
	{
//		parent.iFrameResizeTab("tab1");
//		IFRM_PurposeCode.PURPOSE_CD.className	= "essential";
	}
	
	
	
	