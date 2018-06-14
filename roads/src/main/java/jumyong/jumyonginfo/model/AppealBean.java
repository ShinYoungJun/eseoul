//	2009		Kim Yun Seo

package main.java.jumyong.jumyonginfo.model;

public class AppealBean {

	private String NAME			= "";
	private String SSN			= "";
	private String BIZSSN		= "";
	private String BIZ_STATUS	= "";
	private String BIZ_TYPES	= "";
	
	private String POST			= "";
	private String ADDR1		= "";
	private String ADDR2		= "";
	private String BD_BON		= "";
	private String DORO_NM		= "";
	private String BD_BU		= "";
	private String BD_NM		= "";
	private String BD_DET_NM	= "";
	
	private String SI			= "";
	private String GUN			= "";
	
	private String EMAIL		= "";
	private String TEL			= "";

	private String HP			= "";
	private String TOPOST		= "";
	private String TOADDR1		= "";
	private String TOADDR2		= "";	
	private String TONM			= "";
	
	private String TOMAIL		= "";
	private String TOTEL		= "";
	private String TOHP			= "";	
	private String ADDR_CHECK	= "";	
	private String ADMIN_NO		= "";	
	
	private String REFERENCE	= "";
	private String BEFORE_PERMISSION ="";
	

	private String REQ_NO		= "";
	private String REQ_DATE		= "";
	private String REQ_SET		= "";
	private String REQ_NM		= "";
	private String REQ_DEP		= "";
	private String MANAGER		= "";
	private String MANAGE_DEP	= "";
	private String PREDATE		= "";
	private String TODATE		= "";
	private String GUBUN		= "";
	private String REQ_CK		= "";
	private String LIVE			= "";
	private String NOTES		= "";
	private String AGENT_NM		= "";
	private String AGENT_TEL	= "";
	private String GU_CODE		= "";
	private String GIGAN1		= "";
	private String GIGAN2		= "";
	private String NUM			= "";
	private String YN			= "";
	private String RN			= "";
	
	private String HP1			= "";
	private String HP2			= "";
	private String HP3			= "";
	
	private String TEL1			= "";
	private String TEL2			= "";
	private String TEL3			= "";
	
	private String TOHP1		= "";
	private String TOHP2		= "";
	private String TOHP3		= "";
	
	private String TOTEL1		= "";
	private String TOTEL2		= "";
	private String TOTEL3		= "";
	
	private String WORK_ID		= "";
	
	private String SAN			= "";
	private String TOSAN		= "";
	
	private String BON			= "";
	private String BU			= "";
	private String TOBON		= "";
	private String TOBU			= "";
	
	private String TOSI			= "";
	private String TOGUN		= "";
	private String TO_DORO_NM	= "";
	private String TO_BD_NM		= "";
	
	private String TO_BD_BON	= "";
	private String TO_BD_BU		= "";
	private String TO_BD_DET_NM	= "";
	
	private String DONG			= "";
	private String SANGSE		= "";
	private String TODONG		= "";
	private String TOSANGSE		= "";
	
	//********** BEGIN_현진_20120215
	private String B_PERMISSION = "";
	private String RI = "";
	private String TO_RI = "";
	private String UP_DATE = "";

	//********** BEGIN_현진_20120321
	private String EXPONENT = "";
	private String BUSINESSADDR = "";

