//	2009		Kim Yun Seo

package main.java.jumyong.saewe.service;

import java.util.List;

import main.java.jumyong.saewe.dao.ISaeweDao;
import main.java.jumyong.saewe.model.BugwaSearchBean;
import main.java.jumyong.saewe.model.TaxationBean;

public class SaeweService	implements	ISaeweService{
	
	private ISaeweDao iSaeweDao = null;
	
	public void setJumyong_saeweDao(ISaeweDao jumyong_saeweDao) {
	    this.iSaeweDao = jumyong_saeweDao;
	}
	
	public List executeSearch(BugwaSearchBean Bean, int intRn1, int intRn2)
	{
		return iSaeweDao.executeSearch(Bean, intRn1, intRn2);
	}
		
	public int	executeCount(BugwaSearchBean Bean)
	{
		return iSaeweDao.executeCount(Bean);
	}
	
	public List executeSearch_Ilgwal(BugwaSearchBean Bean)
	{
		return iSaeweDao.executeSearch_Ilgwal(Bean);
	}
	
	public List executeSanchulSearch(String strAdmin_no, String strSeq, int intRn1, int intRn2)
	{
		return iSaeweDao.executeSanchulSearch(strAdmin_no, strSeq, intRn1, intRn2);
	}
		
	public int	executeSanchulCount(String strAdmin_no, String strSeq)
	{
		return iSaeweDao.executeSanchulCount(strAdmin_no, strSeq);
	}
	
	public	List	executeSanchulInfo_View(String strAdmin_no, String strSeq)
	{
		return	iSaeweDao.executeSanchulInfo_View(strAdmin_no, strSeq);
	}
	
	public List executeJumin_View(String strAdmin_no)
	{
		return iSaeweDao.executeJumin_View(strAdmin_no);
	}
	
	public List executeJumji_View(String strAdmin_no)
	{
		return iSaeweDao.executeJumji_View(strAdmin_no);
	}
	
	public List executeBugwa_View(String strAdmin_no, String strSeq)
	{
		return iSaeweDao.executeBugwa_View(strAdmin_no, strSeq);
	}
	
	public	boolean	executeBugwa_Modify(TaxationBean Bean)
	{
		return iSaeweDao.executeBugwa_Modify(Bean);
	}	
	
	public	boolean	executeBugwa_Register(TaxationBean Bean)
	{
		return iSaeweDao.executeBugwa_Register(Bean);
	}
	
	public	List	executeBugwa_DataInfo(String strAdmin_no, String strSeq)
	{
		return iSaeweDao.executeBugwa_DataInfo(strAdmin_no, strSeq);
	}
	
	public	boolean	deleteBugwaDataInfo(String adminNo, String seq){
		return iSaeweDao.deleteBugwaDataInfo(adminNo, seq);
	}
	
	public	List	SaeweSuipBugwa_Check(String strAdmin_no, String strSeq)
	{
		return iSaeweDao.SaeweSuipBugwa_Check(strAdmin_no, strSeq);
	}
	
	public	boolean		SaeweSuipBugwa_Taxation_Info(String strAdmin_no, String strSeq, String InsertKey)
	{
		return iSaeweDao.SaeweSuipBugwa_Taxation_Info(strAdmin_no, strSeq, InsertKey);
	}
	
	public	boolean		SaeweSuipBugwa_Admin_Base(String strAdmin_no, String strSeq)
	{
		return iSaeweDao.SaeweSuipBugwa_Admin_Base(strAdmin_no, strSeq);
	}

	public	boolean	SetCal_Sum_Info_taxseq(String strSeq)
	{
		return iSaeweDao.SetCal_Sum_Info_taxseq(strSeq);
	}
	
	public String executeBugwa_Id(String user_id)
	{
		return iSaeweDao.executeBugwa_Id(user_id);
	}
	
	
	public List	executeSearch_Ilgwal_junggi(String sigu_cd, String year,String type,String tax_set,String tax_yn,String mul_fromdate,String mul_todate,String purpose,String bj_cd , String hj_cd
	,String jumyongName, String cal_status, String SECTION)
	{
		return iSaeweDao.executeSearch_Ilgwal_junggi( sigu_cd, year,  type,  tax_set,  tax_yn,  mul_fromdate, mul_todate, purpose, bj_cd, hj_cd, jumyongName, cal_status, SECTION);
	}
	
	public List getAddInfo(String admin_no){
		return iSaeweDao.getAddInfo(admin_no);
	}
	
	public	List	executeSelectPlaceWithAddr(String adminNo){
		return iSaeweDao.executeSelectPlaceWithAddr(adminNo);
	}
}
