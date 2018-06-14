<%@page import="java.util.*,java.text.*" %><%
	
	// rexpert.properties.dir
	//System.out.println("test");
	// application.getRealPath("");
	//System.setProperty("rexpert.properties.dir", "/inspsappl/web/rexpert/WEB-INF/classes");
	System.setProperty("rexpert.properties.dir", "D:/workspace/roads/WebContent/WEB-INF/classes");

	
	//request.setCharacterEncoding("EUC-KR");
 	//String srequestEncoding = config.getInitParameter("requestEncoding");
 	
 	//Date  firstDt = new Date();
 	//SimpleDateFormat sdf = new  SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
 	//System.out.println("firstDt : " + sdf.format(firstDt));
 	

	String designtype = (request.getParameter("designtype") == null ? "" : request.getParameter("designtype"));

	String sDataType = "";
	sDataType = (request.getParameter("datatype") == null ? "" : request.getParameter("datatype"));
	
	//System.out.println(request.getParameter("SAPUSERID"));
	//System.out.println(request.getParameter("other"));

	if (designtype.equals("service"))
	{
		response.setContentType("text/xml;charset=EUC-KR");
		RexService.CRexDesign oRexDesign = new RexService.CRexDesign(request, response);
		oRexDesign.getServiceList();
		//out.print(oRexDesign.getServiceList());
	} else if (designtype.equals("schema"))
	{
		response.setContentType("text/xml;charset=EUC-KR");
		RexService.CRexDesign oRexDesign = new RexService.CRexDesign(request, response);
		oRexDesign.getSchemaList();
		//out.print(oRexDesign.getTableList());
	} else if (designtype.equals("table"))
	{
		response.setContentType("text/xml;charset=EUC-KR");
		RexService.CRexDesign oRexDesign = new RexService.CRexDesign(request, response);
		oRexDesign.getTableList();
		//out.print(oRexDesign.getTableList());
	} else if (designtype.equals("field"))
	{
		response.setContentType("text/xml;charset=EUC-KR");
		RexService.CRexDesign oRexDesign = new RexService.CRexDesign(request, response);
		oRexDesign.getFieldList();
		//out.print(oRexDesign.getFieldList());
	} else if (designtype.equals("execfield"))
	{
		response.setContentType("text/xml;charset=EUC-KR");

		RexService.CRexDesign oRexDesign = new RexService.CRexDesign(request, response);

		oRexDesign.getExecFieldList();
		//out.print(oRexDesign.getExecFieldList());
	} else if (designtype.equals("data"))
	{
		/*
		if (sDataType.equals("CSV")) {
			response.setContentType("text/html;charset=EUC-KR");
		} else {    // XML
			response.setContentType("text/xml;charset=EUC-KR");
			//response.setContentType("text/xml;charset=UTF-8");
		}
		*/

		RexService.CRexDesign oRexDesign = new RexService.CRexDesign(request, response);
		//request.setCharacterEncoding("UTF-16");
		if (oRexDesign.m_sDataType.equals("CSV")) {
			//response.setContentType("text/html;charset=EUC-KR");
			response.setContentType(oRexDesign.m_sNlsContentTypeCsv);
		} else {    // XML
			//response.setContentType("text/xml;charset=EUC-KR");
			response.setContentType(oRexDesign.m_sNlsContentTypeXml);
		}

		oRexDesign.getData();
		//out.print(oRexDesign.getData());
	} else if (designtype.equals("version"))
	{
		response.setContentType("text/xml;charset=EUC-KR");
		RexService.CRexService oRexService = new RexService.CRexService(request, response);
		oRexService.getVersion();
	} else // run
	{
		/*
		if (sDataType.equals("CSV")) {
			response.setContentType("text/html;charset=EUC-KR");
		} else {    // XML
			response.setContentType("text/xml;charset=EUC-KR");
			//response.setContentType("text/xml;charset=UTF-8");
		}
		*/

		RexService.CRexService oRexService = new RexService.CRexService(request, response);

		if (oRexService.m_sDataType.equals("CSV")) {
			//response.setContentType("text/html;charset=EUC-KR");
			response.setContentType(oRexService.m_sNlsContentTypeCsv);
		} else {    // XML
			//response.setContentType("text/xml;charset=EUC-KR");
			response.setContentType(oRexService.m_sNlsContentTypeXml);
		}

		oRexService.getData();
	}
	
	//Date  lastDt = new Date();
 	//System.out.println("lastDt : " + sdf.format(lastDt)); 	
%>