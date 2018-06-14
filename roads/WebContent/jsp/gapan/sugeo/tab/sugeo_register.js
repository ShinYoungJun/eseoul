
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

	// 등록하기
	function RegisterPrc_tab1()
	{
		var	result	= DataCheck();
		//var result	=	"true";

		if(result	==	false)
			return false;
		
		var form = document.form;
		
		//if( confirm("저장  하시겠습니까? ") ){
			//top.frames[2].location="sugeo_registerprc.do";		//오른쪽 페이지 링크
		//	form.action = "sugeo_registerprc.do";					// 수거및처리 페이지로 이동
		//	form.submit();
		//}
	}

	// 수거정보 수정하기
	function	goModify_info(mul_no)
	{	
		var	result1	= DataCheck1();
		if(result1	==	false){
			return;
		}
		
		var form = document.form;
		
		form.action = "sugeo_modify.do";
		form.submit();
	}
	
	// 수거물품 수정하기
	function	goModify_goods(goods_seq, mul_no)
	{
		var	result2	= DataCheck2();
		if(result2	==	false)
			return;
		
		
		form.action = "sugeo_bugwa_modify.do?showTab=showTab&goods_seq="+goods_seq+"&mul_no="+mul_no;
		form.submit();
	}
	
	
	function	Search()
	{
		var form = document.form;

		form.action = "search.do";
		form.submit();
	}
	
	// 수거물품 등록
	function goInsert_goods(mul_no){
		
		
		var	result2	= DataCheck2();

		if(result2	==	false)
			return;
			
		var form = document.form;
		form.action = "/gapan/sugeo/goods_registerprc.do?showTab=showTab&mul_no="+mul_no+"&message=등록되었습니다.";
		form.submit();
	
	}
	

	// 수거정보, 수거물품  데이터체크
	function	DataCheck()
	{
		var form 	= document.form;
		var	str		= "";
		
		var tabs = document.getElementById('tabmenu');
		var tab = tabs.getElementsByTagName('a'); // 탭 요소
		var contents = document.getElementById('tabcontents');
		var content = getElementsByClassName('tabcontent',contents); // 컨텐츠 요소 class


		if(form.rem_date.value.length < 1)
		{
			str	+= "수거 일시를 입력하세요. ";
			alert(str);
			tabDisplay(tab,content,0);
			form.rem_date.focus();
			//return;
		}
		else if(form.rem_date_hh.value.length < 1)
		{
			str	+= "수거 일시 시간을 입력하세요.";
			alert(str);
			tabDisplay(tab,content,0);
			form.rem_date_hh.focus();
			//return;
		}
		else if(form.rem_date_mm.value.length	< 1)
		{
			str	+= "수거 일시 분을 입력하세요.";
			alert(str);
			tabDisplay(tab,content,0);
			form.rem_date_mm.focus();
			//return;
		}
		else if(form.rem_mulcd.value.length	< 1)
		{
			str	+= "수거물품을 선택하세요. ";
			alert(str);
			tabDisplay(tab,content,0);
			form.rem_mulcd.focus();
			//return;
		}
		else if(form.rem_mulnm.value.length	< 1)
		{
			str	+= "수거물품 내역을 입력하세요. ";
			alert(str);
			tabDisplay(tab,content,0);
			form.rem_mulnm.focus();
			//return;
		}
		else if(form.rem_bjcd.value.length	< 1)
		{
			str	+= "수거위치 법정동을 선택하세요. ";
			alert(str);
			tabDisplay(tab,content,0);
			form.rem_bjcd.focus();
			//return;
		}
		/*else if(form.rem_hjcd.value.length	< 1)
		{
			str	+= "수거위치 행정동을 선택하세요. ";
			alert(str);
			tabDisplay(tab,content,0);
			form.rem_hjcd.focus();
			//return;
		}*/
		else if(form.rem_addr.value.length	< 1)
		{
			str	+= "수거위치 주변정보를 입력하세요. ";
			alert(str);
			tabDisplay(tab,content,0);
			form.rem_addr.focus();
			//return;
		}
		/*else if(form.rem_nm.value.length	< 1)
		{
			str	+= "소유자명을 입력하세요. ";
			alert(str);
			tabDisplay(tab,content,0);
			form.rem_nm.focus();
			//return;
		}
		else if(form.rem_area.value.length	< 1)
		{
			str	+= "점유면적을 입력하세요. ";
			alert(str);
			tabDisplay(tab,content,0);
			form.rem_area.focus();
			//return;
		}
		else if(form.rem_svfrom.value.length < 1)
		{
			str	+= "보관시작일을 입력하세요. ";
			alert(str);
			tabDisplay(tab,content,0);
			form.rem_svfrom.focus();
			//return;
		}
		else if(form.rem_svto.value.length	< 1)
		{
			str	+= "보관만료일을 입력하세요. ";
			alert(str);
			tabDisplay(tab,content,0);
			form.rem_svto.focus();
			//return;
		}
		else if(form.rem_svplace.value.length	< 1)
		{
			str	+= "보관장소를 입력하세요. ";
			alert(str);
			tabDisplay(tab,content,0);
			form.rem_svplace.focus();
			//return;
		}
		else if(form.rem_badfrom.value.length	< 1)
		{
			str	+= "변질물 보관 시작일을 입력하세요. ";
			alert(str);
			tabDisplay(tab,content,0);
			form.rem_badfrom.focus();
			//return;
		}
		else if(form.rem_badto.value.length	< 1)
		{
			str	+= "변질물 보관 만료일을 입력하세요. ";
			alert(str);
			tabDisplay(tab,content,0);
			form.rem_badto.focus();
			//return;
		}		
		else if(form.rem_badto.value.length	< 1)
		{
			str	+= "변질물 내역을 입력하세요. ";
			alert(str);
			tabDisplay(tab,content,0);
			form.rem_badto.focus();
			//return;
		}
		else if(form.chg_org.value.length	< 1)
		{
			str	+= "소속을 입력하세요. ";
			alert(str);
			tabDisplay(tab,content,0);
			form.chg_org.focus();
			//return;
		}
		else if(form.ann_date.value.length	< 1)
		{
			str	+= "공고일자를 입력하세요. ";
			alert(str);
			tabDisplay(tab,content,0);
			form.ann_date.focus();
			//return;
		}
		else if(form.chg_nm.value.length	< 1)
		{
			str	+= "직급/성명을 입력하세요. ";
			alert(str);
			tabDisplay(tab,content,0);
			form.chg_nm.focus();
			//return;
		}
		else if(form.ann_no.value.length	< 1)
		{
			str	+= "공고번호를 입력하세요. ";
			alert(str);
			tabDisplay(tab,content,0);
			form.ann_no.focus();
			//return;
		}*/
		else if(form.goods_nm.value.length	< 1)
		{
			str	+= "수거물품명을 입력하세요. ";
			alert(str);
			tabDisplay(tab,content,1);
			form.goods_nm.focus();
			//return;
		} 
		else if(form.goods_cnt.value.length	< 1)
		{
			str	+= "수량을 입력하세요. ";
			alert(str);
			tabDisplay(tab,content,1);
			form.goods_cnt.focus();
			//return;
		}
		else if(form.goods_status.value.length	< 1)
		{
			str	+= "처리상황을 선택하세요. ";
			alert(str);
			tabDisplay(tab,content,1);
			form.goods_status.focus();
			//return;
		}
		/*else if(form.goods_svfrom.value.length	< 1)
		{
			str	+= "보관기간 시작일을 입력하세요. ";
			alert(str);
			tabDisplay(tab,content,1);
			form.goods_svfrom.focus();
			//return;
		}
		else if(form.goods_svto.value.length	< 1)
		{
			str	+= "보관기간 만료일을 입력하세요. ";
			alert(str);
			tabDisplay(tab,content,1);
			form.goods_svto.focus();
			//return;
		}
		else if(form.goods_svnm.value.length	< 1)
		{
			str	+= "보관장소를 입력하세요. ";
			alert(str);
			tabDisplay(tab,content,1);
			form.goods_svnm.focus();
			//return;
		}
		
		else if(form.goods_date.value.length	< 1)
		{
			str	+= "처리일자를 입력하세요. ";
			alert(str);
			tabDisplay(tab,content,1);
			form.goods_date.focus();
			//return;
		}
		else if(form.goods_bigo.value.length	< 1)
		{
			str	+= "특이사항을 입력하세요. ";
			alert(str);
			tabDisplay(tab,content,1);
			form.goods_bigo.focus();
			//return;
		}*/
		
		if(str	== "")
		{
			return	true;
		}
		return	false;
		
	}
	
	// 수거정보만 데이터검사
	function	DataCheck1()
	{
		var form 	= document.form;
		var	str		= "";
		
		var tabs = document.getElementById('tabmenu');
		var tab = tabs.getElementsByTagName('a'); // 탭 요소
		var contents = document.getElementById('tabcontents');
		var content = getElementsByClassName('tabcontent',contents); // 컨텐츠 요소 class


		if(form.rem_date.value.length < 1)
		{
			str	+= "수거 일시를 입력하세요. ";
			alert(str);
			tabDisplay(tab,content,0);
			form.rem_date.focus();
			//return;
		}
		else if(form.rem_date_hh.value.length < 1)
		{
			str	+= "수거 일시 시간을 입력하세요.";
			alert(str);
			tabDisplay(tab,content,0);
			form.rem_date_hh.focus();
			//return;
		}
		else if(form.rem_date_mm.value.length	< 1)
		{
			str	+= "수거 일시 분을 입력하세요.";
			alert(str);
			tabDisplay(tab,content,0);
			form.rem_date_mm.focus();
			//return;
		}
		else if(form.rem_mulcd.value.length	< 1)
		{
			str	+= "수거물품을 선택하세요. ";
			alert(str);
			tabDisplay(tab,content,0);
			form.rem_mulcd.focus();
			//return;
		}
		else if(form.rem_mulnm.value.length	< 1)
		{
			str	+= "수거물품 내역을 입력하세요. ";
			alert(str);
			tabDisplay(tab,content,0);
			form.rem_mulnm.focus();
			//return;
		}
		else if(form.rem_bjcd.value.length	< 1)
		{
			str	+= "수거위치 법정동을 선택하세요. ";
			alert(str);
			tabDisplay(tab,content,0);
			form.rem_bjcd.focus();
			//return;
		}
		/*else if(form.rem_hjcd.value.length	< 1)
		{
			str	+= "수거위치 행정동을 선택하세요. ";
			alert(str);
			tabDisplay(tab,content,0);
			form.rem_hjcd.focus();
			//return;
		}*/
		else if(form.rem_addr.value.length	< 1)
		{
			str	+= "수거위치 주변정보를 입력하세요. ";
			alert(str);
			tabDisplay(tab,content,0);
			form.rem_addr.focus();
			//return;
		}
		/*else if(form.rem_nm.value.length	< 1)
		{
			str	+= "소유자명을 입력하세요. ";
			alert(str);
			tabDisplay(tab,content,0);
			form.rem_nm.focus();
			//return;
		}
		else if(form.rem_area.value.length	< 1)
		{
			str	+= "점유면적을 입력하세요. ";
			alert(str);
			tabDisplay(tab,content,0);
			form.rem_area.focus();
			//return;
		}
		else if(form.rem_svfrom.value.length < 1)
		{
			str	+= "보관시작일을 입력하세요. ";
			alert(str);
			tabDisplay(tab,content,0);
			form.rem_svfrom.focus();
			//return;
		}
		else if(form.rem_svto.value.length	< 1)
		{
			str	+= "보관만료일을 입력하세요. ";
			alert(str);
			tabDisplay(tab,content,0);
			form.rem_svto.focus();
			//return;
		}
		else if(form.rem_svplace.value.length	< 1)
		{
			str	+= "보관장소를 입력하세요. ";
			alert(str);
			tabDisplay(tab,content,0);
			form.rem_svplace.focus();
			//return;
		}
		else if(form.rem_badfrom.value.length	< 1)
		{
			str	+= "변질물 보관 시작일을 입력하세요. ";
			alert(str);
			tabDisplay(tab,content,0);
			form.rem_badfrom.focus();
			//return;
		}
		else if(form.rem_badto.value.length	< 1)
		{
			str	+= "변질물 보관 만료일을 입력하세요. ";
			alert(str);
			tabDisplay(tab,content,0);
			form.rem_badto.focus();
			//return;
		}		
		else if(form.rem_badto.value.length	< 1)
		{
			str	+= "변질물 내역을 입력하세요. ";
			alert(str);
			tabDisplay(tab,content,0);
			form.rem_badto.focus();
			//return;
		}
		else if(form.chg_org.value.length	< 1)
		{
			str	+= "소속을 입력하세요. ";
			alert(str);
			tabDisplay(tab,content,0);
			form.chg_org.focus();
			//return;
		}
		else if(form.ann_date.value.length	< 1)
		{
			str	+= "공고일자를 입력하세요. ";
			alert(str);
			tabDisplay(tab,content,0);
			form.ann_date.focus();
			//return;
		}
		else if(form.chg_nm.value.length	< 1)
		{
			str	+= "직급/성명을 입력하세요. ";
			alert(str);
			tabDisplay(tab,content,0);
			form.chg_nm.focus();
			//return;
		}
		else if(form.ann_no.value.length	< 1)
		{
			str	+= "공고번호를 입력하세요. ";
			alert(str);
			tabDisplay(tab,content,0);
			form.ann_no.focus();
			//return;
		}*/
		
		if(str	== "")
		{
			return	true;
		}
		return	false;
		
	}
	
	
	// 수거물품만 데이터 검사 
	function DataCheck2(){
	
		var form 	= document.form;
		var	str		= "";
		
		var tabs = document.getElementById('tabmenu');
		var tab = tabs.getElementsByTagName('a'); // 탭 요소
		var contents = document.getElementById('tabcontents');
		var content = getElementsByClassName('tabcontent',contents); // 컨텐츠 요소 class
	
		if(form.goods_nm.value.length	< 1)
		{
			str	+= "수거물품명을 입력하세요. ";
			alert(str);
			tabDisplay(tab,content,1);
			form.goods_nm.focus();
			//return;
		}
		else if(form.goods_cnt.value.length	< 1)
		{
			str	+= "수량을 입력하세요. ";
			alert(str);
			tabDisplay(tab,content,1);
			form.goods_cnt.focus();
			//return;
		}
		else if(form.goods_svfrom.value.length	< 1)
		{
			str	+= "보관기간 시작일을 입력하세요. ";
			alert(str);
			tabDisplay(tab,content,1);
			form.goods_svfrom.focus();
			//return;
		}
		else if(form.goods_svto.value.length	< 1)
		{
			str	+= "보관기간 만료일을 입력하세요. ";
			alert(str);
			tabDisplay(tab,content,1);
			form.goods_svto.focus();
			//return;
		}
		else if(form.goods_status.value.length	< 1)
		{
			str	+= "처리상황을 선택하세요. ";
			alert(str);
			tabDisplay(tab,content,1);
			form.goods_status.focus();
			//return;
		}
		/*else if(form.goods_svnm.value.length	< 1)
		{
			str	+= "보관장소를 입력하세요. ";
			alert(str);
			tabDisplay(tab,content,1);
			form.goods_svnm.focus();
			//return;
		}
		
		else if(form.goods_date.value.length	< 1)
		{
			str	+= "처리일자를 입력하세요. ";
			alert(str);
			tabDisplay(tab,content,1);
			form.goods_date.focus();
			//return;
		}
		else if(form.goods_bigo.value.length	< 1)
		{
			str	+= "특이사항을 입력하세요. ";
			alert(str);
			tabDisplay(tab,content,1);
			form.goods_bigo.focus();
			//return;
		}*/
		
		if(str	== "")
		{
			return	true;
		}
		
		return	false;
	}

	


	function	Init()
	{
//		parent.iFrameResizeTab("tab1");
//		IFRM_PurposeCode.PURPOSE_CD.className	= "essential";
	}
	
	//	다른 탭의 데이터를 점용인 정보로 가져온다.
	function	Jumin_DataEx()
	{
		document.getElementById("NAME").value		= document.getElementById("NAME_MIN").value;
		document.getElementById("jumin_ssn1").value	= document.getElementById("min_ssn1").value;
		document.getElementById("jumin_ssn2").value	= document.getElementById("min_ssn2").value;
	}
	
	function	Select_UseType(sel)
	{
//		var idx = sel.selectedIndex;
		document.getElementById("doroname").colSpan=[1];
		document.getElementById("jucha").style.display = "none";
		document.getElementById("jucha_value").style.display = "none";
		document.getElementById("UseType1").style.display = "none";
		document.getElementById("UseType2").style.display = "none";
		
		if(sel.value == '2' || sel.value == '3')
		{
			document.getElementById("jucha").style.display = "";
			document.getElementById("jucha_value").style.display = "";
			document.getElementById("USERTYPENAME").value		= "하천/구거명";
			document.getElementById("UseType2").style.display 	= "block";	//	하천, 구거
		}
		else if(sel.value == '1')
		{
			document.getElementById("jucha").style.display = "";
			document.getElementById("jucha_value").style.display = "";
			document.getElementById("USERTYPENAME").value		= "주차면수";
			document.getElementById("UseType1").style.display 	= "block";	//	도로
		}
		else{
			document.getElementById("doroname").colSpan=[3];
			document.getElementById("USERTYPENAME").value		= "";
		}
		
	//	else if(sel.value == '4')						//	노점
	//		document.getElementById("UseType1").style.display = "block";

		document.getElementById("IFRM_PurposeCode").src="/jsp/common/purposeCode/purposeCode.jsp?SectionCode=" + sel.value + "&essential=1";
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
	