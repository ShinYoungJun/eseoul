document.write('<!-- Rexpert25Viewer.cab install -->');

var _s_version = "";

if (rex_viewer_version == "") {
	_s_version = "2,5,1,130";
} else {
	_s_version = rex_viewer_version;
}

if (rex_viewer_install == "ONCE") {
	if (rex_viewer_type == "UNICODE") {
		// file not found !!! (comming soon)
		//document.write('<OBJECT ID="RexCtl" CLASSID="CLSID:24D698E2-AB0A-4a20-8499-99764668997A"  CODEBASE="./cab/Rexpert25ViewerFullU.cab#version=2,5,1,113"  WIDTH="100%" HEIGHT="100%">');
	} else {
		var _is_down = true;
		var _s_codebase = "";
	
		if (rex_viewer_install == "NONE") {
			_is_down = false;
		}

		if (_is_down) _s_codebase = ' CODEBASE="./cab/Rexpert25ViewerFull.cab#version=' + _s_version + '" ';
		
		document.write('<OBJECT ID="RexCtl" CLASSID="CLSID:9E1F4A27-7EB0-4210-98D8-1CCF6671F483" ' + _s_codebase + '  WIDTH="100%" HEIGHT="100%">');	
	}

	document.write('<PARAM NAME="ToolBarVisible" VALUE="true">');
	document.write('<PARAM NAME="StatusBarVisible" VALUE="false">');
	document.write('<PARAM NAME="ShowParameterDialog" VALUE="false">');
	document.write('<PARAM NAME="ShowProcessDialog" VALUE="true">');
	document.write('<PARAM NAME="EnableFetchDataEvent" VALUE="0">');
	document.write('<PARAM NAME="Editable" VALUE="true">');
	document.write('<PARAM NAME="FocusRectVisible" VALUE="false">');
	document.write('<PARAM NAME="BackColor" VALUE="16777215">');
	document.write('</OBJECT>');
} else {
	var _is_down = true;
	var _s_codebase = "";

	if (rex_viewer_install == "NONE") {
		_is_down = false;
	}

	if (rex_viewer_type == "UNICODE") {

		if (_is_down) _s_codebase = ' CODEBASE="./cab/Rexpert25ViewerU.cab#version=' + _s_version + '" ';

		document.write('<OBJECT ID="RexCtl" CLASSID="CLSID:24D698E2-AB0A-4a20-8499-99764668997A" ' + _s_codebase + ' WIDTH="100%" HEIGHT="100%">');
		//document.write('<OBJECT ID="RexCtl" CLASSID="CLSID:24D698E2-AB0A-4a20-8499-99764668997A"  CODEBASE="./cab/Rexpert25ViewerU.cab#version=2,5,1,113"  WIDTH="100%" HEIGHT="100%">');
	} else {
		if (_is_down) _s_codebase = ' CODEBASE="./cab/Rexpert25Viewer.cab#version=' + _s_version + '" ';

		document.write('<OBJECT ID="RexCtl" CLASSID="CLSID:9E1F4A27-7EB0-4210-98D8-1CCF6671F483" ' + _s_codebase + ' WIDTH="100%" HEIGHT="100%">');
		//document.write('<OBJECT ID="RexCtl" CLASSID="CLSID:9E1F4A27-7EB0-4210-98D8-1CCF6671F483"  CODEBASE="./cab/Rexpert25Viewer.cab#version=2,5,1,113"  WIDTH="100%" HEIGHT="100%">');
	}

	document.write('<PARAM NAME="ToolBarVisible" VALUE="true">');
	document.write('<PARAM NAME="StatusBarVisible" VALUE="false">');
	document.write('<PARAM NAME="ShowParameterDialog" VALUE="false">');
	document.write('<PARAM NAME="ShowProcessDialog" VALUE="true">');
	document.write('<PARAM NAME="EnableFetchDataEvent" VALUE="0">');
	document.write('<PARAM NAME="Editable" VALUE="true">');
	document.write('<PARAM NAME="FocusRectVisible" VALUE="true">');
	document.write('<PARAM NAME="BackColor" VALUE="16777215">');
	document.write('</OBJECT>');

	if (_is_down) {
		//document.write('<!-- msxml4.cab install -->');
		document.write('<OBJECT ID="MSXML4"    CLASSID="CLSID:88d969c0-f192-11d4-a65f-0040963251e5" CODEBASE="./cab/msxml4.cab#version=4,10,9404,0"   TYPE="application/x-oleobject" STYLE="DISPLAY: NONE"></OBJECT>');
	
		//document.write('<!-- pdflib_com.cab install -->');
		document.write('<OBJECT ID="PDFLIB"    CLASSID="CLSID:0C4511E0-3EBF-11D3-B46E-000629B2C1ED" CODEBASE="./cab/pdflib_com.cab#version=6,0,1,1"   TYPE="application/x-oleobject" STYLE="DISPLAY: NONE"></OBJECT>');
	
		//document.write('<!-- ExcelExport.cab install -->');
		document.write('<OBJECT ID="Excel"     CLASSID="CLSID:549338E0-265C-4766-BA68-516438730508" CODEBASE="./cab/ExcelExport.cab#version=4,1,3,94" TYPE="application/x-oleobject" STYLE="DISPLAY: NONE"></OBJECT>');
	
		//document.write('<!-- eDocEngineX.cab install -->');
		document.write('<OBJECT ID="eDoc"      CLASSID="CLSID:1DC59A34-1EDD-440A-B21F-CB8857C112E5" CODEBASE="./cab/eDocEngineX.cab#version=2,0,0,0"  TYPE="application/x-oleobject" STYLE="DISPLAY: NONE"></OBJECT>');
	
		//document.write('<!-- Teechart7.cab install -->');
		document.write('<OBJECT ID="Chart1"    CLASSID="CLSID:FAB9B41C-87D6-474D-AB7E-F07D78F2422E" CODEBASE="./cab/teechart7.cab#version=7,0,0,2"    TYPE="application/x-oleobject" STYLE="DISPLAY: NONE"></OBJECT>');
		
		//document.write('<!-- TBarCode5.cab install -->');
		document.write('<OBJECT ID="TBarCode5" CLASSID="CLSID:10ED9AE3-DA1A-461C-826A-CD9C850C58E2" CODEBASE="./cab/TBarCode5.cab#version=5,3,0,49"   TYPE="application/x-oleobject" STYLE="DISPLAY: NONE"></OBJECT>');
	}
}