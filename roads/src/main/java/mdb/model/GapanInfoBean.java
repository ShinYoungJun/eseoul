package main.java.mdb.model;

public class GapanInfoBean  {
	private String GAPAN_NO	= "";
	private String X_COORD = "";
	private String Y_COORD = "";
	private String GP_TYP = "";
	private String PURPOSE_CD = "";
	private String WITH_PNU = "";
	private String WITH_ADDR = "";
	private String WITH_INFO = "";
	private String ROAD_INFO = "";
	
	private String AR_SEL =  "";
	private String AR_TXT = "";
	private String UC_SEL = "";
	private String UC_TXT = "";
	private String FOUND_DATE = "";
	private String FT_TYP = "";
	private String FT_SEL = "";
	private String FACIL_L = "";
	private String FACIL_W = "";
	
	private String FACIL_H = "";
	private String SHOP_IMG = "";
	private String PLACE_L = "";
	private String PLACE_H = "";
	private String PLACE_A = "";
	private String CAR_NUM ="";
	private String CAR_TON = "";
	private String SPECIAL_ST = "";
	private String TAXTATION_AT = "";
	
	private String MAINTN_OB = "";
	private String MT_SEL = "";
	private String DP_SEL = "";
	private String DP_TXT = "";
	private String SG_TYP = "";
	private String SG_SEL = "";
	private String SG_ITM = "";
	private String LIQUOR_SL = "";
	private String LPGAS_US = "";
	
	private String OPEN_TIME = "";
	private String CLOSE_TIME = "";
	private String MEM_NUM = "";
	private String PERMIT_DATE = "";
	private String DAY_SALES = "";
	private String UN_TYP = "";
	private String UN_TXT = "";
	private String NOTES = "";
	private String TYPE = ""; 
	
	private String SECTION = "";
	private String OWNER_SET = "";
	private String TAX_SET = "";
	private String MUL_FROMDATE ="";
	private String MUL_TODATE = "";
	private String HJ_CD = "";
	private String DISUSE_DATE = "";
	private String DISUSE_REASON = "";
	private String DISUSE_MANAGER = "";
	
	private String OLD_SECTION = "";
	private String REDUCTION_RATE = "";
	private String REDUCTION_REASON = "";
	private String PICKUP_DATE= "";
	private String SHOP_IMG2 = "";
	private String RETURN_DATE = "";
	private String RETURN_YN = "";
	private String FT_ETC = "";
	private String PICKUP_YN= "";
	
	private String MODIFY_YN = "";
	private String SF_VALUE = "";
	private String HISTORY = "";
	private String MAKE_YM = "";
	private String SURVEY_YEAR = "";
	private String MANAGE_TYP = "";
	
	
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

	public String getMAKE_YM() {
		return MAKE_YM;
	}

	public void setMAKE_YM(String mAKEYM) {
		if(mAKEYM==null) MAKE_YM = ""; 
		else MAKE_YM = mAKEYM;
	}

	public String getX_COORD() {
		return X_COORD;
	}

	public void setX_COORD(String xCOORD) {
		if(xCOORD==null) X_COORD = "";
		else X_COORD = xCOORD;
	}

	public String getY_COORD() {
		return Y_COORD;
	}

	public void setY_COORD(String yCOORD) {
		if(yCOORD==null) Y_COORD = "";
		else Y_COORD = yCOORD;
	}

	public String getGP_TYP() {
		return GP_TYP;
	}

	public void setGP_TYP(String gPTYP) {
		if(gPTYP==null) GP_TYP = "";
		else GP_TYP = gPTYP;
	}

	public String getPURPOSE_CD() {
		return PURPOSE_CD;
	}

	public void setPURPOSE_CD(String pURPOSECD) {
		if(pURPOSECD == null) PURPOSE_CD = "";
		else PURPOSE_CD = pURPOSECD;
	}

	public String getWITH_PNU() {
		return WITH_PNU;
	}

	public void setWITH_PNU(String wITHPNU) {
		if(wITHPNU==null) WITH_PNU = "";
		else WITH_PNU = wITHPNU;
	}

	public String getWITH_ADDR() {
		return WITH_ADDR;
	}

	public void setWITH_ADDR(String wITHADDR) {
		if(wITHADDR == null) WITH_ADDR = "";
		else WITH_ADDR = wITHADDR;
	}

	public String getWITH_INFO() {
		return WITH_INFO;
	}

	public void setWITH_INFO(String wITHINFO) {
		if(wITHINFO==null) WITH_INFO = "";
		else WITH_INFO = wITHINFO;
	}

	public String getROAD_INFO() {
		return ROAD_INFO;
	}

