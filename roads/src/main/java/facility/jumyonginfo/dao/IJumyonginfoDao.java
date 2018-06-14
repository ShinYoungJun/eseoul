//	2009		Kim Yun Seo

package main.java.facility.jumyonginfo.dao;
import java.util.List;

import main.java.facility.jumyonginfo.model.AppealBean;
import main.java.facility.jumyonginfo.model.MinwonBean;
import main.java.facility.jumyonginfo.model.PlaceBean;

public interface IJumyonginfoDao {

	public	List	executeMinwon_View(String strAdmin_no);
	public	List	executeMinwon_View_Search(String strAdmin_no, String strSeq);
	public	boolean	executeMinwon_Modify(MinwonBean Bean);
	public	boolean	executeMinwon_Register(MinwonBean Bean);
//	public	int		executeMinwon_Count(String strAdmin_no);

	public	List	executeJumin_View(String corp_cd, String gu_code);
	public	boolean	executeJumin_Modify(AppealBean Bean);
	
	public	List	executeJumji_View(String corp_cd, String gu_code, String adminno, String year, int intRn1, int intRn2);
	public	List	executeJumji_View(String corp_cd, String gu_code, String request_no);
	public	boolean	executeJumji_Modify(PlaceBean Bean);
	public	int		executeJumji_Count(String corp_cd, String gu_code, String admin_no);
	
	public	String	getObject_No(PlaceBean Bean);			//전승원 추가
	public 	boolean executeJumji_Register(PlaceBean Bean);						//	EQUIP_PLACE_INFO
	public	List	executeSearch_Depth();							//	심도
	
}
