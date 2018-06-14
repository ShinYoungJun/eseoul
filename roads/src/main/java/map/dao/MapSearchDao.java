


package main.java.map.dao;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.List;
import java.util.Map;
import javax.sql.DataSource;


//import main.java.common.commonCode.dao.CommonCodeDao.BJDongCode;
import main.java.common.commonCode.model.CommonCodeBean;
import main.java.common.commonCode.model.DongCodeBean;
import main.java.common.dao.RoadsJdbcDaoSupport;
import main.java.common.util.*;
//import gov.mogaha.rnic.common.model.RnicBoardBean;


import main.java.jumyong.jumyong.model.ConfBean;
import main.java.jumyong.jumyong.model.InspectBean;
import main.java.jumyong.jumyong.model.ProductBean;
import main.java.jumyong.jumyong.model.jumyongBean;
import main.java.jumyong.jumyong.model.PlaceLocationBean;
import main.java.jumyong.jumyong.model.PlaceFileBean;
import main.java.jumyong.jumyong.model.DisUseBean;

import main.java.jumyong.saewe.model.PlaceBean;
import main.java.map.model.*;

import org.springframework.context.support.MessageSourceAccessor;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.MappingSqlQuery;
import org.springframework.jdbc.object.SqlUpdate;
import org.springframework.jdbc.core.support.SqlLobValue;
import org.springframework.jdbc.support.lob.OracleLobHandler;



public class MapSearchDao extends RoadsJdbcDaoSupport implements IMapSearchDao {
	private OracleLobHandler oracleLobHandler = null; 
	private MapSearchListQuery objMapSearchListQuery=null;  	//	점용 검색 리스트
	private Map_viewQuery objMap_viewQuery=null;				//	점용 상세정보
	private MapSearchList1Query objMapSearchList1Query=null;  	//	가판 검색 리스트
	private Map_view1Query objMap_view1Query=null;				//	가판 상세정보
	private MiniMapXYQuery objMiniMapXYQuery=null;  			//	위치등록(건물좌표가져오기)
	private MiniMapbjXYQuery objMiniMapbjXYQuery=null;  		//	위치등록(읍면동 좌표 가져오기)
	private PurposeCode objPurposeCode=null;					//	보도상 영업시설물 구분리스트
	
	private GuCode objGuCodeQuery;								//	시군구코드
	private DongCode objDongCodeQuery;							//	동코드
	

    protected void initDao()  throws Exception {
		super.initDao();
		oracleLobHandler = new OracleLobHandler();				
		objMapSearchListQuery = new MapSearchListQuery(getDataSource());
		objMap_viewQuery = new Map_viewQuery(getDataSource());
		objMapSearchList1Query = new MapSearchList1Query(getDataSource());
		objMap_view1Query = new Map_view1Query(getDataSource());
		
		objMiniMapXYQuery = new MiniMapXYQuery(getDataSource());
		objMiniMapbjXYQuery = new MiniMapbjXYQuery(getDataSource());
		objPurposeCode = new PurposeCode(getDataSource());
				
		objGuCodeQuery = new GuCode(getDataSource());
		objDongCodeQuery = new DongCode(getDataSource());			
   	}

