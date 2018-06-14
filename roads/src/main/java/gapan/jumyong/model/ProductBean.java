package main.java.gapan.jumyong.model;


import org.springframework.web.multipart.MultipartFile;

import main.java.common.model.RoadsBaseBean;

public class ProductBean extends RoadsBaseBean {
	private String ADMIN_NO 	= "";
	private String YEAR 	= "";
	private String PRICE 	= "";
	private String FROMDATE 	= "";
	private String TODATE 	= "";
	private String FORM 	= "";
	private String FORM_ADJUST 	= "";
	private String SEQ 	= "";
	private String UP_DATE 	= "";
	private String AREA_BEFORE 	= "";
	private String AREA_AFTER 	= "";
	private String RATE 	= "";
	private String LAST_AREA_AFTER 	= "";
	private String SUM_LASTYEAR 	= "";
	private String SUM_YEAR 	= "";
	private String SUM_ADJUST 	= "";
	private String ADJUSTMENT 	= "";
	private String PERIOD 	= "";
	private String LICENSE_TAX 	= "";
	private String REDUCTION_RATE 	= "";
	private String	REDUCTION_REASON 	= "";
	private String SURCHARGE_RATE 	= "";
	private String USE_SECTION 	= "";
	private String LASTFROMDATE 	= "";
	private String LASTTODATE 	= "";
	private String FIRST_SEQ 	= "";
	private String USE_SECTIONNAME 	= "";
	private String CAL_YEAR 	= "";
	private String CAL_SUM_SEQ 	= "";
	private String SUM 	= "";
	private String AREA	 	= "";
	private String PREV_SEQ  	= "";
	private String CAL_STATUS 	= "";
	private String TAX_SEQ 	= "";
	private String TAX_YNNAME 	= "";
	private String CAL_YN 	= "";
	private String TAX_SET 	= "";
	private String TAX_SET_NAME 	= "";
	
	
	// 2009.8.14 추가 start
	private String GAPAN_NO 	= "";
	private String TAX_DATE		= "";
	private String INDATE 		= "";
	private String OVERDATE 	= "";
	private String OVERTAX 		= "";
	private String FORM1		= "";
	private String FORM2		= "";
	private String TAX_YM		= "";
	private String MAX_TAX_NO	= "";
	private String SIGU_CD     	= "";
	private String BJ_CD       	= "";
	private String TAX_NO      	= "";
	private String DEPT_CD     	= "";
	private String TAX_CD      	= "";
	private String TAX_GUBUN   	= "";
	private String OBJ_SET     	= "";
	private String TAXPAYER_ID 	= "";
	private String TAXPAYER_SET	= "";
	private String OCR_SIGU_CD 	= "";
	private String OCR_BUSEO_CD	= "";
	private String TSEQ        	= "";
	private String LIVE      	= "";
	private String BONSE	 	= "";
	private String VAT	     	= "";
	private String INTAX     	= "";
	private String ADD_SET   	= "";
	private String ADD_YN    	= "";
	private String NOTES     	= "";
	private String LIMIT_SUM 	= "";
	private String LIMIT_CNT 	= "";
	private String RATE_CAUSE	= "";
	private String SISE      	= "";
	private String GIGUM     	= "";
	private String GUKSE     	= "";
	private String GUSE      	= "";
	private String SUBUSEO_CD	= "";
	private String TAX_YN		= "";
	// 2009.8.14 추가 end

	
	
	private String VIO_DEG				= "";         
	private String VIO_DATE				= "";
	private String VIO_ACTDATE			= "";
	private String VIO_CONTENT			= "";
	private String VIO_ACTCONTENT		= "";
	private String VIO_AREA				= "";
	private String VIO_POINTS			= "";
	private String VIO_ACCPOINTS		= "";
	private String VIO_ACTCD			= "";
	private String VIO_CD				= "";
	private MultipartFile VIO_IMG1;
	private MultipartFile VIO_IMG2;
	private MultipartFile VIO_ACTIMG1;
	private MultipartFile VIO_ACTIMG2;
	private String VIO_DEPT				= "";
	
