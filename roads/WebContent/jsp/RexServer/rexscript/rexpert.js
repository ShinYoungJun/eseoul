// version information
var rex_gsVersion = "2.5.1.20090213";

// setting information
var rex_goTotalParam = null;
var rex_goTotalSubParam = null;

var rex_goRptMainParam = null;
var rex_goRptSubParams = null;
var rex_goRptMultiParam = null;

var rex_goRptMainParamList = new Array(); // blueeye
var rex_goRptMainParamListIndex = 0; // blueeye
var rex_goRptMainParamInfoList = new Array();

var rex_goUserWindow;
var rex_goRexCtl;
var rex_goMainReport;
var rex_goMainDataSet;

// print status
var rex_gsPrintStatus = "false";

// print status
//var rex_gsEndLoadReportStatus = "false";

// Method for Gethering SubReport-Data
var rex_gsGetSubReportData = "once";  // once or each

// Method for Sharing Parameter
var rex_gsRptParamShare = "share";  // share or each

// Method for Matching Parameter
var rex_gsRptParamMatch = "name";  // index or name

// DataSet CSV Separator Information
var rex_gsCsvSeparatorDataset = "|@|";
var rex_gsCsvSeparatorColumn = "|*|";
var rex_gsCsvSeparatorRow = "";

// Rexpert Web Viewer Windows Size
var rex_gsPreViewType = "popup";  // newpopup, popup, popupmodal, save, print
var rex_gsPreViewFeatures = "center=yes,scrollbars=no,status=no,toolbar=no,resizable=0,location=no,menu=no,width=825,height=600";
var rex_gsPreViewFeaturesModal = "center:yes;resizable:no;scroll:no;status:no;dialogWidth:825px;dialogHeight:600px";

// Rexpert Server Context Root
var rex_gsRexServiceRootURL = rex_gfGetLocationHost() + "/RexServer/";

// Rexpert Web Viewer
var rex_gsPreViewURL = rex_gsRexServiceRootURL + "RexPreView.jsp";

// rex-files(Rexpert Design Files) Location
var rex_gsReportURL = rex_gsRexServiceRootURL + "rexfiles/";

// Rexpert Server Broker
var rex_gsRptServiceURL = rex_gsRexServiceRootURL + "RexService.jsp";

// DB Conntection Information
var rex_gsUserService = "";

// Crypto, Crytpo algorithm and parameter
var rex_crypto_check = false;
var rex_crypto_plugin = ""
//var rex_crypto_plugin = "inisafeweb60.krx"
//var rex_crypto_plugin = "rex_inisafeweb.js"
//var rex_crypto_plugin = "rex_xecureweb.js"
//var rex_crypto_plugin_param = "certificationpath=http://localhost:8080/inisafe/certification.jsp;algorithm=SEED"
var rex_crypto_plugin_param = "certificationpath=" + rex_gfGetLocationHost() + "/RexServer/inisafe_certification.jsp;algorithm=SEED"
var rex_crypto_encode = true;
var rex_crypto_decode = true;
var rex_crypto_encode_flush_count = 0;  // if 0 then none else per count
var rex_crypto_encode_flush_separator = "|!|";

// CSV encoding=euc-kr
var rex_csv_encoding = "encoding=euc-kr";

// Viewer information
var rex_viewer_type = "ANSI";               // ANSI or UNICODE, default=ANSI
var rex_viewer_version = "2,5,1,130";    // version , comma separator
var rex_viewer_install = "EACH";           // EACH or ONCE or NONE, default=EACH

// Language information
var rex_gsLanguage = "ko";
//var rex_gsLanguage = "en";

// constants

// do not edit !!
function rex_gfGetVersion() {
	return rex_gsVersion;
}

function rex_gfGetLocationHost()
{
	var str = "" + document.location;
	var header = "https://";
	var header_length = header.length;
	var pos = str.indexOf( "/" , header_length );
	var str_server	= str.substring( 0, pos );

	return str_server;
}

function rex_Open(sType) {
	// ***************************************************************
	// simple open
	// ***************************************************************
	//rex_Open("popup", [["rex_rptname","test"],["rptparam1", "hello"]]);
	//rex_Open("iframe", ifrmRexPreview, [["rex_rptname","test"],["rptparam1", "hello"]]);
	//rex_Open("print", [["rex_rptname","test"],["rptparam1", "hello"]]);
	//rex_Open("save", [["rex_rptname","test"],["rptparam1", "hello"]]);
	// ***************************************************************

	var oRptMainParamList = new Array();
	var sParam = "";

	for (var i = 1; i < arguments.length; i++) {
		if (sType == "iframe" && i == 1) {
			sParam += ", arguments[" + i + "]";
			continue;
		}

		var oRptMainParam;
		oRptMainParam = rex_GetgoDictionay();

		oRptMainParam.put("rex_datatype", "CSV");  // XML, CSV, XMLSTR, CSVSTR, XMLFILE, CSVFILE

		for (var j = 0; j < arguments[i].length; j++) {
			oRptMainParam.put(arguments[i][j][0], arguments[i][j][1]);
		}

		oRptMainParamList.push(oRptMainParam);
	}

	for (var i = 0; i < oRptMainParamList.length; i++) {
		sParam += ", oRptMainParamList[" + i + "]";
	}

	eval("rex_gfRexRptOpen(sType" + sParam + ")");
}

