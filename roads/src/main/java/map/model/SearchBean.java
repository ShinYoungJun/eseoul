package main.java.map.model;


import main.java.common.model.RoadsBaseBean;

public class SearchBean extends RoadsBaseBean {
	private String CODE	= "";
	
	private String ADMIN_NO	= "";	// 점용관리번호
	private String ADMIN_NO2 = "";	
	
	private String TAX_DATE	= "";      // 과세일자
	private String YEAR		= "";		//부과년도	
	private String SUM_LASTYEAR	= "";  // 작년도 점용료
	private String SUM_YEAR	= "";      // 현년도 점용료
	private String SUM_ADJUST	= "";    // 조정 점용료	
	
	private String REQ_NO		= "";	// 민원접수번호
	
	private String REQ_DATE		= "";	// 접수일자_점용인정보
	private String REGDATE		= "";	// admin_base 최초등록일자
	
	
	private String PERIOD_TYPE	= "";
	private String TYPE			= "";	// 점용종류
	private String SECTION		= "";	// 점용구분
	private String OWNER_SET	= "";	// 소유자
	private String TAX_SET		= "";	//세입구분	
	private String PURPOSE_CD	= "";   // 점용목적
	private String BJ_CD		= "";	// 법정동 코드
	private String BJ_CD1		= "";	// 법정동 코드 selectbox
	private String HJ_CD		= "";	// 행정동 코드
	private String SAN_CK		= "";	// 산체크
	private String BONBUN		= "";	// 번지
	private String BUBUN		= "";	// 호
	private	String TONG			= "";	// 통
	private String BAN			= "";	// 반
	private String NAME			= "";	// 민원인 이름
	
	private String MUL_FROMDATE	= "";	//점용 시작 기간
	private String MUL_TODATE 	= "";	//점용 종료기간
	
	private String CHECK_YN		= "";	//검토 여부
	private String TAX_YN		= "";	//부과 여부
		
	private String TYPE_NAME	="";	//점용종류
	private String SECTION_NAME	="";	//점용구분
	private String CHECK_NAME = "";
	
	private String BJ_NM	="";		//법정동 이름
	
	private String TSEQ ;
	
	private String UP_DATE;				//갱신일자
	private String TAX_SET_NAME;		//세입구분 - 공통코드
	private String PURPOSE_NM;		//목적코드 클래스 이름
	
	private String TAX_NO ;				//과세 번호
	private float AREA_SIZE ;			//점용면적
	
	private String TAX_YN_NAME ;		//부과여부
	
	private String GP_TYP = "";
	
	
	
	
	
	public String getPURPOSE_NM() {
		return PURPOSE_NM;
	}

	public void setPURPOSE_NM(String pURPOSENM) {
		PURPOSE_NM = pURPOSENM;
	}

	public float getAREA_SIZE() {
		return AREA_SIZE;
	}

	public void setAREA_SIZE(float aREASIZE) {
		AREA_SIZE = aREASIZE;
	}

	public String getGP_TYP() {
		return GP_TYP;
	}

	public void setGP_TYP(String gPTYP) {
		GP_TYP = gPTYP;
	}
	//지은
	private String SSN			= "";					
	private String BIZSSN		= "";
	private String ADDR1		= "";
	private String ADDR2		= "";
	private String TEL			= "";
	private String HP			= "";
	private String EMAIL		= "";
	private String TOPOST		= "";
	private String TOADDR1		= "";
	private String TOADDR2		= "";
	private String TONM			= "";
	private String TOTEL		= "";
	private String TOHP			= "";
	private String TOMAIL		= "";
	private String MUL_POST		= "";
	private String SIDO			= "";
	private String SI_NM		= "";
	private String SIGUNGU		= "";
	private String GU_NM		= "";
	private String HJ_NM		= "";
	private String SPC_CD		= "";
	private String BD_NM		= "";
	private String BD_DONG		= "";
	private String BD_HO		= "";
	private String CLASS_NM		= "";
	
	//searchBean
	private int INTCURPAGE;
	private String FROMDATE;
	private String TODATE; 
	private String GU_CD; 
	private String SI_CD;
	 
