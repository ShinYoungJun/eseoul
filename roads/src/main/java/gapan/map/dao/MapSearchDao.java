package main.java.gapan.map.dao;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;


import main.java.common.dao.RoadsJdbcDaoSupport;
import main.java.gapan.map.model.GapanBean;
import main.java.gapan.map.model.SearchBean;


import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.MappingSqlQuery;
import org.springframework.jdbc.support.lob.OracleLobHandler;



public class MapSearchDao extends RoadsJdbcDaoSupport implements IMapSearchDao {
	private OracleLobHandler oracleLobHandler = null; 
	

    protected void initDao()  throws Exception {
		super.initDao();
		oracleLobHandler = new OracleLobHandler();
   	}
    
    
    
    
    public List getGapanList(SearchBean bean) {
    	GetGapanList getGapanList = new GetGapanList(getDataSource());

		Object[] values = {
				bean.getFT_TYP().equals("")?"%":bean.getFT_TYP(),
				bean.getGU_CD(),
				bean.getBJ_CD().equals("")?"%":bean.getBJ_CD(),
				bean.getBONBUN().equals("")?"%":bean.getBONBUN(),
				bean.getBUBUN().equals("")?"%":bean.getBUBUN(),

				bean.getOWNER_NAME().equals("")?"%":"%"+bean.getOWNER_NAME()+"%"
		};
		
		return getGapanList.execute(values);
	}

	protected class GetGapanList extends MappingSqlQuery {
		protected GetGapanList(DataSource ds) {
			super(ds, getMessageSourceAccessor().getMessage("Querys.gapan.map.GetGapanList"));

			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			
			declareParameter(new SqlParameter(Types.VARCHAR));
		}

		protected Object mapRow(ResultSet rs, int rownum) throws SQLException {
			GapanBean Bean = new GapanBean();
			
			Bean.setGAPAN_NO(rs.getString("GAPAN_NO"));
			Bean.setXC(rs.getString("X_COORD"));
			Bean.setYC(rs.getString("Y_COORD"));
			Bean.setWITH_PNU(rs.getString("WITH_PNU"));
			Bean.setOWNER_NAME(rs.getString("OWNER_NAME"));
			Bean.setFT_TYP(rs.getString("FT_TYP"));

			return Bean;
		}
	}
		    
	
	public List getGapanInfo(String gapanNo){
		GetGapanInfo getGapanInfo = new GetGapanInfo(getDataSource());

		Object[] values = {
				gapanNo
		};
		
		return getGapanInfo.execute(values);
	}

	protected class GetGapanInfo extends MappingSqlQuery {
		protected GetGapanInfo(DataSource ds) {
			super(ds, getMessageSourceAccessor().getMessage("Querys.gapan.map.GetGapanInfo"));

			declareParameter(new SqlParameter(Types.VARCHAR));
		}

		protected Object mapRow(ResultSet rs, int rownum) throws SQLException {
			GapanBean Bean = new GapanBean();
			
			Bean.setGAPAN_NO(rs.getString("GAPAN_NO"));
			Bean.setOWNER_NAME(rs.getString("OWNER_NAME"));
			Bean.setOWNER_TEL(rs.getString("OWNER_TEL"));
			Bean.setOWNER_HP(rs.getString("OWNER_HP"));
			Bean.setOWNER_TOADDR1(rs.getString("OWNER_TOADDR1"));
			Bean.setOWNER_TOADDR2(rs.getString("OWNER_TOADDR2"));
			Bean.setOWNER_TOJIBUN(rs.getString("OWNER_TOJIBUN"));
			Bean.setWITH_INFO(rs.getString("WITH_INFO"));
			Bean.setADDR(rs.getString("ADDR"));
			Bean.setPLACE(rs.getString("PLACE"));
			Bean.setFACIL(rs.getString("FACIL"));
			Bean.setLIQUOR_SL(rs.getString("LIQUOR_SL"));
			Bean.setLPGAS_US(rs.getString("LPGAS_US"));

			return Bean;
		}
	}
	
	
	public String getEnablePnu(String pnu){
		Object[] values = { pnu };
		String sql = getMessageSourceAccessor().getMessage(
				"Querys.gapan.map.getEnablePnu");
		Map returnNum = getJdbcTemplate().queryForMap(sql, values);
		return returnNum.get("PNU").toString();
	}
}

