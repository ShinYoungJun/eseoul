//	2009		Kim Yun Seo

package main.java.junggi.gigan.dao;

import java.util.List;

import main.java.common.dao.RoadsJdbcDaoSupport;
import main.java.junggi.gigan.model.GiganSearchBean;
import main.java.junggi.gigan.model.GiyeonBean;


public class GiganDao	extends RoadsJdbcDaoSupport	implements	IGiganDao{
	
	private	GiganMapDao	giganMap	= new GiganMapDao();
	
	
    protected	void	initDao()  throws Exception
    {
		super.initDao();
   	}
    
    //	검색
    public	List	executeSearch(GiganSearchBean Bean, int intRn1,int intRn2)
	{
    	GiganMapDao.Search	search	= giganMap.new Search(getDataSource(), getMessageSourceAccessor());
    	
    	String	PURPOSE_CD	= Bean.getPURPOSE_CD();
    	
    	if(Bean.getTYPE().equals("")	||	Bean.getTYPE() == null)
    		Bean.setTYPE("%");
    	if(Bean.getOWNER_SET().equals("")	||	Bean.getOWNER_SET() == null)
    		Bean.setOWNER_SET("%");
    	if(Bean.getTAX_SET().equals("")	||	Bean.getTAX_SET() == null)
    		Bean.setTAX_SET("%");
    	if(Bean.getPURPOSE_CD().equals("000")	||	Bean.getPURPOSE_CD().equals("")	||	Bean.getPURPOSE_CD() == null)
    		PURPOSE_CD	= "%";
    	if(Bean.getBJ_CD().equals("")	||	Bean.getBJ_CD() == null)
    		Bean.setBJ_CD("%");
    	if(Bean.getHJ_CD().equals("")	||	Bean.getHJ_CD() == null)
    		Bean.setHJ_CD("%");
    	
    	Object[] values = {
    			Bean.getTYPE(),
    			Bean.getOWNER_SET(),
    			Bean.getTAX_SET(),
    			Bean.getGIGAN1(),
    			Bean.getGIGAN2(),
    			PURPOSE_CD,
    			"%" + Bean.getADMINNO() + "%",
    			"%" + Bean.getNAME() + "%",
    			Bean.getBJ_CD(),
    			Bean.getHJ_CD(),
    			"%" + Bean.getBONBUN() + "%",
    			"%" + Bean.getBUBUN() + "%",
    			Bean.getSIDO(),
    			Bean.getSIGUNGU(),
            	new Integer(intRn1),
            	new Integer(intRn2)
        	};
        	
        return search.execute(values);
	}
    
