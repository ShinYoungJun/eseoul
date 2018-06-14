package main.java.jumyong.jumyong.model;


import main.java.common.model.RoadsBaseBean;

/**
 * @author Administrator
 *
 */
public class ProductBean extends RoadsBaseBean {
	private String ADMIN_NO		;
	private String YEAR			;
	private long PRICE			;	
	private String FROMDATE		;
	private String TODATE		;
	
	private String FORM			;
	private String FORM_ADJUST	;
	private String SEQ			;
	private String UP_DATE		;
	private float AREA_BEFORE	;
	
	private float AREA_AFTER	;
	private float RATE			;
	private int SUM_LASTYEAR	;
	private int SUM_YEAR		;
	private int SUM_ADJUST		;
	
	private float ADJUSTMENT	;
	private int PERIOD			;
	private int LICENSE_TAX		;
	private float REDUCTION_RATE = 0;
	private String	REDUCTION_REASON	= "";
	private float PERCENT_RATE = 0;
	private String	PERCENT_REASON	= "";
	
	private float SURCHARGE_RATE	;
	private String USE_SECTION		;
	private String LASTFROMDATE		;
	private String LASTTODATE		;
	private String FIRST_SEQ		;
	
	private String USE_SECTIONNAME 	;
	private String CAL_YEAR			;
	private String CAL_SUM_SEQ		;
	private int SUM					;
	private float AREA				;
	
	private String PREV_SEQ 		;
	private String CAL_STATUS		;
	private String TAX_SEQ			;
	private String TAX_YNNAME		;
	private String CAL_YN			;
	
	private String TAX_SET_NAME		;
	
	//2009.8.6 추가 start
	private String TAX_DATE		= "";
	private String INDATE 		= "";
	private String OVERDATE 	= "";
	private String OVERTAX 		= "";
	private String SIGU_CD      = "";
	private String BJ_CD        = "";
	private String TAX_NO       = "";
	private String DEPT_CD      = "";
	private String TAX_GUBUN    = "";
	private String TAX_YM       = "";
	private String OBJ_SET      = "";
	private String TAXPAYER_ID  = "";
	private String TAXPAYER_SET = "";
	private String LIVE         = "";
	private String ADD_SET      = "";
	private String ADD_YN       = "";
	private String NOTES        = "";
	private String LIMIT_SUM    = "";
	private String LIMIT_CNT    = "";
	private String RATE_CAUSE   = "";
	private String BONSE        = "";
	private String GIGUM        = "";
	private String GUKSE        = "";
	private String SISE         = "";
	private String GUSE         = "";
	private String VAT          = "";
	private String INTAX        = "";
	private String FORM1        = "";
	private String FORM2        = "";
	private String TAX_YN       = "";
	private String OCR_SIGU_CD  = "";
	private String OCR_BUSEO_CD = "";
	private String SUBUSEO_CD   = "";
	private String TAX_CD       = "";
	private String MAX_TAX_NO	= "";
	private String TSEQ			= "";
	private float AREA_ALL;
	// 2009.8.6 추가 end
	
	// 2009.9.8 추가 start
	private String GUBUN    		= "";
	private String WRITEDATE		= "";
	private String GUNGE    		= "";
	private String SAYU     		= "";
	private String WORK_ID  		= "";
	private String GU_CODE  		= "";
	private String R_ID				= "";
	private String GUNGE_FIX		= "";
	private String SAYU_FIX			= "";
	private String WORK_NM			= "";
	// 2009.9.8 추가 end
	private float YOYUL;
	private long MOMEY;
	private String SECTION			= "";
	private float AREA_SIZE;
	
	private String REDUCTION_FORM 	= "";
	private long REDUCTION_SUM;
	
	private String TYPE = "";
	
	private String WSP_YN = "";
	
	private String WITH_SUM_PRICE = "";
	
	
	private String PURPOSE_CD = "";
	
	private float OLD_REDUCTION_RATE = 0;
	private String	OLD_REDUCTION_REASON	= "";
	private float OLD_PERCENT_RATE = 0;
	private String	OLD_PERCENT_REASON	= "";
	
