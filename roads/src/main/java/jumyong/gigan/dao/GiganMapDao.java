//	2009		Kim Yun Seo

package main.java.jumyong.gigan.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

import javax.sql.DataSource;

import main.java.common.util.catUtil.Util;
import main.java.jumyong.gigan.model.AppealBean;
import main.java.jumyong.gigan.model.GiyeonBean;
import main.java.jumyong.gigan.model.PlaceBean;
import main.java.jumyong.gigan.model.GiganBean;
import main.java.jumyong.gigan.model.PlaceWithAddrBean;

import org.springframework.context.support.MessageSourceAccessor;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.MappingSqlQuery;
import org.springframework.jdbc.object.SqlUpdate;


public class GiganMapDao {
	
	protected	class	BeforeSearch	extends	MappingSqlQuery
    {
        protected 	BeforeSearch(DataSource ds, MessageSourceAccessor msa)
        {
          	super(ds, msa.getMessage("Querys.jumyong.gigan.BeforeSearch"));
          	
          	declareParameter(new SqlParameter(Types.VARCHAR));
          	declareParameter(new SqlParameter(Types.VARCHAR));
          	declareParameter(new SqlParameter(Types.VARCHAR));
          	declareParameter(new SqlParameter(Types.VARCHAR));
          	declareParameter(new SqlParameter(Types.VARCHAR));
          	
          	declareParameter(new SqlParameter(Types.VARCHAR));
          	declareParameter(new SqlParameter(Types.VARCHAR));
          	declareParameter(new SqlParameter(Types.VARCHAR));
          	declareParameter(new SqlParameter(Types.VARCHAR));
          	declareParameter(new SqlParameter(Types.VARCHAR));
          	
          	declareParameter(new SqlParameter(Types.VARCHAR));
          	declareParameter(new SqlParameter(Types.VARCHAR));
          	declareParameter(new SqlParameter(Types.VARCHAR));
          	declareParameter(new SqlParameter(Types.VARCHAR));
          	declareParameter(new SqlParameter(Types.VARCHAR));
          	
          	declareParameter(new SqlParameter(Types.INTEGER));
          	declareParameter(new SqlParameter(Types.INTEGER));
        }
        
        protected	Object mapRow(ResultSet rs, int rownum)	throws	SQLException
        {
        	GiganBean	Bean	= new GiganBean();
        	
        	Bean.setADMIN_NO(rs.getString("ADMIN_NO"));
        	Bean.setTYPE(rs.getString("TYPE"));
        	Bean.setNAME(rs.getString("NAME"));
        	Bean.setPURPOSE_CD(rs.getString("PURPOSE_CD"));
        	Bean.setPURPOSE_CLASS(rs.getString("PURPOSE_CLASS"));
        	Bean.setPURPOSE_SORT(rs.getString("PURPOSE_SORT"));
        	Bean.setPURPOSE_KIND(rs.getString("PURPOSE_KIND"));
        	Bean.setBJ_CD(rs.getString("BJ_CD"));
        	Bean.setSAN_CK(rs.getString("SPC_CD"));
        	Bean.setBONBUN(rs.getString("BONBUN"));
        	Bean.setBUBUN(rs.getString("BUBUN"));
        	Bean.setMUL_FROMDATE(rs.getString("MUL_FROMDATE"));
        	Bean.setMUL_TODATE(rs.getString("MUL_TODATE"));
        	Bean.setRN(rs.getString("RN"));
        	Bean.setAPPEAL_ADDR(rs.getString("APPEAL_ADDR"));
        	Bean.setSSN(rs.getString("SSN"));
        	Bean.setPOST(rs.getString("POST"));
        	Bean.setAREA_SIZE(String.valueOf(rs.getFloat("AREA_SIZE")));
        	
        	Bean.setSECTION(rs.getString("SECTION"));
        	Bean.setSECTION_NAME(rs.getString("SECTION_NAME"));
        	Bean.setSI(rs.getString("SI"));
        	Bean.setGUN(rs.getString("GUN"));
        	Bean.setDORO_NM(rs.getString("DORO_NM"));
        	Bean.setBD_BON(rs.getString("BD_BON"));
        	Bean.setBD_BU(rs.getString("BD_BU"));
        	Bean.setBD_NM(rs.getString("BD_NM"));
        	Bean.setBD_DET_NM(rs.getString("BD_DET_NM"));


        	Bean.setTOSI(rs.getString("TOSI"));
        	Bean.setTOGUN(rs.getString("TOGUN"));
        	Bean.setTODORO_NM(rs.getString("TO_DORO_NM"));
        	Bean.setTOBD_BON(rs.getString("TO_BD_BON"));
        	Bean.setTOBD_BU(rs.getString("TO_BD_BU"));
        	Bean.setTOBD_NM(rs.getString("TO_BD_NM"));
        	Bean.setTOBD_DET_NM(rs.getString("TO_BD_DET_NM"));
        	
        	Bean.setJUMYONGJI_DORO_ADDR(rs.getString("JUMYONGJI_DORO_ADDR"));
        	
        	Bean.setPERCENT_RATE(rs.getString("PERCENT_RATE"));
        	Bean.setREDUCTION_REASON(rs.getString("REDUCTION_REASON"));
        	Bean.setREDUCTION_RATE(rs.getString("REDUCTION_RATE"));
        	Bean.setREDUCTION_REASON(rs.getString("REDUCTION_REASON"));
        	
        	return	Bean;
        }
    }
	
