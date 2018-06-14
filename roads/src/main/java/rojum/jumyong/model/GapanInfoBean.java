
package main.java.rojum.jumyong.model;

import org.springframework.web.multipart.MultipartFile;

import main.java.common.model.RoadsBaseBean;

public class GapanInfoBean extends RoadsBaseBean {
	private String GAPAN_NO 	= "";
	private String X_COORD 		= "";
	private String Y_COORD 		= "";
	private String GP_TYP		= "";
	private String PURPOSE_CD	= "";
	private String WITH_PNU		= "";
	private String WITH_ADDR	= "";
	private String WITH_INFO	= "";
	private String ROAD_INFO	= "";
	private String AR_SEL		= "";
	private String AR_TXT		= "";
	private String UC_SEL		= "";
	private String UC_TXT		= "";
	private String FOUND_DATE	= "";
	private String FT_TYP		= "";
	private String FT_SEL		= "";
	private String FACIL_L		= "";
	private String FACIL_W		= "";
	private String FACIL_H		= "";
	private String SHOP_IMG_NAME= "";
	private MultipartFile SHOP_IMG;
	private String PLACE_L		= "";
	private String PLACE_H		= "";
	private String PLACE_A		= "";
	private String CAR_NUM		= "";
	private String CAR_TON		= "";
	private String SPECIAL_ST	= "";
	private String TAXTATION_AT	= "";
	private String MAINTN_OB	= "";
	private String MT_SEL		= "";
	private String DP_SEL		= "";
	private String DP_TXT		= "";
	private String SG_TYP		= "";
	private String SG_SEL		= "";
	private String SG_ITM		= "";
	private String LIQUOR_SL	= "";
	private String LPGAS_US		= "";
	private String OPEN_TIME	= "";
	private String CLOSE_TIME	= "";
	private String MEM_NUM		= "";
	private String PERMIT_DATE	= "";
	private String DAY_SALES	= "";
	private String UN_TYP		= "";
	private String UN_TXT		= "";
	private String NOTES		= "";
	
	private String TYPE			= "";
	private String SECTION		= "";
	private String OWNER_SET	= "";
	private String TAX_SET		= "";
	private String MUL_FROMDATE	= "";
	private String MUL_TODATE	= "";
	
	private String OWNER_SET_NM = "";
	
	private String HJ_CD = "";
	
	private String REDUCTION_RATE = "";
	private String REDUCTION_REASON = "";
	private String PICKUP_DATE = "";
	private String SHOP_IMG2_NAME= "";
	private MultipartFile SHOP_IMG2;
	private String RETURN_DATE = "";
	private String RETURN_STATUS = "";
	private String FT_ETC = "";
	private String PICKUP_YN = "";
	
	
	private String SURVEY_YEAR = "";
	private String MANAGE_TYP = "";
	private String GUIDE_DATE = "";
	
	private String SPECIAL_DATE = "";
	private String FT_CAT = "";
	private String CAR_NO = "";
	
	/* 2014.07 kny */
	private String WITH_DORO_NM ="";
	private String WITH_BD_BON ="";
	private String WITH_BD_BU ="";
	private String JIBUN = "";
	