	public float getOLD_PERCENT_RATE() {
		return OLD_PERCENT_RATE;
	}
	public void setOLD_PERCENT_RATE(float oLD_PERCENT_RATE) {
		OLD_PERCENT_RATE = oLD_PERCENT_RATE;
	}
	public String getOLD_PERCENT_REASON() {
		return OLD_PERCENT_REASON;
	}
	public void setOLD_PERCENT_REASON(String oLD_PERCENT_REASON) {
		OLD_PERCENT_REASON = oLD_PERCENT_REASON;
	}
	public float getPERCENT_RATE() {
		return PERCENT_RATE;
	}
	public void setPERCENT_RATE(float pERCENT_RATE) {
		PERCENT_RATE = pERCENT_RATE;
	}
	public String getPERCENT_REASON() {
		return PERCENT_REASON;
	}
	public void setPERCENT_REASON(String pERCENT_REASON) {
		PERCENT_REASON = pERCENT_REASON;
	}
	public String getOLD_REDUCTION_REASON() {
		return OLD_REDUCTION_REASON;
	}
	public void setOLD_REDUCTION_REASON(String oLDREDUCTIONREASON) {
		OLD_REDUCTION_REASON = oLDREDUCTIONREASON;
	}
	public float getOLD_REDUCTION_RATE() {
		return OLD_REDUCTION_RATE;
	}
	public void setOLD_REDUCTION_RATE(float oLDREDUCTIONRATE) {
		OLD_REDUCTION_RATE = oLDREDUCTIONRATE;
	}

	public String getPURPOSE_CD() {
		return PURPOSE_CD;
	}
	public void setPURPOSE_CD(String pURPOSECD) {
		PURPOSE_CD = pURPOSECD;
	}
	public String getWSP_YN() {
		return WSP_YN;
	}
	public void setWSP_YN(String wSPYN) {
		WSP_YN = wSPYN;
	}
	public String getTYPE() {
		return TYPE;
	}
	public void setTYPE(String tYPE) {
		TYPE = tYPE;
	}
	public String getREDUCTION_FORM() {
		return REDUCTION_FORM;
	}
	public void setREDUCTION_FORM(String rEDUCTIONFORM) {
		REDUCTION_FORM = rEDUCTIONFORM;
	}
	public long getREDUCTION_SUM() {
		return REDUCTION_SUM;
	}
	public void setREDUCTION_SUM(long rEDUCTIONSUM) {
		REDUCTION_SUM = rEDUCTIONSUM;
	}
	public float getAREA_SIZE() {
		return AREA_SIZE;
	}
	public void setAREA_SIZE(float aREASIZE) {
		AREA_SIZE = aREASIZE;
	}

	public String getWITH_SUM_PRICE() {
		return WITH_SUM_PRICE;
	}
	public void setWITH_SUM_PRICE(String wITHSUMPRICE) {
		WITH_SUM_PRICE = wITHSUMPRICE;
	}
	public String getSECTION() {
		return SECTION;
	}
	public void setSECTION(String sECTION) {
		SECTION = sECTION;
	}
	public float getYOYUL() {
		return YOYUL;
	}
	public void setYOYUL(float yOYUL) {
		YOYUL = yOYUL;
	}
	public long getMOMEY() {
		return MOMEY;
	}
	public void setMOMEY(long mOMEY) {
		MOMEY = mOMEY;
	}
	private String CHECK_YN		= "";		//2009.08.28 추가 박기환
	
