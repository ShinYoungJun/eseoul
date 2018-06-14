/*********************************************************************************************************
 				*최초작성일 : 2006.07.12
				*최초작성자 : jklee, jhlee
				*주요처리내용 : Q&A게시판 관련 db작업을 처리
				*수정일 :
				*수정자 :
				*수정내용 :
 *********************************************************************************************************/

package main.java.map.service;

import java.util.List;
import java.util.Map;

import main.java.map.dao.IMapSearchDao;
import main.java.jumyong.jumyong.model.ConfBean;
import main.java.jumyong.jumyong.model.DisUseBean;
import main.java.jumyong.jumyong.model.InspectBean;
import main.java.jumyong.jumyong.model.PlaceLocationBean;
import main.java.jumyong.jumyong.model.PlaceFileBean;
import main.java.map.model.SearchBean;

import main.java.jumyong.jumyong.model.ProductBean;

public class MapSearchService implements IMapSearchService {
	
	private IMapSearchDao objMapSearchDao = null;

	public void setMapSearchDao(IMapSearchDao newMapSearchDao) {
	    this.objMapSearchDao = newMapSearchDao;
	}
	
//	점용 검색 리스트
    public List mapSearchList(SearchBean objectSearchBean)
    {
    	return objMapSearchDao.mapSearchList(objectSearchBean);
    }

//	점용 검색 카운트
    public int getMapSearchCount(SearchBean objectSearchBean)
    {
		return objMapSearchDao.getMapSearchCount(objectSearchBean);
	}
 
//	점용 상세정보
    public List getMap_View(String strAdmin_no)
	{
		return objMapSearchDao.getMap_View(strAdmin_no);
	}
    
//	가판 검색 리스트
    public List mapSearchList1(SearchBean objectSearchBean)
    {
    	return objMapSearchDao.mapSearchList1(objectSearchBean);
    }

//	가판 검색 카운트
    public int getMapSearchCount1(SearchBean objectSearchBean)
    {
		return objMapSearchDao.getMapSearchCount1(objectSearchBean);
	}
 
//	가판 상세정보
    public List getMap_View1(String strAdmin_no,String gp_typ)
	{
		return objMapSearchDao.getMap_View1(strAdmin_no,gp_typ);
	}
    
//	위치등록(건물좌표가져오기)
    public List miniMapXY(String strPnu)
	{
		return objMapSearchDao.miniMapXY(strPnu);
	}

//	위치등록(읍면동 좌표 가져오기)
    public List miniMapbjXY(String strPnu)
	{
		return objMapSearchDao.miniMapbjXY(strPnu);
	}

//	시군구코드
    public List getGuCode(String SI_CD) {

		return objMapSearchDao.getGuCode(SI_CD);
	}
    
//	동코드
    public	List executeBJDongCode(String SI_NM, String GU_NM) {
    	
    	return objMapSearchDao.executeBJDongCode(SI_NM, GU_NM);
    }

//	보도상 영업시설물 구분리스트
    public String executepurposeCode(String Class_cd, String Code, String Title)
    {
    		return PurposeCode(Class_cd, Code, Title);
    }
    
    private String	PurposeCode(String Class_cd, String Code, String Title)
	{
		String	PurposeCode	= "";
		List	list		= objMapSearchDao.executepurposeCode(Class_cd, Code, Title);
		
		if(Title	!= null)
			PurposeCode	= "<option value='' selected>::" + Title + "::</option>";
			
		SearchBean	Bean	= new SearchBean();
		
		for(int	i = 0	;	i < list.size()	;	i++)
		{
			Bean	= (SearchBean)list.get(i);
			
			if(!Bean.getSORT_NM().trim().equals(""))
			{
				if(Bean.getCODE().trim().equals(Code))
					PurposeCode	+= "<option value=" + Bean.getCODE() + " selected>" + Bean.getSORT_NM() + "</option>";
				else
					PurposeCode	+= "<option value=" + Bean.getCODE() + ">" + Bean.getSORT_NM() + "</option>";
			}
		}
		
		return PurposeCode;
	}
	  
}