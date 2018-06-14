//	2009		Kim Yun Seo

package main.java.facility.minwon.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

import javax.sql.DataSource;

import main.java.common.dao.RoadsJdbcDaoSupport;
import main.java.facility.adminbiz.model.AdminBizBean;
import main.java.facility.minwon.model.AppealBean;
import main.java.facility.minwon.model.Admin_BaseBean;
import main.java.facility.minwon.model.DepthBean;
import main.java.facility.minwon.model.JumjiSearchBean;
import main.java.facility.minwon.model.PlaceBean;

import org.springframework.context.support.MessageSourceAccessor;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.MappingSqlQuery;
import org.springframework.jdbc.object.SqlUpdate;


public class MinwonMapDao extends RoadsJdbcDaoSupport
{
	 protected	class	Search	extends	MappingSqlQuery
	    {
	        protected 	Search(DataSource ds, MessageSourceAccessor msa)
	        {
	          	super(ds, msa.getMessage("Querys.facility.minwon.GetAdminBizSearch"));
	          	
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
	        	Bean.setPOST(rs.getString("POST"));
	        	Bean.setADDR1(rs.getString("ADDR1"));
	        	Bean.setROADADDR(rs.getString("ROADADDR"));
	  			
	        	return	Bean;
	        }
	    }
    
    
    protected	class	Admin_Base_Register	extends	SqlUpdate
    {
    	protected	Admin_Base_Register(DataSource ds, MessageSourceAccessor msa)
        {
            super(ds, msa.getMessage("Querys.facility.minwon.Admin_Base_Register"));
    
            declareParameter(new SqlParameter(Types.VARCHAR));	//CORP_CD
            declareParameter(new SqlParameter(Types.VARCHAR));	//GU_CODE
            declareParameter(new SqlParameter(Types.VARCHAR));	//REQUEST_NO
            declareParameter(new SqlParameter(Types.VARCHAR));	//REGDATE
            declareParameter(new SqlParameter(Types.VARCHAR));	//UP_DATE
            declareParameter(new SqlParameter(Types.VARCHAR));	//MANAGER
            declareParameter(new SqlParameter(Types.VARCHAR));	//FINISH_ID 
            declareParameter(new SqlParameter(Types.VARCHAR));	//CHECK_YN
            declareParameter(new SqlParameter(Types.VARCHAR));	//TAX_YN
        }
    }  
    
    
    protected	class	Minwon_Register	extends	SqlUpdate
    {
    	protected	Minwon_Register(DataSource ds, MessageSourceAccessor msa)
        {
            super(ds, msa.getMessage("Querys.facility.minwon.Minwon_Register"));
            
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
    
    
    protected	class	Appeal_Register	extends	SqlUpdate
    {
    	protected	Appeal_Register(DataSource ds, MessageSourceAccessor msa)
        {
            super(ds, msa.getMessage("Querys.facility.minwon.Appeal_Register"));
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
    
    protected	class	Appeal_Update	extends	SqlUpdate
    {
    	protected	Appeal_Update(DataSource ds, MessageSourceAccessor msa)
        {
            super(ds, msa.getMessage("Querys.facility.minwon.Appeal_Update"));
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
    
    
    protected	class	Place_Register	extends	SqlUpdate
    {
    	protected	Place_Register(DataSource ds, MessageSourceAccessor msa)
        {
            super(ds, msa.getMessage("Querys.facility.minwon.Place_Register"));
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
            //declareParameter(new SqlParameter(Types.VARCHAR));  
            

        }
    }
    
    
    //	관련 점용지 조회
    protected	class	Search_Jumin	extends	MappingSqlQuery
    {
        protected 	Search_Jumin(DataSource ds, MessageSourceAccessor msa)
        {
          	super(ds, msa.getMessage("Querys.facility.minwon.Search_Jumin"));
          	
          	declareParameter(new SqlParameter(Types.VARCHAR));
	        declareParameter(new SqlParameter(Types.VARCHAR));
	        declareParameter(new SqlParameter(Types.VARCHAR));
	        declareParameter(new SqlParameter(Types.VARCHAR));
	        declareParameter(new SqlParameter(Types.VARCHAR));
        }
        
        protected	Object mapRow(ResultSet rs, int rownum)	throws	SQLException
        {
        	AppealBean	Bean	= new AppealBean();
        	
        	Bean.setCORP_CD(rs.getString("CORP_CD"));
        	Bean.setGU_CODE(rs.getString("GU_CODE"));
        	Bean.setNAME(rs.getString("NAME"));
        	Bean.setOFFICE(rs.getString("OFFICE"));
        	Bean.setSSN(rs.getString("SSN"));
        	Bean.setBIZSSN(rs.getString("BIZSSN"));
        	Bean.setTEL(rs.getString("TEL"));
        	Bean.setHP(rs.getString("HP"));
        	Bean.setBON_POST(rs.getString("POST"));
			Bean.setBON_ADDR1(rs.getString("ADDR1"));
			Bean.setBON_ADDR2(rs.getString("ADDR2"));
        	Bean.setBIZ_STATUS(rs.getString("BIZ_STATUS"));
        	Bean.setBIZ_TYPES(rs.getString("BIZ_TYPES"));
        	Bean.setTO_POST(rs.getString("TOPOST"));
        	Bean.setTO_ADDR1(rs.getString("TOADDR1"));
        	Bean.setTO_ADDR2(rs.getString("TOADDR2"));
        	Bean.setTEL_EXT(rs.getString("TOTEL_EXT"));
        	Bean.setFAX(rs.getString("TOFAX"));
        	Bean.setREQ_DATE(rs.getString("REGDATE"));
			Bean.setRN(rs.getString("RN"));
			
        	return	Bean;
        }
    }
    
    
    protected	class	Select_Depth	extends	MappingSqlQuery
    {
        protected 	Select_Depth(DataSource ds, MessageSourceAccessor msa)
        {
          	super(ds, msa.getMessage("Querys.facility.minwon.Select_Depth"));
        }
        
        protected	Object mapRow(ResultSet rs, int rownum)	throws	SQLException
        {
        	DepthBean	Bean	= new DepthBean();
        	
        	Bean.setDEPTH(rs.getString("DEPTH"));
        	Bean.setRATE(rs.getString("RATE"));
        	
        	return	Bean;
        }
    }
    
    //전승원 추가
    protected	class	GetAdminBase	extends	MappingSqlQuery
    {
        protected 	GetAdminBase(DataSource ds, MessageSourceAccessor msa)
        {
          	super(ds, msa.getMessage("Querys.facility.minwon.GetAdminBase"));
          	
      		declareParameter(new SqlParameter(Types.VARCHAR));
	        declareParameter(new SqlParameter(Types.VARCHAR));
	        declareParameter(new SqlParameter(Types.VARCHAR));
        }
        
        protected	Object mapRow(ResultSet rs, int rownum)	throws	SQLException
        {
        	Admin_BaseBean	Bean	= new Admin_BaseBean();

        	Bean.setCORP_CD(rs.getString("CORP_CD"));
        	Bean.setGU_CODE(rs.getString("GU_CODE"));
        	Bean.setREQUEST_NO(rs.getString("REQUEST_NO"));
        	Bean.setREGDATE(rs.getString("REGDATE"));
        	Bean.setUP_DATE(rs.getString("UP_DATE"));
        	Bean.setMANAGER(rs.getString("MANAGER"));
        	Bean.setFINISH_ID(rs.getString("FINISH_ID"));
        	Bean.setCHECK_YN(rs.getString("CHECK_YN"));
        	Bean.setTAX_YN(rs.getString("TAX_YN"));
        	
        	return	Bean;
        }
    }
    
//  전승원 추가
    protected	class	GetEquipAppeal	extends	MappingSqlQuery
    {
        protected 	GetEquipAppeal(DataSource ds, MessageSourceAccessor msa)
        {
          	super(ds, msa.getMessage("Querys.facility.minwon.GetEquipAppeal"));
          	
	        declareParameter(new SqlParameter(Types.VARCHAR));
	        declareParameter(new SqlParameter(Types.VARCHAR));
        }
        
        protected	Object mapRow(ResultSet rs, int rownum)	throws	SQLException
        {
        	AppealBean	Bean	= new AppealBean();

        	Bean.setCORP_CD(rs.getString("CORP_CD"));
        	Bean.setGU_CODE(rs.getString("GU_CODE"));
        	Bean.setNAME(rs.getString("NAME"));
        	Bean.setOFFICE(rs.getString("OFFICE"));
        	Bean.setSSN(rs.getString("SSN"));
        	Bean.setBIZSSN(rs.getString("BIZSSN"));
        	Bean.setTEL(rs.getString("TEL"));
        	Bean.setHP(rs.getString("HP"));
        	Bean.setBON_POST(rs.getString("POST"));
        	Bean.setBON_ADDR1(rs.getString("ADDR1"));
        	Bean.setBON_ADDR2(rs.getString("ADDR2"));
        	Bean.setBIZ_STATUS(rs.getString("BIZ_STATUS"));
        	Bean.setBIZ_TYPES(rs.getString("BIZ_TYPES"));
        	Bean.setTO_POST(rs.getString("TOPOST"));
        	Bean.setTO_ADDR1(rs.getString("TOADDR1"));
        	Bean.setTO_ADDR2(rs.getString("TOADDR2"));
        	Bean.setTEL_EXT(rs.getString("TOTEL_EXT"));
        	Bean.setFAX(rs.getString("TOFAX"));
        	Bean.setTOPOST_NM(rs.getString("TOPOST_NM"));
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
    
    protected	class	GetRefDongName extends	MappingSqlQuery
    {
        protected 	GetRefDongName(DataSource ds, MessageSourceAccessor msa)
        {
          	super(ds, msa.getMessage("Querys.facility.minwon.GetRefDongName"));
          	
      		declareParameter(new SqlParameter(Types.VARCHAR));
	        declareParameter(new SqlParameter(Types.VARCHAR));        
        }
        
        protected	Object mapRow(ResultSet rs, int rownum)	throws	SQLException
        {
        	PlaceBean	Bean	= new PlaceBean();

        	Bean.setBJ_CD(rs.getString("BJ_CD"));
        	Bean.setSISUL_ADDR(rs.getString("BJ_NM"));        	
     
  			
        	return	Bean;
        }
    }
    
    
}
