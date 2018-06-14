//	2009		Kim Yun Seo

package main.java.jumyong.jumyonginfo.dao;


import java.util.List;
import java.util.Map;

import main.java.common.dao.RoadsJdbcDaoSupport;

import main.java.jumyong.jumyonginfo.model.AppealBean;
import main.java.jumyong.jumyonginfo.model.MinwonBean;
import main.java.jumyong.jumyonginfo.model.PlaceBean;
import main.java.jumyong.jumyonginfo.model.TotalWIthBean;
import main.java.jumyong.minwon.dao.MinwonMapDao;


public class MinwoninfoDao	extends RoadsJdbcDaoSupport	implements	IMinwoninfoDao
{
	private	MinwoninfoMapDao	minwoninfoMap	= new MinwoninfoMapDao();
	
	
    protected	void	initDao()  throws Exception
    {
		super.initDao();
   	}
    
    
    //	민원정보 보기
    public	List	executeMinwon_View(String strAdmin_no, int intRn1, int intRn2)
	{
    	MinwoninfoMapDao.Minwon_View	minwon_View	= minwoninfoMap.new Minwon_View(getDataSource(), getMessageSourceAccessor());
    	
    	Object[] values = {strAdmin_no,
    			new Integer(intRn1),
            	new Integer(intRn2)
    	};
    	
    	return minwon_View.execute(values);
	}
    
    
    public	List	executeMinwon_View_Search(String strAdmin_no, String strSeq)
    {
    	MinwoninfoMapDao.Minwon_View_Search		minwon_View	= minwoninfoMap.new Minwon_View_Search(getDataSource(), getMessageSourceAccessor());
    	
    	Object[] values = {strAdmin_no, strSeq};
    	
    	return minwon_View.execute(values);
    }
    
    
    //	민원정보 등록
    public	boolean	executeMinwon_Modify(MinwonBean Bean)
	{
    	MinwoninfoMapDao.Minwon_Modify	minwon_Modify	= minwoninfoMap.new Minwon_Modify(getDataSource(), getMessageSourceAccessor());
    	
		try
		{
			Object[] values = {
					Bean.getREQ_DATE(),
					Bean.getREQ_NM(),
					Bean.getMANAGER(),
					Bean.getGUBUN(),
					Bean.getAGENT_NM(),
					Bean.getAGENT_TEL(),
					Bean.getEVENT_SET(),
					Bean.getREQ_SET(),
					Bean.getREQ_SIGU(),
					Bean.getREQ_DEP(),
					
					Bean.getREQ_SET_CN(),
					Bean.getBIZSSN(),
					Bean.getMANAGE_DEP(),
					Bean.getNOTES(),
					Bean.getPREDATE(),
					Bean.getSSN(),
					Bean.getNAME(),
					Bean.getTEL(),
					Bean.getHP(),
					Bean.getADDR1(),
					
					Bean.getADDR2(),
					Bean.getPOST(),
					Bean.getREAL_DEAL_DATE(),
					Bean.getMW_PROG_SE(),
					Bean.getEMAIL(),
	
					//********** BEGIN_현진_20120215
					Bean.getDORO_ADDR1(),
					Bean.getDORO_ADDR2(),
					//********** END_현진_20120215
					
					Bean.getADMIN_NO(),
					Bean.getSEQ()

					
			};

			minwon_Modify.update(values);
		}
		catch (Exception e)
		{
			e.printStackTrace();
			return	false;
		}
		
		return	true;
    }
    
    
    //	민원정보 추가
    public	boolean	executeMinwon_Register(MinwonBean Bean)
	{
    	MinwoninfoMapDao.Minwon_Register	minwoninfo_Register	= minwoninfoMap.new Minwon_Register(getDataSource(), getMessageSourceAccessor());
    	
		try
		{
			System.out.println("################################################################################");
			System.out.println("Bean.getADMIN_NO(), ==>" + Bean.getADMIN_NO());
			System.out.println("Bean.getREQ_NO() ==>" + Bean.getREQ_NO());
			System.out.println("Bean.getREQ_DATE() ==>" + Bean.getREQ_DATE());
			System.out.println("Bean.getREQ_NM() ==>" + Bean.getREQ_NM());
			System.out.println("Bean.getMANAGER() ==>" + Bean.getMANAGER());
			System.out.println("Bean.getGUBUN() ==>" + Bean.getGUBUN());
			System.out.println("Bean.getAGENT_NM() ==>" + Bean.getAGENT_NM());
			System.out.println("Bean.getAGENT_TEL() ==>" + Bean.getAGENT_TEL());
			System.out.println("Bean.getEVENT_SET() ==>" + Bean.getEVENT_SET());
			System.out.println("Bean.getREQ_SET() ==>" + Bean.getREQ_SET());
			System.out.println("Bean.getREQ_SIGU() ==>" + Bean.getREQ_SIGU());
			System.out.println("Bean.getREQ_DEP() ==>" + Bean.getREQ_DEP());
			System.out.println("Bean.getREQ_SET_CN() ==>" + Bean.getREQ_SET_CN());
			System.out.println("Bean.getBIZSSN() ==>" + Bean.getBIZSSN());
			System.out.println("Bean.getMANAGE_DEP() ==>" + Bean.getMANAGE_DEP());
			System.out.println("Bean.getNOTES() ==>" + Bean.getNOTES());
			System.out.println("Bean.getPREDATE() ==>" + Bean.getPREDATE());
			System.out.println("Bean.getSSN() ==>" + Bean.getSSN());
			System.out.println("Bean.getNAME() ==>" + Bean.getNAME());
			System.out.println("Bean.getTEL() ==>" +Bean.getTEL() );
			System.out.println("Bean.getHP() ==>" + Bean.getHP());
			System.out.println("Bean.getADDR1() ==>" + Bean.getADDR1());
			System.out.println("Bean.getADDR2() ==>" + Bean.getADDR2());
			System.out.println("Bean.getPOST() ==>" + Bean.getPOST());
			System.out.println("Bean.getREAL_DEAL_DATE() ==>" + Bean.getREAL_DEAL_DATE());
			System.out.println("Bean.getMW_PROG_SE() ==>" + Bean.getMW_PROG_SE());
			System.out.println("Bean.getEMAIL() ==>" + Bean.getEMAIL());
			System.out.println("################################################################################");
			Object[] values = {
					Bean.getADMIN_NO(),
					Bean.getREQ_NO(),
					Bean.getREQ_DATE(),
					Bean.getREQ_NM(),
					Bean.getMANAGER(),
					Bean.getGUBUN(),
					Bean.getAGENT_NM(),
					Bean.getAGENT_TEL(),
					Bean.getEVENT_SET(),
					Bean.getREQ_SET(),
					
					Bean.getREQ_SIGU(),
					Bean.getREQ_DEP(),
					Bean.getREQ_SET_CN(),
					Bean.getBIZSSN(),
					Bean.getMANAGE_DEP(),
					Bean.getNOTES(),
					Bean.getPREDATE(),
					Bean.getSSN(),
					Bean.getNAME(),
					Bean.getTEL(),
					
					Bean.getHP(),
					Bean.getADDR1(),
					Bean.getADDR2(),
					Bean.getPOST(),
					Bean.getREAL_DEAL_DATE(),
					Bean.getMW_PROG_SE(),
					Bean.getEMAIL(),
					Bean.getREFERENCE()
			};

			minwoninfo_Register.update(values);
		}
		catch (Exception e)
		{
			e.printStackTrace();
			return	false;
		}
		
		return	true;
	}
		
		
    public	int		executeMinwon_Count(String strAdmin_no)
    {
    	Object[] values = {strAdmin_no};
    	
    	String sql = getMessageSourceAccessor().getMessage("Querys.jumyong.minwoninfo.Minwon_Count");
		return 	getJdbcTemplate().queryForInt(sql, values);
    }

    
    //	점용인정보 보기
    public	List	executeJumin_View(String strAdmin_no)
	{
    	MinwoninfoMapDao.Jumin_View	jumin_View	= minwoninfoMap.new Jumin_View(getDataSource(), getMessageSourceAccessor());
    	
    	Object[] values = {strAdmin_no};
    	
    	return jumin_View.execute(values);
	}
    
