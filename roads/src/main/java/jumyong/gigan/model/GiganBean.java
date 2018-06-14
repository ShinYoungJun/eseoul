//	2009		Kim Yun Seo
//	기간연장 조회 리스트

package main.java.jumyong.gigan.model;

public	class	GiganBean {

	String	ADMIN_NO		= "";
	String  CUT_ADMIN_NO 	= "";
	String	TYPE			= "";
	String	NAME			= "";
	String	PURPOSE_CD		= "";
	String	BJ_CD			= "";
	String	SAN_CK			= "";
	String	BONBUN			= "";
	String	BUBUN			= "";
	String	MUL_FROMDATE	= "";
	String	MUL_TODATE		= "";
	
	String	RN				= "";
	String	PURPOSE_CLASS	= "";
	String	PURPOSE_SORT	= "";
	String	PURPOSE_KIND	= "";
	String	PURPOSE			= "";
	String	GIGAN			= "";
	String	JUMYONGJI		= "";
	String  APPEAL_ADDR     = "";
	
	String  SI     = "";
	String  GUN     = "";
	String  DORO_NM     = "";
	String  BD_BON     = "";
	String  BD_BU     = "";
	String  BD_NM     = "";
	String  BD_DET_NM     = ""; 
	
	String  TOSI     = "";
	String  TOGUN     = "";
	String  TODORO_NM     = "";
	String  TOBD_BON     = "";
	String  TOBD_BU     = "";
	String  TOBD_NM     = "";
	String  TOBD_DET_NM     = "";
	
	// 2015.07.13 kny
	String TEL = "";
	String HP = "";
	
	String TOPOST = "";
	String SONGDALGI = "";
	String SONGDALGI_ROAD = "";
	String TOTEL = "";
	String TOHP = "";
	String TONM = "";
	
	String PERCENT_RATE = "";
	String PERCENT_REASON = "";
	String REDUCTION_RATE = "";
	String REDUCTION_REASON = "";
	
	String ROAD_ADDR = "";
	String JUMYONGJI_DORO_ADDR = "";
	String BD_NM_JUMJI = "";
	
