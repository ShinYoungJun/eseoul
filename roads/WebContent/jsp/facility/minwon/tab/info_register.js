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
			document.getElementById("USERTYPENAME").value		= "��õ/���Ÿ�";
			document.getElementById("UseType2").style.display 	= "block";	//	��õ, ����
		}
		else if(sel.value == '1')
		{
			document.getElementById("USERTYPENAME").value		= "�������";
			document.getElementById("UseType1").style.display 	= "block";	//	����
		}
		else
			document.getElementById("USERTYPENAME").value		= "";
		
	//	else if(sel.value == '4')						//	����
	//		document.getElementById("UseType1").style.display = "block";
		document.getElementById("IFRM_PurposeCode").src="/jsp/common/purposeCode/purposeCode.jsp?SectionCode=" + sel.value + "&essential=1";
	}	

	function	Select_UseSection(sel)
	{
		if(sel.value == '2')
			document.getElementById("UseSection").style.display = "block";	//	����
		else
			document.getElementById("UseSection").style.display = "none";

		parent.iFrameResizeTab("tab1");	//	ȭ�� RESIZE
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

	//���Խ��� 2009.06.04 ���¿�
	function 	openCorpcodePopup(corpNm, office, corpCd)	//corpNm : ���θ�, office : ������, corpCd : �ڵ尪
	{
		var	office1	= corpNm;
		var	jijum1	= office;
		var	code1	= corpCd;
		
		var url 	= "/corpcode.do?openerCorpNm=" + office1 + "&openerOffice=" + jijum1 + "&openerCorpCd=" + code1;
		var winName = "�����ü�Է�";
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
	
	//���Խ��� 2009.07.06 ���¿�
	function 	minusFacilityPopup(corp_cd, gu_code, purpose_cd)	//corp_cd : ���θ�, gu_code : ������, purpose_cd : �ڵ尪
	{
		var	corp_cd	= corp_cd;
		var	gu_code	= gu_code;
		var	purpose_cd	= purpose_cd;
		
		var url 	= "/corpcode.do?corp_cd=" + corp_cd + "&gu_code=" + gu_code + "&purpose_cd=" + purpose_cd;
		var winName = "�����ü�Է�";
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
	
	
	//�������� 2009.06.04 ���¿�
	
	function	DataCheck()
	{
		var form 	= document.form;
		var	str		= "";
		var tabs = document.getElementById('tabmenu');
		var tab = tabs.getElementsByTagName('a'); // �� ���
		var contents = document.getElementById('tabcontents');
		var content = getElementsByClassName('tabcontent',contents); // ������ ��� class
		//********** BEGIN_KANG_20120409
		/*
		if(form.NAME.value.length	< 1)	//	������ ����
		{
			str	+= "������(���θ�)�� �Է��ϼ���\n";
			alert(str);
			tabDisplay(tab,content,1);
			
			openCorpcodePopup('form.NAME','form.OFFICE','form.CORP_CD');

		}
		else if(form.jumin_ssn1.value.length	< 6)
		{
			str	+= "�ֹ�(����)��ȣ�� �Էµ��� �ʾҰų�\n�ڸ����� Ʋ���ϴ�.";	
			alert(str);
			tabDisplay(tab,content,1);
			form.jumin_ssn1.focus();
		}
		else if(form.jumin_ssn2.value.length	< 7)
		{
			str	+= "�ֹ�(����)��ȣ�� �Էµ��� �ʾҰų�\n�ڸ����� Ʋ���ϴ�.";	
			alert(str);
			tabDisplay(tab,content,1);
			form.jumin_ssn2.focus();
		}
		else if(form.BON_POST.value.length	< 1){
			str	+= "������ �����ȣ�� �Է��ϼ���\n";
			alert(str);
			tabDisplay(tab,content,1);
			//form.BON_POST.focus();
			openZipcodePopup('form.BON_POST', 'form.BON_ADDR1');
		}
		*/
		if(form.NAME.value.length	< 1)	//	������ ����
		{
			str	+= "������(���θ�)�� �Է��ϼ���\n �ϴܿ� ���������������� ������ ������ �Էµ˴ϴ�.";
			alert(str);
			tabDisplay(tab,content,1);
		}
		//********** END_KANG_20120409
//		else if(form.BON_ADDR2.value.length	< 1){
//			str	+= "������ �� �ּҸ� �Է��ϼ���\n";
//			alert(str);
//			tabDisplay(tab,content,1);
//			form.BON_ADDR2.focus();
//		}
		else if(form.XMLDATA.value.length < 10)
		{
			str	+= "�ü��� ������ 1���̻� ����ؾ� �մϴ�.\n";
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
	
	