    //	점용 검색 리스트
    public List mapSearchList(SearchBean objectSearchBean)
	{
    	
    	
    	if(objectSearchBean.getTYPE().equals("0") || objectSearchBean.getTYPE().equals("")) 
    		objectSearchBean.setTYPE("%");
    	
    	String str1 = ""; 
    	String str2 = "";
    	String str3 = "";
    	if(objectSearchBean.getPURPOSE_CD().length() > 1){
	    	str1 = objectSearchBean.getPURPOSE_CD().substring(0,1);
	    	str2 = objectSearchBean.getPURPOSE_CD().substring(1,2);
	    	str3 = objectSearchBean.getPURPOSE_CD().substring(2,3);
    	}
    	
    	if(objectSearchBean.getPURPOSE_CD().equals("")	||	objectSearchBean.getPURPOSE_CD() == null || objectSearchBean.getPURPOSE_CD().equals("000") ){
    		objectSearchBean.setPURPOSE_CD("%");
    	}else if(str3.equals("0")){
    		if(str2.equals("0")){
    			objectSearchBean.setPURPOSE_CD(str1+"%");
    		}else{
    			objectSearchBean.setPURPOSE_CD(str1+str2+"%");
    		}
    	}
    	
    	if(objectSearchBean.getGU_CD().equals("")) 
    		objectSearchBean.setGU_CD("%");
        
    	if(objectSearchBean.getBJ_CD().equals("") || objectSearchBean.getBJ_CD().equals("00000")) 
    		objectSearchBean.setBJ_CD("%");
    	
    	if(objectSearchBean.getSPC_CD().equals("")) 
    		objectSearchBean.setSPC_CD("1");
    	
    	if(objectSearchBean.getBONBUN().equals("")) 
    		objectSearchBean.setBONBUN("%");
    	
    	if(objectSearchBean.getBUBUN().equals("")) 
    		objectSearchBean.setBUBUN("%");
    	
    	if(objectSearchBean.getJUMYONGNAME().equals("")) 
    		objectSearchBean.setJUMYONGNAME("%");
    	else objectSearchBean.setJUMYONGNAME("%"+objectSearchBean.getJUMYONGNAME()+"%");
    	
    	if(objectSearchBean.getSSN().equals("")) 
    		objectSearchBean.setSSN("%");
    	
    	    	
    	Object[] values = {
    			objectSearchBean.getTYPE(),
    			objectSearchBean.getPURPOSE_CD(),
    			objectSearchBean.getGU_CD(),
    			objectSearchBean.getBJ_CD(),
    			objectSearchBean.getSPC_CD(),
    			
    			objectSearchBean.getBONBUN(),
    			objectSearchBean.getBUBUN(),
    			objectSearchBean.getJUMYONGNAME(),
    			new Integer(objectSearchBean.getINTCURPAGE()),
    			new Integer(10),
    			
    			new Integer(10)};
    	
    	for(int i = 0 ; i < values.length ; i++){
    		System.out.println("@@@@@@@@@ : "+values[i].toString());
    	}
    	
    	return objMapSearchListQuery.execute(values);
	}

    //	점용 검색 카운트
    public int getMapSearchCount(SearchBean objectSearchBean)
	{

    	if(objectSearchBean.getTYPE().equals("0") || objectSearchBean.getTYPE().equals("")) 
    		objectSearchBean.setTYPE("%");
    	

    	String str1 = ""; 
    	String str2 = "";
    	String str3 = "";
    	if(objectSearchBean.getPURPOSE_CD().length() > 1){
	    	str1 = objectSearchBean.getPURPOSE_CD().substring(0,1);
	    	str2 = objectSearchBean.getPURPOSE_CD().substring(1,2);
	    	str3 = objectSearchBean.getPURPOSE_CD().substring(2,3);
    	}
    	
    	if(objectSearchBean.getPURPOSE_CD().equals("")	||	objectSearchBean.getPURPOSE_CD() == null || objectSearchBean.getPURPOSE_CD().equals("000") ){
    		objectSearchBean.setPURPOSE_CD("%");
    	}else if(str3.equals("0")){
    		if(str2.equals("0")){
    			objectSearchBean.setPURPOSE_CD(str1+"%");
    		}else{
    			objectSearchBean.setPURPOSE_CD(str1+str2+"%");
    		}
    	}
    	
    	if(objectSearchBean.getGU_CD().equals("")) 
    		objectSearchBean.setGU_CD("%");
        
    	if(objectSearchBean.getBJ_CD().equals("") || objectSearchBean.getBJ_CD().equals("00000")) 
    		objectSearchBean.setBJ_CD("%");
    	
    	if(objectSearchBean.getSPC_CD().equals("")) 
    		objectSearchBean.setSPC_CD("1");
    	
    	if(objectSearchBean.getBONBUN().equals("")) 
    		objectSearchBean.setBONBUN("%");
    	
    	if(objectSearchBean.getBUBUN().equals("")) 
    		objectSearchBean.setBUBUN("%");
    	
    	if(objectSearchBean.getJUMYONGNAME().equals("")) 
    		objectSearchBean.setJUMYONGNAME("%");
    	else objectSearchBean.setJUMYONGNAME("%"+objectSearchBean.getJUMYONGNAME()+"%");
    	
    	if(objectSearchBean.getSSN().equals("")) 
    		objectSearchBean.setSSN("%");

    	Object[] values = {objectSearchBean.getTYPE(),objectSearchBean.getPURPOSE_CD(),objectSearchBean.getGU_CD(),objectSearchBean.getBJ_CD(),objectSearchBean.getSPC_CD(),objectSearchBean.getBONBUN(),
    			objectSearchBean.getBUBUN(),objectSearchBean.getJUMYONGNAME()};

    	for(int i = 0 ; i < values.length ; i++){
    		System.out.println("@@@@@@@@@ : "+values[i].toString());
    	}
    	    	
    	String sql = getMessageSourceAccessor().getMessage("Querys.map.jumyongcount");
    	
    	
    	int returnNum = getJdbcTemplate().queryForInt(sql,values);
    	//System.out.println(returnNum);
    	return returnNum;
	}

