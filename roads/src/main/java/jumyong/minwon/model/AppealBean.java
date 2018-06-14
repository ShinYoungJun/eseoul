//	2009		Kim Yun Seo
//	APPEAL

package main.java.jumyong.minwon.model;

public class AppealBean {

	private String ADMIN_NO		= "";
	private String NAME			= "";
	private String SSN			= "";
	private String BIZSSN		= "";
	private String BIZ_STATUS	= "";
	
	private String BIZ_TYPES	= "";
	private String POST			= "";
	private String SAN			= "";
	private String BON 			= "";
	private String BU 			= "";
	private String ADDR1		= "";
	private String ADDR2		= "";
	private String TEL			= "";

	private String HP			= "";
	private String EMAIL		= "";
	private String TOPOST		= "";
	private String TOSAN		= "";
	private String TOBON		= "";
	private String TOBU 		= "";
	private String TOADDR1		= "";
	private String TOADDR2		= "";	

	private String TOTEL		= "";
	private String TOHP			= "";	
	private String ADDR_CHECK	= "";		
	private String REQ_NO		= "";
	private String GUBUN		= "";
	
	private String REQ_DATE		= "";
	private String PREDATE		= "";
	private String REQ_DEP		= "";	
	private String REQ_NM		= "";
	private String MANAGER		= "";
	
	private String MANAGE_DEP	= "";
	private String NOTES		= "";
	private String AGENT_NM		= "";
	private String AGENT_TEL	= "";
	private String TOMAIL		= "";
	
	private String GU_CODE		= "";
	private String REQ_CK		= "";
	private String TODATE		= "";
	private String RN			= "";
	private String YN			= "";
	
	private String SI			= "";
	private String GUN			= "";
	private String DORO_NM		= "";
	private String BD_NM		= "";
	
	
	private String APPEAL_REFERENCE		= "";
	private String TONM		= "";
	private String B_PERMISSION = "";
	
	//********** BEGIN_현진_20120215	
	private String DONG = "";
	private String RI = "";
	private String SANGSE = "";
	
	private String BD_BON = "";
	private String BD_BU = "";
	private String BD_DET_NM = "";

	private String TOSI = "";
	private String TODONG = "";
	private String TOGUN = "";
	private String TO_RI = "";
	private String TOSANGSE = "";

	private String TO_BD_BON = "";
	private String TO_BD_BU = "";
	private String TO_BD_DET_NM = "";
	private String TO_BD_NM = "";
	private String TO_DORO_NM = "";

	private String REFERENCE = "";
	
	private String UP_DATE = "";
	private String WORK_ID = "";

	//********** BEGIN_현진_20120321
	private String EXPONENT = "";
	private String BUSINESSADDR = "";
	//********** END_현진_20120321
	//********** BEGIN_KANG_20120417
	private String COMPANY_NAME = "";
	//********** END_KANG_20120417

	
	public String getEXPONENT() {
		return EXPONENT;
	}
	public String getCOMPANY_NAME() {
		return COMPANY_NAME;
	}
	public void setCOMPANY_NAME(String cOMPANYNAME) {
		COMPANY_NAME = cOMPANYNAME;
	}
	public void setEXPONENT(String eXPONENT) {
		EXPONENT = eXPONENT;
	}
	public String getBUSINESSADDR() {
		return BUSINESSADDR;
	}
	public void setBUSINESSADDR(String bUSINESSADDR) {
		BUSINESSADDR = bUSINESSADDR;
	}

