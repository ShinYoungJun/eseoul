//	2009		Kim Yun Seo

package main.java.rojum.jumyonginfo.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.MappingSqlQuery;
import org.springframework.jdbc.object.SqlUpdate;

import main.java.common.dao.RoadsJdbcDaoSupport;
import main.java.rojum.jumyong.model.GapanBaseBean;
import main.java.rojum.jumyonginfo.model.GapanCodeBean;
import main.java.rojum.jumyonginfo.model.GapanInfoBean;
import main.java.rojum.jumyonginfo.model.GapanHeadBean;

public class JumyonginfoDao extends RoadsJdbcDaoSupport implements
		IJumyonginfoDao {
	protected void initDao() throws Exception {
		super.initDao();
	}

	// 운영자 등록
	public boolean executeUnyong_Gapan_Head_Modify(GapanHeadBean Bean) {
		Unyong_Gapan_Head_Modify unyong_Gapan_Head_Modify = new Unyong_Gapan_Head_Modify(getDataSource());
		Up_date_modify up_date_modify = new Up_date_modify(getDataSource());
		System.out.println("dao.JumyonginfoDao.executeUnyong_gapan_head_Modify");
		try {
			Object[] values = { Bean.getOWNER_NAME(), Bean.getOWNER_IDCHK(),
					Bean.getOWNER_SSN(), Bean.getOWNER_IMG_NAME(),
					Bean.getOWNER_GENDER(),

					Bean.getOWNER_AGE(), Bean.getOWNER_TEL(),
					Bean.getOWNER_HP(), Bean.getADDR_CHECK1(),
					Bean.getOWNER_POST(),

					Bean.getOWNER_TOPOST(), Bean.getOWNER_ADDR1(),
					Bean.getOWNER_SAN(), Bean.getOWNER_JIBUN(),
					Bean.getOWNER_ADDR2(),

					Bean.getOWNER_TOADDR1(), Bean.getOWNER_TOSAN(),
					Bean.getOWNER_TOJIBUN(), Bean.getOWNER_TOADDR2(),
					Bean.getLC_SEL(),

					Bean.getLC_TXT(), Bean.getRT_SEL(), Bean.getRT_TXT(),
					Bean.getESTATE_MOVE(), Bean.getESTATE_REAL(),
					Bean.getSI(), Bean.getGUN(), Bean.getDORO_NM(),
					Bean.getBD_BON(), Bean.getBD_BU(), Bean.getBD_NM() ,
					Bean.getBD_DET_NM(),
					Bean.getTOSI(), Bean.getTOGUN(), Bean.getTODORO_NM(),
					Bean.getTOBD_BON(), Bean.getTOBD_BU(), Bean.getTOBD_NM() ,
					Bean.getTOBD_DET_NM(),
					//********** BEGIN_현진_20120328
					//Bean.getLT_SEL(), Bean.getNOTE(), Bean.getGAPAN_NO() };
					Bean.getLT_SEL(), Bean.getNOTE(), 
					Bean.getDONG(),
					Bean.getRI(),
					Bean.getBON(),
					Bean.getBU(),
					Bean.getTDONG(),
					Bean.getT_RI(),
					Bean.getTBON(),
					Bean.getTBU(),					Bean.getGAPAN_NO() };
					//********** END_현진_20120328

					
		
			
			unyong_Gapan_Head_Modify.update(values);
			
			System.out.println("unyong_Gapan_Head_Modify getSql= "+unyong_Gapan_Head_Modify.getSql());

			Object[] value2 = { Bean.getGAPAN_NO() };
			up_date_modify.update(value2);

		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}

		return true;
	}

	// 운영자 수정
	protected class Unyong_Gapan_Head_Modify extends SqlUpdate {
		protected Unyong_Gapan_Head_Modify(DataSource ds) {
			super(ds, getMessageSourceAccessor().getMessage(
					"Querys.rojum.jumyonginfo.Unyong_Gapan_Head_Modify"));

			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));

			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));

			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));

			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));

			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));

			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			
			
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));

			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));

			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			
			//********** BEGIN_현진_20120328
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			//********** END_현진_20120328
		}
	}

	// 운영자 보기
	public List executeJumin_View(String admin_no) {
		Jumin_View jumin_View = new Jumin_View(getDataSource());

		Object[] values = { admin_no };

		return jumin_View.execute(values);
	}

	protected class Jumin_View extends MappingSqlQuery {
		protected Jumin_View(DataSource ds) {
			super(ds, getMessageSourceAccessor().getMessage("Querys.rojum.jumyonginfo.Jumin_View"));

			declareParameter(new SqlParameter(Types.VARCHAR));
		}

		protected Object mapRow(ResultSet rs, int rownum) throws SQLException {
			GapanHeadBean Bean = new GapanHeadBean();

			Bean.setGAPAN_NO(rs.getString("GAPAN_NO"));
			Bean.setGP_TYP(rs.getString("GP_TYP"));
			Bean.setOWNER_NAME(rs.getString("OWNER_NAME"));
			Bean.setOWNER_IDCHK(rs.getString("OWNER_IDCHK"));
			Bean.setOWNER_SSN(rs.getString("OWNER_SSN"));
			Bean.setOWNER_GENDER(rs.getString("OWNER_GENDER"));
			Bean.setOWNER_AGE(rs.getString("OWNER_AGE"));
			Bean.setOWNER_POST(rs.getString("OWNER_POST"));
			Bean.setOWNER_ADDR1(rs.getString("OWNER_ADDR1"));
			Bean.setOWNER_SAN(rs.getString("OWNER_SAN"));
			Bean.setOWNER_JIBUN(rs.getString("OWNER_JIBUN"));
			Bean.setOWNER_ADDR2(rs.getString("OWNER_ADDR2"));
			Bean.setOWNER_SAME(rs.getString("OWNER_SAME"));
			Bean.setOWNER_TOPOST(rs.getString("OWNER_TOPOST"));
			Bean.setOWNER_TOADDR1(rs.getString("OWNER_TOADDR1"));
			Bean.setOWNER_TOSAN(rs.getString("OWNER_TOSAN"));
			Bean.setOWNER_TOJIBUN(rs.getString("OWNER_TOJIBUN"));
			Bean.setOWNER_TOADDR2(rs.getString("OWNER_TOADDR2"));
			Bean.setOWNER_TEL(rs.getString("OWNER_TEL"));
			Bean.setOWNER_HP(rs.getString("OWNER_HP"));
			Bean.setOWNER_IMG_NAME(rs.getString("OWNER_IMG"));
			Bean.setRT_SEL(rs.getString("RT_SEL"));
			Bean.setRT_TXT(rs.getString("RT_TXT"));
			Bean.setLC_SEL(rs.getString("LC_SEL"));
			Bean.setLC_TXT(rs.getString("LC_TXT"));
			Bean.setESTATE_MOVE(rs.getString("ESTATE_MOVE"));
			Bean.setESTATE_REAL(rs.getString("ESTATE_REAL"));
			Bean.setPARTN_NAME(rs.getString("PARTN_NAME"));
			Bean.setPT_SEL(rs.getString("PT_SEL"));
			Bean.setPARTN_SSN(rs.getString("PARTN_SSN"));
			Bean.setPARTN_GENDER(rs.getString("PARTN_GENDER"));
			Bean.setPARTN_AGE(rs.getString("PARTN_AGE"));
			Bean.setPARTN_OSAM(rs.getString("PARTN_OSAM"));
			Bean.setPARTN_POST(rs.getString("PARTN_POST"));
			Bean.setPARTN_ADDR1(rs.getString("PARTN_ADDR1"));
			Bean.setPARTN_SAN(rs.getString("PARTN_SAN"));
			Bean.setPARTN_JIBUN(rs.getString("PARTN_JIBUN"));
			Bean.setPARTN_ADDR2(rs.getString("PARTN_ADDR2"));
			Bean.setPARTN_SAME(rs.getString("PARTN_SAME"));
			Bean.setPARTN_TOPOST(rs.getString("PARTN_TOPOST"));
			Bean.setPARTN_TOADDR1(rs.getString("PARTN_TOADDR1"));
			Bean.setPARTN_TOSAN(rs.getString("PARTN_TOSAN"));
			Bean.setPARTN_TOJIBUN(rs.getString("PARTN_TOJIBUN"));
			Bean.setPARTN_TOADDR2(rs.getString("PARTN_TOADDR2"));
			Bean.setPARTN_TEL(rs.getString("PARTN_TEL"));
			Bean.setPARTN_HP(rs.getString("PARTN_HP"));
			Bean.setPARTN_IMG_NAME(rs.getString("PARTN_IMG"));
			Bean.setADDR_CHECK1(rs.getString("ADDR_CHECK1"));
			Bean.setADDR_CHECK2(rs.getString("ADDR_CHECK2"));
			Bean.setTP_TYP_NM(rs.getString("TP_TYP_NM"));
			Bean.setRT_SEL_NM(rs.getString("RT_SEL_NM"));
			Bean.setLC_SEL_NM(rs.getString("LC_SEL_NM"));
			Bean.setPT_SEL_NM(rs.getString("PT_SEL_NM"));
			Bean.setNOTE(rs.getString("NOTE"));
			Bean.setLT_SEL(rs.getString("LT_SEL"));
			Bean.setLT_SEL_NM(rs.getString("LT_SEL_NM"));
			Bean.setSI(rs.getString("SI"));
			Bean.setGUN(rs.getString("GUN"));
			Bean.setDORO_NM(rs.getString("DORO_NM"));
			Bean.setBD_NM(rs.getString("BD_NM"));
			Bean.setBD_DET_NM(rs.getString("BD_DET_NM"));
			Bean.setBD_BON(rs.getString("BD_BON"));
			Bean.setBD_BU(rs.getString("BD_BU"));
			
			Bean.setTOSI(rs.getString("TSI"));
			Bean.setTOGUN(rs.getString("TGUN"));
			Bean.setTODORO_NM(rs.getString("TDORO_NM"));
			Bean.setTOBD_NM(rs.getString("TBD_NM"));
			Bean.setTOBD_DET_NM(rs.getString("TBD_DET_NM"));
			Bean.setTOBD_BON(rs.getString("TBD_BON"));
			Bean.setTOBD_BU(rs.getString("TBD_BU"));

			//********** BEGIN_현진_20120328
			Bean.setDONG(rs.getString("DONG"));
			Bean.setRI(rs.getString("RI"));
			Bean.setBON(rs.getString("BON"));
			Bean.setBU(rs.getString("BU"));
			Bean.setTDONG(rs.getString("TDONG"));
			Bean.setT_RI(rs.getString("T_RI"));
			Bean.setTBON(rs.getString("TBON"));
			Bean.setTBU(rs.getString("TBU"));
			//********** END_현진_20120328

			
			
			return Bean;
		}
	}

	

	// 점용지정보 보기
	public List executeJumji_View(String gapanno) {
		Jumji_View jumji_View = new Jumji_View(getDataSource());
		Object[] values = { gapanno };

		return jumji_View.execute(values);
	}

	protected class Jumji_View extends MappingSqlQuery {
		protected Jumji_View(DataSource ds) {
			super(ds, getMessageSourceAccessor().getMessage(
					"Querys.rojum.jumyonginfo.Jumji_View"));

			declareParameter(new SqlParameter(Types.VARCHAR));
		}

		protected Object mapRow(ResultSet rs, int rownum) throws SQLException {
			GapanInfoBean Bean = new GapanInfoBean();

			Bean.setGAPAN_NO(rs.getString("GAPAN_NO"));
			Bean.setX_COORD(rs.getString("X_COORD"));
			Bean.setY_COORD(rs.getString("Y_COORD"));
			Bean.setGP_TYP(rs.getString("GP_TYP"));
			Bean.setPURPOSE_CD(rs.getString("PURPOSE_CD"));

			Bean.setWITH_PNU(rs.getString("WITH_PNU"));
			Bean.setWITH_ADDR(rs.getString("WITH_ADDR"));
			Bean.setSHOP_IMG_NAME(rs.getString("SHOP_IMG"));
			Bean.setSHOP_IMG2_NAME(rs.getString("SHOP_IMG2"));
			Bean.setWITH_INFO(rs.getString("WITH_INFO"));
			Bean.setROAD_INFO(rs.getString("ROAD_INFO"));

			Bean.setAR_SEL(rs.getString("AR_SEL"));
			Bean.setAR_TXT(rs.getString("AR_TXT"));
			Bean.setFOUND_DATE(rs.getString("FOUND_DATE"));
			Bean.setUC_SEL(rs.getString("UC_SEL"));
			Bean.setUC_TXT(rs.getString("UC_TXT"));

			Bean.setFT_TYP(rs.getString("FT_TYP"));
			Bean.setFT_SEL(rs.getString("FT_SEL"));
			Bean.setFACIL_L(rs.getString("FACIL_L"));
			Bean.setFACIL_W(rs.getString("FACIL_W"));
			Bean.setFACIL_H(rs.getString("FACIL_H"));

			Bean.setPLACE_L(rs.getString("PLACE_L"));
			Bean.setPLACE_H(rs.getString("PLACE_H"));
			Bean.setPLACE_A(rs.getString("PLACE_A"));
			Bean.setDP_SEL(rs.getString("DP_SEL"));
			Bean.setDP_TXT(rs.getString("DP_TXT"));

			Bean.setSPECIAL_ST(rs.getString("SPECIAL_ST"));
			Bean.setMAINTN_OB(rs.getString("MAINTN_OB"));
			Bean.setMT_SEL(rs.getString("MT_SEL"));
			Bean.setSG_TYP(rs.getString("SG_TYP"));
			Bean.setLIQUOR_SL(rs.getString("LIQUOR_SL"));

			Bean.setLPGAS_US(rs.getString("LPGAS_US"));
			Bean.setSG_ITM(rs.getString("SG_ITM"));
			Bean.setSG_SEL(rs.getString("SG_SEL"));
			Bean.setMEM_NUM(rs.getString("MEM_NUM"));
			Bean.setOPEN_TIME(rs.getString("OPEN_TIME"));

			Bean.setCLOSE_TIME(rs.getString("CLOSE_TIME"));
			Bean.setPERMIT_DATE(rs.getString("PERMIT_DATE"));
			Bean.setDAY_SALES(rs.getString("DAY_SALES"));
			Bean.setUN_TYP(rs.getString("UN_TYP"));
			Bean.setUN_TXT(rs.getString("UN_TXT"));

			Bean.setNOTES(rs.getString("NOTES"));
			Bean.setTAXTATION_AT(rs.getString("TAXTATION_AT"));
			Bean.setTYPE(rs.getString("TYPE"));
			Bean.setSECTION(rs.getString("SECTION"));
			Bean.setMUL_FROMDATE(rs.getString("MUL_FROMDATE"));

			Bean.setMUL_TODATE(rs.getString("MUL_TODATE"));
			Bean.setAR_SEL_NM(rs.getString("AR_SEL_NM"));
			Bean.setUC_SEL_NM(rs.getString("UC_SEL_NM"));
			Bean.setFT_TYP_NM(rs.getString("FT_TYP_NM"));
			Bean.setFT_SEL_NM(rs.getString("FT_SEL_NM"));

			Bean.setDP_SEL_NM(rs.getString("DP_SEL_NM"));
			Bean.setMT_SEL_NM(rs.getString("MT_SEL_NM"));
			Bean.setSG_TYP_NM(rs.getString("SG_TYP_NM"));
			Bean.setSG_ITM_NM(rs.getString("SG_ITM_NM"));
			Bean.setSG_SEL_NM(rs.getString("SG_SEL_NM"));

			Bean.setUN_TYP_NM(rs.getString("UN_TYP_NM"));
			Bean.setAT_TAX_NM(rs.getString("AT_TAX_NM"));
			Bean.setOWNER_NAME(rs.getString("OWNER_NAME"));
			Bean.setHJ_CD(rs.getString("HJ_CD"));
			Bean.setREDUCTION_RATE(rs.getString("REDUCTION_RATE"));

			Bean.setREDUCTION_REASON(rs.getString("REDUCTION_REASON"));
			Bean.setPICKUP_DATE(rs.getString("PICKUP_DATE"));
			Bean.setRETURN_DATE(rs.getString("RETURN_DATE"));

			Bean.setPICKUP_YN(rs.getString("PICKUP_YN"));
			Bean.setADDR(rs.getString("ADDR"));

			Bean.setMANAGE_TYP(rs.getString("MANAGE_TYP"));
			Bean.setSURVEY_YEAR(rs.getString("SURVEY_YEAR"));
			Bean.setGUIDE_DATE(rs.getString("GUIDE_DATE"));
			Bean.setSPECIAL_DATE(rs.getString("SPECIAL_DATE"));
			Bean.setFT_CAT(rs.getString("FT_CAT"));
			Bean.setFT_CAT_NM(rs.getString("FT_CAT_NM"));
			Bean.setCAR_NO(rs.getString("CAR_NO"));

			if (rs.getString("SECTION").trim().equals("1")) {
				Bean.setSECTION("계속");
			} else if (rs.getString("SECTION").trim().equals("4")) {
				Bean.setSECTION("폐쇄");
			}

			//********** BEGIN_현진_20120313
			Bean.setREG_SEQ(rs.getString("REG_SEQ"));
			Bean.setREG_NAME(rs.getString("REG_NAME"));
			Bean.setGUGAN_CD(rs.getString("GUGAN_CD"));
			//********** END_현진_20120313
			
			// #mr 2014.02.27
			Bean.setWITH_DORO_NM(rs.getString("WITH_DORO_NM"));
			Bean.setWITH_BD_BON(rs.getString("WITH_BD_BON"));
			Bean.setWITH_BD_BU(rs.getString("WITH_BD_BU"));
			// #mr
			
			/* 2014.06 doro jibun kny */
			Bean.setJIBUN(rs.getString("JIBUN"));
			
			return Bean;
		}
	}

	// 점용지정보 수정
	public boolean executeJumji_Modify(GapanInfoBean Bean) {
		Jumji_Modify jumji_Modify = new Jumji_Modify(getDataSource());
		Up_date_modify up_date_modify = new Up_date_modify(getDataSource());
		System.out.println("Bean.getREG_SEQ() : " +Bean.getREG_SEQ());
		System.out.println("Bean.getREG_NAME() : " +Bean.getREG_NAME());
		System.out.println("Bean.getGUGAN_CD() : " +Bean.getGUGAN_CD());

		try {
			Object[] values = {
						Bean.getX_COORD(),
						Bean.getY_COORD(),
						Bean.getPURPOSE_CD(),
						Bean.getWITH_PNU(),
						Bean.getWITH_ADDR(),
						
						Bean.getSHOP_IMG_NAME(),
						Bean.getSHOP_IMG2_NAME(),
						Bean.getWITH_INFO(),
						Bean.getROAD_INFO(),
						Bean.getAR_SEL(),

						Bean.getAR_TXT(),
						Bean.getFOUND_DATE(),
						Bean.getUC_SEL(),
						Bean.getUC_TXT(),
						Bean.getFT_TYP(),

						Bean.getFT_SEL(),
						Bean.getFACIL_L(),
						Bean.getFACIL_W(),
						Bean.getFACIL_H(),
						Bean.getPLACE_L(),

						Bean.getPLACE_H(),
						Bean.getPLACE_A(),
						Bean.getDP_SEL(),
						Bean.getDP_TXT(),
						Bean.getSPECIAL_ST(),

						Bean.getMAINTN_OB(),
						Bean.getMT_SEL(),
						Bean.getSG_TYP(),
						Bean.getLIQUOR_SL(),
						Bean.getLPGAS_US(),

						Bean.getSG_ITM(),
						Bean.getSG_SEL(),
						Bean.getMEM_NUM(),
						Bean.getOPEN_TIME(),
						Bean.getCLOSE_TIME(),

						Bean.getPERMIT_DATE(),
						Bean.getDAY_SALES(),
						Bean.getUN_TYP(),
						Bean.getUN_TXT(),
						Bean.getNOTES(),

						Bean.getTAXTATION_AT(),
						Bean.getTYPE(),
						Bean.getSECTION(),
						Bean.getMUL_FROMDATE(),
						Bean.getMUL_TODATE(),

						Bean.getHJ_CD(),
						Bean.getREDUCTION_RATE(),
						Bean.getREDUCTION_REASON(),
						Bean.getPICKUP_DATE(),
						Bean.getPICKUP_YN(),

						Bean.getSURVEY_YEAR(),
						Bean.getMANAGE_TYP(),
						Bean.getGUIDE_DATE(),
						Bean.getFT_CAT(),
						Bean.getSPECIAL_DATE(),
						
						Bean.getCAR_NO(),						

						Bean.getREG_SEQ(),
						Bean.getREG_NAME(),
						Bean.getGUGAN_CD(),

						// #mr 20140302
						Bean.getWITH_DORO_NM(),
						Bean.getWITH_BD_BON(),
						Bean.getWITH_BD_BU(),
						
						/* 2014.06 doro jibun kny */
						Bean.getJIBUN(),
						
						Bean.getGAPAN_NO()
			};

			jumji_Modify.update(values);

			Object[] value2 = { Bean.getGAPAN_NO() };
			up_date_modify.update(value2);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}

		return true;
	}

	protected class Jumji_Modify extends SqlUpdate {
		protected Jumji_Modify(DataSource ds) {
			super(ds, getMessageSourceAccessor().getMessage(
					"Querys.rojum.jumyonginfo.Jumji_Modify"));

			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));

			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));

			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));

			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));

			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));

			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));

			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));

			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));

			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));

			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));

			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			
			// #mr 2014.03.25
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			
			/* 2014.06 doro jibun kny */
			declareParameter(new SqlParameter(Types.VARCHAR));

		}
	}

	public int executeJumji_Count(String corp_cd, String gu_code,
			String request_no) {
		Object[] values = { corp_cd, gu_code, request_no };

		String sql = getMessageSourceAccessor().getMessage(
				"Querys.rojum.jumyonginfo.Jumji_Count");
		return getJdbcTemplate().queryForInt(sql, values);
	}

	// 시설물 규격 얻기
	public List executeGetFtSel(String FT_TYP) {
		GetFtSelList getFtSelList = new GetFtSelList(getDataSource());
		Object[] values = { FT_TYP };

		return getFtSelList.execute(values);
	}

	protected class GetFtSelList extends MappingSqlQuery {
		protected GetFtSelList(DataSource ds) {
			super(ds, getMessageSourceAccessor().getMessage(
					"Querys.rojum.jumyonginfo.get_ft_sel"));

			declareParameter(new SqlParameter(Types.VARCHAR));
		}

		protected Object mapRow(ResultSet rs, int rownum) throws SQLException {
			GapanCodeBean Bean = new GapanCodeBean();
			Bean.setCODE(rs.getString("CODE"));
			Bean.setNAME(rs.getString("NAME"));
			Bean.setTYPE(rs.getString("TYPE"));

			return Bean;
		}
	}
	
	// 시설물 유형별 가져오기
	public List executeGetFtCat(String FT_TYP) {
		GetFtCatList getFtCatList = new GetFtCatList(getDataSource());
		Object[] values = { FT_TYP };

		return getFtCatList.execute(values);
	}

	protected class GetFtCatList extends MappingSqlQuery {
		protected GetFtCatList(DataSource ds) {
			super(ds, getMessageSourceAccessor().getMessage(
					"Querys.rojum.jumyonginfo.get_ft_cat"));

			declareParameter(new SqlParameter(Types.VARCHAR));
		}

		protected Object mapRow(ResultSet rs, int rownum) throws SQLException {
			GapanCodeBean Bean = new GapanCodeBean();
			Bean.setCODE(rs.getString("CODE"));
			Bean.setNAME(rs.getString("NAME"));
			Bean.setTYPE(rs.getString("TYPE"));

			return Bean;
		}
	}

	// 시설물명 얻기
	public List executeGetFtTyp(String GP_TYP) {
		GetFtTypList getFtTypList = new GetFtTypList(getDataSource());
		Object[] values = { GP_TYP };

		return getFtTypList.execute(values);
	}

	protected class GetFtTypList extends MappingSqlQuery {
		protected GetFtTypList(DataSource ds) {
			super(ds, getMessageSourceAccessor().getMessage(
					"Querys.rojum.jumyonginfo.get_ft_typ"));
			declareParameter(new SqlParameter(Types.VARCHAR));
		}

		protected Object mapRow(ResultSet rs, int rownum) throws SQLException {
			GapanCodeBean Bean = new GapanCodeBean();
			Bean.setCODE(rs.getString("CODE"));
			Bean.setNAME(rs.getString("NAME"));
			Bean.setTYPE(rs.getString("TYPE"));

			return Bean;
		}
	}

	protected class Up_date_modify extends SqlUpdate {
		protected Up_date_modify(DataSource ds) {
			super(ds, getMessageSourceAccessor().getMessage(
					"Querys.rojum.jumyonginfo.Up_date_modify"));

			declareParameter(new SqlParameter(Types.VARCHAR));
		}
	}
	
	
	public String executeGetSection(String gapanNo){
		Object[] values = {gapanNo};
		String sql = getMessageSourceAccessor().getMessage("Querys.rojum.jumyonginfo.getSection");
		return getJdbcTemplate().queryForMap(sql,values).get("SECTION").toString();
	}

	protected String Null2Space(String str) {
		if (str == null)
			str = "";

		return str;
	}

}
