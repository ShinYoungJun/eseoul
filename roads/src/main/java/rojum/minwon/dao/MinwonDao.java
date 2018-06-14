package main.java.rojum.minwon.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.List;

import javax.sql.DataSource;

import main.java.common.dao.RoadsJdbcDaoSupport;
import main.java.common.util.catUtil.Util;
import main.java.rojum.minwon.model.MinwonBean;

import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.MappingSqlQuery;
import org.springframework.jdbc.object.SqlUpdate;
import org.springframework.jdbc.support.lob.OracleLobHandler;

public class MinwonDao extends RoadsJdbcDaoSupport implements IMinwonDao {
	private OracleLobHandler oracleLobHandler = null;
	private Util util = new Util();

	protected void initDao() throws Exception {
		super.initDao();
		oracleLobHandler = new OracleLobHandler();
	}
	
	
	//¹Î¿ø Á¶È¸
    public List getMinwonList(MinwonBean objMinwonBean){
    	
    	GetMinwonListQuery getMinwonListQuery = new GetMinwonListQuery(getDataSource());
    	GetMinwonListExelQuery getMinwonListExcelQuery = new GetMinwonListExelQuery(getDataSource());
    	
    	if(objMinwonBean.getEXCEL().equals("Y")){
    		Object[] values = { 
    				objMinwonBean.getGU_CD(),
    				objMinwonBean.getFROMDATE(),
    				objMinwonBean.getTODATE()
    		};
    		return getMinwonListExcelQuery.execute(values);
    		
    	}else{
    		Object[] values = { 
    				objMinwonBean.getGU_CD(),
    				objMinwonBean.getFROMDATE(),
    				objMinwonBean.getTODATE(),
    				objMinwonBean.getCURRENT_PAGE(),
    				objMinwonBean.getCOUNTER_PER_PAGE(),
    				objMinwonBean.getCOUNTER_PER_PAGE()
    		};
    		return getMinwonListQuery.execute(values);
    	}
	}
	
	//¹Î¿ø Á¶È¸ -WEB
	protected class GetMinwonListQuery extends MappingSqlQuery {
		protected GetMinwonListQuery(DataSource ds) {
			super(ds, getMessageSourceAccessor().getMessage("Querys.rojum.minwon.getMinwonList"));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
		}

		protected Object mapRow(ResultSet rs, int rownum) throws SQLException {
			MinwonBean bean = new MinwonBean();
			bean.setR_ID(rs.getString("R_ID"));
			bean.setGU_CD(rs.getString("GU_CD"));
			bean.setREGIST_DATE(rs.getString("REGIST_DATE"));
			bean.setREGIST_ID(rs.getString("REGIST_ID"));
			bean.setUPDATE_ID(rs.getString("UPDATE_ID"));
			bean.setCOL1(rs.getString("COL1"));
			bean.setCOL2(rs.getString("COL2"));
			bean.setCOL3(rs.getString("COL3"));
			bean.setCOL4(rs.getString("COL4"));
			bean.setCOL5(rs.getString("COL5"));
			bean.setCOL6(rs.getString("COL6"));
			bean.setCOL7(rs.getString("COL7"));
			bean.setCOL8(rs.getString("COL8"));
			bean.setCOL_SUM(rs.getString("COL_SUM"));
			return bean;
		}
	}
	
	//¹Î¿ø Á¶È¸ -EXCEL
	protected class GetMinwonListExelQuery extends MappingSqlQuery {
		protected GetMinwonListExelQuery(DataSource ds) {
			super(ds, getMessageSourceAccessor().getMessage("Querys.rojum.minwon.getMinwonListExel"));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
		}

		protected Object mapRow(ResultSet rs, int rownum) throws SQLException {
			MinwonBean bean = new MinwonBean();
			
			bean.setR_ID(rs.getString("R_ID"));
			bean.setGU_CD(rs.getString("GU_CD"));
			bean.setREGIST_DATE(rs.getString("REGIST_DATE"));
			bean.setREGIST_ID(rs.getString("REGIST_ID"));
			bean.setUPDATE_ID(rs.getString("UPDATE_ID"));
			bean.setCOL1(rs.getString("COL1"));
			bean.setCOL2(rs.getString("COL2"));
			bean.setCOL3(rs.getString("COL3"));
			bean.setCOL4(rs.getString("COL4"));
			bean.setCOL5(rs.getString("COL5"));
			bean.setCOL6(rs.getString("COL6"));
			bean.setCOL7(rs.getString("COL7"));
			bean.setCOL8(rs.getString("COL8"));
			bean.setCOL_SUM(rs.getString("COL_SUM"));

			return bean;
		}
	}
	
    //¹Î¿ø Á¶È¸ °³¼ö
    public int getMinwonListCount(MinwonBean objMinwonBean){
		Object[] values = { 
				objMinwonBean.getGU_CD(),
				objMinwonBean.getFROMDATE(),
				objMinwonBean.getTODATE()
		};
		String sql = getMessageSourceAccessor().getMessage("Querys.rojum.minwon.getMinwonListCount");
		return getJdbcTemplate().queryForInt(sql, values);
	}
    
