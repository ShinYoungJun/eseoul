/*********************************************************************************************************
 				*�����ۼ��� : 2006.07.12
				*�����ۼ��� : jklee, jhlee
				*�ֿ�ó������ : QA�Խ��� ���� db�۾��� ó��
				*������ :
				*������ :
				*�������� :
 *********************************************************************************************************/

package main.java.gapan.jumyong.dao;

import main.java.gapan.jumyong.model.ConfBean;
import main.java.gapan.jumyong.model.DisUseBean;
import main.java.gapan.jumyong.model.GapanBaseBean;
import main.java.gapan.jumyong.model.GapanHeadBean;
import main.java.gapan.jumyong.model.GapanInfoBean;
import main.java.gapan.jumyong.model.InspectBean;
import main.java.gapan.jumyong.model.PlaceLocationBean;
import main.java.gapan.jumyong.model.PlaceFileBean;
import main.java.gapan.jumyong.model.ProductBean;
import main.java.gapan.jumyong.model.SaleBean;
import main.java.gapan.jumyong.model.SearchBean;
import main.java.gapan.jumyong.model.jumregBean;


import java.util.List;
import java.util.Map;

import org.springframework.dao.DataAccessException;

public interface IJumyongDao {	
	
	public	String	executeCheck_Gapanno(String gapanNo);
	//���� BASE ���� ���
    public	boolean	executeGapan_Base_Register(GapanBaseBean Bean);
	//���� ���, ������ ���� ���
    public	boolean	executeGapan_Head_Register(GapanHeadBean Bean);
	
    //	GAPAN_INFO  ���̺� ���
    public	boolean	executeGapan_Info_Register(GapanInfoBean Bean);
    
    // ����ø� �ű� ���
    public	boolean	executeGapan_Info_Register_Seoulonly(GapanInfoBean Bean);
    
    //���ܼ��Ժΰ����� ����
    public boolean updateBugwa_Register(ProductBean objProductBean);
    //���ܼ��Ժΰ����� �Է�
    public boolean executeBugwa_Register(ProductBean objProductBean);
    
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
    
    
    
	// �̷����� insert
	public ProductBean insertHistoryInfo(ProductBean objProductBean);
	//History_info ������ seq ����
	public String getHistoryMaxSeq(ProductBean objProductBean);
    //���� ��ȸ ����
    public List retrieveBoardList(SearchBean objectSearchBean);
	//���� ��ȸ ���� ��ȯ
    public List retrieveBoardListExcel(SearchBean objectSearchBean);
    //���� ��ȸ
    public int getProductListCount(SearchBean objectSearchBean);
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
	//���俩�� ����
	public void SetCheckYn(String adminNo);
	public void SetTaxYn(String adminNo);
//  �������� �Ѿ� 
    public int getTotalSum(String adminNo);
	
	//��������//////////////////////////////////////////////////////////////////////////////////////////	
	public InspectBean insertInspect(InspectBean objInspectBean);
	public List retrieveInspectList(int intCurPage, int intCount, String adminNo);
	public int getInspectListCount(String adminNum);
	public List InspectInfo(String adminNo, String seq);	
	public InspectBean updateInspect(InspectBean objInspectBean);
	
	//��������//////////////////////////////////////////////////////////////////////////////////////////
	public List retrieveConfList(int intCurPage, int intCount, String adminNo, String gp_typ);
	public int getConfListCount(String adminNum);
	public List ConfInfo(String adminNo, String seq, String gp_typ);
	public ConfBean insertConf(ConfBean objConfBean);
	public ConfBean updateConf(ConfBean objConfBean);
	
	//��ġ����//////////////////////////////////////////////////////////////////////////////////////////
	public List retrieveLocatonList(int intCurPage, int intCount, String adminNo);
	public int getLocationListCount(String adminNum);
	public PlaceLocationBean insertLocation(PlaceLocationBean objLocationBean);
	public PlaceLocationBean updateLocation(PlaceLocationBean objLocationBean);
	public  boolean deleteLocation (int intNum);
	
	//��������//////////////////////////////////////////////////////////////////////////////////////////
	public List retrieveFileList(int intCurPage, int intCount, String adminNo);
	public int getFileListCount(String adminNum);
	public PlaceFileBean insertFile(PlaceFileBean objFileBean);
	public PlaceFileBean updateFile(PlaceFileBean objFileBean);
	public  boolean deleteFile(int intNum);
	
	
//  �⵵�� �����㰡�� �������� ī��Ʈ 
    public int getLicenseYnCount(String adminNum, String year);
//  �⵵�� �����㰡�� �������� ī��Ʈ 
    public int getProductYnCount(String adminNum, String year);    
//	��������
    public DisUseBean disUseInfo(String admin_no);
    public boolean disUseUpdate(DisUseBean disUseBean);


//  CALCULATION_INFO ������ ������
    public int getCalculationSequence();
    
//  ���Һ� �⵵ ���� ����Ʈ
    public List productSubList(String adminNo,String year);
    
///////////////////////////////////////////////���⹰ �ΰ�
//���⹰ �Է�
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
    public List FormAdjustList(int seq);    
    
    
//  ���� ���� cal_sum_seq 
    public int get_cal_sum_seq(String year);    
//  ���� �ش� ���� �ڷ� �ִ���.
    public int get_calculationCount_mudan(String adminNum,String year);
    
//  �������� ���ϱ�.
    public Map get_Price(String gapanNo);    
    
//	  ADMIN_BASE UPDATE		    
    public void Admin_baseUp_dateUpdateQuery(String update,String admin_no);    

//	  �������� ����
    public void Delete_Inspect(int seq);
//	  ���� ���� ����
    public void Delete_Conf(int seq);

//  �Ϲ� ���� �ϼ� ��������
    public int getTotalPeriod(String admin_no);
//  ���� ���� ����
    public int getMudanArea(String adminNo);    
    
    // ���ݻ��� ����Ʈ
    public int getVioTotalCount(ProductBean objProductBean);
    public List getVioTotalList(ProductBean objProductBean, int intCount , int intCurPage);
    public ProductBean violationRegisterPrc(ProductBean objProductBean);
    public ProductBean getViolationView(String gapanNo, String seq);
    public int violationCheck(ProductBean objProductBean);

    public ProductBean violationUpdate(ProductBean objProductBean);
    
    public ProductBean getBatchCalculationProductList(String gapan_no,String year);
    
    public ProductBean getCalculationItem(String year, String gapanNo);
    
    public int cal_sum_exist(String gapan_no,String year, String cal_mode);
    

    
    // �������� ����
    public int executeDeleteCalTax(String gapanNo,String seq);
    
    //���� ���� �� ����� ����� ����� ��� ��������
    public List getCalculationDate(String gapanNo,String calMode);
    
    public ProductBean getViolationAddInfo(String gapanNo);
    
    public Map getGiganPoint(String gapanNo);
    
    public void deleteViolationInfo(String gapanNo, String seq);
    
    public void executeGiganUpdate(String gapanNo, String mul_fromdate, String mul_todate);
    
//  ��¹� ���� ���
    public Map get_DocInfo(String gapanNo);
 // ������� ���
	public void disuseCancel(String gapanNo);
}