package main.java.facility.jumyong.model;


import main.java.common.model.RoadsBaseBean;

public class Equip_ProductBean extends RoadsBaseBean {
	
	// 2012.03 추가 일괄산출 관련 start
	private int LISTCOUNT;
	private String SUM_ADJUST_ILGW;
	private String QUANTITY_ILGW;
	private String RATE_ILGW;
	public void setLISTCOUNT(int listcount){
		LISTCOUNT = listcount;
	}
	public int getLISTCOUNT(){
		return LISTCOUNT;
	}
	public void setSUM_ADJUST_ILGW(String sum_adjust_ilgw){
		SUM_ADJUST_ILGW = sum_adjust_ilgw;
	}
	public String getSUM_ADJUST_ILGW(){
		return SUM_ADJUST_ILGW;
	}
	public void setQUANTITY_ILGW(String quantity_ilgw){
		QUANTITY_ILGW = quantity_ilgw;
	}
	public String getQUANTITY_ILGW(){
		return QUANTITY_ILGW;
	}
	public void setRATE_ILGW(String rate_ilgw){
		RATE_ILGW = rate_ilgw;
	}
	public String getRATE_ILGW(){
		return RATE_ILGW;
	}
	// 2012.03 추가 일괄산출 관련 end
	
	private String CORP_CD; 
	private String GU_CODE; 
	private String REQUEST_NO; 
	private String ADMIN_NO; 
	private String YEAR; 
	private int SEQ; 
	private int PRICE; 
	private float AREA;
	private float AREA_BEFORE; 
	private float AREA_AFTER; 
	private float RATE;
	private String RATE_WON;
	private int SUM_LASTYEAR; 
	private int SUM_YEAR;
	private int SUM; 	
	private String SUM_WON;
	private int SUM_ADJUST; 
	private String SUM_ADJUST_WON;
	private int VAT; 
	private String 	FROMDATE; 
	private String  TODATE;
	private String FORM_ADJUST; 
	private String FORM; 
	private String UP_DATE;
	private int LICENSE_TAX; 	
	private String PERIOD; 
	private int AMOUNT; 
	private float ADJUSTMENT; 
	private String REDUCTION_REASON; 
	private int REDUCTION_RATE	;
	private float  SURCHARGE_RATE; 
	private String USE_SECTION; 
	private int FIRST_SEQ; 
	private int	CAL_SUM_SEQ; 
	private int PREV_SEQ;
	
	private String TAX_SET;
	private float QUANTITY;
	private String DEPTH_NUM;
	
	private String OBJECT_NO;
	private String PURPOSE_CD;
	private String SORT_NM;
	private String KIND_NM;
	private String TAX_SET_NAME;
	private float DEPTH_RATE;
	private float YOYUL;
	private String TAX_YN;
	private String TAX_REG;
	private String MOMEY;
	
	private String CAL_STATUS_NAME ;
	private String SEBU_NM;
	private String CAL_STATUS;
	
	private String USE_SECTION_NAME;

	
	
	// 2009.8 추가 start
	private String GAPAN_NO 	= "";
	private String TAX_DATE		= "";
	private String INDATE 		= "";
	private String OVERDATE 	= "";
	private String OVERTAX 		= "";
	private String FORM1		= "";
	private String FORM2		= "";
	private String TAX_YM		= "";
	private String MAX_TAX_NO	= "";
	private String SIGU_CD     	= "";
	private String BJ_CD       	= "";
	private String TAX_NO      	= "";
	private String DEPT_CD     	= "";
	private String TAX_CD      	= "";
	private String TAX_GUBUN   	= "";
	private String OBJ_SET     	= "";
	private String TAXPAYER_ID 	= "";
	private String TAXPAYER_SET	= "";
	private String OCR_SIGU_CD 	= "";
	private String OCR_BUSEO_CD	= "";
	private String TSEQ        	= "";
	private String LIVE      	= "";
	private String BONSE	 	= "";
	private String INTAX     	= "";
	private String ADD_SET   	= "";
	private String ADD_YN    	= "";
	private String NOTES     	= "";
	private String LIMIT_SUM 	= "";
	private String LIMIT_CNT 	= "";
	private String RATE_CAUSE	= "";
	private String SISE      	= "";
	private String GIGUM     	= "";
	private String GUKSE     	= "";
	private String GUSE      	= "";
	private String SUBUSEO_CD	= "";
	private float SUM_YEAR_FLOAT = 0;
	private String TAX_CD_GU	= "";
	private String TAX_CD_MOK	= "";
	private String TAX_CD_SE	= "";
	private String BUNNAP_NO	= "";
	private String SUSI_NO		= "";
	private String TYPE			= "";
	// 2009.8  추가 end
	
	
	
