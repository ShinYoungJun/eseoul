/*********************************************************************************************************
 				*�����ۼ��� : 2006.07.12
				*�����ۼ��� : jklee, jhlee
				*�ֿ�ó������ : Q&A�Խ��� ���� db�۾��� ó��
				*������ :
				*������ :
				*�������� :
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