	protected	class	Gigan_Update	extends	SqlUpdate
    {
        protected 	Gigan_Update(DataSource ds, MessageSourceAccessor msa)
        {
          	super(ds, msa.getMessage("Querys.jumyong.gigan.Gigan_Update"));
          	System.out.println(msa.getMessage("Querys.jumyong.gigan.Gigan_Update"));
          	declareParameter(new SqlParameter(Types.VARCHAR));
	        
        }
    }

    protected	class	Search	extends	MappingSqlQuery
    {
        protected 	Search(DataSource ds, MessageSourceAccessor msa)
        {
          	super(ds, msa.getMessage("Querys.jumyong.gigan.Search"));
          	
          	System.out.println("GiganMapDao Search Querys.jumyong.gigan.Search");
          	
          	declareParameter(new SqlParameter(Types.VARCHAR));
          	declareParameter(new SqlParameter(Types.VARCHAR));
          	declareParameter(new SqlParameter(Types.VARCHAR));
          	declareParameter(new SqlParameter(Types.VARCHAR));
          	declareParameter(new SqlParameter(Types.VARCHAR));
          	
          	declareParameter(new SqlParameter(Types.VARCHAR));
          	declareParameter(new SqlParameter(Types.VARCHAR));
          	declareParameter(new SqlParameter(Types.VARCHAR));
          	declareParameter(new SqlParameter(Types.VARCHAR));
          	
          	declareParameter(new SqlParameter(Types.VARCHAR));
          	declareParameter(new SqlParameter(Types.VARCHAR));
          	declareParameter(new SqlParameter(Types.VARCHAR));
          	declareParameter(new SqlParameter(Types.VARCHAR));
          	declareParameter(new SqlParameter(Types.VARCHAR));
          	
          	declareParameter(new SqlParameter(Types.INTEGER));
          	declareParameter(new SqlParameter(Types.INTEGER));
        }
        