	public String getMOMEY() {
		return MOMEY;
	}

	public void setMOMEY(String mOMEY) {
		MOMEY = mOMEY;
	}
	
	public String getTYPE() {
		return TYPE;
	}

	
	public void setTYPE(String type) {
		TYPE = type;
	}

	public String getSUSI_NO() {
		return SUSI_NO;
	}

	public void setSUSI_NO(String susi_no) {
		SUSI_NO = susi_no;
	}

	public String getBUNNAP_NO() {
		return BUNNAP_NO;
	}

	public void setBUNNAP_NO(String bunnap_no) {
		BUNNAP_NO = bunnap_no;
	}

	public String getTAX_CD_SE() {
		return TAX_CD_SE;
	}

	public void setTAX_CD_SE(String tax_cd_se) {
		TAX_CD_SE = tax_cd_se;
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

	public int getAMOUNT() {
		return AMOUNT;
	}

	public void setAMOUNT(int amount) {
		AMOUNT = amount;
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

	public String getCAL_STATUS() {
		return CAL_STATUS;
	}

	public void setCAL_STATUS(String cal_status) {
		CAL_STATUS = cal_status;
	}

	public String getCAL_STATUS_NAME() {
		return CAL_STATUS_NAME;
	}

	public void setCAL_STATUS_NAME(String cal_status_name) {
		CAL_STATUS_NAME = cal_status_name;
	}

	public int getCAL_SUM_SEQ() {
		return CAL_SUM_SEQ;
	}

	public void setCAL_SUM_SEQ(int cal_sum_seq) {
		CAL_SUM_SEQ = cal_sum_seq;
	}

	public String getCORP_CD() {
		return CORP_CD;
	}

	public void setCORP_CD(String corp_cd) {
		CORP_CD = corp_cd;
	}

	public String getDEPTH_NUM() {
		return DEPTH_NUM;
	}

	public void setDEPTH_NUM(String depth_num) {
		DEPTH_NUM = depth_num;
	}

	public float getDEPTH_RATE() {
		return DEPTH_RATE;
	}

	public void setDEPTH_RATE(float depth_rate) {
		DEPTH_RATE = depth_rate;
	}

	public int getFIRST_SEQ() {
		return FIRST_SEQ;
	}

	public void setFIRST_SEQ(int first_seq) {
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

	public String getFROMDATE() {
		return FROMDATE;
	}

	public void setFROMDATE(String fromdate) {
		FROMDATE = fromdate;
	}

	public String getGU_CODE() {
		return GU_CODE;
	}

	public void setGU_CODE(String gu_code) {
		GU_CODE = gu_code;
	}

	public String getKIND_NM() {
		return KIND_NM;
	}

	public void setKIND_NM(String kind_nm) {
		KIND_NM = kind_nm;
	}

	public int getLICENSE_TAX() {
		return LICENSE_TAX;
	}

	public void setLICENSE_TAX(int license_tax) {
		LICENSE_TAX = license_tax;
	}

	public String getOBJECT_NO() {
		return OBJECT_NO;
	}

	public void setOBJECT_NO(String object_no) {
		OBJECT_NO = object_no;
	}

	public String getPERIOD() {
		return PERIOD;
	}

	public void setPERIOD(String period) {
		PERIOD = period;
	}

	public int getPREV_SEQ() {
		return PREV_SEQ;
	}

	public void setPREV_SEQ(int prev_seq) {
		PREV_SEQ = prev_seq;
	}

	public int getPRICE() {
		return PRICE;
	}

	public void setPRICE(int price) {
		PRICE = price;
	}

	public String getPURPOSE_CD() {
		return PURPOSE_CD;
	}

	public void setPURPOSE_CD(String purpose_cd) {
		PURPOSE_CD = purpose_cd;
	}

	public float getQUANTITY() {
		return QUANTITY;
	}

	public void setQUANTITY(float quantity) {
		QUANTITY = quantity;
	}

	public float getRATE() {
		return RATE;
	}

	public void setRATE(float rate) {
		RATE = rate;
	}

	public String getRATE_WON() {
		return RATE_WON;
	}

	public void setRATE_WON(String rate_won) {
		RATE_WON = rate_won;
	}

	public int getREDUCTION_RATE() {
		return REDUCTION_RATE;
	}

	public void setREDUCTION_RATE(int reduction_rate) {
		REDUCTION_RATE = reduction_rate;
	}

	public String getREDUCTION_REASON() {
		return REDUCTION_REASON;
	}

	public void setREDUCTION_REASON(String reduction_reason) {
		REDUCTION_REASON = reduction_reason;
	}

	public String getREQUEST_NO() {
		return REQUEST_NO;
	}

	public void setREQUEST_NO(String request_no) {
		REQUEST_NO = request_no;
	}

	public String getSEBU_NM() {
		return SEBU_NM;
	}

	public void setSEBU_NM(String sebu_nm) {
		SEBU_NM = sebu_nm;
	}

	public int getSEQ() {
		return SEQ;
	}

	public void setSEQ(int seq) {
		SEQ = seq;
	}

	public String getSORT_NM() {
		return SORT_NM;
	}

	public void setSORT_NM(String sort_nm) {
		SORT_NM = sort_nm;
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

	public String getSUM_ADJUST_WON() {
		return SUM_ADJUST_WON;
	}

	public void setSUM_ADJUST_WON(String sum_adjust_won) {
		SUM_ADJUST_WON = sum_adjust_won;
	}

	public int getSUM_LASTYEAR() {
		return SUM_LASTYEAR;
	}

	public void setSUM_LASTYEAR(int sum_lastyear) {
		SUM_LASTYEAR = sum_lastyear;
	}

	public String getSUM_WON() {
		return SUM_WON;
	}

	public void setSUM_WON(String sum_won) {
		SUM_WON = sum_won;
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

	public String getTAX_REG() {
		return TAX_REG;
	}

	public void setTAX_REG(String tax_reg) {
		TAX_REG = tax_reg;
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

	public String getTODATE() {
		return TODATE;
	}

	public void setTODATE(String todate) {
		TODATE = todate;
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

	public String getUSE_SECTION_NAME() {
		return USE_SECTION_NAME;
	}

	public void setUSE_SECTION_NAME(String use_section_name) {
		USE_SECTION_NAME = use_section_name;
	}

	public int getVAT() {
		return VAT;
	}

	public void setVAT(int vat) {
		VAT = vat;
	}

	public String getYEAR() {
		return YEAR;
	}

	public void setYEAR(String year) {
		YEAR = year;
	}

	public float getYOYUL() {
		return YOYUL;
	}

	public void setYOYUL(float yoyul) {
		YOYUL = yoyul;
	}

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

	public String getDEPT_CD() {
		return DEPT_CD;
	}

	public void setDEPT_CD(String dept_cd) {
		DEPT_CD = dept_cd;
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

	public String getGAPAN_NO() {
		return GAPAN_NO;
	}

	public void setGAPAN_NO(String gapan_no) {
		GAPAN_NO = gapan_no;
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

	public String getRATE_CAUSE() {
		return RATE_CAUSE;
	}

	public void setRATE_CAUSE(String rate_cause) {
		RATE_CAUSE = rate_cause;
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

	public String getTAX_YM() {
		return TAX_YM;
	}

	public void setTAX_YM(String tax_ym) {
		TAX_YM = tax_ym;
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

	public String getTSEQ() {
		return TSEQ;
	}

	public void setTSEQ(String tseq) {
		TSEQ = tseq;
	}

	public float getSUM_YEAR_FLOAT() {
		return SUM_YEAR_FLOAT;
	}

	public void setSUM_YEAR_FLOAT(float sum_year_float) {
		SUM_YEAR_FLOAT = sum_year_float;
	}
	
	public String getTAX_CD_GU() {
		return TAX_CD_GU;
	}

	public void setTAX_CD_GU(String tax_cd_gu) {
		TAX_CD_GU = tax_cd_gu;
	}

	public String getTAX_CD_MOK() {
		return TAX_CD_MOK;
	}

	public void setTAX_CD_MOK(String tax_cd_mok) {
		TAX_CD_MOK = tax_cd_mok;
	}

			
}
