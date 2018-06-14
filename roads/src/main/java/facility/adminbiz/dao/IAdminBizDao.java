//	2009		Kim Yun Seo

package main.java.facility.adminbiz.dao;

import java.util.List;

import main.java.facility.adminbiz.model.AdminBizBean;
import main.java.facility.minwon.model.Admin_BaseBean;
import main.java.facility.minwon.model.AppealBean;
import main.java.facility.minwon.model.JumjiSearchBean;
import main.java.facility.minwon.model.MinwonBean;
import main.java.facility.minwon.model.PlaceBean;


public interface IAdminBizDao {

	public List adminBizSearch(String name, String manager, String gu_code, int startPage, int endPage);
	public	int		adminBizSearchCount(String name, String manager, String gu_code);
	public AdminBizBean adminBizView(String gu_code, String corp_cd);
	public List adminBizCompanyList(String gu_code);
	public int adminBizInsert(AdminBizBean bean);
	public String maxOffice_cd(String gu_code);
	public String maxJijum_cd(String gu_code,String office_cd);
	public int adminBizUpdate(AdminBizBean bean,String corp);
	public int adminBizDelete(String gu_code, String corp_cd);
//	public	List	executeSearch(String strName, String strReq_no, String strReq_date1, String strReq_date2, String strCheck, String Process, int intRn1, int intRn2);
/*	public	int		executeCount(String strName, String strReq_no, String strReq_date1, String strReq_date2, String strCheck, String Process);

	public	Admin_BaseBean	executeAdmin_Base_Register(Admin_BaseBean Bean);	//	EQUIP_ADMIN_BASE
	public	boolean	executeMinwon_Register(MinwonBean Bean);					//	MINWON_INFO
	public 	boolean executeAppeal_Register(AppealBean Bean);					//	EQUIP_APPEAL
	public 	boolean executeAppeal_Update(AppealBean Bean);						//	EQUIP_APPEAL
	public 	boolean executePlace_Register(PlaceBean Bean);						//	EQUIP_PLACE

	public	int		executeCheck_AdminnoCount();
	public	int		executeCheck_Adminno(String ADMIN_NO);
	public	int		executeCheck_CorpcdCount(String CORP_CD);
	
	public	List	executeSearch_Jumin(AppealBean Bean, int intRn1, int intRn2);	//	관련 점용지 조회
	public	int		executeSearch_JuminCount(AppealBean Bean);						//	관련 점용지 조회 정보 갯수
	
	public	List	executeSearch_Depth();	//	심도
	
	public	String	getRequest_No(Admin_BaseBean Bean);		//전승원 추가
	public	String	getObject_No(PlaceBean Bean);			//전승원 추가
	public	String	getAppeal_Check(AppealBean Bean);		//점용인 등록되어 있는지 여부...등록되어 있다면 false를 반환
	public	AppealBean	getAppeal(String corp_cd, String gu_code);	//EquipAppeal에서 값을 가져온다.
*/}
