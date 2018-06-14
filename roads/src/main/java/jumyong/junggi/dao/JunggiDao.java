
package main.java.jumyong.junggi.dao;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;
import main.java.common.dao.RoadsJdbcDaoSupport;
import main.java.common.util.catUtil.Util;


import main.java.jumyong.jumyong.model.SearchBean;
import main.java.jumyong.jumyong.model.jumyongBean;
import main.java.jumyong.jumyong.model.ProductBean;
import main.java.jumyong.jumyonginfo.model.TotalWIthBean;


import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.MappingSqlQuery;
import org.springframework.jdbc.object.SqlUpdate;

import org.springframework.jdbc.support.lob.OracleLobHandler;

public class JunggiDao extends RoadsJdbcDaoSupport implements IJunggiDao
{ 
	private	Util				util			= new Util();
	private OracleLobHandler oracleLobHandler = null; 
	
	// �������� �ϰ� ���� View
	private LandPriceAllApllyQuery objLandPriceAllApllyQuery = null;
	
	//�������� �ϰ� ���� Update1
	private PriceApllyUpdateQuery objPriceApllyUpdateQuery = null;
	//�������� �ϰ����� update2
	private PriceApllyUpdateQuery2 objPriceApllyUpdateQuery2 = null;
	//�������� �ϰ����� update3
	private PriceApllyUpdateQuery3 objPriceApllyUpdateQuery3 = null;
	
	//����� ��ȸ ����Ʈ
	private JunggiSearchListQuery objPeriodicalQuery=null;
    // �ΰ����� ����Ʈ	
	private ImpositionInfoListQuery objImpositionInfoListQuery = null;
	private ImpositionInfoListQuery2 objImpositionInfoListQuery2 = null;
	
	private ImpositionInfoByCalSumListQuery objImpositionInfoByCalSumListQuery = null;
	
	// �ΰ����� - �⵵��
	private ImpositionInfoQuery objImpositionInfoQuery = null;
		
	//	 �ΰ����� - �⵵�� �հ�
	private ImpositionSumListByYearQuery objImpositionSumListByYearQuery = null;	
	
	/*
	private RetrieveProductListQuery objProductListQuery=null;	
	private ExaminListQuery objExaminListQuery = null;
	*/
	//����� ���� ����Ʈ	//Querys.jumyong.productjunggi_addList = \
	private Productjunggi_addListQuery objProductjunggi_addListQuery = null;	

	// �ΰ����� - �⵵�� �հ� ����Ʈ
	private cal_sum_infoListQuery objcal_sum_infoListQuery = null;	

	//CAL_SUM_INFO ���̺� ���� �߰� ������Ʈ		 
	private CalSumAddUpdate objCalSumAddUpdate = null;	 

	//���⹰ �Է�
	private CalSumReductionUpdate objCalSumReductionUpdate = null;
	
	//SUM_ADJUST, AREA_AFTER �հ� SUM_SEQ��				
	private SumBysumSeqQuery objSumBysumSeqQuery = null; 	

	//reduction����
	private GetReductionInfoQuery objGetReductionInfoQuery = null;
	
	//CalculationTempUpdateQuery
	private CalculationTempInsertQuery objCalculationTempInsertQuery = null;
	
	
	// taxation_info insert �߰� 
	private ExecuteBugwa_Register objExecuteBugwa_Register = null;
	// �ΰ����� ����Ʈ	
	private ImpositionInfoListQuery_multi objImpositionInfoListQuery_multi = null;
	// �ΰ����� - �⵵��
	private ImpositionInfoQuery_tax objImpositionInfoQuery_tax = null;
	private SetCal_Sum_Info_taxseq_update objSetCal_Sum_Info_taxseq = null;
	private UpdateTaxation_info objUpdateTaxation_info = null;
	
	private CalSumReductionUpdate_noPermission objCalSumReductionUpdate_noPermission = null;
	
	private CalSumUpdate objCalSumUpdate = null;
	
	private JunggiSearchListQuery_AllCal objPeriodicalQuery_AllCal = null;
	
	private executeTotalWithQuery objexecuteTotalWithQuery = null;
	
	
	private TotalWith_Register objTotalWith_Register = null;
	private totalWith_Delete objtotalWith_Delete = null;
	
	private UpdateWithSumAddr objUpdateWithSumAddr = null;
	
		
	
    protected void initDao()  throws Exception {
		super.initDao();
		oracleLobHandler = new OracleLobHandler();
		
		//�ΰ�����
		
		//�������� �ϰ� ���� View
		objLandPriceAllApllyQuery = new LandPriceAllApllyQuery(getDataSource());
		
		// �������� �ϰ����� Update1
		objPriceApllyUpdateQuery = new PriceApllyUpdateQuery(getDataSource());
		// �������� �ϰ� ���� update2
		objPriceApllyUpdateQuery2 = new PriceApllyUpdateQuery2(getDataSource());
		// �������� �ϰ� ���� update3
		objPriceApllyUpdateQuery3 = new PriceApllyUpdateQuery3(getDataSource());
		
		//����� ��ȸ ����Ʈ
		objPeriodicalQuery = new JunggiSearchListQuery(getDataSource());
		// �ΰ����� ����Ʈ		
		objImpositionInfoListQuery = new ImpositionInfoListQuery(getDataSource());
//		 �ΰ����� ����Ʈ - ����
		objImpositionInfoListQuery2 = new ImpositionInfoListQuery2(getDataSource());
		
		objImpositionInfoByCalSumListQuery = new ImpositionInfoByCalSumListQuery(getDataSource());
		
		// �ΰ����� - �⵵��
		objImpositionInfoQuery = new ImpositionInfoQuery(getDataSource());
		// �ΰ����� - �⵵�� �հ�
		objImpositionSumListByYearQuery = new ImpositionSumListByYearQuery(getDataSource());
		
//		����� ���� ����Ʈ	//Querys.jumyong.productjunggi_addList = \
		objProductjunggi_addListQuery = new Productjunggi_addListQuery(getDataSource());	
		
		 //    �ΰ����� - �⵵�� �հ� ����Ʈ
		objcal_sum_infoListQuery = new cal_sum_infoListQuery(getDataSource());	
		
		/*
		objRetrieveQuery = new RetrieveBoardListQuery(getDataSource());
		objProductListQuery = new RetrieveProductListQuery(getDataSource());
		objExaminListQuery = new ExaminListQuery(getDataSource());
		*/
//		CAL_SUM_INFO ���̺� ���� �߰� ������Ʈ		 
		objCalSumAddUpdate = new CalSumAddUpdate(getDataSource());
//		���⹰ �Է�
		objCalSumReductionUpdate = new CalSumReductionUpdate(getDataSource());
//		SUM_ADJUST, AREA_AFTER �հ� SUM_SEQ��				
		objSumBysumSeqQuery = new SumBysumSeqQuery(getDataSource());		
//		reduction����
		objGetReductionInfoQuery = new GetReductionInfoQuery(getDataSource());
//		CalculationTempUpdateQuery
		objCalculationTempInsertQuery = new CalculationTempInsertQuery(getDataSource());
		
		// taxation_info insert �߰�
		objExecuteBugwa_Register = new ExecuteBugwa_Register(getDataSource());
//		 �ΰ����� ����Ʈ		
		objImpositionInfoListQuery_multi = new ImpositionInfoListQuery_multi(getDataSource());
//		 �ΰ����� - �⵵��
		objImpositionInfoQuery_tax = new ImpositionInfoQuery_tax(getDataSource());
		objSetCal_Sum_Info_taxseq = new SetCal_Sum_Info_taxseq_update(getDataSource());
		objUpdateTaxation_info = new UpdateTaxation_info(getDataSource());
		
		objCalSumReductionUpdate_noPermission = new CalSumReductionUpdate_noPermission(getDataSource());
		
		objCalSumUpdate = new CalSumUpdate(getDataSource());
		objPeriodicalQuery_AllCal = new JunggiSearchListQuery_AllCal(getDataSource());
		
		objexecuteTotalWithQuery = new executeTotalWithQuery(getDataSource());
		
		objTotalWith_Register = new TotalWith_Register(getDataSource());
		objtotalWith_Delete = new totalWith_Delete(getDataSource());
		
		objUpdateWithSumAddr = new UpdateWithSumAddr(getDataSource());
		
		
		
		

   	}	
    
 //	��ϵ� �������� ��������
    public int getNowPrice(String admin_no, String year)
    {
    	int price = 0;
    	
    	Object[] values = { admin_no, year};
    	
    	String sql = getMessageSourceAccessor().getMessage("Querys.jumyong.junggi.getNowPrice");
    	price = getJdbcTemplate().queryForInt(sql,values);
    	
    	return price;
    }
    
 // �������� �ϰ� ���� View
    public List getlandPriceAllAplly(String sigu_cd, String year,String type,String tax_set,String tax_yn, String purpose,String bj_cd ,String hj_cd
    		,String jumyongName, String SECTION, int currentPage,int countPerPage)
    {
    	if(year.equals("0") || year.equals("")) year = "%";
    	if(type.equals("0") || type.equals("")) type = "%";
    	if(tax_set.equals("")) tax_set = "%";
    	if(tax_yn.equals("")) tax_yn="%";
    	if(bj_cd.equals("") || bj_cd.equals("00000") || bj_cd == null) bj_cd="%";
    	if(hj_cd.equals("") || hj_cd.equals("00000") || hj_cd == null) hj_cd="%";
    	if("".equals(jumyongName)){ jumyongName="%"; } else{ jumyongName = "%"+jumyongName+"%"; }
    	if("".equals(SECTION) || SECTION == null) SECTION="%";
    	
//   	 ������� ���� 
    	String str1 = "";
    	String str2 = "";
    	String str3 = "";
	    	
	    if(purpose.length()>1){
	    	str1 = purpose.substring(0,1);
	    	str2 = purpose.substring(1,2);
	    	str3 = purpose.substring(2,3);
	    }
    	
    	if(purpose==null || purpose.equals("") ){ 
    		purpose = "%";
    	}else if(str3.equals("0")){
    		if(str2.equals("0")){
    			
    			purpose = str1+"%";
    		}else{
    			
    			purpose = str1+str2+"%";
    		}
    	}     	
    	
    	Object[] values = {sigu_cd, year, type, tax_set,  tax_yn, purpose, bj_cd, hj_cd, jumyongName, SECTION, new Integer(currentPage),	new Integer(countPerPage) };
    	
    	return objLandPriceAllApllyQuery.execute(values);
    }
    
