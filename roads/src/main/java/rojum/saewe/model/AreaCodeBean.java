package main.java.rojum.saewe.model;

import main.java.common.model.RoadsBaseBean;

public class AreaCodeBean extends RoadsBaseBean {

	private String SI_NM = "";

	private String GU_NM = "";

	private String HJ_NM = "";

	private String SI_CD = "";

	private String GU_CD = "";

	private String HJ_CD = "";

	private String AREA_CD = "";

	public String getSI_NM() {
		return SI_NM;
	}

	public void setSI_NM(String siNm) {
		this.SI_NM = siNm;
	}

	public String getGU_NM() {
		return GU_NM;
	}

	public void setGU_NM(String guNm) {
		this.GU_NM = guNm;
	}

	public String getHJ_NM() {
		return HJ_NM;
	}

	public void setHJ_NM(String hjNm) {
		this.HJ_NM = hjNm;
	}

	public String getSI_CD() {
		return SI_CD;
	}

	public void setSI_CD(String siCd) {
		this.SI_CD = siCd;
	}

	public String getGU_CD() {
		return GU_CD;
	}

	public void setGU_CD(String guCd) {
		this.GU_CD = guCd;
	}

	public String getHJ_CD() {
		return HJ_CD;
	}

	public void setHJ_CD(String hjCd) {
		this.HJ_CD = hjCd;
	}

	public String getAREA_CD() {
		return AREA_CD;
	}

	public void setAREA_CD(String areaCd) {
		this.AREA_CD = areaCd;
	}
}
