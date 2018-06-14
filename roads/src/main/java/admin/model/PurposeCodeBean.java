package main.java.admin.model;

import main.java.common.model.RoadsBaseBean;

public class PurposeCodeBean extends RoadsBaseBean {

	private String SECTION = "";
	
	private String CLASS_CD = "";

	private String CLASS_NM = "";
	
	private String SORT_CD = "";

	private String SORT_NM = "";

	private String KIND_CD = "";

	private String KIND_NM = "";

	private String DANWII = "";
	
	private String GIGAN = "";

	private int MOMEY = 0;
	
	private float YOYUL = 0;

	private String CODE = "";

	private String CHECK_YN = "";

	//********** BEGIN_현진_20120314
	private String THEME = "";
	private String SECTION_NAME = "";
	private String USING_MODE = "";
	
	public String getTHEME() {
		return THEME;
	}

	public void setTHEME(String tHEME) {
		THEME = tHEME;
	}

	public String getSECTION_NAME() {
		return SECTION_NAME;
	}

	public void setSECTION_NAME(String sECTIONNAME) {
		SECTION_NAME = sECTIONNAME;
	}	
	
	//********** END_현진_20120314
	



	public String getUSING_MODE() {
		return USING_MODE;
	}

	public void setUSING_MODE(String uSINGMODE) {
		USING_MODE = uSINGMODE;
	}

	public String getSECTION() {
		return SECTION;
	}

	public void setSECTION(String section) {
		this.SECTION = section;
	}
	
	public String getCLASS_CD() {
		return CLASS_CD;
	}

	public void setCLASS_CD(String classCd) {
		this.CLASS_CD = classCd;
	}

	public String getCLASS_NM() {
		return CLASS_NM;
	}

	public void setCLASS_NM(String classNm) {
		this.CLASS_NM = classNm;
	}
	
	public String getSORT_CD() {
		return SORT_CD;
	}

	public void setSORT_CD(String sortCd) {
		this.SORT_CD = sortCd;
	}

	public String getSORT_NM() {
		return SORT_NM;
	}

	public void setSORT_NM(String sortNm) {
		this.SORT_NM = sortNm;
	}

	public String getDANWII() {
		return DANWII;
	}

	public void setDANWII(String danwii) {
		this.DANWII = danwii;
	}

	public String getGIGAN() {
		return GIGAN;
	}

	public void setGIGAN(String gigan) {
		this.GIGAN = gigan;
	}
	
	public String getKIND_CD() {
		return KIND_CD;
	}

	public void setKIND_CD(String kindCd) {
		this.KIND_CD = kindCd;
	}

	public String getKIND_NM() {
		return KIND_NM;
	}

	public void setKIND_NM(String kindNm) {
		this.KIND_NM = kindNm;
	}
	
	public int getMOMEY() {
		return MOMEY;
	}

	public void setMOMEY(int money) {
		this.MOMEY = money;
	}
	
	public float getYOYUL() {
		return YOYUL;
	}

	public void setYOYUL(float yoyul) {
		this.YOYUL = yoyul;
	}
	public String getCODE() {
		return CODE;
	}
	
	public void setCODE(String code) {
		this.CODE = code;
	}
	public String getCHECK_YN() {
		return CHECK_YN;
	}

	public void setCHECK_YN(String checkYn) {
		this.CHECK_YN = checkYn;
	}
}
