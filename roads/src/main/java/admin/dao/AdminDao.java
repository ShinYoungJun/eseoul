package main.java.admin.dao;

import main.java.common.dao.RoadsJdbcDaoSupport;
import main.java.rojum.jumyong.model.jumyongBean;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.MappingSqlQuery;
import org.springframework.jdbc.object.SqlUpdate;
import org.springframework.jdbc.support.lob.OracleLobHandler;
//********** BEGIN_현진_20120306
import main.java.rojum.survey.model.GapanInfoBean;
import main.java.rojum.survey.model.GapanHeadBean;
import main.java.rojum.survey.model.GapanBaseBean;
import java.util.List;
//********** END_현진_20120306

//********** BEGIN_현진_20120309
import main.java.admin.model.SectionBean;
//********** END_현진_20120309




public class AdminDao extends RoadsJdbcDaoSupport implements IAdminDao {

    protected	void	initDao()  throws Exception
    {
		super.initDao();
   	}
    // 노점 메뉴 시작 ==============================================================
    // 노점 카운트
    public int executeCountGapan(String gu_cd, String gapanNo, String surveyYear){
    	String sql = getMessageSourceAccessor().getMessage("Querys.gapan.count.gapanInfo");
    	
    	String mGapanNo = gu_cd+"%";
    	
    	mGapanNo = gapanNoReturn(mGapanNo, gapanNo);
    	
    	Object[] values = {
     			mGapanNo,
     			surveyYear
     	};
    	
    	return getJdbcTemplate().queryForInt(sql,values);	
    }

    
    // 노점 일괄 삭제  
    public void executeDeleteGapan(String gu_cd, String gapanNo, String surveyYear){		
    	
    	String mGapanNo = gu_cd+"%";
    	
    	mGapanNo = gapanNoReturn(mGapanNo, gapanNo);
    	
    	System.out.println("mGapanNo : " + mGapanNo);
    	System.out.println("surveyYear : " + surveyYear);
 		Object[] values = {
 			mGapanNo,
 			surveyYear
 		};
 		ExecuteGapanBaseDelete executeGapanBaseDelete = new ExecuteGapanBaseDelete(getDataSource());
 		ExecuteGapanHeadDelete executeGapanHeadDelete = new ExecuteGapanHeadDelete(getDataSource());
 		ExecuteGapanInfoDelete executeGapanInfoDelete = new ExecuteGapanInfoDelete(getDataSource());
 		
 		executeGapanBaseDelete.update(values);
 		executeGapanHeadDelete.update(values);
 		executeGapanInfoDelete.update(values);
 		
	}
    
    
    // 노점 일괄 삭제  GAPAN_BASE
	protected class ExecuteGapanBaseDelete extends SqlUpdate {
		public ExecuteGapanBaseDelete(DataSource dataSource) {
			super(dataSource, getMessageSourceAccessor().getMessage(
					"Querys.gapan.delete.gapanBase"));
			declareParameter(new SqlParameter(Types.VARCHAR)); //GAPAN_NO
			declareParameter(new SqlParameter(Types.VARCHAR)); //SURVEY_YEAR
		}
	}
	
	// 노점 일괄 삭제   GAPAN_HEAD
	protected class ExecuteGapanHeadDelete extends SqlUpdate {
		public ExecuteGapanHeadDelete(DataSource dataSource) {
			super(dataSource, getMessageSourceAccessor().getMessage(
					"Querys.gapan.delete.gapanHead"));
			declareParameter(new SqlParameter(Types.VARCHAR)); //GAPAN_NO
			declareParameter(new SqlParameter(Types.VARCHAR)); //SURVEY_YEAR
		}
	}

	// 노점 일괄 삭제  GAPAN_INFO
	protected class ExecuteGapanInfoDelete extends SqlUpdate {
		public ExecuteGapanInfoDelete(DataSource dataSource) {
			super(dataSource, getMessageSourceAccessor().getMessage(
					"Querys.gapan.delete.gapanInfo"));
			declareParameter(new SqlParameter(Types.VARCHAR)); //GAPAN_NO
			declareParameter(new SqlParameter(Types.VARCHAR)); //SURVEY_YEAR
		}
	}	   
	
