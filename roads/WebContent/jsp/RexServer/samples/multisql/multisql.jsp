<%@ 
	page contentType="text/html;charset=EUC-KR"
%>
<HTML>
	<HEAD>
		<script language="javascript" src="../../rexscript/rexpert.js"></script>
		<script language="javascript" src="../../rexscript/rexpert_properties.js"></script>
		<SCRIPT LANGUAGE='javascript'>
			var goWin;
			function fnOpenRexViewerJavaScript() {
				var oRptMainParam;
				oRptMainParam = rex_GetgoDictionay();

				// 필수 - 레포트명
				oRptMainParam.put("rex_rptname", "samples/multisql/multisql");

				// 필수 - 데이터 타입 설정
				oRptMainParam.put("rex_datatype", "XML");  // XML, CSV

				// 옵션 - 다른 DB를 연결시
				oRptMainParam.put("rex_userservice", "Sql2");

				oRptMainParam.put("custid", custid.value);

				//rex_gfRexRptOpen("popup", oRptMainParam);
				//rex_gfRexRptOpen("popupmodal", oRptMainParam);
				rex_gfRexRptOpen("iframe", ifrmRexPreview, oRptMainParam);
				//rex_gfRexRptOpen("print", oRptMainParam);
				//rex_gfRexRptOpen("save", oRptMainParam);
			}

		</SCRIPT>
	</HEAD>
	<BODY>
	<button id="btnRexViewer" onclick="fnOpenRexViewerJavaScript();">레포트 보기</button><br>
	<input type="text" id="custid"><br>
	<iframe id="ifrmRexPreview" src="" width="100%" height="450"></iframe>
		
	</BODY>
</HTML>
