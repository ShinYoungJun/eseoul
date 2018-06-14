/*********************************************************************************************************
 				*�����ۼ��� : 2006.07.12
				*�����ۼ��� : jklee, jhlee
				*�ֿ�ó������ : Q&A�Խ��� ���� db�۾��� ó��
				*������ :
				*������ :
				*�������� :
 *********************************************************************************************************/

package main.java.rojum.jumyong.service;

import java.util.List;
import java.util.Map;

import main.java.rojum.jumyong.model.GapanInfoBean;
import main.java.rojum.jumyong.model.GapanHeadBean;
import main.java.rojum.jumyong.model.GapanBaseBean;
import main.java.rojum.jumyong.model.ConfBean;
import main.java.rojum.jumyong.model.DisUseBean;
import main.java.rojum.jumyong.model.ProductBean;
import main.java.rojum.jumyong.model.SaleBean;
import main.java.rojum.jumyong.model.SearchBean;

public interface IJumyongService{
    public	String	executeCheck_Gapanno(String gapanNo);
   //���� BASE ���
    public	boolean	executeGapan_Base_Register(GapanBaseBean Bean);
  //���� ���, ������ ���� ���
    public	boolean	executeGapan_Head_Register(GapanHeadBean Bean);
    //	GAPAN_INFO  ���̺� ���
    public	boolean	executeGapan_Info_Register(GapanInfoBean Bean);
    //���� ��ȸ
    public List retrieveBoardList(SearchBean objectSearchBean);
    //���� ��ȸ ���� ��ȯ
    public List retrieveBoardListExcel(SearchBean objectSearchBean);
    //���� ��ȸ ����
    public Map getProductListCount(SearchBean objectSearchBean);
    
    //��� ���� ����
    public List executeGapan_Head(String GAPAN_NO);
  //********** BEGIN_KANG_20120416
    public List executeGapan_Info(String GAPAN_NO);
  //********** END_KANG_20120416
    
    //����� ���� ����
    public List executeJumyongInfo(String ownerName,String ownerSsn,String guCd);
    
	// ���� ���� ����
	public List executePickupInfo(String ownerName,String ownerSsn,String guCd);
	
	//********** BEGIN_KANG_20120416
	public List executePickupInfo(String ownerName,String ownerSsn,String guCd, String CAR_NO);
	//********** END_KANG_20120416

	// �赵 ���� ����
	public List executeGuideInfo(String ownerName,String ownerSsn,String guCd);

	//********** BEGIN_KANG_20120416
	public List executeGuideInfo(String ownerName,String ownerSsn,String guCd,String CAR_NO);
	//********** END_KANG_20120416

	// ��� / �Ű� ���� ����
	public List executeSaleInfo(String ownerName,String ownerSsn,String guCd);
    
	// ��ߵ�� ����Ʈ
	public List executeAccuseInfo(String ownerName,String ownerSsn,String guCd);

	// �������� ����Ʈ
	public List executeChangeJobInfo(String ownerName,String ownerSsn,String guCd);
    
    
    
    
    
    
    
    
    
    
    
    
    
	//���ܼ��Ժΰ����� �Է�
    public boolean executeBugwa_Register(ProductBean objProductBean);
    //���ܼ��Ժΰ����� ����
    public boolean updateBugwa_Register(ProductBean objProductBean);
    
	//���/�Ű� ����Ʈ
	public List ProductSaleList(String gapanNo);
	//���/�Ű� ����
	public int getProductSaleListCount(String gapanNo);	
	// ���/�Ű� ����
    public void executeDeleteProductSale(String gapanNo);
    
    //���Ű� ���
    public boolean UpdateSale_Register(SaleBean objSaleBean);
    
