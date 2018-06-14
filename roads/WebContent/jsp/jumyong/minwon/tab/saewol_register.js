



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

			parent.iFrameResizeTab("tab1");	//	ȭ�� RESIZE
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
		var tab = tabs.getElementsByTagName('a'); // �� ���
		var contents = document.getElementById('tabcontents');
		var content = getElementsByClassName('tabcontent',contents); // ������ ��� class
		var type = true; // �ѿ����� true / false
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

		//form.action = "saewol_registerprc.do";
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
		/*
		if(sel.value == '2')
			document.getElementById("UseSection").style.display = "block";
		else
			document.getElementById("UseSection").style.display = "none";
		*/
		
		var form 	= document.form;
		
		if(sel.value == '2')
		{
			var MUL_DIV = document.getElementById("MUL_DIV");
		  	
		  	var innerHtml = "";
			  	innerHtml += "<table id='MUL_TABLE' border='0' cellpadding='0' cellspacing='0' class='sub_stan'>";
				innerHtml += "	<tr id='MulDateSection'>";
			  	innerHtml += "		<td id='UseSection' style='display:block'>";
			  	innerHtml += "			<input id='PARTLY_PERIOD' maxlength='100' name='PARTLY_PERIOD' type='text' class='essential' style='width:400px' value='�Ͻ� ����Ⱓ�� �Է��� �ּ���. ��)09.06.06 ~ 09.2009.09.09' onclick=\"javascript:document.form.PARTLY_PERIOD.value = '';\">";
			 	innerHtml += "			&nbsp;&nbsp;��<input name='TOTAL_PERIOD' maxlength='5' type='text' class='essential' style='width:30px' value='' style='ime-mode:disabled' onKeyDown='nr_num_int(this);' onKeyUp='nr_num_int(this);' onKeyPress='nr_num_int(this);'>��";
			 	innerHtml += "		</td>";
			 	innerHtml += "	</tr>";
		  		innerHtml += "</table>";
		 	
		 	MUL_DIV.innerHTML = innerHtml;
		 	
		 	//������ �������
		 	document.getElementById("TD_REDUCTION_RATE").innerHTML = "������";
		 	document.getElementById("TD_REDUCTION_REASON").innerHTML = "������ ����";
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
  				innerHtml += "		<td onclick=\"javascript:click_plus_button('MUL_FROMDATE', this,'5');\">";
	  			innerHtml += "			<img id='plus_button' src='/img/add_icon.gif' style='display:block' style='CURSOR: Hand;'>";
		  		innerHtml += "		</td>";
		  		innerHtml += "		<td onclick=\"javascript:click_minus_button('MUL_FROMDATE', this);\">";
	  			innerHtml += "			<img id='minus_button' src='/img/del_icon3.gif' style='display:block' style='CURSOR: Hand;'>";
	  			innerHtml += "		</td>";
*/
		  		innerHtml += "	</tr>";
		  		innerHtml += "</table>";
		  		
		  	MUL_DIV.innerHTML = innerHtml;
		  	
		 	//������ ���л���
		 	document.getElementById("TD_REDUCTION_RATE").innerHTML = "������";
		 	document.getElementById("TD_REDUCTION_REASON").innerHTML = "������ ����";
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
	  		
		 	//������ �������
		 	document.getElementById("TD_REDUCTION_RATE").innerHTML = "������";
		 	document.getElementById("TD_REDUCTION_REASON").innerHTML = "������ ����";
		}
		
		parent.iFrameResizeTab("tab1");	//	ȭ�� RESIZE
	}

	function	Jumin_toaddr_Check()
	{
		var form 	= document.form;
		var	chk		= form.ADDR_CHECK.checked;

		if(chk	== true)
		{
			form.TONM.value			= form.NAME.value;
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
			
			form.ADDR_CHECK.value="0";
		}

	}
	
	function	Jumin_toaddr_Check2()
	{
		var form 		=	document.form;
		var	chk			=	form.ADDR_CHECK.checked;
		
		if(chk	== true)
		{
			form.TONM.value			= form.NAME.value;
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
	
	function Select_Jumyong_Jibun(){
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
			alert("�� �� : ���� ������ ������ �̹� ��ϵǾ��ֽ��ϴ�.");
		}
	}
	
	function	Select_UseType(sel)
	{
//		var idx = sel.selectedIndex;
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
			document.getElementById("USERTYPENAME").value		= "��õ/���Ÿ�";
			document.getElementById("UseType2").style.display 	= "block";	// ��õ,����
			
			document.getElementById("jucha2").style.display = "block";
			document.getElementById("jucha_value2").style.display = "block";
			document.getElementById("UseType3").style.display 	= "block";
			
		}
		else if(sel.value == '3')
		{
			document.getElementById("area").colSpan = 3;
			
			document.getElementById("jucha").style.display = "block";
			document.getElementById("jucha_value").style.display = "block";
			document.getElementById("USERTYPENAME").value		= "��õ/���Ÿ�";
			document.getElementById("UseType2").style.display 	= "block";	// ��õ,����
			
			document.getElementById("jucha2").style.display = "none";
			document.getElementById("jucha_value2").style.display = "none";
			document.getElementById("UseType3").style.display 	= "none";
		
			
			
		}
		else if(sel.value == '1')
		{
			document.getElementById("area").colSpan = 3;
			
			document.getElementById("jucha").style.display = "block";
			document.getElementById("jucha_value").style.display = "block";
			document.getElementById("USERTYPENAME").value		= "�������";
			document.getElementById("UseType1").style.display 	= "block";	//	����
			
			document.getElementById("jucha2").style.display = "none";
			document.getElementById("jucha_value2").style.display = "none";
			document.getElementById("UseType3").style.display 	= "none";
		}
		else{
			document.getElementById("doroname").colSpan= 3;
			document.getElementById("USERTYPENAME").value		= "";
		}

		document.getElementById("IFRM_PurposeCode").src="/jsp/common/purposeCode/purposeCode.jsp?SectionCode=" + sel.value + "&essential=1";
	}	

	function 	openZipcodePopup(post, addr)
	{
		var	post1	= post;
		var	addr1	= addr;

		var url 	= "/zipcode.do?openerPost=" + post1 + "&openerAddr=" + addr1;
		var winName = "�����ȣ�Է�";
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
		var tab = tabs.getElementsByTagName('a'); // �� ���
		var contents = document.getElementById('tabcontents');
		var content = getElementsByClassName('tabcontent',contents); // ������ ��� class
		
		//	������ ����
		if(form.NAME.value.length	< 1){
			str	+= "������/���θ��� �Է��ϼ���\n";
			alert(str);
			//parent.iFrameResizeTab("tab1");
			tabDisplay(tab,content,1);
			form.NAME.focus();
		}
		else if(form.jumin_ssn1.value.length < 6)
		{
			str	+= "�ֹ�(����)��ȣ�� �Էµ��� �ʾҰų�\n�ڸ����� Ʋ���ϴ�.";
			alert(str);
			tabDisplay(tab,content,1);
			form.jumin_ssn1.focus();
		}
		else if(form.jumin_ssn2.value.length < 7)
		{
			str	+= "�ֹ�(����)��ȣ�� �Էµ��� �ʾҰų�\n�ڸ����� Ʋ���ϴ�.";
			alert(str);
			tabDisplay(tab,content,1);
			form.jumin_ssn2.focus();
		}	
		else if(form.POST.value.length	< 1)
		{
			str	+= "�����ȣ�� �Է��ϼ���\n";
			alert(str);
			tabDisplay(tab,content,1);
			openZipcodePopup('form.POST', 'form.ADDR1');
		}
		else if(form.ADDR2.value.length	< 1)
		{
			str	+= "�� �ּҸ� �Է��ϼ���\n";
			alert(str);
			tabDisplay(tab,content,1);
			form.ADDR2.focus();
		}
		else if(form.TYPE.value.length	< 1)	//	������ ����
		{
			str	+= "���� ������ �Է��ϼ���\n";
			alert(str);
			tabDisplay(tab,content,2);
			form.TYPE.focus();
		}
		else if(form.SECTION.value.length	< 1)
		{
			str	+= "���� ������ �Է��ϼ���\n";
			alert(str);
			tabDisplay(tab,content,2);
			form.SECTION.focus();
		}
		else if(form.OWNER_SET.value.length	< 1)
		{
			str	+= "������ ������ �Է��ϼ���\n";
			alert(str);
			tabDisplay(tab,content,2);
			form.OWNER_SET.focus();
		}
		else if(form.TAX_SET.value.length	< 1)
		{
			str	+= "���� ������ �Է��ϼ���\n";
			alert(str);
			tabDisplay(tab,content,2);
			form.TAX_SET.focus();
		}
		else if(form.MUL_POST.value.length	< 1)
		{
			str	+= "�����ȣ�� �Է��ϼ���\n";
			alert(str);
			tabDisplay(tab,content,2);
			openZipcodePopup('form.MUL_POST', '');
		}
		else if(form.BJ_CD.value.length	< 1)
		{
			str	+= "������ �������� �Է��ϼ���.\n";
			alert(str);
			tabDisplay(tab,content,2);
			form.BJ_CD.focus();
		}
		else if(form.HJ_CD.value.length	< 1)
		{
			str	+= "������ �������� �Է��ϼ���\n";
			alert(str);
			tabDisplay(tab,content,2);
			form.HJ_CD.focus();
		}
		else if(form.SPC_CD.value.length	< 1)
		{
			str	+= "������ ���������� �Է��ϼ���\n";
			alert(str);
			tabDisplay(tab,content,2);
			form.SPC_CD.focus();
		}
		else if(form.BONBUN.value.length	< 1)
		{
			str	+= "������ ������ �Է��ϼ���\n";
			alert(str);
			tabDisplay(tab,content,2);
			form.BONBUN.focus();
		}
		else if(form.ROAD_BON.value.length	< 1)
		{
			str	+= "����(��õ) �ּҸ� �Է��ϼ���\n";
			alert(str);
			tabDisplay(tab,content,2);
			form.ROAD_BON.focus();
		}
		else if(form.MUL_POST.value.length	< 1)
		{
			str	+= "�����ȣ�� �Է��ϼ���\n";
			alert(str);
			tabDisplay(tab,content,2);
			form.MUL_POST.focus();
		}

		else if(IFRM_PurposeCode.PURPOSE_CD.value < 011)
		{
			str	+= "��������� �Է��ϼ���\n";
			alert(str);
			tabDisplay(tab,content,2);
			IFRM_PurposeCode.PURPOSE_CD.focus();
		}
		else if (IFRM_PurposeCode.isSelectOK()==false)
		{
			str += "��������� ��Ȯ�� �����ϼ���"
			alert(str);
			tabDisplay(tab,content,2);
		}
		else if(form.AREA_SIZE.value.length	< 1)
		{
			str	+= "��������� �Է��ϼ���\n";
			alert(str);
			tabDisplay(tab,content,2);
			form.AREA_SIZE.focus();
		}
//		else if(form.TYPE.value == '2' && form.RIVER_NM.value.length	< 1)
//		{
//				str	+= "��õ/���Ÿ��� �Է��ϼ���\n";
//				alert(str);
//				tabDisplay(tab,content,2);
//				form.RIVER_NM.focus();
//		}
//		else if(form.TYPE.value == '2' && form.RIVER_RANK.value.length	< 1)
//		{
//			str	+= "��õ����� �Է��ϼ���\n";
//			alert(str);
//			tabDisplay(tab,content,2);
//			form.RIVER_RANK.focus();
//		}
//		else if(form.TYPE.value == '3' && form.RIVER_NM.value.length	< 1)
//		{
//				str	+= "��õ/���Ÿ��� �Է��ϼ���\n";
//				alert(str);
//				tabDisplay(tab,content,2);
//				form.RIVER_NM.focus();
//		}		
		else if(form.SECTION.value	== '1' || form.SECTION.value	== '3'){
			if(form.MUL_FROMDATE.value.length	< 1)
			{
				str	+= "����Ⱓ�� �Է��ϼ���\n";
				alert(str);
				tabDisplay(tab,content,2);
				form.MUL_FROMDATE.focus();
			}
			else if(form.MUL_TODATE.value.length	< 1)
			{
				str	+= "����Ⱓ�� �Է��ϼ���\n";
				alert(str);
				tabDisplay(tab,content,2);
				form.MUL_TODATE.focus();
			}
		}else if(form.SECTION.value	== '2')
		{
			if(form.PARTLY_PERIOD.value.length	< 1 || form.PARTLY_PERIOD.value == "�Ͻ� ����Ⱓ�� �Է��� �ּ���. ��)09.06.06 ~ 09.2009.09.09")
			{
				str	+= "�Ͻ�����Ⱓ�� �Է��ϼ���\n";
				alert(str);
				tabDisplay(tab,content,2);
				form.PARTLY_PERIOD.focus();
			}
			else if(form.TOTAL_PERIOD.value.length	< 1)
			{
				str	+= "�Ͻ�����Ⱓ ���ϼ��� �Է��ϼ���\n";
				alert(str);
				tabDisplay(tab,content,2);
				form.TOTAL_PERIOD.focus();
			}
		}


		if(str	== "")
		{
			return	true;
		}
		
		//alert(str);

		return	false;
	}

	function	Init()
	{
		parent.iFrameResizeTab("tab1");
	//	IFRM_PurposeCode.PURPOSE_CD.className	= "essential";
	}
	
	
	
	// ��� ������ ��������
	function 	openTotalWith()
	{
		
		var form 	= document.form;
		var tabs = document.getElementById('tabmenu');
		var tab = tabs.getElementsByTagName('a'); // �� ���
		var contents = document.getElementById('tabcontents');
		var content = getElementsByClassName('tabcontent',contents); // ������
		var	str		= "";
		
		if(form.BJ_CD.value.length	< 1)
		{
			str	+= "��հ������� ���� ��ǥ������ �������� �����ϼ���.\n";
			alert(str);
			tabDisplay(tab,content,2);
			form.BJ_CD.focus();
		}
		else if(form.HJ_CD.value.length	< 1)
		{
			str	+= "��հ������� ���� ��ǥ������ �������� �����ϼ���\n";
			alert(str);
			tabDisplay(tab,content,2);
			form.HJ_CD.focus();
		}
		else if(form.SPC_CD.value.length	< 1)
		{
			str	+= "��հ������� ���� ��ǥ������ ������ �����ϼ���\n";
			alert(str);
			tabDisplay(tab,content,2);
			form.SPC_CD.focus();
		}
		else if(form.BONBUN.value.length	< 1)
		{
			str	+= "��հ������� ���� ��ǥ������ ������ �����ϼ���\n";
			alert(str);
			tabDisplay(tab,content,2);
			form.BONBUN.focus();
		}
		else{
			
			var bjCD = form.BJ_CD.value;
			var hjCD = form.HJ_CD.value;
			var spcCD = form.SPC_CD.value;
				
			var url 	= "/jumyong/minwon/total_with.do?bjCD=" + bjCD + "&hjCD=" + hjCD + "&spcCD=" + spcCD;
			var winName = "�������ּ�";
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
	