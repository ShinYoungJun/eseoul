//	2009		Kim Yun Seo

package main.java.facility.adminbiz.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

import javax.sql.DataSource;

import main.java.common.dao.RoadsJdbcDaoSupport;
import main.java.facility.adminbiz.model.AdminBizBean;

import org.springframework.context.support.MessageSourceAccessor;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.MappingSqlQuery;
import org.springframework.jdbc.object.SqlUpdate;


public class AdminBizMapDao extends RoadsJdbcDaoSupport
{
    protected	class	Search	extends	MappingSqlQuery
    {
        protected 	Search(DataSource ds, MessageSourceAccessor msa)
        {
          	super(ds, msa.getMessage("Querys.facility.adminbiz.Search"));
          	
      		declareParameter(new SqlParameter(Types.VARCHAR));
	        declareParameter(new SqlParameter(Types.VARCHAR));
	        declareParameter(new SqlParameter(Types.VARCHAR));
	        declareParameter(new SqlParameter(Types.INTEGER));
	        declareParameter(new SqlParameter(Types.INTEGER));

        }
        
        protected	Object mapRow(ResultSet rs, int rownum)	throws	SQLException
        {
        	AdminBizBean	Bean	= new AdminBizBean();

        	Bean.setRNUM(rs.getString("R_NUM"));
        	Bean.setNAME(rs.getString("NAME"));        	
        	Bean.setCORP_CD(rs.getString("CORP_CD"));
        	Bean.setOFFICE(rs.getString("OFFICE"));
        	Bean.setMANAGER(rs.getString("MANAGER"));       
  			
        	return	Bean;
        }
    }
    
    
    protected	class	GetAdminBizView	extends	MappingSqlQuery
    {
        protected 	GetAdminBizView(DataSource ds, MessageSourceAccessor msa)
        {
          	super(ds, msa.getMessage("Querys.facility.adminbiz.View"));
          	
	        declareParameter(new SqlParameter(Types.VARCHAR));
	        declareParameter(new SqlParameter(Types.VARCHAR));
        }
        
        protected	Object mapRow(ResultSet rs, int rownum)	throws	SQLException
        {
        	AdminBizBean	Bean	= new AdminBizBean();

        	Bean.setCORP_CD(rs.getString("CORP_CD"));
        	Bean.setGU_CODE(rs.getString("GU_CODE"));
        	Bean.setNAME(rs.getString("NAME"));
        	Bean.setOFFICE(rs.getString("OFFICE"));
        	Bean.setSSN(rs.getString("SSN"));
        	Bean.setBIZSSN(rs.getString("BIZSSN"));
        	Bean.setTOTEL(rs.getString("TOTEL"));
        	Bean.setTOHP(rs.getString("TOHP"));
        	Bean.setPOST(rs.getString("POST"));
        	Bean.setADDR1(rs.getString("ADDR1"));
        	Bean.setADDR2(rs.getString("ADDR2"));
        	Bean.setBIZ_STATUS(rs.getString("BIZ_STATUS"));
        	Bean.setBIZ_TYPES(rs.getString("BIZ_TYPES"));
        	Bean.setTOPOST(rs.getString("TOPOST"));
        	Bean.setTOADDR1(rs.getString("TOADDR1"));
        	Bean.setTOADDR2(rs.getString("TOADDR2"));
        	Bean.setTOTEL_EXT(rs.getString("TOTEL_EXT"));
        	Bean.setTOFAX(rs.getString("TOFAX"));
        	Bean.setTOPOST_NM(rs.getString("TOPOST_NM"));
        	Bean.setMANAGER(rs.getString("MANAGER"));
        	Bean.setLNBR1(rs.getString("LNBR1"));
        	Bean.setLNBR2(rs.getString("LNBR2"));
        	Bean.setTO_LNBR1(rs.getString("TO_LNBR1"));
        	Bean.setTO_LNBR2(rs.getString("TO_LNBR2"));
        	Bean.setOFFICE_CD(rs.getString("OFFICE_CD"));
        	Bean.setSPC_CD(rs.getString("SPC_CD"));
        	Bean.setTO_SPC_CD(rs.getString("TO_SPC_CD"));
        	Bean.setTEL(rs.getString("TEL"));
        	Bean.setHP(rs.getString("HP"));
        	Bean.setSI(rs.getString("SI"));
        	Bean.setGUN(rs.getString("GUN"));
        	Bean.setDONG(rs.getString("DONG"));
        	Bean.setBON(rs.getString("BON"));
        	Bean.setBU(rs.getString("BU"));
        	Bean.setSANGSE(rs.getString("SANGSE"));
        	Bean.setROAD_ADDR(rs.getString("ROAD_ADDR"));
        	Bean.setROAD_BON(rs.getString("ROAD_BON"));
        	Bean.setROAD_BU(rs.getString("ROAD_BU"));
        	Bean.setADDR_CHECK(rs.getString("ADDR_CHECK"));
        	Bean.setTOSI(rs.getString("TOSI"));
        	Bean.setTOGUN(rs.getString("TOGUN"));
        	Bean.setTODONG(rs.getString("TODONG"));
        	Bean.setTOBON(rs.getString("TOBON"));
        	Bean.setTOBU(rs.getString("TOBU"));
        	Bean.setTOSANGSE(rs.getString("TOSANGSE"));
        	Bean.setREGDATE(rs.getString("REGDATE"));
        	Bean.setRI(rs.getString("RI"));
        	Bean.setBD_NM(rs.getString("BD_NM"));
        	Bean.setBD_DET_NM(rs.getString("BD_DET_NM"));
        	Bean.setTORI(rs.getString("TORI"));
        	Bean.setTO_DORO_NM(rs.getString("TO_DORO_NM"));
        	Bean.setTO_BD_BON(rs.getString("TO_BD_BON"));
        	Bean.setTO_BD_BU(rs.getString("TO_BD_BU"));
        	Bean.setTO_BD_NM(rs.getString("TO_BD_NM"));
        	Bean.setTO_BD_DET_NM(rs.getString("TO_BD_DET_NM"));
        	Bean.setREQUEST_NO(rs.getString("REQUEST_NO"));
        	Bean.setJIJUM_CD(rs.getString("JIJUM_CD"));

      	
        	return	Bean;
        }
    }
    
    
    //adminBizCompanyList
    protected	class	GetCompanyList extends	MappingSqlQuery
    {
        protected 	GetCompanyList (DataSource ds, MessageSourceAccessor msa)
        {
          	super(ds, msa.getMessage("Querys.facility.adminbiz.CompanyList"));
          	
	        declareParameter(new SqlParameter(Types.VARCHAR));
	        
        }
        