	public void setROAD_INFO(String rOADINFO) {
		if(rOADINFO==null) ROAD_INFO = "";
		else ROAD_INFO = rOADINFO;
	}

	public String getAR_SEL() {
		return AR_SEL;
	}

	public void setAR_SEL(String aRSEL) {
		if(aRSEL==null) AR_SEL = "";
		else AR_SEL = aRSEL;
	}

	public String getAR_TXT() {
		return AR_TXT;
	}

	public void setAR_TXT(String aRTXT) {
		if(aRTXT==null)  AR_TXT ="";
		else AR_TXT = aRTXT;
	}

	public String getUC_SEL() {
		return UC_SEL;
	}

	public void setUC_SEL(String uCSEL) {
		if(uCSEL==null) UC_SEL ="";
		else UC_SEL = uCSEL;
	}

	public String getUC_TXT() {
		return UC_TXT;
	}

	public void setUC_TXT(String uCTXT) {
		if(uCTXT == null) UC_TXT ="";
		UC_TXT = uCTXT;
	}

	public String getFOUND_DATE() {
		return FOUND_DATE;
	}

	public void setFOUND_DATE(String fOUNDDATE) {
		if(fOUNDDATE==null) FOUND_DATE="";
		else FOUND_DATE = fOUNDDATE;
	}

	public String getFT_TYP() {
		return FT_TYP;
	}

	public void setFT_TYP(String fTTYP) {
		if(fTTYP==null) FT_TYP="";
		else FT_TYP = fTTYP;
	}

	public String getFT_SEL() {
		return FT_SEL;
	}

	public void setFT_SEL(String fTSEL) {
		if(fTSEL == null) FT_SEL="";
		else FT_SEL = fTSEL;
	}

	public String getFACIL_L() {
		return FACIL_L;
	}

	public void setFACIL_L(String fACILL) {
		if(fACILL==null) FACIL_L="0";
		else FACIL_L = fACILL;
	}

	public String getFACIL_W() {
		return FACIL_W;
	}

	public void setFACIL_W(String fACILW) {
		if(fACILW==null) FACIL_W="0";
		else FACIL_W = fACILW;
	}

	public String getFACIL_H() {
		return FACIL_H;
	}

	public void setFACIL_H(String fACILH) {
		if(fACILH==null) FACIL_H ="0";
		else FACIL_H = fACILH;
	}

	public String getSHOP_IMG() {
		return SHOP_IMG;
	}

	public void setSHOP_IMG(String sHOPIMG) {
		if(sHOPIMG==null) SHOP_IMG="";
		else SHOP_IMG = sHOPIMG;
	}

	public String getPLACE_L() {
		return PLACE_L;
	}

	public void setPLACE_L(String pLACEL) {
		if(pLACEL==null) PLACE_L="0";
		else PLACE_L = pLACEL;
	}

	public String getPLACE_H() {
		return PLACE_H;
	}

	public void setPLACE_H(String pLACEH) {
		if(pLACEH==null) PLACE_H="0";
		else PLACE_H = pLACEH;
	}

	public String getPLACE_A() {
		return PLACE_A;
	}

	public void setPLACE_A(String pLACEA) {
		if(pLACEA==null) PLACE_A="0";
		else PLACE_A = pLACEA;
	}

	public String getCAR_NUM() {
		return CAR_NUM;
	}

	public void setCAR_NUM(String cARNUM) {
		if(cARNUM==null) CAR_NUM="";
		else CAR_NUM = cARNUM;
	}

	public String getCAR_TON() {
		return CAR_TON;
	}

	public void setCAR_TON(String cARTON) {
		if(cARTON==null) CAR_TON="";
		else CAR_TON = cARTON;
	}

	public String getSPECIAL_ST() {
		return SPECIAL_ST;
	}

	public void setSPECIAL_ST(String sPECIALST) {
		if(sPECIALST==null) SPECIAL_ST="";
		else SPECIAL_ST = sPECIALST;
	}

	public String getTAXTATION_AT() {
		return TAXTATION_AT;
	}

	public void setTAXTATION_AT(String tAXTATIONAT) {
		if(tAXTATIONAT==null) TAXTATION_AT="";
		else TAXTATION_AT = tAXTATIONAT;
	}

	public String getMAINTN_OB() {
		return MAINTN_OB;
	}

	public void setMAINTN_OB(String mAINTNOB) {
		if(mAINTNOB==null) MAINTN_OB="";
		else MAINTN_OB = mAINTNOB;
	}

	public String getMT_SEL() {
		return MT_SEL;
	}

