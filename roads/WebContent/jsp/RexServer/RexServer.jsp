<%@page import="java.net.*" %>
<%@page import="java.io.*" %>
<jsp:useBean id="oRex" class="RexUtil.CRexData" /><%
 
	response.setHeader("Cache-Control","no-store");
	response.setHeader("Pragma","no-cache");
	response.setDateHeader("Expires", 0);

	String[] pSql = request.getParameterValues("pSql");
	String pDataType = (request.getParameter("pDataType") == null ? "" : request.getParameter("pDataType"));

	String pLinkPage = (request.getParameter("pLinkPage") == null ? "" : request.getParameter("pLinkPage"));
	
	if (pLinkPage.equals("")) {
		if ( pDataType.equals("XML") || pDataType.equals("") ) {
			response.setContentType("text/xml;charset=euc-kr");
		} else if ( pDataType.equals("CSV") ) {
			response.setContentType("text/html;charset=euc-kr");
		}
		
		try {
			out.print( oRex.getData(pSql,pDataType) );
		} catch (Exception e) {
			out.print("Error:" + e);
		}
	} else {

		pLinkPage = pLinkPage + "?pLinkPage=" + "&pDataType=" + pDataType;

		if (pSql != null ) {
			for (int i = 0; i < pSql.length; i++) {
				pLinkPage = pLinkPage + "&pSql=" + pSql[i];
			}
		}

		//response.sendRedirect(pLinkPage);

		URL url = new URL(pLinkPage);
		URLConnection uCon = url.openConnection();

		BufferedReader br = new BufferedReader( new InputStreamReader( uCon.getInputStream() ));
		
		String line;
/*
		if ( pDataType.equals("XML") || pDataType.equals("") ) {
			response.setContentType("text/xml;charset=euc-kr");
		} else if ( pDataType.equals("CSV") ) {
			response.setContentType("text/html;charset=euc-kr");
		}

		while( (line = br.readLine()) != null)
			out.print(line);
*/
out.print("ssssssssss");
	//	br.close();

	}
%>
