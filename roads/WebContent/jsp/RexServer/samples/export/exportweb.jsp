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
		oRptMainParam.put("rex_rptname", "samples/schedule/test");
		
		// �ʼ� - ������ Ÿ�� ����
		oRptMainParam.put("rex_datatype", "CSV");  // XML, CSV

		// �ɼ� - �ٸ� DB�� �����
		oRptMainParam.put("rex_userservice", "Sql2");

		// �ɼ� - Save ���� ����
		oRptMainParam.put("rex_save_direct", "true");
		oRptMainParam.put("rex_save_file_type", "pdf");
		oRptMainParam.put("rex_save_file", "c:\\test2.pdf");
		oRptMainParam.put("rex_save_end", "javaSaveEndFunction"); // javaSaveEndFunction�� ������ (���ڴ� sFileType, sFileName);

		oRptMainParam.put("rex_script_alert", "false");

		// preview �˾� ����
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
	<!--button id="btnRexViewer" onclick="fnOpenRexViewerJavaScript();">����Ʈ ����</button><br>
	<textarea id="txtData" rows="5" cols="100"></textarea>
	<br>
	<iframe id="ifrmRexPreview" src="../../RexPreView.jsp" width="100%" height="450"></iframe-->
</body>
</html>
