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

import main.java.jumyong.jumyong.dao.IJumyongDao;
import main.java.jumyong.jumyong.model.ConfBean;
import main.java.jumyong.jumyong.model.DisUseBean;
import main.java.jumyong.jumyong.model.InspectBean;
import main.java.jumyong.jumyong.model.PlaceLocationBean;
import main.java.jumyong.jumyong.model.PlaceFileBean;
import main.java.jumyong.jumyong.model.SearchBean;
import main.java.jumyong.jumyong.model.initCalBean;

import main.java.jumyong.jumyong.model.ProductBean;

public class JumyongService implements IJumyongService {
	
	private IJumyongDao objJumyongDao = null;

	public void setJumyongDao(IJumyongDao newJumyongDao) {
	    this.objJumyongDao = newJumyongDao;
	}
	
    //���� ��ȸ
    public List retrieveBoardList(SearchBean objectSearchBean)
    {
    	return objJumyongDao.retrieveBoardList(objectSearchBean);
    }
	
    // ���� ��ȸ Excel
    public List retrieveBoardList_Excel(SearchBean objectSearchBean)
    {
    	return objJumyongDao.retrieveBoardList_Excel(objectSearchBean);
    }
    
//  ���� ��ȸ ����
    public int getProductListCount(SearchBean objectSearchBean)
    {
		return objJumyongDao.getProductListCount(objectSearchBean);
	}
	/*
	public List retrieveProductList(String adminNo)
	{	
		
		return objJumyongDao.retrieveProductList(adminNo);
	}
	*/
    
    
    //�ΰ� ���� ���ϱ� 
    public boolean define_tax_yn(String adminNo, String seq){
    	
    	return objJumyongDao.define_tax_yn(adminNo,seq);
    }
	
    //���� �Է�
	public ProductBean insertProduct(ProductBean objProductBean)
	{
		objJumyongDao.insertProduct(objProductBean);
		return null;
	}

	//���⹰ ���� ����
	public ProductBean productInfo(String seq)
	{
		return objJumyongDao.productInfo(seq);
	}
	
	//���⹰ ����Ʈ
	public List ProductList(int intCurPage, int intCount, String adminNo)
	{
		return objJumyongDao.ProductList(intCurPage,intCount,adminNo);
	}
	
	//	������� ���ϱ�
	public String getProductRate(String add_sum)
	{	
		return objJumyongDao.getProductRate(add_sum) ;
	}	
    //  ���⹰ �۳⵵ ����� 
    public int getSum_LastYear(String adminNum, String year)
    {
    	return objJumyongDao.getSum_LastYear(adminNum,year);
    }
    
    //�������
	public ProductBean updateProduct(ProductBean objProductBean)
	{		
		return objJumyongDao.updateProduct(objProductBean);
	}
	
	//���������Է�
	public InspectBean insertInspect(InspectBean objInspectBean)
	{
		return objJumyongDao.insertInspect(objInspectBean);
	}
	
	//�������� ����Ʈ
	public List retrieveInspectList(int intCurPage, int intCount, String adminNo, String seq)
	{
		return objJumyongDao.retrieveInspectList(intCurPage,intCount,adminNo,seq);
	}
	//�������� ����Ʈ ī��Ʈ
	public int getInspectListCount(String adminNum)
	{
		return objJumyongDao.getInspectListCount(adminNum);
	}
	
	//�������� ������
	public List InspectInfo(String adminNo, String seq)
	{
		return objJumyongDao.InspectInfo(adminNo,seq);
	}
	
	//�������� ����   
	public InspectBean updateInspect(InspectBean objInspectBean)
	{
		return objJumyongDao.updateInspect(objInspectBean);
	}
	
	public List retrieveConfList(int intCurPage, int intCount, String adminNo, String seq)
	{
		return objJumyongDao.retrieveConfList(intCurPage,intCount,adminNo,seq);
	}
	public int getConfListCount(String adminNum)
	{
		return objJumyongDao.getConfListCount(adminNum);
	}
	
	
	public List ConfInfo(String adminNo, String seq)
	{
		return objJumyongDao.ConfInfo(adminNo,seq);
	}
	public ConfBean insertConf(ConfBean objConfBean)
	{
		return objJumyongDao.insertConf(objConfBean);
	}
	public ConfBean updateConf(ConfBean objConfBean)
	{
		return objJumyongDao.updateConf(objConfBean);
	}
	
	public int getProductListCount(String adminNum)
	{
		return objJumyongDao.getProductListCount(adminNum);
	}
	public int getLicenseTax(float area)
	{
		return objJumyongDao.getLicenseTax(area);
	}
	
