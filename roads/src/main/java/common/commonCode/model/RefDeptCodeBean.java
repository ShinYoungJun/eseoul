//	2009		Kim Yun Seo

package main.java.common.commonCode.model;

public class RefDeptCodeBean {

	//  시군구,부서
	private String GU_CD	= "";
	private String GU_NM	= "";
	private String DEPT_CD	= "";
	private String DEPT_NM	= "";
	
	private String ORG_CD	= "";
	private String MANAGE_WORK	= "";
	private String SIGU_CD	= "";
	
	
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
	public String getGU_CD() {
		return GU_CD;
	}
	public void setGU_CD(String gu_cd) {
		GU_CD = gu_cd;
	}
	public String getGU_NM() {
		return GU_NM;
	}
	public void setGU_NM(String gu_nm) {
		GU_NM = gu_nm;
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
	public String getSIGU_CD() {
		return SIGU_CD;
	}
	public void setSIGU_CD(String sigu_cd) {
		SIGU_CD = sigu_cd;
	}
	
	
}