  //�������� �ϰ� ó�� View
    protected class LandPriceAllApllyQuery extends MappingSqlQuery {
    	
        protected LandPriceAllApllyQuery(DataSource ds) {
        	super(ds, getMessageSourceAccessor().getMessage("Querys.jumyong.junggi.landPriceAllAplly"));
        	
        	declareParameter(new SqlParameter(Types.VARCHAR));
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
            objJumyongBean.setADMIN_NO(rs.getString("ADMIN_NO"));
            objJumyongBean.setNAME(rs.getString("NAME"));
            objJumyongBean.setJIGA(util.Comma_Paste(rs.getString("JIGA")));            
            objJumyongBean.setBJ_NM(rs.getString("BJ_NM"));
            objJumyongBean.setBONBUN(rs.getString("BONBUN"));
            objJumyongBean.setBUBUN(rs.getString("BUBUN"));
            objJumyongBean.setAREA_SIZE(rs.getString("AREA_SIZE"));
            
            return objJumyongBean;
          }
    }
    
    // �������� �ϰ� ���� count 
    public int getlandPriceAllApllyCount(String sigu_cd, String year,String type,String tax_set,String tax_yn,String purpose,String bj_cd , String hj_cd
    		,String jumyongName, String SECTION)
    {
    	if(year.equals("0") || year.equals("")) year = "%";
    	if(type.equals("0") || type.equals("")) type = "%";
    	if(tax_set.equals("")) tax_set = "%";
    	if(tax_yn.equals("")) tax_yn="%";
    	if(bj_cd.equals("") || bj_cd.equals("00000") || bj_cd == null) bj_cd="%";
    	if(hj_cd.equals("") || hj_cd.equals("00000") || hj_cd == null) hj_cd="%";
    	if("".equals(jumyongName)){ jumyongName="%"; } else{ jumyongName = "%"+jumyongName+"%"; }
    	if("".equals(SECTION) || SECTION == null) SECTION="%";

//    	 ������� ���� 
    	String str1 = "";
    	String str2 = "";
    	String str3 = "";
	    	
	    if(purpose.length()>1){
	    	str1 = purpose.substring(0,1);
	    	str2 = purpose.substring(1,2);
	    	str3 = purpose.substring(2,3);
	    }
    	
    	if(purpose==null || purpose.equals("") ){ 
    		purpose = "%";
    	}else if(str3.equals("0")){
    		if(str2.equals("0")){
    			
    			purpose = str1+"%";
    		}else{
    			
    			purpose = str1+str2+"%";
    		}
    	}     	
    	Object[] values = { sigu_cd, year, type, tax_set,  tax_yn, purpose, bj_cd, hj_cd, jumyongName, SECTION};
    	
    	String sql = getMessageSourceAccessor().getMessage("Querys.jumyong.junggi.landPriceAllApllyCount");
    	int returnNum = getJdbcTemplate().queryForInt(sql,values);
    	return returnNum;
    }
    
    public boolean priceApllyUpdate(SearchBean sb) {
    	
    	if(sb.getYEAR().equals("0") || sb.getYEAR().equals("")) sb.setYEAR("%");
    	if(sb.getTYPE().equals("0") || sb.getTYPE().equals("")) sb.setTYPE("%");
    	if("".equals(sb.getTAX_SET())) sb.setTAX_SET("%");
    	if("".equals(sb.getTAX_YN())) sb.setTAX_YN("%");
    	if("".equals(sb.getBJ_CD()) || sb.getBJ_CD().equals("00000") || sb.getBJ_CD() == null) sb.setBJ_CD("%");
    	if("".equals(sb.getHJ_CD()) || sb.getHJ_CD().equals("00000") || sb.getHJ_CD() == null) sb.setHJ_CD("%");
    	if("".equals(sb.getJUMYONGNAME())) 
    		sb.setJUMYONGNAME("%");
    	else
    		sb.setJUMYONGNAME("%"+sb.getJUMYONGNAME()+"%");
    	if("".equals(sb.getSECTION()) || sb.getSECTION() == null) sb.setSECTION("%");

//   	 ������� ���� 
    	String str1 = "";
    	String str2 = "";
    	String str3 = "";
	    	
	    if(sb.getPURPOSE().length()>1){
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
    					       					  
    					   sb.getPURPOSE(),
    					   sb.getBJ_CD(),
    					   sb.getHJ_CD(),    					   
    					   sb.getJUMYONGNAME(),    					   
    					   sb.getSECTION()
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
    		String sql = getMessageSourceAccessor().getMessage("Querys.jumyong.junggi.PriceApllySelect");
        	int returnNum = getJdbcTemplate().queryForInt(sql,admin_no);
    		//System.out.println(pb.getADMIN_NO()+":"+returnNum);
    		
    		//Object[] value = {pb.getADMIN_NO(), pb.getADMIN_NO()};
    		
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
      	super(ds, getMessageSourceAccessor().getMessage("Querys.jumyong.junggi.PriceAplly"));

      		declareParameter(new SqlParameter(Types.VARCHAR));
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
          	 
            objProductBean.setADMIN_NO(rs.getString("ADMIN_NO"));     
             
            return objProductBean;
          }
      } 
    
    class PriceApllyUpdateQuery2 extends SqlUpdate {
		public PriceApllyUpdateQuery2(DataSource dataSource) {	        	
	//(ADMIN_NO, SEQ, YEAR, AREA, SUM_ADJUST,VAT,REDUCTION_RATE,SUM,USE_SECTION,REDUCTION_REASON) \
		super(dataSource, getMessageSourceAccessor().getMessage("Querys.jumyong.junggi.PriceApllyUpdate"));
			
			declareParameter(new SqlParameter(Types.VARCHAR));	
			//declareParameter(new SqlParameter(Types.VARCHAR));
			
		}
	}
    
    class PriceApllyUpdateQuery3 extends SqlUpdate {
		public PriceApllyUpdateQuery3(DataSource dataSource) {	        	
	//(ADMIN_NO, SEQ, YEAR, AREA, SUM_ADJUST,VAT,REDUCTION_RATE,SUM,USE_SECTION,REDUCTION_REASON) \
		super(dataSource, getMessageSourceAccessor().getMessage("Querys.jumyong.junggi.PriceApllyUpdate3"));
			
			declareParameter(new SqlParameter(Types.VARCHAR));	
			declareParameter(new SqlParameter(Types.VARCHAR));
			
		}
	}
    
    //method/////////////////////////////////////////////////////////////////////////////////////////////////////////////
	//����� ��ȸ ����Ʈ    
    public List junggiSearchList(String sigu_cd, String year,String type,String tax_set,String tax_yn,String mul_fromdate,String mul_todate,String purpose,String bj_cd,String hj_cd
    		,String jumyongName,String cal_status, String SECTION, int currentPage,int countPerPage, String gubun)
	{ 
    	System.out.println("JunggiDao.junggiSearchList");
    	System.out.println("JunggiDao.junggiSearchList");
    	System.out.println("JunggiDao.junggiSearchList");
    	
    	String last_year = "";	// ���⵵ �˻� 
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
    	if(bj_cd.equals("") || bj_cd.equals("00000") || bj_cd == null) bj_cd="%";
    	if(hj_cd.equals("") || hj_cd.equals("00000") || hj_cd == null) hj_cd="%";
    	if("".equals(jumyongName)){ jumyongName="%"; } else{ jumyongName = "%"+jumyongName+"%"; }
    	if("".equals(cal_status)) cal_status="%";
    	if("".equals(SECTION) || SECTION == null) SECTION="%";

// 	 ������� ���� 
    	String str1 = "";
    	String str2 = "";
    	String str3 = "";
	    	
	    if(purpose.length()>1){
	    	str1 = purpose.substring(0,1);
	    	str2 = purpose.substring(1,2);
	    	str3 = purpose.substring(2,3);
	    }
    	
    	if(purpose==null || purpose.equals("")){ 
    		purpose = "%";
    	}else if(str3.equals("0")){
    		if(str2.equals("0")){
    			
    			purpose = str1+"%";
    		}else{
    			
    			purpose = str1+str2+"%";
    		}
    	} 
    		
    	Object[] values = {year, sigu_cd, year, type, tax_set,  tax_yn, mul_fromdate, mul_todate, purpose, bj_cd, hj_cd, jumyongName, SECTION, new Integer(currentPage),	new Integer(countPerPage) };
    	    	
    	for(int i = 0 ; i < values.length ; i ++){
    		System.out.println("junggiSearchList : : " +values[i] );
    	}
    	
    	
    	if("AllCal".equals(gubun)){
    		return objPeriodicalQuery_AllCal.execute(values);
    	}else{
    		return objPeriodicalQuery.execute(values);	
    	}
	}
    