function rex_gfRexRptOpen(sType) {
	/* �۾���...
	if (typeof(arguments[arguments.length - 1]) == "string") {
		if (rex_goTotalParam == null) {
			rex_goTotalParam = new rex_goDictionary();
		}

		rex_goTotalSubParam = new rex_goDictionary();
	}
	*/
	
	/* */
	//if (rex_gsEndLoadReportStatus != "false")  {
		//alert("����Ʈ�� ���� ���Դϴ�..");
	//	return;
	//}
	
	//if (goPopWin != null) {
	//	if (goPopWin.document.readyState != "complete")  return;
	//}
		
	//rex_gsEndLoadReportStatus = "true";
	/* */
	

	rex_goRptMainParam = null;
	rex_goRptSubParams = null;
	rex_goRptMultiParam = null;

	var sParam = "";

	for (i = 1; i < arguments.length; i++) {
		sParam += "arguments[" + i + "]";

		if (i < arguments.length -1) {
			sParam += ",";
		}
	}

	rex_gsPreViewType = sType;

	if (sType == "popup") {
		eval("rex_gfRexRptOpenPopup(" + sParam + ")");
	} else if (sType == "newpopup") {
		eval("rex_gfRexRptOpenPopup(" + sParam + ")");
	} else if (sType == "popupmodal") {
		eval("rex_gfRexRptOpenPopupModal(" + sParam + ")");
	} else if (sType == "iframe") {
		eval("rex_gfRexRptOpenIframe(" + sParam + ")");
	} else if (sType == "print") {
		eval("rex_gfRexRptPrint(" + sParam + ")");
	} else if (sType == "printpush") { // blueeye
		eval("rex_gfRexRptPrintPush(" + sParam + ")");	
	} else if (sType == "printall") { // blueeye
		eval("rex_gfRexRptPrintAll(" + sParam + ")");
	} else if (sType == "save") {
		eval("rex_gfRexRptSave(" + sParam + ")");
	} else if (sType == "savepush") {
		eval("rex_gfRexRptSavePush(" + sParam + ")");	
	} else if (sType == "saveall") {
		eval("rex_gfRexRptSaveAll(" + sParam + ")");
	} else if (sType == "iframepush") {
		eval("rex_gfRexRptIframePush(" + sParam + ")");	
	} else if (sType == "iframeall") {
		eval("rex_gfRexRptIframeAll(" + sParam + ")");
	}
	
}

var goPopWin = null;

// open preview
function rex_gfRexRptOpenPopup(oRptMainParam) {
	rex_goRptMainParam = oRptMainParam;

	if (rex_goRptMainParam.get("rex_init_end") != null) {
		rex_goRptMainParam.InitEnd = rex_gfRptInitEnd;
	}

	if (rex_goRptMainParam.get("rex_openreport_end") != null) {
		rex_goRptMainParam.OpenReportEnd = rex_gfRptOpenReportEnd;
	}

	if (rex_goRptMainParam.get("rex_send_end") != null) {
		rex_goRptMainParam.SendEnd = rex_gfRptSendEnd;
	}

	if (rex_goRptMainParam.get("rex_endload_end") != null) {
		rex_goRptMainParam.EndLoadEnd = rex_gfRptEndLoadEnd;
	}

	if (rex_goRptMainParam.get("rex_hyperlink_end") != null) {
		rex_goRptMainParam.HyperLinkEnd = rex_gfRptHyperLinkEnd;
	}

	if (rex_goRptMainParam.get("rex_print_end") != null) {
		rex_goRptMainParam.PrintEnd = rex_gfRptPrintEnd;
	}

	rex_goRptSubParams = new rex_goDictionary();

	for (i = 1; i < arguments.length; i++) {
		rex_goRptSubParams.put("" + i, arguments[i]);
	}

	var param = "?";
	
	if (rex_CheckCrypto().Crypto == true) {
		param += "rex_crypto=true&rex_crypto_plugin=" + rex_CheckCrypto().Plugin;
	} else {
		param += "rex_crypto=false";
	}

	var sWindowName = "rex_preview";
	
	if (rex_gsPreViewType == "newpopup") sWindowName = "";

	//alert('rex_gsPreViewURL ='+rex_gsPreViewURL);
	
	if (rex_goRptMainParam.get("rex_open_window") != null) {
		goPopWin = window.open(rex_gsPreViewURL + param, sWindowName, rex_goRptMainParam.get("rex_open_window"));
	} else {
		goPopWin = window.open(rex_gsPreViewURL + param, sWindowName, rex_gsPreViewFeatures);
	}

}

