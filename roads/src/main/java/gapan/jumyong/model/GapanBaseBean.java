package main.java.gapan.jumyong.model;

import main.java.common.model.RoadsBaseBean;

public class GapanBaseBean extends RoadsBaseBean {

	private String GAPAN_NO = "";
	private String REG_DATE = "";
	private String UP_DATE = "";
	private String MANAGER = "";
	private String FINISH_ID = "";
	private String CLOSE_DATE = "";
	private String GP_TYPE = "";
	
	public String getCLOSE_DATE() {
		return CLOSE_DATE;
	}
	public void setCLOSE_DATE(String close_date) {
		CLOSE_DATE = close_date;
	}
	public String getFINISH_ID() {
		return FINISH_ID;
	}
	public void setFINISH_ID(String finish_id) {
		FINISH_ID = finish_id;
	}
	public String getGAPAN_NO() {
		return GAPAN_NO;
	}
	public void setGAPAN_NO(String gapan_no) {
		GAPAN_NO = gapan_no;
	}
	public String getGP_TYPE() {
		return GP_TYPE;
	}
	public void setGP_TYPE(String gp_type) {
		GP_TYPE = gp_type;
	}
	public String getMANAGER() {
		return MANAGER;
	}
	public void setMANAGER(String manager) {
		MANAGER = manager;
	}
	public String getREG_DATE() {
		return REG_DATE;
	}
	public void setREG_DATE(String reg_date) {
		REG_DATE = reg_date;
	}
	public String getUP_DATE() {
		return UP_DATE;
	}
	public void setUP_DATE(String up_date) {
		UP_DATE = up_date;
	}

	
}

	