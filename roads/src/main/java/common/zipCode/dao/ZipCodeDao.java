//	2009		Kim Yun Seo

package main.java.common.zipCode.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.MappingSqlQuery;

import main.java.common.dao.RoadsJdbcDaoSupport;
import main.java.common.zipCode.model.ZipCodeBean;


public class ZipCodeDao extends RoadsJdbcDaoSupport	implements	IZipCodeDao{

    protected	void	initDao()  throws Exception
    {
		super.initDao();
    }
    
	//********** BEGIN_현진_20120210
	public List executeZipCodeList(String strTown, String jibun, String jibu)
 	{
 		ZipCode	zipCode	= new ZipCode(getDataSource());

 		String EMD_NM = "%" + strTown + "%";

 		jibu = jibu.trim();

 		if(jibu.equals("")||jibu==null){
 			jibu = "0";
 		}

 		Object[] values = {EMD_NM, jibun, jibu};
 		
 		return zipCode.execute(values);
	}
	
	  //********** END_현진_20120210
     	
 	public List executeZipCodeDoro_nmList(String strDoro_nm)
 	{
 		ZipCodeDoro	zipCode	= new ZipCodeDoro(getDataSource());
 		
 		return zipCode.execute("%" + strDoro_nm + "%");
	} 
 	
 	public List executeZipCodeEmd_nmList(String strTown)
 	{
 		ZipCodeEmd	zipCode	= new ZipCodeEmd(getDataSource());
 		
 		return zipCode.execute("%" + strTown + "%");
	} 
 	//********** BEGIN_현진_20120208
	public List executeZipCodeZero_nmList(String strTown, String strDoro_nm, String jibun, String jibu )
	
 	{
 		ZipCodeZero	zipCode	= new ZipCodeZero(getDataSource());
 		
 		String EMD_NM = "%" + strTown + "%";
 		String DORO_NM = "%" + strDoro_nm + "%";
 		jibun = jibun.trim();

 		if(jibu.equals("")||jibu==null){
 			jibu = "0";
 		}
 		
 		Object[] values = {EMD_NM, DORO_NM,jibun, jibu};
 		
 		return zipCode.execute(values);
	}
	public List executeZipCodeDoroEmd(String strTown, String strDoro_nm)	
 	{
		ZipCodeDoroEmd	zipCode	= new ZipCodeDoroEmd(getDataSource());
 		
 		String EMD_NM = "%" + strTown + "%";
 		String DORO_NM = "%" + strDoro_nm + "%";

 		Object[] values = {EMD_NM, DORO_NM};
 		
 		return zipCode.execute(values);
	}	
	//********** END_현진_20120208
	
	//********** BEGIN_현진_20120209
	public List executeJibunConfirm(String ZIP_CL, String SI_NM, String SGG_NM, String EMD_NM, String BON, String BU, String DORO_NM, String BD_BON, String BD_BU){
		ZipCodeJibunConfirm	zipCode	= new ZipCodeJibunConfirm(getDataSource());
 		
 		if(BU.equals("")||BU == null){
 			BU = "0";
 		} 	
 		if(BD_BU.equals("")||BD_BU == null){
 			BD_BU = "0";
 		} 
 		Object[] values = {
 			ZIP_CL,SI_NM,SGG_NM,EMD_NM,BON,BU,DORO_NM,BD_BON,BD_BU
 		};
 		
 		return zipCode.execute(values);
	}
	
