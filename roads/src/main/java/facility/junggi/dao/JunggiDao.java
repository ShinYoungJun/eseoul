package main.java.facility.junggi.dao;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.List;
import java.util.Map;
import javax.sql.DataSource;
import main.java.common.dao.RoadsJdbcDaoSupport;
import main.java.common.util.catUtil.Util;

//import gov.mogaha.rnic.common.model.RnicBoardBean;


import main.java.facility.jumyong.model.jumyongBean;
import main.java.facility.jumyong.model.Equip_ProductBean;

import main.java.jumyong.jumyong.model.ProductBean;




import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.MappingSqlQuery;
import org.springframework.jdbc.object.SqlUpdate;



public class JunggiDao extends RoadsJdbcDaoSupport implements IJunggiDao{
	
	//점용조회 ////////////////////////////////////////////////////////////////////////////////////////	
	//	점용조회	
	private SearchListQuery objSearchListQuery = null;
//	산출 - 물건 리스트
//	산출 정보 - cal_sum_infoList
    private Cal_sumListQuery objCal_sumList = null;
//산출 정보 - calculation_list
    private CalculationListQuery objCalculationListQuery = null;    
// 	calculation_info
    private CalculationInfoQuery objCalculationInfoQuery = null;    
//  calculation_temp_insert
    private Equip_CalculationTempInsert objEquip_CalculationTempInsert = null;    
//  GET CALCULATION TAX_SET
    private Equip_Calculation_TaxSetQuery objEquip_Calculation_TaxSetQuery = null;    
//  junggi CALCULATION_UPDATE
    private Equip_CalculationUpdateQuery objEquip_CalculationUpdateQuery = null;
//  reduction정보
	private GetReductionInfoQuery objGetReductionInfoQuery = null;    
//	산출물 입력
	private CalSumReductionUpdate objCalSumReductionUpdate = null;
	
//	2009.8 추가
	//산출 정보 - calculation_list tnwjd
    private CalculationList_purpose objCalculationList_purpose = null;
    private Equip_Taxation_InfoInsert objEquip_Taxation_InfoInsert = null;
    private Equip_Taxation_InfoUpdate objEquip_Taxation_InfoUpdate = null;
    private Equip_Cal_Sum_AddUpdate objEquip_Cal_Sum_AddUpdate = null;
    private CalculationListsQuery objCalculationListsQuery = null;
    private Equip_ProductBeanQuery objEquip_ProductBeanQuery = null;
	
	private	Util				util			= new Util();

  	
    protected void initDao()  throws Exception {
    	
    	
		super.initDao();
		
		//점용조회 ////////////////////////////////////////////////////////////////////////////////////////		
		//점용조회		
		objSearchListQuery = new SearchListQuery(getDataSource());
		//산출 정보 - cal_sum_infoList
	    objCal_sumList = new Cal_sumListQuery(getDataSource());
	 	//산출 정보 - calculation_list
	    objCalculationListQuery = new CalculationListQuery(getDataSource());
//	 	calculation_info
	    objCalculationInfoQuery = new CalculationInfoQuery(getDataSource());
//	  calculation_temp_insert
	    objEquip_CalculationTempInsert = new Equip_CalculationTempInsert(getDataSource());	    
//	  GET CALCULATION TAX_SET
	    objEquip_Calculation_TaxSetQuery = new Equip_Calculation_TaxSetQuery(getDataSource());
//	  junggi CALCULATION_UPDATE
	    objEquip_CalculationUpdateQuery = new Equip_CalculationUpdateQuery(getDataSource());    
//		reduction정보
		objGetReductionInfoQuery = new GetReductionInfoQuery(getDataSource());
//		산출물 입력
		objCalSumReductionUpdate = new CalSumReductionUpdate(getDataSource());
	    
//		 2009.8.18 추가
		//	산출 정보 - calculation_list 수정
	    objCalculationList_purpose = new CalculationList_purpose(getDataSource());
	    objEquip_Taxation_InfoInsert = new Equip_Taxation_InfoInsert(getDataSource());
	    objEquip_Taxation_InfoUpdate = new Equip_Taxation_InfoUpdate(getDataSource());
	    objEquip_Cal_Sum_AddUpdate = new Equip_Cal_Sum_AddUpdate(getDataSource());
	    
	    objCalculationListsQuery = new CalculationListsQuery(getDataSource());
	    objEquip_ProductBeanQuery = new Equip_ProductBeanQuery(getDataSource());
		
   	}
    
    
    
	//정기조회 ////////////////////////////////////////////////////////////////////////////////////////
    //정기 조회
    public List searhList(String office_nm, String gu_code,String year,int intCurPage )
	{	        
    	if(office_nm.equals(""))
    		office_nm = "%";
    	else office_nm = "%"+office_nm+"%";
		
		if(year.equals("0"))
			year = "%";
		else year = year+"%";
    	
    	System.out.println("year==>"+year);
    	System.out.println("gu_code==>"+gu_code);
    	System.out.println("office_nm==>"+office_nm);
    	System.out.println("intCurPage==>"+intCurPage);
    	//Object[] values = {year, gu_code, office_nm, new Integer(intCurPage), new Integer(10), new Integer(10)};    	    	
    	Object[] values = {gu_code, gu_code, office_nm, gu_code, year , new Integer(intCurPage), new Integer(10), new Integer(10)};
    	
    	return objSearchListQuery.execute(values);
	}
    
    
//  정기 조회  카운트
    public int getsearhListCount(String year, String gu_code,String office_nm)
	{	
    	if(office_nm.equals(""))
    		office_nm = "%";
    	else office_nm = office_nm+"%";
    	
    	if(year.equals("0"))
			year = "%";
		else year = year+"%";
    	
    	Object[] values = {office_nm,gu_code,year};
    	
    	String sql = getMessageSourceAccessor().getMessage("Querys.facility.junggi.searchListCount");
    	int returnNum = getJdbcTemplate().queryForInt(sql,values);
    	return returnNum;
	}
    
    
//	산출 정보 - cal_sum_infoList
    public List Cal_sumList(String gu_code, String corp_cd, String tax_set, String admin_no, int currentPage,int countPerPage)
    {
    	System.out.println("-=-=-=-=-=-=-=-");
    	System.out.println("gu_code : "+gu_code);
    	System.out.println("corp_cd : "+corp_cd);
    	System.out.println("tax_set : "+tax_set);
    	System.out.println("admin_no : "+admin_no);
    	System.out.println("currentPage : "+currentPage);
    	System.out.println("countPerPage : "+countPerPage);
    	
    	
    	Object values[] = {gu_code, corp_cd, tax_set, admin_no, new Integer(currentPage) , new Integer(countPerPage) };
    	//System.out.println("1.산출정보 리스트쿼리 == " + getMessageSourceAccessor().getMessage("Querys.facility.junggi.cal_sumList"));
    	return objCal_sumList.execute(values);
    }
    
