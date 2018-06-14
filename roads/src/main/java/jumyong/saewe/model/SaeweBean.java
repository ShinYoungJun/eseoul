//	2009		Kim Yun Seo

package main.java.jumyong.saewe.model;

public class SaeweBean {
	
	String	ADMIN_NO			= "";
	String	SEQ	        		= "";	// CALCULATION_INFO.cal_sum_seq
	String	GU_CODE				= "";
	String	TAX_SET				= "";
	String	SUM_YEAR			= "";
	String	SUM_ADJUST			= "";
	String	VAT					= "";
	
	String	USE_SECTION			= "";
	String	TYPE				= "";
	String	SECTION				= "";
	String 	SSN					= "";
	String	NAME				= "";
	String	BASE_UPDATED		= "";
	String	MUL_FROMDATE		= "";
	String	MUL_TODATE			= "";
	String	JUMGIGAN			= "";
	int		CAL_CNT				= 0;
	int		TAX_CNT				= 0;
	int		TAX_YN_CNT			= 0;
	String	CAL_YN				= "";	//	작성여부
	String	TAX_YN				= "";	//	부과여부
	String	RN					= "";
	String	FROMDATE			= "";
	String	TODATE				= "";
	String  PARTLY_PERIOD 		= "";
	String  TOTAL_PERIOD  		= "";
	String	TAX_SEQ 			= "";	// CALCULATION_INFO.cal_sum_seq
	String  TAX_NO  	 	 	= "";
	String  REFUND_YN     		= "";
	String  YEAR          		= "";
	String  AREA				= ""; 	//면적
	String SECTION_NAME 		= "";
	//2009.12.24 김권태
	String TAX_DATE 			= "";
	String BONSE 				= "";
	//2009.12.28 김권태
	
	String PURPOSE_NM 			= "";
	String TAXCODE_NM 			= "";
	
	String OWNER_SET_NM 		= "";
	String TAX_SET_NM 			= "";
	String GU_NM 				= "";
	String BJ_NM 				= "";
	String HJ_NM 				= "";
	String JIBUN 				= "";
	
	String SUNAP_DATE 			= "";
	//********** BEGIN_현진_20120321
	String EXPONENT 			= "";
	String BUSINESSADDR			= "";
	String TAX_DATE_DD 			= "";
	//********** END_현진_20120321
	//********** BEGIN_KANG_20120417
	String COMPANY_NAME 		= "";
	String EMAIL 				= "";
	//********** END_KANG_20120417
	//********** BEGIN_KANG_20120710
	String BIZSSN 				= "";
	String BIZ_STATUS 			= "";
	String BIZ_TYPES 			= "";
	//********** END_KANG_20120710

	

