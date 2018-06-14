package main.java.rojum.jumyong.model;


import main.java.common.model.RoadsBaseBean;

public class GuideBean extends RoadsBaseBean {	
	
	private String GAPAN_NO = "";
	private String GUIDE_DATE = "";
	private String FT_TYP_NM = "";
	private String FT_SEL_NM = "";
	private String ADDR = "";
	
	public String getGAPAN_NO() {
		return GAPAN_NO;
	}
	public void setGAPAN_NO(String gAPAN_NO) {
		GAPAN_NO = gAPAN_NO;
	}
	public String getGUIDE_DATE() {
		return GUIDE_DATE;
	}
	public void setGUIDE_DATE(String gUIDE_DATE) {
		GUIDE_DATE = gUIDE_DATE;
	}
	public String getFT_TYP_NM() {
		return FT_TYP_NM;
	}
	public void setFT_TYP_NM(String fT_TYP_NM) {
		FT_TYP_NM = fT_TYP_NM;
	}
	public String getFT_SEL_NM() {
		return FT_SEL_NM;
	}
	public void setFT_SEL_NM(String fT_SEL_NM) {
		FT_SEL_NM = fT_SEL_NM;
	}
	public String getADDR() {
		return ADDR;
	}
	public void setADDR(String aDDR) {
		ADDR = aDDR;
	}
	
}
