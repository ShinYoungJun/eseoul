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
import main.java.jumyong.map.model.SearchBean;

public interface IMapSearchService {
	
	public List getJumyongList(SearchBean bean);
	
	
	public List getJumyongInfo(String adminNo);
	
	public String getEnablePnu(String pnu);
    
}