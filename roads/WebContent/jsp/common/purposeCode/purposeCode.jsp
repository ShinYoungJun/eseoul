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
	String essential=request.getParameter("essential")==null?"":request.getParameter("essential");
	String modify_flag=request.getParameter("modify_flag")==null?"":request.getParameter("modify_flag");
	System.out.println("PPP:"+PURPOSE_CD_TEXT);
%>

<link href="/css/roads.css" rel="stylesheet" type="text/css">
<script language='JavaScript' src='/js/Check_inputbox.js'></script>

<script type="text/javascript">
<!--
//<![CDATA[
	var SectionCode="<%=SectionCode%>";
	var PURPOSE_CD_TEXT="<%=PURPOSE_CD_TEXT%>";
	var essential="<%=essential%>";
	var modify_flag="<%=modify_flag%>";
	
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
			{
				this.call(req.responseText);
			}
		}
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
		
		
		
		//alert(strParam);
		
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
        
        //defaultSel --;  //20090805 전영수 수정전 index가 아니구 value를 비교해서 설정하므로 필요 없음
        
        //alert("defaultSel="+defaultSel);

        for(var i = 0; i < root; i++)
        {
        	selectBoxValue = xmldoc.getElementsByTagName("option/@value").item(i).text;
        	selectBoxLabel = xmldoc.getElementsByTagName("option/@label").item(i).text;

            tags 	= document.createElement("option");
       		text	= document.createTextNode(selectBoxLabel);
            tags.setAttribute("label", selectBoxLabel);
            // if(i == defaultSel) tags.setAttribute("selected", "true"); //20090805 전영수 수정전
            
            if(selectBoxValue == defaultSel) tags.setAttribute("selected", "true"); // 코드에 이빨이 빠진경우 처리

            tags.value = selectBoxValue;
            tags.appendChild(text);
            opt.appendChild(tags);
        }
    }

	function	Selected_Class()
	{
		var	PurposeCode	= document.getElementById("PURPOSE_CD");
		//var	param	= "SectionCode="+SectionCode;  //원래코드 20090805 전영수 수정전
		var	param	= "SectionCode="+SectionCode+"&code="+PurposeCode;
		
		if(PurposeCode	==	null	||	PurposeCode.value	==	"")	PurposeCode.value	= "000";
		if(SectionCode	== "%")	return;
		
		if(modify_flag == '1')	//수정인 경우에만 Search_Result_Class_input메소드로 이동 하도록 한다.
		{
			sendRequest("/purposeclasscode.do", param, "GET", Search_Result_Class_input);
		}
		else
		{
			sendRequest("/purposeclasscode.do", param, "GET", Search_Result_Class);
		}
	}

	function	Result_Class(obj)
	{
		fncSelectBoxSetting(obj, "PURPOSE1", 0, "::선택::");

	//	Selected();
	}

	function	Selected_Sort()
	{
		var	ClassCode	= document.getElementById("PURPOSE1");
		
		var	param	= "ClassCode=" + ClassCode.value+"&SectionCode="+SectionCode;
		
		sendRequest("/purposesortcode.do", param, "GET", Result_Sort);
	}

	function	Result_Sort(obj)
	{	
		fncSelectBoxSetting(obj, "PURPOSE2", 0, "::선택::");
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
		fncSelectBoxSetting(obj, "PURPOSE3", 0, "::선택::");

		Selected();
	}
	
	function	PurposeCode_Search()
	{
		var	PurposeCode	= document.getElementById("PURPOSE_CD").value;
		var param = "SectionCode="+SectionCode;

		if(PurposeCode.length >= 3)
			sendRequest("/purposeclasscode.do", param, "GET", Search_Result_Class);
	}
	
	function	PurposeCode_Search_input()
	{
		var	PurposeCode	= document.getElementById("PURPOSE_CD").value;
		//var	param	= "SectionCode="+SectionCode;  //원래코드 20090805 전영수 수정전
		var	param	= "SectionCode="+SectionCode+"&code="+PurposeCode;
		
		if(PurposeCode.length >= 3)
		{
		
			sendRequest("/purposeclasscode.do", param, "GET", Search_Result_Class_input);
		}
	}

	function	Search_Result_Class(obj)
	{
		var	PurposeCode	= document.getElementById("PURPOSE_CD").value;
		var	ClassCode	= PurposeCode.substring(0, 1);
		fncSelectBoxSetting(obj, "PURPOSE1", ClassCode, "::선택::");

		param	= "ClassCode=" + ClassCode+"&SectionCode="+SectionCode;

		sendRequest("/purposesortcode.do", param, "GET", Search_Result_Sort);	
	}
	
	function	Search_Result_Class_input(obj)
	{
		var	PurposeCode	= document.getElementById("PURPOSE_CD").value;
		var	ClassCode	= PurposeCode.substring(0, 1);
		fncSelectBoxSetting(obj, "PURPOSE1", ClassCode, "::선택::");

		param	= "ClassCode=" + ClassCode+"&SectionCode="+SectionCode;

		sendRequest("/purposesortcode.do", param, "GET", Search_Result_Sort_input);	
	}
	
	function	Search_Result_Sort(obj)
	{
		var	PurposeCode	= document.getElementById("PURPOSE_CD").value;
		var	ClassCode	= PurposeCode.substring(0, 1);
		var	SortCode	= PurposeCode.substring(1, 2);
		fncSelectBoxSetting(obj, "PURPOSE2", SortCode, "::선택::");
		param	= "ClassCode=" + ClassCode + "&SortCode=" + SortCode+"&SectionCode="+SectionCode;
		sendRequest("/purposekindcode.do", param, "GET", Search_Result_Kind);
	}
	
	function	Search_Result_Sort_input(obj)
	{
		var	PurposeCode	= document.getElementById("PURPOSE_CD").value;
		var	ClassCode	= PurposeCode.substring(0, 1);
		var	SortCode	= PurposeCode.substring(1, 2);
		fncSelectBoxSetting(obj, "PURPOSE2", SortCode, "::선택::");
		param	= "ClassCode=" + ClassCode + "&SortCode=" + SortCode+"&SectionCode="+SectionCode;
		sendRequest("/purposekindcode.do", param, "GET", Search_Result_Kind_input);
	}
	
	function	Search_Result_Kind(obj)
	{
		var	PurposeCode	= document.getElementById("PURPOSE_CD").value;
		var	KindCode	= PurposeCode.substring(2, 3);
		
		fncSelectBoxSetting(obj, "PURPOSE3", KindCode, "::선택::");
		var	PurposeCodeBefore	= document.getElementById("PURPOSE_CD").value;
		Selected();
		var	PurposeCodeAfter	= document.getElementById("PURPOSE_CD").value;
		var	ClassCode	= document.getElementById("PURPOSE1").value;
		var	SortCode	= document.getElementById("PURPOSE2").value;
		var	KindCode	= document.getElementById("PURPOSE3").value;
		
		if(PurposeCodeBefore != PurposeCodeAfter)
			alert(PurposeCodeBefore + "과(와) 일치하는 데이터는 없습니다");
		else
			sendRequest("/purposecode.do", "code=" + PurposeCodeBefore+"&SectionCode="+SectionCode, "GET", null);
	}
	
	function	Search_Result_Kind_input(obj)
	{
		var	PurposeCode	= document.getElementById("PURPOSE_CD").value;
		var	KindCode	= PurposeCode.substring(2, 3);
		
		fncSelectBoxSetting(obj, "PURPOSE3", KindCode, "::선택::");
		
		var	PurposeCodeBefore	= document.getElementById("PURPOSE_CD").value;
		Selected();
		//var	PurposeCodeAfter	= document.getElementById("PURPOSE_CD").value;

		//var	ClassCode	= document.getElementById("PURPOSE1").value;
		//var	SortCode	= document.getElementById("PURPOSE2").value;
		//var	KindCode	= document.getElementById("PURPOSE3").value;
		var	ClassCode	= PurposeCodeBefore.substring(0, 1);
		var	SortCode	= PurposeCodeBefore.substring(1, 2);
		var	KindCode	= PurposeCodeBefore.substring(2, 3);
		
		//alert(ClassCode + '||'+ SortCode + '||'+ KindCode + '||'+ ClassCode2 + '||'+ SortCode2 + '||'+ KindCode2);
		//전승원 로직 수정 입력된 첫번째 코드값이 0인경우  1번째로 강제로 바꾼다.
		if(document.getElementById("PURPOSE1").selectedIndex == 0){
			document.getElementById("PURPOSE1").selectedIndex = 1;
		}else{
			document.getElementById("PURPOSE1").value = ClassCode;
		}
		document.getElementById("PURPOSE2").value = SortCode;
		document.getElementById("PURPOSE3").value = KindCode;
		
		var	ClassCode2	= document.getElementById("PURPOSE1").value;
		var	SortCode2		= document.getElementById("PURPOSE2").value;
		var	KindCode2		= document.getElementById("PURPOSE3").value;
		var	PurposeCodeAfter	= ClassCode2+SortCode2+KindCode2;
		
		if(PurposeCodeBefore != PurposeCodeAfter){
			alert(PurposeCodeBefore + "과(와) 일치하는 데이터는 없습니다");
			document.getElementById("PURPOSE_CD").value = "000";
			document.getElementById("PURPOSE1").value = "0";
			document.getElementById("PURPOSE2").value = "0";
			document.getElementById("PURPOSE3").value = "0";
		}
		else{
			sendRequest("/purposecode.do", "code=" + PurposeCodeBefore+"&SectionCode="+SectionCode, "GET", null);
		}
	}
	
	function	Selected()
	{
		var form = document.form;
		
		var	PurposeCode	= document.getElementById("PURPOSE_CD");
		var	ClassCode	= document.getElementById("PURPOSE1");
		var	SortCode	= document.getElementById("PURPOSE2");
		var	KindCode	= document.getElementById("PURPOSE3");

		if(essential=="1")
			PurposeCode.className="essential";
		
		if(ClassCode.value == null)	ClassCode.value	= 0;
		if(SortCode.value == null)	SortCode.value	= 0;
		if(KindCode.value == null)	KindCode.value	= 0;
		
		var	result	= ClassCode.value + SortCode.value + KindCode.value;
		//alert(result);
		
		PurposeCode.value	= result;
	
		//if(PurposeCode.Selected_Sebu)
		if(parent.Selected_Sebu)
		{
			if(parent.Selected_Sebu(PurposeCode.value))
			{
				parent.Selected_Sebu(PurposeCode.value);
			}
		}
	}
	
	function isSelectOK()
	{
	    if(document.getElementById("PURPOSE1").options[document.getElementById("PURPOSE1").selectedIndex].label=="::선택::") 
	    {
	        return false;
	    }
	    if(document.getElementById("PURPOSE2").options[document.getElementById("PURPOSE2").selectedIndex].label=="::선택::") 
	    {
	        return false;
	    }
	    if(document.getElementById("PURPOSE3").options[document.getElementById("PURPOSE3").selectedIndex].label=="::선택::") 
	    {
	        return false;
	    }
	    
	    return true;
	}
	

