package main.java.gapan.jumyonginfo.model;

import org.springframework.web.multipart.MultipartFile;

import main.java.common.model.RoadsBaseBean;

public class GapanHeadBean extends RoadsBaseBean {
	private String GAPAN_NO = "";
	private String OWNER_NAME = "";
	private String OWNER_IDCHK = "";
	private String OWNER_SSN = "";
	private String OWNER_IMG_NAME = "";
	private MultipartFile OWNER_IMG;
	private String OWNER_GENDER = "";
	private String OWNER_AGE = "";
	private String OWNER_TEL = "";
	private String OWNER_HP = "";
	private String OWNER_POST = "";
	private String OWNER_ADDR1 = "";
	private String OWNER_ADDR2 = "";
	private String OWNER_TOPOST = "";
	private String OWNER_TOADDR1 = "";
	private String OWNER_TOADDR2 = "";
	private String LC_SEL = "";
	private String LC_TXT = "";
	private String RT_SEL = "";
	private String RT_TXT = "";
	private String ESTATE_MOVE = "";
	private String ESTATE_REAL = "";
	private String GP_TYP = "";
	private String PARTN_NAME = "";
	private String PT_SEL = "";
	private String PARTN_SSN = "";
	private String PARTN_IMG_NAME = "";
	private MultipartFile PARTN_IMG;
	private String PARTN_GENDER = "";
	private String PARTN_AGE = "";
	private String PARTN_TEL = "";
	private String PARTN_HP = "";
	private String PARTN_POST = "";
	private String PARTN_ADDR1 = "";
	private String PARTN_ADDR2 = "";
	private String PARTN_TOPOST = "";
	private String PARTN_TOADDR1 = "";
	private String PARTN_TOADDR2 = "";
	
	private String OWNER_JIBUN = "";
	private String OWNER_SAN = "";
	private String OWNER_TOJIBUN = "";
	private String OWNER_TOSAN = "";
	private String PARTN_JIBUN = "";
	private String PARTN_SAN = "";
	private String PARTN_TOJIBUN = "";
	private String PARTN_TOSAN = "";
	
	private String OWNER_SAME = "";
	private String PARTN_OSAM = "";
	private String PARTN_SAME = "";
	private String ADDR_CHECK1 = "";
	private String ADDR_CHECK2 = "";
	
	private String TP_TYP_NM = "";
	private String RT_SEL_NM = "";
	private String LC_SEL_NM = "";
	private String PT_SEL_NM = "";
	
	private String OWNER_SSN1 = "";
	private String OWNER_SSN2 = "";
	private String PARTN_SSN1 = "";
	private String PARTN_SSN2 = "";
	
	private String OWNER_TEL1 = "";
	private String OWNER_TEL2 = "";
	private String OWNER_TEL3 = "";
	private String PARTN_TEL1 = "";
	private String PARTN_TEL2 = "";
	private String PARTN_TEL3 = "";
	
	private String OWNER_HP1 = "";
	private String OWNER_HP2 = "";
	private String OWNER_HP3 = "";
	private String PARTN_HP1 = "";
	private String PARTN_HP2 = "";
	private String PARTN_HP3 = "";
	
	private String OWNER_BONBUN = "";
	private String OWNER_BUBUN = "";
	private String OWNER_TOBONBUN = "";
	private String OWNER_TOBUBUN = "";
	private String PARTN_BONBUN = "";
	private String PARTN_BUBUN = "";
	private String PARTN_TOBONBUN = "";
	private String PARTN_TOBUBUN = "";
	
	private String SI = "";
	private String GUN = "";
	private String DORO_NM = "";
	private String BD_NM = "";
	private String BD_DET_NM = "";
	private String BD_BON = "";
	private String BD_BU = "";
	
	private String TOSI = "";
	private String TOGUN = "";
	private String TODORO_NM = "";
	private String TOBD_NM = "";
	private String TOBD_DET_NM = "";
	private String TOBD_BON = "";
	private String TOBD_BU = "";

	
	// hoban : 직계가족 도로명 주소 관련 변수들
	private String PSI = "";
	private String PGUN = "";
	private String P_DORO_NM = "";
	private String P_BD_NM = "";
	private String P_BD_DET_NM = "";
	private String P_BD_BON = "";
	private String P_BD_BU = "";
	