	private String VIO_IMG1_NAME		= "";
	private String VIO_IMG2_NAME		= "";
	private String VIO_ACTIMG1_NAME		= "";
	private String VIO_ACTIMG2_NAME		= "";
	
	
	private String VIO_NAME 		= "";
	private String VIO_ACTNAME 		= "";
	
	
	
	private String NAME				= "";
	
	private String WORK_NM 		= "";	
	private String SAYU 		= "";
	private String GU_CODE 		= "";
	private String WRITEDATE	= "";
	private String GUBUN	= "";	
	private String GUNGE	= "";
	private String WORK_ID	= "";
	
	private String SECTION = "";
	private String OLD_TAX_GUBUN = "";
	private String PLACE_A		= "";			//점용면적
	private String GP_TYP		= "";	//점용종류
	
	private String OWNER_NAME = "";
	private String ADDR = "";
	
	private String BUGWA_YN = "";
	private String CAL_MODE = "";
	private String gasanRate = "";
	private String SF_VALUE = "";
	
	private String VIO_SEL1	= "";
	private String VIO_SEL2	= "";
	private String VIO_SEL3	= "";
	private String VIO_SEL4	= "";
	private String VIO_SEL5	= "";
	private String VIO_SEL6	= "";
	private String VIO_SEL7	= "";
	
	private String VIO_ACTSEL1	= "";
	private String VIO_ACTSEL2	= "";
	private String VIO_ACTSEL3	= "";
	private String VIO_ACTSEL4	= "";
	private String VIO_ACTSEL5	= "";
	
	public String getVIO_SEL1() {
		return VIO_SEL1;
	}

	public void setVIO_SEL1(String vIO_SEL1) {
		VIO_SEL1 = vIO_SEL1;
	}

	public String getVIO_SEL2() {
		return VIO_SEL2;
	}

	public void setVIO_SEL2(String vIO_SEL2) {
		VIO_SEL2 = vIO_SEL2;
	}

	public String getVIO_SEL3() {
		return VIO_SEL3;
	}

	public void setVIO_SEL3(String vIO_SEL3) {
		VIO_SEL3 = vIO_SEL3;
	}

	public String getVIO_SEL4() {
		return VIO_SEL4;
	}

	public void setVIO_SEL4(String vIO_SEL4) {
		VIO_SEL4 = vIO_SEL4;
	}

	public String getVIO_SEL5() {
		return VIO_SEL5;
	}

	public void setVIO_SEL5(String vIO_SEL5) {
		VIO_SEL5 = vIO_SEL5;
	}

	public String getVIO_SEL6() {
		return VIO_SEL6;
	}

	public void setVIO_SEL6(String vIO_SEL6) {
		VIO_SEL6 = vIO_SEL6;
	}

	public String getVIO_SEL7() {
		return VIO_SEL7;
	}

	public void setVIO_SEL7(String vIO_SEL7) {
		VIO_SEL7 = vIO_SEL7;
	}

	public String getVIO_ACTSEL1() {
		return VIO_ACTSEL1;
	}

	public void setVIO_ACTSEL1(String vIO_ACTSEL1) {
		VIO_ACTSEL1 = vIO_ACTSEL1;
	}

	public String getVIO_ACTSEL2() {
		return VIO_ACTSEL2;
	}

	public void setVIO_ACTSEL2(String vIO_ACTSEL2) {
		VIO_ACTSEL2 = vIO_ACTSEL2;
	}

	public String getVIO_ACTSEL3() {
		return VIO_ACTSEL3;
	}

	public void setVIO_ACTSEL3(String vIO_ACTSEL3) {
		VIO_ACTSEL3 = vIO_ACTSEL3;
	}

	public String getVIO_ACTSEL4() {
		return VIO_ACTSEL4;
	}

	public void setVIO_ACTSEL4(String vIO_ACTSEL4) {
		VIO_ACTSEL4 = vIO_ACTSEL4;
	}

	public String getVIO_ACTSEL5() {
		return VIO_ACTSEL5;
	}