//]]>
-->
</script>
<html>
<body class="view" leftmargin=0 topmargin=0 style="border:0" onload="Selected_Class();">
<table>
<tr>
<td>
	<input name="PURPOSE_CD" id="PURPOSE_CD" type="text" class="input_form1" style="width:20px" value="<%=PURPOSE_CD_TEXT%>" maxlength="3" style="ime-mode:disabled" onKeyDown="nr_num_int(this);" onKeyUp="javascript:PurposeCode_Search_input();" onKeyPress="nr_num_int(this);">
</td>

<td bgcolor="eaeaea" class="table_bl_left">
	<select name="PURPOSE1" id="PURPOSE1" class="input_form1" style="width:160px" OnChange="Selected_Sort()" onkeyup="javascript:PurposeCode_Search();">
	</select>
</td>

<td bgcolor="eaeaea" class="table_bl_left">
	<select name="PURPOSE2" id="PURPOSE2" class="input_form1" style="width:230px" OnChange="Selected_Kind()">
	</select>
</td>

<td bgcolor="eaeaea" class="table_bl_left">
	<select name="PURPOSE3" id="PURPOSE3" class="input_form1" style="width:190px" OnChange="Selected();">
	</select>
</td>
</tr>
</table>
</body>
</html>
<!--
<td class="table_bl_left"><a href="javascript:Selected();"><img src="/img/search_icon.gif" alt="검색" width="56" height="18" border="0"></a></td>
-->
