/*********************************************************************************************************
 				*�����ۼ��� : 2006.07.12
				*�����ۼ��� : jklee, jhlee
				*�ֿ�ó������ : Q&A�Խ��� ���� db�۾��� ó��
				*������ :
				*������ :
				*�������� :
 *********************************************************************************************************/

package main.java.jumyong.jumyong.service;

import java.util.List;
import java.util.Map;

import org.springframework.dao.DataAccessException;

import main.java.jumyong.jumyong.model.ConfBean;
import main.java.jumyong.jumyong.model.DisUseBean;
import main.java.jumyong.jumyong.model.InspectBean;
import main.java.jumyong.jumyong.model.PlaceFileBean;
import main.java.jumyong.jumyong.model.PlaceLocationBean;
import main.java.jumyong.jumyong.model.ProductBean;
import main.java.jumyong.jumyong.model.SearchBean;
import main.java.jumyong.jumyong.model.initCalBean;

public interface IJumyongService{	
	//public List retrieveBoardList(int intCurPage, String fromDate ,String toDate,String type, String section,String tax_set,String check_yn
    //		,String bj_cd,String hj_cd,String bonbun, String bubun,String numberValue,String jumyongName,String purpose);
    //���� ��ȸ
    public List retrieveBoardList(SearchBean objectSearchBean);
    
    //���� ��ȸ Excel
    public List retrieveBoardList_Excel(SearchBean objectSearchBean);
    
    //���� ��ȸ ����
    public int getProductListCount(SearchBean objectSearchBean);
	//���⹰ //////////////////////////////////////////////////////////////////////////////////////////
	//public List retrieveProductList(String adminNo);
	//���⹰ ����Ʈ
	public List ProductList(int intCurPage, int intCount, String adminNo);
	//���⹰ ����
	public int getProductListCount(String adminNum);	
	//���⹰ ���� ����
	public ProductBean productInfo(String seq);
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
	//���� ���ϱ�
	public String getYoyul(String adminNo);
	//������� ���ϱ�
	public String getAreaSize(String adminNo);
	//�ΰ� ���� ���ϱ�
	public boolean define_tax_yn(String adminNo, String seq);
	
	//���뱸�� ���ϱ�
	public Map getSection(String admin_no);
	//���俩�� ����
	public void SetCheckYn(String adminNo);
	public void SetTaxYn(String adminNo);
//  �������� �Ѿ� 
    public int getTotalSum(String adminNo, String seq);	
	
	//��������//////////////////////////////////////////////////////////////////////////////////////////	
	public InspectBean insertInspect(InspectBean objInspectBean);
	public List retrieveInspectList(int intCurPage, int intCount, String adminNo, String seq);
	public int getInspectListCount(String adminNum);
	public List InspectInfo(String adminNo, String seq);	
	public InspectBean updateInspect(InspectBean objInspectBean);
	
