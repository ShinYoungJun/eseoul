package main.java.rojum.jumyong.model;


import main.java.common.model.RoadsBaseBean;

public class TaxCodeBean extends RoadsBaseBean {	
	private String TAXCODE = "";
	private String TAXNAME = "";
	public String getTAXCODE() {
		return TAXCODE;
	}
	public void setTAXCODE(String tAXCODE) {
		TAXCODE = tAXCODE;
	}
	public String getTAXNAME() {
		return TAXNAME;
	}
	public void setTAXNAME(String tAXNAME) {
		TAXNAME = tAXNAME;
	}
	
	
}