function rex_gfRexRptOpenPopupModal(oRptMainParam) {
	rex_goRptMainParam = oRptMainParam;

	if (rex_goRptMainParam.get("rex_init_end") != null) {
		rex_goRptMainParam.InitEnd = rex_gfRptInitEnd;
	}

	if (rex_goRptMainParam.get("rex_openreport_end") != null) {
		rex_goRptMainParam.OpenReportEnd = rex_gfRptOpenReportEnd;
	}
	
	if (rex_goRptMainParam.get("rex_send_end") != null) {
		rex_goRptMainParam.SendEnd = rex_gfRptSendEnd;
	}

	if (rex_goRptMainParam.get("rex_endload_end") != null) {
		rex_goRptMainParam.EndLoadEnd = rex_gfRptEndLoadEnd;
	}

	if (rex_goRptMainParam.get("rex_hyperlink_end") != null) {
		rex_goRptMainParam.HyperLinkEnd = rex_gfRptHyperLinkEnd;
	}

	if (rex_goRptMainParam.get("rex_print_end") != null) {
		rex_goRptMainParam.PrintEnd = rex_gfRptPrintEnd;
	}

	rex_goRptSubParams = new rex_goDictionary();

	for (i = 1; i < arguments.length; i++) {
		rex_goRptSubParams.put("" + i, arguments[i]);
	}

	var param = "?";
	
	if (rex_CheckCrypto().Crypto == true) {
		param += "rex_crypto=true&rex_crypto_plugin=" + rex_CheckCrypto().Plugin;
	} else {
		param += "rex_crypto=false";
	}

	if (rex_goRptMainParam.get("rex_open_window") != null) {
		window.showModalDialog(rex_gsPreViewURL + param, window, rex_goRptMainParam.get("rex_open_window"));
	} else {
		window.showModalDialog(rex_gsPreViewURL + param, window, rex_gsPreViewFeaturesModal);
	}

}

function rex_gfRexRptOpenIframe(oIframe, oRptMainParam) {
	rex_goRptMainParam = oRptMainParam;

	if (rex_goRptMainParam.get("rex_init_end") != null) {
		rex_goRptMainParam.InitEnd = rex_gfRptInitEnd;
	}

	if (rex_goRptMainParam.get("rex_openreport_end") != null) {
		rex_goRptMainParam.OpenReportEnd = rex_gfRptOpenReportEnd;
	}	

	if (rex_goRptMainParam.get("rex_send_end") != null) {
		rex_goRptMainParam.SendEnd = rex_gfRptSendEnd;
	}

	if (rex_goRptMainParam.get("rex_endload_end") != null) {
		rex_goRptMainParam.EndLoadEnd = rex_gfRptEndLoadEnd;
	}

	if (rex_goRptMainParam.get("rex_hyperlink_end") != null) {
		rex_goRptMainParam.HyperLinkEnd = rex_gfRptHyperLinkEnd;
	}

	if (rex_goRptMainParam.get("rex_print_end") != null) {
		rex_goRptMainParam.PrintEnd = rex_gfRptPrintEnd;
	}

	rex_goRptSubParams = new rex_goDictionary();

	for (i = 2; i < arguments.length; i++) {
		rex_goRptSubParams.put("" + (i - 1), arguments[i]);
	}

	var param = "?";
	
	if (rex_CheckCrypto().Crypto == true) {
		param += "rex_crypto=true&rex_crypto_plugin=" + rex_CheckCrypto().Plugin;
	} else {
		param += "rex_crypto=false";
	}

	

	oIframe.location.href = rex_gsPreViewURL + param;
}

function rex_gfRexRptPrint(oRptMainParam) {
	rex_goRptMainParam = oRptMainParam;

	if (rex_goRptMainParam.get("rex_init_end") != null) {
		rex_goRptMainParam.InitEnd = rex_gfRptInitEnd;
	}

	if (rex_goRptMainParam.get("rex_openreport_end") != null) {
		rex_goRptMainParam.OpenReportEnd = rex_gfRptOpenReportEnd;
	}

	if (rex_goRptMainParam.get("rex_send_end") != null) {
		rex_goRptMainParam.SendEnd = rex_gfRptSendEnd;
	}

	rex_goRptSubParams = new rex_goDictionary();

	for (i = 1; i < arguments.length; i++) {
		rex_goRptSubParams.put("" + i, arguments[i]);
	}

	if (rex_goRptMainParam.get("rex_print") != null) {
		rex_gfRexRptPrintSetParam();
	} else {
		rex_goRptMainParam.put("rex_print", "true");		
	}

	//rex_goRptMainParam.put("rex_printdirect", "false");

	if (rex_goRptMainParam.get("rex_print_end") != null) {
		rex_goRptMainParam.PrintEnd = rex_gfRptPrintEnd;
	}

	var param = "?";
	
	if (rex_CheckCrypto().Crypto == true) {
		param += "rex_crypto=true&rex_crypto_plugin=" + rex_CheckCrypto().Plugin;
	} else {
		param += "rex_crypto=false";
	}

	if (document.all.item("rex_ifrmRexPreview") == null) {
		var sHTML = "<iframe id='rex_ifrmRexPreview' src='" + rex_gsPreViewURL + param + "' width='0' height='0'></iframe>";
		document.body.insertAdjacentHTML("beforeEnd", sHTML);
	} else {
		rex_ifrmRexPreview.location.href = rex_gsPreViewURL + param;
	}
}