    //	점용상세정보
    public	List	getMap_View(String strAdmin_no)
	{

    	Object[] values = {strAdmin_no};
    	
    	return objMap_viewQuery.execute(values);
	}
    
    //	가판 검색 리스트
    public List mapSearchList1(SearchBean objectSearchBean)
	{

    	
    	if(objectSearchBean.getTYPE().equals("0") || objectSearchBean.getTYPE().equals("")) 
    		objectSearchBean.setTYPE("%");
    	
    	if(objectSearchBean.getGU_CD().equals("")) 
    		objectSearchBean.setGU_CD("%");
        
    	if(objectSearchBean.getBJ_CD().equals("") || objectSearchBean.getBJ_CD().equals("00000")) 
    		objectSearchBean.setBJ_CD("%");
    	
    	if(objectSearchBean.getSPC_CD().equals("")) 
    		objectSearchBean.setSPC_CD("1");
    	
    	if(objectSearchBean.getBONBUN().equals("")) 
    		objectSearchBean.setBONBUN("%");
    	else objectSearchBean.setBONBUN("%"+objectSearchBean.getBONBUN());
    	
    	if(objectSearchBean.getBUBUN().equals("")) 
    		objectSearchBean.setBUBUN("%");
    	else objectSearchBean.setBUBUN("%"+objectSearchBean.getBUBUN());
    	
    	if(objectSearchBean.getJUMYONGNAME().equals("")) 
    		objectSearchBean.setJUMYONGNAME("%");
    	else objectSearchBean.setJUMYONGNAME("%"+objectSearchBean.getJUMYONGNAME()+"%");
    	
    	if(objectSearchBean.getSSN().equals("")) 
    		objectSearchBean.setSSN("%");
    	
    	    	
    	Object[] values = {objectSearchBean.getGP_TYP(),objectSearchBean.getTYPE(),objectSearchBean.getGU_CD(),objectSearchBean.getBJ_CD(),objectSearchBean.getSPC_CD(),objectSearchBean.getBONBUN(),
    			objectSearchBean.getBUBUN(),objectSearchBean.getJUMYONGNAME(),new Integer(objectSearchBean.getINTCURPAGE()),new Integer(10),new Integer(10)};
    	
    	for(int i = 0 ; i < values.length ; i++){
    		System.out.println("########### : "+values[i].toString());
    	}
    	
    	return objMapSearchList1Query.execute(values);
	}

    //	가판 검색 카운트
    public int getMapSearchCount1(SearchBean objectSearchBean)
	{

    	if(objectSearchBean.getTYPE().equals("0") || objectSearchBean.getTYPE().equals("")) 
    		objectSearchBean.setTYPE("%");
    	
    	if(objectSearchBean.getGU_CD().equals("")) 
    		objectSearchBean.setGU_CD("%");
        
    	if(objectSearchBean.getBJ_CD().equals("") || objectSearchBean.getBJ_CD().equals("00000")) 
    		objectSearchBean.setBJ_CD("%");
    	
    	if(objectSearchBean.getSPC_CD().equals("")) 
    		objectSearchBean.setSPC_CD("1");
    	
    	if(objectSearchBean.getBONBUN().equals("")) 
    		objectSearchBean.setBONBUN("%");
    	else objectSearchBean.setBONBUN("%"+objectSearchBean.getBONBUN());
    	
    	if(objectSearchBean.getBUBUN().equals("")) 
    		objectSearchBean.setBUBUN("%");
    	else objectSearchBean.setBUBUN("%"+objectSearchBean.getBUBUN());
    	
    	if(objectSearchBean.getJUMYONGNAME().equals("")) 
    		objectSearchBean.setJUMYONGNAME("%");
    	else objectSearchBean.setJUMYONGNAME("%"+objectSearchBean.getJUMYONGNAME()+"%");
    	
    	if(objectSearchBean.getSSN().equals("")) 
    		objectSearchBean.setSSN("%");

    	Object[] values = {objectSearchBean.getGP_TYP(),objectSearchBean.getTYPE(),objectSearchBean.getGU_CD(),objectSearchBean.getBJ_CD(),objectSearchBean.getSPC_CD(),objectSearchBean.getBONBUN(),
    			objectSearchBean.getBUBUN(),objectSearchBean.getJUMYONGNAME()};

    	String sql = getMessageSourceAccessor().getMessage("Querys.map.gapancount");
    	
       	int returnNum = getJdbcTemplate().queryForInt(sql,values);
    	//System.out.println(returnNum);
    	return returnNum;
	}

