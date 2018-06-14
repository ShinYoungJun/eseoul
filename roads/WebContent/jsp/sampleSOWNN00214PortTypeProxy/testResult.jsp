<%@page contentType="text/html;charset=euc-kr"%>
<%request.setCharacterEncoding("euc-kr");%>

<jsp:useBean id="BoardBean" scope="session" class="main.java.admin.model.BoardBean" />
<jsp:useBean id="AreaCodeBean" scope="session" class="main.java.admin.model.AreaCodeBean" />

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
	f.action="testOutput.jsp";
	f.submit();
	
}
-->
</script>
</HEAD>
<BODY onload="init();">
<%	
try{
		System.out.println("iFID_16id="+ iFID_16id);
		
		BoardBean.setPUBLIC_NM("전체공지");
		BoardBean.setCONTENT("내용");
		BoardBean.setFILE_NAME("파일명");
		BoardBean.setNOTICE_FROMDATE("20090101");
        
		String SOWNN002142mtemp = "ksldj";
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
						
			AreaCodeBean.setAREA_CD(BoardBean.getPUBLIC_NM());
			AreaCodeBean.setGU_NM(BoardBean.getCONTENT());
			AreaCodeBean.setHJ_NM(BoardBean.getFILE_NAME());
			AreaCodeBean.setSI_NM(BoardBean.getNOTICE_FROMDATE());
			
			String a = AreaCodeBean.getAREA_CD();
			String b = AreaCodeBean.getGU_NM();
			String c = AreaCodeBean.getHJ_NM();
			String d = AreaCodeBean.getSI_NM();
			
			res = res + "a= " + a+ "::";
			res = res + "b= " + b + "::";
			res = res + "c= " + c +  "::";
			res = res + "d= " + d + "::";			
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