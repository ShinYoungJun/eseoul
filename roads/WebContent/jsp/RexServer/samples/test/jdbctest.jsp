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
	Class.forName("com.sybase.jdbc2.jdbc.SybDriver");
	oConn = DriverManager.getConnection("jdbc:sybase:Tds:172.30.1.163:2000/land", "land", "land01");
		
	oStmt = oConn.createStatement();

	sbXml.append("<?xml version='1.0' encoding='EUC-KR'?>");
	sbXml.append("<gubun>");

	String sSql = "select * from CB_FORM";

sSql = "{call p_d_lcdcs0010101('330407',1,'춘천장학(05,국민)','19000101','20071105','1',1,1,1,'1','9999999999999','가','하',1,1,'1')}";

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

			sValue = new String(sValue.getBytes("ISO-8859-1"), "EUC-KR");

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