    //	가판상세정보
    public	List	getMap_View1(String strAdmin_no,String gp_typ)
	{

    	Object[] values = {strAdmin_no,gp_typ};
    	
    	return objMap_view1Query.execute(values);
	}
    
    //	위치등록(건물좌표가져오기)
    public	List	miniMapXY(String strPnu)
	{

    	Object[] values = {strPnu};
    	
    	return objMiniMapXYQuery.execute(values);
	}
    
    //	위치등록(읍면동 좌표 가져오기)
    public	List	miniMapbjXY(String strPnu)
	{

    	Object[] values = {strPnu};
    	
    	return objMiniMapbjXYQuery.execute(values);
	}
    
    //	보도상 영업시설물 구분리스트
    public	List	executepurposeCode(String Class_cd, String Code, String Title)
	{
    	//GapanCode	gapanCode	= new GapanCode(getDataSource());
    	
    	Object[] values = {Class_cd};
    	
    	return objPurposeCode.execute(values);
	}    
        
    //	구코드
    public List getGuCode(String SI_CD) {

    	List a= objGuCodeQuery.execute(SI_CD);
    	
    	try {
			
			System.out.println("크기는="+a.size());
		}catch(Exception err){
			System.out.println("에러00는"+err.toString());
		}
		
    	return objGuCodeQuery.execute(SI_CD);
	} 
    
	//	동코드   
    public	List	executeBJDongCode(String SI_CD, String GU_CD)
	{
    	    	
    	Object[] values = {SI_CD, GU_CD};
    	
    	return objDongCodeQuery.execute(values);
	}
 

     

    //////////////query 구현 ////////////////////////////////////////////////////////////////////
	//////////////////////////////////////////////////////////////////////////////////
	//////////////////////////////////////////////////////////////////////////////////
	
 	//점용 검색 리스트
    protected class MapSearchListQuery extends MappingSqlQuery {
        protected MapSearchListQuery(DataSource ds) {        	
      	super(ds,getMessageSourceAccessor().getMessage("Querys.map.jumyonglist"));      	
  			declareParameter(new SqlParameter(Types.VARCHAR));	//TYPE
  			declareParameter(new SqlParameter(Types.VARCHAR));	//PURPOSE_CD
  			declareParameter(new SqlParameter(Types.VARCHAR));	//GU_CD
  			declareParameter(new SqlParameter(Types.VARCHAR));	//BJ_CD
  			declareParameter(new SqlParameter(Types.VARCHAR));	//SPC_CD
  			
	  		declareParameter(new SqlParameter(Types.VARCHAR));  //BONBUN
	  		declareParameter(new SqlParameter(Types.VARCHAR));  //BUBUN
	  		declareParameter(new SqlParameter(Types.VARCHAR));  //NAME
	  		declareParameter(new SqlParameter(Types.INTEGER));
	    	declareParameter(new SqlParameter(Types.INTEGER));
	    	
	    	declareParameter(new SqlParameter(Types.INTEGER));
	    	
        }
          protected Object mapRow(ResultSet rs, int rownum) throws SQLException {
        	  SearchBean objSearchBean = new SearchBean(); 
            
        	  objSearchBean.setADMIN_NO(rs.getString("ADMIN_NO"));            
        	  objSearchBean.setNAME(rs.getString("NAME"));
        	  objSearchBean.setADDR1(rs.getString("ADDR1"));
        	  objSearchBean.setADDR2(rs.getString("ADDR2"));
        	  objSearchBean.setLOCATE_X(rs.getString("LOCATE_X"));
        	  objSearchBean.setLOCATE_Y(rs.getString("LOCATE_Y"));
        	  objSearchBean.setBJ_NM(rs.getString("BJ_NM"));
        	  objSearchBean.setBONBUN(rs.getString("BONBUN"));
        	  objSearchBean.setBUBUN(rs.getString("BUBUN"));
        	  objSearchBean.setPURPOSE(rs.getString("PURPOSE"));
        	  objSearchBean.setAREA_SIZE(rs.getFloat("AREA_SIZE"));
 
            return objSearchBean;
          }
      } 
    
