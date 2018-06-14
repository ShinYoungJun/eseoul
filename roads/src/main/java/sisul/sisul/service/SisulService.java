//	2009		Kim Yun Seo

package main.java.sisul.sisul.service;

import java.util.List;

import main.java.sisul.sisul.model.AppealBean;
import main.java.sisul.sisul.model.EqCalculationBean;
import main.java.sisul.sisul.dao.ISisulDao;


public class SisulService	implements	ISisulService{
	
	private ISisulDao iSisulDao = null;
	
	public void setSisulDao(ISisulDao sisulDao) {
	    this.iSisulDao = sisulDao;
	}
	
	public List executeSearch(int intRn1, int intRn2)
	{
		return iSisulDao.executeSearch(intRn1, intRn2);
	}
		
	public int	executeCount()
	{
		return iSisulDao.executeCount();
	}
	
	public List executeJumin_View(String strAdmin_no)
	{
		return iSisulDao.executeJumin_View(strAdmin_no);
	}
	
	public boolean executeJumin_Modify(AppealBean Bean)
	{
		return iSisulDao.executeJumin_Modify(Bean);
	}
	
	public boolean	executeMulgun_Register(EqCalculationBean Bean)
	{
		return iSisulDao.executeMulgun_Register(Bean);
	}
}
