package main.java.admin.model;

import main.java.common.model.RoadsBaseBean;

public class TaxCodeBean extends RoadsBaseBean {

	private String TAXCODE = "";
	
	private String TAXNAME = "";

	private String TAXGASAN = "";
	
	private String TAXPART = "";

	public String getTAXCODE() {
		return TAXCODE;
	}

	public void setTAXCODE(String taxcode) {
		this.TAXCODE = taxcode;
	}
	
	public String getTAXNAME() {
		return TAXNAME;
	}

	public void setTAXNAME(String taxname) {
		this.TAXNAME = taxname;
	}

	public String getTAXGASAN() {
		return TAXGASAN;
	}

	public void setTAXGASAN(String taxgasan) {
		this.TAXGASAN = taxgasan;
	}
	
	public String getTAXPART() {
		return TAXPART;
	}

	public void setTAXPART(String taxpart) {
		this.TAXPART = taxpart;
	}
}
