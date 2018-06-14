//	2009		Kim Yun Seo

package main.java.jumyong.jumyonginfo.dao;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

import javax.sql.DataSource;
import main.java.common.dao.RoadsJdbcDaoSupport;

import org.springframework.context.support.MessageSourceAccessor;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.MappingSqlQuery;
import org.springframework.jdbc.object.SqlUpdate;

import main.java.jumyong.jumyonginfo.model.AppealBean;
import main.java.jumyong.jumyonginfo.model.MinwonBean;
import main.java.jumyong.jumyonginfo.model.PlaceBean;
import main.java.jumyong.jumyonginfo.model.PlaceWithAddrBean;
import main.java.jumyong.jumyonginfo.model.TotalWIthBean;


public class MinwoninfoMapDao extends RoadsJdbcDaoSupport
{
	
    //	민원 정보
    protected	class	Minwon_View	extends	MappingSqlQuery
    {
        protected 	Minwon_View(DataSource ds, MessageSourceAccessor msa)
        {
          	super(ds, msa.getMessage("Querys.jumyong.jumyonginfo.Minwon_View"));
          	
	        declareParameter(new SqlParameter(Types.VARCHAR));
	        declareParameter(new SqlParameter(Types.VARCHAR));
	        declareParameter(new SqlParameter(Types.VARCHAR));
        }
        
        protected	Object mapRow(ResultSet rs, int rownum)	throws	SQLException
        {
        	MinwonBean	Bean	= new MinwonBean();

        	System.out.println("MinwoninfoMapDao");
        	System.out.println("Querys.jumyong.jumyonginfo.Minwon_View");
        	
        	Bean.setADMIN_NO(Null2Space(rs.getString("ADMIN_NO")));
			Bean.setREQ_NO(Null2Space(rs.getString("REQ_NO")));
			Bean.setREQ_DATE(Null2Space(rs.getString("REQ_DATE")));
			Bean.setREQ_NM(Null2Space(rs.getString("REQ_NM")));
			Bean.setMANAGER(Null2Space(rs.getString("MANAGER")));
			
			Bean.setGUBUN(Null2Space(rs.getString("GUBUN")));
			Bean.setAGENT_NM(Null2Space(rs.getString("AGENT_NM")));
			Bean.setAGENT_TEL(Null2Space(rs.getString("AGENT_TEL")));
			Bean.setEVENT_SET(Null2Space(rs.getString("EVENT_SET")));
			Bean.setREQ_SET(Null2Space(rs.getString("REQ_SET")));
			
			Bean.setREQ_SIGU(Null2Space(rs.getString("REQ_SIGU")));
			Bean.setREQ_DEP(Null2Space(rs.getString("REQ_DEP")));
			Bean.setREQ_SET_CN(Null2Space(rs.getString("REQ_SET_CN")));
			Bean.setBIZSSN(Null2Space(rs.getString("BIZSSN")));
			Bean.setMANAGE_DEP(Null2Space(rs.getString("MANAGE_DEP")));
			
			Bean.setNOTES(Null2Space(rs.getString("NOTES")));
			Bean.setPREDATE(Null2Space(rs.getString("PREDATE")));
			Bean.setSSN(Null2Space(rs.getString("SSN")));
			Bean.setNAME(Null2Space(rs.getString("NAME")));
			Bean.setTEL(Null2Space(rs.getString("TEL")));
			
			Bean.setHP(Null2Space(rs.getString("HP")));
			Bean.setADDR1(Null2Space(rs.getString("ADDR1")));
			Bean.setADDR2(Null2Space(rs.getString("ADDR2")));
			Bean.setPOST(Null2Space(rs.getString("POST")));
			Bean.setREAL_DEAL_DATE(Null2Space(rs.getString("REAL_DEAL_DATE")));
			
			Bean.setMW_PROG_SE(Null2Space(rs.getString("MW_PROG_SE")));
			Bean.setEMAIL(Null2Space(rs.getString("EMAIL")));
			Bean.setSEQ(Null2Space(rs.getString("SEQ")));
			Bean.setRN(Null2Space(rs.getString("RN")));
			Bean.setREFERENCE(Null2Space(rs.getString("REFERENCE")));
			
			//********** BEGIN_현진_20120215
			Bean.setDORO_ADDR1(Null2Space(rs.getString("DORO_ADDR1")));
			Bean.setDORO_ADDR2(Null2Space(rs.getString("DORO_ADDR2")));
			//********** END_현진_20120215			
        	return	Bean;
        }
    }
    
    
    //	민원 정보 1건 자세히  보기
    protected	class	Minwon_View_Search	extends	MappingSqlQuery
    {
        protected 	Minwon_View_Search(DataSource ds, MessageSourceAccessor msa)
        {
          	super(ds, msa.getMessage("Querys.jumyong.jumyonginfo.Minwon_View_Search"));
          	
	        declareParameter(new SqlParameter(Types.VARCHAR));
	        declareParameter(new SqlParameter(Types.VARCHAR));
        }
        
