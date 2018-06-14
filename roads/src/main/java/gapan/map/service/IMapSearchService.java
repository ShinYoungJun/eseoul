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
import main.java.gapan.map.model.SearchBean;

public interface IMapSearchService {
	
	public List getGapanList(SearchBean bean);
	
	
	public List getGapanInfo(String gapanNo);
	
	public String getEnablePnu(String pnu);
    
}