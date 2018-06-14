package main.java.jumyong.jumyong.model;


import main.java.common.model.RoadsBaseBean;

public class ConfBean extends RoadsBaseBean {	
	private String ADMIN_NO				;
	private String ORGANIZATION			;	
	private String CONF_DATE			;
	private String MANAGE_DEPT			;
	private String MANAGER				;
	private String TEL					;
	private String HP					;
	private String CONF_COMMENT			;
	private int SEQ				;
	
	public String getADMIN_NO() {
		return ADMIN_NO;
	}
	public void setADMIN_NO(String admin_no) {
		this.ADMIN_NO = admin_no;
	}
	
	public String getORGANIZATION() {
		return ORGANIZATION;
	}
	public void setORGANIZATION(String organization) {
		this.ORGANIZATION = organization;
	}
	
	public String getCONF_DATE() {
		return CONF_DATE;
	}
	public void setCONF_DATE(String conf_date) {
		this.CONF_DATE = conf_date;
	}
	
	public String getMANAGE_DEPT() {
		return MANAGE_DEPT;
	}
	public void setMANAGE_DEPT(String manage_dept) {
		this.MANAGE_DEPT = manage_dept;
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
	
	public String getHP() {
		return HP;
	}
	public void setHP(String hp) {
		this.HP = hp;
	}
	
	public String getCONF_COMMENT() {
		return CONF_COMMENT;
	}
	public void setCONF_COMMENT(String conf_comment) {
		this.CONF_COMMENT = conf_comment;
	}
	
	public int getSEQ() {
		return SEQ;
	}
	public void setSEQ(int seq) {
		this.SEQ = seq;
	}
	
	
}
