
package main.java.facility.gigan.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

import javax.sql.DataSource;

import main.java.facility.gigan.model.AppealBean;
import main.java.facility.gigan.model.GiyeonBean;
import main.java.facility.gigan.model.PlaceBean;
import main.java.facility.gigan.model.GiganBean;

import org.springframework.context.support.MessageSourceAccessor;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.MappingSqlQuery;
import org.springframework.jdbc.object.SqlUpdate;


public class GiganMapDao {

    protected	class	Search	extends	MappingSqlQuery
    {
        protected 	Search(DataSource ds, MessageSourceAccessor msa)
        {
          	super(ds, msa.getMessage("Querys.facility.gigan.Search"));
          	
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
        
        protected	Object mapRow(ResultSet rs, int rownum)	throws	SQLException
        {
        	GiganBean	Bean	= new GiganBean();
        	
        	Bean.setCORP_CD(rs.getString("CORP_CD"));
        	Bean.setGU_CODE(rs.getString("GU_CODE"));
        	Bean.setREQUEST_NO(rs.getString("REQUEST_NO"));
        	Bean.setOBJECT_NO(rs.getString("OBJECT_NO"));
        	Bean.setNAME(rs.getString("NAME"));
        	Bean.setPURPOSE_CD(rs.getString("PURPOSE_CD"));
        	Bean.setPURPOSE_SORT(rs.getString("PURPOSE_SORT"));
        	Bean.setPURPOSE_KIND(rs.getString("PURPOSE_KIND"));
        	Bean.setBJ_CD(rs.getString("BJ_CD"));
        	Bean.setSAN_CK(rs.getString("SAN_CK"));
        	Bean.setBONBUN(rs.getString("BONBUN"));
        	Bean.setBUBUN(rs.getString("BUBUN"));
        	Bean.setMUL_FROMDATE(rs.getString("MUL_FROMDATE"));
        	Bean.setMUL_TODATE(rs.getString("MUL_TODATE"));
        	Bean.setRN(rs.getString("RN"));
        	
        	return	Bean;
        }
    }
   
    
    //	점용인 정보
    protected	class	Jumin_View	extends	MappingSqlQuery
    {
        protected 	Jumin_View(DataSource ds, MessageSourceAccessor msa)
        {
          	super(ds, msa.getMessage("Querys.facility.gigan.Jumin_View"));
          	
	        declareParameter(new SqlParameter(Types.VARCHAR));
	        declareParameter(new SqlParameter(Types.VARCHAR));
        }
        
        protected	Object mapRow(ResultSet rs, int rownum)	throws	SQLException
        {
        	AppealBean	Bean	= new AppealBean();
        	
        	Bean.setCORP_CD(rs.getString("CORP_CD"));
        	Bean.setGU_CODE(rs.getString("GU_CODE"));
  			Bean.setNAME(rs.getString("NAME"));
			Bean.setSSN(rs.getString("SSN"));
			Bean.setBIZSSN(rs.getString("BIZSSN"));
			Bean.setBIZ_STATUS(rs.getString("BIZ_STATUS"));
			Bean.setBIZ_TYPES(rs.getString("BIZ_TYPES"));
			Bean.setPOST(rs.getString("POST"));
			Bean.setADDR1(rs.getString("ADDR1"));
			Bean.setADDR2(rs.getString("ADDR2"));
			Bean.setTEL(rs.getString("TEL"));
			Bean.setHP(rs.getString("HP"));
			Bean.setTOPOST(rs.getString("TOPOST"));
			Bean.setTOADDR1(rs.getString("TOADDR1"));
			Bean.setTOADDR2(rs.getString("TOADDR2"));
			Bean.setTOPOST_NM(rs.getString("TOPOST_NM"));
			Bean.setTOTEL(rs.getString("TOTEL"));
			Bean.setTOHP(rs.getString("TOHP"));	
			
        	return	Bean;
        }
    }
    
    
    //	점용지 정보
    protected	class	Jumji_View	extends	MappingSqlQuery
    {
        protected 	Jumji_View(DataSource ds, MessageSourceAccessor msa)
        {
          	super(ds, msa.getMessage("Querys.facility.gigan.Jumji_View"));
          	
	        declareParameter(new SqlParameter(Types.VARCHAR));
	        declareParameter(new SqlParameter(Types.VARCHAR));
	        declareParameter(new SqlParameter(Types.VARCHAR));
	        declareParameter(new SqlParameter(Types.VARCHAR));
        }
        
