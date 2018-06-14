<%@page contentType="text/html;charset=euc-kr"%>
<%request.setCharacterEncoding("euc-kr");%>


<jsp:useBean id="sampleSOWNN00214PortTypeProxyid" scope="session" class="_212._147._46._10.stmr.websvc.ws.SOWNN00214.wsdl.SOWNN00214PortTypeProxy" />
<jsp:useBean id="_2121_1471_461_101stmr1websvc1SOWNN002141SOWNN002141SOWNN002141wsdl1RequestTypeDATAMessageBody_6id" scope="session" class="_212._147._46._10.stmr.websvc.ws.SOWNN00214.wsdl.RequestTypeDATAMessageBody" />
<jsp:useBean id="_2121_1471_461_101stmr1websvc1SOWNN002141SOWNN002141SOWNN002141wsdl1RequestTypeDATAMessage_5id" scope="session" class="_212._147._46._10.stmr.websvc.ws.SOWNN00214.wsdl.RequestTypeDATAMessage" /> 
<jsp:useBean id="_2121_1471_461_101stmr1websvc1SOWNN002141SOWNN002141SOWNN002141wsdl1RequestTypeDATA_4id" scope="session" class="_212._147._46._10.stmr.websvc.ws.SOWNN00214.wsdl.RequestTypeDATA" />
<jsp:useBean id="_2121_1471_461_101stmr1websvc1SOWNN002141SOWNN002141SOWNN002141wsdl1RequestType_0id" scope="session" class="_212._147._46._10.stmr.websvc.ws.SOWNN00214.wsdl.RequestType" />

