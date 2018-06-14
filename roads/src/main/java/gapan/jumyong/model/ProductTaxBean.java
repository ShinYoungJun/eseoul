package main.java.gapan.jumyong.model;


import main.java.common.model.RoadsBaseBean;

public class ProductTaxBean extends RoadsBaseBean {
	
	private String ADMIN_NO		;
	private String SEQ			;
	private String YEAR			;
	private float AREA	;
	private int SUM_ADJUST		;
	private int REDUCTION_RATE	;
	private int SUM				;
	private String USE_SECTION	;
	private String REDUCTION_REASON	;
	
	public String getADMIN_NO() {
		return ADMIN_NO;
	}
	public void setADMIN_NO(String admin_no) {
		ADMIN_NO = admin_no;
	}
	public float getAREA() {
		return AREA;
	}
	public void setAREA(float area) {
		AREA = area;
	}
	public int getREDUCTION_RATE() {
		return REDUCTION_RATE;
	}
	public void setREDUCTION_RATE(int reduction_rate) {
		REDUCTION_RATE = reduction_rate;
	}
	public String getREDUCTION_REASON() {
		return REDUCTION_REASON;
	}
	public void setREDUCTION_REASON(String reduction_reason) {
		REDUCTION_REASON = reduction_reason;
	}
	public String getSEQ() {
		return SEQ;
	}
	public void setSEQ(String seq) {
		SEQ = seq;
	}
	public int getSUM() {
		return SUM;
	}
	public void setSUM(int sum) {
		SUM = sum;
	}
	public int getSUM_ADJUST() {
		return SUM_ADJUST;
	}
	public void setSUM_ADJUST(int sum_adjust) {
		SUM_ADJUST = sum_adjust;
	}
	public String getUSE_SECTION() {
		return USE_SECTION;
	}
	public void setUSE_SECTION(String use_section) {
		USE_SECTION = use_section;
	}
	public String getYEAR() {
		return YEAR;
	}
	public void setYEAR(String year) {
		YEAR = year;
	}
	
}
