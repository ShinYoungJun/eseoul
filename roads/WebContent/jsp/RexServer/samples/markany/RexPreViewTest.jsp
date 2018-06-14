<%@ page contentType="text/html;charset=euc-kr"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=MS949">
	<title>Rexpert Preview</title>
	<script language="javaScript">

	function fnPreView() {
		var oReport;
		var oConnection;
		var oConnectionDRM;
		var oDataSet;

		if (txtInisafePlugin.value != "") {
			//RexCtl.InstallPlugIn("inisafeweb60.krx", "certificationpath=http://localhost:8080/RexServer/samples/initech/certification.jsp;algorithm=SEED");
			RexCtl.InstallPlugIn(txtInisafePlugin.value, txtInisafeParam.value);
		}

		RexCtl.InstallPlugIn("markany", txtMarkanyParam.value);

		oReport = RexCtl.OpenReport(txtRexFile.value);

		oConnection = RexCtl.CreateConnection("http.get");
		oConnection.Path = txtDataFile.value;
		oConnection.Send();

		oDataSet = oReport.CreateDataSetXML(oConnection, "", 0);
		//oDataSet = oReport.CreateDataSetCSV(oConnection, idx, "|@|", "", "|*|", "")
    
    	RexCtl.RunAsBlocking();
    	
    	for (var i = 0; i < RexCtl.GetPageCount(); i++) {
			oConnectionDRM = RexCtl.CreateConnection("http.csv");
			oConnectionDRM.Path = txtMarkanyPath.value;
			oConnectionDRM.AddParameter("xml", RexCtl.GetPageRTX(i));
			oConnectionDRM.AddParameter("cellwidth", txtMarkanyCellwidth.value);
			oConnectionDRM.AddParameter("cellheight", txtMarkanyCellheight.value);
			oConnectionDRM.Send();

			RexCtl.SetPageData(i, "markany", oConnectionDRM.Response(), txtMarkanySetpagedata.value, "");
		} // end for
	} // end function
	</script>

<script LANGUAGE="VBScript" FOR="RexCtl" EVENT="HyperLinkClicked(bstrLink, bstrToolTip, vtCanceled)">
	' Call window.open("http://www.naver.com", "", "center=yes,scrollbars=no,status=no,toolbar=no,resizable=0,location=no,menu=no,width=800,height=600")

	vtCanceled = true
	
	'
</script>

</head>
<body topmargin="0" leftmargin="0"  rightmargin="0" bottommargin="0">
<table width="1000" height="600">
	<tr><td colspan="2"><button onclick="fnPreView();">미리보기</button></td></tr>
	<tr><td width="16%" align=right>rex파일 :</td>
		<td><input type="text" id="txtRexFile" style="width:650pt" value="http://localhost:8080/RexServer/samples/markany/krx.rex"></td>
	</tr>
	<tr><td align=right>data파일 :</td>
		<td><input type="text" id="txtDataFile" style="width:650pt" value="http://localhost:8080/RexServer/samples/markany/krx_ok_no.xml"></td>
	</tr>
	<tr><td align=right>inisafe plugin :</td>
		<td><input type="text" id="txtInisafePlugin" style="width:650pt" value="inisafeweb60.krx"></td>
	</tr>
	<tr><td align=right>inisafe param :</td>
		<td><input type="text" id="txtInisafeParam" style="width:650pt" value="certificationpath=http://localhost:8080/RexServer/samples/initech/certification.jsp;algorithm=SEED"></td>
	</tr>
	<tr><td align=right>markany param :</td>
		<td><input type="text" id="txtMarkanyParam" style="width:650pt" value="dllname=MAePageSAFERRexpert.dll;datafilename=MaPrintInfoKrxRex.dat;enablecapture=0;enablespool=0;enableprinter=0;enableprinterInfo=0;printeroption=3;imagesaferoption=0"></td>
	</tr>
	<tr><td align=right>cellwidth :</td>
		<td><input type="text" id="txtMarkanyCellwidth" value="18"></td>
	</tr>
	<tr><td align=right>cellheight :</td>
		<td><input type="text" id="txtMarkanyCellheight" value="2"></td>
	</tr>
	<tr><td align=right>markany path :</td>
		<td><input type="text" id="txtMarkanyPath" style="width:650pt" value="http://localhost:8080/RexServer/samples/markany/krx_ok_no.csv"></td>
	</tr>
	<tr><td align=right>setpagedata :</td>
		<td><input type="text" id="txtMarkanySetpagedata" style="width:650pt" value="MaPrintInfoKrxRex.dat"></td>
	</tr>
	<tr><td colspan="2" width="100%" height="250"><script src="../../rexscript/rexplugin.js"></script></td></tr>
</table>
</body>
</html> 