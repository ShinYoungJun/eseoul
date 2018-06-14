package main.java.jumyong.jumyong.model;


import main.java.common.model.RoadsBaseBean;

public class jumyongBean extends RoadsBaseBean {
	
	private String ADMIN_NO	= "";	// 점용관리번호
	private String ADMIN_NO2 = "";	// 뷰 용도 점용관리번호
	private String TAX_DATE	= "";      // 과세일자
	private String YEAR		= "";		//부과년도	
	private String SUM_LASTYEAR	= "";  // 작년도 점용료
	
	private String SUM_YEAR	= "";      // 현년도 점용료
	private String SUM_ADJUST	= "";    // 조정 점용료	
	private String REQ_NO		= "";	// 민원접수번호
	private String REQ_DATE		= "";	// 접수일자_점용인정보
	private String REGDATE		= "";	// admin_base 최초등록일자
	
	private String TYPE			= "";	// 점용종류
	private String SECTION		= "";	// 점용구분
	private String OWNER_SET	= "";	// 소유자
	private String TAX_SET		= "";	//세입구분	
	private String PURPOSE_CD	= "";   // 점용목적
	
	private String BJ_CD		= "";	// 법정동 코드
	private String HJ_CD		= "";	// 행정동 코드
	private String SAN_CK		= "";	// 산체크
	private String BONBUN		= "";	// 번지
	private String BUBUN		= "";	// 호
	
	private String ND_SID_NM		= "";	// 젤 큰 단위
	private String ND_SIGUNGU_NM	= "";	// 시군구
	private String ND_UMD_NM		= "";	// 동
	//private String ND_RI_NM			= "";	// 리
	 
	  
	
	private	String TONG			= "";	// 통
	private String BAN			= "";	// 반
	private String NAME			= "";	// 민원인 이름
	private String MUL_FROMDATE	= "";	//점용 시작 기간
	private String MUL_TODATE 	= "";	//점용 종료기간
	
	private String CHECK_YN		= "";	//검토 여부
	private String TAX_YN		= "";	//부과 여부
	private String TYPE_NAME	="";	//점용종류
	private String SECTION_NAME	="";	//점용구분
	private String CHECK_NAME = "";		//검토, 미검토
	
	private String BJ_NM	="";		//법정동 이름
	private String TSEQ ;				//세외수입 시퀀스
	private String UP_DATE;				//갱신일자
	private String TAX_SET_NAME;		//세입구분 - 공통코드
	private String PURPOSE_CLASSNM;		//목적코드 클래스 이름
	
	private String TAX_NO ;				//과세 번호
	private float AREA_AFTER;				//점용면적
	private String TAX_YN_NAME ;		//부과여부
	private String R_ID = "";			//순번
	
	//2009.8 추가 start
	private String WITH_ADDR1    = ""; 
	private String SUM    		= ""; 
	private String FROMDATE    	= ""; 
	private String TODATE    	= ""; 
	private String RATE    		= ""; 
	private String PRICE    	= ""; 
	private String LAST_FROMDATE = ""; 
	private String LAST_TODATE   = "";
	private String MOMEY 		= "";
	private String YOYUL			= "";
	// 2009.8 추가 end
	
	private String NO 			= "";
	//2009.09.02 추가 박기환
	
	private String FORM_ADJUST	= "";
	//2009.10.08 추가 박기환
	
	private float AREA ;
	private String TAX_GUBUN 	= "";
	private String ROAD_ADDR 	= "";
	private String JIGA 			= "";
	private String AREA_SIZE 	= "";
	
	private String SSN 					= "";	
	private String ADDR					= "";
	private String ADDR_NEW					= "";
	private String GIGAN				= "";
	private String BEFORE_PERMISSION	="";
	
	public String SEQ			= "";
	public String SIGU_CD		= "";
	public String DEPT_CD		= "";
	public String OBJ_SET		= "";
	public String TAXPAYER_ID	= "";
	public String TAXPAYER_SET	= "";
	public String OCR_SIGU_CD	= "";
	public String OCR_BUSEO_CD	= "";
	public String TAX_CD		= "";
	public String LIVE			= "";
	public String ADD_SET		= "";
	public String ADD_YN		= "";
	public String OLD_RATE		= "";
	public String REDUCTION_RATE= "";
	public String SUBUSEO_CD	= "";
	public String REDUCTION_REASON="";
	public String MAX_TAX_NO	= "";
	public float SURCHARGE_RATE;
	public String VAT			= "";
	public String TAXNAME	= "";
	
