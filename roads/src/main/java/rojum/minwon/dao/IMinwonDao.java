package main.java.rojum.minwon.dao;



import java.util.List;
import java.util.Map;

import main.java.rojum.jumyong.model.ConfBean;
import main.java.rojum.jumyong.model.DisUseBean;
import main.java.rojum.minwon.model.MinwonBean;



public interface IMinwonDao {	
	//민원 조회
    public List getMinwonList(MinwonBean objMinwonBean);
    //민원 조회 개수
    public int getMinwonListCount(MinwonBean objMinwonBean);
    
    //민원현황 등록
    public boolean insertMinwon(MinwonBean objMinwonBean);
    
    //민원현황 수정
    public boolean updateMinwon(MinwonBean objMinwonBean);
    
    //민원현황 삭제
    public boolean deleteMinwon(MinwonBean objMinwonBean);
}