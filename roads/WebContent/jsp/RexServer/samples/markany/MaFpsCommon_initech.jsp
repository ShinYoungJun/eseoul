<%@ page import="java.util.*,java.io.*, java.text.*,  java.lang.Integer, java.net.*,javax.crypto.*,com.initech.inisafe.cs.keychg.*,com.initech.inisafe.cs.*" %><%@ page import="com.markany.fps.*"%><%

	//'------------------------------------------------------
	//' �Ķ���� �о� ����
	//'------------------------------------------------------
	String sXML = request.getParameter("xml");
	String sCellwidth = request.getParameter("cellwidth"); //18
	String sCellheight = request.getParameter("cellheight"); //2

	String pSessionKey = request.getParameter("pSessionKey");

	//'------------------------------------------------------
	//' initech ���� ���
	//'------------------------------------------------------
	com.initech.provider.crypto.InitechProvider.addAsProvider();   
	INISAFENet inisafe = null;

	if (pSessionKey != null) { // ��ȣȭ ���� �Ǵ�
		////////////////////////////////////////////////////////////////////
		//
		//	* Ŭ���̾�Ʈ���� ������ ������ ��ȣȭ
		//
		///////////////////////////////////////////////////////////////////// 
		try {
			inisafe = new INISAFENet("D:/rexpert/RexServer/samples/initech/INISAFENet.properties");		
			inisafe.loadSessionKey(pSessionKey);

			sXML = fnDecryptData(inisafe, sXML);
			sCellwidth = fnDecryptData(inisafe, sCellwidth);
			sCellheight = fnDecryptData(inisafe, sCellheight);

			//'------------------------------------------------------
			//' ��ȣȭ�� �Ķ���� ��ȣȭ
			//'------------------------------------------------------
			
		} catch (Exception e) {	
			e.printStackTrace();
			out.println(e.toString());
		} finally {
			//
		}
	}

  String  strServerIp     = "127.0.0.1";  // MarkAny ������� ��ġ IP
    int     iServerPort     = 18320;        // MarkAny ������� PORT
	// Config Data ����
	String	strConfigData = new String("8^258^160^1^650^350^���ΰǰ��������^�纻^1^280^80^0^0^0^");
	
	//int		i2DCellCount = Integer.parseInt(request.getParameter("cellwidth"));// 18;
	//int		i2DCellRow = Integer.parseInt(request.getParameter("cellheight")); // 2;
	
	int		i2DCellCount = Integer.parseInt(sCellwidth);// 18;
	int		i2DCellRow = Integer.parseInt(sCellheight); // 2;

	// Unix
	String	strCertFilePath = "";
	String  strPriKeyPath     = "";
	String  strPriKeyPasswd   = "";
	
	String	strSignCompany = "INIT";
	String	strReportCompany = "RP##";
	
	// create instance
	MaFpsMake2DCode clMaFpsMake2DCode = new MaFpsMake2DCode();	
	
	String strXML = sXML;

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
		
	
%><%!

   	////////////////////////////////////////////////////////////////////
	//
	//	* �����͸� ��ȣȭ
	//
	/////////////////////////////////////////////////////////////////////
	public String fnDecryptData(INISAFENet iniSafe, String sData)
	{
		String sDecode = "";
		
		try {
			
			String sDataOrg = URLDecoder.decode(sData);
			byte[] decText = iniSafe.decrypt(sDataOrg);
			sDecode = new String(decText);
		
		} catch (Exception e) {	
			e.printStackTrace();
		} finally {
	
		}
		
		return sDecode; 	
	}

   	////////////////////////////////////////////////////////////////////
	//
	//	* �����͸� ��ȣȭ
	//
	/////////////////////////////////////////////////////////////////////
	public String fnEncryptData(INISAFENet iniSafe, String sData)
	{
		String sEncode = "";
		
	  	try {
			
			sEncode = iniSafe.encrypt(sData);		
		    
		} catch (Exception e) {
		
			e.printStackTrace();
			
		} finally {
	
		}	  
		
		return sEncode;
	}
%>
