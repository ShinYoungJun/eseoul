package main.java.jumyong.map.dao;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;


import main.java.common.dao.RoadsJdbcDaoSupport;
import main.java.jumyong.map.model.JumyongBean;
import main.java.jumyong.map.model.SearchBean;


import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.MappingSqlQuery;
import org.springframework.jdbc.support.lob.OracleLobHandler;



public class MapSearchDao extends RoadsJdbcDaoSupport implements IMapSearchDao {
	private OracleLobHandler oracleLobHandler = null; 
	

    protected void initDao()  throws Exception {
		super.initDao();
		oracleLobHandler = new OracleLobHandler();
   	}
    
    
    
    
    public List getJumyongList(SearchBean bean) {
    	GetJumyongList getJumyongList = new GetJumyongList(getDataSource());

		Object[] values = {
				bean.getSECTION().equals("")?"%":bean.getSECTION(),
				bean.getTYPE().equals("")?"%":bean.getTYPE(),
				bean.getTAX_SET().equals("")?"%":bean.getTAX_SET(),
				bean.getGU_CD(),
				bean.getBJ_CD().equals("")?"%":bean.getBJ_CD(),
						
				bean.getBONBUN().equals("")?"%":bean.getBONBUN(),
				bean.getBUBUN().equals("")?"%":bean.getBUBUN(),
				bean.getOWNER_NAME().equals("")?"%":"%"+bean.getOWNER_NAME()+"%"};
		
		for (int i = 0; i < values.length; i++) {
			System.out.println(values[i]);
		}

		return getJumyongList.execute(values);
	}

	protected class GetJumyongList extends MappingSqlQuery {
		protected GetJumyongList(DataSource ds) {
			super(ds, getMessageSourceAccessor().getMessage("Querys.jumyong.map.GetJumyongList"));

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
			JumyongBean Bean = new JumyongBean();
			
			Bean.setADMIN_NO(rs.getString("ADMIN_NO"));
			Bean.setXC(rs.getString("X_COORD"));
			Bean.setYC(rs.getString("Y_COORD"));
			Bean.setNAME(rs.getString("NAME"));
			
			Bean.setPURPOSE_CD(rs.getString("PURPOSE_CD"));

			return Bean;
		}
	}
		    
	
	public List getJumyongInfo(String adminNo){
		GetJumyongInfo getJumyongInfo = new GetJumyongInfo(getDataSource());

		Object[] values = {adminNo};
		
		return getJumyongInfo.execute(values);
	}

	protected class GetJumyongInfo extends MappingSqlQuery {
		protected GetJumyongInfo(DataSource ds) {
			super(ds, getMessageSourceAccessor().getMessage("Querys.jumyong.map.GetJumyongInfo"));

			declareParameter(new SqlParameter(Types.VARCHAR));
		}

		protected Object mapRow(ResultSet rs, int rownum) throws SQLException {
			JumyongBean Bean = new JumyongBean();
			
			
			Bean.setADMIN_NO(rs.getString("ADMIN_NO"));
			Bean.setNAME(rs.getString("NAME"));
			Bean.setTEL(rs.getString("TEL"));
			Bean.setAPPEAL_ADDR(rs.getString("APPEAL_ADDR"));
			Bean.setTYPE(rs.getString("TYPE"));
			Bean.setTYPE_NAME(rs.getString("TYPE_NAME"));
			Bean.setSECTION(rs.getString("SECTION"));
			Bean.setSECTION_NAME(rs.getString("SECTION_NAME"));
			Bean.setTAX_SET(rs.getString("TAX_SET"));
			Bean.setTAX_SET_NAME(rs.getString("TAX_SET_NAME"));
			Bean.setCLASS_NM(rs.getString("CLASS_NM"));
			Bean.setPERIOD_DATE(rs.getString("PERIOD_DATE"));
			Bean.setAREA_SIZE(rs.getString("AREA_SIZE"));
			Bean.setPLACE_ADDR(rs.getString("PLACE_ADDR"));
			Bean.setROAD_ADDR(rs.getString("ROAD_ADDR"));



			return Bean;
		}
	}
	
	
	public String getEnablePnu(String pnu){
		Object[] values = { pnu };
		String sql = getMessageSourceAccessor().getMessage(
				"Querys.jumyong.map.getEnablePnu");
		Map returnNum = getJdbcTemplate().queryForMap(sql, values);
		return returnNum.get("PNU").toString();
	}
}

