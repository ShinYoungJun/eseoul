package main.java.gapan.gapan.model;

import main.java.common.model.RoadsBaseBean;

public class OperBean extends RoadsBaseBean {

	private String GAPAN_NO = "";

	private String SG_TYP = "";
	
	private String SG_SEL = "";

	private String MEM_NUM = "";
	
	private String OPEN_TIME = "";
	
	private String CLOSE_TIME = "";
	
	private String PERMIT_DATE = "";
	
	private String DAY_SALES = "";
	
	private String UN_TYP = "";
	
	private String UN_TXT = "";

	private String NOTES = "";

	public String getCLOSE_TIME() {
		return CLOSE_TIME;
	}

	public void setCLOSE_TIME(String close_time) {
		CLOSE_TIME = close_time;
	}

	public String getDAY_SALES() {
		return DAY_SALES;
	}

	public void setDAY_SALES(String day_sales) {
		DAY_SALES = day_sales;
	}

	public String getGAPAN_NO() {
		return GAPAN_NO;
	}

	public void setGAPAN_NO(String gapan_no) {
		GAPAN_NO = gapan_no;
	}

	public String getMEM_NUM() {
		return MEM_NUM;
	}

	public void setMEM_NUM(String mem_num) {
		MEM_NUM = mem_num;
	}

	public String getNOTES() {
		return NOTES;
	}

	public void setNOTES(String notes) {
		NOTES = notes;
	}

	public String getOPEN_TIME() {
		return OPEN_TIME;
	}

	public void setOPEN_TIME(String open_time) {
		OPEN_TIME = open_time;
	}

	public String getPERMIT_DATE() {
		return PERMIT_DATE;
	}

	public void setPERMIT_DATE(String permit_date) {
		PERMIT_DATE = permit_date;
	}

	public String getSG_SEL() {
		return SG_SEL;
	}

	public void setSG_SEL(String sg_sel) {
		SG_SEL = sg_sel;
	}

	public String getSG_TYP() {
		return SG_TYP;
	}

	public void setSG_TYP(String sg_typ) {
		SG_TYP = sg_typ;
	}

	public String getUN_TXT() {
		return UN_TXT;
	}

	public void setUN_TXT(String un_txt) {
		UN_TXT = un_txt;
	}

	public String getUN_TYP() {
		return UN_TYP;
	}

	public void setUN_TYP(String un_typ) {
		UN_TYP = un_typ;
	}
	

}

	