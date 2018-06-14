
package main.java.facility.saewe.service;

import java.util.List;

import main.java.facility.saewe.model.BugwaSearchBean;
import main.java.facility.saewe.model.TaxationBean;

public interface ISaeweService {

	public	List	executeSearch(BugwaSearchBean Bean, int intRn1,int intRn2);
	public	int		executeCount(BugwaSearchBean Bean);
	public	List	executeSearch_Ilgwal(BugwaSearchBean Bean);
	
	public	List	executeSanchulSearch(String guCode, String corpCd, String seq,int intRn1,int intRn2);
	public	int		executeSanchulCount(String guCode, String corpCd,  String seq);
	 
	public	List	executeSanchulInfo_View(String guCode, String corpCd, String seq);
	
	public	int		executeJumji_Count(String corp_cd, String gu_code, String admin_no,String tax_set);
	public	List	executeJumji_View(String corp_cd, String gu_code, String admin_no, String tax_set, int intRn1, int intRn2);
	public	List	executeJumin_View(String guCode,String corpCd);
	public	List	executeJumji_View(String strAdmin_no);
	
	public	List	executeBugwa_View(String guCode,String corpCd,String requestNo, String seq);
	public	boolean	executeBugwa_Modify(TaxationBean Bean);		
	public	boolean	executeBugwa_Register(TaxationBean Bean);
	public	List	executeBugwa_DataInfo(String guCode,String corpCd,String requestNo, String seq);
	
	public	List	SaeweSuipBugwa_Check(String strAdmin_no, String strSeq);
	public	boolean	SaeweSuipBugwa_Taxation_Info(String guCode, String corpCd, String seq, String InsertKey);
	public	boolean	SaeweSuipBugwa_Cal_Sum_Info(String guCode, String corpCd, String seq);
	public	boolean	SaeweSuipBugwa_History_Info(TaxationBean Bean, String user_id, String succes_yn);
	public	boolean	SetCal_Sum_Info_taxseq(String guCode, String corpCd,String adminNo);
	
	public	String	executeBugwa_Id(String user_id);
	public	List	 executePurpose(String corp_cd, String gu_code, String admin_no, String tax_set);
	public	List executeGetSumQuantity(String cal_sum_seq);
	
	public	TaxationBean executeMinObjBunji(String admin_no);
}
