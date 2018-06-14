<%@page contentType="text/html;charset=euc-kr"%>
<%request.setCharacterEncoding("euc-kr");%>

<jsp:useBean id="sampleSOWNN00216PortTypeProxyid" scope="session" class="_212._147._46._10.stmr.websvc.ws.SOWNN00216.wsdl.SOWNN00216PortTypeProxy" />
<jsp:useBean id="_2121_1471_461_101stmr1websvc1SOWNN002161SOWNN002161SOWNN002161wsdl1RequestTypeDATAMessageBody_6id" scope="session" class="_212._147._46._10.stmr.websvc.ws.SOWNN00216.wsdl.RequestTypeDATAMessageBody" />
<jsp:useBean id="_2121_1471_461_101stmr1websvc1SOWNN002161SOWNN002161SOWNN002161wsdl1RequestTypeDATAMessage_5id" scope="session" class="_212._147._46._10.stmr.websvc.ws.SOWNN00216.wsdl.RequestTypeDATAMessage" />
<jsp:useBean id="_2121_1471_461_101stmr1websvc1SOWNN002161SOWNN002161SOWNN002161wsdl1RequestTypeDATA_4id" scope="session" class="_212._147._46._10.stmr.websvc.ws.SOWNN00216.wsdl.RequestTypeDATA" />
<jsp:useBean id="_2121_1471_461_101stmr1websvc1SOWNN002161SOWNN002161SOWNN002161wsdl1RequestType_0id" scope="session" class="_212._147._46._10.stmr.websvc.ws.SOWNN00216.wsdl.RequestType" />


