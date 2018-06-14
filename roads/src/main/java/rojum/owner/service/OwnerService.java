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

import main.java.rojum.owner.dao.IOwnerDao;

public class OwnerService implements IOwnerService {
	
	private IOwnerDao objOwnerDao = null;
	
	
	
	

	public void setRojum_ownerDao(IOwnerDao newOwnerDao) {
	    this.objOwnerDao = newOwnerDao;
	}
    //��ߵ�� ī��Ʈ
    public int getAccuseListCount(SearchBean bean){
    	return objOwnerDao.getAccuseListCount(bean);
    }
    
	// ��ߵ�� ����Ʈ
	public List getAccuseList(SearchBean bean){
    	return objOwnerDao.getAccuseList(bean);
    }
	
	// 	��ߵ��
    public boolean insertAccuseInfo(AccuseBean bean){
    	return objOwnerDao.insertAccuseInfo(bean);
    }
	// ��� ����
    public boolean modifyAccuseInfo(AccuseBean bean){
    	return objOwnerDao.modifyAccuseInfo(bean);
    }
    
    //��� ����
    public boolean deleteAccuseInfo(AccuseBean bean){
    	return objOwnerDao.deleteAccuseInfo(bean);
    }

    //����������� ī��Ʈ
    public int getChangeJobListCount(SearchBean bean){
    	return objOwnerDao.getChangeJobListCount(bean);
    }
    
	// ����������� ����Ʈ
	public List getChangeJobList(SearchBean bean){
    	return objOwnerDao.getChangeJobList(bean);
    }
	
	// 	�����������
    public boolean insertChangeJobInfo(ChangeJobBean bean){
    	return objOwnerDao.insertChangeJobInfo(bean);
    }
    
	// �������� ����
    public boolean modifyChangeJobInfo(ChangeJobBean bean){
    	return objOwnerDao.modifyChangeJobInfo(bean);
    }
    
    //�������� ����
    public boolean deleteChangeJob(ChangeJobBean bean){
    	return objOwnerDao.deleteChangeJob(bean);
    }
    
    
}