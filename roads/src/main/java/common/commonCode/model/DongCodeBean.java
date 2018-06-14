//	2009		Kim Yun Seo

package main.java.common.commonCode.model;

public class DongCodeBean {

	//	법정동
	private String BJ_CD	= "";
	private String BJ_NM	= "";
	
	//	행정동
	private String HJ_CD	= "";
	private String HJ_NM	= "";	

	public String getBJ_CD() {
		return BJ_CD;
	}
	public void setBJ_CD(String bj_cd) {
		BJ_CD = bj_cd;
	}
	public String getBJ_NM() {
		return BJ_NM;
	}
	public void setBJ_NM(String bj_nm) {
		BJ_NM = bj_nm;
	}
	public String getHJ_CD() {
		return HJ_CD;
	}
	public void setHJ_CD(String hj_cd) {
		HJ_CD = hj_cd;
	}
	public String getHJ_NM() {
		return HJ_NM;
	}
	public void setHJ_NM(String hj_nm) {
		HJ_NM = hj_nm;
	}

}