    //���Ű� ����
    public boolean ExecuteSale_Register(SaleBean objSaleBean);
    
    
   
	
	// ��� ����Ʈ
	public List executeOwnerList(String owner_name);
	
	
	

    
    // �̷����� insert
	public ProductBean insertHistoryInfo(ProductBean objProductBean);
	//History_info ������ seq ����
	public String getHistoryMaxSeq(ProductBean objProductBean);
	//���⹰ //////////////////////////////////////////////////////////////////////////////////////////
	//public List retrieveProductList(String adminNo);
	//���⹰ ����Ʈ
	public List ProductList(int intCurPage, int intCount, String adminNo, String cal_mode);
	//���⹰ ����
	public int getProductListCount(String adminNum,String cal_mode);	
	//���⹰ ���� ����
	public ProductBean productInfo(String adminNo,String seq);
    //  ���⹰ �۳⵵ ����� 
    public int getSum_LastYear(String adminNum, String year);
	//�Է�
	public ProductBean insertProduct(ProductBean objProductBean);
	//����
	public ProductBean updateProduct(ProductBean objProductBean);
	//������� ���ϱ�
	public String getProductRate(String add_sum);
	//���㼼 ���ϱ�	
	public int getLicenseTax(float area);
	//�ʱ�ȭ ����Ÿ ���ϱ�
	public Map getInitCal(String gapanNo,String cal_mode);
	
	//���뱸�� ���ϱ�
	public Map getSection(String admin_no);

	// ����� ��󿩺� �˱�
	public Map getTaxtationAt(String gapanNo);
	
	//���俩�� ����
	public void SetCheckYn(String adminNo);
	public void SetTaxYn(String adminNo);
//  �������� �Ѿ� 
    public int getTotalSum(String adminNo);	
	
//	��������
    public DisUseBean disUseInfo(String admin_no);
    public boolean disUseUpdate(DisUseBean disUseBean);    

//  CALCULATION_INFO ������ ������
    public int getCalculationSequence();    
//  ���⹰ �Է�
    public int Cal_Sum_InfoInsert(ProductBean objProductBean);
//  CAL_SUM_INFO ������ ������
    public int getCal_Sum_Seq();    
//	  CAL_SUM_INFO ����
    public int CalSumUpdate(ProductBean objProductBean);
//	  CAL_SUM_INFO
    public ProductBean CalSumInfoInfo(int seq);    
//	�⵵�� first_seq�� seq
    public int getCalSeqbyFirstSeq(String year,String first_seq);    
//	  FORM_ADJUST CAL_SUM_SEQ�� ��������
    public String FormAdjustList(int seq);    
    
//  ���� ���� cal_sum_seq 
    public int get_cal_sum_seq(String year);    
   
//  ���� �ش� ���� �ڷ� �ִ���.
    public int get_calculationCount_mudan(String adminNum,String year);	
    
//  �������� ���ϱ�.
    public Map get_Price(String gapanNo);
    
//	���Ǳ⺻ ������Ʈ
    public void GapanBaseUpdate(GapanBaseBean bean);   

//  �Ϲ� ���� �ϼ� ��������
    public int getTotalPeriod(String admin_no);    
//  ���� ���� ����
    public int getMudanArea(String adminNo);

//	�������� getPrice
	public String getPrice(String adminNo);
	
    public ProductBean getBatchCalculationProductList(String gapan_no,String year);
    
    public int cal_sum_exist(String gapan_no,String year);
    
    // �������� ����
    public void executeDeleteCalTax(String gapanNo,String seq);
    
    // ��ȯ ó��
    public void executeReturnProduct(String gapanNo,String returnDate);
    
    //��� ���� ����
    public String getExistOwner(String gapanNo);
    
    // tax_code ����Ʈ ��������
    public List ExecuteTaxCodeInfo(String TAX_SET, String TAX_CD);
    
	// ������� ���
	public void disuseCancel(String gapanNo);
	
	//********** BEGIN_����_20120222

	public List gapanTaxationInfoSelect(String gapanNo,String seq,String year);

	public List gapanCalculationSelect(String gapanNo,String seq,String year);

	public List gapanCalSumInfoSelect(String gapanNo,String seq,String year);
	//********** END_����_20120222
	//********** BEGIN_����_20120227
    public void executebugwaCancel(String gapanNo,String seq);
	//********** END_����_20120227	   
}