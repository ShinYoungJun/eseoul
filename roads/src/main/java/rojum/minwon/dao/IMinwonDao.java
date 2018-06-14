package main.java.rojum.minwon.dao;



import java.util.List;
import java.util.Map;

import main.java.rojum.jumyong.model.ConfBean;
import main.java.rojum.jumyong.model.DisUseBean;
import main.java.rojum.minwon.model.MinwonBean;



public interface IMinwonDao {	
	//�ο� ��ȸ
    public List getMinwonList(MinwonBean objMinwonBean);
    //�ο� ��ȸ ����
    public int getMinwonListCount(MinwonBean objMinwonBean);
    
    //�ο���Ȳ ���
    public boolean insertMinwon(MinwonBean objMinwonBean);
    
    //�ο���Ȳ ����
    public boolean updateMinwon(MinwonBean objMinwonBean);
    
    //�ο���Ȳ ����
    public boolean deleteMinwon(MinwonBean objMinwonBean);
}