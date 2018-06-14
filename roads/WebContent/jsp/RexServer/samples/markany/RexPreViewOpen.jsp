<%@ page contentType="text/html; charset=euc-kr" %>
<%
	request.setCharacterEncoding("euc-kr");
	String rex_rptname = (String)request.getParameter("rex_rptname");
%>
<html>
<head>
<title>RexpreViewTest</title>
<meta http-equiv="content-type" content="text/html; charset=euc-kr">
<script language="javascript" src="http://10.1.59.62/portal/rexpert/js/rexpert.js"></script>

<script language="JavaScript">

	var bCountry = new Array("USA","UK", "Mexico");

	var giCnt = 0;
	var gbIsSave = false;
	var goID;

	function fnMain() {
		goID = setInterval(fnOpenRexViewerJavaScript,400);
	}

	function fnOpenRexViewerJavaScript() {
		if (gbIsSave == true) return;

		if (giCnt >= bCountry.length) 
		{
			clearTimeout(goID);
			alert("완료되었습니다");
			return;
		}

		var country;
		country = bCountry[giCnt];

		gbIsSave = true;
		giCnt = giCnt + 1;

		var oRptMainParam;
		oRptMainParam = rex_GetgoDictionay();

		// 옵션 - 툴바 설정
		// oRptMainParam.put("rex_init", "open=1;save=1;print=1;stop=1;zoomin=1;zoomout=1;moveprev=1;movenext=1;combo=1;movefirst=1;movelast=1;help=1");
		// oRptMainParam.put("rex_init", "open=0;save=0");
		   oRptMainParam.put("rex_init", "ToolBarVisible=1;ShowProcessDialog=0");
		 oRptMainParam.put("rex_init_end", "javaInitEndFunction") // javaInitEndFunction 실행함 (인자는 oRexCtl)

		// oRptMainParam.put("rex_open_window", "center=yes,scrollbars=no,status=no,toolbar=no,resizable=0,location=no,menu=no,width=825,height=600");

		// 옵션 - Save 관련 설정
		   oRptMainParam.put("rex_save_file_type", "xls");
		   oRptMainParam.put("rex_save_file", "c:\\" + country + ".xls");
		   oRptMainParam.put("rex_save_file_option", "ShowFileDialog=0;SheetOption=1;ShowOptionDialog=0;");
		// oRptMainParam.put("rex_save_file_option", "coldelimiter=" + "\t" + ";rowdelimiter=" + "\n\r" + ";addfieldname=1");
		   oRptMainParam.put("rex_save_end", "javaSaveEndFunction"); // javaSaveEndFunction을 실행함 (인자는 sFileType, sFileName);

		// 옵션 - 데이터 및 xpath 설정
		// oRptMainParam.put("rex_data", txtData.value);
		// oRptMainParam.put("rex_data","http://" + window.document.location.host + "/RexServer/rppc1321.txt");
		// oRptMainParam.put("rex_xpath", "root/rpt1/row");	// main 레포트의 xpath
		// oRptMainParam.put("rex_xpath", "root/main/rpt1/rexdataset/rexrow");	// main 레포트의 xpath
		// oRptMainParam.put("rex_xpath1", "root/rpt2/row");  // subreport1의 xpath
		// oRptMainParam.put("rex_xpath2", "root/rpt3/row");  // subreport2의 xpath

		// 필수 - 레포트명
		   oRptMainParam.put("rex_rptname", "<%=rex_rptname%>");
		// oRptMainParam.put("rex_rptname", "cospec");

		// 필수 - 데이터 타입 설정
		   oRptMainParam.put("rex_datatype", "XML");  // XML, CSV
		// oRptMainParam.put("rex_datatype", "XMLSTR");  // CSVSTR, XMLSTR
		// oRptMainParam.put("rex_datatype", "CSVFILE");  // CSVFILE, XMLFILE

		// 옵션 - 다른 DB를 연결시
		// oRptMainParam.put("rex_userservice", "Sql2");
		// oRptMainParam.put("rex_userservice", "myconn");

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

		// 옵션 - 파라메터 설정
<%
	Enumeration params = request.getParameterNames();

	while (params.hasMoreElements()) { 
		String name = (String)params.nextElement(); 
//		String value = new String(request.getParameter(name).getBytes("8859_1"),"KSC5601")==null?"":new String(request.getParameter(name).getBytes("8859_1"),"KSC5601");
		String value = request.getParameter(name); 		
		
		if (!"rex_rptname".equals(name))
		{
%>
		 oRptMainParam.put("<%= name %>", "<%= value %>");
<%
		}
		System.out.println("## RexPert Params : " + name + "=" + value); 
	} 		
%>	

		// oRptMainParam.put("id", "0");
		// oRptMainParam.put("customerid", "A");
		// oRptMainParam.put("ggg", "A1" + "\t" + "B1" + "\n\r" + "C1" + "D1");

		// preview 팝업 열기
		//rex_gfRexRptOpen("popup", oRptMainParam);
		// rex_gfRexRptOpen("popupmodal", oRptMainParam);
		 rex_gfRexRptOpen("iframe", ifrmRexPreview, oRptMainParam);
		// rex_gfRexRptOpen("print", oRptMainParam);
		// rex_gfRexRptOpen("save", oRptMainParam);


	}

	// rex_init_end 정의시 실행되는 프로시져
	function javaInitEndFunction(oRexCtl) {
		// alert(oRexCtl.ToolBarVisible);
	    // oRexCtl.ToolBarVisible = false;
	    // oRexCtl.SaveAsFilter = "xls;pdf;hml;hwp;rtf;html;bmp;txt;xml;jpeg";
		// oRexCtl.SaveAsFilter = "xls";
		// oRexCtl.SaveAsDefaultFileName = "test.xls";
		   oRexCtl.SaveAsOption("xls","ShowFileDialog=0;SheetOption=1;ShowOptionDialog=0;filename=test.xls");
	}

	// rex_save_end 정의시 실행되는 프로시져
	
	function javaSaveEndFunction(sFileType, sFileName) {
		gbIsSave = false;
			//if (bCountry.length < i) return;

			//i = i + 1;
//alert("a:" + i);
//			fnOpenRexViewerJavaScript(bCountry[i])



			/*

			for (; bCountry.length > i ; i++)
			{

				if (bCountry.length != i) 
				{
					alert("a:" + i);
					fnOpenRexViewerJavaScript(bCountry[i]);
				}
				else
				{
					alert("b:" + i);
					return;
				}
				
			}
			*/

		// alert(sFileName);
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
<body onload='fnMain()'>
	<!--button id="btnRexViewer" onclick="fnOpenRexViewerJavaScript(bCountry[0])">레포트 보기</button-->
	<!--button id="btnRexViewer" onclick="fnMain()">레포트 보기</button>
	<br>
	<textarea id="txtData" rows="5" cols="100"></textarea>
	<br-->
	<iframe id="ifrmRexPreview" src="" width="100%" height="100%"></iframe>
</body>
</html>
