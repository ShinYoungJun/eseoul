package main.java.rojum.owner.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.List;
import java.util.Map;
import javax.sql.DataSource;
import main.java.common.dao.RoadsJdbcDaoSupport;
import main.java.common.util.catUtil.Util;
import main.java.rojum.owner.model.SearchBean;
import main.java.rojum.owner.model.AccuseBean;
import main.java.rojum.owner.model.ChangeJobBean;

import org.springframework.context.support.MessageSourceAccessor;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.MappingSqlQuery;
import org.springframework.jdbc.object.SqlUpdate;
import org.springframework.jdbc.support.lob.OracleLobHandler;

public class OwnerDao extends RoadsJdbcDaoSupport implements IOwnerDao {
	private OracleLobHandler oracleLobHandler = null;

	private Util util = new Util();

	protected void initDao() throws Exception {
		super.initDao();
		oracleLobHandler = new OracleLobHandler();
		
	}
	
    //고발등록 카운트
    public int getAccuseListCount(SearchBean bean){
		Object[] values = {
				bean.getGU_CD(),
				bean.getFROMDATE(),
				bean.getTODATE(),
				"%"+bean.getOWNER_NAME()+"%"
				};
		
		String sql = getMessageSourceAccessor().getMessage("Querys.rojum.owner.GetAccuseListCount");
		return getJdbcTemplate().queryForInt(sql, values);
    }
    
	// 고발등록 리스트
	public List getAccuseList(SearchBean bean) {
		GetAccuseListQuery getAccuseListQuery = new GetAccuseListQuery(getDataSource());
		Object[] values = {
				bean.getGU_CD(),
				bean.getFROMDATE(),
				bean.getTODATE(),
				"%"+bean.getOWNER_NAME()+"%",
				bean.getCURRENT_PAGE(),
				
				bean.getCOUNTER_PER_PAGE(),
				bean.getCOUNTER_PER_PAGE()
				};
		
		for (int i = 0; i < values.length; i++) {
			System.out.println(values[i]);
			
		}
		return getAccuseListQuery.execute(values);
    }
	protected class GetAccuseListQuery extends MappingSqlQuery {
		protected GetAccuseListQuery(DataSource ds) {
			super(ds, getMessageSourceAccessor().getMessage(
					"Querys.rojum.owner.GetAccuseList"));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
		}

		protected Object mapRow(ResultSet rs, int rownum) throws SQLException {
			
			AccuseBean Bean = new AccuseBean();
			
			Bean.setSEQ(rs.getString("SEQ"));
			Bean.setGU_CD(rs.getString("GU_CD"));
			Bean.setACCUSE_DATE(rs.getString("ACCUSE_DATE"));
			Bean.setACCUSE_DATA(rs.getString("ACCUSE_DATA"));
			Bean.setOWNER_NAME(rs.getString("OWNER_NAME"));
			Bean.setOWNER_SSN(rs.getString("OWNER_SSN"));
						
			return Bean;
		}
	}
	
	// 	고발등록
    public boolean insertAccuseInfo(AccuseBean bean){
    	try
		{
    		InsertAccuseInfoQuery insertAccuseInfoQuery = new InsertAccuseInfoQuery(getDataSource());
        	
    		Object[] values = {
    				bean.getGU_CD(),
    				bean.getOWNER_SSN(),
    				bean.getOWNER_NAME(),
    				bean.getACCUSE_DATE(),
    				bean.getACCUSE_DATA(),
    				
    				bean.getGU_CD()
    		};

    		insertAccuseInfoQuery.update(values);
		}
		catch (Exception e)
		{
			return false;

		}
		return true;
	}
    class InsertAccuseInfoQuery extends SqlUpdate {
		public InsertAccuseInfoQuery(DataSource dataSource) {

			super(dataSource, getMessageSourceAccessor().getMessage("Querys.rojum.owner.InsertAccuseInfo"));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			
			declareParameter(new SqlParameter(Types.VARCHAR));
		}
	}
    
	// 고발 수정
    public boolean modifyAccuseInfo(AccuseBean bean){
    	ModifyAccuseInfoQuery modifyAccuseInfoQuery = new ModifyAccuseInfoQuery(getDataSource());
    	
    	try{
    	Object[] values = { 
    		bean.getOWNER_SSN(),
    		bean.getOWNER_NAME(),
    		bean.getACCUSE_DATE(),
    		bean.getACCUSE_DATA(),
    		bean.getGU_CD(),
    		
    		bean.getSEQ()
    	};

    	modifyAccuseInfoQuery.update(values);
    	
    	}catch(Exception e){
    		e.printStackTrace();
    		return false;
    	}
    	return true;
    }
    
	class ModifyAccuseInfoQuery extends SqlUpdate {
		public ModifyAccuseInfoQuery(DataSource dataSource) {
			super(dataSource, getMessageSourceAccessor().getMessage(
					"Querys.rojum.owner.ModifyAccuseInfo"));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			
			declareParameter(new SqlParameter(Types.VARCHAR));
		}
	}
    
    
    
    //고발 삭제
    public boolean deleteAccuseInfo(AccuseBean bean){
    	DeleteAccuseInfoQuery deleteAccuseInfoQuery = new DeleteAccuseInfoQuery(getDataSource());
    	
    	try{
    	Object[] values = { 
    			bean.getGU_CD(),
    			bean.getSEQ()
    	};
    	
    	deleteAccuseInfoQuery.update(values);
    	}catch(Exception e){
    		e.printStackTrace();
    		return false;
    	}
    	return true;
    }
    
