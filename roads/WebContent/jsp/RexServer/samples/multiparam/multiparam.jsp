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
	function fnOpenRexViewerMulti() {
		var oRptMultiParam;
		oRptMultiParam = rex_GetgoDictionay();

		var oRptDummyParam;
		oRptDummyParam = rex_GetgoDictionay();

		oRptDummyParam.put("rex_rptname", "dummy");
		oRptDummyParam.put("param1", "p1");
		oRptDummyParam.put("param2", "p2");

		//oRptMultiParam.put("rex_rptname", oRptDummyParam);
		oRptMultiParam.put("rex_rptname", "dummy");
		//oRptMultiParam.put("rex_rptname", "http://...");

		oRptMultiParam.put("sub1", fnGetParam1());
		oRptMultiParam.put("sub2", fnGetParam2());

		//rex_gfRexRptOpenMulti("popup", "", oRptMultiParam);
		rex_gfRexRptOpenMulti("iframe", "", ifrmRexPreview, oRptMultiParam);
	}

	function fnGetParam1() {
		var oRptMainParam;
		oRptMainParam = rex_GetgoDictionay();

		// �ʼ� - ����Ʈ��
		oRptMainParam.put("rex_rptname", "samples/multiparam/multiparam1");
		// oRptMainParam.put("rex_rptname", "cospec");

		// �ʼ� - ������ Ÿ�� ����
		oRptMainParam.put("rex_datatype", "XML");  // XML, CSV

		// �ɼ� - �ٸ� DB�� �����
		oRptMainParam.put("rex_userservice", "Sql2");
		//oRptMainParam.put("rex_userservice", "Ora1");

		// �ɼ� - rex_gfRexRptOpenMulti �Լ� ȣ��� ����� AddReportSection
		//oRptMainParam.put("rex_addreportsection", "followmainreport=1;usemainreportdata=0;pagereset=0");
		oRptMainParam.put("rex_addreportsection", "followmainreport=1;usemainreportdata=0;pagereset=0");

		// �ɼ� - �Ķ���� ����
		//oRptMainParam.put("custid", txtData.value);
		// oRptMainParam.put("id", "0");

		return oRptMainParam;
	}

	function fnGetParam2() {
		var oRptMainParam;
		oRptMainParam = rex_GetgoDictionay();

		// �ʼ� - ����Ʈ��

		var oAjax = rex_gfAjaxExcute("GET", false, rex_gsReportURL + "samples/multiparam/multiparam2.rex", "", "XML", "");
		//alert(oAjax.Ajax.status);
		//txtData.value = oAjax.Response();

		//oRptMainParam.put("rex_rptname", "samples/multiparam/multiparam2");
		oRptMainParam.put("rex_rptxml", oAjax.Response());

		// oRptMainParam.put("rex_rptname", "cospec");

		// �ʼ� - ������ Ÿ�� ����
		oRptMainParam.put("rex_datatype", "XML");  // XML, CSV

		// �ɼ� - �ٸ� DB�� �����
		oRptMainParam.put("rex_userservice", "Sql2");
		//oRptMainParam.put("rex_userservice", "Ora1");

		// �ɼ� - rex_gfRexRptOpenMulti �Լ� ȣ��� ����� AddReportSection
		oRptMainParam.put("rex_addreportsection", "followmainreport=1;usemainreportdata=0;pagereset=0");

		// �ɼ� - �Ķ���� ����
		//oRptMainParam.put("custid", txtData.value);
		// oRptMainParam.put("id", "0");

		return oRptMainParam;
	}
</script>

</head>
<body>
	<button id="btnRexViewer" onclick="fnOpenRexViewerMulti();">����Ʈ ����</button><br>

	<textarea id="txtData" rows="5" cols="100"></textarea>
	<br>
	<iframe id="ifrmRexPreview" src="../../RexPreView.jsp" width="100%" height="450"></iframe>
</body>
</html>