        protected	Object mapRow(ResultSet rs, int rownum)	throws	SQLException
        {
        	GiganBean	Bean	= new GiganBean();
        	
        	Bean.setADMIN_NO(rs.getString("ADMIN_NO"));
        	Bean.setTYPE(rs.getString("TYPE"));
        	Bean.setNAME(rs.getString("NAME"));
        	Bean.setPURPOSE_CD(rs.getString("PURPOSE_CD"));
        	Bean.setPURPOSE_CLASS(rs.getString("PURPOSE_CLASS"));
        	Bean.setPURPOSE_SORT(rs.getString("PURPOSE_SORT"));
        	Bean.setPURPOSE_KIND(rs.getString("PURPOSE_KIND"));
        	Bean.setBJ_CD(rs.getString("BJ_CD"));
        	Bean.setSAN_CK(rs.getString("SPC_CD"));
        	Bean.setBONBUN(rs.getString("BONBUN"));
        	Bean.setBUBUN(rs.getString("BUBUN"));
        	Bean.setMUL_FROMDATE(rs.getString("MUL_FROMDATE"));
        	Bean.setMUL_TODATE(rs.getString("MUL_TODATE"));
        	Bean.setRN(rs.getString("RN"));
        	Bean.setAPPEAL_ADDR(rs.getString("APPEAL_ADDR"));
        	Bean.setSSN(rs.getString("SSN"));
        	Bean.setPOST(rs.getString("POST"));
        	Bean.setSI(rs.getString("SI"));
        	Bean.setGUN(rs.getString("GUN"));
        	Bean.setDORO_NM(rs.getString("DORO_NM"));
        	Bean.setBD_NM(rs.getString("BD_NM"));
        	Bean.setBD_DET_NM(rs.getString("BD_DET_NM"));
        	Bean.setBD_BON(rs.getString("BD_BON"));
        	Bean.setBD_BU(rs.getString("BD_BU"));
        	Bean.setAREA_SIZE(String.valueOf(rs.getFloat("AREA_SIZE")));
        	
        	Bean.setSECTION(rs.getString("SECTION"));
        	Bean.setSECTION_NAME(rs.getString("SECTION_NAME"));
        	        	
        	Bean.setTEL(rs.getString("TEL"));
        	Bean.setHP(rs.getString("HP"));
        	
        	Bean.setTOPOST(rs.getString("TOPOST"));
        	Bean.setSONGDALGI(rs.getString("SONGDALGI"));
        	Bean.setBD_NM_JUMJI(rs.getString("BD_NM_JUMJI"));
        	Bean.setTONM(rs.getString("TONM"));
        	Bean.setTOTEL(rs.getString("TOTEL"));
        	Bean.setTOHP(rs.getString("TOHP"));
        	
        	Bean.setJUMYONGJI_DORO_ADDR(rs.getString("JUMYONGJI_DORO_ADDR"));
        	Bean.setJUMYONGJI_DORO_ADDR(rs.getString("ROAD_ADDR"));
        	
        	Bean.setREDUCTION_RATE(rs.getString("REDUCTION_RATE"));
			Bean.setREDUCTION_REASON(rs.getString("REDUCTION_REASON"));
			Bean.setPERCENT_RATE(rs.getString("PERCENT_RATE"));
			Bean.setPERCENT_REASON(rs.getString("PERCENT_REASON"));
        	
        	return	Bean;
        }
    }
    
     //	점용인 정보
    protected	class	Jumin_View	extends	MappingSqlQuery
    {
        protected 	Jumin_View(DataSource ds, MessageSourceAccessor msa)
        {
          	super(ds, msa.getMessage("Querys.jumyong.gigan.Jumin_View"));
          	
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
			Bean.setTOPOST_NM(rs.getString("TONM"));
			Bean.setTOTEL(rs.getString("TOTEL"));
			Bean.setTOHP(rs.getString("TOHP"));	
			Bean.setTOEMAIL(rs.getString("TOMAIL"));
			Bean.setBEFORE_PERMISSION(rs.getString("B_PERMISSION"));
			
			Bean.setSAN(rs.getString("SAN"));
			Bean.setTOSAN(rs.getString("TOSAN"));
			Bean.setBON(rs.getString("BON"));
			Bean.setBU(rs.getString("BU"));
			Bean.setTOBON(rs.getString("TOBON"));
			Bean.setTOBU(rs.getString("TOBU"));
			
			Bean.setTOBON(rs.getString("TOBON"));
			Bean.setREFERENCE(rs.getString("REFERENCE"));
			Bean.setTONM(rs.getString("TONM"));
			Bean.setTOMAIL(rs.getString("TOMAIL"));
			
			Bean.setSI(rs.getString("SI"));
			Bean.setGUN(rs.getString("GUN"));
			Bean.setDORO_NM(rs.getString("DORO_NM"));
			Bean.setBD_BON(rs.getString("BD_BON"));
			Bean.setBD_BU(rs.getString("BD_BU"));
			Bean.setBD_NM(rs.getString("BD_NM"));
			Bean.setBD_DET_NM(rs.getString("BD_DET_NM"));
			
			Bean.setTOSI(rs.getString("TOSI"));
			Bean.setTOGUN(rs.getString("TOGUN"));
			Bean.setTODORO_NM(rs.getString("TO_DORO_NM"));
			Bean.setTOBD_BON(rs.getString("TO_BD_BON"));
			Bean.setTOBD_BU(rs.getString("TO_BD_BU"));
			Bean.setTOBD_NM(rs.getString("TO_BD_NM"));
			Bean.setTOBD_DET_NM(rs.getString("TO_BD_DET_NM"));
			
        	return	Bean;
        }
    }
    
    
    //	점용지 정보
    protected	class	Jumji_View	extends	MappingSqlQuery
    {
        protected 	Jumji_View(DataSource ds, MessageSourceAccessor msa)
        {
          	super(ds, msa.getMessage("Querys.jumyong.gigan.Jumji_View"));
          	
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
			
        	return	Bean;
        }
    }
    
    
    //	점용기간 연장 출력
    protected	class	Gigan_Search	extends	MappingSqlQuery
    {
        protected 	Gigan_Search(DataSource ds, MessageSourceAccessor msa)
        {
          	super(ds, msa.getMessage("Querys.jumyong.gigan.Gigan_Search"));
          	
	        declareParameter(new SqlParameter(Types.VARCHAR));
//	        declareParameter(new SqlParameter(Types.VARCHAR));
//	        declareParameter(new SqlParameter(Types.VARCHAR));
        }
        
