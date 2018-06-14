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

import main.java.gapan.jumyong.model.GapanBaseBean;
import main.java.gapan.jumyong.dao.IJumyongDao;
import main.java.gapan.jumyong.model.ConfBean;
import main.java.gapan.jumyong.model.DisUseBean;
import main.java.gapan.jumyong.model.GapanHeadBean;
import main.java.gapan.jumyong.model.GapanInfoBean;
import main.java.gapan.jumyong.model.InspectBean;
import main.java.gapan.jumyong.model.PlaceLocationBean;
import main.java.gapan.jumyong.model.PlaceFileBean;
import main.java.gapan.jumyong.model.SaleBean;
import main.java.gapan.jumyong.model.SearchBean;

import main.java.gapan.jumyong.model.ProductBean;

public class JumyongService implements IJumyongService {
	
	private IJumyongDao objJumyongDao = null;
	
    public	String	executeCheck_Gapanno(String gapanNo){
    	return objJumyongDao.executeCheck_Gapanno(gapanNo);
    }
	
    public	boolean	executeGapan_Base_Register(GapanBaseBean Bean){
    	return objJumyongDao.executeGapan_Base_Register(Bean);
    }
	//���� ���, ������ ���� ���
    public	boolean	executeGapan_Head_Register(GapanHeadBean Bean){
    	return objJumyongDao.executeGapan_Head_Register(Bean);
    }
    //	GAPAN_INFO  ���̺� ���
    public	boolean	executeGapan_Info_Register(GapanInfoBean Bean){
    	return objJumyongDao.executeGapan_Info_Register(Bean);
    }
    
    public boolean executeGapan_Info_Register_Seoulonly(GapanInfoBean Bean){
    	return objJumyongDao.executeGapan_Info_Register_Seoulonly(Bean);
    }
    
  //���ܼ��Ժΰ����� ����
    public boolean updateBugwa_Register(ProductBean objProductBean){
    	return objJumyongDao.updateBugwa_Register(objProductBean);
    }
    //���ܼ��Ժΰ����� �Է�
    public boolean executeBugwa_Register(ProductBean objProductBean)
	{
    	return objJumyongDao.executeBugwa_Register(objProductBean);
    }
    
  //���/�Ű� ����Ʈ
	public List ProductSaleList(String gapanNo){
		return objJumyongDao.ProductSaleList(gapanNo);
	}
	//���/�Ű� ����
	public int getProductSaleListCount(String gapanNo){
		return objJumyongDao.getProductSaleListCount(gapanNo);
	}
	// ���/�Ű� ����
    public void executeDeleteProductSale(String gapanNo){
    	objJumyongDao.executeDeleteProductSale(gapanNo);
    	
    }
    
    
    //���Ű� ���
    public boolean UpdateSale_Register(SaleBean objSaleBean){
    	return objJumyongDao.UpdateSale_Register(objSaleBean);
    }
    
