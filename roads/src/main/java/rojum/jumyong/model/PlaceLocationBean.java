package main.java.rojum.jumyong.model;


import main.java.common.model.RoadsBaseBean;

public class PlaceLocationBean extends RoadsBaseBean {
	private String ADMIN_NO				;
	private int SEQ						;
	private String LOCATE_X				;
	private String LOCATE_Y				;
	private String WIDTH				;
	private String HEIGHT				;
	private String AREA					;
	private String EXPLAIN				;
	
	
	public String getADMIN_NO() {
		return ADMIN_NO;
	}
	public void setADMIN_NO(String admin_no) {
		this.ADMIN_NO = admin_no;
	}
	
	public int getSEQ() {
		return SEQ;
	}
	public void setSEQ(int seq) {
		this.SEQ = seq;
	}
	
	
	
	public String getLOCATE_X() {
		return LOCATE_X;
	}
	public void setLOCATE_X(String value) {
		this.LOCATE_X = value;
	}
	
	public String getLOCATE_Y() {
		return LOCATE_Y;
	}
	public void setLOCATE_Y(String value) {
		this.LOCATE_Y = value;
	}
	
	public String getWIDTH() {
		return WIDTH;
	}
	public void setWIDTH(String value) {
		this.WIDTH = value;
	}
	
	public String getHEIGHT() {
		return HEIGHT;
	}
	public void setHEIGHT(String value) {
		this.HEIGHT = value;
	}
	
	public String getAREA() {
		return AREA;
	}
	public void setAREA(String value) {
		this.AREA = value;
	}
	
	public String getEXPLAIN() {
		return EXPLAIN;
	}
	public void setEXPLAIN(String value) {
		this.EXPLAIN = value;
	}
	
}
