//	2009		Kim Yun Seo
//	PLACE

package main.java.jumyong.minwon.model;

public class PlaceBean {

	private String ADMIN_NO			= "";
	private String TYPE				= "";
	private String SECTION			= "";
	private String PURPOSE			= "";
	private String PURPOSE_CD		= "";
	
	private String PARKING_NUM		= "";
	private String OWNER_SET		= "";
	private String TAX_SET			= "";
	private String MUL_POST			= "";
	private String SIDO				= "";
	
	private String SIGUNGU			= "";
	private String BJ_CD			= "";
	private String HJ_CD			= "";
	private String SPC_CD			= "";
	private String BONBUN			= "";
	
	private String BUBUN			= "";
	private String TONG				= "";
	private String BAN				= "";
	private String BD_NM			= "";
	private String BD_DONG			= "";
	
	private String BD_HO			= "";
	private String MUL_FROMDATE		= "";
	private String MUL_TODATE		= "";
	private String TOTAL_PERIOD		= "";
	private String PARTLY_PERIOD	= "";
	
	private String WORK_FROMDATE	= "";
	private String WORK_TODATE		= "";
	private String EXE_INFO			= "";
	private String RIVER_NM			= "";
	private String WITH_POST		= "";
	
	private String WITH_ADDR1		= "";
	private String WITH_ADDR2		= "";
	private String ROAD_ADDR		= "";
	private String ROAD_BON			= "";
	private String ROAD_BU			= "";
	
	private String FINISH_DATE		= "";
	private String ROAD_ADD			= "";
	private String PLACE_REFERENCE	= "";
	private String AREA_SIZE 		= "";	
	private String WITH_SUM_PRICE 	= "";
	
	private String WSP_YN 			= "";
	private String RIVER_RANK 		= "";
	
	private String REDUCTION_RATE   = "";
	private String REDUCTION_REASON = "";
	
	private String PERCENT_RATE 	= "";
	private String PERCENT_REASON	= "";
	
	//#mr 점용지 도로명 주소 추가
	private String JYADDR_NEW	= "";
	private String JYADDR_BON	= "";
	private String JYADDR_BU	= "";
	
	private String DUE_DATE		= "";	// 2016.03 점용기한(일시점용만료일)
	
	public String getDUE_DATE() {
		return DUE_DATE;
	}
	public void setDUE_DATE(String dUEDATE) {
		DUE_DATE = dUEDATE;
	}
	public String getPERCENT_RATE() {
		return PERCENT_RATE;
	}
	public void setPERCENT_RATE(String pERCENT_RATE) {
		PERCENT_RATE = pERCENT_RATE;
	}
	public String getPERCENT_REASON() {
		return PERCENT_REASON;
	}
	public void setPERCENT_REASON(String pERCENT_REASON) {
		PERCENT_REASON = pERCENT_REASON;
	}
	public String getREDUCTION_REASON() {
		return REDUCTION_REASON;
	}
	public void setREDUCTION_REASON(String rEDUCTIONREASON) {
		REDUCTION_REASON = rEDUCTIONREASON;
	}
	public String getREDUCTION_RATE() {
		return REDUCTION_RATE;
	}
	public void setREDUCTION_RATE(String rEDUCTIONRATE) {
		REDUCTION_RATE = rEDUCTIONRATE;
	}