// {-- blueeye

function rex_gfRexRptPrintPush(oRptMainParam) {
	rex_goRptMainParamList.push(oRptMainParam);
}

function rex_gfRexRptPrintAll() {
	rex_gfRexRptPrintAllEnd("","","","");
}

function rex_gfRexRptPrintAllEnd(oReport, oDataSet, RowCount, sFuncName) {

	if(rex_goRptMainParamList.length > 0 && rex_goRptMainParamList.length > rex_goRptMainParamListIndex)
	{
		var goRptMainParam = rex_goRptMainParamList[rex_goRptMainParamListIndex];
		
		if(goRptMainParam != null)
		{
			goRptMainParam.put("rex_print_end", "rex_gfRexRptPrintAllEnd");
			rex_gfRexRptPrint(goRptMainParam);
		}
		
		rex_goRptMainParamListIndex++;
	}
	else
	{
		rex_goRptMainParamListIndex = 0;
		rex_goRptMainParamList.length = 0
	}	
}

// blueeye --}

function rex_gfRexRptIframePush(oIframe, oRptMainParam) {
	rex_goRptMainParamList.push(oRptMainParam);
	rex_goRptMainParamInfoList.push(oIframe);
}

function rex_gfRexRptIframeAll() {
	rex_gfRexRptIframeAllEnd("","","");
}

function rex_gfRexRptIframeAllEnd(oReport, oDataSet, sFuncName) {

	if(rex_goRptMainParamList.length > 0 && rex_goRptMainParamList.length > rex_goRptMainParamListIndex)
	{
		var goRptMainParam = rex_goRptMainParamList[rex_goRptMainParamListIndex];
		var oIframe = rex_goRptMainParamInfoList[rex_goRptMainParamListIndex];

		if(goRptMainParam != null)
		{
			goRptMainParam.put("rex_endload_end", "rex_gfRexRptIframeAllEnd");
			rex_gfRexRptOpenIframe(oIframe, goRptMainParam);
		}
		
		rex_goRptMainParamListIndex++;
	}
	else
	{
		rex_goRptMainParamListIndex = 0;
		rex_goRptMainParamList.length = 0;
		rex_goRptMainParamInfoList.length = 0;
	}	
}

function rex_gfRexRptSavePush(oRptMainParam) {
	rex_goRptMainParamList.push(oRptMainParam);
}

function rex_gfRexRptSaveAll() {
	rex_gfRexRptSaveAllEnd("","");
}

function rex_gfRexRptSaveAllEnd(sFileType, sFileName) {

	if(rex_goRptMainParamList.length > 0 && rex_goRptMainParamList.length > rex_goRptMainParamListIndex)
	{
		var goRptMainParam = rex_goRptMainParamList[rex_goRptMainParamListIndex];

		if(goRptMainParam != null)
		{
			goRptMainParam.put("rex_save_end", "rex_gfRexRptSaveAllEnd");
			rex_gfRexRptSave(goRptMainParam);
		}
		
		rex_goRptMainParamListIndex++;
	}
	else
	{
		rex_goRptMainParamListIndex = 0;
		rex_goRptMainParamList.length = 0;
	}	
}

function rex_gfRexRptSave(oRptMainParam) {
	rex_goRptMainParam = oRptMainParam;

	if (rex_goRptMainParam.get("rex_init_end") != null) {
		rex_goRptMainParam.InitEnd = rex_gfRptInitEnd;
	}

	if (rex_goRptMainParam.get("rex_openreport_end") != null) {
		rex_goRptMainParam.OpenReportEnd = rex_gfRptOpenReportEnd;
	}

	if (rex_goRptMainParam.get("rex_send_end") != null) {
		rex_goRptMainParam.SendEnd = rex_gfRptSendEnd;
	}

	rex_goRptSubParams = new rex_goDictionary();

	for (i = 1; i < arguments.length; i++) {
		rex_goRptSubParams.put("" + i, arguments[i]);
	}

	rex_goRptMainParam.put("rex_save", "true");

	if (rex_goRptMainParam.get("rex_save_end") != null) {
		rex_goRptMainParam.SaveEnd = rex_gfRptSaveEnd;
	}

	var param = "?";
	if (rex_goRptMainParam.get("rex_crypto") != null) {
		param += "rex_crypto=" + rex_goRptMainParam.get("rex_crypto");
	} else {
		param += "rex_crypto=false";
	}

	if (document.all.item("rex_ifrmRexPreview") == null) {
		var sHTML = "<iframe id='ifrmRexPreview' src='" + rex_gsPreViewURL + param + "' width='0' height='0'></iframe>";
		document.body.insertAdjacentHTML("beforeEnd", sHTML);
	} else {
		rex_ifrmRexPreview.location.href = rex_gsPreViewURL + param;
	}
}

