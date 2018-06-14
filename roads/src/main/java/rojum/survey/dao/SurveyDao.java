package main.java.rojum.survey.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import main.java.common.dao.RoadsJdbcDaoSupport;
import main.java.common.util.catUtil.Util;
import main.java.rojum.survey.model.GapanBaseBean;
import main.java.rojum.survey.model.GapanHeadBean;
import main.java.rojum.survey.model.GapanInfoBean;
import main.java.rojum.survey.model.SearchBean;
import main.java.rojum.survey.model.SurveyBean;

import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.MappingSqlQuery;
import org.springframework.jdbc.object.SqlUpdate;
import org.springframework.jdbc.support.lob.OracleLobHandler;

public class SurveyDao extends RoadsJdbcDaoSupport implements ISurveyDao {
	private OracleLobHandler oracleLobHandler = null;
 
	private Util util = new Util();

	protected void initDao() throws Exception {
		super.initDao();
		oracleLobHandler = new OracleLobHandler();
		
	}
	
	public	String	executeCheck_Gapanno(String gapanNo){
    	Object[] values = {gapanNo};

    	String sql = getMessageSourceAccessor().getMessage("Querys.rojum.survey.getGapanno");	
    	
    	//강남구, 노원구
    	String[] gangnamBj = {"680101", "680106", "680107", "680108", "680118", "350105"};
    	for(int i=0; i<gangnamBj.length; i++){
    		if(gapanNo.contains(gangnamBj[i])){
    			System.out.println("gangnamBj: "  + gangnamBj);
    			sql = getMessageSourceAccessor().getMessage("Querys.rojum.jumyong.getGapanno_gangNam");
    			//sql = getMessageSourceAccessor().getMessage("Querys.rojum.jumyong.getGapanno_nowon");
    		}
    	}
    	
    	Map Request_Map =getJdbcTemplate().queryForMap(sql, values);							//'_4_0001'의 형식으로 가져온다.
    	gapanNo = gapanNo + Request_Map.get("GAPAN_NO").toString();							//(구코드+법정동코드) + '_4_0001'
    	return gapanNo;
	}
	
	
	 //	GAPAN_BASE 정보 등록
    public	boolean	executeGapan_Base_Register(GapanBaseBean Bean)
	{
    	Gapan_Base_Register objGapan_Base_Register = new Gapan_Base_Register(getDataSource());
    	try
		{
    		Object[] values = {
					Bean.getGAPAN_NO(),
					Bean.getREG_DATE(),
					Bean.getUP_DATE(),
					Bean.getMANAGER(),
					Bean.getFINISH_ID(),
					
					Bean.getGP_TYPE()
			};
    		
    		for(int i = 0 ; i < values.length ; i ++){
    			System.out.println(": executeGapan_Base_Register :" + values[i]);
    		}

    		objGapan_Base_Register.update(values);
		}
		catch (Exception e)
		{
			e.printStackTrace();
			return	false;
		}
		
		return	true;
	}
    
    
    protected class Gapan_Base_Register extends SqlUpdate {
    	protected Gapan_Base_Register(DataSource dataSource) {

			super(dataSource, getMessageSourceAccessor().getMessage(
					"Querys.rojum.survey.Gapan_Base_Register"));

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
    	Gapan_Head_Register objGapan_Head_Register = new Gapan_Head_Register(getDataSource());
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
					Bean.getTOBD_NM(),
					Bean.getTOBD_DET_NM(),
					
					Bean.getLT_SEL(),					
					//********** BEGIN_현진_20120328
					//Bean.getNOTE()
					Bean.getNOTE(),
					Bean.getDONG(),
					Bean.getRI(),
					Bean.getBON(),
					Bean.getBU(),
					Bean.getTDONG(),
					Bean.getT_RI(),
					Bean.getTBON(),
					Bean.getTBU()
					//********** END_현진_20120328

			};
			
    		for(int i = 0 ; i < values.length ; i ++){
    			System.out.println(": executeGapan_Head_Register :" + values[i]);
    		}

			objGapan_Head_Register.update(values);
		}
		catch (Exception e)
		{
			e.printStackTrace();
			return	false;
		}
		
