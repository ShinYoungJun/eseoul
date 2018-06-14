


package main.java.periodical.dao;



import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.List;
import javax.sql.DataSource;
import main.java.common.dao.RoadsJdbcDaoSupport;
import main.java.common.util.*;
//import gov.mogaha.rnic.common.model.RnicBoardBean;


import main.java.jumyong.jumyong.model.ProductBean;
import main.java.jumyong.jumyong.model.jumyongBean;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.MappingSqlQuery;
import org.springframework.jdbc.object.SqlUpdate;
import org.springframework.jdbc.core.support.SqlLobValue;
import org.springframework.jdbc.support.lob.OracleLobHandler;

public class ImpositionDao extends RoadsJdbcDaoSupport implements IImpositionDao
{ 

	private OracleLobHandler oracleLobHandler = null; 
	
	private PeriodicalBoardListQuery objPeriodicalQuery=null;
	/*
	private RetrieveProductListQuery objProductListQuery=null;	
	private ExaminListQuery objExaminListQuery = null;
	*/
    
    
   
    protected void initDao()  throws Exception {
		super.initDao();
		oracleLobHandler = new OracleLobHandler();
		
		objPeriodicalQuery = new PeriodicalBoardListQuery(getDataSource());
		
		/*
		objRetrieveQuery = new RetrieveBoardListQuery(getDataSource());
		objProductListQuery = new RetrieveProductListQuery(getDataSource());
		objExaminListQuery = new ExaminListQuery(getDataSource());
		*/
		
   	}	
    
    public List periodicalBoardList()
	{
    	
    	//Object[] values = {strAdmin_no, strReq_nm, strReq_no, strReq_date1, strReq_date2, new Integer(1), new Integer(10)};
    	
    	return objPeriodicalQuery.execute();    	
	}
    
    
    protected class PeriodicalBoardListQuery extends MappingSqlQuery {
        protected PeriodicalBoardListQuery(DataSource ds) {
      	super(ds, getMessageSourceAccessor().getMessage("Querys.periodical.periodicalList"));
      	      
        }
          protected Object mapRow(ResultSet rs, int rownum) throws SQLException {
            jumyongBean objJumyongBean = new jumyongBean();
                        
            objJumyongBean.setADMIN_NO(rs.getString("ADMIN_NO"));
            objJumyongBean.setTAX_DATE(rs.getString("TAX_DATE"));
            objJumyongBean.setTYPE(rs.getString("TYPE"));
            objJumyongBean.setNAME(rs.getString("NAME"));
            objJumyongBean.setBJ_CD(rs.getString("BJ_CD"));
            objJumyongBean.setSAN_CK(rs.getString("SAN_CK"));
            objJumyongBean.setBONBUN(rs.getString("BONBUN"));
            objJumyongBean.setBUBUN(rs.getString("BUBUN"));
            //objJumyongBean.setPURPOSE(rs.getString("PURPOSE"));
            objJumyongBean.setSUM_LASTYEAR(rs.getString("SUM_LASTYEAR"));
            objJumyongBean.setSUM_YEAR(rs.getString("SUM_YEAR"));
            objJumyongBean.setSUM_ADJUST(rs.getString("SUM_ADJUST"));
            
            return objJumyongBean;
            
          }
      } 
   	
   	
   	
    
    
    /*
    public List retrieveBoardList()
	{
    	
    	//Object[] values = {strAdmin_no, strReq_nm, strReq_no, strReq_date1, strReq_date2, new Integer(1), new Integer(10)};
    	
    	
    	
    	return objRetrieveQuery.execute();    	
	}
    
    public List retrieveProductList(String adminNo)
    {
    	Object[] values = {adminNo};
    	return objProductListQuery.execute(values);
    }
    
    public List examineList(String adminNo)
    {
    	Object[] values = {adminNo};
    	try
    	{
    	List examineList = objExaminListQuery.execute(values);
    	}catch(Exception err)
    	{
    		System.out.println(err.toString());
    	}
    	return objExaminListQuery.execute(values);
    }
    
    
  
    protected class PeriodicalBoardListQuery extends MappingSqlQuery {
        protected RetrieveBoardListQuery(DataSource ds) {
      	super(ds, getMessageSourceAccessor().getMessage("Querys.jumreg.ocupancyList"));
      	      
        }
          protected Object mapRow(ResultSet rs, int rownum) throws SQLException {
            jumyongBean objJumyongBean = new jumyongBean();
            System.out.println("1111");
            
            objJumyongBean.setADMIN_NO(rs.getString("ADMIN_NO"));
            objJumyongBean.setTYPE(rs.getString("TYPE"));
            objJumyongBean.setSECTION(rs.getString("SECTION"));
            objJumyongBean.setNAME(rs.getString("NAME"));
            objJumyongBean.setBJ_CD(rs.getString("BJ_CD"));
            
            return objJumyongBean;
            
          }
      } 
    
   
    protected class RetrieveProductListQuery extends MappingSqlQuery {
        protected RetrieveProductListQuery(DataSource ds) 
        {
        	super(ds, getMessageSourceAccessor().getMessage("Querys.jumyong.productInfo"));
        	declareParameter(new SqlParameter(Types.VARCHAR));
      	}
		  protected Object mapRow(ResultSet rs, int rownum) throws SQLException 
		  {
			  ProductBean objProductBean = new ProductBean();
			  
			  
			 
			  objProductBean.setYEAR(rs.getString("YEAR"));         	  
			  objProductBean.setPRICE(rs.getString("PRICE"));
			  objProductBean.setSIZE_AFTER(rs.getInt("SIZE_BEFORE"));
			  objProductBean.setRATE(rs.getInt("RATE"));
			  objProductBean.setFROMDATE(rs.getString("FROMDATE"));
			  objProductBean.setTODATE(rs.getString("TODATE"));
			  objProductBean.setSUM_LASTYEAR(rs.getInt("SUM_LASTYEAR"));
			  objProductBean.setSUM_YEAR(rs.getInt("SUM_YEAR"));
			  objProductBean.setSUM_ADJUST(rs.getInt("SUM_ADJUST"));
			 
		 	  return objProductBean;
		  }
      } 
    
    
    
    protected class ExaminListQuery extends MappingSqlQuery {
    	
        protected ExaminListQuery(DataSource ds) 
        {        	
        	super(ds, getMessageSourceAccessor().getMessage("Querys.jumyong.examinList"));
        	declareParameter(new SqlParameter(Types.VARCHAR));
      	}
        
        
		  protected Object mapRow(ResultSet rs, int rownum) throws SQLException 
		  {
			  ExamineBean objExamineBean = new ExamineBean();
			  
			  objExamineBean.setCHECK_RESULT(rs.getString("CHECK_RESULT"));
			  objExamineBean.setCHECK_DATE(rs.getString("CHECK_DATE"));
			  objExamineBean.setMANAGER(rs.getString("MANAGER"));
			  objExamineBean.setOPINION(rs.getString("OPINION"));
			  
			  objExamineBean.setSEQ_KEY(rs.getString("SEQ_KEY"));
			  objExamineBean.setRESULT(rs.getString("RESULT"));
			  objExamineBean.setNOTES(rs.getString("NOTES"));
			  objExamineBean.setORGANIZATION(rs.getString("ORGANIZATION"));
			  objExamineBean.setTEL(rs.getString("TEL"));
			  objExamineBean.setCONF_DATE(rs.getString("CONF_DATE"));
			  objExamineBean.setCONF_COMMENT(rs.getString("CONF_COMMENT"));
			  
		 	  return objExamineBean;
		  }
      } 

   */
}