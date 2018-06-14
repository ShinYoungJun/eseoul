//	2009		Kim Yun Seo

package main.java.facility.minwon.service;

import java.util.List;

import main.java.facility.adminbiz.model.AdminBizBean;
import main.java.facility.minwon.model.Admin_BaseBean;
import main.java.facility.minwon.model.AppealBean;
import main.java.facility.minwon.model.JumjiSearchBean;
import main.java.facility.minwon.model.MinwonBean;
import main.java.facility.minwon.model.PlaceBean;


public interface IMinwonService {

	public	List	executeSearch(String strName, String strReq_no, String strReq_date1, String strReq_date2, String strCheck, String Process, int intRn1, int intRn2);
	public	int		executeCount(String strName, String strReq_no, String strReq_date1, String strReq_date2, String strCheck, String Process);

	public	Admin_BaseBean	executeAdmin_Base_Register(Admin_BaseBean Bean);
	public	boolean	executeMinwon_Register(MinwonBean Bean);
	public 	boolean executeAppeal_Register(AppealBean Bean);
	public 	boolean executeAppeal_Update(AppealBean Bean);
	public 	boolean executePlace_Register(PlaceBean Bean);
	
	public	int		executeCheck_AdminnoCount();
	public	int		executeCheck_Adminno(String ADMIN_NO);
	public	int		executeCheck_CorpcdCount(String CORP_CD);
	
	public	List	executeSearch_Jumin(AppealBean Bean, int intRn1, int intRn2);
	public	int		executeSearch_JuminCount(AppealBean Bean);
	
	public	List	executeSearch_Depth();	//	심도
	
	public	String	getRequest_No(Admin_BaseBean Bean);				//전승원 추가
	public	String	getObject_No(PlaceBean Bean);					//전승원 추가
	public	String	getAppeal_Check(AppealBean Bean);				//점용인 등록되어 있는지 여부...등록되어 있다면 false를 반환
	public	AppealBean	getAppeal(String corp_cd, String gu_code);	//EquipAppeal에서 값을 가져온다.
	
	
	public List adminBizSearch(String adminBiz,String MIN_NAME,String gu_code, int startPage,int endPage); //업체 리스트
	public int adminBizSearchCount(String adminBiz, String MIN_NAME, String gu_code); //업체 리스트 카운트
	
	public AdminBizBean adminBizView(String gu_code, String corp_cd); 
	public int MaxAdminNo(String string);
	public String GetRefDongName(String gu_code,String bj_cd);
	
}
