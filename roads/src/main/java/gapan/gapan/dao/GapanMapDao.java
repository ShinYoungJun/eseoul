package main.java.gapan.gapan.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

import javax.sql.DataSource;

import main.java.gapan.gapan.model.GapanBean;
import main.java.gapan.gapan.model.OperatorBean;
import main.java.gapan.gapan.model.FamilyBean;
import main.java.gapan.gapan.model.BloomBean;
import main.java.gapan.gapan.model.OperBean;
import main.java.gapan.gapan.model.JumjiSearchBean;


import org.springframework.context.support.MessageSourceAccessor;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.MappingSqlQuery;
import org.springframework.jdbc.object.SqlUpdate;


public class GapanMapDao {

    protected	class	Search	extends	MappingSqlQuery
    {
        protected 	Search(DataSource ds, MessageSourceAccessor msa)
        {
          	super(ds, msa.getMessage("Querys.gapan.gapan.Search"));
          	
          	declareParameter(new SqlParameter(Types.VARCHAR));
          	declareParameter(new SqlParameter(Types.VARCHAR));
          	declareParameter(new SqlParameter(Types.VARCHAR));
          	declareParameter(new SqlParameter(Types.VARCHAR));
          	declareParameter(new SqlParameter(Types.VARCHAR));
          	declareParameter(new SqlParameter(Types.VARCHAR));
          	declareParameter(new SqlParameter(Types.VARCHAR));
          	declareParameter(new SqlParameter(Types.VARCHAR));
          	declareParameter(new SqlParameter(Types.VARCHAR));
          	declareParameter(new SqlParameter(Types.VARCHAR));
//          	declareParameter(new SqlParameter(Types.VARCHAR));
          	
          	declareParameter(new SqlParameter(Types.VARCHAR));
          	declareParameter(new SqlParameter(Types.VARCHAR));
        }
        
        protected	Object mapRow(ResultSet rs, int rownum)	throws	SQLException
        {
        	GapanBean	Bean	= new GapanBean();
//        	System.out.println("rs="+rs.toString());
        	Bean.setGAPAN_NO(rs.getString("GAPAN_NO"));					//관리번호				
        	Bean.setGP_TYPE_NM(rs.getString("GP_TYPE"));				//가판종류
        	Bean.setFT_TYPE_NM(rs.getString("FT_TYP"));				//시설물명
        	Bean.setOWNER_NAME(rs.getString("OWNER_NAME"));				//운영자
        	Bean.setSG_TYPE_NM(rs.getString("SG_TYP"));				//취급품목
        	Bean.setSG_SEL_NM(rs.getString("SG_SEL"));			//상품분류
        	Bean.setWITH_ADDR(rs.getString("WITH_ADDR"));				//인접지
        	Bean.setREG_DATE(rs.getString("REG_DATE"));					//조회기간
//        	Bean.setCHECK_YN_NM(rs.getString("CHECK_YN_NM"));			//검토여부
        	Bean.setRN(rs.getString("RN"));
        	
        	return	Bean;
        }
    }
      
    // 운영자 정보
    protected	class	getOperatorInfo	extends	MappingSqlQuery
    {
        protected 	getOperatorInfo(DataSource ds, MessageSourceAccessor msa)
        {
          	super(ds, msa.getMessage("Querys.gapan.gapan.getOperatorInfo"));
          	
	        declareParameter(new SqlParameter(Types.VARCHAR));
        }
        
