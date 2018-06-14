//	2009		Kim Yun Seo

package main.java.jumyong.saewe.model;

public class TaxationBean {

	String	ADMIN_NO		= "";
	String	SIGU_CD			= "";
	String	BJ_CD			= "";
	String	TAX_NO			= "";
	String	DEPT_CD			= "";
	String	TAX_CD			= "";
	String	TAX_CD_GU		= "";
	String	TAX_CD_MOK		= "";
	String	TAX_CD_SE		= "";
	String	TAX_GUBUN		= "";
	String	TAX_SET			= "";
	String	TAX_YM			= "";
	String	OBJ_SET			= "";
	String	TAXPAYER_ID		= "";
	String	TAXPAYER_SET	= "";
	String	LIVE			= "";
	String	INDATE			= "";
	String	OVERDATE		= "";
	String	TAX_DATE		= "";
	String	ADD_SET			= "";
	String	ADD_YN			= "";
	String	NOTES			= "";
	String	LIMIT_SUM		= "";
	String	LIMIT_CNT		= "";
	String	RATE			= "";
	String	RATE_CAUSE		= "";
	String	BONSE			= "";
	String	GIGUM			= "";
	String	GUKSE			= "";
	String	SISE			= "";
	String	GUSE			= "";
	String	VAT				= "";
	String	INTAX			= "";
	String	OVERTAX			= "";
	String	FORM1			= "";
	String	FORM2			= "";
	String	SEQ				= "";
	String	TAX_YN			= "";
	String	SUBUSEO_CD		= "";
	String	OCR_SIGU_CD		= "";
	String	OCR_BUSEO_CD	= "";
	String	GU_CODE			= "";
	String	BUNNAP_NO		= "";
	String	YEAR			= "";
	String	SUSI_NO			= "";
	
	String	GU_NM				= "";
	String	DEPT_NM				= "";
	
	String	SIDO				= "";
	String	TAXPAYER_NM			= "";
	String	HP					= "";
	String	TEL					= "";
	String	EMAIL				= "";
	String	POST				= "";
	String	ADDR1				= "";
	String	ADDR2				= "";
	String	ROAD_ADD			= "";
	String	BD_NM				= "";
	String	SIGUNGU				= "";
	String	SPC_CD				= "";
	String	BONBUN				= "";
	String	BUBUN				= "";
	String	TONG				= "";
	String	BAN					= "";
	String	BD_DONG				= "";
	String	BD_HO				= "";
	String	MUL_POST			= "";
	String	NEAR_ADDR1			= "";
	String	NEAR_ADDR2			= "";
	String	HJ_CD				= "";
	String	FORM_ADJUST			= "";
	String	PURPOSE_NM			= "";
	String	TYPE_NM				= "";
	String	USE_DATE			= "";
	String	AREA				= "";
	String	SECTION				= "";
	String	TOTAL_PERIOD		= "";
	String	PARTLY_PERIOD		= "";
	String	MUL_FROMDATE		= "";
	String	MUL_TODATE			= "";
	String	FROMDATE			= "";
	String	TODATE				= "";
	
	
	String ROAD_BON				= "";
	String ROAD_BU				= "";
	String SUM_ADJUST			= "";
	
	String CVAT					= "";
	
	String SSN					= "";
	
	String SUNAP_DATE			= "";
	
	
	String SI = "";
	String GUN = "";
	String DORO_NM = "";
	String BD_DET_NM = "";
	String BD_BON = "";
	String BD_BU = "";
	
	//********** BEGIN_현진_20120216
	// Querys.jumyong.saewe.Bugwa_View 호출 시 appeal, place 테이블 두 군데에서 BD_NM 컬럼이 있어서 
	// 쿼리문에 appeal 컬럼 일일이 열거 및  appeal 의 BD_NM을  ABD_MN으로 변경
	String ABD_NM = "";
	
	public String getABD_NM() {
		return ABD_NM;
	}
	public void setABD_NM(String aBDNM) {
		ABD_NM = aBDNM;
	}
	//********** END_현진_20120216
	
	//********** BEGIN_mihong_20150904
	String REDUCTION_RATE = "";
	
