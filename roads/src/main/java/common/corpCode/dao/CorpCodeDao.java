//	2009		Kim Yun Seo

package main.java.common.corpCode.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.List;

import javax.sql.DataSource;

import main.java.admin.model.UserRegBean;
import main.java.common.corpCode.model.CorpCodeBean;
import main.java.common.dao.RoadsJdbcDaoSupport;

import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.MappingSqlQuery;

public class CorpCodeDao extends RoadsJdbcDaoSupport	implements	ICorpCodeDao{

	private RetrieveUserInfoDetailQuery objUserInfoDetailQuery;
	
    protected	void	initDao()  throws Exception
    {
		super.initDao();
		objUserInfoDetailQuery = new RetrieveUserInfoDetailQuery(getDataSource());
    }
    
    /**
  	 * 전달받은 USER_ID에 해당하는 USER_INFO을 조회해 리턴
	* @param	int seq	게시물 번호
	* @return	BoardBean	조회된 게시물 bean
	*/
	public UserRegBean getUserInfoDetail(String userId) {
		UserRegBean objUserRegBean = null;
		objUserRegBean = (UserRegBean) objUserInfoDetailQuery.findObject(userId);
		return objUserRegBean;
	}
	
	protected class RetrieveUserInfoDetailQuery extends MappingSqlQuery {
		protected RetrieveUserInfoDetailQuery(DataSource ds) {
			super(ds, getMessageSourceAccessor().getMessage("Querys.corpCode.selectbyUserId_Info"));
			declareParameter(new SqlParameter(Types.VARCHAR));
		}

		protected Object mapRow(ResultSet rs, int rownum) throws SQLException {
			
			UserRegBean objUserRegBean = new UserRegBean();
			objUserRegBean.setUSER_ID(rs.getString("USER_ID"));
			objUserRegBean.setPW(rs.getString("PASS_WORD"));
			objUserRegBean.setNAME(rs.getString("NAME"));
			objUserRegBean.setSIGU_CD(rs.getString("ORG_CD"));
			objUserRegBean.setGU_NM(rs.getString("GU_NM"));
			objUserRegBean.setDEPT_CD(rs.getString("DEPT_CD"));
			objUserRegBean.setSECTION(rs.getString("SECTION"));
			objUserRegBean.setTEL(rs.getString("TEL"));
			objUserRegBean.setHP(rs.getString("HP"));
			objUserRegBean.setTEL_EXT(rs.getString("TEL_EXT"));
			objUserRegBean.setEMAIL(rs.getString("EMAIL"));
			objUserRegBean.setIP(rs.getString("IP"));
			objUserRegBean.setPOSITION(rs.getString("POSITION"));
			objUserRegBean.setPW_DATE(rs.getString("PW_DATE"));
			objUserRegBean.setPW_NUM(rs.getInt("PW_NUM"));
			objUserRegBean.setERROR_NUM(rs.getInt("ERROR_NUM"));
			objUserRegBean.setREQUEST_DATE(rs.getString("REQUEST_DATE"));
			objUserRegBean.setAPPROVAL_DATE(rs.getString("APPROVAL_DATE"));
			objUserRegBean.setREG_DATE(rs.getString("REG_DATE"));
			objUserRegBean.setUP_DATE(rs.getString("UP_DATE"));
			objUserRegBean.setGU_CD(rs.getString("GU_CD"));
			return objUserRegBean;
		}
	}
	
 	public List executeCorpCodeList(String strCorpNm, String guCd)
 	{
 		try{	
	 		CorpCode	corpCode	= new CorpCode(getDataSource());
	 		Object[] values = {		
	 				"%" + strCorpNm + "%"
					, guCd
	 		};
	 		
	 		return corpCode.execute(values);	 	 
	 		
		} catch (Exception e) {
			System.out.println(e.toString());
			e.printStackTrace();
			
			return null;
		}
	}

	
    protected class CorpCode extends MappingSqlQuery
    {
        protected CorpCode(DataSource ds) {
        
        	super(ds, getMessageSourceAccessor().getMessage("Querys.corpCode.CorpCode"));
        	
        	declareParameter(new SqlParameter(Types.VARCHAR));
        	declareParameter(new SqlParameter(Types.VARCHAR));
        	
        }

        protected Object mapRow(ResultSet rs, int rownum) throws SQLException {

        	CorpCodeBean	Bean	= new CorpCodeBean();
        	
        	Bean.setRN(rs.getString("RN"));
        	Bean.setOFFICE_NM(rs.getString("OFFICE_NM"));
        	Bean.setOFFICE_CD(rs.getString("OFFICE_CD"));
        	Bean.setJIJUM_NM(rs.getString("JIJUM_NM"));
        	Bean.setJIJUM_CD(rs.getString("JIJUM_CD"));
        	Bean.setJIJUM_CK(rs.getString("JIJUM_CK"));
        	Bean.setGU_CD(rs.getString("GU_CD"));
        	
            return Bean;
        }
    }
}
