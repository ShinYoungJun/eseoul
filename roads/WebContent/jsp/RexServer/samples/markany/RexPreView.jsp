<%@ page contentType="text/html; charset=euc-kr" %>
<html>
<head>
	<title>Rexpert Preview</title>
	<meta http-equiv="content-type" content="text/html; charset=euc-kr">
	<script language="javascript" src="http://10.1.59.62/portal/rexpert/js/rexpert.js"></script>
	<script language="javaScript">

	function OnLoad() {
		if ( opener != undefined ) {	// window.open 시
			rex_goRptMainParam = opener.rex_goRptMainParam;
			rex_goRptSubParams = opener.rex_goRptSubParams;
			rex_goUserWindow = opener;
			rex_goUserWindow.rex_gsPrintStatus = rex_gsPrintStatus;
		} else if ( parent.rex_goRptMainParam != undefined) {		// iframe 시
			rex_goRptMainParam = parent.rex_goRptMainParam;
			rex_goRptSubParams = parent.rex_goRptSubParams;
			rex_goUserWindow = parent;
			rex_goUserWindow.rex_gsPrintStatus = rex_gsPrintStatus;
		} else if (window.dialogArguments != undefined) {  // window.showModalDialog 시
			rex_goRptMainParam = window.dialogArguments.rex_goRptMainParam;
			rex_goRptSubParams = window.dialogArguments.rex_goRptSubParams;
			rex_goUserWindow = window;
			rex_goUserWindow.rex_gsPrintStatus = rex_gsPrintStatus;
		}

		fnPreView();
	}
	
	var giMainDataSetRowCount;

	function fnPreView() {
		var oReport;
		var oSubReport;
		var oConnection;
		var oDataSet;
		var oSQL;

		//커넥정보 숨기기
		//RexCtl.EnableDebug = false;

		//뷰어50%축소
		//RexCtl.zoom("50");
		//툴바숨기기
		//RexCtl.ToolBarVisible = false;		

		//버전정보보기 숨기기
		//RexCtl.ShowToolBarButton(14, false);

		//뷰어에서 파란색 테두리 숨김
		//RexCtl.FocusRectVisible = false;

		//RexCtl.EnableHotKey("all=0");
		
		RexCtl.ShowParameterDialog = false;
		RexCtl.ResourceLang = "en";
		if (rex_goRptMainParam == undefined) return;

		if (rex_goRptMainParam != null) {
			if (rex_goRptMainParam.get("rex_init") != null) {
				var sSetting = rex_goRptMainParam.get("rex_init");
				rex_gfShowToolBarButton(RexCtl, sSetting);
			}
		}

		// 초기화 콜백함수 실행
		if (rex_goRptMainParam.Init != null) {
			try {
				rex_goRptMainParam.Init(RexCtl);
			} catch(e) {
				//
			}
		}

		if (rex_goRptMainParam.get("rex_init_end") != null) {
			rex_goRptMainParam.InitEnd(RexCtl, rex_goRptMainParam.get("rex_init_end"));
        }

		if (rex_goRptMainParam.get("rex_print_printerpaperbin") != null) {
			RexCtl.PrinterPaperBin = parseInt(rex_goRptMainParam.get("rex_print_printerpaperbin"));
        }

		if (rex_goRptMainParam == null || rex_goRptMainParam.get("rex_rptname") == "") return;

		try {
			oReport = RexCtl.OpenReport(rex_gsReportURL + rex_goRptMainParam.get("rex_rptname") + ".rex");
		} catch (e) {
			//
		}

		if(oReport == null) {
		    alert("can't open report file");
		    return;
		}

		/*
		oServerConnection = oReport.GetServerConnection();
		
		alert(oServerConnection.GetParameterValue("service"));

		alert(rex_goRptMainParam.get("rex_userservice"));
		*/

		rex_goMainReport = oReport;

		var obj = rex_goRptMainParam.keys();
		for(var key in obj) {
			oReport.SetParameterFieldValue(key, obj[key]);
		}

		oConnection = fnCreateConnection(rex_goRptMainParam.get("rex_datatype"));

		fnGetData(oReport, oConnection, rex_goRptMainParam.get("rex_datatype"),
										rex_goRptMainParam.get("rex_userservice"),
										rex_goRptMainParam.get("rex_data"));

		if (fnGetSubReportData() == "each") {
			var sXpath = "";
			sXpath = rex_goRptMainParam.get("rex_xpath");

			if (sXpath == null) sXpath = "";

			if (rex_goRptMainParam.get("rex_datatype") == "XML" || 
				rex_goRptMainParam.get("rex_datatype") == "" || rex_goRptMainParam.get("rex_datatype") == null) {
				if (sXpath == "")  sXpath = "root/main/rpt1/rexdataset/rexrow";
			}

			oDataSet = fnCreateDataSet(oReport, oConnection, rex_goRptMainParam.get("rex_datatype"), oDataSet, sXpath, 0);

			giMainDataSetRowCount = oDataSet.RowCount;

			rex_goMainDataSet = oDataSet;

			if (rex_goRptMainParam.CallBack != null) {
				try {
					rex_goRptMainParam.CallBack(oReport, oDataSet);
				} catch(e) {
					//
				}
			}
		}
		
		//***********************************************************
		// 마크애니 모듈 로딩(2007-11-27)
		//***********************************************************
		if(rex_goRptMainParam.get("markany") != null &&
		   rex_goRptMainParam.get("markany") == "true")
		{
			if(!fnInstallPlugIn())
			{
				return;
			}
		}

		if (rex_gsRptParamShare == "share") {
			if (fnGetSubReportData() == "each") {
				if (rex_goRptSubParams.length > 0) {
					var sDataType = "";
					var sUserService = "";
					var sData = "";

					for (i = 1; i <= rex_goRptSubParams.length; i++) {
						oRptSubParam = rex_goRptSubParams.get("" + i);

						if (oRptSubParam.get("rex_rptname") != "") {
							oSubReport = oReport.OpenReport(oRptSubParam.get("rex_rptname"));
						} else {
							//oSubReport = oReport.OpenReport(i - 1);
							alert("can't find subreport name");
							return;
						}
	
						if (oSubReport == null) {
							alert("can't open sub report");
							return;
						}

						var obj = rex_goRptMainParam.keys();
						for(var key in obj) {
							oSubReport.SetParameterFieldValue(key, obj[key]);
						}

						if (oRptSubParam.get("rex_datatype") == null) {
							sDataType = rex_goRptMainParam.get("rex_datatype");
						} else {
							sDataType = oRptSubParam.get("rex_datatype");
						}

						if (oRptSubParam.get("rex_userservice") == null) {
							sUserService = rex_goRptMainParam.get("rex_userservice");
						} else {
							sUserService = oRptSubParam.get("rex_userservice");
						}

						if (oRptSubParam.get("rex_data") == null) {
							sData = rex_goRptMainParam.get("rex_data");
						} else {
							sData = oRptSubParam.get("rex_data");
						}

						oConnection = fnCreateConnection(sDataType);

						fnGetData(oSubReport, oConnection,	sDataType, sUserService, sData);

						var sXpath = "";
						sXpath = oRptSubParam.get("rex_xpath");

						if (sXpath == null) sXpath = "";

						if (sDataType == "XML" || sDataType == "" || sDataType == null) {
							if (sXpath == "")  sXpath = "root/main/rpt1/rexdataset/rexrow";
						}
			
						oDataSet = fnCreateDataSet(oSubReport, oConnection, sDataType, oDataSet, sXpath, 0);

						if (oRptSubParam.CallBack != null) {
							try {
								oRptSubParam.CallBack(oSubReport, oDataSet);
							} catch(e) {
								//
							}
						}

					} // end for
				} // end if
			} else {		// once
				for (i = 1; i <= oReport.GetReportCount(); i++) {
					oSubReport = oReport.OpenReport(i - 1);

					if (oSubReport == null) {
						alert("can't open sub report");
						return;
					}

					var obj = rex_goRptMainParam.keys();
					for(var key in obj) {
						oSubReport.SetParameterFieldValue(key, obj[key]);
					}

					fnGetData(oSubReport, oConnection,	rex_goRptMainParam.get("rex_datatype"),
														rex_goRptMainParam.get("rex_userservice"),
														rex_goRptMainParam.get("rex_data"));

				} // end for
			} // end if
		} else { // each
			if (rex_goRptSubParams.length > 0) {
				var sDataType = "";
				var sUserService = "";
				var sData = "";

				for (i = 1; i <= rex_goRptSubParams.length; i++) {
					oRptSubParam = rex_goRptSubParams.get("" + i);

					if (oRptSubParam.get("rex_rptname") != "") {
						oSubReport = oReport.OpenReport(oRptSubParam.get("rex_rptname"));
					} else {
						//oSubReport = oReport.OpenReport(i - 1);
						alert("can't find subreport name");
						return;
					}

					if (oSubReport == null) {
						alert("can't open sub report");
						return;
					}

					var obj = oRptSubParam.keys();
					for(var key in obj) {
						oSubReport.SetParameterFieldValue(key, obj[key]);
						//alert(oSubReport.GetParameterFieldName(0));
					}

					if (oRptSubParam.get("rex_datatype") == null) {
						sDataType = rex_goRptMainParam.get("rex_datatype");
					} else {
						sDataType = oRptSubParam.get("rex_datatype");
					}

					if (oRptSubParam.get("rex_userservice") == null) {
						sUserService = rex_goRptMainParam.get("rex_userservice");
					} else {
						sUserService = oRptSubParam.get("rex_userservice");
					}

					if (oRptSubParam.get("rex_data") == null) {
						sData = rex_goRptMainParam.get("rex_data");
					} else {
						sData = oRptSubParam.get("rex_data");
					}

					oConnection = fnCreateConnection(sDataType);

					fnGetData(oSubReport, oConnection,	sDataType, sUserService, sData);

					if (fnGetSubReportData() == "each") {					
						var sXpath = "";
						sXpath = oRptSubParam.get("rex_xpath");

						if (sXpath == null) sXpath = "";

						if (sDataType == "XML" || sDataType == "" || sDataType == null) {
							if (sXpath == "")  sXpath = "root/main/rpt1/rexdataset/rexrow";
						}

						oDataSet = fnCreateDataSet(oSubReport, oConnection, sDataType, oDataSet, sXpath, 0);

						if (oRptSubParam.CallBack != null) {
							try {
								oRptSubParam.CallBack(oSubReport, oDataSet);
							} catch(e) {
								//
							}
						}
					}

				} // end for
			} // end if
		}  // end if - share

		if (fnGetSubReportData() == "once") {

			if (rex_goRptMainParam.get("rex_datatype") != "XMLSTR" && 
			    rex_goRptMainParam.get("rex_datatype") != "CSVSTR") {
				//try {
					oConnection.Send();

				//} catch(e) {
				//	alert(e.message);
					//alert(oConnection.Response());
				//	return;
				//}
			}

			var sXpath = "";
			sXpath = rex_goRptMainParam.get("rex_xpath");

			if (sXpath == null) sXpath = "";

			if (rex_goRptMainParam.get("rex_datatype") == "XML" || 
				rex_goRptMainParam.get("rex_datatype") == "" || rex_goRptMainParam.get("rex_datatype") == null) {
				if (sXpath == "")  sXpath = "root/main/rpt1/rexdataset/rexrow";
			}

			oDataSet = fnCreateDataSet(oReport, oConnection, rex_goRptMainParam.get("rex_datatype"), oDataSet, sXpath, 0);

			giMainDataSetRowCount = oDataSet.RowCount;

			rex_goMainDataSet = oDataSet;

			if (rex_goRptMainParam.CallBack != null) {
				try {
					rex_goRptMainParam.CallBack(oReport, oDataSet);
				} catch(e) {
					//
				}
			}

			for (i = 1; i <= oReport.GetReportCount(); i++) {
				oSubReport = oReport.OpenReport(i - 1);

				sXpath = "";
				sXpath = rex_goRptMainParam.get("rex_xpath" + i);

				if (sXpath == null) sXpath = "";

				if (sDataType == "XML" || sDataType == "" || sDataType == null) {
					if (sXpath == "")  sXpath = "root/main/rpt" + (i + 1) + "/rexdataset/rexrow";					
				}

				oDataSet = fnCreateDataSet(oSubReport, oConnection, rex_goRptMainParam.get("rex_datatype"), oDataSet, sXpath, i);

			}
		}

		if (rex_goRptMainParam.get("rex_save") != null) {
			if (rex_goRptMainParam.get("rex_save") == "true") {
				RexCtl.RunAsBlocking();
				
				return;
			}
		}


		
		
		//***********************************************************
		// 보고서 생성 및 마크애니데이터 생성(2007-11-27)
		//***********************************************************
		if(rex_goRptMainParam.get("markany") != null &&
		   rex_goRptMainParam.get("markany") == "true")
		{
				RexCtl.RunAsBlocking();
				
				// 마크애니 데이터 생성
				fnGenerate2D();				
		}
		else
		{
			RexCtl.Run();
		}		

				

	} // end fnPreView


	//*****************************************************************
	//
	// * 마크애니 모듈 로딩 함수
	//
	//*****************************************************************
	function fnInstallPlugIn()
	{
	   try
	   {
		  
			//**************************************************************************
			// 사용가능 옵션
			// * dllname           : 마크애니 dll 명(MAePageSAFERRexpert.dll)
			// * datafilename      : 데이터 파일명(MaPrintInfoNhicRex.dat), MaPrintInfoMofe.dat
			// * enablecapture     : 화면캡처보안사용
			// * enablespool       : 스풀보안사용
			// * enableprinter     : 프린터보안사용
			// * enableprinterinfo : 프린터정보보안사용
			// * printeroption     : 프린터보안옵션 설정
			//    - 0:등록프린터, 공유프린터 지원안함
			//    - 1:등록프린터, 공유프린터 지원
			//    - 2:모든프린터, 공유프린터 지원 안함
			//    - 3:모든프린터, 공유프린터 지원
			// * imagesaferoption  : 화면보안옵션 설정
			//    - 0: 리모트툴 제어
			//    - 1:리모트툴 제어안함
			//**************************************************************************
			//RexCtl.InstallPlugIn("markany", "dllname=MAePageSAFERRexpert.dll;datafilename=MaPrintInfoNhicRex.dat;enablecapture=1;enablespool=1;enableprinter=1;enableprinterInfo=1;printeroption=3;imagesaferoption=0");
			RexCtl.InstallPlugIn("markany", "dllname=MAePageSAFERRexpert.dll;datafilename=MaPrintInfoNhicRex.dat;enablecapture=0;enablespool=0;enableprinter=0;enableprinterInfo=0;printeroption=3;imagesaferoption=0");
			
			
			
			

	      
	   }
	   catch(e)
	   {
	     alert(e.message);
	     
	     return false;
	   }
	   
	   return true;
	}
	
	
	//*****************************************************************
	//
	// * 마크애니 데이터 생성
	//
	//*****************************************************************	
	function fnGenerate2D()
	{	
		var sCellWidth  = "18"; // 기본 바코드 넓이
		var sCellHeight = "2";  // 기본 바코드 높이
		
		if(rex_goRptMainParam.get("cellwidth") != null)
			sCellWidth = rex_goRptMainParam.get("cellwidth");
			
		if(rex_goRptMainParam.get("cellheight") != null)
			sCellHeight = rex_goRptMainParam.get("cellheight");
		 
		for(var i = 0; i < RexCtl.GetPageCount(); i++)
		{		    
		   var oConnectionDRM = RexCtl.CreateConnection("http.csv");
		    
		   try
		   {
		   		//
		    	//oConnectionDRM.Path = "http://" + location.host + "/portal/rexpert/MaFpsCommon.jsp";
		    	oConnectionDRM.Path = rex_gsRexServiceRootURL + "rexpert/jsp/MaFpsCommon.jsp";
		    	oConnectionDRM.AddParameter("xml", RexCtl.GetPageRTX(i));
		    	oConnectionDRM.AddParameter("cellwidth", sCellWidth);
		    	oConnectionDRM.AddParameter("cellheight", sCellHeight);
		    	
		    	oConnectionDRM.Send();
		    	
		    	RexCtl.SetPageData(i, "markany", oConnectionDRM.Response(), "MaPrintInfoNhicRex.dat", "");	
		    }
		    catch(e)
		    {
		    	alert(e.message);
		    }
		    
		}
			
	}	

	// CreateConnection
	function fnCreateConnection(sDataType)
	{
		var oConnection;

		if (sDataType == "XMLFILE")
		{
			oConnection = RexCtl.CreateConnection("http.get");
		}
		else if (sDataType == "CSVFILE")
		{
			oConnection = RexCtl.CreateConnection("http.csv");
		}
		else if (sDataType == "XML" || sDataType == ""  || sDataType == null )
		{
			oConnection = RexCtl.CreateConnection("http.post");
		}
		else if (sDataType == "CSV" )
		{
			oConnection = RexCtl.CreateConnection("http.csv");
		}
		else if (sDataType=="XMLSTR" || sDataType=="CSVSTR" )
		{
			oConnection = RexCtl.CreateConnection("connectionstring");
		}

		return oConnection;
	} // end fnCreateConnection

	// GetData
	function fnGetData(oReport, oConnection, sDataType, sUserService, sData)
	{
		var oSQL;

		if (sDataType == "XML" || sDataType == "" || sDataType == "CSV" || sDataType == null)
		{
			oConnection.AddParameter("datatype", sDataType);

			oSQL = oReport.GetSQLControl();
			oConnection.AddParameter("sql", oSQL.GetSQL());

			if (sUserService == null) {
				oConnection.AddParameter("userservice", rex_gsUserService);
			} else {
				oConnection.AddParameter("userservice", sUserService);
			}

			/*
			if (rex_goRptMainParam.get("rex_userservice") == null) {
				oConnection.AddParameter("userservice", rex_gsUserService);
			} else {
				oConnection.AddParameter("userservice", rex_goRptMainParam.get("rex_userservice"));
			}
			*/

			oConnection.Path = rex_gsRptServiceURL;
			//oConnection.Path = "http://" + location.host + "/web/rexpert/RexServer.jsp";

			if (fnGetSubReportData() == "each") {
				oConnection.Send();
			}
		}
		else if (sDataType=="XMLFILE")
		{
			oConnection.Path = sData;
			//oConnection.Path = "http://" + location.host + sData;
		
			//oConnection.Path = "http://" + location.host + "/web/xml/resolution/" + sDataName + ".xml";

			if (fnGetSubReportData() == "each") {
				oConnection.Send();
			}
		}
		else if (sDataType=="CSVFILE")
		{
			oConnection.Path = sData;
			//oConnection.Path = "http://" + location.host + sData;
			//oConnection.Path = "http://" + location.host + "/web/" + sDataName + ".txt";

			if (fnGetSubReportData() == "each") {
				oConnection.Send();
			}
		}
		else if (sDataType=="XMLSTR" || sDataType=="CSVSTR")
		{
			oConnection.AddValue("load", sData);
		}

		//return oConnection;
	} // end fnGetData

	function fnCreateDataSet(oReport, oConnection, sDataType, oDataSet, sXpath, idx)
	{
		if ((sDataType == "XML" || sDataType == "" || sDataType == null))
		{
			oDataSet = oReport.CreateDataSetXML(oConnection, sXpath, 0);
			//oDataSet = oReport.CreateDataSetXML(oConnection, "root/main/rpt1/rexdataset/rexrow", 0);
		}
		else if (sDataType == "XMLFILE" || sDataType == "XMLSTR")
		{
			oDataSet = oReport.CreateDataSetXML(oConnection, sXpath, 0);
			//oDataSet = oReport.CreateDataSetXML(oConnection, "", 0);

			//oDataSet = oReport.CreateDataSetXML(oConnection, "rexdataset/rexrow", 0);
		}
		else if (sDataType == "CSV" || sDataType == "CSVFILE" || sDataType == "CSVSTR")
		{
			oDataSet = oReport.CreateDataSetCSV(oConnection, idx,
												rex_gsCsvSeparatorDataset,
												rex_gsCsvSeparatorRow,
												rex_gsCsvSeparatorColumn, "");

			//oDataSet = oReport.CreateDataSetCSV(oConnection, 0, "@", "", "^", "");
		}

		return oDataSet;
	}

	function fnGetSubReportData()
	{
		if (rex_goRptMainParam.get("rex_getsubreportdata") == null) {
			return rex_gsGetSubReportData;
		} else {
			return rex_goRptMainParam.get("rex_getsubreportdata");
		}
	}

	function fnGetErrorMsg(oConnection)
	{
		var oXMLDOM = oConnection.GetXMLDOM();

		if(oXMLDOM == null) {
			alert(oConnection.Response());
			return;
		}

		try {
			oXMLDOM.setProperty("SelectionLanguage", "XPath");
			var oNodes = oXMLDOM.selectSingleNode("gubun/error/msg");

			if(oNodes == null) {
				if (oXMLDOM.parseError.errorCode != 0) {
					var oError = oXMLDOM.parseError;
					alert(oError.reason);
					return "error";
				} else {
					return "";
				}
			} else {
				alert(oNodes.text);
				return "error";
			}
		} catch(e) {
			alert(e.message);
			return "error";
		}
	} // end fnGetErrorMsg

