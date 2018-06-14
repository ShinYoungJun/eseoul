package main.java.schedule.model;

import main.java.common.model.RoadsBaseBean;

public class LogBean extends RoadsBaseBean {
	
	private String  GIJUN_DATE = "";			//추출기준일
	private String  SYS_GUBUN = "";				//시스템구분
	private String  DATA_GUBUN = "";			//데이터삭제유무
	private String  SIGU_CD = "";				//시구코드
	private String  SEMOK_CD = "";				//세목코드
	private String  TAX_YM = "";				//과세년월
	private String  TAX_GUBUN = "";			 	//과세구분
	private String  BUSEO_CD = ""; 				//부서코드
	private String  TAX_NO = "";  				//과세번호
	private String  LAST_WORK_ID = ""; 			//사용자 주민번호
	private String  OCR_SIGU_CD = "";  			//OCR시구코드
	private String  OCR_BUSEO_CD = "";   		//OCR부서코드
	private String  LAST_WORK_DATE = "";   		//최종작업날짜
	private String  SIDO_CD = "";   			//시도코드
	private String  NAP_ID = "";   				//납세자ID
	private String  NAP_NM = "";   				//납세자명
	private String  NAP_GUBUN = "";   			//납세자구분
	private String  SU_BUSEO_CD = "";   		//수납부서코드
	private String  TAX_YMD = "";   			//과세일자
	private String  NAPGI_YMD = "";   			//납기일자
	private String  NAPGI_AFT_YMD = "";			//납기후일자
	private String  NAPBU_YMD = "";   			//납부일자
	private String  SEND_YMD = "";   			//발송일자
	private String  TAX_AMT = "";   			//과세금액
	private String  SISE = "";   				//시세
	private String  SISE_IJA = "";   			//시세이자
	private String  GUSE = "";   				//구세
	private String  GUSE_IJA = "";   			//구세이자
	private String  GUKSE = "";   				//국세
	private String  GUKSE_IJA = "";   			//국세이자
	private String  GIGUM = "";   				//기금
	private String  GIGUM_IJA = "";   			//기금이자
	private String  VAT_AMT = "";   			//부가가치세
	private String  NAP_ZIP_CD = "";   			//납세자우편번호
	private String  NAP_ZIP_ADDR = "";   		//납세자우편번호주소
	private String  NAP_DTL_ADDR = "";   		//납세자상세주소
	private String  RESIDE_STATUS = "";   		//거주상태
	private String  MUL_GUBUN = "";   			//물건구분코드
	private String  MUL_NM = "";   				//물건명
	private String  BOOK_NO = "";   			//대장번호
	private String  HANGMOK1 = "";   			//항목1
	private String  HANGMOK2 = "";   			//항목2
	private String  HANGMOK3 = "";   			//항목3
	private String  HANGMOK4 = "";   			//항목4
	private String  HANGMOK5 = "";   			//항목5
	private String  HANGMOK6 = "";   			//항목6
	private String  GASAN_RATE_GUBUN = "";   	//가산구분
	private String  GASAN_AMT_SKIP_GUBUN = "";  //가산금면제유무
	private String  BIGO = "";   				//비고
	private String  SU_NAPBU_YMD = "";   		//납부일자
	private String  SU_NAPBU_GUBUN = "";   		//수납납부구분
	private String  OCR_GUBUN = "";   			//OCR구분
	private String  SU_PRC_GUBUN = "";   		//수납처리구분
	private String  SU_SISE = "";   			//시세
	private String  SU_SISE_IJA = "";  			//시세이자
	private String  SU_GUSE = "";   			//구세
	private String  SU_GUSE_IJA = "";   		//구세이자
	private String  SU_GUKSE = "";   			//국세
	private String  SU_GUKSE_IJA = "";   		//국세이자
	private String  SU_GIGUM = "";   			//기금
	private String  SU_GIGUM_IJA = "";   		//기금이자
	private String  SU_SISE_GASAN_SUM = "";   	//시세가산금합
	private String  SU_GUSE_GASAN_SUM = "";   	//구세가산금합
	private String  SU_GUKSE_GASAN_SUM = "";   	//국세가산금합
	private String  SU_GIGUM_GASAN_SUM = "";   	//기금가산금합
	private String  SU_VAT_AMT = "";   			//부가가치세
	private String  SU_GUBUN = "";   			//수납구분
	private String  SU_CNT = "";   				//수납건수
	private String  GWAO_SISE = "";   			//시세
	private String  GWAO_SISE_IJA = "";   		//시세이자
	private String  GWAO_GUSE = "";   			//구세
	private String  GWAO_GUSE_IJA = "";   		//구세이자
	private String  GWAO_GUKSE = "";   			//국세
	private String  GWAO_GUKSE_IJA = "";   		//국세이자
	private String  GWAO_GIGUM = "";   			//기금
	private String  GWAO_GIGUM_IJA = "";   		//기금이자
	private String  GWAO_SISE_GASAN_SUM = "";   //시세가산금합
	private String  GWAO_GUSE_GASAN_SUM = "";   //구세가산금합
	private String  GWAO_GUKSE_GASAN_SUM = "";  //국세가산금합
	private String  GWAO_GIGUM_GASAN_SUM = "";  //기금가산금합
	private String  GWAO_VAT_AMT = "";   		//부가가치세
	private String  GWAO_SAYU_CD = "";   		//과오납사유코드
	private String  GWAO_SAYU_NM = "";   		//과오납사유
	private String  GWAO_YMD = "";   			//과오납일자
	private String  GWAO_CNT = "";   			//과오납건수
	public String getGIJUN_DATE() {
		return GIJUN_DATE;
	}
	public void setGIJUN_DATE(String gIJUN_DATE) {
		GIJUN_DATE = gIJUN_DATE;
	}
	public String getSYS_GUBUN() {
		return SYS_GUBUN;
	}
	public void setSYS_GUBUN(String sYS_GUBUN) {
		SYS_GUBUN = sYS_GUBUN;
	}
	public String getDATA_GUBUN() {
		return DATA_GUBUN;
	}
	public void setDATA_GUBUN(String dATA_GUBUN) {
		DATA_GUBUN = dATA_GUBUN;
	}
	public String getSIGU_CD() {
		return SIGU_CD;
	}
	public void setSIGU_CD(String sIGU_CD) {
		SIGU_CD = sIGU_CD;
	}
	public String getSEMOK_CD() {
		return SEMOK_CD;
	}
	public void setSEMOK_CD(String sEMOK_CD) {
		SEMOK_CD = sEMOK_CD;
	}
	public String getTAX_YM() {
		return TAX_YM;
	}
	public void setTAX_YM(String tAX_YM) {
		TAX_YM = tAX_YM;
	}
	public String getTAX_GUBUN() {
		return TAX_GUBUN;
	}
	public void setTAX_GUBUN(String tAX_GUBUN) {
		TAX_GUBUN = tAX_GUBUN;
	}
	public String getBUSEO_CD() {
		return BUSEO_CD;
	}
	public void setBUSEO_CD(String bUSEO_CD) {
		BUSEO_CD = bUSEO_CD;
	}
	public String getTAX_NO() {
		return TAX_NO;
	}
	public void setTAX_NO(String tAX_NO) {
		TAX_NO = tAX_NO;
	}
	public String getLAST_WORK_ID() {
		return LAST_WORK_ID;
	}
	public void setLAST_WORK_ID(String lAST_WORK_ID) {
		LAST_WORK_ID = lAST_WORK_ID;
	}
	public String getOCR_SIGU_CD() {
		return OCR_SIGU_CD;
	}
	public void setOCR_SIGU_CD(String oCR_SIGU_CD) {
		OCR_SIGU_CD = oCR_SIGU_CD;
	}
	public String getOCR_BUSEO_CD() {
		return OCR_BUSEO_CD;
	}
	public void setOCR_BUSEO_CD(String oCR_BUSEO_CD) {
		OCR_BUSEO_CD = oCR_BUSEO_CD;
	}
	public String getLAST_WORK_DATE() {
		return LAST_WORK_DATE;
	}
	public void setLAST_WORK_DATE(String lAST_WORK_DATE) {
		LAST_WORK_DATE = lAST_WORK_DATE;
	}
	public String getSIDO_CD() {
		return SIDO_CD;
	}
	public void setSIDO_CD(String sIDO_CD) {
		SIDO_CD = sIDO_CD;
	}
	public String getNAP_ID() {
		return NAP_ID;
	}
	public void setNAP_ID(String nAP_ID) {
		NAP_ID = nAP_ID;
	}
	public String getNAP_NM() {
		return NAP_NM;
	}
	public void setNAP_NM(String nAP_NM) {
		NAP_NM = nAP_NM;
	}
	public String getNAP_GUBUN() {
		return NAP_GUBUN;
	}
	public void setNAP_GUBUN(String nAP_GUBUN) {
		NAP_GUBUN = nAP_GUBUN;
	}
	public String getSU_BUSEO_CD() {
		return SU_BUSEO_CD;
	}
	public void setSU_BUSEO_CD(String sU_BUSEO_CD) {
		SU_BUSEO_CD = sU_BUSEO_CD;
	}
	public String getTAX_YMD() {
		return TAX_YMD;
	}
	public void setTAX_YMD(String tAX_YMD) {
		TAX_YMD = tAX_YMD;
	}
	public String getNAPGI_YMD() {
		return NAPGI_YMD;
	}
	public void setNAPGI_YMD(String nAPGI_YMD) {
		NAPGI_YMD = nAPGI_YMD;
	}
	public String getNAPGI_AFT_YMD() {
		return NAPGI_AFT_YMD;
	}
	public void setNAPGI_AFT_YMD(String nAPGI_AFT_YMD) {
		NAPGI_AFT_YMD = nAPGI_AFT_YMD;
	}
	public String getNAPBU_YMD() {
		return NAPBU_YMD;
	}
	public void setNAPBU_YMD(String nAPBU_YMD) {
		NAPBU_YMD = nAPBU_YMD;
	}
	public String getSEND_YMD() {
		return SEND_YMD;
	}
	public void setSEND_YMD(String sEND_YMD) {
		SEND_YMD = sEND_YMD;
	}
	public String getTAX_AMT() {
		return TAX_AMT;
	}
	public void setTAX_AMT(String tAX_AMT) {
		TAX_AMT = tAX_AMT;
	}
	public String getSISE() {
		return SISE;
	}
	public void setSISE(String sISE) {
		SISE = sISE;
	}
	public String getSISE_IJA() {
		return SISE_IJA;
	}
	public void setSISE_IJA(String sISE_IJA) {
		SISE_IJA = sISE_IJA;
	}
	public String getGUSE() {
		return GUSE;
	}
	public void setGUSE(String gUSE) {
		GUSE = gUSE;
	}
	public String getGUSE_IJA() {
		return GUSE_IJA;
	}
	public void setGUSE_IJA(String gUSE_IJA) {
		GUSE_IJA = gUSE_IJA;
	}
	public String getGUKSE() {
		return GUKSE;
	}
	public void setGUKSE(String gUKSE) {
		GUKSE = gUKSE;
	}
	public String getGUKSE_IJA() {
		return GUKSE_IJA;
	}
	public void setGUKSE_IJA(String gUKSE_IJA) {
		GUKSE_IJA = gUKSE_IJA;
	}
	public String getGIGUM() {
		return GIGUM;
	}
	public void setGIGUM(String gIGUM) {
		GIGUM = gIGUM;
	}
	public String getGIGUM_IJA() {
		return GIGUM_IJA;
	}
	public void setGIGUM_IJA(String gIGUM_IJA) {
		GIGUM_IJA = gIGUM_IJA;
	}
	public String getVAT_AMT() {
		return VAT_AMT;
	}
	public void setVAT_AMT(String vAT_AMT) {
		VAT_AMT = vAT_AMT;
	}
	public String getNAP_ZIP_CD() {
		return NAP_ZIP_CD;
	}
	public void setNAP_ZIP_CD(String nAP_ZIP_CD) {
		NAP_ZIP_CD = nAP_ZIP_CD;
	}
	public String getNAP_ZIP_ADDR() {
		return NAP_ZIP_ADDR;
	}
	public void setNAP_ZIP_ADDR(String nAP_ZIP_ADDR) {
		NAP_ZIP_ADDR = nAP_ZIP_ADDR;
	}
	public String getNAP_DTL_ADDR() {
		return NAP_DTL_ADDR;
	}
	public void setNAP_DTL_ADDR(String nAP_DTL_ADDR) {
		NAP_DTL_ADDR = nAP_DTL_ADDR;
	}
	public String getRESIDE_STATUS() {
		return RESIDE_STATUS;
	}
	public void setRESIDE_STATUS(String rESIDE_STATUS) {
		RESIDE_STATUS = rESIDE_STATUS;
	}
	public String getMUL_GUBUN() {
		return MUL_GUBUN;
	}
	public void setMUL_GUBUN(String mUL_GUBUN) {
		MUL_GUBUN = mUL_GUBUN;
	}
	public String getMUL_NM() {
		return MUL_NM;
	}
	public void setMUL_NM(String mUL_NM) {
		MUL_NM = mUL_NM;
	}
	public String getBOOK_NO() {
		return BOOK_NO;
	}
	public void setBOOK_NO(String bOOK_NO) {
		BOOK_NO = bOOK_NO;
	}
	public String getHANGMOK1() {
		return HANGMOK1;
	}
	public void setHANGMOK1(String hANGMOK1) {
		HANGMOK1 = hANGMOK1;
	}
	public String getHANGMOK2() {
		return HANGMOK2;
	}
	public void setHANGMOK2(String hANGMOK2) {
		HANGMOK2 = hANGMOK2;
	}
	public String getHANGMOK3() {
		return HANGMOK3;
	}
	public void setHANGMOK3(String hANGMOK3) {
		HANGMOK3 = hANGMOK3;
	}
	public String getHANGMOK4() {
		return HANGMOK4;
	}
	public void setHANGMOK4(String hANGMOK4) {
		HANGMOK4 = hANGMOK4;
	}
	public String getHANGMOK5() {
		return HANGMOK5;
	}
	public void setHANGMOK5(String hANGMOK5) {
		HANGMOK5 = hANGMOK5;
	}
	public String getHANGMOK6() {
		return HANGMOK6;
	}
	public void setHANGMOK6(String hANGMOK6) {
		HANGMOK6 = hANGMOK6;
	}
	public String getGASAN_RATE_GUBUN() {
		return GASAN_RATE_GUBUN;
	}
	public void setGASAN_RATE_GUBUN(String gASAN_RATE_GUBUN) {
		GASAN_RATE_GUBUN = gASAN_RATE_GUBUN;
	}
	public String getGASAN_AMT_SKIP_GUBUN() {
		return GASAN_AMT_SKIP_GUBUN;
	}
	public void setGASAN_AMT_SKIP_GUBUN(String gASAN_AMT_SKIP_GUBUN) {
		GASAN_AMT_SKIP_GUBUN = gASAN_AMT_SKIP_GUBUN;
	}
	public String getBIGO() {
		return BIGO;
	}
	public void setBIGO(String bIGO) {
		BIGO = bIGO;
	}
	public String getSU_NAPBU_YMD() {
		return SU_NAPBU_YMD;
	}
	public void setSU_NAPBU_YMD(String sU_NAPBU_YMD) {
		SU_NAPBU_YMD = sU_NAPBU_YMD;
	}
	public String getSU_NAPBU_GUBUN() {
		return SU_NAPBU_GUBUN;
	}
	public void setSU_NAPBU_GUBUN(String sU_NAPBU_GUBUN) {
		SU_NAPBU_GUBUN = sU_NAPBU_GUBUN;
	}
	public String getOCR_GUBUN() {
		return OCR_GUBUN;
	}
	public void setOCR_GUBUN(String oCR_GUBUN) {
		OCR_GUBUN = oCR_GUBUN;
	}
	public String getSU_PRC_GUBUN() {
		return SU_PRC_GUBUN;
	}
	public void setSU_PRC_GUBUN(String sU_PRC_GUBUN) {
		SU_PRC_GUBUN = sU_PRC_GUBUN;
	}
	public String getSU_SISE() {
		return SU_SISE;
	}
	public void setSU_SISE(String sU_SISE) {
		SU_SISE = sU_SISE;
	}
	public String getSU_SISE_IJA() {
		return SU_SISE_IJA;
	}
	public void setSU_SISE_IJA(String sU_SISE_IJA) {
		SU_SISE_IJA = sU_SISE_IJA;
	}
	public String getSU_GUSE() {
		return SU_GUSE;
	}
	public void setSU_GUSE(String sU_GUSE) {
		SU_GUSE = sU_GUSE;
	}
	public String getSU_GUSE_IJA() {
		return SU_GUSE_IJA;
	}
	public void setSU_GUSE_IJA(String sU_GUSE_IJA) {
		SU_GUSE_IJA = sU_GUSE_IJA;
	}
	public String getSU_GUKSE() {
		return SU_GUKSE;
	}
	public void setSU_GUKSE(String sU_GUKSE) {
		SU_GUKSE = sU_GUKSE;
	}
	public String getSU_GUKSE_IJA() {
		return SU_GUKSE_IJA;
	}
	public void setSU_GUKSE_IJA(String sU_GUKSE_IJA) {
		SU_GUKSE_IJA = sU_GUKSE_IJA;
	}
	public String getSU_GIGUM() {
		return SU_GIGUM;
	}
	public void setSU_GIGUM(String sU_GIGUM) {
		SU_GIGUM = sU_GIGUM;
	}
	public String getSU_GIGUM_IJA() {
		return SU_GIGUM_IJA;
	}
	public void setSU_GIGUM_IJA(String sU_GIGUM_IJA) {
		SU_GIGUM_IJA = sU_GIGUM_IJA;
	}
	public String getSU_SISE_GASAN_SUM() {
		return SU_SISE_GASAN_SUM;
	}
	public void setSU_SISE_GASAN_SUM(String sU_SISE_GASAN_SUM) {
		SU_SISE_GASAN_SUM = sU_SISE_GASAN_SUM;
	}
	public String getSU_GUSE_GASAN_SUM() {
		return SU_GUSE_GASAN_SUM;
	}
	public void setSU_GUSE_GASAN_SUM(String sU_GUSE_GASAN_SUM) {
		SU_GUSE_GASAN_SUM = sU_GUSE_GASAN_SUM;
	}
	public String getSU_GUKSE_GASAN_SUM() {
		return SU_GUKSE_GASAN_SUM;
	}
	public void setSU_GUKSE_GASAN_SUM(String sU_GUKSE_GASAN_SUM) {
		SU_GUKSE_GASAN_SUM = sU_GUKSE_GASAN_SUM;
	}
	public String getSU_GIGUM_GASAN_SUM() {
		return SU_GIGUM_GASAN_SUM;
	}
	public void setSU_GIGUM_GASAN_SUM(String sU_GIGUM_GASAN_SUM) {
		SU_GIGUM_GASAN_SUM = sU_GIGUM_GASAN_SUM;
	}
	public String getSU_VAT_AMT() {
		return SU_VAT_AMT;
	}
	public void setSU_VAT_AMT(String sU_VAT_AMT) {
		SU_VAT_AMT = sU_VAT_AMT;
	}
	public String getSU_GUBUN() {
		return SU_GUBUN;
	}
	public void setSU_GUBUN(String sU_GUBUN) {
		SU_GUBUN = sU_GUBUN;
	}
	public String getSU_CNT() {
		return SU_CNT;
	}
	public void setSU_CNT(String sU_CNT) {
		SU_CNT = sU_CNT;
	}
	public String getGWAO_SISE() {
		return GWAO_SISE;
	}
	public void setGWAO_SISE(String gWAO_SISE) {
		GWAO_SISE = gWAO_SISE;
	}
	public String getGWAO_SISE_IJA() {
		return GWAO_SISE_IJA;
	}
	public void setGWAO_SISE_IJA(String gWAO_SISE_IJA) {
		GWAO_SISE_IJA = gWAO_SISE_IJA;
	}
	public String getGWAO_GUSE() {
		return GWAO_GUSE;
	}
	public void setGWAO_GUSE(String gWAO_GUSE) {
		GWAO_GUSE = gWAO_GUSE;
	}
	public String getGWAO_GUSE_IJA() {
		return GWAO_GUSE_IJA;
	}
	public void setGWAO_GUSE_IJA(String gWAO_GUSE_IJA) {
		GWAO_GUSE_IJA = gWAO_GUSE_IJA;
	}
	public String getGWAO_GUKSE() {
		return GWAO_GUKSE;
	}
	public void setGWAO_GUKSE(String gWAO_GUKSE) {
		GWAO_GUKSE = gWAO_GUKSE;
	}
	public String getGWAO_GUKSE_IJA() {
		return GWAO_GUKSE_IJA;
	}
	public void setGWAO_GUKSE_IJA(String gWAO_GUKSE_IJA) {
		GWAO_GUKSE_IJA = gWAO_GUKSE_IJA;
	}
	public String getGWAO_GIGUM() {
		return GWAO_GIGUM;
	}
	public void setGWAO_GIGUM(String gWAO_GIGUM) {
		GWAO_GIGUM = gWAO_GIGUM;
	}
	public String getGWAO_GIGUM_IJA() {
		return GWAO_GIGUM_IJA;
	}
	public void setGWAO_GIGUM_IJA(String gWAO_GIGUM_IJA) {
		GWAO_GIGUM_IJA = gWAO_GIGUM_IJA;
	}
	public String getGWAO_SISE_GASAN_SUM() {
		return GWAO_SISE_GASAN_SUM;
	}
	public void setGWAO_SISE_GASAN_SUM(String gWAO_SISE_GASAN_SUM) {
		GWAO_SISE_GASAN_SUM = gWAO_SISE_GASAN_SUM;
	}
	public String getGWAO_GUSE_GASAN_SUM() {
		return GWAO_GUSE_GASAN_SUM;
	}
	public void setGWAO_GUSE_GASAN_SUM(String gWAO_GUSE_GASAN_SUM) {
		GWAO_GUSE_GASAN_SUM = gWAO_GUSE_GASAN_SUM;
	}
	public String getGWAO_GUKSE_GASAN_SUM() {
		return GWAO_GUKSE_GASAN_SUM;
	}
	public void setGWAO_GUKSE_GASAN_SUM(String gWAO_GUKSE_GASAN_SUM) {
		GWAO_GUKSE_GASAN_SUM = gWAO_GUKSE_GASAN_SUM;
	}
	public String getGWAO_GIGUM_GASAN_SUM() {
		return GWAO_GIGUM_GASAN_SUM;
	}
	public void setGWAO_GIGUM_GASAN_SUM(String gWAO_GIGUM_GASAN_SUM) {
		GWAO_GIGUM_GASAN_SUM = gWAO_GIGUM_GASAN_SUM;
	}
	public String getGWAO_VAT_AMT() {
		return GWAO_VAT_AMT;
	}
	public void setGWAO_VAT_AMT(String gWAO_VAT_AMT) {
		GWAO_VAT_AMT = gWAO_VAT_AMT;
	}
	public String getGWAO_SAYU_CD() {
		return GWAO_SAYU_CD;
	}
	public void setGWAO_SAYU_CD(String gWAO_SAYU_CD) {
		GWAO_SAYU_CD = gWAO_SAYU_CD;
	}
	public String getGWAO_SAYU_NM() {
		return GWAO_SAYU_NM;
	}
	public void setGWAO_SAYU_NM(String gWAO_SAYU_NM) {
		GWAO_SAYU_NM = gWAO_SAYU_NM;
	}
	public String getGWAO_YMD() {
		return GWAO_YMD;
	}
	public void setGWAO_YMD(String gWAO_YMD) {
		GWAO_YMD = gWAO_YMD;
	}
	public String getGWAO_CNT() {
		return GWAO_CNT;
	}
	public void setGWAO_CNT(String gWAO_CNT) {
		GWAO_CNT = gWAO_CNT;
	}
	
	
}