function rex_GetgoDictionay() {
	return new rex_goDictionary();
}

// javascript hashmap
function rex_goDictionary() {
	this.nodeObject = new Object();
	this.put = rex_goDictionary_put;
	this.get = rex_goDictionary_get;
	this.keys = rex_goDictionary_keys;
	this.del = rex_goDictionary_del;

	this.Init = null;

	this.CallBack = null;
	
	this.InitEnd = null;
	
	this.OpenReportEnd = null;
	
	this.SendEnd = null;

	this.EndLoadEnd = null;
	
	this.HyperLinkEnd = null;
	
	this.SaveEnd = null;

	this.PrintEnd = null;

	this.length = 0;
}

function rex_goDictionary_put(key, value)
{
    obj = this.nodeObject;

    searchFlag = 0;

	for(var n in obj) {
		if(n == key) {
			obj[key] = value;
			searchFlag = 1;
		}
	}

    if(searchFlag == 0) {
    	this.length++;
        obj[key] = value;
    }
}

function rex_goDictionary_get(key) {
    obj = this.nodeObject;
    return obj[key];
}

function rex_goDictionary_keys(){
    return this.nodeObject;
}

function rex_goDictionary_del(key) {
    this.put(key, null);
}

function rex_gfRexInit(oRexCtl) {
	//rex_goRexCtl = oRexCtl;
	var sSetting = "open=1;save=0;print=1;stop=1;zoomin=1;zoomout=1;moveprev=1;movenext=1;combo=1;movefirst=1;movelast=1;help=1";
	rex_gfShowToolBarButton(oRexCtl, sSetting);
}

// ShowToolBarButton
function rex_gfShowToolBarButton(oRexCtl, sSetting) {
	
	//"movelast=1;save=0"
	
	var aSetting = sSetting.split(";");
	
	for (var i = 0; i < aSetting.length; i++) {
		if (aSetting[i].trim() == "") continue;
		
		var aSetInfo = aSetting[i].split("=");
		
		if (aSetInfo[0].trim() == "open") {
			if (aSetInfo[1].trim() == "0") 
				oRexCtl.ShowToolBarButton(0, false);
			else
				oRexCtl.ShowToolBarButton(0, true);
		} else if (aSetInfo[0].trim() == "save") {
			if (aSetInfo[1].trim() == "0") 
				oRexCtl.ShowToolBarButton(1, false);
			else
				oRexCtl.ShowToolBarButton(1, true);
		} else if (aSetInfo[0].trim() == "print") {
			if (aSetInfo[1].trim() == "0") 
				oRexCtl.ShowToolBarButton(2, false);
			else
				oRexCtl.ShowToolBarButton(2, true);
		} else if (aSetInfo[0].trim() == "stop") {
			if (aSetInfo[1].trim() == "0") 
				oRexCtl.ShowToolBarButton(4, false);
			else
				oRexCtl.ShowToolBarButton(4, true);
		} else if (aSetInfo[0].trim() == "zoomin") {
			if (aSetInfo[1].trim() == "0") 
				oRexCtl.ShowToolBarButton(7, false);
			else
				oRexCtl.ShowToolBarButton(7, true);
		} else if (aSetInfo[0].trim() == "zoomout") {
			if (aSetInfo[1].trim() == "0") 
				oRexCtl.ShowToolBarButton(8, false);
			else
				oRexCtl.ShowToolBarButton(8, true);
		} else if (aSetInfo[0].trim() == "moveprev") {
			if (aSetInfo[1].trim() == "0") 
				oRexCtl.ShowToolBarButton(9, false);
			else
				oRexCtl.ShowToolBarButton(9, true);
		} else if (aSetInfo[0].trim() == "movenext") {
			if (aSetInfo[1].trim() == "0") 
				oRexCtl.ShowToolBarButton(10, false);
			else
				oRexCtl.ShowToolBarButton(10, true);
		} else if (aSetInfo[0].trim() == "combo") {
			if (aSetInfo[1].trim() == "0") 
				oRexCtl.ShowToolBarButton(11, false);
			else
				oRexCtl.ShowToolBarButton(11, true);
		} else if (aSetInfo[0].trim() == "movefirst") {
			if (aSetInfo[1].trim() == "0") 
				oRexCtl.ShowToolBarButton(12, false);
			else
				oRexCtl.ShowToolBarButton(12, true);
		} else if (aSetInfo[0].trim() == "movelast") {
			if (aSetInfo[1].trim() == "0") 
				oRexCtl.ShowToolBarButton(13, false);
			else
				oRexCtl.ShowToolBarButton(13, true);
		} else if (aSetInfo[0].trim() == "help") {
			if (aSetInfo[1].trim() == "0") 
				oRexCtl.ShowToolBarButton(14, false);
			else
				oRexCtl.ShowToolBarButton(14, true);
		} else if (aSetInfo[0].trim() == "tree") {
			if (aSetInfo[1].trim() == "0") 
				oRexCtl.ShowToolBarButton(15, false);
			else
				oRexCtl.ShowToolBarButton(15, true);
		} else if (aSetInfo[0].trim() == "ToolBarVisible") {
			if (aSetInfo[1].trim() == "1") 
				oRexCtl.ToolBarVisible = true;
			else
				oRexCtl.ToolBarVisible = false;
		} else if (aSetInfo[0].trim() == "ShowProcessDialog") {
			if (aSetInfo[1].trim() == "1")
				oRexCtl.ShowProcessDialog = true;
			else
				oRexCtl.ShowProcessDialog = false;
		} else if (aSetInfo[0].trim() == "ShowParameterDialog") {
			if (aSetInfo[1].trim() == "1")
				eval("oRexCtl." + aSetInfo[0].trim() + " = true");
			else
				eval("oRexCtl." + aSetInfo[0].trim() + " = false");
		} else {
			eval("oRexCtl." + aSetInfo[0].trim() + " = \"" + aSetInfo[1].trim() + "\" ");
		}
	}
}