	public String getYoyul(String adminNo) 
	{
		return objJumyongDao.getYoyul(adminNo);
	}
	// ������� ���ϱ�
	public String getAreaSize(String adminNo)
	{
		return objJumyongDao.getAreaSize(adminNo);
	}
  	
  	 
  	public Map getSection(String admin_no)
  	{
  		return objJumyongDao.getSection(admin_no);
  	}
  	
  	public void SetCheckYn(String adminNo)
  	{
  		objJumyongDao.SetCheckYn(adminNo);
  	}
  	
  	public void SetTaxYn(String adminNo)
  	{
  		objJumyongDao.SetTaxYn(adminNo);
  	}
  	
//  �������� �Ѿ� 
    public int getTotalSum(String adminNo, String seq)
    {
    	return objJumyongDao.getTotalSum(adminNo, seq);
    }
  	
	//��ġ����//////////////////////////////////////////////////////////////////////////////////////////
  	public List retrieveLocatonList(int intCurPage, int intCount, String adminNo)
  	{
  		return objJumyongDao.retrieveLocatonList(intCurPage,intCount,adminNo);
  	}
  	
  	public int getLocationListCount(String adminNum)
  	{
  		return objJumyongDao.getLocationListCount(adminNum);
  	}
  	
	public PlaceLocationBean insertLocation(PlaceLocationBean objLocationBean)
	{
		objJumyongDao.insertLocation(objLocationBean);
		return objLocationBean;
	}
	
	public PlaceLocationBean updateLocation(PlaceLocationBean objLocationBean)
	{
		objJumyongDao.updateLocation(objLocationBean);
		return objLocationBean;		
	}

	public  boolean deleteLocation (int intNum)
	{
		return objJumyongDao.deleteLocation(intNum);
		
	}
	
	
	
	//��������//////////////////////////////////////////////////////////////////////////////////////////
  	public List retrieveFileList(int intCurPage, int intCount, String adminNo)
  	{
  		return objJumyongDao.retrieveFileList(intCurPage,intCount,adminNo);
  	}
  	
  	public int getFileListCount(String adminNum)
  	{
  		return objJumyongDao.getFileListCount(adminNum);
  	}
  	
	public PlaceFileBean insertFile(PlaceFileBean objFileBean)
	{
		objJumyongDao.insertFile(objFileBean);
		return objFileBean;
	}
	
	public PlaceFileBean updateFile(PlaceFileBean objFileBean)
	{
		objJumyongDao.updateFile(objFileBean);
		return objFileBean;		
	}

	public  boolean deleteFile(int intNum)
	{
		return objJumyongDao.deleteFile(intNum);
		
	}
	
	
//  �⵵�� �����㰡�� �������� ī��Ʈ 
    public int getLicenseYnCount(String adminNum, String year)
    {
    	return objJumyongDao.getLicenseYnCount(adminNum,year);
    }
//  �⵵�� �����㰡�� �������� ī��Ʈ 
    public int getProductYnCount(String adminNum, String year)
    {
    	return objJumyongDao.getProductYnCount(adminNum,year);
    }
//	��������
    public DisUseBean disUseInfo(String admin_no)
    {
    	return objJumyongDao.disUseInfo(admin_no);
    }
    public boolean disUseUpdate(DisUseBean disUseBean)
    {
    	return objJumyongDao.disUseUpdate(disUseBean);
    }
    
    public boolean disUseDelete(String adminNo){
    	return objJumyongDao.disUseDelete(adminNo);
    }

//  CALCULATION_INFO ������ ������
    public int getCalculationSequence()
    {
    	return objJumyongDao.getCalculationSequence();
    }
//  ���Һ� �⵵ ���� ����Ʈ
    public List productSubList(String adminNo,String year)
    {
    	return objJumyongDao.productSubList(adminNo,year);
    }
///////////////////////////////////////////////���⹰ �ΰ�
//  ���⹰ �Է�
      public int Cal_Sum_InfoInsert(ProductBean objProductBean)
      {
    	  return objJumyongDao.Cal_Sum_InfoInsert(objProductBean);
      }
//  CAL_SUM_INFO ������ ������
    public int getCal_Sum_Seq()
    {
    	return objJumyongDao.getCal_Sum_Seq();
    }
//	  CAL_SUM_INFO ����
    public int CalSumUpdate(ProductBean objProductBean)
    {
    	return objJumyongDao.CalSumUpdate(objProductBean);
    }
//	  CAL_SUM_INFO ����
    public int CalSumUpdate2(ProductBean objProductBean)
    {
    	return objJumyongDao.CalSumUpdate2(objProductBean);
    }
//	  CAL_SUM_INFO
    public ProductBean CalSumInfoInfo(int seq)
    {
    	return objJumyongDao.CalSumInfoInfo(seq);
    }
//	�⵵�� first_seq�� seq
    public int getCalSeqbyFirstSeq(String year,String first_seq)
    {
    	return objJumyongDao.getCalSeqbyFirstSeq(year,first_seq);
    }
//	  FORM_ADJUST CAL_SUM_SEQ�� ��������
    public String FormAdjustList(int seq)
    {
    	
    	
		List a1 = objJumyongDao.FormAdjustList(seq);
		
		String returnStr = ((ProductBean)a1.get(0)).getFORM_ADJUST();	

		for(int i=1; i<a1.size();i++ )			
		{
			returnStr = returnStr+" + "+((ProductBean)a1.get(i)).getFORM_ADJUST();
		}
		
		//return removeBlank(returnStr);
		return returnStr;
    	
    }
    
    
    
    
    public String removeBlank(String val1)
	{			
		String[] components = val1.split(" ");		
		String returnVal = "";		
		for(int i=0;i<components.length;i++)
			returnVal = returnVal + components[i].toString();
		
		return returnVal;		
	}
    
    
    
    
    