</script>

<script LANGUAGE="JavaScript" FOR="RexCtl" EVENT="EndLoadReport">
	//SaveAs([타입명], [저장 경로], [시작페이지], [끝페이지], [옵션리스트])
	//RexCtl.SaveAs("xls", "c:\\test1.xls", 1, -1, "");
	//RexCtl.SaveAs("rtf", "c:\\test.doc", 1, -1, "");

	//RexCtl.SaveAsFilter = "doc";
	
	//RexCtl.PrintEx2(true, 1, 1, 1, "printername=\\\\124.137.28.171\\HP LaserJet 4200 PCL 6");
	//RexCtl.PrintEx2(false, 1, 1, 1, "printername=FinePrint");
	//RexCtl.PrintEx2(false, 1, 1, 1, "hp LaserJet 1015");
	//RexCtl.PrintEx2(false, 1, 1, 1, "printername=hp LaserJet 1015");

	if (rex_goRptMainParam.get("rex_save") != null) {
		if (rex_goRptMainParam.get("rex_save") == "true") {
			var sFileType = "";
			var sFileName = "";
			var sFileOption = "";

			sFileName = rex_goRptMainParam.get("rex_save_file");
			
			if (rex_goRptMainParam.get("rex_save_file_option") == null) {
				sFileOption = "";
			} else {
				sFileOption = rex_goRptMainParam.get("rex_save_file_option");
			}

			if (rex_goRptMainParam.get("rex_save_file_type") == null) {
			
				var aFileExt = sFileName.split(".");
				
				sFileType = aFileExt[aFileExt.length - 1];

			} else {
				sFileType = rex_goRptMainParam.get("rex_save_file_type");
			}

			RexCtl.SaveAs(sFileType, sFileName, 1, -1, sFileOption);

			if (rex_goRptMainParam.SaveEnd != null) {
				try {
					if (rex_goRptMainParam.get("rex_save_end") != null) {
						rex_goRptMainParam.SaveEnd(sFileType, sFileName, rex_goRptMainParam.get("rex_save_end"));
                    }
				} catch(e) {
					//
				}
			}
		}
	}

	if (rex_goRptMainParam.get("rex_print") != null) {
		if (rex_goRptMainParam.get("rex_print") == "true" && rex_gsPrintStatus == "false") {

			var bPrintDirect = rex_goRptMainParam.get("rex_printdirect");
			
			if (bPrintDirect == "true") {
				bPrintDirect = true;
			} else {
				bPrintDirect = false;
			}
			
			var sStartPage = rex_goRptMainParam.get("rex_print_startpage");
			if (sStartPage == null) sStartPage = "1";

			var sEndPage = rex_goRptMainParam.get("rex_print_endpage");
			if (sEndPage == null) sEndPage = "-1";

			var sCount = rex_goRptMainParam.get("rex_print_count");
			if (sCount == null) sCount = "1";

			var sPrintSkipZero = rex_goRptMainParam.get("rex_print_skipzero");
			if (sPrintSkipZero == null) sPrintSkipZero = "false";

			//if (sPrintSkipZero == "true" && rex_goMainDataSet.RowCount <= 0) {
			if (sPrintSkipZero == "true" && giMainDataSetRowCount <= 0) {
				// skip
			} else {
				if (rex_goRptMainParam.get("rex_print_printername") != null) {
					RexCtl.PrintEx2(!bPrintDirect, parseInt(sStartPage), parseInt(sEndPage), parseInt(sCount),
									"printername=" + rex_goRptMainParam.get("rex_print_printername"));
				} else {
					RexCtl.Print(!bPrintDirect, parseInt(sStartPage), parseInt(sEndPage), parseInt(sCount));
				}
			}

		}
	}
