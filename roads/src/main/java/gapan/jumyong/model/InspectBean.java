package main.java.gapan.jumyong.model;


import main.java.common.model.RoadsBaseBean;

public class InspectBean extends RoadsBaseBean {
	private String ADMIN_NO				;
	private int SEQ					;
	private String RESULT				;	
	private String INSPECTOR			;
	private String INSPECT_DATE			;
	private String INSPECT_OPINION		;
	private String MANAGER_OPINION		;
	private String APPROVAL_CONDITION	;
	private String NAME					;
	
	public String getADMIN_NO() {
		return ADMIN_NO;
	}
	public void setADMIN_NO(String admin_no) {
		this.ADMIN_NO = admin_no;
	}
	public int getSEQ() {
		return SEQ;
	}
	public void setSEQ(int seq) {
		this.SEQ = seq;
	}
	public String getRESULT() {
		return RESULT;
	}
	public void setRESULT(String result ) {
		this.RESULT = result;
	}
	public String getINSPECTOR() {
		return INSPECTOR;
	}
	public void setINSPECTOR(String inspector) {
		this.INSPECTOR = inspector;
	}
	public String getINSPECT_DATE() {
		return INSPECT_DATE;
	}
	public void setINSPECT_DATE(String inspect_date) {
		this.INSPECT_DATE = inspect_date;
	}
	public String getINSPECT_OPINION() {
		return INSPECT_OPINION;
	}
	public void setINSPECT_OPINION(String inspect_opnion) {
		this.INSPECT_OPINION = inspect_opnion;
	}
	public String getMANAGER_OPINION() {
		return MANAGER_OPINION;
	}
	public void setMANAGER_OPINION(String manager_opnion) {
		this.MANAGER_OPINION = manager_opnion;
	}
	public String getAPPROVAL_CONDITION() {
		return APPROVAL_CONDITION;
	}
	public void setAPPROVAL_CONDITION(String approval_condition) {
		this.APPROVAL_CONDITION = approval_condition;
	}
	public String getNAME() {
		return NAME;
	}
	public void setNAME(String name1) {
		this.NAME = name1;
	}
	
}
