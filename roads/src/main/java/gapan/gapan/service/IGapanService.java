package main.java.gapan.gapan.service;

import java.util.List;

import main.java.gapan.gapan.model.BloomBean;
import main.java.gapan.gapan.model.FamilyBean;
import main.java.gapan.gapan.model.GapanBaseBean;
import main.java.gapan.gapan.model.GapanBean;
import main.java.gapan.gapan.model.GapanHeadBean;
import main.java.gapan.gapan.model.GapanInfoBean;
import main.java.gapan.gapan.model.OperBean;
import main.java.gapan.gapan.model.JumjiSearchBean;
import main.java.jumyong.minwon.model.MinwonBean;

public interface IGapanService {

	public	List	executeSearch(GapanBean Bean, int intRn1,int intRn2);
	public	int		executeCount(GapanBean Bean);
	public  List getOperatorInfo(String gapanNo);
	public 	FamilyBean getFamilyInfo(String gapanNo);
	public 	BloomBean getBloomInfo(String gapanNo);
	public 	OperBean getOperInfo(String gapanNo);

	//��) 740101_4_0001   //(���ڵ�+�������ڵ�) + _4_ + SEQ 
	public 	String executeCheck_Gapanno(String gapan_num);					//���ǹ�ȣ�� �����ϱ� ���� �ش� �ֹι�ȣ�� ��ϵ� �ο��� �ִ��� ��ȸ
	public 	boolean executeGapan_Base_Register(GapanBaseBean Bean);			//GAPAN_BASE�� ���� �Ѵ�.
	public	boolean	executeMinwon_Register(MinwonBean Bean);				//�ο� ������ �����Ѵ�.
	public boolean executeGapan_Head_Register(GapanHeadBean gapanHeadBean);	//���� ���, ������ ������ ����
	public boolean executeGapan_Info_Register(GapanInfoBean gapanInfoBean);	//�ü�, � ������ ����
	
	public	List	executeSearch_Jumji(JumjiSearchBean Bean, int intRn1, int intRn2);
	public	int		executeSearch_JumjiCount(JumjiSearchBean Bean);
}

