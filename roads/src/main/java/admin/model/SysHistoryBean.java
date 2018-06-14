package main.java.admin.model;

import main.java.common.model.RoadsBaseBean;

public class SysHistoryBean extends RoadsBaseBean {

	private String USER_ID = "";

	private String EVENT_TYPE = "";

	private String ADMIN_NO = "";
	
	private String NAME = "";

	private String MODIFICATION_CONT = "";

	private String REG_DATE = "";

	private String CUD_TYPE = "";
	
	private String CUD_NAME = "";
	
	private int SEQ = 0;
		
	public String getUSER_ID() {
		return USER_ID;
	}

	public void setUSER_ID(String userId) {
		this.USER_ID = userId;
	}

	public String getEVENT_TYPE() {
		return EVENT_TYPE;
	}

	public void setEVENT_TYPE(String eventType) {
		this.EVENT_TYPE = eventType;
	}

	public String getADMIN_NO() {
		return ADMIN_NO;
	}

	public void setADMIN_NO(String adminNo) {
		this.ADMIN_NO = adminNo;
	}

	public String getNAME() {
		return NAME;
	}

	public void setNAME(String name) {
		this.NAME = name;
	}
	
	public String getMODIFICATION_CONT() {
		return MODIFICATION_CONT;
	}

	public void setMODIFICATION_CONT(String modificationCont) {
		this.MODIFICATION_CONT = modificationCont;
	}

	public String getREG_DATE() {
		return REG_DATE;
	}

	public void setREG_DATE(String regDate) {
		this.REG_DATE = regDate;
	}

	public String getCUD_TYPE() {
		return CUD_TYPE;
	}

	public void setCUD_TYPE(String cudType) {
		this.CUD_TYPE = cudType;
	}
	
	public String getCUD_NAME() {
		return CUD_NAME;
	}

	public void setCUD_NAME(String cudName) {
		this.CUD_NAME = cudName;
	}	
	
	public int getSEQ() {
		return SEQ;
	}

	public void setSEQ(int seq) {
		this.SEQ = seq;
	}
}
