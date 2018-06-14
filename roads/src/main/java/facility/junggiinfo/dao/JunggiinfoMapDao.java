//	2009		Kim Yun Seo

package main.java.facility.junggiinfo.dao;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

import javax.sql.DataSource;
import main.java.common.dao.RoadsJdbcDaoSupport;

import org.springframework.context.support.MessageSourceAccessor;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.MappingSqlQuery;
import org.springframework.jdbc.object.SqlUpdate;

import main.java.facility.junggiinfo.model.AppealBean;
import main.java.facility.junggiinfo.model.MinwonBean;
import main.java.facility.junggiinfo.model.PlaceBean;
import main.java.facility.minwon.model.DepthBean;


public class JunggiinfoMapDao extends RoadsJdbcDaoSupport
{
	
	 protected	String	Null2Space(String str)
    {
    	if(str	==	null)
    		str	= "";
    	
    	return	str;
    }
	
    //	민원 정보
    protected	class	Minwon_View	extends	MappingSqlQuery
    {
        protected 	Minwon_View(DataSource ds, MessageSourceAccessor msa)
        {
          	super(ds, msa.getMessage("Querys.facility.junggiinfo.Minwon_View"));
          	
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
          	super(ds, msa.getMessage("Querys.facility.junggiinfo.Minwon_View_Search"));
          	
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
            super(ds, msa.getMessage("Querys.facility.junggiinfo.Minwon_Modify"));
            
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
            super(ds, msa.getMessage("Querys.facility.junggiinfo.Minwon_Register"));
            
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
          	super(ds, msa.getMessage("Querys.facility.junggiinfo.Jumin_View"));
          	
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
			Bean.setPOST(rs.getString("POST"));
			Bean.setADDR1(rs.getString("ADDR1"));
			Bean.setADDR2(rs.getString("ADDR2"));
			Bean.setBIZ_STATUS(rs.getString("BIZ_STATUS"));
			Bean.setBIZ_TYPES(rs.getString("BIZ_TYPES"));
			Bean.setROAD_ADDR(rs.getString("ROAD_ADDR"));
			Bean.setROAD_BON(rs.getString("ROAD_BON"));
			Bean.setROAD_BU(rs.getString("ROAD_BU"));
			Bean.setADDR_CHECK(rs.getString("ADDR_CHECK"));
			Bean.setTOPOST(rs.getString("TOPOST"));	
			Bean.setTOADDR1(rs.getString("TOADDR1"));
			Bean.setTOADDR2(rs.getString("TOADDR2"));
			Bean.setTOPOST_NM(rs.getString("TOPOST_NM"));
			Bean.setTOTEL(rs.getString("TOTEL"));
			Bean.setTOTEL_EXT(rs.getString("TOTEL_EXT"));
			Bean.setTOHP(rs.getString("TOHP"));
			Bean.setTOFAX(rs.getString("TOFAX"));
			Bean.setREGDATE(rs.getString("REGDATE"));
			Bean.setMANAGER(rs.getString("MANAGER"));
			Bean.setRN(rs.getString("RN"));
			
        	return	Bean;
        }
    }
    