	// 노점 조사년도 복사 1 - GAPAN_NO 가져오기
    public List getBeforeGapanNo(String gu_cd, String gapanNo, String beforeYear){		
    	GetBeforeGapanNo getBeforeGapanNo = new GetBeforeGapanNo(getDataSource());
    	
    	String mGapanNo = gu_cd+"%";
    	mGapanNo = gapanNoReturn(mGapanNo, gapanNo);
    	
    	System.out.println("mGapanNo : " + mGapanNo);
    	System.out.println("beforeYear : " + beforeYear);

 		Object[] values = {
 			mGapanNo,
 			beforeYear
 		};
 		 
 		return getBeforeGapanNo.execute(values);
	}    

 
	protected class GetBeforeGapanNo extends MappingSqlQuery {
		public GetBeforeGapanNo(DataSource dataSource) {
			super(dataSource, getMessageSourceAccessor().getMessage(
					"Querys.gapan.admin.gapanNo.gapanInfo"));
			declareParameter(new SqlParameter(Types.VARCHAR)); //GAPAN_NO
			declareParameter(new SqlParameter(Types.VARCHAR)); //BEFORE_SURVEY_YEAR
		}
		
		protected Object mapRow(ResultSet rs, int rownum) throws SQLException {
			GapanInfoBean Bean = new GapanInfoBean();

			Bean.setGAPAN_NO(rs.getString("GAPAN_NO"));
			return Bean;
		}
	}

