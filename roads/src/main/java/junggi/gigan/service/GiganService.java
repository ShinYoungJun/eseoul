//	2009		Kim Yun Seo

package main.java.junggi.gigan.service;

import java.util.List;

import main.java.jumyong.saewe.model.BugwaSearchBean;
import main.java.junggi.gigan.dao.IGiganDao;
import main.java.junggi.gigan.model.GiganSearchBean;
import main.java.junggi.gigan.model.GiyeonBean;


public class GiganService	implements	IGiganService{
	
	private IGiganDao iGiganDao = null;
	
	public void setJunggi_giganDao(IGiganDao junggi_giganDao)
	{
	    this.iGiganDao = junggi_giganDao;
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
}
