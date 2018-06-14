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

import main.java.jumyong.jumyong.model.ProductBean;
import main.java.jumyong.saewe.model.TaxationBean;
import main.java.jumyong.jumyong.model.SearchBean;
import main.java.jumyong.jumyonginfo.model.TotalWIthBean;

public interface IJunggiService{	
//����� ��ȸ ����Ʈ    
	public List junggiSearchList(String sigu_cd, String year,String type,String tax_set,String tax_yn,String mul_fromdate,String mul_todate,String purpose,String bj_cd ,String hj_cd
    		,String jumyongName, String cal_status, String SECTION,int currentPage,int countPerPage, String gubun);
//  ����� ��ȸ ����Ʈ   ī��Ʈ
    public int getJunggiSearchListCount(String sigu_cd, String year,String type,String tax_set,String tax_yn,String mul_fromdate,String mul_todate,String purpose,String bj_cd, String hj_cd, String jumyongName, String cal_status, String SECTION);
//  �ΰ����� ����Ʈ 
    public List impositionList(String adminNo,String strYear,int currentPage,int countPerPage,String use_section, String seq );
//  �ΰ����� ����Ʈ ī��Ʈ	
	public int getProductListCount(String adminNo);
//  �ΰ����� - �⵵�� 
    public ProductBean impositionInfo(String seq);
//  �۳⵵ ����� ��������
    public Map getSum_LastYear(String adminNo,String strYear);
//  �ΰ����� ����Ʈ  ī��Ʈ
    public int getProductSeq(String adminNo,String strYear);
//  �ΰ����� ���� ���� �Էµ� YEAR
    public String getLastYear(String adminNo);
//  �ΰ� �̺ΰ� ����
    public String getTaxYn(String seq);   
//   �ΰ����� - �⵵�� �հ� 
    public List impositionSumListByYear(String adminNo,int currentPage,int countPerPage);
//  �ΰ����� - �⵵�� �հ� ī��Ʈ
    public int getImpositionSumListByYearCount(String adminNo);
//  �ΰ����� - ���� �հ�-����� 
    public float getProductAreaSum(String seq);    
//	����� ���� ����Ʈ		
    public List Productjunggi_addList(String admin_no, String year);    
//  ����_�ΰ� ���̺� SEQ ���
    public int getCal_tax_seq(String adminNo,String strYear);
//  �ΰ����� - �⵵�� �հ� ����Ʈ 
    public List cal_sum_infoList(String adminNo, String year,int currentPage,int countPerPage); 
	 //    �ΰ����� - �⵵�� �հ� ����Ʈ ī��Ʈ 
    public int getcal_sum_infoListCount(String adminNo, String year);
//  �ΰ����� ����Ʈ 
    public List ImpositionInfoByCalSumList(String cal_sum_seq,int currentPage,int countPerPage);
//	CAL_SUM_INFO ���̺� ���� �߰� ������Ʈ		 
    public int CalSumAddUpdate(ProductBean objProductBean);
//	CAL_SUM_INFO ���̺� ���� �߰� ������Ʈ		 
    public int CalSumReductionUpdate(ProductBean objProductBean);
//	SUM_ADJUST, AREA_AFTER �հ� SUM_SEQ��
    public ProductBean SumBysumSeq(String seq);  
//	reduction����
    public ProductBean GetReductionInfo(String seq,String adminNo);
//  ����� �ش翬�� ���� first_seq�� ����
    public int GetCountSameCal(String seq,String year);    
//	CalculationTempUpdateQuery
    public void CalculationTempInsert(ProductBean pb);
//  getCal_sum_seq
    public int GetCal_sum_seq(String admin_no,String year);    
//  cal_sum_exist
    public int cal_sum_exist(String admin_no,String year,String fromdate,String todate);
//  junggi getUseSection     
    public int getUseSection(String seq);
    
    
    // 2009.8.7 �߰� taxation_info insert
    public	boolean	executeBugwa_Register(ProductBean objProductBean);
    //  �ΰ����� ����Ʈ 
    public List ImpositionInfoByCalSumList_multi(String admin_no, String year);
    //  �ΰ����� - �⵵�� 
    public ProductBean impositionInfo_tax(String seq, String admin_no, String year);
    //  �ΰ����� - ���� �հ�-����� 
    public int getProductAreaSum_year(String admin_no, String year);
    // ��������ڵ�� �ڵ�� ��������
    public String getPurposeNm(String type, String cd);
    public	int	SetCal_Sum_Info_taxseq(String strSeq);
    public boolean updateTaxation_info(ProductBean objProductBean);
    
    public int CalSumReductionUpdate_noPermission(ProductBean objProductBean);
    
 // �������� �ϰ� ���� count 
    public int getlandPriceAllApllyCount(String sigu_cd, String year,String type,String tax_set,String tax_yn, String purpose,String bj_cd , String hj_cd
    		,String jumyongName, String SECTION);
    // �������� �ϰ� ���� View
    public List getlandPriceAllAplly(String sigu_cd, String year,String type,String tax_set,String tax_yn,String purpose,String bj_cd ,String hj_cd
    		,String jumyongName, String SECTION, int currentPage,int countPerPage);
  //�������� �ϰ����� update
    public boolean priceApllyUpdate(SearchBean sb);
    
    //��ϵ� �������� ��������
    public int getNowPrice(String admin_no, String year);
    
    public	boolean	CalSumUpdate(ProductBean objProductBean);
    
    // ������ �������� xml ���ϱ�
    public List executeTotal_With(String admin_no);
    
    //������ ��� �����
    public void executeDelete_With(String adminNo);
    //������ ���� ����ϱ�
    public void executeRegister_With(TotalWIthBean bean);
    
	//place�� with_sum_price ������Ʈ
	public void updateWith_Sum_Addr(String adminNo, String price,String WITH_ADDR1,String WITH_ADDR2);
	
}