    //	점용인 정보 수정
    public	boolean	executeJumin_Modify(AppealBean Bean)
	{
    	MinwoninfoMapDao.Jumin_Modify	jumin_Modify	= minwoninfoMap.new Jumin_Modify(getDataSource(), getMessageSourceAccessor());
    	
		try
		{
			
			System.out.println("1="+Bean.getSI());
			System.out.println("2"+Bean.getGUN());
			System.out.println("3="+Bean.getDORO_NM());
			System.out.println("4"+Bean.getBD_BON());
			System.out.println("5="+Bean.getBD_BU());					
			System.out.println("6="+Bean.getBD_NM());
			
			System.out.println("11="+Bean.getTOSI());					
			System.out.println("12="+Bean.getTOGUN());
			System.out.println("13="+Bean.getTO_DORO_NM());
			System.out.println("14="+Bean.getTO_BD_BON());
			System.out.println("15="+Bean.getTO_BD_BU());
			System.out.println("16="+Bean.getTO_BD_NM());
			System.out.println("17="+Bean.getTO_BD_DET_NM());
			
			System.out.println("18="+Bean.getTOADDR2());
			System.out.println("19="+Bean.getDONG());
			//********** BEGIN_현진_20120215
			/*
			Object[] values = {
					Bean.getNAME(),
					Bean.getSSN(),
					Bean.getBIZSSN(),
					Bean.getBIZ_STATUS(),
					Bean.getBIZ_TYPES(),
					
					Bean.getPOST(),
					Bean.getADDR1(),
					Bean.getADDR2(),
					Bean.getEMAIL(),
					Bean.getTEL(),
					
					Bean.getHP(),
					Bean.getTONM(),
					Bean.getTOPOST(),
					Bean.getTOADDR1(),
					Bean.getTOADDR2(),
					
					Bean.getTOMAIL(),
					Bean.getTOTEL(),
					Bean.getTOHP(),
					Bean.getADDR_CHECK(),
					Bean.getREFERENCE(),
					
					Bean.getBEFORE_PERMISSION(),
					Bean.getWORK_ID(),
					Bean.getSAN(),
					Bean.getBON(),
					Bean.getBU(),
					
					Bean.getTOSAN(),
					Bean.getTOBON(),
					Bean.getTOBU(),
					
					Bean.getSI(),
					Bean.getGUN(), 
					Bean.getDORO_NM(),
					Bean.getBD_BON(),
					Bean.getBD_BU(),					
					Bean.getBD_NM(),
					Bean.getBD_DET_NM(),
					
					Bean.getTOSI(),					
					Bean.getTOGUN(),
					Bean.getTO_DORO_NM(),
					Bean.getTO_BD_BON(), 
					Bean.getTO_BD_BU(),
					Bean.getTO_BD_NM(),
					Bean.getTO_BD_DET_NM(),
					
					Bean.getADMIN_NO(),

					Bean.getDONG(),
					Bean.getSANGSE(),
					Bean.getTODONG(),
					Bean.getTOSANGSE()

			};
			 */
			//********** END_현진_20120215
			Object[] values = {
					Bean.getADDR_CHECK(),
					Bean.getADDR1(),
					Bean.getADDR2(),
					Bean.getB_PERMISSION(),
					Bean.getBD_BON(),

					Bean.getBD_BU(),
					Bean.getBD_DET_NM(),
					Bean.getBD_NM(),
					Bean.getBIZ_STATUS(),
					Bean.getBIZ_TYPES(),
					
					Bean.getBIZSSN(),
					Bean.getBON(),
					Bean.getBU(),
					Bean.getDONG(),
					Bean.getDORO_NM(),
					
					Bean.getEMAIL(),
					Bean.getGUN(),
					Bean.getHP(),
					Bean.getNAME(),
					Bean.getNOTES(),
					
					Bean.getPOST(),
					Bean.getREFERENCE(),
					Bean.getRI(),
					Bean.getSAN(),
					Bean.getSANGSE(),

					Bean.getSI(),
					Bean.getSSN(),
					Bean.getTEL(),
					Bean.getTO_BD_BON(),
					Bean.getTO_BD_BU(),
					
					Bean.getTO_BD_DET_NM(),
					Bean.getTO_BD_NM(),
					Bean.getTO_DORO_NM(),
					Bean.getTO_RI(),
					Bean.getTOADDR1(),
					
					Bean.getTOADDR2(),
					Bean.getTOBON(),
					Bean.getTOBU(),
					Bean.getTODONG(),
					Bean.getTOGUN(),
					
					Bean.getTOHP(),
					Bean.getTOMAIL(),
					Bean.getTONM(),
					Bean.getTOPOST(),
					Bean.getTOSAN(),
					
					Bean.getTOSANGSE(),
					Bean.getTOSI(),
					Bean.getTOTEL(),
					Bean.getUP_DATE(),
					Bean.getWORK_ID(),
					
					//********** BEGIN_현진_20120321
					Bean.getEXPONENT(),
					Bean.getBUSINESSADDR(),
					//********** END_현진_20120321
					//********** BEGIN_KANG_20120417
					Bean.getCOMPANY_NAME(),
					//********** END_KANG_20120417
					Bean.getADMIN_NO()

			};

			System.out.println("점용 정보 수정..");
			jumin_Modify.update(values);
		}
		catch (Exception e)
		{
			e.printStackTrace();
			return	false;
		}
		
		return	true;
    }    
    
    
    //	점용지정보 보기
    public	List	executeJumji_View(String strAdmin_no)
	{
    	MinwoninfoMapDao.Jumji_View	jumji_View	= minwoninfoMap.new Jumji_View(getDataSource(), getMessageSourceAccessor());
    	
    	Object[] values = {strAdmin_no};
    	
    	return jumji_View.execute(values);
	}
    
