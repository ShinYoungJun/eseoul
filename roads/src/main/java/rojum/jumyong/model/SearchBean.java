package main.java.rojum.jumyong.model;


import main.java.common.model.RoadsBaseBean;

public class SearchBean extends RoadsBaseBean {
	private int INTCURPAGE;
	private String FROMDATE;
	private String TODATE; 
	private String TYPE; 
	private String SECTION; 
	private String TAX_SET; 
	private String BJ_CD; 	
	private String BONBUN; 
	private  String BUBUN;
	
	private String NUMBERVALUE; 
	private String JUMYONGNAME; 
	private String GU_CODE;
	private String YEAR;
	private String TAX_YN;
	private String CAL_STATUS;
	
	private String TAXTAXION_AT = "";
	private String MAINTN_OB = "";
	
	private String PICKUP_YN = "";
	private String MANAGE_TYP = "";
	
	private String CURRENT_PAGE = "";
	private String COUNTER_PER_PAGE = "";
	
	/* 2014.08.10 KNY */
	private String FT_TYP = "";
	
	public String getFT_TYP() {
		return FT_TYP;
	}
	public void setFT_TYP(String fTTYP) {
		FT_TYP = fTTYP;
	}
	public String getCURRENT_PAGE() {
		return CURRENT_PAGE;
	}
	public void setCURRENT_PAGE(String cURRENT_PAGE) {
		CURRENT_PAGE = cURRENT_PAGE;
	}
	public String getCOUNTER_PER_PAGE() {
		return COUNTER_PER_PAGE;
	}
	public void setCOUNTER_PER_PAGE(String cOUNTER_PER_PAGE) {
		COUNTER_PER_PAGE = cOUNTER_PER_PAGE;
	}
	public String getMANAGE_TYP() {
		return MANAGE_TYP;
	}
	public void setMANAGE_TYP(String mANAGE_TYP) {
		MANAGE_TYP = mANAGE_TYP;
	}
	public String getPICKUP_YN() {
		return PICKUP_YN;
	}
	public void setPICKUP_YN(String pICKUPYN) {
		PICKUP_YN = pICKUPYN;
	}
	public String getMAINTN_OB() {
		return MAINTN_OB;
	}
	public void setMAINTN_OB(String mAINTNOB) {
		MAINTN_OB = mAINTNOB;
	}
	public String getTAXTAXION_AT() {
		return TAXTAXION_AT;
	}
	public void setTAXTAXION_AT(String tAXTAXIONAT) {
		TAXTAXION_AT = tAXTAXIONAT;
	}
	
	public String getYEAR() {
		return YEAR;
	}
	public void setYEAR(String yEAR) {
		YEAR = yEAR;
	}
	public String getTAX_YN() {
		return TAX_YN;
	}
	public void setTAX_YN(String tAXYN) {
		TAX_YN = tAXYN;
	}
	public String getCAL_STATUS() {
		return CAL_STATUS;
	}
	public void setCAL_STATUS(String cALSTATUS) {
		CAL_STATUS = cALSTATUS;
	}			
	public String getBJ_CD() {
		return BJ_CD;
	}
	public void setBJ_CD(String bj_cd) {
		BJ_CD = bj_cd;
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
	public int getINTCURPAGE() {
		return INTCURPAGE;
	}
	public void setINTCURPAGE(int intcurpage) {
		INTCURPAGE = intcurpage;
	}
	public String getJUMYONGNAME() {
		return JUMYONGNAME;
	}
	public void setJUMYONGNAME(String jumyongname) {
		JUMYONGNAME = jumyongname;
	}
	public String getNUMBERVALUE() {
		return NUMBERVALUE;
	}
	public void setNUMBERVALUE(String numbervalue) {
		NUMBERVALUE = numbervalue;
	}

	public String getSECTION() {
		return SECTION;
	}
	public void setSECTION(String section) {
		SECTION = section;
	}
	public String getTAX_SET() {
		return TAX_SET;
	}
	public void setTAX_SET(String tax_set) {
		TAX_SET = tax_set;
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
	
	
}
