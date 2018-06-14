//	2009		Kim Yun Seo

package main.java.jumyong.saewe.service;

import java.util.List;

import main.java.jumyong.saewe.model.BugwaSearchBean;
import main.java.jumyong.saewe.model.TaxationBean;

public interface ISaeweService {

	public	List	executeSearch(BugwaSearchBean Bean, int intRn1,int intRn2);
	public	int		executeCount(BugwaSearchBean Bean);
	public	List	executeSearch_Ilgwal(BugwaSearchBean Bean);
	
	public	List	executeSanchulSearch(String strAdmin_no, String strSeq, int intRn1,int intRn2);
	public	int		executeSanchulCount(String strAdmin_no, String strSeq);
	
	public	List	executeSanchulInfo_View(String strAdmin_no, String strSeq);
	
	public	List	executeJumin_View(String strAdmin_no);
	public	List	executeJumji_View(String strAdmin_no);
	
	public	List	executeBugwa_View(String strAdmin_no, String strSeq);
	public	boolean	executeBugwa_Modify(TaxationBean Bean);	//	
	public	boolean	executeBugwa_Register(TaxationBean Bean);
	public	List	executeBugwa_DataInfo(String strAdmin_no, String strSeq);
	public	boolean	deleteBugwaDataInfo(String adminNo, String seq);
	
	
	
	public	List	SaeweSuipBugwa_Check(String strAdmin_no, String strSeq);
	public	boolean	SaeweSuipBugwa_Taxation_Info(String strAdmin_no, String strSeq, String InsertKey);
	public	boolean	SaeweSuipBugwa_Admin_Base(String strAdmin_no, String strSeq);
	public	boolean	SetCal_Sum_Info_taxseq(String strSeq);
	
	public	String	executeBugwa_Id(String user_id);
	
	public	List	executeSearch_Ilgwal_junggi(String sigu_cd, String year,String type,String tax_set,String tax_yn,String mul_fromdate,String mul_todate,String purpose,String bj_cd ,String hj_cd
			,String jumyongName, String cal_status, String SECTION);
	
	public List getAddInfo(String admin_no);
	
	public	List	executeSelectPlaceWithAddr(String adminNo);
}
