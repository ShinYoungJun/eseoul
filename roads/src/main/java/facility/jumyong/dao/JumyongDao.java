


package main.java.facility.jumyong.dao;
 

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.List;
import java.util.Map;
import javax.sql.DataSource;
import main.java.common.dao.RoadsJdbcDaoSupport;
import main.java.common.util.*;
import main.java.common.util.catUtil.Util;
//import gov.mogaha.rnic.common.model.RnicBoardBean;


import main.java.facility.jumyong.model.jumyongBean;
import main.java.facility.jumyong.model.Equip_ProductBean;
import main.java.jumyong.jumyong.model.DisUseBean;


import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.MappingSqlQuery;
import org.springframework.jdbc.object.SqlUpdate;
import org.springframework.jdbc.core.support.SqlLobValue;
import org.springframework.jdbc.support.lob.OracleLobHandler;

public class JumyongDao extends RoadsJdbcDaoSupport implements IJumyongDao{
	private OracleLobHandler oracleLobHandler = null; 
	//점용조회 ////////////////////////////////////////////////////////////////////////////////////////	
	//	점용조회	
	private SearchListQuery objSearchListQuery = null;
//	산출 - 물건 리스트
    private ProductPlaceListQuery objProductPlaceListQuery  = null;
    private ProductPlaceBoardListQuery objProductPlaceBoardListQuery  = null;
    private ProductPlaceBoardCalListQuery objProductPlaceBoardCalListQuery = null;
    private ProductPlaceBoardListHanQuery objProductPlaceBoardListHanQuery = null;
//	산출 - 물건 정보
    private ProductPlaceInfoQuery objProductPlaceInfoQuery  = null;
//  산출  -EQUIP_CALCULATION 입력
    private Equip_CalculationInsertQuery objEquip_CalculationInsertQuery = null;    
//  산출  -EQUIP_CALCULATION 입력
    private Equip_Cal_SumInsertQuery objEquip_Cal_SumInsertQuery = null;	
//  Equip_CALCULATIONINFO
    private GetEquip_CalculationInfoQuery objGetEquip_CalculationInfoQuery  = null;    
//  Equip_CAL_SUM_INFO 추가 업데이트
    private Equip_Cal_Sum_AddUpdateQuery objEquip_Cal_Sum_AddUpdateQuery = null;
//	  Equip_CAL_SUM LIST
    private Equip_Cal_SumListQuery objEquip_Cal_SumListQuery = null;    
//	  Equip_Ca 추가 업데이트
    private Equip_CalculationUpdateQuery objEquip_CalculationUpdateQuery = null;
//	  EQUIP_PLACE 년도 업데이트   HAN 
    private Equip_PlaceUpdateQuery objEquip_PlaceUpdateQuery = null;
    
    private Equip_CalculationUpdateHanQuery objEquip_CalculationUpdateHanQuery = null;
    
    private GetCalMinMaxDateQuery objGetCalMinMaxDateQuery = null;
    
    private Equip_Cal_SumSeqQuery objEquip_Cal_SumSeqQuery = null;
    
    private	Util				util			= new Util();
    
    
    
    protected void initDao()  throws Exception {
		super.initDao();
		oracleLobHandler = new OracleLobHandler();		
		//점용조회 ////////////////////////////////////////////////////////////////////////////////////////		
		//점용조회		
		objSearchListQuery = new SearchListQuery(getDataSource());
//		산출 - 물건 리스트
		objProductPlaceListQuery = new ProductPlaceListQuery(getDataSource());
		objProductPlaceBoardListQuery = new ProductPlaceBoardListQuery(getDataSource());
		
		objProductPlaceBoardCalListQuery = new ProductPlaceBoardCalListQuery(getDataSource());
		objProductPlaceBoardListHanQuery = new ProductPlaceBoardListHanQuery(getDataSource());
//		산출 - 물건 정보
	    objProductPlaceInfoQuery  = new ProductPlaceInfoQuery(getDataSource());
//	  산출  -EQUIP_CALCULATION 입력
	    objEquip_CalculationInsertQuery = new Equip_CalculationInsertQuery(getDataSource());
//	  산출  -EQUIP_CALCULATION 입력
	    objEquip_Cal_SumInsertQuery = new Equip_Cal_SumInsertQuery(getDataSource());	
//	  Equip_CALCULATIONINFO
	    objGetEquip_CalculationInfoQuery = new GetEquip_CalculationInfoQuery(getDataSource());
//	  Equip_CAL_SUM_INFO 추가 업데이트
	    objEquip_Cal_Sum_AddUpdateQuery = new Equip_Cal_Sum_AddUpdateQuery(getDataSource());	 
//		  Equip_CAL_SUM LIST
	    objEquip_Cal_SumListQuery = new Equip_Cal_SumListQuery(getDataSource());
	    
// Equip_Cal_SumSeq 값 가져오는것	    
	    objEquip_Cal_SumSeqQuery = new Equip_Cal_SumSeqQuery(getDataSource());
	    
//		  Equip_CAL_SUM_INFO 추가 업데이트
	    objEquip_CalculationUpdateQuery = new Equip_CalculationUpdateQuery(getDataSource());	    	    
//		  EQUIP_PLACE 년도 업데이트   HAN 
	    objEquip_PlaceUpdateQuery  = new Equip_PlaceUpdateQuery(getDataSource());
	    
	    objEquip_CalculationUpdateHanQuery = new Equip_CalculationUpdateHanQuery(getDataSource());
	    
	    objGetCalMinMaxDateQuery = new GetCalMinMaxDateQuery(getDataSource());
   	}
    
    
    
	//점용조회 ////////////////////////////////////////////////////////////////////////////////////////
    //점용 조회
    public List searhList(String year, String req_nm,String checkYn,int intCurPage, String gu_code)
	{	
    	System.out.println("***********************JumyongDao SearchList.+++++++++++");
    	//(strYear, strReq_nm, "", Integer.valueOf(strCurrentPage).intValue(), gu_code);
    	if(year.equals(""))
    		year = "%";
    	else year = year+"%";

    	if(req_nm.equals(""))
    		req_nm = "%";
    	else req_nm = "%"+req_nm+"%";
    	
    	if(checkYn.equals(""))
    		checkYn = "%";    	    	    
    	
    	System.out.println("=-=-=-=-=-==-=-=-=");
    	System.out.println(year+" : "+req_nm+" : "+gu_code+" : "+intCurPage);
    	
    	
    	//Object[] values = {year, checkYn, req_nm, gu_code, new Integer(intCurPage), new Integer(10), new Integer(10)};    	
    	Object[] values = {
    			"검토",
    			"미검토",
    			gu_code,
    			gu_code,
    			gu_code,
    			gu_code,
    			year,
    			req_nm, 
    			new Integer(intCurPage), 
    			new Integer(10), 
    			new Integer(10)
    		};
    	
    	
    	
    	return objSearchListQuery.execute(values);
	}
    
    
//  점용 조회  카운트
    public int getsearhListCount(String year, String req_nm,String checkYn, String gu_code)
	{	
    	if(year.equals(""))
    		year = "%";
    	else year = year+"%";

    	if(req_nm.equals(""))
    		req_nm = "%";
    	else req_nm = req_nm+"%";
    	
    	
    	Object[] values = { gu_code, gu_code,year,req_nm,};
    	
    	String sql = getMessageSourceAccessor().getMessage("Querys.facility.occupancy.searchListCount");
    	int returnNum = getJdbcTemplate().queryForInt(sql,values);
    	return returnNum;
    	
	}
    
