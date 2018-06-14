/*********************************************************************************************************
 				*최초작성일 : 2006.07.12
				*최초작성자 : jklee, jhlee
				*주요처리내용 : Q&A게시판 관련 db작업을 처리
				*수정일 :
				*수정자 :
				*수정내용 :
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
	
    //점용 조회
    public List retrieveBoardList(SearchBean objectSearchBean)
    {
    	return objJumyongDao.retrieveBoardList(objectSearchBean);
    }
	
    // 점용 조회 Excel
    public List retrieveBoardList_Excel(SearchBean objectSearchBean)
    {
    	return objJumyongDao.retrieveBoardList_Excel(objectSearchBean);
    }
    
//  점용 조회 개수
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
    
    
    //부과 여부 구하기 
    public boolean define_tax_yn(String adminNo, String seq){
    	
    	return objJumyongDao.define_tax_yn(adminNo,seq);
    }
	
    //점용 입력
	public ProductBean insertProduct(ProductBean objProductBean)
	{
		objJumyongDao.insertProduct(objProductBean);
		return null;
	}

	//산출물 개별 정보
	public ProductBean productInfo(String seq)
	{
		return objJumyongDao.productInfo(seq);
	}
	
	//산출물 리스트
	public List ProductList(int intCurPage, int intCount, String adminNo)
	{
		return objJumyongDao.ProductList(intCurPage,intCount,adminNo);
	}
	
	//	산출요율 구하기
	public String getProductRate(String add_sum)
	{	
		return objJumyongDao.getProductRate(add_sum) ;
	}	
    //  산출물 작년도 점용료 
    public int getSum_LastYear(String adminNum, String year)
    {
    	return objJumyongDao.getSum_LastYear(adminNum,year);
    }
    
    //산출수정
	public ProductBean updateProduct(ProductBean objProductBean)
	{		
		return objJumyongDao.updateProduct(objProductBean);
	}
	
	//현장조사입력
	public InspectBean insertInspect(InspectBean objInspectBean)
	{
		return objJumyongDao.insertInspect(objInspectBean);
	}
	
	//현장조사 리스트
	public List retrieveInspectList(int intCurPage, int intCount, String adminNo, String seq)
	{
		return objJumyongDao.retrieveInspectList(intCurPage,intCount,adminNo,seq);
	}
	//현장조사 리스트 카운트
	public int getInspectListCount(String adminNum)
	{
		return objJumyongDao.getInspectListCount(adminNum);
	}
	
	//현장조사 상세정보
	public List InspectInfo(String adminNo, String seq)
	{
		return objJumyongDao.InspectInfo(adminNo,seq);
	}
	
	//현장조사 수정   
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
	// 점용면적 구하기
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
  	
//  무단점용 총액 
    public int getTotalSum(String adminNo, String seq)
    {
    	return objJumyongDao.getTotalSum(adminNo, seq);
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
    
    public boolean disUseDelete(String adminNo){
    	return objJumyongDao.disUseDelete(adminNo);
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
//	  CAL_SUM_INFO 수정
    public int CalSumUpdate2(ProductBean objProductBean)
    {
    	return objJumyongDao.CalSumUpdate2(objProductBean);
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
    
    public int get_cal_sum_seq2(String adminNo, String seq, String year)
    {
    	return objJumyongDao.get_cal_sum_seq2(adminNo, seq, year);
    }

    
    //무단점용 getForm
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
	
	
	//무단점용 getForm
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
	
//	무단점용 getPrice
	public String getPrice(String adminNo)
	{
		List a1 = objJumyongDao.ProductList(1,10,adminNo);
		
		String returnStr = "";
		if(a1.size()>0)
		{
			returnStr = ((ProductBean)a1.get(0)).getYEAR()+"년: "+String.valueOf( ((ProductBean)a1.get(0)).getPRICE());
			for(int i=1; i<a1.size();i++ )			
			{	
				returnStr = returnStr + ", " + ((ProductBean)a1.get(i)).getYEAR()+"년: "+String.valueOf( ((ProductBean)a1.get(i)).getPRICE());
			}		
		}
		  
		return returnStr;
	}
	
	
//  무단 해당 연도 자료 있는지.
    public int get_calculationCount_mudan(String adminNum,String year)
    {
    	return objJumyongDao.get_calculationCount_mudan(adminNum,year);
    }
    
//  공시지가 구하기.
    public Map get_Price(String admin_no)
    {
    	return objJumyongDao.get_Price(admin_no);
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
    public float getMudanArea(String adminNo)
    {
    	return objJumyongDao.getMudanArea(adminNo);
    }
    
    
    // 이력정보 list
	public List getHistoryList(String adminNo,int currentPage ,int countPerPage)
	{
    	return objJumyongDao.getHistoryList(adminNo, currentPage , countPerPage);
    }
	
	// 이력정보 list count
	public int getHistoryListCount(String adminNo)
	{
    	return objJumyongDao.getHistoryListCount(adminNo);
    }
	
	// 이력정보 insert
	public ProductBean insertHistoryInfo(ProductBean objProductBean)
	{
		objJumyongDao.insertHistoryInfo(objProductBean);
		return objProductBean;
	}
	
	// 이력정보 상세
	public ProductBean getHistoryView(String ADMIN_NO, String SEQ)
	{
		return objJumyongDao.getHistoryView(ADMIN_NO, SEQ);
	}
	
	// 이력정보 insert
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
	
	
	
//	CAL_SUM_INFO 테이블 면적 추가 업데이트		 
    public int CalSumAddUpdate(ProductBean objProductBean)
    {    	
    	return objJumyongDao.CalSumAddUpdate(objProductBean);
    }  
    
//	SUM_ADJUST, AREA_AFTER 합계 SUM_SEQ별
    public int SumBysumSeq(String admin_no, String seq)
    {
    	return objJumyongDao.SumBysumSeq(admin_no, seq);
    }
    
    public String getCheck_yn(String adminNo) 
	{
		return objJumyongDao.getCheck_yn(adminNo);
	}
    // 인접지 합계 가져오기
    public String getWITH_SUM_PRICE(String adminNo) 
	{
		return objJumyongDao.getWITH_SUM_PRICE(adminNo);
	}
    
  //산출물 개별 정보
	public ProductBean productInfo_Admin(String seq , String adminNo)
	{
		return objJumyongDao.productInfo_Admin(seq , adminNo);
	}
	
	// 산출합계 삭제
	public void DeleteCalSumInfo(String adminNo, String Cal_Sum_Seq, String Year){
		objJumyongDao.DeleteCalSumInfo(adminNo, Cal_Sum_Seq, Year);
	}
	
	// 산출 삭제
	public void DeleteCalculatioInfo(String adminNo, String Seq, String Year){
		objJumyongDao.DeleteCalculatioInfo(adminNo, Seq, Year);
		
	}
	
	// 산출합계 삭제
	public void DeleteTaxationInfo(String adminNo, String Cal_Sum_Seq, String Year){
		objJumyongDao.DeleteTaxationInfo(adminNo, Cal_Sum_Seq, Year);
	}
	
	// 산출식들 구하기
	public List getFormAdjust(String adminNo, String calSumSeq){
		return objJumyongDao.getFormAdjust(adminNo, calSumSeq);
		
	}
	
	// 점용 조회 개수
	public int getCountCalculationInfo(String adminNo, String cal_sum_seq){
		return objJumyongDao.getCountCalculationInfo(adminNo, cal_sum_seq);
	}
	
	// 점용목적 구하기
	public String getPurposeCd(String adminNo){
		return objJumyongDao.getPurposeCd(adminNo);
	}
	
	// 삭제시 admin_base check_yn 변화
	public void updateAdminBaseCheckYN(String adminNo){
		objJumyongDao.updateAdminBaseCheckYN(adminNo);
	}
	
	// 점용구분 가져오기
	public String getUseType(String adminNo){
		return objJumyongDao.getUseType(adminNo);
	}
	
	// 감면율, 지분율 구하기 
	public Map getReduction(String adminNo){
		return objJumyongDao.getReduction(adminNo);
	}
	
	// 인접지 평균공시지가 위한 기본정보 구하기
	public Map getWithAddrInfo(String adminNo){
		return objJumyongDao.getWithAddrInfo(adminNo);
	}
	
	// 산출합계중 max year 가져오기
	public String getMaxYear(String adminNo,String cal_sum_seq){
		return objJumyongDao.getMaxYear(adminNo,cal_sum_seq);
	}
	
	// 산출 초기데이터 구하기
	public initCalBean getInitCalData(String adminNo){
		return objJumyongDao.getInitCalData(adminNo);
	}
	
	// 공시지가 주소리스트 불러오기
	public List getPriceList(String adminNo,String year){
		return objJumyongDao.getPriceList(adminNo, year);
	}

}