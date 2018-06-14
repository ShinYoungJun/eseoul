package main.java.rojum.minwon.service;

import java.util.List;
import main.java.rojum.minwon.dao.IMinwonDao;
import main.java.rojum.minwon.model.MinwonBean;


public class MinwonService implements IMinwonService {
	
	private IMinwonDao objMinwonDao = null;

	public void setRojum_minwonDao(IMinwonDao newMinwonDao) {
	    this.objMinwonDao = newMinwonDao;
	}
	
	//민원 조회
    public List getMinwonList(MinwonBean objMinwonBean){
    	return objMinwonDao.getMinwonList(objMinwonBean);
    }
    //민원 조회 개수
    public int getMinwonListCount(MinwonBean objMinwonBean){
    	return objMinwonDao.getMinwonListCount(objMinwonBean);
    }
    
    //민원현황 등록
    public boolean insertMinwon(MinwonBean objMinwonBean){
    	return objMinwonDao.insertMinwon(objMinwonBean);
    }
    //민원현황 수정
    public boolean updateMinwon(MinwonBean objMinwonBean){
    	return objMinwonDao.updateMinwon(objMinwonBean);
    }
    
    //민원현황 삭제
    public boolean deleteMinwon(MinwonBean objMinwonBean){
    	return objMinwonDao.deleteMinwon(objMinwonBean);
    }
}