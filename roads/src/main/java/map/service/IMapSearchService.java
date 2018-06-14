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

import main.java.jumyong.jumyong.model.ConfBean;
import main.java.jumyong.jumyong.model.DisUseBean;
import main.java.jumyong.jumyong.model.InspectBean;
import main.java.jumyong.jumyong.model.PlaceFileBean;
import main.java.jumyong.jumyong.model.PlaceLocationBean;
import main.java.jumyong.jumyong.model.ProductBean;
import main.java.map.model.SearchBean;

public interface IMapSearchService {
	
//	점용 검색 리스트
    public List mapSearchList(SearchBean objectSearchBean);
    
//	점용 검색 카운트
    public int getMapSearchCount(SearchBean objectSearchBean);
    
//	점용 상세정보
    public	List getMap_View(String strAdmin_no);
    
//	가판 검색 리스트
    public List mapSearchList1(SearchBean objectSearchBean);
    
//	가판 검색 카운트
    public int getMapSearchCount1(SearchBean objectSearchBean);
    
//	가판 상세정보
    public	List getMap_View1(String strAdmin_no, String gp_typ);

//	위치등록(건물좌표가져오기)
    public	List miniMapXY(String strPnu);
    
//	위치등록(읍면동 좌표 가져오기)
    public	List miniMapbjXY(String strPnu);
    
//	보도상 영업시설물 구분리스트
    public	String executepurposeCode(String Class_cd, String Code, String Title);
    
//	시군구코드
    public List getGuCode(String SI_CD);
    
//	동코드
    public	List executeBJDongCode(String SI_NM, String GU_NM);
    
}