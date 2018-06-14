/*********************************************************************************************************
 				*�����ۼ��� : 2006.07.12
				*�����ۼ��� : jklee, jhlee
				*�ֿ�ó������ : Q&A�Խ��� ���� db�۾��� ó��
				*������ :
				*������ :
				*�������� :
 *********************************************************************************************************/

package main.java.jumyong.map.service;

import java.util.List;

import main.java.jumyong.map.dao.IMapSearchDao;

import main.java.jumyong.map.model.SearchBean;


public class MapSearchService implements IMapSearchService {
	
	private IMapSearchDao objMapSearchDao = null;

	public void setMapSearchDao(IMapSearchDao newMapSearchDao) {
	    this.objMapSearchDao = newMapSearchDao;
	}
	
	
	public List getJumyongList(SearchBean bean){
		return objMapSearchDao.getJumyongList(bean);
	}
	
	public List getJumyongInfo(String adminNo){
		return objMapSearchDao.getJumyongInfo(adminNo);
	}
	
	public String getEnablePnu(String pnu){
		return objMapSearchDao.getEnablePnu(pnu);
	}
	  
}