        protected	Object mapRow(ResultSet rs, int rownum)	throws	SQLException
        {
        	MinwonBean	Bean	= new MinwonBean();

        	System.out.println("MindowninfoMapDao");
        	System.out.println("Querys.jumyong.jumyonginfo.Minwon_View_Search");
        	Bean.setADMIN_NO(Null2Space(rs.getString("ADMIN_NO")));
			Bean.setREQ_NO(Null2Space(rs.getString("REQ_NO")));
			Bean.setREQ_DATE(Null2Space(rs.getString("REQ_DATE")));
			Bean.setREQ_NM(Null2Space(rs.getString("REQ_NM")));
			Bean.setMANAGER(Null2Space(rs.getString("MANAGER")));
			Bean.setGUBUN(Null2Space(rs.getString("GUBUN")));
			Bean.setAGENT_NM(Null2Space(rs.getString("AGENT_NM")));
			Bean.setAGENT_TEL(Null2Space(rs.getString("AGENT_TEL")));
			Bean.setEVENT_SET(Null2Space(rs.getString("EVENT_SET")));
			Bean.setREQ_SET(Null2Space(rs.getString("REQ_SET")));
			
			Bean.setREQ_SIGU(Null2Space(rs.getString("REQ_SIGU")));
			Bean.setREQ_DEP(Null2Space(rs.getString("REQ_DEP")));
			Bean.setREQ_SET_CN(Null2Space(rs.getString("REQ_SET_CN")));
			Bean.setBIZSSN(Null2Space(rs.getString("BIZSSN")));
			Bean.setMANAGE_DEP(Null2Space(rs.getString("MANAGE_DEP")));
			Bean.setNOTES(Null2Space(rs.getString("NOTES")));
			Bean.setPREDATE(Null2Space(rs.getString("PREDATE")));
			Bean.setSSN(Null2Space(rs.getString("SSN")));
			Bean.setNAME(Null2Space(rs.getString("NAME")));
			Bean.setTEL(Null2Space(rs.getString("TEL")));
			
			Bean.setHP(Null2Space(rs.getString("HP")));
			Bean.setADDR1(Null2Space(rs.getString("ADDR1")));
			Bean.setADDR2(Null2Space(rs.getString("ADDR2")));
			Bean.setPOST(Null2Space(rs.getString("POST")));
			Bean.setREAL_DEAL_DATE(Null2Space(rs.getString("REAL_DEAL_DATE")));
			Bean.setMW_PROG_SE(Null2Space(rs.getString("MW_PROG_SE")));
			Bean.setEMAIL(Null2Space(rs.getString("EMAIL")));
			Bean.setSEQ(Null2Space(rs.getString("SEQ")));
			Bean.setREFERENCE(Null2Space(rs.getString("REFERENCE")));
			//********** BEGIN_현진_20120215
			Bean.setDORO_ADDR1(Null2Space(rs.getString("DORO_ADDR1")));
			Bean.setDORO_ADDR2(Null2Space(rs.getString("DORO_ADDR2")));
			//********** END_현진_20120215			
        	return	Bean;
        }
    }
    
    
    //	민원 수정
    protected	class	Minwon_Modify	extends	SqlUpdate
    {
    	protected	Minwon_Modify(DataSource ds, MessageSourceAccessor msa)
        {
            super(ds, msa.getMessage("Querys.jumyong.jumyonginfo.Minwon_Modify"));
            
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            
            declareParameter(new SqlParameter(Types.VARCHAR));           
            declareParameter(new SqlParameter(Types.VARCHAR));
          //********** BEGIN_현진_20120215
            declareParameter(new SqlParameter(Types.VARCHAR));           
            declareParameter(new SqlParameter(Types.VARCHAR));            
          //********** END_현진_20120215

        }
    }
    
