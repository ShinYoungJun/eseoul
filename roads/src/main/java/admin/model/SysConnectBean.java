package main.java.admin.model;

import main.java.common.model.RoadsBaseBean;

public class SysConnectBean extends RoadsBaseBean {

	private String SYSTEM_SET = "";
	
	private String SYSTEM_NM = "";
	
	private String USER_ID = "";

	private String WORK_TYPE = "";
	
	private String WORK_NM = "";

	private String ADMIN_NO = "";

	private String RESULT = "";
	
	private String RESULT_NM = "";

	private String REG_DATE = "";

	private int SEQ = 0;

	public String getADMIN_NO() {
		return ADMIN_NO;
	}

	public void setADMIN_NO(String admin_no) {
		ADMIN_NO = admin_no;
	}

	public String getREG_DATE() {
		return REG_DATE;
	}

	public void setREG_DATE(String reg_date) {
		REG_DATE = reg_date;
	}

	public String getRESULT() {
		return RESULT;
	}

	public void setRESULT(String result) {
		RESULT = result;
	}

	public String getRESULT_NM() {
		return RESULT_NM;
	}

	public void setRESULT_NM(String result_nm) {
		RESULT_NM = result_nm;
	}

	public int getSEQ() {
		return SEQ;
	}

	public void setSEQ(int seq) {
		SEQ = seq;
	}

	public String getSYSTEM_NM() {
		return SYSTEM_NM;
	}

	public void setSYSTEM_NM(String system_nm) {
		SYSTEM_NM = system_nm;
	}

	public String getSYSTEM_SET() {
		return SYSTEM_SET;
	}

	public void setSYSTEM_SET(String system_set) {
		SYSTEM_SET = system_set;
	}

	public String getUSER_ID() {
		return USER_ID;
	}

	public void setUSER_ID(String user_id) {
		USER_ID = user_id;
	}

	public String getWORK_NM() {
		return WORK_NM;
	}

	public void setWORK_NM(String work_nm) {
		WORK_NM = work_nm;
	}

	public String getWORK_TYPE() {
		return WORK_TYPE;
	}

	public void setWORK_TYPE(String work_type) {
		WORK_TYPE = work_type;
	}
}

