<%@page contentType="text/html;charset=EUC-KR"%>
<% request.setCharacterEncoding("EUC-KR"); %>


<jsp:useBean id="sampleSOWNN00221PortTypeProxyid" scope="session" class="_212._147._46._10.stmr.websvc.ws.SOWNN00221.wsdl.SOWNN00221PortTypeProxy" />
<jsp:useBean id="_2121_1471_461_101stmr1websvc1SOWNN002211SOWNN002211SOWNN002211wsdl1RequestTypeDATAMessageBody_6id" scope="session" class="_212._147._46._10.stmr.websvc.ws.SOWNN00221.wsdl.RequestTypeDATAMessageBody" />
<jsp:useBean id="_2121_1471_461_101stmr1websvc1SOWNN002211SOWNN002211SOWNN002211wsdl1RequestTypeDATAMessage_5id" scope="session" class="_212._147._46._10.stmr.websvc.ws.SOWNN00221.wsdl.RequestTypeDATAMessage" /> 
<jsp:useBean id="_2121_1471_461_101stmr1websvc1SOWNN002211SOWNN002211SOWNN002211wsdl1RequestTypeDATA_4id" scope="session" class="_212._147._46._10.stmr.websvc.ws.SOWNN00221.wsdl.RequestTypeDATA" />	
<jsp:useBean id="_2121_1471_461_101stmr1websvc1SOWNN002211SOWNN002211SOWNN002211wsdl1RequestType_0id" scope="session" class="_212._147._46._10.stmr.websvc.ws.SOWNN00221.wsdl.RequestType" />

<% 
	String code = "";
	String msg = ""; 
	
	String res  = "";
	
	String mSGKEY_1id = "";
	String rESULTCODE_2id =  "";
	String oRGCD_3id =  "";
	String dpp_id_7id =  "";
	String take_stf_id_8id =  "";
	String in_confirm_se_9id =  "";
	String deal_dutyp_id_10id =  "";
	String mw_take_no_11id =  "";
	String iFID_12id =  ""; 
	
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
		iFID_12id=  request.getParameter("iFID");
	}
	
	if(request.getParameter("dpp_id") != null && !(request.getParameter("dpp_id")).equals("") ){
		dpp_id_7id=  request.getParameter("dpp_id");
	}
	
	if(request.getParameter("take_stf_id") != null && !(request.getParameter("take_stf_id")).equals("") ){
		take_stf_id_8id=  request.getParameter("take_stf_id");
	}
	
	if(request.getParameter("in_confirm_se") != null && !(request.getParameter("in_confirm_se")).equals("") ){
		in_confirm_se_9id=  request.getParameter("in_confirm_se");
	}
	
	if(request.getParameter("deal_dutyp_id") != null && !(request.getParameter("deal_dutyp_id")).equals("") ){
		deal_dutyp_id_10id=  request.getParameter("deal_dutyp_id");
	}
	
	if(request.getParameter("mw_take_no") != null && !(request.getParameter("mw_take_no")).equals("") ){
		mw_take_no_11id=  request.getParameter("mw_take_no");
	}
	
try {

        _2121_1471_461_101stmr1websvc1SOWNN002211SOWNN002211SOWNN002211wsdl1RequestTypeDATAMessageBody_6id.setDpp_id(dpp_id_7id);
        _2121_1471_461_101stmr1websvc1SOWNN002211SOWNN002211SOWNN002211wsdl1RequestTypeDATAMessageBody_6id.setTake_stf_id(take_stf_id_8id);
        _2121_1471_461_101stmr1websvc1SOWNN002211SOWNN002211SOWNN002211wsdl1RequestTypeDATAMessageBody_6id.setIn_confirm_se(in_confirm_se_9id);
        _2121_1471_461_101stmr1websvc1SOWNN002211SOWNN002211SOWNN002211wsdl1RequestTypeDATAMessageBody_6id.setDeal_dutyp_id(deal_dutyp_id_10id);
        _2121_1471_461_101stmr1websvc1SOWNN002211SOWNN002211SOWNN002211wsdl1RequestTypeDATAMessageBody_6id.setMw_take_no(mw_take_no_11id);
         _2121_1471_461_101stmr1websvc1SOWNN002211SOWNN002211SOWNN002211wsdl1RequestType_0id.setMSGKEY(mSGKEY_1id);
        _2121_1471_461_101stmr1websvc1SOWNN002211SOWNN002211SOWNN002211wsdl1RequestType_0id.setRESULTCODE(rESULTCODE_2id);
        _2121_1471_461_101stmr1websvc1SOWNN002211SOWNN002211SOWNN002211wsdl1RequestType_0id.setORGCD(oRGCD_3id);
         _2121_1471_461_101stmr1websvc1SOWNN002211SOWNN002211SOWNN002211wsdl1RequestType_0id.setIFID(iFID_12id);
        _2121_1471_461_101stmr1websvc1SOWNN002211SOWNN002211SOWNN002211wsdl1RequestTypeDATAMessage_5id.setBody(_2121_1471_461_101stmr1websvc1SOWNN002211SOWNN002211SOWNN002211wsdl1RequestTypeDATAMessageBody_6id);
        _2121_1471_461_101stmr1websvc1SOWNN002211SOWNN002211SOWNN002211wsdl1RequestTypeDATA_4id.setMessage(_2121_1471_461_101stmr1websvc1SOWNN002211SOWNN002211SOWNN002211wsdl1RequestTypeDATAMessage_5id);
        _2121_1471_461_101stmr1websvc1SOWNN002211SOWNN002211SOWNN002211wsdl1RequestType_0id.setDATA(_2121_1471_461_101stmr1websvc1SOWNN002211SOWNN002211SOWNN002211wsdl1RequestTypeDATA_4id);
        _212._147._46._10.stmr.websvc.ws.SOWNN00221.wsdl.ResponseType SOWNN002212mtemp = sampleSOWNN00221PortTypeProxyid.SOWNN00221(_2121_1471_461_101stmr1websvc1SOWNN002211SOWNN002211SOWNN002211wsdl1RequestType_0id);

	if(SOWNN002212mtemp == null){
				
		res = "0:;";
		
		out.println(res);
		//return res;


	}else{

		if(SOWNN002212mtemp != null){
			_212._147._46._10.stmr.websvc.ws.SOWNN00221.wsdl.ResponseTypeDATA tebece0=SOWNN002212mtemp.getDATA();
		
			if(tebece0 != null){
				_212._147._46._10.stmr.websvc.ws.SOWNN00221.wsdl.ResponseTypeDATAMessage tebece1=tebece0.getMessage();

				if(tebece1 != null){
					_212._147._46._10.stmr.websvc.ws.SOWNN00221.wsdl.ResponseTypeDATAMessageBodyStatusInfo[] typebody15 = tebece1.getBody();
        
        				java.util.List listbody15= java.util.Arrays.asList(typebody15);
        
        				int sizeOfList = listbody15.size();  
         
        				for(int z=0;z<sizeOfList;z++){  
          
						_212._147._46._10.stmr.websvc.ws.SOWNN00221.wsdl.ResponseTypeDATAMessageBodyStatusInfo li = (_212._147._46._10.stmr.websvc.ws.SOWNN00221.wsdl.ResponseTypeDATAMessageBodyStatusInfo) listbody15.get(z);
          
						code = li.getCode();
           					msg = li.getMsg();
						
						res = "1::" + code  + "::" + msg  + ":;";
					}  
           			}
			}
		} 
		
		out.print(res);
		

	}

}catch (Exception e) { 

	String errReason = e.toString();
	
	res = "2::" + errReason;
	
	out.println(res);

}
%>