    //	점용 상세정보
    protected	class	Map_viewQuery	extends	MappingSqlQuery{
        protected 	Map_viewQuery(DataSource ds){
        super(ds, getMessageSourceAccessor().getMessage("Querys.map.jumyongview"));
        	
        	declareParameter(new SqlParameter(Types.VARCHAR));
        }
        
        protected	Object mapRow(ResultSet rs, int rownum)	throws	SQLException {
        	SearchBean	Bean	= new SearchBean();

			Bean.setADMIN_NO(rs.getString("ADMIN_NO"));
			Bean.setSSN(rs.getString("SSN"));
			Bean.setBIZSSN(rs.getString("BIZSSN"));
			Bean.setADDR1(rs.getString("ADDR1"));
			Bean.setADDR2(rs.getString("ADDR2"));
			Bean.setTEL(rs.getString("TEL"));
			Bean.setHP(rs.getString("HP"));
			Bean.setEMAIL(rs.getString("EMAIL"));
			Bean.setTOPOST(rs.getString("TOPOST"));
			Bean.setTOADDR1(rs.getString("TOADDR1"));
			Bean.setTOADDR2(rs.getString("TOADDR2"));
			Bean.setTONM(rs.getString("TONM"));
			Bean.setTOTEL(rs.getString("TOTEL"));
			Bean.setTOHP(rs.getString("TOHP"));
			Bean.setTOMAIL(rs.getString("TOMAIL"));
			Bean.setOWNER_SET(rs.getString("OWNER_SET"));
			Bean.setMUL_POST(rs.getString("MUL_POST"));
			Bean.setSIDO(rs.getString("SIDO"));
			Bean.setSI_NM(rs.getString("SI_NM"));
			Bean.setSIGUNGU(rs.getString("SIGUNGU"));
			Bean.setGU_NM(rs.getString("GU_NM"));
			Bean.setBJ_CD(rs.getString("BJ_CD"));
			Bean.setHJ_CD(rs.getString("HJ_CD"));
			Bean.setHJ_NM(rs.getString("HJ_NM"));
			Bean.setSPC_CD(rs.getString("SPC_CD"));
			Bean.setTONG(rs.getString("TONG"));
			Bean.setBAN(rs.getString("BAN"));
			Bean.setBD_NM(rs.getString("BD_NM"));
			Bean.setBD_DONG(rs.getString("BD_DONG"));
			Bean.setBD_HO(rs.getString("BD_HO"));
			Bean.setTYPE_NAME(rs.getString("TYPE_NAME"));
			Bean.setTYPE(rs.getString("TYPE"));
			Bean.setSECTION_NAME(rs.getString("SECTION_NAME"));
			Bean.setNAME(rs.getString("NAME"));
			Bean.setBJ_NM(rs.getString("BJ_NM"));
			Bean.setBONBUN(rs.getString("BONBUN"));
			Bean.setBUBUN(rs.getString("BUBUN"));
			Bean.setMUL_FROMDATE(rs.getString("MUL_FROMDATE"));
			Bean.setMUL_TODATE(rs.getString("MUL_TODATE"));
			Bean.setTAX_SET_NAME(rs.getString("TAX_SET_NAME"));
			Bean.setPURPOSE_CD(rs.getString("PURPOSE_CD"));
			Bean.setCLASS_NM(rs.getString("CLASS_NM"));
      	    Bean.setAREA_SIZE(rs.getFloat("AREA_SIZE"));
				
        	return	Bean;
        }
    }