    //¹Î¿øÇöÈ² µî·Ï
    public boolean insertMinwon(MinwonBean objMinwonBean){
    	InsertMinwonQuery insertMinwonQuery = new InsertMinwonQuery(getDataSource());
    	
    	try{
    	Object[] values = { 
    			objMinwonBean.getCOL1().equals("")?"0":objMinwonBean.getCOL1(),
    			objMinwonBean.getCOL2().equals("")?"0":objMinwonBean.getCOL2(),
				objMinwonBean.getCOL3().equals("")?"0":objMinwonBean.getCOL3(),
				objMinwonBean.getCOL4().equals("")?"0":objMinwonBean.getCOL4(),
    			objMinwonBean.getCOL5().equals("")?"0":objMinwonBean.getCOL5(),
    			
    			objMinwonBean.getCOL6().equals("")?"0":objMinwonBean.getCOL6(),
    			objMinwonBean.getCOL7().equals("")?"0":objMinwonBean.getCOL7(),
    	    	objMinwonBean.getCOL8().equals("")?"0":objMinwonBean.getCOL8(),
    			objMinwonBean.getGU_CODE(),
    			objMinwonBean.getREGIST_ID(),
    			
    			objMinwonBean.getREGIST_DATE()
    	};
    	
    	for (int i = 0; i < values.length; i++) {
			System.out.println(values[i]);
		}

		insertMinwonQuery.update(values);
    	}catch(Exception e){
    		e.printStackTrace();
    		return false;
    	}
    	return true;
    }
    
	// ¹Î¿øÇöÈ² µî·Ï
	class InsertMinwonQuery extends SqlUpdate {
		public InsertMinwonQuery(DataSource dataSource) {
			super(dataSource, getMessageSourceAccessor().getMessage("Querys.rojum.minwon.insertMinwon"));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
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
	
    
    //¹Î¿øÇöÈ² ¼öÁ¤
    public boolean updateMinwon(MinwonBean objMinwonBean){
    	UpdateMinwonQuery updateMinwonQuery = new UpdateMinwonQuery(getDataSource());
    	
    	try{
    	Object[] values = { 
    			objMinwonBean.getCOL1().equals("")?"0":objMinwonBean.getCOL1(),
    			objMinwonBean.getCOL2().equals("")?"0":objMinwonBean.getCOL2(),
				objMinwonBean.getCOL3().equals("")?"0":objMinwonBean.getCOL3(),
				objMinwonBean.getCOL4().equals("")?"0":objMinwonBean.getCOL4(),
    			objMinwonBean.getCOL5().equals("")?"0":objMinwonBean.getCOL5(),
    			
    			objMinwonBean.getCOL6().equals("")?"0":objMinwonBean.getCOL6(),
    			objMinwonBean.getCOL7().equals("")?"0":objMinwonBean.getCOL7(),
    	    	objMinwonBean.getCOL8().equals("")?"0":objMinwonBean.getCOL8(),
    			objMinwonBean.getUPDATE_ID(),
    			objMinwonBean.getGU_CODE(),
    			
    			objMinwonBean.getREGIST_DATE()
    	};

    	updateMinwonQuery.update(values);
    	}catch(Exception e){
    		e.printStackTrace();
    		return false;
    	}
    	return true;
    }
    
	// ¹Î¿øÇöÈ² ¼öÁ¤
	class UpdateMinwonQuery extends SqlUpdate {
		public UpdateMinwonQuery(DataSource dataSource) {
			// (ADMIN_NO, SEQ, YEAR, AREA,
			// SUM_ADJUST,VAT,REDUCTION_RATE,SUM,USE_SECTION,REDUCTION_REASON) \
			super(dataSource, getMessageSourceAccessor().getMessage(
					"Querys.rojum.minwon.updateMinwon"));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
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
    
    
    
    //¹Î¿øÇöÈ² »èÁ¦
    public boolean deleteMinwon(MinwonBean objMinwonBean){
    	DeleteMinwonQuery deleteMinwonQuery = new DeleteMinwonQuery(getDataSource());
    	
    	try{
    	Object[] values = { 
    			objMinwonBean.getGU_CODE(),
    			objMinwonBean.getREGIST_DATE()
    	};
    	
    	for (int i = 0; i < values.length; i++) {
			System.out.println(values[i]);
		}

    	deleteMinwonQuery.update(values);
    	}catch(Exception e){
    		e.printStackTrace();
    		return false;
    	}
    	return true;
    }
    
    protected class DeleteMinwonQuery extends SqlUpdate {
		public DeleteMinwonQuery(DataSource dataSource) {
			super(dataSource, getMessageSourceAccessor().getMessage(
					"Querys.rojum.minwon.deleteMinwon"));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
		}
	}
}
