//	2009		Kim Yun Seo

package main.java.gapan.gapan.service;

import java.util.List;

import main.java.gapan.gapan.dao.IGapanDao;
import main.java.gapan.gapan.model.BloomBean;
import main.java.gapan.gapan.model.FamilyBean;
import main.java.gapan.gapan.model.GapanBaseBean;
import main.java.gapan.gapan.model.GapanBean;
import main.java.gapan.gapan.model.GapanHeadBean;
import main.java.gapan.gapan.model.GapanInfoBean;
import main.java.gapan.gapan.model.OperBean;
import main.java.gapan.gapan.model.JumjiSearchBean;
import main.java.jumyong.minwon.model.MinwonBean;

public class GapanService	implements	IGapanService{
	
	private IGapanDao iGapanDao = null;
	
	public void setGapanDao(IGapanDao gapanDao)
	{
	    this.iGapanDao = gapanDao;
	}
	
	public List executeSearch(GapanBean gapanBean, int intRn1, int intRn2)
	{
		return iGapanDao.executeSearch(gapanBean, intRn1, intRn2);
	}
		
	public int	executeCount(GapanBean gapanBean)
	{
		return iGapanDao.executeCount(gapanBean);
	}

	public List getOperatorInfo(String gapanNo) {
		
		return iGapanDao.getOperatorInfo(gapanNo);
	}

	public FamilyBean getFamilyInfo(String gapanNo) {
		
		return iGapanDao.getFamilyInfo(gapanNo);
	}

	public BloomBean getBloomInfo(String gapanNo) {
		
		return iGapanDao.getBloomInfo(gapanNo);
	}

	public OperBean getOperInfo(String gapanNo) {
		
		return iGapanDao.getOperInfo(gapanNo);
	}

	//��) 740101_4_0001    �ֹι�ȣ + _4_ + SEQ 
	public String executeCheck_Gapanno(String gapan_num) {	//���ǹ�ȣ�� �����ϱ� ���� �ش� �ֹι�ȣ�� ��ϵ� �ο��� �ִ��� ��ȸ �� �� Admin_no�� �����Ѵ�.
		return iGapanDao.executeCheck_Gapanno(gapan_num);
	}
	
	public boolean executeGapan_Base_Register(GapanBaseBean Bean){	//GAPAN_BASE�� ���� �Ѵ�.
		return iGapanDao.executeGapan_Base_Register(Bean);
	}
	
	public boolean executeMinwon_Register(MinwonBean Bean)
	{
		return iGapanDao.executeMinwon_Register(Bean);
	}	
	
	public boolean executeGapan_Head_Register(GapanHeadBean gapanHeadBean)
	{
		return iGapanDao.executeGapan_Head_Register(gapanHeadBean);
	}
	
	public boolean executeGapan_Info_Register(GapanInfoBean gapanInfoBean)
	{
		return iGapanDao.executeGapan_Info_Register(gapanInfoBean);
	}
	
//	���� ������ ��ȸ
	public	List	executeSearch_Jumji(JumjiSearchBean Bean, int intRn1, int intRn2)
	{
		return iGapanDao.executeSearch_Jumji(Bean, intRn1, intRn2);
	}
	
	//���� ������ ��ȸ ī��Ʈ
	public	int	executeSearch_JumjiCount(JumjiSearchBean Bean)
	{
		return iGapanDao.executeSearch_JumjiCount(Bean);
	}
}