    //	점용지정보  수정
    public	boolean	executeJumji_Modify(PlaceBean Bean)
	{
    	MinwoninfoMapDao.Jumji_Modify	jumji_Modify	= minwoninfoMap.new Jumji_Modify(getDataSource(), getMessageSourceAccessor());
    	
		try
		{
			Object[] values = {
					Bean.getTYPE(),
					Bean.getSECTION(),
					Bean.getPURPOSE_CD(),
					Bean.getPARKING_NUM(),
					Bean.getOWNER_SET(),
					
					Bean.getTAX_SET(),
					Bean.getMUL_POST(),
					Bean.getSIDO(),
					Bean.getSIGUNGU(),
					Bean.getBJ_CD(),
					
					Bean.getHJ_CD(),
					Bean.getBONBUN(),
					Bean.getBUBUN(),
					Bean.getTONG(),
					Bean.getBAN(),

					Bean.getBD_NM(),
					Bean.getBD_DONG(),
					Bean.getBD_HO(),
					Bean.getMUL_FROMDATE(),
					Bean.getMUL_TODATE(),
					
					Bean.getTOTAL_PERIOD(),
					Bean.getPARTLY_PERIOD(),
					Bean.getWORK_FROMDATE(),
					Bean.getWORK_TODATE(),
					Bean.getEXE_INFO(),
					
					Bean.getROAD_ADDR(),
					Bean.getRIVER_NM(),
					Bean.getWITH_POST(),
					Bean.getWITH_ADDR1(),
					Bean.getWITH_ADDR2(),
					
					Bean.getROAD_BON(),
					Bean.getROAD_BU(),
					Bean.getSPC_CD(),
					Bean.getREFERENCE(),
					new Float(Bean.getAREA_SIZE()),
					Bean.getWITH_SUM_PRICE(),
					Bean.getWSP_YN(),
					
					Bean.getRIVER_RANK(),
					Bean.getREDUCTION_RATE(),
					Bean.getREDUCTION_REASON(),
					Bean.getPERCENT_RATE(),
					Bean.getPERCENT_REASON(),
					Bean.getWORK_ID(),
					
					// 점용지 도로명 주소 추가 #mr(2014.03.13)
					Bean.getJYADDR_NEW(),
					Bean.getJYADDR_BON(),
					Bean.getJYADDR_BU(),
					Bean.getDUE_DATE(),
					
					Bean.getADMIN_NO()
					
			};
			
			jumji_Modify.update(values);
		}
		catch (Exception e)
		{
			e.printStackTrace();
			return	false;
		}
		
		return	true;
    }
    