    //	민원추가
    protected	class	Minwon_Register	extends	SqlUpdate
    {
    	protected	Minwon_Register(DataSource ds, MessageSourceAccessor msa)
        {
            super(ds, msa.getMessage("Querys.jumyong.jumyonginfo.Minwon_Register"));
            
            System.out.println("MinwoninfoMapDao");
            System.out.println("Querys.jumyong.jumyonginfo.Minwon_Register");
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));

            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
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
          	super(ds, msa.getMessage("Querys.jumyong.jumyonginfo.Jumin_View"));
          	
	        declareParameter(new SqlParameter(Types.VARCHAR));
        }
        
        protected	Object mapRow(ResultSet rs, int rownum)	throws	SQLException
        {
        	AppealBean	Bean	= new AppealBean();
        	System.out.println("MinwoninfoMapDao");
        	System.out.println("Querys.jumyong.jumyonginfo.Jumin_View");
        	//********** BEGIN_현진_20120215        	
        	/*
        	  Bean.setADMIN_NO(rs.getString("ADMIN_NO"));
  			Bean.setNAME(rs.getString("NAME"));
			Bean.setSSN(rs.getString("SSN"));
			Bean.setBIZSSN(rs.getString("BIZSSN"));
			Bean.setBIZ_STATUS(rs.getString("BIZ_STATUS"));

			Bean.setBIZ_TYPES(rs.getString("BIZ_TYPES"));
			Bean.setPOST(rs.getString("POST"));
			Bean.setADDR1(rs.getString("ADDR1"));
			Bean.setADDR2(rs.getString("ADDR2"));
			Bean.setBD_BON(rs.getString("BD_BON"));
			Bean.setBD_BU(rs.getString("BD_BU"));
			Bean.setEMAIL(rs.getString("EMAIL"));

			Bean.setTEL(rs.getString("TEL"));
			Bean.setHP(rs.getString("HP"));
			Bean.setTONM(rs.getString("TONM"));
			Bean.setTOPOST(rs.getString("TOPOST"));
			Bean.setTOADDR1(rs.getString("TOADDR1"));

			Bean.setTOADDR2(rs.getString("TOADDR2"));
			Bean.setTOMAIL(rs.getString("TOMAIL"));
			Bean.setTOTEL(rs.getString("TOTEL"));
			Bean.setTOHP(rs.getString("TOHP"));
			Bean.setADDR_CHECK(rs.getString("ADDR_CHECK"));	
			Bean.setREFERENCE(rs.getString("REFERENCE"));

			Bean.setBEFORE_PERMISSION(rs.getString("B_PERMISSION"));
			Bean.setSAN(rs.getString("SAN"));
			Bean.setTOSAN(rs.getString("TOSAN"));
			Bean.setBON(rs.getString("BON"));
			Bean.setBU(rs.getString("BU"));
			Bean.setTOBON(rs.getString("TOBON"));
			Bean.setTOBU(rs.getString("TOBU"));
			Bean.setSI(rs.getString("SI")); // added by Sam Lee 2012. 01. 26
			Bean.setGUN(rs.getString("GUN")); // added by Sam Lee 2012. 01. 26
			Bean.setDORO_NM(rs.getString("DORO_NM")); // added by Sam Lee 2012. 01. 26
			Bean.setBD_NM(rs.getString("BD_NM")); // added by Sam Lee 2012. 01. 26
			Bean.setTOSI(rs.getString("TOSI")); // added by Sam Lee 2012. 01. 26
			Bean.setTOGUN(rs.getString("TOGUN")); // added by Sam Lee 2012. 01. 26 
			Bean.setTO_DORO_NM(rs.getString("TO_DORO_NM")); // added by Sam Lee 2012. 01. 26
			Bean.setTO_BD_NM(rs.getString("TO_BD_NM")); // added by Sam Lee 2012. 01. 26
			Bean.setTO_BD_BON(rs.getString("TO_BD_BON"));
			Bean.setTO_BD_BU(rs.getString("TO_BD_BU"));

			Bean.setDONG(rs.getString("DONG"));
			Bean.setSANGSE(rs.getString("SANGSE"));
			Bean.setTODONG(rs.getString("TODONG"));
			Bean.setTOSANGSE(rs.getString("TOSANGSE"));
			Bean.setBD_DET_NM(rs.getString("BD_DET_NM"));
			Bean.setTO_BD_DET_NM(rs.getString("TO_BD_DET_NM"));
        	 */
        	//********** END_현진_20120215
        	Bean.setADMIN_NO(rs.getString("ADMIN_NO"));
  			Bean.setNAME(rs.getString("NAME"));
			Bean.setSSN(rs.getString("SSN"));
			Bean.setBIZSSN(rs.getString("BIZSSN"));
			Bean.setBIZ_STATUS(rs.getString("BIZ_STATUS"));

			Bean.setBIZ_TYPES(rs.getString("BIZ_TYPES"));
			Bean.setPOST(rs.getString("POST"));
			Bean.setADDR1(rs.getString("ADDR1"));
			Bean.setADDR2(rs.getString("ADDR2"));
			Bean.setBD_BON(rs.getString("BD_BON"));
			Bean.setBD_BU(rs.getString("BD_BU"));
			Bean.setEMAIL(rs.getString("EMAIL"));

			Bean.setTEL(rs.getString("TEL"));
			Bean.setHP(rs.getString("HP"));
			Bean.setTONM(rs.getString("TONM"));
			Bean.setTOPOST(rs.getString("TOPOST"));
			Bean.setTOADDR1(rs.getString("TOADDR1"));

			Bean.setTOADDR2(rs.getString("TOADDR2"));
			Bean.setTOMAIL(rs.getString("TOMAIL"));
			Bean.setTOTEL(rs.getString("TOTEL"));
			Bean.setTOHP(rs.getString("TOHP"));
			Bean.setADDR_CHECK(rs.getString("ADDR_CHECK"));	
			Bean.setREFERENCE(rs.getString("REFERENCE"));

			Bean.setBEFORE_PERMISSION(rs.getString("B_PERMISSION"));
			Bean.setSAN(rs.getString("SAN"));
			Bean.setTOSAN(rs.getString("TOSAN"));
			Bean.setBON(rs.getString("BON"));
			Bean.setBU(rs.getString("BU"));
			Bean.setTOBON(rs.getString("TOBON"));
			Bean.setTOBU(rs.getString("TOBU"));
			Bean.setSI(rs.getString("SI")); // added by Sam Lee 2012. 01. 26
			Bean.setGUN(rs.getString("GUN")); // added by Sam Lee 2012. 01. 26
			Bean.setDORO_NM(rs.getString("DORO_NM")); // added by Sam Lee 2012. 01. 26
			Bean.setBD_NM(rs.getString("BD_NM")); // added by Sam Lee 2012. 01. 26
			Bean.setTOSI(rs.getString("TOSI")); // added by Sam Lee 2012. 01. 26
			Bean.setTOGUN(rs.getString("TOGUN")); // added by Sam Lee 2012. 01. 26 
			Bean.setTO_DORO_NM(rs.getString("TO_DORO_NM")); // added by Sam Lee 2012. 01. 26
			Bean.setTO_BD_NM(rs.getString("TO_BD_NM")); // added by Sam Lee 2012. 01. 26
			Bean.setTO_BD_BON(rs.getString("TO_BD_BON"));
			Bean.setTO_BD_BU(rs.getString("TO_BD_BU"));

			Bean.setDONG(rs.getString("DONG"));
			Bean.setSANGSE(rs.getString("SANGSE"));
			Bean.setTODONG(rs.getString("TODONG"));
			Bean.setTOSANGSE(rs.getString("TOSANGSE"));
			Bean.setBD_DET_NM(rs.getString("BD_DET_NM"));
			Bean.setTO_BD_DET_NM(rs.getString("TO_BD_DET_NM"));

			//********** BEGIN_현진_20120321
			Bean.setEXPONENT(rs.getString("EXPONENT"));
			Bean.setBUSINESSADDR(rs.getString("BUSINESSADDR"));
			//********** END_현진_20120321
			//********** BEGIN_KANG_20120417
			Bean.setCOMPANY_NAME(rs.getString("COMPANY_NAME"));
			//********** END_KANG_20120417
			return	Bean;
        }
    }
    
    //	점용인 수정
    protected	class	Jumin_Modify	extends	SqlUpdate 
    {
    	protected	Jumin_Modify(DataSource ds, MessageSourceAccessor msa)
        {
            super(ds, msa.getMessage("Querys.jumyong.jumyonginfo.Jumin_Modify"));
            
            System.out.println("Querys.jumyong.jumyonginfo.Jumin_Modify");

            
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));

            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));

            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));

            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));

            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));

            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));

            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));

            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));

            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));

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
          	super(ds, msa.getMessage("Querys.jumyong.jumyonginfo.Jumji_View"));
          	
	        declareParameter(new SqlParameter(Types.VARCHAR));
        }
        
        protected	Object mapRow(ResultSet rs, int rownum)	throws	SQLException
        {
        	PlaceBean	Bean	= new PlaceBean();

			Bean.setADMIN_NO(rs.getString("ADMIN_NO"));
			Bean.setTYPE(rs.getString("TYPE"));
			Bean.setSECTION(rs.getString("SECTION"));
			Bean.setPURPOSE_CD(rs.getString("PURPOSE_CD"));
			Bean.setPARKING_NUM(rs.getString("PARKING_NUM"));
			
			Bean.setOWNER_SET(rs.getString("OWNER_SET"));
			Bean.setTAX_SET(rs.getString("TAX_SET"));
			Bean.setMUL_POST(rs.getString("MUL_POST"));
			Bean.setSIDO(rs.getString("SIDO"));
			Bean.setSIGUNGU(rs.getString("SIGUNGU"));
			
			Bean.setBJ_CD(rs.getString("BJ_CD"));
			Bean.setHJ_CD(rs.getString("HJ_CD"));
			Bean.setSPC_CD(rs.getString("SPC_CD"));
			Bean.setBONBUN(rs.getString("BONBUN"));
			Bean.setBUBUN(rs.getString("BUBUN"));
			
			Bean.setTONG(rs.getString("TONG"));
			Bean.setBAN(rs.getString("BAN"));
			Bean.setBD_NM(rs.getString("BD_NM"));
			Bean.setBD_DONG(rs.getString("BD_DONG"));
			Bean.setBD_HO(rs.getString("BD_HO"));
			
			Bean.setMUL_FROMDATE(rs.getString("MUL_FROMDATE"));
			Bean.setMUL_TODATE(rs.getString("MUL_TODATE"));
			Bean.setWORK_FROMDATE(rs.getString("WORK_FROMDATE"));
			Bean.setWORK_TODATE(rs.getString("WORK_TODATE"));
			Bean.setEXE_INFO(rs.getString("EXE_INFO"));
			
			Bean.setRIVER_NM(rs.getString("RIVER_NM"));			
			Bean.setWITH_POST(rs.getString("WITH_POST"));
			Bean.setWITH_ADDR1(rs.getString("WITH_ADDR1"));
			Bean.setWITH_ADDR2(rs.getString("WITH_ADDR2"));
			Bean.setTOTAL_PERIOD(rs.getString("TOTAL_PERIOD"));
			
			Bean.setPARTLY_PERIOD(rs.getString("PARTLY_PERIOD"));
			Bean.setROAD_ADDR(rs.getString("ROAD_ADDR"));
			Bean.setROAD_BON(rs.getString("ROAD_BON"));
			Bean.setROAD_BU(rs.getString("ROAD_BU"));
			Bean.setREFERENCE(rs.getString("REFERENCE"));
			
			Bean.setWITH_SUM_PRICE(rs.getString("WITH_SUM_PRICE"));			
			Bean.setAREA_SIZE(String.valueOf(rs.getFloat("AREA_SIZE")));
			Bean.setRIVER_RANK(rs.getString("RIVER_RANK"));
			
			Bean.setREDUCTION_RATE(String.valueOf(rs.getFloat("REDUCTION_RATE")));
			Bean.setREDUCTION_REASON(rs.getString("REDUCTION_REASON"));
			Bean.setPERCENT_RATE(String.valueOf(rs.getFloat("PERCENT_RATE")));
			Bean.setPERCENT_REASON(rs.getString("PERCENT_REASON"));
			
			// 점용지 도로명 주소 추가 #mr (2014.03.13)
			Bean.setJYADDR_NEW(rs.getString("JYADDR_NEW"));
			Bean.setJYADDR_BON(rs.getString("JYADDR_BON"));
			Bean.setJYADDR_BU(rs.getString("JYADDR_BU"));
			
			Bean.setDUE_DATE(rs.getString("DUE_DATE"));
        	return	Bean;
        }
    }
    
    //	점용지 수정
    protected	class	Jumji_Modify	extends	SqlUpdate
    {
    	protected	Jumji_Modify(DataSource ds, MessageSourceAccessor msa)
        {
            super(ds, msa.getMessage("Querys.jumyong.jumyonginfo.Jumji_Modify"));
            
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.FLOAT));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
                        
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));

            //점용지 도로명주소 추가 #mr(2014.03.13)
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));	//DUE_dATE
            declareParameter(new SqlParameter(Types.VARCHAR)); //admin_no
        }
    }
    
    protected	String	Null2Space(String str)
    {
    	if(str	==	null)
    		str	= "";
    	
    	return	str;
    }
    
    //	점용지 정보
    protected	class	Total_With	extends	MappingSqlQuery
    {
        protected 	Total_With(DataSource ds, MessageSourceAccessor msa)
        {
          	super(ds, msa.getMessage("Querys.jumyong.jumyonginfo.Total_With_List"));
          	
	        declareParameter(new SqlParameter(Types.VARCHAR));
        }
        
        protected	Object mapRow(ResultSet rs, int rownum)	throws	SQLException
        {
        	TotalWIthBean	Bean	= new TotalWIthBean();

			Bean.setADMIN_NO(rs.getString("ADMIN_NO"));
			Bean.setBJ_CD(rs.getString("BJ_CD"));
			Bean.setBONBUN(rs.getString("BONBUN"));
			Bean.setBUBUN(rs.getString("BUBUN"));
			Bean.setPRICE(rs.getString("PRICE"));
			
        	return	Bean;
        }
    }
    
    //	민원추가
    protected	class	TotalWith_Register	extends	SqlUpdate
    {
    	protected	TotalWith_Register(DataSource ds, MessageSourceAccessor msa)
        {
            super(ds, msa.getMessage("Querys.jumyong.jumyonginfo.TotalWith_Register"));
            
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            

        }
    }
    
    public class totalWith_Delete extends SqlUpdate {
    	protected	totalWith_Delete(DataSource ds, MessageSourceAccessor msa)
    	{
    		super(ds, msa.getMessage("Querys.jumyong.jumyonginfo.TotalWith_Delete"));
            
            declareParameter(new SqlParameter(Types.VARCHAR));

		}
	}
    
    //	공시지가 적용지번 조회
    protected	class	SelectPlaceWithAddr	extends	MappingSqlQuery
    {
        protected 	SelectPlaceWithAddr(DataSource ds, MessageSourceAccessor msa)
        {
          	super(ds, msa.getMessage("Querys.jumyong.jumyonginfo.SelectPlaceWithAddr"));
          	
	        declareParameter(new SqlParameter(Types.VARCHAR));
        }
        
        protected	Object mapRow(ResultSet rs, int rownum)	throws	SQLException
        {
        	PlaceWithAddrBean Bean = new PlaceWithAddrBean();
        	
        	Bean.setSEQ(rs.getString("SEQ"));
        	Bean.setADMIN_NO(rs.getString("ADMIN_NO"));
        	Bean.setPNU(rs.getString("PNU"));
        	Bean.setADDR(rs.getString("ADDR"));
			
        	return	Bean;
        }
    }
    
    
	//공시지가 적용지번 삭제
    protected	class	DeletePlaceWithAddr	extends	SqlUpdate
    {
    	protected	DeletePlaceWithAddr(DataSource ds, MessageSourceAccessor msa)
        {
            super(ds, msa.getMessage("Querys.jumyong.jumyonginfo.DeletePlaceWithAddr"));
            
            declareParameter(new SqlParameter(Types.VARCHAR));

        }
    }
    
    
    //	공시지가 적용지번 추가
    protected	class	InsertPlaceWithAddr	extends	SqlUpdate
    {
    	protected	InsertPlaceWithAddr(DataSource ds, MessageSourceAccessor msa)
        {
            super(ds, msa.getMessage("Querys.jumyong.jumyonginfo.InsertPlaceWithAddr"));
            
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
        }
    }
}