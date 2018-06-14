package main.java.admin.service;

import java.util.List;
import java.util.Map;

import main.java.admin.service.IadminService;
import main.java.admin.dao.IAdminDao;
//********** BEGIN_현진_20120311
import main.java.admin.model.SectionBean;
//********** END_현진_20120311

public class AdminService implements IadminService {

	private IAdminDao adminDao = null;
	
	public int executeCountGapan(String gu_cd, String gapanNo, String surveyYear){
		return  adminDao.executeCountGapan(gu_cd, gapanNo, surveyYear);
	}
	public void setAdminDao(IAdminDao newAdminDao) {
		this.adminDao = newAdminDao;
	}
	 public void executeDeleteGapan(String gu_cd, String gapanNo,String surveyYear){
		 adminDao.executeDeleteGapan(gu_cd, gapanNo, surveyYear);
	 }
	 
	 
	//********** BEGIN_현진_20120306
	/*
	  public void executeMoveGapan(String gu_cd, String gapanNo,String beforeYear, String afterYear){
		 adminDao.executeMoveGapan(gu_cd, gapanNo, beforeYear, afterYear);
	 }	 
	 */
	public List getBeforeGapanNo(String gu_cd, String gapanNo, String beforeYear){
		return adminDao.getBeforeGapanNo(gu_cd, gapanNo, beforeYear);
	}
	public List getGapanInfo(String gapanNo, String SURVEY_YEAR){
		return adminDao.getGapanInfo(gapanNo, SURVEY_YEAR);
	}
	public List getGapanHead(String gapanNo){
		return adminDao.getGapanHead(gapanNo);
	}
	public List getGapanBase(String gapanNo){
		return adminDao.getGapanBase(gapanNo);		
	}
	//********** END_현진_20120306

	//********** BEGIN_현진_20120309
    public int getSectionCount(String gu_cd){
    	return adminDao.getSectionCount(gu_cd);
    }
    public List getSectionList(String gu_cd, int intCurrentPage, int intCountPerPage){
    	return adminDao.getSectionList(gu_cd, intCurrentPage, intCountPerPage);
    }
	//********** END_현진_20120309
	//********** BEGIN_현진_20120311
	public boolean setSectionInsert(SectionBean bean){
    	return adminDao.setSectionInsert(bean);
	}
	
	public boolean setSectionUpdate(SectionBean bean, String modyGU_CD, String modyGUGAN_CD){
		return adminDao.setSectionUpdate(bean, modyGU_CD, modyGUGAN_CD);
	}
	public boolean sectionDelete(SectionBean bean){
		return adminDao.sectionDelete(bean);
	}
	public List getSectionSelectList(SectionBean bean){
		return adminDao.getSectionSelectList(bean);
	}
	
	//********** END_현진_20120311
	
	//********** BEGIN_현진_20120319
	public boolean changeGapanUpdate(String UPDATE, String SURVEY_YEAR){
		return adminDao.changeGapanUpdate(UPDATE, SURVEY_YEAR);
	}
	//********** END_현진_20120319
}