    //	전체 건수
    public	int		executeCount(GiganSearchBean Bean)
	{
		String sql = getMessageSourceAccessor().getMessage("Querys.junggi.gigan.Count");
		
    	String	PURPOSE_CD	= Bean.getPURPOSE_CD();
    	
    	if(Bean.getTYPE().equals("")	||	Bean.getTYPE() == null)
    		Bean.setTYPE("%");
    	if(Bean.getOWNER_SET().equals("")	||	Bean.getOWNER_SET() == null)
    		Bean.setOWNER_SET("%");
    	if(Bean.getTAX_SET().equals("")	||	Bean.getTAX_SET() == null)
    		Bean.setTAX_SET("%");
    	if(Bean.getPURPOSE_CD().equals("000")	||	Bean.getPURPOSE_CD().equals("")	||	Bean.getPURPOSE_CD() == null)
    		PURPOSE_CD	= "%";
    	if(Bean.getBJ_CD().equals("")	||	Bean.getBJ_CD() == null)
    		Bean.setBJ_CD("%");
    	if(Bean.getHJ_CD().equals("")	||	Bean.getHJ_CD() == null)
    		Bean.setHJ_CD("%");
    	
    	Object[] values = {
    			Bean.getTYPE(),
    			Bean.getOWNER_SET(),
    			Bean.getTAX_SET(),
    			Bean.getGIGAN1(),
    			Bean.getGIGAN2(),
    			PURPOSE_CD,
    			"%" + Bean.getADMINNO() + "%",
    			"%" + Bean.getNAME() + "%",
    			Bean.getBJ_CD(),
    			Bean.getHJ_CD(),
    			"%" + Bean.getBONBUN() + "%",
    			"%" + Bean.getBUBUN() + "%",
    			Bean.getSIDO(),
    			Bean.getSIGUNGU()
        	};
		
		return 	getJdbcTemplate().queryForInt(sql, values);
	}
    
    
    //	점용인정보 보기
    public	List	executeJumin_View(String strAdmin_no)
	{
    	GiganMapDao.Jumin_View	jumin_View	= giganMap.new Jumin_View(getDataSource(), getMessageSourceAccessor());
    	
    	Object[] values = {strAdmin_no};
    	
    	return jumin_View.execute(values);
	}
    
    
    //	점용지정보 보기
    public	List	executeJumji_View(String strAdmin_no)
	{
    	GiganMapDao.Jumji_View	jumji_View	= giganMap.new Jumji_View(getDataSource(), getMessageSourceAccessor());
    	
    	Object[] values = {strAdmin_no};
    	
    	return jumji_View.execute(values);
	}
    
    
    //	점용기간  연장 보기
	public	List	executeGigan_Search(String strAdmin_no, int intRn1, int intRn2)
	{
    	GiganMapDao.Gigan_Search	gigan_Search	= giganMap.new Gigan_Search(getDataSource(), getMessageSourceAccessor());
    	
    	Object[] values = {
    			strAdmin_no,
            	new Integer(intRn1),
            	new Integer(intRn2)
    		};
    	
    	return gigan_Search.execute(values);
	}
	
	
    public	int		executeGigan_Count(String strAdmin_no)
	{
		String sql = getMessageSourceAccessor().getMessage("Querys.junggi.gigan.Gigan_Count");
		
    	Object[] values = {
    			strAdmin_no
    		};
    	
		return 	getJdbcTemplate().queryForInt(sql, values);
	}
    
	
	//	점용기간 연장 등록
	public	boolean	executeGigan_Register(GiyeonBean Bean)
	{
		GiganMapDao.Gigan_Register	gigan_Register	= giganMap.new Gigan_Register(getDataSource(), getMessageSourceAccessor());
    	
		try
		{
		//	int	SEQ	= executeGigan_TotalCount();	//	카운트을 알아온다..(테이블에 시퀀스가 추가되면 삭제)
			
			Object[] values = {
					Bean.getREGDATE(),
					Bean.getAFTER_FROMDATE(),
					Bean.getAFTER_TODATE(),
					Bean.getNOTES(),
					Bean.getMANAGER(),
					Bean.getADMIN_NO()
				};
			
			gigan_Register.update(values);
		}
		catch (Exception e)
		{
			e.printStackTrace();
			return	false;
		}
		
		return	true;
	}
	
