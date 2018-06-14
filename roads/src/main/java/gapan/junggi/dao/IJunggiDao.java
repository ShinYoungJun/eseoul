
package main.java.gapan.junggi.dao;



import main.java.gapan.jumyong.model.ProductBean;
import main.java.gapan.jumyong.model.SearchBean;

import java.util.List;
import java.util.Map;
public interface IJunggiDao {
	
	// �������� �ϰ� ���� count 	
    public int getlandPriceAllApllyCount(String sigu_cd, String year, String type, String tax_set, String tax_yn, String mul_fromdate, String mul_todate, String cal_status, String purpose,String bj_cd 
    		,String jumyongName);
    // �������� �ϰ� ���� View
    public List getlandPriceAllAplly(String sigu_cd, String year, String type, String tax_set, String tax_yn, String mul_fromdate, String mul_todate, String cal_status, String purpose,String bj_cd
    		,String jumyongName, int currentPage,int countPerPage);
  //�������� �ϰ����� update
    public boolean priceApllyUpdate(SearchBean sb);
	//����� ��ȸ ����Ʈ    
	public List junggiSearchList(String gu_code,String year,String type,String tax_set,String tax_yn,String bj_cd,String bonbun,String bubun,String numVal
    		,String name,String purpose_cd,int currentPage,int countPerPage, String gubun);
	  
//  ����� ��ȸ ����Ʈ   ī��Ʈ
    public int getJunggiSearchListCount(String gu_code,String year,String type,String tax_set,String tax_yn,String bj_cd,String bonbun,String bubun,String numVal
    		,String name,String purpose_cd);
//  �ΰ����� ����Ʈ 
    public List impositionList(String adminNo,String strYear,int currentPage,int countPerPage,String use_section, String seq );
//  �ΰ����� ����Ʈ ī��Ʈ	
	public int getProductListCount(String adminNo);
//  �ΰ����� - �⵵�� 
    public ProductBean impositionInfo(String gapan_no, String seq);
//  �۳⵵ ����� ��������
    public Map getSum_LastYear(String adminNo,String strYear);    
//  �ΰ����� ����Ʈ  ī��Ʈ
    public int getProductSeq(String adminNo,String strYear);
//  �ΰ����� ���� ���� �Էµ� YEAR
    public String getLastYear(String adminNo);
//  �ΰ� �̺ΰ� ����
    public String getTaxYn(String seq);
//  �ΰ����� - �⵵�� �հ�     
    public List impositionSumListByYear(String adminNo,int currentPage,int countPerPage);
//  �ΰ����� - �⵵�� �հ� ī��Ʈ
    public int getImpositionSumListByYearCount(String adminNo);
//  �ΰ����� - ���� �հ�-����� 
    public int getProductAreaSum(String seq);    
//	����� ���� ����Ʈ		
    public List Productjunggi_addList(String admin_no, String year);
//  ����_�ΰ� ���̺� SEQ ���
    public int getCal_tax_seq(String adminNo,String strYear);    
//    �ΰ����� - �⵵�� �հ� ����Ʈ 
    public List cal_sum_infoList(String adminNo,String year,int currentPage,int countPerPage);
	 //    �ΰ����� - �⵵�� �հ� ����Ʈ ī��Ʈ 
    public int getcal_sum_infoListCount(String adminNo, String year);
//  �ΰ����� ����Ʈ 
    public List ImpositionInfoByCalSumList(String cal_sum_seq);
//	CAL_SUM_INFO ���̺� ���� �߰� ������Ʈ		 
    public int CalSumAddUpdate(ProductBean objProductBean);
//	CAL_SUM_INFO ���̺� ���� �߰� ������Ʈ		 
    public int CalSumReductionUpdate(ProductBean objProductBean);
//	SUM_ADJUST, AREA_AFTER �հ� SUM_SEQ��
    public ProductBean SumBysumSeq(String seq);  
//	reduction����
    public ProductBean GetReductionInfo(String seq);
//    ����� �ش翬�� ���� first_seq�� ����
    public int GetCountSameCal(String seq,String year);    
//	CalculationTempUpdateQuery
    public void CalculationTempInsert(ProductBean pb);
//  getCal_sum_seq
    public int GetCal_sum_seq(String admin_no,String year);    
//  cal_sum_exist
    public int cal_sum_exist(String admin_no,String year);
//  junggi getUseSection     
    public int getUseSection(String seq);
    
//	2009.8.14 �߰�  taxation_info insert
    public boolean executeBugwa_Register(ProductBean objProductBean);
    public boolean insertProduct(ProductBean objProductBean);
    public boolean Cal_Sum_InfoInsert(ProductBean objProductBean);
    
//  CAL_SUM_INFO ������ ������
    public int getCal_Sum_Seq(); 
    public void setTaxYn(String gapan_no);
    
    // ����
    public boolean updateProduct(ProductBean objProductBean);
    public boolean updateCal_sum_info(ProductBean objProductBean);
    public boolean updateTaxation_info(ProductBean objProductBean);
    
    //��ϵ� �������� ��������
    public int getNowPrice(String gapan_no, String year);
    // ��������ڵ�� �ڵ�� ��������
    public String getPurposeNm(String type, String cd);
    public	int	SetCal_Sum_Info_taxseq(String strSeq);
}
