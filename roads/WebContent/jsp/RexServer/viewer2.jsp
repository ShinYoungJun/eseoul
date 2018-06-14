<%@ 
	page contentType="text/html;charset=UTF-8"
%>
<%@page import="java.util.*" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script language="javascript" src="./rexscript/rexpert.js"></script>
<script language="javascript" src="./rexscript/rexpert_properties.js"></script>

<script language="vbscript">
	Sub fnOpenRexViewer()
		Dim oRptMainParam
		Set oRptMainParam = rex_GetgoDictionay()

		Dim sParam
		Dim aParam

		<%
			//request.setCharacterEncoding("UTF-8");

			String sParam = request.getParameter("rex_param");

			//request.setCharacterEncoding("EUC-KR");
		%>

		sParam = "<%=sParam%>"

		aParam = Split(sParam, "&")

		Call oRptMainParam.put("rex_datatype", "CSV")

		For i = 0 To UBound(aParam)
			Dim aTmp

			aTmp = Split(aParam(i), "=")

			Call oRptMainParam.put(aTmp(0), aTmp(1))
		Next

		Call rex_gfRexRptOpen("iframe", ifrmRexPreview, oRptMainParam)
		
		'Call rex_gfRexRptOpen("save", oRptMainParam)
		'Call rex_gfRexRptOpen("print", oRptMainParam)
		'Call rex_gfRexRptOpen("open", oRptMainParam)
	End Sub
</script>

</head>
<body onload="fnOpenRexViewer();" leftmargin=0 topmargin=0 scroll=no>
	<iframe id="ifrmRexPreview" width="100%" height="100%"></iframe>
</body>
</html>



