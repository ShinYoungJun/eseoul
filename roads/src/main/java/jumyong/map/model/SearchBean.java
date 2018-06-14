package main.java.jumyong.map.model;


import main.java.common.model.RoadsBaseBean;

public class SearchBean extends RoadsBaseBean {
	private String GU_CD = "";
	private String BJ_CD = "";
	private String SPC_CD = "";
	private String BONBUN = "";
	private String BUBUN = "";
	private String OWNER_NAME = "";
	private String SECTION	= "";
	private String TYPE		= "";
	private String TAX_SET  = "";
	
	private String PURPOSE_CD = "";

	public String getTAX_SET() {
		return TAX_SET;
	}
	public void setTAX_SET(String tAX_SET) {
		TAX_SET = tAX_SET;
	}
	public String getSECTION() {
		return SECTION;
	}
	public void setSECTION(String sECTION) {
		SECTION = sECTION;
	}
	public String getTYPE() {
		return TYPE;
	}
	public void setTYPE(String tYPE) {
		TYPE = tYPE;
	}
	public String getGU_CD() {
		return GU_CD;
	}
	public void setGU_CD(String gU_CD) {
		GU_CD = gU_CD;
	}
	public String getBJ_CD() {
		return BJ_CD;
	}
	public void setBJ_CD(String bJ_CD) {
		BJ_CD = bJ_CD;
	}
	
	public String getSPC_CD() {
		return SPC_CD;
	}
	public void setSPC_CD(String sPC_CD) {
		SPC_CD = sPC_CD;
	}
	public String getBONBUN() {
		return BONBUN;
	}
	public void setBONBUN(String bONBUN) {
		BONBUN = bONBUN;
	}
	public String getBUBUN() {
		return BUBUN;
	}
	public void setBUBUN(String bUBUN) {
		BUBUN = bUBUN;
	}
	public String getOWNER_NAME() {
		return OWNER_NAME;
	}
	public void setOWNER_NAME(String oWNER_NAME) {
		OWNER_NAME = oWNER_NAME;
	}
	public String getPURPOSE_CD() {
		return PURPOSE_CD;
	}
	public void setPURPOSE_CD(String pURPOSECD) {
		PURPOSE_CD = pURPOSECD;
	}
	
}
