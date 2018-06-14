<%@ 
		page contentType="text/html;charset=euc-kr"
%>
<%@page import="java.util.*" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=MS949">
<script language="javascript" src="./rexscript/rexpert.js"></script>
<script language="javascript" src="./rexscript/rexpert_properties.js"></script>

<script language="vbscript">
	Sub fnOpenRexViewer()
		Dim oRptMainParam
		Set oRptMainParam = rex_GetgoDictionay()

		' 필수 - 레포트명
		'Call oRptMainParam.put("rex_rptname", "Rexpert1")

		' 필수 - 데이터 타입 설정
		Call oRptMainParam.put("rex_datatype", "XML")  // XML, CSV

		' 옵션 - 다른 DB를 연결시
		Call oRptMainParam.put("rex_userservice", "SAP1")

		' 옵션 - 파라메터 설정
		<%
			Enumeration params = request.getParameterNames(); 

			while (params.hasMoreElements()) { 
				String name = (String)params.nextElement(); 
				String value = request.getParameter(name); 
		%>
		Call oRptMainParam.put("<%=name%>", "<%=value%>")
		<%
			} 
			
			
			String sOpenType = (request.getParameter("rex_opentype") == null ? "" : request.getParameter("rex_opentype"));
			
		%>

		'Call oRptMainParam.put("id", "0")
		'Call oRptMainParam.put("customerid", "A")
		'Call oRptMainParam.put("ggg", "A1" & vbTab & "B1" & vbCrLf & "C1" & "D1")

		<%
			if (sOpenType.equals("")) {
		%>
				Call rex_gfRexRptOpen("iframe", ifrmRexPreview, oRptMainParam)
		<%
			} else {
		%>
				Call rex_gfRexRptOpen("<%=sOpenType%>", oRptMainParam)
		<%
			}
		%>
		
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



