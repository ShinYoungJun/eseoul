package main.java.schedule.dao;

import java.sql.Types;

import javax.sql.DataSource;

import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.SqlUpdate;

import main.java.common.dao.RoadsJdbcDaoSupport;
import main.java.jumyong.jumyong.model.ProductBean;
import main.java.schedule.model.LogBean;


public class ScheduleDao extends RoadsJdbcDaoSupport implements IScheduleDao{
	
	
	// 가판/노점 수납정보 업데이트
	public void gapanTaxationInfoUpdate() {
		
		GapanTaxationInfoUpdateQuery objGapanTaxationInfoUpdateQuery = new GapanTaxationInfoUpdateQuery(getDataSource());
			
		objGapanTaxationInfoUpdateQuery.update();
	}
	class GapanTaxationInfoUpdateQuery extends SqlUpdate {
		public GapanTaxationInfoUpdateQuery(DataSource dataSource) {
			super(dataSource, getMessageSourceAccessor().getMessage("Querys.schedule.GapanTaxationInfoUpdate"));
		}
	}
	
	// 도로 수납정보 업데이트
	public void taxationInfoUpdate() {
		
		TaxationInfoUpdateQuery objTaxationInfoUpdateQuery = new TaxationInfoUpdateQuery(getDataSource());
			
		objTaxationInfoUpdateQuery.update();
	}
	class TaxationInfoUpdateQuery extends SqlUpdate {
		public TaxationInfoUpdateQuery(DataSource dataSource) {
			super(dataSource, getMessageSourceAccessor().getMessage("Querys.schedule.TaxationInfoUpdate"));
		}
	}
	
	// 수납정보 저장
	public LogBean insertSunapInfo(LogBean objLogBean){
		
		InsertSunapInfoQuery objInsertSunapInfoQuery = new InsertSunapInfoQuery(getDataSource());	
		
		try{
			Object[] values = {
					objLogBean.getGIJUN_DATE(),
					objLogBean.getSYS_GUBUN(),	
					objLogBean.getDATA_GUBUN(),
					objLogBean.getSIGU_CD(),		
					objLogBean.getSEMOK_CD(),
					
					objLogBean.getTAX_YM(),		
					objLogBean.getTAX_GUBUN(),	
					objLogBean.getBUSEO_CD(), 			
					objLogBean.getTAX_NO(),  			
					objLogBean.getLAST_WORK_ID(),
					
					objLogBean.getOCR_SIGU_CD(),  	
					objLogBean.getOCR_BUSEO_CD(),  
					objLogBean.getLAST_WORK_DATE(),
					objLogBean.getSIDO_CD(),   		
					objLogBean.getNAP_ID(),
					
					objLogBean.getNAP_NM(),   			
					objLogBean.getNAP_GUBUN(),   	
					objLogBean.getSU_BUSEO_CD(),   
					objLogBean.getTAX_YMD(),   		
					objLogBean.getNAPGI_YMD(), 
					
					objLogBean.getNAPGI_AFT_YMD(),	
					objLogBean.getNAPBU_YMD(),   	
					objLogBean.getSEND_YMD(),   		
					objLogBean.getTAX_AMT(),   		
					objLogBean.getSISE(),   
					
					objLogBean.getSISE_IJA(),   		
					objLogBean.getGUSE(),   				
					objLogBean.getGUSE_IJA(),   		
					objLogBean.getGUKSE(),   			
					objLogBean.getGUKSE_IJA(),  
					
					objLogBean.getGIGUM(),   			
					objLogBean.getGIGUM_IJA(),   	
					objLogBean.getVAT_AMT(),   		
					objLogBean.getNAP_ZIP_CD(),   	
					objLogBean.getNAP_ZIP_ADDR(),  
					
					objLogBean.getNAP_DTL_ADDR(),  
					objLogBean.getRESIDE_STATUS(), 
					objLogBean.getMUL_GUBUN(),   	
					objLogBean.getMUL_NM(),   			
					objLogBean.getBOOK_NO(),  
					
					objLogBean.getHANGMOK1(),   		
					objLogBean.getHANGMOK2(),   		
					objLogBean.getHANGMOK3(),   		
					objLogBean.getHANGMOK4(),   		
					objLogBean.getHANGMOK5(), 
					
					objLogBean.getHANGMOK6(),   		
					objLogBean.getGASAN_RATE_GUBUN(),   	
					objLogBean.getGASAN_AMT_SKIP_GUBUN(),
					objLogBean.getBIGO(),   				
					objLogBean.getSU_NAPBU_YMD(),   
					
					objLogBean.getSU_NAPBU_GUBUN(),
					objLogBean.getOCR_GUBUN(),
					objLogBean.getSU_PRC_GUBUN(),
					objLogBean.getSU_SISE(),   			
					objLogBean.getSU_SISE_IJA(),  	
					
					objLogBean.getSU_GUSE(),   			
					objLogBean.getSU_GUSE_IJA(),   	
					objLogBean.getSU_GUKSE(),   			
					objLogBean.getSU_GUKSE_IJA(),   	
					objLogBean.getSU_GIGUM(),   
					
					objLogBean.getSU_GIGUM_IJA(),   	
					objLogBean.getSU_SISE_GASAN_SUM(), 
					objLogBean.getSU_GUSE_GASAN_SUM(), 
					objLogBean.getSU_GUKSE_GASAN_SUM(),
					objLogBean.getSU_GIGUM_GASAN_SUM(),
					
					objLogBean.getSU_VAT_AMT(),   	
					objLogBean.getSU_GUBUN(),   		
					objLogBean.getSU_CNT(),   			
					objLogBean.getGWAO_SISE(),   	
					objLogBean.getGWAO_SISE_IJA(), 
					
					objLogBean.getGWAO_GUSE(),   	
					objLogBean.getGWAO_GUSE_IJA(), 
					objLogBean.getGWAO_GUKSE(),   	
					objLogBean.getGWAO_GUKSE_IJA(),
					objLogBean.getGWAO_GIGUM(),   	
					
					objLogBean.getGWAO_GIGUM_IJA(),
					objLogBean.getGWAO_SISE_GASAN_SUM(), 
					objLogBean.getGWAO_GUSE_GASAN_SUM(), 
					objLogBean.getGWAO_GUKSE_GASAN_SUM(),
					objLogBean.getGWAO_GIGUM_GASAN_SUM(),
					
					objLogBean.getGWAO_VAT_AMT(),  
					objLogBean.getGWAO_SAYU_CD(),  
					objLogBean.getGWAO_SAYU_NM(),  
					objLogBean.getGWAO_YMD(),   		
					objLogBean.getGWAO_CNT()
					
			};
			
			objInsertSunapInfoQuery.update(values);
		
	} catch (Exception e) {
		e.printStackTrace();
	}		
	return objLogBean;		
	}
	
