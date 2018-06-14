<%@page 
import="java.sql.*" %><%@page 
import="java.util.*" %><%@page 
import="java.lang.String" %><%@page 
import="java.lang.Exception" %><%@page 
import="javax.sql.*" %><%@page 
import="java.io.*" %><%


	//response.setContentType("text/xml;charset=EUC-KR");
	response.setContentType("text/html;charset=EUC-KR");

	DataSource ds				= null;
	Connection oConn			= null;
	Statement  oStmt			= null;
	ResultSet  oRs				= null;
	ResultSetMetaData oRsmd	= null;

	//StringBuffer sbXml = new StringBuffer("");

	Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
	oConn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;;instanceName=sqlexpress;DatabaseName=northwind;User=sa;Password=ADMIN2005");

	oStmt = oConn.createStatement();

	//sbXml.append("<?xml version='1.0' encoding='EUC-KR'?>");

	String sSql = "";
	String sValue = "";

	sSql = "insert into test(nm) values('t1')";
	oStmt.executeUpdate(sSql);

	//sSql = "{call sp_test_insert('t2')}";
	//oRs = oStmt.executeQuery(sSql);

	sSql = "select @@identity as idt";

	oRs = oStmt.executeQuery(sSql);
	
	oRs.next();
	sValue = oRs.getString(1) ;

	oRsmd = oRs.getMetaData();

	int nColumnCount = oRsmd.getColumnCount();

	out.println(sValue);

	/*
	sbXml.append("<rpt1>");
	sbXml.append("<rexdataset>");

	while(oRs.next())
	{
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
	*/

	oRs.close();
	oStmt.close();
	oConn.close();

	//out.print(sbXml.toString());
%>