        protected	Object mapRow(ResultSet rs, int rownum)	throws	SQLException
        {
        	AdminBizBean	Bean	= new AdminBizBean();

        	
        	Bean.setNAME(rs.getString("NAME"));
        	Bean.setOFFICE_CD(rs.getString("OFFICE_CD"));
        	
        	
        	return	Bean;
        }
    }
    
    
    public class CompanylInsert extends SqlUpdate {
        public CompanylInsert(DataSource ds, MessageSourceAccessor msa) {

            super(ds, msa.getMessage("Querys.facility.adminbiz.CompanyInsert"));
            
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
            declareParameter(new SqlParameter(Types.VARCHAR));  

            declareParameter(new SqlParameter(Types.VARCHAR));  
            declareParameter(new SqlParameter(Types.VARCHAR));  
            declareParameter(new SqlParameter(Types.VARCHAR));  
        }
    }
    
    
    //office_cd 값중 최대값 가져오기
    protected	class	maxOffice_cd extends	MappingSqlQuery
    {
        protected 	maxOffice_cd (DataSource ds, MessageSourceAccessor msa)
        {
          	super(ds, msa.getMessage("Querys.facility.adminbiz.maxOffice_cd"));
          	
	        declareParameter(new SqlParameter(Types.VARCHAR));
	        
        }
        
        protected	Object mapRow(ResultSet rs, int rownum)	throws	SQLException
        {
        	AdminBizBean	Bean	= new AdminBizBean();        	
        	
        	Bean.setOFFICE_CD(rs.getString("OFFICE_CD"));
        	
        	
        	return	Bean;
        }
    }
	
//jijum_cd 값중 최대값 가져오기
	  protected	class	maxJijum_cd extends	MappingSqlQuery
	    {
	        protected 	maxJijum_cd (DataSource ds, MessageSourceAccessor msa)
	        {
	          	super(ds, msa.getMessage("Querys.facility.adminbiz.maxJijum_cd"));
	          	
		        declareParameter(new SqlParameter(Types.VARCHAR));
		        declareParameter(new SqlParameter(Types.VARCHAR));
		        
	        }
	        
	        protected	Object mapRow(ResultSet rs, int rownum)	throws	SQLException
	        {
	        	AdminBizBean	Bean	= new AdminBizBean();	        	
	        	
	        	Bean.setJIJUM_CD(rs.getString("JIJUM_CD"));
	        	
	        	
	        	return	Bean;
	        }
	    }
	  
	  
	  public class CompanylUpdate extends SqlUpdate {
	        public CompanylUpdate(DataSource ds, MessageSourceAccessor msa) {

	            super(ds, msa.getMessage("Querys.facility.adminbiz.CompanyUpdate"));
	            
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
	      		declareParameter(new SqlParameter(Types.VARCHAR));
	      		declareParameter(new SqlParameter(Types.VARCHAR));
	            declareParameter(new SqlParameter(Types.VARCHAR));
	            declareParameter(new SqlParameter(Types.VARCHAR));
	            declareParameter(new SqlParameter(Types.VARCHAR));
	            declareParameter(new SqlParameter(Types.VARCHAR));

	        }
	    }
	  
	  
	  
	  public class CompanyDelete extends SqlUpdate {
	        public CompanyDelete(DataSource ds, MessageSourceAccessor msa) {

	            super(ds, msa.getMessage("Querys.facility.adminbiz.CompanyDelete"));
	            
	            declareParameter(new SqlParameter(Types.VARCHAR));
	      		declareParameter(new SqlParameter(Types.VARCHAR));    	
	            
	        }
	    }
	    
	  
    }
