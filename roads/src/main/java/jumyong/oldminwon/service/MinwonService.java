//	2009		Jeon Seoung Won

package main.java.jumyong.oldminwon.service;

import java.util.List;

import main.java.jumyong.oldminwon.dao.IMinwonDao;
import main.java.jumyong.oldminwon.model.Apjy20mr1Bean;
import main.java.jumyong.oldminwon.model.SangseMinwonBean;
import main.java.jumyong.oldminwon.model.SearchBean;
import main.java.jumyong.oldminwon.model.ZipBean;


public class MinwonService implements IMinwonService {

	private IMinwonDao iMinwonDao = null;
	
	//민원조회 관리 Service와 DAO를 연결
	public void setOldMinwonDao(IMinwonDao oldMinwonDao)
	{
	    this.iMinwonDao = oldMinwonDao;
	}
	
	//민원 조회 리스트
	public List executeSearch(SearchBean searchBean, int intRn1, int intRn2)
	{
		return iMinwonDao.executeSearch(searchBean, intRn1, intRn2);
	}
	
	//민원 조회 리스트 카운트
	public int	executeCount(SearchBean searchBean)
	{
		return iMinwonDao.executeCount(searchBean);
	}
	
	//
	public Apjy20mr1Bean executeView(String SERIAL_NBR, String GU_CODE)
	{
		return iMinwonDao.executeView(SERIAL_NBR, GU_CODE);
	}
	
	//민원 조회 리스트
	public List executeSangseSearch(String SERIAL_NBR, String GU_CODE, int intRn1, int intRn2)
	{
		return iMinwonDao.executeSangseSearch(SERIAL_NBR, GU_CODE, intRn1, intRn2);
	}
	
	//민원 조회 리스트 카운트
	public int	executeSangseCount(String SERIAL_NBR, String GU_CODE)
	{
		return iMinwonDao.executeSangseCount(SERIAL_NBR, GU_CODE);
	}
	
	
	//
	public SangseMinwonBean executeSangseMinwonBean(String SERIAL_NBR, String GU_CODE, String ILKWAL_NBR, String YY)
	{
		return iMinwonDao.executeSangseMinwonBean(SERIAL_NBR, GU_CODE, ILKWAL_NBR, YY);
	}
	
	//주소정보를 가져온다.
	public ZipBean executeZip(String POST1, String POST2)
	{
		return iMinwonDao.executeZip(POST1, POST2);
	}
	
	
	public List executeGuMinwonSearch(String userId, String JIMOK){
		
		
		return iMinwonDao.executeGuMinwonSearch(userId,JIMOK);
	
	}
	
	
	public List executeHistoryList(String SERIAL_NBR, String GU_CODE){
		
		
		return iMinwonDao.executeHistoryList(SERIAL_NBR,GU_CODE);
	
	}
}