	// 노점 조사년도 복사  - GAPAN_INFO 가져오기
    public List getGapanInfo(String gapanNo, String SURVEY_YEAR){		
    	GetGapanInfo getGapanInfo = new GetGapanInfo(getDataSource());
    	
    	System.out.println("gapanNo : " + gapanNo);
    	System.out.println("SURVEY_YEAR : " + SURVEY_YEAR);

 		Object[] values = {
 			gapanNo,
 			SURVEY_YEAR
 		};
 		 
 		return getGapanInfo.execute(values);
	}    

 
	protected class GetGapanInfo extends MappingSqlQuery {
		public GetGapanInfo(DataSource dataSource) {
			super(dataSource, getMessageSourceAccessor().getMessage(
					"Querys.gapan.admin.select.gapanInfo"));
			declareParameter(new SqlParameter(Types.VARCHAR)); //GAPAN_NO
			declareParameter(new SqlParameter(Types.VARCHAR)); //BEFORE_SURVEY_YEAR
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
			Bean.setWITH_INFO(rs.getString("WITH_INFO"));
			Bean.setROAD_INFO(rs.getString("ROAD_INFO"));
			Bean.setAR_SEL(rs.getString("AR_SEL"));
			Bean.setAR_TXT(rs.getString("AR_TXT"));
			Bean.setUC_SEL(rs.getString("UC_SEL"));
			Bean.setUC_TXT(rs.getString("UC_TXT"));
			Bean.setFOUND_DATE(rs.getString("FOUND_DATE"));
			Bean.setFT_TYP(rs.getString("FT_TYP"));
			Bean.setFT_SEL(rs.getString("FT_SEL"));
			Bean.setFACIL_L(rs.getString("FACIL_L"));
			Bean.setFACIL_W(rs.getString("FACIL_W"));
			Bean.setFACIL_H(rs.getString("FACIL_H"));
			Bean.setPLACE_H(rs.getString("PLACE_H"));
			Bean.setPLACE_A(rs.getString("PLACE_A"));
			Bean.setCAR_NUM(rs.getString("CAR_NUM"));
			Bean.setCAR_TON(rs.getString("CAR_TON"));
			Bean.setSPECIAL_ST(rs.getString("SPECIAL_ST"));
			Bean.setTAXTATION_AT(rs.getString("TAXTATION_AT"));
			Bean.setMAINTN_OB(rs.getString("MAINTN_OB"));
			Bean.setMT_SEL(rs.getString("MT_SEL"));
			Bean.setDP_SEL(rs.getString("DP_SEL"));
			Bean.setDP_TXT(rs.getString("DP_TXT"));
			Bean.setSG_TYP(rs.getString("SG_TYP"));
			Bean.setSG_SEL(rs.getString("SG_SEL"));
			Bean.setSG_ITM(rs.getString("SG_ITM"));
			Bean.setLIQUOR_SL(rs.getString("LIQUOR_SL"));
			Bean.setLPGAS_US(rs.getString("LPGAS_US"));
			Bean.setOPEN_TIME(rs.getString("OPEN_TIME"));
			Bean.setCLOSE_TIME(rs.getString("CLOSE_TIME"));
			Bean.setMEM_NUM(rs.getString("MEM_NUM"));
			Bean.setPERMIT_DATE(rs.getString("PERMIT_DATE"));
			Bean.setDAY_SALES(rs.getString("DAY_SALES"));
			Bean.setUN_TYP(rs.getString("UN_TYP"));
			Bean.setUN_TXT(rs.getString("UN_TXT"));
			Bean.setNOTES(rs.getString("NOTES"));
			Bean.setTYPE(rs.getString("TYPE"));
			Bean.setSECTION(rs.getString("SECTION"));
			Bean.setOWNER_SET(rs.getString("OWNER_SET"));
			Bean.setTAX_SET(rs.getString("TAX_SET"));
			Bean.setMUL_FROMDATE(rs.getString("MUL_FROMDATE"));
			Bean.setMUL_TODATE(rs.getString("MUL_TODATE"));
			Bean.setHJ_CD(rs.getString("HJ_CD"));
			Bean.setDISUSE_DATE(rs.getString("DISUSE_DATE"));
			Bean.setDISUSE_REASON(rs.getString("DISUSE_REASON"));
			Bean.setDISUSE_MANAGER(rs.getString("DISUSE_MANAGER"));
			Bean.setOLD_SECTION(rs.getString("OLD_SECTION"));
			Bean.setREDUCTION_RATE(rs.getString("REDUCTION_RATE"));
			Bean.setREDUCTION_REASON(rs.getString("REDUCTION_REASON"));
			Bean.setPICKUP_DATE(rs.getString("PICKUP_DATE"));
			Bean.setRETURN_DATE(rs.getString("RETURN_DATE"));
			Bean.setRETURN_YN(rs.getString("RETURN_YN"));
			Bean.setFT_ETC(rs.getString("FT_ETC"));
			Bean.setPICKUP_YN(rs.getString("PICKUP_YN"));
			Bean.setMODIFY_YN(rs.getString("MODIFY_YN"));
			Bean.setSF_VALUE(rs.getString("SF_VALUE"));
			Bean.setHISTORY(rs.getString("HISTORY"));
			Bean.setMAKE_YM(rs.getString("MAKE_YM"));
			Bean.setMUL_POST(rs.getString("MUL_POST"));
			Bean.setCHANGE_YM(rs.getString("CHANGE_YM"));
			Bean.setSURVEY_YEAR(rs.getString("SURVEY_YEAR"));
			Bean.setMANAGE_TYP(rs.getString("MANAGE_TYP"));
			Bean.setGUIDE_DATE(rs.getString("GUIDE_DATE"));
			Bean.setSPECIAL_DATE(rs.getString("SPECIAL_DATE"));
			Bean.setFT_CAT(rs.getString("FT_CAT"));
			Bean.setCAR_NO(rs.getString("CAR_NO"));
			Bean.setREG_SEQ(rs.getString("REG_SEQ"));
			Bean.setREG_NAME(rs.getString("REG_NAME"));
			Bean.setGUGAN_CD(rs.getString("GUGAN_CD"));
			Bean.setSHOP_IMG_NAME(rs.getString("SHOP_IMG"));
			Bean.setSHOP_IMG2_NAME(rs.getString("SHOP_IMG2"));

			
			return Bean;
		}
	}
	
	
	
