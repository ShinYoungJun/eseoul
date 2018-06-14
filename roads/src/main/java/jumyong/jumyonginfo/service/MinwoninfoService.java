//	2009		Kim Yun Seo

package main.java.jumyong.jumyonginfo.service;


import java.util.List;
import java.util.Map;

import main.java.jumyong.jumyonginfo.dao.IMinwoninfoDao;
import main.java.jumyong.jumyonginfo.model.AppealBean;
import main.java.jumyong.jumyonginfo.model.MinwonBean;
import main.java.jumyong.jumyonginfo.model.PlaceBean;
import main.java.jumyong.jumyonginfo.model.TotalWIthBean;


public class MinwoninfoService implements IMinwoninfoService {

	private IMinwoninfoDao iMinwoninfoDao = null;
	
	public void setJumyonginfoDao(IMinwoninfoDao minwoninfoDao) {
	    this.iMinwoninfoDao = minwoninfoDao;
	}
	
	public	List	executeMinwon_View(String strAdmin_no, int intRn1, int intRn2)
	{
		return iMinwoninfoDao.executeMinwon_View(strAdmin_no, intRn1, intRn2);
	}
	
	public	List	executeMinwon_View_Search(String strAdmin_no, String strSeq)
	{
		return iMinwoninfoDao.executeMinwon_View_Search(strAdmin_no, strSeq);
	}
	
	public	boolean	executeMinwon_Modify(MinwonBean Bean)
	{
		return iMinwoninfoDao.executeMinwon_Modify(Bean);
	}
	
	public	boolean	executeMinwon_Register(MinwonBean Bean)
	{
		return iMinwoninfoDao.executeMinwon_Register(Bean);
	}
	
	public	int		executeMinwon_Count(String strAdmin_no)
	{
		return iMinwoninfoDao.executeMinwon_Count(strAdmin_no);
	}
	
	public	List	executeJumin_View(String strAdmin_no)
	{
		return iMinwoninfoDao.executeJumin_View(strAdmin_no);
	}
	
	public	boolean	executeJumin_Modify(AppealBean Bean)
	{
		return iMinwoninfoDao.executeJumin_Modify(Bean);
	}
	
	public	List	executeJumji_View(String strAdmin_no)
	{
		return iMinwoninfoDao.executeJumji_View(strAdmin_no);
	}
	
	public	boolean	executeJumji_Modify(PlaceBean Bean)
	{
		return iMinwoninfoDao.executeJumji_Modify(Bean);
	}
	
	// ������ ����Ʈ ��������
	
	public	List	executeTotal_With(String adminNo)
	{
		return iMinwoninfoDao.executeTotal_With(adminNo);
	}
	
	//  �������� ���ϱ�.
    public Map get_Price(String ADMIN_NO,String BONBUN, String BUBUN){
		return iMinwoninfoDao.get_Price(ADMIN_NO,BONBUN,BUBUN);
    }
    
    // ������ ���� ����ϱ�
	public	void	executeRegister_With(TotalWIthBean bean)
	{
		iMinwoninfoDao.executeRegister_With(bean);
	}
	
	// ������ ���� �����
	public	void	executeDelete_With(String adminNo)
	{
		iMinwoninfoDao.executeDelete_With(adminNo);
	}
    
	
    // �������� �������� ��ȸ
    public	List	executeSelectPlaceWithAddr(String adminNo){
		return iMinwoninfoDao.executeSelectPlaceWithAddr(adminNo);
	}
    
    //�������� �������� ����
    public void executeDeletePlaceWithAddr(String adminNo){
		iMinwoninfoDao.executeDeletePlaceWithAddr(adminNo);
	}
    
	//�������� �������� �߰�
    public void executeInsertPlaceWithAddr(String adminNo,String pnu,String addr){
		iMinwoninfoDao.executeInsertPlaceWithAddr(adminNo,pnu,addr);
	}
}
