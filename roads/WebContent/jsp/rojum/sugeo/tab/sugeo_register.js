
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
	
	// 등록하기
	function RegisterPrc_tab1()
	{
		var	result	= DataCheck();
		

		if(result	==	false)
			return false;
		
		var form = document.form;
		
	}

	// 수거정보 수정하기
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
	


	// 수거정보만 데이터검사
	function	DataCheck()
	{
		var form 	= document.form;
		var	str		= "";
		
				
		if(form.CHG_ORG.value.length < 1)
		{
			str	+= "담당자 소속을 입력하세요. ";
			alert(str);
			form.CHG_ORG.focus();
		}
		else if(form.CHG_NM.value.length < 1)
		{
			str	+= "담당자 명을 입력하세요. ";
			alert(str);
			form.CHG_NM.focus();
		}
		else if(form.TAX_SET.value.length < 1)
		{
			str	+= "세입구분을 선택하세요. ";
			alert(str);
			form.TAX_SET.focus();
		}
		else if(form.REM_DATE.value.length < 1)
		{
			str	+= "수거일자를 입력하세요. ";
			alert(str);
			form.REM_DATE.focus();
		}
		else if(form.REM_DATE_HH.value.length < 1)
		{
			str	+= "수거 시간을 입력하세요. ";
			alert(str);
			form.REM_DATE_HH.focus();
		}
		else if(form.REM_DATE_MM.value.length < 1)
		{
			str	+= "수거 시간을 입력하세요. ";
			alert(str);
			form.REM_DATE_MM.focus();
		}
		
		else if(form.REM_MULCD.value.length < 1)
		{
			str	+= "물건 종류를 선택하세요. ";
			alert(str);
			form.REM_MULCD.focus();
		}
		else if(form.REM_MULNM.value.length < 1)
		{
			str	+= "물건명을 입력하세요. ";
			alert(str);
			form.REM_MULNM.focus();
		}
		else if(form.REM_BJCD.value.length < 1)
		{
			str	+= "법정동을  선택하세요. ";
			alert(str);
			form.REM_BJCD.focus();
		}
		else if(form.REM_BJCD.value.length < 1)
		{
			str	+= "행정동을 선택하세요. ";
			alert(str);
			form.REM_BJCD.focus();
		}
		else if(form.REM_SPCCD.value.length < 1)
		{
			str	+= "번지종류를 입력하세요. ";
			alert(str);
			form.REM_SPCCD.focus();
		}
		else if(form.REM_BONBUN.value.length < 1)
		{
			str	+= "본번을 입력하세요. ";
			alert(str);
			form.REM_BONBUN.focus();
		}
		else if(form.REM_AREA.value.length < 1)
		{
			str	+= "점용면적을 입력하세요. ";
			alert(str);
			form.REM_AREA.focus();
		}
		else if(form.REM_SVFROM.value.length < 1)
		{
			str	+= "보관 시작일을 입력하세요. ";
			alert(str);
			form.REM_SVFROM.focus();
		}
		else if(form.REM_SVTO.value.length < 1)
		{
			str	+= "보관 만료일을 입력하세요. ";
			alert(str);
			form.REM_SVTO.focus();
		}
		else if(form.REM_BAD_YN.value.length < 1)
		{
			str	+= "변질물 유무를 선택하세요. ";
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
	
	//	다른 탭의 데이터를 점용인 정보로 가져온다.
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
	