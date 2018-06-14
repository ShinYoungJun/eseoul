<%@page import="java.sql.*, java.util.*, com.sap.mw.jco.JCO"%><%
	// rexpert.properties.dir
	//System.out.println("test");
	// application.getRealPath("");
	//System.setProperty("rexpert.properties.dir", "/inspsappl/web/rexpert/WEB-INF/classes");
	//System.setProperty("rexpert.properties.dir", "D:/eclipseSDK321/eclipse/workspace/RexServer/WebContent/WEB-INF/lib");

	String designtype = (request.getParameter("designtype") == null ? "" : request.getParameter("designtype"));

	String sDataType = "";
	sDataType = (request.getParameter("datatype") == null ? "" : request.getParameter("datatype"));

	String sServerParam = request.getParameter("rex_server_param");

	if (sServerParam != null) {
		JCO.Client oSAPConn = null;
		String[] aSapId = null;
		RexService.CRexService oRexService = null;

		try {
			aSapId = request.getParameterValues("SAPID");
			oSAPConn = fnGetSAPConnectionInfo(aSapId[0]);

			oRexService = new RexService.CRexService(request, response);
	
			if (oRexService.m_sDataType.equals("CSV")) {
				//response.setContentType("text/html;charset=EUC-KR");
				response.setContentType(oRexService.m_sNlsContentTypeCsv);
				
				oRexService.getCsvDataSAP(oSAPConn, "TRUE");
				
			} else {    // XML
				//response.setContentType("text/xml;charset=EUC-KR");
				response.setContentType(oRexService.m_sNlsContentTypeXml);
	
				oRexService.getXmlDataSAP(oSAPConn, "TRUE");
				
			} // end if
		} catch (Exception e) {
			out.print(e.getMessage());
		} finally {
			//
		}

	} else 
	{

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
	
			if (oRexDesign.m_sDataType.equals("CSV")) {
				//response.setContentType("text/html;charset=EUC-KR");
				response.setContentType(oRexDesign.m_sNlsContentTypeCsv);
			} else {    // XML
				//response.setContentType("text/xml;charset=EUC-KR");
				response.setContentType(oRexDesign.m_sNlsContentTypeXml);
			}
	
			oRexDesign.getData();
			//out.print(oRexDesign.getData());
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
	} // end if sServerParam != null
%><%!
   	////////////////////////////////////////////////////////////////////
	//
	//	* SAP연결
	//
	/////////////////////////////////////////////////////////////////////
	public JCO.Client fnGetSAPConnectionInfo(String sSAPID)
	{
		Connection oConn = null;
		ResultSet oRs = null;
		JCO.Client oSAPConn = null;

		CRexConnection oRexConn = new CRexConnection();
		CRexData oRexData = new CRexData();

		try {
			oConn = oRexConn.getConnectJNDI("jdbc/SAPUI");
			oRs = oRexData.getDataJDBCSql(oConn,
						  " SELECT SAPID, SAPASSWORD FROM TSAPINFO WHERE USERID = '" + sSAPID + "'");
			oRs.next();
			//oRs.getString("SAPID");
			String sSapPwd = oRs.getString("SAPASSWORD");

			//oSAPConn = oRexConn.getConnectSAP(String sClient, String sUser, String sPassword, String sLanguage, String sHostName, String sSystemNumber);
			oSAPConn = oRexConn.getConnectSAP(String sClient, String sUser, String sPassword, String sLanguage, String sHostName, String sSystemNumber);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (oRexData != null) {
				if (oRexData.oStmt != null) try { oRexData.oStmt.close(); } catch(Exception e) {}
			}

			if (oRs != null) oRs.close();
			if (oConn != null) oConn.close();
		}

		return oSAPConn;
	}
%>