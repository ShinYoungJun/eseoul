<%@ page contentType="text/html;charset=euc-kr"%>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=euc-kr">
	<title>Rexpert Preview</title>
<script language="javascript" src="/jsp/RexServer/rexscript/rexpert.js"></script>
<script language="javascript" src="/jsp/RexServer/rexscript/rexpert_properties.js"></script>
	<script language="javaScript">

	var goWin;

	var gsParamArr = "";

	var goCrypto;
	
	var oReport;
		
	function OnLoad() {
		if ( opener != undefined ) {	// window.open 시
			rex_goUserWindow = opener;
			rex_goRptMainParam = opener.rex_goRptMainParam;
			rex_goRptSubParams = opener.rex_goRptSubParams;
			rex_goRptMultiParam = opener.rex_goRptMultiParam;
			rex_goUserWindow.rex_gsPrintStatus = rex_gsPrintStatus;
		} else if ( parent.rex_goRptMainParam != undefined) {		// iframe 시
			rex_goUserWindow = parent;
			rex_goRptMainParam = parent.rex_goRptMainParam;
			rex_goRptSubParams = parent.rex_goRptSubParams;
			rex_goRptMultiParam = parent.rex_goRptMultiParam;
			rex_goUserWindow.rex_gsPrintStatus = rex_gsPrintStatus;
		} else if (window.dialogArguments != undefined) {  // window.showModalDialog 시
			rex_goUserWindow = window.dialogArguments;
			
			rex_goRptMainParam = window.dialogArguments.rex_goRptMainParam;
			rex_goRptSubParams = window.dialogArguments.rex_goRptSubParams;
			rex_goRptMultiParam = window.dialogArguments.rex_goRptMultiParam;
			rex_goUserWindow.rex_gsPrintStatus = rex_gsPrintStatus;
		}
	
		fnPreView();

		var iAutoRefresh = 0;
		var oInterval;
		
		if (rex_goRptMainParam == undefined) return fnException();

		if (rex_goRptMainParam.get("rex_auto_refresh") != null) {			
			iAutoRefresh = parseInt(rex_goRptMainParam.get("rex_auto_refresh"));

			if (iAutoRefresh > 0) {
				oInterval = window.setInterval("fnPreView()", iAutoRefresh * 1000);
			}
		}

	}
	
	var giMainDataSetRowCount;

	function fnPreView() {
//		var oReport;
		var oSubReport;
		var oConnection;
		var oDataSet;
		var oSQL;
		
		var sVersion = "";
		
		this.focus();
		//alert(this.ksdfd());

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
		//RexCtl.ResourceLang = "en";

		try {
			RexCtl.ResourceLang = rex_gsLanguage;
		} catch(ex) {}

		try {
			sVersion = RexCtl.GetVersion();
		} catch (ex) {
			alert("ActiveX not Installed!!");
			return;
		}

		if (rex_goRptMainParam == undefined) return fnException();

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

		if (rex_goRptMainParam == null || rex_goRptMainParam.get("rex_rptname") == "") return fnException();

		//**************************************************************************
		//  crypto install
		//**************************************************************************
		// crypto check
		goCrypto = rex_CheckCrypto();

		if(goCrypto.Crypto == true && goCrypto.Plugin == "inisafeweb60.krx") {
			RexCtl.InstallPlugIn(goCrypto.Plugin, goCrypto.Param);
		} else {
			//
		}

		//***********************************************************
		// 마크애니 모듈 로딩(2007-11-27)
		//***********************************************************
		if(rex_goRptMainParam.get("rex_markany") != null &&
		   rex_goRptMainParam.get("rex_markany") == "true")
		{
			if(!fnInstallPlugIn())
			{
				return fnException();
			}
		}

		// progress 처리
		if (rex_goRptMainParam.get("rex_progress") != null &&
			rex_goRptMainParam.get("rex_progress") == "true") {
			var sPage = "Progress.jsp";
			var sWinSize = "center=yes,scrollbars=no,status=no,toolbar=no,resizable=0,location=no,menu=no,width=400,height=100,left=200,top=200";

			if (rex_goRptMainParam.get("rex_progress_page") != null &&
				rex_goRptMainParam.get("rex_progress_page") != "") {

				sPage = rex_goRptMainParam.get("rex_progress_page");
			}

			if (rex_goRptMainParam.get("rex_progress_window") != null &&
				rex_goRptMainParam.get("rex_progress_window") != "") {

				sWinSize = rex_goRptMainParam.get("rex_progress_window");
			}

			goWin = window.open(sPage, "progress", sWinSize);
		}

		///////////////// multi //////////////////////////////////////////

		if (rex_goRptMultiParam != null) {
					/*
					try {
						oReport = RexCtl.OpenReport(rex_gsReportURL + "dummy.rex");
					} catch (e) {
						//
					}
					*/

					var sRptName = "";
					var oRptDummyParam;

					if (typeof(rex_goRptMultiParam.get("rex_rptname")) == "object") {
						oRptDummyParam = rex_goRptMultiParam.get("rex_rptname");

						if (oRptDummyParam.get("rex_rptname") == null || oRptDummyParam.get("rex_rptname") == ""
							|| oRptDummyParam.get("rex_rptname") == undefined) {

							if (oRptDummyParam.get("rex_rptxml") != null) {
								oReport = RexCtl.LoadReport( oRptDummyParam.get("rex_rptxml"), "xml", "" );
							} else {
								oReport = RexCtl.OpenReport(rex_gsReportURL + "dummy.rex");
							}
						} else {
							sRptName = oRptDummyParam.get("rex_rptname");
	
							if (sRptName.substring( 0, 7 ) == "http://") { 
								oReport = RexCtl.OpenReport(oRptDummyParam.get("rex_rptname"));
							} else {
								oReport = RexCtl.OpenReport(rex_gsReportURL + oRptDummyParam.get("rex_rptname") + ".rex");
							}
						}
					
					} else {
						if (rex_goRptMultiParam.get("rex_rptname") == null || rex_goRptMultiParam.get("rex_rptname") == ""
							|| rex_goRptMultiParam.get("rex_rptname") == undefined) {

							if (rex_goRptMultiParam.get("rex_rptxml") != null) {
								oReport = RexCtl.LoadReport( rex_goRptMultiParam.get("rex_rptxml"), "xml", "" );
							} else {
								oReport = RexCtl.OpenReport(rex_gsReportURL + "dummy.rex");
							}
						} else {
							sRptName = rex_goRptMultiParam.get("rex_rptname");
	
							if (sRptName.substring( 0, 7 ) == "http://") { 
								oReport = RexCtl.OpenReport(rex_goRptMultiParam.get("rex_rptname"));
							} else {
								oReport = RexCtl.OpenReport(rex_gsReportURL + rex_goRptMultiParam.get("rex_rptname") + ".rex");
							}
						}
					}

					var oRptMultiParam = rex_goRptMultiParam.keys();
					var oRptParam;

					var i = 0;

					for(var key in oRptMultiParam) {
						i++;
						
						if (i > 1) {
							oRptParam = oRptMultiParam[key];
				
							var sLinkType = "followmainreport=1;usemainreportdata=0;pagereset=0";
	
							if (oRptParam.get("rex_addreportsection") != null) {
								sLinkType = oRptParam.get("rex_addreportsection");
							}
							
							if (oRptParam.get("rex_rptxml") != null) {
								//.LoadReport( strRex, "xml", "" );
								oReport.AddReportSection("", key, oRptParam.get("rex_rptxml") , "xml", sLinkType );
							} else {
								oReport.AddReportSection("", key, rex_gsReportURL + oRptParam.get("rex_rptname") + ".rex" , "", sLinkType );
							}
							
							
						}
					} // end for

					if(oReport == null) {
						fnAlert("can't open report file");
					    return fnException();
					}
			
					oReport = RexCtl.rebuild();

					if (typeof(rex_goRptMultiParam.get("rex_rptname")) == "object") {
						var obj = oRptDummyParam.keys();
						for(var key in obj) {
							oReport.SetParameterFieldValue(key, obj[key]);
						}
					}
						
					rex_goMainReport = oReport;
			
					for(var i = 0 ; i < oReport.GetReportCountChild(); i++)
					{
						var oSubReport = oReport.OpenReportChild(i);

						oRptParam = rex_goRptMultiParam.get(oSubReport.GetName());
			
						var obj = oRptParam.keys();
						for(var key in obj) {
							oSubReport.SetParameterFieldValue(key, obj[key]);
						}

						oConnection = fnCreateConnection(oRptParam.get("rex_datatype"));

						fnGetData(oSubReport, oConnection, oRptParam.get("rex_datatype"),
														oRptParam.get("rex_userservice"),
														oRptParam.get("rex_data"), oRptParam);

						for (var j = 1; j <= oSubReport.GetReportCount(); j++) {

							oSubSubReport = oSubReport.OpenReport(j - 1);
			
							if (oSubSubReport == null) {
								fnAlert("can't open sub report");
								return fnException();
							}
			
							var obj = oRptParam.keys();
							for(var key in obj) {
								oSubSubReport.SetParameterFieldValue(key, obj[key]);
							}
			
							fnGetData(oSubSubReport, oConnection,	oRptParam.get("rex_datatype"),
																oRptParam.get("rex_userservice"),
																oRptParam.get("rex_data"), oRptParam);
			
						} // end for
						
						if (oRptParam.get("rex_datatype") != "XMLSTR" && 
						    oRptParam.get("rex_datatype") != "CSVSTR") {
							//try {
								if (goCrypto.Crypto == true && goCrypto.Encode == true && goCrypto.Plugin == "") {
									oConnection.SendEncrypt("");
								} else {
									oConnection.Send();
								}

								if(rex_goRptMainParam.get("rex_send_end") != null)
								{
									rex_goRptMainParam.SendEnd(oSubReport.GetName(), oConnection, rex_goRptMainParam.get("rex_send_end"));
								}

								if (oRptParam.get("rex_datatype") == "XML_AJAX" || oRptParam.get("rex_datatype") == "CSV_AJAX" || 
									oRptParam.get("rex_datatype") == "XMLFILE_AJAX" || oRptParam.get("rex_datatype") == "CSVFILE_AJAX") {
									var oConn = RexCtl.CreateConnection("connectionstring");
			
									oConn.AddValue( "load", oConnection.Response() );
	
									oConnection = oConn;
								}

							//} catch(e) {
							//	alert(e.message);
								//alert(oConnection.Response());
							//	return;
							//}
						}
			
						var sXpath = "";
						sXpath = oRptParam.get("rex_xpath");
						
						if (oRptParam.get("rex_datatype") == "XML" ||
							oRptParam.get("rex_datatype") == "XML_AJAX" ||
							oRptParam.get("rex_datatype") == "" ||
							oRptParam.get("rex_datatype") == null) {
								
							if (sXpath == null || sXpath == undefined) sXpath = "";
							if (sXpath == "")  sXpath = "root/main/rpt1/rexdataset/rexrow";
							
						} else if (oRptParam.get("rex_datatype") == "XMLSTR") {
							if (sXpath == null || sXpath == undefined) sXpath = "";
						}

						oDataSet = fnCreateDataSet(oSubReport, oConnection, oRptParam.get("rex_datatype"), oDataSet, sXpath, 0);
			
						giMainDataSetRowCount = oDataSet.RowCount;
			
						rex_goMainDataSet = oDataSet;
			
						if (oRptParam.CallBack != null) {
							try {
								oRptParam.CallBack(oSubReport, oDataSet);
							} catch(e) {
								//
							}
						}
			
						for (var j = 1; j <= oSubReport.GetReportCount(); j++) {
							oSubSubReport = oSubReport.OpenReport(j - 1);
			
							sXpath = "";
							sXpath = oRptParam.get("rex_xpath" + j);
			
							if (sXpath == null || sXpath == undefined) sXpath = "";
			
							if (oRptParam.get("rex_datatype") == "XML" ||
								oRptParam.get("rex_datatype") == "XMLSTR" ||
								oRptParam.get("rex_datatype") == "XML_AJAX" ||
								oRptParam.get("rex_datatype") == "" ||
								oRptParam.get("rex_datatype") == null) {
								if (sXpath == "")  sXpath = "root/main/rpt" + (j + 1) + "/rexdataset/rexrow";					
							}

							oDataSet = fnCreateDataSet(oSubSubReport, oConnection, oRptParam.get("rex_datatype"), oDataSet, sXpath, j);
			
						}
					}
					 
			
					RexCtl.Run(); 
					return fnException();	
		
		}
		
		///////////////// end multi ///////////////////////////////////		

		try { 
			
			if (rex_goRptMainParam.get("rex_rptxml") != null) {
				oReport = RexCtl.LoadReport(rex_goRptMainParam.get("rex_rptxml"), "xml", "");				
			} else {
				var sRptName = rex_goRptMainParam.get("rex_rptname");

				if (sRptName.substring( 0, 7 ) == "http://") { 
					oReport = RexCtl.OpenReport(rex_goRptMainParam.get("rex_rptname")); 
				} else {
					//alert('rex_gsReportURL = '+rex_gsReportURL);
					oReport = RexCtl.OpenReport(rex_gsReportURL + rex_goRptMainParam.get("rex_rptname") + ".rex");
					
					
				}
			}				
		
		} catch (e) {
			fnAlert(e);
			return fnException();
		}

		if(oReport == null) {
		    fnAlert("can't open report file");
		    return fnException();
		}


		//alert(oReport.GetParameterFieldName(0));

		//var _oSQL = oReport.GetSQLControl();
		//alert(_oSQL.GetConnectionString());

		/*
		oServerConnection = oReport.GetServerConnection();
		
		alert(oServerConnection.GetParameterValue("service"));

		alert(rex_goRptMainParam.get("rex_userservice"));
		*/

		/*
		alert(oReport.GetDataBaseFieldCount());
		for(i = 0; i < oReport.GetDataBaseFieldCount(); i++) {
			alert(oReport.GetDataBaseFieldName(i));
		}
		*/

		rex_goMainReport = oReport;

		var obj = rex_goRptMainParam.keys();
		for(var key in obj) {
			oReport.SetParameterFieldValue(key, obj[key]);
		}

		if (rex_goRptMainParam.OpenReportEnd != null) {
			try {
				if (rex_goRptMainParam.get("rex_openreport_end") != null) {
					rex_goRptMainParam.OpenReportEnd(rex_goMainReport, rex_goRptMainParam.get("rex_openreport_end"));
	            }
			} catch(e) {
				//
			}
		}

		oConnection = fnCreateConnection(rex_goRptMainParam.get("rex_datatype"));

		fnGetData(oReport, oConnection, rex_goRptMainParam.get("rex_datatype"),
										rex_goRptMainParam.get("rex_userservice"),
										rex_goRptMainParam.get("rex_data"), rex_goRptMainParam);

		if (fnGetSubReportData() == "each") {
			var sXpath = "";
			sXpath = rex_goRptMainParam.get("rex_xpath");

			if (sXpath == null || sXpath == undefined) sXpath = "";

			if (rex_goRptMainParam.get("rex_datatype") == "XML" || 
				rex_goRptMainParam.get("rex_datatype") == "XMLSTR" ||
				rex_goRptMainParam.get("rex_datatype") == "XML_AJAX" ||
				rex_goRptMainParam.get("rex_datatype") == "" ||
				rex_goRptMainParam.get("rex_datatype") == null) {
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

		//if (rex_gsRptParamShare == "share") {
		if (fnRptParamShare() == "share") {
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
							fnAlert("can't find subreport name");
							return fnException();
						}
	
						if (oSubReport == null) {
							fnAlert("can't open sub report");
							return fnException();
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

						fnGetData(oSubReport, oConnection,	sDataType, sUserService, sData, rex_goRptMainParam);

						var sXpath = "";
						sXpath = oRptSubParam.get("rex_xpath");

						if (sXpath == null || sXpath == undefined) sXpath = "";

						if (sDataType == "XML" || 
							sDataType == "XMLSTR" ||
							sDataType == "XML_AJAX" ||
							sDataType == "" || sDataType == null) {
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
						fnAlert("can't open sub report");
						return fnException();
					}

					var obj = rex_goRptMainParam.keys();
					for(var key in obj) {
						oSubReport.SetParameterFieldValue(key, obj[key]);
					}

					if (rex_goRptMainParam.get("rex_datatype") != "XMLSTR" && 
						rex_goRptMainParam.get("rex_datatype") != "CSVSTR") {

						fnGetData(oSubReport, oConnection,	rex_goRptMainParam.get("rex_datatype"),
															rex_goRptMainParam.get("rex_userservice"),
															rex_goRptMainParam.get("rex_data"), rex_goRptMainParam);
					}

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
						fnAlert("can't find subreport name");
						return fnException();
					}

					if (oSubReport == null) {
						fnAlert("can't open sub report");
						return fnException();
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

					fnGetData(oSubReport, oConnection,	sDataType, sUserService, sData, rex_goRptMainParam);
					//fnGetData(oSubReport, oConnection,	sDataType, sUserService, sData, oRptSubParam);

					if (fnGetSubReportData() == "each") {					
						var sXpath = "";
						sXpath = oRptSubParam.get("rex_xpath");

						if (sXpath == null || sXpath == undefined) sXpath = "";

						if (sDataType == "XML" || 
							sDataType == "XMLSTR" ||
							sDataType == "XML_AJAX" ||
							sDataType == "" || sDataType == null) {
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
			var sDataType = "";
			sDataType = rex_goRptMainParam.get("rex_datatype");

			if (rex_goRptMainParam.get("rex_datatype") != "XMLSTR" && 
			    rex_goRptMainParam.get("rex_datatype") != "CSVSTR") {
				//try {

					if (goCrypto.Crypto == true && goCrypto.Encode == true && goCrypto.Plugin == "") {
						oConnection.SendEncrypt("");
					} else {
						oConnection.Send();
					}

					if(rex_goRptMainParam.get("rex_send_end") != null)
					{
						rex_goRptMainParam.SendEnd("", oConnection, rex_goRptMainParam.get("rex_send_end"));
					}

					//alert("oConnection.Response():" + fnBlockDec(oConnection.Response()));

					if (sDataType == "XML_AJAX" || sDataType == "CSV_AJAX" || 
						sDataType == "XMLFILE_AJAX" || sDataType == "CSVFILE_AJAX") {
						var oConn = RexCtl.CreateConnection("connectionstring");

						oConn.AddValue( "load", oConnection.Response() );

						oConnection = oConn;
					}

				//} catch(e) {
				//	alert(e.message);
					//alert(oConnection.Response());
				//	return;
				//}
			}

			var sXpath = "";
			sXpath = rex_goRptMainParam.get("rex_xpath");

			if (sXpath == null || sXpath == undefined) sXpath = "";

			if (rex_goRptMainParam.get("rex_datatype") == "XML" || 
				rex_goRptMainParam.get("rex_datatype") == "XMLSTR" ||
				rex_goRptMainParam.get("rex_datatype") == "XML_AJAX" ||
				rex_goRptMainParam.get("rex_datatype") == "" ||
				rex_goRptMainParam.get("rex_datatype") == null) {
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

				if (sXpath == null || sXpath == undefined) sXpath = "";

				if (sDataType == "XML" ||
					sDataType == "XMLSTR" ||
					sDataType == "XML_AJAX" ||
					sDataType == "" || sDataType == null) {
					if (sXpath == "")  sXpath = "root/main/rpt" + (i + 1) + "/rexdataset/rexrow";					
				}

				oDataSet = fnCreateDataSet(oSubReport, oConnection, rex_goRptMainParam.get("rex_datatype"), oDataSet, sXpath, i);
			}
		}

		//***********************************************************
		// 보고서 생성 및 마크애니데이터 생성(2007-11-27)
		//***********************************************************
		if(rex_goRptMainParam.get("rex_markany") != null &&
		   rex_goRptMainParam.get("rex_markany") == "true")
		{
				RexCtl.RunAsBlocking();
				
				// 마크애니 데이터 생성
				fnGenerate2D();				
		}
		else
		{
				if (rex_goRptMainParam.get("rex_save") != null) {
					if (rex_goRptMainParam.get("rex_save") == "true") {
						RexCtl.RunAsBlocking();
						
						return fnException();
					}
				}
		
				RexCtl.Run();
		}	// end if


 		return fnException();
 
	} // end fnPreView

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
			//oConnection = RexCtl.CreateConnection("http.get");
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
		} else if (sDataType=="XML_AJAX" || sDataType=="CSV_AJAX" )
		{
			oConnection = rex_GetgoAjax();
			oConnection.Method = "POST";
			oConnection.isASync = false;

			var sPath = rex_gsRptServiceURL;

			/*
			if (sData != undefined) {
				if (sData != "") {
					sPath = sData;
				} // end if
			} // end if
			*/
			
			oConnection.Path = sPath;

			oConnection.DataType = sDataType.substring( 0, 3 );
			oConnection.Open();

			if (rex_goRptMainParam.get("rex_ajax_requestheader_contenttype") != null) {
				oConnection.SetRequestHeader("Content-Type", rex_goRptMainParam.get("rex_ajax_requestheader_contenttype"));
			} else {
				oConnection.SetRequestHeader("Content-Type", "application/x-www-form-urlencoded;charset=EUC-KR");
				//oConnection.SetRequestHeader("Content-Type", "application/x-www-form-urlencoded;charset=UTF-8");
			}
			
		} else if (sDataType=="XMLFILE_AJAX" || sDataType=="CSVFILE_AJAX" )
		{
			oConnection = rex_GetgoAjax();
			oConnection.Method = "GET";
			oConnection.isASync = false;
			
		}

		return oConnection;
	} // end fnCreateConnection

	// GetData
	function fnGetData(oReport, oConnection, sDataType, sUserService, sData, oRptParam)
	{
		var oSQL;
		var sSplitFields;
		var sImageFields;

		if (sDataType == "XML" || sDataType == "" || sDataType == "CSV" || sDataType == null)
		{
			//oConnection.AddParameter("datatype" + gsParamArr, sDataType);

			if (goCrypto.Crypto == true && goCrypto.Encode == true
				&& goCrypto.Plugin != "inisafeweb60.krx" && goCrypto.Plugin != "") {
				oConnection.AddParameter("datatype" + gsParamArr, gfEncrypt(sDataType));
				
			} else {
				oConnection.AddParameter("datatype" + gsParamArr, sDataType);
			}

			oSQL = oReport.GetSQLControl();
			//oConnection.AddParameter("sql" + gsParamArr, oSQL.GetSQL());

			if (goCrypto.Crypto == true && goCrypto.Encode == true
				&& goCrypto.Plugin != "inisafeweb60.krx" && goCrypto.Plugin != "") {
				oConnection.AddParameter("sql" + gsParamArr, gfEncrypt(oSQL.GetSQL()));
			} else {
				oConnection.AddParameter("sql" + gsParamArr, oSQL.GetSQL());
			}

			if (oRptParam.get("rex_split_fields") != null) {
				sSplitFields = fnGetSplitFields(oReport.GetName(), oRptParam.get("rex_split_fields"));
				//oConnection.AddParameter("split" + gsParamArr, sSplitFields);

				if (goCrypto.Crypto == true && goCrypto.Encode == true
					&& goCrypto.Plugin != "inisafeweb60.krx" && goCrypto.Plugin != "") {
					oConnection.AddParameter("split" + gsParamArr, gfEncrypt(sSplitFields));
				} else {
					oConnection.AddParameter("split" + gsParamArr, sSplitFields);
				}

			} else {
				oConnection.AddParameter("split" + gsParamArr, "");
			}

			// 2008-10-09
			if (oRptParam.get("rex_image_fields") != null) {
				sImageFields = fnGetImageFields(oReport.GetName(), oRptParam.get("rex_image_fields"));
				//oConnection.AddParameter("image" + gsParamArr, sSplitFields);

				if (goCrypto.Crypto == true && goCrypto.Encode == true
					&& goCrypto.Plugin != "inisafeweb60.krx" && goCrypto.Plugin != "") {
					oConnection.AddParameter("image" + gsParamArr, gfEncrypt(sImageFields));
				} else {
					oConnection.AddParameter("image" + gsParamArr, sImageFields);
				}

			} else {
				oConnection.AddParameter("image" + gsParamArr, "");
			}

			/*
			if (rex_goRptMainParam.get("rex_split_fields") != null) {
				sSplitFields = fnGetSplitFields(oReport.GetName(), rex_goRptMainParam.get("rex_split_fields"));
				oConnection.AddParameter("split", sSplitFields);
			} else {
				oConnection.AddParameter("split", "");
			}
			*/

			if (sUserService == null) {
				//oConnection.AddParameter("userservice" + gsParamArr, rex_gsUserService);

				if (goCrypto.Crypto == true && goCrypto.Encode == true
					&& goCrypto.Plugin != "inisafeweb60.krx" && goCrypto.Plugin != "") {
					oConnection.AddParameter("userservice" + gsParamArr, gfEncrypt(rex_gsUserService));
				} else {
					oConnection.AddParameter("userservice" + gsParamArr, rex_gsUserService);
				}

			} else {
				//oConnection.AddParameter("userservice" + gsParamArr, sUserService);

				if (goCrypto.Crypto == true && goCrypto.Encode == true
					&& goCrypto.Plugin != "inisafeweb60.krx" && goCrypto.Plugin != "") {
					oConnection.AddParameter("userservice" + gsParamArr, gfEncrypt(sUserService));
				} else {
					oConnection.AddParameter("userservice" + gsParamArr, sUserService);
				}

			}

			/*
			if (rex_goRptMainParam.get("rex_userservice") == null) {
				oConnection.AddParameter("userservice", rex_gsUserService);
			} else {
				oConnection.AddParameter("userservice", rex_goRptMainParam.get("rex_userservice"));
			}
			*/

			if(oRptParam.get("rex_server_param") != null) {
				var oServerParam = oRptParam.get("rex_server_param");

				//oConnection.AddParameter("rex_server_param" + gsParamArr, "true");

				if (goCrypto.Crypto == true && goCrypto.Encode == true
					&& goCrypto.Plugin != "inisafeweb60.krx" && goCrypto.Plugin != "") {
					oConnection.AddParameter("rex_server_param" + gsParamArr, gfEncrypt("true"));
				} else {
					oConnection.AddParameter("rex_server_param" + gsParamArr, "true");
				}

				var oTmp = oServerParam.keys();
				for(var key in oTmp) {
					//oConnection.AddParameter(key, oTmp[key]);

					if (goCrypto.Crypto == true && goCrypto.Encode == true
						&& goCrypto.Plugin != "inisafeweb60.krx" && goCrypto.Plugin != "") {
						oConnection.AddParameter(key, gfEncrypt(oTmp[key]));
					} else {
						oConnection.AddParameter(key, oTmp[key]);
					}

				} // end for		
			} // end if

			//oConnection.AddParameter("rex_param_sql" + gsParamArr, fnGetParamSql(oReport.GetName(), oRptParam));

			if (goCrypto.Crypto == true && goCrypto.Encode == true
				&& goCrypto.Plugin != "inisafeweb60.krx" && goCrypto.Plugin != "") {
				oConnection.AddParameter("rex_param_sql" + gsParamArr, gfEncrypt(fnGetParamSql(oReport.GetName(), oRptParam)));
			} else {
				oConnection.AddParameter("rex_param_sql" + gsParamArr, fnGetParamSql(oReport.GetName(), oRptParam));
			}

			if (goCrypto.Crypto == true && goCrypto.Encode == true && goCrypto.Plugin != "inisafeweb60.krx") {
				if (goCrypto.Plugin == "") {
					oConnection.AddParameter("pSessionKey" + gsParamArr, "internal");
				} else {
					oConnection.AddParameter("pSessionKey" + gsParamArr, gfGetSID());
				}
			}

			var sPath = rex_gsRptServiceURL;

			if (sData != undefined) {
				if (sData != "") {
					sPath = sData;
				} // end if
			} // end if

			oConnection.Path = sPath;

			//oConnection.Path = "http://" + location.host + "/web/rexpert/RexServer.jsp";
			if (fnGetSubReportData() == "each") {
				if (goCrypto.Crypto == true && goCrypto.Encode == true && goCrypto.Plugin == "") {					
					oConnection.SendEncrypt("");
				} else {
					oConnection.Send();
				}

				if(oRptParam.get("rex_send_end") != null)
				{
					oRptParam.SendEnd(oReport.GetName(), oConnection, oRptParam.get("rex_send_end"));
				}
			}
		}
		else if (sDataType=="XMLFILE")
		{
			oConnection.Path = sData;
			//oConnection.Path = "http://" + location.host + sData;
		
			//oConnection.Path = "http://" + location.host + "/web/xml/resolution/" + sDataName + ".xml";

			if (fnGetSubReportData() == "each") {
				if (goCrypto.Crypto == true && goCrypto.Encode == true && goCrypto.Plugin == "") {
					oConnection.SendEncrypt("");
				} else {
					oConnection.Send();
				}

				if(oRptParam.get("rex_send_end") != null)
				{
					oRptParam.SendEnd(oReport.GetName(), oConnection, oRptParam.get("rex_send_end"));
				}
			}
		}
		else if (sDataType=="CSVFILE")
		{
			oConnection.Path = sData;
			//oConnection.Path = "http://" + location.host + sData;
			//oConnection.Path = "http://" + location.host + "/web/" + sDataName + ".txt";

			if (fnGetSubReportData() == "each") {
				if (goCrypto.Crypto == true && goCrypto.Encode == true && goCrypto.Plugin == "") {
					oConnection.SendEncrypt("");
				} else {
					oConnection.Send();
				}

				if(oRptParam.get("rex_send_end") != null)
				{
					oRptParam.SendEnd(oReport.GetName(), oConnection, oRptParam.get("rex_send_end"));
				}
			}
		}
		else if (sDataType=="XMLSTR" || sDataType=="CSVSTR")
		{
			oConnection.AddValue("load", sData);
		}
		else if (sDataType=="XML_AJAX" || sDataType=="CSV_AJAX")
		{
			oConnection.AddParameter("datatype" + gsParamArr, sDataType.substring( 0, 3 ));

			oSQL = oReport.GetSQLControl();

			oConnection.AddParameter("sql", oSQL.GetSQL());

			if (oRptParam.get("rex_split_fields") != null) {
				sSplitFields = fnGetSplitFields(oReport.GetName(), oRptParam.get("rex_split_fields"));
				oConnection.AddParameter("split" + gsParamArr, sSplitFields);
			} else {
				oConnection.AddParameter("split" + gsParamArr, "");
			}

			// 2008-10-09
			if (oRptParam.get("rex_image_fields") != null) {
				sImageFields = fnGetImageFields(oReport.GetName(), oRptParam.get("rex_image_fields"));
				oConnection.AddParameter("image" + gsParamArr, sImageFields);
			} else {
				oConnection.AddParameter("image" + gsParamArr, "");
			}

			if (sUserService == null) {
				oConnection.AddParameter("userservice" + gsParamArr, rex_gsUserService);
			} else {
				oConnection.AddParameter("userservice" + gsParamArr, sUserService);
			}

			// ------------------------------------------
			//rex_gfAjaxExcute(sDataType, sMethod, sUrl, bASync, sRequestHeader)

			/*
			if (fnGetSubReportData() == "each") {
				rex_gfAjaxExcute(sDType, "POST", sUrl, true, "") ;
				oConnection.AddValue( "load", rex_gsAjax_ReturnData);
			}
			*/

			if (fnGetSubReportData() == "each") {
				if (goCrypto.Crypto == true && goCrypto.Encode == true && goCrypto.Plugin == "") {
					oConnection.SendEncrypt("");
				} else {
					oConnection.Send();
				}

				// 테스트 필요
				var oConn = RexCtl.CreateConnection("connectionstring");

				oConn.AddValue( "load", oConnection.Response() );

				oConnection = oConn;
			}
		}
		else if (sDataType=="XMLFILE_AJAX" || sDataType=="CSVFILE_AJAX")
		{
			oConnection.Path = sData;
			oConnection.DataType = sDataType.substring( 0, 3 );
			oConnection.Open();

			if (oRptParam.get("rex_ajax_requestheader_contenttype") != null) {
				oConnection.SetRequestHeader("Content-Type", oRptParam.get("rex_ajax_requestheader_contenttype"));
			} else {
				oConnection.SetRequestHeader("Content-Type", "application/x-www-form-urlencoded;charset=EUC-KR");
				//oConnection.SetRequestHeader("Content-Type", "application/x-www-form-urlencoded;charset=UTF-8");
			}

			if (fnGetSubReportData() == "each") {
				if (goCrypto.Crypto == true && goCrypto.Encode == true && goCrypto.Plugin == "") {
					oConnection.SendEncrypt("");
				} else {
					oConnection.Send();
				}

				// 오류가능성..테스트 필요
				var oConn = RexCtl.CreateConnection("connectionstring");

				oConn.AddValue( "load", oConnection.Response() );

				oConnection = oConn;
			}
		}

		//return oConnection;
	} // end fnGetData

	function fnCreateDataSet(oReport, oConnection, sDataType, oDataSet, sXpath, idx)
	{
		if ((sDataType == "XML" || sDataType == "" || sDataType == null))
		{
			if (goCrypto.Crypto == true && goCrypto.Decode == true 
				&& goCrypto.Plugin != "inisafeweb60.krx" && goCrypto.Plugin != "" && goCrypto.FlushCount > 0) {
				var sStr = oConnection.Response();
				var aStr = sStr.split(goCrypto.Separator);
				var sValue = "";
				
				var oConn = RexCtl.CreateConnection("connectionstring");
				
				for (var i = 0; i < aStr.length; i++) {
					sValue += gfDecrypt(aStr[i]);
				}

				oConn.AddValue( "load", sValue);

				oDataSet = oReport.CreateDataSetXML(oConn, sXpath, 0);
			} else {
				oDataSet = oReport.CreateDataSetXML(oConnection, sXpath, 0);
				//oDataSet = oReport.CreateDataSetXML(oConnection, "root/main/rpt1/rexdataset/rexrow", 0);
	
				if (goCrypto.Crypto == true && goCrypto.Decode == true 
					&& goCrypto.Plugin != "inisafeweb60.krx" && goCrypto.Plugin != "") {
					for(var i = 0 ; i < oDataSet.RowCount; i++) {
						for(var j = 0 ; j < oDataSet.ColCount; j++) {
							oDataSet.SetValue(i,j, gfDecrypt(oDataSet.GetValue(i,j)));
						}
					}
				}
			} // end if
		}
		else if (sDataType == "XMLFILE" || sDataType == "XMLSTR" || 
				sDataType == "XML_AJAX" || sDataType == "XMLFILE_AJAX")
		{

			if (goCrypto.Crypto == true && goCrypto.Decode == true 
				&& goCrypto.Plugin != "inisafeweb60.krx" && goCrypto.Plugin != "" && goCrypto.FlushCount > 0) {
				var sStr = oConnection.Response();
				var aStr = sStr.split(goCrypto.Separator);
				var sValue = "";
				
				var oConn = RexCtl.CreateConnection("connectionstring");
				
				for (var i = 0; i < aStr.length; i++) {
					sValue += gfDecrypt(aStr[i]);
				}

				oConn.AddValue( "load", sValue);

				oDataSet = oReport.CreateDataSetXML(oConn, sXpath, 0);
			} else {
				oDataSet = oReport.CreateDataSetXML(oConnection, sXpath, 0);
	
				if (goCrypto.Crypto == true && goCrypto.Decode == true 
					&& goCrypto.Plugin != "inisafeweb60.krx" && goCrypto.Plugin != "") {
					for(var i = 0 ; i < oDataSet.RowCount; i++) {
						for(var j = 0 ; j < oDataSet.ColCount; j++) {
							oDataSet.SetValue(i,j, gfDecrypt(oDataSet.GetValue(i,j)));
						}
					}
				}
			} // end if

			//oDataSet = oReport.CreateDataSetXML(oConnection, "", 0);

			//oDataSet = oReport.CreateDataSetXML(oConnection, "rexdataset/rexrow", 0);
		}
		else if (sDataType == "CSV" || sDataType == "CSVFILE" || sDataType == "CSVSTR" || 
				sDataType == "CSV_AJAX" || sDataType == "CSVFILE_AJAX")
		{
			if (goCrypto.Crypto == true && goCrypto.Decode == true 
				&& goCrypto.Plugin != "inisafeweb60.krx" && goCrypto.Plugin != "" && goCrypto.FlushCount > 0) {
				var sStr = oConnection.Response();
				var aStr = sStr.split(goCrypto.Separator);
				var sValue = "";
				
				var oConn = RexCtl.CreateConnection("connectionstring");
				
				for (var i = 0; i < aStr.length; i++) {
					sValue += gfDecrypt(aStr[i]);
				}

				oConn.AddValue( "load", sValue);

				oDataSet = oReport.CreateDataSetCSV(oConn, idx,
												rex_gsCsvSeparatorDataset,
												rex_gsCsvSeparatorRow,
												rex_gsCsvSeparatorColumn, rex_csv_encoding);
				
			} else {
			
				oDataSet = oReport.CreateDataSetCSV(oConnection, idx,
												rex_gsCsvSeparatorDataset,
												rex_gsCsvSeparatorRow,
												rex_gsCsvSeparatorColumn, rex_csv_encoding);
	//var myDate = new Date( );
	//alert(oDataSet.RowCount + ":" + myDate);
	
				if (goCrypto.Crypto == true && goCrypto.Decode == true 
					&& goCrypto.Plugin != "inisafeweb60.krx" && goCrypto.Plugin != "") {
					for(var i = 0 ; i < oDataSet.RowCount; i++) {
						for(var j = 0 ; j < oDataSet.ColCount; j++) {
	//						idCnt.value = i + ":" +  j;
							oDataSet.SetValue(i,j, gfDecrypt(oDataSet.GetValue(i,j)));
						}
					}
				}
				
	//var myDate2 = new Date( );
	//alert(oDataSet.RowCount + "건  : " + (myDate2 - myDate) / 1000 + "초");
	
				//oDataSet = oReport.CreateDataSetCSV(oConnection, 0, "@", "", "^", "");
			} // end if
		}

		return oDataSet;
	}

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
			//RexCtl.InstallPlugIn("markany", "dllname=MAePageSAFERRexpert.dll;datafilename=MaPrintInfoNhicRex.dat;enablecapture=0;enablespool=0;enableprinter=0;enableprinterInfo=0;printeroption=3;imagesaferoption=0");

			var sMarkanyParam;
			if(rex_goRptMainParam.get("rex_markany_param") != null)
				sMarkanyParam = rex_goRptMainParam.get("rex_markany_param");

			RexCtl.InstallPlugIn("markany", sMarkanyParam);

	   }
	   catch(e)
	   {
	     fnAlert(e.message);
	     
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
		
		if(rex_goRptMainParam.get("rex_markany_cellwidth") != null)
			sCellWidth = rex_goRptMainParam.get("rex_markany_cellwidth");
			
		if(rex_goRptMainParam.get("rex_markany_cellheight") != null)
			sCellHeight = rex_goRptMainParam.get("rex_markany_cellheight");
		 
		for(var i = 0; i < RexCtl.GetPageCount(); i++)
		{		    
		   var oConnectionDRM = RexCtl.CreateConnection("http.csv");
		    
		   try
		   {
		   		//
		    	//oConnectionDRM.Path = "http://" + location.host + "/portal/rexpert/MaFpsCommon.jsp";
		    	//oConnectionDRM.Path = rex_gsRexServiceRootURL + "rexpert/jsp/MaFpsCommon.jsp";
		    	oConnectionDRM.Path = rex_goRptMainParam.get("rex_markany_path");
		    	oConnectionDRM.AddParameter("xml", RexCtl.GetPageRTX(i));
		    	oConnectionDRM.AddParameter("cellwidth", sCellWidth);
		    	oConnectionDRM.AddParameter("cellheight", sCellHeight);
		    	
		    	oConnectionDRM.Send();

		    	//RexCtl.SetPageData(i, "markany", oConnectionDRM.Response(), "MaPrintInfoNhicRex.dat", "");
		    	RexCtl.SetPageData(i, "markany", oConnectionDRM.Response(), rex_goRptMainParam.get("rex_markany_setpagedata"), "");
		    }
		    catch(e)
		    {
		    	fnAlert(e.message);
		    }
		    
		}
			
	}	
	
	function fnGetSubReportData()
	{
		if (rex_goRptMainParam.get("rex_getsubreportdata") == null) {
			return rex_gsGetSubReportData;
		} else {
			return rex_goRptMainParam.get("rex_getsubreportdata");
		}
	}

	function fnGetSplitFields(sReportName, sSplitFields)
	{
		var aReport;
		var aTmp;
		
		if (sReportName == "") {
			sReportName = "main";
		}

		aReport = sSplitFields.split(";");
		
		for (var i = 0; i < aReport.length; i++) {
			aTmp = aReport[i].split("=");
			
			if (aTmp[0].trim() == sReportName) {
				return aTmp[1].trim();
			}
		}

		return "";
	}

	function fnGetImageFields(sReportName, sImageFields)
	{
		var aReport;
		var aTmp;

		if (sReportName == "") {
			sReportName = "main";
		}

		aReport = sImageFields.split(";");

		for (var i = 0; i < aReport.length; i++) {
			aTmp = aReport[i].split("=");
			
			if (aTmp[0].trim() == sReportName) {
				return aTmp[1].trim();
			}
		}

		return "";
	}

	function fnRptParamShare()
	{
		if (rex_goRptMainParam.get("rex_param_share") == null) {
			return rex_gsRptParamShare;
		} else {
			return rex_goRptMainParam.get("rex_param_share");
		}
	}

	function fnGetErrorMsg(oConnection)
	{
		var oXMLDOM = oConnection.GetXMLDOM();

		if(oXMLDOM == null) {
			fnAlert(oConnection.Response());
			return fnException();
		}

		try {
			oXMLDOM.setProperty("SelectionLanguage", "XPath");
			var oNodes = oXMLDOM.selectSingleNode("gubun/error/msg");

			if(oNodes == null) {
				if (oXMLDOM.parseError.errorCode != 0) {
					var oError = oXMLDOM.parseError;
					fnAlert(oError.reason);
					return "error";
				} else {
					return "";
				}
			} else {
				fnAlert(oNodes.text);
				return "error";
			}
		} catch(e) {
			fnAlert(e.message);
			return "error";
		}
	} // end fnGetErrorMsg

	// 예외 발생시 처리 함수
	function fnException() {
		//rex_goUserWindow.rex_gsEndLoadReportStatus = "false";

		fnCloseProgress();
	}

	function fnCloseProgress() {
		// Progress 닫기
		try
		{
			goWin.close();
		} catch (e)	{}
	}

	function fnAlert(sMsg) {
		if(rex_goRptMainParam.get("rex_script_alert") != null &&
		   rex_goRptMainParam.get("rex_script_alert") == "false") {
			return;
		} else {
			alert(sMsg);
		}
	}
	
	function fnArrToStr(aInData) {
		var sSplitRow = "|!|";
		var sSplitCol = "|*|";
		
		var sOut = "";
		
		if (aInData == null) return sOut;

		for(var i = 0; i < aInData.length; i++) {
			if (i > 0) sOut += sSplitRow;
			sOut += aInData[i][0] + sSplitCol;
			sOut += aInData[i][1];
		}

		return sOut;
	}

	function fnGetParamSql(sReportName, oRptParam)
	{
		var sRptNmKey = "rex_param_sql"; 

		if (sReportName != "") sRptNmKey += "_" + sReportName;

		if (oRptParam.get(sRptNmKey) != null) {
			return fnArrToStr(oRptParam.get(sRptNmKey));
		}

 		return "";
	}

	function fnSave() {
		if (rex_goRptMainParam.get("rex_save") != null) {
			if (rex_goRptMainParam.get("rex_save") == "true") {
				var sFileType = "";
				var sFileName = "";
				var sFileOption = "";
	
				var bSaveDirect = true;
	
				if (rex_goRptMainParam.get("rex_save_direct") == null) {
					bSaveDirect = true;
				} else {
					if (rex_goRptMainParam.get("rex_save_direct") == "true") {
						bSaveDirect = true;
					} else {
						bSaveDirect = false;
					}
				}
	
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
	
				if (bSaveDirect == true) {
					RexCtl.SaveAs(sFileType, sFileName, 1, -1, sFileOption);
				} else {
					RexCtl.SaveAsFilter = sFileType;
					RexCtl.SaveAsDefaultFileName = sFileName;
					RexCtl.SaveAsOption("xls",sFileOption);
					RexCtl.SaveAsDialog(sFileOption);
				}
	
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
	}
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

	if (rex_goRptMainParam.get("rex_progress") != null &&
		rex_goRptMainParam.get("rex_progress") == "true") {

		fnCloseProgress();
	}


	if (rex_goRptMainParam.EndLoadEnd != null) {
		try {
			if (rex_goRptMainParam.get("rex_endload_end") != null) {
				rex_goRptMainParam.EndLoadEnd(rex_goMainReport, rex_goMainDataSet, rex_goRptMainParam.get("rex_endload_end"));
            }
		} catch(e) {
			//
		}
	}

	fnSave();

	if (rex_goRptMainParam.get("rex_print") != null) {
		if (rex_goRptMainParam.get("rex_print") == "true" && rex_gsPrintStatus == "false") {

			if (rex_goRptMainParam.get("rex_print_option") != null) {
				RexCtl.PrintOption = rex_goRptMainParam.get("rex_print_option");
			}

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

	if (rex_goRptMainParam.get("rex_auto_next_page") != null) {
		var iSec = parseInt(rex_goRptMainParam.get("rex_auto_next_page"));
		window.setInterval("fnAutoNextPage();", iSec * 1000);
	}
</script>

<script LANGUAGE="JavaScript" FOR="RexCtl" EVENT="FinishPrint">
	if (rex_goRptMainParam.PrintEnd != null) {
		try {
			if (rex_goRptMainParam.get("rex_print_end") != null) {
				rex_goRptMainParam.PrintEnd(rex_goMainReport, rex_goMainDataSet, giMainDataSetRowCount, rex_goRptMainParam.get("rex_print_end"), RexCtl);
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

<!--script LANGUAGE="JavaScript" FOR="RexCtl" EVENT="HyperLinkClicked(bstrLink, bstrToolTip, vtCanceled)">
	//window.open("http://www.naver.com", "", "center=yes,scrollbars=no,status=no,toolbar=no,resizable=0,location=no,menu=no,width=800,height=600");
alert(bstrLink);
	vtCanceled = true;

	if (rex_goRptMainParam.HyperLinkEnd != null) {
		try {
			if (rex_goRptMainParam.get("rex_hyperlink_end") != null) {
				rex_goRptMainParam.HyperLinkEnd(rex_goMainReport, bstrLink, bstrToolTip, rex_goRptMainParam.get("rex_hyperlink_end"));
            }
		} catch(e) {
			//alert(e);
		}
	}
</script -->

<script LANGUAGE="VBScript" FOR="RexCtl" EVENT="HyperLinkClicked(bstrLink, bstrToolTip, vtCanceled)">
	' Call window.open("http://www.naver.com", "", "center=yes,scrollbars=no,status=no,toolbar=no,resizable=0,location=no,menu=no,width=800,height=600")

	vtCanceled = true

	On Error Resume Next
	
	If Not IsNull(rex_goRptMainParam.HyperLinkEnd) Then

		If Not IsNull(rex_goRptMainParam.get("rex_hyperlink_end")) Then
			Call rex_goRptMainParam.HyperLinkEnd(rex_goMainReport, bstrLink, bstrToolTip, rex_goRptMainParam.get("rex_hyperlink_end"))
		End If
	End If
	
	Err.Clear
</script>

<script LANGUAGE="VBScript" FOR="RexCtl" EVENT="ButtonSaveAsClickBefore(Cancel)">
	Dim sFileOption

	If IsNull(rex_goRptMainParam.get("rex_save_file_option")) Then
		sFileOption = ""
	Else
		sFileOption = rex_goRptMainParam.get("rex_save_file_option")

		Call RexCtl.SaveAsOption("xls", sFileOption)
	End If

	If Not IsNull(rex_goRptMainParam.get("rex_save_file")) Then
		RexCtl.SaveAsDefaultFileName = rex_goRptMainParam.get("rex_save_file")
	End If

	If Not IsNull(rex_goRptMainParam.get("rex_save_preview_direct")) Then
		If rex_goRptMainParam.get("rex_save_preview_direct") = "true" Then
			Cancel = true
				
			Call rex_goRptMainParam.put("rex_save", "true")
			
			Call fnSave()
		End If
	End If
</script>

<script LANGUAGE="JavaScript" >

	var gnPageNo = 1;

	function fnAutoNextPage()
	{	
		if(gnPageNo == RexCtl.GetPageCount()) 
		{ 
			RexCtl.movefirstpage();
			gnPageNo = 1;
		} 
		else
		{  
			RexCtl.movenextpage();
			gnPageNo++;
		}
	}

</script>


<script LANGUAGE="JavaScript" FOR="window" EVENT="onbeforeunload">
	//RexCtl.CloseReport();
	//alert("onfeforeunload");
</script>

</head>
<body topmargin="0" leftmargin="0"  rightmargin="0" bottommargin="0" onload="OnLoad();" style="width:100%;height:100%">
	<!--input type="text" id="idCnt"><br-->
	<script src="./rexscript/rexplugin.js"></script>
	<% 
		String rex_crypto = (request.getParameter("rex_crypto") == null ? "false" : request.getParameter("rex_crypto"));
		String rex_crypto_plugin = (request.getParameter("rex_crypto_plugin") == null ? "" : request.getParameter("rex_crypto_plugin"));

		if (rex_crypto.equals("true") && !rex_crypto_plugin.equals("")) { 
	%>
		<script language="JavaScript" src="./rexscript/<%=rex_crypto_plugin%>"></script>
	<%  } %>
	<!--script src="./rexscript/rex_addon.js"></script-->
</body>
</html>