    protected class DeleteAccuseInfoQuery extends SqlUpdate {
		public DeleteAccuseInfoQuery(DataSource dataSource) {
			super(dataSource, getMessageSourceAccessor().getMessage(
					"Querys.rojum.owner.DeleteAccuseInfo"));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
		}
	}
    
    
    //전업지원등록 카운트
    public int getChangeJobListCount(SearchBean bean){
		Object[] values = {
				bean.getGU_CD(),
				bean.getFROMDATE(),
				bean.getTODATE(),
				"%"+bean.getOWNER_NAME()+"%"
				};
		
		String sql = getMessageSourceAccessor().getMessage("Querys.rojum.owner.GetChangeJobListCount");
		return getJdbcTemplate().queryForInt(sql, values);
    }
    
	// 전업지원등록 리스트
	public List getChangeJobList(SearchBean bean) {
		GetChangeJobListQuery getChangeJobListQuery = new GetChangeJobListQuery(getDataSource());
		Object[] values = {
				bean.getGU_CD(),
				bean.getFROMDATE(),
				bean.getTODATE(),
				"%"+bean.getOWNER_NAME()+"%",
				bean.getCURRENT_PAGE(),
				
				bean.getCOUNTER_PER_PAGE(),
				bean.getCOUNTER_PER_PAGE()
				};
		return getChangeJobListQuery.execute(values);
    }
	protected class GetChangeJobListQuery extends MappingSqlQuery {
		protected GetChangeJobListQuery(DataSource ds) {
			super(ds, getMessageSourceAccessor().getMessage(
					"Querys.rojum.owner.GetChangeJobList"));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
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
			Bean.setCHANGE_JOB_SECTION(rs.getString("CHANGE_JOB_SECTION"));
			Bean.setCHANGE_JOB_TYPE(rs.getString("CHANGE_JOB_TYPE"));
			Bean.setCHANGE_JOB_SECTION_NM(rs.getString("CHANGE_JOB_SECTION_NM"));
			Bean.setCHANGE_JOB_TYPE_NM(rs.getString("CHANGE_JOB_TYPE_NM"));
			Bean.setCHANGE_JOB_DATE(rs.getString("CHANGE_JOB_DATE"));
						
			return Bean;
		}
	}
	
	// 	전업지원등록
    public boolean insertChangeJobInfo(ChangeJobBean bean){
    	try
		{
    		InsertChangeJobInfoQuery insertChangeJobInfoQuery = new InsertChangeJobInfoQuery(getDataSource());
        	
    		Object[] values = {
    				bean.getGU_CD(),
    				bean.getOWNER_SSN(),
    				bean.getOWNER_NAME(),
    				bean.getCHANGE_JOB_SECTION(),
    				bean.getCHANGE_JOB_TYPE(),
    				
    				bean.getCHANGE_JOB_DATE(),
    				bean.getGU_CD()
    		};

    		insertChangeJobInfoQuery.update(values);
		}
		catch (Exception e)
		{
			e.printStackTrace();
			return false;
		}
		return true;
	}
    class InsertChangeJobInfoQuery extends SqlUpdate {
		public InsertChangeJobInfoQuery(DataSource dataSource) {

			super(dataSource, getMessageSourceAccessor().getMessage("Querys.rojum.owner.InsertChangeJobInfo"));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
		}
	}
    
	// 전업지원 수정
    public boolean modifyChangeJobInfo(ChangeJobBean bean){
    	ModifyChangeJobInfoQuery modifyChangeJobInfoQuery = new ModifyChangeJobInfoQuery(getDataSource());
    	
    	try{
    	Object[] values = { 
    		bean.getOWNER_SSN(),
    		bean.getOWNER_NAME(),
    		bean.getCHANGE_JOB_SECTION(),
    		bean.getCHANGE_JOB_TYPE(),
    		bean.getCHANGE_JOB_DATE(),
    		
    		bean.getGU_CD(),
    		bean.getSEQ()
    	};
    	
    	for (int i = 0; i < values.length; i++) {
    		System.out.println(values[i]);
			
		}

    	modifyChangeJobInfoQuery.update(values);
    	
    	}catch(Exception e){
    		e.printStackTrace();
    		return false;
    	}
    	return true;
    }
    
	class ModifyChangeJobInfoQuery extends SqlUpdate {
		public ModifyChangeJobInfoQuery(DataSource dataSource) {
			super(dataSource, getMessageSourceAccessor().getMessage(
					"Querys.rojum.owner.ModifyChangeJobInfo"));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
		}
	}
    
    
    
    //전업지원 삭제
    public boolean deleteChangeJob(ChangeJobBean bean){
    	DeleteChangeJobQuery deleteChangeJobQuery = new DeleteChangeJobQuery(getDataSource());
    	
    	try{
    	Object[] values = { 
    			bean.getGU_CD(),
    			bean.getSEQ()
    	};
    	
    	deleteChangeJobQuery.update(values);
    	}catch(Exception e){
    		return false;
    	}
    	return true;
    }
    
    protected class DeleteChangeJobQuery extends SqlUpdate {
		public DeleteChangeJobQuery(DataSource dataSource) {
			super(dataSource, getMessageSourceAccessor().getMessage(
					"Querys.rojum.owner.DeleteChangeJobInfo"));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
		}
	}
    
}