    // ����� ��ȸ ����Ʈ   ī��Ʈ
    public int getJunggiSearchListCount(String sigu_cd, String year,String type,String tax_set,String tax_yn,String mul_fromdate,String mul_todate,String purpose,String bj_cd ,String hj_cd
    		,String jumyongName, String cal_status, String SECTION)
    { 
    	String last_year = "";	// ���⵵ �˻� 
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

    	if(bj_cd.equals("") || bj_cd.equals("00000") || bj_cd == null) bj_cd="%";
    	if(hj_cd.equals("") || hj_cd.equals("00000") || hj_cd == null) hj_cd="%";
    	if("".equals(jumyongName)){ jumyongName="%"; } else{ jumyongName = "%"+jumyongName+"%"; }
    	if("".equals(cal_status)) cal_status="%";
    	if("".equals(SECTION) || SECTION == null) SECTION="%";
    	
    	String str1 = "";
    	String str2 = "";
    	String str3 = "";
	    	
	    if(purpose.length()>1){
	    	str1 = purpose.substring(0,1);
	    	str2 = purpose.substring(1,2);
	    	str3 = purpose.substring(2,3);
	    }
    	if(purpose == null || purpose.equals("")){ 
    		purpose = "%";
    	}else if(str3.equals("0")){
    		if(str2.equals("0")){
    			
    			purpose = str1+"%";
    		}else{
    			
    			purpose = str1+str2+"%";
    		}
    	} 
    	
    	Object[] values = {year, sigu_cd, year, type, tax_set,  tax_yn, mul_fromdate, mul_todate, purpose, bj_cd, hj_cd, jumyongName, SECTION};
    	
    	for(int i = 0 ; i < values.length ; i ++){
    		System.out.println("getJunggiSearchListCount : : " +values[i] );
    	}
    	
    	String sql = getMessageSourceAccessor().getMessage("Querys.jumyong.junggi.periodicalListCount");
    	int returnNum = getJdbcTemplate().queryForInt(sql,values);
    	return returnNum;
	}    
    
//  �ΰ����� ����Ʈ 
    public List impositionList(String adminNo,String strYear,int currentPage,int countPerPage,String use_section, String seq )
	{	
    	List list1 ;
    	
    	//System.out.println("use_section="+use_section);   
    	
    	if(use_section.equals("1"))
    	{	
    		Object[] values= { adminNo,strYear,new Integer(currentPage),new Integer(countPerPage),new Integer(countPerPage)};
    		list1 = objImpositionInfoListQuery.execute(values);
    		
    	}else 
    	{	
    		//System.out.println("seq="+seq);    		
    		Object[] values= { new Integer(seq)};
    		list1 = objImpositionInfoListQuery2.execute(values);
    	}
    	
    	return list1;    	
	}
    
//  �ΰ����� ����Ʈ 
    public List ImpositionInfoByCalSumList(String cal_sum_seq,int currentPage,int countPerPage)
	{	
    	//System.out.println(cal_sum_seq);
    		Object[] values= { cal_sum_seq,new Integer(currentPage),new Integer(countPerPage),new Integer(countPerPage)};
    		List list1 = objImpositionInfoByCalSumListQuery.execute(values);    	
    	return list1;    	
	}
    
//  �ΰ����� ����Ʈ  ī��Ʈ
    public int getProductListCount(String adminNo)
	{	
    	Object[] values = {adminNo};
    	String sql = getMessageSourceAccessor().getMessage("Querys.jumyong.junggi.impositionInfoListCount");
    	int returnNum = getJdbcTemplate().queryForInt(sql,values);
    	return returnNum;
	}
    
//  �ΰ����� - �⵵�� 
    public ProductBean impositionInfo(String seq)
	{	
    	Object[] values = {seq};
    	ProductBean pb = null;
    	
    	pb = (ProductBean) objImpositionInfoQuery.findObject(values);
    	
    	return pb;    	
	}
    


//  �۳⵵ ����� ��������
    public Map getSum_LastYear(String adminNo,String strYear)
	{	
    	Object[] values = {adminNo,strYear};
    	String sql = getMessageSourceAccessor().getMessage("Querys.jumyong.junggi.sum_lastyear");
    	Map returnNum = getJdbcTemplate().queryForMap(sql,values);
    	
    	System.out.println("       "+adminNo+strYear+returnNum);
    	
		return returnNum;    	
	}
    

//  �ΰ����� ����Ʈ  ī��Ʈ
    public int getProductSeq(String adminNo,String strYear)
	{	
    	Object[] values = {adminNo,strYear};
    	String sql = getMessageSourceAccessor().getMessage("Querys.jumyong.junggi.getProductSeq");
    	int returnNum = getJdbcTemplate().queryForInt(sql,values);
    	return returnNum;
	}    
    
//  �ΰ����� ���� ���� �Էµ� YEAR
    public String getLastYear(String adminNo)
	{	
    	Object[] values = {adminNo};
    	String sql = getMessageSourceAccessor().getMessage("Querys.jumyong.junggi.getLastYear");
    	Map returnYear = getJdbcTemplate().queryForMap(sql,values);
    	
		return returnYear.get("LASTYEAR").toString();    	
	}
    
//  �ΰ� �̺ΰ� ����
    public String getTaxYn(String seq)
	{	
    	
    	Object[] values = {seq};
    	String sql = getMessageSourceAccessor().getMessage("Querys.jumyong.junggi.getTaxYn");
    	Map taxYn = getJdbcTemplate().queryForMap(sql,values);    	
		return taxYn.get("TAX_YN").toString();    	
	}    
    
    //   �ΰ����� - �⵵�� �հ� 
    public List impositionSumListByYear(String adminNo,int currentPage,int countPerPage)
	{	
    	Object[] values = { adminNo,adminNo,new Integer(currentPage),new Integer(countPerPage),new Integer(countPerPage)};
    	return objImpositionSumListByYearQuery.execute(values);    	
	}    
    
//  �ΰ����� - �⵵�� �հ� ī��Ʈ
    public int getImpositionSumListByYearCount(String adminNo)
	{	
    	Object[] values = {adminNo};
    	String sql = getMessageSourceAccessor().getMessage("Querys.jumyong.junggi.ImpositionSumListByYearCount");
    	int returnNum = getJdbcTemplate().queryForInt(sql,values);
    	return returnNum;
	}
    
//  �ΰ����� - ���� �հ�-����� 
    public float getProductAreaSum(String seq)
	{	
    	Object[] values = {new Integer(seq)};
    	String sql = getMessageSourceAccessor().getMessage("Querys.jumyong.junggi.getProductAreaSum");
    	int returnNum = getJdbcTemplate().queryForInt(sql,values);
    	return returnNum;
	}    
    
//	����� ���� ����Ʈ		
    public List Productjunggi_addList(String admin_no, String year)
    {
    	
    	Object[] values = {admin_no,year,year,admin_no, String.valueOf(Integer.valueOf(year).intValue()+1) };
    	String sql = getMessageSourceAccessor().getMessage("Querys.jumyong.productjunggi_addList");
    	List returnList = objProductjunggi_addListQuery.execute(values);
    	return returnList;
    	
    }
    
//  ����_�ΰ� ���̺� SEQ ���
    public int getCal_tax_seq(String adminNo,String strYear)
	{	
    	Object[] values = {adminNo,strYear};
    	String sql = getMessageSourceAccessor().getMessage("Querys.jumyong.getcal_tax_seq");
    	int returnNum = getJdbcTemplate().queryForInt(sql,values);    	
    	System.out.println("       "+adminNo+strYear+returnNum);    	
		return returnNum;    	
	}
    
    
    
	//    �ΰ����� - �⵵�� �հ� ����Ʈ 
	public List cal_sum_infoList(String adminNo, String year,int currentPage,int countPerPage)
	{		
    		Object[] values= { adminNo, year, new Integer(currentPage),new Integer(countPerPage)};
    		
    		List list1 = objcal_sum_infoListQuery.execute(values);
    		
    	return list1;    	
	}    
		
