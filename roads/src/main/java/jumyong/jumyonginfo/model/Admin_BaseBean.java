//	2009		Kim Yun Seo

package main.java.jumyong.jumyonginfo.model;

public class Admin_BaseBean {

	String	ADMIN_NO	= "";
	String	SEQ			= "";
	String	REGDATE		= "";
	String	UP_DATE		= "";
	String	MANAGER		= "";
	String	FINISH_ID	= "";
	String	CHECK_YN	= "";
	
	public String getADMIN_NO() {
		return ADMIN_NO;
	}
	public void setADMIN_NO(String admin_no) {
		ADMIN_NO = admin_no;
	}
	public String getSEQ() {
		return SEQ;
	}
	public void setSEQ(String seq) {
		SEQ = seq;
	}
	public String getREGDATE() {
		return REGDATE;
	}
	public void setREGDATE(String regdate) {
		REGDATE = regdate;
	}
	public String getUP_DATE() {
		return UP_DATE;
	}
	public void setUP_DATE(String up_date) {
		UP_DATE = up_date;
	}
	public String getMANAGER() {
		return MANAGER;
	}
	public void setMANAGER(String manager) {
		MANAGER = manager;
	}
	public String getFINISH_ID() {
		return FINISH_ID;
	}
	public void setFINISH_ID(String finish_id) {
		FINISH_ID = finish_id;
	}
	public String getCHECK_YN() {
		return CHECK_YN;
	}
	public void setCHECK_YN(String check_yn) {
		CHECK_YN = check_yn;
	}
}
