


package main.java.gapan.junggi.dao;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;
import main.java.common.dao.RoadsJdbcDaoSupport;
import main.java.common.util.catUtil.Util;


import main.java.gapan.jumyong.model.jumyongBean;

import main.java.gapan.jumyong.model.ProductBean;
import main.java.gapan.jumyong.model.SearchBean;
import main.java.gapan.junggi.dao.JunggiDao.ExecuteBugwa_Register;

import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.MappingSqlQuery;
import org.springframework.jdbc.object.SqlUpdate;

import org.springframework.jdbc.support.lob.OracleLobHandler;

public class JunggiDao extends RoadsJdbcDaoSupport implements IJunggiDao
{ 
	private	Util				util			= new Util();
	private OracleLobHandler oracleLobHandler = null; 
	
	// 공시지가 일괄 적용 View
	private LandPriceAllApllyQuery objLandPriceAllApllyQuery = null;
	//공시지가 일괄 적용 
	private PriceApllyUpdateQuery objPriceApllyUpdateQuery = null;
	//공시지가 일괄적용 update2
	private PriceApllyUpdateQuery2 objPriceApllyUpdateQuery2 = null;
	//공시지가 일괄적용 update3
	private PriceApllyUpdateQuery3 objPriceApllyUpdateQuery3 = null;
	
	//정기분 조회 리스트
	private JunggiSearchListQuery objPeriodicalQuery=null;
    // 부과정보 리스트	
	private ImpositionInfoListQuery objImpositionInfoListQuery = null;
	private ImpositionInfoListQuery2 objImpositionInfoListQuery2 = null;
	
	private ImpositionInfoByCalSumListQuery objImpositionInfoByCalSumListQuery = null;
	
	// 부과정보 - 년도별
	private ImpositionInfoQuery objImpositionInfoQuery = null;
	
	// 부과정보 - 년도별 합계
	private ImpositionSumListByYearQuery objImpositionSumListByYearQuery = null;	
	
	/*
	private RetrieveProductListQuery objProductListQuery=null;	
	private ExaminListQuery objExaminListQuery = null;
	*/
	//정기분 선택 리스트	//Querys.jumyong.productjunggi_addList = \
	private Productjunggi_addListQuery objProductjunggi_addListQuery = null;	

//    부과정보 - 년도별 합계 리스트
	 private cal_sum_infoListQuery objcal_sum_infoListQuery = null;	

//		CAL_SUM_INFO 테이블 면적 추가 업데이트		 
	private CalSumAddUpdate objCalSumAddUpdate = null;	 

//	산출물 입력
	private CalSumReductionUpdate objCalSumReductionUpdate = null;
	
//	SUM_ADJUST, AREA_AFTER 합계 SUM_SEQ별				
	private SumBysumSeqQuery objSumBysumSeqQuery = null; 	

//reduction정보
	private GetReductionInfoQuery objGetReductionInfoQuery = null;
	
//	CalculationTempUpdateQuery
	private CalculationTempInsertQuery objCalculationTempInsertQuery = null;
	
	// 2009.8.14 추가 
	private ExecuteBugwa_Register objExecuteBugwa_Register = null;
	private InsertProduct objInsertProduct = null;
	private InsertProduct2 objInsertProduct2 = null;
	private Cal_Sum_InfoInsert objCal_Sum_InfoInsert = null;
	private SetTaxYn objSetTaxYn = null;
	
	// 수정
	private UpdateProduct objUpdateProduct = null;
	private UpdateCal_sum_info objUpdateCal_sum_info = null;
	private UpdateTaxation_info objUpdateTaxation_info = null;
	
	private JunggiSearchListQuery_AllCal objPeriodicalQuery_AllCal = null;
	private SetCal_Sum_Info_taxseq_update objSetCal_Sum_Info_taxseq = null;
	
    protected void initDao()  throws Exception {
		super.initDao();
		oracleLobHandler = new OracleLobHandler();
		
		//공시지가 일괄 적용 View
		objLandPriceAllApllyQuery = new LandPriceAllApllyQuery(getDataSource());
		
		objPriceApllyUpdateQuery = new PriceApllyUpdateQuery(getDataSource());
		
		objPriceApllyUpdateQuery2 = new PriceApllyUpdateQuery2(getDataSource());
		
		objPriceApllyUpdateQuery3 = new PriceApllyUpdateQuery3(getDataSource());
		
		//부과정보
		//정기분 조회 리스트
		objPeriodicalQuery = new JunggiSearchListQuery(getDataSource());
		// 부과정보 리스트		
		objImpositionInfoListQuery = new ImpositionInfoListQuery(getDataSource());
//		 부과정보 리스트 - 수시
		objImpositionInfoListQuery2 = new ImpositionInfoListQuery2(getDataSource());
		
		objImpositionInfoByCalSumListQuery = new ImpositionInfoByCalSumListQuery(getDataSource());
		
		// 부과정보 - 년도별
		objImpositionInfoQuery = new ImpositionInfoQuery(getDataSource());
		// 부과정보 - 년도별 합계
		objImpositionSumListByYearQuery = new ImpositionSumListByYearQuery(getDataSource());
		
//		정기분 선택 리스트	//Querys.jumyong.productjunggi_addList = \
		objProductjunggi_addListQuery = new Productjunggi_addListQuery(getDataSource());	
		
		 //    부과정보 - 년도별 합계 리스트
		objcal_sum_infoListQuery = new cal_sum_infoListQuery(getDataSource());	
		
		/*
		objRetrieveQuery = new RetrieveBoardListQuery(getDataSource());
		objProductListQuery = new RetrieveProductListQuery(getDataSource());
		objExaminListQuery = new ExaminListQuery(getDataSource());
		*/
//		CAL_SUM_INFO 테이블 면적 추가 업데이트		 
		objCalSumAddUpdate = new CalSumAddUpdate(getDataSource());
//		산출물 입력
		objCalSumReductionUpdate = new CalSumReductionUpdate(getDataSource());
//		SUM_ADJUST, AREA_AFTER 합계 SUM_SEQ별				
		objSumBysumSeqQuery = new SumBysumSeqQuery(getDataSource());		
//		reduction정보
		objGetReductionInfoQuery = new GetReductionInfoQuery(getDataSource());
//		CalculationTempUpdateQuery
		objCalculationTempInsertQuery = new CalculationTempInsertQuery(getDataSource());
		
//		 taxation_info insert 추가
		objExecuteBugwa_Register = new ExecuteBugwa_Register(getDataSource());
		objInsertProduct = new InsertProduct(getDataSource());
		objInsertProduct2 = new InsertProduct2(getDataSource());
		objCal_Sum_InfoInsert = new Cal_Sum_InfoInsert(getDataSource());
		objSetTaxYn = new SetTaxYn(getDataSource());
		
		// 수정
		objUpdateProduct = new UpdateProduct(getDataSource());
		objUpdateCal_sum_info = new UpdateCal_sum_info(getDataSource());
		objUpdateTaxation_info = new UpdateTaxation_info(getDataSource());
		
		objPeriodicalQuery_AllCal = new JunggiSearchListQuery_AllCal(getDataSource());
		objSetCal_Sum_Info_taxseq = new SetCal_Sum_Info_taxseq_update(getDataSource());
		
   	}	
    
    //method/////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
 // 공시지가 일괄 적용 count 
    public int getlandPriceAllApllyCount(String sigu_cd, String year, String type, String tax_set, String tax_yn, String mul_fromdate, String mul_todate, String cal_status, String purpose,String bj_cd
    		,String jumyongName)
    {
    	if(year.equals("0") || year.equals("")) year = "%";
    	if(type.equals("0") || type.equals("")) type = "%";
    	if(tax_set.equals("")) tax_set = "%";
    	if(tax_yn.equals("")) tax_yn="%";
    	if(bj_cd.equals("") || bj_cd.equals("00000") || bj_cd == null) bj_cd="%";
    	if(cal_status.equals("")) cal_status = "%";
    	if("".equals(jumyongName)){ jumyongName="%"; } else{ jumyongName = "%"+jumyongName+"%"; }

//    	 점용목적 조건 
    	String str1 = "";
    	String str2 = "";
    	String str3 = "";
	    	
	    if(purpose.length()>1){
	    	str1 = purpose.substring(0,1);
	    	str2 = purpose.substring(1,2);
	    	str3 = purpose.substring(2,3);
	    }
    	
    	if(purpose==null || purpose.equals("") || purpose.equals("000")){ 
    		purpose = "%";
    	}else if(str3.equals("0")){
    		if(str2.equals("0")){
    			
    			purpose = str1+"%";
    		}else{
    			
    			purpose = str1+str2+"%";
    		}
    	}     	
    	Object[] values = { sigu_cd, year, type, tax_set,  tax_yn, mul_fromdate, mul_todate, cal_status, purpose, bj_cd, jumyongName};
    	
    	String sql = getMessageSourceAccessor().getMessage("Querys.gapan.junggi.landPriceAllApllyCount");
    	int returnNum = getJdbcTemplate().queryForInt(sql,values);
    	return returnNum;
    }
    
    // 공시지가 일괄 적용 View
    public List getlandPriceAllAplly(String sigu_cd, String year, String type, String tax_set, String tax_yn, String mul_fromdate, String mul_todate, String cal_status, String purpose,String bj_cd
    		,String jumyongName, int currentPage,int countPerPage)
    {
    	if(year.equals("0") || year.equals("") || year==null){    		
    		year = "%";
    	}
    	if(type.equals("0") || type.equals("") || type==null) type = "%";
    	if(tax_set.equals("") || tax_set==null) tax_set = "%";
    	if(tax_yn.equals("") || tax_yn==null) tax_yn="%";
    	if(bj_cd.equals("") || bj_cd.equals("00000") || bj_cd == null) bj_cd="%";
    	if(cal_status.equals("") || cal_status==null) cal_status = "%";
    	if("".equals(jumyongName) || jumyongName==null){ jumyongName="%"; } else{ jumyongName = "%"+jumyongName+"%"; }
    	
    	
//   	 점용목적 조건 
    	String str1 = "";
    	String str2 = "";
    	String str3 = "";
	    System.out.println("purpose:::"+purpose);
	    if(purpose.length()==3){
	    	str1 = purpose.substring(0,1);
	    	str2 = purpose.substring(1,2);
	    	str3 = purpose.substring(2,3);
	    }
    	
    	if(purpose==null || purpose.equals("") || purpose.equals("000")){ 
    		purpose = "%";
    	}else if(str3.equals("0")){
    		if(str2.equals("0")){
    			
    			purpose = str1+"%";
    		}else{
    			
    			purpose = str1+str2+"%";
    		}
    	}     	
    	
    	Object[] values = {sigu_cd, year, type, tax_set,  tax_yn, mul_fromdate, mul_todate, cal_status, purpose, bj_cd, jumyongName, new Integer(currentPage),	new Integer(countPerPage) };
    	System.out.println("LandPriceAllAplly DAO!!!!!");
    	for(int i=0;i<values.length;i++)
    		System.out.println(i+":"+values[i]);
    	return objLandPriceAllApllyQuery.execute(values);
    }
    
    protected class LandPriceAllApllyQuery extends MappingSqlQuery {
    	
        protected LandPriceAllApllyQuery(DataSource ds) {
        	super(ds, getMessageSourceAccessor().getMessage("Querys.gapan.junggi.landPriceAllAplly"));
        	
        	declareParameter(new SqlParameter(Types.VARCHAR));
	      	declareParameter(new SqlParameter(Types.VARCHAR));
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
        
        protected Object mapRow(ResultSet rs, int rownum) throws SQLException {
        	jumyongBean objJumyongBean = new jumyongBean();
               
            objJumyongBean.setNO(rs.getString("R_ID"));
            objJumyongBean.setADMIN_NO(rs.getString("GAPAN_NO"));
            objJumyongBean.setNAME(rs.getString("OWNER_NAME"));
            objJumyongBean.setJIGA(util.Comma_Paste(rs.getString("JIGA")));            
            objJumyongBean.setBJ_NM(rs.getString("BJ_NM"));
            objJumyongBean.setWITH_ADDR(rs.getString("WITH_ADDR"));         
            objJumyongBean.setPLACE_A(rs.getString("PLACE_A"));
        
            return objJumyongBean;
          }
    }
    
