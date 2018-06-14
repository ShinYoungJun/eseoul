package main.java.admin.service;

import java.util.List;
import java.util.Map;

import main.java.admin.dao.ICommCodeDao;
import main.java.admin.model.GradeCodeBean;
import main.java.admin.model.OfficeRegBean;
//********** BEGIN_현진_20120313
import main.java.admin.model.OrgCodeBean;
import main.java.admin.model.JojungCodeBean;
//********** END_현진_20120313
//********** BEGIN_현진_20120314
import main.java.admin.model.PurposeCodeBean;
//********** END_현진_20120314

public class CommCodeService implements ICommCodeService {
 
	private ICommCodeDao mDao = null;

	public void setCommCodeDao(ICommCodeDao newCommCodeDao) {
		this.mDao = newCommCodeDao;
	}

	public List retrieveAreaCodeList(int intCurrentPage, int intCountPerPage, String siName,String guName,String hdName) {
		
		return mDao.retrieveAreaCodeList(intCurrentPage,intCountPerPage,siName,guName,hdName);
	}
	
	public List retrieveOrgCodeList(int intCurrentPage, int intCountPerPage, String guNm) {
	
		return mDao.retrieveOrgCodeList(intCurrentPage,intCountPerPage,guNm);
	}
	
	public List retrievePurposeCodeList(int intCurrentPage, int intCountPerPage, String section,String code) {
		
		return mDao.retrievePurposeCodeList(intCurrentPage,intCountPerPage,section,code);
	}

	public List retrieveTaxCodeList(int intCurrentPage, int intCountPerPage, String taxCode,String taxName,String taxacc){
		
		return mDao.retrieveTaxCodeList(intCurrentPage, intCountPerPage, taxCode, taxName, taxacc);
	}

	public List retrieveZipCodeList(int intCurrentPage, int intCountPerPage, String areaName) {
		
		return mDao.retrieveZipCodeList(intCurrentPage, intCountPerPage, areaName);
	}

	public List retrieveJojungCodeList(int intCurrentPage, int intCountPerPage, String cnt) {
	
		return mDao.retrieveJojungCodeList(intCurrentPage, intCountPerPage, cnt);
	}
	
	public int getAreaTotalCount(String strSiName,String strGuName,String strHdName){
		return mDao.getAreaTotalCount(strSiName, strGuName, strHdName);
	}
	
	public List retrieveGradeCodeList(int intCurrentPage, int intCountPerPage, String gradeName) {
		
		return mDao.retrieveGradeCodeList(intCurrentPage, intCountPerPage, gradeName);
	}
	
	public GradeCodeBean modifyGradeCode(GradeCodeBean objGradeCodeBean) {
		
		return mDao.modifyGradeCode(objGradeCodeBean);
	}
	
	public GradeCodeBean deleteGradeCode(GradeCodeBean objGradeCodeBean) {
		
		return mDao.deleteGradeCode(objGradeCodeBean);
	}
	/******************************************************/
	
	public int getOfficeTotalCount(String officeNm, String sigu_cd){
		return mDao.getOffceTotalCount(officeNm,sigu_cd);
	}
	
	public List retrieveOfficeCodeList(int intCurrentPage, int intCountPerPage,String officeNm,String sigu_cd){
		return mDao.retrieveOfficeCodeList(intCurrentPage, intCountPerPage, officeNm, sigu_cd);
	}
	
	

	/******************************************************/
	/******************************************************/
	
	public boolean verifyOfficeNm(String officeNm,String sigu_cd){
		return mDao.verifyOfficeNm(officeNm, sigu_cd);
	}
	public boolean verifyJijumNm(String officeNm, String jijumNm,String sigu_cd){
		return mDao.verifyJijumNm(officeNm, jijumNm, sigu_cd);
	}
	
	public String verifyOfficeCD(String officeNm,String sigu_cd){
		return mDao.verifyOfficeCD(officeNm,sigu_cd);
	}
	public String verifyMaxOfficeCD(String sigu_cd){
		return mDao.verifyMaxOfficeCD(sigu_cd);
	}
	public String verifyMaxJijumCD(String officeNm,String sigu_cd){
		return mDao.verifyMaxJijumCD(officeNm, sigu_cd);
	}	
	public boolean insertOfficeCode(OfficeRegBean bean ){
		return mDao.insertOfficeCode(bean);
	}
	

	/******************************************************/
	/******************************************************/
	
	
	public Map selectOfficeJijumNm(String officeCD, String jijumCD, String guCD){
		return mDao.selectOfficeJijumNm(officeCD, jijumCD, guCD);
	}
	public boolean updateOfficeNm(String officeNm, String officeCD, String guCD){
		return mDao.updateOfficeNm(officeNm, officeCD, guCD);
	}
	//********** BEGIN_KANG_20120416
	public boolean deleteOffice(String officeCD, String jijumCD, String guCD){
		return mDao.deleteOffice(officeCD, jijumCD, guCD);
	}
	//********** END_KANG_20120416

	public boolean updateJijumNm(String jijumNm, String jijumCK, String officeCD, String jijumCD, String guCD){
		return mDao.updateJijumNm(jijumNm, jijumCK, officeCD, jijumCD, guCD);
	}
	public boolean updateOfficeJijumNm(String officeNm, String jijumNm, String jijumCK, String officeCD, String jijumCD, String guCD){
		return mDao.updateOfficeJijumNm(officeNm, jijumNm, jijumCK, officeCD, jijumCD, guCD);
	}

	//********** BEGIN_현진_20120313
	public List OrgCodeList(int intCurrentPage, int intCountPerPage,String GU_CD){
		return mDao.OrgCodeList(intCurrentPage, intCountPerPage,GU_CD);
	}
	public int getOrgCodeCount(String gu_cd){
		return mDao.getOrgCodeCount(gu_cd);
	}
	public List OrgCodeSelectList(OrgCodeBean bean){
		return mDao.OrgCodeSelectList(bean);
	}
	public boolean removeOorgCode(OrgCodeBean bean){
		return mDao.removeOrgCode(bean);
	}
	public boolean addOrgCode(OrgCodeBean bean){
		return mDao.addOrgCode(bean);
	}
	
	@Override
	public boolean updateOrgCode(OrgCodeBean bean) {
		return mDao.updateOrgCode(bean);
	}
	
	//********** END_현진_20120313

	//********** BEGIN_현진_20120313
	public int getJojungCount(String ADD_SUM){
		return mDao.getJojungCount(ADD_SUM);
	}
	public List getJojungList(String ADD_SUM, int intCurrentPage, int intCountPerPage){
		return mDao.getJojungList(ADD_SUM, intCurrentPage, intCountPerPage);
	}
	public boolean setJojungInsert(JojungCodeBean bean){
		return mDao.setJojungInsert(bean);
	}
	public boolean setJojungUpdate(JojungCodeBean bean, String modyADD_SUM, String modyCNT){
		return mDao.setJojungUpdate(bean,modyADD_SUM, modyCNT );
	}
	public boolean jojungDelete(JojungCodeBean bean){
		return mDao.jojungDelete(bean);
	}
	public List getJojungSelectList(JojungCodeBean bean){
		return mDao.getJojungSelectList(bean);
	}
	//********** END_현진_20120313
	
	//********** BEGIN_현진_20120314
	public int getPurposeCodeCount(PurposeCodeBean bean){
		return mDao.getPurposeCodeCount(bean);
	}
	public List getPurposeCodeList(PurposeCodeBean bean, int intCurrentPage, int intCountPerPage){
		return mDao.getPurposeCodeList(bean, intCurrentPage, intCountPerPage);
	}
	//********** END_현진_20120314
}