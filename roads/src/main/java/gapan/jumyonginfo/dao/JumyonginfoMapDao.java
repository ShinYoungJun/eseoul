//	2009		Kim Yun Seo

package main.java.gapan.jumyonginfo.dao;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

import javax.sql.DataSource;

import main.java.common.dao.RoadsJdbcDaoSupport;
import main.java.facility.minwon.model.DepthBean;
import main.java.gapan.jumyonginfo.model.GapanCodeBean;
import main.java.gapan.jumyonginfo.model.GapanInfoBean;
import main.java.gapan.jumyonginfo.model.GapanHeadBean;
import main.java.gapan.jumyonginfo.model.MinwonBean;
import main.java.jumyong.oldminwon.model.Apjy01mr1Bean;

import org.springframework.context.support.MessageSourceAccessor;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.MappingSqlQuery;
import org.springframework.jdbc.object.SqlUpdate;


public class JumyonginfoMapDao extends RoadsJdbcDaoSupport
{
	
    //	민원 정보
    protected	class	Minwon_View	extends	MappingSqlQuery
    {
        protected 	Minwon_View(DataSource ds, MessageSourceAccessor msa)
        {
          	super(ds, msa.getMessage("Querys.gapan.jumyonginfo.Minwon_View"));
          	
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
			Bean.setSI(Null2Space(rs.getString("SI")));
			Bean.setGUN(Null2Space(rs.getString("GUN")));
			Bean.setDORO_NM(Null2Space(rs.getString("DORO_NM")));
			Bean.setBD_BON(Null2Space(rs.getString("BD_BON")));
			Bean.setBD_BU(Null2Space(rs.getString("BD_BU")));
			Bean.setBD_NM(Null2Space(rs.getString("BD_NM")));
			Bean.setBD_DET_NM(Null2Space(rs.getString("BD_DET_NM")));
			
			
			Bean.setTOSI(Null2Space(rs.getString("TOSI")));
			Bean.setTOGUN(Null2Space(rs.getString("TOGUN")));
			Bean.setTODORO_NM(Null2Space(rs.getString("TODORO_NM")));
			Bean.setTOBD_BON(Null2Space(rs.getString("TOBD_BON")));
			Bean.setTOBD_BU(Null2Space(rs.getString("TOBD_BU")));
			Bean.setTOBD_NM(Null2Space(rs.getString("TOBD_NM")));
			Bean.setTOBD_DET_NM(Null2Space(rs.getString("TOBD_DET_NM")));
			
			Bean.setRN(Null2Space(rs.getString("rn")));
			
        	return	Bean;
        }
    }
    
    
    //	민원 정보 1건 자세히  보기
    protected	class	Minwon_View_Search	extends	MappingSqlQuery
    {
        protected 	Minwon_View_Search(DataSource ds, MessageSourceAccessor msa)
        {
          	super(ds, msa.getMessage("Querys.gapan.jumyonginfo.Minwon_View_Search"));
          	
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
    
    //	민원추가
    protected	class	Minwon_Register	extends	SqlUpdate
    {
    	protected	Minwon_Register(DataSource ds, MessageSourceAccessor msa)
        {
            super(ds, msa.getMessage("Querys.gapan.jumyonginfo.Minwon_Register"));
            
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
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
    
    //	민원 수정
    protected	class	Minwon_Modify	extends	SqlUpdate
    {
    	protected	Minwon_Modify(DataSource ds, MessageSourceAccessor msa)
        {
            super(ds, msa.getMessage("Querys.gapan.jumyonginfo.Minwon_Modify"));
            
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));

            declareParameter(new SqlParameter(Types.VARCHAR));
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
    
    protected	class	Up_date_modify	extends	SqlUpdate
    {
    	protected	Up_date_modify(DataSource ds, MessageSourceAccessor msa)
        {
            super(ds, msa.getMessage("Querys.gapan.jumyonginfo.Up_date_modify"));
            
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
        }
    }
    
    //민원 수정
    protected	class	Unyong_Gapan_Head_Modify	extends	SqlUpdate
    {
    	protected	Unyong_Gapan_Head_Modify(DataSource ds, MessageSourceAccessor msa)
        {
            super(ds, msa.getMessage("Querys.gapan.jumyonginfo.Unyong_Gapan_Head_Modify"));
            
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));

            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));

            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));

