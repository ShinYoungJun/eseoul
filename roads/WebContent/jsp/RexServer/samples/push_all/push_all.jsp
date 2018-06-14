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

		// �ʼ� - ����Ʈ��
		oRptMainParam.put("rex_rptname", "test");
		
		oRptMainParam.put("rex_save_file", "c:\\test.pdf");

		// �ʼ� - ������ Ÿ�� ����
		oRptMainParam.put("rex_datatype", "CSV");  // XML, CSV

		// �ɼ� - �ٸ� DB�� �����
		oRptMainParam.put("rex_userservice", "Sql2");
		
		return oRptMainParam;
	}

	function fnOpenRexViewer2() {
		var oRptMainParam;
		oRptMainParam = rex_GetgoDictionay();

		// �ʼ� - ����Ʈ��
		oRptMainParam.put("rex_rptname", "test2");

		oRptMainParam.put("rex_save_file", "c:\\test2.pdf");

		// �ʼ� - ������ Ÿ�� ����
		oRptMainParam.put("rex_datatype", "CSV");  // XML, CSV

		// �ɼ� - �ٸ� DB�� �����
		oRptMainParam.put("rex_userservice", "Sql2");
		
		return oRptMainParam;
	}

</script>


</head>
<body>
	<button id="btnRexViewer" onclick="fnOpenRexViewerJavaScript();">����Ʈ ����</button><br>
	<textarea id="txtData" rows="4" cols="100"></textarea>
	<br>
	<iframe id="ifrmRexPreview1"   width="100%" height="100"></iframe>
	<iframe id="ifrmRexPreview2"   width="100%" height="100"></iframe>
	<iframe id="ifrmRexPreview3"   width="100%" height="100"></iframe>
	<iframe id="ifrmRexPreview4"   width="100%" height="100"></iframe>

	<!--script language="JavaScript" src="./rexscript/rex_xecureweb.js"></script-->
</body>
</html>

