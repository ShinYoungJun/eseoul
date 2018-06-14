<%@page import="java.util.*,  java.lang.*"%><%
	String sParam = "?";

	//String sRptRootUrl = "http://localhost";
	String sRptRootUrl = "http://188.5.55.40:8080";

	String sExportFileRootPath = "d:\\GoodFax\\FaxWeb\\RexServer\\export\\";

	//String sExportFileName = "test.pdf";


	Enumeration params = request.getParameterNames(); 

	int i = 0;
	
	while (params.hasMoreElements()) { 
		String sName = (String)params.nextElement(); 
		String sValue = request.getParameter(name);
		
		i++;
		
		if (i > 1) sParam += "&";

		if (sName.equals("rex_save_file")) {
			sValue = sExportFileRootPath + sValue;
		}

		sParam += sName + "=" + sValue;
	}


	Runtime rt = Runtime.getRuntime();
	Process proc = rt.exec("\"C:\\Program Files\\Internet Explorer\\iexplore.exe\" " + sRptRootUrl + "/RexServer/exportweb.jsp" + sParam);
	proc.waitFor();
	
	// fax insert
	
	// db update

	response.setContentType("text/html;charset=EUC-KR");
	out.println("success");
%>