	public String getADD_SET() {
		return ADD_SET;
	}
	public void setADD_SET(String add_set) {
		ADD_SET = add_set;
	}
	public String getADD_YN() {
		return ADD_YN;
	}
	public void setADD_YN(String add_yn) {
		ADD_YN = add_yn;
	}
	public float getADJUSTMENT() {
		return ADJUSTMENT;
	}
	public void setADJUSTMENT(float adjustment) {
		ADJUSTMENT = adjustment;
	}
	public String getADMIN_NO() {
		return ADMIN_NO;
	}
	public void setADMIN_NO(String admin_no) {
		ADMIN_NO = admin_no;
	}
	public float getAREA() {
		return AREA;
	}
	public void setAREA(float area) {
		AREA = area;
	}
	public float getAREA_AFTER() {
		return AREA_AFTER;
	}
	public void setAREA_AFTER(float area_after) {
		AREA_AFTER = area_after;
	}
	public float getAREA_BEFORE() {
		return AREA_BEFORE;
	}
	public void setAREA_BEFORE(float area_before) {
		AREA_BEFORE = area_before;
	}
	public String getBJ_CD() {
		return BJ_CD;
	}
	public void setBJ_CD(String bj_cd) {
		BJ_CD = bj_cd;
	}
	public String getBONSE() {
		return BONSE;
	}
	public void setBONSE(String bonse) {
		BONSE = bonse;
	}
	public String getCAL_STATUS() {
		return CAL_STATUS;
	}
	public void setCAL_STATUS(String cal_status) {
		CAL_STATUS = cal_status;
	}
	public String getCAL_SUM_SEQ() {
		return CAL_SUM_SEQ;
	}
	public void setCAL_SUM_SEQ(String cal_sum_seq) {
		CAL_SUM_SEQ = cal_sum_seq;
	}
	public String getCAL_YEAR() {
		return CAL_YEAR;
	}
	public void setCAL_YEAR(String cal_year) {
		CAL_YEAR = cal_year;
	}
	public String getCAL_YN() {
		return CAL_YN;
	}
	public void setCAL_YN(String cal_yn) {
		CAL_YN = cal_yn;
	}
	public String getCHECK_YN() {
		return CHECK_YN;
	}
	public void setCHECK_YN(String check_yn) {
		CHECK_YN = check_yn;
	}
	public String getDEPT_CD() {
		return DEPT_CD;
	}
	public void setDEPT_CD(String dept_cd) {
		DEPT_CD = dept_cd;
	}
	public String getFIRST_SEQ() {
		return FIRST_SEQ;
	}
	public void setFIRST_SEQ(String first_seq) {
		FIRST_SEQ = first_seq;
	}
	public String getFORM() {
		return FORM;
	}
	public void setFORM(String form) {
		FORM = form;
	}
	public String getFORM_ADJUST() {
		return FORM_ADJUST;
	}
	public void setFORM_ADJUST(String form_adjust) {
		FORM_ADJUST = form_adjust;
	}
	public String getFORM1() {
		return FORM1;
	}
	public void setFORM1(String form1) {
		FORM1 = form1;
	}
	public String getFORM2() {
		return FORM2;
	}
	public void setFORM2(String form2) {
		FORM2 = form2;
	}
	public String getFROMDATE() {
		return FROMDATE;
	}
	public void setFROMDATE(String fromdate) {
		FROMDATE = fromdate;
	}
	public String getGIGUM() {
		return GIGUM;
	}
	public void setGIGUM(String gigum) {
		GIGUM = gigum;
	}
	public String getGUKSE() {
		return GUKSE;
	}
	public void setGUKSE(String gukse) {
		GUKSE = gukse;
	}
	public String getGUSE() {
		return GUSE;
	}
	public void setGUSE(String guse) {
		GUSE = guse;
	}
	public String getINDATE() {
		return INDATE;
	}
	public void setINDATE(String indate) {
		INDATE = indate;
	}
	public String getINTAX() {
		return INTAX;
	}
	public void setINTAX(String intax) {
		INTAX = intax;
	}
	public String getLASTFROMDATE() {
		return LASTFROMDATE;
	}
	public void setLASTFROMDATE(String lastfromdate) {
		LASTFROMDATE = lastfromdate;
	}
	public String getLASTTODATE() {
		return LASTTODATE;
	}
	public void setLASTTODATE(String lasttodate) {
		LASTTODATE = lasttodate;
	}
	public int getLICENSE_TAX() {
		return LICENSE_TAX;
	}
	public void setLICENSE_TAX(int license_tax) {
		LICENSE_TAX = license_tax;
	}
	public String getLIMIT_CNT() {
		return LIMIT_CNT;
	}
	public void setLIMIT_CNT(String limit_cnt) {
		LIMIT_CNT = limit_cnt;
	}
	public String getLIMIT_SUM() {
		return LIMIT_SUM;
	}
	public void setLIMIT_SUM(String limit_sum) {
		LIMIT_SUM = limit_sum;
	}
	public String getLIVE() {
		return LIVE;
	}
	public void setLIVE(String live) {
		LIVE = live;
	}
	public String getMAX_TAX_NO() {
		return MAX_TAX_NO;
	}
	public void setMAX_TAX_NO(String max_tax_no) {
		MAX_TAX_NO = max_tax_no;
	}
	public String getNOTES() {
		return NOTES;
	}
	public void setNOTES(String notes) {
		NOTES = notes;
	}
	public String getOBJ_SET() {
		return OBJ_SET;
	}
	public void setOBJ_SET(String obj_set) {
		OBJ_SET = obj_set;
	}
	public String getOCR_BUSEO_CD() {
		return OCR_BUSEO_CD;
	}
	public void setOCR_BUSEO_CD(String ocr_buseo_cd) {
		OCR_BUSEO_CD = ocr_buseo_cd;
	}
	public String getOCR_SIGU_CD() {
		return OCR_SIGU_CD;
	}
	public void setOCR_SIGU_CD(String ocr_sigu_cd) {
		OCR_SIGU_CD = ocr_sigu_cd;
	}
	public String getOVERDATE() {
		return OVERDATE;
	}
	public void setOVERDATE(String overdate) {
		OVERDATE = overdate;
	}
	public String getOVERTAX() {
		return OVERTAX;
	}
	public void setOVERTAX(String overtax) {
		OVERTAX = overtax;
	}
	public int getPERIOD() {
		return PERIOD;
	}
	public void setPERIOD(int period) {
		PERIOD = period;
	}
	public String getPREV_SEQ() {
		return PREV_SEQ;
	}
	public void setPREV_SEQ(String prev_seq) {
		PREV_SEQ = prev_seq;
	}
	public long getPRICE() {
		return PRICE;
	}
	public void setPRICE(long price) {
		PRICE = price;
	}
	public float getRATE() {
		return RATE;
	}
	public void setRATE(float rate) {
		RATE = rate;
	}
	public String getRATE_CAUSE() {
		return RATE_CAUSE;
	}
	public void setRATE_CAUSE(String rate_cause) {
		RATE_CAUSE = rate_cause;
	}
	public float getREDUCTION_RATE() {
		return REDUCTION_RATE;
	}
	public void setREDUCTION_RATE(float reduction_rate) {
		REDUCTION_RATE = reduction_rate;
	}
	public String getREDUCTION_REASON() {
		return REDUCTION_REASON;
	}
	public void setREDUCTION_REASON(String reduction_reason) {
		REDUCTION_REASON = reduction_reason;
	}
	public String getSEQ() {
		return SEQ;
	}
	public void setSEQ(String seq) {
		SEQ = seq;
	}
	public String getSIGU_CD() {
		return SIGU_CD;
	}
	public void setSIGU_CD(String sigu_cd) {
		SIGU_CD = sigu_cd;
	}
	public String getSISE() {
		return SISE;
	}
	public void setSISE(String sise) {
		SISE = sise;
	}
	public String getSUBUSEO_CD() {
		return SUBUSEO_CD;
	}
	public void setSUBUSEO_CD(String subuseo_cd) {
		SUBUSEO_CD = subuseo_cd;
	}
	public int getSUM() {
		return SUM;
	}
	public void setSUM(int sum) {
		SUM = sum;
	}
	public int getSUM_ADJUST() {
		return SUM_ADJUST;
	}
	public void setSUM_ADJUST(int sum_adjust) {
		SUM_ADJUST = sum_adjust;
	}
	public int getSUM_LASTYEAR() {
		return SUM_LASTYEAR;
	}
	public void setSUM_LASTYEAR(int sum_lastyear) {
		SUM_LASTYEAR = sum_lastyear;
	}
	public int getSUM_YEAR() {
		return SUM_YEAR;
	}
	public void setSUM_YEAR(int sum_year) {
		SUM_YEAR = sum_year;
	}
	public float getSURCHARGE_RATE() {
		return SURCHARGE_RATE;
	}
	public void setSURCHARGE_RATE(float surcharge_rate) {
		SURCHARGE_RATE = surcharge_rate;
	}
	public String getTAX_CD() {
		return TAX_CD;
	}
	public void setTAX_CD(String tax_cd) {
		TAX_CD = tax_cd;
	}
	public String getTAX_DATE() {
		return TAX_DATE;
	}
	public void setTAX_DATE(String tax_date) {
		TAX_DATE = tax_date;
	}
	public String getTAX_GUBUN() {
		return TAX_GUBUN;
	}
	public void setTAX_GUBUN(String tax_gubun) {
		TAX_GUBUN = tax_gubun;
	}
	public String getTAX_NO() {
		return TAX_NO;
	}
	public void setTAX_NO(String tax_no) {
		TAX_NO = tax_no;
	}
	public String getTAX_SEQ() {
		return TAX_SEQ;
	}
	public void setTAX_SEQ(String tax_seq) {
		TAX_SEQ = tax_seq;
	}
	public String getTAX_SET_NAME() {
		return TAX_SET_NAME;
	}
	public void setTAX_SET_NAME(String tax_set_name) {
		TAX_SET_NAME = tax_set_name;
	}
	public String getTAX_YM() {
		return TAX_YM;
	}
	public void setTAX_YM(String tax_ym) {
		TAX_YM = tax_ym;
	}
	public String getTAX_YN() {
		return TAX_YN;
	}
	public void setTAX_YN(String tax_yn) {
		TAX_YN = tax_yn;
	}
	public String getTAX_YNNAME() {
		return TAX_YNNAME;
	}
	public void setTAX_YNNAME(String tax_ynname) {
		TAX_YNNAME = tax_ynname;
	}
	public String getTAXPAYER_ID() {
		return TAXPAYER_ID;
	}
	public void setTAXPAYER_ID(String taxpayer_id) {
		TAXPAYER_ID = taxpayer_id;
	}
	public String getTAXPAYER_SET() {
		return TAXPAYER_SET;
	}
	public void setTAXPAYER_SET(String taxpayer_set) {
		TAXPAYER_SET = taxpayer_set;
	}
	public String getTODATE() {
		return TODATE;
	}
	public void setTODATE(String todate) {
		TODATE = todate;
	}
	public String getTSEQ() {
		return TSEQ;
	}
	public void setTSEQ(String tseq) {
		TSEQ = tseq;
	}
	public String getUP_DATE() {
		return UP_DATE;
	}
	public void setUP_DATE(String up_date) {
		UP_DATE = up_date;
	}
	public String getUSE_SECTION() {
		return USE_SECTION;
	}
	public void setUSE_SECTION(String use_section) {
		USE_SECTION = use_section;
	}
	public String getUSE_SECTIONNAME() {
		return USE_SECTIONNAME;
	}
	public void setUSE_SECTIONNAME(String use_sectionname) {
		USE_SECTIONNAME = use_sectionname;
	}
	public String getVAT() {
		return VAT;
	}
	public void setVAT(String vat) {
		VAT = vat;
	}
	public String getYEAR() {
		return YEAR;
	}
	public void setYEAR(String year) {
		YEAR = year;
	}
	public float getAREA_ALL() {
		return AREA_ALL;
	}
	public void setAREA_ALL(float area_all) {
		AREA_ALL = area_all;
	}
	public String getGU_CODE() {
		return GU_CODE;
	}
	public void setGU_CODE(String gu_code) {
		GU_CODE = gu_code;
	}
	public String getGUBUN() {
		return GUBUN;
	}
	public void setGUBUN(String gubun) {
		GUBUN = gubun;
	}
	public String getGUNGE() {
		return GUNGE;
	}
	public void setGUNGE(String gunge) {
		GUNGE = gunge;
	}
	public String getSAYU() {
		return SAYU;
	}
	public void setSAYU(String sayu) {
		SAYU = sayu;
	}
	public String getWORK_ID() {
		return WORK_ID;
	}
	public void setWORK_ID(String work_id) {
		WORK_ID = work_id;
	}
	public String getWRITEDATE() {
		return WRITEDATE;
	}
	public void setWRITEDATE(String writedate) {
		WRITEDATE = writedate;
	}
	public String getR_ID() {
		return R_ID;
	}
	public void setR_ID(String rID) {
		R_ID = rID;
	}
	public String getGUNGE_FIX() {
		return GUNGE_FIX;
	}
	public void setGUNGE_FIX(String gUNGEFIX) {
		GUNGE_FIX = gUNGEFIX;
	}
	public String getSAYU_FIX() {
		return SAYU_FIX;
	}
	public void setSAYU_FIX(String sAYUFIX) {
		SAYU_FIX = sAYUFIX;
	}
	public String getWORK_NM() {
		return WORK_NM;
	}
	public void setWORK_NM(String wORKNM) {
		WORK_NM = wORKNM;
	}
}
