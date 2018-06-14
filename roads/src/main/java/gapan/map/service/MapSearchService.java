/*********************************************************************************************************
 				*최초작성일 : 2006.07.12
				*최초작성자 : jklee, jhlee
				*주요처리내용 : Q&A게시판 관련 db작업을 처리
				*수정일 :
				*수정자 :
				*수정내용 :
 *********************************************************************************************************/

package main.java.gapan.map.service;

import java.util.List;

import main.java.gapan.map.dao.IMapSearchDao;

import main.java.gapan.map.model.SearchBean;


public class MapSearchService implements IMapSearchService {
	
	private IMapSearchDao objMapSearchDao = null;

	public void setMapSearchDao(IMapSearchDao newMapSearchDao) {
	    this.objMapSearchDao = newMapSearchDao;
	}
	
	
	public List getGapanList(SearchBean bean){
		return objMapSearchDao.getGapanList(bean);
	}
	
	public List getGapanInfo(String gapanNo){
		return objMapSearchDao.getGapanInfo(gapanNo);
	}
	
	public String getEnablePnu(String pnu){
		return objMapSearchDao.getEnablePnu(pnu);
	}
	  
}