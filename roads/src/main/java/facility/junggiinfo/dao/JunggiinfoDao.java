//	2009		Kim Yun Seo

package main.java.facility.junggiinfo.dao;


import java.util.List;
import java.util.Map;

import main.java.common.dao.RoadsJdbcDaoSupport;
import main.java.facility.junggiinfo.model.AppealBean;
import main.java.facility.junggiinfo.model.MinwonBean;
import main.java.facility.junggiinfo.model.PlaceBean;


public class JunggiinfoDao	extends RoadsJdbcDaoSupport	implements	IJunggiinfoDao
{
	private	JunggiinfoMapDao	junggiinfoMapDao	= new JunggiinfoMapDao();
	
	
    protected	void	initDao()  throws Exception
    {
		super.initDao();
   	}
    
 
    
    //	민원정보 보기
    public	List	executeMinwon_View(String strAdmin_no)
	{
    	JunggiinfoMapDao.Minwon_View	minwon_View	= junggiinfoMapDao.new Minwon_View(getDataSource(), getMessageSourceAccessor());
    	
    	Object[] values = {
    				strAdmin_no
    	};
    	
    	return minwon_View.execute(values);
	}
    
    
    public	List	executeMinwon_View_Search(String strAdmin_no, String strSeq)
    {
    	JunggiinfoMapDao.Minwon_View_Search		minwon_View	= junggiinfoMapDao.new Minwon_View_Search(getDataSource(), getMessageSourceAccessor());
    	
    	Object[] values = {strAdmin_no, strSeq};
    	
    	return minwon_View.execute(values);
    }
    
    
    //	민원정보 등록
    public	boolean	executeMinwon_Modify(MinwonBean Bean)
	{
    	JunggiinfoMapDao.Minwon_Modify	minwon_Modify	= junggiinfoMapDao.new Minwon_Modify(getDataSource(), getMessageSourceAccessor());
    	
		try
		{
			System.out.println("Bean.getREQ_DATE_MIN() ==>"+Bean.getREQ_DATE_MIN());
			System.out.println("Bean.getREQ_NM_MIN() ==>"+Bean.getREQ_NM_MIN());
			System.out.println("Bean.getMANAGER_MIN() ==>"+Bean.getMANAGER_MIN());
			System.out.println("Bean.getGUBUN_MIN() ==>"+Bean.getGUBUN_MIN());
			System.out.println("Bean.getAGENT_NM_MIN() ==>"+Bean.getAGENT_NM_MIN());
			
			System.out.println("Bean.getAGENT_TEL_MIN() ==>"+Bean.getAGENT_TEL_MIN());
			System.out.println("Bean.getREQ_DEP_MIN() ==>"+Bean.getREQ_DEP_MIN());
			System.out.println("Bean.getMANAGE_DEP_MIN() ==>"+Bean.getMANAGE_DEP_MIN());
			System.out.println("Bean.getNOTES_MIN() ==>"+Bean.getNOTES_MIN());
			System.out.println("Bean.getPREDATE_MIN() ==>"+Bean.getPREDATE_MIN());
			
			System.out.println("Bean.getSSN_MIN() ==>"+Bean.getSSN_MIN());
			System.out.println("Bean.getNAME_MIN() ==>"+Bean.getNAME_MIN());
			System.out.println("Bean.getTEL_MIN() ==>"+Bean.getTEL_MIN());
			System.out.println("Bean.getHP_MIN() ==>"+Bean.getHP_MIN());
			System.out.println("Bean.getADDR1_MIN() ==>"+Bean.getADDR1_MIN());
			
			System.out.println("Bean.getADDR2_MIN() ==>"+Bean.getADDR2_MIN());
			System.out.println("Bean.getPOST_MIN() ==>"+Bean.getPOST_MIN());
			System.out.println("Bean.getREQ_NO_MIN() ==>"+Bean.getREQ_NO_MIN());
			System.out.println("Bean.getADMIN_NO_MIN() ==>"+Bean.getADMIN_NO_MIN());
			
			Object[] values = {
					Bean.getREQ_DATE_MIN(),
					Bean.getREQ_NM_MIN(),
					Bean.getMANAGER_MIN(),
					Bean.getGUBUN_MIN(),
					Bean.getAGENT_NM_MIN(),
					
					Bean.getAGENT_TEL_MIN(),
					Bean.getREQ_DEP_MIN(),
					Bean.getMANAGE_DEP_MIN(),
					Bean.getNOTES_MIN(),
					Bean.getPREDATE_MIN(),
					
					Bean.getSSN_MIN(),
					Bean.getNAME_MIN(),
					Bean.getTEL_MIN(),
					Bean.getHP_MIN(),
					Bean.getADDR1_MIN(),
					
					Bean.getADDR2_MIN(),
					Bean.getPOST_MIN(),
					Bean.getREQ_NO_MIN(),
					Bean.getADMIN_NO_MIN(),
					Bean.getSEQ_MIN()
					
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
    	JunggiinfoMapDao.Minwon_Register	minwoninfo_Register	= junggiinfoMapDao.new Minwon_Register(getDataSource(), getMessageSourceAccessor());
    	
		try
		{
			Object[] values = {
					Bean.getADMIN_NO_MIN(),
					Bean.getREQ_NO_MIN(),
					Bean.getREQ_DATE_MIN(),
					Bean.getREQ_NM_MIN(),
					Bean.getMANAGER_MIN(),
					Bean.getGUBUN_MIN(),
					Bean.getAGENT_NM_MIN(),
					Bean.getAGENT_TEL_MIN(),
					Bean.getEVENT_SET_MIN(),
					Bean.getREQ_SET_MIN(),
					
					Bean.getREQ_SIGU_MIN(),
					Bean.getREQ_DEP_MIN(),
					Bean.getREQ_SET_CN_MIN(),
					Bean.getBIZSSN_MIN(),
					Bean.getMANAGE_DEP_MIN(),
					Bean.getNOTES_MIN(),
					Bean.getPREDATE_MIN(),
					Bean.getSSN_MIN(),
					Bean.getNAME_MIN(),
					Bean.getTEL_MIN(),
					
					Bean.getHP_MIN(),
					Bean.getADDR1_MIN(),
					Bean.getADDR2_MIN(),
					Bean.getPOST_MIN(),
					Bean.getREAL_DEAL_DATE_MIN(),
					Bean.getMW_PROG_SE_MIN(),
					Bean.getEMAIL_MIN()
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
		
		
//    public	int		executeMinwon_Count(String strAdmin_no)
//    {
//    	Object[] values = {strAdmin_no};
//    	
//    	String sql = getMessageSourceAccessor().getMessage("Querys.junggi.junggiinfo.Minwon_Count");
//		return 	getJdbcTemplate().queryForInt(sql, values);
//    }

    
    //	점용인정보 보기
    public	List	executeJumin_View(String corp_cd, String gu_code)
	{
    	JunggiinfoMapDao.Jumin_View	jumin_View	= junggiinfoMapDao.new Jumin_View(getDataSource(), getMessageSourceAccessor());
    	
    	Object[] values = {corp_cd , gu_code};
    	
    	return jumin_View.execute(values);
	}
    
    //	점용인 정보 수정
    public	boolean	executeJumin_Modify(AppealBean Bean)
	{
    	JunggiinfoMapDao.Jumin_Modify	jumin_Modify	= junggiinfoMapDao.new Jumin_Modify(getDataSource(), getMessageSourceAccessor());
    	
		try
		{
			Object[] values = {
					Bean.getNAME(),
					Bean.getSSN(),
					Bean.getTOPOST_NM(),
					Bean.getBIZSSN(),
					Bean.getPOST(),
					
					Bean.getADDR1(),
					Bean.getADDR2(),					
					Bean.getBIZ_STATUS(),
					Bean.getBIZ_TYPES(),
					Bean.getTOPOST(),
					
					Bean.getTOADDR1(),
					Bean.getTOADDR2(),
					Bean.getOFFICE(),
					Bean.getMANAGER(),
					Bean.getTOTEL(),
					
					Bean.getTOTEL_EXT(),
					Bean.getTOFAX(),
					Bean.getHP(),
					Bean.getCORP_CD(),
					Bean.getGU_CODE()
			};

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
    public	List	executeJumji_View(String corp_cd, String gu_code, String request_no)
	{
    	JunggiinfoMapDao.Jumji_View2	jumji_View2	= junggiinfoMapDao.new Jumji_View2(getDataSource(), getMessageSourceAccessor());
    	
    	Object[] values = {
    				corp_cd, 
    				gu_code, 
    				request_no
    	};
    	
    	return jumji_View2.execute(values);
	}
    
    //	점용지정보 보기
    public	List	executeJumji_View(String corp_cd, String gu_code, String request_no, int intRn1, int intRn2)
	{
    	JunggiinfoMapDao.Jumji_View	jumji_View	= junggiinfoMapDao.new Jumji_View(getDataSource(), getMessageSourceAccessor());
    	
    	Object[] values = {
    				corp_cd, 
    				gu_code, 
    				request_no, 
    				new Integer(intRn1),
    				new Integer(intRn2)
    	};
    	
    	return jumji_View.execute(values);
	}
    
    //	점용지정보  수정
    public	boolean	executeJumji_Modify(PlaceBean Bean)
	{
    	JunggiinfoMapDao.Jumji_Modify	jumji_Modify	= junggiinfoMapDao.new Jumji_Modify(getDataSource(), getMessageSourceAccessor());
    	
		try
		{
			System.out.println("#######################  executeJumji_Modify  ######################################");
			
			System.out.println("Bean.getSECTION() ==>"+Bean.getSECTION());
			System.out.println("Bean.getOWNER_SET() ==>"+Bean.getOWNER_SET());
			System.out.println("Bean.getTAX_SET() ==>"+Bean.getTAX_SET());
			System.out.println("Bean.getPURPOSE_CD() ==>"+Bean.getPURPOSE_CD());
			System.out.println("Bean.getSTANDARD() ==>"+Bean.getSTANDARD());
			
			System.out.println("Bean.getQUANTITY() ==>"+Bean.getQUANTITY());
			System.out.println("Bean.getDEPTH_CK() ==>"+Bean.getDEPTH_CK());
			System.out.println("Bean.getDEPTH_NUM() ==>"+Bean.getDEPTH_NUM());
			System.out.println("Bean.getMUL_FROMDATE() ==>"+Bean.getMUL_FROMDATE());
			System.out.println("Bean.getMUL_TODATE() ==>"+Bean.getMUL_TODATE());
			
			System.out.println("Bean.getPARTLY_PERIOD() ==>"+Bean.getPARTLY_PERIOD());
			System.out.println("Bean.getTOTAL_PERIOD() ==>"+Bean.getTOTAL_PERIOD());
			System.out.println("Bean.getWORK_FROMDATE() ==>"+Bean.getWORK_FROMDATE());
			System.out.println("Bean.getWORK_TODATE() ==>"+Bean.getWORK_TODATE());
			System.out.println("Bean.getCOMPLETION_DATE() ==>"+Bean.getCOMPLETION_DATE());
			
			System.out.println("Bean.getEXE_INFO() ==>"+Bean.getEXE_INFO());
			System.out.println("Bean.getSISUL_POST() ==>"+Bean.getSISUL_POST());
			System.out.println("Bean.getSISUL_ADDR1() ==>"+Bean.getSISUL_ADDR1());
			System.out.println("Bean.getSISUL_ADDR2() ==>"+Bean.getSISUL_ADDR2());
			System.out.println("Bean.getADMIN_NO() ==>"+Bean.getADMIN_NO());
			
			System.out.println("Bean.getPURPOSESEBU_CD() ==>"+Bean.getPURPOSESEBU_CD());
			System.out.println("Bean.getYEAR() ==>"+Bean.getYEAR());
			System.out.println("Bean.getCORP_CD() ==>"+Bean.getCORP_CD());
			System.out.println("Bean.getGU_CODE() ==>"+Bean.getGU_CODE());
			System.out.println("Bean.getREQUEST_NO() ==>"+Bean.getREQUEST_NO());
			
			System.out.println("Bean.getOBJECT_NO() ==>"+Bean.getOBJECT_NO());
			System.out.println("############################################################################################");
			Object[] values = {
					Bean.getSECTION(),
					Bean.getOWNER_SET(),
					Bean.getTAX_SET(),
					Bean.getPURPOSE_CD(),
					Bean.getSTANDARD(),
					
					Bean.getQUANTITY(),
					Bean.getDEPTH_CK(),
					Bean.getDEPTH_NUM(),
					Bean.getMUL_FROMDATE(),
					Bean.getMUL_TODATE(),
					
					Bean.getPARTLY_PERIOD(),
					Bean.getTOTAL_PERIOD(),
					Bean.getWORK_FROMDATE(),
					Bean.getWORK_TODATE(),
					Bean.getCOMPLETION_DATE(),
					
					Bean.getEXE_INFO(),
					Bean.getSISUL_POST(),
					Bean.getSISUL_ADDR1(),
					Bean.getSISUL_ADDR2(),
					Bean.getADMIN_NO(),
					
					Bean.getPURPOSESEBU_CD(),
					Bean.getYEAR(),
					Bean.getCORP_CD(),
					Bean.getGU_CODE(),
					Bean.getREQUEST_NO(),
					
					Bean.getOBJECT_NO()
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
    
	  public	int		executeJumji_Count(String corp_cd, String gu_code, String request_no)
	  {
	  	Object[] values = {corp_cd, gu_code, request_no};
	  	
	  	String sql = getMessageSourceAccessor().getMessage("Querys.facility.junggiinfo.Jumji_Count");
			return 	getJdbcTemplate().queryForInt(sql, values);
	  }
	  
	  
	  //	점용지 정보 등록
	    public	boolean	executeJumji_Register(PlaceBean Bean)
		{
	    	JunggiinfoMapDao.Jumji_Register	jumji_Register	= junggiinfoMapDao.new Jumji_Register(getDataSource(), getMessageSourceAccessor());
			try
			{
				System.out.println("Bean.getCORP_CD() ==>"+Bean.getCORP_CD());
				System.out.println("Bean.getGU_CODE() ==>"+Bean.getGU_CODE());
				System.out.println("Bean.getREQUEST_NO() ==>"+Bean.getREQUEST_NO());
				System.out.println("Bean.getOBJECT_NO() ==>"+Bean.getOBJECT_NO());
				System.out.println("Bean.getSECTION() ==>"+Bean.getSECTION());
				System.out.println("Bean.getOWNER_SET() ==>"+Bean.getOWNER_SET());
				System.out.println("Bean.getTAX_SET() ==>"+Bean.getTAX_SET());
				System.out.println("Bean.getPURPOSE_CD() ==>"+Bean.getPURPOSE_CD());
				System.out.println("Bean.getSTANDARD() ==>"+Bean.getSTANDARD());
				System.out.println("Bean.getQUANTITY() ==>"+Bean.getQUANTITY());
				System.out.println("Bean.getDEPTH_CK() ==>"+Bean.getDEPTH_CK());
				System.out.println("Bean.getDEPTH_NUM() ==>"+Bean.getDEPTH_NUM());
				System.out.println("Bean.getMUL_FROMDATE() ==>"+Bean.getMUL_FROMDATE());
				System.out.println("Bean.getMUL_TODATE() ==>"+Bean.getMUL_TODATE());
				System.out.println("Bean.getPARTLY_PERIOD() ==>"+Bean.getPARTLY_PERIOD());
				System.out.println("Bean.getTOTAL_PERIOD() ==>"+Bean.getTOTAL_PERIOD());
				System.out.println("Bean.getBJ_CD() ==>"+Bean.getBJ_CD());
				System.out.println("Bean.getHJ_CD() ==>"+Bean.getHJ_CD());
				System.out.println("Bean.getSPC_CD() ==>"+Bean.getSPC_CD());
				System.out.println("Bean.getBONBUN() ==>"+Bean.getBONBUN());
				System.out.println("Bean.getBUBUN() ==>"+Bean.getBUBUN());
				System.out.println("Bean.getADDR_CK() ==>"+Bean.getADDR_CK());
				System.out.println("Bean.getSISUL_ADDR_CK() ==>"+Bean.getSISUL_ADDR_CK());
				System.out.println("Bean.getSISUL_ADDR() ==>"+Bean.getSISUL_ADDR());
				System.out.println("Bean.getWORK_FROMDATE() ==>"+Bean.getWORK_FROMDATE());
				System.out.println("Bean.getWORK_TODATE() ==>"+Bean.getWORK_TODATE());
				System.out.println("Bean.getCOMPLETION_DATE() ==>"+Bean.getCOMPLETION_DATE());
				System.out.println("Bean.getEXE_INFO() ==>"+Bean.getEXE_INFO());
				System.out.println("Bean.getADMIN_NO() ==>"+Bean.getADMIN_NO());
				System.out.println("Bean.getPURPOSESEBU_CD() ==>"+Bean.getPURPOSESEBU_CD());
				System.out.println("Bean.getYEAR() ==>"+ Bean.getYEAR());
				
				Object[] values = {
					Bean.getCORP_CD(),
					Bean.getGU_CODE(),
					Bean.getREQUEST_NO(),
					Bean.getOBJECT_NO(),
					Bean.getSECTION(),
					
					Bean.getOWNER_SET(),
					Bean.getTAX_SET(),
					Bean.getPURPOSE_CD(),
					Bean.getSTANDARD(),
					Bean.getQUANTITY(),
					
					Bean.getDEPTH_CK(),
					Bean.getDEPTH_NUM(),
					Bean.getMUL_FROMDATE(),
					Bean.getMUL_TODATE(),
					Bean.getPARTLY_PERIOD(),
					
					Bean.getTOTAL_PERIOD(),
//					Bean.getBJ_CD(),
//					Bean.getHJ_CD(),
//					Bean.getSPC_CD(),
//					Bean.getBONBUN(),
					
//					Bean.getBUBUN(),
//					Bean.getADDR_CK(),
//					Bean.getSISUL_ADDR_CK(),
//					Bean.getSISUL_ADDR(),
					Bean.getWORK_FROMDATE(),
					Bean.getWORK_TODATE(),
					Bean.getCOMPLETION_DATE(),
					Bean.getEXE_INFO(),

					Bean.getSISUL_POST(),
					Bean.getSISUL_ADDR1(),
					Bean.getSISUL_ADDR2(),
					Bean.getADMIN_NO(),
					Bean.getPURPOSESEBU_CD(),
					
					Bean.getYEAR()
					
				};
				
				jumji_Register.update(values);
			}
			catch (Exception e)
			{
				System.out.println(" ! ERROR : executeJumji_Register");
				e.printStackTrace();
				return	false;
			}
			
			return	true;
	    }
	    
	    //전승원 추가
	    public	String	getObject_No(PlaceBean Bean)
		{
	    	Object[] values = {Bean.getCORP_CD(), Bean.getGU_CODE(), Bean.getREQUEST_NO()};

	    	String sql = getMessageSourceAccessor().getMessage("Querys.facility.junggiinfo.getObject_No");
	    	Map Request_Map =getJdbcTemplate().queryForMap(sql, values);
	    	return Request_Map.get("OBJECT_NO").toString();
		}
	    
	    
	    public	List	executeSearch_Depth()
		{
	    	JunggiinfoMapDao.Select_Depth	select_Depth	= junggiinfoMapDao.new Select_Depth(getDataSource(), getMessageSourceAccessor());
	    	
	    	Object[] values = {};
			
			return select_Depth.execute(values);
	    }
}
