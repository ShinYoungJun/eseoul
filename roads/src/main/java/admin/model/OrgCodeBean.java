package main.java.admin.model;

public class OrgCodeBean {
	
	//  기관,부서
	private String ORG_CD	= "";
	private String ORG_NM	= "";
	private String DEPT_CD	= "";
	private String DEPT_NM	= "";
	private String MANAGE_WORK	= "";
	private String SIGU_CD	= "";
	
	//********** BEGIN_현진_20120313
	private String GU_NM = "";

	public String getGU_NM() {
		return GU_NM;
	}
	public void setGU_NM(String gUNM) {
		GU_NM = gUNM;
	}
	//********** END_현진_20120313




	public String getDEPT_CD() {
		return DEPT_CD;
	}
	public void setDEPT_CD(String dept_cd) {
		DEPT_CD = dept_cd;
	}
	public String getDEPT_NM() {
		return DEPT_NM;
	}
	public void setDEPT_NM(String dept_nm) {
		DEPT_NM = dept_nm;
	}
	public String getMANAGE_WORK() {
		return MANAGE_WORK;
	}
	public void setMANAGE_WORK(String manage_work) {
		MANAGE_WORK = manage_work;
	}
	public String getORG_CD() {
		return ORG_CD;
	}
	public void setORG_CD(String org_cd) {
		ORG_CD = org_cd;
	}
	public String getORG_NM() {
		return ORG_NM;
	}
	public void setORG_NM(String org_nm) {
		ORG_NM = org_nm;
	}
	public String getSIGU_CD() {
		return SIGU_CD;
	}
	public void setSIGU_CD(String sigu_cd) {
		SIGU_CD = sigu_cd;
	}
	

}