 	//가판 검색 리스트
    protected class MapSearchList1Query extends MappingSqlQuery {
        protected MapSearchList1Query(DataSource ds) {        	
      	super(ds,getMessageSourceAccessor().getMessage("Querys.map.gapanlist")); 
      		declareParameter(new SqlParameter(Types.VARCHAR));	//GP_TYP
  			declareParameter(new SqlParameter(Types.VARCHAR));	//TYPE
  			declareParameter(new SqlParameter(Types.VARCHAR));	//GU_CD
  			declareParameter(new SqlParameter(Types.VARCHAR));	//BJ_CD
  			declareParameter(new SqlParameter(Types.VARCHAR));	//SPC_CD
	  		declareParameter(new SqlParameter(Types.VARCHAR));  //BONBUN
	  		declareParameter(new SqlParameter(Types.VARCHAR));  //BUBUN
	  		declareParameter(new SqlParameter(Types.VARCHAR));  //NAME
	  		declareParameter(new SqlParameter(Types.INTEGER));
	    	declareParameter(new SqlParameter(Types.INTEGER));
	    	declareParameter(new SqlParameter(Types.INTEGER));
	    	
        }
          protected Object mapRow(ResultSet rs, int rownum) throws SQLException {
        	  SearchBean objSearchBean = new SearchBean(); 
            
        	  objSearchBean.setGAPAN_NO(rs.getString("GAPAN_NO"));
        	  objSearchBean.setGP_TYP(rs.getString("GP_TYP"));
        	  objSearchBean.setOWNER_NAME(rs.getString("OWNER_NAME"));
        	  objSearchBean.setSORT_NM(rs.getString("SORT_NM"));
        	  objSearchBean.setXX_COORD(rs.getString("X_COORD"));
        	  objSearchBean.setYY_COORD(rs.getString("Y_COORD"));
        	  objSearchBean.setPURPOSE_CD(rs.getString("PURPOSE_CD"));
        	  objSearchBean.setMAINTN_OB(rs.getString("MAINTN_OB"));
 
            return objSearchBean;
          }
      } 
    
    //	가판 상세정보
    protected	class	Map_view1Query	extends	MappingSqlQuery{
        protected 	Map_view1Query(DataSource ds){
        super(ds, getMessageSourceAccessor().getMessage("Querys.map.gapanview"));
        	
        	declareParameter(new SqlParameter(Types.VARCHAR));
        	declareParameter(new SqlParameter(Types.VARCHAR)); // GP_TYP
        }
        
        protected	Object mapRow(ResultSet rs, int rownum)	throws	SQLException {
        	SearchBean	Bean	= new SearchBean();

			Bean.setGAPAN_NO(rs.getString("GAPAN_NO"));
			Bean.setGP_TYP(rs.getString("GP_TYP"));
			Bean.setOWNER_NAME(rs.getString("OWNER_NAME"));
			Bean.setOWNER_TEL(rs.getString("OWNER_TEL"));
			Bean.setOWNER_HP(rs.getString("OWNER_HP"));
			Bean.setOWNER_TOADDR1(rs.getString("OWNER_TOADDR1"));
			Bean.setOWNER_TOADDR2(rs.getString("OWNER_TOADDR2"));
			Bean.setOWNER_TOSAN(rs.getString("OWNER_TOSAN"));
			Bean.setOWNER_TOJIBUN(rs.getString("OWNER_TOJIBUN"));
			Bean.setLC_SEL_NAME(rs.getString("LC_SEL_NAME"));
			Bean.setPT_SEL_NAME(rs.getString("PT_SEL_NAME"));
			Bean.setWITH_ADDR(rs.getString("WITH_ADDR"));
			Bean.setFACIL_L(rs.getString("FACIL_L"));
			Bean.setFACIL_W(rs.getString("FACIL_W"));
			Bean.setFACIL_H(rs.getString("FACIL_H"));
			Bean.setFACIL(rs.getString("FACIL"));
			Bean.setPLACE_L(rs.getString("PLACE_L"));
			Bean.setPLACE_H(rs.getString("PLACE_H"));
			Bean.setPLACE_A(rs.getString("PLACE_A"));
			Bean.setPLACE(rs.getString("PLACE"));
			Bean.setCAR_TON(rs.getString("CAR_TON"));
			Bean.setLIQUOR_SL(rs.getString("LIQUOR_SL"));
			Bean.setLPGAS_US(rs.getString("LPGAS_US"));
			Bean.setWITH_PNU(rs.getString("WITH_PNU"));
			Bean.setSI_NM(rs.getString("SI_NM"));
			Bean.setGU_NM(rs.getString("GU_NM"));
			Bean.setBJ_NM(rs.getString("BJ_NM"));
			Bean.setMAINTN_OB(rs.getString("MAINTN_OB"));

        	return	Bean;
        }
    }
    
