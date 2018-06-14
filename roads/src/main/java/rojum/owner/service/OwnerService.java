/*********************************************************************************************************
 				*최초작성일 : 2006.07.12
				*최초작성자 : jklee, jhlee
				*주요처리내용 : Q&A게시판 관련 db작업을 처리
				*수정일 :
				*수정자 :
				*수정내용 :
 *********************************************************************************************************/

package main.java.rojum.owner.service;

import java.util.List;
import java.util.Map;

import main.java.rojum.owner.model.AccuseBean;
import main.java.rojum.owner.model.ChangeJobBean;
import main.java.rojum.owner.model.SearchBean;

import main.java.rojum.owner.dao.IOwnerDao;

public class OwnerService implements IOwnerService {
	
	private IOwnerDao objOwnerDao = null;
	
	
	
	

	public void setRojum_ownerDao(IOwnerDao newOwnerDao) {
	    this.objOwnerDao = newOwnerDao;
	}
    //고발등록 카운트
    public int getAccuseListCount(SearchBean bean){
    	return objOwnerDao.getAccuseListCount(bean);
    }
    
	// 고발등록 리스트
	public List getAccuseList(SearchBean bean){
    	return objOwnerDao.getAccuseList(bean);
    }
	
	// 	고발등록
    public boolean insertAccuseInfo(AccuseBean bean){
    	return objOwnerDao.insertAccuseInfo(bean);
    }
	// 고발 수정
    public boolean modifyAccuseInfo(AccuseBean bean){
    	return objOwnerDao.modifyAccuseInfo(bean);
    }
    
    //고발 삭제
    public boolean deleteAccuseInfo(AccuseBean bean){
    	return objOwnerDao.deleteAccuseInfo(bean);
    }

    //전업지원등록 카운트
    public int getChangeJobListCount(SearchBean bean){
    	return objOwnerDao.getChangeJobListCount(bean);
    }
    
	// 전업지원등록 리스트
	public List getChangeJobList(SearchBean bean){
    	return objOwnerDao.getChangeJobList(bean);
    }
	
	// 	전업지원등록
    public boolean insertChangeJobInfo(ChangeJobBean bean){
    	return objOwnerDao.insertChangeJobInfo(bean);
    }
    
	// 전업지원 수정
    public boolean modifyChangeJobInfo(ChangeJobBean bean){
    	return objOwnerDao.modifyChangeJobInfo(bean);
    }
    
    //전업지원 삭제
    public boolean deleteChangeJob(ChangeJobBean bean){
    	return objOwnerDao.deleteChangeJob(bean);
    }
    
    
}