package main.java.junggi.imposition.model;


import main.java.common.model.RoadsBaseBean;

public class impositionBean extends RoadsBaseBean {
	
    
//	R_ID, ADMIN_NO, YEAR, PRICE, AREA_AFTER, SUM_LASTYEAR, SUM_YEAR, SUM_ADJUST, RATE
//	, ADJUSTMENT, FORM, FORM_ADJUST, TAX_DATE, INDATE, OVERDATE \
//DISTINCT(AB.ADMIN_NO), T.YEAR, C.PRICE, C.AREA_AFTER, C.SUM_LASTYEAR, C.SUM_YEAR \
	//, C.SUM_ADJUST, C.RATE, C.ADJUSTMENT, C.FORM, C.FORM_ADJUST, T.TAX_DATE, T.INDATE, T.OVERDATE, C.FROMDATE, C.TODATE \	
	
	private String ADMIN_NO		;
	private String TSEQ			;
	private String CSEQ			;
	private String SEQ			;	
	private String YEAR ;
	private int PRICE ;
	private float AREA_AFTER ;
	private int SUM_LASTYEAR;
	private int SUM_YEAR;
	private int SUM_ADJUST;
	private int LAST_SUM;
	
	
	private float RATE;
	private float ADJUSTMENT;
	private String FORM;
	private String FORM_ADJUST;
	private String TAX_DATE;
	private String INDATE;
	private String OVERDATE;
	private String FROMDATE;
	private String TODATE;
	private String LASTFROMDATE;
	private String LASTTODATE;
	
	private String TAX_YN;
	private int	OVERTAX;
	private int PERIOD;
	
	private String TAX_YN_NAME;

	public float getADJUSTMENT() {
		return ADJUSTMENT;
	}

	public void setADJUSTMENT(float adjustment) {
		ADJUSTMENT = adjustment;
	}

	public String getADMIN_NO() {
		return ADMIN_NO;
	}

	public void setADMIN_NO(String admin_no) {
		ADMIN_NO = admin_no;
	}

	public float getAREA_AFTER() {
		return AREA_AFTER;
	}

	public void setAREA_AFTER(float area_after) {
		AREA_AFTER = area_after;
	}

	public String getCSEQ() {
		return CSEQ;
	}

	public void setCSEQ(String cseq) {
		CSEQ = cseq;
	}

	public String getFORM() {
		return FORM;
	}

	public void setFORM(String form) {
		FORM = form;
	}

	public String getFORM_ADJUST() {
		return FORM_ADJUST;
	}

	public void setFORM_ADJUST(String form_adjust) {
		FORM_ADJUST = form_adjust;
	}

	public String getFROMDATE() {
		return FROMDATE;
	}

	public void setFROMDATE(String fromdate) {
		FROMDATE = fromdate;
	}

	public String getINDATE() {
		return INDATE;
	}

	public void setINDATE(String indate) {
		INDATE = indate;
	}

	public int getLAST_SUM() {
		return LAST_SUM;
	}

	public void setLAST_SUM(int last_sum) {
		LAST_SUM = last_sum;
	}

	public String getLASTFROMDATE() {
		return LASTFROMDATE;
	}

	public void setLASTFROMDATE(String lastfromdate) {
		LASTFROMDATE = lastfromdate;
	}

	public String getLASTTODATE() {
		return LASTTODATE;
	}

	public void setLASTTODATE(String lasttodate) {
		LASTTODATE = lasttodate;
	}

	public String getOVERDATE() {
		return OVERDATE;
	}

	public void setOVERDATE(String overdate) {
		OVERDATE = overdate;
	}

	public int getOVERTAX() {
		return OVERTAX;
	}

	public void setOVERTAX(int overtax) {
		OVERTAX = overtax;
	}

	public int getPERIOD() {
		return PERIOD;
	}

	public void setPERIOD(int period) {
		PERIOD = period;
	}

	public int getPRICE() {
		return PRICE;
	}

	public void setPRICE(int price) {
		PRICE = price;
	}

	public float getRATE() {
		return RATE;
	}

	public void setRATE(float rate) {
		RATE = rate;
	}

	public String getSEQ() {
		return SEQ;
	}

	public void setSEQ(String seq) {
		SEQ = seq;
	}

	public int getSUM_ADJUST() {
		return SUM_ADJUST;
	}

	public void setSUM_ADJUST(int sum_adjust) {
		SUM_ADJUST = sum_adjust;
	}

	public int getSUM_LASTYEAR() {
		return SUM_LASTYEAR;
	}

	public void setSUM_LASTYEAR(int sum_lastyear) {
		SUM_LASTYEAR = sum_lastyear;
	}

	public int getSUM_YEAR() {
		return SUM_YEAR;
	}

	public void setSUM_YEAR(int sum_year) {
		SUM_YEAR = sum_year;
	}

	public String getTAX_DATE() {
		return TAX_DATE;
	}

	public void setTAX_DATE(String tax_date) {
		TAX_DATE = tax_date;
	}

	public String getTAX_YN() {
		return TAX_YN;
	}

	public void setTAX_YN(String tax_yn) {
		TAX_YN = tax_yn;
	}

	public String getTAX_YN_NAME() {
		return TAX_YN_NAME;
	}

	public void setTAX_YN_NAME(String tax_yn_name) {
		TAX_YN_NAME = tax_yn_name;
	}

	public String getTODATE() {
		return TODATE;
	}

	public void setTODATE(String todate) {
		TODATE = todate;
	}

	public String getTSEQ() {
		return TSEQ;
	}

	public void setTSEQ(String tseq) {
		TSEQ = tseq;
	}

	public String getYEAR() {
		return YEAR;
	}

	public void setYEAR(String year) {
		YEAR = year;
	}
	
}