	public String REDUCTION_SUM = "";
	public String REDUCTION_FORM = "";
	
	public String WSP_YN = "";
	public String WITH_SUM_PRICE = "";
	
	public String WITH_XML = "";
	public String WITH_ADDR2 = "";
	
	public String BIZSSN = "";
	public String BIZ_STATUS = "";
	public String BIZ_TYPES = "";
	
	public String OLD_PRICE = "";
	public float OLD_AREA_SIZE = 0;
	
	public String OVERTAX = "";
	
	public String ADJUSTMENT = "";
	public String FORM = "";
	private String POST = "";
	
	
	private String APPEAL_REFERENCE = "";
	private String PARTLY_PERIOD = "";
	private String PLACE_REFERENCE = "";
	
	
	
	private String TEL = "";
	private String HP = ""; 
	
	private String EMAIL = "";
	
	private String PERCENT_RATE = "";
	private String PERCENT_REASON = ""; 
	 
	private String ND_RI_NM = "";
	
	private String  SI     = "";
	private String  GUN     = "";
	private String  DORO_NM     = "";
	private String  BD_BON     = "";
	private String  BD_BU     = "";
	private String  BD_NM     = "";
	private String  BD_DET_NM     = ""; 
	
	private String TOSI		= "";
	private String TOGUN		= "";
	private String TO_DORO_NM		= "";
	private String TO_BD_NM		= "";
	
	private String TO_BD_BON		= "";
	private String TO_BD_BU		= "";
	
	//********** BEGIN_KANG_20120710
	private String EXPONENT		= "";
	private String BUSINESSADDR		= "";
	private String COMPANY_NAME		= "";
	//********** END_KANG_20120710

	// 20150525
	private String SONGDALGI		= "";
	private String JUMYONGJI_DORO_ADDR = "";
	
	// 20151001 mihong
	private String TOPOST		= "";
	// 20160202 kny
	private String OWNER_SET_NM = ""; // 점용지 소유명
	
	public String getOWNER_SET_NM() {
		return OWNER_SET_NM;
	}

	public void setOWNER_SET_NM(String oWNERSETNM) {
		OWNER_SET_NM = oWNERSETNM;
	}

	public String getTOPOST() {
		return TOPOST;
	}
	
	public void setTOPOST(String tOPOST) {
		TOPOST = tOPOST;
	}
	
