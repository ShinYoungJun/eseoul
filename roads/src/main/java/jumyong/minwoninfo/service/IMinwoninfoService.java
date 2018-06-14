//	2009		Kim Yun Seo

package main.java.jumyong.minwoninfo.service;

import java.util.List;

import main.java.jumyong.minwoninfo.model.AppealBean;
import main.java.jumyong.minwoninfo.model.MinwonBean;
import main.java.jumyong.minwoninfo.model.PlaceBean;
import main.java.jumyong.saewe.model.BugwaSearchBean;


public interface IMinwoninfoService {

	public	List	executeMinwon_View(String strAdmin_no, int intRn1, int intRn2);
	public	List	executeMinwon_View_Search(String strAdmin_no, String strSeq);
	public	boolean	executeMinwon_Modify(MinwonBean Bean);
	public	boolean	executeMinwon_Register(MinwonBean Bean);
	public	int		executeMinwon_Count(String strAdmin_no);
	
	public	List	executeJumin_View(String strAdmin_no);
	public	boolean	executeJumin_Modify(AppealBean Bean);
	
	public	List	executeJumji_View(String strAdmin_no);
	public	boolean	executeJumji_Modify(PlaceBean Bean);
}