


package main.java.junggi.imposition.dao;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;
import main.java.common.dao.RoadsJdbcDaoSupport;
import main.java.common.util.*;
//import gov.mogaha.rnic.common.model.RnicBoardBean;




import main.java.jumyong.jumyong.model.jumyongBean;
import main.java.junggi.imposition.model.impositionBean;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.MappingSqlQuery;
import org.springframework.jdbc.object.SqlUpdate;
import org.springframework.jdbc.core.support.SqlLobValue;
import org.springframework.jdbc.support.lob.OracleLobHandler;

public class ImpositionDao extends RoadsJdbcDaoSupport implements IImpositionDao
{ 

	private OracleLobHandler oracleLobHandler = null; 
	
	
	//정기분 조회 리스트
	private JunggiSearchListQuery objPeriodicalQuery=null;
    // 부과정보 리스트	
	private ImpositionInfoListQuery objImpositionInfoListQuery = null;
	// 부과정보 - 년도별
	private ImpositionInfoQuery objImpositionInfoQuery = null;
	
	/*
	private RetrieveProductListQuery objProductListQuery=null;	
	private ExaminListQuery objExaminListQuery = null;
	*/
   
    protected void initDao()  throws Exception {
		super.initDao();
		oracleLobHandler = new OracleLobHandler();
		
		//부과정보
		//정기분 조회 리스트
		objPeriodicalQuery = new JunggiSearchListQuery(getDataSource());
		// 부과정보 리스트		
		objImpositionInfoListQuery = new ImpositionInfoListQuery(getDataSource());
		// 부과정보 - 년도별
		objImpositionInfoQuery = new ImpositionInfoQuery(getDataSource());
		/*
		objRetrieveQuery = new RetrieveBoardListQuery(getDataSource());
		objProductListQuery = new RetrieveProductListQuery(getDataSource());
		objExaminListQuery = new ExaminListQuery(getDataSource());
		*/
		
   	}	
    
    //method/////////////////////////////////////////////////////////////////////////////////////////////////////////////
	//정기분 조회 리스트    
    public List junggiSearchList(String year,String type,String check_yn,String tax_yn,String tax_set,String purpose_cd,String numVal
    		,String name,String bj_cd,String hj_cd,String bonbun,String bubun,int currentPage,int countPerPage)
	{ 
    	if(year.equals("0") || year.equals("")) year = "%";    	
    	if(type.equals("0") || type.equals("")) type = "%";    	
    	if(tax_yn.equals("")) tax_yn = "%";    	
    	if(tax_set.equals("")) tax_set = "%";    	
    	if(purpose_cd.equals("000") || purpose_cd.equals("")) purpose_cd = "%";
    	    	
    	if(check_yn.equals("")) check_yn="%";
    	if(bj_cd.equals("") || bj_cd.equals("00000")) bj_cd="%";
    	if(hj_cd.equals("") || hj_cd.equals("00000")) hj_cd="%";
    	if(bonbun.equals("")) bonbun="%";
    	if(bubun.equals("")) bubun="%";

    	if(numVal.equals("")) numVal="%";
    	else numVal = numVal+"%";
    	
    	if(name.equals("")) name="%";
    	else name = name+"%";
    	
    	String tDate = year+"0101";
    	
    	Object[] values = { tDate,tDate,year, type, check_yn, tax_yn, tax_set, purpose_cd, numVal,numVal, name, bj_cd, hj_cd, bonbun, bubun
    			,new Integer(currentPage),new Integer(countPerPage),new Integer(countPerPage)};
    	
    	return objPeriodicalQuery.execute(values);    	
	}
    
//  정기분 조회 리스트   카운트
    public int getJunggiSearchListCount(String year,String type,String check_yn,String tax_yn,String tax_set,String purpose_cd,String numVal
    		,String name,String bj_cd,String hj_cd,String bonbun,String bubun)
	{	
    	if(year.equals("0") || year.equals("")) year = "%";    	
    	if(type.equals("0") || type.equals("")) type = "%";    	
    	if(tax_yn.equals("")) tax_yn = "%";    	
    	if(tax_set.equals("")) tax_set = "%";    	
    	if(purpose_cd.equals("000") || purpose_cd.equals("")) purpose_cd = "%";
    	    	
    	if(check_yn.equals("")) check_yn="%";
    	if(bj_cd.equals("") || bj_cd.equals("00000")) bj_cd="%";
    	if(hj_cd.equals("") || hj_cd.equals("00000")) hj_cd="%";
    	if(bonbun.equals("")) bonbun="%";
    	if(bubun.equals("")) bubun="%";

    	if(numVal.equals("")) numVal="%";
    	else numVal = numVal+"%";
    	
    	if(name.equals("")) name="%";
    	else name = name+"%";
    	
    	String tDate = year+"0101";
    	
    	Object[] values = { tDate,tDate,year, type, check_yn, tax_yn, tax_set, purpose_cd, numVal,numVal, name, bj_cd, hj_cd, bonbun, bubun};
    	
    	String sql = getMessageSourceAccessor().getMessage("Querys.periodical.periodicalListCount");
    	int returnNum = getJdbcTemplate().queryForInt(sql,values);
    	return returnNum;
	}    
    
//  부과정보 리스트 
    public List impositionList(String adminNo,int currentPage,int countPerPage)
	{	
    	Object[] values = { adminNo,new Integer(currentPage),new Integer(countPerPage),new Integer(countPerPage)};
    	return objImpositionInfoListQuery.execute(values);    	
	}
    
    
//  부과정보 리스트  카운트
    public int getProductListCount(String adminNo)
	{	
    	Object[] values = {adminNo};
    	String sql = getMessageSourceAccessor().getMessage("Querys.periodical.impositionInfoListCount");
    	int returnNum = getJdbcTemplate().queryForInt(sql,values);
    	return returnNum;
	}
    
//  부과정보 - 년도별 
    public impositionBean impositionInfo(String adminNo,String strYear)
	{	
    	Object[] values = { adminNo,strYear};
    	impositionBean ib = null;
    	
    	ib = (impositionBean) objImpositionInfoQuery.findObject(values);
    	
    	return ib;    	
	}

//  작년도 점용료 가져오기
    public Map getSum_LastYear(String adminNo,String strYear)
	{	
    	Object[] values = {adminNo,strYear};
    	String sql = getMessageSourceAccessor().getMessage("Querys.periodical.sum_lastyear");
    	Map returnNum = getJdbcTemplate().queryForMap(sql,values);
    	
    	System.out.println("       "+adminNo+strYear+returnNum);
    	
		return returnNum;    	
	}
    

//  부과정보 리스트  카운트
    public int getProductSeq(String adminNo,String strYear)
	{	
    	Object[] values = {adminNo,strYear};
    	String sql = getMessageSourceAccessor().getMessage("Querys.periodical.getProductSeq");
    	int returnNum = getJdbcTemplate().queryForInt(sql,values);
    	return returnNum;
	}    
    
//  부과정보 가장 나중 입력된 YEAR
    public String getLastYear(String adminNo)
	{	
    	Object[] values = {adminNo};
    	String sql = getMessageSourceAccessor().getMessage("Querys.periodical.getLastYear");
    	Map returnYear = getJdbcTemplate().queryForMap(sql,values);
    	
		return returnYear.get("LASTYEAR").toString();    	
	}
    
//  부과 미부과 여부
    public String getTaxYn(String seq)
	{	
    	
    	Object[] values = {seq};
    	String sql = getMessageSourceAccessor().getMessage("Querys.periodical.getTaxYn");
    	Map taxYn = getJdbcTemplate().queryForMap(sql,values);    	
		return taxYn.get("TAX_YN").toString();    	
	}    
    
