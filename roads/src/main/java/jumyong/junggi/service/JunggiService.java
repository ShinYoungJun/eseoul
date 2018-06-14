/*********************************************************************************************************
 				*�����ۼ��� : 2006.07.12
				*�����ۼ��� : jklee, jhlee
				*�ֿ�ó������ : Q&A�Խ��� ���� db�۾��� ó��
				*������ :
				*������ :
				*�������� :
 *********************************************************************************************************/

package main.java.jumyong.junggi.service;

import java.util.List;
import java.util.Map;


import main.java.jumyong.junggi.dao.IJunggiDao;
import main.java.jumyong.jumyong.model.ProductBean;
import main.java.jumyong.jumyong.model.SearchBean;
import main.java.jumyong.jumyonginfo.model.TotalWIthBean;

public class JunggiService implements IJunggiService {
	
	private IJunggiDao  objJunggiDao = null;

	public void setJunggiDao(IJunggiDao newJunggiDao) {
	    this.objJunggiDao = newJunggiDao;
	}
	
//	����� ��ȸ ����Ʈ    
	public List junggiSearchList(String sigu_cd, String year,String type,String tax_set,String tax_yn,String mul_fromdate,String mul_todate,String purpose,String bj_cd , String hj_cd
    		,String jumyongName, String cal_status, String SECTION,int currentPage,int countPerPage, String gubun)
	
	{
		return objJunggiDao.junggiSearchList( sigu_cd, year,  type,  tax_set,  tax_yn,  mul_fromdate, mul_todate, purpose, bj_cd, hj_cd, jumyongName, cal_status, SECTION, currentPage, countPerPage, gubun);
	}
//  ����� ��ȸ ����Ʈ   ī��Ʈ
    public int getJunggiSearchListCount(String sigu_cd, String year,String type,String tax_set,String tax_yn,String mul_fromdate,String mul_todate,String purpose,String bj_cd ,String hj_cd
    		,String jumyongName , String cal_status, String SECTION)
    {
    	return objJunggiDao.getJunggiSearchListCount(sigu_cd, year,  type,  tax_set,  tax_yn,  mul_fromdate, mul_todate, purpose, bj_cd, hj_cd, jumyongName, cal_status, SECTION);
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
    public ProductBean impositionInfo(String seq)
    {
    	ProductBean pb = objJunggiDao.impositionInfo(seq);
    	
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
    public float getProductAreaSum(String seq)
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
    public List cal_sum_infoList(String adminNo, String year,int currentPage,int countPerPage)
    {
    	return objJunggiDao.cal_sum_infoList(adminNo, year,currentPage,countPerPage);
    }
	 //    �ΰ����� - �⵵�� �հ� ����Ʈ ī��Ʈ 
    public int getcal_sum_infoListCount(String adminNo, String year)
    {
    	return objJunggiDao.getcal_sum_infoListCount(adminNo, year);
    }
//  �ΰ����� ����Ʈ 
    public List ImpositionInfoByCalSumList(String cal_sum_seq,int currentPage,int countPerPage)
    {
    	return objJunggiDao.ImpositionInfoByCalSumList(cal_sum_seq,currentPage,countPerPage);    	
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
    public ProductBean GetReductionInfo(String seq,String adminNo)
    {
    	return objJunggiDao.GetReductionInfo(seq,adminNo);
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
    public int cal_sum_exist(String admin_no,String year,String fromdate,String todate)
    {
    	return objJunggiDao.cal_sum_exist(admin_no,year,fromdate,todate);
    }
//  junggi getUseSection     
    public int getUseSection(String seq)
    {
    	return objJunggiDao.getUseSection(seq);
    }
    
//	2009.8.7�߰� taxation_info insert
    public	boolean	executeBugwa_Register(ProductBean objProductBean)
    {
    	return objJunggiDao.executeBugwa_Register(objProductBean);
    }
//  �ΰ����� ����Ʈ 
    public List ImpositionInfoByCalSumList_multi(String admin_no, String year)
    {
    	return objJunggiDao.ImpositionInfoByCalSumList_multi(admin_no, year);    	
    }
//  �ΰ����� - �⵵�� 
    public ProductBean impositionInfo_tax(String seq, String admin_no, String year)
    {
    	ProductBean pb = objJunggiDao.impositionInfo_tax(seq, admin_no, year);
    	
    	return pb;
    }
//  �ΰ����� - ���� �հ�-����� 
    public int getProductAreaSum_year(String admin_no, String year)
    {
    	return objJunggiDao.getProductAreaSum_year(admin_no, year);
    }
//  ��������ڵ�� �ڵ�� ��������
    public String getPurposeNm(String type, String cd)
    {
    	return objJunggiDao.getPurposeNm(type, cd);
    }
    public	int	SetCal_Sum_Info_taxseq(String strSeq)
    {
    	return objJunggiDao.SetCal_Sum_Info_taxseq(strSeq);
    }
    public boolean updateTaxation_info(ProductBean objProductBean)
    {
    	return objJunggiDao.updateTaxation_info(objProductBean);
    }
    
    public int CalSumReductionUpdate_noPermission(ProductBean objProductBean)
    {
    	return objJunggiDao.CalSumReductionUpdate_noPermission(objProductBean);
    }
    
 // �������� �ϰ� ���� count
    public int getlandPriceAllApllyCount(String sigu_cd, String year,String type,String tax_set,String tax_yn, String purpose,String bj_cd , String hj_cd
    		,String jumyongName, String SECTION)
    {
    	return objJunggiDao.getlandPriceAllApllyCount(sigu_cd, year,  type,  tax_set,  tax_yn, purpose, bj_cd, hj_cd, jumyongName, SECTION);
    }
// �������� �ϰ� ����    
    public List getlandPriceAllAplly(String sigu_cd, String year,String type,String tax_set,String tax_yn, String purpose,String bj_cd ,String hj_cd
    		,String jumyongName, String SECTION, int currentPage,int countPerPage)
    {
    	return objJunggiDao.getlandPriceAllAplly( sigu_cd, year,  type,  tax_set,  tax_yn, purpose, bj_cd, hj_cd, jumyongName, SECTION, currentPage, countPerPage);
    }
    
 // �������� �ϰ� ���� update
    public boolean priceApllyUpdate(SearchBean sb)
    {
    	return objJunggiDao.priceApllyUpdate(sb);
    }
  //��ϵ� �������� ��������
    public int getNowPrice(String admin_no, String year)
    {
    	return objJunggiDao.getNowPrice(admin_no, year);
    }  
    
    public boolean CalSumUpdate(ProductBean objProductBean)
    {
    	return objJunggiDao.CalSumUpdate(objProductBean);
    }
    
    // ������ �������� xml ���ϱ�
    public List executeTotal_With(String admin_no){
    	return objJunggiDao.executeTotal_With(admin_no);
    }
    
    //������ ��� �����
    public void executeDelete_With(String adminNo){
    	objJunggiDao.executeDelete_With(adminNo);
    }
    //������ ���� ����ϱ�
    public void executeRegister_With(TotalWIthBean bean){
    	objJunggiDao.executeRegister_With(bean);
    	
    }
    
	//place�� with_sum_price ������Ʈ
	public void updateWith_Sum_Addr(String adminNo, String price,String WITH_ADDR1,String WITH_ADDR2)
    {    	
    	objJunggiDao.updateWith_Sum_Addr(adminNo,price,WITH_ADDR1,WITH_ADDR2);
    }
}