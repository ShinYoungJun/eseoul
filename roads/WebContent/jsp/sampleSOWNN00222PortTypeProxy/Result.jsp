<%@page contentType="text/html;charset=EUC-KR"%>
<% request.setCharacterEncoding("EUC-KR"); %>

<jsp:useBean id="sampleSOWNN00222PortTypeProxyid" scope="session" class="_212._147._46._10.stmr.websvc.ws.SOWNN00222.wsdl.SOWNN00222PortTypeProxy" />
<jsp:useBean id="_2121_1471_461_101stmr1websvc1SOWNN002221SOWNN002221SOWNN002221wsdl1RequestTypeDATAMessageBody_6id" scope="session" class="_212._147._46._10.stmr.websvc.ws.SOWNN00222.wsdl.RequestTypeDATAMessageBody" /> 
<jsp:useBean id="_2121_1471_461_101stmr1websvc1SOWNN002221SOWNN002221SOWNN002221wsdl1RequestTypeDATAMessage_5id" scope="session" class="_212._147._46._10.stmr.websvc.ws.SOWNN00222.wsdl.RequestTypeDATAMessage" />	
<jsp:useBean id="_2121_1471_461_101stmr1websvc1SOWNN002221SOWNN002221SOWNN002221wsdl1RequestTypeDATA_4id" scope="session" class="_212._147._46._10.stmr.websvc.ws.SOWNN00222.wsdl.RequestTypeDATA" />	
<jsp:useBean id="_2121_1471_461_101stmr1websvc1SOWNN002221SOWNN002221SOWNN002221wsdl1RequestType_0id" scope="session" class="_212._147._46._10.stmr.websvc.ws.SOWNN00222.wsdl.RequestType" />	
	
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
<BODY onload="init()">