	public void setMT_SEL(String mTSEL) {
		if(mTSEL==null) MT_SEL="";
		else MT_SEL = mTSEL;
	}

	public String getDP_SEL() {
		return DP_SEL;
	}

	public void setDP_SEL(String dPSEL) {
		if(dPSEL ==null) DP_SEL="";
		else DP_SEL = dPSEL;
	}

	public String getDP_TXT() {
		return DP_TXT;
	}

	public void setDP_TXT(String dPTXT) {
		if(dPTXT==null) DP_TXT="";
		else DP_TXT = dPTXT;
	}

	public String getSG_TYP() {
		return SG_TYP;
	}

	public void setSG_TYP(String sGTYP) {
		if(sGTYP==null) SG_TYP="";
		else SG_TYP = sGTYP;
	}

	public String getSG_SEL() {
		return SG_SEL;
	}

	public void setSG_SEL(String sGSEL) {
		if(sGSEL==null) SG_SEL="";
		else SG_SEL = sGSEL;
	}

	public String getSG_ITM() {
		return SG_ITM;
	}

	public void setSG_ITM(String sGITM) {
		if(sGITM==null) SG_ITM="";
		else SG_ITM = sGITM;
	}

	public String getLIQUOR_SL() {
		return LIQUOR_SL;
	}

	public void setLIQUOR_SL(String lIQUORSL) {
		if(lIQUORSL==null) LIQUOR_SL="";
		else LIQUOR_SL = lIQUORSL;
	}

	public String getLPGAS_US() {
		return LPGAS_US;
	}

	public void setLPGAS_US(String lPGASUS) {
		if(lPGASUS==null) LPGAS_US="";
		else LPGAS_US = lPGASUS;
	}

	public String getOPEN_TIME() {
		return OPEN_TIME;
	}

	public void setOPEN_TIME(String oPENTIME) {
		if(oPENTIME==null) OPEN_TIME="";
		else OPEN_TIME = oPENTIME;
	}

	public String getCLOSE_TIME() {
		return CLOSE_TIME;
	}

	public void setCLOSE_TIME(String cLOSETIME) {
		if(cLOSETIME==null) CLOSE_TIME="";
		else CLOSE_TIME = cLOSETIME;
	}

	public String getMEM_NUM() {
		return MEM_NUM;
	}

	public void setMEM_NUM(String mEMNUM) {
		if(mEMNUM==null) MEM_NUM="0";
		else MEM_NUM = mEMNUM;
	}

	public String getPERMIT_DATE() {
		return PERMIT_DATE;
	}

	public void setPERMIT_DATE(String pERMITDATE) {
		if(pERMITDATE==null) PERMIT_DATE="";
		else PERMIT_DATE = pERMITDATE;
	}

	public String getDAY_SALES() {
		return DAY_SALES;
	}

	public void setDAY_SALES(String dAYSALES) {
		if(dAYSALES==null) DAY_SALES="";
		else DAY_SALES = dAYSALES;
	}

	public String getUN_TYP() {
		return UN_TYP;
	}

	public void setUN_TYP(String uNTYP) {
		if(uNTYP==null) UN_TYP="";
		else UN_TYP = uNTYP;
	}

	public String getUN_TXT() {
		return UN_TXT;
	}

	public void setUN_TXT(String uNTXT) {
		if(uNTXT==null) UN_TXT="";
		else UN_TXT = uNTXT;
	}

	public String getNOTES() {
		return NOTES;
	}

	public void setNOTES(String nOTES) {
		if(nOTES==null) NOTES="";
		else NOTES = nOTES;
	}

	public String getTYPE() {
		return TYPE;
	}

	public void setTYPE(String tYPE) {
		if(tYPE==null) TYPE="";
		else TYPE = tYPE;
	}

	public String getSECTION() {
		return SECTION;
	}

	public void setSECTION(String sECTION) {
		if(sECTION==null) SECTION="";
		else SECTION = sECTION;
	}

	public String getOWNER_SET() {
		return OWNER_SET;
	}

	public void setOWNER_SET(String oWNERSET) {
		if(oWNERSET==null) OWNER_SET="";
		else OWNER_SET = oWNERSET;
	}

	public String getTAX_SET() {
		return TAX_SET;
	}

	public void setTAX_SET(String tAXSET) {
		if(tAXSET==null)  TAX_SET="";
		else TAX_SET = tAXSET;
	}

	public String getMUL_FROMDATE() {
		return MUL_FROMDATE;
	}

	public void setMUL_FROMDATE(String mULFROMDATE) {
		if(mULFROMDATE==null)  MUL_FROMDATE="";
		else MUL_FROMDATE = mULFROMDATE;
	}

