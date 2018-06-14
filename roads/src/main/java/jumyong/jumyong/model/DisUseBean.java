package main.java.jumyong.jumyong.model;


import main.java.common.model.RoadsBaseBean;

public class DisUseBean extends RoadsBaseBean {
	private String ADMIN_NO				;
	private String DISUSE_MANAGER		;
	private String DISUSE_DATE			;	
	private String DISUSE_REASON		;
	private String SECTION				;
	private String OLD_SECTION			;
	
	public String getSECTION() {
		return SECTION;
	}
	public void setSECTION(String sECTION) {
		SECTION = sECTION;
	}
	public String getADMIN_NO() {
		return ADMIN_NO;
	}
	public void setADMIN_NO(String admin_no) {
		ADMIN_NO = admin_no;
	}
	public String getDISUSE_DATE() {
		return DISUSE_DATE;
	}
	public void setDISUSE_DATE(String disuse_date) {
		DISUSE_DATE = disuse_date;
	}
	public String getDISUSE_MANAGER() {
		return DISUSE_MANAGER;
	}
	public void setDISUSE_MANAGER(String disuse_manager) {
		DISUSE_MANAGER = disuse_manager;
	}
	public String getDISUSE_REASON() {
		return DISUSE_REASON;
	}
	public void setDISUSE_REASON(String disuse_reason) {
		DISUSE_REASON = disuse_reason;
	}
	public String getOLD_SECTION() {
		return OLD_SECTION;
	}
	public void setOLD_SECTION(String oLDSECTION) {
		OLD_SECTION = oLDSECTION;
	}
	
}
