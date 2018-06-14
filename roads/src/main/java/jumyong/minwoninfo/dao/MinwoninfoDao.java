//	2009		Kim Yun Seo

package main.java.jumyong.minwoninfo.dao;


import java.util.List;

import main.java.common.dao.RoadsJdbcDaoSupport;

import main.java.jumyong.minwoninfo.model.AppealBean;
import main.java.jumyong.minwoninfo.model.MinwonBean;
import main.java.jumyong.minwoninfo.model.PlaceBean;


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
					Bean.getEMAIL_MIN(),
					
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
    	MinwoninfoMapDao.Minwon_Register	minwoninfo_Register	= minwoninfoMap.new Minwon_Register(getDataSource(), getMessageSourceAccessor());
    	
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
				Bean.getADMIN_NO()
				
				
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
					Bean.getSAN_CK(),
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
}