        protected	Object mapRow(ResultSet rs, int rownum)	throws	SQLException
        {
        	OperatorBean	Bean	= new OperatorBean();
        	
        	Bean.setOWNER_NAME(rs.getString("OWNER_NAME"));
  			Bean.setOWNER_IMG(rs.getString("OWNER_IMG"));
			Bean.setOWNER_SSN(rs.getString("OWNER_SSN"));
			Bean.setOWNER_GENDER(rs.getString("OWNER_GENDER"));
			Bean.setOWNER_AGE(rs.getString("OWNER_AGE"));
			Bean.setOWNER_TEL(rs.getString("OWNER_TEL"));
			Bean.setOWNER_HP(rs.getString("OWNER_HP"));
			Bean.setOWNER_POST(rs.getString("OWNER_POST"));
			Bean.setOWNER_ADDR1(rs.getString("OWNER_ADDR1"));
			Bean.setOWNER_ADDR2(rs.getString("OWNER_ADDR2"));
			Bean.setOWNER_TOPOST(rs.getString("OWNER_TOPOST"));
			Bean.setOWNER_TOADDR1(rs.getString("OWNER_TOADDR1"));
			Bean.setOWNER_TOADDR2(rs.getString("OWNER_TOADDR2"));
			Bean.setRT_SEL(rs.getString("RT_SEL"));
			Bean.setLC_SEL(rs.getString("LC_SEL"));
			Bean.setESTATE_MOVE(rs.getString("ESTATE_MOVE"));
			Bean.setESTATE_REAL(rs.getString("ESTATE_REAL"));
			
        	return	Bean;
        }
    }
    
    //직계가족 정보
    protected	class	getFamilyInfo	extends	MappingSqlQuery
    {
        protected 	getFamilyInfo(DataSource ds, MessageSourceAccessor msa)
        {
          	super(ds, msa.getMessage("Querys.gapan.gapan.getFamilyInfo"));
          	
	        declareParameter(new SqlParameter(Types.VARCHAR));
        }
        
        protected	Object mapRow(ResultSet rs, int rownum)	throws	SQLException
        {
        	FamilyBean	Bean	= new FamilyBean();
        	
        	Bean.setPARTN_NAME(rs.getString("PARTN_NAME"));
  			Bean.setPT_SEL(rs.getString("PT_SEL"));
			Bean.setPARTN_IMG(rs.getString("PARTN_IMG"));
			Bean.setPARTN_SSN(rs.getString("PARTN_SSN"));
			Bean.setPARTN_GENDER(rs.getString("PARTN_GENDER"));
			Bean.setPARTN_AGE(rs.getString("PARTN_AGE"));
			Bean.setPARTN_TEL(rs.getString("PARTN_TEL"));
			Bean.setPARTN_HP(rs.getString("PARTN_HP"));
			Bean.setPARTN_POST(rs.getString("PARTN_POST"));
			Bean.setPARTN_ADDR1(rs.getString("PARTN_ADDR1"));
			Bean.setPARTN_ADDR2(rs.getString("PARTN_ADDR2"));
			Bean.setPARTN_TOPOST(rs.getString("PARTN_TOPOST"));
			Bean.setPARTN_TOADDR1(rs.getString("PARTN_TOADDR1"));
			Bean.setPARTN_TOADDR2(rs.getString("PARTN_TOADDR2"));
			
        	return	Bean;
        }
    }
    
    //시설 정보
    protected	class	getBloomInfo	extends	MappingSqlQuery
    {
        protected 	getBloomInfo(DataSource ds, MessageSourceAccessor msa)
        {
          	super(ds, msa.getMessage("Querys.gapan.gapan.getBloomInfo"));
          	
	        declareParameter(new SqlParameter(Types.VARCHAR));
        }
        
        protected	Object mapRow(ResultSet rs, int rownum)	throws	SQLException
        {
        	BloomBean	Bean	= new BloomBean();
        	
        	Bean.setWITH_ADDR(rs.getString("WITH_ADDR"));
  			Bean.setWITH_INFO(rs.getString("WITH_INFO"));
			Bean.setAR_SEL(rs.getString("AR_SEL"));
			Bean.setUC_SEL(rs.getString("UC_SEL"));
			Bean.setFOUND_DATE(rs.getString("FOUND_DATE"));
			Bean.setSHOP_IMG(rs.getString("SHOP_IMG"));
			Bean.setDP_TXT(rs.getString("DP_TXT"));
			Bean.setFT_TYP(rs.getString("FT_TYP"));
			Bean.setFT_SEL(rs.getString("FT_SEL"));
			Bean.setFACIL_L(rs.getString("FACIL_L"));
			Bean.setFACIL_W(rs.getString("FACIL_W"));
			Bean.setFACIL_H(rs.getString("FACIL_H"));
			Bean.setPLACE_L(rs.getString("PLACE_L"));
			Bean.setPLACE_H(rs.getString("PLACE_H"));
			Bean.setPLACE_A(rs.getString("PLACE_A"));
			Bean.setSPECIAL_ST(rs.getString("SPECIAL_ST"));
			Bean.setTAXTATION_AT(rs.getString("TAXTATION_AT"));
			
        	return	Bean;
        }
    }
    
