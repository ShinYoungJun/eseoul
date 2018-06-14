//	2009		Kim Yun Seo

package main.java.jumyong.minwon.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

import javax.sql.DataSource;

import main.java.common.dao.RoadsJdbcDaoSupport;
import main.java.jumyong.minwon.model.AppealBean;
import main.java.jumyong.minwon.model.JumjiSearchBean;
import main.java.jumyong.minwon.model.PlaceBean;

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
          	super(ds, msa.getMessage("Querys.jumyong.minwon.Search"));
          	
      		declareParameter(new SqlParameter(Types.VARCHAR));
	        declareParameter(new SqlParameter(Types.INTEGER));
	        declareParameter(new SqlParameter(Types.INTEGER));
        }
        
        protected	Object mapRow(ResultSet rs, int rownum)	throws	SQLException
        {
        	AppealBean	Bean	= new AppealBean();

        	Bean.setADMIN_NO(rs.getString("ADMIN_NO"));
        	Bean.setREQ_NO(rs.getString("REQ_NO"));
        	Bean.setREQ_NM(rs.getString("REQ_NM"));
        	Bean.setGUBUN(rs.getString("GUBUN"));
        	Bean.setNAME(rs.getString("NAME"));
        	Bean.setNOTES(rs.getString("NOTES"));
        	Bean.setREQ_CK(rs.getString("REQ_CK"));
        	Bean.setTODATE(rs.getString("TODATE"));
        	Bean.setMANAGER(rs.getString("MANAGER"));
        	Bean.setRN(rs.getString("RN"));
  			
        	return	Bean;
        }
    }
    
    protected	class	SearchAll	extends	MappingSqlQuery
    {
    	protected 	SearchAll(DataSource ds, MessageSourceAccessor msa)
        {
          	super(ds, msa.getMessage("Querys.jumyong.minwon.SelectAll"));
          	
	        declareParameter(new SqlParameter(Types.INTEGER));
	        declareParameter(new SqlParameter(Types.INTEGER));
        }
        
    	protected	Object mapRow(ResultSet rs, int rownum)	throws	SQLException
        {
        	AppealBean	Bean	= new AppealBean();

        	Bean.setADMIN_NO(rs.getString("ADMIN_NO"));
        	Bean.setREQ_NM(rs.getString("REQ_NM"));
        	Bean.setGUBUN(rs.getString("GUBUN"));
        	Bean.setNAME(rs.getString("NAME"));
        	Bean.setNOTES(rs.getString("NOTES"));
        	Bean.setREQ_DATE(rs.getString("REQ_DATE"));
        	Bean.setREQ_CK(rs.getString("REQ_CK"));
        	Bean.setTODATE(rs.getString("TODATE"));
        	Bean.setMANAGER(rs.getString("MANAGER"));
  
//        	if(Bean.getTODATE() == null	||	Bean.getTODATE().trim().equals(""))
//        		Bean.setYN("미결");
//        	else
//        		Bean.setYN("해결");
  			
        	return	Bean;
        }
    }
    
    protected	class	Admin_Base_Register	extends	SqlUpdate
    {
    	protected	Admin_Base_Register(DataSource ds, MessageSourceAccessor msa)
        {
            super(ds, msa.getMessage("Querys.jumyong.minwon.Admin_Base_Register"));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
        }
    }  
    
    
    protected	class	Minwon_Register	extends	SqlUpdate
    {
    	protected	Minwon_Register(DataSource ds, MessageSourceAccessor msa)
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
          //********** BEGIN_현진_20120215
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
          //********** END_현진_20120215
            
        }
    }
    
    
    protected	class	Appeal_Register	extends	SqlUpdate
    {
    	protected	Appeal_Register(DataSource ds, MessageSourceAccessor msa)
        {
            super(ds, msa.getMessage("Querys.jumyong.minwon.Appeal_Register"));
            
            System.out.println("Querys.jumyong.minwon.Appeal_Register");
            System.out.println("Querys.jumyong.minwon.Appeal_Register");
            System.out.println("Querys.jumyong.minwon.Appeal_Register");
            
          //********** BEGIN_현진_20120215
            /*
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));

            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));

            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));

            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            
            // 시 군 도로 빌딩 
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR)); 
 
             * */
          //********** END_현진_20120215
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));

            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));

            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));

            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));

            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));

            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));

            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));

            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));

            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));

            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));

            declareParameter(new SqlParameter(Types.VARCHAR));
          //********** BEGIN_현진_20120321
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
          //********** END_현진_20120321
          //********** BEGIN_KANG_20120417
            declareParameter(new SqlParameter(Types.VARCHAR));
          //********** END_KANG_20120417

        }
    }  
    
    
    protected	class	Place_Register	extends	SqlUpdate
    {
    	protected	Place_Register(DataSource ds, MessageSourceAccessor msa)
        {
            super(ds, msa.getMessage("Querys.jumyong.minwon.Place_Register"));
            
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));

            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            
            declareParameter(new SqlParameter(Types.VARCHAR));
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
            declareParameter(new SqlParameter(Types.FLOAT));
            
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.FLOAT));
            declareParameter(new SqlParameter(Types.VARCHAR));
            
            // #mr 점용지도로명주소추가
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));	// DUE_DATE
        }
    }
    
    
    //	관련 점용지 조회
    protected	class	Search_Jumji	extends	MappingSqlQuery
    {
        protected 	Search_Jumji(DataSource ds, MessageSourceAccessor msa)
        {
          	super(ds, msa.getMessage("Querys.jumyong.minwon.Search_Jumji"));
          	
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

			Bean.setADMIN_NO(rs.getString("ADMIN_NO"));
			Bean.setNAME(rs.getString("NAME"));
			Bean.setTYPE(rs.getString("TYPE"));
			Bean.setPURPOSE_CD(rs.getString("PURPOSE_CD"));
			Bean.setSIDO(rs.getString("SIDO"));
			Bean.setSIGUNGU(rs.getString("SIGUNGU"));
			Bean.setBJ_CD(rs.getString("BJ_CD"));
			Bean.setHJ_CD(rs.getString("HJ_CD"));
			Bean.setSPC_CD(rs.getString("SPC_CD"));
			Bean.setBONBUN(rs.getString("BONBUN"));
			Bean.setBUBUN(rs.getString("BUBUN"));
			Bean.setTONG(rs.getString("TONG"));
			Bean.setBAN(rs.getString("BAN"));
			Bean.setRN(rs.getString("RN"));
			
        	return	Bean;
        }
    }

 
    
    
    
    //	민원 정보
    protected	class	Minwon_View	extends	MappingSqlQuery
    {
        protected 	Minwon_View(DataSource ds, MessageSourceAccessor msa)
        {
          	super(ds, msa.getMessage("Querys.jumyong.minwon.Minwon_View"));
          	
	        declareParameter(new SqlParameter(Types.VARCHAR));
        }
        
        protected	Object mapRow(ResultSet rs, int rownum)	throws	SQLException
        {
        	AppealBean	Bean	= new AppealBean();

        	Bean.setADMIN_NO(rs.getString("ADMIN_NO"));
        	Bean.setREQ_NO(rs.getString("REQ_NO"));
        	Bean.setGUBUN(rs.getString("GUBUN"));
        	Bean.setREQ_DATE(rs.getString("REQ_DATE"));
        	Bean.setPREDATE(rs.getString("PREDATE"));
        	Bean.setREQ_DEP(rs.getString("REQ_DEP"));
        	Bean.setREQ_NM(rs.getString("REQ_NM"));
        	Bean.setMANAGER(rs.getString("MANAGER"));
  			Bean.setMANAGE_DEP(rs.getString("MANAGE_DEP"));
  			Bean.setNOTES(rs.getString("NOTES"));
  			Bean.setAGENT_NM(rs.getString("AGENT_NM"));
  			Bean.setAGENT_TEL(rs.getString("AGENT_TEL"));

        	return	Bean;
        }
    }
    
    protected	class	Minwon_Modify	extends	SqlUpdate
    {
    	protected	Minwon_Modify(DataSource ds, MessageSourceAccessor msa)
        {
            super(ds, msa.getMessage("Querys.jumyong.minwon.Minwon_Modify"));
            
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
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
          	super(ds, msa.getMessage("Querys.jumyong.minwon.Jumji_View"));
          	
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
			Bean.setSPC_CD(rs.getString("SPC_CD"));
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
    
    protected	class	Jumji_Modify	extends	SqlUpdate
    {
    	protected	Jumji_Modify(DataSource ds, MessageSourceAccessor msa)
        {
            super(ds, msa.getMessage("Querys.jumyong.minwon.Jumji_Modify"));
            
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
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
    
    protected	class	InsertMin	extends	SqlUpdate
    {
    	protected	InsertMin(DataSource ds, MessageSourceAccessor msa)
        {
            super(ds, msa.getMessage("Querys.jumyong.minwon.InsertMin"));
            
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
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
    
    protected	class	UpdateJumin	extends	SqlUpdate 
    {
    	protected	UpdateJumin(DataSource ds, MessageSourceAccessor msa)
        {
            super(ds, msa.getMessage("Querys.jumyong.minwon.UpdateJumin"));
            
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
    protected	class	TotalWith_Register	extends	SqlUpdate
    {
    	protected	TotalWith_Register(DataSource ds, MessageSourceAccessor msa)
        {
            super(ds, msa.getMessage("Querys.jumyong.minwon.TotalWith_Register"));
            
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            

        }
    }
    
	//공시지가 적용지번 삭제
    protected	class	DeletePlaceWithAddr	extends	SqlUpdate
    {
    	protected	DeletePlaceWithAddr(DataSource ds, MessageSourceAccessor msa)
        {
            super(ds, msa.getMessage("Querys.jumyong.minwon.DeletePlaceWithAddr"));
            
            declareParameter(new SqlParameter(Types.VARCHAR));

        }
    }
    
    
    //	공시지가 적용지번 추가
    protected	class	InsertPlaceWithAddr	extends	SqlUpdate
    {
    	protected	InsertPlaceWithAddr(DataSource ds, MessageSourceAccessor msa)
        {
            super(ds, msa.getMessage("Querys.jumyong.minwon.InsertPlaceWithAddr"));
            
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
        }
    }
    
}