 	//산출 정보 - calculation_list
    public List CalculationList(int seq , String year, String gu_code, String admin_no)
	{	
    	Object[] values = {admin_no,new Integer(seq), year, gu_code};
    	
    	
    	List a1 = objCalculationListQuery.execute(values);
    	
    	//System.out.println(getMessageSourceAccessor().getMessage("Querys.facility.junggi.calculationList"));
    	//System.out.println(seq);
    	return a1;
	}
    
// 	calculation_info
    public Equip_ProductBean CalculationInfo(String gu_code,int seq)
    {
    	Object[] values = {gu_code, new Integer(seq)};
    	Equip_ProductBean pb = (Equip_ProductBean)objCalculationInfoQuery.execute(values).get(0);    	     	
    	return pb;
    }  

//	EQUIP 정기분 산출 목록 입력//YEAR,FROMDATE,TODATE,UP_DATE,FIRST_SEQ,CAL_SUM_SEQ,GU_CODE,CORP_CD
    public void Equip_CalculationTempInsert(Equip_ProductBean epb)
    {    	
    	
    	Object[] values = {epb.getYEAR(),epb.getFROMDATE(),epb.getTODATE(),epb.getUP_DATE(),new Integer(epb.getCAL_SUM_SEQ())
    			,epb.getGU_CODE(),epb.getCORP_CD(),epb.getTAX_SET(),epb.getGU_CODE(),epb.getCORP_CD(),epb.getTAX_SET()};
    	
    	
    	System.out.println(
    			epb.getYEAR()+"]  ["+epb.getFROMDATE()+"]  ["+epb.getTODATE()+"]  ["+epb.getUP_DATE()+"]  ["+new Integer(epb.getCAL_SUM_SEQ())
    			+"]  ["+epb.getGU_CODE()+"]  ["+epb.getCORP_CD()+"]  ["+epb.getTAX_SET()+"]  ["+epb.getGU_CODE()+"]  ["+epb.getCORP_CD()+"]  ["+epb.getTAX_SET());
    			
    	System.out.println(getMessageSourceAccessor().getMessage("Querys.facility.junggi.junggiCalculationTempInsert"));
    	
    	
    	objEquip_CalculationTempInsert.update(values);
    }
    
//	  GET CALCULATION TAX_SET
    public List Equip_Calculation_TaxSet(String gu_code,String corp_cd)
    {    	
    	Object[] values = {gu_code,corp_cd};    	
    	return objEquip_Calculation_TaxSetQuery.execute(values);
    }
    
    
//  junggi Equip_CAL_SUM_SEQ
    public int getEquip_Cal_Sum_Seq(String gu_code, String corp_cd,String tax_set,String year )
    {	
    	Object[] values = {corp_cd,gu_code,tax_set,year};
		String sql = getMessageSourceAccessor().getMessage("Querys.facility.junggi.GetJunggi_Cal_Sum_Seq");
		int result = getJdbcTemplate().queryForInt(sql,values);
		return result;
    }
    
//  junggi get_last_sum     
    public Map getLastSum(int seq) throws DataAccessException {
		Object[]values = {new Integer(seq)}; 
		String sql = getMessageSourceAccessor().getMessage("Querys.facility.junggi.GetEquip_LastSum");
		Map returnNum = getJdbcTemplate().queryForMap(sql,values);
		return returnNum;
    }
    
    
    
//  junggi CALCULATION_UPDATE
    public void Equip_CalculationUpdate(Equip_ProductBean ep)
    {
    	
    	
    	System.out.println(new Float(ep.getQUANTITY())
        		+"]    ["+ new Float(ep.getDEPTH_RATE())
        		+"]    ["+ new Float(ep.getRATE())
        		+"]    ["+ new Integer(ep.getPRICE())
        		+"]    ["+ ep.getFROMDATE()
        		+"]    ["+ ep.getTODATE()
        		+"]    ["+ ep.getPERIOD()
        		+"]    ["+ new Integer(ep.getSUM_LASTYEAR())
        		+"]    ["+ new Integer(ep.getSUM_YEAR())
        		+"]    ["+ new Integer(ep.getSUM_ADJUST())
        		+"]    ["+ new Float(ep.getADJUSTMENT())
        		+"]    ["+ ep.getFORM()
        		+"]    ["+ ep.getFORM_ADJUST()
        		+"]    ["+ new Integer(ep.getSEQ()));
    	
    	
    	Object[]values = {  new Float(ep.getQUANTITY())
    		, new Float(ep.getDEPTH_RATE())
    		, new Float(ep.getRATE())
    		, new Integer(ep.getPRICE())
    		, ep.getFROMDATE()
    		, ep.getTODATE()
    		, ep.getPERIOD()
    		, new Integer(ep.getSUM_LASTYEAR())
    		, new Integer(ep.getSUM_YEAR())
    		, new Integer(ep.getSUM_ADJUST())
    		, new Float(ep.getADJUSTMENT())
    		, ep.getFORM()
    		, ep.getFORM_ADJUST()
    		, new Integer(ep.getSEQ())};
    	
    	
    	try
    	{
    		int i = objEquip_CalculationUpdateQuery.update(values);
    	
    	}catch(Exception err)
    	{
    	
    		System.out.println("error= "+err.toString());
    	}
    	
    	
    	
    }
    
    
//  junggi Equip_CAL_SUM_SEQ
    public int getSum_SumAdjust(int seq )
    {	
    	Object[] values = {new Integer(seq)};
		String sql = getMessageSourceAccessor().getMessage("Querys.facility.junggi.getSum_SumAdjust");
		int result = getJdbcTemplate().queryForInt(sql,values);
		return result;
    }
    
     
//  junggi Equip_CAL_SUM_SEQ
    public int getcal_sum_exist(String gu_code,String corp_cd, String year , String tax_set )
    {	
    	System.out.println("===exit===");
    	System.out.println(gu_code);
    	System.out.println(corp_cd);
    	System.out.println(year);
    	System.out.println(tax_set);
    	
    	Object[] values = {gu_code,corp_cd,year,tax_set};
		String sql = getMessageSourceAccessor().getMessage("Querys.facility.junggi.cal_sum_exist");
		int result = getJdbcTemplate().queryForInt(sql,values);
		return result;
    }

//	reduction정보
    public Equip_ProductBean GetReductionInfo(String seq)
    {
    	Object[] values = {new Integer(seq)};
    	Equip_ProductBean pb = (Equip_ProductBean)objGetReductionInfoQuery.execute(values).get(0);
    	return pb;
    }
//	CAL_SUM_INFO 감면정보 업데이트 
    public int CalSumReductionUpdate(Equip_ProductBean objProductBean)
    {	
    	int i = 0;
		try{
		
			Object[] values = {		
					new Integer(objProductBean.getREDUCTION_RATE())
				,	objProductBean.getREDUCTION_REASON()
				,	new Integer(objProductBean.getREDUCTION_RATE())
				,	new Integer(objProductBean.getREDUCTION_RATE())
				,	new Integer(objProductBean.getSEQ())
			};
			
			i = objCalSumReductionUpdate.update(values);
			
			
		} catch (Exception e) {
			System.out.println(e.toString());
			e.printStackTrace();
		}
		return i;	
    }    
    
    //System.out.println(i+" : "+bea.getGU_CODE()+" : "+bea.getCORP_CD()+" : "+bea.getYEAR()+" : "+bea.getOBJECT_NO());
    public int CalculationCount(String gu_code, String corp_cd, String request_no,String year, String object_no){
    	
    	Object[] values = {gu_code, corp_cd, request_no, year, object_no };
		String sql = getMessageSourceAccessor().getMessage("Querys.facility.junggi.getCalculationCount");
		int result = getJdbcTemplate().queryForInt(sql,values);
		return result;
    	
    	
    }
    