    public int Euip_CalculationCount(String gu_code,String corp_cd,String year,String admin_no){
    	
    	Object[] values = {gu_code,corp_cd,year,admin_no};
    	
    	String sql = getMessageSourceAccessor().getMessage("Querys.facility.occupancy.Euip_CalculationCount");
    	int returnNum = getJdbcTemplate().queryForInt(sql,values);
    	return returnNum;
    	
    }
    
    
//	산출 - 물건 리스트
    public List placeList(String gu_code, String corp_cd, String request_no,int intCurPage)
	{	
    	Object[] values = {gu_code, corp_cd, request_no, new Integer(intCurPage), new Integer(5)};		
    	return objProductPlaceListQuery.execute(values);
	}
    
//	산출 - 물건 리스트	
    public List placeBoardList(String gu_code, String corp_cd, String request_no,int intRn1, int intRn2)
	{	
    	Object[] values = {gu_code, corp_cd, request_no,new Integer(intRn1), new Integer(intRn2)};	
    	System.out.println(gu_code+"@@@@"+corp_cd+"@@@@"+request_no+"@@@@"+intRn1+"@@@@"+intRn2);
    	return objProductPlaceBoardListQuery.execute(values);
	}
    
  //일괄산출 시설물 리스트  
    public List placeBoardCalList(String gu_code, String corp_cd, String admin_no)
	{	
    	Object[] values = {gu_code, corp_cd, admin_no};
    	System.out.println("***********************JumyongDao placeBoardCalList.+++++++++++");
    	System.out.println("hoban : gu_code = " + gu_code);
    	System.out.println("hoban : corp_cd = " + corp_cd);
    	System.out.println("hoban : admin_no = " + admin_no);
    	System.out.println("***********************JumyongDao placeBoardCalList.+++++++++++");
    	return objProductPlaceBoardCalListQuery.execute(values);
	}
    
    
    public List placeBoardListHan(String gu_code,String corp_cd,String admin_no,String tax_set, int Rn1, int Rn2){
    	Object[] values = {gu_code, corp_cd, admin_no,tax_set.trim(),new Integer(Rn1), new Integer(Rn2)};	
    	
    	
    	System.out.println("=======(20111012)======");
    	System.out.println(gu_code+"/"+corp_cd+"/"+admin_no+"/"+tax_set.trim()+"/"+Rn1+"/"+Rn2);
    	
    	return objProductPlaceBoardListHanQuery.execute(values);
    }
    
//  점용 조회  카운트
    public int placeListCount(String gu_code, String corp_cd, String admin_no)
	{	
    	Object[] values = {gu_code, corp_cd, admin_no};	
    	String sql = getMessageSourceAccessor().getMessage("Querys.facility.occupancy.productPlaceListCount");
    	int returnNum = getJdbcTemplate().queryForInt(sql,values);
    	return returnNum;
    	
	}
    
	// 산출 - 시세/구세별  물건 리스트 카운트
    public int placeListTaxCount(String gu_code, String corp_cd, String admin_no, String tax_set){
    	Object[] values = {gu_code, corp_cd, admin_no,tax_set.trim()};	
    	
    	String sql = getMessageSourceAccessor().getMessage("Querys.facility.occupancy.productPlaceListTaxCount");
    	
    	int returnNum = getJdbcTemplate().queryForInt(sql,values);
    	return returnNum;    	
    }

    
    
//	산출 - 물건 정보
    public Equip_ProductBean placeInfo(String gu_code, String corp_cd, String admin_no,String object_no )
	{	
    	Object[] values = {gu_code,corp_cd,admin_no,object_no};
    	//System.out.println("query== " + getMessageSourceAccessor().getMessage("Querys.facility.occupancy.productPlaceInfo"));
    	Equip_ProductBean epb = (Equip_ProductBean)objProductPlaceInfoQuery.execute(values).get(0);
    	return epb;
	}

    
  	
//	  산출  -EQUIP_CALCULATION 입력
    public void Equip_CalculationInsert(Equip_ProductBean epb)
    {	
    	System.out.println("-------------------------------------아싸 테스트");
    	System.out.println("epb.getGU_CODE(),                == " + epb.getGU_CODE()                );
    	System.out.println("epb.getCORP_CD(),                == " + epb.getCORP_CD()                );    	
    	System.out.println("epb.getOBJECT_NO(),              == " + epb.getOBJECT_NO()               );
    	System.out.println("epb.getYEAR()                    == " + epb.getYEAR()                     );
    	System.out.println("new Float(epb.getRATE()),        == " + new Float(epb.getRATE())         );
    	System.out.println("new Float(epb.getDEPTH_RATE()),  == " + new Float(epb.getDEPTH_RATE())   );
    	System.out.println("new Integer(epb.getSUM_ADJUST()),== " + new Integer(epb.getSUM_ADJUST()) );
    	System.out.println("epb.getFROMDATE(),               == " + epb.getFROMDATE()                );
    	System.out.println("epb.getTODATE()                  == " + epb.getTODATE()                   );
    	System.out.println("epb.getFORM_ADJUST(),            == " + epb.getFORM_ADJUST()             );
    	System.out.println("epb.getFORM(),                   == " + epb.getFORM()                    );
    	System.out.println("epb.getUP_DATE(),                == " + epb.getUP_DATE()                 );
    	System.out.println("epb.getPERIOD(),                 == " + epb.getPERIOD()                  );
    	System.out.println("epb.getUSE_SECTION()    		== "+ epb.getUSE_SECTION()    		  );   
    	System.out.println("new Integer(epb.getCAL_SUM_SEQ())== " + new Integer(epb.getCAL_SUM_SEQ()) );
    	System.out.println("new Float(epb.getQUANTITY())     == " + new Float(epb.getQUANTITY())      );
    	System.out.println("epb.getTAX_SET()                 == " + epb.getTAX_SET()                  );
    	System.out.println("new Float(epb.getSUM_YEAR()      == " + new Float(epb.getSUM_YEAR()));
    	System.out.println("admin_no  =="+epb.getADMIN_NO());
    	System.out.println("-------------------------------------아싸 테스트 끝");
    	Object[] values = {epb.getGU_CODE(),epb.getCORP_CD(), epb.getOBJECT_NO(),epb.getYEAR()
    			,new Float(epb.getRATE()),new Float(epb.getDEPTH_RATE()),new Integer(epb.getSUM_ADJUST()),epb.getFROMDATE(),epb.getTODATE()
    			,epb.getFORM_ADJUST(),epb.getFORM(),epb.getUP_DATE(),epb.getPERIOD(),epb.getUSE_SECTION()    			
    			,new Integer(epb.getCAL_SUM_SEQ())
    			,new Float(epb.getQUANTITY())
    			,epb.getTAX_SET()
    			,new Float(epb.getSUM_YEAR_FLOAT())
    			,epb.getADMIN_NO()
    	};
    	
    	objEquip_CalculationInsertQuery.update(values);
    	
    }
    
//  산출  -EQUIP_CAL_SUM_INFO 입력 
    public void Equip_Cal_SumInsertQuery(Equip_ProductBean epb)
    {	
     	Object[] values = {epb.getGU_CODE(),epb.getCORP_CD(),new Integer(epb.getSEQ()),epb.getYEAR()
     			,new Integer(epb.getSUM_ADJUST()),new Integer(epb.getSUM())
     			,new Integer(epb.getVAT()),new Integer(epb.getREDUCTION_RATE()),epb.getREDUCTION_REASON()
     			,epb.getFORM_ADJUST(),
     			epb.getFROMDATE(),epb.getTODATE(),epb.getUSE_SECTION(),epb.getTAX_REG(),epb.getTAX_SET(),epb.getUP_DATE(),epb.getADMIN_NO()};
    	
    	objEquip_Cal_SumInsertQuery.update(values);
    }        	    
    
    
    
    
//  Equip_CAL_SUM_INFO 시퀀스 증가값
    public int getEquip_Cal_Sum_Seq()
    {	
		String sql = getMessageSourceAccessor().getMessage("Querys.facility.occupancy.GetEquip_Cal_Sum_Seq");
		int result = getJdbcTemplate().queryForInt(sql);
		return result;
    }
    
    
//  Equip_CAL_SUM_SEQ
    public int getEquip_Cal_Sum_Seq(String gu_code, String corp_cd, String tax_set, String year, String admin_no)
    {	
    	Object[] values = {gu_code, corp_cd, tax_set, year,admin_no};
		String sql = getMessageSourceAccessor().getMessage("Querys.facility.occupancy.GetCal_Sum_Seq");
		System.out.println("@@@@@@@@@@@@@@"+sql);
		int result = getJdbcTemplate().queryForInt(sql,values);
		return result;
    }
    