	private String PTSI = "";
	private String PTGUN = "";
	private String PTDORO_NM = "";
	private String PTBD_NM = "";
	private String PTBD_DET_NM = "";
	private String PTBD_BON = "";
	private String PTBD_BU = "";

	private String NOTE	= "";

	//********** BEGIN_현진_20120330
	private String LT_SEL = "";
	private String DONG = "";
	private String RI = "";
	private String BON = "";
	private String BU = "";
	private String TSI = "";
	private String TGUN = "";
	private String TDONG = "";
	private String T_RI = "";
	private String TBON = "";
	private String TBU = "";
	private String TDORO_NM = "";
	private String TBD_BON = "";
	private String TBD_BU = "";
	private String TBD_NM = "";
	private String TBD_DET_NM = "";
	private String PDONG = "";
	private String PRI = "";
	private String PBON = "";
	private String PBU = "";
	private String PTDONG = "";
	private String PTRI = "";
	private String PTBON = "";
	private String PTBU = "";

	//********** END_현진_20120330
	
	
	
	public String getLT_SEL() {
		return LT_SEL;
	}
	public void setLT_SEL(String lTSEL) {
		LT_SEL = lTSEL;
	}
	public String getDONG() {
		return DONG;
	}
	public void setDONG(String dONG) {
		DONG = dONG;
	}
	public String getRI() {
		return RI;
	}
	public void setRI(String rI) {
		RI = rI;
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
	public String getTSI() {
		return TSI;
	}
	public void setTSI(String tSI) {
		TSI = tSI;
	}
	public String getTGUN() {
		return TGUN;
	}
	public void setTGUN(String tGUN) {
		TGUN = tGUN;
	}
	public String getTDONG() {
		return TDONG;
	}
	public void setTDONG(String tDONG) {
		TDONG = tDONG;
	}
	public String getT_RI() {
		return T_RI;
	}
	public void setT_RI(String tRI) {
		T_RI = tRI;
	}
	public String getTBON() {
		return TBON;
	}
	public void setTBON(String tBON) {
		TBON = tBON;
	}
	public String getTBU() {
		return TBU;
	}
	public void setTBU(String tBU) {
		TBU = tBU;
	}
	public String getTDORO_NM() {
		return TDORO_NM;
	}
	public void setTDORO_NM(String tDORONM) {
		TDORO_NM = tDORONM;
	}
	public String getTBD_BON() {
		return TBD_BON;
	}
	public void setTBD_BON(String tBDBON) {
		TBD_BON = tBDBON;
	}
	public String getTBD_BU() {
		return TBD_BU;
	}
	public void setTBD_BU(String tBDBU) {
		TBD_BU = tBDBU;
	}
	public String getTBD_NM() {
		return TBD_NM;
	}
	public void setTBD_NM(String tBDNM) {
		TBD_NM = tBDNM;
	}
	public String getTBD_DET_NM() {
		return TBD_DET_NM;
	}
	public void setTBD_DET_NM(String tBDDETNM) {
		TBD_DET_NM = tBDDETNM;
	}
	public String getPDONG() {
		return PDONG;
	}
	public void setPDONG(String pDONG) {
		PDONG = pDONG;
	}
	public String getPRI() {
		return PRI;
	}
	public void setPRI(String pRI) {
		PRI = pRI;
	}
	public String getPBON() {
		return PBON;
	}
	public void setPBON(String pBON) {
		PBON = pBON;
	}
	public String getPBU() {
		return PBU;
	}
	public void setPBU(String pBU) {
		PBU = pBU;
	}
	public String getPTDONG() {
		return PTDONG;
	}
	public void setPTDONG(String pTDONG) {
		PTDONG = pTDONG;
	}
	public String getPTRI() {
		return PTRI;
	}
	public void setPTRI(String pTRI) {
		PTRI = pTRI;
	}
	public String getPTBON() {
		return PTBON;
	}
	public void setPTBON(String pTBON) {
		PTBON = pTBON;
	}
	public String getPTBU() {
		return PTBU;
	}
	public void setPTBU(String pTBU) {
		PTBU = pTBU;
	}
	public String getPSI() {
		return PSI;
	}
	public void setPSI(String pSI) {
		PSI = pSI;
	}
	public String getPGUN() {
		return PGUN;
	}
	public void setPGUN(String pGUN) {
		PGUN = pGUN;
	}
	public String getP_DORO_NM() {
		return P_DORO_NM;
	}
	public void setP_DORO_NM(String p_DORO_NM) {
		P_DORO_NM = p_DORO_NM;
	}
	public String getP_BD_NM() {
		return P_BD_NM;
	}
	public void setP_BD_NM(String p_BD_NM) {
		P_BD_NM = p_BD_NM;
	}
	public String getP_BD_DET_NM() {
		return P_BD_DET_NM;
	}
	public void setP_BD_DET_NM(String p_BD_DET_NM) {
		P_BD_DET_NM = p_BD_DET_NM;
	}
	public String getP_BD_BON() {
		return P_BD_BON;
	}
	public void setP_BD_BON(String p_BD_BON) {
		P_BD_BON = p_BD_BON;
	}
	public String getP_BD_BU() {
		return P_BD_BU;
	}
	public void setP_BD_BU(String p_BD_BU) {
		P_BD_BU = p_BD_BU;
	}
	public String getPTSI() {
		return PTSI;
	}
	public void setPTSI(String pTSI) {
		PTSI = pTSI;
	}
	public String getPTGUN() {
		return PTGUN;
	}
	public void setPTGUN(String pTGUN) {
		PTGUN = pTGUN;
	}
	public String getPTDORO_NM() {
		return PTDORO_NM;
	}
	public void setPTDORO_NM(String pTDORO_NM) {
		PTDORO_NM = pTDORO_NM;
	}
	public String getPTBD_NM() {
		return PTBD_NM;
	}
	public void setPTBD_NM(String pTBD_NM) {
		PTBD_NM = pTBD_NM;
	}
	public String getPTBD_DET_NM() {
		return PTBD_DET_NM;
	}
	public void setPTBD_DET_NM(String pTBD_DET_NM) {
		PTBD_DET_NM = pTBD_DET_NM;
	}
	public String getPTBD_BON() {
		return PTBD_BON;
	}
	public void setPTBD_BON(String pTBD_BON) {
		PTBD_BON = pTBD_BON;
	}
	public String getPTBD_BU() {
		return PTBD_BU;
	}
	public void setPTBD_BU(String pTBD_BU) {
		PTBD_BU = pTBD_BU;
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
	public String getBD_DET_NM() {
		return BD_DET_NM;
	}
	public void setBD_DET_NM(String bD_DET_NM) {
		BD_DET_NM = bD_DET_NM;
	}
	public String getBD_BON() {
		return BD_BON;
	}
	public void setBD_BON(String bD_BON) {
		BD_BON = bD_BON;
	}
	public String getBD_BU() {
		return BD_BU;
	}
	public void setBD_BU(String bD_BU) {
		BD_BU = bD_BU;
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
	public String getTODORO_NM() {
		return TODORO_NM;
	}
	public void setTODORO_NM(String tODORO_NM) {
		TODORO_NM = tODORO_NM;
	}
	public String getTOBD_NM() {
		return TOBD_NM;
	}
	public void setTOBD_NM(String tOBD_NM) {
		TOBD_NM = tOBD_NM;
	}
	public String getTOBD_DET_NM() {
		return TOBD_DET_NM;
	}
	public void setTOBD_DET_NM(String tOBD_DET_NM) {
		TOBD_DET_NM = tOBD_DET_NM;
	}
	public String getTOBD_BON() {
		return TOBD_BON;
	}
	public void setTOBD_BON(String tOBD_BON) {
		TOBD_BON = tOBD_BON;
	}
	public String getTOBD_BU() {
		return TOBD_BU;
	}
	public void setTOBD_BU(String tOBD_BU) {
		TOBD_BU = tOBD_BU;
	}
	public String getNOTE() {
		return NOTE;
	}
	public void setNOTE(String nOTE) {
		NOTE = nOTE;
	}
	public MultipartFile getOWNER_IMG() {
		return OWNER_IMG;
	}
	public void setOWNER_IMG(MultipartFile OWNER_IMG) {
		this.OWNER_IMG = OWNER_IMG;
	}
	
	public MultipartFile getPARTN_IMG() {
		return PARTN_IMG;
	}
	public void setPARTN_IMG(MultipartFile PARTN_IMG) {
		this.PARTN_IMG = PARTN_IMG;
	}
	
	
	public String getOWNER_HP1() {
		return OWNER_HP1;
	}
	public void setOWNER_HP1(String owner_hp1) {
		OWNER_HP1 = owner_hp1;
	}
	public String getOWNER_HP2() {
		return OWNER_HP2;
	}
	public void setOWNER_HP2(String owner_hp2) {
		OWNER_HP2 = owner_hp2;
	}
	public String getOWNER_HP3() {
		return OWNER_HP3;
	}
	public void setOWNER_HP3(String owner_hp3) {
		OWNER_HP3 = owner_hp3;
	}
	public String getOWNER_TEL1() {
		return OWNER_TEL1;
	}
	public void setOWNER_TEL1(String owner_tel1) {
		OWNER_TEL1 = owner_tel1;
	}
	public String getOWNER_TEL2() {
		return OWNER_TEL2;
	}
	public void setOWNER_TEL2(String owner_tel2) {
		OWNER_TEL2 = owner_tel2;
	}
	public String getOWNER_TEL3() {
		return OWNER_TEL3;
	}
	public void setOWNER_TEL3(String owner_tel3) {
		OWNER_TEL3 = owner_tel3;
	}
	public String getOWNER_SSN1() {
		return OWNER_SSN1;
	}
	public void setOWNER_SSN1(String owner_ssn1) {
		OWNER_SSN1 = owner_ssn1;
	}
	public String getOWNER_SSN2() {
		return OWNER_SSN2;
	}
	public void setOWNER_SSN2(String owner_ssn2) {
		OWNER_SSN2 = owner_ssn2;
	}
	public String getPARTN_OSAM() {
		return PARTN_OSAM;
	}
	public void setPARTN_OSAM(String partn_osam) {
		PARTN_OSAM = partn_osam;
	}
	public String getPARTN_SAME() {
		return PARTN_SAME;
	}
	public void setPARTN_SAME(String partn_same) {
		PARTN_SAME = partn_same;
	}
	public String getESTATE_MOVE() {
		return ESTATE_MOVE;
	}
	public void setESTATE_MOVE(String estate_move) {
		ESTATE_MOVE = estate_move;
	}
	public String getESTATE_REAL() {
		return ESTATE_REAL;
	}
	public void setESTATE_REAL(String estate_real) {
		ESTATE_REAL = estate_real;
	}
	public String getGAPAN_NO() {
		return GAPAN_NO;
	}
	public void setGAPAN_NO(String gapan_no) {
		GAPAN_NO = gapan_no;
	}
	public String getGP_TYP() {
		return GP_TYP;
	}
	public void setGP_TYP(String gp_typ) {
		GP_TYP = gp_typ;
	}
	public String getLC_SEL() {
		return LC_SEL;
	}
	public void setLC_SEL(String lc_sel) {
		LC_SEL = lc_sel;
	}
	public String getLC_TXT() {
		return LC_TXT;
	}
	public void setLC_TXT(String lc_txt) {
		LC_TXT = lc_txt;
	}
	public String getOWNER_ADDR1() {
		return OWNER_ADDR1;
	}
	public void setOWNER_ADDR1(String owner_addr1) {
		OWNER_ADDR1 = owner_addr1;
	}
	public String getOWNER_ADDR2() {
		return OWNER_ADDR2;
	}
	public void setOWNER_ADDR2(String owner_addr2) {
		OWNER_ADDR2 = owner_addr2;
	}
	public String getOWNER_AGE() {
		return OWNER_AGE;
	}
	public void setOWNER_AGE(String owner_age) {
		OWNER_AGE = owner_age;
	}
	public String getOWNER_GENDER() {
		return OWNER_GENDER;
	}
	public void setOWNER_GENDER(String owner_gender) {
		OWNER_GENDER = owner_gender;
	}
	public String getOWNER_HP() {
		return OWNER_HP;
	}
	public void setOWNER_HP(String owner_hp) {
		OWNER_HP = owner_hp;
	}
	public String getOWNER_IDCHK() {
		return OWNER_IDCHK;
	}
	public void setOWNER_IDCHK(String owner_idchk) {
		OWNER_IDCHK = owner_idchk;
	}
//	public String getOWNER_IMG() {
//		return OWNER_IMG;
//	}
//	public void setOWNER_IMG(String owner_img) {
//		OWNER_IMG = owner_img;
//	}
	public String getOWNER_POST() {
		return OWNER_POST;
	}
	public void setOWNER_POST(String owner_post) {
		OWNER_POST = owner_post;
	}
	public String getOWNER_SSN() {
		return OWNER_SSN;
	}
	public void setOWNER_SSN(String owner_ssn) {
		OWNER_SSN = owner_ssn;
	}
	public String getOWNER_TEL() {
		return OWNER_TEL;
	}
	public void setOWNER_TEL(String owner_tel) {
		OWNER_TEL = owner_tel;
	}
	public String getOWNER_TOADDR1() {
		return OWNER_TOADDR1;
	}
	public void setOWNER_TOADDR1(String owner_toaddr1) {
		OWNER_TOADDR1 = owner_toaddr1;
	}
	public String getOWNER_TOADDR2() {
		return OWNER_TOADDR2;
	}
	public void setOWNER_TOADDR2(String owner_toaddr2) {
		OWNER_TOADDR2 = owner_toaddr2;
	}
	public String getOWNER_TOPOST() {
		return OWNER_TOPOST;
	}
	public void setOWNER_TOPOST(String owner_topost) {
		OWNER_TOPOST = owner_topost;
	}
	public String getPARTN_ADDR1() {
		return PARTN_ADDR1;
	}
	public void setPARTN_ADDR1(String partn_addr1) {
		PARTN_ADDR1 = partn_addr1;
	}
	public String getPARTN_ADDR2() {
		return PARTN_ADDR2;
	}
	public void setPARTN_ADDR2(String partn_addr2) {
		PARTN_ADDR2 = partn_addr2;
	}
	public String getPARTN_AGE() {
		return PARTN_AGE;
	}
	public void setPARTN_AGE(String partn_age) {
		PARTN_AGE = partn_age;
	}
	public String getPARTN_GENDER() {
		return PARTN_GENDER;
	}
	public void setPARTN_GENDER(String partn_gender) {
		PARTN_GENDER = partn_gender;
	}
	public String getPARTN_HP() {
		return PARTN_HP;
	}
	public void setPARTN_HP(String partn_hp) {
		PARTN_HP = partn_hp;
	}
//	public String getPARTN_IMG() {
//		return PARTN_IMG;
//	}
//	public void setPARTN_IMG(String partn_img) {
//		PARTN_IMG = partn_img;
//	}
	public String getPARTN_NAME() {
		return PARTN_NAME;
	}
	public void setPARTN_NAME(String partn_name) {
		PARTN_NAME = partn_name;
	}
	public String getPARTN_POST() {
		return PARTN_POST;
	}
	public void setPARTN_POST(String partn_post) {
		PARTN_POST = partn_post;
	}
	public String getPARTN_SSN() {
		return PARTN_SSN;
	}
	public void setPARTN_SSN(String partn_ssn) {
		PARTN_SSN = partn_ssn;
	}
	public String getPARTN_TEL() {
		return PARTN_TEL;
	}
	public void setPARTN_TEL(String partn_tel) {
		PARTN_TEL = partn_tel;
	}
	public String getPARTN_TOADDR1() {
		return PARTN_TOADDR1;
	}
	public void setPARTN_TOADDR1(String partn_toaddr1) {
		PARTN_TOADDR1 = partn_toaddr1;
	}
	public String getPARTN_TOADDR2() {
		return PARTN_TOADDR2;
	}
	public void setPARTN_TOADDR2(String partn_toaddr2) {
		PARTN_TOADDR2 = partn_toaddr2;
	}
	public String getPARTN_TOPOST() {
		return PARTN_TOPOST;
	}
	public void setPARTN_TOPOST(String partn_topost) {
		PARTN_TOPOST = partn_topost;
	}
	public String getPT_SEL() {
		return PT_SEL;
	}
	public void setPT_SEL(String pt_sel) {
		PT_SEL = pt_sel;
	}
	public String getRT_SEL() {
		return RT_SEL;
	}
	public void setRT_SEL(String rt_sel) {
		RT_SEL = rt_sel;
	}
	public String getRT_TXT() {
		return RT_TXT;
	}
	public void setRT_TXT(String rt_txt) {
		RT_TXT = rt_txt;
	}
	public String getOWNER_NAME() {
		return OWNER_NAME;
	}
	public void setOWNER_NAME(String owner_name) {
		OWNER_NAME = owner_name;
	}
	public String getOWNER_JIBUN() {
		return OWNER_JIBUN;
	}
	public void setOWNER_JIBUN(String owner_jibun) {
		OWNER_JIBUN = owner_jibun;
	}
	public String getOWNER_SAN() {
		return OWNER_SAN;
	}
	public void setOWNER_SAN(String owner_san) {
		OWNER_SAN = owner_san;
	}
	public String getOWNER_TOJIBUN() {
		return OWNER_TOJIBUN;
	}
	public void setOWNER_TOJIBUN(String owner_tojibun) {
		OWNER_TOJIBUN = owner_tojibun;
	}
	public String getOWNER_TOSAN() {
		return OWNER_TOSAN;
	}
	public void setOWNER_TOSAN(String owner_tosan) {
		OWNER_TOSAN = owner_tosan;
	}
	public String getPARTN_JIBUN() {
		return PARTN_JIBUN;
	}
	public void setPARTN_JIBUN(String partn_jibun) {
		PARTN_JIBUN = partn_jibun;
	}
	public String getPARTN_SAN() {
		return PARTN_SAN;
	}
	public void setPARTN_SAN(String partn_san) {
		PARTN_SAN = partn_san;
	}
	public String getPARTN_TOJIBUN() {
		return PARTN_TOJIBUN;
	}
	public void setPARTN_TOJIBUN(String partn_tojibun) {
		PARTN_TOJIBUN = partn_tojibun;
	}
	public String getPARTN_TOSAN() {
		return PARTN_TOSAN;
	}
	public void setPARTN_TOSAN(String partn_tosan) {
		PARTN_TOSAN = partn_tosan;
	}
	public String getOWNER_SAME() {
		return OWNER_SAME;
	}
	public void setOWNER_SAME(String owner_same) {
		OWNER_SAME = owner_same;
	}
	public String getADDR_CHECK1() {
		return ADDR_CHECK1;
	}
	public void setADDR_CHECK1(String addr_check1) {
		ADDR_CHECK1 = addr_check1;
	}
	public String getADDR_CHECK2() {
		return ADDR_CHECK2;
	}
	public void setADDR_CHECK2(String addr_check2) {
		ADDR_CHECK2 = addr_check2;
	}
	public String getLC_SEL_NM() {
		return LC_SEL_NM;
	}
	public void setLC_SEL_NM(String lc_sel_nm) {
		LC_SEL_NM = lc_sel_nm;
	}
	public String getPT_SEL_NM() {
		return PT_SEL_NM;
	}
	public void setPT_SEL_NM(String pt_sel_nm) {
		PT_SEL_NM = pt_sel_nm;
	}
	public String getRT_SEL_NM() {
		return RT_SEL_NM;
	}
	public void setRT_SEL_NM(String rt_sel_nm) {
		RT_SEL_NM = rt_sel_nm;
	}
	public String getTP_TYP_NM() {
		return TP_TYP_NM;
	}
	public void setTP_TYP_NM(String tp_typ_nm) {
		TP_TYP_NM = tp_typ_nm;
	}
	public String getOWNER_BONBUN() {
		return OWNER_BONBUN;
	}
	public void setOWNER_BONBUN(String owner_bonbun) {
		OWNER_BONBUN = owner_bonbun;
	}
	public String getOWNER_BUBUN() {
		return OWNER_BUBUN;
	}
	public void setOWNER_BUBUN(String owner_bubun) {
		OWNER_BUBUN = owner_bubun;
	}
	public String getOWNER_TOBONBUN() {
		return OWNER_TOBONBUN;
	}
	public void setOWNER_TOBONBUN(String owner_tobonbun) {
		OWNER_TOBONBUN = owner_tobonbun;
	}
	public String getOWNER_TOBUBUN() {
		return OWNER_TOBUBUN;
	}
	public void setOWNER_TOBUBUN(String owner_tobubun) {
		OWNER_TOBUBUN = owner_tobubun;
	}
	public String getPARTN_SSN1() {
		return PARTN_SSN1;
	}
	public void setPARTN_SSN1(String partn_ssn1) {
		PARTN_SSN1 = partn_ssn1;
	}
	public String getPARTN_SSN2() {
		return PARTN_SSN2;
	}
	public void setPARTN_SSN2(String partn_ssn2) {
		PARTN_SSN2 = partn_ssn2;
	}
	public String getPARTN_BONBUN() {
		return PARTN_BONBUN;
	}
	public void setPARTN_BONBUN(String partn_bonbun) {
		PARTN_BONBUN = partn_bonbun;
	}
	public String getPARTN_BUBUN() {
		return PARTN_BUBUN;
	}
	public void setPARTN_BUBUN(String partn_bubun) {
		PARTN_BUBUN = partn_bubun;
	}
	public String getPARTN_HP1() {
		return PARTN_HP1;
	}
	public void setPARTN_HP1(String partn_hp1) {
		PARTN_HP1 = partn_hp1;
	}
	public String getPARTN_HP2() {
		return PARTN_HP2;
	}
	public void setPARTN_HP2(String partn_hp2) {
		PARTN_HP2 = partn_hp2;
	}
	public String getPARTN_HP3() {
		return PARTN_HP3;
	}
	public void setPARTN_HP3(String partn_hp3) {
		PARTN_HP3 = partn_hp3;
	}
	public String getPARTN_TEL1() {
		return PARTN_TEL1;
	}
	public void setPARTN_TEL1(String partn_tel1) {
		PARTN_TEL1 = partn_tel1;
	}
	public String getPARTN_TEL2() {
		return PARTN_TEL2;
	}
	public void setPARTN_TEL2(String partn_tel2) {
		PARTN_TEL2 = partn_tel2;
	}
	public String getPARTN_TEL3() {
		return PARTN_TEL3;
	}
	public void setPARTN_TEL3(String partn_tel3) {
		PARTN_TEL3 = partn_tel3;
	}
	public String getPARTN_TOBONBUN() {
		return PARTN_TOBONBUN;
	}
	public void setPARTN_TOBONBUN(String partn_tobonbun) {
		PARTN_TOBONBUN = partn_tobonbun;
	}
	public String getPARTN_TOBUBUN() {
		return PARTN_TOBUBUN;
	}
	public void setPARTN_TOBUBUN(String partn_tobubun) {
		PARTN_TOBUBUN = partn_tobubun;
	}
	public String getOWNER_IMG_NAME() {
		return OWNER_IMG_NAME;
	}
	public void setOWNER_IMG_NAME(String owner_img_name) {
		OWNER_IMG_NAME = owner_img_name;
	}
	public String getPARTN_IMG_NAME() {
		return PARTN_IMG_NAME;
	}
	public void setPARTN_IMG_NAME(String partn_img_name) {
		PARTN_IMG_NAME = partn_img_name;
	}
}

	