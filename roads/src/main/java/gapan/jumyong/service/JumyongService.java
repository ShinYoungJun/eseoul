/*********************************************************************************************************
 				*최초작성일 : 2006.07.12
				*최초작성자 : jklee, jhlee
				*주요처리내용 : Q&A게시판 관련 db작업을 처리
				*수정일 :
				*수정자 :
				*수정내용 :
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
	//가판 운영자, 동업자 정보 등록
    public	boolean	executeGapan_Head_Register(GapanHeadBean Bean){
    	return objJumyongDao.executeGapan_Head_Register(Bean);
    }
    //	GAPAN_INFO  테이블에 등록
    public	boolean	executeGapan_Info_Register(GapanInfoBean Bean){
    	return objJumyongDao.executeGapan_Info_Register(Bean);
    }
    
    public boolean executeGapan_Info_Register_Seoulonly(GapanInfoBean Bean){
    	return objJumyongDao.executeGapan_Info_Register_Seoulonly(Bean);
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
	
	
	// 해지등록 취소
	public void disuseCancel(String gapanNo) {
		objJumyongDao.disuseCancel(gapanNo);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	public void setGapan_jumyongDao(IJumyongDao newJumyongDao) {
	    this.objJumyongDao = newJumyongDao;
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
    //  산출물 작년도 점용료 
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
	
	//초기화 데이타 구하기
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
  	
//  무단점용 총액 
    public int getTotalSum(String adminNo)
    {
    	return objJumyongDao.getTotalSum(adminNo);
    }
  	
	//위치정보//////////////////////////////////////////////////////////////////////////////////////////
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
	
	
	
	//파일정보//////////////////////////////////////////////////////////////////////////////////////////
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
	
	
//  년도별 점용허가증 가능한지 카운트 
    public int getLicenseYnCount(String adminNum, String year)
    {
    	return objJumyongDao.getLicenseYnCount(adminNum,year);
    }
//  년도별 점용허가증 가능한지 카운트 
    public int getProductYnCount(String adminNum, String year)
    {
    	return objJumyongDao.getProductYnCount(adminNum,year);
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
//  감소분 년도 선택 리스트
    public List productSubList(String adminNo,String year)
    {
    	return objJumyongDao.productSubList(adminNo,year);
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
    
//	  ADMIN_BASE UPDATE		    
    public void Admin_baseUp_dateUpdateQuery(String update,String admin_no)
    {
    	objJumyongDao.Admin_baseUp_dateUpdateQuery(update,admin_no);
    }
    

//	  현장조사 삭제
    public void Delete_Inspect(int seq)
    {
    	objJumyongDao.Delete_Inspect(seq);
    }
    
//	  검토 협의 삭제
    public void Delete_Conf(int seq)
    {
    	objJumyongDao.Delete_Conf(seq);
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
    
    // 위반사항 리스트
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
    

    
    // 산출정보 삭제
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
    
//  출력물 정보 얻기
    public Map get_DocInfo(String gapanNo)
    {
    	return objJumyongDao.get_DocInfo(gapanNo);
    }
    
    
    
}