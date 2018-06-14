<%@ 
		page contentType="text/html;charset=euc-kr"
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=MS949">
<title>RexpreViewTest</title>
<script language="javascript" src="../../rexscript/rexpert.js"></script>
<script language="javascript" src="../../rexscript/rexpert_properties.js"></script>

<script language="JavaScript">

	function fnOpenRexViewerJavaScript() {
		var oRptMainParam;
		oRptMainParam = rex_GetgoDictionay();

		// 필수 - 레포트명
		//oRptMainParam.put("rex_rptname", "samples/markany/krx");
		oRptMainParam.put("rex_rptname", "http://" + location.host + "/RexServer/samples/markany/krx.rex");

		// 필수 - 데이터 타입 설정
		oRptMainParam.put("rex_datatype", "XMLFILE");  // XML, CSV
		oRptMainParam.put("rex_data", "http://" + location.host + "/RexServer/samples/markany/krx_ok_no.xml");

		// markany
		oRptMainParam.put("rex_markany", "true");
		oRptMainParam.put("rex_markany_param", "dllname=MAePageSAFERRexpert.dll;datafilename=MaPrintInfoKrxRex.dat;enablecapture=0;enablespool=0;enableprinter=0;enableprinterInfo=0;printeroption=3;imagesaferoption=0");
		oRptMainParam.put("rex_markany_cellwidth", "18");
		oRptMainParam.put("rex_markany_cellheight", "2");
		//oRptMainParam.put("rex_markany_path", rex_gsRexServiceRootURL + "rexpert/jsp/MaFpsCommon.jsp");
		oRptMainParam.put("rex_markany_path", rex_gsRexServiceRootURL + "/samples/markany/krx_ok_no.csv");
		oRptMainParam.put("rex_markany_setpagedata", "MaPrintInfoKrxRex.dat");

		// preview 팝업 열기
		rex_gfRexRptOpen("iframe", ifrmRexPreview, oRptMainParam);
	}
</script>


</head>
<body>
	<button id="btnRexViewer" onclick="fnOpenRexViewerJavaScript();">레포트 보기</button><br>
	<textarea id="txtData" rows="5" cols="100"></textarea>
	<br>
	<iframe id="ifrmRexPreview" src="../../RexPreView.jsp" width="100%" height="450"></iframe>
</body>
</html>

