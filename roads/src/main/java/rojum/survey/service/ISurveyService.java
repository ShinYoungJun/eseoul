
package main.java.rojum.survey.service;

import java.util.List;
import java.util.Map;

import main.java.rojum.survey.model.GapanBaseBean;
import main.java.rojum.survey.model.GapanHeadBean;
import main.java.rojum.survey.model.GapanInfoBean;
import main.java.rojum.survey.model.SearchBean;

public interface ISurveyService{
	
	// ���ǹ�ȣ ��ȸ
	public	String	executeCheck_Gapanno(String gapanNo);
	
	//���� BASE ���
	public	boolean	executeGapan_Base_Register(GapanBaseBean Bean);
	
	//���� ���, ������ ���� ���
	public	boolean	executeGapan_Head_Register(GapanHeadBean Bean);
	
	//	GAPAN_INFO  ���̺� ���
	public	boolean	executeGapan_Info_Register(GapanInfoBean Bean);
	
    //�⺻���� ����
    public	boolean	insertCopyGapanBase(String newGapanNo, String oldGapanNo);
    
    //��� ���� ����
    public	boolean	insertCopyGapanHead(String newGapanNo, String oldGapanNo);
    
    //�ü������ ����
    public	boolean	insertCopyGapanInfo(String newGapanNo, String oldGapanNo);
     
	//�������� ��ȸ
    public List getSurveyList(SearchBean objectSearchBean);

	//�������� ī��Ʈ
    public Map getSurveyListCount(SearchBean objectSearchBean);
    
    //�Ÿ����� ����
    public boolean modifySpecialStreet(GapanInfoBean bean);
    
    

}