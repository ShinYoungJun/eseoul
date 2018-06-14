//	2009		Kim Yun Seo

package main.java.gapan.jumyonginfo.dao;
import java.util.List;

import main.java.gapan.jumyonginfo.model.GapanInfoBean;
import main.java.gapan.jumyonginfo.model.GapanHeadBean;
import main.java.gapan.jumyonginfo.model.MinwonBean;
import main.java.gapan.jumyonginfo.model.PlaceBean;

public interface IJumyonginfoDao {

	public	List	executeMinwon_View(String strAdmin_no);
	public	List	executeMinwon_View_Search(String strAdmin_no, String strSeq);
	public	boolean	executeMinwon_Register(MinwonBean Bean);
	public	boolean	executeMinwon_Modify(MinwonBean Bean);

	public  boolean executeUnyong_Gapan_Head_Modify(GapanHeadBean gapanHeadBean);
	
	public	List	executeJumin_View(String admin_no);
	public	boolean	executeJumin_Gapan_Head_Modify(GapanHeadBean gapanHeadBean);
	
	public	List	executeJumji_View(String gapanno);
	public	boolean	executeJumji_Modify(GapanInfoBean Bean);
	
	public	int		executeJumji_Count(String corp_cd, String gu_code, String request_no);
	public	String	getObject_No(PlaceBean Bean);					//전승원 추가
	public	List	executeSearch_Depth();							//	심도
	
	public	List	executeGetFtSel(String FT_TYP);

	public	List	executeGetFtTyp(String GP_TYP);
	
}
