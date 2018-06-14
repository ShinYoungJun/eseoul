package main.java.gapan.jumyong.model;


import main.java.common.model.RoadsBaseBean;

public class jumyongBean extends RoadsBaseBean {
	
	private String NO 			= "";			// 열번호

	private String ADMIN_NO	= "";	// 점용관리번호
	private String ADMIN_NO2 = "";	
	
	private String TAX_DATE	= "";      // 과세일자
//	private String YEAR		= "";		//부과년도	
//	private String SUM_LASTYEAR	= "";  // 작년도 점용료
//	private String SUM_YEAR	= "";      // 현년도 점용료
//	private String SUM_ADJUST	= "";    // 조정 점용료	
	private String REQ_NO		= "";	// 민원접수번호
	private String REQ_DATE		= "";	// 접수일자_점용인정보
	private String REGDATE		= "";	// admin_base 최초등록일자
	private String PERIOD_TYPE	= "";
	private String TYPE			= "";	// 점용종류
	private String SECTION		= "";	// 점용구분
	private String OWNER_SET	= "";	// 소유자
	private String TAX_SET		= "";	//세입구분, TAX_SET_NAME
	private String PURPOSE_CD	= "";   // 점용목적
	private String ADDR	= "";   		// 주소
	/* 20130328 yjmoon 서울시 지자체 요구 사항 */
	private String SF_VALUE 	= "";	// 시설 물가액 
	private String BJ_CD		= "";	// 법정동 코드
	private String HJ_CD		= "";	// 행정동 코드
	private String SAN_CK		= "";	// 산체크
	private String BONBUN		= "";	// 번지
	private String BUBUN		= "";	// 호
	private	String TONG			= "";	// 통
	private String BAN			= "";	// 반
	private String NAME			= "";	// 민원인 이름, NAME
	private String MUL_FROMDATE	= "";	//점용 시작 기간
	private String MUL_TODATE 	= "";	//점용 종료기간
	private String CHECK_YN		= "";	//검토 여부
	private String TAX_YN		= "";	//부과 여부
	private String TYPE_NAME	="";	//점용종류
	private String SECTION_NAME	="";	//점용구분
	private String CHECK_NAME 	= "";
	private String BJ_NM		= "";		//법정동 이름
	private String TSEQ			= "";
//	private String UP_DATE		= "";		//갱신일자
//	private String TAX_SET_NAME	= "";	//세입구분 - 공통코드
	private String PURPOSE_CLASSNM = "";//목적코드 클래스 이름
	private String TAX_NO	= "";		//과세 번호
//	private int AREA_AFTER	= 0;		//점용면적
	private String TAX_YN_NAME	= "";	//부과여부
	
	
	// 2009.8.14 추가 start
	private String WITH_ADDR1   = ""; 
	private String SUM    		= ""; 
//	private String FROMDATE    	= ""; 
//	private String TODATE    	= ""; 
//	private String RATE    		= ""; 
//	private String PRICE    	= ""; 
	private String LAST_FROMDATE= ""; 
	private String LAST_TODATE  = "";
	private String SIDO   		= "";
	private String SIGUNGU		= "";
	private String SPC_CD 		= "";
	private String R_ID       	= "";
	private String GAPAN_NO   	= "";
	private String GAPAN_NO2  	= "";
//	private String OWNER_NAME 	= "";
	private String CLASS_NM   	= "";
	private String SORT_NM    	= "";
	private String GP_TYP     	= "";
	private String FT_TYP     	= "";
	private String WITH_ADDR  	= "";
	private String AREA       	= "";
//	private String SEQ        	= "";
//	private String CAL_SUM_SEQ	= "";
	private float AREA_AFTER_FLOAT;
	// 2009.8.14 추가 end
	
	private String PLACE_A		= "";	//점용면적 
	private String JIGA			= "";	//공시지가
	
	private String TAX_GUBUN		= "";
//	private String REDUCTION_RATE	= "";
//	private float SURCHARGE_RATE;
	private String OLD_RATE			= "";
	private String SIGU_CD     		= "";
	private String DEPT_CD     		= "";
	private String OBJ_SET     		= "";
	private String TAXPAYER_ID 		= "";
	private String TAXPAYER_SET		= "";
	private String OCR_SIGU_CD 		= "";
	private String OCR_BUSEO_CD		= "";
	private String TAX_CD      		= "";
	private String LIVE        		= "";
	private String ADD_SET     		= "";
	private String ADD_YN      		= "";
	private String SUBUSEO_CD  		= "";
//	private String REDUCTION_REASON = "";
	
	
	private String TAXTATION_AT		= "";
	
