package main.java.rojum.owner.dao;

import java.util.List;
import main.java.rojum.owner.model.AccuseBean;
import main.java.rojum.owner.model.ChangeJobBean;
import main.java.rojum.owner.model.SearchBean;


public interface IOwnerDao {	
    //고발등록 카운트
    public int getAccuseListCount(SearchBean bean);
    
	// 고발등록 리스트
	public List getAccuseList(SearchBean bean) ;
	
	// 	고발등록
    public boolean insertAccuseInfo(AccuseBean bean);
    
	// 고발 수정
    public boolean modifyAccuseInfo(AccuseBean bean);
    
    //고발 삭제
    public boolean deleteAccuseInfo(AccuseBean bean);

    //전업지원등록 카운트
    public int getChangeJobListCount(SearchBean bean);
    
	// 전업지원등록 리스트
	public List getChangeJobList(SearchBean bean);
	
	// 	전업지원등록
    public boolean insertChangeJobInfo(ChangeJobBean bean);
    
	// 전업지원 수정
    public boolean modifyChangeJobInfo(ChangeJobBean bean);
    
    //전업지원 삭제
    public boolean deleteChangeJob(ChangeJobBean bean);
    
    
}