</script>

<script LANGUAGE="JavaScript" FOR="RexCtl" EVENT="FinishPrint">
	if (rex_goRptMainParam.PrintEnd != null) {
		try {
			if (rex_goRptMainParam.get("rex_print_end") != null) {
				rex_goRptMainParam.PrintEnd(rex_goMainReport, rex_goMainDataSet, giMainDataSetRowCount, rex_goRptMainParam.get("rex_print_end"));
            }
		} catch(e) {
			//
		}
	}

	if (rex_goRptMainParam.get("rex_print") != null) {
		if (rex_goRptMainParam.get("rex_print") == "true") {
			rex_gsPrintStatus = "true";
			rex_goUserWindow.rex_gsPrintStatus = rex_gsPrintStatus;
		}
	}

	//alert("출력이 완료 되었습니다.");

</script>

<script LANGUAGE="JavaScript" FOR="RexCtl" EVENT="HyperLinkClicked(bstrLink, bstrToolTip, vtCanceled)">
	//vtCanceled = true;
	//window.open("http://www.naver.com", "", "center=yes,scrollbars=no,status=no,toolbar=no,resizable=0,location=no,menu=no,width=800,height=600");
</script>

</head>
<body topmargin="0" leftmargin="0" onload="OnLoad(); //fnPreView();">
	<script src="http://10.1.59.62/portal/rexpert/js/rexplugin.js"></script>
	<script src="http://10.1.59.62/portal/rexpert/js/MaEmbedControl.js"></script>
</body>
</html> 