	 //    �ΰ����� - �⵵�� �հ� ����Ʈ ī��Ʈ 
    public int getcal_sum_infoListCount(String adminNo, String year)
	{	
    	Object[] values = {adminNo , year};
    	String sql = getMessageSourceAccessor().getMessage("Querys.jumyong.junggi.cal_sum_infoListCount");
    	int returnNum = getJdbcTemplate().queryForInt(sql,values);
		return returnNum;    	
	}
    
//	CAL_SUM_INFO ���̺� ���� �߰� ������Ʈ		 
    public int CalSumAddUpdate(ProductBean objProductBean)
    {	
    	
    	
    	System.out.println("sum_adjust="+objProductBean.getSUM_ADJUST());
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

//	CAL_SUM_INFO �������� ������Ʈ 
    public int CalSumReductionUpdate(ProductBean objProductBean)
    {	
    	
    	System.out.println("aaa11aaa");
    	int i = 0;
		try{
		
			Object[] values = {		
					new Float(objProductBean.getREDUCTION_RATE())
				,	objProductBean.getREDUCTION_REASON()
				,	new Float(objProductBean.getREDUCTION_RATE())
				,	new Float(objProductBean.getREDUCTION_RATE())
				,	new Integer(objProductBean.getSEQ())
			};
			
			i = objCalSumReductionUpdate.update(values);
			
			
		} catch (Exception e) {
			System.out.println(e.toString());
			e.printStackTrace();
		}
		return i;	
    }    
    
//	SUM_ADJUST, AREA_AFTER �հ� SUM_SEQ��
    public ProductBean SumBysumSeq(String seq)
	{	
    	Object[] values = {new Integer(seq)};
    	
    	ProductBean pb = (ProductBean)objSumBysumSeqQuery.execute(values).get(0);
    	
    	return pb;
	}    
	 
//	reduction����
    public ProductBean GetReductionInfo(String seq, String adminNo)
    {
    	Object[] values = {new Integer(seq),adminNo};
    	ProductBean pb = (ProductBean)objGetReductionInfoQuery.execute(values).get(0);
    	return pb;
    }
    
    
    //    ����� �ش翬�� ���� first_seq�� ����
    public int GetCountSameCal(String seq,String year)
	{	
    	Object[] values = {new Integer(seq),year};
    	String sql = getMessageSourceAccessor().getMessage("Querys.jumyong.junggi.getCountSameCalculation");
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
    	String sql = getMessageSourceAccessor().getMessage("Querys.jumyong.junggi.getCal_sum_seq");
    	int returnNum = getJdbcTemplate().queryForInt(sql,values);
		return returnNum;    	
	}
    
   
//  cal_sum_exist
    public int cal_sum_exist(String admin_no,String year,String fromdate,String todate)
	{	
    	Object[] values = {admin_no,year,removeDash(fromdate),removeDash(fromdate),removeDash(todate),removeDash(todate)};
    	
    	String sql = getMessageSourceAccessor().getMessage("Querys.jumyong.junggi.cal_sum_exist");
    	int returnNum = getJdbcTemplate().queryForInt(sql,values);
		return returnNum;    	
	}
    
    
    
//  junggi getUseSection     
    public int getUseSection(String seq)
	{	
    	Object[] values = {seq};
    	String sql = getMessageSourceAccessor().getMessage("Querys.jumyong.junggi.getUseSection");
    	int returnNum = getJdbcTemplate().queryForInt(sql,values);
		return returnNum;    	
	}
    
    //query/////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //����� ��ȸ ����Ʈ
    protected class JunggiSearchListQuery extends MappingSqlQuery {
    	
        protected JunggiSearchListQuery(DataSource ds) {
        	super(ds, getMessageSourceAccessor().getMessage("Querys.jumyong.junggi.periodicalList"));
	      	
        	System.out.println("QQQuerys.jumyong.junggi.periodicalList");
        	
	      	declareParameter(new SqlParameter(Types.VARCHAR));
	      	declareParameter(new SqlParameter(Types.VARCHAR));
	      	declareParameter(new SqlParameter(Types.VARCHAR));
	      	declareParameter(new SqlParameter(Types.VARCHAR));
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
            
            //System.out.println("SSN: " + rs.getString("SSN"));
            
            objJumyongBean.setYEAR(rs.getString("YEAR"));            
            objJumyongBean.setADMIN_NO(rs.getString("ADMIN_NO"));
            objJumyongBean.setADMIN_NO2(rs.getString("ADMIN_NO2"));
            objJumyongBean.setNAME(rs.getString("NAME"));
            objJumyongBean.setPURPOSE_CD(rs.getString("PURPOSE_CD"));
            objJumyongBean.setBONBUN(rs.getString("BONBUN"));
            objJumyongBean.setBUBUN(rs.getString("BUBUN"));
            objJumyongBean.setWITH_ADDR1(rs.getString("WITH_ADDR1"));
            objJumyongBean.setSUM_ADJUST(rs.getString("SUM_ADJUST"));
            objJumyongBean.setSUM(rs.getString("SUM"));
            objJumyongBean.setAREA(rs.getFloat("AREA"));
            objJumyongBean.setFROMDATE(rs.getString("FROMDATE"));
            objJumyongBean.setTODATE(rs.getString("TODATE"));
            objJumyongBean.setRATE(rs.getString("RATE"));
            objJumyongBean.setPRICE(rs.getString("PRICE"));
            //System.out.println("QQQuerys.jumyong.junggi.periodicalList1");
        	
            objJumyongBean.setSI(rs.getString("SI"));
            objJumyongBean.setGUN(rs.getString("GUN"));
            objJumyongBean.setDORO_NM(rs.getString("DORO_NM"));
            objJumyongBean.setBD_NM(rs.getString("BD_NM"));
            objJumyongBean.setBD_DET_NM(rs.getString("BD_DET_NM"));
            objJumyongBean.setBD_BON(rs.getString("BD_BON"));
            //System.out.println("QQQuerys.jumyong.junggi.periodicalList2");
        	
            objJumyongBean.setPRICE(rs.getString("PRICE"));
            objJumyongBean.setLAST_FROMDATE(rs.getString("LAST_FROMDATE"));
            objJumyongBean.setLAST_TODATE(rs.getString("LAST_TODATE"));
            objJumyongBean.setTAX_NO(rs.getString("TAX_NO"));
            objJumyongBean.setTAX_YN(rs.getString("TAX_YN"));
            objJumyongBean.setBJ_NM(rs.getString("BJ_NM"));
            objJumyongBean.setTYPE(rs.getString("TYPE"));
            objJumyongBean.setSECTION(rs.getString("SECTION"));
            objJumyongBean.setSECTION_NAME(rs.getString("SECTION_NAME"));
            objJumyongBean.setTAX_SET(rs.getString("TAX_SET"));
            objJumyongBean.setFORM_ADJUST(rs.getString("FORM_ADJUST"));
            objJumyongBean.setPURPOSE_CLASSNM(rs.getString("PURPOSE_NM"));
            
            objJumyongBean.setSIGU_CD(rs.getString("SIGU_CD"));
            objJumyongBean.setBJ_CD(rs.getString("BJ_CD"));
            objJumyongBean.setDEPT_CD(rs.getString("DEPT_CD"));
            objJumyongBean.setTAX_GUBUN(rs.getString("TAX_GUBUN"));
            objJumyongBean.setOBJ_SET(rs.getString("OBJ_SET"));            
            objJumyongBean.setTAXPAYER_ID(rs.getString("TAXPAYER_ID"));
            objJumyongBean.setTAXPAYER_SET(rs.getString("TAXPAYER_SET"));
            objJumyongBean.setOCR_SIGU_CD(rs.getString("OCR_SIGU_CD"));
            objJumyongBean.setOCR_BUSEO_CD(rs.getString("OCR_BUSEO_CD"));
            objJumyongBean.setTAX_CD(rs.getString("TAX_CD"));
            objJumyongBean.setLIVE(rs.getString("LIVE"));
            objJumyongBean.setADD_SET(rs.getString("ADD_SET"));
            objJumyongBean.setADD_YN(rs.getString("ADD_YN"));
            objJumyongBean.setSUM_LASTYEAR(rs.getString("SUM_LASTYEAR"));
            objJumyongBean.setREDUCTION_RATE(rs.getString("REDUCTION_RATE"));
            objJumyongBean.setSUBUSEO_CD(rs.getString("SUBUSEO_CD"));
            objJumyongBean.setREDUCTION_REASON(rs.getString("REDUCTION_REASON"));
            objJumyongBean.setVAT(rs.getString("VAT"));
            objJumyongBean.setTAXNAME(rs.getString("TAXNAME"));
            
            objJumyongBean.setREDUCTION_SUM(rs.getString("REDUCTION_SUM"));
            objJumyongBean.setREDUCTION_FORM(rs.getString("REDUCTION_FORM"));
            
            objJumyongBean.setWSP_YN(rs.getString("WSP_YN"));
            objJumyongBean.setWITH_SUM_PRICE(rs.getString("WITH_SUM_PRICE"));
            
            objJumyongBean.setADDR(rs.getString("ADDR"));
            objJumyongBean.setPOST(rs.getString("POST"));
            
            //정기분 관리 주민번호/법인번호 조회 추가. 180612 by ksic
            objJumyongBean.setSSN(rs.getString("SSN"));
            
            // sungh83 20131121 //
            System.out.println("����� ��ȸ �����ּ�!!!"+rs.getString("ROAD_ADDR"));
            objJumyongBean.setROAD_ADDR(rs.getString("ROAD_ADDR"));
            // sungh83 20131121 //
            
            // 201602 KNY
            objJumyongBean.setOWNER_SET_NM(rs.getString("OWNER_SET_NM"));
            
            return objJumyongBean;
          }
      } 
    
      // �ΰ����� ����Ʈ
      protected class ImpositionInfoListQuery extends MappingSqlQuery {
          protected ImpositionInfoListQuery(DataSource ds) {
        	super(ds, getMessageSourceAccessor().getMessage("Querys.jumyong.junggi.impositionInfoList"));
  	      	declareParameter(new SqlParameter(Types.VARCHAR));  
  	      	declareParameter(new SqlParameter(Types.VARCHAR));
  	      	declareParameter(new SqlParameter(Types.INTEGER));
	    	declareParameter(new SqlParameter(Types.INTEGER));
	    	declareParameter(new SqlParameter(Types.INTEGER)); 
          }
            protected Object mapRow(ResultSet rs, int rownum) throws SQLException {
             
              ProductBean objProductBean = new ProductBean();
              
              objProductBean.setYEAR(rs.getString("YEAR"));
              objProductBean.setPRICE(rs.getLong("PRICE"));
              objProductBean.setAREA_AFTER(rs.getFloat("AREA_AFTER"));
              objProductBean.setRATE(rs.getFloat("RATE"));
              objProductBean.setFROMDATE(rs.getString("FROMDATE"));
              objProductBean.setTODATE(rs.getString("TODATE"));
              objProductBean.setSUM_LASTYEAR(rs.getInt("SUM_LASTYEAR"));
              objProductBean.setSUM_YEAR(rs.getInt("SUM_YEAR"));            
              objProductBean.setSUM_ADJUST(rs.getInt("SUM_ADJUST"));
              objProductBean.setFORM(rs.getString("FORM"));
              objProductBean.setFORM_ADJUST(rs.getString("FORM_ADJUST"));
              objProductBean.setPERIOD(rs.getInt("PERIOD"));
              objProductBean.setSEQ(rs.getString("CSEQ"));
              objProductBean.setUSE_SECTION(rs.getString("USE_SECTION"));
              objProductBean.setSUM(rs.getInt("SUM"));
              
             
              return objProductBean;
            }
        } 
      
      
//    �ΰ����� ����Ʈ
      protected class ImpositionInfoByCalSumListQuery extends MappingSqlQuery {
          protected ImpositionInfoByCalSumListQuery(DataSource ds) {
        	super(ds, getMessageSourceAccessor().getMessage("Querys.jumyong.junggi.impositionInfoByCalSumList"));  	      	  
  	      	declareParameter(new SqlParameter(Types.VARCHAR));
  	      	declareParameter(new SqlParameter(Types.INTEGER));
	    	declareParameter(new SqlParameter(Types.INTEGER));
	    	declareParameter(new SqlParameter(Types.INTEGER)); 
          }
            protected Object mapRow(ResultSet rs, int rownum) throws SQLException {
             
              ProductBean objProductBean = new ProductBean();
              
              objProductBean.setYEAR(rs.getString("YEAR"));
              objProductBean.setPRICE(rs.getLong("PRICE"));
              objProductBean.setAREA_AFTER(rs.getFloat("AREA_AFTER"));
              objProductBean.setRATE(rs.getFloat("RATE"));
              objProductBean.setFROMDATE(rs.getString("FROMDATE"));
              objProductBean.setTODATE(rs.getString("TODATE"));
              objProductBean.setSUM_LASTYEAR(rs.getInt("SUM_LASTYEAR"));
              objProductBean.setSUM_YEAR(rs.getInt("SUM_YEAR"));            
              objProductBean.setSUM_ADJUST(rs.getInt("SUM_ADJUST"));
              objProductBean.setFORM(rs.getString("FORM"));
              objProductBean.setFORM_ADJUST(rs.getString("FORM_ADJUST"));
              objProductBean.setPERIOD(rs.getInt("PERIOD"));
              objProductBean.setSEQ(rs.getString("CSEQ"));
              objProductBean.setUSE_SECTION(rs.getString("USE_SECTION"));
             
              return objProductBean;
            }
        }       
      
//    �ΰ����� ����Ʈ - ����
      protected class ImpositionInfoListQuery2 extends MappingSqlQuery {
          protected ImpositionInfoListQuery2(DataSource ds) {
        	super(ds, getMessageSourceAccessor().getMessage("Querys.jumyong.junggi.impositionInfoList2"));  	      	
	    	declareParameter(new SqlParameter(Types.INTEGER)); 
          }
            protected Object mapRow(ResultSet rs, int rownum) throws SQLException {
             
              ProductBean objProductBean = new ProductBean();
              
              objProductBean.setYEAR(rs.getString("YEAR"));
              objProductBean.setPRICE(rs.getLong("PRICE"));
              objProductBean.setAREA_AFTER(rs.getFloat("AREA_AFTER"));
              objProductBean.setRATE(rs.getFloat("RATE"));
              objProductBean.setFROMDATE(rs.getString("FROMDATE"));
              objProductBean.setTODATE(rs.getString("TODATE"));
              objProductBean.setSUM_LASTYEAR(rs.getInt("SUM_LASTYEAR"));
              objProductBean.setSUM_YEAR(rs.getInt("SUM_YEAR"));            
              objProductBean.setSUM_ADJUST(rs.getInt("SUM_ADJUST"));
              objProductBean.setFORM(rs.getString("FORM"));
              objProductBean.setFORM_ADJUST(rs.getString("FORM_ADJUST"));
              objProductBean.setPERIOD(rs.getInt("PERIOD"));
              objProductBean.setSEQ(rs.getString("CSEQ"));
              objProductBean.setUSE_SECTION(rs.getString("USE_SECTION"));
             
              return objProductBean;
            }
        }       
    
     
      
      
	// �ΰ����� ������ ����
	protected class ImpositionInfoQuery extends MappingSqlQuery {
		protected ImpositionInfoQuery(DataSource ds) {
			super(ds, getMessageSourceAccessor().getMessage("Querys.jumyong.junggi.impositionInfo"));
  	      		declareParameter(new SqlParameter(Types.VARCHAR));
          }
			protected Object mapRow(ResultSet rs, int rownum) throws SQLException {
				//System.out.println("�ΰ����� ������ ���� =" + getMessageSourceAccessor().getMessage("Querys.jumyong.junggi.impositionInfo"));
              
				ProductBean objProductBean = new ProductBean();
              
	              objProductBean.setYEAR(rs.getString("YEAR"));
	              objProductBean.setPRICE(rs.getLong("PRICE"));
	              objProductBean.setAREA_AFTER(rs.getFloat("AREA_AFTER"));
	              objProductBean.setRATE(rs.getFloat("RATE"));
	              objProductBean.setFROMDATE(rs.getString("FROMDATE"));
	              objProductBean.setTODATE(rs.getString("TODATE"));
	              objProductBean.setSUM_LASTYEAR(rs.getInt("SUM_LASTYEAR"));
	              objProductBean.setSUM_YEAR(rs.getInt("SUM_YEAR"));            
	              objProductBean.setSUM_ADJUST(rs.getInt("SUM_ADJUST"));
	              objProductBean.setFORM(rs.getString("FORM"));
	              objProductBean.setFORM_ADJUST(rs.getString("FORM_ADJUST"));              
	              objProductBean.setPERIOD(rs.getInt("PERIOD"));
	              objProductBean.setSEQ(rs.getString("SEQ"));
	              objProductBean.setADJUSTMENT(rs.getFloat("ADJUSTMENT"));
	              objProductBean.setFIRST_SEQ(rs.getString("FIRST_SEQ"));
	              objProductBean.setUSE_SECTION(rs.getString("USE_SECTION"));
	              objProductBean.setUSE_SECTIONNAME(rs.getString("NAME"));
	              
	              // 2009.8.6 �߰� start
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
	              objProductBean.setCAL_SUM_SEQ(rs.getString("CAL_SUM_SEQ"));
	              objProductBean.setTAX_YN(rs.getString("TAX_YN"));
	              objProductBean.setSUM(rs.getInt("SUM"));
	              objProductBean.setLIVE(rs.getString("LIVE"));
	              objProductBean.setCHECK_YN(rs.getString("CHECK_YN"));
	              objProductBean.setYOYUL(rs.getFloat("YOYUL"));
	              objProductBean.setMOMEY(rs.getLong("MOMEY"));
	              // 2009.8.6 �߰� end
              
	              return objProductBean;
            }
	} 
      
     
	//    �ΰ����� - �⵵�� �հ� ����Ʈ
	 protected class cal_sum_infoListQuery extends MappingSqlQuery {
          protected cal_sum_infoListQuery(DataSource ds) {
        	super(ds, getMessageSourceAccessor().getMessage("Querys.jumyong.junggi.cal_sum_infoList"));

        		declareParameter(new SqlParameter(Types.VARCHAR));
        		declareParameter(new SqlParameter(Types.VARCHAR));
	  	      	declareParameter(new SqlParameter(Types.INTEGER));
		    	declareParameter(new SqlParameter(Types.INTEGER));
 
          }
            protected Object mapRow(ResultSet rs, int rownum) throws SQLException {
	            	
              ProductBean objProductBean = new ProductBean();
            	 
              objProductBean.setADMIN_NO(rs.getString("ADMIN_NO"));      
              objProductBean.setSEQ(rs.getString("SEQ"));
              objProductBean.setYEAR(rs.getString("YEAR"));
              objProductBean.setAREA(rs.getFloat("AREA"));
              objProductBean.setSUM_ADJUST(rs.getInt("SUM_ADJUST"));
              objProductBean.setREDUCTION_SUM(rs.getInt("SUM"));
              objProductBean.setUSE_SECTION(rs.getString("USE_SECTION"));	              
              objProductBean.setUSE_SECTIONNAME(rs.getString("USE_SECTIONNAME"));
              objProductBean.setREDUCTION_RATE(rs.getFloat("REDUCTION_RATE"));
              objProductBean.setREDUCTION_REASON(rs.getString("REDUCTION_REASON"));
              objProductBean.setPERCENT_RATE(rs.getFloat("PERCENT_RATE"));
              objProductBean.setPERCENT_REASON(rs.getString("PERCENT_REASON"));
              objProductBean.setTAX_SET_NAME(rs.getString("TAX_SET_NAME"));
               
              return objProductBean;
            }
        } 
      
      	 //    �ΰ����� - �⵵�� �հ� ����Ʈ
		 protected class ImpositionSumListByYearQuery extends MappingSqlQuery {
	          protected ImpositionSumListByYearQuery(DataSource ds) {
	        	super(ds, getMessageSourceAccessor().getMessage("Querys.jumyong.junggi.ImpositionSumListByYear"));
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
	              objProductBean.setSUM_LASTYEAR(rs.getInt("SUM_LASTYEAR"));
	              objProductBean.setSUM_YEAR(rs.getInt("SUM_YEAR"));            
	              objProductBean.setSUM_ADJUST(rs.getInt("SUM_ADJUST"));
	              objProductBean.setAREA_AFTER(rs.getFloat("AREA_AFTER"));
	              objProductBean.setUSE_SECTIONNAME(rs.getString("USE_SECTIONNAME"));
	              objProductBean.setUSE_SECTION(rs.getString("USE_SECTION"));
	              objProductBean.setSEQ(rs.getString("SEQ"));
	              
	              return objProductBean;
	            }
	        } 
		 
//		 SELECT C.SEQ,C.FIRST_SEQ,A.YEAR,C.CAL_YEAR,C.AREA_AFTER,C.SUM_ADJUST,C.USE_SECTION, R1.NAME \	
//			����� ���� ����Ʈ					
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
	              objProductBean.setAREA_AFTER(rs.getFloat("AREA_AFTER"));
	              objProductBean.setSUM_ADJUST(rs.getInt("SUM_ADJUST"));
	              objProductBean.setUSE_SECTION(rs.getString("USE_SECTION"));
	              objProductBean.setUSE_SECTIONNAME(rs.getString("NAME"));
	              objProductBean.setCAL_YN(rs.getString("CAL_YN"));
	              return objProductBean;
	            }
	        }
	
