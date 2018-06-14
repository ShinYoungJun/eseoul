package main.java.rojum.map.model;


import main.java.common.model.RoadsBaseBean;

public class SearchBean extends RoadsBaseBean {
	private String GU_CD = "";
	private String BJ_CD = "";
	private String SAN = "";
	private String BONBUN = "";
	private String BUBUN = "";
	private String OWNER_NAME = "";
	private String MAINTN_OB = "";
	private String SURVEY_YEAR = "";
	private String MANAGE_TYP = "";
	//********** BEGIN_현진_20120313
	private String GUGAN_CD = "";

	public String getGUGAN_CD() {
		return GUGAN_CD;
	}
	public void setGUGAN_CD(String gUGANCD) {
		GUGAN_CD = gUGANCD;
	}
	//********** END_현진_20120313
	

	public String getSURVEY_YEAR() {
		return SURVEY_YEAR;
	}
	public void setSURVEY_YEAR(String sURVEY_YEAR) {
		SURVEY_YEAR = sURVEY_YEAR;
	}
	public String getMANAGE_TYP() {
		return MANAGE_TYP;
	}
	public void setMANAGE_TYP(String mANAGE_TYP) {
		MANAGE_TYP = mANAGE_TYP;
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
	public String getSAN() {
		return SAN;
	}
	public void setSAN(String sAN) {
		SAN = sAN;
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
	public String getMAINTN_OB() {
		return MAINTN_OB;
	}
	public void setMAINTN_OB(String mAINTN_OB) {
		MAINTN_OB = mAINTN_OB;
	}

}
