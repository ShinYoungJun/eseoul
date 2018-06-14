package main.java.admin.service;

import java.util.List;
import java.util.Map;

import main.java.admin.model.GradeCodeBean;
import main.java.admin.model.OfficeCodeBean;
import main.java.admin.model.OfficeRegBean;
//********** BEGIN_현진_20120313
import main.java.admin.model.OrgCodeBean;
import main.java.admin.model.JojungCodeBean;
//********** END_현진_20120313
//********** BEGIN_현진_20120314
import main.java.admin.model.PurposeCodeBean;
//********** END_현진_20120314


public interface ICommCodeService {

	public List retrieveAreaCodeList(int intCurrentPage, int intCountPerPage, String siName,String guName,String hdName);
	public List retrieveOrgCodeList(int intCurrentPage, int intCountPerPage, String guNm);
	public List retrievePurposeCodeList(int intCurrentPage, int intCountPerPage, String section,String code);
	public List retrieveTaxCodeList(int intCurrentPage, int intCountPerPage, String taxCode,String taxName,String taxacc);
	public List retrieveZipCodeList(int intCurrentPage, int intCountPerPage, String areaName);
	public List retrieveJojungCodeList(int intCurrentPage, int intCountPerPage, String cnt);
	public List retrieveGradeCodeList(int intCurrentPage, int intCountPerPage, String gradeName);
	public int getAreaTotalCount(String strSiName,String strGuName,String strHdName);
	public GradeCodeBean modifyGradeCode(GradeCodeBean objGradeCodeBean);
	public GradeCodeBean deleteGradeCode(GradeCodeBean objGradeCodeBean);
	/**********************/
	public int getOfficeTotalCount(String officeNm, String sigu_cd);
	public List retrieveOfficeCodeList(int intCurrentPage, int intCountPerPage,String officeNm,String sigu_cd);
	
	/******************************************************/
	/******************************************************/
	
	public boolean verifyOfficeNm(String officeNm,String sigu_cd);
	public boolean verifyJijumNm(String officeNm, String jijumNm,String sigu_cd);
	public String verifyOfficeCD(String officeNm,String sigu_cd);
	public String verifyMaxOfficeCD(String sigu_cd);
	public String verifyMaxJijumCD(String officeNm,String sigu_cd);	
	public boolean insertOfficeCode(OfficeRegBean bean );
	
	

	/******************************************************/
	/******************************************************/
	
	public Map selectOfficeJijumNm(String officeCD, String jijumCD, String guCD);
	public boolean updateOfficeNm(String officeNm, String officeCD, String guCD);
	public boolean updateJijumNm(String jijumNm, String jijumCK, String officeCD, String jijumCD, String guCD);
	public boolean updateOfficeJijumNm(String officeNm, String jijumNm, String jijumCK, String officeCD, String jijumCD, String guCD);
	
	
	//********** BEGIN_현진_20120313
	public List OrgCodeList(int intCurrentPage, int intCountPerPage,String GU_CD);
	public int getOrgCodeCount(String gu_cd);
	public List OrgCodeSelectList(OrgCodeBean bean);
	public boolean removeOorgCode(OrgCodeBean bean);
	public boolean addOrgCode(OrgCodeBean bean);
	public boolean updateOrgCode(OrgCodeBean bean);
	//********** END_현진_20120313
	
	//********** BEGIN_현진_20120313
	public int getJojungCount(String ADD_SUM);
	public List getJojungList(String ADD_SUM, int intCurrentPage, int intCountPerPage);
	public boolean setJojungInsert(JojungCodeBean bean);
	public boolean setJojungUpdate(JojungCodeBean bean, String modyADD_SUM, String modyCNT);
	public boolean jojungDelete(JojungCodeBean bean);
	public List getJojungSelectList(JojungCodeBean bean);
	//********** END_현진_20120313
	
	//********** BEGIN_현진_20120314
	public int getPurposeCodeCount(PurposeCodeBean bean);
	public List getPurposeCodeList(PurposeCodeBean bean, int intCurrentPage, int intCountPerPage);
	//********** END_현진_20120314
	//********** BEGIN_KANG_20120416
	public boolean deleteOffice(String officeCD, String jijumCD, String guCD);
	//********** END_KANG_20120416
	
}