<%
	//서버로 부터 얻어오는 값
	String take_cgg_code = "";
	String take_dep_code  = "";
	String take_dep_nm  = "";
	String take_ymd = "";
	String take_tm = "";
	String take_se = "";
	String take_gbn_cn = "";
	String wrkr_bup_no_one = "";
	String wrkr_bup_no_two = "";
	String susuryo_sum = "";
	String take_man_dept_code = "";
	String take_man_dept_name = "";
	String dpp_usr_dept_code = "";
	String dpp_usr_dept_name = "";
	String duty_man_dept_code = "";
	String duty_man_dept_name = "";
	String take_stf_id = "";
	String take_man_name = "";
	String info_prot_yn = "";
	String cgg_mw_afr_cl_no = "";
	String mw_se = "";
	String mw_gbn_cn = "";
	String mw_kd = "";
	String kind_code_cn = "";
	String mw_notes = "";
	String mw_regt_no = "";
	String deal_plan_ymd = "";
	String deal_plan_daycnt = "";
	String court_daycnt = "";
	String shrt_daycnt = "";
	String rel_pgm_nm = "";
	String rel_pgm_se = "";
	String mw_afr_nm = "";
	String mw_afr_shtnm = "";
	String deal_fee = "";
	String adm_bsn_no = "";
	String mgt_org_se = "";
	String main_deal_dep_code = "";
	String main_dep_nm = "";
	String appl_mwin_se = "";
	String mwin_gbn_cn = "";
	String mw_aplct_sid = "";
	String mw_aplct_sid_sno = "";
	String mw_aplct_nm = "";
	String mw_aplct_telno = "";
	String mw_aplct_hpno = "";
	String mw_aplct_addr = "";
	String wrkr_bup_no = "";
	String wrkr_bup_nm = "";
	String post_no = "";
	String addr_se = "";
	String addr_gbn_cn = "";
	String regn_code = "";
	String sido_nm = "";
	String cgg_nm = "";
	String umd_nm = "";
	String ri_nm = "";
	String san = "";
	String bunji = "";
	String ho = "";
	String tong = "";
	String ban = "";
	String spec_addr = "";
	String spec_dng = "";
	String spec_ho = "";
	String appl_cnt = "";
	String agncy_sid = "";
	String agncy_sid_sno = "";
	String agncy_nm = "";
	String agncy_telno = "";
	String agncy_addr = "";
	String aplct_rel = "";
	String dpp_id = "";
	String dpp_usr_nm = "";
	String dpp_usr_telno = "";
	String deal_dutyp_id = "";
	String duty_man_nm = "";
	String real_deal_ymd = "";
	String deal_se = "";
	String deal_gbn_cn = "";
	String fee_recpt_se = "";
	String recpt_gbn_cn = "";
	String recpt_fee = "";
	String sndmny_am = "";
	String restamt_rtn = "";
	String recpt_dt = "";
	String deal_amt = "";
	String take_tkit_issue_yn = "";
	String take_gd_item = "";
	String pa_mw_rel_no = "";
	String wic_cgg_code = "";
	String wic_cgg_nm = "";
	String wic_dep_code = "";
	String wic_org_mw_take_no = "";
	String mw_prog_se = "";
	String mw_aplct_email = "";
	String mw_aplct_pwd = "";
	String deal_plan_tm = "";
	String real_deal_tm = "";
	String first_deal_daycnt = "";
	String reg_ymd = "";
	String reg_tm = "";
	String reg_dt = "";
	String sat_wrk_yn = "";
	String get_met = "";
	String snd_fee = "";
	String retn_bank_code = "";
	String retn_bank_acc_no = "";
	String retn_bank_depr_nm = "";
	String web_take_no = "";
	String appl_doc_url = "";
	String get_regg_post_no = "";
	String get_regn_addr = "";
	String first_mw_take_no = "";
	String aplct_rel_code = "";
	String bpm_yn = "";
	String cnsl_sj = "";
	String deal_chr_id = "";
	String deal_chr_nm = "";
	String dtl_cn = "";
	String jnji_se = "";
	String law_tm = "";
	String law_ymd = "";
	String mw_take_no = "";
	String mw_take_no_one = "";
	String mw_take_no_two = "";
	String mw_take_no_three = "";
	String sms_rprt_yn = "";
	String stf_cnt = "";
	
	//리턴값을 저장하는 변수
	String res  = "";
	
	//요청 클라이언트로 부터 얻는 매개변수
	String mSGKEY_1id  = "";
	String rESULTCODE_2id  = "";
	String oRGCD_3id  = "";
	String mw_take_no_7id  = "";
	String iFID_8id  = "";
	
	String r_page = "";
	String r_block_page = "";
	String r_searchCause = "";
	String r_SQL = "";
	String r_actionURL = "";
	String r_menu = "";
	String r_submenu = "";
	String r_ResultList = "";
	String r_soll = "";
	String r_appeal_no = "";
	
	if(request.getParameter("mSGKEY") != null && !(request.getParameter("mSGKEY")).equals("") ){
		mSGKEY_1id=  request.getParameter("mSGKEY");
	}
	
	if(request.getParameter("rESULTCODE") != null && !(request.getParameter("rESULTCODE")).equals("") ){
		rESULTCODE_2id=  request.getParameter("rESULTCODE");
	}
		
	if(request.getParameter("oRGCD") != null && !(request.getParameter("oRGCD")).equals("") ){
		oRGCD_3id=  request.getParameter("oRGCD");  
	}
	
	if(request.getParameter("mw_take_no") != null && !(request.getParameter("mw_take_no")).equals("") ){
		mw_take_no_7id=  request.getParameter("mw_take_no");
	}
	
	if(request.getParameter("iFID") != null && !(request.getParameter("iFID")).equals("") ){
		iFID_8id=  request.getParameter("iFID");
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
	
	if(request.getParameter("actionURL") != null && !(request.getParameter("actionURL")).equals("")){
		r_actionURL=  request.getParameter("actionURL");
	}
	
	if(request.getParameter("Menu") != null && !(request.getParameter("Menu")).equals("")){
		r_menu=  request.getParameter("Menu");
	}
	
	if(request.getParameter("SubMenu") != null && !(request.getParameter("SubMenu")).equals("")){
		r_submenu=  request.getParameter("SubMenu");
	}
	
	if(request.getParameter("ResultList") != null && !(request.getParameter("ResultList")).equals("")){
		r_ResultList=  request.getParameter("ResultList");
	}
	
	if(request.getParameter("soll") != null && !(request.getParameter("soll")).equals("")){
		r_soll=  request.getParameter("soll");
	}
	
	if(request.getParameter("appeal_no") != null && !(request.getParameter("appeal_no")).equals("")){
		r_appeal_no=  request.getParameter("appeal_no");
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
<BODY onload="init()">
<%	
try {
        
        _2121_1471_461_101stmr1websvc1SOWNN002161SOWNN002161SOWNN002161wsdl1RequestTypeDATAMessageBody_6id.setMw_take_no(mw_take_no_7id);
        _2121_1471_461_101stmr1websvc1SOWNN002161SOWNN002161SOWNN002161wsdl1RequestTypeDATAMessage_5id.setBody(_2121_1471_461_101stmr1websvc1SOWNN002161SOWNN002161SOWNN002161wsdl1RequestTypeDATAMessageBody_6id);
        _2121_1471_461_101stmr1websvc1SOWNN002161SOWNN002161SOWNN002161wsdl1RequestTypeDATA_4id.setMessage(_2121_1471_461_101stmr1websvc1SOWNN002161SOWNN002161SOWNN002161wsdl1RequestTypeDATAMessage_5id);
        _2121_1471_461_101stmr1websvc1SOWNN002161SOWNN002161SOWNN002161wsdl1RequestType_0id.setMSGKEY(mSGKEY_1id);
        _2121_1471_461_101stmr1websvc1SOWNN002161SOWNN002161SOWNN002161wsdl1RequestType_0id.setRESULTCODE(rESULTCODE_2id);
        _2121_1471_461_101stmr1websvc1SOWNN002161SOWNN002161SOWNN002161wsdl1RequestType_0id.setORGCD(oRGCD_3id);
        _2121_1471_461_101stmr1websvc1SOWNN002161SOWNN002161SOWNN002161wsdl1RequestType_0id.setDATA(_2121_1471_461_101stmr1websvc1SOWNN002161SOWNN002161SOWNN002161wsdl1RequestTypeDATA_4id);
        _2121_1471_461_101stmr1websvc1SOWNN002161SOWNN002161SOWNN002161wsdl1RequestType_0id.setIFID(iFID_8id);
        
        _212._147._46._10.stmr.websvc.ws.SOWNN00216.wsdl.ResponseType SOWNN002162mtemp = sampleSOWNN00216PortTypeProxyid.SOWNN00216(_2121_1471_461_101stmr1websvc1SOWNN002161SOWNN002161SOWNN002161wsdl1RequestType_0id);

	if(SOWNN002162mtemp == null){
	//리턴객체가 존재하지 않는경우
%>
<FORM name="form1">
<INPUT TYPE="HIDDEN" NAME="resCode" VALUE="0">
<INPUT TYPE="HIDDEN" NAME="Result" VALUE="">
<INPUT TYPE="HIDDEN" NAME="page" VALUE="<%=r_page%>"> 
<INPUT TYPE="HIDDEN" NAME="block_page" VALUE="<%=r_block_page%>"> 
<INPUT TYPE="HIDDEN" NAME="searchCause" VALUE="<%=r_searchCause%>">
<INPUT TYPE="HIDDEN" NAME="SQL" VALUE="<%=r_SQL%>">
<INPUT TYPE="HIDDEN" NAME="Menu" VALUE="<%=r_menu%>">
<INPUT TYPE="HIDDEN" NAME="SubMenu" VALUE="<%=r_submenu%>">
<INPUT TYPE="HIDDEN" NAME="ResultList" VALUE="<%=r_ResultList%>">
</FORM>
<%
	
	}else{
		//리턴값이 존재하는 경우

		if(SOWNN002162mtemp != null){

			_212._147._46._10.stmr.websvc.ws.SOWNN00216.wsdl.ResponseTypeDATA tebece0=SOWNN002162mtemp.getDATA();
	
			if(tebece0 != null){
	
				_212._147._46._10.stmr.websvc.ws.SOWNN00216.wsdl.ResponseTypeDATAMessage tebece1=tebece0.getMessage();
		
				if(tebece1 != null){
		
					_212._147._46._10.stmr.websvc.ws.SOWNN00216.wsdl.ResponseTypeDATAMessageBodyList[] typebody15 = tebece1.getBody();
       	
        				java.util.List listbody15= java.util.Arrays.asList(typebody15);
         
          				int sizeOfList = listbody15.size();
          	
					
          	
	          			for(int z=0;z<sizeOfList;z++){  
	          	
	        					_212._147._46._10.stmr.websvc.ws.SOWNN00216.wsdl.ResponseTypeDATAMessageBodyList li = (_212._147._46._10.stmr.websvc.ws.SOWNN00216.wsdl.ResponseTypeDATAMessageBodyList)listbody15.get(z);
	         			
	         			
	         				take_cgg_code = li.getTake_cgg_code();
	           				take_dep_code  = li.getTake_dep_code();
			  				take_dep_nm  = li.getTake_dep_nm();
	           				take_ymd = li.getTake_ymd();
	           				take_tm = li.getTake_tm();
	           				take_se = li.getTake_se();
	           				take_gbn_cn = li.getTake_gbn_cn();
	           				wrkr_bup_no_one = li.getWrkr_bup_no_one();
	           				wrkr_bup_no_two = li.getWrkr_bup_no_two();
	           				susuryo_sum = li.getSusuryo_sum();
	           				take_man_dept_code = li.getTake_man_dept_code();
	           				take_man_dept_name = li.getTake_man_dept_name();
	           				dpp_usr_dept_code = li.getDpp_usr_dept_code();
	           				dpp_usr_dept_name = li.getDpp_usr_dept_name();
	           				duty_man_dept_code = li.getDuty_man_dept_code();
	           				duty_man_dept_name = li.getDuty_man_dept_name();
	           				take_stf_id = li.getTake_stf_id();
	           				take_man_name = li.getTake_man_name();
	           				info_prot_yn = li.getInfo_prot_yn();
	           				cgg_mw_afr_cl_no = li.getCgg_mw_afr_cl_no();	
	           				mw_se = li.getMw_se();
	           				mw_gbn_cn = li.getMw_gbn_cn();
	           				mw_kd = li.getMw_kd();
	           				kind_code_cn = li.getKind_code_cn();
	           				mw_notes = li.getMw_notes();	
	           				mw_regt_no = li.getMw_regt_no();
	           				deal_plan_ymd = li.getDeal_plan_ymd();
	           				deal_plan_daycnt = li.getDeal_plan_daycnt();
	           				court_daycnt = li.getCourt_daycnt();
	           				shrt_daycnt = li.getShrt_daycnt();	
	           				rel_pgm_nm = li.getRel_pgm_nm();
	           				rel_pgm_se = li.getRel_pgm_se();
	           				mw_afr_nm = li.getMw_afr_nm();
	           				mw_afr_shtnm = li.getMw_afr_shtnm();
	           				deal_fee = li.getDeal_fee();	
	           				adm_bsn_no = li.getAdm_bsn_no();
	           				mgt_org_se = li.getMgt_org_se();
	           				main_deal_dep_code = li.getMain_deal_dep_code();
	           				main_dep_nm = li.getMain_dep_nm();
	           				appl_mwin_se = li.getAppl_mwin_se();		
	           				mwin_gbn_cn = li.getMwin_gbn_cn();
	           				mw_aplct_sid = li.getMw_aplct_sid();
	           				mw_aplct_sid_sno = li.getMw_aplct_sid_sno();
	           				mw_aplct_nm = li.getMw_aplct_nm();
	           				mw_aplct_telno = li.getMw_aplct_telno();
	           				mw_aplct_hpno = li.getMw_aplct_hpno();
	           				mw_aplct_addr = li.getMw_aplct_addr();
	           				wrkr_bup_no = li.getWrkr_bup_no();
	           				wrkr_bup_nm = li.getWrkr_bup_nm();
	           				post_no = li.getPost_no();
	           				addr_se = li.getAddr_se();
	           				addr_gbn_cn = li.getAddr_gbn_cn();
	           				regn_code = li.getRegn_code();
	           				sido_nm = li.getSido_nm();
	           				cgg_nm = li.getCgg_nm();
	           				umd_nm = li.getUmd_nm();
	           				ri_nm = li.getRi_nm();
	           				san = li.getSan();
	           				bunji = li.getBunji();
	           				ho = li.getHo();
	           				tong = li.getTong();
	           				ban = li.getBan();
	           				spec_addr = li.getSpec_addr();
	           				spec_dng = li.getSpec_dng();
	           				spec_ho = li.getSpec_ho();
	           				appl_cnt = li.getAppl_cnt();
	           				agncy_sid = li.getAgncy_sid();
	           				agncy_sid_sno = li.getAgncy_sid_sno();
	           				agncy_nm = li.getAgncy_nm();
	           				agncy_telno = li.getAgncy_telno();
	           				agncy_addr = li.getAgncy_addr();
	           				aplct_rel = li.getAplct_rel();
	           				dpp_id = li.getDpp_id();
	           				dpp_usr_nm = li.getDpp_usr_nm();
	           				dpp_usr_telno = li.getDpp_usr_telno();
	           				deal_dutyp_id = li.getDeal_dutyp_id();
	           				duty_man_nm = li.getDuty_man_nm();
	           				real_deal_ymd = li.getReal_deal_ymd();
	           				deal_se = li.getDeal_se();
	           				deal_gbn_cn = li.getDeal_gbn_cn();
	           				fee_recpt_se = li.getFee_recpt_se();
	           				recpt_gbn_cn = li.getRecpt_gbn_cn();
	           				recpt_fee = li.getRecpt_fee();
	           				sndmny_am = li.getSndmny_am();
	           				restamt_rtn = li.getRestamt_rtn();
	           				recpt_dt = li.getRecpt_dt();
	           				deal_amt = li.getDeal_amt();
	           				take_tkit_issue_yn = li.getTake_tkit_issue_yn();
	           				take_gd_item = li.getTake_gd_item();
	           				pa_mw_rel_no = li.getPa_mw_rel_no();
	           				wic_cgg_code = li.getWic_cgg_code();
	           				wic_cgg_nm = li.getWic_cgg_nm();
	           				wic_dep_code = li.getWic_dep_code();
	           				wic_org_mw_take_no = li.getWic_org_mw_take_no();
	           				mw_prog_se = li.getMw_prog_se();
	           				mw_aplct_email = li.getMw_aplct_email();
	           				mw_aplct_pwd = li.getMw_aplct_pwd();
	           				deal_plan_tm = li.getDeal_plan_tm();
	           				real_deal_tm = li.getReal_deal_tm();
	           				first_deal_daycnt = li.getFirst_deal_daycnt();
	           				reg_ymd = li.getReg_ymd();
	           				reg_tm = li.getReg_tm();
	           				reg_dt = li.getReg_dt();
	           				sat_wrk_yn = li.getSat_wrk_yn();
	           				get_met = li.getGet_met();
	           				snd_fee = li.getSnd_fee();
	           				retn_bank_code = li.getRetn_bank_code();
	           				retn_bank_acc_no = li.getRetn_bank_acc_no();
	           				retn_bank_depr_nm = li.getRetn_bank_depr_nm();
	           				web_take_no = li.getWeb_take_no();
	           				appl_doc_url = li.getAppl_doc_url();
	           				get_regg_post_no = li.getGet_regg_post_no();
	           				get_regn_addr = li.getGet_regn_addr();
	           				first_mw_take_no = li.getFirst_mw_take_no();
	           				aplct_rel_code = li.getAplct_rel_code();
	           				bpm_yn = li.getBpm_yn();
	           				cnsl_sj = li.getCnsl_sj();
	           				deal_chr_id = li.getDeal_chr_id();
	           				deal_chr_nm = li.getDeal_chr_nm();
	           				dtl_cn = li.getDtl_cn();
	           				jnji_se = li.getJnji_se();
	           				law_tm = li.getLaw_tm();
	           				law_ymd = li.getLaw_ymd();
	           				mw_take_no = li.getMw_take_no();
	           				mw_take_no_one = li.getMw_take_no_one();
	           				mw_take_no_two = li.getMw_take_no_two();
	           				mw_take_no_three = li.getMw_take_no_three();
	           				sms_rprt_yn = li.getSms_rprt_yn();
	           				stf_cnt = li.getStf_cnt(); 
	           				
	           				res = res + "mw_take_no_7id=" + mw_take_no_7id + "::";
	           				res = res + "take_gbn_cn=" + take_gbn_cn + "::";
	           				res = res + "take_ymd=" + take_ymd + "::";
	           				res = res + "take_man_name=" + take_man_name +"::";
	           				res = res + "take_dep_nm=" + take_dep_nm + "::";
	           				res = res + "deal_plan_ymd=" + deal_plan_ymd + "::";
	           				res = res + "mw_gbn_cn=" + mw_gbn_cn + "::";
	           				res = res + "mw_aplct_nm=" + mw_aplct_nm + "::";
	           				res = res + "wrkr_bup_nm=" + wrkr_bup_nm +"::";
	           				res = res + "mw_aplct_sid=" + mw_aplct_sid +"::";
	           				res = res + "wrkr_bup_no=" + wrkr_bup_no +"::";
	           				res = res + "post_no=" + post_no+ "::";
	           				res = res + "sido_nm=" + sido_nm+ "::";
	           				res = res + "cgg_nm=" + cgg_nm+ "::";
	           				res = res + "umd_nm=" + umd_nm+ "::";
	           				res = res + "ri_nm=" + ri_nm+ "::";
	           				res = res + "san=" + san+ "::";
	           				res = res + "bunji=" + bunji+ "::";
	           				res = res + "ho=" + ho+ "::";
	           				res = res + "tong=" + tong+ "::";
	           				res = res + "ban=" + ban+ "::";
	           				res = res + "mw_aplct_telno=" + mw_aplct_telno+ "::";
	           				res = res + "mw_aplct_hpno=" + mw_aplct_hpno+ "::";
	           				res = res + "mw_notes=" + mw_notes+ "::";
	           				res = res + "agncy_nm=" + agncy_nm+ "::";
	           				res = res + "dpp_usr_nm=" + dpp_usr_nm+ "::";
	           				res = res + "take_stf_id=" + take_stf_id+ "::";
	           				res = res + "agncy_telno=" + agncy_telno + ":;";
	           				
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
<INPUT TYPE="HIDDEN" NAME="Menu" VALUE="<%=r_menu%>">
<INPUT TYPE="HIDDEN" NAME="SubMenu" VALUE="<%=r_submenu%>">
<INPUT TYPE="HIDDEN" NAME="soll" VALUE="<%=r_soll%>">
<INPUT TYPE="HIDDEN" NAME="ResultList" VALUE="<%=r_ResultList%>">
<INPUT TYPE="HIDDEN" NAME="appeal_no" VALUE="<%=r_appeal_no%>">
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
<INPUT TYPE="HIDDEN" NAME="Menu" VALUE="<%=r_menu%>">
<INPUT TYPE="HIDDEN" NAME="SubMenu" VALUE="<%=r_submenu%>">
<INPUT TYPE="HIDDEN" NAME="ResultList" VALUE="<%=r_ResultList%>">
</FORM>
<%		
}
%>
</BODY>
</HTML>