    public List CalculationLists(String gu_code,String corp_cd,String year,String tax_set, String admin_no){
    	
    	Object[] values = {gu_code,corp_cd,tax_set,admin_no,year};
    	
    	
    	List amy = objCalculationListsQuery.execute(values);
    	
    	return amy;
    }
    
    public int WriteCalSumCount(String gu_code, String corp_cd, String year, String tax_set, String admin_no){
    	
    	Object[] values = {gu_code, corp_cd, year, tax_set, admin_no };
		String sql = getMessageSourceAccessor().getMessage("Querys.facility.junggi.getWriteCalSumCount");
		int result = getJdbcTemplate().queryForInt(sql,values);
		return result;
    	
    	
    }

	public int InputTaxationSiseCount(String gu_code,String corp_cd,String year){
		String year1 = year +"%"; 
		Object[] values = {gu_code, corp_cd, year1 };
		String sql = getMessageSourceAccessor().getMessage("Querys.facility.junggi.getInputTaxationSiseCount");
		int result = getJdbcTemplate().queryForInt(sql,values);
		return result;
    	
	}
	public int InputTaxationGuseCount(String gu_code,String corp_cd, String year){
		String year1 = year +"%";
		Object[] values = {gu_code, corp_cd, year1 };
		String sql = getMessageSourceAccessor().getMessage("Querys.facility.junggi.getInputTaxationGuseCount");
		int result = getJdbcTemplate().queryForInt(sql,values);
		return result;
    	
	}
    
    
    //////////////query 구현 ////////////////////////////////////////////////////////////////////
 	//정기 조회
    protected class SearchListQuery extends MappingSqlQuery {
        protected SearchListQuery(DataSource ds) {        	
        	super(ds,getMessageSourceAccessor().getMessage("Querys.facility.junggi.searchList"));
        	declareParameter(new SqlParameter(Types.VARCHAR));
        	declareParameter(new SqlParameter(Types.VARCHAR));
        	declareParameter(new SqlParameter(Types.VARCHAR));
      		declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));   
  			declareParameter(new SqlParameter(Types.INTEGER));
  			declareParameter(new SqlParameter(Types.INTEGER));      	
  			declareParameter(new SqlParameter(Types.INTEGER));  			
        }
        //OFFICE_NM, JIJUM_NM , CORP_CD, GU_CODE, SISE_JUM, GUSE_JUM, SISE_QUAN, GUSE_QUAN, CAL_YN  FROM \
        
          protected Object mapRow(ResultSet rs, int rownum) throws SQLException {
        	jumyongBean objJumyongBean = new jumyongBean();
        	        	         
            objJumyongBean.setOFFICE_NM(rs.getString("OFFICE_NM"));
            objJumyongBean.setJIJUM_NM(rs.getString("JIJUM_NM"));
            objJumyongBean.setCORP_CD(rs.getString("CORP_CD"));
            objJumyongBean.setGU_CODE(rs.getString("GU_CODE"));
            objJumyongBean.setYEAR(rs.getString("YEAR"));
            objJumyongBean.setADMIN_NO(rs.getString("ADMIN_NO"));
            objJumyongBean.setTAX_SET(rs.getString("TAX_SET"));

            if(rs.getString("CAL_YN") != null){
		            if(rs.getString("CAL_YN").trim().equals("0")){
		            	objJumyongBean.setCAL_YN("미산출");
		            } else if(rs.getString("CAL_YN").trim().equals("1")){
		            	objJumyongBean.setCAL_YN("산출");
		            }
            }
            objJumyongBean.setJUM_SUM(util.Comma_Paste(rs.getString("JUM_SUM")));
            objJumyongBean.setUSE_SECTION(rs.getString("NAME"));            
            objJumyongBean.setCOUNT_M(rs.getString("M_COUNT"));            
            objJumyongBean.setGAE_COUNT(String.valueOf(rs.getString("GAE_COUNT")));

            return objJumyongBean;
          }
      } 
    
 	//산출 정보 - cal_sum_infoList
    protected class Cal_sumListQuery extends MappingSqlQuery {
        protected Cal_sumListQuery(DataSource ds) {        	
      	super(ds,getMessageSourceAccessor().getMessage("Querys.facility.junggi.cal_sumList"));
      		
      		declareParameter(new SqlParameter(Types.VARCHAR));
      		declareParameter(new SqlParameter(Types.VARCHAR));
      		declareParameter(new SqlParameter(Types.VARCHAR));
      		declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.INTEGER));
			declareParameter(new SqlParameter(Types.INTEGER));
        }
        protected Object mapRow(ResultSet rs, int rownum) throws SQLException {
        	Equip_ProductBean objProductBean  = new Equip_ProductBean();
        	        	
			objProductBean.setSEQ(rs.getInt("SEQ"));
			objProductBean.setGU_CODE(rs.getString("GU_CODE"));
			objProductBean.setCORP_CD(rs.getString("CORP_CD"));
			
			objProductBean.setYEAR(rs.getString("YEAR"));
			objProductBean.setSUM_ADJUST(rs.getInt("SUM_ADJUST"));
			objProductBean.setSUM(rs.getInt("SUM"));
			objProductBean.setVAT(rs.getInt("VAT"));
			objProductBean.setREDUCTION_RATE(rs.getInt("REDUCTION_RATE"));
			objProductBean.setREDUCTION_REASON(rs.getString("REDUCTION_REASON"));
			objProductBean.setFORM_ADJUST(rs.getString("FORM_ADJUST"));
			objProductBean.setFROMDATE(rs.getString("FROMDATE"));
			objProductBean.setTODATE(rs.getString("TODATE"));
			objProductBean.setTAX_SET_NAME(rs.getString("TAX_SETNAME"));
			objProductBean.setUSE_SECTION(rs.getString("USE_SECTION"));
			objProductBean.setTAX_SET(rs.getString("TAX_SET"));
			objProductBean.setUSE_SECTION_NAME(rs.getString("USE_SECTION_NAME"));
	        	
            return objProductBean;
          }
      }  
    

     
 	//산출 정보 - calculation_list
    protected class CalculationListQuery extends MappingSqlQuery {
        protected CalculationListQuery(DataSource ds) {        	
      	super(ds,getMessageSourceAccessor().getMessage("Querys.facility.junggi.calculationList"));
      		declareParameter(new SqlParameter(Types.VARCHAR));	
      		declareParameter(new SqlParameter(Types.INTEGER));
      		declareParameter(new SqlParameter(Types.VARCHAR));
      		declareParameter(new SqlParameter(Types.VARCHAR));
        }
          protected Object mapRow(ResultSet rs, int rownum) throws SQLException {
        	  Equip_ProductBean objProductBean  = new Equip_ProductBean();
        	  //SELECT SEQ,EC.SUM_ADJUST, EP.PURPOSE_CD,EP.QUANTITY,EC.DEPTH_RATE, EP.DEPTH_NUM,EC.RATE,EC.TAX_SET,EC.USE_SECTION \
        	  //,RC.NAME AS USE_SECTION_NAME, RC2.NAME AS TAX_SET_NAME, RP.SORT_NM,RP.KIND_NM,CAL_SUM_SEQ \
        	  
        	  
        	  objProductBean.setGU_CODE(rs.getString("GU_CODE"));
        	  objProductBean.setCORP_CD(rs.getString("CORP_CD"));        	  
        	  objProductBean.setOBJECT_NO(rs.getString("OBJECT_NO"));
        	  objProductBean.setADMIN_NO(rs.getString("ADMIN_NO"));
        	  objProductBean.setSEQ(rs.getInt("SEQ"));
        	  objProductBean.setSUM_ADJUST(rs.getInt("SUM_ADJUST"));
        	  objProductBean.setPURPOSE_CD(rs.getString("PURPOSE_CD"));
        	  objProductBean.setQUANTITY(rs.getFloat("QUANTITY"));
        	  objProductBean.setDEPTH_RATE(rs.getFloat("DEPTH_RATE"));
        	  objProductBean.setDEPTH_NUM(rs.getString("DEPTH_NUM"));
        	  objProductBean.setRATE(rs.getFloat("RATE"));
        	  objProductBean.setTAX_SET(rs.getString("TAX_SET"));
        	  objProductBean.setUSE_SECTION(rs.getString("USE_SECTION"));
        	  objProductBean.setUSE_SECTION_NAME(rs.getString("USE_SECTION_NAME"));
        	  objProductBean.setTAX_SET_NAME(rs.getString("TAX_SET_NAME"));
        	  objProductBean.setSORT_NM(rs.getString("SORT_NM"));
        	  objProductBean.setKIND_NM(rs.getString("KIND_NM"));
        	  objProductBean.setCAL_SUM_SEQ(rs.getInt("CAL_SUM_SEQ"));
        	  //objProductBean.setSUM(rs.getInt("SUM"));
        	  objProductBean.setSUM_YEAR(rs.getInt("SUM_YEAR"));
        	  objProductBean.setCAL_STATUS(rs.getString("CAL_STATUS"));
        	  objProductBean.setYEAR(rs.getString("YEAR"));
        	  
            return objProductBean;
          }
      } 
    protected class CalculationListsQuery extends MappingSqlQuery {
        protected CalculationListsQuery(DataSource ds) {        	
      	super(ds,getMessageSourceAccessor().getMessage("Querys.facility.junggi.calculationLists"));
      		declareParameter(new SqlParameter(Types.INTEGER));
      		declareParameter(new SqlParameter(Types.VARCHAR));
      		declareParameter(new SqlParameter(Types.VARCHAR));
      		declareParameter(new SqlParameter(Types.VARCHAR));
      		declareParameter(new SqlParameter(Types.VARCHAR));
        }
          protected Object mapRow(ResultSet rs, int rownum) throws SQLException {
        	  Equip_ProductBean objProductBean  = new Equip_ProductBean();

        	  objProductBean.setGU_CODE(rs.getString("GU_CODE"));
        	  objProductBean.setCORP_CD(rs.getString("CORP_CD"));        	    	  
        	  objProductBean.setOBJECT_NO(rs.getString("OBJECT_NO"));
        	  objProductBean.setSEQ(rs.getInt("SEQ"));
        	  objProductBean.setSUM_ADJUST(rs.getInt("SUM_ADJUST"));
        	  objProductBean.setPURPOSE_CD(rs.getString("PURPOSE_CD"));
        	  objProductBean.setQUANTITY(rs.getFloat("QUANTITY"));
        	  objProductBean.setDEPTH_RATE(rs.getFloat("DEPTH_RATE"));
        	  objProductBean.setDEPTH_NUM(rs.getString("DEPTH_NUM"));
        	  objProductBean.setRATE(rs.getFloat("RATE"));
        	  objProductBean.setTAX_SET(rs.getString("TAX_SET"));
        	  objProductBean.setUSE_SECTION(rs.getString("USE_SECTION"));
        	  objProductBean.setUSE_SECTION_NAME(rs.getString("USE_SECTION_NAME"));
        	  objProductBean.setTAX_SET_NAME(rs.getString("TAX_SET_NAME"));
        	  objProductBean.setSORT_NM(rs.getString("SORT_NM"));
        	  objProductBean.setKIND_NM(rs.getString("KIND_NM"));
        	  objProductBean.setCAL_SUM_SEQ(rs.getInt("CAL_SUM_SEQ"));
        	  //objProductBean.setSUM(rs.getInt("SUM"));
        	  objProductBean.setSUM_YEAR(rs.getInt("SUM_YEAR"));
        	  objProductBean.setCAL_STATUS(rs.getString("CAL_STATUS"));
        	  objProductBean.setYEAR(rs.getString("YEAR"));

            return objProductBean;
          }
      } 
	

    // 	calculation_info
    protected class CalculationInfoQuery extends MappingSqlQuery {
        protected CalculationInfoQuery(DataSource ds) {        	
      	super(ds,getMessageSourceAccessor().getMessage("Querys.facility.junggi.calculationInfo"));
      	declareParameter(new SqlParameter(Types.VARCHAR));	
      	declareParameter(new SqlParameter(Types.INTEGER));
        }
          protected Object mapRow(ResultSet rs, int rownum) throws SQLException {
        	  Equip_ProductBean objProductBean  = new Equip_ProductBean();
        	  //SELECT GU_CODE,CORP_CD,REQUEST_NO,OBJECT_NO,YEAR,SEQ,RATE,DEPTH_RATE,SUM_ADJUST,FROMDATE,TODATE,FORM_ADJUST \
        	  //,FORM,UP_DATE,PERIOD,FIRST_SEQ,CAL_SUM_SEQ,QUANTITY,TAX_SET \
        	  objProductBean.setYEAR(rs.getString("YEAR"));
        	  objProductBean.setGU_CODE(rs.getString("GU_CODE"));
        	  objProductBean.setCORP_CD(rs.getString("CORP_CD"));        	  
        	  objProductBean.setOBJECT_NO(rs.getString("OBJECT_NO"));
        	  objProductBean.setADMIN_NO(rs.getString("ADMIN_NO"));
        	  objProductBean.setYEAR(rs.getString("YEAR"));
        	  objProductBean.setSEQ(rs.getInt("SEQ"));
        	  objProductBean.setRATE(rs.getFloat("RATE"));
        	  objProductBean.setDEPTH_RATE(rs.getFloat("DEPTH_RATE"));
        	  objProductBean.setSUM_ADJUST(rs.getInt("SUM_ADJUST"));
        	  objProductBean.setFROMDATE(rs.getString("FROMDATE"));
        	  objProductBean.setTODATE(rs.getString("TODATE"));
        	  objProductBean.setFORM_ADJUST(rs.getString("FORM_ADJUST"));
        	  objProductBean.setPERIOD(rs.getString("PERIOD"));
        	  objProductBean.setFIRST_SEQ(rs.getInt("FIRST_SEQ"));
        	  objProductBean.setCAL_SUM_SEQ(rs.getInt("CAL_SUM_SEQ"));
        	  objProductBean.setQUANTITY(rs.getFloat("QUANTITY"));
        	  objProductBean.setTAX_SET(rs.getString("TAX_SET"));
        	  objProductBean.setFORM(rs.getString("FORM"));
        	  objProductBean.setSUM_LASTYEAR(rs.getInt("SUM_LASTYEAR"));
        	  objProductBean.setSUM_YEAR(rs.getInt("SUM_YEAR"));
        	  
        	  // 2009.8.17 추가 start
        	  objProductBean.setPRICE(rs.getInt("PRICE"));
        	  objProductBean.setUSE_SECTION(rs.getString("USE_SECTION"));
        	  objProductBean.setSUM(rs.getInt("SUM"));
              objProductBean.setTAX_DATE(rs.getString("TAX_DATE"));
              objProductBean.setINDATE(rs.getString("INDATE"));
              objProductBean.setOVERDATE(rs.getString("OVERDATE"));
              objProductBean.setOVERTAX(rs.getString("OVERTAX"));
              objProductBean.setSIGU_CD(rs.getString("SIGU_CD"));
              objProductBean.setBJ_CD(rs.getString("BJ_CD"));
              objProductBean.setTAX_NO(rs.getString("TAX_NO"));
              objProductBean.setDEPT_CD(rs.getString("DEPT_CD"));
              objProductBean.setTAX_CD(rs.getString("TAX_CD"));
              objProductBean.setTAX_GUBUN(rs.getString("TAX_GUBUN"));
              objProductBean.setOBJ_SET(rs.getString("OBJ_SET"));
              objProductBean.setTAXPAYER_ID(rs.getString("TAXPAYER_ID"));
              objProductBean.setTAXPAYER_SET(rs.getString("TAXPAYER_SET"));
              objProductBean.setOCR_SIGU_CD(rs.getString("OCR_SIGU_CD"));
              objProductBean.setOCR_BUSEO_CD(rs.getString("OCR_BUSEO_CD"));
              objProductBean.setTSEQ(rs.getString("TSEQ"));              
              objProductBean.setCAL_SUM_SEQ(rs.getInt("CAL_SUM_SEQ"));
              objProductBean.setREDUCTION_RATE(rs.getInt("REDUCTION_RATE"));
              objProductBean.setTAX_YN(rs.getString("TAX_YN"));
              objProductBean.setLIVE(rs.getString("LIVE"));
              // 2009.8.17 추가 end
        	
            return objProductBean;
          }
      }
    