<%	 
	
	//서버로부터 얻어오는 값
	String mw_take_no = "";
	String take_ymd = "";
	String take_tm = "";
	String user_name = "";
	String mw_pps_getr_id = ""; 
	String outvars = "";
	String mw_afr_shtnm = "";
	String mw_se = "";
	String mw_aplct_nm = "";
	String mw_aplct_addr = "";
	String mw_code_cn = ""; 
	String recpt_fee = "";
	String take_confrm_code = "";
	String deal_se = ""; 
	String deal_code_cn = "";
	String take_se = ""; 
	String take_code_cn = "";
	String real_deal_ymd = "";
	
	//리턴값을 저장하는 변수
	String res  = "";

	//요청 클라이언트로 부터 얻는 매개변수
	String mSGKEY_1id = "";
	String rESULTCODE_2id = "";
	String oRGCD_3id = ""; 
	String in_take_cgg_code_7id = "";
	String in_take_eymd_8id = "";
	String in_condition_9id = "";
	String in_mw_se_10id = "";
	String in_condition2_11id = "";
	String in_mw_aplr_nm_12id = "";
	String in_take_symd_13id = "";
	String in_take_dep_code_14id = "";
	String in_mw_take_no_15id = "";
	String iFID_16id = "";  
	
	String r_page = "";
	String r_block_page = "";
	String r_searchCause = "";
	String r_SQL = "";
	String r_actionURL = "";
	String r_confrm_code = "";

	
	if(request.getParameter("mSGKEY") != null && !(request.getParameter("mSGKEY")).equals("") ){
		mSGKEY_1id=  request.getParameter("mSGKEY");
	}
	
	if(request.getParameter("rESULTCODE") != null && !(request.getParameter("rESULTCODE")).equals("") ){
		rESULTCODE_2id=  request.getParameter("rESULTCODE");
	}
        
     	if(request.getParameter("oRGCD") != null && !(request.getParameter("oRGCD")).equals("") ){
		oRGCD_3id=  request.getParameter("oRGCD");
	}
	
	if(request.getParameter("in_take_cgg_code") != null && !(request.getParameter("in_take_cgg_code")).equals("") ){
		in_take_cgg_code_7id=  request.getParameter("in_take_cgg_code");
	}
        
     	if(request.getParameter("in_take_eymd") != null && !(request.getParameter("in_take_eymd")).equals("") ){
		in_take_eymd_8id=  request.getParameter("in_take_eymd");
	}   
        
     	if(request.getParameter("in_condition") != null && !(request.getParameter("in_condition")).equals("") ){
		in_condition_9id=  request.getParameter("in_condition");
	}      
	
	if(request.getParameter("in_mw_se") != null && !(request.getParameter("in_mw_se")).equals("") ){
		in_mw_se_10id=  request.getParameter("in_mw_se");
	}      
	
	if(request.getParameter("in_condition2") != null && !(request.getParameter("in_condition2")).equals("") ){
		in_condition2_11id=  request.getParameter("in_condition2");
	}      
     
     	if(request.getParameter("in_mw_aplr_nm") != null && !(request.getParameter("in_mw_aplr_nm")).equals("") ){
		in_mw_aplr_nm_12id=  request.getParameter("in_mw_aplr_nm");
	}      
	
	if(request.getParameter("in_take_symd") != null && !(request.getParameter("in_take_symd")).equals("") ){
		in_take_symd_13id=  request.getParameter("in_take_symd");
	}      
        
	if(request.getParameter("in_take_dep_code") != null && !(request.getParameter("in_take_dep_code")).equals("") ){
		in_take_dep_code_14id=  request.getParameter("in_take_dep_code");
	}   
        
     	if(request.getParameter("in_mw_take_no") != null && !(request.getParameter("in_mw_take_no")).equals("") ){
		in_mw_take_no_15id=  request.getParameter("in_mw_take_no");
	}   
	
	if(request.getParameter("iFID") != null && !(request.getParameter("iFID")).equals("") ){
		iFID_16id=  request.getParameter("iFID");
	}   

	//페이징을 위해 받는 변수값
	if(request.getParameter("page") != null && !(request.getParameter("page")).equals("") ){
		r_page=  request.getParameter("page");
	}
	
	if(request.getParameter("block_page") != null && !(request.getParameter("block_page")).equals("") ){
		r_block_page=  request.getParameter("block_page");
	} 
	
	if(request.getParameter("searchCause") != null && !(request.getParameter("searchCause")).equals("") ){
		r_searchCause=  request.getParameter("searchCause");
	} 
	
	if(request.getParameter("SQL") != null && !(request.getParameter("SQL")).equals("")){
		r_SQL=  request.getParameter("SQL");
	}
	
	if(request.getParameter("actionURL") != null && !(request.getParameter("actionURL")).equals("")){
		r_actionURL=  request.getParameter("actionURL");
	}
	
	if(request.getParameter("in_confrm_code") != null && !(request.getParameter("in_confrm_code")).equals("")){
		r_confrm_code =  request.getParameter("in_confrm_code");
	}
%>
			
