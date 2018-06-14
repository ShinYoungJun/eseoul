//	2009		Kim Yun Seo

package main.java.jumyong.jumyonginfo.dao;

import java.util.List;
import java.util.Map;

import main.java.jumyong.jumyonginfo.dao.MinwoninfoMapDao.DeletePlaceWithAddr;
import main.java.jumyong.jumyonginfo.dao.MinwoninfoMapDao.InsertPlaceWithAddr;
import main.java.jumyong.jumyonginfo.dao.MinwoninfoMapDao.SelectPlaceWithAddr;
import main.java.jumyong.jumyonginfo.dao.MinwoninfoMapDao.Total_With;
import main.java.jumyong.jumyonginfo.model.AppealBean;
import main.java.jumyong.jumyonginfo.model.MinwonBean;
import main.java.jumyong.jumyonginfo.model.PlaceBean;
import main.java.jumyong.jumyonginfo.model.TotalWIthBean;


public interface IMinwoninfoDao {

	public	List	executeMinwon_View(String strAdmin_no, int intRn1, int intRn2);
	public	List	executeMinwon_View_Search(String strAdmin_no, String strSeq);
	public	boolean	executeMinwon_Modify(MinwonBean Bean);
	public	boolean	executeMinwon_Register(MinwonBean Bean);
	public	int		executeMinwon_Count(String strAdmin_no);
	
	public	List	executeJumin_View(String strAdmin_no);
	public	boolean	executeJumin_Modify(AppealBean Bean);
	
	public	List	executeJumji_View(String strAdmin_no);
	public	boolean	executeJumji_Modify(PlaceBean Bean);
	
    public	List	executeTotal_With(String adminNo);
    
	//�������� ���ϱ�
    public Map get_Price(String ADMIN_NO,String BONBUN, String BUBUN);
    
    //������ ���� ����
    public void executeRegister_With(TotalWIthBean bean);
    
    // ������ ���� �����
    public void executeDelete_With(String adminNo);
    
    
    // �������� �������� ��ȸ
    public	List	executeSelectPlaceWithAddr(String adminNo);
    
    //�������� �������� ����
    public void executeDeletePlaceWithAddr(String adminNo);
    
	//�������� �������� �߰�
    public void executeInsertPlaceWithAddr(String adminNo,String pnu,String addr);
    
}
