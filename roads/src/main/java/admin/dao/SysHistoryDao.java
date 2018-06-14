package main.java.admin.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.List;

import javax.sql.DataSource;

import main.java.admin.model.SysConnectBean;
import main.java.admin.model.SysHistoryBean;
import main.java.common.dao.RoadsJdbcDaoSupport;

import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.MappingSqlQuery;
import org.springframework.jdbc.support.lob.OracleLobHandler;

public class SysHistoryDao extends RoadsJdbcDaoSupport implements ISysHistoryDao {
																  			
	private OracleLobHandler oracleLobHandler = null;
	private SysHistoryListQuery objRetrieveQuery;
	private SysConnectListQuery objRetrieveQuery1;
	
	protected void initDao() throws Exception {
		super.initDao();
		
		oracleLobHandler = new OracleLobHandler();
		objRetrieveQuery = new SysHistoryListQuery(getDataSource());
		objRetrieveQuery1 = new SysConnectListQuery(getDataSource());
	}

	public List retrieveSysHistoryList(int intCurrentPage,int intCountPerPage, String section,String fromDate,String toDate,String userName,String eventType ) {
	
		String strSection = "%";
		String strUserName = "%";
		String strEventType = "%";		
	
		if(!section.equals(""))
			strSection = "%"+section+"%";
		if(fromDate.equals(""))
			fromDate = "19000101";
		if(toDate.equals(""))
			toDate = "99999999";
		if(!userName.equals(""))
			strUserName = "%"+userName+"%";
		if(!eventType.equals(""))
			strEventType = "%"+eventType+"%";
		
		Object[] values = {strSection, fromDate, toDate, strUserName, strEventType, new Integer(intCurrentPage),new Integer(intCountPerPage),new Integer(intCountPerPage)};
		
		return objRetrieveQuery.execute(values);
	}

	/**
	 * 시스템 이력  조회해 List 형태로 리턴
	 */
	protected class SysHistoryListQuery extends MappingSqlQuery {
		protected SysHistoryListQuery(DataSource ds) {
			super(ds, getMessageSourceAccessor().getMessage(
					"Querys.system.sysHistoryList"));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
		}

		protected Object mapRow(ResultSet rs, int rownum) throws SQLException {
			SysHistoryBean objSysHistoryBean = new SysHistoryBean();
			System.out.println("rs="+rs);
			objSysHistoryBean.setADMIN_NO(rs.getString("ADMIN_NO"));
			objSysHistoryBean.setNAME(rs.getString("NAME"));
			objSysHistoryBean.setMODIFICATION_CONT(rs.getString("MODIFICATION_CONT"));
			objSysHistoryBean.setEVENT_TYPE(rs.getString("EVENT_TYPE"));
			objSysHistoryBean.setREG_DATE(rs.getString("REG_DATE"));
			objSysHistoryBean.setCUD_TYPE(rs.getString("CUD_TYPE"));
			objSysHistoryBean.setCUD_NAME(rs.getString("CUD_NAME"));
			objSysHistoryBean.setUSER_ID(rs.getString("USER_NAME"));
			
			return objSysHistoryBean;
		}
	}

	public int getTotalCount(String section, String fromDate, String toDate, String userName, String eventType) {
		
		String strSection = "%";
		String strUserName = "%";
		String strEventType = "%";		
	
		if(!section.equals(""))
			strSection = "%"+section+"%";
		if(fromDate.equals(""))
			fromDate = "19000101";
		if(toDate.equals(""))
			toDate = "99999999";
		if(!userName.equals(""))
			strUserName = "%"+userName+"%";
		if(!eventType.equals(""))
			strEventType = "%"+eventType+"%";
		
		Object[] values = {strSection, fromDate, toDate, strUserName, strEventType};
		String sql = getMessageSourceAccessor().getMessage("Querys.system.totalCount");
     
        return getJdbcTemplate().queryForInt(sql,values);		
	}

	public List retrieveSysConnectList(int intCurrentPage,int intCountPerPage, String systemSet,String fromDate,String toDate,String userName,String result ) {
		
		String strSystemSet = "%";
		String strUserName = "%";
		String strResult = "%";		
	
		if(!systemSet.equals(""))
			strSystemSet = "%"+systemSet+"%";
		if(fromDate.equals(""))
			fromDate = "19000101";
		if(toDate.equals(""))
			toDate = "99999999";
		if(!userName.equals(""))
			strUserName = "%"+userName+"%";
		if(!result.equals(""))
			strResult = "%"+result+"%";
		
		Object[] values = {strSystemSet, fromDate, toDate, strUserName, strResult, new Integer(intCurrentPage),new Integer(intCountPerPage),new Integer(intCountPerPage)};
		return objRetrieveQuery1.execute(values);
	}

	/**
	 * 시스템 연계이력  조회해 List 형태로 리턴
	 */
	protected class SysConnectListQuery extends MappingSqlQuery {
		protected SysConnectListQuery(DataSource ds) {
			super(ds, getMessageSourceAccessor().getMessage(
					"Querys.system.sysConnectList"));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
		}

		protected Object mapRow(ResultSet rs, int rownum) throws SQLException {
			SysConnectBean objSysConnectBean = new SysConnectBean();

			objSysConnectBean.setADMIN_NO(rs.getString("ADMIN_NO"));
			objSysConnectBean.setRESULT(rs.getString("RESULT"));
			objSysConnectBean.setRESULT_NM(rs.getString("RESULT_NM"));
			objSysConnectBean.setSYSTEM_SET(rs.getString("SYSTEM_SET"));
			objSysConnectBean.setSYSTEM_NM(rs.getString("SYSTEM_NM"));
			objSysConnectBean.setREG_DATE(rs.getString("REG_DATE"));
			objSysConnectBean.setWORK_TYPE(rs.getString("WORK_TYPE"));
			objSysConnectBean.setWORK_NM(rs.getString("WORK_NM"));
			objSysConnectBean.setUSER_ID(rs.getString("USER_NAME"));
			
			return objSysConnectBean;
		}
	}

	public int getTotalCount1(String systemSet, String fromDate, String toDate, String userName, String result) {
		
		String strSystemSet = "%";
		String strUserName = "%";
		String strResult = "%";		
	
		if(!systemSet.equals(""))
			strSystemSet = "%"+systemSet+"%";
		if(fromDate.equals(""))
			fromDate = "19000101";
		if(toDate.equals(""))
			toDate = "99999999";
		if(!userName.equals(""))
			strUserName = "%"+userName+"%";
		if(!result.equals(""))
			strResult = "%"+result+"%";
		
		Object[] values = {strSystemSet, fromDate, toDate, strUserName, strResult};
		String sql = getMessageSourceAccessor().getMessage("Querys.system.totalCount1");
		
        return getJdbcTemplate().queryForInt(sql,values);
	}
}