    public int getEquip_Cal_Sum_Seq_Han(String gu_code, String corp_cd, String tax_set, String year)
    {
    	Object[] values = {gu_code, corp_cd, tax_set, year};
		String sql = getMessageSourceAccessor().getMessage("Querys.facility.occupancy.GetCal_Sum_Seq_Han");
	
		int result = getJdbcTemplate().queryForInt(sql,values);
		return result;
    }
    
    
    
//	Equip_CALCULATIONINFO
    public Equip_ProductBean Equip_CalculationInfo(String gu_code, String corp_cd, String object_no, String year )
	{	
    	//Object[] values = {corp_cd,gu_code,request_no,object_no,year};
    	Object[] values = {corp_cd,gu_code,object_no,year};
    	
    	System.out.println(gu_code+"[ ]"+corp_cd+"[ ]"+object_no);
    	
    	List a1 = objGetEquip_CalculationInfoQuery.execute(values);
    	
    	Equip_ProductBean epb = new Equip_ProductBean();
    	
    	if(a1.size() > 0 )
    		epb = (Equip_ProductBean)a1.get(0);
    	
    	return epb;
	}
    
    //objEquip_Cal_SumSeqQuery
    public Equip_ProductBean Equip_GetCalSumSeq(String gu_code, String corp_cd, String admin_no, String year )
	{	
    	//Object[] values = {corp_cd,gu_code,request_no,object_no,year};
    	Object[] values = {gu_code, corp_cd, admin_no, gu_code, corp_cd, year};
    	
    	
    	
    	List a1 = objEquip_Cal_SumSeqQuery.execute(values);
    	
    	Equip_ProductBean epb = new Equip_ProductBean();
    	
    	if(a1.size() > 0 )
    		epb = (Equip_ProductBean)a1.get(0);
    	
    	return epb;
	} 
    
    
//	  Equip_CAL_SUM_INFO 추가 업데이트
    public void Equip_Cal_Sum_AddUpdate(Equip_ProductBean epb)
    {	
     	Object[] values = {new Integer(epb.getSUM_ADJUST()),new Integer(epb.getVAT()),
     			new Integer(epb.getSUM()),epb.getFORM_ADJUST() ,epb.getUP_DATE(),
     			epb.getFROMDATE(), epb.getTODATE()  ,new Integer(epb.getSEQ())
     	};    	
    	
     	objEquip_Cal_Sum_AddUpdateQuery.update(values);
    }        	    
    
    
//  Equip_CALCULATION SUM_ADJUST 합계
    public int Equip_Calculation_Sum_Adjust(String gu_code, String corp_cd, String year,String tax_set, String admin_no)
    {	
    	Object[] values = {gu_code,corp_cd,year,tax_set, admin_no};
		String sql = getMessageSourceAccessor().getMessage("Querys.facility.occupancy.getEquip_Calculation_Sum_Adjust");
		int result = getJdbcTemplate().queryForInt(sql,values);
		
		System.out.println("r="+result);
		
		return result;
    }
    
    public int Equip_Calculation_Sum_AdjustHan(String gu_code, String corp_cd, String tax_set,String year, String admin_no )
    {	
    	Object[] values = {gu_code,corp_cd, tax_set, year, admin_no};
		String sql = getMessageSourceAccessor().getMessage("Querys.facility.occupancy.getEquip_Calculation_Sum_AdjustHan");
		int result = getJdbcTemplate().queryForInt(sql,values);
		
		System.out.println("r="+result);
		
		return result;
    }
    

    
//	  Equip_CAL_SUM LIST
    public List Equip_Cal_SumList(String gu_code, String corp_cd, String year, String admin_no )
	{	
    	Object[] values = {gu_code,corp_cd,year,admin_no};		
    	return objEquip_Cal_SumListQuery.execute(values);
	}
    
//	  Equip_CAL_SUM_INFO 추가 업데이트
    public void Equip_CalculationUpdate(Equip_ProductBean epb)
    {
    	Object[] values = {new Float(epb.getQUANTITY()),new Float(epb.getDEPTH_RATE()),new Float(epb.getRATE()),epb.getFROMDATE()
    			,epb.getTODATE(),epb.getPERIOD(),epb.getFORM_ADJUST()
    			,new Float(epb.getSUM_ADJUST()), new Float(epb.getSUM_YEAR_FLOAT()), epb.getUP_DATE() , epb.getFORM()
    			,epb.getYEAR(), epb.getGU_CODE(),epb.getCORP_CD(),epb.getREQUEST_NO(),epb.getOBJECT_NO() 	};
    	
    
    	objEquip_CalculationUpdateQuery.update(values);
    }
    
