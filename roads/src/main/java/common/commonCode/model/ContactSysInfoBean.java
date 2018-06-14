//	2009		Kim Yun Seo

package main.java.common.commonCode.model;

public class ContactSysInfoBean {

	private String SI_CD		= "";
	private String GU_CD		= "";
	private String SAEALL_IP	= "";
	private String SAEALL_PORT	= "";
	private String SAEALL_PATH	= "";
	
	
	public String getGU_CD() {
		return GU_CD;
	}
	public void setGU_CD(String gu_cd) {
		GU_CD = gu_cd;
	}
	public String getSAEALL_IP() {
		return SAEALL_IP;
	}
	public void setSAEALL_IP(String saeall_ip) {
		SAEALL_IP = saeall_ip;
	}
	public String getSAEALL_PATH() {
		return SAEALL_PATH;
	}
	public void setSAEALL_PATH(String saeall_path) {
		SAEALL_PATH = saeall_path;
	}
	public String getSAEALL_PORT() {
		return SAEALL_PORT;
	}
	public void setSAEALL_PORT(String saeall_port) {
		SAEALL_PORT = saeall_port;
	}
	public String getSI_CD() {
		return SI_CD;
	}
	public void setSI_CD(String si_cd) {
		SI_CD = si_cd;
	}
	
	
}
