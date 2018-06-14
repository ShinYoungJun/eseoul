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
		oRptMainParam.put("rex_rptname", "samples/schedule/test");
		
		// 필수 - 데이터 타입 설정
		oRptMainParam.put("rex_datatype", "CSV");  // XML, CSV

		// 옵션 - 다른 DB를 연결시
		oRptMainParam.put("rex_userservice", "Sql2");

		// 옵션 - Save 관련 설정
		oRptMainParam.put("rex_save_direct", "true");
		oRptMainParam.put("rex_save_file_type", "pdf");
		oRptMainParam.put("rex_save_file", "c:\\test.pdf");
		oRptMainParam.put("rex_save_end", "javaSaveEndFunction"); // javaSaveEndFunction을 실행함 (인자는 sFileType, sFileName);

		oRptMainParam.put("rex_script_alert", "false");

		// preview 팝업 열기
		//rex_gfRexRptOpen("iframe", ifrmRexPreview, oRptMainParam);
		rex_gfRexRptOpen("save", oRptMainParam);

		
		//return oRptMainParam;
	}

	function javaSaveEndFunction(sFileType, sFileName) {
		//alert(	sFileType + "-" + sFileName);
		top.window.opener = top;
		top.window.open('','_parent','');
		top.window.close();
	}
</script>


</head>
<body onload="fnOpenRexViewerJavaScript();">
	<!--button id="btnRexViewer" onclick="fnOpenRexViewerJavaScript();">레포트 보기</button><br>
	<textarea id="txtData" rows="5" cols="100"></textarea>
	<br>
	<iframe id="ifrmRexPreview" src="../../RexPreView.jsp" width="100%" height="450"></iframe-->
</body>
</html>

