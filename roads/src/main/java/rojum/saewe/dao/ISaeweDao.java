
package main.java.rojum.saewe.dao;

import java.util.List;

import main.java.rojum.saewe.model.BugwaSearchBean;
import main.java.rojum.saewe.model.TaxationBean;

public interface ISaeweDao {

	public	List	executeSearch(BugwaSearchBean Bean);
	public	int		executeCount(BugwaSearchBean Bean);
	public	List	executeSearch_Ilgwal(BugwaSearchBean Bean);

	public	List	executeSanchulSearch(String strAdmin_no, String strSeq, int intRn1,int intRn2);
	public	int		executeSanchulCount(String strAdmin_no, String strSeq);
	
	public	List	executeSanchulInfo_View(String strAdmin_no, String strSeq);
	
	public	List	executeJumin_View(String strAdmin_no);
	public	List	executeJumji_View(String strAdmin_no);
	
	public	List	executeBugwa_View(String strAdmin_no, String strSeq);
	public	boolean	executeBugwa_Modify(TaxationBean Bean);
	public	boolean	executeBugwa_Register(TaxationBean Bean);
	public	List	executeBugwa_DataInfo(String strAdmin_no, String strSeq);
	
	public	List	SaeweSuipBugwa_Check(String strAdmin_no, String strSeq);
	public	boolean	SaeweSuipBugwa_Taxation_Info(String strAdmin_no, String strSeq, String InsertKey);
	public	boolean	SaeweSuipBugwa_Admin_Base(String strAdmin_no, String strSeq);
    public	boolean	SetCal_Sum_Info_taxseq(String strSeq);
    
    public	String	executeBugwa_Id(String user_id);
    public	List	executeBugwa_View_GpTyp(String strAdmin_no, String strSeq);
    public	List	executeBugwa_DataInfo_GpTyp(String strAdmin_no, String strSeq);
    
    public boolean executeSunapProduct(String gapanNo, String seq, String returnDate);
    
	public void GapanInfoTaxationAt(String gapanNo, String seq);
	
	public List executeSearchPenaltyIlgwal(String gu_cd);
	
	public int getCalculationSequence();
	public int getCal_Sum_Seq();
	
	public boolean insertReCalculationInfo(String calSeq,String calSumSeq,String gapanNo,String orgSeq);
	public boolean insertReCalSumInfo(String calSumSeq,String gapanNo,String orgSeq);
	public boolean insertReTaxationInfo(String calSumSeq,String taxDate,String inDate,String overDate,String gapanNo,String orgSeq);
	
	public boolean setSubmitReply(String gapanNo,String seq,String replyGubun,String reply_etc);
	
	//********** BEGIN_현진_20120227
	public	List	executeSearch_misunap(BugwaSearchBean Bean);
	public	int		executeCount_misunap(BugwaSearchBean Bean);
	//********** END_현진_20120227
	//********** BEGIN_KANG_20120705
	public	boolean	SaeweSuipBugwa_Taxation_Info_Before(String strAdmin_no, String strBeforeSeq, String BeforeYear);
	//********** END_KANG_20120705

	
}
