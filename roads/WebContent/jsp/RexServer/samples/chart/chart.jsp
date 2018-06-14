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

		rex_gfRexRptIfrmePush(ifrmRexPreview1, fnOpenChart("chart1"));
		rex_gfRexRptIfrmePush(ifrmRexPreview3, fnOpenChart("chart3"));
		rex_gfRexRptIfrmePush(ifrmRexPreview4, fnOpenChart("chart4"));
		rex_gfRexRptIfrmePush(ifrmRexPreview5, fnOpenChart("chart5"));
		rex_gfRexRptIfrmePush(ifrmRexPreview6, fnOpenChart("chart6"));

		rex_gfRexRptIfrmaeAll();
	}

	function fnOpenChart(sChart) {
		var oRptMainParam;
		oRptMainParam = rex_GetgoDictionay();

		oRptMainParam.put("rex_rptname", "http://" + location.host + "/RexServer/samples/chart/" + sChart + ".rex");
		oRptMainParam.put("rex_data", "http://" + location.host + "/RexServer/samples/chart/" + sChart + ".xml");
		oRptMainParam.put("rex_datatype", "XMLFILE");  // XML, CSV
		
		return oRptMainParam;
	}

</script>


</head>
<body>
	<button id="btnRexViewer" onclick="fnOpenRexViewerJavaScript();">레포트 보기</button><br>
	<br>
	<iframe id="ifrmRexPreview1" width="100%" height="150"></iframe>
	<iframe id="ifrmRexPreview3" width="100%" height="150"></iframe>
	<iframe id="ifrmRexPreview4" width="100%" height="150"></iframe>
	<iframe id="ifrmRexPreview5" width="100%" height="150"></iframe>
	<iframe id="ifrmRexPreview6" width="100%" height="150"></iframe>
</body>
</html>

