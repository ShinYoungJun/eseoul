
package main.java.gapan.saewe.model;

public class SaeweBean {
	
	String	ADMIN_NO	= "";
	String	GAPAN_NO	= "";
	String	SEQ	        = "";
	String	GU_CODE		= "";
	String	TAX_SET		= "";
	String	SUM_YEAR	= "";
	String	SUM_ADJUST	= "";
	String	VAT			= "";
	
	String	USE_SECTION	= "";
	String	TYPE		= "";
	String	SECTION		= "";
	String	NAME		= "";
	String	REQ_DATE	= "";
	String	MUL_FROMDATE	= "";
	String	MUL_TODATE		= "";
	String	JUMGIGAN	= "";
	int		CAL_CNT		= 0;
	int		TAX_CNT		= 0;
	int		TAX_YN_CNT	= 0;
	String	CAL_YN		= "";	//	작성여부
	String	TAX_YN		= "";	//	부과여부
	String	RN			= "";
	String	FROMDATE	= "";
	String	TODATE		= "";
	String  PARTLY_PERIOD = "";
	String  TOTAL_PERIOD  = "";
	String  TAX_NO  	  = "";
	String  REFUND_YN     = "";
	String  YEAR          = "";
	String 	GP_TYP		= "";
	
	String	ADDR		= "";
	String  AREA_SIZE	= "";
	String  SUM_LASTYEAR = "";
	String	SUM			="";
	
	String	CAL_NAME	= "";
	String	FT_TYP	= "";
	
	String	SI	= "";
	String	GUN	= "";
	String	DORO_NM	= "";
	String	BD_BON	= "";
	String	BD_BU	= "";
	String	BD_NM	= "";
	String	BD_DET_NM	= "";
	
	//********** BEGIN_KANG_20120404
	private String	SUNAP_YN	= "";
	private String	SUNAP_DATE	= "";
	
	//********** END_KANG_20120404
	
