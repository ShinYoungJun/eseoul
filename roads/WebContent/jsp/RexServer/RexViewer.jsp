<%@ 

		page contentType="text/html;charset=euc-kr"

%><% String str = request.getParameter("pRptParams");  %><jsp:useBean id="oRex" class="RexUtil.CRexData" /><HTML>
<HEAD>
	<META http-equiv="Content-Type" content="text/html; charset=euc-kr">
	<SCRIPT language="javaScript">
	function fnPreView()
	{
		
		var strRptParam;
		var arrRptParam;
		var oReport;
		var oSubReport;
		var oConnection;
		var oDataSet;
		var oSQL;
		var arrgubnRptParam;


		var pDataType = "<%=request.getParameter("pDataType")==null?"":request.getParameter("pDataType")%>";
		var pRptName = "<%=request.getParameter("pRptName")==null?"":request.getParameter("pRptName")%>";
		
		var pRptParams = "<%=new String(str.getBytes("8859_1"), "KSC5601")%>";
		var pRptProc = "<%=request.getParameter("pRptProc")==null?"":request.getParameter("pRptProc")%>";
		
		var pLinkPage = "<%=request.getParameter("pLinkPage")==null?"":request.getParameter("pLinkPage")%>";

		strRptParam = pRptParams.split("^");

		arrRptParam = strRptParam[0].split(":");
		arrgubnRptParam = arrRptParam[0].split("|");


    oReport = RexCtl.OpenReport("http://" + location.host + "/RexServer/rexfiles/" + pRptName +".rex");
    
    

    if(oReport == null)
    {
        alert("can't open report file");
        return;
    }

    if (arrRptParam.length >= 1)
    {
		for(j = 0; j < arrRptParam.length; j++)
  		{
			arrgubnRptParam = arrRptParam[j].split("|");
            oReport.SetParameterFieldValue(arrgubnRptParam[0], arrgubnRptParam[1]);
         }
    }

    oSQL = oReport.GetSQLControl();

	if (pDataType=="XML" || pDataType=="")
	{
		oConnection = RexCtl.CreateConnection("http.post");
	}
	else if (pDataType=="CSV")
	{
		alert("aaa");
		oConnection = RexCtl.CreateConnection("http.csv");
	}
	
	
	oConnection.AddParameter("pLinkPage", pLinkPage);
	
    oConnection.AddParameter("pSql", oSQL.GetSQL());

    for (k = 1; k <= oReport.GetReportCount(); k++)
    {

			var arrSubRptParam;

        oSubReport = oReport.OpenReport(k - 1);

    		if (oSubReport == null)
    		{
    		   alert("can't open report file");
    		   return;
    		}

		 if (arrRptParam.length >= 1)
		 {
			for(j = 0; j < arrRptParam.length; j++)
  			{
				arrgubnRptParam = arrRptParam[j].split("|");
				oSubReport.SetParameterFieldValue(arrgubnRptParam[0], arrgubnRptParam[1]);
			}
		 }


        oSQL = oSubReport.GetSQLControl(); 

        oConnection.AddParameter("pSql", oSQL.GetSQL());
		}

		oConnection.AddParameter("pDataType", pDataType);
		oConnection.Path = "http://" + location.host + "/RexServer/RexServer.jsp";
		oConnection.Send();


		/*
		var objXML = new ActiveXObject("MSXML2.DOMDocument.4.0");

		try
		{

			objXML.async = false;
			//objXML.load("http://" + location.host + "/Rexpert/RexServer.jsp");
			//objXML.load(oConnection.Response());

			objXML.setProperty("SelectionLanguage", "XPath");

			var ErrMsgNodes = objXML.selectSingleNode("gubun/error/msg");

			if(ErrMsgNodes != null)
			{

				alert(" : [" + ErrMsgNodes.text + "]");
				return;

			}

		}
		catch(e)
		{

			alert(e.message);
			return;

		}

	*/

    oDataSet = oReport.CreateDataSetXML(oConnection, "gubun/rpt1/rexdataset/rexrow", 0);

    for (i = 1; i <= oReport.GetReportCount(); i++)
    {

        oSubReport = oReport.OpenReport(i - 1);
        oDataSet = oSubReport.CreateDataSetXML(oConnection, "gubun/rpt" + (i + 1) + "/rexdataset/rexrow", 0);
    }

	 var oXMLDOM = oConnection.GetXMLDOM();

 

 if(oXMLDOM != null)

 {

    //alert(oXMLDOM.xml);

 }



    RexCtl.Run();

	}
		
	function fnGetErrorMsg(oConnection)
	{

		var oXMLDOM = oConnection.GetXMLDOM(); 

		if(oXMLDOM == null)
		{
			//alert(oConnection.Response());
			return;
		}
		
		
		try
		{
			oXMLDOM.setProperty("SelectionLanguage", "XPath");
			
			var oNodes = oXMLDOM.selectSingleNode("gubun/error/msg");
			
			if(oNodes == null)
			{
				
				if (oXMLDOM.parseError.errorCode != 0)
				{
					var oError = oXMLDOM.parseError;
					alert(oError.reason);
					return "error";
				}
				else
				{
					return "";
				}

			}
			else
			{
				
				alert(oNodes.text);
				return "error";
			}
			
		}
		catch(e)
		{
			alert(e.message);
			return "error";
		}
				
	}

 	
</SCRIPT>

</HEAD>
<BODY topmargin="0" leftmargin="0" onload="fnPreView();">

<script src="./rexscript/rexplugin.js"></script>

</BODY>
</HTML> 