//  calculation_temp_insert
    protected class Equip_CalculationTempInsert extends SqlUpdate {
        public Equip_CalculationTempInsert(DataSource dataSource) {	        	
        	super(dataSource, getMessageSourceAccessor().getMessage("Querys.facility.junggi.junggiCalculationTempInsert"));
        	//year,fromdate,todate,up_date,first_seq,cal_sum_seq,gu_code,corp_cd
            declareParameter(new SqlParameter(Types.VARCHAR));	//YEAR
      		declareParameter(new SqlParameter(Types.VARCHAR));	//FROMDATE
      		declareParameter(new SqlParameter(Types.VARCHAR));	//TODATE      		
      		declareParameter(new SqlParameter(Types.VARCHAR));	//UP_DATE      		
      		declareParameter(new SqlParameter(Types.INTEGER));	//CAL_SUM_SEQ
      		declareParameter(new SqlParameter(Types.VARCHAR));	//GU_CODE      		
      		declareParameter(new SqlParameter(Types.VARCHAR));	//CORP_CD
      		declareParameter(new SqlParameter(Types.VARCHAR));	//TAX_SET
      		
      		declareParameter(new SqlParameter(Types.VARCHAR));	//GU_CODE      		
      		declareParameter(new SqlParameter(Types.VARCHAR));	//CORP_CD
      		declareParameter(new SqlParameter(Types.VARCHAR));	//TAX_SET
        }
    }   
    