	private String NUMBERVALUE; 
	private String JUMYONGNAME; 
	private String PURPOSE;
	private String LOCATE_X;
	private String LOCATE_Y;
	
	//가판
	private String GAPAN_NO 		= "";		
	private String OWNER_NAME 		= "";		
	private String FT_TYP_NAME 		= "";			
	private String OWNER_TEL 		= "";		
	private String OWNER_HP 		= "";		
	private String OWNER_TOADDR1 	= "";		
	private String OWNER_TOADDR2 	= "";
	private String OWNER_TOJIBUN 	= "";		
	private String OWNER_TOSAN 		= "";		
	private String LC_SEL_NAME 		= "";		
	private String PT_SEL_NAME 		= "";
	private String WITH_ADDR 		= "";		
	private String FACIL_L 			= "";		
	private String FACIL_W 			= "";		
	private String FACIL_H 			= "";
	private String FACIL 			= "";		
	private String PLACE_L 			= "";		
	private String PLACE_H 			= "";		
	private String PLACE_A 			= "";
	private String PLACE 			= "";		
	private String CAR_TON 			= "";		
	private String LIQUOR_SL 		= "";		
	private String LPGAS_US 		= "";
	private String SORT_NM 			= "";		
	private String MT_SEL 			= "";		
	private String WITH_PNU 		= "";
	
	//miniMap(위치등록/수정)
	private String PNU 				= "";
	private String JIBUN 			= "";		
	private String XX_COORD			= "";		
	private String YY_COORD			= "";
	private String MAINTN_OB		= "";
	private String POINT_X		= "";
	private String POINT_Y		= "";
	
	public String getCODE() {
		return CODE;
	}

	public void setCODE(String code) {
		CODE = code;
	}
	
	public String getADMIN_NO() {
		return ADMIN_NO;
	}

	public void setADMIN_NO(String admin_no) {
		ADMIN_NO = admin_no;
	}

	public String getADMIN_NO2() {
		return ADMIN_NO2;
	}

	public void setADMIN_NO2(String admin_no2) {
		ADMIN_NO2 = admin_no2;
	}

	public String getBAN() {
		return BAN;
	}

	public void setBAN(String ban) {
		BAN = ban;
	}

	public String getBJ_CD() {
		return BJ_CD;
	}

	public void setBJ_CD(String bj_cd) {
		BJ_CD = bj_cd;
	}
	
	public String getBJ_CD1() {
		return BJ_CD1;
	}

	public void setBJ_CD1(String bj_cd1) {
		BJ_CD1 = bj_cd1;
	}

	public String getBJ_NM() {
		return BJ_NM;
	}