//		CAL_SUM_INFO ���̺� ���� �߰� ������Ʈ		 
///////////////////////////////////////////////���⹰ �ΰ�
	//���⹰ �Է�
	class CalSumAddUpdate extends SqlUpdate {
		public CalSumAddUpdate(DataSource dataSource) {	        	
	//(ADMIN_NO, SEQ, YEAR, AREA, SUM_ADJUST,VAT,REDUCTION_RATE,SUM,USE_SECTION,REDUCTION_REASON) \
		super(dataSource, getMessageSourceAccessor().getMessage("Querys.jumyong.junggi.cal_sum_addUpdate"));
			declareParameter(new SqlParameter(Types.FLOAT));	//area
			declareParameter(new SqlParameter(Types.INTEGER));	//sum_adjust
			declareParameter(new SqlParameter(Types.INTEGER));	//vat
			declareParameter(new SqlParameter(Types.INTEGER));	//sum_adjust
			declareParameter(new SqlParameter(Types.VARCHAR));	//FORM_ADJUST
			declareParameter(new SqlParameter(Types.INTEGER));	//seq
		}
	}
	
//	CAL_SUM_INFO ���̺� ���� �߰� ������Ʈ		 
//UPDATE CAL_SUM_INFO SET REDUCTION_RATE = ? , REDUCTION_REASON = ? , SUM = TRUNC(SUM_ADJUST * (100-?)/10000,0)*100 \
//	, VAT = TRUNC(SUM_ADJUST * (100-?)/10000,0)*10 \	WHERE SEQ = ?	
///////////////////////////////////////////////���⹰ �ΰ�
//���⹰ �Է�
	class CalSumReductionUpdate extends SqlUpdate {
		public CalSumReductionUpdate(DataSource dataSource) {	        	
			//(ADMIN_NO, SEQ, YEAR, AREA, SUM_ADJUST,VAT,REDUCTION_RATE,SUM,USE_SECTION,REDUCTION_REASON) \
			super(dataSource, getMessageSourceAccessor().getMessage("Querys.jumyong.junggi.cal_sum_reductionUpdate"));
			declareParameter(new SqlParameter(Types.FLOAT));	//REDUCTION_RATE
			declareParameter(new SqlParameter(Types.VARCHAR));	//REDUCTION_REASON
			declareParameter(new SqlParameter(Types.FLOAT));	//REDUCTION_RATE
			declareParameter(new SqlParameter(Types.FLOAT));	//REDUCTION_RATE
			declareParameter(new SqlParameter(Types.INTEGER));	//seq
		}
	}		
			 

//	SUM_ADJUST, AREA_AFTER �հ� SUM_SEQ��				
 protected class SumBysumSeqQuery extends MappingSqlQuery {
      protected SumBysumSeqQuery(DataSource ds) {
    	super(ds, getMessageSourceAccessor().getMessage("Querys.jumyong.junggi.getSumBysumseq"));
    	declareParameter(new SqlParameter(Types.VARCHAR));
      }
        protected Object mapRow(ResultSet rs, int rownum) throws SQLException {
        	
          ProductBean objProductBean = new ProductBean();
          
          objProductBean.setAREA_AFTER(rs.getFloat("AREA_AFTER"));
          objProductBean.setSUM_ADJUST(rs.getInt("SUM_ADJUST"));
          
          return objProductBean;
        }
    }
 
