/*********************************************************************************************************
 				*최초작성일 : 2006.07.12
				*최초작성자 : jklee, jhlee
				*주요처리내용 : Q&A게시판 관련 db작업을 처리
				*수정일 :
				*수정자 :
				*수정내용 :
 *********************************************************************************************************/

package main.java.jumyong.map.service;

import java.util.List;
import main.java.jumyong.map.model.SearchBean;

public interface IMapSearchService {
	
	public List getJumyongList(SearchBean bean);
	
	
	public List getJumyongInfo(String adminNo);
	
	public String getEnablePnu(String pnu);
    
}