/*********************************************************************************************************
 				*�����ۼ��� : 2006.07.12
				*�����ۼ��� : jklee, jhlee
				*�ֿ�ó������ : QA�Խ��� ���� db�۾��� ó��
				*������ :
				*������ :
				*�������� :
 *********************************************************************************************************/

package main.java.jumyong.map.dao;


import main.java.jumyong.map.model.SearchBean;



import java.util.List;

public interface IMapSearchDao {
	
	public List getJumyongList(SearchBean bean);
	
	public List getJumyongInfo(String adminNo);
	
	public String getEnablePnu(String pnu);
    
}