    //query/////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //정기분 조회 리스트
    protected class JunggiSearchListQuery extends MappingSqlQuery {
        protected JunggiSearchListQuery(DataSource ds) {
      	super(ds, getMessageSourceAccessor().getMessage("Querys.periodical.periodicalList"));
	      	declareParameter(new SqlParameter(Types.VARCHAR));
	      	declareParameter(new SqlParameter(Types.VARCHAR));
	      	declareParameter(new SqlParameter(Types.VARCHAR));
	      	declareParameter(new SqlParameter(Types.VARCHAR));
	      	declareParameter(new SqlParameter(Types.VARCHAR));
	      	declareParameter(new SqlParameter(Types.VARCHAR));
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
	    	declareParameter(new SqlParameter(Types.INTEGER));      	      
        }
          protected Object mapRow(ResultSet rs, int rownum) throws SQLException {
            jumyongBean objJumyongBean = new jumyongBean();

            objJumyongBean.setADMIN_NO(rs.getString("ADMIN_NO"));
            objJumyongBean.setADMIN_NO2(rs.getString("ADMIN_NO2"));
            objJumyongBean.setYEAR(rs.getString("YEAR"));
            objJumyongBean.setTYPE_NAME(rs.getString("TYPE_NAME"));
            objJumyongBean.setNAME(rs.getString("NAME"));
            objJumyongBean.setBJ_NM(rs.getString("BJ_NM"));
            objJumyongBean.setBONBUN(rs.getString("BONBUN"));            
            objJumyongBean.setBUBUN(rs.getString("BUBUN"));
            objJumyongBean.setPURPOSE_CD(rs.getString("PURPOSE_CD"));
            objJumyongBean.setSUM_LASTYEAR(rs.getString("SUM_LASTYEAR"));
            objJumyongBean.setSUM_YEAR(rs.getString("SUM_YEAR"));
            objJumyongBean.setSUM_ADJUST(rs.getString("SUM_ADJUST"));
            objJumyongBean.setTAX_YN(rs.getString("TAX_YN"));
            objJumyongBean.setTSEQ(rs.getString("TSEQ"));
            objJumyongBean.setTAX_SET_NAME(rs.getString("TAX_SET_NAME"));
            objJumyongBean.setCHECK_YN(rs.getString("CHECK_YN"));
            objJumyongBean.setCHECK_NAME(rs.getString("CHECK_NAME"));
            return objJumyongBean;
            
          }
      } 
    
