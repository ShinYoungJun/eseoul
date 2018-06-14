
package main.java.facility.saewe.service;

import java.util.List;

import main.java.facility.saewe.dao.ISaeweDao;
import main.java.facility.saewe.model.BugwaSearchBean;
import main.java.facility.saewe.model.TaxationBean;

public class SaeweService	implements	ISaeweService{
	
	private ISaeweDao iSaeweDao = null;
	
	public void setFacility_saeweDao(ISaeweDao facility_saeweDao) {
	    this.iSaeweDao = facility_saeweDao;
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
	
	public List executeSanchulSearch(String guCode, String corpCd, String seq, int intRn1, int intRn2)
	{
		return iSaeweDao.executeSanchulSearch(guCode, corpCd, seq, intRn1, intRn2);
	}
		
	public int	executeSanchulCount(String guCode, String corpCd, String seq)
	{
		return iSaeweDao.executeSanchulCount(guCode, corpCd, seq);
	}
	
	public	List	executeSanchulInfo_View(String guCode, String corpCd, String seq)
	{
		return	iSaeweDao.executeSanchulInfo_View(guCode, corpCd, seq);
	}
	
	public List executeJumin_View(String guCode,String corpCd)
	{
		return iSaeweDao.executeJumin_View(guCode, corpCd);
	}
	
	public List executeJumji_View(String strAdmin_no)
	{
		return iSaeweDao.executeJumji_View(strAdmin_no);
	}
	
	public List executeBugwa_View(String guCode,String corpCd,String requestNo,String seq)
	{
		return iSaeweDao.executeBugwa_View(guCode, corpCd, requestNo, seq);
	}
	
	public	boolean	executeBugwa_Modify(TaxationBean Bean)
	{
		return iSaeweDao.executeBugwa_Modify(Bean);
	}	
	
	public	boolean	executeBugwa_Register(TaxationBean Bean)
	{
		return iSaeweDao.executeBugwa_Register(Bean);
	}
	
	public	List	executeBugwa_DataInfo(String guCode,String corpCd,String requestNo, String seq)
	{
		return iSaeweDao.executeBugwa_DataInfo(guCode,corpCd,requestNo, seq);
	}
	
	public	List	SaeweSuipBugwa_Check(String strAdmin_no, String strSeq)
	{
		return iSaeweDao.SaeweSuipBugwa_Check(strAdmin_no, strSeq);
	}
	
	public	boolean		SaeweSuipBugwa_Taxation_Info(String guCode,String corpCd,String seq,String InsertKey)
	{
		return iSaeweDao.SaeweSuipBugwa_Taxation_Info(guCode, corpCd,  seq, InsertKey);
	}
	
	public	boolean		SaeweSuipBugwa_Cal_Sum_Info(String guCode,String corpCd,String seq)
	{
		return iSaeweDao.SaeweSuipBugwa_Cal_Sum_Info(guCode, corpCd,  seq);
	}

	public	boolean	SetCal_Sum_Info_taxseq(String guCode, String corpCd,String adminNo)
	{
		return iSaeweDao.SetCal_Sum_Info_taxseq(guCode, corpCd, adminNo);
	}

	public boolean SaeweSuipBugwa_History_Info(TaxationBean Bean, String user_id, String succes_yn)
	{	
		return iSaeweDao.SaeweSuipBugwa_History_Info(Bean, user_id, succes_yn);
	}	
	
	public	List executeJumji_View(String corp_cd, String gu_code, String admin_no, String tax_set, int intRn1, int intRn2)
	{
		return iSaeweDao.executeJumji_View(corp_cd, gu_code, admin_no, tax_set, intRn1, intRn2);
	}
	
	public	int		executeJumji_Count(String corp_cd, String gu_code, String admin_no, String tax_set)
	{
		return iSaeweDao.executeJumji_Count(corp_cd, gu_code, admin_no,tax_set);
	}
	
	
	public String executeBugwa_Id(String user_id)
	{
		return iSaeweDao.executeBugwa_Id(user_id);
	}
	
	public	List	 executePurpose(String corp_cd, String gu_code, String admin_no, String tax_set){
		return iSaeweDao.executePurpose(corp_cd, gu_code, admin_no, tax_set);
	}
	public	List executeGetSumQuantity(String cal_sum_seq){
		return iSaeweDao.executeGetSumQuantity(cal_sum_seq);
	}
	
	public	TaxationBean executeMinObjBunji(String admin_no){
    	return iSaeweDao.executeMinObjBunji(admin_no);
    }
}