    // 정기분 수정시 equip_calculation 업데이트
    public void Equip_CalculationUpdateHan(Equip_ProductBean epb){
    	
    	Object[] values = {new Float(epb.getQUANTITY()),new Float(epb.getDEPTH_RATE()),new Float(epb.getRATE()),epb.getFROMDATE()
    			,epb.getTODATE(),epb.getPERIOD(),epb.getFORM_ADJUST()
    			,new Float(epb.getSUM_ADJUST()), new Float(epb.getSUM_YEAR_FLOAT()), epb.getUP_DATE() , epb.getFORM()
    			,epb.getYEAR(), epb.getGU_CODE(),epb.getCORP_CD(),epb.getOBJECT_NO() 	};
    	
    
    	objEquip_CalculationUpdateHanQuery.update(values);
    }
    
// Equip_Place 년도 추가 업데이트 han
    public void Equip_PlaceUpdate(Equip_ProductBean epb){
    	Object[] values = {epb.getYEAR(),epb.getGU_CODE(),epb.getCORP_CD(),epb.getADMIN_NO(),epb.getOBJECT_NO()};
    	
    	objEquip_PlaceUpdateQuery.update(values);
    	   	
    }
    
    
//  부과 여부 연도별
    public int getProductTax_ynByYear(String gu_code, String corp_cd,String admin_no, String object_no, String year )
    {	
    	Object[] values = {year, gu_code,  corp_cd,admin_no,object_no};
    	
    	System.out.println(year+"[  ]"+ gu_code+"[  ]"+  corp_cd+"[  ]"+admin_no+"[  ]"+object_no);
    	
		String sql = getMessageSourceAccessor().getMessage("Querys.facility.occupancy.getProductTax_ynByYear");
		
		System.out.println(sql);
		
		int result = getJdbcTemplate().queryForInt(sql,values);
		
		System.out.println(result);
		return result;
    }
    
//  부과 여부 연도별
    public Map getSubtractedProduct(String gu_code, String corp_cd,String request_no, String object_no, String year )
    {	
    	Object[] values = { gu_code,  corp_cd,request_no,object_no,year};
    	
    	
    	
		String sql = getMessageSourceAccessor().getMessage("Querys.facility.occupancy.getSubtractedProduct");
		Map result = getJdbcTemplate().queryForMap(sql,values);
		
		
		return result;
    }
    
//  quantity 
    public int getQuantity(String gu_code, String corp_cd, String admin_no, String object_no )
    {	
    	Object[] values = { gu_code,  corp_cd, admin_no, object_no};
		String sql = getMessageSourceAccessor().getMessage("Querys.facility.occupancy.getQuantity");
		
		int returnvalue = getJdbcTemplate().queryForInt(sql,values);
		return returnvalue;
    }   
    
    // 해당 시설점용의  시설물이 모두 산출 되었으면 EQUIP_ADMIN_BASE의 CHECK_YN이 1로 바뀜... 
    public void Equip_AdminBase_CheckYn(Equip_ProductBean epb)
    {
     	Object[] values = {
     			epb.getGU_CODE(),
     			epb.getCORP_CD(),     		
     			epb.getYEAR()
     	};

     	String sql = getMessageSourceAccessor().getMessage("Querys.facility.occupancy.getSanchulYn");
     	int returnvalue = getJdbcTemplate().queryForInt(sql,values);
     	
     	System.out.println("해당 시설점용의  시설물이 모두 산출 되었으면 EQUIP_ADMIN_BASE의 CHECK_YN이 1로 바뀜..."+returnvalue);
     	// 0 = 전부 산출    전부 산출이면  EQUIP_ADMIN_BASE에 CHECK_YN 값을 1로 변경해준다.
     	/*if(returnvalue == 0){
     		String sql2 = getMessageSourceAccessor().getMessage("Querys.facility.occupancy.getCheckYn");
         	getJdbcTemplate().queryForInt(sql2,values);
     	}*/
     	
    }   
    
    public Equip_ProductBean getCalMinMaxDate(String gu_code, String corp_cd, String year, String admin_no){
    	Object[] values = {gu_code, corp_cd, year, admin_no};	
    	
    	return (Equip_ProductBean)objGetCalMinMaxDateQuery.execute(values).get(0);
    	
    }
    
    
    //////////////query 구현 ////////////////////////////////////////////////////////////////////
 	//점용 조회 및 관리 - 점용 조회
    protected class SearchListQuery extends MappingSqlQuery {
        protected SearchListQuery(DataSource ds) {        	
      	super(ds,getMessageSourceAccessor().getMessage("Querys.facility.occupancy.searchList"));
      		declareParameter(new SqlParameter(Types.VARCHAR));
      		declareParameter(new SqlParameter(Types.VARCHAR));
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
        	 jumyongBean objJumyongBean = new jumyongBean();            
        	
        	 
        	 
            objJumyongBean.setYEAR(rs.getString("YEAR"));
            objJumyongBean.setOBJECT_COUNT(rs.getInt("OBJECT_COUNT"));
            objJumyongBean.setNAME(rs.getString("NAME"));
            objJumyongBean.setCHECK_YN_NAME(rs.getString("CAL_STATUS"));
            objJumyongBean.setREGDATE(rs.getString("REGDATE"));
            objJumyongBean.setREQUEST_NO(rs.getString("ADMIN_NO"));            
            objJumyongBean.setGU_CODE(rs.getString("GU_CODE"));
            objJumyongBean.setCORP_CD(rs.getString("CORP_CD"));
            
        	System.out.println("*****************************");
        	System.out.println("hoban : SearchListQuery");
        	System.out.println("*****************************");

        	return objJumyongBean;
          }
      } 
    
    
//	산출 - 물건 리스트
    protected class ProductPlaceListQuery extends MappingSqlQuery {
        protected ProductPlaceListQuery(DataSource ds) {
      	super(ds,getMessageSourceAccessor().getMessage("Querys.facility.occupancy.productPlaceList"));
	      	declareParameter(new SqlParameter(Types.VARCHAR));
	  		declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
//			declareParameter(new SqlParameter(Types.VARCHAR));
        }
//,OBJECT_NO,PURPOSE_CD,SORT_NM,KIND_NM,QUANTITY,DEPTH_NUM,TAX_SET,B.NAME,RATE ,SEBU_NM,SUM_ADJUST, CAL_STATUS, RC2.NAME AS CAL_STATUS_NAME \        
        