      // 부과정보 리스트
      protected class ImpositionInfoListQuery extends MappingSqlQuery {
          protected ImpositionInfoListQuery(DataSource ds) {
        	super(ds, getMessageSourceAccessor().getMessage("Querys.periodical.impositionInfoList"));
  	      	declareParameter(new SqlParameter(Types.VARCHAR));  
  	      	declareParameter(new SqlParameter(Types.INTEGER));
	    	declareParameter(new SqlParameter(Types.INTEGER));
	    	declareParameter(new SqlParameter(Types.INTEGER)); 
          }
            protected Object mapRow(ResultSet rs, int rownum) throws SQLException {
              impositionBean objImpositionBean = new impositionBean();
              
//T.ADMIN_NO, T.YEAR, C.AREA_AFTER, C.RATE, C.FROMDATE, C.TODATE, C.SUM_LASTYEAR
//, C.SUM_YEAR, C.SUM_ADJUST, T.TAX_YN \              
              
              objImpositionBean.setYEAR(rs.getString("YEAR"));
              objImpositionBean.setPRICE(rs.getInt("PRICE"));
              objImpositionBean.setAREA_AFTER(rs.getFloat("AREA_AFTER"));
              objImpositionBean.setRATE(rs.getFloat("RATE"));
              objImpositionBean.setFROMDATE(rs.getString("FROMDATE"));
              objImpositionBean.setTODATE(rs.getString("TODATE"));
              objImpositionBean.setSUM_LASTYEAR(rs.getInt("SUM_LASTYEAR"));
              objImpositionBean.setSUM_YEAR(rs.getInt("SUM_YEAR"));            
              objImpositionBean.setSUM_ADJUST(rs.getInt("SUM_ADJUST"));
              objImpositionBean.setFORM(rs.getString("FORM"));
              objImpositionBean.setFORM_ADJUST(rs.getString("FORM_ADJUST"));
              objImpositionBean.setINDATE(rs.getString("INDATE"));
              objImpositionBean.setOVERDATE(rs.getString("OVERDATE"));
              objImpositionBean.setTAX_DATE(rs.getString("TAX_DATE"));
              objImpositionBean.setPERIOD(rs.getInt("PERIOD"));
              objImpositionBean.setSEQ(rs.getString("CSEQ"));
              objImpositionBean.setTSEQ(rs.getString("TSEQ"));
              objImpositionBean.setTAX_YN_NAME(rs.getString("TAX_YN_NAME"));
              
              
              
              
              return objImpositionBean;
            }
        } 
    
    
//    부과정보 연도별 정보
      protected class ImpositionInfoQuery extends MappingSqlQuery {
          protected ImpositionInfoQuery(DataSource ds) {
        	super(ds, getMessageSourceAccessor().getMessage("Querys.periodical.impositionInfo"));
  	      	declareParameter(new SqlParameter(Types.VARCHAR));
  	      	declareParameter(new SqlParameter(Types.VARCHAR));
          }
            protected Object mapRow(ResultSet rs, int rownum) throws SQLException {
            	
//SELECT T.YEAR, C.PRICE, C.AREA_AFTER, C.RATE, C.FROMDATE, C.TODATE, C.SUM_LASTYEAR \
//            	, C.SUM_YEAR, C.SUM_ADJUST, C.ADJUSTMENT, C.FORM, C.FORM_ADJUST, T.INDATE, T.OVERDATE, T.TAX_DATE \            	
            	
                        	
              impositionBean objImpositionBean = new impositionBean();
                                          
              objImpositionBean.setYEAR(rs.getString("YEAR"));
              objImpositionBean.setPRICE(rs.getInt("PRICE"));
              objImpositionBean.setAREA_AFTER(rs.getFloat("AREA_AFTER"));
              objImpositionBean.setRATE(rs.getFloat("RATE"));
              objImpositionBean.setFROMDATE(rs.getString("FROMDATE"));
              objImpositionBean.setTODATE(rs.getString("TODATE"));
              objImpositionBean.setSUM_LASTYEAR(rs.getInt("SUM_LASTYEAR"));
              objImpositionBean.setSUM_YEAR(rs.getInt("SUM_YEAR"));            
              objImpositionBean.setSUM_ADJUST(rs.getInt("SUM_ADJUST"));
              objImpositionBean.setFORM(rs.getString("FORM"));
              objImpositionBean.setFORM_ADJUST(rs.getString("FORM_ADJUST"));
              objImpositionBean.setINDATE(rs.getString("INDATE"));
              objImpositionBean.setOVERDATE(rs.getString("OVERDATE"));
              objImpositionBean.setTAX_DATE(rs.getString("TAX_DATE"));
              objImpositionBean.setPERIOD(rs.getInt("PERIOD"));
              objImpositionBean.setSEQ(rs.getString("CSEQ"));
              objImpositionBean.setTSEQ(rs.getString("TSEQ"));
              objImpositionBean.setADJUSTMENT(rs.getFloat("ADJUSTMENT"));
              
              return objImpositionBean;
            }
        } 
   	
}