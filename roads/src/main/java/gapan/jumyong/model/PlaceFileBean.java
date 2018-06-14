package main.java.gapan.jumyong.model;


import main.java.common.model.RoadsBaseBean;

public class PlaceFileBean extends RoadsBaseBean {
	private String ADMIN_NO				;
	private int SEQ						;	
	private String DATA_TYPE			;
	private String DATA_EXPLAIN			;
	private String ATTACH_FILE			;
	private String ATTACH_SAVED_FILE	;
	private String ATTACH_SIZE			;
	private String DATA_TYPE_NAME		;
	private String REGDATE				;
	
	public String getADMIN_NO() {
		return ADMIN_NO;
	}
	public void setADMIN_NO(String admin_no) {
		ADMIN_NO = admin_no;
	}
	public String getATTACH_FILE() {
		return ATTACH_FILE;
	}
	public void setATTACH_FILE(String attach_file) {
		ATTACH_FILE = attach_file;
	}
	public String getATTACH_SAVED_FILE() {
		return ATTACH_SAVED_FILE;
	}
	public void setATTACH_SAVED_FILE(String attach_saved_file) {
		ATTACH_SAVED_FILE = attach_saved_file;
	}
	public String getATTACH_SIZE() {
		return ATTACH_SIZE;
	}
	public void setATTACH_SIZE(String attach_size) {
		ATTACH_SIZE = attach_size;
	}
	public String getDATA_EXPLAIN() {
		return DATA_EXPLAIN;
	}
	public void setDATA_EXPLAIN(String data_explain) {
		DATA_EXPLAIN = data_explain;
	}
	public String getDATA_TYPE() {
		return DATA_TYPE;
	}
	public void setDATA_TYPE(String data_type) {
		DATA_TYPE = data_type;
	}
	public String getDATA_TYPE_NAME() {
		return DATA_TYPE_NAME;
	}
	public void setDATA_TYPE_NAME(String data_type_name) {
		DATA_TYPE_NAME = data_type_name;
	}
	public String getREGDATE() {
		return REGDATE;
	}
	public void setREGDATE(String regdate) {
		REGDATE = regdate;
	}
	public int getSEQ() {
		return SEQ;
	}
	public void setSEQ(int seq) {
		SEQ = seq;
	}
	
	
	
	

}
