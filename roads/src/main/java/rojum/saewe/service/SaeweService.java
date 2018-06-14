
package main.java.rojum.saewe.service;

import java.util.List;

import main.java.rojum.saewe.dao.ISaeweDao;
import main.java.rojum.saewe.model.BugwaSearchBean;
import main.java.rojum.saewe.model.TaxationBean;

public class SaeweService	implements	ISaeweService{
	
	private ISaeweDao iSaeweDao = null;
	
	public void setRojum_saeweDao(ISaeweDao rojum_saeweDao) {
	    this.iSaeweDao = rojum_saeweDao;
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
	
	public boolean executeSunapProduct(String gapanNo, String seq, String returnDate){
		return iSaeweDao.executeSunapProduct(gapanNo,seq,returnDate);
	}
	public void GapanInfoTaxationAt(String gapanNo, String seq){
		iSaeweDao.GapanInfoTaxationAt(gapanNo,seq);
	}
	
	public List executeSearchPenaltyIlgwal(String gu_cd){
		return iSaeweDao.executeSearchPenaltyIlgwal(gu_cd);
	}
	
	public int getCalculationSequence(){
		return iSaeweDao.getCalculationSequence();
	}
	public int getCal_Sum_Seq(){
		return iSaeweDao.getCal_Sum_Seq();
	}
	
	public boolean insertReCalculationInfo(String calSeq,String calSumSeq,String gapanNo,String orgSeq){
		return iSaeweDao.insertReCalculationInfo(calSeq,calSumSeq,gapanNo,orgSeq);
	};
	
	public boolean insertReCalSumInfo(String calSumSeq,String gapanNo,String orgSeq){
		return iSaeweDao.insertReCalSumInfo(calSumSeq,gapanNo,orgSeq);
	};
	
	public boolean insertReTaxationInfo(String calSumSeq,String taxDate,String inDate,String overDate,String gapanNo,String orgSeq){
		return iSaeweDao.insertReTaxationInfo(calSumSeq,taxDate,inDate,overDate,gapanNo,orgSeq);
	};
	
	public boolean setSubmitReply(String gapanNo,String seq,String replyGubun,String reply_etc){
		return iSaeweDao.setSubmitReply(gapanNo, seq, replyGubun, reply_etc);
	}
	//********** BEGIN_현진_20120227
	public	List	executeSearch_misunap(BugwaSearchBean Bean){
		return iSaeweDao.executeSearch_misunap(Bean);
	}
	public	int		executeCount_misunap(BugwaSearchBean Bean){
		return iSaeweDao.executeCount_misunap(Bean);
	}
	//********** END_현진_20120227
	
	//********** BEGIN_KANG_20120705
	public	boolean	SaeweSuipBugwa_Taxation_Info_Before(String strAdmin_no, String strBeforeSeq, String BeforeYear){
		return iSaeweDao.SaeweSuipBugwa_Taxation_Info_Before(strAdmin_no,strBeforeSeq, BeforeYear);
	}
	//********** END_KANG_20120705
}