    //	점용인 수정
    protected	class	Jumin_Modify	extends	SqlUpdate 
    {
    	protected	Jumin_Modify(DataSource ds, MessageSourceAccessor msa)
        {
            super(ds, msa.getMessage("Querys.facility.junggiinfo.Jumin_Modify"));
            
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
    
    //	점용지 정보
    protected	class	Jumji_View2	extends	MappingSqlQuery
    {
        protected 	Jumji_View2(DataSource ds, MessageSourceAccessor msa)
        {
          	super(ds, msa.getMessage("Querys.facility.junggiinfo.Jumji_View2"));
          	
	        declareParameter(new SqlParameter(Types.VARCHAR));
	        declareParameter(new SqlParameter(Types.VARCHAR));
	        declareParameter(new SqlParameter(Types.VARCHAR));
        }
        
        protected	Object mapRow(ResultSet rs, int rownum)	throws	SQLException
        {
        	PlaceBean	Bean	= new PlaceBean();

			Bean.setCORP_CD(rs.getString("CORP_CD"));
			Bean.setGU_CODE(rs.getString("GU_CODE"));
			Bean.setREQUEST_NO(rs.getString("REQUEST_NO"));
			Bean.setOBJECT_NO(rs.getString("OBJECT_NO"));
			Bean.setSECTION(rs.getString("SECTION"));
			Bean.setPURPOSE_CD(rs.getString("PURPOSE_CD"));
			Bean.setOWNER_SET(rs.getString("OWNER_SET"));
			Bean.setTAX_SET(rs.getString("TAX_SET"));
			Bean.setSIDO(rs.getString("SIDO"));
			Bean.setSIGUNGU(rs.getString("SIGUNGU"));
			Bean.setBJ_CD(rs.getString("BJ_CD"));
			Bean.setHJ_CD(rs.getString("HJ_CD"));
			Bean.setSPC_CD(rs.getString("SPC_CD"));
			Bean.setBONBUN(rs.getString("BONBUN"));
			Bean.setBUBUN(rs.getString("BUBUN"));
			Bean.setMUL_FROMDATE(rs.getString("MUL_FROMDATE"));
			Bean.setMUL_TODATE(rs.getString("MUL_TODATE"));
			Bean.setWORK_FROMDATE(rs.getString("WORK_FROMDATE"));
			Bean.setWORK_TODATE(rs.getString("WORK_TODATE"));
			Bean.setFINISH_DATE(rs.getString("FINISH_DATE"));
			Bean.setSTRUTS(rs.getString("STRUTS"));
			Bean.setEXE_INFO(rs.getString("EXE_INFO"));
			Bean.setPURPOSESEBU_CD(rs.getString("PURPOSESEBU_CD"));
			Bean.setSTANDARD(rs.getString("STANDARD"));
			Bean.setQUANTITY(rs.getString("QUANTITY"));
			Bean.setDEPTH_CK(rs.getString("DEPTH_CK"));
			Bean.setDEPTH_NUM(rs.getString("DEPTH_NUM"));
			Bean.setCOMPLETION_DATE(rs.getString("COMPLETION_DATE"));
			Bean.setWITH_ADDR(rs.getString("WITH_ADDR"));
			Bean.setWITH_ADDR_CK(rs.getString("WITH_ADDR_CK"));
			Bean.setPARTLY_PERIOD(rs.getString("PARTLY_PERIOD"));
			Bean.setTOTAL_PERIOD(rs.getString("TOTAL_PERIOD"));
			Bean.setSISUL_ADDR(rs.getString("SISUL_ADDR"));
			Bean.setADDR_CK(rs.getString("ADDR_CK"));
			Bean.setSISUL_ADDR_CK(rs.getString("SISUL_ADDR_CK"));
			Bean.setSAN_CK(rs.getString("SAN_CK"));
			Bean.setADMIN_NO(rs.getString("ADMIN_NO"));
			Bean.setSISUL_POST(rs.getString("SISUL_POST"));
			Bean.setSISUL_ADDR1(rs.getString("SISUL_ADDR1"));
			Bean.setSISUL_ADDR2(rs.getString("SISUL_ADDR2"));
			Bean.setYEAR(rs.getString("YEAR"));
			Bean.setRN(rs.getString("RN"));
			
        	return	Bean;
        }
    }
    
    //	점용지 정보
    protected	class	Jumji_View	extends	MappingSqlQuery
    {
        protected 	Jumji_View(DataSource ds, MessageSourceAccessor msa)
        {
          	super(ds, msa.getMessage("Querys.facility.junggiinfo.Jumji_View"));
          	
	        declareParameter(new SqlParameter(Types.VARCHAR));
	        declareParameter(new SqlParameter(Types.VARCHAR));
	        declareParameter(new SqlParameter(Types.VARCHAR));
	        declareParameter(new SqlParameter(Types.VARCHAR));
	        declareParameter(new SqlParameter(Types.VARCHAR));
        }
        
        protected	Object mapRow(ResultSet rs, int rownum)	throws	SQLException
        {
        	PlaceBean	Bean	= new PlaceBean();

			Bean.setCORP_CD(rs.getString("CORP_CD"));
			Bean.setGU_CODE(rs.getString("GU_CODE"));
			Bean.setREQUEST_NO(rs.getString("REQUEST_NO"));
			Bean.setOBJECT_NO(rs.getString("OBJECT_NO"));
			Bean.setSECTION(rs.getString("SECTION"));
			Bean.setPURPOSE_CD(rs.getString("PURPOSE_CD"));
			Bean.setPURPOSE_NM(rs.getString("PURPOSE_NM"));
			Bean.setOWNER_SET(rs.getString("OWNER_SET"));
			Bean.setTAX_SET(rs.getString("TAX_SET"));
			Bean.setSIDO(rs.getString("SIDO"));
			Bean.setSIGUNGU(rs.getString("SIGUNGU"));
			Bean.setBJ_CD(rs.getString("BJ_CD"));
			Bean.setHJ_CD(rs.getString("HJ_CD"));
			Bean.setSPC_CD(rs.getString("SPC_CD"));
			Bean.setBONBUN(rs.getString("BONBUN"));
			Bean.setBUBUN(rs.getString("BUBUN"));
			Bean.setMUL_FROMDATE(rs.getString("MUL_FROMDATE"));
			Bean.setMUL_TODATE(rs.getString("MUL_TODATE"));
			Bean.setWORK_FROMDATE(rs.getString("WORK_FROMDATE"));
			Bean.setWORK_TODATE(rs.getString("WORK_TODATE"));
			Bean.setFINISH_DATE(rs.getString("FINISH_DATE"));
			Bean.setSTRUTS(rs.getString("STRUTS"));
			Bean.setEXE_INFO(rs.getString("EXE_INFO"));
			Bean.setPURPOSESEBU_CD(rs.getString("PURPOSESEBU_CD"));
			Bean.setSTANDARD(rs.getString("STANDARD"));
			Bean.setQUANTITY(rs.getString("QUANTITY"));
			Bean.setDEPTH_CK(rs.getString("DEPTH_CK"));
			Bean.setDEPTH_NUM(rs.getString("DEPTH_NUM"));
			Bean.setCOMPLETION_DATE(rs.getString("COMPLETION_DATE"));
			Bean.setWITH_ADDR(rs.getString("WITH_ADDR"));
			Bean.setWITH_ADDR_CK(rs.getString("WITH_ADDR_CK"));
			Bean.setPARTLY_PERIOD(rs.getString("PARTLY_PERIOD"));
			Bean.setTOTAL_PERIOD(rs.getString("TOTAL_PERIOD"));
			Bean.setSISUL_ADDR(rs.getString("SISUL_ADDR"));
			Bean.setADDR_CK(rs.getString("ADDR_CK"));
			Bean.setSISUL_ADDR_CK(rs.getString("SISUL_ADDR_CK"));
			Bean.setSAN_CK(rs.getString("SAN_CK"));
			Bean.setADMIN_NO(rs.getString("ADMIN_NO"));
			Bean.setSISUL_POST(rs.getString("SISUL_POST"));
			Bean.setSISUL_ADDR1(rs.getString("SISUL_ADDR1"));
			Bean.setSISUL_ADDR2(rs.getString("SISUL_ADDR2"));
			Bean.setYEAR(rs.getString("YEAR"));
			Bean.setTAX_SET_NM(rs.getString("TAX_SET_NM"));
			Bean.setPURPOSESEBU_NM(rs.getString("PURPOSESEBU_NM"));
			Bean.setRN(rs.getString("RN"));
			
        	return	Bean;
        }
    }
    
    //	점용지 수정
    protected	class	Jumji_Modify	extends	SqlUpdate
    {
    	protected	Jumji_Modify(DataSource ds, MessageSourceAccessor msa)
        {
            super(ds, msa.getMessage("Querys.facility.junggiinfo.Jumji_Modify"));
            
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
    
    protected	class	Jumji_Register	extends	SqlUpdate
    {
    	protected	Jumji_Register(DataSource ds, MessageSourceAccessor msa)
        {
            super(ds, msa.getMessage("Querys.facility.junggiinfo.Jumji_Register"));
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
//            declareParameter(new SqlParameter(Types.VARCHAR));
//            declareParameter(new SqlParameter(Types.VARCHAR));
//            declareParameter(new SqlParameter(Types.VARCHAR));
//            declareParameter(new SqlParameter(Types.VARCHAR));

//            declareParameter(new SqlParameter(Types.VARCHAR));
//            declareParameter(new SqlParameter(Types.VARCHAR));
//            declareParameter(new SqlParameter(Types.VARCHAR));
//            declareParameter(new SqlParameter(Types.VARCHAR));
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
    
}