	public void setVIO_ACTSEL5(String vIO_ACTSEL5) {
		VIO_ACTSEL5 = vIO_ACTSEL5;
	}

	public String getVIO_NAME() {
		return VIO_NAME;
	}

	public void setVIO_NAME(String vIONAME) {
		VIO_NAME = vIONAME;
	}

	public String getVIO_ACTNAME() {
		return VIO_ACTNAME;
	}

	public void setVIO_ACTNAME(String vIOACTNAME) {
		VIO_ACTNAME = vIOACTNAME;
	}

	public String getADMIN_NO() {
		return ADMIN_NO;
	}

	public void setADMIN_NO(String aDMINNO) {
		ADMIN_NO = aDMINNO;
	}

	public String getYEAR() {
		return YEAR;
	}

	public void setYEAR(String yEAR) {
		YEAR = yEAR;
	}

	public String getPRICE() {
		return PRICE;
	}

	public void setPRICE(String pRICE) {
		PRICE = pRICE;
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

	public String getFORM() {
		return FORM;
	}

	public void setFORM(String fORM) {
		FORM = fORM;
	}

	public String getFORM_ADJUST() {
		return FORM_ADJUST;
	}

	public void setFORM_ADJUST(String fORMADJUST) {
		FORM_ADJUST = fORMADJUST;
	}

	public String getSEQ() {
		return SEQ;
	}

	public void setSEQ(String sEQ) {
		SEQ = sEQ;
	}

	public String getUP_DATE() {
		return UP_DATE;
	}

	public void setUP_DATE(String uPDATE) {
		UP_DATE = uPDATE;
	}

	public String getAREA_BEFORE() {
		return AREA_BEFORE;
	}

	public void setAREA_BEFORE(String aREABEFORE) {
		AREA_BEFORE = aREABEFORE;
	}

	public String getAREA_AFTER() {
		return AREA_AFTER;
	}

	public void setAREA_AFTER(String aREAAFTER) {
		AREA_AFTER = aREAAFTER;
	}

	public String getRATE() {
		return RATE;
	}

	public void setRATE(String rATE) {
		RATE = rATE;
	}

	public String getLAST_AREA_AFTER() {
		return LAST_AREA_AFTER;
	}

	public void setLAST_AREA_AFTER(String lASTAREAAFTER) {
		LAST_AREA_AFTER = lASTAREAAFTER;
	}

	public String getSUM_LASTYEAR() {
		return SUM_LASTYEAR;
	}

	public void setSUM_LASTYEAR(String sUMLASTYEAR) {
		SUM_LASTYEAR = sUMLASTYEAR;
	}

	public String getSUM_YEAR() {
		return SUM_YEAR;
	}

	public void setSUM_YEAR(String sUMYEAR) {
		SUM_YEAR = sUMYEAR;
	}

	public String getSUM_ADJUST() {
		return SUM_ADJUST;
	}

	public void setSUM_ADJUST(String sUMADJUST) {
		SUM_ADJUST = sUMADJUST;
	}

	public String getADJUSTMENT() {
		return ADJUSTMENT;
	}

	public void setADJUSTMENT(String aDJUSTMENT) {
		ADJUSTMENT = aDJUSTMENT;
	}

	public String getPERIOD() {
		return PERIOD;
	}

	public void setPERIOD(String pERIOD) {
		PERIOD = pERIOD;
	}

	public String getLICENSE_TAX() {
		return LICENSE_TAX;
	}

	public void setLICENSE_TAX(String lICENSETAX) {
		LICENSE_TAX = lICENSETAX;
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

	public String getSURCHARGE_RATE() {
		return SURCHARGE_RATE;
	}

	public void setSURCHARGE_RATE(String sURCHARGERATE) {
		SURCHARGE_RATE = sURCHARGERATE;
	}

	public String getUSE_SECTION() {
		return USE_SECTION;
	}

	public void setUSE_SECTION(String uSESECTION) {
		USE_SECTION = uSESECTION;
	}

	public String getLASTFROMDATE() {
		return LASTFROMDATE;
	}

	public void setLASTFROMDATE(String lASTFROMDATE) {
		LASTFROMDATE = lASTFROMDATE;
	}

	public String getLASTTODATE() {
		return LASTTODATE;
	}

	public void setLASTTODATE(String lASTTODATE) {
		LASTTODATE = lASTTODATE;
	}

	public String getFIRST_SEQ() {
		return FIRST_SEQ;
	}

	public void setFIRST_SEQ(String fIRSTSEQ) {
		FIRST_SEQ = fIRSTSEQ;
	}

	public String getUSE_SECTIONNAME() {
		return USE_SECTIONNAME;
	}

	public void setUSE_SECTIONNAME(String uSESECTIONNAME) {
		USE_SECTIONNAME = uSESECTIONNAME;
	}

	public String getCAL_YEAR() {
		return CAL_YEAR;
	}

	public void setCAL_YEAR(String cALYEAR) {
		CAL_YEAR = cALYEAR;
	}

	public String getCAL_SUM_SEQ() {
		return CAL_SUM_SEQ;
	}

	public void setCAL_SUM_SEQ(String cALSUMSEQ) {
		CAL_SUM_SEQ = cALSUMSEQ;
	}

	public String getSUM() {
		return SUM;
	}

	public void setSUM(String sUM) {
		SUM = sUM;
	}

	public String getAREA() {
		return AREA;
	}

	public void setAREA(String aREA) {
		AREA = aREA;
	}

	public String getPREV_SEQ() {
		return PREV_SEQ;
	}

	public void setPREV_SEQ(String pREVSEQ) {
		PREV_SEQ = pREVSEQ;
	}

	public String getCAL_STATUS() {
		return CAL_STATUS;
	}

	public void setCAL_STATUS(String cALSTATUS) {
		CAL_STATUS = cALSTATUS;
	}

	public String getTAX_SEQ() {
		return TAX_SEQ;
	}

	public void setTAX_SEQ(String tAXSEQ) {
		TAX_SEQ = tAXSEQ;
	}

	public String getTAX_YNNAME() {
		return TAX_YNNAME;
	}

	public void setTAX_YNNAME(String tAXYNNAME) {
		TAX_YNNAME = tAXYNNAME;
	}

	public String getCAL_YN() {
		return CAL_YN;
	}

	public void setCAL_YN(String cALYN) {
		CAL_YN = cALYN;
	}

	public String getTAX_SET() {
		return TAX_SET;
	}

	public void setTAX_SET(String tAXSET) {
		TAX_SET = tAXSET;
	}

	public String getTAX_SET_NAME() {
		return TAX_SET_NAME;
	}

	public void setTAX_SET_NAME(String tAXSETNAME) {
		TAX_SET_NAME = tAXSETNAME;
	}

	public String getGAPAN_NO() {
		return GAPAN_NO;
	}

	public void setGAPAN_NO(String gAPANNO) {
		GAPAN_NO = gAPANNO;
	}

	public String getTAX_DATE() {
		return TAX_DATE;
	}

	public void setTAX_DATE(String tAXDATE) {
		TAX_DATE = tAXDATE;
	}

	public String getINDATE() {
		return INDATE;
	}

	public void setINDATE(String iNDATE) {
		INDATE = iNDATE;
	}

	public String getOVERDATE() {
		return OVERDATE;
	}

	public void setOVERDATE(String oVERDATE) {
		OVERDATE = oVERDATE;
	}

	public String getOVERTAX() {
		return OVERTAX;
	}

	public void setOVERTAX(String oVERTAX) {
		OVERTAX = oVERTAX;
	}

	public String getFORM1() {
		return FORM1;
	}

	public void setFORM1(String fORM1) {
		FORM1 = fORM1;
	}

	public String getFORM2() {
		return FORM2;
	}

	public void setFORM2(String fORM2) {
		FORM2 = fORM2;
	}

	public String getTAX_YM() {
		return TAX_YM;
	}

	public void setTAX_YM(String tAXYM) {
		TAX_YM = tAXYM;
	}

	public String getMAX_TAX_NO() {
		return MAX_TAX_NO;
	}

	public void setMAX_TAX_NO(String mAXTAXNO) {
		MAX_TAX_NO = mAXTAXNO;
	}

	public String getSIGU_CD() {
		return SIGU_CD;
	}

	public void setSIGU_CD(String sIGUCD) {
		SIGU_CD = sIGUCD;
	}

	public String getBJ_CD() {
		return BJ_CD;
	}

	public void setBJ_CD(String bJCD) {
		BJ_CD = bJCD;
	}

	public String getTAX_NO() {
		return TAX_NO;
	}

	public void setTAX_NO(String tAXNO) {
		TAX_NO = tAXNO;
	}

	public String getDEPT_CD() {
		return DEPT_CD;
	}

	public void setDEPT_CD(String dEPTCD) {
		DEPT_CD = dEPTCD;
	}

	public String getTAX_CD() {
		return TAX_CD;
	}

	public void setTAX_CD(String tAXCD) {
		TAX_CD = tAXCD;
	}

	public String getTAX_GUBUN() {
		return TAX_GUBUN;
	}

	public void setTAX_GUBUN(String tAXGUBUN) {
		TAX_GUBUN = tAXGUBUN;
	}

	public String getOBJ_SET() {
		return OBJ_SET;
	}

	public void setOBJ_SET(String oBJSET) {
		OBJ_SET = oBJSET;
	}

	public String getTAXPAYER_ID() {
		return TAXPAYER_ID;
	}

	public void setTAXPAYER_ID(String tAXPAYERID) {
		TAXPAYER_ID = tAXPAYERID;
	}

	public String getTAXPAYER_SET() {
		return TAXPAYER_SET;
	}

	public void setTAXPAYER_SET(String tAXPAYERSET) {
		TAXPAYER_SET = tAXPAYERSET;
	}

	public String getOCR_SIGU_CD() {
		return OCR_SIGU_CD;
	}

	public void setOCR_SIGU_CD(String oCRSIGUCD) {
		OCR_SIGU_CD = oCRSIGUCD;
	}

	public String getOCR_BUSEO_CD() {
		return OCR_BUSEO_CD;
	}

	public void setOCR_BUSEO_CD(String oCRBUSEOCD) {
		OCR_BUSEO_CD = oCRBUSEOCD;
	}

	public String getTSEQ() {
		return TSEQ;
	}

	public void setTSEQ(String tSEQ) {
		TSEQ = tSEQ;
	}

	public String getLIVE() {
		return LIVE;
	}

	public void setLIVE(String lIVE) {
		LIVE = lIVE;
	}

	public String getBONSE() {
		return BONSE;
	}

	public void setBONSE(String bONSE) {
		BONSE = bONSE;
	}

	public String getVAT() {
		return VAT;
	}

	public void setVAT(String vAT) {
		VAT = vAT;
	}

	public String getINTAX() {
		return INTAX;
	}

	public void setINTAX(String iNTAX) {
		INTAX = iNTAX;
	}

	public String getADD_SET() {
		return ADD_SET;
	}

	public void setADD_SET(String aDDSET) {
		ADD_SET = aDDSET;
	}

	public String getADD_YN() {
		return ADD_YN;
	}

	public void setADD_YN(String aDDYN) {
		ADD_YN = aDDYN;
	}

	public String getNOTES() {
		return NOTES;
	}

	public void setNOTES(String nOTES) {
		NOTES = nOTES;
	}

	public String getLIMIT_SUM() {
		return LIMIT_SUM;
	}

	public void setLIMIT_SUM(String lIMITSUM) {
		LIMIT_SUM = lIMITSUM;
	}

	public String getLIMIT_CNT() {
		return LIMIT_CNT;
	}

	public void setLIMIT_CNT(String lIMITCNT) {
		LIMIT_CNT = lIMITCNT;
	}

	public String getRATE_CAUSE() {
		return RATE_CAUSE;
	}

	public void setRATE_CAUSE(String rATECAUSE) {
		RATE_CAUSE = rATECAUSE;
	}

	public String getSISE() {
		return SISE;
	}

	public void setSISE(String sISE) {
		SISE = sISE;
	}

	public String getGIGUM() {
		return GIGUM;
	}

	public void setGIGUM(String gIGUM) {
		GIGUM = gIGUM;
	}

	public String getGUKSE() {
		return GUKSE;
	}

	public void setGUKSE(String gUKSE) {
		GUKSE = gUKSE;
	}

	public String getGUSE() {
		return GUSE;
	}

	public void setGUSE(String gUSE) {
		GUSE = gUSE;
	}

	public String getSUBUSEO_CD() {
		return SUBUSEO_CD;
	}

	public void setSUBUSEO_CD(String sUBUSEOCD) {
		SUBUSEO_CD = sUBUSEOCD;
	}

	public String getTAX_YN() {
		return TAX_YN;
	}

	public void setTAX_YN(String tAXYN) {
		TAX_YN = tAXYN;
	}

	public String getVIO_DEG() {
		return VIO_DEG;
	}

	public void setVIO_DEG(String vIODEG) {
		VIO_DEG = vIODEG;
	}

	public String getVIO_DATE() {
		return VIO_DATE;
	}

	public void setVIO_DATE(String vIODATE) {
		VIO_DATE = vIODATE;
	}

	public String getVIO_ACTDATE() {
		return VIO_ACTDATE;
	}

	public void setVIO_ACTDATE(String vIOACTDATE) {
		VIO_ACTDATE = vIOACTDATE;
	}

	public String getVIO_CONTENT() {
		return VIO_CONTENT;
	}

	public void setVIO_CONTENT(String vIOCONTENT) {
		VIO_CONTENT = vIOCONTENT;
	}

	public String getVIO_ACTCONTENT() {
		return VIO_ACTCONTENT;
	}

	public void setVIO_ACTCONTENT(String vIOACTCONTENT) {
		VIO_ACTCONTENT = vIOACTCONTENT;
	}

	public String getVIO_AREA() {
		return VIO_AREA;
	}

	public void setVIO_AREA(String vIOAREA) {
		VIO_AREA = vIOAREA;
	}

	public String getVIO_POINTS() {
		return VIO_POINTS;
	}

	public void setVIO_POINTS(String vIOPOINTS) {
		VIO_POINTS = vIOPOINTS;
	}

	public String getVIO_ACCPOINTS() {
		return VIO_ACCPOINTS;
	}

	public void setVIO_ACCPOINTS(String vIOACCPOINTS) {
		VIO_ACCPOINTS = vIOACCPOINTS;
	}

	public String getVIO_ACTCD() {
		return VIO_ACTCD;
	}

	public void setVIO_ACTCD(String vIOACTCD) {
		VIO_ACTCD = vIOACTCD;
	}

	public String getVIO_CD() {
		return VIO_CD;
	}

	public void setVIO_CD(String vIOCD) {
		VIO_CD = vIOCD;
	}
	
	
	public MultipartFile getVIO_IMG1() {
		return VIO_IMG1;
	}

	public void setVIO_IMG1(MultipartFile vIOIMG1) {
		VIO_IMG1 = vIOIMG1;
	}

	public MultipartFile getVIO_IMG2() {
		return VIO_IMG2;
	}

	public void setVIO_IMG2(MultipartFile vIOIMG2) {
		VIO_IMG2 = vIOIMG2;
	}

	public MultipartFile getVIO_ACTIMG1() {
		return VIO_ACTIMG1;
	}

	public void setVIO_ACTIMG1(MultipartFile vIOACTIMG1) {
		VIO_ACTIMG1 = vIOACTIMG1;
	}

	public MultipartFile getVIO_ACTIMG2() {
		return VIO_ACTIMG2;
	}

	public void setVIO_ACTIMG2(MultipartFile vIOACTIMG2) {
		VIO_ACTIMG2 = vIOACTIMG2;
	}

	public String getVIO_DEPT() {
		return VIO_DEPT;
	}

	public void setVIO_DEPT(String vIODEPT) {
		VIO_DEPT = vIODEPT;
	}

	public String getVIO_IMG1_NAME() {
		return VIO_IMG1_NAME;
	}

	public void setVIO_IMG1_NAME(String vIOIMG1NAME) {
		VIO_IMG1_NAME = vIOIMG1NAME;
	}

	public String getVIO_IMG2_NAME() {
		return VIO_IMG2_NAME;
	}

	public void setVIO_IMG2_NAME(String vIOIMG2NAME) {
		VIO_IMG2_NAME = vIOIMG2NAME;
	}

	public String getVIO_ACTIMG1_NAME() {
		return VIO_ACTIMG1_NAME;
	}

	public void setVIO_ACTIMG1_NAME(String vIOACTIMG1NAME) {
		VIO_ACTIMG1_NAME = vIOACTIMG1NAME;
	}

	public String getVIO_ACTIMG2_NAME() {
		return VIO_ACTIMG2_NAME;
	}

	public void setVIO_ACTIMG2_NAME(String vIOACTIMG2NAME) {
		VIO_ACTIMG2_NAME = vIOACTIMG2NAME;
	}

	public String getNAME() {
		return NAME;
	}

	public void setNAME(String nAME) {
		NAME = nAME;
	}

	public String getWORK_NM() {
		return WORK_NM;
	}

	public void setWORK_NM(String wORKNM) {
		WORK_NM = wORKNM;
	}

	public String getSAYU() {
		return SAYU;
	}

	public void setSAYU(String sAYU) {
		SAYU = sAYU;
	}

	public String getGU_CODE() {
		return GU_CODE;
	}

	public void setGU_CODE(String gUCODE) {
		GU_CODE = gUCODE;
	}

	public String getWRITEDATE() {
		return WRITEDATE;
	}

	public void setWRITEDATE(String wRITEDATE) {
		WRITEDATE = wRITEDATE;
	}

	public String getGUBUN() {
		return GUBUN;
	}

	public void setGUBUN(String gUBUN) {
		GUBUN = gUBUN;
	}

	public String getGUNGE() {
		return GUNGE;
	}

	public void setGUNGE(String gUNGE) {
		GUNGE = gUNGE;
	}

	public String getWORK_ID() {
		return WORK_ID;
	}

	public void setWORK_ID(String wORKID) {
		WORK_ID = wORKID;
	}

	public String getSECTION() {
		return SECTION;
	}

	public void setSECTION(String sECTION) {
		SECTION = sECTION;
	}

	public String getOLD_TAX_GUBUN() {
		return OLD_TAX_GUBUN;
	}

	public void setOLD_TAX_GUBUN(String oLDTAXGUBUN) {
		OLD_TAX_GUBUN = oLDTAXGUBUN;
	}

	public String getPLACE_A() {
		return PLACE_A;
	}

	public void setPLACE_A(String pLACEA) {
		PLACE_A = pLACEA;
	}

	public String getGP_TYP() {
		return GP_TYP;
	}

	public void setGP_TYP(String gPTYP) {
		GP_TYP = gPTYP;
	}

	public String getOWNER_NAME() {
		return OWNER_NAME;
	}

	public void setOWNER_NAME(String oWNERNAME) {
		OWNER_NAME = oWNERNAME;
	}

	public String getADDR() {
		return ADDR;
	}

	public void setADDR(String aDDR) {
		ADDR = aDDR;
	}

	public String getBUGWA_YN() {
		return BUGWA_YN;
	}

	public void setBUGWA_YN(String bUGWAYN) {
		BUGWA_YN = bUGWAYN;
	}

	public String getCAL_MODE() {
		return CAL_MODE;
	}

	public void setCAL_MODE(String cALMODE) {
		CAL_MODE = cALMODE;
	}

	public String getGasanRate() {
		return gasanRate;
	}

	public void setGasanRate(String gasanRate) {
		this.gasanRate = gasanRate;
	}

	public String getSF_VALUE() {
		return SF_VALUE;
	}

	public void setSF_VALUE(String sFVALUE) {
		SF_VALUE = sFVALUE;
	}
	
	
	
	}
