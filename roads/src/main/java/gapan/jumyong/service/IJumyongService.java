/*********************************************************************************************************
 				*�����ۼ��� : 2006.07.12
				*�����ۼ��� : jklee, jhlee
				*�ֿ�ó������ : Q&A�Խ��� ���� db�۾��� ó��
				*������ :
				*������ :
				*�������� :
 *********************************************************************************************************/

package main.java.gapan.jumyong.service;

import java.util.List;
import java.util.Map;


import main.java.gapan.jumyong.model.GapanInfoBean;
import main.java.gapan.jumyong.model.GapanHeadBean;
import main.java.gapan.jumyong.model.GapanBaseBean;
import main.java.gapan.jumyong.model.ConfBean;
import main.java.gapan.jumyong.model.DisUseBean;
import main.java.gapan.jumyong.model.InspectBean;
import main.java.gapan.jumyong.model.PlaceFileBean;
import main.java.gapan.jumyong.model.PlaceLocationBean;
import main.java.gapan.jumyong.model.ProductBean;
import main.java.gapan.jumyong.model.SaleBean;
import main.java.gapan.jumyong.model.SearchBean;

/**
 * ���� ���� ���� �������̽�.
 * @author jklee, jhlee
 *
 */
public interface IJumyongService{
	
    public	String	executeCheck_Gapanno(String gapanNo);
    
    /**
     * ���� BASE ���
     * @param Bean
     * @return
     */
    public	boolean	executeGapan_Base_Register(GapanBaseBean Bean);

    /**
     * ���� ���, ������ ���� ���
     * @param Bean
     * @return
     */
    public	boolean	executeGapan_Head_Register(GapanHeadBean Bean);
   
    /**
     * GAPAN_INFO  ���̺� ���
     * @param Bean
     * @return
     */
    public	boolean	executeGapan_Info_Register(GapanInfoBean Bean);

    /**
     *  Only Seoul administrator registers.
     *  Write jumin info and a few jumji_info(nullable: no)  
     * @param Bean
     * @return
     */
    public boolean executeGapan_Info_Register_Seoulonly(GapanInfoBean Bean);
    
    /**
     * ���ܼ��Ժΰ����� �Է�
     * @param objProductBean
     * @return
     */
    public boolean executeBugwa_Register(ProductBean objProductBean);
    
    /**
     * ���ܼ��Ժΰ����� ����
     * @param objProductBean
     * @return
     */
    public boolean updateBugwa_Register(ProductBean objProductBean);
    
	/**
	 * ���/�Ű� ����Ʈ
	 * @param gapanNo
	 * @return
	 */
	public List ProductSaleList(String gapanNo);
	
	/**
	 * ���/�Ű� ����
	 * @param gapanNo
	 * @return
	 */
	public int getProductSaleListCount(String gapanNo);	
	
    /**
     * ���/�Ű� ����
     * @param gapanNo
     */
    public void executeDeleteProductSale(String gapanNo);
    
    /**
     * ���Ű� ���
     * @param objSaleBean
     * @return
     */
    public boolean UpdateSale_Register(SaleBean objSaleBean);
    
    /**
     * ���Ű� ����
     * @param objSaleBean
     * @return
     */
    public boolean ExecuteSale_Register(SaleBean objSaleBean);
    
	/**
	 * ������� ���
	 * @param gapanNo
	 */
	public void disuseCancel(String gapanNo);
	
	/**
	 * �̷����� insert
	 * @param objProductBean
	 * @return
	 */
	public ProductBean insertHistoryInfo(ProductBean objProductBean);
	
	/**
	 * History_info ������ seq ����
	 * @param objProductBean
	 * @return
	 */
	public String getHistoryMaxSeq(ProductBean objProductBean);
    
    /**
     * ���� ��ȸ
     * @param objectSearchBean
     * @return
     */
    public List retrieveBoardList(SearchBean objectSearchBean);

    /**
     * ���� ��ȸ ���� ��ȯ
     * @param objectSearchBean
     * @return
     */
    public List retrieveBoardListExcel(SearchBean objectSearchBean);
    
    /**
     * ���� ��ȸ ����
     * @param objectSearchBean
     * @return
     */
    public int getProductListCount(SearchBean objectSearchBean);
    
	//���⹰ //////////////////////////////////////////////////////////////////////////////////////////
	//public List retrieveProductList(String adminNo);
	
