
	//	시설물정보 관련 함수만 따로 모아둠 
	//	심도 제외
	function	Sisul_Register()
	{
		var form = document.form;
		var	value;
		var	result	= Sisul_DataCheck();

		if(result	==	false)
			return;
		form.PURPOSE_CD.value	= IFRM_PurposeCode.document.getElementById("PURPOSE_CD").value;	
		value	= IFRM_PurposeCode.document.getElementById("PURPOSE1");
		form.PURPOSE1_NM.value	= value[value.selectedIndex].text;
		value	= IFRM_PurposeCode.document.getElementById("PURPOSE2");
		form.PURPOSE2_NM.value	= value[value.selectedIndex].text;
		value	= IFRM_PurposeCode.document.getElementById("PURPOSE3");
		form.PURPOSE3_NM.value	= value[value.selectedIndex].text;

		insertNode();	//	노드에 추가
		//Clear();
		makeList();
		
		var addr_fix = document.getElementById("addr_fix");
		var SISUL_POST = form.SISUL_POST.value;
		var SISUL_ADDR1 = form.SISUL_ADDR1.value;
		var SISUL_ADDR2 = form.SISUL_ADDR2.value;
		
		
		var innerHtml =	"<table border='0' cellpadding='0' cellspacing='0' class='sub_stan'>"; 
		innerHtml += "<tr>";
		innerHtml += "	<td><input name='SISUL_POST' type='text' class='essential' style='width:50px' onFocus='Jumin_toaddr_Check();' value='"+SISUL_POST+"' readonly></td>";
		//********** BEGIN_KANG_20120409		
		//		innerHtml += "	<td><a href='javascript:openZipcodePopup('form.SISUL_POST', '');'><img src='/img/search_icon.gif' alt='검색' width='56' height='18' border='0'></a></td>";
		innerHtml += "	<td><a href='javascript:openZipcodePopup_new('form.SISUL_POST','','','','','','','','','');'><img src='/img/search_icon.gif' alt='검색' width='56' height='18' border='0'></a></td>";
		//********** END_KANG_20120409
		innerHtml += "	<td bgcolor='eaeaea' class='table_bl_left'>";
			
		innerHtml += 	 	"&nbsp;";
        
        innerHtml += "    	<select id='BJ_CD' name='BJ_CD' class='essential' style='width:80px' >";
        innerHtml += "        	${bjdong_code} ";
        innerHtml += "      	</select>";
        
        innerHtml += "    &nbsp;";
        innerHtml += "    	<select id='HJ_CD' name='HJ_CD' class='essential' style='width:80px' >";
        innerHtml += "       		${hjdong_code}";
        innerHtml += "    	</select>";
        
	    innerHtml += "        &nbsp;/&nbsp;";
	    innerHtml += "        	<select id='SPC_CD' name='SPC_CD' class='essential' style='width:75px' >";
        innerHtml += "       		${mul_spc_cd}";
        innerHtml += "    	</select>";
        innerHtml += "    	&nbsp;";
        innerHtml += "    	<input type='text' id='BONBUN'  name='BONBUN' class='essential' style='width:30px' maxlength='4'> - <input type='text' id='BUBUN' name='BUBUN' class='essential' style='width:30px' maxlength='4'> &nbsp;번지"; 
		innerHtml += "	</td> "; 
		innerHtml += "</tr>";
		innerHtml += "<tr>	";				
													
		innerHtml += "	<td colspan='3'><input name='SISUL_ADDR2' type='text' class='essential' style='width:300px' onclick='javascript:setSisul_addr1();' value='"+SISUL_ADDR2+"'>";
		innerHtml += "	<input name='SISUL_ADDR1' type='text' class='essential' style='width:200px' value='"+SISUL_ADDR1+"'>";
		innerHtml += "	</td>";
		innerHtml += "</tr>";
		innerHtml += "</table>";
		
/*		var innerHtml = "<table border='0' cellpadding='0' cellspacing='0' class='sub_stan'>";
			innerHtml += "	<tr>";
			innerHtml += "		<td><input name='SISUL_POST' value='" + SISUL_POST + "' type='text' class='essential' style='width:50px' onFocus='Jumin_toaddr_Check();' readonly></td>";
			innerHtml += "		<td bgcolor='eaeaea' class='table_bl_left'><input name='SISUL_ADDR1' value='" + SISUL_ADDR1 + "' type='text' class='essential' style='width:250px' onFocus='Jumin_toaddr_Check();' readonly>";
			innerHtml += "		<input name='SISUL_ADDR2' value='" + SISUL_ADDR2 + "' type='text' class='essential' style='width:250px' readonly></td>";
			innerHtml += "	</tr>";
			innerHtml += "</table>";			
		*/	
	
		addr_fix.innerHTML = innerHtml;
		
		parent.iFrameResizeTab("tab1");	//	화면 RESIZE
	}
	
	function	view_list(num)
	{
		var	obj		= document.getElementById("XMLDATA").value;
        var xmlDom 	= new ActiveXObject("Microsoft.XMLDOM");
        var form 	= document.form;
		
        xmlDom.async	= false;
		xmlDom.loadXML(obj);
		
		var objRoot	= xmlDom.documentElement;//xmlDom.documentElement("ROOT").cloneNode(true);

		var	fChild	= getCheckChild(objRoot, num);
		
		var	PURPOSE_CD				= fChild.getElementsByTagName("PURPOSE_CD").item(0).text;
	//	var	DEPTH_CK				= fChild.getElementsByTagName("DEPTH_CK").item(0).text;
		
		form.LISTSEQ.value			= num;
/*		form.ADDR_CK.checked		= false;
		form.SISUL_ADDR_CK.checked	= false;
*/
		//form.PURPOSESEBU.value		= fChild.getElementsByTagName("PURPOSESEBU_CD").item(0).text;
		form.PURPOSESEBU_CD.value		= fChild.getElementsByTagName("PURPOSESEBU_CD").item(0).text;
		
		//document.getElementById("IFRM_PurposeCode").src="/jsp/common/purposeCode/purposeCode.jsp?SectionCode=4&PURPOSE_CD=" + PURPOSE_CD + "&essential=1";

		form.SECTION.value			= fChild.getElementsByTagName("SECTION").item(0).text;
		form.OWNER_SET.value		= fChild.getElementsByTagName("OWNER_SET").item(0).text;
		form.TAX_SET.value			= fChild.getElementsByTagName("TAX_SET").item(0).text;
		form.STANDARD.value			= fChild.getElementsByTagName("STANDARD").item(0).text;
		form.QUANTITY.value			= fChild.getElementsByTagName("QUANTITY").item(0).text;
		form.DEPTH_CK.value			= fChild.getElementsByTagName("DEPTH_CK").item(0).text;
		form.DEPTH_NUM.value		= fChild.getElementsByTagName("DEPTH_NUM").item(0).text;
		form.MUL_FROMDATE.value		= fChild.getElementsByTagName("MUL_FROMDATE").item(0).text;
		form.MUL_TODATE.value		= fChild.getElementsByTagName("MUL_TODATE").item(0).text;
		form.PARTLY_PERIOD.value	= fChild.getElementsByTagName("PARTLY_PERIOD").item(0).text;
		form.TOTAL_PERIOD.value		= fChild.getElementsByTagName("TOTAL_PERIOD").item(0).text;
/*		form.BJ_CD.value			= fChild.getElementsByTagName("BJ_CD").item(0).text;
		form.HJ_CD.value			= fChild.getElementsByTagName("HJ_CD").item(0).text;
		form.SAN_CK.value			= fChild.getElementsByTagName("SAN_CK").item(0).text;
		form.BONBUN.value			= fChild.getElementsByTagName("BONBUN").item(0).text;
		form.BUBUN.value			= fChild.getElementsByTagName("BUBUN").item(0).text;
		var	ADDR_CK					= fChild.getElementsByTagName("ADDR_CK").item(0).text;
		var	SISUL_ADDR_CK			= fChild.getElementsByTagName("SISUL_ADDR_CK").item(0).text;
		form.SISUL_ADDR.value		= fChild.getElementsByTagName("SISUL_ADDR").item(0).text;
*/
		form.WORK_FROMDATE.value	= fChild.getElementsByTagName("WORK_FROMDATE").item(0).text;
		form.WORK_TODATE.value		= fChild.getElementsByTagName("WORK_TODATE").item(0).text;
		form.COMPLETION_DATE.value	= fChild.getElementsByTagName("COMPLETION_DATE").item(0).text;
		form.EXE_INFO.value			= fChild.getElementsByTagName("EXE_INFO").item(0).text;
		form.SISUL_POST.value		= fChild.getElementsByTagName("SISUL_POST").item(0).text;
		form.SISUL_ADDR1.value		= fChild.getElementsByTagName("SISUL_ADDR1").item(0).text;
		form.SISUL_ADDR2.value		= fChild.getElementsByTagName("SISUL_ADDR2").item(0).text;
		form.PURPOSESEBU_CD.value	= fChild.getElementsByTagName("PURPOSESEBU_CD").item(0).text;
	}

	function	Delete(num)
	{
		deleteNode(num);
		makeList();
		
		parent.iFrameResizeTab("tab1");	//	화면 RESIZE
			
	}
	
	function	Sisul_Init_UseType()
	{
	}
	
	function 	Sisul_Init()
	{
		MakeXML();
		makeList();
		
	//	Select_Depth();
		
	//	parent.iFrameResizeTab("tab1");	//	화면 RESIZE	
	//	IFRM_PurposeCode.PURPOSE_CD.className	= "essential";
	}

	function	Sisul_DataCheck()
	{
		var form 	= document.form;
		var	str		= "";


		//	점용지 정보
		if(form.OWNER_SET.value.length	< 1)
		{
			alert("소유자를 입력하세요\n");
			form.OWNER_SET.focus();
			return	false;
		}
		else if(form.TAX_SET.value.length	< 1)
		{
			alert("세입구분을 입력하세요\n");
			form.TAX_SET.focus();
			return	false;
		}
		else if(IFRM_PurposeCode.PURPOSE_CD.value < 110)
		{
			alert("점용목적을 선택하세요\n");
			IFRM_PurposeCode.PURPOSE_CD.focus();
			return	false;
		}
		else if(IFRM_PurposeCode.PURPOSE1.value == 2)
		{
			if(IFRM_PurposeCode.PURPOSE2.value > 0)
			{
				if(IFRM_PurposeCode.PURPOSE3.value < 1)
				{
					alert("점용목적을 선택하세요\n");
					IFRM_PurposeCode.PURPOSE3.focus();
					return	false;
				}
				else if(form.PURPOSESEBU_CD.value > 210 && from.PURPOSESEBU_CD.value < 220)
				{
					alert("상세시설물을 선택하세요\n");
					form.PURPOSESEBU_CD.focus();
					return	false;
				}
			}
		}

		if(form.QUANTITY.value.length	< 1)
		{
			alert("수량(연장)을 입력하세요.\n");
			form.QUANTITY.focus();
			return	false;
		}
		else if(!math_check(form.QUANTITY.value))
		{
			str	+= "수량은 숫자 7자리 소수점 이하 3자리 까지만 입력 가능합니다.";
			alert(str);
			form.QUANTITY.value = "";
			form.QUANTITY.focus();
		}
		else if(form.MUL_FROMDATE.value.length	< 1	||	form.MUL_TODATE.value.length	< 1){
			alert("점용기간을 입력하세요\n");
			return	false;
		}
		else if(form.SISUL_POST.value.length	< 1){
			alert("시설물 주소를 입력하세요.\n");
			//********** BEGIN_KANG_20120409
			//openZipcodePopup('form.SISUL_POST', 'form.SISUL_ADDR1');
			openZipcodePopup_new('form.SISUL_POST','','','','','','','','','');
			//********** END_KANG_20120409
		
			return	false;
		}
		else if(form.SISUL_ADDR2.value.length	< 1){
			alert("시설물 상세 주소를 입력하세요.\n");
			form.SISUL_ADDR2.focus();
			return	false;
		}
		else if(form.BJ_CD.value.length < 1) {
			alert('법정동을 선택해주세요');
			return false;
		}		
		else if(form.SPC_CD.value.length < 1){
			alert('일반번지/산번지 여부를 선택해주세요');
			return false;
		}

		if(str	== "")
		{
			return	true;
		}
		
		return	false;		
	}
	
		
	function 	MakeXML()
	{
		var xmlDom = new ActiveXObject("Microsoft.XMLDOM"); 

		var objRoot = xmlDom.createElement("ROOT"); 
		xmlDom.appendChild(objRoot);

		document.getElementById("XMLDATA").value = xmlDom.xml;  
	}

	//	데이터 추가
	function 	insertNode()
	{
		
		var	obj		= document.getElementById("XMLDATA").value;
        var xmlDom 	= new ActiveXObject("Microsoft.XMLDOM");
        var form 	= document.form;
		var	Node;
		var	value;
		
        xmlDom.async	= false;
		xmlDom.loadXML(obj);
		
		var objRoot	= xmlDom.documentElement;
	
		var objNode = xmlDom.createElement("DATA");
		objRoot.appendChild(objNode);
		
/*		var	SISUL_ADDR_CK	= "0";
		if(document.getElementById("SISUL_ADDR_CK").checked	== true)
			SISUL_ADDR_CK	= "1";
			
		var	ADDR_CK	= "0";
		if(document.getElementById("ADDR_CK").checked	== true)
			ADDR_CK	= "1";
*/	
//		objNode.appendChild(setNodeValue(xmlDom, "TYPE", "1"));	
		objNode.appendChild(setNode(xmlDom, "SECTION"));
		objNode.appendChild(setNode(xmlDom, "OWNER_SET"));
		objNode.appendChild(setNode(xmlDom, "TAX_SET"));
		objNode.appendChild(setNode(xmlDom, "PURPOSE_CD"));
		objNode.appendChild(setNode(xmlDom, "PURPOSESEBU_CD"));
		objNode.appendChild(setNode(xmlDom, "STANDARD"));
		objNode.appendChild(setNode(xmlDom, "QUANTITY"));
		objNode.appendChild(setNode(xmlDom, "DEPTH_CK"));
		objNode.appendChild(setNode(xmlDom, "DEPTH_NUM"));
		objNode.appendChild(setNode(xmlDom, "MUL_FROMDATE"));
		objNode.appendChild(setNode(xmlDom, "MUL_TODATE"));
		objNode.appendChild(setNode(xmlDom, "PARTLY_PERIOD"));		//일시점용	점용구분이 '계속'으로 고정되면서...필요 없어짐
		objNode.appendChild(setNode(xmlDom, "TOTAL_PERIOD"));		//총점용		점용구분이 '계속'으로 고정되면서...필요 없어짐
		objNode.appendChild(setNode(xmlDom, "WORK_FROMDATE"));
		objNode.appendChild(setNode(xmlDom, "WORK_TODATE"));
		objNode.appendChild(setNode(xmlDom, "COMPLETION_DATE"));
		objNode.appendChild(setNode(xmlDom, "EXE_INFO"));
		objNode.appendChild(setNodeText(xmlDom, "PURPOSESEBU_NM", "PURPOSESEBU_CD"));
		objNode.appendChild(setNodeText(xmlDom, "TAX_SET_NM", "TAX_SET"));
		objNode.appendChild(setNode(xmlDom, "PURPOSE1_NM"));
		objNode.appendChild(setNode(xmlDom, "PURPOSE2_NM"));
		objNode.appendChild(setNode(xmlDom, "PURPOSE3_NM"));
		objNode.appendChild(setNode(xmlDom, "SISUL_POST"));
		objNode.appendChild(setNode(xmlDom, "SISUL_ADDR1"));
		objNode.appendChild(setNode(xmlDom, "BJ_CD"));
		objNode.appendChild(setNode(xmlDom, "HJ_CD"));
		objNode.appendChild(setNode(xmlDom, "SPC_CD"));
		objNode.appendChild(setNode(xmlDom, "BONBUN"));
		objNode.appendChild(setNode(xmlDom, "BUBUN"));
		objNode.appendChild(setNode(xmlDom, "SISUL_ADDR2"));
		
		document.getElementById("XMLDATA").value = xmlDom.xml;
	}
	
	function	setNode(xmlDom, Name)
	{
		var	Node 	= xmlDom.createElement(Name);
		Node.text	= document.getElementById(Name).value;
			
		return	Node;
	}
	
	function	setNodeValue(xmlDom, Name, value)
	{
		var	Node 	= xmlDom.createElement(Name);
		Node.text	= value;
			
		return	Node;
	}

	function	setNodeText(xmlDom, Name, Id)
	{
		var	Node 	= xmlDom.createElement(Name);
		var	value	= document.getElementById(Id);
		Node.text	= value[value.selectedIndex].text
			
		return	Node;
	}

	
	function 	deleteNode(num)
	{     
		var	obj	= document.getElementById("XMLDATA").value;
		
        var xmlDom 	= new ActiveXObject("Microsoft.XMLDOM");
        var form 	= document.form;
		
        xmlDom.async	= false;
		xmlDom.loadXML(obj);
		
		var objRoot	= xmlDom.documentElement;
		var fChild	= getCheckChild(objRoot, num);
		
		objRoot.removeChild(fChild);
		
		if(objRoot.childNodes.length == 0)
		{
			var addr_fix = document.getElementById("addr_fix");
			var SISUL_POST = form.SISUL_POST.value;
			var SISUL_ADDR1 = form.SISUL_ADDR1.value;
			var SISUL_ADDR2 = form.SISUL_ADDR2.value;
			
			var innerHtml = "<table border='0' cellpadding='0' cellspacing='0' class='sub_stan'>";
				innerHtml += "	<tr>";
				innerHtml += "		<td><input name='SISUL_POST' value='" + SISUL_POST + "' type='text' class='essential' style='width:50px' onFocus='Jumin_toaddr_Check();' readonly></td>";
				innerHtml += "<td><a href=\"javascript:openZipcodePopup('form.SISUL_POST', 'form.SISUL_ADDR1');\"><img src='/img/search_icon.gif' alt='검색' width='56' height='18' border='0'></a></td>";
				innerHtml += "		<td bgcolor='eaeaea' class='table_bl_left'><input name='SISUL_ADDR1' value='" + SISUL_ADDR1 + "' type='text' class='essential' style='width:250px' onFocus='Jumin_toaddr_Check();' readonly>";
				innerHtml += "		<input name='SISUL_ADDR2' value='" + SISUL_ADDR2 + "' type='text' class='essential' style='width:250px'></td>";
				innerHtml += "	</tr>";
				innerHtml += "</table>";
			
			addr_fix.innerHTML = innerHtml;
		}
		
		document.getElementById("XMLDATA").value = xmlDom.xml;  
	}
	

	function	getCheckChild(root, num)
	{
		var fChild 	= root.firstChild;
		var	length	= root.childNodes.length;
		
		num--;
		
		for(i = 0	;	i < num	;	i++)
		{
			fChild	= fChild.nextSibling;
		}
		return fChild;
	}

	function	makeList()
	{
		var	obj		= document.getElementById("XMLDATA").value;
        var xmlDom 	= new ActiveXObject("Microsoft.XMLDOM");
        var form 	= document.form;
		
        xmlDom.async	= false;
		xmlDom.loadXML(obj);
		
		var objRoot	= xmlDom.documentElement;
		var	length	= objRoot.childNodes.length;
		var Child 	= objRoot.firstChild;
		
		var	blist	= document.getElementById("blist");
		var	tag		= "";
		var	PURPOSE_CD		= "";
		var	PURPOSE1_NM		= "";
		var	PURPOSE2_NM		= "";
		var	PURPOSE3_NM		= "";
		var	PURPOSESEBU_NM	= "";
		var	QUANTITY		= "";
		var	GIGAN			= "";
		var	TAX_SET_NM		= "";
		var	method			= "";
		
		var	top	= "<table width='100%' border='1' bordercolor='#c9dfed' style='border-collapse:collapse;' cellpadding='0' cellspacing='0'  class='sub_table'>" +
			"<tr><td height='28' align='center' bgcolor='e5eff8' class='sub_table_b'>번호</td>" +
			"<td colspan='3' align='center' bgcolor='e5eff8' class='sub_table_b'>점용목적(코드)</td>" +
			"<td align='center' bgcolor='e5eff8' class='sub_table_b'>수량</td>" +
			"<td align='center' bgcolor='e5eff8' class='sub_table_b'>점용기간</td>" +
			"<td align='center' bgcolor='e5eff8' class='sub_table_b'>세입구분</td>" +
			"<td align='center' bgcolor='e5eff8' class='sub_table_b'>삭제</td></tr>";
		
		if(length	> 0)
		{
			for(i = 0	;	i < length	;	i++)
			{
				PURPOSE_CD		= Child.getElementsByTagName("PURPOSE_CD").item(0).text;
				PURPOSE1_NM		= Child.getElementsByTagName("PURPOSE1_NM").item(0).text;
				PURPOSE2_NM		= Child.getElementsByTagName("PURPOSE2_NM").item(0).text;
				PURPOSE3_NM		= Child.getElementsByTagName("PURPOSE3_NM").item(0).text;
				PURPOSESEBU_NM	= Child.getElementsByTagName("PURPOSESEBU_NM").item(0).text;
				QUANTITY		= Child.getElementsByTagName("QUANTITY").item(0).text;
				GIGAN			= Child.getElementsByTagName("MUL_FROMDATE").item(0).text + " ~ " + Child.getElementsByTagName("MUL_TODATE").item(0).text;;
				TAX_SET_NM		= Child.getElementsByTagName("TAX_SET_NM").item(0).text;
				method			= "view_list(" + (i + 1) + ")";
				
				tag	+= "<tr onClick=" + method + " onMouseOver=this.style.backgroundColor='#f6f7f8' onMouseOut=this.style.backgroundColor='' style='CURSOR: Hand;'>" +
					"<td height='26' align='center'>" + (i + 1) + "</td>" +
					"<td align='center' colspan='3'>" + PURPOSE1_NM + " " + PURPOSE2_NM + " " + PURPOSE3_NM + "</td>" +
			//		"<td align='center'>" + PURPOSESEBU_NM + "</td>" +
					"<td align='center'>" + QUANTITY + "</td>" +
					"<td align='center'>" + GIGAN + "</td>" +
					"<td align='center'>" + TAX_SET_NM + "</td>" +
					"<td align=center><img src='/img/del_icon2.gif' alt='삭제' border='0' onclick='javaScript:Delete(" + (i + 1) + ");' style='CURSOR:Hand;'></td></tr>";
				Child	= Child.nextSibling;
			}
		}
		else
		{
			tag	+= "<tr><td align='center' class='sub_table' colspan='8' height='26'>시설물 정보를 추가해 주십시요</td></tr>";
		}
		
		var	bottom	= "</table>";
		
		blist.innerHTML	= top + tag + bottom;
	}
	
	function	Clear()
	{
		var form 	= document.form;
		
		form.LISTSEQ.value			= "";
		form.SECTION.value			= "";
		form.OWNER_SET.value		= "";
		form.TAX_SET.value			= "";
		form.PURPOSE_CD.value		= "";
		form.STANDARD.value			= "";
		form.QUANTITY.value			= "";
		form.DEPTH_CK.value			= "";
		form.DEPTH_NUM.value		= "";
		form.MUL_FROMDATE.value		= "";
		form.MUL_TODATE.value		= "";
/*		form.BJ_CD.value			= "";
		form.HJ_CD.value			= "";
		form.SPC_CD.value			= "";
		form.BONBUN.value			= "";
		form.BUBUN.value			= "";
		form.ADDR_CK.checked		= false;
		form.SISUL_ADDR_CK.checked	= false;
		form.SISUL_ADDR.value		= "";
*/
		form.WORK_FROMDATE.value	= "";
		form.WORK_TODATE.value		= "";
		form.COMPLETION_DATE.value	= "";
		form.EXE_INFO.value			= "";
		form.SISUL_POST.value			= "";
		form.SISUL_ADDR1.value			= "";
		form.SISUL_ADDR2.value			= "";
		
		
//		sisul_addr_ck();
//		document.getElementById("sisul_addr_block").style.display = "none";
		
		document.getElementById("IFRM_PurposeCode").src="/jsp/common/purposeCode/purposeCode.jsp?SectionCode=4&essential=1";
	}
	
	//	상세 시설물
	function	Selected_Sebu(purposecode)
	{
		var	param	= "CODE=" + purposecode;
		sendRequest("/purposesebucode.do", param, "GET", Result_Sebu);
	}

	function	Result_Sebu(obj)
	{
//		var	value	= document.getElementById("TAX_SET").value;
		fncSelectBoxSetting(obj, "PURPOSESEBU_CD", 0, "::선택::");
	}
	
    function fncSelectBoxSetting(strParam, selectBoxId, defaultSel, topLabel)
	{
        var xmldoc = new ActiveXObject("Microsoft.XMLDOM");
        var root;
        var selectBoxLabel;
        var selectBoxValue;
        var opt 	= document.getElementById(selectBoxId);
        var tags	= "";
        var	text	= "";
	
        for(var i = opt.options.length - 1 ; i > -1 ; i--)
        {
        	opt.options[i]	= null;
        }

        xmldoc.async	= false;
		xmldoc.loadXML(strParam);
		
        root = xmldoc.getElementsByTagName("option").length;

        if(root <= 0)
        {
            tags 	= document.createElement("option");
            text	= document.createTextNode("");
            tags.setAttribute("label", "");
            tags.appendChild(text);
            tags.value = 0;
            opt.appendChild(tags);
            return;
        }
  
        if(topLabel != null && topLabel != "")
		{
            tags 	= document.createElement("option");
            text	= document.createTextNode(topLabel);
            tags.setAttribute("label", topLabel);
            tags.appendChild(text);
            tags.value = 0;
            opt.appendChild(tags);
        }
        
        defaultSel --;

        for(var i = 0; i < root; i++)
        {
        	selectBoxValue = xmldoc.getElementsByTagName("option/@value").item(i).text;
        	selectBoxLabel = xmldoc.getElementsByTagName("option/@label").item(i).text;
			
            tags 	= document.createElement("option");
       		text	= document.createTextNode(selectBoxLabel);
            tags.setAttribute("label", selectBoxLabel);
            if(i == defaultSel) tags.setAttribute("selected", "true");
			
            tags.value = selectBoxValue;
            tags.appendChild(text);
            opt.appendChild(tags);
        }
        purposesebu_select();
    }
	
    function purposesebu_select(){
		var frm=document.form.PURPOSESEBU_CD;
		frm.options[0].selected = true;
	}
    
	function	sisul_addr_ck()
	{
		if(document.getElementById("SISUL_ADDR_CK").checked == true)
			document.getElementById("sisul_addr_block").style.display = "block";
		else
			document.getElementById("sisul_addr_block").style.display = "none";

		parent.iFrameResizeTab("tab1");	//	화면 RESIZE
	}
	
	
	// input_number1 : 입력숫자
	// input_number2 : 원하는 소수점 자리
	// index : "." 위치
	function math_check(min1)
	{
		var input_number2 = 3;

		var index = min1.indexOf(".");
		
		var aaa; // 소수점 앞
		var bbb; // 소수점 뒤
		var result; // 결과값

		if (index != -1)
		{
			var aaa = min1.substring(0, index+1);
			var bbb = min1.substring(index+1);
			result = aaa + bbb.substring(0, input_number2);
			
			if(aaa.length > 7)
			{
				return false;
			}
			else if(bbb.length > 3)
			{
				return false;
			}
		}
		else	//소수점이 없는 숫자는 7자리 까지만...
		{
			if(min1.length > 7)
			{
				return false;
			}
		}
		
		return true;
	}