//	SUM_ADJUST, AREA_AFTER �հ� SUM_SEQ��				
 protected class GetReductionInfoQuery extends MappingSqlQuery {
      protected GetReductionInfoQuery(DataSource ds) {
    	super(ds, getMessageSourceAccessor().getMessage("Querys.jumyong.junggi.getReduction"));
    	declareParameter(new SqlParameter(Types.INTEGER));	//seq
    	declareParameter(new SqlParameter(Types.VARCHAR));	//admin_no
      }
        protected Object mapRow(ResultSet rs, int rownum) throws SQLException {
        	
          ProductBean objProductBean = new ProductBean();
          
          objProductBean.setREDUCTION_RATE(rs.getFloat("REDUCTION_RATE"));
          objProductBean.setREDUCTION_REASON(rs.getString("REDUCTION_REASON"));
          objProductBean.setSEQ(rs.getString("SEQ"));
          objProductBean.setYEAR(rs.getString("YEAR"));
          
          return objProductBean;
        }
    }
 
 

//(year fromdate todate update cal_sum_seq admin_no) \
 class CalculationTempInsertQuery extends SqlUpdate {
     public CalculationTempInsertQuery(DataSource dataSource) {	        	
     	super(dataSource, getMessageSourceAccessor().getMessage("Querys.jumyong.junggi.junggiCalculationTempInsert"));
        declareParameter(new SqlParameter(Types.VARCHAR));	//YEAR
   		declareParameter(new SqlParameter(Types.VARCHAR));	//FROMDATE
   		declareParameter(new SqlParameter(Types.VARCHAR));	//TODATE
   		declareParameter(new SqlParameter(Types.VARCHAR));	//UP_DATE
   		declareParameter(new SqlParameter(Types.INTEGER));	//CAL_SUM_SEQ
   		declareParameter(new SqlParameter(Types.VARCHAR));	//ADMIN_NO
   		declareParameter(new SqlParameter(Types.VARCHAR));	//YEAR - 1
     }
 }   
 
 
 
 // 2009.8.7 �߰� taxation_info insert
//	�ΰ����� �Է�
 public	boolean	executeBugwa_Register(ProductBean Bean)
	{
 	
		try
		{
			Object[] values = {
					Bean.getADMIN_NO(),
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
					
					Bean.getTAXPAYER_ID()
				};
	    	
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
			super(dataSource, getMessageSourceAccessor().getMessage("Querys.jumyong.junggi.Bugwa_Register"));
	     	
			declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));

            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
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
	
	
	// �ΰ����� ����Ʈ 
    public List ImpositionInfoByCalSumList_multi(String admin_no, String year)
	{	
    	System.out.println("ImpositionInfoByCalSumList_multi :: admin_no== " + admin_no );
    	System.out.println("ImpositionInfoByCalSumList_multi :: year ==== " + year);
		
    	Object[] values= { admin_no, year };
		List list1 = objImpositionInfoListQuery_multi.execute(values);    	
    	
		return list1;    	
	}
//  �ΰ����� ����Ʈ
    protected class ImpositionInfoListQuery_multi extends MappingSqlQuery {
        protected ImpositionInfoListQuery_multi(DataSource ds) {
      	super(ds, getMessageSourceAccessor().getMessage("Querys.jumyong.junggi.impositionInfoList_multi"));
	      	declareParameter(new SqlParameter(Types.VARCHAR));  
	      	declareParameter(new SqlParameter(Types.VARCHAR));
        }
          protected Object mapRow(ResultSet rs, int rownum) throws SQLException {
           
            ProductBean objProductBean = new ProductBean();
            
            objProductBean.setYEAR(rs.getString("YEAR"));
            objProductBean.setPRICE(rs.getLong("PRICE"));
            objProductBean.setAREA_AFTER(rs.getFloat("AREA_AFTER"));
            objProductBean.setRATE(rs.getFloat("RATE"));
            objProductBean.setFROMDATE(rs.getString("FROMDATE"));
            objProductBean.setTODATE(rs.getString("TODATE"));
            objProductBean.setSUM_LASTYEAR(rs.getInt("SUM_LASTYEAR"));
            objProductBean.setSUM_YEAR(rs.getInt("SUM_YEAR"));
            objProductBean.setREDUCTION_SUM(rs.getInt("REDUCTION_SUM"));
            objProductBean.setREDUCTION_FORM(rs.getString("REDUCTION_FORM"));
            objProductBean.setSUM_ADJUST(rs.getInt("SUM_ADJUST"));
            objProductBean.setFORM(rs.getString("FORM"));
            objProductBean.setFORM_ADJUST(rs.getString("FORM_ADJUST"));
            objProductBean.setPERIOD(rs.getInt("PERIOD"));
            objProductBean.setSEQ(rs.getString("CSEQ"));
            objProductBean.setUSE_SECTION(rs.getString("USE_SECTION"));
            
           
            return objProductBean;
          }
      }
    
    
    
//  �ΰ����� - �⵵�� 
    public ProductBean impositionInfo_tax(String seq, String admin_no, String year)
	{	
    	Object[] values = {seq, admin_no, year};
    	ProductBean pb = null;
    	
    	System.out.println("�ΰ�����seq === " + seq);
    	System.out.println("�ΰ�����admin_no=== " + admin_no);
    	System.out.println("�ΰ�����year  ===== " + year);
    	
    	try{

    		pb = (ProductBean) objImpositionInfoQuery_tax.findObject(values);
    		return pb;
    	
    	}catch(final DataAccessException e){
    		return null;
        }
	}
   	
//  �ΰ����� ������ ����
    protected class ImpositionInfoQuery_tax extends MappingSqlQuery {
        protected ImpositionInfoQuery_tax(DataSource ds) {
      	super(ds, getMessageSourceAccessor().getMessage("Querys.jumyong.junggi.impositionInfo_tax"));
	      	declareParameter(new SqlParameter(Types.VARCHAR));
	      	declareParameter(new SqlParameter(Types.VARCHAR));
	      	declareParameter(new SqlParameter(Types.VARCHAR));
        }
          protected Object mapRow(ResultSet rs, int rownum) throws SQLException {
            ProductBean objProductBean = new ProductBean();
            
            objProductBean.setYEAR(rs.getString("YEAR"));
            objProductBean.setPRICE(rs.getLong("PRICE"));
            objProductBean.setAREA_AFTER(rs.getFloat("AREA_AFTER"));
            objProductBean.setRATE(rs.getFloat("RATE"));
            objProductBean.setFROMDATE(rs.getString("FROMDATE"));
            objProductBean.setTODATE(rs.getString("TODATE"));
            objProductBean.setSUM_LASTYEAR(rs.getInt("SUM_LASTYEAR"));
            objProductBean.setSUM_YEAR(rs.getInt("SUM_YEAR"));            
            objProductBean.setSUM_ADJUST(rs.getInt("SUM_ADJUST"));
            objProductBean.setFORM(rs.getString("FORM"));
            objProductBean.setFORM_ADJUST(rs.getString("FORM_ADJUST"));              
            objProductBean.setPERIOD(rs.getInt("PERIOD"));
            objProductBean.setSEQ(rs.getString("SEQ"));
            objProductBean.setADJUSTMENT(rs.getFloat("ADJUSTMENT"));
            objProductBean.setFIRST_SEQ(rs.getString("FIRST_SEQ"));
            objProductBean.setUSE_SECTION(rs.getString("USE_SECTION"));
            objProductBean.setUSE_SECTIONNAME(rs.getString("NAME"));
            
            // 2009.8.6 �߰� start
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
            objProductBean.setCAL_SUM_SEQ(rs.getString("CAL_SUM_SEQ"));
            objProductBean.setTAX_YN(rs.getString("TAX_YN"));
            objProductBean.setSUBUSEO_CD(rs.getString("SUBUSEO_CD"));
            //objProductBean.setSUM(rs.getInt("SUM"));
            objProductBean.setLIVE(rs.getString("LIVE"));
            objProductBean.setCHECK_YN(rs.getString("CHECK_YN"));
            objProductBean.setYOYUL(rs.getFloat("YOYUL"));
            objProductBean.setMOMEY(rs.getLong("MOMEY"));
            objProductBean.setSECTION(rs.getString("SECTION"));
            objProductBean.setSURCHARGE_RATE(rs.getFloat("SURCHARGE_RATE"));
            objProductBean.setADD_SET(rs.getString("ADD_SET"));
            objProductBean.setADD_YN(rs.getString("ADD_YN"));
            objProductBean.setREDUCTION_FORM(rs.getString("REDUCTION_FORM"));
            objProductBean.setREDUCTION_SUM(rs.getInt("REDUCTION_SUM"));
            objProductBean.setREDUCTION_RATE(rs.getFloat("REDUCTION_RATE"));
            objProductBean.setREDUCTION_REASON(rs.getString("REDUCTION_REASON"));
            objProductBean.setPERCENT_RATE(rs.getFloat("PERCENT_RATE"));
            objProductBean.setPERCENT_REASON(rs.getString("PERCENT_REASON"));
            objProductBean.setAREA_SIZE(rs.getFloat("AREA_SIZE"));
            objProductBean.setVAT(rs.getString("VAT"));
            //type �߰�
            objProductBean.setTYPE(rs.getString("TYPE"));
            //wsp �߰�
            objProductBean.setWSP_YN(rs.getString("WSP_YN"));
            objProductBean.setWITH_SUM_PRICE(rs.getString("WITH_SUM_PRICE"));
            
            objProductBean.setPURPOSE_CD(rs.getString("PURPOSE_CD"));
           
            objProductBean.setOLD_REDUCTION_RATE(rs.getFloat("OLD_REDUCTION_RATE"));
            objProductBean.setOLD_REDUCTION_REASON(rs.getString("OLD_REDUCTION_REASON"));
            objProductBean.setOLD_PERCENT_RATE(rs.getFloat("OLD_PERCENT_RATE"));
            objProductBean.setOLD_PERCENT_REASON(rs.getString("OLD_PERCENT_REASON"));            
            
            
            return objProductBean;
          }
      } 
    