	public List executeToDoroNm(String ZIP_CL, String SI_NM, String SGG_NM, String DORO_NM){
		ZipCodeToDoroNm	zipCode	= new ZipCodeToDoroNm(getDataSource());
 		
 		Object[] values = {
 			ZIP_CL,SI_NM,SGG_NM,DORO_NM
 		};
 		
 		return zipCode.execute(values);	
	}
	public List executeToJibun(String ZIP_CL, String SI_NM, String SGG_NM, String DORO_NM, String BD_BON, String BD_BU){
		ZipCodeToJibun	zipCode	= new ZipCodeToJibun(getDataSource());
 		
		if(BD_BU.equals("")||BD_BU == null){
 			BD_BU = "0";
 		} 
		
 		Object[] values = {
 			ZIP_CL,SI_NM,SGG_NM,DORO_NM,BD_BON,BD_BU
 		};
 		
 		return zipCode.execute(values);	
	}
	public List executeBeforeEmd(String ZIP_CL, String SI_NM, String SGG_NM, String EMD_NM){
		ZipCodeBeforeEmd	zipCode	= new ZipCodeBeforeEmd(getDataSource());
 		
 		Object[] values = {
 			ZIP_CL,SI_NM,SGG_NM,EMD_NM
 		};
 		
 		return zipCode.execute(values);	
	}
	public List executeBeforeJibun(String ZIP_CL, String SI_NM, String SGG_NM, String EMD_NM, String BON, String BU){
		ZipCodeBeforeJibun	zipCode	= new ZipCodeBeforeJibun(getDataSource());
 		
		if(BU.equals("")||BU == null){
 			BU = "0";
 		} 	
 		Object[] values = {
 			ZIP_CL,SI_NM,SGG_NM,EMD_NM,BON,BU
 		};
 		
 		return zipCode.execute(values);
	}
	
	//********** END_현진_20120209
	
    protected class ZipCode extends MappingSqlQuery
    {
        protected ZipCode(DataSource ds) {
        
        	super(ds, getMessageSourceAccessor().getMessage("Querys.zipCode.ZipCode"));
        	
        	declareParameter(new SqlParameter(Types.VARCHAR));
        	declareParameter(new SqlParameter(Types.VARCHAR));
        	declareParameter(new SqlParameter(Types.VARCHAR));
        	
        }

        protected Object mapRow(ResultSet rs, int rownum) throws SQLException {

        	ZipCodeBean	Bean	= new ZipCodeBean();

        	Bean.setZIP_CL(rs.getString("ZIP_CL"));
        	Bean.setORDER_CN(rs.getString("ORDER_CN"));
        	Bean.setSI_NM(rs.getString("SI_NM"));
        	Bean.setSGG_NM(rs.getString("SGG_NM"));
        	Bean.setEMD_NM(rs.getString("EMD_NM"));
        	Bean.setRI_NM(rs.getString("RI_NM"));
        	Bean.setBD_NM(rs.getString("BD_NM"));
        	Bean.setDORO_NM(rs.getString("DORO_NM"));
        	Bean.setBON(rs.getString("BON"));
        	Bean.setBU(rs.getString("BU"));
        	Bean.setBD_BON(rs.getString("BD_BON"));
        	Bean.setBD_BU(rs.getString("BD_BU"));
            return Bean;
        }
    }
    
    
    protected class ZipCodeDoro extends MappingSqlQuery
    {
        protected ZipCodeDoro(DataSource ds) {
        
        	super(ds, getMessageSourceAccessor().getMessage("Querys.zipCode.ZipCodeDoro"));
        	
        	declareParameter(new SqlParameter(Types.VARCHAR));
        }

        protected Object mapRow(ResultSet rs, int rownum) throws SQLException {

        	ZipCodeBean	Bean	= new ZipCodeBean();
        	
        	Bean.setZIP_CL(rs.getString("ZIP_CL"));
        	Bean.setORDER_CN(rs.getString("ORDER_CN"));
        	Bean.setSI_NM(rs.getString("SI_NM"));
        	Bean.setSGG_NM(rs.getString("SGG_NM"));
        	Bean.setEMD_NM(rs.getString("EMD_NM"));
        	Bean.setRI_NM(rs.getString("RI_NM"));
        	Bean.setBD_NM(rs.getString("BD_NM"));
        	Bean.setDORO_NM(rs.getString("DORO_NM"));
        	Bean.setBON(rs.getString("BON"));
        	Bean.setBU(rs.getString("BU"));
        	Bean.setBD_BON(rs.getString("BD_BON"));
        	Bean.setBD_BU(rs.getString("BD_BU"));
            return Bean;
        }
    }
    protected class ZipCodeEmd extends MappingSqlQuery
    {
        protected ZipCodeEmd(DataSource ds) {
        
        	super(ds, getMessageSourceAccessor().getMessage("Querys.zipCode.ZipCodeEmd"));
        	
        	declareParameter(new SqlParameter(Types.VARCHAR));
        }

