/*********************************************************************************************************
 				*�����ۼ��� : 2006.07.12
				*�����ۼ��� : jklee, jhlee
				*�ֿ�ó������ : Q&A�Խ��� ���� db�۾��� ó��
				*������ :
				*������ :
				*�������� :
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