    //  ���� ���� cal_sum_seq 
    public int get_cal_sum_seq(String year)
    {
    	return objJumyongDao.get_cal_sum_seq(year);
    }
    
    public int get_cal_sum_seq2(String adminNo, String seq, String year)
    {
    	return objJumyongDao.get_cal_sum_seq2(adminNo, seq, year);
    }

    
    //�������� getForm
	public String getForm(String adminNo, float reduction_rate)
	{
		List a1 = objJumyongDao.ProductList(1,10,adminNo);
		
		String returnStr = "";
		
		returnStr = ((ProductBean)a1.get(0)).getFORM_ADJUST()+" X ("+reduction_rate+"/100)";
		System.out.println(returnStr);

		for(int i=1; i<a1.size();i++ )			
		{
			returnStr = returnStr + " , " +((ProductBean)a1.get(i)).getFORM_ADJUST()+" X ("+reduction_rate+"/100)";
		}
		return returnStr;
	}
	
	
	//�������� getForm
	public String getForm2(String adminNo)
	{
		String returnStr = "";
		
		System.out.println("111111");
		List a1 = objJumyongDao.ProductList(1,10,adminNo);
		
		System.out.println("111111");
		
		if(a1.size()>0)
		{
			returnStr = "- " +((ProductBean)a1.get(0)).getFORM_ADJUST();
	
			for(int i=1; i<a1.size();i++ )			
			{
				returnStr = returnStr + " - " +((ProductBean)a1.get(i)).getFORM_ADJUST();
				
				System.out.println(returnStr);
			}
		}
		return returnStr;
	}
	
//	�������� getPrice
	public String getPrice(String adminNo)
	{
		List a1 = objJumyongDao.ProductList(1,10,adminNo);
		
		String returnStr = "";
		if(a1.size()>0)
		{
			returnStr = ((ProductBean)a1.get(0)).getYEAR()+"��: "+String.valueOf( ((ProductBean)a1.get(0)).getPRICE());
			for(int i=1; i<a1.size();i++ )			
			{	
				returnStr = returnStr + ", " + ((ProductBean)a1.get(i)).getYEAR()+"��: "+String.valueOf( ((ProductBean)a1.get(i)).getPRICE());
			}		
		}
		  
		return returnStr;
	}
	
	
//  ���� �ش� ���� �ڷ� �ִ���.
    public int get_calculationCount_mudan(String adminNum,String year)
    {
    	return objJumyongDao.get_calculationCount_mudan(adminNum,year);
    }
    
//  �������� ���ϱ�.
    public Map get_Price(String admin_no)
    {
    	return objJumyongDao.get_Price(admin_no);
    }
    
//	  ADMIN_BASE UPDATE		    
    public void Admin_baseUp_dateUpdateQuery(String update,String admin_no)
    {
    	objJumyongDao.Admin_baseUp_dateUpdateQuery(update,admin_no);
    }
    

//	  �������� ����
    public void Delete_Inspect(int seq)
    {
    	objJumyongDao.Delete_Inspect(seq);
    }
    
//	  ���� ���� ����
    public void Delete_Conf(int seq)
    {
    	objJumyongDao.Delete_Conf(seq);
    }
    
//  �Ϲ� ���� �ϼ� ��������
    public int getTotalPeriod(String admin_no)
    {
    	return objJumyongDao.getTotalPeriod(admin_no);
    }
    
//  ���� ���� ����
    public float getMudanArea(String adminNo)
    {
    	return objJumyongDao.getMudanArea(adminNo);
    }
    
    
    // �̷����� list
	public List getHistoryList(String adminNo,int currentPage ,int countPerPage)
	{
    	return objJumyongDao.getHistoryList(adminNo, currentPage , countPerPage);
    }
	