	public String getSONGDALGI() {
		return SONGDALGI;
	}
	public void setSONGDALGI(String sONGDALGI) {
		SONGDALGI = sONGDALGI;
	}
	public String getJUMYONGJI_DORO_ADDR() {
		return JUMYONGJI_DORO_ADDR;
	}
	public void setJUMYONGJI_DORO_ADDR(String jUMYONGJIDOROADDR) {
		JUMYONGJI_DORO_ADDR = jUMYONGJIDOROADDR;
	}
	public String getTO_BD_BON() {
		return TO_BD_BON;
	}
	public String getEXPONENT() {
		return EXPONENT;
	}
	public void setEXPONENT(String eXPONENT) {
		EXPONENT = eXPONENT;
	}
	public String getBUSINESSADDR() {
		return BUSINESSADDR;
	}
	public void setBUSINESSADDR(String bUSINESSADDR) {
		BUSINESSADDR = bUSINESSADDR;
	}
	public String getCOMPANY_NAME() {
		return COMPANY_NAME;
	}
	public void setCOMPANY_NAME(String cOMPANYNAME) {
		COMPANY_NAME = cOMPANYNAME;
	}
	public void setTO_BD_BON(String tO_BD_BON) {
		TO_BD_BON = tO_BD_BON;
	}
	public String getTO_BD_BU() {
		return TO_BD_BU;
	}
	public void setTO_BD_BU(String tO_BD_BU) {
		TO_BD_BU = tO_BD_BU;
	}
	public String getTOSI() {
		return TOSI;
	}
	public void setTOSI(String tOSI) {
		TOSI = tOSI;
	}
	public String getTOGUN() {
		return TOGUN;
	}
	public void setTOGUN(String tOGUN) {
		TOGUN = tOGUN;
	}
	public String getTO_DORO_NM() {
		return TO_DORO_NM;
	}
	public void setTO_DORO_NM(String tO_DORO_NM) {
		TO_DORO_NM = tO_DORO_NM;
	}
	public String getTO_BD_NM() {
		return TO_BD_NM;
	}
	public void setTO_BD_NM(String tO_BD_NM) {
		TO_BD_NM = tO_BD_NM;
	}
	public String getSI() {
		return SI;
	}
	public void setSI(String sI) {
		SI = sI;
	}
	public String getGUN() {
		return GUN;
	}
	public void setGUN(String gUN) {
		GUN = gUN;
	}
	public String getBD_DET_NM() {
		return BD_DET_NM;
	}
	public void setBD_DET_NM(String bD_DET_NM) {
		BD_DET_NM = bD_DET_NM;
	}
	public String getBD_NM() {
		return BD_NM;
	}
	public void setBD_NM(String bD_NM) {
		BD_NM = bD_NM;
	}
	public String getND_RI_NM() {
		return ND_RI_NM;
	}
	public void setND_RI_NM(String nD_RI_NM) {
		ND_RI_NM = nD_RI_NM;
	}
	public String getDORO_NM() {
		return DORO_NM;
	}
	public void setDORO_NM(String dORO_NM) {
		DORO_NM = dORO_NM;
	}
	public String getBD_BON() {
		return BD_BON;
	}
	public void setBD_BON(String bD_BON) {
		BD_BON = bD_BON;
	}
	public String getBD_BU() {
		return BD_BU;
	}
	public void setBD_BU(String bD_BU) {
		BD_BU = bD_BU;
	}
	public String getND_SID_NM() {
		return ND_SID_NM;
	}
	public void setND_SID_NM(String nD_SID_NM) {
		ND_SID_NM = nD_SID_NM;
	}
	public String getND_SIGUNGU_NM() {
		return ND_SIGUNGU_NM;
	}
	public void setND_SIGUNGU_NM(String nD_SIGUNGU_NM) {
		ND_SIGUNGU_NM = nD_SIGUNGU_NM;
	}
	public String getND_UMD_NM() {
		return ND_UMD_NM;
	}
	public void setND_UMD_NM(String nD_UMD_NM) {
		ND_UMD_NM = nD_UMD_NM;
	}
	 
