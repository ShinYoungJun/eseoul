<%@ 
		page contentType="text/html;charset=euc-kr"
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=MS949">
<title>RexpreViewTest</title>
<script language="javascript" src="./rexscript/rexpert.js"></script>
<script language="javascript" src="./rexscript/rexpert_properties.js"></script>

<script language="JavaScript">
	function fnOpenRexViewerJavaScript() {
		var oRptMainParam;
		oRptMainParam = rex_GetgoDictionay();

		// 옵션 - 데이터 및 xpath 설정
		oRptMainParam.put("rex_data", "http://localhost:8080/RexServer/samples/serverparam/RexService_hansolsap.jsp");

		// 필수 - 레포트명
		oRptMainParam.put("rex_rptname", "customers");
		// oRptMainParam.put("rex_rptname", "cospec");

		// 필수 - 데이터 타입 설정
		oRptMainParam.put("rex_datatype", "XML");  // XML, CSV

		// 옵션 - 다른 DB를 연결시
		oRptMainParam.put("rex_userservice", "Sql2");

		// 옵션 - 서버로 전달되는 파라메터 - datatype, sql , userservice, split 은 사용하면 안됨
		var oServerParam;
		oServerParam = rex_GetgoDictionay();
		oServerParam.put("SAPID", "sapuserid");
		//oServerParam.put("other", "other");

		oRptMainParam.put("rex_server_param", oServerParam);

		// preview 팝업 열기
		//rex_gfRexRptOpen("popup", oRptMainParam);

		//rex_gfRexRptOpen("popupmodal", oRptMainParam);
		rex_gfRexRptOpen("iframe", ifrmRexPreview, oRptMainParam);
		//rex_gfRexRptOpen("print", oRptMainParam);
		//rex_gfRexRptOpen("save", oRptMainParam);
	}
</script>

</head>
<body>
	<button id="btnRexViewer" onclick="fnOpenRexViewerJavaScript();">레포트 보기</button><br>
	<textarea id="txtData" rows="5" cols="100"></textarea>
	<br>
	<iframe id="ifrmRexPreview" src="RexPreView.jsp" width="100%" height="450"></iframe>
</body>
</html>
