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
import main.java.gapan.map.model.SearchBean;

public interface IMapSearchService {
	
	public List getGapanList(SearchBean bean);
	
	
	public List getGapanInfo(String gapanNo);
	
	public String getEnablePnu(String pnu);
    
}