// call from rex_gfRexRptPrint
function rex_gfRexRptPrintSetParam() {

	var sSetting = rex_goRptMainParam.get("rex_print");
	var aSetting = sSetting.split(";");

	for (var i = 0; i < aSetting.length; i++) {
		if (aSetting[i].trim() == "") continue;
		
		var aSetInfo = aSetting[i].split("=");
		
		if (aSetInfo[0].trim() == "direct") {
			rex_goRptMainParam.put("rex_printdirect", aSetInfo[1].trim());
		} else if (aSetInfo[0].trim() == "startpage") {
			rex_goRptMainParam.put("rex_print_startpage", aSetInfo[1].trim());
		} else if (aSetInfo[0].trim() == "endpage") {
			rex_goRptMainParam.put("rex_print_endpage", aSetInfo[1].trim());
		} else if (aSetInfo[0].trim() == "count") {
			rex_goRptMainParam.put("rex_print_count", aSetInfo[1].trim());
		} else if (aSetInfo[0].trim() == "skipzero") {
			rex_goRptMainParam.put("rex_print_skipzero", aSetInfo[1].trim());
		}
	}

	rex_goRptMainParam.put("rex_print", "true");
}

String.prototype.trim = function() {
    return this.replace(/(^ *)|( *$)/g, "");
}
String.prototype.ltrim = function() {
    return this.replace(/(^ *)/g, "");
}
String.prototype.rtrim = function() {
    return this.replace(/( *$)/g, "");
}

function rex_gfRptInitEnd(oRexCtl, sFuncName) {
    eval(sFuncName + "(oRexCtl)") ;
}

/*
function rex_gfRptOpenReportEnd(oRexCtl, oReport, sFuncName) {
    eval(sFuncName + "(oRexCtl, oReport)") ;
}
*/

function rex_gfRptOpenReportEnd(oReport, sFuncName) {
    eval(sFuncName + "(oReport)") ;
}

function rex_gfRptSendEnd(sReportName, oConnection, sFuncName) {
    eval(sFuncName + "(sReportName, oConnection)") ;
}

/*
function rex_gfRptEndLoadEnd(oRexCtl, oReport, oDataSet, sFuncName) {
    eval(sFuncName + "(oRexCtl, oReport, oDataSet)") ;
}
*/

function rex_gfRptEndLoadEnd(oReport, oDataSet, sFuncName) {
    eval(sFuncName + "(oReport, oDataSet)") ;
}

/*
function rex_gfRptHyperLinkEnd(oRexCtl, oReport, sLink, sToolTip, sFuncName) {
    eval(sFuncName + "(oRexCtl, oReport, sLink, sToolTip)") ;
}
*/

function rex_gfRptHyperLinkEnd(oReport, sLink, sToolTip, sFuncName) {
    eval(sFuncName + "(oReport, sLink, sToolTip)") ;
}

function rex_gfRptSaveEnd(sFileType, sFileName, sFuncName) {
    eval(sFuncName + "(sFileType, sFileName)") ;
}

function rex_gfRptPrintEnd(oReport, oDataSet, RowCount, sFuncName) {
    eval(sFuncName + "(oReport, oDataSet, RowCount)") ;
}


