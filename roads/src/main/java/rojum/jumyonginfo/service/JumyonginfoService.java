//	2009		Kim Yun Seo

package main.java.rojum.jumyonginfo.service;


import java.util.List;

import sun.security.krb5.internal.i;

import main.java.rojum.jumyonginfo.model.GapanInfoBean;
import main.java.rojum.jumyonginfo.dao.IJumyonginfoDao;
import main.java.rojum.jumyonginfo.model.GapanHeadBean;
import main.java.rojum.jumyonginfo.model.MinwonBean;
import main.java.rojum.jumyonginfo.model.PlaceBean;


public class JumyonginfoService implements IJumyonginfoService {

	private IJumyonginfoDao iJumyonginfoDao = null;
	
	public void setRojum_jumyonginfoDao(IJumyonginfoDao rojum_jumyonginfoDao) {
	    this.iJumyonginfoDao = rojum_jumyonginfoDao;
	}	
	
	public  boolean executeUnyong_Gapan_Head_Modify(GapanHeadBean Bean)
	{
		System.out.println("############# executeUnyong_Gapan_Head_Modify ################");
		return iJumyonginfoDao.executeUnyong_Gapan_Head_Modify(Bean);
	}
	
	
	
	
	public	List	executeJumin_View(String admin_no)
	{
		return iJumyonginfoDao.executeJumin_View(admin_no);
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
	
	// 시설물 규격 가져오기
	public	List	executeGetFtSel(String FT_TYP)	{
		return iJumyonginfoDao.executeGetFtSel(FT_TYP);
	}
	
	// 시설물 명 가져오기
	public	List	executeGetFtTyp(String GP_TYP)	{
		return iJumyonginfoDao.executeGetFtTyp(GP_TYP);
	}	
	
	// 시설물 유형별 가져오기
	public	List	executeGetFtCat(String FT_TYP){
		return iJumyonginfoDao.executeGetFtCat(FT_TYP);
	}
	
	public String executeGetSection(String gapanNo){
		return iJumyonginfoDao.executeGetSection(gapanNo);
	}
	
}