//  GET CALCULATION TAX_SET
    protected class Equip_Calculation_TaxSetQuery extends MappingSqlQuery {
        protected Equip_Calculation_TaxSetQuery(DataSource ds) {        	
      	super(ds,getMessageSourceAccessor().getMessage("Querys.facility.junggi.getCalculation_TaxSet"));
	      	declareParameter(new SqlParameter(Types.VARCHAR));
	  		declareParameter(new SqlParameter(Types.VARCHAR));	
        }
          protected Object mapRow(ResultSet rs, int rownum) throws SQLException {
        	Equip_ProductBean objProductBean = new Equip_ProductBean();
        	objProductBean.setTAX_SET(rs.getString("TAX_SET"));
            return objProductBean;
          }
      }      
    
    
    //UPDATE EQUIP_CALCULATION SET QUANTITY = ?,DEPTH_RATE = ?,RATE = ?,PRICE = ?,FROMDATE = ?,TODATE = ? \
    //		,PERIOD = ?,SUM_LASTYEAR = ?,SUM_YEAR = ?,SUM_ADJUST = ?,ADJUSTMENT = ?,FORM = ?,FORM_ADJUST = ?WHERE SEQ = ?
//  junggi CALCULATION_UPDATE
    class Equip_CalculationUpdateQuery extends SqlUpdate {
        public Equip_CalculationUpdateQuery(DataSource dataSource) {	        	
        	super(dataSource, getMessageSourceAccessor().getMessage("Querys.facility.junggi.calculation_update"));
            declareParameter(new SqlParameter(Types.FLOAT));	//QUANTITY
      		declareParameter(new SqlParameter(Types.FLOAT));	//DEPTH_RATE
      		declareParameter(new SqlParameter(Types.FLOAT));	//RATE
      		declareParameter(new SqlParameter(Types.INTEGER));	//PRICE
      		declareParameter(new SqlParameter(Types.VARCHAR));	//FROMDATE
      		declareParameter(new SqlParameter(Types.VARCHAR));	//TODATE
      		declareParameter(new SqlParameter(Types.VARCHAR));	//PERIOD
      		declareParameter(new SqlParameter(Types.INTEGER));	//SUM_LASTYEAR
      		declareParameter(new SqlParameter(Types.INTEGER));	//SUM_YEAR
      		declareParameter(new SqlParameter(Types.INTEGER));	//SUM_ADJUST
      		declareParameter(new SqlParameter(Types.FLOAT));	//ADJUSTMENT
      		declareParameter(new SqlParameter(Types.VARCHAR));	//FORM
      		declareParameter(new SqlParameter(Types.VARCHAR));	//FORM_ADJUST
      		declareParameter(new SqlParameter(Types.INTEGER));	//SEQ
        }
    }   
    

//	SUM_ADJUST, AREA_AFTER 합계 SUM_SEQ별				
 protected class GetReductionInfoQuery extends MappingSqlQuery {
      protected GetReductionInfoQuery(DataSource ds) {
    	super(ds, getMessageSourceAccessor().getMessage("Querys.facility.junggi.getReduction"));
    	declareParameter(new SqlParameter(Types.INTEGER));	//seq
      }
        protected Object mapRow(ResultSet rs, int rownum) throws SQLException {
        	
          Equip_ProductBean objProductBean = new Equip_ProductBean();
          
          objProductBean.setREDUCTION_RATE(rs.getInt("REDUCTION_RATE"));
          objProductBean.setREDUCTION_REASON(rs.getString("REDUCTION_REASON"));
          objProductBean.setSEQ(rs.getInt("SEQ"));
          
          return objProductBean;
        }
    }    
    
