/*********************************************************************************************************
 				*�����ۼ��� : 2006.07.12
				*�����ۼ��� : jklee, jhlee
				*�ֿ�ó������ : Q&A�Խ��� ���� db�۾��� ó��
				*������ :
				*������ :
				*�������� :
 *********************************************************************************************************/

package main.java.junggi.imposition.service;

import java.util.List;
import java.util.Map;

import main.java.junggi.imposition.dao.IImpositionDao;import main.java.junggi.imposition.model.impositionBean;
;

public class ImpositionService implements IImpositionService {
	
	private IImpositionDao  objImpositionDao = null;

	public void setImpositionDao(IImpositionDao newImpositionDao) {
	    this.objImpositionDao = newImpositionDao;
	}
	
//	����� ��ȸ ����Ʈ    	
	public List junggiSearchList(String year,String type,String check_yn,String tax_yn,String tax_set,String purpose_cd,String numVal
    		,String name,String bj_cd,String hj_cd,String bonbun,String bubun,int currentPage,int countPerPage)
	{
		return objImpositionDao.junggiSearchList( year, type, check_yn, tax_yn,tax_set, purpose_cd, numVal
	    		, name, bj_cd, hj_cd, bonbun, bubun,currentPage,countPerPage);
	}
//  ����� ��ȸ ����Ʈ   ī��Ʈ
    public int getJunggiSearchListCount(String year,String type,String check_yn,String tax_yn,String tax_set,String purpose_cd,String numVal
    		,String name,String bj_cd,String hj_cd,String bonbun,String bubun)
    {
    	return objImpositionDao.getJunggiSearchListCount(  year,  type,  check_yn,  tax_yn,  tax_set,  purpose_cd,  numVal
        		,  name,  bj_cd,  hj_cd,  bonbun,  bubun);
    }
//  �ΰ����� ����Ʈ 
	public List impositionList(String adminNo,int currentPage,int countPerPage)
	{
		return objImpositionDao.impositionList(adminNo,currentPage,countPerPage);
	}
//  �ΰ����� ����Ʈ ī��Ʈ
	public int getProductListCount(String adminNo)
	{
		return objImpositionDao.getProductListCount(adminNo);
	}

//  �ΰ����� - �⵵�� 
    public impositionBean impositionInfo(String adminNo,String strYear)
    {
    	return objImpositionDao.impositionInfo(adminNo,strYear);
    }
//  �۳⵵ ����� ��������
    public Map getSum_LastYear(String adminNo,String strYear)
    {
    	return objImpositionDao.getSum_LastYear(adminNo,strYear);
    }
//  �ΰ����� ����Ʈ  ī��Ʈ
    public int getProductSeq(String adminNo,String strYear)
    {
    	return objImpositionDao.getProductSeq(adminNo,strYear);
    }
//  �ΰ����� ���� ���� �Էµ� YEAR
    public String getLastYear(String adminNo)
    {
    	return objImpositionDao.getLastYear(adminNo);
    }
//  �ΰ� �̺ΰ� ����
    public String getTaxYn(String seq)
    {    	
    	return objImpositionDao.getTaxYn(seq);
    }
    
	
}