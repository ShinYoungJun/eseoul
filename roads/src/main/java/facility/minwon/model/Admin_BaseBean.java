//	2009		Kim Yun Seo

package main.java.facility.minwon.model;

public class Admin_BaseBean {

//	String	ADMIN_NO	= "";
//	String	SEQ			= "";
	String	CORP_CD		= "";
	String	GU_CODE		= "";
	String	REQUEST_NO	= "";
	String	REGDATE		= "";
	String	UP_DATE		= "";
	String	MANAGER		= "";
	String	FINISH_ID	= "";
	String	CHECK_YN	= "";
	String	TAX_YN		= "";
	
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
	public String getCORP_CD() {
		return CORP_CD;
	}
	public void setCORP_CD(String corp_cd) {
		CORP_CD = corp_cd;
	}
	public String getGU_CODE() {
		return GU_CODE;
	}
	public void setGU_CODE(String gu_code) {
		GU_CODE = gu_code;
	}
	public String getREQUEST_NO() {
		return REQUEST_NO;
	}
	public void setREQUEST_NO(String request_no) {
		REQUEST_NO = request_no;
	}
	public String getTAX_YN() {
		return TAX_YN;
	}
	public void setTAX_YN(String tax_yn) {
		TAX_YN = tax_yn;
	}
}
