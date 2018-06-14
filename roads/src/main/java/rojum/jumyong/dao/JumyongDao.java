package main.java.rojum.jumyong.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.List;
import java.util.Map;
import javax.sql.DataSource;
import main.java.common.dao.RoadsJdbcDaoSupport;
import main.java.common.util.catUtil.Util;
import main.java.rojum.jumyong.model.AccuseBean;
import main.java.rojum.jumyong.model.ChangeJobBean;
import main.java.rojum.jumyong.model.GapanBaseBean;
import main.java.rojum.jumyong.model.GapanHeadBean;
import main.java.rojum.jumyong.model.GapanInfoBean;
import main.java.rojum.jumyong.model.GuideBean;
import main.java.rojum.jumyong.model.ProductBean;
import main.java.rojum.jumyong.model.ProductTaxBean;
import main.java.rojum.jumyong.model.SaleBean;
import main.java.rojum.jumyong.model.TaxCodeBean;
import main.java.rojum.jumyong.model.jumyongBean;
import main.java.rojum.jumyong.model.DisUseBean;
import main.java.rojum.jumyong.model.SearchBean;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.MappingSqlQuery;
import org.springframework.jdbc.object.SqlUpdate;
import org.springframework.jdbc.support.lob.OracleLobHandler;

public class JumyongDao extends RoadsJdbcDaoSupport implements IJumyongDao {
	private OracleLobHandler oracleLobHandler = null;

	private Util util = new Util();
	
	protected void initDao() throws Exception {
		super.initDao();
		System.out.println("rojum.JumyongDao..");
		oracleLobHandler = new OracleLobHandler();
	}

	
	