        protected Object mapRow(ResultSet rs, int rownum) throws SQLException {

        	ZipCodeBean	Bean	= new ZipCodeBean();
        	
        	Bean.setZIP_CL(rs.getString("ZIP_CL"));
        	Bean.setORDER_CN(rs.getString("ORDER_CN"));
        	Bean.setSI_NM(rs.getString("SI_NM"));
        	Bean.setSGG_NM(rs.getString("SGG_NM"));
        	Bean.setEMD_NM(rs.getString("EMD_NM"));
        	Bean.setRI_NM(rs.getString("RI_NM"));
        	Bean.setBD_NM(rs.getString("BD_NM"));
        	Bean.setDORO_NM(rs.getString("DORO_NM"));
        	Bean.setBON(rs.getString("BON"));
        	Bean.setBU(rs.getString("BU"));
        	Bean.setBD_BON(rs.getString("BD_BON"));
        	Bean.setBD_BU(rs.getString("BD_BU"));
            return Bean;
        }
    }
    protected class ZipCodeZero extends MappingSqlQuery
    {
        protected ZipCodeZero(DataSource ds) {
        
        	super(ds, getMessageSourceAccessor().getMessage("Querys.zipCode.ZipCodeZero"));
        	
        	declareParameter(new SqlParameter(Types.VARCHAR));
        	declareParameter(new SqlParameter(Types.VARCHAR));
        	declareParameter(new SqlParameter(Types.VARCHAR));
        	declareParameter(new SqlParameter(Types.VARCHAR));
        }

        protected Object mapRow(ResultSet rs, int rownum) throws SQLException {

        	ZipCodeBean	Bean	= new ZipCodeBean();

        	Bean.setZIP_CL(rs.getString("ZIP_CL"));
        	Bean.setORDER_CN(rs.getString("ORDER_CN"));
        	Bean.setSI_NM(rs.getString("SI_NM"));
        	Bean.setSGG_NM(rs.getString("SGG_NM"));
        	Bean.setEMD_NM(rs.getString("EMD_NM"));
        	Bean.setRI_NM(rs.getString("RI_NM"));
        	Bean.setBD_NM(rs.getString("BD_NM"));
        	Bean.setDORO_NM(rs.getString("DORO_NM"));
        	Bean.setBON(rs.getString("BON"));
        	Bean.setBU(rs.getString("BU"));
        	Bean.setBD_BON(rs.getString("BD_BON"));
        	Bean.setBD_BU(rs.getString("BD_BU"));
            return Bean;        	
        }
    }

    

    
    //********** BEGIN_현진_20120209
    protected class ZipCodeJibunConfirm extends MappingSqlQuery
    {
        protected ZipCodeJibunConfirm(DataSource ds) {
        
        	super(ds, getMessageSourceAccessor().getMessage("Querys.zipCode.jibunConfirm"));

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

        protected Object mapRow(ResultSet rs, int rownum) throws SQLException {

        	ZipCodeBean	Bean	= new ZipCodeBean();

        	Bean.setZIP_CL(rs.getString("ZIP_CL"));
        	Bean.setORDER_CN(rs.getString("ORDER_CN"));
        	Bean.setSI_NM(rs.getString("SI_NM"));
        	Bean.setSGG_NM(rs.getString("SGG_NM"));
        	Bean.setEMD_NM(rs.getString("EMD_NM"));
        	Bean.setRI_NM(rs.getString("RI_NM"));
        	Bean.setBD_NM(rs.getString("BD_NM"));
        	Bean.setDORO_NM(rs.getString("DORO_NM"));
        	Bean.setBON(rs.getString("BON"));
        	Bean.setBU(rs.getString("BU"));
        	Bean.setBD_BON(rs.getString("BD_BON"));
        	Bean.setBD_BU(rs.getString("BD_BU"));

            return Bean;        	
        }
    }
    