	public String getEXPONENT() {
		return EXPONENT;
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
	
	//********** END_현진_20120321
	
	//********** BEGIN_KANG_20120417
	private String COMPANY_NAME = "";
	//********** END_KANG_20120417

	public String getB_PERMISSION() {
		return B_PERMISSION;
	}

	public String getCOMPANY_NAME() {
		return COMPANY_NAME;
	}
	public void setCOMPANY_NAME(String cOMPANYNAME) {
		COMPANY_NAME = cOMPANYNAME;
	}
	public void setB_PERMISSION(String bPERMISSION) {
		B_PERMISSION = bPERMISSION;
	}
	public String getRI() {
		return RI;
	}
	public void setRI(String rI) {
		RI = rI;
	}
	public String getTO_RI() {
		return TO_RI;
	}
	public void setTO_RI(String tORI) {
		TO_RI = tORI;
	}
	public String getUP_DATE() {
		return UP_DATE;
	}
		
	public void setUP_DATE(String uPDATE) {
		UP_DATE = uPDATE;
	}
	//********** END_현진_20120215

	public String getNAME() {
		return NAME;
	}
	public void setNAME(String nAME) {
		NAME = nAME;
	}
	public String getSSN() {
		return SSN;
	}
	public void setSSN(String sSN) {
		SSN = sSN;
	}
	public String getBIZSSN() {
		return BIZSSN;
	}
	public void setBIZSSN(String bIZSSN) {
		BIZSSN = bIZSSN;
	}
	public String getBIZ_STATUS() {
		return BIZ_STATUS;
	}
	public void setBIZ_STATUS(String bIZ_STATUS) {
		BIZ_STATUS = bIZ_STATUS;
	}
	public String getBIZ_TYPES() {
		return BIZ_TYPES;
	}
	public void setBIZ_TYPES(String bIZ_TYPES) {
		BIZ_TYPES = bIZ_TYPES;
	}
	public String getPOST() {
		return POST;
	}
	public void setPOST(String pOST) {
		POST = pOST;
	}
	public String getADDR1() {
		return ADDR1;
	}
	public void setADDR1(String aDDR1) {
		ADDR1 = aDDR1;
	}
	public String getADDR2() {
		return ADDR2;
	}
	public void setADDR2(String aDDR2) {
		ADDR2 = aDDR2;
	}
	public String getBD_BON() {
		return BD_BON;
	}
	public void setBD_BON(String bD_BON) {
		BD_BON = bD_BON;
	}
	public String getDORO_NM() {
		return DORO_NM;
	}
	public void setDORO_NM(String dORO_NM) {
		DORO_NM = dORO_NM;
	}
	public String getBD_BU() {
		return BD_BU;
	}
	public void setBD_BU(String bD_BU) {
		BD_BU = bD_BU;
	}
	public String getBD_NM() {
		return BD_NM;
	}
	public void setBD_NM(String bD_NM) {
		BD_NM = bD_NM;
	}
	public String getBD_DET_NM() {
		return BD_DET_NM;
	}
	public void setBD_DET_NM(String bD_DET_NM) {
		BD_DET_NM = bD_DET_NM;
	}
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
	public String getEMAIL() {
		return EMAIL;
	}
	public void setEMAIL(String eMAIL) {
		EMAIL = eMAIL;
	}
	public String getTEL() {
		return TEL;
	}
	public void setTEL(String tEL) {
		TEL = tEL;
	}
	public String getHP() {
		return HP;
	}
	public void setHP(String hP) {
		HP = hP;
	}
	public String getTOPOST() {
		return TOPOST;
	}
	public void setTOPOST(String tOPOST) {
		TOPOST = tOPOST;
	}
	public String getTOADDR1() {
		return TOADDR1;
	}
	public void setTOADDR1(String tOADDR1) {
		TOADDR1 = tOADDR1;
	}
	public String getTOADDR2() {
		return TOADDR2;
	}
	public void setTOADDR2(String tOADDR2) {
		TOADDR2 = tOADDR2;
	}
	public String getTONM() {
		return TONM;
	}
	public void setTONM(String tONM) {
		TONM = tONM;
	}
	public String getTOMAIL() {
		return TOMAIL;
	}
	public void setTOMAIL(String tOMAIL) {
		TOMAIL = tOMAIL;
	}
	public String getTOTEL() {
		return TOTEL;
	}
	public void setTOTEL(String tOTEL) {
		TOTEL = tOTEL;
	}
	public String getTOHP() {
		return TOHP;
	}
	public void setTOHP(String tOHP) {
		TOHP = tOHP;
	}
	public String getADDR_CHECK() {
		return ADDR_CHECK;
	}
	public void setADDR_CHECK(String aDDR_CHECK) {
		ADDR_CHECK = aDDR_CHECK;
	}
	public String getADMIN_NO() {
		return ADMIN_NO;
	}
	public void setADMIN_NO(String aDMIN_NO) {
		ADMIN_NO = aDMIN_NO;
	}
	public String getREFERENCE() {
		return REFERENCE;
	}
	public void setREFERENCE(String rEFERENCE) {
		REFERENCE = rEFERENCE;
	}
	public String getBEFORE_PERMISSION() {
		return BEFORE_PERMISSION;
	}
	public void setBEFORE_PERMISSION(String bEFORE_PERMISSION) {
		BEFORE_PERMISSION = bEFORE_PERMISSION;
	}
	public String getREQ_NO() {
		return REQ_NO;
	}
	public void setREQ_NO(String rEQ_NO) {
		REQ_NO = rEQ_NO;
	}
	public String getREQ_DATE() {
		return REQ_DATE;
	}
	public void setREQ_DATE(String rEQ_DATE) {
		REQ_DATE = rEQ_DATE;
	}
	public String getREQ_SET() {
		return REQ_SET;
	}
	public void setREQ_SET(String rEQ_SET) {
		REQ_SET = rEQ_SET;
	}
	public String getREQ_NM() {
		return REQ_NM;
	}
	public void setREQ_NM(String rEQ_NM) {
		REQ_NM = rEQ_NM;
	}
	public String getREQ_DEP() {
		return REQ_DEP;
	}
	public void setREQ_DEP(String rEQ_DEP) {
		REQ_DEP = rEQ_DEP;
	}
	public String getMANAGER() {
		return MANAGER;
	}
	public void setMANAGER(String mANAGER) {
		MANAGER = mANAGER;
	}
	public String getMANAGE_DEP() {
		return MANAGE_DEP;
	}
	public void setMANAGE_DEP(String mANAGE_DEP) {
		MANAGE_DEP = mANAGE_DEP;
	}
	public String getPREDATE() {
		return PREDATE;
	}
	public void setPREDATE(String pREDATE) {
		PREDATE = pREDATE;
	}
	public String getTODATE() {
		return TODATE;
	}
	public void setTODATE(String tODATE) {
		TODATE = tODATE;
	}
	public String getGUBUN() {
		return GUBUN;
	}
	public void setGUBUN(String gUBUN) {
		GUBUN = gUBUN;
	}
	public String getREQ_CK() {
		return REQ_CK;
	}
	public void setREQ_CK(String rEQ_CK) {
		REQ_CK = rEQ_CK;
	}
	public String getLIVE() {
		return LIVE;
	}
	public void setLIVE(String lIVE) {
		LIVE = lIVE;
	}
	public String getNOTES() {
		return NOTES;
	}
	public void setNOTES(String nOTES) {
		NOTES = nOTES;
	}
	public String getAGENT_NM() {
		return AGENT_NM;
	}
	public void setAGENT_NM(String aGENT_NM) {
		AGENT_NM = aGENT_NM;
	}
	public String getAGENT_TEL() {
		return AGENT_TEL;
	}
	public void setAGENT_TEL(String aGENT_TEL) {
		AGENT_TEL = aGENT_TEL;
	}
	public String getGU_CODE() {
		return GU_CODE;
	}
	public void setGU_CODE(String gU_CODE) {
		GU_CODE = gU_CODE;
	}
	public String getGIGAN1() {
		return GIGAN1;
	}
	public void setGIGAN1(String gIGAN1) {
		GIGAN1 = gIGAN1;
	}
	public String getGIGAN2() {
		return GIGAN2;
	}
	public void setGIGAN2(String gIGAN2) {
		GIGAN2 = gIGAN2;
	}
	public String getNUM() {
		return NUM;
	}
	public void setNUM(String nUM) {
		NUM = nUM;
	}
	public String getYN() {
		return YN;
	}
	public void setYN(String yN) {
		YN = yN;
	}
	public String getRN() {
		return RN;
	}
	public void setRN(String rN) {
		RN = rN;
	}
	public String getHP1() {
		return HP1;
	}
	public void setHP1(String hP1) {
		HP1 = hP1;
	}
	public String getHP2() {
		return HP2;
	}
	public void setHP2(String hP2) {
		HP2 = hP2;
	}
	public String getHP3() {
		return HP3;
	}
	public void setHP3(String hP3) {
		HP3 = hP3;
	}
	public String getTEL1() {
		return TEL1;
	}
	public void setTEL1(String tEL1) {
		TEL1 = tEL1;
	}
	public String getTEL2() {
		return TEL2;
	}
	public void setTEL2(String tEL2) {
		TEL2 = tEL2;
	}
	public String getTEL3() {
		return TEL3;
	}
	public void setTEL3(String tEL3) {
		TEL3 = tEL3;
	}
	public String getTOHP1() {
		return TOHP1;
	}
	public void setTOHP1(String tOHP1) {
		TOHP1 = tOHP1;
	}
	public String getTOHP2() {
		return TOHP2;
	}
	public void setTOHP2(String tOHP2) {
		TOHP2 = tOHP2;
	}
	public String getTOHP3() {
		return TOHP3;
	}
	public void setTOHP3(String tOHP3) {
		TOHP3 = tOHP3;
	}
	public String getTOTEL1() {
		return TOTEL1;
	}
	public void setTOTEL1(String tOTEL1) {
		TOTEL1 = tOTEL1;
	}
	public String getTOTEL2() {
		return TOTEL2;
	}
	public void setTOTEL2(String tOTEL2) {
		TOTEL2 = tOTEL2;
	}
	public String getTOTEL3() {
		return TOTEL3;
	}
	public void setTOTEL3(String tOTEL3) {
		TOTEL3 = tOTEL3;
	}
	public String getWORK_ID() {
		return WORK_ID;
	}
	public void setWORK_ID(String wORK_ID) {
		WORK_ID = wORK_ID;
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
	public String getTOSI() {
		return TOSI;
	}
	public void setTOSI(String tOSI) {
		TOSI = tOSI;
	}
	public String getTOGUN() {
		return TOGUN;
	}
	public void setTOGUN(String tOGUN) {
		TOGUN = tOGUN;
	}
	public String getTO_DORO_NM() {
		return TO_DORO_NM;
	}
	public void setTO_DORO_NM(String tO_DORO_NM) {
		TO_DORO_NM = tO_DORO_NM;
	}
	public String getTO_BD_NM() {
		return TO_BD_NM;
	}
	public void setTO_BD_NM(String tO_BD_NM) {
		TO_BD_NM = tO_BD_NM;
	}
	public String getTO_BD_BON() {
		return TO_BD_BON;
	}
	public void setTO_BD_BON(String tO_BD_BON) {
		TO_BD_BON = tO_BD_BON;
	}
	public String getTO_BD_BU() {
		return TO_BD_BU;
	}
	public void setTO_BD_BU(String tO_BD_BU) {
		TO_BD_BU = tO_BD_BU;
	}
	public String getTO_BD_DET_NM() {
		return TO_BD_DET_NM;
	}
	public void setTO_BD_DET_NM(String tO_BD_DET_NM) {
		TO_BD_DET_NM = tO_BD_DET_NM;
	}
	public String getDONG() {
		return DONG;
	}
	public void setDONG(String dONG) {
		DONG = dONG;
	}
	public String getSANGSE() {
		return SANGSE;
	}
	public void setSANGSE(String sANGSE) {
		SANGSE = sANGSE;
	}
	public String getTODONG() {
		return TODONG;
	}
	public void setTODONG(String tODONG) {
		TODONG = tODONG;
	}
	public String getTOSANGSE() {
		return TOSANGSE;
	}
	public void setTOSANGSE(String tOSANGSE) {
		TOSANGSE = tOSANGSE;
	}
		
}
