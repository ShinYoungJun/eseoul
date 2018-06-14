/*********************************************************************************************************
 				*최초작성일 : 2006.07.12
				*최초작성자 : jklee, jhlee
				*주요처리내용 : Q&A게시판 관련 db작업을 처리
				*수정일 :
				*수정자 :
				*수정내용 :
 *********************************************************************************************************/

package main.java.rojum.map.service;

import java.util.List;

import main.java.rojum.map.dao.IMapSearchDao;

import main.java.rojum.map.model.SearchBean;


public class MapSearchService implements IMapSearchService {
	
	private IMapSearchDao objMapSearchDao = null;

	public void setMapSearchDao(IMapSearchDao newMapSearchDao) {
	    this.objMapSearchDao = newMapSearchDao;
	}
	
	
	public List getRojumList(SearchBean bean){
		return objMapSearchDao.getRojumList(bean);
	}
	
	public List getRojumInfo(String gapanNo){
		return objMapSearchDao.getRojumInfo(gapanNo);
	}
	
	public String getEnablePnu(String pnu){
		return objMapSearchDao.getEnablePnu(pnu);
	}
	  
}