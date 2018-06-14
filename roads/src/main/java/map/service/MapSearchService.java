/*********************************************************************************************************
 				*�����ۼ��� : 2006.07.12
				*�����ۼ��� : jklee, jhlee
				*�ֿ�ó������ : Q&A�Խ��� ���� db�۾��� ó��
				*������ :
				*������ :
				*�������� :
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
	
//	���� �˻� ����Ʈ
    public List mapSearchList(SearchBean objectSearchBean)
    {
    	return objMapSearchDao.mapSearchList(objectSearchBean);
    }

//	���� �˻� ī��Ʈ
    public int getMapSearchCount(SearchBean objectSearchBean)
    {
		return objMapSearchDao.getMapSearchCount(objectSearchBean);
	}
 
//	���� ������
    public List getMap_View(String strAdmin_no)
	{
		return objMapSearchDao.getMap_View(strAdmin_no);
	}
    
//	���� �˻� ����Ʈ
    public List mapSearchList1(SearchBean objectSearchBean)
    {
    	return objMapSearchDao.mapSearchList1(objectSearchBean);
    }

//	���� �˻� ī��Ʈ
    public int getMapSearchCount1(SearchBean objectSearchBean)
    {
		return objMapSearchDao.getMapSearchCount1(objectSearchBean);
	}
 
//	���� ������
    public List getMap_View1(String strAdmin_no,String gp_typ)
	{
		return objMapSearchDao.getMap_View1(strAdmin_no,gp_typ);
	}
    
//	��ġ���(�ǹ���ǥ��������)
    public List miniMapXY(String strPnu)
	{
		return objMapSearchDao.miniMapXY(strPnu);
	}

//	��ġ���(���鵿 ��ǥ ��������)
    public List miniMapbjXY(String strPnu)
	{
		return objMapSearchDao.miniMapbjXY(strPnu);
	}

//	�ñ����ڵ�
    public List getGuCode(String SI_CD) {

		return objMapSearchDao.getGuCode(SI_CD);
	}
    
//	���ڵ�
    public	List executeBJDongCode(String SI_NM, String GU_NM) {
    	
    	return objMapSearchDao.executeBJDongCode(SI_NM, GU_NM);
    }

//	������ �����ü��� ���и���Ʈ
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