package main.java.admin.model;

import main.java.common.model.RoadsBaseBean;

public class UserRegBean extends RoadsBaseBean {

	private String userGrade = "";
	
	private String grade ="";
	
	private String USER_ID = "";
	
	private String NAME = "";

	private String PW = "";

	private String SIGU_CD = "";

	private String DEPT_CD = "";
	
	private String DEPT_NM = "";

	private String SECTION = "";

	private String TEL = "";

	private String HP = "";

	private String TEL_EXT = "";

	private String EMAIL = "";

	private String IP = "";

	private String POSITION = "";

	private String PW_DATE = "";

	private int PW_NUM = 0;

	private int ERROR_NUM = 0;

	private String REQUEST_DATE = "";

	private String APPROVAL_DATE = "";	
	
	private String REG_DATE = "";
	
	private String UP_DATE = "";
	
	private String SECTION_NAME = "";
	
	private String SI_NM = "";
	
	private String GU_NM = "";
	
	private String MENU_CD = "";
	
	private String MENU_NM = "";
	
	private String CHK = "";
	
	private String GU_CD = "";	
	
	private String WORK_ID = "";
	
	private String BUKWA_ID = "";
	
	private String ELEC_ID = "";
	
	private String SAEALL_ID = "";

	private String PW_SHA = "";
	
	private String LAST_CONN_DATE = "";	// 마지막 접속일
	
	private String INSARANGKEY = "";	//인사대체키
	
	public String getLAST_CONN_DATE() {
		return LAST_CONN_DATE;
	}

	public void setLAST_CONN_DATE(String lASTCONNDATE) {
		LAST_CONN_DATE = lASTCONNDATE;
	}

	public String getPW_SHA() {
		return PW_SHA;
	}

	public void setPW_SHA(String pWSHA) {
		PW_SHA = pWSHA;
	}

	public String getAPPROVAL_DATE() {
		return APPROVAL_DATE;
	}

	public void setAPPROVAL_DATE(String approval_date) {
		APPROVAL_DATE = approval_date;
	}

	public String getBUKWA_ID() {
		return BUKWA_ID;
	}

	public void setBUKWA_ID(String bukwa_id) {
		BUKWA_ID = bukwa_id;
	}

	public String getCHK() {
		return CHK;
	}

	public void setCHK(String chk) {
		CHK = chk;
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

	public String getELEC_ID() {
		return ELEC_ID;
	}

	public void setELEC_ID(String elec_id) {
		ELEC_ID = elec_id;
	}

	public String getEMAIL() {
		return EMAIL;
	}

	public void setEMAIL(String email) {
		EMAIL = email;
	}

	public int getERROR_NUM() {
		return ERROR_NUM;
	}

	public void setERROR_NUM(int error_num) {
		ERROR_NUM = error_num;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

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

	public String getHP() {
		return HP;
	}

	public void setHP(String hp) {
		HP = hp;
	}

	public String getIP() {
		return IP;
	}

	public void setIP(String ip) {
		IP = ip;
	}

	public String getMENU_CD() {
		return MENU_CD;
	}

	public void setMENU_CD(String menu_cd) {
		MENU_CD = menu_cd;
	}

	public String getMENU_NM() {
		return MENU_NM;
	}

	public void setMENU_NM(String menu_nm) {
		MENU_NM = menu_nm;
	}

	public String getNAME() {
		return NAME;
	}

	public void setNAME(String name) {
		NAME = name;
	}

	public String getPOSITION() {
		return POSITION;
	}

	public void setPOSITION(String position) {
		POSITION = position;
	}

	public String getPW() {
		return PW;
	}

	public void setPW(String pw) {
		PW = pw;
	}

	public String getPW_DATE() {
		return PW_DATE;
	}

	public void setPW_DATE(String pw_date) {
		PW_DATE = pw_date;
	}

	public int getPW_NUM() {
		return PW_NUM;
	}

	public void setPW_NUM(int pw_num) {
		PW_NUM = pw_num;
	}

	public String getREG_DATE() {
		return REG_DATE;
	}

	public void setREG_DATE(String reg_date) {
		REG_DATE = reg_date;
	}

	public String getREQUEST_DATE() {
		return REQUEST_DATE;
	}

	public void setREQUEST_DATE(String request_date) {
		REQUEST_DATE = request_date;
	}

	public String getSAEALL_ID() {
		return SAEALL_ID;
	}

	public void setSAEALL_ID(String saeall_id) {
		SAEALL_ID = saeall_id;
	}

	public String getSECTION() {
		return SECTION;
	}

	public void setSECTION(String section) {
		SECTION = section;
	}

	public String getSECTION_NAME() {
		return SECTION_NAME;
	}

	public void setSECTION_NAME(String section_name) {
		SECTION_NAME = section_name;
	}

	public String getSI_NM() {
		return SI_NM;
	}

	public void setSI_NM(String si_nm) {
		SI_NM = si_nm;
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

	public String getTEL_EXT() {
		return TEL_EXT;
	}

	public void setTEL_EXT(String tel_ext) {
		TEL_EXT = tel_ext;
	}

	public String getUP_DATE() {
		return UP_DATE;
	}

	public void setUP_DATE(String up_date) {
		UP_DATE = up_date;
	}

	public String getUSER_ID() {
		return USER_ID;
	}

	public void setUSER_ID(String user_id) {
		USER_ID = user_id;
	}

	public String getUserGrade() {
		return userGrade;
	}

	public void setUserGrade(String userGrade) {
		this.userGrade = userGrade;
	}

	public String getWORK_ID() {
		return WORK_ID;
	}

	public void setWORK_ID(String work_id) {
		WORK_ID = work_id;
	}

	public String getINSARANGKEY() {
		return INSARANGKEY;
	}

	public void setINSARANGKEY(String INSARANGKEY) {
		this.INSARANGKEY = INSARANGKEY;
	}

	
}