    //	위치등록(건물좌표가져오기)
    protected	class	MiniMapXYQuery	extends	MappingSqlQuery{
        protected 	MiniMapXYQuery(DataSource ds){
        super(ds, getMessageSourceAccessor().getMessage("Querys.map.miniMap"));
        	
        	declareParameter(new SqlParameter(Types.VARCHAR));
        }
        
        protected	Object mapRow(ResultSet rs, int rownum)	throws	SQLException {
        	SearchBean	Bean	= new SearchBean();

			Bean.setPNU(rs.getString("PNU"));
			Bean.setJIBUN(rs.getString("JIBUN"));
			Bean.setXX_COORD(rs.getString("X_COORD"));
			Bean.setYY_COORD(rs.getString("Y_COORD"));
        	return	Bean;
        }
    }
    
    //	위치등록(읍면동 좌표 가져오기)
    protected	class	MiniMapbjXYQuery	extends	MappingSqlQuery{
        protected 	MiniMapbjXYQuery(DataSource ds){
        super(ds, getMessageSourceAccessor().getMessage("Querys.map.miniMapbj"));
        	
        	declareParameter(new SqlParameter(Types.VARCHAR));
        }
        
        protected	Object mapRow(ResultSet rs, int rownum)	throws	SQLException {
        	SearchBean	Bean	= new SearchBean();

			Bean.setPOINT_X(rs.getString("POINT_X"));
			Bean.setPOINT_Y(rs.getString("POINT_Y"));

        	return	Bean;
        }
    }
    
    //	보도상 영업시설물 구분리스트
    protected	class	PurposeCode	extends	MappingSqlQuery{
        protected 	PurposeCode(DataSource ds){
        super(ds, getMessageSourceAccessor().getMessage("Querys.map.purposecode"));
          	
	        declareParameter(new SqlParameter(Types.VARCHAR));
        }
        
        protected	Object mapRow(ResultSet rs, int rownum)	throws	SQLException{
        	
        	SearchBean	Bean	= new SearchBean();

        	Bean.setCODE(NullCheck(rs.getString("CODE")));
  			Bean.setSORT_NM(NullCheck(rs.getString("SORT_NM")));

        	return	Bean;
        }
    }   

    
    
    //  구코드
    protected class GuCode extends MappingSqlQuery {
        protected GuCode(DataSource ds) {        	
      	super(ds,getMessageSourceAccessor().getMessage("Querys.map.GuCode"));      	
  			
      	declareParameter(new SqlParameter(Types.VARCHAR));	//SI_CD  			
	    	
        }
          protected Object mapRow(ResultSet rs, int rownum) throws SQLException {
        	  SearchBean objSearchBean = new SearchBean();            
            
            objSearchBean.setGU_CD(NullCheck(rs.getString("GU_CD")));
        	objSearchBean.setGU_NM(NullCheck(rs.getString("GU_NM")));

        	return	objSearchBean;
          }
      } 

    protected	String	NullCheck(String str){
    	if(str	==	null)
    		str	= "";
    	
    	return	str;
    }


    //	동코드
    protected	class	DongCode	extends	MappingSqlQuery
    {
        protected 	DongCode(DataSource ds)
        {
          	super(ds, getMessageSourceAccessor().getMessage("Querys.map.BJDongCode"));
          	
	        declareParameter(new SqlParameter(Types.VARCHAR));
	        declareParameter(new SqlParameter(Types.VARCHAR));
        }
        
        protected	Object mapRow(ResultSet rs, int rownum)	throws	SQLException
        {
        	SearchBean	Bean	= new SearchBean();

        	Bean.setBJ_CD1(rs.getString("BJ_CD"));
  			Bean.setBJ_NM(rs.getString("BJ_NM"));

        	return	Bean;
        }
    }
		    
}