    public boolean priceApllyUpdate(SearchBean sb) {
    	
    	if(sb.getYEAR().equals("0") || sb.getYEAR().equals("")) sb.setYEAR("%");
    	if(sb.getTYPE().equals("0") || sb.getTYPE().equals("")) sb.setTYPE("%");
    	if("".equals(sb.getTAX_SET())) sb.setTAX_SET("%");
    	if("".equals(sb.getTAX_YN())) sb.setTAX_YN("%");
    	if("".equals(sb.getBJ_CD()) || sb.getBJ_CD().equals("00000") || sb.getBJ_CD() == null) sb.setBJ_CD("%");
    	if("".equals(sb.getCAL_STATUS()) || sb.getCAL_STATUS()==null) sb.setCAL_STATUS("%");    	
    	if("".equals(sb.getJUMYONGNAME())) 
    		sb.setJUMYONGNAME("%");
    	else
    		sb.setJUMYONGNAME("%"+sb.getJUMYONGNAME()+"%");
    	if("".equals(sb.getSECTION()) || sb.getSECTION() == null) sb.setSECTION("%");

//   	 점용목적 조건 
    	String str1 = "";
    	String str2 = "";
    	String str3 = "";
	    	
	    if(sb.getPURPOSE().length()==3){
	    	str1 = sb.getPURPOSE().substring(0,1);
	    	str2 = sb.getPURPOSE().substring(1,2);
	    	str3 = sb.getPURPOSE().substring(2,3);
	    }
    	
    	if(sb.getPURPOSE()==null || sb.getPURPOSE().equals("") || sb.getPURPOSE().equals("000")){ 
    		sb.setPURPOSE("%");
    	}else if(str3.equals("0")){
    		if(str2.equals("0")){
    			sb.setPURPOSE(str1+"%");    			
    		}else{
    			sb.setPURPOSE(str1+str2+"%");
    		}
    	}     	    	
    	
    	Object[] values = {sb.getGU_CODE(),
    					   sb.getYEAR(),
    					   sb.getTYPE(),
    					   sb.getTAX_SET(),
    					   sb.getTAX_YN(),
    					   sb.getFROMDATE(),
    					   sb.getTODATE(),
    					   sb.getPURPOSE(),
    					   sb.getBJ_CD(),    					    					  
    					   sb.getJUMYONGNAME(),    					   
    					   sb.getCAL_STATUS()
    					  };
    	for(int j=0;j<10;j++)
    		System.out.println(j+":"+values[j]);
    	List list = objPriceApllyUpdateQuery.execute(values);
    	ProductBean pb = new ProductBean();
    	System.out.println("List:"+list.size());
    	int a=0;
    	int b=0;
    	for(int i=0;i<list.size();i++){
    		pb = (ProductBean)list.get(i);
    		
    		Object[] admin_no = {pb.getADMIN_NO()};
    		String sql = getMessageSourceAccessor().getMessage("Querys.gapan.junggi.PriceApllySelect");
        	int returnNum = getJdbcTemplate().queryForInt(sql,admin_no);
    		//System.out.println(pb.getADMIN_NO()+":"+returnNum);
    		System.out.println("returnNum:"+returnNum);
    		//Object[] value = {pb.getADMIN_NO(), pb.getADMIN_NO()};
    		System.out.println("pb.getADMIN_NO():"+pb.getADMIN_NO());
    		if(returnNum>0){
    			Object[] value = {pb.getADMIN_NO(), pb.getADMIN_NO()};
    			objPriceApllyUpdateQuery3.update(value);
    			a++;
    		}else{
	    		Object[] value = {pb.getADMIN_NO()};
	    		objPriceApllyUpdateQuery2.update(value);
	    		b++;
    		}
    		
    	}
    	System.out.println("a:"+a);
    	System.out.println("b:"+b);
    	
    	
    	return true;
    }
    
    protected class PriceApllyUpdateQuery extends MappingSqlQuery {
        protected PriceApllyUpdateQuery(DataSource ds) {
      	super(ds, getMessageSourceAccessor().getMessage("Querys.gapan.junggi.PriceAplly"));

      		declareParameter(new SqlParameter(Types.VARCHAR));
      		declareParameter(new SqlParameter(Types.VARCHAR));
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
          protected Object mapRow(ResultSet rs, int rownum) throws SQLException {
	            	
            ProductBean objProductBean = new ProductBean();
          	 
            objProductBean.setADMIN_NO(rs.getString("GAPAN_NO"));     
             
            return objProductBean;
          }
      } 
    
    class PriceApllyUpdateQuery2 extends SqlUpdate {
		public PriceApllyUpdateQuery2(DataSource dataSource) {	        	
	//(ADMIN_NO, SEQ, YEAR, AREA, SUM_ADJUST,VAT,REDUCTION_RATE,SUM,USE_SECTION,REDUCTION_REASON) \
		super(dataSource, getMessageSourceAccessor().getMessage("Querys.gapan.junggi.PriceApllyUpdate"));
			
			declareParameter(new SqlParameter(Types.VARCHAR));	
			//declareParameter(new SqlParameter(Types.VARCHAR));
			
		}
	}
    
    class PriceApllyUpdateQuery3 extends SqlUpdate {
		public PriceApllyUpdateQuery3(DataSource dataSource) {	        	
	//(ADMIN_NO, SEQ, YEAR, AREA, SUM_ADJUST,VAT,REDUCTION_RATE,SUM,USE_SECTION,REDUCTION_REASON) \
		super(dataSource, getMessageSourceAccessor().getMessage("Querys.gapan.junggi.PriceApllyUpdate2"));
			
			declareParameter(new SqlParameter(Types.VARCHAR));	
			declareParameter(new SqlParameter(Types.VARCHAR));
			
		}
	}
    
	//정기분 조회 리스트    
    public List junggiSearchList(String sigu_cd, String year,String type,String tax_set,String tax_yn,String mul_fromdate,String mul_todate,String purpose,String bj_cd
    		,String jumyongName,String cal_status,int currentPage,int countPerPage, String gubun)
	{ 
    	String last_year = "";	// 전년도 검색 
    	if(year.equals("0") || year.equals("")) year = "%";
    	if( year != null && !"".equals(year) ){
    		last_year = String.valueOf(Integer.parseInt(year)-1);
    	}
    	else if( year.equals("0") || year.equals("")){
    		year = "%";
    		last_year = "%";
    	}
    	
    	if(type.equals("0") || type.equals("")) type = "%";
    	if(tax_set.equals("")) tax_set = "%";
    	if(tax_yn.equals("")) tax_yn="%";
    	
    	if("".equals(mul_fromdate)) mul_fromdate="%";
    	if("".equals(mul_todate)) mul_todate="%";
    	if(purpose.equals("000") || purpose.equals("")) purpose = "%";
    	if(bj_cd.equals("") || bj_cd.equals("00000")) bj_cd="%";
    	
    	jumyongName = "%"+jumyongName+"%";
    	
    	if("".equals(cal_status)) cal_status="%";
    	
    	Object[] values = { year, last_year, year,  sigu_cd, type, tax_set,  tax_yn,  mul_fromdate, mul_todate, purpose, bj_cd, jumyongName,cal_status, new Integer(currentPage),	new Integer(countPerPage) };
    	
    	
//    	for(int i = 0; i< values.length ; i++){
//    		System.out.println("junggiSearchList : : :" + values[i]+"::");
//    	}
    	
    	
    	if("AllCal".equals(gubun)){
    		System.out.println(" 구분 == " + gubun);
    		return objPeriodicalQuery_AllCal.execute(values);
    	}else{
    		return objPeriodicalQuery.execute(values);	
    	}
    	
	}
    
//  정기분 조회 리스트   카운트
    public int getJunggiSearchListCount(String sigu_cd, String year,String type,String tax_set,String tax_yn,String mul_fromdate,String mul_todate,String purpose,String bj_cd
    		,String jumyongName,String cal_status)
    { 
    	String last_year = "";	// 전년도 검색 
    	if(year.equals("0") || year.equals("")) year = "%";
    	if( year != null && !"".equals(year) ){
    		last_year = String.valueOf(Integer.parseInt(year)-1);
    	}
    	else if( year.equals("0") || year.equals("")){
    		year = "%";
    		last_year = "%";
    	}
    	
    	if(type.equals("0") || type.equals("")) type = "%";
    	if(tax_set.equals("")) tax_set = "%";
    	if(tax_yn.equals("")) tax_yn="%";
    	
    	if("".equals(mul_fromdate)) mul_fromdate="%";
    	if("".equals(mul_todate)) mul_todate="%";
    	if(purpose.equals("000") || purpose.equals("")) purpose = "%";
    	if(bj_cd.equals("") || bj_cd.equals("00000")) bj_cd="%";

    	jumyongName = "%"+jumyongName+"%";
    	
    	if("".equals(cal_status)) cal_status="%";
    	
    	Object[] values = { year, last_year, year,  sigu_cd, type, tax_set,  tax_yn,  mul_fromdate, mul_todate, purpose, bj_cd, jumyongName,cal_status };
    	
    	//for(int i = 0; i< values.length ; i++){
    	//	System.out.println("junggiSearchListCount : : :" + values[i]+"::");
    	//}
    	
    	String sql = getMessageSourceAccessor().getMessage("Querys.gapan.junggi.periodicalListCount");
    	int returnNum = getJdbcTemplate().queryForInt(sql,values);
    	return returnNum;
	}    
    
//  부과정보 리스트 
    public List impositionList(String adminNo,String strYear,int currentPage,int countPerPage,String use_section, String seq )
	{	
    	List list1 ;
    	
    	//system.out.println("use_section="+use_section);   
    	
    	if(use_section.equals("1"))
    	{	
    		Object[] values= { adminNo,strYear,new Integer(currentPage),new Integer(countPerPage),new Integer(countPerPage)};
    		list1 = objImpositionInfoListQuery.execute(values);
    		
    	}else 
    	{	
    		//system.out.println("seq="+seq);    		
    		Object[] values= { new Integer(seq)};
    		list1 = objImpositionInfoListQuery2.execute(values);
    	}
    	
    	return list1;    	
	}
    
//  부과정보 리스트 
    public List ImpositionInfoByCalSumList(String cal_sum_seq)
	{	
    	Object[] values= { cal_sum_seq };
    	List list1 = objImpositionInfoByCalSumListQuery.execute(values);    	
    	return list1;    	
	}
    
//  부과정보 리스트  카운트
    public int getProductListCount(String adminNo)
	{	
    	Object[] values = {adminNo};
    	String sql = getMessageSourceAccessor().getMessage("Querys.gapan.junggi.impositionInfoListCount");
    	int returnNum = getJdbcTemplate().queryForInt(sql,values);
    	return returnNum;
	}
    
//  부과정보 - 년도별 
    public ProductBean impositionInfo(String gapan_no,String seq)
	{	
    	Object[] values = {gapan_no, seq};
    	ProductBean pb = null;
    	
    	pb = (ProductBean) objImpositionInfoQuery.findObject(values);
    	
    	return pb;    	
	}
    


//  작년도 점용료 가져오기
    public Map getSum_LastYear(String adminNo,String strYear)
	{	
    	Object[] values = {adminNo,strYear};
    	String sql = getMessageSourceAccessor().getMessage("Querys.gapan.junggi.sum_lastyear");
    	Map returnNum = getJdbcTemplate().queryForMap(sql,values);
    	
    	//system.out.println("       "+adminNo+strYear+returnNum);
    	
		return returnNum;    	
	}
    

//  부과정보 리스트  카운트
    public int getProductSeq(String adminNo,String strYear)
	{	
    	Object[] values = {adminNo,strYear};
    	String sql = getMessageSourceAccessor().getMessage("Querys.gapan.junggi.getProductSeq");
    	int returnNum = getJdbcTemplate().queryForInt(sql,values);
    	return returnNum;
	}    
    
//  부과정보 가장 나중 입력된 YEAR
    public String getLastYear(String adminNo)
	{	
    	Object[] values = {adminNo};
    	String sql = getMessageSourceAccessor().getMessage("Querys.gapan.junggi.getLastYear");
    	Map returnYear = getJdbcTemplate().queryForMap(sql,values);
    	
		return returnYear.get("LASTYEAR").toString();    	
	}
    
//  부과 미부과 여부
    public String getTaxYn(String seq)
	{	
    	
    	Object[] values = {seq};
    	String sql = getMessageSourceAccessor().getMessage("Querys.gapan.junggi.getTaxYn");
    	Map taxYn = getJdbcTemplate().queryForMap(sql,values);    	
		return taxYn.get("TAX_YN").toString();    	
	}    
    
