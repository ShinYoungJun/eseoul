//	2009		Kim Yun Seo

package main.java.common.purposeCode.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.MappingSqlQuery;

import main.java.common.dao.RoadsJdbcDaoSupport;
import main.java.common.purposeCode.model.PurposeCodeBean;
import main.java.common.purposeCode.model.PurposeSebuCodeBean;


public class PurposeCodeDao extends RoadsJdbcDaoSupport	implements	IPurposeCodeDao{

    protected	void	initDao()  throws Exception
    {
		super.initDao();
    }
    
    
 	public List executePurposeCodeList(String SectionCode, String CODE)
 	{
 		PurposeCode	purposeCode	= new PurposeCode(getDataSource());
 		
 		Object[] values = {SectionCode, CODE};
 		
 		return purposeCode.execute(values);
	}
 	
 	public List executePurposeClassCodeList(String SectionCode)
 	{
 		PurposeClassCode	purposeCode	= new PurposeClassCode(getDataSource());
        Object[] values = {SectionCode};
        
 		return purposeCode.execute(values);
	}
 	
 	public List executePurposeSortCodeList(String SectionCode, String CLASS_CD)
 	{
 		PurposeSortCode	purposeCode	= new PurposeSortCode(getDataSource());
 		
 		Object[] values = {SectionCode, CLASS_CD};
 		
 		return purposeCode.execute(values);
	}
 	
 	public List executePurposeKindCodeList(String SectionCode, String CLASS_CD, String SORT_CD)
 	{
 		PurposeKindCode	purposeCode	= new PurposeKindCode(getDataSource());
 		
 		Object[] values = {SectionCode, CLASS_CD, SORT_CD};
 		
 		return purposeCode.execute(values);
	} 	
 	
    public	List	executePurposeSebuCode(String CODE)
	{
    	PurposeSebuCode	purposeSebuCode	= new PurposeSebuCode(getDataSource());
    	
    	Object[] values = {CODE};
    	
    	return purposeSebuCode.execute(values);
	}

	
    protected class PurposeCode extends MappingSqlQuery
    {
        protected 	PurposeCode(DataSource ds)
        {
          	super(ds, getMessageSourceAccessor().getMessage("Querys.PurposeCode.Code"));
          	
          	declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
        }
        
        protected	Object mapRow(ResultSet rs, int rownum)	throws	SQLException
        {
        	PurposeCodeBean	Bean	= new PurposeCodeBean();

        	Bean.setMOMEY(NullCheck(rs.getString("MOMEY")));
        	Bean.setYOYUL(NullCheck(rs.getString("YOYUL")));
  			Bean.setCHECK_YN(NullCheck(rs.getString("CHECK_YN")));
        	Bean.setDANWII(NullCheck(rs.getString("DANWII")));
  			Bean.setGIGAN(NullCheck(rs.getString("GIGAN")));

        	return	Bean;
        }
    }
    
    protected class PurposeClassCode extends MappingSqlQuery
    {
        protected 	PurposeClassCode(DataSource ds)
        {
          	super(ds, getMessageSourceAccessor().getMessage("Querys.PurposeCode.ClassCode"));
            declareParameter(new SqlParameter(Types.VARCHAR));
        }
        
        protected	Object mapRow(ResultSet rs, int rownum)	throws	SQLException
        {
        	PurposeCodeBean	Bean	= new PurposeCodeBean();

        	Bean.setCLASS_CD(NullCheck(rs.getString("CLASS_CD")));
  			Bean.setCLASS_NM(NullCheck(rs.getString("CLASS_NM")));

        	return	Bean;
        }
    }
    
    protected class PurposeSortCode extends MappingSqlQuery
    {
        protected 	PurposeSortCode(DataSource ds)
        {
          	super(ds, getMessageSourceAccessor().getMessage("Querys.PurposeCode.SortCode"));
          	declareParameter(new SqlParameter(Types.VARCHAR));
          	declareParameter(new SqlParameter(Types.VARCHAR));
        }
        
        protected	Object mapRow(ResultSet rs, int rownum)	throws	SQLException
        {
        	PurposeCodeBean	Bean	= new PurposeCodeBean();

        	Bean.setSORT_CD(NullCheck(rs.getString("SORT_CD")));
  			Bean.setSORT_NM(NullCheck(rs.getString("SORT_NM")));

        	return	Bean;
        }
    }
    
    protected class PurposeKindCode extends MappingSqlQuery
    {
        protected 	PurposeKindCode(DataSource ds)
        {
          	super(ds, getMessageSourceAccessor().getMessage("Querys.PurposeCode.KindCode"));
            declareParameter(new SqlParameter(Types.VARCHAR));
          	declareParameter(new SqlParameter(Types.VARCHAR));
          	declareParameter(new SqlParameter(Types.VARCHAR));
        }
        
        protected	Object mapRow(ResultSet rs, int rownum)	throws	SQLException
        {
        	PurposeCodeBean	Bean	= new PurposeCodeBean();

        	Bean.setKIND_CD(NullCheck(rs.getString("KIND_CD")));
  			Bean.setKIND_NM(NullCheck(rs.getString("KIND_NM")));

        	return	Bean;
        }
    }
    
    
    //	상세 시설물
    protected	class	PurposeSebuCode	extends	MappingSqlQuery
    {
        protected 	PurposeSebuCode(DataSource ds)
        {
          	super(ds, getMessageSourceAccessor().getMessage("Querys.PurposeCode.PurposeSebuCode"));
          	
	        declareParameter(new SqlParameter(Types.VARCHAR));
        }
        
        protected	Object mapRow(ResultSet rs, int rownum)	throws	SQLException
        {
        	PurposeSebuCodeBean	Bean	= new PurposeSebuCodeBean();

        	Bean.setSEBU_CD(NullCheck(rs.getString("SEBU_CD")));
  			Bean.setSEBU_NM(NullCheck(rs.getString("SEBU_NM")));

        	return	Bean;
        }
    }
    
    protected	String	NullCheck(String str)
    {
    	if(str	==	null)
    		str	= "";
    	
    	return	str;
    }
}
