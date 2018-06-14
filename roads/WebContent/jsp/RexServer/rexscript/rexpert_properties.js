// Method for Gethering SubReport-Data
rex_gsGetSubReportData = "once";  // once or each

// Method for Sharing Parameter
rex_gsRptParamShare = "share";  // share or each

// Method for Matching Parameter
rex_gsRptParamMatch = "name";  // index or name

// DataSet CSV Separator Information
rex_gsCsvSeparatorDataset = "|@|";
rex_gsCsvSeparatorColumn = "|*|";
rex_gsCsvSeparatorRow = "";

// Rexpert Web Viewer Windows Size
rex_gsPreViewFeatures = "center=yes,scrollbars=no,status=no,toolbar=no,resizable=0,location=no,menu=no,width=900,height=600";
rex_gsPreViewFeaturesModal = "center:yes;resizable:no;scroll:no;status:no;dialogWidth:900px;dialogHeight:600px";

// Rexpert Server Context Root
rex_gsRexServiceRootURL = rex_gfGetLocationHost() + "/jsp/RexServer/";

// Rexpert Web Viewer
//rex_gsPreViewURL = rex_gsRexServiceRootURL + "RexPreView.jsp";
rex_gsPreViewURL = rex_gsRexServiceRootURL + "RexPreView.jsp";

// rex-files(Rexpert Design Files) Location
rex_gsReportURL = rex_gsRexServiceRootURL + "rexfiles/";

// Rexpert Server Broker
rex_gsRptServiceURL = rex_gsRexServiceRootURL + "RexService.jsp";
//rex_gsRptServiceURL = "http://localhost/RexService.php";
//rex_gsRptServiceURL = "http://172.19.5.8:8080/RexServer/RexService.jsp";

// DB Conntection Information
rex_gsUserService = "";

// Crypto, Crytpo algorithm and parameter
//rex_crypto_check = false;
rex_crypto_check = true;
rex_crypto_plugin = ""
//rex_crypto_plugin = "inisafeweb60.krx"
//rex_crypto_plugin = "rex_inisafeweb.js"
//rex_crypto_plugin = "rex_xecureweb.js"
//rex_crypto_plugin_param = "certificationpath=http://localhost:8080/inisafe/certification.jsp;algorithm=SEED"
//rex_crypto_plugin_param = "certificationpath=" + rex_gfGetLocationHost() + "/RexServer/samples/initech/certification.jsp;algorithm=SEED"
rex_crypto_plugin_param = "";
rex_crypto_encode = true;
rex_crypto_decode = false;
//rex_crypto_encode_flush_count = 0;  // if 0 then none else per count
rex_crypto_encode_flush_count = 10;  // if 0 then none else per count
rex_crypto_encode_flush_separator = "|!|";

// CSV encoding=euc-kr
rex_csv_encoding = "";
//rex_csv_encoding = "encoding=euc-kr";
//rex_csv_encoding = "encoding=utf-8";

// Viewer information
rex_viewer_type = "ANSI";               // ANSI or UNICODE, default=ANSI
//rex_viewer_type = "UNICODE";               // ANSI or UNICODE, default=ANSI
rex_viewer_version = "2,5,1,148";    // version, comma separator
rex_viewer_install = "ONCE";           // EACH or ONCE or NONE, default=EACH
//rex_viewer_install = "NONE";           // EACH or ONCE or NONE, default=EACH

// Language Information
rex_gsLanguage = "ko";     // ko: Korean, en: English