	public String getBD_BON() {
		return BD_BON;
	}
	public void setBD_BON(String bDBON) {
		BD_BON = bDBON;
	}
	public String getBD_BU() {
		return BD_BU;
	}
	public void setBD_BU(String bDBU) {
		BD_BU = bDBU;
	}
	public String getBD_DET_NM() {
		return BD_DET_NM;
	}
	public void setBD_DET_NM(String bDDETNM) {
		BD_DET_NM = bDDETNM;
	}
	public String getDONG() {
		return DONG;
	}
	public void setDONG(String dONG) {
		DONG = dONG;
	}
	public String getREFERENCE() {
		return REFERENCE;
	}
	public void setREFERENCE(String rEFERENCE) {
		REFERENCE = rEFERENCE;
	}
	public String getRI() {
		return RI;
	}
	public void setRI(String rI) {
		RI = rI;
	}
	public String getSANGSE() {
		return SANGSE;
	}
	public void setSANGSE(String sANGSE) {
		SANGSE = sANGSE;
	}
	public String getTO_BD_BON() {
		return TO_BD_BON;
	}
	public void setTO_BD_BON(String tOBDBON) {
		TO_BD_BON = tOBDBON;
	}
	public String getTO_BD_BU() {
		return TO_BD_BU;
	}
	public void setTO_BD_BU(String tOBDBU) {
		TO_BD_BU = tOBDBU;
	}
	public String getTO_BD_DET_NM() {
		return TO_BD_DET_NM;
	}
	public void setTO_BD_DET_NM(String tOBDDETNM) {
		TO_BD_DET_NM = tOBDDETNM;
	}
	public String getTO_BD_NM() {
		return TO_BD_NM;
	}
	public void setTO_BD_NM(String tOBDNM) {
		TO_BD_NM = tOBDNM;
	}
	public String getTO_DORO_NM() {
		return TO_DORO_NM;
	}
	public void setTO_DORO_NM(String tODORONM) {
		TO_DORO_NM = tODORONM;
	}
	public String getTO_RI() {
		return TO_RI;
	}
	public void setTO_RI(String tORI) {
		TO_RI = tORI;
	}
	public String getTODONG() {
		return TODONG;
	}
	public void setTODONG(String tODONG) {
		TODONG = tODONG;
	}
	public String getTOGUN() {
		return TOGUN;
	}
	public void setTOGUN(String tOGUN) {
		TOGUN = tOGUN;
	}
	public String getTOSANGSE() {
		return TOSANGSE;
	}
	public void setTOSANGSE(String tOSANGSE) {
		TOSANGSE = tOSANGSE;
	}
	public String getTOSI() {
		return TOSI;
	}
	public void setTOSI(String tOSI) {
		TOSI = tOSI;
	}
	public String getUP_DATE() {
		return UP_DATE;
	}
	public void setUP_DATE(String uPDATE) {
		UP_DATE = uPDATE;
	}
	public String getWORK_ID() {
		return WORK_ID;
	}
	public void setWORK_ID(String wORKID) {
		WORK_ID = wORKID;
	}
	
	
	
	//********** END_현진_20120215
	
	
	
