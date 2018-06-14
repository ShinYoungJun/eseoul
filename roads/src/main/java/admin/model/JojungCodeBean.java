package main.java.admin.model;

import main.java.common.model.RoadsBaseBean;

public class JojungCodeBean extends RoadsBaseBean {

	private int ADD_SUM = 0;
	
	private String CNT = "";

	public int getADD_SUM() {
		return ADD_SUM;
	}

	public void setADD_SUM(int addSum) {
		this.ADD_SUM = addSum;
	}
	
	public String getCNT() {
		return CNT;
	}

	public void setCNT(String cnt) {
		this.CNT = cnt;
	}
}
