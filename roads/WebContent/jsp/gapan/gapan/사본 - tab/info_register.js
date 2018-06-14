

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

	function	RegisterPrc()
	{
		var	result	= DataCheck();
		//var result	=	"true";

		if(result	==	false)
			return false;
		
		var form = document.form;
		
//		form.PURPOSE_CD.value	= IFRM_PurposeCode.document.getElementById("PURPOSE_CD").value;

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
		var form 	= document.form;
		var	chk1		= form.checkbox1.checked;
		var	chk2		= form.checkbox2.checked;

		if(chk1	== true)
		{
			form.OWNER_TOPOST.value		= form.OWNER_POST.value;
			form.OWNER_TOADDR1.value	= form.OWNER_ADDR1.value;
			form.OWNER_TOADDR2.value	= form.OWNER_ADDR2.value;
			if(form.OWNER_SAN.checked == true){
				form.OWNER_SAN.value = "1";
				form.OWNER_TOSAN.checked = true;
				form.OWNER_TOSAN.value = "1";
			}else{
				form.OWNER_SAN.value = "0";
				form.OWNER_TOSAN.checked = false;
				form.OWNER_TOSAN.value = "0";
			}
			form.OWNER_TOBONBUN.value	= form.OWNER_BONBUN.value;
			form.OWNER_TOBUBUN.value	= form.OWNER_BUBUN.value;
		}
		
		if(chk2 == true)
		{
			form.PARTN_TOPOST.value		= form.PARTN_POST.value;
			form.PARTN_TOADDR1.value	= form.PARTN_ADDR1.value;
			form.PARTN_TOADDR2.value	= form.PARTN_ADDR2.value;
			if(form.PARTN_SAN.checked == true){
				form.PARTN_SAN.value = "1";
				form.PARTN_TOSAN.checked = true;
				form.PARTN_TOSAN.value = "1";
			}else{
				form.PARTN_SAN.value = "0";
				form.PARTN_TOSAN.checked = false;
				form.PARTN_TOSAN.value = "0";
			}
			form.PARTN_TOBONBUN.value	= form.PARTN_BONBUN.value;
			form.PARTN_TOBUBUN.value	= form.PARTN_BUBUN.value;
		}

	//	form.checkbox.checked	= false;
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
			document.getElementById("USERTYPENAME").value		= "????????";
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

/*********************************************************** ???? ???? ???? ???????? ????****************************************************/
	function click_plus_button(seqCellName,oElement,max)
	{
		if(oElement.parentElement.parentElement.rows.length>=max){
			alert("5개 이상 등록 할 수 없습니다.");
			return;
		}
		add(oElement,1,"");
		
		initSeq(seqCellName);
		
	}

	function click_minus_button(seqCellName,oElement)
	{
		 seqElement = document.getElementsByName(seqCellName);

		 if(seqElement.length < 2){
			alert("최소한 한개 이상은 등록해야 합니다.");
			return;
		 }
		 
		MUL_TABLE.deleteRow(oElement.parentElement.rowIndex);		
		initSeq(seqCellName);
	}

	function TDcopyInnerText(oldElement,newElement,from){
		newElement.innerHTML = oldElement.outerHTML; 

		if(from!='up' && from!='down'){
			//복사될 인풋타입들 값초기화
			for(var a=0;a<newElement.childNodes.length;a++){
				if(newElement.childNodes[a].value){
					newElement.childNodes[a].value='';
				}
			}
		}
		return newElement;
	}

	function copyAttributes(oldElement,newElement){
		
		//tr,td 에 쓰이는 속성은 여기에서 추가시켜줌.
		newElement.setAttribute('width',oldElement.width);
		newElement.setAttribute('height',oldElement.height);
		newElement.setAttribute('align',oldElement.align);
		newElement.setAttribute('valign',oldElement.valign);
		
		//tr,td 에 쓰이는 이벤트는 여기에 추가시킴.
		newElement.onclick = oldElement.onclick;
		newElement.onmouseover = oldElement.onmouseover;
		newElement.onmouseout = oldElement.onmouseout;
		newElement.onfocus = oldElement.onfocus;
		
		return newElement;
	}
	
	function copyStyle(oldElement,newElement){
		newElement.style.cssText = oldElement.style.cssText;
		return newElement;
	}
	
	function add(oElement, num, from){
		var otr = oElement.parentElement;
		var ntr = MUL_TABLE.insertRow(oElement.parentElement.rowIndex+parseInt(''+num));
			ntr = copyAttributes(otr,ntr);
			ntr = copyStyle(otr,ntr);
		
		var mul_table = MUL_TABLE.rows.length-1;

		var innerHtml = "";
			innerHtml = "<td id='UseSection' style='display:block'>";
 			innerHtml += "<input name='MUL_FROMDATE' type='text' class='essential' style='width:70px' value='' readonly><a><img id='MUL_FROMDATE_IMG' src='/img/calendar_icon.gif' width='19' height='16' border='0' align='absmiddle' onclick=\"popUpCalendar(this, MUL_FROMDATE, 'yyyymmdd'," + mul_table + ")\" style='CURSOR: Hand;'></a>";
	  		innerHtml += "~ <input name='MUL_TODATE' type='text' class='essential' style='width:70px' value='' readonly><a><img id='MUL_TODATE_IMG' src='/img/calendar_icon.gif' width='19' height='16' border='0' align='absmiddle' onclick=\"popUpCalendar(this, MUL_TODATE, 'yyyymmdd', " + mul_table + " )\" style='CURSOR: Hand;'></a>";
 			innerHtml += "</td>";
		otr.cells[0].innerHTML = innerHtml;

		var ntd;
		for(var i=0;i<otr.cells.length;i++){
			ntd = ntr.insertCell();
			ntd = TDcopyInnerText(otr.cells[i],ntd,from);
			ntd = copyAttributes(otr.cells[i],ntd);
			ntd = copyStyle(otr.cells[i],ntd);
		}

	}

	function initSeq(seqCellName){
		
		 seqElement = document.getElementsByName(seqCellName);
//		 for(var i=0;i<seqElement.length;i++){
//			seqElement[i].value=i+1;
//		 }
	}
/**********************************************************************************************************************************/
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
		
		var tabs = document.getElementById('tabmenu');
		var tab = tabs.getElementsByTagName('a'); // 탭 요소
		var contents = document.getElementById('tabcontents');
		var content = getElementsByClassName('tabcontent',contents); // 컨텐츠 요소 class

		//	점용인 정보
		if(form.min_ssn1.value.length < 6)
		{
			str	+= "주민(법인)번호가 입력되지 않았거나\n자리수가 틀립니다.";
			alert(str);
			tabDisplay(tab,content,0);
			form.min_ssn1.focus();
		}
		else if(form.min_ssn2.value.length < 7)
		{
			str	+= "주민(법인)번호가 입력되지 않았거나\n자리수가 틀립니다.	";
			alert(str);
			tabDisplay(tab,content,0);
			form.min_ssn2.focus();
		}
		else if(form.OWNER_NAME.value.length	< 1)
		{
			str	+= "운영자명을 입력하세요\n";
			alert(str);
			tabDisplay(tab,content,1);
			form.OWNER_NAME.focus();
		}
		else if(form.OWNER_SSN1.value.length	< 1)
		{
			str	+= "운영자 주민등록번호를 입력하세요\n";
			alert(str);
			tabDisplay(tab,content,1);
			form.OWNER_SSN1.focus();
		}
		else if(form.OWNER_SSN2.value.length	< 1)
		{
			str	+= "운영자 주민등록번호를 입력하세요\n";
			alert(str);
			tabDisplay(tab,content,1);
			form.OWNER_SSN2.focus();
		}
		else if(form.GP_TYP.value.length	< 1)
		{
			str	+= "가판종류를 선택하세요\n";
			alert(str);
			tabDisplay(tab,content,1);
			form.GP_TYP.focus();
		}
		else if(form.OWNER_SET.value.length	< 1)
		{
			str	+= "소유자를 선택하세요\n";
			alert(str);
			tabDisplay(tab,content,3);
			form.OWNER_SET.focus();
		}
		else if(form.TAX_SET.value.length	< 1)
		{
			str	+= "세입구분을 선택하세요\n";
			alert(str);
			tabDisplay(tab,content,3);
			form.TAX_SET.focus();
		}
		else if(form.MUL_FROMDATE.value.length	< 1)
		{
			str	+= "점용기간을 입력하세요\n";
			alert(str);
			tabDisplay(tab,content,3);
			form.MUL_FROMDATE.focus();
		}
		else if(form.MUL_TODATE.value.length	< 1)
		{
			str	+= "점용기간을 입력하세요\n";
			alert(str);
			tabDisplay(tab,content,3);
			form.MUL_TODATE.focus();
		}
		else if(form.BJ_CD.value.length	< 1)
		{
			str	+= "점용지 동을 선택 하세요\n";
			alert(str);
			tabDisplay(tab,content,3);
			form.BJ_CD.focus();
		}
		else if(form.SPC_CD.value.length	< 1)
		{
			str	+= "점용지 번지종류를 선택 하세요\n";
			alert(str);
			tabDisplay(tab,content,3);
			form.SPC_CD.focus();
		}
		else if(form.BONBUN.value.length	< 1)
		{
			str	+= "점용지 본번을 입력 하세요\n";
			alert(str);
			tabDisplay(tab,content,3);
			form.BONBUN.focus();
		}
		else if(form.WITH_ADDR.value.length	< 1)
		{
			str	+= "인접지 주소를 입력하세요\n";
			alert(str);
			tabDisplay(tab,content,3);
			form.WITH_ADDR.focus();
		}
		else if(form.FT_TYP.value.length	< 1)
		{
			str	+= "시설물명을 선택하세요\n";
			alert(str);
			tabDisplay(tab,content,3);
			form.FT_TYP.focus();
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
		//IFRM_PurposeCode.PURPOSE_CD.className	= "essential";
	}

	//	다른 탭의 데이터를 점용인 정보로 가져온다.
	function	Jumin_DataEx()
	{
		document.getElementById("NAME").value		= document.getElementById("NAME_MIN").value;
		document.getElementById("jumin_ssn1").value	= document.getElementById("min_ssn1").value;
		document.getElementById("jumin_ssn2").value	= document.getElementById("min_ssn2").value;
	}
	
	