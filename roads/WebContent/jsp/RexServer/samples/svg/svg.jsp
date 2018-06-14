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

		// �ʼ� - ����Ʈ��
		oRptMainParam.put("rex_rptname", "samples/svg/svg");
		
		// �ʼ� - ������ Ÿ�� ����
		oRptMainParam.put("rex_datatype", "CSV");  // XML, CSV

		// �ɼ� - �ٸ� DB�� �����
		oRptMainParam.put("rex_userservice", "Ora1");

		oRptMainParam.put("rex_image_fields", "main=T:SVG,T2:SVG");
		//oRptMainParam.put("rex_image_fields", "main=test2:SVG");
		//oRptMainParam.put("rex_image_fields", "main=test1,test2:SVG:BASE64;���긮��Ʈ1=test2:SVG:HEXA");

		// preview �˾� ����
		rex_gfRexRptOpen("iframe", ifrmRexPreview, oRptMainParam);

		
		//return oRptMainParam;
	}

</script>


</head>
<body>
	<button id="btnRexViewer" onclick="fnOpenRexViewerJavaScript();">����Ʈ ����</button><br>
	<textarea id="txtData" rows="5" cols="100"></textarea>
	<br>
	<iframe id="ifrmRexPreview" src="" width="100%" height="450"></iframe>
</body>
</html>

