/*********************************************************************************************************
 				*최초작성일 : 2006.07.12
				*최초작성자 : jklee, jhlee
				*주요처리내용 : Q&A게시판 관련 db작업을 처리
				*수정일 :
				*수정자 :
				*수정내용 :
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
	//가판 운영자, 동업자 정보 등록
    public	boolean	executeGapan_Head_Register(GapanHeadBean Bean){
    	return objJumyongDao.executeGapan_Head_Register(Bean);
    }
    //	GAPAN_INFO  테이블에 등록
    public	boolean	executeGapan_Info_Register(GapanInfoBean Bean){
    	return objJumyongDao.executeGapan_Info_Register(Bean);
    }
    
    //점용 조회
    public List retrieveBoardList(SearchBean objectSearchBean)
    {
    	return objJumyongDao.retrieveBoardList(objectSearchBean);
    }
    
  //점용 조회 엑셀 변환
    public List retrieveBoardListExcel(SearchBean objectSearchBean)
    {
    	return objJumyongDao.retrieveBoardListExcel(objectSearchBean);
    }
	
//  점용 조회 개수
    public Map getProductListCount(SearchBean objectSearchBean)
    {
		return objJumyongDao.getProductListCount(objectSearchBean);
	}
	
    
    //운영자 정보 보기
    public List executeGapan_Head(String GAPAN_NO){
    	return objJumyongDao.executeGapan_Head(GAPAN_NO);
    }
    //********** BEGIN_KANG_20120416
    public List executeGapan_Info(String GAPAN_NO){
    	return objJumyongDao.executeGapan_Info(GAPAN_NO);
    }
  //********** END_KANG_20120416
    //점용료 정보 보기
    public List executeJumyongInfo(String ownerName,String ownerSsn,String guCd){
    	return objJumyongDao.executeJumyongInfo(ownerName,ownerSsn,guCd);
    }
    
	// 수거 정보 보기
	public List executePickupInfo(String ownerName,String ownerSsn,String guCd){
		return objJumyongDao.executePickupInfo(ownerName,ownerSsn,guCd);
	}
	//********** BEGIN_KANG_20120416
	// 수거 정보 보기
	public List executePickupInfo(String ownerName,String ownerSsn,String guCd, String CAR_NO){
		return objJumyongDao.executePickupInfo(ownerName,ownerSsn,guCd,CAR_NO);
	}
	//********** END_KANG_20120416
	// 계도 정보 보기
	public List executeGuideInfo(String ownerName,String ownerSsn,String guCd){
		return objJumyongDao.executeGuideInfo(ownerName,ownerSsn,guCd);
	}
	//********** BEGIN_KANG_20120416
	public List executeGuideInfo(String ownerName,String ownerSsn,String guCd,String CAR_NO){
		return objJumyongDao.executeGuideInfo(ownerName,ownerSsn,guCd,CAR_NO);
	}
	//********** END_KANG_20120416	
	// 폐기 / 매각 정보 보기
	public List executeSaleInfo(String ownerName,String ownerSsn,String guCd){
		return objJumyongDao.executeSaleInfo(ownerName,ownerSsn,guCd);
	}
	
	// 고발등록 리스트
	public List executeAccuseInfo(String ownerName,String ownerSsn,String guCd){
		return objJumyongDao.executeAccuseInfo(ownerName,ownerSsn,guCd);
	}
	
	// 전업지원 리스트
	public List executeChangeJobInfo(String ownerName,String ownerSsn,String guCd){
		return objJumyongDao.executeChangeJobInfo(ownerName,ownerSsn,guCd);
	}
    
    
    
	
	
	// 운영자 리스트
	public List executeOwnerList(String owner_name){
		return objJumyongDao.executeOwnerList(owner_name);
	}
	
	
    
    
    
    
  //세외수입부과정보 수정
    public boolean updateBugwa_Register(ProductBean objProductBean){
    	return objJumyongDao.updateBugwa_Register(objProductBean);
    }
    //세외수입부과정보 입력
    public boolean executeBugwa_Register(ProductBean objProductBean)
	{
    	return objJumyongDao.executeBugwa_Register(objProductBean);
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
  //폐기/매각 리스트
	public List ProductSaleList(String gapanNo){
		return objJumyongDao.ProductSaleList(gapanNo);
	}
	//폐기/매각 개수
	public int getProductSaleListCount(String gapanNo){
		return objJumyongDao.getProductSaleListCount(gapanNo);
	}
	// 폐기/매각 삭제
    public void executeDeleteProductSale(String gapanNo){
    	objJumyongDao.executeDeleteProductSale(gapanNo);
    	
    }
    
    
    //폐기매각 등록
    public boolean UpdateSale_Register(SaleBean objSaleBean){
    	return objJumyongDao.UpdateSale_Register(objSaleBean);
    }
    
    //폐기매각 수정
    public boolean ExecuteSale_Register(SaleBean objSaleBean){
    	return objJumyongDao.ExecuteSale_Register(objSaleBean);
    }
    
    
    
	
	
	
	
	
	//History_info 마지막 seq 추출
	public String getHistoryMaxSeq(ProductBean objProductBean)
    {
    	return objJumyongDao.getHistoryMaxSeq(objProductBean);
    }
	
	// 이력정보 insert
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
    //  산출물 작년도 점용료 
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
	
	//초기화 데이타 구하기
	public Map getInitCal(String gapanNo,String cal_mode)
    {
    	return objJumyongDao.getInitCal(gapanNo,cal_mode);
    }
  	
  	 
  	public Map getSection(String admin_no)
  	{
  		return objJumyongDao.getSection(admin_no);
  	}
  	
	// 점용료 대상여부 알기
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
  	
//  무단점용 총액 
    public int getTotalSum(String adminNo)
    {
    	return objJumyongDao.getTotalSum(adminNo);
    }
  	
	
	
//	해지정보
    public DisUseBean disUseInfo(String admin_no)
    {
    	return objJumyongDao.disUseInfo(admin_no);
    }
    public boolean disUseUpdate(DisUseBean disUseBean)
    {
    	return objJumyongDao.disUseUpdate(disUseBean);
    }

//  CALCULATION_INFO 시퀀스 증가값
    public int getCalculationSequence()
    {
    	return objJumyongDao.getCalculationSequence();
    }
///////////////////////////////////////////////산출물 부과
//  산출물 입력
      public int Cal_Sum_InfoInsert(ProductBean objProductBean)
      {
    	  return objJumyongDao.Cal_Sum_InfoInsert(objProductBean);
      }
//  CAL_SUM_INFO 시퀀스 증가값
    public int getCal_Sum_Seq()
    {
    	return objJumyongDao.getCal_Sum_Seq();
    }
//	  CAL_SUM_INFO 수정
    public int CalSumUpdate(ProductBean objProductBean)
    {
    	return objJumyongDao.CalSumUpdate(objProductBean);
    }
//	  CAL_SUM_INFO
    public ProductBean CalSumInfoInfo(int seq)
    {
    	return objJumyongDao.CalSumInfoInfo(seq);
    }
//	년도별 first_seq별 seq
    public int getCalSeqbyFirstSeq(String year,String first_seq)
    {
    	return objJumyongDao.getCalSeqbyFirstSeq(year,first_seq);
    }
//	  FORM_ADJUST CAL_SUM_SEQ로 가져오기
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
    
    
    
    
    
    //  무단 점용 cal_sum_seq 
    public int get_cal_sum_seq(String year)
    {
    	return objJumyongDao.get_cal_sum_seq(year);
    }
    
//	무단점용 getPrice
	public String getPrice(String adminNo)
	{
		List a1 = objJumyongDao.ProductList(1,10,adminNo,"2");
		
		String returnStr = "";
		
		returnStr = ((ProductBean)a1.get(0)).getYEAR()+"년: "+String.valueOf( ((ProductBean)a1.get(0)).getPRICE());
		
		System.out.println("price"+returnStr);

		for(int i=1; i<a1.size();i++ )			
		{
			
			returnStr = returnStr + ", " + ((ProductBean)a1.get(i)).getYEAR()+"년: "+String.valueOf( ((ProductBean)a1.get(i)).getPRICE());
			
			
		}
		
		System.out.println("price"+returnStr);
		
		return returnStr;
	}
	
	
//  무단 해당 연도 자료 있는지.
    public int get_calculationCount_mudan(String adminNum,String year)
    {
    	return objJumyongDao.get_calculationCount_mudan(adminNum,year);
    }
    
//  공시지가 구하기.
    public Map get_Price(String gapanNo)
    {
    	return objJumyongDao.get_Price(gapanNo);
    }
    
//	가판기본 업데이트
    public void GapanBaseUpdate(GapanBaseBean bean){
    	objJumyongDao.GapanBaseUpdate(bean);   
    }
    
    
//  일반 점용 일수 가져오기
    public int getTotalPeriod(String admin_no)
    {
    	return objJumyongDao.getTotalPeriod(admin_no);
    }
    
//  무단 점용 넓이
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
    

    
    // 산출정보 삭제
    public void executeDeleteCalTax(String gapanNo,String seq){
    	objJumyongDao.executeDeleteCalTax(gapanNo,seq);
    }
    
    // 반환 처리
    public void executeReturnProduct(String gapanNo,String returnDate){
    	objJumyongDao.executeReturnProduct(gapanNo,returnDate);
    }
    
  //운영자 존재 여부
    public String getExistOwner(String gapanNo){
    	return objJumyongDao.getExistOwner(gapanNo);
    }
    
    
    // tax_code 리스트 가져오기
    public List ExecuteTaxCodeInfo(String TAX_SET, String TAX_CD){
    	return objJumyongDao.ExecuteTaxCodeInfo(TAX_SET,TAX_CD);
    }
    
	// 해지등록 취소
	public void disuseCancel(String gapanNo) {
		objJumyongDao.disuseCancel(gapanNo);
	}
    
    

	//********** BEGIN_현진_20120222
	public List gapanTaxationInfoSelect(String gapanNo,String seq,String year){
		return objJumyongDao.gapanTaxationInfoSelect(gapanNo,seq,year);
	}
	public List gapanCalculationSelect(String gapanNo,String seq,String year){
		return objJumyongDao.gapanCalculationSelect(gapanNo,seq,year);
	}
	public List gapanCalSumInfoSelect(String gapanNo,String seq,String year){
		return objJumyongDao.gapanCalSumInfoSelect(gapanNo,seq,year);
	}
	//********** END_현진_20120222

	//********** BEGIN_현진_20120227
	public void executebugwaCancel(String gapanNo,String seq){
		objJumyongDao.executebugwaCancel(gapanNo,seq);
	}
	//********** END_현진_20120227

    
}