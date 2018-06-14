package main.java.gapan.jumyong.model;


import main.java.common.model.RoadsBaseBean;

public class SearchBean extends RoadsBaseBean {
	private int INTCURPAGE;
	private String FROMDATE;
	private String TODATE; 
	private String TYPE; 
	private String SECTION; 
	private String TAX_SET; 
	private String CHECK_YN;
	private String BJ_CD; 	
	private String BONBUN; 
	private  String BUBUN;
	
	private String NUMBERVALUE; 
	private String JUMYONGNAME; 
	private String PURPOSE; 
	private String GU_CODE;
	private String YEAR;
	private String TAX_YN;
	private String CAL_STATUS;
	
	private String TAXTAXION_AT = "";
	private String FT_TYP = "";
	
	//********** BEGIN_KANG_20120423
	private String Facility_No = "";
	//********** END_KANG_20120423
	
	
	
	public String getFacility_No() {
		return Facility_No;
	}
	public void setFacility_No(String facilityNo) {
		Facility_No = facilityNo;
	}
	public String getFT_TYP() {
		return FT_TYP;
	}
	public void setFT_TYP(String fTTYP) {
		FT_TYP = fTTYP;
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
	public String getCHECK_YN() {
		return CHECK_YN == null ? "" : CHECK_YN;
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
	public String getPURPOSE() {
		return PURPOSE;
	}
	public void setPURPOSE(String purpose) {
		PURPOSE = purpose;
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
