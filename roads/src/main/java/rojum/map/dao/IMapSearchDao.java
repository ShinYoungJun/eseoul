/*********************************************************************************************************
 				*�����ۼ��� : 2006.07.12
				*�����ۼ��� : jklee, jhlee
				*�ֿ�ó������ : QA�Խ��� ���� db�۾��� ó��
				*������ :
				*������ :
				*�������� :
 *********************************************************************************************************/

package main.java.rojum.map.dao;


import main.java.rojum.map.model.SearchBean;



import java.util.List;

public interface IMapSearchDao {
	
	public List getRojumList(SearchBean bean);
	
	public List getRojumInfo(String gapanNo);
	
	public String getEnablePnu(String pnu);
    
}