function rex_gfRexRptOpenMulti(sType, sOption) {
	rex_goRptMainParam = null;
	rex_goRptSubParams = null;
	rex_goRptMultiParam = null;

	var sParam = "";

	for (var i = 2; i < arguments.length; i++) {
		sParam += "arguments[" + i + "]";

		if (i < arguments.length -1) {
			sParam += ",";
		}
	}

	if (sType == "iframe") {
		rex_goRptMultiParam = arguments[3];
	}
	else {
		rex_goRptMultiParam = arguments[2];
	}

	if (sOption.trim() == "") {
		var i = 0;
		var obj = rex_goRptMultiParam.keys();
		for(var key in obj) {
			i++;
			if (i > 1) {
				rex_goRptMainParam = obj[key];
				break;
			}
		}

	} else {
		rex_goRptMainParam = rex_goRptMultiParam.get(sOption);
	}

	/*
	if (sType == "popup") {
		eval("rex_gfRexRptOpenPopup(" + sParam + ")");
	} else if (sType == "popupmodal") {
		eval("rex_gfRexRptOpenPopupModal(" + sParam + ")");
	} else if (sType == "iframe") {
		eval("rex_gfRexRptOpenIframe(" + sParam + ")");
	} else if (sType == "print") {
		eval("rex_gfRexRptPrint(" + sParam + ")");
	} else if (sType == "save") {
		eval("rex_gfRexRptSave(" + sParam + ")");
	}
	*/
	
	if (sType == "popup") {
		eval("rex_gfRexRptOpenPopup(rex_goRptMainParam)");
	} else if (sType == "popupmodal") {
		eval("rex_gfRexRptOpenPopupModal(rex_goRptMainParam)");
	} else if (sType == "iframe") {
		eval("rex_gfRexRptOpenIframe(arguments[2], rex_goRptMainParam)");
	} else if (sType == "print") {
		eval("rex_gfRexRptPrint(rex_goRptMainParam)");
	} else if (sType == "save") {
		eval("rex_gfRexRptSave(rex_goRptMainParam)");
	}
}


function rex_CheckCrypto() {
	var bCrypto = false;
	var sCryptoPlugin = "";
	var sCryptoPluginParam = "";
	var bCryptoEncode = false;
	var bCryptoDecode = false;

	if (rex_goRptMainParam.get("rex_crypto") != null) {
		if (rex_goRptMainParam.get("rex_crypto") == "true") {
			bCrypto = true;
		}
	} else if (rex_crypto_check == true) {
		bCrypto = true;
	}

	if (rex_goRptMainParam.get("rex_crypto_plugin") != null) {
		sCryptoPlugin = rex_goRptMainParam.get("rex_crypto_plugin");
	} else if (rex_crypto_plugin != "") {
		sCryptoPlugin = rex_crypto_plugin;
	}

	if (rex_goRptMainParam.get("rex_crypto_plugin_param") != null) {
		sCryptoPluginParam = rex_goRptMainParam.get("rex_crypto_plugin_param");
	} else if (rex_crypto_plugin_param != "") {
		sCryptoPluginParam = rex_crypto_plugin_param;
	}

	if (rex_goRptMainParam.get("rex_crypto_encode") != null) {
		if (rex_goRptMainParam.get("rex_crypto_encode") == "true") {
			bCryptoEncode = true;
		} else {
			bCryptoEncode = false;
		}
	} else {
		bCryptoEncode = rex_crypto_encode;
	}

	if (rex_goRptMainParam.get("rex_crypto_decode") != null) {
		if (rex_goRptMainParam.get("rex_crypto_decode") == "true") {
			bCryptoDecode = true;
		} else {
			bCryptoDecode = false;
		}
	} else {
		bCryptoDecode = rex_crypto_decode;
	}

	return {"Crypto": bCrypto, "Plugin": sCryptoPlugin, "Param": sCryptoPluginParam, "Encode": bCryptoEncode, "Decode": bCryptoDecode, "FlushCount": rex_crypto_encode_flush_count, "Separator": rex_crypto_encode_flush_separator};
}

//--------------- ajax ----------------------
function rex_gfGetAjaxRequest() {
    //if (window.XMLHttpRequest) {
    	// IE�� �ƴҰ��
	//	return new XMLHttpRequest();
    //} else if (Window.ActiveXObject) {
    	// IE�� ��� 
	//	return  new ActiveXObject("Microsoft.XMLHTTP");
		//return new ActiveXObject("Msxml2.XMLHTTP");
    //}

	try {
		obj = new XMLHttpRequest();
	} catch (trymicrosoft) {
		try {
			obj = new ActiveXObject("Msxml2.XMLHTTP");
		} catch (othermicrosoft) {
			try {
				obj = new ActiveXObject("Microsoft.XMLHTTP");
			} catch (failed) {
				obj = null;
			}  
		}
	}

	return obj;
}

function rex_GetgoAjax() {
	return new rex_goAjax();
}

function rex_goAjax() {
	this.Ajax = rex_gfGetAjaxRequest();

	this.SetRequestHeader = rex_goAjax_SetRequestHeader;

	this.AddParameter = rex_goAjax_AddParameter;

	this.Open = rex_goAjax_Open;

	this.Send = rex_goAjax_Send;

	//this.Response = rex_goAjax_Response;

	this.Ajax.onreadystatechange = rex_goAjax_onreadystatechange;

	this.Path = "";

	this.Parameter = "";

	this.Response = rex_goAjax_Response;

	//this.ReturnData = "";

	this.Method = "POST";
	this.isASync = false;

	this.DataType = "XML";

	this.isShowWait = false;

	//this.RequestHeader = new Object();
	// event
}

function rex_goAjax_Open() {
	this.Ajax.open(this.Method, this.Path, this.isASync);
}

