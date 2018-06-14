package main.java.rojum.survey.model;


import main.java.common.model.RoadsBaseBean;

/**
 * @author ksic
 *
 */
public class SurveyBean extends RoadsBaseBean{
	
	private String R_ID = "";
	private String SURVEY_YEAR = "";
	private String GAPAN_NO = "";
	private String OWNER_NAME = "";
	private String OWNER_SSN = "";
	private String WITH_ADDR = "";
	private String PLACE_A = "";
	private String FT_TYP_NM = "";
	private String FT_SEL_NM = "";
	private String MAINTN_OB = "";
	private String TAXTATION_AT = "";
	private String REG_DATE = "";
	private String FOUND_DATE = "";
	private String SPECIAL_ST = "";
	private String SPECIAL_DATE = "";
  	private String OWNER_HP = "";
  	private String SG_TYP = "";
  	private String UN_TYP = "";
  	
  	private String SI = "";
  	private String GUN = "";
  	private String DORO_NM = "";
  	private String BD_NM = "";
  	private String BD_DET_NM = "";
  	private String BD_BON = "";
  	
  	private String BD_BU = "";
  	private String ADDR_NEW = "";
  //********** BEGIN_현진_20120312
  	private String GUGAN_CD = "";

  	/* 2014.08.10 kny */
  	private String FT_TYP = "";
  	
  	public String getFT_TYP() {
		return FT_TYP;
	}
	public void setFT_TYP(String fTTYP) {
		FT_TYP = fTTYP;
	}
	/* 20121024 by ksic 실 거주지 주소 추가 시작 */
  	private String ADDR_JIBUN = "";

  	public String getADDR_JIBUN() {
		return ADDR_JIBUN;
	}
	public void setADDR_JIBUN(String aDDRJIBUN) {
		ADDR_JIBUN = aDDRJIBUN;
	}
	/* 20121024 by ksic 실 거주지 주소 추가 끝 */

  	
	public String getGUGAN_CD() {
		return GUGAN_CD;
	}
	public void setGUGAN_CD(String gUGANCD) {
		GUGAN_CD = gUGANCD;
	}
  //********** END_현진_20120312
  	

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
	public String getADDR_NEW() {
		return ADDR_NEW;
	}
	public void setADDR_NEW(String aDDR_NEW) {
		ADDR_NEW = aDDR_NEW;
	}
	public String getUN_TYP() {
		return UN_TYP;
	}
	public void setUN_TYP(String uN_TYP) {
		UN_TYP = uN_TYP;
	}
	public String getSG_TYP() {
		return SG_TYP;
	}
	public void setSG_TYP(String sG_TYP) {
		SG_TYP = sG_TYP;
	}
	public String getOWNER_HP() {
		return OWNER_HP;
	}
	public void setOWNER_HP(String oWNER_HP) {
		OWNER_HP = oWNER_HP;
	}
	public String getSPECIAL_DATE() {
		return SPECIAL_DATE;
	}
	public void setSPECIAL_DATE(String sPECIAL_DATE) {
		SPECIAL_DATE = sPECIAL_DATE;
	}
	public String getREG_DATE() {
		return REG_DATE;
	}
	public void setREG_DATE(String rEG_DATE) {
		REG_DATE = rEG_DATE;
	}
	public String getFOUND_DATE() {
		return FOUND_DATE;
	}
	public void setFOUND_DATE(String fOUND_DATE) {
		FOUND_DATE = fOUND_DATE;
	}
	public String getSPECIAL_ST() {
		return SPECIAL_ST;
	}
	public void setSPECIAL_ST(String sPECIAL_ST) {
		SPECIAL_ST = sPECIAL_ST;
	}
	public String getSURVEY_YEAR() {
		return SURVEY_YEAR;
	}
	public void setSURVEY_YEAR(String sURVEY_YEAR) {
		SURVEY_YEAR = sURVEY_YEAR;
	}
	public String getR_ID() {
		return R_ID;
	}
	public void setR_ID(String r_ID) {
		R_ID = r_ID;
	}
	public String getGAPAN_NO() {
		return GAPAN_NO;
	}
	public void setGAPAN_NO(String gAPAN_NO) {
		GAPAN_NO = gAPAN_NO;
	}
	public String getOWNER_NAME() {
		return OWNER_NAME;
	}
	public void setOWNER_NAME(String oWNER_NAME) {
		OWNER_NAME = oWNER_NAME;
	}
	public String getOWNER_SSN() {
		return OWNER_SSN;
	}
	public void setOWNER_SSN(String oWNER_SSN) {
		OWNER_SSN = oWNER_SSN;
	}
	public String getWITH_ADDR() {
		return WITH_ADDR;
	}
	public void setWITH_ADDR(String wITH_ADDR) {
		WITH_ADDR = wITH_ADDR;
	}
	public String getPLACE_A() {
		return PLACE_A;
	}
	public void setPLACE_A(String pLACE_A) {
		PLACE_A = pLACE_A;
	}
	public String getFT_TYP_NM() {
		return FT_TYP_NM;
	}
	public void setFT_TYP_NM(String fT_TYP_NM) {
		FT_TYP_NM = fT_TYP_NM;
	}
	public String getFT_SEL_NM() {
		return FT_SEL_NM;
	}
	public void setFT_SEL_NM(String fT_SEL_NM) {
		FT_SEL_NM = fT_SEL_NM;
	}
	public String getMAINTN_OB() {
		return MAINTN_OB;
	}
	public void setMAINTN_OB(String mAINTN_OB) {
		MAINTN_OB = mAINTN_OB;
	}
	public String getTAXTATION_AT() {
		return TAXTATION_AT;
	}
	public void setTAXTATION_AT(String tAXTATION_AT) {
		TAXTATION_AT = tAXTATION_AT;
	}
}
