package main.java.rojum.map.dao;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;


import main.java.common.dao.RoadsJdbcDaoSupport;
import main.java.common.util.Debug;
import main.java.rojum.map.model.RojumBean;
import main.java.rojum.map.model.SearchBean;


import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.MappingSqlQuery;
import org.springframework.jdbc.support.lob.OracleLobHandler;



public class MapSearchDao extends RoadsJdbcDaoSupport implements IMapSearchDao {
	private OracleLobHandler oracleLobHandler = null; 
	

    protected void initDao()  throws Exception {
		super.initDao();
		oracleLobHandler = new OracleLobHandler();
   	}
    
    
    
    
    public List getRojumList(SearchBean bean) {
    	GetRojumList getRojumList = new GetRojumList(getDataSource());

		Object[] values = {
				bean.getSURVEY_YEAR().equals("")?"%":bean.getSURVEY_YEAR(),
				bean.getMANAGE_TYP().equals("")?"0":bean.getMANAGE_TYP(),
				bean.getMAINTN_OB().equals("")?"%":bean.getMAINTN_OB(),
				bean.getGU_CD(),
				bean.getBJ_CD().equals("")?"%":bean.getBJ_CD(),

				bean.getBONBUN().equals("")?"%":bean.getBONBUN(),
				bean.getBUBUN().equals("")?"%":bean.getBUBUN(),				
				//********** BEGIN_현진_20120313
				//bean.getOWNER_NAME().equals("")?"%":"%"+bean.getOWNER_NAME()+"%"
				bean.getOWNER_NAME().equals("")?"%":"%"+bean.getOWNER_NAME()+"%",
				bean.getGUGAN_CD().equals("")?"%":"%"+bean.getGUGAN_CD()+"%"
				//********** END_현진_20120313
		
						
		};
		logger.fatal(Debug.toQueryString(getRojumList.getSql(), values));
		for (int i = 0; i < values.length; i++) {
			System.out.println(values[i]);
		}

		return getRojumList.execute(values);
	}

	protected class GetRojumList extends MappingSqlQuery {
		protected GetRojumList(DataSource ds) {
			super(ds, getMessageSourceAccessor().getMessage("Querys.rojum.map.GetRojumList"));

			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			//********** BEGIN_현진_20120313
			declareParameter(new SqlParameter(Types.VARCHAR));
			//********** END_현진_20120313
		}

		protected Object mapRow(ResultSet rs, int rownum) throws SQLException {
			RojumBean Bean = new RojumBean();
			
			Bean.setGAPAN_NO(rs.getString("GAPAN_NO"));
			Bean.setXC(rs.getString("X_COORD"));
			Bean.setYC(rs.getString("Y_COORD"));
			Bean.setWITH_PNU(rs.getString("WITH_PNU"));
			Bean.setOWNER_NAME(rs.getString("OWNER_NAME"));
			Bean.setTAX_YN(rs.getString("TAX_YN"));
			Bean.setMAINTN_OB(rs.getString("MAINTN_OB"));
			//********** BEGIN_현진_20120313
			Bean.setGUGAN_CD(rs.getString("GUGAN_CD"));
			//********** END_현진_20120313
			return Bean;
		}
	}
		    
	
	public List getRojumInfo(String gapanNo){
		GetRojumInfo getRojumInfo = new GetRojumInfo(getDataSource());

		Object[] values = {
				gapanNo
		};
		
		return getRojumInfo.execute(values);
	}

	protected class GetRojumInfo extends MappingSqlQuery {
		protected GetRojumInfo(DataSource ds) {
			super(ds, getMessageSourceAccessor().getMessage("Querys.rojum.map.GetRojumInfo"));

			declareParameter(new SqlParameter(Types.VARCHAR));
		}

		protected Object mapRow(ResultSet rs, int rownum) throws SQLException {
			RojumBean Bean = new RojumBean();
			
			Bean.setGAPAN_NO(rs.getString("GAPAN_NO"));
			Bean.setOWNER_NAME(rs.getString("OWNER_NAME"));
			Bean.setOWNER_TEL(rs.getString("OWNER_TEL"));
			Bean.setOWNER_HP(rs.getString("OWNER_HP"));
			Bean.setOWNER_TOADDR1(rs.getString("OWNER_TOADDR1"));
			Bean.setOWNER_TOADDR2(rs.getString("OWNER_TOADDR2"));
			Bean.setOWNER_TOJIBUN(rs.getString("OWNER_TOJIBUN"));
			Bean.setWITH_INFO(rs.getString("WITH_INFO"));
			Bean.setADDR(rs.getString("ADDR"));
			Bean.setWITH_ADDR(rs.getString("WITH_ADDR"));
			Bean.setPICKUP_DATE(rs.getString("PICKUP_DATE"));
			Bean.setPLACE(rs.getString("PLACE"));
			Bean.setFACIL(rs.getString("FACIL"));
			Bean.setCAR_TON(rs.getString("CAR_TON"));
			Bean.setMAINTN_OB(rs.getString("MAINTN_OB"));
			Bean.setLIQUOR_SL(rs.getString("LIQUOR_SL"));
			Bean.setLPGAS_US(rs.getString("LPGAS_US"));



			return Bean;
		}
	}
	
	
	public String getEnablePnu(String pnu){
		Object[] values = { pnu };
		String sql = getMessageSourceAccessor().getMessage(
				"Querys.rojum.map.getEnablePnu");
		Map returnNum = getJdbcTemplate().queryForMap(sql, values);
		return returnNum.get("PNU").toString();
	}
}