            //********** BEGIN_현진_20120330
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            //********** END_현진_20120330

            
        }
    }
    
    
    //	점용인 정보
    protected	class	Jumin_View	extends	MappingSqlQuery
    {
        protected 	Jumin_View(DataSource ds, MessageSourceAccessor msa)
        {
          	super(ds, msa.getMessage("Querys.gapan.jumyonginfo.Jumin_View"));
          	
	        declareParameter(new SqlParameter(Types.VARCHAR));
        }
        
        protected	Object mapRow(ResultSet rs, int rownum)	throws	SQLException
        {
        	GapanHeadBean	Bean	= new GapanHeadBean();
        	
        	Bean.setGAPAN_NO(rs.getString("GAPAN_NO"));	 
        	Bean.setGP_TYP(rs.getString("GP_TYP"));
        	Bean.setOWNER_NAME(rs.getString("OWNER_NAME"));
        	Bean.setOWNER_IDCHK(rs.getString("OWNER_IDCHK"));
        	Bean.setOWNER_SSN(rs.getString("OWNER_SSN"));
        	Bean.setOWNER_GENDER(rs.getString("OWNER_GENDER"));
        	Bean.setOWNER_AGE(rs.getString("OWNER_AGE"));
        	Bean.setOWNER_POST(rs.getString("OWNER_POST"));
        	Bean.setOWNER_ADDR1(rs.getString("OWNER_ADDR1"));
        	Bean.setOWNER_SAN(rs.getString("OWNER_SAN"));
        	Bean.setOWNER_JIBUN(rs.getString("OWNER_JIBUN"));
        	Bean.setOWNER_ADDR2(rs.getString("OWNER_ADDR2"));
        	Bean.setOWNER_SAME(rs.getString("OWNER_SAME"));
        	Bean.setOWNER_TOPOST(rs.getString("OWNER_TOPOST"));
        	Bean.setOWNER_TOADDR1(rs.getString("OWNER_TOADDR1"));
        	Bean.setOWNER_TOSAN(rs.getString("OWNER_TOSAN"));
        	Bean.setOWNER_TOJIBUN(rs.getString("OWNER_TOJIBUN"));
        	Bean.setOWNER_TOADDR2(rs.getString("OWNER_TOADDR2"));
        	Bean.setOWNER_TEL(rs.getString("OWNER_TEL"));
        	Bean.setOWNER_HP(rs.getString("OWNER_HP"));
        	Bean.setOWNER_IMG_NAME(rs.getString("OWNER_IMG"));
        	Bean.setRT_SEL(rs.getString("RT_SEL"));
        	Bean.setRT_TXT(rs.getString("RT_TXT"));
        	Bean.setLC_SEL(rs.getString("LC_SEL"));
        	Bean.setLC_TXT(rs.getString("LC_TXT"));
        	Bean.setESTATE_MOVE(rs.getString("ESTATE_MOVE"));
        	Bean.setESTATE_REAL(rs.getString("ESTATE_REAL"));
        	Bean.setPARTN_NAME(rs.getString("PARTN_NAME"));
        	Bean.setPT_SEL(rs.getString("PT_SEL"));
        	Bean.setPARTN_SSN(rs.getString("PARTN_SSN"));
        	Bean.setPARTN_GENDER(rs.getString("PARTN_GENDER"));
        	Bean.setPARTN_AGE(rs.getString("PARTN_AGE"));
        	Bean.setPARTN_OSAM(rs.getString("PARTN_OSAM"));
        	Bean.setPARTN_POST(rs.getString("PARTN_POST"));
        	Bean.setPARTN_ADDR1(rs.getString("PARTN_ADDR1"));
        	Bean.setPARTN_SAN(rs.getString("PARTN_SAN"));
        	Bean.setPARTN_JIBUN(rs.getString("PARTN_JIBUN"));
        	Bean.setPARTN_ADDR2(rs.getString("PARTN_ADDR2"));
        	Bean.setPARTN_SAME(rs.getString("PARTN_SAME"));
        	Bean.setPARTN_TOPOST(rs.getString("PARTN_TOPOST"));
        	Bean.setPARTN_TOADDR1(rs.getString("PARTN_TOADDR1"));
        	Bean.setPARTN_TOSAN(rs.getString("PARTN_TOSAN"));
        	Bean.setPARTN_TOJIBUN(rs.getString("PARTN_TOJIBUN"));
        	Bean.setPARTN_TOADDR2(rs.getString("PARTN_TOADDR2"));
        	Bean.setPARTN_TEL(rs.getString("PARTN_TEL"));
        	Bean.setPARTN_HP(rs.getString("PARTN_HP"));
        	Bean.setPARTN_IMG_NAME(rs.getString("PARTN_IMG"));
        	Bean.setADDR_CHECK1(rs.getString("ADDR_CHECK1"));
        	Bean.setADDR_CHECK2(rs.getString("ADDR_CHECK2"));
        	Bean.setTP_TYP_NM(rs.getString("TP_TYP_NM"));
        	Bean.setRT_SEL_NM(rs.getString("RT_SEL_NM"));
        	Bean.setLC_SEL_NM(rs.getString("LC_SEL_NM"));
        	Bean.setPT_SEL_NM(rs.getString("PT_SEL_NM"));
        	Bean.setNOTE(rs.getString("NOTE"));
        	
        	Bean.setSI(rs.getString("SI"));
        	Bean.setGUN(rs.getString("GUN"));
        	Bean.setDORO_NM(rs.getString("DORO_NM"));
        	Bean.setBD_BON(rs.getString("BD_BON"));
        	Bean.setBD_BU(rs.getString("BD_BU"));
        	Bean.setBD_NM(rs.getString("BD_NM"));
        	Bean.setBD_DET_NM(rs.getString("BD_DET_NM"));
        	
        	Bean.setTOSI(rs.getString("TSI"));
        	Bean.setTOGUN(rs.getString("TGUN"));
        	Bean.setTODORO_NM(rs.getString("TDORO_NM"));
        	Bean.setTOBD_BON(rs.getString("TBD_BON"));
        	Bean.setTOBD_BU(rs.getString("TBD_BU"));
        	Bean.setTOBD_NM(rs.getString("TBD_NM"));
        	Bean.setTOBD_DET_NM(rs.getString("TBD_DET_NM"));
        	
        	Bean.setPSI(rs.getString("PSI"));
        	Bean.setPGUN(rs.getString("PGUN"));
        	Bean.setP_DORO_NM(rs.getString("P_DORO_NM"));
        	Bean.setP_BD_BON(rs.getString("P_BD_BON"));
        	Bean.setP_BD_BU(rs.getString("P_BD_BU"));
        	Bean.setP_BD_NM(rs.getString("P_BD_NM"));
        	Bean.setP_BD_DET_NM(rs.getString("P_BD_DET_NM"));
        	
        	Bean.setPTSI(rs.getString("PTSI"));
        	Bean.setPTGUN(rs.getString("PTGUN"));
        	Bean.setPTDORO_NM(rs.getString("PTDORO_NM"));
        	Bean.setPTBD_BON(rs.getString("PTBD_BON"));
        	Bean.setPTBD_BU(rs.getString("PTBD_BU"));
        	Bean.setPTBD_NM(rs.getString("PTBD_NM"));
        	Bean.setPTBD_DET_NM(rs.getString("PTBD_DET_NM"));
        	
        	//********** BEGIN_현진_20120330
        	Bean.setDONG(rs.getString("DONG"));
        	Bean.setRI(rs.getString("RI"));
        	Bean.setBON(rs.getString("BON"));
        	Bean.setBU(rs.getString("BU"));
        	Bean.setTDONG(rs.getString("TDONG"));
        	Bean.setT_RI(rs.getString("T_RI"));
        	Bean.setTBON(rs.getString("TBON"));
        	Bean.setTBU(rs.getString("TBU"));
        	//********** END_현진_20120330
        	//********** BEGIN_현진_20120402
        	Bean.setPDONG(rs.getString("PDONG"));
        	Bean.setPRI(rs.getString("PRI"));
        	Bean.setPBON(rs.getString("PBON"));
        	Bean.setPBU(rs.getString("PBU"));
        	Bean.setPTDONG(rs.getString("PTDONG"));
        	Bean.setPTRI(rs.getString("PTRI"));
        	//********** END_현진_20120402

        	
        	return	Bean;
        }
    }
    
    //	점용인 수정
    protected	class	Jumin_Gapan_Head_Modify	extends	SqlUpdate 
    {
    	protected	Jumin_Gapan_Head_Modify(DataSource ds, MessageSourceAccessor msa)
        {
            super(ds, msa.getMessage("Querys.gapan.jumyonginfo.Jumin_Gapan_Head_Modify"));
            
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));

            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));

            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));

            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            
          //********** BEGIN_현진_20120330
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));

            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
          //********** END_현진_20120330

        }
    }
    
    //	점용지 정보
    protected	class	Jumji_View	extends	MappingSqlQuery
    {
        protected 	Jumji_View(DataSource ds, MessageSourceAccessor msa)
        {
          	super(ds, msa.getMessage("Querys.gapan.jumyonginfo.Jumji_View"));
          	
          	declareParameter(new SqlParameter(Types.VARCHAR));
        }
        
        protected	Object mapRow(ResultSet rs, int rownum)	throws	SQLException
        {
        	GapanInfoBean	Bean	= new GapanInfoBean();

        	Bean.setGAPAN_NO(rs.getString("GAPAN_NO"));
			Bean.setX_COORD(rs.getString("X_COORD"));
			Bean.setY_COORD(rs.getString("Y_COORD"));
			Bean.setGP_TYP(rs.getString("GP_TYP"));
			Bean.setPURPOSE_CD(rs.getString("PURPOSE_CD"));

			Bean.setWITH_PNU(rs.getString("WITH_PNU"));
			Bean.setWITH_ADDR(rs.getString("WITH_ADDR"));
			Bean.setSHOP_IMG_NAME(rs.getString("SHOP_IMG"));
			Bean.setWITH_INFO(rs.getString("WITH_INFO"));
			Bean.setROAD_INFO(rs.getString("ROAD_INFO"));

			Bean.setAR_SEL(rs.getString("AR_SEL"));
			Bean.setAR_TXT(rs.getString("AR_TXT"));
			Bean.setFOUND_DATE(rs.getString("FOUND_DATE"));
			Bean.setUC_SEL(rs.getString("UC_SEL"));
			Bean.setUC_TXT(rs.getString("UC_TXT"));

			Bean.setFT_TYP(rs.getString("FT_TYP"));
			Bean.setFT_SEL(rs.getString("FT_SEL"));
			Bean.setFACIL_L(rs.getString("FACIL_L"));
			Bean.setFACIL_W(rs.getString("FACIL_W"));
			Bean.setFACIL_H(rs.getString("FACIL_H"));

			Bean.setPLACE_L(rs.getString("PLACE_L"));
			Bean.setPLACE_H(rs.getString("PLACE_H"));
			Bean.setPLACE_A(rs.getString("PLACE_A"));
			Bean.setDP_SEL(rs.getString("DP_SEL"));
			Bean.setDP_TXT(rs.getString("DP_TXT"));

			Bean.setSPECIAL_ST(rs.getString("SPECIAL_ST"));
			Bean.setMAINTN_OB(rs.getString("MAINTN_OB"));
			Bean.setMT_SEL(rs.getString("MT_SEL"));
			Bean.setSG_TYP(rs.getString("SG_TYP"));
			Bean.setLIQUOR_SL(rs.getString("LIQUOR_SL"));

			Bean.setLPGAS_US(rs.getString("LPGAS_US"));
			Bean.setSG_ITM(rs.getString("SG_ITM"));
			Bean.setSG_SEL(rs.getString("SG_SEL"));
			Bean.setMEM_NUM(rs.getString("MEM_NUM"));
			Bean.setOPEN_TIME(rs.getString("OPEN_TIME"));

			Bean.setCLOSE_TIME(rs.getString("CLOSE_TIME"));
			Bean.setPERMIT_DATE(rs.getString("PERMIT_DATE"));
			Bean.setDAY_SALES(rs.getString("DAY_SALES"));
			Bean.setUN_TYP(rs.getString("UN_TYP"));
			Bean.setUN_TXT(rs.getString("UN_TXT"));

			Bean.setNOTES(rs.getString("NOTES"));
			Bean.setTAXTATION_AT(rs.getString("TAXTATION_AT"));
			Bean.setTYPE(rs.getString("TYPE"));
			Bean.setSECTION(rs.getString("SECTION"));
			Bean.setOWNER_SET(rs.getString("OWNER_SET"));
			
			Bean.setTAX_SET(rs.getString("TAX_SET"));
			Bean.setMUL_FROMDATE(rs.getString("MUL_FROMDATE"));
			Bean.setMUL_TODATE(rs.getString("MUL_TODATE"));
			Bean.setAR_SEL_NM(rs.getString("AR_SEL_NM"));
			Bean.setUC_SEL_NM(rs.getString("UC_SEL_NM"));
			Bean.setFT_TYP_NM(rs.getString("FT_TYP_NM"));
			Bean.setFT_SEL_NM(rs.getString("FT_SEL_NM"));
			Bean.setDP_SEL_NM(rs.getString("DP_SEL_NM"));
			Bean.setMT_SEL_NM(rs.getString("MT_SEL_NM"));
			Bean.setSG_TYP_NM(rs.getString("SG_TYP_NM"));
			Bean.setSG_ITM_NM(rs.getString("SG_ITM_NM"));
			Bean.setSG_SEL_NM(rs.getString("SG_SEL_NM"));
			Bean.setUN_TYP_NM(rs.getString("UN_TYP_NM"));
			
			Bean.setOWNER_NAME(rs.getString("OWNER_NAME"));
			Bean.setHJ_CD(rs.getString("HJ_CD"));
			Bean.setSF_VALUE(rs.getString("SF_VALUE"));
		
			if(rs.getString("SECTION").trim().equals("1")){
				Bean.setSECTION("계속");
			}else if(rs.getString("SECTION").trim().equals("4")){
				Bean.setSECTION("폐쇄");
			}
			//********** BEGIN_KANG_20120423
			Bean.setFacility_No(rs.getString("Facility_No"));
			//********** END_KANG_20120423
			Bean.setCHANGE_YM(rs.getString("CHANGE_YM"));

			
			//********** BEGIN_DORO_NM_2014024
			Bean.setWITH_DORO_NM(rs.getString("WITH_DORO_NM"));
			Bean.setWITH_BD_BON(rs.getString("WITH_BD_BON"));
			Bean.setWITH_BD_BU(rs.getString("WITH_BD_BU"));
			//********** END_DORO_NM_2014024
			
        	return	Bean;
        }
    }
    
    //	점용지 수정
    protected	class	Jumji_Modify	extends	SqlUpdate
    {
    	protected	Jumji_Modify(DataSource ds, MessageSourceAccessor msa)
        {
            super(ds, msa.getMessage("Querys.gapan.jumyonginfo.Jumji_Modify"));
            
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
          //********** BEGIN_KANG_20120423
            declareParameter(new SqlParameter(Types.VARCHAR));
          //********** END_KANG_20120423
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            
          //********** BEGIN_DORO_NM_2014024
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
          //********** END_DORO_NM_2014024
        }
    }
    
    protected	String	Null2Space(String str)
    {
    	if(str	==	null)
    		str	= "";
    	
    	return	str;
    }
    
    protected	class	Jumji_Register	extends	SqlUpdate
    {
    	protected	Jumji_Register(DataSource ds, MessageSourceAccessor msa)
        {
            super(ds, msa.getMessage("Querys.gapan.jumyonginfo.Jumji_Register"));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));

            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
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
          	super(ds, msa.getMessage("Querys.gapan.minwon.Select_Depth"));
        }
        
        protected	Object mapRow(ResultSet rs, int rownum)	throws	SQLException
        {
        	DepthBean	Bean	= new DepthBean();
        	
        	Bean.setDEPTH(rs.getString("DEPTH"));
        	Bean.setRATE(rs.getString("RATE"));
        	
        	return	Bean;
        }
    }
    
    
    
    protected	class	GetFtSelList	extends	MappingSqlQuery
    {
    	protected 	GetFtSelList(DataSource ds, MessageSourceAccessor msa)
    	{
    		super(ds, msa.getMessage("Querys.gapan.jumyonginfo.get_ft_sel"));
    		
    		declareParameter(new SqlParameter(Types.VARCHAR));
       	}
    	
    	protected	Object mapRow(ResultSet rs, int rownum)	throws	SQLException
    	{
    		GapanCodeBean Bean = new GapanCodeBean();
    		Bean.setCODE(rs.getString("CODE"));
    		Bean.setNAME(rs.getString("NAME"));
    		Bean.setTYPE(rs.getString("TYPE"));
    		
    		
    		return	Bean;
    	}
    }
    
    protected	class	GetFtTypList	extends	MappingSqlQuery
    {
    	protected 	GetFtTypList(DataSource ds, MessageSourceAccessor msa)
    	{
    		super(ds, msa.getMessage("Querys.gapan.jumyonginfo.get_ft_typ"));
    		
    		declareParameter(new SqlParameter(Types.VARCHAR));
       	}
    	
    	protected	Object mapRow(ResultSet rs, int rownum)	throws	SQLException
    	{
    		GapanCodeBean Bean = new GapanCodeBean();
    		Bean.setCODE(rs.getString("CODE"));
    		Bean.setNAME(rs.getString("NAME"));
    		Bean.setTYPE(rs.getString("TYPE"));
    		
    		
    		return	Bean;
    	}
    }
    
}