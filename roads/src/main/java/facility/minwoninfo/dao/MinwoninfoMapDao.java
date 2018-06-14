//	2009		Kim Yun Seo

package main.java.facility.minwoninfo.dao;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

import javax.sql.DataSource;
import main.java.common.dao.RoadsJdbcDaoSupport;

import org.springframework.context.support.MessageSourceAccessor;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.MappingSqlQuery;
import org.springframework.jdbc.object.SqlUpdate;

import main.java.facility.minwoninfo.model.AppealBean;
import main.java.facility.minwoninfo.model.MinwonBean;
import main.java.facility.minwoninfo.model.PlaceBean;


public class MinwoninfoMapDao extends RoadsJdbcDaoSupport
{
	
    //	민원 정보
    protected	class	Minwon_View	extends	MappingSqlQuery
    {
        protected 	Minwon_View(DataSource ds, MessageSourceAccessor msa)
        {
          	super(ds, msa.getMessage("Querys.facility.minwoninfo.Minwon_View"));
          	
	        declareParameter(new SqlParameter(Types.VARCHAR));
	        declareParameter(new SqlParameter(Types.VARCHAR));
	        declareParameter(new SqlParameter(Types.VARCHAR));
        }
        
        protected	Object mapRow(ResultSet rs, int rownum)	throws	SQLException
        {
        	MinwonBean	Bean	= new MinwonBean();

        	Bean.setADMIN_NO_MIN(Null2Space(rs.getString("ADMIN_NO")));
			Bean.setREQ_NO_MIN(Null2Space(rs.getString("REQ_NO")));
			Bean.setREQ_DATE_MIN(Null2Space(rs.getString("REQ_DATE")));
			Bean.setREQ_NM_MIN(Null2Space(rs.getString("REQ_NM")));
			Bean.setMANAGER_MIN(Null2Space(rs.getString("MANAGER")));
			Bean.setGUBUN_MIN(Null2Space(rs.getString("GUBUN")));
			Bean.setAGENT_NM_MIN(Null2Space(rs.getString("AGENT_NM")));
			Bean.setAGENT_TEL_MIN(Null2Space(rs.getString("AGENT_TEL")));
			Bean.setEVENT_SET_MIN(Null2Space(rs.getString("EVENT_SET")));
			Bean.setREQ_SET_MIN(Null2Space(rs.getString("REQ_SET")));
			
			Bean.setREQ_SIGU_MIN(Null2Space(rs.getString("REQ_SIGU")));
			Bean.setREQ_DEP_MIN(Null2Space(rs.getString("REQ_DEP")));
			Bean.setREQ_SET_CN_MIN(Null2Space(rs.getString("REQ_SET_CN")));
			Bean.setBIZSSN_MIN(Null2Space(rs.getString("BIZSSN")));
			Bean.setMANAGE_DEP_MIN(Null2Space(rs.getString("MANAGE_DEP")));
			Bean.setNOTES_MIN(Null2Space(rs.getString("NOTES")));
			Bean.setPREDATE_MIN(Null2Space(rs.getString("PREDATE")));
			Bean.setSSN_MIN(Null2Space(rs.getString("SSN")));
			Bean.setNAME_MIN(Null2Space(rs.getString("NAME")));
			Bean.setTEL_MIN(Null2Space(rs.getString("TEL")));
			
			Bean.setHP_MIN(Null2Space(rs.getString("HP")));
			Bean.setADDR1_MIN(Null2Space(rs.getString("ADDR1")));
			Bean.setADDR2_MIN(Null2Space(rs.getString("ADDR2")));
			Bean.setPOST_MIN(Null2Space(rs.getString("POST")));
			Bean.setREAL_DEAL_DATE_MIN(Null2Space(rs.getString("REAL_DEAL_DATE")));
			Bean.setMW_PROG_SE_MIN(Null2Space(rs.getString("MW_PROG_SE")));
			Bean.setEMAIL_MIN(Null2Space(rs.getString("EMAIL")));
			Bean.setSEQ_MIN(Null2Space(rs.getString("SEQ")));
			
			Bean.setRN(Null2Space(rs.getString("rn")));
			
        	return	Bean;
        }
    }
    
    
    //	민원 정보 1건 자세히  보기
    protected	class	Minwon_View_Search	extends	MappingSqlQuery
    {
        protected 	Minwon_View_Search(DataSource ds, MessageSourceAccessor msa)
        {
          	super(ds, msa.getMessage("Querys.facility.minwoninfo.Minwon_View_Search"));
          	
	        declareParameter(new SqlParameter(Types.VARCHAR));
	        declareParameter(new SqlParameter(Types.VARCHAR));
        }
        
