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

		oRptMainParam.put("rex_getsubreportdata", "each");
		oRptMainParam.put("rex_param_share", "each");

		// 필수 - 레포트명
		oRptMainParam.put("rex_rptname", "samples/each/each");
		// oRptMainParam.put("rex_rptname", "cospec");

		// 필수 - 데이터 타입 설정
		oRptMainParam.put("rex_datatype", "XML");  // XML, CSV
		//oRptMainParam.put("rex_datatype", "XMLSTR");  // XMLSTR, CSVSTR
		//oRptMainParam.put("rex_datatype", "CSVFILE");  // XMLFILE, CSVFILE
		//oRptMainParam.put("rex_datatype", "XMLFILE");  // XMLFILE, CSVFILE

		// 옵션 - 다른 DB를 연결시
		oRptMainParam.put("rex_userservice", "Ora1");

		// 옵션 - 파라메터 설정
		oRptMainParam.put("param1", "abc");
		oRptMainParam.put("param2", "def");
		// oRptMainParam.put("custid", txtData.value);

		var oRptSubParam1;
		oRptSubParam1 = rex_GetgoDictionay();
		oRptSubParam1.put("rex_rptname", "서브리포트섹션1");
		oRptSubParam1.put("rex_datatype", "XML");  // XML, CSV
		oRptSubParam1.put("rex_userservice", "Sql2");
		oRptSubParam1.put("param1", "가나다라");
		oRptSubParam1.put("param3", "마바사아");

		var oRptSubParam2;
		oRptSubParam2 = rex_GetgoDictionay();
		oRptSubParam2.put("rex_rptname", "서브리포트섹션2");
		oRptSubParam2.put("rex_datatype", "XML");  // XML, CSV
		oRptSubParam2.put("rex_userservice", "Ora1");
		oRptSubParam2.put("param1", "가나다라");
		oRptSubParam2.put("param3", "마바사아");
		
		// preview 팝업 열기
		rex_gfRexRptOpen("popup", oRptMainParam, oRptSubParam1, oRptSubParam2);
		// rex_gfRexRptOpen("popupmodal", oRptMainParam);
		// rex_gfRexRptOpen("iframe", ifrmRexPreview, oRptMainParam);
		// rex_gfRexRptOpen("print", oRptMainParam);
		// rex_gfRexRptOpen("save", oRptMainParam);
	}

</script>


</head>
<body>
	<button id="btnRexViewer" onclick="fnOpenRexViewerJavaScript();">레포트 보기</button><br>
	<iframe id="ifrmRexPreview" src="" width="100%" height="450"></iframe>
</body>
</html>
