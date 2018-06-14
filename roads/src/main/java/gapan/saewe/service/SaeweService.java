
package main.java.gapan.saewe.service;

import java.util.List;

import main.java.gapan.saewe.dao.ISaeweDao;
import main.java.gapan.saewe.model.BugwaSearchBean;
import main.java.gapan.saewe.model.TaxationBean;

public class SaeweService	implements	ISaeweService{
	
	private ISaeweDao iSaeweDao = null;
	
	public void setGapan_saeweDao(ISaeweDao gapan_saeweDao) {
	    this.iSaeweDao = gapan_saeweDao;
	}
	
	public List executeSearch(BugwaSearchBean Bean)
	{
		return iSaeweDao.executeSearch(Bean);
	}
		
	public int	executeCount(BugwaSearchBean Bean)
	{
		return iSaeweDao.executeCount(Bean);
	}
	
	public List executeSearch_Ilgwal(BugwaSearchBean Bean)
	{
		return iSaeweDao.executeSearch_Ilgwal(Bean);
	}
	
	public List executeSanchulSearch(String strAdmin_no, String strSeq)
	{
		return iSaeweDao.executeSanchulSearch(strAdmin_no, strSeq);
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
	
	public List executeBugwa_View_GpTyp(String strAdmin_no, String strSeq)
	{
		return iSaeweDao.executeBugwa_View_GpTyp(strAdmin_no, strSeq);
	}
	
	public	List	executeBugwa_DataInfo_GpTyp(String strAdmin_no, String strSeq)
	{
		return iSaeweDao.executeBugwa_DataInfo_GpTyp(strAdmin_no, strSeq);
	}
}
