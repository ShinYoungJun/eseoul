package main.java.admin.model;

import main.java.common.model.RoadsBaseBean;

public class RefSectionMappingBean extends RoadsBaseBean {
	private String SECTION = "";
	private String SECTION_NAME = "";
	private String USING_MODE = "";
	
	public String getSECTION() {
		return SECTION;
	}
	public void setSECTION(String sECTION) {
		SECTION = sECTION;
	}
	public String getSECTION_NAME() {
		return SECTION_NAME;
	}
	public void setSECTION_NAME(String sECTIONNAME) {
		SECTION_NAME = sECTIONNAME;
	}
	public String getUSING_MODE() {
		return USING_MODE;
	}
	public void setUSING_MODE(String uSINGMODE) {
		USING_MODE = uSINGMODE;
	}

}