	/**
	 * ���⹰ ����Ʈ
	 * @param intCurPage
	 * @param intCount
	 * @param adminNo
	 * @param cal_mode
	 * @return
	 */
	public List ProductList(int intCurPage, int intCount, String adminNo, String cal_mode);
	
	/**
	 * ���⹰ ����
	 * @param adminNum
	 * @param cal_mode
	 * @return
	 */
	public int getProductListCount(String adminNum,String cal_mode);	
	
	/**
	 * ���⹰ ���� ����
	 * @param adminNo
	 * @param seq
	 * @return
	 */
	public ProductBean productInfo(String adminNo,String seq);
	
    /**
     * ���⹰ �۳⵵ �����
     * @param adminNum
     * @param year
     * @return
     */
    public int getSum_LastYear(String adminNum, String year);
	
	/**
	 * �Է�
	 * @param objProductBean
	 * @return
	 */
	public ProductBean insertProduct(ProductBean objProductBean);
	
	/**
	 * ����
	 * @param objProductBean
	 * @return
	 */
	public ProductBean updateProduct(ProductBean objProductBean);
	
	/**
	 * ������� ���ϱ�
	 * @param add_sum
	 * @return
	 */
	public String getProductRate(String add_sum);
		
	/**
	 * ���㼼 ���ϱ�
	 * @param area
	 * @return
	 */
	public int getLicenseTax(float area);
	
	/**
	 * �ʱ�ȭ ����Ÿ ���ϱ�
	 * @param gapanNo
	 * @param cal_mode
	 * @return
	 */
	public Map getInitCal(String gapanNo,String cal_mode);
	
	/**
	 * ���뱸�� ���ϱ�
	 * @param admin_no
	 * @return
	 */
	public Map getSection(String admin_no);
	
	/**
	 * ���俩�� ����
	 * @param adminNo
	 */
	public void SetCheckYn(String adminNo);
	
	/**
	 * �������� ����.
	 * @param adminNo
	 */
	public void SetTaxYn(String adminNo);
	
    /**
     * �������� �Ѿ�
     * @param adminNo
     * @return
     */
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
    
    /**
     * �������� ���ϱ�.
     * @param gapanNo
     * @return
     */
    public Map get_Price(String gapanNo);
    		    
    /**
     * ADMIN_BASE UPDATE
     * @param update
     * @param admin_no
     */
    public void Admin_baseUp_dateUpdateQuery(String update,String admin_no);   

    /**
     * �������� ����
     * @param seq
     */
    public void Delete_Inspect(int seq);    

    /**
     * ���� ���� ����
     * @param seq
     */
    public void Delete_Conf(int seq);
    
    /**
     * �Ϲ� ���� �ϼ� ��������
     * @param admin_no
     * @return
     */
    public int getTotalPeriod(String admin_no);    

    /**
     * ���� ���� ����
     * @param adminNo
     * @return
     */
    public int getMudanArea(String adminNo);

	/**
	 * �������� getPrice
	 * @param adminNo
	 * @return
	 */
	public String getPrice(String adminNo);
	
	// ���ݻ��� ����Ʈ
    public int  getVioTotalCount(ProductBean objProductBean);
    public List getVioTotalList(ProductBean objProductBean, int intCount , int intCurPage);
    public ProductBean violationRegisterPrc(ProductBean objProductBean);
    public ProductBean getViolationView(String gapanNo, String seq);
    public int violationCheck(ProductBean objProductBean);
    public ProductBean violationUpdate(ProductBean objProductBean);
    
    public ProductBean getBatchCalculationProductList(String gapan_no,String year);
    
    public ProductBean getCalculationItem(String year, String gapanNo);
    
    public int cal_sum_exist(String gapan_no,String year, String cal_mode);
    
    /**
     * �������� ����
     * @param gapanNo
     * @param seq
     * @return
     */
    public int executeDeleteCalTax(String gapanNo,String seq);
    
    public List getCalculationDate(String gapanNo,String calMode);
    
    public ProductBean getViolationAddInfo(String gapanNo);
    
    public Map getGiganPoint(String gapanNo);
    
    public void deleteViolationInfo(String gapanNo, String seq);
    
    
    public void executeGiganUpdate(String gapanNo, String mul_fromdate, String mul_todate);
    
//  ��¹� ���� ���
    public Map get_DocInfo(String gapanNo);
    
    
    
}