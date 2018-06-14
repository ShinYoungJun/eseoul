package main.java.admin.model;

import main.java.common.model.RoadsBaseBean;

public class OfficeCodeBean extends RoadsBaseBean {
	private String OFFICE_NM;
	private String OFFICE_CD;
	private String JIJUM_NM;
	private String JIJUM_CD;
	private String JIJUM_CK;
	private String GU_CD;
	private int BOARD_NUM = 0;
	
	public int getBOARD_NUM() {
		return BOARD_NUM;
	}
	public void setBOARD_NUM(int bOARDNUM) {
		BOARD_NUM = bOARDNUM;
	}
	public String getOFFICE_NM() {
		return OFFICE_NM;
	}
	public void setOFFICE_NM(String oFFICENM) {
		OFFICE_NM = oFFICENM;
	}
	public String getOFFICE_CD() {
		return OFFICE_CD;
	}
	public void setOFFICE_CD(String oFFICECD) {
		OFFICE_CD = oFFICECD;
	}
	public String getJIJUM_NM() {
		return JIJUM_NM;
	}
	public void setJIJUM_NM(String jIJUMNM) {
		JIJUM_NM = jIJUMNM;
	}
	public String getJIJUM_CD() {
		return JIJUM_CD;
	}
	public void setJIJUM_CD(String jIJUMCD) {
		JIJUM_CD = jIJUMCD;
	}
	public String getJIJUM_CK() {
		return JIJUM_CK;
	}
	public void setJIJUM_CK(String jIJUMCK) {
		JIJUM_CK = jIJUMCK;
	}
	public String getGU_CD() {
		return GU_CD;
	}
	public void setGU_CD(String gUCD) {
		GU_CD = gUCD;
	}
	
	
	

}