        protected	Object mapRow(ResultSet rs, int rownum)	throws	SQLException
        {
        	PlaceBean	Bean	= new PlaceBean();

			Bean.setCORP_CD(rs.getString("CORP_CD"));
			Bean.setTYPE(rs.getString("TYPE"));
			Bean.setSECTION(rs.getString("SECTION"));
			Bean.setPURPOSE_CD(rs.getString("PURPOSE_CD"));
			Bean.setOWNER_SET(rs.getString("OWNER_SET"));
			Bean.setTAX_SET(rs.getString("TAX_SET"));
			Bean.setSIDO(rs.getString("SIDO"));
			Bean.setSIGUNGU(rs.getString("SIGUNGU"));
			Bean.setBJ_CD(rs.getString("BJ_CD"));
			Bean.setHJ_CD(rs.getString("HJ_CD"));
			Bean.setSAN_CK(rs.getString("SAN_CK"));
			Bean.setBONBUN(rs.getString("BONBUN"));
			Bean.setBUBUN(rs.getString("BUBUN"));
			Bean.setTONG(rs.getString("TONG"));
			Bean.setBAN(rs.getString("BAN"));
//			Bean.setMUL_POST(rs.getString("MUL_POST"));
//			Bean.setBD_NM(rs.getString("BD_NM"));
//			Bean.setBD_DONG(rs.getString("BD_DONG"));
//			Bean.setBD_HO(rs.getString("BD_HO"));
//			Bean.setROAD_ADD(rs.getString("ROAD_ADD"));
			Bean.setPARKING_NUM(rs.getString("PARKING_NUM"));
//			Bean.setRIVER_NM(rs.getString("RIVER_NM"));
			Bean.setMUL_FROMDATE(rs.getString("MUL_FROMDATE"));
			Bean.setMUL_TODATE(rs.getString("MUL_TODATE"));
//			Bean.setWITH_POST(rs.getString("WITH_POST"));
			Bean.setWORK_FROMDATE(rs.getString("WORK_FROMDATE"));
			Bean.setWORK_TODATE(rs.getString("WORK_TODATE"));
			Bean.setWITH_ADDR(rs.getString("WITH_ADDR"));
			Bean.setWITH_ADDR_CK(rs.getString("WITH_ADDR_CK"));
			Bean.setEXE_INFO(rs.getString("EXE_INFO"));
			Bean.setTOTAL_PERIOD(rs.getString("TOTAL_PERIOD"));
			Bean.setPARTLY_PERIOD(rs.getString("PARTLY_PERIOD"));
			
        	return	Bean;
        }
    }
    
    
    //	점용기간 연장 출력
    protected	class	Gigan_Search	extends	MappingSqlQuery
    {
        protected 	Gigan_Search(DataSource ds, MessageSourceAccessor msa)
        {
          	super(ds, msa.getMessage("Querys.facility.gigan.Gigan_Search"));
          	
	        declareParameter(new SqlParameter(Types.VARCHAR));
	        declareParameter(new SqlParameter(Types.VARCHAR));
	        declareParameter(new SqlParameter(Types.VARCHAR));
        }
        
