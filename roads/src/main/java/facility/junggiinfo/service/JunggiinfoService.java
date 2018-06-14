//	2009		Kim Yun Seo

package main.java.facility.junggiinfo.service;


import java.util.List;

import main.java.facility.junggiinfo.dao.IJunggiinfoDao;

import main.java.facility.junggiinfo.model.AppealBean;
import main.java.facility.junggiinfo.model.MinwonBean;
import main.java.facility.junggiinfo.model.PlaceBean;


public class JunggiinfoService implements IJunggiinfoService {

	private IJunggiinfoDao iJunggiinfoDao = null;
	
	public void setFacility_junggiinfoDao(IJunggiinfoDao facility_junggiinfoDao) {
	    this.iJunggiinfoDao = facility_junggiinfoDao;
	}
	
	public	List	executeMinwon_View(String strAdmin_no)
	{
		return iJunggiinfoDao.executeMinwon_View(strAdmin_no);
	}
	
	public	List	executeMinwon_View_Search(String strAdmin_no, String strSeq)
	{
		return iJunggiinfoDao.executeMinwon_View_Search(strAdmin_no, strSeq);
	}
	
	public	boolean	executeMinwon_Modify(MinwonBean Bean)
	{
		return iJunggiinfoDao.executeMinwon_Modify(Bean);
	}
	
	public	boolean	executeMinwon_Register(MinwonBean Bean)
	{
		return iJunggiinfoDao.executeMinwon_Register(Bean);
	}
	
	public	List	executeJumin_View(String corp_cd, String gu_code)
	{
		return iJunggiinfoDao.executeJumin_View(corp_cd, gu_code);
	}
	
	public	boolean	executeJumin_Modify(AppealBean Bean)
	{
		return iJunggiinfoDao.executeJumin_Modify(Bean);
	}
	
	public	List	executeJumji_View(String corp_cd, String gu_code, String request_no, int intRn1, int intRn2)
	{
		return iJunggiinfoDao.executeJumji_View(corp_cd, gu_code, request_no, intRn1, intRn2);
	}
	
	public	List	executeJumji_View(String corp_cd, String gu_code, String request_no)
	{
		return iJunggiinfoDao.executeJumji_View(corp_cd, gu_code, request_no);
	}
	
	public boolean executeJumji_Register(PlaceBean Bean)
	{
		return iJunggiinfoDao.executeJumji_Register(Bean);
	}
	
	public	boolean	executeJumji_Modify(PlaceBean Bean)
	{
		return iJunggiinfoDao.executeJumji_Modify(Bean);
	}
	
	public	int		executeJumji_Count(String corp_cd, String gu_code, String request_no)
	{
		return iJunggiinfoDao.executeJumji_Count(corp_cd, gu_code, request_no);
	}
	
	//	Àü½Â¿ø Ãß°¡
	public	String	getObject_No(PlaceBean Bean)
	{
		return iJunggiinfoDao.getObject_No(Bean);
	}
	
	public	List	executeSearch_Depth()
	{
		return iJunggiinfoDao.executeSearch_Depth();
	}
}
