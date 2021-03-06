

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

			parent.iFrameResizeTab("tab1");	// 화면 RESIZE
		}

// document.getElementById('NOWTAB').value = num;
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
		var content = getElementsByClassName('tabcontent',contents); // 컨텐츠
																		// 요소
																		// class
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
		var form 	= document.form;
		var	chk		= form.ADDR_CHECK.checked;

		if(chk	== true)
		{
			form.TONM.value	= form.NAME.value;
			form.TOPOST.value		= form.POST.value;
			form.TOADDR1.value		= form.ADDR1.value;
			form.TOADDR2.value		= form.ADDR2.value;
			form.TOMAIL.value		= form.EMAIL.value;

		// form.TOTEL.value = form.TEL.value;
		// form.TOHP.value = form.HP.value;

			form.jumin_totel1.value	= form.jumin_tel1.value;
			form.jumin_totel2.value	= form.jumin_tel2.value;
			form.jumin_totel3.value	= form.jumin_tel3.value;

			form.jumin_tohp1.value	= form.jumin_hp1.value;
			form.jumin_tohp2.value	= form.jumin_hp2.value;
			form.jumin_tohp3.value	= form.jumin_hp3.value;			
		}
		else
		{
			form.TONM.value	= "";
			form.TOPOST.value		= "";
			form.TOADDR1.value		= "";
			form.TOADDR2.value		= "";
			form.TOMAIL.value		= "";
			form.jumin_totel1.value	= "";
			form.jumin_totel2.value	= "";
			form.jumin_totel3.value	= "";

			form.jumin_tohp1.value	= "";
			form.jumin_tohp2.value	= "";
			form.jumin_tohp3.value	= "";	
		}

	// form.checkbox.checked = false;
	}
	
	function	Jumin_toaddr_Check2()
	{
		var form 		=	document.form;
		var	chk			=	form.ADDR_CHECK.checked;

		if(chk	== true)
		{
			form.TONM.value	= form.NAME.value;
			form.TOPOST.value		= form.POST.value;
			form.TOADDR1.value		= form.ADDR1.value;
			form.TOADDR2.value		= form.ADDR2.value;
			form.TOMAIL.value		= form.EMAIL.value;

			form.jumin_totel1.value	= form.jumin_tel1.value;
			form.jumin_totel2.value	= form.jumin_tel2.value;
			form.jumin_totel3.value	= form.jumin_tel3.value;

			form.jumin_tohp1.value	= form.jumin_hp1.value;
			form.jumin_tohp2.value	= form.jumin_hp2.value;
			form.jumin_tohp3.value	= form.jumin_hp3.value;	
			form.ADDR_CHECK.value="1";		
		}
	}
	
	function Select_Jumyong_Jibun()
	{
		var bj_cd = document.form.BJ_CD.value;
		var hj_cd = document.form.HJ_CD.value;
		var spc_cd = document.form.SPC_CD.value;
		var bonbun = document.form.BONBUN.value;
		var bubun = document.form.BUBUN.value;
		
		if(bj_cd != '' && hj_cd != '' && spc_cd != '' && bonbun != ''){
			var	params	= "BJ_CD=" + bj_cd + "&HJ_CD=" + hj_cd + "&SPC_CD=" + spc_cd + "&BONBUN=" + bonbun + "&BUBUN=" + bubun;
			sendRequest("/jumyong/minwon/jumyongjibuninfo.do", params, "GET", Result_Jumyongjibuninfo);
		}
	}
	
	function	Result_Jumyongjibuninfo(obj)
	{
		var xmldoc 	= new ActiveXObject("Microsoft.XMLDOM");
        var form 	= document.form;

        xmldoc.async	= false;
		xmldoc.loadXML(obj);
		
		var returnNum =	xmldoc.getElementsByTagName("returnNum").item(0).text;
		
		if(returnNum != "0")
		{
			alert("주 의 : 같은 점용지 지번이 이미 등록되어있습니다.");
		}
	}
	
	function	Select_UseType(sel)
	{
		document.getElementById("doroname").colSpan= 1;
		document.getElementById("jucha").style.display = "none";
		document.getElementById("jucha_value").style.display = "none";
		document.getElementById("UseType1").style.display = "none";
		document.getElementById("UseType2").style.display = "none";
		
		if(sel.value == '2')
		{
			document.getElementById("area").colSpan = 1;
			
			document.getElementById("jucha").style.display = "block";
			document.getElementById("jucha_value").style.display = "block";
			document.getElementById("USERTYPENAME").value		= "하천/구거명";
			document.getElementById("UseType2").style.display 	= "block";	// 하천,구거
			
			document.getElementById("jucha2").style.display = "block";
			document.getElementById("jucha_value2").style.display = "block";
			document.getElementById("UseType3").style.display 	= "block";
			
		}
		else if(sel.value == '3')
		{
			document.getElementById("area").colSpan = 3;
			
			document.getElementById("jucha").style.display = "block";
			document.getElementById("jucha_value").style.display = "block";
			document.getElementById("USERTYPENAME").value		= "하천/구거명";
			document.getElementById("UseType2").style.display 	= "block";	// 하천,구거
			
			document.getElementById("jucha2").style.display = "none";
			document.getElementById("jucha_value2").style.display = "none";
			document.getElementById("UseType3").style.display 	= "none";
		
			
			
		}
		else if(sel.value == '1')
		{
			document.getElementById("area").colSpan = 3;
			
			document.getElementById("jucha").style.display = "block";
			document.getElementById("jucha_value").style.display = "block";
			document.getElementById("USERTYPENAME").value		= "주차면수";
			document.getElementById("UseType1").style.display 	= "block";	// 도로
			
			document.getElementById("jucha2").style.display = "none";
			document.getElementById("jucha_value2").style.display = "none";
			document.getElementById("UseType3").style.display 	= "none";
		}
		
		else{
			document.getElementById("doroname").colSpan= 3;
			document.getElementById("USERTYPENAME").value		= "";
		}
		
	// else if(sel.value == '4') // 노점
	// document.getElementById("UseType1").style.display = "block";

		document.getElementById("IFRM_PurposeCode").src="/jsp/common/purposeCode/purposeCode.jsp?SectionCode=" + sel.value + "&essential=1";
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
			  	innerHtml += "			<input id='PARTLY_PERIOD' maxlength='100' name='PARTLY_PERIOD' type='text' class='essential' style='width:400px' value='일시 점용기간을 입력해 주세요. 예)09.06.06 ~ 09.2009.09.09' onclick=\"javascript:document.form.PARTLY_PERIOD.value = '';\">";
			 	innerHtml += "			&nbsp;&nbsp;총<input name='TOTAL_PERIOD' maxlength='5' type='text' class='essential' style='width:30px' value='' style='ime-mode:disabled' onKeyDown='nr_num_int(this);' onKeyUp='nr_num_int(this);' onKeyPress='nr_num_int(this);'>일";
			 	innerHtml += "		</td>";
			 	innerHtml += "	</tr>";
		  		innerHtml += "</table>";
		 	
		 	MUL_DIV.innerHTML = innerHtml;
		 	
		 	//감면율 감면사유
		 	document.getElementById("TD_REDUCTION_RATE").innerHTML = "감면율";
		 	document.getElementById("TD_REDUCTION_REASON").innerHTML = "감면율 사유";
		 	

				 	
		 	
		}
		else if(sel.value == '3')
		{
			var MUL_DIV = document.getElementById("MUL_DIV");
			
			var innerHtml = "";
				innerHtml += "<table id='MUL_TABLE' border='0' cellpadding='0' cellspacing='0' class='sub_stan'>";
				innerHtml += "	<tr id='MulDateSection'>";
				innerHtml += "		<td id='UseSection' style='display:block'>";
		  		innerHtml += "			<input name='MUL_FROMDATE' type='text' class='essential' style='width:70px' value='' readonly><a><img id='MUL_FROMDATE_IMG' src='/img/calendar_icon.gif' width='19' height='16' border='0' align='absmiddle' onclick=\"popUpCalendar(this, document.getElementById('MUL_FROMDATE'), 'yyyymmdd', 0)\" style='CURSOR: Hand;'></a>";
			  	innerHtml += "			~ <input name='MUL_TODATE' type='text' class='essential' style='width:70px' value='' readonly><a><img id='MUL_TODATE_IMG' src='/img/calendar_icon.gif' width='19' height='16' border='0' align='absmiddle' onclick=\"popUpCalendar(this, document.getElementById('MUL_TODATE'), 'yyyymmdd', 0)\" style='CURSOR: Hand;'></a>";
	  			innerHtml += "		</td>";
 /*
	 * innerHtml += "
	 * <td onclick=\"javascript:click_plus_button('MUL_FROMDATE', this,'5');\">";
	 * innerHtml += " <img id='plus_button' src='/img/add_icon.gif'
	 * style='display:block' style='CURSOR: Hand;'>"; innerHtml += " </td>";
	 * innerHtml += "
	 * <td onclick=\"javascript:click_minus_button('MUL_FROMDATE', this);\">";
	 * innerHtml += " <img id='minus_button' src='/img/del_icon3.gif'
	 * style='display:block' style='CURSOR: Hand;'>"; innerHtml += " </td>";
	 */
		  		innerHtml += "	</tr>";
		  		innerHtml += "</table>";
		  		
		  	MUL_DIV.innerHTML = innerHtml;
		  	
		 	//지분율 지분사유
		 	document.getElementById("TD_REDUCTION_RATE").innerHTML = "지분율";
		 	document.getElementById("TD_REDUCTION_REASON").innerHTML = "지분율 사유";
		}
		else
		{
			var MUL_DIV = document.getElementById("MUL_DIV");
			
			var innerHtml = "";
				innerHtml += "<table id='MUL_TABLE' border='0' cellpadding='0' cellspacing='0' class='sub_stan'>";
				innerHtml += "	<tr id='MulDateSection'>";
				innerHtml += "		<td id='UseSection' style='display:block'>";
		  		innerHtml += "			<input name='MUL_FROMDATE' type='text' class='essential' style='width:70px' value='' readonly><a><img id='MUL_FROMDATE_IMG' src='/img/calendar_icon.gif' width='19' height='16' border='0' align='absmiddle' onclick=\"popUpCalendar(this, document.getElementById('MUL_FROMDATE'), 'yyyymmdd')\" style='CURSOR: Hand;'></a>";
			  	innerHtml += "			~ <input name='MUL_TODATE' type='text' class='essential' style='width:70px' value='' readonly><a><img id='MUL_TODATE_IMG' src='/img/calendar_icon.gif' width='19' height='16' border='0' align='absmiddle' onclick=\"popUpCalendar(this, document.getElementById('MUL_TODATE'), 'yyyymmdd')\" style='CURSOR: Hand;'></a>";
	  			innerHtml += "		</td>";
	  			innerHtml += "	</tr>";
	  			innerHtml += "</table>";
	  		
	  		MUL_DIV.innerHTML = innerHtml;
	  		
		 	//감면율 감면사유
		 	document.getElementById("TD_REDUCTION_RATE").innerHTML = "감면율";
		 	document.getElementById("TD_REDUCTION_REASON").innerHTML = "감면율 사유";
		}
		
		parent.iFrameResizeTab("tab1");	// 화면 RESIZE
	}
	
