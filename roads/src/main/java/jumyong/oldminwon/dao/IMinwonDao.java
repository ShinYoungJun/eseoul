//	2009		Jeon Seoung Won

package main.java.jumyong.oldminwon.dao;

import java.util.List;

import main.java.jumyong.oldminwon.model.Apjy20mr1Bean;
import main.java.jumyong.oldminwon.model.SangseMinwonBean;
import main.java.jumyong.oldminwon.model.SearchBean;
import main.java.jumyong.oldminwon.model.ZipBean;

public interface IMinwonDao {

	public	List				executeSearch(SearchBean searchBean, int intRn1, int intRn2);
	public	int					executeCount(SearchBean searchBean);
	public	Apjy20mr1Bean		executeView(String SERIAL_NBR, String GU_CODE);

	public	List				executeSangseSearch(String SERIAL_NBR, String GU_CODE, int intRn1, int intRn2);
	public	int					executeSangseCount(String SERIAL_NBR, String GU_CODE);
	public	SangseMinwonBean	executeSangseMinwonBean(String SERIAL_NBR, String GU_CODE, String ILKWAL_NBR, String YY);
	
	public	ZipBean				executeZip(String POST1, String POST2);
	
	public List executeGuMinwonSearch(String userId, String JIMOK);
	
	public List executeHistoryList(String SERIAL_NBR, String GU_CODE);
	
	
}
