//	2009		Kim Yun Seo
//	기간연장 저장BEAN

package main.java.junggi.gigan.model;

public	class	GiyeonBean {

	String	ADMIN_NO		= "";
	String	REGDATE			= "";
	String	BEFORE_FROMDATE	= "";
	String	BEFORE_TODATE	= "";
	String	AFTER_FROMDATE	= "";
	String	AFTER_TODATE	= "";
	String	NOTES			= "";
	String	MANAGER			= "";
	String	GU_CODE			= "";
	String	RN				= "";
	
	
	public String getRN() {
		return RN;
	}
	public void setRN(String rn) {
		RN = rn;
	}
	public String getADMIN_NO() {
		return ADMIN_NO;
	}
	public void setADMIN_NO(String admin_no) {
		ADMIN_NO = admin_no;
	}
	public String getREGDATE() {
		return REGDATE;
	}
	public void setREGDATE(String regdate) {
		REGDATE = regdate;
	}
	public String getBEFORE_FROMDATE() {
		return BEFORE_FROMDATE;
	}
	public void setBEFORE_FROMDATE(String before_fromdate) {
		BEFORE_FROMDATE = before_fromdate;
	}
	public String getBEFORE_TODATE() {
		return BEFORE_TODATE;
	}
	public void setBEFORE_TODATE(String before_todate) {
		BEFORE_TODATE = before_todate;
	}
	public String getAFTER_FROMDATE() {
		return AFTER_FROMDATE;
	}
	public void setAFTER_FROMDATE(String after_fromdate) {
		AFTER_FROMDATE = after_fromdate;
	}
	public String getAFTER_TODATE() {
		return AFTER_TODATE;
	}
	public void setAFTER_TODATE(String after_todate) {
		AFTER_TODATE = after_todate;
	}
	public String getNOTES() {
		return NOTES;
	}
	public void setNOTES(String notes) {
		NOTES = notes;
	}
	public String getMANAGER() {
		return MANAGER;
	}
	public void setMANAGER(String manager) {
		MANAGER = manager;
	}
	public String getGU_CODE() {
		return GU_CODE;
	}
	public void setGU_CODE(String gu_code) {
		GU_CODE = gu_code;
	}
}
