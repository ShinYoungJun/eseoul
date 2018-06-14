
package main.java.gapan.saewe.dao;

import java.util.List;

import main.java.gapan.saewe.model.BugwaSearchBean;
import main.java.gapan.saewe.model.TaxationBean;

public interface ISaeweDao {

	public	List	executeSearch(BugwaSearchBean Bean);
	public	int		executeCount(BugwaSearchBean Bean);
	public	List	executeSearch_Ilgwal(BugwaSearchBean Bean);

	public	List	executeSanchulSearch(String strAdmin_no, String strSeq);
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
}