	public String getMUL_TODATE() {
		return MUL_TODATE;
	}

	public void setMUL_TODATE(String mULTODATE) {
		if(mULTODATE==null) MUL_TODATE="";
		else MUL_TODATE = mULTODATE;
	}

	public String getHJ_CD() {
		return HJ_CD;
	}

	public void setHJ_CD(String hJCD) {
		if(hJCD==null) HJ_CD="";
		else HJ_CD = hJCD;
	}

	public String getDISUSE_DATE() {
		return DISUSE_DATE;
	}

	public void setDISUSE_DATE(String dISUSEDATE) {
		if(dISUSEDATE==null) DISUSE_DATE="";
		else DISUSE_DATE = dISUSEDATE;
	}

	public String getDISUSE_REASON() {
		return DISUSE_REASON;
	}

	public void setDISUSE_REASON(String dISUSEREASON) {
		if(dISUSEREASON==null)  DISUSE_REASON="";
		else DISUSE_REASON = dISUSEREASON;
	}

	public String getDISUSE_MANAGER() {
		return DISUSE_MANAGER;
	}

	public void setDISUSE_MANAGER(String dISUSEMANAGER) {
		if(dISUSEMANAGER==null) DISUSE_MANAGER="";
		else DISUSE_MANAGER = dISUSEMANAGER;
	}

	public String getOLD_SECTION() {
		return OLD_SECTION;
	}

	public void setOLD_SECTION(String oLDSECTION) {
		if(oLDSECTION==null)  OLD_SECTION="";
		else OLD_SECTION = oLDSECTION;
	}

	public String getREDUCTION_RATE() {
		return REDUCTION_RATE;
	}

	public void setREDUCTION_RATE(String rEDUCTIONRATE) {
		if(rEDUCTIONRATE==null)  REDUCTION_RATE="0";
		else REDUCTION_RATE = rEDUCTIONRATE;
	}

	public String getREDUCTION_REASON() {
		return REDUCTION_REASON;
	}

	public void setREDUCTION_REASON(String rEDUCTIONREASON) {
		if(rEDUCTIONREASON==null)  REDUCTION_REASON="";
		else REDUCTION_REASON = rEDUCTIONREASON;
	}

	public String getPICKUP_DATE() {
		return PICKUP_DATE;
	}

	public void setPICKUP_DATE(String pICKUPDATE) {
		if(pICKUPDATE==null) PICKUP_DATE="";
		else PICKUP_DATE = pICKUPDATE;
	}

	public String getSHOP_IMG2() {
		return SHOP_IMG2;
	}

	public void setSHOP_IMG2(String sHOPIMG2) {
		if(sHOPIMG2==null) SHOP_IMG2="";
		SHOP_IMG2 = sHOPIMG2;
	}

	public String getRETURN_DATE() {
		return RETURN_DATE;
	}

	public void setRETURN_DATE(String rETURNDATE) {
		if(rETURNDATE==null) RETURN_DATE="";
		else RETURN_DATE = rETURNDATE;
	}

	public String getRETURN_YN() {
		return RETURN_YN;
	}

	public void setRETURN_YN(String rETURNYN) {
		if(rETURNYN==null)  RETURN_YN="";
		else RETURN_YN = rETURNYN;
	}

	public String getFT_ETC() {
		return FT_ETC;
	}

	public void setFT_ETC(String fTETC) {
		if(fTETC==null) FT_ETC="";
		else FT_ETC = fTETC;
	}

	public String getPICKUP_YN() {
		return PICKUP_YN;
	}

	public void setPICKUP_YN(String pICKUPYN) {
		if(pICKUPYN==null) PICKUP_YN="";
		else PICKUP_YN = pICKUPYN;
	}

	public String getMODIFY_YN() {
		return MODIFY_YN;
	}

	public void setMODIFY_YN(String mODIFYYN) {
		if(mODIFYYN==null) MODIFY_YN="";
		else MODIFY_YN = mODIFYYN;
	}

	public String getSF_VALUE() {
		return SF_VALUE;
	}

	public void setSF_VALUE(String sFVALUE) {
		if(sFVALUE==null) SF_VALUE="0";
		else SF_VALUE = sFVALUE;
	}

	public String getHISTORY() {
		return HISTORY;
	}

	public void setHISTORY(String hISTORY) {
		if(hISTORY==null) HISTORY="";
		else HISTORY = hISTORY;
	}

	public String getGAPAN_NO() {
		return GAPAN_NO;
	}

	public void setGAPAN_NO(String gAPANNO) {
		if(gAPANNO==null) GAPAN_NO="";
		else GAPAN_NO = gAPANNO;
	}
	
	
	
}