package main.java.rojum.minwon.service;

import java.util.List;
import main.java.rojum.minwon.dao.IMinwonDao;
import main.java.rojum.minwon.model.MinwonBean;


public class MinwonService implements IMinwonService {
	
	private IMinwonDao objMinwonDao = null;

	public void setRojum_minwonDao(IMinwonDao newMinwonDao) {
	    this.objMinwonDao = newMinwonDao;
	}
	
	//�ο� ��ȸ
    public List getMinwonList(MinwonBean objMinwonBean){
    	return objMinwonDao.getMinwonList(objMinwonBean);
    }
    //�ο� ��ȸ ����
    public int getMinwonListCount(MinwonBean objMinwonBean){
    	return objMinwonDao.getMinwonListCount(objMinwonBean);
    }
    
    //�ο���Ȳ ���
    public boolean insertMinwon(MinwonBean objMinwonBean){
    	return objMinwonDao.insertMinwon(objMinwonBean);
    }
    //�ο���Ȳ ����
    public boolean updateMinwon(MinwonBean objMinwonBean){
    	return objMinwonDao.updateMinwon(objMinwonBean);
    }
    
    //�ο���Ȳ ����
    public boolean deleteMinwon(MinwonBean objMinwonBean){
    	return objMinwonDao.deleteMinwon(objMinwonBean);
    }
}