	public String getBD_NM_JUMJI() {
		return BD_NM_JUMJI;
	}
	public void setBD_NM_JUMJI(String bDNMJUMJI) {
		BD_NM_JUMJI = bDNMJUMJI;
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
	public String getSONGDALGI() {
		return SONGDALGI;
	}
	public void setSONGDALGI(String sONGDALGI) {
		SONGDALGI = sONGDALGI;
	}
	public String getSONGDALGI_ROAD() {
		return SONGDALGI_ROAD;
	}
	public void setSONGDALGI_ROAD(String sONGDALGIROAD) {
		SONGDALGI_ROAD = sONGDALGIROAD;
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
	public String getTONM() {
		return TONM;
	}
	public void setTONM(String tONM) {
		TONM = tONM;
	}
	public String getPERCENT_RATE() {
		return PERCENT_RATE;
	}
	public void setPERCENT_RATE(String pERCENTRATE) {
		PERCENT_RATE = pERCENTRATE;
	}
	public String getPERCENT_REASON() {
		return PERCENT_REASON;
	}
	public void setPERCENT_REASON(String pERCENTREASON) {
		PERCENT_REASON = pERCENTREASON;
	}
	public String getREDUCTION_RATE() {
		return REDUCTION_RATE;
	}
	public void setREDUCTION_RATE(String rEDUCTIONRATE) {
		REDUCTION_RATE = rEDUCTIONRATE;
	}
	public String getREDUCTION_REASON() {
		return REDUCTION_REASON;
	}
	public void setREDUCTION_REASON(String rEDUCTIONREASON) {
		REDUCTION_REASON = rEDUCTIONREASON;
	}
	public String getROAD_ADDR() {
		return ROAD_ADDR;
	}
	public void setROAD_ADDR(String rOADADDR) {
		ROAD_ADDR = rOADADDR;
	}
	public String getJUMYONGJI_DORO_ADDR() {
		return JUMYONGJI_DORO_ADDR;
	}
	public void setJUMYONGJI_DORO_ADDR(String jUMYONGJIDOROADDR) {
		JUMYONGJI_DORO_ADDR = jUMYONGJIDOROADDR;
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
	String POST = "";
	String SSN = ""; 
	String TYPE_NM = "";
	String AREA_SIZE = "";
	
	String SECTION = "";
	String SECTION_NAME = "";
	
	
	
	
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
	public String getAREA_SIZE() {
		return AREA_SIZE;
	}
	public void setAREA_SIZE(String aREASIZE) {
		AREA_SIZE = aREASIZE;
	}
	public String getTYPE_NM() {
		return TYPE_NM;
	}
	public void setTYPE_NM(String tYPENM) {
		TYPE_NM = tYPENM;
	}
	public String getPOST() {
		return POST;
	}
	public void setPOST(String pOST) {
		POST = pOST;
	}
	public String getSSN() {
		return SSN;
	}
	public void setSSN(String sSN) {
		SSN = sSN;
	}
	public String getAPPEAL_ADDR() {
		return APPEAL_ADDR;
	}
	public void setAPPEAL_ADDR(String aPPEALADDR) {
		APPEAL_ADDR = aPPEALADDR;
	}
	public String getPURPOSE_CLASS() {
		return PURPOSE_CLASS;
	}
	public void setPURPOSE_CLASS(String purpose_class) {
		PURPOSE_CLASS = purpose_class;
	}
	public String getPURPOSE_SORT() {
		return PURPOSE_SORT;
	}
	public void setPURPOSE_SORT(String purpose_sort) {
		PURPOSE_SORT = purpose_sort;
	}
	public String getPURPOSE_KIND() {
		return PURPOSE_KIND;
	}
	public void setPURPOSE_KIND(String purpose_kind) {
		PURPOSE_KIND = purpose_kind;
	}
	public String getBJ_CD() {
		return BJ_CD;
	}
	public void setBJ_CD(String bj_cd) {
		BJ_CD = bj_cd;
	}
	public String getRN() {
		return RN;
	}
	public void setRN(String rn) {
		RN = rn;
	}
	public String getPURPOSE() {
		return PURPOSE;
	}
	public void setPURPOSE(String purpose) {
		PURPOSE = purpose;
	}
	public String getGIGAN() {
		return GIGAN;
	}
	public void setGIGAN(String gigan) {
		GIGAN = gigan;
	}
	public String getJUMYONGJI() {
		return JUMYONGJI;
	}
	public void setJUMYONGJI(String jumyongji) {
		JUMYONGJI = jumyongji;
	}
	public String getADMIN_NO() {
		return ADMIN_NO;
	}
	public void setADMIN_NO(String admin_no) {
		ADMIN_NO = admin_no;
	}
	public String getTYPE() {
		return TYPE;
	}
	public void setTYPE(String type) {
		TYPE = type;
	}
	public String getNAME() {
		return NAME;
	}
	public void setNAME(String name) {
		NAME = name;
	}
	public String getPURPOSE_CD() {
		return PURPOSE_CD;
	}
	public void setPURPOSE_CD(String purpose_cd) {
		PURPOSE_CD = purpose_cd;
	}
	public String getSAN_CK() {
		return SAN_CK;
	}
	public void setSAN_CK(String san_ck) {
		SAN_CK = san_ck;
	}
	public String getBONBUN() {
		return BONBUN;
	}
	public void setBONBUN(String bonbun) {
		BONBUN = bonbun;
	}
	public String getBUBUN() {
		return BUBUN;
	}
	public void setBUBUN(String bubun) {
		BUBUN = bubun;
	}
	public String getMUL_FROMDATE() {
		return MUL_FROMDATE;
	}
	public void setMUL_FROMDATE(String mul_fromdate) {
		MUL_FROMDATE = mul_fromdate;
	}
	public String getMUL_TODATE() {
		return MUL_TODATE;
	}
	public void setMUL_TODATE(String mul_todate) {
		MUL_TODATE = mul_todate;
	}
	public String getCUT_ADMIN_NO() {
		return CUT_ADMIN_NO;
	}
	public void setCUT_ADMIN_NO(String cut_admin_no) {
		CUT_ADMIN_NO = cut_admin_no;
	}
	
}