	// 노점 조사년도 복사  - GAPAN_HEAD 가져오기
    public List getGapanHead(String gapanNo){		
    	GetGapanHead getGapanInfo = new GetGapanHead(getDataSource());
    	
    	System.out.println("gapanNo : " + gapanNo);

 		Object[] values = {
			gapanNo
 		};
 		 
 		return getGapanInfo.execute(values);
	}    

 
	protected class GetGapanHead extends MappingSqlQuery {
		public GetGapanHead(DataSource dataSource) {
			super(dataSource, getMessageSourceAccessor().getMessage(
					"Querys.gapan.admin.select.gapanHead"));
			declareParameter(new SqlParameter(Types.VARCHAR)); //GAPAN_NO
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
			Bean.setADDR_CHECK1(rs.getString("ADDR_CHECK1"));
			Bean.setADDR_CHECK2(rs.getString("ADDR_CHECK2"));
			Bean.setNOTE(rs.getString("NOTE"));
			Bean.setLT_SEL(rs.getString("LT_SEL"));
			Bean.setSI(rs.getString("SI"));
			Bean.setGUN(rs.getString("GUN"));
			Bean.setDONG(rs.getString("DONG"));
			Bean.setRI(rs.getString("RI"));
			Bean.setBON(rs.getString("BON"));
			Bean.setBU(rs.getString("BU"));
			Bean.setTSI(rs.getString("TSI"));
			Bean.setTGUN(rs.getString("TGUN"));
			Bean.setTDONG(rs.getString("TDONG"));
			Bean.setT_RI(rs.getString("T_RI"));
			Bean.setTBON(rs.getString("TBON"));
			Bean.setTBU(rs.getString("TBU"));
			Bean.setTDORO_NM(rs.getString("TDORO_NM"));
			Bean.setTBD_BON(rs.getString("TBD_BON"));
			Bean.setTBD_BU(rs.getString("TBD_BU"));
			Bean.setTBD_NM(rs.getString("TBD_NM"));
			Bean.setTBD_DET_NM(rs.getString("TBD_DET_NM"));
			Bean.setPSI(rs.getString("PSI"));
			Bean.setPGUN(rs.getString("PGUN"));
			Bean.setPDONG(rs.getString("PDONG"));
			Bean.setPRI(rs.getString("PRI"));
			Bean.setPBON(rs.getString("PBON"));
			Bean.setPBU(rs.getString("PBU"));
			Bean.setPTSI(rs.getString("PTSI"));
			Bean.setPTGUN(rs.getString("PTGUN"));
			Bean.setPTDONG(rs.getString("PTDONG"));
			Bean.setPTRI(rs.getString("PTRI"));
			Bean.setPTBON(rs.getString("PTBON"));
			Bean.setPTBU(rs.getString("PTBU"));
			Bean.setPTDORO_NM(rs.getString("PTDORO_NM"));
			Bean.setPTBD_BON(rs.getString("PTBD_BON"));
			Bean.setPTBD_BU(rs.getString("PTBD_BU"));
			Bean.setPTBD_NM(rs.getString("PTBD_NM"));
			Bean.setPTBD_DET_NM(rs.getString("PTBD_DET_NM"));
			Bean.setDORO_NM(rs.getString("DORO_NM"));
			Bean.setBD_BON(rs.getString("BD_BON"));
			Bean.setBD_BU(rs.getString("BD_BU"));
			Bean.setBD_NM(rs.getString("BD_NM"));
			Bean.setBD_DET_NM(rs.getString("BD_DET_NM"));
			Bean.setP_DORO_NM(rs.getString("P_DORO_NM"));
			Bean.setP_BD_BON(rs.getString("P_BD_BON"));
			Bean.setP_BD_BU(rs.getString("P_BD_BU"));
			Bean.setP_BD_NM(rs.getString("P_BD_NM"));
			Bean.setP_BD_DET_NM(rs.getString("P_BD_DET_NM"));

			return Bean;
		}
	}
	
	
	// 노점 조사년도 복사  - GAPAN_HEAD 가져오기
    public List getGapanBase(String gapanNo){		
    	GetGapanBase getGapanBase = new GetGapanBase(getDataSource());
    	
    	System.out.println("gapanNo : " + gapanNo);

 		Object[] values = {
			gapanNo
 		};
 		 
 		return getGapanBase.execute(values);
	}    

 
	protected class GetGapanBase extends MappingSqlQuery {
		public GetGapanBase(DataSource dataSource) {
			super(dataSource, getMessageSourceAccessor().getMessage(
					"Querys.gapan.admin.select.gapanBase"));
			declareParameter(new SqlParameter(Types.VARCHAR)); //GAPAN_NO
		}
		