    //   부과정보 - 년도별 합계 
    public List impositionSumListByYear(String adminNo,int currentPage,int countPerPage)
	{	
    	Object[] values = { adminNo,adminNo,new Integer(currentPage),new Integer(countPerPage),new Integer(countPerPage)};
    	return objImpositionSumListByYearQuery.execute(values);    	
	}    
    
//  부과정보 - 년도별 합계 카운트
    public int getImpositionSumListByYearCount(String adminNo)
	{	
    	Object[] values = {adminNo};
    	String sql = getMessageSourceAccessor().getMessage("Querys.gapan.junggi.ImpositionSumListByYearCount");
    	int returnNum = getJdbcTemplate().queryForInt(sql,values);
    	return returnNum;
	}
    
//  부과정보 - 면적 합계-정기분 
    public int getProductAreaSum(String seq)
	{	
    	Object[] values = {new Integer(seq)};
    	String sql = getMessageSourceAccessor().getMessage("Querys.gapan.junggi.getProductAreaSum");
    	int returnNum = getJdbcTemplate().queryForInt(sql,values);
    	return returnNum;
	}    
    
//	정기분 선택 리스트		
    public List Productjunggi_addList(String admin_no, String year)
    {
    	
    	Object[] values = {admin_no,year,year,admin_no, String.valueOf(Integer.valueOf(year).intValue()+1) };
    	String sql = getMessageSourceAccessor().getMessage("Querys.jumyong.productjunggi_addList");
    	List returnList = objProductjunggi_addListQuery.execute(values);
    	return returnList;
    	
    }
    
//  산출_부과 테이블 SEQ 얻기
    public int getCal_tax_seq(String adminNo,String strYear)
	{	
    	Object[] values = {adminNo,strYear};
    	String sql = getMessageSourceAccessor().getMessage("Querys.gapan.junggi.getcal_tax_seq");
    	int returnNum = getJdbcTemplate().queryForInt(sql,values);    	
    	//system.out.println("       "+adminNo+strYear+returnNum);    	
		return returnNum;    	
	}
    
    
    
	 //    부과정보 - 년도별 합계 리스트 
    public List cal_sum_infoList(String adminNo,String year,int currentPage,int countPerPage)
	{		
    		Object[] values= { adminNo,year,new Integer(currentPage),new Integer(countPerPage)};
    		List list1 = objcal_sum_infoListQuery.execute(values);
    		
    	return list1;    	
	}    
		