    //���Ű� ����
    public boolean ExecuteSale_Register(SaleBean objSaleBean){
    	return objJumyongDao.ExecuteSale_Register(objSaleBean);
    }
	
	
	// ������� ���
	public void disuseCancel(String gapanNo) {
		objJumyongDao.disuseCancel(gapanNo);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	public void setGapan_jumyongDao(IJumyongDao newJumyongDao) {
	    this.objJumyongDao = newJumyongDao;
	}
	
	//History_info ������ seq ����
	public String getHistoryMaxSeq(ProductBean objProductBean)
    {
    	return objJumyongDao.getHistoryMaxSeq(objProductBean);
    }
	
	// �̷����� insert
	public ProductBean insertHistoryInfo(ProductBean objProductBean)
	{
		objJumyongDao.insertHistoryInfo(objProductBean);
		return objProductBean;
	}
	
    //���� ��ȸ
    public List retrieveBoardList(SearchBean objectSearchBean)
    {
    	return objJumyongDao.retrieveBoardList(objectSearchBean);
    }
    
  //���� ��ȸ ���� ��ȯ
    public List retrieveBoardListExcel(SearchBean objectSearchBean)
    {
    	return objJumyongDao.retrieveBoardListExcel(objectSearchBean);
    }
	
//  ���� ��ȸ ����
    public int getProductListCount(SearchBean objectSearchBean)
    {
		return objJumyongDao.getProductListCount(objectSearchBean);
	}
	
	public ProductBean insertProduct(ProductBean objProductBean)
	{
		objJumyongDao.insertProduct(objProductBean);
		return null;
	}
	
	public ProductBean productInfo(String adminNo,String seq)
	{
		return objJumyongDao.productInfo(adminNo,seq);
	}
	
	public List ProductList(int intCurPage, int intCount, String adminNo, String cal_mode)
	{
		return objJumyongDao.ProductList(intCurPage,intCount,adminNo,cal_mode);
	}
	
	public String getProductRate(String add_sum)
	{	
		return objJumyongDao.getProductRate(add_sum) ;
	}	
    //  ���⹰ �۳⵵ ����� 
    public int getSum_LastYear(String adminNum, String year)
    {
    	return objJumyongDao.getSum_LastYear(adminNum,year);
    }
	public ProductBean updateProduct(ProductBean objProductBean)
	{		
		return objJumyongDao.updateProduct(objProductBean);
	}
	
	public InspectBean insertInspect(InspectBean objInspectBean)
	{
		return objJumyongDao.insertInspect(objInspectBean);
	}
	
	public List retrieveInspectList(int intCurPage, int intCount, String adminNo)
	{
		return objJumyongDao.retrieveInspectList(intCurPage,intCount,adminNo);
	}
	
	public int getInspectListCount(String adminNum)
	{
		return objJumyongDao.getInspectListCount(adminNum);
	}
	
	public List InspectInfo(String adminNo, String seq)
	{
		return objJumyongDao.InspectInfo(adminNo,seq);
	}
	public InspectBean updateInspect(InspectBean objInspectBean)
	{
		return objJumyongDao.updateInspect(objInspectBean);
	}
	
	public List retrieveConfList(int intCurPage, int intCount, String adminNo, String gp_typ)
	{
		return objJumyongDao.retrieveConfList(intCurPage,intCount,adminNo, gp_typ);
	}
	public int getConfListCount(String adminNum)
	{
		return objJumyongDao.getConfListCount(adminNum);
	}
	
	
	public List ConfInfo(String adminNo, String seq, String gp_typ)
	{
		return objJumyongDao.ConfInfo(adminNo, seq, gp_typ);
	}
	public ConfBean insertConf(ConfBean objConfBean)
	{
		return objJumyongDao.insertConf(objConfBean);
	}
	public ConfBean updateConf(ConfBean objConfBean)
	{
		return objJumyongDao.updateConf(objConfBean);
	}
	
	public int getProductListCount(String adminNum,String cal_mode)
	{
		return objJumyongDao.getProductListCount(adminNum,cal_mode);
	}
	public int getLicenseTax(float area)
	{
		return objJumyongDao.getLicenseTax(area);
	}
	
	//�ʱ�ȭ ����Ÿ ���ϱ�
	public Map getInitCal(String gapanNo,String cal_mode)
    {
    	return objJumyongDao.getInitCal(gapanNo,cal_mode);
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
    public int getTotalSum(String adminNo)
    {
    	return objJumyongDao.getTotalSum(adminNo);
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
    
//	�������� getPrice
	public String getPrice(String adminNo)
	{
		List a1 = objJumyongDao.ProductList(1,10,adminNo,"2");
		
		String returnStr = "";
		
		returnStr = ((ProductBean)a1.get(0)).getYEAR()+"��: "+String.valueOf( ((ProductBean)a1.get(0)).getPRICE());
		
		System.out.println("price"+returnStr);

		for(int i=1; i<a1.size();i++ )			
		{
			
			returnStr = returnStr + ", " + ((ProductBean)a1.get(i)).getYEAR()+"��: "+String.valueOf( ((ProductBean)a1.get(i)).getPRICE());
			
			
		}
		
		System.out.println("price"+returnStr);
		
		return returnStr;
	}
	
	
//  ���� �ش� ���� �ڷ� �ִ���.
    public int get_calculationCount_mudan(String adminNum,String year)
    {
    	return objJumyongDao.get_calculationCount_mudan(adminNum,year);
    }
    
//  �������� ���ϱ�.
    public Map get_Price(String gapanNo)
    {
    	return objJumyongDao.get_Price(gapanNo);
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
    public int getMudanArea(String adminNo)
    {
    	return objJumyongDao.getMudanArea(adminNo);
    }
    
    // ���ݻ��� ����Ʈ
    public int getVioTotalCount(ProductBean objProductBean)
    {
    	return objJumyongDao.getVioTotalCount(objProductBean);
    }
    
    public List getVioTotalList(ProductBean objProductBean, int intCount , int intCurPage)
    {
    	return objJumyongDao.getVioTotalList(objProductBean,intCount,intCurPage);
    }
    
    public ProductBean violationRegisterPrc(ProductBean objProductBean)
	{
    	return objJumyongDao.violationRegisterPrc(objProductBean);
    }
    
    public ProductBean getViolationView(String gapanNo, String seq)
	{
    	return objJumyongDao.getViolationView(gapanNo, seq);
    }
    
    public int violationCheck(ProductBean objProductBean)
    {
    	return objJumyongDao.violationCheck(objProductBean);
    }
    
    public ProductBean violationUpdate(ProductBean objProductBean)
	{
    	return objJumyongDao.violationUpdate(objProductBean);
    }
    
    public ProductBean getBatchCalculationProductList(String gapan_no,String year){
    	return objJumyongDao.getBatchCalculationProductList(gapan_no,year);
    }
    
    public ProductBean getCalculationItem(String year, String gapanNo) {
    	return objJumyongDao.getCalculationItem(year, gapanNo);
    }
    
    public int cal_sum_exist(String gapan_no,String year, String cal_mode){
    	
    	return objJumyongDao.cal_sum_exist(gapan_no, year, cal_mode);
    }
    

    
    // �������� ����
    public int executeDeleteCalTax(String gapanNo,String seq){
    	return objJumyongDao.executeDeleteCalTax(gapanNo,seq);
    }
    
    public List getCalculationDate(String gapanNo,String calMode){
    	return objJumyongDao.getCalculationDate(gapanNo, calMode);
    }
    
    
    public ProductBean getViolationAddInfo(String gapanNo){
    	return objJumyongDao.getViolationAddInfo(gapanNo);
    }
    
    public Map getGiganPoint(String gapanNo){
    	return objJumyongDao.getGiganPoint(gapanNo);
    }
    
    
    public void deleteViolationInfo(String gapanNo, String seq){
    	objJumyongDao.deleteViolationInfo(gapanNo,seq);
    }
    
    public void executeGiganUpdate(String gapanNo, String mul_fromdate, String mul_todate){
    	objJumyongDao.executeGiganUpdate(gapanNo,mul_fromdate,mul_todate);
    }
    
//  ��¹� ���� ���
    public Map get_DocInfo(String gapanNo)
    {
    	return objJumyongDao.get_DocInfo(gapanNo);
    }
    
    
    
}