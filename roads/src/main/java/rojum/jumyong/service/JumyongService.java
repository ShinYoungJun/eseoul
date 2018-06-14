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

import main.java.rojum.jumyong.model.GapanBaseBean;
import main.java.rojum.jumyong.dao.IJumyongDao;
import main.java.rojum.jumyong.model.ConfBean;
import main.java.rojum.jumyong.model.DisUseBean;
import main.java.rojum.jumyong.model.GapanHeadBean;
import main.java.rojum.jumyong.model.GapanInfoBean;
import main.java.rojum.jumyong.model.SaleBean;
import main.java.rojum.jumyong.model.SearchBean;

import main.java.rojum.jumyong.model.ProductBean;

public class JumyongService implements IJumyongService {
	
	private IJumyongDao objJumyongDao = null;
	
	
	
	

	public void setRojum_jumyongDao(IJumyongDao newJumyongDao) {
	    this.objJumyongDao = newJumyongDao;
	}

	
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
    public Map getProductListCount(SearchBean objectSearchBean)
    {
		return objJumyongDao.getProductListCount(objectSearchBean);
	}
	
    
    //��� ���� ����
    public List executeGapan_Head(String GAPAN_NO){
    	return objJumyongDao.executeGapan_Head(GAPAN_NO);
    }
    //********** BEGIN_KANG_20120416
    public List executeGapan_Info(String GAPAN_NO){
    	return objJumyongDao.executeGapan_Info(GAPAN_NO);
    }
  //********** END_KANG_20120416
    //����� ���� ����
    public List executeJumyongInfo(String ownerName,String ownerSsn,String guCd){
    	return objJumyongDao.executeJumyongInfo(ownerName,ownerSsn,guCd);
    }
    
	// ���� ���� ����
	public List executePickupInfo(String ownerName,String ownerSsn,String guCd){
		return objJumyongDao.executePickupInfo(ownerName,ownerSsn,guCd);
	}
	//********** BEGIN_KANG_20120416
	// ���� ���� ����
	public List executePickupInfo(String ownerName,String ownerSsn,String guCd, String CAR_NO){
		return objJumyongDao.executePickupInfo(ownerName,ownerSsn,guCd,CAR_NO);
	}
	//********** END_KANG_20120416
	// �赵 ���� ����
	public List executeGuideInfo(String ownerName,String ownerSsn,String guCd){
		return objJumyongDao.executeGuideInfo(ownerName,ownerSsn,guCd);
	}
	//********** BEGIN_KANG_20120416
	public List executeGuideInfo(String ownerName,String ownerSsn,String guCd,String CAR_NO){
		return objJumyongDao.executeGuideInfo(ownerName,ownerSsn,guCd,CAR_NO);
	}
	//********** END_KANG_20120416	
	// ��� / �Ű� ���� ����
	public List executeSaleInfo(String ownerName,String ownerSsn,String guCd){
		return objJumyongDao.executeSaleInfo(ownerName,ownerSsn,guCd);
	}
	
	// ��ߵ�� ����Ʈ
	public List executeAccuseInfo(String ownerName,String ownerSsn,String guCd){
		return objJumyongDao.executeAccuseInfo(ownerName,ownerSsn,guCd);
	}
	
	// �������� ����Ʈ
	public List executeChangeJobInfo(String ownerName,String ownerSsn,String guCd){
		return objJumyongDao.executeChangeJobInfo(ownerName,ownerSsn,guCd);
	}
    
    
    
	
	
	// ��� ����Ʈ
	public List executeOwnerList(String owner_name){
		return objJumyongDao.executeOwnerList(owner_name);
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
  	
	// ����� ��󿩺� �˱�
	public Map getTaxtationAt(String gapanNo){
		return objJumyongDao.getTaxtationAt(gapanNo);
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
    
//	���Ǳ⺻ ������Ʈ
    public void GapanBaseUpdate(GapanBaseBean bean){
    	objJumyongDao.GapanBaseUpdate(bean);   
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
    
    
    public ProductBean getBatchCalculationProductList(String gapan_no,String year){
    	return objJumyongDao.getBatchCalculationProductList(gapan_no,year);
    }
    
    public int cal_sum_exist(String gapan_no,String year){
    	return objJumyongDao.cal_sum_exist(gapan_no,year);
    }
    

    
    // �������� ����
    public void executeDeleteCalTax(String gapanNo,String seq){
    	objJumyongDao.executeDeleteCalTax(gapanNo,seq);
    }
    
    // ��ȯ ó��
    public void executeReturnProduct(String gapanNo,String returnDate){
    	objJumyongDao.executeReturnProduct(gapanNo,returnDate);
    }
    
  //��� ���� ����
    public String getExistOwner(String gapanNo){
    	return objJumyongDao.getExistOwner(gapanNo);
    }
    
    
    // tax_code ����Ʈ ��������
    public List ExecuteTaxCodeInfo(String TAX_SET, String TAX_CD){
    	return objJumyongDao.ExecuteTaxCodeInfo(TAX_SET,TAX_CD);
    }
    
	// ������� ���
	public void disuseCancel(String gapanNo) {
		objJumyongDao.disuseCancel(gapanNo);
	}
    
    

	//********** BEGIN_����_20120222
	public List gapanTaxationInfoSelect(String gapanNo,String seq,String year){
		return objJumyongDao.gapanTaxationInfoSelect(gapanNo,seq,year);
	}
	public List gapanCalculationSelect(String gapanNo,String seq,String year){
		return objJumyongDao.gapanCalculationSelect(gapanNo,seq,year);
	}
	public List gapanCalSumInfoSelect(String gapanNo,String seq,String year){
		return objJumyongDao.gapanCalSumInfoSelect(gapanNo,seq,year);
	}
	//********** END_����_20120222

	//********** BEGIN_����_20120227
	public void executebugwaCancel(String gapanNo,String seq){
		objJumyongDao.executebugwaCancel(gapanNo,seq);
	}
	//********** END_����_20120227

    
}