        protected	Object mapRow(ResultSet rs, int rownum)	throws	SQLException
        {
        	GiyeonBean	Bean	= new GiyeonBean();

//			Bean.setRN(rs.getString("RN"));
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
          	super(ds, msa.getMessage("Querys.jumyong.gigan.Gigan_Register"));
          	
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
          	super(ds, msa.getMessage("Querys.jumyong.gigan.Gigan_Ext"));
          	
          	declareParameter(new SqlParameter(Types.VARCHAR));
	        declareParameter(new SqlParameter(Types.VARCHAR));
	        declareParameter(new SqlParameter(Types.VARCHAR));
	        
	        System.out.println("!! Querys.jumyong.gigan.Gigan_Ext");
        }
    }
    
    
    
    //	기간 연장 이력정보 전체 추가
    protected	class	Gigan_All_Register	extends	SqlUpdate
    {
        protected 	Gigan_All_Register(DataSource ds, MessageSourceAccessor msa)
        {
          	super(ds, msa.getMessage("Querys.jumyong.gigan.Gigan_All_Register"));
          	
          	declareParameter(new SqlParameter(Types.VARCHAR));
	        declareParameter(new SqlParameter(Types.VARCHAR));
	        declareParameter(new SqlParameter(Types.VARCHAR));
	        declareParameter(new SqlParameter(Types.VARCHAR));
	        declareParameter(new SqlParameter(Types.VARCHAR));
	        
          	declareParameter(new SqlParameter(Types.VARCHAR));
          	declareParameter(new SqlParameter(Types.VARCHAR));
          	declareParameter(new SqlParameter(Types.VARCHAR));
          	declareParameter(new SqlParameter(Types.VARCHAR));
          	declareParameter(new SqlParameter(Types.VARCHAR));
          	
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
          	super(ds, msa.getMessage("Querys.jumyong.gigan.Gigan_All_Ext"));
          	
          	declareParameter(new SqlParameter(Types.VARCHAR));
	        declareParameter(new SqlParameter(Types.VARCHAR));
          	declareParameter(new SqlParameter(Types.VARCHAR));
          	declareParameter(new SqlParameter(Types.VARCHAR));
          	declareParameter(new SqlParameter(Types.VARCHAR));
          	
          	declareParameter(new SqlParameter(Types.VARCHAR));
          	declareParameter(new SqlParameter(Types.VARCHAR));
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
          	super(ds, msa.getMessage("Querys.jumyong.gigan.Admin_Search"));
          	
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
    
    //	공시지가 적용지번 조회
    protected	class	SelectPlaceWithAddr	extends	MappingSqlQuery
    {
        protected 	SelectPlaceWithAddr(DataSource ds, MessageSourceAccessor msa)
        {
          	super(ds, msa.getMessage("Querys.jumyong.gigan.SelectPlaceWithAddr"));
          	
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
    
    
    protected	String	NullCheck(String str)
    {
    	if(str	==	null)
    		str	= "";
    	
    	return	str;
    }
}