    public	List	executeTotal_With(String adminNo)
	{
    	MinwoninfoMapDao.Total_With	Total_With	= minwoninfoMap.new Total_With(getDataSource(), getMessageSourceAccessor());
    	
    	Object[] values = {adminNo};
    	
    	return Total_With.execute(values);
	}
    
	//공시지가 구하기
    public Map get_Price(String ADMIN_NO,String BONBUN, String BUBUN){
    	
    	Object[]values = {BONBUN,BUBUN,ADMIN_NO}; 	
		
		String sql = getMessageSourceAccessor().getMessage("Querys.jumyong.jumyonginfo.get_price");
		Map returnNum = null;
		try
		{
			returnNum = getJdbcTemplate().queryForMap(sql,values);
		}catch(Exception err)
		{
			System.out.println(err.toString());
		}
		return returnNum;
    	
    	
    }
    
  //인접지 정보 등록하기
    public void executeRegister_With(TotalWIthBean bean){
    	
	MinwoninfoMapDao.TotalWith_Register	totalWith_Register	= minwoninfoMap.new TotalWith_Register(getDataSource(), getMessageSourceAccessor());
    	
		try
		{
			Object[] values = {
					bean.getADMIN_NO(),
					bean.getBJ_CD(),
					bean.getBONBUN(),
					bean.getBUBUN(),
					bean.getPRICE()
			};

			totalWith_Register.update(values);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
    	
    }
    
    //인접지 목록 지우기
    public void executeDelete_With(String adminNo){
    	
	MinwoninfoMapDao.totalWith_Delete	totalWith_Delete	= minwoninfoMap.new totalWith_Delete(getDataSource(), getMessageSourceAccessor());
    	
		try
		{
			Object[] values = {adminNo};

			totalWith_Delete.update(values);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
    	
    }
    
    // 공시지가 적용지번 조회
    public	List	executeSelectPlaceWithAddr(String adminNo)
	{
    	MinwoninfoMapDao.SelectPlaceWithAddr	selectPlaceWithAddr	= minwoninfoMap.new SelectPlaceWithAddr(getDataSource(), getMessageSourceAccessor());
    	
    	Object[] values = {adminNo};
    	
    	return selectPlaceWithAddr.execute(values);
	}
    
    
  //공시지가 적용지번 삭제
    public void executeDeletePlaceWithAddr(String adminNo){
    	
    	MinwoninfoMapDao.DeletePlaceWithAddr	deletePlaceWithAddr	= minwoninfoMap.new DeletePlaceWithAddr(getDataSource(), getMessageSourceAccessor());
    	
		try
		{
			Object[] values = {adminNo};
			deletePlaceWithAddr.update(values);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
    }
    
	//공시지가 적용지번 추가
    public void executeInsertPlaceWithAddr(String adminNo,String pnu,String addr){
    	
    	MinwoninfoMapDao.InsertPlaceWithAddr	insertPlaceWithAddr	= minwoninfoMap.new InsertPlaceWithAddr(getDataSource(), getMessageSourceAccessor());
    	
		try
		{
			Object[] values = {
					adminNo,
					adminNo,
					pnu,
					addr
			};
			
			insertPlaceWithAddr.update(values);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
    }
  
    
 
}
