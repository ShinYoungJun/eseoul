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
import main.java.rojum.map.model.SearchBean;

public interface IMapSearchService {
	
	public List getRojumList(SearchBean bean);
	
	
	public List getRojumInfo(String gapanNo);
	
	public String getEnablePnu(String pnu);
    
}