	public String getSI() {
		return SI;
	}
	public void setSI(String sI) {
		SI = sI;
	}
	public String getGUN() {
		return GUN;
	}
	public void setGUN(String gUN) {
		GUN = gUN;
	}
	public String getDORO_NM() {
		return DORO_NM;
	}
	public void setDORO_NM(String dORO_NM) {
		DORO_NM = dORO_NM;
	}
	public String getBD_NM() {
		return BD_NM;
	}
	public void setBD_NM(String bD_NM) {
		BD_NM = bD_NM;
	}
	public String getBON() {
		return BON;
	}
	public void setBON(String bON) {
		BON = bON;
	}
	public String getBU() {
		return BU;
	}
	public void setBU(String bU) {
		BU = bU;
	}
	public String getTOBON() {
		return TOBON;
	}
	public void setTOBON(String tOBON) {
		TOBON = tOBON;
	}
	public String getTOBU() {
		return TOBU;
	}
	public void setTOBU(String tOBU) {
		TOBU = tOBU;
	}
	public String getSAN() {
		return SAN;
	}
	public void setSAN(String sAN) {
		SAN = sAN;
	}
	public String getTOSAN() {
		return TOSAN;
	}
	public void setTOSAN(String tOSAN) {
		TOSAN = tOSAN;
	}
	public String getB_PERMISSION() {
		return B_PERMISSION;
	}
	public void setB_PERMISSION(String bPERMISSION) {
		B_PERMISSION = bPERMISSION;
	}
	public String getTONM() {
		return TONM;
	}
	public void setTONM(String tONM) {
		TONM = tONM;
	}
	public String getADDR_CHECK() {
		return ADDR_CHECK;
	}
	public void setADDR_CHECK(String addr_check) {
		ADDR_CHECK = addr_check;
	}
	public String getADMIN_NO() {
		return ADMIN_NO;
	}
	public void setADMIN_NO(String admin_no) {
		ADMIN_NO = admin_no;
	}
	public String getNAME() {
		return NAME;
	}
	public void setNAME(String name) {
		NAME = name;
	}
	public String getSSN() {
		return SSN;
	}
	public void setSSN(String ssn) {
		SSN = ssn;
	}
	public String getBIZSSN() {
		return BIZSSN;
	}
	public void setBIZSSN(String bizssn) {
		BIZSSN = bizssn;
	}
	public String getBIZ_STATUS() {
		return BIZ_STATUS;
	}
	public void setBIZ_STATUS(String biz_status) {
		BIZ_STATUS = biz_status;
	}
	public String getBIZ_TYPES() {
		return BIZ_TYPES;
	}
	public void setBIZ_TYPES(String biz_types) {
		BIZ_TYPES = biz_types;
	}
	public String getTOPOST() {
		return TOPOST;
	}
	public void setTOPOST(String topost) {
		TOPOST = topost;
	}
	public String getTOADDR1() {
		return TOADDR1;
	}
	public void setTOADDR1(String toaddr1) {
		TOADDR1 = toaddr1;
	}
	public String getTOADDR2() {
		return TOADDR2;
	}
	public void setTOADDR2(String toaddr2) {
		TOADDR2 = toaddr2;
	}
	public String getPOST() {
		return POST;
	}
	public void setPOST(String post) {
		POST = post;
	}
	public String getADDR1() {
		return ADDR1;
	}
	public void setADDR1(String addr1) {
		ADDR1 = addr1;
	}
	public String getADDR2() {
		return ADDR2;
	}
	public void setADDR2(String addr2) {
		ADDR2 = addr2;
	}
	public String getTEL() {
		return TEL;
	}
	public void setTEL(String tel) {
		TEL = tel;
	}
	public String getHP() {
		return HP;
	}
	public void setHP(String hp) {
		HP = hp;
	}
	public String getEMAIL() {
		return EMAIL;
	}
	public void setEMAIL(String email) {
		EMAIL = email;
	}
	public String getTOTEL() {
		return TOTEL;
	}
	public void setTOTEL(String totel) {
		TOTEL = totel;
	}
	public String getTOHP() {
		return TOHP;
	}
	public void setTOHP(String tohp) {
		TOHP = tohp;
	}
	public void setREQ_NO(String req_no) {
		REQ_NO = req_no;
	}
	public String getREQ_NO() {
		return REQ_NO;
	}
	public String getGUBUN() {
		return GUBUN;
	}
	public void setGUBUN(String gubun) {
		GUBUN = gubun;
	}
	public String getREQ_DATE() {
		return REQ_DATE;
	}
	public void setREQ_DATE(String req_date) {
		REQ_DATE = req_date;
	}
	public String getPREDATE() {
		return PREDATE;
	}
	public void setPREDATE(String predate) {
		PREDATE = predate;
	}
	public String getREQ_DEP() {
		return REQ_DEP;
	}
	public void setREQ_DEP(String req_dep) {
		REQ_DEP = req_dep;
	}
	public String getREQ_NM() {
		return REQ_NM;
	}
	public void setREQ_NM(String req_nm) {
		REQ_NM = req_nm;
	}
	public String getMANAGER() {
		return MANAGER;
	}
	public void setMANAGER(String manager) {
		MANAGER = manager;
	}
	public String getMANAGE_DEP() {
		return MANAGE_DEP;
	}
	public void setMANAGE_DEP(String manage_dep) {
		MANAGE_DEP = manage_dep;
	}
	public String getNOTES() {
		return NOTES;
	}
	public void setNOTES(String notes) {
		NOTES = notes;
	}
	public String getAGENT_NM() {
		return AGENT_NM;
	}
	public void setAGENT_NM(String agent_nm) {
		AGENT_NM = agent_nm;
	}
	public String getAGENT_TEL() {
		return AGENT_TEL;
	}
	public void setAGENT_TEL(String agent_tel) {
		AGENT_TEL = agent_tel;
	}
	public String getTOMAIL() {
		return TOMAIL;
	}
	public void setTOMAIL(String tomail) {
		TOMAIL = tomail;
	}
	public String getGU_CODE() {
		return GU_CODE;
	}
	public void setGU_CODE(String gu_code) {
		GU_CODE = gu_code;
	}
	public String getREQ_CK() {
		return REQ_CK;
	}
	public void setREQ_CK(String req_ck) {
		REQ_CK = req_ck;
	}
	public String getTODATE() {
		return TODATE;
	}
	public void setTODATE(String todate) {
		TODATE = todate;
	}
	public String getRN() {
		return RN;
	}
	public void setRN(String rn) {
		RN = rn;
	}
	public String getYN() {
		return YN;
	}
	public void setYN(String yn) {
		YN = yn;
	}
	public String getAPPEAL_REFERENCE() {
		return APPEAL_REFERENCE;
	}
	public void setAPPEAL_REFERENCE(String appeal_reference) {
		APPEAL_REFERENCE = appeal_reference;
	}




//public String getREQ_SET() {
//	return REQ_SET;
//}
//public void setREQ_SET(String req_set) {
//	REQ_SET = req_set;
//}
//	public String getLIVE() {
//	return LIVE;
//}
//public void setLIVE(String live) {
//	LIVE = live;
//}
//	public String getGIGAN1() {
//		return GIGAN1;
//	}
//	public void setGIGAN1(String gigan1) {
//		GIGAN1 = gigan1;
//	}
//	public String getGIGAN2() {
//		return GIGAN2;
//	}
//	public void setGIGAN2(String gigan2) {
//		GIGAN2 = gigan2;
//	}
//	public String getNUM() {
//		return NUM;
//	}
//	public void setNUM(String num) {
//		NUM = num;
//	}

}