    protected class ZipCodeToDoroNm extends MappingSqlQuery
    {
        protected ZipCodeToDoroNm(DataSource ds) {
        
        	super(ds, getMessageSourceAccessor().getMessage("Querys.zipCode.toDoroNm"));
        	
        	declareParameter(new SqlParameter(Types.VARCHAR));
        	declareParameter(new SqlParameter(Types.VARCHAR));
        	declareParameter(new SqlParameter(Types.VARCHAR));
        	declareParameter(new SqlParameter(Types.VARCHAR));
        }

        protected Object mapRow(ResultSet rs, int rownum) throws SQLException {

        	ZipCodeBean	Bean	= new ZipCodeBean();

        	Bean.setZIP_CL(rs.getString("ZIP_CL"));
        	Bean.setORDER_CN(rs.getString("ORDER_CN"));
        	Bean.setSI_NM(rs.getString("SI_NM"));
        	Bean.setSGG_NM(rs.getString("SGG_NM"));
        	Bean.setEMD_NM(rs.getString("EMD_NM"));
        	Bean.setRI_NM(rs.getString("RI_NM"));
        	Bean.setBD_NM(rs.getString("BD_NM"));
        	Bean.setDORO_NM(rs.getString("DORO_NM"));
        	Bean.setBON(rs.getString("BON"));
        	Bean.setBU(rs.getString("BU"));
        	Bean.setBD_BON(rs.getString("BD_BON"));
        	Bean.setBD_BU(rs.getString("BD_BU"));
            return Bean;        	
        }
    }
    
    protected class ZipCodeToJibun extends MappingSqlQuery
    {
        protected ZipCodeToJibun(DataSource ds) {
        
        	super(ds, getMessageSourceAccessor().getMessage("Querys.zipCode.toJibun"));
        	
        	declareParameter(new SqlParameter(Types.VARCHAR));
        	declareParameter(new SqlParameter(Types.VARCHAR));
        	declareParameter(new SqlParameter(Types.VARCHAR));
        	declareParameter(new SqlParameter(Types.VARCHAR));
        	declareParameter(new SqlParameter(Types.VARCHAR));
        	declareParameter(new SqlParameter(Types.VARCHAR));
        }

        protected Object mapRow(ResultSet rs, int rownum) throws SQLException {

        	ZipCodeBean	Bean	= new ZipCodeBean();

        	Bean.setZIP_CL(rs.getString("ZIP_CL"));
        	Bean.setORDER_CN(rs.getString("ORDER_CN"));
        	Bean.setSI_NM(rs.getString("SI_NM"));
        	Bean.setSGG_NM(rs.getString("SGG_NM"));
        	Bean.setEMD_NM(rs.getString("EMD_NM"));
        	Bean.setRI_NM(rs.getString("RI_NM"));
        	Bean.setBD_NM(rs.getString("BD_NM"));
        	Bean.setDORO_NM(rs.getString("DORO_NM"));
        	Bean.setBON(rs.getString("BON"));
        	Bean.setBU(rs.getString("BU"));
        	Bean.setBD_BON(rs.getString("BD_BON"));
        	Bean.setBD_BU(rs.getString("BD_BU"));
            return Bean;        	
        }
    }

    protected class ZipCodeBeforeEmd extends MappingSqlQuery
    {
        protected ZipCodeBeforeEmd(DataSource ds) {
        
        	super(ds, getMessageSourceAccessor().getMessage("Querys.zipCode.beforeEmd"));
        	
        	declareParameter(new SqlParameter(Types.VARCHAR));
        	declareParameter(new SqlParameter(Types.VARCHAR));
        	declareParameter(new SqlParameter(Types.VARCHAR));
        	declareParameter(new SqlParameter(Types.VARCHAR));
        }

