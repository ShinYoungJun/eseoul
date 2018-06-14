
package main.java.rojum.survey.service;

import java.util.List;
import java.util.Map;

import main.java.rojum.survey.dao.ISurveyDao;
import main.java.rojum.survey.model.GapanBaseBean;
import main.java.rojum.survey.model.GapanHeadBean;
import main.java.rojum.survey.model.GapanInfoBean;
import main.java.rojum.survey.model.SearchBean;


public class SurveyService implements ISurveyService {
	
	private ISurveyDao objSurveyDao = null;

	public void setRojum_SurveyDao(ISurveyDao newSurveyDao) {
	    this.objSurveyDao = newSurveyDao;
	}
	
	// ���ǹ�ȣ ��ȸ
	public	String	executeCheck_Gapanno(String gapanNo){
		return objSurveyDao.executeCheck_Gapanno(gapanNo);
	}
	//���� BASE ���
	public	boolean	executeGapan_Base_Register(GapanBaseBean Bean){
		return objSurveyDao.executeGapan_Base_Register(Bean);
	}
	
	//���� ���, ������ ���� ���
	public	boolean	executeGapan_Head_Register(GapanHeadBean Bean){
		return objSurveyDao.executeGapan_Head_Register(Bean);
	}
	
	//	GAPAN_INFO  ���̺� ���
	public	boolean	executeGapan_Info_Register(GapanInfoBean Bean){
		return objSurveyDao.executeGapan_Info_Register(Bean);
	}
	
    //�⺻���� ����
    public	boolean	insertCopyGapanBase(String newGapanNo, String oldGapanNo){
		return objSurveyDao.insertCopyGapanBase(newGapanNo,oldGapanNo);
	}
    
    //��� ���� ����
    public	boolean	insertCopyGapanHead(String newGapanNo, String oldGapanNo){
		return objSurveyDao.insertCopyGapanHead(newGapanNo,oldGapanNo);
	}
    
    //�ü������ ����
    public	boolean	insertCopyGapanInfo(String newGapanNo, String oldGapanNo){
		return objSurveyDao.insertCopyGapanInfo(newGapanNo,oldGapanNo);
	}
    
	//�������� ��ȸ
    public List getSurveyList(SearchBean objectSearchBean){
    	return objSurveyDao.getSurveyList(objectSearchBean);
    }

	//�������� ī��Ʈ
    public Map getSurveyListCount(SearchBean objectSearchBean){
    	return objSurveyDao.getSurveyListCount(objectSearchBean);
    }
    
    //�Ÿ����� ����
    public boolean modifySpecialStreet(GapanInfoBean bean){
    	return objSurveyDao.modifySpecialStreet(bean);	
    }


}