//	2009		Kim Yun Seo

package main.java.facility.minwon.service;

import java.util.List;

import main.java.facility.adminbiz.model.AdminBizBean;
import main.java.facility.minwon.dao.IMinwonDao;
import main.java.facility.minwon.model.Admin_BaseBean;
import main.java.facility.minwon.model.AppealBean;
import main.java.facility.minwon.model.JumjiSearchBean;
import main.java.facility.minwon.model.MinwonBean;
import main.java.facility.minwon.model.PlaceBean;


public class MinwonService implements IMinwonService {

	private IMinwonDao iMinwonDao = null;
	
	public void setFacility_minwonDao(IMinwonDao facility_minwonDao) {
	    this.iMinwonDao = facility_minwonDao;
	}
	
	public List executeSearch(String strName,
		String strReq_no, String strReq_date1, String strReq_date2, 
		String strCheck, String Process, 
		int intRn1, int intRn2)
	{
		return iMinwonDao.executeSearch(strName, strReq_no, strReq_date1, strReq_date2, strCheck, Process, intRn1, intRn2);
	}
	
	public int	executeCount(String strName, String strReq_no, String strReq_date1, String strReq_date2, String strCheck, String Process)
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
	}
	
	public List adminBizSearch(String adminBiz,String MIN_NAME,String gu_code, int startPage,int endPage){
		return iMinwonDao.adminBizSearch(adminBiz, MIN_NAME, gu_code, startPage, endPage);
	}
	
	public int adminBizSearchCount(String adminBiz, String MIN_NAME, String gu_code){
		return iMinwonDao.adminBizSearchCount(adminBiz, MIN_NAME, gu_code);
	}
	
	public AdminBizBean adminBizView(String gu_code, String corp_cd){
		return iMinwonDao.adminBizView(gu_code, corp_cd);
	}
	
	public int MaxAdminNo(String string){
		return iMinwonDao.MaxAdminNo(string);
	}
	public String GetRefDongName(String gu_code,String bj_cd){
		return iMinwonDao.GetRefDongName(gu_code, bj_cd);
	}
}