<%

	//서버로부터 얻어오는 값 
	String code = "";
	String msg = ""; 
	
	//리턴값을 저장하는 변수
	String res  = "";
	
	//요청 클라이언트로 부터 얻는 매개변수
	String mSGKEY_1id=  "";
	String rESULTCODE_2id=  "";
	String oRGCD_3id=  "";
	String iFID_18id=  "";
	String deal_bas_7id=  "";
	String deal_dtl_8id=  "";
	String chif_dcsn_ymd_9id=  "";
	String ctrprop_presnt_10id=  "";
	String dpp_id_11id=  "";
	String deal_se_temp_12id=  "";
	String query_real_deal_ymd_13id=  "";
	String bpm_yn_14id=  "";
	String chif_dcsn_dtl_15id=  "";
	String mw_take_no_16id=  "";
	String deal_dutyp_id_17id=  ""; 
	
	String r_page = "";
	String r_block_page = "";
	String r_searchCause = "";
	String r_SQL = "";
	
	if(request.getParameter("mSGKEY") != null && !(request.getParameter("mSGKEY")).equals("") ){
		mSGKEY_1id=  request.getParameter("mSGKEY");
	}
	
	if(request.getParameter("rESULTCODE") != null && !(request.getParameter("rESULTCODE")).equals("") ){
		rESULTCODE_2id=  request.getParameter("rESULTCODE");
	}
	
	if(request.getParameter("oRGCD") != null && !(request.getParameter("oRGCD")).equals("") ){
		oRGCD_3id=  request.getParameter("oRGCD");
	}
	
	if(request.getParameter("iFID") != null && !(request.getParameter("iFID")).equals("") ){
		iFID_18id=  request.getParameter("iFID");
	}
	
	if(request.getParameter("deal_bas") != null && !(request.getParameter("deal_bas")).equals("") ){
		deal_bas_7id=  request.getParameter("deal_bas");
	}
	
	if(request.getParameter("deal_dtl") != null && !(request.getParameter("deal_dtl")).equals("") ){
		deal_dtl_8id=  request.getParameter("deal_dtl");
	}
	
	if(request.getParameter("chif_dcsn_ymd") != null && !(request.getParameter("chif_dcsn_ymd")).equals("") ){
		chif_dcsn_ymd_9id=  request.getParameter("chif_dcsn_ymd");
	}
	
	if(request.getParameter("ctrprop_presnt") != null && !(request.getParameter("ctrprop_presnt")).equals("") ){
		ctrprop_presnt_10id=  request.getParameter("ctrprop_presnt");
	}
	
	if(request.getParameter("dpp_id") != null && !(request.getParameter("dpp_id")).equals("") ){
		dpp_id_11id=  request.getParameter("dpp_id");
	}
	
	if(request.getParameter("deal_se_temp") != null && !(request.getParameter("deal_se_temp")).equals("") ){
		deal_se_temp_12id=  request.getParameter("deal_se_temp");
	}
	
	if(request.getParameter("query_real_deal_ymd") != null && !(request.getParameter("query_real_deal_ymd")).equals("") ){
		query_real_deal_ymd_13id=  request.getParameter("query_real_deal_ymd");
	}
	
	if(request.getParameter("bpm_yn") != null && !(request.getParameter("bpm_yn")).equals("") ){
		bpm_yn_14id=  request.getParameter("bpm_yn");
	}
	
	if(request.getParameter("chif_dcsn_dtl") != null && !(request.getParameter("chif_dcsn_dtl")).equals("") ){
		chif_dcsn_dtl_15id=  request.getParameter("chif_dcsn_dtl");
	}
	
	if(request.getParameter("mw_take_no") != null && !(request.getParameter("mw_take_no")).equals("") ){
		mw_take_no_16id=  request.getParameter("mw_take_no");
	}
	
	if(request.getParameter("deal_dutyp_id") != null && !(request.getParameter("deal_dutyp_id")).equals("") ){
		deal_dutyp_id_17id=  request.getParameter("deal_dutyp_id");
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
	
	if(request.getParameter("SQL") != null && !(request.getParameter("SQL")).equals("") ){
		r_SQL=  request.getParameter("SQL");
	}
	
	
try {

        _2121_1471_461_101stmr1websvc1SOWNN002221SOWNN002221SOWNN002221wsdl1RequestTypeDATAMessageBody_6id.setDeal_bas(deal_bas_7id);
        _2121_1471_461_101stmr1websvc1SOWNN002221SOWNN002221SOWNN002221wsdl1RequestTypeDATAMessageBody_6id.setDeal_dtl(deal_dtl_8id);
        _2121_1471_461_101stmr1websvc1SOWNN002221SOWNN002221SOWNN002221wsdl1RequestTypeDATAMessageBody_6id.setChif_dcsn_ymd(chif_dcsn_ymd_9id);
        _2121_1471_461_101stmr1websvc1SOWNN002221SOWNN002221SOWNN002221wsdl1RequestTypeDATAMessageBody_6id.setCtrprop_presnt(ctrprop_presnt_10id);
        _2121_1471_461_101stmr1websvc1SOWNN002221SOWNN002221SOWNN002221wsdl1RequestTypeDATAMessageBody_6id.setDpp_id(dpp_id_11id);
        _2121_1471_461_101stmr1websvc1SOWNN002221SOWNN002221SOWNN002221wsdl1RequestTypeDATAMessageBody_6id.setDeal_se_temp(deal_se_temp_12id);
        _2121_1471_461_101stmr1websvc1SOWNN002221SOWNN002221SOWNN002221wsdl1RequestTypeDATAMessageBody_6id.setQuery_real_deal_ymd(query_real_deal_ymd_13id);
        _2121_1471_461_101stmr1websvc1SOWNN002221SOWNN002221SOWNN002221wsdl1RequestTypeDATAMessageBody_6id.setBpm_yn(bpm_yn_14id);
        _2121_1471_461_101stmr1websvc1SOWNN002221SOWNN002221SOWNN002221wsdl1RequestTypeDATAMessageBody_6id.setChif_dcsn_dtl(chif_dcsn_dtl_15id);
        _2121_1471_461_101stmr1websvc1SOWNN002221SOWNN002221SOWNN002221wsdl1RequestTypeDATAMessageBody_6id.setMw_take_no(mw_take_no_16id);
        _2121_1471_461_101stmr1websvc1SOWNN002221SOWNN002221SOWNN002221wsdl1RequestTypeDATAMessageBody_6id.setDeal_dutyp_id(deal_dutyp_id_17id); 
        _2121_1471_461_101stmr1websvc1SOWNN002221SOWNN002221SOWNN002221wsdl1RequestTypeDATAMessage_5id.setBody(_2121_1471_461_101stmr1websvc1SOWNN002221SOWNN002221SOWNN002221wsdl1RequestTypeDATAMessageBody_6id);
        _2121_1471_461_101stmr1websvc1SOWNN002221SOWNN002221SOWNN002221wsdl1RequestTypeDATA_4id.setMessage(_2121_1471_461_101stmr1websvc1SOWNN002221SOWNN002221SOWNN002221wsdl1RequestTypeDATAMessage_5id);
        _2121_1471_461_101stmr1websvc1SOWNN002221SOWNN002221SOWNN002221wsdl1RequestType_0id.setMSGKEY(mSGKEY_1id);
        _2121_1471_461_101stmr1websvc1SOWNN002221SOWNN002221SOWNN002221wsdl1RequestType_0id.setRESULTCODE(rESULTCODE_2id);
        _2121_1471_461_101stmr1websvc1SOWNN002221SOWNN002221SOWNN002221wsdl1RequestType_0id.setORGCD(oRGCD_3id);
        _2121_1471_461_101stmr1websvc1SOWNN002221SOWNN002221SOWNN002221wsdl1RequestType_0id.setDATA(_2121_1471_461_101stmr1websvc1SOWNN002221SOWNN002221SOWNN002221wsdl1RequestTypeDATA_4id);
        _2121_1471_461_101stmr1websvc1SOWNN002221SOWNN002221SOWNN002221wsdl1RequestType_0id.setIFID(iFID_18id);
        _212._147._46._10.stmr.websvc.ws.SOWNN00222.wsdl.ResponseType SOWNN002222mtemp = sampleSOWNN00222PortTypeProxyid.SOWNN00222(_2121_1471_461_101stmr1websvc1SOWNN002221SOWNN002221SOWNN002221wsdl1RequestType_0id);
	
	if(SOWNN002222mtemp == null){
		//리턴 객체가 없는경우

%>
<FORM name="form1">
<INPUT TYPE="HIDDEN" NAME="resCode" VALUE="0">
<INPUT TYPE="HIDDEN" NAME="Result" VALUE="">
<INPUT TYPE="HIDDEN" NAME="page" VALUE="<%=r_page%>"> 
<INPUT TYPE="HIDDEN" NAME="block_page" VALUE="<%=r_block_page%>"> 
<INPUT TYPE="HIDDEN" NAME="searchCause" VALUE="<%=r_searchCause%>">
<INPUT TYPE="HIDDEN" NAME="SQL" VALUE="<%=r_SQL%>">
</FORM>
<%		
	
	}else{

		if(SOWNN002222mtemp != null){
			_212._147._46._10.stmr.websvc.ws.SOWNN00222.wsdl.ResponseTypeDATA tebece0=SOWNN002222mtemp.getDATA();

			if(tebece0 != null){
				_212._147._46._10.stmr.websvc.ws.SOWNN00222.wsdl.ResponseTypeDATAMessage tebece1=tebece0.getMessage();

				if(tebece1 != null){
					_212._147._46._10.stmr.websvc.ws.SOWNN00222.wsdl.ResponseTypeDATAMessageBodyStatusInfo[] typebody15 = tebece1.getBody();
        				
        				java.util.List listbody15= java.util.Arrays.asList(typebody15);
        				
        				int sizeOfList = listbody15.size();  
         
        				for(int z=0;z<sizeOfList;z++){  
          
						_212._147._46._10.stmr.websvc.ws.SOWNN00222.wsdl.ResponseTypeDATAMessageBodyStatusInfo li = (_212._147._46._10.stmr.websvc.ws.SOWNN00222.wsdl.ResponseTypeDATAMessageBodyStatusInfo) listbody15.get(z);
          
						code = li.getCode();
           				msg = li.getMsg();
						
						res = res + "code="+code  + "::" + "msg=" +msg  + ":;";
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
</FORM>
<%		

	}
	
} catch (Exception e) { 	
	
	String errReason = e.toString();
	res = "에러" + errReason;
%>
<FORM name="form1">
<INPUT TYPE="HIDDEN" NAME="resCode" VALUE="2">
<INPUT TYPE="HIDDEN" NAME="Result" VALUE="<%=errReason%>">
<INPUT TYPE="HIDDEN" NAME="page" VALUE="<%=r_page%>"> 
<INPUT TYPE="HIDDEN" NAME="block_page" VALUE="<%=r_block_page%>"> 
<INPUT TYPE="HIDDEN" NAME="searchCause" VALUE="<%=r_searchCause%>">
<INPUT TYPE="HIDDEN" NAME="SQL" VALUE="<%=r_SQL%>">
</FORM>

<%		
}
%>
</BODY>
</HTML>