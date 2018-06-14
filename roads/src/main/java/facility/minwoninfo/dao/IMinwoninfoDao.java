//	2009		Kim Yun Seo

package main.java.facility.minwoninfo.dao;

import java.util.List;

import main.java.facility.minwoninfo.model.AppealBean;
import main.java.facility.minwoninfo.model.MinwonBean;
import main.java.facility.minwoninfo.model.PlaceBean;


public interface IMinwoninfoDao {

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