    //운영  정보
    protected	class	getOperInfo	extends	MappingSqlQuery
    {
        protected 	getOperInfo(DataSource ds, MessageSourceAccessor msa)
        {
          	super(ds, msa.getMessage("Querys.gapan.gapan.getOperInfo"));
          	
	        declareParameter(new SqlParameter(Types.VARCHAR));
        }
        
        protected	Object mapRow(ResultSet rs, int rownum)	throws	SQLException
        {
        	OperBean	Bean	= new OperBean();
        	
        	Bean.setSG_TYP(rs.getString("SG_TYP"));
  			Bean.setSG_SEL(rs.getString("SG_SEL"));
			Bean.setMEM_NUM(rs.getString("MEM_NUM"));
			Bean.setOPEN_TIME(rs.getString("OPEN_TIME"));
			Bean.setCLOSE_TIME(rs.getString("CLOSE_TIME"));
			Bean.setPERMIT_DATE(rs.getString("PERMIT_DATE"));
			Bean.setDAY_SALES(rs.getString("DAY_SALES"));
			Bean.setUN_TYP(rs.getString("UN_TYP"));
			Bean.setUN_TXT(rs.getString("UN_TXT"));
			Bean.setNOTES(rs.getString("NOTES"));
			
        	return	Bean;
        }
    }
    
    protected	class	Gapan_Base_Register	extends	SqlUpdate
    {
    	protected	Gapan_Base_Register(DataSource ds, MessageSourceAccessor msa)
        {
            super(ds, msa.getMessage("Querys.gapan.gapan.Gapan_Base_Register"));
            
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
        }
    }
    
    protected	class	Gapan_Register	extends	SqlUpdate
    {
    	protected	Gapan_Register(DataSource ds, MessageSourceAccessor msa)
        {
            super(ds, msa.getMessage("Querys.jumyong.minwon.Minwon_Register"));
            
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
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
    
    
    protected	class	Gapan_Head_Register	extends	SqlUpdate
    {
    	protected	Gapan_Head_Register(DataSource ds, MessageSourceAccessor msa)
        {
            super(ds, msa.getMessage("Querys.gapan.gapan.Gapan_Head_Register"));
            
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
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
    
    protected	class	Gapan_Info_Register	extends	SqlUpdate
    {
    	protected	Gapan_Info_Register(DataSource ds, MessageSourceAccessor msa)
        {
            super(ds, msa.getMessage("Querys.gapan.gapan.Gapan_Info_Register"));
            
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            
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
    
    //	관련 점용지 조회
    protected	class	Search_Jumji	extends	MappingSqlQuery
    {
        protected 	Search_Jumji(DataSource ds, MessageSourceAccessor msa)
        {
          	super(ds, msa.getMessage("Querys.gapan.gapan.Search_Jumji"));
          	
	        declareParameter(new SqlParameter(Types.VARCHAR));
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
        	JumjiSearchBean	Bean	= new JumjiSearchBean();

			Bean.setGAPAN_NO(rs.getString("GAPAN_NO"));
			Bean.setOWNER_NAME(rs.getString("OWNER_NAME"));
			Bean.setSSN1(rs.getString("OWNER_SSN1"));
			Bean.setSSN2(rs.getString("OWNER_SSN2"));
			Bean.setSIDO(rs.getString("SIDO"));
			
			Bean.setSIGUNGU(rs.getString("SIGUNGU"));
			Bean.setBJ_CD(rs.getString("BJ_CD"));
			Bean.setSPC_CD(rs.getString("SPC_CD"));
			Bean.setBONBUN(rs.getString("BONBUN"));
			Bean.setBUBUN(rs.getString("BUBUN"));
			
			Bean.setTYPE(rs.getString("TYPE"));
			Bean.setPURPOSE_CD(rs.getString("PURPOSE_CD"));
			Bean.setRN(rs.getString("RN"));
			
        	return	Bean;
        }
    }
}