	public String getJIBUN() {
		return JIBUN;
	}
	public void setJIBUN(String jIBUN) {
		JIBUN = jIBUN;
	}
	public String getWITH_DORO_NM() {
		return WITH_DORO_NM;
	}
	public void setWITH_DORO_NM(String wITHDORONM) {
		WITH_DORO_NM = wITHDORONM;
	}
	public String getWITH_BD_BON() {
		return WITH_BD_BON;
	}
	public void setWITH_BD_BON(String wITHBDBON) {
		WITH_BD_BON = wITHBDBON;
	}
	public String getWITH_BD_BU() {
		return WITH_BD_BU;
	}
	public void setWITH_BD_BU(String wITHBDBU) {
		WITH_BD_BU = wITHBDBU;
	}
	public String getCAR_NO() {
		return CAR_NO;
	}
	public void setCAR_NO(String cAR_NO) {
		CAR_NO = cAR_NO;
	}
	public String getSPECIAL_DATE() {
		return SPECIAL_DATE;
	}
	public void setSPECIAL_DATE(String sPECIAL_DATE) {
		SPECIAL_DATE = sPECIAL_DATE;
	}
	public String getFT_CAT() {
		return FT_CAT;
	}
	public void setFT_CAT(String fT_CAT) {
		FT_CAT = fT_CAT;
	}
	public String getSURVEY_YEAR() {
		return SURVEY_YEAR;
	}
	public void setSURVEY_YEAR(String sURVEY_YEAR) {
		SURVEY_YEAR = sURVEY_YEAR;
	}
	public String getMANAGE_TYP() {
		return MANAGE_TYP;
	}
	public void setMANAGE_TYP(String mANAGE_TYP) {
		MANAGE_TYP = mANAGE_TYP;
	}
	public String getGUIDE_DATE() {
		return GUIDE_DATE;
	}
	public void setGUIDE_DATE(String gUIDE_DATE) {
		GUIDE_DATE = gUIDE_DATE;
	}
	public String getPICKUP_YN() {
		return PICKUP_YN;
	}
	public void setPICKUP_YN(String pICKUPYN) {
		PICKUP_YN = pICKUPYN;
	}
	public String getGAPAN_NO() {
		return GAPAN_NO;
	}
	public void setGAPAN_NO(String gAPANNO) {
		GAPAN_NO = gAPANNO;
	}
	public String getX_COORD() {
		return X_COORD;
	}
	public void setX_COORD(String xCOORD) {
		X_COORD = xCOORD;
	}
	public String getY_COORD() {
		return Y_COORD;
	}
	public void setY_COORD(String yCOORD) {
		Y_COORD = yCOORD;
	}
	public String getGP_TYP() {
		return GP_TYP;
	}
	public void setGP_TYP(String gPTYP) {
		GP_TYP = gPTYP;
	}
	public String getPURPOSE_CD() {
		return PURPOSE_CD;
	}
	public void setPURPOSE_CD(String pURPOSECD) {
		PURPOSE_CD = pURPOSECD;
	}
	public String getWITH_PNU() {
		return WITH_PNU;
	}
	public void setWITH_PNU(String wITHPNU) {
		WITH_PNU = wITHPNU;
	}
	public String getWITH_ADDR() {
		return WITH_ADDR;
	}
	public void setWITH_ADDR(String wITHADDR) {
		WITH_ADDR = wITHADDR;
	}
	public String getWITH_INFO() {
		return WITH_INFO;
	}
	public void setWITH_INFO(String wITHINFO) {
		WITH_INFO = wITHINFO;
	}
	public String getROAD_INFO() {
		return ROAD_INFO;
	}
	public void setROAD_INFO(String rOADINFO) {
		ROAD_INFO = rOADINFO;
	}
	public String getAR_SEL() {
		return AR_SEL;
	}
	public void setAR_SEL(String aRSEL) {
		AR_SEL = aRSEL;
	}
	public String getAR_TXT() {
		return AR_TXT;
	}
	public void setAR_TXT(String aRTXT) {
		AR_TXT = aRTXT;
	}
	public String getUC_SEL() {
		return UC_SEL;
	}
	public void setUC_SEL(String uCSEL) {
		UC_SEL = uCSEL;
	}
	public String getUC_TXT() {
		return UC_TXT;
	}
	public void setUC_TXT(String uCTXT) {
		UC_TXT = uCTXT;
	}
	public String getFOUND_DATE() {
		return FOUND_DATE;
	}
	public void setFOUND_DATE(String fOUNDDATE) {
		FOUND_DATE = fOUNDDATE;
	}
	public String getFT_TYP() {
		return FT_TYP;
	}
	public void setFT_TYP(String fTTYP) {
		FT_TYP = fTTYP;
	}
	public String getFT_SEL() {
		return FT_SEL;
	}
	public void setFT_SEL(String fTSEL) {
		FT_SEL = fTSEL;
	}
	public String getFACIL_L() {
		return FACIL_L;
	}
	public void setFACIL_L(String fACILL) {
		FACIL_L = fACILL;
	}
	public String getFACIL_W() {
		return FACIL_W;
	}
	public void setFACIL_W(String fACILW) {
		FACIL_W = fACILW;
	}
	public String getFACIL_H() {
		return FACIL_H;
	}
	public void setFACIL_H(String fACILH) {
		FACIL_H = fACILH;
	}
	public String getSHOP_IMG_NAME() {
		return SHOP_IMG_NAME;
	}
	public void setSHOP_IMG_NAME(String sHOPIMGNAME) {
		SHOP_IMG_NAME = sHOPIMGNAME;
	}
	public MultipartFile getSHOP_IMG() {
		return SHOP_IMG;
	}
	public void setSHOP_IMG(MultipartFile sHOPIMG) {
		SHOP_IMG = sHOPIMG;
	}
	public String getPLACE_L() {
		return PLACE_L;
	}
	public void setPLACE_L(String pLACEL) {
		PLACE_L = pLACEL;
	}
	public String getPLACE_H() {
		return PLACE_H;
	}
	public void setPLACE_H(String pLACEH) {
		PLACE_H = pLACEH;
	}
	public String getPLACE_A() {
		return PLACE_A;
	}
	public void setPLACE_A(String pLACEA) {
		PLACE_A = pLACEA;
	}
	public String getCAR_NUM() {
		return CAR_NUM;
	}
	public void setCAR_NUM(String cARNUM) {
		CAR_NUM = cARNUM;
	}
	public String getCAR_TON() {
		return CAR_TON;
	}
	public void setCAR_TON(String cARTON) {
		CAR_TON = cARTON;
	}
	public String getSPECIAL_ST() {
		return SPECIAL_ST;
	}
	public void setSPECIAL_ST(String sPECIALST) {
		SPECIAL_ST = sPECIALST;
	}
	public String getTAXTATION_AT() {
		return TAXTATION_AT;
	}
	public void setTAXTATION_AT(String tAXTATIONAT) {
		TAXTATION_AT = tAXTATIONAT;
	}
	public String getMAINTN_OB() {
		return MAINTN_OB;
	}
	public void setMAINTN_OB(String mAINTNOB) {
		MAINTN_OB = mAINTNOB;
	}
	public String getMT_SEL() {
		return MT_SEL;
	}
	public void setMT_SEL(String mTSEL) {
		MT_SEL = mTSEL;
	}
	public String getDP_SEL() {
		return DP_SEL;
	}
	public void setDP_SEL(String dPSEL) {
		DP_SEL = dPSEL;
	}
	public String getDP_TXT() {
		return DP_TXT;
	}
	public void setDP_TXT(String dPTXT) {
		DP_TXT = dPTXT;
	}
	public String getSG_TYP() {
		return SG_TYP;
	}
	public void setSG_TYP(String sGTYP) {
		SG_TYP = sGTYP;
	}
	public String getSG_SEL() {
		return SG_SEL;
	}
	public void setSG_SEL(String sGSEL) {
		SG_SEL = sGSEL;
	}
	public String getSG_ITM() {
		return SG_ITM;
	}
	public void setSG_ITM(String sGITM) {
		SG_ITM = sGITM;
	}
	public String getLIQUOR_SL() {
		return LIQUOR_SL;
	}
	public void setLIQUOR_SL(String lIQUORSL) {
		LIQUOR_SL = lIQUORSL;
	}
	public String getLPGAS_US() {
		return LPGAS_US;
	}
	public void setLPGAS_US(String lPGASUS) {
		LPGAS_US = lPGASUS;
	}
	public String getOPEN_TIME() {
		return OPEN_TIME;
	}
	public void setOPEN_TIME(String oPENTIME) {
		OPEN_TIME = oPENTIME;
	}
	public String getCLOSE_TIME() {
		return CLOSE_TIME;
	}
	public void setCLOSE_TIME(String cLOSETIME) {
		CLOSE_TIME = cLOSETIME;
	}
	public String getMEM_NUM() {
		return MEM_NUM;
	}
	public void setMEM_NUM(String mEMNUM) {
		MEM_NUM = mEMNUM;
	}
	public String getPERMIT_DATE() {
		return PERMIT_DATE;
	}
	public void setPERMIT_DATE(String pERMITDATE) {
		PERMIT_DATE = pERMITDATE;
	}
	public String getDAY_SALES() {
		return DAY_SALES;
	}
	public void setDAY_SALES(String dAYSALES) {
		DAY_SALES = dAYSALES;
	}
	public String getUN_TYP() {
		return UN_TYP;
	}
	public void setUN_TYP(String uNTYP) {
		UN_TYP = uNTYP;
	}
	public String getUN_TXT() {
		return UN_TXT;
	}
	public void setUN_TXT(String uNTXT) {
		UN_TXT = uNTXT;
	}
	public String getNOTES() {
		return NOTES;
	}
	public void setNOTES(String nOTES) {
		NOTES = nOTES;
	}
	public String getTYPE() {
		return TYPE;
	}
	public void setTYPE(String tYPE) {
		TYPE = tYPE;
	}
	public String getSECTION() {
		return SECTION;
	}
	public void setSECTION(String sECTION) {
		SECTION = sECTION;
	}
	public String getOWNER_SET() {
		return OWNER_SET;
	}
	public void setOWNER_SET(String oWNERSET) {
		OWNER_SET = oWNERSET;
	}
	public String getTAX_SET() {
		return TAX_SET;
	}
	public void setTAX_SET(String tAXSET) {
		TAX_SET = tAXSET;
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
	public String getOWNER_SET_NM() {
		return OWNER_SET_NM;
	}
	public void setOWNER_SET_NM(String oWNERSETNM) {
		OWNER_SET_NM = oWNERSETNM;
	}
	public String getHJ_CD() {
		return HJ_CD;
	}
	public void setHJ_CD(String hJCD) {
		HJ_CD = hJCD;
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
	public String getPICKUP_DATE() {
		return PICKUP_DATE;
	}
	public void setPICKUP_DATE(String pICKUPDATE) {
		PICKUP_DATE = pICKUPDATE;
	}
	public String getSHOP_IMG2_NAME() {
		return SHOP_IMG2_NAME;
	}
	public void setSHOP_IMG2_NAME(String sHOPIMG2NAME) {
		SHOP_IMG2_NAME = sHOPIMG2NAME;
	}
	public MultipartFile getSHOP_IMG2() {
		return SHOP_IMG2;
	}
	public void setSHOP_IMG2(MultipartFile sHOPIMG2) {
		SHOP_IMG2 = sHOPIMG2;
	}
	public String getRETURN_DATE() {
		return RETURN_DATE;
	}
	public void setRETURN_DATE(String rETURNDATE) {
		RETURN_DATE = rETURNDATE;
	}
	public String getRETURN_STATUS() {
		return RETURN_STATUS;
	}
	public void setRETURN_STATUS(String rETURNSTATUS) {
		RETURN_STATUS = rETURNSTATUS;
	}
	public String getFT_ETC() {
		return FT_ETC;
	}
	public void setFT_ETC(String fTETC) {
		FT_ETC = fTETC;
	}
	
}

	