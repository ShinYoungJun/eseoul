<%@ page import="java.util.*,java.io.*, java.text.*,  java.lang.Integer, java.net.*" %><%@ page import="com.markany.fps.*"%><%
    
  String  strServerIp     = "127.0.0.1";  // MarkAny 서버모듈 설치 IP
    int     iServerPort     = 18320;        // MarkAny 서버모듈 PORT
	// Config Data 형식
	String	strConfigData = new String("8^258^160^1^650^350^국민건강보험공단^사본^1^280^80^0^0^0^");
	int		i2DCellCount = Integer.parseInt(request.getParameter("cellwidth"));// 18;
	int		i2DCellRow = Integer.parseInt(request.getParameter("cellheight")); // 2;
	
	// Unix
	String	strCertFilePath = "";
	String  strPriKeyPath     = "";
	String  strPriKeyPasswd   = "";
	
	String	strSignCompany = "INIT";
	String	strReportCompany = "RP##";
	
	// create instance
	MaFpsMake2DCode clMaFpsMake2DCode = new MaFpsMake2DCode();	
	
	String strXML = request.getParameter("xml");
	
	

	int iRet = 0;
	String	strRet = new String();

	// Call Ma2DCode library
	try
	{
		strRet = clMaFpsMake2DCode.iGen2DCodeEx(
		                strServerIp,
		                iServerPort,
						strConfigData,
						i2DCellCount,
						i2DCellRow,
						strXML.getBytes(),
						strCertFilePath,
						strPriKeyPath,
						strPriKeyPasswd,
						strSignCompany,	
						strReportCompany );
						
						
		String strRetCode = new String( strRet.substring( 0, 4 ) );
		String str2DData = new String( strRet.substring( 4 ));
		
		if (strRetCode.equals( "0000" ))
		{
			out.print(str2DData);
		}
		else
		{
			out.println( "strRetCode = [" + strRetCode + "]" );
		}						
							
						
	}
	catch( UnsatisfiedLinkError e )
	{
		out.println("error while binding method");
		out.println("\t:"+e.toString());
		
	}
		
	
%>