        protected	Object mapRow(ResultSet rs, int rownum)	throws	SQLException
        {
        	GiyeonBean	Bean	= new GiyeonBean();

			Bean.setRN(rs.getString("RN"));
			Bean.setREGDATE(rs.getString("REGDATE"));
			Bean.setBEFORE_FROMDATE(rs.getString("BEFORE_FROMDATE"));
			Bean.setBEFORE_TODATE(rs.getString("BEFORE_TODATE"));
			Bean.setAFTER_FROMDATE(rs.getString("AFTER_FROMDATE"));
			Bean.setAFTER_TODATE(rs.getString("AFTER_TODATE"));
			Bean.setNOTES(rs.getString("NOTES"));
			Bean.setMANAGER(rs.getString("MANAGER"));
			Bean.setGU_CODE(rs.getString("GU_CODE"));
			
        	return	Bean;
        }
    }
    
    
    //	기간 연장 이력정보 추가
    protected	class	Gigan_Register	extends	SqlUpdate
    {
        protected 	Gigan_Register(DataSource ds, MessageSourceAccessor msa)
        {
          	super(ds, msa.getMessage("Querys.facility.gigan.Gigan_Register"));
          	
          	declareParameter(new SqlParameter(Types.VARCHAR));
	        declareParameter(new SqlParameter(Types.VARCHAR));
	        declareParameter(new SqlParameter(Types.VARCHAR));
	        declareParameter(new SqlParameter(Types.VARCHAR));
	        declareParameter(new SqlParameter(Types.VARCHAR));
	        declareParameter(new SqlParameter(Types.VARCHAR));
        }
    }
    
    //	점용지 정보의 기간연장 수정
    protected	class	Gigan_Ext	extends	SqlUpdate
    {
        protected 	Gigan_Ext(DataSource ds, MessageSourceAccessor msa)
        {
          	super(ds, msa.getMessage("Querys.facility.gigan.Gigan_Ext"));
          	
          	declareParameter(new SqlParameter(Types.VARCHAR));
	        declareParameter(new SqlParameter(Types.VARCHAR));
	        declareParameter(new SqlParameter(Types.VARCHAR));
        }
    }
    
    
    
    //	기간 연장 이력정보 전체 추가
    protected	class	Gigan_All_Register	extends	SqlUpdate
    {
        protected 	Gigan_All_Register(DataSource ds, MessageSourceAccessor msa)
        {
          	super(ds, msa.getMessage("Querys.facility.gigan.Gigan_All_Register"));
          	
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
    
    //	점용지 정보의 기간연장 전체 수정
    protected	class	Gigan_All_Ext	extends	SqlUpdate
    {
        protected 	Gigan_All_Ext(DataSource ds, MessageSourceAccessor msa)
        {
          	super(ds, msa.getMessage("Querys.facility.gigan.Gigan_All_Ext"));
          	
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
    
    
    //	점용기간 연장 출력
    protected	class	Admin_Search	extends	MappingSqlQuery
    {
        protected 	Admin_Search(DataSource ds, MessageSourceAccessor msa)
        {
          	super(ds, msa.getMessage("Querys.facility.gigan.Admin_Search"));
          	
	        declareParameter(new SqlParameter(Types.VARCHAR));
        }
        
        protected	Object mapRow(ResultSet rs, int rownum)	throws	SQLException
        {
        	GiyeonBean	Bean	= new GiyeonBean();

			Bean.setRN(rs.getString("RN"));
			Bean.setREGDATE(rs.getString("REGDATE"));
			Bean.setBEFORE_FROMDATE(rs.getString("BEFORE_FROMDATE"));
			Bean.setBEFORE_TODATE(rs.getString("BEFORE_TODATE"));
			Bean.setAFTER_FROMDATE(rs.getString("AFTER_FROMDATE"));
			Bean.setAFTER_TODATE(rs.getString("AFTER_TODATE"));
			Bean.setNOTES(rs.getString("NOTES"));
			Bean.setMANAGER(rs.getString("MANAGER"));
			Bean.setGU_CODE(rs.getString("GU_CODE"));
			
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