	public String getRIVER_RANK() {
		return RIVER_RANK;
	}
	public void setRIVER_RANK(String rIVERRANK) {
		RIVER_RANK = rIVERRANK;
	}
	public String getWSP_YN() {
		return WSP_YN;
	}
	public void setWSP_YN(String wSPYN) {
		WSP_YN = wSPYN;
	}
	public String getWITH_SUM_PRICE() {
		return WITH_SUM_PRICE;
	}
	public void setWITH_SUM_PRICE(String wITHSUMPRICE) {
		WITH_SUM_PRICE = wITHSUMPRICE;
	}
	public String getAREA_SIZE() {
		return AREA_SIZE;
	}
	public void setAREA_SIZE(String aREASIZE) {
		AREA_SIZE = aREASIZE;
	}
	public String getWITH_POST() {
		return WITH_POST;
	}
	public void setWITH_POST(String with_post) {
		WITH_POST = with_post;
	}
	public String getWITH_ADDR1() {
		return WITH_ADDR1;
	}
	public void setWITH_ADDR1(String with_addr1) {
		WITH_ADDR1 = with_addr1;
	}
	public String getWITH_ADDR2() {
		return WITH_ADDR2;
	}
	public void setWITH_ADDR2(String with_addr2) {
		WITH_ADDR2 = with_addr2;
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
	public String getSECTION() {
		return SECTION;
	}
	public void setSECTION(String section) {
		SECTION = section;
	}
	public String getPURPOSE() {
		return PURPOSE;
	}
	public void setPURPOSE(String purpose) {
		PURPOSE = purpose;
	}
	public String getPURPOSE_CD() {
		return PURPOSE_CD;
	}
	public void setPURPOSE_CD(String purpose_cd) {
		PURPOSE_CD = purpose_cd;
	}
	public String getPARKING_NUM() {
		return PARKING_NUM;
	}
	public void setPARKING_NUM(String parking_num) {
		PARKING_NUM = parking_num;
	}
	public String getOWNER_SET() {
		return OWNER_SET;
	}
	public void setOWNER_SET(String owner_set) {
		OWNER_SET = owner_set;
	}
	public String getTAX_SET() {
		return TAX_SET;
	}
	public void setTAX_SET(String tax_set) {
		TAX_SET = tax_set;
	}
	public String getMUL_POST() {
		return MUL_POST;
	}
	public void setMUL_POST(String post) {
		MUL_POST = post;
	}
	public String getSIDO() {
		return SIDO;
	}
	public void setSIDO(String sido) {
		SIDO = sido;
	}
	public String getSIGUNGU() {
		return SIGUNGU;
	}
	public void setSIGUNGU(String sigungu) {
		SIGUNGU = sigungu;
	}
	public String getBJ_CD() {
		return BJ_CD;
	}
	public void setBJ_CD(String bj_cd) {
		BJ_CD = bj_cd;
	}
	public String getHJ_CD() {
		return HJ_CD;
	}
	public void setHJ_CD(String hj_cd) {
		HJ_CD = hj_cd;
	}
	public String getSPC_CD() {
		return SPC_CD;
	}
	public void setSPC_CD(String spc_cd) {
		SPC_CD = spc_cd;
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
	public String getTONG() {
		return TONG;
	}
	public void setTONG(String tong) {
		TONG = tong;
	}
	public String getBAN() {
		return BAN;
	}
	public void setBAN(String ban) {
		BAN = ban;
	}
	public String getBD_NM() {
		return BD_NM;
	}
	public void setBD_NM(String bd_nm) {
		BD_NM = bd_nm;
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

	public String getWORK_FROMDATE() {
		return WORK_FROMDATE;
	}
	public void setWORK_FROMDATE(String work_fromdate) {
		WORK_FROMDATE = work_fromdate;
	}
	public String getWORK_TODATE() {
		return WORK_TODATE;
	}
	public void setWORK_TODATE(String work_todate) {
		WORK_TODATE = work_todate;
	}
	public String getEXE_INFO() {
		return EXE_INFO;
	}
	public void setEXE_INFO(String exe_info) {
		EXE_INFO = exe_info;
	}
	public String getRIVER_NM() {
		return RIVER_NM;
	}
	public void setRIVER_NM(String river_nm) {
		RIVER_NM = river_nm;
	}
	public String getTOTAL_PERIOD() {
		return TOTAL_PERIOD;
	}
	public void setTOTAL_PERIOD(String total_period) {
		TOTAL_PERIOD = total_period;
	}
	public String getPARTLY_PERIOD() {
		return PARTLY_PERIOD;
	}
	public void setPARTLY_PERIOD(String partly_period) {
		PARTLY_PERIOD = partly_period;
	}
	public String getROAD_ADDR() {
		return ROAD_ADDR;
	}
	public void setROAD_ADDR(String road_addr) {
		ROAD_ADDR = road_addr;
	}
	public String getROAD_BON() {
		return ROAD_BON;
	}
	public void setROAD_BON(String road_bon) {
		ROAD_BON = road_bon;
	}
	public String getROAD_BU() {
		return ROAD_BU;
	}
	public void setROAD_BU(String road_bu) {
		ROAD_BU = road_bu;
	}
	public String getFINISH_DATE() {
		return FINISH_DATE;
	}
	public void setFINISH_DATE(String finish_date) {
		FINISH_DATE = finish_date;
	}
	public String getROAD_ADD() {
		return ROAD_ADD;
	}
	public void setROAD_ADD(String road_add) {
		ROAD_ADD = road_add;
	}
//	public String getDIG_FROMDATE() {
//		return DIG_FROMDATE;
//	}
//	public void setDIG_FROMDATE(String dig_fromdate) {
//		DIG_FROMDATE = dig_fromdate;
//	}
//	public String getDIG_TODATE() {
//		return DIG_TODATE;
//	}
//	public void setDIG_TODATE(String dig_todate) {
//		DIG_TODATE = dig_todate;
//	}
//	public String getRES_INFO() {
//		return RES_INFO;
//	}
//	public void setRES_INFO(String res_info) {
//		RES_INFO = res_info;
//	}
//	public String getROAD_SET() {
//		return ROAD_SET;
//	}
//	public void setROAD_SET(String road_set) {
//		ROAD_SET = road_set;
//	}
//	public String getSTURUTS() {
//		return STURUTS;
//	}
//	public void setSTURUTS(String sturuts) {
//		STURUTS = sturuts;
//	}
//	public String getPLACE_SET() {
//		return PLACE_SET;
//	}
//	public void setPLACE_SET(String place_set) {
//		PLACE_SET = place_set;
//	}
	public String getPLACE_REFERENCE() {
		return PLACE_REFERENCE;
	}
	public void setPLACE_REFERENCE(String place_reference) {
		PLACE_REFERENCE = place_reference;
	}
	
	//#mr 점용지 도로명 주소 추가
	public String getJYADDR_NEW() {
		return JYADDR_NEW;
	}
	public void setJYADDR_NEW(String jyaddr_new) {
		JYADDR_NEW = jyaddr_new;
	}
	public String getJYADDR_BON() {
		return JYADDR_BON;
	}
	public void setJYADDR_BON(String jyaddr_bon) {
		JYADDR_BON = jyaddr_bon;
	}
	public String getJYADDR_BU() {
		return JYADDR_BU;
	}
	public void setJYADDR_BU(String jyaddr_bu) {
		JYADDR_BU = jyaddr_bu;
	}
}
