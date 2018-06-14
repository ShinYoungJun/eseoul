//	2009		Kim Yun Seo

package main.java.facility.minwoninfo.service;


import java.util.List;

import main.java.facility.minwoninfo.dao.IMinwoninfoDao;

import main.java.facility.minwoninfo.model.AppealBean;
import main.java.facility.minwoninfo.model.MinwonBean;
import main.java.facility.minwoninfo.model.PlaceBean;


public class MinwoninfoService implements IMinwoninfoService {

	private IMinwoninfoDao iMinwoninfoDao = null;
	
	public void setFacility_minwoninfoDao(IMinwoninfoDao facility_minwoninfoDao) 
	{
	    this.iMinwoninfoDao = facility_minwoninfoDao;
	}
	
	public	List	executeMinwon_View(String strAdmin_no, int intRn1, int intRn2)
	{
		return iMinwoninfoDao.executeMinwon_View(strAdmin_no, intRn1, intRn2);
	}
	
	public	List	executeMinwon_View_Search(String strAdmin_no, String strSeq)
	{
		return iMinwoninfoDao.executeMinwon_View_Search(strAdmin_no, strSeq);
	}
	
	public	boolean	executeMinwon_Modify(MinwonBean Bean)
	{
		return iMinwoninfoDao.executeMinwon_Modify(Bean);
	}
	
	public	boolean	executeMinwon_Register(MinwonBean Bean)
	{
		return iMinwoninfoDao.executeMinwon_Register(Bean);
	}
	
	public	int		executeMinwon_Count(String strAdmin_no)
	{
		return iMinwoninfoDao.executeMinwon_Count(strAdmin_no);
	}
	
	public	List	executeJumin_View(String strAdmin_no)
	{
		return iMinwoninfoDao.executeJumin_View(strAdmin_no);
	}
	
	public	boolean	executeJumin_Modify(AppealBean Bean)
	{
		return iMinwoninfoDao.executeJumin_Modify(Bean);
	}
	
	public	List	executeJumji_View(String strAdmin_no)
	{
		return iMinwoninfoDao.executeJumji_View(strAdmin_no);
	}
	
	public	boolean	executeJumji_Modify(PlaceBean Bean)
	{
		return iMinwoninfoDao.executeJumji_Modify(Bean);
	}
}