/**
 * ********************************************************* 노드 추가 삭제 스크립트
 * 부분***************************************************
 */
	function click_plus_button(seqCellName,oElement,max)
	{
		if(oElement.parentElement.parentElement.rows.length >= max){
			alert("5개 이상 등록 할 수 없습니다.");
			return;
		}
		add(oElement,1,"");
		/*
		 * var number = oElement.parentElement.parentElement.rows.length; var
		 * innerHtml1 = ""; var innerHtml2 = ""; var element1 = "";
		 * 
		 * if(number > 0){ for(var j=0; j<number; j++) { element1 =
		 * document.getElementByNames("MUL_DIV"); alert(element1); } }
		 */
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
			// 복사될 인풋타입들 값초기화
			for(var a=0;a<newElement.childNodes.length;a++){
				if(newElement.childNodes[a].value){
					newElement.childNodes[a].value='';
				}
			}
		}
		return newElement;
	}

	function copyAttributes(oldElement,newElement){
		
		// tr,td 에 쓰이는 속성은 여기에서 추가시켜줌.
		newElement.setAttribute('width',oldElement.width);
		newElement.setAttribute('height',oldElement.height);
		newElement.setAttribute('align',oldElement.align);
		newElement.setAttribute('valign',oldElement.valign);
		
		// tr,td 에 쓰이는 이벤트는 여기에 추가시킴.
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
 			innerHtml += "<input name='MUL_FROMDATE' type='text' class='essential' style='width:70px' value='' readonly><a><img id='MUL_FROMDATE_IMG' src='/img/calendar_icon.gif' width='19' height='16' border='0' align='absmiddle' onclick=\"popUpCalendar(this, document.getElementById('MUL_FROMDATE'), 'yyyymmdd'," + mul_table + ")\" style='CURSOR: Hand;'></a>";
	  		innerHtml += "~ <input name='MUL_TODATE' type='text' class='essential' style='width:70px' value='' readonly><a><img id='MUL_TODATE_IMG' src='/img/calendar_icon.gif' width='19' height='16' border='0' align='absmiddle' onclick=\"popUpCalendar(this, document.getElementById('MUL_TODATE'), 'yyyymmdd', " + mul_table + " )\" style='CURSOR: Hand;'></a>";
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
// for(var i=0;i<seqElement.length;i++){
// seqElement[i].value=i+1;
// }
	}
