<%@page import="java.sql.*, java.util.*, java.net.*"%><%

	Connection oConn        = null;
	Statement  oStmt        = null;
	ResultSet  oRs          = null;
	ResultSetMetaData oRsmd = null;

	//'------------------------------------------------------
	//' 파라메터 읽어 들임
	//'------------------------------------------------------
	//aSql = request.getParameterValues("sql");
	String pData = request.getParameter("pData");
	
	response.setContentType("text/html;charset=EUC-KR");

	//'------------------------------------------------------
	//' 데이타베이스 연결...
	//'------------------------------------------------------
//	if (sUserService.equals("")) {
//		Class.forName("oracle.jdbc.driver.OracleDriver");
//		oConn = DriverManager.getConnection("jdbc:oracle:thin:@192.168.2.91:1529:ORADEV","eaw1","eaw1");	
//		oStmt = oConn.createStatement();
//	} else if (sUserService.equals("Ora1")) {
//		Class.forName("oracle.jdbc.driver.OracleDriver");
//		oConn = DriverManager.getConnection("jdbc:oracle:thin:@192.168.2.91:1529:ORADEV","eaw1","eaw1");	
//		oStmt = oConn.createStatement();
//	} else if (sUserService.equals("Sql2")) {
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		oConn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;InstanceName=sqlexpress;DatabaseName=northwind;User=sa;Password=ADMIN2005");	
		oStmt = oConn.createStatement();
//	} // end if
	//'------------------------------------------------------


	String sSql = "insert into longdata(a,b) values('" + pData + "', 'test')";

	oStmt.executeUpdate(sSql);

	out.print(sSql);
	//out.flush();

	//oRs.close();
	oStmt.close();
	oConn.close();

%><%!
	public String fnTest()
	{
		String sDecode = "";

		return sDecode; 	
	}
%>