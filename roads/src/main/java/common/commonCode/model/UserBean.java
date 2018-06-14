//	2009		Kim Yun Seo

package main.java.common.commonCode.model;

public class UserBean {

	String	NAME		= "";
	String	ORG_CD		= "";
	String	GU_NM		= "";
	String	DEPT_CD		= "";
	String	DEPT_NM		= "";
	String	TEL			= "";
	String	SIGU_CD		= "";
	String 	ADDR		= "";
	String  PNU			= "";
	
	public String getADDR() {
		return ADDR;
	}
	public void setADDR(String addr) {
		ADDR = addr;
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
	public String getGU_NM() {
		return GU_NM;
	}
	public void setGU_NM(String gu_nm) {
		GU_NM = gu_nm;
	}
	public String getNAME() {
		return NAME;
	}
	public void setNAME(String name) {
		NAME = name;
	}
	public String getORG_CD() {
		return ORG_CD;
	}
	public void setORG_CD(String org_cd) {
		ORG_CD = org_cd;
	}
	public String getPNU() {
		return PNU;
	}
	public void setPNU(String pnu) {
		PNU = pnu;
	}
	public String getSIGU_CD() {
		return SIGU_CD;
	}
	public void setSIGU_CD(String sigu_cd) {
		SIGU_CD = sigu_cd;
	}
	public String getTEL() {
		return TEL;
	}
	public void setTEL(String tel) {
		TEL = tel;
	}
	
	
}