	public void setBJ_NM(String bj_nm) {
		BJ_NM = bj_nm;
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

	public String getCHECK_NAME() {
		return CHECK_NAME;
	}

	public void setCHECK_NAME(String check_name) {
		CHECK_NAME = check_name;
	}

	public String getCHECK_YN() {
		return CHECK_YN;
	}

	public void setCHECK_YN(String check_yn) {
		CHECK_YN = check_yn;
	}

	public String getHJ_CD() {
		return HJ_CD;
	}

	public void setHJ_CD(String hj_cd) {
		HJ_CD = hj_cd;
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

	public String getNAME() {
		return NAME;
	}

	public void setNAME(String name) {
		NAME = name;
	}

	public String getOWNER_SET() {
		return OWNER_SET;
	}

	public void setOWNER_SET(String owner_set) {
		OWNER_SET = owner_set;
	}

	public String getPERIOD_TYPE() {
		return PERIOD_TYPE;
	}

	public void setPERIOD_TYPE(String period_type) {
		PERIOD_TYPE = period_type;
	}

	public String getPURPOSE_CD() {
		return PURPOSE_CD;
	}

	public void setPURPOSE_CD(String purpose_cd) {
		PURPOSE_CD = purpose_cd;
	}

	public String getREGDATE() {
		return REGDATE;
	}

	public void setREGDATE(String regdate) {
		REGDATE = regdate;
	}

	public String getREQ_DATE() {
		return REQ_DATE;
	}

	public void setREQ_DATE(String req_date) {
		REQ_DATE = req_date;
	}

	public String getREQ_NO() {
		return REQ_NO;
	}

	public void setREQ_NO(String req_no) {
		REQ_NO = req_no;
	}

	public String getSAN_CK() {
		return SAN_CK;
	}

	public void setSAN_CK(String san_ck) {
		SAN_CK = san_ck;
	}

	public String getSECTION() {
		return SECTION;
	}

	public void setSECTION(String section) {
		SECTION = section;
	}

	public String getSECTION_NAME() {
		return SECTION_NAME;
	}

	public void setSECTION_NAME(String section_name) {
		SECTION_NAME = section_name;
	}

	public String getSUM_ADJUST() {
		return SUM_ADJUST;
	}

	public void setSUM_ADJUST(String sum_adjust) {
		SUM_ADJUST = sum_adjust;
	}

	public String getSUM_LASTYEAR() {
		return SUM_LASTYEAR;
	}

	public void setSUM_LASTYEAR(String sum_lastyear) {
		SUM_LASTYEAR = sum_lastyear;
	}

	public String getSUM_YEAR() {
		return SUM_YEAR;
	}

	public void setSUM_YEAR(String sum_year) {
		SUM_YEAR = sum_year;
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

	public String getTAX_SET() {
		return TAX_SET;
	}

	public void setTAX_SET(String tax_set) {
		TAX_SET = tax_set;
	}

	public String getTAX_SET_NAME() {
		return TAX_SET_NAME;
	}

	public void setTAX_SET_NAME(String tax_set_name) {
		TAX_SET_NAME = tax_set_name;
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

	public String getTONG() {
		return TONG;
	}

	public void setTONG(String tong) {
		TONG = tong;
	}

	public String getTSEQ() {
		return TSEQ;
	}

	public void setTSEQ(String tseq) {
		TSEQ = tseq;
	}

	public String getTYPE() {
		return TYPE;
	}

	public void setTYPE(String type) {
		TYPE = type;
	}

	public String getTYPE_NAME() {
		return TYPE_NAME;
	}

	public void setTYPE_NAME(String type_name) {
		TYPE_NAME = type_name;
	}

	public String getUP_DATE() {
		return UP_DATE;
	}

	public void setUP_DATE(String up_date) {
		UP_DATE = up_date;
	}

	public String getYEAR() {
		return YEAR;
	}

	public void setYEAR(String year) {
		YEAR = year;
	}
	
	
	public String getSSN() {
		return SSN;
	}

	public void setSSN(String ssn) {
		SSN = ssn;
	}
	public String getBIZSSN() {
		return BIZSSN;
	}

	public void setBIZSSN(String bizssn) {
		BIZSSN = bizssn;
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
	public String getTEL() {
		return TEL;
	}

	public void setTEL(String tel) {
		TEL = tel;
	}
	public String getHP() {
		return HP;
	}

	public void setHP(String hp) {
		HP = hp;
	}
	public String getEMAIL() {
		return EMAIL;
	}

	public void setEMAIL(String email) {
		EMAIL = email;
	}
	public String getTOPOST() {
		return TOPOST;
	}

	public void setTOPOST(String topost) {
		TOPOST = topost;
	}
	public String getTOADDR1() {
		return TOADDR1;
	}

	public void setTOADDR1(String toaddr1) {
		TOADDR1 = toaddr1;
	}
	public String getTOADDR2() {
		return TOADDR2;
	}

	public void setTOADDR2(String toaddr2) {
		TOADDR2 = toaddr2;
	}
	public String getTONM() {
		return TONM;
	}

	public void setTONM(String tonm) {
		TONM = tonm;
	}
	public String getTOTEL() {
		return TOTEL;
	}

	public void setTOTEL(String totel) {
		TOTEL = totel;
	}
	public String getTOHP() {
		return TOHP;
	}

	public void setTOHP(String tohp) {
		TOHP = tohp;
	}
	public String getTOMAIL() {
		return TOMAIL;
	}

	public void setTOMAIL(String tomail) {
		TOMAIL = tomail;
	}

	public String getMUL_POST() {
		return MUL_POST;
	}

	public void setMUL_POST(String mul_post) {
		MUL_POST = mul_post;
	}
	public String getSIDO() {
		return SIDO;
	}

	public void setSIDO(String sido) {
		SIDO = sido;
	}
	public String getSI_NM() {
		return SI_NM;
	}

	public void setSI_NM(String si_nm) {
		SI_NM = si_nm;
	}
	public String getSIGUNGU() {
		return SIGUNGU;
	}

	public void setSIGUNGU(String sigungu) {
		SIGUNGU = sigungu;
	}
	public String getGU_NM() {
		return GU_NM;
	}

	public void setGU_NM(String gu_nm) {
		GU_NM = gu_nm;
	}
	
	public String getHJ_NM() {
		return HJ_NM;
	}

	public void setHJ_NM(String hj_nm) {
		HJ_NM = hj_nm;
	}
	public String getSPC_CD() {
		return SPC_CD;
	}

	public void setSPC_CD(String spc_cd) {
		SPC_CD = spc_cd;
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
	public String getCLASS_NM() {
		return CLASS_NM;
	}

	public void setCLASS_NM(String class_nm) {
		CLASS_NM = class_nm;
	}
	
	
	
	
	/////
	
	public String getGU_CD() {
		return GU_CD;
	}
	public void setGU_CD(String gu_cd) {
		GU_CD = gu_cd;
	}
	
	public String getSI_CD() {
		return SI_CD;
	}
	public void setSI_CD(String si_cd) {
		SI_CD = si_cd;
	}
	

	public String getFROMDATE() {
		return FROMDATE;
	}
	public void setFROMDATE(String fromdate) {
		FROMDATE = fromdate;
	}
	public int getINTCURPAGE() {
		return INTCURPAGE;
	}
	public void setINTCURPAGE(int intcurpage) {
		INTCURPAGE = intcurpage;
	}
	public String getJUMYONGNAME() {
		return JUMYONGNAME;
	}
	public void setJUMYONGNAME(String jumyongname) {
		JUMYONGNAME = jumyongname;
	}
	public String getNUMBERVALUE() {
		return NUMBERVALUE;
	}
	public void setNUMBERVALUE(String numbervalue) {
		NUMBERVALUE = numbervalue;
	}
	public String getPURPOSE() {
		return PURPOSE;
	}
	public void setPURPOSE(String purpose) {
		PURPOSE = purpose;
	}
	public String getTODATE() {
		return TODATE;
	}
	public void setTODATE(String todate) {
		TODATE = todate;
	}
	public String getLOCATE_X() {
		return LOCATE_X;
	}
	public void setLOCATE_X(String locate_x) {
		LOCATE_X = locate_x;
	}
	public String getLOCATE_Y() {
		return LOCATE_Y;
	}
	public void setLOCATE_Y(String locate_y) {
		LOCATE_Y = locate_y;
	}
	
	//가판
	
	public String getGAPAN_NO() {
		return GAPAN_NO;
	}
	public void setGAPAN_NO(String gapan_no) {
		GAPAN_NO = gapan_no;
	}
	public String getOWNER_NAME() {
		return OWNER_NAME;
	}
	public void setOWNER_NAME(String owner_name) {
		OWNER_NAME = owner_name;
	}
	public String getFT_TYP_NAME() {
		return FT_TYP_NAME;
	}
	public void setFT_TYP_NAME(String ft_typ_name) {
		FT_TYP_NAME = ft_typ_name;
	}
	public String getOWNER_TEL() {
		return OWNER_TEL;
	}
	public void setOWNER_TEL(String owner_tel) {
		OWNER_TEL = owner_tel;
	}
	public String getOWNER_HP() {
		return OWNER_HP;
	}
	public void setOWNER_HP(String owner_hp) {
		OWNER_HP = owner_hp;
	}
	public String getOWNER_TOADDR1() {
		return OWNER_TOADDR1;
	}
	public void setOWNER_TOADDR1(String owner_toaddr1) {
		OWNER_TOADDR1 = owner_toaddr1;
	}
	public String getOWNER_TOADDR2() {
		return OWNER_TOADDR2;
	}
	public void setOWNER_TOADDR2(String owner_toaddr2) {
		OWNER_TOADDR2 = owner_toaddr2;
	}	
	public String getOWNER_TOJIBUN() {
		return OWNER_TOJIBUN;
	}
	public void setOWNER_TOJIBUN(String owner_tojibun) {
		OWNER_TOJIBUN = owner_tojibun;
	}
	public String getOWNER_TOSAN() {
		return OWNER_TOSAN;
	}
	public void setOWNER_TOSAN(String owner_tosan) {
		OWNER_TOSAN = owner_tosan;
	}
	public String getLC_SEL_NAME() {
		return LC_SEL_NAME;
	}
	public void setLC_SEL_NAME(String lc_sel_name) {
		LC_SEL_NAME = lc_sel_name;
	}
	public String getPT_SEL_NAME() {
		return PT_SEL_NAME;
	}
	public void setPT_SEL_NAME(String pt_sel_name) {
		PT_SEL_NAME = pt_sel_name;
	}
	public String getWITH_ADDR() {
		return WITH_ADDR;
	}
	public void setWITH_ADDR(String with_addr) {
		WITH_ADDR = with_addr;
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
	public String getFACIL_H() {
		return FACIL_H;
	}
	public void setFACIL_H(String facil_h) {
		FACIL_H = facil_h;
	}
	public String getFACIL() {
		return FACIL;
	}
	public void setFACIL(String facil) {
		FACIL = facil;
	}
	public String getPLACE_L() {
		return PLACE_L;
	}
	public void setPLACE_L(String place_l) {
		PLACE_L = place_l;
	}
	public String getPLACE_H() {
		return PLACE_H;
	}
	public void setPLACE_H(String place_h) {
		PLACE_H = place_h;
	}
	public String getPLACE_A() {
		return PLACE_A;
	}
	public void setPLACE_A(String place_a) {
		PLACE_A = place_a;
	}
	public String getPLACE() {
		return PLACE;
	}
	public void setPLACE(String place) {
		PLACE = place;
	}
	public String getCAR_TON() {
		return CAR_TON;
	}
	public void setCAR_TON(String car_ton) {
		CAR_TON = car_ton;
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
	public String getSORT_NM() {
		return SORT_NM;
	}
	public void setSORT_NM(String sort_nm) {
		SORT_NM = sort_nm;
	}
	public String getMT_SEL() {
		return MT_SEL;
	}
	public void setMT_SEL(String mt_sel) {
		MT_SEL = mt_sel;
	}
	public String getWITH_PNU() {
		return WITH_PNU;
	}
	public void setWITH_PNU(String with_pnu) {
		WITH_PNU = with_pnu;
	}
	public String getPNU() {
		return PNU;
	}
	public void setPNU(String pnu) {
		PNU = pnu;
	}
	public String getJIBUN() {
		return JIBUN;
	}
	public void setJIBUN(String jibun) {
		JIBUN = jibun;
	}
	public String getXX_COORD() {
		return XX_COORD;
	}
	public void setXX_COORD(String xx_coord) {
		XX_COORD = xx_coord;
	}
	public String getYY_COORD() {
		return YY_COORD;
	}
	public void setYY_COORD(String yy_coord) {
		YY_COORD = yy_coord;
	}
	public String getMAINTN_OB() {
		return MAINTN_OB;
	}
	public void setMAINTN_OB(String maintn_ob) {
		MAINTN_OB = maintn_ob;
	}
	
	public String getPOINT_X() {
		return POINT_X;
	}
	public void setPOINT_X(String point_x) {
		POINT_X = point_x;
	}
	
	public String getPOINT_Y() {
		return POINT_Y;
	}
	public void setPOINT_Y(String point_y) {
		POINT_Y = point_y;
	}

}
