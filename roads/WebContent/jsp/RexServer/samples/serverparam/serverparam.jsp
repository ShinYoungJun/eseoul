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

		// �ɼ� - ������ �� xpath ����
		oRptMainParam.put("rex_data", "http://localhost:8080/RexServer/samples/serverparam/RexService_hansolsap.jsp");

		// �ʼ� - ����Ʈ��
		oRptMainParam.put("rex_rptname", "customers");
		// oRptMainParam.put("rex_rptname", "cospec");

		// �ʼ� - ������ Ÿ�� ����
		oRptMainParam.put("rex_datatype", "XML");  // XML, CSV

		// �ɼ� - �ٸ� DB�� �����
		oRptMainParam.put("rex_userservice", "Sql2");

		// �ɼ� - ������ ���޵Ǵ� �Ķ���� - datatype, sql , userservice, split �� ����ϸ� �ȵ�
		var oServerParam;
		oServerParam = rex_GetgoDictionay();
		oServerParam.put("SAPID", "sapuserid");
		//oServerParam.put("other", "other");

		oRptMainParam.put("rex_server_param", oServerParam);

		// preview �˾� ����
		//rex_gfRexRptOpen("popup", oRptMainParam);

		//rex_gfRexRptOpen("popupmodal", oRptMainParam);
		rex_gfRexRptOpen("iframe", ifrmRexPreview, oRptMainParam);
		//rex_gfRexRptOpen("print", oRptMainParam);
		//rex_gfRexRptOpen("save", oRptMainParam);
	}
</script>

</head>
<body>
	<button id="btnRexViewer" onclick="fnOpenRexViewerJavaScript();">����Ʈ ����</button><br>
	<textarea id="txtData" rows="5" cols="100"></textarea>
	<br>
	<iframe id="ifrmRexPreview" src="RexPreView.jsp" width="100%" height="450"></iframe>
</body>
</html>
