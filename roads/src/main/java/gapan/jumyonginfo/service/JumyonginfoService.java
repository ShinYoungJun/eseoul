//	2009		Kim Yun Seo

package main.java.gapan.jumyonginfo.service;


import java.util.List;

import main.java.gapan.jumyonginfo.model.GapanInfoBean;
import main.java.gapan.jumyonginfo.dao.IJumyonginfoDao;
import main.java.gapan.jumyonginfo.model.GapanHeadBean;
import main.java.gapan.jumyonginfo.model.MinwonBean;
import main.java.gapan.jumyonginfo.model.PlaceBean;


public class JumyonginfoService implements IJumyonginfoService {

	private IJumyonginfoDao iJumyonginfoDao = null;
	
	public void setGapan_jumyonginfoDao(IJumyonginfoDao gapan_jumyonginfoDao) {
	    this.iJumyonginfoDao = gapan_jumyonginfoDao;
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
	
	
	
	public  boolean executeUnyong_Gapan_Head_Modify(GapanHeadBean Bean)
	{
		return iJumyonginfoDao.executeUnyong_Gapan_Head_Modify(Bean);
	}
	
	
	
	
	public	List	executeJumin_View(String admin_no)
	{
		return iJumyonginfoDao.executeJumin_View(admin_no);
	}
	public	boolean	executeJumin_Gapan_Head_Modify(GapanHeadBean Bean)
	{
		return iJumyonginfoDao.executeJumin_Gapan_Head_Modify(Bean);
	}
	

	
	
	public	List	executeJumji_View(String gapanno)
	{
		return iJumyonginfoDao.executeJumji_View(gapanno);
	}
	public	boolean	executeJumji_Modify(GapanInfoBean Bean)
	{
		return iJumyonginfoDao.executeJumji_Modify(Bean);
	}
	
	
	
	
	
	
	public	int		executeJumji_Count(String corp_cd, String gu_code, String request_no)
	{
		return iJumyonginfoDao.executeJumji_Count(corp_cd, gu_code, request_no);
	}
	//	전승원 추가
	public	String	getObject_No(PlaceBean Bean)
	{
		return iJumyonginfoDao.getObject_No(Bean);
	}
	public	List	executeSearch_Depth()
	{
		return iJumyonginfoDao.executeSearch_Depth();
	}
	
	
	// 시설물 규격 가져오기
	public	List	executeGetFtSel(String FT_TYP)	{
		return iJumyonginfoDao.executeGetFtSel(FT_TYP);
	}
	
	// 시설물 명 가져오기
	public	List	executeGetFtTyp(String GP_TYP)	{
		return iJumyonginfoDao.executeGetFtTyp(GP_TYP);
	}	
	
}
