/*********************************************************************************************************
 				*�����ۼ��� : 2006.07.12
				*�����ۼ��� : jklee, jhlee
				*�ֿ�ó������ : QA�Խ��� ���� db�۾��� ó��
				*������ :
				*������ :
				*�������� :
 *********************************************************************************************************/

package main.java.map.dao;

import main.java.jumyong.jumyong.model.ConfBean;
import main.java.jumyong.jumyong.model.DisUseBean;
import main.java.jumyong.jumyong.model.InspectBean;
import main.java.jumyong.jumyong.model.PlaceLocationBean;
import main.java.jumyong.jumyong.model.PlaceFileBean;
import main.java.jumyong.jumyong.model.ProductBean;
import main.java.map.model.SearchBean;
import main.java.jumyong.jumyong.model.jumregBean;


import java.util.List;
import java.util.Map;

import org.springframework.dao.DataAccessException;

public interface IMapSearchDao {

//	���� �˻� ����Ʈ
    public List mapSearchList(SearchBean objectSearchBean);
    
//	���� ��ȸ ī��Ʈ
    public int getMapSearchCount(SearchBean objectSearchBean);
    
//	���� ������
    public	List getMap_View(String strAdmin_no);
    
//	���� �˻� ����Ʈ
    public List mapSearchList1(SearchBean objectSearchBean);
    
//	���� ��ȸ ī��Ʈ
    public int getMapSearchCount1(SearchBean objectSearchBean);
    
//	���� ������
    public	List getMap_View1(String strAdmin_no, String gp_typ);
    
//	��ġ���(�ǹ���ǥ��������)
    public	List miniMapXY(String strPnu);
    
//	��ġ���(���鵿 ��ǥ ��������)
    public	List miniMapbjXY(String strPnu);

//	������ �����ü��� ���и���Ʈ
    public	List executepurposeCode(String Class_cd, String Code, String Title);
    
//	�ñ����ڵ�
    public List getGuCode(String SI_CD);
    
//	���ڵ�
    public	List executeBJDongCode(String SI_NM, String GU_NM);
        
}