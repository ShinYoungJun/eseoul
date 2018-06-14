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
		// iframe
		
		rex_gfRexRptOpen("iframepush", ifrmRexPreview1, fnOpenRexViewer1());
		rex_gfRexRptOpen("iframepush", ifrmRexPreview2,  fnOpenRexViewer2());
		rex_gfRexRptOpen("iframepush", ifrmRexPreview3,  fnOpenRexViewer2());
		rex_gfRexRptOpen("iframepush", ifrmRexPreview4,  fnOpenRexViewer1());
		rex_gfRexRptOpen("iframeall", "", "");
		


		// save
		/*
		rex_gfRexRptOpen("savepush",  fnOpenRexViewer1());
		rex_gfRexRptOpen("savepush", fnOpenRexViewer2());
		rex_gfRexRptOpen("saveall", "", "");
		*/
	}

	function fnOpenRexViewer1() {
		var oRptMainParam;
		oRptMainParam = rex_GetgoDictionay();

		// 필수 - 레포트명
		oRptMainParam.put("rex_rptname", "test");
		
		oRptMainParam.put("rex_save_file", "c:\\test.pdf");

		// 필수 - 데이터 타입 설정
		oRptMainParam.put("rex_datatype", "CSV");  // XML, CSV

		// 옵션 - 다른 DB를 연결시
		oRptMainParam.put("rex_userservice", "Sql2");
		
		return oRptMainParam;
	}

	function fnOpenRexViewer2() {
		var oRptMainParam;
		oRptMainParam = rex_GetgoDictionay();

		// 필수 - 레포트명
		oRptMainParam.put("rex_rptname", "test2");

		oRptMainParam.put("rex_save_file", "c:\\test2.pdf");

		// 필수 - 데이터 타입 설정
		oRptMainParam.put("rex_datatype", "CSV");  // XML, CSV

		// 옵션 - 다른 DB를 연결시
		oRptMainParam.put("rex_userservice", "Sql2");
		
		return oRptMainParam;
	}

</script>


</head>
<body>
	<button id="btnRexViewer" onclick="fnOpenRexViewerJavaScript();">레포트 보기</button><br>
	<textarea id="txtData" rows="4" cols="100"></textarea>
	<br>
	<iframe id="ifrmRexPreview1"   width="100%" height="100"></iframe>
	<iframe id="ifrmRexPreview2"   width="100%" height="100"></iframe>
	<iframe id="ifrmRexPreview3"   width="100%" height="100"></iframe>
	<iframe id="ifrmRexPreview4"   width="100%" height="100"></iframe>

	<!--script language="JavaScript" src="./rexscript/rex_xecureweb.js"></script-->
</body>
</html>