/** ******************************************************************************************************************************* */
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
		var content = getElementsByClassName('tabcontent',contents); // 컨텐츠
																		// 요소
																		// class
		
		
		// 점용인 정보

		if(form.NAME.value.length	< 1)
		{
			str	+= "점용인/법인명을 입력하세요\n";
			alert(str);
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
			openZipcodePopup('form.POST', 'form.ADDR1');
		}
		else if(form.ADDR2.value.length	< 1)
		{
			str	+= "상세 주소를 입력하세요\n";
			alert(str);
			tabDisplay(tab,content,1);
			form.ADDR2.focus();
		}
		else if(form.TYPE.value.length	< 1)	// 점용지 정보
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
		/*
		 * else if(form.OWNER_SET.value=="2" && form.TAX_SET.value!="10") { str +=
		 * "소유자의 시유지는 세입구분에서 시세로 선택되어야 합니다.\n"; alert(str);
		 * tabDisplay(tab,content,2); form.TAX_SET.value = "10";
		 * form.TAX_SET.focus(); } else if(form.OWNER_SET.value=="3" &&
		 * form.TAX_SET.value!="50") { str += "소유자의 구유지는 세입구분에서 구세로 선택되어야
		 * 합니다.\n"; alert(str); tabDisplay(tab,content,2); form.TAX_SET.value =
		 * "50"; form.TAX_SET.focus(); }
		 */
		else if(form.TAX_SET.value.length	< 1)
		{
			str	+= "세입 구분을 입력하세요\n";
			alert(str);
			tabDisplay(tab,content,2);
			form.TAX_SET.focus();
		}
		else if(form.POST.value.length	< 1)
		{
			str	+= "우편번호를 입력하세요\n";
			alert(str);
			tabDisplay(tab,content,2);
			form.POST.focus();
		}
		else if(form.BJ_CD.value.length	< 1)
		{
			str	+= "점용지 법정동을 선택하세요.\n";
			alert(str);
			tabDisplay(tab,content,2);
			form.BJ_CD.focus();
		}
		else if(form.HJ_CD.value.length	< 1)
		{
			str	+= "점용지 행정동을 선택하세요\n";
			alert(str);
			tabDisplay(tab,content,2);
			form.HJ_CD.focus();
		}
		else if(form.SPC_CD.value.length	< 1)
		{
			str	+= "점용지 번지를 선택하세요\n";
			alert(str);
			tabDisplay(tab,content,2);
			form.SPC_CD.focus();
		}
		else if(form.BONBUN.value.length	< 1)
		{
			str	+= "점용지 본번을 입력하세요\n";
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
			str	+= "점용면적를 입력하세요\n";
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
		}
		else if(form.SECTION.value	== '2')
		{
			if(form.PARTLY_PERIOD.value.length	< 1 || form.PARTLY_PERIOD.value == "일시 점용기간을 입력해 주세요. 예)09.06.06 ~ 09.2009.09.09")
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
		else if(form.jumin_bizssn1.value.length > 0 || form.jumin_bizssn2.value.length > 0 || form.jumin_bizssn3.value.length > 0)
		{
			if(form.jumin_bizssn1.value.length	< 3	||	form.jumin_bizssn2.value.length < 2	||	form.jumin_bizssn3.value.length < 5)
			{
				str	+= "사업자등록번호를 정확히 입력하세요\n";
				alert(str);
				tabDisplay(tab,content,1);
				form.jumin_bizssn1.focus();
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
		IFRM_PurposeCode.PURPOSE_CD.className	= "essential";
	}
	
	// 다른 탭의 데이터를 점용인 정보로 가져온다.
	function	Jumin_DataEx()
	{
		document.getElementById("NAME").value		= document.getElementById("NAME_MIN").value;
		document.getElementById("jumin_ssn1").value	= document.getElementById("min_ssn1").value;
		document.getElementById("jumin_ssn2").value	= document.getElementById("min_ssn2").value;
	}
	
	// 평균 인접지 공시지가
	function 	openTotalWith()
	{
		
		var form 	= document.form;
		var tabs = document.getElementById('tabmenu');
		var tab = tabs.getElementsByTagName('a'); // 탭 요소
		var contents = document.getElementById('tabcontents');
		var content = getElementsByClassName('tabcontent',contents); // 컨텐츠
		var	str		= "";
		
		if(form.BJ_CD.value.length	< 1)
		{
			str	+= "평균공시지가 적용 대표점용지 법정동을 선택하세요.\n";
			alert(str);
			tabDisplay(tab,content,2);
			form.BJ_CD.focus();
		}
		else if(form.HJ_CD.value.length	< 1)
		{
			str	+= "평균공시지가 적용 대표점용지 행정동을 선택하세요\n";
			alert(str);
			tabDisplay(tab,content,2);
			form.HJ_CD.focus();
		}
		else if(form.SPC_CD.value.length	< 1)
		{
			str	+= "평균공시지가 적용 대표점용지 번지를 선택하세요\n";
			alert(str);
			tabDisplay(tab,content,2);
			form.SPC_CD.focus();
		}
		else if(form.BONBUN.value.length	< 1)
		{
			str	+= "평균공시지가 적용 대표점용지 본번을 선택하세요\n";
			alert(str);
			tabDisplay(tab,content,2);
			form.BONBUN.focus();
		}
		
		else{
			
			var bjCD = form.BJ_CD.value;
			var hjCD = form.HJ_CD.value;
			var spcCD = form.SPC_CD.value;
				
			var url 	= "/jumyong/minwon/total_with.do?bjCD=" + bjCD + "&hjCD=" + hjCD + "&spcCD=" + spcCD;
			var winName = "인접지주소";
			var width 	= 420;
			var height 	= 420;
			var scroll 	= "yes";
			var resize 	= "yes";

			var	option	= "scrollbars=" + scroll + ", ";
			option	+= "resize=" + resize + ", ";
			option	+= "width=" + width + ", ";
			option	+= "height=" + height;

			window.open(url, winName, option);
		}	
	}
	
	

	
	function totalWithAdd()
	{

		 var	obj		= document.getElementById("WITH_XML").value;
        var xmlDom 	= new ActiveXObject("Microsoft.XMLDOM");
        var form 	= document.form;
		
        xmlDom.async	= false;
        xmlDom.loadXML(obj);
		
        var objRoot	= xmlDom.documentElement;
        var length	= objRoot.childNodes.length;
        var Child 	= objRoot.firstChild;
		
        var	BONBU		= "";
        var	BUBUN		= "";
        var	PRICE		= "";

        var tw_bj_nm = "";
        var tw_addr = "";
        var tw_sum = 0;

        document.getElementById("WITH_SUM_PRICE").value = ""; 
        document.getElementById("WITH_ADDR1").value = "";
        document.getElementById("WITH_ADDR2").value = "";



    	 if(length	> 0)
        {
    		document.getElementById("WITH_ADDR1").value = Child.getElementsByTagName("BJ_NM").item(0).text;
    		
            for(i = 0	;	i < length	;	i++)
            {
                BONBUN		= Child.getElementsByTagName("BONBUN").item(0).text;
                BUBUN		= Child.getElementsByTagName("BUBUN").item(0).text;
                PRICE		= Child.getElementsByTagName("PRICE").item(0).text;

                if(BUBUN.length > 0){
               	 tw_addr += BONBUN + "-" + BUBUN;
                }else{
               	 tw_addr += BONBUN;
                }

                if(i != length-1){
                    tw_addr += ", ";

                }

                
                tw_sum += parseInt(PRICE);
               
                Child	= Child.nextSibling;
            }

            if(tw_sum != 0 ){
                tw_sum = parseInt(tw_sum/length);
            }

            document.getElementById("WITH_ADDR2").value = tw_addr;
            document.getElementById("WITH_SUM_PRICE").value = tw_sum; 
        }

      

	}	
	

	