        protected Object mapRow(ResultSet rs, int rownum) throws SQLException {
        	Equip_ProductBean objProductBean = new Equip_ProductBean();            
        	//EP.OBJECT_NO,EP.PURPOSE_CD,RP1.SORT_NM,RP1.KIND_NM,EP.QUANTITY, EP.DEPTH_NUM,EP.TAX_SET,RC.NAME,MAX(DECODE(RD.RATE,NULL,0,RD.RATE)) AS RATE \
        	objProductBean.setOBJECT_NO(rs.getString("OBJECT_NO"));
        	objProductBean.setPURPOSE_CD(rs.getString("PURPOSE_CD"));
        	objProductBean.setSORT_NM(rs.getString("SORT_NM"));
        	objProductBean.setKIND_NM(rs.getString("KIND_NM"));
        	objProductBean.setQUANTITY(rs.getFloat("QUANTITY"));
        	objProductBean.setDEPTH_NUM(rs.getString("DEPTH_NUM"));
        	objProductBean.setTAX_SET(rs.getString("TAX_SET"));
        	objProductBean.setTAX_SET_NAME(rs.getString("NAME"));
        	objProductBean.setDEPTH_RATE(rs.getFloat("RATE"));
        	objProductBean.setCAL_STATUS(rs.getString("CAL_STATUS"));
        	objProductBean.setCAL_STATUS_NAME(rs.getString("CAL_STATUS_NAME"));
        	objProductBean.setSUM_ADJUST(rs.getInt("SUM_ADJUST"));
        	objProductBean.setSEBU_NM(rs.getString("SEBU_NM"));
        	objProductBean.setYEAR(rs.getString("YEAR"));
        	
        	System.out.println("*****************************");
        	System.out.println("hoban : ProductPlaceListQuery");
        	System.out.println("*****************************");
        	
            return objProductBean;
        }
      }     
    
//	산출 - 물건 리스트
    protected class ProductPlaceBoardListQuery extends MappingSqlQuery {
        protected ProductPlaceBoardListQuery(DataSource ds) {
      	super(ds,getMessageSourceAccessor().getMessage("Querys.facility.occupancy.productPlaceBoardList"));
	      	declareParameter(new SqlParameter(Types.VARCHAR));
	  		declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			//declareParameter(new SqlParameter(Types.VARCHAR));
        }
//,OBJECT_NO,PURPOSE_CD,SORT_NM,KIND_NM,QUANTITY,DEPTH_NUM,TAX_SET,B.NAME,RATE ,SEBU_NM,SUM_ADJUST, CAL_STATUS, RC2.NAME AS CAL_STATUS_NAME \        
        
        protected Object mapRow(ResultSet rs, int rownum) throws SQLException {
        	Equip_ProductBean objProductBean = new Equip_ProductBean();            
        	//EP.OBJECT_NO,EP.PURPOSE_CD,RP1.SORT_NM,RP1.KIND_NM,EP.QUANTITY, EP.DEPTH_NUM,EP.TAX_SET,RC.NAME,MAX(DECODE(RD.RATE,NULL,0,RD.RATE)) AS RATE \
        	objProductBean.setOBJECT_NO(rs.getString("OBJECT_NO"));
        	objProductBean.setPURPOSE_CD(rs.getString("PURPOSE_CD"));
        	objProductBean.setSORT_NM(rs.getString("SORT_NM"));
        	objProductBean.setKIND_NM(rs.getString("KIND_NM"));
        	objProductBean.setQUANTITY(rs.getFloat("QUANTITY"));
        	objProductBean.setDEPTH_NUM(rs.getString("DEPTH_NUM"));
        	objProductBean.setTAX_SET(rs.getString("TAX_SET"));
        	objProductBean.setTAX_SET_NAME(rs.getString("NAME"));
        	objProductBean.setDEPTH_RATE(rs.getFloat("RATE"));
        	objProductBean.setCAL_STATUS(rs.getString("CAL_STATUS"));
        	objProductBean.setCAL_STATUS_NAME(rs.getString("CAL_STATUS_NAME"));
        	objProductBean.setSUM_ADJUST_WON(util.Comma_Paste(String.valueOf(rs.getInt("SUM_ADJUST"))));
        	objProductBean.setSEBU_NM(rs.getString("SEBU_NM"));
        	objProductBean.setYEAR(rs.getString("YEAR"));
        	objProductBean.setDEPTH_RATE(rs.getFloat("DEPTH_RATE"));
        	
        	System.out.println("*****************************");
        	System.out.println("hoban : ProductPlaceBoardListQuery");
        	System.out.println("*****************************");
        	
            return objProductBean;
        }
      }     
    
    
    //Querys.facility.occupancy.productPlaceBoardCalList
    protected class ProductPlaceBoardCalListQuery extends MappingSqlQuery {
        protected ProductPlaceBoardCalListQuery(DataSource ds) {
      	super(ds,getMessageSourceAccessor().getMessage("Querys.facility.occupancy.productPlaceBoardCalList"));
	      	declareParameter(new SqlParameter(Types.VARCHAR));
	  		declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			
        }
//,OBJECT_NO,PURPOSE_CD,SORT_NM,KIND_NM,QUANTITY,DEPTH_NUM,TAX_SET,B.NAME,RATE ,SEBU_NM,SUM_ADJUST, CAL_STATUS, RC2.NAME AS CAL_STATUS_NAME \        
        
        protected Object mapRow(ResultSet rs, int rownum) throws SQLException {
        	Equip_ProductBean objProductBean = new Equip_ProductBean();            
        	//EP.OBJECT_NO,EP.PURPOSE_CD,RP1.SORT_NM,RP1.KIND_NM,EP.QUANTITY, EP.DEPTH_NUM,EP.TAX_SET,RC.NAME,MAX(DECODE(RD.RATE,NULL,0,RD.RATE)) AS RATE \
        	objProductBean.setMOMEY(rs.getString("MOMEY"));
        	objProductBean.setOBJECT_NO(rs.getString("OBJECT_NO"));
        	objProductBean.setPURPOSE_CD(rs.getString("PURPOSE_CD"));
        	objProductBean.setSORT_NM(rs.getString("SORT_NM"));
        	objProductBean.setKIND_NM(rs.getString("KIND_NM"));
        	objProductBean.setQUANTITY(rs.getFloat("QUANTITY"));
        	objProductBean.setDEPTH_NUM(rs.getString("DEPTH_NUM"));
        	objProductBean.setTAX_SET(rs.getString("TAX_SET"));
        	objProductBean.setTAX_SET_NAME(rs.getString("NAME"));
        	objProductBean.setDEPTH_RATE(rs.getFloat("RATE"));
        	objProductBean.setCAL_STATUS(rs.getString("CAL_STATUS"));
        	objProductBean.setCAL_STATUS_NAME(rs.getString("CAL_STATUS_NAME"));
        	objProductBean.setSUM_ADJUST_WON(util.Comma_Paste(String.valueOf(rs.getInt("SUM_ADJUST"))));
        	objProductBean.setSEBU_NM(rs.getString("SEBU_NM"));
        	objProductBean.setYEAR(rs.getString("YEAR"));
        	objProductBean.setDEPTH_RATE(rs.getFloat("DEPTH_RATE"));
        	
            return objProductBean;
        }
      }
    