		protected Object mapRow(ResultSet rs, int rownum) throws SQLException {
			GapanBaseBean Bean = new GapanBaseBean();

			Bean.setGAPAN_NO(rs.getString("GAPAN_NO"));
			Bean.setREG_DATE(rs.getString("REG_DATE"));
			Bean.setUP_DATE(rs.getString("UP_DATE"));
			Bean.setMANAGER(rs.getString("MANAGER"));
			Bean.setFINISH_ID(rs.getString("FINISH_ID"));
			Bean.setCLOSE_DATE(rs.getString("CLOSE_DATE"));
			Bean.setGP_TYPE(rs.getString("GP_TYPE"));

		return Bean;
		}
	}
	
	//********** END_현진_20120306
	
	public String gapanNoReturn(String gapanNo1, String gapanNo2){
		String gapanNo = gapanNo1;
		
		if((gapanNo2!=null)){
			gapanNo2 = gapanNo2.trim();
    		if(!(gapanNo2.equals(""))){
    			gapanNo = gapanNo2; 
    		}
    	}
		return gapanNo;
	}	
	
	
    // 노점 메뉴 끝
	
	//********** BEGIN_현진_20120309
	// 구간명 설정 관련 시작 ==============================================================
    // 구간 설정 화면 카운트  
    public int getSectionCount(String gu_cd){
    	String sql = getMessageSourceAccessor().getMessage("Querys.sectionCode.count");
    	
    	String GU_CD = gu_cd;
    	if(GU_CD == null || GU_CD.equals("") || GU_CD.equals("000")){
    		GU_CD = "%";
    	}
    	Object[] values = {
    		GU_CD
     	};
    	
    	return getJdbcTemplate().queryForInt(sql,values);	
    }
    
    public List getSectionList(String gu_cd, int intCurrentPage, int intCountPerPage){		
    	ExecuteSectionList executeGapanInfoMove = new ExecuteSectionList(getDataSource());
    	
    	String GU_CD = gu_cd;
    	int BEGIN = intCountPerPage * (intCurrentPage-1) + 1;
    	int END = intCountPerPage * intCurrentPage;

    	System.out.println("GU_CD : " + GU_CD);
    	System.out.println("BEGIN : " + BEGIN);
    	System.out.println("END : " + END);
    	
    	if(GU_CD == null || GU_CD.equals("") || GU_CD.equals("000")){
    		GU_CD = "%";
    	}
 		Object[] values = { 			
 			GU_CD, 			
 			BEGIN,
 			END
 		}; 		 		
 		return executeGapanInfoMove.execute(values); 		
	}
     
	protected class ExecuteSectionList extends MappingSqlQuery {
		public ExecuteSectionList(DataSource dataSource) {
			super(dataSource, getMessageSourceAccessor().getMessage(
					"Querys.sectionCode.list"));
			declareParameter(new SqlParameter(Types.VARCHAR)); // GU_CD
			declareParameter(new SqlParameter(Types.VARCHAR)); // paging
			declareParameter(new SqlParameter(Types.VARCHAR)); // paging
		}
		
		protected Object mapRow(ResultSet rs, int rownum) throws SQLException {
			
			SectionBean Bean = new SectionBean();

			Bean.setGU_CD(rs.getString("GU_CD"));
			Bean.setGU_NM(rs.getString("GU_NM"));
			Bean.setGUGAN_CD(rs.getString("GUGAN_CD"));
			Bean.setGUGAN_NAME(rs.getString("GUGAN_NAME"));

			return Bean;
		}
	}
	//********** END_현진_20120309
	//********** BEGIN_현진_20120311
	public boolean setSectionInsert(SectionBean bean){
		try{
			SetSectionInsert setSectionInsert = new SetSectionInsert(getDataSource());
			Object[] values = {
					bean.getGU_CD(),
					bean.getGUGAN_CD(),
					bean.getGUGAN_NAME()
			};
			setSectionInsert.update(values);
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}
		return true;
	}
	
	protected class SetSectionInsert extends SqlUpdate {
		public SetSectionInsert(DataSource dataSource) {
			super(dataSource, getMessageSourceAccessor().getMessage(
					"Querys.sectionCode.insert"));
			declareParameter(new SqlParameter(Types.VARCHAR)); // GU_CD
			declareParameter(new SqlParameter(Types.VARCHAR)); // GUGAN_CD
			declareParameter(new SqlParameter(Types.VARCHAR)); // GUGAN_NAME
		}

	}
	