//  �ΰ����� - ���� �հ�-����� 
    public int getProductAreaSum_year(String admin_no, String year)
	{	
    	Object[] values = {admin_no,year};
    	String sql = getMessageSourceAccessor().getMessage("Querys.jumyong.junggi.getProductAreaSum_year");
    	int returnNum = getJdbcTemplate().queryForInt(sql,values);
    	return returnNum;
	} 
    
    
//  ��������ڵ�� �ڵ�� ��������
    public String getPurposeNm(String type, String cd)
	{
    	Object[] values = {type, cd};
    	String sql = getMessageSourceAccessor().getMessage("Querys.gapan.junggi.getPurposeNm");
    	//System.out.println(getMessageSourceAccessor().getMessage("Querys.gapan.sugeo.getPurposeNm"));
    	
    	Map returnYear = getJdbcTemplate().queryForMap(sql,values);    	
    	
    	String nm = returnYear.get("CLASS_NM").toString();
    	
		return nm;   

	}
		
//	cal_sum_info tax_seq�� seq�� set   
    public int SetCal_Sum_Info_taxseq(String strSeq)
	{	
    	//System.out.println("String strSeq ==== " + strSeq);
		
    	Object[] values= { strSeq, strSeq };
    	int result = objSetCal_Sum_Info_taxseq.update(values);    	
    	
		return result;    	
	}