    protected class ProductPlaceBoardListHanQuery extends MappingSqlQuery {
        protected ProductPlaceBoardListHanQuery(DataSource ds) {
      	super(ds,getMessageSourceAccessor().getMessage("Querys.facility.occupancy.productPlaceBoardListHan"));
	      	declareParameter(new SqlParameter(Types.VARCHAR));
	  		declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.INTEGER));
			declareParameter(new SqlParameter(Types.INTEGER));
			//declareParameter(new SqlParameter(Types.VARCHAR));
			//declareParameter(new SqlParameter(Types.VARCHAR));
        }
//,OBJECT_NO,PURPOSE_CD,SORT_NM,KIND_NM,QUANTITY,DEPTH_NUM,TAX_SET,B.NAME,RATE ,SEBU_NM,SUM_ADJUST, CAL_STATUS, RC2.NAME AS CAL_STATUS_NAME \        
        
        protected Object mapRow(ResultSet rs, int rownum) throws SQLException {
        	Equip_ProductBean objProductBean = new Equip_ProductBean();            
        	//EP.OBJECT_NO,EP.PURPOSE_CD,RP1.SORT_NM,RP1.KIND_NM,EP.QUANTITY, EP.DEPTH_NUM,EP.TAX_SET,RC.NAME,MAX(DECODE(RD.RATE,NULL,0,RD.RATE)) AS RATE \
        	objProductBean.setOBJECT_NO(rs.getString("OBJECT_NO"));
        	objProductBean.setPURPOSE_CD(rs.getString("PURPOSE_CD"));
        	objProductBean.setSORT_NM(rs.getString("SORT_NM"));
        	objProductBean.setKIND_NM(rs.getString("KIND_NM"));
        	objProductBean.setQUANTITY(rs.getFloat("QUANTITY"));
        	objProductBean.setDEPTH_NUM(rs.getString("DEPTH_NUM"));
        	objProductBean.setTAX_SET(rs.getString("TAX_SET"));
        	objProductBean.setTAX_SET_NAME(rs.getString("NAME"));
        	objProductBean.setDEPTH_RATE(rs.getFloat("RATE"));
        	objProductBean.setCAL_STATUS(rs.getString("CAL_STATUS"));
        	objProductBean.setCAL_STATUS_NAME(rs.getString("CAL_STATUS_NAME"));
        	objProductBean.setSUM_ADJUST_WON(util.Comma_Paste(String.valueOf(rs.getInt("SUM_ADJUST"))));
        	objProductBean.setSEBU_NM(rs.getString("SEBU_NM"));
        	objProductBean.setYEAR(rs.getString("YEAR"));
        	objProductBean.setDEPTH_RATE(rs.getFloat("DEPTH_RATE"));
        	
        	System.out.println("*****************************");
        	System.out.println("hoban : ProductPlaceBoardListHanQuery");
        	System.out.println("*****************************");

        	return objProductBean;
        }
      }     
    
//	산출 - 물건 정보
    protected class ProductPlaceInfoQuery extends MappingSqlQuery {
        protected ProductPlaceInfoQuery (DataSource ds) {        	
      	super(ds,getMessageSourceAccessor().getMessage("Querys.facility.occupancy.productPlaceInfo"));
	      	declareParameter(new SqlParameter(Types.VARCHAR));
	  		declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));   
			declareParameter(new SqlParameter(Types.VARCHAR));	
        }
          protected Object mapRow(ResultSet rs, int rownum) throws SQLException {
        	Equip_ProductBean objProductBean = new Equip_ProductBean();            
//SELECT P.GU_CODE,P.CORP_CD,P.OBJECT_NO,P.QUANTITY,P.PURPOSE_CD,P.SECTION,P.RATE,DECODE(CHECK_YN,1,MOMEY,YOYUL) AS YOYUL \
        	objProductBean.setQUANTITY(rs.getInt("OBJECT_NO"));
        	objProductBean.setDEPTH_RATE(rs.getFloat("DEPTH_RATE"));
        	//objProductBean.setYOYUL(rs.getFloat("YOYUL"));
        	objProductBean.setRATE(rs.getFloat("RATE"));
        	objProductBean.setQUANTITY(rs.getFloat("QUANTITY"));
        	objProductBean.setTAX_SET(rs.getString("TAX_SET"));
        	System.out.println(rs.getString("OBJECT_NO"));
        	
        	
        	System.out.println("tax="+rs.getString("TAX_SET"));
        	
            return objProductBean;
          }
      }     
        


//  산출  -EQUIP_CALCULATION 입력
    class Equip_CalculationInsertQuery extends SqlUpdate {
        public Equip_CalculationInsertQuery(DataSource dataSource) {	        	
        	super(dataSource, getMessageSourceAccessor().getMessage("Querys.facility.occupancy.equip_calculationInsert"));
            
            declareParameter(new SqlParameter(Types.VARCHAR));	//GU_CODE
      		declareParameter(new SqlParameter(Types.VARCHAR));	//CORP_CD
      		
      		declareParameter(new SqlParameter(Types.VARCHAR));	//OBJECT_NO
      		declareParameter(new SqlParameter(Types.VARCHAR));	//YEAR
            
            declareParameter(new SqlParameter(Types.FLOAT));	//RATE
            declareParameter(new SqlParameter(Types.FLOAT));	//DEPTH_RATE
            declareParameter(new SqlParameter(Types.INTEGER));	//SUM_ADJUST
            declareParameter(new SqlParameter(Types.VARCHAR));	//FROMDATE
            declareParameter(new SqlParameter(Types.VARCHAR));	//TODATE                
            declareParameter(new SqlParameter(Types.VARCHAR));	//FORM_ADJUST
            declareParameter(new SqlParameter(Types.VARCHAR));	//FORM
            declareParameter(new SqlParameter(Types.VARCHAR));	//UP_DATE
            declareParameter(new SqlParameter(Types.VARCHAR));	// PERIOD            
            declareParameter(new SqlParameter(Types.VARCHAR));	// USE_SECTION
            
            declareParameter(new SqlParameter(Types.INTEGER));	// CAL_SUM_SEQ
            declareParameter(new SqlParameter(Types.FLOAT));	// QUANTITY
            declareParameter(new SqlParameter(Types.VARCHAR));	// TAX
            declareParameter(new SqlParameter(Types.FLOAT));	// SUM_YEAR 추가
            declareParameter(new SqlParameter(Types.VARCHAR));	// admin_no 추가
            
        }
    }
    


