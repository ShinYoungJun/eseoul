package main.java.rojum.survey.dao;



import java.sql.Types;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.SqlUpdate;

import main.java.rojum.survey.dao.SurveyDao.InsertCopyGapanBaseQuery;
import main.java.rojum.survey.dao.SurveyDao.InsertCopyGapanHeadQuery;
import main.java.rojum.survey.dao.SurveyDao.InsertCopyGapanInfoQuery;
import main.java.rojum.survey.model.GapanBaseBean;
import main.java.rojum.survey.model.GapanHeadBean;
import main.java.rojum.survey.model.GapanInfoBean;
import main.java.rojum.survey.model.SearchBean;



public interface ISurveyDao {	
	
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