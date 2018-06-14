/*********************************************************************************************************
 				*�����ۼ��� : 2006.07.12
				*�����ۼ��� : jklee, jhlee
				*�ֿ�ó������ : Q&A�Խ��� ���� db�۾��� ó��
				*������ :
				*������ :
				*�������� :
 *********************************************************************************************************/

package main.java.rojum.owner.service;

import java.util.List;
import java.util.Map;

import main.java.rojum.owner.model.AccuseBean;
import main.java.rojum.owner.model.ChangeJobBean;
import main.java.rojum.owner.model.SearchBean;

public interface IOwnerService{
    //��ߵ�� ī��Ʈ
    public int getAccuseListCount(SearchBean bean);
    
	// ��ߵ�� ����Ʈ
	public List getAccuseList(SearchBean bean) ;
	
	// 	��ߵ��
    public boolean insertAccuseInfo(AccuseBean bean);
    
	// ��� ����
    public boolean modifyAccuseInfo(AccuseBean bean);
    
    //��� ����
    public boolean deleteAccuseInfo(AccuseBean bean);

    //����������� ī��Ʈ
    public int getChangeJobListCount(SearchBean bean);
    
	// ����������� ����Ʈ
	public List getChangeJobList(SearchBean bean);
	
	// 	�����������
    public boolean insertChangeJobInfo(ChangeJobBean bean);
    
	// �������� ����
    public boolean modifyChangeJobInfo(ChangeJobBean bean);
    
    //�������� ����
    public boolean deleteChangeJob(ChangeJobBean bean);
    
}