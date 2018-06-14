/*********************************************************************************************************
 				*최초작성일 : 2006.07.12
				*최초작성자 : jklee, jhlee
				*주요처리내용 : Q&A게시판 관련 db작업을 처리
				*수정일 :
				*수정자 :
				*수정내용 :
 *********************************************************************************************************/

package main.java.junggi.imposition.service;

import java.util.List;
import java.util.Map;

import main.java.junggi.imposition.dao.IImpositionDao;import main.java.junggi.imposition.model.impositionBean;
;

public class ImpositionService implements IImpositionService {
	
	private IImpositionDao  objImpositionDao = null;

	public void setImpositionDao(IImpositionDao newImpositionDao) {
	    this.objImpositionDao = newImpositionDao;
	}
	
//	정기분 조회 리스트    	
	public List junggiSearchList(String year,String type,String check_yn,String tax_yn,String tax_set,String purpose_cd,String numVal
    		,String name,String bj_cd,String hj_cd,String bonbun,String bubun,int currentPage,int countPerPage)
	{
		return objImpositionDao.junggiSearchList( year, type, check_yn, tax_yn,tax_set, purpose_cd, numVal
	    		, name, bj_cd, hj_cd, bonbun, bubun,currentPage,countPerPage);
	}
//  정기분 조회 리스트   카운트
    public int getJunggiSearchListCount(String year,String type,String check_yn,String tax_yn,String tax_set,String purpose_cd,String numVal
    		,String name,String bj_cd,String hj_cd,String bonbun,String bubun)
    {
    	return objImpositionDao.getJunggiSearchListCount(  year,  type,  check_yn,  tax_yn,  tax_set,  purpose_cd,  numVal
        		,  name,  bj_cd,  hj_cd,  bonbun,  bubun);
    }
//  부과정보 리스트 
	public List impositionList(String adminNo,int currentPage,int countPerPage)
	{
		return objImpositionDao.impositionList(adminNo,currentPage,countPerPage);
	}
//  부과정보 리스트 카운트
	public int getProductListCount(String adminNo)
	{
		return objImpositionDao.getProductListCount(adminNo);
	}

//  부과정보 - 년도별 
    public impositionBean impositionInfo(String adminNo,String strYear)
    {
    	return objImpositionDao.impositionInfo(adminNo,strYear);
    }
//  작년도 점용료 가져오기
    public Map getSum_LastYear(String adminNo,String strYear)
    {
    	return objImpositionDao.getSum_LastYear(adminNo,strYear);
    }
//  부과정보 리스트  카운트
    public int getProductSeq(String adminNo,String strYear)
    {
    	return objImpositionDao.getProductSeq(adminNo,strYear);
    }
//  부과정보 가장 나중 입력된 YEAR
    public String getLastYear(String adminNo)
    {
    	return objImpositionDao.getLastYear(adminNo);
    }
//  부과 미부과 여부
    public String getTaxYn(String seq)
    {    	
    	return objImpositionDao.getTaxYn(seq);
    }
    
	
}