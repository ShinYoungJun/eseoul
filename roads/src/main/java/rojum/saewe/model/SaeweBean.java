
package main.java.rojum.saewe.model;

public class SaeweBean {
	
	String	ADMIN_NO	= "";
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
	
	
	String GAPAN_NO = "";
	String SUNAP = "";
	
	String TAX_GUBUN = "";
	String TAX_CD = "";
	String CAL_MODE = "";
	String SUNAP_YN = "";
	
	String TAX_CD_NM = "";
	
	
	String REPLY_GUBUN 	= "";
	String REPLY_DATE	= "";
	String REPLY_ETC	= "";
	String INDATE		= "";
	String OVERDATE		= "";
	String TAX_GUBUN_NM	= "";
	String REPLY_GUBUN_NM	= "";
	String SUNAP_DATE	= "";
	String REPLY_MANAGER	="";
	
	
	String SI = "";
	String GUN = "";
	String DORO_NM = "";
	String BD_NM = "";
	String BD_DET_NM = "";
	String BD_BON = "";
	String BD_BU = "";
	
	String NAP_DZIP_CD  = "";
	String NAP_DZIP_ADDR  = "";
	String NAP_DDTL_ADDR = "";
	String NAP_DREF_ADDR = "";

	//********** BEGIN_KANG_20120704
	String TAX_DATE = "";
	//********** END_KANG_20120704

		
	public String getNAP_DZIP_CD() {
		return NAP_DZIP_CD;
	}
	public String getTAX_DATE() {
		return TAX_DATE;
	}
	public void setTAX_DATE(String tAXDATE) {
		TAX_DATE = tAXDATE;
	}
	public void setNAP_DZIP_CD(String nAP_DZIP_CD) {
		NAP_DZIP_CD = nAP_DZIP_CD;
	}
	public String getNAP_DZIP_ADDR() {
		return NAP_DZIP_ADDR;
	}
	public void setNAP_DZIP_ADDR(String nAP_DZIP_ADDR) {
		NAP_DZIP_ADDR = nAP_DZIP_ADDR;
	}
	public String getNAP_DDTL_ADDR() {
		return NAP_DDTL_ADDR;
	}
	public void setNAP_DDTL_ADDR(String nAP_DDTL_ADDR) {
		NAP_DDTL_ADDR = nAP_DDTL_ADDR;
	}
	public String getNAP_DREF_ADDR() {
		return NAP_DREF_ADDR;
	}
	public void setNAP_DREF_ADDR(String nAP_DREF_ADDR) {
		NAP_DREF_ADDR = nAP_DREF_ADDR;
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
	
	public String getREPLY_MANAGER() {
		return REPLY_MANAGER;
	}
	public void setREPLY_MANAGER(String rEPLY_MANAGER) {
		REPLY_MANAGER = rEPLY_MANAGER;
	}
	public String getSUNAP_DATE() {
		return SUNAP_DATE;
	}
	public void setSUNAP_DATE(String sUNAP_DATE) {
		SUNAP_DATE = sUNAP_DATE;
	}
	public String getTAX_GUBUN_NM() {
		return TAX_GUBUN_NM;
	}
	public void setTAX_GUBUN_NM(String tAX_GUBUN_NM) {
		TAX_GUBUN_NM = tAX_GUBUN_NM;
	}
	public String getREPLY_GUBUN_NM() {
		return REPLY_GUBUN_NM;
	}
	public void setREPLY_GUBUN_NM(String rEPLY_GUBUN_NM) {
		REPLY_GUBUN_NM = rEPLY_GUBUN_NM;
	}
	public String getINDATE() {
		return INDATE;
	}
	public void setINDATE(String iNDATE) {
		INDATE = iNDATE;
	}
	public String getOVERDATE() {
		return OVERDATE;
	}
	public void setOVERDATE(String oVERDATE) {
		OVERDATE = oVERDATE;
	}
	public String getREPLY_GUBUN() {
		return REPLY_GUBUN;
	}
	public void setREPLY_GUBUN(String rEPLY_GUBUN) {
		REPLY_GUBUN = rEPLY_GUBUN;
	}
	public String getREPLY_DATE() {
		return REPLY_DATE;
	}
	public void setREPLY_DATE(String rEPLY_DATE) {
		REPLY_DATE = rEPLY_DATE;
	}
	public String getREPLY_ETC() {
		return REPLY_ETC;
	}
	public void setREPLY_ETC(String rEPLY_ETC) {
		REPLY_ETC = rEPLY_ETC;
	}
	public String getTAX_CD_NM() {
		return TAX_CD_NM;
	}
	public void setTAX_CD_NM(String tAXCDNM) {
		TAX_CD_NM = tAXCDNM;
	}
	public String getSUNAP_YN() {
		return SUNAP_YN;
	}
	public void setSUNAP_YN(String sUNAPYN) {
		SUNAP_YN = sUNAPYN;
	}
	public String getTAX_GUBUN() {
		return TAX_GUBUN;
	}
	public void setTAX_GUBUN(String tAXGUBUN) {
		TAX_GUBUN = tAXGUBUN;
	}
	public String getTAX_CD() {
		return TAX_CD;
	}
	public void setTAX_CD(String tAXCD) {
		TAX_CD = tAXCD;
	}
	public String getCAL_MODE() {
		return CAL_MODE;
	}
	public void setCAL_MODE(String cALMODE) {
		CAL_MODE = cALMODE;
	}
	public String getGAPAN_NO() {
		return GAPAN_NO;
	}
	public void setGAPAN_NO(String gAPANNO) {
		GAPAN_NO = gAPANNO;
	}
	public String getSUNAP() {
		return SUNAP;
	}
	public void setSUNAP(String sUNAP) {
		SUNAP = sUNAP;
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
}