	//��������//////////////////////////////////////////////////////////////////////////////////////////
	public List retrieveConfList(int intCurPage, int intCount, String adminNo, String seq);
	public int getConfListCount(String adminNum);
	public List ConfInfo(String adminNo, String seq);
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
    public boolean disUseDelete(String adminNo);  



//  CALCULATION_INFO ������ ������
    public int getCalculationSequence();    
//  ���Һ� �⵵ ���� ����Ʈ
    public List productSubList(String adminNo,String year);  
///////////////////////////////////////////////���⹰ �ΰ�
//  ���⹰ �Է�
      public int Cal_Sum_InfoInsert(ProductBean objProductBean);
//  CAL_SUM_INFO ������ ������
    public int getCal_Sum_Seq();    
//	  CAL_SUM_INFO ����
    public int CalSumUpdate(ProductBean objProductBean);
//	  CAL_SUM_INFO ����
    public int CalSumUpdate2(ProductBean objProductBean);
//	  CAL_SUM_INFO
    public ProductBean CalSumInfoInfo(int seq);    
//	�⵵�� first_seq�� seq
    public int getCalSeqbyFirstSeq(String year,String first_seq);    
//	  FORM_ADJUST CAL_SUM_SEQ�� ��������
    public String FormAdjustList(int seq);    
    
//  ���� ���� cal_sum_seq 
    public int get_cal_sum_seq(String year);    

//  ���� ���� cal_sum_seq 
    public int get_cal_sum_seq2(String adminNo, String seq, String year); 

    
//	�������� getForm
    public String getForm(String adminNo, float reduction_rate);

//  ���� �ش� ���� �ڷ� �ִ���.
    public int get_calculationCount_mudan(String adminNum,String year);	
    
//  �������� ���ϱ�.
    public Map get_Price(String admin_no);
    
//	  ADMIN_BASE UPDATE		    
    public void Admin_baseUp_dateUpdateQuery(String update,String admin_no);   


//	  �������� ����
    public void Delete_Inspect(int seq);    
//	  ���� ���� ����
    public void Delete_Conf(int seq);
    
//  �Ϲ� ���� �ϼ� ��������
    public int getTotalPeriod(String admin_no);    
//  ���� ���� ����
    public float getMudanArea(String adminNo);    
    
	//�������� getForm
	public String getForm2(String adminNo);
//	�������� getPrice
	public String getPrice(String adminNo);
	
	// �̷����� list
	public List getHistoryList(String adminNo ,int currentPage ,int countPerPage);
	// �̷����� list count
	public int getHistoryListCount(String adminNo);
	// �̷����� insert
	public ProductBean insertHistoryInfo(ProductBean objProductBean);
	// �̷����� ��
	public ProductBean getHistoryView(String ADMIN_NO, String SEQ);	
	public ProductBean updateHistoryInfo(ProductBean objProductBean);
	public String getHistoryMaxSeq(ProductBean objProductBean);
	
	public boolean deleteHistoryInfo(String adminNo,String seq);
	
	
	
	
	
	
	
	
	
//	CAL_SUM_INFO ���̺� ���� �߰� ������Ʈ		 
    public int CalSumAddUpdate(ProductBean objProductBean);    
	
//	SUM_ADJUST, AREA_AFTER �հ� SUM_SEQ��
    public int SumBysumSeq(String admin_no, String seq);  
	
    // check_yn ��������    
    public String getCheck_yn(String adminNo);
    
    // ������ �հ� ��������
    public String getWITH_SUM_PRICE(String adminNo);
    
    public ProductBean productInfo_Admin(String seq, String adminNo);
    
 // �����հ� ����
	public void DeleteCalSumInfo(String adminNo, String Cal_Sum_Seq, String Year);
	
	// ���� ����
	public void DeleteCalculatioInfo(String adminNo, String Seq, String Year);
	
	// �����հ� ����
	public void DeleteTaxationInfo(String adminNo, String Cal_Sum_Seq, String Year);
	
	// ����ĵ� ���ϱ�
	public List getFormAdjust(String adminNo, String calSumSeq);
	
	// ���� ��ȸ ����
	public int getCountCalculationInfo(String adminNo, String cal_sum_seq);
	
	// ������� ���ϱ�
	public String getPurposeCd(String adminNo);
	
	// ������ admin_base check_yn ��ȭ
	public void updateAdminBaseCheckYN(String adminNo);
	
	// ���뱸�� ��������
	public String getUseType(String adminNo);
	
	// ������, ������ ���ϱ� 
	public Map getReduction(String adminNo);
	
	// ������ ��հ������� ���� �⺻���� ���ϱ�
	public Map getWithAddrInfo(String adminNo);
	
	// �����հ��� max year ��������
	public String getMaxYear(String adminNo,String cal_sum_seq);
	
	// ���� �ʱⵥ���� ���ϱ�
	public initCalBean getInitCalData(String adminNo);
	
	// �������� �ּҸ���Ʈ �ҷ�����
	public List getPriceList(String adminNo, String year);
		
}