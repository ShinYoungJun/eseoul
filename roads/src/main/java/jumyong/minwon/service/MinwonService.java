//	2009		Kim Yun Seo

package main.java.jumyong.minwon.service;

import java.util.List;
import java.util.Map;

import main.java.jumyong.minwon.dao.IMinwonDao;
import main.java.jumyong.minwon.model.Admin_BaseBean;
import main.java.jumyong.minwon.model.AppealBean;
import main.java.jumyong.minwon.model.PlaceBean;
import main.java.jumyong.minwon.model.MinwonBean;
import main.java.jumyong.minwon.model.JumjiSearchBean;
import main.java.jumyong.minwon.model.TotalWIthBean;


public class MinwonService implements IMinwonService {

	private IMinwonDao iMinwonDao = null;
	
	//�ο���ȸ ���� Service�� DAO�� ����
	public void setJumyong_minwonDao(IMinwonDao jumyong_minwonDao)
	{
	    this.iMinwonDao = jumyong_minwonDao;
	}
	
	//�ο� ��ȸ ����Ʈ
	public List executeSearch(String strName, int intRn1, int intRn2)
	{
		return iMinwonDao.executeSearch(strName, intRn1, intRn2);
	}
	
	//�ο� ��ȸ ����Ʈ ī��Ʈ
	public int	executeCount(String strName)
	{
		return iMinwonDao.executeCount(strName);
	}
	
	//	ADMIN_BASE ���
	public boolean executeAdmin_Base_Register(Admin_BaseBean Bean)
	{
		return iMinwonDao.executeAdmin_Base_Register(Bean);
	}
	
	//�ο�, ���������� ���
	public boolean executeAppeal_Register(AppealBean Bean)
	{
		System.out.println("MinwonService.executeAppeal_Register");
		return iMinwonDao.executeAppeal_Register(Bean);
	}
	
	//������ ���� ���
	public boolean executePlace_Register(PlaceBean Bean)
	{
		return iMinwonDao.executePlace_Register(Bean);
	}
	
	//�ο����� ����
	public List executeMinwon_View(String strAdmin_no)
	{
		return iMinwonDao.executeMinwon_View(strAdmin_no);
	}
	
	//	�ο����� ���
	public boolean executeMinwon_Register(MinwonBean Bean)
	{
		return iMinwonDao.executeMinwon_Register(Bean);
	}
	
	//���������� ����
	public List executeJumji_View(String strAdmin_no)
	{
		return iMinwonDao.executeJumji_View(strAdmin_no);
	}
	
	//����������  ����
	public boolean executeJumji_Modify(PlaceBean Bean)
	{
		return iMinwonDao.executeJumji_Modify(Bean);
	}
	
	//������ üũ
	public int	executeJumji_Check(String strAdmin_no)
	{
		return iMinwonDao.executeJumji_Check(strAdmin_no);
	}
    //	������ ���� ����
	public boolean executeUpdateJumin(AppealBean Bean)
	{
		return iMinwonDao.executeUpdateJumin(Bean);
	}	
    //	������ ���� 1�ܰ� (���������� ������ȣ ���� Ȯ��)
	public	int		executeCheck_AdminnoCount(String BJ_CD)
	{
		return iMinwonDao.executeCheck_AdminnoCount(BJ_CD);
	}
	
	//������ ���� 2�ܰ� (���� ������ȣ ���� Ȯ��)
	public	int		executeCheck_Adminno(String ADMIN_NO)
	{
		return iMinwonDao.executeCheck_Adminno(ADMIN_NO);
	}
	
	//���� ������ ��ȸ
	public	List	executeSearch_Jumji(JumjiSearchBean Bean, int intRn1, int intRn2)
	{
		return iMinwonDao.executeSearch_Jumji(Bean, intRn1, intRn2);
	}
	
	//���� ������ ��ȸ ī��Ʈ
	public	int	executeSearch_JumjiCount(JumjiSearchBean Bean)
	{
		return iMinwonDao.executeSearch_JumjiCount(Bean);
	}
	
	//���� ������ ��ȸ ī��Ʈ
	public	int	getJumyong_JibunInfo(String bj_cd, String hj_cd, String spc_cd, String bonbun, String bubun)
	{
		return iMinwonDao.getJumyong_JibunInfo(bj_cd, hj_cd, spc_cd, bonbun, bubun);
	}
	
	//�������� ��������
	public	Map	get_Price(String address, String bonbun, String bubun)
	{
		return iMinwonDao.get_Price(address, bonbun, bubun);
	}
	
	//�������� �������� ����
    public void executeDeletePlaceWithAddr(String adminNo){
    	iMinwonDao.executeDeletePlaceWithAddr(adminNo);
    }
    
    //�������� �������� �߰�
    public void executeInsertPlaceWithAddr(String adminNo,String pnu,String addr){
    	iMinwonDao.executeInsertPlaceWithAddr(adminNo, pnu, addr);
    }
}