	public String getADDR_NEW() {
		return ADDR_NEW;
	}
	public void setADDR_NEW(String aDDR_NEW) {
		ADDR_NEW = aDDR_NEW;
	}
	public String getPERCENT_RATE() {
		return PERCENT_RATE;
	}
	public void setPERCENT_RATE(String pERCENT_RATE) {
		PERCENT_RATE = pERCENT_RATE;
	}
	public String getPERCENT_REASON() {
		return PERCENT_REASON;
	}
	public void setPERCENT_REASON(String pERCENT_REASON) {
		PERCENT_REASON = pERCENT_REASON;
	}
	public String getEMAIL() {
		return EMAIL;
	}
	public void setEMAIL(String eMAIL) {
		EMAIL = eMAIL;
	}
	public String getTEL() {
		return TEL;
	}
	public void setTEL(String tEL) {
		TEL = tEL;
	}
	public String getHP() {
		return HP;
	}
	public void setHP(String hP) {
		HP = hP;
	}
	public String getAPPEAL_REFERENCE() {
		return APPEAL_REFERENCE;
	}
	public void setAPPEAL_REFERENCE(String aPPEALREFERENCE) {
		APPEAL_REFERENCE = aPPEALREFERENCE;
	}
	public String getPARTLY_PERIOD() {
		return PARTLY_PERIOD;
	}
	public void setPARTLY_PERIOD(String pARTLYPERIOD) {
		PARTLY_PERIOD = pARTLYPERIOD;
	}
	public String getPLACE_REFERENCE() {
		return PLACE_REFERENCE;
	}
	public void setPLACE_REFERENCE(String pLACEREFERENCE) {
		PLACE_REFERENCE = pLACEREFERENCE;
	}
	public String getPOST() {
		return POST;
	}
	public void setPOST(String pOST) {
		POST = pOST;
	}
	public String getFORM() {
		return FORM;
	}
	public void setFORM(String fORM) {
		FORM = fORM;
	}
	public String getADJUSTMENT() {
		return ADJUSTMENT;
	}
	public void setADJUSTMENT(String aDJUSTMENT) {
		ADJUSTMENT = aDJUSTMENT;
	}
	public String getOVERTAX() {
		return OVERTAX;
	}
	public void setOVERTAX(String oVERTAX) {
		OVERTAX = oVERTAX;
	}
	public String getOLD_PRICE() {
		return OLD_PRICE;
	}
	public void setOLD_PRICE(String oLDPRICE) {
		OLD_PRICE = oLDPRICE;
	}
	public float getOLD_AREA_SIZE() {
		return OLD_AREA_SIZE;
	}
	public void setOLD_AREA_SIZE(float oLDAREASIZE) {
		OLD_AREA_SIZE = oLDAREASIZE;
	}
	public String getBIZSSN() {
		return BIZSSN;
	}
	public void setBIZSSN(String bIZSSN) {
		BIZSSN = bIZSSN;
	}
	public String getBIZ_STATUS() {
		return BIZ_STATUS;
	}
	public void setBIZ_STATUS(String bIZSTATUS) {
		BIZ_STATUS = bIZSTATUS;
	}
	public String getBIZ_TYPES() {
		return BIZ_TYPES;
	}
	public void setBIZ_TYPES(String bIZTYPES) {
		BIZ_TYPES = bIZTYPES;
	}
	public String getWITH_XML() {
		return WITH_XML;
	}
	public void setWITH_XML(String wITHXML) {
		WITH_XML = wITHXML;
	}
	public String getWITH_ADDR2() {
		return WITH_ADDR2;
	}
	public void setWITH_ADDR2(String wITHADDR2) {
		WITH_ADDR2 = wITHADDR2;
	}
	public String getWSP_YN() {
		return WSP_YN;
	}
	public void setWSP_YN(String wSPYN) {
		WSP_YN = wSPYN;
	}
	public String getWITH_SUM_PRICE() {
		return WITH_SUM_PRICE;
	}
	public void setWITH_SUM_PRICE(String wITHSUMPRICE) {
		WITH_SUM_PRICE = wITHSUMPRICE;
	}
	public String getREDUCTION_SUM() {
		return REDUCTION_SUM;
	}
	public void setREDUCTION_SUM(String rEDUCTIONSUM) {
		REDUCTION_SUM = rEDUCTIONSUM;
	}
	public String getREDUCTION_FORM() {
		return REDUCTION_FORM;
	}
	public void setREDUCTION_FORM(String rEDUCTIONFORM) {
		REDUCTION_FORM = rEDUCTIONFORM;
	}
	public String getVAT() {
		return VAT;
	}
	public String getTAXNAME() {
		return TAXNAME;
	}
	public void setTAXNAME(String tAXNAME) {
		TAXNAME = tAXNAME;
	}
	public void setVAT(String vAT) {
		VAT = vAT;
	}
	public float getSURCHARGE_RATE() {
		return SURCHARGE_RATE;
	}
	public void setSURCHARGE_RATE(float sURCHARGERATE) {
		SURCHARGE_RATE = sURCHARGERATE;
	}
	public String getMAX_TAX_NO() {
		return MAX_TAX_NO;
	}
	public void setMAX_TAX_NO(String mAXTAXNO) {
		MAX_TAX_NO = mAXTAXNO;
	}
	public String getREDUCTION_REASON() {
		return REDUCTION_REASON;
	}
	public void setREDUCTION_REASON(String rEDUCTIONREASON) {
		REDUCTION_REASON = rEDUCTIONREASON;
	}
	public String getSEQ() {
		return SEQ;
	}
	public void setSEQ(String sEQ) {
		SEQ = sEQ;
	}
	public String getSIGU_CD() {
		return SIGU_CD;
	}
	public void setSIGU_CD(String sIGUCD) {
		SIGU_CD = sIGUCD;
	}
	public String getDEPT_CD() {
		return DEPT_CD;
	}
	public void setDEPT_CD(String dEPTCD) {
		DEPT_CD = dEPTCD;
	}
	public String getOBJ_SET() {
		return OBJ_SET;
	}
	public void setOBJ_SET(String oBJSET) {
		OBJ_SET = oBJSET;
	}
	public String getTAXPAYER_ID() {
		return TAXPAYER_ID;
	}
	public void setTAXPAYER_ID(String tAXPAYERID) {
		TAXPAYER_ID = tAXPAYERID;
	}
	public String getTAXPAYER_SET() {
		return TAXPAYER_SET;
	}
	public void setTAXPAYER_SET(String tAXPAYERSET) {
		TAXPAYER_SET = tAXPAYERSET;
	}
	public String getOCR_SIGU_CD() {
		return OCR_SIGU_CD;
	}
	public void setOCR_SIGU_CD(String oCRSIGUCD) {
		OCR_SIGU_CD = oCRSIGUCD;
	}
	public String getOCR_BUSEO_CD() {
		return OCR_BUSEO_CD;
	}
	public void setOCR_BUSEO_CD(String oCRBUSEOCD) {
		OCR_BUSEO_CD = oCRBUSEOCD;
	}
	public String getTAX_CD() {
		return TAX_CD;
	}
	public void setTAX_CD(String tAXCD) {
		TAX_CD = tAXCD;
	}
	public String getLIVE() {
		return LIVE;
	}
	public void setLIVE(String lIVE) {
		LIVE = lIVE;
	}
	public String getADD_SET() {
		return ADD_SET;
	}
	public void setADD_SET(String aDDSET) {
		ADD_SET = aDDSET;
	}
	public String getADD_YN() {
		return ADD_YN;
	}
	public void setADD_YN(String aDDYN) {
		ADD_YN = aDDYN;
	}
	public String getOLD_RATE() {
		return OLD_RATE;
	}
	public void setOLD_RATE(String oLDRATE) {
		OLD_RATE = oLDRATE;
	}
	public String getREDUCTION_RATE() {
		return REDUCTION_RATE;
	}
	public void setREDUCTION_RATE(String rEDUCTIONRATE) {
		REDUCTION_RATE = rEDUCTIONRATE;
	}
	public String getSUBUSEO_CD() {
		return SUBUSEO_CD;
	}
	public void setSUBUSEO_CD(String sUBUSEOCD) {
		SUBUSEO_CD = sUBUSEOCD;
	}
	public String getSSN() {
		return SSN;
	}
	public void setSSN(String sSN) {
		SSN = sSN;
	}
	public String getADDR() { 
		return ADDR;
	}
	public void setADDR(String aDDR) { 
		ADDR = aDDR;
	}
	public String getGIGAN() {
		return GIGAN;
	}
	public void setGIGAN(String gIGAN) {
		GIGAN = gIGAN;
	}
	public String getBEFORE_PERMISSION() {
		return BEFORE_PERMISSION;
	}
	public void setBEFORE_PERMISSION(String bEFOREPERMISSION) {
		BEFORE_PERMISSION = bEFOREPERMISSION;
	}
	public String getAREA_SIZE() {
		return AREA_SIZE;
	}
	public void setAREA_SIZE(String aREASIZE) {
		AREA_SIZE = aREASIZE;
	}
	public String getJIGA() {
		return JIGA;
	}
	public void setJIGA(String jIGA) {
		JIGA = jIGA;
	}
	public String getROAD_ADDR() {
		//System.out.println("!!! getROAD_ADDR");
		//System.out.println("2 getROAD_ADDR");
		return ROAD_ADDR;
	}
	public void setROAD_ADDR(String rOADADDR) {
		//System.out.println("!!! setROAD_ADDR");
		//System.out.println("2 setROAD_ADDR");
		ROAD_ADDR = rOADADDR;
	}
	
	
	public String getTAX_GUBUN() {
		return TAX_GUBUN;
	}
	public void setTAX_GUBUN(String tAXGUBUN) {
		TAX_GUBUN = tAXGUBUN;
	}
	public float getAREA() {
		return AREA;
	}
	public void setAREA(float aREA) {
		AREA = aREA;
	}
	public String getFORM_ADJUST() {
		return FORM_ADJUST;
	}
	public void setFORM_ADJUST(String fORMADJUST) {
		FORM_ADJUST = fORMADJUST;
	}
	public String getADMIN_NO() {
		return ADMIN_NO;
	}
	public void setADMIN_NO(String admin_no) {
		ADMIN_NO = admin_no;
	}
	public String getADMIN_NO2() {
		return ADMIN_NO2;
	}
	public void setADMIN_NO2(String admin_no2) {
		ADMIN_NO2 = admin_no2;
	}
	public float getAREA_AFTER() {
		return AREA_AFTER;
	}
	public void setAREA_AFTER(float area_after) {
		AREA_AFTER = area_after;
	}
	public String getBAN() {
		return BAN;
	}
	public void setBAN(String ban) {
		BAN = ban;
	}
	public String getBJ_CD() {
		return BJ_CD;
	}
	public void setBJ_CD(String bj_cd) {
		BJ_CD = bj_cd;
	}
	public String getBJ_NM() {
		return BJ_NM;
	}
	public void setBJ_NM(String bj_nm) {
		BJ_NM = bj_nm;
	}
	public String getBONBUN() {
		return BONBUN;
	}
	public void setBONBUN(String bonbun) {
		BONBUN = bonbun;
	}
	public String getBUBUN() {
		return BUBUN;
	}
	public void setBUBUN(String bubun) {
		BUBUN = bubun;
	}
	public String getCHECK_NAME() {
		return CHECK_NAME;
	}
	public void setCHECK_NAME(String check_name) {
		CHECK_NAME = check_name;
	}
	public String getCHECK_YN() {
		return CHECK_YN;
	}
	public void setCHECK_YN(String check_yn) {
		CHECK_YN = check_yn;
	}
	public String getFROMDATE() {
		return FROMDATE;
	}
	public void setFROMDATE(String fromdate) {
		FROMDATE = fromdate;
	}
	public String getHJ_CD() {
		return HJ_CD;
	}
	public void setHJ_CD(String hj_cd) {
		HJ_CD = hj_cd;
	}
	public String getLAST_FROMDATE() {
		return LAST_FROMDATE;
	}
	public void setLAST_FROMDATE(String last_fromdate) {
		LAST_FROMDATE = last_fromdate;
	}
	public String getLAST_TODATE() {
		return LAST_TODATE;
	}
	public void setLAST_TODATE(String last_todate) {
		LAST_TODATE = last_todate;
	}
	public String getMUL_FROMDATE() {
		return MUL_FROMDATE;
	}
	public void setMUL_FROMDATE(String mul_fromdate) {
		MUL_FROMDATE = mul_fromdate;
	}
	public String getMUL_TODATE() {
		return MUL_TODATE;
	}
	public void setMUL_TODATE(String mul_todate) {
		MUL_TODATE = mul_todate;
	}
	public String getNAME() {
		return NAME;
	}
	public void setNAME(String name) {
		NAME = name;
	}
	public String getNO() {
		return NO;
	}
	public void setNO(String no) {
		NO = no;
	}
	public String getOWNER_SET() {
		return OWNER_SET;
	}
	public void setOWNER_SET(String owner_set) {
		OWNER_SET = owner_set;
	}
	public String getPRICE() {
		return PRICE;
	}
	public void setPRICE(String price) {
		PRICE = price;
	}
	public String getPURPOSE_CD() {
		return PURPOSE_CD;
	}
	public void setPURPOSE_CD(String purpose_cd) {
		PURPOSE_CD = purpose_cd;
	}
	public String getPURPOSE_CLASSNM() {
		return PURPOSE_CLASSNM;
	}
	public void setPURPOSE_CLASSNM(String purpose_classnm) {
		PURPOSE_CLASSNM = purpose_classnm;
	}
	public String getR_ID() {
		return R_ID;
	}
	public void setR_ID(String r_id) {
		R_ID = r_id;
	}
	public String getRATE() {
		return RATE;
	}
	public void setRATE(String rate) {
		RATE = rate;
	}
	public String getREGDATE() {
		return REGDATE;
	}
	public void setREGDATE(String regdate) {
		REGDATE = regdate;
	}
	public String getREQ_DATE() {
		return REQ_DATE;
	}
	public void setREQ_DATE(String req_date) {
		REQ_DATE = req_date;
	}
	public String getREQ_NO() {
		return REQ_NO;
	}
	public void setREQ_NO(String req_no) {
		REQ_NO = req_no;
	}
	public String getSAN_CK() {
		return SAN_CK;
	}
	public void setSAN_CK(String san_ck) {
		SAN_CK = san_ck;
	}
	public String getSECTION() {
		return SECTION;
	}
	public void setSECTION(String section) {
		SECTION = section;
	}
	public String getSECTION_NAME() {
		return SECTION_NAME;
	}
	public void setSECTION_NAME(String section_name) {
		SECTION_NAME = section_name;
	}
	public String getSUM() {
		return SUM;
	}
	public void setSUM(String sum) {
		SUM = sum;
	}
	public String getSUM_ADJUST() {
		return SUM_ADJUST;
	}
	public void setSUM_ADJUST(String sum_adjust) {
		SUM_ADJUST = sum_adjust;
	}
	public String getSUM_LASTYEAR() {
		return SUM_LASTYEAR;
	}
	public void setSUM_LASTYEAR(String sum_lastyear) {
		SUM_LASTYEAR = sum_lastyear;
	}
	public String getSUM_YEAR() {
		return SUM_YEAR;
	}
	public void setSUM_YEAR(String sum_year) {
		SUM_YEAR = sum_year;
	}
	public String getTAX_DATE() {
		return TAX_DATE;
	}
	public void setTAX_DATE(String tax_date) {
		TAX_DATE = tax_date;
	}
	public String getTAX_NO() {
		return TAX_NO;
	}
	public void setTAX_NO(String tax_no) {
		TAX_NO = tax_no;
	}
	public String getTAX_SET() {
		return TAX_SET;
	}
	public void setTAX_SET(String tax_set) {
		TAX_SET = tax_set;
	}
	public String getTAX_SET_NAME() {
		return TAX_SET_NAME;
	}
	public void setTAX_SET_NAME(String tax_set_name) {
		TAX_SET_NAME = tax_set_name;
	}
	public String getTAX_YN() {
		return TAX_YN;
	}
	public void setTAX_YN(String tax_yn) {
		TAX_YN = tax_yn;
	}
	public String getTAX_YN_NAME() {
		return TAX_YN_NAME;
	}
	public void setTAX_YN_NAME(String tax_yn_name) {
		TAX_YN_NAME = tax_yn_name;
	}
	public String getTODATE() {
		return TODATE;
	}
	public void setTODATE(String todate) {
		TODATE = todate;
	}
	public String getTONG() {
		return TONG;
	}
	public void setTONG(String tong) {
		TONG = tong;
	}
	public String getTSEQ() {
		return TSEQ;
	}
	public void setTSEQ(String tseq) {
		TSEQ = tseq;
	}
	public String getTYPE() {
		return TYPE;
	}
	public void setTYPE(String type) {
		TYPE = type;
	}
	public String getTYPE_NAME() {
		return TYPE_NAME;
	}
	public void setTYPE_NAME(String type_name) {
		TYPE_NAME = type_name;
	}
	public String getUP_DATE() {
		return UP_DATE;
	}
	public void setUP_DATE(String up_date) {
		UP_DATE = up_date;
	}
	public String getWITH_ADDR1() {
		return WITH_ADDR1;
	}
	public void setWITH_ADDR1(String with_addr1) {
		WITH_ADDR1 = with_addr1;
	}
	public String getYEAR() {
		return YEAR;
	}
	public void setYEAR(String year) {
		YEAR = year;
	}
	public String getMOMEY() {
		return MOMEY;
	}
	public void setMOMEY(String momey) {
		MOMEY = momey;
	}
	public String getYOYUL() {
		return YOYUL;
	}
	public void setYOYUL(String yoyul) {
		YOYUL = yoyul;
	}
	
		
}
