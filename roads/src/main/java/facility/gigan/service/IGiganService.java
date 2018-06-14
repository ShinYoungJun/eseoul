
package main.java.facility.gigan.service;

import java.util.List;

import main.java.facility.saewe.model.BugwaSearchBean;
import main.java.facility.gigan.model.GiganSearchBean;
import main.java.facility.gigan.model.GiyeonBean;


public interface IGiganService {

	public	List	executeSearch(GiganSearchBean Bean, int intRn1,int intRn2);
	public	int		executeCount(GiganSearchBean Bean);
	
	public	List	executeJumin_View(String strCorpCd,String strGuCode);
	public	List	executeJumji_View(String corpCd,String guCode,String requestNo,String type,String objectNo);

	public	List	executeGigan_Search(String strAdmin_no, int intRn1, int intRn2);
	public	int		executeGigan_Count(String strAdmin_no);
	public	boolean	executeGigan_Register(GiyeonBean Bean);
	public	int		executeGigan_TotalCount();
	
	public	boolean	executeGigan_All_Register(GiyeonBean Bean, GiganSearchBean SBean);
	public	boolean	executeGigan_All_Ext(GiyeonBean Bean, GiganSearchBean SBean);
	
	public	boolean	executeGigan_Ext(GiyeonBean Bean);
}
