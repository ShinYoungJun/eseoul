package main.java.rojum.jumyong.model;


import main.java.common.model.RoadsBaseBean;

public class ExamineBean extends RoadsBaseBean {
	
	
	private String ADMIN_NO			= "";
	private String SEQ_KEY		= "";	
	private String RESULT		= "";
	private String CHECK_DATE		= "";
	private String CHECK_RESULT= "";
	private String OPINION		= "";
	private String NOTES		= "";
	private String ORGANIZATION= "";
	private String MANAGER		= "";
	private String TEL		= "";
	private String CONF_DATE	="";
	private String CONF_COMMENT	= "";
	
	
	
	
	public String getADMIN_NO() {
		return ADMIN_NO ;
	}
	public void setADMIN_NO(String admin_no  ) {
		this.ADMIN_NO = admin_no;
	}
	public String getSEQ_KEY() {
		return SEQ_KEY;
	}
	public void setSEQ_KEY(String seq_key) {
		this.SEQ_KEY = seq_key;
	}
	public String getRESULT() {
		return RESULT;
	}
	public void setRESULT(String result ) {
		this.RESULT = result ;
	}
	public String getCHECK_DATE() {
		return CHECK_DATE;
	}
	public void setCHECK_DATE(String check_date) {
		this.CHECK_DATE = check_date;
	}
	public String getCHECK_RESULT() {
		return CHECK_RESULT;
	}
	public void setCHECK_RESULT(String check_result) {
		this.CHECK_RESULT = check_result;
	}
	public String getOPINION() {
		return OPINION;
	}
	public void setOPINION(String opinion) {
		this.OPINION = opinion;
	}
	public String getNOTES() {
		return NOTES;
	}
	public void setNOTES(String notes) {
		this.NOTES = notes;
	}
	public String getORGANIZATION() {
		return ORGANIZATION;
	}
	public void setORGANIZATION(String organization) {
		this.ORGANIZATION = organization;
	}
	public String getMANAGER() {
		return MANAGER;
	}
	public void setMANAGER(String manager) {
		this.MANAGER = manager;
	}
	public String getTEL() {
		return TEL;
	}
	public void setTEL(String tel) {
		this.TEL = tel;
	}
	public String getCONF_DATE() {
		return CONF_DATE;
	}
	public void setCONF_DATE(String conf_date) {
		this.CONF_DATE = conf_date;
	}
	public String getCONF_COMMENT() {
		return CONF_COMMENT;
	}
	public void setCONF_COMMENT(String conf_comment) {
		this.CONF_COMMENT = conf_comment;
	}
	
}
