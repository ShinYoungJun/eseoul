//	2009		Kim Yun Seo

package main.java.facility.junggiinfo.service;

import java.util.List;

import main.java.facility.junggiinfo.model.AppealBean;
import main.java.facility.junggiinfo.model.MinwonBean;
import main.java.facility.junggiinfo.model.PlaceBean;
import main.java.facility.saewe.model.BugwaSearchBean;


public interface IJunggiinfoService {

	public	List	executeMinwon_View(String strAdmin_no);
	public	List	executeMinwon_View_Search(String strAdmin_no, String strSeq);
	public	boolean	executeMinwon_Modify(MinwonBean Bean);
	public	boolean	executeMinwon_Register(MinwonBean Bean);
	
	public	List	executeJumin_View(String corp_cd, String gu_code);
	public	boolean	executeJumin_Modify(AppealBean Bean);
	
	public	List	executeJumji_View(String corp_cd, String gu_code, String request_no, int intRn1, int intRn2);
	public	List	executeJumji_View(String corp_cd, String gu_code, String request_no);
	public	boolean	executeJumji_Modify(PlaceBean Bean);
	public	boolean	executeJumji_Register(PlaceBean Bean);
	
	
	public	int		executeJumji_Count(String corp_cd, String gu_code, String request_no);
	public	String	getObject_No(PlaceBean Bean);					//전승원 추가
	public	List	executeSearch_Depth();							//	심도
}