	private String MODE1_STATUS		= "";
	private String MODE2_STATUS		= "";
	private String MODE32_STATUS	= "";
	private String MODE33_STATUS	= "";
	private String SALE_STATUS		= "";
	
	private String VIO_ACCPOINTS	= "";
	
	private String VIO_CD_NAME = "";
	private String VIO_ACTCD_NAME = "";
	
	
	private String VIO_SEL1 = "";
	private String VIO_SEL2 = "";
	private String VIO_SEL3 = "";
	private String VIO_SEL4 = "";
	private String VIO_SEL5 = "";
	private String VIO_SEL6 = "";
	private String VIO_SEL7 = "";
	
	private String VIO_ACTSEL1 = "";
	private String VIO_ACTSEL2 = "";
	private String VIO_ACTSEL3 = "";
	private String VIO_ACTSEL4 = "";
	private String VIO_ACTSEL5 = "";
	
	
	private String SI = "";
	private String GUN = "";
	private String DORO_NM = "";
	private String BD_BON = "";
	private String BD_BU = "";
	private String BD_NM = "";
	private String BD_DET_NM = "";
	
	//********** BEGIN_KANG_20120420
	private String OWNER_TEL = "";
	private String OWNER_HP = "";
	//********** END_KANG_20120420
	//********** BEGIN_KANG_20120423
	private String Facility_No = "";
	//********** END_KANG_20120423
	
	/* 노점및보도상영업시설물 산출내력 정보 필드*/
	private String 		YEAR				= ""; 					// 산출 기준년도 
	private String 		SEQ  				= ""; 					// 일련번호
	private String 		PRICE  				= ""; 					// 공시지가
	private double 		AREA_BEFORE  		= 0d; 					// 변경전 면적
	private double 		AREA_AFTER  		= 0d; 					// 변경후 면적
	private String 		RATE  				= ""; 					// 요율
	private String 		SUM_LASTYEAR 		= "";					// 작년도 점용료
	private String 		SUM_YEAR  			= ""; 					// 현년도 점용료
	private String 		SUM_ADJUST  		= ""; 					// 조정 점용료
	private String 		VAT  				= ""; 					// 부가세
	private String 		FROMDATE  			= "";					// 산출적용기간 시작
	private String 		TODATE  			= "";					// 산출적용기간 끝
	private String 		FORM_ADJUST  		= "";					// 조정산출식
	private String 		FORM  				= "";					// 일반산출식
	private String 		UP_DATE  			= "";					// 갱신일자
	private String 		REASON  			= "";					// 변동사유
	private String 		LICENSE_TAX  		= ""; 					// 면허세
	private int 		PERIOD  			= -1; 					// 전체기간(달수)
	private String 		NOTES  				= "";					// 수시기간(비고)
	private String 		AMOUNT  			= "";					// 일시점용료
	private double 		ADJUSTMENT  		= -1d;					// 조정계수
	private String 		REDUCTION_RATE  	= "";					// 감면율
	private String 		REDUCTION_REASON	= "";					// 감면사유
	private float 		SURCHARGE_RATE  	= -1f;					// 과징율
	private String 		USE_SECTION  		= "";					// 부가유형
	private String 		FIRST_SEQ  			= "";  					// 최초점용 일련번호
	private String 		CAL_SUM_SEQ  		= ""; 					// 합계내역 일련번호
	private String 		PREV_SEQ  			= ""; 					// 기존물건 일련번호
	private String 		CAL_MODE  			= "";					// 산출목적
	
	/* End 산출내역 정보 */
	
	public String getSI() {
		return SI;
	}

	public String getFACILITY_NO() {
		return Facility_No;
	}

	public void setFACILITY_NO(String no) {
		Facility_No = no;
	}

	public String getOWNER_TEL() {
		return OWNER_TEL;
	}

	public void setOWNER_TEL(String oWNERTEL) {
		OWNER_TEL = oWNERTEL;
	}

	public String getOWNER_HP() {
		return OWNER_HP;
	}