	public boolean setSectionUpdate(SectionBean bean, String modyGU_CD, String modyGUGAN_CD){
		try{
			SetSectionUpdate setSectionUpdate = new SetSectionUpdate(getDataSource());
			Object[] values = {
					bean.getGU_CD(),
					bean.getGUGAN_CD(),
					bean.getGUGAN_NAME(),
					modyGU_CD,
					modyGUGAN_CD
			};
			setSectionUpdate.update(values);
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}
		return true;
	}
	
	protected class SetSectionUpdate extends SqlUpdate {
		public SetSectionUpdate(DataSource dataSource) {
			super(dataSource, getMessageSourceAccessor().getMessage(
					"Querys.sectionCode.update"));
			declareParameter(new SqlParameter(Types.VARCHAR)); // GU_CD
			declareParameter(new SqlParameter(Types.VARCHAR)); // GUGAN_CD
			declareParameter(new SqlParameter(Types.VARCHAR)); // GUGAN_NAME
			declareParameter(new SqlParameter(Types.VARCHAR)); // GU_CD
			declareParameter(new SqlParameter(Types.VARCHAR)); // GUGAN_CD
		}

	}
	
	public boolean sectionDelete(SectionBean bean){
		try{
			SectionDelete sectionDelete = new SectionDelete(getDataSource());
			Object[] values = {
					bean.getGU_CD(),
					bean.getGUGAN_CD()
			};
			sectionDelete.update(values);
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}
		return true;
		
	}
	
	protected class SectionDelete extends SqlUpdate {
		public SectionDelete(DataSource dataSource) {
			super(dataSource, getMessageSourceAccessor().getMessage(
					"Querys.sectionCode.delete"));
			declareParameter(new SqlParameter(Types.VARCHAR)); // GU_CD
			declareParameter(new SqlParameter(Types.VARCHAR)); // GUGAN_CD
		}

	}	
	
	public List getSectionSelectList(SectionBean bean){		
    	ExecuteSectionSelectList executeSectionSelectList = new ExecuteSectionSelectList(getDataSource());
    	
 		Object[] values = { 			
 			bean.getGU_CD(),
 			bean.getGUGAN_CD()
 		}; 		 		
 		return executeSectionSelectList.execute(values); 		
	}
     
	protected class ExecuteSectionSelectList extends MappingSqlQuery {
		public ExecuteSectionSelectList(DataSource dataSource) {
			super(dataSource, getMessageSourceAccessor().getMessage(
					"Querys.sectionCode.selectList"));
			declareParameter(new SqlParameter(Types.VARCHAR)); // GU_CD
			declareParameter(new SqlParameter(Types.VARCHAR)); // GUGAN_CD

		}
		
		protected Object mapRow(ResultSet rs, int rownum) throws SQLException {
			
			SectionBean Bean = new SectionBean();

			Bean.setGU_CD(rs.getString("GU_CD"));
			Bean.setGU_NM(rs.getString("GU_NM"));
			Bean.setGUGAN_CD(rs.getString("GUGAN_CD"));
			Bean.setGUGAN_NAME(rs.getString("GUGAN_NAME"));

			return Bean;
		}
	}
	//********** END_현진_20120311
	//구간명 설정 관련 끝
	
	//********** BEGIN_현진_20120319
	public boolean changeGapanUpdate(String UPDATE, String SURVEY_YEAR){
		try{
			ChangeGapanUpdate changeGapanUpdate = new ChangeGapanUpdate(getDataSource());
			Object[] values = {
				UPDATE,
				SURVEY_YEAR
			};
			changeGapanUpdate.update(values);
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}
		return true;
	}
	
	protected class ChangeGapanUpdate extends SqlUpdate {
		public ChangeGapanUpdate(DataSource dataSource) {
			super(dataSource, getMessageSourceAccessor().getMessage(
					"Querys.gapanBase.changeGapanUpdate"));
			declareParameter(new SqlParameter(Types.VARCHAR)); 
			declareParameter(new SqlParameter(Types.VARCHAR)); 
		}

	}
	
	
	//********** END_현진_20120319
	
	
	
}