	// �̷����� list count
	public int getHistoryListCount(String adminNo)
	{
    	return objJumyongDao.getHistoryListCount(adminNo);
    }
	
	// �̷����� insert
	public ProductBean insertHistoryInfo(ProductBean objProductBean)
	{
		objJumyongDao.insertHistoryInfo(objProductBean);
		return objProductBean;
	}
	
	// �̷����� ��
	public ProductBean getHistoryView(String ADMIN_NO, String SEQ)
	{
		return objJumyongDao.getHistoryView(ADMIN_NO, SEQ);
	}
	
	// �̷����� insert
	public ProductBean updateHistoryInfo(ProductBean objProductBean)
	{
		objJumyongDao.updateHistoryInfo(objProductBean);
		return objProductBean;
	}
	
	public String getHistoryMaxSeq(ProductBean objProductBean)
    {
    	return objJumyongDao.getHistoryMaxSeq(objProductBean);
    }
	
	public boolean deleteHistoryInfo(String adminNo,String seq){
		return objJumyongDao.deleteHistoryInfo(adminNo,seq);
	}
	
	
	
//	CAL_SUM_INFO ���̺� ���� �߰� ������Ʈ		 
    public int CalSumAddUpdate(ProductBean objProductBean)
    {    	
    	return objJumyongDao.CalSumAddUpdate(objProductBean);
    }  
    
//	SUM_ADJUST, AREA_AFTER �հ� SUM_SEQ��
    public int SumBysumSeq(String admin_no, String seq)
    {
    	return objJumyongDao.SumBysumSeq(admin_no, seq);
    }
    
    public String getCheck_yn(String adminNo) 
	{
		return objJumyongDao.getCheck_yn(adminNo);
	}
    // ������ �հ� ��������
    public String getWITH_SUM_PRICE(String adminNo) 
	{
		return objJumyongDao.getWITH_SUM_PRICE(adminNo);
	}
    
  //���⹰ ���� ����
	public ProductBean productInfo_Admin(String seq , String adminNo)
	{
		return objJumyongDao.productInfo_Admin(seq , adminNo);
	}
	
	// �����հ� ����
	public void DeleteCalSumInfo(String adminNo, String Cal_Sum_Seq, String Year){
		objJumyongDao.DeleteCalSumInfo(adminNo, Cal_Sum_Seq, Year);
	}
	
	// ���� ����
	public void DeleteCalculatioInfo(String adminNo, String Seq, String Year){
		objJumyongDao.DeleteCalculatioInfo(adminNo, Seq, Year);
		
	}
	
	// �����հ� ����
	public void DeleteTaxationInfo(String adminNo, String Cal_Sum_Seq, String Year){
		objJumyongDao.DeleteTaxationInfo(adminNo, Cal_Sum_Seq, Year);
	}
	
	// ����ĵ� ���ϱ�
	public List getFormAdjust(String adminNo, String calSumSeq){
		return objJumyongDao.getFormAdjust(adminNo, calSumSeq);
		
	}
	
	// ���� ��ȸ ����
	public int getCountCalculationInfo(String adminNo, String cal_sum_seq){
		return objJumyongDao.getCountCalculationInfo(adminNo, cal_sum_seq);
	}
	
	// ������� ���ϱ�
	public String getPurposeCd(String adminNo){
		return objJumyongDao.getPurposeCd(adminNo);
	}
	
	// ������ admin_base check_yn ��ȭ
	public void updateAdminBaseCheckYN(String adminNo){
		objJumyongDao.updateAdminBaseCheckYN(adminNo);
	}
	
	// ���뱸�� ��������
	public String getUseType(String adminNo){
		return objJumyongDao.getUseType(adminNo);
	}
	
	// ������, ������ ���ϱ� 
	public Map getReduction(String adminNo){
		return objJumyongDao.getReduction(adminNo);
	}
	
	// ������ ��հ������� ���� �⺻���� ���ϱ�
	public Map getWithAddrInfo(String adminNo){
		return objJumyongDao.getWithAddrInfo(adminNo);
	}
	
	// �����հ��� max year ��������
	public String getMaxYear(String adminNo,String cal_sum_seq){
		return objJumyongDao.getMaxYear(adminNo,cal_sum_seq);
	}
	
	// ���� �ʱⵥ���� ���ϱ�
	public initCalBean getInitCalData(String adminNo){
		return objJumyongDao.getInitCalData(adminNo);
	}
	
	// �������� �ּҸ���Ʈ �ҷ�����
	public List getPriceList(String adminNo,String year){
		return objJumyongDao.getPriceList(adminNo, year);
	}

}