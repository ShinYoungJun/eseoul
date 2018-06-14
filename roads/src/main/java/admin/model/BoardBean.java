package main.java.admin.model;

import main.java.common.model.RoadsBaseBean;

public class BoardBean extends RoadsBaseBean {

	private String TITLE = "";
	
	private String USER_ID = "";

	private String PUBLIC_YN = "";
	
	private String PUBLIC_NM = "";

	private String CONTENT = "";

	private String REGDATE = "";
	
	private String NOTICE_FROMDATE = "";
	
	private String NOTICE_TODATE = "";

	private String FILE_NAME = "";
	
	private int BOARD_ID = 0;

	public String getTITLE() {
		return TITLE;
	}

	public void setTITLE(String title) {
		this.TITLE = title;
	}
	
	public String getUSER_ID() {
		return USER_ID;
	}

	public void setUSER_ID(String userId) {
		this.USER_ID = userId;
	}

	public String getPUBLIC_YN() {
		return PUBLIC_YN;
	}

	public void setPUBLIC_YN(String publicYn) {
		this.PUBLIC_YN = publicYn;
	}
	
	public String getPUBLIC_NM() {
		return PUBLIC_NM;
	}

	public void setPUBLIC_NM(String publicNm) {
		this.PUBLIC_NM = publicNm;
	}

	public String getCONTENT() {
		return CONTENT;
	}

	public void setCONTENT(String content) {
		this.CONTENT = content;
	}

	public String getREGDATE() {
		return REGDATE;
	}

	public void setREGDATE(String regdate) {
		this.REGDATE = regdate;
	}

	public String getNOTICE_FROMDATE() {
		return NOTICE_FROMDATE;
	}

	public void setNOTICE_FROMDATE(String noticeFromdate) {
		this.NOTICE_FROMDATE = noticeFromdate;
	}
	
	public String getNOTICE_TODATE() {
		return NOTICE_TODATE;
	}

	public void setNOTICE_TODATE(String noticeTodate) {
		this.NOTICE_TODATE = noticeTodate;
	}
	
	public String getFILE_NAME() {
		return FILE_NAME;
	}

	public void setFILE_NAME(String fileName) {
		this.FILE_NAME = fileName;
	}
	
	public int getBOARD_ID() {
		return BOARD_ID;
	}

	public void setBOARD_ID(int boardId) {
		this.BOARD_ID = boardId;
	}
}
