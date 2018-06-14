package main.java.gapan.jumyonginfo.model;

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
	private String TAX_SET_NM = "";
	private String AR_SEL_NM = "";
	private String UC_SEL_NM = "";
	private String FT_TYP_NM = "";
	
	private String FT_SEL_NM = "";
	private String DP_SEL_NM = "";
	private String MT_SEL_NM = "";
	private String SG_TYP_NM = "";
	private String SG_ITM_NM = "";
	
	private String SG_SEL_NM = "";
	private String UN_TYP_NM = "";
	
	private String OPEN_TIME1 = "";
	private String OPEN_TIME2 = "";
	private String CLOSE_TIME1 = "";
	private String CLOSE_TIME2 = "";
	private String OWNER_NAME = "";
	
	private String HJ_CD = "";
	
	private String SF_VALUE = "";
	
	
	private String CHANGE_YM = "";
	
	//********** BEGIN_KANG_20120423
	private String Facility_No = "";

	//********** END_KANG_20120423

	
	//********** BEGIN_DORO_NM_20140424
	private String WITH_DORO_NM = "";
	private String WITH_BD_BON = "";
	private String WITH_BD_BU = "";
	//********** END_DORO_NM_20140424
	
	
	public String getFacility_No() {
		return Facility_No;
	}
	public void setFacility_No(String facilityNo) {
		Facility_No = facilityNo;
	}
	public String getCHANGE_YM() {
		return CHANGE_YM;
	}
	public void setCHANGE_YM(String cHANGEYM) {
		CHANGE_YM = cHANGEYM;
	}
	public String getSF_VALUE() {
		return SF_VALUE;
	}
	public void setSF_VALUE(String sFVALUE) {
		SF_VALUE = sFVALUE;
	}
	public String getHJ_CD() {
		return HJ_CD;
	}
	public void setHJ_CD(String hJCD) {
		HJ_CD = hJCD;
	}
	public void setSHOP_IMG(MultipartFile sHOPIMG) {
		SHOP_IMG = sHOPIMG;
	}
	public MultipartFile getSHOP_IMG() {
		return SHOP_IMG;
	}
	public void setSHOP_IMGG(MultipartFile SHOP_IMG) {
		this.SHOP_IMG = SHOP_IMG;
	}
	public String getSHOP_IMG_NAME() {
		return SHOP_IMG_NAME;
	}
	public void setSHOP_IMG_NAME(String shop_img_name) {
		SHOP_IMG_NAME = shop_img_name;
	}
	public String getOPEN_TIME1() {
		return OPEN_TIME1;
	}
	public void setOPEN_TIME1(String open_time1) {
		OPEN_TIME1 = open_time1;
	}
	public String getOPEN_TIME2() {
		return OPEN_TIME2;
	}
	public void setOPEN_TIME2(String open_time2) {
		OPEN_TIME2 = open_time2;
	}
	public String getDP_SEL_NM() {
		return DP_SEL_NM;
	}
	public void setDP_SEL_NM(String dp_sel_nm) {
		DP_SEL_NM = dp_sel_nm;
	}
	public String getTAX_SET_NM() {
		return TAX_SET_NM;
	}
	public void setTAX_SET_NM(String tax_set_nm) {
		TAX_SET_NM = tax_set_nm;
	}
	public String getOWNER_SET_NM() {
		return OWNER_SET_NM;
	}
	public void setOWNER_SET_NM(String owner_set_nm) {
		OWNER_SET_NM = owner_set_nm;
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
	public String getOWNER_SET() {
		return OWNER_SET;
	}
	public void setOWNER_SET(String owner_set) {
		OWNER_SET = owner_set;
	}
	public String getSECTION() {
		return SECTION;
	}
	public void setSECTION(String section) {
		SECTION = section;
	}
	public String getTAX_SET() {
		return TAX_SET;
	}
	public void setTAX_SET(String tax_set) {
		TAX_SET = tax_set;
	}
	public String getTYPE() {
		return TYPE;
	}
	public void setTYPE(String type) {
		TYPE = type;
	}
	public String getAR_SEL() {
		return AR_SEL;
	}
	public void setAR_SEL(String ar_sel) {
		AR_SEL = ar_sel;
	}
	public String getAR_TXT() {
		return AR_TXT;
	}
	public void setAR_TXT(String ar_txt) {
		AR_TXT = ar_txt;
	}
	public String getCAR_NUM() {
		return CAR_NUM;
	}
	public void setCAR_NUM(String car_num) {
		CAR_NUM = car_num;
	}
	public String getCAR_TON() {
		return CAR_TON;
	}
	public void setCAR_TON(String car_ton) {
		CAR_TON = car_ton;
	}
	public String getCLOSE_TIME() {
		return CLOSE_TIME;
	}
	public void setCLOSE_TIME(String close_time) {
		CLOSE_TIME = close_time;
	}
	public String getDAY_SALES() {
		return DAY_SALES;
	}
	public void setDAY_SALES(String day_sales) {
		DAY_SALES = day_sales;
	}
	public String getDP_SEL() {
		return DP_SEL;
	}
	public void setDP_SEL(String dp_sel) {
		DP_SEL = dp_sel;
	}
	public String getDP_TXT() {
		return DP_TXT;
	}
	public void setDP_TXT(String dp_txt) {
		DP_TXT = dp_txt;
	}
	public String getFACIL_H() {
		return FACIL_H;
	}
	public void setFACIL_H(String facil_h) {
		FACIL_H = facil_h;
	}
	public String getFACIL_L() {
		return FACIL_L;
	}
	public void setFACIL_L(String facil_l) {
		FACIL_L = facil_l;
	}
	public String getFACIL_W() {
		return FACIL_W;
	}
	public void setFACIL_W(String facil_w) {
		FACIL_W = facil_w;
	}
	public String getFOUND_DATE() {
		return FOUND_DATE;
	}
	public void setFOUND_DATE(String found_date) {
		FOUND_DATE = found_date;
	}
	public String getFT_SEL() {
		return FT_SEL;
	}
	public void setFT_SEL(String ft_sel) {
		FT_SEL = ft_sel;
	}
	public String getFT_TYP() {
		return FT_TYP;
	}
	public void setFT_TYP(String ft_typ) {
		FT_TYP = ft_typ;
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
	public String getLIQUOR_SL() {
		return LIQUOR_SL;
	}
	public void setLIQUOR_SL(String liquor_sl) {
		LIQUOR_SL = liquor_sl;
	}
	public String getLPGAS_US() {
		return LPGAS_US;
	}
	public void setLPGAS_US(String lpgas_us) {
		LPGAS_US = lpgas_us;
	}
	public String getMAINTN_OB() {
		return MAINTN_OB;
	}
	public void setMAINTN_OB(String maintn_ob) {
		MAINTN_OB = maintn_ob;
	}
	public String getMEM_NUM() {
		return MEM_NUM;
	}
	public void setMEM_NUM(String mem_num) {
		MEM_NUM = mem_num;
	}
	public String getMT_SEL() {
		return MT_SEL;
	}
	public void setMT_SEL(String mt_sel) {
		MT_SEL = mt_sel;
	}
	public String getNOTES() {
		return NOTES;
	}
	public void setNOTES(String notes) {
		NOTES = notes;
	}
	public String getOPEN_TIME() {
		return OPEN_TIME;
	}
	public void setOPEN_TIME(String open_time) {
		OPEN_TIME = open_time;
	}
	public String getPERMIT_DATE() {
		return PERMIT_DATE;
	}
	public void setPERMIT_DATE(String permit_date) {
		PERMIT_DATE = permit_date;
	}
	public String getPLACE_A() {
		return PLACE_A;
	}
	public void setPLACE_A(String place_a) {
		PLACE_A = place_a;
	}
	public String getPLACE_H() {
		return PLACE_H;
	}
	public void setPLACE_H(String place_h) {
		PLACE_H = place_h;
	}
	public String getPLACE_L() {
		return PLACE_L;
	}
	public void setPLACE_L(String place_l) {
		PLACE_L = place_l;
	}
	public String getPURPOSE_CD() {
		return PURPOSE_CD;
	}
	public void setPURPOSE_CD(String purpose_cd) {
		PURPOSE_CD = purpose_cd;
	}
	public String getROAD_INFO() {
		return ROAD_INFO;
	}
	public void setROAD_INFO(String road_info) {
		ROAD_INFO = road_info;
	}
	public String getSG_ITM() {
		return SG_ITM;
	}
	public void setSG_ITM(String sg_itm) {
		SG_ITM = sg_itm;
	}
	public String getSG_SEL() {
		return SG_SEL;
	}
	public void setSG_SEL(String sg_sel) {
		SG_SEL = sg_sel;
	}
	public String getSG_TYP() {
		return SG_TYP;
	}
	public void setSG_TYP(String sg_typ) {
		SG_TYP = sg_typ;
	}
//	public String getSHOP_IMG() {
//		return SHOP_IMG;
//	}
//	public void setSHOP_IMG(String shop_img) {
//		SHOP_IMG = shop_img;
//	}
	public String getSPECIAL_ST() {
		return SPECIAL_ST;
	}
	public void setSPECIAL_ST(String special_st) {
		SPECIAL_ST = special_st;
	}
	public String getTAXTATION_AT() {
		return TAXTATION_AT;
	}
	public void setTAXTATION_AT(String taxtation_at) {
		TAXTATION_AT = taxtation_at;
	}
	public String getUC_SEL() {
		return UC_SEL;
	}
	public void setUC_SEL(String uc_sel) {
		UC_SEL = uc_sel;
	}
	public String getUC_TXT() {
		return UC_TXT;
	}
	public void setUC_TXT(String uc_txt) {
		UC_TXT = uc_txt;
	}
	public String getUN_TXT() {
		return UN_TXT;
	}
	public void setUN_TXT(String un_txt) {
		UN_TXT = un_txt;
	}
	public String getUN_TYP() {
		return UN_TYP;
	}
	public void setUN_TYP(String un_typ) {
		UN_TYP = un_typ;
	}
	public String getWITH_ADDR() {
		return WITH_ADDR;
	}
	public void setWITH_ADDR(String with_addr) {
		WITH_ADDR = with_addr;
	}
	public String getWITH_INFO() {
		return WITH_INFO;
	}
	public void setWITH_INFO(String with_info) {
		WITH_INFO = with_info;
	}
	public String getWITH_PNU() {
		return WITH_PNU;
	}
	public void setWITH_PNU(String with_pnu) {
		WITH_PNU = with_pnu;
	}
	public String getX_COORD() {
		return X_COORD;
	}
	public void setX_COORD(String x_coord) {
		X_COORD = x_coord;
	}
	public String getY_COORD() {
		return Y_COORD;
	}
	public void setY_COORD(String y_coord) {
		Y_COORD = y_coord;
	}
	public String getAR_SEL_NM() {
		return AR_SEL_NM;
	}
	public void setAR_SEL_NM(String ar_sel_nm) {
		AR_SEL_NM = ar_sel_nm;
	}
	public String getUC_SEL_NM() {
		return UC_SEL_NM;
	}
	public void setUC_SEL_NM(String uc_sel_nm) {
		UC_SEL_NM = uc_sel_nm;
	}
	public String getFT_SEL_NM() {
		return FT_SEL_NM;
	}
	public void setFT_SEL_NM(String ft_sel_nm) {
		FT_SEL_NM = ft_sel_nm;
	}
	public String getFT_TYP_NM() {
		return FT_TYP_NM;
	}
	public void setFT_TYP_NM(String ft_typ_nm) {
		FT_TYP_NM = ft_typ_nm;
	}
	public String getMT_SEL_NM() {
		return MT_SEL_NM;
	}
	public void setMT_SEL_NM(String mt_sel_nm) {
		MT_SEL_NM = mt_sel_nm;
	}
	public String getSG_TYP_NM() {
		return SG_TYP_NM;
	}
	public void setSG_TYP_NM(String sg_typ_nm) {
		SG_TYP_NM = sg_typ_nm;
	}
	public String getSG_ITM_NM() {
		return SG_ITM_NM;
	}
	public void setSG_ITM_NM(String sg_itm_nm) {
		SG_ITM_NM = sg_itm_nm;
	}
	public String getSG_SEL_NM() {
		return SG_SEL_NM;
	}
	public void setSG_SEL_NM(String sg_sel_nm) {
		SG_SEL_NM = sg_sel_nm;
	}
	public String getUN_TYP_NM() {
		return UN_TYP_NM;
	}
	public void setUN_TYP_NM(String un_typ_nm) {
		UN_TYP_NM = un_typ_nm;
	}
	public String getCLOSE_TIME1() {
		return CLOSE_TIME1;
	}
	public void setCLOSE_TIME1(String close_time1) {
		CLOSE_TIME1 = close_time1;
	}
	public String getCLOSE_TIME2() {
		return CLOSE_TIME2;
	}
	public void setCLOSE_TIME2(String close_time2) {
		CLOSE_TIME2 = close_time2;
	}
	public String getOWNER_NAME() {
		return OWNER_NAME;
	}
	public void setOWNER_NAME(String owner_name) {
		OWNER_NAME = owner_name;
	}
	
	//********** BEGIN_DORO_NM_20140424
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
	//********** END_DORO_NM_20140424
	
}

	