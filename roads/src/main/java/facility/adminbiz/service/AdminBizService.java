//	2009		Kim Yun Seo

package main.java.facility.adminbiz.service;

import java.util.List;

import main.java.facility.adminbiz.dao.IAdminBizDao;
import main.java.facility.adminbiz.model.AdminBizBean;
import main.java.facility.minwon.dao.IMinwonDao;


public class AdminBizService implements IAdminBizService {

	private IAdminBizDao iAdminBizDao = null;
	
	public void setFacility_adminbizDao(IAdminBizDao facility_adminbizDao) {
	    this.iAdminBizDao = facility_adminbizDao;
	}
	
	public List adminBizSearch(String name, String manager, String gu_code, int startPage, int endPage){
		return iAdminBizDao.adminBizSearch(name, manager, gu_code,startPage,endPage);
	}
	
	public	int		adminBizSearchCount(String name, String manager, String gu_code){
		return iAdminBizDao.adminBizSearchCount(name, manager, gu_code);
	}
	
	public AdminBizBean adminBizView(String gu_code, String corp_cd){
		return iAdminBizDao.adminBizView(gu_code, corp_cd);
	}
	
	public List adminBizCompanyList(String gu_code){
		return iAdminBizDao.adminBizCompanyList(gu_code);
	}
	
	public int adminBizInsert(AdminBizBean bean){
		return iAdminBizDao.adminBizInsert(bean);
	}
	
	public String maxOffice_cd(String gu_code){
		
		return iAdminBizDao.maxOffice_cd(gu_code);
	}
	public String maxJijum_cd(String gu_code,String office_cd){

		System.out.println("### maxJijum_cd ###\n");
		System.out.println("gu_code = " + gu_code);
		System.out.println("office_cd = " + office_cd);
		System.out.println("### maxJijum_cd ###\n");

		return iAdminBizDao.maxJijum_cd(gu_code, office_cd);
	}
	
	public int adminBizUpdate(AdminBizBean bean, String corp){
		
		return iAdminBizDao.adminBizUpdate(bean,corp);
	}
	
	public int adminBizDelete(String gu_code, String corp_cd){
		return iAdminBizDao.adminBizDelete(gu_code, corp_cd);
	}
	/* 
	 public List executeSearch(String strName,
		String strReq_no, String strReq_date1, String strReq_date2, 
		String strCheck, String Process, 
		int intRn1, int intRn2)
	{
		return iAdminBizDao.executeSearch(strName, strReq_no, strReq_date1, strReq_date2, strCheck, Process, intRn1, intRn2);
	}*/
	
	/*public int	executeCount(String strName, String strReq_no, String strReq_date1, String strReq_date2, String strCheck, String Process)
	{
		return iMinwonDao.executeCount(strName, strReq_no, strReq_date1, strReq_date2, strCheck, Process);
	}
	
	
	public Admin_BaseBean executeAdmin_Base_Register(Admin_BaseBean Bean)
	{
		return iMinwonDao.executeAdmin_Base_Register(Bean);
	}
	
	public boolean executeAppeal_Register(AppealBean Bean)
	{
		return iMinwonDao.executeAppeal_Register(Bean);
	}
	
	public boolean executeAppeal_Update(AppealBean Bean)
	{
		return iMinwonDao.executeAppeal_Update(Bean);
	}
	
	public boolean executePlace_Register(PlaceBean Bean)
	{
		return iMinwonDao.executePlace_Register(Bean);
	}
	
	public boolean executeMinwon_Register(MinwonBean Bean)
	{
		return iMinwonDao.executeMinwon_Register(Bean);
	}	

	public	int		executeCheck_AdminnoCount()
	{
		return iMinwonDao.executeCheck_AdminnoCount();
	}
	
	public	int		executeCheck_Adminno(String ADMIN_NO)
	{
		return iMinwonDao.executeCheck_Adminno(ADMIN_NO);
	}
	
	public	int		executeCheck_CorpcdCount(String CORP_CD)
	{
		return iMinwonDao.executeCheck_CorpcdCount(CORP_CD);
	}
	
	public	List	executeSearch_Jumin(AppealBean Bean, int intRn1, int intRn2)
	{
		return iMinwonDao.executeSearch_Jumin(Bean, intRn1, intRn2);
	}
	
	public	int	executeSearch_JuminCount(AppealBean Bean)
	{
		return iMinwonDao.executeSearch_JuminCount(Bean);
	}
	
	public	List	executeSearch_Depth()
	{
		return iMinwonDao.executeSearch_Depth();
	}
	
	//Àü½Â¿ø Ãß°¡
	public	String	getRequest_No(Admin_BaseBean Bean)
	{
		return iMinwonDao.getRequest_No(Bean);
	}
	
	//Àü½Â¿ø Ãß°¡
	public	String	getObject_No(PlaceBean Bean)
	{
		return iMinwonDao.getObject_No(Bean);
	}
	
	public String getAppeal_Check(AppealBean Bean)
	{
		return iMinwonDao.getAppeal_Check(Bean);
	}
	
	public AppealBean getAppeal(String corp_cd, String gu_code)
	{
		return iMinwonDao.getAppeal(corp_cd, gu_code);
	}*/
}
