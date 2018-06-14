//	2009		Kim Yun Seo

package main.java.jumyong.gigan.service;

import java.util.List;

import main.java.jumyong.saewe.model.BugwaSearchBean;
import main.java.jumyong.gigan.dao.IGiganDao;
import main.java.jumyong.gigan.model.GiganSearchBean;
import main.java.jumyong.gigan.model.GiyeonBean;


public class GiganService	implements	IGiganService{
	
	private IGiganDao iGiganDao = null;
	
	public void setJumyong_giganDao(IGiganDao jumyong_giganDao)
	{
	    this.iGiganDao = jumyong_giganDao;
	}
	
	public List executeSearch(GiganSearchBean Bean, int intRn1, int intRn2)
	{
		return iGiganDao.executeSearch(Bean, intRn1, intRn2);
	}
		
	public int	executeCount(GiganSearchBean Bean)
	{
		return iGiganDao.executeCount(Bean);
	}
	
	public List executeJumin_View(String strAdmin_no)
	{
		return iGiganDao.executeJumin_View(strAdmin_no);
	}
	
	public List executeJumji_View(String strAdmin_no)
	{
		return iGiganDao.executeJumji_View(strAdmin_no);
	}
	
	public	List	executeGigan_Search(String strAdmin_no, int intRn1, int intRn2)
	{
		return iGiganDao.executeGigan_Search(strAdmin_no, intRn1, intRn2);
	}
	
	public	int		executeGigan_Count(String strAdmin_no)
	{
		return iGiganDao.executeGigan_Count(strAdmin_no);
	}
	
	public	boolean	executeGigan_Register(GiyeonBean Bean)
	{
		return iGiganDao.executeGigan_Register(Bean);
	}
	
	public	int		executeGigan_TotalCount()
	{
		return iGiganDao.executeGigan_TotalCount();
	}
	
	public	boolean	executeGigan_Ext(GiyeonBean Bean)
	{
		return iGiganDao.executeGigan_Ext(Bean);
	}
	
	public	boolean	executeGigan_All_Register(GiyeonBean Bean, GiganSearchBean SBean)
	{
		return iGiganDao.executeGigan_All_Register(Bean, SBean);
	}
	
	public	boolean	executeGigan_All_Ext(GiyeonBean Bean, GiganSearchBean SBean)
	{
		return iGiganDao.executeGigan_All_Ext(Bean, SBean);
	}
	
	public  boolean executeGigan_Update(GiyeonBean Bean){
		return iGiganDao.executeGigan_Update(Bean);
	}
	
	public  List 	executeBeforeSearch(GiganSearchBean Bean, int intRn1,int intRn2)
	{
		return iGiganDao.executeBeforeSearch(Bean, intRn1, intRn2);
	}
	
	public  int		executeBeforeCount(GiganSearchBean Bean)
	{
		return iGiganDao.executeBeforeCount(Bean);
	}
	
	public	List	executeSelectPlaceWithAddr(String adminNo){
		return iGiganDao.executeSelectPlaceWithAddr(adminNo);
	}
}
