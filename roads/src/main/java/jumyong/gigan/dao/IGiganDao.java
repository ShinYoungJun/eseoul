//	2009		Kim Yun Seo

package main.java.jumyong.gigan.dao;

import java.util.List;

import main.java.jumyong.saewe.model.BugwaSearchBean;
import main.java.jumyong.gigan.model.GiganSearchBean;
import main.java.jumyong.gigan.model.GiyeonBean;


public interface IGiganDao {

	public	List	executeSearch(GiganSearchBean Bean, int intRn1, int intRn2);
	public	int		executeCount(GiganSearchBean Bean);

	public	List	executeJumin_View(String strAdmin_no);
	public	List	executeJumji_View(String strAdmin_no);
	
	public	List	executeGigan_Search(String strAdmin_no, int intRn1, int intRn2);
	public	int		executeGigan_Count(String strAdmin_no);
	public	boolean	executeGigan_Register(GiyeonBean Bean);
	public	int		executeGigan_TotalCount();
	
	public	boolean	executeGigan_All_Register(GiyeonBean Bean, GiganSearchBean SBean);
	public	boolean	executeGigan_All_Ext(GiyeonBean Bean, GiganSearchBean SBean);
	
	public	boolean	executeGigan_Ext(GiyeonBean Bean);
	public  boolean executeGigan_Update(GiyeonBean Bean);
	
	public  List 	executeBeforeSearch(GiganSearchBean Bean, int intRn1,int intRn2);
	public  int		executeBeforeCount(GiganSearchBean Bean); 
	public	List	executeSelectPlaceWithAddr(String adminNo);
}
