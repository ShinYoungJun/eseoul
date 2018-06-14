
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
		var tab = tabs.getElementsByTagName('a'); // �� ���
		var contents = document.getElementById('tabcontents');
		var content = getElementsByClassName('tabcontent',contents); // ������ ��� class
		var type = true; // �ѿ����� true / false
		for (var i=0; i<tab.length; i++) {
			tabDisplay(tab,content,0,true);
			tabAct(tab,content,i,type);
		}
	}

	// ����ϱ�
	function RegisterPrc_tab1()
	{
		var	result	= DataCheck();
		//var result	=	"true";

		if(result	==	false)
			return false;
		
		var form = document.form;
		
		//if( confirm("����  �Ͻðڽ��ϱ�? ") ){
			//top.frames[2].location="sugeo_registerprc.do";		//������ ������ ��ũ
		//	form.action = "sugeo_registerprc.do";					// ���Ź�ó�� �������� �̵�
		//	form.submit();
		//}
	}

	// �������� �����ϱ�
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
	
	// ���Ź�ǰ �����ϱ�
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
	
	// ���Ź�ǰ ���
	function goInsert_goods(mul_no){
		
		
		var	result2	= DataCheck2();

		if(result2	==	false)
			return;
			
		var form = document.form;
		form.action = "/gapan/sugeo/goods_registerprc.do?showTab=showTab&mul_no="+mul_no+"&message=��ϵǾ����ϴ�.";
		form.submit();
	
	}
	

	// ��������, ���Ź�ǰ  ������üũ
	function	DataCheck()
	{
		var form 	= document.form;
		var	str		= "";
		
		var tabs = document.getElementById('tabmenu');
		var tab = tabs.getElementsByTagName('a'); // �� ���
		var contents = document.getElementById('tabcontents');
		var content = getElementsByClassName('tabcontent',contents); // ������ ��� class


		if(form.rem_date.value.length < 1)
		{
			str	+= "���� �Ͻø� �Է��ϼ���. ";
			alert(str);
			tabDisplay(tab,content,0);
			form.rem_date.focus();
			//return;
		}
		else if(form.rem_date_hh.value.length < 1)
		{
			str	+= "���� �Ͻ� �ð��� �Է��ϼ���.";
			alert(str);
			tabDisplay(tab,content,0);
			form.rem_date_hh.focus();
			//return;
		}
		else if(form.rem_date_mm.value.length	< 1)
		{
			str	+= "���� �Ͻ� ���� �Է��ϼ���.";
			alert(str);
			tabDisplay(tab,content,0);
			form.rem_date_mm.focus();
			//return;
		}
		else if(form.rem_mulcd.value.length	< 1)
		{
			str	+= "���Ź�ǰ�� �����ϼ���. ";
			alert(str);
			tabDisplay(tab,content,0);
			form.rem_mulcd.focus();
			//return;
		}
		else if(form.rem_mulnm.value.length	< 1)
		{
			str	+= "���Ź�ǰ ������ �Է��ϼ���. ";
			alert(str);
			tabDisplay(tab,content,0);
			form.rem_mulnm.focus();
			//return;
		}
		else if(form.rem_bjcd.value.length	< 1)
		{
			str	+= "������ġ �������� �����ϼ���. ";
			alert(str);
			tabDisplay(tab,content,0);
			form.rem_bjcd.focus();
			//return;
		}
		/*else if(form.rem_hjcd.value.length	< 1)
		{
			str	+= "������ġ �������� �����ϼ���. ";
			alert(str);
			tabDisplay(tab,content,0);
			form.rem_hjcd.focus();
			//return;
		}*/
		else if(form.rem_addr.value.length	< 1)
		{
			str	+= "������ġ �ֺ������� �Է��ϼ���. ";
			alert(str);
			tabDisplay(tab,content,0);
			form.rem_addr.focus();
			//return;
		}
		/*else if(form.rem_nm.value.length	< 1)
		{
			str	+= "�����ڸ��� �Է��ϼ���. ";
			alert(str);
			tabDisplay(tab,content,0);
			form.rem_nm.focus();
			//return;
		}
		else if(form.rem_area.value.length	< 1)
		{
			str	+= "���������� �Է��ϼ���. ";
			alert(str);
			tabDisplay(tab,content,0);
			form.rem_area.focus();
			//return;
		}
		else if(form.rem_svfrom.value.length < 1)
		{
			str	+= "������������ �Է��ϼ���. ";
			alert(str);
			tabDisplay(tab,content,0);
			form.rem_svfrom.focus();
			//return;
		}
		else if(form.rem_svto.value.length	< 1)
		{
			str	+= "������������ �Է��ϼ���. ";
			alert(str);
			tabDisplay(tab,content,0);
			form.rem_svto.focus();
			//return;
		}
		else if(form.rem_svplace.value.length	< 1)
		{
			str	+= "������Ҹ� �Է��ϼ���. ";
			alert(str);
			tabDisplay(tab,content,0);
			form.rem_svplace.focus();
			//return;
		}
		else if(form.rem_badfrom.value.length	< 1)
		{
			str	+= "������ ���� �������� �Է��ϼ���. ";
			alert(str);
			tabDisplay(tab,content,0);
			form.rem_badfrom.focus();
			//return;
		}
		else if(form.rem_badto.value.length	< 1)
		{
			str	+= "������ ���� �������� �Է��ϼ���. ";
			alert(str);
			tabDisplay(tab,content,0);
			form.rem_badto.focus();
			//return;
		}		
		else if(form.rem_badto.value.length	< 1)
		{
			str	+= "������ ������ �Է��ϼ���. ";
			alert(str);
			tabDisplay(tab,content,0);
			form.rem_badto.focus();
			//return;
		}
		else if(form.chg_org.value.length	< 1)
		{
			str	+= "�Ҽ��� �Է��ϼ���. ";
			alert(str);
			tabDisplay(tab,content,0);
			form.chg_org.focus();
			//return;
		}
		else if(form.ann_date.value.length	< 1)
		{
			str	+= "�������ڸ� �Է��ϼ���. ";
			alert(str);
			tabDisplay(tab,content,0);
			form.ann_date.focus();
			//return;
		}
		else if(form.chg_nm.value.length	< 1)
		{
			str	+= "����/������ �Է��ϼ���. ";
			alert(str);
			tabDisplay(tab,content,0);
			form.chg_nm.focus();
			//return;
		}
		else if(form.ann_no.value.length	< 1)
		{
			str	+= "�����ȣ�� �Է��ϼ���. ";
			alert(str);
			tabDisplay(tab,content,0);
			form.ann_no.focus();
			//return;
		}*/
		else if(form.goods_nm.value.length	< 1)
		{
			str	+= "���Ź�ǰ���� �Է��ϼ���. ";
			alert(str);
			tabDisplay(tab,content,1);
			form.goods_nm.focus();
			//return;
		} 
		else if(form.goods_cnt.value.length	< 1)
		{
			str	+= "������ �Է��ϼ���. ";
			alert(str);
			tabDisplay(tab,content,1);
			form.goods_cnt.focus();
			//return;
		}
		else if(form.goods_status.value.length	< 1)
		{
			str	+= "ó����Ȳ�� �����ϼ���. ";
			alert(str);
			tabDisplay(tab,content,1);
			form.goods_status.focus();
			//return;
		}
		/*else if(form.goods_svfrom.value.length	< 1)
		{
			str	+= "�����Ⱓ �������� �Է��ϼ���. ";
			alert(str);
			tabDisplay(tab,content,1);
			form.goods_svfrom.focus();
			//return;
		}
		else if(form.goods_svto.value.length	< 1)
		{
			str	+= "�����Ⱓ �������� �Է��ϼ���. ";
			alert(str);
			tabDisplay(tab,content,1);
			form.goods_svto.focus();
			//return;
		}
		else if(form.goods_svnm.value.length	< 1)
		{
			str	+= "������Ҹ� �Է��ϼ���. ";
			alert(str);
			tabDisplay(tab,content,1);
			form.goods_svnm.focus();
			//return;
		}
		
		else if(form.goods_date.value.length	< 1)
		{
			str	+= "ó�����ڸ� �Է��ϼ���. ";
			alert(str);
			tabDisplay(tab,content,1);
			form.goods_date.focus();
			//return;
		}
		else if(form.goods_bigo.value.length	< 1)
		{
			str	+= "Ư�̻����� �Է��ϼ���. ";
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
	
	// ���������� �����Ͱ˻�
	function	DataCheck1()
	{
		var form 	= document.form;
		var	str		= "";
		
		var tabs = document.getElementById('tabmenu');
		var tab = tabs.getElementsByTagName('a'); // �� ���
		var contents = document.getElementById('tabcontents');
		var content = getElementsByClassName('tabcontent',contents); // ������ ��� class


		if(form.rem_date.value.length < 1)
		{
			str	+= "���� �Ͻø� �Է��ϼ���. ";
			alert(str);
			tabDisplay(tab,content,0);
			form.rem_date.focus();
			//return;
		}
		else if(form.rem_date_hh.value.length < 1)
		{
			str	+= "���� �Ͻ� �ð��� �Է��ϼ���.";
			alert(str);
			tabDisplay(tab,content,0);
			form.rem_date_hh.focus();
			//return;
		}
		else if(form.rem_date_mm.value.length	< 1)
		{
			str	+= "���� �Ͻ� ���� �Է��ϼ���.";
			alert(str);
			tabDisplay(tab,content,0);
			form.rem_date_mm.focus();
			//return;
		}
		else if(form.rem_mulcd.value.length	< 1)
		{
			str	+= "���Ź�ǰ�� �����ϼ���. ";
			alert(str);
			tabDisplay(tab,content,0);
			form.rem_mulcd.focus();
			//return;
		}
		else if(form.rem_mulnm.value.length	< 1)
		{
			str	+= "���Ź�ǰ ������ �Է��ϼ���. ";
			alert(str);
			tabDisplay(tab,content,0);
			form.rem_mulnm.focus();
			//return;
		}
		else if(form.rem_bjcd.value.length	< 1)
		{
			str	+= "������ġ �������� �����ϼ���. ";
			alert(str);
			tabDisplay(tab,content,0);
			form.rem_bjcd.focus();
			//return;
		}
		/*else if(form.rem_hjcd.value.length	< 1)
		{
			str	+= "������ġ �������� �����ϼ���. ";
			alert(str);
			tabDisplay(tab,content,0);
			form.rem_hjcd.focus();
			//return;
		}*/
		else if(form.rem_addr.value.length	< 1)
		{
			str	+= "������ġ �ֺ������� �Է��ϼ���. ";
			alert(str);
			tabDisplay(tab,content,0);
			form.rem_addr.focus();
			//return;
		}
		/*else if(form.rem_nm.value.length	< 1)
		{
			str	+= "�����ڸ��� �Է��ϼ���. ";
			alert(str);
			tabDisplay(tab,content,0);
			form.rem_nm.focus();
			//return;
		}
		else if(form.rem_area.value.length	< 1)
		{
			str	+= "���������� �Է��ϼ���. ";
			alert(str);
			tabDisplay(tab,content,0);
			form.rem_area.focus();
			//return;
		}
		else if(form.rem_svfrom.value.length < 1)
		{
			str	+= "������������ �Է��ϼ���. ";
			alert(str);
			tabDisplay(tab,content,0);
			form.rem_svfrom.focus();
			//return;
		}
		else if(form.rem_svto.value.length	< 1)
		{
			str	+= "������������ �Է��ϼ���. ";
			alert(str);
			tabDisplay(tab,content,0);
			form.rem_svto.focus();
			//return;
		}
		else if(form.rem_svplace.value.length	< 1)
		{
			str	+= "������Ҹ� �Է��ϼ���. ";
			alert(str);
			tabDisplay(tab,content,0);
			form.rem_svplace.focus();
			//return;
		}
		else if(form.rem_badfrom.value.length	< 1)
		{
			str	+= "������ ���� �������� �Է��ϼ���. ";
			alert(str);
			tabDisplay(tab,content,0);
			form.rem_badfrom.focus();
			//return;
		}
		else if(form.rem_badto.value.length	< 1)
		{
			str	+= "������ ���� �������� �Է��ϼ���. ";
			alert(str);
			tabDisplay(tab,content,0);
			form.rem_badto.focus();
			//return;
		}		
		else if(form.rem_badto.value.length	< 1)
		{
			str	+= "������ ������ �Է��ϼ���. ";
			alert(str);
			tabDisplay(tab,content,0);
			form.rem_badto.focus();
			//return;
		}
		else if(form.chg_org.value.length	< 1)
		{
			str	+= "�Ҽ��� �Է��ϼ���. ";
			alert(str);
			tabDisplay(tab,content,0);
			form.chg_org.focus();
			//return;
		}
		else if(form.ann_date.value.length	< 1)
		{
			str	+= "�������ڸ� �Է��ϼ���. ";
			alert(str);
			tabDisplay(tab,content,0);
			form.ann_date.focus();
			//return;
		}
		else if(form.chg_nm.value.length	< 1)
		{
			str	+= "����/������ �Է��ϼ���. ";
			alert(str);
			tabDisplay(tab,content,0);
			form.chg_nm.focus();
			//return;
		}
		else if(form.ann_no.value.length	< 1)
		{
			str	+= "�����ȣ�� �Է��ϼ���. ";
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
	
	
	// ���Ź�ǰ�� ������ �˻� 
	function DataCheck2(){
	
		var form 	= document.form;
		var	str		= "";
		
		var tabs = document.getElementById('tabmenu');
		var tab = tabs.getElementsByTagName('a'); // �� ���
		var contents = document.getElementById('tabcontents');
		var content = getElementsByClassName('tabcontent',contents); // ������ ��� class
	
		if(form.goods_nm.value.length	< 1)
		{
			str	+= "���Ź�ǰ���� �Է��ϼ���. ";
			alert(str);
			tabDisplay(tab,content,1);
			form.goods_nm.focus();
			//return;
		}
		else if(form.goods_cnt.value.length	< 1)
		{
			str	+= "������ �Է��ϼ���. ";
			alert(str);
			tabDisplay(tab,content,1);
			form.goods_cnt.focus();
			//return;
		}
		else if(form.goods_svfrom.value.length	< 1)
		{
			str	+= "�����Ⱓ �������� �Է��ϼ���. ";
			alert(str);
			tabDisplay(tab,content,1);
			form.goods_svfrom.focus();
			//return;
		}
		else if(form.goods_svto.value.length	< 1)
		{
			str	+= "�����Ⱓ �������� �Է��ϼ���. ";
			alert(str);
			tabDisplay(tab,content,1);
			form.goods_svto.focus();
			//return;
		}
		else if(form.goods_status.value.length	< 1)
		{
			str	+= "ó����Ȳ�� �����ϼ���. ";
			alert(str);
			tabDisplay(tab,content,1);
			form.goods_status.focus();
			//return;
		}
		/*else if(form.goods_svnm.value.length	< 1)
		{
			str	+= "������Ҹ� �Է��ϼ���. ";
			alert(str);
			tabDisplay(tab,content,1);
			form.goods_svnm.focus();
			//return;
		}
		
		else if(form.goods_date.value.length	< 1)
		{
			str	+= "ó�����ڸ� �Է��ϼ���. ";
			alert(str);
			tabDisplay(tab,content,1);
			form.goods_date.focus();
			//return;
		}
		else if(form.goods_bigo.value.length	< 1)
		{
			str	+= "Ư�̻����� �Է��ϼ���. ";
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
	
	//	�ٸ� ���� �����͸� ������ ������ �����´�.
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
			document.getElementById("USERTYPENAME").value		= "��õ/���Ÿ�";
			document.getElementById("UseType2").style.display 	= "block";	//	��õ, ����
		}
		else if(sel.value == '1')
		{
			document.getElementById("jucha").style.display = "";
			document.getElementById("jucha_value").style.display = "";
			document.getElementById("USERTYPENAME").value		= "�������";
			document.getElementById("UseType1").style.display 	= "block";	//	����
		}
		else{
			document.getElementById("doroname").colSpan=[3];
			document.getElementById("USERTYPENAME").value		= "";
		}
		
	//	else if(sel.value == '4')						//	����
	//		document.getElementById("UseType1").style.display = "block";

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
	