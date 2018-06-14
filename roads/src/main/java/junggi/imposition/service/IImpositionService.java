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

import main.java.junggi.imposition.model.impositionBean;

public interface IImpositionService{	
//	����� ��ȸ ����Ʈ    	
	public List junggiSearchList(String year,String type,String check_yn,String tax_yn,String tax_set,String purpose_cd,String numVal
    		,String name,String bj_cd,String hj_cd,String bonbun,String bubun,int currentPage,int countPerPage);
//  ����� ��ȸ ����Ʈ   ī��Ʈ
    public int getJunggiSearchListCount(String year,String type,String check_yn,String tax_yn,String tax_set,String purpose_cd,String numVal
    		,String name,String bj_cd,String hj_cd,String bonbun,String bubun);	
//  �ΰ����� ����Ʈ 
	public List impositionList(String adminNo,int currentPage,int countPerPage);	
//  �ΰ����� ����Ʈ ī��Ʈ	
	public int getProductListCount(String adminNo);
//  �ΰ����� - �⵵�� 
    public impositionBean impositionInfo(String adminNo,String strYear);
//  �۳⵵ ����� ��������
    public Map getSum_LastYear(String adminNo,String strYear);
//  �ΰ����� ����Ʈ  ī��Ʈ
    public int getProductSeq(String adminNo,String strYear);
//  �ΰ����� ���� ���� �Էµ� YEAR
    public String getLastYear(String adminNo);
//  �ΰ� �̺ΰ� ����
    public String getTaxYn(String seq);   
    
}