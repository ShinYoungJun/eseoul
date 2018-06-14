<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ include file="/jsp/common/loginCheck.jsp" %>
<%@ include file="/jsp/common/include.jsp" %>
<%@ page import="java.util.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">


<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=euc-kr" />

<title>::::: 서울시 도로점용관리시스템 :::::</title>
<style type="text/css">

<!--
body {
	margin: 0px;
}
-->

</style>
<link href="/css/roads.css" rel="stylesheet" type="text/css">
</head>


<script language="javascript" src="/js/PopupCalendar.js"></script> 
<script language='JavaScript' src='/js/Check_inputbox.js'></script>
<script language="javascript" src="/js/Ajax_request.js"></script>

<script type="text/javascript">
//<![CDATA[

	function	Sisul_Register()
	{
		var form = document.form;
		var	value;
		var	result	= DataCheck();

	//	if(result	==	false)
	//		return;
		
		form.PURPOSE_CD.value	= IFRM_PurposeCode.document.getElementById("PURPOSE_CD").value;	
		value	= IFRM_PurposeCode.document.getElementById("PURPOSE1");
		form.PURPOSE1_NM.value	= value[value.selectedIndex].text;
		value	= IFRM_PurposeCode.document.getElementById("PURPOSE2");
		form.PURPOSE2_NM.value	= value[value.selectedIndex].text;
		value	= IFRM_PurposeCode.document.getElementById("PURPOSE3");
		form.PURPOSE3_NM.value	= value[value.selectedIndex].text;
		
		insertNode();	//	노드에 추가
		
		Clear();
		
		makeList();
	//	viewXML();
	
		return;

		form.action = "/facility/minwoninfo/jumji_modify_prc.do";
		form.submit();
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
		var	DEPTH_CK				= fChild.getElementsByTagName("DEPTH_CK").item(0).text;
		
		form.LISTSEQ.value			= num;
		form.DEPTH_CK.checked		= false;
		form.PURPOSESEBU.value		= fChild.getElementsByTagName("PURPOSESEBU_CD").item(0).text;
		
		document.getElementById("IFRM_PurposeCode").src="/jsp/common/purposeCode/purposeCode.jsp?SectionCode=" + 1 + "&PURPOSE_CD=" + PURPOSE_CD + "&essential=1";

		form.SECTION.value			= fChild.getElementsByTagName("SECTION").item(0).text;
		form.OWNER_SET.value		= fChild.getElementsByTagName("OWNER_SET").item(0).text;
		form.TAX_SET.value			= fChild.getElementsByTagName("TAX_SET").item(0).text;
		
		form.STANDARD.value			= fChild.getElementsByTagName("STANDARD").item(0).text;
		form.QUANTITY.value			= fChild.getElementsByTagName("QUANTITY").item(0).text;
		var	DEPTH_CK				= fChild.getElementsByTagName("DEPTH_CK").item(0).text;
		form.DEPTH_NUM.value		= fChild.getElementsByTagName("DEPTH_NUM").item(0).text;
		form.MUL_FROMDATE.value		= fChild.getElementsByTagName("MUL_FROMDATE").item(0).text;
		form.MUL_TODATE.value		= fChild.getElementsByTagName("MUL_TODATE").item(0).text;
		form.PARTLY_PERIOD.value	= fChild.getElementsByTagName("PARTLY_PERIOD").item(0).text;
		form.TOTAL_PERIOD.value		= fChild.getElementsByTagName("TOTAL_PERIOD").item(0).text;
		form.WITH_POST.value		= fChild.getElementsByTagName("WITH_POST").item(0).text;
		form.BJ_CD.value			= fChild.getElementsByTagName("BJ_CD").item(0).text;
		form.HJ_CD.value			= fChild.getElementsByTagName("HJ_CD").item(0).text;
		form.SAN_CK.value			= fChild.getElementsByTagName("SAN_CK").item(0).text;
		form.BONBUN.value			= fChild.getElementsByTagName("BONBUN").item(0).text;
		form.BUBUN.value			= fChild.getElementsByTagName("BUBUN").item(0).text;
		form.WORK_FROMDATE.value	= fChild.getElementsByTagName("WORK_FROMDATE").item(0).text;
		form.WORK_TODATE.value		= fChild.getElementsByTagName("WORK_TODATE").item(0).text;
		form.COMPLETION_DATE.value	= fChild.getElementsByTagName("COMPLETION_DATE").item(0).text;
		form.EXE_INFO.value			= fChild.getElementsByTagName("EXE_INFO").item(0).text;
		
		if(DEPTH_CK	== "1")
			form.DEPTH_CK.checked	= "checked";
	}

	function	Delete(num)
	{
	//	var	LISTSEQ	= document.getElementById("LISTSEQ").value;

	//	if(LISTSEQ	!= "")
		{
			deleteNode(num);
			makeList();
			
		//	document.getElementById("LISTSEQ").value	= "";
		}
	//	else
	//		alert("삭제할 데이터를 선택하여 주십시요");
	}

	function	Init_UseSection(sel)
	{
		if(sel == '1')
			document.getElementById("UseSection").style.display = "block";	//	정기
		else
			document.getElementById("UseSection").style.display = "none";
	}

	function	Select_UseSection(sel)
	{
		if(sel.value == '1')
			document.getElementById("UseSection").style.display = "block";	//	정기
		else
			document.getElementById("UseSection").style.display = "none";

	//	parent.iFrameResizeTab("tab");
	}
	
	function	Init_UseType()
	{
		document.getElementById("IFRM_PurposeCode").src="/jsp/common/purposeCode/purposeCode.jsp?SectionCode=" + 1 + "&essential=1";
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

	function 	Init()
	{
//		parent.Tab_Img("jumji");
		
		MakeXML();
		
		makeList();
	//	IFRM_PurposeCode.PURPOSE_CD.className	= "essential";
	}

	function	DataCheck()
	{
		var form 	= document.form;
		var	str		= "";
		
		//	점용지 정보
		if(form.TYPE.value.length	< 1)
			str	+= "점용종류를 입력하세요\n";
		else if(form.SECTION.value.length	< 1)
			str	+= "점용구분을 입력하세요\n";
		else if(form.OWNER_SET.value.length	< 1)
			str	+= "소유자를 입력하세요\n";
		else if(form.TAX_SET.value.length	< 1)
			str	+= "세입구분을 입력하세요\n";
		else if(IFRM_PurposeCode.PURPOSE_CD.value < 110)
			str	+= "점용목적을 입력하세요\n";
		else if(form.BJ_CD.value.length	< 1)
			str	+= "점용지 법정동을 입력하세요.\n";
		else if(form.HJ_CD.value.length	< 1)
			str	+= "점용지 행정동을 입력하세요\n";
		else if(form.SAN_CK.value.length	< 1)
			str	+= "점용지 번지선택을 입력하세요\n";
		else if(form.BONBUN.value.length	< 1)
			str	+= "점용지 본번을 입력하세요\n";
		else if(form.WITH_POST.value.length	< 1)
			str	+= "우편번호를 입력하세요\n";
		else if(form.MUL_FROMDATE.value.length	< 1	||	form.MUL_TODATE.value.length	< 1)
			str	+= "점용기간을 입력하세요\n";
		else if(form.SECTION.value	== 1)
		{
			if(form.PARTLY_PERIOD.value.length	< 1	||	form.TOTAL_PERIOD.value.length	< 1)
				str	+= "점용기간 일시점용을 입력하세요\n";
		}

		if(str	== "")
		{
			return	true;
		}
		
		alert(str);

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
		
		var	DEPTH_CK	= "0";
		if(document.getElementById("DEPTH_CK").checked	== true)
			DEPTH_CK	= "1";
		
		objNode.appendChild(setNode(xmlDom, "SECTION"));
		objNode.appendChild(setNode(xmlDom, "OWNER_SET"));
		objNode.appendChild(setNode(xmlDom, "TAX_SET"));
		objNode.appendChild(setNode(xmlDom, "PURPOSE_CD"));
		objNode.appendChild(setNode(xmlDom, "PURPOSESEBU_CD"));
		objNode.appendChild(setNode(xmlDom, "STANDARD"));
		objNode.appendChild(setNode(xmlDom, "QUANTITY"));
		objNode.appendChild(setNodeValue(xmlDom, "DEPTH_CK", DEPTH_CK));
		objNode.appendChild(setNode(xmlDom, "DEPTH_NUM"));
		objNode.appendChild(setNode(xmlDom, "MUL_FROMDATE"));
		objNode.appendChild(setNode(xmlDom, "MUL_TODATE"));
		objNode.appendChild(setNode(xmlDom, "PARTLY_PERIOD"));
		objNode.appendChild(setNode(xmlDom, "TOTAL_PERIOD"));
		objNode.appendChild(setNode(xmlDom, "WITH_POST"));
		objNode.appendChild(setNode(xmlDom, "BJ_CD"));
		objNode.appendChild(setNode(xmlDom, "HJ_CD"));
		objNode.appendChild(setNode(xmlDom, "SAN_CK"));
		objNode.appendChild(setNode(xmlDom, "BONBUN"));
		objNode.appendChild(setNode(xmlDom, "BUBUN"));
		objNode.appendChild(setNode(xmlDom, "WORK_FROMDATE"));
		objNode.appendChild(setNode(xmlDom, "WORK_TODATE"));
		objNode.appendChild(setNode(xmlDom, "COMPLETION_DATE"));
		objNode.appendChild(setNode(xmlDom, "EXE_INFO"));
		objNode.appendChild(setNodeText(xmlDom, "PURPOSESEBU_NM", "PURPOSESEBU_CD"));
		objNode.appendChild(setNodeText(xmlDom, "TAX_SET_NM", "TAX_SET"));
		objNode.appendChild(setNode(xmlDom, "PURPOSE1_NM"));
		objNode.appendChild(setNode(xmlDom, "PURPOSE2_NM"));
		objNode.appendChild(setNode(xmlDom, "PURPOSE3_NM"));
	
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
		
		var objRoot	= xmlDom.documentElement;//xmlDom.documentElement("ROOT").cloneNode(true);
	//	xmlDom.documentElement.appendChild(objRoot);
	
	//	alert("root의 자식노드 개수:" + objRoot.childNodes.length);
	//	alert(objRoot.firstChild.nodeName);
		
		var fChild	= getCheckChild(objRoot, num);
		
		objRoot.removeChild(fChild);
		
	//	alert(objRoot);
		
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
	
	//	alert(fChild.getElementsByTagName("PURPOSE_CD").item(0).text);
		
		return fChild;
	}
	
	function	viewXML()
	{
		var	obj	= document.getElementById("XMLDATA").value;
		
		alert(obj);
		return;
		
        var xmldoc 	= new ActiveXObject("Microsoft.XMLDOM");
        var form 	= document.form;
		
        xmldoc.async	= false;
		xmldoc.loadXML(obj);
		
		var	NAME	= xmldoc.getElementsByTagName("NAME").item(0).text;
		var	TEL		= xmldoc.getElementsByTagName("TEL").item(0).text;
		
		alert(NAME + ", " + TEL);
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
					"<td align='center'>" + PURPOSE_CD + "</td>" +
					"<td align='center'>" + PURPOSE1_NM + " " + PURPOSE2_NM + " " + PURPOSE3_NM + "</td>" +
					"<td align='center'>" + PURPOSESEBU_NM + "</td>" +
					"<td align='center'>" + QUANTITY + "</td>" +
					"<td align='center'>" + GIGAN + "</td>" +
					"<td align='center'>" + TAX_SET_NM + "</td>" +
					"<td align=center><img src='/img/del_icon2.gif' alt='삭제' border='0' onclick='javaScript:Delete(" + (i + 1) + ");' style='CURSOR:Hand;'></td></tr>";
				Child	= Child.nextSibling;
			}
		}
		else
		{
			tag	+= "<tr><td align='center' class='sub_table' colspan='8' height='26'>데이터가 없습니다</td></tr>";
		}
		
		var	bottom	= "</table>";
		
		blist.innerHTML	= top + tag + bottom;
	}
	
	function	Clear()
	{
		var form 	= document.form;
		
		form.LISTSEQ.value		= "";
		form.SECTION.value		= "";
		form.OWNER_SET.value	= "";
		form.TAX_SET.value		= "";
		form.PURPOSE_CD.value	= "";
		form.STANDARD.value		= "";
		form.QUANTITY.value		= "";
		form.DEPTH_CK.checked	= false;
		form.DEPTH_NUM.value	= "";
		form.MUL_FROMDATE.value	= "";
		form.MUL_TODATE.value	= "";
		form.WITH_POST.value	= "";
		form.BJ_CD.value		= "";
		form.HJ_CD.value		= "";
		form.SAN_CK.value		= "";
		form.BONBUN.value		= "";
		form.BUBUN.value		= "";
		form.WORK_FROMDATE.value	= "";
		form.WORK_TODATE.value		= "";
		form.COMPLETION_DATE.value	= "";
		form.EXE_INFO.value			= "";


		document.getElementById("IFRM_PurposeCode").src="/jsp/common/purposeCode/purposeCode.jsp?SectionCode=" + 1 + "&essential=1";
	}
	
	//	상세 시설물
	function	Selected_Sebu(purposecode)
	{
	//	form.PURPOSE_CD.value	= purposecode;//IFRM_PurposeCode.document.getElementById("PURPOSE_CD").value;	
	//	var	CODE	= document.getElementById("PURPOSE_CD").value;
		
	//	document.getElementById("PURPOSE_CD").value	= purposecode;
		var	param	= "CODE=" + purposecode;
		
	//	alert(purposecode);

		sendRequest("/purposesebucode.do", param, "GET", Result_Sebu);
	}

	function	Result_Sebu(obj)
	{
		var	value	= document.getElementById("PURPOSESEBU").value;
		
		fncSelectBoxSetting(obj, "PURPOSESEBU_CD", value, "::선택::");
		
	//	alert(value);
	//	form.PURPOSESEBU_CD.value	= PURPOSESEBU_CD;
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
    }