	// 새 가판번호 반환
	public	String	executeCheck_Gapanno(String gapanNo){
    	Object[] values = {gapanNo};

    	String sql = getMessageSourceAccessor().getMessage("Querys.rojum.jumyong.getGapanno");	
    	//강남구, 노원구
    	String[] gangnamBj = {"680101", "680106", "680107", "680108", "680118", "350105"};
    	for(int i=0; i<gangnamBj.length; i++){
    		if(gapanNo.contains(gangnamBj[i])){
    			System.out.println("gangnamBj: "  + gangnamBj);
    			sql = getMessageSourceAccessor().getMessage("Querys.rojum.jumyong.getGapanno_gangNam");
    		}
    	}
    	
    	Map Request_Map =getJdbcTemplate().queryForMap(sql, values);		//'_4_0001'의 형식으로 가져온다.
    	gapanNo = gapanNo + Request_Map.get("GAPAN_NO").toString();			//(구코드+법정동코드) + '_4_0001'
    	return gapanNo;
	}
	
	
	 //	GAPAN_BASE 정보 등록
    public	boolean	executeGapan_Base_Register(GapanBaseBean Bean)
	{
    	Gapan_Base_Register gapan_Base_Register = new Gapan_Base_Register(getDataSource());
    	try
		{
    		Object[] values = {
					Bean.getGAPAN_NO(),
					Bean.getREG_DATE(),
					Bean.getUP_DATE(),
					Bean.getMANAGER(),
					Bean.getFINISH_ID(),
					Bean.getCLOSE_DATE(),
					Bean.getGP_TYPE()
			};
    		
    		gapan_Base_Register.update(values);
		}
		catch (Exception e)
		{
			e.printStackTrace();
			return	false;
		}
		
		return	true;
	}
    
    
    class Gapan_Base_Register extends SqlUpdate {
		public Gapan_Base_Register(DataSource dataSource) {

			super(dataSource, getMessageSourceAccessor().getMessage(
					"Querys.rojum.jumyong.Gapan_Base_Register"));

			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));

			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
		

		}
	}
    
    
    
    //가판 운영자, 동업자 정보 등록
    public	boolean	executeGapan_Head_Register(GapanHeadBean Bean)
	{
    	//신규등록 gapan_head insert
    	Gapan_Head_Register gapan_Head_Register = new Gapan_Head_Register(getDataSource());
		try
		{
			Object[] values = {
					Bean.getGAPAN_NO(),
					Bean.getOWNER_NAME(),
					Bean.getOWNER_IDCHK(),
					Bean.getOWNER_SSN(),
					Bean.getOWNER_IMG_NAME(),
					
					Bean.getOWNER_GENDER(),
					Bean.getOWNER_AGE(),
					Bean.getOWNER_TEL(),
					Bean.getOWNER_HP(),
					Bean.getOWNER_POST(),
					
					Bean.getOWNER_ADDR1(),
					Bean.getOWNER_ADDR2(),
					Bean.getOWNER_TOPOST(),        
					Bean.getOWNER_TOADDR1(),       
					Bean.getOWNER_TOADDR2(),       
					
					Bean.getLC_SEL(),              
					Bean.getLC_TXT(),              
					Bean.getRT_SEL(),              
					Bean.getRT_TXT(),              
					Bean.getESTATE_MOVE(),         
					
					Bean.getESTATE_REAL(),         
					Bean.getGP_TYP(),
					Bean.getPARTN_NAME(),          
					Bean.getPT_SEL(),              
					Bean.getPARTN_SSN(),           
					
					Bean.getPARTN_IMG_NAME(),           
					Bean.getPARTN_GENDER(),        
					Bean.getPARTN_AGE(),           
					Bean.getPARTN_TEL(),           
					Bean.getPARTN_HP(),            
					
					Bean.getPARTN_POST(),          
					Bean.getPARTN_ADDR1(),         
					Bean.getPARTN_ADDR2(),         
					Bean.getPARTN_TOPOST(),        
					Bean.getPARTN_TOADDR1(),       
					
					Bean.getPARTN_TOADDR2(),
					Bean.getOWNER_JIBUN(),
					Bean.getOWNER_SAN(),
					Bean.getOWNER_TOJIBUN(),
					Bean.getOWNER_TOSAN(),
					
					Bean.getPARTN_JIBUN(),
					Bean.getPARTN_SAN(),
					Bean.getPARTN_TOJIBUN(),
					Bean.getPARTN_TOSAN(),
					Bean.getADDR_CHECK1(),
					
					Bean.getADDR_CHECK2(),
					Bean.getLT_SEL(),
					Bean.getNOTE(),
					
					Bean.getSI(),
					Bean.getGUN(),
					Bean.getDORO_NM(),
					Bean.getBD_BON(),
					Bean.getBD_BU(),
					Bean.getBD_NM(),
					Bean.getBD_DET_NM(),
					
					Bean.getTOSI(),
					Bean.getTOGUN(),
					Bean.getTODORO_NM(),
					Bean.getTOBD_BON(),
					Bean.getTOBD_BU(),
					Bean.getBD_NM(),
					Bean.getTOBD_DET_NM(),
					
					
			};
			
    		gapan_Head_Register.update(values);
		}
		catch (Exception e)
		{
			e.printStackTrace();
			return	false;
		}
		
		return	true;
    }
    
    
    class Gapan_Head_Register extends SqlUpdate {
		public Gapan_Head_Register(DataSource dataSource) {

			super(dataSource, getMessageSourceAccessor().getMessage("Querys.rojum.jumyong.Gapan_Head_Register"));

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
            
            
            
            ///////////
            
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
        }
    }
	
	
    //	GAPAN_INFO  테이블에 등록
    public	boolean	executeGapan_Info_Register(GapanInfoBean Bean){
    	
    	//신규등록 gapan_info insert
    	Gapan_Info_Register gapan_Info_Register = new Gapan_Info_Register(getDataSource());
    	
		try
		{
			Object[] values = {
					Bean.getGAPAN_NO(),
					Bean.getX_COORD(),
					Bean.getY_COORD(),
					Bean.getGP_TYP(),
					Bean.getPURPOSE_CD(),

					Bean.getWITH_PNU(),
					Bean.getWITH_ADDR(),
					Bean.getSHOP_IMG_NAME(),
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
					Bean.getOWNER_SET(),
					
					Bean.getTAX_SET(),
					Bean.getMUL_FROMDATE(),
					Bean.getMUL_TODATE(),
					Bean.getHJ_CD(),
					Bean.getREDUCTION_RATE(),
					
					Bean.getREDUCTION_REASON(),
					Bean.getSHOP_IMG2_NAME(),
					Bean.getPICKUP_DATE(),
					Bean.getRETURN_DATE(),
					Bean.getFT_ETC(),
					
					Bean.getPICKUP_YN(),
					Bean.getGUIDE_DATE(),
					Bean.getMANAGE_TYP(),
					Bean.getFT_CAT(),
					Bean.getSPECIAL_DATE(),
					
					Bean.getCAR_NO(),
					Bean.getWITH_DORO_NM(),
					Bean.getWITH_BD_BON(),
					Bean.getWITH_BD_BU(),
					Bean.getJIBUN()
					
			};
    		gapan_Info_Register.update(values);
		}
		catch (Exception e)
		{
			e.printStackTrace();
			return	false;
		}
		
		return	true;
    }
    
    class Gapan_Info_Register extends SqlUpdate {
		public Gapan_Info_Register(DataSource dataSource) {

			super(dataSource, getMessageSourceAccessor().getMessage("Querys.rojum.jumyong.Gapan_Info_Register"));
            
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
            
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            
            System.out.println("Querys.rojum.jumyong.Gapan_Info_Register");
        }
    }
	
    // 이력내역 seq 가져오기
	public String getHistoryMaxSeq(ProductBean objProductBean)
			throws DataAccessException {

		Object[] values = { objProductBean.getADMIN_NO() };

		String sql = getMessageSourceAccessor().getMessage(
				"Querys.jumyong.jumyong.getHistoryMaxSeq");
		Map returnNum = null;
		String MaxSeq = "";
		try {
			returnNum = getJdbcTemplate().queryForMap(sql, values);
			MaxSeq = returnNum.get("MAX_SEQ").toString();
		} catch (Exception err) {
			System.out.println(err.toString());
		}
		return MaxSeq;
	}

	// 이력정보 insert
	public ProductBean insertHistoryInfo(ProductBean objProductBean) {
		try {
			
			InsertHistoryInfo insertHistoryInfo = new InsertHistoryInfo(getDataSource());

			Object[] values = { objProductBean.getADMIN_NO(),
					objProductBean.getSEQ(), objProductBean.getGUBUN(),
					objProductBean.getWRITEDATE(), objProductBean.getGUNGE()

					, objProductBean.getSAYU(), objProductBean.getWORK_ID(),
					objProductBean.getGU_CODE(), objProductBean.getWORK_NM()};

			insertHistoryInfo.update(values);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return objProductBean;
	}

	class InsertHistoryInfo extends SqlUpdate {
		public InsertHistoryInfo(DataSource dataSource) {

			super(dataSource, getMessageSourceAccessor().getMessage(
					"Querys.rojum.jumyong.historyInsert"));

			declareParameter(new SqlParameter(Types.VARCHAR)); // ADMIN_NO
			declareParameter(new SqlParameter(Types.VARCHAR)); // SEQ
			declareParameter(new SqlParameter(Types.VARCHAR)); // GUBUN
			declareParameter(new SqlParameter(Types.VARCHAR)); // WRITEDATE
			declareParameter(new SqlParameter(Types.VARCHAR)); // GUNGE

			declareParameter(new SqlParameter(Types.VARCHAR)); // SAYU
			declareParameter(new SqlParameter(Types.VARCHAR)); // WORK_ID
			declareParameter(new SqlParameter(Types.VARCHAR)); // GU_CODE
			declareParameter(new SqlParameter(Types.VARCHAR)); // WORK_NM

		}
	}
	
	// 점용 조회 개수
	public Map getProductListCount(SearchBean objectSearchBean) {
		if (objectSearchBean.getBJ_CD().equals("")|| objectSearchBean.getBJ_CD().equals("00000"))
			objectSearchBean.setBJ_CD("%");
		if (objectSearchBean.getBONBUN().equals(""))
			objectSearchBean.setBONBUN("%");
		if (objectSearchBean.getBUBUN().equals("") || objectSearchBean.getBUBUN().equals("0"))
			objectSearchBean.setBUBUN("%");

		if (objectSearchBean.getNUMBERVALUE().equals(""))
			objectSearchBean.setNUMBERVALUE("%");
		else
			objectSearchBean.setNUMBERVALUE("%"+objectSearchBean.getNUMBERVALUE()+ "%");

		if (objectSearchBean.getJUMYONGNAME().equals(""))
			objectSearchBean.setJUMYONGNAME("%");
		else
			objectSearchBean.setJUMYONGNAME("%"+objectSearchBean.getJUMYONGNAME()+ "%");
		
		if (objectSearchBean.getTAXTAXION_AT().equals(""))
			objectSearchBean.setTAXTAXION_AT("%");
		
		if (objectSearchBean.getMAINTN_OB().equals(""))
			objectSearchBean.setMAINTN_OB("%");
		
		if (objectSearchBean.getMANAGE_TYP().equals(""))
			objectSearchBean.setMANAGE_TYP("%");
		
		if (objectSearchBean.getFT_TYP().equals(""))
			objectSearchBean.setFT_TYP("%");

		Object[] values = {
				objectSearchBean.getSECTION(),
				objectSearchBean.getNUMBERVALUE(),
				objectSearchBean.getJUMYONGNAME(),
				objectSearchBean.getGU_CODE(),
				
				objectSearchBean.getBJ_CD(),
				objectSearchBean.getBONBUN(),
				objectSearchBean.getBUBUN(),
				objectSearchBean.getTAXTAXION_AT(),
				objectSearchBean.getFROMDATE(),
				
				objectSearchBean.getTODATE(),
				objectSearchBean.getMAINTN_OB(),
				objectSearchBean.getMANAGE_TYP(),
				objectSearchBean.getFT_TYP()
				};
		
		String sql = getMessageSourceAccessor().getMessage("Querys.rojum.jumyong.ocupancyListCount");
		return getJdbcTemplate().queryForMap(sql, values);

	}

	// 점용조회
	public List retrieveBoardList(SearchBean objectSearchBean) {
		RetrieveBoardListQuery retrieveBoardListQuery = new RetrieveBoardListQuery(getDataSource());
		
		if (objectSearchBean.getBJ_CD().equals("")|| objectSearchBean.getBJ_CD().equals("00000"))
			objectSearchBean.setBJ_CD("%");
		if (objectSearchBean.getBONBUN().equals(""))
			objectSearchBean.setBONBUN("%");
		if (objectSearchBean.getBUBUN().equals("") || objectSearchBean.getBUBUN().equals("0"))
			objectSearchBean.setBUBUN("%");

		if (objectSearchBean.getNUMBERVALUE().equals(""))
			objectSearchBean.setNUMBERVALUE("%");
		else
			objectSearchBean.setNUMBERVALUE("%"+objectSearchBean.getNUMBERVALUE()+ "%");

		if (objectSearchBean.getJUMYONGNAME().equals(""))
			objectSearchBean.setJUMYONGNAME("%");
		else
			objectSearchBean.setJUMYONGNAME("%"+objectSearchBean.getJUMYONGNAME()+ "%");
		
		if (objectSearchBean.getTAXTAXION_AT().equals(""))
			objectSearchBean.setTAXTAXION_AT("%");
		
		if (objectSearchBean.getMAINTN_OB().equals(""))
			objectSearchBean.setMAINTN_OB("%");
		
		if (objectSearchBean.getMANAGE_TYP().equals(""))
			objectSearchBean.setMANAGE_TYP("%");
		
		if (objectSearchBean.getFT_TYP().equals(""))
			objectSearchBean.setFT_TYP("%");

		Object[] values = {
				objectSearchBean.getSECTION(),
				objectSearchBean.getNUMBERVALUE(),
				objectSearchBean.getJUMYONGNAME(),
				objectSearchBean.getGU_CODE(),
				
				objectSearchBean.getBJ_CD(),
				objectSearchBean.getBONBUN(),
				objectSearchBean.getBUBUN(),
				objectSearchBean.getTAXTAXION_AT(),
				objectSearchBean.getFROMDATE(),
				
				objectSearchBean.getTODATE(),
				objectSearchBean.getMAINTN_OB(),
				objectSearchBean.getMANAGE_TYP(),
				/* 2014.08.10 kny */
				objectSearchBean.getFT_TYP(),
				
				objectSearchBean.getCURRENT_PAGE(),
				objectSearchBean.getCOUNTER_PER_PAGE(),
				objectSearchBean.getCOUNTER_PER_PAGE()
				};
		
		System.out.println("objectSearchBean.getFT_TYP():" + objectSearchBean.getFT_TYP());
		
		return retrieveBoardListQuery.execute(values);
	}
	
	// 점용 조회 및 관리 - 점용 조회
	protected class RetrieveBoardListQuery extends MappingSqlQuery {
		protected RetrieveBoardListQuery(DataSource ds) {
			
			 
			super(ds, getMessageSourceAccessor().getMessage("Querys.rojum.jumyong.ocupancyList"));
			
			//System.out.println("이용 sql id");
			System.out.println("Querys.rojum.jumyong.ocupancyList"); 
			
			declareParameter(new SqlParameter(Types.VARCHAR)); // SECTION
			declareParameter(new SqlParameter(Types.VARCHAR)); // NUMBERVALUE
			declareParameter(new SqlParameter(Types.VARCHAR)); // JUMYONGNAME
			declareParameter(new SqlParameter(Types.VARCHAR)); // GUCODE
			
			declareParameter(new SqlParameter(Types.VARCHAR)); // BJ_CD
			declareParameter(new SqlParameter(Types.VARCHAR)); // BONBUN
			declareParameter(new SqlParameter(Types.VARCHAR)); // BUBUN
			declareParameter(new SqlParameter(Types.VARCHAR)); // TAXTATION_AT
			declareParameter(new SqlParameter(Types.VARCHAR)); // FROMDATE
			
			declareParameter(new SqlParameter(Types.VARCHAR)); // TODATE
			declareParameter(new SqlParameter(Types.VARCHAR)); // MAIN_TN_OB
			declareParameter(new SqlParameter(Types.VARCHAR)); // MANAGE_TYP
			
			declareParameter(new SqlParameter(Types.VARCHAR)); // FT_TYP
			
			declareParameter(new SqlParameter(Types.VARCHAR)); // CURRENT_PAGE
			declareParameter(new SqlParameter(Types.VARCHAR)); // COUNTER_PER_PAGE
			declareParameter(new SqlParameter(Types.VARCHAR)); // COUNTER_PER_PAGE
			 
		}

		protected Object mapRow(ResultSet rs, int rownum) throws SQLException {
			jumyongBean objJumyongBean = new jumyongBean();
			System.out.println("SUM_YEAR = "+objJumyongBean.getSUM_ADJUST());
			System.out.println("SUM_YEAR = "+objJumyongBean.getSUM_ADJUST());
			objJumyongBean.setCOMPLETE_YN(rs.getString("COMPLETE_YN"));
			objJumyongBean.setADMIN_NO(rs.getString("GAPAN_NO"));
			objJumyongBean.setSECTION(rs.getString("SECTION"));
			objJumyongBean.setMANAGE_TYP(rs.getString("MANAGE_TYP"));
			objJumyongBean.setTAX_SET_NAME(rs.getString("TAX_SET"));
			objJumyongBean.setNAME(rs.getString("OWNER_NAME"));
			objJumyongBean.setADDR(rs.getString("ADDR"));
			objJumyongBean.setSI(rs.getString("SI"));
			objJumyongBean.setGUN(rs.getString("GUN"));
			objJumyongBean.setDORO_NM(rs.getString("DORO_NM"));
			
			objJumyongBean.setBD_NM(rs.getString("BD_NM"));
			objJumyongBean.setBD_DET_NM(rs.getString("BD_DET_NM"));
			objJumyongBean.setBD_BON(rs.getString("BD_BON"));
			objJumyongBean.setBD_BU(rs.getString("BD_BU"));
			
			
			objJumyongBean.setUP_DATE(rs.getString("UP_DATE"));
			objJumyongBean.setPLACE_A(rs.getString("PLACE_A"));
			objJumyongBean.setTAXTATION_AT(rs.getString("TAXTATION_AT"));
			objJumyongBean.setMODE1_STATUS(rs.getString("MODE1_STATUS"));
			objJumyongBean.setMODE2_STATUS(rs.getString("MODE2_STATUS"));
			objJumyongBean.setMODE32_STATUS(rs.getString("MODE32_STATUS"));
			objJumyongBean.setMODE33_STATUS(rs.getString("MODE33_STATUS"));
			objJumyongBean.setSALE_STATUS(rs.getString("SALE_STATUS"));
			objJumyongBean.setPICKUP_DATE(rs.getString("PICKUP_DATE"));
			objJumyongBean.setPASS_DAY(rs.getString("PASS_DAY"));
			objJumyongBean.setRETURN_DATE(rs.getString("RETURN_DATE"));
			objJumyongBean.setRETURN_YN(rs.getString("RETURN_YN"));
			objJumyongBean.setMAINTN_OB(rs.getString("MAINTN_OB"));
			objJumyongBean.setOWNER_SSN(rs.getString("OWNER_SSN"));
			
			/* 2014.08.10 kny*/
			objJumyongBean.setFT_TYP(rs.getString("FT_TYP"));
			objJumyongBean.setFT_TYP_NM(rs.getString("FT_TYP_NM"));
			objJumyongBean.setFT_SEL_NM(rs.getString("FT_SEL_NM"));
			
			objJumyongBean.setTOTAL_STATUS(retStatusValue(objJumyongBean.getSECTION(),
					objJumyongBean.getRETURN_YN(),objJumyongBean.getRETURN_DATE(),
					objJumyongBean.getTAXTATION_AT(),objJumyongBean.getMODE1_STATUS(),
					objJumyongBean.getMODE2_STATUS(),objJumyongBean.getMODE32_STATUS(),
					objJumyongBean.getMODE33_STATUS(),objJumyongBean.getSALE_STATUS()));
			
			return objJumyongBean;
		}
	}
	
	
	// 점용 조회 및 관리 - 점용 조회 Excel 변환
	public List retrieveBoardListExcel(SearchBean objectSearchBean) {
		
		RetrieveBoardListExcelQuery retrieveBoardListExcelQuery = new RetrieveBoardListExcelQuery(getDataSource());
		
		if (objectSearchBean.getBJ_CD().equals("")|| objectSearchBean.getBJ_CD().equals("00000"))
			objectSearchBean.setBJ_CD("%");
		if (objectSearchBean.getBONBUN().equals(""))
			objectSearchBean.setBONBUN("%");
		if (objectSearchBean.getBUBUN().equals("") || objectSearchBean.getBUBUN().equals("0"))
			objectSearchBean.setBUBUN("%");

		if (objectSearchBean.getNUMBERVALUE().equals(""))
			objectSearchBean.setNUMBERVALUE("%");
		else
			objectSearchBean.setNUMBERVALUE("%"+objectSearchBean.getNUMBERVALUE()+ "%");

		if (objectSearchBean.getJUMYONGNAME().equals(""))
			objectSearchBean.setJUMYONGNAME("%");
		else
			objectSearchBean.setJUMYONGNAME("%"+objectSearchBean.getJUMYONGNAME()+ "%");
		
		if (objectSearchBean.getTAXTAXION_AT().equals(""))
			objectSearchBean.setTAXTAXION_AT("%");
		
		if (objectSearchBean.getMAINTN_OB().equals(""))
			objectSearchBean.setMAINTN_OB("%");
		
		if (objectSearchBean.getMANAGE_TYP().equals(""))
			objectSearchBean.setMANAGE_TYP("%");

		Object[] values = {
				objectSearchBean.getSECTION(),
				objectSearchBean.getNUMBERVALUE(),
				objectSearchBean.getJUMYONGNAME(),
				objectSearchBean.getGU_CODE(),
				
				objectSearchBean.getBJ_CD(),
				objectSearchBean.getBONBUN(),
				objectSearchBean.getBUBUN(),
				objectSearchBean.getTAXTAXION_AT(),
				objectSearchBean.getFROMDATE(),
				
				objectSearchBean.getTODATE(),
				objectSearchBean.getMAINTN_OB(),
				objectSearchBean.getMANAGE_TYP()
				};
		
		return retrieveBoardListExcelQuery.execute(values);
	}
	
	protected class RetrieveBoardListExcelQuery extends MappingSqlQuery {
		protected RetrieveBoardListExcelQuery(DataSource ds) {
			super(ds, getMessageSourceAccessor().getMessage("Querys.rojum.jumyong.ocupancyList_Excel"));
			declareParameter(new SqlParameter(Types.VARCHAR)); // SECTION
			declareParameter(new SqlParameter(Types.VARCHAR)); // NUMBERVALUE
			declareParameter(new SqlParameter(Types.VARCHAR)); // JUMYONGNAME
			declareParameter(new SqlParameter(Types.VARCHAR)); // GUCODE
			
			declareParameter(new SqlParameter(Types.VARCHAR)); // BJ_CD
			declareParameter(new SqlParameter(Types.VARCHAR)); // BONBUN
			declareParameter(new SqlParameter(Types.VARCHAR)); // BUBUN
			declareParameter(new SqlParameter(Types.VARCHAR)); // TAXTATION_AT
			declareParameter(new SqlParameter(Types.VARCHAR)); // FROMDATE
			
			declareParameter(new SqlParameter(Types.VARCHAR)); // TODATE
			declareParameter(new SqlParameter(Types.VARCHAR)); // MAIN_TN_OB
			declareParameter(new SqlParameter(Types.VARCHAR)); // MANAGE_TYP

		}

		protected Object mapRow(ResultSet rs, int rownum) throws SQLException {
			jumyongBean objJumyongBean = new jumyongBean();

			objJumyongBean.setCOMPLETE_YN(rs.getString("COMPLETE_YN"));
			objJumyongBean.setADMIN_NO(rs.getString("GAPAN_NO"));
			objJumyongBean.setSECTION(rs.getString("SECTION"));
			objJumyongBean.setMANAGE_TYP(rs.getString("MANAGE_TYP"));
			objJumyongBean.setFT_TYP_NM(rs.getString("FT_TYP_NM"));
			objJumyongBean.setFT_SEL_NM(rs.getString("FT_SEL_NM"));
			objJumyongBean.setTAX_SET_NAME(rs.getString("TAX_SET"));
			objJumyongBean.setNAME(rs.getString("OWNER_NAME"));
			objJumyongBean.setADDR(rs.getString("ADDR"));
			objJumyongBean.setUP_DATE(rs.getString("UP_DATE"));
			objJumyongBean.setPLACE_A(rs.getString("PLACE_A"));
			objJumyongBean.setTAXTATION_AT(rs.getString("TAXTATION_AT"));
			objJumyongBean.setMODE1_STATUS(rs.getString("MODE1_STATUS"));
			objJumyongBean.setMODE2_STATUS(rs.getString("MODE2_STATUS"));
			objJumyongBean.setMODE32_STATUS(rs.getString("MODE32_STATUS"));
			objJumyongBean.setMODE33_STATUS(rs.getString("MODE33_STATUS"));
			objJumyongBean.setSALE_STATUS(rs.getString("SALE_STATUS"));
			objJumyongBean.setPICKUP_DATE(rs.getString("PICKUP_DATE"));
			objJumyongBean.setPASS_DAY(rs.getString("PASS_DAY"));
			objJumyongBean.setRETURN_DATE(rs.getString("RETURN_DATE"));
			objJumyongBean.setRETURN_YN(rs.getString("RETURN_YN"));
			objJumyongBean.setMAINTN_OB(rs.getString("MAINTN_OB"));
			objJumyongBean.setOWNER_SSN(rs.getString("OWNER_SSN"));
			
			 
			
			objJumyongBean.setTOTAL_STATUS(retStatusValue(objJumyongBean.getSECTION(),
					objJumyongBean.getRETURN_YN(),objJumyongBean.getRETURN_DATE(),
					objJumyongBean.getTAXTATION_AT(),objJumyongBean.getMODE1_STATUS(),
					objJumyongBean.getMODE2_STATUS(),objJumyongBean.getMODE32_STATUS(),
					objJumyongBean.getMODE33_STATUS(),objJumyongBean.getSALE_STATUS()));
			System.out.println("Querys.rojum.jumyong.ocupancyList_Excel");
			return objJumyongBean;
		}
	}

	// 산출물 리스트
	public List ProductList(int intCurPage, int intCount, String adminNo, String cal_mode) throws DataAccessException {
		
		ProductListQuery productListQuery = new ProductListQuery(getDataSource());
		
		System.out.println("ProductList]Same retrieve list..??");
		Object[] values = { 
				adminNo,
				cal_mode,
				new Integer(intCurPage),
				new Integer(intCount),
				new Integer(intCount)
				};
		
		for(int i = 0 ; i < values.length ; i++){
			System.out.println("::ProductList::" + values[i]);
		}

		System.out.println("Jumyong dao ProductList");
		
		return productListQuery.execute(values);
	}
	
	// 산출물 리스트

	protected class ProductListQuery extends MappingSqlQuery {
		protected ProductListQuery(DataSource ds) {
			super(ds, getMessageSourceAccessor().getMessage(
					"Querys.rojum.jumyong.productList"));
			System.out.println("이용 sql id");
			System.out.println("Querys.rojum.jumyong.productList");
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.INTEGER));
			declareParameter(new SqlParameter(Types.INTEGER));
			declareParameter(new SqlParameter(Types.INTEGER));

		}

		protected Object mapRow(ResultSet rs, int rownum) throws SQLException {
			ProductBean objProductBean = new ProductBean();

			objProductBean.setAREA_AFTER(rs.getString("AREA_AFTER"));
			objProductBean.setRATE(String.valueOf(rs.getFloat("RATE")));
			objProductBean.setLICENSE_TAX(rs.getString("LICENSE_TAX"));
			objProductBean.setSUM_YEAR(rs.getString("SUM_YEAR"));
			objProductBean.setYEAR(rs.getString("YEAR"));
			objProductBean.setPERIOD(rs.getString("PERIOD"));
			objProductBean.setSEQ(rs.getString("SEQ"));
			objProductBean.setPRICE(rs.getString("PRICE"));
			objProductBean.setFROMDATE(rs.getString("FROMDATE"));
			objProductBean.setTODATE(rs.getString("TODATE"));
			objProductBean.setSUM_ADJUST(rs.getString("SUM_ADJUST"));
			objProductBean.setSUM_LASTYEAR(rs.getString("SUM_LASTYEAR"));
			objProductBean.setSUM(rs.getString("SUM"));
			objProductBean.setUP_DATE(rs.getString("UP_DATE"));
			objProductBean.setFORM_ADJUST(rs.getString("FORM_ADJUST"));
			objProductBean.setPRICE(rs.getString("PRICE"));
			
			System.out.println("Querys.rojum.jumyong.productList rojum.jumyongDao");
			return objProductBean;
		}
	}
	

	// 산출물 개수
	public int getProductListCount(String adminNum,String cal_mode) throws DataAccessException {

		Object[] values = { adminNum,cal_mode };
		String sql = getMessageSourceAccessor().getMessage(
				"Querys.rojum.jumyong.productCount");
		int returnNum = getJdbcTemplate().queryForInt(sql, values);
		// System.out.println("count2=" + returnNum + " " + adminNum);

		return returnNum;
	}
	
	
	

	// 산출물 개별 정보
	public ProductBean productInfo(String adminNo, String seq) {
		
		ProductInfoQuery productInfoQuery = new ProductInfoQuery(getDataSource());
		
		Object[] values = { adminNo, seq };
		
		ProductBean pb = new ProductBean();
		try {
			pb = (ProductBean) productInfoQuery.execute(values).get(0);

		} catch (Exception err) {
			System.out.println(err.toString());
		}
		return pb;
	}
	
	// 산출물 개별 정보
	protected class ProductInfoQuery extends MappingSqlQuery {
		protected ProductInfoQuery(DataSource ds) {
			super(ds, getMessageSourceAccessor().getMessage(
					"Querys.rojum.jumyong.calSelectbyYear"));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));

		}

		protected Object mapRow(ResultSet rs, int rownum) throws SQLException {

			ProductBean objProductBean = new ProductBean();
			
			objProductBean.setBUGWA_YN(rs.getString("BUGWA_YN"));
			objProductBean.setTAX_YN(rs.getString("TAX_YN"));
			objProductBean.setADMIN_NO(rs.getString("GAPAN_NO"));
			objProductBean.setGAPAN_NO(rs.getString("GAPAN_NO"));
			objProductBean.setYEAR(rs.getString("YEAR"));
			objProductBean.setPRICE(rs.getString("PRICE"));
			objProductBean.setAREA_AFTER(rs.getString("AREA_AFTER"));
			objProductBean.setRATE(String.valueOf(rs.getFloat("RATE")));
			objProductBean.setFROMDATE(rs.getString("FROMDATE"));
			objProductBean.setTODATE(rs.getString("TODATE"));
			objProductBean.setSUM_LASTYEAR(rs.getString("SUM_LASTYEAR"));
			objProductBean.setSUM_YEAR(rs.getString("SUM_YEAR"));
			objProductBean.setFORM(rs.getString("FORM"));
			objProductBean.setFORM_ADJUST(rs.getString("FORM_ADJUST"));
			objProductBean.setSUM_ADJUST(rs.getString("SUM_ADJUST"));
			objProductBean.setLICENSE_TAX(rs.getString("LICENSE_TAX"));
			objProductBean.setSEQ(rs.getString("SEQ"));
			objProductBean.setPERIOD(rs.getString("PERIOD"));
			objProductBean.setADJUSTMENT(rs.getString("ADJUSTMENT"));
			objProductBean.setSURCHARGE_RATE(rs.getString("SURCHARGE_RATE"));
			objProductBean.setFIRST_SEQ(rs.getString("FIRST_SEQ"));
			objProductBean.setPREV_SEQ(rs.getString("PREV_SEQ"));
			objProductBean.setCAL_SUM_SEQ(rs.getString("CAL_SUM_SEQ"));
			objProductBean.setSUM(rs.getString("SUM"));
			objProductBean.setREDUCTION_RATE(rs.getString("REDUCTION_RATE"));
			objProductBean.setREDUCTION_REASON(rs.getString("REDUCTION_REASON"));
			objProductBean.setVAT(rs.getString("VAT"));
			objProductBean.setTAX_SEQ(rs.getString("TAX_SEQ"));
			objProductBean.setTAX_YN(rs.getString("TAX_YN"));
			objProductBean.setTAX_GUBUN(rs.getString("TAX_GUBUN"));
			objProductBean.setTAX_CD(rs.getString("TAX_CD"));
			objProductBean.setLIVE(rs.getString("LIVE"));
			objProductBean.setTAXPAYER_SET(rs.getString("TAXPAYER_SET"));
			objProductBean.setOBJ_SET(rs.getString("OBJ_SET"));
			objProductBean.setSIGU_CD(rs.getString("SIGU_CD"));
			objProductBean.setDEPT_CD(rs.getString("DEPT_CD"));
			objProductBean.setADD_SET(rs.getString("ADD_SET"));
			objProductBean.setADD_YN(rs.getString("ADD_YN"));
			objProductBean.setSUBUSEO_CD(rs.getString("SUBUSEO_CD"));
			objProductBean.setOCR_BUSEO_CD(rs.getString("OCR_BUSEO_CD"));
			objProductBean.setOCR_SIGU_CD(rs.getString("OCR_SIGU_CD"));
			
			objProductBean.setTAX_DATE(rs.getString("TAX_DATE"));
			objProductBean.setINDATE(rs.getString("INDATE"));
			objProductBean.setOVERDATE(rs.getString("OVERDATE"));
			System.out.println("Querys.rojum.jumyong.calSelectbyYear");

			return objProductBean;

		}
	}
	
	

	// 산출물 작년도 점용료
	public int getSum_LastYear(String adminNum, String year)
			throws DataAccessException {
		Object[] values = { adminNum, year };
		String sql = getMessageSourceAccessor().getMessage(
				"Querys.rojum.jumyong.getSum_LastYear");
		int returnNum = getJdbcTemplate().queryForInt(sql, values);
		// System.out.println("count=" + returnNum + adminNum);
		return returnNum;
	}

	// 산출물 입력
	public ProductBean insertProduct(ProductBean objProductBean) {
		CalInsert2 calInsert2 = new CalInsert2(getDataSource());
		try {
			if (objProductBean.getFROMDATE() == null
					|| objProductBean.getFROMDATE().equals(""))
				objProductBean.setFROMDATE(" ");

			if (objProductBean.getTODATE() == null
					|| objProductBean.getTODATE().equals(""))
				objProductBean.setTODATE(" ");

			if (objProductBean.getPREV_SEQ() == null
					|| objProductBean.getPREV_SEQ().equals(""))
				objProductBean.setPREV_SEQ("0");

			int i;

			if (objProductBean.getPREV_SEQ() == null|| objProductBean.getPREV_SEQ().equals(""))
				objProductBean.setCAL_STATUS("2"); // 1. 산출전 2. 산출후

				Object[] values = {
						objProductBean.getGAPAN_NO(),
						objProductBean.getYEAR(),
						objProductBean.getPRICE(),
						objProductBean.getFROMDATE(),
						objProductBean.getTODATE(),
						
						objProductBean.getAREA_AFTER(),
						objProductBean.getAREA_AFTER(),
						objProductBean.getRATE(),
						objProductBean.getSUM_LASTYEAR(),
						objProductBean.getSUM_YEAR(),
						
						objProductBean.getSUM_ADJUST(),
						objProductBean.getFORM_ADJUST(),
						objProductBean.getFORM(),
						objProductBean.getLICENSE_TAX(),
						objProductBean.getPERIOD(),
						
						objProductBean.getVAT(),
						objProductBean.getADJUSTMENT(),
						objProductBean.getREDUCTION_RATE(),
						objProductBean.getREDUCTION_REASON(),
						objProductBean.getSURCHARGE_RATE(),
						
						objProductBean.getUSE_SECTION(),
						objProductBean.getCAL_SUM_SEQ(),
						objProductBean.getPREV_SEQ(),
						objProductBean.getUP_DATE(),
						objProductBean.getCAL_MODE()
						};

				for (int j = 0; j < values.length; j++)
					System.out.println(j + ":" + values[j]);

				i = calInsert2.update(values);
				

		} catch (Exception e) {
			System.out.println(e.toString());
			e.printStackTrace();
		}
		return objProductBean;
	}
	
	// 산출물 입력
	class CalInsert2 extends SqlUpdate {
		public CalInsert2(DataSource dataSource) {

			super(dataSource, getMessageSourceAccessor().getMessage(
					"Querys.rojum.jumyong.calInsert2"));
			declareParameter(new SqlParameter(Types.VARCHAR)); // getADMIN_NO
			declareParameter(new SqlParameter(Types.VARCHAR)); // getYEAR
			declareParameter(new SqlParameter(Types.VARCHAR)); // getPRICE
			declareParameter(new SqlParameter(Types.VARCHAR)); // getFROMDATE
			declareParameter(new SqlParameter(Types.VARCHAR)); // getTODATE
			
			declareParameter(new SqlParameter(Types.VARCHAR)); // getAREA_AFTER
			declareParameter(new SqlParameter(Types.VARCHAR)); // getAREA_AFTER
			declareParameter(new SqlParameter(Types.VARCHAR)); // getRATE
			declareParameter(new SqlParameter(Types.VARCHAR)); // getSUM_LASTYEAR
			declareParameter(new SqlParameter(Types.VARCHAR)); // getSUM_YEAR
			
			declareParameter(new SqlParameter(Types.VARCHAR)); // getSUM_ADJUST
			declareParameter(new SqlParameter(Types.VARCHAR)); // getFORM_ADJUST
			declareParameter(new SqlParameter(Types.VARCHAR)); // getFORM
			declareParameter(new SqlParameter(Types.VARCHAR)); // getLICENSE_TAX
			declareParameter(new SqlParameter(Types.VARCHAR)); // getPERIOD
			
			declareParameter(new SqlParameter(Types.VARCHAR)); // VAT
			declareParameter(new SqlParameter(Types.VARCHAR)); // ADJUSTMENT
			declareParameter(new SqlParameter(Types.VARCHAR)); // reduction_rate
			declareParameter(new SqlParameter(Types.VARCHAR)); // reduction_reason
			declareParameter(new SqlParameter(Types.VARCHAR)); // SURCHARGE_RATE
			
			declareParameter(new SqlParameter(Types.VARCHAR)); // USE_SECTION(정기,수시)
			declareParameter(new SqlParameter(Types.VARCHAR)); // CAL_SUM_SEQ
			declareParameter(new SqlParameter(Types.VARCHAR)); // PREV_SEQ
			declareParameter(new SqlParameter(Types.VARCHAR)); // UP_DATE
			declareParameter(new SqlParameter(Types.VARCHAR)); // CAL_MODE
		}
	}


	// 산출물 최대seq 구하기
	public int getMaxSeq(String admin_no, String year)
			throws DataAccessException {

		Object[] values = { admin_no, year };
		String sql = getMessageSourceAccessor().getMessage(
				"Querys.rojum.jumyong.getMaxSeq");

		try {
			return getJdbcTemplate().queryForInt(sql, values);
		} catch (Exception err) {
			return 1;
		}
	}

	// 산출물 수정
	public ProductBean updateProduct(ProductBean objProductBean) {
		try {
			
			ProductUpdate productUpdate = new ProductUpdate(getDataSource());

			if (objProductBean.getFROMDATE() == null
					|| objProductBean.getFROMDATE().equals(""))
				objProductBean.setFROMDATE(" ");

			if (objProductBean.getTODATE() == null
					|| objProductBean.getTODATE().equals(""))
				objProductBean.setTODATE(" ");

			Object[] values = {
					objProductBean.getYEAR(), // year
					objProductBean.getPRICE(), // price
					objProductBean.getFROMDATE(), // fromdate
					objProductBean.getTODATE(), // todate
					objProductBean.getAREA_AFTER(), // area_after
					
					objProductBean.getRATE(), // rate
					objProductBean.getSUM_LASTYEAR(), // sum_lastyear
					//********** BEGIN_현진_20120218
					//objProductBean.getSUM_YEAR(), // sum_year
					//objProductBean.getSUM_ADJUST(), // sum_adjust
					objProductBean.getSUM_ADJUST(), // sum_adjust
					objProductBean.getSUM_YEAR(), // sum_year
					//********** END_현진_20120218
					objProductBean.getVAT(), // vat
					
					objProductBean.getFORM_ADJUST(), // form_adjust
					objProductBean.getFORM(), // form
					objProductBean.getPERIOD(), // period
					objProductBean.getADJUSTMENT(), // adjustment
					objProductBean.getLICENSE_TAX(), // license_tax
					
					objProductBean.getREDUCTION_RATE(),
					objProductBean.getREDUCTION_REASON(), //
					objProductBean.getSURCHARGE_RATE(), // surcharge_rate
					objProductBean.getUP_DATE(),
					objProductBean.getGAPAN_NO(),
					
					objProductBean.getSEQ() // seq

			};

			productUpdate.update(values);

		} catch (Exception e) {
			System.out.println(e.toString());
			e.printStackTrace();
		}
		return objProductBean;
	}
	
	// 산출물 수정
	class ProductUpdate extends SqlUpdate {
		public ProductUpdate(DataSource dataSource) {
			super(dataSource, getMessageSourceAccessor().getMessage(
					"Querys.rojum.jumyong.productUpdate"));
			declareParameter(new SqlParameter(Types.VARCHAR)); // YEAR = ?, \
			declareParameter(new SqlParameter(Types.VARCHAR)); // PRICE = ?, \
			declareParameter(new SqlParameter(Types.VARCHAR)); // FROMDATE = ?,
			declareParameter(new SqlParameter(Types.VARCHAR)); // TODATE = ?, \
			declareParameter(new SqlParameter(Types.VARCHAR)); // AREA_AFTER =
			
			declareParameter(new SqlParameter(Types.VARCHAR)); // RATE = ?, \
			declareParameter(new SqlParameter(Types.VARCHAR)); // SUM_LASTYEAR
			declareParameter(new SqlParameter(Types.VARCHAR)); // SUM_ADJUST =
			declareParameter(new SqlParameter(Types.VARCHAR)); // SUM_YEAR = ?,
			declareParameter(new SqlParameter(Types.VARCHAR)); // VAT = ?, \
			
			declareParameter(new SqlParameter(Types.VARCHAR)); // FORM_ADJUST =
			declareParameter(new SqlParameter(Types.VARCHAR)); // FORM = ? , \
			declareParameter(new SqlParameter(Types.VARCHAR)); // PERIOD= ? \
			declareParameter(new SqlParameter(Types.VARCHAR)); // ADJUSTMENT
			declareParameter(new SqlParameter(Types.VARCHAR)); // LICENSE_TAX
			
			declareParameter(new SqlParameter(Types.VARCHAR)); // AND
			declareParameter(new SqlParameter(Types.VARCHAR)); // AND
			declareParameter(new SqlParameter(Types.VARCHAR)); // AND
			declareParameter(new SqlParameter(Types.VARCHAR)); // AND UP_DATE
			declareParameter(new SqlParameter(Types.VARCHAR)); // AND GAPAN_NO = ?
			
			declareParameter(new SqlParameter(Types.VARCHAR)); // AND SEQ = ?

		}
	}

	public String getProductRate(String add_sum) throws DataAccessException {
		Object[] values = { add_sum };
		String sql = getMessageSourceAccessor().getMessage(
				"Querys.rojum.jumyong.getProductRate");
		Map returnNum = getJdbcTemplate().queryForMap(sql, values);
		return returnNum.get("CNT").toString();
	}

	// 면허세 구하기
	public int getLicenseTax(float area) throws DataAccessException {
		Object[] values = { new Float(area), new Float(area) };
		String sql = getMessageSourceAccessor().getMessage(
				"Querys.rojum.jumyong.getLicenseTax");
		Map returnNum = getJdbcTemplate().queryForMap(sql, values);
		return getJdbcTemplate().queryForInt(sql, values);
	}

	// 초기화 데이타 구하기
	public Map getInitCal(String gapanNo,String cal_mode) throws DataAccessException {

		Object[] values = {cal_mode,gapanNo};
		String sql = getMessageSourceAccessor().getMessage("Querys.rojum.jumyong.getInitCal");
		
		Map retVal = null;
		try {
			retVal = getJdbcTemplate().queryForMap(sql, values);
		} catch (Exception err) {
			err.printStackTrace();
		}
		
		return retVal;
	}
	
	// 점용구분 구하기
	public Map getSection(String admin_no)
			throws DataAccessException {

		Object[] values = { admin_no};
		Map returnNum = null;
		try {

			String sql = getMessageSourceAccessor().getMessage(
					"Querys.rojum.jumyong.getSection");
			returnNum = getJdbcTemplate().queryForMap(sql, values);

		} catch (Exception e) {
			System.out.println("getSection ERROR ERROR :" + e.toString());

		}

		return returnNum;
	}
	
	// 점용구분 구하기
	public Map getTaxtationAt(String gapanNo) throws DataAccessException {

		Object[] values = {gapanNo};
		Map returnVal = null;
		try {

			String sql = getMessageSourceAccessor().getMessage("Querys.rojum.jumyong.getTaxtationAt");
			returnVal = getJdbcTemplate().queryForMap(sql, values);

		} catch (Exception e) {
			System.out.println("getTaxtationAt ERROR ERROR :" + e.toString());
		}

		return returnVal;
	}

	// 검토여부 설정
	public void SetCheckYn(String adminNo) {
		SetCheckYN setCheckYN = new SetCheckYN(getDataSource());
		Object[] values = { adminNo };
		setCheckYN.update(values);
	}
	
	// 검토여부 설정
	class SetCheckYN extends SqlUpdate {
		public SetCheckYN(DataSource dataSource) {
			super(dataSource, getMessageSourceAccessor().getMessage(
					"Querys.rojum.jumyong.setCheck_Yn"));
			declareParameter(new SqlParameter(Types.VARCHAR));
		}
	}

	// 검토여부 설정
	public void SetTaxYn(String adminNo) {
		SetTaxYN setTaxYN = new SetTaxYN(getDataSource());
		Object[] values = { adminNo };
		setTaxYN.update(values);
	}
	
	// 부과여부 설정
	class SetTaxYN extends SqlUpdate {
		public SetTaxYN(DataSource dataSource) {
			super(dataSource, getMessageSourceAccessor().getMessage(
					"Querys.rojum.jumyong.setTax_Yn"));
			declareParameter(new SqlParameter(Types.VARCHAR));
		}
	}

	// 무단점용 총액
	public int getTotalSum(String adminNo) throws DataAccessException {
		Object[] values = { adminNo };
		String sql = getMessageSourceAccessor().getMessage(
				"Querys.rojum.jumyong.getTotalSum");
		int returnNum = getJdbcTemplate().queryForInt(sql, values);
		return returnNum;
	}

	// 무단 점용 넓이
	public int getMudanArea(String adminNo) throws DataAccessException {
		Object[] values = { adminNo };
		String sql = getMessageSourceAccessor().getMessage(
				"Querys.rojum.jumyong.getMudanArea");
		int returnNum = getJdbcTemplate().queryForInt(sql, values);
		return returnNum;
	}


	// 무단 해당 연도 자료 있는지.
	public int get_calculationCount_mudan(String adminNum, String year)
			throws DataAccessException {
		Object[] values = { adminNum, year };
		String sql = getMessageSourceAccessor().getMessage(
				"Querys.rojum.jumyong.get_calculationCount_mudan");
		return getJdbcTemplate().queryForInt(sql, values);
	}


	// 해지////////////////////////////////////////////////////////////////////////////////////////////
	public DisUseBean disUseInfo(String admin_no) {
		Object[] values = { admin_no};
		DisUseBean disUseBean = new DisUseBean();
		try {
			
			DisUseInfoQuery disUseInfoQuery = new DisUseInfoQuery(getDataSource());

			disUseBean = (DisUseBean) disUseInfoQuery.execute(values).get(0);

		} catch (Exception e) {
			System.out.println("disUseInfo Error : " + e.toString());
		}
		return disUseBean;
	}
	
	protected class DisUseInfoQuery extends MappingSqlQuery {
		protected DisUseInfoQuery(DataSource ds) {
			super(ds, getMessageSourceAccessor().getMessage(
					"Querys.rojum.jumyong.disUseInfo"));
			declareParameter(new SqlParameter(Types.VARCHAR));
		}

		protected Object mapRow(ResultSet rs, int rownum) throws SQLException {
			DisUseBean objDisUseBean = new DisUseBean();

			objDisUseBean.setDISUSE_DATE(rs.getString("DISUSE_DATE"));
			objDisUseBean.setDISUSE_MANAGER(rs.getString("DISUSE_MANAGER"));
			objDisUseBean.setDISUSE_REASON(rs.getString("DISUSE_REASON"));

			System.out.println("DisUseInfoQuery : "
					+ rs.getString("DISUSE_DATE"));
			System.out.println("DisUseInfoQuery : "
					+ rs.getString("DISUSE_MANAGER"));
			System.out.println("DisUseInfoQuery : "
					+ rs.getString("DISUSE_REASON"));

			return objDisUseBean;
		}
	}

	// 해지 업데이트
	public boolean disUseUpdate(DisUseBean disUseBean) {
		DisUseUpdate disUseUpdate = new DisUseUpdate(getDataSource());
		Object[] values = { 
				disUseBean.getSECTION(),
				util.Date_Cut(disUseBean.getDISUSE_DATE()),
				disUseBean.getDISUSE_REASON(), disUseBean.getDISUSE_MANAGER(),
				disUseBean.getOLD_SECTION(), disUseBean.getADMIN_NO()};

		int returnVal = disUseUpdate.update(values);

		if (returnVal == 1)
			return (true);
		else
			return (false);
	}
	
	class DisUseUpdate extends SqlUpdate {
		public DisUseUpdate(DataSource dataSource) {
			super(dataSource, getMessageSourceAccessor().getMessage(
					"Querys.rojum.jumyong.disUseUpdate"));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));

			declareParameter(new SqlParameter(Types.VARCHAR));
		}
	}

	// CALCULATION_INFO 시퀀스 증가값
	public int getCalculationSequence() {

		String sql = getMessageSourceAccessor().getMessage(
				"Querys.rojum.jumyong.GetCalculationSequence");

		int result = getJdbcTemplate().queryForInt(sql);

		// System.out.println(result);

		return result;
	}

	// 산출물 입력
	public int Cal_Sum_InfoInsert(ProductBean objProductBean) {
		int i = 0;
		
		Cal_Sum_InfoInsert cal_Sum_InfoInsert = new Cal_Sum_InfoInsert(getDataSource());
		
		try {
			
			System.out.println("objProductBean.getSUM_ADJUST() ="+objProductBean.getSUM_ADJUST());
			System.out.println("rojum.jumyong. jumyongDao Cal_Sum_InfoInsert");
			System.out.println(">>>>>>1");
			System.out.println("objProductBean.getTAX_SEQ() : " + objProductBean.getTAX_SEQ());
			Object[] values = { 
					objProductBean.getGAPAN_NO() // ADMIN_NO
					, objProductBean.getSEQ() // SEQ
					, objProductBean.getTAX_SEQ() // TAX_SEQ
					, objProductBean.getYEAR() // YEAR
					, objProductBean.getAREA_AFTER() // AREA
					, objProductBean.getSUM_ADJUST() // SUM_ADJUST
					, objProductBean.getVAT() // VAT
					, objProductBean.getREDUCTION_RATE() // REDUCTION_RATE
					, objProductBean.getSUM() // SUM
					, objProductBean.getUSE_SECTION() // 2수시(USE_SECTION)/1계속
					, objProductBean.getREDUCTION_REASON() // REDUCTION_REASON
					, objProductBean.getPRICE() // price(공시지가)
					, objProductBean.getRATE() // 요율
					, objProductBean.getFORM_ADJUST() // 산출식
					, objProductBean.getFROMDATE() // fromdate
					, objProductBean.getTODATE() // todate
					, objProductBean.getCAL_MODE()
			};

			i = cal_Sum_InfoInsert.update(values);
		} catch (Exception e) {
			System.out.println(e.toString());
			e.printStackTrace();
		}
		return i;
	}
	
	class Cal_Sum_InfoInsert extends SqlUpdate {
		public Cal_Sum_InfoInsert(DataSource dataSource) {
			super(dataSource, getMessageSourceAccessor().getMessage("Querys.rojum.jumyong.cal_sum_infoInsert"));
			declareParameter(new SqlParameter(Types.VARCHAR)); // getADMIN_NO
			declareParameter(new SqlParameter(Types.VARCHAR)); // seq
			declareParameter(new SqlParameter(Types.VARCHAR)); // tax_seq
			declareParameter(new SqlParameter(Types.VARCHAR)); // getYEAR
			declareParameter(new SqlParameter(Types.VARCHAR)); // getAREA
			declareParameter(new SqlParameter(Types.VARCHAR)); // SUM_ADJUST
			declareParameter(new SqlParameter(Types.VARCHAR)); // VAT
			declareParameter(new SqlParameter(Types.VARCHAR)); // reduction_rate
			declareParameter(new SqlParameter(Types.VARCHAR)); // SUM
			declareParameter(new SqlParameter(Types.VARCHAR)); // USE_SECTION(정기1,수시2)
			declareParameter(new SqlParameter(Types.VARCHAR)); // reduction_reason
			declareParameter(new SqlParameter(Types.VARCHAR)); // price
			declareParameter(new SqlParameter(Types.VARCHAR)); // rate
			declareParameter(new SqlParameter(Types.VARCHAR)); // form_adjust
			declareParameter(new SqlParameter(Types.VARCHAR)); // fromdate
			declareParameter(new SqlParameter(Types.VARCHAR)); // todate
			declareParameter(new SqlParameter(Types.VARCHAR)); // CAL_MODE
		}
	}
	

	// CAL_SUM_INFO 시퀀스 증가값
	public int getCal_Sum_Seq() {

		String sql = getMessageSourceAccessor().getMessage(
				"Querys.rojum.jumyong.GetCAL_SUM_SEQ");
		int result = getJdbcTemplate().queryForInt(sql);
		return result;
	}

	// CAL_SUM_INFO 수정
	public int CalSumUpdate(ProductBean objProductBean) {
		
		CalSumUpdate calSumUpdate = new CalSumUpdate(getDataSource());
		System.out.println("[lkh]Querys.rojum.jumyong.cal_sum_infoUpdate");
		System.out.println("Querys.rojum.jumyong.cal_sum_infoUpdate");
		System.out.println("Querys.rojum.jumyong.cal_sum_infoUpdate");
		Object[] values = {
				objProductBean.getYEAR(), // YEAR
				objProductBean.getAREA_AFTER(), // AREA
				objProductBean.getSUM_ADJUST(), // SUM_ADJUST
				objProductBean.getVAT(), // VAT
				//********** BEGIN_현진_20120218
				objProductBean.getSUM_ADJUST(), // SUM
				//objProductBean.getSUM_YEAR(),				
				//********** END_현진_20120218
				objProductBean.getUSE_SECTION(), // USE_SECTION
				objProductBean.getPRICE(), // PRICE
				objProductBean.getRATE(), // RATE
				objProductBean.getFORM_ADJUST(), // FORM_ADJUST
				objProductBean.getFROMDATE(), // FROMDATE
				objProductBean.getTODATE(), // TODATE
				objProductBean.getREDUCTION_RATE(),
				objProductBean.getREDUCTION_REASON(),
				objProductBean.getGAPAN_NO(),
				objProductBean.getCAL_SUM_SEQ() // SEQ 
		};
		
		System.out.println("objProductBean.getSUM_ADJUST() = "+objProductBean.getSUM_ADJUST());
		System.out.println("objProductBean.getSUM_YEAR() = "+objProductBean.getSUM_YEAR());

		
		int i = calSumUpdate.update(values);
		return i;
	}
	
	// CAL_SUM_INFO 수정
	class CalSumUpdate extends SqlUpdate {
		public CalSumUpdate(DataSource dataSource) {
			super(dataSource, getMessageSourceAccessor().getMessage("Querys.rojum.jumyong.cal_sum_infoUpdate"));
			
			declareParameter(new SqlParameter(Types.VARCHAR)); // YEAR
			declareParameter(new SqlParameter(Types.VARCHAR)); // AREA
			declareParameter(new SqlParameter(Types.VARCHAR)); // SUM_ADJUST
			declareParameter(new SqlParameter(Types.VARCHAR)); // VAT
			declareParameter(new SqlParameter(Types.VARCHAR)); // SUM
			declareParameter(new SqlParameter(Types.VARCHAR)); // USE_SECTION
			declareParameter(new SqlParameter(Types.VARCHAR)); // PRICE
			declareParameter(new SqlParameter(Types.VARCHAR)); // RATE
			declareParameter(new SqlParameter(Types.VARCHAR)); // FORM_ADJUST
			declareParameter(new SqlParameter(Types.VARCHAR)); // FROMDATE
			declareParameter(new SqlParameter(Types.VARCHAR)); // TODATE
			declareParameter(new SqlParameter(Types.VARCHAR)); // reduction rate
			declareParameter(new SqlParameter(Types.VARCHAR)); // reduction reason
			declareParameter(new SqlParameter(Types.VARCHAR)); // GAPAN_NO
			declareParameter(new SqlParameter(Types.VARCHAR)); // SEQ
		}
	}

	// CAL_SUM_INFO
	public ProductBean CalSumInfoInfo(int seq) {
		CalSumInfoInfo calSumInfoInfo = new CalSumInfoInfo(getDataSource());
		Object[] values = { new Integer(seq) };

		ProductBean pb = (ProductBean) calSumInfoInfo.execute(values).get(0);

		return pb;
	}
	
	protected class CalSumInfoInfo extends MappingSqlQuery {
		protected CalSumInfoInfo(DataSource ds) {
			super(ds, getMessageSourceAccessor().getMessage(
					"Querys.rojum.jumyong.cal_sum_infoInfo"));
			declareParameter(new SqlParameter(Types.INTEGER));
		}

		// \
		protected Object mapRow(ResultSet rs, int rownum) throws SQLException {
			ProductBean objProductBean = new ProductBean();
			objProductBean.setADMIN_NO(rs.getString("GAPAN_NO"));
			objProductBean.setSEQ(rs.getString("SEQ"));
			objProductBean.setYEAR(rs.getString("YEAR"));
			objProductBean.setAREA(rs.getString("AREA"));
			objProductBean.setSUM_ADJUST(rs.getString("SUM_ADJUST"));
			objProductBean.setREDUCTION_RATE(rs.getString("REDUCTION_RATE"));
			objProductBean.setSUM(rs.getString("SUM"));
			objProductBean.setUSE_SECTION(rs.getString("USE_SECTION"));
			objProductBean.setREDUCTION_REASON(rs.getString("REDUCTION_REASON"));
			objProductBean.setCAL_SUM_SEQ(rs.getString(("SEQ")));

			return objProductBean;
		}
	}
	

	// 년도별 first_seq별 seq
	public int getCalSeqbyFirstSeq(String year, String first_seq)
			throws DataAccessException {
		Object[] values = { year, first_seq };

		String sql = getMessageSourceAccessor().getMessage(
				"Querys.rojum.jumyong.getCalSeqbyFirstSeq");
		int returnNum = 0;
		try {
			returnNum = getJdbcTemplate().queryForInt(sql, values);
		} catch (Exception err) {
			System.out.println(err.toString());
		}
		return returnNum;
	}

	// FORM_ADJUST CAL_SUM_SEQ로 가져오기
	public List FormAdjustList(int seq) {
		FormAdjustListQuery formAdjustListQuery = new FormAdjustListQuery(getDataSource());
		Object[] values = { new Integer(seq) };

		List a1 = formAdjustListQuery.execute(values);

		return a1;

	}
	
	protected class FormAdjustListQuery extends MappingSqlQuery {
		protected FormAdjustListQuery(DataSource ds) {
			super(ds, getMessageSourceAccessor().getMessage(
					"Querys.rojum.jumyong.form_adjustListbyCalSumInfo"));
			declareParameter(new SqlParameter(Types.INTEGER));
		}

		protected Object mapRow(ResultSet rs, int rownum) throws SQLException {
			ProductBean objProductBean = new ProductBean();
			objProductBean.setFORM_ADJUST(rs.getString("FORM_ADJUST"));
			return objProductBean;
		}
	}

	// 무단 점용 cal_sum_seq
	public int get_cal_sum_seq(String year) throws DataAccessException {
		Object[] values = { year };

		String sql = getMessageSourceAccessor().getMessage(
				"Querys.rojum.jumyong.get_cal_sum_seq");
		int returnNum = 0;
		try {
			returnNum = getJdbcTemplate().queryForInt(sql, values);
		} catch (Exception err) {
			System.out.println(err.toString());
		}
		return returnNum;
	}

	// 공시지가 구하기.
	public Map get_Price(String gapanNo)
			throws DataAccessException {
		Object[] values = {gapanNo};

		System.out.println("gapanNo :" + gapanNo);

		String sql = getMessageSourceAccessor().getMessage(
				"Querys.rojum.jumyong.get_Price");
		Map returnNum = null;
		try {
			returnNum = getJdbcTemplate().queryForMap(sql, values);
		} catch (Exception err) {
			System.out.println("GET_PRICE ERROR  : " + err.toString());
		}
		return returnNum;
	}

	//	가판기본 업데이트
    public void GapanBaseUpdate(GapanBaseBean bean){
    	try{
    	GapanBaseUpdateQuery gapanBaseUpdateQuery = new GapanBaseUpdateQuery(getDataSource());
    	Object[] values = {
    			bean.getFINISH_ID(),
    			bean.getCLOSE_DATE(),
    			bean.getCLOSE_ID(),
    			bean.getCLOSE_REASON(),
    			bean.getGAPAN_NO()
    	};
    	
    	gapanBaseUpdateQuery.update(values);
    	
    	}catch(Exception e){
    		e.printStackTrace();
    	}
    	
    }
	class GapanBaseUpdateQuery extends SqlUpdate {
		public GapanBaseUpdateQuery(DataSource dataSource) {
			super(dataSource, getMessageSourceAccessor().getMessage(
					"Querys.rojum.jumyong.gapan_Base_Update"));
	         declareParameter(new SqlParameter(Types.VARCHAR));
	         declareParameter(new SqlParameter(Types.VARCHAR));
	         declareParameter(new SqlParameter(Types.VARCHAR));
	         declareParameter(new SqlParameter(Types.VARCHAR));
	         declareParameter(new SqlParameter(Types.VARCHAR));
		}
	}

	// 일반 점용 일수 가져오기
	public int getTotalPeriod(String admin_no) throws DataAccessException {
		Object[] values = { admin_no };

		String sql = getMessageSourceAccessor().getMessage(
				"Querys.rojum.jumyong.getTotalPeriod");
		int returnNum = 0;
		try {
			returnNum = getJdbcTemplate().queryForInt(sql, values);
		} catch (Exception err) {
			System.out.println(err.toString());
		}
		return returnNum;
	}


	// 산출물 입력
	class CalInsert extends SqlUpdate {
		public CalInsert(DataSource dataSource) {

			super(dataSource, getMessageSourceAccessor().getMessage(
					"Querys.rojum.jumyong.calInsert"));
			

			//********** BEGIN_현진_20120218
			declareParameter(new SqlParameter(Types.VARCHAR)); // getADMIN_NO
			declareParameter(new SqlParameter(Types.VARCHAR)); // getYEAR
			declareParameter(new SqlParameter(Types.VARCHAR)); // getPRICE
			declareParameter(new SqlParameter(Types.VARCHAR)); // getFROMDATE
			declareParameter(new SqlParameter(Types.VARCHAR)); // getTODATE
			
			declareParameter(new SqlParameter(Types.VARCHAR)); // getAREA_AFTER
			declareParameter(new SqlParameter(Types.VARCHAR)); // getAREA_AFTER
			declareParameter(new SqlParameter(Types.VARCHAR)); // getRATE
			declareParameter(new SqlParameter(Types.VARCHAR)); // getSUM_LASTYEAR
			declareParameter(new SqlParameter(Types.VARCHAR)); // getSUM_YEAR
			
			declareParameter(new SqlParameter(Types.VARCHAR)); // getSUM_ADJUST
			declareParameter(new SqlParameter(Types.VARCHAR)); // getFORM_ADJUST
			declareParameter(new SqlParameter(Types.VARCHAR)); // getFORM
			declareParameter(new SqlParameter(Types.VARCHAR)); // getLICENSE_TAX
			declareParameter(new SqlParameter(Types.VARCHAR)); // getPERIOD
			
			declareParameter(new SqlParameter(Types.VARCHAR)); // VAT
			declareParameter(new SqlParameter(Types.VARCHAR)); // ADJUSTMENT
			declareParameter(new SqlParameter(Types.VARCHAR)); // reduction_rate
			declareParameter(new SqlParameter(Types.VARCHAR)); // reduction_reason
			declareParameter(new SqlParameter(Types.VARCHAR)); // SURCHARGE_RATE
			
			declareParameter(new SqlParameter(Types.VARCHAR)); // USE_SECTION(정기,수시)
			declareParameter(new SqlParameter(Types.VARCHAR)); // CAL_SUM_SEQ
			declareParameter(new SqlParameter(Types.VARCHAR)); // PREV_SEQ
			declareParameter(new SqlParameter(Types.VARCHAR)); // UP_DATE
			declareParameter(new SqlParameter(Types.VARCHAR)); // GP_TYP
			/*
			 System.out.println("Querys.rojum.jumyong.calInsert JumyongDao...............1"); 	
			System.out.println("Querys.rojum.jumyong.calInsert...............1"); 
			System.out.println("Querys.rojum.jumyong.calInsert...............1"); 
			declareParameter(new SqlParameter(Types.VARCHAR)); // getADMIN_NO
			declareParameter(new SqlParameter(Types.VARCHAR)); // getYEAR
			declareParameter(new SqlParameter(Types.VARCHAR)); // getPRICE
			declareParameter(new SqlParameter(Types.VARCHAR)); // getFROMDATE
			declareParameter(new SqlParameter(Types.VARCHAR)); // getTODATE
			
			declareParameter(new SqlParameter(Types.VARCHAR)); // getAREA_AFTER
			declareParameter(new SqlParameter(Types.VARCHAR)); // getAREA_AFTER
			declareParameter(new SqlParameter(Types.VARCHAR)); // getRATE
			declareParameter(new SqlParameter(Types.VARCHAR)); // getSUM_LASTYEAR
			declareParameter(new SqlParameter(Types.VARCHAR)); // getSUM_YEAR
			
			declareParameter(new SqlParameter(Types.VARCHAR)); // getSUM_ADJUST
			declareParameter(new SqlParameter(0, "4216000")); // getFORM_ADJUST
			declareParameter(new SqlParameter(Types.VARCHAR)); // getFORM
			declareParameter(new SqlParameter(Types.VARCHAR)); // getFORM
			declareParameter(new SqlParameter(Types.VARCHAR)); // getLICENSE_TAX
			declareParameter(new SqlParameter(Types.VARCHAR)); // getPERIOD
			
			declareParameter(new SqlParameter(Types.VARCHAR)); // VAT
			declareParameter(new SqlParameter(Types.VARCHAR)); // ADJUSTMENT
			declareParameter(new SqlParameter(Types.VARCHAR)); // reduction_rate
			declareParameter(new SqlParameter(Types.VARCHAR)); // reduction_reason
			declareParameter(new SqlParameter(Types.VARCHAR)); // SURCHARGE_RATE
			
			declareParameter(new SqlParameter(Types.VARCHAR)); // USE_SECTION(정기,수시)
			declareParameter(new SqlParameter(Types.VARCHAR)); // CAL_SUM_SEQ
			declareParameter(new SqlParameter(Types.VARCHAR)); // PREV_SEQ
			declareParameter(new SqlParameter(Types.VARCHAR)); // UP_DATE
			declareParameter(new SqlParameter(Types.VARCHAR)); // GP_TYP
			declareParameter(new SqlParameter(Types.VARCHAR)); // UP_DATE
			declareParameter(new SqlParameter(Types.VARCHAR)); // GP_TYP
			declareParameter(new SqlParameter(Types.VARCHAR)); // UP_DATE 
			 */
			//********** END_현진_20120218

			
			

		}
	}

	










	// 일괄산출위해 정보불러오기
    public ProductBean getBatchCalculationProductList(String gapan_no,String year){
    	
    	BatchProductListQuery batchProductListQuery = new BatchProductListQuery(getDataSource());
    	
		Object[] values = {year,year,year,year,year,gapan_no};

		return (ProductBean) batchProductListQuery.execute(values).get(0);
	}
    
	protected class BatchProductListQuery extends MappingSqlQuery {
		protected BatchProductListQuery(DataSource ds) {
			super(ds, getMessageSourceAccessor().getMessage(
					"Querys.rojum.jumyong.BatchProductList"));
			
			System.out.println("JumyongDao Querys.rojum.jumyong.BatchProductList BatchProductListQuery]Same retrieve list..??");
			declareParameter(new SqlParameter(Types.VARCHAR)); // YEAR
			declareParameter(new SqlParameter(Types.VARCHAR)); // YEAR
			declareParameter(new SqlParameter(Types.VARCHAR)); // YEAR
			declareParameter(new SqlParameter(Types.VARCHAR)); // YEAR
			declareParameter(new SqlParameter(Types.VARCHAR)); // YEAR
			declareParameter(new SqlParameter(Types.VARCHAR)); // GAPAN_NO
			
		}

		protected Object mapRow(ResultSet rs, int rownum) throws SQLException {
			ProductBean objProductBean = new ProductBean();
			
			objProductBean.setGAPAN_NO(rs.getString("GAPAN_NO"));
			objProductBean.setOWNER_NAME(rs.getString("OWNER_NAME"));
			objProductBean.setLAST_AREA_AFTER(rs.getString("LAST_AREA_AFTER"));
			objProductBean.setSUM_LASTYEAR(rs.getString("SUM_LASTYEAR"));
			objProductBean.setADDR(rs.getString("ADDR"));
			objProductBean.setPRICE(rs.getString("PRICE"));
			objProductBean.setRATE(String.valueOf(rs.getFloat("RATE")));
			objProductBean.setAREA_AFTER(rs.getString("AREA_AFTER"));
			objProductBean.setREDUCTION_RATE(String.valueOf(rs.getFloat("REDUCTION_RATE")));
			objProductBean.setREDUCTION_REASON(rs.getString("REDUCTION_REASON"));
			
			System.out.println("JumyongDao Querys.rojum.jumyong.BatchProductList"); 
			
			return objProductBean;
		}
	}
	
	
	//년도별 산출 유무 여부
	// 산출물 작년도 점용료
	public int cal_sum_exist(String gapan_no,String year) throws DataAccessException {
		Object[] values = { gapan_no, year };
		String sql = getMessageSourceAccessor().getMessage("Querys.rojum.jumyong.Cal_sum_exist");
		int returnNum = getJdbcTemplate().queryForInt(sql, values);
		return returnNum;
	}
	
	
    //	부과정보 입력
    public	boolean	executeBugwa_Register(ProductBean Bean)
	{
    	try
		{
    		ExecuteBugwaRegister executeBugwaRegister = new ExecuteBugwaRegister(getDataSource());
    		
    		System.out.println("executeBugwa_Register -> ExecuteBugwaRegister class 호출");
    		
			Object[] values = {
					Bean.getGAPAN_NO(),
					Bean.getSIGU_CD(),
					Bean.getBJ_CD(),
					Bean.getTAX_NO(),
					Bean.getDEPT_CD(),

					Bean.getTAX_GUBUN(),
					Bean.getTAX_YM(),
					Bean.getOBJ_SET(),
					Bean.getTAXPAYER_ID(),
					Bean.getTAXPAYER_SET(),

					Bean.getLIVE(),
					Bean.getINDATE(),
					Bean.getOVERDATE(),
					Bean.getTAX_DATE(),
					Bean.getADD_SET(),

					Bean.getADD_YN(),
					Bean.getNOTES(),
					Bean.getLIMIT_SUM(),
					Bean.getLIMIT_CNT(),
					Bean.getRATE(),

					Bean.getRATE_CAUSE(),
					Bean.getBONSE(),
					Bean.getGIGUM(),
					Bean.getGUKSE(),
					Bean.getSISE(),

					Bean.getGUSE(),
					Bean.getVAT(),
					Bean.getINTAX(),
					Bean.getOVERTAX(),
					Bean.getFORM1(),

					Bean.getFORM2(),
					Bean.getYEAR(),
					Bean.getSEQ(),
					Bean.getTAX_YN(),
					Bean.getOCR_SIGU_CD(),

					Bean.getOCR_BUSEO_CD(),
					Bean.getSUBUSEO_CD(),
					Bean.getTAX_CD(),
					Bean.getGP_TYP(),
					Bean.getCAL_SUM_SEQ(),
					
					//********** BEGIN_KANG_20120705
					//Bean.getCAL_MODE()
					Bean.getCAL_MODE(),
					Bean.getBEFORE_SEQ(),
					Bean.getBEFORE_YEAR()					
					//********** END_KANG_20120705
				};
			
			executeBugwaRegister.update(values);
		}
		catch (Exception e)
		{
			e.printStackTrace();
			return	false;
		}
		
		return	true;
    }
    
	class ExecuteBugwaRegister extends SqlUpdate {
		public ExecuteBugwaRegister(DataSource dataSource) {

			super(dataSource, getMessageSourceAccessor().
					getMessage("Querys.rojum.jumyong.Bugwa_Register"));

		     System.out.println("jumyongdao.ExecuteBugwaRegister.Querys.rojum.jumyong.Bugwa_Register");
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
	         //********** BEGIN_KANG_20120705
	         declareParameter(new SqlParameter(Types.VARCHAR));
	         declareParameter(new SqlParameter(Types.VARCHAR));
	         //********** END_KANG_20120705
	        
        }
	}
    // 산출정보 삭제
    public void executeDeleteCalTax(String gapanNo,String seq){
		Object[] values = {gapanNo,seq};
		
		ExecuteDeleteCalculationQuery executeDeleteCalculationQuery = new ExecuteDeleteCalculationQuery(getDataSource());
		ExecuteDeleteCalSumQuery executeDeleteCalSumQuery = new ExecuteDeleteCalSumQuery(getDataSource());
		ExecuteDeleteTaxationQuery executeDeleteTaxationQuery = new ExecuteDeleteTaxationQuery(getDataSource());
		
		executeDeleteTaxationQuery.update(values);
		executeDeleteCalSumQuery.update(values);
		executeDeleteCalculationQuery.update(values);
	
	}
    
	// 산출합계 삭제
	protected class ExecuteDeleteCalculationQuery extends SqlUpdate {
		public ExecuteDeleteCalculationQuery(DataSource dataSource) {
			super(dataSource, getMessageSourceAccessor().getMessage(
					"Querys.rojum.jumyong.ExecuteDeleteCalculation"));
			declareParameter(new SqlParameter(Types.VARCHAR)); //ADMIN_NO
			declareParameter(new SqlParameter(Types.VARCHAR)); //SEQ
		}
	}
	
	// 산출합계 삭제
	protected class ExecuteDeleteCalSumQuery extends SqlUpdate {
		public ExecuteDeleteCalSumQuery(DataSource dataSource) {
			super(dataSource, getMessageSourceAccessor().getMessage(
					"Querys.rojum.jumyong.ExecuteDeleteCalSum"));
			declareParameter(new SqlParameter(Types.VARCHAR)); //ADMIN_NO
			declareParameter(new SqlParameter(Types.VARCHAR)); //SEQ
		}
	}
	
	// 산출합계 삭제
	protected class ExecuteDeleteTaxationQuery extends SqlUpdate {
		public ExecuteDeleteTaxationQuery(DataSource dataSource) {
			super(dataSource, getMessageSourceAccessor().getMessage(
					"Querys.rojum.jumyong.ExecuteDeleteTaxation"));
			declareParameter(new SqlParameter(Types.VARCHAR)); //ADMIN_NO
			declareParameter(new SqlParameter(Types.VARCHAR)); //SEQ
		}
	}
	
	 //	부과정보 수정
	public boolean	updateBugwa_Register(ProductBean Bean) {
		try {
			
			UpdateBugwaRegister updateBugwaRegister = new UpdateBugwaRegister(getDataSource());
System.out.println("Bean.getINTAX() : " + Bean.getINTAX());
			Object[] values = {
					Bean.getTAX_GUBUN(),
					Bean.getTAX_YM(),
					Bean.getOBJ_SET(),
					Bean.getTAXPAYER_ID(),
					Bean.getTAXPAYER_SET(),
					
					Bean.getLIVE(),
					Bean.getINDATE(),
					Bean.getOVERDATE(),
					Bean.getTAX_DATE(),
					Bean.getADD_SET(),
					
					Bean.getADD_YN(),
					Bean.getNOTES(),
					Bean.getLIMIT_SUM(),
					Bean.getLIMIT_CNT(),
					Bean.getRATE(),
					
					Bean.getRATE_CAUSE(),
					Bean.getBONSE(),					
					Bean.getGIGUM(),
					Bean.getGUKSE(),
					Bean.getSISE(),
										
					Bean.getVAT(),
					Bean.getINTAX(),
					Bean.getOVERTAX(),
					Bean.getFORM1(),
					Bean.getFORM2(),

					Bean.getYEAR(),
					Bean.getTAX_YN(),
					Bean.getOCR_SIGU_CD(),
					Bean.getOCR_BUSEO_CD(),
					Bean.getSUBUSEO_CD(),

					Bean.getTAX_CD(),
					Bean.getCAL_SUM_SEQ(),
					Bean.getCAL_MODE(),  
					Bean.getGAPAN_NO(),
					Bean.getSEQ()
					
					
					
				};
			
				for(int i = 0; i < values.length ; i++){
					System.out.println(i+" :[lkh2]updateBugwa_Register: " +  values[i]);
				}

  			updateBugwaRegister.update(values);

		} catch (Exception e) {
			System.out.println(e.toString());
			e.printStackTrace();
			return false;
		}
		return true;
	}
	
	// 산출물 수정
	class UpdateBugwaRegister extends SqlUpdate {
		public UpdateBugwaRegister(DataSource dataSource) {
			super(dataSource, getMessageSourceAccessor().getMessage(
					"Querys.rojum.jumyong.updateBugwa_Register"));
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
	          
		}
	}
	
	
	  //폐기/매각 리스트
	public List ProductSaleList(String gapanNo) throws DataAccessException {
		
		ProductSaleListQuery productSaleListQuery = new ProductSaleListQuery(getDataSource());
		Object[] values = { 
				gapanNo
				};
		
		for(int i = 0 ; i < values.length ; i++){
			System.out.println("::ProductList::" + values[i]);
		}
		
		return productSaleListQuery.execute(values);
	}
	
	// 산출물 리스트

	protected class ProductSaleListQuery extends MappingSqlQuery {
		protected ProductSaleListQuery(DataSource ds) {
			super(ds, getMessageSourceAccessor().getMessage(
					"Querys.rojum.jumyong.productSaleList"));
			declareParameter(new SqlParameter(Types.VARCHAR));


		}

		protected Object mapRow(ResultSet rs, int rownum) throws SQLException {
			SaleBean objSaleBean = new SaleBean();


			objSaleBean.setGAPAN_NO(rs.getString("GAPAN_NO"));
			objSaleBean.setSALE_TYPE(rs.getString("SALE_TYPE"));
			objSaleBean.setSALE_DATE(rs.getString("SALE_DATE"));
			objSaleBean.setSALE_NO(rs.getString("SALE_NO"));
			objSaleBean.setHND_OFFICE(rs.getString("HND_OFFICE"));
			objSaleBean.setHND_TYPE(rs.getString("HND_TYPE"));
			objSaleBean.setHND_DESDATE(rs.getString("HND_DESDATE"));
			objSaleBean.setSALE_STATUS(rs.getString("SALE_STATUS"));
			objSaleBean.setSALE_BIGO(rs.getString("SALE_BIGO"));
			objSaleBean.setHND_BIGO(rs.getString("HND_BIGO"));
			objSaleBean.setHND_OPEDATE(rs.getString("HND_OPEDATE"));

			

			return objSaleBean;
		}
	}
	//폐기/매각 개수
	public int getProductSaleListCount(String gapanNo) throws DataAccessException {

		Object[] values = {gapanNo};
		String sql = getMessageSourceAccessor().getMessage(
				"Querys.rojum.jumyong.productSaleCount");
		int returnNum = getJdbcTemplate().queryForInt(sql, values);
		// System.out.println("count2=" + returnNum + " " + adminNum);

		return returnNum;
	}
	
	// 폐기/매각 삭제
    public void executeDeleteProductSale(String gapanNo){
    	ExecuteDeleteProductSaleQuery executeDeleteProductSaleQuery = new ExecuteDeleteProductSaleQuery(getDataSource());
    	Object[] values = {gapanNo};
	
    	executeDeleteProductSaleQuery.update(values);

	}

	// 산출합계 삭제
	protected class ExecuteDeleteProductSaleQuery extends SqlUpdate {
		public ExecuteDeleteProductSaleQuery(DataSource dataSource) {
			super(dataSource, getMessageSourceAccessor().getMessage(
					"Querys.rojum.jumyong.ExecuteDeleteProductSale"));
			declareParameter(new SqlParameter(Types.VARCHAR)); //GAPAN_NO
			
		}
	}
	
   
    
    //폐기매각 등록
    public boolean ExecuteSale_Register(SaleBean objSaleBean) {
	    try	{
	    	
	    	ExecuteSale_RegisterQuery executeSale_RegisterQuery = new ExecuteSale_RegisterQuery(getDataSource());
	    	 
			Object[] values = {
					objSaleBean.getGAPAN_NO(),
					objSaleBean.getSALE_TYPE(),
					objSaleBean.getSALE_DATE(),
					objSaleBean.getSALE_NO(),
					objSaleBean.getHND_OFFICE(),
					objSaleBean.getHND_TYPE(),
					objSaleBean.getHND_DESDATE(),
					objSaleBean.getSALE_STATUS(),
					objSaleBean.getSALE_BIGO(),
					objSaleBean.getHND_BIGO(),
					objSaleBean.getHND_OPEDATE()
			};
			
			for(int i = 0 ; i < values.length ; i ++){
				System.out.println(": ExecuteSale_Register :" + values[i]);
			}
	
			executeSale_RegisterQuery.update(values);
			
			}catch(Exception e)
			{
				e.printStackTrace();
				return	false;
			}
		
		return	true;
	}


	class ExecuteSale_RegisterQuery extends SqlUpdate {
		public ExecuteSale_RegisterQuery(DataSource dataSource) {
	
			super(dataSource, getMessageSourceAccessor().getMessage("Querys.rojum.jumyong.ExecuteSale_RegisterQuery"));
			
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
		}
	}
	
	
	 //폐기매각 수정
    public boolean UpdateSale_Register(SaleBean objSaleBean){
    	try
		{
    		UpdateSale_RegisterQuery updateSale_RegisterQuery = new UpdateSale_RegisterQuery(getDataSource());
    		Object[] values = {
    				objSaleBean.getSALE_TYPE(),
    				objSaleBean.getSALE_DATE(),
    				objSaleBean.getSALE_NO(),
    				objSaleBean.getHND_OFFICE(),
    				objSaleBean.getHND_TYPE(),
    				objSaleBean.getHND_DESDATE(),
    				objSaleBean.getSALE_STATUS(),
    				objSaleBean.getSALE_BIGO(),
    				objSaleBean.getHND_BIGO(),
    				objSaleBean.getHND_OPEDATE(),
    				objSaleBean.getGAPAN_NO()
				
			};
    		
    		for(int i = 0 ; i < values.length ; i ++){
    			System.out.println(": UpdateSale_Register :" + values[i]);
    		}

    		updateSale_RegisterQuery.update(values);
		}
		catch (Exception e)
		{
			e.printStackTrace();
			return	false;
		}
		
		return	true;
	}
    
    
    class UpdateSale_RegisterQuery extends SqlUpdate {
		public UpdateSale_RegisterQuery(DataSource dataSource) {

			super(dataSource, getMessageSourceAccessor().getMessage("Querys.rojum.jumyong.UpdateSale_RegisterQuery"));

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
		

		}
	}
    
    
    //@운영자 정보 보기
    public List executeGapan_Head(String GAPAN_NO){
    	ExecuteGapan_HeadQuery  executeGapan_HeadQuery = new ExecuteGapan_HeadQuery(getDataSource());
    	Object[] values = {GAPAN_NO};
		return executeGapan_HeadQuery.execute(values);
    }
    
	protected class ExecuteGapan_HeadQuery extends MappingSqlQuery {
		protected ExecuteGapan_HeadQuery(DataSource ds) {
			super(ds, getMessageSourceAccessor().getMessage(
					"Querys.rojum.jumyong.ExecuteGapan_Head"));
			declareParameter(new SqlParameter(Types.VARCHAR));
		}

		protected Object mapRow(ResultSet rs, int rownum) throws SQLException {
			
			GapanHeadBean Bean = new GapanHeadBean(); 

        	Bean.setGAPAN_NO(rs.getString("GAPAN_NO"));	 
        	Bean.setOWNER_NAME(rs.getString("OWNER_NAME"));
        	Bean.setOWNER_IDCHK(rs.getString("OWNER_IDCHK"));
        	Bean.setOWNER_SSN(rs.getString("OWNER_SSN"));
        	Bean.setOWNER_GENDER(rs.getString("OWNER_GENDER"));
        	Bean.setOWNER_AGE(rs.getString("OWNER_AGE"));
			
			return Bean;
		}
		
	}
	//********** BEGIN_KANG_20120416
    //@운영자 정보 보기
    public List executeGapan_Info(String GAPAN_NO){
    	ExecuteGapan_Info  executeGapan_Info = new ExecuteGapan_Info(getDataSource());
    	Object[] values = {GAPAN_NO};
		return executeGapan_Info.execute(values);
    }
    
	protected class ExecuteGapan_Info extends MappingSqlQuery {
		protected ExecuteGapan_Info(DataSource ds) {
			super(ds, getMessageSourceAccessor().getMessage(
					"Querys.rojum.jumyong.ExecuteGapan_Info"));
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
        	Bean.setPLACE_L(rs.getString("PLACE_L"));
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
        	Bean.setREDUCTION_RATE(rs.getString("REDUCTION_RATE"));
        	Bean.setREDUCTION_REASON(rs.getString("REDUCTION_REASON"));
        	Bean.setPICKUP_DATE(rs.getString("PICKUP_DATE"));
        	Bean.setRETURN_DATE(rs.getString("RETURN_DATE"));
        	Bean.setPICKUP_YN(rs.getString("PICKUP_YN"));
        	Bean.setSURVEY_YEAR(rs.getString("SURVEY_YEAR"));
        	Bean.setMANAGE_TYP(rs.getString("MANAGE_TYP"));
        	Bean.setGUIDE_DATE(rs.getString("GUIDE_DATE"));
        	Bean.setSPECIAL_DATE(rs.getString("SPECIAL_DATE"));
        	Bean.setFT_CAT(rs.getString("FT_CAT"));
        	Bean.setCAR_NO(rs.getString("CAR_NO"));
			return Bean;
		}
		
	}
	//********** END_KANG_20120416

	// 점용료 정보 보기
	public List executeJumyongInfo(String ownerName,String ownerSsn,String guCd) {
		ExecuteJumyongInfoQuery executeJumyongInfoQuery = new ExecuteJumyongInfoQuery(getDataSource());
		
    	Object[] values = {ownerName,ownerSsn,guCd};
    	for (int i = 0; i < values.length; i++) {
    		System.out.println(":::"+values[i]);
		}
		return executeJumyongInfoQuery.execute(values);
    }
	
	protected class ExecuteJumyongInfoQuery extends MappingSqlQuery {
		protected ExecuteJumyongInfoQuery(DataSource ds) {
			super(ds, getMessageSourceAccessor().getMessage(
					"Querys.rojum.jumyong.ExecuteJumyongInfo"));
			System.out.println("이용 sql id");
			System.out.println("Querys.rojum.jumyong.ExecuteJumyongInfo");
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
		}

		protected Object mapRow(ResultSet rs, int rownum) throws SQLException {
			
			ProductTaxBean Bean = new ProductTaxBean();
			
			
			Bean.setGAPAN_NO(rs.getString("GAPAN_NO"));
			Bean.setSEQ(rs.getString("SEQ"));
			Bean.setYEAR(rs.getString("YEAR"));
			Bean.setBONSE(rs.getString("BONSE"));
			Bean.setVAT(rs.getString("VAT"));
			Bean.setTAX_DATE(rs.getString("TAX_DATE"));
			Bean.setTAX_GUBUN(rs.getString("TAX_GUBUN"));
			Bean.setCAL_MODE(rs.getString("CAL_MODE"));
			Bean.setSUNAP_YN(rs.getString("SUNAP_YN"));
			Bean.setTAX_YN(rs.getString("TAX_YN"));
			Bean.setTAX_NO(rs.getString("TAX_NO"));
						
			return Bean;
		}
	}
	
	
	// 수거 정보 보기
	public List executePickupInfo(String ownerName,String ownerSsn,String guCd) {
		ExecutePickupInfoQuery executePickupInfoQuery = new ExecutePickupInfoQuery(getDataSource());
    	Object[] values = {ownerName,ownerSsn,guCd};
		return executePickupInfoQuery.execute(values);
    }
	
	// 수거 정보 보기
	protected class ExecutePickupInfoQuery extends MappingSqlQuery {
		protected ExecutePickupInfoQuery(DataSource ds) {
			super(ds, getMessageSourceAccessor().getMessage(
					"Querys.rojum.jumyong.ExecutePickupInfo"));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
		}

		protected Object mapRow(ResultSet rs, int rownum) throws SQLException {
			
			ProductTaxBean Bean = new ProductTaxBean();
			
			
			Bean.setGAPAN_NO(rs.getString("GAPAN_NO"));
			Bean.setPICKUP_DATE(rs.getString("PICKUP_DATE"));
			Bean.setRETURN_DATE(rs.getString("RETURN_DATE"));
			Bean.setFT_ITEM(rs.getString("FT_TYP_NM")+"/"+rs.getString("FT_SEL_NM"));
			Bean.setRETURN_BONSE(rs.getString("RETURN_BONSE"));
			Bean.setRETURN_SUNAP_DATE(rs.getString("RETURN_SUNAP_DATE"));
			Bean.setRETURN_TAX_DATE(rs.getString("RETURN_TAX_DATE"));
			Bean.setRETURN_TAX_YN(rs.getString("RETURN_TAX_YN"));
			Bean.setNO_BONSE(rs.getString("NO_BONSE"));
			Bean.setNO_SUNAP_DATE(rs.getString("NO_SUNAP_DATE"));
			Bean.setNO_TAX_DATE(rs.getString("NO_TAX_DATE"));
			Bean.setNO_TAX_YN(rs.getString("NO_TAX_YN"));

						
			return Bean;
		}
	}

	//********** BEGIN_KANG_20120416
	// 수거 정보 보기
	public List executePickupInfo(String ownerName,String ownerSsn,String guCd, String CAR_NO) {
		ExecutePickupInfoQuery2 executePickupInfoQuery = new ExecutePickupInfoQuery2(getDataSource());
    	Object[] values = {ownerName,ownerSsn,guCd, guCd, CAR_NO};
		return executePickupInfoQuery.execute(values);
    }
	
	// 수거 정보 보기
	protected class ExecutePickupInfoQuery2 extends MappingSqlQuery {
		protected ExecutePickupInfoQuery2(DataSource ds) {
			super(ds, getMessageSourceAccessor().getMessage(
					"Querys.rojum.jumyong.ExecutePickupInfo_carno"));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
		}

		protected Object mapRow(ResultSet rs, int rownum) throws SQLException {
			
			ProductTaxBean Bean = new ProductTaxBean();
			
			
			Bean.setGAPAN_NO(rs.getString("GAPAN_NO"));
			Bean.setPICKUP_DATE(rs.getString("PICKUP_DATE"));
			Bean.setRETURN_DATE(rs.getString("RETURN_DATE"));
			Bean.setFT_ITEM(rs.getString("FT_TYP_NM")+"/"+rs.getString("FT_SEL_NM"));
			Bean.setRETURN_BONSE(rs.getString("RETURN_BONSE"));
			Bean.setRETURN_SUNAP_DATE(rs.getString("RETURN_SUNAP_DATE"));
			Bean.setRETURN_TAX_DATE(rs.getString("RETURN_TAX_DATE"));
			Bean.setRETURN_TAX_YN(rs.getString("RETURN_TAX_YN"));
			Bean.setNO_BONSE(rs.getString("NO_BONSE"));
			Bean.setNO_SUNAP_DATE(rs.getString("NO_SUNAP_DATE"));
			Bean.setNO_TAX_DATE(rs.getString("NO_TAX_DATE"));
			Bean.setNO_TAX_YN(rs.getString("NO_TAX_YN"));

						
			return Bean;
		}
	}
	//********** END_KANG_20120416

	
	// 계도 정보 보기
	public List executeGuideInfo(String ownerName,String ownerSsn,String guCd) {
		ExecuteGuideInfoQuery executeGuideInfoQuery = new ExecuteGuideInfoQuery(getDataSource());
    	Object[] values = {ownerName,ownerSsn,guCd};
		return executeGuideInfoQuery.execute(values);
    }
	
	// 계도 정보 보기
	protected class ExecuteGuideInfoQuery extends MappingSqlQuery {
		protected ExecuteGuideInfoQuery(DataSource ds) {
			super(ds, getMessageSourceAccessor().getMessage(
					"Querys.rojum.jumyong.ExecuteGuideInfo"));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
		}

		protected Object mapRow(ResultSet rs, int rownum) throws SQLException {
			
			GuideBean bean = new GuideBean();
			
			bean.setGAPAN_NO(rs.getString("GAPAN_NO"));
			bean.setGUIDE_DATE(rs.getString("GUIDE_DATE"));
			bean.setFT_TYP_NM(rs.getString("FT_TYP_NM"));
			bean.setFT_SEL_NM(rs.getString("FT_SEL_NM"));
			bean.setADDR(rs.getString("ADDR"));
			
			return bean;
		}
	}
	
	//********** BEGIN_KANG_20120416
	// 계도 정보 보기
	public List executeGuideInfo(String ownerName,String ownerSsn,String guCd,String CAR_NO) {
		ExecuteGuideInfoQuery2 executeGuideInfoQuery = new ExecuteGuideInfoQuery2(getDataSource());
    	Object[] values = {ownerName,ownerSsn,guCd,guCd,CAR_NO};
		System.out.println("=================================");
    	for(int i = 0; i < values.length; i++){

    		System.out.println(values[i]);
    	}
		System.out.println("=================================");
		return executeGuideInfoQuery.execute(values);
    }
	
	// 계도 정보 보기
	protected class ExecuteGuideInfoQuery2 extends MappingSqlQuery {
		protected ExecuteGuideInfoQuery2(DataSource ds) {
			super(ds, getMessageSourceAccessor().getMessage(
					"Querys.rojum.jumyong.ExecuteGuideInfo_CarNo"));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
		}

		protected Object mapRow(ResultSet rs, int rownum) throws SQLException {
			
			GuideBean bean = new GuideBean();
			
			bean.setGAPAN_NO(rs.getString("GAPAN_NO"));
			bean.setGUIDE_DATE(rs.getString("GUIDE_DATE"));
			bean.setFT_TYP_NM(rs.getString("FT_TYP_NM"));
			bean.setFT_SEL_NM(rs.getString("FT_SEL_NM"));
			bean.setADDR(rs.getString("ADDR"));
			
			return bean;
		}
	}
	//********** END_KANG_20120416

	// 폐기 매각 정보
	public List executeSaleInfo(String ownerName,String ownerSsn,String guCd){
		ExecuteSaleInfoQuery executeSaleInfoQuery = new ExecuteSaleInfoQuery(getDataSource());
    	Object[] values = {ownerName,ownerSsn,guCd};
    	
		return executeSaleInfoQuery.execute(values);
    }
	
	protected class ExecuteSaleInfoQuery extends MappingSqlQuery {
		protected ExecuteSaleInfoQuery(DataSource ds) {
			super(ds, getMessageSourceAccessor().getMessage(
					"Querys.rojum.jumyong.ExecuteSaleInfo"));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
		}

		protected Object mapRow(ResultSet rs, int rownum) throws SQLException {
			SaleBean Bean = new SaleBean();
			
			Bean.setGAPAN_NO(rs.getString("GAPAN_NO"));
			Bean.setSALE_TYPE(rs.getString("SALE_TYPE"));
			Bean.setSALE_DATE(rs.getString("SALE_DATE"));
			Bean.setSALE_NO(rs.getString("SALE_NO"));
			Bean.setHND_OFFICE(rs.getString("HND_OFFICE"));
			Bean.setHND_TYPE(rs.getString("HND_TYPE"));
			Bean.setHND_DESDATE(rs.getString("HND_DESDATE"));
			Bean.setSALE_STATUS(rs.getString("SALE_STATUS"));
			Bean.setSALE_BIGO(rs.getString("SALE_BIGO"));
			Bean.setHND_BIGO(rs.getString("HND_BIGO"));
			Bean.setHND_OPEDATE(rs.getString("HND_OPEDATE"));
			Bean.setFT_TYP_NM(rs.getString("FT_TYP_NM"));
			Bean.setFT_SEL_NM(rs.getString("FT_SEL_NM"));
			
			return Bean;
		}
	}
	
	 // 반환 처리
    public void executeReturnProduct(String gapanNo,String returnDate){
    	ExecuteReturnProductQuery executeReturnProductQuery = new ExecuteReturnProductQuery(getDataSource());
    	Object[] values = {returnDate,gapanNo};
    	executeReturnProductQuery.update(values);
    }

	// 반환 처리
	class ExecuteReturnProductQuery extends SqlUpdate {
		public ExecuteReturnProductQuery(DataSource dataSource) {
			super(dataSource, getMessageSourceAccessor().getMessage(
					"Querys.rojum.jumyong.executeReturnProduct"));
			declareParameter(new SqlParameter(Types.VARCHAR)); // GAPAN_NO
			declareParameter(new SqlParameter(Types.VARCHAR)); // RETURN_DATE
		}
	}
	
	
	
	public String retStatusValue(String section,String return_yn,String return_date,String taxtation_at,String mode1_status,String mode2_status,String mode32_status,String mode33_status,String sale_status){

        String retValue = "";

        if(section.equals("4")){
        	retValue += "폐쇄";
        }else{
			if(sale_status != null && !sale_status.equals("")){
				if(sale_status.equals("1")){
					retValue += "폐기 진행";
				}
				else if(sale_status.equals("2")){
					retValue += "매각 진행";
				}
				else if(sale_status.equals("3")){
					retValue += "폐기 완료";
				}
				else if(sale_status.equals("4")){
					retValue += "매각 완료";
				}
			}else{

				if(return_yn != null && !return_yn.equals("")){
					retValue += addDash(return_date) + "일 반환완료";
				}else{

					if(mode33_status != null && !mode33_status.equals("")){
						retValue += "사전통지";
						if(mode33_status.substring(1,2).equals("1")){
							retValue += " 수납";
						}else if(mode33_status.substring(0,1).equals("1")){
							retValue += " 부과";
						}else{
							retValue += " 산출";
						}
					}

					if(mode32_status != null && !mode32_status.equals("")){
						if(retValue.length() != 0){
							retValue += ", ";
						}
						retValue += "과태료";
						if(mode32_status.substring(1,2).equals("1")){
							retValue += " 수납";
						}else if(mode32_status.substring(0,1).equals("1")){
							retValue += " 부과";
						}else{
							retValue += " 산출";
						}
					}

					if(mode2_status != null && !mode2_status.equals("")){
						if(retValue.length() != 0){
							retValue += ", ";
						}
						retValue += "변상금";
						if(mode2_status.substring(1,2).equals("1")){
							retValue += " 수납";
						}else if(mode2_status.substring(0,1).equals("1")){
							retValue += " 부과";
						}else{
							retValue += " 산출";
						}
					}
					
					if(mode1_status != null && !mode1_status.equals("")){
						retValue += mode1_status.substring(0,4)+"년 점용료";
						if(mode1_status.substring(5,6).equals("1")){
							retValue += " 수납";
						}else if(mode1_status.substring(4,5).equals("1")){
							retValue += " 부과";
						}else{
							retValue += " 산출";
						}
					}
				}
			}

        }
		
		if(retValue.length() == 0){
			retValue = "미검토";
		}        
		return retValue;
    }
	
	
	// 운영자 정보 리스트
	public List executeOwnerList(String owner_name){
		// 운영자정보 리스트 
		ExecuteOwnerListQuery executeOwnerListQuery = new ExecuteOwnerListQuery(getDataSource());

		Object[] values = {"%"+owner_name+"%"};
		return executeOwnerListQuery.execute(values);
    }
	protected class ExecuteOwnerListQuery extends MappingSqlQuery {
		protected ExecuteOwnerListQuery(DataSource ds) {
			super(ds, getMessageSourceAccessor().getMessage("Querys.rojum.jumyong.ExecuteOwnerListQuery"));
			declareParameter(new SqlParameter(Types.VARCHAR));
		}

		protected Object mapRow(ResultSet rs, int rownum) throws SQLException {
			
			GapanHeadBean Bean = new GapanHeadBean();
			Bean.setOWNER_NAME(rs.getString("OWNER_NAME"));
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
        	Bean.setADDR_CHECK1(rs.getString("ADDR_CHECK1"));
        	Bean.setADDR_CHECK2(rs.getString("ADDR_CHECK2"));
        	
        	Bean.setLT_SEL(rs.getString("LT_SEL"));
        	
			return Bean;
		}
	}
	
    public String addDash(String val1) {
        if (val1.length() >= 8) {
            val1 = val1.substring(0, 4) + "-" + val1.substring(4, 6) + "-" + val1.substring(6, 8);
        } else if (val1.length() >= 6) {
            val1 = val1.substring(0, 4) + "-" + val1.substring(4, 6);
        }

        return val1;
    }
    
	// 고발등록 리스트
	public List executeAccuseInfo(String ownerName,String ownerSsn,String guCd) {
		ExecuteAccuseInfoQuery executeAccuseInfoQuery = new ExecuteAccuseInfoQuery(getDataSource());
    	Object[] values = {ownerName,ownerSsn,guCd};
		return executeAccuseInfoQuery.execute(values);
    }
	protected class ExecuteAccuseInfoQuery extends MappingSqlQuery {
		protected ExecuteAccuseInfoQuery(DataSource ds) {
			super(ds, getMessageSourceAccessor().getMessage(
					"Querys.rojum.jumyong.ExecuteAccuseInfoQuery"));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
		}

		protected Object mapRow(ResultSet rs, int rownum) throws SQLException {
			
			AccuseBean Bean = new AccuseBean();
			Bean.setSEQ(rs.getString("SEQ"));
			Bean.setGU_CD(rs.getString("GU_CD"));
			Bean.setOWNER_NAME(rs.getString("OWNER_NAME"));
			Bean.setOWNER_SSN(rs.getString("OWNER_SSN"));
			Bean.setACCUSE_DATE(rs.getString("ACCUSE_DATE"));
			Bean.setACCUSE_DATA(rs.getString("ACCUSE_DATA"));
			
						
			return Bean;
		}
	}
	
	// 전업지원 리스트
	public List executeChangeJobInfo(String ownerName,String ownerSsn,String guCd) {
		ExecuteChangeJobInfoQuery executeChangeJobInfoQuery = new ExecuteChangeJobInfoQuery(getDataSource());
    	Object[] values = {ownerName,ownerSsn,guCd};
		return executeChangeJobInfoQuery.execute(values);
    }
	protected class ExecuteChangeJobInfoQuery extends MappingSqlQuery {
		protected ExecuteChangeJobInfoQuery(DataSource ds) {
			super(ds, getMessageSourceAccessor().getMessage(
					"Querys.rojum.jumyong.ExecuteChangeJobInfoQuery"));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
		}

		protected Object mapRow(ResultSet rs, int rownum) throws SQLException {
			
			ChangeJobBean Bean = new ChangeJobBean();
			
			Bean.setSEQ(rs.getString("SEQ"));
			Bean.setGU_CD(rs.getString("GU_CD"));
			Bean.setOWNER_NAME(rs.getString("OWNER_NAME"));
			Bean.setOWNER_SSN(rs.getString("OWNER_SSN"));
			Bean.setCHANGE_JOB_DATE(rs.getString("CHANGE_JOB_DATE"));
			Bean.setCHANGE_JOB_TYPE(rs.getString("CHANGE_JOB_TYPE"));
			Bean.setCHANGE_JOB_SECTION(rs.getString("CHANGE_JOB_SECTION"));
			Bean.setCHANGE_JOB_TYPE_NM(rs.getString("CHANGE_JOB_TYPE_NM"));
			Bean.setCHANGE_JOB_SECTION_NM(rs.getString("CHANGE_JOB_SECTION_NM"));
			
						
			return Bean;
		}
	}
	
	////운영자 존재 여부
	public String getExistOwner(String gapanNo) throws DataAccessException {

		Object[] values = {gapanNo};
		String sql = getMessageSourceAccessor().getMessage("Querys.rojum.jumyong.getExistOwner");
		int returnNum = getJdbcTemplate().queryForInt(sql, values);
		
		if(returnNum > 0){
			return "true";
		}else{
			return "false";
			
		}
	}
	/*
    // tax_code 리스트 가져오기
    public List ExecuteTaxCodeInfo(String TAX_SET, String TAX_CD){
    	ExecuteTaxCodeInfoQuery executeTaxCodeInfoQuery = new ExecuteTaxCodeInfoQuery(getDataSource());
    	Object[] values = {TAX_SET,TAX_CD};
		return executeTaxCodeInfoQuery.execute(values);
    }
    
    // tax_code 리스트 가져오기
	protected class ExecuteTaxCodeInfoQuery extends MappingSqlQuery {
		protected ExecuteTaxCodeInfoQuery(DataSource ds) {
			super(ds, getMessageSourceAccessor().getMessage(
					"Querys.rojum.jumyong.ExecuteTaxCodeInfoQuery"));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
		}

		protected Object mapRow(ResultSet rs, int rownum) throws SQLException {
			TaxCodeBean objTaxCodeBean = new TaxCodeBean();
			objTaxCodeBean.setTAXCODE(rs.getString("TAXCODE"));
			objTaxCodeBean.setTAXNAME(rs.getString("TAXNAME"));
						
			return objTaxCodeBean;
		}
	}*/
	
	//2016.09.07 구특별 추가를 위해 소스 수정 by kjh
	// tax_code 리스트 가져오기
    public List ExecuteTaxCodeInfo(String TAX_SET, String TAX_CD){
    	if(TAX_SET.equals("50")){
    		ExecuteTaxCodeInfoQuery_exp executeTaxCodeInfoQuery = new ExecuteTaxCodeInfoQuery_exp(getDataSource());
    		Object[] values = {TAX_SET,TAX_CD,"89",TAX_CD};
    		return executeTaxCodeInfoQuery.execute(values);
    	}else{
    		ExecuteTaxCodeInfoQuery executeTaxCodeInfoQuery = new ExecuteTaxCodeInfoQuery(getDataSource());
    		Object[] values = {TAX_SET,TAX_CD};
    		return executeTaxCodeInfoQuery.execute(values);
    	}
    }
    
    // tax_code 리스트 가져오기
	protected class ExecuteTaxCodeInfoQuery extends MappingSqlQuery {
		protected ExecuteTaxCodeInfoQuery(DataSource ds) {
			super(ds, getMessageSourceAccessor().getMessage(
					"Querys.rojum.jumyong.ExecuteTaxCodeInfoQuery"));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
		}

		protected Object mapRow(ResultSet rs, int rownum) throws SQLException {
			TaxCodeBean objTaxCodeBean = new TaxCodeBean();
			objTaxCodeBean.setTAXCODE(rs.getString("TAXCODE"));
			objTaxCodeBean.setTAXNAME(rs.getString("TAXNAME"));
						
			return objTaxCodeBean;
		}
	}
	
	// 구특별 tax_code 리스트 가져오기
	protected class ExecuteTaxCodeInfoQuery_exp extends MappingSqlQuery {
		protected ExecuteTaxCodeInfoQuery_exp(DataSource ds) {
			super(ds, getMessageSourceAccessor().getMessage(
					"Querys.rojum.jumyong.ExecuteTaxCodeInfoQuery_exp"));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
		}

		protected Object mapRow(ResultSet rs, int rownum) throws SQLException {
			TaxCodeBean objTaxCodeBean = new TaxCodeBean();
			objTaxCodeBean.setTAXCODE(rs.getString("TAXCODE"));
			objTaxCodeBean.setTAXNAME(rs.getString("TAXNAME"));
						
			return objTaxCodeBean;
		}
	}
	
	// 해지해체 취소
	public void disuseCancel(String gapanNo){
		try{
		Object[] values = {gapanNo};
		String sql = getMessageSourceAccessor().getMessage("Querys.rojum.jumyong.disuseCancel");
		getJdbcTemplate().update(sql, values);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	//********** BEGIN_현진_20120222
	public List gapanCalSumInfoSelect(String gapanNo,String seq,String year) {
		GapanCalSumInfoSelect gapanCalSumInfoQuery  = new GapanCalSumInfoSelect(getDataSource());
    	Object[] values = {gapanNo,seq};
		return gapanCalSumInfoQuery.execute(values);
    }
	protected class GapanCalSumInfoSelect extends MappingSqlQuery {
		protected GapanCalSumInfoSelect(DataSource ds) {
			super(ds, getMessageSourceAccessor().getMessage(
					"Querys.rojum.jumyong.GapanCalSumInfoSelect"));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
		}

		protected Object mapRow(ResultSet rs, int rownum) throws SQLException {			
			
			ProductBean Bean = new ProductBean();
			
			Bean.setGAPAN_NO(rs.getString("GAPAN_NO"));
			Bean.setSEQ(rs.getString("SEQ"));
			Bean.setYEAR(rs.getString("YEAR"));
			Bean.setAREA(rs.getString("AREA"));
			Bean.setSUM_ADJUST(rs.getString("SUM_ADJUST"));
			Bean.setVAT(rs.getString("VAT"));
			Bean.setREDUCTION_RATE(rs.getString("REDUCTION_RATE"));
			Bean.setSUM(rs.getString("SUM"));
			Bean.setUSE_SECTION(rs.getString("USE_SECTION"));
			Bean.setREDUCTION_REASON(rs.getString("REDUCTION_REASON"));
			Bean.setTAX_SEQ(rs.getString("TAX_SEQ"));
			Bean.setPRICE(rs.getString("PRICE"));
			Bean.setRATE(rs.getString("RATE"));
			Bean.setFORM_ADJUST(rs.getString("FORM_ADJUST"));
			Bean.setFROMDATE(rs.getString("FROMDATE"));
			Bean.setTODATE(rs.getString("TODATE"));
			Bean.setCAL_MODE(rs.getString("CAL_MODE"));
			
			return Bean;
		}
	}
	
	
	public List gapanCalculationSelect(String gapanNo,String seq,String year) {
		GapanCalculationSelect gapanCalculationSelect  = new GapanCalculationSelect(getDataSource());
    	Object[] values = {gapanNo,seq};
		return gapanCalculationSelect.execute(values);
    }
	protected class GapanCalculationSelect extends MappingSqlQuery {
		protected GapanCalculationSelect(DataSource ds) {
			super(ds, getMessageSourceAccessor().getMessage(
					"Querys.rojum.jumyong.GapanCalculationSelect"));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
		}

		protected Object mapRow(ResultSet rs, int rownum) throws SQLException {			
			
			ProductBean Bean = new ProductBean();
			Bean.setYEAR(rs.getString("YEAR"));
			Bean.setSEQ(rs.getString("SEQ"));
			Bean.setPRICE(rs.getString("PRICE"));
			Bean.setAREA_BEFORE(rs.getString("AREA_BEFORE"));
			Bean.setAREA_AFTER(rs.getString("AREA_AFTER"));
			Bean.setRATE(rs.getString("RATE"));
			Bean.setSUM_LASTYEAR(rs.getString("SUM_LASTYEAR"));
			Bean.setSUM_YEAR(rs.getString("SUM_YEAR"));
			Bean.setSUM_ADJUST(rs.getString("SUM_ADJUST"));
			Bean.setVAT(rs.getString("VAT"));
			Bean.setFROMDATE(rs.getString("FROMDATE"));
			Bean.setTODATE(rs.getString("TODATE"));
			Bean.setFORM_ADJUST(rs.getString("FORM_ADJUST"));
			Bean.setFORM(rs.getString("FORM"));
			Bean.setUP_DATE(rs.getString("UP_DATE"));
			Bean.setLICENSE_TAX(rs.getString("LICENSE_TAX"));
			Bean.setPERIOD(rs.getString("PERIOD"));
			Bean.setNOTES(rs.getString("NOTES"));
			Bean.setADJUSTMENT(rs.getString("ADJUSTMENT"));
			Bean.setREDUCTION_RATE(rs.getString("REDUCTION_RATE"));
			Bean.setREDUCTION_REASON(rs.getString("REDUCTION_REASON"));
			Bean.setSURCHARGE_RATE(rs.getString("SURCHARGE_RATE"));
			Bean.setUSE_SECTION(rs.getString("USE_SECTION"));
			Bean.setFIRST_SEQ(rs.getString("FIRST_SEQ"));
			Bean.setCAL_SUM_SEQ(rs.getString("CAL_SUM_SEQ"));
			Bean.setPREV_SEQ(rs.getString("PREV_SEQ"));
			Bean.setGAPAN_NO(rs.getString("GAPAN_NO"));
			Bean.setGP_TYP(rs.getString("GP_TYP"));
			Bean.setCAL_MODE(rs.getString("CAL_MODE"));
			
			return Bean;
		}
	}

	
	public List gapanTaxationInfoSelect(String gapanNo,String seq,String year) {
		GapanTaxationInfoSelect gapanTaxationInfoSelect  = new GapanTaxationInfoSelect(getDataSource());
    	Object[] values = {gapanNo,seq};
		return gapanTaxationInfoSelect.execute(values);
    }
	protected class GapanTaxationInfoSelect extends MappingSqlQuery {
		protected GapanTaxationInfoSelect(DataSource ds) {
			super(ds, getMessageSourceAccessor().getMessage(
					"Querys.rojum.jumyong.GapanTaxationInfoSelect"));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
		}

		protected Object mapRow(ResultSet rs, int rownum) throws SQLException {			
			
			ProductBean Bean = new ProductBean();
			
			Bean.setGAPAN_NO(rs.getString("GAPAN_NO"));
			Bean.setSIGU_CD(rs.getString("SIGU_CD"));
			Bean.setBJ_CD(rs.getString("BJ_CD"));
			Bean.setTAX_NO(rs.getString("TAX_NO"));
			Bean.setDEPT_CD(rs.getString("DEPT_CD"));
			Bean.setTAX_GUBUN(rs.getString("TAX_GUBUN"));
			Bean.setTAX_YM(rs.getString("TAX_YM"));
			Bean.setOBJ_SET(rs.getString("OBJ_SET"));
			Bean.setTAXPAYER_ID(rs.getString("TAXPAYER_ID"));
			Bean.setTAXPAYER_SET(rs.getString("TAXPAYER_SET"));
			Bean.setLIVE(rs.getString("LIVE"));
			Bean.setINDATE(rs.getString("INDATE"));
			Bean.setOVERDATE(rs.getString("OVERDATE"));
			Bean.setTAX_DATE(rs.getString("TAX_DATE"));
			Bean.setADD_SET(rs.getString("ADD_SET"));
			Bean.setADD_YN(rs.getString("ADD_YN"));
			Bean.setNOTES(rs.getString("NOTES"));
			Bean.setLIMIT_SUM(rs.getString("LIMIT_SUM"));
			Bean.setLIMIT_CNT(rs.getString("LIMIT_CNT"));
			Bean.setRATE(rs.getString("RATE"));
			Bean.setRATE_CAUSE(rs.getString("RATE_CAUSE"));
			Bean.setBONSE(rs.getString("BONSE"));
			Bean.setGIGUM(rs.getString("GIGUM"));
			Bean.setGUKSE(rs.getString("GUKSE"));
			Bean.setSISE(rs.getString("SISE"));
			Bean.setGUSE(rs.getString("GUSE"));
			Bean.setVAT(rs.getString("VAT"));
			Bean.setINTAX(rs.getString("INTAX"));
			Bean.setOVERTAX(rs.getString("OVERTAX"));
			Bean.setFORM1(rs.getString("FORM1"));
			Bean.setFORM2(rs.getString("FORM2"));
			Bean.setYEAR(rs.getString("YEAR"));
			Bean.setSEQ(rs.getString("SEQ"));
			Bean.setTAX_YN(rs.getString("TAX_YN"));
			Bean.setOCR_SIGU_CD(rs.getString("OCR_SIGU_CD"));
			Bean.setOCR_BUSEO_CD(rs.getString("OCR_BUSEO_CD"));
			Bean.setSUBUSEO_CD(rs.getString("SUBUSEO_CD"));
			Bean.setTAX_CD(rs.getString("TAX_CD"));
			Bean.setGP_TYP(rs.getString("GP_TYP"));
			Bean.setCAL_SUM_SEQ(rs.getString("CAL_SUM_SEQ"));
			Bean.setCAL_MODE(rs.getString("CAL_MODE"));


			
			return Bean;
		}
	}
	//********** END_현진_20120222
	
	//********** BEGIN_현진_20120227
    // 부과정보 삭제
    public void executebugwaCancel(String gapanNo,String seq){
		Object[] values = {gapanNo,seq};
		
		ExecuteGapanCalSumInfoDelete executeGapanCalSumInfoDelete = new ExecuteGapanCalSumInfoDelete(getDataSource());
		ExecuteGapanCalculationDelete executeGapanCalculationDelete = new ExecuteGapanCalculationDelete(getDataSource());
		ExecuteGapanTaxationInfoDelete executeGapanTaxationInfoDelete = new ExecuteGapanTaxationInfoDelete(getDataSource());
		
		executeGapanCalSumInfoDelete.update(values);
		executeGapanCalculationDelete.update(values);
		executeGapanTaxationInfoDelete.update(values);	
	}
    
	// 부과 삭제 GapanCalSumInfo
	protected class ExecuteGapanCalSumInfoDelete extends SqlUpdate {
		public ExecuteGapanCalSumInfoDelete(DataSource dataSource) {
			super(dataSource, getMessageSourceAccessor().getMessage(
					"Querys.rojum.jumyong.GapanCalSumInfoDelete"));
			declareParameter(new SqlParameter(Types.VARCHAR)); //gapanNo
			declareParameter(new SqlParameter(Types.VARCHAR)); //SEQ
		}
	}

	// 부과 삭제 GapanCalculation
	protected class ExecuteGapanCalculationDelete extends SqlUpdate {
		public ExecuteGapanCalculationDelete(DataSource dataSource) {
			super(dataSource, getMessageSourceAccessor().getMessage(
					"Querys.rojum.jumyong.GapanCalculationDelete"));
			declareParameter(new SqlParameter(Types.VARCHAR)); //gapanNo
			declareParameter(new SqlParameter(Types.VARCHAR)); //SEQ
		}
	}

	// 부과 삭제 GapanTaxationInfo
	protected class ExecuteGapanTaxationInfoDelete extends SqlUpdate {
		public ExecuteGapanTaxationInfoDelete(DataSource dataSource) {
			super(dataSource, getMessageSourceAccessor().getMessage(
					"Querys.rojum.jumyong.GapanTaxationInfoDelete"));
			declareParameter(new SqlParameter(Types.VARCHAR)); //gapanNo
			declareParameter(new SqlParameter(Types.VARCHAR)); //SEQ
		}
	}	
	//********** END_현진_20120227	
    
}