    //	저장 테이블 전체 건수
    public	int		executeGigan_TotalCount()
	{
		String sql = getMessageSourceAccessor().getMessage("Querys.junggi.gigan.Gigan_TotalCount");
		
		return 	getJdbcTemplate().queryForInt(sql);
	}
    
    
    //	점용지 정보의 기간연장 수정
    //	먼저 executeGigan_Register를 사용하여 이력테이블에 변경전 날짜를 저장하여야 됨
	public	boolean	executeGigan_Ext(GiyeonBean Bean)
	{
		GiganMapDao.Gigan_Ext	gigan_Ext	= giganMap.new Gigan_Ext(getDataSource(), getMessageSourceAccessor());
    	
		try
		{
			Object[] values = {
					Bean.getAFTER_FROMDATE(),
					Bean.getAFTER_TODATE(),
					Bean.getADMIN_NO()
				};
			
			gigan_Ext.update(values);
		}
		catch (Exception e)
		{
			e.printStackTrace();
			return	false;
		}
		
		return	true;
	}
	

	
	//	점용기간 연장 전체 등록
	public	boolean	executeGigan_All_Register(GiyeonBean Bean, GiganSearchBean SBean)
	{
		GiganMapDao.Gigan_All_Register	gigan_Register	= giganMap.new Gigan_All_Register(getDataSource(), getMessageSourceAccessor());
    	
    	String	PURPOSE_CD	= SBean.getPURPOSE_CD();
    	
    	if(SBean.getTYPE().equals("")	||	SBean.getTYPE() == null)
    		SBean.setTYPE("%");
    	if(SBean.getOWNER_SET().equals("")	||	SBean.getOWNER_SET() == null)
    		SBean.setOWNER_SET("%");
    	if(SBean.getTAX_SET().equals("")	||	SBean.getTAX_SET() == null)
    		SBean.setTAX_SET("%");
    	if(SBean.getPURPOSE_CD().equals("000")	||	SBean.getPURPOSE_CD().equals("")	||	SBean.getPURPOSE_CD() == null)
    		PURPOSE_CD	= "%";
    	if(SBean.getBJ_CD().equals("")	||	SBean.getBJ_CD() == null)
    		SBean.setBJ_CD("%");
    	if(SBean.getHJ_CD().equals("")	||	SBean.getHJ_CD() == null)
    		SBean.setHJ_CD("%");
    	
		try
		{
		//	int	SEQ	= executeGigan_TotalCount();	//	카운트을 알아온다..(테이블에 시퀀스가 추가되면 삭제)
			
			Object[] values = {
					Bean.getREGDATE(),
					Bean.getAFTER_FROMDATE(),
					Bean.getAFTER_TODATE(),
					Bean.getNOTES(),
					Bean.getMANAGER(),
				//	Bean.getADMIN_NO(),
					
					SBean.getTYPE(),
					SBean.getOWNER_SET(),
					SBean.getTAX_SET(),
					SBean.getGIGAN1(),
	    			SBean.getGIGAN2(),
	    			PURPOSE_CD,
	    			"%" + SBean.getADMINNO() + "%",
	    			"%" + SBean.getNAME() + "%",
	    			SBean.getBJ_CD(),
	    			SBean.getHJ_CD(),
	    			"%" + SBean.getBONBUN() + "%",
	    			"%" + SBean.getBUBUN() + "%"	
				};
			
			gigan_Register.update(values);
		}
		catch (Exception e)
		{
			e.printStackTrace();
			return	false;
		}
		
		return	true;
	}
	
    //	점용지 정보의 기간연장 전체 수정
    //	먼저 executeGigan_Register를 사용하여 이력테이블에 변경전 날짜를 저장하여야 됨
	public	boolean	executeGigan_All_Ext(GiyeonBean Bean, GiganSearchBean SBean)
	{
		GiganMapDao.Gigan_All_Ext	gigan_Ext	= giganMap.new Gigan_All_Ext(getDataSource(), getMessageSourceAccessor());
    	
    	String	PURPOSE_CD	= SBean.getPURPOSE_CD();
    	
    	if(SBean.getTYPE().equals("")	||	SBean.getTYPE() == null)
    		SBean.setTYPE("%");
    	if(SBean.getOWNER_SET().equals("")	||	SBean.getOWNER_SET() == null)
    		SBean.setOWNER_SET("%");
    	if(SBean.getTAX_SET().equals("")	||	SBean.getTAX_SET() == null)
    		SBean.setTAX_SET("%");
    	if(SBean.getPURPOSE_CD().equals("000")	||	SBean.getPURPOSE_CD().equals("")	||	SBean.getPURPOSE_CD() == null)
    		PURPOSE_CD	= "%";
    	if(SBean.getBJ_CD().equals("")	||	SBean.getBJ_CD() == null)
    		SBean.setBJ_CD("%");
    	if(SBean.getHJ_CD().equals("")	||	SBean.getHJ_CD() == null)
    		SBean.setHJ_CD("%");
    	
		try
		{
			Object[] values = {
					Bean.getAFTER_FROMDATE(),
					Bean.getAFTER_TODATE(),
				//	Bean.getADMIN_NO()
					
					SBean.getTYPE(),
					SBean.getOWNER_SET(),
					SBean.getTAX_SET(),
					SBean.getGIGAN1(),
	    			SBean.getGIGAN2(),
	    			PURPOSE_CD,
	    			"%" + SBean.getADMINNO() + "%",
	    			"%" + SBean.getNAME() + "%",
	    			SBean.getBJ_CD(),
	    			SBean.getHJ_CD(),
	    			"%" + SBean.getBONBUN() + "%",
	    			"%" + SBean.getBUBUN() + "%"	
				};
			
			gigan_Ext.update(values);
		}
		catch (Exception e)
		{
			e.printStackTrace();
			return	false;
		}
		
		return	true;
	}

}
