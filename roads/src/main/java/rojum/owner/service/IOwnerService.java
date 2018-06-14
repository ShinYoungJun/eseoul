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

public interface IOwnerService{
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