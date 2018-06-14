<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ include file="/jsp/common/include.jsp" %> 

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
    
<!-- 
    	점용목적 코드
-->

<%
	String SectionCode=request.getParameter("SectionCode")==null?"":request.getParameter("SectionCode");
	String PURPOSE_CD_TEXT=request.getParameter("PURPOSE_CD")==null?"":request.getParameter("PURPOSE_CD");
%>

<link href="/css/roads.css" rel="stylesheet" type="text/css">

<script type="text/javascript"><!--
//<![CDATA[

//	window.onload	= function()
//	{
//		Selected_Class();
//	}

	var SectionCode="<%=SectionCode%>";
	var PURPOSE_CD_TEXT="<%=PURPOSE_CD_TEXT%>";
	
	function Init_PurposeCode()
	{
		Selected_Class();
	}

	function getXMLHTTPRequest()
	{
		var xRequest = null;
		xRequest = new ActiveXObject("Microsoft.XMLHTTP");

		return xRequest;
	}

	var req;
	var	call;
	
	function sendRequest(url, params, HttpMethod, callback)
	{
		req = getXMLHTTPRequest();

		call	= callback;
		if(req){
			req.onreadystatechange = onReadyStateChange;
			req.open(HttpMethod, url, true);
			req.setRequestHeader("Content-Type","application/x-www-form-urlencoded;charset=UTF-8");
			req.send(params);
		}
	}

	function onReadyStateChange()
	{
		var ready = req.readyState;
		var data = null;
		if(ready == 4){
			if(this.call	!= null)
				this.call(req.responseText);
		}
	}

	
    function fncSelectBoxSetting(strParam, selectBoxId, defaultSel, topLabel)
    {
        var xmldoc = new ActiveXObject("Microsoft.XMLDOM");
        var selectBoxLabel;
        var opt = document.getElementById(selectBoxId);
        

   //     xmldoc.async	= "false";
   
	    xmldoc.loadXML(strParam);
	    var root = xmldoc.getElementsByTagName("option").length;
	
	   //alert(strParam);
        // defaultSel --; //20090805 전영수 수정전

        if(defaultSel	< 0)
        	selectBoxLabel	= "";
        else
        {
  		//selectBoxLabel = xmldoc.getElementsByTagName("option/@label").item(defaultSel).text;  //20090805 전영수 수정전
  		for(var i=0; i<root; i++)
  		{
  		   if(xmldoc.getElementsByTagName("option/@value").item(i).text==defaultSel)
  		   {
  		       selectBoxLabel = xmldoc.getElementsByTagName("option/@label").item(i).text;
  		   }
  		}
  			
  	}
  	
	opt.value	= selectBoxLabel;
    }
		

	function	Selected()
	{	
		var form = document.form;

		var	ClassCode	= document.getElementById("PURPOSE1");
		var	SortCode	= document.getElementById("PURPOSE2");
		var	KindCode	= document.getElementById("PURPOSE3");
		var	PurposeCode	= document.getElementById("PURPOSE_CD");

		if(ClassCode == null)	ClassCode	= 0;
		if(SortCode == null)	SortCode	= 0;
		if(KindCode == null)	KindCode	= 0;	
			
		var	result	= ClassCode.value + SortCode.value + KindCode.value;

		PurposeCode.value	= result;
	}

	function	Selected_Class()
	{
		var	PurposeCode	= document.getElementById("PURPOSE_CD");
		var	param	= "SectionCode="+SectionCode;
		
		if(PurposeCode	==	null	||	PurposeCode.value	==	"")
			PurposeCode.value	= "";

		sendRequest("/purposeclasscode.do", param, "GET", Search_Result_Class);
	}

	function	Result_Class(obj)
	{
		fncSelectBoxSetting(obj, "PURPOSE1", 0, "선택");

	//	Selected();
	}

	function	Selected_Sort()
	{
		var	ClassCode	= document.getElementById("PURPOSE1");
		var	param	= "ClassCode=" + ClassCode.value+"&SectionCode="+SectionCode;
		alert(param);
		
		sendRequest("/purposesortcode.do", param, "GET", Result_Sort);
	}

	function	Result_Sort(obj)
	{	
		fncSelectBoxSetting(obj, "PURPOSE2", 0, "선택");

		Selected_Kind();

		Selected();
	}

	function	Selected_Kind()
	{
		var	ClassCode	= document.getElementById("PURPOSE1");
		var	SortCode	= document.getElementById("PURPOSE2");
		var	param	= "ClassCode=" + ClassCode.value + "&SortCode=" + SortCode.value+"&SectionCode="+SectionCode;

		sendRequest("/purposekindcode.do", param, "GET", Result_Kind);
	}

	function	Result_Kind(obj)
	{
		fncSelectBoxSetting(obj, "PURPOSE3", 0, "선택");

		Selected();
	}

	
	function	PurposeCode_Search()
	{
		if(event.keyCode!=13)
			return;

		var	PurposeCode	= document.getElementById("PURPOSE_CD").value;

		if(PurposeCode.length > 3)
		{
		//	alert("3자리를 입력하세요");
			return;
		}

		sendRequest("/purposeclasscode.do", null, "GET", Search_Result_Class);
	}

	function	Search_Result_Class(obj)
	{
		var	PurposeCode	= document.getElementById("PURPOSE_CD").value;
		var	ClassCode	= PurposeCode.substring(0, 1);
		fncSelectBoxSetting(obj, "PURPOSE1", ClassCode, "선택");

		param	= "ClassCode=" + ClassCode+"&SectionCode="+SectionCode;
		sendRequest("/purposesortcode.do", param, "GET", Search_Result_Sort);	
	}

	function	Search_Result_Sort(obj)
	{
		var	PurposeCode	= document.getElementById("PURPOSE_CD").value;
		var	ClassCode	= PurposeCode.substring(0, 1);
		var	SortCode	= PurposeCode.substring(1, 2);
		fncSelectBoxSetting(obj, "PURPOSE2", SortCode, "선택");

		param	= "ClassCode=" + ClassCode + "&SortCode=" + SortCode+"&SectionCode="+SectionCode;
		sendRequest("/purposekindcode.do", param, "GET", Search_Result_Kind);
	}

	function	Search_Result_Kind(obj)
	{
		var	PurposeCode	= document.getElementById("PURPOSE_CD").value;
		var	KindCode	= PurposeCode.substring(2, 3);
		fncSelectBoxSetting(obj, "PURPOSE3", KindCode, "선택");

		var	ClassCode	= document.getElementById("PURPOSE1").value;
		var	SortCode	= document.getElementById("PURPOSE2").value;
		var	KindCode	= document.getElementById("PURPOSE3").value;
		var	PurposeCode	= document.getElementById("PURPOSE_CD").value;
		var	PurposeName	= "[" + PurposeCode + "] ";

		if( (ClassCode!="undefined") && (ClassCode.length	> 1) )
			PurposeName += ClassCode;
		if( (SortCode!="undefined") && (SortCode.length	> 1) )
			PurposeName += " - " + SortCode;
		if( (KindCode!="undefined") && (KindCode.length	> 1) )
			PurposeName += " - " + KindCode;

		document.getElementById("PURPOSE_NM").value	= PurposeName;
				
	//	document.getElementById("PURPOSE_NM").value	= "[" + PurposeCode + "] " + ClassCode + " - " + SortCode + " - " + KindCode; 
		
	}

//]]>
-->
</script>

<html>
<body class="view" leftmargin=0 topmargin=0 onload="Init_PurposeCode();">
<input type="hidden" id="PURPOSE_CD" name="PURPOSE_CD" value="<%=PURPOSE_CD_TEXT%>">
<input type="hidden" id="PURPOSE1" name="PURPOSE1" value="">
<input type="hidden" id="PURPOSE2" name="PURPOSE2" value="">
<input type="hidden" id="PURPOSE3" name="PURPOSE3" value="">

<td>
	<input id="PURPOSE_NM" name="PURPOSE_NM" type="text" class="view" style="width:630px" value="<%=PURPOSE_CD_TEXT%>" readonly>
</td>

<!--
<td class="table_bl_left"><a href="javascript:Selected();"><img src="/img/search_icon.gif" alt="검색" width="56" height="18" border="0"></a></td>
-->
</body>
</html>