/*********************************************************************************************************
 				*�����ۼ��� : 2006.07.12
				*�����ۼ��� : jklee, jhlee
				*�ֿ�ó������ : QA�Խ��� ���� db�۾��� ó��
				*������ :
				*������ :
				*�������� :
 *********************************************************************************************************/

package main.java.gapan.map.dao;


import main.java.gapan.map.model.SearchBean;



import java.util.List;

public interface IMapSearchDao {
	
	public List getGapanList(SearchBean bean);
	
	public List getGapanInfo(String gapanNo);
	
	public String getEnablePnu(String pnu);
    
}