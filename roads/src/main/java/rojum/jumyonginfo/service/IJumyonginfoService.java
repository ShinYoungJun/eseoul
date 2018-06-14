//	2009		Kim Yun Seo

package main.java.rojum.jumyonginfo.service;

import java.util.List;

import main.java.rojum.jumyonginfo.model.GapanInfoBean;
import main.java.rojum.jumyonginfo.model.GapanHeadBean;
import main.java.rojum.jumyonginfo.model.MinwonBean;
import main.java.rojum.jumyonginfo.model.PlaceBean;


public interface IJumyonginfoService {
	
	public  boolean executeUnyong_Gapan_Head_Modify(GapanHeadBean gapanHeadBean);
	
	public	List	executeJumin_View(String admin_no);
	
	public	List	executeJumji_View(String gapanno);
	public	boolean	executeJumji_Modify(GapanInfoBean Bean);
	
	public	int		executeJumji_Count(String corp_cd, String gu_code, String request_no);
	
	// 시설물 규격 가져오기
	public	List	executeGetFtSel(String FT_TYP);	
	
	// 시설물 명 가져오기
	public	List	executeGetFtTyp(String GP_TYP);
	
	// 시설물 유형별 가져오기
	public	List	executeGetFtCat(String FT_TYP);
	
	public String executeGetSection(String gapanNo);
	
}