function rex_goAjax_SetRequestHeader(sKey, sValue) {
	this.Ajax.setRequestHeader(sKey, sValue);
	//this.Ajax.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");
	//this.Ajax.setRequestHeader('Content-Type', 'application/x-www-form-urlencoded; charset=UTF-8');
	//this.Ajax.setRequestHeader("Content-Type", "text/xml");
}

function rex_goAjax_AddParameter(sKey, sValue) {
	if (this.Parameter != "") this.Parameter += "&";
	//this.Parameter += sKey + "=" + encodeURI(sValue);

	sValue = sValue.replace(/%/g, "%25");

	sValue = sValue.replace(/\+/g, "%2B");

	sValue = sValue.replace(/=/g, "%3D");

	sValue = sValue.replace(/&/g, "%26");

	this.Parameter += sKey + "=" + sValue;
}

function rex_goAjax_Send(sParam) {
	//this.Ajax.send('async=true&org_id='+org_id+'&tbl_id='+tbl_id+'&lvl='+lvl+'&lang='+lang+'&curobjsn='+idx+'&obj_itm_sn='+obj_itm_sn+'&obj_var_id='+obj_var_id[idx]+'&idx='+idx+'&user=NSI&basicitem=&obj_item=13999001');

	if (arguments.length != 0) {
		this.Parameter = arguments[0];
	}

	if (this.isASync == false) {
		if (this.Method == "POST") {
			this.Ajax.send(this.Parameter);
		} else {
			this.Ajax.send("");
		}
		
		return;
	} else {	
		window.showModalDialog("RexProgress.jsp", this, "center:yes;resizable:no;scroll:no;status:no;dialogWidth:400px;dialogHeight:300px");

	} // end if
	
}

function rex_goAjax_onreadystatechange() {
/*
	if ( this.Ajax.readyState==4 )
	{
    	if (this.Ajax.status == 200) 
    	{
    		if (this.DataType == "XML") {
    			//rex_gsAjax_ReturnData = "<?xml " + rex_goAjax.responseXML.firstChild.nodeValue + "?>" + rex_goAjax.responseXML.lastChild.xml;
    			//rex_gsAjax_ReturnData = rex_goAjax.responseText;
    			
    			
    			//this.ReturnData = rex_goAjax.responseXML.xml;
    		} else if (this.DataType == "CSV") {
				//this.ReturnData = rex_goAjax.responseText;
			} else {
				//this.ReturnData = rex_goAjax.responseText;
			}
		} else { // ����
			// rex_goAjax.getAllResponseHeaders()
			// rex_goAjax.getResponseHeader ("header name")

			// rex_goAjax.responseText;
			// rex_goAjax.responseXML
			// rex_goAjax.responseBody
			// rex_goAjax.responseStream
			// rex_goAjax.responseXML

			// rex_goAjax.status // �ڵ�
			// rex_goAjax.statusText // ����
		} // end if
	} // end if
	*/
}

function rex_goAjax_Response() {
	
	if ( this.Ajax.readyState==4 )
	{
    	if (this.Ajax.status == 200) 
    	{
    		if (this.DataType == "XML") {
    			//rex_gsAjax_ReturnData = "<?xml " + rex_goAjax.responseXML.firstChild.nodeValue + "?>" + rex_goAjax.responseXML.lastChild.xml;
    			//rex_gsAjax_ReturnData = rex_goAjax.responseText;

				return this.Ajax.responseText;
    			//return this.Ajax.responseXML.xml;
    		} else if (this.DataType == "CSV") {
				return this.Ajax.responseText;
			} else {
				return this.Ajax.responseText;
			}
		} else { // ����
			// rex_goAjax.getAllResponseHeaders()
			// rex_goAjax.getResponseHeader ("header name")

			// rex_goAjax.responseText;
			// rex_goAjax.responseXML
			// rex_goAjax.responseBody
			// rex_goAjax.responseStream
			// rex_goAjax.responseXML
			// rex_goAjax.status // �ڵ�
			// rex_goAjax.statusText // ����
			//return this.Ajax.rex_goAjax.statusText
			return "";
		} // end if
	} // end if
}

function rex_gfAjaxExcute(sMethod, isASync, sPath, sParam, sDataType, sRequestHeader) {
	var oConnection = rex_GetgoAjax();

	oConnection.Method = sMethod;
	oConnection.isASync = isASync;
	oConnection.Path = sPath;
	oConnection.DataType = sDataType;
	oConnection.Open();

	if (sRequestHeader != "") {
		oConnection.SetRequestHeader("Content-Type", sRequestHeader);
	} else {
		oConnection.SetRequestHeader("Content-Type", "application/x-www-form-urlencoded;charset=EUC-KR");
		//oConnection.setRequestHeader("Content-Type", "application/x-www-form-urlencoded;charset=UTF-8");
	}

	if (sMethod == "POST") {
		if (sParam != "") {
			oConnection.Send(sParam);
		} else {
			oConnection.Send();
		}
	} else {
		oConnection.Send();
	}

	return oConnection;
}
// ----------- ajax end --------------------