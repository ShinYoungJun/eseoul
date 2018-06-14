package main.java.admin.model;

public class DongCodeBean {
	
	//  시군구,부서
	private String GU_CD	= "";
	private String GU_NM	= "";
	private String DEPT_CD	= "";
	private String DEPT_NM	= "";
	
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

}
