/*********************************************************************************************************
 				*�����ۼ��� : 2006.07.12
				*�����ۼ��� : jklee, jhlee
				*�ֿ�ó������ : Q&A�Խ��� ���� db�۾��� ó��
				*������ :
				*������ :
				*�������� :
 *********************************************************************************************************/

package main.java.gapan.junggi.service;

import java.util.List;
import java.util.Map;


import main.java.gapan.junggi.dao.IJunggiDao;
import main.java.gapan.jumyong.model.ProductBean;
import main.java.gapan.jumyong.model.SearchBean;

public class JunggiService implements IJunggiService {
	
	private IJunggiDao  objJunggiDao = null;

	public void setGapan_junggiDao(IJunggiDao newJunggiDao) {
	    this.objJunggiDao = newJunggiDao;
	}
	
	// �������� �ϰ� ���� count
    public int getlandPriceAllApllyCount(String sigu_cd, String year, String type, String tax_set, String tax_yn, String mul_fromdate, String mul_todate, String cal_status, String purpose,String bj_cd
    		,String jumyongName)
    {
    	return objJunggiDao.getlandPriceAllApllyCount(sigu_cd, year,  type,  tax_set,  tax_yn, mul_fromdate, mul_todate, cal_status, purpose, bj_cd, jumyongName);
    }
// �������� �ϰ� ����    
    public List getlandPriceAllAplly(String sigu_cd, String year, String type, String tax_set, String tax_yn, String mul_fromdate, String mul_todate, String cal_status, String purpose,String bj_cd
    		,String jumyongName, int currentPage,int countPerPage)
    {
    	return objJunggiDao.getlandPriceAllAplly(sigu_cd, year,  type,  tax_set,  tax_yn, mul_fromdate, mul_todate, cal_status, purpose, bj_cd, jumyongName, currentPage, countPerPage);
    }
 // �������� �ϰ� ���� update
    public boolean priceApllyUpdate(SearchBean sb)
    {
    	return objJunggiDao.priceApllyUpdate(sb);
    }    
	
//	����� ��ȸ ����Ʈ    
	public List junggiSearchList(String gu_code,String year,String type,String tax_set,String tax_yn,String bj_cd,String bonbun,String bubun,String numVal
    		,String name,String purpose_cd,int currentPage,int countPerPage, String gubun)
	
	{
		return objJunggiDao.junggiSearchList(   gu_code,year,  type,  tax_set,  tax_yn,  bj_cd,  bonbun,  bubun,  numVal
	    		,  name,  purpose_cd, currentPage, countPerPage, gubun);
	}
//  ����� ��ȸ ����Ʈ   ī��Ʈ
    public int getJunggiSearchListCount(String gu_code,String year,String type,String tax_set,String tax_yn,String bj_cd,String bonbun,String bubun,String numVal
    		,String name,String purpose_cd)
    {
    	return objJunggiDao.getJunggiSearchListCount(   gu_code,year,  type,  tax_set,  tax_yn,  bj_cd,  bonbun,  bubun,  numVal
	    		,  name,  purpose_cd);
    }
//  �ΰ����� ����Ʈ 
//  �ΰ����� ����Ʈ 
    public List impositionList(String adminNo,String strYear,int currentPage,int countPerPage,String use_section, String seq )

