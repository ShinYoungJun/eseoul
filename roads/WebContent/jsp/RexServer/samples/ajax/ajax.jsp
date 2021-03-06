<%@ 
		page contentType="text/html;charset=euc-kr"
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=MS949">
<title>RexpreViewTest</title>
<script language="javascript" src="../../rexscript/rexpert.js"></script>
<script language="javascript" src="../../rexscript/rexpert_properties.js"></script>

<script language="JavaScript">
	function fnOpenRexViewerJavaScript() {
		var oRptMainParam;
		oRptMainParam = rex_GetgoDictionay();

		// 옵션 - 툴바 설정
		// oRptMainParam.put("rex_init", "open=1;save=1;print=1;stop=1;zoomin=1;zoomout=1;moveprev=1;movenext=1;combo=1;movefirst=1;movelast=1;help=1");
		//oRptMainParam.put("rex_init", "open=0;save=0");
		oRptMainParam.put("rex_init", "ToolBarVisible=1;ShowProcessDialog=1;ShowParameterDialog=0");
		oRptMainParam.put("rex_init_end", "javaInitEndFunction") // javaInitEndFunction 실행함 (인자는 oRexCtl)

		//oRptMainParam.put("rex_open_window", "center=yes,scrollbars=no,status=no,toolbar=no,resizable=0,location=no,menu=no,width=1000,height=600");

		// 옵션 - 레포트 파일을 서버에서 가져온 후에 실행될 함수 설정
		//oRptMainParam.put("rex_openreport_end", "javaOpenReportEndFunction") // javaOpenReportEndFunction 실행함 (인자는 oReport)

		// 옵션 - Save 관련 설정
		//oRptMainParam.put("rex_save_file_type", "pdf");
		// oRptMainParam.put("rex_save_file", "c:\\abc.pdf");
		// oRptMainParam.put("rex_save_file_option", "sheetOption=1");
		// oRptMainParam.put("rex_save_file_option", "coldelimiter=" + "\t" + ";rowdelimiter=" + "\n\r" + ";addfieldname=1");
		// oRptMainParam.put("rex_save_end", "javaSaveEndFunction"); // javaSaveEndFunction을 실행함 (인자는 sFileType, sFileName);

		// 옵션 - 데이터 및 xpath 설정
		//oRptMainParam.put("rex_data", "http://localhost:8080/RexServer/rexfiles/test.xml");
		//oRptMainParam.put("rex_data", txtData.value);
		//oRptMainParam.put("rex_xpath", "root/rpt1/row");	// main 레포트의 xpath
	
		//oRptMainParam.put("rex_xpath", "root/main/rpt1/rexdataset/rexrow");	// main 레포트의 xpath
		// oRptMainParam.put("rex_xpath1", "root/rpt2/row");  // subreport1의 xpath
		// oRptMainParam.put("rex_xpath2", "root/rpt3/row");  // subreport2의 xpath

		// 필수 - 레포트명
		oRptMainParam.put("rex_rptname", "samples/ajax/ajax_gosu");
		// oRptMainParam.put("rex_rptname", "cospec");

		// 필수 - 데이터 타입 설정
		//oRptMainParam.put("rex_datatype", "CSV");  // XML, CSV
		//oRptMainParam.put("rex_datatype", "XMLSTR");  // XMLSTR, CSVSTR
		//oRptMainParam.put("rex_datatype", "XMLFILE");  // XMLFILE, CSVFILE
		oRptMainParam.put("rex_datatype", "CSV_AJAX");  // XML_AJAX, CSV_AJAX
		//oRptMainParam.put("rex_datatype", "XMLFILE_AJAX");  // XMLFILE_AJAX, CSVFILE_AJAX
		oRptMainParam.put("rex_ajax_requestheader_contenttype", "application/x-www-form-urlencoded;charset=UTF-8");

		// 옵션 - 다른 DB를 연결시
		//oRptMainParam.put("rex_userservice", "Syb1");
		//oRptMainParam.put("rex_userservice", "Ora1");
		oRptMainParam.put("rex_userservice", "gosu");

		// 옵션 - rex_gfRexRptOpen("print", oRptMainParam) 호출시 바로 인쇄 설정
		// oRptMainParam.put("rex_printdirect", "true");
		// oRptMainParam.put("rex_print_startpage", "3");
		// oRptMainParam.put("rex_print_endpage", "-1");
		// oRptMainParam.put("rex_print_count", "5");
		// oRptMainParam.put("rex_print_skipzero", "true");  // 인쇄시 건수가 0이면 인쇄 안함

		// 또는 아래와 같이 설정 가능
		// oRptMainParam.put("rex_print", "direct=true;startpage=3;endpage=-1;count=10;skipzero=true");

		// oRptMainParam.put("rex_print_printerpaperbin", "255");  // 출력트레이 설정

		// oRptMainParam.put("rex_print_printername", "FinePrint");  // 출력프린터 설정
		// oRptMainParam.put("rex_print_printername", "\\\\124.137.28.171\\HP LaserJet 4200 PCL 6");  // 출력프린터 설정

		// oRptMainParam.put("rex_print_end", "javaPrintEndFunction"); // javaPrintEndFunction을 실행함 (인자는 oReport, oDataSet, RowCount)

		// 옵션 - 레포트가 로드되었을 때 실행될 함수 설정
		//oRptMainParam.put("rex_endload_end", "javaEndLoadEndFunction"); // javaEndLoadEndFunction 실행함 (인자는 oReport, oDataSet)

		// 옵션 - HyperLink가 설정된 객체를 클릭했을 때 실행할 함수 설정
		//oRptMainParam.put("rex_hyperlink_end", "javaHyperLinkEndFunction") // javaHyperLinkEndFunction 실행함 (인자는 oReport, sLink, sToolTip)

		// 옵션 - 긴데이터를 일정크기로 나눌 필드 설정 (반드시 XML 데이터타입으로 해야 함)
		//oRptMainParam.put("rex_split_fields", "main=test1:10,test2:20;서브리포트1=test2:20");
		//oRptMainParam.put("rex_split_fields", "main=c:3,d:10;서브리포트1=c:2");
		//oRptMainParam.put("rex_split_fields", "main=TEST2,d:10;서브리포트1=c:2");  // 0 : enter로 구분, blank : if blob then string else none

		//oRptMainParam.CallBack = javaCallBack; // (인자는 oReport, oDataSet)

		// 옵션 - rex_gfRexRptOpenMulti 함수 호출시 적용됨 AddReportSection
		//oRptMainParam.put("rex_addreportsection", "followmainreport=1;usemainreportdata=0;pagereset=0");

		// 옵션 - 파라메터 설정
		//oRptMainParam.put("custid", txtData.value);
		// oRptMainParam.put("id", "0");
		// oRptMainParam.put("customerid", "A");
		// oRptMainParam.put("ggg", "A1" + "\t" + "B1" + "\n\r" + "C1" + "D1");

		// 옵션 - 자동갱신 시간(총)
		//oRptMainParam.put("rex_auto_refresh", txtRefreshTime.value)

		// preview 팝업 열기
		//rex_gfRexRptOpen("popup", oRptMainParam);
		//rex_gfRexRptOpen("popupmodal", oRptMainParam);
		rex_gfRexRptOpen("iframe", ifrmRexPreview, oRptMainParam);
		//rex_gfRexRptOpen("print", oRptMainParam);
		//rex_gfRexRptOpen("save", oRptMainParam);
		
		return oRptMainParam;
	}

	// CallBack 정의시 실행되는 프로시져
	function javaCallBack(oReport, oDataSet) {
		var oCtlTxtBox;
		var oCtlPic;

		//alert("callback");

		oCtlTxtBox = oReport.GetControl("글상자1");
		oCtlPic = oReport.GetControl("그림1");

		TxtBox_x1 = oCtlTxtBox.GetProperty("X1");
		TxtBox_txt = oCtlTxtBox.GetProperty("Text");

		Pic_x1 = oCtlPic.GetProperty("X1");

		oCtlPic.SetProperty("X1",	parseInt(TxtBox_x1)
									+ fnStrLenKor(TxtBox_txt) * 16 
									+ fnStrLenEng(TxtBox_txt) * 18
									);

		//oControl.SetProperty(aObjProp[0], aObjProp[1]);
		//s = oControl.GetProperty("Text");
		//oControl.SetProperty("X1", "10");	
		// X1="140" Y1="30" Width="750" Height="50"
	}

	function fnStrLenKor(xxx) {
		var strlen = 0;

		for(j = 0; j < xxx.length; j++){
			var c = xxx.charCodeAt(j);

		    if ( c  <  0xac00 || 0xd7a3 < c ) {
		        //strlen++;
		    } else {
				strlen+=2;
			}
		}

		return strlen;
	}

	function fnStrLenEng(xxx) {
		var strlen = 0;

		for(j = 0; j < xxx.length; j++){
			var c = xxx.charCodeAt(j);
		    if ( c  <  0xac00 || 0xd7a3 < c ) {
		        strlen++;
		    } else  {
				//strlen+=2;
			}
		}

		return strlen;
	}


	// rex_init_end 정의시 실행되는 프로시져
	function javaInitEndFunction(oRexCtl) {
		//oRexCtl.OpenProcessDialog("조회중입니다...");
		//alert(oRexCtl.ToolBarVisible);
	    //oRexCtl.ToolBarVisible = false;
	    // oRexCtl.SaveAsFilter = "xls;pdf;hml;hwp;rtf;html;bmp;txt;xml;jpeg";

	    //oRexCtl.Zoom("wholepage");
		//oRexCtl.ZoomIn();
		//oRexCtl.ZoomIn();
		//oRexCtl.Zoom("pagewidth");

		//var oPage = oReport.GetPage();
 
		// Run 이전에 설정
		//oPage.LeftMargin = 100;
		//oPage.RightMargin = 100;
		//oPage.TopMargin = 100;
		//oPage.BottomMargin = 100;

		//oRexCtl.Zoom("100");
		//oRexCtl.Zoom("50");
		//oRexCtl.Zoom("wholepage");
		oRexCtl.Zoom("pagewidth");
	}

	// rex_openreport_end 정의시 실행되는 프로시져
	function javaOpenReportEndFunction(oReport) {
		//
		var oTeeChart = null;

		try
		{
			oTeeChart = oReport.OpenChart("챠트1").GetChart();
		}
		catch(e)
		{
			alert("챠트를 찾을 수 없습니다.");
			return;
		}

		//////////////////////////////////////////////////////////////
		//  * 챠트 종류
		//
		//	scLine = 0;
		//	scBar = 1;
		//	scHorizBar = 2;
		//	scArea = 3;
		//	scPoint = 4;
		//	scPie = 5;
		//	scFastLine = 6;
		//	scShape = 7;
		//	scGantt = 8;
		//	scBubble = 9;
		//	scArrow = 10;
		//	scCandle = 11;
		//	scPolar = 12;
		//	scSurface = 13;
		//	scVolume = 14;
		//	scErrorBar = 15;
		//	scBezier = 16;
		//	scContour = 17;
		//	scError = 18;
		//	scPoint3D = 19;
		//	scRadar = 20;
		//	scClock = 21;
		//	scWindRose = 22;
		//	scBar3D = 23;
		//	scImageBar = 24;
		//////////////////////////////////////////////////////////////
		oTeeChart.ChangeSeriesType(0, 0);
		
		//////////////////////////////////////////////////////////////
		//  * 바챠트에서 사용할 수 있는 타입
		//
		//	bsRectangle = 0
		//	bsPyramid = 1
		//	bsInvPyramid = 2
		//	bsCilinder = 3
		//	bsEllipse = 4
		//	bsArrow = 5
		//	bsRectangleGradient = 6
		////////////////////////////////////////////////////////////// 
		//oTeeChart.Series(0).asBar.BarStyle = 0;

	}

	// rex_endload_end 정의시 실행되는 프로시져
	function javaEndLoadEndFunction(oReport, oDataSet) {
		//
		alert(oDataSet.RowCount);
	}

	// rex_hyperlink_end 정의시 실행되는 프로시져
	function javaHyperLinkEndFunction(oReport, sLink, sToolTip) {
		// drill-down 코딩을 할 수 있음.
		//alert(sLink);
		//alert(sToolTip);
		window.open("http://www.naver.com", "naver","");
	}

	// rex_save_end 정의시 실행되는 프로시져
	function javaSaveEndFunction(sFileType, sFileName) {
		 alert(sFileName);
		/*
	    var oExcel, oBook, oSheet;
	    Set oExcel = CreateObject("Excel.Application")
        oExcel.Visible = True

       '엑셀이 설치되어있는지에 대한 Check
        If IsNull(oExcel.Application) Then
            MsgBox "엑셀이 설치되지 않아 작업을 진행할 수 없습니다.", vbOKOnly, ""
            oExcel.Quit
            Set oExcel = Nothing
        End If

        oExcel.Workbooks.Open sFileName
        */
        
        
	}

	// rex_print_end 정의시 실행되는 프로시져
	function javaPrintEndFunction(oReport, oDataSet, RowCount) {
		// oDataSet은 사용하지 마세요... RowCount를 사용하세요
		alert(RowCount);
		alert(RowCount * 100);
	}

</script>

</head>
<body>
	<button id="btnRexViewer" onclick="fnOpenRexViewerJavaScript();">레포트 보기</button><br>
	<textarea id="txtData" rows="5" cols="100"></textarea>
	<br>
	<iframe id="ifrmRexPreview" src="../../RexPreView.jsp" width="100%" height="450"></iframe>
</body>
</html>