//  �ΰ����� ����Ʈ
    protected class SetCal_Sum_Info_taxseq_update extends	SqlUpdate {
        protected SetCal_Sum_Info_taxseq_update(DataSource ds) {
      	super(ds, getMessageSourceAccessor().getMessage("Querys.gapan.junggi.updateTaxseq"));
	      	declareParameter(new SqlParameter(Types.VARCHAR));  
	      	declareParameter(new SqlParameter(Types.VARCHAR));
        }
        
      }
    
    // TAXATION_INFO ����
	public boolean updateTaxation_info(ProductBean objProductBean)
	{
	
		try{
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
					, objProductBean.getADMIN_NO()
   					, objProductBean.getCAL_SUM_SEQ()
   					
   				};	
   			

   			objUpdateTaxation_info.update(values);
			
			
		} catch (Exception e) {
			System.out.println(e.toString());
			e.printStackTrace();
		}		
		return true;
	}

	public class UpdateTaxation_info extends SqlUpdate {
		public UpdateTaxation_info(DataSource dataSource)  throws SQLException{	        	
			super(dataSource, getMessageSourceAccessor().getMessage("Querys.junggi.taxation_infoUpdate"));
				
				declareParameter(new SqlParameter(Types.VARCHAR));
				declareParameter(new SqlParameter(Types.VARCHAR));
				declareParameter(new SqlParameter(Types.VARCHAR));
				declareParameter(new SqlParameter(Types.VARCHAR));
				declareParameter(new SqlParameter(Types.VARCHAR));
				
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
	
	
	public int CalSumReductionUpdate_noPermission(ProductBean objProductBean)
    {	
    	
    	int i = 0;
		try{
		
			Object[] values = {		
					new Float(objProductBean.getREDUCTION_RATE())
				,	objProductBean.getREDUCTION_REASON()
				,	new Float(objProductBean.getREDUCTION_RATE())
				,	new Float(objProductBean.getREDUCTION_RATE())
				,	new Float(objProductBean.getREDUCTION_RATE())
				,	new Float(objProductBean.getREDUCTION_RATE())
				,	objProductBean.getADMIN_NO()
				,	new Integer(objProductBean.getSEQ())
					
			};
			
			i = objCalSumReductionUpdate_noPermission.update(values);
			
			
		} catch (Exception e) {
			System.out.println(e.toString());
			e.printStackTrace();
		}
		return i;	
    }
	
	class CalSumReductionUpdate_noPermission extends SqlUpdate {
		public CalSumReductionUpdate_noPermission(DataSource dataSource) {	        	
			//(ADMIN_NO, SEQ, YEAR, AREA, SUM_ADJUST,VAT,REDUCTION_RATE,SUM,USE_SECTION,REDUCTION_REASON) \
			super(dataSource, getMessageSourceAccessor().getMessage("Querys.jumyong.junggi.cal_sum_reductionUpdate_noPermission"));
			declareParameter(new SqlParameter(Types.FLOAT));	//REDUCTION_RATE
			declareParameter(new SqlParameter(Types.VARCHAR));	//REDUCTION_REASON
			declareParameter(new SqlParameter(Types.FLOAT));	//REDUCTION_RATE
			declareParameter(new SqlParameter(Types.FLOAT));	//REDUCTION_RATE
			declareParameter(new SqlParameter(Types.FLOAT));	//REDUCTION_RATE
			declareParameter(new SqlParameter(Types.FLOAT));	//REDUCTION_RATE
			declareParameter(new SqlParameter(Types.VARCHAR));	//ADMIN_NO
			declareParameter(new SqlParameter(Types.INTEGER));	//seq
		}
	}
	
	
	// CAL_SUM_INFO ����
	public boolean CalSumUpdate(ProductBean objProductBean)
	{
	
		try{
			
   			Object[] values = {
   					new Float(objProductBean.getAREA_AFTER())
					, new Long(objProductBean.getSUM_ADJUST())
					, objProductBean.getVAT()
					, new Float(objProductBean.getPERCENT_RATE())
					, new Float(objProductBean.getREDUCTION_RATE())
   					, new Long(objProductBean.getREDUCTION_SUM())
   					
   					, objProductBean.getUSE_SECTION()
   					, objProductBean.getPERCENT_REASON()
   					, objProductBean.getREDUCTION_REASON()
   					, new Long(objProductBean.getPRICE())
   					, new Float(objProductBean.getRATE())
   					, objProductBean.getFORM_ADJUST()
					
   					, objProductBean.getFROMDATE()
   					, objProductBean.getTODATE()
   					, objProductBean.getCAL_SUM_SEQ()
   					, objProductBean.getADMIN_NO()
   					
   				};
   			
   			for(int i = 0;i<values.length;i++){
   				System.out.println("CalSumUpdate"+values[i]);
   			}
   			

   			objCalSumUpdate.update(values);
			
			
		} catch (Exception e) {
			System.out.println(e.toString());
			e.printStackTrace();
		}		
		return true;
	}

	public class CalSumUpdate extends SqlUpdate {
		public CalSumUpdate(DataSource dataSource)  throws SQLException{	        	
			super(dataSource, getMessageSourceAccessor().getMessage("Querys.junggi.CalSumUpdate"));
				
				declareParameter(new SqlParameter(Types.FLOAT));
				declareParameter(new SqlParameter(Types.INTEGER));
				declareParameter(new SqlParameter(Types.VARCHAR));
				declareParameter(new SqlParameter(Types.FLOAT));
				declareParameter(new SqlParameter(Types.FLOAT));
				declareParameter(new SqlParameter(Types.INTEGER));
				
				declareParameter(new SqlParameter(Types.VARCHAR));
				declareParameter(new SqlParameter(Types.VARCHAR));
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
	
	
	//����� ��ȸ ����Ʈ
    protected class JunggiSearchListQuery_AllCal extends MappingSqlQuery {
    	
        protected JunggiSearchListQuery_AllCal(DataSource ds) {
        	super(ds, getMessageSourceAccessor().getMessage("Querys.jumyong.junggi.periodicalList_AllCal"));
	      	
        	//System.out.println("!!QQQuerys.jumyong.junggi.periodicalList_AllCal");
	      	declareParameter(new SqlParameter(Types.VARCHAR));
	      	declareParameter(new SqlParameter(Types.VARCHAR));
	      	declareParameter(new SqlParameter(Types.VARCHAR));
	      	declareParameter(new SqlParameter(Types.VARCHAR));
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
          //********** BEGIN_����_20120216
            /*
 objJumyongBean.setYEAR(rs.getString("YEAR"));            
            objJumyongBean.setADMIN_NO(rs.getString("ADMIN_NO"));
            objJumyongBean.setADMIN_NO2(rs.getString("ADMIN_NO2"));
            objJumyongBean.setNAME(rs.getString("NAME"));
            objJumyongBean.setPURPOSE_CD(rs.getString("PURPOSE_CD"));
            objJumyongBean.setBONBUN(rs.getString("BONBUN"));
            objJumyongBean.setBUBUN(rs.getString("BUBUN"));
            objJumyongBean.setWITH_ADDR1(rs.getString("WITH_ADDR1"));
            objJumyongBean.setSUM_ADJUST(rs.getString("SUM_ADJUST"));
            objJumyongBean.setSUM(rs.getString("SUM"));
            objJumyongBean.setAREA(rs.getFloat("AREA"));
            objJumyongBean.setFROMDATE(rs.getString("FROMDATE"));
            objJumyongBean.setTODATE(rs.getString("TODATE"));
            objJumyongBean.setRATE(rs.getString("RATE"));
            objJumyongBean.setPRICE(rs.getString("PRICE"));
            objJumyongBean.setLAST_FROMDATE(rs.getString("LAST_FROMDATE"));
            objJumyongBean.setLAST_TODATE(rs.getString("LAST_TODATE"));
            objJumyongBean.setTAX_NO(rs.getString("TAX_NO"));
            objJumyongBean.setTAX_YN(rs.getString("TAX_YN"));
            objJumyongBean.setBJ_NM(rs.getString("BJ_NM"));
            objJumyongBean.setTYPE(rs.getString("TYPE"));
            objJumyongBean.setSECTION(rs.getString("SECTION"));
            objJumyongBean.setSECTION_NAME(rs.getString("SECTION_NAME"));
            objJumyongBean.setTAX_SET(rs.getString("TAX_SET"));
            objJumyongBean.setFORM_ADJUST(rs.getString("FORM_ADJUST"));
            objJumyongBean.setPURPOSE_CLASSNM(rs.getString("PURPOSE_NM"));
            
            objJumyongBean.setSIGU_CD(rs.getString("SIGU_CD"));
            objJumyongBean.setBJ_CD(rs.getString("BJ_CD"));
            objJumyongBean.setDEPT_CD(rs.getString("DEPT_CD"));
            objJumyongBean.setTAX_GUBUN(rs.getString("TAX_GUBUN"));
            objJumyongBean.setOBJ_SET(rs.getString("OBJ_SET"));            
            objJumyongBean.setTAXPAYER_ID(rs.getString("TAXPAYER_ID"));
            objJumyongBean.setTAXPAYER_SET(rs.getString("TAXPAYER_SET"));
            objJumyongBean.setOCR_SIGU_CD(rs.getString("OCR_SIGU_CD"));
            objJumyongBean.setOCR_BUSEO_CD(rs.getString("OCR_BUSEO_CD"));
            objJumyongBean.setTAX_CD(rs.getString("TAX_CD"));
            objJumyongBean.setLIVE(rs.getString("LIVE"));
            objJumyongBean.setADD_SET(rs.getString("ADD_SET"));
            objJumyongBean.setADD_YN(rs.getString("ADD_YN"));
            objJumyongBean.setSUM_LASTYEAR(rs.getString("SUM_LASTYEAR"));
            objJumyongBean.setPERCENT_RATE(rs.getString("PERCENT_RATE"));
            objJumyongBean.setREDUCTION_RATE(rs.getString("REDUCTION_RATE"));
            objJumyongBean.setSUBUSEO_CD(rs.getString("SUBUSEO_CD"));
            objJumyongBean.setPERCENT_REASON(rs.getString("PERCENT_REASON"));
            objJumyongBean.setREDUCTION_REASON(rs.getString("REDUCTION_REASON"));
            objJumyongBean.setSURCHARGE_RATE(rs.getFloat("SURCHARGE_RATE"));
            objJumyongBean.setAREA_AFTER(rs.getFloat("AREA_AFTER"));
            objJumyongBean.setMAX_TAX_NO(rs.getString("MAX_TAX_NO"));
            
            objJumyongBean.setOLD_PRICE(rs.getString("PRICE"));
            objJumyongBean.setOLD_AREA_SIZE(rs.getFloat("AREA_AFTER"));
            objJumyongBean.setOLD_RATE(rs.getString("OLD_RATE"));
            objJumyongBean.setROAD_ADDR(rs.getString("ROAD_ADDR"));
            
            objJumyongBean.setSI(rs.getString("SI"));
            objJumyongBean.setGUN(rs.getString("GUN"));
            objJumyongBean.setDORO_NM(rs.getString("BD_NM"));
            objJumyongBean.setBD_NM(rs.getString("BD_NM"));
            objJumyongBean.setBD_DET_NM(rs.getString("BD_DET_NM"));
              
            objJumyongBean.setBD_BON(rs.getString("BD_BON"));
            objJumyongBean.setBD_BU(rs.getString("BU"));
             */
            objJumyongBean.setYEAR(rs.getString("YEAR"));            
            objJumyongBean.setADMIN_NO(rs.getString("ADMIN_NO"));
            objJumyongBean.setADMIN_NO2(rs.getString("ADMIN_NO2"));
            objJumyongBean.setNAME(rs.getString("NAME"));
            objJumyongBean.setPURPOSE_CD(rs.getString("PURPOSE_CD"));
            objJumyongBean.setBONBUN(rs.getString("BONBUN"));
            objJumyongBean.setBUBUN(rs.getString("BUBUN"));
            objJumyongBean.setWITH_ADDR1(rs.getString("WITH_ADDR1"));
            objJumyongBean.setSUM_ADJUST(rs.getString("SUM_ADJUST"));
            objJumyongBean.setSUM(rs.getString("SUM"));
            objJumyongBean.setAREA(rs.getFloat("AREA"));
            objJumyongBean.setFROMDATE(rs.getString("FROMDATE"));
            objJumyongBean.setTODATE(rs.getString("TODATE"));
            objJumyongBean.setRATE(rs.getString("RATE"));
            objJumyongBean.setPRICE(rs.getString("PRICE"));
            objJumyongBean.setLAST_FROMDATE(rs.getString("LAST_FROMDATE"));
            objJumyongBean.setLAST_TODATE(rs.getString("LAST_TODATE"));
            objJumyongBean.setTAX_NO(rs.getString("TAX_NO"));
            objJumyongBean.setTAX_YN(rs.getString("TAX_YN"));
            objJumyongBean.setBJ_NM(rs.getString("BJ_NM"));
            objJumyongBean.setTYPE(rs.getString("TYPE"));
            objJumyongBean.setSECTION(rs.getString("SECTION"));
            objJumyongBean.setSECTION_NAME(rs.getString("SECTION_NAME"));
            objJumyongBean.setTAX_SET(rs.getString("TAX_SET"));
            objJumyongBean.setFORM_ADJUST(rs.getString("FORM_ADJUST"));
            objJumyongBean.setPURPOSE_CLASSNM(rs.getString("PURPOSE_NM"));
            
            objJumyongBean.setSIGU_CD(rs.getString("SIGU_CD"));
            objJumyongBean.setBJ_CD(rs.getString("BJ_CD"));
            objJumyongBean.setDEPT_CD(rs.getString("DEPT_CD"));
            objJumyongBean.setTAX_GUBUN(rs.getString("TAX_GUBUN"));
            objJumyongBean.setOBJ_SET(rs.getString("OBJ_SET"));            
            objJumyongBean.setTAXPAYER_ID(rs.getString("TAXPAYER_ID"));
            objJumyongBean.setTAXPAYER_SET(rs.getString("TAXPAYER_SET"));
            objJumyongBean.setOCR_SIGU_CD(rs.getString("OCR_SIGU_CD"));
            objJumyongBean.setOCR_BUSEO_CD(rs.getString("OCR_BUSEO_CD"));
            objJumyongBean.setTAX_CD(rs.getString("TAX_CD"));
            objJumyongBean.setLIVE(rs.getString("LIVE"));
            objJumyongBean.setADD_SET(rs.getString("ADD_SET"));
            objJumyongBean.setADD_YN(rs.getString("ADD_YN"));
            objJumyongBean.setSUM_LASTYEAR(rs.getString("SUM_LASTYEAR"));
            objJumyongBean.setPERCENT_RATE(rs.getString("PERCENT_RATE"));
            objJumyongBean.setREDUCTION_RATE(rs.getString("REDUCTION_RATE"));
            objJumyongBean.setSUBUSEO_CD(rs.getString("SUBUSEO_CD"));
            objJumyongBean.setPERCENT_REASON(rs.getString("PERCENT_REASON"));
            objJumyongBean.setREDUCTION_REASON(rs.getString("REDUCTION_REASON"));
            objJumyongBean.setSURCHARGE_RATE(rs.getFloat("SURCHARGE_RATE"));
            objJumyongBean.setAREA_AFTER(rs.getFloat("AREA_AFTER"));
            objJumyongBean.setMAX_TAX_NO(rs.getString("MAX_TAX_NO"));
            
            objJumyongBean.setOLD_PRICE(rs.getString("PRICE"));
            objJumyongBean.setOLD_AREA_SIZE(rs.getFloat("AREA_AFTER"));
            objJumyongBean.setOLD_RATE(rs.getString("OLD_RATE"));
            objJumyongBean.setROAD_ADDR(rs.getString("ROAD_ADDR"));
            
          //********** END_����_20120216
           
         // 201602 KNY
            objJumyongBean.setOWNER_SET_NM(rs.getString("OWNER_SET_NM"));
            
            
            return objJumyongBean;
          }
      } 
    
    // ������ �������� xml ���ϱ�
    public	List	executeTotal_With(String adminNo)
	{
    
    	Object[] values = {adminNo};
    	
    	return objexecuteTotalWithQuery.execute(values);
	}
    
    //	������ ��� ��������
    protected class executeTotalWithQuery extends MappingSqlQuery {
    	
        protected executeTotalWithQuery(DataSource ds) {
        	super(ds, getMessageSourceAccessor().getMessage("Querys.jumyong.jumyonginfo.Total_With_List"));
	      	
        	declareParameter(new SqlParameter(Types.VARCHAR));
        }
        
          protected Object mapRow(ResultSet rs, int rownum) throws SQLException {
          	TotalWIthBean	Bean	= new TotalWIthBean();

			Bean.setADMIN_NO(rs.getString("ADMIN_NO"));
			Bean.setBJ_CD(rs.getString("BJ_CD"));
			Bean.setBONBUN(rs.getString("BONBUN"));
			Bean.setBUBUN(rs.getString("BUBUN"));
			Bean.setPRICE(rs.getString("PRICE"));
			
        	return	Bean;
          }
      } 
    
    //������ ��� �����
    public void executeDelete_With(String adminNo){
    	
  	
		try
		{
			Object[] values = {adminNo};

			objtotalWith_Delete.update(values);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
    	
    }




//������ ���� ����ϱ�
    public void executeRegister_With(TotalWIthBean bean){
    	try
		{
			Object[] values = {
					bean.getADMIN_NO(),
					bean.getBJ_CD(),
					bean.getBONBUN(),
					bean.getBUBUN(),
					bean.getPRICE()
			};

			objTotalWith_Register.update(values);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
    	
    }
    
    
    public class TotalWith_Register extends SqlUpdate {
		public TotalWith_Register(DataSource dataSource)  throws SQLException{	        	
			super(dataSource, getMessageSourceAccessor().getMessage("Querys.jumyong.jumyonginfo.TotalWith_Register"));
			declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.VARCHAR));

        }
    }
    
    public class totalWith_Delete extends SqlUpdate {
    	public totalWith_Delete(DataSource dataSource)  throws SQLException{	        	
			super(dataSource, getMessageSourceAccessor().getMessage("Querys.jumyong.jumyonginfo.TotalWith_Delete"));
			declareParameter(new SqlParameter(Types.VARCHAR));

		}
	}
    
	//place�� with_sum_price ������Ʈ
	public void updateWith_Sum_Addr(String adminNo, String price,String WITH_ADDR1,String WITH_ADDR2){
			Object[] values = {new Integer(price),WITH_ADDR1,WITH_ADDR2,adminNo};
			
			objUpdateWithSumAddr.update(values);
					
	}
	
	public class UpdateWithSumAddr extends SqlUpdate {
		public UpdateWithSumAddr(DataSource dataSource)  throws SQLException{	        	
			super(dataSource, getMessageSourceAccessor().getMessage("Querys.junggi.WithSumAddrUpdate"));
			declareParameter(new SqlParameter(Types.INTEGER));		
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
							
		}
	}
	
	
    public String removeDash(String val1) {
        String[] components = val1.split("-");
        String returnVal = "";
        for (int i = 0; i < components.length; i++) {
            returnVal = returnVal + components[i].toString();
        }

        return returnVal;
    }

    
    
    
}