    class InsertSunapInfoQuery extends SqlUpdate {
        public InsertSunapInfoQuery(DataSource dataSource) {

            super(dataSource, getMessageSourceAccessor().getMessage("Querys.schedule.SunapInfoInsert"));
            	//1
                declareParameter(new SqlParameter(Types.VARCHAR));
          		declareParameter(new SqlParameter(Types.VARCHAR));
          		declareParameter(new SqlParameter(Types.VARCHAR));
          		declareParameter(new SqlParameter(Types.VARCHAR));
          		declareParameter(new SqlParameter(Types.VARCHAR));
            	//2          		
                declareParameter(new SqlParameter(Types.VARCHAR));
          		declareParameter(new SqlParameter(Types.VARCHAR));
          		declareParameter(new SqlParameter(Types.VARCHAR));
          		declareParameter(new SqlParameter(Types.VARCHAR));
          		declareParameter(new SqlParameter(Types.VARCHAR));
            	//3          		
                declareParameter(new SqlParameter(Types.VARCHAR));
          		declareParameter(new SqlParameter(Types.VARCHAR));
          		declareParameter(new SqlParameter(Types.VARCHAR));
          		declareParameter(new SqlParameter(Types.VARCHAR));
          		declareParameter(new SqlParameter(Types.VARCHAR));
            	//4        		
                declareParameter(new SqlParameter(Types.VARCHAR));
          		declareParameter(new SqlParameter(Types.VARCHAR));
          		declareParameter(new SqlParameter(Types.VARCHAR));
          		declareParameter(new SqlParameter(Types.VARCHAR));
          		declareParameter(new SqlParameter(Types.VARCHAR));
            	//5          		
                declareParameter(new SqlParameter(Types.VARCHAR));
          		declareParameter(new SqlParameter(Types.VARCHAR));
          		declareParameter(new SqlParameter(Types.VARCHAR));
          		declareParameter(new SqlParameter(Types.VARCHAR));
          		declareParameter(new SqlParameter(Types.VARCHAR));
            	//6
                declareParameter(new SqlParameter(Types.VARCHAR));
          		declareParameter(new SqlParameter(Types.VARCHAR));
          		declareParameter(new SqlParameter(Types.VARCHAR));
          		declareParameter(new SqlParameter(Types.VARCHAR));
          		declareParameter(new SqlParameter(Types.VARCHAR));
            	//7
                declareParameter(new SqlParameter(Types.VARCHAR));
          		declareParameter(new SqlParameter(Types.VARCHAR));
          		declareParameter(new SqlParameter(Types.VARCHAR));
          		declareParameter(new SqlParameter(Types.VARCHAR));
          		declareParameter(new SqlParameter(Types.VARCHAR));
            	//8
                declareParameter(new SqlParameter(Types.VARCHAR));
          		declareParameter(new SqlParameter(Types.VARCHAR));
          		declareParameter(new SqlParameter(Types.VARCHAR));
          		declareParameter(new SqlParameter(Types.VARCHAR));
          		declareParameter(new SqlParameter(Types.VARCHAR));
            	//9
                declareParameter(new SqlParameter(Types.VARCHAR));
          		declareParameter(new SqlParameter(Types.VARCHAR));
          		declareParameter(new SqlParameter(Types.VARCHAR));
          		declareParameter(new SqlParameter(Types.VARCHAR));
          		declareParameter(new SqlParameter(Types.VARCHAR));
            	//10
                declareParameter(new SqlParameter(Types.VARCHAR));
          		declareParameter(new SqlParameter(Types.VARCHAR));
          		declareParameter(new SqlParameter(Types.VARCHAR));
          		declareParameter(new SqlParameter(Types.VARCHAR));
          		declareParameter(new SqlParameter(Types.VARCHAR));
            	//11
                declareParameter(new SqlParameter(Types.VARCHAR));
          		declareParameter(new SqlParameter(Types.VARCHAR));
          		declareParameter(new SqlParameter(Types.VARCHAR));
          		declareParameter(new SqlParameter(Types.VARCHAR));
          		declareParameter(new SqlParameter(Types.VARCHAR));
            	//12
                declareParameter(new SqlParameter(Types.VARCHAR));
          		declareParameter(new SqlParameter(Types.VARCHAR));
          		declareParameter(new SqlParameter(Types.VARCHAR));
          		declareParameter(new SqlParameter(Types.VARCHAR));
          		declareParameter(new SqlParameter(Types.VARCHAR));
            	//13
                declareParameter(new SqlParameter(Types.VARCHAR));
          		declareParameter(new SqlParameter(Types.VARCHAR));
          		declareParameter(new SqlParameter(Types.VARCHAR));
          		declareParameter(new SqlParameter(Types.VARCHAR));
          		declareParameter(new SqlParameter(Types.VARCHAR));
            	//14
                declareParameter(new SqlParameter(Types.VARCHAR));
          		declareParameter(new SqlParameter(Types.VARCHAR));
          		declareParameter(new SqlParameter(Types.VARCHAR));
          		declareParameter(new SqlParameter(Types.VARCHAR));
          		declareParameter(new SqlParameter(Types.VARCHAR));
            	//15
                declareParameter(new SqlParameter(Types.VARCHAR));
          		declareParameter(new SqlParameter(Types.VARCHAR));
          		declareParameter(new SqlParameter(Types.VARCHAR));
          		declareParameter(new SqlParameter(Types.VARCHAR));
          		declareParameter(new SqlParameter(Types.VARCHAR));
            	//16
                declareParameter(new SqlParameter(Types.VARCHAR));
          		declareParameter(new SqlParameter(Types.VARCHAR));
          		declareParameter(new SqlParameter(Types.VARCHAR));
          		declareParameter(new SqlParameter(Types.VARCHAR));
          		declareParameter(new SqlParameter(Types.VARCHAR));
            	//17
                declareParameter(new SqlParameter(Types.VARCHAR));
          		declareParameter(new SqlParameter(Types.VARCHAR));
          		declareParameter(new SqlParameter(Types.VARCHAR));
          		declareParameter(new SqlParameter(Types.VARCHAR));
          		declareParameter(new SqlParameter(Types.VARCHAR));
          		}
    }
    
    
	// 가판/노점 수납정보 업데이트
	public void cpBd600Update() {
		try{
		String sql = getMessageSourceAccessor().getMessage("Querys.schedule.cpBd600Update");
		
		getJdbcTemplate().execute(sql);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	
}