	 //    부과정보 - 년도별 합계 리스트 카운트 
    public int getcal_sum_infoListCount(String adminNo, String year)
	{	
    	Object[] values = {adminNo, year};
    	String sql = getMessageSourceAccessor().getMessage("Querys.gapan.junggi.cal_sum_infoListCount");
    	int returnNum = getJdbcTemplate().queryForInt(sql,values);
		return returnNum;    	
	}
    
//	CAL_SUM_INFO 테이블 면적 추가 업데이트		 
    public int CalSumAddUpdate(ProductBean objProductBean)
    {	
    	
    	
    	//system.out.println("sum_adjust="+objProductBean.getSUM_ADJUST());
    	int i = 0;
		try{
			
			Object[] values = {		
					new Float(objProductBean.getAREA_AFTER())	
				,	new Integer(objProductBean.getSUM_ADJUST())
				,	new Integer(objProductBean.getSUM_ADJUST())
				,	new Integer(objProductBean.getSUM_ADJUST())
				,   objProductBean.getFORM_ADJUST()
				,	new Integer(objProductBean.getSEQ())
			};
			
			i = objCalSumAddUpdate.update(values);
			
			
		} catch (Exception e) {
			System.out.println(e.toString());
			e.printStackTrace();
		}		
		//objCalTaxInsert = new CalTaxInsert(getDataSource());
		return i;	
    }

//	CAL_SUM_INFO 감면정보 업데이트 
    public int CalSumReductionUpdate(ProductBean objProductBean)
    {	
    	
    	//system.out.println("aaa11aaa");
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
    
//	SUM_ADJUST, AREA_AFTER 합계 SUM_SEQ별
    public ProductBean SumBysumSeq(String seq)
	{	
    	Object[] values = {new Integer(seq)};
    	
    	ProductBean pb = (ProductBean)objSumBysumSeqQuery.execute(values).get(0);
    	
    	return pb;
	}    
	 
//	reduction정보
    public ProductBean GetReductionInfo(String seq)
    {
    	Object[] values = {new Integer(seq)};
    	ProductBean pb = (ProductBean)objGetReductionInfoQuery.execute(values).get(0);
    	return pb;
    }
    
    
    //    정기분 해당연도 같은 first_seq당 개수
    public int GetCountSameCal(String seq,String year)
	{	
    	Object[] values = {new Integer(seq),year};
    	String sql = getMessageSourceAccessor().getMessage("Querys.gapan.junggi.getCountSameCalculation");
    	int returnNum = getJdbcTemplate().queryForInt(sql,values);
		return returnNum;    	
	}
    
//	CalculationTempUpdateQuery
    public void CalculationTempInsert(ProductBean pb)
    {
    	
    	try
    	{
    	Object[]  values = {pb.getYEAR()
    			,pb.getFROMDATE()
    			,pb.getTODATE()
    			,pb.getUP_DATE()
    			,pb.getCAL_SUM_SEQ()
    			,pb.getADMIN_NO()
    			,String.valueOf(Integer.valueOf(pb.getYEAR()).intValue() - 1)
    	};
    	
    	objCalculationTempInsertQuery.update(values);
    	}catch(Exception err)
    	{
    		System.out.println(err.toString());
    	}
    }			
     
//  getCal_sum_seq
    public int GetCal_sum_seq(String admin_no,String year)
	{	
    	Object[] values = {admin_no,year};
    	String sql = getMessageSourceAccessor().getMessage("Querys.gapan.junggi.getCal_sum_seq");
    	int returnNum = getJdbcTemplate().queryForInt(sql,values);
		return returnNum;    	
	}
    
   
//  cal_sum_exist
    public int cal_sum_exist(String admin_no,String year)
	{	
    	Object[] values = {admin_no,year};
    	String sql = getMessageSourceAccessor().getMessage("Querys.gapan.junggi.cal_sum_exist");
    	int returnNum = getJdbcTemplate().queryForInt(sql,values);
		return returnNum;    	
	}
    
    
    
//  junggi getUseSection     
    public int getUseSection(String seq)
	{	
    	Object[] values = {seq};
    	String sql = getMessageSourceAccessor().getMessage("Querys.gapan.junggi.getUseSection");
    	int returnNum = getJdbcTemplate().queryForInt(sql,values);
		return returnNum;    	
	}
    
    //query/////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //정기분 조회 리스트
    protected class JunggiSearchListQuery extends MappingSqlQuery {
        protected JunggiSearchListQuery(DataSource ds) {
      	super(ds, getMessageSourceAccessor().getMessage("Querys.gapan.junggi.periodicalList"));
      	declareParameter(new SqlParameter(Types.VARCHAR)); 
      	declareParameter(new SqlParameter(Types.VARCHAR)); 
      	declareParameter(new SqlParameter(Types.VARCHAR)); 
      	declareParameter(new SqlParameter(Types.VARCHAR)); 
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
          protected Object mapRow(ResultSet rs, int rownum) throws SQLException {
            jumyongBean objJumyongBean = new jumyongBean();

            objJumyongBean.setR_ID(rs.getString("R_ID")); 
            objJumyongBean.setGAPAN_NO(rs.getString("GAPAN_NO")); 
            objJumyongBean.setGAPAN_NO2(rs.getString("GAPAN_NO2")); 
            objJumyongBean.setYEAR(rs.getString("YEAR")); 
            objJumyongBean.setTAX_NO(rs.getString("TAX_NO")); 
            objJumyongBean.setOWNER_NAME(rs.getString("OWNER_NAME")); 
            //objJumyongBean.setSIDO(rs.getString("SIDO")); 
            //objJumyongBean.setSIGUNGU(rs.getString("SIGUNGU")); 
            objJumyongBean.setBJ_CD(rs.getString("BJ_CD")); 
            objJumyongBean.setBONBUN(rs.getString("BONBUN")); 
            objJumyongBean.setBUBUN(rs.getString("BUBUN")); 
            objJumyongBean.setSPC_CD(rs.getString("SPC_CD")); 
            objJumyongBean.setAREA_AFTER_FLOAT(rs.getFloat("AREA_AFTER")); 
            objJumyongBean.setPURPOSE_CD(rs.getString("PURPOSE_CD")); 
            objJumyongBean.setCLASS_NM(rs.getString("CLASS_NM")); 
            objJumyongBean.setSORT_NM(rs.getString("SORT_NM")); 
            objJumyongBean.setSUM_ADJUST(rs.getString("SUM_ADJUST")); 
            objJumyongBean.setLAST_FROMDATE(rs.getString("LAST_FROMDATE")); 
            objJumyongBean.setLAST_TODATE(rs.getString("LAST_TODATE")); 
            objJumyongBean.setFROMDATE(rs.getString("FROMDATE")); 
            objJumyongBean.setTODATE(rs.getString("TODATE")); 
            objJumyongBean.setRATE(rs.getString("RATE")); 
            objJumyongBean.setPRICE(rs.getString("PRICE")); 
            objJumyongBean.setTAX_YN(rs.getString("TAX_YN")); 
            objJumyongBean.setGP_TYP(rs.getString("GP_TYP")); 
            objJumyongBean.setSUM_LASTYEAR(rs.getString("SUM_LASTYEAR")); 
            objJumyongBean.setFT_TYP(rs.getString("FT_TYP")); 
            objJumyongBean.setNAME(rs.getString("NAME")); 
            objJumyongBean.setWITH_ADDR(rs.getString("WITH_ADDR")); 
            objJumyongBean.setAREA(rs.getString("AREA"));
            objJumyongBean.setAREA_AFTER_FLOAT(rs.getFloat("AREA_AFTER"));
            objJumyongBean.setSEQ(rs.getString("SEQ")); 
            objJumyongBean.setCAL_SUM_SEQ(rs.getString("CAL_SUM_SEQ"));
            
            objJumyongBean.setSIDO(rs.getString("SI_NM"));
            objJumyongBean.setSIGUNGU(rs.getString("GU_NM"));
            objJumyongBean.setBJ_NM(rs.getString("BJ_NM"));
            
            return objJumyongBean;
          }
      } 
    
      // 부과정보 리스트
      protected class ImpositionInfoListQuery extends MappingSqlQuery {
          protected ImpositionInfoListQuery(DataSource ds) {
        	super(ds, getMessageSourceAccessor().getMessage("Querys.gapan.junggi.impositionInfoList"));
  	      	declareParameter(new SqlParameter(Types.VARCHAR));  
  	      	declareParameter(new SqlParameter(Types.VARCHAR));
  	      	declareParameter(new SqlParameter(Types.INTEGER));
	    	declareParameter(new SqlParameter(Types.INTEGER));
	    	declareParameter(new SqlParameter(Types.INTEGER)); 
          }
            protected Object mapRow(ResultSet rs, int rownum) throws SQLException {
             
              ProductBean objProductBean = new ProductBean();
              
              objProductBean.setYEAR(rs.getString("YEAR"));
              objProductBean.setPRICE(rs.getString("PRICE"));
              objProductBean.setAREA_AFTER(rs.getString("AREA_AFTER"));
              objProductBean.setRATE(rs.getString("RATE"));
              objProductBean.setFROMDATE(rs.getString("FROMDATE"));
              objProductBean.setTODATE(rs.getString("TODATE"));
              objProductBean.setSUM_LASTYEAR(rs.getString("SUM_LASTYEAR"));
              objProductBean.setSUM_YEAR(rs.getString("SUM_YEAR"));            
              objProductBean.setSUM_ADJUST(rs.getString("SUM_ADJUST"));
              objProductBean.setFORM(rs.getString("FORM"));
              objProductBean.setFORM_ADJUST(rs.getString("FORM_ADJUST"));
              objProductBean.setPERIOD(rs.getString("PERIOD"));
              objProductBean.setSEQ(rs.getString("CSEQ"));
              objProductBean.setUSE_SECTION(rs.getString("USE_SECTION"));
              
             
              return objProductBean;
            }
        } 
      
      
//    부과정보 리스트
      protected class ImpositionInfoByCalSumListQuery extends MappingSqlQuery {
          protected ImpositionInfoByCalSumListQuery(DataSource ds) {
        	super(ds, getMessageSourceAccessor().getMessage("Querys.gapan.junggi.impositionInfoByCalSumList"));  	      	  
  	      	declareParameter(new SqlParameter(Types.VARCHAR));
          }
            protected Object mapRow(ResultSet rs, int rownum) throws SQLException {
             
              ProductBean objProductBean = new ProductBean();
              
              objProductBean.setYEAR(rs.getString("YEAR"));
              objProductBean.setPRICE(rs.getString("PRICE"));
              objProductBean.setAREA_AFTER(rs.getString("AREA_AFTER"));
              objProductBean.setRATE(rs.getString("RATE"));
              objProductBean.setFROMDATE(rs.getString("FROMDATE"));
              objProductBean.setTODATE(rs.getString("TODATE"));
              objProductBean.setSUM_LASTYEAR(rs.getString("SUM_LASTYEAR"));
              objProductBean.setSUM_YEAR(rs.getString("SUM_YEAR"));            
              objProductBean.setSUM_ADJUST(rs.getString("SUM_ADJUST"));
              objProductBean.setFORM(rs.getString("FORM"));
              objProductBean.setFORM_ADJUST(rs.getString("FORM_ADJUST"));
              objProductBean.setPERIOD(rs.getString("PERIOD"));
              objProductBean.setSEQ(rs.getString("CSEQ"));
              objProductBean.setUSE_SECTION(rs.getString("USE_SECTION"));
             
              return objProductBean;
            }
        }       
      
//    부과정보 리스트 - 수시
      protected class ImpositionInfoListQuery2 extends MappingSqlQuery {
          protected ImpositionInfoListQuery2(DataSource ds) {
        	super(ds, getMessageSourceAccessor().getMessage("Querys.gapan.junggi.impositionInfoList2"));  	      	
	    	declareParameter(new SqlParameter(Types.INTEGER)); 
          }
            protected Object mapRow(ResultSet rs, int rownum) throws SQLException {
             
              ProductBean objProductBean = new ProductBean();
              
              objProductBean.setYEAR(rs.getString("YEAR"));
              objProductBean.setPRICE(rs.getString("PRICE"));
              objProductBean.setAREA_AFTER(rs.getString("AREA_AFTER"));
              objProductBean.setRATE(rs.getString("RATE"));
              objProductBean.setFROMDATE(rs.getString("FROMDATE"));
              objProductBean.setTODATE(rs.getString("TODATE"));
              objProductBean.setSUM_LASTYEAR(rs.getString("SUM_LASTYEAR"));
              objProductBean.setSUM_YEAR(rs.getString("SUM_YEAR"));            
              objProductBean.setSUM_ADJUST(rs.getString("SUM_ADJUST"));
              objProductBean.setFORM(rs.getString("FORM"));
              objProductBean.setFORM_ADJUST(rs.getString("FORM_ADJUST"));
              objProductBean.setPERIOD(rs.getString("PERIOD"));
              objProductBean.setSEQ(rs.getString("CSEQ"));
              objProductBean.setUSE_SECTION(rs.getString("USE_SECTION"));
             
              return objProductBean;
            }
        }       
    
     
      
      
      // 부과정보 연도별 정보
      protected class ImpositionInfoQuery extends MappingSqlQuery {
          protected ImpositionInfoQuery(DataSource ds) {
        	super(ds, getMessageSourceAccessor().getMessage("Querys.gapan.junggi.impositionInfo"));
        	
        	declareParameter(new SqlParameter(Types.VARCHAR));
  	      	declareParameter(new SqlParameter(Types.VARCHAR));
          }
            protected Object mapRow(ResultSet rs, int rownum) throws SQLException {
          	
              
              ProductBean objProductBean = new ProductBean();
              
              objProductBean.setYEAR(rs.getString("YEAR"));
              objProductBean.setPRICE(rs.getString("PRICE"));
              objProductBean.setAREA_AFTER(rs.getString("AREA_AFTER"));
              objProductBean.setRATE(rs.getString("RATE"));
              objProductBean.setFROMDATE(rs.getString("FROMDATE"));
              objProductBean.setTODATE(rs.getString("TODATE"));
              objProductBean.setSUM_LASTYEAR(rs.getString("SUM_LASTYEAR"));
              objProductBean.setSUM_YEAR(rs.getString("SUM_YEAR"));            
              objProductBean.setSUM_ADJUST(rs.getString("SUM_ADJUST"));
              objProductBean.setFORM(rs.getString("FORM"));
              objProductBean.setFORM_ADJUST(rs.getString("FORM_ADJUST"));              
              objProductBean.setPERIOD(rs.getString("PERIOD"));
              objProductBean.setSEQ(rs.getString("SEQ"));
              objProductBean.setADJUSTMENT(rs.getString("ADJUSTMENT"));
              objProductBean.setFIRST_SEQ(rs.getString("FIRST_SEQ"));
              objProductBean.setUSE_SECTION(rs.getString("USE_SECTION"));
              objProductBean.setUSE_SECTIONNAME(rs.getString("NAME"));
              objProductBean.setTAX_DATE(rs.getString("TAX_DATE"));
              objProductBean.setINDATE(rs.getString("INDATE"));
              objProductBean.setOVERDATE(rs.getString("OVERDATE"));
              objProductBean.setOVERTAX(rs.getString("OVERTAX"));
              
              // 2009 추가 start
              objProductBean.setTAX_DATE(rs.getString("TAX_DATE"));
              objProductBean.setINDATE(rs.getString("INDATE"));
              objProductBean.setOVERDATE(rs.getString("OVERDATE"));
              objProductBean.setOVERTAX(rs.getString("OVERTAX"));
              objProductBean.setVAT(rs.getString("VAT"));
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
              objProductBean.setMAX_TAX_NO(rs.getString("MAX_TAX_NO"));
              objProductBean.setCAL_SUM_SEQ(rs.getString("CAL_SUM_SEQ"));
              objProductBean.setTAX_YN(rs.getString("TAX_YN"));
              objProductBean.setLIVE(rs.getString("LIVE"));
              objProductBean.setREDUCTION_RATE(rs.getString("REDUCTION_RATE"));
              objProductBean.setSURCHARGE_RATE(rs.getString("SURCHARGE_RATE"));
              objProductBean.setADD_SET(rs.getString("ADD_SET"));
              objProductBean.setADD_YN (rs.getString("ADD_YN"));
              objProductBean.setSUBUSEO_CD(rs.getString("SUBUSEO_CD"));
              objProductBean.setGP_TYP(rs.getString("GP_TYP"));
              objProductBean.setPLACE_A(rs.getString("PLACE_A"));
              objProductBean.setREDUCTION_REASON(rs.getString("REDUCTION_REASON"));
              objProductBean.setOLD_TAX_GUBUN(rs.getString("OLD_TAX_GUBUN"));
              
              return objProductBean;
            }
        } 
      
     
      	// 부과정보 - 년도별 합계 리스트
		 protected class cal_sum_infoListQuery extends MappingSqlQuery {
	          protected cal_sum_infoListQuery(DataSource ds) {
	        	super(ds, getMessageSourceAccessor().getMessage("Querys.gapan.junggi.cal_sum_infoList"));
	        	declareParameter(new SqlParameter(Types.VARCHAR));
	        	declareParameter(new SqlParameter(Types.VARCHAR));
		    	declareParameter(new SqlParameter(Types.INTEGER));
		    	declareParameter(new SqlParameter(Types.INTEGER)); 
	          }
	            protected Object mapRow(ResultSet rs, int rownum) throws SQLException {
	            	
	              ProductBean objProductBean = new ProductBean();
	            	 
	              objProductBean.setGAPAN_NO(rs.getString("GAPAN_NO"));      
	              objProductBean.setSEQ(rs.getString("SEQ"));
	              objProductBean.setYEAR(rs.getString("YEAR"));
	              objProductBean.setAREA(rs.getString("AREA"));
	              objProductBean.setSUM_ADJUST(rs.getString("SUM_ADJUST"));
	              objProductBean.setSUM(rs.getString("SUM"));
	              objProductBean.setUSE_SECTION(rs.getString("USE_SECTION"));	              
	              objProductBean.setUSE_SECTIONNAME(rs.getString("USE_SECTIONNAME"));
	              objProductBean.setREDUCTION_RATE(rs.getString("REDUCTION_RATE"));
	              objProductBean.setREDUCTION_REASON(rs.getString("REDUCTION_REASON"));
	              objProductBean.setTAX_SET_NAME(rs.getString("TAX_SET_NAME"));
	               
	              return objProductBean;
	            }
	        } 
      
      	 //    부과정보 - 년도별 합계 리스트
		 protected class ImpositionSumListByYearQuery extends MappingSqlQuery {
	          protected ImpositionSumListByYearQuery(DataSource ds) {
	        	super(ds, getMessageSourceAccessor().getMessage("Querys.gapan.junggi.ImpositionSumListByYear"));
	        	declareParameter(new SqlParameter(Types.VARCHAR));  
	        	declareParameter(new SqlParameter(Types.VARCHAR));
	  	      	declareParameter(new SqlParameter(Types.INTEGER));
		    	declareParameter(new SqlParameter(Types.INTEGER));
		    	declareParameter(new SqlParameter(Types.INTEGER)); 
	          }
	            protected Object mapRow(ResultSet rs, int rownum) throws SQLException {
	            	
	              ProductBean objProductBean = new ProductBean();
	            	 
	              objProductBean.setADMIN_NO(rs.getString("ADMIN_NO"));                  
	              objProductBean.setYEAR(rs.getString("YEAR"));
	              objProductBean.setSUM_LASTYEAR(rs.getString("SUM_LASTYEAR"));
	              objProductBean.setSUM_YEAR(rs.getString("SUM_YEAR"));            
	              objProductBean.setSUM_ADJUST(rs.getString("SUM_ADJUST"));
	              objProductBean.setAREA_AFTER(rs.getString("AREA_AFTER"));
	              objProductBean.setUSE_SECTIONNAME(rs.getString("USE_SECTIONNAME"));
	              objProductBean.setUSE_SECTION(rs.getString("USE_SECTION"));
	              objProductBean.setSEQ(rs.getString("SEQ"));
	              
	              return objProductBean;
	            }
	        } 
		 
//		 SELECT C.SEQ,C.FIRST_SEQ,A.YEAR,C.CAL_YEAR,C.AREA_AFTER,C.SUM_ADJUST,C.USE_SECTION, R1.NAME \	
//			정기분 선택 리스트					
		 protected class Productjunggi_addListQuery extends MappingSqlQuery {
	          protected Productjunggi_addListQuery(DataSource ds) {
	        	super(ds, getMessageSourceAccessor().getMessage("Querys.jumyong.productjunggi_addList"));
	        	declareParameter(new SqlParameter(Types.VARCHAR));  
	        	declareParameter(new SqlParameter(Types.VARCHAR));	  	      
	        	declareParameter(new SqlParameter(Types.VARCHAR));
	        	declareParameter(new SqlParameter(Types.VARCHAR));
	        	declareParameter(new SqlParameter(Types.VARCHAR));
	          }
	            protected Object mapRow(ResultSet rs, int rownum) throws SQLException {
	            	
	              ProductBean objProductBean = new ProductBean();
	              
	              objProductBean.setSEQ(rs.getString("SEQ"));
	              objProductBean.setYEAR(rs.getString("YEAR"));
	              objProductBean.setFIRST_SEQ(rs.getString("FIRST_SEQ"));
	              objProductBean.setCAL_YEAR(rs.getString("CAL_YEAR"));
	              objProductBean.setAREA_AFTER(rs.getString("AREA_AFTER"));
	              objProductBean.setSUM_ADJUST(rs.getString("SUM_ADJUST"));
	              objProductBean.setUSE_SECTION(rs.getString("USE_SECTION"));
	              objProductBean.setUSE_SECTIONNAME(rs.getString("NAME"));
	              objProductBean.setCAL_YN(rs.getString("CAL_YN"));
	              return objProductBean;
	            }
	        }
	
//		CAL_SUM_INFO 테이블 면적 추가 업데이트		 
///////////////////////////////////////////////산출물 부과
	//산출물 입력
	class CalSumAddUpdate extends SqlUpdate {
		public CalSumAddUpdate(DataSource dataSource) {	        	
	
		super(dataSource, getMessageSourceAccessor().getMessage("Querys.gapan.junggi.cal_sum_addUpdate"));
			declareParameter(new SqlParameter(Types.FLOAT));	//area
			declareParameter(new SqlParameter(Types.INTEGER));	//sum_adjust
			declareParameter(new SqlParameter(Types.INTEGER));	//vat
			declareParameter(new SqlParameter(Types.INTEGER));	//sum_adjust
			declareParameter(new SqlParameter(Types.VARCHAR));	//FORM_ADJUST
			declareParameter(new SqlParameter(Types.INTEGER));	//seq
		}
	}
	
//	CAL_SUM_INFO 테이블 면적 추가 업데이트		 
//UPDATE CAL_SUM_INFO SET REDUCTION_RATE = ? , REDUCTION_REASON = ? , SUM = TRUNC(SUM_ADJUST * (100-?)/10000,0)*100 \
//	, VAT = TRUNC(SUM_ADJUST * (100-?)/10000,0)*10 \	WHERE SEQ = ?	
///////////////////////////////////////////////산출물 부과

	// 감면율, 감면사유 update
	class CalSumReductionUpdate extends SqlUpdate {
		public CalSumReductionUpdate(DataSource dataSource) {	        	
			
			super(dataSource, getMessageSourceAccessor().getMessage("Querys.gapan.junggi.cal_sum_reductionUpdate"));
			declareParameter(new SqlParameter(Types.INTEGER));	//REDUCTION_RATE
			declareParameter(new SqlParameter(Types.VARCHAR));	//REDUCTION_REASON
			declareParameter(new SqlParameter(Types.INTEGER));	//REDUCTION_RATE
			declareParameter(new SqlParameter(Types.INTEGER));	//REDUCTION_RATE
			declareParameter(new SqlParameter(Types.INTEGER));	//seq
		}
	}		
			 

	//	SUM_ADJUST, AREA_AFTER 합계 SUM_SEQ별				
	protected class SumBysumSeqQuery extends MappingSqlQuery {
		protected SumBysumSeqQuery(DataSource ds) {
			super(ds, getMessageSourceAccessor().getMessage("Querys.gapan.junggi.getSumBysumseq"));
				declareParameter(new SqlParameter(Types.VARCHAR));
		}
        protected Object mapRow(ResultSet rs, int rownum) throws SQLException {
        	
        	ProductBean objProductBean = new ProductBean();
          
        	objProductBean.setAREA_AFTER(rs.getString("AREA_AFTER"));
        	objProductBean.setSUM_ADJUST(rs.getString("SUM_ADJUST"));
          
        	return objProductBean;
        }
    }
 
 //	SUM_ADJUST, AREA_AFTER 합계 SUM_SEQ별				
	protected class GetReductionInfoQuery extends MappingSqlQuery {
      protected GetReductionInfoQuery(DataSource ds) {
    	super(ds, getMessageSourceAccessor().getMessage("Querys.gapan.junggi.getReduction"));
    	declareParameter(new SqlParameter(Types.INTEGER));	//seq
      }
        protected Object mapRow(ResultSet rs, int rownum) throws SQLException {
        	
          ProductBean objProductBean = new ProductBean();
          
          objProductBean.setREDUCTION_RATE(rs.getString("REDUCTION_RATE"));
          objProductBean.setREDUCTION_REASON(rs.getString("REDUCTION_REASON"));
          objProductBean.setSEQ(rs.getString("SEQ"));
          objProductBean.setYEAR(rs.getString("YEAR"));
          
          return objProductBean;
        }
    }
 
 

//(year fromdate todate update cal_sum_seq admin_no) \
	class CalculationTempInsertQuery extends SqlUpdate {
		public CalculationTempInsertQuery(DataSource dataSource) {	        	
			super(dataSource, getMessageSourceAccessor().getMessage("Querys.gapan.junggi.junggiCalculationTempInsert"));
		        declareParameter(new SqlParameter(Types.VARCHAR));	//YEAR
		   		declareParameter(new SqlParameter(Types.VARCHAR));	//FROMDATE
		   		declareParameter(new SqlParameter(Types.VARCHAR));	//TODATE
		   		declareParameter(new SqlParameter(Types.VARCHAR));	//UP_DATE
		   		declareParameter(new SqlParameter(Types.INTEGER));	//CAL_SUM_SEQ
		   		declareParameter(new SqlParameter(Types.VARCHAR));	//ADMIN_NO
		   		declareParameter(new SqlParameter(Types.VARCHAR));	//YEAR - 1
		}
	}   
 
 
	//2009.8.7 추가 taxation_info insert
	//	부과정보 입력
	public	boolean	executeBugwa_Register(ProductBean Bean)
	{
	
		try
		{
			Object[] values = {
					Bean.getGAPAN_NO(),
					Bean.getTAX_NO(),
					Bean.getTAX_GUBUN(),
					Bean.getTAX_YM(),
					Bean.getTAX_CD(),
					
					Bean.getSIGU_CD(),
					Bean.getDEPT_CD(),
					Bean.getTAXPAYER_SET(),
					Bean.getLIVE(),
					Bean.getOBJ_SET(),
					
					Bean.getBONSE(),
					Bean.getVAT(),
					Bean.getTAX_DATE(),
					Bean.getINTAX(),
					Bean.getINDATE(),
					
					Bean.getOVERTAX(),
					Bean.getOVERDATE(),
					Bean.getADD_SET(),
					Bean.getADD_YN(),
					Bean.getNOTES(),
					
					Bean.getLIMIT_SUM(),
					Bean.getLIMIT_CNT(),
					new Float(Bean.getRATE()),
					Bean.getRATE_CAUSE(),
					Bean.getYEAR(),
					
					Bean.getSEQ(),
					Bean.getSISE(),
					Bean.getGIGUM(),
					Bean.getGUKSE(),
					Bean.getGUSE(),
					
					Bean.getSUBUSEO_CD(),
					Bean.getOCR_SIGU_CD(),
					Bean.getOCR_BUSEO_CD(),
					Bean.getFORM1(),
					Bean.getFORM2(),
					
					Bean.getBJ_CD()
				};
			/*System.out.println("Bean.getGAPAN_NO(),     ====  " + Bean.getGAPAN_NO());
			System.out.println("Bean.getTAX_NO(),       ====  " + Bean.getTAX_NO());
			System.out.println("Bean.getTAX_GUBUN(),    ====  " + Bean.getTAX_GUBUN());
			System.out.println("Bean.getTAX_YM(),       ====  " + Bean.getTAX_YM());
			System.out.println("Bean.getTAX_CD(),       ====  " + Bean.getTAX_CD());
			System.out.println("Bean.getSIGU_CD(),      ====  " + Bean.getSIGU_CD());
			System.out.println("Bean.getDEPT_CD(),      ====  " + Bean.getDEPT_CD());
			System.out.println("Bean.getTAXPAYER_SET(), ====  " + Bean.getTAXPAYER_SET());
			System.out.println("Bean.getLIVE(),         ====  " + Bean.getLIVE());
			System.out.println("Bean.getOBJ_SET(),      ====  " + Bean.getOBJ_SET());
			System.out.println("Bean.getBONSE(),        ====  " + Bean.getBONSE());
			System.out.println("Bean.getVAT(),          ====  " + Bean.getVAT());
			System.out.println("Bean.getTAX_DATE(),     ====  " + Bean.getTAX_DATE());
			System.out.println("Bean.getINTAX(),        ====  " + Bean.getINTAX());
			System.out.println("Bean.getINDATE(),       ====  " + Bean.getINDATE());
			System.out.println("Bean.getOVERTAX(),      ====  " + Bean.getOVERTAX());
			System.out.println("Bean.getOVERDATE(),     ====  " + Bean.getOVERDATE());
			System.out.println("Bean.getADD_SET(),      ====  " + Bean.getADD_SET());
			System.out.println("Bean.getADD_YN(),       ====  " + Bean.getADD_YN());
			System.out.println("Bean.getNOTES(),        ====  " + Bean.getNOTES());
			System.out.println("Bean.getLIMIT_SUM(),    ====  " + Bean.getLIMIT_SUM());
			System.out.println("Bean.getLIMIT_CNT(),    ====  " + Bean.getLIMIT_CNT() );
			System.out.println("new Float(Bean.getRATE()====  " + new Float(Bean.getRATE()));
			System.out.println("Bean.getRATE_CAUSE(),   ====  " + Bean.getRATE_CAUSE());
			System.out.println("Bean.getYEAR(),         ====  " + Bean.getYEAR());
			System.out.println("Bean.getSEQ(),          ====  " + Bean.getSEQ());
			System.out.println("Bean.getSISE(),         ====  " + Bean.getSISE());
			System.out.println("Bean.getGIGUM(),        ====  " + Bean.getGIGUM());
			System.out.println("Bean.getGUKSE(),        ====  " + Bean.getGUKSE());
			System.out.println("Bean.getGUSE(),         ====  " + Bean.getGUSE());
			System.out.println("Bean.getSUBUSEO_CD(),   ====  " + Bean.getSUBUSEO_CD());
			System.out.println("Bean.getOCR_SIGU_CD(),  ====  " + Bean.getOCR_SIGU_CD());
			System.out.println("Bean.getOCR_BUSEO_CD(), ====  " + Bean.getOCR_BUSEO_CD());
			System.out.println("Bean.getFORM1(),        ====  " + Bean.getFORM1());
			System.out.println("Bean.getFORM2()         ====  " + Bean.getFORM2());
			System.out.println("Bean.getBJ_CD()         ====  " + Bean.getBJ_CD());
			*/
			//System.out.println(getMessageSourceAccessor().getMessage("Querys.gapan.junggi.Bugwa_Register"));
	    	
	    	
	    	objExecuteBugwa_Register.update(values);
		}
		catch (Exception e)
		{
			e.printStackTrace();
			return	false;
		}
		
		return	true;
	}

	public class ExecuteBugwa_Register extends SqlUpdate {
		public ExecuteBugwa_Register(DataSource dataSource)  throws SQLException{	        	
			super(dataSource, getMessageSourceAccessor().getMessage("Querys.gapan.junggi.Bugwa_Register"));
	     	
				declareParameter(new SqlParameter(Types.VARCHAR));
				declareParameter(new SqlParameter(Types.VARCHAR));
				declareParameter(new SqlParameter(Types.VARCHAR));
				declareParameter(new SqlParameter(Types.VARCHAR));
				declareParameter(new SqlParameter(Types.VARCHAR));
 
				declareParameter(new SqlParameter(Types.VARCHAR));
				declareParameter(new SqlParameter(Types.VARCHAR));
				declareParameter(new SqlParameter(Types.VARCHAR));
				declareParameter(new SqlParameter(Types.VARCHAR));
				declareParameter(new SqlParameter(Types.VARCHAR));

				declareParameter(new SqlParameter(Types.VARCHAR));
				declareParameter(new SqlParameter(Types.VARCHAR));
				declareParameter(new SqlParameter(Types.VARCHAR));
				declareParameter(new SqlParameter(Types.VARCHAR));
				declareParameter(new SqlParameter(Types.VARCHAR));
 
				declareParameter(new SqlParameter(Types.VARCHAR));
				declareParameter(new SqlParameter(Types.VARCHAR));
				declareParameter(new SqlParameter(Types.VARCHAR));
				declareParameter(new SqlParameter(Types.VARCHAR));
				declareParameter(new SqlParameter(Types.VARCHAR));
 
				declareParameter(new SqlParameter(Types.VARCHAR));
				declareParameter(new SqlParameter(Types.VARCHAR));
				declareParameter(new SqlParameter(Types.VARCHAR));
				declareParameter(new SqlParameter(Types.VARCHAR));
				declareParameter(new SqlParameter(Types.VARCHAR));
 
				declareParameter(new SqlParameter(Types.VARCHAR));
				declareParameter(new SqlParameter(Types.VARCHAR));
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
	
	
	// GAPAN_CALCULATION_INFO 입력
	public	boolean	insertProduct(ProductBean objProductBean)
	{
	
		try{
			if(objProductBean.getFROMDATE() == null ||objProductBean.getFROMDATE().equals(""))
				objProductBean.setFROMDATE(" ");
			
			if(objProductBean.getTODATE() == null ||objProductBean.getTODATE().equals(""))
				objProductBean.setTODATE(" ");
			
			if(objProductBean.getPREV_SEQ() == null ||objProductBean.getPREV_SEQ().equals(""))
				objProductBean.setPREV_SEQ("0");
			
			int i ;
			
			if(objProductBean.getPREV_SEQ() == null ||objProductBean.getPREV_SEQ().equals(""))
				objProductBean.setCAL_STATUS("2");	//1. 산출전 2. 산출후
			
			/*System.out.println( "objProductBean.getGAPAN_NO()                      == "  + objProductBean.getGAPAN_NO());
			System.out.println( "objProductBean.getYEAR()                          == "  + objProductBean.getYEAR());
			System.out.println( "new Integer(objProductBean.getPRICE())            == "  + new Integer(objProductBean.getPRICE()));
			System.out.println( "objProductBean.getFROMDATE()                      == "  + objProductBean.getFROMDATE());
			System.out.println( "objProductBean.getTODATE()                        == "  + objProductBean.getTODATE());
			System.out.println( "new Float(objProductBean.getAREA_AFTER())         == "  + new Float(objProductBean.getAREA_AFTER()));
			System.out.println( "new Float(objProductBean.getAREA_AFTER())         == "  + new Float(objProductBean.getAREA_AFTER()));
			System.out.println( "new Float(objProductBean.getRATE())               == "  + new Float(objProductBean.getRATE()));
			System.out.println( "new Integer(objProductBean.getSUM_LASTYEAR())     == "  + new Integer(objProductBean.getSUM_LASTYEAR()));
			System.out.println( "new Integer(objProductBean.getSUM_YEAR())         == "  + new Integer(objProductBean.getSUM_YEAR()));
			System.out.println( "new Integer(objProductBean.getSUM_ADJUST())	   == "  + new Integer(objProductBean.getSUM_ADJUST()));					
			System.out.println( "objProductBean.getFORM_ADJUST()                   == "  + objProductBean.getFORM_ADJUST());
			System.out.println( "objProductBean.getFORM(),                         == "  + objProductBean.getFORM()); 
			System.out.println( "new Integer(objProductBean.getLICENSE_TAX())      == "  + new Integer(objProductBean.getLICENSE_TAX()));
			System.out.println( "new Integer(objProductBean.getPERIOD())           == "  + new Integer(objProductBean.getPERIOD()));
			System.out.println( "new Integer(vat)                                  == "  + new Integer(vat));
			System.out.println( "new Float(objProductBean.getADJUSTMENT())         == "  + new Float(objProductBean.getADJUSTMENT()));
			System.out.println( "new Integer(objProductBean.getREDUCTION_RATE())   == "  + new Integer(objProductBean.getREDUCTION_RATE()));
			System.out.println( "objProductBean.getREDUCTION_REASON()              == "  + objProductBean.getREDUCTION_REASON());
			System.out.println( "new Float(objProductBean.getSURCHARGE_RATE())     == "  + new Float(objProductBean.getSURCHARGE_RATE()));
			System.out.println( "objProductBean.getUSE_SECTION() //2수시(USE_SEC   == "  + objProductBean.getUSE_SECTION());
			System.out.println( "new Integer(objProductBean.getCAL_SUM_SEQ())      == "  + new Integer(objProductBean.getCAL_SUM_SEQ()));
			System.out.println( "new Integer(objProductBean.getPREV_SEQ())         == "  + new Integer(objProductBean.getPREV_SEQ()));
			System.out.println( "objProductBean.getUP_DATE()                       == "  + objProductBean.getUP_DATE());
			*/
			if(objProductBean.getFIRST_SEQ().equals(""))
			{
				Object[] values = {		
						objProductBean.getGAPAN_NO()
						, objProductBean.getYEAR()
						, new Integer(objProductBean.getPRICE())
						, objProductBean.getFROMDATE()
						, objProductBean.getTODATE()
						, new Float(objProductBean.getAREA_AFTER())
						, new Float(objProductBean.getAREA_AFTER())
						, new Float(objProductBean.getRATE())
						, new Integer(objProductBean.getSUM_LASTYEAR())
						, new Integer(objProductBean.getSUM_YEAR())
						, new Integer(objProductBean.getSUM_ADJUST())					
						, objProductBean.getFORM_ADJUST()
						, objProductBean.getFORM(), new Integer(objProductBean.getLICENSE_TAX())
						, new Integer(objProductBean.getPERIOD())
						, new Integer(objProductBean.getVAT())
						, new Float(objProductBean.getADJUSTMENT())
						, new Integer(objProductBean.getREDUCTION_RATE())
					    , objProductBean.getREDUCTION_REASON()
					    , new Float(objProductBean.getSURCHARGE_RATE())
					    , objProductBean.getUSE_SECTION() //2수시(USE_SECTION)/1계속
					    , new Integer(objProductBean.getCAL_SUM_SEQ())
					    , new Integer(objProductBean.getPREV_SEQ())
					    , objProductBean.getUP_DATE()
					    , objProductBean.getGP_TYP()					    
				};
			
				i = objInsertProduct2.update(values);
			}
			else
			{
				
				Object[] values = {		
						objProductBean.getGAPAN_NO()
						, objProductBean.getYEAR()
						, new Integer(objProductBean.getPRICE())
						, objProductBean.getFROMDATE()
						, objProductBean.getTODATE()
						, new Float(objProductBean.getAREA_AFTER())
						, new Float(objProductBean.getAREA_AFTER())
						, new Float(objProductBean.getRATE())
						, new Integer(objProductBean.getSUM_LASTYEAR())
						, new Integer(objProductBean.getSUM_YEAR())
						, new Integer(objProductBean.getSUM_ADJUST())					
						, objProductBean.getFORM_ADJUST()
						, objProductBean.getFORM(), new Integer(objProductBean.getLICENSE_TAX())
						, new Integer(objProductBean.getPERIOD())
						, new Integer(objProductBean.getVAT())
						, new Float(objProductBean.getADJUSTMENT())
						, new Integer(objProductBean.getREDUCTION_RATE())
					    , objProductBean.getREDUCTION_REASON()
					    , new Float(objProductBean.getSURCHARGE_RATE())
					    , objProductBean.getUSE_SECTION() //2수시(USE_SECTION)/1계속
					    , new Integer(objProductBean.getFIRST_SEQ())
					    , new Integer(objProductBean.getCAL_SUM_SEQ())
					    , new Integer(objProductBean.getPREV_SEQ())
					    , objProductBean.getUP_DATE()
					    , objProductBean.getGP_TYP()
					    
				};
				i = objInsertProduct.update(values);
			}
		} catch (Exception e) {
			System.out.println(e.toString());
			e.printStackTrace();
		}		
		return true;
	}

	public class InsertProduct extends SqlUpdate {
		public InsertProduct(DataSource dataSource)  throws SQLException{	        	
			 
			super(dataSource, getMessageSourceAccessor().getMessage("Querys.gapan.calInsert"));
	            declareParameter(new SqlParameter(Types.VARCHAR));	//getGAPAN_NO
	      		declareParameter(new SqlParameter(Types.VARCHAR));	//getYEAR
	      		declareParameter(new SqlParameter(Types.VARCHAR));	//getPRICE
	      		declareParameter(new SqlParameter(Types.VARCHAR));	//getFROMDATE
	      		declareParameter(new SqlParameter(Types.VARCHAR));	//getTODATE
	            declareParameter(new SqlParameter(Types.FLOAT));	//getAREA_AFTER
	            declareParameter(new SqlParameter(Types.FLOAT));	//getAREA_AFTER
	            declareParameter(new SqlParameter(Types.FLOAT));	//getRATE
	            declareParameter(new SqlParameter(Types.INTEGER));	//getSUM_LASTYEAR
	            declareParameter(new SqlParameter(Types.INTEGER));	//getSUM_YEAR
	            declareParameter(new SqlParameter(Types.INTEGER));	//getSUM_ADJUST
	            //declareParameter(new SqlParameter(Types.INTEGER));	//getMaxSeq                
	            declareParameter(new SqlParameter(Types.VARCHAR));	//getFORM_ADJUST
	            declareParameter(new SqlParameter(Types.VARCHAR));	//getFORM
	            declareParameter(new SqlParameter(Types.INTEGER));	//getLICENSE_TAX
	            declareParameter(new SqlParameter(Types.INTEGER));	// getPERIOD            
	            declareParameter(new SqlParameter(Types.INTEGER));	// VAT
	            declareParameter(new SqlParameter(Types.FLOAT));	// ADJUSTMENT
	            declareParameter(new SqlParameter(Types.INTEGER));	// reduction_rate
	            declareParameter(new SqlParameter(Types.VARCHAR));	// reduction_reason
	            declareParameter(new SqlParameter(Types.FLOAT));	// SURCHARGE_RATE  
	            declareParameter(new SqlParameter(Types.VARCHAR));	// USE_SECTION(정기,수시)
	            declareParameter(new SqlParameter(Types.VARCHAR));	// FIRST_SEQ
	            declareParameter(new SqlParameter(Types.INTEGER));	// CAL_SUM_SEQ
	            declareParameter(new SqlParameter(Types.INTEGER));	// PREV_SEQ
	            declareParameter(new SqlParameter(Types.VARCHAR));	// UP_DATE
	            declareParameter(new SqlParameter(Types.VARCHAR));	// GP_TYP
	   		
		}
	}
   	
	
	class InsertProduct2 extends SqlUpdate {
        public InsertProduct2(DataSource dataSource) {

        	super(dataSource, getMessageSourceAccessor().getMessage("Querys.gapan.calInsert2"));
	            declareParameter(new SqlParameter(Types.VARCHAR));	//getGAPAN_NO
	      		declareParameter(new SqlParameter(Types.VARCHAR));	//getYEAR
	      		declareParameter(new SqlParameter(Types.VARCHAR));	//getPRICE
	      		declareParameter(new SqlParameter(Types.VARCHAR));	//getFROMDATE
	      		declareParameter(new SqlParameter(Types.VARCHAR));	//getTODATE
	            declareParameter(new SqlParameter(Types.FLOAT));	//getAREA_AFTER
	            declareParameter(new SqlParameter(Types.FLOAT));	//getAREA_AFTER
	            declareParameter(new SqlParameter(Types.FLOAT));	//getRATE
	            declareParameter(new SqlParameter(Types.INTEGER));	//getSUM_LASTYEAR
	            declareParameter(new SqlParameter(Types.INTEGER));	//getSUM_YEAR
	            declareParameter(new SqlParameter(Types.INTEGER));	//getSUM_ADJUST
	            //declareParameter(new SqlParameter(Types.INTEGER));	//getMaxSeq                
	            declareParameter(new SqlParameter(Types.VARCHAR));	//getFORM_ADJUST
	            declareParameter(new SqlParameter(Types.VARCHAR));	//getFORM
	            declareParameter(new SqlParameter(Types.INTEGER));	//getLICENSE_TAX
	            declareParameter(new SqlParameter(Types.INTEGER));	// getPERIOD            
	            declareParameter(new SqlParameter(Types.INTEGER));	// VAT
	            declareParameter(new SqlParameter(Types.FLOAT));	// ADJUSTMENT
	            declareParameter(new SqlParameter(Types.INTEGER));	// reduction_rate
	            declareParameter(new SqlParameter(Types.VARCHAR));	// reduction_reason
	            declareParameter(new SqlParameter(Types.FLOAT));	// SURCHARGE_RATE  
	            declareParameter(new SqlParameter(Types.VARCHAR));	// USE_SECTION(정기,수시)
	            declareParameter(new SqlParameter(Types.INTEGER));	// CAL_SUM_SEQ
	            declareParameter(new SqlParameter(Types.INTEGER));	// PREV_SEQ
	            declareParameter(new SqlParameter(Types.VARCHAR));	// UP_DATE
	            declareParameter(new SqlParameter(Types.VARCHAR));	// GP_TYP.
                
        }
    }
	
	
	// GAPAN_CAL_SUM_INFO 입력
	public	boolean	Cal_Sum_InfoInsert(ProductBean objProductBean)
	{
	
		int i = 0;
		try{
			
			//2009.8.16  int 로 자리수 안맞아서 수정 start
			//int sum = objProductBean.getSUM_ADJUST()*(100 - objProductBean.getREDUCTION_RATE())/100;
			//sum = sum/100*100;			
			//int vat = sum/10 ;
			
			long sum = Long.parseLong(String.valueOf(objProductBean.getSUM_ADJUST()));		
			long vat = sum/10 ;
			// 2009.8.16  int 로 자리수 안맞아서 수정 end
			
			
			/*System.out.println( " objProductBean.getGAPAN_NO()			===" + objProductBean.getGAPAN_NO());
			System.out.println( " new Integer(objProductBean.getSEQ())	===" + new Integer(objProductBean.getSEQ()));
			System.out.println( " objProductBean.getYEAR()				===" + objProductBean.getYEAR());
			System.out.println( " new Float(objProductBean.getAREA_AFTER())	===" + new Float(objProductBean.getAREA_AFTER()));	
			System.out.println( " new Integer(objProductBean.getSUM_ADJUST())===" + new Integer(objProductBean.getSUM_ADJUST()));
			System.out.println( " new Integer(vat)						===" + new Integer(vat));
			System.out.println( " new Integer(objProductBean.getREDUCTION_RATE()===" + new Integer(objProductBean.getREDUCTION_RATE()));
			System.out.println( " new Integer(sum)								===" + new Integer(sum));
			System.out.println( " objProductBean.getUSE_SECTION()				===" + objProductBean.getUSE_SECTION());
			System.out.println( " objProductBean.getREDUCTION_REASON()			===" + objProductBean.getREDUCTION_REASON());
			System.out.println( " new Integer(objProductBean.getPRICE())		===" + new Integer(objProductBean.getPRICE()));
			System.out.println( " new Float(objProductBean.getRATE())			===" + new Float(objProductBean.getRATE()));
			System.out.println( " objProductBean.getFORM_ADJUST()				===" + objProductBean.getFORM_ADJUST());
			System.out.println( " objProductBean.getFROMDATE()					===" + objProductBean.getFROMDATE());
			System.out.println( " objProductBean.getTODATE()					===" + objProductBean.getTODATE());
			*/
			Object[] values = {
					objProductBean.getGAPAN_NO()						//GAPAN_NO   					
					, new Integer(objProductBean.getSEQ())				//SEQ
					, objProductBean.getYEAR()							//YEAR
					, new Float(objProductBean.getAREA_AFTER())			//AREA
					, new Integer(objProductBean.getSUM_ADJUST())		//SUM_ADJUST
					//, new Integer(vat)									//VAT
					, new Long(vat)
					, new Integer(objProductBean.getREDUCTION_RATE())	//REDUCTION_RATE
					//, new Integer(sum)									//SUM	
					, new Long(sum)										//SUM
					, objProductBean.getUSE_SECTION() 					//2수시(USE_SECTION)/1계속
					, objProductBean.getREDUCTION_REASON()				//REDUCTION_REASON	
					, new Integer(objProductBean.getPRICE())			//price(공시지가)
					, new Float(objProductBean.getRATE())				//요율
					, objProductBean.getFORM_ADJUST()					//산출식		
					, objProductBean.getFROMDATE()						//fromdate
					, objProductBean.getTODATE()						//todate
					, objProductBean.getTAX_SEQ()						//tax_seq 
					};
			
			//System.out.println("가판 정기 cal_sum_info insert 쿼리 == \n " + getMessageSourceAccessor().getMessage("Querys.gapan.cal_sum_infoInsert"));
			i = objCal_Sum_InfoInsert.update(values);
			
			
		} catch (Exception e) {
			System.out.println(e.toString());
			e.printStackTrace();
		}		
		return true;
	}

	public class Cal_Sum_InfoInsert extends SqlUpdate {
		public Cal_Sum_InfoInsert(DataSource dataSource)  throws SQLException{	        	
			super(dataSource, getMessageSourceAccessor().getMessage("Querys.gapan.cal_sum_infoInsert"));
	            declareParameter(new SqlParameter(Types.VARCHAR));	//getGAPAN_NO
	            declareParameter(new SqlParameter(Types.INTEGER));	//seq
	      		declareParameter(new SqlParameter(Types.VARCHAR));	//getYEAR	          		
	            declareParameter(new SqlParameter(Types.FLOAT));	//getAREA
	            declareParameter(new SqlParameter(Types.INTEGER));	//SUM_ADJUST
	            declareParameter(new SqlParameter(Types.INTEGER));	// VAT
	            declareParameter(new SqlParameter(Types.INTEGER));	// reduction_rate
	            declareParameter(new SqlParameter(Types.INTEGER));	//SUM
	            declareParameter(new SqlParameter(Types.VARCHAR));	// USE_SECTION(정기1,수시2)
	            declareParameter(new SqlParameter(Types.VARCHAR));	// reduction_reason
	            declareParameter(new SqlParameter(Types.INTEGER));	// price
	            declareParameter(new SqlParameter(Types.FLOAT));	// rate
	            declareParameter(new SqlParameter(Types.VARCHAR));	// form_adjust
	            declareParameter(new SqlParameter(Types.VARCHAR));	// fromdate
	            declareParameter(new SqlParameter(Types.VARCHAR));	// todate
	            declareParameter(new SqlParameter(Types.VARCHAR));	// tax_seq
		}
	}
	
	
	// GAPAN_CAL_SUM_INFO 시퀀스 증가값
    public int getCal_Sum_Seq()
    {	
		String sql = getMessageSourceAccessor().getMessage("Querys.gapan.GetCAL_SUM_SEQ");
		int result = getJdbcTemplate().queryForInt(sql);
		return result;
    }
    
    
    // 부과여부 설정
	public void setTaxYn(String gapan_no) {
		Object[] values = { gapan_no };
		objSetTaxYn.update(values);
	}	
	class SetTaxYn extends SqlUpdate {
		public SetTaxYn(DataSource dataSource) {
			super(dataSource, getMessageSourceAccessor().getMessage(
					"Querys.gapan.junggi.setTax_Yn"));
			declareParameter(new SqlParameter(Types.VARCHAR));
		}
	}
	
	
	
	// GAPAN_CALCULATION_INFO 수정
	public boolean updateProduct(ProductBean objProductBean)
	{
	
		try{
			
			if(objProductBean.getFROMDATE() == null ||objProductBean.getFROMDATE().equals(""))
   				objProductBean.setFROMDATE(" ");
   			
   			if(objProductBean.getTODATE() == null ||objProductBean.getTODATE().equals(""))
   				objProductBean.setTODATE(" ");
   			
   			Object[] values = {
   					 objProductBean.getYEAR()						//year
   					, new Integer(objProductBean.getPRICE())		//price
   					, objProductBean.getFROMDATE()					//fromdate
   					, objProductBean.getTODATE()					//todate
   					, new Float(objProductBean.getAREA_AFTER())		//area_after
   					, new Float(objProductBean.getRATE())			//rate
   					, new Integer(objProductBean.getSUM_LASTYEAR())	//sum_lastyear
   					, new Integer(objProductBean.getSUM_YEAR())		//sum_year
   					, new Integer(objProductBean.getSUM_ADJUST())	//sum_adjust
   					//, new Integer(objProductBean.getSEQ())			//seq
   					, new Integer(objProductBean.getVAT()) 								// vat
   					, objProductBean.getFORM_ADJUST()				//form_adjust
   					, objProductBean.getFORM() 						// form
   					, new Integer(objProductBean.getPERIOD())		//period
   					, new Float(objProductBean.getADJUSTMENT())		//adjustment
   					, new Integer(objProductBean.getLICENSE_TAX())	//license_tax
   					//, objProductBean.getADMIN_NO()					//admin_no
   					//, objProductBean.getYEAR()						//year   					
   					,new Integer(objProductBean.getREDUCTION_RATE())
   					,objProductBean.getREDUCTION_REASON()			//
   					,new Float(objProductBean.getSURCHARGE_RATE())	//surcharge_rate
   					, objProductBean.getUP_DATE()
   					, objProductBean.getSEQ()						//seq
   					
   				};	
   			

   			objUpdateProduct.update(values);
			
			
		} catch (Exception e) {
			System.out.println(e.toString());
			e.printStackTrace();
		}		
		return true;
	}

	public class UpdateProduct extends SqlUpdate {
		public UpdateProduct(DataSource dataSource)  throws SQLException{	        	
			super(dataSource, getMessageSourceAccessor().getMessage("Querys.gapan.calculationInfoUpdate"));
				declareParameter(new SqlParameter(Types.VARCHAR));            //    YEAR = ?, \
	      		declareParameter(new SqlParameter(Types.VARCHAR));            //    PRICE = ?, \
	      		declareParameter(new SqlParameter(Types.VARCHAR));            //    FROMDATE = ?, \
	      		declareParameter(new SqlParameter(Types.VARCHAR));            //    TODATE = ?, \
	            declareParameter(new SqlParameter(Types.FLOAT));              //    AREA_AFTER = ?, \
	            declareParameter(new SqlParameter(Types.FLOAT));              //    RATE = ?, \
	            declareParameter(new SqlParameter(Types.INTEGER));            //    SUM_LASTYEAR = ?, \
	            declareParameter(new SqlParameter(Types.INTEGER));            //    SUM_YEAR = ?, \
	            declareParameter(new SqlParameter(Types.INTEGER));            //    SUM_ADJUST = ?, \
	            declareParameter(new SqlParameter(Types.INTEGER));            //    VAT = ?, \
	            declareParameter(new SqlParameter(Types.VARCHAR));            //    FORM_ADJUST = ?, \
	            declareParameter(new SqlParameter(Types.VARCHAR));            //    FORM = ? , \
	            declareParameter(new SqlParameter(Types.INTEGER));            //    PERIOD= ?  \
	            declareParameter(new SqlParameter(Types.FLOAT));			  //	ADJUSTMENT
	            declareParameter(new SqlParameter(Types.INTEGER));			  //	LICENSE_TAX
	            declareParameter(new SqlParameter(Types.INTEGER));			  //	AND	REDUCTION_RATE
	            declareParameter(new SqlParameter(Types.VARCHAR));			  //	AND REDUCTION_REASON
	            declareParameter(new SqlParameter(Types.FLOAT));			  //	AND SURCHARGE_RATE
	            declareParameter(new SqlParameter(Types.VARCHAR));			  //	AND UP_DATE      
	            declareParameter(new SqlParameter(Types.VARCHAR));			  //	AND SEQ = ?
		}
	}
	
	
	// GAPAN_CAL_SUM_INFO 수정
	public boolean updateCal_sum_info(ProductBean objProductBean)
	{
	
		try{
			
			//2009.8.16  int 로 자리수 안맞아서 수정 start
			//int sum = objProductBean.getSUM_ADJUST()*(100 - objProductBean.getREDUCTION_RATE())/100;
			//sum = sum/100*100;			
			//int vat = sum/10 ;
			
			// 2009.8.16  int 로 자리수 안맞아서 수정 end
			
			/*System.out.println( " new Integer(objProductBean.getSUM_ADJUST())===" + new Integer(objProductBean.getSUM_ADJUST()));
			System.out.println( " new Integer(vat)						===" + new Integer(vat));
			System.out.println( " new Integer(objProductBean.getREDUCTION_RATE()===" + new Integer(objProductBean.getREDUCTION_RATE()));
			System.out.println( " new Integer(sum)						===" + new Integer(sum));
			System.out.println( " objProductBean.getREDUCTION_REASON()	===" + objProductBean.getREDUCTION_REASON());
			System.out.println( " new Integer(objProductBean.getPRICE())===" + new Integer(objProductBean.getPRICE()));
			System.out.println( " new Float(objProductBean.getRATE())	===" + new Float(objProductBean.getRATE()));
			System.out.println( " objProductBean.getFORM_ADJUST()		===" + objProductBean.getFORM_ADJUST());
			System.out.println( " objProductBean.getFROMDATE()			===" + objProductBean.getFROMDATE());
			System.out.println( " objProductBean.getTODATE()			===" + objProductBean.getTODATE());
			System.out.println( " objProductBean.getGAPAN_NO()			===" + objProductBean.getGAPAN_NO());
			System.out.println( " new Integer(objProductBean.getSEQ())	===" + objProductBean.getSEQ());
   			*/
   			Object[] values = {
					new Integer(objProductBean.getSUM_ADJUST())			//SUM_ADJUST
					//, new Integer(vat)									//VAT
					, new Long(objProductBean.getVAT())										//VAT
					, new Integer(objProductBean.getREDUCTION_RATE())	//REDUCTION_RATE
					//, new Integer(sum)								//SUM
					, new Long(objProductBean.getSUM())									//SUM
					, objProductBean.getREDUCTION_REASON()				//REDUCTION_REASON	
					, new Integer(objProductBean.getPRICE())			//price(공시지가)
					, new Float(objProductBean.getRATE())				//요율
					, objProductBean.getFORM_ADJUST()					//산출식		
					, objProductBean.getFROMDATE()						//fromdate
					, objProductBean.getTODATE()						//todate
					, objProductBean.getGAPAN_NO()						//gapan_no
   					, objProductBean.getCAL_SUM_SEQ()					//seq
   					
   				};	
   			

   			objUpdateCal_sum_info.update(values);
			
			
		} catch (Exception e) {
			System.out.println(e.toString());
			e.printStackTrace();
		}		
		return true;
	}

	public class UpdateCal_sum_info extends SqlUpdate {
		public UpdateCal_sum_info(DataSource dataSource)  throws SQLException{	        	
			super(dataSource, getMessageSourceAccessor().getMessage("Querys.gapan.cal_sum_infoUpdate"));
				declareParameter(new SqlParameter(Types.INTEGER));
				declareParameter(new SqlParameter(Types.INTEGER));
				declareParameter(new SqlParameter(Types.INTEGER));
				declareParameter(new SqlParameter(Types.INTEGER));
				declareParameter(new SqlParameter(Types.VARCHAR));
				declareParameter(new SqlParameter(Types.INTEGER));
				declareParameter(new SqlParameter(Types.FLOAT));
				declareParameter(new SqlParameter(Types.VARCHAR));
				declareParameter(new SqlParameter(Types.VARCHAR));
				declareParameter(new SqlParameter(Types.VARCHAR));
				declareParameter(new SqlParameter(Types.VARCHAR));
				declareParameter(new SqlParameter(Types.VARCHAR));
		}
	}
	
	// GAPAN_TAXATION_INFO 수정
	public boolean updateTaxation_info(ProductBean objProductBean)
	{
	
		try{
			
			// 2009.8.16  int 로 자리수 안맞아서 수정 start
			//int sum = objProductBean.getSUM_ADJUST()*(100 - objProductBean.getREDUCTION_RATE())/100;
			//sum = sum/100*100;			
			//int vat = sum/10 ;
			
			// 2009.8.16  int 로 자리수 안맞아서 수정 end	
			
			/*System.out.println( " objProductBean.getTAX_YM()	===" + objProductBean.getTAX_YM());
			System.out.println( " objProductBean.getINDATE()	===" + objProductBean.getINDATE());
			System.out.println( " objProductBean.getOVERDATE()===" + objProductBean.getOVERDATE());
			System.out.println( " objProductBean.getTAX_DATE()	===" + objProductBean.getTAX_DATE());
			System.out.println( " objProductBean.getVAT()	===" + objProductBean.getVAT());
			System.out.println( " objProductBean.getOVERTAX()===" + objProductBean.getOVERTAX());
			System.out.println( " objProductBean.getFORM_ADJUST()===" + objProductBean.getFORM_ADJUST());
			System.out.println( " objProductBean.getFORM()		===" + objProductBean.getFORM());
			System.out.println( " objProductBean.getGAPAN_NO()	===" + objProductBean.getGAPAN_NO());
			System.out.println( " objProductBean.getCAL_SUM_SEQ()===" + objProductBean.getCAL_SUM_SEQ());
   			*/
   			Object[] values = {
   					objProductBean.getTAX_YM()			
					, objProductBean.getINDATE()
					, objProductBean.getOVERDATE()
					, objProductBean.getTAX_DATE()
					, objProductBean.getVAT()
					
					, objProductBean.getOVERTAX()
					, objProductBean.getFORM_ADJUST()
					, objProductBean.getFORM()					
					, objProductBean.getBONSE()
					, objProductBean.getSISE()
					
					, objProductBean.getGUSE()
					, objProductBean.getINTAX()					
					, objProductBean.getGAPAN_NO()
   					, objProductBean.getCAL_SUM_SEQ()
   					
   				};	
   			
   			//System.out.println(" taxation update =  " + getMessageSourceAccessor().getMessage("Querys.gapan.taxation_infoUpdate"));
   			objUpdateTaxation_info.update(values);
			
			
		} catch (Exception e) {
			System.out.println(e.toString());
			e.printStackTrace();
		}		
		return true;
	}

	public class UpdateTaxation_info extends SqlUpdate {
		public UpdateTaxation_info(DataSource dataSource)  throws SQLException{	        	
			super(dataSource, getMessageSourceAccessor().getMessage("Querys.gapan.taxation_infoUpdate"));
				
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			
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
	
	
	//정기분 조회 리스트 - 일괄산출
    protected class JunggiSearchListQuery_AllCal extends MappingSqlQuery {
        protected JunggiSearchListQuery_AllCal(DataSource ds) {
      	super(ds, getMessageSourceAccessor().getMessage("Querys.gapan.junggi.periodicalList_AllCal"));
      	declareParameter(new SqlParameter(Types.VARCHAR)); 
      	declareParameter(new SqlParameter(Types.VARCHAR)); 
      	declareParameter(new SqlParameter(Types.VARCHAR)); 
      	declareParameter(new SqlParameter(Types.VARCHAR)); 
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
          protected Object mapRow(ResultSet rs, int rownum) throws SQLException {
            jumyongBean objJumyongBean = new jumyongBean();

            objJumyongBean.setR_ID(rs.getString("R_ID")); 
            objJumyongBean.setGAPAN_NO(rs.getString("GAPAN_NO"));            
            objJumyongBean.setGAPAN_NO2(rs.getString("GAPAN_NO2")); 
            objJumyongBean.setYEAR(rs.getString("YEAR")); 
            objJumyongBean.setTAX_NO(rs.getString("TAX_NO")); 
            objJumyongBean.setOWNER_NAME(rs.getString("OWNER_NAME")); 
            //objJumyongBean.setSIDO(rs.getString("SIDO")); 
            //objJumyongBean.setSIGUNGU(rs.getString("SIGUNGU")); 
            objJumyongBean.setBJ_CD(rs.getString("BJ_CD")); 
            objJumyongBean.setBONBUN(rs.getString("BONBUN")); 
            objJumyongBean.setBUBUN(rs.getString("BUBUN")); 
            objJumyongBean.setSPC_CD(rs.getString("SPC_CD")); 
            objJumyongBean.setAREA_AFTER_FLOAT(rs.getFloat("AREA_AFTER"));
            objJumyongBean.setPURPOSE_CD(rs.getString("PURPOSE_CD")); 
            objJumyongBean.setCLASS_NM(rs.getString("CLASS_NM")); 
            objJumyongBean.setSORT_NM(rs.getString("SORT_NM")); 
            objJumyongBean.setSUM_ADJUST(rs.getString("SUM_ADJUST")); 
            objJumyongBean.setLAST_FROMDATE(rs.getString("LAST_FROMDATE")); 
            objJumyongBean.setLAST_TODATE(rs.getString("LAST_TODATE")); 
            objJumyongBean.setFROMDATE(rs.getString("FROMDATE")); 
            objJumyongBean.setTODATE(rs.getString("TODATE")); 
            objJumyongBean.setRATE(rs.getString("RATE")); 
            objJumyongBean.setPRICE(rs.getString("PRICE")); 
            objJumyongBean.setTAX_YN(rs.getString("TAX_YN")); 
            objJumyongBean.setGP_TYP(rs.getString("GP_TYP")); 
            objJumyongBean.setSUM_LASTYEAR(rs.getString("SUM_LASTYEAR")); 
            objJumyongBean.setFT_TYP(rs.getString("FT_TYP")); 
            objJumyongBean.setNAME(rs.getString("NAME")); 
            objJumyongBean.setWITH_ADDR(rs.getString("WITH_ADDR"));
            objJumyongBean.setAREA(rs.getString("AREA"));
            objJumyongBean.setSEQ(rs.getString("SEQ"));
            objJumyongBean.setCAL_SUM_SEQ(rs.getString("CAL_SUM_SEQ"));
            
            objJumyongBean.setSIDO(rs.getString("SI_NM"));
            objJumyongBean.setSIGUNGU(rs.getString("GU_NM"));
            objJumyongBean.setBJ_NM(rs.getString("BJ_NM"));
            objJumyongBean.setTAX_GUBUN(rs.getString("TAX_GUBUN"));
            objJumyongBean.setREDUCTION_RATE(rs.getString("REDUCTION_RATE"));
            objJumyongBean.setREDUCTION_REASON(rs.getString("REDUCTION_REASON"));
            objJumyongBean.setSURCHARGE_RATE(rs.getFloat("SURCHARGE_RATE"));
            objJumyongBean.setSIGU_CD(rs.getString("SIGU_CD"));
            objJumyongBean.setDEPT_CD(rs.getString("DEPT_CD"));
            objJumyongBean.setOBJ_SET(rs.getString("OBJ_SET"));
            objJumyongBean.setTAXPAYER_ID(rs.getString("TAXPAYER_ID"));
            objJumyongBean.setOCR_SIGU_CD(rs.getString("OCR_SIGU_CD"));
            objJumyongBean.setOCR_BUSEO_CD(rs.getString("OCR_BUSEO_CD"));
            objJumyongBean.setTAX_CD(rs.getString("TAX_CD"));
            objJumyongBean.setLIVE(rs.getString("LIVE"));
            objJumyongBean.setADD_SET(rs.getString("ADD_SET"));
            objJumyongBean.setADD_YN(rs.getString("ADD_YN"));
            objJumyongBean.setSUBUSEO_CD(rs.getString("SUBUSEO_CD"));
            objJumyongBean.setTYPE(rs.getString("TYPE"));
            objJumyongBean.setSECTION(rs.getString("SECTION"));
            objJumyongBean.setSECTION_NAME(rs.getString("SECTION_NAME"));
            objJumyongBean.setTAXPAYER_SET(rs.getString("TAXPAYER_SET"));
            objJumyongBean.setPLACE_A(rs.getString("PLACE_A"));
            
            return objJumyongBean;
          }
      } 
    
    
	//	등록된 공시지가 가져오기
    public int getNowPrice(String gapan_no, String year)
    {
    	int price = 0;
    	
    	Object[] values = { gapan_no, year };
    	
    	String sql = getMessageSourceAccessor().getMessage("Querys.gapan.junggi.getNowPrice");
    	price = getJdbcTemplate().queryForInt(sql,values);
    	
    	return price;
    }
    
    
    //  점용목적코드로 코드명 가져오기
    public String getPurposeNm(String type, String cd)
	{
    	Object[] values = {type, cd};
    	String sql = getMessageSourceAccessor().getMessage("Querys.gapan.junggi.getPurposeNm");
    	//System.out.println(getMessageSourceAccessor().getMessage("Querys.gapan.junggi.getPurposeNm"));
    	
    	Map returnYear = getJdbcTemplate().queryForMap(sql,values);    	
    	
    	String nm = returnYear.get("CLASS_NM").toString();
    	
		return nm;   

	}
	
//	cal_sum_info tax_seq를 seq로 set   
    public int SetCal_Sum_Info_taxseq(String strSeq)
	{	
    	//System.out.println("String strSeq ==== " + strSeq);
		
    	Object[] values= { strSeq, strSeq };
    	int result = objSetCal_Sum_Info_taxseq.update(values);    	
    	
		return result;    	
	}

    protected class SetCal_Sum_Info_taxseq_update extends	SqlUpdate {
        protected SetCal_Sum_Info_taxseq_update(DataSource ds) {
      	super(ds, getMessageSourceAccessor().getMessage("Querys.gapan.gapan.junggi.updateTaxseq"));
	      	declareParameter(new SqlParameter(Types.VARCHAR));  
	      	declareParameter(new SqlParameter(Types.VARCHAR));
        }
        
      }

}