	/* [20130418] 추가 엑셀용 요청필드 */
	String SF_VALUE			= "";	// 시설물가액
	String PRICE			= "";	// 공시지가
	String AREA_BEFORE		= "";	// 변경전 면적
	String AREA_AFTER		= "";	// 변경후 면적
	String RATE				= "";	// 요율
	String REDUCTION_RATE	= "";	// 감면율
	String REDUCTION_REASON	= "";	// 감면사유
	String ADJUSTMENT		= "";	// 조정계수
	String FORM				= "";	// 일반 산출식
	String FORM_ADJUST 		= "";	// 조정 산출식
	
	
	public String getSUNAP_YN() {
		return SUNAP_YN;
	}
	public String getSUNAP_DATE() {
		return SUNAP_DATE;
	}
	public void setSUNAP_DATE(String sUNAPDATE) {
		SUNAP_DATE = sUNAPDATE;
	}
	public void setSUNAP_YN(String sUNAPYN) {
		SUNAP_YN = sUNAPYN;
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
	public String getGAPAN_NO() {
		return GAPAN_NO;
	}
	public void setGAPAN_NO(String gAPANNO) {
		GAPAN_NO = gAPANNO;
	}
	public String getCAL_NAME() {
		return CAL_NAME;
	}
	public void setCAL_NAME(String cALNAME) {
		CAL_NAME = cALNAME;
	}
	public String getFT_TYP() {
		return FT_TYP;
	}
	public void setFT_TYP(String fTTYP) {
		FT_TYP = fTTYP;
	}
	public String getADDR() {
		return ADDR;
	}
	public void setADDR(String aDDR) {
		ADDR = aDDR;
	}
	public String getAREA_SIZE() {
		return AREA_SIZE;
	}
	public void setAREA_SIZE(String aREASIZE) {
		AREA_SIZE = aREASIZE;
	}
	public String getSUM_LASTYEAR() {
		return SUM_LASTYEAR;
	}
	public void setSUM_LASTYEAR(String sUMLASTYEAR) {
		SUM_LASTYEAR = sUMLASTYEAR;
	}
	public String getSUM() {
		return SUM;
	}
	public void setSUM(String sUM) {
		SUM = sUM;
	}
	//산철기간
	String	SANCHULGIGAN	= "";
	
	//점용목적
	
	String PURPOSE_NM = "";
	
	
	
	
	public String getPURPOSE_NM() {
		return PURPOSE_NM;
	}
	public void setPURPOSE_NM(String pURPOSENM) {
		PURPOSE_NM = pURPOSENM;
	}
	public String getSANCHULGIGAN() {
		return SANCHULGIGAN;
	}
	public void setSANCHULGIGAN(String sANCHULGIGAN) {
		SANCHULGIGAN = sANCHULGIGAN;
	}
	public String getGP_TYP() {
		return GP_TYP;
	}
	public void setGP_TYP(String gPTYP) {
		GP_TYP = gPTYP;
	}
	public String getADMIN_NO() {
		return ADMIN_NO;
	}
	public void setADMIN_NO(String admin_no) {
		ADMIN_NO = admin_no;
	}
	public String getSEQ() {
		return SEQ;
	}
	public void setSEQ(String seq) {
		SEQ = seq;
	}
	public int getCAL_CNT() {
		return CAL_CNT;
	}
	public void setCAL_CNT(int cal_cnt) {
		CAL_CNT = cal_cnt;
	}
	public String getCAL_YN() {
		return CAL_YN;
	}
	public void setCAL_YN(String cal_yn) {
		CAL_YN = cal_yn;
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
	public String getJUMGIGAN() {
		return JUMGIGAN;
	}
	public void setJUMGIGAN(String jumgigan) {
		JUMGIGAN = jumgigan;
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
	public String getREQ_DATE() {
		return REQ_DATE;
	}
	public void setREQ_DATE(String req_date) {
		REQ_DATE = req_date;
	}
	public String getRN() {
		return RN;
	}
	public void setRN(String rn) {
		RN = rn;
	}
	public String getSECTION() {
		return SECTION;
	}
	public void setSECTION(String section) {
		SECTION = section;
	}
	public String getSUM_ADJUST() {
		return SUM_ADJUST;
	}
	public void setSUM_ADJUST(String sum_adjust) {
		SUM_ADJUST = sum_adjust;
	}
	public String getSUM_YEAR() {
		return SUM_YEAR;
	}
	public void setSUM_YEAR(String sum_year) {
		SUM_YEAR = sum_year;
	}
	public int getTAX_CNT() {
		return TAX_CNT;
	}
	public void setTAX_CNT(int tax_cnt) {
		TAX_CNT = tax_cnt;
	}
	public String getTAX_SET() {
		return TAX_SET;
	}
	public void setTAX_SET(String tax_set) {
		TAX_SET = tax_set;
	}
	public String getTAX_YN() {
		return TAX_YN;
	}
	public void setTAX_YN(String tax_yn) {
		TAX_YN = tax_yn;
	}
	public int getTAX_YN_CNT() {
		return TAX_YN_CNT;
	}
	public void setTAX_YN_CNT(int tax_yn_cnt) {
		TAX_YN_CNT = tax_yn_cnt;
	}
	public String getTODATE() {
		return TODATE;
	}
	public void setTODATE(String todate) {
		TODATE = todate;
	}
	public String getTYPE() {
		return TYPE;
	}
	public void setTYPE(String type) {
		TYPE = type;
	}
	public String getVAT() {
		return VAT;
	}
	public void setVAT(String vat) {
		VAT = vat;
	}	
	public String getUSE_SECTION() {
		return USE_SECTION;
	}
	public void setUSE_SECTION(String use_section) {
		USE_SECTION = use_section;
	}
	public String getPARTLY_PERIOD() {
		return PARTLY_PERIOD;
	}
	public void setPARTLY_PERIOD(String partly_period) {
		PARTLY_PERIOD = partly_period;
	}
	public String getTOTAL_PERIOD() {
		return TOTAL_PERIOD;
	}
	public void setTOTAL_PERIOD(String total_period) {
		TOTAL_PERIOD = total_period;
	}
	public String getTAX_NO() {
		return TAX_NO;
	}
	public void setTAX_NO(String tax_no) {
		TAX_NO = tax_no;
	}
	public String getREFUND_YN() {
		return REFUND_YN;
	}
	public void setREFUND_YN(String refund_yn) {
		REFUND_YN = refund_yn;
	}
	public String getYEAR() {
		return YEAR;
	}
	public void setYEAR(String year) {
		YEAR = year;
	}
	public String getSF_VALUE() {
		return SF_VALUE;
	}
	public void setSF_VALUE(String sF_VALUE) {
		SF_VALUE = sF_VALUE;
	}
	public String getPRICE() {
		return PRICE;
	}
	public void setPRICE(String pRICE) {
		PRICE = pRICE;
	}
	public String getAREA_BEFORE() {
		return AREA_BEFORE;
	}
	public void setAREA_BEFORE(String aREA_BEFORE) {
		AREA_BEFORE = aREA_BEFORE;
	}
	public String getREDUCTION_RATE() {
		return REDUCTION_RATE;
	}
	public String getAREA_AFTER() {
		return AREA_AFTER;
	}
	public void setAREA_AFTER(String aREA_AFTER) {
		AREA_AFTER = aREA_AFTER;
	}
	public String getRATE() {
		return RATE;
	}
	public void setRATE(String rATE) {
		RATE = rATE;
	}
	public void setREDUCTION_RATE(String rEDUCTION_RATE) {
		REDUCTION_RATE = rEDUCTION_RATE;
	}
	public String getREDUCTION_REASON() {
		return REDUCTION_REASON;
	}
	public void setREDUCTION_REASON(String rEDUCTION_REASON) {
		REDUCTION_REASON = rEDUCTION_REASON;
	}
	public String getADJUSTMENT() {
		return ADJUSTMENT;
	}
	public void setADJUSTMENT(String aDJUSTMENT) {
		ADJUSTMENT = aDJUSTMENT;
	}
	public String getFORM() {
		return FORM;
	}
	public void setFORM(String fORM) {
		FORM = fORM;
	}
	public String getFORM_ADJUST() {
		return FORM_ADJUST;
	}
	public void setFORM_ADJUST(String fORM_ADJUST) {
		FORM_ADJUST = fORM_ADJUST;
	}
}