//]]>
</script>

<body onload="Init(); Init_UseType();">
<table width="780" border="0" cellpadding="0" cellspacing="0">
<form name="form" method="post">
<input type="hidden" name="ADMIN_NO" value="${ADMIN_NO}">
<input type="hidden" name="PURPOSE_CD" value="${PURPOSE_CD}">
<input type="hidden" name="PURPOSE1_NM">
<input type="hidden" name="PURPOSE2_NM">
<input type="hidden" name="PURPOSE3_NM">
<input type="hidden" name="PURPOSESEBU">
<input type="hidden" name="XMLDATA">
<input type="hidden" name="LISTSEQ">

	<tr>
		<td align="left" class="contborder_purple">
		<table width="100%" border="0" cellspacing="0" cellpadding="0">
		
		<tr>
			<td width="100%" colspan="7">
				<div id="blist"></div>
			</td>
		</tr>
		
		<tr>
			<td height="30" align="center"></td>
		</tr>
		
		  <tr>
			<td><table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
				<tr>
					<td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">점용종류</td>
					<td width="37%" bgcolor="eaeaea" class="table_bl_left"><select name="TYPE" class="essential" style="width:70px" disabled>
					${use_type}
					</select></td>
					<td width="100" align="center" bgcolor="e5eff8" class="sub_table_b">점용구분</td>
					<td width="36%" bgcolor="eaeaea" class="table_bl_left"><select name="SECTION" class="essential" style="width:70px" OnChange="Select_UseSection(this);">
					${occupancy_type}
					</select></td>
				</tr>
				
				<tr>
					<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">소유자</td>
					<td bgcolor="eaeaea" class="table_bl_left"><select name="OWNER_SET" class="essential" style="width:70px">
					${use_owner_Group}
					</select></td>
					<td align="center" bgcolor="e5eff8" class="sub_table_b">세입구분</td>
					<td bgcolor="eaeaea" class="table_bl_left"><select name="TAX_SET" class="essential" style="width:70px">
					${taxation_section}
					</select></td>
				</tr>

				<tr>
					<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">점용목적</td>
					<td colspan="3" bgcolor="eaeaea" ><table width="100%" border="0" cellpadding="0" cellspacing="0">
						<iframe id="IFRM_PurposeCode" scrolling="no" frameborder="0" framespacing="0" width="100%" height="25" src="/jsp/common/purposeCode/purposeCode.jsp?SectionCode=${TYPE}&PURPOSE_CD=${PURPOSE_CD}&essential=1"></iframe>
					</table></td>
			    </tr>
	
                <tr>
					<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">상세시설물</td>
					<td bgcolor="eaeaea" class="table_bl_left"><select name="PURPOSESEBU_CD" id="PURPOSESEBU_CD" class="essential" style="width:120px">
					</select></td>             
					<td align="center" bgcolor="e5eff8" class="sub_table_b">규격</td>
					<td bgcolor="eaeaea" class="table_bl_left"><input name="STANDARD" type="text" class="input_form1" style="width:140px" maxlength="12"></td>
                </tr>
			    
                <tr>
					<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">수량(연장)</td>
					<td bgcolor="eaeaea" class="table_bl_left"><input name="QUANTITY" type="text" class="input_form1" style="width:140px" maxlength="12"> 개(또는 m)</td>
					<td align="center" bgcolor="e5eff8" class="sub_table_b">심도(감액적용)</td>
					<td bgcolor="eaeaea" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
					<tr>
						<td bgcolor="eaeaea" class="table_bl_left">
						<input name="DEPTH_CK" type="checkbox">감액&nbsp;
						<input name="DEPTH_NUM" type="text" class="input_form1" style="width:50px"> %
						</td>
					</tr>
					</table></td>               
                </tr>			    
			    
				<tr>
					<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">점용기간</td>
					<td colspan="3" bgcolor="eaeaea" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
					<tr>
					<td>
						<input name="MUL_FROMDATE" type="text" class="essential" style="width:70px" readonly><a><img src="/img/calendar_icon.gif" width="19" height="16" border="0" align="absmiddle" onclick="popUpCalendar(this, MUL_FROMDATE, 'yyyymmdd')" style="CURSOR: Hand;"></a>
						~ <input name="MUL_TODATE" type="text" class="essential" style="width:70px" readonly><a><img src="/img/calendar_icon.gif" width="19" height="16" border="0" align="absmiddle" onclick="popUpCalendar(this, MUL_TODATE, 'yyyymmdd')" style="CURSOR: Hand;"></a></tr>
					</td>

					<tr style="display:none" id="UseSection">
						<td>일시점용<input name="PARTLY_PERIOD" type="text" class="essential" style="width:300px">
						&nbsp;&nbsp;총<input name="TOTAL_PERIOD" type="text" class="essential" style="width:30px" style="ime-mode:disabled" onKeyDown="nr_num_int(this);" onKeyUp="nr_num_int(this);" onKeyPress="nr_num_int(this);">일</td>
					</tr>
					</table></td>
				</tr>
		
			    <tr>
					<td height="34" colspan="4" align="left" bgcolor="#FFFFFF" class=""><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
					<tr>
						<td><span class="sub_stan_blue">* 시설물 주소</span></td>
					</tr>
					</table></td>
			    </tr>
			    
			    <tr>
					<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">우편번호</td>
					<td colspan="3" bgcolor="eaeaea" class="table_bl_left">
					<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
					<tr>
						<td><input name="WITH_POST" type="text" class="input_form1" style="width:50px" readonly></td>
						<td><a href="javascript:openZipcodePopup('form.WITH_POST', '');"><img src="/img/search_icon.gif" alt="검색" width="56" height="18" border="0"></a></td>
					</tr>
					</table></td>
			    </tr>
			    
				<tr>
					<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">주소</td>
					<td colspan="3" bgcolor="eaeaea" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
					<tr>
						<td>${SIGUNGU}&nbsp;&nbsp;</td>
						<td width="72"><select name="BJ_CD" class="essential" style="width:80px">
						${bjdong_code}
						</select></td>  
						<td>&nbsp;<select name="HJ_CD" class="essential" style="width:95px">
						${hjdong_code}
						</select></td>
						<td>&nbsp;/&nbsp;<select name="SAN_CK" class="essential" style="width:75px">
						${mul_spc_cd}
						</select></td>
						<td>&nbsp;<input name="BONBUN" type="text" class="essential" style="width:40px" style="ime-mode:disabled" onKeyDown="nr_num_int(this);" onKeyUp="nr_num_int(this);" onKeyPress="nr_num_int(this);" maxlength="4">
						- <input name="BUBUN" type="text" class="input_form1" style="width:40px" style="ime-mode:disabled" onKeyDown="nr_num_int(this);" onKeyUp="nr_num_int(this);" onKeyPress="nr_num_int(this);" maxlength="4">
						번지</td>
					</tr>
					</table></td>
				</tr>
				
			    <tr>
					<td height="34" colspan="4" align="left" bgcolor="#FFFFFF" class=""><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
					<tr>
						<td><span class="sub_stan_blue">* 공사(굴착) 정보</span></td>
					</tr>
					</table></td>
			    </tr>
			    
			    <tr>
					<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">공사기간 </td>
					<td bgcolor="eaeaea" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
					<tr>
						<td><input name="WORK_FROMDATE" type="text" class="input_form1" style="width:65px" readonly></td>
						<td><a><img src="/img/calendar_icon.gif" width="19" height="16" border="0" onclick="popUpCalendar(this, WORK_FROMDATE, 'yyyymmdd')" style="CURSOR: Hand;"></a></td>
						<td width="16" align="center">~</td>
						<td><input name="WORK_TODATE" type="text" class="input_form1" style="width:65px" readonly></td>
						<td><a><img src="/img/calendar_icon.gif" width="19" height="16" border="0" onclick="popUpCalendar(this, WORK_TODATE, 'yyyymmdd')" style="CURSOR: Hand;"></a></td>
					</tr>
					</table></td>

					<td align="center" bgcolor="e5eff8" class="sub_table_b">준공년월일</td>
					<td bgcolor="eaeaea" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
					<tr>
						<td><input name="COMPLETION_DATE" type="text" class="essential" style="width:65px" value="" onFocus="" readonly></td>
						<td><a><img src="/img/calendar_icon.gif" width="19" height="16" border="0" onclick="popUpCalendar(this, COMPLETION_DATE, 'yyyymmdd')" style="CURSOR: Hand;"></a></td>
					</tr>
					</table></td>
			    </tr>
			    
				<tr>
					<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">공사내용</td>
					<td colspan="3" bgcolor="eaeaea" class="table_bl_left"><table width="100%" border="0" cellpadding="0" cellspacing="0" class="sub_stan">
					<input name="EXE_INFO" type="text" class="input_form1" style="width:98%">
					</table></td>
			    </tr>
				
			</table></td>
		</tr>
		
		<tr>
			<td height="40" align="right">
			<table width="0" border="0" cellspacing="0" cellpadding="0" align="right">
<!--				<a href="javascript:Delete()"><img src="/img/del_icon3.gif" alt="삭제" width="56" height="18" border="0"></a>-->
				<a href="javascript:Sisul_Register()"><img src="/img/save_icon2.gif" alt="저장" width="56" height="18" border="0"></a>
			</table>
			</td>
		</tr>
		
		</table></td>
	</tr>

</table>
</body>
</html>