	public String getREDUCTION_RATE() {
		return REDUCTION_RATE;
	}
	public void setREDUCTION_RATE(String rEDUCTION_RATE) {
		REDUCTION_RATE = rEDUCTION_RATE;
	}
	//********** END_mihong_20150904
	
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
	public String getSUNAP_DATE() {
		return SUNAP_DATE;
	}
	public void setSUNAP_DATE(String sUNAP_DATE) {
		SUNAP_DATE = sUNAP_DATE;
	}
	public String getSSN() {
		return SSN;
	}
	public void setSSN(String sSN) {
		SSN = sSN;
	}
	public String getCVAT() {
		return CVAT;
	}
	public void setCVAT(String cVAT) {
		CVAT = cVAT;
	}
	public String getSUM_ADJUST() {
		return SUM_ADJUST;
	}
	public void setSUM_ADJUST(String sUMADJUST) {
		SUM_ADJUST = sUMADJUST;
	}
	public String getROAD_BON() {
		return ROAD_BON;
	}
	public void setROAD_BON(String rOADBON) {
		ROAD_BON = rOADBON;
	}
	public String getROAD_BU() {
		return ROAD_BU;
	}
	public void setROAD_BU(String rOADBU) {
		ROAD_BU = rOADBU;
	}
	public String getFROMDATE() {
		return FROMDATE;
	}
	public void setFROMDATE(String fROMDATE) {
		FROMDATE = fROMDATE;
	}
	public String getTODATE() {
		return TODATE;
	}
	public void setTODATE(String tODATE) {
		TODATE = tODATE;
	}
	public String getMUL_FROMDATE() {
		return MUL_FROMDATE;
	}
	public void setMUL_FROMDATE(String mULFROMDATE) {
		MUL_FROMDATE = mULFROMDATE;
	}
	public String getMUL_TODATE() {
		return MUL_TODATE;
	}
	public void setMUL_TODATE(String mULTODATE) {
		MUL_TODATE = mULTODATE;
	}
	public String getTOTAL_PERIOD() {
		return TOTAL_PERIOD;
	}
	public void setTOTAL_PERIOD(String tOTALPERIOD) {
		TOTAL_PERIOD = tOTALPERIOD;
	}
	public String getPARTLY_PERIOD() {
		return PARTLY_PERIOD;
	}
	public void setPARTLY_PERIOD(String pARTLYPERIOD) {
		PARTLY_PERIOD = pARTLYPERIOD;
	}
	public String getSECTION() {
		return SECTION;
	}
	public void setSECTION(String section) {
		SECTION = section;
	}
	public String getADD_SET() {
		return ADD_SET;
	}
	public void setADD_SET(String add_set) {
		ADD_SET = add_set;
	}
	public String getADD_YN() {
		return ADD_YN;
	}
	public void setADD_YN(String add_yn) {
		ADD_YN = add_yn;
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
	public String getADMIN_NO() {
		return ADMIN_NO;
	}
	public void setADMIN_NO(String admin_no) {
		ADMIN_NO = admin_no;
	}
	public String getAREA() {
		return AREA;
	}
	public void setAREA(String area) {
		AREA = area;
	}
	public String getBAN() {
		return BAN;
	}
	public void setBAN(String ban) {
		BAN = ban;
	}
	public String getBD_DONG() {
		return BD_DONG;
	}
	public void setBD_DONG(String bd_dong) {
		BD_DONG = bd_dong;
	}
	public String getBD_HO() {
		return BD_HO;
	}
	public void setBD_HO(String bd_ho) {
		BD_HO = bd_ho;
	}
	public String getBD_NM() {
		return BD_NM;
	}
	public void setBD_NM(String bd_nm) {
		BD_NM = bd_nm;
	}
	public String getBJ_CD() {
		return BJ_CD;
	}
	public void setBJ_CD(String bj_cd) {
		BJ_CD = bj_cd;
	}
	public String getBONBUN() {
		return BONBUN;
	}
	public void setBONBUN(String bonbun) {
		BONBUN = bonbun;
	}
	public String getBONSE() {
		return BONSE;
	}
	public void setBONSE(String bonse) {
		BONSE = bonse;
	}
	public String getBUBUN() {
		return BUBUN;
	}
	public void setBUBUN(String bubun) {
		BUBUN = bubun;
	}
	public String getBUNNAP_NO() {
		return BUNNAP_NO;
	}
	public void setBUNNAP_NO(String bunnap_no) {
		BUNNAP_NO = bunnap_no;
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
	public String getEMAIL() {
		return EMAIL;
	}
	public void setEMAIL(String email) {
		EMAIL = email;
	}
	public String getFORM_ADJUST() {
		return FORM_ADJUST;
	}
	public void setFORM_ADJUST(String form_adjust) {
		FORM_ADJUST = form_adjust;
	}
	public String getFORM1() {
		return FORM1;
	}
	public void setFORM1(String form1) {
		FORM1 = form1;
	}
	public String getFORM2() {
		return FORM2;
	}
	public void setFORM2(String form2) {
		FORM2 = form2;
	}
	public String getGIGUM() {
		return GIGUM;
	}
	public void setGIGUM(String gigum) {
		GIGUM = gigum;
	}
	public String getGU_CODE() {
		return GU_CODE;
	}
	public void setGU_CODE(String gu_code) {
		GU_CODE = gu_code;
	}
	public String getGU_NM() {
		return GU_NM;
	}
	public void setGU_NM(String gu_nm) {
		GU_NM = gu_nm;
	}
	public String getGUKSE() {
		return GUKSE;
	}
	public void setGUKSE(String gukse) {
		GUKSE = gukse;
	}
	public String getGUSE() {
		return GUSE;
	}
	public void setGUSE(String guse) {
		GUSE = guse;
	}
	public String getHJ_CD() {
		return HJ_CD;
	}
	public void setHJ_CD(String hj_cd) {
		HJ_CD = hj_cd;
	}
	public String getHP() {
		return HP;
	}
	public void setHP(String hp) {
		HP = hp;
	}
	public String getINDATE() {
		return INDATE;
	}
	public void setINDATE(String indate) {
		INDATE = indate;
	}
	public String getINTAX() {
		return INTAX;
	}
	public void setINTAX(String intax) {
		INTAX = intax;
	}
	public String getLIMIT_CNT() {
		return LIMIT_CNT;
	}
	public void setLIMIT_CNT(String limit_cnt) {
		LIMIT_CNT = limit_cnt;
	}
	public String getLIMIT_SUM() {
		return LIMIT_SUM;
	}
	public void setLIMIT_SUM(String limit_sum) {
		LIMIT_SUM = limit_sum;
	}
	public String getLIVE() {
		return LIVE;
	}
	public void setLIVE(String live) {
		LIVE = live;
	}
	public String getMUL_POST() {
		return MUL_POST;
	}
	public void setMUL_POST(String mul_post) {
		MUL_POST = mul_post;
	}
	public String getNEAR_ADDR1() {
		return NEAR_ADDR1;
	}
	public void setNEAR_ADDR1(String near_addr1) {
		NEAR_ADDR1 = near_addr1;
	}
	public String getNEAR_ADDR2() {
		return NEAR_ADDR2;
	}
	public void setNEAR_ADDR2(String near_addr2) {
		NEAR_ADDR2 = near_addr2;
	}
	public String getNOTES() {
		return NOTES;
	}
	public void setNOTES(String notes) {
		NOTES = notes;
	}
	public String getOBJ_SET() {
		return OBJ_SET;
	}
	public void setOBJ_SET(String obj_set) {
		OBJ_SET = obj_set;
	}
	public String getOCR_BUSEO_CD() {
		return OCR_BUSEO_CD;
	}
	public void setOCR_BUSEO_CD(String ocr_buseo_cd) {
		OCR_BUSEO_CD = ocr_buseo_cd;
	}
	public String getOCR_SIGU_CD() {
		return OCR_SIGU_CD;
	}
	public void setOCR_SIGU_CD(String ocr_sigu_cd) {
		OCR_SIGU_CD = ocr_sigu_cd;
	}
	public String getOVERDATE() {
		return OVERDATE;
	}
	public void setOVERDATE(String overdate) {
		OVERDATE = overdate;
	}
	public String getOVERTAX() {
		return OVERTAX;
	}
	public void setOVERTAX(String overtax) {
		OVERTAX = overtax;
	}
	public String getPOST() {
		return POST;
	}
	public void setPOST(String post) {
		POST = post;
	}
	public String getPURPOSE_NM() {
		return PURPOSE_NM;
	}
	public void setPURPOSE_NM(String purpose_nm) {
		PURPOSE_NM = purpose_nm;
	}
	public String getRATE() {
		return RATE;
	}
	public void setRATE(String rate) {
		RATE = rate;
	}
	public String getRATE_CAUSE() {
		return RATE_CAUSE;
	}
	public void setRATE_CAUSE(String rate_cause) {
		RATE_CAUSE = rate_cause;
	}
	public String getROAD_ADD() {
		return ROAD_ADD;
	}
	public void setROAD_ADD(String road_add) {
		ROAD_ADD = road_add;
	}
	public String getSEQ() {
		return SEQ;
	}
	public void setSEQ(String seq) {
		SEQ = seq;
	}
	public String getSIDO() {
		return SIDO;
	}
	public void setSIDO(String sido) {
		SIDO = sido;
	}
	public String getSIGU_CD() {
		return SIGU_CD;
	}
	public void setSIGU_CD(String sigu_cd) {
		SIGU_CD = sigu_cd;
	}
	public String getSIGUNGU() {
		return SIGUNGU;
	}
	public void setSIGUNGU(String sigungu) {
		SIGUNGU = sigungu;
	}
	public String getSISE() {
		return SISE;
	}
	public void setSISE(String sise) {
		SISE = sise;
	}
	public String getSPC_CD() {
		return SPC_CD;
	}
	public void setSPC_CD(String spc_cd) {
		SPC_CD = spc_cd;
	}
	public String getSUBUSEO_CD() {
		return SUBUSEO_CD;
	}
	public void setSUBUSEO_CD(String subuseo_cd) {
		SUBUSEO_CD = subuseo_cd;
	}
	public String getSUSI_NO() {
		return SUSI_NO;
	}
	public void setSUSI_NO(String susi_no) {
		SUSI_NO = susi_no;
	}
	public String getTAX_CD() {
		return TAX_CD;
	}
	public void setTAX_CD(String tax_cd) {
		TAX_CD = tax_cd;
	}
	public String getTAX_CD_GU() {
		return TAX_CD_GU;
	}
	public void setTAX_CD_GU(String tax_cd_gu) {
		TAX_CD_GU = tax_cd_gu;
	}
	public String getTAX_CD_MOK() {
		return TAX_CD_MOK;
	}
	public void setTAX_CD_MOK(String tax_cd_mok) {
		TAX_CD_MOK = tax_cd_mok;
	}
	public String getTAX_CD_SE() {
		return TAX_CD_SE;
	}
	public void setTAX_CD_SE(String tax_cd_se) {
		TAX_CD_SE = tax_cd_se;
	}
	public String getTAX_DATE() {
		return TAX_DATE;
	}
	public void setTAX_DATE(String tax_date) {
		TAX_DATE = tax_date;
	}
	public String getTAX_NO() {
		return TAX_NO;
	}
	public void setTAX_NO(String tax_no) {
		TAX_NO = tax_no;
	}
	public String getTAX_GUBUN() {
		return TAX_GUBUN;
	}
	public void setTAX_GUBUN(String tax_gubun) {
		TAX_GUBUN = tax_gubun;
	}
	public String getTAX_SET() {
		return TAX_SET;
	}
	public void setTAX_SET(String tax_set) {
		TAX_SET = tax_set;
	}
	public String getTAX_YM() {
		return TAX_YM;
	}
	public void setTAX_YM(String tax_ym) {
		TAX_YM = tax_ym;
	}
	public String getTAX_YN() {
		return TAX_YN;
	}
	public void setTAX_YN(String tax_yn) {
		TAX_YN = tax_yn;
	}
	public String getTAXPAYER_ID() {
		return TAXPAYER_ID;
	}
	public void setTAXPAYER_ID(String taxpayer_id) {
		TAXPAYER_ID = taxpayer_id;
	}
	public String getTAXPAYER_NM() {
		return TAXPAYER_NM;
	}
	public void setTAXPAYER_NM(String taxpayer_nm) {
		TAXPAYER_NM = taxpayer_nm;
	}
	public String getTAXPAYER_SET() {
		return TAXPAYER_SET;
	}
	public void setTAXPAYER_SET(String taxpayer_set) {
		TAXPAYER_SET = taxpayer_set;
	}
	public String getTEL() {
		return TEL;
	}
	public void setTEL(String tel) {
		TEL = tel;
	}
	public String getTONG() {
		return TONG;
	}
	public void setTONG(String tong) {
		TONG = tong;
	}
	public String getTYPE_NM() {
		return TYPE_NM;
	}
	public void setTYPE_NM(String type_nm) {
		TYPE_NM = type_nm;
	}
	public String getUSE_DATE() {
		return USE_DATE;
	}
	public void setUSE_DATE(String use_date) {
		USE_DATE = use_date;
	}
	public String getVAT() {
		return VAT;
	}
	public void setVAT(String vat) {
		VAT = vat;
	}
	public String getYEAR() {
		return YEAR;
	}
	public void setYEAR(String year) {
		YEAR = year;
	}
}