//  산출  -EQUIP_CAL_SUM_INFO 입력
    class Equip_Cal_SumInsertQuery extends SqlUpdate {
        public Equip_Cal_SumInsertQuery(DataSource dataSource) {	        	
        	super(dataSource, getMessageSourceAccessor().getMessage("Querys.facility.occupancy.equip_cal_sumInsert"));
            //GU_CODE,CORP_CD,REQUEST_NO,SEQ,YEAR,AREA,SUM_ADJUST_SISE,SUM_ADJUST_GUSE,SUM_SISE \
        	//,SUM_GUSE,VAT,REDUCTION_RATE,REDUCTION_REASON,PRICE,RATE,FORM_ADJUST,FROMDATE,TODATE,USE_SECTION,TAX_YN) \
            declareParameter(new SqlParameter(Types.VARCHAR));	//GU_CODE
      		declareParameter(new SqlParameter(Types.VARCHAR));	//CORP_CD
      		
      		declareParameter(new SqlParameter(Types.INTEGER));	//SEQ
      		declareParameter(new SqlParameter(Types.VARCHAR));	//YEAR
      		
      		declareParameter(new SqlParameter(Types.INTEGER));	//SUM_ADJUST
      		
      		declareParameter(new SqlParameter(Types.INTEGER));	//SUM
      		
      		declareParameter(new SqlParameter(Types.INTEGER));	//VAT
      		
      		declareParameter(new SqlParameter(Types.INTEGER));	//REDUCTION_RATE
      		declareParameter(new SqlParameter(Types.VARCHAR));	//REDUCTION_REASON
      		declareParameter(new SqlParameter(Types.VARCHAR));	//FORM_ADJUST
      		declareParameter(new SqlParameter(Types.VARCHAR));	//FROMDATE
            declareParameter(new SqlParameter(Types.VARCHAR));	//TODATE                
            declareParameter(new SqlParameter(Types.VARCHAR));	//USE_SECTION
            declareParameter(new SqlParameter(Types.VARCHAR));	//TAX_REG
            declareParameter(new SqlParameter(Types.VARCHAR));	//TAX_SET
            declareParameter(new SqlParameter(Types.VARCHAR));	//UP_DATE
            declareParameter(new SqlParameter(Types.VARCHAR));	//ADMIN_NO
        }
    }    
    




//  Equip_CALCULATIONINFO
    protected class GetEquip_CalculationInfoQuery extends MappingSqlQuery {
        protected GetEquip_CalculationInfoQuery (DataSource ds) {        	
      	super(ds,getMessageSourceAccessor().getMessage("Querys.facility.occupancy.GetEquip_CalculationInfo"));
	      	declareParameter(new SqlParameter(Types.VARCHAR));
	  		declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));			
			declareParameter(new SqlParameter(Types.VARCHAR));
        }
//      SELECT SEQ,RATE,DEPTH_RATE,SUM_ADJUST,FROMDATE,TODATE,FORM_ADJUST,UP_DATE,PERIOD FROM EQUIP_CALCULATION \
//      WHERE CORP_CD = ? AND GU_CODE = ? AND REQUEST_NO = ? AND OBJECT_NO = ?
        
          protected Object mapRow(ResultSet rs, int rownum) throws SQLException {
        	Equip_ProductBean objProductBean = new Equip_ProductBean();
        	objProductBean.setYEAR(rs.getString("YEAR"));
        	objProductBean.setSEQ(rs.getInt("SEQ"));
        	objProductBean.setRATE(rs.getFloat("RATE"));
        	objProductBean.setDEPTH_RATE(rs.getFloat("DEPTH_RATE"));
        	objProductBean.setSUM_ADJUST_WON(util.Comma_Paste(String.valueOf(rs.getInt("SUM_ADJUST"))));
        	objProductBean.setFROMDATE(util.Date_Paste(rs.getString("FROMDATE")));
        	objProductBean.setTODATE(util.Date_Paste(rs.getString("TODATE")));
        	objProductBean.setFORM_ADJUST(rs.getString("FORM_ADJUST"));
        	objProductBean.setUP_DATE(rs.getString("UP_DATE"));
        	objProductBean.setPERIOD(rs.getString("PERIOD"));
        	objProductBean.setQUANTITY(rs.getFloat("QUANTITY"));
        	objProductBean.setCAL_SUM_SEQ(rs.getInt("CAL_SUM_SEQ"));
        	objProductBean.setTAX_SET(rs.getString("TAX_SET"));
        	
            return objProductBean;
          }
      }     
    
    
    
//  Equip_CAL_SUM_INFO 추가 업데이트
    class Equip_Cal_Sum_AddUpdateQuery extends SqlUpdate {
        public Equip_Cal_Sum_AddUpdateQuery(DataSource dataSource) {	        	
        	super(dataSource, getMessageSourceAccessor().getMessage("Querys.facility.occupancy.equip_cal_sum_addUpdate"));
            declareParameter(new SqlParameter(Types.INTEGER));	//SUM_ADJUST
      		declareParameter(new SqlParameter(Types.INTEGER));	//VAT
      		declareParameter(new SqlParameter(Types.INTEGER));	//SUM_ADJUST      
      		declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR)); 
      		declareParameter(new SqlParameter(Types.VARCHAR)); // fromdate 가장 작은 날짜
			declareParameter(new SqlParameter(Types.VARCHAR)); // todate 가장 높은 날짜
			declareParameter(new SqlParameter(Types.INTEGER));	//SEQ
      		
        }
    }    
     
    