<HTML>
<HEAD>
<TITLE>Result</TITLE>
<script type="text/JavaScript">
<!-- 
function init(){ 
	
	var f = document.form1;
	
	f.method="post";
	f.action="Output.jsp";
	f.submit();
	
}
-->
</script>
</HEAD>
<BODY onload="init();">
<%	
try{
		System.out.println("iFID_16id="+ iFID_16id);
		
        _2121_1471_461_101stmr1websvc1SOWNN002141SOWNN002141SOWNN002141wsdl1RequestTypeDATAMessageBody_6id.setIn_take_cgg_code(in_take_cgg_code_7id);
        _2121_1471_461_101stmr1websvc1SOWNN002141SOWNN002141SOWNN002141wsdl1RequestTypeDATAMessageBody_6id.setIn_take_eymd(in_take_eymd_8id);
        _2121_1471_461_101stmr1websvc1SOWNN002141SOWNN002141SOWNN002141wsdl1RequestTypeDATAMessageBody_6id.setIn_condition(in_condition_9id);
        _2121_1471_461_101stmr1websvc1SOWNN002141SOWNN002141SOWNN002141wsdl1RequestTypeDATAMessageBody_6id.setIn_mw_se(in_mw_se_10id);
        _2121_1471_461_101stmr1websvc1SOWNN002141SOWNN002141SOWNN002141wsdl1RequestTypeDATAMessageBody_6id.setIn_condition2(in_condition2_11id);
        _2121_1471_461_101stmr1websvc1SOWNN002141SOWNN002141SOWNN002141wsdl1RequestTypeDATAMessageBody_6id.setIn_mw_aplr_nm(in_mw_aplr_nm_12id);
        _2121_1471_461_101stmr1websvc1SOWNN002141SOWNN002141SOWNN002141wsdl1RequestTypeDATAMessageBody_6id.setIn_take_symd(in_take_symd_13id);
        _2121_1471_461_101stmr1websvc1SOWNN002141SOWNN002141SOWNN002141wsdl1RequestTypeDATAMessageBody_6id.setIn_take_dep_code(in_take_dep_code_14id);
       // _2121_1471_461_101stmr1websvc1SOWNN002141SOWNN002141SOWNN002141wsdl1RequestTypeDATAMessageBody_6id.setIn_mw_take_no(in_mw_take_no_15id);
        _2121_1471_461_101stmr1websvc1SOWNN002141SOWNN002141SOWNN002141wsdl1RequestTypeDATAMessage_5id.setBody(_2121_1471_461_101stmr1websvc1SOWNN002141SOWNN002141SOWNN002141wsdl1RequestTypeDATAMessageBody_6id);
        _2121_1471_461_101stmr1websvc1SOWNN002141SOWNN002141SOWNN002141wsdl1RequestTypeDATA_4id.setMessage(_2121_1471_461_101stmr1websvc1SOWNN002141SOWNN002141SOWNN002141wsdl1RequestTypeDATAMessage_5id);
        _2121_1471_461_101stmr1websvc1SOWNN002141SOWNN002141SOWNN002141wsdl1RequestType_0id.setMSGKEY(mSGKEY_1id);
        _2121_1471_461_101stmr1websvc1SOWNN002141SOWNN002141SOWNN002141wsdl1RequestType_0id.setRESULTCODE(rESULTCODE_2id);
        _2121_1471_461_101stmr1websvc1SOWNN002141SOWNN002141SOWNN002141wsdl1RequestType_0id.setORGCD(oRGCD_3id);
        _2121_1471_461_101stmr1websvc1SOWNN002141SOWNN002141SOWNN002141wsdl1RequestType_0id.setDATA(_2121_1471_461_101stmr1websvc1SOWNN002141SOWNN002141SOWNN002141wsdl1RequestTypeDATA_4id);
        _2121_1471_461_101stmr1websvc1SOWNN002141SOWNN002141SOWNN002141wsdl1RequestType_0id.setIFID(iFID_16id);
        
        _212._147._46._10.stmr.websvc.ws.SOWNN00214.wsdl.ResponseType SOWNN002142mtemp = sampleSOWNN00214PortTypeProxyid.SOWNN00214(_2121_1471_461_101stmr1websvc1SOWNN002141SOWNN002141SOWNN002141wsdl1RequestType_0id);

	if(SOWNN002142mtemp == null){
	//리턴객체가 존재하지 않는경우

%>
<FORM name="form1">
<INPUT TYPE="HIDDEN" NAME="resCode" VALUE="0">
<INPUT TYPE="HIDDEN" NAME="Result" VALUE="">
<INPUT TYPE="HIDDEN" NAME="page" VALUE="<%=r_page%>"> 
<INPUT TYPE="HIDDEN" NAME="block_page" VALUE="<%=r_block_page%>"> 
<INPUT TYPE="HIDDEN" NAME="searchCause" VALUE="<%=r_searchCause%>">
<INPUT TYPE="HIDDEN" NAME="SQL" VALUE="<%=r_SQL%>">
<INPUT TYPE="HIDDEN" NAME="confrm_code" VALUE="<%=r_confrm_code%>">
</FORM>
<%	
	
	}else{
	
		if(SOWNN002142mtemp != null){

			_212._147._46._10.stmr.websvc.ws.SOWNN00214.wsdl.ResponseTypeDATA tebece0=SOWNN002142mtemp.getDATA();
			
			if(tebece0 != null){
		
				_212._147._46._10.stmr.websvc.ws.SOWNN00214.wsdl.ResponseTypeDATAMessage tebece1=tebece0.getMessage();
		
				if(tebece1 != null){
					
					_212._147._46._10.stmr.websvc.ws.SOWNN00214.wsdl.ResponseTypeDATAMessageBodyList[] typebody15 = tebece1.getBody();
					
					java.util.List listbody15= java.util.Arrays.asList(typebody15);
         
					int sizeOfList = listbody15.size();
					
					
					for(int z=0;z<sizeOfList;z++)
					{  
          
						_212._147._46._10.stmr.websvc.ws.SOWNN00214.wsdl.ResponseTypeDATAMessageBodyList li = (_212._147._46._10.stmr.websvc.ws.SOWNN00214.wsdl.ResponseTypeDATAMessageBodyList) listbody15.get(z);
						System.out.println("li.getUser_name()="+li.getUser_name());
						mw_take_no = li.getMw_take_no();
						take_ymd = li.getTake_ymd();
						take_tm = li.getTake_tm();
						user_name = li.getUser_name();
						mw_pps_getr_id = li.getMw_pps_getr_id();
						outvars = li.getOutvars();
						mw_afr_shtnm = li.getMw_afr_shtnm();
						mw_se = li.getMw_se();
						mw_aplct_nm = li.getMw_aplct_nm();
						mw_aplct_addr = li.getMw_aplct_addr();
						mw_code_cn = li.getMw_code_cn();
						recpt_fee = li.getRecpt_fee();
						take_confrm_code = li.getTake_confrm_code();
						deal_se = li.getDeal_se();
						deal_code_cn = li.getDeal_code_cn();
						take_se = li.getTake_se();
						take_code_cn = li.getTake_code_cn();
						real_deal_ymd = li.getReal_deal_ymd();
						
						res = res + "mw_take_no= " + mw_take_no+ "::";
						res = res + "outvars= " + outvars + "::";
						res = res + "mw_code_cn= " + mw_code_cn +  "::";
						res = res + "mw_aplct_nm= " + mw_aplct_nm + "::";
						res = res + "deal_code_cn= " + deal_code_cn + "::";
						res = res + "take_confrm_code= " + take_confrm_code + "::";
						res = res + "mw_afr_shtnm= " + mw_afr_shtnm + "::";
						res = res + "take_ymd= " + take_ymd + "::";
						res = res + "real_deal_ymd= " + real_deal_ymd + ":;";
					
					}
				
				}
			}
		}
%>
<FORM name="form1">
<INPUT TYPE="HIDDEN" NAME="resCode" VALUE="1">
<INPUT TYPE="HIDDEN" NAME="Result" VALUE="<%=res%>">
<INPUT TYPE="HIDDEN" NAME="page" VALUE="<%=r_page%>"> 
<INPUT TYPE="HIDDEN" NAME="block_page" VALUE="<%=r_block_page%>"> 
<INPUT TYPE="HIDDEN" NAME="searchCause" VALUE="<%=r_searchCause%>">
<INPUT TYPE="HIDDEN" NAME="SQL" VALUE="<%=r_SQL%>">
<INPUT TYPE="HIDDEN" NAME="confrm_code" VALUE="<%=r_confrm_code%>">
</FORM>
<%		
	}

}catch (Exception e) { 
	
	String errReason = e.toString();
	res = "에러::" + errReason;
	
	out.println(res);
	

%>
<FORM name="form1">
<INPUT TYPE="HIDDEN" NAME="resCode" VALUE="2">
<INPUT TYPE="HIDDEN" NAME="Result" VALUE="<%=errReason%>">
<INPUT TYPE="HIDDEN" NAME="page" VALUE="<%=r_page%>"> 
<INPUT TYPE="HIDDEN" NAME="block_page" VALUE="<%=r_block_page%>"> 
<INPUT TYPE="HIDDEN" NAME="searchCause" VALUE="<%=r_searchCause%>">
<INPUT TYPE="HIDDEN" NAME="SQL" VALUE="<%=r_SQL%>">
<INPUT TYPE="HIDDEN" NAME="confrm_code" VALUE="<%=r_confrm_code%>">
</FORM>
<%		
}
%>
</BODY>
</HTML>