        protected	Object mapRow(ResultSet rs, int rownum)	throws	SQLException
        {
        	MinwonBean	Bean	= new MinwonBean();

        	Bean.setADMIN_NO_MIN(Null2Space(rs.getString("ADMIN_NO")));
			Bean.setREQ_NO_MIN(Null2Space(rs.getString("REQ_NO")));
			Bean.setREQ_DATE_MIN(Null2Space(rs.getString("REQ_DATE")));
			Bean.setREQ_NM_MIN(Null2Space(rs.getString("REQ_NM")));
			Bean.setMANAGER_MIN(Null2Space(rs.getString("MANAGER")));
			Bean.setGUBUN_MIN(Null2Space(rs.getString("GUBUN")));
			Bean.setAGENT_NM_MIN(Null2Space(rs.getString("AGENT_NM")));
			Bean.setAGENT_TEL_MIN(Null2Space(rs.getString("AGENT_TEL")));
			Bean.setEVENT_SET_MIN(Null2Space(rs.getString("EVENT_SET")));
			Bean.setREQ_SET_MIN(Null2Space(rs.getString("REQ_SET")));
			
			Bean.setREQ_SIGU_MIN(Null2Space(rs.getString("REQ_SIGU")));
			Bean.setREQ_DEP_MIN(Null2Space(rs.getString("REQ_DEP")));
			Bean.setREQ_SET_CN_MIN(Null2Space(rs.getString("REQ_SET_CN")));
			Bean.setBIZSSN_MIN(Null2Space(rs.getString("BIZSSN")));
			Bean.setMANAGE_DEP_MIN(Null2Space(rs.getString("MANAGE_DEP")));
			Bean.setNOTES_MIN(Null2Space(rs.getString("NOTES")));
			Bean.setPREDATE_MIN(Null2Space(rs.getString("PREDATE")));
			Bean.setSSN_MIN(Null2Space(rs.getString("SSN")));
			Bean.setNAME_MIN(Null2Space(rs.getString("NAME")));
			Bean.setTEL_MIN(Null2Space(rs.getString("TEL")));
			
			Bean.setHP_MIN(Null2Space(rs.getString("HP")));
			Bean.setADDR1_MIN(Null2Space(rs.getString("ADDR1")));
			Bean.setADDR2_MIN(Null2Space(rs.getString("ADDR2")));
			Bean.setPOST_MIN(Null2Space(rs.getString("POST")));
			Bean.setREAL_DEAL_DATE_MIN(Null2Space(rs.getString("REAL_DEAL_DATE")));
			Bean.setMW_PROG_SE_MIN(Null2Space(rs.getString("MW_PROG_SE")));
			Bean.setEMAIL_MIN(Null2Space(rs.getString("EMAIL")));
			Bean.setSEQ_MIN(Null2Space(rs.getString("SEQ")));
	
        	return	Bean;
        }
    }
    
    
    //	민원 수정
    protected	class	Minwon_Modify	extends	SqlUpdate
    {
    	protected	Minwon_Modify(DataSource ds, MessageSourceAccessor msa)
        {
            super(ds, msa.getMessage("Querys.facility.minwoninfo.Minwon_Modify"));
            
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
    
    //	민원추가
    protected	class	Minwon_Register	extends	SqlUpdate
    {
    	protected	Minwon_Register(DataSource ds, MessageSourceAccessor msa)
        {
            super(ds, msa.getMessage("Querys.facility.minwoninfo.Minwon_Register"));
            
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
    
    //	점용인 정보
    protected	class	Jumin_View	extends	MappingSqlQuery
    {
        protected 	Jumin_View(DataSource ds, MessageSourceAccessor msa)
        {
          	super(ds, msa.getMessage("Querys.facility.minwoninfo.Jumin_View"));
          	
	        declareParameter(new SqlParameter(Types.VARCHAR));
        }
        
        protected	Object mapRow(ResultSet rs, int rownum)	throws	SQLException
        {
        	AppealBean	Bean	= new AppealBean();
        	
        	Bean.setADMIN_NO(rs.getString("ADMIN_NO"));
  			Bean.setNAME(rs.getString("NAME"));
			Bean.setSSN(rs.getString("SSN"));
			Bean.setBIZSSN(rs.getString("BIZSSN"));
			Bean.setBIZ_STATUS(rs.getString("BIZ_STATUS"));
			Bean.setBIZ_TYPES(rs.getString("BIZ_TYPES"));
			Bean.setPOST(rs.getString("POST"));
			Bean.setADDR1(rs.getString("ADDR1"));
			Bean.setADDR2(rs.getString("ADDR2"));
			Bean.setEMAIL(rs.getString("EMAIL"));
			Bean.setTEL(rs.getString("TEL"));
			Bean.setHP(rs.getString("HP"));
			Bean.setTOPOST(rs.getString("TOPOST"));
			Bean.setTOADDR1(rs.getString("TOADDR1"));
			Bean.setTOADDR2(rs.getString("TOADDR2"));
			Bean.setTOPOST_NM(rs.getString("TOPOST_NM"));
			Bean.setTOTEL(rs.getString("TOTEL"));
			Bean.setTOHP(rs.getString("TOHP"));	
			Bean.setTOEMAIL(rs.getString("TOEMAIL"));
			
        	return	Bean;
        }
    }
    
    //	점용인 수정
    protected	class	Jumin_Modify	extends	SqlUpdate 
    {
    	protected	Jumin_Modify(DataSource ds, MessageSourceAccessor msa)
        {
            super(ds, msa.getMessage("Querys.facility.minwoninfo.Jumin_Modify"));
            
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
    
    //	점용지 정보
    protected	class	Jumji_View	extends	MappingSqlQuery
    {
        protected 	Jumji_View(DataSource ds, MessageSourceAccessor msa)
        {
          	super(ds, msa.getMessage("Querys.facility.minwoninfo.Jumji_View"));
          	
	        declareParameter(new SqlParameter(Types.VARCHAR));
        }
        
        protected	Object mapRow(ResultSet rs, int rownum)	throws	SQLException
        {
        	PlaceBean	Bean	= new PlaceBean();

			Bean.setADMIN_NO(rs.getString("ADMIN_NO"));
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
			Bean.setMUL_POST(rs.getString("MUL_POST"));
			Bean.setBD_NM(rs.getString("BD_NM"));
			Bean.setBD_DONG(rs.getString("BD_DONG"));
			Bean.setBD_HO(rs.getString("BD_HO"));
			Bean.setROAD_ADD(rs.getString("ROAD_ADD"));
			Bean.setPARKING_NUM(rs.getString("PARKING_NUM"));
			Bean.setRIVER_NM(rs.getString("RIVER_NM"));
			Bean.setMUL_FROMDATE(rs.getString("MUL_FROMDATE"));
			Bean.setMUL_TODATE(rs.getString("MUL_TODATE"));
			Bean.setWITH_POST(rs.getString("WITH_POST"));
			Bean.setWORK_FROMDATE(rs.getString("WORK_FROMDATE"));
			Bean.setWORK_TODATE(rs.getString("WORK_TODATE"));
			Bean.setWITH_ADDR1(rs.getString("WITH_ADDR1"));
			Bean.setWITH_ADDR2(rs.getString("WITH_ADDR2"));
			Bean.setEXE_INFO(rs.getString("EXE_INFO"));
			Bean.setTOTAL_PERIOD(rs.getString("TOTAL_PERIOD"));
			Bean.setPARTLY_PERIOD(rs.getString("PARTLY_PERIOD"));
			
        	return	Bean;
        }
    }
    
    //	점용지 수정
    protected	class	Jumji_Modify	extends	SqlUpdate
    {
    	protected	Jumji_Modify(DataSource ds, MessageSourceAccessor msa)
        {
            super(ds, msa.getMessage("Querys.facility.minwoninfo.Jumji_Modify"));
            
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
    
    protected	String	Null2Space(String str)
    {
    	if(str	==	null)
    		str	= "";
    	
    	return	str;
    }
}