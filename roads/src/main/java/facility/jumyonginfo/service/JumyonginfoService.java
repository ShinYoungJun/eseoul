//	2009		Kim Yun Seo

package main.java.facility.jumyonginfo.service;


import java.util.List;

import main.java.facility.jumyonginfo.dao.IJumyonginfoDao;

import main.java.facility.jumyonginfo.model.AppealBean;
import main.java.facility.jumyonginfo.model.MinwonBean;
import main.java.facility.jumyonginfo.model.PlaceBean;


public class JumyonginfoService implements IJumyonginfoService {

	private IJumyonginfoDao iJumyonginfoDao = null;
	
	public void setFacility_jumyonginfoDao(IJumyonginfoDao facility_jumyonginfoDao) {
	    this.iJumyonginfoDao = facility_jumyonginfoDao;
	}
	
	public	List	executeMinwon_View(String strAdmin_no)
	{
		return iJumyonginfoDao.executeMinwon_View(strAdmin_no);
	}
	
	public	List	executeMinwon_View_Search(String strAdmin_no, String strSeq)
	{
		return iJumyonginfoDao.executeMinwon_View_Search(strAdmin_no, strSeq);
	}
	
	public	boolean	executeMinwon_Modify(MinwonBean Bean)
	{
		return iJumyonginfoDao.executeMinwon_Modify(Bean);
	}
	
	public	boolean	executeMinwon_Register(MinwonBean Bean)
	{
		return iJumyonginfoDao.executeMinwon_Register(Bean);
	}
	
	public	List	executeJumin_View(String corp_cd, String gu_code)
	{
		return iJumyonginfoDao.executeJumin_View(corp_cd, gu_code);
	}
	
	public	boolean	executeJumin_Modify(AppealBean Bean)
	{
		return iJumyonginfoDao.executeJumin_Modify(Bean);
	}
	
	public	List	executeJumji_View(String corp_cd, String gu_code, String adminno, String year,  int intRn1, int intRn2)
	{
		return iJumyonginfoDao.executeJumji_View(corp_cd, gu_code, adminno, year, intRn1, intRn2);
	}
	
	public	List	executeJumji_View(String corp_cd, String gu_code, String request_no)
	{
		return iJumyonginfoDao.executeJumji_View(corp_cd, gu_code, request_no);
	}
	
	public boolean executeJumji_Register(PlaceBean Bean)
	{
		return iJumyonginfoDao.executeJumji_Register(Bean);
	}
	
	public	boolean	executeJumji_Modify(PlaceBean Bean)
	{
		return iJumyonginfoDao.executeJumji_Modify(Bean);
	}
	
	public	int		executeJumji_Count(String corp_cd, String gu_code, String admin_no)
	{
		return iJumyonginfoDao.executeJumji_Count(corp_cd, gu_code, admin_no);
	}
	
	//	Àü½Â¿ø Ãß°¡
	public	String	getObject_No(PlaceBean Bean)
	{
		return iJumyonginfoDao.getObject_No(Bean);
	}
	
	public	List	executeSearch_Depth()
	{
		return iJumyonginfoDao.executeSearch_Depth();
	}
}