		return	true;
    }
    
    
    protected class Gapan_Head_Register extends SqlUpdate {
    	protected Gapan_Head_Register(DataSource dataSource) {

			super(dataSource, getMessageSourceAccessor().getMessage("Querys.rojum.survey.Gapan_Head_Register"));

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
	
	
    //	GAPAN_INFO  테이블에 등록
    public	boolean	executeGapan_Info_Register(GapanInfoBean Bean){
    	Gapan_Info_Register objGapan_Info_Register = new Gapan_Info_Register(getDataSource());
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
					Bean.getSURVEY_YEAR(),
					Bean.getMANAGE_TYP(),
					Bean.getFT_CAT(),
					Bean.getSPECIAL_DATE(),					

					Bean.getCAR_NO(),
					Bean.getREG_SEQ(),
					Bean.getREG_NAME(),
					Bean.getGUGAN_CD(),

					// #mr 2014.03.25
					Bean.getWITH_DORO_NM(),
					Bean.getWITH_BD_BON(),
					Bean.getWITH_BD_BU(),
					
					/* 2014.06 DORO JIBUN KNY */
					Bean.getJIBUN()
			};
			System.out.println(values.length);
			System.out.println(Bean.getJIBUN());
    		for(int i = 0 ; i < values.length ; i ++){
    			//System.out.println(": executeGapan_Info_Register :" + values[i]);
    		}

			objGapan_Info_Register.update(values);
		}
		catch (Exception e)
		{
			e.printStackTrace();
			return	false;
		}
		
		return	true;
    }
    
    protected class Gapan_Info_Register extends SqlUpdate {
    	protected Gapan_Info_Register(DataSource dataSource) {

			super(dataSource, getMessageSourceAccessor().getMessage("Querys.rojum.survey.Gapan_Info_Register"));
            
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

            // #mr 2014.03.25
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));

            /* 2014.06 DORO JIBUN KNY */
            declareParameter(new SqlParameter(Types.VARCHAR));
        }
    }
    
    //기본정보 복사
    public	boolean	insertCopyGapanBase(String newGapanNo, String oldGapanNo)
	{
    	InsertCopyGapanBaseQuery insertCopyGapanBaseQuery = new InsertCopyGapanBaseQuery(getDataSource());
		try
		{
			System.out.println("newGapanNo : " + newGapanNo + "\noldGapanNo : " + oldGapanNo);
			Object[] values = {newGapanNo, oldGapanNo};
			
			insertCopyGapanBaseQuery.update(values);
		}
		catch (Exception e)
		{
			e.printStackTrace();
			return	false;
		}
		
		return	true;
    }
    
    
    protected class InsertCopyGapanBaseQuery extends SqlUpdate {
    	protected InsertCopyGapanBaseQuery(DataSource dataSource) {

			super(dataSource, getMessageSourceAccessor().getMessage("Querys.rojum.survey.insertCopyGapanBase"));

            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
        }
    }
    
  //운영자 정보 복사
    public	boolean	insertCopyGapanHead(String newGapanNo, String oldGapanNo)
	{
    	InsertCopyGapanHeadQuery insertCopyGapanHeadQuery = new InsertCopyGapanHeadQuery(getDataSource());
		try
		{
			Object[] values = {newGapanNo, oldGapanNo};
			
			insertCopyGapanHeadQuery.update(values);
		}
		catch (Exception e)
		{
			e.printStackTrace();
			return	false;
		}
		
		return	true;
    }
    
    
    protected class InsertCopyGapanHeadQuery extends SqlUpdate {
    	protected InsertCopyGapanHeadQuery(DataSource dataSource) {

			super(dataSource, getMessageSourceAccessor().getMessage("Querys.rojum.survey.insertCopyGapanHead"));

            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
        }
    }
    
    
  //시설운영정보 복사
    public	boolean	insertCopyGapanInfo(String newGapanNo, String oldGapanNo)
	{
    	InsertCopyGapanInfoQuery insertCopyGapanInfoQuery = new InsertCopyGapanInfoQuery(getDataSource());
		try
		{
			Object[] values = {newGapanNo, oldGapanNo};
			
			insertCopyGapanInfoQuery.update(values);
		}
		catch (Exception e)
		{
			e.printStackTrace();
			return	false;
		}
		
		return	true;
    }
    
    
    protected class InsertCopyGapanInfoQuery extends SqlUpdate {
    	protected InsertCopyGapanInfoQuery(DataSource dataSource) {

			super(dataSource, getMessageSourceAccessor().getMessage("Querys.rojum.survey.insertCopyGapanInfo"));

            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
        }
    }
	
	//실태조사 조회
    public List getSurveyList(SearchBean objectSearchBean){
    	GetSurveyListQuery getSurveyListQuery = new GetSurveyListQuery(getDataSource());
    	GetSurveyListExcelQuery getSurveyListExcelQuery = new GetSurveyListExcelQuery(getDataSource());
    	
    	
    	if(objectSearchBean.getEXCEL().equals("Y")){
    		Object[] values = { 
    				objectSearchBean.getYEAR(),
    				objectSearchBean.getGAPAN_NO().equals("")?"%":"%"+objectSearchBean.getGAPAN_NO()+"%",
    						objectSearchBean.getOWNER_NAME().equals("")?"%":"%"+objectSearchBean.getOWNER_NAME()+"%",
    				objectSearchBean.getGU_CD(),
    				objectSearchBean.getBJ_CD().equals("")?"%":objectSearchBean.getBJ_CD(),
    				objectSearchBean.getBONBUN().equals("")?"%":objectSearchBean.getBONBUN(),
    				
    				objectSearchBean.getBUBUN().equals("")?"%":objectSearchBean.getBUBUN(),
    				//********** BEGIN_현진_20120312
    						//objectSearchBean.getSECTION()
    				objectSearchBean.getSECTION(),
    				objectSearchBean.getGUGAN_CD().equals("")?"%":objectSearchBean.getGUGAN_CD()
    				//********** END_현진_20120312
    		};
    		return getSurveyListExcelQuery.execute(values);
    		
    	}else{
    		Object[] values = { 
    				objectSearchBean.getYEAR(),
    				objectSearchBean.getGAPAN_NO().equals("")?"%":"%"+objectSearchBean.getGAPAN_NO()+"%",
    						objectSearchBean.getOWNER_NAME().equals("")?"%":"%"+objectSearchBean.getOWNER_NAME()+"%",
    				objectSearchBean.getGU_CD(),
    				objectSearchBean.getBJ_CD().equals("")?"%":objectSearchBean.getBJ_CD(),
    				objectSearchBean.getBONBUN().equals("")?"%":objectSearchBean.getBONBUN(),
    				
    				objectSearchBean.getBUBUN().equals("")?"%":objectSearchBean.getBUBUN(),
    				objectSearchBean.getSECTION(),
    				//********** BEGIN_현진_20120312
    				objectSearchBean.getGUGAN_CD().equals("")?"%":objectSearchBean.getGUGAN_CD(),
    				//********** END_현진_20120312
    						
    				//objectSearchBean.getFT_TYP(),
    				objectSearchBean.getFT_TYP().equals("")?"%":objectSearchBean.getFT_TYP(),		
    				objectSearchBean.getCURRENT_PAGE(),
    				objectSearchBean.getCOUNTER_PER_PAGE(),
    				objectSearchBean.getCOUNTER_PER_PAGE()
    				
    				
    		};
    		return getSurveyListQuery.execute(values);
    	}
	}
	
	//민원 조회 -WEB
	protected class GetSurveyListQuery extends MappingSqlQuery {
		protected GetSurveyListQuery(DataSource ds) {
			super(ds, getMessageSourceAccessor().getMessage("Querys.rojum.survey.getSurveyList"));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			
			System.out.println("GetSurveyListQuery::GetSurveyListQuery");
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			
			declareParameter(new SqlParameter(Types.VARCHAR));
			//********** BEGIN_현진_20120312
			declareParameter(new SqlParameter(Types.VARCHAR));
			//********** END_현진_20120312
			
			declareParameter(new SqlParameter(Types.VARCHAR));
		}

		protected Object mapRow(ResultSet rs, int rownum) throws SQLException {
			System.out.println("SurveyDao.GetSurveyListQuery::mapRow[Querys.rojum.survey.getSurveyList]");
			
			SurveyBean bean = new SurveyBean();
			bean.setR_ID(rs.getString("R_ID"));
			bean.setGAPAN_NO(rs.getString("GAPAN_NO"));
			bean.setOWNER_NAME(rs.getString("OWNER_NAME"));
			bean.setOWNER_SSN(rs.getString("OWNER_SSN"));
			bean.setWITH_ADDR(rs.getString("WITH_ADDR"));
			bean.setPLACE_A(rs.getString("PLACE_A"));
			bean.setFT_TYP_NM(rs.getString("FT_TYP_NM"));
			bean.setFT_SEL_NM(rs.getString("FT_SEL_NM"));
			bean.setMAINTN_OB(rs.getString("MAINTN_OB"));
			bean.setTAXTATION_AT(rs.getString("TAXTATION_AT"));
			bean.setSURVEY_YEAR(rs.getString("SURVEY_YEAR"));
			bean.setREG_DATE(rs.getString("REG_DATE"));
			bean.setFOUND_DATE(rs.getString("FOUND_DATE"));
			bean.setSPECIAL_ST(rs.getString("SPECIAL_ST"));
			bean.setSPECIAL_DATE(rs.getString("SPECIAL_DATE"));
//System.out.println("SI="+rs.getString("SI"));
//System.out.println("GUN="+rs.getString("GUN"));
//System.out.println("DORO_NM="+rs.getString("DORO_NM"));
//System.out.println("BD_NM="+rs.getString("BD_NM"));
//System.out.println("BD_NM="+rs.getString("BD_DET_NM"));
			bean.setSI(rs.getString("SI"));
			bean.setGUN(rs.getString("GUN"));
			bean.setDORO_NM(rs.getString("DORO_NM"));
			bean.setBD_NM(rs.getString("BD_NM"));
			bean.setBD_DET_NM(rs.getString("BD_DET_NM"));
			bean.setBD_BON(rs.getString("BD_BON"));
			bean.setBD_BU(rs.getString("BD_BU"));
			bean.setADDR_NEW(rs.getString("ADDR_NEW"));
			//********** BEGIN_현진_20120312
			bean.setGUGAN_CD(rs.getString("GUGAN_CD"));
			bean.setFT_TYP(rs.getString("FT_TYP"));
			//********** END_현진_20120312
			//********** BEGIN_KANG_20120620
			bean.setOWNER_HP(rs.getString("OWNER_HP"));
			bean.setSG_TYP(rs.getString("SG_TYP"));
			bean.setUN_TYP(rs.getString("UN_TYP"));
			//********** END_KANG_20120620
			return bean;
		}
	}
	
	//민원 조회 -EXCEL
	protected class GetSurveyListExcelQuery extends MappingSqlQuery {
		protected GetSurveyListExcelQuery(DataSource ds) {
			super(ds, getMessageSourceAccessor().getMessage("Querys.rojum.survey.getSurveyListExcel"));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			
			System.out.println("GetSurveyListExcelQuery::GetSurveyListExcelQuery");
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			//********** BEGIN_현진_20120312
			declareParameter(new SqlParameter(Types.VARCHAR));
			//********** END_현진_20120312
		}

		protected Object mapRow(ResultSet rs, int rownum) throws SQLException {
			System.out.println("GetSurveyListExcelQuery::mapRow");
			SurveyBean bean = new SurveyBean();
			bean.setR_ID(rs.getString("R_ID"));
			bean.setGAPAN_NO(rs.getString("GAPAN_NO"));
			bean.setFT_TYP(rs.getString("FT_TYP"));
			bean.setOWNER_NAME(rs.getString("OWNER_NAME"));
			bean.setOWNER_SSN(rs.getString("OWNER_SSN"));
			bean.setWITH_ADDR(rs.getString("WITH_ADDR"));
			
			bean.setSI(rs.getString("SI"));
			bean.setGUN(rs.getString("GUN"));
			bean.setDORO_NM(rs.getString("DORO_NM"));
			bean.setBD_NM(rs.getString("BD_NM"));
			bean.setBD_DET_NM(rs.getString("BD_DET_NM"));
			bean.setBD_BON(rs.getString("BD_BON"));
			bean.setBD_BU(rs.getString("BD_BU"));
			bean.setADDR_NEW(rs.getString("ADDR_NEW"));
			/* 20121024 by ksic 실 거주지 주소 추가 시작 */
			bean.setADDR_JIBUN(rs.getString("ADDR_JIBUN"));
			/* 20121024 by ksic 실 거주지 주소 추가 끝 */

			bean.setPLACE_A(rs.getString("PLACE_A"));
			bean.setFT_TYP_NM(rs.getString("FT_TYP_NM"));
			bean.setFT_SEL_NM(rs.getString("FT_SEL_NM"));
			bean.setMAINTN_OB(rs.getString("MAINTN_OB"));
			bean.setTAXTATION_AT(rs.getString("TAXTATION_AT"));
			bean.setSURVEY_YEAR(rs.getString("SURVEY_YEAR"));
			bean.setREG_DATE(rs.getString("REG_DATE"));
			bean.setFOUND_DATE(rs.getString("FOUND_DATE"));
			bean.setSPECIAL_ST(rs.getString("SPECIAL_ST"));
			bean.setSPECIAL_DATE(rs.getString("SPECIAL_DATE"));
			//********** BEGIN_현진_20120312
			bean.setGUGAN_CD(rs.getString("GUGAN_CD"));
			//********** END_현진_20120312
			//********** BEGIN_KANG_20120620
			bean.setOWNER_HP(rs.getString("OWNER_HP"));
			bean.setSG_TYP(rs.getString("SG_TYP"));
			bean.setUN_TYP(rs.getString("UN_TYP"));
			//********** END_KANG_20120620
			
			return bean;
		}
	}
    
	//실태조사 카운트
    public Map getSurveyListCount(SearchBean objectSearchBean){
    	Object[] values = { 
				objectSearchBean.getYEAR(),
				objectSearchBean.getGAPAN_NO().equals("")?"%":"%"+objectSearchBean.getGAPAN_NO()+"%",
				objectSearchBean.getOWNER_NAME().equals("")?"%":"%"+objectSearchBean.getOWNER_NAME()+"%",
				objectSearchBean.getGU_CD(),
				objectSearchBean.getBJ_CD().equals("")?"%":objectSearchBean.getBJ_CD(),
				objectSearchBean.getBONBUN().equals("")?"%":objectSearchBean.getBONBUN(),
				
				objectSearchBean.getBUBUN().equals("")?"%":objectSearchBean.getBUBUN(),							
				//********** BEGIN_현진_20120312
				//objectSearchBean.getSECTION()	
				objectSearchBean.getSECTION()	,
				objectSearchBean.getGUGAN_CD().equals("")?"%":objectSearchBean.getGUGAN_CD(),
				//********** END_현진_20120312
						
						objectSearchBean.getFT_TYP().equals("")?"%":objectSearchBean.getFT_TYP()
		};

    	for (int i = 0; i < values.length; i++) {
			System.out.println(values[i]);
		}
		String sql = getMessageSourceAccessor().getMessage("Querys.rojum.survey.getSurveyListCount");
		return getJdbcTemplate().queryForMap(sql, values);
    }
    
    //거리조성 변경
    public boolean modifySpecialStreet(GapanInfoBean bean){
    	ModifySpecialStreetQuery modifySpecialStreetQuery = new ModifySpecialStreetQuery(getDataSource());
		try
		{
			Object[] values = {
				bean.getSPECIAL_ST(),
				bean.getSPECIAL_DATE(),
				bean.getGAPAN_NO()
			};
			
			modifySpecialStreetQuery.update(values);
		}
		catch (Exception e)
		{
			e.printStackTrace();
			return	false;
		}
		
		return	true;
    }
    
    
    protected class ModifySpecialStreetQuery extends SqlUpdate {
    	protected ModifySpecialStreetQuery(DataSource dataSource) {

			super(dataSource, getMessageSourceAccessor().getMessage("Querys.rojum.survey.modifySpecialStreet"));

            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
        }
    }
	
}
