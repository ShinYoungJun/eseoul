
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
	
	// ����ϱ�
	function RegisterPrc_tab1()
	{
		var	result	= DataCheck();
		

		if(result	==	false)
			return false;
		
		var form = document.form;
		
	}

	// �������� �����ϱ�
	function	goModify_info(mul_no)
	{	
		var	result1	= DataCheck();
		if(result1	==	false){
			return;
		}
		
		var form = document.form;
		
		form.action = "sugeo_modify.do";
		form.submit();
	}
	
	
	function	Search()
	{
		var form = document.form;

		form.action = "search.do";
		form.submit();
	}
	


	// ���������� �����Ͱ˻�
	function	DataCheck()
	{
		var form 	= document.form;
		var	str		= "";
		
				
		if(form.CHG_ORG.value.length < 1)
		{
			str	+= "����� �Ҽ��� �Է��ϼ���. ";
			alert(str);
			form.CHG_ORG.focus();
		}
		else if(form.CHG_NM.value.length < 1)
		{
			str	+= "����� ���� �Է��ϼ���. ";
			alert(str);
			form.CHG_NM.focus();
		}
		else if(form.TAX_SET.value.length < 1)
		{
			str	+= "���Ա����� �����ϼ���. ";
			alert(str);
			form.TAX_SET.focus();
		}
		else if(form.REM_DATE.value.length < 1)
		{
			str	+= "�������ڸ� �Է��ϼ���. ";
			alert(str);
			form.REM_DATE.focus();
		}
		else if(form.REM_DATE_HH.value.length < 1)
		{
			str	+= "���� �ð��� �Է��ϼ���. ";
			alert(str);
			form.REM_DATE_HH.focus();
		}
		else if(form.REM_DATE_MM.value.length < 1)
		{
			str	+= "���� �ð��� �Է��ϼ���. ";
			alert(str);
			form.REM_DATE_MM.focus();
		}
		
		else if(form.REM_MULCD.value.length < 1)
		{
			str	+= "���� ������ �����ϼ���. ";
			alert(str);
			form.REM_MULCD.focus();
		}
		else if(form.REM_MULNM.value.length < 1)
		{
			str	+= "���Ǹ��� �Է��ϼ���. ";
			alert(str);
			form.REM_MULNM.focus();
		}
		else if(form.REM_BJCD.value.length < 1)
		{
			str	+= "��������  �����ϼ���. ";
			alert(str);
			form.REM_BJCD.focus();
		}
		else if(form.REM_BJCD.value.length < 1)
		{
			str	+= "�������� �����ϼ���. ";
			alert(str);
			form.REM_BJCD.focus();
		}
		else if(form.REM_SPCCD.value.length < 1)
		{
			str	+= "���������� �Է��ϼ���. ";
			alert(str);
			form.REM_SPCCD.focus();
		}
		else if(form.REM_BONBUN.value.length < 1)
		{
			str	+= "������ �Է��ϼ���. ";
			alert(str);
			form.REM_BONBUN.focus();
		}
		else if(form.REM_AREA.value.length < 1)
		{
			str	+= "��������� �Է��ϼ���. ";
			alert(str);
			form.REM_AREA.focus();
		}
		else if(form.REM_SVFROM.value.length < 1)
		{
			str	+= "���� �������� �Է��ϼ���. ";
			alert(str);
			form.REM_SVFROM.focus();
		}
		else if(form.REM_SVTO.value.length < 1)
		{
			str	+= "���� �������� �Է��ϼ���. ";
			alert(str);
			form.REM_SVTO.focus();
		}
		else if(form.REM_BAD_YN.value.length < 1)
		{
			str	+= "������ ������ �����ϼ���. ";
			alert(str);
			form.REM_BAD_YN.focus();
		}

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
	