	public void setOWNER_HP(String oWNERHP) {
		OWNER_HP = oWNERHP;
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

	public String getBD_NM() {
		return BD_NM;
	}

	public void setBD_NM(String bD_NM) {
		BD_NM = bD_NM;
	}

	public String getBD_DET_NM() {
		return BD_DET_NM;
	}

	public void setBD_DET_NM(String bD_DET_NM) {
		BD_DET_NM = bD_DET_NM;
	}

	public String getVIO_SEL1() {
		return VIO_SEL1;
	}

	public void setVIO_SEL1(String vIO_SEL1) {
		VIO_SEL1 = vIO_SEL1;
	}

	public String getVIO_SEL2() {
		return VIO_SEL2;
	}

	public void setVIO_SEL2(String vIO_SEL2) {
		VIO_SEL2 = vIO_SEL2;
	}

	public String getVIO_SEL3() {
		return VIO_SEL3;
	}

	public void setVIO_SEL3(String vIO_SEL3) {
		VIO_SEL3 = vIO_SEL3;
	}

	public String getVIO_SEL4() {
		return VIO_SEL4;
	}

	public void setVIO_SEL4(String vIO_SEL4) {
		VIO_SEL4 = vIO_SEL4;
	}

	public String getVIO_SEL5() {
		return VIO_SEL5;
	}

	public void setVIO_SEL5(String vIO_SEL5) {
		VIO_SEL5 = vIO_SEL5;
	}

	public String getVIO_SEL6() {
		return VIO_SEL6;
	}

	public void setVIO_SEL6(String vIO_SEL6) {
		VIO_SEL6 = vIO_SEL6;
	}

	public String getVIO_SEL7() {
		return VIO_SEL7;
	}

	public void setVIO_SEL7(String vIO_SEL7) {
		VIO_SEL7 = vIO_SEL7;
	}

	public String getVIO_ACTSEL1() {
		return VIO_ACTSEL1;
	}

	public void setVIO_ACTSEL1(String vIO_ACTSEL1) {
		VIO_ACTSEL1 = vIO_ACTSEL1;
	}

	public String getVIO_ACTSEL2() {
		return VIO_ACTSEL2;
	}

	public void setVIO_ACTSEL2(String vIO_ACTSEL2) {
		VIO_ACTSEL2 = vIO_ACTSEL2;
	}

	public String getVIO_ACTSEL3() {
		return VIO_ACTSEL3;
	}

	public void setVIO_ACTSEL3(String vIO_ACTSEL3) {
		VIO_ACTSEL3 = vIO_ACTSEL3;
	}

	public String getVIO_ACTSEL4() {
		return VIO_ACTSEL4;
	}

	public void setVIO_ACTSEL4(String vIO_ACTSEL4) {
		VIO_ACTSEL4 = vIO_ACTSEL4;
	}

	public String getVIO_ACTSEL5() {
		return VIO_ACTSEL5;
	}

	public void setVIO_ACTSEL5(String vIO_ACTSEL5) {
		VIO_ACTSEL5 = vIO_ACTSEL5;
	}

	public String getVIO_CD_NAME() {
		return VIO_CD_NAME;
	}

	public void setVIO_CD_NAME(String vIOCDNAME) {
		VIO_CD_NAME = vIOCDNAME;
	}

	public String getVIO_ACTCD_NAME() {
		return VIO_ACTCD_NAME;
	}

	public void setVIO_ACTCD_NAME(String vIOACTCDNAME) {
		VIO_ACTCD_NAME = vIOACTCDNAME;
	}

	public String getVIO_ACCPOINTS() {
		return VIO_ACCPOINTS;
	}

	public void setVIO_ACCPOINTS(String vIOACCPOINTS) {
		VIO_ACCPOINTS = vIOACCPOINTS;
	}

	public String getMODE1_STATUS() {
		return MODE1_STATUS;
	}

	public void setMODE1_STATUS(String mODE1STATUS) {
		MODE1_STATUS = mODE1STATUS;
	}

	public String getMODE2_STATUS() {
		return MODE2_STATUS;
	}

	public void setMODE2_STATUS(String mODE2STATUS) {
		MODE2_STATUS = mODE2STATUS;
	}

	public String getMODE32_STATUS() {
		return MODE32_STATUS;
	}

	public void setMODE32_STATUS(String mODE32STATUS) {
		MODE32_STATUS = mODE32STATUS;
	}

	public String getMODE33_STATUS() {
		return MODE33_STATUS;
	}

	public void setMODE33_STATUS(String mODE33STATUS) {
		MODE33_STATUS = mODE33STATUS;
	}

	public String getSALE_STATUS() {
		return SALE_STATUS;
	}

	public void setSALE_STATUS(String sALESTATUS) {
		SALE_STATUS = sALESTATUS;
	}

	public String getTAXTATION_AT() {
		return TAXTATION_AT;
	}

	public void setTAXTATION_AT(String tAXTATIONAT) {
		TAXTATION_AT = tAXTATIONAT;
	}

	public String getREDUCTION_REASON() {
		return REDUCTION_REASON;
	}

	public void setREDUCTION_REASON(String rEDUCTIONREASON) {
		REDUCTION_REASON = rEDUCTIONREASON;
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

	public String getSUBUSEO_CD() {
		return SUBUSEO_CD;
	}

	public void setSUBUSEO_CD(String sUBUSEOCD) {
		SUBUSEO_CD = sUBUSEOCD;
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

	public void setREDUCTION_RATE(String rate) {
		REDUCTION_RATE = rate;
	}
	
	public float getSURCHARGE_RATE() {
		return SURCHARGE_RATE;
	}

	public void setSURCHARGE_RATE(float rate) {
		SURCHARGE_RATE = rate;
	}

	public void setSURCHARGE_RATE(String rate) {
		setSURCHARGE_RATE(Float.parseFloat(rate));
	}

	public String getTAX_GUBUN() {
		return TAX_GUBUN;
	}

	public void setTAX_GUBUN(String tAXGUBUN) {
		TAX_GUBUN = tAXGUBUN;
	}

	public String getJIGA() {
		return JIGA;
	}

	public void setJIGA(String jIGA) {
		JIGA = jIGA;
	}

	public String getPLACE_A() {
		return PLACE_A;
	}

	public void setPLACE_A(String pLACEA) {
		PLACE_A = pLACEA;
	}

	public String getNO() {
		return NO;
	}

	public void setNO(String nO) {
		NO = nO;
	}

	public String getADDR() {
		return ADDR;
	}

	public void setADDR(String addr) {
		ADDR = addr;
	}

	public String getSF_VALUE() {
		return SF_VALUE;
	}
	
	public void setSF_VALUE(String value) {
		SF_VALUE = value;
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

	public double getAREA_AFTER() {
		return AREA_AFTER;
	}

	public void setAREA_AFTER(double area) {
		AREA_AFTER = area;
	}
	
	public void setAREA_AFTER(String area) {
		setAREA_AFTER(Double.parseDouble(area));
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

	public String getHJ_CD() {
		return HJ_CD;
	}

	public void setHJ_CD(String hj_cd) {
		HJ_CD = hj_cd;
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

	public String getOWNER_SET() {
		return OWNER_SET;
	}

	public void setOWNER_SET(String owner_set) {
		OWNER_SET = owner_set;
	}

	public String getPERIOD_TYPE() {
		return PERIOD_TYPE;
	}

	public void setPERIOD_TYPE(String period_type) {
		PERIOD_TYPE = period_type;
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
		return TAX_SET;
	}

	public void setTAX_SET_NAME(String tax_set_name) {
		TAX_SET = tax_set_name;
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

	public String getYEAR() {
		return YEAR;
	}

	public void setYEAR(String year) {
		YEAR = year;
	}

	public String getFROMDATE() {
		return FROMDATE;
	}

	public void setFROMDATE(String fromdate) {
		FROMDATE = fromdate;
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

	public String getPRICE() {
		return PRICE;
	}

	public void setPRICE(String price) {
		PRICE = price;
	}

	public String getRATE() {
		return RATE;
	}

	public void setRATE(String rate) {
		RATE = rate;
	}

	public void setRATE(double rate) {
		RATE = Double.toString(rate);
	}
	
	public String getSIDO() {
		return SIDO;
	}

	public void setSIDO(String sido) {
		SIDO = sido;
	}

	public String getSIGUNGU() {
		return SIGUNGU;
	}

	public void setSIGUNGU(String sigungu) {
		SIGUNGU = sigungu;
	}

	public String getSPC_CD() {
		return SPC_CD;
	}

	public void setSPC_CD(String spc_cd) {
		SPC_CD = spc_cd;
	}

	public String getSUM() {
		return SUM;
	}

	public void setSUM(String sum) {
		SUM = sum;
	}

	public String getTODATE() {
		return TODATE;
	}

	public void setTODATE(String todate) {
		TODATE = todate;
	}

	public String getWITH_ADDR1() {
		return WITH_ADDR1;
	}

	public void setWITH_ADDR1(String with_addr1) {
		WITH_ADDR1 = with_addr1;
	}

	public String getAREA() {
		return AREA;
	}

	public void setAREA(String area) {
		AREA = area;
	}

	public String getCAL_SUM_SEQ() {
		return CAL_SUM_SEQ;
	}

	public void setCAL_SUM_SEQ(String cal_sum_seq) {
		CAL_SUM_SEQ = cal_sum_seq;
	}

	public String getCLASS_NM() {
		return CLASS_NM;
	}

	public void setCLASS_NM(String class_nm) {
		CLASS_NM = class_nm;
	}

	public String getFT_TYP() {
		return FT_TYP;
	}

	public void setFT_TYP(String ft_typ) {
		FT_TYP = ft_typ;
	}

	public String getGAPAN_NO() {
		return GAPAN_NO;
	}

	public void setGAPAN_NO(String gapan_no) {
		GAPAN_NO = gapan_no;
	}

	public String getGAPAN_NO2() {
		return GAPAN_NO2;
	}

	public void setGAPAN_NO2(String gapan_no2) {
		GAPAN_NO2 = gapan_no2;
	}

	public String getGP_TYP() {
		return GP_TYP;
	}

	public void setGP_TYP(String gp_typ) {
		GP_TYP = gp_typ;
	}

	public String getOWNER_NAME() {
		return NAME;
	}

	public void setOWNER_NAME(String owner_name) {
		NAME = owner_name;
	}

	public String getR_ID() {
		return R_ID;
	}

	public void setR_ID(String r_id) {
		R_ID = r_id;
	}

	public String getSEQ() {
		return SEQ;
	}

	public void setSEQ(String seq) {
		SEQ = seq;
	}

	public String getSORT_NM() {
		return SORT_NM;
	}

	public void setSORT_NM(String sort_nm) {
		SORT_NM = sort_nm;
	}

	public String getWITH_ADDR() {
		return WITH_ADDR;
	}

	public void setWITH_ADDR(String with_addr) {
		WITH_ADDR = with_addr;
	}

	public float getAREA_AFTER_FLOAT() {
		return AREA_AFTER_FLOAT;
	}

	public void setAREA_AFTER_FLOAT(float area_after_float) {
		AREA_AFTER_FLOAT = area_after_float;
	}

	public void setAREA_AFTER_FLOAT(String area_after_float) {
		setAREA_AFTER_FLOAT(Float.parseFloat(area_after_float));
	}

	public double getAREA_BEFORE() {
		return AREA_BEFORE;
	}

	public void setAREA_BEFORE(double area) {
		AREA_BEFORE = area;
	}

	public void setAREA_BEFORE(String area) {
		setAREA_BEFORE(Double.parseDouble(area));
	}
	
	public String getVAT() {
		return VAT;
	}

	public void setVAT(String vAT) {
		VAT = vAT;
	}

	public String getFORM_ADJUST() {
		return FORM_ADJUST;
	}

	public void setFORM_ADJUST(String fORM_ADJUST) {
		FORM_ADJUST = fORM_ADJUST;
	}

	public String getFORM() {
		return FORM;
	}

	public void setFORM(String fORM) {
		FORM = fORM;
	}

	public String getREASON() {
		return REASON;
	}

	public void setREASON(String rEASON) {
		REASON = rEASON;
	}

	public String getLICENSE_TAX() {
		return LICENSE_TAX;
	}

	public void setLICENSE_TAX(String lICENSE_TAX) {
		LICENSE_TAX = lICENSE_TAX;
	}

	public int getPERIOD() {
		return PERIOD;
	}

	public void setPERIOD(int pERIOD) {
		PERIOD = pERIOD;
	}

	public void setPERIOD(String pERIOD) {
		setPERIOD(Integer.parseInt(pERIOD));
	}
	
	public String getNOTES() {
		return NOTES;
	}

	public void setNOTES(String nOTES) {
		NOTES = nOTES;
	}

	public String getAMOUNT() {
		return AMOUNT;
	}

	public void setAMOUNT(String aMOUNT) {
		AMOUNT = aMOUNT;
	}

	public double getADJUSTMENT() {
		return ADJUSTMENT;
	}

	public void setADJUSTMENT(double aDJUSTMENT) {
		ADJUSTMENT = aDJUSTMENT;
	}

	public void setADJUSTMENT(String aDJUSTMENT) {
		setADJUSTMENT(Double.parseDouble(aDJUSTMENT));
	}
	
	public String getUSE_SECTION() {
		return USE_SECTION;
	}

	public void setUSE_SECTION(String uSE_SECTION) {
		USE_SECTION = uSE_SECTION;
	}

	public String getFIRST_SEQ() {
		return FIRST_SEQ;
	}

	public void setFIRST_SEQ(String fIRST_SEQ) {
		FIRST_SEQ = fIRST_SEQ;
	}

	public String getPREV_SEQ() {
		return PREV_SEQ;
	}

	public void setPREV_SEQ(String pREV_SEQ) {
		PREV_SEQ = pREV_SEQ;
	}

	public String getCAL_MODE() {
		return CAL_MODE;
	}

	public void setCAL_MODE(String cAL_MODE) {
		CAL_MODE = cAL_MODE;
	}

	/**
	 * dummy result에는 있음.
	 * @param seq
	 */
	public void setVIO_SEQ(String seq) {
		
	}
}
