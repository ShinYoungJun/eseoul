<%@page 
import="java.sql.*" %><%@page 
import="java.util.*" %><%@page 
import="java.lang.String" %><%@page 
import="java.lang.Exception" %><%@page 
import="javax.sql.*" %><%@page 
import="java.io.*" %><%


	response.setContentType("text/xml;charset=EUC-KR");

	DataSource ds			= null;
	
	Connection oConn        = null;
	Statement  oStmt        = null;
	ResultSet  oRs          = null;
	ResultSetMetaData oRsmd = null;

	StringBuffer sbXml = new StringBuffer("");
	
	/* using generally jdbc mssql database connection */
	Class.forName("oracle.jdbc.driver.OracleDriver");
	oConn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "tiger");

	oStmt = oConn.createStatement();

	sbXml.append("<?xml version='1.0' encoding='EUC-KR'?>");
	sbXml.append("<gubun>");

	//String sSql = "select * from EMP";
	String sSql = "select TO_DATE('20071023') - TO_DATE('20071024') a from dual";

	oRs = oStmt.executeQuery(sSql);
	oRsmd = oRs.getMetaData();

	int nColumnCount = oRsmd.getColumnCount();

	String sValue = "";

	sbXml.append("<rpt1>");
	sbXml.append("<rexdataset>");

	while(oRs.next())
	{

		sbXml.append("<rexrow>");

		for(int j = 1; j <= nColumnCount; j++)
		{

			sValue = (oRs.getString(j) == null ? "" : oRs.getString(j));

			//sValue = new String(sValue.getBytes("ISO-8859-1"), "EUC-KR");

			sbXml.append("<" + oRsmd.getColumnName(j) + ">");
			sbXml.append("<![CDATA[" + sValue + "]]>");
			sbXml.append("</" + oRsmd.getColumnName(j) + ">");
		}
		sbXml.append("</rexrow>");
		
	}

	sbXml.append("</rexdataset>");
	sbXml.append("</rpt1>");

	sbXml.append("</gubun>");

	oRs.close();
	oStmt.close();
	oConn.close();

	out.print(sbXml.toString());

%>