//    	  Equip_CAL_SUM LIST
    protected class Equip_Cal_SumListQuery extends MappingSqlQuery {
        protected Equip_Cal_SumListQuery(DataSource ds) {        	
      	super(ds,getMessageSourceAccessor().getMessage("Querys.facility.occupancy.Equip_Cal_SumList"));
	      	declareParameter(new SqlParameter(Types.VARCHAR));
	  		declareParameter(new SqlParameter(Types.VARCHAR));			
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR)); 
			
        }
          protected Object mapRow(ResultSet rs, int rownum) throws SQLException {
        	Equip_ProductBean objProductBean = new Equip_ProductBean();
        	objProductBean.setTAX_SET_NAME(rs.getString("TAX_SET_NAME"));
        	objProductBean.setSUM_ADJUST_WON(util.Comma_Paste(String.valueOf(rs.getInt("SUM_ADJUST"))));
        	objProductBean.setSUM_WON(util.Comma_Paste(String.valueOf(rs.getInt("SUM"))));
        	objProductBean.setYEAR(rs.getString("YEAR"));
        	objProductBean.setREDUCTION_RATE(rs.getInt("REDUCTION_RATE"));
        	objProductBean.setTAX_SET(rs.getString("TAX_SET"));
        	
            return objProductBean;
          }
      }    

    //Cal_sum_Seq
    protected class Equip_Cal_SumSeqQuery extends MappingSqlQuery {
        protected Equip_Cal_SumSeqQuery(DataSource ds) {        	
      	super(ds,getMessageSourceAccessor().getMessage("Querys.facility.occupancy.Equip_Cal_SumSeq"));
	      	declareParameter(new SqlParameter(Types.VARCHAR));
	  		declareParameter(new SqlParameter(Types.VARCHAR));			
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.VARCHAR));
  				
        }
          protected Object mapRow(ResultSet rs, int rownum) throws SQLException {
        	Equip_ProductBean objProductBean = new Equip_ProductBean();
        	
        	objProductBean.setCAL_SUM_SEQ(rs.getInt("CAL_SUM_SEQ"));
        	
            return objProductBean;
          }
      }    

//  EQUIP_CALCULATION 추가 업데이트
    class Equip_CalculationUpdateQuery extends SqlUpdate {
        public Equip_CalculationUpdateQuery(DataSource dataSource) {	        	
        	super(dataSource, getMessageSourceAccessor().getMessage("Querys.facility.occupancy.Equip_CalculationUpdate"));
            declareParameter(new SqlParameter(Types.FLOAT));	//QUANTITY
      		declareParameter(new SqlParameter(Types.FLOAT));	//DEPTH_RATE
      		declareParameter(new SqlParameter(Types.FLOAT));	//RATE      		
      		declareParameter(new SqlParameter(Types.VARCHAR));	//FROMDATE
      		declareParameter(new SqlParameter(Types.VARCHAR));	//TODATE
      		declareParameter(new SqlParameter(Types.INTEGER));	//PERIOD
      		declareParameter(new SqlParameter(Types.VARCHAR));	//FORM_ADJUST      		
      		declareParameter(new SqlParameter(Types.INTEGER));	//SUM_ADJUST
      		declareParameter(new SqlParameter(Types.INTEGER));	//SUM_YEAR
      		declareParameter(new SqlParameter(Types.VARCHAR));	//UP_DATE
      		declareParameter(new SqlParameter(Types.VARCHAR));	//FORM
      		declareParameter(new SqlParameter(Types.VARCHAR));	//GU_CODE
      		declareParameter(new SqlParameter(Types.VARCHAR));	//CORP_CD
      		declareParameter(new SqlParameter(Types.VARCHAR));	//REQUEST_NO      		
      		declareParameter(new SqlParameter(Types.VARCHAR));	//OBJECT_NO
      		declareParameter(new SqlParameter(Types.VARCHAR));	//YEAR
        }
    }
    
    class Equip_CalculationUpdateHanQuery extends SqlUpdate {
        public Equip_CalculationUpdateHanQuery(DataSource dataSource) {	        	
        	super(dataSource, getMessageSourceAccessor().getMessage("Querys.facility.occupancy.Equip_CalculationUpdateHan"));
            declareParameter(new SqlParameter(Types.FLOAT));	//QUANTITY
      		declareParameter(new SqlParameter(Types.FLOAT));	//DEPTH_RATE
      		declareParameter(new SqlParameter(Types.FLOAT));	//RATE      		
      		declareParameter(new SqlParameter(Types.VARCHAR));	//FROMDATE
      		declareParameter(new SqlParameter(Types.VARCHAR));	//TODATE
      		declareParameter(new SqlParameter(Types.INTEGER));	//PERIOD
      		declareParameter(new SqlParameter(Types.VARCHAR));	//FORM_ADJUST      		
      		declareParameter(new SqlParameter(Types.INTEGER));	//SUM_ADJUST
      		declareParameter(new SqlParameter(Types.INTEGER));	//SUM_YEAR
      		declareParameter(new SqlParameter(Types.VARCHAR));	//UP_DATE
      		declareParameter(new SqlParameter(Types.VARCHAR));	//FORM
      		declareParameter(new SqlParameter(Types.VARCHAR));	//GU_CODE
      		declareParameter(new SqlParameter(Types.VARCHAR));	//CORP_CD
      		
      		declareParameter(new SqlParameter(Types.VARCHAR));	//OBJECT_NO
      		declareParameter(new SqlParameter(Types.VARCHAR));	//YEAR
        }
    }
    
    //EQUIP_PLACE 년도 업데이트 han
    	class Equip_PlaceUpdateQuery extends SqlUpdate{
    		public Equip_PlaceUpdateQuery(DataSource dataSource){
    			super(dataSource, getMessageSourceAccessor().getMessage("Querys.facility.occupancy.Equip_PlaceUpdate"));
    			declareParameter(new SqlParameter(Types.VARCHAR));	//FORM_ADJUST
    			declareParameter(new SqlParameter(Types.VARCHAR));	//FORM_ADJUST
    			declareParameter(new SqlParameter(Types.VARCHAR));	//FORM_ADJUST
    			declareParameter(new SqlParameter(Types.VARCHAR));	//FORM_ADJUST
    			declareParameter(new SqlParameter(Types.VARCHAR));	//FORM_ADJUST
    			
    		}
    	}
    
    	
    	
    	  protected class GetCalMinMaxDateQuery extends MappingSqlQuery {
            protected  GetCalMinMaxDateQuery(DataSource ds) {        	
          	super(ds,getMessageSourceAccessor().getMessage("Querys.facility.occupancy.getCalMinMaxDateQuery"));
    	      	declareParameter(new SqlParameter(Types.VARCHAR));
    	  		declareParameter(new SqlParameter(Types.VARCHAR));
    			declareParameter(new SqlParameter(Types.VARCHAR));
    			declareParameter(new SqlParameter(Types.VARCHAR));
    			
    			
      				
            }
              protected Object mapRow(ResultSet rs, int rownum) throws SQLException {
            	Equip_ProductBean objProductBean = new Equip_ProductBean();
            	
            	objProductBean.setFROMDATE(rs.getString("FROMDATE"));
            	objProductBean.setTODATE(rs.getString("TODATE"));
            	
            	
                return objProductBean;
              }
    	  }
}