//산출물 입력
	class CalSumReductionUpdate extends SqlUpdate {
		public CalSumReductionUpdate(DataSource dataSource) {	        	
			//(ADMIN_NO, SEQ, YEAR, AREA, SUM_ADJUST,VAT,REDUCTION_RATE,SUM,USE_SECTION,REDUCTION_REASON) \
			super(dataSource, getMessageSourceAccessor().getMessage("Querys.facility.junggi.cal_sum_reductionUpdate"));
			declareParameter(new SqlParameter(Types.INTEGER));	//REDUCTION_RATE
			declareParameter(new SqlParameter(Types.VARCHAR));	//REDUCTION_REASON
			declareParameter(new SqlParameter(Types.INTEGER));	//REDUCTION_RATE
			declareParameter(new SqlParameter(Types.INTEGER));	//REDUCTION_RATE
			declareParameter(new SqlParameter(Types.INTEGER));	//seq
		}
	}		
     
	// 2009.8.17 추가 start
	// 산출정보 카운트
    public int Cal_sumListCount(String gu_code, String corp_cd,  String request_no, String tax_set)
	{	
    	Object[] values = {gu_code, corp_cd, tax_set};
    	String sql = getMessageSourceAccessor().getMessage("Querys.facility.junggi.cal_sum_listCount");
    	int returnNum = getJdbcTemplate().queryForInt(sql,values);
    	return returnNum;
	}
    
    // 정기분 해당연도 같은 first_seq당 개수
    public int GetCountSameCal(String seq,String year)
	{	
    	Object[] values = {new Integer(seq),year};
    	String sql = getMessageSourceAccessor().getMessage("Querys.facility.junggi.getCountSameCalculation");
    	int returnNum = getJdbcTemplate().queryForInt(sql,values);
		return returnNum;    	
	}
    
    // 정기분 해당연도 개수 합 
    public int getAreaSum(String gu_code, String corp_cd, String year, String tax_set)
	{	
    	Object[] values = {gu_code, corp_cd, year, tax_set};
    	String sql = getMessageSourceAccessor().getMessage("Querys.facility.junggi.getAreaSum");
    	int returnNum = getJdbcTemplate().queryForInt(sql,values);
		return returnNum;    	
	}
    
    // 산출 정보 - calculation_list 수정
    public List CalculationList_purpose(int seq )
	{	
    	Object[] values = {new Integer(seq)};
    	
    	
    	List a1 = objCalculationList_purpose.execute(values);
    	
    	System.out.println("2.산출정보 리스트쿼리 == " + getMessageSourceAccessor().getMessage("Querys.facility.junggi.calculationList_purpose"));
    	System.out.println(seq);
    	return a1;
	}
    
    
    // Equip_CALCULATION SUM_ADJUST 합계
    public int Equip_Calculation_Sum_Adjust(String gu_code, String corp_cd,String tax_set ,String year)
    {	
    	Object[] values = {gu_code,corp_cd,tax_set,year};
		String sql = getMessageSourceAccessor().getMessage("Querys.facility.junggi.getEquip_Calculation_Sum_Adjust");
		int result = getJdbcTemplate().queryForInt(sql,values);
		
		System.out.println("r="+result);
		
		return result;
    }
    
    // 산출 정보 - calculation_list 수정
    protected class CalculationList_purpose extends MappingSqlQuery {
        protected CalculationList_purpose(DataSource ds) {        	
      	super(ds,getMessageSourceAccessor().getMessage("Querys.facility.junggi.calculationList_purpose"));
      		declareParameter(new SqlParameter(Types.INTEGER));
        }
          protected Object mapRow(ResultSet rs, int rownum) throws SQLException {
        	  Equip_ProductBean objProductBean  = new Equip_ProductBean();
        	         	  
        	  objProductBean.setGU_CODE(rs.getString("GU_CODE"));
        	  objProductBean.setCORP_CD(rs.getString("CORP_CD"));
        	  objProductBean.setQUANTITY(rs.getFloat("QUANTITY"));
        	  objProductBean.setPURPOSE_CD(rs.getString("PURPOSE_CD"));
        	  objProductBean.setSORT_NM(rs.getString("SORT_NM"));
        	  objProductBean.setKIND_NM(rs.getString("KIND_NM"));
        	  objProductBean.setCAL_SUM_SEQ(rs.getInt("CAL_SUM_SEQ"));
        	  objProductBean.setTAX_SET(rs.getString("TAX_SET"));
        	  objProductBean.setTAX_SET_NAME(rs.getString("TAX_SET_NAME"));
        	  //objProductBean.setREQUEST_NO(rs.getString("REQUEST_NO"));        	  
        	  //objProductBean.setOBJECT_NO(rs.getString("OBJECT_NO"));
        	  //objProductBean.setSEQ(rs.getInt("SEQ"));
        	  //objProductBean.setSUM_ADJUST(rs.getInt("SUM_ADJUST"));        	  
        	  //objProductBean.setDEPTH_RATE(rs.getFloat("DEPTH_RATE"));
        	  //objProductBean.setDEPTH_NUM(rs.getString("DEPTH_NUM"));
        	  //objProductBean.setRATE(rs.getFloat("RATE"));        	  
        	  //objProductBean.setUSE_SECTION(rs.getString("USE_SECTION"));
        	  //objProductBean.setUSE_SECTION_NAME(rs.getString("USE_SECTION_NAME"));
        	  //objProductBean.setSUM(rs.getInt("SUM"));
        	  
            return objProductBean;
          }
      }     
    
    
    
    // 부과정보 입력 
	public void Equip_Taxation_InfoInsert(Equip_ProductBean Bean)
	{
	
		try
		{
			Object[] values = {
					Bean.getSIGU_CD() ,      
					Bean.getBJ_CD() ,        
					Bean.getTAX_NO() ,       
					Bean.getDEPT_CD() ,      
					Bean.getTAX_CD_GU() ,    
					Bean.getTAX_CD_MOK() ,   
					Bean.getTAX_CD_SE() ,    
					Bean.getTAX_GUBUN() ,    
					Bean.getTAX_YM() ,       
					Bean.getOBJ_SET() ,      
					Bean.getTAXPAYER_ID() ,  
					Bean.getTAXPAYER_SET() , 
					Bean.getLIVE() ,         
					Bean.getINDATE() ,       
					Bean.getOVERDATE() ,     
					Bean.getTAX_DATE() ,     
					Bean.getADD_SET() ,      
					Bean.getADD_YN() ,       
					Bean.getNOTES() ,        
					Bean.getLIMIT_SUM() ,    
					Bean.getLIMIT_CNT() ,    
					new Float(Bean.getRATE()) ,         
					Bean.getRATE_CAUSE() ,   
					Bean.getBONSE() ,        
					Bean.getGIGUM() ,        
					Bean.getGUKSE() ,        
					Bean.getSISE() ,         
					Bean.getGUSE() ,         
					new Float(Bean.getVAT()) ,          
					Bean.getINTAX() ,        
					Bean.getOVERTAX() ,      
					Bean.getFORM1() ,        
					Bean.getFORM2() ,        
					Bean.getGU_CODE() ,      
					Bean.getBUNNAP_NO() ,    
					Bean.getYEAR() ,         
					Bean.getSUSI_NO() ,      
					Bean.getTAX_CD() ,       
					new Integer(Bean.getSEQ()) ,          
					Bean.getTAX_YN() ,       
					Bean.getOCR_SIGU_CD() ,  
					Bean.getOCR_BUSEO_CD() , 
					Bean.getSUBUSEO_CD() ,   
					Bean.getCORP_CD() ,    
					Bean.getTYPE()
				};
			
			System.out.println("===정기분 equip_taxation_info 입력===");
			System.out.println("Bean.getSIGU_CD() );    ==  " + Bean.getSIGU_CD() );
			System.out.println("Bean.getBJ_CD() );      ==  " + Bean.getBJ_CD() );  
			System.out.println("Bean.getTAX_NO() );     ==  " + Bean.getTAX_NO() ); 
			System.out.println("Bean.getDEPT_CD() );    ==  " + Bean.getDEPT_CD() );
			System.out.println("Bean.getTAX_CD_GU() );  ==  " + Bean.getTAX_CD_GU() ); 
			System.out.println("Bean.getTAX_CD_MOK() )  ==  " + Bean.getTAX_CD_MOK() );
			System.out.println("Bean.getTAX_CD_SE() );  ==  " + Bean.getTAX_CD_SE() ); 
			System.out.println("Bean.getTAX_GUBUN() );  ==  " + Bean.getTAX_GUBUN() ); 
			System.out.println("Bean.getTAX_YM() );     ==  " + Bean.getTAX_YM() ); 
			System.out.println("Bean.getOBJ_SET() );    ==  " + Bean.getOBJ_SET() );
			System.out.println("Bean.getTAXPAYER_ID()   ==  " + Bean.getTAXPAYER_ID() ); 
			System.out.println("Bean.getTAXPAYER_SET()  ==  " + Bean.getTAXPAYER_SET() );
			System.out.println("Bean.getLIVE() );       ==  " + Bean.getLIVE() );
			System.out.println("Bean.getINDATE() );     ==  " + Bean.getINDATE() );
			System.out.println("Bean.getOVERDATE() );   ==  " + Bean.getOVERDATE() );
			System.out.println("Bean.getTAX_DATE() );   ==  " + Bean.getTAX_DATE() );
			System.out.println("Bean.getADD_SET() );    ==  " + Bean.getADD_SET() );
			System.out.println("Bean.getADD_YN() );     ==  " + Bean.getADD_YN() );
			System.out.println("Bean.getNOTES() );      ==  " + Bean.getNOTES() );
			System.out.println("Bean.getLIMIT_SUM() );  ==  " + Bean.getLIMIT_SUM() );
			System.out.println("Bean.getLIMIT_CNT() );  ==  " + Bean.getLIMIT_CNT() );
			System.out.println("Bean.getRATE() );       ==  " + Bean.getRATE() );
			System.out.println("Bean.getRATE_CAUSE() )  ==  " + Bean.getRATE_CAUSE() );
			System.out.println("Bean.getBONSE() );      ==  " + Bean.getBONSE() );
			System.out.println("Bean.getGIGUM() );      ==  " + Bean.getGIGUM() );
			System.out.println("Bean.getGUKSE() );      ==  " + Bean.getGUKSE() );
			System.out.println("Bean.getSISE() );       ==  " + Bean.getSISE() );
			System.out.println("Bean.getGUSE() );       ==  " + Bean.getGUSE() );
			System.out.println("Bean.getVAT() );        ==  " + Bean.getVAT() );
			System.out.println("Bean.getINTAX() );      ==  " + Bean.getINTAX() );
			System.out.println("Bean.getOVERTAX() );    ==  " + Bean.getOVERTAX() );
			System.out.println("Bean.getFORM1() );      ==  " + Bean.getFORM1() );
			System.out.println("Bean.getFORM2() );      ==  " + Bean.getFORM2() );
			System.out.println("Bean.getGU_CODE() );    ==  " + Bean.getGU_CODE() );
			System.out.println("Bean.getBUNNAP_NO() );  ==  " + Bean.getBUNNAP_NO() );
			System.out.println("Bean.getYEAR() );       ==  " + Bean.getYEAR() );
			System.out.println("Bean.getSUSI_NO() );    ==  " + Bean.getSUSI_NO() );
			System.out.println("Bean.getTAX_CD() );     ==  " + Bean.getTAX_CD() );
			System.out.println("Bean.getSEQ() );        ==  " + Bean.getSEQ() );
			System.out.println("Bean.getTAX_YN() );     ==  " + Bean.getTAX_YN() );
			System.out.println("Bean.getOCR_SIGU_CD()   ==  " + Bean.getOCR_SIGU_CD() );
			System.out.println("Bean.getOCR_BUSEO_CD()  ==  " + Bean.getOCR_BUSEO_CD() );
			System.out.println("Bean.getSUBUSEO_CD() )  ==  " + Bean.getSUBUSEO_CD() );
			System.out.println("Bean.getCORP_CD() );    ==  " + Bean.getCORP_CD() );
			System.out.println("Bean.getREQUEST_NO() )  ==  " + Bean.getREQUEST_NO() );
			System.out.println("Bean.getTYPE()          ==  " + Bean.getTYPE() );
			System.out.println(getMessageSourceAccessor().getMessage("Querys.facility.junggi.Equip_Taxation_InfoInsert"));
	    	
	    	
	    	objEquip_Taxation_InfoInsert.update(values);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
	}

	public class Equip_Taxation_InfoInsert extends SqlUpdate {
		public Equip_Taxation_InfoInsert(DataSource dataSource)  throws SQLException{	        	
			super(dataSource, getMessageSourceAccessor().getMessage("Querys.facility.junggi.Equip_Taxation_InfoInsert"));
	     	
				declareParameter(new SqlParameter(Types.VARCHAR));
				declareParameter(new SqlParameter(Types.VARCHAR));
				declareParameter(new SqlParameter(Types.VARCHAR));
				declareParameter(new SqlParameter(Types.VARCHAR));
				declareParameter(new SqlParameter(Types.VARCHAR)); 
				declareParameter(new SqlParameter(Types.VARCHAR));
				declareParameter(new SqlParameter(Types.VARCHAR));
				declareParameter(new SqlParameter(Types.VARCHAR));
				declareParameter(new SqlParameter(Types.VARCHAR));
				declareParameter(new SqlParameter(Types.VARCHAR));

				declareParameter(new SqlParameter(Types.VARCHAR));
				declareParameter(new SqlParameter(Types.VARCHAR));
				declareParameter(new SqlParameter(Types.VARCHAR));
				declareParameter(new SqlParameter(Types.VARCHAR));
				declareParameter(new SqlParameter(Types.VARCHAR)); 
				declareParameter(new SqlParameter(Types.VARCHAR));
				declareParameter(new SqlParameter(Types.VARCHAR));
				declareParameter(new SqlParameter(Types.VARCHAR));
				declareParameter(new SqlParameter(Types.VARCHAR));
				declareParameter(new SqlParameter(Types.VARCHAR));
 
				declareParameter(new SqlParameter(Types.VARCHAR));
				declareParameter(new SqlParameter(Types.VARCHAR));
				declareParameter(new SqlParameter(Types.VARCHAR));	
				declareParameter(new SqlParameter(Types.VARCHAR));
				declareParameter(new SqlParameter(Types.VARCHAR)); 
				declareParameter(new SqlParameter(Types.VARCHAR));
				declareParameter(new SqlParameter(Types.VARCHAR));
				declareParameter(new SqlParameter(Types.VARCHAR));
				declareParameter(new SqlParameter(Types.VARCHAR));
				declareParameter(new SqlParameter(Types.VARCHAR));
 
				declareParameter(new SqlParameter(Types.VARCHAR));
				declareParameter(new SqlParameter(Types.VARCHAR));
				declareParameter(new SqlParameter(Types.VARCHAR));
				declareParameter(new SqlParameter(Types.VARCHAR));
				declareParameter(new SqlParameter(Types.VARCHAR)); 
				declareParameter(new SqlParameter(Types.VARCHAR));
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
	
	
	// equip_taxation_info 수정
	public void Equip_Taxation_InfoUpdate(Equip_ProductBean objProductBean)
	{
	
		try
		{
			/*System.out.println( " objProductBean.getTAX_YM()	===" + objProductBean.getTAX_YM());
			System.out.println( " objProductBean.getINDATE()	===" + objProductBean.getINDATE());
			System.out.println( " objProductBean.getOVERDATE()===" + objProductBean.getOVERDATE());
			System.out.println( " objProductBean.getTAX_DATE()	===" + objProductBean.getTAX_DATE());
			System.out.println( " objProductBean	===" + objProductBean.getVAT());
			System.out.println( " objProductBean.getOVERTAX()===" + objProductBean.getOVERTAX());
			System.out.println( " objProductBean.getFORM_ADJUST()===" + objProductBean.getFORM_ADJUST());
			System.out.println( " objProductBean.getFORM()		===" + objProductBean.getFORM());
			System.out.println( " objProductBean.getINTAX()   == " + objProductBean.getINTAX());
			System.out.println( " objProductBean.getRATE()		===" + objProductBean.getRATE());
			System.out.println( " objProductBean.getSEQ()===" + objProductBean.getSEQ());
   			*/
   			Object[] values = {
   					objProductBean.getTAX_YM()			
					, objProductBean.getINDATE()
					, objProductBean.getOVERDATE()
					, objProductBean.getTAX_DATE()
					, new Float( objProductBean.getVAT())
					
					, objProductBean.getOVERTAX()
					, objProductBean.getFORM_ADJUST()
					, objProductBean.getFORM()					
					, objProductBean.getBONSE()
					, objProductBean.getSISE()
					
					, objProductBean.getGUSE()
					, objProductBean.getINTAX()	
					, new Float(objProductBean.getRATE())
   					, new Integer(objProductBean.getSEQ())
   					
   				};	
			System.out.println(getMessageSourceAccessor().getMessage("Querys.facility.junggi.Equip_Taxation_InfoUpdate"));
	    	
	    	
	    	objEquip_Taxation_InfoUpdate.update(values);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
	}

	public class Equip_Taxation_InfoUpdate extends SqlUpdate {
		public Equip_Taxation_InfoUpdate(DataSource dataSource)  throws SQLException{	        	
			super(dataSource, getMessageSourceAccessor().getMessage("Querys.facility.junggi.Equip_Taxation_InfoUpdate"));
	     	
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
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
		}
	}
	
	
	// EQUIP_CAL_SUM_INFO update
	public void Equip_Cal_Sum_AddUpdate(Equip_ProductBean epb)
    {	
     	Object[] values = {new Integer(epb.getSUM_ADJUST()),new Integer(epb.getVAT()),
     			new Integer(epb.getSUM()),epb.getFORM_ADJUST() ,epb.getUP_DATE()  ,epb.getYEAR(), epb.getCORP_CD(), epb.getGU_CODE(), new Integer(epb.getSEQ())};
    	
     	objEquip_Cal_Sum_AddUpdate.update(values);
    }
	class Equip_Cal_Sum_AddUpdate extends SqlUpdate {
        public Equip_Cal_Sum_AddUpdate(DataSource dataSource) {	        	
        	super(dataSource, getMessageSourceAccessor().getMessage("Querys.facility.junggi.equip_cal_sum_addUpdate"));
            declareParameter(new SqlParameter(Types.INTEGER));	//SUM_ADJUST
      		declareParameter(new SqlParameter(Types.INTEGER));	//VAT
      		declareParameter(new SqlParameter(Types.INTEGER));	//SUM
      		declareParameter(new SqlParameter(Types.VARCHAR));	//FORM_ADJUST
      		declareParameter(new SqlParameter(Types.VARCHAR));	//UP_DATE
      		declareParameter(new SqlParameter(Types.VARCHAR));	//year
      		declareParameter(new SqlParameter(Types.VARCHAR));	//corp_cd
      		declareParameter(new SqlParameter(Types.VARCHAR));	//gu_code
      		declareParameter(new SqlParameter(Types.VARCHAR));  // seq
       		
      		
        }
    }    
	
	public Equip_ProductBean Equip_Prev_Taxation_infoSelect(String seq){
		Object[] values = {seq};
		
		Equip_ProductBean bean = (Equip_ProductBean)objEquip_ProductBeanQuery.execute(values).get(0);
		
		return bean;
		
	}
	
	
	protected class Equip_ProductBeanQuery extends MappingSqlQuery {
        protected Equip_ProductBeanQuery(DataSource ds) {        	
      	super(ds,getMessageSourceAccessor().getMessage("Querys.facility.junggi.PrevTaxation_infoSelect"));
      		declareParameter(new SqlParameter(Types.VARCHAR));
        }
          protected Object mapRow(ResultSet rs, int rownum) throws SQLException {
        	  Equip_ProductBean objProductBean  = new Equip_ProductBean();
        	  
        	  objProductBean.setTAX_NO(rs.getString("TAX_NO"));
        	  objProductBean.setDEPT_CD(rs.getString("DEPT_CD"));
        	  //objProductBean.setTAX_GUBUN(rs.getString("TAX_GUBUN"));
        	  objProductBean.setOBJ_SET(rs.getString("OBJ_SET"));
        	  objProductBean.setTAXPAYER_SET(rs.getString("TAXPAYER_SET"));
        	  objProductBean.setLIVE(rs.getString("LIVE"));
        	  objProductBean.setADD_SET(rs.getString("ADD_SET"));
        	  objProductBean.setADD_YN(rs.getString("ADD_YN"));
        	  objProductBean.setBUNNAP_NO(rs.getString("BUNNAP_NO"));
        	  //objProductBean.setSUSI_NO(rs.getString("SUSI_NO"));
        	  objProductBean.setTAX_CD(rs.getString("TAX_CD"));
        	  objProductBean.setOCR_SIGU_CD(rs.getString("OCR_SIGU_CD"));
        	  objProductBean.setOCR_BUSEO_CD(rs.getString("OCR_BUSEO_CD"));
        	  objProductBean.setSUBUSEO_CD(rs.getString("SUBUSEO_CD"));
        	  
        	System.out.println("정기 equip_taxation_info : insert 하는 부분");
       		System.out.println("getTAX_NO : "+objProductBean.getTAX_NO());
       		System.out.println("getDEPT_CD : "+objProductBean.getDEPT_CD());
       		System.out.println("getTAX_GUBUN : "+objProductBean.getTAX_GUBUN());
       		System.out.println("getOBJ_SET : "+objProductBean.getOBJ_SET());
       		System.out.println("getTAXPAYER_SET : "+objProductBean.getTAXPAYER_SET());
       		System.out.println("getLIVE : "+objProductBean.getLIVE());
       		System.out.println("getADD_SET : "+objProductBean.getADD_SET());
       		System.out.println("getADD_YN : "+objProductBean.getADD_YN());
       		System.out.println("getBUNNAP_NO : "+objProductBean.getBUNNAP_NO());
       		System.out.println("getSUSI_NO : "+objProductBean.getSUSI_NO());
       		System.out.println("getTAX_CD : "+objProductBean.getTAX_CD());
       		System.out.println("getOCR_SIGU_CD : "+objProductBean.getOCR_SIGU_CD());
       		System.out.println("getOCR_BUSEO_CD : "+objProductBean.getOCR_BUSEO_CD());
       		System.out.println("getSUBUSEO_CD : "+objProductBean.getSUBUSEO_CD());
        	    
            return objProductBean;
          }
      }     
    
}