        protected Object mapRow(ResultSet rs, int rownum) throws SQLException {

        	ZipCodeBean	Bean	= new ZipCodeBean();

        	Bean.setZIP_CL(rs.getString("ZIP_CL"));
        	Bean.setORDER_CN(rs.getString("ORDER_CN"));
        	Bean.setSI_NM(rs.getString("SI_NM"));
        	Bean.setSGG_NM(rs.getString("SGG_NM"));
        	Bean.setEMD_NM(rs.getString("EMD_NM"));
        	Bean.setRI_NM(rs.getString("RI_NM"));
        	Bean.setBD_NM(rs.getString("BD_NM"));
        	Bean.setDORO_NM(rs.getString("DORO_NM"));
        	Bean.setBON(rs.getString("BON"));
        	Bean.setBU(rs.getString("BU"));
        	Bean.setBD_BON(rs.getString("BD_BON"));
        	Bean.setBD_BU(rs.getString("BD_BU"));
            return Bean;        	
        }
    }

    protected class ZipCodeBeforeJibun extends MappingSqlQuery
    {
        protected ZipCodeBeforeJibun(DataSource ds) {
        
        	super(ds, getMessageSourceAccessor().getMessage("Querys.zipCode.beforeJibun"));
        	
        	declareParameter(new SqlParameter(Types.VARCHAR));
        	declareParameter(new SqlParameter(Types.VARCHAR));
        	declareParameter(new SqlParameter(Types.VARCHAR));
        	declareParameter(new SqlParameter(Types.VARCHAR));
        	declareParameter(new SqlParameter(Types.VARCHAR));
        	declareParameter(new SqlParameter(Types.VARCHAR));
        }

        protected Object mapRow(ResultSet rs, int rownum) throws SQLException {

        	ZipCodeBean	Bean	= new ZipCodeBean();

        	Bean.setZIP_CL(rs.getString("ZIP_CL"));
        	Bean.setORDER_CN(rs.getString("ORDER_CN"));
        	Bean.setSI_NM(rs.getString("SI_NM"));
        	Bean.setSGG_NM(rs.getString("SGG_NM"));
        	Bean.setEMD_NM(rs.getString("EMD_NM"));
        	Bean.setRI_NM(rs.getString("RI_NM"));
        	Bean.setBD_NM(rs.getString("BD_NM"));
        	Bean.setDORO_NM(rs.getString("DORO_NM"));
        	Bean.setBON(rs.getString("BON"));
        	Bean.setBU(rs.getString("BU"));
        	Bean.setBD_BON(rs.getString("BD_BON"));
        	Bean.setBD_BU(rs.getString("BD_BU"));
            return Bean;        	
        }
    }    
    protected class ZipCodeDoroEmd extends MappingSqlQuery
    {
        protected ZipCodeDoroEmd(DataSource ds) {
        
        	super(ds, getMessageSourceAccessor().getMessage("Querys.zipCode.ZipCodeDoroEmd"));
        	
        	declareParameter(new SqlParameter(Types.VARCHAR));
        	declareParameter(new SqlParameter(Types.VARCHAR));
        	
        }

        protected Object mapRow(ResultSet rs, int rownum) throws SQLException {

        	ZipCodeBean	Bean	= new ZipCodeBean();

        	Bean.setZIP_CL(rs.getString("ZIP_CL"));
        	Bean.setORDER_CN(rs.getString("ORDER_CN"));
        	Bean.setSI_NM(rs.getString("SI_NM"));
        	Bean.setSGG_NM(rs.getString("SGG_NM"));
        	Bean.setEMD_NM(rs.getString("EMD_NM"));
        	Bean.setRI_NM(rs.getString("RI_NM"));
        	Bean.setBD_NM(rs.getString("BD_NM"));
        	Bean.setDORO_NM(rs.getString("DORO_NM"));
        	Bean.setBON(rs.getString("BON"));
        	Bean.setBU(rs.getString("BU"));
        	Bean.setBD_BON(rs.getString("BD_BON"));
        	Bean.setBD_BU(rs.getString("BD_BU"));
            return Bean;
        }
    }
    //********** END_현진_20120209
}