	public String getEXPONENT() {
		return EXPONENT;
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
	public String getCOMPANY_NAME() {
		return COMPANY_NAME;
	}
	public void setCOMPANY_NAME(String cOMPANYNAME) {
		COMPANY_NAME = cOMPANYNAME;
	}
	public String getEMAIL() {
		return EMAIL;
	}
	public void setEMAIL(String eMAIL) {
		EMAIL = eMAIL;
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

	public String getTAX_DATE_DD() {
		return TAX_DATE_DD;
	}
	public void setTAX_DATE_DD(String tAXDATEDD) {
		TAX_DATE_DD = tAXDATEDD;
	}
	
	public String getSUNAP_DATE() {
		return SUNAP_DATE;
	}
	public void setSUNAP_DATE(String sUNAP_DATE) {
		SUNAP_DATE = sUNAP_DATE;
	}
	public String getADMIN_NO() {
		return ADMIN_NO;
	}
	public void setADMIN_NO(String aDMIN_NO) {
		ADMIN_NO = aDMIN_NO;
	}
	public String getSEQ() {
		return SEQ;
	}
	public void setSEQ(String sEQ) {
		SEQ = sEQ;
	}
	public String getGU_CODE() {
		return GU_CODE;
	}
	public void setGU_CODE(String gU_CODE) {
		GU_CODE = gU_CODE;
	}
	public String getTAX_SET() {
		return TAX_SET;
	}
	public void setTAX_SET(String tAX_SET) {
		TAX_SET = tAX_SET;
	}
	public String getSUM_YEAR() {
		return SUM_YEAR;
	}
	public void setSUM_YEAR(String sUM_YEAR) {
		SUM_YEAR = sUM_YEAR;
	}
	public String getSUM_ADJUST() {
		return SUM_ADJUST;
	}
	public void setSUM_ADJUST(String sUM_ADJUST) {
		SUM_ADJUST = sUM_ADJUST;
	}
	public String getVAT() {
		return VAT;
	}
	public void setVAT(String vAT) {
		VAT = vAT;
	}
	public String getUSE_SECTION() {
		return USE_SECTION;
	}
	public void setUSE_SECTION(String uSE_SECTION) {
		USE_SECTION = uSE_SECTION;
	}
	public String getTYPE() {
		return TYPE;
	}
	public void setTYPE(String tYPE) {
		TYPE = tYPE;
	}
	public String getSECTION() {
		return SECTION;
	}
	public void setSECTION(String sECTION) {
		SECTION = sECTION;
	}
	public String getSSN() {
		return SSN;
	}
	public void setSSN(String sSN) {
		SSN = sSN;
	}
	public String getNAME() {
		return NAME;
	}
	public void setNAME(String nAME) {
		NAME = nAME;
	}
	public String getBASE_UPDATED() {
		return BASE_UPDATED;
	}
	public void setBASE_UPDATED(String updated) {
		BASE_UPDATED = updated;
	}
	public String getMUL_FROMDATE() {
		return MUL_FROMDATE;
	}
	public void setMUL_FROMDATE(String mUL_FROMDATE) {
		MUL_FROMDATE = mUL_FROMDATE;
	}
	public String getMUL_TODATE() {
		return MUL_TODATE;
	}
	public void setMUL_TODATE(String mUL_TODATE) {
		MUL_TODATE = mUL_TODATE;
	}
	public String getJUMGIGAN() {
		return JUMGIGAN;
	}
	public void setJUMGIGAN(String jUMGIGAN) {
		JUMGIGAN = jUMGIGAN;
	}
	public int getCAL_CNT() {
		return CAL_CNT;
	}
	public void setCAL_CNT(int cAL_CNT) {
		CAL_CNT = cAL_CNT;
	}
	public int getTAX_CNT() {
		return TAX_CNT;
	}
	public void setTAX_CNT(int tAX_CNT) {
		TAX_CNT = tAX_CNT;
	}
	public int getTAX_YN_CNT() {
		return TAX_YN_CNT;
	}
	public void setTAX_YN_CNT(int tAX_YN_CNT) {
		TAX_YN_CNT = tAX_YN_CNT;
	}
	public String getCAL_YN() {
		return CAL_YN;
	}
	public void setCAL_YN(String cAL_YN) {
		CAL_YN = cAL_YN;
	}
	public String getTAX_YN() {
		return TAX_YN;
	}
	public void setTAX_YN(String tAX_YN) {
		TAX_YN = tAX_YN;
	}
	public String getRN() {
		return RN;
	}
	public void setRN(String rN) {
		RN = rN;
	}
	public String getFROMDATE() {
		return FROMDATE;
	}
	public void setFROMDATE(String fROMDATE) {
		FROMDATE = fROMDATE;
	}
	public String getTODATE() {
		return TODATE;
	}
	public void setTODATE(String tODATE) {
		TODATE = tODATE;
	}
	public String getPARTLY_PERIOD() {
		return PARTLY_PERIOD;
	}
	public void setPARTLY_PERIOD(String pARTLY_PERIOD) {
		PARTLY_PERIOD = pARTLY_PERIOD;
	}
	public String getTOTAL_PERIOD() {
		return TOTAL_PERIOD;
	}
	public void setTOTAL_PERIOD(String tOTAL_PERIOD) {
		TOTAL_PERIOD = tOTAL_PERIOD;
	}
	public String getTAX_SEQ() {
		return TAX_SEQ;
	}
	public void setTAX_SEQ(String tAX_SEQ) {
		TAX_SEQ = tAX_SEQ;
	}
	public String getTAX_NO() {
		return TAX_NO;
	}
	public void setTAX_NO(String tAX_NO) {
		TAX_NO = tAX_NO;
	}
	public String getREFUND_YN() {
		return REFUND_YN;
	}
	public void setREFUND_YN(String rEFUND_YN) {
		REFUND_YN = rEFUND_YN;
	}
	public String getYEAR() {
		return YEAR;
	}
	public void setYEAR(String yEAR) {
		YEAR = yEAR;
	}
	public String getAREA() {
		return AREA;
	}
	public void setAREA(String aREA) {
		AREA = aREA;
	}
	public String getSECTION_NAME() {
		return SECTION_NAME;
	}
	public void setSECTION_NAME(String sECTION_NAME) {
		SECTION_NAME = sECTION_NAME;
	}
	public String getTAX_DATE() {
		return TAX_DATE;
	}
	public void setTAX_DATE(String tAX_DATE) {
		TAX_DATE = tAX_DATE;
	}
	public String getBONSE() {
		return BONSE;
	}
	public void setBONSE(String bONSE) {
		BONSE = bONSE;
	}
	public String getPURPOSE_NM() {
		return PURPOSE_NM;
	}
	public void setPURPOSE_NM(String pURPOSE_NM) {
		PURPOSE_NM = pURPOSE_NM;
	}
	public String getTAXCODE_NM() {
		return TAXCODE_NM;
	}
	public void setTAXCODE_NM(String tAXCODE_NM) {
		TAXCODE_NM = tAXCODE_NM;
	}
	public String getOWNER_SET_NM() {
		return OWNER_SET_NM;
	}
	public void setOWNER_SET_NM(String oWNER_SET_NM) {
		OWNER_SET_NM = oWNER_SET_NM;
	}
	public String getTAX_SET_NM() {
		return TAX_SET_NM;
	}
	public void setTAX_SET_NM(String tAX_SET_NM) {
		TAX_SET_NM = tAX_SET_NM;
	}
	public String getGU_NM() {
		return GU_NM;
	}
	public void setGU_NM(String gU_NM) {
		GU_NM = gU_NM;
	}
	public String getBJ_NM() {
		return BJ_NM;
	}
	public void setBJ_NM(String bJ_NM) {
		BJ_NM = bJ_NM;
	}
	public String getHJ_NM() {
		return HJ_NM;
	}
	public void setHJ_NM(String hJ_NM) {
		HJ_NM = hJ_NM;
	}
	public String getJIBUN() {
		return JIBUN;
	}
	public void setJIBUN(String jIBUN) {
		JIBUN = jIBUN;
	}
}