	{
		return objJunggiDao.impositionList(adminNo,strYear,currentPage,countPerPage,use_section,seq);
	}
//  �ΰ����� ����Ʈ ī��Ʈ
	public int getProductListCount(String adminNo)
	{
		return objJunggiDao.getProductListCount(adminNo);
	}

//  �ΰ����� - �⵵�� 
    public ProductBean impositionInfo(String gapan_no, String seq)
    {
    	ProductBean pb = objJunggiDao.impositionInfo(gapan_no,seq);
    	
    	return pb;
    }
//  �۳⵵ ����� ��������
    public Map getSum_LastYear(String adminNo,String strYear)
    {
    	return objJunggiDao.getSum_LastYear(adminNo,strYear);
    }
//  �ΰ����� ����Ʈ  ī��Ʈ
    public int getProductSeq(String adminNo,String strYear)
    {
    	return objJunggiDao.getProductSeq(adminNo,strYear);
    }
//  �ΰ����� ���� ���� �Էµ� YEAR
    public String getLastYear(String adminNo)
    {
    	return objJunggiDao.getLastYear(adminNo);
    }
//  �ΰ� �̺ΰ� ����
    public String getTaxYn(String seq)
    {    	
    	return objJunggiDao.getTaxYn(seq);
    }
//  �ΰ����� - �⵵�� �հ� 
    public List impositionSumListByYear(String adminNo,int currentPage,int countPerPage)
    {
    	return objJunggiDao.impositionSumListByYear(adminNo,currentPage,countPerPage);
    }
//  �ΰ����� - �⵵�� �հ� ī��Ʈ
    public int getImpositionSumListByYearCount(String adminNo)
    {
    	return objJunggiDao.getImpositionSumListByYearCount(adminNo);
    }
//  �ΰ����� - ���� �հ�-����� 
    public int getProductAreaSum(String seq)
    {
    	return objJunggiDao.getProductAreaSum(seq);
    }
//	����� ���� ����Ʈ		
    public List Productjunggi_addList(String admin_no, String year)
    {
    	return objJunggiDao.Productjunggi_addList(admin_no,year);
    }
//  ����_�ΰ� ���̺� SEQ ���
    public int getCal_tax_seq(String adminNo,String strYear)
    {
    	return objJunggiDao.getCal_tax_seq(adminNo,strYear);
    }
//  �ΰ����� - �⵵�� �հ� ����Ʈ 
    public List cal_sum_infoList(String adminNo,String year,int currentPage,int countPerPage)
    {
    	return objJunggiDao.cal_sum_infoList(adminNo,year,currentPage,countPerPage);
    }
	 //    �ΰ����� - �⵵�� �հ� ����Ʈ ī��Ʈ 
    public int getcal_sum_infoListCount(String adminNo, String year)
    {
    	return objJunggiDao.getcal_sum_infoListCount(adminNo, year);
    }
//  �ΰ����� ����Ʈ 
    public List ImpositionInfoByCalSumList(String cal_sum_seq)
    {
    	return objJunggiDao.ImpositionInfoByCalSumList(cal_sum_seq);    	
    }
//	CAL_SUM_INFO ���̺� ���� �߰� ������Ʈ		 
    public int CalSumAddUpdate(ProductBean objProductBean)
    {    	
    	return objJunggiDao.CalSumAddUpdate(objProductBean);
    }
//	CAL_SUM_INFO ���̺� ���� �߰� ������Ʈ		 
    public int CalSumReductionUpdate(ProductBean objProductBean)
    {
    	return objJunggiDao.CalSumReductionUpdate(objProductBean);
    }
//	SUM_ADJUST, AREA_AFTER �հ� SUM_SEQ��
    public ProductBean SumBysumSeq(String seq)
    {
    	return objJunggiDao.SumBysumSeq(seq);
    }
//	reduction����
    public ProductBean GetReductionInfo(String seq)
    {
    	return objJunggiDao.GetReductionInfo(seq);
    }
//  ����� �ش翬�� ���� first_seq�� ����
    public int GetCountSameCal(String seq,String year)
    {
    	return objJunggiDao.GetCountSameCal(seq,year);
    }
//	CalculationTempUpdateQuery
    public void CalculationTempInsert(ProductBean pb)
    {
    	objJunggiDao.CalculationTempInsert(pb);
    }
    
//  getCal_sum_seq
    public int GetCal_sum_seq(String admin_no,String year)
    {
    	return objJunggiDao.GetCal_sum_seq(admin_no,year);
    }
//  cal_sum_exist
    public int cal_sum_exist(String admin_no,String year)
    {
    	return objJunggiDao.cal_sum_exist(admin_no,year);
    }
//  junggi getUseSection     
    public int getUseSection(String seq)
    {
    	return objJunggiDao.getUseSection(seq);
    }
    
//	2009.8.14 �߰� taxation_info insert
    public	boolean	executeBugwa_Register(ProductBean objProductBean)
    {
    	return objJunggiDao.executeBugwa_Register(objProductBean);
    }
    public	boolean	insertProduct(ProductBean objProductBean)
    {
    	return objJunggiDao.insertProduct(objProductBean);
    }
    public	boolean	Cal_Sum_InfoInsert(ProductBean objProductBean)
    {
    	return objJunggiDao.Cal_Sum_InfoInsert(objProductBean);
    }
//  CAL_SUM_INFO ������ ������
    public int getCal_Sum_Seq()
    {
    	return objJunggiDao.getCal_Sum_Seq();
    }
    
    public void setTaxYn(String gapan_no)
    {
    	objJunggiDao.setTaxYn(gapan_no);
    }
    
    // ����
    public boolean updateProduct(ProductBean objProductBean)
    {
    	return objJunggiDao.updateProduct(objProductBean);
    }
    public boolean updateCal_sum_info(ProductBean objProductBean)
    {
    	return objJunggiDao.updateCal_sum_info(objProductBean);
    }
    public boolean updateTaxation_info(ProductBean objProductBean)
    {
    	return objJunggiDao.updateTaxation_info(objProductBean);
    }
    
    //��ϵ� �������� ��������
    public int getNowPrice(String gapan_no, String year)
    {
    	return objJunggiDao.getNowPrice(gapan_no, year);
    }
    
    // ��������ڵ�� �ڵ�� ��������
    public String getPurposeNm(String type, String cd)
    {
    	return objJunggiDao.getPurposeNm(type, cd);
    }
    
    public	int	SetCal_Sum_Info_taxseq(String strSeq)
    {
    	return objJunggiDao.SetCal_Sum_Info_taxseq(strSeq);
    }
}